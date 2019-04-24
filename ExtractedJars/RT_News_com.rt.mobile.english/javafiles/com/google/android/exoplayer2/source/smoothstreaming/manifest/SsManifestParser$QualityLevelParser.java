// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.manifest:
//			SsManifestParser

private static class SsManifestParser$QualityLevelParser extends SsManifestParser.ElementParser
{

	private static List buildCodecSpecificData(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #53  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void ArrayList()>
	//    3    7:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #62  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   12:ifne            43
		{
			s = ((String) (Util.getBytesFromHexString(s)));
	//    7   15:aload_0         
	//    8   16:invokestatic    #68  <Method byte[] Util.getBytesFromHexString(String)>
	//    9   19:astore_0        
			byte abyte0[][] = CodecSpecificDataUtil.splitNalUnits(((byte []) (s)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #74  <Method byte[][] CodecSpecificDataUtil.splitNalUnits(byte[])>
	//   12   24:astore_2        
			if(abyte0 == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       37
			{
				arraylist.add(((Object) (s)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   18   34:pop             
				return ((List) (arraylist));
	//   19   35:aload_1         
	//   20   36:areturn         
			}
			Collections.addAll(((java.util.Collection) (arraylist)), ((Object []) (abyte0)));
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:invokestatic    #84  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   24   42:pop             
		}
		return ((List) (arraylist));
	//   25   43:aload_1         
	//   26   44:areturn         
	}

	private static String fourCCToMimeType(String s)
	{
		if(!s.equalsIgnoreCase("H264") && !s.equalsIgnoreCase("X264") && !s.equalsIgnoreCase("AVC1") && !s.equalsIgnoreCase("DAVC"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #90  <String "H264">
	//*   2    3:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifne            203
	//*   4    9:aload_0         
	//*   5   10:ldc1            #98  <String "X264">
	//*   6   12:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   15:ifne            203
	//*   8   18:aload_0         
	//*   9   19:ldc1            #100 <String "AVC1">
	//*  10   21:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  11   24:ifne            203
	//*  12   27:aload_0         
	//*  13   28:ldc1            #102 <String "DAVC">
	//*  14   30:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  15   33:ifeq            39
	//*  16   36:goto            203
		{
			if(!s.equalsIgnoreCase("AAC") && !s.equalsIgnoreCase("AACL") && !s.equalsIgnoreCase("AACH") && !s.equalsIgnoreCase("AACP"))
	//*  17   39:aload_0         
	//*  18   40:ldc1            #104 <String "AAC">
	//*  19   42:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  20   45:ifne            200
	//*  21   48:aload_0         
	//*  22   49:ldc1            #106 <String "AACL">
	//*  23   51:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  24   54:ifne            200
	//*  25   57:aload_0         
	//*  26   58:ldc1            #108 <String "AACH">
	//*  27   60:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  28   63:ifne            200
	//*  29   66:aload_0         
	//*  30   67:ldc1            #110 <String "AACP">
	//*  31   69:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  32   72:ifeq            78
	//*  33   75:goto            200
			{
				if(s.equalsIgnoreCase("TTML"))
	//*  34   78:aload_0         
	//*  35   79:ldc1            #112 <String "TTML">
	//*  36   81:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  37   84:ifeq            90
					return "application/ttml+xml";
	//   38   87:ldc1            #114 <String "application/ttml+xml">
	//   39   89:areturn         
				if(!s.equalsIgnoreCase("ac-3") && !s.equalsIgnoreCase("dac3"))
	//*  40   90:aload_0         
	//*  41   91:ldc1            #116 <String "ac-3">
	//*  42   93:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  43   96:ifne            197
	//*  44   99:aload_0         
	//*  45  100:ldc1            #118 <String "dac3">
	//*  46  102:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  47  105:ifeq            111
	//*  48  108:goto            197
				{
					if(!s.equalsIgnoreCase("ec-3") && !s.equalsIgnoreCase("dec3"))
	//*  49  111:aload_0         
	//*  50  112:ldc1            #120 <String "ec-3">
	//*  51  114:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  52  117:ifne            194
	//*  53  120:aload_0         
	//*  54  121:ldc1            #122 <String "dec3">
	//*  55  123:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  56  126:ifeq            132
	//*  57  129:goto            194
					{
						if(s.equalsIgnoreCase("dtsc"))
	//*  58  132:aload_0         
	//*  59  133:ldc1            #124 <String "dtsc">
	//*  60  135:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  61  138:ifeq            144
							return "audio/vnd.dts";
	//   62  141:ldc1            #126 <String "audio/vnd.dts">
	//   63  143:areturn         
						if(!s.equalsIgnoreCase("dtsh") && !s.equalsIgnoreCase("dtsl"))
	//*  64  144:aload_0         
	//*  65  145:ldc1            #128 <String "dtsh">
	//*  66  147:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  67  150:ifne            191
	//*  68  153:aload_0         
	//*  69  154:ldc1            #130 <String "dtsl">
	//*  70  156:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  71  159:ifeq            165
	//*  72  162:goto            191
						{
							if(s.equalsIgnoreCase("dtse"))
	//*  73  165:aload_0         
	//*  74  166:ldc1            #132 <String "dtse">
	//*  75  168:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  76  171:ifeq            177
								return "audio/vnd.dts.hd;profile=lbr";
	//   77  174:ldc1            #134 <String "audio/vnd.dts.hd;profile=lbr">
	//   78  176:areturn         
							if(s.equalsIgnoreCase("opus"))
	//*  79  177:aload_0         
	//*  80  178:ldc1            #136 <String "opus">
	//*  81  180:invokevirtual   #96  <Method boolean String.equalsIgnoreCase(String)>
	//*  82  183:ifeq            189
								return "audio/opus";
	//   83  186:ldc1            #138 <String "audio/opus">
	//   84  188:areturn         
							else
								return null;
	//   85  189:aconst_null     
	//   86  190:areturn         
						} else
						{
							return "audio/vnd.dts.hd";
	//   87  191:ldc1            #140 <String "audio/vnd.dts.hd">
	//   88  193:areturn         
						}
					} else
					{
						return "audio/eac3";
	//   89  194:ldc1            #142 <String "audio/eac3">
	//   90  196:areturn         
					}
				} else
				{
					return "audio/ac3";
	//   91  197:ldc1            #144 <String "audio/ac3">
	//   92  199:areturn         
				}
			} else
			{
				return "audio/mp4a-latm";
	//   93  200:ldc1            #146 <String "audio/mp4a-latm">
	//   94  202:areturn         
			}
		} else
		{
			return "video/avc";
	//   95  203:ldc1            #148 <String "video/avc">
	//   96  205:areturn         
		}
	}

	public Object build()
	{
		return ((Object) (format));
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field Format format>
	//    2    4:areturn         
	}

	public void parseStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		int j = ((Integer)getNormalizedAttribute("Type")).intValue();
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "Type">
	//    2    3:invokevirtual   #160 <Method Object getNormalizedAttribute(String)>
	//    3    6:checkcast       #162 <Class Integer>
	//    4    9:invokevirtual   #166 <Method int Integer.intValue()>
	//    5   12:istore_3        
		String s = xmlpullparser.getAttributeValue(((String) (null)), "Index");
	//    6   13:aload_1         
	//    7   14:aconst_null     
	//    8   15:ldc1            #23  <String "Index">
	//    9   17:invokeinterface #172 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   10   22:astore          7
		int i = parseRequiredInt(xmlpullparser, "Bitrate");
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:ldc1            #11  <String "Bitrate">
	//   14   28:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
	//   15   31:istore_2        
		Object obj1 = ((Object) (fourCCToMimeType(parseRequiredString(xmlpullparser, "FourCC"))));
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:ldc1            #20  <String "FourCC">
	//   19   36:invokevirtual   #180 <Method String parseRequiredString(XmlPullParser, String)>
	//   20   39:invokestatic    #182 <Method String fourCCToMimeType(String)>
	//   21   42:astore          6
		if(j == 2)
	//*  22   44:iload_3         
	//*  23   45:iconst_2        
	//*  24   46:icmpne          94
		{
			format = Format.createVideoContainerFormat(s, "video/mp4", ((String) (obj1)), ((String) (null)), i, parseRequiredInt(xmlpullparser, "MaxWidth"), parseRequiredInt(xmlpullparser, "MaxHeight"), -1F, buildCodecSpecificData(xmlpullparser.getAttributeValue(((String) (null)), "CodecPrivateData")), 0);
	//   25   49:aload_0         
	//   26   50:aload           7
	//   27   52:ldc1            #184 <String "video/mp4">
	//   28   54:aload           6
	//   29   56:aconst_null     
	//   30   57:iload_2         
	//   31   58:aload_0         
	//   32   59:aload_1         
	//   33   60:ldc1            #32  <String "MaxWidth">
	//   34   62:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:ldc1            #29  <String "MaxHeight">
	//   38   69:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
	//   39   72:ldc1            #185 <Float -1F>
	//   40   74:aload_1         
	//   41   75:aconst_null     
	//   42   76:ldc1            #17  <String "CodecPrivateData">
	//   43   78:invokeinterface #172 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   44   83:invokestatic    #187 <Method List buildCodecSpecificData(String)>
	//   45   86:iconst_0        
	//   46   87:invokestatic    #193 <Method Format Format.createVideoContainerFormat(String, String, String, String, int, int, int, float, List, int)>
	//   47   90:putfield        #152 <Field Format format>
			return;
	//   48   93:return          
		}
		if(j == 1)
	//*  49   94:iload_3         
	//*  50   95:iconst_1        
	//*  51   96:icmpne          209
		{
			Object obj = obj1;
	//   52   99:aload           6
	//   53  101:astore          5
			if(obj1 == null)
	//*  54  103:aload           6
	//*  55  105:ifnonnull       112
				obj = "audio/mp4a-latm";
	//   56  108:ldc1            #146 <String "audio/mp4a-latm">
	//   57  110:astore          5
			j = parseRequiredInt(xmlpullparser, "Channels");
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:ldc1            #14  <String "Channels">
	//   61  116:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
	//   62  119:istore_3        
			int k = parseRequiredInt(xmlpullparser, "SamplingRate");
	//   63  120:aload_0         
	//   64  121:aload_1         
	//   65  122:ldc1            #35  <String "SamplingRate">
	//   66  124:invokevirtual   #176 <Method int parseRequiredInt(XmlPullParser, String)>
	//   67  127:istore          4
			obj1 = ((Object) (buildCodecSpecificData(xmlpullparser.getAttributeValue(((String) (null)), "CodecPrivateData"))));
	//   68  129:aload_1         
	//   69  130:aconst_null     
	//   70  131:ldc1            #17  <String "CodecPrivateData">
	//   71  133:invokeinterface #172 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   72  138:invokestatic    #187 <Method List buildCodecSpecificData(String)>
	//   73  141:astore          6
			xmlpullparser = ((XmlPullParser) (obj1));
	//   74  143:aload           6
	//   75  145:astore_1        
			if(((List) (obj1)).isEmpty())
	//*  76  146:aload           6
	//*  77  148:invokeinterface #198 <Method boolean List.isEmpty()>
	//*  78  153:ifeq            179
			{
				xmlpullparser = ((XmlPullParser) (obj1));
	//   79  156:aload           6
	//   80  158:astore_1        
				if("audio/mp4a-latm".equals(obj))
	//*  81  159:ldc1            #146 <String "audio/mp4a-latm">
	//*  82  161:aload           5
	//*  83  163:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  84  166:ifeq            179
					xmlpullparser = ((XmlPullParser) (Collections.singletonList(((Object) (CodecSpecificDataUtil.buildAacLcAudioSpecificConfig(k, j))))));
	//   85  169:iload           4
	//   86  171:iload_3         
	//   87  172:invokestatic    #205 <Method byte[] CodecSpecificDataUtil.buildAacLcAudioSpecificConfig(int, int)>
	//   88  175:invokestatic    #209 <Method List Collections.singletonList(Object)>
	//   89  178:astore_1        
			}
			format = Format.createAudioContainerFormat(s, "audio/mp4", ((String) (obj)), ((String) (null)), i, j, k, ((List) (xmlpullparser)), 0, (String)getNormalizedAttribute("Language"));
	//   90  179:aload_0         
	//   91  180:aload           7
	//   92  182:ldc1            #211 <String "audio/mp4">
	//   93  184:aload           5
	//   94  186:aconst_null     
	//   95  187:iload_2         
	//   96  188:iload_3         
	//   97  189:iload           4
	//   98  191:aload_1         
	//   99  192:iconst_0        
	//  100  193:aload_0         
	//  101  194:ldc1            #26  <String "Language">
	//  102  196:invokevirtual   #160 <Method Object getNormalizedAttribute(String)>
	//  103  199:checkcast       #92  <Class String>
	//  104  202:invokestatic    #215 <Method Format Format.createAudioContainerFormat(String, String, String, String, int, int, int, List, int, String)>
	//  105  205:putfield        #152 <Field Format format>
			return;
	//  106  208:return          
		}
		if(j == 3)
	//* 107  209:iload_3         
	//* 108  210:iconst_3        
	//* 109  211:icmpne          240
		{
			format = Format.createTextContainerFormat(s, "application/mp4", ((String) (obj1)), ((String) (null)), i, 0, (String)getNormalizedAttribute("Language"));
	//  110  214:aload_0         
	//  111  215:aload           7
	//  112  217:ldc1            #217 <String "application/mp4">
	//  113  219:aload           6
	//  114  221:aconst_null     
	//  115  222:iload_2         
	//  116  223:iconst_0        
	//  117  224:aload_0         
	//  118  225:ldc1            #26  <String "Language">
	//  119  227:invokevirtual   #160 <Method Object getNormalizedAttribute(String)>
	//  120  230:checkcast       #92  <Class String>
	//  121  233:invokestatic    #221 <Method Format Format.createTextContainerFormat(String, String, String, String, int, int, String)>
	//  122  236:putfield        #152 <Field Format format>
			return;
	//  123  239:return          
		} else
		{
			format = Format.createContainerFormat(s, "application/mp4", ((String) (obj1)), ((String) (null)), i, 0, ((String) (null)));
	//  124  240:aload_0         
	//  125  241:aload           7
	//  126  243:ldc1            #217 <String "application/mp4">
	//  127  245:aload           6
	//  128  247:aconst_null     
	//  129  248:iload_2         
	//  130  249:iconst_0        
	//  131  250:aconst_null     
	//  132  251:invokestatic    #224 <Method Format Format.createContainerFormat(String, String, String, String, int, int, String)>
	//  133  254:putfield        #152 <Field Format format>
			return;
	//  134  257:return          
		}
	}

	private static final String KEY_BITRATE = "Bitrate";
	private static final String KEY_CHANNELS = "Channels";
	private static final String KEY_CODEC_PRIVATE_DATA = "CodecPrivateData";
	private static final String KEY_FOUR_CC = "FourCC";
	private static final String KEY_INDEX = "Index";
	private static final String KEY_LANGUAGE = "Language";
	private static final String KEY_MAX_HEIGHT = "MaxHeight";
	private static final String KEY_MAX_WIDTH = "MaxWidth";
	private static final String KEY_SAMPLING_RATE = "SamplingRate";
	private static final String KEY_TYPE = "Type";
	public static final String TAG = "QualityLevel";
	private Format format;

	public SsManifestParser$QualityLevelParser(SsManifestParser.ElementParser elementparser, String s)
	{
		super(elementparser, s, "QualityLevel");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #41  <String "QualityLevel">
	//    4    5:invokespecial   #48  <Method void SsManifestParser$ElementParser(SsManifestParser$ElementParser, String, String)>
	//    5    8:return          
	}
}
