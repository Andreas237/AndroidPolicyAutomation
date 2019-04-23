// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


public final class MimeTypes
{

	private MimeTypes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method void Object()>
	//    2    4:return          
	}

	public static String getAudioMediaMimeType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "audio/x-unknown";
	//    2    4:ldc1            #92  <String "audio/x-unknown">
	//    3    6:areturn         
		s = ((String) (s.split(",")));
	//    4    7:aload_0         
	//    5    8:ldc1            #158 <String ",">
	//    6   10:invokevirtual   #164 <Method String[] String.split(String)>
	//    7   13:astore_0        
		int j = s.length;
	//    8   14:aload_0         
	//    9   15:arraylength     
	//   10   16:istore_2        
		for(int i = 0; i < j;)
	//*  11   17:iconst_0        
	//*  12   18:istore_1        
	//*  13   19:iload_1         
	//*  14   20:iload_2         
	//*  15   21:icmpge          170
		{
			String s1 = ((String) (s[i])).trim();
	//   16   24:aload_0         
	//   17   25:iload_1         
	//   18   26:aaload          
	//   19   27:invokevirtual   #168 <Method String String.trim()>
	//   20   30:astore_3        
			if(s1.startsWith("mp4a"))
	//*  21   31:aload_3         
	//*  22   32:ldc1            #170 <String "mp4a">
	//*  23   34:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  24   37:ifeq            43
				return "audio/mp4a-latm";
	//   25   40:ldc1            #44  <String "audio/mp4a-latm">
	//   26   42:areturn         
			if(!s1.startsWith("ac-3") && !s1.startsWith("dac3"))
	//*  27   43:aload_3         
	//*  28   44:ldc1            #176 <String "ac-3">
	//*  29   46:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  30   49:ifne            167
	//*  31   52:aload_3         
	//*  32   53:ldc1            #178 <String "dac3">
	//*  33   55:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  34   58:ifeq            64
	//*  35   61:goto            167
			{
				if(!s1.startsWith("ec-3") && !s1.startsWith("dec3"))
	//*  36   64:aload_3         
	//*  37   65:ldc1            #180 <String "ec-3">
	//*  38   67:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  39   70:ifne            164
	//*  40   73:aload_3         
	//*  41   74:ldc1            #182 <String "dec3">
	//*  42   76:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  43   79:ifeq            85
	//*  44   82:goto            164
				{
					if(s1.startsWith("dtsc"))
	//*  45   85:aload_3         
	//*  46   86:ldc1            #184 <String "dtsc">
	//*  47   88:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  48   91:ifeq            97
						return "audio/vnd.dts";
	//   49   94:ldc1            #56  <String "audio/vnd.dts">
	//   50   96:areturn         
					if(!s1.startsWith("dtsh") && !s1.startsWith("dtsl"))
	//*  51   97:aload_3         
	//*  52   98:ldc1            #186 <String "dtsh">
	//*  53  100:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  54  103:ifne            161
	//*  55  106:aload_3         
	//*  56  107:ldc1            #188 <String "dtsl">
	//*  57  109:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  58  112:ifeq            118
	//*  59  115:goto            161
					{
						if(s1.startsWith("dtse"))
	//*  60  118:aload_3         
	//*  61  119:ldc1            #190 <String "dtse">
	//*  62  121:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  63  124:ifeq            130
							return "audio/vnd.dts.hd;profile=lbr";
	//   64  127:ldc1            #59  <String "audio/vnd.dts.hd;profile=lbr">
	//   65  129:areturn         
						if(s1.startsWith("opus"))
	//*  66  130:aload_3         
	//*  67  131:ldc1            #192 <String "opus">
	//*  68  133:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  69  136:ifeq            142
							return "audio/opus";
	//   70  139:ldc1            #83  <String "audio/opus">
	//   71  141:areturn         
						if(s1.startsWith("vorbis"))
	//*  72  142:aload_3         
	//*  73  143:ldc1            #194 <String "vorbis">
	//*  74  145:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  75  148:ifeq            154
							return "audio/vorbis";
	//   76  151:ldc1            #95  <String "audio/vorbis">
	//   77  153:areturn         
						i++;
	//   78  154:iload_1         
	//   79  155:iconst_1        
	//   80  156:iadd            
	//   81  157:istore_1        
					} else
	//*  82  158:goto            19
					{
						return "audio/vnd.dts.hd";
	//   83  161:ldc1            #62  <String "audio/vnd.dts.hd">
	//   84  163:areturn         
					}
				} else
				{
					return "audio/eac3";
	//   85  164:ldc1            #65  <String "audio/eac3">
	//   86  166:areturn         
				}
			} else
			{
				return "audio/ac3";
	//   87  167:ldc1            #47  <String "audio/ac3">
	//   88  169:areturn         
			}
		}

		return "audio/x-unknown";
	//   89  170:ldc1            #92  <String "audio/x-unknown">
	//   90  172:areturn         
	}

	private static String getTopLevelType(String s)
	{
		int i = s.indexOf('/');
	//    0    0:aload_0         
	//    1    1:bipush          47
	//    2    3:invokevirtual   #199 <Method int String.indexOf(int)>
	//    3    6:istore_1        
		if(i != -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          19
		{
			return s.substring(0, i);
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:iload_1         
	//   10   15:invokevirtual   #203 <Method String String.substring(int, int)>
	//   11   18:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   19:new             #205 <Class StringBuilder>
	//   13   22:dup             
	//   14   23:invokespecial   #206 <Method void StringBuilder()>
	//   15   26:astore_2        
			stringbuilder.append("Invalid mime type: ");
	//   16   27:aload_2         
	//   17   28:ldc1            #208 <String "Invalid mime type: ">
	//   18   30:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			stringbuilder.append(s);
	//   20   34:aload_2         
	//   21   35:aload_0         
	//   22   36:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   23   39:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   24   40:new             #214 <Class IllegalArgumentException>
	//   25   43:dup             
	//   26   44:aload_2         
	//   27   45:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   28   48:invokespecial   #220 <Method void IllegalArgumentException(String)>
	//   29   51:athrow          
		}
	}

	public static String getVideoMediaMimeType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "video/x-unknown";
	//    2    4:ldc1            #137 <String "video/x-unknown">
	//    3    6:areturn         
		s = ((String) (s.split(",")));
	//    4    7:aload_0         
	//    5    8:ldc1            #158 <String ",">
	//    6   10:invokevirtual   #164 <Method String[] String.split(String)>
	//    7   13:astore_0        
		int j = s.length;
	//    8   14:aload_0         
	//    9   15:arraylength     
	//   10   16:istore_2        
		for(int i = 0; i < j;)
	//*  11   17:iconst_0        
	//*  12   18:istore_1        
	//*  13   19:iload_1         
	//*  14   20:iload_2         
	//*  15   21:icmpge          110
		{
			String s1 = ((String) (s[i])).trim();
	//   16   24:aload_0         
	//   17   25:iload_1         
	//   18   26:aaload          
	//   19   27:invokevirtual   #168 <Method String String.trim()>
	//   20   30:astore_3        
			if(!s1.startsWith("avc1") && !s1.startsWith("avc3"))
	//*  21   31:aload_3         
	//*  22   32:ldc1            #223 <String "avc1">
	//*  23   34:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  24   37:ifne            107
	//*  25   40:aload_3         
	//*  26   41:ldc1            #225 <String "avc3">
	//*  27   43:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  28   46:ifeq            52
	//*  29   49:goto            107
			{
				if(!s1.startsWith("hev1") && !s1.startsWith("hvc1"))
	//*  30   52:aload_3         
	//*  31   53:ldc1            #227 <String "hev1">
	//*  32   55:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  33   58:ifne            104
	//*  34   61:aload_3         
	//*  35   62:ldc1            #229 <String "hvc1">
	//*  36   64:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  37   67:ifeq            73
	//*  38   70:goto            104
				{
					if(s1.startsWith("vp9"))
	//*  39   73:aload_3         
	//*  40   74:ldc1            #231 <String "vp9">
	//*  41   76:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  42   79:ifeq            85
						return "video/x-vnd.on2.vp9";
	//   43   82:ldc1            #146 <String "video/x-vnd.on2.vp9">
	//   44   84:areturn         
					if(s1.startsWith("vp8"))
	//*  45   85:aload_3         
	//*  46   86:ldc1            #233 <String "vp8">
	//*  47   88:invokevirtual   #174 <Method boolean String.startsWith(String)>
	//*  48   91:ifeq            97
						return "video/x-vnd.on2.vp8";
	//   49   94:ldc1            #143 <String "video/x-vnd.on2.vp8">
	//   50   96:areturn         
					i++;
	//   51   97:iload_1         
	//   52   98:iconst_1        
	//   53   99:iadd            
	//   54  100:istore_1        
				} else
	//*  55  101:goto            19
				{
					return "video/hevc";
	//   56  104:ldc1            #125 <String "video/hevc">
	//   57  106:areturn         
				}
			} else
			{
				return "video/avc";
	//   58  107:ldc1            #122 <String "video/avc">
	//   59  109:areturn         
			}
		}

		return "video/x-unknown";
	//   60  110:ldc1            #137 <String "video/x-unknown">
	//   61  112:areturn         
	}

	public static boolean isApplication(String s)
	{
		return getTopLevelType(s).equals("application");
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method String getTopLevelType(String)>
	//    2    4:ldc1            #101 <String "application">
	//    3    6:invokevirtual   #240 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean isAudio(String s)
	{
		return getTopLevelType(s).equals("audio");
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method String getTopLevelType(String)>
	//    2    4:ldc1            #104 <String "audio">
	//    3    6:invokevirtual   #240 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean isText(String s)
	{
		return getTopLevelType(s).equals("text");
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method String getTopLevelType(String)>
	//    2    4:ldc1            #107 <String "text">
	//    3    6:invokevirtual   #240 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean isVideo(String s)
	{
		return getTopLevelType(s).equals("video");
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method String getTopLevelType(String)>
	//    2    4:ldc1            #110 <String "video">
	//    3    6:invokevirtual   #240 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
	public static final String APPLICATION_EIA608 = "application/eia-608";
	public static final String APPLICATION_ID3 = "application/id3";
	public static final String APPLICATION_M3U8 = "application/x-mpegURL";
	public static final String APPLICATION_MP4 = "application/mp4";
	public static final String APPLICATION_MP4VTT = "application/x-mp4vtt";
	public static final String APPLICATION_PGS = "application/pgs";
	public static final String APPLICATION_SUBRIP = "application/x-subrip";
	public static final String APPLICATION_TTML = "application/ttml+xml";
	public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
	public static final String APPLICATION_VOBSUB = "application/vobsub";
	public static final String APPLICATION_WEBM = "application/webm";
	public static final String AUDIO_AAC = "audio/mp4a-latm";
	public static final String AUDIO_AC3 = "audio/ac3";
	public static final String AUDIO_AMR_NB = "audio/3gpp";
	public static final String AUDIO_AMR_WB = "audio/amr-wb";
	public static final String AUDIO_DTS = "audio/vnd.dts";
	public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
	public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
	public static final String AUDIO_E_AC3 = "audio/eac3";
	public static final String AUDIO_FLAC = "audio/x-flac";
	public static final String AUDIO_MP4 = "audio/mp4";
	public static final String AUDIO_MPEG = "audio/mpeg";
	public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
	public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
	public static final String AUDIO_OPUS = "audio/opus";
	public static final String AUDIO_RAW = "audio/raw";
	public static final String AUDIO_TRUEHD = "audio/true-hd";
	public static final String AUDIO_UNKNOWN = "audio/x-unknown";
	public static final String AUDIO_VORBIS = "audio/vorbis";
	public static final String AUDIO_WEBM = "audio/webm";
	public static final String BASE_TYPE_APPLICATION = "application";
	public static final String BASE_TYPE_AUDIO = "audio";
	public static final String BASE_TYPE_TEXT = "text";
	public static final String BASE_TYPE_VIDEO = "video";
	public static final String TEXT_UNKNOWN = "text/x-unknown";
	public static final String TEXT_VTT = "text/vtt";
	public static final String VIDEO_H263 = "video/3gpp";
	public static final String VIDEO_H264 = "video/avc";
	public static final String VIDEO_H265 = "video/hevc";
	public static final String VIDEO_MP4 = "video/mp4";
	public static final String VIDEO_MP4V = "video/mp4v-es";
	public static final String VIDEO_MPEG2 = "video/mpeg2";
	public static final String VIDEO_UNKNOWN = "video/x-unknown";
	public static final String VIDEO_VC1 = "video/wvc1";
	public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
	public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
	public static final String VIDEO_WEBM = "video/webm";
}
