// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import com.google.android.exoplayer.MediaFormat;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer.util:
//			ParsableBitArray

public final class DtsUtil
{

	private DtsUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static int getDtsFrameSize(byte abyte0[])
	{
		byte byte0 = abyte0[5];
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:baload          
	//    3    3:istore_1        
		byte byte1 = abyte0[6];
	//    4    4:aload_0         
	//    5    5:bipush          6
	//    6    7:baload          
	//    7    8:istore_2        
		return ((abyte0[7] & 0xf0) >> 4 | ((byte0 & 2) << 12 | (byte1 & 0xff) << 4)) + 1;
	//    8    9:aload_0         
	//    9   10:bipush          7
	//   10   12:baload          
	//   11   13:sipush          240
	//   12   16:iand            
	//   13   17:iconst_4        
	//   14   18:ishr            
	//   15   19:iload_1         
	//   16   20:iconst_2        
	//   17   21:iand            
	//   18   22:bipush          12
	//   19   24:ishl            
	//   20   25:iload_2         
	//   21   26:sipush          255
	//   22   29:iand            
	//   23   30:iconst_4        
	//   24   31:ishl            
	//   25   32:ior             
	//   26   33:ior             
	//   27   34:iconst_1        
	//   28   35:iadd            
	//   29   36:ireturn         
	}

	public static int parseDtsAudioSampleCount(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.position();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    2    4:istore_1        
		byte byte0 = bytebuffer.get(i + 4);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_4        
	//    6    8:iadd            
	//    7    9:invokevirtual   #43  <Method byte ByteBuffer.get(int)>
	//    8   12:istore_2        
		return (((bytebuffer.get(i + 5) & 0xfc) >> 2 | (byte0 & 1) << 6) + 1) * 32;
	//    9   13:aload_0         
	//   10   14:iload_1         
	//   11   15:iconst_5        
	//   12   16:iadd            
	//   13   17:invokevirtual   #43  <Method byte ByteBuffer.get(int)>
	//   14   20:sipush          252
	//   15   23:iand            
	//   16   24:iconst_2        
	//   17   25:ishr            
	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iand            
	//   21   29:bipush          6
	//   22   31:ishl            
	//   23   32:ior             
	//   24   33:iconst_1        
	//   25   34:iadd            
	//   26   35:bipush          32
	//   27   37:imul            
	//   28   38:ireturn         
	}

	public static int parseDtsAudioSampleCount(byte abyte0[])
	{
		byte byte0 = abyte0[4];
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:baload          
	//    3    3:istore_1        
		return (((abyte0[5] & 0xfc) >> 2 | (byte0 & 1) << 6) + 1) * 32;
	//    4    4:aload_0         
	//    5    5:iconst_5        
	//    6    6:baload          
	//    7    7:sipush          252
	//    8   10:iand            
	//    9   11:iconst_2        
	//   10   12:ishr            
	//   11   13:iload_1         
	//   12   14:iconst_1        
	//   13   15:iand            
	//   14   16:bipush          6
	//   15   18:ishl            
	//   16   19:ior             
	//   17   20:iconst_1        
	//   18   21:iadd            
	//   19   22:bipush          32
	//   20   24:imul            
	//   21   25:ireturn         
	}

	public static MediaFormat parseDtsFormat(byte abyte0[], String s, long l, String s1)
	{
		ParsableBitArray parsablebitarray = SCRATCH_BITS;
	//    0    0:getstatic       #27  <Field ParsableBitArray SCRATCH_BITS>
	//    1    3:astore          9
		parsablebitarray.reset(abyte0);
	//    2    5:aload           9
	//    3    7:aload_0         
	//    4    8:invokevirtual   #49  <Method void ParsableBitArray.reset(byte[])>
		parsablebitarray.skipBits(60);
	//    5   11:aload           9
	//    6   13:bipush          60
	//    7   15:invokevirtual   #53  <Method void ParsableBitArray.skipBits(int)>
		int i = parsablebitarray.readBits(6);
	//    8   18:aload           9
	//    9   20:bipush          6
	//   10   22:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   11   25:istore          5
		int k = CHANNELS_BY_AMODE[i];
	//   12   27:getstatic       #14  <Field int[] CHANNELS_BY_AMODE>
	//   13   30:iload           5
	//   14   32:iaload          
	//   15   33:istore          7
		i = parsablebitarray.readBits(4);
	//   16   35:aload           9
	//   17   37:iconst_4        
	//   18   38:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   19   41:istore          5
		int i1 = SAMPLE_RATE_BY_SFREQ[i];
	//   20   43:getstatic       #18  <Field int[] SAMPLE_RATE_BY_SFREQ>
	//   21   46:iload           5
	//   22   48:iaload          
	//   23   49:istore          8
		i = parsablebitarray.readBits(5);
	//   24   51:aload           9
	//   25   53:iconst_5        
	//   26   54:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   27   57:istore          5
		abyte0 = ((byte []) (TWICE_BITRATE_KBPS_BY_RATE));
	//   28   59:getstatic       #20  <Field int[] TWICE_BITRATE_KBPS_BY_RATE>
	//   29   62:astore_0        
		if(i >= abyte0.length)
	//*  30   63:iload           5
	//*  31   65:aload_0         
	//*  32   66:arraylength     
	//*  33   67:icmplt          76
			i = -1;
	//   34   70:iconst_m1       
	//   35   71:istore          5
		else
	//*  36   73:goto            88
			i = (abyte0[i] * 1000) / 2;
	//   37   76:aload_0         
	//   38   77:iload           5
	//   39   79:iaload          
	//   40   80:sipush          1000
	//   41   83:imul            
	//   42   84:iconst_2        
	//   43   85:idiv            
	//   44   86:istore          5
		parsablebitarray.skipBits(10);
	//   45   88:aload           9
	//   46   90:bipush          10
	//   47   92:invokevirtual   #53  <Method void ParsableBitArray.skipBits(int)>
		int j;
		if(parsablebitarray.readBits(2) > 0)
	//*  48   95:aload           9
	//*  49   97:iconst_2        
	//*  50   98:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//*  51  101:ifle            110
			j = 1;
	//   52  104:iconst_1        
	//   53  105:istore          6
		else
	//*  54  107:goto            113
			j = 0;
	//   55  110:iconst_0        
	//   56  111:istore          6
		return MediaFormat.createAudioFormat(s, "audio/vnd.dts", i, -1, l, k + j, i1, ((java.util.List) (null)), s1);
	//   57  113:aload_1         
	//   58  114:ldc1            #59  <String "audio/vnd.dts">
	//   59  116:iload           5
	//   60  118:iconst_m1       
	//   61  119:lload_2         
	//   62  120:iload           7
	//   63  122:iload           6
	//   64  124:iadd            
	//   65  125:iload           8
	//   66  127:aconst_null     
	//   67  128:aload           4
	//   68  130:invokestatic    #65  <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//   69  133:areturn         
	}

	private static final int CHANNELS_BY_AMODE[] = {
		1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 
		6, 6, 6, 7, 8, 8
	};
	private static final int SAMPLE_RATE_BY_SFREQ[] = {
		-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, 
		-1, 12000, 24000, 48000, -1, -1
	};
	private static final ParsableBitArray SCRATCH_BITS = new ParsableBitArray();
	private static final int TWICE_BITRATE_KBPS_BY_RATE[] = {
		64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 
		768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 
		2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680
	};

	static 
	{
	//    0    0:bipush          16
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_2        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_2        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_2        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_2        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_3        
	//   25   27:iastore         
	//   26   28:dup             
	//   27   29:bipush          6
	//   28   31:iconst_3        
	//   29   32:iastore         
	//   30   33:dup             
	//   31   34:bipush          7
	//   32   36:iconst_4        
	//   33   37:iastore         
	//   34   38:dup             
	//   35   39:bipush          8
	//   36   41:iconst_4        
	//   37   42:iastore         
	//   38   43:dup             
	//   39   44:bipush          9
	//   40   46:iconst_5        
	//   41   47:iastore         
	//   42   48:dup             
	//   43   49:bipush          10
	//   44   51:bipush          6
	//   45   53:iastore         
	//   46   54:dup             
	//   47   55:bipush          11
	//   48   57:bipush          6
	//   49   59:iastore         
	//   50   60:dup             
	//   51   61:bipush          12
	//   52   63:bipush          6
	//   53   65:iastore         
	//   54   66:dup             
	//   55   67:bipush          13
	//   56   69:bipush          7
	//   57   71:iastore         
	//   58   72:dup             
	//   59   73:bipush          14
	//   60   75:bipush          8
	//   61   77:iastore         
	//   62   78:dup             
	//   63   79:bipush          15
	//   64   81:bipush          8
	//   65   83:iastore         
	//   66   84:putstatic       #14  <Field int[] CHANNELS_BY_AMODE>
	//   67   87:bipush          16
	//   68   89:newarray        int[]
	//   69   91:dup             
	//   70   92:iconst_0        
	//   71   93:iconst_m1       
	//   72   94:iastore         
	//   73   95:dup             
	//   74   96:iconst_1        
	//   75   97:sipush          8000
	//   76  100:iastore         
	//   77  101:dup             
	//   78  102:iconst_2        
	//   79  103:sipush          16000
	//   80  106:iastore         
	//   81  107:dup             
	//   82  108:iconst_3        
	//   83  109:sipush          32000
	//   84  112:iastore         
	//   85  113:dup             
	//   86  114:iconst_4        
	//   87  115:iconst_m1       
	//   88  116:iastore         
	//   89  117:dup             
	//   90  118:iconst_5        
	//   91  119:iconst_m1       
	//   92  120:iastore         
	//   93  121:dup             
	//   94  122:bipush          6
	//   95  124:sipush          11025
	//   96  127:iastore         
	//   97  128:dup             
	//   98  129:bipush          7
	//   99  131:sipush          22050
	//  100  134:iastore         
	//  101  135:dup             
	//  102  136:bipush          8
	//  103  138:ldc1            #15  <Int 44100>
	//  104  140:iastore         
	//  105  141:dup             
	//  106  142:bipush          9
	//  107  144:iconst_m1       
	//  108  145:iastore         
	//  109  146:dup             
	//  110  147:bipush          10
	//  111  149:iconst_m1       
	//  112  150:iastore         
	//  113  151:dup             
	//  114  152:bipush          11
	//  115  154:sipush          12000
	//  116  157:iastore         
	//  117  158:dup             
	//  118  159:bipush          12
	//  119  161:sipush          24000
	//  120  164:iastore         
	//  121  165:dup             
	//  122  166:bipush          13
	//  123  168:ldc1            #16  <Int 48000>
	//  124  170:iastore         
	//  125  171:dup             
	//  126  172:bipush          14
	//  127  174:iconst_m1       
	//  128  175:iastore         
	//  129  176:dup             
	//  130  177:bipush          15
	//  131  179:iconst_m1       
	//  132  180:iastore         
	//  133  181:putstatic       #18  <Field int[] SAMPLE_RATE_BY_SFREQ>
	//  134  184:bipush          29
	//  135  186:newarray        int[]
	//  136  188:dup             
	//  137  189:iconst_0        
	//  138  190:bipush          64
	//  139  192:iastore         
	//  140  193:dup             
	//  141  194:iconst_1        
	//  142  195:bipush          112
	//  143  197:iastore         
	//  144  198:dup             
	//  145  199:iconst_2        
	//  146  200:sipush          128
	//  147  203:iastore         
	//  148  204:dup             
	//  149  205:iconst_3        
	//  150  206:sipush          192
	//  151  209:iastore         
	//  152  210:dup             
	//  153  211:iconst_4        
	//  154  212:sipush          224
	//  155  215:iastore         
	//  156  216:dup             
	//  157  217:iconst_5        
	//  158  218:sipush          256
	//  159  221:iastore         
	//  160  222:dup             
	//  161  223:bipush          6
	//  162  225:sipush          384
	//  163  228:iastore         
	//  164  229:dup             
	//  165  230:bipush          7
	//  166  232:sipush          448
	//  167  235:iastore         
	//  168  236:dup             
	//  169  237:bipush          8
	//  170  239:sipush          512
	//  171  242:iastore         
	//  172  243:dup             
	//  173  244:bipush          9
	//  174  246:sipush          640
	//  175  249:iastore         
	//  176  250:dup             
	//  177  251:bipush          10
	//  178  253:sipush          768
	//  179  256:iastore         
	//  180  257:dup             
	//  181  258:bipush          11
	//  182  260:sipush          896
	//  183  263:iastore         
	//  184  264:dup             
	//  185  265:bipush          12
	//  186  267:sipush          1024
	//  187  270:iastore         
	//  188  271:dup             
	//  189  272:bipush          13
	//  190  274:sipush          1152
	//  191  277:iastore         
	//  192  278:dup             
	//  193  279:bipush          14
	//  194  281:sipush          1280
	//  195  284:iastore         
	//  196  285:dup             
	//  197  286:bipush          15
	//  198  288:sipush          1536
	//  199  291:iastore         
	//  200  292:dup             
	//  201  293:bipush          16
	//  202  295:sipush          1920
	//  203  298:iastore         
	//  204  299:dup             
	//  205  300:bipush          17
	//  206  302:sipush          2048
	//  207  305:iastore         
	//  208  306:dup             
	//  209  307:bipush          18
	//  210  309:sipush          2304
	//  211  312:iastore         
	//  212  313:dup             
	//  213  314:bipush          19
	//  214  316:sipush          2560
	//  215  319:iastore         
	//  216  320:dup             
	//  217  321:bipush          20
	//  218  323:sipush          2688
	//  219  326:iastore         
	//  220  327:dup             
	//  221  328:bipush          21
	//  222  330:sipush          2816
	//  223  333:iastore         
	//  224  334:dup             
	//  225  335:bipush          22
	//  226  337:sipush          2823
	//  227  340:iastore         
	//  228  341:dup             
	//  229  342:bipush          23
	//  230  344:sipush          2944
	//  231  347:iastore         
	//  232  348:dup             
	//  233  349:bipush          24
	//  234  351:sipush          3072
	//  235  354:iastore         
	//  236  355:dup             
	//  237  356:bipush          25
	//  238  358:sipush          3840
	//  239  361:iastore         
	//  240  362:dup             
	//  241  363:bipush          26
	//  242  365:sipush          4096
	//  243  368:iastore         
	//  244  369:dup             
	//  245  370:bipush          27
	//  246  372:sipush          6144
	//  247  375:iastore         
	//  248  376:dup             
	//  249  377:bipush          28
	//  250  379:sipush          7680
	//  251  382:iastore         
	//  252  383:putstatic       #20  <Field int[] TWICE_BITRATE_KBPS_BY_RATE>
	//  253  386:new             #22  <Class ParsableBitArray>
	//  254  389:dup             
	//  255  390:invokespecial   #25  <Method void ParsableBitArray()>
	//  256  393:putstatic       #27  <Field ParsableBitArray SCRATCH_BITS>
	//* 257  396:return          
	}
}
