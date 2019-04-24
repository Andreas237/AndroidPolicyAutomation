// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;


// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			VideoTrackingParams

public class VideoClickedTrackingParams extends VideoTrackingParams
{
	public static final class ClickOrigin extends Enum
	{

		public static ClickOrigin valueOf(String s)
		{
			return (ClickOrigin)Enum.valueOf(com/startapp/android/publish/ads/video/tracking/VideoClickedTrackingParams$ClickOrigin, s);
		//    0    0:ldc1            #2   <Class VideoClickedTrackingParams$ClickOrigin>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class VideoClickedTrackingParams$ClickOrigin>
		//    4    9:areturn         
		}

		public static ClickOrigin[] values()
		{
			return (ClickOrigin[])((ClickOrigin []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field VideoClickedTrackingParams$ClickOrigin[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.ads.video.tracking.VideoClickedTrackingParams$ClickOrigin_3B_.clone()>
		//    2    6:checkcast       #38  <Class VideoClickedTrackingParams$ClickOrigin[]>
		//    3    9:areturn         
		}

		private static final ClickOrigin $VALUES[];
		public static final ClickOrigin POSTROLL;
		public static final ClickOrigin VIDEO;

		static 
		{
			POSTROLL = new ClickOrigin("POSTROLL", 0);
		//    0    0:new             #2   <Class VideoClickedTrackingParams$ClickOrigin>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "POSTROLL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void VideoClickedTrackingParams$ClickOrigin(String, int)>
		//    5   10:putstatic       #22  <Field VideoClickedTrackingParams$ClickOrigin POSTROLL>
			VIDEO = new ClickOrigin("VIDEO", 1);
		//    6   13:new             #2   <Class VideoClickedTrackingParams$ClickOrigin>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "VIDEO">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void VideoClickedTrackingParams$ClickOrigin(String, int)>
		//   11   23:putstatic       #25  <Field VideoClickedTrackingParams$ClickOrigin VIDEO>
			$VALUES = (new ClickOrigin[] {
				POSTROLL, VIDEO
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ClickOrigin[]
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

		private ClickOrigin(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public VideoClickedTrackingParams(String s, int i, int j, ClickOrigin clickorigin, String s1)
	{
		super(s, i, j, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           5
	//    5    6:invokespecial   #18  <Method void VideoTrackingParams(String, int, int, String)>
		clickOrigin = clickorigin;
	//    6    9:aload_0         
	//    7   10:aload           4
	//    8   12:putfield        #20  <Field VideoClickedTrackingParams$ClickOrigin clickOrigin>
	//    9   15:return          
	}

	private String getClickOriginQuery()
	{
		return (new StringBuilder()).append("&co=").append(clickOrigin.toString()).toString();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:ldc1            #30  <String "&co=">
	//    4    9:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field VideoClickedTrackingParams$ClickOrigin clickOrigin>
	//    7   16:invokevirtual   #37  <Method String VideoClickedTrackingParams$ClickOrigin.toString()>
	//    8   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	public String getQueryString()
	{
		return getQueryString((new StringBuilder()).append(getCompletedQuery()).append(getClickOriginQuery()).append(getVideoPlayingModeQuery()).toString());
	//    0    0:aload_0         
	//    1    1:new             #25  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #28  <Method void StringBuilder()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #42  <Method String getCompletedQuery()>
	//    6   12:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:invokespecial   #44  <Method String getClickOriginQuery()>
	//    9   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #47  <Method String getVideoPlayingModeQuery()>
	//   12   26:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   14   32:invokevirtual   #50  <Method String getQueryString(String)>
	//   15   35:areturn         
	}

	private static final long serialVersionUID = 1L;
	private ClickOrigin clickOrigin;
}
