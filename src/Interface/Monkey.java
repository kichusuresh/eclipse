package Interface;
public class Monkey {
			public static void main(String[] args) 
				{
					human s=new human();
					s.sleep();
					s.bite();
					s.cat();
					s.jump();
					s.speak();
				}
			}
			class A
			{
				public void jump()
				{
					System.out.println("jump");
				}
				public void bite()
				{
					System.out.println("bite");
				}
			}
			class human extends A implements basicaniaml
			{
				public void speak()
				{
					System.out.println("speak");
				}
				@Override
				public void cat() 
				{
					System.out.println("cat");
				}
				@Override
				public void sleep() 
				{
					System.out.println("sleep");
				}
			}
			interface basicaniaml
			{
				public void cat();
				public void sleep();
			}

	


