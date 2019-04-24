// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			Ad

public static final class Ad$AdState extends Enum
{

	public static Ad$AdState valueOf(String s)
	{
		return (Ad$AdState)Enum.valueOf(com/startapp/android/publish/adsCommon/Ad$AdState, s);
	//    0    0:ldc1            #2   <Class Ad$AdState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Ad$AdState>
	//    4    9:areturn         
	}

	public static Ad$AdState[] values()
	{
		return (Ad$AdState[])((Ad$AdState []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Ad$AdState[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.Ad$AdState_3B_.clone()>
	//    2    6:checkcast       #42  <Class Ad$AdState[]>
	//    3    9:areturn         
	}

	private static final Ad$AdState $VALUES[];
	public static final Ad$AdState PROCESSING;
	public static final Ad$AdState READY;
	public static final Ad$AdState UN_INITIALIZED;

	static 
	{
		UN_INITIALIZED = new Ad$AdState("UN_INITIALIZED", 0);
	//    0    0:new             #2   <Class Ad$AdState>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "UN_INITIALIZED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Ad$AdState(String, int)>
	//    5   10:putstatic       #23  <Field Ad$AdState UN_INITIALIZED>
		PROCESSING = new Ad$AdState("PROCESSING", 1);
	//    6   13:new             #2   <Class Ad$AdState>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "PROCESSING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Ad$AdState(String, int)>
	//   11   23:putstatic       #26  <Field Ad$AdState PROCESSING>
		READY = new Ad$AdState("READY", 2);
	//   12   26:new             #2   <Class Ad$AdState>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "READY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Ad$AdState(String, int)>
	//   17   36:putstatic       #29  <Field Ad$AdState READY>
		$VALUES = (new Ad$AdState[] {
			UN_INITIALIZED, PROCESSING, READY
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Ad$AdState[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field Ad$AdState UN_INITIALIZED>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field Ad$AdState PROCESSING>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field Ad$AdState READY>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field Ad$AdState[] $VALUES>
	//*  33   64:return          
	}

	private Ad$AdState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
