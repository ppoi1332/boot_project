package boot_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PositionDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public PositionDAO () {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	
	public boolean insertPosition(PositionVO pv) {
		boolean ret = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into \"Position\" values (\"SEQ_POSITION\".nextval,?)";	
		try {
			con = jdbcTemplate.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pv.p_name);
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
