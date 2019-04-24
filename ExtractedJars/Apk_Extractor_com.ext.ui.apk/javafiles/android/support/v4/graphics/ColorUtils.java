// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Color;

public final class ColorUtils
{

	private ColorUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public static int HSLToColor(float af[])
	{
		float f;
		float f1;
		float f2;
		float f3;
		f = af[0];
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:faload          
	//    3    3:fstore_1        
		f1 = af[1];
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:faload          
	//    7    7:fstore_2        
		f2 = af[2];
	//    8    8:aload_0         
	//    9    9:iconst_2        
	//   10   10:faload          
	//   11   11:fstore_3        
		f1 = (1.0F - Math.abs(2.0F * f2 - 1.0F)) * f1;
	//   12   12:fconst_1        
	//   13   13:fconst_2        
	//   14   14:fload_3         
	//   15   15:fmul            
	//   16   16:fconst_1        
	//   17   17:fsub            
	//   18   18:invokestatic    #49  <Method float Math.abs(float)>
	//   19   21:fsub            
	//   20   22:fload_2         
	//   21   23:fmul            
	//   22   24:fstore_2        
		f2 -= 0.5F * f1;
	//   23   25:fload_3         
	//   24   26:ldc1            #50  <Float 0.5F>
	//   25   28:fload_2         
	//   26   29:fmul            
	//   27   30:fsub            
	//   28   31:fstore_3        
		f3 = f1 * (1.0F - Math.abs((f / 60F) % 2.0F - 1.0F));
	//   29   32:fload_2         
	//   30   33:fconst_1        
	//   31   34:fload_1         
	//   32   35:ldc1            #51  <Float 60F>
	//   33   37:fdiv            
	//   34   38:fconst_2        
	//   35   39:frem            
	//   36   40:fconst_1        
	//   37   41:fsub            
	//   38   42:invokestatic    #49  <Method float Math.abs(float)>
	//   39   45:fsub            
	//   40   46:fmul            
	//   41   47:fstore          4
		(int)f / 60;
	//   42   49:fload_1         
	//   43   50:f2i             
	//   44   51:bipush          60
	//   45   53:idiv            
		JVM INSTR tableswitch 0 6: default 96
	//	               0 136
	//	               1 171
	//	               2 206
	//	               3 241
	//	               4 276
	//	               5 311
	//	               6 311;
	//   46   54:tableswitch     0 6: default 96
	//	               0 136
	//	               1 171
	//	               2 206
	//	               3 241
	//	               4 276
	//	               5 311
	//	               6 311
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7
_L1:
		int i;
		int j;
		int k;
		i = 0;
	//   47   96:iconst_0        
	//   48   97:istore          5
		j = 0;
	//   49   99:iconst_0        
	//   50  100:istore          6
		k = 0;
	//   51  102:iconst_0        
	//   52  103:istore          7
_L9:
		return Color.rgb(constrain(k, 0, 255), constrain(j, 0, 255), constrain(i, 0, 255));
	//   53  105:iload           7
	//   54  107:iconst_0        
	//   55  108:sipush          255
	//   56  111:invokestatic    #55  <Method int constrain(int, int, int)>
	//   57  114:iload           6
	//   58  116:iconst_0        
	//   59  117:sipush          255
	//   60  120:invokestatic    #55  <Method int constrain(int, int, int)>
	//   61  123:iload           5
	//   62  125:iconst_0        
	//   63  126:sipush          255
	//   64  129:invokestatic    #55  <Method int constrain(int, int, int)>
	//   65  132:invokestatic    #60  <Method int Color.rgb(int, int, int)>
	//   66  135:ireturn         
_L2:
		k = Math.round((f1 + f2) * 255F);
	//   67  136:fload_2         
	//   68  137:fload_3         
	//   69  138:fadd            
	//   70  139:ldc1            #61  <Float 255F>
	//   71  141:fmul            
	//   72  142:invokestatic    #65  <Method int Math.round(float)>
	//   73  145:istore          7
		j = Math.round((f3 + f2) * 255F);
	//   74  147:fload           4
	//   75  149:fload_3         
	//   76  150:fadd            
	//   77  151:ldc1            #61  <Float 255F>
	//   78  153:fmul            
	//   79  154:invokestatic    #65  <Method int Math.round(float)>
	//   80  157:istore          6
		i = Math.round(255F * f2);
	//   81  159:ldc1            #61  <Float 255F>
	//   82  161:fload_3         
	//   83  162:fmul            
	//   84  163:invokestatic    #65  <Method int Math.round(float)>
	//   85  166:istore          5
		continue; /* Loop/switch isn't completed */
	//   86  168:goto            105
_L3:
		k = Math.round((f3 + f2) * 255F);
	//   87  171:fload           4
	//   88  173:fload_3         
	//   89  174:fadd            
	//   90  175:ldc1            #61  <Float 255F>
	//   91  177:fmul            
	//   92  178:invokestatic    #65  <Method int Math.round(float)>
	//   93  181:istore          7
		j = Math.round((f1 + f2) * 255F);
	//   94  183:fload_2         
	//   95  184:fload_3         
	//   96  185:fadd            
	//   97  186:ldc1            #61  <Float 255F>
	//   98  188:fmul            
	//   99  189:invokestatic    #65  <Method int Math.round(float)>
	//  100  192:istore          6
		i = Math.round(255F * f2);
	//  101  194:ldc1            #61  <Float 255F>
	//  102  196:fload_3         
	//  103  197:fmul            
	//  104  198:invokestatic    #65  <Method int Math.round(float)>
	//  105  201:istore          5
		continue; /* Loop/switch isn't completed */
	//  106  203:goto            105
_L4:
		k = Math.round(255F * f2);
	//  107  206:ldc1            #61  <Float 255F>
	//  108  208:fload_3         
	//  109  209:fmul            
	//  110  210:invokestatic    #65  <Method int Math.round(float)>
	//  111  213:istore          7
		j = Math.round((f1 + f2) * 255F);
	//  112  215:fload_2         
	//  113  216:fload_3         
	//  114  217:fadd            
	//  115  218:ldc1            #61  <Float 255F>
	//  116  220:fmul            
	//  117  221:invokestatic    #65  <Method int Math.round(float)>
	//  118  224:istore          6
		i = Math.round((f3 + f2) * 255F);
	//  119  226:fload           4
	//  120  228:fload_3         
	//  121  229:fadd            
	//  122  230:ldc1            #61  <Float 255F>
	//  123  232:fmul            
	//  124  233:invokestatic    #65  <Method int Math.round(float)>
	//  125  236:istore          5
		continue; /* Loop/switch isn't completed */
	//  126  238:goto            105
_L5:
		k = Math.round(255F * f2);
	//  127  241:ldc1            #61  <Float 255F>
	//  128  243:fload_3         
	//  129  244:fmul            
	//  130  245:invokestatic    #65  <Method int Math.round(float)>
	//  131  248:istore          7
		j = Math.round((f3 + f2) * 255F);
	//  132  250:fload           4
	//  133  252:fload_3         
	//  134  253:fadd            
	//  135  254:ldc1            #61  <Float 255F>
	//  136  256:fmul            
	//  137  257:invokestatic    #65  <Method int Math.round(float)>
	//  138  260:istore          6
		i = Math.round((f1 + f2) * 255F);
	//  139  262:fload_2         
	//  140  263:fload_3         
	//  141  264:fadd            
	//  142  265:ldc1            #61  <Float 255F>
	//  143  267:fmul            
	//  144  268:invokestatic    #65  <Method int Math.round(float)>
	//  145  271:istore          5
		continue; /* Loop/switch isn't completed */
	//  146  273:goto            105
_L6:
		k = Math.round((f3 + f2) * 255F);
	//  147  276:fload           4
	//  148  278:fload_3         
	//  149  279:fadd            
	//  150  280:ldc1            #61  <Float 255F>
	//  151  282:fmul            
	//  152  283:invokestatic    #65  <Method int Math.round(float)>
	//  153  286:istore          7
		j = Math.round(255F * f2);
	//  154  288:ldc1            #61  <Float 255F>
	//  155  290:fload_3         
	//  156  291:fmul            
	//  157  292:invokestatic    #65  <Method int Math.round(float)>
	//  158  295:istore          6
		i = Math.round((f1 + f2) * 255F);
	//  159  297:fload_2         
	//  160  298:fload_3         
	//  161  299:fadd            
	//  162  300:ldc1            #61  <Float 255F>
	//  163  302:fmul            
	//  164  303:invokestatic    #65  <Method int Math.round(float)>
	//  165  306:istore          5
		continue; /* Loop/switch isn't completed */
	//  166  308:goto            105
_L7:
		k = Math.round((f1 + f2) * 255F);
	//  167  311:fload_2         
	//  168  312:fload_3         
	//  169  313:fadd            
	//  170  314:ldc1            #61  <Float 255F>
	//  171  316:fmul            
	//  172  317:invokestatic    #65  <Method int Math.round(float)>
	//  173  320:istore          7
		j = Math.round(255F * f2);
	//  174  322:ldc1            #61  <Float 255F>
	//  175  324:fload_3         
	//  176  325:fmul            
	//  177  326:invokestatic    #65  <Method int Math.round(float)>
	//  178  329:istore          6
		i = Math.round((f3 + f2) * 255F);
	//  179  331:fload           4
	//  180  333:fload_3         
	//  181  334:fadd            
	//  182  335:ldc1            #61  <Float 255F>
	//  183  337:fmul            
	//  184  338:invokestatic    #65  <Method int Math.round(float)>
	//  185  341:istore          5
		if(true) goto _L9; else goto _L8
	//  186  343:goto            105
_L8:
	}

	public static int LABToColor(double d, double d1, double d2)
	{
		double ad[] = getTempDouble3Array();
	//    0    0:invokestatic    #82  <Method double[] getTempDouble3Array()>
	//    1    3:astore          6
		LABToXYZ(d, d1, d2, ad);
	//    2    5:dload_0         
	//    3    6:dload_2         
	//    4    7:dload           4
	//    5    9:aload           6
	//    6   11:invokestatic    #86  <Method void LABToXYZ(double, double, double, double[])>
		return XYZToColor(ad[0], ad[1], ad[2]);
	//    7   14:aload           6
	//    8   16:iconst_0        
	//    9   17:daload          
	//   10   18:aload           6
	//   11   20:iconst_1        
	//   12   21:daload          
	//   13   22:aload           6
	//   14   24:iconst_2        
	//   15   25:daload          
	//   16   26:invokestatic    #89  <Method int XYZToColor(double, double, double)>
	//   17   29:ireturn         
	}

	public static void LABToXYZ(double d, double d1, double d2, double ad[])
	{
		double d4 = (16D + d) / 116D;
	//    0    0:ldc2w           #90  <Double 16D>
	//    1    3:dload_0         
	//    2    4:dadd            
	//    3    5:ldc2w           #92  <Double 116D>
	//    4    8:ddiv            
	//    5    9:dstore          9
		double d5 = d1 / 500D + d4;
	//    6   11:dload_2         
	//    7   12:ldc2w           #94  <Double 500D>
	//    8   15:ddiv            
	//    9   16:dload           9
	//   10   18:dadd            
	//   11   19:dstore          11
		double d3 = d4 - d2 / 200D;
	//   12   21:dload           9
	//   13   23:dload           4
	//   14   25:ldc2w           #96  <Double 200D>
	//   15   28:ddiv            
	//   16   29:dsub            
	//   17   30:dstore          7
		d1 = Math.pow(d5, 3D);
	//   18   32:dload           11
	//   19   34:ldc2w           #98  <Double 3D>
	//   20   37:invokestatic    #103 <Method double Math.pow(double, double)>
	//   21   40:dstore_2        
		if(d1 <= 0.0088559999999999993D)
	//*  22   41:dload_2         
	//*  23   42:ldc2w           #15  <Double 0.0088559999999999993D>
	//*  24   45:dcmpl           
	//*  25   46:ifle            114
	//*  26   49:dload_0         
	//*  27   50:ldc2w           #104 <Double 7.9996247999999985D>
	//*  28   53:dcmpl           
	//*  29   54:ifle            132
	//*  30   57:dload           9
	//*  31   59:ldc2w           #98  <Double 3D>
	//*  32   62:invokestatic    #103 <Method double Math.pow(double, double)>
	//*  33   65:dstore_0        
	//*  34   66:dload           7
	//*  35   68:ldc2w           #98  <Double 3D>
	//*  36   71:invokestatic    #103 <Method double Math.pow(double, double)>
	//*  37   74:dstore          4
	//*  38   76:dload           4
	//*  39   78:ldc2w           #15  <Double 0.0088559999999999993D>
	//*  40   81:dcmpl           
	//*  41   82:ifle            141
	//*  42   85:aload           6
	//*  43   87:iconst_0        
	//*  44   88:dload_2         
	//*  45   89:ldc2w           #21  <Double 95.046999999999997D>
	//*  46   92:dmul            
	//*  47   93:dastore         
	//*  48   94:aload           6
	//*  49   96:iconst_1        
	//*  50   97:dload_0         
	//*  51   98:ldc2w           #24  <Double 100D>
	//*  52  101:dmul            
	//*  53  102:dastore         
	//*  54  103:aload           6
	//*  55  105:iconst_2        
	//*  56  106:dload           4
	//*  57  108:ldc2w           #27  <Double 108.883D>
	//*  58  111:dmul            
	//*  59  112:dastore         
	//*  60  113:return          
			d1 = (116D * d5 - 16D) / 903.29999999999995D;
	//   61  114:ldc2w           #92  <Double 116D>
	//   62  117:dload           11
	//   63  119:dmul            
	//   64  120:ldc2w           #90  <Double 16D>
	//   65  123:dsub            
	//   66  124:ldc2w           #18  <Double 903.29999999999995D>
	//   67  127:ddiv            
	//   68  128:dstore_2        
		if(d > 7.9996247999999985D)
			d = Math.pow(d4, 3D);
		else
	//*  69  129:goto            49
			d /= 903.29999999999995D;
	//   70  132:dload_0         
	//   71  133:ldc2w           #18  <Double 903.29999999999995D>
	//   72  136:ddiv            
	//   73  137:dstore_0        
		d2 = Math.pow(d3, 3D);
		if(d2 <= 0.0088559999999999993D)
	//*  74  138:goto            66
			d2 = (116D * d3 - 16D) / 903.29999999999995D;
	//   75  141:ldc2w           #92  <Double 116D>
	//   76  144:dload           7
	//   77  146:dmul            
	//   78  147:ldc2w           #90  <Double 16D>
	//   79  150:dsub            
	//   80  151:ldc2w           #18  <Double 903.29999999999995D>
	//   81  154:ddiv            
	//   82  155:dstore          4
		ad[0] = d1 * 95.046999999999997D;
		ad[1] = d * 100D;
		ad[2] = d2 * 108.883D;
	//*  83  157:goto            85
	}

	public static void RGBToHSL(int i, int j, int k, float af[])
	{
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		f = (float)i / 255F;
	//    0    0:iload_0         
	//    1    1:i2f             
	//    2    2:ldc1            #61  <Float 255F>
	//    3    4:fdiv            
	//    4    5:fstore          4
		f2 = (float)j / 255F;
	//    5    7:iload_1         
	//    6    8:i2f             
	//    7    9:ldc1            #61  <Float 255F>
	//    8   11:fdiv            
	//    9   12:fstore          6
		f4 = (float)k / 255F;
	//   10   14:iload_2         
	//   11   15:i2f             
	//   12   16:ldc1            #61  <Float 255F>
	//   13   18:fdiv            
	//   14   19:fstore          8
		f5 = Math.max(f, Math.max(f2, f4));
	//   15   21:fload           4
	//   16   23:fload           6
	//   17   25:fload           8
	//   18   27:invokestatic    #116 <Method float Math.max(float, float)>
	//   19   30:invokestatic    #116 <Method float Math.max(float, float)>
	//   20   33:fstore          9
		f6 = Math.min(f, Math.min(f2, f4));
	//   21   35:fload           4
	//   22   37:fload           6
	//   23   39:fload           8
	//   24   41:invokestatic    #119 <Method float Math.min(float, float)>
	//   25   44:invokestatic    #119 <Method float Math.min(float, float)>
	//   26   47:fstore          10
		f1 = f5 - f6;
	//   27   49:fload           9
	//   28   51:fload           10
	//   29   53:fsub            
	//   30   54:fstore          5
		f3 = (f5 + f6) / 2.0F;
	//   31   56:fload           9
	//   32   58:fload           10
	//   33   60:fadd            
	//   34   61:fconst_2        
	//   35   62:fdiv            
	//   36   63:fstore          7
		if(f5 != f6) goto _L2; else goto _L1
	//   37   65:fload           9
	//   38   67:fload           10
	//   39   69:fcmpl           
	//   40   70:ifne            139
_L1:
		f = 0.0F;
	//   41   73:fconst_0        
	//   42   74:fstore          4
		f1 = 0.0F;
	//   43   76:fconst_0        
	//   44   77:fstore          5
_L4:
		f2 = (f1 * 60F) % 360F;
	//   45   79:fload           5
	//   46   81:ldc1            #51  <Float 60F>
	//   47   83:fmul            
	//   48   84:ldc1            #120 <Float 360F>
	//   49   86:frem            
	//   50   87:fstore          6
		f1 = f2;
	//   51   89:fload           6
	//   52   91:fstore          5
		if(f2 < 0.0F)
	//*  53   93:fload           6
	//*  54   95:fconst_0        
	//*  55   96:fcmpg           
	//*  56   97:ifge            107
			f1 = f2 + 360F;
	//   57  100:fload           6
	//   58  102:ldc1            #120 <Float 360F>
	//   59  104:fadd            
	//   60  105:fstore          5
		af[0] = constrain(f1, 0.0F, 360F);
	//   61  107:aload_3         
	//   62  108:iconst_0        
	//   63  109:fload           5
	//   64  111:fconst_0        
	//   65  112:ldc1            #120 <Float 360F>
	//   66  114:invokestatic    #123 <Method float constrain(float, float, float)>
	//   67  117:fastore         
		af[1] = constrain(f, 0.0F, 1.0F);
	//   68  118:aload_3         
	//   69  119:iconst_1        
	//   70  120:fload           4
	//   71  122:fconst_0        
	//   72  123:fconst_1        
	//   73  124:invokestatic    #123 <Method float constrain(float, float, float)>
	//   74  127:fastore         
		af[2] = constrain(f3, 0.0F, 1.0F);
	//   75  128:aload_3         
	//   76  129:iconst_2        
	//   77  130:fload           7
	//   78  132:fconst_0        
	//   79  133:fconst_1        
	//   80  134:invokestatic    #123 <Method float constrain(float, float, float)>
	//   81  137:fastore         
		return;
	//   82  138:return          
_L2:
		if(f5 != f)
			break; /* Loop/switch isn't completed */
	//   83  139:fload           9
	//   84  141:fload           4
	//   85  143:fcmpl           
	//   86  144:ifne            187
		f = ((f2 - f4) / f1) % 6F;
	//   87  147:fload           6
	//   88  149:fload           8
	//   89  151:fsub            
	//   90  152:fload           5
	//   91  154:fdiv            
	//   92  155:ldc1            #124 <Float 6F>
	//   93  157:frem            
	//   94  158:fstore          4
_L5:
		f2 = f1 / (1.0F - Math.abs(2.0F * f3 - 1.0F));
	//   95  160:fload           5
	//   96  162:fconst_1        
	//   97  163:fconst_2        
	//   98  164:fload           7
	//   99  166:fmul            
	//  100  167:fconst_1        
	//  101  168:fsub            
	//  102  169:invokestatic    #49  <Method float Math.abs(float)>
	//  103  172:fsub            
	//  104  173:fdiv            
	//  105  174:fstore          6
		f1 = f;
	//  106  176:fload           4
	//  107  178:fstore          5
		f = f2;
	//  108  180:fload           6
	//  109  182:fstore          4
		if(true) goto _L4; else goto _L3
	//  110  184:goto            79
_L3:
		if(f5 == f2)
	//* 111  187:fload           9
	//* 112  189:fload           6
	//* 113  191:fcmpl           
	//* 114  192:ifne            210
			f = (f4 - f) / f1 + 2.0F;
	//  115  195:fload           8
	//  116  197:fload           4
	//  117  199:fsub            
	//  118  200:fload           5
	//  119  202:fdiv            
	//  120  203:fconst_2        
	//  121  204:fadd            
	//  122  205:fstore          4
		else
	//* 123  207:goto            160
			f = (f - f2) / f1 + 4F;
	//  124  210:fload           4
	//  125  212:fload           6
	//  126  214:fsub            
	//  127  215:fload           5
	//  128  217:fdiv            
	//  129  218:ldc1            #125 <Float 4F>
	//  130  220:fadd            
	//  131  221:fstore          4
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 132  223:goto            160
	}

	public static void RGBToLAB(int i, int j, int k, double ad[])
	{
		RGBToXYZ(i, j, k, ad);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #130 <Method void RGBToXYZ(int, int, int, double[])>
		XYZToLAB(ad[0], ad[1], ad[2], ad);
	//    5    7:aload_3         
	//    6    8:iconst_0        
	//    7    9:daload          
	//    8   10:aload_3         
	//    9   11:iconst_1        
	//   10   12:daload          
	//   11   13:aload_3         
	//   12   14:iconst_2        
	//   13   15:daload          
	//   14   16:aload_3         
	//   15   17:invokestatic    #133 <Method void XYZToLAB(double, double, double, double[])>
	//   16   20:return          
	}

	public static void RGBToXYZ(int i, int j, int k, double ad[])
	{
		if(ad.length != 3)
	//*   0    0:aload_3         
	//*   1    1:arraylength     
	//*   2    2:iconst_3        
	//*   3    3:icmpeq          16
			throw new IllegalArgumentException("outXyz must have a length of 3.");
	//    4    6:new             #135 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #137 <String "outXyz must have a length of 3.">
	//    7   12:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		double d = (double)i / 255D;
	//    9   16:iload_0         
	//   10   17:i2d             
	//   11   18:ldc2w           #141 <Double 255D>
	//   12   21:ddiv            
	//   13   22:dstore          4
		double d1;
		double d2;
		if(d < 0.04045D)
	//*  14   24:dload           4
	//*  15   26:ldc2w           #143 <Double 0.04045D>
	//*  16   29:dcmpg           
	//*  17   30:ifge            173
			d /= 12.92D;
	//   18   33:dload           4
	//   19   35:ldc2w           #145 <Double 12.92D>
	//   20   38:ddiv            
	//   21   39:dstore          4
		else
	//*  22   41:iload_1         
	//*  23   42:i2d             
	//*  24   43:ldc2w           #141 <Double 255D>
	//*  25   46:ddiv            
	//*  26   47:dstore          6
	//*  27   49:dload           6
	//*  28   51:ldc2w           #143 <Double 0.04045D>
	//*  29   54:dcmpg           
	//*  30   55:ifge            194
	//*  31   58:dload           6
	//*  32   60:ldc2w           #145 <Double 12.92D>
	//*  33   63:ddiv            
	//*  34   64:dstore          6
	//*  35   66:iload_2         
	//*  36   67:i2d             
	//*  37   68:ldc2w           #141 <Double 255D>
	//*  38   71:ddiv            
	//*  39   72:dstore          8
	//*  40   74:dload           8
	//*  41   76:ldc2w           #143 <Double 0.04045D>
	//*  42   79:dcmpg           
	//*  43   80:ifge            215
	//*  44   83:dload           8
	//*  45   85:ldc2w           #145 <Double 12.92D>
	//*  46   88:ddiv            
	//*  47   89:dstore          8
	//*  48   91:aload_3         
	//*  49   92:iconst_0        
	//*  50   93:ldc2w           #24  <Double 100D>
	//*  51   96:ldc2w           #147 <Double 0.41239999999999999D>
	//*  52   99:dload           4
	//*  53  101:dmul            
	//*  54  102:ldc2w           #149 <Double 0.35759999999999997D>
	//*  55  105:dload           6
	//*  56  107:dmul            
	//*  57  108:dadd            
	//*  58  109:ldc2w           #151 <Double 0.18049999999999999D>
	//*  59  112:dload           8
	//*  60  114:dmul            
	//*  61  115:dadd            
	//*  62  116:dmul            
	//*  63  117:dastore         
	//*  64  118:aload_3         
	//*  65  119:iconst_1        
	//*  66  120:ldc2w           #24  <Double 100D>
	//*  67  123:ldc2w           #153 <Double 0.21260000000000001D>
	//*  68  126:dload           4
	//*  69  128:dmul            
	//*  70  129:ldc2w           #155 <Double 0.71519999999999995D>
	//*  71  132:dload           6
	//*  72  134:dmul            
	//*  73  135:dadd            
	//*  74  136:ldc2w           #157 <Double 0.0722D>
	//*  75  139:dload           8
	//*  76  141:dmul            
	//*  77  142:dadd            
	//*  78  143:dmul            
	//*  79  144:dastore         
	//*  80  145:aload_3         
	//*  81  146:iconst_2        
	//*  82  147:dload           8
	//*  83  149:ldc2w           #159 <Double 0.95050000000000001D>
	//*  84  152:dmul            
	//*  85  153:dload           6
	//*  86  155:ldc2w           #161 <Double 0.1192D>
	//*  87  158:dmul            
	//*  88  159:dload           4
	//*  89  161:ldc2w           #163 <Double 0.019300000000000001D>
	//*  90  164:dmul            
	//*  91  165:dadd            
	//*  92  166:dadd            
	//*  93  167:ldc2w           #24  <Double 100D>
	//*  94  170:dmul            
	//*  95  171:dastore         
	//*  96  172:return          
			d = Math.pow((d + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
	//   97  173:dload           4
	//   98  175:ldc2w           #165 <Double 0.055D>
	//   99  178:dadd            
	//  100  179:ldc2w           #167 <Double 1.0549999999999999D>
	//  101  182:ddiv            
	//  102  183:ldc2w           #169 <Double 2.3999999999999999D>
	//  103  186:invokestatic    #103 <Method double Math.pow(double, double)>
	//  104  189:dstore          4
		d1 = (double)j / 255D;
		if(d1 < 0.04045D)
			d1 /= 12.92D;
		else
	//* 105  191:goto            41
			d1 = Math.pow((d1 + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
	//  106  194:dload           6
	//  107  196:ldc2w           #165 <Double 0.055D>
	//  108  199:dadd            
	//  109  200:ldc2w           #167 <Double 1.0549999999999999D>
	//  110  203:ddiv            
	//  111  204:ldc2w           #169 <Double 2.3999999999999999D>
	//  112  207:invokestatic    #103 <Method double Math.pow(double, double)>
	//  113  210:dstore          6
		d2 = (double)k / 255D;
		if(d2 < 0.04045D)
			d2 /= 12.92D;
		else
	//* 114  212:goto            66
			d2 = Math.pow((d2 + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
	//  115  215:dload           8
	//  116  217:ldc2w           #165 <Double 0.055D>
	//  117  220:dadd            
	//  118  221:ldc2w           #167 <Double 1.0549999999999999D>
	//  119  224:ddiv            
	//  120  225:ldc2w           #169 <Double 2.3999999999999999D>
	//  121  228:invokestatic    #103 <Method double Math.pow(double, double)>
	//  122  231:dstore          8
		ad[0] = 100D * (0.41239999999999999D * d + 0.35759999999999997D * d1 + 0.18049999999999999D * d2);
		ad[1] = 100D * (0.21260000000000001D * d + 0.71519999999999995D * d1 + 0.0722D * d2);
		ad[2] = (d2 * 0.95050000000000001D + (d1 * 0.1192D + d * 0.019300000000000001D)) * 100D;
	//* 123  233:goto            91
	}

	public static int XYZToColor(double d, double d1, double d2)
	{
		double d4 = (3.2406000000000001D * d + -1.5371999999999999D * d1 + -0.49859999999999999D * d2) / 100D;
	//    0    0:ldc2w           #171 <Double 3.2406000000000001D>
	//    1    3:dload_0         
	//    2    4:dmul            
	//    3    5:ldc2w           #173 <Double -1.5371999999999999D>
	//    4    8:dload_2         
	//    5    9:dmul            
	//    6   10:dadd            
	//    7   11:ldc2w           #175 <Double -0.49859999999999999D>
	//    8   14:dload           4
	//    9   16:dmul            
	//   10   17:dadd            
	//   11   18:ldc2w           #24  <Double 100D>
	//   12   21:ddiv            
	//   13   22:dstore          8
		double d3 = (-0.96889999999999998D * d + 1.8757999999999999D * d1 + 0.041500000000000002D * d2) / 100D;
	//   14   24:ldc2w           #177 <Double -0.96889999999999998D>
	//   15   27:dload_0         
	//   16   28:dmul            
	//   17   29:ldc2w           #179 <Double 1.8757999999999999D>
	//   18   32:dload_2         
	//   19   33:dmul            
	//   20   34:dadd            
	//   21   35:ldc2w           #181 <Double 0.041500000000000002D>
	//   22   38:dload           4
	//   23   40:dmul            
	//   24   41:dadd            
	//   25   42:ldc2w           #24  <Double 100D>
	//   26   45:ddiv            
	//   27   46:dstore          6
		d2 = (0.0557D * d + -0.20399999999999999D * d1 + 1.0569999999999999D * d2) / 100D;
	//   28   48:ldc2w           #183 <Double 0.0557D>
	//   29   51:dload_0         
	//   30   52:dmul            
	//   31   53:ldc2w           #185 <Double -0.20399999999999999D>
	//   32   56:dload_2         
	//   33   57:dmul            
	//   34   58:dadd            
	//   35   59:ldc2w           #187 <Double 1.0569999999999999D>
	//   36   62:dload           4
	//   37   64:dmul            
	//   38   65:dadd            
	//   39   66:ldc2w           #24  <Double 100D>
	//   40   69:ddiv            
	//   41   70:dstore          4
		if(d4 > 0.0031308D)
	//*  42   72:dload           8
	//*  43   74:ldc2w           #189 <Double 0.0031308D>
	//*  44   77:dcmpl           
	//*  45   78:ifle            204
			d = Math.pow(d4, 0.41666666666666669D) * 1.0549999999999999D - 0.055D;
	//   46   81:dload           8
	//   47   83:ldc2w           #191 <Double 0.41666666666666669D>
	//   48   86:invokestatic    #103 <Method double Math.pow(double, double)>
	//   49   89:ldc2w           #167 <Double 1.0549999999999999D>
	//   50   92:dmul            
	//   51   93:ldc2w           #165 <Double 0.055D>
	//   52   96:dsub            
	//   53   97:dstore_0        
		else
	//*  54   98:dload           6
	//*  55  100:ldc2w           #189 <Double 0.0031308D>
	//*  56  103:dcmpl           
	//*  57  104:ifle            214
	//*  58  107:ldc2w           #167 <Double 1.0549999999999999D>
	//*  59  110:dload           6
	//*  60  112:ldc2w           #191 <Double 0.41666666666666669D>
	//*  61  115:invokestatic    #103 <Method double Math.pow(double, double)>
	//*  62  118:dmul            
	//*  63  119:ldc2w           #165 <Double 0.055D>
	//*  64  122:dsub            
	//*  65  123:dstore_2        
	//*  66  124:dload           4
	//*  67  126:ldc2w           #189 <Double 0.0031308D>
	//*  68  129:dcmpl           
	//*  69  130:ifle            224
	//*  70  133:ldc2w           #167 <Double 1.0549999999999999D>
	//*  71  136:dload           4
	//*  72  138:ldc2w           #191 <Double 0.41666666666666669D>
	//*  73  141:invokestatic    #103 <Method double Math.pow(double, double)>
	//*  74  144:dmul            
	//*  75  145:ldc2w           #165 <Double 0.055D>
	//*  76  148:dsub            
	//*  77  149:dstore          4
	//*  78  151:dload_0         
	//*  79  152:ldc2w           #141 <Double 255D>
	//*  80  155:dmul            
	//*  81  156:invokestatic    #195 <Method long Math.round(double)>
	//*  82  159:l2i             
	//*  83  160:iconst_0        
	//*  84  161:sipush          255
	//*  85  164:invokestatic    #55  <Method int constrain(int, int, int)>
	//*  86  167:dload_2         
	//*  87  168:ldc2w           #141 <Double 255D>
	//*  88  171:dmul            
	//*  89  172:invokestatic    #195 <Method long Math.round(double)>
	//*  90  175:l2i             
	//*  91  176:iconst_0        
	//*  92  177:sipush          255
	//*  93  180:invokestatic    #55  <Method int constrain(int, int, int)>
	//*  94  183:dload           4
	//*  95  185:ldc2w           #141 <Double 255D>
	//*  96  188:dmul            
	//*  97  189:invokestatic    #195 <Method long Math.round(double)>
	//*  98  192:l2i             
	//*  99  193:iconst_0        
	//* 100  194:sipush          255
	//* 101  197:invokestatic    #55  <Method int constrain(int, int, int)>
	//* 102  200:invokestatic    #60  <Method int Color.rgb(int, int, int)>
	//* 103  203:ireturn         
			d = d4 * 12.92D;
	//  104  204:dload           8
	//  105  206:ldc2w           #145 <Double 12.92D>
	//  106  209:dmul            
	//  107  210:dstore_0        
		if(d3 > 0.0031308D)
			d1 = 1.0549999999999999D * Math.pow(d3, 0.41666666666666669D) - 0.055D;
		else
	//* 108  211:goto            98
			d1 = 12.92D * d3;
	//  109  214:ldc2w           #145 <Double 12.92D>
	//  110  217:dload           6
	//  111  219:dmul            
	//  112  220:dstore_2        
		if(d2 > 0.0031308D)
			d2 = 1.0549999999999999D * Math.pow(d2, 0.41666666666666669D) - 0.055D;
		else
	//* 113  221:goto            124
			d2 = 12.92D * d2;
	//  114  224:ldc2w           #145 <Double 12.92D>
	//  115  227:dload           4
	//  116  229:dmul            
	//  117  230:dstore          4
		return Color.rgb(constrain((int)Math.round(d * 255D), 0, 255), constrain((int)Math.round(d1 * 255D), 0, 255), constrain((int)Math.round(d2 * 255D), 0, 255));
	//* 118  232:goto            151
	}

	public static void XYZToLAB(double d, double d1, double d2, double ad[])
	{
		if(ad.length != 3)
	//*   0    0:aload           6
	//*   1    2:arraylength     
	//*   2    3:iconst_3        
	//*   3    4:icmpeq          17
		{
			throw new IllegalArgumentException("outLab must have a length of 3.");
	//    4    7:new             #135 <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #197 <String "outLab must have a length of 3.">
	//    7   13:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		} else
		{
			d = pivotXyzComponent(d / 95.046999999999997D);
	//    9   17:dload_0         
	//   10   18:ldc2w           #21  <Double 95.046999999999997D>
	//   11   21:ddiv            
	//   12   22:invokestatic    #201 <Method double pivotXyzComponent(double)>
	//   13   25:dstore_0        
			d1 = pivotXyzComponent(d1 / 100D);
	//   14   26:dload_2         
	//   15   27:ldc2w           #24  <Double 100D>
	//   16   30:ddiv            
	//   17   31:invokestatic    #201 <Method double pivotXyzComponent(double)>
	//   18   34:dstore_2        
			d2 = pivotXyzComponent(d2 / 108.883D);
	//   19   35:dload           4
	//   20   37:ldc2w           #27  <Double 108.883D>
	//   21   40:ddiv            
	//   22   41:invokestatic    #201 <Method double pivotXyzComponent(double)>
	//   23   44:dstore          4
			ad[0] = Math.max(0.0D, 116D * d1 - 16D);
	//   24   46:aload           6
	//   25   48:iconst_0        
	//   26   49:dconst_0        
	//   27   50:ldc2w           #92  <Double 116D>
	//   28   53:dload_2         
	//   29   54:dmul            
	//   30   55:ldc2w           #90  <Double 16D>
	//   31   58:dsub            
	//   32   59:invokestatic    #203 <Method double Math.max(double, double)>
	//   33   62:dastore         
			ad[1] = (d - d1) * 500D;
	//   34   63:aload           6
	//   35   65:iconst_1        
	//   36   66:dload_0         
	//   37   67:dload_2         
	//   38   68:dsub            
	//   39   69:ldc2w           #94  <Double 500D>
	//   40   72:dmul            
	//   41   73:dastore         
			ad[2] = (d1 - d2) * 200D;
	//   42   74:aload           6
	//   43   76:iconst_2        
	//   44   77:dload_2         
	//   45   78:dload           4
	//   46   80:dsub            
	//   47   81:ldc2w           #96  <Double 200D>
	//   48   84:dmul            
	//   49   85:dastore         
			return;
	//   50   86:return          
		}
	}

	public static int blendARGB(int i, int j, float f)
	{
		float f1 = 1.0F - f;
	//    0    0:fconst_1        
	//    1    1:fload_2         
	//    2    2:fsub            
	//    3    3:fstore_3        
		float f2 = Color.alpha(i);
	//    4    4:iload_0         
	//    5    5:invokestatic    #211 <Method int Color.alpha(int)>
	//    6    8:i2f             
	//    7    9:fstore          4
		float f3 = Color.alpha(j);
	//    8   11:iload_1         
	//    9   12:invokestatic    #211 <Method int Color.alpha(int)>
	//   10   15:i2f             
	//   11   16:fstore          5
		float f4 = Color.red(i);
	//   12   18:iload_0         
	//   13   19:invokestatic    #214 <Method int Color.red(int)>
	//   14   22:i2f             
	//   15   23:fstore          6
		float f5 = Color.red(j);
	//   16   25:iload_1         
	//   17   26:invokestatic    #214 <Method int Color.red(int)>
	//   18   29:i2f             
	//   19   30:fstore          7
		float f6 = Color.green(i);
	//   20   32:iload_0         
	//   21   33:invokestatic    #217 <Method int Color.green(int)>
	//   22   36:i2f             
	//   23   37:fstore          8
		float f7 = Color.green(j);
	//   24   39:iload_1         
	//   25   40:invokestatic    #217 <Method int Color.green(int)>
	//   26   43:i2f             
	//   27   44:fstore          9
		float f8 = Color.blue(i);
	//   28   46:iload_0         
	//   29   47:invokestatic    #220 <Method int Color.blue(int)>
	//   30   50:i2f             
	//   31   51:fstore          10
		float f9 = Color.blue(j);
	//   32   53:iload_1         
	//   33   54:invokestatic    #220 <Method int Color.blue(int)>
	//   34   57:i2f             
	//   35   58:fstore          11
		return Color.argb((int)(f2 * f1 + f3 * f), (int)(f4 * f1 + f5 * f), (int)(f6 * f1 + f7 * f), (int)(f1 * f8 + f9 * f));
	//   36   60:fload           4
	//   37   62:fload_3         
	//   38   63:fmul            
	//   39   64:fload           5
	//   40   66:fload_2         
	//   41   67:fmul            
	//   42   68:fadd            
	//   43   69:f2i             
	//   44   70:fload           6
	//   45   72:fload_3         
	//   46   73:fmul            
	//   47   74:fload           7
	//   48   76:fload_2         
	//   49   77:fmul            
	//   50   78:fadd            
	//   51   79:f2i             
	//   52   80:fload           8
	//   53   82:fload_3         
	//   54   83:fmul            
	//   55   84:fload           9
	//   56   86:fload_2         
	//   57   87:fmul            
	//   58   88:fadd            
	//   59   89:f2i             
	//   60   90:fload_3         
	//   61   91:fload           10
	//   62   93:fmul            
	//   63   94:fload           11
	//   64   96:fload_2         
	//   65   97:fmul            
	//   66   98:fadd            
	//   67   99:f2i             
	//   68  100:invokestatic    #224 <Method int Color.argb(int, int, int, int)>
	//   69  103:ireturn         
	}

	public static void blendHSL(float af[], float af1[], float f, float af2[])
	{
		if(af2.length != 3)
	//*   0    0:aload_3         
	//*   1    1:arraylength     
	//*   2    2:iconst_3        
	//*   3    3:icmpeq          16
		{
			throw new IllegalArgumentException("result must have a length of 3.");
	//    4    6:new             #135 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #228 <String "result must have a length of 3.">
	//    7   12:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		} else
		{
			float f1 = 1.0F - f;
	//    9   16:fconst_1        
	//   10   17:fload_2         
	//   11   18:fsub            
	//   12   19:fstore          4
			af2[0] = circularInterpolate(af[0], af1[0], f);
	//   13   21:aload_3         
	//   14   22:iconst_0        
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:faload          
	//   18   26:aload_1         
	//   19   27:iconst_0        
	//   20   28:faload          
	//   21   29:fload_2         
	//   22   30:invokestatic    #231 <Method float circularInterpolate(float, float, float)>
	//   23   33:fastore         
			af2[1] = af[1] * f1 + af1[1] * f;
	//   24   34:aload_3         
	//   25   35:iconst_1        
	//   26   36:aload_0         
	//   27   37:iconst_1        
	//   28   38:faload          
	//   29   39:fload           4
	//   30   41:fmul            
	//   31   42:aload_1         
	//   32   43:iconst_1        
	//   33   44:faload          
	//   34   45:fload_2         
	//   35   46:fmul            
	//   36   47:fadd            
	//   37   48:fastore         
			af2[2] = f1 * af[2] + af1[2] * f;
	//   38   49:aload_3         
	//   39   50:iconst_2        
	//   40   51:fload           4
	//   41   53:aload_0         
	//   42   54:iconst_2        
	//   43   55:faload          
	//   44   56:fmul            
	//   45   57:aload_1         
	//   46   58:iconst_2        
	//   47   59:faload          
	//   48   60:fload_2         
	//   49   61:fmul            
	//   50   62:fadd            
	//   51   63:fastore         
			return;
	//   52   64:return          
		}
	}

	public static void blendLAB(double ad[], double ad1[], double d, double ad2[])
	{
		if(ad2.length != 3)
	//*   0    0:aload           4
	//*   1    2:arraylength     
	//*   2    3:iconst_3        
	//*   3    4:icmpeq          17
		{
			throw new IllegalArgumentException("outResult must have a length of 3.");
	//    4    7:new             #135 <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #235 <String "outResult must have a length of 3.">
	//    7   13:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		} else
		{
			double d1 = 1.0D - d;
	//    9   17:dconst_1        
	//   10   18:dload_2         
	//   11   19:dsub            
	//   12   20:dstore          5
			ad2[0] = ad[0] * d1 + ad1[0] * d;
	//   13   22:aload           4
	//   14   24:iconst_0        
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:daload          
	//   18   28:dload           5
	//   19   30:dmul            
	//   20   31:aload_1         
	//   21   32:iconst_0        
	//   22   33:daload          
	//   23   34:dload_2         
	//   24   35:dmul            
	//   25   36:dadd            
	//   26   37:dastore         
			ad2[1] = ad[1] * d1 + ad1[1] * d;
	//   27   38:aload           4
	//   28   40:iconst_1        
	//   29   41:aload_0         
	//   30   42:iconst_1        
	//   31   43:daload          
	//   32   44:dload           5
	//   33   46:dmul            
	//   34   47:aload_1         
	//   35   48:iconst_1        
	//   36   49:daload          
	//   37   50:dload_2         
	//   38   51:dmul            
	//   39   52:dadd            
	//   40   53:dastore         
			ad2[2] = d1 * ad[2] + ad1[2] * d;
	//   41   54:aload           4
	//   42   56:iconst_2        
	//   43   57:dload           5
	//   44   59:aload_0         
	//   45   60:iconst_2        
	//   46   61:daload          
	//   47   62:dmul            
	//   48   63:aload_1         
	//   49   64:iconst_2        
	//   50   65:daload          
	//   51   66:dload_2         
	//   52   67:dmul            
	//   53   68:dadd            
	//   54   69:dastore         
			return;
	//   55   70:return          
		}
	}

	public static double calculateContrast(int i, int j)
	{
		if(Color.alpha(j) != 255)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #211 <Method int Color.alpha(int)>
	//*   2    4:sipush          255
	//*   3    7:icmpeq          40
			throw new IllegalArgumentException((new StringBuilder()).append("background can not be translucent: #").append(Integer.toHexString(j)).toString());
	//    4   10:new             #135 <Class IllegalArgumentException>
	//    5   13:dup             
	//    6   14:new             #239 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #240 <Method void StringBuilder()>
	//    9   21:ldc1            #242 <String "background can not be translucent: #">
	//   10   23:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:iload_1         
	//   12   27:invokestatic    #252 <Method String Integer.toHexString(int)>
	//   13   30:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   15   36:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   16   39:athrow          
		int k = i;
	//   17   40:iload_0         
	//   18   41:istore          6
		if(Color.alpha(i) < 255)
	//*  19   43:iload_0         
	//*  20   44:invokestatic    #211 <Method int Color.alpha(int)>
	//*  21   47:sipush          255
	//*  22   50:icmpge          60
			k = compositeColors(i, j);
	//   23   53:iload_0         
	//   24   54:iload_1         
	//   25   55:invokestatic    #260 <Method int compositeColors(int, int)>
	//   26   58:istore          6
		double d = calculateLuminance(k) + 0.050000000000000003D;
	//   27   60:iload           6
	//   28   62:invokestatic    #264 <Method double calculateLuminance(int)>
	//   29   65:ldc2w           #265 <Double 0.050000000000000003D>
	//   30   68:dadd            
	//   31   69:dstore_2        
		double d1 = calculateLuminance(j) + 0.050000000000000003D;
	//   32   70:iload_1         
	//   33   71:invokestatic    #264 <Method double calculateLuminance(int)>
	//   34   74:ldc2w           #265 <Double 0.050000000000000003D>
	//   35   77:dadd            
	//   36   78:dstore          4
		return Math.max(d, d1) / Math.min(d, d1);
	//   37   80:dload_2         
	//   38   81:dload           4
	//   39   83:invokestatic    #203 <Method double Math.max(double, double)>
	//   40   86:dload_2         
	//   41   87:dload           4
	//   42   89:invokestatic    #268 <Method double Math.min(double, double)>
	//   43   92:ddiv            
	//   44   93:dreturn         
	}

	public static double calculateLuminance(int i)
	{
		double ad[] = getTempDouble3Array();
	//    0    0:invokestatic    #82  <Method double[] getTempDouble3Array()>
	//    1    3:astore_1        
		colorToXYZ(i, ad);
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #272 <Method void colorToXYZ(int, double[])>
		return ad[1] / 100D;
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:daload          
	//    8   12:ldc2w           #24  <Double 100D>
	//    9   15:ddiv            
	//   10   16:dreturn         
	}

	public static int calculateMinimumAlpha(int i, int j, float f)
	{
		int k;
		int l;
		l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		k = 255;
	//    2    3:sipush          255
	//    3    6:istore_3        
		if(Color.alpha(j) != 255)
	//*   4    7:iload_1         
	//*   5    8:invokestatic    #211 <Method int Color.alpha(int)>
	//*   6   11:sipush          255
	//*   7   14:icmpeq          47
			throw new IllegalArgumentException((new StringBuilder()).append("background can not be translucent: #").append(Integer.toHexString(j)).toString());
	//    8   17:new             #135 <Class IllegalArgumentException>
	//    9   20:dup             
	//   10   21:new             #239 <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #240 <Method void StringBuilder()>
	//   13   28:ldc1            #242 <String "background can not be translucent: #">
	//   14   30:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:iload_1         
	//   16   34:invokestatic    #252 <Method String Integer.toHexString(int)>
	//   17   37:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   19   43:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   20   46:athrow          
		if(calculateContrast(setAlphaComponent(i, 255), j) >= (double)f) goto _L2; else goto _L1
	//   21   47:iload_0         
	//   22   48:sipush          255
	//   23   51:invokestatic    #276 <Method int setAlphaComponent(int, int)>
	//   24   54:iload_1         
	//   25   55:invokestatic    #278 <Method double calculateContrast(int, int)>
	//   26   58:fload_2         
	//   27   59:f2d             
	//   28   60:dcmpg           
	//   29   61:ifge            70
_L1:
		char c = '\uFFFF';
	//   30   64:iconst_m1       
	//   31   65:istore          6
_L4:
		return ((int) (c));
	//   32   67:iload           6
	//   33   69:ireturn         
_L2:
		int i1 = 0;
	//   34   70:iconst_0        
	//   35   71:istore          5
_L6:
		c = ((char) (k));
	//   36   73:iload_3         
	//   37   74:istore          6
		if(i1 > 10) goto _L4; else goto _L3
	//   38   76:iload           5
	//   39   78:bipush          10
	//   40   80:icmpgt          67
_L3:
		c = ((char) (k));
	//   41   83:iload_3         
	//   42   84:istore          6
		if(k - l <= 1) goto _L4; else goto _L5
	//   43   86:iload_3         
	//   44   87:iload           4
	//   45   89:isub            
	//   46   90:iconst_1        
	//   47   91:icmple          67
_L5:
		int j1 = (l + k) / 2;
	//   48   94:iload           4
	//   49   96:iload_3         
	//   50   97:iadd            
	//   51   98:iconst_2        
	//   52   99:idiv            
	//   53  100:istore          6
		if(calculateContrast(setAlphaComponent(i, j1), j) < (double)f)
	//*  54  102:iload_0         
	//*  55  103:iload           6
	//*  56  105:invokestatic    #276 <Method int setAlphaComponent(int, int)>
	//*  57  108:iload_1         
	//*  58  109:invokestatic    #278 <Method double calculateContrast(int, int)>
	//*  59  112:fload_2         
	//*  60  113:f2d             
	//*  61  114:dcmpg           
	//*  62  115:ifge            131
			l = j1;
	//   63  118:iload           6
	//   64  120:istore          4
		else
	//*  65  122:iload           5
	//*  66  124:iconst_1        
	//*  67  125:iadd            
	//*  68  126:istore          5
	//*  69  128:goto            73
			k = j1;
	//   70  131:iload           6
	//   71  133:istore_3        
		i1++;
		  goto _L6
	//*  72  134:goto            122
	}

	static float circularInterpolate(float f, float f1, float f2)
	{
		float f3 = f;
	//    0    0:fload_0         
	//    1    1:fstore_3        
		float f4 = f1;
	//    2    2:fload_1         
	//    3    3:fstore          4
		if(Math.abs(f1 - f) > 180F)
	//*   4    5:fload_1         
	//*   5    6:fload_0         
	//*   6    7:fsub            
	//*   7    8:invokestatic    #49  <Method float Math.abs(float)>
	//*   8   11:ldc2            #280 <Float 180F>
	//*   9   14:fcmpl           
	//*  10   15:ifle            32
			if(f1 > f)
	//*  11   18:fload_1         
	//*  12   19:fload_0         
	//*  13   20:fcmpl           
	//*  14   21:ifle            44
			{
				f3 = f + 360F;
	//   15   24:fload_0         
	//   16   25:ldc1            #120 <Float 360F>
	//   17   27:fadd            
	//   18   28:fstore_3        
				f4 = f1;
	//   19   29:fload_1         
	//   20   30:fstore          4
			} else
	//*  21   32:fload           4
	//*  22   34:fload_3         
	//*  23   35:fsub            
	//*  24   36:fload_2         
	//*  25   37:fmul            
	//*  26   38:fload_3         
	//*  27   39:fadd            
	//*  28   40:ldc1            #120 <Float 360F>
	//*  29   42:frem            
	//*  30   43:freturn         
			{
				f4 = f1 + 360F;
	//   31   44:fload_1         
	//   32   45:ldc1            #120 <Float 360F>
	//   33   47:fadd            
	//   34   48:fstore          4
				f3 = f;
	//   35   50:fload_0         
	//   36   51:fstore_3        
			}
		return ((f4 - f3) * f2 + f3) % 360F;
	//*  37   52:goto            32
	}

	public static void colorToHSL(int i, float af[])
	{
		RGBToHSL(Color.red(i), Color.green(i), Color.blue(i), af);
	//    0    0:iload_0         
	//    1    1:invokestatic    #214 <Method int Color.red(int)>
	//    2    4:iload_0         
	//    3    5:invokestatic    #217 <Method int Color.green(int)>
	//    4    8:iload_0         
	//    5    9:invokestatic    #220 <Method int Color.blue(int)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #284 <Method void RGBToHSL(int, int, int, float[])>
	//    8   16:return          
	}

	public static void colorToLAB(int i, double ad[])
	{
		RGBToLAB(Color.red(i), Color.green(i), Color.blue(i), ad);
	//    0    0:iload_0         
	//    1    1:invokestatic    #214 <Method int Color.red(int)>
	//    2    4:iload_0         
	//    3    5:invokestatic    #217 <Method int Color.green(int)>
	//    4    8:iload_0         
	//    5    9:invokestatic    #220 <Method int Color.blue(int)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #287 <Method void RGBToLAB(int, int, int, double[])>
	//    8   16:return          
	}

	public static void colorToXYZ(int i, double ad[])
	{
		RGBToXYZ(Color.red(i), Color.green(i), Color.blue(i), ad);
	//    0    0:iload_0         
	//    1    1:invokestatic    #214 <Method int Color.red(int)>
	//    2    4:iload_0         
	//    3    5:invokestatic    #217 <Method int Color.green(int)>
	//    4    8:iload_0         
	//    5    9:invokestatic    #220 <Method int Color.blue(int)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #130 <Method void RGBToXYZ(int, int, int, double[])>
	//    8   16:return          
	}

	private static int compositeAlpha(int i, int j)
	{
		return 255 - ((255 - j) * (255 - i)) / 255;
	//    0    0:sipush          255
	//    1    3:sipush          255
	//    2    6:iload_1         
	//    3    7:isub            
	//    4    8:sipush          255
	//    5   11:iload_0         
	//    6   12:isub            
	//    7   13:imul            
	//    8   14:sipush          255
	//    9   17:idiv            
	//   10   18:isub            
	//   11   19:ireturn         
	}

	public static int compositeColors(int i, int j)
	{
		int k = Color.alpha(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #211 <Method int Color.alpha(int)>
	//    2    4:istore_2        
		int l = Color.alpha(i);
	//    3    5:iload_0         
	//    4    6:invokestatic    #211 <Method int Color.alpha(int)>
	//    5    9:istore_3        
		int i1 = compositeAlpha(l, k);
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:invokestatic    #290 <Method int compositeAlpha(int, int)>
	//    9   15:istore          4
		return Color.argb(i1, compositeComponent(Color.red(i), l, Color.red(j), k, i1), compositeComponent(Color.green(i), l, Color.green(j), k, i1), compositeComponent(Color.blue(i), l, Color.blue(j), k, i1));
	//   10   17:iload           4
	//   11   19:iload_0         
	//   12   20:invokestatic    #214 <Method int Color.red(int)>
	//   13   23:iload_3         
	//   14   24:iload_1         
	//   15   25:invokestatic    #214 <Method int Color.red(int)>
	//   16   28:iload_2         
	//   17   29:iload           4
	//   18   31:invokestatic    #294 <Method int compositeComponent(int, int, int, int, int)>
	//   19   34:iload_0         
	//   20   35:invokestatic    #217 <Method int Color.green(int)>
	//   21   38:iload_3         
	//   22   39:iload_1         
	//   23   40:invokestatic    #217 <Method int Color.green(int)>
	//   24   43:iload_2         
	//   25   44:iload           4
	//   26   46:invokestatic    #294 <Method int compositeComponent(int, int, int, int, int)>
	//   27   49:iload_0         
	//   28   50:invokestatic    #220 <Method int Color.blue(int)>
	//   29   53:iload_3         
	//   30   54:iload_1         
	//   31   55:invokestatic    #220 <Method int Color.blue(int)>
	//   32   58:iload_2         
	//   33   59:iload           4
	//   34   61:invokestatic    #294 <Method int compositeComponent(int, int, int, int, int)>
	//   35   64:invokestatic    #224 <Method int Color.argb(int, int, int, int)>
	//   36   67:ireturn         
	}

	private static int compositeComponent(int i, int j, int k, int l, int i1)
	{
		if(i1 == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            7
			return 0;
	//    2    5:iconst_0        
	//    3    6:ireturn         
		else
			return (i * 255 * j + k * l * (255 - j)) / (i1 * 255);
	//    4    7:iload_0         
	//    5    8:sipush          255
	//    6   11:imul            
	//    7   12:iload_1         
	//    8   13:imul            
	//    9   14:iload_2         
	//   10   15:iload_3         
	//   11   16:imul            
	//   12   17:sipush          255
	//   13   20:iload_1         
	//   14   21:isub            
	//   15   22:imul            
	//   16   23:iadd            
	//   17   24:iload           4
	//   18   26:sipush          255
	//   19   29:imul            
	//   20   30:idiv            
	//   21   31:ireturn         
	}

	private static float constrain(float f, float f1, float f2)
	{
		if(f < f1)
	//*   0    0:fload_0         
	//*   1    1:fload_1         
	//*   2    2:fcmpg           
	//*   3    3:ifge            8
			return f1;
	//    4    6:fload_1         
	//    5    7:freturn         
		if(f > f2)
	//*   6    8:fload_0         
	//*   7    9:fload_2         
	//*   8   10:fcmpl           
	//*   9   11:ifle            16
			return f2;
	//   10   14:fload_2         
	//   11   15:freturn         
		else
			return f;
	//   12   16:fload_0         
	//   13   17:freturn         
	}

	private static int constrain(int i, int j, int k)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return j;
	//    3    5:iload_1         
	//    4    6:ireturn         
		if(i > k)
	//*   5    7:iload_0         
	//*   6    8:iload_2         
	//*   7    9:icmple          14
			return k;
	//    8   12:iload_2         
	//    9   13:ireturn         
		else
			return i;
	//   10   14:iload_0         
	//   11   15:ireturn         
	}

	public static double distanceEuclidean(double ad[], double ad1[])
	{
		return Math.sqrt(Math.pow(ad[0] - ad1[0], 2D) + Math.pow(ad[1] - ad1[1], 2D) + Math.pow(ad[2] - ad1[2], 2D));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:daload          
	//    3    3:aload_1         
	//    4    4:iconst_0        
	//    5    5:daload          
	//    6    6:dsub            
	//    7    7:ldc2w           #297 <Double 2D>
	//    8   10:invokestatic    #103 <Method double Math.pow(double, double)>
	//    9   13:aload_0         
	//   10   14:iconst_1        
	//   11   15:daload          
	//   12   16:aload_1         
	//   13   17:iconst_1        
	//   14   18:daload          
	//   15   19:dsub            
	//   16   20:ldc2w           #297 <Double 2D>
	//   17   23:invokestatic    #103 <Method double Math.pow(double, double)>
	//   18   26:dadd            
	//   19   27:aload_0         
	//   20   28:iconst_2        
	//   21   29:daload          
	//   22   30:aload_1         
	//   23   31:iconst_2        
	//   24   32:daload          
	//   25   33:dsub            
	//   26   34:ldc2w           #297 <Double 2D>
	//   27   37:invokestatic    #103 <Method double Math.pow(double, double)>
	//   28   40:dadd            
	//   29   41:invokestatic    #301 <Method double Math.sqrt(double)>
	//   30   44:dreturn         
	}

	private static double[] getTempDouble3Array()
	{
		double ad1[] = (double[])TEMP_ARRAY.get();
	//    0    0:getstatic       #37  <Field ThreadLocal TEMP_ARRAY>
	//    1    3:invokevirtual   #305 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #307 <Class double[]>
	//    3    9:astore_1        
		double ad[] = ad1;
	//    4   10:aload_1         
	//    5   11:astore_0        
		if(ad1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       27
		{
			ad = new double[3];
	//    8   16:iconst_3        
	//    9   17:newarray        double[]
	//   10   19:astore_0        
			TEMP_ARRAY.set(((Object) (ad)));
	//   11   20:getstatic       #37  <Field ThreadLocal TEMP_ARRAY>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #311 <Method void ThreadLocal.set(Object)>
		}
		return ad;
	//   14   27:aload_0         
	//   15   28:areturn         
	}

	private static double pivotXyzComponent(double d)
	{
		if(d > 0.0088559999999999993D)
	//*   0    0:dload_0         
	//*   1    1:ldc2w           #15  <Double 0.0088559999999999993D>
	//*   2    4:dcmpl           
	//*   3    5:ifle            16
			return Math.pow(d, 0.33333333333333331D);
	//    4    8:dload_0         
	//    5    9:ldc2w           #312 <Double 0.33333333333333331D>
	//    6   12:invokestatic    #103 <Method double Math.pow(double, double)>
	//    7   15:dreturn         
		else
			return (903.29999999999995D * d + 16D) / 116D;
	//    8   16:ldc2w           #18  <Double 903.29999999999995D>
	//    9   19:dload_0         
	//   10   20:dmul            
	//   11   21:ldc2w           #90  <Double 16D>
	//   12   24:dadd            
	//   13   25:ldc2w           #92  <Double 116D>
	//   14   28:ddiv            
	//   15   29:dreturn         
	}

	public static int setAlphaComponent(int i, int j)
	{
		if(j < 0 || j > 255)
	//*   0    0:iload_1         
	//*   1    1:iflt            11
	//*   2    4:iload_1         
	//*   3    5:sipush          255
	//*   4    8:icmple          22
			throw new IllegalArgumentException("alpha must be between 0 and 255.");
	//    5   11:new             #135 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc2            #315 <String "alpha must be between 0 and 255.">
	//    8   18:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//    9   21:athrow          
		else
			return 0xffffff & i | j << 24;
	//   10   22:ldc2            #316 <Int 0xffffff>
	//   11   25:iload_0         
	//   12   26:iand            
	//   13   27:iload_1         
	//   14   28:bipush          24
	//   15   30:ishl            
	//   16   31:ior             
	//   17   32:ireturn         
	}

	private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
	private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
	private static final ThreadLocal TEMP_ARRAY = new ThreadLocal();
	private static final double XYZ_EPSILON = 0.0088559999999999993D;
	private static final double XYZ_KAPPA = 903.29999999999995D;
	private static final double XYZ_WHITE_REFERENCE_X = 95.046999999999997D;
	private static final double XYZ_WHITE_REFERENCE_Y = 100D;
	private static final double XYZ_WHITE_REFERENCE_Z = 108.883D;

	static 
	{
	//    0    0:new             #32  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ThreadLocal()>
	//    3    7:putstatic       #37  <Field ThreadLocal TEMP_ARRAY>
	//*   4   10:return          
	}
}
