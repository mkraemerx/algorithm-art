package de.postlab.util;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

/**
 * Created by michel on 18.05.15.
 */
public class ArrayPrinter {
    private DecimalFormat fmt;

    public ArrayPrinter() {
        fmt = new DecimalFormat("000");
    }

    public ArrayPrinter(String format) {
        fmt = new DecimalFormat(format);
    }

    public String printArray(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i=0; i<arr.length; ++i) {
            sb.append(fmt.format(arr[i])).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
