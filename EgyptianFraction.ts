/**
 * Compute Egyptian Fraction
 */
class Compute {
    printEgyptian(numerator : number, denominator : number) {
        if (numerator == 0 || denominator == 0)
            return;

        if (denominator % numerator == 0) {
            console.log("1/" + denominator / numerator);
            return;
        }

        if (numerator % denominator == 0) {
            console.log(numerator / denominator);
        }

        if (numerator > denominator) {
            console.log(numerator / denominator + " + ");
            this.printEgyptian(numerator % denominator, denominator);
            return;
        }

        let value: number = denominator / numerator + 1;
        console.log("1/" + value + " + ");
        this.printEgyptian(numerator * value - denominator, denominator * value);
    }
}


let numerator: number = 6;
let denominator: number = 14;
let compute = new Compute();
compute.printEgyptian(numerator, denominator);
