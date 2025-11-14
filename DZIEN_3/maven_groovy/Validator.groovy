class Validator {
    static rules = [:]

    static addRule(Class clazz, Closure rule){
        rules[clazz] = rule
    }

    static validate(obj){
        def rule = rules[obj.class]
        rule ? rule(obj):true
    }

}
