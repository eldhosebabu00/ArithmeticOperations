package arithmetic;

public class ArithmeticBase 
{

    public enum Operation {
        PLUS {
            public double apply(double x, double y) { 
                double result = x + y;
                System.out.println(x + " + " + y + " = " + result);
                return result;
            }
        },
        MINUS {
            public double apply(double x, double y) { 
                double result = x - y;
                System.out.println(x + " - " + y + " = " + result);
                return result;
            }
        },
        TIMES {
            public double apply(double x, double y) { 
                double result = x * y;
                System.out.println(x + " * " + y + " = " + result);
                return result;
            }
        },
        DIVIDE {
            public double apply(double x, double y) { 
                if (y == 0) throw new ArithmeticException("Division by zero");
                double result = x / y;
                System.out.println(x + " / " + y + " = " + result);
                return result;
            }
        };
        
        public abstract double apply(double x, double y);
    }
    
    public double calculate(double x, double y, Operation operation) 
    {
        return operation.apply(x, y);
    }

    public void performAllOperations(double x, double y) {
        System.out.println("ALL ARITHMETIC OPERATIONS ");
        System.out.println("Input numbers: " + x + " and " + y);
        System.out.println("----------------------------------");
        
        for (Operation op : Operation.values()) {
            try {
                calculate(x, y, op);
            } catch (ArithmeticException e) {
                System.out.println(x + " " + op + " " + y + " = Error: " + e.getMessage());
            }
        }
    }
}