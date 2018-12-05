package com.spring.picturespage.model;

public class Picture {
	private String heading;
	private String url;
	private String tags;

	public Picture() {
	}

	public Picture(String heading, String url, String tags) {
		this.heading = heading;
		this.url = url;
		this.tags = tags;
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Picture{");
		sb.append("heading='").append(heading).append('\'');
		sb.append(", url='").append(url).append('\'');
		sb.append(", tags='").append(tags).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
