import com.sun.javafx.scene.layout.region.Margins.Converter
import sun.misc.InnocuousThread

object Question01 {
  def main(args: Array[String]): Unit = {
    //Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?
    def Area(r: Double)= println(math.Pi * r * r)
    Area(5)
  }
}

object Question02 {
  def main(args: Array[String]): Unit = {
def Converter(C:Double)= println(C * 1.8000 + 32.00)
    Converter(32.0)
  }
}


object Question03 {
  def main(args: Array[String]): Unit = {
  //The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?
def volume(r:Double)=println(math.Pi*r*r*r*4/3)
volume(5)
  }
}

object Question04 {
  def main(args: Array[String]): Unit = {
   // Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40%
    //  discount. Shipping costs Rs. 3 for the first 50 copies and 75 cents for each
   // additional copy. What is the total wholesale cost for 60 copies?
    var coverPrice=24.95
    def ShippingCost(copy:Double)= if(copy<=50) copy*3 else 3*50+(copy-50)*0.75
    def Discount1(price:Double)= 0.4*price
    def TotPrice(a:Double)=println(coverPrice*a+ShippingCost(a)-Discount1(coverPrice*a))

  TotPrice(60)
  }

}

object Question05 {
  def main(args: Array[String]): Unit = {
    //I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 min per km)
    //and 2 km at easy pace again to reach home. What is the total running time?
    var time=0;
    def easypace(x:Int)={
     x*8
    }
    def Tempo(y:Int)={
      y*7
    }
    time=easypace(2)+Tempo(3)+easypace(2)

    println(time)
  }
  }

