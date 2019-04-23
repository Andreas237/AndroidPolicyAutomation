// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.*;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.audio.AudioTrack;
import com.google.android.exoplayer.drm.DrmSessionManager;
import com.google.android.exoplayer.util.MimeTypes;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecTrackRenderer, MediaClock, SampleSource, MediaCodecSelector, 
//			ExoPlaybackException, MediaFormat, MediaFormatHolder, CodecCounters, 
//			DecoderInfo

public class MediaCodecAudioTrackRenderer extends MediaCodecTrackRenderer
	implements MediaClock
{
	public static interface EventListener
		extends MediaCodecTrackRenderer.EventListener
	{

		public abstract void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception);

		public abstract void onAudioTrackUnderrun(int i, long l, long l1);

		public abstract void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception);
	}


	public MediaCodecAudioTrackRenderer(SampleSource samplesource, MediaCodecSelector mediacodecselector)
	{
		this(samplesource, mediacodecselector, ((DrmSessionManager) (null)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_1        
	//    5    5:invokespecial   #45  <Method void MediaCodecAudioTrackRenderer(SampleSource, MediaCodecSelector, DrmSessionManager, boolean)>
	//    6    8:return          
	}

	public MediaCodecAudioTrackRenderer(SampleSource samplesource, MediaCodecSelector mediacodecselector, Handler handler, EventListener eventlistener)
	{
		this(samplesource, mediacodecselector, ((DrmSessionManager) (null)), true, handler, eventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_1        
	//    5    5:aload_3         
	//    6    6:aload           4
	//    7    8:invokespecial   #50  <Method void MediaCodecAudioTrackRenderer(SampleSource, MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecAudioTrackRenderer$EventListener)>
	//    8   11:return          
	}

	public MediaCodecAudioTrackRenderer(SampleSource samplesource, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag)
	{
		this(samplesource, mediacodecselector, drmsessionmanager, flag, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #50  <Method void MediaCodecAudioTrackRenderer(SampleSource, MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecAudioTrackRenderer$EventListener)>
	//    8   11:return          
	}

	public MediaCodecAudioTrackRenderer(SampleSource samplesource, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener)
	{
		this(samplesource, mediacodecselector, drmsessionmanager, flag, handler, eventlistener, ((AudioCapabilities) (null)), 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aconst_null     
	//    8   11:iconst_3        
	//    9   12:invokespecial   #53  <Method void MediaCodecAudioTrackRenderer(SampleSource, MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
	//   10   15:return          
	}

	public MediaCodecAudioTrackRenderer(SampleSource samplesource, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener, AudioCapabilities audiocapabilities, 
			int i)
	{
		this(new SampleSource[] {
			samplesource
		}, mediacodecselector, drmsessionmanager, flag, handler, eventlistener, audiocapabilities, i);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       SampleSource[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:aload_2         
	//    8   10:aload_3         
	//    9   11:iload           4
	//   10   13:aload           5
	//   11   15:aload           6
	//   12   17:aload           7
	//   13   19:iload           8
	//   14   21:invokespecial   #58  <Method void MediaCodecAudioTrackRenderer(SampleSource[], MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
	//   15   24:return          
	}

	public MediaCodecAudioTrackRenderer(SampleSource asamplesource[], MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener, AudioCapabilities audiocapabilities, 
			int i)
	{
		super(asamplesource, mediacodecselector, drmsessionmanager, flag, handler, ((MediaCodecTrackRenderer.EventListener) (eventlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #61  <Method void MediaCodecTrackRenderer(SampleSource[], MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecTrackRenderer$EventListener)>
		eventListener = eventlistener;
	//    8   13:aload_0         
	//    9   14:aload           6
	//   10   16:putfield        #63  <Field MediaCodecAudioTrackRenderer$EventListener eventListener>
		audioSessionId = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #65  <Field int audioSessionId>
		audioTrack = new AudioTrack(audiocapabilities, i);
	//   14   24:aload_0         
	//   15   25:new             #67  <Class AudioTrack>
	//   16   28:dup             
	//   17   29:aload           7
	//   18   31:iload           8
	//   19   33:invokespecial   #70  <Method void AudioTrack(AudioCapabilities, int)>
	//   20   36:putfield        #72  <Field AudioTrack audioTrack>
	//   21   39:return          
	}

	private void notifyAudioTrackInitializationError(final com.google.android.exoplayer.audio.AudioTrack.InitializationException e)
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Handler eventHandler>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #63  <Field MediaCodecAudioTrackRenderer$EventListener eventListener>
	//*   5   11:ifnull          31
			eventHandler.post(new Runnable() {

				public void run()
				{
					eventListener.onAudioTrackInitializationError(e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MediaCodecAudioTrackRenderer this$0>
				//    2    4:invokestatic    #30  <Method MediaCodecAudioTrackRenderer$EventListener MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field com.google.android.exoplayer.audio.AudioTrack$InitializationException val$e>
				//    5   11:invokeinterface #35  <Method void MediaCodecAudioTrackRenderer$EventListener.onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack$InitializationException)>
				//    6   16:return          
				}

				final MediaCodecAudioTrackRenderer this$0;
				final com.google.android.exoplayer.audio.AudioTrack.InitializationException val$e;

			
			{
				this$0 = MediaCodecAudioTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaCodecAudioTrackRenderer this$0>
				e = initializationexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.google.android.exoplayer.audio.AudioTrack$InitializationException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #80  <Field Handler eventHandler>
	//    8   18:new             #8   <Class MediaCodecAudioTrackRenderer$1>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #83  <Method void MediaCodecAudioTrackRenderer$1(MediaCodecAudioTrackRenderer, com.google.android.exoplayer.audio.AudioTrack$InitializationException)>
	//   13   27:invokevirtual   #89  <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	private void notifyAudioTrackUnderrun(final int bufferSize, final long bufferSizeMs, final long elapsedSinceLastFeedMs)
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Handler eventHandler>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:getfield        #63  <Field MediaCodecAudioTrackRenderer$EventListener eventListener>
	//*   5   11:ifnull          34
			eventHandler.post(new Runnable() {

				public void run()
				{
					eventListener.onAudioTrackUnderrun(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field MediaCodecAudioTrackRenderer this$0>
				//    2    4:invokestatic    #37  <Method MediaCodecAudioTrackRenderer$EventListener MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field int val$bufferSize>
				//    5   11:aload_0         
				//    6   12:getfield        #26  <Field long val$bufferSizeMs>
				//    7   15:aload_0         
				//    8   16:getfield        #28  <Field long val$elapsedSinceLastFeedMs>
				//    9   19:invokeinterface #42  <Method void MediaCodecAudioTrackRenderer$EventListener.onAudioTrackUnderrun(int, long, long)>
				//   10   24:return          
				}

				final MediaCodecAudioTrackRenderer this$0;
				final int val$bufferSize;
				final long val$bufferSizeMs;
				final long val$elapsedSinceLastFeedMs;

			
			{
				this$0 = MediaCodecAudioTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaCodecAudioTrackRenderer this$0>
				bufferSize = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int val$bufferSize>
				bufferSizeMs = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #26  <Field long val$bufferSizeMs>
				elapsedSinceLastFeedMs = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #28  <Field long val$elapsedSinceLastFeedMs>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #80  <Field Handler eventHandler>
	//    8   18:new             #12  <Class MediaCodecAudioTrackRenderer$3>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:lload_2         
	//   13   25:lload           4
	//   14   27:invokespecial   #94  <Method void MediaCodecAudioTrackRenderer$3(MediaCodecAudioTrackRenderer, int, long, long)>
	//   15   30:invokevirtual   #89  <Method boolean Handler.post(Runnable)>
	//   16   33:pop             
	//   17   34:return          
	}

	private void notifyAudioTrackWriteError(final com.google.android.exoplayer.audio.AudioTrack.WriteException e)
	{
		if(eventHandler != null && eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Handler eventHandler>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #63  <Field MediaCodecAudioTrackRenderer$EventListener eventListener>
	//*   5   11:ifnull          31
			eventHandler.post(new Runnable() {

				public void run()
				{
					eventListener.onAudioTrackWriteError(e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MediaCodecAudioTrackRenderer this$0>
				//    2    4:invokestatic    #30  <Method MediaCodecAudioTrackRenderer$EventListener MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field com.google.android.exoplayer.audio.AudioTrack$WriteException val$e>
				//    5   11:invokeinterface #35  <Method void MediaCodecAudioTrackRenderer$EventListener.onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack$WriteException)>
				//    6   16:return          
				}

				final MediaCodecAudioTrackRenderer this$0;
				final com.google.android.exoplayer.audio.AudioTrack.WriteException val$e;

			
			{
				this$0 = MediaCodecAudioTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaCodecAudioTrackRenderer this$0>
				e = writeexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.google.android.exoplayer.audio.AudioTrack$WriteException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   14:aload_0         
	//    7   15:getfield        #80  <Field Handler eventHandler>
	//    8   18:new             #10  <Class MediaCodecAudioTrackRenderer$2>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #99  <Method void MediaCodecAudioTrackRenderer$2(MediaCodecAudioTrackRenderer, com.google.android.exoplayer.audio.AudioTrack$WriteException)>
	//   13   27:invokevirtual   #89  <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	protected boolean allowPassthrough(String s)
	{
		return audioTrack.isPassthroughSupported(s);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field AudioTrack audioTrack>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method boolean AudioTrack.isPassthroughSupported(String)>
	//    4    8:ireturn         
	}

	protected void configureCodec(MediaCodec mediacodec, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
	{
		String s = mediaformat.getString("mime");
	//    0    0:aload_3         
	//    1    1:ldc1            #108 <String "mime">
	//    2    3:invokevirtual   #114 <Method String MediaFormat.getString(String)>
	//    3    6:astore          5
		if(passthroughEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #116 <Field boolean passthroughEnabled>
	//*   6   12:ifeq            46
		{
			mediaformat.setString("mime", "audio/raw");
	//    7   15:aload_3         
	//    8   16:ldc1            #108 <String "mime">
	//    9   18:ldc1            #118 <String "audio/raw">
	//   10   20:invokevirtual   #122 <Method void MediaFormat.setString(String, String)>
			mediacodec.configure(mediaformat, ((android.view.Surface) (null)), mediacrypto, 0);
	//   11   23:aload_1         
	//   12   24:aload_3         
	//   13   25:aconst_null     
	//   14   26:aload           4
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #128 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
			mediaformat.setString("mime", s);
	//   17   32:aload_3         
	//   18   33:ldc1            #108 <String "mime">
	//   19   35:aload           5
	//   20   37:invokevirtual   #122 <Method void MediaFormat.setString(String, String)>
			passthroughMediaFormat = mediaformat;
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:putfield        #130 <Field MediaFormat passthroughMediaFormat>
			return;
	//   24   45:return          
		} else
		{
			mediacodec.configure(mediaformat, ((android.view.Surface) (null)), mediacrypto, 0);
	//   25   46:aload_1         
	//   26   47:aload_3         
	//   27   48:aconst_null     
	//   28   49:aload           4
	//   29   51:iconst_0        
	//   30   52:invokevirtual   #128 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
			passthroughMediaFormat = null;
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:putfield        #130 <Field MediaFormat passthroughMediaFormat>
			return;
	//   34   60:return          
		}
	}

	protected DecoderInfo getDecoderInfo(MediaCodecSelector mediacodecselector, String s, boolean flag)
		throws MediaCodecUtil.DecoderQueryException
	{
		if(allowPassthrough(s))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #136 <Method boolean allowPassthrough(String)>
	//*   3    5:ifeq            29
		{
			DecoderInfo decoderinfo = mediacodecselector.getPassthroughDecoderInfo();
	//    4    8:aload_1         
	//    5    9:invokeinterface #142 <Method DecoderInfo MediaCodecSelector.getPassthroughDecoderInfo()>
	//    6   14:astore          4
			if(decoderinfo != null)
	//*   7   16:aload           4
	//*   8   18:ifnull          29
			{
				passthroughEnabled = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #116 <Field boolean passthroughEnabled>
				return decoderinfo;
	//   12   26:aload           4
	//   13   28:areturn         
			}
		}
		passthroughEnabled = false;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #116 <Field boolean passthroughEnabled>
		return super.getDecoderInfo(mediacodecselector, s, flag);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:iload_3         
	//   21   38:invokespecial   #144 <Method DecoderInfo MediaCodecTrackRenderer.getDecoderInfo(MediaCodecSelector, String, boolean)>
	//   22   41:areturn         
	}

	protected MediaClock getMediaClock()
	{
		return ((MediaClock) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public long getPositionUs()
	{
		long l = audioTrack.getCurrentPositionUs(isEnded());
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field AudioTrack audioTrack>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #153 <Method boolean isEnded()>
	//    4    8:invokevirtual   #157 <Method long AudioTrack.getCurrentPositionUs(boolean)>
	//    5   11:lstore_1        
		if(l != 0x0L)
	//*   6   12:lload_1         
	//*   7   13:ldc2w           #158 <Long 0x0L>
	//*   8   16:lcmp            
	//*   9   17:ifeq            49
		{
			if(!allowPositionDiscontinuity)
	//*  10   20:aload_0         
	//*  11   21:getfield        #161 <Field boolean allowPositionDiscontinuity>
	//*  12   24:ifeq            30
	//*  13   27:goto            39
				l = Math.max(currentPositionUs, l);
	//   14   30:aload_0         
	//   15   31:getfield        #163 <Field long currentPositionUs>
	//   16   34:lload_1         
	//   17   35:invokestatic    #169 <Method long Math.max(long, long)>
	//   18   38:lstore_1        
			currentPositionUs = l;
	//   19   39:aload_0         
	//   20   40:lload_1         
	//   21   41:putfield        #163 <Field long currentPositionUs>
			allowPositionDiscontinuity = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #161 <Field boolean allowPositionDiscontinuity>
		}
		return currentPositionUs;
	//   25   49:aload_0         
	//   26   50:getfield        #163 <Field long currentPositionUs>
	//   27   53:lreturn         
	}

	protected void handleAudioTrackDiscontinuity()
	{
	//    0    0:return          
	}

	public void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 72
	//	               2 60
	//	               3 35
		default:
			super.handleMessage(i, obj);
	//    2   28:aload_0         
	//    3   29:iload_1         
	//    4   30:aload_2         
	//    5   31:invokespecial   #177 <Method void MediaCodecTrackRenderer.handleMessage(int, Object)>
			return;
	//    6   34:return          

		case 3: // '\003'
			i = ((Integer)obj).intValue();
	//    7   35:aload_2         
	//    8   36:checkcast       #179 <Class Integer>
	//    9   39:invokevirtual   #183 <Method int Integer.intValue()>
	//   10   42:istore_1        
			if(audioTrack.setStreamType(i))
	//*  11   43:aload_0         
	//*  12   44:getfield        #72  <Field AudioTrack audioTrack>
	//*  13   47:iload_1         
	//*  14   48:invokevirtual   #187 <Method boolean AudioTrack.setStreamType(int)>
	//*  15   51:ifeq            86
			{
				audioSessionId = 0;
	//   16   54:aload_0         
	//   17   55:iconst_0        
	//   18   56:putfield        #65  <Field int audioSessionId>
				return;
	//   19   59:return          
			}
			break;

		case 2: // '\002'
			audioTrack.setPlaybackParams((PlaybackParams)obj);
	//   20   60:aload_0         
	//   21   61:getfield        #72  <Field AudioTrack audioTrack>
	//   22   64:aload_2         
	//   23   65:checkcast       #189 <Class PlaybackParams>
	//   24   68:invokevirtual   #193 <Method void AudioTrack.setPlaybackParams(PlaybackParams)>
			return;
	//   25   71:return          

		case 1: // '\001'
			audioTrack.setVolume(((Float)obj).floatValue());
	//   26   72:aload_0         
	//   27   73:getfield        #72  <Field AudioTrack audioTrack>
	//   28   76:aload_2         
	//   29   77:checkcast       #195 <Class Float>
	//   30   80:invokevirtual   #199 <Method float Float.floatValue()>
	//   31   83:invokevirtual   #203 <Method void AudioTrack.setVolume(float)>
			break;
		}
	//   32   86:return          
	}

	protected boolean handlesTrack(MediaCodecSelector mediacodecselector, com.google.android.exoplayer.MediaFormat mediaformat)
		throws MediaCodecUtil.DecoderQueryException
	{
		boolean flag;
label0:
		{
			mediaformat = ((com.google.android.exoplayer.MediaFormat) (mediaformat.mimeType));
	//    0    0:aload_2         
	//    1    1:getfield        #211 <Field String MediaFormat.mimeType>
	//    2    4:astore_2        
			boolean flag2 = MimeTypes.isAudio(((String) (mediaformat)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #216 <Method boolean MimeTypes.isAudio(String)>
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
	//   11   19:ifeq            64
			if(!"audio/x-unknown".equals(((Object) (mediaformat))) && (!allowPassthrough(((String) (mediaformat))) || mediacodecselector.getPassthroughDecoderInfo() == null))
	//*  12   22:ldc1            #218 <String "audio/x-unknown">
	//*  13   24:aload_2         
	//*  14   25:invokevirtual   #224 <Method boolean String.equals(Object)>
	//*  15   28:ifne            62
	//*  16   31:aload_0         
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #136 <Method boolean allowPassthrough(String)>
	//*  19   36:ifeq            48
	//*  20   39:aload_1         
	//*  21   40:invokeinterface #142 <Method DecoderInfo MediaCodecSelector.getPassthroughDecoderInfo()>
	//*  22   45:ifnonnull       62
			{
				flag = flag1;
	//   23   48:iload           4
	//   24   50:istore_3        
				if(mediacodecselector.getDecoderInfo(((String) (mediaformat)), false) == null)
					break label0;
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:iconst_0        
	//   28   54:invokeinterface #227 <Method DecoderInfo MediaCodecSelector.getDecoderInfo(String, boolean)>
	//   29   59:ifnull          64
			}
			flag = true;
	//   30   62:iconst_1        
	//   31   63:istore_3        
		}
		return flag;
	//   32   64:iload_3         
	//   33   65:ireturn         
	}

	protected boolean isEnded()
	{
		return super.isEnded() && !audioTrack.hasPendingData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #228 <Method boolean MediaCodecTrackRenderer.isEnded()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field AudioTrack audioTrack>
	//    5   11:invokevirtual   #231 <Method boolean AudioTrack.hasPendingData()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected boolean isReady()
	{
		return audioTrack.hasPendingData() || super.isReady();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field AudioTrack audioTrack>
	//    2    4:invokevirtual   #231 <Method boolean AudioTrack.hasPendingData()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:invokespecial   #234 <Method boolean MediaCodecTrackRenderer.isReady()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	protected void onAudioSessionId(int i)
	{
	//    0    0:return          
	}

	protected void onDisabled()
		throws ExoPlaybackException
	{
		audioSessionId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #65  <Field int audioSessionId>
		audioTrack.release();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AudioTrack audioTrack>
	//    5    9:invokevirtual   #240 <Method void AudioTrack.release()>
		super.onDisabled();
	//    6   12:aload_0         
	//    7   13:invokespecial   #242 <Method void MediaCodecTrackRenderer.onDisabled()>
		return;
	//    8   16:return          
		Exception exception;
		exception;
	//    9   17:astore_1        
		super.onDisabled();
	//   10   18:aload_0         
	//   11   19:invokespecial   #242 <Method void MediaCodecTrackRenderer.onDisabled()>
		throw exception;
	//   12   22:aload_1         
	//   13   23:athrow          
	}

	protected void onDiscontinuity(long l)
		throws ExoPlaybackException
	{
		super.onDiscontinuity(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #246 <Method void MediaCodecTrackRenderer.onDiscontinuity(long)>
		audioTrack.reset();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AudioTrack audioTrack>
	//    5    9:invokevirtual   #249 <Method void AudioTrack.reset()>
		currentPositionUs = l;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #163 <Field long currentPositionUs>
		allowPositionDiscontinuity = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #161 <Field boolean allowPositionDiscontinuity>
	//   12   22:return          
	}

	protected void onInputFormatChanged(MediaFormatHolder mediaformatholder)
		throws ExoPlaybackException
	{
		super.onInputFormatChanged(mediaformatholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #253 <Method void MediaCodecTrackRenderer.onInputFormatChanged(MediaFormatHolder)>
		int i;
		if("audio/raw".equals(((Object) (mediaformatholder.format.mimeType))))
	//*   3    5:ldc1            #118 <String "audio/raw">
	//*   4    7:aload_1         
	//*   5    8:getfield        #259 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//*   6   11:getfield        #211 <Field String MediaFormat.mimeType>
	//*   7   14:invokevirtual   #224 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            31
			i = mediaformatholder.format.pcmEncoding;
	//    9   20:aload_1         
	//   10   21:getfield        #259 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//   11   24:getfield        #261 <Field int MediaFormat.pcmEncoding>
	//   12   27:istore_2        
		else
	//*  13   28:goto            33
			i = 2;
	//   14   31:iconst_2        
	//   15   32:istore_2        
		pcmEncoding = i;
	//   16   33:aload_0         
	//   17   34:iload_2         
	//   18   35:putfield        #262 <Field int pcmEncoding>
	//   19   38:return          
	}

	protected void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		boolean flag;
		if(passthroughMediaFormat != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field MediaFormat passthroughMediaFormat>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		if(flag)
	//*   8   14:iload_3         
	//*   9   15:ifeq            31
			mediacodec = ((MediaCodec) (passthroughMediaFormat.getString("mime")));
	//   10   18:aload_0         
	//   11   19:getfield        #130 <Field MediaFormat passthroughMediaFormat>
	//   12   22:ldc1            #108 <String "mime">
	//   13   24:invokevirtual   #114 <Method String MediaFormat.getString(String)>
	//   14   27:astore_1        
		else
	//*  15   28:goto            34
			mediacodec = "audio/raw";
	//   16   31:ldc1            #118 <String "audio/raw">
	//   17   33:astore_1        
		if(flag)
	//*  18   34:iload_3         
	//*  19   35:ifeq            43
			mediaformat = passthroughMediaFormat;
	//   20   38:aload_0         
	//   21   39:getfield        #130 <Field MediaFormat passthroughMediaFormat>
	//   22   42:astore_2        
		int i = mediaformat.getInteger("channel-count");
	//   23   43:aload_2         
	//   24   44:ldc2            #266 <String "channel-count">
	//   25   47:invokevirtual   #270 <Method int MediaFormat.getInteger(String)>
	//   26   50:istore_3        
		int j = mediaformat.getInteger("sample-rate");
	//   27   51:aload_2         
	//   28   52:ldc2            #272 <String "sample-rate">
	//   29   55:invokevirtual   #270 <Method int MediaFormat.getInteger(String)>
	//   30   58:istore          4
		audioTrack.configure(((String) (mediacodec)), i, j, pcmEncoding);
	//   31   60:aload_0         
	//   32   61:getfield        #72  <Field AudioTrack audioTrack>
	//   33   64:aload_1         
	//   34   65:iload_3         
	//   35   66:iload           4
	//   36   68:aload_0         
	//   37   69:getfield        #262 <Field int pcmEncoding>
	//   38   72:invokevirtual   #275 <Method void AudioTrack.configure(String, int, int, int)>
	//   39   75:return          
	}

	protected void onOutputStreamEnded()
	{
		audioTrack.handleEndOfStream();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field AudioTrack audioTrack>
	//    2    4:invokevirtual   #279 <Method void AudioTrack.handleEndOfStream()>
	//    3    7:return          
	}

	protected void onStarted()
	{
		super.onStarted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void MediaCodecTrackRenderer.onStarted()>
		audioTrack.play();
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field AudioTrack audioTrack>
	//    4    8:invokevirtual   #285 <Method void AudioTrack.play()>
	//    5   11:return          
	}

	protected void onStopped()
	{
		audioTrack.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field AudioTrack audioTrack>
	//    2    4:invokevirtual   #289 <Method void AudioTrack.pause()>
		super.onStopped();
	//    3    7:aload_0         
	//    4    8:invokespecial   #291 <Method void MediaCodecTrackRenderer.onStopped()>
	//    5   11:return          
	}

	protected boolean processOutputBuffer(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
			int i, boolean flag)
		throws ExoPlaybackException
	{
label0:
		{
			if(passthroughEnabled && (bufferinfo.flags & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field boolean passthroughEnabled>
	//*   2    4:ifeq            27
	//*   3    7:aload           7
	//*   4    9:getfield        #302 <Field int android.media.MediaCodec$BufferInfo.flags>
	//*   5   12:iconst_2        
	//*   6   13:iand            
	//*   7   14:ifeq            27
			{
				mediacodec.releaseOutputBuffer(i, false);
	//    8   17:aload           5
	//    9   19:iload           8
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #306 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
				return true;
	//   12   25:iconst_1        
	//   13   26:ireturn         
			}
			if(flag)
	//*  14   27:iload           9
	//*  15   29:ifeq            67
			{
				mediacodec.releaseOutputBuffer(i, false);
	//   16   32:aload           5
	//   17   34:iload           8
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #306 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
				mediacodec = ((MediaCodec) (codecCounters));
	//   20   40:aload_0         
	//   21   41:getfield        #310 <Field CodecCounters codecCounters>
	//   22   44:astore          5
				mediacodec.skippedOutputBufferCount = ((CodecCounters) (mediacodec)).skippedOutputBufferCount + 1;
	//   23   46:aload           5
	//   24   48:aload           5
	//   25   50:getfield        #315 <Field int CodecCounters.skippedOutputBufferCount>
	//   26   53:iconst_1        
	//   27   54:iadd            
	//   28   55:putfield        #315 <Field int CodecCounters.skippedOutputBufferCount>
				audioTrack.handleDiscontinuity();
	//   29   58:aload_0         
	//   30   59:getfield        #72  <Field AudioTrack audioTrack>
	//   31   62:invokevirtual   #318 <Method void AudioTrack.handleDiscontinuity()>
				return true;
	//   32   65:iconst_1        
	//   33   66:ireturn         
			}
			if(audioTrack.isInitialized())
				break label0;
	//   34   67:aload_0         
	//   35   68:getfield        #72  <Field AudioTrack audioTrack>
	//   36   71:invokevirtual   #321 <Method boolean AudioTrack.isInitialized()>
	//   37   74:ifne            159
			try
			{
				if(audioSessionId != 0)
	//*  38   77:aload_0         
	//*  39   78:getfield        #65  <Field int audioSessionId>
	//*  40   81:ifeq            99
				{
					audioTrack.initialize(audioSessionId);
	//   41   84:aload_0         
	//   42   85:getfield        #72  <Field AudioTrack audioTrack>
	//   43   88:aload_0         
	//   44   89:getfield        #65  <Field int audioSessionId>
	//   45   92:invokevirtual   #325 <Method int AudioTrack.initialize(int)>
	//   46   95:pop             
					break MISSING_BLOCK_LABEL_118;
	//   47   96:goto            118
				}
			}
	//*  48   99:aload_0         
	//*  49  100:aload_0         
	//*  50  101:getfield        #72  <Field AudioTrack audioTrack>
	//*  51  104:invokevirtual   #327 <Method int AudioTrack.initialize()>
	//*  52  107:putfield        #65  <Field int audioSessionId>
	//*  53  110:aload_0         
	//*  54  111:aload_0         
	//*  55  112:getfield        #65  <Field int audioSessionId>
	//*  56  115:invokevirtual   #329 <Method void onAudioSessionId(int)>
	//*  57  118:aload_0         
	//*  58  119:iconst_0        
	//*  59  120:putfield        #331 <Field boolean audioTrackHasData>
	//*  60  123:aload_0         
	//*  61  124:invokevirtual   #334 <Method int getState()>
	//*  62  127:iconst_3        
	//*  63  128:icmpne          254
	//*  64  131:aload_0         
	//*  65  132:getfield        #72  <Field AudioTrack audioTrack>
	//*  66  135:invokevirtual   #285 <Method void AudioTrack.play()>
	//*  67  138:goto            254
			// Misplaced declaration of an exception variable
			catch(MediaCodec mediacodec)
	//*  68  141:astore          5
			{
				notifyAudioTrackInitializationError(((com.google.android.exoplayer.audio.AudioTrack.InitializationException) (mediacodec)));
	//   69  143:aload_0         
	//   70  144:aload           5
	//   71  146:invokespecial   #336 <Method void notifyAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack$InitializationException)>
				throw new ExoPlaybackException(((Throwable) (mediacodec)));
	//   72  149:new             #175 <Class ExoPlaybackException>
	//   73  152:dup             
	//   74  153:aload           5
	//   75  155:invokespecial   #339 <Method void ExoPlaybackException(Throwable)>
	//   76  158:athrow          
			}
		}
		audioSessionId = audioTrack.initialize();
		onAudioSessionId(audioSessionId);
		audioTrackHasData = false;
		if(getState() == 3)
			audioTrack.play();
		break MISSING_BLOCK_LABEL_254;
		flag = audioTrackHasData;
	//   77  159:aload_0         
	//   78  160:getfield        #331 <Field boolean audioTrackHasData>
	//   79  163:istore          9
		audioTrackHasData = audioTrack.hasPendingData();
	//   80  165:aload_0         
	//   81  166:aload_0         
	//   82  167:getfield        #72  <Field AudioTrack audioTrack>
	//   83  170:invokevirtual   #231 <Method boolean AudioTrack.hasPendingData()>
	//   84  173:putfield        #331 <Field boolean audioTrackHasData>
		if(flag && !audioTrackHasData && getState() == 3)
	//*  85  176:iload           9
	//*  86  178:ifeq            254
	//*  87  181:aload_0         
	//*  88  182:getfield        #331 <Field boolean audioTrackHasData>
	//*  89  185:ifne            254
	//*  90  188:aload_0         
	//*  91  189:invokevirtual   #334 <Method int getState()>
	//*  92  192:iconst_3        
	//*  93  193:icmpne          254
		{
			l1 = SystemClock.elapsedRealtime();
	//   94  196:invokestatic    #344 <Method long SystemClock.elapsedRealtime()>
	//   95  199:lstore_3        
			long l2 = lastFeedElapsedRealtimeMs;
	//   96  200:aload_0         
	//   97  201:getfield        #346 <Field long lastFeedElapsedRealtimeMs>
	//   98  204:lstore          11
			long l3 = audioTrack.getBufferSizeUs();
	//   99  206:aload_0         
	//  100  207:getfield        #72  <Field AudioTrack audioTrack>
	//  101  210:invokevirtual   #349 <Method long AudioTrack.getBufferSizeUs()>
	//  102  213:lstore          13
			l = -1L;
	//  103  215:ldc2w           #350 <Long -1L>
	//  104  218:lstore_1        
			if(l3 != -1L)
	//* 105  219:lload           13
	//* 106  221:ldc2w           #350 <Long -1L>
	//* 107  224:lcmp            
	//* 108  225:ifne            231
	//* 109  228:goto            238
				l = l3 / 1000L;
	//  110  231:lload           13
	//  111  233:ldc2w           #352 <Long 1000L>
	//  112  236:ldiv            
	//  113  237:lstore_1        
			notifyAudioTrackUnderrun(audioTrack.getBufferSize(), l, l1 - l2);
	//  114  238:aload_0         
	//  115  239:aload_0         
	//  116  240:getfield        #72  <Field AudioTrack audioTrack>
	//  117  243:invokevirtual   #356 <Method int AudioTrack.getBufferSize()>
	//  118  246:lload_1         
	//  119  247:lload_3         
	//  120  248:lload           11
	//  121  250:lsub            
	//  122  251:invokespecial   #358 <Method void notifyAudioTrackUnderrun(int, long, long)>
		}
		int j;
		try
		{
			j = audioTrack.handleBuffer(bytebuffer, bufferinfo.offset, bufferinfo.size, bufferinfo.presentationTimeUs);
	//  123  254:aload_0         
	//  124  255:getfield        #72  <Field AudioTrack audioTrack>
	//  125  258:aload           6
	//  126  260:aload           7
	//  127  262:getfield        #361 <Field int android.media.MediaCodec$BufferInfo.offset>
	//  128  265:aload           7
	//  129  267:getfield        #364 <Field int android.media.MediaCodec$BufferInfo.size>
	//  130  270:aload           7
	//  131  272:getfield        #367 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//  132  275:invokevirtual   #371 <Method int AudioTrack.handleBuffer(ByteBuffer, int, int, long)>
	//  133  278:istore          10
			lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
	//  134  280:aload_0         
	//  135  281:invokestatic    #344 <Method long SystemClock.elapsedRealtime()>
	//  136  284:putfield        #346 <Field long lastFeedElapsedRealtimeMs>
		}
	//* 137  287:iload           10
	//* 138  289:iconst_1        
	//* 139  290:iand            
	//* 140  291:ifeq            303
	//* 141  294:aload_0         
	//* 142  295:invokevirtual   #373 <Method void handleAudioTrackDiscontinuity()>
	//* 143  298:aload_0         
	//* 144  299:iconst_1        
	//* 145  300:putfield        #161 <Field boolean allowPositionDiscontinuity>
	//* 146  303:iload           10
	//* 147  305:iconst_2        
	//* 148  306:iand            
	//* 149  307:ifeq            338
	//* 150  310:aload           5
	//* 151  312:iload           8
	//* 152  314:iconst_0        
	//* 153  315:invokevirtual   #306 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
	//* 154  318:aload_0         
	//* 155  319:getfield        #310 <Field CodecCounters codecCounters>
	//* 156  322:astore          5
	//* 157  324:aload           5
	//* 158  326:aload           5
	//* 159  328:getfield        #376 <Field int CodecCounters.renderedOutputBufferCount>
	//* 160  331:iconst_1        
	//* 161  332:iadd            
	//* 162  333:putfield        #376 <Field int CodecCounters.renderedOutputBufferCount>
	//* 163  336:iconst_1        
	//* 164  337:ireturn         
	//* 165  338:iconst_0        
	//* 166  339:ireturn         
		// Misplaced declaration of an exception variable
		catch(MediaCodec mediacodec)
	//* 167  340:astore          5
		{
			notifyAudioTrackWriteError(((com.google.android.exoplayer.audio.AudioTrack.WriteException) (mediacodec)));
	//  168  342:aload_0         
	//  169  343:aload           5
	//  170  345:invokespecial   #378 <Method void notifyAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack$WriteException)>
			throw new ExoPlaybackException(((Throwable) (mediacodec)));
	//  171  348:new             #175 <Class ExoPlaybackException>
	//  172  351:dup             
	//  173  352:aload           5
	//  174  354:invokespecial   #339 <Method void ExoPlaybackException(Throwable)>
	//  175  357:athrow          
		}
		if((j & 1) != 0)
		{
			handleAudioTrackDiscontinuity();
			allowPositionDiscontinuity = true;
		}
		if((j & 2) != 0)
		{
			mediacodec.releaseOutputBuffer(i, false);
			mediacodec = ((MediaCodec) (codecCounters));
			mediacodec.renderedOutputBufferCount = ((CodecCounters) (mediacodec)).renderedOutputBufferCount + 1;
			return true;
		} else
		{
			return false;
		}
	}

	public static final int MSG_SET_PLAYBACK_PARAMS = 2;
	public static final int MSG_SET_STREAM_TYPE = 3;
	public static final int MSG_SET_VOLUME = 1;
	private boolean allowPositionDiscontinuity;
	private int audioSessionId;
	private final AudioTrack audioTrack;
	private boolean audioTrackHasData;
	private long currentPositionUs;
	private final EventListener eventListener;
	private long lastFeedElapsedRealtimeMs;
	private boolean passthroughEnabled;
	private MediaFormat passthroughMediaFormat;
	private int pcmEncoding;


/*
	static EventListener access$000(MediaCodecAudioTrackRenderer mediacodecaudiotrackrenderer)
	{
		return mediacodecaudiotrackrenderer.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MediaCodecAudioTrackRenderer$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
