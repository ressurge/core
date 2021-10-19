package com.rs.lib.game;

public class WorldInfo {
	private int number;
	private String ipAddress;
	private int port;
	private String countryName;
	private String activity;
	private int country;
	private boolean lootShare;
	private boolean members;
	
	public WorldInfo(int number, String ipAddress, int port, String activity, int country, boolean lootShare, boolean members) {
		this.number = number;
		this.ipAddress = ipAddress;
		this.port = port;
		this.activity = activity;
		this.country = country;
		this.countryName = getCountryFromId(country);
		this.lootShare = lootShare;
		this.members = members;
	}
	
	public static String getCountryFromId(int country) {
		return switch(country) {
			case 1 -> "USA";
			default -> "Murica";
		};
	}
	
	public String getActivity() {
		return activity;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public int getCountryId() {
		return country;
	}
	
	public boolean isLootShare() {
		return lootShare;
	}
	
	public boolean isMembers() {
		return members;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	@Override
	public String toString() {
		return "[" + number + ", " + ipAddress + ", " + port + ", " + activity + "]";
	}

	public int getPort() {
		return port;
	}
}
