package app;

import java.util.ArrayList;
import java.util.List;

public class Compass {
	
	private int[] xaxis;
	private int[] yaxis;
	private List<Integer> xposition;
	private List<Integer> yposition;
	
	List<String> readings = new ArrayList<String>();

	
	

	public int[] getXaxis() {
		return xaxis;
	}



	public void setXaxis(int[] xaxis) {
		this.xaxis = xaxis;
	}



	public int[] getYaxis() {
		return yaxis;
	}



	public void setYaxis(int[] yaxis) {
		this.yaxis = yaxis;
	}



	public List<Integer> getXposition() {
		return xposition;
	}



	public void setXposition(List<Integer> xposition) {
		this.xposition = xposition;
	}



	public List<Integer> getYposition() {
		return yposition;
	}



	public void setYposition(List<Integer> yposition) {
		this.yposition = yposition;
	}
	
	public int isEastOrWest(String s) {
		
		if (s.toLowerCase().equals("west")) {
			return -1;
		} else if (s.toLowerCase().equals("east")) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public int isNorthOrSouth(String s) {
		
		if (s.toLowerCase().equals("south")) {
			return -1;
		} else if (s.toLowerCase().equals("north")) {
			return 1;
		} else {
			return 0;
		}
		
	}



	public double read(int j, int i , String s) {
		
		readings.add(s);
		if (s.equals("  ")) {
			return Math.sqrt(Math.pow(xaxis[j], 2) + Math.pow(yaxis[j], 2));
		}
		
		xposition.add(xposition.get(i) + isEastOrWest(s));
		yposition.add(yposition.get(i) + isNorthOrSouth(s));
		
		if(xaxis[j] == xposition.get(i+1) && yaxis[j] == yposition.get(i+1)) {
			return -2;
		}
		
		
		return Math.sqrt(Math.pow(xaxis[j] - xposition.get(i+1), 2) + Math.pow((yaxis[j] - yposition.get(i+1)), 2));
		
	}
	
	public double mainread(int j, int i , String s) {
		return read(j, i , s);
	}



}
