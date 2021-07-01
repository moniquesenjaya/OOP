public class SalesDriver {
    SalesPerson[] salesPeople;

    public String highest()
    {
        double highest = 0;
        int idx = -1;
        for (int i = 0; i < 100; i++)
        {
            if (salesPeople[i].calcTotalSales() > highest)
            {
                highest = salesPeople[i].calcTotalSales();
                idx = i;
            }
        }
        return salesPeople[idx].getId();
    }

    public void addSales(Sales sales, String id)
    {
        int i = 0;
        while (!salesPeople[i].getId().equals(id))
        {
            i++;
        }
        salesPeople[i].setSalesHistory(sales);
    }
}
