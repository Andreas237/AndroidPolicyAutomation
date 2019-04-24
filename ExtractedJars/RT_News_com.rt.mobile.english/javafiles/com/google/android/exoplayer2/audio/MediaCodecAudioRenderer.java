// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.*;
import android.os.Handler;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.mediacodec.*;
import com.google.android.exoplayer2.util.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioCapabilities, AudioProcessor, DefaultAudioSink, AudioSink, 
//			AudioAttributes, AudioRendererEventListener

public class MediaCodecAudioRenderer extends MediaCodecRenderer
	implements MediaClock
{
	private final class AudioSinkListener
		implements AudioSink.Listener
	{

		public void onAudioSessionId(int i)
		{
			eventDispatcher.audioSessionId(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MediaCodecAudioRenderer this$0>
		//    2    4:invokestatic    #28  <Method AudioRendererEventListener$EventDispatcher MediaCodecAudioRenderer.access$100(MediaCodecAudioRenderer)>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #33  <Method void AudioRendererEventListener$EventDispatcher.audioSessionId(int)>
			MediaCodecAudioRenderer.this.onAudioSessionId(i);
		//    5   11:aload_0         
		//    6   12:getfield        #15  <Field MediaCodecAudioRenderer this$0>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #35  <Method void MediaCodecAudioRenderer.onAudioSessionId(int)>
		//    9   19:return          
		}

		public void onPositionDiscontinuity()
		{
			onAudioTrackPositionDiscontinuity();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MediaCodecAudioRenderer this$0>
		//    2    4:invokevirtual   #39  <Method void MediaCodecAudioRenderer.onAudioTrackPositionDiscontinuity()>
			allowPositionDiscontinuity = true;
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field MediaCodecAudioRenderer this$0>
		//    5   11:iconst_1        
		//    6   12:invokestatic    #43  <Method boolean MediaCodecAudioRenderer.access$202(MediaCodecAudioRenderer, boolean)>
		//    7   15:pop             
		//    8   16:return          
		}

		public void onUnderrun(int i, long l, long l1)
		{
			eventDispatcher.audioTrackUnderrun(i, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MediaCodecAudioRenderer this$0>
		//    2    4:invokestatic    #28  <Method AudioRendererEventListener$EventDispatcher MediaCodecAudioRenderer.access$100(MediaCodecAudioRenderer)>
		//    3    7:iload_1         
		//    4    8:lload_2         
		//    5    9:lload           4
		//    6   11:invokevirtual   #48  <Method void AudioRendererEventListener$EventDispatcher.audioTrackUnderrun(int, long, long)>
			onAudioTrackUnderrun(i, l, l1);
		//    7   14:aload_0         
		//    8   15:getfield        #15  <Field MediaCodecAudioRenderer this$0>
		//    9   18:iload_1         
		//   10   19:lload_2         
		//   11   20:lload           4
		//   12   22:invokevirtual   #51  <Method void MediaCodecAudioRenderer.onAudioTrackUnderrun(int, long, long)>
		//   13   25:return          
		}

		final MediaCodecAudioRenderer this$0;

		private AudioSinkListener()
		{
			this$0 = MediaCodecAudioRenderer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MediaCodecAudioRenderer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public MediaCodecAudioRenderer(Context context1, MediaCodecSelector mediacodecselector)
	{
		this(context1, mediacodecselector, ((DrmSessionManager) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokespecial   #40  <Method void MediaCodecAudioRenderer(Context, MediaCodecSelector, DrmSessionManager, boolean)>
	//    6    8:return          
	}

	public MediaCodecAudioRenderer(Context context1, MediaCodecSelector mediacodecselector, Handler handler, AudioRendererEventListener audiorenderereventlistener)
	{
		this(context1, mediacodecselector, ((DrmSessionManager) (null)), false, handler, audiorenderereventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:aload_3         
	//    6    6:aload           4
	//    7    8:invokespecial   #46  <Method void MediaCodecAudioRenderer(Context, MediaCodecSelector, DrmSessionManager, boolean, Handler, AudioRendererEventListener)>
	//    8   11:return          
	}

	public MediaCodecAudioRenderer(Context context1, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag)
	{
		this(context1, mediacodecselector, drmsessionmanager, flag, ((Handler) (null)), ((AudioRendererEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #46  <Method void MediaCodecAudioRenderer(Context, MediaCodecSelector, DrmSessionManager, boolean, Handler, AudioRendererEventListener)>
	//    8   11:return          
	}

	public MediaCodecAudioRenderer(Context context1, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, AudioRendererEventListener audiorenderereventlistener)
	{
		this(context1, mediacodecselector, drmsessionmanager, flag, handler, audiorenderereventlistener, (AudioCapabilities)null, new AudioProcessor[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aconst_null     
	//    8   11:checkcast       #51  <Class AudioCapabilities>
	//    9   14:iconst_0        
	//   10   15:anewarray       AudioProcessor[]
	//   11   18:invokespecial   #56  <Method void MediaCodecAudioRenderer(Context, MediaCodecSelector, DrmSessionManager, boolean, Handler, AudioRendererEventListener, AudioCapabilities, AudioProcessor[])>
	//   12   21:return          
	}

	public transient MediaCodecAudioRenderer(Context context1, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, AudioRendererEventListener audiorenderereventlistener, AudioCapabilities audiocapabilities, 
			AudioProcessor aaudioprocessor[])
	{
		this(context1, mediacodecselector, drmsessionmanager, flag, handler, audiorenderereventlistener, ((AudioSink) (new DefaultAudioSink(audiocapabilities, aaudioprocessor))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:new             #59  <Class DefaultAudioSink>
	//    8   13:dup             
	//    9   14:aload           7
	//   10   16:aload           8
	//   11   18:invokespecial   #62  <Method void DefaultAudioSink(AudioCapabilities, AudioProcessor[])>
	//   12   21:invokespecial   #65  <Method void MediaCodecAudioRenderer(Context, MediaCodecSelector, DrmSessionManager, boolean, Handler, AudioRendererEventListener, AudioSink)>
	//   13   24:return          
	}

	public MediaCodecAudioRenderer(Context context1, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, AudioRendererEventListener audiorenderereventlistener, AudioSink audiosink)
	{
		super(1, mediacodecselector, drmsessionmanager, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #69  <Method void MediaCodecRenderer(int, MediaCodecSelector, DrmSessionManager, boolean)>
		context = context1.getApplicationContext();
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #75  <Method Context Context.getApplicationContext()>
	//    9   14:putfield        #77  <Field Context context>
		audioSink = audiosink;
	//   10   17:aload_0         
	//   11   18:aload           7
	//   12   20:putfield        #79  <Field AudioSink audioSink>
		eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audiorenderereventlistener);
	//   13   23:aload_0         
	//   14   24:new             #81  <Class AudioRendererEventListener$EventDispatcher>
	//   15   27:dup             
	//   16   28:aload           5
	//   17   30:aload           6
	//   18   32:invokespecial   #84  <Method void AudioRendererEventListener$EventDispatcher(Handler, AudioRendererEventListener)>
	//   19   35:putfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
		audiosink.setListener(((AudioSink.Listener) (new AudioSinkListener())));
	//   20   38:aload           7
	//   21   40:new             #10  <Class MediaCodecAudioRenderer$AudioSinkListener>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:invokespecial   #89  <Method void MediaCodecAudioRenderer$AudioSinkListener(MediaCodecAudioRenderer, MediaCodecAudioRenderer$1)>
	//   26   49:invokeinterface #95  <Method void AudioSink.setListener(AudioSink$Listener)>
	//   27   54:return          
	}

	private static boolean areAdaptationCompatible(Format format, Format format1)
	{
		return format.sampleMimeType.equals(((Object) (format1.sampleMimeType))) && format.channelCount == format1.channelCount && format.sampleRate == format1.sampleRate && format.encoderDelay == 0 && format.encoderPadding == 0 && format1.encoderDelay == 0 && format1.encoderPadding == 0 && format.initializationDataEquals(format1);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field String Format.sampleMimeType>
	//    2    4:aload_1         
	//    3    5:getfield        #110 <Field String Format.sampleMimeType>
	//    4    8:invokevirtual   #116 <Method boolean String.equals(Object)>
	//    5   11:ifeq            74
	//    6   14:aload_0         
	//    7   15:getfield        #118 <Field int Format.channelCount>
	//    8   18:aload_1         
	//    9   19:getfield        #118 <Field int Format.channelCount>
	//   10   22:icmpne          74
	//   11   25:aload_0         
	//   12   26:getfield        #121 <Field int Format.sampleRate>
	//   13   29:aload_1         
	//   14   30:getfield        #121 <Field int Format.sampleRate>
	//   15   33:icmpne          74
	//   16   36:aload_0         
	//   17   37:getfield        #123 <Field int Format.encoderDelay>
	//   18   40:ifne            74
	//   19   43:aload_0         
	//   20   44:getfield        #125 <Field int Format.encoderPadding>
	//   21   47:ifne            74
	//   22   50:aload_1         
	//   23   51:getfield        #123 <Field int Format.encoderDelay>
	//   24   54:ifne            74
	//   25   57:aload_1         
	//   26   58:getfield        #125 <Field int Format.encoderPadding>
	//   27   61:ifne            74
	//   28   64:aload_0         
	//   29   65:aload_1         
	//   30   66:invokevirtual   #129 <Method boolean Format.initializationDataEquals(Format)>
	//   31   69:ifeq            74
	//   32   72:iconst_1        
	//   33   73:ireturn         
	//   34   74:iconst_0        
	//   35   75:ireturn         
	}

	private static boolean codecNeedsDiscardChannelsWorkaround(String s)
	{
		return Util.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(((Object) (s))) && "samsung".equals(((Object) (Util.MANUFACTURER))) && (Util.DEVICE.startsWith("zeroflte") || Util.DEVICE.startsWith("herolte") || Util.DEVICE.startsWith("heroqlte"));
	//    0    0:getstatic       #135 <Field int Util.SDK_INT>
	//    1    3:bipush          24
	//    2    5:icmpge          63
	//    3    8:ldc1            #137 <String "OMX.SEC.aac.dec">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #116 <Method boolean String.equals(Object)>
	//    6   14:ifeq            63
	//    7   17:ldc1            #139 <String "samsung">
	//    8   19:getstatic       #142 <Field String Util.MANUFACTURER>
	//    9   22:invokevirtual   #116 <Method boolean String.equals(Object)>
	//   10   25:ifeq            63
	//   11   28:getstatic       #145 <Field String Util.DEVICE>
	//   12   31:ldc1            #147 <String "zeroflte">
	//   13   33:invokevirtual   #150 <Method boolean String.startsWith(String)>
	//   14   36:ifne            61
	//   15   39:getstatic       #145 <Field String Util.DEVICE>
	//   16   42:ldc1            #152 <String "herolte">
	//   17   44:invokevirtual   #150 <Method boolean String.startsWith(String)>
	//   18   47:ifne            61
	//   19   50:getstatic       #145 <Field String Util.DEVICE>
	//   20   53:ldc1            #154 <String "heroqlte">
	//   21   55:invokevirtual   #150 <Method boolean String.startsWith(String)>
	//   22   58:ifeq            63
	//   23   61:iconst_1        
	//   24   62:ireturn         
	//   25   63:iconst_0        
	//   26   64:ireturn         
	}

	private int getCodecMaxInputSize(MediaCodecInfo mediacodecinfo, Format format)
	{
		if(Util.SDK_INT < 24 && "OMX.google.raw.decoder".equals(((Object) (mediacodecinfo.name))))
	//*   0    0:getstatic       #135 <Field int Util.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          69
	//*   3    8:ldc1            #158 <String "OMX.google.raw.decoder">
	//*   4   10:aload_1         
	//*   5   11:getfield        #163 <Field String MediaCodecInfo.name>
	//*   6   14:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*   7   17:ifeq            69
		{
			boolean flag1 = true;
	//    8   20:iconst_1        
	//    9   21:istore          4
			boolean flag = flag1;
	//   10   23:iload           4
	//   11   25:istore_3        
			if(Util.SDK_INT == 23)
	//*  12   26:getstatic       #135 <Field int Util.SDK_INT>
	//*  13   29:bipush          23
	//*  14   31:icmpne          63
			{
				mediacodecinfo = ((MediaCodecInfo) (context.getPackageManager()));
	//   15   34:aload_0         
	//   16   35:getfield        #77  <Field Context context>
	//   17   38:invokevirtual   #167 <Method PackageManager Context.getPackageManager()>
	//   18   41:astore_1        
				flag = flag1;
	//   19   42:iload           4
	//   20   44:istore_3        
				if(mediacodecinfo != null)
	//*  21   45:aload_1         
	//*  22   46:ifnull          63
				{
					flag = flag1;
	//   23   49:iload           4
	//   24   51:istore_3        
					if(((PackageManager) (mediacodecinfo)).hasSystemFeature("android.software.leanback"))
	//*  25   52:aload_1         
	//*  26   53:ldc1            #169 <String "android.software.leanback">
	//*  27   55:invokevirtual   #174 <Method boolean PackageManager.hasSystemFeature(String)>
	//*  28   58:ifeq            63
						flag = false;
	//   29   61:iconst_0        
	//   30   62:istore_3        
				}
			}
			if(flag)
	//*  31   63:iload_3         
	//*  32   64:ifeq            69
				return -1;
	//   33   67:iconst_m1       
	//   34   68:ireturn         
		}
		return format.maxInputSize;
	//   35   69:aload_2         
	//   36   70:getfield        #177 <Field int Format.maxInputSize>
	//   37   73:ireturn         
	}

	private void updateCurrentPosition()
	{
		long l = audioSink.getCurrentPositionUs(isEnded());
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AudioSink audioSink>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #183 <Method boolean isEnded()>
	//    4    8:invokeinterface #187 <Method long AudioSink.getCurrentPositionUs(boolean)>
	//    5   13:lstore_1        
		if(l != 0x0L)
	//*   6   14:lload_1         
	//*   7   15:ldc2w           #188 <Long 0x0L>
	//*   8   18:lcmp            
	//*   9   19:ifeq            51
		{
			if(!allowPositionDiscontinuity)
	//*  10   22:aload_0         
	//*  11   23:getfield        #102 <Field boolean allowPositionDiscontinuity>
	//*  12   26:ifeq            32
	//*  13   29:goto            41
				l = Math.max(currentPositionUs, l);
	//   14   32:aload_0         
	//   15   33:getfield        #191 <Field long currentPositionUs>
	//   16   36:lload_1         
	//   17   37:invokestatic    #197 <Method long Math.max(long, long)>
	//   18   40:lstore_1        
			currentPositionUs = l;
	//   19   41:aload_0         
	//   20   42:lload_1         
	//   21   43:putfield        #191 <Field long currentPositionUs>
			allowPositionDiscontinuity = false;
	//   22   46:aload_0         
	//   23   47:iconst_0        
	//   24   48:putfield        #102 <Field boolean allowPositionDiscontinuity>
		}
	//   25   51:return          
	}

	protected boolean allowPassthrough(String s)
	{
		int i = MimeTypes.getEncoding(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #204 <Method int MimeTypes.getEncoding(String)>
	//    2    4:istore_2        
		return i != 0 && audioSink.isEncodingSupported(i);
	//    3    5:iload_2         
	//    4    6:ifeq            24
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field AudioSink audioSink>
	//    7   13:iload_2         
	//    8   14:invokeinterface #208 <Method boolean AudioSink.isEncodingSupported(int)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	protected int canKeepCodec(MediaCodec mediacodec, MediaCodecInfo mediacodecinfo, Format format, Format format1)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void configureCodec(MediaCodecInfo mediacodecinfo, MediaCodec mediacodec, Format format, MediaCrypto mediacrypto)
	{
		codecMaxInputSize = getCodecMaxInputSize(mediacodecinfo, format, getStreamFormats());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_3         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #216 <Method Format[] getStreamFormats()>
	//    6    8:invokevirtual   #219 <Method int getCodecMaxInputSize(MediaCodecInfo, Format, Format[])>
	//    7   11:putfield        #221 <Field int codecMaxInputSize>
		codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediacodecinfo.name);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #163 <Field String MediaCodecInfo.name>
	//   11   19:invokestatic    #223 <Method boolean codecNeedsDiscardChannelsWorkaround(String)>
	//   12   22:putfield        #225 <Field boolean codecNeedsDiscardChannelsWorkaround>
		passthroughEnabled = mediacodecinfo.passthrough;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #228 <Field boolean MediaCodecInfo.passthrough>
	//   16   30:putfield        #230 <Field boolean passthroughEnabled>
		if(mediacodecinfo.mimeType == null)
	//*  17   33:aload_1         
	//*  18   34:getfield        #233 <Field String MediaCodecInfo.mimeType>
	//*  19   37:ifnonnull       46
			mediacodecinfo = "audio/raw";
	//   20   40:ldc1            #235 <String "audio/raw">
	//   21   42:astore_1        
		else
	//*  22   43:goto            51
			mediacodecinfo = ((MediaCodecInfo) (mediacodecinfo.mimeType));
	//   23   46:aload_1         
	//   24   47:getfield        #233 <Field String MediaCodecInfo.mimeType>
	//   25   50:astore_1        
		mediacodecinfo = ((MediaCodecInfo) (getMediaFormat(format, ((String) (mediacodecinfo)), codecMaxInputSize)));
	//   26   51:aload_0         
	//   27   52:aload_3         
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:getfield        #221 <Field int codecMaxInputSize>
	//   31   58:invokevirtual   #239 <Method MediaFormat getMediaFormat(Format, String, int)>
	//   32   61:astore_1        
		mediacodec.configure(((MediaFormat) (mediacodecinfo)), ((android.view.Surface) (null)), mediacrypto, 0);
	//   33   62:aload_2         
	//   34   63:aload_1         
	//   35   64:aconst_null     
	//   36   65:aload           4
	//   37   67:iconst_0        
	//   38   68:invokevirtual   #245 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
		if(passthroughEnabled)
	//*  39   71:aload_0         
	//*  40   72:getfield        #230 <Field boolean passthroughEnabled>
	//*  41   75:ifeq            97
		{
			passthroughMediaFormat = ((MediaFormat) (mediacodecinfo));
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:putfield        #247 <Field MediaFormat passthroughMediaFormat>
			passthroughMediaFormat.setString("mime", format.sampleMimeType);
	//   45   83:aload_0         
	//   46   84:getfield        #247 <Field MediaFormat passthroughMediaFormat>
	//   47   87:ldc1            #249 <String "mime">
	//   48   89:aload_3         
	//   49   90:getfield        #110 <Field String Format.sampleMimeType>
	//   50   93:invokevirtual   #255 <Method void MediaFormat.setString(String, String)>
			return;
	//   51   96:return          
		} else
		{
			passthroughMediaFormat = null;
	//   52   97:aload_0         
	//   53   98:aconst_null     
	//   54   99:putfield        #247 <Field MediaFormat passthroughMediaFormat>
			return;
	//   55  102:return          
		}
	}

	protected int getCodecMaxInputSize(MediaCodecInfo mediacodecinfo, Format format, Format aformat[])
	{
		return getCodecMaxInputSize(mediacodecinfo, format);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #257 <Method int getCodecMaxInputSize(MediaCodecInfo, Format)>
	//    4    6:ireturn         
	}

	protected MediaCodecInfo getDecoderInfo(MediaCodecSelector mediacodecselector, Format format, boolean flag)
		throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException
	{
		if(allowPassthrough(format.sampleMimeType))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:getfield        #110 <Field String Format.sampleMimeType>
	//*   3    5:invokevirtual   #263 <Method boolean allowPassthrough(String)>
	//*   4    8:ifeq            27
		{
			MediaCodecInfo mediacodecinfo = mediacodecselector.getPassthroughDecoderInfo();
	//    5   11:aload_1         
	//    6   12:invokeinterface #269 <Method MediaCodecInfo MediaCodecSelector.getPassthroughDecoderInfo()>
	//    7   17:astore          4
			if(mediacodecinfo != null)
	//*   8   19:aload           4
	//*   9   21:ifnull          27
				return mediacodecinfo;
	//   10   24:aload           4
	//   11   26:areturn         
		}
		return super.getDecoderInfo(mediacodecselector, format, flag);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:aload_2         
	//   15   30:iload_3         
	//   16   31:invokespecial   #271 <Method MediaCodecInfo MediaCodecRenderer.getDecoderInfo(MediaCodecSelector, Format, boolean)>
	//   17   34:areturn         
	}

	public MediaClock getMediaClock()
	{
		return ((MediaClock) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected MediaFormat getMediaFormat(Format format, String s, int i)
	{
		MediaFormat mediaformat = new MediaFormat();
	//    0    0:new             #251 <Class MediaFormat>
	//    1    3:dup             
	//    2    4:invokespecial   #278 <Method void MediaFormat()>
	//    3    7:astore          4
		mediaformat.setString("mime", s);
	//    4    9:aload           4
	//    5   11:ldc1            #249 <String "mime">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #255 <Method void MediaFormat.setString(String, String)>
		mediaformat.setInteger("channel-count", format.channelCount);
	//    8   17:aload           4
	//    9   19:ldc2            #280 <String "channel-count">
	//   10   22:aload_1         
	//   11   23:getfield        #118 <Field int Format.channelCount>
	//   12   26:invokevirtual   #284 <Method void MediaFormat.setInteger(String, int)>
		mediaformat.setInteger("sample-rate", format.sampleRate);
	//   13   29:aload           4
	//   14   31:ldc2            #286 <String "sample-rate">
	//   15   34:aload_1         
	//   16   35:getfield        #121 <Field int Format.sampleRate>
	//   17   38:invokevirtual   #284 <Method void MediaFormat.setInteger(String, int)>
		MediaFormatUtil.setCsdBuffers(mediaformat, format.initializationData);
	//   18   41:aload           4
	//   19   43:aload_1         
	//   20   44:getfield        #290 <Field java.util.List Format.initializationData>
	//   21   47:invokestatic    #296 <Method void MediaFormatUtil.setCsdBuffers(MediaFormat, java.util.List)>
		MediaFormatUtil.maybeSetInteger(mediaformat, "max-input-size", i);
	//   22   50:aload           4
	//   23   52:ldc2            #298 <String "max-input-size">
	//   24   55:iload_3         
	//   25   56:invokestatic    #302 <Method void MediaFormatUtil.maybeSetInteger(MediaFormat, String, int)>
		if(Util.SDK_INT >= 23)
	//*  26   59:getstatic       #135 <Field int Util.SDK_INT>
	//*  27   62:bipush          23
	//*  28   64:icmplt          76
			mediaformat.setInteger("priority", 0);
	//   29   67:aload           4
	//   30   69:ldc2            #304 <String "priority">
	//   31   72:iconst_0        
	//   32   73:invokevirtual   #284 <Method void MediaFormat.setInteger(String, int)>
		return mediaformat;
	//   33   76:aload           4
	//   34   78:areturn         
	}

	public PlaybackParameters getPlaybackParameters()
	{
		return audioSink.getPlaybackParameters();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AudioSink audioSink>
	//    2    4:invokeinterface #309 <Method PlaybackParameters AudioSink.getPlaybackParameters()>
	//    3    9:areturn         
	}

	public long getPositionUs()
	{
		if(getState() == 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #315 <Method int getState()>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          12
			updateCurrentPosition();
	//    4    8:aload_0         
	//    5    9:invokespecial   #317 <Method void updateCurrentPosition()>
		return currentPositionUs;
	//    6   12:aload_0         
	//    7   13:getfield        #191 <Field long currentPositionUs>
	//    8   16:lreturn         
	}

	public void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     2 3: default 24
	//	               2 47
	//	               3 31
		default:
			super.handleMessage(i, obj);
	//    2   24:aload_0         
	//    3   25:iload_1         
	//    4   26:aload_2         
	//    5   27:invokespecial   #323 <Method void MediaCodecRenderer.handleMessage(int, Object)>
			return;
	//    6   30:return          

		case 3: // '\003'
			obj = ((Object) ((AudioAttributes)obj));
	//    7   31:aload_2         
	//    8   32:checkcast       #325 <Class AudioAttributes>
	//    9   35:astore_2        
			audioSink.setAudioAttributes(((AudioAttributes) (obj)));
	//   10   36:aload_0         
	//   11   37:getfield        #79  <Field AudioSink audioSink>
	//   12   40:aload_2         
	//   13   41:invokeinterface #329 <Method void AudioSink.setAudioAttributes(AudioAttributes)>
			return;
	//   14   46:return          

		case 2: // '\002'
			audioSink.setVolume(((Float)obj).floatValue());
	//   15   47:aload_0         
	//   16   48:getfield        #79  <Field AudioSink audioSink>
	//   17   51:aload_2         
	//   18   52:checkcast       #331 <Class Float>
	//   19   55:invokevirtual   #335 <Method float Float.floatValue()>
	//   20   58:invokeinterface #339 <Method void AudioSink.setVolume(float)>
			return;
	//   21   63:return          
		}
	}

	public boolean isEnded()
	{
		return super.isEnded() && audioSink.isEnded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #340 <Method boolean MediaCodecRenderer.isEnded()>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field AudioSink audioSink>
	//    5   11:invokeinterface #341 <Method boolean AudioSink.isEnded()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isReady()
	{
		return audioSink.hasPendingData() || super.isReady();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AudioSink audioSink>
	//    2    4:invokeinterface #345 <Method boolean AudioSink.hasPendingData()>
	//    3    9:ifne            24
	//    4   12:aload_0         
	//    5   13:invokespecial   #347 <Method boolean MediaCodecRenderer.isReady()>
	//    6   16:ifeq            22
	//    7   19:goto            24
	//    8   22:iconst_0        
	//    9   23:ireturn         
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	protected void onAudioSessionId(int i)
	{
	//    0    0:return          
	}

	protected void onAudioTrackPositionDiscontinuity()
	{
	//    0    0:return          
	}

	protected void onAudioTrackUnderrun(int i, long l, long l1)
	{
	//    0    0:return          
	}

	protected void onCodecInitialized(String s, long l, long l1)
	{
		eventDispatcher.decoderInitialized(s, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #357 <Method void AudioRendererEventListener$EventDispatcher.decoderInitialized(String, long, long)>
	//    6   11:return          
	}

	protected void onDisabled()
	{
		audioSink.release();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AudioSink audioSink>
	//    2    4:invokeinterface #361 <Method void AudioSink.release()>
		super.onDisabled();
	//    3    9:aload_0         
	//    4   10:invokespecial   #363 <Method void MediaCodecRenderer.onDisabled()>
		decoderCounters.ensureUpdated();
	//    5   13:aload_0         
	//    6   14:getfield        #367 <Field DecoderCounters decoderCounters>
	//    7   17:invokevirtual   #372 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//    8   20:aload_0         
	//    9   21:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   10   24:aload_0         
	//   11   25:getfield        #367 <Field DecoderCounters decoderCounters>
	//   12   28:invokevirtual   #376 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		return;
	//   13   31:return          
		Exception exception;
		exception;
	//   14   32:astore_1        
		decoderCounters.ensureUpdated();
	//   15   33:aload_0         
	//   16   34:getfield        #367 <Field DecoderCounters decoderCounters>
	//   17   37:invokevirtual   #372 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   18   40:aload_0         
	//   19   41:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   20   44:aload_0         
	//   21   45:getfield        #367 <Field DecoderCounters decoderCounters>
	//   22   48:invokevirtual   #376 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//   23   51:aload_1         
	//   24   52:athrow          
		exception;
	//   25   53:astore_1        
		super.onDisabled();
	//   26   54:aload_0         
	//   27   55:invokespecial   #363 <Method void MediaCodecRenderer.onDisabled()>
		decoderCounters.ensureUpdated();
	//   28   58:aload_0         
	//   29   59:getfield        #367 <Field DecoderCounters decoderCounters>
	//   30   62:invokevirtual   #372 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   31   65:aload_0         
	//   32   66:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   33   69:aload_0         
	//   34   70:getfield        #367 <Field DecoderCounters decoderCounters>
	//   35   73:invokevirtual   #376 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//   36   76:aload_1         
	//   37   77:athrow          
		exception;
	//   38   78:astore_1        
		decoderCounters.ensureUpdated();
	//   39   79:aload_0         
	//   40   80:getfield        #367 <Field DecoderCounters decoderCounters>
	//   41   83:invokevirtual   #372 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   42   86:aload_0         
	//   43   87:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   44   90:aload_0         
	//   45   91:getfield        #367 <Field DecoderCounters decoderCounters>
	//   46   94:invokevirtual   #376 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//   47   97:aload_1         
	//   48   98:athrow          
	}

	protected void onEnabled(boolean flag)
		throws ExoPlaybackException
	{
		super.onEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #380 <Method void MediaCodecRenderer.onEnabled(boolean)>
		eventDispatcher.enabled(decoderCounters);
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//    5    9:aload_0         
	//    6   10:getfield        #367 <Field DecoderCounters decoderCounters>
	//    7   13:invokevirtual   #383 <Method void AudioRendererEventListener$EventDispatcher.enabled(DecoderCounters)>
		int i = getConfiguration().tunnelingAudioSessionId;
	//    8   16:aload_0         
	//    9   17:invokevirtual   #387 <Method RendererConfiguration getConfiguration()>
	//   10   20:getfield        #392 <Field int RendererConfiguration.tunnelingAudioSessionId>
	//   11   23:istore_2        
		if(i != 0)
	//*  12   24:iload_2         
	//*  13   25:ifeq            39
		{
			audioSink.enableTunnelingV21(i);
	//   14   28:aload_0         
	//   15   29:getfield        #79  <Field AudioSink audioSink>
	//   16   32:iload_2         
	//   17   33:invokeinterface #395 <Method void AudioSink.enableTunnelingV21(int)>
			return;
	//   18   38:return          
		} else
		{
			audioSink.disableTunneling();
	//   19   39:aload_0         
	//   20   40:getfield        #79  <Field AudioSink audioSink>
	//   21   43:invokeinterface #398 <Method void AudioSink.disableTunneling()>
			return;
	//   22   48:return          
		}
	}

	protected void onInputFormatChanged(Format format)
		throws ExoPlaybackException
	{
		super.onInputFormatChanged(format);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #402 <Method void MediaCodecRenderer.onInputFormatChanged(Format)>
		eventDispatcher.inputFormatChanged(format);
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #405 <Method void AudioRendererEventListener$EventDispatcher.inputFormatChanged(Format)>
		int i;
		if("audio/raw".equals(((Object) (format.sampleMimeType))))
	//*   7   13:ldc1            #235 <String "audio/raw">
	//*   8   15:aload_1         
	//*   9   16:getfield        #110 <Field String Format.sampleMimeType>
	//*  10   19:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  11   22:ifeq            33
			i = format.pcmEncoding;
	//   12   25:aload_1         
	//   13   26:getfield        #407 <Field int Format.pcmEncoding>
	//   14   29:istore_2        
		else
	//*  15   30:goto            35
			i = 2;
	//   16   33:iconst_2        
	//   17   34:istore_2        
		pcmEncoding = i;
	//   18   35:aload_0         
	//   19   36:iload_2         
	//   20   37:putfield        #408 <Field int pcmEncoding>
		channelCount = format.channelCount;
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:getfield        #118 <Field int Format.channelCount>
	//   24   45:putfield        #409 <Field int channelCount>
		encoderDelay = format.encoderDelay;
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:getfield        #123 <Field int Format.encoderDelay>
	//   28   53:putfield        #410 <Field int encoderDelay>
		encoderPadding = format.encoderPadding;
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:getfield        #125 <Field int Format.encoderPadding>
	//   32   61:putfield        #411 <Field int encoderPadding>
	//   33   64:return          
	}

	protected void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
		throws ExoPlaybackException
	{
		int i;
		if(passthroughMediaFormat != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field MediaFormat passthroughMediaFormat>
	//*   2    4:ifnull          28
		{
			i = MimeTypes.getEncoding(passthroughMediaFormat.getString("mime"));
	//    3    7:aload_0         
	//    4    8:getfield        #247 <Field MediaFormat passthroughMediaFormat>
	//    5   11:ldc1            #249 <String "mime">
	//    6   13:invokevirtual   #419 <Method String MediaFormat.getString(String)>
	//    7   16:invokestatic    #204 <Method int MimeTypes.getEncoding(String)>
	//    8   19:istore_3        
			mediaformat = passthroughMediaFormat;
	//    9   20:aload_0         
	//   10   21:getfield        #247 <Field MediaFormat passthroughMediaFormat>
	//   11   24:astore_2        
		} else
	//*  12   25:goto            36
		{
			i = pcmEncoding;
	//   13   28:aload_0         
	//   14   29:getfield        #408 <Field int pcmEncoding>
	//   15   32:istore_3        
		}
	//*  16   33:goto            25
		int k = mediaformat.getInteger("channel-count");
	//   17   36:aload_2         
	//   18   37:ldc2            #280 <String "channel-count">
	//   19   40:invokevirtual   #422 <Method int MediaFormat.getInteger(String)>
	//   20   43:istore          5
		int l = mediaformat.getInteger("sample-rate");
	//   21   45:aload_2         
	//   22   46:ldc2            #286 <String "sample-rate">
	//   23   49:invokevirtual   #422 <Method int MediaFormat.getInteger(String)>
	//   24   52:istore          6
		if(codecNeedsDiscardChannelsWorkaround && k == 6 && channelCount < 6)
	//*  25   54:aload_0         
	//*  26   55:getfield        #225 <Field boolean codecNeedsDiscardChannelsWorkaround>
	//*  27   58:ifeq            113
	//*  28   61:iload           5
	//*  29   63:bipush          6
	//*  30   65:icmpne          113
	//*  31   68:aload_0         
	//*  32   69:getfield        #409 <Field int channelCount>
	//*  33   72:bipush          6
	//*  34   74:icmpge          113
		{
			mediaformat = ((MediaFormat) (new int[channelCount]));
	//   35   77:aload_0         
	//   36   78:getfield        #409 <Field int channelCount>
	//   37   81:newarray        int[]
	//   38   83:astore_2        
			int j = 0;
	//   39   84:iconst_0        
	//   40   85:istore          4
			do
			{
				mediacodec = ((MediaCodec) (mediaformat));
	//   41   87:aload_2         
	//   42   88:astore_1        
				if(j >= channelCount)
					break;
	//   43   89:iload           4
	//   44   91:aload_0         
	//   45   92:getfield        #409 <Field int channelCount>
	//   46   95:icmpge          115
				mediaformat[j] = j;
	//   47   98:aload_2         
	//   48   99:iload           4
	//   49  101:iload           4
	//   50  103:iastore         
				j++;
	//   51  104:iload           4
	//   52  106:iconst_1        
	//   53  107:iadd            
	//   54  108:istore          4
			} while(true);
	//   55  110:goto            87
		} else
		{
			mediacodec = null;
	//   56  113:aconst_null     
	//   57  114:astore_1        
		}
		try
		{
			audioSink.configure(i, k, l, 0, ((int []) (mediacodec)), encoderDelay, encoderPadding);
	//   58  115:aload_0         
	//   59  116:getfield        #79  <Field AudioSink audioSink>
	//   60  119:iload_3         
	//   61  120:iload           5
	//   62  122:iload           6
	//   63  124:iconst_0        
	//   64  125:aload_1         
	//   65  126:aload_0         
	//   66  127:getfield        #410 <Field int encoderDelay>
	//   67  130:aload_0         
	//   68  131:getfield        #411 <Field int encoderPadding>
	//   69  134:invokeinterface #425 <Method void AudioSink.configure(int, int, int, int, int[], int, int)>
			return;
	//   70  139:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediaCodec mediacodec)
	//*  71  140:astore_1        
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (mediacodec)), getIndex());
	//   72  141:aload_1         
	//   73  142:aload_0         
	//   74  143:invokevirtual   #428 <Method int getIndex()>
	//   75  146:invokestatic    #432 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   76  149:athrow          
		}
	}

	protected void onPositionReset(long l, boolean flag)
		throws ExoPlaybackException
	{
		super.onPositionReset(l, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #436 <Method void MediaCodecRenderer.onPositionReset(long, boolean)>
		audioSink.reset();
	//    4    6:aload_0         
	//    5    7:getfield        #79  <Field AudioSink audioSink>
	//    6   10:invokeinterface #439 <Method void AudioSink.reset()>
		currentPositionUs = l;
	//    7   15:aload_0         
	//    8   16:lload_1         
	//    9   17:putfield        #191 <Field long currentPositionUs>
		allowFirstBufferPositionDiscontinuity = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #441 <Field boolean allowFirstBufferPositionDiscontinuity>
		allowPositionDiscontinuity = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #102 <Field boolean allowPositionDiscontinuity>
	//   16   30:return          
	}

	protected void onQueueInputBuffer(DecoderInputBuffer decoderinputbuffer)
	{
		if(allowFirstBufferPositionDiscontinuity && !decoderinputbuffer.isDecodeOnly())
	//*   0    0:aload_0         
	//*   1    1:getfield        #441 <Field boolean allowFirstBufferPositionDiscontinuity>
	//*   2    4:ifeq            46
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #448 <Method boolean DecoderInputBuffer.isDecodeOnly()>
	//*   5   11:ifne            46
		{
			if(Math.abs(decoderinputbuffer.timeUs - currentPositionUs) > 0x7a120L)
	//*   6   14:aload_1         
	//*   7   15:getfield        #451 <Field long DecoderInputBuffer.timeUs>
	//*   8   18:aload_0         
	//*   9   19:getfield        #191 <Field long currentPositionUs>
	//*  10   22:lsub            
	//*  11   23:invokestatic    #455 <Method long Math.abs(long)>
	//*  12   26:ldc2w           #456 <Long 0x7a120L>
	//*  13   29:lcmp            
	//*  14   30:ifle            41
				currentPositionUs = decoderinputbuffer.timeUs;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getfield        #451 <Field long DecoderInputBuffer.timeUs>
	//   18   38:putfield        #191 <Field long currentPositionUs>
			allowFirstBufferPositionDiscontinuity = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #441 <Field boolean allowFirstBufferPositionDiscontinuity>
		}
	//   22   46:return          
	}

	protected void onStarted()
	{
		super.onStarted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #460 <Method void MediaCodecRenderer.onStarted()>
		audioSink.play();
	//    2    4:aload_0         
	//    3    5:getfield        #79  <Field AudioSink audioSink>
	//    4    8:invokeinterface #463 <Method void AudioSink.play()>
	//    5   13:return          
	}

	protected void onStopped()
	{
		updateCurrentPosition();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method void updateCurrentPosition()>
		audioSink.pause();
	//    2    4:aload_0         
	//    3    5:getfield        #79  <Field AudioSink audioSink>
	//    4    8:invokeinterface #467 <Method void AudioSink.pause()>
		super.onStopped();
	//    5   13:aload_0         
	//    6   14:invokespecial   #469 <Method void MediaCodecRenderer.onStopped()>
	//    7   17:return          
	}

	protected boolean processOutputBuffer(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, int i, 
			int j, long l2, boolean flag)
		throws ExoPlaybackException
	{
		if(passthroughEnabled && (j & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field boolean passthroughEnabled>
	//*   2    4:ifeq            24
	//*   3    7:iload           8
	//*   4    9:iconst_2        
	//*   5   10:iand            
	//*   6   11:ifeq            24
		{
			mediacodec.releaseOutputBuffer(i, false);
	//    7   14:aload           5
	//    8   16:iload           7
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #479 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
			return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
		}
		if(flag)
	//*  13   24:iload           11
	//*  14   26:ifeq            66
		{
			mediacodec.releaseOutputBuffer(i, false);
	//   15   29:aload           5
	//   16   31:iload           7
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #479 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
			mediacodec = ((MediaCodec) (decoderCounters));
	//   19   37:aload_0         
	//   20   38:getfield        #367 <Field DecoderCounters decoderCounters>
	//   21   41:astore          5
			mediacodec.skippedOutputBufferCount = ((DecoderCounters) (mediacodec)).skippedOutputBufferCount + 1;
	//   22   43:aload           5
	//   23   45:aload           5
	//   24   47:getfield        #482 <Field int DecoderCounters.skippedOutputBufferCount>
	//   25   50:iconst_1        
	//   26   51:iadd            
	//   27   52:putfield        #482 <Field int DecoderCounters.skippedOutputBufferCount>
			audioSink.handleDiscontinuity();
	//   28   55:aload_0         
	//   29   56:getfield        #79  <Field AudioSink audioSink>
	//   30   59:invokeinterface #485 <Method void AudioSink.handleDiscontinuity()>
			return true;
	//   31   64:iconst_1        
	//   32   65:ireturn         
		}
label0:
		{
			try
			{
				if(!audioSink.handleBuffer(bytebuffer, l2))
					break label0;
	//   33   66:aload_0         
	//   34   67:getfield        #79  <Field AudioSink audioSink>
	//   35   70:aload           6
	//   36   72:lload           9
	//   37   74:invokeinterface #489 <Method boolean AudioSink.handleBuffer(ByteBuffer, long)>
	//   38   79:ifeq            110
				mediacodec.releaseOutputBuffer(i, false);
	//   39   82:aload           5
	//   40   84:iload           7
	//   41   86:iconst_0        
	//   42   87:invokevirtual   #479 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
				mediacodec = ((MediaCodec) (decoderCounters));
	//   43   90:aload_0         
	//   44   91:getfield        #367 <Field DecoderCounters decoderCounters>
	//   45   94:astore          5
				mediacodec.renderedOutputBufferCount = ((DecoderCounters) (mediacodec)).renderedOutputBufferCount + 1;
	//   46   96:aload           5
	//   47   98:aload           5
	//   48  100:getfield        #492 <Field int DecoderCounters.renderedOutputBufferCount>
	//   49  103:iconst_1        
	//   50  104:iadd            
	//   51  105:putfield        #492 <Field int DecoderCounters.renderedOutputBufferCount>
			}
	//*  52  108:iconst_1        
	//*  53  109:ireturn         
	//*  54  110:iconst_0        
	//*  55  111:ireturn         
			// Misplaced declaration of an exception variable
			catch(MediaCodec mediacodec)
	//*  56  112:astore          5
			{
				throw ExoPlaybackException.createForRenderer(((Exception) (mediacodec)), getIndex());
	//   57  114:aload           5
	//   58  116:aload_0         
	//   59  117:invokevirtual   #428 <Method int getIndex()>
	//   60  120:invokestatic    #432 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   61  123:athrow          
			}
			return true;
		}
		return false;
	}

	protected void renderToEndOfStream()
		throws ExoPlaybackException
	{
		try
		{
			audioSink.playToEndOfStream();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AudioSink audioSink>
	//    2    4:invokeinterface #496 <Method void AudioSink.playToEndOfStream()>
			return;
	//    3    9:return          
		}
		catch(AudioSink.WriteException writeexception)
	//*   4   10:astore_1        
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (writeexception)), getIndex());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #428 <Method int getIndex()>
	//    8   16:invokestatic    #432 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//    9   19:athrow          
		}
	}

	public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		return audioSink.setPlaybackParameters(playbackparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AudioSink audioSink>
	//    2    4:aload_1         
	//    3    5:invokeinterface #500 <Method PlaybackParameters AudioSink.setPlaybackParameters(PlaybackParameters)>
	//    4   10:areturn         
	}

	protected int supportsFormat(MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, Format format)
		throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #504 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #506 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #511 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private boolean allowFirstBufferPositionDiscontinuity;
	private boolean allowPositionDiscontinuity;
	private final AudioSink audioSink;
	private int channelCount;
	private int codecMaxInputSize;
	private boolean codecNeedsDiscardChannelsWorkaround;
	private final Context context;
	private long currentPositionUs;
	private int encoderDelay;
	private int encoderPadding;
	private final AudioRendererEventListener.EventDispatcher eventDispatcher;
	private boolean passthroughEnabled;
	private MediaFormat passthroughMediaFormat;
	private int pcmEncoding;


/*
	static AudioRendererEventListener.EventDispatcher access$100(MediaCodecAudioRenderer mediacodecaudiorenderer)
	{
		return mediacodecaudiorenderer.eventDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$202(MediaCodecAudioRenderer mediacodecaudiorenderer, boolean flag)
	{
		mediacodecaudiorenderer.allowPositionDiscontinuity = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #102 <Field boolean allowPositionDiscontinuity>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
