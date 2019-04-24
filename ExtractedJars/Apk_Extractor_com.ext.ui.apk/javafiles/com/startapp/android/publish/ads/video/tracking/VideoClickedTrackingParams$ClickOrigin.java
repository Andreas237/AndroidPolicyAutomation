// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;


// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			VideoClickedTrackingParams

public static final class VideoClickedTrackingParams$ClickOrigin extends Enum
{

	public static VideoClickedTrackingParams$ClickOrigin valueOf(String s)
	{
		return (VideoClickedTrackingParams$ClickOrigin)Enum.valueOf(com/startapp/android/publish/ads/video/tracking/VideoClickedTrackingParams$ClickOrigin, s);
	//    0    0:ldc1            #2   <Class VideoClickedTrackingParams$ClickOrigin>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class VideoClickedTrackingParams$ClickOrigin>
	//    4    9:areturn         
	}

	public static VideoClickedTrackingParams$ClickOrigin[] values()
	{
		return (VideoClickedTrackingParams$ClickOrigin[])((VideoClickedTrackingParams$ClickOrigin []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field VideoClickedTrackingParams$ClickOrigin[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.ads.video.tracking.VideoClickedTrackingParams$ClickOrigin_3B_.clone()>
	//    2    6:checkcast       #38  <Class VideoClickedTrackingParams$ClickOrigin[]>
	//    3    9:areturn         
	}

	private static final VideoClickedTrackingParams$ClickOrigin $VALUES[];
	public static final VideoClickedTrackingParams$ClickOrigin POSTROLL;
	public static final VideoClickedTrackingParams$ClickOrigin VIDEO;

	static 
	{
		POSTROLL = new VideoClickedTrackingParams$ClickOrigin("POSTROLL", 0);
	//    0    0:new             #2   <Class VideoClickedTrackingParams$ClickOrigin>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "POSTROLL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void VideoClickedTrackingParams$ClickOrigin(String, int)>
	//    5   10:putstatic       #22  <Field VideoClickedTrackingParams$ClickOrigin POSTROLL>
		VIDEO = new VideoClickedTrackingParams$ClickOrigin("VIDEO", 1);
	//    6   13:new             #2   <Class VideoClickedTrackingParams$ClickOrigin>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "VIDEO">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void VideoClickedTrackingParams$ClickOrigin(String, int)>
	//   11   23:putstatic       #25  <Field VideoClickedTrackingParams$ClickOrigin VIDEO>
		$VALUES = (new VideoClickedTrackingParams$ClickOrigin[] {
			POSTROLL, VIDEO
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       VideoClickedTrackingParams$ClickOrigin[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field VideoClickedTrackingParams$ClickOrigin POSTROLL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field VideoClickedTrackingParams$ClickOrigin VIDEO>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field VideoClickedTrackingParams$ClickOrigin[] $VALUES>
	//*  23   45:return          
	}

	private VideoClickedTrackingParams$ClickOrigin(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
