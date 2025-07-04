package com.tnsif.multilevelinheritance;

public class city extends state {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private String cityName;
		private float area;
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public float getArea() {
			return area;
		}
		public void setArea(float area) {
			this.area = area;
		}
		@Override
		public String toString() {
			return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
					+ ", getLangyage()=" + getLangyage() + ", getCountryname()=" + getCountryname() + ", getCapital()="
					+ getCapital() + "]";
		}
		
		
		
		
	}