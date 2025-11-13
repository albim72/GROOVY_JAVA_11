def shapes = [
        new Circle("Circle A",6.33),
        new Rectangle("Rectangle R",9.3,5.3)
]

shapes.each {println(it.info())}
