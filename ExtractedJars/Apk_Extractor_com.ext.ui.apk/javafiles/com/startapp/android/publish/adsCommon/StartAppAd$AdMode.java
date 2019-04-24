// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			StartAppAd

public static final class StartAppAd$AdMode extends Enum
{

	public static StartAppAd$AdMode valueOf(String s)
	{
		return (StartAppAd$AdMode)Enum.valueOf(com/startapp/android/publish/adsCommon/StartAppAd$AdMode, s);
	//    0    0:ldc1            #2   <Class StartAppAd$AdMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StartAppAd$AdMode>
	//    4    9:areturn         
	}

	public static StartAppAd$AdMode[] values()
	{
		return (StartAppAd$AdMode[])((StartAppAd$AdMode []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field StartAppAd$AdMode[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.StartAppAd$AdMode_3B_.clone()>
	//    2    6:checkcast       #55  <Class StartAppAd$AdMode[]>
	//    3    9:areturn         
	}

	private static final StartAppAd$AdMode $VALUES[];
	public static final StartAppAd$AdMode AUTOMATIC;
	public static final StartAppAd$AdMode FULLPAGE;
	public static final StartAppAd$AdMode OFFERWALL;
	public static final StartAppAd$AdMode OVERLAY;
	public static final StartAppAd$AdMode REWARDED_VIDEO;
	public static final StartAppAd$AdMode VIDEO;

	static 
	{
		AUTOMATIC = new StartAppAd$AdMode("AUTOMATIC", 0);
	//    0    0:new             #2   <Class StartAppAd$AdMode>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "AUTOMATIC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
	//    5   10:putstatic       #27  <Field StartAppAd$AdMode AUTOMATIC>
		FULLPAGE = new StartAppAd$AdMode("FULLPAGE", 1);
	//    6   13:new             #2   <Class StartAppAd$AdMode>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "FULLPAGE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
	//   11   23:putstatic       #30  <Field StartAppAd$AdMode FULLPAGE>
		OFFERWALL = new StartAppAd$AdMode("OFFERWALL", 2);
	//   12   26:new             #2   <Class StartAppAd$AdMode>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "OFFERWALL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
	//   17   36:putstatic       #33  <Field StartAppAd$AdMode OFFERWALL>
		REWARDED_VIDEO = new StartAppAd$AdMode("REWARDED_VIDEO", 3);
	//   18   39:new             #2   <Class StartAppAd$AdMode>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "REWARDED_VIDEO">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
	//   23   49:putstatic       #36  <Field StartAppAd$AdMode REWARDED_VIDEO>
		VIDEO = new StartAppAd$AdMode("VIDEO", 4);
	//   24   52:new             #2   <Class StartAppAd$AdMode>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "VIDEO">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
	//   29   62:putstatic       #39  <Field StartAppAd$AdMode VIDEO>
		OVERLAY = new StartAppAd$AdMode("OVERLAY", 5);
	//   30   65:new             #2   <Class StartAppAd$AdMode>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "OVERLAY">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void StartAppAd$AdMode(String, int)>
	//   35   75:putstatic       #42  <Field StartAppAd$AdMode OVERLAY>
		$VALUES = (new StartAppAd$AdMode[] {
			AUTOMATIC, FULLPAGE, OFFERWALL, REWARDED_VIDEO, VIDEO, OVERLAY
		});
	//   36   78:bipush          6
	//   37   80:anewarray       StartAppAd$AdMode[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #27  <Field StartAppAd$AdMode AUTOMATIC>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #30  <Field StartAppAd$AdMode FULLPAGE>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #33  <Field StartAppAd$AdMode OFFERWALL>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #36  <Field StartAppAd$AdMode REWARDED_VIDEO>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #39  <Field StartAppAd$AdMode VIDEO>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #42  <Field StartAppAd$AdMode OVERLAY>
	//   61  118:aastore         
	//   62  119:putstatic       #44  <Field StartAppAd$AdMode[] $VALUES>
	//*  63  122:return          
	}

	private StartAppAd$AdMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
