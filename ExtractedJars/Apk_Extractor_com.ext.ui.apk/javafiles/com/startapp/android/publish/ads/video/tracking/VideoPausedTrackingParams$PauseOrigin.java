// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;


// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			VideoPausedTrackingParams

public static final class VideoPausedTrackingParams$PauseOrigin extends Enum
{

	public static VideoPausedTrackingParams$PauseOrigin valueOf(String s)
	{
		return (VideoPausedTrackingParams$PauseOrigin)Enum.valueOf(com/startapp/android/publish/ads/video/tracking/VideoPausedTrackingParams$PauseOrigin, s);
	//    0    0:ldc1            #2   <Class VideoPausedTrackingParams$PauseOrigin>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class VideoPausedTrackingParams$PauseOrigin>
	//    4    9:areturn         
	}

	public static VideoPausedTrackingParams$PauseOrigin[] values()
	{
		return (VideoPausedTrackingParams$PauseOrigin[])((VideoPausedTrackingParams$PauseOrigin []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field VideoPausedTrackingParams$PauseOrigin[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.ads.video.tracking.VideoPausedTrackingParams$PauseOrigin_3B_.clone()>
	//    2    6:checkcast       #38  <Class VideoPausedTrackingParams$PauseOrigin[]>
	//    3    9:areturn         
	}

	private static final VideoPausedTrackingParams$PauseOrigin $VALUES[];
	public static final VideoPausedTrackingParams$PauseOrigin EXTERNAL;
	public static final VideoPausedTrackingParams$PauseOrigin INAPP;

	static 
	{
		INAPP = new VideoPausedTrackingParams$PauseOrigin("INAPP", 0);
	//    0    0:new             #2   <Class VideoPausedTrackingParams$PauseOrigin>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "INAPP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void VideoPausedTrackingParams$PauseOrigin(String, int)>
	//    5   10:putstatic       #22  <Field VideoPausedTrackingParams$PauseOrigin INAPP>
		EXTERNAL = new VideoPausedTrackingParams$PauseOrigin("EXTERNAL", 1);
	//    6   13:new             #2   <Class VideoPausedTrackingParams$PauseOrigin>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "EXTERNAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void VideoPausedTrackingParams$PauseOrigin(String, int)>
	//   11   23:putstatic       #25  <Field VideoPausedTrackingParams$PauseOrigin EXTERNAL>
		$VALUES = (new VideoPausedTrackingParams$PauseOrigin[] {
			INAPP, EXTERNAL
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       VideoPausedTrackingParams$PauseOrigin[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field VideoPausedTrackingParams$PauseOrigin INAPP>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field VideoPausedTrackingParams$PauseOrigin EXTERNAL>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field VideoPausedTrackingParams$PauseOrigin[] $VALUES>
	//*  23   45:return          
	}

	private VideoPausedTrackingParams$PauseOrigin(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
