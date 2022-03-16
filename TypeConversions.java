public class TypeConversions {
  public static void main(String[] args) {
    // Type Conversion
    // Implicit type conversion - automatically done by compiler
    int a = 1;
    double b = a;

    // Widening conversions are performed automatically for Implicit type conversion
    // -->Mixed integer sizes - compiler will choose the largest integer in equation
    // -->Mixed float sizes - compiler will choose the largest size (double)
    // -->Mixed integer and float sizes - compiler will choose the largest floating point in equation

    // Explicit type conversion - explicitly done with cast operator
    double c = 1.0;
    int d = (int) c; // (int) is the cast operator

    // Can perform widening or narrowing conversions or Explicit type conversion
    // -->Narrowing conversions - Significant bits may be lost
    // -->Floating point to integer - Fractal portion is discarded
    // -->Integer to floating point - Precision may be lost
  }
}
