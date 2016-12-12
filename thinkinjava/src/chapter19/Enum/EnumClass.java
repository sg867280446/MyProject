package chapter19.Enum;


enum Shrubbery {GROUND,CRAWLING,HANGING}

public class EnumClass {
    public static void main(String args[]){
    	for(Shrubbery s : Shrubbery.values()){
    		//值的所在位置
    		System.out.println(s + " ordinal: " + s.ordinal());
    		/**
    		 * compareTo方法返回值
    		 * 大于0:表示前一个值比后面大
    		 * 小于0:表示前一个值比后面小
    		 * 等于0:标识两个值相等
    		 */
    		System.out.println(s.compareTo(Shrubbery.CRAWLING)+" ");
    		/**
    		 * 注意这边equals与==都可以判断值是否相等
    		 */
    		System.out.println(s.equals(Shrubbery.CRAWLING)+" ");
    		System.out.println(s==Shrubbery.CRAWLING);
    		
    		//拿到全类名
    		System.out.println(s.getDeclaringClass());
    		
    		/**
    		 * 下面两个都是拿到对应的值
    		 */
    		System.out.println(s.name());
    		System.out.println(s);
    	}
    	System.out.println("---------------------");
    	for(String s : "HANGING CRAWLING GROUND".split(" ")){   		
    		Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
    		System.out.println(shrub);
    	}
    }
}
