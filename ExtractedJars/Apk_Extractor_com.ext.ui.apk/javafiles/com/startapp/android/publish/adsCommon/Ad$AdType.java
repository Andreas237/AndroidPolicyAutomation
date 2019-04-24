// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			Ad

public static final class Ad$AdType extends Enum
{

	public static Ad$AdType valueOf(String s)
	{
		return (Ad$AdType)Enum.valueOf(com/startapp/android/publish/adsCommon/Ad$AdType, s);
	//    0    0:ldc1            #2   <Class Ad$AdType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Ad$AdType>
	//    4    9:areturn         
	}

	public static Ad$AdType[] values()
	{
		return (Ad$AdType[])((Ad$AdType []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field Ad$AdType[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.Ad$AdType_3B_.clone()>
	//    2    6:checkcast       #54  <Class Ad$AdType[]>
	//    3    9:areturn         
	}

	private static final Ad$AdType $VALUES[];
	public static final Ad$AdType INTERSTITIAL;
	public static final Ad$AdType NON_VIDEO;
	public static final Ad$AdType REWARDED_VIDEO;
	public static final Ad$AdType RICH_TEXT;
	public static final Ad$AdType VIDEO;
	public static final Ad$AdType VIDEO_NO_VAST;

	static 
	{
		INTERSTITIAL = new Ad$AdType("INTERSTITIAL", 0);
	//    0    0:new             #2   <Class Ad$AdType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "INTERSTITIAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void Ad$AdType(String, int)>
	//    5   10:putstatic       #26  <Field Ad$AdType INTERSTITIAL>
		RICH_TEXT = new Ad$AdType("RICH_TEXT", 1);
	//    6   13:new             #2   <Class Ad$AdType>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "RICH_TEXT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void Ad$AdType(String, int)>
	//   11   23:putstatic       #29  <Field Ad$AdType RICH_TEXT>
		VIDEO = new Ad$AdType("VIDEO", 2);
	//   12   26:new             #2   <Class Ad$AdType>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "VIDEO">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void Ad$AdType(String, int)>
	//   17   36:putstatic       #32  <Field Ad$AdType VIDEO>
		REWARDED_VIDEO = new Ad$AdType("REWARDED_VIDEO", 3);
	//   18   39:new             #2   <Class Ad$AdType>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "REWARDED_VIDEO">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void Ad$AdType(String, int)>
	//   23   49:putstatic       #35  <Field Ad$AdType REWARDED_VIDEO>
		NON_VIDEO = new Ad$AdType("NON_VIDEO", 4);
	//   24   52:new             #2   <Class Ad$AdType>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "NON_VIDEO">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void Ad$AdType(String, int)>
	//   29   62:putstatic       #38  <Field Ad$AdType NON_VIDEO>
		VIDEO_NO_VAST = new Ad$AdType("VIDEO_NO_VAST", 5);
	//   30   65:new             #2   <Class Ad$AdType>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "VIDEO_NO_VAST">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void Ad$AdType(String, int)>
	//   35   75:putstatic       #41  <Field Ad$AdType VIDEO_NO_VAST>
		$VALUES = (new Ad$AdType[] {
			INTERSTITIAL, RICH_TEXT, VIDEO, REWARDED_VIDEO, NON_VIDEO, VIDEO_NO_VAST
		});
	//   36   78:bipush          6
	//   37   80:anewarray       Ad$AdType[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field Ad$AdType INTERSTITIAL>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field Ad$AdType RICH_TEXT>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field Ad$AdType VIDEO>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field Ad$AdType REWARDED_VIDEO>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field Ad$AdType NON_VIDEO>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field Ad$AdType VIDEO_NO_VAST>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field Ad$AdType[] $VALUES>
	//*  63  122:return          
	}

	private Ad$AdType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
