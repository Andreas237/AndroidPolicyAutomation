// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


public final class BackoffPolicy extends Enum
{

	private BackoffPolicy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static BackoffPolicy valueOf(String s)
	{
		return (BackoffPolicy)Enum.valueOf(androidx/work/BackoffPolicy, s);
	//    0    0:ldc1            #2   <Class BackoffPolicy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BackoffPolicy>
	//    4    9:areturn         
	}

	public static BackoffPolicy[] values()
	{
		return (BackoffPolicy[])((BackoffPolicy []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field BackoffPolicy[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Landroidx.work.BackoffPolicy_3B_.clone()>
	//    2    6:checkcast       #35  <Class BackoffPolicy[]>
	//    3    9:areturn         
	}

	private static final BackoffPolicy $VALUES[];
	public static final BackoffPolicy EXPONENTIAL;
	public static final BackoffPolicy LINEAR;

	static 
	{
		EXPONENTIAL = new BackoffPolicy("EXPONENTIAL", 0);
	//    0    0:new             #2   <Class BackoffPolicy>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "EXPONENTIAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void BackoffPolicy(String, int)>
	//    5   10:putstatic       #19  <Field BackoffPolicy EXPONENTIAL>
		LINEAR = new BackoffPolicy("LINEAR", 1);
	//    6   13:new             #2   <Class BackoffPolicy>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "LINEAR">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void BackoffPolicy(String, int)>
	//   11   23:putstatic       #22  <Field BackoffPolicy LINEAR>
		$VALUES = (new BackoffPolicy[] {
			EXPONENTIAL, LINEAR
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       BackoffPolicy[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field BackoffPolicy EXPONENTIAL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field BackoffPolicy LINEAR>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field BackoffPolicy[] $VALUES>
	//*  23   45:return          
	}
}
