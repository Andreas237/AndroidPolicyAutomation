// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, zzfs, zzhp

public final class bdt
{

	public static int a()
	{
		return 1536;
	//    0    0:sipush          1536
	//    1    3:ireturn         
	}

	public static int a(ByteBuffer bytebuffer)
	{
		byte byte0 = bytebuffer.get(bytebuffer.position() + 4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #35  <Method int ByteBuffer.position()>
	//    3    5:iconst_4        
	//    4    6:iadd            
	//    5    7:invokevirtual   #39  <Method byte ByteBuffer.get(int)>
	//    6   10:istore_2        
		int i = 6;
	//    7   11:bipush          6
	//    8   13:istore_1        
		if((byte0 & 0xc0) >> 6 != 3)
	//*   9   14:iload_2         
	//*  10   15:sipush          192
	//*  11   18:iand            
	//*  12   19:bipush          6
	//*  13   21:ishr            
	//*  14   22:iconst_3        
	//*  15   23:icmpne          29
	//*  16   26:goto            49
			i = a[(bytebuffer.get(bytebuffer.position() + 4) & 0x30) >> 4];
	//   17   29:getstatic       #15  <Field int[] a>
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #35  <Method int ByteBuffer.position()>
	//   21   37:iconst_4        
	//   22   38:iadd            
	//   23   39:invokevirtual   #39  <Method byte ByteBuffer.get(int)>
	//   24   42:bipush          48
	//   25   44:iand            
	//   26   45:iconst_4        
	//   27   46:ishr            
	//   28   47:iaload          
	//   29   48:istore_1        
		return i * 256;
	//   30   49:iload_1         
	//   31   50:sipush          256
	//   32   53:imul            
	//   33   54:ireturn         
	}

	public static zzfs a(bno bno1, String s, String s1, zzhp zzhp)
	{
		int i = bno1.f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method int bno.f()>
	//    2    4:istore          4
		int j = b[(i & 0xc0) >> 6];
	//    3    6:getstatic       #19  <Field int[] b>
	//    4    9:iload           4
	//    5   11:sipush          192
	//    6   14:iand            
	//    7   15:bipush          6
	//    8   17:ishr            
	//    9   18:iaload          
	//   10   19:istore          5
		int k = bno1.f();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #44  <Method int bno.f()>
	//   13   25:istore          6
		i = d[(k & 0x38) >> 3];
	//   14   27:getstatic       #23  <Field int[] d>
	//   15   30:iload           6
	//   16   32:bipush          56
	//   17   34:iand            
	//   18   35:iconst_3        
	//   19   36:ishr            
	//   20   37:iaload          
	//   21   38:istore          4
		if((k & 4) != 0)
	//*  22   40:iload           6
	//*  23   42:iconst_4        
	//*  24   43:iand            
	//*  25   44:ifeq            56
			i++;
	//   26   47:iload           4
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore          4
	//*  30   53:goto            56
		return zzfs.a(s, "audio/ac3", ((String) (null)), -1, -1, i, j, ((java.util.List) (null)), zzhp, 0, s1);
	//   31   56:aload_1         
	//   32   57:ldc1            #46  <String "audio/ac3">
	//   33   59:aconst_null     
	//   34   60:iconst_m1       
	//   35   61:iconst_m1       
	//   36   62:iload           4
	//   37   64:iload           5
	//   38   66:aconst_null     
	//   39   67:aload_3         
	//   40   68:iconst_0        
	//   41   69:aload_2         
	//   42   70:invokestatic    #51  <Method zzfs zzfs.a(String, String, String, int, int, int, int, java.util.List, zzhp, int, String)>
	//   43   73:areturn         
	}

	public static zzfs b(bno bno1, String s, String s1, zzhp zzhp)
	{
		bno1.d(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #54  <Method void bno.d(int)>
		int i = bno1.f();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #44  <Method int bno.f()>
	//    5    9:istore          4
		int j = b[(i & 0xc0) >> 6];
	//    6   11:getstatic       #19  <Field int[] b>
	//    7   14:iload           4
	//    8   16:sipush          192
	//    9   19:iand            
	//   10   20:bipush          6
	//   11   22:ishr            
	//   12   23:iaload          
	//   13   24:istore          5
		int k = bno1.f();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #44  <Method int bno.f()>
	//   16   30:istore          6
		i = d[(k & 0xe) >> 1];
	//   17   32:getstatic       #23  <Field int[] d>
	//   18   35:iload           6
	//   19   37:bipush          14
	//   20   39:iand            
	//   21   40:iconst_1        
	//   22   41:ishr            
	//   23   42:iaload          
	//   24   43:istore          4
		if((k & 1) != 0)
	//*  25   45:iload           6
	//*  26   47:iconst_1        
	//*  27   48:iand            
	//*  28   49:ifeq            61
			i++;
	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          4
	//*  33   58:goto            61
		return zzfs.a(s, "audio/eac3", ((String) (null)), -1, -1, i, j, ((java.util.List) (null)), zzhp, 0, s1);
	//   34   61:aload_1         
	//   35   62:ldc1            #56  <String "audio/eac3">
	//   36   64:aconst_null     
	//   37   65:iconst_m1       
	//   38   66:iconst_m1       
	//   39   67:iload           4
	//   40   69:iload           5
	//   41   71:aconst_null     
	//   42   72:aload_3         
	//   43   73:iconst_0        
	//   44   74:aload_2         
	//   45   75:invokestatic    #51  <Method zzfs zzfs.a(String, String, String, int, int, int, int, java.util.List, zzhp, int, String)>
	//   46   78:areturn         
	}

	private static final int a[] = {
		1, 2, 3, 6
	};
	private static final int b[] = {
		48000, 44100, 32000
	};
	private static final int c[] = {
		24000, 22050, 16000
	};
	private static final int d[] = {
		2, 1, 2, 3, 3, 4, 4, 5
	};
	private static final int e[] = {
		32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
		192, 224, 256, 320, 384, 448, 512, 576, 640
	};
	private static final int f[] = {
		69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 
		417, 487, 557, 696, 835, 975, 1114, 1253, 1393
	};

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_1        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_2        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_3        
	//   13   14:iastore         
	//   14   15:dup             
	//   15   16:iconst_3        
	//   16   17:bipush          6
	//   17   19:iastore         
	//   18   20:putstatic       #15  <Field int[] a>
	//   19   23:iconst_3        
	//   20   24:newarray        int[]
	//   21   26:dup             
	//   22   27:iconst_0        
	//   23   28:ldc1            #16  <Int 48000>
	//   24   30:iastore         
	//   25   31:dup             
	//   26   32:iconst_1        
	//   27   33:ldc1            #17  <Int 44100>
	//   28   35:iastore         
	//   29   36:dup             
	//   30   37:iconst_2        
	//   31   38:sipush          32000
	//   32   41:iastore         
	//   33   42:putstatic       #19  <Field int[] b>
	//   34   45:iconst_3        
	//   35   46:newarray        int[]
	//   36   48:dup             
	//   37   49:iconst_0        
	//   38   50:sipush          24000
	//   39   53:iastore         
	//   40   54:dup             
	//   41   55:iconst_1        
	//   42   56:sipush          22050
	//   43   59:iastore         
	//   44   60:dup             
	//   45   61:iconst_2        
	//   46   62:sipush          16000
	//   47   65:iastore         
	//   48   66:putstatic       #21  <Field int[] c>
	//   49   69:bipush          8
	//   50   71:newarray        int[]
	//   51   73:dup             
	//   52   74:iconst_0        
	//   53   75:iconst_2        
	//   54   76:iastore         
	//   55   77:dup             
	//   56   78:iconst_1        
	//   57   79:iconst_1        
	//   58   80:iastore         
	//   59   81:dup             
	//   60   82:iconst_2        
	//   61   83:iconst_2        
	//   62   84:iastore         
	//   63   85:dup             
	//   64   86:iconst_3        
	//   65   87:iconst_3        
	//   66   88:iastore         
	//   67   89:dup             
	//   68   90:iconst_4        
	//   69   91:iconst_3        
	//   70   92:iastore         
	//   71   93:dup             
	//   72   94:iconst_5        
	//   73   95:iconst_4        
	//   74   96:iastore         
	//   75   97:dup             
	//   76   98:bipush          6
	//   77  100:iconst_4        
	//   78  101:iastore         
	//   79  102:dup             
	//   80  103:bipush          7
	//   81  105:iconst_5        
	//   82  106:iastore         
	//   83  107:putstatic       #23  <Field int[] d>
	//   84  110:bipush          19
	//   85  112:newarray        int[]
	//   86  114:dup             
	//   87  115:iconst_0        
	//   88  116:bipush          32
	//   89  118:iastore         
	//   90  119:dup             
	//   91  120:iconst_1        
	//   92  121:bipush          40
	//   93  123:iastore         
	//   94  124:dup             
	//   95  125:iconst_2        
	//   96  126:bipush          48
	//   97  128:iastore         
	//   98  129:dup             
	//   99  130:iconst_3        
	//  100  131:bipush          56
	//  101  133:iastore         
	//  102  134:dup             
	//  103  135:iconst_4        
	//  104  136:bipush          64
	//  105  138:iastore         
	//  106  139:dup             
	//  107  140:iconst_5        
	//  108  141:bipush          80
	//  109  143:iastore         
	//  110  144:dup             
	//  111  145:bipush          6
	//  112  147:bipush          96
	//  113  149:iastore         
	//  114  150:dup             
	//  115  151:bipush          7
	//  116  153:bipush          112
	//  117  155:iastore         
	//  118  156:dup             
	//  119  157:bipush          8
	//  120  159:sipush          128
	//  121  162:iastore         
	//  122  163:dup             
	//  123  164:bipush          9
	//  124  166:sipush          160
	//  125  169:iastore         
	//  126  170:dup             
	//  127  171:bipush          10
	//  128  173:sipush          192
	//  129  176:iastore         
	//  130  177:dup             
	//  131  178:bipush          11
	//  132  180:sipush          224
	//  133  183:iastore         
	//  134  184:dup             
	//  135  185:bipush          12
	//  136  187:sipush          256
	//  137  190:iastore         
	//  138  191:dup             
	//  139  192:bipush          13
	//  140  194:sipush          320
	//  141  197:iastore         
	//  142  198:dup             
	//  143  199:bipush          14
	//  144  201:sipush          384
	//  145  204:iastore         
	//  146  205:dup             
	//  147  206:bipush          15
	//  148  208:sipush          448
	//  149  211:iastore         
	//  150  212:dup             
	//  151  213:bipush          16
	//  152  215:sipush          512
	//  153  218:iastore         
	//  154  219:dup             
	//  155  220:bipush          17
	//  156  222:sipush          576
	//  157  225:iastore         
	//  158  226:dup             
	//  159  227:bipush          18
	//  160  229:sipush          640
	//  161  232:iastore         
	//  162  233:putstatic       #25  <Field int[] e>
	//  163  236:bipush          19
	//  164  238:newarray        int[]
	//  165  240:dup             
	//  166  241:iconst_0        
	//  167  242:bipush          69
	//  168  244:iastore         
	//  169  245:dup             
	//  170  246:iconst_1        
	//  171  247:bipush          87
	//  172  249:iastore         
	//  173  250:dup             
	//  174  251:iconst_2        
	//  175  252:bipush          104
	//  176  254:iastore         
	//  177  255:dup             
	//  178  256:iconst_3        
	//  179  257:bipush          121
	//  180  259:iastore         
	//  181  260:dup             
	//  182  261:iconst_4        
	//  183  262:sipush          139
	//  184  265:iastore         
	//  185  266:dup             
	//  186  267:iconst_5        
	//  187  268:sipush          174
	//  188  271:iastore         
	//  189  272:dup             
	//  190  273:bipush          6
	//  191  275:sipush          208
	//  192  278:iastore         
	//  193  279:dup             
	//  194  280:bipush          7
	//  195  282:sipush          243
	//  196  285:iastore         
	//  197  286:dup             
	//  198  287:bipush          8
	//  199  289:sipush          278
	//  200  292:iastore         
	//  201  293:dup             
	//  202  294:bipush          9
	//  203  296:sipush          348
	//  204  299:iastore         
	//  205  300:dup             
	//  206  301:bipush          10
	//  207  303:sipush          417
	//  208  306:iastore         
	//  209  307:dup             
	//  210  308:bipush          11
	//  211  310:sipush          487
	//  212  313:iastore         
	//  213  314:dup             
	//  214  315:bipush          12
	//  215  317:sipush          557
	//  216  320:iastore         
	//  217  321:dup             
	//  218  322:bipush          13
	//  219  324:sipush          696
	//  220  327:iastore         
	//  221  328:dup             
	//  222  329:bipush          14
	//  223  331:sipush          835
	//  224  334:iastore         
	//  225  335:dup             
	//  226  336:bipush          15
	//  227  338:sipush          975
	//  228  341:iastore         
	//  229  342:dup             
	//  230  343:bipush          16
	//  231  345:sipush          1114
	//  232  348:iastore         
	//  233  349:dup             
	//  234  350:bipush          17
	//  235  352:sipush          1253
	//  236  355:iastore         
	//  237  356:dup             
	//  238  357:bipush          18
	//  239  359:sipush          1393
	//  240  362:iastore         
	//  241  363:putstatic       #27  <Field int[] f>
	//* 242  366:return          
	}
}
