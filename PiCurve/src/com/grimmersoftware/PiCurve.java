package com.grimmersoftware;
/*
 * This calculates Pi by adding up the area of slender strips under the top right quarter of a circle.
 */
public class PiCurve {
	public static void main(String[] args) {
		long size=2147483647L; //2,147,483,647 is about as big as I can go
		long sizeSquared=size*size; //
		long maxY=size; //
		double total=0D;
		double strip=0D;
	    long start = System.currentTimeMillis();
		for(long x=1L; x<=size;x++){ //
			for(long y=maxY;maxY>0L;y--){ //
				if((y*y)+(x*x)<=sizeSquared){
					maxY=y;
					strip=(y+.5D);
					break;
				}
			}
			total=total+strip;
		}
	    long stop = System.currentTimeMillis();
		System.out.println((total*4D)/sizeSquared + " is what I got.");
		System.out.println(Math.PI + " is true...");
		System.out.println("Seconds to run: " + ((stop-start)/1000f));
	}
}
