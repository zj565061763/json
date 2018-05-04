package com.fanwe.json;

public class TestModel
{
    private int valueInt;
    private long valueLong;

    private float valueFloat;
    private double valueDouble;


    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("\r\n")
                .append("valueInt").append("=").append(valueInt).append("\r\n")
                .append("valueLong").append("=").append(valueLong).append("\r\n")
                .append("valueFloat").append("=").append(valueFloat).append("\r\n")
                .append("valueDouble").append("=").append(valueDouble).append("\r\n");
        return super.toString() + " " + sb.toString();
    }
}
