// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.content.Context;
import android.media.*;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.drm.DrmSessionManager;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.TraceUtil;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecTrackRenderer, VideoFrameReleaseTimeHelper, ExoPlaybackException, MediaFormat, 
//			CodecCounters, MediaCodecSelector, MediaFormatHolder, SampleSource

public class MediaCodecVideoTrackRenderer extends MediaCodecTrackRenderer
{
	public static interface EventListener
		extends MediaCodecTrackRenderer.EventListener
	{

		public abstract void onDrawnToSurface(Surface surface1);

		public abstract void onDroppedFrames(int i, long l);

		public abstract void onVideoSizeChanged(int i, int j, int k, float f);
	}


	public MediaCodecVideoTrackRenderer(Context context, SampleSource samplesource, MediaCodecSelector mediacodecselector, int i)
	{
		this(context, samplesource, mediacodecselector, i, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:lconst_0        
	//    6    7:invokespecial   #65  <Method void MediaCodecVideoTrackRenderer(Context, SampleSource, MediaCodecSelector, int, long)>
	//    7   10:return          
	}

	public MediaCodecVideoTrackRenderer(Context context, SampleSource samplesource, MediaCodecSelector mediacodecselector, int i, long l)
	{
		this(context, samplesource, mediacodecselector, i, l, ((Handler) (null)), ((EventListener) (null)), -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:lload           5
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:iconst_m1       
	//    9   11:invokespecial   #69  <Method void MediaCodecVideoTrackRenderer(Context, SampleSource, MediaCodecSelector, int, long, Handler, MediaCodecVideoTrackRenderer$EventListener, int)>
	//   10   14:return          
	}

	public MediaCodecVideoTrackRenderer(Context context, SampleSource samplesource, MediaCodecSelector mediacodecselector, int i, long l, Handler handler, 
			EventListener eventlistener, int j)
	{
		this(context, samplesource, mediacodecselector, i, l, ((DrmSessionManager) (null)), false, handler, eventlistener, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:lload           5
	//    6    8:aconst_null     
	//    7    9:iconst_0        
	//    8   10:aload           7
	//    9   12:aload           8
	//   10   14:iload           9
	//   11   16:invokespecial   #72  <Method void MediaCodecVideoTrackRenderer(Context, SampleSource, MediaCodecSelector, int, long, DrmSessionManager, boolean, Handler, MediaCodecVideoTrackRenderer$EventListener, int)>
	//   12   19:return          
	}

	public MediaCodecVideoTrackRenderer(Context context, SampleSource samplesource, MediaCodecSelector mediacodecselector, int i, long l, DrmSessionManager drmsessionmanager, 
			boolean flag, Handler handler, EventListener eventlistener, int j)
	{
		super(samplesource, mediacodecselector, drmsessionmanager, flag, handler, ((MediaCodecTrackRenderer.EventListener) (eventlistener)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           7
	//    4    5:iload           8
	//    5    7:aload           9
	//    6    9:aload           10
	//    7   11:invokespecial   #75  <Method void MediaCodecTrackRenderer(SampleSource, MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecTrackRenderer$EventListener)>
		frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(context);
	//    8   14:aload_0         
	//    9   15:new             #77  <Class VideoFrameReleaseTimeHelper>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #80  <Method void VideoFrameReleaseTimeHelper(Context)>
	//   13   23:putfield        #82  <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
		videoScalingMode = i;
	//   14   26:aload_0         
	//   15   27:iload           4
	//   16   29:putfield        #84  <Field int videoScalingMode>
		allowedJoiningTimeUs = 1000L * l;
	//   17   32:aload_0         
	//   18   33:ldc2w           #85  <Long 1000L>
	//   19   36:lload           5
	//   20   38:lmul            
	//   21   39:putfield        #88  <Field long allowedJoiningTimeUs>
		eventListener = eventlistener;
	//   22   42:aload_0         
	//   23   43:aload           10
	//   24   45:putfield        #90  <Field MediaCodecVideoTrackRenderer$EventListener eventListener>
		maxDroppedFrameCountToNotify = j;
	//   25   48:aload_0         
	//   26   49:iload           11
	//   27   51:putfield        #92  <Field int maxDroppedFrameCountToNotify>
		joiningDeadlineUs = -1L;
	//   28   54:aload_0         
	//   29   55:ldc2w           #93  <Long -1L>
	//   30   58:putfield        #96  <Field long joiningDeadlineUs>
		currentWidth = -1;
	//   31   61:aload_0         
	//   32   62:iconst_m1       
	//   33   63:putfield        #98  <Field int currentWidth>
		currentHeight = -1;
	//   34   66:aload_0         
	//   35   67:iconst_m1       
	//   36   68:putfield        #100 <Field int currentHeight>
		currentPixelWidthHeightRatio = -1F;
	//   37   71:aload_0         
	//   38   72:ldc1            #101 <Float -1F>
	//   39   74:putfield        #103 <Field float currentPixelWidthHeightRatio>
		pendingPixelWidthHeightRatio = -1F;
	//   40   77:aload_0         
	//   41   78:ldc1            #101 <Float -1F>
	//   42   80:putfield        #105 <Field float pendingPixelWidthHeightRatio>
		lastReportedWidth = -1;
	//   43   83:aload_0         
	//   44   84:iconst_m1       
	//   45   85:putfield        #107 <Field int lastReportedWidth>
		lastReportedHeight = -1;
	//   46   88:aload_0         
	//   47   89:iconst_m1       
	//   48   90:putfield        #109 <Field int lastReportedHeight>
		lastReportedPixelWidthHeightRatio = -1F;
	//   49   93:aload_0         
	//   50   94:ldc1            #101 <Float -1F>
	//   51   96:putfield        #111 <Field float lastReportedPixelWidthHeightRatio>
	//   52   99:return          
	}

	private void maybeNotifyDrawnToSurface()
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Handler eventHandler>
	//*   2    4:ifnull          50
	//*   3    7:aload_0         
	//*   4    8:getfield        #90  <Field MediaCodecVideoTrackRenderer$EventListener eventListener>
	//*   5   11:ifnull          50
		{
			if(reportedDrawnToSurface)
	//*   6   14:aload_0         
	//*   7   15:getfield        #123 <Field boolean reportedDrawnToSurface>
	//*   8   18:ifeq            22
			{
				return;
	//    9   21:return          
			} else
			{
				final Surface surface = this.surface;
	//   10   22:aload_0         
	//   11   23:getfield        #125 <Field Surface surface>
	//   12   26:astore_1        
				eventHandler.post(new Runnable() {

					public void run()
					{
						eventListener.onDrawnToSurface(surface);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field MediaCodecVideoTrackRenderer this$0>
					//    2    4:invokestatic    #29  <Method MediaCodecVideoTrackRenderer$EventListener MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer)>
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field Surface val$surface>
					//    5   11:invokeinterface #35  <Method void MediaCodecVideoTrackRenderer$EventListener.onDrawnToSurface(Surface)>
					//    6   16:return          
					}

					final MediaCodecVideoTrackRenderer this$0;
					final Surface val$surface;

			
			{
				this$0 = MediaCodecVideoTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaCodecVideoTrackRenderer this$0>
				surface = surface1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Surface val$surface>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   13   27:aload_0         
	//   14   28:getfield        #121 <Field Handler eventHandler>
	//   15   31:new             #8   <Class MediaCodecVideoTrackRenderer$2>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #128 <Method void MediaCodecVideoTrackRenderer$2(MediaCodecVideoTrackRenderer, Surface)>
	//   20   40:invokevirtual   #134 <Method boolean Handler.post(Runnable)>
	//   21   43:pop             
				reportedDrawnToSurface = true;
	//   22   44:aload_0         
	//   23   45:iconst_1        
	//   24   46:putfield        #123 <Field boolean reportedDrawnToSurface>
				return;
	//   25   49:return          
			}
		} else
		{
			return;
	//   26   50:return          
		}
	}

	private void maybeNotifyDroppedFrameCount()
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Handler eventHandler>
	//*   2    4:ifnull          69
	//*   3    7:aload_0         
	//*   4    8:getfield        #90  <Field MediaCodecVideoTrackRenderer$EventListener eventListener>
	//*   5   11:ifnull          69
		{
			if(droppedFrameCount == 0)
	//*   6   14:aload_0         
	//*   7   15:getfield        #137 <Field int droppedFrameCount>
	//*   8   18:ifne            22
			{
				return;
	//    9   21:return          
			} else
			{
				long l = SystemClock.elapsedRealtime();
	//   10   22:invokestatic    #143 <Method long SystemClock.elapsedRealtime()>
	//   11   25:lstore_2        
				final int countToNotify = droppedFrameCount;
	//   12   26:aload_0         
	//   13   27:getfield        #137 <Field int droppedFrameCount>
	//   14   30:istore_1        
				long l1 = droppedFrameAccumulationStartTimeMs;
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field long droppedFrameAccumulationStartTimeMs>
	//   17   35:lstore          4
				eventHandler.post(new Runnable() {

					public void run()
					{
						eventListener.onDroppedFrames(countToNotify, elapsedToNotify);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field MediaCodecVideoTrackRenderer this$0>
					//    2    4:invokestatic    #33  <Method MediaCodecVideoTrackRenderer$EventListener MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer)>
					//    3    7:aload_0         
					//    4    8:getfield        #23  <Field int val$countToNotify>
					//    5   11:aload_0         
					//    6   12:getfield        #25  <Field long val$elapsedToNotify>
					//    7   15:invokeinterface #39  <Method void MediaCodecVideoTrackRenderer$EventListener.onDroppedFrames(int, long)>
					//    8   20:return          
					}

					final MediaCodecVideoTrackRenderer this$0;
					final int val$countToNotify;
					final long val$elapsedToNotify;

			
			{
				this$0 = MediaCodecVideoTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaCodecVideoTrackRenderer this$0>
				countToNotify = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$countToNotify>
				elapsedToNotify = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #25  <Field long val$elapsedToNotify>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   18   37:aload_0         
	//   19   38:getfield        #121 <Field Handler eventHandler>
	//   20   41:new             #10  <Class MediaCodecVideoTrackRenderer$3>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:lload_2         
	//   25   48:lload           4
	//   26   50:lsub            
	//   27   51:invokespecial   #148 <Method void MediaCodecVideoTrackRenderer$3(MediaCodecVideoTrackRenderer, int, long)>
	//   28   54:invokevirtual   #134 <Method boolean Handler.post(Runnable)>
	//   29   57:pop             
				droppedFrameCount = 0;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #137 <Field int droppedFrameCount>
				droppedFrameAccumulationStartTimeMs = l;
	//   33   63:aload_0         
	//   34   64:lload_2         
	//   35   65:putfield        #145 <Field long droppedFrameAccumulationStartTimeMs>
				return;
	//   36   68:return          
			}
		} else
		{
			return;
	//   37   69:return          
		}
	}

	private void maybeNotifyVideoSizeChanged()
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Handler eventHandler>
	//*   2    4:ifnull          124
	//*   3    7:aload_0         
	//*   4    8:getfield        #90  <Field MediaCodecVideoTrackRenderer$EventListener eventListener>
	//*   5   11:ifnull          124
		{
			if(lastReportedWidth == this.currentWidth && lastReportedHeight == this.currentHeight && lastReportedUnappliedRotationDegrees == this.currentUnappliedRotationDegrees && lastReportedPixelWidthHeightRatio == this.currentPixelWidthHeightRatio)
	//*   6   14:aload_0         
	//*   7   15:getfield        #107 <Field int lastReportedWidth>
	//*   8   18:aload_0         
	//*   9   19:getfield        #98  <Field int currentWidth>
	//*  10   22:icmpne          60
	//*  11   25:aload_0         
	//*  12   26:getfield        #109 <Field int lastReportedHeight>
	//*  13   29:aload_0         
	//*  14   30:getfield        #100 <Field int currentHeight>
	//*  15   33:icmpne          60
	//*  16   36:aload_0         
	//*  17   37:getfield        #151 <Field int lastReportedUnappliedRotationDegrees>
	//*  18   40:aload_0         
	//*  19   41:getfield        #153 <Field int currentUnappliedRotationDegrees>
	//*  20   44:icmpne          60
	//*  21   47:aload_0         
	//*  22   48:getfield        #111 <Field float lastReportedPixelWidthHeightRatio>
	//*  23   51:aload_0         
	//*  24   52:getfield        #103 <Field float currentPixelWidthHeightRatio>
	//*  25   55:fcmpl           
	//*  26   56:ifne            60
			{
				return;
	//   27   59:return          
			} else
			{
				final int currentWidth = this.currentWidth;
	//   28   60:aload_0         
	//   29   61:getfield        #98  <Field int currentWidth>
	//   30   64:istore_2        
				final int currentHeight = this.currentHeight;
	//   31   65:aload_0         
	//   32   66:getfield        #100 <Field int currentHeight>
	//   33   69:istore_3        
				final int currentUnappliedRotationDegrees = this.currentUnappliedRotationDegrees;
	//   34   70:aload_0         
	//   35   71:getfield        #153 <Field int currentUnappliedRotationDegrees>
	//   36   74:istore          4
				final float currentPixelWidthHeightRatio = this.currentPixelWidthHeightRatio;
	//   37   76:aload_0         
	//   38   77:getfield        #103 <Field float currentPixelWidthHeightRatio>
	//   39   80:fstore_1        
				eventHandler.post(new Runnable() {

					public void run()
					{
						eventListener.onVideoSizeChanged(currentWidth, currentHeight, currentUnappliedRotationDegrees, currentPixelWidthHeightRatio);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field MediaCodecVideoTrackRenderer this$0>
					//    2    4:invokestatic    #39  <Method MediaCodecVideoTrackRenderer$EventListener MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer)>
					//    3    7:aload_0         
					//    4    8:getfield        #25  <Field int val$currentWidth>
					//    5   11:aload_0         
					//    6   12:getfield        #27  <Field int val$currentHeight>
					//    7   15:aload_0         
					//    8   16:getfield        #29  <Field int val$currentUnappliedRotationDegrees>
					//    9   19:aload_0         
					//   10   20:getfield        #31  <Field float val$currentPixelWidthHeightRatio>
					//   11   23:invokeinterface #45  <Method void MediaCodecVideoTrackRenderer$EventListener.onVideoSizeChanged(int, int, int, float)>
					//   12   28:return          
					}

					final MediaCodecVideoTrackRenderer this$0;
					final int val$currentHeight;
					final float val$currentPixelWidthHeightRatio;
					final int val$currentUnappliedRotationDegrees;
					final int val$currentWidth;

			
			{
				this$0 = MediaCodecVideoTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field MediaCodecVideoTrackRenderer this$0>
				currentWidth = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int val$currentWidth>
				currentHeight = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$currentHeight>
				currentUnappliedRotationDegrees = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int val$currentUnappliedRotationDegrees>
				currentPixelWidthHeightRatio = f;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #31  <Field float val$currentPixelWidthHeightRatio>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void Object()>
			//   17   31:return          
			}
				}
);
	//   40   81:aload_0         
	//   41   82:getfield        #121 <Field Handler eventHandler>
	//   42   85:new             #6   <Class MediaCodecVideoTrackRenderer$1>
	//   43   88:dup             
	//   44   89:aload_0         
	//   45   90:iload_2         
	//   46   91:iload_3         
	//   47   92:iload           4
	//   48   94:fload_1         
	//   49   95:invokespecial   #156 <Method void MediaCodecVideoTrackRenderer$1(MediaCodecVideoTrackRenderer, int, int, int, float)>
	//   50   98:invokevirtual   #134 <Method boolean Handler.post(Runnable)>
	//   51  101:pop             
				lastReportedWidth = currentWidth;
	//   52  102:aload_0         
	//   53  103:iload_2         
	//   54  104:putfield        #107 <Field int lastReportedWidth>
				lastReportedHeight = currentHeight;
	//   55  107:aload_0         
	//   56  108:iload_3         
	//   57  109:putfield        #109 <Field int lastReportedHeight>
				lastReportedUnappliedRotationDegrees = currentUnappliedRotationDegrees;
	//   58  112:aload_0         
	//   59  113:iload           4
	//   60  115:putfield        #151 <Field int lastReportedUnappliedRotationDegrees>
				lastReportedPixelWidthHeightRatio = currentPixelWidthHeightRatio;
	//   61  118:aload_0         
	//   62  119:fload_1         
	//   63  120:putfield        #111 <Field float lastReportedPixelWidthHeightRatio>
				return;
	//   64  123:return          
			}
		} else
		{
			return;
	//   65  124:return          
		}
	}

	private void maybeSetMaxInputSize(MediaFormat mediaformat, boolean flag)
	{
		if(mediaformat.containsKey("max-input-size"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #162 <String "max-input-size">
	//*   2    3:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*   3    6:ifeq            10
			return;
	//    4    9:return          
		int i = mediaformat.getInteger("height");
	//    5   10:aload_1         
	//    6   11:ldc1            #170 <String "height">
	//    7   13:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//    8   16:istore_3        
		int j = i;
	//    9   17:iload_3         
	//   10   18:istore          4
		if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            48
		{
			j = i;
	//   13   24:iload_3         
	//   14   25:istore          4
			if(mediaformat.containsKey("max-height"))
	//*  15   27:aload_1         
	//*  16   28:ldc1            #176 <String "max-height">
	//*  17   30:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*  18   33:ifeq            48
				j = Math.max(i, mediaformat.getInteger("max-height"));
	//   19   36:iload_3         
	//   20   37:aload_1         
	//   21   38:ldc1            #176 <String "max-height">
	//   22   40:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   23   43:invokestatic    #182 <Method int Math.max(int, int)>
	//   24   46:istore          4
		}
		i = mediaformat.getInteger("width");
	//   25   48:aload_1         
	//   26   49:ldc1            #184 <String "width">
	//   27   51:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   28   54:istore_3        
		int k = i;
	//   29   55:iload_3         
	//   30   56:istore          5
		if(flag)
	//*  31   58:iload_2         
	//*  32   59:ifeq            87
		{
			k = i;
	//   33   62:iload_3         
	//   34   63:istore          5
			if(mediaformat.containsKey("max-width"))
	//*  35   65:aload_1         
	//*  36   66:ldc1            #186 <String "max-width">
	//*  37   68:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*  38   71:ifeq            87
				k = Math.max(j, mediaformat.getInteger("max-width"));
	//   39   74:iload           4
	//   40   76:aload_1         
	//   41   77:ldc1            #186 <String "max-width">
	//   42   79:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   43   82:invokestatic    #182 <Method int Math.max(int, int)>
	//   44   85:istore          5
		}
		String s = mediaformat.getString("mime");
	//   45   87:aload_1         
	//   46   88:ldc1            #188 <String "mime">
	//   47   90:invokevirtual   #192 <Method String MediaFormat.getString(String)>
	//   48   93:astore          8
		i = -1;
	//   49   95:iconst_m1       
	//   50   96:istore_3        
		int l = s.hashCode();
	//   51   97:aload           8
	//   52   99:invokevirtual   #198 <Method int String.hashCode()>
	//   53  102:istore          7
		byte byte0 = 4;
	//   54  104:iconst_4        
	//   55  105:istore          6
		switch(l)
	//*  56  107:iload           7
		{
	//*  57  109:lookupswitch    6: default 168
	//	               -1664118616: 246
	//	               -1662541442: 231
	//	               1187890754: 216
	//	               1331836730: 201
	//	               1599127256: 186
	//	               1599127257: 171
	//*  58  168:goto            258
		case 1599127257: 
			if(s.equals("video/x-vnd.on2.vp9"))
	//*  59  171:aload           8
	//*  60  173:ldc1            #200 <String "video/x-vnd.on2.vp9">
	//*  61  175:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  62  178:ifeq            258
				i = 5;
	//   63  181:iconst_5        
	//   64  182:istore_3        
			break;

	//*  65  183:goto            258
		case 1599127256: 
			if(s.equals("video/x-vnd.on2.vp8"))
	//*  66  186:aload           8
	//*  67  188:ldc1            #206 <String "video/x-vnd.on2.vp8">
	//*  68  190:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  69  193:ifeq            258
				i = 3;
	//   70  196:iconst_3        
	//   71  197:istore_3        
			break;

	//*  72  198:goto            258
		case 1331836730: 
			if(s.equals("video/avc"))
	//*  73  201:aload           8
	//*  74  203:ldc1            #208 <String "video/avc">
	//*  75  205:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  76  208:ifeq            258
				i = 2;
	//   77  211:iconst_2        
	//   78  212:istore_3        
			break;

	//*  79  213:goto            258
		case 1187890754: 
			if(s.equals("video/mp4v-es"))
	//*  80  216:aload           8
	//*  81  218:ldc1            #210 <String "video/mp4v-es">
	//*  82  220:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  83  223:ifeq            258
				i = 1;
	//   84  226:iconst_1        
	//   85  227:istore_3        
			break;

	//*  86  228:goto            258
		case -1662541442: 
			if(s.equals("video/hevc"))
	//*  87  231:aload           8
	//*  88  233:ldc1            #212 <String "video/hevc">
	//*  89  235:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  90  238:ifeq            258
				i = 4;
	//   91  241:iconst_4        
	//   92  242:istore_3        
			break;

	//*  93  243:goto            258
		case -1664118616: 
			if(s.equals("video/3gpp"))
	//*  94  246:aload           8
	//*  95  248:ldc1            #214 <String "video/3gpp">
	//*  96  250:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  97  253:ifeq            258
				i = 0;
	//   98  256:iconst_0        
	//   99  257:istore_3        
			break;
		}
		switch(i)
	//* 100  258:iload_3         
		{
	//* 101  259:tableswitch     0 5: default 296
	//	               0 364
	//	               1 364
	//	               2 322
	//	               3 310
	//	               4 297
	//	               5 297
		default:
			return;
	//  102  296:return          

		case 4: // '\004'
		case 5: // '\005'
			i = k * j;
	//  103  297:iload           5
	//  104  299:iload           4
	//  105  301:imul            
	//  106  302:istore_3        
			j = ((int) (byte0));
	//  107  303:iload           6
	//  108  305:istore          4
			break;
	//  109  307:goto            373

		case 3: // '\003'
			i = k * j;
	//  110  310:iload           5
	//  111  312:iload           4
	//  112  314:imul            
	//  113  315:istore_3        
			j = 2;
	//  114  316:iconst_2        
	//  115  317:istore          4
			break;
	//  116  319:goto            373

		case 2: // '\002'
			if("BRAVIA 4K 2015".equals(((Object) (Util.MODEL))))
	//* 117  322:ldc1            #216 <String "BRAVIA 4K 2015">
	//* 118  324:getstatic       #221 <Field String Util.MODEL>
	//* 119  327:invokevirtual   #204 <Method boolean String.equals(Object)>
	//* 120  330:ifeq            334
				return;
	//  121  333:return          
			i = ((k + 15) / 16) * ((j + 15) / 16) * 16 * 16;
	//  122  334:iload           5
	//  123  336:bipush          15
	//  124  338:iadd            
	//  125  339:bipush          16
	//  126  341:idiv            
	//  127  342:iload           4
	//  128  344:bipush          15
	//  129  346:iadd            
	//  130  347:bipush          16
	//  131  349:idiv            
	//  132  350:imul            
	//  133  351:bipush          16
	//  134  353:imul            
	//  135  354:bipush          16
	//  136  356:imul            
	//  137  357:istore_3        
			j = 2;
	//  138  358:iconst_2        
	//  139  359:istore          4
			break;

	//* 140  361:goto            373
		case 0: // '\0'
		case 1: // '\001'
			i = k * j;
	//  141  364:iload           5
	//  142  366:iload           4
	//  143  368:imul            
	//  144  369:istore_3        
			j = 2;
	//  145  370:iconst_2        
	//  146  371:istore          4
			break;
		}
		mediaformat.setInteger("max-input-size", (i * 3) / (j * 2));
	//  147  373:aload_1         
	//  148  374:ldc1            #162 <String "max-input-size">
	//  149  376:iload_3         
	//  150  377:iconst_3        
	//  151  378:imul            
	//  152  379:iload           4
	//  153  381:iconst_2        
	//  154  382:imul            
	//  155  383:idiv            
	//  156  384:invokevirtual   #225 <Method void MediaFormat.setInteger(String, int)>
	//  157  387:return          
	}

	private void setSurface(Surface surface1)
		throws ExoPlaybackException
	{
		if(surface == surface1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field Surface surface>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		surface = surface1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #125 <Field Surface surface>
		reportedDrawnToSurface = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #123 <Field boolean reportedDrawnToSurface>
		int i = getState();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #233 <Method int getState()>
	//   13   23:istore_2        
		if(i == 2 || i == 3)
	//*  14   24:iload_2         
	//*  15   25:iconst_2        
	//*  16   26:icmpeq          34
	//*  17   29:iload_2         
	//*  18   30:iconst_3        
	//*  19   31:icmpne          42
		{
			releaseCodec();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #236 <Method void releaseCodec()>
			maybeInitCodec();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #239 <Method void maybeInitCodec()>
		}
	//   24   42:return          
	}

	protected boolean canReconfigureCodec(MediaCodec mediacodec, boolean flag, com.google.android.exoplayer.MediaFormat mediaformat, com.google.android.exoplayer.MediaFormat mediaformat1)
	{
		return mediaformat1.mimeType.equals(((Object) (mediaformat.mimeType))) && (flag || mediaformat.width == mediaformat1.width && mediaformat.height == mediaformat1.height);
	//    0    0:aload           4
	//    1    2:getfield        #247 <Field String MediaFormat.mimeType>
	//    2    5:aload_3         
	//    3    6:getfield        #247 <Field String MediaFormat.mimeType>
	//    4    9:invokevirtual   #204 <Method boolean String.equals(Object)>
	//    5   12:ifeq            45
	//    6   15:iload_2         
	//    7   16:ifne            43
	//    8   19:aload_3         
	//    9   20:getfield        #249 <Field int MediaFormat.width>
	//   10   23:aload           4
	//   11   25:getfield        #249 <Field int MediaFormat.width>
	//   12   28:icmpne          45
	//   13   31:aload_3         
	//   14   32:getfield        #251 <Field int MediaFormat.height>
	//   15   35:aload           4
	//   16   37:getfield        #251 <Field int MediaFormat.height>
	//   17   40:icmpne          45
	//   18   43:iconst_1        
	//   19   44:ireturn         
	//   20   45:iconst_0        
	//   21   46:ireturn         
	}

	protected void configureCodec(MediaCodec mediacodec, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
	{
		maybeSetMaxInputSize(mediaformat, flag);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:iload_2         
	//    3    3:invokespecial   #255 <Method void maybeSetMaxInputSize(MediaFormat, boolean)>
		mediacodec.configure(mediaformat, surface, mediacrypto, 0);
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:aload_0         
	//    7    9:getfield        #125 <Field Surface surface>
	//    8   12:aload           4
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #261 <Method void MediaCodec.configure(MediaFormat, Surface, MediaCrypto, int)>
	//   11   18:return          
	}

	protected void dropOutputBuffer(MediaCodec mediacodec, int i)
	{
		TraceUtil.beginSection("dropVideoBuffer");
	//    0    0:ldc2            #265 <String "dropVideoBuffer">
	//    1    3:invokestatic    #271 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, false);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #275 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		TraceUtil.endSection();
	//    6   12:invokestatic    #278 <Method void TraceUtil.endSection()>
		mediacodec = ((MediaCodec) (codecCounters));
	//    7   15:aload_0         
	//    8   16:getfield        #282 <Field CodecCounters codecCounters>
	//    9   19:astore_1        
		mediacodec.droppedOutputBufferCount = ((CodecCounters) (mediacodec)).droppedOutputBufferCount + 1;
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:getfield        #287 <Field int CodecCounters.droppedOutputBufferCount>
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:putfield        #287 <Field int CodecCounters.droppedOutputBufferCount>
		droppedFrameCount = droppedFrameCount + 1;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #137 <Field int droppedFrameCount>
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #137 <Field int droppedFrameCount>
		consecutiveDroppedFrameCount = consecutiveDroppedFrameCount + 1;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #289 <Field int consecutiveDroppedFrameCount>
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:putfield        #289 <Field int consecutiveDroppedFrameCount>
		codecCounters.maxConsecutiveDroppedOutputBufferCount = Math.max(consecutiveDroppedFrameCount, codecCounters.maxConsecutiveDroppedOutputBufferCount);
	//   28   50:aload_0         
	//   29   51:getfield        #282 <Field CodecCounters codecCounters>
	//   30   54:aload_0         
	//   31   55:getfield        #289 <Field int consecutiveDroppedFrameCount>
	//   32   58:aload_0         
	//   33   59:getfield        #282 <Field CodecCounters codecCounters>
	//   34   62:getfield        #292 <Field int CodecCounters.maxConsecutiveDroppedOutputBufferCount>
	//   35   65:invokestatic    #182 <Method int Math.max(int, int)>
	//   36   68:putfield        #292 <Field int CodecCounters.maxConsecutiveDroppedOutputBufferCount>
		if(droppedFrameCount == maxDroppedFrameCountToNotify)
	//*  37   71:aload_0         
	//*  38   72:getfield        #137 <Field int droppedFrameCount>
	//*  39   75:aload_0         
	//*  40   76:getfield        #92  <Field int maxDroppedFrameCountToNotify>
	//*  41   79:icmpne          86
			maybeNotifyDroppedFrameCount();
	//   42   82:aload_0         
	//   43   83:invokespecial   #294 <Method void maybeNotifyDroppedFrameCount()>
	//   44   86:return          
	}

	public void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          14
		{
			setSurface((Surface)obj);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:checkcast       #298 <Class Surface>
	//    6   10:invokespecial   #300 <Method void setSurface(Surface)>
			return;
	//    7   13:return          
		} else
		{
			super.handleMessage(i, obj);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #302 <Method void MediaCodecTrackRenderer.handleMessage(int, Object)>
			return;
	//   12   20:return          
		}
	}

	protected boolean handlesTrack(MediaCodecSelector mediacodecselector, com.google.android.exoplayer.MediaFormat mediaformat)
		throws MediaCodecUtil.DecoderQueryException
	{
		boolean flag;
label0:
		{
			mediaformat = ((com.google.android.exoplayer.MediaFormat) (mediaformat.mimeType));
	//    0    0:aload_2         
	//    1    1:getfield        #247 <Field String MediaFormat.mimeType>
	//    2    4:astore_2        
			boolean flag2 = MimeTypes.isVideo(((String) (mediaformat)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #311 <Method boolean MimeTypes.isVideo(String)>
	//    5    9:istore          5
			boolean flag1 = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
			flag = flag1;
	//    8   14:iload           4
	//    9   16:istore_3        
			if(!flag2)
				break label0;
	//   10   17:iload           5
	//   11   19:ifeq            48
			if(!"video/x-unknown".equals(((Object) (mediaformat))))
	//*  12   22:ldc2            #313 <String "video/x-unknown">
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  15   29:ifne            46
			{
				flag = flag1;
	//   16   32:iload           4
	//   17   34:istore_3        
				if(mediacodecselector.getDecoderInfo(((String) (mediaformat)), false) == null)
					break label0;
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:iconst_0        
	//   21   38:invokeinterface #319 <Method DecoderInfo MediaCodecSelector.getDecoderInfo(String, boolean)>
	//   22   43:ifnull          48
			}
			flag = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
		}
		return flag;
	//   25   48:iload_3         
	//   26   49:ireturn         
	}

	protected final boolean haveRenderedFirstFrame()
	{
		return renderedFirstFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field boolean renderedFirstFrame>
	//    2    4:ireturn         
	}

	protected boolean isReady()
	{
		if(super.isReady() && (renderedFirstFrame || !codecInitialized() || getSourceState() == 2))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #326 <Method boolean MediaCodecTrackRenderer.isReady()>
	//*   2    4:ifeq            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #323 <Field boolean renderedFirstFrame>
	//*   5   11:ifne            29
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #329 <Method boolean codecInitialized()>
	//*   8   18:ifeq            29
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #332 <Method int getSourceState()>
	//*  11   25:iconst_2        
	//*  12   26:icmpne          38
		{
			joiningDeadlineUs = -1L;
	//   13   29:aload_0         
	//   14   30:ldc2w           #93  <Long -1L>
	//   15   33:putfield        #96  <Field long joiningDeadlineUs>
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		}
		if(joiningDeadlineUs == -1L)
	//*  18   38:aload_0         
	//*  19   39:getfield        #96  <Field long joiningDeadlineUs>
	//*  20   42:ldc2w           #93  <Long -1L>
	//*  21   45:lcmp            
	//*  22   46:ifne            51
			return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
		if(SystemClock.elapsedRealtime() * 1000L < joiningDeadlineUs)
	//*  25   51:invokestatic    #143 <Method long SystemClock.elapsedRealtime()>
	//*  26   54:ldc2w           #85  <Long 1000L>
	//*  27   57:lmul            
	//*  28   58:aload_0         
	//*  29   59:getfield        #96  <Field long joiningDeadlineUs>
	//*  30   62:lcmp            
	//*  31   63:ifge            68
		{
			return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		} else
		{
			joiningDeadlineUs = -1L;
	//   34   68:aload_0         
	//   35   69:ldc2w           #93  <Long -1L>
	//   36   72:putfield        #96  <Field long joiningDeadlineUs>
			return false;
	//   37   75:iconst_0        
	//   38   76:ireturn         
		}
	}

	protected void onDisabled()
		throws ExoPlaybackException
	{
		currentWidth = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #98  <Field int currentWidth>
		currentHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #100 <Field int currentHeight>
		currentPixelWidthHeightRatio = -1F;
	//    6   10:aload_0         
	//    7   11:ldc1            #101 <Float -1F>
	//    8   13:putfield        #103 <Field float currentPixelWidthHeightRatio>
		pendingPixelWidthHeightRatio = -1F;
	//    9   16:aload_0         
	//   10   17:ldc1            #101 <Float -1F>
	//   11   19:putfield        #105 <Field float pendingPixelWidthHeightRatio>
		lastReportedWidth = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #107 <Field int lastReportedWidth>
		lastReportedHeight = -1;
	//   15   27:aload_0         
	//   16   28:iconst_m1       
	//   17   29:putfield        #109 <Field int lastReportedHeight>
		lastReportedPixelWidthHeightRatio = -1F;
	//   18   32:aload_0         
	//   19   33:ldc1            #101 <Float -1F>
	//   20   35:putfield        #111 <Field float lastReportedPixelWidthHeightRatio>
		frameReleaseTimeHelper.disable();
	//   21   38:aload_0         
	//   22   39:getfield        #82  <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
	//   23   42:invokevirtual   #336 <Method void VideoFrameReleaseTimeHelper.disable()>
		super.onDisabled();
	//   24   45:aload_0         
	//   25   46:invokespecial   #338 <Method void MediaCodecTrackRenderer.onDisabled()>
	//   26   49:return          
	}

	protected void onDiscontinuity(long l)
		throws ExoPlaybackException
	{
		super.onDiscontinuity(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #342 <Method void MediaCodecTrackRenderer.onDiscontinuity(long)>
		renderedFirstFrame = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #323 <Field boolean renderedFirstFrame>
		consecutiveDroppedFrameCount = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #289 <Field int consecutiveDroppedFrameCount>
		joiningDeadlineUs = -1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #93  <Long -1L>
	//   11   19:putfield        #96  <Field long joiningDeadlineUs>
	//   12   22:return          
	}

	protected void onEnabled(int i, long l, boolean flag)
		throws ExoPlaybackException
	{
		super.onEnabled(i, l, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:invokespecial   #346 <Method void MediaCodecTrackRenderer.onEnabled(int, long, boolean)>
		if(flag && allowedJoiningTimeUs > 0L)
	//*   5    8:iload           4
	//*   6   10:ifeq            38
	//*   7   13:aload_0         
	//*   8   14:getfield        #88  <Field long allowedJoiningTimeUs>
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifle            38
			joiningDeadlineUs = SystemClock.elapsedRealtime() * 1000L + allowedJoiningTimeUs;
	//   12   22:aload_0         
	//   13   23:invokestatic    #143 <Method long SystemClock.elapsedRealtime()>
	//   14   26:ldc2w           #85  <Long 1000L>
	//   15   29:lmul            
	//   16   30:aload_0         
	//   17   31:getfield        #88  <Field long allowedJoiningTimeUs>
	//   18   34:ladd            
	//   19   35:putfield        #96  <Field long joiningDeadlineUs>
		frameReleaseTimeHelper.enable();
	//   20   38:aload_0         
	//   21   39:getfield        #82  <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
	//   22   42:invokevirtual   #349 <Method void VideoFrameReleaseTimeHelper.enable()>
	//   23   45:return          
	}

	protected void onInputFormatChanged(MediaFormatHolder mediaformatholder)
		throws ExoPlaybackException
	{
		super.onInputFormatChanged(mediaformatholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #353 <Method void MediaCodecTrackRenderer.onInputFormatChanged(MediaFormatHolder)>
		float f;
		if(mediaformatholder.format.pixelWidthHeightRatio == -1F)
	//*   3    5:aload_1         
	//*   4    6:getfield        #359 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//*   5    9:getfield        #362 <Field float MediaFormat.pixelWidthHeightRatio>
	//*   6   12:ldc1            #101 <Float -1F>
	//*   7   14:fcmpl           
	//*   8   15:ifne            23
			f = 1.0F;
	//    9   18:fconst_1        
	//   10   19:fstore_2        
		else
	//*  11   20:goto            31
			f = mediaformatholder.format.pixelWidthHeightRatio;
	//   12   23:aload_1         
	//   13   24:getfield        #359 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//   14   27:getfield        #362 <Field float MediaFormat.pixelWidthHeightRatio>
	//   15   30:fstore_2        
		pendingPixelWidthHeightRatio = f;
	//   16   31:aload_0         
	//   17   32:fload_2         
	//   18   33:putfield        #105 <Field float pendingPixelWidthHeightRatio>
		int i;
		if(mediaformatholder.format.rotationDegrees == -1)
	//*  19   36:aload_1         
	//*  20   37:getfield        #359 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//*  21   40:getfield        #365 <Field int MediaFormat.rotationDegrees>
	//*  22   43:iconst_m1       
	//*  23   44:icmpne          52
			i = 0;
	//   24   47:iconst_0        
	//   25   48:istore_3        
		else
	//*  26   49:goto            60
			i = mediaformatholder.format.rotationDegrees;
	//   27   52:aload_1         
	//   28   53:getfield        #359 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//   29   56:getfield        #365 <Field int MediaFormat.rotationDegrees>
	//   30   59:istore_3        
		pendingRotationDegrees = i;
	//   31   60:aload_0         
	//   32   61:iload_3         
	//   33   62:putfield        #367 <Field int pendingRotationDegrees>
	//   34   65:return          
	}

	protected void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		boolean flag;
		if(mediaformat.containsKey("crop-right") && mediaformat.containsKey("crop-left") && mediaformat.containsKey("crop-bottom") && mediaformat.containsKey("crop-top"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #26  <String "crop-right">
	//*   2    3:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*   3    6:ifeq            41
	//*   4    9:aload_2         
	//*   5   10:ldc1            #23  <String "crop-left">
	//*   6   12:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*   7   15:ifeq            41
	//*   8   18:aload_2         
	//*   9   19:ldc1            #20  <String "crop-bottom">
	//*  10   21:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*  11   24:ifeq            41
	//*  12   27:aload_2         
	//*  13   28:ldc1            #29  <String "crop-top">
	//*  14   30:invokevirtual   #168 <Method boolean MediaFormat.containsKey(String)>
	//*  15   33:ifeq            41
			flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_3        
		else
	//*  18   38:goto            43
			flag = false;
	//   19   41:iconst_0        
	//   20   42:istore_3        
		int l;
		if(flag)
	//*  21   43:iload_3         
	//*  22   44:ifeq            67
			l = (mediaformat.getInteger("crop-right") - mediaformat.getInteger("crop-left")) + 1;
	//   23   47:aload_2         
	//   24   48:ldc1            #26  <String "crop-right">
	//   25   50:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   26   53:aload_2         
	//   27   54:ldc1            #23  <String "crop-left">
	//   28   56:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   29   59:isub            
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore          4
		else
	//*  33   64:goto            75
			l = mediaformat.getInteger("width");
	//   34   67:aload_2         
	//   35   68:ldc1            #184 <String "width">
	//   36   70:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   37   73:istore          4
		currentWidth = l;
	//   38   75:aload_0         
	//   39   76:iload           4
	//   40   78:putfield        #98  <Field int currentWidth>
		int i;
		if(flag)
	//*  41   81:iload_3         
	//*  42   82:ifeq            104
			i = (mediaformat.getInteger("crop-bottom") - mediaformat.getInteger("crop-top")) + 1;
	//   43   85:aload_2         
	//   44   86:ldc1            #20  <String "crop-bottom">
	//   45   88:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   46   91:aload_2         
	//   47   92:ldc1            #29  <String "crop-top">
	//   48   94:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   49   97:isub            
	//   50   98:iconst_1        
	//   51   99:iadd            
	//   52  100:istore_3        
		else
	//*  53  101:goto            111
			i = mediaformat.getInteger("height");
	//   54  104:aload_2         
	//   55  105:ldc1            #170 <String "height">
	//   56  107:invokevirtual   #174 <Method int MediaFormat.getInteger(String)>
	//   57  110:istore_3        
		currentHeight = i;
	//   58  111:aload_0         
	//   59  112:iload_3         
	//   60  113:putfield        #100 <Field int currentHeight>
		currentPixelWidthHeightRatio = pendingPixelWidthHeightRatio;
	//   61  116:aload_0         
	//   62  117:aload_0         
	//   63  118:getfield        #105 <Field float pendingPixelWidthHeightRatio>
	//   64  121:putfield        #103 <Field float currentPixelWidthHeightRatio>
		if(Util.SDK_INT >= 21)
	//*  65  124:getstatic       #372 <Field int Util.SDK_INT>
	//*  66  127:bipush          21
	//*  67  129:icmplt          181
		{
			int j = pendingRotationDegrees;
	//   68  132:aload_0         
	//   69  133:getfield        #367 <Field int pendingRotationDegrees>
	//   70  136:istore_3        
			if(j == 90 || j == 270)
	//*  71  137:iload_3         
	//*  72  138:bipush          90
	//*  73  140:icmpeq          150
	//*  74  143:iload_3         
	//*  75  144:sipush          270
	//*  76  147:icmpne          189
			{
				int k = currentWidth;
	//   77  150:aload_0         
	//   78  151:getfield        #98  <Field int currentWidth>
	//   79  154:istore_3        
				currentWidth = currentHeight;
	//   80  155:aload_0         
	//   81  156:aload_0         
	//   82  157:getfield        #100 <Field int currentHeight>
	//   83  160:putfield        #98  <Field int currentWidth>
				currentHeight = k;
	//   84  163:aload_0         
	//   85  164:iload_3         
	//   86  165:putfield        #100 <Field int currentHeight>
				currentPixelWidthHeightRatio = 1.0F / currentPixelWidthHeightRatio;
	//   87  168:aload_0         
	//   88  169:fconst_1        
	//   89  170:aload_0         
	//   90  171:getfield        #103 <Field float currentPixelWidthHeightRatio>
	//   91  174:fdiv            
	//   92  175:putfield        #103 <Field float currentPixelWidthHeightRatio>
			}
		} else
	//*  93  178:goto            189
		{
			currentUnappliedRotationDegrees = pendingRotationDegrees;
	//   94  181:aload_0         
	//   95  182:aload_0         
	//   96  183:getfield        #367 <Field int pendingRotationDegrees>
	//   97  186:putfield        #153 <Field int currentUnappliedRotationDegrees>
		}
		mediacodec.setVideoScalingMode(videoScalingMode);
	//   98  189:aload_1         
	//   99  190:aload_0         
	//  100  191:getfield        #84  <Field int videoScalingMode>
	//  101  194:invokevirtual   #376 <Method void MediaCodec.setVideoScalingMode(int)>
	//  102  197:return          
	}

	protected void onStarted()
	{
		super.onStarted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #379 <Method void MediaCodecTrackRenderer.onStarted()>
		droppedFrameCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #137 <Field int droppedFrameCount>
		droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
	//    5    9:aload_0         
	//    6   10:invokestatic    #143 <Method long SystemClock.elapsedRealtime()>
	//    7   13:putfield        #145 <Field long droppedFrameAccumulationStartTimeMs>
	//    8   16:return          
	}

	protected void onStopped()
	{
		joiningDeadlineUs = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #93  <Long -1L>
	//    2    4:putfield        #96  <Field long joiningDeadlineUs>
		maybeNotifyDroppedFrameCount();
	//    3    7:aload_0         
	//    4    8:invokespecial   #294 <Method void maybeNotifyDroppedFrameCount()>
		super.onStopped();
	//    5   11:aload_0         
	//    6   12:invokespecial   #382 <Method void MediaCodecTrackRenderer.onStopped()>
	//    7   15:return          
	}

	protected boolean processOutputBuffer(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
			int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload           9
	//*   1    2:ifeq            20
		{
			skipOutputBuffer(mediacodec, i);
	//    2    5:aload_0         
	//    3    6:aload           5
	//    4    8:iload           8
	//    5   10:invokevirtual   #389 <Method void skipOutputBuffer(MediaCodec, int)>
			consecutiveDroppedFrameCount = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #289 <Field int consecutiveDroppedFrameCount>
			return true;
	//    9   18:iconst_1        
	//   10   19:ireturn         
		}
		if(!renderedFirstFrame)
	//*  11   20:aload_0         
	//*  12   21:getfield        #323 <Field boolean renderedFirstFrame>
	//*  13   24:ifne            64
		{
			if(Util.SDK_INT >= 21)
	//*  14   27:getstatic       #372 <Field int Util.SDK_INT>
	//*  15   30:bipush          21
	//*  16   32:icmplt          49
				renderOutputBufferV21(mediacodec, i, System.nanoTime());
	//   17   35:aload_0         
	//   18   36:aload           5
	//   19   38:iload           8
	//   20   40:invokestatic    #394 <Method long System.nanoTime()>
	//   21   43:invokevirtual   #398 <Method void renderOutputBufferV21(MediaCodec, int, long)>
			else
	//*  22   46:goto            57
				renderOutputBuffer(mediacodec, i);
	//   23   49:aload_0         
	//   24   50:aload           5
	//   25   52:iload           8
	//   26   54:invokevirtual   #401 <Method void renderOutputBuffer(MediaCodec, int)>
			consecutiveDroppedFrameCount = 0;
	//   27   57:aload_0         
	//   28   58:iconst_0        
	//   29   59:putfield        #289 <Field int consecutiveDroppedFrameCount>
			return true;
	//   30   62:iconst_1        
	//   31   63:ireturn         
		}
		if(getState() != 3)
	//*  32   64:aload_0         
	//*  33   65:invokevirtual   #233 <Method int getState()>
	//*  34   68:iconst_3        
	//*  35   69:icmpeq          74
			return false;
	//   36   72:iconst_0        
	//   37   73:ireturn         
		long l3 = SystemClock.elapsedRealtime();
	//   38   74:invokestatic    #143 <Method long SystemClock.elapsedRealtime()>
	//   39   77:lstore          12
		long l4 = bufferinfo.presentationTimeUs;
	//   40   79:aload           7
	//   41   81:getfield        #406 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//   42   84:lstore          14
		long l2 = System.nanoTime();
	//   43   86:invokestatic    #394 <Method long System.nanoTime()>
	//   44   89:lstore          10
		l = frameReleaseTimeHelper.adjustReleaseTime(bufferinfo.presentationTimeUs, (l4 - l - (l3 * 1000L - l1)) * 1000L + l2);
	//   45   91:aload_0         
	//   46   92:getfield        #82  <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
	//   47   95:aload           7
	//   48   97:getfield        #406 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//   49  100:lload           14
	//   50  102:lload_1         
	//   51  103:lsub            
	//   52  104:lload           12
	//   53  106:ldc2w           #85  <Long 1000L>
	//   54  109:lmul            
	//   55  110:lload_3         
	//   56  111:lsub            
	//   57  112:lsub            
	//   58  113:ldc2w           #85  <Long 1000L>
	//   59  116:lmul            
	//   60  117:lload           10
	//   61  119:ladd            
	//   62  120:invokevirtual   #410 <Method long VideoFrameReleaseTimeHelper.adjustReleaseTime(long, long)>
	//   63  123:lstore_1        
		l2 = (l - l2) / 1000L;
	//   64  124:lload_1         
	//   65  125:lload           10
	//   66  127:lsub            
	//   67  128:ldc2w           #85  <Long 1000L>
	//   68  131:ldiv            
	//   69  132:lstore          10
		if(shouldDropOutputBuffer(l2, l1))
	//*  70  134:aload_0         
	//*  71  135:lload           10
	//*  72  137:lload_3         
	//*  73  138:invokevirtual   #414 <Method boolean shouldDropOutputBuffer(long, long)>
	//*  74  141:ifeq            154
		{
			dropOutputBuffer(mediacodec, i);
	//   75  144:aload_0         
	//   76  145:aload           5
	//   77  147:iload           8
	//   78  149:invokevirtual   #416 <Method void dropOutputBuffer(MediaCodec, int)>
			return true;
	//   79  152:iconst_1        
	//   80  153:ireturn         
		}
		if(Util.SDK_INT >= 21)
	//*  81  154:getstatic       #372 <Field int Util.SDK_INT>
	//*  82  157:bipush          21
	//*  83  159:icmplt          189
			if(l2 < 50000L)
	//*  84  162:lload           10
	//*  85  164:ldc2w           #417 <Long 50000L>
	//*  86  167:lcmp            
	//*  87  168:ifge            187
			{
				renderOutputBufferV21(mediacodec, i, l);
	//   88  171:aload_0         
	//   89  172:aload           5
	//   90  174:iload           8
	//   91  176:lload_1         
	//   92  177:invokevirtual   #398 <Method void renderOutputBufferV21(MediaCodec, int, long)>
				consecutiveDroppedFrameCount = 0;
	//   93  180:aload_0         
	//   94  181:iconst_0        
	//   95  182:putfield        #289 <Field int consecutiveDroppedFrameCount>
				return true;
	//   96  185:iconst_1        
	//   97  186:ireturn         
			} else
			{
				return false;
	//   98  187:iconst_0        
	//   99  188:ireturn         
			}
		if(l2 < 30000L)
	//* 100  189:lload           10
	//* 101  191:ldc2w           #419 <Long 30000L>
	//* 102  194:lcmp            
	//* 103  195:ifge            244
		{
			if(l2 > 11000L)
	//* 104  198:lload           10
	//* 105  200:ldc2w           #421 <Long 11000L>
	//* 106  203:lcmp            
	//* 107  204:ifle            229
				try
				{
					Thread.sleep((l2 - 10000L) / 1000L);
	//  108  207:lload           10
	//  109  209:ldc2w           #423 <Long 10000L>
	//  110  212:lsub            
	//  111  213:ldc2w           #85  <Long 1000L>
	//  112  216:ldiv            
	//  113  217:invokestatic    #429 <Method void Thread.sleep(long)>
				}
	//* 114  220:goto            229
	//* 115  223:invokestatic    #433 <Method Thread Thread.currentThread()>
	//* 116  226:invokevirtual   #436 <Method void Thread.interrupt()>
	//* 117  229:aload_0         
	//* 118  230:aload           5
	//* 119  232:iload           8
	//* 120  234:invokevirtual   #401 <Method void renderOutputBuffer(MediaCodec, int)>
	//* 121  237:aload_0         
	//* 122  238:iconst_0        
	//* 123  239:putfield        #289 <Field int consecutiveDroppedFrameCount>
	//* 124  242:iconst_1        
	//* 125  243:ireturn         
	//* 126  244:iconst_0        
	//* 127  245:ireturn         
				// Misplaced declaration of an exception variable
				catch(ByteBuffer bytebuffer)
				{
					Thread.currentThread().interrupt();
				}
			renderOutputBuffer(mediacodec, i);
			consecutiveDroppedFrameCount = 0;
			return true;
		} else
		{
			return false;
		}
	//* 128  246:astore          6
	//* 129  248:goto            223
	}

	protected void renderOutputBuffer(MediaCodec mediacodec, int i)
	{
		maybeNotifyVideoSizeChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #438 <Method void maybeNotifyVideoSizeChanged()>
		TraceUtil.beginSection("releaseOutputBuffer");
	//    2    4:ldc2            #439 <String "releaseOutputBuffer">
	//    3    7:invokestatic    #271 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, true);
	//    4   10:aload_1         
	//    5   11:iload_2         
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #275 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		TraceUtil.endSection();
	//    8   16:invokestatic    #278 <Method void TraceUtil.endSection()>
		mediacodec = ((MediaCodec) (codecCounters));
	//    9   19:aload_0         
	//   10   20:getfield        #282 <Field CodecCounters codecCounters>
	//   11   23:astore_1        
		mediacodec.renderedOutputBufferCount = ((CodecCounters) (mediacodec)).renderedOutputBufferCount + 1;
	//   12   24:aload_1         
	//   13   25:aload_1         
	//   14   26:getfield        #442 <Field int CodecCounters.renderedOutputBufferCount>
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:putfield        #442 <Field int CodecCounters.renderedOutputBufferCount>
		renderedFirstFrame = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #323 <Field boolean renderedFirstFrame>
		maybeNotifyDrawnToSurface();
	//   21   39:aload_0         
	//   22   40:invokespecial   #444 <Method void maybeNotifyDrawnToSurface()>
	//   23   43:return          
	}

	protected void renderOutputBufferV21(MediaCodec mediacodec, int i, long l)
	{
		maybeNotifyVideoSizeChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #438 <Method void maybeNotifyVideoSizeChanged()>
		TraceUtil.beginSection("releaseOutputBuffer");
	//    2    4:ldc2            #439 <String "releaseOutputBuffer">
	//    3    7:invokestatic    #271 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, l);
	//    4   10:aload_1         
	//    5   11:iload_2         
	//    6   12:lload_3         
	//    7   13:invokevirtual   #448 <Method void MediaCodec.releaseOutputBuffer(int, long)>
		TraceUtil.endSection();
	//    8   16:invokestatic    #278 <Method void TraceUtil.endSection()>
		mediacodec = ((MediaCodec) (codecCounters));
	//    9   19:aload_0         
	//   10   20:getfield        #282 <Field CodecCounters codecCounters>
	//   11   23:astore_1        
		mediacodec.renderedOutputBufferCount = ((CodecCounters) (mediacodec)).renderedOutputBufferCount + 1;
	//   12   24:aload_1         
	//   13   25:aload_1         
	//   14   26:getfield        #442 <Field int CodecCounters.renderedOutputBufferCount>
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:putfield        #442 <Field int CodecCounters.renderedOutputBufferCount>
		renderedFirstFrame = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #323 <Field boolean renderedFirstFrame>
		maybeNotifyDrawnToSurface();
	//   21   39:aload_0         
	//   22   40:invokespecial   #444 <Method void maybeNotifyDrawnToSurface()>
	//   23   43:return          
	}

	protected boolean shouldDropOutputBuffer(long l, long l1)
	{
		return l < -30000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #449 <Long -30000L>
	//    2    4:lcmp            
	//    3    5:ifge            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected boolean shouldInitCodec()
	{
		if(super.shouldInitCodec())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #453 <Method boolean MediaCodecTrackRenderer.shouldInitCodec()>
	//*   2    4:ifeq            25
		{
			Surface surface1 = surface;
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field Surface surface>
	//    5   11:astore_1        
			if(surface1 != null && surface1.isValid())
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #456 <Method boolean Surface.isValid()>
	//*  10   20:ifeq            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	protected void skipOutputBuffer(MediaCodec mediacodec, int i)
	{
		TraceUtil.beginSection("skipVideoBuffer");
	//    0    0:ldc2            #458 <String "skipVideoBuffer">
	//    1    3:invokestatic    #271 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, false);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #275 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		TraceUtil.endSection();
	//    6   12:invokestatic    #278 <Method void TraceUtil.endSection()>
		mediacodec = ((MediaCodec) (codecCounters));
	//    7   15:aload_0         
	//    8   16:getfield        #282 <Field CodecCounters codecCounters>
	//    9   19:astore_1        
		mediacodec.skippedOutputBufferCount = ((CodecCounters) (mediacodec)).skippedOutputBufferCount + 1;
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:getfield        #461 <Field int CodecCounters.skippedOutputBufferCount>
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:putfield        #461 <Field int CodecCounters.skippedOutputBufferCount>
	//   16   30:return          
	}

	private static final String KEY_CROP_BOTTOM = "crop-bottom";
	private static final String KEY_CROP_LEFT = "crop-left";
	private static final String KEY_CROP_RIGHT = "crop-right";
	private static final String KEY_CROP_TOP = "crop-top";
	public static final int MSG_SET_SURFACE = 1;
	private final long allowedJoiningTimeUs;
	private int consecutiveDroppedFrameCount;
	private int currentHeight;
	private float currentPixelWidthHeightRatio;
	private int currentUnappliedRotationDegrees;
	private int currentWidth;
	private long droppedFrameAccumulationStartTimeMs;
	private int droppedFrameCount;
	private final EventListener eventListener;
	private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
	private long joiningDeadlineUs;
	private int lastReportedHeight;
	private float lastReportedPixelWidthHeightRatio;
	private int lastReportedUnappliedRotationDegrees;
	private int lastReportedWidth;
	private final int maxDroppedFrameCountToNotify;
	private float pendingPixelWidthHeightRatio;
	private int pendingRotationDegrees;
	private boolean renderedFirstFrame;
	private boolean reportedDrawnToSurface;
	private Surface surface;
	private final int videoScalingMode;


/*
	static EventListener access$000(MediaCodecVideoTrackRenderer mediacodecvideotrackrenderer)
	{
		return mediacodecvideotrackrenderer.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field MediaCodecVideoTrackRenderer$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
