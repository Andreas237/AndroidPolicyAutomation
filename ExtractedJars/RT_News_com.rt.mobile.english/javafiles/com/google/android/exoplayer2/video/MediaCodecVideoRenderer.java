// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.Point;
import android.media.*;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.mediacodec.*;
import com.google.android.exoplayer2.util.*;
import java.nio.ByteBuffer;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoFrameReleaseTimeHelper, DummySurface, VideoRendererEventListener

public class MediaCodecVideoRenderer extends MediaCodecRenderer
{
	protected static final class CodecMaxValues
	{

		public final int height;
		public final int inputSize;
		public final int width;

		public CodecMaxValues(int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			width = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int width>
			height = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field int height>
			inputSize = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #22  <Field int inputSize>
		//   11   19:return          
		}
	}

	private final class OnFrameRenderedListenerV23
		implements android.media.MediaCodec.OnFrameRenderedListener
	{

		public void onFrameRendered(MediaCodec mediacodec, long l, long l1)
		{
			if(this != tunnelingOnFrameRenderedListener)
		//*   0    0:aload_0         
		//*   1    1:aload_0         
		//*   2    2:getfield        #18  <Field MediaCodecVideoRenderer this$0>
		//*   3    5:getfield        #41  <Field MediaCodecVideoRenderer$OnFrameRenderedListenerV23 MediaCodecVideoRenderer.tunnelingOnFrameRenderedListener>
		//*   4    8:if_acmpeq       12
			{
				return;
		//    5   11:return          
			} else
			{
				maybeNotifyRenderedFirstFrame();
		//    6   12:aload_0         
		//    7   13:getfield        #18  <Field MediaCodecVideoRenderer this$0>
		//    8   16:invokevirtual   #44  <Method void MediaCodecVideoRenderer.maybeNotifyRenderedFirstFrame()>
				return;
		//    9   19:return          
			}
		}

		final MediaCodecVideoRenderer this$0;

		private OnFrameRenderedListenerV23(MediaCodec mediacodec)
		{
			this$0 = MediaCodecVideoRenderer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaCodecVideoRenderer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			mediacodec.setOnFrameRenderedListener(((android.media.MediaCodec.OnFrameRenderedListener) (this)), new Handler());
		//    5    9:aload_2         
		//    6   10:aload_0         
		//    7   11:new             #23  <Class Handler>
		//    8   14:dup             
		//    9   15:invokespecial   #24  <Method void Handler()>
		//   10   18:invokevirtual   #30  <Method void MediaCodec.setOnFrameRenderedListener(android.media.MediaCodec$OnFrameRenderedListener, Handler)>
		//   11   21:return          
		}

	}


	public MediaCodecVideoRenderer(Context context1, MediaCodecSelector mediacodecselector)
	{
		this(context1, mediacodecselector, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lconst_0        
	//    4    4:invokespecial   #95  <Method void MediaCodecVideoRenderer(Context, MediaCodecSelector, long)>
	//    5    7:return          
	}

	public MediaCodecVideoRenderer(Context context1, MediaCodecSelector mediacodecselector, long l)
	{
		this(context1, mediacodecselector, l, ((Handler) (null)), ((VideoRendererEventListener) (null)), -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:iconst_m1       
	//    7    7:invokespecial   #98  <Method void MediaCodecVideoRenderer(Context, MediaCodecSelector, long, Handler, VideoRendererEventListener, int)>
	//    8   10:return          
	}

	public MediaCodecVideoRenderer(Context context1, MediaCodecSelector mediacodecselector, long l, Handler handler, VideoRendererEventListener videorenderereventlistener, int i)
	{
		this(context1, mediacodecselector, l, ((DrmSessionManager) (null)), false, handler, videorenderereventlistener, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aload           5
	//    7    8:aload           6
	//    8   10:iload           7
	//    9   12:invokespecial   #102 <Method void MediaCodecVideoRenderer(Context, MediaCodecSelector, long, DrmSessionManager, boolean, Handler, VideoRendererEventListener, int)>
	//   10   15:return          
	}

	public MediaCodecVideoRenderer(Context context1, MediaCodecSelector mediacodecselector, long l, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, 
			VideoRendererEventListener videorenderereventlistener, int i)
	{
		super(2, mediacodecselector, drmsessionmanager, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:iload           6
	//    5    7:invokespecial   #106 <Method void MediaCodecRenderer(int, MediaCodecSelector, DrmSessionManager, boolean)>
		allowedJoiningTimeMs = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #108 <Field long allowedJoiningTimeMs>
		maxDroppedFramesToNotify = i;
	//    9   15:aload_0         
	//   10   16:iload           9
	//   11   18:putfield        #110 <Field int maxDroppedFramesToNotify>
		context = context1.getApplicationContext();
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #116 <Method Context Context.getApplicationContext()>
	//   15   26:putfield        #118 <Field Context context>
		frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(context);
	//   16   29:aload_0         
	//   17   30:new             #120 <Class VideoFrameReleaseTimeHelper>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:getfield        #118 <Field Context context>
	//   21   38:invokespecial   #123 <Method void VideoFrameReleaseTimeHelper(Context)>
	//   22   41:putfield        #125 <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
		eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videorenderereventlistener);
	//   23   44:aload_0         
	//   24   45:new             #127 <Class VideoRendererEventListener$EventDispatcher>
	//   25   48:dup             
	//   26   49:aload           7
	//   27   51:aload           8
	//   28   53:invokespecial   #130 <Method void VideoRendererEventListener$EventDispatcher(Handler, VideoRendererEventListener)>
	//   29   56:putfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
		deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
	//   30   59:aload_0         
	//   31   60:invokestatic    #135 <Method boolean deviceNeedsAutoFrcWorkaround()>
	//   32   63:putfield        #137 <Field boolean deviceNeedsAutoFrcWorkaround>
		pendingOutputStreamOffsetsUs = new long[10];
	//   33   66:aload_0         
	//   34   67:bipush          10
	//   35   69:newarray        long[]
	//   36   71:putfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
		pendingOutputStreamSwitchTimesUs = new long[10];
	//   37   74:aload_0         
	//   38   75:bipush          10
	//   39   77:newarray        long[]
	//   40   79:putfield        #141 <Field long[] pendingOutputStreamSwitchTimesUs>
		outputStreamOffsetUs = 0x1L;
	//   41   82:aload_0         
	//   42   83:ldc2w           #142 <Long 0x1L>
	//   43   86:putfield        #145 <Field long outputStreamOffsetUs>
		lastInputTimeUs = 0x1L;
	//   44   89:aload_0         
	//   45   90:ldc2w           #142 <Long 0x1L>
	//   46   93:putfield        #147 <Field long lastInputTimeUs>
		joiningDeadlineMs = 0x1L;
	//   47   96:aload_0         
	//   48   97:ldc2w           #142 <Long 0x1L>
	//   49  100:putfield        #149 <Field long joiningDeadlineMs>
		currentWidth = -1;
	//   50  103:aload_0         
	//   51  104:iconst_m1       
	//   52  105:putfield        #151 <Field int currentWidth>
		currentHeight = -1;
	//   53  108:aload_0         
	//   54  109:iconst_m1       
	//   55  110:putfield        #153 <Field int currentHeight>
		currentPixelWidthHeightRatio = -1F;
	//   56  113:aload_0         
	//   57  114:ldc1            #154 <Float -1F>
	//   58  116:putfield        #156 <Field float currentPixelWidthHeightRatio>
		pendingPixelWidthHeightRatio = -1F;
	//   59  119:aload_0         
	//   60  120:ldc1            #154 <Float -1F>
	//   61  122:putfield        #158 <Field float pendingPixelWidthHeightRatio>
		scalingMode = 1;
	//   62  125:aload_0         
	//   63  126:iconst_1        
	//   64  127:putfield        #160 <Field int scalingMode>
		clearReportedVideoSize();
	//   65  130:aload_0         
	//   66  131:invokespecial   #163 <Method void clearReportedVideoSize()>
	//   67  134:return          
	}

	private static boolean areAdaptationCompatible(boolean flag, Format format, Format format1)
	{
		return format.sampleMimeType.equals(((Object) (format1.sampleMimeType))) && format.rotationDegrees == format1.rotationDegrees && (flag || format.width == format1.width && format.height == format1.height) && Util.areEqual(((Object) (format.colorInfo)), ((Object) (format1.colorInfo)));
	//    0    0:aload_1         
	//    1    1:getfield        #172 <Field String Format.sampleMimeType>
	//    2    4:aload_2         
	//    3    5:getfield        #172 <Field String Format.sampleMimeType>
	//    4    8:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    5   11:ifeq            67
	//    6   14:aload_1         
	//    7   15:getfield        #181 <Field int Format.rotationDegrees>
	//    8   18:aload_2         
	//    9   19:getfield        #181 <Field int Format.rotationDegrees>
	//   10   22:icmpne          67
	//   11   25:iload_0         
	//   12   26:ifne            51
	//   13   29:aload_1         
	//   14   30:getfield        #184 <Field int Format.width>
	//   15   33:aload_2         
	//   16   34:getfield        #184 <Field int Format.width>
	//   17   37:icmpne          67
	//   18   40:aload_1         
	//   19   41:getfield        #187 <Field int Format.height>
	//   20   44:aload_2         
	//   21   45:getfield        #187 <Field int Format.height>
	//   22   48:icmpne          67
	//   23   51:aload_1         
	//   24   52:getfield        #191 <Field ColorInfo Format.colorInfo>
	//   25   55:aload_2         
	//   26   56:getfield        #191 <Field ColorInfo Format.colorInfo>
	//   27   59:invokestatic    #197 <Method boolean Util.areEqual(Object, Object)>
	//   28   62:ifeq            67
	//   29   65:iconst_1        
	//   30   66:ireturn         
	//   31   67:iconst_0        
	//   32   68:ireturn         
	}

	private void clearRenderedFirstFrame()
	{
		renderedFirstFrame = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #200 <Field boolean renderedFirstFrame>
		if(Util.SDK_INT >= 23 && tunneling)
	//*   3    5:getstatic       #203 <Field int Util.SDK_INT>
	//*   4    8:bipush          23
	//*   5   10:icmplt          43
	//*   6   13:aload_0         
	//*   7   14:getfield        #205 <Field boolean tunneling>
	//*   8   17:ifeq            43
		{
			MediaCodec mediacodec = getCodec();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #209 <Method MediaCodec getCodec()>
	//   11   24:astore_1        
			if(mediacodec != null)
	//*  12   25:aload_1         
	//*  13   26:ifnull          43
				tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediacodec);
	//   14   29:aload_0         
	//   15   30:new             #11  <Class MediaCodecVideoRenderer$OnFrameRenderedListenerV23>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:aconst_null     
	//   20   37:invokespecial   #212 <Method void MediaCodecVideoRenderer$OnFrameRenderedListenerV23(MediaCodecVideoRenderer, MediaCodec, MediaCodecVideoRenderer$1)>
	//   21   40:putfield        #214 <Field MediaCodecVideoRenderer$OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener>
		}
	//   22   43:return          
	}

	private void clearReportedVideoSize()
	{
		reportedWidth = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #216 <Field int reportedWidth>
		reportedHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #218 <Field int reportedHeight>
		reportedPixelWidthHeightRatio = -1F;
	//    6   10:aload_0         
	//    7   11:ldc1            #154 <Float -1F>
	//    8   13:putfield        #220 <Field float reportedPixelWidthHeightRatio>
		reportedUnappliedRotationDegrees = -1;
	//    9   16:aload_0         
	//   10   17:iconst_m1       
	//   11   18:putfield        #222 <Field int reportedUnappliedRotationDegrees>
	//   12   21:return          
	}

	private static void configureTunnelingV21(MediaFormat mediaformat, int i)
	{
		mediaformat.setFeatureEnabled("tunneled-playback", true);
	//    0    0:aload_0         
	//    1    1:ldc1            #227 <String "tunneled-playback">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #233 <Method void MediaFormat.setFeatureEnabled(String, boolean)>
		mediaformat.setInteger("audio-session-id", i);
	//    4    7:aload_0         
	//    5    8:ldc1            #235 <String "audio-session-id">
	//    6   10:iload_1         
	//    7   11:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
	//    8   14:return          
	}

	private static boolean deviceNeedsAutoFrcWorkaround()
	{
		return Util.SDK_INT <= 22 && "foster".equals(((Object) (Util.DEVICE))) && "NVIDIA".equals(((Object) (Util.MANUFACTURER)));
	//    0    0:getstatic       #203 <Field int Util.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmpgt          32
	//    3    8:ldc1            #242 <String "foster">
	//    4   10:getstatic       #245 <Field String Util.DEVICE>
	//    5   13:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    6   16:ifeq            32
	//    7   19:ldc1            #247 <String "NVIDIA">
	//    8   21:getstatic       #250 <Field String Util.MANUFACTURER>
	//    9   24:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   10   27:ifeq            32
	//   11   30:iconst_1        
	//   12   31:ireturn         
	//   13   32:iconst_0        
	//   14   33:ireturn         
	}

	private static Point getCodecMaxSize(MediaCodecInfo mediacodecinfo, Format format)
		throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException
	{
		int i = format.height;
	//    0    0:aload_1         
	//    1    1:getfield        #187 <Field int Format.height>
	//    2    4:istore          4
		int j = format.width;
	//    3    6:aload_1         
	//    4    7:getfield        #184 <Field int Format.width>
	//    5   10:istore          5
		int i1 = 0;
	//    6   12:iconst_0        
	//    7   13:istore          7
		boolean flag;
		if(i > j)
	//*   8   15:iload           4
	//*   9   17:iload           5
	//*  10   19:icmple          28
			flag = true;
	//   11   22:iconst_1        
	//   12   23:istore          4
		else
	//*  13   25:goto            31
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore          4
		if(flag)
	//*  16   31:iload           4
	//*  17   33:ifeq            45
			j = format.height;
	//   18   36:aload_1         
	//   19   37:getfield        #187 <Field int Format.height>
	//   20   40:istore          5
		else
	//*  21   42:goto            51
			j = format.width;
	//   22   45:aload_1         
	//   23   46:getfield        #184 <Field int Format.width>
	//   24   49:istore          5
		int l;
		if(flag)
	//*  25   51:iload           4
	//*  26   53:ifeq            65
			l = format.width;
	//   27   56:aload_1         
	//   28   57:getfield        #184 <Field int Format.width>
	//   29   60:istore          6
		else
	//*  30   62:goto            71
			l = format.height;
	//   31   65:aload_1         
	//   32   66:getfield        #187 <Field int Format.height>
	//   33   69:istore          6
		float f = (float)l / (float)j;
	//   34   71:iload           6
	//   35   73:i2f             
	//   36   74:iload           5
	//   37   76:i2f             
	//   38   77:fdiv            
	//   39   78:fstore_2        
		int ai[] = STANDARD_LONG_EDGE_VIDEO_PX;
	//   40   79:getstatic       #89  <Field int[] STANDARD_LONG_EDGE_VIDEO_PX>
	//   41   82:astore          12
		for(int i2 = ai.length; i1 < i2;)
	//*  42   84:aload           12
	//*  43   86:arraylength     
	//*  44   87:istore          11
	//*  45   89:iload           7
	//*  46   91:iload           11
	//*  47   93:icmpge          283
		{
			int j1 = ai[i1];
	//   48   96:aload           12
	//   49   98:iload           7
	//   50  100:iaload          
	//   51  101:istore          8
			int k1 = (int)((float)j1 * f);
	//   52  103:iload           8
	//   53  105:i2f             
	//   54  106:fload_2         
	//   55  107:fmul            
	//   56  108:f2i             
	//   57  109:istore          9
			if(j1 > j)
	//*  58  111:iload           8
	//*  59  113:iload           5
	//*  60  115:icmple          281
			{
				if(k1 <= l)
	//*  61  118:iload           9
	//*  62  120:iload           6
	//*  63  122:icmpgt          127
					return null;
	//   64  125:aconst_null     
	//   65  126:areturn         
				if(Util.SDK_INT >= 21)
	//*  66  127:getstatic       #203 <Field int Util.SDK_INT>
	//*  67  130:bipush          21
	//*  68  132:icmplt          200
				{
					int l1;
					if(flag)
	//*  69  135:iload           4
	//*  70  137:ifeq            147
						l1 = k1;
	//   71  140:iload           9
	//   72  142:istore          10
					else
	//*  73  144:goto            151
						l1 = j1;
	//   74  147:iload           8
	//   75  149:istore          10
					if(!flag)
	//*  76  151:iload           4
	//*  77  153:ifeq            159
	//*  78  156:goto            163
						j1 = k1;
	//   79  159:iload           9
	//   80  161:istore          8
					Point point = mediacodecinfo.alignVideoSizeV21(l1, j1);
	//   81  163:aload_0         
	//   82  164:iload           10
	//   83  166:iload           8
	//   84  168:invokevirtual   #260 <Method Point MediaCodecInfo.alignVideoSizeV21(int, int)>
	//   85  171:astore          13
					float f1 = format.frameRate;
	//   86  173:aload_1         
	//   87  174:getfield        #263 <Field float Format.frameRate>
	//   88  177:fstore_3        
					if(mediacodecinfo.isVideoSizeAndRateSupportedV21(point.x, point.y, f1))
	//*  89  178:aload_0         
	//*  90  179:aload           13
	//*  91  181:getfield        #268 <Field int Point.x>
	//*  92  184:aload           13
	//*  93  186:getfield        #271 <Field int Point.y>
	//*  94  189:fload_3         
	//*  95  190:f2d             
	//*  96  191:invokevirtual   #275 <Method boolean MediaCodecInfo.isVideoSizeAndRateSupportedV21(int, int, double)>
	//*  97  194:ifeq            272
						return point;
	//   98  197:aload           13
	//   99  199:areturn         
				} else
				{
					j1 = Util.ceilDivide(j1, 16) * 16;
	//  100  200:iload           8
	//  101  202:bipush          16
	//  102  204:invokestatic    #279 <Method int Util.ceilDivide(int, int)>
	//  103  207:bipush          16
	//  104  209:imul            
	//  105  210:istore          8
					k1 = 16 * Util.ceilDivide(k1, 16);
	//  106  212:bipush          16
	//  107  214:iload           9
	//  108  216:bipush          16
	//  109  218:invokestatic    #279 <Method int Util.ceilDivide(int, int)>
	//  110  221:imul            
	//  111  222:istore          9
					if(j1 * k1 <= MediaCodecUtil.maxH264DecodableFrameSize())
	//* 112  224:iload           8
	//* 113  226:iload           9
	//* 114  228:imul            
	//* 115  229:invokestatic    #285 <Method int MediaCodecUtil.maxH264DecodableFrameSize()>
	//* 116  232:icmpgt          272
					{
						int k;
						if(flag)
	//* 117  235:iload           4
	//* 118  237:ifeq            247
							k = k1;
	//  119  240:iload           9
	//  120  242:istore          5
						else
	//* 121  244:goto            251
							k = j1;
	//  122  247:iload           8
	//  123  249:istore          5
						if(flag)
	//* 124  251:iload           4
	//* 125  253:ifeq            260
							k1 = j1;
	//  126  256:iload           8
	//  127  258:istore          9
						return new Point(k, k1);
	//  128  260:new             #265 <Class Point>
	//  129  263:dup             
	//  130  264:iload           5
	//  131  266:iload           9
	//  132  268:invokespecial   #288 <Method void Point(int, int)>
	//  133  271:areturn         
					}
				}
				i1++;
	//  134  272:iload           7
	//  135  274:iconst_1        
	//  136  275:iadd            
	//  137  276:istore          7
			} else
	//* 138  278:goto            89
			{
				return null;
	//  139  281:aconst_null     
	//  140  282:areturn         
			}
		}

		return null;
	//  141  283:aconst_null     
	//  142  284:areturn         
	}

	private static int getMaxInputSize(MediaCodecInfo mediacodecinfo, Format format)
	{
		if(format.maxInputSize != -1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #294 <Field int Format.maxInputSize>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          60
		{
			int k = format.initializationData.size();
	//    4    8:aload_1         
	//    5    9:getfield        #298 <Field List Format.initializationData>
	//    6   12:invokeinterface #303 <Method int List.size()>
	//    7   17:istore          4
			int i = 0;
	//    8   19:iconst_0        
	//    9   20:istore_2        
			int j = 0;
	//   10   21:iconst_0        
	//   11   22:istore_3        
			for(; i < k; i++)
	//*  12   23:iload_2         
	//*  13   24:iload           4
	//*  14   26:icmpge          53
				j += ((byte[])format.initializationData.get(i)).length;
	//   15   29:iload_3         
	//   16   30:aload_1         
	//   17   31:getfield        #298 <Field List Format.initializationData>
	//   18   34:iload_2         
	//   19   35:invokeinterface #307 <Method Object List.get(int)>
	//   20   40:checkcast       #309 <Class byte[]>
	//   21   43:arraylength     
	//   22   44:iadd            
	//   23   45:istore_3        

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            23
			return format.maxInputSize + j;
	//   29   53:aload_1         
	//   30   54:getfield        #294 <Field int Format.maxInputSize>
	//   31   57:iload_3         
	//   32   58:iadd            
	//   33   59:ireturn         
		} else
		{
			return getMaxInputSize(mediacodecinfo, format.sampleMimeType, format.width, format.height);
	//   34   60:aload_0         
	//   35   61:aload_1         
	//   36   62:getfield        #172 <Field String Format.sampleMimeType>
	//   37   65:aload_1         
	//   38   66:getfield        #184 <Field int Format.width>
	//   39   69:aload_1         
	//   40   70:getfield        #187 <Field int Format.height>
	//   41   73:invokestatic    #312 <Method int getMaxInputSize(MediaCodecInfo, String, int, int)>
	//   42   76:ireturn         
		}
	}

	private static int getMaxInputSize(MediaCodecInfo mediacodecinfo, String s, int i, int j)
	{
		int k;
		byte byte1;
		if(i == -1)
			break MISSING_BLOCK_LABEL_345;
	//    0    0:iload_2         
	//    1    1:iconst_m1       
	//    2    2:icmpeq          345
label0:
		{
			if(j == -1)
	//*   3    5:iload_3         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
				return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
			k = s.hashCode();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #315 <Method int String.hashCode()>
	//   10   16:istore          4
			byte1 = 4;
	//   11   18:iconst_4        
	//   12   19:istore          5
			switch(k)
	//*  13   21:iload           4
			{
			default:
				break;

	//*  14   23:lookupswitch    6: default 80
	//	               -1664118616: 163
	//	               -1662541442: 147
	//	               1187890754: 131
	//	               1331836730: 115
	//	               1599127256: 99
	//	               1599127257: 83
	//*  15   80:goto            179
			case 1599127257: 
				if(s.equals("video/x-vnd.on2.vp9"))
	//*  16   83:aload_1         
	//*  17   84:ldc2            #317 <String "video/x-vnd.on2.vp9">
	//*  18   87:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*  19   90:ifeq            179
				{
					k = 5;
	//   20   93:iconst_5        
	//   21   94:istore          4
					break label0;
	//   22   96:goto            182
				}
				break;

			case 1599127256: 
				if(!s.equals("video/x-vnd.on2.vp8"))
					break;
	//   23   99:aload_1         
	//   24  100:ldc2            #319 <String "video/x-vnd.on2.vp8">
	//   25  103:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   26  106:ifeq            179
				k = 3;
	//   27  109:iconst_3        
	//   28  110:istore          4
				break label0;
	//   29  112:goto            182

			case 1331836730: 
				if(!s.equals("video/avc"))
					break;
	//   30  115:aload_1         
	//   31  116:ldc2            #321 <String "video/avc">
	//   32  119:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   33  122:ifeq            179
				k = 2;
	//   34  125:iconst_2        
	//   35  126:istore          4
				break label0;
	//   36  128:goto            182

			case 1187890754: 
				if(!s.equals("video/mp4v-es"))
					break;
	//   37  131:aload_1         
	//   38  132:ldc2            #323 <String "video/mp4v-es">
	//   39  135:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   40  138:ifeq            179
				k = 1;
	//   41  141:iconst_1        
	//   42  142:istore          4
				break label0;
	//   43  144:goto            182

			case -1662541442: 
				if(!s.equals("video/hevc"))
					break;
	//   44  147:aload_1         
	//   45  148:ldc2            #325 <String "video/hevc">
	//   46  151:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   47  154:ifeq            179
				k = 4;
	//   48  157:iconst_4        
	//   49  158:istore          4
				break label0;
	//   50  160:goto            182

			case -1664118616: 
				if(!s.equals("video/3gpp"))
					break;
	//   51  163:aload_1         
	//   52  164:ldc2            #327 <String "video/3gpp">
	//   53  167:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   54  170:ifeq            179
				k = 0;
	//   55  173:iconst_0        
	//   56  174:istore          4
				break label0;
	//   57  176:goto            182
			}
			k = -1;
	//   58  179:iconst_m1       
	//   59  180:istore          4
		}
		k;
	//   60  182:iload           4
		JVM INSTR tableswitch 0 5: default 224
	//	               0 325
	//	               1 325
	//	               2 243
	//	               3 236
	//	               4 226
	//	               5 226;
	//   61  184:tableswitch     0 5: default 224
	//	               0 325
	//	               1 325
	//	               2 243
	//	               3 236
	//	               4 226
	//	               5 226
		   goto _L1 _L2 _L2 _L3 _L4 _L5 _L5
_L1:
		return -1;
	//   62  224:iconst_m1       
	//   63  225:ireturn         
_L5:
		j = i * j;
	//   64  226:iload_2         
	//   65  227:iload_3         
	//   66  228:imul            
	//   67  229:istore_3        
		i = ((int) (byte1));
	//   68  230:iload           5
	//   69  232:istore_2        
		break MISSING_BLOCK_LABEL_337;
	//   70  233:goto            337
_L4:
		i *= j;
	//   71  236:iload_2         
	//   72  237:iload_3         
	//   73  238:imul            
	//   74  239:istore_2        
		break; /* Loop/switch isn't completed */
	//   75  240:goto            329
_L3:
		if("BRAVIA 4K 2015".equals(((Object) (Util.MODEL)))) goto _L7; else goto _L6
	//   76  243:ldc2            #329 <String "BRAVIA 4K 2015">
	//   77  246:getstatic       #332 <Field String Util.MODEL>
	//   78  249:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   79  252:ifne            323
_L6:
		if(!"Amazon".equals(((Object) (Util.MANUFACTURER)))) goto _L9; else goto _L8
	//   80  255:ldc2            #334 <String "Amazon">
	//   81  258:getstatic       #250 <Field String Util.MANUFACTURER>
	//   82  261:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   83  264:ifeq            300
_L8:
		if("KFSOWI".equals(((Object) (Util.MODEL)))) goto _L7; else goto _L10
	//   84  267:ldc2            #336 <String "KFSOWI">
	//   85  270:getstatic       #332 <Field String Util.MODEL>
	//   86  273:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   87  276:ifne            323
_L10:
		if("AFTS".equals(((Object) (Util.MODEL))) && mediacodecinfo.secure)
	//*  88  279:ldc2            #338 <String "AFTS">
	//*  89  282:getstatic       #332 <Field String Util.MODEL>
	//*  90  285:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*  91  288:ifeq            300
	//*  92  291:aload_0         
	//*  93  292:getfield        #341 <Field boolean MediaCodecInfo.secure>
	//*  94  295:ifeq            300
			return -1;
	//   95  298:iconst_m1       
	//   96  299:ireturn         
_L9:
		i = Util.ceilDivide(i, 16) * Util.ceilDivide(j, 16) * 16 * 16;
	//   97  300:iload_2         
	//   98  301:bipush          16
	//   99  303:invokestatic    #279 <Method int Util.ceilDivide(int, int)>
	//  100  306:iload_3         
	//  101  307:bipush          16
	//  102  309:invokestatic    #279 <Method int Util.ceilDivide(int, int)>
	//  103  312:imul            
	//  104  313:bipush          16
	//  105  315:imul            
	//  106  316:bipush          16
	//  107  318:imul            
	//  108  319:istore_2        
		break; /* Loop/switch isn't completed */
	//  109  320:goto            329
_L7:
		return -1;
	//  110  323:iconst_m1       
	//  111  324:ireturn         
_L2:
		i *= j;
	//  112  325:iload_2         
	//  113  326:iload_3         
	//  114  327:imul            
	//  115  328:istore_2        
		byte byte0 = 2;
	//  116  329:iconst_2        
	//  117  330:istore          4
		j = i;
	//  118  332:iload_2         
	//  119  333:istore_3        
		i = ((int) (byte0));
	//  120  334:iload           4
	//  121  336:istore_2        
		return (j * 3) / (2 * i);
	//  122  337:iload_3         
	//  123  338:iconst_3        
	//  124  339:imul            
	//  125  340:iconst_2        
	//  126  341:iload_2         
	//  127  342:imul            
	//  128  343:idiv            
	//  129  344:ireturn         
		return -1;
	//  130  345:iconst_m1       
	//  131  346:ireturn         
	}

	private static boolean isBufferLate(long l)
	{
		return l < -30000L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #344 <Long -30000L>
	//    2    4:lcmp            
	//    3    5:ifge            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static boolean isBufferVeryLate(long l)
	{
		return l < 0xfff85ee0L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #347 <Long 0xfff85ee0L>
	//    2    4:lcmp            
	//    3    5:ifge            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private void maybeNotifyDroppedFrames()
	{
		if(droppedFrames > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field int droppedFrames>
	//*   2    4:ifle            40
		{
			long l = SystemClock.elapsedRealtime();
	//    3    7:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//    4   10:lstore_1        
			long l1 = droppedFrameAccumulationStartTimeMs;
	//    5   11:aload_0         
	//    6   12:getfield        #359 <Field long droppedFrameAccumulationStartTimeMs>
	//    7   15:lstore_3        
			eventDispatcher.droppedFrames(droppedFrames, l - l1);
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//   10   20:aload_0         
	//   11   21:getfield        #351 <Field int droppedFrames>
	//   12   24:lload_1         
	//   13   25:lload_3         
	//   14   26:lsub            
	//   15   27:invokevirtual   #362 <Method void VideoRendererEventListener$EventDispatcher.droppedFrames(int, long)>
			droppedFrames = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #351 <Field int droppedFrames>
			droppedFrameAccumulationStartTimeMs = l;
	//   19   35:aload_0         
	//   20   36:lload_1         
	//   21   37:putfield        #359 <Field long droppedFrameAccumulationStartTimeMs>
		}
	//   22   40:return          
	}

	private void maybeNotifyVideoSizeChanged()
	{
		if((currentWidth != -1 || currentHeight != -1) && (reportedWidth != currentWidth || reportedHeight != currentHeight || reportedUnappliedRotationDegrees != currentUnappliedRotationDegrees || reportedPixelWidthHeightRatio != currentPixelWidthHeightRatio))
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field int currentWidth>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #153 <Field int currentHeight>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          116
	//*   8   16:aload_0         
	//*   9   17:getfield        #216 <Field int reportedWidth>
	//*  10   20:aload_0         
	//*  11   21:getfield        #151 <Field int currentWidth>
	//*  12   24:icmpne          61
	//*  13   27:aload_0         
	//*  14   28:getfield        #218 <Field int reportedHeight>
	//*  15   31:aload_0         
	//*  16   32:getfield        #153 <Field int currentHeight>
	//*  17   35:icmpne          61
	//*  18   38:aload_0         
	//*  19   39:getfield        #222 <Field int reportedUnappliedRotationDegrees>
	//*  20   42:aload_0         
	//*  21   43:getfield        #365 <Field int currentUnappliedRotationDegrees>
	//*  22   46:icmpne          61
	//*  23   49:aload_0         
	//*  24   50:getfield        #220 <Field float reportedPixelWidthHeightRatio>
	//*  25   53:aload_0         
	//*  26   54:getfield        #156 <Field float currentPixelWidthHeightRatio>
	//*  27   57:fcmpl           
	//*  28   58:ifeq            116
		{
			eventDispatcher.videoSizeChanged(currentWidth, currentHeight, currentUnappliedRotationDegrees, currentPixelWidthHeightRatio);
	//   29   61:aload_0         
	//   30   62:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//   31   65:aload_0         
	//   32   66:getfield        #151 <Field int currentWidth>
	//   33   69:aload_0         
	//   34   70:getfield        #153 <Field int currentHeight>
	//   35   73:aload_0         
	//   36   74:getfield        #365 <Field int currentUnappliedRotationDegrees>
	//   37   77:aload_0         
	//   38   78:getfield        #156 <Field float currentPixelWidthHeightRatio>
	//   39   81:invokevirtual   #369 <Method void VideoRendererEventListener$EventDispatcher.videoSizeChanged(int, int, int, float)>
			reportedWidth = currentWidth;
	//   40   84:aload_0         
	//   41   85:aload_0         
	//   42   86:getfield        #151 <Field int currentWidth>
	//   43   89:putfield        #216 <Field int reportedWidth>
			reportedHeight = currentHeight;
	//   44   92:aload_0         
	//   45   93:aload_0         
	//   46   94:getfield        #153 <Field int currentHeight>
	//   47   97:putfield        #218 <Field int reportedHeight>
			reportedUnappliedRotationDegrees = currentUnappliedRotationDegrees;
	//   48  100:aload_0         
	//   49  101:aload_0         
	//   50  102:getfield        #365 <Field int currentUnappliedRotationDegrees>
	//   51  105:putfield        #222 <Field int reportedUnappliedRotationDegrees>
			reportedPixelWidthHeightRatio = currentPixelWidthHeightRatio;
	//   52  108:aload_0         
	//   53  109:aload_0         
	//   54  110:getfield        #156 <Field float currentPixelWidthHeightRatio>
	//   55  113:putfield        #220 <Field float reportedPixelWidthHeightRatio>
		}
	//   56  116:return          
	}

	private void maybeRenotifyRenderedFirstFrame()
	{
		if(renderedFirstFrame)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field boolean renderedFirstFrame>
	//*   2    4:ifeq            18
			eventDispatcher.renderedFirstFrame(surface);
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//    5   11:aload_0         
	//    6   12:getfield        #372 <Field Surface surface>
	//    7   15:invokevirtual   #375 <Method void VideoRendererEventListener$EventDispatcher.renderedFirstFrame(Surface)>
	//    8   18:return          
	}

	private void maybeRenotifyVideoSizeChanged()
	{
		if(reportedWidth != -1 || reportedHeight != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field int reportedWidth>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #218 <Field int reportedHeight>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          39
			eventDispatcher.videoSizeChanged(reportedWidth, reportedHeight, reportedUnappliedRotationDegrees, reportedPixelWidthHeightRatio);
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//   10   20:aload_0         
	//   11   21:getfield        #216 <Field int reportedWidth>
	//   12   24:aload_0         
	//   13   25:getfield        #218 <Field int reportedHeight>
	//   14   28:aload_0         
	//   15   29:getfield        #222 <Field int reportedUnappliedRotationDegrees>
	//   16   32:aload_0         
	//   17   33:getfield        #220 <Field float reportedPixelWidthHeightRatio>
	//   18   36:invokevirtual   #369 <Method void VideoRendererEventListener$EventDispatcher.videoSizeChanged(int, int, int, float)>
	//   19   39:return          
	}

	private void setJoiningDeadlineMs()
	{
		long l;
		if(allowedJoiningTimeMs > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field long allowedJoiningTimeMs>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            21
			l = SystemClock.elapsedRealtime() + allowedJoiningTimeMs;
	//    5    9:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//    6   12:aload_0         
	//    7   13:getfield        #108 <Field long allowedJoiningTimeMs>
	//    8   16:ladd            
	//    9   17:lstore_1        
		else
	//*  10   18:goto            25
			l = 0x1L;
	//   11   21:ldc2w           #142 <Long 0x1L>
	//   12   24:lstore_1        
		joiningDeadlineMs = l;
	//   13   25:aload_0         
	//   14   26:lload_1         
	//   15   27:putfield        #149 <Field long joiningDeadlineMs>
	//   16   30:return          
	}

	private static void setOutputSurfaceV23(MediaCodec mediacodec, Surface surface1)
	{
		mediacodec.setOutputSurface(surface1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #385 <Method void MediaCodec.setOutputSurface(Surface)>
	//    3    5:return          
	}

	private void setSurface(Surface surface1)
		throws ExoPlaybackException
	{
		Surface surface2 = surface1;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(surface1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       66
			if(dummySurface != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #390 <Field Surface dummySurface>
	//*   6   10:ifnull          21
			{
				surface2 = dummySurface;
	//    7   13:aload_0         
	//    8   14:getfield        #390 <Field Surface dummySurface>
	//    9   17:astore_3        
			} else
	//*  10   18:goto            66
			{
				MediaCodecInfo mediacodecinfo = getCodecInfo();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #394 <Method MediaCodecInfo getCodecInfo()>
	//   13   25:astore          4
				surface2 = surface1;
	//   14   27:aload_1         
	//   15   28:astore_3        
				if(mediacodecinfo != null)
	//*  16   29:aload           4
	//*  17   31:ifnull          66
				{
					surface2 = surface1;
	//   18   34:aload_1         
	//   19   35:astore_3        
					if(shouldUseDummySurface(mediacodecinfo))
	//*  20   36:aload_0         
	//*  21   37:aload           4
	//*  22   39:invokespecial   #398 <Method boolean shouldUseDummySurface(MediaCodecInfo)>
	//*  23   42:ifeq            66
					{
						dummySurface = ((Surface) (DummySurface.newInstanceV17(context, mediacodecinfo.secure)));
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #118 <Field Context context>
	//   27   50:aload           4
	//   28   52:getfield        #341 <Field boolean MediaCodecInfo.secure>
	//   29   55:invokestatic    #404 <Method DummySurface DummySurface.newInstanceV17(Context, boolean)>
	//   30   58:putfield        #390 <Field Surface dummySurface>
						surface2 = dummySurface;
	//   31   61:aload_0         
	//   32   62:getfield        #390 <Field Surface dummySurface>
	//   33   65:astore_3        
					}
				}
			}
		if(surface != surface2)
	//*  34   66:aload_0         
	//*  35   67:getfield        #372 <Field Surface surface>
	//*  36   70:aload_3         
	//*  37   71:if_acmpeq       177
		{
			surface = surface2;
	//   38   74:aload_0         
	//   39   75:aload_3         
	//   40   76:putfield        #372 <Field Surface surface>
			int i = getState();
	//   41   79:aload_0         
	//   42   80:invokevirtual   #407 <Method int getState()>
	//   43   83:istore_2        
			if(i == 1 || i == 2)
	//*  44   84:iload_2         
	//*  45   85:iconst_1        
	//*  46   86:icmpeq          94
	//*  47   89:iload_2         
	//*  48   90:iconst_2        
	//*  49   91:icmpne          138
			{
				surface1 = ((Surface) (getCodec()));
	//   50   94:aload_0         
	//   51   95:invokevirtual   #209 <Method MediaCodec getCodec()>
	//   52   98:astore_1        
				if(Util.SDK_INT >= 23 && surface1 != null && surface2 != null && !codecNeedsSetOutputSurfaceWorkaround)
	//*  53   99:getstatic       #203 <Field int Util.SDK_INT>
	//*  54  102:bipush          23
	//*  55  104:icmplt          130
	//*  56  107:aload_1         
	//*  57  108:ifnull          130
	//*  58  111:aload_3         
	//*  59  112:ifnull          130
	//*  60  115:aload_0         
	//*  61  116:getfield        #409 <Field boolean codecNeedsSetOutputSurfaceWorkaround>
	//*  62  119:ifne            130
				{
					setOutputSurfaceV23(((MediaCodec) (surface1)), surface2);
	//   63  122:aload_1         
	//   64  123:aload_3         
	//   65  124:invokestatic    #411 <Method void setOutputSurfaceV23(MediaCodec, Surface)>
				} else
	//*  66  127:goto            138
				{
					releaseCodec();
	//   67  130:aload_0         
	//   68  131:invokevirtual   #414 <Method void releaseCodec()>
					maybeInitCodec();
	//   69  134:aload_0         
	//   70  135:invokevirtual   #417 <Method void maybeInitCodec()>
				}
			}
			if(surface2 != null && surface2 != dummySurface)
	//*  71  138:aload_3         
	//*  72  139:ifnull          168
	//*  73  142:aload_3         
	//*  74  143:aload_0         
	//*  75  144:getfield        #390 <Field Surface dummySurface>
	//*  76  147:if_acmpeq       168
			{
				maybeRenotifyVideoSizeChanged();
	//   77  150:aload_0         
	//   78  151:invokespecial   #419 <Method void maybeRenotifyVideoSizeChanged()>
				clearRenderedFirstFrame();
	//   79  154:aload_0         
	//   80  155:invokespecial   #421 <Method void clearRenderedFirstFrame()>
				if(i == 2)
	//*  81  158:iload_2         
	//*  82  159:iconst_2        
	//*  83  160:icmpne          197
				{
					setJoiningDeadlineMs();
	//   84  163:aload_0         
	//   85  164:invokespecial   #423 <Method void setJoiningDeadlineMs()>
					return;
	//   86  167:return          
				}
			} else
			{
				clearReportedVideoSize();
	//   87  168:aload_0         
	//   88  169:invokespecial   #163 <Method void clearReportedVideoSize()>
				clearRenderedFirstFrame();
	//   89  172:aload_0         
	//   90  173:invokespecial   #421 <Method void clearRenderedFirstFrame()>
				return;
	//   91  176:return          
			}
		} else
		if(surface2 != null && surface2 != dummySurface)
	//*  92  177:aload_3         
	//*  93  178:ifnull          197
	//*  94  181:aload_3         
	//*  95  182:aload_0         
	//*  96  183:getfield        #390 <Field Surface dummySurface>
	//*  97  186:if_acmpeq       197
		{
			maybeRenotifyVideoSizeChanged();
	//   98  189:aload_0         
	//   99  190:invokespecial   #419 <Method void maybeRenotifyVideoSizeChanged()>
			maybeRenotifyRenderedFirstFrame();
	//  100  193:aload_0         
	//  101  194:invokespecial   #425 <Method void maybeRenotifyRenderedFirstFrame()>
		}
	//  102  197:return          
	}

	private boolean shouldUseDummySurface(MediaCodecInfo mediacodecinfo)
	{
		return Util.SDK_INT >= 23 && !tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediacodecinfo.name) && (!mediacodecinfo.secure || DummySurface.isSecureSupported(context));
	//    0    0:getstatic       #203 <Field int Util.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmplt          45
	//    3    8:aload_0         
	//    4    9:getfield        #205 <Field boolean tunneling>
	//    5   12:ifne            45
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:getfield        #428 <Field String MediaCodecInfo.name>
	//    9   20:invokevirtual   #431 <Method boolean codecNeedsSetOutputSurfaceWorkaround(String)>
	//   10   23:ifne            45
	//   11   26:aload_1         
	//   12   27:getfield        #341 <Field boolean MediaCodecInfo.secure>
	//   13   30:ifeq            43
	//   14   33:aload_0         
	//   15   34:getfield        #118 <Field Context context>
	//   16   37:invokestatic    #435 <Method boolean DummySurface.isSecureSupported(Context)>
	//   17   40:ifeq            45
	//   18   43:iconst_1        
	//   19   44:ireturn         
	//   20   45:iconst_0        
	//   21   46:ireturn         
	}

	protected int canKeepCodec(MediaCodec mediacodec, MediaCodecInfo mediacodecinfo, Format format, Format format1)
	{
		if(areAdaptationCompatible(mediacodecinfo.adaptive, format, format1) && format1.width <= codecMaxValues.width && format1.height <= codecMaxValues.height && getMaxInputSize(mediacodecinfo, format1) <= codecMaxValues.inputSize)
	//*   0    0:aload_2         
	//*   1    1:getfield        #440 <Field boolean MediaCodecInfo.adaptive>
	//*   2    4:aload_3         
	//*   3    5:aload           4
	//*   4    7:invokestatic    #442 <Method boolean areAdaptationCompatible(boolean, Format, Format)>
	//*   5   10:ifeq            72
	//*   6   13:aload           4
	//*   7   15:getfield        #184 <Field int Format.width>
	//*   8   18:aload_0         
	//*   9   19:getfield        #444 <Field MediaCodecVideoRenderer$CodecMaxValues codecMaxValues>
	//*  10   22:getfield        #445 <Field int MediaCodecVideoRenderer$CodecMaxValues.width>
	//*  11   25:icmpgt          72
	//*  12   28:aload           4
	//*  13   30:getfield        #187 <Field int Format.height>
	//*  14   33:aload_0         
	//*  15   34:getfield        #444 <Field MediaCodecVideoRenderer$CodecMaxValues codecMaxValues>
	//*  16   37:getfield        #446 <Field int MediaCodecVideoRenderer$CodecMaxValues.height>
	//*  17   40:icmpgt          72
	//*  18   43:aload_2         
	//*  19   44:aload           4
	//*  20   46:invokestatic    #448 <Method int getMaxInputSize(MediaCodecInfo, Format)>
	//*  21   49:aload_0         
	//*  22   50:getfield        #444 <Field MediaCodecVideoRenderer$CodecMaxValues codecMaxValues>
	//*  23   53:getfield        #451 <Field int MediaCodecVideoRenderer$CodecMaxValues.inputSize>
	//*  24   56:icmpgt          72
			return !format.initializationDataEquals(format1) ? 3 : 1;
	//   25   59:aload_3         
	//   26   60:aload           4
	//   27   62:invokevirtual   #455 <Method boolean Format.initializationDataEquals(Format)>
	//   28   65:ifeq            70
	//   29   68:iconst_1        
	//   30   69:ireturn         
	//   31   70:iconst_3        
	//   32   71:ireturn         
		else
			return 0;
	//   33   72:iconst_0        
	//   34   73:ireturn         
	}

	protected boolean codecNeedsSetOutputSurfaceWorkaround(String s)
	{
		int i;
		boolean flag;
		int j;
		j = Util.SDK_INT;
	//    0    0:getstatic       #203 <Field int Util.SDK_INT>
	//    1    3:istore          4
		i = 27;
	//    2    5:bipush          27
	//    3    7:istore_2        
		flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		if(j >= 27) goto _L2; else goto _L1
	//    6   10:iload           4
	//    7   12:bipush          27
	//    8   14:icmpge          2960
_L1:
		if(s.startsWith("OMX.google"))
	//*   9   17:aload_1         
	//*  10   18:ldc2            #457 <String "OMX.google">
	//*  11   21:invokevirtual   #460 <Method boolean String.startsWith(String)>
	//*  12   24:ifeq            29
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		com/google/android/exoplayer2/video/MediaCodecVideoRenderer;
	//   15   29:ldc1            #2   <Class MediaCodecVideoRenderer>
		JVM INSTR monitorenter ;
	//   16   31:monitorenter    
		if(evaluatedDeviceNeedsSetOutputSurfaceWorkaround) goto _L4; else goto _L3
	//   17   32:getstatic       #462 <Field boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround>
	//   18   35:ifne            2947
_L3:
		s = Util.DEVICE;
	//   19   38:getstatic       #245 <Field String Util.DEVICE>
	//   20   41:astore_1        
		s.hashCode();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #315 <Method int String.hashCode()>
		JVM INSTR lookupswitch 118: default 2962
	//	               -2144781245: 2863
	//	               -2144781185: 2847
	//	               -2144781160: 2831
	//	               -2097309513: 2815
	//	               -2022874474: 2799
	//	               -1978993182: 2783
	//	               -1978990237: 2767
	//	               -1936688988: 2751
	//	               -1936688066: 2735
	//	               -1936688065: 2719
	//	               -1931988508: 2703
	//	               -1696512866: 2687
	//	               -1680025915: 2671
	//	               -1615810839: 2655
	//	               -1554255044: 2639
	//	               -1481772737: 2623
	//	               -1481772730: 2607
	//	               -1481772729: 2591
	//	               -1320080169: 2575
	//	               -1217592143: 2559
	//	               -1180384755: 2543
	//	               -1139198265: 2527
	//	               -1052835013: 2511
	//	               -993250464: 2496
	//	               -965403638: 2480
	//	               -958336948: 2464
	//	               -879245230: 2448
	//	               -842500323: 2432
	//	               -821392978: 2416
	//	               -797483286: 2400
	//	               -794946968: 2384
	//	               -788334647: 2368
	//	               -782144577: 2352
	//	               -575125681: 2336
	//	               -521118391: 2320
	//	               -430914369: 2304
	//	               -290434366: 2288
	//	               -282781963: 2272
	//	               -277133239: 2256
	//	               -173639913: 2240
	//	               -56598463: 2224
	//	               2126: 2208
	//	               2564: 2192
	//	               2715: 2176
	//	               2719: 2160
	//	               3483: 2144
	//	               73405: 2128
	//	               75739: 2112
	//	               76779: 2096
	//	               78669: 2080
	//	               79305: 2064
	//	               80618: 2048
	//	               88274: 2032
	//	               98846: 2016
	//	               98848: 2000
	//	               99329: 1984
	//	               101481: 1968
	//	               1513190: 1953
	//	               1514184: 1938
	//	               1514185: 1923
	//	               2436959: 1907
	//	               2463773: 1891
	//	               2464648: 1875
	//	               2689555: 1859
	//	               3351335: 1843
	//	               3386211: 1827
	//	               41325051: 1811
	//	               55178625: 1795
	//	               61542055: 1780
	//	               65355429: 1764
	//	               66214468: 1748
	//	               66214470: 1732
	//	               66214473: 1716
	//	               66215429: 1700
	//	               66215431: 1684
	//	               66215433: 1668
	//	               66216390: 1652
	//	               76402249: 1636
	//	               76404105: 1620
	//	               76404911: 1604
	//	               80963634: 1588
	//	               82882791: 1572
	//	               102844228: 1556
	//	               165221241: 1541
	//	               182191441: 1525
	//	               245388979: 1509
	//	               287431619: 1493
	//	               307593612: 1477
	//	               308517133: 1461
	//	               316215098: 1445
	//	               316215116: 1429
	//	               316246811: 1413
	//	               316246818: 1397
	//	               407160593: 1381
	//	               507412548: 1365
	//	               793982701: 1349
	//	               794038622: 1333
	//	               794040393: 1317
	//	               835649806: 1301
	//	               917340916: 1285
	//	               958008161: 1269
	//	               1060579533: 1253
	//	               1150207623: 1237
	//	               1176899427: 1221
	//	               1280332038: 1205
	//	               1306947716: 1192
	//	               1349174697: 1176
	//	               1522194893: 1160
	//	               1691543273: 1144
	//	               1709443163: 1128
	//	               1865889110: 1112
	//	               1906253259: 1096
	//	               1977196784: 1080
	//	               2029784656: 1064
	//	               2030379515: 1048
	//	               2047190025: 1032
	//	               2047252157: 1016
	//	               2048319463: 1000;
	//   23   46:lookupswitch    118: default 2962
	//	               -2144781245: 2863
	//	               -2144781185: 2847
	//	               -2144781160: 2831
	//	               -2097309513: 2815
	//	               -2022874474: 2799
	//	               -1978993182: 2783
	//	               -1978990237: 2767
	//	               -1936688988: 2751
	//	               -1936688066: 2735
	//	               -1936688065: 2719
	//	               -1931988508: 2703
	//	               -1696512866: 2687
	//	               -1680025915: 2671
	//	               -1615810839: 2655
	//	               -1554255044: 2639
	//	               -1481772737: 2623
	//	               -1481772730: 2607
	//	               -1481772729: 2591
	//	               -1320080169: 2575
	//	               -1217592143: 2559
	//	               -1180384755: 2543
	//	               -1139198265: 2527
	//	               -1052835013: 2511
	//	               -993250464: 2496
	//	               -965403638: 2480
	//	               -958336948: 2464
	//	               -879245230: 2448
	//	               -842500323: 2432
	//	               -821392978: 2416
	//	               -797483286: 2400
	//	               -794946968: 2384
	//	               -788334647: 2368
	//	               -782144577: 2352
	//	               -575125681: 2336
	//	               -521118391: 2320
	//	               -430914369: 2304
	//	               -290434366: 2288
	//	               -282781963: 2272
	//	               -277133239: 2256
	//	               -173639913: 2240
	//	               -56598463: 2224
	//	               2126: 2208
	//	               2564: 2192
	//	               2715: 2176
	//	               2719: 2160
	//	               3483: 2144
	//	               73405: 2128
	//	               75739: 2112
	//	               76779: 2096
	//	               78669: 2080
	//	               79305: 2064
	//	               80618: 2048
	//	               88274: 2032
	//	               98846: 2016
	//	               98848: 2000
	//	               99329: 1984
	//	               101481: 1968
	//	               1513190: 1953
	//	               1514184: 1938
	//	               1514185: 1923
	//	               2436959: 1907
	//	               2463773: 1891
	//	               2464648: 1875
	//	               2689555: 1859
	//	               3351335: 1843
	//	               3386211: 1827
	//	               41325051: 1811
	//	               55178625: 1795
	//	               61542055: 1780
	//	               65355429: 1764
	//	               66214468: 1748
	//	               66214470: 1732
	//	               66214473: 1716
	//	               66215429: 1700
	//	               66215431: 1684
	//	               66215433: 1668
	//	               66216390: 1652
	//	               76402249: 1636
	//	               76404105: 1620
	//	               76404911: 1604
	//	               80963634: 1588
	//	               82882791: 1572
	//	               102844228: 1556
	//	               165221241: 1541
	//	               182191441: 1525
	//	               245388979: 1509
	//	               287431619: 1493
	//	               307593612: 1477
	//	               308517133: 1461
	//	               316215098: 1445
	//	               316215116: 1429
	//	               316246811: 1413
	//	               316246818: 1397
	//	               407160593: 1381
	//	               507412548: 1365
	//	               793982701: 1349
	//	               794038622: 1333
	//	               794040393: 1317
	//	               835649806: 1301
	//	               917340916: 1285
	//	               958008161: 1269
	//	               1060579533: 1253
	//	               1150207623: 1237
	//	               1176899427: 1221
	//	               1280332038: 1205
	//	               1306947716: 1192
	//	               1349174697: 1176
	//	               1522194893: 1160
	//	               1691543273: 1144
	//	               1709443163: 1128
	//	               1865889110: 1112
	//	               1906253259: 1096
	//	               1977196784: 1080
	//	               2029784656: 1064
	//	               2030379515: 1048
	//	               2047190025: 1032
	//	               2047252157: 1016
	//	               2048319463: 1000
		   goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91 _L92 _L93 _L94 _L95 _L96 _L97 _L98 _L99 _L100 _L101 _L102 _L103 _L104 _L105 _L106 _L107 _L108 _L109 _L110 _L111 _L112 _L113 _L114 _L115 _L116 _L117 _L118 _L119 _L120 _L121 _L122 _L123
_L123:
		if(!s.equals("HWVNS-H")) goto _L5; else goto _L124
	//   24 1000:aload_1         
	//   25 1001:ldc2            #464 <String "HWVNS-H">
	//   26 1004:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   27 1007:ifeq            2962
_L124:
		i = 50;
	//   28 1010:bipush          50
	//   29 1012:istore_2        
		  goto _L125
	//*  30 1013:goto            2964
_L122:
		if(!s.equals("ELUGA_Prim")) goto _L5; else goto _L126
	//   31 1016:aload_1         
	//   32 1017:ldc2            #466 <String "ELUGA_Prim">
	//   33 1020:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   34 1023:ifeq            2962
_L126:
		i = 25;
	//   35 1026:bipush          25
	//   36 1028:istore_2        
		  goto _L125
	//*  37 1029:goto            2964
_L121:
		if(!s.equals("ELUGA_Note")) goto _L5; else goto _L127
	//   38 1032:aload_1         
	//   39 1033:ldc2            #468 <String "ELUGA_Note">
	//   40 1036:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   41 1039:ifeq            2962
_L127:
		i = 24;
	//   42 1042:bipush          24
	//   43 1044:istore_2        
		  goto _L125
	//*  44 1045:goto            2964
_L120:
		if(!s.equals("HWCAM-H")) goto _L5; else goto _L128
	//   45 1048:aload_1         
	//   46 1049:ldc2            #470 <String "HWCAM-H">
	//   47 1052:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   48 1055:ifeq            2962
_L128:
		i = 49;
	//   49 1058:bipush          49
	//   50 1060:istore_2        
		  goto _L125
	//*  51 1061:goto            2964
_L119:
		if(!s.equals("HWBLN-H")) goto _L5; else goto _L129
	//   52 1064:aload_1         
	//   53 1065:ldc2            #472 <String "HWBLN-H">
	//   54 1068:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   55 1071:ifeq            2962
_L129:
		i = 48;
	//   56 1074:bipush          48
	//   57 1076:istore_2        
		  goto _L125
	//*  58 1077:goto            2964
_L118:
		if(!s.equals("Infinix-X572")) goto _L5; else goto _L130
	//   59 1080:aload_1         
	//   60 1081:ldc2            #474 <String "Infinix-X572">
	//   61 1084:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   62 1087:ifeq            2962
_L130:
		i = 52;
	//   63 1090:bipush          52
	//   64 1092:istore_2        
		  goto _L125
	//*  65 1093:goto            2964
_L117:
		if(!s.equals("PB2-670M")) goto _L5; else goto _L131
	//   66 1096:aload_1         
	//   67 1097:ldc2            #476 <String "PB2-670M">
	//   68 1100:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   69 1103:ifeq            2962
_L131:
		i = 79;
	//   70 1106:bipush          79
	//   71 1108:istore_2        
		  goto _L125
	//*  72 1109:goto            2964
_L116:
		if(!s.equals("santoni")) goto _L5; else goto _L132
	//   73 1112:aload_1         
	//   74 1113:ldc2            #478 <String "santoni">
	//   75 1116:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   76 1119:ifeq            2962
_L132:
		i = 95;
	//   77 1122:bipush          95
	//   78 1124:istore_2        
		  goto _L125
	//*  79 1125:goto            2964
_L115:
		if(!s.equals("iball8735_9806")) goto _L5; else goto _L133
	//   80 1128:aload_1         
	//   81 1129:ldc2            #480 <String "iball8735_9806">
	//   82 1132:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   83 1135:ifeq            2962
_L133:
		i = 51;
	//   84 1138:bipush          51
	//   85 1140:istore_2        
		  goto _L125
	//*  86 1141:goto            2964
_L114:
		if(!s.equals("CPH1609")) goto _L5; else goto _L134
	//   87 1144:aload_1         
	//   88 1145:ldc2            #482 <String "CPH1609">
	//   89 1148:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   90 1151:ifeq            2962
_L134:
		i = 17;
	//   91 1154:bipush          17
	//   92 1156:istore_2        
		  goto _L125
	//*  93 1157:goto            2964
_L113:
		if(!s.equals("woods_f")) goto _L5; else goto _L135
	//   94 1160:aload_1         
	//   95 1161:ldc2            #484 <String "woods_f">
	//   96 1164:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   97 1167:ifeq            2962
_L135:
		i = 111;
	//   98 1170:bipush          111
	//   99 1172:istore_2        
		  goto _L125
	//* 100 1173:goto            2964
_L112:
		if(!s.equals("htc_e56ml_dtul")) goto _L5; else goto _L136
	//  101 1176:aload_1         
	//  102 1177:ldc2            #486 <String "htc_e56ml_dtul">
	//  103 1180:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  104 1183:ifeq            2962
_L136:
		i = 46;
	//  105 1186:bipush          46
	//  106 1188:istore_2        
		  goto _L125
	//* 107 1189:goto            2964
_L111:
		if(!s.equals("EverStar_S")) goto _L5; else goto _L125
	//  108 1192:aload_1         
	//  109 1193:ldc2            #488 <String "EverStar_S">
	//  110 1196:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  111 1199:ifeq            2962
	//* 112 1202:goto            2964
_L110:
		if(!s.equals("hwALE-H")) goto _L5; else goto _L137
	//  113 1205:aload_1         
	//  114 1206:ldc2            #490 <String "hwALE-H">
	//  115 1209:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  116 1212:ifeq            2962
_L137:
		i = 47;
	//  117 1215:bipush          47
	//  118 1217:istore_2        
		  goto _L125
	//* 119 1218:goto            2964
_L109:
		if(!s.equals("itel_S41")) goto _L5; else goto _L138
	//  120 1221:aload_1         
	//  121 1222:ldc2            #492 <String "itel_S41">
	//  122 1225:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  123 1228:ifeq            2962
_L138:
		i = 54;
	//  124 1231:bipush          54
	//  125 1233:istore_2        
		  goto _L125
	//* 126 1234:goto            2964
_L108:
		if(!s.equals("LS-5017")) goto _L5; else goto _L139
	//  127 1237:aload_1         
	//  128 1238:ldc2            #494 <String "LS-5017">
	//  129 1241:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  130 1244:ifeq            2962
_L139:
		i = 59;
	//  131 1247:bipush          59
	//  132 1249:istore_2        
		  goto _L125
	//* 133 1250:goto            2964
_L107:
		if(!s.equals("panell_d")) goto _L5; else goto _L140
	//  134 1253:aload_1         
	//  135 1254:ldc2            #496 <String "panell_d">
	//  136 1257:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  137 1260:ifeq            2962
_L140:
		i = 75;
	//  138 1263:bipush          75
	//  139 1265:istore_2        
		  goto _L125
	//* 140 1266:goto            2964
_L106:
		if(!s.equals("j2xlteins")) goto _L5; else goto _L141
	//  141 1269:aload_1         
	//  142 1270:ldc2            #498 <String "j2xlteins">
	//  143 1273:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  144 1276:ifeq            2962
_L141:
		i = 55;
	//  145 1279:bipush          55
	//  146 1281:istore_2        
		  goto _L125
	//* 147 1282:goto            2964
_L105:
		if(!s.equals("A7000plus")) goto _L5; else goto _L142
	//  148 1285:aload_1         
	//  149 1286:ldc2            #500 <String "A7000plus">
	//  150 1289:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  151 1292:ifeq            2962
_L142:
		i = 7;
	//  152 1295:bipush          7
	//  153 1297:istore_2        
		  goto _L125
	//* 154 1298:goto            2964
_L104:
		if(!s.equals("manning")) goto _L5; else goto _L143
	//  155 1301:aload_1         
	//  156 1302:ldc2            #502 <String "manning">
	//  157 1305:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  158 1308:ifeq            2962
_L143:
		i = 61;
	//  159 1311:bipush          61
	//  160 1313:istore_2        
		  goto _L125
	//* 161 1314:goto            2964
_L103:
		if(!s.equals("GIONEE_WBL7519")) goto _L5; else goto _L144
	//  162 1317:aload_1         
	//  163 1318:ldc2            #504 <String "GIONEE_WBL7519">
	//  164 1321:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  165 1324:ifeq            2962
_L144:
		i = 44;
	//  166 1327:bipush          44
	//  167 1329:istore_2        
		  goto _L125
	//* 168 1330:goto            2964
_L102:
		if(!s.equals("GIONEE_WBL7365")) goto _L5; else goto _L145
	//  169 1333:aload_1         
	//  170 1334:ldc2            #506 <String "GIONEE_WBL7365">
	//  171 1337:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  172 1340:ifeq            2962
_L145:
		i = 43;
	//  173 1343:bipush          43
	//  174 1345:istore_2        
		  goto _L125
	//* 175 1346:goto            2964
_L101:
		if(!s.equals("GIONEE_WBL5708")) goto _L5; else goto _L146
	//  176 1349:aload_1         
	//  177 1350:ldc2            #508 <String "GIONEE_WBL5708">
	//  178 1353:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  179 1356:ifeq            2962
_L146:
		i = 42;
	//  180 1359:bipush          42
	//  181 1361:istore_2        
		  goto _L125
	//* 182 1362:goto            2964
_L100:
		if(!s.equals("QM16XE_U")) goto _L5; else goto _L147
	//  183 1365:aload_1         
	//  184 1366:ldc2            #510 <String "QM16XE_U">
	//  185 1369:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  186 1372:ifeq            2962
_L147:
		i = 93;
	//  187 1375:bipush          93
	//  188 1377:istore_2        
		  goto _L125
	//* 189 1378:goto            2964
_L99:
		if(!s.equals("Pixi5-10_4G")) goto _L5; else goto _L148
	//  190 1381:aload_1         
	//  191 1382:ldc2            #512 <String "Pixi5-10_4G">
	//  192 1385:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  193 1388:ifeq            2962
_L148:
		i = 85;
	//  194 1391:bipush          85
	//  195 1393:istore_2        
		  goto _L125
	//* 196 1394:goto            2964
_L98:
		if(!s.equals("TB3-850M")) goto _L5; else goto _L149
	//  197 1397:aload_1         
	//  198 1398:ldc2            #514 <String "TB3-850M">
	//  199 1401:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  200 1404:ifeq            2962
_L149:
		i = 103;
	//  201 1407:bipush          103
	//  202 1409:istore_2        
		  goto _L125
	//* 203 1410:goto            2964
_L97:
		if(!s.equals("TB3-850F")) goto _L5; else goto _L150
	//  204 1413:aload_1         
	//  205 1414:ldc2            #516 <String "TB3-850F">
	//  206 1417:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  207 1420:ifeq            2962
_L150:
		i = 102;
	//  208 1423:bipush          102
	//  209 1425:istore_2        
		  goto _L125
	//* 210 1426:goto            2964
_L96:
		if(!s.equals("TB3-730X")) goto _L5; else goto _L151
	//  211 1429:aload_1         
	//  212 1430:ldc2            #518 <String "TB3-730X">
	//  213 1433:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  214 1436:ifeq            2962
_L151:
		i = 101;
	//  215 1439:bipush          101
	//  216 1441:istore_2        
		  goto _L125
	//* 217 1442:goto            2964
_L95:
		if(!s.equals("TB3-730F")) goto _L5; else goto _L152
	//  218 1445:aload_1         
	//  219 1446:ldc2            #520 <String "TB3-730F">
	//  220 1449:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  221 1452:ifeq            2962
_L152:
		i = 100;
	//  222 1455:bipush          100
	//  223 1457:istore_2        
		  goto _L125
	//* 224 1458:goto            2964
_L94:
		if(!s.equals("A7020a48")) goto _L5; else goto _L153
	//  225 1461:aload_1         
	//  226 1462:ldc2            #522 <String "A7020a48">
	//  227 1465:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  228 1468:ifeq            2962
_L153:
		i = 9;
	//  229 1471:bipush          9
	//  230 1473:istore_2        
		  goto _L125
	//* 231 1474:goto            2964
_L93:
		if(!s.equals("A7010a48")) goto _L5; else goto _L154
	//  232 1477:aload_1         
	//  233 1478:ldc2            #524 <String "A7010a48">
	//  234 1481:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  235 1484:ifeq            2962
_L154:
		i = 8;
	//  236 1487:bipush          8
	//  237 1489:istore_2        
		  goto _L125
	//* 238 1490:goto            2964
_L92:
		if(!s.equals("griffin")) goto _L5; else goto _L155
	//  239 1493:aload_1         
	//  240 1494:ldc2            #526 <String "griffin">
	//  241 1497:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  242 1500:ifeq            2962
_L155:
		i = 45;
	//  243 1503:bipush          45
	//  244 1505:istore_2        
		  goto _L125
	//* 245 1506:goto            2964
_L91:
		if(!s.equals("marino_f")) goto _L5; else goto _L156
	//  246 1509:aload_1         
	//  247 1510:ldc2            #528 <String "marino_f">
	//  248 1513:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  249 1516:ifeq            2962
_L156:
		i = 62;
	//  250 1519:bipush          62
	//  251 1521:istore_2        
		  goto _L125
	//* 252 1522:goto            2964
_L90:
		if(!s.equals("CPY83_I00")) goto _L5; else goto _L157
	//  253 1525:aload_1         
	//  254 1526:ldc2            #530 <String "CPY83_I00">
	//  255 1529:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  256 1532:ifeq            2962
_L157:
		i = 18;
	//  257 1535:bipush          18
	//  258 1537:istore_2        
		  goto _L125
	//* 259 1538:goto            2964
_L89:
		if(!s.equals("A2016a40")) goto _L5; else goto _L158
	//  260 1541:aload_1         
	//  261 1542:ldc2            #532 <String "A2016a40">
	//  262 1545:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  263 1548:ifeq            2962
_L158:
		i = 5;
	//  264 1551:iconst_5        
	//  265 1552:istore_2        
		  goto _L125
	//* 266 1553:goto            2964
_L88:
		if(!s.equals("le_x6")) goto _L5; else goto _L159
	//  267 1556:aload_1         
	//  268 1557:ldc2            #534 <String "le_x6">
	//  269 1560:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  270 1563:ifeq            2962
_L159:
		i = 58;
	//  271 1566:bipush          58
	//  272 1568:istore_2        
		  goto _L125
	//* 273 1569:goto            2964
_L87:
		if(!s.equals("X3_HK")) goto _L5; else goto _L160
	//  274 1572:aload_1         
	//  275 1573:ldc2            #536 <String "X3_HK">
	//  276 1576:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  277 1579:ifeq            2962
_L160:
		i = 113;
	//  278 1582:bipush          113
	//  279 1584:istore_2        
		  goto _L125
	//* 280 1585:goto            2964
_L86:
		if(!s.equals("V23GB")) goto _L5; else goto _L161
	//  281 1588:aload_1         
	//  282 1589:ldc2            #538 <String "V23GB">
	//  283 1592:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  284 1595:ifeq            2962
_L161:
		i = 106;
	//  285 1598:bipush          106
	//  286 1600:istore_2        
		  goto _L125
	//* 287 1601:goto            2964
_L85:
		if(!s.equals("Q4310")) goto _L5; else goto _L162
	//  288 1604:aload_1         
	//  289 1605:ldc2            #540 <String "Q4310">
	//  290 1608:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  291 1611:ifeq            2962
_L162:
		i = 91;
	//  292 1614:bipush          91
	//  293 1616:istore_2        
		  goto _L125
	//* 294 1617:goto            2964
_L84:
		if(!s.equals("Q4260")) goto _L5; else goto _L163
	//  295 1620:aload_1         
	//  296 1621:ldc2            #542 <String "Q4260">
	//  297 1624:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  298 1627:ifeq            2962
_L163:
		i = 89;
	//  299 1630:bipush          89
	//  300 1632:istore_2        
		  goto _L125
	//* 301 1633:goto            2964
_L83:
		if(!s.equals("PRO7S")) goto _L5; else goto _L164
	//  302 1636:aload_1         
	//  303 1637:ldc2            #544 <String "PRO7S">
	//  304 1640:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  305 1643:ifeq            2962
_L164:
		i = 87;
	//  306 1646:bipush          87
	//  307 1648:istore_2        
		  goto _L125
	//* 308 1649:goto            2964
_L82:
		if(!s.equals("F3311")) goto _L5; else goto _L165
	//  309 1652:aload_1         
	//  310 1653:ldc2            #546 <String "F3311">
	//  311 1656:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  312 1659:ifeq            2962
_L165:
		i = 34;
	//  313 1662:bipush          34
	//  314 1664:istore_2        
		  goto _L125
	//* 315 1665:goto            2964
_L81:
		if(!s.equals("F3215")) goto _L5; else goto _L166
	//  316 1668:aload_1         
	//  317 1669:ldc2            #548 <String "F3215">
	//  318 1672:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  319 1675:ifeq            2962
_L166:
		i = 33;
	//  320 1678:bipush          33
	//  321 1680:istore_2        
		  goto _L125
	//* 322 1681:goto            2964
_L80:
		if(!s.equals("F3213")) goto _L5; else goto _L167
	//  323 1684:aload_1         
	//  324 1685:ldc2            #550 <String "F3213">
	//  325 1688:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  326 1691:ifeq            2962
_L167:
		i = 32;
	//  327 1694:bipush          32
	//  328 1696:istore_2        
		  goto _L125
	//* 329 1697:goto            2964
_L79:
		if(!s.equals("F3211")) goto _L5; else goto _L168
	//  330 1700:aload_1         
	//  331 1701:ldc2            #552 <String "F3211">
	//  332 1704:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  333 1707:ifeq            2962
_L168:
		i = 31;
	//  334 1710:bipush          31
	//  335 1712:istore_2        
		  goto _L125
	//* 336 1713:goto            2964
_L78:
		if(!s.equals("F3116")) goto _L5; else goto _L169
	//  337 1716:aload_1         
	//  338 1717:ldc2            #554 <String "F3116">
	//  339 1720:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  340 1723:ifeq            2962
_L169:
		i = 30;
	//  341 1726:bipush          30
	//  342 1728:istore_2        
		  goto _L125
	//* 343 1729:goto            2964
_L77:
		if(!s.equals("F3113")) goto _L5; else goto _L170
	//  344 1732:aload_1         
	//  345 1733:ldc2            #556 <String "F3113">
	//  346 1736:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  347 1739:ifeq            2962
_L170:
		i = 29;
	//  348 1742:bipush          29
	//  349 1744:istore_2        
		  goto _L125
	//* 350 1745:goto            2964
_L76:
		if(!s.equals("F3111")) goto _L5; else goto _L171
	//  351 1748:aload_1         
	//  352 1749:ldc2            #558 <String "F3111">
	//  353 1752:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  354 1755:ifeq            2962
_L171:
		i = 28;
	//  355 1758:bipush          28
	//  356 1760:istore_2        
		  goto _L125
	//* 357 1761:goto            2964
_L75:
		if(!s.equals("E5643")) goto _L5; else goto _L172
	//  358 1764:aload_1         
	//  359 1765:ldc2            #560 <String "E5643">
	//  360 1768:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  361 1771:ifeq            2962
_L172:
		i = 22;
	//  362 1774:bipush          22
	//  363 1776:istore_2        
		  goto _L125
	//* 364 1777:goto            2964
_L74:
		if(!s.equals("A1601")) goto _L5; else goto _L173
	//  365 1780:aload_1         
	//  366 1781:ldc2            #562 <String "A1601">
	//  367 1784:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  368 1787:ifeq            2962
_L173:
		i = 4;
	//  369 1790:iconst_4        
	//  370 1791:istore_2        
		  goto _L125
	//* 371 1792:goto            2964
_L73:
		if(!s.equals("Aura_Note_2")) goto _L5; else goto _L174
	//  372 1795:aload_1         
	//  373 1796:ldc2            #564 <String "Aura_Note_2">
	//  374 1799:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  375 1802:ifeq            2962
_L174:
		i = 11;
	//  376 1805:bipush          11
	//  377 1807:istore_2        
		  goto _L125
	//* 378 1808:goto            2964
_L72:
		if(!s.equals("MEIZU_M5")) goto _L5; else goto _L175
	//  379 1811:aload_1         
	//  380 1812:ldc2            #566 <String "MEIZU_M5">
	//  381 1815:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  382 1818:ifeq            2962
_L175:
		i = 63;
	//  383 1821:bipush          63
	//  384 1823:istore_2        
		  goto _L125
	//* 385 1824:goto            2964
_L71:
		if(!s.equals("p212")) goto _L5; else goto _L176
	//  386 1827:aload_1         
	//  387 1828:ldc2            #568 <String "p212">
	//  388 1831:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  389 1834:ifeq            2962
_L176:
		i = 72;
	//  390 1837:bipush          72
	//  391 1839:istore_2        
		  goto _L125
	//* 392 1840:goto            2964
_L70:
		if(!s.equals("mido")) goto _L5; else goto _L177
	//  393 1843:aload_1         
	//  394 1844:ldc2            #570 <String "mido">
	//  395 1847:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  396 1850:ifeq            2962
_L177:
		i = 65;
	//  397 1853:bipush          65
	//  398 1855:istore_2        
		  goto _L125
	//* 399 1856:goto            2964
_L69:
		if(!s.equals("XE2X")) goto _L5; else goto _L178
	//  400 1859:aload_1         
	//  401 1860:ldc2            #572 <String "XE2X">
	//  402 1863:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  403 1866:ifeq            2962
_L178:
		i = 114;
	//  404 1869:bipush          114
	//  405 1871:istore_2        
		  goto _L125
	//* 406 1872:goto            2964
_L68:
		if(!s.equals("Q427")) goto _L5; else goto _L179
	//  407 1875:aload_1         
	//  408 1876:ldc2            #574 <String "Q427">
	//  409 1879:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  410 1882:ifeq            2962
_L179:
		i = 90;
	//  411 1885:bipush          90
	//  412 1887:istore_2        
		  goto _L125
	//* 413 1888:goto            2964
_L67:
		if(!s.equals("Q350")) goto _L5; else goto _L180
	//  414 1891:aload_1         
	//  415 1892:ldc2            #576 <String "Q350">
	//  416 1895:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  417 1898:ifeq            2962
_L180:
		i = 88;
	//  418 1901:bipush          88
	//  419 1903:istore_2        
		  goto _L125
	//* 420 1904:goto            2964
_L66:
		if(!s.equals("P681")) goto _L5; else goto _L181
	//  421 1907:aload_1         
	//  422 1908:ldc2            #578 <String "P681">
	//  423 1911:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  424 1914:ifeq            2962
_L181:
		i = 73;
	//  425 1917:bipush          73
	//  426 1919:istore_2        
		  goto _L125
	//* 427 1920:goto            2964
_L65:
		if(!s.equals("1714")) goto _L5; else goto _L182
	//  428 1923:aload_1         
	//  429 1924:ldc2            #580 <String "1714">
	//  430 1927:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  431 1930:ifeq            2962
_L182:
		i = 2;
	//  432 1933:iconst_2        
	//  433 1934:istore_2        
		  goto _L125
	//* 434 1935:goto            2964
_L64:
		if(!s.equals("1713")) goto _L5; else goto _L183
	//  435 1938:aload_1         
	//  436 1939:ldc2            #582 <String "1713">
	//  437 1942:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  438 1945:ifeq            2962
_L183:
		i = 1;
	//  439 1948:iconst_1        
	//  440 1949:istore_2        
		  goto _L125
	//* 441 1950:goto            2964
_L63:
		if(!s.equals("1601")) goto _L5; else goto _L184
	//  442 1953:aload_1         
	//  443 1954:ldc2            #584 <String "1601">
	//  444 1957:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  445 1960:ifeq            2962
_L184:
		i = 0;
	//  446 1963:iconst_0        
	//  447 1964:istore_2        
		  goto _L125
	//* 448 1965:goto            2964
_L62:
		if(!s.equals("flo")) goto _L5; else goto _L185
	//  449 1968:aload_1         
	//  450 1969:ldc2            #586 <String "flo">
	//  451 1972:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  452 1975:ifeq            2962
_L185:
		i = 35;
	//  453 1978:bipush          35
	//  454 1980:istore_2        
		  goto _L125
	//* 455 1981:goto            2964
_L61:
		if(!s.equals("deb")) goto _L5; else goto _L186
	//  456 1984:aload_1         
	//  457 1985:ldc2            #588 <String "deb">
	//  458 1988:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  459 1991:ifeq            2962
_L186:
		i = 21;
	//  460 1994:bipush          21
	//  461 1996:istore_2        
		  goto _L125
	//* 462 1997:goto            2964
_L60:
		if(!s.equals("cv3")) goto _L5; else goto _L187
	//  463 2000:aload_1         
	//  464 2001:ldc2            #590 <String "cv3">
	//  465 2004:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  466 2007:ifeq            2962
_L187:
		i = 20;
	//  467 2010:bipush          20
	//  468 2012:istore_2        
		  goto _L125
	//* 469 2013:goto            2964
_L59:
		if(!s.equals("cv1")) goto _L5; else goto _L188
	//  470 2016:aload_1         
	//  471 2017:ldc2            #592 <String "cv1">
	//  472 2020:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  473 2023:ifeq            2962
_L188:
		i = 19;
	//  474 2026:bipush          19
	//  475 2028:istore_2        
		  goto _L125
	//* 476 2029:goto            2964
_L58:
		if(!s.equals("Z80")) goto _L5; else goto _L189
	//  477 2032:aload_1         
	//  478 2033:ldc2            #594 <String "Z80">
	//  479 2036:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  480 2039:ifeq            2962
_L189:
		i = 117;
	//  481 2042:bipush          117
	//  482 2044:istore_2        
		  goto _L125
	//* 483 2045:goto            2964
_L57:
		if(!s.equals("QX1")) goto _L5; else goto _L190
	//  484 2048:aload_1         
	//  485 2049:ldc2            #596 <String "QX1">
	//  486 2052:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  487 2055:ifeq            2962
_L190:
		i = 94;
	//  488 2058:bipush          94
	//  489 2060:istore_2        
		  goto _L125
	//* 490 2061:goto            2964
_L56:
		if(!s.equals("PLE")) goto _L5; else goto _L191
	//  491 2064:aload_1         
	//  492 2065:ldc2            #598 <String "PLE">
	//  493 2068:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  494 2071:ifeq            2962
_L191:
		i = 86;
	//  495 2074:bipush          86
	//  496 2076:istore_2        
		  goto _L125
	//* 497 2077:goto            2964
_L55:
		if(!s.equals("P85")) goto _L5; else goto _L192
	//  498 2080:aload_1         
	//  499 2081:ldc2            #600 <String "P85">
	//  500 2084:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  501 2087:ifeq            2962
_L192:
		i = 74;
	//  502 2090:bipush          74
	//  503 2092:istore_2        
		  goto _L125
	//* 504 2093:goto            2964
_L54:
		if(!s.equals("MX6")) goto _L5; else goto _L193
	//  505 2096:aload_1         
	//  506 2097:ldc2            #602 <String "MX6">
	//  507 2100:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  508 2103:ifeq            2962
_L193:
		i = 66;
	//  509 2106:bipush          66
	//  510 2108:istore_2        
		  goto _L125
	//* 511 2109:goto            2964
_L53:
		if(!s.equals("M5c")) goto _L5; else goto _L194
	//  512 2112:aload_1         
	//  513 2113:ldc2            #604 <String "M5c">
	//  514 2116:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  515 2119:ifeq            2962
_L194:
		i = 60;
	//  516 2122:bipush          60
	//  517 2124:istore_2        
		  goto _L125
	//* 518 2125:goto            2964
_L52:
		if(!s.equals("JGZ")) goto _L5; else goto _L195
	//  519 2128:aload_1         
	//  520 2129:ldc2            #606 <String "JGZ">
	//  521 2132:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  522 2135:ifeq            2962
_L195:
		i = 56;
	//  523 2138:bipush          56
	//  524 2140:istore_2        
		  goto _L125
	//* 525 2141:goto            2964
_L51:
		if(!s.equals("mh")) goto _L5; else goto _L196
	//  526 2144:aload_1         
	//  527 2145:ldc2            #608 <String "mh">
	//  528 2148:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  529 2151:ifeq            2962
_L196:
		i = 64;
	//  530 2154:bipush          64
	//  531 2156:istore_2        
		  goto _L125
	//* 532 2157:goto            2964
_L50:
		if(!s.equals("V5")) goto _L5; else goto _L197
	//  533 2160:aload_1         
	//  534 2161:ldc2            #610 <String "V5">
	//  535 2164:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  536 2167:ifeq            2962
_L197:
		i = 107;
	//  537 2170:bipush          107
	//  538 2172:istore_2        
		  goto _L125
	//* 539 2173:goto            2964
_L49:
		if(!s.equals("V1")) goto _L5; else goto _L198
	//  540 2176:aload_1         
	//  541 2177:ldc2            #612 <String "V1">
	//  542 2180:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  543 2183:ifeq            2962
_L198:
		i = 105;
	//  544 2186:bipush          105
	//  545 2188:istore_2        
		  goto _L125
	//* 546 2189:goto            2964
_L48:
		if(!s.equals("Q5")) goto _L5; else goto _L199
	//  547 2192:aload_1         
	//  548 2193:ldc2            #614 <String "Q5">
	//  549 2196:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  550 2199:ifeq            2962
_L199:
		i = 92;
	//  551 2202:bipush          92
	//  552 2204:istore_2        
		  goto _L125
	//* 553 2205:goto            2964
_L47:
		if(!s.equals("C1")) goto _L5; else goto _L200
	//  554 2208:aload_1         
	//  555 2209:ldc2            #616 <String "C1">
	//  556 2212:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  557 2215:ifeq            2962
_L200:
		i = 14;
	//  558 2218:bipush          14
	//  559 2220:istore_2        
		  goto _L125
	//* 560 2221:goto            2964
_L46:
		if(!s.equals("woods_fn")) goto _L5; else goto _L201
	//  561 2224:aload_1         
	//  562 2225:ldc2            #618 <String "woods_fn">
	//  563 2228:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  564 2231:ifeq            2962
_L201:
		i = 112;
	//  565 2234:bipush          112
	//  566 2236:istore_2        
		  goto _L125
	//* 567 2237:goto            2964
_L45:
		if(!s.equals("ELUGA_A3_Pro")) goto _L5; else goto _L202
	//  568 2240:aload_1         
	//  569 2241:ldc2            #620 <String "ELUGA_A3_Pro">
	//  570 2244:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  571 2247:ifeq            2962
_L202:
		i = 23;
	//  572 2250:bipush          23
	//  573 2252:istore_2        
		  goto _L125
	//* 574 2253:goto            2964
_L44:
		if(!s.equals("Z12_PRO")) goto _L5; else goto _L203
	//  575 2256:aload_1         
	//  576 2257:ldc2            #622 <String "Z12_PRO">
	//  577 2260:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  578 2263:ifeq            2962
_L203:
		i = 116;
	//  579 2266:bipush          116
	//  580 2268:istore_2        
		  goto _L125
	//* 581 2269:goto            2964
_L43:
		if(!s.equals("BLACK-1X")) goto _L5; else goto _L204
	//  582 2272:aload_1         
	//  583 2273:ldc2            #624 <String "BLACK-1X">
	//  584 2276:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  585 2279:ifeq            2962
_L204:
		i = 12;
	//  586 2282:bipush          12
	//  587 2284:istore_2        
		  goto _L125
	//* 588 2285:goto            2964
_L42:
		if(!s.equals("taido_row")) goto _L5; else goto _L205
	//  589 2288:aload_1         
	//  590 2289:ldc2            #626 <String "taido_row">
	//  591 2292:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  592 2295:ifeq            2962
_L205:
		i = 99;
	//  593 2298:bipush          99
	//  594 2300:istore_2        
		  goto _L125
	//* 595 2301:goto            2964
_L41:
		if(!s.equals("Pixi4-7_3G")) goto _L5; else goto _L206
	//  596 2304:aload_1         
	//  597 2305:ldc2            #628 <String "Pixi4-7_3G">
	//  598 2308:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  599 2311:ifeq            2962
_L206:
		i = 84;
	//  600 2314:bipush          84
	//  601 2316:istore_2        
		  goto _L125
	//* 602 2317:goto            2964
_L40:
		if(!s.equals("GIONEE_GBL7360")) goto _L5; else goto _L207
	//  603 2320:aload_1         
	//  604 2321:ldc2            #630 <String "GIONEE_GBL7360">
	//  605 2324:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  606 2327:ifeq            2962
_L207:
		i = 38;
	//  607 2330:bipush          38
	//  608 2332:istore_2        
		  goto _L125
	//* 609 2333:goto            2964
_L39:
		if(!s.equals("GiONEE_CBL7513")) goto _L5; else goto _L208
	//  610 2336:aload_1         
	//  611 2337:ldc2            #632 <String "GiONEE_CBL7513">
	//  612 2340:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  613 2343:ifeq            2962
_L208:
		i = 36;
	//  614 2346:bipush          36
	//  615 2348:istore_2        
		  goto _L125
	//* 616 2349:goto            2964
_L38:
		if(!s.equals("OnePlus5T")) goto _L5; else goto _L209
	//  617 2352:aload_1         
	//  618 2353:ldc2            #634 <String "OnePlus5T">
	//  619 2356:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  620 2359:ifeq            2962
_L209:
		i = 71;
	//  621 2362:bipush          71
	//  622 2364:istore_2        
		  goto _L125
	//* 623 2365:goto            2964
_L37:
		if(!s.equals("whyred")) goto _L5; else goto _L210
	//  624 2368:aload_1         
	//  625 2369:ldc2            #636 <String "whyred">
	//  626 2372:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  627 2375:ifeq            2962
_L210:
		i = 110;
	//  628 2378:bipush          110
	//  629 2380:istore_2        
		  goto _L125
	//* 630 2381:goto            2964
_L36:
		if(!s.equals("watson")) goto _L5; else goto _L211
	//  631 2384:aload_1         
	//  632 2385:ldc2            #638 <String "watson">
	//  633 2388:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  634 2391:ifeq            2962
_L211:
		i = 109;
	//  635 2394:bipush          109
	//  636 2396:istore_2        
		  goto _L125
	//* 637 2397:goto            2964
_L35:
		if(!s.equals("SVP-DTV15")) goto _L5; else goto _L212
	//  638 2400:aload_1         
	//  639 2401:ldc2            #640 <String "SVP-DTV15">
	//  640 2404:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  641 2407:ifeq            2962
_L212:
		i = 97;
	//  642 2410:bipush          97
	//  643 2412:istore_2        
		  goto _L125
	//* 644 2413:goto            2964
_L34:
		if(!s.equals("A7000-a")) goto _L5; else goto _L213
	//  645 2416:aload_1         
	//  646 2417:ldc2            #642 <String "A7000-a">
	//  647 2420:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  648 2423:ifeq            2962
_L213:
		i = 6;
	//  649 2426:bipush          6
	//  650 2428:istore_2        
		  goto _L125
	//* 651 2429:goto            2964
_L33:
		if(!s.equals("nicklaus_f")) goto _L5; else goto _L214
	//  652 2432:aload_1         
	//  653 2433:ldc2            #644 <String "nicklaus_f">
	//  654 2436:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  655 2439:ifeq            2962
_L214:
		i = 68;
	//  656 2442:bipush          68
	//  657 2444:istore_2        
		  goto _L125
	//* 658 2445:goto            2964
_L32:
		if(!s.equals("tcl_eu")) goto _L5; else goto _L215
	//  659 2448:aload_1         
	//  660 2449:ldc2            #646 <String "tcl_eu">
	//  661 2452:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  662 2455:ifeq            2962
_L215:
		i = 104;
	//  663 2458:bipush          104
	//  664 2460:istore_2        
		  goto _L125
	//* 665 2461:goto            2964
_L31:
		if(!s.equals("ELUGA_Ray_X")) goto _L5; else goto _L216
	//  666 2464:aload_1         
	//  667 2465:ldc2            #648 <String "ELUGA_Ray_X">
	//  668 2468:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  669 2471:ifeq            2962
_L216:
		i = 26;
	//  670 2474:bipush          26
	//  671 2476:istore_2        
		  goto _L125
	//* 672 2477:goto            2964
_L30:
		if(!s.equals("s905x018")) goto _L5; else goto _L217
	//  673 2480:aload_1         
	//  674 2481:ldc2            #650 <String "s905x018">
	//  675 2484:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  676 2487:ifeq            2962
_L217:
		i = 98;
	//  677 2490:bipush          98
	//  678 2492:istore_2        
		  goto _L125
	//* 679 2493:goto            2964
_L29:
		if(!s.equals("A10-70F")) goto _L5; else goto _L218
	//  680 2496:aload_1         
	//  681 2497:ldc2            #652 <String "A10-70F">
	//  682 2500:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  683 2503:ifeq            2962
_L218:
		i = 3;
	//  684 2506:iconst_3        
	//  685 2507:istore_2        
		  goto _L125
	//* 686 2508:goto            2964
_L28:
		if(!s.equals("namath")) goto _L5; else goto _L219
	//  687 2511:aload_1         
	//  688 2512:ldc2            #654 <String "namath">
	//  689 2515:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  690 2518:ifeq            2962
_L219:
		i = 67;
	//  691 2521:bipush          67
	//  692 2523:istore_2        
		  goto _L125
	//* 693 2524:goto            2964
_L27:
		if(!s.equals("Slate_Pro")) goto _L5; else goto _L220
	//  694 2527:aload_1         
	//  695 2528:ldc2            #656 <String "Slate_Pro">
	//  696 2531:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  697 2534:ifeq            2962
_L220:
		i = 96;
	//  698 2537:bipush          96
	//  699 2539:istore_2        
		  goto _L125
	//* 700 2540:goto            2964
_L26:
		if(!s.equals("iris60")) goto _L5; else goto _L221
	//  701 2543:aload_1         
	//  702 2544:ldc2            #658 <String "iris60">
	//  703 2547:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  704 2550:ifeq            2962
_L221:
		i = 53;
	//  705 2553:bipush          53
	//  706 2555:istore_2        
		  goto _L125
	//* 707 2556:goto            2964
_L25:
		if(!s.equals("BRAVIA_ATV2")) goto _L5; else goto _L222
	//  708 2559:aload_1         
	//  709 2560:ldc2            #660 <String "BRAVIA_ATV2">
	//  710 2563:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  711 2566:ifeq            2962
_L222:
		i = 13;
	//  712 2569:bipush          13
	//  713 2571:istore_2        
		  goto _L125
	//* 714 2572:goto            2964
_L24:
		if(!s.equals("GiONEE_GBL7319")) goto _L5; else goto _L223
	//  715 2575:aload_1         
	//  716 2576:ldc2            #662 <String "GiONEE_GBL7319">
	//  717 2579:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  718 2582:ifeq            2962
_L223:
		i = 37;
	//  719 2585:bipush          37
	//  720 2587:istore_2        
		  goto _L125
	//* 721 2588:goto            2964
_L23:
		if(!s.equals("panell_dt")) goto _L5; else goto _L224
	//  722 2591:aload_1         
	//  723 2592:ldc2            #664 <String "panell_dt">
	//  724 2595:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  725 2598:ifeq            2962
_L224:
		i = 78;
	//  726 2601:bipush          78
	//  727 2603:istore_2        
		  goto _L125
	//* 728 2604:goto            2964
_L22:
		if(!s.equals("panell_ds")) goto _L5; else goto _L225
	//  729 2607:aload_1         
	//  730 2608:ldc2            #666 <String "panell_ds">
	//  731 2611:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  732 2614:ifeq            2962
_L225:
		i = 77;
	//  733 2617:bipush          77
	//  734 2619:istore_2        
		  goto _L125
	//* 735 2620:goto            2964
_L21:
		if(!s.equals("panell_dl")) goto _L5; else goto _L226
	//  736 2623:aload_1         
	//  737 2624:ldc2            #668 <String "panell_dl">
	//  738 2627:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  739 2630:ifeq            2962
_L226:
		i = 76;
	//  740 2633:bipush          76
	//  741 2635:istore_2        
		  goto _L125
	//* 742 2636:goto            2964
_L20:
		if(!s.equals("vernee_M5")) goto _L5; else goto _L227
	//  743 2639:aload_1         
	//  744 2640:ldc2            #670 <String "vernee_M5">
	//  745 2643:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  746 2646:ifeq            2962
_L227:
		i = 108;
	//  747 2649:bipush          108
	//  748 2651:istore_2        
		  goto _L125
	//* 749 2652:goto            2964
_L19:
		if(!s.equals("Phantom6")) goto _L5; else goto _L228
	//  750 2655:aload_1         
	//  751 2656:ldc2            #672 <String "Phantom6">
	//  752 2659:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  753 2662:ifeq            2962
_L228:
		i = 83;
	//  754 2665:bipush          83
	//  755 2667:istore_2        
		  goto _L125
	//* 756 2668:goto            2964
_L18:
		if(!s.equals("ComioS1")) goto _L5; else goto _L229
	//  757 2671:aload_1         
	//  758 2672:ldc2            #674 <String "ComioS1">
	//  759 2675:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  760 2678:ifeq            2962
_L229:
		i = 15;
	//  761 2681:bipush          15
	//  762 2683:istore_2        
		  goto _L125
	//* 763 2684:goto            2964
_L17:
		if(!s.equals("XT1663")) goto _L5; else goto _L230
	//  764 2687:aload_1         
	//  765 2688:ldc2            #676 <String "XT1663">
	//  766 2691:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  767 2694:ifeq            2962
_L230:
		i = 115;
	//  768 2697:bipush          115
	//  769 2699:istore_2        
		  goto _L125
	//* 770 2700:goto            2964
_L16:
		if(!s.equals("AquaPowerM")) goto _L5; else goto _L231
	//  771 2703:aload_1         
	//  772 2704:ldc2            #678 <String "AquaPowerM">
	//  773 2707:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  774 2710:ifeq            2962
_L231:
		i = 10;
	//  775 2713:bipush          10
	//  776 2715:istore_2        
		  goto _L125
	//* 777 2716:goto            2964
_L15:
		if(!s.equals("PGN611")) goto _L5; else goto _L232
	//  778 2719:aload_1         
	//  779 2720:ldc2            #680 <String "PGN611">
	//  780 2723:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  781 2726:ifeq            2962
_L232:
		i = 82;
	//  782 2729:bipush          82
	//  783 2731:istore_2        
		  goto _L125
	//* 784 2732:goto            2964
_L14:
		if(!s.equals("PGN610")) goto _L5; else goto _L233
	//  785 2735:aload_1         
	//  786 2736:ldc2            #682 <String "PGN610">
	//  787 2739:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  788 2742:ifeq            2962
_L233:
		i = 81;
	//  789 2745:bipush          81
	//  790 2747:istore_2        
		  goto _L125
	//* 791 2748:goto            2964
_L13:
		if(!s.equals("PGN528")) goto _L5; else goto _L234
	//  792 2751:aload_1         
	//  793 2752:ldc2            #684 <String "PGN528">
	//  794 2755:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  795 2758:ifeq            2962
_L234:
		i = 80;
	//  796 2761:bipush          80
	//  797 2763:istore_2        
		  goto _L125
	//* 798 2764:goto            2964
_L12:
		if(!s.equals("NX573J")) goto _L5; else goto _L235
	//  799 2767:aload_1         
	//  800 2768:ldc2            #686 <String "NX573J">
	//  801 2771:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  802 2774:ifeq            2962
_L235:
		i = 70;
	//  803 2777:bipush          70
	//  804 2779:istore_2        
		  goto _L125
	//* 805 2780:goto            2964
_L11:
		if(!s.equals("NX541J")) goto _L5; else goto _L236
	//  806 2783:aload_1         
	//  807 2784:ldc2            #688 <String "NX541J">
	//  808 2787:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  809 2790:ifeq            2962
_L236:
		i = 69;
	//  810 2793:bipush          69
	//  811 2795:istore_2        
		  goto _L125
	//* 812 2796:goto            2964
_L10:
		if(!s.equals("CP8676_I02")) goto _L5; else goto _L237
	//  813 2799:aload_1         
	//  814 2800:ldc2            #690 <String "CP8676_I02">
	//  815 2803:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  816 2806:ifeq            2962
_L237:
		i = 16;
	//  817 2809:bipush          16
	//  818 2811:istore_2        
		  goto _L125
	//* 819 2812:goto            2964
_L9:
		if(!s.equals("K50a40")) goto _L5; else goto _L238
	//  820 2815:aload_1         
	//  821 2816:ldc2            #692 <String "K50a40">
	//  822 2819:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  823 2822:ifeq            2962
_L238:
		i = 57;
	//  824 2825:bipush          57
	//  825 2827:istore_2        
		  goto _L125
	//* 826 2828:goto            2964
_L8:
		if(!s.equals("GIONEE_SWW1631")) goto _L5; else goto _L239
	//  827 2831:aload_1         
	//  828 2832:ldc2            #694 <String "GIONEE_SWW1631">
	//  829 2835:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  830 2838:ifeq            2962
_L239:
		i = 41;
	//  831 2841:bipush          41
	//  832 2843:istore_2        
		  goto _L125
	//* 833 2844:goto            2964
_L7:
		if(!s.equals("GIONEE_SWW1627")) goto _L5; else goto _L240
	//  834 2847:aload_1         
	//  835 2848:ldc2            #696 <String "GIONEE_SWW1627">
	//  836 2851:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  837 2854:ifeq            2962
_L240:
		i = 40;
	//  838 2857:bipush          40
	//  839 2859:istore_2        
		  goto _L125
	//* 840 2860:goto            2964
_L6:
		if(!s.equals("GIONEE_SWW1609")) goto _L5; else goto _L241
	//  841 2863:aload_1         
	//  842 2864:ldc2            #698 <String "GIONEE_SWW1609">
	//  843 2867:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  844 2870:ifeq            2962
_L241:
		i = 39;
	//  845 2873:bipush          39
	//  846 2875:istore_2        
		  goto _L125
	//* 847 2876:goto            2964
_L252:
		deviceNeedsSetOutputSurfaceWorkaround = true;
	//  848 2879:iconst_1        
	//  849 2880:putstatic       #700 <Field boolean deviceNeedsSetOutputSurfaceWorkaround>
_L249:
		s = Util.MODEL;
	//  850 2883:getstatic       #332 <Field String Util.MODEL>
	//  851 2886:astore_1        
		i = s.hashCode();
	//  852 2887:aload_1         
	//  853 2888:invokevirtual   #315 <Method int String.hashCode()>
	//  854 2891:istore_2        
		if(i == 0x1e9d52) goto _L243; else goto _L242
	//  855 2892:iload_2         
	//  856 2893:ldc2            #701 <Int 0x1e9d52>
	//  857 2896:icmpeq          2924
_L242:
		if(i == 0x1e9d5f) goto _L245; else goto _L244
	//  858 2899:iload_2         
	//  859 2900:ldc2            #702 <Int 0x1e9d5f>
	//  860 2903:icmpeq          2909
	//* 861 2906:goto            3455
_L245:
		if(!s.equals("AFTN")) goto _L244; else goto _L246
	//  862 2909:aload_1         
	//  863 2910:ldc2            #704 <String "AFTN">
	//  864 2913:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  865 2916:ifeq            3455
_L246:
		i = 1;
	//  866 2919:iconst_1        
	//  867 2920:istore_2        
		  goto _L247
	//* 868 2921:goto            3457
_L243:
		if(!s.equals("AFTA")) goto _L244; else goto _L248
	//  869 2924:aload_1         
	//  870 2925:ldc2            #706 <String "AFTA">
	//  871 2928:invokevirtual   #178 <Method boolean String.equals(Object)>
	//  872 2931:ifeq            3455
_L248:
		i = ((int) (flag));
	//  873 2934:iload_3         
	//  874 2935:istore_2        
		  goto _L247
	//* 875 2936:goto            3457
_L256:
		deviceNeedsSetOutputSurfaceWorkaround = true;
	//  876 2939:iconst_1        
	//  877 2940:putstatic       #700 <Field boolean deviceNeedsSetOutputSurfaceWorkaround>
_L253:
		evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
	//  878 2943:iconst_1        
	//  879 2944:putstatic       #462 <Field boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround>
_L4:
		com/google/android/exoplayer2/video/MediaCodecVideoRenderer;
	//  880 2947:ldc1            #2   <Class MediaCodecVideoRenderer>
		JVM INSTR monitorexit ;
	//  881 2949:monitorexit     
		return deviceNeedsSetOutputSurfaceWorkaround;
	//  882 2950:getstatic       #700 <Field boolean deviceNeedsSetOutputSurfaceWorkaround>
	//  883 2953:ireturn         
		s;
	//  884 2954:astore_1        
		com/google/android/exoplayer2/video/MediaCodecVideoRenderer;
	//  885 2955:ldc1            #2   <Class MediaCodecVideoRenderer>
		JVM INSTR monitorexit ;
	//  886 2957:monitorexit     
		throw s;
	//  887 2958:aload_1         
	//  888 2959:athrow          
_L2:
		return false;
	//  889 2960:iconst_0        
	//  890 2961:ireturn         
_L5:
		i = -1;
	//  891 2962:iconst_m1       
	//  892 2963:istore_2        
_L125:
		i;
	//  893 2964:iload_2         
		JVM INSTR tableswitch 0 117: default 3452
	//	               0 2879
	//	               1 2879
	//	               2 2879
	//	               3 2879
	//	               4 2879
	//	               5 2879
	//	               6 2879
	//	               7 2879
	//	               8 2879
	//	               9 2879
	//	               10 2879
	//	               11 2879
	//	               12 2879
	//	               13 2879
	//	               14 2879
	//	               15 2879
	//	               16 2879
	//	               17 2879
	//	               18 2879
	//	               19 2879
	//	               20 2879
	//	               21 2879
	//	               22 2879
	//	               23 2879
	//	               24 2879
	//	               25 2879
	//	               26 2879
	//	               27 2879
	//	               28 2879
	//	               29 2879
	//	               30 2879
	//	               31 2879
	//	               32 2879
	//	               33 2879
	//	               34 2879
	//	               35 2879
	//	               36 2879
	//	               37 2879
	//	               38 2879
	//	               39 2879
	//	               40 2879
	//	               41 2879
	//	               42 2879
	//	               43 2879
	//	               44 2879
	//	               45 2879
	//	               46 2879
	//	               47 2879
	//	               48 2879
	//	               49 2879
	//	               50 2879
	//	               51 2879
	//	               52 2879
	//	               53 2879
	//	               54 2879
	//	               55 2879
	//	               56 2879
	//	               57 2879
	//	               58 2879
	//	               59 2879
	//	               60 2879
	//	               61 2879
	//	               62 2879
	//	               63 2879
	//	               64 2879
	//	               65 2879
	//	               66 2879
	//	               67 2879
	//	               68 2879
	//	               69 2879
	//	               70 2879
	//	               71 2879
	//	               72 2879
	//	               73 2879
	//	               74 2879
	//	               75 2879
	//	               76 2879
	//	               77 2879
	//	               78 2879
	//	               79 2879
	//	               80 2879
	//	               81 2879
	//	               82 2879
	//	               83 2879
	//	               84 2879
	//	               85 2879
	//	               86 2879
	//	               87 2879
	//	               88 2879
	//	               89 2879
	//	               90 2879
	//	               91 2879
	//	               92 2879
	//	               93 2879
	//	               94 2879
	//	               95 2879
	//	               96 2879
	//	               97 2879
	//	               98 2879
	//	               99 2879
	//	               100 2879
	//	               101 2879
	//	               102 2879
	//	               103 2879
	//	               104 2879
	//	               105 2879
	//	               106 2879
	//	               107 2879
	//	               108 2879
	//	               109 2879
	//	               110 2879
	//	               111 2879
	//	               112 2879
	//	               113 2879
	//	               114 2879
	//	               115 2879
	//	               116 2879
	//	               117 2879;
	//  894 2965:tableswitch     0 117: default 3452
	//	               0 2879
	//	               1 2879
	//	               2 2879
	//	               3 2879
	//	               4 2879
	//	               5 2879
	//	               6 2879
	//	               7 2879
	//	               8 2879
	//	               9 2879
	//	               10 2879
	//	               11 2879
	//	               12 2879
	//	               13 2879
	//	               14 2879
	//	               15 2879
	//	               16 2879
	//	               17 2879
	//	               18 2879
	//	               19 2879
	//	               20 2879
	//	               21 2879
	//	               22 2879
	//	               23 2879
	//	               24 2879
	//	               25 2879
	//	               26 2879
	//	               27 2879
	//	               28 2879
	//	               29 2879
	//	               30 2879
	//	               31 2879
	//	               32 2879
	//	               33 2879
	//	               34 2879
	//	               35 2879
	//	               36 2879
	//	               37 2879
	//	               38 2879
	//	               39 2879
	//	               40 2879
	//	               41 2879
	//	               42 2879
	//	               43 2879
	//	               44 2879
	//	               45 2879
	//	               46 2879
	//	               47 2879
	//	               48 2879
	//	               49 2879
	//	               50 2879
	//	               51 2879
	//	               52 2879
	//	               53 2879
	//	               54 2879
	//	               55 2879
	//	               56 2879
	//	               57 2879
	//	               58 2879
	//	               59 2879
	//	               60 2879
	//	               61 2879
	//	               62 2879
	//	               63 2879
	//	               64 2879
	//	               65 2879
	//	               66 2879
	//	               67 2879
	//	               68 2879
	//	               69 2879
	//	               70 2879
	//	               71 2879
	//	               72 2879
	//	               73 2879
	//	               74 2879
	//	               75 2879
	//	               76 2879
	//	               77 2879
	//	               78 2879
	//	               79 2879
	//	               80 2879
	//	               81 2879
	//	               82 2879
	//	               83 2879
	//	               84 2879
	//	               85 2879
	//	               86 2879
	//	               87 2879
	//	               88 2879
	//	               89 2879
	//	               90 2879
	//	               91 2879
	//	               92 2879
	//	               93 2879
	//	               94 2879
	//	               95 2879
	//	               96 2879
	//	               97 2879
	//	               98 2879
	//	               99 2879
	//	               100 2879
	//	               101 2879
	//	               102 2879
	//	               103 2879
	//	               104 2879
	//	               105 2879
	//	               106 2879
	//	               107 2879
	//	               108 2879
	//	               109 2879
	//	               110 2879
	//	               111 2879
	//	               112 2879
	//	               113 2879
	//	               114 2879
	//	               115 2879
	//	               116 2879
	//	               117 2879
		   goto _L249 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250 _L250
_L250:
		if(true) goto _L252; else goto _L251
_L251:
	//* 895 3452:goto            2883
_L244:
		i = -1;
	//  896 3455:iconst_m1       
	//  897 3456:istore_2        
_L247:
		i;
	//  898 3457:iload_2         
		JVM INSTR tableswitch 0 1: default 3480
	//	               0 2939
	//	               1 2939;
	//  899 3458:tableswitch     0 1: default 3480
	//	               0 2939
	//	               1 2939
		   goto _L253 _L254 _L254
_L254:
		if(true) goto _L256; else goto _L255
_L255:
	//* 900 3480:goto            2943
	}

	protected void configureCodec(MediaCodecInfo mediacodecinfo, MediaCodec mediacodec, Format format, MediaCrypto mediacrypto)
		throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException
	{
		codecMaxValues = getCodecMaxValues(mediacodecinfo, format, getStreamFormats());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_3         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #712 <Method Format[] getStreamFormats()>
	//    6    8:invokevirtual   #716 <Method MediaCodecVideoRenderer$CodecMaxValues getCodecMaxValues(MediaCodecInfo, Format, Format[])>
	//    7   11:putfield        #444 <Field MediaCodecVideoRenderer$CodecMaxValues codecMaxValues>
		format = ((Format) (getMediaFormat(format, codecMaxValues, deviceNeedsAutoFrcWorkaround, tunnelingAudioSessionId)));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #444 <Field MediaCodecVideoRenderer$CodecMaxValues codecMaxValues>
	//   12   20:aload_0         
	//   13   21:getfield        #137 <Field boolean deviceNeedsAutoFrcWorkaround>
	//   14   24:aload_0         
	//   15   25:getfield        #718 <Field int tunnelingAudioSessionId>
	//   16   28:invokevirtual   #722 <Method MediaFormat getMediaFormat(Format, MediaCodecVideoRenderer$CodecMaxValues, boolean, int)>
	//   17   31:astore_3        
		if(surface == null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #372 <Field Surface surface>
	//*  20   36:ifnonnull       77
		{
			Assertions.checkState(shouldUseDummySurface(mediacodecinfo));
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokespecial   #398 <Method boolean shouldUseDummySurface(MediaCodecInfo)>
	//   24   44:invokestatic    #728 <Method void Assertions.checkState(boolean)>
			if(dummySurface == null)
	//*  25   47:aload_0         
	//*  26   48:getfield        #390 <Field Surface dummySurface>
	//*  27   51:ifnonnull       69
				dummySurface = ((Surface) (DummySurface.newInstanceV17(context, mediacodecinfo.secure)));
	//   28   54:aload_0         
	//   29   55:aload_0         
	//   30   56:getfield        #118 <Field Context context>
	//   31   59:aload_1         
	//   32   60:getfield        #341 <Field boolean MediaCodecInfo.secure>
	//   33   63:invokestatic    #404 <Method DummySurface DummySurface.newInstanceV17(Context, boolean)>
	//   34   66:putfield        #390 <Field Surface dummySurface>
			surface = dummySurface;
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:getfield        #390 <Field Surface dummySurface>
	//   38   74:putfield        #372 <Field Surface surface>
		}
		mediacodec.configure(((MediaFormat) (format)), surface, mediacrypto, 0);
	//   39   77:aload_2         
	//   40   78:aload_3         
	//   41   79:aload_0         
	//   42   80:getfield        #372 <Field Surface surface>
	//   43   83:aload           4
	//   44   85:iconst_0        
	//   45   86:invokevirtual   #732 <Method void MediaCodec.configure(MediaFormat, Surface, MediaCrypto, int)>
		if(Util.SDK_INT >= 23 && tunneling)
	//*  46   89:getstatic       #203 <Field int Util.SDK_INT>
	//*  47   92:bipush          23
	//*  48   94:icmplt          118
	//*  49   97:aload_0         
	//*  50   98:getfield        #205 <Field boolean tunneling>
	//*  51  101:ifeq            118
			tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediacodec);
	//   52  104:aload_0         
	//   53  105:new             #11  <Class MediaCodecVideoRenderer$OnFrameRenderedListenerV23>
	//   54  108:dup             
	//   55  109:aload_0         
	//   56  110:aload_2         
	//   57  111:aconst_null     
	//   58  112:invokespecial   #212 <Method void MediaCodecVideoRenderer$OnFrameRenderedListenerV23(MediaCodecVideoRenderer, MediaCodec, MediaCodecVideoRenderer$1)>
	//   59  115:putfield        #214 <Field MediaCodecVideoRenderer$OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener>
	//   60  118:return          
	}

	protected void dropOutputBuffer(MediaCodec mediacodec, int i, long l)
	{
		TraceUtil.beginSection("dropVideoBuffer");
	//    0    0:ldc2            #736 <String "dropVideoBuffer">
	//    1    3:invokestatic    #742 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, false);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #746 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		TraceUtil.endSection();
	//    6   12:invokestatic    #749 <Method void TraceUtil.endSection()>
		updateDroppedBufferCounters(1);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #753 <Method void updateDroppedBufferCounters(int)>
	//   10   20:return          
	}

	protected void flushCodec()
		throws ExoPlaybackException
	{
		super.flushCodec();
	//    0    0:aload_0         
	//    1    1:invokespecial   #757 <Method void MediaCodecRenderer.flushCodec()>
		buffersInCodecCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #759 <Field int buffersInCodecCount>
	//    5    9:return          
	}

	protected CodecMaxValues getCodecMaxValues(MediaCodecInfo mediacodecinfo, Format format, Format aformat[])
		throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException
	{
		int k = format.width;
	//    0    0:aload_2         
	//    1    1:getfield        #184 <Field int Format.width>
	//    2    4:istore          6
		int j = format.height;
	//    3    6:aload_2         
	//    4    7:getfield        #187 <Field int Format.height>
	//    5   10:istore          5
		int i = getMaxInputSize(mediacodecinfo, format);
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokestatic    #448 <Method int getMaxInputSize(MediaCodecInfo, Format)>
	//    9   17:istore          4
		if(aformat.length == 1)
	//*  10   19:aload_3         
	//*  11   20:arraylength     
	//*  12   21:iconst_1        
	//*  13   22:icmpne          39
			return new CodecMaxValues(k, j, i);
	//   14   25:new             #8   <Class MediaCodecVideoRenderer$CodecMaxValues>
	//   15   28:dup             
	//   16   29:iload           6
	//   17   31:iload           5
	//   18   33:iload           4
	//   19   35:invokespecial   #762 <Method void MediaCodecVideoRenderer$CodecMaxValues(int, int, int)>
	//   20   38:areturn         
		int i3 = aformat.length;
	//   21   39:aload_3         
	//   22   40:arraylength     
	//   23   41:istore          13
		int j1 = 0;
	//   24   43:iconst_0        
	//   25   44:istore          8
		for(int l = j1; l < i3;)
	//*  26   46:iload           8
	//*  27   48:istore          7
	//*  28   50:iload           7
	//*  29   52:iload           13
	//*  30   54:icmpge          191
		{
			Format format1 = aformat[l];
	//   31   57:aload_3         
	//   32   58:iload           7
	//   33   60:aaload          
	//   34   61:astore          14
			int l2 = j1;
	//   35   63:iload           8
	//   36   65:istore          12
			int k2 = k;
	//   37   67:iload           6
	//   38   69:istore          11
			int i2 = j;
	//   39   71:iload           5
	//   40   73:istore          10
			int k1 = i;
	//   41   75:iload           4
	//   42   77:istore          9
			if(areAdaptationCompatible(mediacodecinfo.adaptive, format, format1))
	//*  43   79:aload_1         
	//*  44   80:getfield        #440 <Field boolean MediaCodecInfo.adaptive>
	//*  45   83:aload_2         
	//*  46   84:aload           14
	//*  47   86:invokestatic    #442 <Method boolean areAdaptationCompatible(boolean, Format, Format)>
	//*  48   89:ifeq            166
			{
				if(format1.width != -1 && format1.height != -1)
	//*  49   92:aload           14
	//*  50   94:getfield        #184 <Field int Format.width>
	//*  51   97:iconst_m1       
	//*  52   98:icmpeq          119
	//*  53  101:aload           14
	//*  54  103:getfield        #187 <Field int Format.height>
	//*  55  106:iconst_m1       
	//*  56  107:icmpne          113
	//*  57  110:goto            119
					k1 = 0;
	//   58  113:iconst_0        
	//   59  114:istore          9
				else
	//*  60  116:goto            122
					k1 = 1;
	//   61  119:iconst_1        
	//   62  120:istore          9
				l2 = j1 | k1;
	//   63  122:iload           8
	//   64  124:iload           9
	//   65  126:ior             
	//   66  127:istore          12
				k2 = Math.max(k, format1.width);
	//   67  129:iload           6
	//   68  131:aload           14
	//   69  133:getfield        #184 <Field int Format.width>
	//   70  136:invokestatic    #767 <Method int Math.max(int, int)>
	//   71  139:istore          11
				i2 = Math.max(j, format1.height);
	//   72  141:iload           5
	//   73  143:aload           14
	//   74  145:getfield        #187 <Field int Format.height>
	//   75  148:invokestatic    #767 <Method int Math.max(int, int)>
	//   76  151:istore          10
				k1 = Math.max(i, getMaxInputSize(mediacodecinfo, format1));
	//   77  153:iload           4
	//   78  155:aload_1         
	//   79  156:aload           14
	//   80  158:invokestatic    #448 <Method int getMaxInputSize(MediaCodecInfo, Format)>
	//   81  161:invokestatic    #767 <Method int Math.max(int, int)>
	//   82  164:istore          9
			}
			l++;
	//   83  166:iload           7
	//   84  168:iconst_1        
	//   85  169:iadd            
	//   86  170:istore          7
			j1 = l2;
	//   87  172:iload           12
	//   88  174:istore          8
			k = k2;
	//   89  176:iload           11
	//   90  178:istore          6
			j = i2;
	//   91  180:iload           10
	//   92  182:istore          5
			i = k1;
	//   93  184:iload           9
	//   94  186:istore          4
		}

	//*  95  188:goto            50
		int j2 = k;
	//   96  191:iload           6
	//   97  193:istore          10
		int l1 = j;
	//   98  195:iload           5
	//   99  197:istore          9
		int i1 = i;
	//  100  199:iload           4
	//  101  201:istore          7
		if(j1 != 0)
	//* 102  203:iload           8
	//* 103  205:ifeq            367
		{
			aformat = ((Format []) (new StringBuilder()));
	//  104  208:new             #769 <Class StringBuilder>
	//  105  211:dup             
	//  106  212:invokespecial   #771 <Method void StringBuilder()>
	//  107  215:astore_3        
			((StringBuilder) (aformat)).append("Resolutions unknown. Codec max resolution: ");
	//  108  216:aload_3         
	//  109  217:ldc2            #773 <String "Resolutions unknown. Codec max resolution: ">
	//  110  220:invokevirtual   #777 <Method StringBuilder StringBuilder.append(String)>
	//  111  223:pop             
			((StringBuilder) (aformat)).append(k);
	//  112  224:aload_3         
	//  113  225:iload           6
	//  114  227:invokevirtual   #780 <Method StringBuilder StringBuilder.append(int)>
	//  115  230:pop             
			((StringBuilder) (aformat)).append("x");
	//  116  231:aload_3         
	//  117  232:ldc2            #781 <String "x">
	//  118  235:invokevirtual   #777 <Method StringBuilder StringBuilder.append(String)>
	//  119  238:pop             
			((StringBuilder) (aformat)).append(j);
	//  120  239:aload_3         
	//  121  240:iload           5
	//  122  242:invokevirtual   #780 <Method StringBuilder StringBuilder.append(int)>
	//  123  245:pop             
			Log.w("MediaCodecVideoRenderer", ((StringBuilder) (aformat)).toString());
	//  124  246:ldc1            #36  <String "MediaCodecVideoRenderer">
	//  125  248:aload_3         
	//  126  249:invokevirtual   #785 <Method String StringBuilder.toString()>
	//  127  252:invokestatic    #791 <Method int Log.w(String, String)>
	//  128  255:pop             
			aformat = ((Format []) (getCodecMaxSize(mediacodecinfo, format)));
	//  129  256:aload_1         
	//  130  257:aload_2         
	//  131  258:invokestatic    #793 <Method Point getCodecMaxSize(MediaCodecInfo, Format)>
	//  132  261:astore_3        
			j2 = k;
	//  133  262:iload           6
	//  134  264:istore          10
			l1 = j;
	//  135  266:iload           5
	//  136  268:istore          9
			i1 = i;
	//  137  270:iload           4
	//  138  272:istore          7
			if(aformat != null)
	//* 139  274:aload_3         
	//* 140  275:ifnull          367
			{
				j2 = Math.max(k, ((Point) (aformat)).x);
	//  141  278:iload           6
	//  142  280:aload_3         
	//  143  281:getfield        #268 <Field int Point.x>
	//  144  284:invokestatic    #767 <Method int Math.max(int, int)>
	//  145  287:istore          10
				l1 = Math.max(j, ((Point) (aformat)).y);
	//  146  289:iload           5
	//  147  291:aload_3         
	//  148  292:getfield        #271 <Field int Point.y>
	//  149  295:invokestatic    #767 <Method int Math.max(int, int)>
	//  150  298:istore          9
				i1 = Math.max(i, getMaxInputSize(mediacodecinfo, format.sampleMimeType, j2, l1));
	//  151  300:iload           4
	//  152  302:aload_1         
	//  153  303:aload_2         
	//  154  304:getfield        #172 <Field String Format.sampleMimeType>
	//  155  307:iload           10
	//  156  309:iload           9
	//  157  311:invokestatic    #312 <Method int getMaxInputSize(MediaCodecInfo, String, int, int)>
	//  158  314:invokestatic    #767 <Method int Math.max(int, int)>
	//  159  317:istore          7
				mediacodecinfo = ((MediaCodecInfo) (new StringBuilder()));
	//  160  319:new             #769 <Class StringBuilder>
	//  161  322:dup             
	//  162  323:invokespecial   #771 <Method void StringBuilder()>
	//  163  326:astore_1        
				((StringBuilder) (mediacodecinfo)).append("Codec max resolution adjusted to: ");
	//  164  327:aload_1         
	//  165  328:ldc2            #795 <String "Codec max resolution adjusted to: ">
	//  166  331:invokevirtual   #777 <Method StringBuilder StringBuilder.append(String)>
	//  167  334:pop             
				((StringBuilder) (mediacodecinfo)).append(j2);
	//  168  335:aload_1         
	//  169  336:iload           10
	//  170  338:invokevirtual   #780 <Method StringBuilder StringBuilder.append(int)>
	//  171  341:pop             
				((StringBuilder) (mediacodecinfo)).append("x");
	//  172  342:aload_1         
	//  173  343:ldc2            #781 <String "x">
	//  174  346:invokevirtual   #777 <Method StringBuilder StringBuilder.append(String)>
	//  175  349:pop             
				((StringBuilder) (mediacodecinfo)).append(l1);
	//  176  350:aload_1         
	//  177  351:iload           9
	//  178  353:invokevirtual   #780 <Method StringBuilder StringBuilder.append(int)>
	//  179  356:pop             
				Log.w("MediaCodecVideoRenderer", ((StringBuilder) (mediacodecinfo)).toString());
	//  180  357:ldc1            #36  <String "MediaCodecVideoRenderer">
	//  181  359:aload_1         
	//  182  360:invokevirtual   #785 <Method String StringBuilder.toString()>
	//  183  363:invokestatic    #791 <Method int Log.w(String, String)>
	//  184  366:pop             
			}
		}
		return new CodecMaxValues(j2, l1, i1);
	//  185  367:new             #8   <Class MediaCodecVideoRenderer$CodecMaxValues>
	//  186  370:dup             
	//  187  371:iload           10
	//  188  373:iload           9
	//  189  375:iload           7
	//  190  377:invokespecial   #762 <Method void MediaCodecVideoRenderer$CodecMaxValues(int, int, int)>
	//  191  380:areturn         
	}

	protected MediaFormat getMediaFormat(Format format, CodecMaxValues codecmaxvalues, boolean flag, int i)
	{
		MediaFormat mediaformat = new MediaFormat();
	//    0    0:new             #229 <Class MediaFormat>
	//    1    3:dup             
	//    2    4:invokespecial   #798 <Method void MediaFormat()>
	//    3    7:astore          5
		mediaformat.setString("mime", format.sampleMimeType);
	//    4    9:aload           5
	//    5   11:ldc2            #800 <String "mime">
	//    6   14:aload_1         
	//    7   15:getfield        #172 <Field String Format.sampleMimeType>
	//    8   18:invokevirtual   #804 <Method void MediaFormat.setString(String, String)>
		mediaformat.setInteger("width", format.width);
	//    9   21:aload           5
	//   10   23:ldc2            #805 <String "width">
	//   11   26:aload_1         
	//   12   27:getfield        #184 <Field int Format.width>
	//   13   30:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
		mediaformat.setInteger("height", format.height);
	//   14   33:aload           5
	//   15   35:ldc2            #806 <String "height">
	//   16   38:aload_1         
	//   17   39:getfield        #187 <Field int Format.height>
	//   18   42:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
		MediaFormatUtil.setCsdBuffers(mediaformat, format.initializationData);
	//   19   45:aload           5
	//   20   47:aload_1         
	//   21   48:getfield        #298 <Field List Format.initializationData>
	//   22   51:invokestatic    #812 <Method void MediaFormatUtil.setCsdBuffers(MediaFormat, List)>
		MediaFormatUtil.maybeSetFloat(mediaformat, "frame-rate", format.frameRate);
	//   23   54:aload           5
	//   24   56:ldc2            #814 <String "frame-rate">
	//   25   59:aload_1         
	//   26   60:getfield        #263 <Field float Format.frameRate>
	//   27   63:invokestatic    #818 <Method void MediaFormatUtil.maybeSetFloat(MediaFormat, String, float)>
		MediaFormatUtil.maybeSetInteger(mediaformat, "rotation-degrees", format.rotationDegrees);
	//   28   66:aload           5
	//   29   68:ldc2            #820 <String "rotation-degrees">
	//   30   71:aload_1         
	//   31   72:getfield        #181 <Field int Format.rotationDegrees>
	//   32   75:invokestatic    #824 <Method void MediaFormatUtil.maybeSetInteger(MediaFormat, String, int)>
		MediaFormatUtil.maybeSetColorInfo(mediaformat, format.colorInfo);
	//   33   78:aload           5
	//   34   80:aload_1         
	//   35   81:getfield        #191 <Field ColorInfo Format.colorInfo>
	//   36   84:invokestatic    #828 <Method void MediaFormatUtil.maybeSetColorInfo(MediaFormat, ColorInfo)>
		mediaformat.setInteger("max-width", codecmaxvalues.width);
	//   37   87:aload           5
	//   38   89:ldc2            #830 <String "max-width">
	//   39   92:aload_2         
	//   40   93:getfield        #445 <Field int MediaCodecVideoRenderer$CodecMaxValues.width>
	//   41   96:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
		mediaformat.setInteger("max-height", codecmaxvalues.height);
	//   42   99:aload           5
	//   43  101:ldc2            #832 <String "max-height">
	//   44  104:aload_2         
	//   45  105:getfield        #446 <Field int MediaCodecVideoRenderer$CodecMaxValues.height>
	//   46  108:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
		MediaFormatUtil.maybeSetInteger(mediaformat, "max-input-size", codecmaxvalues.inputSize);
	//   47  111:aload           5
	//   48  113:ldc2            #834 <String "max-input-size">
	//   49  116:aload_2         
	//   50  117:getfield        #451 <Field int MediaCodecVideoRenderer$CodecMaxValues.inputSize>
	//   51  120:invokestatic    #824 <Method void MediaFormatUtil.maybeSetInteger(MediaFormat, String, int)>
		if(Util.SDK_INT >= 23)
	//*  52  123:getstatic       #203 <Field int Util.SDK_INT>
	//*  53  126:bipush          23
	//*  54  128:icmplt          140
			mediaformat.setInteger("priority", 0);
	//   55  131:aload           5
	//   56  133:ldc2            #836 <String "priority">
	//   57  136:iconst_0        
	//   58  137:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
		if(flag)
	//*  59  140:iload_3         
	//*  60  141:ifeq            153
			mediaformat.setInteger("auto-frc", 0);
	//   61  144:aload           5
	//   62  146:ldc2            #838 <String "auto-frc">
	//   63  149:iconst_0        
	//   64  150:invokevirtual   #239 <Method void MediaFormat.setInteger(String, int)>
		if(i != 0)
	//*  65  153:iload           4
	//*  66  155:ifeq            165
			configureTunnelingV21(mediaformat, i);
	//   67  158:aload           5
	//   68  160:iload           4
	//   69  162:invokestatic    #840 <Method void configureTunnelingV21(MediaFormat, int)>
		return mediaformat;
	//   70  165:aload           5
	//   71  167:areturn         
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
	//    5    7:checkcast       #844 <Class Surface>
	//    6   10:invokespecial   #846 <Method void setSurface(Surface)>
			return;
	//    7   13:return          
		}
		if(i == 4)
	//*   8   14:iload_1         
	//*   9   15:iconst_4        
	//*  10   16:icmpne          48
		{
			scalingMode = ((Integer)obj).intValue();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:checkcast       #848 <Class Integer>
	//   14   24:invokevirtual   #851 <Method int Integer.intValue()>
	//   15   27:putfield        #160 <Field int scalingMode>
			obj = ((Object) (getCodec()));
	//   16   30:aload_0         
	//   17   31:invokevirtual   #209 <Method MediaCodec getCodec()>
	//   18   34:astore_2        
			if(obj != null)
	//*  19   35:aload_2         
	//*  20   36:ifnull          54
			{
				((MediaCodec) (obj)).setVideoScalingMode(scalingMode);
	//   21   39:aload_2         
	//   22   40:aload_0         
	//   23   41:getfield        #160 <Field int scalingMode>
	//   24   44:invokevirtual   #854 <Method void MediaCodec.setVideoScalingMode(int)>
				return;
	//   25   47:return          
			}
		} else
		{
			super.handleMessage(i, obj);
	//   26   48:aload_0         
	//   27   49:iload_1         
	//   28   50:aload_2         
	//   29   51:invokespecial   #856 <Method void MediaCodecRenderer.handleMessage(int, Object)>
		}
	//   30   54:return          
	}

	public boolean isReady()
	{
		if(super.isReady() && (renderedFirstFrame || dummySurface != null && surface == dummySurface || getCodec() == null || tunneling))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #859 <Method boolean MediaCodecRenderer.isReady()>
	//*   2    4:ifeq            55
	//*   3    7:aload_0         
	//*   4    8:getfield        #200 <Field boolean renderedFirstFrame>
	//*   5   11:ifne            46
	//*   6   14:aload_0         
	//*   7   15:getfield        #390 <Field Surface dummySurface>
	//*   8   18:ifnull          32
	//*   9   21:aload_0         
	//*  10   22:getfield        #372 <Field Surface surface>
	//*  11   25:aload_0         
	//*  12   26:getfield        #390 <Field Surface dummySurface>
	//*  13   29:if_acmpeq       46
	//*  14   32:aload_0         
	//*  15   33:invokevirtual   #209 <Method MediaCodec getCodec()>
	//*  16   36:ifnull          46
	//*  17   39:aload_0         
	//*  18   40:getfield        #205 <Field boolean tunneling>
	//*  19   43:ifeq            55
		{
			joiningDeadlineMs = 0x1L;
	//   20   46:aload_0         
	//   21   47:ldc2w           #142 <Long 0x1L>
	//   22   50:putfield        #149 <Field long joiningDeadlineMs>
			return true;
	//   23   53:iconst_1        
	//   24   54:ireturn         
		}
		if(joiningDeadlineMs == 0x1L)
	//*  25   55:aload_0         
	//*  26   56:getfield        #149 <Field long joiningDeadlineMs>
	//*  27   59:ldc2w           #142 <Long 0x1L>
	//*  28   62:lcmp            
	//*  29   63:ifne            68
			return false;
	//   30   66:iconst_0        
	//   31   67:ireturn         
		if(SystemClock.elapsedRealtime() < joiningDeadlineMs)
	//*  32   68:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//*  33   71:aload_0         
	//*  34   72:getfield        #149 <Field long joiningDeadlineMs>
	//*  35   75:lcmp            
	//*  36   76:ifge            81
		{
			return true;
	//   37   79:iconst_1        
	//   38   80:ireturn         
		} else
		{
			joiningDeadlineMs = 0x1L;
	//   39   81:aload_0         
	//   40   82:ldc2w           #142 <Long 0x1L>
	//   41   85:putfield        #149 <Field long joiningDeadlineMs>
			return false;
	//   42   88:iconst_0        
	//   43   89:ireturn         
		}
	}

	protected boolean maybeDropBuffersToKeyframe(MediaCodec mediacodec, int i, long l, long l1)
		throws ExoPlaybackException
	{
		i = skipSource(l1);
	//    0    0:aload_0         
	//    1    1:lload           5
	//    2    3:invokevirtual   #865 <Method int skipSource(long)>
	//    3    6:istore_2        
		if(i == 0)
	//*   4    7:iload_2         
	//*   5    8:ifne            13
		{
			return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
		} else
		{
			mediacodec = ((MediaCodec) (decoderCounters));
	//    8   13:aload_0         
	//    9   14:getfield        #869 <Field DecoderCounters decoderCounters>
	//   10   17:astore_1        
			mediacodec.droppedToKeyframeCount = ((DecoderCounters) (mediacodec)).droppedToKeyframeCount + 1;
	//   11   18:aload_1         
	//   12   19:aload_1         
	//   13   20:getfield        #874 <Field int DecoderCounters.droppedToKeyframeCount>
	//   14   23:iconst_1        
	//   15   24:iadd            
	//   16   25:putfield        #874 <Field int DecoderCounters.droppedToKeyframeCount>
			updateDroppedBufferCounters(buffersInCodecCount + i);
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #759 <Field int buffersInCodecCount>
	//   20   33:iload_2         
	//   21   34:iadd            
	//   22   35:invokevirtual   #753 <Method void updateDroppedBufferCounters(int)>
			flushCodec();
	//   23   38:aload_0         
	//   24   39:invokevirtual   #875 <Method void flushCodec()>
			return true;
	//   25   42:iconst_1        
	//   26   43:ireturn         
		}
	}

	void maybeNotifyRenderedFirstFrame()
	{
		if(!renderedFirstFrame)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field boolean renderedFirstFrame>
	//*   2    4:ifne            23
		{
			renderedFirstFrame = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #200 <Field boolean renderedFirstFrame>
			eventDispatcher.renderedFirstFrame(surface);
	//    6   12:aload_0         
	//    7   13:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//    8   16:aload_0         
	//    9   17:getfield        #372 <Field Surface surface>
	//   10   20:invokevirtual   #375 <Method void VideoRendererEventListener$EventDispatcher.renderedFirstFrame(Surface)>
		}
	//   11   23:return          
	}

	protected void onCodecInitialized(String s, long l, long l1)
	{
		eventDispatcher.decoderInitialized(s, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #881 <Method void VideoRendererEventListener$EventDispatcher.decoderInitialized(String, long, long)>
		codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(s);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokevirtual   #431 <Method boolean codecNeedsSetOutputSurfaceWorkaround(String)>
	//   10   17:putfield        #409 <Field boolean codecNeedsSetOutputSurfaceWorkaround>
	//   11   20:return          
	}

	protected void onDisabled()
	{
		currentWidth = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #151 <Field int currentWidth>
		currentHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #153 <Field int currentHeight>
		currentPixelWidthHeightRatio = -1F;
	//    6   10:aload_0         
	//    7   11:ldc1            #154 <Float -1F>
	//    8   13:putfield        #156 <Field float currentPixelWidthHeightRatio>
		pendingPixelWidthHeightRatio = -1F;
	//    9   16:aload_0         
	//   10   17:ldc1            #154 <Float -1F>
	//   11   19:putfield        #158 <Field float pendingPixelWidthHeightRatio>
		outputStreamOffsetUs = 0x1L;
	//   12   22:aload_0         
	//   13   23:ldc2w           #142 <Long 0x1L>
	//   14   26:putfield        #145 <Field long outputStreamOffsetUs>
		lastInputTimeUs = 0x1L;
	//   15   29:aload_0         
	//   16   30:ldc2w           #142 <Long 0x1L>
	//   17   33:putfield        #147 <Field long lastInputTimeUs>
		pendingOutputStreamOffsetCount = 0;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #884 <Field int pendingOutputStreamOffsetCount>
		clearReportedVideoSize();
	//   21   41:aload_0         
	//   22   42:invokespecial   #163 <Method void clearReportedVideoSize()>
		clearRenderedFirstFrame();
	//   23   45:aload_0         
	//   24   46:invokespecial   #421 <Method void clearRenderedFirstFrame()>
		frameReleaseTimeHelper.disable();
	//   25   49:aload_0         
	//   26   50:getfield        #125 <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
	//   27   53:invokevirtual   #887 <Method void VideoFrameReleaseTimeHelper.disable()>
		tunnelingOnFrameRenderedListener = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #214 <Field MediaCodecVideoRenderer$OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener>
		tunneling = false;
	//   31   61:aload_0         
	//   32   62:iconst_0        
	//   33   63:putfield        #205 <Field boolean tunneling>
		super.onDisabled();
	//   34   66:aload_0         
	//   35   67:invokespecial   #889 <Method void MediaCodecRenderer.onDisabled()>
		decoderCounters.ensureUpdated();
	//   36   70:aload_0         
	//   37   71:getfield        #869 <Field DecoderCounters decoderCounters>
	//   38   74:invokevirtual   #892 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   39   77:aload_0         
	//   40   78:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//   41   81:aload_0         
	//   42   82:getfield        #869 <Field DecoderCounters decoderCounters>
	//   43   85:invokevirtual   #896 <Method void VideoRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		return;
	//   44   88:return          
		Exception exception;
		exception;
	//   45   89:astore_1        
		decoderCounters.ensureUpdated();
	//   46   90:aload_0         
	//   47   91:getfield        #869 <Field DecoderCounters decoderCounters>
	//   48   94:invokevirtual   #892 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   49   97:aload_0         
	//   50   98:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//   51  101:aload_0         
	//   52  102:getfield        #869 <Field DecoderCounters decoderCounters>
	//   53  105:invokevirtual   #896 <Method void VideoRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//   54  108:aload_1         
	//   55  109:athrow          
	}

	protected void onEnabled(boolean flag)
		throws ExoPlaybackException
	{
		super.onEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #899 <Method void MediaCodecRenderer.onEnabled(boolean)>
		tunnelingAudioSessionId = getConfiguration().tunnelingAudioSessionId;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #903 <Method RendererConfiguration getConfiguration()>
	//    6   10:getfield        #906 <Field int RendererConfiguration.tunnelingAudioSessionId>
	//    7   13:putfield        #718 <Field int tunnelingAudioSessionId>
		if(tunnelingAudioSessionId != 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #718 <Field int tunnelingAudioSessionId>
	//*  10   20:ifeq            28
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		tunneling = flag;
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:putfield        #205 <Field boolean tunneling>
		eventDispatcher.enabled(decoderCounters);
	//   19   35:aload_0         
	//   20   36:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//   21   39:aload_0         
	//   22   40:getfield        #869 <Field DecoderCounters decoderCounters>
	//   23   43:invokevirtual   #909 <Method void VideoRendererEventListener$EventDispatcher.enabled(DecoderCounters)>
		frameReleaseTimeHelper.enable();
	//   24   46:aload_0         
	//   25   47:getfield        #125 <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
	//   26   50:invokevirtual   #912 <Method void VideoFrameReleaseTimeHelper.enable()>
	//   27   53:return          
	}

	protected void onInputFormatChanged(Format format)
		throws ExoPlaybackException
	{
		super.onInputFormatChanged(format);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #916 <Method void MediaCodecRenderer.onInputFormatChanged(Format)>
		eventDispatcher.inputFormatChanged(format);
	//    3    5:aload_0         
	//    4    6:getfield        #132 <Field VideoRendererEventListener$EventDispatcher eventDispatcher>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #919 <Method void VideoRendererEventListener$EventDispatcher.inputFormatChanged(Format)>
		pendingPixelWidthHeightRatio = format.pixelWidthHeightRatio;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #922 <Field float Format.pixelWidthHeightRatio>
	//   10   18:putfield        #158 <Field float pendingPixelWidthHeightRatio>
		pendingRotationDegrees = format.rotationDegrees;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #181 <Field int Format.rotationDegrees>
	//   14   26:putfield        #924 <Field int pendingRotationDegrees>
	//   15   29:return          
	}

	protected void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		boolean flag;
		if(mediaformat.containsKey("crop-right") && mediaformat.containsKey("crop-left") && mediaformat.containsKey("crop-bottom") && mediaformat.containsKey("crop-top"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #25  <String "crop-right">
	//*   2    3:invokevirtual   #929 <Method boolean MediaFormat.containsKey(String)>
	//*   3    6:ifeq            41
	//*   4    9:aload_2         
	//*   5   10:ldc1            #22  <String "crop-left">
	//*   6   12:invokevirtual   #929 <Method boolean MediaFormat.containsKey(String)>
	//*   7   15:ifeq            41
	//*   8   18:aload_2         
	//*   9   19:ldc1            #19  <String "crop-bottom">
	//*  10   21:invokevirtual   #929 <Method boolean MediaFormat.containsKey(String)>
	//*  11   24:ifeq            41
	//*  12   27:aload_2         
	//*  13   28:ldc1            #28  <String "crop-top">
	//*  14   30:invokevirtual   #929 <Method boolean MediaFormat.containsKey(String)>
	//*  15   33:ifeq            41
			flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_3        
		else
	//*  18   38:goto            43
			flag = false;
	//   19   41:iconst_0        
	//   20   42:istore_3        
		int k;
		if(flag)
	//*  21   43:iload_3         
	//*  22   44:ifeq            67
			k = (mediaformat.getInteger("crop-right") - mediaformat.getInteger("crop-left")) + 1;
	//   23   47:aload_2         
	//   24   48:ldc1            #25  <String "crop-right">
	//   25   50:invokevirtual   #933 <Method int MediaFormat.getInteger(String)>
	//   26   53:aload_2         
	//   27   54:ldc1            #22  <String "crop-left">
	//   28   56:invokevirtual   #933 <Method int MediaFormat.getInteger(String)>
	//   29   59:isub            
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore          4
		else
	//*  33   64:goto            76
			k = mediaformat.getInteger("width");
	//   34   67:aload_2         
	//   35   68:ldc2            #805 <String "width">
	//   36   71:invokevirtual   #933 <Method int MediaFormat.getInteger(String)>
	//   37   74:istore          4
		currentWidth = k;
	//   38   76:aload_0         
	//   39   77:iload           4
	//   40   79:putfield        #151 <Field int currentWidth>
		int i;
		if(flag)
	//*  41   82:iload_3         
	//*  42   83:ifeq            105
			i = (mediaformat.getInteger("crop-bottom") - mediaformat.getInteger("crop-top")) + 1;
	//   43   86:aload_2         
	//   44   87:ldc1            #19  <String "crop-bottom">
	//   45   89:invokevirtual   #933 <Method int MediaFormat.getInteger(String)>
	//   46   92:aload_2         
	//   47   93:ldc1            #28  <String "crop-top">
	//   48   95:invokevirtual   #933 <Method int MediaFormat.getInteger(String)>
	//   49   98:isub            
	//   50   99:iconst_1        
	//   51  100:iadd            
	//   52  101:istore_3        
		else
	//*  53  102:goto            113
			i = mediaformat.getInteger("height");
	//   54  105:aload_2         
	//   55  106:ldc2            #806 <String "height">
	//   56  109:invokevirtual   #933 <Method int MediaFormat.getInteger(String)>
	//   57  112:istore_3        
		currentHeight = i;
	//   58  113:aload_0         
	//   59  114:iload_3         
	//   60  115:putfield        #153 <Field int currentHeight>
		currentPixelWidthHeightRatio = pendingPixelWidthHeightRatio;
	//   61  118:aload_0         
	//   62  119:aload_0         
	//   63  120:getfield        #158 <Field float pendingPixelWidthHeightRatio>
	//   64  123:putfield        #156 <Field float currentPixelWidthHeightRatio>
		if(Util.SDK_INT >= 21)
	//*  65  126:getstatic       #203 <Field int Util.SDK_INT>
	//*  66  129:bipush          21
	//*  67  131:icmplt          184
		{
			if(pendingRotationDegrees == 90 || pendingRotationDegrees == 270)
	//*  68  134:aload_0         
	//*  69  135:getfield        #924 <Field int pendingRotationDegrees>
	//*  70  138:bipush          90
	//*  71  140:icmpeq          153
	//*  72  143:aload_0         
	//*  73  144:getfield        #924 <Field int pendingRotationDegrees>
	//*  74  147:sipush          270
	//*  75  150:icmpne          192
			{
				int j = currentWidth;
	//   76  153:aload_0         
	//   77  154:getfield        #151 <Field int currentWidth>
	//   78  157:istore_3        
				currentWidth = currentHeight;
	//   79  158:aload_0         
	//   80  159:aload_0         
	//   81  160:getfield        #153 <Field int currentHeight>
	//   82  163:putfield        #151 <Field int currentWidth>
				currentHeight = j;
	//   83  166:aload_0         
	//   84  167:iload_3         
	//   85  168:putfield        #153 <Field int currentHeight>
				currentPixelWidthHeightRatio = 1.0F / currentPixelWidthHeightRatio;
	//   86  171:aload_0         
	//   87  172:fconst_1        
	//   88  173:aload_0         
	//   89  174:getfield        #156 <Field float currentPixelWidthHeightRatio>
	//   90  177:fdiv            
	//   91  178:putfield        #156 <Field float currentPixelWidthHeightRatio>
			}
		} else
	//*  92  181:goto            192
		{
			currentUnappliedRotationDegrees = pendingRotationDegrees;
	//   93  184:aload_0         
	//   94  185:aload_0         
	//   95  186:getfield        #924 <Field int pendingRotationDegrees>
	//   96  189:putfield        #365 <Field int currentUnappliedRotationDegrees>
		}
		mediacodec.setVideoScalingMode(scalingMode);
	//   97  192:aload_1         
	//   98  193:aload_0         
	//   99  194:getfield        #160 <Field int scalingMode>
	//  100  197:invokevirtual   #854 <Method void MediaCodec.setVideoScalingMode(int)>
	//  101  200:return          
	}

	protected void onPositionReset(long l, boolean flag)
		throws ExoPlaybackException
	{
		super.onPositionReset(l, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #937 <Method void MediaCodecRenderer.onPositionReset(long, boolean)>
		clearRenderedFirstFrame();
	//    4    6:aload_0         
	//    5    7:invokespecial   #421 <Method void clearRenderedFirstFrame()>
		initialPositionUs = 0x1L;
	//    6   10:aload_0         
	//    7   11:ldc2w           #142 <Long 0x1L>
	//    8   14:putfield        #939 <Field long initialPositionUs>
		consecutiveDroppedFrameCount = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #941 <Field int consecutiveDroppedFrameCount>
		lastInputTimeUs = 0x1L;
	//   12   22:aload_0         
	//   13   23:ldc2w           #142 <Long 0x1L>
	//   14   26:putfield        #147 <Field long lastInputTimeUs>
		if(pendingOutputStreamOffsetCount != 0)
	//*  15   29:aload_0         
	//*  16   30:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//*  17   33:ifeq            56
		{
			outputStreamOffsetUs = pendingOutputStreamOffsetsUs[pendingOutputStreamOffsetCount - 1];
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//   21   41:aload_0         
	//   22   42:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   23   45:iconst_1        
	//   24   46:isub            
	//   25   47:laload          
	//   26   48:putfield        #145 <Field long outputStreamOffsetUs>
			pendingOutputStreamOffsetCount = 0;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #884 <Field int pendingOutputStreamOffsetCount>
		}
		if(flag)
	//*  30   56:iload_3         
	//*  31   57:ifeq            65
		{
			setJoiningDeadlineMs();
	//   32   60:aload_0         
	//   33   61:invokespecial   #423 <Method void setJoiningDeadlineMs()>
			return;
	//   34   64:return          
		} else
		{
			joiningDeadlineMs = 0x1L;
	//   35   65:aload_0         
	//   36   66:ldc2w           #142 <Long 0x1L>
	//   37   69:putfield        #149 <Field long joiningDeadlineMs>
			return;
	//   38   72:return          
		}
	}

	protected void onProcessedOutputBuffer(long l)
	{
		buffersInCodecCount = buffersInCodecCount - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #759 <Field int buffersInCodecCount>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #759 <Field int buffersInCodecCount>
		while(pendingOutputStreamOffsetCount != 0 && l >= pendingOutputStreamSwitchTimesUs[0]) 
	//*   6   10:aload_0         
	//*   7   11:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//*   8   14:ifeq            85
	//*   9   17:lload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #141 <Field long[] pendingOutputStreamSwitchTimesUs>
	//*  12   22:iconst_0        
	//*  13   23:laload          
	//*  14   24:lcmp            
	//*  15   25:iflt            85
		{
			outputStreamOffsetUs = pendingOutputStreamOffsetsUs[0];
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//   19   33:iconst_0        
	//   20   34:laload          
	//   21   35:putfield        #145 <Field long outputStreamOffsetUs>
			pendingOutputStreamOffsetCount = pendingOutputStreamOffsetCount - 1;
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   25   43:iconst_1        
	//   26   44:isub            
	//   27   45:putfield        #884 <Field int pendingOutputStreamOffsetCount>
			System.arraycopy(((Object) (pendingOutputStreamOffsetsUs)), 1, ((Object) (pendingOutputStreamOffsetsUs)), 0, pendingOutputStreamOffsetCount);
	//   28   48:aload_0         
	//   29   49:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//   30   52:iconst_1        
	//   31   53:aload_0         
	//   32   54:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//   33   57:iconst_0        
	//   34   58:aload_0         
	//   35   59:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   36   62:invokestatic    #949 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pendingOutputStreamSwitchTimesUs)), 1, ((Object) (pendingOutputStreamSwitchTimesUs)), 0, pendingOutputStreamOffsetCount);
	//   37   65:aload_0         
	//   38   66:getfield        #141 <Field long[] pendingOutputStreamSwitchTimesUs>
	//   39   69:iconst_1        
	//   40   70:aload_0         
	//   41   71:getfield        #141 <Field long[] pendingOutputStreamSwitchTimesUs>
	//   42   74:iconst_0        
	//   43   75:aload_0         
	//   44   76:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   45   79:invokestatic    #949 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
	//*  46   82:goto            10
	//   47   85:return          
	}

	protected void onQueueInputBuffer(DecoderInputBuffer decoderinputbuffer)
	{
		buffersInCodecCount = buffersInCodecCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #759 <Field int buffersInCodecCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #759 <Field int buffersInCodecCount>
		lastInputTimeUs = Math.max(decoderinputbuffer.timeUs, lastInputTimeUs);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #956 <Field long DecoderInputBuffer.timeUs>
	//    9   15:aload_0         
	//   10   16:getfield        #147 <Field long lastInputTimeUs>
	//   11   19:invokestatic    #959 <Method long Math.max(long, long)>
	//   12   22:putfield        #147 <Field long lastInputTimeUs>
		if(Util.SDK_INT < 23 && tunneling)
	//*  13   25:getstatic       #203 <Field int Util.SDK_INT>
	//*  14   28:bipush          23
	//*  15   30:icmpge          44
	//*  16   33:aload_0         
	//*  17   34:getfield        #205 <Field boolean tunneling>
	//*  18   37:ifeq            44
			maybeNotifyRenderedFirstFrame();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #961 <Method void maybeNotifyRenderedFirstFrame()>
	//   21   44:return          
	}

	protected void onStarted()
	{
		super.onStarted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #964 <Method void MediaCodecRenderer.onStarted()>
		droppedFrames = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #351 <Field int droppedFrames>
		droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
	//    5    9:aload_0         
	//    6   10:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//    7   13:putfield        #359 <Field long droppedFrameAccumulationStartTimeMs>
		lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000L;
	//    8   16:aload_0         
	//    9   17:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//   10   20:ldc2w           #965 <Long 1000L>
	//   11   23:lmul            
	//   12   24:putfield        #968 <Field long lastRenderTimeUs>
	//   13   27:return          
	}

	protected void onStopped()
	{
		joiningDeadlineMs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #142 <Long 0x1L>
	//    2    4:putfield        #149 <Field long joiningDeadlineMs>
		maybeNotifyDroppedFrames();
	//    3    7:aload_0         
	//    4    8:invokespecial   #971 <Method void maybeNotifyDroppedFrames()>
		super.onStopped();
	//    5   11:aload_0         
	//    6   12:invokespecial   #973 <Method void MediaCodecRenderer.onStopped()>
	//    7   15:return          
	}

	protected void onStreamChanged(Format aformat[], long l)
		throws ExoPlaybackException
	{
		if(outputStreamOffsetUs == 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field long outputStreamOffsetUs>
	//*   2    4:ldc2w           #142 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            19
		{
			outputStreamOffsetUs = l;
	//    5   11:aload_0         
	//    6   12:lload_2         
	//    7   13:putfield        #145 <Field long outputStreamOffsetUs>
		} else
	//*   8   16:goto            117
		{
			if(pendingOutputStreamOffsetCount == pendingOutputStreamOffsetsUs.length)
	//*   9   19:aload_0         
	//*  10   20:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//*  11   23:aload_0         
	//*  12   24:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//*  13   27:arraylength     
	//*  14   28:icmpne          80
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   15   31:new             #769 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #771 <Method void StringBuilder()>
	//   18   38:astore          4
				stringbuilder.append("Too many stream changes, so dropping offset: ");
	//   19   40:aload           4
	//   20   42:ldc2            #977 <String "Too many stream changes, so dropping offset: ">
	//   21   45:invokevirtual   #777 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(pendingOutputStreamOffsetsUs[pendingOutputStreamOffsetCount - 1]);
	//   23   49:aload           4
	//   24   51:aload_0         
	//   25   52:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//   26   55:aload_0         
	//   27   56:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   28   59:iconst_1        
	//   29   60:isub            
	//   30   61:laload          
	//   31   62:invokevirtual   #980 <Method StringBuilder StringBuilder.append(long)>
	//   32   65:pop             
				Log.w("MediaCodecVideoRenderer", stringbuilder.toString());
	//   33   66:ldc1            #36  <String "MediaCodecVideoRenderer">
	//   34   68:aload           4
	//   35   70:invokevirtual   #785 <Method String StringBuilder.toString()>
	//   36   73:invokestatic    #791 <Method int Log.w(String, String)>
	//   37   76:pop             
			} else
	//*  38   77:goto            90
			{
				pendingOutputStreamOffsetCount = pendingOutputStreamOffsetCount + 1;
	//   39   80:aload_0         
	//   40   81:aload_0         
	//   41   82:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   42   85:iconst_1        
	//   43   86:iadd            
	//   44   87:putfield        #884 <Field int pendingOutputStreamOffsetCount>
			}
			pendingOutputStreamOffsetsUs[pendingOutputStreamOffsetCount - 1] = l;
	//   45   90:aload_0         
	//   46   91:getfield        #139 <Field long[] pendingOutputStreamOffsetsUs>
	//   47   94:aload_0         
	//   48   95:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   49   98:iconst_1        
	//   50   99:isub            
	//   51  100:lload_2         
	//   52  101:lastore         
			pendingOutputStreamSwitchTimesUs[pendingOutputStreamOffsetCount - 1] = lastInputTimeUs;
	//   53  102:aload_0         
	//   54  103:getfield        #141 <Field long[] pendingOutputStreamSwitchTimesUs>
	//   55  106:aload_0         
	//   56  107:getfield        #884 <Field int pendingOutputStreamOffsetCount>
	//   57  110:iconst_1        
	//   58  111:isub            
	//   59  112:aload_0         
	//   60  113:getfield        #147 <Field long lastInputTimeUs>
	//   61  116:lastore         
		}
		super.onStreamChanged(aformat, l);
	//   62  117:aload_0         
	//   63  118:aload_1         
	//   64  119:lload_2         
	//   65  120:invokespecial   #982 <Method void MediaCodecRenderer.onStreamChanged(Format[], long)>
	//   66  123:return          
	}

	protected boolean processOutputBuffer(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, int i, 
			int j, long l2, boolean flag)
		throws ExoPlaybackException
	{
		if(initialPositionUs == 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #939 <Field long initialPositionUs>
	//*   2    4:ldc2w           #142 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            16
			initialPositionUs = l;
	//    5   11:aload_0         
	//    6   12:lload_1         
	//    7   13:putfield        #939 <Field long initialPositionUs>
		long l3 = l2 - outputStreamOffsetUs;
	//    8   16:lload           9
	//    9   18:aload_0         
	//   10   19:getfield        #145 <Field long outputStreamOffsetUs>
	//   11   22:lsub            
	//   12   23:lstore          12
		if(flag)
	//*  13   25:iload           11
	//*  14   27:ifeq            42
		{
			skipOutputBuffer(mediacodec, i, l3);
	//   15   30:aload_0         
	//   16   31:aload           5
	//   17   33:iload           7
	//   18   35:lload           12
	//   19   37:invokevirtual   #989 <Method void skipOutputBuffer(MediaCodec, int, long)>
			return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		}
		long l4 = l2 - l;
	//   22   42:lload           9
	//   23   44:lload_1         
	//   24   45:lsub            
	//   25   46:lstore          14
		if(surface == dummySurface)
	//*  26   48:aload_0         
	//*  27   49:getfield        #372 <Field Surface surface>
	//*  28   52:aload_0         
	//*  29   53:getfield        #390 <Field Surface dummySurface>
	//*  30   56:if_acmpne       81
			if(isBufferLate(l4))
	//*  31   59:lload           14
	//*  32   61:invokestatic    #991 <Method boolean isBufferLate(long)>
	//*  33   64:ifeq            79
			{
				skipOutputBuffer(mediacodec, i, l3);
	//   34   67:aload_0         
	//   35   68:aload           5
	//   36   70:iload           7
	//   37   72:lload           12
	//   38   74:invokevirtual   #989 <Method void skipOutputBuffer(MediaCodec, int, long)>
				return true;
	//   39   77:iconst_1        
	//   40   78:ireturn         
			} else
			{
				return false;
	//   41   79:iconst_0        
	//   42   80:ireturn         
			}
		long l5 = SystemClock.elapsedRealtime() * 1000L;
	//   43   81:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//   44   84:ldc2w           #965 <Long 1000L>
	//   45   87:lmul            
	//   46   88:lstore          16
		if(getState() == 2)
	//*  47   90:aload_0         
	//*  48   91:invokevirtual   #407 <Method int getState()>
	//*  49   94:iconst_2        
	//*  50   95:icmpne          104
			j = 1;
	//   51   98:iconst_1        
	//   52   99:istore          8
		else
	//*  53  101:goto            107
			j = 0;
	//   54  104:iconst_0        
	//   55  105:istore          8
		if(renderedFirstFrame && (j == 0 || !shouldForceRenderOutputBuffer(l4, l5 - lastRenderTimeUs)))
	//*  56  107:aload_0         
	//*  57  108:getfield        #200 <Field boolean renderedFirstFrame>
	//*  58  111:ifeq            332
	//*  59  114:iload           8
	//*  60  116:ifeq            138
	//*  61  119:aload_0         
	//*  62  120:lload           14
	//*  63  122:lload           16
	//*  64  124:aload_0         
	//*  65  125:getfield        #968 <Field long lastRenderTimeUs>
	//*  66  128:lsub            
	//*  67  129:invokevirtual   #995 <Method boolean shouldForceRenderOutputBuffer(long, long)>
	//*  68  132:ifeq            138
	//*  69  135:goto            332
			if(j != 0)
	//*  70  138:iload           8
	//*  71  140:ifeq            330
			{
				if(l == initialPositionUs)
	//*  72  143:lload_1         
	//*  73  144:aload_0         
	//*  74  145:getfield        #939 <Field long initialPositionUs>
	//*  75  148:lcmp            
	//*  76  149:ifne            154
					return false;
	//   77  152:iconst_0        
	//   78  153:ireturn         
				long l6 = System.nanoTime();
	//   79  154:invokestatic    #998 <Method long System.nanoTime()>
	//   80  157:lstore          18
				l2 = frameReleaseTimeHelper.adjustReleaseTime(l2, l6 + (l4 - (l5 - l1)) * 1000L);
	//   81  159:aload_0         
	//   82  160:getfield        #125 <Field VideoFrameReleaseTimeHelper frameReleaseTimeHelper>
	//   83  163:lload           9
	//   84  165:lload           18
	//   85  167:lload           14
	//   86  169:lload           16
	//   87  171:lload_3         
	//   88  172:lsub            
	//   89  173:lsub            
	//   90  174:ldc2w           #965 <Long 1000L>
	//   91  177:lmul            
	//   92  178:ladd            
	//   93  179:invokevirtual   #1001 <Method long VideoFrameReleaseTimeHelper.adjustReleaseTime(long, long)>
	//   94  182:lstore          9
				l4 = (l2 - l6) / 1000L;
	//   95  184:lload           9
	//   96  186:lload           18
	//   97  188:lsub            
	//   98  189:ldc2w           #965 <Long 1000L>
	//   99  192:ldiv            
	//  100  193:lstore          14
				if(shouldDropBuffersToKeyframe(l4, l1) && maybeDropBuffersToKeyframe(mediacodec, i, l3, l))
	//* 101  195:aload_0         
	//* 102  196:lload           14
	//* 103  198:lload_3         
	//* 104  199:invokevirtual   #1004 <Method boolean shouldDropBuffersToKeyframe(long, long)>
	//* 105  202:ifeq            221
	//* 106  205:aload_0         
	//* 107  206:aload           5
	//* 108  208:iload           7
	//* 109  210:lload           12
	//* 110  212:lload_1         
	//* 111  213:invokevirtual   #1006 <Method boolean maybeDropBuffersToKeyframe(MediaCodec, int, long, long)>
	//* 112  216:ifeq            221
					return false;
	//  113  219:iconst_0        
	//  114  220:ireturn         
				if(shouldDropOutputBuffer(l4, l1))
	//* 115  221:aload_0         
	//* 116  222:lload           14
	//* 117  224:lload_3         
	//* 118  225:invokevirtual   #1009 <Method boolean shouldDropOutputBuffer(long, long)>
	//* 119  228:ifeq            243
				{
					dropOutputBuffer(mediacodec, i, l3);
	//  120  231:aload_0         
	//  121  232:aload           5
	//  122  234:iload           7
	//  123  236:lload           12
	//  124  238:invokevirtual   #1011 <Method void dropOutputBuffer(MediaCodec, int, long)>
					return true;
	//  125  241:iconst_1        
	//  126  242:ireturn         
				}
				if(Util.SDK_INT >= 21)
	//* 127  243:getstatic       #203 <Field int Util.SDK_INT>
	//* 128  246:bipush          21
	//* 129  248:icmplt          274
				{
					if(l4 < 50000L)
	//* 130  251:lload           14
	//* 131  253:ldc2w           #1012 <Long 50000L>
	//* 132  256:lcmp            
	//* 133  257:ifge            328
					{
						renderOutputBufferV21(mediacodec, i, l3, l2);
	//  134  260:aload_0         
	//  135  261:aload           5
	//  136  263:iload           7
	//  137  265:lload           12
	//  138  267:lload           9
	//  139  269:invokevirtual   #1017 <Method void renderOutputBufferV21(MediaCodec, int, long, long)>
						return true;
	//  140  272:iconst_1        
	//  141  273:ireturn         
					}
				} else
				if(l4 < 30000L)
	//* 142  274:lload           14
	//* 143  276:ldc2w           #1018 <Long 30000L>
	//* 144  279:lcmp            
	//* 145  280:ifge            328
				{
					if(l4 > 11000L)
	//* 146  283:lload           14
	//* 147  285:ldc2w           #1020 <Long 11000L>
	//* 148  288:lcmp            
	//* 149  289:ifle            316
						try
						{
							Thread.sleep((l4 - 10000L) / 1000L);
	//  150  292:lload           14
	//  151  294:ldc2w           #1022 <Long 10000L>
	//  152  297:lsub            
	//  153  298:ldc2w           #965 <Long 1000L>
	//  154  301:ldiv            
	//  155  302:invokestatic    #1028 <Method void Thread.sleep(long)>
						}
	//* 156  305:goto            316
	//* 157  308:invokestatic    #1032 <Method Thread Thread.currentThread()>
	//* 158  311:invokevirtual   #1035 <Method void Thread.interrupt()>
	//* 159  314:iconst_0        
	//* 160  315:ireturn         
	//* 161  316:aload_0         
	//* 162  317:aload           5
	//* 163  319:iload           7
	//* 164  321:lload           12
	//* 165  323:invokevirtual   #1038 <Method void renderOutputBuffer(MediaCodec, int, long)>
	//* 166  326:iconst_1        
	//* 167  327:ireturn         
	//* 168  328:iconst_0        
	//* 169  329:ireturn         
	//* 170  330:iconst_0        
	//* 171  331:ireturn         
	//* 172  332:getstatic       #203 <Field int Util.SDK_INT>
	//* 173  335:bipush          21
	//* 174  337:icmplt          355
	//* 175  340:aload_0         
	//* 176  341:aload           5
	//* 177  343:iload           7
	//* 178  345:lload           12
	//* 179  347:invokestatic    #998 <Method long System.nanoTime()>
	//* 180  350:invokevirtual   #1017 <Method void renderOutputBufferV21(MediaCodec, int, long, long)>
	//* 181  353:iconst_1        
	//* 182  354:ireturn         
	//* 183  355:aload_0         
	//* 184  356:aload           5
	//* 185  358:iload           7
	//* 186  360:lload           12
	//* 187  362:invokevirtual   #1038 <Method void renderOutputBuffer(MediaCodec, int, long)>
	//* 188  365:goto            353
						// Misplaced declaration of an exception variable
						catch(MediaCodec mediacodec)
						{
							Thread.currentThread().interrupt();
							return false;
						}
					renderOutputBuffer(mediacodec, i, l3);
					return true;
				}
				return false;
			} else
			{
				return false;
			}
		if(Util.SDK_INT >= 21)
			renderOutputBufferV21(mediacodec, i, l3, System.nanoTime());
		else
			renderOutputBuffer(mediacodec, i, l3);
		return true;
	//* 189  368:astore          5
	//* 190  370:goto            308
	}

	protected void releaseCodec()
	{
		super.releaseCodec();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1039 <Method void MediaCodecRenderer.releaseCodec()>
		buffersInCodecCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #759 <Field int buffersInCodecCount>
		if(dummySurface != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #390 <Field Surface dummySurface>
	//*   7   13:ifnull          44
		{
			if(surface == dummySurface)
	//*   8   16:aload_0         
	//*   9   17:getfield        #372 <Field Surface surface>
	//*  10   20:aload_0         
	//*  11   21:getfield        #390 <Field Surface dummySurface>
	//*  12   24:if_acmpne       32
				surface = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #372 <Field Surface surface>
			dummySurface.release();
	//   16   32:aload_0         
	//   17   33:getfield        #390 <Field Surface dummySurface>
	//   18   36:invokevirtual   #1042 <Method void Surface.release()>
			dummySurface = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #390 <Field Surface dummySurface>
		}
		return;
	//   22   44:return          
		Exception exception;
		exception;
	//   23   45:astore_1        
		buffersInCodecCount = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #759 <Field int buffersInCodecCount>
		if(dummySurface != null)
	//*  27   51:aload_0         
	//*  28   52:getfield        #390 <Field Surface dummySurface>
	//*  29   55:ifnull          86
		{
			if(surface == dummySurface)
	//*  30   58:aload_0         
	//*  31   59:getfield        #372 <Field Surface surface>
	//*  32   62:aload_0         
	//*  33   63:getfield        #390 <Field Surface dummySurface>
	//*  34   66:if_acmpne       74
				surface = null;
	//   35   69:aload_0         
	//   36   70:aconst_null     
	//   37   71:putfield        #372 <Field Surface surface>
			dummySurface.release();
	//   38   74:aload_0         
	//   39   75:getfield        #390 <Field Surface dummySurface>
	//   40   78:invokevirtual   #1042 <Method void Surface.release()>
			dummySurface = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #390 <Field Surface dummySurface>
		}
		throw exception;
	//   44   86:aload_1         
	//   45   87:athrow          
	}

	protected void renderOutputBuffer(MediaCodec mediacodec, int i, long l)
	{
		maybeNotifyVideoSizeChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1044 <Method void maybeNotifyVideoSizeChanged()>
		TraceUtil.beginSection("releaseOutputBuffer");
	//    2    4:ldc2            #1045 <String "releaseOutputBuffer">
	//    3    7:invokestatic    #742 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, true);
	//    4   10:aload_1         
	//    5   11:iload_2         
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #746 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		TraceUtil.endSection();
	//    8   16:invokestatic    #749 <Method void TraceUtil.endSection()>
		lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000L;
	//    9   19:aload_0         
	//   10   20:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//   11   23:ldc2w           #965 <Long 1000L>
	//   12   26:lmul            
	//   13   27:putfield        #968 <Field long lastRenderTimeUs>
		mediacodec = ((MediaCodec) (decoderCounters));
	//   14   30:aload_0         
	//   15   31:getfield        #869 <Field DecoderCounters decoderCounters>
	//   16   34:astore_1        
		mediacodec.renderedOutputBufferCount = ((DecoderCounters) (mediacodec)).renderedOutputBufferCount + 1;
	//   17   35:aload_1         
	//   18   36:aload_1         
	//   19   37:getfield        #1048 <Field int DecoderCounters.renderedOutputBufferCount>
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:putfield        #1048 <Field int DecoderCounters.renderedOutputBufferCount>
		consecutiveDroppedFrameCount = 0;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #941 <Field int consecutiveDroppedFrameCount>
		maybeNotifyRenderedFirstFrame();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #961 <Method void maybeNotifyRenderedFirstFrame()>
	//   28   54:return          
	}

	protected void renderOutputBufferV21(MediaCodec mediacodec, int i, long l, long l1)
	{
		maybeNotifyVideoSizeChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1044 <Method void maybeNotifyVideoSizeChanged()>
		TraceUtil.beginSection("releaseOutputBuffer");
	//    2    4:ldc2            #1045 <String "releaseOutputBuffer">
	//    3    7:invokestatic    #742 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, l1);
	//    4   10:aload_1         
	//    5   11:iload_2         
	//    6   12:lload           5
	//    7   14:invokevirtual   #1050 <Method void MediaCodec.releaseOutputBuffer(int, long)>
		TraceUtil.endSection();
	//    8   17:invokestatic    #749 <Method void TraceUtil.endSection()>
		lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000L;
	//    9   20:aload_0         
	//   10   21:invokestatic    #357 <Method long SystemClock.elapsedRealtime()>
	//   11   24:ldc2w           #965 <Long 1000L>
	//   12   27:lmul            
	//   13   28:putfield        #968 <Field long lastRenderTimeUs>
		mediacodec = ((MediaCodec) (decoderCounters));
	//   14   31:aload_0         
	//   15   32:getfield        #869 <Field DecoderCounters decoderCounters>
	//   16   35:astore_1        
		mediacodec.renderedOutputBufferCount = ((DecoderCounters) (mediacodec)).renderedOutputBufferCount + 1;
	//   17   36:aload_1         
	//   18   37:aload_1         
	//   19   38:getfield        #1048 <Field int DecoderCounters.renderedOutputBufferCount>
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:putfield        #1048 <Field int DecoderCounters.renderedOutputBufferCount>
		consecutiveDroppedFrameCount = 0;
	//   23   46:aload_0         
	//   24   47:iconst_0        
	//   25   48:putfield        #941 <Field int consecutiveDroppedFrameCount>
		maybeNotifyRenderedFirstFrame();
	//   26   51:aload_0         
	//   27   52:invokevirtual   #961 <Method void maybeNotifyRenderedFirstFrame()>
	//   28   55:return          
	}

	protected boolean shouldDropBuffersToKeyframe(long l, long l1)
	{
		return isBufferVeryLate(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #1052 <Method boolean isBufferVeryLate(long)>
	//    2    4:ireturn         
	}

	protected boolean shouldDropOutputBuffer(long l, long l1)
	{
		return isBufferLate(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #991 <Method boolean isBufferLate(long)>
	//    2    4:ireturn         
	}

	protected boolean shouldForceRenderOutputBuffer(long l, long l1)
	{
		return isBufferLate(l) && l1 > 0x186a0L;
	//    0    0:lload_1         
	//    1    1:invokestatic    #991 <Method boolean isBufferLate(long)>
	//    2    4:ifeq            17
	//    3    7:lload_3         
	//    4    8:ldc2w           #1053 <Long 0x186a0L>
	//    5   11:lcmp            
	//    6   12:ifle            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	protected boolean shouldInitCodec(MediaCodecInfo mediacodecinfo)
	{
		return surface != null || shouldUseDummySurface(mediacodecinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field Surface surface>
	//    2    4:ifnonnull       20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #398 <Method boolean shouldUseDummySurface(MediaCodecInfo)>
	//    6   12:ifeq            18
	//    7   15:goto            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	protected void skipOutputBuffer(MediaCodec mediacodec, int i, long l)
	{
		TraceUtil.beginSection("skipVideoBuffer");
	//    0    0:ldc2            #1057 <String "skipVideoBuffer">
	//    1    3:invokestatic    #742 <Method void TraceUtil.beginSection(String)>
		mediacodec.releaseOutputBuffer(i, false);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #746 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		TraceUtil.endSection();
	//    6   12:invokestatic    #749 <Method void TraceUtil.endSection()>
		mediacodec = ((MediaCodec) (decoderCounters));
	//    7   15:aload_0         
	//    8   16:getfield        #869 <Field DecoderCounters decoderCounters>
	//    9   19:astore_1        
		mediacodec.skippedOutputBufferCount = ((DecoderCounters) (mediacodec)).skippedOutputBufferCount + 1;
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:getfield        #1060 <Field int DecoderCounters.skippedOutputBufferCount>
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:putfield        #1060 <Field int DecoderCounters.skippedOutputBufferCount>
	//   16   30:return          
	}

	protected int supportsFormat(MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, Format format)
		throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #1064 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1066 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1070 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	protected void updateDroppedBufferCounters(int i)
	{
		DecoderCounters decodercounters = decoderCounters;
	//    0    0:aload_0         
	//    1    1:getfield        #869 <Field DecoderCounters decoderCounters>
	//    2    4:astore_2        
		decodercounters.droppedBufferCount = decodercounters.droppedBufferCount + i;
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #1074 <Field int DecoderCounters.droppedBufferCount>
	//    6   10:iload_1         
	//    7   11:iadd            
	//    8   12:putfield        #1074 <Field int DecoderCounters.droppedBufferCount>
		droppedFrames = droppedFrames + i;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #351 <Field int droppedFrames>
	//   12   20:iload_1         
	//   13   21:iadd            
	//   14   22:putfield        #351 <Field int droppedFrames>
		consecutiveDroppedFrameCount = consecutiveDroppedFrameCount + i;
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:getfield        #941 <Field int consecutiveDroppedFrameCount>
	//   18   30:iload_1         
	//   19   31:iadd            
	//   20   32:putfield        #941 <Field int consecutiveDroppedFrameCount>
		decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(consecutiveDroppedFrameCount, decoderCounters.maxConsecutiveDroppedBufferCount);
	//   21   35:aload_0         
	//   22   36:getfield        #869 <Field DecoderCounters decoderCounters>
	//   23   39:aload_0         
	//   24   40:getfield        #941 <Field int consecutiveDroppedFrameCount>
	//   25   43:aload_0         
	//   26   44:getfield        #869 <Field DecoderCounters decoderCounters>
	//   27   47:getfield        #1077 <Field int DecoderCounters.maxConsecutiveDroppedBufferCount>
	//   28   50:invokestatic    #767 <Method int Math.max(int, int)>
	//   29   53:putfield        #1077 <Field int DecoderCounters.maxConsecutiveDroppedBufferCount>
		if(droppedFrames >= maxDroppedFramesToNotify)
	//*  30   56:aload_0         
	//*  31   57:getfield        #351 <Field int droppedFrames>
	//*  32   60:aload_0         
	//*  33   61:getfield        #110 <Field int maxDroppedFramesToNotify>
	//*  34   64:icmplt          71
			maybeNotifyDroppedFrames();
	//   35   67:aload_0         
	//   36   68:invokespecial   #971 <Method void maybeNotifyDroppedFrames()>
	//   37   71:return          
	}

	private static final String KEY_CROP_BOTTOM = "crop-bottom";
	private static final String KEY_CROP_LEFT = "crop-left";
	private static final String KEY_CROP_RIGHT = "crop-right";
	private static final String KEY_CROP_TOP = "crop-top";
	private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
	private static final int STANDARD_LONG_EDGE_VIDEO_PX[] = {
		1920, 1600, 1440, 1280, 960, 854, 640, 540, 480
	};
	private static final String TAG = "MediaCodecVideoRenderer";
	private static boolean deviceNeedsSetOutputSurfaceWorkaround;
	private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
	private final long allowedJoiningTimeMs;
	private int buffersInCodecCount;
	private CodecMaxValues codecMaxValues;
	private boolean codecNeedsSetOutputSurfaceWorkaround;
	private int consecutiveDroppedFrameCount;
	private final Context context;
	private int currentHeight;
	private float currentPixelWidthHeightRatio;
	private int currentUnappliedRotationDegrees;
	private int currentWidth;
	private final boolean deviceNeedsAutoFrcWorkaround;
	private long droppedFrameAccumulationStartTimeMs;
	private int droppedFrames;
	private Surface dummySurface;
	private final VideoRendererEventListener.EventDispatcher eventDispatcher;
	private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
	private long initialPositionUs;
	private long joiningDeadlineMs;
	private long lastInputTimeUs;
	private long lastRenderTimeUs;
	private final int maxDroppedFramesToNotify;
	private long outputStreamOffsetUs;
	private int pendingOutputStreamOffsetCount;
	private final long pendingOutputStreamOffsetsUs[];
	private final long pendingOutputStreamSwitchTimesUs[];
	private float pendingPixelWidthHeightRatio;
	private int pendingRotationDegrees;
	private boolean renderedFirstFrame;
	private int reportedHeight;
	private float reportedPixelWidthHeightRatio;
	private int reportedUnappliedRotationDegrees;
	private int reportedWidth;
	private int scalingMode;
	private Surface surface;
	private boolean tunneling;
	private int tunnelingAudioSessionId;
	OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;

	static 
	{
	//    0    0:bipush          9
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:sipush          1920
	//    5    9:iastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:sipush          1600
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:sipush          1440
	//   13   21:iastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:sipush          1280
	//   17   27:iastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:sipush          960
	//   21   33:iastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:sipush          854
	//   25   39:iastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:sipush          640
	//   29   46:iastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:sipush          540
	//   33   53:iastore         
	//   34   54:dup             
	//   35   55:bipush          8
	//   36   57:sipush          480
	//   37   60:iastore         
	//   38   61:putstatic       #89  <Field int[] STANDARD_LONG_EDGE_VIDEO_PX>
	//*  39   64:return          
	}
}
