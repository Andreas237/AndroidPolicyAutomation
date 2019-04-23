// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


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
				return ((i * 12000) / j + j1) * 4;
	//   97  147:iload_0         
	//   98  148:sipush          12000
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
				return (i * 0x23280) / j + j1;
	//  138  213:iload_0         
	//  139  214:ldc1            #58  <Int 0x23280>
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
		int k1 = i >>> 19 & 3;
	//    7   11:iload_0         
	//    8   12:bipush          19
	//    9   14:iushr           
	//   10   15:iconst_3        
	//   11   16:iand            
	//   12   17:istore          7
		if(k1 == 1)
	//*  13   19:iload           7
	//*  14   21:iconst_1        
	//*  15   22:icmpne          27
			return false;
	//   16   25:iconst_0        
	//   17   26:ireturn         
		int l1 = i >>> 17 & 3;
	//   18   27:iload_0         
	//   19   28:bipush          17
	//   20   30:iushr           
	//   21   31:iconst_3        
	//   22   32:iand            
	//   23   33:istore          8
		if(l1 == 0)
	//*  24   35:iload           8
	//*  25   37:ifne            42
			return false;
	//   26   40:iconst_0        
	//   27   41:ireturn         
		int i1 = i >>> 12 & 0xf;
	//   28   42:iload_0         
	//   29   43:bipush          12
	//   30   45:iushr           
	//   31   46:bipush          15
	//   32   48:iand            
	//   33   49:istore          5
		if(i1 != 0)
	//*  34   51:iload           5
	//*  35   53:ifeq            333
		{
			if(i1 == 15)
	//*  36   56:iload           5
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
			j = SAMPLING_RATE_V1[j];
	//   52   79:getstatic       #40  <Field int[] SAMPLING_RATE_V1>
	//   53   82:iload_2         
	//   54   83:iaload          
	//   55   84:istore_2        
			if(k1 == 2)
	//*  56   85:iload           7
	//*  57   87:iconst_2        
	//*  58   88:icmpne          98
				j /= 2;
	//   59   91:iload_2         
	//   60   92:iconst_2        
	//   61   93:idiv            
	//   62   94:istore_2        
			else
	//*  63   95:goto            110
			if(k1 == 0)
	//*  64   98:iload           7
	//*  65  100:ifne            110
				j /= 4;
	//   66  103:iload_2         
	//   67  104:iconst_4        
	//   68  105:idiv            
	//   69  106:istore_2        
	//*  70  107:goto            110
			int i2 = i >>> 9 & 1;
	//   71  110:iload_0         
	//   72  111:bipush          9
	//   73  113:iushr           
	//   74  114:iconst_1        
	//   75  115:iand            
	//   76  116:istore          9
			int k = 1152;
	//   77  118:sipush          1152
	//   78  121:istore_3        
			int l;
			if(l1 == 3)
	//*  79  122:iload           8
	//*  80  124:iconst_3        
	//*  81  125:icmpne          181
			{
				if(k1 == 3)
	//*  82  128:iload           7
	//*  83  130:iconst_3        
	//*  84  131:icmpne          146
					k = BITRATE_V1_L1[i1 - 1];
	//   85  134:getstatic       #42  <Field int[] BITRATE_V1_L1>
	//   86  137:iload           5
	//   87  139:iconst_1        
	//   88  140:isub            
	//   89  141:iaload          
	//   90  142:istore_3        
				else
	//*  91  143:goto            155
					k = BITRATE_V2_L1[i1 - 1];
	//   92  146:getstatic       #44  <Field int[] BITRATE_V2_L1>
	//   93  149:iload           5
	//   94  151:iconst_1        
	//   95  152:isub            
	//   96  153:iaload          
	//   97  154:istore_3        
				l = (k * 12000) / j;
	//   98  155:iload_3         
	//   99  156:sipush          12000
	//  100  159:imul            
	//  101  160:iload_2         
	//  102  161:idiv            
	//  103  162:istore          4
				i1 = 384;
	//  104  164:sipush          384
	//  105  167:istore          5
				l = (l + i2) * 4;
	//  106  169:iload           4
	//  107  171:iload           9
	//  108  173:iadd            
	//  109  174:iconst_4        
	//  110  175:imul            
	//  111  176:istore          4
			} else
	//* 112  178:goto            285
			{
				l = 0x23280;
	//  113  181:ldc1            #58  <Int 0x23280>
	//  114  183:istore          4
				if(k1 == 3)
	//* 115  185:iload           7
	//* 116  187:iconst_3        
	//* 117  188:icmpne          237
				{
					if(l1 == 2)
	//* 118  191:iload           8
	//* 119  193:iconst_2        
	//* 120  194:icmpne          209
						k = BITRATE_V1_L2[i1 - 1];
	//  121  197:getstatic       #46  <Field int[] BITRATE_V1_L2>
	//  122  200:iload           5
	//  123  202:iconst_1        
	//  124  203:isub            
	//  125  204:iaload          
	//  126  205:istore_3        
					else
	//* 127  206:goto            218
						k = BITRATE_V1_L3[i1 - 1];
	//  128  209:getstatic       #48  <Field int[] BITRATE_V1_L3>
	//  129  212:iload           5
	//  130  214:iconst_1        
	//  131  215:isub            
	//  132  216:iaload          
	//  133  217:istore_3        
					l = (0x23280 * k) / j + i2;
	//  134  218:ldc1            #58  <Int 0x23280>
	//  135  220:iload_3         
	//  136  221:imul            
	//  137  222:iload_2         
	//  138  223:idiv            
	//  139  224:iload           9
	//  140  226:iadd            
	//  141  227:istore          4
					i1 = 1152;
	//  142  229:sipush          1152
	//  143  232:istore          5
				} else
	//* 144  234:goto            285
				{
					int j1 = BITRATE_V2[i1 - 1];
	//  145  237:getstatic       #50  <Field int[] BITRATE_V2>
	//  146  240:iload           5
	//  147  242:iconst_1        
	//  148  243:isub            
	//  149  244:iaload          
	//  150  245:istore          6
					if(l1 == 1)
	//* 151  247:iload           8
	//* 152  249:iconst_1        
	//* 153  250:icmpne          257
						k = 576;
	//  154  253:sipush          576
	//  155  256:istore_3        
					if(l1 == 1)
	//* 156  257:iload           8
	//* 157  259:iconst_1        
	//* 158  260:icmpne          267
						l = 0x11940;
	//  159  263:ldc1            #59  <Int 0x11940>
	//  160  265:istore          4
					l = (l * j1) / j + i2;
	//  161  267:iload           4
	//  162  269:iload           6
	//  163  271:imul            
	//  164  272:iload_2         
	//  165  273:idiv            
	//  166  274:iload           9
	//  167  276:iadd            
	//  168  277:istore          4
					i1 = k;
	//  169  279:iload_3         
	//  170  280:istore          5
					k = j1;
	//  171  282:iload           6
	//  172  284:istore_3        
				}
			}
			String s = MIME_TYPE_BY_LAYER[3 - l1];
	//  173  285:getstatic       #36  <Field String[] MIME_TYPE_BY_LAYER>
	//  174  288:iconst_3        
	//  175  289:iload           8
	//  176  291:isub            
	//  177  292:aaload          
	//  178  293:astore          10
			if((i >> 6 & 3) == 3)
	//* 179  295:iload_0         
	//* 180  296:bipush          6
	//* 181  298:ishr            
	//* 182  299:iconst_3        
	//* 183  300:iand            
	//* 184  301:iconst_3        
	//* 185  302:icmpne          310
				i = 1;
	//  186  305:iconst_1        
	//  187  306:istore_0        
			else
	//* 188  307:goto            312
				i = 2;
	//  189  310:iconst_2        
	//  190  311:istore_0        
			mpegaudioheader.setValues(k1, s, l, j, i, k * 1000, i1);
	//  191  312:aload_1         
	//  192  313:iload           7
	//  193  315:aload           10
	//  194  317:iload           4
	//  195  319:iload_2         
	//  196  320:iload_0         
	//  197  321:iload_3         
	//  198  322:sipush          1000
	//  199  325:imul            
	//  200  326:iload           5
	//  201  328:invokespecial   #65  <Method void setValues(int, String, int, int, int, int, int)>
			return true;
	//  202  331:iconst_1        
	//  203  332:ireturn         
		} else
		{
			return false;
	//  204  333:iconst_0        
	//  205  334:ireturn         
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
