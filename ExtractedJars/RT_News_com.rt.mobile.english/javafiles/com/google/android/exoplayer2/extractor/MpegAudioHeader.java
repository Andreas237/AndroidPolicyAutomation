// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;


public final class MpegAudioHeader
{

	public MpegAudioHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static int getFrameSize(int i)
	{
		if((i & 0xffe00000) != 0xffe00000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #57  <Int 0xffe00000>
	//*   2    3:iand            
	//*   3    4:ldc1            #57  <Int 0xffe00000>
	//*   4    6:icmpeq          11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		int i1 = i >>> 19 & 3;
	//    7   11:iload_0         
	//    8   12:bipush          19
	//    9   14:iushr           
	//   10   15:iconst_3        
	//   11   16:iand            
	//   12   17:istore          4
		if(i1 == 1)
	//*  13   19:iload           4
	//*  14   21:iconst_1        
	//*  15   22:icmpne          27
			return -1;
	//   16   25:iconst_m1       
	//   17   26:ireturn         
		int l = i >>> 17 & 3;
	//   18   27:iload_0         
	//   19   28:bipush          17
	//   20   30:iushr           
	//   21   31:iconst_3        
	//   22   32:iand            
	//   23   33:istore_3        
		if(l == 0)
	//*  24   34:iload_3         
	//*  25   35:ifne            40
			return -1;
	//   26   38:iconst_m1       
	//   27   39:ireturn         
		int k1 = i >>> 12 & 0xf;
	//   28   40:iload_0         
	//   29   41:bipush          12
	//   30   43:iushr           
	//   31   44:bipush          15
	//   32   46:iand            
	//   33   47:istore          6
		if(k1 != 0)
	//*  34   49:iload           6
	//*  35   51:ifeq            240
		{
			if(k1 == 15)
	//*  36   54:iload           6
	//*  37   56:bipush          15
	//*  38   58:icmpne          63
				return -1;
	//   39   61:iconst_m1       
	//   40   62:ireturn         
			int j = i >>> 10 & 3;
	//   41   63:iload_0         
	//   42   64:bipush          10
	//   43   66:iushr           
	//   44   67:iconst_3        
	//   45   68:iand            
	//   46   69:istore_1        
			if(j == 3)
	//*  47   70:iload_1         
	//*  48   71:iconst_3        
	//*  49   72:icmpne          77
				return -1;
	//   50   75:iconst_m1       
	//   51   76:ireturn         
			int k = SAMPLING_RATE_V1[j];
	//   52   77:getstatic       #40  <Field int[] SAMPLING_RATE_V1>
	//   53   80:iload_1         
	//   54   81:iaload          
	//   55   82:istore_2        
			if(i1 == 2)
	//*  56   83:iload           4
	//*  57   85:iconst_2        
	//*  58   86:icmpne          96
			{
				j = k / 2;
	//   59   89:iload_2         
	//   60   90:iconst_2        
	//   61   91:idiv            
	//   62   92:istore_1        
			} else
	//*  63   93:goto            107
			{
				j = k;
	//   64   96:iload_2         
	//   65   97:istore_1        
				if(i1 == 0)
	//*  66   98:iload           4
	//*  67  100:ifne            107
					j = k / 4;
	//   68  103:iload_2         
	//   69  104:iconst_4        
	//   70  105:idiv            
	//   71  106:istore_1        
			}
			int j1 = i >>> 9 & 1;
	//   72  107:iload_0         
	//   73  108:bipush          9
	//   74  110:iushr           
	//   75  111:iconst_1        
	//   76  112:iand            
	//   77  113:istore          5
			if(l == 3)
	//*  78  115:iload_3         
	//*  79  116:iconst_3        
	//*  80  117:icmpne          160
			{
				if(i1 == 3)
	//*  81  120:iload           4
	//*  82  122:iconst_3        
	//*  83  123:icmpne          138
					i = BITRATE_V1_L1[k1 - 1];
	//   84  126:getstatic       #42  <Field int[] BITRATE_V1_L1>
	//   85  129:iload           6
	//   86  131:iconst_1        
	//   87  132:isub            
	//   88  133:iaload          
	//   89  134:istore_0        
				else
	//*  90  135:goto            147
					i = BITRATE_V2_L1[k1 - 1];
	//   91  138:getstatic       #44  <Field int[] BITRATE_V2_L1>
	//   92  141:iload           6
	//   93  143:iconst_1        
	//   94  144:isub            
	//   95  145:iaload          
	//   96  146:istore_0        
				return ((12000 * i) / j + j1) * 4;
	//   97  147:sipush          12000
	//   98  150:iload_0         
	//   99  151:imul            
	//  100  152:iload_1         
	//  101  153:idiv            
	//  102  154:iload           5
	//  103  156:iadd            
	//  104  157:iconst_4        
	//  105  158:imul            
	//  106  159:ireturn         
			}
			if(i1 == 3)
	//* 107  160:iload           4
	//* 108  162:iconst_3        
	//* 109  163:icmpne          195
			{
				if(l == 2)
	//* 110  166:iload_3         
	//* 111  167:iconst_2        
	//* 112  168:icmpne          183
					i = BITRATE_V1_L2[k1 - 1];
	//  113  171:getstatic       #46  <Field int[] BITRATE_V1_L2>
	//  114  174:iload           6
	//  115  176:iconst_1        
	//  116  177:isub            
	//  117  178:iaload          
	//  118  179:istore_0        
				else
	//* 119  180:goto            204
					i = BITRATE_V1_L3[k1 - 1];
	//  120  183:getstatic       #48  <Field int[] BITRATE_V1_L3>
	//  121  186:iload           6
	//  122  188:iconst_1        
	//  123  189:isub            
	//  124  190:iaload          
	//  125  191:istore_0        
			} else
	//* 126  192:goto            204
			{
				i = BITRATE_V2[k1 - 1];
	//  127  195:getstatic       #50  <Field int[] BITRATE_V2>
	//  128  198:iload           6
	//  129  200:iconst_1        
	//  130  201:isub            
	//  131  202:iaload          
	//  132  203:istore_0        
			}
			k = 0x23280;
	//  133  204:ldc1            #58  <Int 0x23280>
	//  134  206:istore_2        
			if(i1 == 3)
	//* 135  207:iload           4
	//* 136  209:iconst_3        
	//* 137  210:icmpne          223
				return (0x23280 * i) / j + j1;
	//  138  213:ldc1            #58  <Int 0x23280>
	//  139  215:iload_0         
	//  140  216:imul            
	//  141  217:iload_1         
	//  142  218:idiv            
	//  143  219:iload           5
	//  144  221:iadd            
	//  145  222:ireturn         
			if(l == 1)
	//* 146  223:iload_3         
	//* 147  224:iconst_1        
	//* 148  225:icmpne          231
				k = 0x11940;
	//  149  228:ldc1            #59  <Int 0x11940>
	//  150  230:istore_2        
			return (k * i) / j + j1;
	//  151  231:iload_2         
	//  152  232:iload_0         
	//  153  233:imul            
	//  154  234:iload_1         
	//  155  235:idiv            
	//  156  236:iload           5
	//  157  238:iadd            
	//  158  239:ireturn         
		} else
		{
			return -1;
	//  159  240:iconst_m1       
	//  160  241:ireturn         
		}
	}

	public static boolean populateHeader(int i, MpegAudioHeader mpegaudioheader)
	{
		if((i & 0xffe00000) != 0xffe00000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #57  <Int 0xffe00000>
	//*   2    3:iand            
	//*   3    4:ldc1            #57  <Int 0xffe00000>
	//*   4    6:icmpeq          11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int l1 = i >>> 19 & 3;
	//    7   11:iload_0         
	//    8   12:bipush          19
	//    9   14:iushr           
	//   10   15:iconst_3        
	//   11   16:iand            
	//   12   17:istore          8
		if(l1 == 1)
	//*  13   19:iload           8
	//*  14   21:iconst_1        
	//*  15   22:icmpne          27
			return false;
	//   16   25:iconst_0        
	//   17   26:ireturn         
		int i2 = i >>> 17 & 3;
	//   18   27:iload_0         
	//   19   28:bipush          17
	//   20   30:iushr           
	//   21   31:iconst_3        
	//   22   32:iand            
	//   23   33:istore          9
		if(i2 == 0)
	//*  24   35:iload           9
	//*  25   37:ifne            42
			return false;
	//   26   40:iconst_0        
	//   27   41:ireturn         
		int j1 = i >>> 12 & 0xf;
	//   28   42:iload_0         
	//   29   43:bipush          12
	//   30   45:iushr           
	//   31   46:bipush          15
	//   32   48:iand            
	//   33   49:istore          6
		if(j1 != 0)
	//*  34   51:iload           6
	//*  35   53:ifeq            349
		{
			if(j1 == 15)
	//*  36   56:iload           6
	//*  37   58:bipush          15
	//*  38   60:icmpne          65
				return false;
	//   39   63:iconst_0        
	//   40   64:ireturn         
			int j = i >>> 10 & 3;
	//   41   65:iload_0         
	//   42   66:bipush          10
	//   43   68:iushr           
	//   44   69:iconst_3        
	//   45   70:iand            
	//   46   71:istore_2        
			if(j == 3)
	//*  47   72:iload_2         
	//*  48   73:iconst_3        
	//*  49   74:icmpne          79
				return false;
	//   50   77:iconst_0        
	//   51   78:ireturn         
			int k = SAMPLING_RATE_V1[j];
	//   52   79:getstatic       #40  <Field int[] SAMPLING_RATE_V1>
	//   53   82:iload_2         
	//   54   83:iaload          
	//   55   84:istore_3        
			if(l1 == 2)
	//*  56   85:iload           8
	//*  57   87:iconst_2        
	//*  58   88:icmpne          98
			{
				j = k / 2;
	//   59   91:iload_3         
	//   60   92:iconst_2        
	//   61   93:idiv            
	//   62   94:istore_2        
			} else
	//*  63   95:goto            112
			{
				j = k;
	//   64   98:iload_3         
	//   65   99:istore_2        
				if(l1 == 0)
	//*  66  100:iload           8
	//*  67  102:ifne            95
					j = k / 4;
	//   68  105:iload_3         
	//   69  106:iconst_4        
	//   70  107:idiv            
	//   71  108:istore_2        
			}
	//*  72  109:goto            95
			int k1 = i >>> 9 & 1;
	//   73  112:iload_0         
	//   74  113:bipush          9
	//   75  115:iushr           
	//   76  116:iconst_1        
	//   77  117:iand            
	//   78  118:istore          7
			int i1 = 1152;
	//   79  120:sipush          1152
	//   80  123:istore          5
			int l;
			if(i2 == 3)
	//*  81  125:iload           9
	//*  82  127:iconst_3        
	//*  83  128:icmpne          190
			{
				if(l1 == 3)
	//*  84  131:iload           8
	//*  85  133:iconst_3        
	//*  86  134:icmpne          149
					k = BITRATE_V1_L1[j1 - 1];
	//   87  137:getstatic       #42  <Field int[] BITRATE_V1_L1>
	//   88  140:iload           6
	//   89  142:iconst_1        
	//   90  143:isub            
	//   91  144:iaload          
	//   92  145:istore_3        
				else
	//*  93  146:goto            158
					k = BITRATE_V2_L1[j1 - 1];
	//   94  149:getstatic       #44  <Field int[] BITRATE_V2_L1>
	//   95  152:iload           6
	//   96  154:iconst_1        
	//   97  155:isub            
	//   98  156:iaload          
	//   99  157:istore_3        
				l = (12000 * k) / j;
	//  100  158:sipush          12000
	//  101  161:iload_3         
	//  102  162:imul            
	//  103  163:iload_2         
	//  104  164:idiv            
	//  105  165:istore          4
				i1 = 384;
	//  106  167:sipush          384
	//  107  170:istore          5
				j1 = (l + k1) * 4;
	//  108  172:iload           4
	//  109  174:iload           7
	//  110  176:iadd            
	//  111  177:iconst_4        
	//  112  178:imul            
	//  113  179:istore          6
				l = k;
	//  114  181:iload_3         
	//  115  182:istore          4
				k = j1;
	//  116  184:iload           6
	//  117  186:istore_3        
			} else
	//* 118  187:goto            301
			{
				l = 0x23280;
	//  119  190:ldc1            #58  <Int 0x23280>
	//  120  192:istore          4
				if(l1 == 3)
	//* 121  194:iload           8
	//* 122  196:iconst_3        
	//* 123  197:icmpne          243
				{
					if(i2 == 2)
	//* 124  200:iload           9
	//* 125  202:iconst_2        
	//* 126  203:icmpne          219
						l = BITRATE_V1_L2[j1 - 1];
	//  127  206:getstatic       #46  <Field int[] BITRATE_V1_L2>
	//  128  209:iload           6
	//  129  211:iconst_1        
	//  130  212:isub            
	//  131  213:iaload          
	//  132  214:istore          4
					else
	//* 133  216:goto            229
						l = BITRATE_V1_L3[j1 - 1];
	//  134  219:getstatic       #48  <Field int[] BITRATE_V1_L3>
	//  135  222:iload           6
	//  136  224:iconst_1        
	//  137  225:isub            
	//  138  226:iaload          
	//  139  227:istore          4
					k = (0x23280 * l) / j + k1;
	//  140  229:ldc1            #58  <Int 0x23280>
	//  141  231:iload           4
	//  142  233:imul            
	//  143  234:iload_2         
	//  144  235:idiv            
	//  145  236:iload           7
	//  146  238:iadd            
	//  147  239:istore_3        
				} else
	//* 148  240:goto            301
				{
					j1 = BITRATE_V2[j1 - 1];
	//  149  243:getstatic       #50  <Field int[] BITRATE_V2>
	//  150  246:iload           6
	//  151  248:iconst_1        
	//  152  249:isub            
	//  153  250:iaload          
	//  154  251:istore          6
					k = i1;
	//  155  253:iload           5
	//  156  255:istore_3        
					if(i2 == 1)
	//* 157  256:iload           9
	//* 158  258:iconst_1        
	//* 159  259:icmpne          266
						k = 576;
	//  160  262:sipush          576
	//  161  265:istore_3        
					if(i2 == 1)
	//* 162  266:iload           9
	//* 163  268:iconst_1        
	//* 164  269:icmpne          276
						l = 0x11940;
	//  165  272:ldc1            #59  <Int 0x11940>
	//  166  274:istore          4
					k1 = (l * j1) / j + k1;
	//  167  276:iload           4
	//  168  278:iload           6
	//  169  280:imul            
	//  170  281:iload_2         
	//  171  282:idiv            
	//  172  283:iload           7
	//  173  285:iadd            
	//  174  286:istore          7
					l = j1;
	//  175  288:iload           6
	//  176  290:istore          4
					i1 = k;
	//  177  292:iload_3         
	//  178  293:istore          5
					k = k1;
	//  179  295:iload           7
	//  180  297:istore_3        
				}
			}
	//* 181  298:goto            240
			String s = MIME_TYPE_BY_LAYER[3 - i2];
	//  182  301:getstatic       #36  <Field String[] MIME_TYPE_BY_LAYER>
	//  183  304:iconst_3        
	//  184  305:iload           9
	//  185  307:isub            
	//  186  308:aaload          
	//  187  309:astore          10
			if((i >> 6 & 3) == 3)
	//* 188  311:iload_0         
	//* 189  312:bipush          6
	//* 190  314:ishr            
	//* 191  315:iconst_3        
	//* 192  316:iand            
	//* 193  317:iconst_3        
	//* 194  318:icmpne          326
				i = 1;
	//  195  321:iconst_1        
	//  196  322:istore_0        
			else
	//* 197  323:goto            328
				i = 2;
	//  198  326:iconst_2        
	//  199  327:istore_0        
			mpegaudioheader.setValues(l1, s, k, j, i, l * 1000, i1);
	//  200  328:aload_1         
	//  201  329:iload           8
	//  202  331:aload           10
	//  203  333:iload_3         
	//  204  334:iload_2         
	//  205  335:iload_0         
	//  206  336:iload           4
	//  207  338:sipush          1000
	//  208  341:imul            
	//  209  342:iload           5
	//  210  344:invokespecial   #65  <Method void setValues(int, String, int, int, int, int, int)>
			return true;
	//  211  347:iconst_1        
	//  212  348:ireturn         
		} else
		{
			return false;
	//  213  349:iconst_0        
	//  214  350:ireturn         
		}
	}

	private void setValues(int i, String s, int j, int k, int l, int i1, int j1)
	{
		version = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int version>
		mimeType = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #69  <Field String mimeType>
		frameSize = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #71  <Field int frameSize>
		sampleRate = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #73  <Field int sampleRate>
		channels = l;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #75  <Field int channels>
		bitrate = i1;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #77  <Field int bitrate>
		samplesPerFrame = j1;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #79  <Field int samplesPerFrame>
	//   21   39:return          
	}

	private static final int BITRATE_V1_L1[] = {
		32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 
		352, 384, 416, 448
	};
	private static final int BITRATE_V1_L2[] = {
		32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 
		224, 256, 320, 384
	};
	private static final int BITRATE_V1_L3[] = {
		32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
		192, 224, 256, 320
	};
	private static final int BITRATE_V2[] = {
		8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 
		112, 128, 144, 160
	};
	private static final int BITRATE_V2_L1[] = {
		32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 
		176, 192, 224, 256
	};
	public static final int MAX_FRAME_SIZE_BYTES = 4096;
	private static final String MIME_TYPE_BY_LAYER[] = {
		"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"
	};
	private static final int SAMPLING_RATE_V1[] = {
		44100, 48000, 32000
	};
	public int bitrate;
	public int channels;
	public int frameSize;
	public String mimeType;
	public int sampleRate;
	public int samplesPerFrame;
	public int version;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #30  <String "audio/mpeg-L1">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #32  <String "audio/mpeg-L2">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #34  <String "audio/mpeg">
	//   13   18:aastore         
	//   14   19:putstatic       #36  <Field String[] MIME_TYPE_BY_LAYER>
	//   15   22:iconst_3        
	//   16   23:newarray        int[]
	//   17   25:dup             
	//   18   26:iconst_0        
	//   19   27:ldc1            #37  <Int 44100>
	//   20   29:iastore         
	//   21   30:dup             
	//   22   31:iconst_1        
	//   23   32:ldc1            #38  <Int 48000>
	//   24   34:iastore         
	//   25   35:dup             
	//   26   36:iconst_2        
	//   27   37:sipush          32000
	//   28   40:iastore         
	//   29   41:putstatic       #40  <Field int[] SAMPLING_RATE_V1>
	//   30   44:bipush          14
	//   31   46:newarray        int[]
	//   32   48:dup             
	//   33   49:iconst_0        
	//   34   50:bipush          32
	//   35   52:iastore         
	//   36   53:dup             
	//   37   54:iconst_1        
	//   38   55:bipush          64
	//   39   57:iastore         
	//   40   58:dup             
	//   41   59:iconst_2        
	//   42   60:bipush          96
	//   43   62:iastore         
	//   44   63:dup             
	//   45   64:iconst_3        
	//   46   65:sipush          128
	//   47   68:iastore         
	//   48   69:dup             
	//   49   70:iconst_4        
	//   50   71:sipush          160
	//   51   74:iastore         
	//   52   75:dup             
	//   53   76:iconst_5        
	//   54   77:sipush          192
	//   55   80:iastore         
	//   56   81:dup             
	//   57   82:bipush          6
	//   58   84:sipush          224
	//   59   87:iastore         
	//   60   88:dup             
	//   61   89:bipush          7
	//   62   91:sipush          256
	//   63   94:iastore         
	//   64   95:dup             
	//   65   96:bipush          8
	//   66   98:sipush          288
	//   67  101:iastore         
	//   68  102:dup             
	//   69  103:bipush          9
	//   70  105:sipush          320
	//   71  108:iastore         
	//   72  109:dup             
	//   73  110:bipush          10
	//   74  112:sipush          352
	//   75  115:iastore         
	//   76  116:dup             
	//   77  117:bipush          11
	//   78  119:sipush          384
	//   79  122:iastore         
	//   80  123:dup             
	//   81  124:bipush          12
	//   82  126:sipush          416
	//   83  129:iastore         
	//   84  130:dup             
	//   85  131:bipush          13
	//   86  133:sipush          448
	//   87  136:iastore         
	//   88  137:putstatic       #42  <Field int[] BITRATE_V1_L1>
	//   89  140:bipush          14
	//   90  142:newarray        int[]
	//   91  144:dup             
	//   92  145:iconst_0        
	//   93  146:bipush          32
	//   94  148:iastore         
	//   95  149:dup             
	//   96  150:iconst_1        
	//   97  151:bipush          48
	//   98  153:iastore         
	//   99  154:dup             
	//  100  155:iconst_2        
	//  101  156:bipush          56
	//  102  158:iastore         
	//  103  159:dup             
	//  104  160:iconst_3        
	//  105  161:bipush          64
	//  106  163:iastore         
	//  107  164:dup             
	//  108  165:iconst_4        
	//  109  166:bipush          80
	//  110  168:iastore         
	//  111  169:dup             
	//  112  170:iconst_5        
	//  113  171:bipush          96
	//  114  173:iastore         
	//  115  174:dup             
	//  116  175:bipush          6
	//  117  177:bipush          112
	//  118  179:iastore         
	//  119  180:dup             
	//  120  181:bipush          7
	//  121  183:sipush          128
	//  122  186:iastore         
	//  123  187:dup             
	//  124  188:bipush          8
	//  125  190:sipush          144
	//  126  193:iastore         
	//  127  194:dup             
	//  128  195:bipush          9
	//  129  197:sipush          160
	//  130  200:iastore         
	//  131  201:dup             
	//  132  202:bipush          10
	//  133  204:sipush          176
	//  134  207:iastore         
	//  135  208:dup             
	//  136  209:bipush          11
	//  137  211:sipush          192
	//  138  214:iastore         
	//  139  215:dup             
	//  140  216:bipush          12
	//  141  218:sipush          224
	//  142  221:iastore         
	//  143  222:dup             
	//  144  223:bipush          13
	//  145  225:sipush          256
	//  146  228:iastore         
	//  147  229:putstatic       #44  <Field int[] BITRATE_V2_L1>
	//  148  232:bipush          14
	//  149  234:newarray        int[]
	//  150  236:dup             
	//  151  237:iconst_0        
	//  152  238:bipush          32
	//  153  240:iastore         
	//  154  241:dup             
	//  155  242:iconst_1        
	//  156  243:bipush          48
	//  157  245:iastore         
	//  158  246:dup             
	//  159  247:iconst_2        
	//  160  248:bipush          56
	//  161  250:iastore         
	//  162  251:dup             
	//  163  252:iconst_3        
	//  164  253:bipush          64
	//  165  255:iastore         
	//  166  256:dup             
	//  167  257:iconst_4        
	//  168  258:bipush          80
	//  169  260:iastore         
	//  170  261:dup             
	//  171  262:iconst_5        
	//  172  263:bipush          96
	//  173  265:iastore         
	//  174  266:dup             
	//  175  267:bipush          6
	//  176  269:bipush          112
	//  177  271:iastore         
	//  178  272:dup             
	//  179  273:bipush          7
	//  180  275:sipush          128
	//  181  278:iastore         
	//  182  279:dup             
	//  183  280:bipush          8
	//  184  282:sipush          160
	//  185  285:iastore         
	//  186  286:dup             
	//  187  287:bipush          9
	//  188  289:sipush          192
	//  189  292:iastore         
	//  190  293:dup             
	//  191  294:bipush          10
	//  192  296:sipush          224
	//  193  299:iastore         
	//  194  300:dup             
	//  195  301:bipush          11
	//  196  303:sipush          256
	//  197  306:iastore         
	//  198  307:dup             
	//  199  308:bipush          12
	//  200  310:sipush          320
	//  201  313:iastore         
	//  202  314:dup             
	//  203  315:bipush          13
	//  204  317:sipush          384
	//  205  320:iastore         
	//  206  321:putstatic       #46  <Field int[] BITRATE_V1_L2>
	//  207  324:bipush          14
	//  208  326:newarray        int[]
	//  209  328:dup             
	//  210  329:iconst_0        
	//  211  330:bipush          32
	//  212  332:iastore         
	//  213  333:dup             
	//  214  334:iconst_1        
	//  215  335:bipush          40
	//  216  337:iastore         
	//  217  338:dup             
	//  218  339:iconst_2        
	//  219  340:bipush          48
	//  220  342:iastore         
	//  221  343:dup             
	//  222  344:iconst_3        
	//  223  345:bipush          56
	//  224  347:iastore         
	//  225  348:dup             
	//  226  349:iconst_4        
	//  227  350:bipush          64
	//  228  352:iastore         
	//  229  353:dup             
	//  230  354:iconst_5        
	//  231  355:bipush          80
	//  232  357:iastore         
	//  233  358:dup             
	//  234  359:bipush          6
	//  235  361:bipush          96
	//  236  363:iastore         
	//  237  364:dup             
	//  238  365:bipush          7
	//  239  367:bipush          112
	//  240  369:iastore         
	//  241  370:dup             
	//  242  371:bipush          8
	//  243  373:sipush          128
	//  244  376:iastore         
	//  245  377:dup             
	//  246  378:bipush          9
	//  247  380:sipush          160
	//  248  383:iastore         
	//  249  384:dup             
	//  250  385:bipush          10
	//  251  387:sipush          192
	//  252  390:iastore         
	//  253  391:dup             
	//  254  392:bipush          11
	//  255  394:sipush          224
	//  256  397:iastore         
	//  257  398:dup             
	//  258  399:bipush          12
	//  259  401:sipush          256
	//  260  404:iastore         
	//  261  405:dup             
	//  262  406:bipush          13
	//  263  408:sipush          320
	//  264  411:iastore         
	//  265  412:putstatic       #48  <Field int[] BITRATE_V1_L3>
	//  266  415:bipush          14
	//  267  417:newarray        int[]
	//  268  419:dup             
	//  269  420:iconst_0        
	//  270  421:bipush          8
	//  271  423:iastore         
	//  272  424:dup             
	//  273  425:iconst_1        
	//  274  426:bipush          16
	//  275  428:iastore         
	//  276  429:dup             
	//  277  430:iconst_2        
	//  278  431:bipush          24
	//  279  433:iastore         
	//  280  434:dup             
	//  281  435:iconst_3        
	//  282  436:bipush          32
	//  283  438:iastore         
	//  284  439:dup             
	//  285  440:iconst_4        
	//  286  441:bipush          40
	//  287  443:iastore         
	//  288  444:dup             
	//  289  445:iconst_5        
	//  290  446:bipush          48
	//  291  448:iastore         
	//  292  449:dup             
	//  293  450:bipush          6
	//  294  452:bipush          56
	//  295  454:iastore         
	//  296  455:dup             
	//  297  456:bipush          7
	//  298  458:bipush          64
	//  299  460:iastore         
	//  300  461:dup             
	//  301  462:bipush          8
	//  302  464:bipush          80
	//  303  466:iastore         
	//  304  467:dup             
	//  305  468:bipush          9
	//  306  470:bipush          96
	//  307  472:iastore         
	//  308  473:dup             
	//  309  474:bipush          10
	//  310  476:bipush          112
	//  311  478:iastore         
	//  312  479:dup             
	//  313  480:bipush          11
	//  314  482:sipush          128
	//  315  485:iastore         
	//  316  486:dup             
	//  317  487:bipush          12
	//  318  489:sipush          144
	//  319  492:iastore         
	//  320  493:dup             
	//  321  494:bipush          13
	//  322  496:sipush          160
	//  323  499:iastore         
	//  324  500:putstatic       #50  <Field int[] BITRATE_V2>
	//* 325  503:return          
	}
}
