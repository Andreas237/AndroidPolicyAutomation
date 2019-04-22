// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			CompanionData

public static final class CompanionData$a extends Enum
{

	public static CompanionData$a valueOf(String s)
	{
		return (CompanionData$a)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/data/CompanionData$a, s);
	//    0    0:ldc1            #2   <Class CompanionData$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CompanionData$a>
	//    4    9:areturn         
	}

	public static CompanionData$a[] values()
	{
		return (CompanionData$a[])((CompanionData$a []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field CompanionData$a[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.data.CompanionData$a_3B_.clone()>
	//    2    6:checkcast       #42  <Class CompanionData$a[]>
	//    3    9:areturn         
	}

	private static final CompanionData$a $VALUES[];
	public static final CompanionData$a Html;
	public static final CompanionData$a IFrame;
	public static final CompanionData$a Static;

	static 
	{
		Html = new CompanionData$a("Html", 0);
	//    0    0:new             #2   <Class CompanionData$a>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Html">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void CompanionData$a(String, int)>
	//    5   10:putstatic       #23  <Field CompanionData$a Html>
		Static = new CompanionData$a("Static", 1);
	//    6   13:new             #2   <Class CompanionData$a>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Static">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void CompanionData$a(String, int)>
	//   11   23:putstatic       #26  <Field CompanionData$a Static>
		IFrame = new CompanionData$a("IFrame", 2);
	//   12   26:new             #2   <Class CompanionData$a>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "IFrame">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void CompanionData$a(String, int)>
	//   17   36:putstatic       #29  <Field CompanionData$a IFrame>
		$VALUES = (new CompanionData$a[] {
			Html, Static, IFrame
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       CompanionData$a[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field CompanionData$a Html>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field CompanionData$a Static>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field CompanionData$a IFrame>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field CompanionData$a[] $VALUES>
	//*  33   64:return          
	}

	private CompanionData$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
