package item17;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Complex {
    private final double realPoint;
    private final double imaginaryPoint;


    public Complex plus(Complex addend) {
        return new Complex(
                realPoint + addend.getRealPoint(),
                imaginaryPoint + addend.getImaginaryPoint()
        );
    }

    public Complex minus(Complex target) {
        return  new Complex(
                realPoint - target.getRealPoint(),
                imaginaryPoint - target.getImaginaryPoint()
        );
    }

    public Complex times(Complex c) {
        return new Complex(
                realPoint * c.getRealPoint() - imaginaryPoint * c.getImaginaryPoint(),
                realPoint * c.getImaginaryPoint() + imaginaryPoint * c.getRealPoint()
        );
    }

    static Complex valueOf(double realPoint, double imaginaryPoint) {
        return new Complex(realPoint, imaginaryPoint);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Complex)) return false;

        val complex = (Complex) o;

        return Double.compare(complex.getRealPoint(), realPoint) == 0
                && Double.compare(complex.getImaginaryPoint(), imaginaryPoint) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(realPoint) + Double.hashCode(imaginaryPoint);
    }
}
