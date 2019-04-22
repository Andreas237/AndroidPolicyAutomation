// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			Request

public static final class Request$Priority extends Enum
{

	public static Request$Priority valueOf(String s)
	{
		return (Request$Priority)Enum.valueOf(com/android/volley/Request$Priority, s);
	//    0    0:ldc1            #2   <Class Request$Priority>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Request$Priority>
	//    4    9:areturn         
	}

	public static Request$Priority[] values()
	{
		return (Request$Priority[])((Request$Priority []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field Request$Priority[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.android.volley.Request$Priority_3B_.clone()>
	//    2    6:checkcast       #46  <Class Request$Priority[]>
	//    3    9:areturn         
	}

	private static final Request$Priority $VALUES[];
	public static final Request$Priority HIGH;
	public static final Request$Priority IMMEDIATE;
	public static final Request$Priority LOW;
	public static final Request$Priority NORMAL;

	static 
	{
		LOW = new Request$Priority("LOW", 0);
	//    0    0:new             #2   <Class Request$Priority>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LOW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void Request$Priority(String, int)>
	//    5   10:putstatic       #24  <Field Request$Priority LOW>
		NORMAL = new Request$Priority("NORMAL", 1);
	//    6   13:new             #2   <Class Request$Priority>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NORMAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void Request$Priority(String, int)>
	//   11   23:putstatic       #27  <Field Request$Priority NORMAL>
		HIGH = new Request$Priority("HIGH", 2);
	//   12   26:new             #2   <Class Request$Priority>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "HIGH">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void Request$Priority(String, int)>
	//   17   36:putstatic       #30  <Field Request$Priority HIGH>
		IMMEDIATE = new Request$Priority("IMMEDIATE", 3);
	//   18   39:new             #2   <Class Request$Priority>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "IMMEDIATE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void Request$Priority(String, int)>
	//   23   49:putstatic       #33  <Field Request$Priority IMMEDIATE>
		$VALUES = (new Request$Priority[] {
			LOW, NORMAL, HIGH, IMMEDIATE
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Request$Priority[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field Request$Priority LOW>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field Request$Priority NORMAL>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field Request$Priority HIGH>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field Request$Priority IMMEDIATE>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field Request$Priority[] $VALUES>
	//*  43   83:return          
	}

	private Request$Priority(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
