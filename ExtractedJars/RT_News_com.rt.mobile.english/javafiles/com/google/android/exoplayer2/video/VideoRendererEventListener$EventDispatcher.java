// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoRendererEventListener

public static final class VideoRendererEventListener$EventDispatcher
{

	public void decoderInitialized(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          27
			handler.post(new Runnable() {

				public void run()
				{
					listener.onVideoDecoderInitialized(decoderName, initializedTimestampMs, initializationDurationMs);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #40  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field String val$decoderName>
				//    5   11:aload_0         
				//    6   12:getfield        #29  <Field long val$initializedTimestampMs>
				//    7   15:aload_0         
				//    8   16:getfield        #31  <Field long val$initializationDurationMs>
				//    9   19:invokeinterface #43  <Method void VideoRendererEventListener.onVideoDecoderInitialized(String, long, long)>
				//   10   24:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final String val$decoderName;
				final long val$initializationDurationMs;
				final long val$initializedTimestampMs;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field VideoRendererEventListener$EventDispatcher this$0>
				decoderName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String val$decoderName>
				initializedTimestampMs = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #29  <Field long val$initializedTimestampMs>
				initializationDurationMs = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #31  <Field long val$initializationDurationMs>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #11  <Class VideoRendererEventListener$EventDispatcher$2>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:lload           4
	//   11   20:invokespecial   #52  <Method void VideoRendererEventListener$EventDispatcher$2(VideoRendererEventListener$EventDispatcher, String, long, long)>
	//   12   23:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   13   26:pop             
	//   14   27:return          
	}

	public void disabled(final DecoderCounters counters)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					counters.ensureUpdated();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field DecoderCounters val$counters>
				//    2    4:invokevirtual   #34  <Method void DecoderCounters.ensureUpdated()>
					listener.onVideoDisabled(counters);
				//    3    7:aload_0         
				//    4    8:getfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    5   11:invokestatic    #38  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    6   14:aload_0         
				//    7   15:getfield        #24  <Field DecoderCounters val$counters>
				//    8   18:invokeinterface #41  <Method void VideoRendererEventListener.onVideoDisabled(DecoderCounters)>
				//    9   23:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final DecoderCounters val$counters;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				counters = decodercounters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DecoderCounters val$counters>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #21  <Class VideoRendererEventListener$EventDispatcher$7>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #61  <Method void VideoRendererEventListener$EventDispatcher$7(VideoRendererEventListener$EventDispatcher, DecoderCounters)>
	//   10   20:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void droppedFrames(final int droppedFrameCount, final long elapsedMs)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          25
			handler.post(new Runnable() {

				public void run()
				{
					listener.onDroppedFrames(droppedFrameCount, elapsedMs);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #37  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #26  <Field int val$droppedFrameCount>
				//    5   11:aload_0         
				//    6   12:getfield        #28  <Field long val$elapsedMs>
				//    7   15:invokeinterface #40  <Method void VideoRendererEventListener.onDroppedFrames(int, long)>
				//    8   20:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final int val$droppedFrameCount;
				final long val$elapsedMs;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field VideoRendererEventListener$EventDispatcher this$0>
				droppedFrameCount = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #26  <Field int val$droppedFrameCount>
				elapsedMs = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #28  <Field long val$elapsedMs>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #15  <Class VideoRendererEventListener$EventDispatcher$4>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:lload_2         
	//   10   18:invokespecial   #66  <Method void VideoRendererEventListener$EventDispatcher$4(VideoRendererEventListener$EventDispatcher, int, long)>
	//   11   21:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   12   24:pop             
	//   13   25:return          
	}

	public void enabled(final DecoderCounters decoderCounters)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					listener.onVideoEnabled(decoderCounters);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #33  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field DecoderCounters val$decoderCounters>
				//    5   11:invokeinterface #36  <Method void VideoRendererEventListener.onVideoEnabled(DecoderCounters)>
				//    6   16:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final DecoderCounters val$decoderCounters;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				decoderCounters = decodercounters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DecoderCounters val$decoderCounters>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #9   <Class VideoRendererEventListener$EventDispatcher$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #68  <Method void VideoRendererEventListener$EventDispatcher$1(VideoRendererEventListener$EventDispatcher, DecoderCounters)>
	//   10   20:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void inputFormatChanged(final Format format)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					listener.onVideoInputFormatChanged(format);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #33  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field Format val$format>
				//    5   11:invokeinterface #36  <Method void VideoRendererEventListener.onVideoInputFormatChanged(Format)>
				//    6   16:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final Format val$format;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				format = format1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Format val$format>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #13  <Class VideoRendererEventListener$EventDispatcher$3>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #73  <Method void VideoRendererEventListener$EventDispatcher$3(VideoRendererEventListener$EventDispatcher, Format)>
	//   10   20:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void renderedFirstFrame(final Surface surface)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					listener.onRenderedFirstFrame(surface);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #33  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field Surface val$surface>
				//    5   11:invokeinterface #36  <Method void VideoRendererEventListener.onRenderedFirstFrame(Surface)>
				//    6   16:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final Surface val$surface;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
				surface = surface1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Surface val$surface>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #19  <Class VideoRendererEventListener$EventDispatcher$6>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #78  <Method void VideoRendererEventListener$EventDispatcher$6(VideoRendererEventListener$EventDispatcher, Surface)>
	//   10   20:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void videoSizeChanged(final int width, final int height, final int unappliedRotationDegrees, final float pixelWidthHeightRatio)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//*   2    4:ifnull          28
			handler.post(new Runnable() {

				public void run()
				{
					listener.onVideoSizeChanged(width, height, unappliedRotationDegrees, pixelWidthHeightRatio);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field VideoRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #43  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #28  <Field int val$width>
				//    5   11:aload_0         
				//    6   12:getfield        #30  <Field int val$height>
				//    7   15:aload_0         
				//    8   16:getfield        #32  <Field int val$unappliedRotationDegrees>
				//    9   19:aload_0         
				//   10   20:getfield        #34  <Field float val$pixelWidthHeightRatio>
				//   11   23:invokeinterface #46  <Method void VideoRendererEventListener.onVideoSizeChanged(int, int, int, float)>
				//   12   28:return          
				}

				final VideoRendererEventListener.EventDispatcher this$0;
				final int val$height;
				final float val$pixelWidthHeightRatio;
				final int val$unappliedRotationDegrees;
				final int val$width;

			
			{
				this$0 = VideoRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field VideoRendererEventListener$EventDispatcher this$0>
				width = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #28  <Field int val$width>
				height = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #30  <Field int val$height>
				unappliedRotationDegrees = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field int val$unappliedRotationDegrees>
				pixelWidthHeightRatio = f;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #34  <Field float val$pixelWidthHeightRatio>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Handler handler>
	//    5   11:new             #17  <Class VideoRendererEventListener$EventDispatcher$5>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:fload           4
	//   12   21:invokespecial   #83  <Method void VideoRendererEventListener$EventDispatcher$5(VideoRendererEventListener$EventDispatcher, int, int, int, float)>
	//   13   24:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   14   27:pop             
	//   15   28:return          
	}

	private final Handler handler;
	private final VideoRendererEventListener listener;


/*
	static VideoRendererEventListener access$000(VideoRendererEventListener$EventDispatcher videorenderereventlistener$eventdispatcher)
	{
		return videorenderereventlistener$eventdispatcher.listener;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field VideoRendererEventListener listener>
	//    2    4:areturn         
	}

*/

	public VideoRendererEventListener$EventDispatcher(Handler handler1, VideoRendererEventListener videorenderereventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		if(videorenderereventlistener != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			handler1 = (Handler)Assertions.checkNotNull(((Object) (handler1)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #37  <Method Object Assertions.checkNotNull(Object)>
	//    6   12:checkcast       #39  <Class Handler>
	//    7   15:astore_1        
		else
	//*   8   16:goto            21
			handler1 = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		handler = handler1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #41  <Field Handler handler>
		listener = videorenderereventlistener;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #43  <Field VideoRendererEventListener listener>
	//   17   31:return          
	}
}
