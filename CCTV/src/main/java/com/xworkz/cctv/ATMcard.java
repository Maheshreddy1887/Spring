package com.xworkz.cctv;

public class ATMcard {
	public class ATMCard {

		private long cardNo;
		private int cvv;
		private CardType cardType;
		private String color;
		private java.util.Date expriyDate;

		public ATMCard() {
			System.out.println(this.getClass().getSimpleName() + " Bean create ");
		}

		@Override
		public String toString() {
			return "ATMCard [cardNo=" + cardNo + ", cvv=" + cvv + ", cardType=" + cardType + ", color=" + color
					+ ", expriyDate=" + expriyDate + "]";
		}

		public long getCardNo() {
			return cardNo;
		}

		public void setCardNo(long cardNo) {
			this.cardNo = cardNo;
		}

		public int getCvv() {
			return cvv;
		}

		public void setCvv(int cvv) {
			this.cvv = cvv;
		}

		public CardType getCardType() {
			return cardType;
		}

		public void setCardType(CardType cardType) {
			this.cardType = cardType;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public java.util.Date getExpriyDate() {
			return expriyDate;
		}

		public void setExpriyDate(java.util.Date expriyDate) {
			this.expriyDate = expriyDate;
		}

	}

}
