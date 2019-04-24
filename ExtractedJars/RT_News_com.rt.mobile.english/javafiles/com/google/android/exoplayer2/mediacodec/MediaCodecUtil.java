// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.*;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.mediacodec:
//			MediaCodecInfo

public final class MediaCodecUtil
{
	private static final class CodecKey
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          56
			{
				if(obj.getClass() != com/google/android/exoplayer2/mediacodec/MediaCodecUtil$CodecKey)
		//*   7   11:aload_1         
		//*   8   12:invokevirtual   #28  <Method Class Object.getClass()>
		//*   9   15:ldc1            #2   <Class MediaCodecUtil$CodecKey>
		//*  10   17:if_acmpeq       22
					return false;
		//   11   20:iconst_0        
		//   12   21:ireturn         
				obj = ((Object) ((CodecKey)obj));
		//   13   22:aload_1         
		//   14   23:checkcast       #2   <Class MediaCodecUtil$CodecKey>
		//   15   26:astore_1        
				return TextUtils.equals(((CharSequence) (mimeType)), ((CharSequence) (((CodecKey) (obj)).mimeType))) && secure == ((CodecKey) (obj)).secure;
		//   16   27:aload_0         
		//   17   28:getfield        #18  <Field String mimeType>
		//   18   31:aload_1         
		//   19   32:getfield        #18  <Field String mimeType>
		//   20   35:invokestatic    #33  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//   21   38:ifeq            54
		//   22   41:aload_0         
		//   23   42:getfield        #20  <Field boolean secure>
		//   24   45:aload_1         
		//   25   46:getfield        #20  <Field boolean secure>
		//   26   49:icmpne          54
		//   27   52:iconst_1        
		//   28   53:ireturn         
		//   29   54:iconst_0        
		//   30   55:ireturn         
			} else
			{
				return false;
		//   31   56:iconst_0        
		//   32   57:ireturn         
			}
		}

		public int hashCode()
		{
			int i;
			if(mimeType == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field String mimeType>
		//*   2    4:ifnonnull       12
				i = 0;
		//    3    7:iconst_0        
		//    4    8:istore_1        
			else
		//*   5    9:goto            20
				i = mimeType.hashCode();
		//    6   12:aload_0         
		//    7   13:getfield        #18  <Field String mimeType>
		//    8   16:invokevirtual   #40  <Method int String.hashCode()>
		//    9   19:istore_1        
			char c;
			if(secure)
		//*  10   20:aload_0         
		//*  11   21:getfield        #20  <Field boolean secure>
		//*  12   24:ifeq            34
				c = '\u04CF';
		//   13   27:sipush          1231
		//   14   30:istore_2        
			else
		//*  15   31:goto            38
				c = '\u04D5';
		//   16   34:sipush          1237
		//   17   37:istore_2        
			return 31 * (i + 31) + c;
		//   18   38:bipush          31
		//   19   40:iload_1         
		//   20   41:bipush          31
		//   21   43:iadd            
		//   22   44:imul            
		//   23   45:iload_2         
		//   24   46:iadd            
		//   25   47:ireturn         
		}

		public final String mimeType;
		public final boolean secure;

		public CodecKey(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mimeType = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String mimeType>
			secure = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field boolean secure>
		//    8   14:return          
		}
	}

	public static class DecoderQueryException extends Exception
	{

		private DecoderQueryException(Throwable throwable)
		{
			super("Failed to query underlying media codecs", throwable);
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "Failed to query underlying media codecs">
		//    2    3:aload_1         
		//    3    4:invokespecial   #14  <Method void Exception(String, Throwable)>
		//    4    7:return          
		}

	}

	private static interface MediaCodecListCompat
	{

		public abstract int getCodecCount();

		public abstract MediaCodecInfo getCodecInfoAt(int i);

		public abstract boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities);

		public abstract boolean secureDecodersExplicit();
	}

	private static final class MediaCodecListCompatV16
		implements MediaCodecListCompat
	{

		public int getCodecCount()
		{
			return MediaCodecList.getCodecCount();
		//    0    0:invokestatic    #22  <Method int MediaCodecList.getCodecCount()>
		//    1    3:ireturn         
		}

		public MediaCodecInfo getCodecInfoAt(int i)
		{
			return MediaCodecList.getCodecInfoAt(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #26  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
		//    2    4:areturn         
		}

		public boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
		{
			return "video/avc".equals(((Object) (s)));
		//    0    0:ldc1            #30  <String "video/avc">
		//    1    2:aload_1         
		//    2    3:invokevirtual   #36  <Method boolean String.equals(Object)>
		//    3    6:ireturn         
		}

		public boolean secureDecodersExplicit()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private MediaCodecListCompatV16()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static final class MediaCodecListCompatV21
		implements MediaCodecListCompat
	{

		private void ensureMediaCodecInfosInitialized()
		{
			if(mediaCodecInfos == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//*   2    4:ifnonnull       25
				mediaCodecInfos = (new MediaCodecList(codecKind)).getCodecInfos();
		//    3    7:aload_0         
		//    4    8:new             #34  <Class MediaCodecList>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #36  <Field int codecKind>
		//    8   16:invokespecial   #39  <Method void MediaCodecList(int)>
		//    9   19:invokevirtual   #43  <Method MediaCodecInfo[] MediaCodecList.getCodecInfos()>
		//   10   22:putfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//   11   25:return          
		}

		public int getCodecCount()
		{
			ensureMediaCodecInfosInitialized();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void ensureMediaCodecInfosInitialized()>
			return mediaCodecInfos.length;
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//    4    8:arraylength     
		//    5    9:ireturn         
		}

		public MediaCodecInfo getCodecInfoAt(int i)
		{
			ensureMediaCodecInfosInitialized();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void ensureMediaCodecInfosInitialized()>
			return mediaCodecInfos[i];
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//    4    8:iload_1         
		//    5    9:aaload          
		//    6   10:areturn         
		}

		public boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
		{
			return codeccapabilities.isFeatureSupported("secure-playback");
		//    0    0:aload_2         
		//    1    1:ldc1            #53  <String "secure-playback">
		//    2    3:invokevirtual   #59  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
		//    3    6:ireturn         
		}

		public boolean secureDecodersExplicit()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private final int codecKind;
		private MediaCodecInfo mediaCodecInfos[];

		public MediaCodecListCompatV21(boolean flag)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #20  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #27  <Method void Runtime(String)>
		//    4    9:athrow          
		}
	}


	private MediaCodecUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method void Object()>
	//    2    4:return          
	}

	private static void applyWorkarounds(List list)
	{
		if(Util.SDK_INT < 26)
	//*   0    0:getstatic       #187 <Field int Util.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          100
		{
			int j = list.size();
	//    3    8:aload_0         
	//    4    9:invokeinterface #193 <Method int List.size()>
	//    5   14:istore_2        
			int i = 1;
	//    6   15:iconst_1        
	//    7   16:istore_1        
			if(j > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((Object) (((com.google.android.exoplayer2.mediacodec.MediaCodecInfo)list.get(0)).name))))
	//*   8   17:iload_2         
	//*   9   18:iconst_1        
	//*  10   19:icmple          100
	//*  11   22:ldc1            #51  <String "OMX.MTK.AUDIO.DECODER.RAW">
	//*  12   24:aload_0         
	//*  13   25:iconst_0        
	//*  14   26:invokeinterface #197 <Method Object List.get(int)>
	//*  15   31:checkcast       #68  <Class com.google.android.exoplayer2.mediacodec.MediaCodecInfo>
	//*  16   34:getfield        #200 <Field String MediaCodecInfo.name>
	//*  17   37:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  18   40:ifeq            100
				for(; i < list.size(); i++)
	//*  19   43:iload_1         
	//*  20   44:aload_0         
	//*  21   45:invokeinterface #193 <Method int List.size()>
	//*  22   50:icmpge          100
				{
					com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediacodecinfo = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo)list.get(i);
	//   23   53:aload_0         
	//   24   54:iload_1         
	//   25   55:invokeinterface #197 <Method Object List.get(int)>
	//   26   60:checkcast       #68  <Class com.google.android.exoplayer2.mediacodec.MediaCodecInfo>
	//   27   63:astore_3        
					if("OMX.google.raw.decoder".equals(((Object) (mediacodecinfo.name))))
	//*  28   64:ldc1            #45  <String "OMX.google.raw.decoder">
	//*  29   66:aload_3         
	//*  30   67:getfield        #200 <Field String MediaCodecInfo.name>
	//*  31   70:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  32   73:ifeq            93
					{
						list.remove(i);
	//   33   76:aload_0         
	//   34   77:iload_1         
	//   35   78:invokeinterface #209 <Method Object List.remove(int)>
	//   36   83:pop             
						list.add(0, ((Object) (mediacodecinfo)));
	//   37   84:aload_0         
	//   38   85:iconst_0        
	//   39   86:aload_3         
	//   40   87:invokeinterface #213 <Method void List.add(int, Object)>
						return;
	//   41   92:return          
					}
				}

	//   42   93:iload_1         
	//   43   94:iconst_1        
	//   44   95:iadd            
	//   45   96:istore_1        
		}
	//*  46   97:goto            43
	//   47  100:return          
	}

	private static int avcLevelToMaxFrameSize(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    16: default 140
	//	               1: 188
	//	               2: 184
	//	               8: 181
	//	               16: 178
	//	               32: 175
	//	               64: 172
	//	               128: 169
	//	               256: 166
	//	               512: 163
	//	               1024: 160
	//	               2048: 157
	//	               4096: 154
	//	               8192: 151
	//	               16384: 148
	//	               32768: 145
	//	               65536: 142
		default:
			return -1;
	//    2  140:iconst_m1       
	//    3  141:ireturn         

		case 65536: 
			return 0x900000;
	//    4  142:ldc1            #218 <Int 0x900000>
	//    5  144:ireturn         

		case 32768: 
			return 0x900000;
	//    6  145:ldc1            #218 <Int 0x900000>
	//    7  147:ireturn         

		case 16384: 
			return 0x564000;
	//    8  148:ldc1            #219 <Int 0x564000>
	//    9  150:ireturn         

		case 8192: 
			return 0x220000;
	//   10  151:ldc1            #220 <Int 0x220000>
	//   11  153:ireturn         

		case 4096: 
			return 0x200000;
	//   12  154:ldc1            #172 <Int 0x200000>
	//   13  156:ireturn         

		case 2048: 
			return 0x200000;
	//   14  157:ldc1            #172 <Int 0x200000>
	//   15  159:ireturn         

		case 1024: 
			return 0x140000;
	//   16  160:ldc1            #221 <Int 0x140000>
	//   17  162:ireturn         

		case 512: 
			return 0xe1000;
	//   18  163:ldc1            #222 <Int 0xe1000>
	//   19  165:ireturn         

		case 256: 
			return 0x65400;
	//   20  166:ldc1            #223 <Int 0x65400>
	//   21  168:ireturn         

		case 128: 
			return 0x65400;
	//   22  169:ldc1            #223 <Int 0x65400>
	//   23  171:ireturn         

		case 64: // '@'
			return 0x31800;
	//   24  172:ldc1            #224 <Int 0x31800>
	//   25  174:ireturn         

		case 32: // ' '
			return 0x18c00;
	//   26  175:ldc1            #225 <Int 0x18c00>
	//   27  177:ireturn         

		case 16: // '\020'
			return 0x18c00;
	//   28  178:ldc1            #225 <Int 0x18c00>
	//   29  180:ireturn         

		case 8: // '\b'
			return 0x18c00;
	//   30  181:ldc1            #225 <Int 0x18c00>
	//   31  183:ireturn         

		case 2: // '\002'
			return 25344;
	//   32  184:sipush          25344
	//   33  187:ireturn         

		case 1: // '\001'
			return 25344;
	//   34  188:sipush          25344
	//   35  191:ireturn         
		}
	}

	private static boolean codecNeedsDisableAdaptationWorkaround(String s)
	{
		return Util.SDK_INT <= 22 && ("ODROID-XU3".equals(((Object) (Util.MODEL))) || "Nexus 10".equals(((Object) (Util.MODEL)))) && ("OMX.Exynos.AVC.Decoder".equals(((Object) (s))) || "OMX.Exynos.AVC.Decoder.secure".equals(((Object) (s))));
	//    0    0:getstatic       #187 <Field int Util.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmpgt          50
	//    3    8:ldc1            #229 <String "ODROID-XU3">
	//    4   10:getstatic       #232 <Field String Util.MODEL>
	//    5   13:invokevirtual   #206 <Method boolean String.equals(Object)>
	//    6   16:ifne            30
	//    7   19:ldc1            #234 <String "Nexus 10">
	//    8   21:getstatic       #232 <Field String Util.MODEL>
	//    9   24:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   10   27:ifeq            50
	//   11   30:ldc1            #236 <String "OMX.Exynos.AVC.Decoder">
	//   12   32:aload_0         
	//   13   33:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   14   36:ifne            48
	//   15   39:ldc1            #238 <String "OMX.Exynos.AVC.Decoder.secure">
	//   16   41:aload_0         
	//   17   42:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   18   45:ifeq            50
	//   19   48:iconst_1        
	//   20   49:ireturn         
	//   21   50:iconst_0        
	//   22   51:ireturn         
	}

	private static Pair getAvcProfileAndLevel(String s, String as[])
	{
		if(as.length < 2)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_2        
	//*   3    3:icmpge          39
		{
			as = ((String []) (new StringBuilder()));
	//    4    6:new             #244 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #245 <Method void StringBuilder()>
	//    7   13:astore_1        
			((StringBuilder) (as)).append("Ignoring malformed AVC codec string: ");
	//    8   14:aload_1         
	//    9   15:ldc1            #247 <String "Ignoring malformed AVC codec string: ">
	//   10   17:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			((StringBuilder) (as)).append(s);
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
			Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//   16   27:ldc1            #58  <String "MediaCodecUtil">
	//   17   29:aload_1         
	//   18   30:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   19   33:invokestatic    #261 <Method int Log.w(String, String)>
	//   20   36:pop             
			return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
		}
		Integer integer;
		if(as[1].length() != 6)
			break MISSING_BLOCK_LABEL_90;
	//   23   39:aload_1         
	//   24   40:iconst_1        
	//   25   41:aaload          
	//   26   42:invokevirtual   #264 <Method int String.length()>
	//   27   45:bipush          6
	//   28   47:icmpne          90
		integer = Integer.valueOf(Integer.parseInt(as[1].substring(0, 2), 16));
	//   29   50:aload_1         
	//   30   51:iconst_1        
	//   31   52:aaload          
	//   32   53:iconst_0        
	//   33   54:iconst_2        
	//   34   55:invokevirtual   #268 <Method String String.substring(int, int)>
	//   35   58:bipush          16
	//   36   60:invokestatic    #272 <Method int Integer.parseInt(String, int)>
	//   37   63:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   38   66:astore          4
		as = ((String []) (Integer.valueOf(Integer.parseInt(as[1].substring(4), 16))));
	//   39   68:aload_1         
	//   40   69:iconst_1        
	//   41   70:aaload          
	//   42   71:iconst_4        
	//   43   72:invokevirtual   #275 <Method String String.substring(int)>
	//   44   75:bipush          16
	//   45   77:invokestatic    #272 <Method int Integer.parseInt(String, int)>
	//   46   80:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   47   83:astore_1        
		s = ((String) (integer));
	//   48   84:aload           4
	//   49   86:astore_0        
		break MISSING_BLOCK_LABEL_118;
	//   50   87:goto            118
		int i;
		if(as.length < 3)
			break MISSING_BLOCK_LABEL_236;
	//   51   90:aload_1         
	//   52   91:arraylength     
	//   53   92:iconst_3        
	//   54   93:icmplt          236
		i = Integer.parseInt(as[1]);
	//   55   96:aload_1         
	//   56   97:iconst_1        
	//   57   98:aaload          
	//   58   99:invokestatic    #278 <Method int Integer.parseInt(String)>
	//   59  102:istore_2        
		as = ((String []) (Integer.valueOf(Integer.parseInt(as[2]))));
	//   60  103:aload_1         
	//   61  104:iconst_2        
	//   62  105:aaload          
	//   63  106:invokestatic    #278 <Method int Integer.parseInt(String)>
	//   64  109:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   65  112:astore_1        
		s = ((String) (Integer.valueOf(i)));
	//   66  113:iload_2         
	//   67  114:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   68  117:astore_0        
		int j = AVC_PROFILE_NUMBER_TO_CONST.get(((Integer) (s)).intValue(), -1);
	//   69  118:getstatic       #96  <Field SparseIntArray AVC_PROFILE_NUMBER_TO_CONST>
	//   70  121:aload_0         
	//   71  122:invokevirtual   #281 <Method int Integer.intValue()>
	//   72  125:iconst_m1       
	//   73  126:invokevirtual   #284 <Method int SparseIntArray.get(int, int)>
	//   74  129:istore_2        
		if(j == -1)
	//*  75  130:iload_2         
	//*  76  131:iconst_m1       
	//*  77  132:icmpne          169
		{
			as = ((String []) (new StringBuilder()));
	//   78  135:new             #244 <Class StringBuilder>
	//   79  138:dup             
	//   80  139:invokespecial   #245 <Method void StringBuilder()>
	//   81  142:astore_1        
			((StringBuilder) (as)).append("Unknown AVC profile: ");
	//   82  143:aload_1         
	//   83  144:ldc2            #286 <String "Unknown AVC profile: ">
	//   84  147:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   85  150:pop             
			((StringBuilder) (as)).append(((Object) (s)));
	//   86  151:aload_1         
	//   87  152:aload_0         
	//   88  153:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//   89  156:pop             
			Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//   90  157:ldc1            #58  <String "MediaCodecUtil">
	//   91  159:aload_1         
	//   92  160:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   93  163:invokestatic    #261 <Method int Log.w(String, String)>
	//   94  166:pop             
			return null;
	//   95  167:aconst_null     
	//   96  168:areturn         
		}
		int k = AVC_LEVEL_NUMBER_TO_CONST.get(((Integer) (as)).intValue(), -1);
	//   97  169:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   98  172:aload_1         
	//   99  173:invokevirtual   #281 <Method int Integer.intValue()>
	//  100  176:iconst_m1       
	//  101  177:invokevirtual   #284 <Method int SparseIntArray.get(int, int)>
	//  102  180:istore_3        
		if(k == -1)
	//* 103  181:iload_3         
	//* 104  182:iconst_m1       
	//* 105  183:icmpne          220
		{
			s = ((String) (new StringBuilder()));
	//  106  186:new             #244 <Class StringBuilder>
	//  107  189:dup             
	//  108  190:invokespecial   #245 <Method void StringBuilder()>
	//  109  193:astore_0        
			((StringBuilder) (s)).append("Unknown AVC level: ");
	//  110  194:aload_0         
	//  111  195:ldc2            #291 <String "Unknown AVC level: ">
	//  112  198:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//  113  201:pop             
			((StringBuilder) (s)).append(((Object) (as)));
	//  114  202:aload_0         
	//  115  203:aload_1         
	//  116  204:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//  117  207:pop             
			Log.w("MediaCodecUtil", ((StringBuilder) (s)).toString());
	//  118  208:ldc1            #58  <String "MediaCodecUtil">
	//  119  210:aload_0         
	//  120  211:invokevirtual   #255 <Method String StringBuilder.toString()>
	//  121  214:invokestatic    #261 <Method int Log.w(String, String)>
	//  122  217:pop             
			return null;
	//  123  218:aconst_null     
	//  124  219:areturn         
		} else
		{
			return new Pair(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(k))));
	//  125  220:new             #293 <Class Pair>
	//  126  223:dup             
	//  127  224:iload_2         
	//  128  225:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  129  228:iload_3         
	//  130  229:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  131  232:invokespecial   #296 <Method void Pair(Object, Object)>
	//  132  235:areturn         
		}
		try
		{
			as = ((String []) (new StringBuilder()));
	//  133  236:new             #244 <Class StringBuilder>
	//  134  239:dup             
	//  135  240:invokespecial   #245 <Method void StringBuilder()>
	//  136  243:astore_1        
			((StringBuilder) (as)).append("Ignoring malformed AVC codec string: ");
	//  137  244:aload_1         
	//  138  245:ldc1            #247 <String "Ignoring malformed AVC codec string: ">
	//  139  247:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//  140  250:pop             
			((StringBuilder) (as)).append(s);
	//  141  251:aload_1         
	//  142  252:aload_0         
	//  143  253:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//  144  256:pop             
			Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//  145  257:ldc1            #58  <String "MediaCodecUtil">
	//  146  259:aload_1         
	//  147  260:invokevirtual   #255 <Method String StringBuilder.toString()>
	//  148  263:invokestatic    #261 <Method int Log.w(String, String)>
	//  149  266:pop             
		}
	//* 150  267:aconst_null     
	//* 151  268:areturn         
	//* 152  269:new             #244 <Class StringBuilder>
	//* 153  272:dup             
	//* 154  273:invokespecial   #245 <Method void StringBuilder()>
	//* 155  276:astore_1        
	//* 156  277:aload_1         
	//* 157  278:ldc1            #247 <String "Ignoring malformed AVC codec string: ">
	//* 158  280:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 159  283:pop             
	//* 160  284:aload_1         
	//* 161  285:aload_0         
	//* 162  286:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 163  289:pop             
	//* 164  290:ldc1            #58  <String "MediaCodecUtil">
	//* 165  292:aload_1         
	//* 166  293:invokevirtual   #255 <Method String StringBuilder.toString()>
	//* 167  296:invokestatic    #261 <Method int Log.w(String, String)>
	//* 168  299:pop             
	//* 169  300:aconst_null     
	//* 170  301:areturn         
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			as = ((String []) (new StringBuilder()));
			((StringBuilder) (as)).append("Ignoring malformed AVC codec string: ");
			((StringBuilder) (as)).append(s);
			Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
			return null;
		}
		return null;
	//* 171  302:astore_1        
	//* 172  303:goto            269
	}

	public static Pair getCodecProfileAndLevel(String s)
	{
		byte byte0;
		String as[];
label0:
		{
			if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
				return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
			as = s.split("\\.");
	//    4    6:aload_0         
	//    5    7:ldc2            #301 <String "\\.">
	//    6   10:invokevirtual   #305 <Method String[] String.split(String)>
	//    7   13:astore_2        
			byte0 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
			String s1 = as[0];
	//   10   16:aload_2         
	//   11   17:iconst_0        
	//   12   18:aaload          
	//   13   19:astore_3        
			switch(s1.hashCode())
	//*  14   20:aload_3         
	//*  15   21:invokevirtual   #308 <Method int String.hashCode()>
			{
			default:
				break;

	//*  16   24:lookupswitch    4: default 68
	//	               3006243: 111
	//	               3006244: 97
	//	               3199032: 85
	//	               3214780: 71
	//*  17   68:goto            125
			case 3214780: 
				if(!s1.equals("hvc1"))
					break;
	//   18   71:aload_3         
	//   19   72:ldc1            #42  <String "hvc1">
	//   20   74:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   21   77:ifeq            125
				byte0 = 1;
	//   22   80:iconst_1        
	//   23   81:istore_1        
				break label0;
	//   24   82:goto            127

			case 3199032: 
				if(!s1.equals("hev1"))
	//*  25   85:aload_3         
	//*  26   86:ldc1            #39  <String "hev1">
	//*  27   88:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  28   91:ifeq            125
					break;
	//   29   94:goto            127
				break label0;

			case 3006244: 
				if(!s1.equals("avc2"))
					break;
	//   30   97:aload_3         
	//   31   98:ldc1            #36  <String "avc2">
	//   32  100:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   33  103:ifeq            125
				byte0 = 3;
	//   34  106:iconst_3        
	//   35  107:istore_1        
				break label0;
	//   36  108:goto            127

			case 3006243: 
				if(!s1.equals("avc1"))
					break;
	//   37  111:aload_3         
	//   38  112:ldc1            #33  <String "avc1">
	//   39  114:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   40  117:ifeq            125
				byte0 = 2;
	//   41  120:iconst_2        
	//   42  121:istore_1        
				break label0;
	//   43  122:goto            127
			}
			byte0 = -1;
	//   44  125:iconst_m1       
	//   45  126:istore_1        
		}
		switch(byte0)
	//*  46  127:iload_1         
		{
	//*  47  128:tableswitch     0 3: default 160
	//	               0 168
	//	               1 168
	//	               2 162
	//	               3 162
		default:
			return null;
	//   48  160:aconst_null     
	//   49  161:areturn         

		case 2: // '\002'
		case 3: // '\003'
			return getAvcProfileAndLevel(s, as);
	//   50  162:aload_0         
	//   51  163:aload_2         
	//   52  164:invokestatic    #310 <Method Pair getAvcProfileAndLevel(String, String[])>
	//   53  167:areturn         

		case 0: // '\0'
		case 1: // '\001'
			return getHevcProfileAndLevel(s, as);
	//   54  168:aload_0         
	//   55  169:aload_2         
	//   56  170:invokestatic    #313 <Method Pair getHevcProfileAndLevel(String, String[])>
	//   57  173:areturn         
		}
	}

	public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo getDecoderInfo(String s, boolean flag)
		throws DecoderQueryException
	{
		s = ((String) (getDecoderInfos(s, flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #321 <Method List getDecoderInfos(String, boolean)>
	//    3    5:astore_0        
		if(((List) (s)).isEmpty())
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #325 <Method boolean List.isEmpty()>
	//*   6   12:ifeq            17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (com.google.android.exoplayer2.mediacodec.MediaCodecInfo)((List) (s)).get(0);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokeinterface #197 <Method Object List.get(int)>
	//   12   24:checkcast       #68  <Class com.google.android.exoplayer2.mediacodec.MediaCodecInfo>
	//   13   27:areturn         
	}

	public static List getDecoderInfos(String s, boolean flag)
		throws DecoderQueryException
	{
		com/google/android/exoplayer2/mediacodec/MediaCodecUtil;
	//    0    0:ldc1            #2   <Class MediaCodecUtil>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		CodecKey codeckey;
		codeckey = new CodecKey(s, flag);
	//    2    3:new             #8   <Class MediaCodecUtil$CodecKey>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokespecial   #330 <Method void MediaCodecUtil$CodecKey(String, boolean)>
	//    7   12:astore          6
		obj = ((Object) ((List)decoderInfosCache.get(((Object) (codeckey)))));
	//    8   14:getstatic       #91  <Field HashMap decoderInfosCache>
	//    9   17:aload           6
	//   10   19:invokevirtual   #333 <Method Object HashMap.get(Object)>
	//   11   22:checkcast       #189 <Class List>
	//   12   25:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_35;
	//   13   26:aload_2         
	//   14   27:ifnull          35
		com/google/android/exoplayer2/mediacodec/MediaCodecUtil;
	//   15   30:ldc1            #2   <Class MediaCodecUtil>
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return ((List) (obj));
	//   17   33:aload_2         
	//   18   34:areturn         
		if(Util.SDK_INT >= 21)
	//*  19   35:getstatic       #187 <Field int Util.SDK_INT>
	//*  20   38:bipush          21
	//*  21   40:icmplt          55
		{
			obj = ((Object) (new MediaCodecListCompatV21(flag)));
	//   22   43:new             #20  <Class MediaCodecUtil$MediaCodecListCompatV21>
	//   23   46:dup             
	//   24   47:iload_1         
	//   25   48:invokespecial   #336 <Method void MediaCodecUtil$MediaCodecListCompatV21(boolean)>
	//   26   51:astore_2        
			break MISSING_BLOCK_LABEL_64;
	//   27   52:goto            64
		}
		obj = ((Object) (new MediaCodecListCompatV16()));
	//   28   55:new             #17  <Class MediaCodecUtil$MediaCodecListCompatV16>
	//   29   58:dup             
	//   30   59:aconst_null     
	//   31   60:invokespecial   #339 <Method void MediaCodecUtil$MediaCodecListCompatV16(MediaCodecUtil$1)>
	//   32   63:astore_2        
		ArrayList arraylist1 = getDecoderInfosInternal(codeckey, ((MediaCodecListCompat) (obj)), s);
	//   33   64:aload           6
	//   34   66:aload_2         
	//   35   67:aload_0         
	//   36   68:invokestatic    #343 <Method ArrayList getDecoderInfosInternal(MediaCodecUtil$CodecKey, MediaCodecUtil$MediaCodecListCompat, String)>
	//   37   71:astore          5
		Object obj1;
		ArrayList arraylist;
		obj1 = obj;
	//   38   73:aload_2         
	//   39   74:astore_3        
		arraylist = arraylist1;
	//   40   75:aload           5
	//   41   77:astore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_220;
	//   42   79:iload_1         
	//   43   80:ifeq            220
		obj1 = obj;
	//   44   83:aload_2         
	//   45   84:astore_3        
		arraylist = arraylist1;
	//   46   85:aload           5
	//   47   87:astore          4
		if(!arraylist1.isEmpty())
			break MISSING_BLOCK_LABEL_220;
	//   48   89:aload           5
	//   49   91:invokevirtual   #346 <Method boolean ArrayList.isEmpty()>
	//   50   94:ifeq            220
		obj1 = obj;
	//   51   97:aload_2         
	//   52   98:astore_3        
		arraylist = arraylist1;
	//   53   99:aload           5
	//   54  101:astore          4
		if(21 > Util.SDK_INT)
			break MISSING_BLOCK_LABEL_220;
	//   55  103:bipush          21
	//   56  105:getstatic       #187 <Field int Util.SDK_INT>
	//   57  108:icmpgt          220
		obj1 = obj;
	//   58  111:aload_2         
	//   59  112:astore_3        
		arraylist = arraylist1;
	//   60  113:aload           5
	//   61  115:astore          4
		if(Util.SDK_INT > 23)
			break MISSING_BLOCK_LABEL_220;
	//   62  117:getstatic       #187 <Field int Util.SDK_INT>
	//   63  120:bipush          23
	//   64  122:icmpgt          220
		obj = ((Object) (new MediaCodecListCompatV16()));
	//   65  125:new             #17  <Class MediaCodecUtil$MediaCodecListCompatV16>
	//   66  128:dup             
	//   67  129:aconst_null     
	//   68  130:invokespecial   #339 <Method void MediaCodecUtil$MediaCodecListCompatV16(MediaCodecUtil$1)>
	//   69  133:astore_2        
		arraylist1 = getDecoderInfosInternal(codeckey, ((MediaCodecListCompat) (obj)), s);
	//   70  134:aload           6
	//   71  136:aload_2         
	//   72  137:aload_0         
	//   73  138:invokestatic    #343 <Method ArrayList getDecoderInfosInternal(MediaCodecUtil$CodecKey, MediaCodecUtil$MediaCodecListCompat, String)>
	//   74  141:astore          5
		obj1 = obj;
	//   75  143:aload_2         
	//   76  144:astore_3        
		arraylist = arraylist1;
	//   77  145:aload           5
	//   78  147:astore          4
		if(arraylist1.isEmpty())
			break MISSING_BLOCK_LABEL_220;
	//   79  149:aload           5
	//   80  151:invokevirtual   #346 <Method boolean ArrayList.isEmpty()>
	//   81  154:ifne            220
		obj1 = ((Object) (new StringBuilder()));
	//   82  157:new             #244 <Class StringBuilder>
	//   83  160:dup             
	//   84  161:invokespecial   #245 <Method void StringBuilder()>
	//   85  164:astore_3        
		((StringBuilder) (obj1)).append("MediaCodecList API didn't list secure decoder for: ");
	//   86  165:aload_3         
	//   87  166:ldc2            #348 <String "MediaCodecList API didn't list secure decoder for: ">
	//   88  169:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   89  172:pop             
		((StringBuilder) (obj1)).append(s);
	//   90  173:aload_3         
	//   91  174:aload_0         
	//   92  175:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   93  178:pop             
		((StringBuilder) (obj1)).append(". Assuming: ");
	//   94  179:aload_3         
	//   95  180:ldc2            #350 <String ". Assuming: ">
	//   96  183:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   97  186:pop             
		((StringBuilder) (obj1)).append(((com.google.android.exoplayer2.mediacodec.MediaCodecInfo)arraylist1.get(0)).name);
	//   98  187:aload_3         
	//   99  188:aload           5
	//  100  190:iconst_0        
	//  101  191:invokevirtual   #351 <Method Object ArrayList.get(int)>
	//  102  194:checkcast       #68  <Class com.google.android.exoplayer2.mediacodec.MediaCodecInfo>
	//  103  197:getfield        #200 <Field String MediaCodecInfo.name>
	//  104  200:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//  105  203:pop             
		Log.w("MediaCodecUtil", ((StringBuilder) (obj1)).toString());
	//  106  204:ldc1            #58  <String "MediaCodecUtil">
	//  107  206:aload_3         
	//  108  207:invokevirtual   #255 <Method String StringBuilder.toString()>
	//  109  210:invokestatic    #261 <Method int Log.w(String, String)>
	//  110  213:pop             
		arraylist = arraylist1;
	//  111  214:aload           5
	//  112  216:astore          4
		obj1 = obj;
	//  113  218:aload_2         
	//  114  219:astore_3        
		if("audio/eac3-joc".equals(((Object) (s))))
	//* 115  220:ldc2            #353 <String "audio/eac3-joc">
	//* 116  223:aload_0         
	//* 117  224:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 118  227:ifeq            256
			arraylist.addAll(((java.util.Collection) (getDecoderInfosInternal(new CodecKey("audio/eac3", codeckey.secure), ((MediaCodecListCompat) (obj1)), s))));
	//  119  230:aload           4
	//  120  232:new             #8   <Class MediaCodecUtil$CodecKey>
	//  121  235:dup             
	//  122  236:ldc2            #355 <String "audio/eac3">
	//  123  239:aload           6
	//  124  241:getfield        #359 <Field boolean MediaCodecUtil$CodecKey.secure>
	//  125  244:invokespecial   #330 <Method void MediaCodecUtil$CodecKey(String, boolean)>
	//  126  247:aload_3         
	//  127  248:aload_0         
	//  128  249:invokestatic    #343 <Method ArrayList getDecoderInfosInternal(MediaCodecUtil$CodecKey, MediaCodecUtil$MediaCodecListCompat, String)>
	//  129  252:invokevirtual   #363 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  130  255:pop             
		applyWorkarounds(((List) (arraylist)));
	//  131  256:aload           4
	//  132  258:invokestatic    #365 <Method void applyWorkarounds(List)>
		s = ((String) (Collections.unmodifiableList(((List) (arraylist)))));
	//  133  261:aload           4
	//  134  263:invokestatic    #371 <Method List Collections.unmodifiableList(List)>
	//  135  266:astore_0        
		decoderInfosCache.put(((Object) (codeckey)), ((Object) (s)));
	//  136  267:getstatic       #91  <Field HashMap decoderInfosCache>
	//  137  270:aload           6
	//  138  272:aload_0         
	//  139  273:invokevirtual   #372 <Method Object HashMap.put(Object, Object)>
	//  140  276:pop             
		com/google/android/exoplayer2/mediacodec/MediaCodecUtil;
	//  141  277:ldc1            #2   <Class MediaCodecUtil>
		JVM INSTR monitorexit ;
	//  142  279:monitorexit     
		return ((List) (s));
	//  143  280:aload_0         
	//  144  281:areturn         
		s;
	//  145  282:astore_0        
	//* 146  283:ldc1            #2   <Class MediaCodecUtil>
		throw s;
	//  147  285:monitorexit     
	//  148  286:aload_0         
	//  149  287:athrow          
	}

	private static ArrayList getDecoderInfosInternal(CodecKey codeckey, MediaCodecListCompat mediacodeclistcompat, String s)
		throws DecoderQueryException
	{
		Object obj;
		int i;
		int j;
		int k;
		int l;
		int i1;
		boolean flag;
		boolean flag1;
		boolean flag2;
		android.media.MediaCodecInfo.CodecCapabilities codeccapabilities;
		MediaCodecInfo mediacodecinfo;
		String s1;
		ArrayList arraylist;
		String s2;
		String as[];
		String s3;
		StringBuilder stringbuilder;
		try
		{
			arraylist = new ArrayList();
	//    0    0:new             #345 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #376 <Method void ArrayList()>
	//    3    7:astore          14
			s2 = codeckey.mimeType;
	//    4    9:aload_0         
	//    5   10:getfield        #379 <Field String MediaCodecUtil$CodecKey.mimeType>
	//    6   13:astore          15
			i = mediacodeclistcompat.getCodecCount();
	//    7   15:aload_1         
	//    8   16:invokeinterface #382 <Method int MediaCodecUtil$MediaCodecListCompat.getCodecCount()>
	//    9   21:istore_3        
			flag = mediacodeclistcompat.secureDecodersExplicit();
	//   10   22:aload_1         
	//   11   23:invokeinterface #385 <Method boolean MediaCodecUtil$MediaCodecListCompat.secureDecodersExplicit()>
	//   12   28:istore          8
		}
	//*  13   30:iconst_0        
	//*  14   31:istore          5
	//*  15   33:iload           5
	//*  16   35:iload_3         
	//*  17   36:icmpge          411
	//*  18   39:aload_1         
	//*  19   40:iload           5
	//*  20   42:invokeinterface #389 <Method MediaCodecInfo MediaCodecUtil$MediaCodecListCompat.getCodecInfoAt(int)>
	//*  21   47:astore          12
	//*  22   49:aload           12
	//*  23   51:invokevirtual   #394 <Method String MediaCodecInfo.getName()>
	//*  24   54:astore          13
	//*  25   56:iload_3         
	//*  26   57:istore          4
	//*  27   59:aload           12
	//*  28   61:aload           13
	//*  29   63:iload           8
	//*  30   65:aload_2         
	//*  31   66:invokestatic    #398 <Method boolean isCodecUsableDecoder(MediaCodecInfo, String, boolean, String)>
	//*  32   69:ifeq            399
	//*  33   72:aload           12
	//*  34   74:invokevirtual   #402 <Method String[] MediaCodecInfo.getSupportedTypes()>
	//*  35   77:astore          16
	//*  36   79:aload           16
	//*  37   81:arraylength     
	//*  38   82:istore          7
	//*  39   84:iconst_0        
	//*  40   85:istore          6
	//*  41   87:iload_3         
	//*  42   88:istore          4
	//*  43   90:iload           6
	//*  44   92:iload           7
	//*  45   94:icmpge          399
	//*  46   97:aload           16
	//*  47   99:iload           6
	//*  48  101:aaload          
	//*  49  102:astore          17
	//*  50  104:aload           17
	//*  51  106:aload           15
	//*  52  108:invokevirtual   #405 <Method boolean String.equalsIgnoreCase(String)>
	//*  53  111:istore          9
	//*  54  113:iload           9
	//*  55  115:ifeq            390
	//*  56  118:aload           12
	//*  57  120:aload           17
	//*  58  122:invokevirtual   #409 <Method android.media.MediaCodecInfo$CodecCapabilities MediaCodecInfo.getCapabilitiesForType(String)>
	//*  59  125:astore          11
	//*  60  127:aload_1         
	//*  61  128:aload           15
	//*  62  130:aload           11
	//*  63  132:invokeinterface #413 <Method boolean MediaCodecUtil$MediaCodecListCompat.isSecurePlaybackSupported(String, android.media.MediaCodecInfo$CodecCapabilities)>
	//*  64  137:istore          9
	//*  65  139:aload           13
	//*  66  141:invokestatic    #415 <Method boolean codecNeedsDisableAdaptationWorkaround(String)>
	//*  67  144:istore          10
	//*  68  146:iload           8
	//*  69  148:ifeq            433
	//*  70  151:aload_0         
	//*  71  152:getfield        #359 <Field boolean MediaCodecUtil$CodecKey.secure>
	//*  72  155:iload           9
	//*  73  157:icmpeq          425
	//*  74  160:goto            163
	//*  75  163:iload           8
	//*  76  165:ifne            199
	//*  77  168:aload_0         
	//*  78  169:getfield        #359 <Field boolean MediaCodecUtil$CodecKey.secure>
	//*  79  172:ifne            199
	//*  80  175:goto            425
	//*  81  178:aload           14
	//*  82  180:aload           13
	//*  83  182:aload           15
	//*  84  184:aload           11
	//*  85  186:iload           10
	//*  86  188:iconst_0        
	//*  87  189:invokestatic    #419 <Method com.google.android.exoplayer2.mediacodec.MediaCodecInfo MediaCodecInfo.newInstance(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean)>
	//*  88  192:invokevirtual   #421 <Method boolean ArrayList.add(Object)>
	//*  89  195:pop             
	//*  90  196:goto            390
	//*  91  199:iload           8
	//*  92  201:ifne            390
	//*  93  204:iload           9
	//*  94  206:ifeq            390
	//*  95  209:new             #244 <Class StringBuilder>
	//*  96  212:dup             
	//*  97  213:invokespecial   #245 <Method void StringBuilder()>
	//*  98  216:astore          18
	//*  99  218:aload           18
	//* 100  220:aload           13
	//* 101  222:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 102  225:pop             
	//* 103  226:aload           18
	//* 104  228:ldc2            #423 <String ".secure">
	//* 105  231:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 106  234:pop             
	//* 107  235:aload           14
	//* 108  237:aload           18
	//* 109  239:invokevirtual   #255 <Method String StringBuilder.toString()>
	//* 110  242:aload           15
	//* 111  244:aload           11
	//* 112  246:iload           10
	//* 113  248:iconst_1        
	//* 114  249:invokestatic    #419 <Method com.google.android.exoplayer2.mediacodec.MediaCodecInfo MediaCodecInfo.newInstance(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean)>
	//* 115  252:invokevirtual   #421 <Method boolean ArrayList.add(Object)>
	//* 116  255:pop             
	//* 117  256:aload           14
	//* 118  258:areturn         
	//* 119  259:astore          11
	//* 120  261:goto            266
	//* 121  264:astore          11
	//* 122  266:getstatic       #187 <Field int Util.SDK_INT>
	//* 123  269:bipush          23
	//* 124  271:icmpgt          331
	//* 125  274:aload           14
	//* 126  276:invokevirtual   #346 <Method boolean ArrayList.isEmpty()>
	//* 127  279:ifne            331
	//* 128  282:new             #244 <Class StringBuilder>
	//* 129  285:dup             
	//* 130  286:invokespecial   #245 <Method void StringBuilder()>
	//* 131  289:astore          11
	//* 132  291:aload           11
	//* 133  293:ldc2            #425 <String "Skipping codec ">
	//* 134  296:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 135  299:pop             
	//* 136  300:aload           11
	//* 137  302:aload           13
	//* 138  304:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 139  307:pop             
	//* 140  308:aload           11
	//* 141  310:ldc2            #427 <String " (failed to query capabilities)">
	//* 142  313:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 143  316:pop             
	//* 144  317:ldc1            #58  <String "MediaCodecUtil">
	//* 145  319:aload           11
	//* 146  321:invokevirtual   #255 <Method String StringBuilder.toString()>
	//* 147  324:invokestatic    #430 <Method int Log.e(String, String)>
	//* 148  327:pop             
	//* 149  328:goto            390
	//* 150  331:new             #244 <Class StringBuilder>
	//* 151  334:dup             
	//* 152  335:invokespecial   #245 <Method void StringBuilder()>
	//* 153  338:astore_0        
	//* 154  339:aload_0         
	//* 155  340:ldc2            #432 <String "Failed to query codec ">
	//* 156  343:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 157  346:pop             
	//* 158  347:aload_0         
	//* 159  348:aload           13
	//* 160  350:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 161  353:pop             
	//* 162  354:aload_0         
	//* 163  355:ldc2            #434 <String " (">
	//* 164  358:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 165  361:pop             
	//* 166  362:aload_0         
	//* 167  363:aload           17
	//* 168  365:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 169  368:pop             
	//* 170  369:aload_0         
	//* 171  370:ldc2            #436 <String ")">
	//* 172  373:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 173  376:pop             
	//* 174  377:ldc1            #58  <String "MediaCodecUtil">
	//* 175  379:aload_0         
	//* 176  380:invokevirtual   #255 <Method String StringBuilder.toString()>
	//* 177  383:invokestatic    #430 <Method int Log.e(String, String)>
	//* 178  386:pop             
	//* 179  387:aload           11
	//* 180  389:athrow          
	//* 181  390:iload           6
	//* 182  392:iconst_1        
	//* 183  393:iadd            
	//* 184  394:istore          6
	//* 185  396:goto            87
	//* 186  399:iload           5
	//* 187  401:iconst_1        
	//* 188  402:iadd            
	//* 189  403:istore          5
	//* 190  405:iload           4
	//* 191  407:istore_3        
	//* 192  408:goto            33
	//* 193  411:aload           14
	//* 194  413:areturn         
		// Misplaced declaration of an exception variable
		catch(CodecKey codeckey)
	//* 195  414:astore_0        
		{
			throw new DecoderQueryException(((Throwable) (codeckey)));
	//  196  415:new             #11  <Class MediaCodecUtil$DecoderQueryException>
	//  197  418:dup             
	//  198  419:aload_0         
	//  199  420:aconst_null     
	//  200  421:invokespecial   #439 <Method void MediaCodecUtil$DecoderQueryException(Throwable, MediaCodecUtil$1)>
	//  201  424:athrow          
		}
		k = 0;
		if(k >= i) goto _L2; else goto _L1
_L1:
		mediacodecinfo = mediacodeclistcompat.getCodecInfoAt(k);
		s1 = mediacodecinfo.getName();
		j = i;
		if(!isCodecUsableDecoder(mediacodecinfo, s1, flag, s)) goto _L4; else goto _L3
_L3:
		as = mediacodecinfo.getSupportedTypes();
		i1 = as.length;
		l = 0;
_L16:
		j = i;
		if(l >= i1) goto _L4; else goto _L5
_L5:
		s3 = as[l];
		flag1 = s3.equalsIgnoreCase(s2);
		if(!flag1) goto _L7; else goto _L6
_L6:
		codeccapabilities = mediacodecinfo.getCapabilitiesForType(s3);
		flag1 = mediacodeclistcompat.isSecurePlaybackSupported(s2, codeccapabilities);
		flag2 = codecNeedsDisableAdaptationWorkaround(s1);
		if(!flag) goto _L9; else goto _L8
_L8:
		if(codeckey.secure == flag1) goto _L10; else goto _L9
_L9:
		if(flag) goto _L12; else goto _L11
_L11:
		if(codeckey.secure) goto _L12; else goto _L10
_L10:
		arraylist.add(((Object) (MediaCodecInfo.newInstance(s1, s2, codeccapabilities, flag2, false))));
		  goto _L7
_L12:
		if(flag || !flag1) goto _L7; else goto _L13
_L13:
		stringbuilder = new StringBuilder();
		stringbuilder.append(s1);
		stringbuilder.append(".secure");
		arraylist.add(((Object) (MediaCodecInfo.newInstance(stringbuilder.toString(), s2, codeccapabilities, flag2, true))));
		return arraylist;
		obj;
		break MISSING_BLOCK_LABEL_266;
		obj;
_L17:
		if(Util.SDK_INT > 23 || arraylist.isEmpty()) goto _L15; else goto _L14
_L14:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Skipping codec ");
		((StringBuilder) (obj)).append(s1);
		((StringBuilder) (obj)).append(" (failed to query capabilities)");
		Log.e("MediaCodecUtil", ((StringBuilder) (obj)).toString());
		  goto _L7
_L15:
		codeckey = ((CodecKey) (new StringBuilder()));
		((StringBuilder) (codeckey)).append("Failed to query codec ");
		((StringBuilder) (codeckey)).append(s1);
		((StringBuilder) (codeckey)).append(" (");
		((StringBuilder) (codeckey)).append(s3);
		((StringBuilder) (codeckey)).append(")");
		Log.e("MediaCodecUtil", ((StringBuilder) (codeckey)).toString());
		throw obj;
_L7:
		l++;
		  goto _L16
_L4:
		k++;
		i = j;
		break MISSING_BLOCK_LABEL_33;
_L2:
		return arraylist;
	//* 202  425:goto            178
		obj;
	//  203  428:astore          11
		  goto _L17
	//* 204  430:goto            266
	//* 205  433:goto            163
	}

	private static Pair getHevcProfileAndLevel(String s, String as[])
	{
label0:
		{
			if(as.length < 4)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_4        
	//*   3    3:icmpge          40
			{
				as = ((String []) (new StringBuilder()));
	//    4    6:new             #244 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #245 <Method void StringBuilder()>
	//    7   13:astore_1        
				((StringBuilder) (as)).append("Ignoring malformed HEVC codec string: ");
	//    8   14:aload_1         
	//    9   15:ldc2            #442 <String "Ignoring malformed HEVC codec string: ">
	//   10   18:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
				((StringBuilder) (as)).append(s);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
				Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//   16   28:ldc1            #58  <String "MediaCodecUtil">
	//   17   30:aload_1         
	//   18   31:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   19   34:invokestatic    #261 <Method int Log.w(String, String)>
	//   20   37:pop             
				return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
			}
			Matcher matcher = PROFILE_PATTERN.matcher(((CharSequence) (as[1])));
	//   23   40:getstatic       #84  <Field Pattern PROFILE_PATTERN>
	//   24   43:aload_1         
	//   25   44:iconst_1        
	//   26   45:aaload          
	//   27   46:invokevirtual   #446 <Method Matcher Pattern.matcher(CharSequence)>
	//   28   49:astore_3        
			if(!matcher.matches())
	//*  29   50:aload_3         
	//*  30   51:invokevirtual   #451 <Method boolean Matcher.matches()>
	//*  31   54:ifne            91
			{
				as = ((String []) (new StringBuilder()));
	//   32   57:new             #244 <Class StringBuilder>
	//   33   60:dup             
	//   34   61:invokespecial   #245 <Method void StringBuilder()>
	//   35   64:astore_1        
				((StringBuilder) (as)).append("Ignoring malformed HEVC codec string: ");
	//   36   65:aload_1         
	//   37   66:ldc2            #442 <String "Ignoring malformed HEVC codec string: ">
	//   38   69:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   39   72:pop             
				((StringBuilder) (as)).append(s);
	//   40   73:aload_1         
	//   41   74:aload_0         
	//   42   75:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
				Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//   44   79:ldc1            #58  <String "MediaCodecUtil">
	//   45   81:aload_1         
	//   46   82:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   47   85:invokestatic    #261 <Method int Log.w(String, String)>
	//   48   88:pop             
				return null;
	//   49   89:aconst_null     
	//   50   90:areturn         
			}
			s = matcher.group(1);
	//   51   91:aload_3         
	//   52   92:iconst_1        
	//   53   93:invokevirtual   #454 <Method String Matcher.group(int)>
	//   54   96:astore_0        
			byte byte0;
			if("1".equals(((Object) (s))))
	//*  55   97:ldc2            #456 <String "1">
	//*  56  100:aload_0         
	//*  57  101:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  58  104:ifeq            112
			{
				byte0 = 1;
	//   59  107:iconst_1        
	//   60  108:istore_2        
			} else
	//*  61  109:goto            124
			{
				if(!"2".equals(((Object) (s))))
					break label0;
	//   62  112:ldc2            #458 <String "2">
	//   63  115:aload_0         
	//   64  116:invokevirtual   #206 <Method boolean String.equals(Object)>
	//   65  119:ifeq            194
				byte0 = 2;
	//   66  122:iconst_2        
	//   67  123:istore_2        
			}
			s = ((String) ((Integer)HEVC_CODEC_STRING_TO_PROFILE_LEVEL.get(((Object) (as[3])))));
	//   68  124:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//   69  127:aload_1         
	//   70  128:iconst_3        
	//   71  129:aaload          
	//   72  130:invokeinterface #459 <Method Object Map.get(Object)>
	//   73  135:checkcast       #110 <Class Integer>
	//   74  138:astore_0        
			if(s == null)
	//*  75  139:aload_0         
	//*  76  140:ifnonnull       181
			{
				s = ((String) (new StringBuilder()));
	//   77  143:new             #244 <Class StringBuilder>
	//   78  146:dup             
	//   79  147:invokespecial   #245 <Method void StringBuilder()>
	//   80  150:astore_0        
				((StringBuilder) (s)).append("Unknown HEVC level string: ");
	//   81  151:aload_0         
	//   82  152:ldc2            #461 <String "Unknown HEVC level string: ">
	//   83  155:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   84  158:pop             
				((StringBuilder) (s)).append(matcher.group(1));
	//   85  159:aload_0         
	//   86  160:aload_3         
	//   87  161:iconst_1        
	//   88  162:invokevirtual   #454 <Method String Matcher.group(int)>
	//   89  165:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   90  168:pop             
				Log.w("MediaCodecUtil", ((StringBuilder) (s)).toString());
	//   91  169:ldc1            #58  <String "MediaCodecUtil">
	//   92  171:aload_0         
	//   93  172:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   94  175:invokestatic    #261 <Method int Log.w(String, String)>
	//   95  178:pop             
				return null;
	//   96  179:aconst_null     
	//   97  180:areturn         
			} else
			{
				return new Pair(((Object) (Integer.valueOf(((int) (byte0))))), ((Object) (s)));
	//   98  181:new             #293 <Class Pair>
	//   99  184:dup             
	//  100  185:iload_2         
	//  101  186:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  102  189:aload_0         
	//  103  190:invokespecial   #296 <Method void Pair(Object, Object)>
	//  104  193:areturn         
			}
		}
		as = ((String []) (new StringBuilder()));
	//  105  194:new             #244 <Class StringBuilder>
	//  106  197:dup             
	//  107  198:invokespecial   #245 <Method void StringBuilder()>
	//  108  201:astore_1        
		((StringBuilder) (as)).append("Unknown HEVC profile string: ");
	//  109  202:aload_1         
	//  110  203:ldc2            #463 <String "Unknown HEVC profile string: ">
	//  111  206:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//  112  209:pop             
		((StringBuilder) (as)).append(s);
	//  113  210:aload_1         
	//  114  211:aload_0         
	//  115  212:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//  116  215:pop             
		Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//  117  216:ldc1            #58  <String "MediaCodecUtil">
	//  118  218:aload_1         
	//  119  219:invokevirtual   #255 <Method String StringBuilder.toString()>
	//  120  222:invokestatic    #261 <Method int Log.w(String, String)>
	//  121  225:pop             
		return null;
	//  122  226:aconst_null     
	//  123  227:areturn         
	}

	public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo getPassthroughDecoderInfo()
	{
		return PASSTHROUGH_DECODER_INFO;
	//    0    0:getstatic       #74  <Field com.google.android.exoplayer2.mediacodec.MediaCodecInfo PASSTHROUGH_DECODER_INFO>
	//    1    3:areturn         
	}

	private static boolean isCodecUsableDecoder(MediaCodecInfo mediacodecinfo, String s, boolean flag, String s1)
	{
		if(!mediacodecinfo.isEncoder())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #468 <Method boolean MediaCodecInfo.isEncoder()>
	//*   2    4:ifne            687
		{
			if(!flag && s.endsWith(".secure"))
	//*   3    7:iload_2         
	//*   4    8:ifne            23
	//*   5   11:aload_1         
	//*   6   12:ldc2            #423 <String ".secure">
	//*   7   15:invokevirtual   #471 <Method boolean String.endsWith(String)>
	//*   8   18:ifeq            23
				return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
			if(Util.SDK_INT < 21 && ("CIPAACDecoder".equals(((Object) (s))) || "CIPMP3Decoder".equals(((Object) (s))) || "CIPVorbisDecoder".equals(((Object) (s))) || "CIPAMRNBDecoder".equals(((Object) (s))) || "AACDecoder".equals(((Object) (s))) || "MP3Decoder".equals(((Object) (s)))))
	//*  11   23:getstatic       #187 <Field int Util.SDK_INT>
	//*  12   26:bipush          21
	//*  13   28:icmpge          93
	//*  14   31:ldc2            #473 <String "CIPAACDecoder">
	//*  15   34:aload_1         
	//*  16   35:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  17   38:ifne            91
	//*  18   41:ldc2            #475 <String "CIPMP3Decoder">
	//*  19   44:aload_1         
	//*  20   45:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  21   48:ifne            91
	//*  22   51:ldc2            #477 <String "CIPVorbisDecoder">
	//*  23   54:aload_1         
	//*  24   55:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  25   58:ifne            91
	//*  26   61:ldc2            #479 <String "CIPAMRNBDecoder">
	//*  27   64:aload_1         
	//*  28   65:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  29   68:ifne            91
	//*  30   71:ldc2            #481 <String "AACDecoder">
	//*  31   74:aload_1         
	//*  32   75:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  33   78:ifne            91
	//*  34   81:ldc2            #483 <String "MP3Decoder">
	//*  35   84:aload_1         
	//*  36   85:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  37   88:ifeq            93
				return false;
	//   38   91:iconst_0        
	//   39   92:ireturn         
			if(Util.SDK_INT < 18 && "OMX.SEC.MP3.Decoder".equals(((Object) (s))))
	//*  40   93:getstatic       #187 <Field int Util.SDK_INT>
	//*  41   96:bipush          18
	//*  42   98:icmpge          113
	//*  43  101:ldc2            #485 <String "OMX.SEC.MP3.Decoder">
	//*  44  104:aload_1         
	//*  45  105:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  46  108:ifeq            113
				return false;
	//   47  111:iconst_0        
	//   48  112:ireturn         
			if(Util.SDK_INT < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(((Object) (s))) && ("a70".equals(((Object) (Util.DEVICE))) || "Xiaomi".equals(((Object) (Util.MANUFACTURER))) && Util.DEVICE.startsWith("HM")))
	//*  49  113:getstatic       #187 <Field int Util.SDK_INT>
	//*  50  116:bipush          18
	//*  51  118:icmpge          169
	//*  52  121:ldc2            #487 <String "OMX.MTK.AUDIO.DECODER.AAC">
	//*  53  124:aload_1         
	//*  54  125:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  55  128:ifeq            169
	//*  56  131:ldc2            #489 <String "a70">
	//*  57  134:getstatic       #492 <Field String Util.DEVICE>
	//*  58  137:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  59  140:ifne            167
	//*  60  143:ldc2            #494 <String "Xiaomi">
	//*  61  146:getstatic       #497 <Field String Util.MANUFACTURER>
	//*  62  149:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  63  152:ifeq            169
	//*  64  155:getstatic       #492 <Field String Util.DEVICE>
	//*  65  158:ldc2            #499 <String "HM">
	//*  66  161:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//*  67  164:ifeq            169
				return false;
	//   68  167:iconst_0        
	//   69  168:ireturn         
			if(Util.SDK_INT == 16 && "OMX.qcom.audio.decoder.mp3".equals(((Object) (s))) && ("dlxu".equals(((Object) (Util.DEVICE))) || "protou".equals(((Object) (Util.DEVICE))) || "ville".equals(((Object) (Util.DEVICE))) || "villeplus".equals(((Object) (Util.DEVICE))) || "villec2".equals(((Object) (Util.DEVICE))) || Util.DEVICE.startsWith("gee") || "C6602".equals(((Object) (Util.DEVICE))) || "C6603".equals(((Object) (Util.DEVICE))) || "C6606".equals(((Object) (Util.DEVICE))) || "C6616".equals(((Object) (Util.DEVICE))) || "L36h".equals(((Object) (Util.DEVICE))) || "SO-02E".equals(((Object) (Util.DEVICE)))))
	//*  70  169:getstatic       #187 <Field int Util.SDK_INT>
	//*  71  172:bipush          16
	//*  72  174:icmpne          333
	//*  73  177:ldc2            #504 <String "OMX.qcom.audio.decoder.mp3">
	//*  74  180:aload_1         
	//*  75  181:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  76  184:ifeq            333
	//*  77  187:ldc2            #506 <String "dlxu">
	//*  78  190:getstatic       #492 <Field String Util.DEVICE>
	//*  79  193:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  80  196:ifne            331
	//*  81  199:ldc2            #508 <String "protou">
	//*  82  202:getstatic       #492 <Field String Util.DEVICE>
	//*  83  205:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  84  208:ifne            331
	//*  85  211:ldc2            #510 <String "ville">
	//*  86  214:getstatic       #492 <Field String Util.DEVICE>
	//*  87  217:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  88  220:ifne            331
	//*  89  223:ldc2            #512 <String "villeplus">
	//*  90  226:getstatic       #492 <Field String Util.DEVICE>
	//*  91  229:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  92  232:ifne            331
	//*  93  235:ldc2            #514 <String "villec2">
	//*  94  238:getstatic       #492 <Field String Util.DEVICE>
	//*  95  241:invokevirtual   #206 <Method boolean String.equals(Object)>
	//*  96  244:ifne            331
	//*  97  247:getstatic       #492 <Field String Util.DEVICE>
	//*  98  250:ldc2            #516 <String "gee">
	//*  99  253:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 100  256:ifne            331
	//* 101  259:ldc2            #518 <String "C6602">
	//* 102  262:getstatic       #492 <Field String Util.DEVICE>
	//* 103  265:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 104  268:ifne            331
	//* 105  271:ldc2            #520 <String "C6603">
	//* 106  274:getstatic       #492 <Field String Util.DEVICE>
	//* 107  277:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 108  280:ifne            331
	//* 109  283:ldc2            #522 <String "C6606">
	//* 110  286:getstatic       #492 <Field String Util.DEVICE>
	//* 111  289:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 112  292:ifne            331
	//* 113  295:ldc2            #524 <String "C6616">
	//* 114  298:getstatic       #492 <Field String Util.DEVICE>
	//* 115  301:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 116  304:ifne            331
	//* 117  307:ldc2            #526 <String "L36h">
	//* 118  310:getstatic       #492 <Field String Util.DEVICE>
	//* 119  313:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 120  316:ifne            331
	//* 121  319:ldc2            #528 <String "SO-02E">
	//* 122  322:getstatic       #492 <Field String Util.DEVICE>
	//* 123  325:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 124  328:ifeq            333
				return false;
	//  125  331:iconst_0        
	//  126  332:ireturn         
			if(Util.SDK_INT == 16 && "OMX.qcom.audio.decoder.aac".equals(((Object) (s))) && ("C1504".equals(((Object) (Util.DEVICE))) || "C1505".equals(((Object) (Util.DEVICE))) || "C1604".equals(((Object) (Util.DEVICE))) || "C1605".equals(((Object) (Util.DEVICE)))))
	//* 127  333:getstatic       #187 <Field int Util.SDK_INT>
	//* 128  336:bipush          16
	//* 129  338:icmpne          401
	//* 130  341:ldc2            #530 <String "OMX.qcom.audio.decoder.aac">
	//* 131  344:aload_1         
	//* 132  345:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 133  348:ifeq            401
	//* 134  351:ldc2            #532 <String "C1504">
	//* 135  354:getstatic       #492 <Field String Util.DEVICE>
	//* 136  357:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 137  360:ifne            399
	//* 138  363:ldc2            #534 <String "C1505">
	//* 139  366:getstatic       #492 <Field String Util.DEVICE>
	//* 140  369:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 141  372:ifne            399
	//* 142  375:ldc2            #536 <String "C1604">
	//* 143  378:getstatic       #492 <Field String Util.DEVICE>
	//* 144  381:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 145  384:ifne            399
	//* 146  387:ldc2            #538 <String "C1605">
	//* 147  390:getstatic       #492 <Field String Util.DEVICE>
	//* 148  393:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 149  396:ifeq            401
				return false;
	//  150  399:iconst_0        
	//  151  400:ireturn         
			if(Util.SDK_INT < 24 && ("OMX.SEC.aac.dec".equals(((Object) (s))) || "OMX.Exynos.AAC.Decoder".equals(((Object) (s)))) && "samsung".equals(((Object) (Util.MANUFACTURER))) && (Util.DEVICE.startsWith("zeroflte") || Util.DEVICE.startsWith("zerolte") || Util.DEVICE.startsWith("zenlte") || "SC-05G".equals(((Object) (Util.DEVICE))) || "marinelteatt".equals(((Object) (Util.DEVICE))) || "404SC".equals(((Object) (Util.DEVICE))) || "SC-04G".equals(((Object) (Util.DEVICE))) || "SCV31".equals(((Object) (Util.DEVICE)))))
	//* 152  401:getstatic       #187 <Field int Util.SDK_INT>
	//* 153  404:bipush          24
	//* 154  406:icmpge          539
	//* 155  409:ldc2            #540 <String "OMX.SEC.aac.dec">
	//* 156  412:aload_1         
	//* 157  413:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 158  416:ifne            429
	//* 159  419:ldc2            #542 <String "OMX.Exynos.AAC.Decoder">
	//* 160  422:aload_1         
	//* 161  423:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 162  426:ifeq            539
	//* 163  429:ldc2            #544 <String "samsung">
	//* 164  432:getstatic       #497 <Field String Util.MANUFACTURER>
	//* 165  435:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 166  438:ifeq            539
	//* 167  441:getstatic       #492 <Field String Util.DEVICE>
	//* 168  444:ldc2            #546 <String "zeroflte">
	//* 169  447:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 170  450:ifne            537
	//* 171  453:getstatic       #492 <Field String Util.DEVICE>
	//* 172  456:ldc2            #548 <String "zerolte">
	//* 173  459:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 174  462:ifne            537
	//* 175  465:getstatic       #492 <Field String Util.DEVICE>
	//* 176  468:ldc2            #550 <String "zenlte">
	//* 177  471:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 178  474:ifne            537
	//* 179  477:ldc2            #552 <String "SC-05G">
	//* 180  480:getstatic       #492 <Field String Util.DEVICE>
	//* 181  483:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 182  486:ifne            537
	//* 183  489:ldc2            #554 <String "marinelteatt">
	//* 184  492:getstatic       #492 <Field String Util.DEVICE>
	//* 185  495:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 186  498:ifne            537
	//* 187  501:ldc2            #556 <String "404SC">
	//* 188  504:getstatic       #492 <Field String Util.DEVICE>
	//* 189  507:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 190  510:ifne            537
	//* 191  513:ldc2            #558 <String "SC-04G">
	//* 192  516:getstatic       #492 <Field String Util.DEVICE>
	//* 193  519:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 194  522:ifne            537
	//* 195  525:ldc2            #560 <String "SCV31">
	//* 196  528:getstatic       #492 <Field String Util.DEVICE>
	//* 197  531:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 198  534:ifeq            539
				return false;
	//  199  537:iconst_0        
	//  200  538:ireturn         
			if(Util.SDK_INT <= 19 && "OMX.SEC.vp8.dec".equals(((Object) (s))) && "samsung".equals(((Object) (Util.MANUFACTURER))) && (Util.DEVICE.startsWith("d2") || Util.DEVICE.startsWith("serrano") || Util.DEVICE.startsWith("jflte") || Util.DEVICE.startsWith("santos") || Util.DEVICE.startsWith("t0")))
	//* 201  539:getstatic       #187 <Field int Util.SDK_INT>
	//* 202  542:bipush          19
	//* 203  544:icmpgt          631
	//* 204  547:ldc2            #562 <String "OMX.SEC.vp8.dec">
	//* 205  550:aload_1         
	//* 206  551:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 207  554:ifeq            631
	//* 208  557:ldc2            #544 <String "samsung">
	//* 209  560:getstatic       #497 <Field String Util.MANUFACTURER>
	//* 210  563:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 211  566:ifeq            631
	//* 212  569:getstatic       #492 <Field String Util.DEVICE>
	//* 213  572:ldc2            #564 <String "d2">
	//* 214  575:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 215  578:ifne            629
	//* 216  581:getstatic       #492 <Field String Util.DEVICE>
	//* 217  584:ldc2            #566 <String "serrano">
	//* 218  587:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 219  590:ifne            629
	//* 220  593:getstatic       #492 <Field String Util.DEVICE>
	//* 221  596:ldc2            #568 <String "jflte">
	//* 222  599:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 223  602:ifne            629
	//* 224  605:getstatic       #492 <Field String Util.DEVICE>
	//* 225  608:ldc2            #570 <String "santos">
	//* 226  611:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 227  614:ifne            629
	//* 228  617:getstatic       #492 <Field String Util.DEVICE>
	//* 229  620:ldc2            #572 <String "t0">
	//* 230  623:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 231  626:ifeq            631
				return false;
	//  232  629:iconst_0        
	//  233  630:ireturn         
			if(Util.SDK_INT <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(((Object) (s))))
	//* 234  631:getstatic       #187 <Field int Util.SDK_INT>
	//* 235  634:bipush          19
	//* 236  636:icmpgt          663
	//* 237  639:getstatic       #492 <Field String Util.DEVICE>
	//* 238  642:ldc2            #568 <String "jflte">
	//* 239  645:invokevirtual   #502 <Method boolean String.startsWith(String)>
	//* 240  648:ifeq            663
	//* 241  651:ldc2            #574 <String "OMX.qcom.video.decoder.vp8">
	//* 242  654:aload_1         
	//* 243  655:invokevirtual   #206 <Method boolean String.equals(Object)>
	//* 244  658:ifeq            663
				return false;
	//  245  661:iconst_0        
	//  246  662:ireturn         
			return !"audio/eac3-joc".equals(((Object) (s1))) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(((Object) (s)));
	//  247  663:ldc2            #353 <String "audio/eac3-joc">
	//  248  666:aload_3         
	//  249  667:invokevirtual   #206 <Method boolean String.equals(Object)>
	//  250  670:ifeq            685
	//  251  673:ldc2            #576 <String "OMX.MTK.AUDIO.DECODER.DSPAC3">
	//  252  676:aload_1         
	//  253  677:invokevirtual   #206 <Method boolean String.equals(Object)>
	//  254  680:ifeq            685
	//  255  683:iconst_0        
	//  256  684:ireturn         
	//  257  685:iconst_1        
	//  258  686:ireturn         
		} else
		{
			return false;
	//  259  687:iconst_0        
	//  260  688:ireturn         
		}
	}

	public static int maxH264DecodableFrameSize()
		throws DecoderQueryException
	{
		if(maxH264DecodableFrameSize == -1)
	//*   0    0:getstatic       #578 <Field int maxH264DecodableFrameSize>
	//*   1    3:iconst_m1       
	//*   2    4:icmpne          88
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_0        
			int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
			com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediacodecinfo = getDecoderInfo("video/avc", false);
	//    7   11:ldc2            #580 <String "video/avc">
	//    8   14:iconst_0        
	//    9   15:invokestatic    #582 <Method com.google.android.exoplayer2.mediacodec.MediaCodecInfo getDecoderInfo(String, boolean)>
	//   10   18:astore_3        
			if(mediacodecinfo != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          84
			{
				android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = mediacodecinfo.getProfileLevels();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #586 <Method android.media.MediaCodecInfo$CodecProfileLevel[] MediaCodecInfo.getProfileLevels()>
	//   15   27:astore_3        
				int k = acodecprofilelevel.length;
	//   16   28:aload_3         
	//   17   29:arraylength     
	//   18   30:istore_2        
				i = 0;
	//   19   31:iconst_0        
	//   20   32:istore_0        
				for(; j < k; j++)
	//*  21   33:iload_1         
	//*  22   34:iload_2         
	//*  23   35:icmpge          59
					i = Math.max(avcLevelToMaxFrameSize(acodecprofilelevel[j].level), i);
	//   24   38:aload_3         
	//   25   39:iload_1         
	//   26   40:aaload          
	//   27   41:getfield        #591 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//   28   44:invokestatic    #593 <Method int avcLevelToMaxFrameSize(int)>
	//   29   47:iload_0         
	//   30   48:invokestatic    #598 <Method int Math.max(int, int)>
	//   31   51:istore_0        

	//   32   52:iload_1         
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:istore_1        
	//*  36   56:goto            33
				if(Util.SDK_INT >= 21)
	//*  37   59:getstatic       #187 <Field int Util.SDK_INT>
	//*  38   62:bipush          21
	//*  39   64:icmplt          74
					j = 0x54600;
	//   40   67:ldc2            #599 <Int 0x54600>
	//   41   70:istore_1        
				else
	//*  42   71:goto            78
					j = 0x2a300;
	//   43   74:ldc2            #600 <Int 0x2a300>
	//   44   77:istore_1        
				i = Math.max(i, j);
	//   45   78:iload_0         
	//   46   79:iload_1         
	//   47   80:invokestatic    #598 <Method int Math.max(int, int)>
	//   48   83:istore_0        
			}
			maxH264DecodableFrameSize = i;
	//   49   84:iload_0         
	//   50   85:putstatic       #578 <Field int maxH264DecodableFrameSize>
		}
		return maxH264DecodableFrameSize;
	//   51   88:getstatic       #578 <Field int maxH264DecodableFrameSize>
	//   52   91:ireturn         
	}

	public static void warmDecoderInfoCache(String s, boolean flag)
	{
		try
		{
			getDecoderInfos(s, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #321 <Method List getDecoderInfos(String, boolean)>
	//    3    5:pop             
			return;
	//    4    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			Log.e("MediaCodecUtil", "Codec warming failed", ((Throwable) (s)));
	//    6    8:ldc1            #58  <String "MediaCodecUtil">
	//    7   10:ldc2            #603 <String "Codec warming failed">
	//    8   13:aload_0         
	//    9   14:invokestatic    #606 <Method int Log.e(String, String, Throwable)>
	//   10   17:pop             
		}
	//   11   18:return          
	}

	private static final SparseIntArray AVC_LEVEL_NUMBER_TO_CONST;
	private static final SparseIntArray AVC_PROFILE_NUMBER_TO_CONST;
	private static final String CODEC_ID_AVC1 = "avc1";
	private static final String CODEC_ID_AVC2 = "avc2";
	private static final String CODEC_ID_HEV1 = "hev1";
	private static final String CODEC_ID_HVC1 = "hvc1";
	private static final String GOOGLE_RAW_DECODER_NAME = "OMX.google.raw.decoder";
	private static final Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL;
	private static final String MTK_RAW_DECODER_NAME = "OMX.MTK.AUDIO.DECODER.RAW";
	private static final com.google.android.exoplayer2.mediacodec.MediaCodecInfo PASSTHROUGH_DECODER_INFO = MediaCodecInfo.newPassthroughInstance("OMX.google.raw.decoder");
	private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
	private static final String TAG = "MediaCodecUtil";
	private static final HashMap decoderInfosCache = new HashMap();
	private static int maxH264DecodableFrameSize = -1;

	static 
	{
	//    0    0:ldc1            #45  <String "OMX.google.raw.decoder">
	//    1    2:invokestatic    #72  <Method com.google.android.exoplayer2.mediacodec.MediaCodecInfo MediaCodecInfo.newPassthroughInstance(String)>
	//    2    5:putstatic       #74  <Field com.google.android.exoplayer2.mediacodec.MediaCodecInfo PASSTHROUGH_DECODER_INFO>
	//    3    8:ldc1            #76  <String "^\\D?(\\d+)$">
	//    4   10:invokestatic    #82  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #84  <Field Pattern PROFILE_PATTERN>
	//    6   16:new             #86  <Class HashMap>
	//    7   19:dup             
	//    8   20:invokespecial   #89  <Method void HashMap()>
	//    9   23:putstatic       #91  <Field HashMap decoderInfosCache>
		AVC_PROFILE_NUMBER_TO_CONST = new SparseIntArray();
	//   10   26:new             #93  <Class SparseIntArray>
	//   11   29:dup             
	//   12   30:invokespecial   #94  <Method void SparseIntArray()>
	//   13   33:putstatic       #96  <Field SparseIntArray AVC_PROFILE_NUMBER_TO_CONST>
		AVC_PROFILE_NUMBER_TO_CONST.put(66, 1);
	//   14   36:getstatic       #96  <Field SparseIntArray AVC_PROFILE_NUMBER_TO_CONST>
	//   15   39:bipush          66
	//   16   41:iconst_1        
	//   17   42:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_PROFILE_NUMBER_TO_CONST.put(77, 2);
	//   18   45:getstatic       #96  <Field SparseIntArray AVC_PROFILE_NUMBER_TO_CONST>
	//   19   48:bipush          77
	//   20   50:iconst_2        
	//   21   51:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_PROFILE_NUMBER_TO_CONST.put(88, 4);
	//   22   54:getstatic       #96  <Field SparseIntArray AVC_PROFILE_NUMBER_TO_CONST>
	//   23   57:bipush          88
	//   24   59:iconst_4        
	//   25   60:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_PROFILE_NUMBER_TO_CONST.put(100, 8);
	//   26   63:getstatic       #96  <Field SparseIntArray AVC_PROFILE_NUMBER_TO_CONST>
	//   27   66:bipush          100
	//   28   68:bipush          8
	//   29   70:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST = new SparseIntArray();
	//   30   73:new             #93  <Class SparseIntArray>
	//   31   76:dup             
	//   32   77:invokespecial   #94  <Method void SparseIntArray()>
	//   33   80:putstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
		AVC_LEVEL_NUMBER_TO_CONST.put(10, 1);
	//   34   83:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   35   86:bipush          10
	//   36   88:iconst_1        
	//   37   89:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(11, 4);
	//   38   92:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   39   95:bipush          11
	//   40   97:iconst_4        
	//   41   98:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(12, 8);
	//   42  101:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   43  104:bipush          12
	//   44  106:bipush          8
	//   45  108:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(13, 16);
	//   46  111:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   47  114:bipush          13
	//   48  116:bipush          16
	//   49  118:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(20, 32);
	//   50  121:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   51  124:bipush          20
	//   52  126:bipush          32
	//   53  128:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(21, 64);
	//   54  131:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   55  134:bipush          21
	//   56  136:bipush          64
	//   57  138:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(22, 128);
	//   58  141:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   59  144:bipush          22
	//   60  146:sipush          128
	//   61  149:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(30, 256);
	//   62  152:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   63  155:bipush          30
	//   64  157:sipush          256
	//   65  160:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(31, 512);
	//   66  163:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   67  166:bipush          31
	//   68  168:sipush          512
	//   69  171:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(32, 1024);
	//   70  174:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   71  177:bipush          32
	//   72  179:sipush          1024
	//   73  182:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(40, 2048);
	//   74  185:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   75  188:bipush          40
	//   76  190:sipush          2048
	//   77  193:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(41, 4096);
	//   78  196:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   79  199:bipush          41
	//   80  201:sipush          4096
	//   81  204:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(42, 8192);
	//   82  207:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   83  210:bipush          42
	//   84  212:sipush          8192
	//   85  215:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(50, 16384);
	//   86  218:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   87  221:bipush          50
	//   88  223:sipush          16384
	//   89  226:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(51, 32768);
	//   90  229:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   91  232:bipush          51
	//   92  234:ldc1            #103 <Int 32768>
	//   93  236:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		AVC_LEVEL_NUMBER_TO_CONST.put(52, 0x10000);
	//   94  239:getstatic       #102 <Field SparseIntArray AVC_LEVEL_NUMBER_TO_CONST>
	//   95  242:bipush          52
	//   96  244:ldc1            #104 <Int 0x10000>
	//   97  246:invokevirtual   #100 <Method void SparseIntArray.put(int, int)>
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL = ((Map) (new HashMap()));
	//   98  249:new             #86  <Class HashMap>
	//   99  252:dup             
	//  100  253:invokespecial   #89  <Method void HashMap()>
	//  101  256:putstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L30", ((Object) (Integer.valueOf(1))));
	//  102  259:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  103  262:ldc1            #108 <String "L30">
	//  104  264:iconst_1        
	//  105  265:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  106  268:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  107  273:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L60", ((Object) (Integer.valueOf(4))));
	//  108  274:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  109  277:ldc1            #121 <String "L60">
	//  110  279:iconst_4        
	//  111  280:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  112  283:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  113  288:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L63", ((Object) (Integer.valueOf(16))));
	//  114  289:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  115  292:ldc1            #123 <String "L63">
	//  116  294:bipush          16
	//  117  296:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  118  299:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  119  304:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L90", ((Object) (Integer.valueOf(64))));
	//  120  305:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  121  308:ldc1            #125 <String "L90">
	//  122  310:bipush          64
	//  123  312:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  124  315:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  125  320:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L93", ((Object) (Integer.valueOf(256))));
	//  126  321:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  127  324:ldc1            #127 <String "L93">
	//  128  326:sipush          256
	//  129  329:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  130  332:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  131  337:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L120", ((Object) (Integer.valueOf(1024))));
	//  132  338:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  133  341:ldc1            #129 <String "L120">
	//  134  343:sipush          1024
	//  135  346:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  136  349:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  137  354:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L123", ((Object) (Integer.valueOf(4096))));
	//  138  355:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  139  358:ldc1            #131 <String "L123">
	//  140  360:sipush          4096
	//  141  363:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  142  366:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  143  371:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L150", ((Object) (Integer.valueOf(16384))));
	//  144  372:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  145  375:ldc1            #133 <String "L150">
	//  146  377:sipush          16384
	//  147  380:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  148  383:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  149  388:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L153", ((Object) (Integer.valueOf(0x10000))));
	//  150  389:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  151  392:ldc1            #135 <String "L153">
	//  152  394:ldc1            #104 <Int 0x10000>
	//  153  396:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  154  399:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  155  404:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L156", ((Object) (Integer.valueOf(0x40000))));
	//  156  405:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  157  408:ldc1            #137 <String "L156">
	//  158  410:ldc1            #138 <Int 0x40000>
	//  159  412:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  160  415:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  161  420:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L180", ((Object) (Integer.valueOf(0x100000))));
	//  162  421:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  163  424:ldc1            #140 <String "L180">
	//  164  426:ldc1            #141 <Int 0x100000>
	//  165  428:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  166  431:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  167  436:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L183", ((Object) (Integer.valueOf(0x400000))));
	//  168  437:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  169  440:ldc1            #143 <String "L183">
	//  170  442:ldc1            #144 <Int 0x400000>
	//  171  444:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  172  447:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  173  452:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("L186", ((Object) (Integer.valueOf(0x1000000))));
	//  174  453:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  175  456:ldc1            #146 <String "L186">
	//  176  458:ldc1            #147 <Int 0x1000000>
	//  177  460:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  178  463:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  179  468:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H30", ((Object) (Integer.valueOf(2))));
	//  180  469:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  181  472:ldc1            #149 <String "H30">
	//  182  474:iconst_2        
	//  183  475:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  184  478:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  185  483:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H60", ((Object) (Integer.valueOf(8))));
	//  186  484:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  187  487:ldc1            #151 <String "H60">
	//  188  489:bipush          8
	//  189  491:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  190  494:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  191  499:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H63", ((Object) (Integer.valueOf(32))));
	//  192  500:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  193  503:ldc1            #153 <String "H63">
	//  194  505:bipush          32
	//  195  507:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  196  510:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  197  515:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H90", ((Object) (Integer.valueOf(128))));
	//  198  516:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  199  519:ldc1            #155 <String "H90">
	//  200  521:sipush          128
	//  201  524:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  202  527:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  203  532:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H93", ((Object) (Integer.valueOf(512))));
	//  204  533:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  205  536:ldc1            #157 <String "H93">
	//  206  538:sipush          512
	//  207  541:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  208  544:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  209  549:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H120", ((Object) (Integer.valueOf(2048))));
	//  210  550:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  211  553:ldc1            #159 <String "H120">
	//  212  555:sipush          2048
	//  213  558:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  214  561:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  215  566:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H123", ((Object) (Integer.valueOf(8192))));
	//  216  567:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  217  570:ldc1            #161 <String "H123">
	//  218  572:sipush          8192
	//  219  575:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  220  578:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  221  583:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H150", ((Object) (Integer.valueOf(32768))));
	//  222  584:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  223  587:ldc1            #163 <String "H150">
	//  224  589:ldc1            #103 <Int 32768>
	//  225  591:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  226  594:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  227  599:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H153", ((Object) (Integer.valueOf(0x20000))));
	//  228  600:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  229  603:ldc1            #165 <String "H153">
	//  230  605:ldc1            #166 <Int 0x20000>
	//  231  607:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  232  610:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  233  615:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H156", ((Object) (Integer.valueOf(0x80000))));
	//  234  616:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  235  619:ldc1            #168 <String "H156">
	//  236  621:ldc1            #169 <Int 0x80000>
	//  237  623:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  238  626:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  239  631:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H180", ((Object) (Integer.valueOf(0x200000))));
	//  240  632:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  241  635:ldc1            #171 <String "H180">
	//  242  637:ldc1            #172 <Int 0x200000>
	//  243  639:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  244  642:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  245  647:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H183", ((Object) (Integer.valueOf(0x800000))));
	//  246  648:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  247  651:ldc1            #174 <String "H183">
	//  248  653:ldc1            #175 <Int 0x800000>
	//  249  655:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  250  658:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  251  663:pop             
		HEVC_CODEC_STRING_TO_PROFILE_LEVEL.put("H186", ((Object) (Integer.valueOf(0x2000000))));
	//  252  664:getstatic       #106 <Field Map HEVC_CODEC_STRING_TO_PROFILE_LEVEL>
	//  253  667:ldc1            #177 <String "H186">
	//  254  669:ldc1            #178 <Int 0x2000000>
	//  255  671:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//  256  674:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  257  679:pop             
	//* 258  680:return          
	}
}
