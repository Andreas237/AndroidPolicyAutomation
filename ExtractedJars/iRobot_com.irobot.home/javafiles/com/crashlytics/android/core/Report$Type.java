// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			Report

public static final class Report$Type extends Enum
{

	public static Report$Type valueOf(String s)
	{
		return (Report$Type)Enum.valueOf(com/crashlytics/android/core/Report$Type, s);
	//    0    0:ldc1            #2   <Class Report$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Report$Type>
	//    4    9:areturn         
	}

	public static Report$Type[] values()
	{
		return (Report$Type[])((Report$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Report$Type[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.crashlytics.android.core.Report$Type_3B_.clone()>
	//    2    6:checkcast       #38  <Class Report$Type[]>
	//    3    9:areturn         
	}

	private static final Report$Type $VALUES[];
	public static final Report$Type JAVA;
	public static final Report$Type NATIVE;

	static 
	{
		JAVA = new Report$Type("JAVA", 0);
	//    0    0:new             #2   <Class Report$Type>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "JAVA">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Report$Type(String, int)>
	//    5   10:putstatic       #22  <Field Report$Type JAVA>
		NATIVE = new Report$Type("NATIVE", 1);
	//    6   13:new             #2   <Class Report$Type>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "NATIVE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Report$Type(String, int)>
	//   11   23:putstatic       #25  <Field Report$Type NATIVE>
		$VALUES = (new Report$Type[] {
			JAVA, NATIVE
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Report$Type[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Report$Type JAVA>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Report$Type NATIVE>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Report$Type[] $VALUES>
	//*  23   45:return          
	}

	private Report$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
