## Upper Bounded Wildcards: 
- For example, you want to write a method that works on `List<Integer>` , `List<Double>` etc and It depends your requests
- You can use the expression 
```
  public static void main(String[] args)
    {
 
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
 
        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));
 
        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
 
        // printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list2));
    }
 
    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
 
        return sum;
    }
```

## Lower Bounded Wildcards:
- When you want to use a class and its superclasses ,you can use the expression
```
   public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
 
        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);
 
        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);
 
        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }
 
    public static void printOnlyIntegerClassorSuperClass(
        List<? super Integer> list)
    {
        System.out.println(list);
    }
```    

## Unbounded Wildcards:
- When the code is using methods in the generic class that doesn’t depend on the type parameter
```
   public static void main(String[] args)
    {
 
        // Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3);
 
        // Double list
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
 
        printlist(list1);
 
        printlist(list2);
    }
 
    private static void printlist(List<?> list)
    {
 
        System.out.println(list);
    }
```    
