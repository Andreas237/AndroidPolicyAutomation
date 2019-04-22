// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			AdError

public static final class AdError$AdErrorType extends Enum
{

	public static AdError$AdErrorType valueOf(String s)
	{
		return (AdError$AdErrorType)Enum.valueOf(com/google/ads/interactivemedia/v3/api/AdError$AdErrorType, s);
	//    0    0:ldc1            #2   <Class AdError$AdErrorType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdError$AdErrorType>
	//    4    9:areturn         
	}

	public static AdError$AdErrorType[] values()
	{
		return (AdError$AdErrorType[])((AdError$AdErrorType []) (a)).clone();
	//    0    0:getstatic       #27  <Field AdError$AdErrorType[] a>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.api.AdError$AdErrorType_3B_.clone()>
	//    2    6:checkcast       #38  <Class AdError$AdErrorType[]>
	//    3    9:areturn         
	}

	public static final AdError$AdErrorType LOAD;
	public static final AdError$AdErrorType PLAY;
	private static final AdError$AdErrorType a[];

	static 
	{
		LOAD = new AdError$AdErrorType("LOAD", 0);
	//    0    0:new             #2   <Class AdError$AdErrorType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LOAD">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void AdError$AdErrorType(String, int)>
	//    5   10:putstatic       #22  <Field AdError$AdErrorType LOAD>
		PLAY = new AdError$AdErrorType("PLAY", 1);
	//    6   13:new             #2   <Class AdError$AdErrorType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "PLAY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void AdError$AdErrorType(String, int)>
	//   11   23:putstatic       #25  <Field AdError$AdErrorType PLAY>
		a = (new AdError$AdErrorType[] {
			LOAD, PLAY
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AdError$AdErrorType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field AdError$AdErrorType LOAD>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field AdError$AdErrorType PLAY>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field AdError$AdErrorType[] a>
	//*  23   45:return          
	}

	private AdError$AdErrorType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
