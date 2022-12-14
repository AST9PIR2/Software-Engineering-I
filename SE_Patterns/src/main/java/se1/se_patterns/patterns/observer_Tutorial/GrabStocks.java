package se1.se_patterns.patterns.observer_Tutorial;

//https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4

public class GrabStocks {

        public static void main(String[] args) {
            var stockGrabber = new StockGrabber();
            var observer1 = new StockObserver(stockGrabber);

            stockGrabber.setIbmPrice(197.00);
            stockGrabber.setAaplPrice(677.60);
            stockGrabber.setGoogPrice(676.40);

            stockGrabber.unregister(observer1);

        }
}
