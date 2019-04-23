// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;


// Referenced classes of package com.facebook.places.model:
//			CurrentPlaceRequestParams

public static final class CurrentPlaceRequestParams$ScanMode extends Enum
{

	public static CurrentPlaceRequestParams$ScanMode valueOf(String s)
	{
		return (CurrentPlaceRequestParams$ScanMode)Enum.valueOf(com/facebook/places/model/CurrentPlaceRequestParams$ScanMode, s);
	//    0    0:ldc1            #2   <Class CurrentPlaceRequestParams$ScanMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CurrentPlaceRequestParams$ScanMode>
	//    4    9:areturn         
	}

	public static CurrentPlaceRequestParams$ScanMode[] values()
	{
		return (CurrentPlaceRequestParams$ScanMode[])((CurrentPlaceRequestParams$ScanMode []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field CurrentPlaceRequestParams$ScanMode[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.places.model.CurrentPlaceRequestParams$ScanMode_3B_.clone()>
	//    2    6:checkcast       #38  <Class CurrentPlaceRequestParams$ScanMode[]>
	//    3    9:areturn         
	}

	private static final CurrentPlaceRequestParams$ScanMode $VALUES[];
	public static final CurrentPlaceRequestParams$ScanMode HIGH_ACCURACY;
	public static final CurrentPlaceRequestParams$ScanMode LOW_LATENCY;

	static 
	{
		HIGH_ACCURACY = new CurrentPlaceRequestParams$ScanMode("HIGH_ACCURACY", 0);
	//    0    0:new             #2   <Class CurrentPlaceRequestParams$ScanMode>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "HIGH_ACCURACY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void CurrentPlaceRequestParams$ScanMode(String, int)>
	//    5   10:putstatic       #22  <Field CurrentPlaceRequestParams$ScanMode HIGH_ACCURACY>
		LOW_LATENCY = new CurrentPlaceRequestParams$ScanMode("LOW_LATENCY", 1);
	//    6   13:new             #2   <Class CurrentPlaceRequestParams$ScanMode>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "LOW_LATENCY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void CurrentPlaceRequestParams$ScanMode(String, int)>
	//   11   23:putstatic       #25  <Field CurrentPlaceRequestParams$ScanMode LOW_LATENCY>
		$VALUES = (new CurrentPlaceRequestParams$ScanMode[] {
			HIGH_ACCURACY, LOW_LATENCY
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       CurrentPlaceRequestParams$ScanMode[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field CurrentPlaceRequestParams$ScanMode HIGH_ACCURACY>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field CurrentPlaceRequestParams$ScanMode LOW_LATENCY>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field CurrentPlaceRequestParams$ScanMode[] $VALUES>
	//*  23   45:return          
	}

	private CurrentPlaceRequestParams$ScanMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
