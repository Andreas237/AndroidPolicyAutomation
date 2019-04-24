// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			AdsConstants

public static final class AdsConstants$ApiType extends Enum
{

	public static AdsConstants$ApiType valueOf(String s)
	{
		return (AdsConstants$ApiType)Enum.valueOf(com/startapp/android/publish/adsCommon/AdsConstants$ApiType, s);
	//    0    0:ldc1            #2   <Class AdsConstants$ApiType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdsConstants$ApiType>
	//    4    9:areturn         
	}

	public static AdsConstants$ApiType[] values()
	{
		return (AdsConstants$ApiType[])((AdsConstants$ApiType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field AdsConstants$ApiType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.AdsConstants$ApiType_3B_.clone()>
	//    2    6:checkcast       #46  <Class AdsConstants$ApiType[]>
	//    3    9:areturn         
	}

	private static final AdsConstants$ApiType $VALUES[];
	public static final AdsConstants$ApiType DOWNLOAD;
	public static final AdsConstants$ApiType HTML;
	public static final AdsConstants$ApiType JSON;
	public static final AdsConstants$ApiType METADATA;

	static 
	{
		HTML = new AdsConstants$ApiType("HTML", 0);
	//    0    0:new             #2   <Class AdsConstants$ApiType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "HTML">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
	//    5   10:putstatic       #24  <Field AdsConstants$ApiType HTML>
		JSON = new AdsConstants$ApiType("JSON", 1);
	//    6   13:new             #2   <Class AdsConstants$ApiType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "JSON">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
	//   11   23:putstatic       #27  <Field AdsConstants$ApiType JSON>
		METADATA = new AdsConstants$ApiType("METADATA", 2);
	//   12   26:new             #2   <Class AdsConstants$ApiType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "METADATA">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
	//   17   36:putstatic       #30  <Field AdsConstants$ApiType METADATA>
		DOWNLOAD = new AdsConstants$ApiType("DOWNLOAD", 3);
	//   18   39:new             #2   <Class AdsConstants$ApiType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "DOWNLOAD">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
	//   23   49:putstatic       #33  <Field AdsConstants$ApiType DOWNLOAD>
		$VALUES = (new AdsConstants$ApiType[] {
			HTML, JSON, METADATA, DOWNLOAD
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       AdsConstants$ApiType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field AdsConstants$ApiType HTML>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field AdsConstants$ApiType JSON>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field AdsConstants$ApiType METADATA>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field AdsConstants$ApiType DOWNLOAD>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field AdsConstants$ApiType[] $VALUES>
	//*  43   83:return          
	}

	private AdsConstants$ApiType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
