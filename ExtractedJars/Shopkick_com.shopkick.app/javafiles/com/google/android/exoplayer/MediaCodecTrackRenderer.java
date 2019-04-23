// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.drm.DrmSessionManager;
import com.google.android.exoplayer.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.TraceUtil;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//			SampleSourceTrackRenderer, SampleSource, MediaCodecSelector, CodecCounters, 
//			SampleHolder, MediaFormatHolder, MediaFormat, ExoPlaybackException, 
//			CryptoInfo, DecoderInfo

public abstract class MediaCodecTrackRenderer extends SampleSourceTrackRenderer
{
	public static class DecoderInitializationException extends Exception
	{

		private static String buildCustomDiagnosticInfo(int i)
		{
			String s;
			if(i < 0)
		//*   0    0:iload_0         
		//*   1    1:ifge            10
				s = "neg_";
		//    2    4:ldc1            #80  <String "neg_">
		//    3    6:astore_1        
			else
		//*   4    7:goto            13
				s = "";
		//    5   10:ldc1            #82  <String "">
		//    6   12:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//    7   13:new             #24  <Class StringBuilder>
		//    8   16:dup             
		//    9   17:invokespecial   #27  <Method void StringBuilder()>
		//   10   20:astore_2        
			stringbuilder.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
		//   11   21:aload_2         
		//   12   22:ldc1            #84  <String "com.google.android.exoplayer.MediaCodecTrackRenderer_">
		//   13   24:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   14   27:pop             
			stringbuilder.append(s);
		//   15   28:aload_2         
		//   16   29:aload_1         
		//   17   30:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   18   33:pop             
			stringbuilder.append(Math.abs(i));
		//   19   34:aload_2         
		//   20   35:iload_0         
		//   21   36:invokestatic    #90  <Method int Math.abs(int)>
		//   22   39:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
		//   23   42:pop             
			return stringbuilder.toString();
		//   24   43:aload_2         
		//   25   44:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   26   47:areturn         
		}

		private static String getDiagnosticInfoV21(Throwable throwable)
		{
			if(throwable instanceof android.media.MediaCodec.CodecException)
		//*   0    0:aload_0         
		//*   1    1:instanceof      #95  <Class android.media.MediaCodec$CodecException>
		//*   2    4:ifeq            15
				return ((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo();
		//    3    7:aload_0         
		//    4    8:checkcast       #95  <Class android.media.MediaCodec$CodecException>
		//    5   11:invokevirtual   #98  <Method String android.media.MediaCodec$CodecException.getDiagnosticInfo()>
		//    6   14:areturn         
			else
				return null;
		//    7   15:aconst_null     
		//    8   16:areturn         
		}

		private static final int CUSTOM_ERROR_CODE_BASE = -50000;
		private static final int DECODER_QUERY_ERROR = -49998;
		private static final int NO_SUITABLE_DECODER_ERROR = -49999;
		public final String decoderName;
		public final String diagnosticInfo;
		public final String mimeType;
		public final boolean secureDecoderRequired;

		public DecoderInitializationException(com.google.android.exoplayer.MediaFormat mediaformat, Throwable throwable, boolean flag, int i)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #24  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore          5
			stringbuilder.append("Decoder init failed: [");
		//    4    9:aload           5
		//    5   11:ldc1            #29  <String "Decoder init failed: [">
		//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(i);
		//    8   17:aload           5
		//    9   19:iload           4
		//   10   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
		//   11   24:pop             
			stringbuilder.append("], ");
		//   12   25:aload           5
		//   13   27:ldc1            #38  <String "], ">
		//   14   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   15   32:pop             
			stringbuilder.append(((Object) (mediaformat)));
		//   16   33:aload           5
		//   17   35:aload_1         
		//   18   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
		//   19   39:pop             
			super(stringbuilder.toString(), throwable);
		//   20   40:aload_0         
		//   21   41:aload           5
		//   22   43:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   23   46:aload_2         
		//   24   47:invokespecial   #48  <Method void Exception(String, Throwable)>
			mimeType = mediaformat.mimeType;
		//   25   50:aload_0         
		//   26   51:aload_1         
		//   27   52:getfield        #52  <Field String MediaFormat.mimeType>
		//   28   55:putfield        #53  <Field String mimeType>
			secureDecoderRequired = flag;
		//   29   58:aload_0         
		//   30   59:iload_3         
		//   31   60:putfield        #55  <Field boolean secureDecoderRequired>
			decoderName = null;
		//   32   63:aload_0         
		//   33   64:aconst_null     
		//   34   65:putfield        #57  <Field String decoderName>
			diagnosticInfo = buildCustomDiagnosticInfo(i);
		//   35   68:aload_0         
		//   36   69:iload           4
		//   37   71:invokestatic    #61  <Method String buildCustomDiagnosticInfo(int)>
		//   38   74:putfield        #63  <Field String diagnosticInfo>
		//   39   77:return          
		}

		public DecoderInitializationException(com.google.android.exoplayer.MediaFormat mediaformat, Throwable throwable, boolean flag, String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #24  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore          5
			stringbuilder.append("Decoder init failed: ");
		//    4    9:aload           5
		//    5   11:ldc1            #67  <String "Decoder init failed: ">
		//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(s);
		//    8   17:aload           5
		//    9   19:aload           4
		//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			stringbuilder.append(", ");
		//   12   25:aload           5
		//   13   27:ldc1            #69  <String ", ">
		//   14   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   15   32:pop             
			stringbuilder.append(((Object) (mediaformat)));
		//   16   33:aload           5
		//   17   35:aload_1         
		//   18   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
		//   19   39:pop             
			super(stringbuilder.toString(), throwable);
		//   20   40:aload_0         
		//   21   41:aload           5
		//   22   43:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   23   46:aload_2         
		//   24   47:invokespecial   #48  <Method void Exception(String, Throwable)>
			mimeType = mediaformat.mimeType;
		//   25   50:aload_0         
		//   26   51:aload_1         
		//   27   52:getfield        #52  <Field String MediaFormat.mimeType>
		//   28   55:putfield        #53  <Field String mimeType>
			secureDecoderRequired = flag;
		//   29   58:aload_0         
		//   30   59:iload_3         
		//   31   60:putfield        #55  <Field boolean secureDecoderRequired>
			decoderName = s;
		//   32   63:aload_0         
		//   33   64:aload           4
		//   34   66:putfield        #57  <Field String decoderName>
			if(Util.SDK_INT >= 21)
		//*  35   69:getstatic       #74  <Field int Util.SDK_INT>
		//*  36   72:bipush          21
		//*  37   74:icmplt          85
				mediaformat = ((com.google.android.exoplayer.MediaFormat) (getDiagnosticInfoV21(throwable)));
		//   38   77:aload_2         
		//   39   78:invokestatic    #78  <Method String getDiagnosticInfoV21(Throwable)>
		//   40   81:astore_1        
			else
		//*  41   82:goto            87
				mediaformat = null;
		//   42   85:aconst_null     
		//   43   86:astore_1        
			diagnosticInfo = ((String) (mediaformat));
		//   44   87:aload_0         
		//   45   88:aload_1         
		//   46   89:putfield        #63  <Field String diagnosticInfo>
		//   47   92:return          
		}
	}

	public static interface EventListener
	{

		public abstract void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception);

		public abstract void onDecoderInitializationError(DecoderInitializationException decoderinitializationexception);

		public abstract void onDecoderInitialized(String s, long l, long l1);
	}


	public MediaCodecTrackRenderer(SampleSource samplesource, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener)
	{
		this(new SampleSource[] {
			samplesource
		}, mediacodecselector, drmsessionmanager, flag, handler, eventlistener);
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
	//   12   17:invokespecial   #116 <Method void MediaCodecTrackRenderer(SampleSource[], MediaCodecSelector, DrmSessionManager, boolean, Handler, MediaCodecTrackRenderer$EventListener)>
	//   13   20:return          
	}

	public MediaCodecTrackRenderer(SampleSource asamplesource[], MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag, Handler handler, EventListener eventlistener)
	{
		super(asamplesource);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void SampleSourceTrackRenderer(SampleSource[])>
		boolean flag1;
		if(Util.SDK_INT >= 16)
	//*   3    5:getstatic       #124 <Field int Util.SDK_INT>
	//*   4    8:bipush          16
	//*   5   10:icmplt          19
			flag1 = true;
	//    6   13:iconst_1        
	//    7   14:istore          7
		else
	//*   8   16:goto            22
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore          7
		Assertions.checkState(flag1);
	//   11   22:iload           7
	//   12   24:invokestatic    #130 <Method void Assertions.checkState(boolean)>
		mediaCodecSelector = (MediaCodecSelector)Assertions.checkNotNull(((Object) (mediacodecselector)));
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokestatic    #134 <Method Object Assertions.checkNotNull(Object)>
	//   16   32:checkcast       #136 <Class MediaCodecSelector>
	//   17   35:putfield        #138 <Field MediaCodecSelector mediaCodecSelector>
		drmSessionManager = drmsessionmanager;
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:putfield        #140 <Field DrmSessionManager drmSessionManager>
		playClearSamplesWithoutKeys = flag;
	//   21   43:aload_0         
	//   22   44:iload           4
	//   23   46:putfield        #142 <Field boolean playClearSamplesWithoutKeys>
		eventHandler = handler;
	//   24   49:aload_0         
	//   25   50:aload           5
	//   26   52:putfield        #144 <Field Handler eventHandler>
		eventListener = eventlistener;
	//   27   55:aload_0         
	//   28   56:aload           6
	//   29   58:putfield        #146 <Field MediaCodecTrackRenderer$EventListener eventListener>
		deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
	//   30   61:aload_0         
	//   31   62:invokestatic    #149 <Method boolean deviceNeedsAutoFrcWorkaround()>
	//   32   65:putfield        #151 <Field boolean deviceNeedsAutoFrcWorkaround>
		codecCounters = new CodecCounters();
	//   33   68:aload_0         
	//   34   69:new             #153 <Class CodecCounters>
	//   35   72:dup             
	//   36   73:invokespecial   #155 <Method void CodecCounters()>
	//   37   76:putfield        #157 <Field CodecCounters codecCounters>
		sampleHolder = new SampleHolder(0);
	//   38   79:aload_0         
	//   39   80:new             #159 <Class SampleHolder>
	//   40   83:dup             
	//   41   84:iconst_0        
	//   42   85:invokespecial   #162 <Method void SampleHolder(int)>
	//   43   88:putfield        #164 <Field SampleHolder sampleHolder>
		formatHolder = new MediaFormatHolder();
	//   44   91:aload_0         
	//   45   92:new             #166 <Class MediaFormatHolder>
	//   46   95:dup             
	//   47   96:invokespecial   #167 <Method void MediaFormatHolder()>
	//   48   99:putfield        #169 <Field MediaFormatHolder formatHolder>
		decodeOnlyPresentationTimestamps = ((List) (new ArrayList()));
	//   49  102:aload_0         
	//   50  103:new             #171 <Class ArrayList>
	//   51  106:dup             
	//   52  107:invokespecial   #172 <Method void ArrayList()>
	//   53  110:putfield        #174 <Field List decodeOnlyPresentationTimestamps>
		outputBufferInfo = new android.media.MediaCodec.BufferInfo();
	//   54  113:aload_0         
	//   55  114:new             #176 <Class android.media.MediaCodec$BufferInfo>
	//   56  117:dup             
	//   57  118:invokespecial   #177 <Method void android.media.MediaCodec$BufferInfo()>
	//   58  121:putfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
		codecReconfigurationState = 0;
	//   59  124:aload_0         
	//   60  125:iconst_0        
	//   61  126:putfield        #181 <Field int codecReconfigurationState>
		codecReinitializationState = 0;
	//   62  129:aload_0         
	//   63  130:iconst_0        
	//   64  131:putfield        #183 <Field int codecReinitializationState>
	//   65  134:return          
	}

	private static boolean codecNeedsAdaptationWorkaround(String s)
	{
		return Util.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(((Object) (s))) || "OMX.Nvidia.h264.decode.secure".equals(((Object) (s)))) && (Util.DEVICE.equals("flounder") || Util.DEVICE.equals("flounder_lte") || Util.DEVICE.equals("grouper") || Util.DEVICE.equals("tilapia"));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          24
	//    2    5:icmpge          72
	//    3    8:ldc1            #189 <String "OMX.Nvidia.h264.decode">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #195 <Method boolean String.equals(Object)>
	//    6   14:ifne            26
	//    7   17:ldc1            #197 <String "OMX.Nvidia.h264.decode.secure">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   10   23:ifeq            72
	//   11   26:getstatic       #201 <Field String Util.DEVICE>
	//   12   29:ldc1            #203 <String "flounder">
	//   13   31:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   14   34:ifne            70
	//   15   37:getstatic       #201 <Field String Util.DEVICE>
	//   16   40:ldc1            #205 <String "flounder_lte">
	//   17   42:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   18   45:ifne            70
	//   19   48:getstatic       #201 <Field String Util.DEVICE>
	//   20   51:ldc1            #207 <String "grouper">
	//   21   53:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   22   56:ifne            70
	//   23   59:getstatic       #201 <Field String Util.DEVICE>
	//   24   62:ldc1            #209 <String "tilapia">
	//   25   64:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   26   67:ifeq            72
	//   27   70:iconst_1        
	//   28   71:ireturn         
	//   29   72:iconst_0        
	//   30   73:ireturn         
	}

	private static boolean codecNeedsDiscardToSpsWorkaround(String s, com.google.android.exoplayer.MediaFormat mediaformat)
	{
		return Util.SDK_INT < 21 && mediaformat.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(((Object) (s)));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmpge          31
	//    3    8:aload_1         
	//    4    9:getfield        #215 <Field List MediaFormat.initializationData>
	//    5   12:invokeinterface #220 <Method boolean List.isEmpty()>
	//    6   17:ifeq            31
	//    7   20:ldc1            #222 <String "OMX.MTK.VIDEO.DECODER.AVC">
	//    8   22:aload_0         
	//    9   23:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   10   26:ifeq            31
	//   11   29:iconst_1        
	//   12   30:ireturn         
	//   13   31:iconst_0        
	//   14   32:ireturn         
	}

	private static boolean codecNeedsEosFlushWorkaround(String s)
	{
		return Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(((Object) (s))) || Util.SDK_INT <= 19 && "hb2000".equals(((Object) (Util.DEVICE))) && ("OMX.amlogic.avc.decoder.awesome".equals(((Object) (s))) || "OMX.amlogic.avc.decoder.awesome.secure".equals(((Object) (s))));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmpgt          17
	//    3    8:ldc1            #224 <String "OMX.google.vorbis.decoder">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #195 <Method boolean String.equals(Object)>
	//    6   14:ifne            54
	//    7   17:getstatic       #124 <Field int Util.SDK_INT>
	//    8   20:bipush          19
	//    9   22:icmpgt          56
	//   10   25:ldc1            #226 <String "hb2000">
	//   11   27:getstatic       #201 <Field String Util.DEVICE>
	//   12   30:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   13   33:ifeq            56
	//   14   36:ldc1            #228 <String "OMX.amlogic.avc.decoder.awesome">
	//   15   38:aload_0         
	//   16   39:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   17   42:ifne            54
	//   18   45:ldc1            #230 <String "OMX.amlogic.avc.decoder.awesome.secure">
	//   19   47:aload_0         
	//   20   48:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   21   51:ifeq            56
	//   22   54:iconst_1        
	//   23   55:ireturn         
	//   24   56:iconst_0        
	//   25   57:ireturn         
	}

	private static boolean codecNeedsEosOutputExceptionWorkaround(String s)
	{
		return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(((Object) (s)));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmpne          19
	//    3    8:ldc1            #232 <String "OMX.google.aac.decoder">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #195 <Method boolean String.equals(Object)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private static boolean codecNeedsEosPropagationWorkaround(String s)
	{
		return Util.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(((Object) (s))) || "OMX.allwinner.video.decoder.avc".equals(((Object) (s))));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          17
	//    2    5:icmpgt          28
	//    3    8:ldc1            #234 <String "OMX.rk.video_decoder.avc">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #195 <Method boolean String.equals(Object)>
	//    6   14:ifne            26
	//    7   17:ldc1            #236 <String "OMX.allwinner.video.decoder.avc">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   10   23:ifeq            28
	//   11   26:iconst_1        
	//   12   27:ireturn         
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	private static boolean codecNeedsFlushWorkaround(String s)
	{
		return Util.SDK_INT < 18 || Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(((Object) (s))) || "OMX.SEC.avc.dec.secure".equals(((Object) (s)))) || Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(((Object) (s))) || "OMX.Exynos.avc.dec.secure".equals(((Object) (s))));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmplt          76
	//    3    8:getstatic       #124 <Field int Util.SDK_INT>
	//    4   11:bipush          18
	//    5   13:icmpne          34
	//    6   16:ldc1            #238 <String "OMX.SEC.avc.dec">
	//    7   18:aload_0         
	//    8   19:invokevirtual   #195 <Method boolean String.equals(Object)>
	//    9   22:ifne            76
	//   10   25:ldc1            #240 <String "OMX.SEC.avc.dec.secure">
	//   11   27:aload_0         
	//   12   28:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   13   31:ifne            76
	//   14   34:getstatic       #124 <Field int Util.SDK_INT>
	//   15   37:bipush          19
	//   16   39:icmpne          74
	//   17   42:getstatic       #243 <Field String Util.MODEL>
	//   18   45:ldc1            #245 <String "SM-G800">
	//   19   47:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   20   50:ifeq            74
	//   21   53:ldc1            #250 <String "OMX.Exynos.avc.dec">
	//   22   55:aload_0         
	//   23   56:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   24   59:ifne            76
	//   25   62:ldc1            #252 <String "OMX.Exynos.avc.dec.secure">
	//   26   64:aload_0         
	//   27   65:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   28   68:ifeq            74
	//   29   71:goto            76
	//   30   74:iconst_0        
	//   31   75:ireturn         
	//   32   76:iconst_1        
	//   33   77:ireturn         
	}

	private static boolean codecNeedsMonoChannelCountWorkaround(String s, com.google.android.exoplayer.MediaFormat mediaformat)
	{
		return Util.SDK_INT <= 18 && mediaformat.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(((Object) (s)));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmpgt          28
	//    3    8:aload_1         
	//    4    9:getfield        #255 <Field int MediaFormat.channelCount>
	//    5   12:iconst_1        
	//    6   13:icmpne          28
	//    7   16:ldc2            #257 <String "OMX.MTK.AUDIO.DECODER.MP3">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   10   23:ifeq            28
	//   11   26:iconst_1        
	//   12   27:ireturn         
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	private static boolean deviceNeedsAutoFrcWorkaround()
	{
		return Util.SDK_INT <= 22 && "foster".equals(((Object) (Util.DEVICE))) && "NVIDIA".equals(((Object) (Util.MANUFACTURER)));
	//    0    0:getstatic       #124 <Field int Util.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmpgt          34
	//    3    8:ldc2            #259 <String "foster">
	//    4   11:getstatic       #201 <Field String Util.DEVICE>
	//    5   14:invokevirtual   #195 <Method boolean String.equals(Object)>
	//    6   17:ifeq            34
	//    7   20:ldc2            #261 <String "NVIDIA">
	//    8   23:getstatic       #264 <Field String Util.MANUFACTURER>
	//    9   26:invokevirtual   #195 <Method boolean String.equals(Object)>
	//   10   29:ifeq            34
	//   11   32:iconst_1        
	//   12   33:ireturn         
	//   13   34:iconst_0        
	//   14   35:ireturn         
	}

	private boolean drainOutputBuffer(long l, long l1)
		throws ExoPlaybackException
	{
		if(outputStreamEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #272 <Field boolean outputStreamEnded>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(outputIndex < 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #274 <Field int outputIndex>
	//*   7   13:ifge            88
			if(codecNeedsEosOutputExceptionWorkaround && codecReceivedEos)
	//*   8   16:aload_0         
	//*   9   17:getfield        #276 <Field boolean codecNeedsEosOutputExceptionWorkaround>
	//*  10   20:ifeq            69
	//*  11   23:aload_0         
	//*  12   24:getfield        #278 <Field boolean codecReceivedEos>
	//*  13   27:ifeq            69
				try
				{
					outputIndex = codec.dequeueOutputBuffer(outputBufferInfo, getDequeueOutputBufferTimeoutUs());
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #280 <Field MediaCodec codec>
	//   17   35:aload_0         
	//   18   36:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #284 <Method long getDequeueOutputBufferTimeoutUs()>
	//   21   43:invokevirtual   #290 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//   22   46:putfield        #274 <Field int outputIndex>
				}
	//*  23   49:goto            88
	//*  24   52:aload_0         
	//*  25   53:invokespecial   #293 <Method void processEndOfStream()>
	//*  26   56:aload_0         
	//*  27   57:getfield        #272 <Field boolean outputStreamEnded>
	//*  28   60:ifeq            67
	//*  29   63:aload_0         
	//*  30   64:invokevirtual   #296 <Method void releaseCodec()>
	//*  31   67:iconst_0        
	//*  32   68:ireturn         
	//*  33   69:aload_0         
	//*  34   70:aload_0         
	//*  35   71:getfield        #280 <Field MediaCodec codec>
	//*  36   74:aload_0         
	//*  37   75:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  38   78:aload_0         
	//*  39   79:invokevirtual   #284 <Method long getDequeueOutputBufferTimeoutUs()>
	//*  40   82:invokevirtual   #290 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//*  41   85:putfield        #274 <Field int outputIndex>
	//*  42   88:aload_0         
	//*  43   89:getfield        #274 <Field int outputIndex>
	//*  44   92:istore          5
	//*  45   94:iload           5
	//*  46   96:bipush          -2
	//*  47   98:icmpne          107
	//*  48  101:aload_0         
	//*  49  102:invokespecial   #299 <Method void processOutputFormat()>
	//*  50  105:iconst_1        
	//*  51  106:ireturn         
	//*  52  107:iload           5
	//*  53  109:bipush          -3
	//*  54  111:icmpne          145
	//*  55  114:aload_0         
	//*  56  115:aload_0         
	//*  57  116:getfield        #280 <Field MediaCodec codec>
	//*  58  119:invokevirtual   #303 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//*  59  122:putfield        #305 <Field ByteBuffer[] outputBuffers>
	//*  60  125:aload_0         
	//*  61  126:getfield        #157 <Field CodecCounters codecCounters>
	//*  62  129:astore          8
	//*  63  131:aload           8
	//*  64  133:aload           8
	//*  65  135:getfield        #308 <Field int CodecCounters.outputBuffersChangedCount>
	//*  66  138:iconst_1        
	//*  67  139:iadd            
	//*  68  140:putfield        #308 <Field int CodecCounters.outputBuffersChangedCount>
	//*  69  143:iconst_1        
	//*  70  144:ireturn         
	//*  71  145:iload           5
	//*  72  147:ifge            180
	//*  73  150:aload_0         
	//*  74  151:getfield        #310 <Field boolean codecNeedsEosPropagationWorkaround>
	//*  75  154:ifeq            178
	//*  76  157:aload_0         
	//*  77  158:getfield        #312 <Field boolean inputStreamEnded>
	//*  78  161:ifne            172
	//*  79  164:aload_0         
	//*  80  165:getfield        #183 <Field int codecReinitializationState>
	//*  81  168:iconst_2        
	//*  82  169:icmpne          178
	//*  83  172:aload_0         
	//*  84  173:invokespecial   #293 <Method void processEndOfStream()>
	//*  85  176:iconst_1        
	//*  86  177:ireturn         
	//*  87  178:iconst_0        
	//*  88  179:ireturn         
	//*  89  180:aload_0         
	//*  90  181:getfield        #314 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
	//*  91  184:ifeq            209
	//*  92  187:aload_0         
	//*  93  188:iconst_0        
	//*  94  189:putfield        #314 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
	//*  95  192:aload_0         
	//*  96  193:getfield        #280 <Field MediaCodec codec>
	//*  97  196:iload           5
	//*  98  198:iconst_0        
	//*  99  199:invokevirtual   #318 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
	//* 100  202:aload_0         
	//* 101  203:iconst_m1       
	//* 102  204:putfield        #274 <Field int outputIndex>
	//* 103  207:iconst_1        
	//* 104  208:ireturn         
	//* 105  209:aload_0         
	//* 106  210:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 107  213:getfield        #321 <Field int android.media.MediaCodec$BufferInfo.flags>
	//* 108  216:iconst_4        
	//* 109  217:iand            
	//* 110  218:ifeq            227
	//* 111  221:aload_0         
	//* 112  222:invokespecial   #293 <Method void processEndOfStream()>
	//* 113  225:iconst_0        
	//* 114  226:ireturn         
	//* 115  227:aload_0         
	//* 116  228:aload_0         
	//* 117  229:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 118  232:getfield        #324 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 119  235:invokespecial   #328 <Method int getDecodeOnlyIndex(long)>
	//* 120  238:istore          5
	//* 121  240:aload_0         
	//* 122  241:getfield        #276 <Field boolean codecNeedsEosOutputExceptionWorkaround>
	//* 123  244:ifeq            333
	//* 124  247:aload_0         
	//* 125  248:getfield        #278 <Field boolean codecReceivedEos>
	//* 126  251:ifeq            333
	//* 127  254:aload_0         
	//* 128  255:getfield        #280 <Field MediaCodec codec>
	//* 129  258:astore          8
	//* 130  260:aload_0         
	//* 131  261:getfield        #305 <Field ByteBuffer[] outputBuffers>
	//* 132  264:aload_0         
	//* 133  265:getfield        #274 <Field int outputIndex>
	//* 134  268:aaload          
	//* 135  269:astore          9
	//* 136  271:aload_0         
	//* 137  272:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 138  275:astore          10
	//* 139  277:aload_0         
	//* 140  278:getfield        #274 <Field int outputIndex>
	//* 141  281:istore          6
	//* 142  283:iload           5
	//* 143  285:iconst_m1       
	//* 144  286:icmpeq          450
	//* 145  289:iconst_1        
	//* 146  290:istore          7
	//* 147  292:goto            295
	//* 148  295:aload_0         
	//* 149  296:lload_1         
	//* 150  297:lload_3         
	//* 151  298:aload           8
	//* 152  300:aload           9
	//* 153  302:aload           10
	//* 154  304:iload           6
	//* 155  306:iload           7
	//* 156  308:invokevirtual   #332 <Method boolean processOutputBuffer(long, long, MediaCodec, ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean)>
	//* 157  311:istore          7
	//* 158  313:goto            397
	//* 159  316:aload_0         
	//* 160  317:invokespecial   #293 <Method void processEndOfStream()>
	//* 161  320:aload_0         
	//* 162  321:getfield        #272 <Field boolean outputStreamEnded>
	//* 163  324:ifeq            331
	//* 164  327:aload_0         
	//* 165  328:invokevirtual   #296 <Method void releaseCodec()>
	//* 166  331:iconst_0        
	//* 167  332:ireturn         
	//* 168  333:aload_0         
	//* 169  334:getfield        #280 <Field MediaCodec codec>
	//* 170  337:astore          8
	//* 171  339:aload_0         
	//* 172  340:getfield        #305 <Field ByteBuffer[] outputBuffers>
	//* 173  343:astore          9
	//* 174  345:aload_0         
	//* 175  346:getfield        #274 <Field int outputIndex>
	//* 176  349:istore          6
	//* 177  351:aload           9
	//* 178  353:iload           6
	//* 179  355:aaload          
	//* 180  356:astore          9
	//* 181  358:aload_0         
	//* 182  359:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 183  362:astore          10
	//* 184  364:iload           5
	//* 185  366:iconst_m1       
	//* 186  367:icmpeq          376
	//* 187  370:iconst_1        
	//* 188  371:istore          7
	//* 189  373:goto            379
	//* 190  376:iconst_0        
	//* 191  377:istore          7
	//* 192  379:aload_0         
	//* 193  380:lload_1         
	//* 194  381:lload_3         
	//* 195  382:aload           8
	//* 196  384:aload           9
	//* 197  386:aload           10
	//* 198  388:iload           6
	//* 199  390:iload           7
	//* 200  392:invokevirtual   #332 <Method boolean processOutputBuffer(long, long, MediaCodec, ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean)>
	//* 201  395:istore          7
	//* 202  397:iload           7
	//* 203  399:ifeq            438
	//* 204  402:aload_0         
	//* 205  403:aload_0         
	//* 206  404:getfield        #179 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 207  407:getfield        #324 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 208  410:invokevirtual   #336 <Method void onProcessedOutputBuffer(long)>
	//* 209  413:iload           5
	//* 210  415:iconst_m1       
	//* 211  416:icmpeq          431
	//* 212  419:aload_0         
	//* 213  420:getfield        #174 <Field List decodeOnlyPresentationTimestamps>
	//* 214  423:iload           5
	//* 215  425:invokeinterface #340 <Method Object List.remove(int)>
	//* 216  430:pop             
	//* 217  431:aload_0         
	//* 218  432:iconst_m1       
	//* 219  433:putfield        #274 <Field int outputIndex>
	//* 220  436:iconst_1        
	//* 221  437:ireturn         
	//* 222  438:iconst_0        
	//* 223  439:ireturn         
				// Misplaced declaration of an exception variable
				catch(IllegalStateException illegalstateexception)
				{
					processEndOfStream();
					if(outputStreamEnded)
						releaseCodec();
					return false;
				}
			else
				outputIndex = codec.dequeueOutputBuffer(outputBufferInfo, getDequeueOutputBufferTimeoutUs());
		int i = outputIndex;
		if(i == -2)
		{
			processOutputFormat();
			return true;
		}
		if(i == -3)
		{
			outputBuffers = codec.getOutputBuffers();
			CodecCounters codeccounters = codecCounters;
			codeccounters.outputBuffersChangedCount = codeccounters.outputBuffersChangedCount + 1;
			return true;
		}
		if(i < 0)
			if(codecNeedsEosPropagationWorkaround && (inputStreamEnded || codecReinitializationState == 2))
			{
				processEndOfStream();
				return true;
			} else
			{
				return false;
			}
		if(shouldSkipAdaptationWorkaroundOutputBuffer)
		{
			shouldSkipAdaptationWorkaroundOutputBuffer = false;
			codec.releaseOutputBuffer(i, false);
			outputIndex = -1;
			return true;
		}
		if((outputBufferInfo.flags & 4) != 0)
		{
			processEndOfStream();
			return false;
		}
		i = getDecodeOnlyIndex(outputBufferInfo.presentationTimeUs);
		if(!codecNeedsEosOutputExceptionWorkaround || !codecReceivedEos)
			break MISSING_BLOCK_LABEL_333;
		int j;
		boolean flag;
		MediaCodec mediacodec;
		ByteBuffer bytebuffer;
		android.media.MediaCodec.BufferInfo bufferinfo;
		try
		{
			mediacodec = codec;
			bytebuffer = outputBuffers[outputIndex];
			bufferinfo = outputBufferInfo;
			j = outputIndex;
		}
	//* 224  440:astore          8
	//* 225  442:goto            52
		// Misplaced declaration of an exception variable
		catch(IllegalStateException illegalstateexception)
		{
			processEndOfStream();
			if(outputStreamEnded)
				releaseCodec();
			return false;
		}
		IllegalStateException illegalstateexception;
		ByteBuffer abytebuffer[];
		if(i != -1)
			flag = true;
		else
	//* 226  445:astore          8
	//* 227  447:goto            316
			flag = false;
	//  228  450:iconst_0        
	//  229  451:istore          7
		flag = processOutputBuffer(l, l1, mediacodec, bytebuffer, bufferinfo, j, flag);
		break MISSING_BLOCK_LABEL_397;
		mediacodec = codec;
		abytebuffer = outputBuffers;
		j = outputIndex;
		abytebuffer = ((ByteBuffer []) (abytebuffer[j]));
		bufferinfo = outputBufferInfo;
		if(i != -1)
			flag = true;
		else
			flag = false;
		flag = processOutputBuffer(l, l1, mediacodec, ((ByteBuffer) (abytebuffer)), bufferinfo, j, flag);
		if(flag)
		{
			onProcessedOutputBuffer(outputBufferInfo.presentationTimeUs);
			if(i != -1)
				decodeOnlyPresentationTimestamps.remove(i);
			outputIndex = -1;
			return true;
		} else
		{
			return false;
		}
	//* 230  453:goto            295
	}

	private boolean feedInputBuffer(long l, boolean flag)
		throws ExoPlaybackException
	{
		if(inputStreamEnded)
			break MISSING_BLOCK_LABEL_750;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field boolean inputStreamEnded>
	//    2    4:ifne            750
		if(codecReinitializationState == 2)
	//*   3    7:aload_0         
	//*   4    8:getfield        #183 <Field int codecReinitializationState>
	//*   5   11:iconst_2        
	//*   6   12:icmpne          17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(inputIndex < 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #347 <Field int inputIndex>
	//*  11   21:ifge            72
		{
			inputIndex = codec.dequeueInputBuffer(0L);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #280 <Field MediaCodec codec>
	//   15   29:lconst_0        
	//   16   30:invokevirtual   #350 <Method int MediaCodec.dequeueInputBuffer(long)>
	//   17   33:putfield        #347 <Field int inputIndex>
			int i = inputIndex;
	//   18   36:aload_0         
	//   19   37:getfield        #347 <Field int inputIndex>
	//   20   40:istore          4
			if(i < 0)
	//*  21   42:iload           4
	//*  22   44:ifge            49
				return false;
	//   23   47:iconst_0        
	//   24   48:ireturn         
			SampleHolder sampleholder = sampleHolder;
	//   25   49:aload_0         
	//   26   50:getfield        #164 <Field SampleHolder sampleHolder>
	//   27   53:astore          6
			sampleholder.data = inputBuffers[i];
	//   28   55:aload           6
	//   29   57:aload_0         
	//   30   58:getfield        #352 <Field ByteBuffer[] inputBuffers>
	//   31   61:iload           4
	//   32   63:aaload          
	//   33   64:putfield        #356 <Field ByteBuffer SampleHolder.data>
			sampleholder.clearData();
	//   34   67:aload           6
	//   35   69:invokevirtual   #359 <Method void SampleHolder.clearData()>
		}
		if(codecReinitializationState == 1)
	//*  36   72:aload_0         
	//*  37   73:getfield        #183 <Field int codecReinitializationState>
	//*  38   76:iconst_1        
	//*  39   77:icmpne          122
		{
			if(!codecNeedsEosPropagationWorkaround)
	//*  40   80:aload_0         
	//*  41   81:getfield        #310 <Field boolean codecNeedsEosPropagationWorkaround>
	//*  42   84:ifeq            90
	//*  43   87:goto            115
			{
				codecReceivedEos = true;
	//   44   90:aload_0         
	//   45   91:iconst_1        
	//   46   92:putfield        #278 <Field boolean codecReceivedEos>
				codec.queueInputBuffer(inputIndex, 0, 0, 0L, 4);
	//   47   95:aload_0         
	//   48   96:getfield        #280 <Field MediaCodec codec>
	//   49   99:aload_0         
	//   50  100:getfield        #347 <Field int inputIndex>
	//   51  103:iconst_0        
	//   52  104:iconst_0        
	//   53  105:lconst_0        
	//   54  106:iconst_4        
	//   55  107:invokevirtual   #363 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
				inputIndex = -1;
	//   56  110:aload_0         
	//   57  111:iconst_m1       
	//   58  112:putfield        #347 <Field int inputIndex>
			}
			codecReinitializationState = 2;
	//   59  115:aload_0         
	//   60  116:iconst_2        
	//   61  117:putfield        #183 <Field int codecReinitializationState>
			return false;
	//   62  120:iconst_0        
	//   63  121:ireturn         
		}
		if(codecNeedsAdaptationWorkaroundBuffer)
	//*  64  122:aload_0         
	//*  65  123:getfield        #365 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
	//*  66  126:ifeq            178
		{
			codecNeedsAdaptationWorkaroundBuffer = false;
	//   67  129:aload_0         
	//   68  130:iconst_0        
	//   69  131:putfield        #365 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
			sampleHolder.data.put(ADAPTATION_WORKAROUND_BUFFER);
	//   70  134:aload_0         
	//   71  135:getfield        #164 <Field SampleHolder sampleHolder>
	//   72  138:getfield        #356 <Field ByteBuffer SampleHolder.data>
	//   73  141:getstatic       #108 <Field byte[] ADAPTATION_WORKAROUND_BUFFER>
	//   74  144:invokevirtual   #371 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   75  147:pop             
			codec.queueInputBuffer(inputIndex, 0, ADAPTATION_WORKAROUND_BUFFER.length, 0L, 0);
	//   76  148:aload_0         
	//   77  149:getfield        #280 <Field MediaCodec codec>
	//   78  152:aload_0         
	//   79  153:getfield        #347 <Field int inputIndex>
	//   80  156:iconst_0        
	//   81  157:getstatic       #108 <Field byte[] ADAPTATION_WORKAROUND_BUFFER>
	//   82  160:arraylength     
	//   83  161:lconst_0        
	//   84  162:iconst_0        
	//   85  163:invokevirtual   #363 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
			inputIndex = -1;
	//   86  166:aload_0         
	//   87  167:iconst_m1       
	//   88  168:putfield        #347 <Field int inputIndex>
			codecReceivedBuffers = true;
	//   89  171:aload_0         
	//   90  172:iconst_1        
	//   91  173:putfield        #373 <Field boolean codecReceivedBuffers>
			return true;
	//   92  176:iconst_1        
	//   93  177:ireturn         
		}
		int j;
		if(waitingForKeys)
	//*  94  178:aload_0         
	//*  95  179:getfield        #375 <Field boolean waitingForKeys>
	//*  96  182:ifeq            192
		{
			j = -3;
	//   97  185:bipush          -3
	//   98  187:istore          4
		} else
	//*  99  189:goto            321
		{
			if(codecReconfigurationState == 1)
	//* 100  192:aload_0         
	//* 101  193:getfield        #181 <Field int codecReconfigurationState>
	//* 102  196:iconst_1        
	//* 103  197:icmpne          266
			{
				for(j = 0; j < format.initializationData.size(); j++)
	//* 104  200:iconst_0        
	//* 105  201:istore          4
	//* 106  203:iload           4
	//* 107  205:aload_0         
	//* 108  206:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//* 109  209:getfield        #215 <Field List MediaFormat.initializationData>
	//* 110  212:invokeinterface #381 <Method int List.size()>
	//* 111  217:icmpge          261
				{
					byte abyte0[] = (byte[])format.initializationData.get(j);
	//  112  220:aload_0         
	//  113  221:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//  114  224:getfield        #215 <Field List MediaFormat.initializationData>
	//  115  227:iload           4
	//  116  229:invokeinterface #384 <Method Object List.get(int)>
	//  117  234:checkcast       #385 <Class byte[]>
	//  118  237:astore          6
					sampleHolder.data.put(abyte0);
	//  119  239:aload_0         
	//  120  240:getfield        #164 <Field SampleHolder sampleHolder>
	//  121  243:getfield        #356 <Field ByteBuffer SampleHolder.data>
	//  122  246:aload           6
	//  123  248:invokevirtual   #371 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  124  251:pop             
				}

	//  125  252:iload           4
	//  126  254:iconst_1        
	//  127  255:iadd            
	//  128  256:istore          4
	//* 129  258:goto            203
				codecReconfigurationState = 2;
	//  130  261:aload_0         
	//  131  262:iconst_2        
	//  132  263:putfield        #181 <Field int codecReconfigurationState>
			}
			int i1 = readSource(l, formatHolder, sampleHolder);
	//  133  266:aload_0         
	//  134  267:lload_1         
	//  135  268:aload_0         
	//  136  269:getfield        #169 <Field MediaFormatHolder formatHolder>
	//  137  272:aload_0         
	//  138  273:getfield        #164 <Field SampleHolder sampleHolder>
	//  139  276:invokevirtual   #389 <Method int readSource(long, MediaFormatHolder, SampleHolder)>
	//  140  279:istore          5
			j = i1;
	//  141  281:iload           5
	//  142  283:istore          4
			if(flag)
	//* 143  285:iload_3         
	//* 144  286:ifeq            321
			{
				j = i1;
	//  145  289:iload           5
	//  146  291:istore          4
				if(sourceState == 1)
	//* 147  293:aload_0         
	//* 148  294:getfield        #391 <Field int sourceState>
	//* 149  297:iconst_1        
	//* 150  298:icmpne          321
				{
					j = i1;
	//  151  301:iload           5
	//  152  303:istore          4
					if(i1 == -2)
	//* 153  305:iload           5
	//* 154  307:bipush          -2
	//* 155  309:icmpne          321
					{
						sourceState = 2;
	//  156  312:aload_0         
	//  157  313:iconst_2        
	//  158  314:putfield        #391 <Field int sourceState>
						j = i1;
	//  159  317:iload           5
	//  160  319:istore          4
					}
				}
			}
		}
		if(j == -2)
	//* 161  321:iload           4
	//* 162  323:bipush          -2
	//* 163  325:icmpne          330
			return false;
	//  164  328:iconst_0        
	//  165  329:ireturn         
		if(j == -4)
	//* 166  330:iload           4
	//* 167  332:bipush          -4
	//* 168  334:icmpne          367
		{
			if(codecReconfigurationState == 2)
	//* 169  337:aload_0         
	//* 170  338:getfield        #181 <Field int codecReconfigurationState>
	//* 171  341:iconst_2        
	//* 172  342:icmpne          357
			{
				sampleHolder.clearData();
	//  173  345:aload_0         
	//  174  346:getfield        #164 <Field SampleHolder sampleHolder>
	//  175  349:invokevirtual   #359 <Method void SampleHolder.clearData()>
				codecReconfigurationState = 1;
	//  176  352:aload_0         
	//  177  353:iconst_1        
	//  178  354:putfield        #181 <Field int codecReconfigurationState>
			}
			onInputFormatChanged(formatHolder);
	//  179  357:aload_0         
	//  180  358:aload_0         
	//  181  359:getfield        #169 <Field MediaFormatHolder formatHolder>
	//  182  362:invokevirtual   #395 <Method void onInputFormatChanged(MediaFormatHolder)>
			return true;
	//  183  365:iconst_1        
	//  184  366:ireturn         
		}
		if(j != -1)
			break MISSING_BLOCK_LABEL_465;
	//  185  367:iload           4
	//  186  369:iconst_m1       
	//  187  370:icmpne          465
		if(codecReconfigurationState == 2)
	//* 188  373:aload_0         
	//* 189  374:getfield        #181 <Field int codecReconfigurationState>
	//* 190  377:iconst_2        
	//* 191  378:icmpne          393
		{
			sampleHolder.clearData();
	//  192  381:aload_0         
	//  193  382:getfield        #164 <Field SampleHolder sampleHolder>
	//  194  385:invokevirtual   #359 <Method void SampleHolder.clearData()>
			codecReconfigurationState = 1;
	//  195  388:aload_0         
	//  196  389:iconst_1        
	//  197  390:putfield        #181 <Field int codecReconfigurationState>
		}
		inputStreamEnded = true;
	//  198  393:aload_0         
	//  199  394:iconst_1        
	//  200  395:putfield        #312 <Field boolean inputStreamEnded>
		if(!codecReceivedBuffers)
	//* 201  398:aload_0         
	//* 202  399:getfield        #373 <Field boolean codecReceivedBuffers>
	//* 203  402:ifne            411
		{
			processEndOfStream();
	//  204  405:aload_0         
	//  205  406:invokespecial   #293 <Method void processEndOfStream()>
			return false;
	//  206  409:iconst_0        
	//  207  410:ireturn         
		}
		if(codecNeedsEosPropagationWorkaround)
	//* 208  411:aload_0         
	//* 209  412:getfield        #310 <Field boolean codecNeedsEosPropagationWorkaround>
	//* 210  415:ifeq            420
			return false;
	//  211  418:iconst_0        
	//  212  419:ireturn         
		try
		{
			codecReceivedEos = true;
	//  213  420:aload_0         
	//  214  421:iconst_1        
	//  215  422:putfield        #278 <Field boolean codecReceivedEos>
			codec.queueInputBuffer(inputIndex, 0, 0, 0L, 4);
	//  216  425:aload_0         
	//  217  426:getfield        #280 <Field MediaCodec codec>
	//  218  429:aload_0         
	//  219  430:getfield        #347 <Field int inputIndex>
	//  220  433:iconst_0        
	//  221  434:iconst_0        
	//  222  435:lconst_0        
	//  223  436:iconst_4        
	//  224  437:invokevirtual   #363 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
			inputIndex = -1;
	//  225  440:aload_0         
	//  226  441:iconst_m1       
	//  227  442:putfield        #347 <Field int inputIndex>
		}
	//* 228  445:iconst_0        
	//* 229  446:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception)
	//* 230  447:astore          6
		{
			notifyCryptoError(cryptoexception);
	//  231  449:aload_0         
	//  232  450:aload           6
	//  233  452:invokespecial   #399 <Method void notifyCryptoError(android.media.MediaCodec$CryptoException)>
			throw new ExoPlaybackException(((Throwable) (cryptoexception)));
	//  234  455:new             #268 <Class ExoPlaybackException>
	//  235  458:dup             
	//  236  459:aload           6
	//  237  461:invokespecial   #402 <Method void ExoPlaybackException(Throwable)>
	//  238  464:athrow          
		}
		return false;
		if(waitingForFirstSyncFrame)
	//* 239  465:aload_0         
	//* 240  466:getfield        #404 <Field boolean waitingForFirstSyncFrame>
	//* 241  469:ifeq            509
		{
			if(!sampleHolder.isSyncFrame())
	//* 242  472:aload_0         
	//* 243  473:getfield        #164 <Field SampleHolder sampleHolder>
	//* 244  476:invokevirtual   #407 <Method boolean SampleHolder.isSyncFrame()>
	//* 245  479:ifne            504
			{
				sampleHolder.clearData();
	//  246  482:aload_0         
	//  247  483:getfield        #164 <Field SampleHolder sampleHolder>
	//  248  486:invokevirtual   #359 <Method void SampleHolder.clearData()>
				if(codecReconfigurationState == 2)
	//* 249  489:aload_0         
	//* 250  490:getfield        #181 <Field int codecReconfigurationState>
	//* 251  493:iconst_2        
	//* 252  494:icmpne          502
					codecReconfigurationState = 1;
	//  253  497:aload_0         
	//  254  498:iconst_1        
	//  255  499:putfield        #181 <Field int codecReconfigurationState>
				return true;
	//  256  502:iconst_1        
	//  257  503:ireturn         
			}
			waitingForFirstSyncFrame = false;
	//  258  504:aload_0         
	//  259  505:iconst_0        
	//  260  506:putfield        #404 <Field boolean waitingForFirstSyncFrame>
		}
		flag = sampleHolder.isEncrypted();
	//  261  509:aload_0         
	//  262  510:getfield        #164 <Field SampleHolder sampleHolder>
	//  263  513:invokevirtual   #410 <Method boolean SampleHolder.isEncrypted()>
	//  264  516:istore_3        
		waitingForKeys = shouldWaitForKeys(flag);
	//  265  517:aload_0         
	//  266  518:aload_0         
	//  267  519:iload_3         
	//  268  520:invokespecial   #414 <Method boolean shouldWaitForKeys(boolean)>
	//  269  523:putfield        #375 <Field boolean waitingForKeys>
		if(waitingForKeys)
	//* 270  526:aload_0         
	//* 271  527:getfield        #375 <Field boolean waitingForKeys>
	//* 272  530:ifeq            535
			return false;
	//  273  533:iconst_0        
	//  274  534:ireturn         
		if(codecNeedsDiscardToSpsWorkaround && !flag)
	//* 275  535:aload_0         
	//* 276  536:getfield        #416 <Field boolean codecNeedsDiscardToSpsWorkaround>
	//* 277  539:ifeq            576
	//* 278  542:iload_3         
	//* 279  543:ifne            576
		{
			NalUnitUtil.discardToSps(sampleHolder.data);
	//  280  546:aload_0         
	//  281  547:getfield        #164 <Field SampleHolder sampleHolder>
	//  282  550:getfield        #356 <Field ByteBuffer SampleHolder.data>
	//  283  553:invokestatic    #422 <Method void NalUnitUtil.discardToSps(ByteBuffer)>
			if(sampleHolder.data.position() == 0)
	//* 284  556:aload_0         
	//* 285  557:getfield        #164 <Field SampleHolder sampleHolder>
	//* 286  560:getfield        #356 <Field ByteBuffer SampleHolder.data>
	//* 287  563:invokevirtual   #425 <Method int ByteBuffer.position()>
	//* 288  566:ifne            571
				return true;
	//  289  569:iconst_1        
	//  290  570:ireturn         
			codecNeedsDiscardToSpsWorkaround = false;
	//  291  571:aload_0         
	//  292  572:iconst_0        
	//  293  573:putfield        #416 <Field boolean codecNeedsDiscardToSpsWorkaround>
		}
		int k;
		int j1;
		Object obj;
		try
		{
			k = sampleHolder.data.position();
	//  294  576:aload_0         
	//  295  577:getfield        #164 <Field SampleHolder sampleHolder>
	//  296  580:getfield        #356 <Field ByteBuffer SampleHolder.data>
	//  297  583:invokevirtual   #425 <Method int ByteBuffer.position()>
	//  298  586:istore          4
			j1 = sampleHolder.size;
	//  299  588:aload_0         
	//  300  589:getfield        #164 <Field SampleHolder sampleHolder>
	//  301  592:getfield        #427 <Field int SampleHolder.size>
	//  302  595:istore          5
			l = sampleHolder.timeUs;
	//  303  597:aload_0         
	//  304  598:getfield        #164 <Field SampleHolder sampleHolder>
	//  305  601:getfield        #430 <Field long SampleHolder.timeUs>
	//  306  604:lstore_1        
			if(sampleHolder.isDecodeOnly())
	//* 307  605:aload_0         
	//* 308  606:getfield        #164 <Field SampleHolder sampleHolder>
	//* 309  609:invokevirtual   #433 <Method boolean SampleHolder.isDecodeOnly()>
	//* 310  612:ifeq            629
				decodeOnlyPresentationTimestamps.add(((Object) (Long.valueOf(l))));
	//  311  615:aload_0         
	//  312  616:getfield        #174 <Field List decodeOnlyPresentationTimestamps>
	//  313  619:lload_1         
	//  314  620:invokestatic    #439 <Method Long Long.valueOf(long)>
	//  315  623:invokeinterface #442 <Method boolean List.add(Object)>
	//  316  628:pop             
			onQueuedInputBuffer(l, sampleHolder.data, k, flag);
	//  317  629:aload_0         
	//  318  630:lload_1         
	//  319  631:aload_0         
	//  320  632:getfield        #164 <Field SampleHolder sampleHolder>
	//  321  635:getfield        #356 <Field ByteBuffer SampleHolder.data>
	//  322  638:iload           4
	//  323  640:iload_3         
	//  324  641:invokevirtual   #446 <Method void onQueuedInputBuffer(long, ByteBuffer, int, boolean)>
		}
	//* 325  644:iload_3         
	//* 326  645:ifeq            681
	//* 327  648:aload_0         
	//* 328  649:getfield        #164 <Field SampleHolder sampleHolder>
	//* 329  652:iload           4
	//* 330  654:iload           5
	//* 331  656:isub            
	//* 332  657:invokestatic    #450 <Method android.media.MediaCodec$CryptoInfo getFrameworkCryptoInfo(SampleHolder, int)>
	//* 333  660:astore          6
	//* 334  662:aload_0         
	//* 335  663:getfield        #280 <Field MediaCodec codec>
	//* 336  666:aload_0         
	//* 337  667:getfield        #347 <Field int inputIndex>
	//* 338  670:iconst_0        
	//* 339  671:aload           6
	//* 340  673:lload_1         
	//* 341  674:iconst_0        
	//* 342  675:invokevirtual   #454 <Method void MediaCodec.queueSecureInputBuffer(int, int, android.media.MediaCodec$CryptoInfo, long, int)>
	//* 343  678:goto            697
	//* 344  681:aload_0         
	//* 345  682:getfield        #280 <Field MediaCodec codec>
	//* 346  685:aload_0         
	//* 347  686:getfield        #347 <Field int inputIndex>
	//* 348  689:iconst_0        
	//* 349  690:iload           4
	//* 350  692:lload_1         
	//* 351  693:iconst_0        
	//* 352  694:invokevirtual   #363 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
	//* 353  697:aload_0         
	//* 354  698:iconst_m1       
	//* 355  699:putfield        #347 <Field int inputIndex>
	//* 356  702:aload_0         
	//* 357  703:iconst_1        
	//* 358  704:putfield        #373 <Field boolean codecReceivedBuffers>
	//* 359  707:aload_0         
	//* 360  708:iconst_0        
	//* 361  709:putfield        #181 <Field int codecReconfigurationState>
	//* 362  712:aload_0         
	//* 363  713:getfield        #157 <Field CodecCounters codecCounters>
	//* 364  716:astore          6
	//* 365  718:aload           6
	//* 366  720:aload           6
	//* 367  722:getfield        #457 <Field int CodecCounters.inputBufferCount>
	//* 368  725:iconst_1        
	//* 369  726:iadd            
	//* 370  727:putfield        #457 <Field int CodecCounters.inputBufferCount>
	//* 371  730:iconst_1        
	//* 372  731:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception1)
	//* 373  732:astore          6
		{
			notifyCryptoError(cryptoexception1);
	//  374  734:aload_0         
	//  375  735:aload           6
	//  376  737:invokespecial   #399 <Method void notifyCryptoError(android.media.MediaCodec$CryptoException)>
			throw new ExoPlaybackException(((Throwable) (cryptoexception1)));
	//  377  740:new             #268 <Class ExoPlaybackException>
	//  378  743:dup             
	//  379  744:aload           6
	//  380  746:invokespecial   #402 <Method void ExoPlaybackException(Throwable)>
	//  381  749:athrow          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_681;
		obj = ((Object) (getFrameworkCryptoInfo(sampleHolder, k - j1)));
		codec.queueSecureInputBuffer(inputIndex, 0, ((android.media.MediaCodec.CryptoInfo) (obj)), l, 0);
		break MISSING_BLOCK_LABEL_697;
		codec.queueInputBuffer(inputIndex, 0, k, l, 0);
		inputIndex = -1;
		codecReceivedBuffers = true;
		codecReconfigurationState = 0;
		obj = ((Object) (codecCounters));
		obj.inputBufferCount = ((CodecCounters) (obj)).inputBufferCount + 1;
		return true;
		return false;
	//  382  750:iconst_0        
	//  383  751:ireturn         
	}

	private int getDecodeOnlyIndex(long l)
	{
		int j = decodeOnlyPresentationTimestamps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field List decodeOnlyPresentationTimestamps>
	//    2    4:invokeinterface #381 <Method int List.size()>
	//    3    9:istore          4
		for(int i = 0; i < j; i++)
	//*   4   11:iconst_0        
	//*   5   12:istore_3        
	//*   6   13:iload_3         
	//*   7   14:iload           4
	//*   8   16:icmpge          49
			if(((Long)decodeOnlyPresentationTimestamps.get(i)).longValue() == l)
	//*   9   19:aload_0         
	//*  10   20:getfield        #174 <Field List decodeOnlyPresentationTimestamps>
	//*  11   23:iload_3         
	//*  12   24:invokeinterface #384 <Method Object List.get(int)>
	//*  13   29:checkcast       #435 <Class Long>
	//*  14   32:invokevirtual   #460 <Method long Long.longValue()>
	//*  15   35:lload_1         
	//*  16   36:lcmp            
	//*  17   37:ifne            42
				return i;
	//   18   40:iload_3         
	//   19   41:ireturn         

	//   20   42:iload_3         
	//   21   43:iconst_1        
	//   22   44:iadd            
	//   23   45:istore_3        
	//*  24   46:goto            13
		return -1;
	//   25   49:iconst_m1       
	//   26   50:ireturn         
	}

	private static android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfo(SampleHolder sampleholder, int i)
	{
		sampleholder = ((SampleHolder) (sampleholder.cryptoInfo.getFrameworkCryptoInfoV16()));
	//    0    0:aload_0         
	//    1    1:getfield        #464 <Field CryptoInfo SampleHolder.cryptoInfo>
	//    2    4:invokevirtual   #470 <Method android.media.MediaCodec$CryptoInfo CryptoInfo.getFrameworkCryptoInfoV16()>
	//    3    7:astore_0        
		if(i == 0)
	//*   4    8:iload_1         
	//*   5    9:ifne            14
			return ((android.media.MediaCodec.CryptoInfo) (sampleholder));
	//    6   12:aload_0         
	//    7   13:areturn         
		if(((android.media.MediaCodec.CryptoInfo) (sampleholder)).numBytesOfClearData == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #476 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//*  10   18:ifnonnull       28
			sampleholder.numBytesOfClearData = new int[1];
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:newarray        int[]
	//   14   25:putfield        #476 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
		int ai[] = ((android.media.MediaCodec.CryptoInfo) (sampleholder)).numBytesOfClearData;
	//   15   28:aload_0         
	//   16   29:getfield        #476 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//   17   32:astore_2        
		ai[0] = ai[0] + i;
	//   18   33:aload_2         
	//   19   34:iconst_0        
	//   20   35:aload_2         
	//   21   36:iconst_0        
	//   22   37:iaload          
	//   23   38:iload_1         
	//   24   39:iadd            
	//   25   40:iastore         
		return ((android.media.MediaCodec.CryptoInfo) (sampleholder));
	//   26   41:aload_0         
	//   27   42:areturn         
	}

	private MediaFormat getFrameworkMediaFormat(com.google.android.exoplayer.MediaFormat mediaformat)
	{
		mediaformat = ((com.google.android.exoplayer.MediaFormat) (mediaformat.getFrameworkMediaFormatV16()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #482 <Method MediaFormat MediaFormat.getFrameworkMediaFormatV16()>
	//    2    4:astore_1        
		if(deviceNeedsAutoFrcWorkaround)
	//*   3    5:aload_0         
	//*   4    6:getfield        #151 <Field boolean deviceNeedsAutoFrcWorkaround>
	//*   5    9:ifeq            20
			((MediaFormat) (mediaformat)).setInteger("auto-frc", 0);
	//    6   12:aload_1         
	//    7   13:ldc2            #484 <String "auto-frc">
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #490 <Method void MediaFormat.setInteger(String, int)>
		return ((MediaFormat) (mediaformat));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	private boolean isWithinHotswapPeriod()
	{
		return SystemClock.elapsedRealtime() < codecHotswapTimeMs + 1000L;
	//    0    0:invokestatic    #496 <Method long SystemClock.elapsedRealtime()>
	//    1    3:aload_0         
	//    2    4:getfield        #498 <Field long codecHotswapTimeMs>
	//    3    7:ldc2w           #27  <Long 1000L>
	//    4   10:ladd            
	//    5   11:lcmp            
	//    6   12:ifge            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private void notifyAndThrowDecoderInitError(DecoderInitializationException decoderinitializationexception)
		throws ExoPlaybackException
	{
		notifyDecoderInitializationError(decoderinitializationexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #503 <Method void notifyDecoderInitializationError(MediaCodecTrackRenderer$DecoderInitializationException)>
		throw new ExoPlaybackException(((Throwable) (decoderinitializationexception)));
	//    3    5:new             #268 <Class ExoPlaybackException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #402 <Method void ExoPlaybackException(Throwable)>
	//    7   13:athrow          
	}

	private void notifyCryptoError(final android.media.MediaCodec.CryptoException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #146 <Field MediaCodecTrackRenderer$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onCryptoError(e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MediaCodecTrackRenderer this$0>
				//    2    4:invokestatic    #30  <Method MediaCodecTrackRenderer$EventListener MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field android.media.MediaCodec$CryptoException val$e>
				//    5   11:invokeinterface #35  <Method void MediaCodecTrackRenderer$EventListener.onCryptoError(android.media.MediaCodec$CryptoException)>
				//    6   16:return          
				}

				final MediaCodecTrackRenderer this$0;
				final android.media.MediaCodec.CryptoException val$e;

			
			{
				this$0 = MediaCodecTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaCodecTrackRenderer this$0>
				e = cryptoexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.media.MediaCodec$CryptoException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #8   <Class MediaCodecTrackRenderer$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #506 <Method void MediaCodecTrackRenderer$2(MediaCodecTrackRenderer, android.media.MediaCodec$CryptoException)>
	//   14   26:invokevirtual   #512 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyDecoderInitializationError(final DecoderInitializationException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #146 <Field MediaCodecTrackRenderer$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onDecoderInitializationError(e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MediaCodecTrackRenderer this$0>
				//    2    4:invokestatic    #30  <Method MediaCodecTrackRenderer$EventListener MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field MediaCodecTrackRenderer$DecoderInitializationException val$e>
				//    5   11:invokeinterface #35  <Method void MediaCodecTrackRenderer$EventListener.onDecoderInitializationError(MediaCodecTrackRenderer$DecoderInitializationException)>
				//    6   16:return          
				}

				final MediaCodecTrackRenderer this$0;
				final DecoderInitializationException val$e;

			
			{
				this$0 = MediaCodecTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaCodecTrackRenderer this$0>
				e = decoderinitializationexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field MediaCodecTrackRenderer$DecoderInitializationException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #6   <Class MediaCodecTrackRenderer$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #515 <Method void MediaCodecTrackRenderer$1(MediaCodecTrackRenderer, MediaCodecTrackRenderer$DecoderInitializationException)>
	//   14   26:invokevirtual   #512 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyDecoderInitialized(final String decoderName, final long initializedTimestamp, final long initializationDuration)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Handler eventHandler>
	//    2    4:astore          6
		if(handler != null && eventListener != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          36
	//*   5   11:aload_0         
	//*   6   12:getfield        #146 <Field MediaCodecTrackRenderer$EventListener eventListener>
	//*   7   15:ifnull          36
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onDecoderInitialized(decoderName, initializedTimestamp, initializationDuration);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field MediaCodecTrackRenderer this$0>
				//    2    4:invokestatic    #37  <Method MediaCodecTrackRenderer$EventListener MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field String val$decoderName>
				//    5   11:aload_0         
				//    6   12:getfield        #26  <Field long val$initializedTimestamp>
				//    7   15:aload_0         
				//    8   16:getfield        #28  <Field long val$initializationDuration>
				//    9   19:invokeinterface #42  <Method void MediaCodecTrackRenderer$EventListener.onDecoderInitialized(String, long, long)>
				//   10   24:return          
				}

				final MediaCodecTrackRenderer this$0;
				final String val$decoderName;
				final long val$initializationDuration;
				final long val$initializedTimestamp;

			
			{
				this$0 = MediaCodecTrackRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaCodecTrackRenderer this$0>
				decoderName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$decoderName>
				initializedTimestamp = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #26  <Field long val$initializedTimestamp>
				initializationDuration = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #28  <Field long val$initializationDuration>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    8   18:aload           6
	//    9   20:new             #10  <Class MediaCodecTrackRenderer$3>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:lload_2         
	//   14   27:lload           4
	//   15   29:invokespecial   #520 <Method void MediaCodecTrackRenderer$3(MediaCodecTrackRenderer, String, long, long)>
	//   16   32:invokevirtual   #512 <Method boolean Handler.post(Runnable)>
	//   17   35:pop             
	//   18   36:return          
	}

	private void processEndOfStream()
		throws ExoPlaybackException
	{
		if(codecReinitializationState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field int codecReinitializationState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          17
		{
			releaseCodec();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #296 <Method void releaseCodec()>
			maybeInitCodec();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #523 <Method void maybeInitCodec()>
			return;
	//    8   16:return          
		} else
		{
			outputStreamEnded = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #272 <Field boolean outputStreamEnded>
			onOutputStreamEnded();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #526 <Method void onOutputStreamEnded()>
			return;
	//   14   26:return          
		}
	}

	private void processOutputFormat()
		throws ExoPlaybackException
	{
		Object obj = ((Object) (codec.getOutputFormat()));
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field MediaCodec codec>
	//    2    4:invokevirtual   #529 <Method MediaFormat MediaCodec.getOutputFormat()>
	//    3    7:astore_1        
		if(codecNeedsAdaptationWorkaround && ((MediaFormat) (obj)).getInteger("width") == 32 && ((MediaFormat) (obj)).getInteger("height") == 32)
	//*   4    8:aload_0         
	//*   5    9:getfield        #531 <Field boolean codecNeedsAdaptationWorkaround>
	//*   6   12:ifeq            45
	//*   7   15:aload_1         
	//*   8   16:ldc2            #533 <String "width">
	//*   9   19:invokevirtual   #537 <Method int MediaFormat.getInteger(String)>
	//*  10   22:bipush          32
	//*  11   24:icmpne          45
	//*  12   27:aload_1         
	//*  13   28:ldc2            #539 <String "height">
	//*  14   31:invokevirtual   #537 <Method int MediaFormat.getInteger(String)>
	//*  15   34:bipush          32
	//*  16   36:icmpne          45
		{
			shouldSkipAdaptationWorkaroundOutputBuffer = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #314 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
			return;
	//   20   44:return          
		}
		if(codecNeedsMonoChannelCountWorkaround)
	//*  21   45:aload_0         
	//*  22   46:getfield        #541 <Field boolean codecNeedsMonoChannelCountWorkaround>
	//*  23   49:ifeq            60
			((MediaFormat) (obj)).setInteger("channel-count", 1);
	//   24   52:aload_1         
	//   25   53:ldc2            #543 <String "channel-count">
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #490 <Method void MediaFormat.setInteger(String, int)>
		onOutputFormatChanged(codec, ((MediaFormat) (obj)));
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #280 <Field MediaCodec codec>
	//   31   65:aload_1         
	//   32   66:invokevirtual   #547 <Method void onOutputFormatChanged(MediaCodec, MediaFormat)>
		obj = ((Object) (codecCounters));
	//   33   69:aload_0         
	//   34   70:getfield        #157 <Field CodecCounters codecCounters>
	//   35   73:astore_1        
		obj.outputFormatChangedCount = ((CodecCounters) (obj)).outputFormatChangedCount + 1;
	//   36   74:aload_1         
	//   37   75:aload_1         
	//   38   76:getfield        #550 <Field int CodecCounters.outputFormatChangedCount>
	//   39   79:iconst_1        
	//   40   80:iadd            
	//   41   81:putfield        #550 <Field int CodecCounters.outputFormatChangedCount>
	//   42   84:return          
	}

	private void readFormat(long l)
		throws ExoPlaybackException
	{
		if(readSource(l, formatHolder, ((SampleHolder) (null))) == -4)
	//*   0    0:aload_0         
	//*   1    1:lload_1         
	//*   2    2:aload_0         
	//*   3    3:getfield        #169 <Field MediaFormatHolder formatHolder>
	//*   4    6:aconst_null     
	//*   5    7:invokevirtual   #389 <Method int readSource(long, MediaFormatHolder, SampleHolder)>
	//*   6   10:bipush          -4
	//*   7   12:icmpne          23
			onInputFormatChanged(formatHolder);
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #169 <Field MediaFormatHolder formatHolder>
	//   11   20:invokevirtual   #395 <Method void onInputFormatChanged(MediaFormatHolder)>
	//   12   23:return          
	}

	private boolean shouldWaitForKeys(boolean flag)
		throws ExoPlaybackException
	{
		if(!openedDrmSession)
	//*   0    0:aload_0         
	//*   1    1:getfield        #553 <Field boolean openedDrmSession>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i = drmSessionManager.getState();
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//    7   13:invokeinterface #558 <Method int DrmSessionManager.getState()>
	//    8   18:istore_2        
		if(i != 0)
	//*   9   19:iload_2         
	//*  10   20:ifeq            43
			return i != 4 && (flag || !playClearSamplesWithoutKeys);
	//   11   23:iload_2         
	//   12   24:iconst_4        
	//   13   25:icmpeq          41
	//   14   28:iload_1         
	//   15   29:ifne            39
	//   16   32:aload_0         
	//   17   33:getfield        #142 <Field boolean playClearSamplesWithoutKeys>
	//   18   36:ifne            41
	//   19   39:iconst_1        
	//   20   40:ireturn         
	//   21   41:iconst_0        
	//   22   42:ireturn         
		else
			throw new ExoPlaybackException(((Throwable) (drmSessionManager.getError())));
	//   23   43:new             #268 <Class ExoPlaybackException>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   27   51:invokeinterface #562 <Method Exception DrmSessionManager.getError()>
	//   28   56:invokespecial   #402 <Method void ExoPlaybackException(Throwable)>
	//   29   59:athrow          
	}

	protected boolean canReconfigureCodec(MediaCodec mediacodec, boolean flag, com.google.android.exoplayer.MediaFormat mediaformat, com.google.android.exoplayer.MediaFormat mediaformat1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final boolean codecInitialized()
	{
		return codec != null;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field MediaCodec codec>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected abstract void configureCodec(MediaCodec mediacodec, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto);

	protected void doSomeWork(long l, long l1, boolean flag)
		throws ExoPlaybackException
	{
		int i;
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            26
		{
			int j = sourceState;
	//    2    5:aload_0         
	//    3    6:getfield        #391 <Field int sourceState>
	//    4    9:istore          7
			i = j;
	//    5   11:iload           7
	//    6   13:istore          6
			if(j == 0)
	//*   7   15:iload           7
	//*   8   17:ifne            29
				i = 1;
	//    9   20:iconst_1        
	//   10   21:istore          6
		} else
	//*  11   23:goto            29
		{
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore          6
		}
		sourceState = i;
	//   14   29:aload_0         
	//   15   30:iload           6
	//   16   32:putfield        #391 <Field int sourceState>
		if(format == null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//*  19   39:ifnonnull       47
			readFormat(l);
	//   20   42:aload_0         
	//   21   43:lload_1         
	//   22   44:invokespecial   #571 <Method void readFormat(long)>
		maybeInitCodec();
	//   23   47:aload_0         
	//   24   48:invokevirtual   #523 <Method void maybeInitCodec()>
		if(codec != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #280 <Field MediaCodec codec>
	//*  27   55:ifnull          100
		{
			TraceUtil.beginSection("drainAndFeed");
	//   28   58:ldc2            #573 <String "drainAndFeed">
	//   29   61:invokestatic    #579 <Method void TraceUtil.beginSection(String)>
			while(drainOutputBuffer(l, l1)) ;
	//   30   64:aload_0         
	//   31   65:lload_1         
	//   32   66:lload_3         
	//   33   67:invokespecial   #581 <Method boolean drainOutputBuffer(long, long)>
	//   34   70:ifeq            76
	//*  35   73:goto            64
			if(feedInputBuffer(l, true))
	//*  36   76:aload_0         
	//*  37   77:lload_1         
	//*  38   78:iconst_1        
	//*  39   79:invokespecial   #583 <Method boolean feedInputBuffer(long, boolean)>
	//*  40   82:ifeq            97
				while(feedInputBuffer(l, false)) ;
	//   41   85:aload_0         
	//   42   86:lload_1         
	//   43   87:iconst_0        
	//   44   88:invokespecial   #583 <Method boolean feedInputBuffer(long, boolean)>
	//   45   91:ifeq            97
	//*  46   94:goto            85
			TraceUtil.endSection();
	//   47   97:invokestatic    #586 <Method void TraceUtil.endSection()>
		}
		codecCounters.ensureUpdated();
	//   48  100:aload_0         
	//   49  101:getfield        #157 <Field CodecCounters codecCounters>
	//   50  104:invokevirtual   #589 <Method void CodecCounters.ensureUpdated()>
	//   51  107:return          
	}

	protected void flushCodec()
		throws ExoPlaybackException
	{
		codecHotswapTimeMs = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #591 <Long -1L>
	//    2    4:putfield        #498 <Field long codecHotswapTimeMs>
		inputIndex = -1;
	//    3    7:aload_0         
	//    4    8:iconst_m1       
	//    5    9:putfield        #347 <Field int inputIndex>
		outputIndex = -1;
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:putfield        #274 <Field int outputIndex>
		waitingForFirstSyncFrame = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #404 <Field boolean waitingForFirstSyncFrame>
		waitingForKeys = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #375 <Field boolean waitingForKeys>
		decodeOnlyPresentationTimestamps.clear();
	//   15   27:aload_0         
	//   16   28:getfield        #174 <Field List decodeOnlyPresentationTimestamps>
	//   17   31:invokeinterface #595 <Method void List.clear()>
		codecNeedsAdaptationWorkaroundBuffer = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #365 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
		shouldSkipAdaptationWorkaroundOutputBuffer = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #314 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
		if(!codecNeedsFlushWorkaround && (!codecNeedsEosFlushWorkaround || !codecReceivedEos))
	//*  24   46:aload_0         
	//*  25   47:getfield        #597 <Field boolean codecNeedsFlushWorkaround>
	//*  26   50:ifne            103
	//*  27   53:aload_0         
	//*  28   54:getfield        #599 <Field boolean codecNeedsEosFlushWorkaround>
	//*  29   57:ifeq            70
	//*  30   60:aload_0         
	//*  31   61:getfield        #278 <Field boolean codecReceivedEos>
	//*  32   64:ifeq            70
	//*  33   67:goto            103
		{
			if(codecReinitializationState != 0)
	//*  34   70:aload_0         
	//*  35   71:getfield        #183 <Field int codecReinitializationState>
	//*  36   74:ifeq            88
			{
				releaseCodec();
	//   37   77:aload_0         
	//   38   78:invokevirtual   #296 <Method void releaseCodec()>
				maybeInitCodec();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #523 <Method void maybeInitCodec()>
			} else
	//*  41   85:goto            111
			{
				codec.flush();
	//   42   88:aload_0         
	//   43   89:getfield        #280 <Field MediaCodec codec>
	//   44   92:invokevirtual   #602 <Method void MediaCodec.flush()>
				codecReceivedBuffers = false;
	//   45   95:aload_0         
	//   46   96:iconst_0        
	//   47   97:putfield        #373 <Field boolean codecReceivedBuffers>
			}
		} else
	//*  48  100:goto            111
		{
			releaseCodec();
	//   49  103:aload_0         
	//   50  104:invokevirtual   #296 <Method void releaseCodec()>
			maybeInitCodec();
	//   51  107:aload_0         
	//   52  108:invokevirtual   #523 <Method void maybeInitCodec()>
		}
		if(codecReconfigured && format != null)
	//*  53  111:aload_0         
	//*  54  112:getfield        #604 <Field boolean codecReconfigured>
	//*  55  115:ifeq            130
	//*  56  118:aload_0         
	//*  57  119:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//*  58  122:ifnull          130
			codecReconfigurationState = 1;
	//   59  125:aload_0         
	//   60  126:iconst_1        
	//   61  127:putfield        #181 <Field int codecReconfigurationState>
	//   62  130:return          
	}

	protected DecoderInfo getDecoderInfo(MediaCodecSelector mediacodecselector, String s, boolean flag)
		throws MediaCodecUtil.DecoderQueryException
	{
		return mediacodecselector.getDecoderInfo(s, flag);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokeinterface #611 <Method DecoderInfo MediaCodecSelector.getDecoderInfo(String, boolean)>
	//    4    8:areturn         
	}

	protected long getDequeueOutputBufferTimeoutUs()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	protected final int getSourceState()
	{
		return sourceState;
	//    0    0:aload_0         
	//    1    1:getfield        #391 <Field int sourceState>
	//    2    4:ireturn         
	}

	protected abstract boolean handlesTrack(MediaCodecSelector mediacodecselector, com.google.android.exoplayer.MediaFormat mediaformat)
		throws MediaCodecUtil.DecoderQueryException;

	protected final boolean handlesTrack(com.google.android.exoplayer.MediaFormat mediaformat)
		throws MediaCodecUtil.DecoderQueryException
	{
		return handlesTrack(mediaCodecSelector, mediaformat);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #138 <Field MediaCodecSelector mediaCodecSelector>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #617 <Method boolean handlesTrack(MediaCodecSelector, com.google.android.exoplayer.MediaFormat)>
	//    5    9:ireturn         
	}

	protected final boolean haveFormat()
	{
		return format != null;
	//    0    0:aload_0         
	//    1    1:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected boolean isEnded()
	{
		return outputStreamEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field boolean outputStreamEnded>
	//    2    4:ireturn         
	}

	protected boolean isReady()
	{
		return format != null && !waitingForKeys && (sourceState != 0 || outputIndex >= 0 || isWithinHotswapPeriod());
	//    0    0:aload_0         
	//    1    1:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//    2    4:ifnull          37
	//    3    7:aload_0         
	//    4    8:getfield        #375 <Field boolean waitingForKeys>
	//    5   11:ifne            37
	//    6   14:aload_0         
	//    7   15:getfield        #391 <Field int sourceState>
	//    8   18:ifne            35
	//    9   21:aload_0         
	//   10   22:getfield        #274 <Field int outputIndex>
	//   11   25:ifge            35
	//   12   28:aload_0         
	//   13   29:invokespecial   #622 <Method boolean isWithinHotswapPeriod()>
	//   14   32:ifeq            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	protected final void maybeInitCodec()
		throws ExoPlaybackException
	{
		if(!shouldInitCodec())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #627 <Method boolean shouldInitCodec()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj1 = ((Object) (format.mimeType));
	//    4    8:aload_0         
	//    5    9:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//    6   12:getfield        #630 <Field String MediaFormat.mimeType>
	//    7   15:astore          8
		Object obj = ((Object) (drmInitData));
	//    8   17:aload_0         
	//    9   18:getfield        #632 <Field DrmInitData drmInitData>
	//   10   21:astore          7
		boolean flag;
		if(obj != null)
	//*  11   23:aload           7
	//*  12   25:ifnull          148
		{
			DrmSessionManager drmsessionmanager = drmSessionManager;
	//   13   28:aload_0         
	//   14   29:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   15   32:astore          9
			if(drmsessionmanager != null)
	//*  16   34:aload           9
	//*  17   36:ifnull          137
			{
				if(!openedDrmSession)
	//*  18   39:aload_0         
	//*  19   40:getfield        #553 <Field boolean openedDrmSession>
	//*  20   43:ifne            60
				{
					drmsessionmanager.open(((DrmInitData) (obj)));
	//   21   46:aload           9
	//   22   48:aload           7
	//   23   50:invokeinterface #636 <Method void DrmSessionManager.open(DrmInitData)>
					openedDrmSession = true;
	//   24   55:aload_0         
	//   25   56:iconst_1        
	//   26   57:putfield        #553 <Field boolean openedDrmSession>
				}
				int i = drmSessionManager.getState();
	//   27   60:aload_0         
	//   28   61:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   29   64:invokeinterface #558 <Method int DrmSessionManager.getState()>
	//   30   69:istore_1        
				if(i != 0)
	//*  31   70:iload_1         
	//*  32   71:ifeq            120
				{
					if(i != 3 && i != 4)
	//*  33   74:iload_1         
	//*  34   75:iconst_3        
	//*  35   76:icmpeq          88
	//*  36   79:iload_1         
	//*  37   80:iconst_4        
	//*  38   81:icmpne          87
	//*  39   84:goto            88
						return;
	//   40   87:return          
					obj = ((Object) (((FrameworkMediaCrypto)drmSessionManager.getMediaCrypto()).getWrappedMediaCrypto()));
	//   41   88:aload_0         
	//   42   89:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   43   92:invokeinterface #640 <Method com.google.android.exoplayer.drm.ExoMediaCrypto DrmSessionManager.getMediaCrypto()>
	//   44   97:checkcast       #642 <Class FrameworkMediaCrypto>
	//   45  100:invokevirtual   #646 <Method MediaCrypto FrameworkMediaCrypto.getWrappedMediaCrypto()>
	//   46  103:astore          7
					flag = drmSessionManager.requiresSecureDecoderComponent(((String) (obj1)));
	//   47  105:aload_0         
	//   48  106:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   49  109:aload           8
	//   50  111:invokeinterface #649 <Method boolean DrmSessionManager.requiresSecureDecoderComponent(String)>
	//   51  116:istore_2        
				} else
	//*  52  117:goto            153
				{
					throw new ExoPlaybackException(((Throwable) (drmSessionManager.getError())));
	//   53  120:new             #268 <Class ExoPlaybackException>
	//   54  123:dup             
	//   55  124:aload_0         
	//   56  125:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   57  128:invokeinterface #562 <Method Exception DrmSessionManager.getError()>
	//   58  133:invokespecial   #402 <Method void ExoPlaybackException(Throwable)>
	//   59  136:athrow          
				}
			} else
			{
				throw new ExoPlaybackException("Media requires a DrmSessionManager");
	//   60  137:new             #268 <Class ExoPlaybackException>
	//   61  140:dup             
	//   62  141:ldc2            #651 <String "Media requires a DrmSessionManager">
	//   63  144:invokespecial   #653 <Method void ExoPlaybackException(String)>
	//   64  147:athrow          
			}
		} else
		{
			flag = false;
	//   65  148:iconst_0        
	//   66  149:istore_2        
			obj = null;
	//   67  150:aconst_null     
	//   68  151:astore          7
		}
		try
		{
			obj1 = ((Object) (getDecoderInfo(mediaCodecSelector, ((String) (obj1)), flag)));
	//   69  153:aload_0         
	//   70  154:aload_0         
	//   71  155:getfield        #138 <Field MediaCodecSelector mediaCodecSelector>
	//   72  158:aload           8
	//   73  160:iload_2         
	//   74  161:invokevirtual   #655 <Method DecoderInfo getDecoderInfo(MediaCodecSelector, String, boolean)>
	//   75  164:astore          8
		}
	//*  76  166:goto            195
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  77  169:astore          8
		{
			notifyAndThrowDecoderInitError(new DecoderInitializationException(format, ((Throwable) (obj1)), flag, -49998));
	//   78  171:aload_0         
	//   79  172:new             #12  <Class MediaCodecTrackRenderer$DecoderInitializationException>
	//   80  175:dup             
	//   81  176:aload_0         
	//   82  177:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//   83  180:aload           8
	//   84  182:iload_2         
	//   85  183:ldc2            #656 <Int -49998>
	//   86  186:invokespecial   #659 <Method void MediaCodecTrackRenderer$DecoderInitializationException(com.google.android.exoplayer.MediaFormat, Throwable, boolean, int)>
	//   87  189:invokespecial   #661 <Method void notifyAndThrowDecoderInitError(MediaCodecTrackRenderer$DecoderInitializationException)>
			obj1 = null;
	//   88  192:aconst_null     
	//   89  193:astore          8
		}
		if(obj1 == null)
	//*  90  195:aload           8
	//*  91  197:ifnonnull       220
			notifyAndThrowDecoderInitError(new DecoderInitializationException(format, ((Throwable) (null)), flag, -49999));
	//   92  200:aload_0         
	//   93  201:new             #12  <Class MediaCodecTrackRenderer$DecoderInitializationException>
	//   94  204:dup             
	//   95  205:aload_0         
	//   96  206:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//   97  209:aconst_null     
	//   98  210:iload_2         
	//   99  211:ldc2            #662 <Int -49999>
	//  100  214:invokespecial   #659 <Method void MediaCodecTrackRenderer$DecoderInitializationException(com.google.android.exoplayer.MediaFormat, Throwable, boolean, int)>
	//  101  217:invokespecial   #661 <Method void notifyAndThrowDecoderInitError(MediaCodecTrackRenderer$DecoderInitializationException)>
		String s = ((DecoderInfo) (obj1)).name;
	//  102  220:aload           8
	//  103  222:getfield        #667 <Field String DecoderInfo.name>
	//  104  225:astore          9
		codecIsAdaptive = ((DecoderInfo) (obj1)).adaptive;
	//  105  227:aload_0         
	//  106  228:aload           8
	//  107  230:getfield        #670 <Field boolean DecoderInfo.adaptive>
	//  108  233:putfield        #672 <Field boolean codecIsAdaptive>
		codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(s, format);
	//  109  236:aload_0         
	//  110  237:aload           9
	//  111  239:aload_0         
	//  112  240:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//  113  243:invokestatic    #674 <Method boolean codecNeedsDiscardToSpsWorkaround(String, com.google.android.exoplayer.MediaFormat)>
	//  114  246:putfield        #416 <Field boolean codecNeedsDiscardToSpsWorkaround>
		codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(s);
	//  115  249:aload_0         
	//  116  250:aload           9
	//  117  252:invokestatic    #676 <Method boolean codecNeedsFlushWorkaround(String)>
	//  118  255:putfield        #597 <Field boolean codecNeedsFlushWorkaround>
		codecNeedsAdaptationWorkaround = codecNeedsAdaptationWorkaround(s);
	//  119  258:aload_0         
	//  120  259:aload           9
	//  121  261:invokestatic    #678 <Method boolean codecNeedsAdaptationWorkaround(String)>
	//  122  264:putfield        #531 <Field boolean codecNeedsAdaptationWorkaround>
		codecNeedsEosPropagationWorkaround = codecNeedsEosPropagationWorkaround(s);
	//  123  267:aload_0         
	//  124  268:aload           9
	//  125  270:invokestatic    #680 <Method boolean codecNeedsEosPropagationWorkaround(String)>
	//  126  273:putfield        #310 <Field boolean codecNeedsEosPropagationWorkaround>
		codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(s);
	//  127  276:aload_0         
	//  128  277:aload           9
	//  129  279:invokestatic    #682 <Method boolean codecNeedsEosFlushWorkaround(String)>
	//  130  282:putfield        #599 <Field boolean codecNeedsEosFlushWorkaround>
		codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(s);
	//  131  285:aload_0         
	//  132  286:aload           9
	//  133  288:invokestatic    #684 <Method boolean codecNeedsEosOutputExceptionWorkaround(String)>
	//  134  291:putfield        #276 <Field boolean codecNeedsEosOutputExceptionWorkaround>
		codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(s, format);
	//  135  294:aload_0         
	//  136  295:aload           9
	//  137  297:aload_0         
	//  138  298:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//  139  301:invokestatic    #686 <Method boolean codecNeedsMonoChannelCountWorkaround(String, com.google.android.exoplayer.MediaFormat)>
	//  140  304:putfield        #541 <Field boolean codecNeedsMonoChannelCountWorkaround>
		try
		{
			long l = SystemClock.elapsedRealtime();
	//  141  307:invokestatic    #496 <Method long SystemClock.elapsedRealtime()>
	//  142  310:lstore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//  143  311:new             #688 <Class StringBuilder>
	//  144  314:dup             
	//  145  315:invokespecial   #689 <Method void StringBuilder()>
	//  146  318:astore          10
			stringbuilder.append("createByCodecName(");
	//  147  320:aload           10
	//  148  322:ldc2            #691 <String "createByCodecName(">
	//  149  325:invokevirtual   #695 <Method StringBuilder StringBuilder.append(String)>
	//  150  328:pop             
			stringbuilder.append(s);
	//  151  329:aload           10
	//  152  331:aload           9
	//  153  333:invokevirtual   #695 <Method StringBuilder StringBuilder.append(String)>
	//  154  336:pop             
			stringbuilder.append(")");
	//  155  337:aload           10
	//  156  339:ldc2            #697 <String ")">
	//  157  342:invokevirtual   #695 <Method StringBuilder StringBuilder.append(String)>
	//  158  345:pop             
			TraceUtil.beginSection(stringbuilder.toString());
	//  159  346:aload           10
	//  160  348:invokevirtual   #701 <Method String StringBuilder.toString()>
	//  161  351:invokestatic    #579 <Method void TraceUtil.beginSection(String)>
			codec = MediaCodec.createByCodecName(s);
	//  162  354:aload_0         
	//  163  355:aload           9
	//  164  357:invokestatic    #705 <Method MediaCodec MediaCodec.createByCodecName(String)>
	//  165  360:putfield        #280 <Field MediaCodec codec>
			TraceUtil.endSection();
	//  166  363:invokestatic    #586 <Method void TraceUtil.endSection()>
			TraceUtil.beginSection("configureCodec");
	//  167  366:ldc2            #706 <String "configureCodec">
	//  168  369:invokestatic    #579 <Method void TraceUtil.beginSection(String)>
			configureCodec(codec, ((DecoderInfo) (obj1)).adaptive, getFrameworkMediaFormat(format), ((MediaCrypto) (obj)));
	//  169  372:aload_0         
	//  170  373:aload_0         
	//  171  374:getfield        #280 <Field MediaCodec codec>
	//  172  377:aload           8
	//  173  379:getfield        #670 <Field boolean DecoderInfo.adaptive>
	//  174  382:aload_0         
	//  175  383:aload_0         
	//  176  384:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//  177  387:invokespecial   #708 <Method MediaFormat getFrameworkMediaFormat(com.google.android.exoplayer.MediaFormat)>
	//  178  390:aload           7
	//  179  392:invokevirtual   #710 <Method void configureCodec(MediaCodec, boolean, MediaFormat, MediaCrypto)>
			TraceUtil.endSection();
	//  180  395:invokestatic    #586 <Method void TraceUtil.endSection()>
			TraceUtil.beginSection("codec.start()");
	//  181  398:ldc2            #712 <String "codec.start()">
	//  182  401:invokestatic    #579 <Method void TraceUtil.beginSection(String)>
			codec.start();
	//  183  404:aload_0         
	//  184  405:getfield        #280 <Field MediaCodec codec>
	//  185  408:invokevirtual   #715 <Method void MediaCodec.start()>
			TraceUtil.endSection();
	//  186  411:invokestatic    #586 <Method void TraceUtil.endSection()>
			long l2 = SystemClock.elapsedRealtime();
	//  187  414:invokestatic    #496 <Method long SystemClock.elapsedRealtime()>
	//  188  417:lstore          5
			notifyDecoderInitialized(s, l2, l2 - l);
	//  189  419:aload_0         
	//  190  420:aload           9
	//  191  422:lload           5
	//  192  424:lload           5
	//  193  426:lload_3         
	//  194  427:lsub            
	//  195  428:invokespecial   #717 <Method void notifyDecoderInitialized(String, long, long)>
			inputBuffers = codec.getInputBuffers();
	//  196  431:aload_0         
	//  197  432:aload_0         
	//  198  433:getfield        #280 <Field MediaCodec codec>
	//  199  436:invokevirtual   #720 <Method ByteBuffer[] MediaCodec.getInputBuffers()>
	//  200  439:putfield        #352 <Field ByteBuffer[] inputBuffers>
			outputBuffers = codec.getOutputBuffers();
	//  201  442:aload_0         
	//  202  443:aload_0         
	//  203  444:getfield        #280 <Field MediaCodec codec>
	//  204  447:invokevirtual   #303 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//  205  450:putfield        #305 <Field ByteBuffer[] outputBuffers>
		}
	//* 206  453:goto            478
		catch(Exception exception)
	//* 207  456:astore          7
		{
			notifyAndThrowDecoderInitError(new DecoderInitializationException(format, ((Throwable) (exception)), flag, s));
	//  208  458:aload_0         
	//  209  459:new             #12  <Class MediaCodecTrackRenderer$DecoderInitializationException>
	//  210  462:dup             
	//  211  463:aload_0         
	//  212  464:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//  213  467:aload           7
	//  214  469:iload_2         
	//  215  470:aload           9
	//  216  472:invokespecial   #723 <Method void MediaCodecTrackRenderer$DecoderInitializationException(com.google.android.exoplayer.MediaFormat, Throwable, boolean, String)>
	//  217  475:invokespecial   #661 <Method void notifyAndThrowDecoderInitError(MediaCodecTrackRenderer$DecoderInitializationException)>
		}
		long l1;
		if(getState() == 3)
	//* 218  478:aload_0         
	//* 219  479:invokevirtual   #724 <Method int getState()>
	//* 220  482:iconst_3        
	//* 221  483:icmpne          493
			l1 = SystemClock.elapsedRealtime();
	//  222  486:invokestatic    #496 <Method long SystemClock.elapsedRealtime()>
	//  223  489:lstore_3        
		else
	//* 224  490:goto            497
			l1 = -1L;
	//  225  493:ldc2w           #591 <Long -1L>
	//  226  496:lstore_3        
		codecHotswapTimeMs = l1;
	//  227  497:aload_0         
	//  228  498:lload_3         
	//  229  499:putfield        #498 <Field long codecHotswapTimeMs>
		inputIndex = -1;
	//  230  502:aload_0         
	//  231  503:iconst_m1       
	//  232  504:putfield        #347 <Field int inputIndex>
		outputIndex = -1;
	//  233  507:aload_0         
	//  234  508:iconst_m1       
	//  235  509:putfield        #274 <Field int outputIndex>
		waitingForFirstSyncFrame = true;
	//  236  512:aload_0         
	//  237  513:iconst_1        
	//  238  514:putfield        #404 <Field boolean waitingForFirstSyncFrame>
		exception = ((Exception) (codecCounters));
	//  239  517:aload_0         
	//  240  518:getfield        #157 <Field CodecCounters codecCounters>
	//  241  521:astore          7
		exception.codecInitCount = ((CodecCounters) (exception)).codecInitCount + 1;
	//  242  523:aload           7
	//  243  525:aload           7
	//  244  527:getfield        #727 <Field int CodecCounters.codecInitCount>
	//  245  530:iconst_1        
	//  246  531:iadd            
	//  247  532:putfield        #727 <Field int CodecCounters.codecInitCount>
	//  248  535:return          
	}

	protected void onDisabled()
		throws ExoPlaybackException
	{
		format = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
		drmInitData = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #632 <Field DrmInitData drmInitData>
		releaseCodec();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #296 <Method void releaseCodec()>
		if(openedDrmSession)
	//*   8   14:aload_0         
	//*   9   15:getfield        #553 <Field boolean openedDrmSession>
	//*  10   18:ifeq            35
		{
			drmSessionManager.close();
	//   11   21:aload_0         
	//   12   22:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   13   25:invokeinterface #731 <Method void DrmSessionManager.close()>
			openedDrmSession = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #553 <Field boolean openedDrmSession>
		}
		super.onDisabled();
	//   17   35:aload_0         
	//   18   36:invokespecial   #733 <Method void SampleSourceTrackRenderer.onDisabled()>
		return;
	//   19   39:return          
		Exception exception;
		exception;
	//   20   40:astore_1        
		super.onDisabled();
	//   21   41:aload_0         
	//   22   42:invokespecial   #733 <Method void SampleSourceTrackRenderer.onDisabled()>
		throw exception;
	//   23   45:aload_1         
	//   24   46:athrow          
		exception;
	//   25   47:astore_1        
		if(openedDrmSession)
	//*  26   48:aload_0         
	//*  27   49:getfield        #553 <Field boolean openedDrmSession>
	//*  28   52:ifeq            69
		{
			drmSessionManager.close();
	//   29   55:aload_0         
	//   30   56:getfield        #140 <Field DrmSessionManager drmSessionManager>
	//   31   59:invokeinterface #731 <Method void DrmSessionManager.close()>
			openedDrmSession = false;
	//   32   64:aload_0         
	//   33   65:iconst_0        
	//   34   66:putfield        #553 <Field boolean openedDrmSession>
		}
		super.onDisabled();
	//   35   69:aload_0         
	//   36   70:invokespecial   #733 <Method void SampleSourceTrackRenderer.onDisabled()>
		throw exception;
	//   37   73:aload_1         
	//   38   74:athrow          
		exception;
	//   39   75:astore_1        
		super.onDisabled();
	//   40   76:aload_0         
	//   41   77:invokespecial   #733 <Method void SampleSourceTrackRenderer.onDisabled()>
		throw exception;
	//   42   80:aload_1         
	//   43   81:athrow          
	}

	protected void onDiscontinuity(long l)
		throws ExoPlaybackException
	{
		sourceState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #391 <Field int sourceState>
		inputStreamEnded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #312 <Field boolean inputStreamEnded>
		outputStreamEnded = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #272 <Field boolean outputStreamEnded>
		if(codec != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #280 <Field MediaCodec codec>
	//*  11   19:ifnull          26
			flushCodec();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #736 <Method void flushCodec()>
	//   14   26:return          
	}

	protected void onInputFormatChanged(MediaFormatHolder mediaformatholder)
		throws ExoPlaybackException
	{
		com.google.android.exoplayer.MediaFormat mediaformat = format;
	//    0    0:aload_0         
	//    1    1:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//    2    4:astore          5
		format = mediaformatholder.format;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:getfield        #737 <Field com.google.android.exoplayer.MediaFormat MediaFormatHolder.format>
	//    6   11:putfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
		drmInitData = mediaformatholder.drmInitData;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:getfield        #738 <Field DrmInitData MediaFormatHolder.drmInitData>
	//   10   19:putfield        #632 <Field DrmInitData drmInitData>
		mediaformatholder = ((MediaFormatHolder) (drmInitData));
	//   11   22:aload_0         
	//   12   23:getfield        #632 <Field DrmInitData drmInitData>
	//   13   26:astore_1        
		boolean flag2 = false;
	//   14   27:iconst_0        
	//   15   28:istore          4
		boolean flag;
		if(mediaformatholder != null && !openedDrmSession)
	//*  16   30:aload_1         
	//*  17   31:ifnull          46
	//*  18   34:aload_0         
	//*  19   35:getfield        #553 <Field boolean openedDrmSession>
	//*  20   38:ifne            46
			flag = true;
	//   21   41:iconst_1        
	//   22   42:istore_2        
		else
	//*  23   43:goto            48
			flag = false;
	//   24   46:iconst_0        
	//   25   47:istore_2        
		if(Util.areEqual(((Object) (format)), ((Object) (mediaformat))) && !flag)
	//*  26   48:aload_0         
	//*  27   49:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//*  28   52:aload           5
	//*  29   54:invokestatic    #742 <Method boolean Util.areEqual(Object, Object)>
	//*  30   57:ifeq            65
	//*  31   60:iload_2         
	//*  32   61:ifne            65
			return;
	//   33   64:return          
		mediaformatholder = ((MediaFormatHolder) (codec));
	//   34   65:aload_0         
	//   35   66:getfield        #280 <Field MediaCodec codec>
	//   36   69:astore_1        
		if(mediaformatholder != null && !flag && canReconfigureCodec(((MediaCodec) (mediaformatholder)), codecIsAdaptive, mediaformat, format))
	//*  37   70:aload_1         
	//*  38   71:ifnull          160
	//*  39   74:iload_2         
	//*  40   75:ifne            160
	//*  41   78:aload_0         
	//*  42   79:aload_1         
	//*  43   80:aload_0         
	//*  44   81:getfield        #672 <Field boolean codecIsAdaptive>
	//*  45   84:aload           5
	//*  46   86:aload_0         
	//*  47   87:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//*  48   90:invokevirtual   #744 <Method boolean canReconfigureCodec(MediaCodec, boolean, com.google.android.exoplayer.MediaFormat, com.google.android.exoplayer.MediaFormat)>
	//*  49   93:ifeq            160
		{
			codecReconfigured = true;
	//   50   96:aload_0         
	//   51   97:iconst_1        
	//   52   98:putfield        #604 <Field boolean codecReconfigured>
			codecReconfigurationState = 1;
	//   53  101:aload_0         
	//   54  102:iconst_1        
	//   55  103:putfield        #181 <Field int codecReconfigurationState>
			boolean flag1 = flag2;
	//   56  106:iload           4
	//   57  108:istore_3        
			if(codecNeedsAdaptationWorkaround)
	//*  58  109:aload_0         
	//*  59  110:getfield        #531 <Field boolean codecNeedsAdaptationWorkaround>
	//*  60  113:ifeq            154
			{
				flag1 = flag2;
	//   61  116:iload           4
	//   62  118:istore_3        
				if(format.width == mediaformat.width)
	//*  63  119:aload_0         
	//*  64  120:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//*  65  123:getfield        #746 <Field int MediaFormat.width>
	//*  66  126:aload           5
	//*  67  128:getfield        #746 <Field int MediaFormat.width>
	//*  68  131:icmpne          154
				{
					flag1 = flag2;
	//   69  134:iload           4
	//   70  136:istore_3        
					if(format.height == mediaformat.height)
	//*  71  137:aload_0         
	//*  72  138:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//*  73  141:getfield        #748 <Field int MediaFormat.height>
	//*  74  144:aload           5
	//*  75  146:getfield        #748 <Field int MediaFormat.height>
	//*  76  149:icmpne          154
						flag1 = true;
	//   77  152:iconst_1        
	//   78  153:istore_3        
				}
			}
			codecNeedsAdaptationWorkaroundBuffer = flag1;
	//   79  154:aload_0         
	//   80  155:iload_3         
	//   81  156:putfield        #365 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
			return;
	//   82  159:return          
		}
		if(codecReceivedBuffers)
	//*  83  160:aload_0         
	//*  84  161:getfield        #373 <Field boolean codecReceivedBuffers>
	//*  85  164:ifeq            173
		{
			codecReinitializationState = 1;
	//   86  167:aload_0         
	//   87  168:iconst_1        
	//   88  169:putfield        #183 <Field int codecReinitializationState>
			return;
	//   89  172:return          
		} else
		{
			releaseCodec();
	//   90  173:aload_0         
	//   91  174:invokevirtual   #296 <Method void releaseCodec()>
			maybeInitCodec();
	//   92  177:aload_0         
	//   93  178:invokevirtual   #523 <Method void maybeInitCodec()>
			return;
	//   94  181:return          
		}
	}

	protected void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onOutputStreamEnded()
	{
	//    0    0:return          
	}

	protected void onProcessedOutputBuffer(long l)
	{
	//    0    0:return          
	}

	protected void onQueuedInputBuffer(long l, ByteBuffer bytebuffer, int i, boolean flag)
	{
	//    0    0:return          
	}

	protected void onStarted()
	{
	//    0    0:return          
	}

	protected void onStopped()
	{
	//    0    0:return          
	}

	protected abstract boolean processOutputBuffer(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
			int i, boolean flag)
		throws ExoPlaybackException;

	protected void releaseCodec()
	{
		if(codec == null)
			break MISSING_BLOCK_LABEL_184;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field MediaCodec codec>
	//    2    4:ifnull          184
		codecHotswapTimeMs = -1L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #591 <Long -1L>
	//    5   11:putfield        #498 <Field long codecHotswapTimeMs>
		inputIndex = -1;
	//    6   14:aload_0         
	//    7   15:iconst_m1       
	//    8   16:putfield        #347 <Field int inputIndex>
		outputIndex = -1;
	//    9   19:aload_0         
	//   10   20:iconst_m1       
	//   11   21:putfield        #274 <Field int outputIndex>
		waitingForKeys = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #375 <Field boolean waitingForKeys>
		decodeOnlyPresentationTimestamps.clear();
	//   15   29:aload_0         
	//   16   30:getfield        #174 <Field List decodeOnlyPresentationTimestamps>
	//   17   33:invokeinterface #595 <Method void List.clear()>
		inputBuffers = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #352 <Field ByteBuffer[] inputBuffers>
		outputBuffers = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #305 <Field ByteBuffer[] outputBuffers>
		codecReconfigured = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #604 <Field boolean codecReconfigured>
		codecReceivedBuffers = false;
	//   27   53:aload_0         
	//   28   54:iconst_0        
	//   29   55:putfield        #373 <Field boolean codecReceivedBuffers>
		codecIsAdaptive = false;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #672 <Field boolean codecIsAdaptive>
		codecNeedsDiscardToSpsWorkaround = false;
	//   33   63:aload_0         
	//   34   64:iconst_0        
	//   35   65:putfield        #416 <Field boolean codecNeedsDiscardToSpsWorkaround>
		codecNeedsFlushWorkaround = false;
	//   36   68:aload_0         
	//   37   69:iconst_0        
	//   38   70:putfield        #597 <Field boolean codecNeedsFlushWorkaround>
		codecNeedsAdaptationWorkaround = false;
	//   39   73:aload_0         
	//   40   74:iconst_0        
	//   41   75:putfield        #531 <Field boolean codecNeedsAdaptationWorkaround>
		codecNeedsEosPropagationWorkaround = false;
	//   42   78:aload_0         
	//   43   79:iconst_0        
	//   44   80:putfield        #310 <Field boolean codecNeedsEosPropagationWorkaround>
		codecNeedsEosFlushWorkaround = false;
	//   45   83:aload_0         
	//   46   84:iconst_0        
	//   47   85:putfield        #599 <Field boolean codecNeedsEosFlushWorkaround>
		codecNeedsMonoChannelCountWorkaround = false;
	//   48   88:aload_0         
	//   49   89:iconst_0        
	//   50   90:putfield        #541 <Field boolean codecNeedsMonoChannelCountWorkaround>
		codecNeedsAdaptationWorkaroundBuffer = false;
	//   51   93:aload_0         
	//   52   94:iconst_0        
	//   53   95:putfield        #365 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
		shouldSkipAdaptationWorkaroundOutputBuffer = false;
	//   54   98:aload_0         
	//   55   99:iconst_0        
	//   56  100:putfield        #314 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
		codecReceivedEos = false;
	//   57  103:aload_0         
	//   58  104:iconst_0        
	//   59  105:putfield        #278 <Field boolean codecReceivedEos>
		codecReconfigurationState = 0;
	//   60  108:aload_0         
	//   61  109:iconst_0        
	//   62  110:putfield        #181 <Field int codecReconfigurationState>
		codecReinitializationState = 0;
	//   63  113:aload_0         
	//   64  114:iconst_0        
	//   65  115:putfield        #183 <Field int codecReinitializationState>
		CodecCounters codeccounters = codecCounters;
	//   66  118:aload_0         
	//   67  119:getfield        #157 <Field CodecCounters codecCounters>
	//   68  122:astore_1        
		codeccounters.codecReleaseCount = codeccounters.codecReleaseCount + 1;
	//   69  123:aload_1         
	//   70  124:aload_1         
	//   71  125:getfield        #753 <Field int CodecCounters.codecReleaseCount>
	//   72  128:iconst_1        
	//   73  129:iadd            
	//   74  130:putfield        #753 <Field int CodecCounters.codecReleaseCount>
		codec.stop();
	//   75  133:aload_0         
	//   76  134:getfield        #280 <Field MediaCodec codec>
	//   77  137:invokevirtual   #756 <Method void MediaCodec.stop()>
		codec.release();
	//   78  140:aload_0         
	//   79  141:getfield        #280 <Field MediaCodec codec>
	//   80  144:invokevirtual   #759 <Method void MediaCodec.release()>
		codec = null;
	//   81  147:aload_0         
	//   82  148:aconst_null     
	//   83  149:putfield        #280 <Field MediaCodec codec>
		return;
	//   84  152:return          
		Exception exception;
		exception;
	//   85  153:astore_1        
		codec = null;
	//   86  154:aload_0         
	//   87  155:aconst_null     
	//   88  156:putfield        #280 <Field MediaCodec codec>
		throw exception;
	//   89  159:aload_1         
	//   90  160:athrow          
		exception;
	//   91  161:astore_1        
		codec.release();
	//   92  162:aload_0         
	//   93  163:getfield        #280 <Field MediaCodec codec>
	//   94  166:invokevirtual   #759 <Method void MediaCodec.release()>
		codec = null;
	//   95  169:aload_0         
	//   96  170:aconst_null     
	//   97  171:putfield        #280 <Field MediaCodec codec>
		throw exception;
	//   98  174:aload_1         
	//   99  175:athrow          
		exception;
	//  100  176:astore_1        
		codec = null;
	//  101  177:aload_0         
	//  102  178:aconst_null     
	//  103  179:putfield        #280 <Field MediaCodec codec>
		throw exception;
	//  104  182:aload_1         
	//  105  183:athrow          
	//  106  184:return          
	}

	protected boolean shouldInitCodec()
	{
		return codec == null && format != null;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field MediaCodec codec>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #377 <Field com.google.android.exoplayer.MediaFormat format>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static final byte ADAPTATION_WORKAROUND_BUFFER[] = Util.getBytesFromHexString("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
	private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
	private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000L;
	private static final int RECONFIGURATION_STATE_NONE = 0;
	private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
	private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
	private static final int REINITIALIZATION_STATE_NONE = 0;
	private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
	private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
	protected static final int SOURCE_STATE_NOT_READY = 0;
	protected static final int SOURCE_STATE_READY = 1;
	protected static final int SOURCE_STATE_READY_READ_MAY_FAIL = 2;
	private MediaCodec codec;
	public final CodecCounters codecCounters;
	private long codecHotswapTimeMs;
	private boolean codecIsAdaptive;
	private boolean codecNeedsAdaptationWorkaround;
	private boolean codecNeedsAdaptationWorkaroundBuffer;
	private boolean codecNeedsDiscardToSpsWorkaround;
	private boolean codecNeedsEosFlushWorkaround;
	private boolean codecNeedsEosOutputExceptionWorkaround;
	private boolean codecNeedsEosPropagationWorkaround;
	private boolean codecNeedsFlushWorkaround;
	private boolean codecNeedsMonoChannelCountWorkaround;
	private boolean codecReceivedBuffers;
	private boolean codecReceivedEos;
	private int codecReconfigurationState;
	private boolean codecReconfigured;
	private int codecReinitializationState;
	private final List decodeOnlyPresentationTimestamps;
	private final boolean deviceNeedsAutoFrcWorkaround;
	private DrmInitData drmInitData;
	private final DrmSessionManager drmSessionManager;
	protected final Handler eventHandler;
	private final EventListener eventListener;
	private com.google.android.exoplayer.MediaFormat format;
	private final MediaFormatHolder formatHolder;
	private ByteBuffer inputBuffers[];
	private int inputIndex;
	private boolean inputStreamEnded;
	private final MediaCodecSelector mediaCodecSelector;
	private boolean openedDrmSession;
	private final android.media.MediaCodec.BufferInfo outputBufferInfo;
	private ByteBuffer outputBuffers[];
	private int outputIndex;
	private boolean outputStreamEnded;
	private final boolean playClearSamplesWithoutKeys;
	private final SampleHolder sampleHolder;
	private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
	private int sourceState;
	private boolean waitingForFirstSyncFrame;
	private boolean waitingForKeys;

	static 
	{
	//    0    0:ldc1            #100 <String "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78">
	//    1    2:invokestatic    #106 <Method byte[] Util.getBytesFromHexString(String)>
	//    2    5:putstatic       #108 <Field byte[] ADAPTATION_WORKAROUND_BUFFER>
	//*   3    8:return          
	}


/*
	static EventListener access$000(MediaCodecTrackRenderer mediacodectrackrenderer)
	{
		return mediacodectrackrenderer.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field MediaCodecTrackRenderer$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
