/*Using an inheritance hierarchy, design a Java program to model items at 
 * a library (books, journal articles, videos and CDs.) Have an abstract
 *  superclass called Item and include common information that the library
 *   must have for every item (such as unique identification
 *    number, title, and number of copies). No actual objects of type 
 *    Item will be created - each actual item will be an object of a (non-abstract)
 *     subclass. Place item-type-specific behavior in subclasses 
 *     (such as a video's year of release, a CD's musical genre, or a book's author).
 */

package com.abstractexample.java;

public class CD extends MediaItem {
	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}

}
