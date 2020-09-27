package ambodenis.main.dao;

import java.util.List;

import ambodenis.main.entity.Reservation;

public interface ReservationDAO {

	
	public void saveReservation(Reservation reservation);
	
	public List<Reservation> getAllReservations();
	
	public long getUnreadReservationCount();
	
	public Reservation getReservation(int id);
	
}
