// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;


// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			VideoTrackingLink

public static final class VideoTrackingLink$TrackingSource extends Enum
{

	public static VideoTrackingLink$TrackingSource valueOf(String s)
	{
		return (VideoTrackingLink$TrackingSource)Enum.valueOf(com/startapp/android/publish/ads/video/tracking/VideoTrackingLink$TrackingSource, s);
	//    0    0:ldc1            #2   <Class VideoTrackingLink$TrackingSource>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class VideoTrackingLink$TrackingSource>
	//    4    9:areturn         
	}

	public static VideoTrackingLink$TrackingSource[] values()
	{
		return (VideoTrackingLink$TrackingSource[])((VideoTrackingLink$TrackingSource []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field VideoTrackingLink$TrackingSource[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.ads.video.tracking.VideoTrackingLink$TrackingSource_3B_.clone()>
	//    2    6:checkcast       #38  <Class VideoTrackingLink$TrackingSource[]>
	//    3    9:areturn         
	}

	private static final VideoTrackingLink$TrackingSource $VALUES[];
	public static final VideoTrackingLink$TrackingSource EXTERNAL;
	public static final VideoTrackingLink$TrackingSource STARTAPP;

	static 
	{
		STARTAPP = new VideoTrackingLink$TrackingSource("STARTAPP", 0);
	//    0    0:new             #2   <Class VideoTrackingLink$TrackingSource>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "STARTAPP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void VideoTrackingLink$TrackingSource(String, int)>
	//    5   10:putstatic       #22  <Field VideoTrackingLink$TrackingSource STARTAPP>
		EXTERNAL = new VideoTrackingLink$TrackingSource("EXTERNAL", 1);
	//    6   13:new             #2   <Class VideoTrackingLink$TrackingSource>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "EXTERNAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void VideoTrackingLink$TrackingSource(String, int)>
	//   11   23:putstatic       #25  <Field VideoTrackingLink$TrackingSource EXTERNAL>
		$VALUES = (new VideoTrackingLink$TrackingSource[] {
			STARTAPP, EXTERNAL
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       VideoTrackingLink$TrackingSource[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field VideoTrackingLink$TrackingSource STARTAPP>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field VideoTrackingLink$TrackingSource EXTERNAL>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field VideoTrackingLink$TrackingSource[] $VALUES>
	//*  23   45:return          
	}

	private VideoTrackingLink$TrackingSource(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
