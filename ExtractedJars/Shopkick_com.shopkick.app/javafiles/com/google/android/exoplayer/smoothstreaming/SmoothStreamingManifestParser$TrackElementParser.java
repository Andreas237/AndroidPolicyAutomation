// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.CodecSpecificDataUtil;
import com.google.android.exoplayer.util.Util;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifestParser

private static class SmoothStreamingManifestParser$TrackElementParser extends SmoothStreamingManifestParser.ElementParser
{

	private static String fourCCToMimeType(String s)
	{
		if(!s.equalsIgnoreCase("H264") && !s.equalsIgnoreCase("X264") && !s.equalsIgnoreCase("AVC1") && !s.equalsIgnoreCase("DAVC"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #70  <String "H264">
	//*   2    3:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifne            203
	//*   4    9:aload_0         
	//*   5   10:ldc1            #78  <String "X264">
	//*   6   12:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   15:ifne            203
	//*   8   18:aload_0         
	//*   9   19:ldc1            #80  <String "AVC1">
	//*  10   21:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  11   24:ifne            203
	//*  12   27:aload_0         
	//*  13   28:ldc1            #82  <String "DAVC">
	//*  14   30:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  15   33:ifeq            39
	//*  16   36:goto            203
		{
			if(!s.equalsIgnoreCase("AAC") && !s.equalsIgnoreCase("AACL") && !s.equalsIgnoreCase("AACH") && !s.equalsIgnoreCase("AACP"))
	//*  17   39:aload_0         
	//*  18   40:ldc1            #84  <String "AAC">
	//*  19   42:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  20   45:ifne            200
	//*  21   48:aload_0         
	//*  22   49:ldc1            #86  <String "AACL">
	//*  23   51:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  24   54:ifne            200
	//*  25   57:aload_0         
	//*  26   58:ldc1            #88  <String "AACH">
	//*  27   60:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  28   63:ifne            200
	//*  29   66:aload_0         
	//*  30   67:ldc1            #90  <String "AACP">
	//*  31   69:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  32   72:ifeq            78
	//*  33   75:goto            200
			{
				if(s.equalsIgnoreCase("TTML"))
	//*  34   78:aload_0         
	//*  35   79:ldc1            #92  <String "TTML">
	//*  36   81:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  37   84:ifeq            90
					return "application/ttml+xml";
	//   38   87:ldc1            #94  <String "application/ttml+xml">
	//   39   89:areturn         
				if(!s.equalsIgnoreCase("ac-3") && !s.equalsIgnoreCase("dac3"))
	//*  40   90:aload_0         
	//*  41   91:ldc1            #96  <String "ac-3">
	//*  42   93:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  43   96:ifne            197
	//*  44   99:aload_0         
	//*  45  100:ldc1            #98  <String "dac3">
	//*  46  102:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  47  105:ifeq            111
	//*  48  108:goto            197
				{
					if(!s.equalsIgnoreCase("ec-3") && !s.equalsIgnoreCase("dec3"))
	//*  49  111:aload_0         
	//*  50  112:ldc1            #100 <String "ec-3">
	//*  51  114:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  52  117:ifne            194
	//*  53  120:aload_0         
	//*  54  121:ldc1            #102 <String "dec3">
	//*  55  123:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  56  126:ifeq            132
	//*  57  129:goto            194
					{
						if(s.equalsIgnoreCase("dtsc"))
	//*  58  132:aload_0         
	//*  59  133:ldc1            #104 <String "dtsc">
	//*  60  135:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  61  138:ifeq            144
							return "audio/vnd.dts";
	//   62  141:ldc1            #106 <String "audio/vnd.dts">
	//   63  143:areturn         
						if(!s.equalsIgnoreCase("dtsh") && !s.equalsIgnoreCase("dtsl"))
	//*  64  144:aload_0         
	//*  65  145:ldc1            #108 <String "dtsh">
	//*  66  147:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  67  150:ifne            191
	//*  68  153:aload_0         
	//*  69  154:ldc1            #110 <String "dtsl">
	//*  70  156:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  71  159:ifeq            165
	//*  72  162:goto            191
						{
							if(s.equalsIgnoreCase("dtse"))
	//*  73  165:aload_0         
	//*  74  166:ldc1            #112 <String "dtse">
	//*  75  168:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  76  171:ifeq            177
								return "audio/vnd.dts.hd;profile=lbr";
	//   77  174:ldc1            #114 <String "audio/vnd.dts.hd;profile=lbr">
	//   78  176:areturn         
							if(s.equalsIgnoreCase("opus"))
	//*  79  177:aload_0         
	//*  80  178:ldc1            #116 <String "opus">
	//*  81  180:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  82  183:ifeq            189
								return "audio/opus";
	//   83  186:ldc1            #118 <String "audio/opus">
	//   84  188:areturn         
							else
								return null;
	//   85  189:aconst_null     
	//   86  190:areturn         
						} else
						{
							return "audio/vnd.dts.hd";
	//   87  191:ldc1            #120 <String "audio/vnd.dts.hd">
	//   88  193:areturn         
						}
					} else
					{
						return "audio/eac3";
	//   89  194:ldc1            #122 <String "audio/eac3">
	//   90  196:areturn         
					}
				} else
				{
					return "audio/ac3";
	//   91  197:ldc1            #124 <String "audio/ac3">
	//   92  199:areturn         
				}
			} else
			{
				return "audio/mp4a-latm";
	//   93  200:ldc1            #126 <String "audio/mp4a-latm">
	//   94  202:areturn         
			}
		} else
		{
			return "video/avc";
	//   95  203:ldc1            #128 <String "video/avc">
	//   96  205:areturn         
		}
	}

	public Object build()
	{
		byte abyte0[][] = (byte[][])null;
	//    0    0:aconst_null     
	//    1    1:checkcast       #132 <Class byte[][]>
	//    2    4:astore_1        
		if(!csd.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #65  <Field List csd>
	//*   5    9:invokeinterface #138 <Method boolean List.isEmpty()>
	//*   6   14:ifne            44
		{
			abyte0 = new byte[csd.size()][];
	//    7   17:aload_0         
	//    8   18:getfield        #65  <Field List csd>
	//    9   21:invokeinterface #142 <Method int List.size()>
	//   10   26:anewarray       byte[][]
	//   11   29:astore_1        
			csd.toArray(((Object []) (abyte0)));
	//   12   30:aload_0         
	//   13   31:getfield        #65  <Field List csd>
	//   14   34:aload_1         
	//   15   35:invokeinterface #148 <Method Object[] List.toArray(Object[])>
	//   16   40:pop             
		}
	//*  17   41:goto            44
		return ((Object) (new SmoothStreamingManifest.TrackElement(index, bitrate, mimeType, abyte0, maxWidth, maxHeight, samplingRate, channels, language)));
	//   18   44:new             #150 <Class SmoothStreamingManifest$TrackElement>
	//   19   47:dup             
	//   20   48:aload_0         
	//   21   49:getfield        #152 <Field int index>
	//   22   52:aload_0         
	//   23   53:getfield        #154 <Field int bitrate>
	//   24   56:aload_0         
	//   25   57:getfield        #156 <Field String mimeType>
	//   26   60:aload_1         
	//   27   61:aload_0         
	//   28   62:getfield        #158 <Field int maxWidth>
	//   29   65:aload_0         
	//   30   66:getfield        #160 <Field int maxHeight>
	//   31   69:aload_0         
	//   32   70:getfield        #162 <Field int samplingRate>
	//   33   73:aload_0         
	//   34   74:getfield        #164 <Field int channels>
	//   35   77:aload_0         
	//   36   78:getfield        #166 <Field String language>
	//   37   81:invokespecial   #169 <Method void SmoothStreamingManifest$TrackElement(int, int, String, byte[][], int, int, int, int, String)>
	//   38   84:areturn         
	}

	public void parseStartTag(XmlPullParser xmlpullparser)
		throws ParserException
	{
		int i = ((Integer)getNormalizedAttribute("Type")).intValue();
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "Type">
	//    2    3:invokevirtual   #177 <Method Object getNormalizedAttribute(String)>
	//    3    6:checkcast       #179 <Class Integer>
	//    4    9:invokevirtual   #182 <Method int Integer.intValue()>
	//    5   12:istore_2        
		index = parseInt(xmlpullparser, "Index", -1);
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #23  <String "Index">
	//   10   18:iconst_m1       
	//   11   19:invokevirtual   #186 <Method int parseInt(XmlPullParser, String, int)>
	//   12   22:putfield        #152 <Field int index>
		bitrate = parseRequiredInt(xmlpullparser, "Bitrate");
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:ldc1            #11  <String "Bitrate">
	//   17   30:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
	//   18   33:putfield        #154 <Field int bitrate>
		language = (String)getNormalizedAttribute("Language");
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:ldc1            #26  <String "Language">
	//   22   40:invokevirtual   #177 <Method Object getNormalizedAttribute(String)>
	//   23   43:checkcast       #72  <Class String>
	//   24   46:putfield        #166 <Field String language>
		if(i == 1)
	//*  25   49:iload_2         
	//*  26   50:iconst_1        
	//*  27   51:icmpne          93
		{
			maxHeight = parseRequiredInt(xmlpullparser, "MaxHeight");
	//   28   54:aload_0         
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:ldc1            #29  <String "MaxHeight">
	//   32   59:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
	//   33   62:putfield        #160 <Field int maxHeight>
			maxWidth = parseRequiredInt(xmlpullparser, "MaxWidth");
	//   34   65:aload_0         
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:ldc1            #32  <String "MaxWidth">
	//   38   70:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
	//   39   73:putfield        #158 <Field int maxWidth>
			mimeType = fourCCToMimeType(parseRequiredString(xmlpullparser, "FourCC"));
	//   40   76:aload_0         
	//   41   77:aload_0         
	//   42   78:aload_1         
	//   43   79:ldc1            #20  <String "FourCC">
	//   44   81:invokevirtual   #194 <Method String parseRequiredString(XmlPullParser, String)>
	//   45   84:invokestatic    #196 <Method String fourCCToMimeType(String)>
	//   46   87:putfield        #156 <Field String mimeType>
		} else
	//*  47   90:goto            142
		{
			maxHeight = -1;
	//   48   93:aload_0         
	//   49   94:iconst_m1       
	//   50   95:putfield        #160 <Field int maxHeight>
			maxWidth = -1;
	//   51   98:aload_0         
	//   52   99:iconst_m1       
	//   53  100:putfield        #158 <Field int maxWidth>
			String s = xmlpullparser.getAttributeValue(((String) (null)), "FourCC");
	//   54  103:aload_1         
	//   55  104:aconst_null     
	//   56  105:ldc1            #20  <String "FourCC">
	//   57  107:invokeinterface #202 <Method String XmlPullParser.getAttributeValue(String, String)>
	//   58  112:astore_3        
			if(s != null)
	//*  59  113:aload_3         
	//*  60  114:ifnull          125
				s = fourCCToMimeType(s);
	//   61  117:aload_3         
	//   62  118:invokestatic    #196 <Method String fourCCToMimeType(String)>
	//   63  121:astore_3        
			else
	//*  64  122:goto            137
			if(i == 0)
	//*  65  125:iload_2         
	//*  66  126:ifne            135
				s = "audio/mp4a-latm";
	//   67  129:ldc1            #126 <String "audio/mp4a-latm">
	//   68  131:astore_3        
			else
	//*  69  132:goto            137
				s = null;
	//   70  135:aconst_null     
	//   71  136:astore_3        
			mimeType = s;
	//   72  137:aload_0         
	//   73  138:aload_3         
	//   74  139:putfield        #156 <Field String mimeType>
		}
		if(i == 0)
	//*  75  142:iload_2         
	//*  76  143:ifne            171
		{
			samplingRate = parseRequiredInt(xmlpullparser, "SamplingRate");
	//   77  146:aload_0         
	//   78  147:aload_0         
	//   79  148:aload_1         
	//   80  149:ldc1            #35  <String "SamplingRate">
	//   81  151:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
	//   82  154:putfield        #162 <Field int samplingRate>
			channels = parseRequiredInt(xmlpullparser, "Channels");
	//   83  157:aload_0         
	//   84  158:aload_0         
	//   85  159:aload_1         
	//   86  160:ldc1            #14  <String "Channels">
	//   87  162:invokevirtual   #190 <Method int parseRequiredInt(XmlPullParser, String)>
	//   88  165:putfield        #164 <Field int channels>
		} else
	//*  89  168:goto            181
		{
			samplingRate = -1;
	//   90  171:aload_0         
	//   91  172:iconst_m1       
	//   92  173:putfield        #162 <Field int samplingRate>
			channels = -1;
	//   93  176:aload_0         
	//   94  177:iconst_m1       
	//   95  178:putfield        #164 <Field int channels>
		}
		xmlpullparser = ((XmlPullParser) (xmlpullparser.getAttributeValue(((String) (null)), "CodecPrivateData")));
	//   96  181:aload_1         
	//   97  182:aconst_null     
	//   98  183:ldc1            #17  <String "CodecPrivateData">
	//   99  185:invokeinterface #202 <Method String XmlPullParser.getAttributeValue(String, String)>
	//  100  190:astore_1        
		if(xmlpullparser != null && ((String) (xmlpullparser)).length() > 0)
	//* 101  191:aload_1         
	//* 102  192:ifnull          256
	//* 103  195:aload_1         
	//* 104  196:invokevirtual   #205 <Method int String.length()>
	//* 105  199:ifle            256
		{
			xmlpullparser = ((XmlPullParser) (Util.getBytesFromHexString(((String) (xmlpullparser)))));
	//  106  202:aload_1         
	//  107  203:invokestatic    #211 <Method byte[] Util.getBytesFromHexString(String)>
	//  108  206:astore_1        
			byte abyte0[][] = CodecSpecificDataUtil.splitNalUnits(((byte []) (xmlpullparser)));
	//  109  207:aload_1         
	//  110  208:invokestatic    #217 <Method byte[][] CodecSpecificDataUtil.splitNalUnits(byte[])>
	//  111  211:astore_3        
			if(abyte0 == null)
	//* 112  212:aload_3         
	//* 113  213:ifnonnull       228
			{
				csd.add(((Object) (xmlpullparser)));
	//  114  216:aload_0         
	//  115  217:getfield        #65  <Field List csd>
	//  116  220:aload_1         
	//  117  221:invokeinterface #221 <Method boolean List.add(Object)>
	//  118  226:pop             
				return;
	//  119  227:return          
			}
			for(int j = 0; j < abyte0.length; j++)
	//* 120  228:iconst_0        
	//* 121  229:istore_2        
	//* 122  230:iload_2         
	//* 123  231:aload_3         
	//* 124  232:arraylength     
	//* 125  233:icmpge          256
				csd.add(((Object) (abyte0[j])));
	//  126  236:aload_0         
	//  127  237:getfield        #65  <Field List csd>
	//  128  240:aload_3         
	//  129  241:iload_2         
	//  130  242:aaload          
	//  131  243:invokeinterface #221 <Method boolean List.add(Object)>
	//  132  248:pop             

	//  133  249:iload_2         
	//  134  250:iconst_1        
	//  135  251:iadd            
	//  136  252:istore_2        
		}
	//* 137  253:goto            230
	//  138  256:return          
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
	private int bitrate;
	private int channels;
	private final List csd = new LinkedList();
	private int index;
	private String language;
	private int maxHeight;
	private int maxWidth;
	private String mimeType;
	private int samplingRate;

	public SmoothStreamingManifestParser$TrackElementParser(SmoothStreamingManifestParser.ElementParser elementparser, String s)
	{
		super(elementparser, s, "QualityLevel");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #41  <String "QualityLevel">
	//    4    5:invokespecial   #58  <Method void SmoothStreamingManifestParser$ElementParser(SmoothStreamingManifestParser$ElementParser, String, String)>
	//    5    8:aload_0         
	//    6    9:new             #60  <Class LinkedList>
	//    7   12:dup             
	//    8   13:invokespecial   #63  <Method void LinkedList()>
	//    9   16:putfield        #65  <Field List csd>
	//   10   19:return          
	}
}
