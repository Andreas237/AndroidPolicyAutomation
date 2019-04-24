// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//			Retryable

public static final class Retryable$Result extends Enum
{

	public static Retryable$Result valueOf(String s)
	{
		return (Retryable$Result)Enum.valueOf(com/squareup/leakcanary/Retryable$Result, s);
	//    0    0:ldc1            #2   <Class Retryable$Result>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Retryable$Result>
	//    4    9:areturn         
	}

	public static Retryable$Result[] values()
	{
		return (Retryable$Result[])((Retryable$Result []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Retryable$Result[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.squareup.leakcanary.Retryable$Result_3B_.clone()>
	//    2    6:checkcast       #38  <Class Retryable$Result[]>
	//    3    9:areturn         
	}

	private static final Retryable$Result $VALUES[];
	public static final Retryable$Result DONE;
	public static final Retryable$Result RETRY;

	static 
	{
		DONE = new Retryable$Result("DONE", 0);
	//    0    0:new             #2   <Class Retryable$Result>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "DONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Retryable$Result(String, int)>
	//    5   10:putstatic       #22  <Field Retryable$Result DONE>
		RETRY = new Retryable$Result("RETRY", 1);
	//    6   13:new             #2   <Class Retryable$Result>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "RETRY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Retryable$Result(String, int)>
	//   11   23:putstatic       #25  <Field Retryable$Result RETRY>
		$VALUES = (new Retryable$Result[] {
			DONE, RETRY
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Retryable$Result[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Retryable$Result DONE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Retryable$Result RETRY>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Retryable$Result[] $VALUES>
	//*  23   45:return          
	}

	private Retryable$Result(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
