// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Util

public final class MimeTypes
{
	private static final class CustomMimeType
	{

		public final String codecPrefix;
		public final String mimeType;
		public final int trackType;

		public CustomMimeType(String s, String s1, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mimeType = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field String mimeType>
			codecPrefix = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field String codecPrefix>
			trackType = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field int trackType>
		//   11   19:return          
		}
	}


	private MimeTypes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void Object()>
	//    2    4:return          
	}

	public static String getAudioMediaMimeType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = ((String) (Util.split(s, ",")));
	//    4    6:aload_0         
	//    5    7:ldc1            #216 <String ",">
	//    6    9:invokestatic    #222 <Method String[] Util.split(String, String)>
	//    7   12:astore_0        
		int j = s.length;
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   16:iconst_0        
	//*  12   17:istore_1        
	//*  13   18:iload_1         
	//*  14   19:iload_2         
	//*  15   20:icmpge          50
		{
			String s1 = getMediaMimeType(((String) (s[i])));
	//   16   23:aload_0         
	//   17   24:iload_1         
	//   18   25:aaload          
	//   19   26:invokestatic    #225 <Method String getMediaMimeType(String)>
	//   20   29:astore_3        
			if(s1 != null && isAudio(s1))
	//*  21   30:aload_3         
	//*  22   31:ifnull          43
	//*  23   34:aload_3         
	//*  24   35:invokestatic    #229 <Method boolean isAudio(String)>
	//*  25   38:ifeq            43
				return s1;
	//   26   41:aload_3         
	//   27   42:areturn         
		}

	//   28   43:iload_1         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_1        
	//*  32   47:goto            18
		return null;
	//   33   50:aconst_null     
	//   34   51:areturn         
	}

	private static String getCustomMimeTypeForCodec(String s)
	{
		int j = customMimeTypes.size();
	//    0    0:getstatic       #209 <Field ArrayList customMimeTypes>
	//    1    3:invokevirtual   #236 <Method int ArrayList.size()>
	//    2    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:iload_2         
	//*   7   11:icmpge          48
		{
			CustomMimeType custommimetype = (CustomMimeType)customMimeTypes.get(i);
	//    8   14:getstatic       #209 <Field ArrayList customMimeTypes>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #240 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #6   <Class MimeTypes$CustomMimeType>
	//   12   24:astore_3        
			if(s.startsWith(custommimetype.codecPrefix))
	//*  13   25:aload_0         
	//*  14   26:aload_3         
	//*  15   27:getfield        #243 <Field String MimeTypes$CustomMimeType.codecPrefix>
	//*  16   30:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//*  17   33:ifeq            41
				return custommimetype.mimeType;
	//   18   36:aload_3         
	//   19   37:getfield        #251 <Field String MimeTypes$CustomMimeType.mimeType>
	//   20   40:areturn         
		}

	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_1        
	//*  25   45:goto            9
		return null;
	//   26   48:aconst_null     
	//   27   49:areturn         
	}

	public static int getEncoding(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    6: default 64
	//	               -2123537834: 137
	//	               -1095064472: 123
	//	               187078296: 109
	//	               1504578661: 95
	//	               1505942594: 81
	//	               1556697186: 67
	//*   3   64:goto            151
			case 1556697186: 
				if(s.equals("audio/true-hd"))
	//*   4   67:aload_0         
	//*   5   68:ldc1            #134 <String "audio/true-hd">
	//*   6   70:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*   7   73:ifeq            151
				{
					byte0 = 5;
	//    8   76:iconst_5        
	//    9   77:istore_1        
					break label0;
	//   10   78:goto            153
				}
				break;

			case 1505942594: 
				if(!s.equals("audio/vnd.dts.hd"))
					break;
	//   11   81:aload_0         
	//   12   82:ldc1            #98  <String "audio/vnd.dts.hd">
	//   13   84:invokevirtual   #260 <Method boolean String.equals(Object)>
	//   14   87:ifeq            151
				byte0 = 4;
	//   15   90:iconst_4        
	//   16   91:istore_1        
				break label0;
	//   17   92:goto            153

			case 1504578661: 
				if(!s.equals("audio/eac3"))
					break;
	//   18   95:aload_0         
	//   19   96:ldc1            #101 <String "audio/eac3">
	//   20   98:invokevirtual   #260 <Method boolean String.equals(Object)>
	//   21  101:ifeq            151
				byte0 = 1;
	//   22  104:iconst_1        
	//   23  105:istore_1        
				break label0;
	//   24  106:goto            153

			case 187078296: 
				if(!s.equals("audio/ac3"))
					break;
	//   25  109:aload_0         
	//   26  110:ldc1            #77  <String "audio/ac3">
	//   27  112:invokevirtual   #260 <Method boolean String.equals(Object)>
	//   28  115:ifeq            151
				byte0 = 0;
	//   29  118:iconst_0        
	//   30  119:istore_1        
				break label0;
	//   31  120:goto            153

			case -1095064472: 
				if(!s.equals("audio/vnd.dts"))
					break;
	//   32  123:aload_0         
	//   33  124:ldc1            #92  <String "audio/vnd.dts">
	//   34  126:invokevirtual   #260 <Method boolean String.equals(Object)>
	//   35  129:ifeq            151
				byte0 = 3;
	//   36  132:iconst_3        
	//   37  133:istore_1        
				break label0;
	//   38  134:goto            153

			case -2123537834: 
				if(!s.equals("audio/eac3-joc"))
					break;
	//   39  137:aload_0         
	//   40  138:ldc1            #104 <String "audio/eac3-joc">
	//   41  140:invokevirtual   #260 <Method boolean String.equals(Object)>
	//   42  143:ifeq            151
				byte0 = 2;
	//   43  146:iconst_2        
	//   44  147:istore_1        
				break label0;
	//   45  148:goto            153
			}
			byte0 = -1;
	//   46  151:iconst_m1       
	//   47  152:istore_1        
		}
		switch(byte0)
	//*  48  153:iload_1         
		{
	//*  49  154:tableswitch     0 5: default 192
	//	               0 206
	//	               1 203
	//	               2 203
	//	               3 200
	//	               4 197
	//	               5 194
		default:
			return 0;
	//   50  192:iconst_0        
	//   51  193:ireturn         

		case 5: // '\005'
			return 14;
	//   52  194:bipush          14
	//   53  196:ireturn         

		case 4: // '\004'
			return 8;
	//   54  197:bipush          8
	//   55  199:ireturn         

		case 3: // '\003'
			return 7;
	//   56  200:bipush          7
	//   57  202:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return 6;
	//   58  203:bipush          6
	//   59  205:ireturn         

		case 0: // '\0'
			return 5;
	//   60  206:iconst_5        
	//   61  207:ireturn         
		}
	}

	public static String getMediaMimeType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #266 <Method String String.trim()>
	//    6   10:astore_0        
		if(!s.startsWith("avc1") && !s.startsWith("avc3")) goto _L2; else goto _L1
	//    7   11:aload_0         
	//    8   12:ldc2            #268 <String "avc1">
	//    9   15:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   10   18:ifne            328
	//   11   21:aload_0         
	//   12   22:ldc2            #270 <String "avc3">
	//   13   25:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   14   28:ifeq            34
	//*  15   31:goto            328
_L2:
		if(!s.startsWith("hev1") && !s.startsWith("hvc1")) goto _L4; else goto _L3
	//   16   34:aload_0         
	//   17   35:ldc2            #272 <String "hev1">
	//   18   38:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   19   41:ifne            325
	//   20   44:aload_0         
	//   21   45:ldc2            #274 <String "hvc1">
	//   22   48:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   23   51:ifeq            57
	//*  24   54:goto            325
_L4:
		if(!s.startsWith("vp9") && !s.startsWith("vp09")) goto _L6; else goto _L5
	//   25   57:aload_0         
	//   26   58:ldc2            #276 <String "vp9">
	//   27   61:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   28   64:ifne            322
	//   29   67:aload_0         
	//   30   68:ldc2            #278 <String "vp09">
	//   31   71:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   32   74:ifeq            80
	//*  33   77:goto            322
_L6:
		if(!s.startsWith("vp8") && !s.startsWith("vp08")) goto _L8; else goto _L7
	//   34   80:aload_0         
	//   35   81:ldc2            #280 <String "vp8">
	//   36   84:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   37   87:ifne            319
	//   38   90:aload_0         
	//   39   91:ldc2            #282 <String "vp08">
	//   40   94:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   41   97:ifeq            103
	//*  42  100:goto            319
_L8:
		if(!s.startsWith("mp4a")) goto _L10; else goto _L9
	//   43  103:aload_0         
	//   44  104:ldc2            #284 <String "mp4a">
	//   45  107:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   46  110:ifeq            171
_L9:
		if(!s.startsWith("mp4a.")) goto _L12; else goto _L11
	//   47  113:aload_0         
	//   48  114:ldc2            #286 <String "mp4a.">
	//   49  117:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//   50  120:ifeq            158
_L11:
		s = s.substring(5);
	//   51  123:aload_0         
	//   52  124:iconst_5        
	//   53  125:invokevirtual   #290 <Method String String.substring(int)>
	//   54  128:astore_0        
		if(s.length() < 2) goto _L12; else goto _L13
	//   55  129:aload_0         
	//   56  130:invokevirtual   #293 <Method int String.length()>
	//   57  133:iconst_2        
	//   58  134:icmplt          158
_L13:
		s = getMimeTypeFromMp4ObjectType(Integer.parseInt(Util.toUpperInvariant(s.substring(0, 2)), 16));
	//   59  137:aload_0         
	//   60  138:iconst_0        
	//   61  139:iconst_2        
	//   62  140:invokevirtual   #296 <Method String String.substring(int, int)>
	//   63  143:invokestatic    #299 <Method String Util.toUpperInvariant(String)>
	//   64  146:bipush          16
	//   65  148:invokestatic    #305 <Method int Integer.parseInt(String, int)>
	//   66  151:invokestatic    #308 <Method String getMimeTypeFromMp4ObjectType(int)>
	//   67  154:astore_0        
		  goto _L14
	//*  68  155:goto            160
_L12:
		s = null;
	//   69  158:aconst_null     
	//   70  159:astore_0        
_L14:
		String s1 = s;
	//   71  160:aload_0         
	//   72  161:astore_1        
		if(s == null)
	//*  73  162:aload_0         
	//*  74  163:ifnonnull       169
			s1 = "audio/mp4a-latm";
	//   75  166:ldc1            #74  <String "audio/mp4a-latm">
	//   76  168:astore_1        
		return s1;
	//   77  169:aload_1         
	//   78  170:areturn         
_L10:
		if(!s.startsWith("ac-3") && !s.startsWith("dac3"))
	//*  79  171:aload_0         
	//*  80  172:ldc2            #310 <String "ac-3">
	//*  81  175:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//*  82  178:ifne            316
	//*  83  181:aload_0         
	//*  84  182:ldc2            #312 <String "dac3">
	//*  85  185:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//*  86  188:ifeq            194
	//*  87  191:goto            316
		{
			if(!s.startsWith("ec-3") && !s.startsWith("dec3"))
	//*  88  194:aload_0         
	//*  89  195:ldc2            #314 <String "ec-3">
	//*  90  198:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//*  91  201:ifne            313
	//*  92  204:aload_0         
	//*  93  205:ldc2            #316 <String "dec3">
	//*  94  208:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//*  95  211:ifeq            217
	//*  96  214:goto            313
			{
				if(s.startsWith("ec+3"))
	//*  97  217:aload_0         
	//*  98  218:ldc2            #318 <String "ec+3">
	//*  99  221:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 100  224:ifeq            230
					return "audio/eac3-joc";
	//  101  227:ldc1            #104 <String "audio/eac3-joc">
	//  102  229:areturn         
				if(!s.startsWith("dtsc") && !s.startsWith("dtse"))
	//* 103  230:aload_0         
	//* 104  231:ldc2            #320 <String "dtsc">
	//* 105  234:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 106  237:ifne            310
	//* 107  240:aload_0         
	//* 108  241:ldc2            #322 <String "dtse">
	//* 109  244:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 110  247:ifeq            253
	//* 111  250:goto            310
				{
					if(!s.startsWith("dtsh") && !s.startsWith("dtsl"))
	//* 112  253:aload_0         
	//* 113  254:ldc2            #324 <String "dtsh">
	//* 114  257:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 115  260:ifne            307
	//* 116  263:aload_0         
	//* 117  264:ldc2            #326 <String "dtsl">
	//* 118  267:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 119  270:ifeq            276
	//* 120  273:goto            307
					{
						if(s.startsWith("opus"))
	//* 121  276:aload_0         
	//* 122  277:ldc2            #328 <String "opus">
	//* 123  280:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 124  283:ifeq            289
							return "audio/opus";
	//  125  286:ldc1            #128 <String "audio/opus">
	//  126  288:areturn         
						if(s.startsWith("vorbis"))
	//* 127  289:aload_0         
	//* 128  290:ldc2            #330 <String "vorbis">
	//* 129  293:invokevirtual   #248 <Method boolean String.startsWith(String)>
	//* 130  296:ifeq            302
							return "audio/vorbis";
	//  131  299:ldc1            #140 <String "audio/vorbis">
	//  132  301:areturn         
						else
							return getCustomMimeTypeForCodec(s);
	//  133  302:aload_0         
	//  134  303:invokestatic    #332 <Method String getCustomMimeTypeForCodec(String)>
	//  135  306:areturn         
					} else
					{
						return "audio/vnd.dts.hd";
	//  136  307:ldc1            #98  <String "audio/vnd.dts.hd">
	//  137  309:areturn         
					}
				} else
				{
					return "audio/vnd.dts";
	//  138  310:ldc1            #92  <String "audio/vnd.dts">
	//  139  312:areturn         
				}
			} else
			{
				return "audio/eac3";
	//  140  313:ldc1            #101 <String "audio/eac3">
	//  141  315:areturn         
			}
		} else
		{
			return "audio/ac3";
	//  142  316:ldc1            #77  <String "audio/ac3">
	//  143  318:areturn         
		}
_L7:
		return "video/x-vnd.on2.vp8";
	//  144  319:ldc1            #191 <String "video/x-vnd.on2.vp8">
	//  145  321:areturn         
_L5:
		return "video/x-vnd.on2.vp9";
	//  146  322:ldc1            #194 <String "video/x-vnd.on2.vp9">
	//  147  324:areturn         
_L3:
		return "video/hevc";
	//  148  325:ldc1            #170 <String "video/hevc">
	//  149  327:areturn         
_L1:
		return "video/avc";
	//  150  328:ldc1            #167 <String "video/avc">
	//  151  330:areturn         
		s;
	//  152  331:astore_0        
		if(true) goto _L12; else goto _L15
_L15:
	//* 153  332:goto            158
	}

	public static String getMimeTypeFromMp4ObjectType(int i)
	{
		if(i != 35)
	//*   0    0:iload_0         
	//*   1    1:bipush          35
	//*   2    3:icmpeq          213
		{
			if(i != 64)
	//*   3    6:iload_0         
	//*   4    7:bipush          64
	//*   5    9:icmpeq          210
				if(i != 163)
	//*   6   12:iload_0         
	//*   7   13:sipush          163
	//*   8   16:icmpeq          207
				{
					if(i != 177)
	//*   9   19:iload_0         
	//*  10   20:sipush          177
	//*  11   23:icmpeq          204
						switch(i)
	//*  12   26:iload_0         
						{
	//*  13   27:tableswitch     32 33: default 48
	//	               32 201
	//	               33 198
						default:
							switch(i)
	//*  14   48:iload_0         
							{
	//*  15   49:tableswitch     96 107: default 112
	//	               96 195
	//	               97 195
	//	               98 195
	//	               99 195
	//	               100 195
	//	               101 195
	//	               102 210
	//	               103 210
	//	               104 210
	//	               105 192
	//	               106 189
	//	               107 192
							default:
								switch(i)
	//*  16  112:iload_0         
								{
	//*  17  113:tableswitch     165 166: default 136
	//	               165 186
	//	               166 183
								default:
									switch(i)
	//*  18  136:iload_0         
									{
	//*  19  137:tableswitch     169 173: default 172
	//	               169 180
	//	               170 177
	//	               171 177
	//	               172 180
	//	               173 174
									default:
										return null;
	//   20  172:aconst_null     
	//   21  173:areturn         

									case 173: 
										return "audio/opus";
	//   22  174:ldc1            #128 <String "audio/opus">
	//   23  176:areturn         

									case 170: 
									case 171: 
										return "audio/vnd.dts.hd";
	//   24  177:ldc1            #98  <String "audio/vnd.dts.hd">
	//   25  179:areturn         

									case 169: 
									case 172: 
										return "audio/vnd.dts";
	//   26  180:ldc1            #92  <String "audio/vnd.dts">
	//   27  182:areturn         
									}

								case 166: 
									return "audio/eac3";
	//   28  183:ldc1            #101 <String "audio/eac3">
	//   29  185:areturn         

								case 165: 
									return "audio/ac3";
	//   30  186:ldc1            #77  <String "audio/ac3">
	//   31  188:areturn         
								}

							case 106: // 'j'
								return "video/mpeg";
	//   32  189:ldc1            #179 <String "video/mpeg">
	//   33  191:areturn         

							case 105: // 'i'
							case 107: // 'k'
								return "audio/mpeg";
	//   34  192:ldc1            #116 <String "audio/mpeg">
	//   35  194:areturn         

							case 96: // '`'
							case 97: // 'a'
							case 98: // 'b'
							case 99: // 'c'
							case 100: // 'd'
							case 101: // 'e'
								return "video/mpeg2";
	//   36  195:ldc1            #182 <String "video/mpeg2">
	//   37  197:areturn         

							case 102: // 'f'
							case 103: // 'g'
							case 104: // 'h'
								break;
							}
							break;

						case 33: // '!'
							return "video/avc";
	//   38  198:ldc1            #167 <String "video/avc">
	//   39  200:areturn         

						case 32: // ' '
							return "video/mp4v-es";
	//   40  201:ldc1            #176 <String "video/mp4v-es">
	//   41  203:areturn         
						}
					else
						return "video/x-vnd.on2.vp9";
	//   42  204:ldc1            #194 <String "video/x-vnd.on2.vp9">
	//   43  206:areturn         
				} else
				{
					return "video/wvc1";
	//   44  207:ldc1            #188 <String "video/wvc1">
	//   45  209:areturn         
				}
			return "audio/mp4a-latm";
	//   46  210:ldc1            #74  <String "audio/mp4a-latm">
	//   47  212:areturn         
		} else
		{
			return "video/hevc";
	//   48  213:ldc1            #170 <String "video/hevc">
	//   49  215:areturn         
		}
	}

	private static String getTopLevelType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = s.indexOf('/');
	//    4    6:aload_0         
	//    5    7:bipush          47
	//    6    9:invokevirtual   #337 <Method int String.indexOf(int)>
	//    7   12:istore_1        
		if(i == -1)
	//*   8   13:iload_1         
	//*   9   14:iconst_m1       
	//*  10   15:icmpne          52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   18:new             #339 <Class StringBuilder>
	//   12   21:dup             
	//   13   22:invokespecial   #340 <Method void StringBuilder()>
	//   14   25:astore_2        
			stringbuilder.append("Invalid mime type: ");
	//   15   26:aload_2         
	//   16   27:ldc2            #342 <String "Invalid mime type: ">
	//   17   30:invokevirtual   #346 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(s);
	//   19   34:aload_2         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #346 <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   40:new             #348 <Class IllegalArgumentException>
	//   24   43:dup             
	//   25   44:aload_2         
	//   26   45:invokevirtual   #351 <Method String StringBuilder.toString()>
	//   27   48:invokespecial   #354 <Method void IllegalArgumentException(String)>
	//   28   51:athrow          
		} else
		{
			return s.substring(0, i);
	//   29   52:aload_0         
	//   30   53:iconst_0        
	//   31   54:iload_1         
	//   32   55:invokevirtual   #296 <Method String String.substring(int, int)>
	//   33   58:areturn         
		}
	}

	public static int getTrackType(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #361 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		if(isAudio(s))
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #229 <Method boolean isAudio(String)>
	//*   7   13:ifeq            18
			return 1;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(isVideo(s))
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #364 <Method boolean isVideo(String)>
	//*  12   22:ifeq            27
			return 2;
	//   13   25:iconst_2        
	//   14   26:ireturn         
		if(!isText(s) && !"application/cea-608".equals(((Object) (s))) && !"application/cea-708".equals(((Object) (s))) && !"application/x-mp4-cea-608".equals(((Object) (s))) && !"application/x-subrip".equals(((Object) (s))) && !"application/ttml+xml".equals(((Object) (s))) && !"application/x-quicktime-tx3g".equals(((Object) (s))) && !"application/x-mp4-vtt".equals(((Object) (s))) && !"application/x-rawcc".equals(((Object) (s))) && !"application/vobsub".equals(((Object) (s))) && !"application/pgs".equals(((Object) (s))) && !"application/dvbsubs".equals(((Object) (s))))
	//*  15   27:aload_0         
	//*  16   28:invokestatic    #367 <Method boolean isText(String)>
	//*  17   31:ifne            182
	//*  18   34:ldc1            #14  <String "application/cea-608">
	//*  19   36:aload_0         
	//*  20   37:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  21   40:ifne            182
	//*  22   43:ldc1            #17  <String "application/cea-708">
	//*  23   45:aload_0         
	//*  24   46:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  25   49:ifne            182
	//*  26   52:ldc1            #38  <String "application/x-mp4-cea-608">
	//*  27   54:aload_0         
	//*  28   55:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  29   58:ifne            182
	//*  30   61:ldc1            #59  <String "application/x-subrip">
	//*  31   63:aload_0         
	//*  32   64:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  33   67:ifne            182
	//*  34   70:ldc1            #62  <String "application/ttml+xml">
	//*  35   72:aload_0         
	//*  36   73:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  37   76:ifne            182
	//*  38   79:ldc1            #65  <String "application/x-quicktime-tx3g">
	//*  39   81:aload_0         
	//*  40   82:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  41   85:ifne            182
	//*  42   88:ldc1            #41  <String "application/x-mp4-vtt">
	//*  43   90:aload_0         
	//*  44   91:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  45   94:ifne            182
	//*  46   97:ldc1            #50  <String "application/x-rawcc">
	//*  47   99:aload_0         
	//*  48  100:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  49  103:ifne            182
	//*  50  106:ldc1            #68  <String "application/vobsub">
	//*  51  108:aload_0         
	//*  52  109:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  53  112:ifne            182
	//*  54  115:ldc1            #47  <String "application/pgs">
	//*  55  117:aload_0         
	//*  56  118:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  57  121:ifne            182
	//*  58  124:ldc1            #20  <String "application/dvbsubs">
	//*  59  126:aload_0         
	//*  60  127:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  61  130:ifeq            136
	//*  62  133:goto            182
		{
			if(!"application/id3".equals(((Object) (s))) && !"application/x-emsg".equals(((Object) (s))) && !"application/x-scte35".equals(((Object) (s))) && !"application/x-camera-motion".equals(((Object) (s))))
	//*  63  136:ldc1            #29  <String "application/id3">
	//*  64  138:aload_0         
	//*  65  139:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  66  142:ifne            180
	//*  67  145:ldc1            #23  <String "application/x-emsg">
	//*  68  147:aload_0         
	//*  69  148:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  70  151:ifne            180
	//*  71  154:ldc1            #53  <String "application/x-scte35">
	//*  72  156:aload_0         
	//*  73  157:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  74  160:ifne            180
	//*  75  163:ldc1            #11  <String "application/x-camera-motion">
	//*  76  165:aload_0         
	//*  77  166:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  78  169:ifeq            175
	//*  79  172:goto            180
				return getTrackTypeForCustomMimeType(s);
	//   80  175:aload_0         
	//   81  176:invokestatic    #370 <Method int getTrackTypeForCustomMimeType(String)>
	//   82  179:ireturn         
			else
				return 4;
	//   83  180:iconst_4        
	//   84  181:ireturn         
		} else
		{
			return 3;
	//   85  182:iconst_3        
	//   86  183:ireturn         
		}
	}

	private static int getTrackTypeForCustomMimeType(String s)
	{
		int j = customMimeTypes.size();
	//    0    0:getstatic       #209 <Field ArrayList customMimeTypes>
	//    1    3:invokevirtual   #236 <Method int ArrayList.size()>
	//    2    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:iload_2         
	//*   7   11:icmpge          48
		{
			CustomMimeType custommimetype = (CustomMimeType)customMimeTypes.get(i);
	//    8   14:getstatic       #209 <Field ArrayList customMimeTypes>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #240 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #6   <Class MimeTypes$CustomMimeType>
	//   12   24:astore_3        
			if(s.equals(((Object) (custommimetype.mimeType))))
	//*  13   25:aload_0         
	//*  14   26:aload_3         
	//*  15   27:getfield        #251 <Field String MimeTypes$CustomMimeType.mimeType>
	//*  16   30:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  17   33:ifeq            41
				return custommimetype.trackType;
	//   18   36:aload_3         
	//   19   37:getfield        #374 <Field int MimeTypes$CustomMimeType.trackType>
	//   20   40:ireturn         
		}

	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_1        
	//*  25   45:goto            9
		return -1;
	//   26   48:iconst_m1       
	//   27   49:ireturn         
	}

	public static int getTrackTypeOfCodec(String s)
	{
		return getTrackType(getMediaMimeType(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #225 <Method String getMediaMimeType(String)>
	//    2    4:invokestatic    #377 <Method int getTrackType(String)>
	//    3    7:ireturn         
	}

	public static String getVideoMediaMimeType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = ((String) (Util.split(s, ",")));
	//    4    6:aload_0         
	//    5    7:ldc1            #216 <String ",">
	//    6    9:invokestatic    #222 <Method String[] Util.split(String, String)>
	//    7   12:astore_0        
		int j = s.length;
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   16:iconst_0        
	//*  12   17:istore_1        
	//*  13   18:iload_1         
	//*  14   19:iload_2         
	//*  15   20:icmpge          50
		{
			String s1 = getMediaMimeType(((String) (s[i])));
	//   16   23:aload_0         
	//   17   24:iload_1         
	//   18   25:aaload          
	//   19   26:invokestatic    #225 <Method String getMediaMimeType(String)>
	//   20   29:astore_3        
			if(s1 != null && isVideo(s1))
	//*  21   30:aload_3         
	//*  22   31:ifnull          43
	//*  23   34:aload_3         
	//*  24   35:invokestatic    #364 <Method boolean isVideo(String)>
	//*  25   38:ifeq            43
				return s1;
	//   26   41:aload_3         
	//   27   42:areturn         
		}

	//   28   43:iload_1         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_1        
	//*  32   47:goto            18
		return null;
	//   33   50:aconst_null     
	//   34   51:areturn         
	}

	public static boolean isApplication(String s)
	{
		return "application".equals(((Object) (getTopLevelType(s))));
	//    0    0:ldc1            #146 <String "application">
	//    1    2:aload_0         
	//    2    3:invokestatic    #381 <Method String getTopLevelType(String)>
	//    3    6:invokevirtual   #260 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean isAudio(String s)
	{
		return "audio".equals(((Object) (getTopLevelType(s))));
	//    0    0:ldc1            #149 <String "audio">
	//    1    2:aload_0         
	//    2    3:invokestatic    #381 <Method String getTopLevelType(String)>
	//    3    6:invokevirtual   #260 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean isText(String s)
	{
		return "text".equals(((Object) (getTopLevelType(s))));
	//    0    0:ldc1            #152 <String "text">
	//    1    2:aload_0         
	//    2    3:invokestatic    #381 <Method String getTopLevelType(String)>
	//    3    6:invokevirtual   #260 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean isVideo(String s)
	{
		return "video".equals(((Object) (getTopLevelType(s))));
	//    0    0:ldc1            #155 <String "video">
	//    1    2:aload_0         
	//    2    3:invokestatic    #381 <Method String getTopLevelType(String)>
	//    3    6:invokevirtual   #260 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static void registerCustomMimeType(String s, String s1, int i)
	{
		s1 = ((String) (new CustomMimeType(s, s1, i)));
	//    0    0:new             #6   <Class MimeTypes$CustomMimeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #385 <Method void MimeTypes$CustomMimeType(String, String, int)>
	//    6   10:astore_1        
		int j = customMimeTypes.size();
	//    7   11:getstatic       #209 <Field ArrayList customMimeTypes>
	//    8   14:invokevirtual   #236 <Method int ArrayList.size()>
	//    9   17:istore_3        
		i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		do
		{
			if(i >= j)
				break;
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:icmpge          63
			if(s.equals(((Object) (((CustomMimeType)customMimeTypes.get(i)).mimeType))))
	//*  15   25:aload_0         
	//*  16   26:getstatic       #209 <Field ArrayList customMimeTypes>
	//*  17   29:iload_2         
	//*  18   30:invokevirtual   #240 <Method Object ArrayList.get(int)>
	//*  19   33:checkcast       #6   <Class MimeTypes$CustomMimeType>
	//*  20   36:getfield        #251 <Field String MimeTypes$CustomMimeType.mimeType>
	//*  21   39:invokevirtual   #260 <Method boolean String.equals(Object)>
	//*  22   42:ifeq            56
			{
				customMimeTypes.remove(i);
	//   23   45:getstatic       #209 <Field ArrayList customMimeTypes>
	//   24   48:iload_2         
	//   25   49:invokevirtual   #388 <Method Object ArrayList.remove(int)>
	//   26   52:pop             
				break;
	//   27   53:goto            63
			}
			i++;
	//   28   56:iload_2         
	//   29   57:iconst_1        
	//   30   58:iadd            
	//   31   59:istore_2        
		} while(true);
	//   32   60:goto            20
		customMimeTypes.add(((Object) (s1)));
	//   33   63:getstatic       #209 <Field ArrayList customMimeTypes>
	//   34   66:aload_1         
	//   35   67:invokevirtual   #391 <Method boolean ArrayList.add(Object)>
	//   36   70:pop             
	//   37   71:return          
	}

	public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
	public static final String APPLICATION_CEA608 = "application/cea-608";
	public static final String APPLICATION_CEA708 = "application/cea-708";
	public static final String APPLICATION_DVBSUBS = "application/dvbsubs";
	public static final String APPLICATION_EMSG = "application/x-emsg";
	public static final String APPLICATION_EXIF = "application/x-exif";
	public static final String APPLICATION_ID3 = "application/id3";
	public static final String APPLICATION_M3U8 = "application/x-mpegURL";
	public static final String APPLICATION_MP4 = "application/mp4";
	public static final String APPLICATION_MP4CEA608 = "application/x-mp4-cea-608";
	public static final String APPLICATION_MP4VTT = "application/x-mp4-vtt";
	public static final String APPLICATION_MPD = "application/dash+xml";
	public static final String APPLICATION_PGS = "application/pgs";
	public static final String APPLICATION_RAWCC = "application/x-rawcc";
	public static final String APPLICATION_SCTE35 = "application/x-scte35";
	public static final String APPLICATION_SS = "application/vnd.ms-sstr+xml";
	public static final String APPLICATION_SUBRIP = "application/x-subrip";
	public static final String APPLICATION_TTML = "application/ttml+xml";
	public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
	public static final String APPLICATION_VOBSUB = "application/vobsub";
	public static final String APPLICATION_WEBM = "application/webm";
	public static final String AUDIO_AAC = "audio/mp4a-latm";
	public static final String AUDIO_AC3 = "audio/ac3";
	public static final String AUDIO_ALAC = "audio/alac";
	public static final String AUDIO_ALAW = "audio/g711-alaw";
	public static final String AUDIO_AMR_NB = "audio/3gpp";
	public static final String AUDIO_AMR_WB = "audio/amr-wb";
	public static final String AUDIO_DTS = "audio/vnd.dts";
	public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
	public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
	public static final String AUDIO_E_AC3 = "audio/eac3";
	public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";
	public static final String AUDIO_FLAC = "audio/flac";
	public static final String AUDIO_MLAW = "audio/g711-mlaw";
	public static final String AUDIO_MP4 = "audio/mp4";
	public static final String AUDIO_MPEG = "audio/mpeg";
	public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
	public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
	public static final String AUDIO_MSGSM = "audio/gsm";
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
	public static final String TEXT_SSA = "text/x-ssa";
	public static final String TEXT_VTT = "text/vtt";
	public static final String VIDEO_H263 = "video/3gpp";
	public static final String VIDEO_H264 = "video/avc";
	public static final String VIDEO_H265 = "video/hevc";
	public static final String VIDEO_MP4 = "video/mp4";
	public static final String VIDEO_MP4V = "video/mp4v-es";
	public static final String VIDEO_MPEG = "video/mpeg";
	public static final String VIDEO_MPEG2 = "video/mpeg2";
	public static final String VIDEO_UNKNOWN = "video/x-unknown";
	public static final String VIDEO_VC1 = "video/wvc1";
	public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
	public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
	public static final String VIDEO_WEBM = "video/webm";
	private static final ArrayList customMimeTypes = new ArrayList();

	static 
	{
	//    0    0:new             #204 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #207 <Method void ArrayList()>
	//    3    7:putstatic       #209 <Field ArrayList customMimeTypes>
	//*   4   10:return          
	}
}
