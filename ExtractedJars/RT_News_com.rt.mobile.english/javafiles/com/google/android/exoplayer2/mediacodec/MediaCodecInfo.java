// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.*;

// Referenced classes of package com.google.android.exoplayer2.mediacodec:
//			MediaCodecUtil

public final class MediaCodecInfo
{

	private MediaCodecInfo(String s, String s1, android.media.CodecCapabilities codeccapabilities, boolean flag, boolean flag1, boolean flag2)
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
			name = (String)Assertions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #37  <Class String>
	//    6   12:putfield        #39  <Field String name>
			mimeType = s1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #41  <Field String mimeType>
			capabilities = codeccapabilities;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
			passthrough = flag;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #45  <Field boolean passthrough>
			boolean flag3 = false;
	//   16   31:iconst_0        
	//   17   32:istore          7
			if(!flag1 && codeccapabilities != null && isAdaptive(codeccapabilities))
	//*  18   34:iload           5
	//*  19   36:ifne            56
	//*  20   39:aload_3         
	//*  21   40:ifnull          56
	//*  22   43:aload_3         
	//*  23   44:invokestatic    #49  <Method boolean isAdaptive(android.media.MediaCodecInfo$CodecCapabilities)>
	//*  24   47:ifeq            56
				flag = true;
	//   25   50:iconst_1        
	//   26   51:istore          4
			else
	//*  27   53:goto            59
				flag = false;
	//   28   56:iconst_0        
	//   29   57:istore          4
			adaptive = flag;
	//   30   59:aload_0         
	//   31   60:iload           4
	//   32   62:putfield        #51  <Field boolean adaptive>
			if(codeccapabilities != null && isTunneling(codeccapabilities))
	//*  33   65:aload_3         
	//*  34   66:ifnull          82
	//*  35   69:aload_3         
	//*  36   70:invokestatic    #54  <Method boolean isTunneling(android.media.MediaCodecInfo$CodecCapabilities)>
	//*  37   73:ifeq            82
				flag = true;
	//   38   76:iconst_1        
	//   39   77:istore          4
			else
	//*  40   79:goto            85
				flag = false;
	//   41   82:iconst_0        
	//   42   83:istore          4
			tunneling = flag;
	//   43   85:aload_0         
	//   44   86:iload           4
	//   45   88:putfield        #56  <Field boolean tunneling>
			if(!flag2)
	//*  46   91:iload           6
	//*  47   93:ifne            115
			{
				flag = flag3;
	//   48   96:iload           7
	//   49   98:istore          4
				if(codeccapabilities == null)
					break label0;
	//   50  100:aload_3         
	//   51  101:ifnull          118
				flag = flag3;
	//   52  104:iload           7
	//   53  106:istore          4
				if(!isSecure(codeccapabilities))
					break label0;
	//   54  108:aload_3         
	//   55  109:invokestatic    #59  <Method boolean isSecure(android.media.MediaCodecInfo$CodecCapabilities)>
	//   56  112:ifeq            118
			}
			flag = true;
	//   57  115:iconst_1        
	//   58  116:istore          4
		}
		secure = flag;
	//   59  118:aload_0         
	//   60  119:iload           4
	//   61  121:putfield        #61  <Field boolean secure>
	//   62  124:return          
	}

	private static int adjustMaxInputChannelCount(String s, String s1, int i)
	{
		if(i <= 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          221
		{
			if(Util.SDK_INT >= 26 && i > 0)
	//*   3    5:getstatic       #70  <Field int Util.SDK_INT>
	//*   4    8:bipush          26
	//*   5   10:icmplt          19
	//*   6   13:iload_2         
	//*   7   14:ifle            19
				return i;
	//    8   17:iload_2         
	//    9   18:ireturn         
			if(!"audio/mpeg".equals(((Object) (s1))) && !"audio/3gpp".equals(((Object) (s1))) && !"audio/amr-wb".equals(((Object) (s1))) && !"audio/mp4a-latm".equals(((Object) (s1))) && !"audio/vorbis".equals(((Object) (s1))) && !"audio/opus".equals(((Object) (s1))) && !"audio/raw".equals(((Object) (s1))) && !"audio/flac".equals(((Object) (s1))) && !"audio/g711-alaw".equals(((Object) (s1))) && !"audio/g711-mlaw".equals(((Object) (s1))))
	//*  10   19:ldc1            #72  <String "audio/mpeg">
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  13   25:ifne            219
	//*  14   28:ldc1            #78  <String "audio/3gpp">
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  17   34:ifne            219
	//*  18   37:ldc1            #80  <String "audio/amr-wb">
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  21   43:ifne            219
	//*  22   46:ldc1            #82  <String "audio/mp4a-latm">
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  25   52:ifne            219
	//*  26   55:ldc1            #84  <String "audio/vorbis">
	//*  27   57:aload_1         
	//*  28   58:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  29   61:ifne            219
	//*  30   64:ldc1            #86  <String "audio/opus">
	//*  31   66:aload_1         
	//*  32   67:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  33   70:ifne            219
	//*  34   73:ldc1            #88  <String "audio/raw">
	//*  35   75:aload_1         
	//*  36   76:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  37   79:ifne            219
	//*  38   82:ldc1            #90  <String "audio/flac">
	//*  39   84:aload_1         
	//*  40   85:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  41   88:ifne            219
	//*  42   91:ldc1            #92  <String "audio/g711-alaw">
	//*  43   93:aload_1         
	//*  44   94:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  45   97:ifne            219
	//*  46  100:ldc1            #94  <String "audio/g711-mlaw">
	//*  47  102:aload_1         
	//*  48  103:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  49  106:ifne            219
			{
				if("audio/gsm".equals(((Object) (s1))))
	//*  50  109:ldc1            #96  <String "audio/gsm">
	//*  51  111:aload_1         
	//*  52  112:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  53  115:ifeq            120
					return i;
	//   54  118:iload_2         
	//   55  119:ireturn         
				byte byte0;
				if("audio/ac3".equals(((Object) (s1))))
	//*  56  120:ldc1            #98  <String "audio/ac3">
	//*  57  122:aload_1         
	//*  58  123:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  59  126:ifeq            135
					byte0 = 6;
	//   60  129:bipush          6
	//   61  131:istore_3        
				else
	//*  62  132:goto            153
				if("audio/eac3".equals(((Object) (s1))))
	//*  63  135:ldc1            #100 <String "audio/eac3">
	//*  64  137:aload_1         
	//*  65  138:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  66  141:ifeq            150
					byte0 = 16;
	//   67  144:bipush          16
	//   68  146:istore_3        
				else
	//*  69  147:goto            153
					byte0 = 30;
	//   70  150:bipush          30
	//   71  152:istore_3        
				s1 = ((String) (new StringBuilder()));
	//   72  153:new             #102 <Class StringBuilder>
	//   73  156:dup             
	//   74  157:invokespecial   #103 <Method void StringBuilder()>
	//   75  160:astore_1        
				((StringBuilder) (s1)).append("AssumedMaxChannelAdjustment: ");
	//   76  161:aload_1         
	//   77  162:ldc1            #105 <String "AssumedMaxChannelAdjustment: ">
	//   78  164:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   79  167:pop             
				((StringBuilder) (s1)).append(s);
	//   80  168:aload_1         
	//   81  169:aload_0         
	//   82  170:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   83  173:pop             
				((StringBuilder) (s1)).append(", [");
	//   84  174:aload_1         
	//   85  175:ldc1            #111 <String ", [">
	//   86  177:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   87  180:pop             
				((StringBuilder) (s1)).append(i);
	//   88  181:aload_1         
	//   89  182:iload_2         
	//   90  183:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   91  186:pop             
				((StringBuilder) (s1)).append(" to ");
	//   92  187:aload_1         
	//   93  188:ldc1            #116 <String " to ">
	//   94  190:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   95  193:pop             
				((StringBuilder) (s1)).append(((int) (byte0)));
	//   96  194:aload_1         
	//   97  195:iload_3         
	//   98  196:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   99  199:pop             
				((StringBuilder) (s1)).append("]");
	//  100  200:aload_1         
	//  101  201:ldc1            #118 <String "]">
	//  102  203:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  103  206:pop             
				Log.w("MediaCodecInfo", ((StringBuilder) (s1)).toString());
	//  104  207:ldc1            #14  <String "MediaCodecInfo">
	//  105  209:aload_1         
	//  106  210:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  107  213:invokestatic    #128 <Method int Log.w(String, String)>
	//  108  216:pop             
				return ((int) (byte0));
	//  109  217:iload_3         
	//  110  218:ireturn         
			} else
			{
				return i;
	//  111  219:iload_2         
	//  112  220:ireturn         
			}
		} else
		{
			return i;
	//  113  221:iload_2         
	//  114  222:ireturn         
		}
	}

	private static boolean areSizeAndRateSupportedV21(android.media.VideoCapabilities videocapabilities, int i, int j, double d)
	{
		if(d != -1D && d > 0.0D)
	//*   0    0:dload_3         
	//*   1    1:ldc2w           #132 <Double -1D>
	//*   2    4:dcmpl           
	//*   3    5:ifeq            25
	//*   4    8:dload_3         
	//*   5    9:dconst_0        
	//*   6   10:dcmpg           
	//*   7   11:ifgt            17
	//*   8   14:goto            25
			return videocapabilities.areSizeAndRateSupported(i, j, d);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:dload_3         
	//   13   21:invokevirtual   #139 <Method boolean android.media.MediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(int, int, double)>
	//   14   24:ireturn         
		else
			return videocapabilities.isSizeSupported(i, j);
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #143 <Method boolean android.media.MediaCodecInfo$VideoCapabilities.isSizeSupported(int, int)>
	//   19   31:ireturn         
	}

	private static int getMaxSupportedInstancesV23(android.media.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.getMaxSupportedInstances();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method int android.media.MediaCodecInfo$CodecCapabilities.getMaxSupportedInstances()>
	//    2    4:ireturn         
	}

	private static boolean isAdaptive(android.media.CodecCapabilities codeccapabilities)
	{
		return Util.SDK_INT >= 19 && isAdaptiveV19(codeccapabilities);
	//    0    0:getstatic       #70  <Field int Util.SDK_INT>
	//    1    3:bipush          19
	//    2    5:icmplt          17
	//    3    8:aload_0         
	//    4    9:invokestatic    #156 <Method boolean isAdaptiveV19(android.media.MediaCodecInfo$CodecCapabilities)>
	//    5   12:ifeq            17
	//    6   15:iconst_1        
	//    7   16:ireturn         
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	private static boolean isAdaptiveV19(android.media.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.isFeatureSupported("adaptive-playback");
	//    0    0:aload_0         
	//    1    1:ldc1            #159 <String "adaptive-playback">
	//    2    3:invokevirtual   #163 <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//    3    6:ireturn         
	}

	private static boolean isSecure(android.media.CodecCapabilities codeccapabilities)
	{
		return Util.SDK_INT >= 21 && isSecureV21(codeccapabilities);
	//    0    0:getstatic       #70  <Field int Util.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          17
	//    3    8:aload_0         
	//    4    9:invokestatic    #166 <Method boolean isSecureV21(android.media.MediaCodecInfo$CodecCapabilities)>
	//    5   12:ifeq            17
	//    6   15:iconst_1        
	//    7   16:ireturn         
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	private static boolean isSecureV21(android.media.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.isFeatureSupported("secure-playback");
	//    0    0:aload_0         
	//    1    1:ldc1            #168 <String "secure-playback">
	//    2    3:invokevirtual   #163 <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//    3    6:ireturn         
	}

	private static boolean isTunneling(android.media.CodecCapabilities codeccapabilities)
	{
		return Util.SDK_INT >= 21 && isTunnelingV21(codeccapabilities);
	//    0    0:getstatic       #70  <Field int Util.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          17
	//    3    8:aload_0         
	//    4    9:invokestatic    #171 <Method boolean isTunnelingV21(android.media.MediaCodecInfo$CodecCapabilities)>
	//    5   12:ifeq            17
	//    6   15:iconst_1        
	//    7   16:ireturn         
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	private static boolean isTunnelingV21(android.media.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.isFeatureSupported("tunneled-playback");
	//    0    0:aload_0         
	//    1    1:ldc1            #173 <String "tunneled-playback">
	//    2    3:invokevirtual   #163 <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//    3    6:ireturn         
	}

	private void logAssumedSupport(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssumedSupport [");
	//    4    8:aload_2         
	//    5    9:ldc1            #177 <String "AssumedSupport [">
	//    6   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("] [");
	//   12   21:aload_2         
	//   13   22:ldc1            #179 <String "] [">
	//   14   24:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(name);
	//   16   28:aload_2         
	//   17   29:aload_0         
	//   18   30:getfield        #39  <Field String name>
	//   19   33:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		stringbuilder.append(", ");
	//   21   37:aload_2         
	//   22   38:ldc1            #181 <String ", ">
	//   23   40:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		stringbuilder.append(mimeType);
	//   25   44:aload_2         
	//   26   45:aload_0         
	//   27   46:getfield        #41  <Field String mimeType>
	//   28   49:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
		stringbuilder.append("] [");
	//   30   53:aload_2         
	//   31   54:ldc1            #179 <String "] [">
	//   32   56:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
		stringbuilder.append(Util.DEVICE_DEBUG_INFO);
	//   34   60:aload_2         
	//   35   61:getstatic       #184 <Field String Util.DEVICE_DEBUG_INFO>
	//   36   64:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
		stringbuilder.append("]");
	//   38   68:aload_2         
	//   39   69:ldc1            #118 <String "]">
	//   40   71:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
		Log.d("MediaCodecInfo", stringbuilder.toString());
	//   42   75:ldc1            #14  <String "MediaCodecInfo">
	//   43   77:aload_2         
	//   44   78:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   45   81:invokestatic    #187 <Method int Log.d(String, String)>
	//   46   84:pop             
	//   47   85:return          
	}

	private void logNoSupport(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("NoSupport [");
	//    4    8:aload_2         
	//    5    9:ldc1            #190 <String "NoSupport [">
	//    6   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("] [");
	//   12   21:aload_2         
	//   13   22:ldc1            #179 <String "] [">
	//   14   24:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(name);
	//   16   28:aload_2         
	//   17   29:aload_0         
	//   18   30:getfield        #39  <Field String name>
	//   19   33:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		stringbuilder.append(", ");
	//   21   37:aload_2         
	//   22   38:ldc1            #181 <String ", ">
	//   23   40:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		stringbuilder.append(mimeType);
	//   25   44:aload_2         
	//   26   45:aload_0         
	//   27   46:getfield        #41  <Field String mimeType>
	//   28   49:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
		stringbuilder.append("] [");
	//   30   53:aload_2         
	//   31   54:ldc1            #179 <String "] [">
	//   32   56:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
		stringbuilder.append(Util.DEVICE_DEBUG_INFO);
	//   34   60:aload_2         
	//   35   61:getstatic       #184 <Field String Util.DEVICE_DEBUG_INFO>
	//   36   64:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
		stringbuilder.append("]");
	//   38   68:aload_2         
	//   39   69:ldc1            #118 <String "]">
	//   40   71:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
		Log.d("MediaCodecInfo", stringbuilder.toString());
	//   42   75:ldc1            #14  <String "MediaCodecInfo">
	//   43   77:aload_2         
	//   44   78:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   45   81:invokestatic    #187 <Method int Log.d(String, String)>
	//   46   84:pop             
	//   47   85:return          
	}

	public static MediaCodecInfo newInstance(String s, String s1, android.media.CodecCapabilities codeccapabilities)
	{
		return new MediaCodecInfo(s, s1, codeccapabilities, false, false, false);
	//    0    0:new             #2   <Class MediaCodecInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokespecial   #194 <Method void MediaCodecInfo(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean)>
	//    9   13:areturn         
	}

	public static MediaCodecInfo newInstance(String s, String s1, android.media.CodecCapabilities codeccapabilities, boolean flag, boolean flag1)
	{
		return new MediaCodecInfo(s, s1, codeccapabilities, false, flag, flag1);
	//    0    0:new             #2   <Class MediaCodecInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokespecial   #194 <Method void MediaCodecInfo(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean)>
	//    9   14:areturn         
	}

	public static MediaCodecInfo newPassthroughInstance(String s)
	{
		return new MediaCodecInfo(s, ((String) (null)), ((android.media.CodecCapabilities) (null)), true, false, false);
	//    0    0:new             #2   <Class MediaCodecInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:iconst_1        
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokespecial   #194 <Method void MediaCodecInfo(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean)>
	//    9   13:areturn         
	}

	public Point alignVideoSizeV21(int i, int j)
	{
		if(capabilities == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   2    4:ifnonnull       15
		{
			logNoSupport("align.caps");
	//    3    7:aload_0         
	//    4    8:ldc1            #201 <String "align.caps">
	//    5   10:invokespecial   #203 <Method void logNoSupport(String)>
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		android.media.VideoCapabilities videocapabilities = capabilities.getVideoCapabilities();
	//    8   15:aload_0         
	//    9   16:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//   10   19:invokevirtual   #207 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//   11   22:astore          5
		if(videocapabilities == null)
	//*  12   24:aload           5
	//*  13   26:ifnonnull       37
		{
			logNoSupport("align.vCaps");
	//   14   29:aload_0         
	//   15   30:ldc1            #209 <String "align.vCaps">
	//   16   32:invokespecial   #203 <Method void logNoSupport(String)>
			return null;
	//   17   35:aconst_null     
	//   18   36:areturn         
		} else
		{
			int k = videocapabilities.getWidthAlignment();
	//   19   37:aload           5
	//   20   39:invokevirtual   #212 <Method int android.media.MediaCodecInfo$VideoCapabilities.getWidthAlignment()>
	//   21   42:istore_3        
			int l = videocapabilities.getHeightAlignment();
	//   22   43:aload           5
	//   23   45:invokevirtual   #215 <Method int android.media.MediaCodecInfo$VideoCapabilities.getHeightAlignment()>
	//   24   48:istore          4
			return new Point(Util.ceilDivide(i, k) * k, Util.ceilDivide(j, l) * l);
	//   25   50:new             #217 <Class Point>
	//   26   53:dup             
	//   27   54:iload_1         
	//   28   55:iload_3         
	//   29   56:invokestatic    #221 <Method int Util.ceilDivide(int, int)>
	//   30   59:iload_3         
	//   31   60:imul            
	//   32   61:iload_2         
	//   33   62:iload           4
	//   34   64:invokestatic    #221 <Method int Util.ceilDivide(int, int)>
	//   35   67:iload           4
	//   36   69:imul            
	//   37   70:invokespecial   #224 <Method void Point(int, int)>
	//   38   73:areturn         
		}
	}

	public int getMaxSupportedInstances()
	{
		if(Util.SDK_INT >= 23 && capabilities != null)
	//*   0    0:getstatic       #70  <Field int Util.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          26
	//*   3    8:aload_0         
	//*   4    9:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   5   12:ifnonnull       18
	//*   6   15:goto            26
			return getMaxSupportedInstancesV23(capabilities);
	//    7   18:aload_0         
	//    8   19:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//    9   22:invokestatic    #226 <Method int getMaxSupportedInstancesV23(android.media.MediaCodecInfo$CodecCapabilities)>
	//   10   25:ireturn         
		else
			return -1;
	//   11   26:iconst_m1       
	//   12   27:ireturn         
	}

	public android.media.CodecProfileLevel[] getProfileLevels()
	{
		if(capabilities != null && capabilities.profileLevels != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   5   11:getfield        #232 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//*   6   14:ifnonnull       20
	//*   7   17:goto            28
			return capabilities.profileLevels;
	//    8   20:aload_0         
	//    9   21:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//   10   24:getfield        #232 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//   11   27:areturn         
		else
			return new android.media.CodecProfileLevel[0];
	//   12   28:iconst_0        
	//   13   29:anewarray       android.media.CodecProfileLevel[]
	//   14   32:areturn         
	}

	public boolean isAudioChannelCountSupportedV21(int i)
	{
		if(capabilities == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   2    4:ifnonnull       15
		{
			logNoSupport("channelCount.caps");
	//    3    7:aload_0         
	//    4    8:ldc1            #238 <String "channelCount.caps">
	//    5   10:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		}
		android.media.AudioCapabilities audiocapabilities = capabilities.getAudioCapabilities();
	//    8   15:aload_0         
	//    9   16:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//   10   19:invokevirtual   #242 <Method android.media.MediaCodecInfo$AudioCapabilities android.media.MediaCodecInfo$CodecCapabilities.getAudioCapabilities()>
	//   11   22:astore_2        
		if(audiocapabilities == null)
	//*  12   23:aload_2         
	//*  13   24:ifnonnull       35
		{
			logNoSupport("channelCount.aCaps");
	//   14   27:aload_0         
	//   15   28:ldc1            #244 <String "channelCount.aCaps">
	//   16   30:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
		}
		if(adjustMaxInputChannelCount(name, mimeType, audiocapabilities.getMaxInputChannelCount()) < i)
	//*  19   35:aload_0         
	//*  20   36:getfield        #39  <Field String name>
	//*  21   39:aload_0         
	//*  22   40:getfield        #41  <Field String mimeType>
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #249 <Method int android.media.MediaCodecInfo$AudioCapabilities.getMaxInputChannelCount()>
	//*  25   47:invokestatic    #251 <Method int adjustMaxInputChannelCount(String, String, int)>
	//*  26   50:iload_1         
	//*  27   51:icmpge          85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   54:new             #102 <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #103 <Method void StringBuilder()>
	//   31   61:astore_2        
			stringbuilder.append("channelCount.support, ");
	//   32   62:aload_2         
	//   33   63:ldc1            #253 <String "channelCount.support, ">
	//   34   65:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			stringbuilder.append(i);
	//   36   69:aload_2         
	//   37   70:iload_1         
	//   38   71:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   39   74:pop             
			logNoSupport(stringbuilder.toString());
	//   40   75:aload_0         
	//   41   76:aload_2         
	//   42   77:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   43   80:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//   44   83:iconst_0        
	//   45   84:ireturn         
		} else
		{
			return true;
	//   46   85:iconst_1        
	//   47   86:ireturn         
		}
	}

	public boolean isAudioSampleRateSupportedV21(int i)
	{
		if(capabilities == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   2    4:ifnonnull       16
		{
			logNoSupport("sampleRate.caps");
	//    3    7:aload_0         
	//    4    8:ldc2            #256 <String "sampleRate.caps">
	//    5   11:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		}
		android.media.AudioCapabilities audiocapabilities = capabilities.getAudioCapabilities();
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//   10   20:invokevirtual   #242 <Method android.media.MediaCodecInfo$AudioCapabilities android.media.MediaCodecInfo$CodecCapabilities.getAudioCapabilities()>
	//   11   23:astore_2        
		if(audiocapabilities == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       37
		{
			logNoSupport("sampleRate.aCaps");
	//   14   28:aload_0         
	//   15   29:ldc2            #258 <String "sampleRate.aCaps">
	//   16   32:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
		}
		if(!audiocapabilities.isSampleRateSupported(i))
	//*  19   37:aload_2         
	//*  20   38:iload_1         
	//*  21   39:invokevirtual   #261 <Method boolean android.media.MediaCodecInfo$AudioCapabilities.isSampleRateSupported(int)>
	//*  22   42:ifne            77
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   45:new             #102 <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #103 <Method void StringBuilder()>
	//   26   52:astore_2        
			stringbuilder.append("sampleRate.support, ");
	//   27   53:aload_2         
	//   28   54:ldc2            #263 <String "sampleRate.support, ">
	//   29   57:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			stringbuilder.append(i);
	//   31   61:aload_2         
	//   32   62:iload_1         
	//   33   63:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   34   66:pop             
			logNoSupport(stringbuilder.toString());
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   38   72:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
		} else
		{
			return true;
	//   41   77:iconst_1        
	//   42   78:ireturn         
		}
	}

	public boolean isCodecSupported(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          225
		{
			if(mimeType == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #41  <Field String mimeType>
	//*   4    8:ifnonnull       13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
			String s1 = MimeTypes.getMediaMimeType(s);
	//    7   13:aload_1         
	//    8   14:invokestatic    #270 <Method String MimeTypes.getMediaMimeType(String)>
	//    9   17:astore          4
			if(s1 == null)
	//*  10   19:aload           4
	//*  11   21:ifnonnull       26
				return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
			if(!mimeType.equals(((Object) (s1))))
	//*  14   26:aload_0         
	//*  15   27:getfield        #41  <Field String mimeType>
	//*  16   30:aload           4
	//*  17   32:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  18   35:ifne            90
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   19   38:new             #102 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #103 <Method void StringBuilder()>
	//   22   45:astore          5
				stringbuilder.append("codec.mime ");
	//   23   47:aload           5
	//   24   49:ldc2            #272 <String "codec.mime ">
	//   25   52:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
				stringbuilder.append(s);
	//   27   56:aload           5
	//   28   58:aload_1         
	//   29   59:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
				stringbuilder.append(", ");
	//   31   63:aload           5
	//   32   65:ldc1            #181 <String ", ">
	//   33   67:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
				stringbuilder.append(s1);
	//   35   71:aload           5
	//   36   73:aload           4
	//   37   75:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
				logNoSupport(stringbuilder.toString());
	//   39   79:aload_0         
	//   40   80:aload           5
	//   41   82:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   42   85:invokespecial   #203 <Method void logNoSupport(String)>
				return false;
	//   43   88:iconst_0        
	//   44   89:ireturn         
			}
			Object obj = ((Object) (MediaCodecUtil.getCodecProfileAndLevel(s)));
	//   45   90:aload_1         
	//   46   91:invokestatic    #278 <Method Pair MediaCodecUtil.getCodecProfileAndLevel(String)>
	//   47   94:astore          5
			if(obj == null)
	//*  48   96:aload           5
	//*  49   98:ifnonnull       103
				return true;
	//   50  101:iconst_1        
	//   51  102:ireturn         
			android.media.CodecProfileLevel acodecprofilelevel[] = getProfileLevels();
	//   52  103:aload_0         
	//   53  104:invokevirtual   #280 <Method android.media.MediaCodecInfo$CodecProfileLevel[] getProfileLevels()>
	//   54  107:astore          6
			int j = acodecprofilelevel.length;
	//   55  109:aload           6
	//   56  111:arraylength     
	//   57  112:istore_3        
			for(int i = 0; i < j; i++)
	//*  58  113:iconst_0        
	//*  59  114:istore_2        
	//*  60  115:iload_2         
	//*  61  116:iload_3         
	//*  62  117:icmpge          173
			{
				android.media.CodecProfileLevel codecprofilelevel = acodecprofilelevel[i];
	//   63  120:aload           6
	//   64  122:iload_2         
	//   65  123:aaload          
	//   66  124:astore          7
				if(codecprofilelevel.profile == ((Integer)((Pair) (obj)).first).intValue() && codecprofilelevel.level >= ((Integer)((Pair) (obj)).second).intValue())
	//*  67  126:aload           7
	//*  68  128:getfield        #283 <Field int android.media.MediaCodecInfo$CodecProfileLevel.profile>
	//*  69  131:aload           5
	//*  70  133:getfield        #289 <Field Object Pair.first>
	//*  71  136:checkcast       #291 <Class Integer>
	//*  72  139:invokevirtual   #294 <Method int Integer.intValue()>
	//*  73  142:icmpne          166
	//*  74  145:aload           7
	//*  75  147:getfield        #297 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//*  76  150:aload           5
	//*  77  152:getfield        #300 <Field Object Pair.second>
	//*  78  155:checkcast       #291 <Class Integer>
	//*  79  158:invokevirtual   #294 <Method int Integer.intValue()>
	//*  80  161:icmplt          166
					return true;
	//   81  164:iconst_1        
	//   82  165:ireturn         
			}

	//   83  166:iload_2         
	//   84  167:iconst_1        
	//   85  168:iadd            
	//   86  169:istore_2        
	//*  87  170:goto            115
			obj = ((Object) (new StringBuilder()));
	//   88  173:new             #102 <Class StringBuilder>
	//   89  176:dup             
	//   90  177:invokespecial   #103 <Method void StringBuilder()>
	//   91  180:astore          5
			((StringBuilder) (obj)).append("codec.profileLevel, ");
	//   92  182:aload           5
	//   93  184:ldc2            #302 <String "codec.profileLevel, ">
	//   94  187:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
			((StringBuilder) (obj)).append(s);
	//   96  191:aload           5
	//   97  193:aload_1         
	//   98  194:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
			((StringBuilder) (obj)).append(", ");
	//  100  198:aload           5
	//  101  200:ldc1            #181 <String ", ">
	//  102  202:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  103  205:pop             
			((StringBuilder) (obj)).append(s1);
	//  104  206:aload           5
	//  105  208:aload           4
	//  106  210:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  107  213:pop             
			logNoSupport(((StringBuilder) (obj)).toString());
	//  108  214:aload_0         
	//  109  215:aload           5
	//  110  217:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  111  220:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//  112  223:iconst_0        
	//  113  224:ireturn         
		} else
		{
			return true;
	//  114  225:iconst_1        
	//  115  226:ireturn         
		}
	}

	public boolean isVideoSizeAndRateSupportedV21(int i, int j, double d)
	{
		if(capabilities == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//*   2    4:ifnonnull       16
		{
			logNoSupport("sizeAndRate.caps");
	//    3    7:aload_0         
	//    4    8:ldc2            #305 <String "sizeAndRate.caps">
	//    5   11:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		}
		android.media.VideoCapabilities videocapabilities = capabilities.getVideoCapabilities();
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
	//   10   20:invokevirtual   #207 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//   11   23:astore          5
		if(videocapabilities == null)
	//*  12   25:aload           5
	//*  13   27:ifnonnull       39
		{
			logNoSupport("sizeAndRate.vCaps");
	//   14   30:aload_0         
	//   15   31:ldc2            #307 <String "sizeAndRate.vCaps">
	//   16   34:invokespecial   #203 <Method void logNoSupport(String)>
			return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
		}
		if(!areSizeAndRateSupportedV21(videocapabilities, i, j, d))
	//*  19   39:aload           5
	//*  20   41:iload_1         
	//*  21   42:iload_2         
	//*  22   43:dload_3         
	//*  23   44:invokestatic    #309 <Method boolean areSizeAndRateSupportedV21(android.media.MediaCodecInfo$VideoCapabilities, int, int, double)>
	//*  24   47:ifne            206
			if(i < j && areSizeAndRateSupportedV21(videocapabilities, j, i, d))
	//*  25   50:iload_1         
	//*  26   51:iload_2         
	//*  27   52:icmpge          138
	//*  28   55:aload           5
	//*  29   57:iload_2         
	//*  30   58:iload_1         
	//*  31   59:dload_3         
	//*  32   60:invokestatic    #309 <Method boolean areSizeAndRateSupportedV21(android.media.MediaCodecInfo$VideoCapabilities, int, int, double)>
	//*  33   63:ifne            69
	//*  34   66:goto            138
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   35   69:new             #102 <Class StringBuilder>
	//   36   72:dup             
	//   37   73:invokespecial   #103 <Method void StringBuilder()>
	//   38   76:astore          5
				stringbuilder.append("sizeAndRate.rotated, ");
	//   39   78:aload           5
	//   40   80:ldc2            #311 <String "sizeAndRate.rotated, ">
	//   41   83:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
				stringbuilder.append(i);
	//   43   87:aload           5
	//   44   89:iload_1         
	//   45   90:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   46   93:pop             
				stringbuilder.append("x");
	//   47   94:aload           5
	//   48   96:ldc2            #313 <String "x">
	//   49   99:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
				stringbuilder.append(j);
	//   51  103:aload           5
	//   52  105:iload_2         
	//   53  106:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   54  109:pop             
				stringbuilder.append("x");
	//   55  110:aload           5
	//   56  112:ldc2            #313 <String "x">
	//   57  115:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
				stringbuilder.append(d);
	//   59  119:aload           5
	//   60  121:dload_3         
	//   61  122:invokevirtual   #316 <Method StringBuilder StringBuilder.append(double)>
	//   62  125:pop             
				logAssumedSupport(stringbuilder.toString());
	//   63  126:aload_0         
	//   64  127:aload           5
	//   65  129:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   66  132:invokespecial   #318 <Method void logAssumedSupport(String)>
			} else
	//*  67  135:goto            206
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   68  138:new             #102 <Class StringBuilder>
	//   69  141:dup             
	//   70  142:invokespecial   #103 <Method void StringBuilder()>
	//   71  145:astore          5
				stringbuilder1.append("sizeAndRate.support, ");
	//   72  147:aload           5
	//   73  149:ldc2            #320 <String "sizeAndRate.support, ">
	//   74  152:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   75  155:pop             
				stringbuilder1.append(i);
	//   76  156:aload           5
	//   77  158:iload_1         
	//   78  159:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   79  162:pop             
				stringbuilder1.append("x");
	//   80  163:aload           5
	//   81  165:ldc2            #313 <String "x">
	//   82  168:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   83  171:pop             
				stringbuilder1.append(j);
	//   84  172:aload           5
	//   85  174:iload_2         
	//   86  175:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   87  178:pop             
				stringbuilder1.append("x");
	//   88  179:aload           5
	//   89  181:ldc2            #313 <String "x">
	//   90  184:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   91  187:pop             
				stringbuilder1.append(d);
	//   92  188:aload           5
	//   93  190:dload_3         
	//   94  191:invokevirtual   #316 <Method StringBuilder StringBuilder.append(double)>
	//   95  194:pop             
				logNoSupport(stringbuilder1.toString());
	//   96  195:aload_0         
	//   97  196:aload           5
	//   98  198:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   99  201:invokespecial   #203 <Method void logNoSupport(String)>
				return false;
	//  100  204:iconst_0        
	//  101  205:ireturn         
			}
		return true;
	//  102  206:iconst_1        
	//  103  207:ireturn         
	}

	public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
	public static final String TAG = "MediaCodecInfo";
	public final boolean adaptive;
	public final android.media.CodecCapabilities capabilities;
	public final String mimeType;
	public final String name;
	public final boolean passthrough;
	public final boolean secure;
	public final boolean tunneling;
}
