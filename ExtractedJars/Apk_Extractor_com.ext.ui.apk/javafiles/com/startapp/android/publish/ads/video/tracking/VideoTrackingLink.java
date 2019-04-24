// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;

import java.io.Serializable;

public abstract class VideoTrackingLink
	implements Serializable
{
	public static final class TrackingSource extends Enum
	{

		public static TrackingSource valueOf(String s)
		{
			return (TrackingSource)Enum.valueOf(com/startapp/android/publish/ads/video/tracking/VideoTrackingLink$TrackingSource, s);
		//    0    0:ldc1            #2   <Class VideoTrackingLink$TrackingSource>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class VideoTrackingLink$TrackingSource>
		//    4    9:areturn         
		}

		public static TrackingSource[] values()
		{
			return (TrackingSource[])((TrackingSource []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field VideoTrackingLink$TrackingSource[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.ads.video.tracking.VideoTrackingLink$TrackingSource_3B_.clone()>
		//    2    6:checkcast       #38  <Class VideoTrackingLink$TrackingSource[]>
		//    3    9:areturn         
		}

		private static final TrackingSource $VALUES[];
		public static final TrackingSource EXTERNAL;
		public static final TrackingSource STARTAPP;

		static 
		{
			STARTAPP = new TrackingSource("STARTAPP", 0);
		//    0    0:new             #2   <Class VideoTrackingLink$TrackingSource>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "STARTAPP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void VideoTrackingLink$TrackingSource(String, int)>
		//    5   10:putstatic       #22  <Field VideoTrackingLink$TrackingSource STARTAPP>
			EXTERNAL = new TrackingSource("EXTERNAL", 1);
		//    6   13:new             #2   <Class VideoTrackingLink$TrackingSource>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "EXTERNAL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void VideoTrackingLink$TrackingSource(String, int)>
		//   11   23:putstatic       #25  <Field VideoTrackingLink$TrackingSource EXTERNAL>
			$VALUES = (new TrackingSource[] {
				STARTAPP, EXTERNAL
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       TrackingSource[]
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

		private TrackingSource(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public VideoTrackingLink()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public String getReplayParameter()
	{
		return replayParameter;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String replayParameter>
	//    2    4:areturn         
	}

	public TrackingSource getTrackingSource()
	{
		return trackingSource;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field VideoTrackingLink$TrackingSource trackingSource>
	//    2    4:areturn         
	}

	public String getTrackingUrl()
	{
		return trackingUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String trackingUrl>
	//    2    4:areturn         
	}

	public void setTrackingUrl(String s)
	{
		trackingUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String trackingUrl>
	//    3    5:return          
	}

	public boolean shouldAppendReplay()
	{
		return appendReplayParameter;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean appendReplayParameter>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("trackingSource=").append(((Object) (trackingSource))).append(", trackingUrl=").append(trackingUrl).append(", replayParameter=").append(replayParameter).append(", appendReplayParameter=").append(appendReplayParameter).toString();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:ldc1            #50  <String "trackingSource=">
	//    4    9:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #35  <Field VideoTrackingLink$TrackingSource trackingSource>
	//    7   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #59  <String ", trackingUrl=">
	//    9   21:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #38  <Field String trackingUrl>
	//   12   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #61  <String ", replayParameter=">
	//   14   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #31  <Field String replayParameter>
	//   17   40:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc1            #63  <String ", appendReplayParameter=">
	//   19   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #44  <Field boolean appendReplayParameter>
	//   22   52:invokevirtual   #66  <Method StringBuilder StringBuilder.append(boolean)>
	//   23   55:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   24   58:areturn         
	}

	private static final long serialVersionUID = 1L;
	private boolean appendReplayParameter;
	private String replayParameter;
	private TrackingSource trackingSource;
	private String trackingUrl;
}
