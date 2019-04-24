// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;


// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			VideoTrackingParams

public class VideoPausedTrackingParams extends VideoTrackingParams
{
	public static final class PauseOrigin extends Enum
	{

		public static PauseOrigin valueOf(String s)
		{
			return (PauseOrigin)Enum.valueOf(com/startapp/android/publish/ads/video/tracking/VideoPausedTrackingParams$PauseOrigin, s);
		//    0    0:ldc1            #2   <Class VideoPausedTrackingParams$PauseOrigin>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class VideoPausedTrackingParams$PauseOrigin>
		//    4    9:areturn         
		}

		public static PauseOrigin[] values()
		{
			return (PauseOrigin[])((PauseOrigin []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field VideoPausedTrackingParams$PauseOrigin[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.ads.video.tracking.VideoPausedTrackingParams$PauseOrigin_3B_.clone()>
		//    2    6:checkcast       #38  <Class VideoPausedTrackingParams$PauseOrigin[]>
		//    3    9:areturn         
		}

		private static final PauseOrigin $VALUES[];
		public static final PauseOrigin EXTERNAL;
		public static final PauseOrigin INAPP;

		static 
		{
			INAPP = new PauseOrigin("INAPP", 0);
		//    0    0:new             #2   <Class VideoPausedTrackingParams$PauseOrigin>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "INAPP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void VideoPausedTrackingParams$PauseOrigin(String, int)>
		//    5   10:putstatic       #22  <Field VideoPausedTrackingParams$PauseOrigin INAPP>
			EXTERNAL = new PauseOrigin("EXTERNAL", 1);
		//    6   13:new             #2   <Class VideoPausedTrackingParams$PauseOrigin>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "EXTERNAL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void VideoPausedTrackingParams$PauseOrigin(String, int)>
		//   11   23:putstatic       #25  <Field VideoPausedTrackingParams$PauseOrigin EXTERNAL>
			$VALUES = (new PauseOrigin[] {
				INAPP, EXTERNAL
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       PauseOrigin[]
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

		private PauseOrigin(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public VideoPausedTrackingParams(String s, int i, int j, int k, PauseOrigin pauseorigin, String s1)
	{
		super(s, i, j, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           6
	//    5    6:invokespecial   #20  <Method void VideoTrackingParams(String, int, int, String)>
		pauseNum = k;
	//    6    9:aload_0         
	//    7   10:iload           4
	//    8   12:putfield        #22  <Field int pauseNum>
		pauseOrigin = pauseorigin;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #24  <Field VideoPausedTrackingParams$PauseOrigin pauseOrigin>
	//   12   21:return          
	}

	private String getPauseNumQuery()
	{
		return (new StringBuilder()).append("&pn=").append(getPauseNum()).toString();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:ldc1            #34  <String "&pn=">
	//    4    9:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #42  <Method int getPauseNum()>
	//    7   16:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private String getPauseOriginQuery()
	{
		return (new StringBuilder()).append("&po=").append(getPauseOrigin().toString()).toString();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:ldc1            #51  <String "&po=">
	//    4    9:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #55  <Method VideoPausedTrackingParams$PauseOrigin getPauseOrigin()>
	//    7   16:invokevirtual   #56  <Method String VideoPausedTrackingParams$PauseOrigin.toString()>
	//    8   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	public int getPauseNum()
	{
		return pauseNum;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int pauseNum>
	//    2    4:ireturn         
	}

	public PauseOrigin getPauseOrigin()
	{
		return pauseOrigin;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field VideoPausedTrackingParams$PauseOrigin pauseOrigin>
	//    2    4:areturn         
	}

	public String getQueryString()
	{
		return getQueryString((new StringBuilder()).append(getCompletedQuery()).append(getPauseOriginQuery()).append(getPauseNumQuery()).append(getVideoPlayingModeQuery()).toString());
	//    0    0:aload_0         
	//    1    1:new             #29  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #32  <Method void StringBuilder()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #60  <Method String getCompletedQuery()>
	//    6   12:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:invokespecial   #62  <Method String getPauseOriginQuery()>
	//    9   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_0         
	//   11   23:invokespecial   #64  <Method String getPauseNumQuery()>
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #67  <Method String getVideoPlayingModeQuery()>
	//   15   33:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   17   39:invokevirtual   #70  <Method String getQueryString(String)>
	//   18   42:areturn         
	}

	private static final long serialVersionUID = 1L;
	private int pauseNum;
	private PauseOrigin pauseOrigin;
}
