package com.example.chapter2;

/**
 * Created by apovarkov on 03.11.15.
 */
public class PoolCalculator implements Volume {

    private double width;
    private double length;
    private double minDepth;
    private double maxDepth;

    public PoolCalculator() {
    }

    public PoolCalculator(double width, double length, double minDepth, double maxDepth) {
        this.width = width;
        this.length = length;
        this.minDepth = minDepth;
        this.maxDepth = maxDepth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(double minDepth) {
        this.minDepth = minDepth;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    @Override
    public double calculateVolume() {
        double avgDepth = (minDepth + maxDepth) / 2;
        return width * length * avgDepth;
    }

    /**
     * Returns the number of gallons for a given Volume
     * @param vol
     */
    public double calculateGallons(Volume vol){
        return 7.48 * vol.calculateVolume();
    }

}
