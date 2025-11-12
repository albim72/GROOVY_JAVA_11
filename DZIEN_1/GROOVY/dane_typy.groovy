import java.math.RoundingMode

int a = 10
def b = 3.564
boolean ok = true

BigDecimal price = 19.99

//BigDecimal vat = (price * 0.23G).setScale(2, RoundingMode.HALF_UP)
BigDecimal vat = (price * 0.23G).round(2)

def user = null

def displayName = user ?: "Guest"

println("a+b = ${a+b}, ok=$ok, VAT = $vat, user = $displayName")

assert vat == 4.60
assert displayName == "Guest"
