// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.os.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.*;
import com.google.android.exoplayer2.drm.*;
import com.google.android.exoplayer2.util.*;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor, DefaultAudioSink, AudioSink, AudioDecoderException, 
//			AudioAttributes, AudioRendererEventListener, AudioCapabilities

public abstract class SimpleDecoderAudioRenderer extends BaseRenderer
	implements MediaClock
{
	private final class AudioSinkListener
		implements AudioSink.Listener
	{

		public void onAudioSessionId(int i)
		{
			eventDispatcher.audioSessionId(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		//    2    4:invokestatic    #28  <Method AudioRendererEventListener$EventDispatcher SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer)>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #33  <Method void AudioRendererEventListener$EventDispatcher.audioSessionId(int)>
			SimpleDecoderAudioRenderer.this.onAudioSessionId(i);
		//    5   11:aload_0         
		//    6   12:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #35  <Method void SimpleDecoderAudioRenderer.onAudioSessionId(int)>
		//    9   19:return          
		}

		public void onPositionDiscontinuity()
		{
			onAudioTrackPositionDiscontinuity();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		//    2    4:invokevirtual   #39  <Method void SimpleDecoderAudioRenderer.onAudioTrackPositionDiscontinuity()>
			allowPositionDiscontinuity = true;
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		//    5   11:iconst_1        
		//    6   12:invokestatic    #43  <Method boolean SimpleDecoderAudioRenderer.access$202(SimpleDecoderAudioRenderer, boolean)>
		//    7   15:pop             
		//    8   16:return          
		}

		public void onUnderrun(int i, long l, long l1)
		{
			eventDispatcher.audioTrackUnderrun(i, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		//    2    4:invokestatic    #28  <Method AudioRendererEventListener$EventDispatcher SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer)>
		//    3    7:iload_1         
		//    4    8:lload_2         
		//    5    9:lload           4
		//    6   11:invokevirtual   #48  <Method void AudioRendererEventListener$EventDispatcher.audioTrackUnderrun(int, long, long)>
			onAudioTrackUnderrun(i, l, l1);
		//    7   14:aload_0         
		//    8   15:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		//    9   18:iload_1         
		//   10   19:lload_2         
		//   11   20:lload           4
		//   12   22:invokevirtual   #51  <Method void SimpleDecoderAudioRenderer.onAudioTrackUnderrun(int, long, long)>
		//   13   25:return          
		}

		final SimpleDecoderAudioRenderer this$0;

		private AudioSinkListener()
		{
			this$0 = SimpleDecoderAudioRenderer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field SimpleDecoderAudioRenderer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public SimpleDecoderAudioRenderer()
	{
		this(((Handler) (null)), ((AudioRendererEventListener) (null)), new AudioProcessor[0]);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:anewarray       AudioProcessor[]
	//    5    7:invokespecial   #64  <Method void SimpleDecoderAudioRenderer(Handler, AudioRendererEventListener, AudioProcessor[])>
	//    6   10:return          
	}

	public SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audiorenderereventlistener, AudioCapabilities audiocapabilities)
	{
		this(handler, audiorenderereventlistener, audiocapabilities, ((DrmSessionManager) (null)), false, new AudioProcessor[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:iconst_0        
	//    7    7:anewarray       AudioProcessor[]
	//    8   10:invokespecial   #69  <Method void SimpleDecoderAudioRenderer(Handler, AudioRendererEventListener, AudioCapabilities, DrmSessionManager, boolean, AudioProcessor[])>
	//    9   13:return          
	}

	public transient SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audiorenderereventlistener, AudioCapabilities audiocapabilities, DrmSessionManager drmsessionmanager, boolean flag, AudioProcessor aaudioprocessor[])
	{
		this(handler, audiorenderereventlistener, drmsessionmanager, flag, ((AudioSink) (new DefaultAudioSink(audiocapabilities, aaudioprocessor))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:new             #71  <Class DefaultAudioSink>
	//    6   10:dup             
	//    7   11:aload_3         
	//    8   12:aload           6
	//    9   14:invokespecial   #74  <Method void DefaultAudioSink(AudioCapabilities, AudioProcessor[])>
	//   10   17:invokespecial   #77  <Method void SimpleDecoderAudioRenderer(Handler, AudioRendererEventListener, DrmSessionManager, boolean, AudioSink)>
	//   11   20:return          
	}

	public SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audiorenderereventlistener, DrmSessionManager drmsessionmanager, boolean flag, AudioSink audiosink)
	{
		super(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #82  <Method void BaseRenderer(int)>
		drmSessionManager = drmsessionmanager;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #84  <Field DrmSessionManager drmSessionManager>
		playClearSamplesWithoutKeys = flag;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #86  <Field boolean playClearSamplesWithoutKeys>
		eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audiorenderereventlistener);
	//    9   16:aload_0         
	//   10   17:new             #88  <Class AudioRendererEventListener$EventDispatcher>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:invokespecial   #91  <Method void AudioRendererEventListener$EventDispatcher(Handler, AudioRendererEventListener)>
	//   15   26:putfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
		audioSink = audiosink;
	//   16   29:aload_0         
	//   17   30:aload           5
	//   18   32:putfield        #95  <Field AudioSink audioSink>
		audiosink.setListener(((AudioSink.Listener) (new AudioSinkListener())));
	//   19   35:aload           5
	//   20   37:new             #10  <Class SimpleDecoderAudioRenderer$AudioSinkListener>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aconst_null     
	//   24   43:invokespecial   #98  <Method void SimpleDecoderAudioRenderer$AudioSinkListener(SimpleDecoderAudioRenderer, SimpleDecoderAudioRenderer$1)>
	//   25   46:invokeinterface #104 <Method void AudioSink.setListener(AudioSink$Listener)>
		formatHolder = new FormatHolder();
	//   26   51:aload_0         
	//   27   52:new             #106 <Class FormatHolder>
	//   28   55:dup             
	//   29   56:invokespecial   #108 <Method void FormatHolder()>
	//   30   59:putfield        #110 <Field FormatHolder formatHolder>
		flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
	//   31   62:aload_0         
	//   32   63:invokestatic    #116 <Method DecoderInputBuffer DecoderInputBuffer.newFlagsOnlyInstance()>
	//   33   66:putfield        #118 <Field DecoderInputBuffer flagsOnlyBuffer>
		decoderReinitializationState = 0;
	//   34   69:aload_0         
	//   35   70:iconst_0        
	//   36   71:putfield        #120 <Field int decoderReinitializationState>
		audioTrackNeedsConfigure = true;
	//   37   74:aload_0         
	//   38   75:iconst_1        
	//   39   76:putfield        #122 <Field boolean audioTrackNeedsConfigure>
	//   40   79:return          
	}

	public transient SimpleDecoderAudioRenderer(Handler handler, AudioRendererEventListener audiorenderereventlistener, AudioProcessor aaudioprocessor[])
	{
		this(handler, audiorenderereventlistener, ((AudioCapabilities) (null)), ((DrmSessionManager) (null)), false, aaudioprocessor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aload_3         
	//    7    7:invokespecial   #69  <Method void SimpleDecoderAudioRenderer(Handler, AudioRendererEventListener, AudioCapabilities, DrmSessionManager, boolean, AudioProcessor[])>
	//    8   10:return          
	}

	private boolean drainOutputBuffer()
		throws ExoPlaybackException, AudioDecoderException, AudioSink.ConfigurationException, AudioSink.InitializationException, AudioSink.WriteException
	{
		if(outputBuffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//*   2    4:ifnonnull       51
		{
			outputBuffer = (SimpleOutputBuffer)decoder.dequeueOutputBuffer();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #145 <Field SimpleDecoder decoder>
	//    6   12:invokevirtual   #151 <Method com.google.android.exoplayer2.decoder.OutputBuffer SimpleDecoder.dequeueOutputBuffer()>
	//    7   15:checkcast       #153 <Class SimpleOutputBuffer>
	//    8   18:putfield        #143 <Field SimpleOutputBuffer outputBuffer>
			if(outputBuffer == null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//*  11   25:ifnonnull       30
				return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
			DecoderCounters decodercounters = decoderCounters;
	//   14   30:aload_0         
	//   15   31:getfield        #155 <Field DecoderCounters decoderCounters>
	//   16   34:astore_1        
			decodercounters.skippedOutputBufferCount = decodercounters.skippedOutputBufferCount + outputBuffer.skippedOutputBufferCount;
	//   17   35:aload_1         
	//   18   36:aload_1         
	//   19   37:getfield        #160 <Field int DecoderCounters.skippedOutputBufferCount>
	//   20   40:aload_0         
	//   21   41:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//   22   44:getfield        #161 <Field int SimpleOutputBuffer.skippedOutputBufferCount>
	//   23   47:iadd            
	//   24   48:putfield        #160 <Field int DecoderCounters.skippedOutputBufferCount>
		}
		if(outputBuffer.isEndOfStream())
	//*  25   51:aload_0         
	//*  26   52:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//*  27   55:invokevirtual   #164 <Method boolean SimpleOutputBuffer.isEndOfStream()>
	//*  28   58:ifeq            102
			if(decoderReinitializationState == 2)
	//*  29   61:aload_0         
	//*  30   62:getfield        #120 <Field int decoderReinitializationState>
	//*  31   65:iconst_2        
	//*  32   66:icmpne          84
			{
				releaseDecoder();
	//   33   69:aload_0         
	//   34   70:invokespecial   #167 <Method void releaseDecoder()>
				maybeInitDecoder();
	//   35   73:aload_0         
	//   36   74:invokespecial   #170 <Method void maybeInitDecoder()>
				audioTrackNeedsConfigure = true;
	//   37   77:aload_0         
	//   38   78:iconst_1        
	//   39   79:putfield        #122 <Field boolean audioTrackNeedsConfigure>
				return false;
	//   40   82:iconst_0        
	//   41   83:ireturn         
			} else
			{
				outputBuffer.release();
	//   42   84:aload_0         
	//   43   85:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//   44   88:invokevirtual   #173 <Method void SimpleOutputBuffer.release()>
				outputBuffer = null;
	//   45   91:aload_0         
	//   46   92:aconst_null     
	//   47   93:putfield        #143 <Field SimpleOutputBuffer outputBuffer>
				processEndOfStream();
	//   48   96:aload_0         
	//   49   97:invokespecial   #176 <Method void processEndOfStream()>
				return false;
	//   50  100:iconst_0        
	//   51  101:ireturn         
			}
		if(audioTrackNeedsConfigure)
	//*  52  102:aload_0         
	//*  53  103:getfield        #122 <Field boolean audioTrackNeedsConfigure>
	//*  54  106:ifeq            150
		{
			Format format = getOutputFormat();
	//   55  109:aload_0         
	//   56  110:invokevirtual   #180 <Method Format getOutputFormat()>
	//   57  113:astore_1        
			audioSink.configure(format.pcmEncoding, format.channelCount, format.sampleRate, 0, ((int []) (null)), encoderDelay, encoderPadding);
	//   58  114:aload_0         
	//   59  115:getfield        #95  <Field AudioSink audioSink>
	//   60  118:aload_1         
	//   61  119:getfield        #185 <Field int Format.pcmEncoding>
	//   62  122:aload_1         
	//   63  123:getfield        #188 <Field int Format.channelCount>
	//   64  126:aload_1         
	//   65  127:getfield        #191 <Field int Format.sampleRate>
	//   66  130:iconst_0        
	//   67  131:aconst_null     
	//   68  132:aload_0         
	//   69  133:getfield        #193 <Field int encoderDelay>
	//   70  136:aload_0         
	//   71  137:getfield        #195 <Field int encoderPadding>
	//   72  140:invokeinterface #199 <Method void AudioSink.configure(int, int, int, int, int[], int, int)>
			audioTrackNeedsConfigure = false;
	//   73  145:aload_0         
	//   74  146:iconst_0        
	//   75  147:putfield        #122 <Field boolean audioTrackNeedsConfigure>
		}
		if(audioSink.handleBuffer(outputBuffer.data, outputBuffer.timeUs))
	//*  76  150:aload_0         
	//*  77  151:getfield        #95  <Field AudioSink audioSink>
	//*  78  154:aload_0         
	//*  79  155:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//*  80  158:getfield        #203 <Field java.nio.ByteBuffer SimpleOutputBuffer.data>
	//*  81  161:aload_0         
	//*  82  162:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//*  83  165:getfield        #206 <Field long SimpleOutputBuffer.timeUs>
	//*  84  168:invokeinterface #210 <Method boolean AudioSink.handleBuffer(java.nio.ByteBuffer, long)>
	//*  85  173:ifeq            205
		{
			DecoderCounters decodercounters1 = decoderCounters;
	//   86  176:aload_0         
	//   87  177:getfield        #155 <Field DecoderCounters decoderCounters>
	//   88  180:astore_1        
			decodercounters1.renderedOutputBufferCount = decodercounters1.renderedOutputBufferCount + 1;
	//   89  181:aload_1         
	//   90  182:aload_1         
	//   91  183:getfield        #213 <Field int DecoderCounters.renderedOutputBufferCount>
	//   92  186:iconst_1        
	//   93  187:iadd            
	//   94  188:putfield        #213 <Field int DecoderCounters.renderedOutputBufferCount>
			outputBuffer.release();
	//   95  191:aload_0         
	//   96  192:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//   97  195:invokevirtual   #173 <Method void SimpleOutputBuffer.release()>
			outputBuffer = null;
	//   98  198:aload_0         
	//   99  199:aconst_null     
	//  100  200:putfield        #143 <Field SimpleOutputBuffer outputBuffer>
			return true;
	//  101  203:iconst_1        
	//  102  204:ireturn         
		} else
		{
			return false;
	//  103  205:iconst_0        
	//  104  206:ireturn         
		}
	}

	private boolean feedInputBuffer()
		throws AudioDecoderException, ExoPlaybackException
	{
		if(decoder != null && decoderReinitializationState != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field SimpleDecoder decoder>
	//*   2    4:ifnull          254
	//*   3    7:aload_0         
	//*   4    8:getfield        #120 <Field int decoderReinitializationState>
	//*   5   11:iconst_2        
	//*   6   12:icmpeq          254
		{
			if(inputStreamEnded)
	//*   7   15:aload_0         
	//*   8   16:getfield        #217 <Field boolean inputStreamEnded>
	//*   9   19:ifeq            24
				return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
			if(inputBuffer == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//*  14   28:ifnonnull       51
			{
				inputBuffer = decoder.dequeueInputBuffer();
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #145 <Field SimpleDecoder decoder>
	//   18   36:invokevirtual   #222 <Method DecoderInputBuffer SimpleDecoder.dequeueInputBuffer()>
	//   19   39:putfield        #219 <Field DecoderInputBuffer inputBuffer>
				if(inputBuffer == null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//*  22   46:ifnonnull       51
					return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
			}
			if(decoderReinitializationState == 1)
	//*  25   51:aload_0         
	//*  26   52:getfield        #120 <Field int decoderReinitializationState>
	//*  27   55:iconst_1        
	//*  28   56:icmpne          90
			{
				inputBuffer.setFlags(4);
	//   29   59:aload_0         
	//   30   60:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//   31   63:iconst_4        
	//   32   64:invokevirtual   #225 <Method void DecoderInputBuffer.setFlags(int)>
				decoder.queueInputBuffer(inputBuffer);
	//   33   67:aload_0         
	//   34   68:getfield        #145 <Field SimpleDecoder decoder>
	//   35   71:aload_0         
	//   36   72:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//   37   75:invokevirtual   #229 <Method void SimpleDecoder.queueInputBuffer(DecoderInputBuffer)>
				inputBuffer = null;
	//   38   78:aload_0         
	//   39   79:aconst_null     
	//   40   80:putfield        #219 <Field DecoderInputBuffer inputBuffer>
				decoderReinitializationState = 2;
	//   41   83:aload_0         
	//   42   84:iconst_2        
	//   43   85:putfield        #120 <Field int decoderReinitializationState>
				return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
			}
			int i;
			if(waitingForKeys)
	//*  46   90:aload_0         
	//*  47   91:getfield        #231 <Field boolean waitingForKeys>
	//*  48   94:ifeq            103
				i = -4;
	//   49   97:bipush          -4
	//   50   99:istore_1        
			else
	//*  51  100:goto            117
				i = readSource(formatHolder, inputBuffer, false);
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #110 <Field FormatHolder formatHolder>
	//   55  108:aload_0         
	//   56  109:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//   57  112:iconst_0        
	//   58  113:invokevirtual   #235 <Method int readSource(FormatHolder, DecoderInputBuffer, boolean)>
	//   59  116:istore_1        
			if(i == -3)
	//*  60  117:iload_1         
	//*  61  118:bipush          -3
	//*  62  120:icmpne          125
				return false;
	//   63  123:iconst_0        
	//   64  124:ireturn         
			if(i == -5)
	//*  65  125:iload_1         
	//*  66  126:bipush          -5
	//*  67  128:icmpne          144
			{
				onInputFormatChanged(formatHolder.format);
	//   68  131:aload_0         
	//   69  132:aload_0         
	//   70  133:getfield        #110 <Field FormatHolder formatHolder>
	//   71  136:getfield        #238 <Field Format FormatHolder.format>
	//   72  139:invokespecial   #242 <Method void onInputFormatChanged(Format)>
				return true;
	//   73  142:iconst_1        
	//   74  143:ireturn         
			}
			if(inputBuffer.isEndOfStream())
	//*  75  144:aload_0         
	//*  76  145:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//*  77  148:invokevirtual   #243 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//*  78  151:ifeq            177
			{
				inputStreamEnded = true;
	//   79  154:aload_0         
	//   80  155:iconst_1        
	//   81  156:putfield        #217 <Field boolean inputStreamEnded>
				decoder.queueInputBuffer(inputBuffer);
	//   82  159:aload_0         
	//   83  160:getfield        #145 <Field SimpleDecoder decoder>
	//   84  163:aload_0         
	//   85  164:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//   86  167:invokevirtual   #229 <Method void SimpleDecoder.queueInputBuffer(DecoderInputBuffer)>
				inputBuffer = null;
	//   87  170:aload_0         
	//   88  171:aconst_null     
	//   89  172:putfield        #219 <Field DecoderInputBuffer inputBuffer>
				return false;
	//   90  175:iconst_0        
	//   91  176:ireturn         
			}
			waitingForKeys = shouldWaitForKeys(inputBuffer.isEncrypted());
	//   92  177:aload_0         
	//   93  178:aload_0         
	//   94  179:aload_0         
	//   95  180:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//   96  183:invokevirtual   #246 <Method boolean DecoderInputBuffer.isEncrypted()>
	//   97  186:invokespecial   #250 <Method boolean shouldWaitForKeys(boolean)>
	//   98  189:putfield        #231 <Field boolean waitingForKeys>
			if(waitingForKeys)
	//*  99  192:aload_0         
	//* 100  193:getfield        #231 <Field boolean waitingForKeys>
	//* 101  196:ifeq            201
			{
				return false;
	//  102  199:iconst_0        
	//  103  200:ireturn         
			} else
			{
				inputBuffer.flip();
	//  104  201:aload_0         
	//  105  202:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//  106  205:invokevirtual   #253 <Method void DecoderInputBuffer.flip()>
				onQueueInputBuffer(inputBuffer);
	//  107  208:aload_0         
	//  108  209:aload_0         
	//  109  210:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//  110  213:invokespecial   #256 <Method void onQueueInputBuffer(DecoderInputBuffer)>
				decoder.queueInputBuffer(inputBuffer);
	//  111  216:aload_0         
	//  112  217:getfield        #145 <Field SimpleDecoder decoder>
	//  113  220:aload_0         
	//  114  221:getfield        #219 <Field DecoderInputBuffer inputBuffer>
	//  115  224:invokevirtual   #229 <Method void SimpleDecoder.queueInputBuffer(DecoderInputBuffer)>
				decoderReceivedBuffers = true;
	//  116  227:aload_0         
	//  117  228:iconst_1        
	//  118  229:putfield        #258 <Field boolean decoderReceivedBuffers>
				DecoderCounters decodercounters = decoderCounters;
	//  119  232:aload_0         
	//  120  233:getfield        #155 <Field DecoderCounters decoderCounters>
	//  121  236:astore_2        
				decodercounters.inputBufferCount = decodercounters.inputBufferCount + 1;
	//  122  237:aload_2         
	//  123  238:aload_2         
	//  124  239:getfield        #261 <Field int DecoderCounters.inputBufferCount>
	//  125  242:iconst_1        
	//  126  243:iadd            
	//  127  244:putfield        #261 <Field int DecoderCounters.inputBufferCount>
				inputBuffer = null;
	//  128  247:aload_0         
	//  129  248:aconst_null     
	//  130  249:putfield        #219 <Field DecoderInputBuffer inputBuffer>
				return true;
	//  131  252:iconst_1        
	//  132  253:ireturn         
			}
		} else
		{
			return false;
	//  133  254:iconst_0        
	//  134  255:ireturn         
		}
	}

	private void flushDecoder()
		throws ExoPlaybackException
	{
		waitingForKeys = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #231 <Field boolean waitingForKeys>
		if(decoderReinitializationState != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #120 <Field int decoderReinitializationState>
	//*   5    9:ifeq            21
		{
			releaseDecoder();
	//    6   12:aload_0         
	//    7   13:invokespecial   #167 <Method void releaseDecoder()>
			maybeInitDecoder();
	//    8   16:aload_0         
	//    9   17:invokespecial   #170 <Method void maybeInitDecoder()>
			return;
	//   10   20:return          
		}
		inputBuffer = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #219 <Field DecoderInputBuffer inputBuffer>
		if(outputBuffer != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//*  16   30:ifnull          45
		{
			outputBuffer.release();
	//   17   33:aload_0         
	//   18   34:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//   19   37:invokevirtual   #173 <Method void SimpleOutputBuffer.release()>
			outputBuffer = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #143 <Field SimpleOutputBuffer outputBuffer>
		}
		decoder.flush();
	//   23   45:aload_0         
	//   24   46:getfield        #145 <Field SimpleDecoder decoder>
	//   25   49:invokevirtual   #265 <Method void SimpleDecoder.flush()>
		decoderReceivedBuffers = false;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #258 <Field boolean decoderReceivedBuffers>
	//   29   57:return          
	}

	private void maybeInitDecoder()
		throws ExoPlaybackException
	{
		if(decoder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field SimpleDecoder decoder>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		drmSession = pendingDrmSession;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #267 <Field DrmSession pendingDrmSession>
	//    7   13:putfield        #269 <Field DrmSession drmSession>
		Object obj = null;
	//    8   16:aconst_null     
	//    9   17:astore          5
		if(drmSession != null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #269 <Field DrmSession drmSession>
	//*  12   23:ifnull          66
		{
			ExoMediaCrypto exomediacrypto = drmSession.getMediaCrypto();
	//   13   26:aload_0         
	//   14   27:getfield        #269 <Field DrmSession drmSession>
	//   15   30:invokeinterface #275 <Method ExoMediaCrypto DrmSession.getMediaCrypto()>
	//   16   35:astore          6
			obj = ((Object) (exomediacrypto));
	//   17   37:aload           6
	//   18   39:astore          5
			if(exomediacrypto == null)
	//*  19   41:aload           6
	//*  20   43:ifnonnull       66
				if(drmSession.getError() != null)
	//*  21   46:aload_0         
	//*  22   47:getfield        #269 <Field DrmSession drmSession>
	//*  23   50:invokeinterface #279 <Method com.google.android.exoplayer2.drm.DrmSession$DrmSessionException DrmSession.getError()>
	//*  24   55:ifnull          65
					obj = ((Object) (exomediacrypto));
	//   25   58:aload           6
	//   26   60:astore          5
				else
	//*  27   62:goto            66
					return;
	//   28   65:return          
		}
		try
		{
			long l = SystemClock.elapsedRealtime();
	//   29   66:invokestatic    #285 <Method long SystemClock.elapsedRealtime()>
	//   30   69:lstore_1        
			TraceUtil.beginSection("createAudioDecoder");
	//   31   70:ldc2            #287 <String "createAudioDecoder">
	//   32   73:invokestatic    #293 <Method void TraceUtil.beginSection(String)>
			decoder = createDecoder(inputFormat, ((ExoMediaCrypto) (obj)));
	//   33   76:aload_0         
	//   34   77:aload_0         
	//   35   78:aload_0         
	//   36   79:getfield        #295 <Field Format inputFormat>
	//   37   82:aload           5
	//   38   84:invokevirtual   #299 <Method SimpleDecoder createDecoder(Format, ExoMediaCrypto)>
	//   39   87:putfield        #145 <Field SimpleDecoder decoder>
			TraceUtil.endSection();
	//   40   90:invokestatic    #302 <Method void TraceUtil.endSection()>
			long l1 = SystemClock.elapsedRealtime();
	//   41   93:invokestatic    #285 <Method long SystemClock.elapsedRealtime()>
	//   42   96:lstore_3        
			eventDispatcher.decoderInitialized(decoder.getName(), l1, l1 - l);
	//   43   97:aload_0         
	//   44   98:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   45  101:aload_0         
	//   46  102:getfield        #145 <Field SimpleDecoder decoder>
	//   47  105:invokevirtual   #306 <Method String SimpleDecoder.getName()>
	//   48  108:lload_3         
	//   49  109:lload_3         
	//   50  110:lload_1         
	//   51  111:lsub            
	//   52  112:invokevirtual   #310 <Method void AudioRendererEventListener$EventDispatcher.decoderInitialized(String, long, long)>
			obj = ((Object) (decoderCounters));
	//   53  115:aload_0         
	//   54  116:getfield        #155 <Field DecoderCounters decoderCounters>
	//   55  119:astore          5
			obj.decoderInitCount = ((DecoderCounters) (obj)).decoderInitCount + 1;
	//   56  121:aload           5
	//   57  123:aload           5
	//   58  125:getfield        #313 <Field int DecoderCounters.decoderInitCount>
	//   59  128:iconst_1        
	//   60  129:iadd            
	//   61  130:putfield        #313 <Field int DecoderCounters.decoderInitCount>
			return;
	//   62  133:return          
		}
		catch(AudioDecoderException audiodecoderexception)
	//*  63  134:astore          5
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (audiodecoderexception)), getIndex());
	//   64  136:aload           5
	//   65  138:aload_0         
	//   66  139:invokevirtual   #317 <Method int getIndex()>
	//   67  142:invokestatic    #321 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   68  145:athrow          
		}
	}

	private void onInputFormatChanged(Format format)
		throws ExoPlaybackException
	{
		Object obj = ((Object) (inputFormat));
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field Format inputFormat>
	//    2    4:astore_2        
		inputFormat = format;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #295 <Field Format inputFormat>
		com.google.android.exoplayer2.drm.DrmInitData drminitdata = inputFormat.drmInitData;
	//    6   10:aload_0         
	//    7   11:getfield        #295 <Field Format inputFormat>
	//    8   14:getfield        #325 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//    9   17:astore_3        
		if(obj == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       27
			obj = null;
	//   12   22:aconst_null     
	//   13   23:astore_2        
		else
	//*  14   24:goto            32
			obj = ((Object) (((Format) (obj)).drmInitData));
	//   15   27:aload_2         
	//   16   28:getfield        #325 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//   17   31:astore_2        
		if(Util.areEqual(((Object) (drminitdata)), obj) ^ true)
	//*  18   32:aload_3         
	//*  19   33:aload_2         
	//*  20   34:invokestatic    #331 <Method boolean Util.areEqual(Object, Object)>
	//*  21   37:iconst_1        
	//*  22   38:ixor            
	//*  23   39:ifeq            132
			if(inputFormat.drmInitData != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #295 <Field Format inputFormat>
	//*  26   46:getfield        #325 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//*  27   49:ifnull          127
			{
				if(drmSessionManager == null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//*  30   56:ifnonnull       77
					throw ExoPlaybackException.createForRenderer(((Exception) (new IllegalStateException("Media requires a DrmSessionManager"))), getIndex());
	//   31   59:new             #333 <Class IllegalStateException>
	//   32   62:dup             
	//   33   63:ldc2            #335 <String "Media requires a DrmSessionManager">
	//   34   66:invokespecial   #337 <Method void IllegalStateException(String)>
	//   35   69:aload_0         
	//   36   70:invokevirtual   #317 <Method int getIndex()>
	//   37   73:invokestatic    #321 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   38   76:athrow          
				pendingDrmSession = drmSessionManager.acquireSession(Looper.myLooper(), inputFormat.drmInitData);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//   42   82:invokestatic    #343 <Method Looper Looper.myLooper()>
	//   43   85:aload_0         
	//   44   86:getfield        #295 <Field Format inputFormat>
	//   45   89:getfield        #325 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//   46   92:invokeinterface #349 <Method DrmSession DrmSessionManager.acquireSession(Looper, com.google.android.exoplayer2.drm.DrmInitData)>
	//   47   97:putfield        #267 <Field DrmSession pendingDrmSession>
				if(pendingDrmSession == drmSession)
	//*  48  100:aload_0         
	//*  49  101:getfield        #267 <Field DrmSession pendingDrmSession>
	//*  50  104:aload_0         
	//*  51  105:getfield        #269 <Field DrmSession drmSession>
	//*  52  108:if_acmpne       132
					drmSessionManager.releaseSession(pendingDrmSession);
	//   53  111:aload_0         
	//   54  112:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//   55  115:aload_0         
	//   56  116:getfield        #267 <Field DrmSession pendingDrmSession>
	//   57  119:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
			} else
	//*  58  124:goto            132
			{
				pendingDrmSession = null;
	//   59  127:aload_0         
	//   60  128:aconst_null     
	//   61  129:putfield        #267 <Field DrmSession pendingDrmSession>
			}
		if(decoderReceivedBuffers)
	//*  62  132:aload_0         
	//*  63  133:getfield        #258 <Field boolean decoderReceivedBuffers>
	//*  64  136:ifeq            147
		{
			decoderReinitializationState = 1;
	//   65  139:aload_0         
	//   66  140:iconst_1        
	//   67  141:putfield        #120 <Field int decoderReinitializationState>
		} else
	//*  68  144:goto            160
		{
			releaseDecoder();
	//   69  147:aload_0         
	//   70  148:invokespecial   #167 <Method void releaseDecoder()>
			maybeInitDecoder();
	//   71  151:aload_0         
	//   72  152:invokespecial   #170 <Method void maybeInitDecoder()>
			audioTrackNeedsConfigure = true;
	//   73  155:aload_0         
	//   74  156:iconst_1        
	//   75  157:putfield        #122 <Field boolean audioTrackNeedsConfigure>
		}
		encoderDelay = format.encoderDelay;
	//   76  160:aload_0         
	//   77  161:aload_1         
	//   78  162:getfield        #354 <Field int Format.encoderDelay>
	//   79  165:putfield        #193 <Field int encoderDelay>
		encoderPadding = format.encoderPadding;
	//   80  168:aload_0         
	//   81  169:aload_1         
	//   82  170:getfield        #355 <Field int Format.encoderPadding>
	//   83  173:putfield        #195 <Field int encoderPadding>
		eventDispatcher.inputFormatChanged(format);
	//   84  176:aload_0         
	//   85  177:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   86  180:aload_1         
	//   87  181:invokevirtual   #358 <Method void AudioRendererEventListener$EventDispatcher.inputFormatChanged(Format)>
	//   88  184:return          
	}

	private void onQueueInputBuffer(DecoderInputBuffer decoderinputbuffer)
	{
		if(allowFirstBufferPositionDiscontinuity && !decoderinputbuffer.isDecodeOnly())
	//*   0    0:aload_0         
	//*   1    1:getfield        #360 <Field boolean allowFirstBufferPositionDiscontinuity>
	//*   2    4:ifeq            46
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #363 <Method boolean DecoderInputBuffer.isDecodeOnly()>
	//*   5   11:ifne            46
		{
			if(Math.abs(decoderinputbuffer.timeUs - currentPositionUs) > 0x7a120L)
	//*   6   14:aload_1         
	//*   7   15:getfield        #364 <Field long DecoderInputBuffer.timeUs>
	//*   8   18:aload_0         
	//*   9   19:getfield        #366 <Field long currentPositionUs>
	//*  10   22:lsub            
	//*  11   23:invokestatic    #372 <Method long Math.abs(long)>
	//*  12   26:ldc2w           #373 <Long 0x7a120L>
	//*  13   29:lcmp            
	//*  14   30:ifle            41
				currentPositionUs = decoderinputbuffer.timeUs;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getfield        #364 <Field long DecoderInputBuffer.timeUs>
	//   18   38:putfield        #366 <Field long currentPositionUs>
			allowFirstBufferPositionDiscontinuity = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #360 <Field boolean allowFirstBufferPositionDiscontinuity>
		}
	//   22   46:return          
	}

	private void processEndOfStream()
		throws ExoPlaybackException
	{
		outputStreamEnded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #376 <Field boolean outputStreamEnded>
		try
		{
			audioSink.playToEndOfStream();
	//    3    5:aload_0         
	//    4    6:getfield        #95  <Field AudioSink audioSink>
	//    5    9:invokeinterface #379 <Method void AudioSink.playToEndOfStream()>
			return;
	//    6   14:return          
		}
		catch(AudioSink.WriteException writeexception)
	//*   7   15:astore_1        
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (writeexception)), getIndex());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #317 <Method int getIndex()>
	//   11   21:invokestatic    #321 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   12   24:athrow          
		}
	}

	private void releaseDecoder()
	{
		if(decoder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field SimpleDecoder decoder>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			inputBuffer = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #219 <Field DecoderInputBuffer inputBuffer>
			outputBuffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #143 <Field SimpleOutputBuffer outputBuffer>
			decoder.release();
	//   10   18:aload_0         
	//   11   19:getfield        #145 <Field SimpleDecoder decoder>
	//   12   22:invokevirtual   #380 <Method void SimpleDecoder.release()>
			decoder = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #145 <Field SimpleDecoder decoder>
			DecoderCounters decodercounters = decoderCounters;
	//   16   30:aload_0         
	//   17   31:getfield        #155 <Field DecoderCounters decoderCounters>
	//   18   34:astore_1        
			decodercounters.decoderReleaseCount = decodercounters.decoderReleaseCount + 1;
	//   19   35:aload_1         
	//   20   36:aload_1         
	//   21   37:getfield        #383 <Field int DecoderCounters.decoderReleaseCount>
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #383 <Field int DecoderCounters.decoderReleaseCount>
			decoderReinitializationState = 0;
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:putfield        #120 <Field int decoderReinitializationState>
			decoderReceivedBuffers = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #258 <Field boolean decoderReceivedBuffers>
			return;
	//   31   55:return          
		}
	}

	private boolean shouldWaitForKeys(boolean flag)
		throws ExoPlaybackException
	{
		if(drmSession != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #269 <Field DrmSession drmSession>
	//*   2    4:ifnull          61
		{
			if(!flag && playClearSamplesWithoutKeys)
	//*   3    7:iload_1         
	//*   4    8:ifne            20
	//*   5   11:aload_0         
	//*   6   12:getfield        #86  <Field boolean playClearSamplesWithoutKeys>
	//*   7   15:ifeq            20
				return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
			int i = drmSession.getState();
	//   10   20:aload_0         
	//   11   21:getfield        #269 <Field DrmSession drmSession>
	//   12   24:invokeinterface #386 <Method int DrmSession.getState()>
	//   13   29:istore_2        
			if(i == 1)
	//*  14   30:iload_2         
	//*  15   31:iconst_1        
	//*  16   32:icmpne          52
				throw ExoPlaybackException.createForRenderer(((Exception) (drmSession.getError())), getIndex());
	//   17   35:aload_0         
	//   18   36:getfield        #269 <Field DrmSession drmSession>
	//   19   39:invokeinterface #279 <Method com.google.android.exoplayer2.drm.DrmSession$DrmSessionException DrmSession.getError()>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #317 <Method int getIndex()>
	//   22   48:invokestatic    #321 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   23   51:athrow          
			return i != 4;
	//   24   52:iload_2         
	//   25   53:iconst_4        
	//   26   54:icmpeq          59
	//   27   57:iconst_1        
	//   28   58:ireturn         
	//   29   59:iconst_0        
	//   30   60:ireturn         
		} else
		{
			return false;
	//   31   61:iconst_0        
	//   32   62:ireturn         
		}
	}

	private void updateCurrentPosition()
	{
		long l = audioSink.getCurrentPositionUs(isEnded());
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #390 <Method boolean isEnded()>
	//    4    8:invokeinterface #394 <Method long AudioSink.getCurrentPositionUs(boolean)>
	//    5   13:lstore_1        
		if(l != 0x0L)
	//*   6   14:lload_1         
	//*   7   15:ldc2w           #395 <Long 0x0L>
	//*   8   18:lcmp            
	//*   9   19:ifeq            51
		{
			if(!allowPositionDiscontinuity)
	//*  10   22:aload_0         
	//*  11   23:getfield        #129 <Field boolean allowPositionDiscontinuity>
	//*  12   26:ifeq            32
	//*  13   29:goto            41
				l = Math.max(currentPositionUs, l);
	//   14   32:aload_0         
	//   15   33:getfield        #366 <Field long currentPositionUs>
	//   16   36:lload_1         
	//   17   37:invokestatic    #400 <Method long Math.max(long, long)>
	//   18   40:lstore_1        
			currentPositionUs = l;
	//   19   41:aload_0         
	//   20   42:lload_1         
	//   21   43:putfield        #366 <Field long currentPositionUs>
			allowPositionDiscontinuity = false;
	//   22   46:aload_0         
	//   23   47:iconst_0        
	//   24   48:putfield        #129 <Field boolean allowPositionDiscontinuity>
		}
	//   25   51:return          
	}

	protected abstract SimpleDecoder createDecoder(Format format, ExoMediaCrypto exomediacrypto)
		throws AudioDecoderException;

	public MediaClock getMediaClock()
	{
		return ((MediaClock) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected Format getOutputFormat()
	{
		return Format.createAudioSampleFormat(((String) (null)), "audio/raw", ((String) (null)), -1, -1, inputFormat.channelCount, inputFormat.sampleRate, 2, ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)));
	//    0    0:aconst_null     
	//    1    1:ldc2            #404 <String "audio/raw">
	//    2    4:aconst_null     
	//    3    5:iconst_m1       
	//    4    6:iconst_m1       
	//    5    7:aload_0         
	//    6    8:getfield        #295 <Field Format inputFormat>
	//    7   11:getfield        #188 <Field int Format.channelCount>
	//    8   14:aload_0         
	//    9   15:getfield        #295 <Field Format inputFormat>
	//   10   18:getfield        #191 <Field int Format.sampleRate>
	//   11   21:iconst_2        
	//   12   22:aconst_null     
	//   13   23:aconst_null     
	//   14   24:iconst_0        
	//   15   25:aconst_null     
	//   16   26:invokestatic    #408 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   17   29:areturn         
	}

	public PlaybackParameters getPlaybackParameters()
	{
		return audioSink.getPlaybackParameters();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:invokeinterface #412 <Method PlaybackParameters AudioSink.getPlaybackParameters()>
	//    3    9:areturn         
	}

	public long getPositionUs()
	{
		if(getState() == 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #414 <Method int getState()>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          12
			updateCurrentPosition();
	//    4    8:aload_0         
	//    5    9:invokespecial   #416 <Method void updateCurrentPosition()>
		return currentPositionUs;
	//    6   12:aload_0         
	//    7   13:getfield        #366 <Field long currentPositionUs>
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
	//    5   27:invokespecial   #420 <Method void BaseRenderer.handleMessage(int, Object)>
			return;
	//    6   30:return          

		case 3: // '\003'
			obj = ((Object) ((AudioAttributes)obj));
	//    7   31:aload_2         
	//    8   32:checkcast       #422 <Class AudioAttributes>
	//    9   35:astore_2        
			audioSink.setAudioAttributes(((AudioAttributes) (obj)));
	//   10   36:aload_0         
	//   11   37:getfield        #95  <Field AudioSink audioSink>
	//   12   40:aload_2         
	//   13   41:invokeinterface #426 <Method void AudioSink.setAudioAttributes(AudioAttributes)>
			return;
	//   14   46:return          

		case 2: // '\002'
			audioSink.setVolume(((Float)obj).floatValue());
	//   15   47:aload_0         
	//   16   48:getfield        #95  <Field AudioSink audioSink>
	//   17   51:aload_2         
	//   18   52:checkcast       #428 <Class Float>
	//   19   55:invokevirtual   #432 <Method float Float.floatValue()>
	//   20   58:invokeinterface #436 <Method void AudioSink.setVolume(float)>
			return;
	//   21   63:return          
		}
	}

	public boolean isEnded()
	{
		return outputStreamEnded && audioSink.isEnded();
	//    0    0:aload_0         
	//    1    1:getfield        #376 <Field boolean outputStreamEnded>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field AudioSink audioSink>
	//    5   11:invokeinterface #437 <Method boolean AudioSink.isEnded()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isReady()
	{
		return audioSink.hasPendingData() || inputFormat != null && !waitingForKeys && (isSourceReady() || outputBuffer != null);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:invokeinterface #441 <Method boolean AudioSink.hasPendingData()>
	//    3    9:ifne            45
	//    4   12:aload_0         
	//    5   13:getfield        #295 <Field Format inputFormat>
	//    6   16:ifnull          43
	//    7   19:aload_0         
	//    8   20:getfield        #231 <Field boolean waitingForKeys>
	//    9   23:ifne            43
	//   10   26:aload_0         
	//   11   27:invokevirtual   #444 <Method boolean isSourceReady()>
	//   12   30:ifne            45
	//   13   33:aload_0         
	//   14   34:getfield        #143 <Field SimpleOutputBuffer outputBuffer>
	//   15   37:ifnull          43
	//   16   40:goto            45
	//   17   43:iconst_0        
	//   18   44:ireturn         
	//   19   45:iconst_1        
	//   20   46:ireturn         
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

	protected void onDisabled()
	{
		inputFormat = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #295 <Field Format inputFormat>
		audioTrackNeedsConfigure = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #122 <Field boolean audioTrackNeedsConfigure>
		waitingForKeys = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #231 <Field boolean waitingForKeys>
		releaseDecoder();
	//    9   15:aload_0         
	//   10   16:invokespecial   #167 <Method void releaseDecoder()>
		audioSink.release();
	//   11   19:aload_0         
	//   12   20:getfield        #95  <Field AudioSink audioSink>
	//   13   23:invokeinterface #450 <Method void AudioSink.release()>
		if(drmSession != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #269 <Field DrmSession drmSession>
	//*  16   32:ifnull          48
			drmSessionManager.releaseSession(drmSession);
	//   17   35:aload_0         
	//   18   36:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//   19   39:aload_0         
	//   20   40:getfield        #269 <Field DrmSession drmSession>
	//   21   43:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//*  22   48:aload_0         
	//*  23   49:getfield        #267 <Field DrmSession pendingDrmSession>
	//*  24   52:ifnull          79
	//*  25   55:aload_0         
	//*  26   56:getfield        #267 <Field DrmSession pendingDrmSession>
	//*  27   59:aload_0         
	//*  28   60:getfield        #269 <Field DrmSession drmSession>
	//*  29   63:if_acmpeq       79
			drmSessionManager.releaseSession(pendingDrmSession);
	//   30   66:aload_0         
	//   31   67:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//   32   70:aload_0         
	//   33   71:getfield        #267 <Field DrmSession pendingDrmSession>
	//   34   74:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//   35   79:aload_0         
	//   36   80:aconst_null     
	//   37   81:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   38   84:aload_0         
	//   39   85:aconst_null     
	//   40   86:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//   41   89:aload_0         
	//   42   90:getfield        #155 <Field DecoderCounters decoderCounters>
	//   43   93:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   44   96:aload_0         
	//   45   97:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   46  100:aload_0         
	//   47  101:getfield        #155 <Field DecoderCounters decoderCounters>
	//   48  104:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		return;
	//   49  107:return          
		Exception exception;
		exception;
	//   50  108:astore_1        
		drmSession = null;
	//   51  109:aload_0         
	//   52  110:aconst_null     
	//   53  111:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   54  114:aload_0         
	//   55  115:aconst_null     
	//   56  116:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//   57  119:aload_0         
	//   58  120:getfield        #155 <Field DecoderCounters decoderCounters>
	//   59  123:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   60  126:aload_0         
	//   61  127:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   62  130:aload_0         
	//   63  131:getfield        #155 <Field DecoderCounters decoderCounters>
	//   64  134:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//   65  137:aload_1         
	//   66  138:athrow          
		exception;
	//   67  139:astore_1        
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//*  68  140:aload_0         
	//*  69  141:getfield        #267 <Field DrmSession pendingDrmSession>
	//*  70  144:ifnull          171
	//*  71  147:aload_0         
	//*  72  148:getfield        #267 <Field DrmSession pendingDrmSession>
	//*  73  151:aload_0         
	//*  74  152:getfield        #269 <Field DrmSession drmSession>
	//*  75  155:if_acmpeq       171
			drmSessionManager.releaseSession(pendingDrmSession);
	//   76  158:aload_0         
	//   77  159:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//   78  162:aload_0         
	//   79  163:getfield        #267 <Field DrmSession pendingDrmSession>
	//   80  166:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//   81  171:aload_0         
	//   82  172:aconst_null     
	//   83  173:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   84  176:aload_0         
	//   85  177:aconst_null     
	//   86  178:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//   87  181:aload_0         
	//   88  182:getfield        #155 <Field DecoderCounters decoderCounters>
	//   89  185:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//   90  188:aload_0         
	//   91  189:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//   92  192:aload_0         
	//   93  193:getfield        #155 <Field DecoderCounters decoderCounters>
	//   94  196:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//   95  199:aload_1         
	//   96  200:athrow          
		exception;
	//   97  201:astore_1        
		drmSession = null;
	//   98  202:aload_0         
	//   99  203:aconst_null     
	//  100  204:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  101  207:aload_0         
	//  102  208:aconst_null     
	//  103  209:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//  104  212:aload_0         
	//  105  213:getfield        #155 <Field DecoderCounters decoderCounters>
	//  106  216:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//  107  219:aload_0         
	//  108  220:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//  109  223:aload_0         
	//  110  224:getfield        #155 <Field DecoderCounters decoderCounters>
	//  111  227:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//  112  230:aload_1         
	//  113  231:athrow          
		exception;
	//  114  232:astore_1        
		if(drmSession != null)
	//* 115  233:aload_0         
	//* 116  234:getfield        #269 <Field DrmSession drmSession>
	//* 117  237:ifnull          253
			drmSessionManager.releaseSession(drmSession);
	//  118  240:aload_0         
	//  119  241:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//  120  244:aload_0         
	//  121  245:getfield        #269 <Field DrmSession drmSession>
	//  122  248:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//* 123  253:aload_0         
	//* 124  254:getfield        #267 <Field DrmSession pendingDrmSession>
	//* 125  257:ifnull          284
	//* 126  260:aload_0         
	//* 127  261:getfield        #267 <Field DrmSession pendingDrmSession>
	//* 128  264:aload_0         
	//* 129  265:getfield        #269 <Field DrmSession drmSession>
	//* 130  268:if_acmpeq       284
			drmSessionManager.releaseSession(pendingDrmSession);
	//  131  271:aload_0         
	//  132  272:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//  133  275:aload_0         
	//  134  276:getfield        #267 <Field DrmSession pendingDrmSession>
	//  135  279:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//  136  284:aload_0         
	//  137  285:aconst_null     
	//  138  286:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  139  289:aload_0         
	//  140  290:aconst_null     
	//  141  291:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//  142  294:aload_0         
	//  143  295:getfield        #155 <Field DecoderCounters decoderCounters>
	//  144  298:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//  145  301:aload_0         
	//  146  302:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//  147  305:aload_0         
	//  148  306:getfield        #155 <Field DecoderCounters decoderCounters>
	//  149  309:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//  150  312:aload_1         
	//  151  313:athrow          
		exception;
	//  152  314:astore_1        
		drmSession = null;
	//  153  315:aload_0         
	//  154  316:aconst_null     
	//  155  317:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  156  320:aload_0         
	//  157  321:aconst_null     
	//  158  322:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//  159  325:aload_0         
	//  160  326:getfield        #155 <Field DecoderCounters decoderCounters>
	//  161  329:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//  162  332:aload_0         
	//  163  333:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//  164  336:aload_0         
	//  165  337:getfield        #155 <Field DecoderCounters decoderCounters>
	//  166  340:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//  167  343:aload_1         
	//  168  344:athrow          
		exception;
	//  169  345:astore_1        
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//* 170  346:aload_0         
	//* 171  347:getfield        #267 <Field DrmSession pendingDrmSession>
	//* 172  350:ifnull          377
	//* 173  353:aload_0         
	//* 174  354:getfield        #267 <Field DrmSession pendingDrmSession>
	//* 175  357:aload_0         
	//* 176  358:getfield        #269 <Field DrmSession drmSession>
	//* 177  361:if_acmpeq       377
			drmSessionManager.releaseSession(pendingDrmSession);
	//  178  364:aload_0         
	//  179  365:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//  180  368:aload_0         
	//  181  369:getfield        #267 <Field DrmSession pendingDrmSession>
	//  182  372:invokeinterface #353 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//  183  377:aload_0         
	//  184  378:aconst_null     
	//  185  379:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  186  382:aload_0         
	//  187  383:aconst_null     
	//  188  384:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//  189  387:aload_0         
	//  190  388:getfield        #155 <Field DecoderCounters decoderCounters>
	//  191  391:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//  192  394:aload_0         
	//  193  395:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//  194  398:aload_0         
	//  195  399:getfield        #155 <Field DecoderCounters decoderCounters>
	//  196  402:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//  197  405:aload_1         
	//  198  406:athrow          
		exception;
	//  199  407:astore_1        
		drmSession = null;
	//  200  408:aload_0         
	//  201  409:aconst_null     
	//  202  410:putfield        #269 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  203  413:aload_0         
	//  204  414:aconst_null     
	//  205  415:putfield        #267 <Field DrmSession pendingDrmSession>
		decoderCounters.ensureUpdated();
	//  206  418:aload_0         
	//  207  419:getfield        #155 <Field DecoderCounters decoderCounters>
	//  208  422:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
		eventDispatcher.disabled(decoderCounters);
	//  209  425:aload_0         
	//  210  426:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//  211  429:aload_0         
	//  212  430:getfield        #155 <Field DecoderCounters decoderCounters>
	//  213  433:invokevirtual   #457 <Method void AudioRendererEventListener$EventDispatcher.disabled(DecoderCounters)>
		throw exception;
	//  214  436:aload_1         
	//  215  437:athrow          
	}

	protected void onEnabled(boolean flag)
		throws ExoPlaybackException
	{
		decoderCounters = new DecoderCounters();
	//    0    0:aload_0         
	//    1    1:new             #157 <Class DecoderCounters>
	//    2    4:dup             
	//    3    5:invokespecial   #460 <Method void DecoderCounters()>
	//    4    8:putfield        #155 <Field DecoderCounters decoderCounters>
		eventDispatcher.enabled(decoderCounters);
	//    5   11:aload_0         
	//    6   12:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//    7   15:aload_0         
	//    8   16:getfield        #155 <Field DecoderCounters decoderCounters>
	//    9   19:invokevirtual   #463 <Method void AudioRendererEventListener$EventDispatcher.enabled(DecoderCounters)>
		int i = getConfiguration().tunnelingAudioSessionId;
	//   10   22:aload_0         
	//   11   23:invokevirtual   #467 <Method RendererConfiguration getConfiguration()>
	//   12   26:getfield        #472 <Field int RendererConfiguration.tunnelingAudioSessionId>
	//   13   29:istore_2        
		if(i != 0)
	//*  14   30:iload_2         
	//*  15   31:ifeq            45
		{
			audioSink.enableTunnelingV21(i);
	//   16   34:aload_0         
	//   17   35:getfield        #95  <Field AudioSink audioSink>
	//   18   38:iload_2         
	//   19   39:invokeinterface #475 <Method void AudioSink.enableTunnelingV21(int)>
			return;
	//   20   44:return          
		} else
		{
			audioSink.disableTunneling();
	//   21   45:aload_0         
	//   22   46:getfield        #95  <Field AudioSink audioSink>
	//   23   49:invokeinterface #478 <Method void AudioSink.disableTunneling()>
			return;
	//   24   54:return          
		}
	}

	protected void onPositionReset(long l, boolean flag)
		throws ExoPlaybackException
	{
		audioSink.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:invokeinterface #483 <Method void AudioSink.reset()>
		currentPositionUs = l;
	//    3    9:aload_0         
	//    4   10:lload_1         
	//    5   11:putfield        #366 <Field long currentPositionUs>
		allowFirstBufferPositionDiscontinuity = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #360 <Field boolean allowFirstBufferPositionDiscontinuity>
		allowPositionDiscontinuity = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #129 <Field boolean allowPositionDiscontinuity>
		inputStreamEnded = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #217 <Field boolean inputStreamEnded>
		outputStreamEnded = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #376 <Field boolean outputStreamEnded>
		if(decoder != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #145 <Field SimpleDecoder decoder>
	//*  20   38:ifnull          45
			flushDecoder();
	//   21   41:aload_0         
	//   22   42:invokespecial   #485 <Method void flushDecoder()>
	//   23   45:return          
	}

	protected void onStarted()
	{
		audioSink.play();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:invokeinterface #489 <Method void AudioSink.play()>
	//    3    9:return          
	}

	protected void onStopped()
	{
		updateCurrentPosition();
	//    0    0:aload_0         
	//    1    1:invokespecial   #416 <Method void updateCurrentPosition()>
		audioSink.pause();
	//    2    4:aload_0         
	//    3    5:getfield        #95  <Field AudioSink audioSink>
	//    4    8:invokeinterface #493 <Method void AudioSink.pause()>
	//    5   13:return          
	}

	public void render(long l, long l1)
		throws ExoPlaybackException
	{
		if(outputStreamEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #376 <Field boolean outputStreamEnded>
	//*   2    4:ifeq            29
			try
			{
				audioSink.playToEndOfStream();
	//    3    7:aload_0         
	//    4    8:getfield        #95  <Field AudioSink audioSink>
	//    5   11:invokeinterface #379 <Method void AudioSink.playToEndOfStream()>
				return;
	//    6   16:return          
			}
			catch(AudioSink.WriteException writeexception)
	//*   7   17:astore          6
			{
				throw ExoPlaybackException.createForRenderer(((Exception) (writeexception)), getIndex());
	//    8   19:aload           6
	//    9   21:aload_0         
	//   10   22:invokevirtual   #317 <Method int getIndex()>
	//   11   25:invokestatic    #321 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   12   28:athrow          
			}
		if(inputFormat == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #295 <Field Format inputFormat>
	//*  15   33:ifnonnull       107
		{
			flagsOnlyBuffer.clear();
	//   16   36:aload_0         
	//   17   37:getfield        #118 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   18   40:invokevirtual   #498 <Method void DecoderInputBuffer.clear()>
			int i = readSource(formatHolder, flagsOnlyBuffer, true);
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #110 <Field FormatHolder formatHolder>
	//   22   48:aload_0         
	//   23   49:getfield        #118 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   24   52:iconst_1        
	//   25   53:invokevirtual   #235 <Method int readSource(FormatHolder, DecoderInputBuffer, boolean)>
	//   26   56:istore          5
			if(i == -5)
	//*  27   58:iload           5
	//*  28   60:bipush          -5
	//*  29   62:icmpne          79
				onInputFormatChanged(formatHolder.format);
	//   30   65:aload_0         
	//   31   66:aload_0         
	//   32   67:getfield        #110 <Field FormatHolder formatHolder>
	//   33   70:getfield        #238 <Field Format FormatHolder.format>
	//   34   73:invokespecial   #242 <Method void onInputFormatChanged(Format)>
			else
	//*  35   76:goto            107
			if(i == -4)
	//*  36   79:iload           5
	//*  37   81:bipush          -4
	//*  38   83:icmpne          106
			{
				Assertions.checkState(flagsOnlyBuffer.isEndOfStream());
	//   39   86:aload_0         
	//   40   87:getfield        #118 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   41   90:invokevirtual   #243 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//   42   93:invokestatic    #503 <Method void Assertions.checkState(boolean)>
				inputStreamEnded = true;
	//   43   96:aload_0         
	//   44   97:iconst_1        
	//   45   98:putfield        #217 <Field boolean inputStreamEnded>
				processEndOfStream();
	//   46  101:aload_0         
	//   47  102:invokespecial   #176 <Method void processEndOfStream()>
				return;
	//   48  105:return          
			} else
			{
				return;
	//   49  106:return          
			}
		}
		maybeInitDecoder();
	//   50  107:aload_0         
	//   51  108:invokespecial   #170 <Method void maybeInitDecoder()>
		if(decoder == null)
			break MISSING_BLOCK_LABEL_167;
	//   52  111:aload_0         
	//   53  112:getfield        #145 <Field SimpleDecoder decoder>
	//   54  115:ifnull          167
		try
		{
			TraceUtil.beginSection("drainAndFeed");
	//   55  118:ldc2            #505 <String "drainAndFeed">
	//   56  121:invokestatic    #293 <Method void TraceUtil.beginSection(String)>
			while(drainOutputBuffer()) ;
	//   57  124:aload_0         
	//   58  125:invokespecial   #507 <Method boolean drainOutputBuffer()>
	//   59  128:ifeq            134
		}
	//*  60  131:goto            124
	//*  61  134:aload_0         
	//*  62  135:invokespecial   #509 <Method boolean feedInputBuffer()>
	//*  63  138:ifeq            144
	//*  64  141:goto            134
	//*  65  144:invokestatic    #302 <Method void TraceUtil.endSection()>
	//*  66  147:aload_0         
	//*  67  148:getfield        #155 <Field DecoderCounters decoderCounters>
	//*  68  151:invokevirtual   #453 <Method void DecoderCounters.ensureUpdated()>
	//*  69  154:return          
		catch(Object obj)
	//*  70  155:astore          6
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (obj)), getIndex());
	//   71  157:aload           6
	//   72  159:aload_0         
	//   73  160:invokevirtual   #317 <Method int getIndex()>
	//   74  163:invokestatic    #321 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   75  166:athrow          
		}
		while(feedInputBuffer()) ;
		TraceUtil.endSection();
		decoderCounters.ensureUpdated();
		return;
	//   76  167:return          
	}

	public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		return audioSink.setPlaybackParameters(playbackparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:aload_1         
	//    3    5:invokeinterface #513 <Method PlaybackParameters AudioSink.setPlaybackParameters(PlaybackParameters)>
	//    4   10:areturn         
	}

	public final int supportsFormat(Format format)
	{
		int i = supportsFormatInternal(drmSessionManager, format);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #84  <Field DrmSessionManager drmSessionManager>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #519 <Method int supportsFormatInternal(DrmSessionManager, Format)>
	//    5    9:istore_3        
		if(i <= 2)
	//*   6   10:iload_3         
	//*   7   11:iconst_2        
	//*   8   12:icmpgt          17
			return i;
	//    9   15:iload_3         
	//   10   16:ireturn         
		byte byte0;
		if(Util.SDK_INT >= 21)
	//*  11   17:getstatic       #522 <Field int Util.SDK_INT>
	//*  12   20:bipush          21
	//*  13   22:icmplt          31
			byte0 = 32;
	//   14   25:bipush          32
	//   15   27:istore_2        
		else
	//*  16   28:goto            33
			byte0 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		return i | (byte0 | 8);
	//   19   33:iload_3         
	//   20   34:iload_2         
	//   21   35:bipush          8
	//   22   37:ior             
	//   23   38:ior             
	//   24   39:ireturn         
	}

	protected abstract int supportsFormatInternal(DrmSessionManager drmsessionmanager, Format format);

	protected final boolean supportsOutputEncoding(int i)
	{
		return audioSink.isEncodingSupported(i);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AudioSink audioSink>
	//    2    4:iload_1         
	//    3    5:invokeinterface #527 <Method boolean AudioSink.isEncodingSupported(int)>
	//    4   10:ireturn         
	}

	private static final int REINITIALIZATION_STATE_NONE = 0;
	private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
	private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
	private boolean allowFirstBufferPositionDiscontinuity;
	private boolean allowPositionDiscontinuity;
	private final AudioSink audioSink;
	private boolean audioTrackNeedsConfigure;
	private long currentPositionUs;
	private SimpleDecoder decoder;
	private DecoderCounters decoderCounters;
	private boolean decoderReceivedBuffers;
	private int decoderReinitializationState;
	private DrmSession drmSession;
	private final DrmSessionManager drmSessionManager;
	private int encoderDelay;
	private int encoderPadding;
	private final AudioRendererEventListener.EventDispatcher eventDispatcher;
	private final DecoderInputBuffer flagsOnlyBuffer;
	private final FormatHolder formatHolder;
	private DecoderInputBuffer inputBuffer;
	private Format inputFormat;
	private boolean inputStreamEnded;
	private SimpleOutputBuffer outputBuffer;
	private boolean outputStreamEnded;
	private DrmSession pendingDrmSession;
	private final boolean playClearSamplesWithoutKeys;
	private boolean waitingForKeys;


/*
	static AudioRendererEventListener.EventDispatcher access$100(SimpleDecoderAudioRenderer simpledecoderaudiorenderer)
	{
		return simpledecoderaudiorenderer.eventDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field AudioRendererEventListener$EventDispatcher eventDispatcher>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$202(SimpleDecoderAudioRenderer simpledecoderaudiorenderer, boolean flag)
	{
		simpledecoderaudiorenderer.allowPositionDiscontinuity = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #129 <Field boolean allowPositionDiscontinuity>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
