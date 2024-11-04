package weather_app_team;

import java.sql.Connection;
public class Main {
	public static void main(String[] args) {
		// Create aninstance of WeatherAppUserInsertion.
		WeatherAppUserInsertion jdbc = new WeatherAppUserInsertion();
		Connection conn = jdbc.createConnection();
		// Call the addUser() method to insert new user.
		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		// call the closeConnection() method 
		jdbc.closeConnection(conn);
	}
}