package com.spring.picturespage.model;

public class Picture {
	private String heading;
	private String url;

	public Picture() {
	}

	public Picture(String heading, String url) {
		this.heading = heading;
		this.url = url;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Picture{");
		sb.append("heading='").append(heading).append('\'');
		sb.append(", url='").append(url).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
