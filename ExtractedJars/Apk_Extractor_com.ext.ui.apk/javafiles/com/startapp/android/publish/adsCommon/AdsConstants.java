// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.common.metaData.MetaData;

public class AdsConstants
{
	public static final class ApiType extends Enum
	{

		public static ApiType valueOf(String s)
		{
			return (ApiType)Enum.valueOf(com/startapp/android/publish/adsCommon/AdsConstants$ApiType, s);
		//    0    0:ldc1            #2   <Class AdsConstants$ApiType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AdsConstants$ApiType>
		//    4    9:areturn         
		}

		public static ApiType[] values()
		{
			return (ApiType[])((ApiType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field AdsConstants$ApiType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.AdsConstants$ApiType_3B_.clone()>
		//    2    6:checkcast       #46  <Class AdsConstants$ApiType[]>
		//    3    9:areturn         
		}

		private static final ApiType $VALUES[];
		public static final ApiType DOWNLOAD;
		public static final ApiType HTML;
		public static final ApiType JSON;
		public static final ApiType METADATA;

		static 
		{
			HTML = new ApiType("HTML", 0);
		//    0    0:new             #2   <Class AdsConstants$ApiType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "HTML">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
		//    5   10:putstatic       #24  <Field AdsConstants$ApiType HTML>
			JSON = new ApiType("JSON", 1);
		//    6   13:new             #2   <Class AdsConstants$ApiType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "JSON">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
		//   11   23:putstatic       #27  <Field AdsConstants$ApiType JSON>
			METADATA = new ApiType("METADATA", 2);
		//   12   26:new             #2   <Class AdsConstants$ApiType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "METADATA">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
		//   17   36:putstatic       #30  <Field AdsConstants$ApiType METADATA>
			DOWNLOAD = new ApiType("DOWNLOAD", 3);
		//   18   39:new             #2   <Class AdsConstants$ApiType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "DOWNLOAD">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void AdsConstants$ApiType(String, int)>
		//   23   49:putstatic       #33  <Field AdsConstants$ApiType DOWNLOAD>
			$VALUES = (new ApiType[] {
				HTML, JSON, METADATA, DOWNLOAD
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       ApiType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field AdsConstants$ApiType HTML>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field AdsConstants$ApiType JSON>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field AdsConstants$ApiType METADATA>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field AdsConstants$ApiType DOWNLOAD>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field AdsConstants$ApiType[] $VALUES>
		//*  43   83:return          
		}

		private ApiType(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public AdsConstants()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void Object()>
	//    2    4:return          
	}

	public static Boolean a()
	{
		return VIDEO_DEBUG;
	//    0    0:getstatic       #107 <Field Boolean VIDEO_DEBUG>
	//    1    3:areturn         
	}

	public static String a(ApiType apitype)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[ApiType.values().length];
			//    0    0:invokestatic    #18  <Method AdsConstants$ApiType[] AdsConstants$ApiType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[ApiType.HTML.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field AdsConstants$ApiType AdsConstants$ApiType.HTML>
			//    6   15:invokevirtual   #28  <Method int AdsConstants$ApiType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field AdsConstants$ApiType AdsConstants$ApiType.JSON>
			//*  11   26:invokevirtual   #28  <Method int AdsConstants$ApiType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field AdsConstants$ApiType AdsConstants$ApiType.METADATA>
			//*  16   37:invokevirtual   #28  <Method int AdsConstants$ApiType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field AdsConstants$ApiType AdsConstants$ApiType.DOWNLOAD>
			//*  21   48:invokevirtual   #28  <Method int AdsConstants$ApiType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
			//*  25   54:astore_0        
			//*  26   55:return          
			//*  27   56:astore_0        
			//*  28   57:goto            42
			//*  29   60:astore_0        
			//*  30   61:goto            31
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   64:astore_0        
				try
				{
					a[ApiType.JSON.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					a[ApiType.METADATA.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					a[ApiType.DOWNLOAD.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  32   65:goto            20
			}
		}

		_cls1.a[apitype.ordinal()];
	//    2    2:getstatic       #152 <Field int[] AdsConstants$1.a>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #156 <Method int AdsConstants$ApiType.ordinal()>
	//    5    9:iaload          
		JVM INSTR tableswitch 1 4: default 40
	//	               1 63
	//	               2 77
	//	               3 91
	//	               4 105;
	//    6   10:tableswitch     1 4: default 40
	//	               1 63
	//	               2 77
	//	               3 91
	//	               4 105
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		String s;
		s = null;
	//    7   40:aconst_null     
	//    8   41:astore_1        
		apitype = ((ApiType) (obj));
	//    9   42:aload_2         
	//   10   43:astore_0        
_L7:
		return (new StringBuilder()).append(((String) (apitype))).append(s).toString();
	//   11   44:new             #54  <Class StringBuilder>
	//   12   47:dup             
	//   13   48:invokespecial   #56  <Method void StringBuilder()>
	//   14   51:aload_0         
	//   15   52:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   55:aload_1         
	//   17   56:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   59:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   19   62:areturn         
_L2:
		s = c;
	//   20   63:getstatic       #74  <Field String c>
	//   21   66:astore_1        
		apitype = ((ApiType) (MetaData.getInstance().getAdPlatformHost()));
	//   22   67:invokestatic    #162 <Method MetaData MetaData.getInstance()>
	//   23   70:invokevirtual   #165 <Method String MetaData.getAdPlatformHost()>
	//   24   73:astore_0        
		continue; /* Loop/switch isn't completed */
	//   25   74:goto            44
_L3:
		s = b;
	//   26   77:getstatic       #69  <Field String b>
	//   27   80:astore_1        
		apitype = ((ApiType) (MetaData.getInstance().getAdPlatformHost()));
	//   28   81:invokestatic    #162 <Method MetaData MetaData.getInstance()>
	//   29   84:invokevirtual   #165 <Method String MetaData.getAdPlatformHost()>
	//   30   87:astore_0        
		continue; /* Loop/switch isn't completed */
	//   31   88:goto            44
_L4:
		s = e;
	//   32   91:getstatic       #84  <Field String e>
	//   33   94:astore_1        
		apitype = ((ApiType) (MetaData.getInstance().getMetaDataHost()));
	//   34   95:invokestatic    #162 <Method MetaData MetaData.getInstance()>
	//   35   98:invokevirtual   #168 <Method String MetaData.getMetaDataHost()>
	//   36  101:astore_0        
		continue; /* Loop/switch isn't completed */
	//   37  102:goto            44
_L5:
		s = d;
	//   38  105:getstatic       #82  <Field String d>
	//   39  108:astore_1        
		apitype = ((ApiType) (MetaData.getInstance().getAdPlatformHost()));
	//   40  109:invokestatic    #162 <Method MetaData MetaData.getInstance()>
	//   41  112:invokevirtual   #165 <Method String MetaData.getAdPlatformHost()>
	//   42  115:astore_0        
		if(true) goto _L7; else goto _L6
	//   43  116:goto            44
_L6:
	}

	public static final int AD_INFORMATION_EXTENDED_ID = 0x57f00002;
	public static final int AD_INFORMATION_ID = 0x57f00001;
	public static final Boolean FORCE_NATIVE_VIDEO_PLAYER = Boolean.valueOf(false);
	public static final int LIST_3D_CLOSE_BUTTON_ID = 0x57f00003;
	public static final String OVERRIDE_HOST = null;
	public static final Boolean OVERRIDE_NETWORK = Boolean.valueOf(false);
	public static final int SPLASH_NATIVE_MAIN_LAYOUT_ID = 0x57f00005;
	public static final int STARTAPP_AD_MAIN_LAYOUT_ID = 0x57f00000;
	public static final Boolean VIDEO_DEBUG = Boolean.valueOf(false);
	public static final String a = new String(new byte[] {
		103, 101, 116
	});
	public static final String b = (new StringBuilder()).append(a).append(new String(new byte[] {
		97, 100, 115
	})).toString();
	public static final String c = (new StringBuilder()).append(a).append(new String(new byte[] {
		104, 116, 109, 108, 97, 100
	})).toString();
	public static final String d = new String(new byte[] {
		116, 114, 97, 99, 107, 100, 111, 119, 110, 108, 
		111, 97, 100
	});
	public static final String e = (new StringBuilder()).append(a).append(new String(new byte[] {
		97, 100, 115, 109, 101, 116, 97, 100, 97, 116, 
		97
	})).toString();
	public static final String f = new String(new byte[] {
		104, 116, 116, 112, 115, 58, 47, 47, 105, 109, 
		112, 46, 115, 116, 97, 114, 116, 97, 112, 112, 
		115, 101, 114, 118, 105, 99, 101, 46, 99, 111, 
		109, 47, 116, 114, 97, 99, 107, 105, 110, 103, 
		47, 97, 100, 73, 109, 112, 114, 101, 115, 115, 
		105, 111, 110
	});
	public static final Boolean g = Boolean.valueOf(false);
	public static final String h = com.startapp.android.publish.adsCommon.Utils.i.b();
	public static final String i = com.startapp.android.publish.adsCommon.Utils.i.c();
	public static final String j = com.startapp.android.publish.adsCommon.Utils.i.d();
	public static final String k[] = {
		"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"
	};
	public static final String l[] = {
		"empty_star", "filled_star", "half_star"
	};

	static 
	{
	//    0    0:new             #43  <Class String>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:newarray        byte[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #44  <Int 103>
	//    7   11:bastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:ldc1            #45  <Int 101>
	//   11   16:bastore         
	//   12   17:dup             
	//   13   18:iconst_2        
	//   14   19:ldc1            #46  <Int 116>
	//   15   21:bastore         
	//   16   22:invokespecial   #50  <Method void String(byte[])>
	//   17   25:putstatic       #52  <Field String a>
	//   18   28:new             #54  <Class StringBuilder>
	//   19   31:dup             
	//   20   32:invokespecial   #56  <Method void StringBuilder()>
	//   21   35:getstatic       #52  <Field String a>
	//   22   38:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:new             #43  <Class String>
	//   24   44:dup             
	//   25   45:iconst_3        
	//   26   46:newarray        byte[]
	//   27   48:dup             
	//   28   49:iconst_0        
	//   29   50:ldc1            #61  <Int 97>
	//   30   52:bastore         
	//   31   53:dup             
	//   32   54:iconst_1        
	//   33   55:ldc1            #62  <Int 100>
	//   34   57:bastore         
	//   35   58:dup             
	//   36   59:iconst_2        
	//   37   60:ldc1            #63  <Int 115>
	//   38   62:bastore         
	//   39   63:invokespecial   #50  <Method void String(byte[])>
	//   40   66:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   41   69:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   42   72:putstatic       #69  <Field String b>
	//   43   75:new             #54  <Class StringBuilder>
	//   44   78:dup             
	//   45   79:invokespecial   #56  <Method void StringBuilder()>
	//   46   82:getstatic       #52  <Field String a>
	//   47   85:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   48   88:new             #43  <Class String>
	//   49   91:dup             
	//   50   92:bipush          6
	//   51   94:newarray        byte[]
	//   52   96:dup             
	//   53   97:iconst_0        
	//   54   98:ldc1            #70  <Int 104>
	//   55  100:bastore         
	//   56  101:dup             
	//   57  102:iconst_1        
	//   58  103:ldc1            #46  <Int 116>
	//   59  105:bastore         
	//   60  106:dup             
	//   61  107:iconst_2        
	//   62  108:ldc1            #71  <Int 109>
	//   63  110:bastore         
	//   64  111:dup             
	//   65  112:iconst_3        
	//   66  113:ldc1            #72  <Int 108>
	//   67  115:bastore         
	//   68  116:dup             
	//   69  117:iconst_4        
	//   70  118:ldc1            #61  <Int 97>
	//   71  120:bastore         
	//   72  121:dup             
	//   73  122:iconst_5        
	//   74  123:ldc1            #62  <Int 100>
	//   75  125:bastore         
	//   76  126:invokespecial   #50  <Method void String(byte[])>
	//   77  129:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   78  132:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   79  135:putstatic       #74  <Field String c>
	//   80  138:new             #43  <Class String>
	//   81  141:dup             
	//   82  142:bipush          13
	//   83  144:newarray        byte[]
	//   84  146:dup             
	//   85  147:iconst_0        
	//   86  148:ldc1            #46  <Int 116>
	//   87  150:bastore         
	//   88  151:dup             
	//   89  152:iconst_1        
	//   90  153:ldc1            #75  <Int 114>
	//   91  155:bastore         
	//   92  156:dup             
	//   93  157:iconst_2        
	//   94  158:ldc1            #61  <Int 97>
	//   95  160:bastore         
	//   96  161:dup             
	//   97  162:iconst_3        
	//   98  163:ldc1            #76  <Int 99>
	//   99  165:bastore         
	//  100  166:dup             
	//  101  167:iconst_4        
	//  102  168:ldc1            #77  <Int 107>
	//  103  170:bastore         
	//  104  171:dup             
	//  105  172:iconst_5        
	//  106  173:ldc1            #62  <Int 100>
	//  107  175:bastore         
	//  108  176:dup             
	//  109  177:bipush          6
	//  110  179:ldc1            #78  <Int 111>
	//  111  181:bastore         
	//  112  182:dup             
	//  113  183:bipush          7
	//  114  185:ldc1            #79  <Int 119>
	//  115  187:bastore         
	//  116  188:dup             
	//  117  189:bipush          8
	//  118  191:ldc1            #80  <Int 110>
	//  119  193:bastore         
	//  120  194:dup             
	//  121  195:bipush          9
	//  122  197:ldc1            #72  <Int 108>
	//  123  199:bastore         
	//  124  200:dup             
	//  125  201:bipush          10
	//  126  203:ldc1            #78  <Int 111>
	//  127  205:bastore         
	//  128  206:dup             
	//  129  207:bipush          11
	//  130  209:ldc1            #61  <Int 97>
	//  131  211:bastore         
	//  132  212:dup             
	//  133  213:bipush          12
	//  134  215:ldc1            #62  <Int 100>
	//  135  217:bastore         
	//  136  218:invokespecial   #50  <Method void String(byte[])>
	//  137  221:putstatic       #82  <Field String d>
	//  138  224:new             #54  <Class StringBuilder>
	//  139  227:dup             
	//  140  228:invokespecial   #56  <Method void StringBuilder()>
	//  141  231:getstatic       #52  <Field String a>
	//  142  234:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//  143  237:new             #43  <Class String>
	//  144  240:dup             
	//  145  241:bipush          11
	//  146  243:newarray        byte[]
	//  147  245:dup             
	//  148  246:iconst_0        
	//  149  247:ldc1            #61  <Int 97>
	//  150  249:bastore         
	//  151  250:dup             
	//  152  251:iconst_1        
	//  153  252:ldc1            #62  <Int 100>
	//  154  254:bastore         
	//  155  255:dup             
	//  156  256:iconst_2        
	//  157  257:ldc1            #63  <Int 115>
	//  158  259:bastore         
	//  159  260:dup             
	//  160  261:iconst_3        
	//  161  262:ldc1            #71  <Int 109>
	//  162  264:bastore         
	//  163  265:dup             
	//  164  266:iconst_4        
	//  165  267:ldc1            #45  <Int 101>
	//  166  269:bastore         
	//  167  270:dup             
	//  168  271:iconst_5        
	//  169  272:ldc1            #46  <Int 116>
	//  170  274:bastore         
	//  171  275:dup             
	//  172  276:bipush          6
	//  173  278:ldc1            #61  <Int 97>
	//  174  280:bastore         
	//  175  281:dup             
	//  176  282:bipush          7
	//  177  284:ldc1            #62  <Int 100>
	//  178  286:bastore         
	//  179  287:dup             
	//  180  288:bipush          8
	//  181  290:ldc1            #61  <Int 97>
	//  182  292:bastore         
	//  183  293:dup             
	//  184  294:bipush          9
	//  185  296:ldc1            #46  <Int 116>
	//  186  298:bastore         
	//  187  299:dup             
	//  188  300:bipush          10
	//  189  302:ldc1            #61  <Int 97>
	//  190  304:bastore         
	//  191  305:invokespecial   #50  <Method void String(byte[])>
	//  192  308:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//  193  311:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  194  314:putstatic       #84  <Field String e>
	//  195  317:new             #43  <Class String>
	//  196  320:dup             
	//  197  321:bipush          53
	//  198  323:newarray        byte[]
	//  199  325:dup             
	//  200  326:iconst_0        
	//  201  327:ldc1            #70  <Int 104>
	//  202  329:bastore         
	//  203  330:dup             
	//  204  331:iconst_1        
	//  205  332:ldc1            #46  <Int 116>
	//  206  334:bastore         
	//  207  335:dup             
	//  208  336:iconst_2        
	//  209  337:ldc1            #46  <Int 116>
	//  210  339:bastore         
	//  211  340:dup             
	//  212  341:iconst_3        
	//  213  342:ldc1            #85  <Int 112>
	//  214  344:bastore         
	//  215  345:dup             
	//  216  346:iconst_4        
	//  217  347:ldc1            #63  <Int 115>
	//  218  349:bastore         
	//  219  350:dup             
	//  220  351:iconst_5        
	//  221  352:ldc1            #86  <Int 58>
	//  222  354:bastore         
	//  223  355:dup             
	//  224  356:bipush          6
	//  225  358:ldc1            #87  <Int 47>
	//  226  360:bastore         
	//  227  361:dup             
	//  228  362:bipush          7
	//  229  364:ldc1            #87  <Int 47>
	//  230  366:bastore         
	//  231  367:dup             
	//  232  368:bipush          8
	//  233  370:ldc1            #88  <Int 105>
	//  234  372:bastore         
	//  235  373:dup             
	//  236  374:bipush          9
	//  237  376:ldc1            #71  <Int 109>
	//  238  378:bastore         
	//  239  379:dup             
	//  240  380:bipush          10
	//  241  382:ldc1            #85  <Int 112>
	//  242  384:bastore         
	//  243  385:dup             
	//  244  386:bipush          11
	//  245  388:ldc1            #89  <Int 46>
	//  246  390:bastore         
	//  247  391:dup             
	//  248  392:bipush          12
	//  249  394:ldc1            #63  <Int 115>
	//  250  396:bastore         
	//  251  397:dup             
	//  252  398:bipush          13
	//  253  400:ldc1            #46  <Int 116>
	//  254  402:bastore         
	//  255  403:dup             
	//  256  404:bipush          14
	//  257  406:ldc1            #61  <Int 97>
	//  258  408:bastore         
	//  259  409:dup             
	//  260  410:bipush          15
	//  261  412:ldc1            #75  <Int 114>
	//  262  414:bastore         
	//  263  415:dup             
	//  264  416:bipush          16
	//  265  418:ldc1            #46  <Int 116>
	//  266  420:bastore         
	//  267  421:dup             
	//  268  422:bipush          17
	//  269  424:ldc1            #61  <Int 97>
	//  270  426:bastore         
	//  271  427:dup             
	//  272  428:bipush          18
	//  273  430:ldc1            #85  <Int 112>
	//  274  432:bastore         
	//  275  433:dup             
	//  276  434:bipush          19
	//  277  436:ldc1            #85  <Int 112>
	//  278  438:bastore         
	//  279  439:dup             
	//  280  440:bipush          20
	//  281  442:ldc1            #63  <Int 115>
	//  282  444:bastore         
	//  283  445:dup             
	//  284  446:bipush          21
	//  285  448:ldc1            #45  <Int 101>
	//  286  450:bastore         
	//  287  451:dup             
	//  288  452:bipush          22
	//  289  454:ldc1            #75  <Int 114>
	//  290  456:bastore         
	//  291  457:dup             
	//  292  458:bipush          23
	//  293  460:ldc1            #90  <Int 118>
	//  294  462:bastore         
	//  295  463:dup             
	//  296  464:bipush          24
	//  297  466:ldc1            #88  <Int 105>
	//  298  468:bastore         
	//  299  469:dup             
	//  300  470:bipush          25
	//  301  472:ldc1            #76  <Int 99>
	//  302  474:bastore         
	//  303  475:dup             
	//  304  476:bipush          26
	//  305  478:ldc1            #45  <Int 101>
	//  306  480:bastore         
	//  307  481:dup             
	//  308  482:bipush          27
	//  309  484:ldc1            #89  <Int 46>
	//  310  486:bastore         
	//  311  487:dup             
	//  312  488:bipush          28
	//  313  490:ldc1            #76  <Int 99>
	//  314  492:bastore         
	//  315  493:dup             
	//  316  494:bipush          29
	//  317  496:ldc1            #78  <Int 111>
	//  318  498:bastore         
	//  319  499:dup             
	//  320  500:bipush          30
	//  321  502:ldc1            #71  <Int 109>
	//  322  504:bastore         
	//  323  505:dup             
	//  324  506:bipush          31
	//  325  508:ldc1            #87  <Int 47>
	//  326  510:bastore         
	//  327  511:dup             
	//  328  512:bipush          32
	//  329  514:ldc1            #46  <Int 116>
	//  330  516:bastore         
	//  331  517:dup             
	//  332  518:bipush          33
	//  333  520:ldc1            #75  <Int 114>
	//  334  522:bastore         
	//  335  523:dup             
	//  336  524:bipush          34
	//  337  526:ldc1            #61  <Int 97>
	//  338  528:bastore         
	//  339  529:dup             
	//  340  530:bipush          35
	//  341  532:ldc1            #76  <Int 99>
	//  342  534:bastore         
	//  343  535:dup             
	//  344  536:bipush          36
	//  345  538:ldc1            #77  <Int 107>
	//  346  540:bastore         
	//  347  541:dup             
	//  348  542:bipush          37
	//  349  544:ldc1            #88  <Int 105>
	//  350  546:bastore         
	//  351  547:dup             
	//  352  548:bipush          38
	//  353  550:ldc1            #80  <Int 110>
	//  354  552:bastore         
	//  355  553:dup             
	//  356  554:bipush          39
	//  357  556:ldc1            #44  <Int 103>
	//  358  558:bastore         
	//  359  559:dup             
	//  360  560:bipush          40
	//  361  562:ldc1            #87  <Int 47>
	//  362  564:bastore         
	//  363  565:dup             
	//  364  566:bipush          41
	//  365  568:ldc1            #61  <Int 97>
	//  366  570:bastore         
	//  367  571:dup             
	//  368  572:bipush          42
	//  369  574:ldc1            #62  <Int 100>
	//  370  576:bastore         
	//  371  577:dup             
	//  372  578:bipush          43
	//  373  580:ldc1            #91  <Int 73>
	//  374  582:bastore         
	//  375  583:dup             
	//  376  584:bipush          44
	//  377  586:ldc1            #71  <Int 109>
	//  378  588:bastore         
	//  379  589:dup             
	//  380  590:bipush          45
	//  381  592:ldc1            #85  <Int 112>
	//  382  594:bastore         
	//  383  595:dup             
	//  384  596:bipush          46
	//  385  598:ldc1            #75  <Int 114>
	//  386  600:bastore         
	//  387  601:dup             
	//  388  602:bipush          47
	//  389  604:ldc1            #45  <Int 101>
	//  390  606:bastore         
	//  391  607:dup             
	//  392  608:bipush          48
	//  393  610:ldc1            #63  <Int 115>
	//  394  612:bastore         
	//  395  613:dup             
	//  396  614:bipush          49
	//  397  616:ldc1            #63  <Int 115>
	//  398  618:bastore         
	//  399  619:dup             
	//  400  620:bipush          50
	//  401  622:ldc1            #88  <Int 105>
	//  402  624:bastore         
	//  403  625:dup             
	//  404  626:bipush          51
	//  405  628:ldc1            #78  <Int 111>
	//  406  630:bastore         
	//  407  631:dup             
	//  408  632:bipush          52
	//  409  634:ldc1            #80  <Int 110>
	//  410  636:bastore         
	//  411  637:invokespecial   #50  <Method void String(byte[])>
	//  412  640:putstatic       #93  <Field String f>
	//  413  643:aconst_null     
	//  414  644:putstatic       #95  <Field String OVERRIDE_HOST>
	//  415  647:iconst_0        
	//  416  648:invokestatic    #101 <Method Boolean Boolean.valueOf(boolean)>
	//  417  651:putstatic       #103 <Field Boolean OVERRIDE_NETWORK>
	//  418  654:iconst_0        
	//  419  655:invokestatic    #101 <Method Boolean Boolean.valueOf(boolean)>
	//  420  658:putstatic       #105 <Field Boolean g>
	//  421  661:iconst_0        
	//  422  662:invokestatic    #101 <Method Boolean Boolean.valueOf(boolean)>
	//  423  665:putstatic       #107 <Field Boolean VIDEO_DEBUG>
	//  424  668:iconst_0        
	//  425  669:invokestatic    #101 <Method Boolean Boolean.valueOf(boolean)>
	//  426  672:putstatic       #109 <Field Boolean FORCE_NATIVE_VIDEO_PLAYER>
	//  427  675:invokestatic    #113 <Method String i.b()>
	//  428  678:putstatic       #115 <Field String h>
	//  429  681:invokestatic    #117 <Method String i.c()>
	//  430  684:putstatic       #119 <Field String i>
	//  431  687:invokestatic    #121 <Method String i.d()>
	//  432  690:putstatic       #123 <Field String j>
	//  433  693:bipush          6
	//  434  695:anewarray       String[]
	//  435  698:dup             
	//  436  699:iconst_0        
	//  437  700:ldc1            #125 <String "back_">
	//  438  702:aastore         
	//  439  703:dup             
	//  440  704:iconst_1        
	//  441  705:ldc1            #127 <String "back_dark">
	//  442  707:aastore         
	//  443  708:dup             
	//  444  709:iconst_2        
	//  445  710:ldc1            #129 <String "browser_icon_dark">
	//  446  712:aastore         
	//  447  713:dup             
	//  448  714:iconst_3        
	//  449  715:ldc1            #131 <String "forward_">
	//  450  717:aastore         
	//  451  718:dup             
	//  452  719:iconst_4        
	//  453  720:ldc1            #133 <String "forward_dark">
	//  454  722:aastore         
	//  455  723:dup             
	//  456  724:iconst_5        
	//  457  725:ldc1            #135 <String "x_dark">
	//  458  727:aastore         
	//  459  728:putstatic       #137 <Field String[] k>
	//  460  731:iconst_3        
	//  461  732:anewarray       String[]
	//  462  735:dup             
	//  463  736:iconst_0        
	//  464  737:ldc1            #139 <String "empty_star">
	//  465  739:aastore         
	//  466  740:dup             
	//  467  741:iconst_1        
	//  468  742:ldc1            #141 <String "filled_star">
	//  469  744:aastore         
	//  470  745:dup             
	//  471  746:iconst_2        
	//  472  747:ldc1            #143 <String "half_star">
	//  473  749:aastore         
	//  474  750:putstatic       #145 <Field String[] l>
	//* 475  753:return          
	}
}
