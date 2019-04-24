// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.mediacodec;

import android.media.*;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.*;
import com.google.android.exoplayer2.drm.*;
import com.google.android.exoplayer2.util.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.mediacodec:
//			MediaCodecSelector, MediaCodecInfo

public abstract class MediaCodecRenderer extends BaseRenderer
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
		//    2    4:ldc1            #82  <String "neg_">
		//    3    6:astore_1        
			else
		//*   4    7:goto            13
				s = "";
		//    5   10:ldc1            #84  <String "">
		//    6   12:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//    7   13:new             #24  <Class StringBuilder>
		//    8   16:dup             
		//    9   17:invokespecial   #27  <Method void StringBuilder()>
		//   10   20:astore_2        
			stringbuilder.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
		//   11   21:aload_2         
		//   12   22:ldc1            #86  <String "com.google.android.exoplayer.MediaCodecTrackRenderer_">
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
		//   21   36:invokestatic    #92  <Method int Math.abs(int)>
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
		//*   1    1:instanceof      #97  <Class android.media.MediaCodec$CodecException>
		//*   2    4:ifeq            15
				return ((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo();
		//    3    7:aload_0         
		//    4    8:checkcast       #97  <Class android.media.MediaCodec$CodecException>
		//    5   11:invokevirtual   #100 <Method String android.media.MediaCodec$CodecException.getDiagnosticInfo()>
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

		public DecoderInitializationException(Format format1, Throwable throwable, boolean flag, int i)
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
			stringbuilder.append(((Object) (format1)));
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
			mimeType = format1.sampleMimeType;
		//   25   50:aload_0         
		//   26   51:aload_1         
		//   27   52:getfield        #53  <Field String Format.sampleMimeType>
		//   28   55:putfield        #55  <Field String mimeType>
			secureDecoderRequired = flag;
		//   29   58:aload_0         
		//   30   59:iload_3         
		//   31   60:putfield        #57  <Field boolean secureDecoderRequired>
			decoderName = null;
		//   32   63:aload_0         
		//   33   64:aconst_null     
		//   34   65:putfield        #59  <Field String decoderName>
			diagnosticInfo = buildCustomDiagnosticInfo(i);
		//   35   68:aload_0         
		//   36   69:iload           4
		//   37   71:invokestatic    #63  <Method String buildCustomDiagnosticInfo(int)>
		//   38   74:putfield        #65  <Field String diagnosticInfo>
		//   39   77:return          
		}

		public DecoderInitializationException(Format format1, Throwable throwable, boolean flag, String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #24  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore          5
			stringbuilder.append("Decoder init failed: ");
		//    4    9:aload           5
		//    5   11:ldc1            #69  <String "Decoder init failed: ">
		//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(s);
		//    8   17:aload           5
		//    9   19:aload           4
		//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			stringbuilder.append(", ");
		//   12   25:aload           5
		//   13   27:ldc1            #71  <String ", ">
		//   14   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   15   32:pop             
			stringbuilder.append(((Object) (format1)));
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
			mimeType = format1.sampleMimeType;
		//   25   50:aload_0         
		//   26   51:aload_1         
		//   27   52:getfield        #53  <Field String Format.sampleMimeType>
		//   28   55:putfield        #55  <Field String mimeType>
			secureDecoderRequired = flag;
		//   29   58:aload_0         
		//   30   59:iload_3         
		//   31   60:putfield        #57  <Field boolean secureDecoderRequired>
			decoderName = s;
		//   32   63:aload_0         
		//   33   64:aload           4
		//   34   66:putfield        #59  <Field String decoderName>
			if(Util.SDK_INT >= 21)
		//*  35   69:getstatic       #76  <Field int Util.SDK_INT>
		//*  36   72:bipush          21
		//*  37   74:icmplt          85
				format1 = ((Format) (getDiagnosticInfoV21(throwable)));
		//   38   77:aload_2         
		//   39   78:invokestatic    #80  <Method String getDiagnosticInfoV21(Throwable)>
		//   40   81:astore_1        
			else
		//*  41   82:goto            87
				format1 = null;
		//   42   85:aconst_null     
		//   43   86:astore_1        
			diagnosticInfo = ((String) (format1));
		//   44   87:aload_0         
		//   45   88:aload_1         
		//   46   89:putfield        #65  <Field String diagnosticInfo>
		//   47   92:return          
		}
	}


	public MediaCodecRenderer(int i, MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, boolean flag)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #114 <Method void BaseRenderer(int)>
		boolean flag1;
		if(Util.SDK_INT >= 16)
	//*   3    5:getstatic       #117 <Field int Util.SDK_INT>
	//*   4    8:bipush          16
	//*   5   10:icmplt          19
			flag1 = true;
	//    6   13:iconst_1        
	//    7   14:istore          5
		else
	//*   8   16:goto            22
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore          5
		Assertions.checkState(flag1);
	//   11   22:iload           5
	//   12   24:invokestatic    #123 <Method void Assertions.checkState(boolean)>
		mediaCodecSelector = (MediaCodecSelector)Assertions.checkNotNull(((Object) (mediacodecselector)));
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokestatic    #127 <Method Object Assertions.checkNotNull(Object)>
	//   16   32:checkcast       #129 <Class MediaCodecSelector>
	//   17   35:putfield        #131 <Field MediaCodecSelector mediaCodecSelector>
		drmSessionManager = drmsessionmanager;
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:putfield        #133 <Field DrmSessionManager drmSessionManager>
		playClearSamplesWithoutKeys = flag;
	//   21   43:aload_0         
	//   22   44:iload           4
	//   23   46:putfield        #135 <Field boolean playClearSamplesWithoutKeys>
	//   24   49:aload_0         
	//   25   50:new             #137 <Class DecoderInputBuffer>
	//   26   53:dup             
	//   27   54:iconst_0        
	//   28   55:invokespecial   #138 <Method void DecoderInputBuffer(int)>
	//   29   58:putfield        #140 <Field DecoderInputBuffer buffer>
	//   30   61:aload_0         
	//   31   62:invokestatic    #144 <Method DecoderInputBuffer DecoderInputBuffer.newFlagsOnlyInstance()>
	//   32   65:putfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   33   68:aload_0         
	//   34   69:new             #148 <Class FormatHolder>
	//   35   72:dup             
	//   36   73:invokespecial   #150 <Method void FormatHolder()>
	//   37   76:putfield        #152 <Field FormatHolder formatHolder>
	//   38   79:aload_0         
	//   39   80:new             #154 <Class ArrayList>
	//   40   83:dup             
	//   41   84:invokespecial   #155 <Method void ArrayList()>
	//   42   87:putfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//   43   90:aload_0         
	//   44   91:new             #159 <Class android.media.MediaCodec$BufferInfo>
	//   45   94:dup             
	//   46   95:invokespecial   #160 <Method void android.media.MediaCodec$BufferInfo()>
	//   47   98:putfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
		codecReconfigurationState = 0;
	//   48  101:aload_0         
	//   49  102:iconst_0        
	//   50  103:putfield        #164 <Field int codecReconfigurationState>
		codecReinitializationState = 0;
	//   51  106:aload_0         
	//   52  107:iconst_0        
	//   53  108:putfield        #166 <Field int codecReinitializationState>
	//   54  111:return          
	}

	private int codecAdaptationWorkaroundMode(String s)
	{
		if(Util.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(((Object) (s))) && (Util.MODEL.startsWith("SM-T585") || Util.MODEL.startsWith("SM-A510") || Util.MODEL.startsWith("SM-A520") || Util.MODEL.startsWith("SM-J700")))
	//*   0    0:getstatic       #117 <Field int Util.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmpgt          63
	//*   3    8:ldc1            #172 <String "OMX.Exynos.avc.dec.secure">
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*   6   14:ifeq            63
	//*   7   17:getstatic       #181 <Field String Util.MODEL>
	//*   8   20:ldc1            #183 <String "SM-T585">
	//*   9   22:invokevirtual   #187 <Method boolean String.startsWith(String)>
	//*  10   25:ifne            61
	//*  11   28:getstatic       #181 <Field String Util.MODEL>
	//*  12   31:ldc1            #189 <String "SM-A510">
	//*  13   33:invokevirtual   #187 <Method boolean String.startsWith(String)>
	//*  14   36:ifne            61
	//*  15   39:getstatic       #181 <Field String Util.MODEL>
	//*  16   42:ldc1            #191 <String "SM-A520">
	//*  17   44:invokevirtual   #187 <Method boolean String.startsWith(String)>
	//*  18   47:ifne            61
	//*  19   50:getstatic       #181 <Field String Util.MODEL>
	//*  20   53:ldc1            #193 <String "SM-J700">
	//*  21   55:invokevirtual   #187 <Method boolean String.startsWith(String)>
	//*  22   58:ifeq            63
			return 2;
	//   23   61:iconst_2        
	//   24   62:ireturn         
		return Util.SDK_INT >= 24 || !"OMX.Nvidia.h264.decode".equals(((Object) (s))) && !"OMX.Nvidia.h264.decode.secure".equals(((Object) (s))) || !"flounder".equals(((Object) (Util.DEVICE))) && !"flounder_lte".equals(((Object) (Util.DEVICE))) && !"grouper".equals(((Object) (Util.DEVICE))) && !"tilapia".equals(((Object) (Util.DEVICE))) ? 0 : 1;
	//   25   63:getstatic       #117 <Field int Util.SDK_INT>
	//   26   66:bipush          24
	//   27   68:icmpge          135
	//   28   71:ldc1            #195 <String "OMX.Nvidia.h264.decode">
	//   29   73:aload_1         
	//   30   74:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   31   77:ifne            89
	//   32   80:ldc1            #197 <String "OMX.Nvidia.h264.decode.secure">
	//   33   82:aload_1         
	//   34   83:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   35   86:ifeq            135
	//   36   89:ldc1            #199 <String "flounder">
	//   37   91:getstatic       #202 <Field String Util.DEVICE>
	//   38   94:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   39   97:ifne            133
	//   40  100:ldc1            #204 <String "flounder_lte">
	//   41  102:getstatic       #202 <Field String Util.DEVICE>
	//   42  105:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   43  108:ifne            133
	//   44  111:ldc1            #206 <String "grouper">
	//   45  113:getstatic       #202 <Field String Util.DEVICE>
	//   46  116:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   47  119:ifne            133
	//   48  122:ldc1            #208 <String "tilapia">
	//   49  124:getstatic       #202 <Field String Util.DEVICE>
	//   50  127:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   51  130:ifeq            135
	//   52  133:iconst_1        
	//   53  134:ireturn         
	//   54  135:iconst_0        
	//   55  136:ireturn         
	}

	private static boolean codecNeedsDiscardToSpsWorkaround(String s, Format format1)
	{
		return Util.SDK_INT < 21 && format1.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(((Object) (s)));
	//    0    0:getstatic       #117 <Field int Util.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmpge          31
	//    3    8:aload_1         
	//    4    9:getfield        #214 <Field List Format.initializationData>
	//    5   12:invokeinterface #220 <Method boolean List.isEmpty()>
	//    6   17:ifeq            31
	//    7   20:ldc1            #222 <String "OMX.MTK.VIDEO.DECODER.AVC">
	//    8   22:aload_0         
	//    9   23:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   10   26:ifeq            31
	//   11   29:iconst_1        
	//   12   30:ireturn         
	//   13   31:iconst_0        
	//   14   32:ireturn         
	}

	private static boolean codecNeedsEosFlushWorkaround(String s)
	{
		return Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(((Object) (s))) || Util.SDK_INT <= 19 && "hb2000".equals(((Object) (Util.DEVICE))) && ("OMX.amlogic.avc.decoder.awesome".equals(((Object) (s))) || "OMX.amlogic.avc.decoder.awesome.secure".equals(((Object) (s))));
	//    0    0:getstatic       #117 <Field int Util.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmpgt          17
	//    3    8:ldc1            #224 <String "OMX.google.vorbis.decoder">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    6   14:ifne            54
	//    7   17:getstatic       #117 <Field int Util.SDK_INT>
	//    8   20:bipush          19
	//    9   22:icmpgt          56
	//   10   25:ldc1            #226 <String "hb2000">
	//   11   27:getstatic       #202 <Field String Util.DEVICE>
	//   12   30:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   13   33:ifeq            56
	//   14   36:ldc1            #228 <String "OMX.amlogic.avc.decoder.awesome">
	//   15   38:aload_0         
	//   16   39:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   17   42:ifne            54
	//   18   45:ldc1            #230 <String "OMX.amlogic.avc.decoder.awesome.secure">
	//   19   47:aload_0         
	//   20   48:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   21   51:ifeq            56
	//   22   54:iconst_1        
	//   23   55:ireturn         
	//   24   56:iconst_0        
	//   25   57:ireturn         
	}

	private static boolean codecNeedsEosOutputExceptionWorkaround(String s)
	{
		return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(((Object) (s)));
	//    0    0:getstatic       #117 <Field int Util.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmpne          19
	//    3    8:ldc1            #232 <String "OMX.google.aac.decoder">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediacodecinfo)
	{
		String s = mediacodecinfo.name;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field String MediaCodecInfo.name>
	//    2    4:astore_1        
		return Util.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(((Object) (s))) || "OMX.allwinner.video.decoder.avc".equals(((Object) (s)))) || "Amazon".equals(((Object) (Util.MANUFACTURER))) && "AFTS".equals(((Object) (Util.MODEL))) && mediacodecinfo.secure;
	//    3    5:getstatic       #117 <Field int Util.SDK_INT>
	//    4    8:bipush          17
	//    5   10:icmpgt          31
	//    6   13:ldc1            #240 <String "OMX.rk.video_decoder.avc">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    9   19:ifne            60
	//   10   22:ldc1            #242 <String "OMX.allwinner.video.decoder.avc">
	//   11   24:aload_1         
	//   12   25:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   13   28:ifne            60
	//   14   31:ldc1            #244 <String "Amazon">
	//   15   33:getstatic       #247 <Field String Util.MANUFACTURER>
	//   16   36:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   17   39:ifeq            62
	//   18   42:ldc1            #249 <String "AFTS">
	//   19   44:getstatic       #181 <Field String Util.MODEL>
	//   20   47:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   21   50:ifeq            62
	//   22   53:aload_0         
	//   23   54:getfield        #252 <Field boolean MediaCodecInfo.secure>
	//   24   57:ifeq            62
	//   25   60:iconst_1        
	//   26   61:ireturn         
	//   27   62:iconst_0        
	//   28   63:ireturn         
	}

	private static boolean codecNeedsFlushWorkaround(String s)
	{
		return Util.SDK_INT < 18 || Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(((Object) (s))) || "OMX.SEC.avc.dec.secure".equals(((Object) (s)))) || Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(((Object) (s))) || "OMX.Exynos.avc.dec.secure".equals(((Object) (s))));
	//    0    0:getstatic       #117 <Field int Util.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmplt          79
	//    3    8:getstatic       #117 <Field int Util.SDK_INT>
	//    4   11:bipush          18
	//    5   13:icmpne          35
	//    6   16:ldc1            #254 <String "OMX.SEC.avc.dec">
	//    7   18:aload_0         
	//    8   19:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    9   22:ifne            79
	//   10   25:ldc2            #256 <String "OMX.SEC.avc.dec.secure">
	//   11   28:aload_0         
	//   12   29:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   13   32:ifne            79
	//   14   35:getstatic       #117 <Field int Util.SDK_INT>
	//   15   38:bipush          19
	//   16   40:icmpne          77
	//   17   43:getstatic       #181 <Field String Util.MODEL>
	//   18   46:ldc2            #258 <String "SM-G800">
	//   19   49:invokevirtual   #187 <Method boolean String.startsWith(String)>
	//   20   52:ifeq            77
	//   21   55:ldc2            #260 <String "OMX.Exynos.avc.dec">
	//   22   58:aload_0         
	//   23   59:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   24   62:ifne            79
	//   25   65:ldc1            #172 <String "OMX.Exynos.avc.dec.secure">
	//   26   67:aload_0         
	//   27   68:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   28   71:ifeq            77
	//   29   74:goto            79
	//   30   77:iconst_0        
	//   31   78:ireturn         
	//   32   79:iconst_1        
	//   33   80:ireturn         
	}

	private static boolean codecNeedsMonoChannelCountWorkaround(String s, Format format1)
	{
		return Util.SDK_INT <= 18 && format1.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(((Object) (s)));
	//    0    0:getstatic       #117 <Field int Util.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmpgt          28
	//    3    8:aload_1         
	//    4    9:getfield        #263 <Field int Format.channelCount>
	//    5   12:iconst_1        
	//    6   13:icmpne          28
	//    7   16:ldc2            #265 <String "OMX.MTK.AUDIO.DECODER.MP3">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   10   23:ifeq            28
	//   11   26:iconst_1        
	//   12   27:ireturn         
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	private boolean deviceNeedsDrmKeysToConfigureCodecWorkaround()
	{
		return "Amazon".equals(((Object) (Util.MANUFACTURER))) && ("AFTM".equals(((Object) (Util.MODEL))) || "AFTB".equals(((Object) (Util.MODEL))));
	//    0    0:ldc1            #244 <String "Amazon">
	//    1    2:getstatic       #247 <Field String Util.MANUFACTURER>
	//    2    5:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    3    8:ifeq            37
	//    4   11:ldc2            #268 <String "AFTM">
	//    5   14:getstatic       #181 <Field String Util.MODEL>
	//    6   17:invokevirtual   #178 <Method boolean String.equals(Object)>
	//    7   20:ifne            35
	//    8   23:ldc2            #270 <String "AFTB">
	//    9   26:getstatic       #181 <Field String Util.MODEL>
	//   10   29:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   11   32:ifeq            37
	//   12   35:iconst_1        
	//   13   36:ireturn         
	//   14   37:iconst_0        
	//   15   38:ireturn         
	}

	private boolean drainOutputBuffer(long l, long l1)
		throws ExoPlaybackException
	{
		IllegalStateException illegalstateexception;
		if(!hasOutputBuffer())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #279 <Method boolean hasOutputBuffer()>
	//*   2    4:ifne            265
		{
			int i;
			if(codecNeedsEosOutputExceptionWorkaround && codecReceivedEos)
	//*   3    7:aload_0         
	//*   4    8:getfield        #281 <Field boolean codecNeedsEosOutputExceptionWorkaround>
	//*   5   11:ifeq            58
	//*   6   14:aload_0         
	//*   7   15:getfield        #283 <Field boolean codecReceivedEos>
	//*   8   18:ifeq            58
				try
				{
					i = codec.dequeueOutputBuffer(outputBufferInfo, getDequeueOutputBufferTimeoutUs());
	//    9   21:aload_0         
	//   10   22:getfield        #285 <Field MediaCodec codec>
	//   11   25:aload_0         
	//   12   26:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #289 <Method long getDequeueOutputBufferTimeoutUs()>
	//   15   33:invokevirtual   #295 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//   16   36:istore          5
				}
	//*  17   38:goto            75
	//*  18   41:aload_0         
	//*  19   42:invokespecial   #298 <Method void processEndOfStream()>
	//*  20   45:aload_0         
	//*  21   46:getfield        #300 <Field boolean outputStreamEnded>
	//*  22   49:ifeq            56
	//*  23   52:aload_0         
	//*  24   53:invokevirtual   #303 <Method void releaseCodec()>
	//*  25   56:iconst_0        
	//*  26   57:ireturn         
	//*  27   58:aload_0         
	//*  28   59:getfield        #285 <Field MediaCodec codec>
	//*  29   62:aload_0         
	//*  30   63:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  31   66:aload_0         
	//*  32   67:invokevirtual   #289 <Method long getDequeueOutputBufferTimeoutUs()>
	//*  33   70:invokevirtual   #295 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//*  34   73:istore          5
	//*  35   75:iload           5
	//*  36   77:iflt            211
	//*  37   80:aload_0         
	//*  38   81:getfield        #305 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
	//*  39   84:ifeq            104
	//*  40   87:aload_0         
	//*  41   88:iconst_0        
	//*  42   89:putfield        #305 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
	//*  43   92:aload_0         
	//*  44   93:getfield        #285 <Field MediaCodec codec>
	//*  45   96:iload           5
	//*  46   98:iconst_0        
	//*  47   99:invokevirtual   #309 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
	//*  48  102:iconst_1        
	//*  49  103:ireturn         
	//*  50  104:aload_0         
	//*  51  105:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  52  108:getfield        #312 <Field int android.media.MediaCodec$BufferInfo.size>
	//*  53  111:ifne            132
	//*  54  114:aload_0         
	//*  55  115:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  56  118:getfield        #315 <Field int android.media.MediaCodec$BufferInfo.flags>
	//*  57  121:iconst_4        
	//*  58  122:iand            
	//*  59  123:ifeq            132
	//*  60  126:aload_0         
	//*  61  127:invokespecial   #298 <Method void processEndOfStream()>
	//*  62  130:iconst_0        
	//*  63  131:ireturn         
	//*  64  132:aload_0         
	//*  65  133:iload           5
	//*  66  135:putfield        #317 <Field int outputIndex>
	//*  67  138:aload_0         
	//*  68  139:aload_0         
	//*  69  140:iload           5
	//*  70  142:invokespecial   #321 <Method ByteBuffer getOutputBuffer(int)>
	//*  71  145:putfield        #323 <Field ByteBuffer outputBuffer>
	//*  72  148:aload_0         
	//*  73  149:getfield        #323 <Field ByteBuffer outputBuffer>
	//*  74  152:ifnull          193
	//*  75  155:aload_0         
	//*  76  156:getfield        #323 <Field ByteBuffer outputBuffer>
	//*  77  159:aload_0         
	//*  78  160:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  79  163:getfield        #326 <Field int android.media.MediaCodec$BufferInfo.offset>
	//*  80  166:invokevirtual   #332 <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  81  169:pop             
	//*  82  170:aload_0         
	//*  83  171:getfield        #323 <Field ByteBuffer outputBuffer>
	//*  84  174:aload_0         
	//*  85  175:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  86  178:getfield        #326 <Field int android.media.MediaCodec$BufferInfo.offset>
	//*  87  181:aload_0         
	//*  88  182:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  89  185:getfield        #312 <Field int android.media.MediaCodec$BufferInfo.size>
	//*  90  188:iadd            
	//*  91  189:invokevirtual   #335 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//*  92  192:pop             
	//*  93  193:aload_0         
	//*  94  194:aload_0         
	//*  95  195:aload_0         
	//*  96  196:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//*  97  199:getfield        #338 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//*  98  202:invokespecial   #341 <Method boolean shouldSkipOutputBuffer(long)>
	//*  99  205:putfield        #343 <Field boolean shouldSkipOutputBuffer>
	//* 100  208:goto            265
	//* 101  211:iload           5
	//* 102  213:bipush          -2
	//* 103  215:icmpne          224
	//* 104  218:aload_0         
	//* 105  219:invokespecial   #346 <Method void processOutputFormat()>
	//* 106  222:iconst_1        
	//* 107  223:ireturn         
	//* 108  224:iload           5
	//* 109  226:bipush          -3
	//* 110  228:icmpne          237
	//* 111  231:aload_0         
	//* 112  232:invokespecial   #349 <Method void processOutputBuffersChanged()>
	//* 113  235:iconst_1        
	//* 114  236:ireturn         
	//* 115  237:aload_0         
	//* 116  238:getfield        #351 <Field boolean codecNeedsEosPropagationWorkaround>
	//* 117  241:ifeq            263
	//* 118  244:aload_0         
	//* 119  245:getfield        #353 <Field boolean inputStreamEnded>
	//* 120  248:ifne            259
	//* 121  251:aload_0         
	//* 122  252:getfield        #166 <Field int codecReinitializationState>
	//* 123  255:iconst_2        
	//* 124  256:icmpne          263
	//* 125  259:aload_0         
	//* 126  260:invokespecial   #298 <Method void processEndOfStream()>
	//* 127  263:iconst_0        
	//* 128  264:ireturn         
	//* 129  265:aload_0         
	//* 130  266:getfield        #281 <Field boolean codecNeedsEosOutputExceptionWorkaround>
	//* 131  269:ifeq            337
	//* 132  272:aload_0         
	//* 133  273:getfield        #283 <Field boolean codecReceivedEos>
	//* 134  276:ifeq            337
	//* 135  279:aload_0         
	//* 136  280:lload_1         
	//* 137  281:lload_3         
	//* 138  282:aload_0         
	//* 139  283:getfield        #285 <Field MediaCodec codec>
	//* 140  286:aload_0         
	//* 141  287:getfield        #323 <Field ByteBuffer outputBuffer>
	//* 142  290:aload_0         
	//* 143  291:getfield        #317 <Field int outputIndex>
	//* 144  294:aload_0         
	//* 145  295:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 146  298:getfield        #315 <Field int android.media.MediaCodec$BufferInfo.flags>
	//* 147  301:aload_0         
	//* 148  302:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 149  305:getfield        #338 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 150  308:aload_0         
	//* 151  309:getfield        #343 <Field boolean shouldSkipOutputBuffer>
	//* 152  312:invokevirtual   #357 <Method boolean processOutputBuffer(long, long, MediaCodec, ByteBuffer, int, int, long, boolean)>
	//* 153  315:istore          6
	//* 154  317:goto            375
	//* 155  320:aload_0         
	//* 156  321:invokespecial   #298 <Method void processEndOfStream()>
	//* 157  324:aload_0         
	//* 158  325:getfield        #300 <Field boolean outputStreamEnded>
	//* 159  328:ifeq            335
	//* 160  331:aload_0         
	//* 161  332:invokevirtual   #303 <Method void releaseCodec()>
	//* 162  335:iconst_0        
	//* 163  336:ireturn         
	//* 164  337:aload_0         
	//* 165  338:lload_1         
	//* 166  339:lload_3         
	//* 167  340:aload_0         
	//* 168  341:getfield        #285 <Field MediaCodec codec>
	//* 169  344:aload_0         
	//* 170  345:getfield        #323 <Field ByteBuffer outputBuffer>
	//* 171  348:aload_0         
	//* 172  349:getfield        #317 <Field int outputIndex>
	//* 173  352:aload_0         
	//* 174  353:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 175  356:getfield        #315 <Field int android.media.MediaCodec$BufferInfo.flags>
	//* 176  359:aload_0         
	//* 177  360:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 178  363:getfield        #338 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 179  366:aload_0         
	//* 180  367:getfield        #343 <Field boolean shouldSkipOutputBuffer>
	//* 181  370:invokevirtual   #357 <Method boolean processOutputBuffer(long, long, MediaCodec, ByteBuffer, int, int, long, boolean)>
	//* 182  373:istore          6
	//* 183  375:iload           6
	//* 184  377:ifeq            427
	//* 185  380:aload_0         
	//* 186  381:aload_0         
	//* 187  382:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 188  385:getfield        #338 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 189  388:invokevirtual   #361 <Method void onProcessedOutputBuffer(long)>
	//* 190  391:aload_0         
	//* 191  392:getfield        #162 <Field android.media.MediaCodec$BufferInfo outputBufferInfo>
	//* 192  395:getfield        #315 <Field int android.media.MediaCodec$BufferInfo.flags>
	//* 193  398:iconst_4        
	//* 194  399:iand            
	//* 195  400:ifeq            409
	//* 196  403:iconst_1        
	//* 197  404:istore          5
	//* 198  406:goto            412
	//* 199  409:iconst_0        
	//* 200  410:istore          5
	//* 201  412:aload_0         
	//* 202  413:invokespecial   #364 <Method void resetOutputBuffer()>
	//* 203  416:iload           5
	//* 204  418:ifne            423
	//* 205  421:iconst_1        
	//* 206  422:ireturn         
	//* 207  423:aload_0         
	//* 208  424:invokespecial   #298 <Method void processEndOfStream()>
	//* 209  427:iconst_0        
	//* 210  428:ireturn         
				// Misplaced declaration of an exception variable
				catch(IllegalStateException illegalstateexception)
				{
					processEndOfStream();
					if(outputStreamEnded)
						releaseCodec();
					return false;
				}
			else
				i = codec.dequeueOutputBuffer(outputBufferInfo, getDequeueOutputBufferTimeoutUs());
			if(i >= 0)
			{
				if(shouldSkipAdaptationWorkaroundOutputBuffer)
				{
					shouldSkipAdaptationWorkaroundOutputBuffer = false;
					codec.releaseOutputBuffer(i, false);
					return true;
				}
				if(outputBufferInfo.size == 0 && (outputBufferInfo.flags & 4) != 0)
				{
					processEndOfStream();
					return false;
				}
				outputIndex = i;
				outputBuffer = getOutputBuffer(i);
				if(outputBuffer != null)
				{
					outputBuffer.position(outputBufferInfo.offset);
					outputBuffer.limit(outputBufferInfo.offset + outputBufferInfo.size);
				}
				shouldSkipOutputBuffer = shouldSkipOutputBuffer(outputBufferInfo.presentationTimeUs);
			} else
			{
				if(i == -2)
				{
					processOutputFormat();
					return true;
				}
				if(i == -3)
				{
					processOutputBuffersChanged();
					return true;
				}
				if(codecNeedsEosPropagationWorkaround && (inputStreamEnded || codecReinitializationState == 2))
					processEndOfStream();
				return false;
			}
		}
		boolean flag1;
		if(codecNeedsEosOutputExceptionWorkaround && codecReceivedEos)
			try
			{
				flag1 = processOutputBuffer(l, l1, codec, outputBuffer, outputIndex, outputBufferInfo.flags, outputBufferInfo.presentationTimeUs, shouldSkipOutputBuffer);
			}
	//* 211  429:astore          7
	//* 212  431:goto            41
			// Misplaced declaration of an exception variable
			catch(IllegalStateException illegalstateexception)
			{
				processEndOfStream();
				if(outputStreamEnded)
					releaseCodec();
				return false;
			}
		else
			flag1 = processOutputBuffer(l, l1, codec, outputBuffer, outputIndex, outputBufferInfo.flags, outputBufferInfo.presentationTimeUs, shouldSkipOutputBuffer);
		if(flag1)
		{
			onProcessedOutputBuffer(outputBufferInfo.presentationTimeUs);
			boolean flag;
			if((outputBufferInfo.flags & 4) != 0)
				flag = true;
			else
				flag = false;
			resetOutputBuffer();
			if(!flag)
				return true;
			processEndOfStream();
		}
		return false;
	//* 213  434:astore          7
	//* 214  436:goto            320
	}

	private boolean feedInputBuffer()
		throws ExoPlaybackException
	{
		int i;
		if(codec == null || codecReinitializationState == 2)
			break MISSING_BLOCK_LABEL_694;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field MediaCodec codec>
	//    2    4:ifnull          694
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field int codecReinitializationState>
	//    5   11:iconst_2        
	//    6   12:icmpeq          694
		if(inputStreamEnded)
	//*   7   15:aload_0         
	//*   8   16:getfield        #353 <Field boolean inputStreamEnded>
	//*   9   19:ifeq            24
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		if(inputIndex < 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #370 <Field int inputIndex>
	//*  14   28:ifge            74
		{
			inputIndex = codec.dequeueInputBuffer(0L);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #285 <Field MediaCodec codec>
	//   18   36:lconst_0        
	//   19   37:invokevirtual   #374 <Method int MediaCodec.dequeueInputBuffer(long)>
	//   20   40:putfield        #370 <Field int inputIndex>
			if(inputIndex < 0)
	//*  21   43:aload_0         
	//*  22   44:getfield        #370 <Field int inputIndex>
	//*  23   47:ifge            52
				return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
			buffer.data = getInputBuffer(inputIndex);
	//   26   52:aload_0         
	//   27   53:getfield        #140 <Field DecoderInputBuffer buffer>
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #370 <Field int inputIndex>
	//   31   61:invokespecial   #377 <Method ByteBuffer getInputBuffer(int)>
	//   32   64:putfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
			buffer.clear();
	//   33   67:aload_0         
	//   34   68:getfield        #140 <Field DecoderInputBuffer buffer>
	//   35   71:invokevirtual   #383 <Method void DecoderInputBuffer.clear()>
		}
		if(codecReinitializationState == 1)
	//*  36   74:aload_0         
	//*  37   75:getfield        #166 <Field int codecReinitializationState>
	//*  38   78:iconst_1        
	//*  39   79:icmpne          123
		{
			if(!codecNeedsEosPropagationWorkaround)
	//*  40   82:aload_0         
	//*  41   83:getfield        #351 <Field boolean codecNeedsEosPropagationWorkaround>
	//*  42   86:ifeq            92
	//*  43   89:goto            116
			{
				codecReceivedEos = true;
	//   44   92:aload_0         
	//   45   93:iconst_1        
	//   46   94:putfield        #283 <Field boolean codecReceivedEos>
				codec.queueInputBuffer(inputIndex, 0, 0, 0L, 4);
	//   47   97:aload_0         
	//   48   98:getfield        #285 <Field MediaCodec codec>
	//   49  101:aload_0         
	//   50  102:getfield        #370 <Field int inputIndex>
	//   51  105:iconst_0        
	//   52  106:iconst_0        
	//   53  107:lconst_0        
	//   54  108:iconst_4        
	//   55  109:invokevirtual   #387 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
				resetInputBuffer();
	//   56  112:aload_0         
	//   57  113:invokespecial   #390 <Method void resetInputBuffer()>
			}
			codecReinitializationState = 2;
	//   58  116:aload_0         
	//   59  117:iconst_2        
	//   60  118:putfield        #166 <Field int codecReinitializationState>
			return false;
	//   61  121:iconst_0        
	//   62  122:ireturn         
		}
		if(codecNeedsAdaptationWorkaroundBuffer)
	//*  63  123:aload_0         
	//*  64  124:getfield        #392 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
	//*  65  127:ifeq            178
		{
			codecNeedsAdaptationWorkaroundBuffer = false;
	//   66  130:aload_0         
	//   67  131:iconst_0        
	//   68  132:putfield        #392 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
			buffer.data.put(ADAPTATION_WORKAROUND_BUFFER);
	//   69  135:aload_0         
	//   70  136:getfield        #140 <Field DecoderInputBuffer buffer>
	//   71  139:getfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//   72  142:getstatic       #108 <Field byte[] ADAPTATION_WORKAROUND_BUFFER>
	//   73  145:invokevirtual   #396 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   74  148:pop             
			codec.queueInputBuffer(inputIndex, 0, ADAPTATION_WORKAROUND_BUFFER.length, 0L, 0);
	//   75  149:aload_0         
	//   76  150:getfield        #285 <Field MediaCodec codec>
	//   77  153:aload_0         
	//   78  154:getfield        #370 <Field int inputIndex>
	//   79  157:iconst_0        
	//   80  158:getstatic       #108 <Field byte[] ADAPTATION_WORKAROUND_BUFFER>
	//   81  161:arraylength     
	//   82  162:lconst_0        
	//   83  163:iconst_0        
	//   84  164:invokevirtual   #387 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
			resetInputBuffer();
	//   85  167:aload_0         
	//   86  168:invokespecial   #390 <Method void resetInputBuffer()>
			codecReceivedBuffers = true;
	//   87  171:aload_0         
	//   88  172:iconst_1        
	//   89  173:putfield        #398 <Field boolean codecReceivedBuffers>
			return true;
	//   90  176:iconst_1        
	//   91  177:ireturn         
		}
		int j;
		if(waitingForKeys)
	//*  92  178:aload_0         
	//*  93  179:getfield        #400 <Field boolean waitingForKeys>
	//*  94  182:ifeq            193
		{
			j = -4;
	//   95  185:bipush          -4
	//   96  187:istore_2        
			i = 0;
	//   97  188:iconst_0        
	//   98  189:istore_1        
		} else
	//*  99  190:goto            287
		{
			if(codecReconfigurationState == 1)
	//* 100  193:aload_0         
	//* 101  194:getfield        #164 <Field int codecReconfigurationState>
	//* 102  197:iconst_1        
	//* 103  198:icmpne          262
			{
				for(i = 0; i < format.initializationData.size(); i++)
	//* 104  201:iconst_0        
	//* 105  202:istore_1        
	//* 106  203:iload_1         
	//* 107  204:aload_0         
	//* 108  205:getfield        #402 <Field Format format>
	//* 109  208:getfield        #214 <Field List Format.initializationData>
	//* 110  211:invokeinterface #405 <Method int List.size()>
	//* 111  216:icmpge          257
				{
					byte abyte0[] = (byte[])format.initializationData.get(i);
	//  112  219:aload_0         
	//  113  220:getfield        #402 <Field Format format>
	//  114  223:getfield        #214 <Field List Format.initializationData>
	//  115  226:iload_1         
	//  116  227:invokeinterface #409 <Method Object List.get(int)>
	//  117  232:checkcast       #410 <Class byte[]>
	//  118  235:astore          6
					buffer.data.put(abyte0);
	//  119  237:aload_0         
	//  120  238:getfield        #140 <Field DecoderInputBuffer buffer>
	//  121  241:getfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//  122  244:aload           6
	//  123  246:invokevirtual   #396 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  124  249:pop             
				}

	//  125  250:iload_1         
	//  126  251:iconst_1        
	//  127  252:iadd            
	//  128  253:istore_1        
	//* 129  254:goto            203
				codecReconfigurationState = 2;
	//  130  257:aload_0         
	//  131  258:iconst_2        
	//  132  259:putfield        #164 <Field int codecReconfigurationState>
			}
			i = buffer.data.position();
	//  133  262:aload_0         
	//  134  263:getfield        #140 <Field DecoderInputBuffer buffer>
	//  135  266:getfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//  136  269:invokevirtual   #412 <Method int ByteBuffer.position()>
	//  137  272:istore_1        
			j = readSource(formatHolder, buffer, false);
	//  138  273:aload_0         
	//  139  274:aload_0         
	//  140  275:getfield        #152 <Field FormatHolder formatHolder>
	//  141  278:aload_0         
	//  142  279:getfield        #140 <Field DecoderInputBuffer buffer>
	//  143  282:iconst_0        
	//  144  283:invokevirtual   #416 <Method int readSource(FormatHolder, DecoderInputBuffer, boolean)>
	//  145  286:istore_2        
		}
		if(j == -3)
	//* 146  287:iload_2         
	//* 147  288:bipush          -3
	//* 148  290:icmpne          295
			return false;
	//  149  293:iconst_0        
	//  150  294:ireturn         
		if(j == -5)
	//* 151  295:iload_2         
	//* 152  296:bipush          -5
	//* 153  298:icmpne          334
		{
			if(codecReconfigurationState == 2)
	//* 154  301:aload_0         
	//* 155  302:getfield        #164 <Field int codecReconfigurationState>
	//* 156  305:iconst_2        
	//* 157  306:icmpne          321
			{
				buffer.clear();
	//  158  309:aload_0         
	//  159  310:getfield        #140 <Field DecoderInputBuffer buffer>
	//  160  313:invokevirtual   #383 <Method void DecoderInputBuffer.clear()>
				codecReconfigurationState = 1;
	//  161  316:aload_0         
	//  162  317:iconst_1        
	//  163  318:putfield        #164 <Field int codecReconfigurationState>
			}
			onInputFormatChanged(formatHolder.format);
	//  164  321:aload_0         
	//  165  322:aload_0         
	//  166  323:getfield        #152 <Field FormatHolder formatHolder>
	//  167  326:getfield        #417 <Field Format FormatHolder.format>
	//  168  329:invokevirtual   #421 <Method void onInputFormatChanged(Format)>
			return true;
	//  169  332:iconst_1        
	//  170  333:ireturn         
		}
		if(!buffer.isEndOfStream())
			break MISSING_BLOCK_LABEL_429;
	//  171  334:aload_0         
	//  172  335:getfield        #140 <Field DecoderInputBuffer buffer>
	//  173  338:invokevirtual   #424 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//  174  341:ifeq            429
		if(codecReconfigurationState == 2)
	//* 175  344:aload_0         
	//* 176  345:getfield        #164 <Field int codecReconfigurationState>
	//* 177  348:iconst_2        
	//* 178  349:icmpne          364
		{
			buffer.clear();
	//  179  352:aload_0         
	//  180  353:getfield        #140 <Field DecoderInputBuffer buffer>
	//  181  356:invokevirtual   #383 <Method void DecoderInputBuffer.clear()>
			codecReconfigurationState = 1;
	//  182  359:aload_0         
	//  183  360:iconst_1        
	//  184  361:putfield        #164 <Field int codecReconfigurationState>
		}
		inputStreamEnded = true;
	//  185  364:aload_0         
	//  186  365:iconst_1        
	//  187  366:putfield        #353 <Field boolean inputStreamEnded>
		if(!codecReceivedBuffers)
	//* 188  369:aload_0         
	//* 189  370:getfield        #398 <Field boolean codecReceivedBuffers>
	//* 190  373:ifne            382
		{
			processEndOfStream();
	//  191  376:aload_0         
	//  192  377:invokespecial   #298 <Method void processEndOfStream()>
			return false;
	//  193  380:iconst_0        
	//  194  381:ireturn         
		}
		if(codecNeedsEosPropagationWorkaround)
	//* 195  382:aload_0         
	//* 196  383:getfield        #351 <Field boolean codecNeedsEosPropagationWorkaround>
	//* 197  386:ifeq            391
			return false;
	//  198  389:iconst_0        
	//  199  390:ireturn         
		try
		{
			codecReceivedEos = true;
	//  200  391:aload_0         
	//  201  392:iconst_1        
	//  202  393:putfield        #283 <Field boolean codecReceivedEos>
			codec.queueInputBuffer(inputIndex, 0, 0, 0L, 4);
	//  203  396:aload_0         
	//  204  397:getfield        #285 <Field MediaCodec codec>
	//  205  400:aload_0         
	//  206  401:getfield        #370 <Field int inputIndex>
	//  207  404:iconst_0        
	//  208  405:iconst_0        
	//  209  406:lconst_0        
	//  210  407:iconst_4        
	//  211  408:invokevirtual   #387 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
			resetInputBuffer();
	//  212  411:aload_0         
	//  213  412:invokespecial   #390 <Method void resetInputBuffer()>
		}
	//* 214  415:iconst_0        
	//* 215  416:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception)
	//* 216  417:astore          6
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (cryptoexception)), getIndex());
	//  217  419:aload           6
	//  218  421:aload_0         
	//  219  422:invokevirtual   #427 <Method int getIndex()>
	//  220  425:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//  221  428:athrow          
		}
		return false;
		if(waitingForFirstSyncFrame && !buffer.isKeyFrame())
	//* 222  429:aload_0         
	//* 223  430:getfield        #433 <Field boolean waitingForFirstSyncFrame>
	//* 224  433:ifeq            468
	//* 225  436:aload_0         
	//* 226  437:getfield        #140 <Field DecoderInputBuffer buffer>
	//* 227  440:invokevirtual   #436 <Method boolean DecoderInputBuffer.isKeyFrame()>
	//* 228  443:ifne            468
		{
			buffer.clear();
	//  229  446:aload_0         
	//  230  447:getfield        #140 <Field DecoderInputBuffer buffer>
	//  231  450:invokevirtual   #383 <Method void DecoderInputBuffer.clear()>
			if(codecReconfigurationState == 2)
	//* 232  453:aload_0         
	//* 233  454:getfield        #164 <Field int codecReconfigurationState>
	//* 234  457:iconst_2        
	//* 235  458:icmpne          466
				codecReconfigurationState = 1;
	//  236  461:aload_0         
	//  237  462:iconst_1        
	//  238  463:putfield        #164 <Field int codecReconfigurationState>
			return true;
	//  239  466:iconst_1        
	//  240  467:ireturn         
		}
		waitingForFirstSyncFrame = false;
	//  241  468:aload_0         
	//  242  469:iconst_0        
	//  243  470:putfield        #433 <Field boolean waitingForFirstSyncFrame>
		boolean flag = buffer.isEncrypted();
	//  244  473:aload_0         
	//  245  474:getfield        #140 <Field DecoderInputBuffer buffer>
	//  246  477:invokevirtual   #439 <Method boolean DecoderInputBuffer.isEncrypted()>
	//  247  480:istore_3        
		waitingForKeys = shouldWaitForKeys(flag);
	//  248  481:aload_0         
	//  249  482:aload_0         
	//  250  483:iload_3         
	//  251  484:invokespecial   #443 <Method boolean shouldWaitForKeys(boolean)>
	//  252  487:putfield        #400 <Field boolean waitingForKeys>
		if(waitingForKeys)
	//* 253  490:aload_0         
	//* 254  491:getfield        #400 <Field boolean waitingForKeys>
	//* 255  494:ifeq            499
			return false;
	//  256  497:iconst_0        
	//  257  498:ireturn         
		if(codecNeedsDiscardToSpsWorkaround && !flag)
	//* 258  499:aload_0         
	//* 259  500:getfield        #445 <Field boolean codecNeedsDiscardToSpsWorkaround>
	//* 260  503:ifeq            540
	//* 261  506:iload_3         
	//* 262  507:ifne            540
		{
			NalUnitUtil.discardToSps(buffer.data);
	//  263  510:aload_0         
	//  264  511:getfield        #140 <Field DecoderInputBuffer buffer>
	//  265  514:getfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//  266  517:invokestatic    #451 <Method void NalUnitUtil.discardToSps(ByteBuffer)>
			if(buffer.data.position() == 0)
	//* 267  520:aload_0         
	//* 268  521:getfield        #140 <Field DecoderInputBuffer buffer>
	//* 269  524:getfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//* 270  527:invokevirtual   #412 <Method int ByteBuffer.position()>
	//* 271  530:ifne            535
				return true;
	//  272  533:iconst_1        
	//  273  534:ireturn         
			codecNeedsDiscardToSpsWorkaround = false;
	//  274  535:aload_0         
	//  275  536:iconst_0        
	//  276  537:putfield        #445 <Field boolean codecNeedsDiscardToSpsWorkaround>
		}
		long l;
		Object obj;
		try
		{
			l = buffer.timeUs;
	//  277  540:aload_0         
	//  278  541:getfield        #140 <Field DecoderInputBuffer buffer>
	//  279  544:getfield        #454 <Field long DecoderInputBuffer.timeUs>
	//  280  547:lstore          4
			if(buffer.isDecodeOnly())
	//* 281  549:aload_0         
	//* 282  550:getfield        #140 <Field DecoderInputBuffer buffer>
	//* 283  553:invokevirtual   #457 <Method boolean DecoderInputBuffer.isDecodeOnly()>
	//* 284  556:ifeq            574
				decodeOnlyPresentationTimestamps.add(((Object) (Long.valueOf(l))));
	//  285  559:aload_0         
	//  286  560:getfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//  287  563:lload           4
	//  288  565:invokestatic    #463 <Method Long Long.valueOf(long)>
	//  289  568:invokeinterface #466 <Method boolean List.add(Object)>
	//  290  573:pop             
			buffer.flip();
	//  291  574:aload_0         
	//  292  575:getfield        #140 <Field DecoderInputBuffer buffer>
	//  293  578:invokevirtual   #469 <Method void DecoderInputBuffer.flip()>
			onQueueInputBuffer(buffer);
	//  294  581:aload_0         
	//  295  582:aload_0         
	//  296  583:getfield        #140 <Field DecoderInputBuffer buffer>
	//  297  586:invokevirtual   #473 <Method void onQueueInputBuffer(DecoderInputBuffer)>
		}
	//* 298  589:iload_3         
	//* 299  590:ifeq            623
	//* 300  593:aload_0         
	//* 301  594:getfield        #140 <Field DecoderInputBuffer buffer>
	//* 302  597:iload_1         
	//* 303  598:invokestatic    #477 <Method android.media.MediaCodec$CryptoInfo getFrameworkCryptoInfo(DecoderInputBuffer, int)>
	//* 304  601:astore          6
	//* 305  603:aload_0         
	//* 306  604:getfield        #285 <Field MediaCodec codec>
	//* 307  607:aload_0         
	//* 308  608:getfield        #370 <Field int inputIndex>
	//* 309  611:iconst_0        
	//* 310  612:aload           6
	//* 311  614:lload           4
	//* 312  616:iconst_0        
	//* 313  617:invokevirtual   #481 <Method void MediaCodec.queueSecureInputBuffer(int, int, android.media.MediaCodec$CryptoInfo, long, int)>
	//* 314  620:goto            648
	//* 315  623:aload_0         
	//* 316  624:getfield        #285 <Field MediaCodec codec>
	//* 317  627:aload_0         
	//* 318  628:getfield        #370 <Field int inputIndex>
	//* 319  631:iconst_0        
	//* 320  632:aload_0         
	//* 321  633:getfield        #140 <Field DecoderInputBuffer buffer>
	//* 322  636:getfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//* 323  639:invokevirtual   #483 <Method int ByteBuffer.limit()>
	//* 324  642:lload           4
	//* 325  644:iconst_0        
	//* 326  645:invokevirtual   #387 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
	//* 327  648:aload_0         
	//* 328  649:invokespecial   #390 <Method void resetInputBuffer()>
	//* 329  652:aload_0         
	//* 330  653:iconst_1        
	//* 331  654:putfield        #398 <Field boolean codecReceivedBuffers>
	//* 332  657:aload_0         
	//* 333  658:iconst_0        
	//* 334  659:putfield        #164 <Field int codecReconfigurationState>
	//* 335  662:aload_0         
	//* 336  663:getfield        #485 <Field DecoderCounters decoderCounters>
	//* 337  666:astore          6
	//* 338  668:aload           6
	//* 339  670:aload           6
	//* 340  672:getfield        #490 <Field int DecoderCounters.inputBufferCount>
	//* 341  675:iconst_1        
	//* 342  676:iadd            
	//* 343  677:putfield        #490 <Field int DecoderCounters.inputBufferCount>
	//* 344  680:iconst_1        
	//* 345  681:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception1)
	//* 346  682:astore          6
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (cryptoexception1)), getIndex());
	//  347  684:aload           6
	//  348  686:aload_0         
	//  349  687:invokevirtual   #427 <Method int getIndex()>
	//  350  690:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//  351  693:athrow          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_623;
		obj = ((Object) (getFrameworkCryptoInfo(buffer, i)));
		codec.queueSecureInputBuffer(inputIndex, 0, ((android.media.MediaCodec.CryptoInfo) (obj)), l, 0);
		break MISSING_BLOCK_LABEL_648;
		codec.queueInputBuffer(inputIndex, 0, buffer.data.limit(), l, 0);
		resetInputBuffer();
		codecReceivedBuffers = true;
		codecReconfigurationState = 0;
		obj = ((Object) (decoderCounters));
		obj.inputBufferCount = ((DecoderCounters) (obj)).inputBufferCount + 1;
		return true;
		return false;
	//  352  694:iconst_0        
	//  353  695:ireturn         
	}

	private void getCodecBuffers()
	{
		if(Util.SDK_INT < 21)
	//*   0    0:getstatic       #117 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          30
		{
			inputBuffers = codec.getInputBuffers();
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:getfield        #285 <Field MediaCodec codec>
	//    6   13:invokevirtual   #495 <Method ByteBuffer[] MediaCodec.getInputBuffers()>
	//    7   16:putfield        #497 <Field ByteBuffer[] inputBuffers>
			outputBuffers = codec.getOutputBuffers();
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #285 <Field MediaCodec codec>
	//   11   24:invokevirtual   #500 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//   12   27:putfield        #502 <Field ByteBuffer[] outputBuffers>
		}
	//   13   30:return          
	}

	private static android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfo(DecoderInputBuffer decoderinputbuffer, int i)
	{
		decoderinputbuffer = ((DecoderInputBuffer) (decoderinputbuffer.cryptoInfo.getFrameworkCryptoInfoV16()));
	//    0    0:aload_0         
	//    1    1:getfield        #506 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//    2    4:invokevirtual   #512 <Method android.media.MediaCodec$CryptoInfo CryptoInfo.getFrameworkCryptoInfoV16()>
	//    3    7:astore_0        
		if(i == 0)
	//*   4    8:iload_1         
	//*   5    9:ifne            14
			return ((android.media.MediaCodec.CryptoInfo) (decoderinputbuffer));
	//    6   12:aload_0         
	//    7   13:areturn         
		if(((android.media.MediaCodec.CryptoInfo) (decoderinputbuffer)).numBytesOfClearData == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #518 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//*  10   18:ifnonnull       28
			decoderinputbuffer.numBytesOfClearData = new int[1];
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:newarray        int[]
	//   14   25:putfield        #518 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
		int ai[] = ((android.media.MediaCodec.CryptoInfo) (decoderinputbuffer)).numBytesOfClearData;
	//   15   28:aload_0         
	//   16   29:getfield        #518 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
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
		return ((android.media.MediaCodec.CryptoInfo) (decoderinputbuffer));
	//   26   41:aload_0         
	//   27   42:areturn         
	}

	private ByteBuffer getInputBuffer(int i)
	{
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #117 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return codec.getInputBuffer(i);
	//    3    8:aload_0         
	//    4    9:getfield        #285 <Field MediaCodec codec>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #519 <Method ByteBuffer MediaCodec.getInputBuffer(int)>
	//    7   16:areturn         
		else
			return inputBuffers[i];
	//    8   17:aload_0         
	//    9   18:getfield        #497 <Field ByteBuffer[] inputBuffers>
	//   10   21:iload_1         
	//   11   22:aaload          
	//   12   23:areturn         
	}

	private ByteBuffer getOutputBuffer(int i)
	{
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #117 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return codec.getOutputBuffer(i);
	//    3    8:aload_0         
	//    4    9:getfield        #285 <Field MediaCodec codec>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #520 <Method ByteBuffer MediaCodec.getOutputBuffer(int)>
	//    7   16:areturn         
		else
			return outputBuffers[i];
	//    8   17:aload_0         
	//    9   18:getfield        #502 <Field ByteBuffer[] outputBuffers>
	//   10   21:iload_1         
	//   11   22:aaload          
	//   12   23:areturn         
	}

	private boolean hasOutputBuffer()
	{
		return outputIndex >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field int outputIndex>
	//    2    4:iflt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private void processEndOfStream()
		throws ExoPlaybackException
	{
		if(codecReinitializationState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field int codecReinitializationState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          17
		{
			releaseCodec();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #303 <Method void releaseCodec()>
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
	//   11   19:putfield        #300 <Field boolean outputStreamEnded>
			renderToEndOfStream();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #526 <Method void renderToEndOfStream()>
			return;
	//   14   26:return          
		}
	}

	private void processOutputBuffersChanged()
	{
		if(Util.SDK_INT < 21)
	//*   0    0:getstatic       #117 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          19
			outputBuffers = codec.getOutputBuffers();
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:getfield        #285 <Field MediaCodec codec>
	//    6   13:invokevirtual   #500 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//    7   16:putfield        #502 <Field ByteBuffer[] outputBuffers>
	//    8   19:return          
	}

	private void processOutputFormat()
		throws ExoPlaybackException
	{
		MediaFormat mediaformat = codec.getOutputFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field MediaCodec codec>
	//    2    4:invokevirtual   #530 <Method MediaFormat MediaCodec.getOutputFormat()>
	//    3    7:astore_1        
		if(codecAdaptationWorkaroundMode != 0 && mediaformat.getInteger("width") == 32 && mediaformat.getInteger("height") == 32)
	//*   4    8:aload_0         
	//*   5    9:getfield        #532 <Field int codecAdaptationWorkaroundMode>
	//*   6   12:ifeq            45
	//*   7   15:aload_1         
	//*   8   16:ldc2            #534 <String "width">
	//*   9   19:invokevirtual   #539 <Method int MediaFormat.getInteger(String)>
	//*  10   22:bipush          32
	//*  11   24:icmpne          45
	//*  12   27:aload_1         
	//*  13   28:ldc2            #541 <String "height">
	//*  14   31:invokevirtual   #539 <Method int MediaFormat.getInteger(String)>
	//*  15   34:bipush          32
	//*  16   36:icmpne          45
		{
			shouldSkipAdaptationWorkaroundOutputBuffer = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #305 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
			return;
	//   20   44:return          
		}
		if(codecNeedsMonoChannelCountWorkaround)
	//*  21   45:aload_0         
	//*  22   46:getfield        #543 <Field boolean codecNeedsMonoChannelCountWorkaround>
	//*  23   49:ifeq            60
			mediaformat.setInteger("channel-count", 1);
	//   24   52:aload_1         
	//   25   53:ldc2            #545 <String "channel-count">
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #549 <Method void MediaFormat.setInteger(String, int)>
		onOutputFormatChanged(codec, mediaformat);
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #285 <Field MediaCodec codec>
	//   31   65:aload_1         
	//   32   66:invokevirtual   #553 <Method void onOutputFormatChanged(MediaCodec, MediaFormat)>
	//   33   69:return          
	}

	private void resetCodecBuffers()
	{
		if(Util.SDK_INT < 21)
	//*   0    0:getstatic       #117 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          18
		{
			inputBuffers = null;
	//    3    8:aload_0         
	//    4    9:aconst_null     
	//    5   10:putfield        #497 <Field ByteBuffer[] inputBuffers>
			outputBuffers = null;
	//    6   13:aload_0         
	//    7   14:aconst_null     
	//    8   15:putfield        #502 <Field ByteBuffer[] outputBuffers>
		}
	//    9   18:return          
	}

	private void resetInputBuffer()
	{
		inputIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #370 <Field int inputIndex>
		buffer.data = null;
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field DecoderInputBuffer buffer>
	//    5    9:aconst_null     
	//    6   10:putfield        #380 <Field ByteBuffer DecoderInputBuffer.data>
	//    7   13:return          
	}

	private void resetOutputBuffer()
	{
		outputIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #317 <Field int outputIndex>
		outputBuffer = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #323 <Field ByteBuffer outputBuffer>
	//    6   10:return          
	}

	private boolean shouldSkipOutputBuffer(long l)
	{
		int j = decodeOnlyPresentationTimestamps.size();
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//    2    4:invokeinterface #405 <Method int List.size()>
	//    3    9:istore          4
		for(int i = 0; i < j; i++)
	//*   4   11:iconst_0        
	//*   5   12:istore_3        
	//*   6   13:iload_3         
	//*   7   14:iload           4
	//*   8   16:icmpge          60
			if(((Long)decodeOnlyPresentationTimestamps.get(i)).longValue() == l)
	//*   9   19:aload_0         
	//*  10   20:getfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//*  11   23:iload_3         
	//*  12   24:invokeinterface #409 <Method Object List.get(int)>
	//*  13   29:checkcast       #459 <Class Long>
	//*  14   32:invokevirtual   #557 <Method long Long.longValue()>
	//*  15   35:lload_1         
	//*  16   36:lcmp            
	//*  17   37:ifne            53
			{
				decodeOnlyPresentationTimestamps.remove(i);
	//   18   40:aload_0         
	//   19   41:getfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//   20   44:iload_3         
	//   21   45:invokeinterface #560 <Method Object List.remove(int)>
	//   22   50:pop             
				return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
			}

	//   25   53:iload_3         
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:istore_3        
	//*  29   57:goto            13
		return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
	}

	private boolean shouldWaitForKeys(boolean flag)
		throws ExoPlaybackException
	{
		if(drmSession != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #562 <Field DrmSession drmSession>
	//*   2    4:ifnull          61
		{
			if(!flag && playClearSamplesWithoutKeys)
	//*   3    7:iload_1         
	//*   4    8:ifne            20
	//*   5   11:aload_0         
	//*   6   12:getfield        #135 <Field boolean playClearSamplesWithoutKeys>
	//*   7   15:ifeq            20
				return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
			int i = drmSession.getState();
	//   10   20:aload_0         
	//   11   21:getfield        #562 <Field DrmSession drmSession>
	//   12   24:invokeinterface #567 <Method int DrmSession.getState()>
	//   13   29:istore_2        
			if(i == 1)
	//*  14   30:iload_2         
	//*  15   31:iconst_1        
	//*  16   32:icmpne          52
				throw ExoPlaybackException.createForRenderer(((Exception) (drmSession.getError())), getIndex());
	//   17   35:aload_0         
	//   18   36:getfield        #562 <Field DrmSession drmSession>
	//   19   39:invokeinterface #571 <Method com.google.android.exoplayer2.drm.DrmSession$DrmSessionException DrmSession.getError()>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #427 <Method int getIndex()>
	//   22   48:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
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

	private void throwDecoderInitError(DecoderInitializationException decoderinitializationexception)
		throws ExoPlaybackException
	{
		throw ExoPlaybackException.createForRenderer(((Exception) (decoderinitializationexception)), getIndex());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #427 <Method int getIndex()>
	//    3    5:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//    4    8:athrow          
	}

	protected int canKeepCodec(MediaCodec mediacodec, MediaCodecInfo mediacodecinfo, Format format1, Format format2)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected abstract void configureCodec(MediaCodecInfo mediacodecinfo, MediaCodec mediacodec, Format format1, MediaCrypto mediacrypto)
		throws MediaCodecUtil.DecoderQueryException;

	protected void flushCodec()
		throws ExoPlaybackException
	{
		codecHotswapDeadlineMs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #581 <Long 0x1L>
	//    2    4:putfield        #584 <Field long codecHotswapDeadlineMs>
		resetInputBuffer();
	//    3    7:aload_0         
	//    4    8:invokespecial   #390 <Method void resetInputBuffer()>
		resetOutputBuffer();
	//    5   11:aload_0         
	//    6   12:invokespecial   #364 <Method void resetOutputBuffer()>
		waitingForFirstSyncFrame = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #433 <Field boolean waitingForFirstSyncFrame>
		waitingForKeys = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #400 <Field boolean waitingForKeys>
		shouldSkipOutputBuffer = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #343 <Field boolean shouldSkipOutputBuffer>
		decodeOnlyPresentationTimestamps.clear();
	//   16   30:aload_0         
	//   17   31:getfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//   18   34:invokeinterface #585 <Method void List.clear()>
		codecNeedsAdaptationWorkaroundBuffer = false;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #392 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
		shouldSkipAdaptationWorkaroundOutputBuffer = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #305 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
		if(!codecNeedsFlushWorkaround && (!codecNeedsEosFlushWorkaround || !codecReceivedEos))
	//*  25   49:aload_0         
	//*  26   50:getfield        #587 <Field boolean codecNeedsFlushWorkaround>
	//*  27   53:ifne            106
	//*  28   56:aload_0         
	//*  29   57:getfield        #589 <Field boolean codecNeedsEosFlushWorkaround>
	//*  30   60:ifeq            73
	//*  31   63:aload_0         
	//*  32   64:getfield        #283 <Field boolean codecReceivedEos>
	//*  33   67:ifeq            73
	//*  34   70:goto            106
		{
			if(codecReinitializationState != 0)
	//*  35   73:aload_0         
	//*  36   74:getfield        #166 <Field int codecReinitializationState>
	//*  37   77:ifeq            91
			{
				releaseCodec();
	//   38   80:aload_0         
	//   39   81:invokevirtual   #303 <Method void releaseCodec()>
				maybeInitCodec();
	//   40   84:aload_0         
	//   41   85:invokevirtual   #523 <Method void maybeInitCodec()>
			} else
	//*  42   88:goto            114
			{
				codec.flush();
	//   43   91:aload_0         
	//   44   92:getfield        #285 <Field MediaCodec codec>
	//   45   95:invokevirtual   #592 <Method void MediaCodec.flush()>
				codecReceivedBuffers = false;
	//   46   98:aload_0         
	//   47   99:iconst_0        
	//   48  100:putfield        #398 <Field boolean codecReceivedBuffers>
			}
		} else
	//*  49  103:goto            114
		{
			releaseCodec();
	//   50  106:aload_0         
	//   51  107:invokevirtual   #303 <Method void releaseCodec()>
			maybeInitCodec();
	//   52  110:aload_0         
	//   53  111:invokevirtual   #523 <Method void maybeInitCodec()>
		}
		if(codecReconfigured && format != null)
	//*  54  114:aload_0         
	//*  55  115:getfield        #594 <Field boolean codecReconfigured>
	//*  56  118:ifeq            133
	//*  57  121:aload_0         
	//*  58  122:getfield        #402 <Field Format format>
	//*  59  125:ifnull          133
			codecReconfigurationState = 1;
	//   60  128:aload_0         
	//   61  129:iconst_1        
	//   62  130:putfield        #164 <Field int codecReconfigurationState>
	//   63  133:return          
	}

	protected final MediaCodec getCodec()
	{
		return codec;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field MediaCodec codec>
	//    2    4:areturn         
	}

	protected final MediaCodecInfo getCodecInfo()
	{
		return codecInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #600 <Field MediaCodecInfo codecInfo>
	//    2    4:areturn         
	}

	protected MediaCodecInfo getDecoderInfo(MediaCodecSelector mediacodecselector, Format format1, boolean flag)
		throws MediaCodecUtil.DecoderQueryException
	{
		return mediacodecselector.getDecoderInfo(format1.sampleMimeType, flag);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getfield        #605 <Field String Format.sampleMimeType>
	//    3    5:iload_3         
	//    4    6:invokeinterface #608 <Method MediaCodecInfo MediaCodecSelector.getDecoderInfo(String, boolean)>
	//    5   11:areturn         
	}

	protected long getDequeueOutputBufferTimeoutUs()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public boolean isEnded()
	{
		return outputStreamEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field boolean outputStreamEnded>
	//    2    4:ireturn         
	}

	public boolean isReady()
	{
		return format != null && !waitingForKeys && (isSourceReady() || hasOutputBuffer() || codecHotswapDeadlineMs != 0x1L && SystemClock.elapsedRealtime() < codecHotswapDeadlineMs);
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field Format format>
	//    2    4:ifnull          52
	//    3    7:aload_0         
	//    4    8:getfield        #400 <Field boolean waitingForKeys>
	//    5   11:ifne            52
	//    6   14:aload_0         
	//    7   15:invokevirtual   #613 <Method boolean isSourceReady()>
	//    8   18:ifne            50
	//    9   21:aload_0         
	//   10   22:invokespecial   #279 <Method boolean hasOutputBuffer()>
	//   11   25:ifne            50
	//   12   28:aload_0         
	//   13   29:getfield        #584 <Field long codecHotswapDeadlineMs>
	//   14   32:ldc2w           #581 <Long 0x1L>
	//   15   35:lcmp            
	//   16   36:ifeq            52
	//   17   39:invokestatic    #618 <Method long SystemClock.elapsedRealtime()>
	//   18   42:aload_0         
	//   19   43:getfield        #584 <Field long codecHotswapDeadlineMs>
	//   20   46:lcmp            
	//   21   47:ifge            52
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	protected final void maybeInitCodec()
		throws ExoPlaybackException
	{
		boolean flag1;
		Object obj1;
		String s;
		if(codec != null)
			break MISSING_BLOCK_LABEL_635;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field MediaCodec codec>
	//    2    4:ifnonnull       635
		if(format == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #402 <Field Format format>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		drmSession = pendingDrmSession;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #622 <Field DrmSession pendingDrmSession>
	//   10   20:putfield        #562 <Field DrmSession drmSession>
		s = format.sampleMimeType;
	//   11   23:aload_0         
	//   12   24:getfield        #402 <Field Format format>
	//   13   27:getfield        #605 <Field String Format.sampleMimeType>
	//   14   30:astore          10
		if(drmSession != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #562 <Field DrmSession drmSession>
	//*  17   36:ifnull          151
		{
			obj1 = ((Object) ((FrameworkMediaCrypto)drmSession.getMediaCrypto()));
	//   18   39:aload_0         
	//   19   40:getfield        #562 <Field DrmSession drmSession>
	//   20   43:invokeinterface #626 <Method com.google.android.exoplayer2.drm.ExoMediaCrypto DrmSession.getMediaCrypto()>
	//   21   48:checkcast       #628 <Class FrameworkMediaCrypto>
	//   22   51:astore          9
			boolean flag;
			MediaCrypto mediacrypto;
			if(obj1 == null)
	//*  23   53:aload           9
	//*  24   55:ifnonnull       79
			{
				if(drmSession.getError() != null)
	//*  25   58:aload_0         
	//*  26   59:getfield        #562 <Field DrmSession drmSession>
	//*  27   62:invokeinterface #571 <Method com.google.android.exoplayer2.drm.DrmSession$DrmSessionException DrmSession.getError()>
	//*  28   67:ifnull          78
				{
					flag = false;
	//   29   70:iconst_0        
	//   30   71:istore_2        
					mediacrypto = null;
	//   31   72:aconst_null     
	//   32   73:astore          8
				} else
	//*  33   75:goto            94
				{
					return;
	//   34   78:return          
				}
			} else
			{
				mediacrypto = ((FrameworkMediaCrypto) (obj1)).getWrappedMediaCrypto();
	//   35   79:aload           9
	//   36   81:invokevirtual   #632 <Method MediaCrypto FrameworkMediaCrypto.getWrappedMediaCrypto()>
	//   37   84:astore          8
				flag = ((FrameworkMediaCrypto) (obj1)).requiresSecureDecoderComponent(s);
	//   38   86:aload           9
	//   39   88:aload           10
	//   40   90:invokevirtual   #635 <Method boolean FrameworkMediaCrypto.requiresSecureDecoderComponent(String)>
	//   41   93:istore_2        
			}
			flag1 = flag;
	//   42   94:iload_2         
	//   43   95:istore_3        
			obj1 = ((Object) (mediacrypto));
	//   44   96:aload           8
	//   45   98:astore          9
			if(deviceNeedsDrmKeysToConfigureCodecWorkaround())
	//*  46  100:aload_0         
	//*  47  101:invokespecial   #637 <Method boolean deviceNeedsDrmKeysToConfigureCodecWorkaround()>
	//*  48  104:ifeq            156
			{
				int i = drmSession.getState();
	//   49  107:aload_0         
	//   50  108:getfield        #562 <Field DrmSession drmSession>
	//   51  111:invokeinterface #567 <Method int DrmSession.getState()>
	//   52  116:istore_1        
				if(i == 1)
	//*  53  117:iload_1         
	//*  54  118:iconst_1        
	//*  55  119:icmpne          139
					throw ExoPlaybackException.createForRenderer(((Exception) (drmSession.getError())), getIndex());
	//   56  122:aload_0         
	//   57  123:getfield        #562 <Field DrmSession drmSession>
	//   58  126:invokeinterface #571 <Method com.google.android.exoplayer2.drm.DrmSession$DrmSessionException DrmSession.getError()>
	//   59  131:aload_0         
	//   60  132:invokevirtual   #427 <Method int getIndex()>
	//   61  135:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   62  138:athrow          
				flag1 = flag;
	//   63  139:iload_2         
	//   64  140:istore_3        
				obj1 = ((Object) (mediacrypto));
	//   65  141:aload           8
	//   66  143:astore          9
				if(i != 4)
	//*  67  145:iload_1         
	//*  68  146:iconst_4        
	//*  69  147:icmpeq          156
					return;
	//   70  150:return          
			}
		} else
		{
			flag1 = false;
	//   71  151:iconst_0        
	//   72  152:istore_3        
			obj1 = null;
	//   73  153:aconst_null     
	//   74  154:astore          9
		}
		if(codecInfo != null)
			break MISSING_BLOCK_LABEL_336;
	//   75  156:aload_0         
	//   76  157:getfield        #600 <Field MediaCodecInfo codecInfo>
	//   77  160:ifnonnull       336
		codecInfo = getDecoderInfo(mediaCodecSelector, format, flag1);
	//   78  163:aload_0         
	//   79  164:aload_0         
	//   80  165:aload_0         
	//   81  166:getfield        #131 <Field MediaCodecSelector mediaCodecSelector>
	//   82  169:aload_0         
	//   83  170:getfield        #402 <Field Format format>
	//   84  173:iload_3         
	//   85  174:invokevirtual   #639 <Method MediaCodecInfo getDecoderInfo(MediaCodecSelector, Format, boolean)>
	//   86  177:putfield        #600 <Field MediaCodecInfo codecInfo>
		if(codecInfo == null && flag1)
	//*  87  180:aload_0         
	//*  88  181:getfield        #600 <Field MediaCodecInfo codecInfo>
	//*  89  184:ifnonnull       309
	//*  90  187:iload_3         
	//*  91  188:ifeq            309
			try
			{
				codecInfo = getDecoderInfo(mediaCodecSelector, format, false);
	//   92  191:aload_0         
	//   93  192:aload_0         
	//   94  193:aload_0         
	//   95  194:getfield        #131 <Field MediaCodecSelector mediaCodecSelector>
	//   96  197:aload_0         
	//   97  198:getfield        #402 <Field Format format>
	//   98  201:iconst_0        
	//   99  202:invokevirtual   #639 <Method MediaCodecInfo getDecoderInfo(MediaCodecSelector, Format, boolean)>
	//  100  205:putfield        #600 <Field MediaCodecInfo codecInfo>
				if(codecInfo != null)
	//* 101  208:aload_0         
	//* 102  209:getfield        #600 <Field MediaCodecInfo codecInfo>
	//* 103  212:ifnull          309
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  104  215:new             #641 <Class StringBuilder>
	//  105  218:dup             
	//  106  219:invokespecial   #642 <Method void StringBuilder()>
	//  107  222:astore          8
					stringbuilder.append("Drm session requires secure decoder for ");
	//  108  224:aload           8
	//  109  226:ldc2            #644 <String "Drm session requires secure decoder for ">
	//  110  229:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  111  232:pop             
					stringbuilder.append(s);
	//  112  233:aload           8
	//  113  235:aload           10
	//  114  237:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  115  240:pop             
					stringbuilder.append(", but no secure decoder available. Trying to proceed with ");
	//  116  241:aload           8
	//  117  243:ldc2            #650 <String ", but no secure decoder available. Trying to proceed with ">
	//  118  246:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  119  249:pop             
					stringbuilder.append(codecInfo.name);
	//  120  250:aload           8
	//  121  252:aload_0         
	//  122  253:getfield        #600 <Field MediaCodecInfo codecInfo>
	//  123  256:getfield        #238 <Field String MediaCodecInfo.name>
	//  124  259:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  125  262:pop             
					stringbuilder.append(".");
	//  126  263:aload           8
	//  127  265:ldc2            #652 <String ".">
	//  128  268:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  129  271:pop             
					Log.w("MediaCodecRenderer", stringbuilder.toString());
	//  130  272:ldc1            #39  <String "MediaCodecRenderer">
	//  131  274:aload           8
	//  132  276:invokevirtual   #656 <Method String StringBuilder.toString()>
	//  133  279:invokestatic    #662 <Method int Log.w(String, String)>
	//  134  282:pop             
				}
			}
	//* 135  283:goto            309
			catch(MediaCodecUtil.DecoderQueryException decoderqueryexception)
	//* 136  286:astore          8
			{
				throwDecoderInitError(new DecoderInitializationException(format, ((Throwable) (decoderqueryexception)), flag1, -49998));
	//  137  288:aload_0         
	//  138  289:new             #6   <Class MediaCodecRenderer$DecoderInitializationException>
	//  139  292:dup             
	//  140  293:aload_0         
	//  141  294:getfield        #402 <Field Format format>
	//  142  297:aload           8
	//  143  299:iload_3         
	//  144  300:ldc2            #663 <Int -49998>
	//  145  303:invokespecial   #666 <Method void MediaCodecRenderer$DecoderInitializationException(Format, Throwable, boolean, int)>
	//  146  306:invokespecial   #668 <Method void throwDecoderInitError(MediaCodecRenderer$DecoderInitializationException)>
			}
		if(codecInfo == null)
	//* 147  309:aload_0         
	//* 148  310:getfield        #600 <Field MediaCodecInfo codecInfo>
	//* 149  313:ifnonnull       336
			throwDecoderInitError(new DecoderInitializationException(format, ((Throwable) (null)), flag1, -49999));
	//  150  316:aload_0         
	//  151  317:new             #6   <Class MediaCodecRenderer$DecoderInitializationException>
	//  152  320:dup             
	//  153  321:aload_0         
	//  154  322:getfield        #402 <Field Format format>
	//  155  325:aconst_null     
	//  156  326:iload_3         
	//  157  327:ldc2            #669 <Int -49999>
	//  158  330:invokespecial   #666 <Method void MediaCodecRenderer$DecoderInitializationException(Format, Throwable, boolean, int)>
	//  159  333:invokespecial   #668 <Method void throwDecoderInitError(MediaCodecRenderer$DecoderInitializationException)>
		if(!shouldInitCodec(codecInfo))
	//* 160  336:aload_0         
	//* 161  337:aload_0         
	//* 162  338:getfield        #600 <Field MediaCodecInfo codecInfo>
	//* 163  341:invokevirtual   #672 <Method boolean shouldInitCodec(MediaCodecInfo)>
	//* 164  344:ifne            348
			return;
	//  165  347:return          
		Object obj = ((Object) (codecInfo.name));
	//  166  348:aload_0         
	//  167  349:getfield        #600 <Field MediaCodecInfo codecInfo>
	//  168  352:getfield        #238 <Field String MediaCodecInfo.name>
	//  169  355:astore          8
		codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(((String) (obj)));
	//  170  357:aload_0         
	//  171  358:aload_0         
	//  172  359:aload           8
	//  173  361:invokespecial   #674 <Method int codecAdaptationWorkaroundMode(String)>
	//  174  364:putfield        #532 <Field int codecAdaptationWorkaroundMode>
		codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(((String) (obj)), format);
	//  175  367:aload_0         
	//  176  368:aload           8
	//  177  370:aload_0         
	//  178  371:getfield        #402 <Field Format format>
	//  179  374:invokestatic    #676 <Method boolean codecNeedsDiscardToSpsWorkaround(String, Format)>
	//  180  377:putfield        #445 <Field boolean codecNeedsDiscardToSpsWorkaround>
		codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(((String) (obj)));
	//  181  380:aload_0         
	//  182  381:aload           8
	//  183  383:invokestatic    #678 <Method boolean codecNeedsFlushWorkaround(String)>
	//  184  386:putfield        #587 <Field boolean codecNeedsFlushWorkaround>
		codecNeedsEosPropagationWorkaround = codecNeedsEosPropagationWorkaround(codecInfo);
	//  185  389:aload_0         
	//  186  390:aload_0         
	//  187  391:getfield        #600 <Field MediaCodecInfo codecInfo>
	//  188  394:invokestatic    #680 <Method boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo)>
	//  189  397:putfield        #351 <Field boolean codecNeedsEosPropagationWorkaround>
		codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(((String) (obj)));
	//  190  400:aload_0         
	//  191  401:aload           8
	//  192  403:invokestatic    #682 <Method boolean codecNeedsEosFlushWorkaround(String)>
	//  193  406:putfield        #589 <Field boolean codecNeedsEosFlushWorkaround>
		codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(((String) (obj)));
	//  194  409:aload_0         
	//  195  410:aload           8
	//  196  412:invokestatic    #684 <Method boolean codecNeedsEosOutputExceptionWorkaround(String)>
	//  197  415:putfield        #281 <Field boolean codecNeedsEosOutputExceptionWorkaround>
		codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(((String) (obj)), format);
	//  198  418:aload_0         
	//  199  419:aload           8
	//  200  421:aload_0         
	//  201  422:getfield        #402 <Field Format format>
	//  202  425:invokestatic    #686 <Method boolean codecNeedsMonoChannelCountWorkaround(String, Format)>
	//  203  428:putfield        #543 <Field boolean codecNeedsMonoChannelCountWorkaround>
		try
		{
			long l = SystemClock.elapsedRealtime();
	//  204  431:invokestatic    #618 <Method long SystemClock.elapsedRealtime()>
	//  205  434:lstore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//  206  436:new             #641 <Class StringBuilder>
	//  207  439:dup             
	//  208  440:invokespecial   #642 <Method void StringBuilder()>
	//  209  443:astore          10
			stringbuilder1.append("createCodec:");
	//  210  445:aload           10
	//  211  447:ldc2            #688 <String "createCodec:">
	//  212  450:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  213  453:pop             
			stringbuilder1.append(((String) (obj)));
	//  214  454:aload           10
	//  215  456:aload           8
	//  216  458:invokevirtual   #648 <Method StringBuilder StringBuilder.append(String)>
	//  217  461:pop             
			TraceUtil.beginSection(stringbuilder1.toString());
	//  218  462:aload           10
	//  219  464:invokevirtual   #656 <Method String StringBuilder.toString()>
	//  220  467:invokestatic    #694 <Method void TraceUtil.beginSection(String)>
			codec = MediaCodec.createByCodecName(((String) (obj)));
	//  221  470:aload_0         
	//  222  471:aload           8
	//  223  473:invokestatic    #698 <Method MediaCodec MediaCodec.createByCodecName(String)>
	//  224  476:putfield        #285 <Field MediaCodec codec>
			TraceUtil.endSection();
	//  225  479:invokestatic    #701 <Method void TraceUtil.endSection()>
			TraceUtil.beginSection("configureCodec");
	//  226  482:ldc2            #702 <String "configureCodec">
	//  227  485:invokestatic    #694 <Method void TraceUtil.beginSection(String)>
			configureCodec(codecInfo, codec, format, ((MediaCrypto) (obj1)));
	//  228  488:aload_0         
	//  229  489:aload_0         
	//  230  490:getfield        #600 <Field MediaCodecInfo codecInfo>
	//  231  493:aload_0         
	//  232  494:getfield        #285 <Field MediaCodec codec>
	//  233  497:aload_0         
	//  234  498:getfield        #402 <Field Format format>
	//  235  501:aload           9
	//  236  503:invokevirtual   #704 <Method void configureCodec(MediaCodecInfo, MediaCodec, Format, MediaCrypto)>
			TraceUtil.endSection();
	//  237  506:invokestatic    #701 <Method void TraceUtil.endSection()>
			TraceUtil.beginSection("startCodec");
	//  238  509:ldc2            #706 <String "startCodec">
	//  239  512:invokestatic    #694 <Method void TraceUtil.beginSection(String)>
			codec.start();
	//  240  515:aload_0         
	//  241  516:getfield        #285 <Field MediaCodec codec>
	//  242  519:invokevirtual   #709 <Method void MediaCodec.start()>
			TraceUtil.endSection();
	//  243  522:invokestatic    #701 <Method void TraceUtil.endSection()>
			long l2 = SystemClock.elapsedRealtime();
	//  244  525:invokestatic    #618 <Method long SystemClock.elapsedRealtime()>
	//  245  528:lstore          6
			onCodecInitialized(((String) (obj)), l2, l2 - l);
	//  246  530:aload_0         
	//  247  531:aload           8
	//  248  533:lload           6
	//  249  535:lload           6
	//  250  537:lload           4
	//  251  539:lsub            
	//  252  540:invokevirtual   #713 <Method void onCodecInitialized(String, long, long)>
			getCodecBuffers();
	//  253  543:aload_0         
	//  254  544:invokespecial   #715 <Method void getCodecBuffers()>
		}
	//* 255  547:goto            572
		catch(Exception exception)
	//* 256  550:astore          9
		{
			throwDecoderInitError(new DecoderInitializationException(format, ((Throwable) (exception)), flag1, ((String) (obj))));
	//  257  552:aload_0         
	//  258  553:new             #6   <Class MediaCodecRenderer$DecoderInitializationException>
	//  259  556:dup             
	//  260  557:aload_0         
	//  261  558:getfield        #402 <Field Format format>
	//  262  561:aload           9
	//  263  563:iload_3         
	//  264  564:aload           8
	//  265  566:invokespecial   #718 <Method void MediaCodecRenderer$DecoderInitializationException(Format, Throwable, boolean, String)>
	//  266  569:invokespecial   #668 <Method void throwDecoderInitError(MediaCodecRenderer$DecoderInitializationException)>
		}
		long l1;
		if(getState() == 2)
	//* 267  572:aload_0         
	//* 268  573:invokevirtual   #719 <Method int getState()>
	//* 269  576:iconst_2        
	//* 270  577:icmpne          592
			l1 = SystemClock.elapsedRealtime() + 1000L;
	//  271  580:invokestatic    #618 <Method long SystemClock.elapsedRealtime()>
	//  272  583:ldc2w           #28  <Long 1000L>
	//  273  586:ladd            
	//  274  587:lstore          4
		else
	//* 275  589:goto            597
			l1 = 0x1L;
	//  276  592:ldc2w           #581 <Long 0x1L>
	//  277  595:lstore          4
		codecHotswapDeadlineMs = l1;
	//  278  597:aload_0         
	//  279  598:lload           4
	//  280  600:putfield        #584 <Field long codecHotswapDeadlineMs>
		resetInputBuffer();
	//  281  603:aload_0         
	//  282  604:invokespecial   #390 <Method void resetInputBuffer()>
		resetOutputBuffer();
	//  283  607:aload_0         
	//  284  608:invokespecial   #364 <Method void resetOutputBuffer()>
		waitingForFirstSyncFrame = true;
	//  285  611:aload_0         
	//  286  612:iconst_1        
	//  287  613:putfield        #433 <Field boolean waitingForFirstSyncFrame>
		obj = ((Object) (decoderCounters));
	//  288  616:aload_0         
	//  289  617:getfield        #485 <Field DecoderCounters decoderCounters>
	//  290  620:astore          8
		obj.decoderInitCount = ((DecoderCounters) (obj)).decoderInitCount + 1;
	//  291  622:aload           8
	//  292  624:aload           8
	//  293  626:getfield        #722 <Field int DecoderCounters.decoderInitCount>
	//  294  629:iconst_1        
	//  295  630:iadd            
	//  296  631:putfield        #722 <Field int DecoderCounters.decoderInitCount>
		return;
	//  297  634:return          
	//  298  635:return          
	}

	protected void onCodecInitialized(String s, long l, long l1)
	{
	//    0    0:return          
	}

	protected void onDisabled()
	{
		format = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #402 <Field Format format>
		releaseCodec();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #303 <Method void releaseCodec()>
		if(drmSession != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #562 <Field DrmSession drmSession>
	//*   7   13:ifnull          29
			drmSessionManager.releaseSession(drmSession);
	//    8   16:aload_0         
	//    9   17:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   10   20:aload_0         
	//   11   21:getfield        #562 <Field DrmSession drmSession>
	//   12   24:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//*  13   29:aload_0         
	//*  14   30:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  15   33:ifnull          60
	//*  16   36:aload_0         
	//*  17   37:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  18   40:aload_0         
	//*  19   41:getfield        #562 <Field DrmSession drmSession>
	//*  20   44:if_acmpeq       60
			drmSessionManager.releaseSession(pendingDrmSession);
	//   21   47:aload_0         
	//   22   48:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   23   51:aload_0         
	//   24   52:getfield        #622 <Field DrmSession pendingDrmSession>
	//   25   55:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//   26   60:aload_0         
	//   27   61:aconst_null     
	//   28   62:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   29   65:aload_0         
	//   30   66:aconst_null     
	//   31   67:putfield        #622 <Field DrmSession pendingDrmSession>
		return;
	//   32   70:return          
		Exception exception;
		exception;
	//   33   71:astore_1        
		drmSession = null;
	//   34   72:aload_0         
	//   35   73:aconst_null     
	//   36   74:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   37   77:aload_0         
	//   38   78:aconst_null     
	//   39   79:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//   40   82:aload_1         
	//   41   83:athrow          
		exception;
	//   42   84:astore_1        
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//*  43   85:aload_0         
	//*  44   86:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  45   89:ifnull          116
	//*  46   92:aload_0         
	//*  47   93:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  48   96:aload_0         
	//*  49   97:getfield        #562 <Field DrmSession drmSession>
	//*  50  100:if_acmpeq       116
			drmSessionManager.releaseSession(pendingDrmSession);
	//   51  103:aload_0         
	//   52  104:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   53  107:aload_0         
	//   54  108:getfield        #622 <Field DrmSession pendingDrmSession>
	//   55  111:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//   56  116:aload_0         
	//   57  117:aconst_null     
	//   58  118:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   59  121:aload_0         
	//   60  122:aconst_null     
	//   61  123:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//   62  126:aload_1         
	//   63  127:athrow          
		exception;
	//   64  128:astore_1        
		drmSession = null;
	//   65  129:aload_0         
	//   66  130:aconst_null     
	//   67  131:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   68  134:aload_0         
	//   69  135:aconst_null     
	//   70  136:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//   71  139:aload_1         
	//   72  140:athrow          
		exception;
	//   73  141:astore_1        
		if(drmSession != null)
	//*  74  142:aload_0         
	//*  75  143:getfield        #562 <Field DrmSession drmSession>
	//*  76  146:ifnull          162
			drmSessionManager.releaseSession(drmSession);
	//   77  149:aload_0         
	//   78  150:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   79  153:aload_0         
	//   80  154:getfield        #562 <Field DrmSession drmSession>
	//   81  157:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//*  82  162:aload_0         
	//*  83  163:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  84  166:ifnull          193
	//*  85  169:aload_0         
	//*  86  170:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  87  173:aload_0         
	//*  88  174:getfield        #562 <Field DrmSession drmSession>
	//*  89  177:if_acmpeq       193
			drmSessionManager.releaseSession(pendingDrmSession);
	//   90  180:aload_0         
	//   91  181:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   92  184:aload_0         
	//   93  185:getfield        #622 <Field DrmSession pendingDrmSession>
	//   94  188:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//   95  193:aload_0         
	//   96  194:aconst_null     
	//   97  195:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//   98  198:aload_0         
	//   99  199:aconst_null     
	//  100  200:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//  101  203:aload_1         
	//  102  204:athrow          
		exception;
	//  103  205:astore_1        
		drmSession = null;
	//  104  206:aload_0         
	//  105  207:aconst_null     
	//  106  208:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  107  211:aload_0         
	//  108  212:aconst_null     
	//  109  213:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//  110  216:aload_1         
	//  111  217:athrow          
		exception;
	//  112  218:astore_1        
		if(pendingDrmSession != null && pendingDrmSession != drmSession)
	//* 113  219:aload_0         
	//* 114  220:getfield        #622 <Field DrmSession pendingDrmSession>
	//* 115  223:ifnull          250
	//* 116  226:aload_0         
	//* 117  227:getfield        #622 <Field DrmSession pendingDrmSession>
	//* 118  230:aload_0         
	//* 119  231:getfield        #562 <Field DrmSession drmSession>
	//* 120  234:if_acmpeq       250
			drmSessionManager.releaseSession(pendingDrmSession);
	//  121  237:aload_0         
	//  122  238:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//  123  241:aload_0         
	//  124  242:getfield        #622 <Field DrmSession pendingDrmSession>
	//  125  245:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//  126  250:aload_0         
	//  127  251:aconst_null     
	//  128  252:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  129  255:aload_0         
	//  130  256:aconst_null     
	//  131  257:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//  132  260:aload_1         
	//  133  261:athrow          
		exception;
	//  134  262:astore_1        
		drmSession = null;
	//  135  263:aload_0         
	//  136  264:aconst_null     
	//  137  265:putfield        #562 <Field DrmSession drmSession>
		pendingDrmSession = null;
	//  138  268:aload_0         
	//  139  269:aconst_null     
	//  140  270:putfield        #622 <Field DrmSession pendingDrmSession>
		throw exception;
	//  141  273:aload_1         
	//  142  274:athrow          
	}

	protected void onEnabled(boolean flag)
		throws ExoPlaybackException
	{
		decoderCounters = new DecoderCounters();
	//    0    0:aload_0         
	//    1    1:new             #487 <Class DecoderCounters>
	//    2    4:dup             
	//    3    5:invokespecial   #731 <Method void DecoderCounters()>
	//    4    8:putfield        #485 <Field DecoderCounters decoderCounters>
	//    5   11:return          
	}

	protected void onInputFormatChanged(Format format1)
		throws ExoPlaybackException
	{
		boolean flag;
		boolean flag1;
		boolean flag3;
		Format format2;
		Object obj;
		format2 = format;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field Format format>
	//    2    4:astore          7
		format = format1;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #402 <Field Format format>
		obj = ((Object) (format.drmInitData));
	//    6   11:aload_0         
	//    7   12:getfield        #402 <Field Format format>
	//    8   15:getfield        #735 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//    9   18:astore          8
		if(format2 == null)
	//*  10   20:aload           7
	//*  11   22:ifnonnull       30
			format1 = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		else
	//*  14   27:goto            36
			format1 = ((Format) (format2.drmInitData));
	//   15   30:aload           7
	//   16   32:getfield        #735 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//   17   35:astore_1        
		if(Util.areEqual(obj, ((Object) (format1))) ^ true)
	//*  18   36:aload           8
	//*  19   38:aload_1         
	//*  20   39:invokestatic    #739 <Method boolean Util.areEqual(Object, Object)>
	//*  21   42:iconst_1        
	//*  22   43:ixor            
	//*  23   44:ifeq            137
			if(format.drmInitData != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #402 <Field Format format>
	//*  26   51:getfield        #735 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//*  27   54:ifnull          132
			{
				if(drmSessionManager == null)
	//*  28   57:aload_0         
	//*  29   58:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//*  30   61:ifnonnull       82
					throw ExoPlaybackException.createForRenderer(((Exception) (new IllegalStateException("Media requires a DrmSessionManager"))), getIndex());
	//   31   64:new             #276 <Class IllegalStateException>
	//   32   67:dup             
	//   33   68:ldc2            #741 <String "Media requires a DrmSessionManager">
	//   34   71:invokespecial   #743 <Method void IllegalStateException(String)>
	//   35   74:aload_0         
	//   36   75:invokevirtual   #427 <Method int getIndex()>
	//   37   78:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   38   81:athrow          
				pendingDrmSession = drmSessionManager.acquireSession(Looper.myLooper(), format.drmInitData);
	//   39   82:aload_0         
	//   40   83:aload_0         
	//   41   84:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   42   87:invokestatic    #749 <Method Looper Looper.myLooper()>
	//   43   90:aload_0         
	//   44   91:getfield        #402 <Field Format format>
	//   45   94:getfield        #735 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//   46   97:invokeinterface #753 <Method DrmSession DrmSessionManager.acquireSession(Looper, com.google.android.exoplayer2.drm.DrmInitData)>
	//   47  102:putfield        #622 <Field DrmSession pendingDrmSession>
				if(pendingDrmSession == drmSession)
	//*  48  105:aload_0         
	//*  49  106:getfield        #622 <Field DrmSession pendingDrmSession>
	//*  50  109:aload_0         
	//*  51  110:getfield        #562 <Field DrmSession drmSession>
	//*  52  113:if_acmpne       137
					drmSessionManager.releaseSession(pendingDrmSession);
	//   53  116:aload_0         
	//   54  117:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   55  120:aload_0         
	//   56  121:getfield        #622 <Field DrmSession pendingDrmSession>
	//   57  124:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
			} else
	//*  58  129:goto            137
			{
				pendingDrmSession = null;
	//   59  132:aload_0         
	//   60  133:aconst_null     
	//   61  134:putfield        #622 <Field DrmSession pendingDrmSession>
			}
		format1 = ((Format) (pendingDrmSession));
	//   62  137:aload_0         
	//   63  138:getfield        #622 <Field DrmSession pendingDrmSession>
	//   64  141:astore_1        
		obj = ((Object) (drmSession));
	//   65  142:aload_0         
	//   66  143:getfield        #562 <Field DrmSession drmSession>
	//   67  146:astore          8
		flag1 = false;
	//   68  148:iconst_0        
	//   69  149:istore_3        
		flag3 = false;
	//   70  150:iconst_0        
	//   71  151:istore          6
		flag = flag1;
	//   72  153:iload_3         
	//   73  154:istore_2        
		if(format1 != obj) goto _L2; else goto _L1
	//   74  155:aload_1         
	//   75  156:aload           8
	//   76  158:if_acmpne       317
_L1:
		flag = flag1;
	//   77  161:iload_3         
	//   78  162:istore_2        
		if(codec == null) goto _L2; else goto _L3
	//   79  163:aload_0         
	//   80  164:getfield        #285 <Field MediaCodec codec>
	//   81  167:ifnull          317
_L3:
		int i = canKeepCodec(codec, codecInfo, format2, format);
	//   82  170:aload_0         
	//   83  171:aload_0         
	//   84  172:getfield        #285 <Field MediaCodec codec>
	//   85  175:aload_0         
	//   86  176:getfield        #600 <Field MediaCodecInfo codecInfo>
	//   87  179:aload           7
	//   88  181:aload_0         
	//   89  182:getfield        #402 <Field Format format>
	//   90  185:invokevirtual   #755 <Method int canKeepCodec(MediaCodec, MediaCodecInfo, Format, Format)>
	//   91  188:istore          4
		if(i == 3) goto _L5; else goto _L4
	//   92  190:iload           4
	//   93  192:iconst_3        
	//   94  193:icmpeq          237
_L4:
		flag = flag1;
	//   95  196:iload_3         
	//   96  197:istore_2        
		i;
	//   97  198:iload           4
		JVM INSTR tableswitch 0 1: default 224
	//	               0 317
	//	               1 232;
	//   98  200:tableswitch     0 1: default 224
	//	               0 317
	//	               1 232
		   goto _L6 _L2 _L7
_L6:
		throw new IllegalStateException();
	//   99  224:new             #276 <Class IllegalStateException>
	//  100  227:dup             
	//  101  228:invokespecial   #756 <Method void IllegalStateException()>
	//  102  231:athrow          
_L7:
		flag = true;
	//  103  232:iconst_1        
	//  104  233:istore_2        
		break; /* Loop/switch isn't completed */
	//  105  234:goto            317
_L5:
		boolean flag2;
label0:
		{
			codecReconfigured = true;
	//  106  237:aload_0         
	//  107  238:iconst_1        
	//  108  239:putfield        #594 <Field boolean codecReconfigured>
			codecReconfigurationState = 1;
	//  109  242:aload_0         
	//  110  243:iconst_1        
	//  111  244:putfield        #164 <Field int codecReconfigurationState>
			if(codecAdaptationWorkaroundMode != 2)
	//* 112  247:aload_0         
	//* 113  248:getfield        #532 <Field int codecAdaptationWorkaroundMode>
	//* 114  251:iconst_2        
	//* 115  252:icmpeq          305
			{
				flag2 = flag3;
	//  116  255:iload           6
	//  117  257:istore          5
				if(codecAdaptationWorkaroundMode != 1)
					break label0;
	//  118  259:aload_0         
	//  119  260:getfield        #532 <Field int codecAdaptationWorkaroundMode>
	//  120  263:iconst_1        
	//  121  264:icmpne          308
				flag2 = flag3;
	//  122  267:iload           6
	//  123  269:istore          5
				if(format.width != format2.width)
					break label0;
	//  124  271:aload_0         
	//  125  272:getfield        #402 <Field Format format>
	//  126  275:getfield        #758 <Field int Format.width>
	//  127  278:aload           7
	//  128  280:getfield        #758 <Field int Format.width>
	//  129  283:icmpne          308
				flag2 = flag3;
	//  130  286:iload           6
	//  131  288:istore          5
				if(format.height != format2.height)
					break label0;
	//  132  290:aload_0         
	//  133  291:getfield        #402 <Field Format format>
	//  134  294:getfield        #760 <Field int Format.height>
	//  135  297:aload           7
	//  136  299:getfield        #760 <Field int Format.height>
	//  137  302:icmpne          308
			}
			flag2 = true;
	//  138  305:iconst_1        
	//  139  306:istore          5
		}
		codecNeedsAdaptationWorkaroundBuffer = flag2;
	//  140  308:aload_0         
	//  141  309:iload           5
	//  142  311:putfield        #392 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
		if(true) goto _L7; else goto _L2
	//  143  314:goto            232
_L2:
		if(!flag)
	//* 144  317:iload_2         
	//* 145  318:ifne            342
		{
			if(codecReceivedBuffers)
	//* 146  321:aload_0         
	//* 147  322:getfield        #398 <Field boolean codecReceivedBuffers>
	//* 148  325:ifeq            334
			{
				codecReinitializationState = 1;
	//  149  328:aload_0         
	//  150  329:iconst_1        
	//  151  330:putfield        #166 <Field int codecReinitializationState>
				return;
	//  152  333:return          
			}
			releaseCodec();
	//  153  334:aload_0         
	//  154  335:invokevirtual   #303 <Method void releaseCodec()>
			maybeInitCodec();
	//  155  338:aload_0         
	//  156  339:invokevirtual   #523 <Method void maybeInitCodec()>
		}
		return;
	//  157  342:return          
	}

	protected void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onPositionReset(long l, boolean flag)
		throws ExoPlaybackException
	{
		inputStreamEnded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #353 <Field boolean inputStreamEnded>
		outputStreamEnded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #300 <Field boolean outputStreamEnded>
		if(codec != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #285 <Field MediaCodec codec>
	//*   8   14:ifnull          21
			flushCodec();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #764 <Method void flushCodec()>
	//   11   21:return          
	}

	protected void onProcessedOutputBuffer(long l)
	{
	//    0    0:return          
	}

	protected void onQueueInputBuffer(DecoderInputBuffer decoderinputbuffer)
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

	protected abstract boolean processOutputBuffer(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, int i, 
			int j, long l2, boolean flag)
		throws ExoPlaybackException;

	protected void releaseCodec()
	{
		codecHotswapDeadlineMs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #581 <Long 0x1L>
	//    2    4:putfield        #584 <Field long codecHotswapDeadlineMs>
		resetInputBuffer();
	//    3    7:aload_0         
	//    4    8:invokespecial   #390 <Method void resetInputBuffer()>
		resetOutputBuffer();
	//    5   11:aload_0         
	//    6   12:invokespecial   #364 <Method void resetOutputBuffer()>
		waitingForKeys = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #400 <Field boolean waitingForKeys>
		shouldSkipOutputBuffer = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #343 <Field boolean shouldSkipOutputBuffer>
		decodeOnlyPresentationTimestamps.clear();
	//   13   25:aload_0         
	//   14   26:getfield        #157 <Field List decodeOnlyPresentationTimestamps>
	//   15   29:invokeinterface #585 <Method void List.clear()>
		resetCodecBuffers();
	//   16   34:aload_0         
	//   17   35:invokespecial   #768 <Method void resetCodecBuffers()>
		codecInfo = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #600 <Field MediaCodecInfo codecInfo>
		codecReconfigured = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #594 <Field boolean codecReconfigured>
		codecReceivedBuffers = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #398 <Field boolean codecReceivedBuffers>
		codecNeedsDiscardToSpsWorkaround = false;
	//   27   53:aload_0         
	//   28   54:iconst_0        
	//   29   55:putfield        #445 <Field boolean codecNeedsDiscardToSpsWorkaround>
		codecNeedsFlushWorkaround = false;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #587 <Field boolean codecNeedsFlushWorkaround>
		codecAdaptationWorkaroundMode = 0;
	//   33   63:aload_0         
	//   34   64:iconst_0        
	//   35   65:putfield        #532 <Field int codecAdaptationWorkaroundMode>
		codecNeedsEosPropagationWorkaround = false;
	//   36   68:aload_0         
	//   37   69:iconst_0        
	//   38   70:putfield        #351 <Field boolean codecNeedsEosPropagationWorkaround>
		codecNeedsEosFlushWorkaround = false;
	//   39   73:aload_0         
	//   40   74:iconst_0        
	//   41   75:putfield        #589 <Field boolean codecNeedsEosFlushWorkaround>
		codecNeedsMonoChannelCountWorkaround = false;
	//   42   78:aload_0         
	//   43   79:iconst_0        
	//   44   80:putfield        #543 <Field boolean codecNeedsMonoChannelCountWorkaround>
		codecNeedsAdaptationWorkaroundBuffer = false;
	//   45   83:aload_0         
	//   46   84:iconst_0        
	//   47   85:putfield        #392 <Field boolean codecNeedsAdaptationWorkaroundBuffer>
		shouldSkipAdaptationWorkaroundOutputBuffer = false;
	//   48   88:aload_0         
	//   49   89:iconst_0        
	//   50   90:putfield        #305 <Field boolean shouldSkipAdaptationWorkaroundOutputBuffer>
		codecReceivedEos = false;
	//   51   93:aload_0         
	//   52   94:iconst_0        
	//   53   95:putfield        #283 <Field boolean codecReceivedEos>
		codecReconfigurationState = 0;
	//   54   98:aload_0         
	//   55   99:iconst_0        
	//   56  100:putfield        #164 <Field int codecReconfigurationState>
		codecReinitializationState = 0;
	//   57  103:aload_0         
	//   58  104:iconst_0        
	//   59  105:putfield        #166 <Field int codecReinitializationState>
		if(codec == null)
			break MISSING_BLOCK_LABEL_366;
	//   60  108:aload_0         
	//   61  109:getfield        #285 <Field MediaCodec codec>
	//   62  112:ifnull          366
		DecoderCounters decodercounters = decoderCounters;
	//   63  115:aload_0         
	//   64  116:getfield        #485 <Field DecoderCounters decoderCounters>
	//   65  119:astore_1        
		decodercounters.decoderReleaseCount = decodercounters.decoderReleaseCount + 1;
	//   66  120:aload_1         
	//   67  121:aload_1         
	//   68  122:getfield        #771 <Field int DecoderCounters.decoderReleaseCount>
	//   69  125:iconst_1        
	//   70  126:iadd            
	//   71  127:putfield        #771 <Field int DecoderCounters.decoderReleaseCount>
		codec.stop();
	//   72  130:aload_0         
	//   73  131:getfield        #285 <Field MediaCodec codec>
	//   74  134:invokevirtual   #774 <Method void MediaCodec.stop()>
		codec.release();
	//   75  137:aload_0         
	//   76  138:getfield        #285 <Field MediaCodec codec>
	//   77  141:invokevirtual   #777 <Method void MediaCodec.release()>
		codec = null;
	//   78  144:aload_0         
	//   79  145:aconst_null     
	//   80  146:putfield        #285 <Field MediaCodec codec>
		if(drmSession == null || pendingDrmSession == drmSession)
			break MISSING_BLOCK_LABEL_366;
	//   81  149:aload_0         
	//   82  150:getfield        #562 <Field DrmSession drmSession>
	//   83  153:ifnull          366
	//   84  156:aload_0         
	//   85  157:getfield        #622 <Field DrmSession pendingDrmSession>
	//   86  160:aload_0         
	//   87  161:getfield        #562 <Field DrmSession drmSession>
	//   88  164:if_acmpeq       366
		drmSessionManager.releaseSession(drmSession);
	//   89  167:aload_0         
	//   90  168:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//   91  171:aload_0         
	//   92  172:getfield        #562 <Field DrmSession drmSession>
	//   93  175:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//   94  180:aload_0         
	//   95  181:aconst_null     
	//   96  182:putfield        #562 <Field DrmSession drmSession>
		return;
	//   97  185:return          
		Exception exception;
		exception;
	//   98  186:astore_1        
		drmSession = null;
	//   99  187:aload_0         
	//  100  188:aconst_null     
	//  101  189:putfield        #562 <Field DrmSession drmSession>
		throw exception;
	//  102  192:aload_1         
	//  103  193:athrow          
		exception;
	//  104  194:astore_1        
		codec = null;
	//  105  195:aload_0         
	//  106  196:aconst_null     
	//  107  197:putfield        #285 <Field MediaCodec codec>
		if(drmSession == null || pendingDrmSession == drmSession)
			break MISSING_BLOCK_LABEL_247;
	//  108  200:aload_0         
	//  109  201:getfield        #562 <Field DrmSession drmSession>
	//  110  204:ifnull          247
	//  111  207:aload_0         
	//  112  208:getfield        #622 <Field DrmSession pendingDrmSession>
	//  113  211:aload_0         
	//  114  212:getfield        #562 <Field DrmSession drmSession>
	//  115  215:if_acmpeq       247
		drmSessionManager.releaseSession(drmSession);
	//  116  218:aload_0         
	//  117  219:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//  118  222:aload_0         
	//  119  223:getfield        #562 <Field DrmSession drmSession>
	//  120  226:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//  121  231:aload_0         
	//  122  232:aconst_null     
	//  123  233:putfield        #562 <Field DrmSession drmSession>
		break MISSING_BLOCK_LABEL_247;
	//  124  236:goto            247
		exception;
	//  125  239:astore_1        
		drmSession = null;
	//  126  240:aload_0         
	//  127  241:aconst_null     
	//  128  242:putfield        #562 <Field DrmSession drmSession>
		throw exception;
	//  129  245:aload_1         
	//  130  246:athrow          
		throw exception;
	//  131  247:aload_1         
	//  132  248:athrow          
		exception;
	//  133  249:astore_1        
		codec.release();
	//  134  250:aload_0         
	//  135  251:getfield        #285 <Field MediaCodec codec>
	//  136  254:invokevirtual   #777 <Method void MediaCodec.release()>
		codec = null;
	//  137  257:aload_0         
	//  138  258:aconst_null     
	//  139  259:putfield        #285 <Field MediaCodec codec>
		if(drmSession == null || pendingDrmSession == drmSession)
			break MISSING_BLOCK_LABEL_309;
	//  140  262:aload_0         
	//  141  263:getfield        #562 <Field DrmSession drmSession>
	//  142  266:ifnull          309
	//  143  269:aload_0         
	//  144  270:getfield        #622 <Field DrmSession pendingDrmSession>
	//  145  273:aload_0         
	//  146  274:getfield        #562 <Field DrmSession drmSession>
	//  147  277:if_acmpeq       309
		drmSessionManager.releaseSession(drmSession);
	//  148  280:aload_0         
	//  149  281:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//  150  284:aload_0         
	//  151  285:getfield        #562 <Field DrmSession drmSession>
	//  152  288:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//  153  293:aload_0         
	//  154  294:aconst_null     
	//  155  295:putfield        #562 <Field DrmSession drmSession>
		break MISSING_BLOCK_LABEL_309;
	//  156  298:goto            309
		exception;
	//  157  301:astore_1        
		drmSession = null;
	//  158  302:aload_0         
	//  159  303:aconst_null     
	//  160  304:putfield        #562 <Field DrmSession drmSession>
		throw exception;
	//  161  307:aload_1         
	//  162  308:athrow          
		throw exception;
	//  163  309:aload_1         
	//  164  310:athrow          
		exception;
	//  165  311:astore_1        
		codec = null;
	//  166  312:aload_0         
	//  167  313:aconst_null     
	//  168  314:putfield        #285 <Field MediaCodec codec>
		if(drmSession == null || pendingDrmSession == drmSession)
			break MISSING_BLOCK_LABEL_364;
	//  169  317:aload_0         
	//  170  318:getfield        #562 <Field DrmSession drmSession>
	//  171  321:ifnull          364
	//  172  324:aload_0         
	//  173  325:getfield        #622 <Field DrmSession pendingDrmSession>
	//  174  328:aload_0         
	//  175  329:getfield        #562 <Field DrmSession drmSession>
	//  176  332:if_acmpeq       364
		drmSessionManager.releaseSession(drmSession);
	//  177  335:aload_0         
	//  178  336:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//  179  339:aload_0         
	//  180  340:getfield        #562 <Field DrmSession drmSession>
	//  181  343:invokeinterface #729 <Method void DrmSessionManager.releaseSession(DrmSession)>
		drmSession = null;
	//  182  348:aload_0         
	//  183  349:aconst_null     
	//  184  350:putfield        #562 <Field DrmSession drmSession>
		break MISSING_BLOCK_LABEL_364;
	//  185  353:goto            364
		exception;
	//  186  356:astore_1        
		drmSession = null;
	//  187  357:aload_0         
	//  188  358:aconst_null     
	//  189  359:putfield        #562 <Field DrmSession drmSession>
		throw exception;
	//  190  362:aload_1         
	//  191  363:athrow          
		throw exception;
	//  192  364:aload_1         
	//  193  365:athrow          
	//  194  366:return          
	}

	public void render(long l, long l1)
		throws ExoPlaybackException
	{
		if(outputStreamEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #300 <Field boolean outputStreamEnded>
	//*   2    4:ifeq            12
		{
			renderToEndOfStream();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #526 <Method void renderToEndOfStream()>
			return;
	//    5   11:return          
		}
		if(format == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #402 <Field Format format>
	//*   8   16:ifnonnull       90
		{
			flagsOnlyBuffer.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   11   23:invokevirtual   #383 <Method void DecoderInputBuffer.clear()>
			int i = readSource(formatHolder, flagsOnlyBuffer, true);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #152 <Field FormatHolder formatHolder>
	//   15   31:aload_0         
	//   16   32:getfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #416 <Method int readSource(FormatHolder, DecoderInputBuffer, boolean)>
	//   19   39:istore          5
			if(i == -5)
	//*  20   41:iload           5
	//*  21   43:bipush          -5
	//*  22   45:icmpne          62
				onInputFormatChanged(formatHolder.format);
	//   23   48:aload_0         
	//   24   49:aload_0         
	//   25   50:getfield        #152 <Field FormatHolder formatHolder>
	//   26   53:getfield        #417 <Field Format FormatHolder.format>
	//   27   56:invokevirtual   #421 <Method void onInputFormatChanged(Format)>
			else
	//*  28   59:goto            90
			if(i == -4)
	//*  29   62:iload           5
	//*  30   64:bipush          -4
	//*  31   66:icmpne          89
			{
				Assertions.checkState(flagsOnlyBuffer.isEndOfStream());
	//   32   69:aload_0         
	//   33   70:getfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   34   73:invokevirtual   #424 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//   35   76:invokestatic    #123 <Method void Assertions.checkState(boolean)>
				inputStreamEnded = true;
	//   36   79:aload_0         
	//   37   80:iconst_1        
	//   38   81:putfield        #353 <Field boolean inputStreamEnded>
				processEndOfStream();
	//   39   84:aload_0         
	//   40   85:invokespecial   #298 <Method void processEndOfStream()>
				return;
	//   41   88:return          
			} else
			{
				return;
	//   42   89:return          
			}
		}
		maybeInitCodec();
	//   43   90:aload_0         
	//   44   91:invokevirtual   #523 <Method void maybeInitCodec()>
		if(codec != null)
	//*  45   94:aload_0         
	//*  46   95:getfield        #285 <Field MediaCodec codec>
	//*  47   98:ifnull          135
		{
			TraceUtil.beginSection("drainAndFeed");
	//   48  101:ldc2            #781 <String "drainAndFeed">
	//   49  104:invokestatic    #694 <Method void TraceUtil.beginSection(String)>
			while(drainOutputBuffer(l, l1)) ;
	//   50  107:aload_0         
	//   51  108:lload_1         
	//   52  109:lload_3         
	//   53  110:invokespecial   #783 <Method boolean drainOutputBuffer(long, long)>
	//   54  113:ifeq            119
	//*  55  116:goto            107
			while(feedInputBuffer()) ;
	//   56  119:aload_0         
	//   57  120:invokespecial   #785 <Method boolean feedInputBuffer()>
	//   58  123:ifeq            129
	//*  59  126:goto            119
			TraceUtil.endSection();
	//   60  129:invokestatic    #701 <Method void TraceUtil.endSection()>
		} else
	//*  61  132:goto            226
		{
			DecoderCounters decodercounters = decoderCounters;
	//   62  135:aload_0         
	//   63  136:getfield        #485 <Field DecoderCounters decoderCounters>
	//   64  139:astore          6
			decodercounters.skippedInputBufferCount = decodercounters.skippedInputBufferCount + skipSource(l);
	//   65  141:aload           6
	//   66  143:aload           6
	//   67  145:getfield        #788 <Field int DecoderCounters.skippedInputBufferCount>
	//   68  148:aload_0         
	//   69  149:lload_1         
	//   70  150:invokevirtual   #791 <Method int skipSource(long)>
	//   71  153:iadd            
	//   72  154:putfield        #788 <Field int DecoderCounters.skippedInputBufferCount>
			flagsOnlyBuffer.clear();
	//   73  157:aload_0         
	//   74  158:getfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   75  161:invokevirtual   #383 <Method void DecoderInputBuffer.clear()>
			int j = readSource(formatHolder, flagsOnlyBuffer, false);
	//   76  164:aload_0         
	//   77  165:aload_0         
	//   78  166:getfield        #152 <Field FormatHolder formatHolder>
	//   79  169:aload_0         
	//   80  170:getfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   81  173:iconst_0        
	//   82  174:invokevirtual   #416 <Method int readSource(FormatHolder, DecoderInputBuffer, boolean)>
	//   83  177:istore          5
			if(j == -5)
	//*  84  179:iload           5
	//*  85  181:bipush          -5
	//*  86  183:icmpne          200
				onInputFormatChanged(formatHolder.format);
	//   87  186:aload_0         
	//   88  187:aload_0         
	//   89  188:getfield        #152 <Field FormatHolder formatHolder>
	//   90  191:getfield        #417 <Field Format FormatHolder.format>
	//   91  194:invokevirtual   #421 <Method void onInputFormatChanged(Format)>
			else
	//*  92  197:goto            226
			if(j == -4)
	//*  93  200:iload           5
	//*  94  202:bipush          -4
	//*  95  204:icmpne          226
			{
				Assertions.checkState(flagsOnlyBuffer.isEndOfStream());
	//   96  207:aload_0         
	//   97  208:getfield        #146 <Field DecoderInputBuffer flagsOnlyBuffer>
	//   98  211:invokevirtual   #424 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//   99  214:invokestatic    #123 <Method void Assertions.checkState(boolean)>
				inputStreamEnded = true;
	//  100  217:aload_0         
	//  101  218:iconst_1        
	//  102  219:putfield        #353 <Field boolean inputStreamEnded>
				processEndOfStream();
	//  103  222:aload_0         
	//  104  223:invokespecial   #298 <Method void processEndOfStream()>
			}
		}
		decoderCounters.ensureUpdated();
	//  105  226:aload_0         
	//  106  227:getfield        #485 <Field DecoderCounters decoderCounters>
	//  107  230:invokevirtual   #794 <Method void DecoderCounters.ensureUpdated()>
	//  108  233:return          
	}

	protected void renderToEndOfStream()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected boolean shouldInitCodec(MediaCodecInfo mediacodecinfo)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final int supportsFormat(Format format1)
		throws ExoPlaybackException
	{
		int i;
		try
		{
			i = supportsFormat(mediaCodecSelector, drmSessionManager, format1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #131 <Field MediaCodecSelector mediaCodecSelector>
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field DrmSessionManager drmSessionManager>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #799 <Method int supportsFormat(MediaCodecSelector, DrmSessionManager, Format)>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(Format format1)
	//*  10   16:astore_1        
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (format1)), getIndex());
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:invokevirtual   #427 <Method int getIndex()>
	//   14   22:invokestatic    #431 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   15   25:athrow          
		}
		return i;
	}

	protected abstract int supportsFormat(MediaCodecSelector mediacodecselector, DrmSessionManager drmsessionmanager, Format format1)
		throws MediaCodecUtil.DecoderQueryException;

	public final int supportsMixedMimeTypeAdaptation()
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	private static final byte ADAPTATION_WORKAROUND_BUFFER[] = Util.getBytesFromHexString("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
	private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
	private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
	private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
	private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
	protected static final int KEEP_CODEC_RESULT_NO = 0;
	protected static final int KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION = 1;
	protected static final int KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION = 3;
	private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000L;
	private static final int RECONFIGURATION_STATE_NONE = 0;
	private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
	private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
	private static final int REINITIALIZATION_STATE_NONE = 0;
	private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
	private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
	private static final String TAG = "MediaCodecRenderer";
	private final DecoderInputBuffer buffer = new DecoderInputBuffer(0);
	private MediaCodec codec;
	private int codecAdaptationWorkaroundMode;
	private long codecHotswapDeadlineMs;
	private MediaCodecInfo codecInfo;
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
	private final List decodeOnlyPresentationTimestamps = new ArrayList();
	protected DecoderCounters decoderCounters;
	private DrmSession drmSession;
	private final DrmSessionManager drmSessionManager;
	private final DecoderInputBuffer flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
	private Format format;
	private final FormatHolder formatHolder = new FormatHolder();
	private ByteBuffer inputBuffers[];
	private int inputIndex;
	private boolean inputStreamEnded;
	private final MediaCodecSelector mediaCodecSelector;
	private ByteBuffer outputBuffer;
	private final android.media.MediaCodec.BufferInfo outputBufferInfo = new android.media.MediaCodec.BufferInfo();
	private ByteBuffer outputBuffers[];
	private int outputIndex;
	private boolean outputStreamEnded;
	private DrmSession pendingDrmSession;
	private final boolean playClearSamplesWithoutKeys;
	private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
	private boolean shouldSkipOutputBuffer;
	private boolean waitingForFirstSyncFrame;
	private boolean waitingForKeys;

	static 
	{
	//    0    0:ldc1            #100 <String "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78">
	//    1    2:invokestatic    #106 <Method byte[] Util.getBytesFromHexString(String)>
	//    2    5:putstatic       #108 <Field byte[] ADAPTATION_WORKAROUND_BUFFER>
	//*   3    8:return          
	}
}
