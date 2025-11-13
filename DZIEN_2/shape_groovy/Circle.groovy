class Circle extends Shape {
    double radius
    Circle(String name, double radius) {
        super(name)
        this.radius = radius
    }

    @Override
    double area() {
    return Math.PI * radius *radius
    }
}
