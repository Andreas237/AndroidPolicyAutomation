// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;


// Referenced classes of package com.facebook.places.model:
//			CurrentPlaceRequestParams

public static final class CurrentPlaceRequestParams$ConfidenceLevel extends Enum
{

	public static CurrentPlaceRequestParams$ConfidenceLevel valueOf(String s)
	{
		return (CurrentPlaceRequestParams$ConfidenceLevel)Enum.valueOf(com/facebook/places/model/CurrentPlaceRequestParams$ConfidenceLevel, s);
	//    0    0:ldc1            #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
	//    4    9:areturn         
	}

	public static CurrentPlaceRequestParams$ConfidenceLevel[] values()
	{
		return (CurrentPlaceRequestParams$ConfidenceLevel[])((CurrentPlaceRequestParams$ConfidenceLevel []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field CurrentPlaceRequestParams$ConfidenceLevel[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel_3B_.clone()>
	//    2    6:checkcast       #42  <Class CurrentPlaceRequestParams$ConfidenceLevel[]>
	//    3    9:areturn         
	}

	private static final CurrentPlaceRequestParams$ConfidenceLevel $VALUES[];
	public static final CurrentPlaceRequestParams$ConfidenceLevel HIGH;
	public static final CurrentPlaceRequestParams$ConfidenceLevel LOW;
	public static final CurrentPlaceRequestParams$ConfidenceLevel MEDIUM;

	static 
	{
		LOW = new CurrentPlaceRequestParams$ConfidenceLevel("LOW", 0);
	//    0    0:new             #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "LOW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void CurrentPlaceRequestParams$ConfidenceLevel(String, int)>
	//    5   10:putstatic       #23  <Field CurrentPlaceRequestParams$ConfidenceLevel LOW>
		MEDIUM = new CurrentPlaceRequestParams$ConfidenceLevel("MEDIUM", 1);
	//    6   13:new             #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "MEDIUM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void CurrentPlaceRequestParams$ConfidenceLevel(String, int)>
	//   11   23:putstatic       #26  <Field CurrentPlaceRequestParams$ConfidenceLevel MEDIUM>
		HIGH = new CurrentPlaceRequestParams$ConfidenceLevel("HIGH", 2);
	//   12   26:new             #2   <Class CurrentPlaceRequestParams$ConfidenceLevel>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "HIGH">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void CurrentPlaceRequestParams$ConfidenceLevel(String, int)>
	//   17   36:putstatic       #29  <Field CurrentPlaceRequestParams$ConfidenceLevel HIGH>
		$VALUES = (new CurrentPlaceRequestParams$ConfidenceLevel[] {
			LOW, MEDIUM, HIGH
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       CurrentPlaceRequestParams$ConfidenceLevel[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field CurrentPlaceRequestParams$ConfidenceLevel LOW>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field CurrentPlaceRequestParams$ConfidenceLevel MEDIUM>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field CurrentPlaceRequestParams$ConfidenceLevel HIGH>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field CurrentPlaceRequestParams$ConfidenceLevel[] $VALUES>
	//*  33   64:return          
	}

	private CurrentPlaceRequestParams$ConfidenceLevel(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
