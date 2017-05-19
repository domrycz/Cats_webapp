package pl.domrycz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CatDAO {

    @Autowired
    private DataSource dataSource;

    List<Cat> catsList = new ArrayList<Cat>();

    public void addCat(Cat cat) {
        String sql = "INSERT INTO cat VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement prepStat = conn.prepareStatement(sql);
            prepStat.setInt(1, cat.getId());
            prepStat.setString(2, cat.getName());
            java.util.Date d = cat.getDate(); // converting birth date from java.util.Date to java.sql.Date
            prepStat.setDate(3, new java.sql.Date(d.getTime()));
            prepStat.setFloat(4, cat.getWeight());
            prepStat.setString(5, cat.getKeeper());

            prepStat.executeUpdate();
            prepStat.close();

        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqle) {}
            }
        }
    }

    public List<Cat> getCatsList() {
        return catsList;
    }


    public Cat getCatbyId(Integer id) {
        String sql = "SELECT * FROM cat WHERE id = ?";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement prepStat = conn.prepareStatement(sql);
            prepStat.setInt(1, id);
            Cat cat = null;
            ResultSet rs = prepStat.executeQuery();
            if(rs.next()) {
                cat = new Cat();
                cat.setId(rs.getInt("id"));
                cat.setName(rs.getString("name"));
                cat.setDate(rs.getDate("date"));
                cat.setWeight(rs.getFloat("weight"));
                cat.setKeeper(rs.getString("keeper"));
            }
            rs.close();
            prepStat.close();
            return cat;
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqle) {}
            }
        }
    }

}
