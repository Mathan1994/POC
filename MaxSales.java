public class MaxSales
{
  
private int yr2010,yr2011,yr2012,yr2013;
  private String ProductName;

public void setYr2010(int yr2010) {
this.yr2010 = yr2010;
}

public void setYr2011(int yr2011) {
this.yr2011 = yr2011;
}

public void setYr2012(int yr2012) {
this.yr2012 = yr2012;
}

public void setYr2013(int yr2013) {
this.yr2013 = yr2013;
}
  
public void setProductName(String ProductName) {
this.ProductName = ProductName;
}

public  int maxval() {

    int max = yr2010;

    if (yr2011 > max)
         max = yr2011;
    if (yr2012> max)
        max = yr2012;
    if (yr2013 > max)
         max = yr2013;

     return max;
}
}
