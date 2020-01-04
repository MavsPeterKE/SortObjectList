package model;

public class Order {
    public String orderRef;
    public static class OrderStructure{
        private String orderNo;
        private double amount;
        public OrderStructure() {
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}
