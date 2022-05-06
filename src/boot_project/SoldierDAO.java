package boot_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SoldierDAO {
	
private JdbcTemplate jdbcTemplate;
	
	public SoldierDAO () {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	
	public boolean insertPosition(SoldierVO sv) {
		boolean ret = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into \"SOLDIER\" values  (\"SEQ_SOLDIER\".nextval,?,?,?,?,?)";	
		ResultSet rs = null;
		try {
			con = jdbcTemplate.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sv.getName());
			pstmt.setLong(2, sv.getPosition_Code());
			pstmt.setObject(3, sv.getInDay());
			pstmt.setObject(4, sv.getOutDay());
			pstmt.setLong(5, sv.getYear());
			int res = pstmt.executeUpdate();
			System.out.println("입력 완료");
			ret = true;			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

}
