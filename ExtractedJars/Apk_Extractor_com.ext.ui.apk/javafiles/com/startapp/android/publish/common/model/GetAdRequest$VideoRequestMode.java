// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;


// Referenced classes of package com.startapp.android.publish.common.model:
//			GetAdRequest

protected static final class GetAdRequest$VideoRequestMode extends Enum
{

	public static GetAdRequest$VideoRequestMode valueOf(String s)
	{
		return (GetAdRequest$VideoRequestMode)Enum.valueOf(com/startapp/android/publish/common/model/GetAdRequest$VideoRequestMode, s);
	//    0    0:ldc1            #2   <Class GetAdRequest$VideoRequestMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GetAdRequest$VideoRequestMode>
	//    4    9:areturn         
	}

	public static GetAdRequest$VideoRequestMode[] values()
	{
		return (GetAdRequest$VideoRequestMode[])((GetAdRequest$VideoRequestMode []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field GetAdRequest$VideoRequestMode[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdRequest$VideoRequestMode_3B_.clone()>
	//    2    6:checkcast       #38  <Class GetAdRequest$VideoRequestMode[]>
	//    3    9:areturn         
	}

	private static final GetAdRequest$VideoRequestMode $VALUES[];
	public static final GetAdRequest$VideoRequestMode INTERSTITIAL;
	public static final GetAdRequest$VideoRequestMode REWARDED;

	static 
	{
		INTERSTITIAL = new GetAdRequest$VideoRequestMode("INTERSTITIAL", 0);
	//    0    0:new             #2   <Class GetAdRequest$VideoRequestMode>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "INTERSTITIAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void GetAdRequest$VideoRequestMode(String, int)>
	//    5   10:putstatic       #22  <Field GetAdRequest$VideoRequestMode INTERSTITIAL>
		REWARDED = new GetAdRequest$VideoRequestMode("REWARDED", 1);
	//    6   13:new             #2   <Class GetAdRequest$VideoRequestMode>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "REWARDED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void GetAdRequest$VideoRequestMode(String, int)>
	//   11   23:putstatic       #25  <Field GetAdRequest$VideoRequestMode REWARDED>
		$VALUES = (new GetAdRequest$VideoRequestMode[] {
			INTERSTITIAL, REWARDED
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       GetAdRequest$VideoRequestMode[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field GetAdRequest$VideoRequestMode INTERSTITIAL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field GetAdRequest$VideoRequestMode REWARDED>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field GetAdRequest$VideoRequestMode[] $VALUES>
	//*  23   45:return          
	}

	private GetAdRequest$VideoRequestMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
