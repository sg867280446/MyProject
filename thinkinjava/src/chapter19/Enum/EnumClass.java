package chapter19.Enum;


enum Shrubbery {GROUND,CRAWLING,HANGING}

public class EnumClass {
    public static void main(String args[]){
    	for(Shrubbery s : Shrubbery.values()){
    		//ֵ������λ��
    		System.out.println(s + " ordinal: " + s.ordinal());
    		/**
    		 * compareTo��������ֵ
    		 * ����0:��ʾǰһ��ֵ�Ⱥ����
    		 * С��0:��ʾǰһ��ֵ�Ⱥ���С
    		 * ����0:��ʶ����ֵ���
    		 */
    		System.out.println(s.compareTo(Shrubbery.CRAWLING)+" ");
    		/**
    		 * ע�����equals��==�������ж�ֵ�Ƿ����
    		 */
    		System.out.println(s.equals(Shrubbery.CRAWLING)+" ");
    		System.out.println(s==Shrubbery.CRAWLING);
    		
    		//�õ�ȫ����
    		System.out.println(s.getDeclaringClass());
    		
    		/**
    		 * �������������õ���Ӧ��ֵ
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
