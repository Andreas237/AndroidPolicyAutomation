// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			Lifecycle

public static final class Lifecycle$State extends Enum
{

	public static Lifecycle$State valueOf(String s)
	{
		return (Lifecycle$State)Enum.valueOf(android/arch/lifecycle/Lifecycle$State, s);
	//    0    0:ldc1            #2   <Class Lifecycle$State>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Lifecycle$State>
	//    4    9:areturn         
	}

	public static Lifecycle$State[] values()
	{
		return (Lifecycle$State[])((Lifecycle$State []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field Lifecycle$State[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Landroid.arch.lifecycle.Lifecycle$State_3B_.clone()>
	//    2    6:checkcast       #50  <Class Lifecycle$State[]>
	//    3    9:areturn         
	}

	public boolean isAtLeast(Lifecycle$State lifecycle$state)
	{
		return compareTo(((Enum) (lifecycle$state))) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method int compareTo(Enum)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static final Lifecycle$State $VALUES[];
	public static final Lifecycle$State CREATED;
	public static final Lifecycle$State DESTROYED;
	public static final Lifecycle$State INITIALIZED;
	public static final Lifecycle$State RESUMED;
	public static final Lifecycle$State STARTED;

	static 
	{
		DESTROYED = new Lifecycle$State("DESTROYED", 0);
	//    0    0:new             #2   <Class Lifecycle$State>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "DESTROYED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void Lifecycle$State(String, int)>
	//    5   10:putstatic       #25  <Field Lifecycle$State DESTROYED>
		INITIALIZED = new Lifecycle$State("INITIALIZED", 1);
	//    6   13:new             #2   <Class Lifecycle$State>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "INITIALIZED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void Lifecycle$State(String, int)>
	//   11   23:putstatic       #28  <Field Lifecycle$State INITIALIZED>
		CREATED = new Lifecycle$State("CREATED", 2);
	//   12   26:new             #2   <Class Lifecycle$State>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "CREATED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void Lifecycle$State(String, int)>
	//   17   36:putstatic       #31  <Field Lifecycle$State CREATED>
		STARTED = new Lifecycle$State("STARTED", 3);
	//   18   39:new             #2   <Class Lifecycle$State>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "STARTED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void Lifecycle$State(String, int)>
	//   23   49:putstatic       #34  <Field Lifecycle$State STARTED>
		RESUMED = new Lifecycle$State("RESUMED", 4);
	//   24   52:new             #2   <Class Lifecycle$State>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "RESUMED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void Lifecycle$State(String, int)>
	//   29   62:putstatic       #37  <Field Lifecycle$State RESUMED>
		$VALUES = (new Lifecycle$State[] {
			DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       Lifecycle$State[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field Lifecycle$State DESTROYED>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field Lifecycle$State INITIALIZED>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field Lifecycle$State CREATED>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field Lifecycle$State STARTED>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field Lifecycle$State RESUMED>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field Lifecycle$State[] $VALUES>
	//*  53  102:return          
	}

	private Lifecycle$State(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
