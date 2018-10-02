package lec11.ex03;

import java.util.Date;

public class AllInclusiveTicket implements PlaneTicket, BusTicket, RailTicket {

	private PlaneTicket _plane;
	private BusTicket _bus;
	private RailTicket _rail;
	
	public AllInclusiveTicket(PlaneTicket plane, BusTicket bus, RailTicket rail) {
		_plane = plane;
		_bus = bus;
		_rail = rail;
	}

	@Override
	public int getTrackNumber() {
			return _rail.getTrackNumber();
	}

	@Override
	public int getCarNumber() {
		return _rail.getCarNumber();
	}

	@Override
	public int getSeatNumber() {
		return _rail.getSeatNumber();
	}

	@Override
	public String getDestination() {
		return _rail.getDestination();
	}

	@Override
	public Date getStartDate() {
		return _bus.getStartDate();
	}

	@Override
	public Date getEndDate() {
		return _bus.getEndDate();
	}

	@Override
	public String getPassengerName() {
		return _bus.getPassengerName();
	}

	@Override
	public String getFlightNumber() {
		return _plane.getFlightNumber();
	}

	@Override
	public String getTerminalName() {
		return _plane.getTerminalName();
	}

	@Override
	public int getGateNumber() {
		return _plane.getGateNumber();
	}
}
