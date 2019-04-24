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
		float f = af[0];
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:faload          
	//    3    3:fstore_1        
		float f1 = af[1];
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:faload          
	//    7    7:fstore_2        
		float f2 = af[2];
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
		float f3 = f1 * (1.0F - Math.abs((f / 60F) % 2.0F - 1.0F));
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
		int l = (int)f / 60;
	//   42   49:fload_1         
	//   43   50:f2i             
	//   44   51:bipush          60
	//   45   53:idiv            
	//   46   54:istore          8
		int i = 0;
	//   47   56:iconst_0        
	//   48   57:istore          5
		int j = 0;
	//   49   59:iconst_0        
	//   50   60:istore          6
		int k = 0;
	//   51   62:iconst_0        
	//   52   63:istore          7
		switch(l)
	//*  53   65:iload           8
		{
	//*  54   67:tableswitch     0 6: default 108
	//	               0 111
	//	               1 146
	//	               2 181
	//	               3 216
	//	               4 251
	//	               5 286
	//	               6 286
	//*  55  108:goto            318
		case 0: // '\0'
			i = Math.round((f1 + f2) * 255F);
	//   56  111:fload_2         
	//   57  112:fload_3         
	//   58  113:fadd            
	//   59  114:ldc1            #52  <Float 255F>
	//   60  116:fmul            
	//   61  117:invokestatic    #56  <Method int Math.round(float)>
	//   62  120:istore          5
			j = Math.round((f3 + f2) * 255F);
	//   63  122:fload           4
	//   64  124:fload_3         
	//   65  125:fadd            
	//   66  126:ldc1            #52  <Float 255F>
	//   67  128:fmul            
	//   68  129:invokestatic    #56  <Method int Math.round(float)>
	//   69  132:istore          6
			k = Math.round(255F * f2);
	//   70  134:ldc1            #52  <Float 255F>
	//   71  136:fload_3         
	//   72  137:fmul            
	//   73  138:invokestatic    #56  <Method int Math.round(float)>
	//   74  141:istore          7
			break;

	//*  75  143:goto            318
		case 1: // '\001'
			i = Math.round((f3 + f2) * 255F);
	//   76  146:fload           4
	//   77  148:fload_3         
	//   78  149:fadd            
	//   79  150:ldc1            #52  <Float 255F>
	//   80  152:fmul            
	//   81  153:invokestatic    #56  <Method int Math.round(float)>
	//   82  156:istore          5
			j = Math.round((f1 + f2) * 255F);
	//   83  158:fload_2         
	//   84  159:fload_3         
	//   85  160:fadd            
	//   86  161:ldc1            #52  <Float 255F>
	//   87  163:fmul            
	//   88  164:invokestatic    #56  <Method int Math.round(float)>
	//   89  167:istore          6
			k = Math.round(255F * f2);
	//   90  169:ldc1            #52  <Float 255F>
	//   91  171:fload_3         
	//   92  172:fmul            
	//   93  173:invokestatic    #56  <Method int Math.round(float)>
	//   94  176:istore          7
			break;

	//*  95  178:goto            318
		case 2: // '\002'
			i = Math.round(255F * f2);
	//   96  181:ldc1            #52  <Float 255F>
	//   97  183:fload_3         
	//   98  184:fmul            
	//   99  185:invokestatic    #56  <Method int Math.round(float)>
	//  100  188:istore          5
			j = Math.round((f1 + f2) * 255F);
	//  101  190:fload_2         
	//  102  191:fload_3         
	//  103  192:fadd            
	//  104  193:ldc1            #52  <Float 255F>
	//  105  195:fmul            
	//  106  196:invokestatic    #56  <Method int Math.round(float)>
	//  107  199:istore          6
			k = Math.round((f3 + f2) * 255F);
	//  108  201:fload           4
	//  109  203:fload_3         
	//  110  204:fadd            
	//  111  205:ldc1            #52  <Float 255F>
	//  112  207:fmul            
	//  113  208:invokestatic    #56  <Method int Math.round(float)>
	//  114  211:istore          7
			break;

	//* 115  213:goto            318
		case 3: // '\003'
			i = Math.round(255F * f2);
	//  116  216:ldc1            #52  <Float 255F>
	//  117  218:fload_3         
	//  118  219:fmul            
	//  119  220:invokestatic    #56  <Method int Math.round(float)>
	//  120  223:istore          5
			j = Math.round((f3 + f2) * 255F);
	//  121  225:fload           4
	//  122  227:fload_3         
	//  123  228:fadd            
	//  124  229:ldc1            #52  <Float 255F>
	//  125  231:fmul            
	//  126  232:invokestatic    #56  <Method int Math.round(float)>
	//  127  235:istore          6
			k = Math.round((f1 + f2) * 255F);
	//  128  237:fload_2         
	//  129  238:fload_3         
	//  130  239:fadd            
	//  131  240:ldc1            #52  <Float 255F>
	//  132  242:fmul            
	//  133  243:invokestatic    #56  <Method int Math.round(float)>
	//  134  246:istore          7
			break;

	//* 135  248:goto            318
		case 4: // '\004'
			i = Math.round((f3 + f2) * 255F);
	//  136  251:fload           4
	//  137  253:fload_3         
	//  138  254:fadd            
	//  139  255:ldc1            #52  <Float 255F>
	//  140  257:fmul            
	//  141  258:invokestatic    #56  <Method int Math.round(float)>
	//  142  261:istore          5
			j = Math.round(255F * f2);
	//  143  263:ldc1            #52  <Float 255F>
	//  144  265:fload_3         
	//  145  266:fmul            
	//  146  267:invokestatic    #56  <Method int Math.round(float)>
	//  147  270:istore          6
			k = Math.round((f1 + f2) * 255F);
	//  148  272:fload_2         
	//  149  273:fload_3         
	//  150  274:fadd            
	//  151  275:ldc1            #52  <Float 255F>
	//  152  277:fmul            
	//  153  278:invokestatic    #56  <Method int Math.round(float)>
	//  154  281:istore          7
			break;

	//* 155  283:goto            318
		case 5: // '\005'
		case 6: // '\006'
			i = Math.round((f1 + f2) * 255F);
	//  156  286:fload_2         
	//  157  287:fload_3         
	//  158  288:fadd            
	//  159  289:ldc1            #52  <Float 255F>
	//  160  291:fmul            
	//  161  292:invokestatic    #56  <Method int Math.round(float)>
	//  162  295:istore          5
			j = Math.round(255F * f2);
	//  163  297:ldc1            #52  <Float 255F>
	//  164  299:fload_3         
	//  165  300:fmul            
	//  166  301:invokestatic    #56  <Method int Math.round(float)>
	//  167  304:istore          6
			k = Math.round((f3 + f2) * 255F);
	//  168  306:fload           4
	//  169  308:fload_3         
	//  170  309:fadd            
	//  171  310:ldc1            #52  <Float 255F>
	//  172  312:fmul            
	//  173  313:invokestatic    #56  <Method int Math.round(float)>
	//  174  316:istore          7
			break;
		}
		return Color.rgb(constrain(i, 0, 255), constrain(j, 0, 255), constrain(k, 0, 255));
	//  175  318:iload           5
	//  176  320:iconst_0        
	//  177  321:sipush          255
	//  178  324:invokestatic    #60  <Method int constrain(int, int, int)>
	//  179  327:iload           6
	//  180  329:iconst_0        
	//  181  330:sipush          255
	//  182  333:invokestatic    #60  <Method int constrain(int, int, int)>
	//  183  336:iload           7
	//  184  338:iconst_0        
	//  185  339:sipush          255
	//  186  342:invokestatic    #60  <Method int constrain(int, int, int)>
	//  187  345:invokestatic    #65  <Method int Color.rgb(int, int, int)>
	//  188  348:ireturn         
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
	//*  25   46:ifle            52
	//*  26   49:goto            67
			d1 = (116D * d5 - 16D) / 903.29999999999995D;
	//   27   52:ldc2w           #92  <Double 116D>
	//   28   55:dload           11
	//   29   57:dmul            
	//   30   58:ldc2w           #90  <Double 16D>
	//   31   61:dsub            
	//   32   62:ldc2w           #18  <Double 903.29999999999995D>
	//   33   65:ddiv            
	//   34   66:dstore_2        
		if(d > 7.9996247999999985D)
	//*  35   67:dload_0         
	//*  36   68:ldc2w           #104 <Double 7.9996247999999985D>
	//*  37   71:dcmpl           
	//*  38   72:ifle            87
			d = Math.pow(d4, 3D);
	//   39   75:dload           9
	//   40   77:ldc2w           #98  <Double 3D>
	//   41   80:invokestatic    #103 <Method double Math.pow(double, double)>
	//   42   83:dstore_0        
		else
	//*  43   84:goto            93
			d /= 903.29999999999995D;
	//   44   87:dload_0         
	//   45   88:ldc2w           #18  <Double 903.29999999999995D>
	//   46   91:ddiv            
	//   47   92:dstore_0        
		d2 = Math.pow(d3, 3D);
	//   48   93:dload           7
	//   49   95:ldc2w           #98  <Double 3D>
	//   50   98:invokestatic    #103 <Method double Math.pow(double, double)>
	//   51  101:dstore          4
		if(d2 <= 0.0088559999999999993D)
	//*  52  103:dload           4
	//*  53  105:ldc2w           #15  <Double 0.0088559999999999993D>
	//*  54  108:dcmpl           
	//*  55  109:ifle            115
	//*  56  112:goto            131
			d2 = (116D * d3 - 16D) / 903.29999999999995D;
	//   57  115:ldc2w           #92  <Double 116D>
	//   58  118:dload           7
	//   59  120:dmul            
	//   60  121:ldc2w           #90  <Double 16D>
	//   61  124:dsub            
	//   62  125:ldc2w           #18  <Double 903.29999999999995D>
	//   63  128:ddiv            
	//   64  129:dstore          4
		ad[0] = 95.046999999999997D * d1;
	//   65  131:aload           6
	//   66  133:iconst_0        
	//   67  134:ldc2w           #21  <Double 95.046999999999997D>
	//   68  137:dload_2         
	//   69  138:dmul            
	//   70  139:dastore         
		ad[1] = 100D * d;
	//   71  140:aload           6
	//   72  142:iconst_1        
	//   73  143:ldc2w           #24  <Double 100D>
	//   74  146:dload_0         
	//   75  147:dmul            
	//   76  148:dastore         
		ad[2] = 108.883D * d2;
	//   77  149:aload           6
	//   78  151:iconst_2        
	//   79  152:ldc2w           #27  <Double 108.883D>
	//   80  155:dload           4
	//   81  157:dmul            
	//   82  158:dastore         
	//   83  159:return          
	}

	public static void RGBToHSL(int i, int j, int k, float af[])
	{
		float f = (float)i / 255F;
	//    0    0:iload_0         
	//    1    1:i2f             
	//    2    2:ldc1            #52  <Float 255F>
	//    3    4:fdiv            
	//    4    5:fstore          4
		float f2 = (float)j / 255F;
	//    5    7:iload_1         
	//    6    8:i2f             
	//    7    9:ldc1            #52  <Float 255F>
	//    8   11:fdiv            
	//    9   12:fstore          6
		float f4 = (float)k / 255F;
	//   10   14:iload_2         
	//   11   15:i2f             
	//   12   16:ldc1            #52  <Float 255F>
	//   13   18:fdiv            
	//   14   19:fstore          8
		float f5 = Math.max(f, Math.max(f2, f4));
	//   15   21:fload           4
	//   16   23:fload           6
	//   17   25:fload           8
	//   18   27:invokestatic    #116 <Method float Math.max(float, float)>
	//   19   30:invokestatic    #116 <Method float Math.max(float, float)>
	//   20   33:fstore          9
		float f6 = Math.min(f, Math.min(f2, f4));
	//   21   35:fload           4
	//   22   37:fload           6
	//   23   39:fload           8
	//   24   41:invokestatic    #119 <Method float Math.min(float, float)>
	//   25   44:invokestatic    #119 <Method float Math.min(float, float)>
	//   26   47:fstore          10
		float f1 = f5 - f6;
	//   27   49:fload           9
	//   28   51:fload           10
	//   29   53:fsub            
	//   30   54:fstore          5
		float f3 = (f5 + f6) / 2.0F;
	//   31   56:fload           9
	//   32   58:fload           10
	//   33   60:fadd            
	//   34   61:fconst_2        
	//   35   62:fdiv            
	//   36   63:fstore          7
		if(f5 == f6)
	//*  37   65:fload           9
	//*  38   67:fload           10
	//*  39   69:fcmpl           
	//*  40   70:ifne            82
		{
			f1 = 0.0F;
	//   41   73:fconst_0        
	//   42   74:fstore          5
			f = 0.0F;
	//   43   76:fconst_0        
	//   44   77:fstore          4
		} else
	//*  45   79:goto            158
		{
			if(f5 == f)
	//*  46   82:fload           9
	//*  47   84:fload           4
	//*  48   86:fcmpl           
	//*  49   87:ifne            106
				f = ((f2 - f4) / f1) % 6F;
	//   50   90:fload           6
	//   51   92:fload           8
	//   52   94:fsub            
	//   53   95:fload           5
	//   54   97:fdiv            
	//   55   98:ldc1            #120 <Float 6F>
	//   56  100:frem            
	//   57  101:fstore          4
			else
	//*  58  103:goto            142
			if(f5 == f2)
	//*  59  106:fload           9
	//*  60  108:fload           6
	//*  61  110:fcmpl           
	//*  62  111:ifne            129
				f = (f4 - f) / f1 + 2.0F;
	//   63  114:fload           8
	//   64  116:fload           4
	//   65  118:fsub            
	//   66  119:fload           5
	//   67  121:fdiv            
	//   68  122:fconst_2        
	//   69  123:fadd            
	//   70  124:fstore          4
			else
	//*  71  126:goto            142
				f = (f - f2) / f1 + 4F;
	//   72  129:fload           4
	//   73  131:fload           6
	//   74  133:fsub            
	//   75  134:fload           5
	//   76  136:fdiv            
	//   77  137:ldc1            #121 <Float 4F>
	//   78  139:fadd            
	//   79  140:fstore          4
			f1 /= 1.0F - Math.abs(2.0F * f3 - 1.0F);
	//   80  142:fload           5
	//   81  144:fconst_1        
	//   82  145:fconst_2        
	//   83  146:fload           7
	//   84  148:fmul            
	//   85  149:fconst_1        
	//   86  150:fsub            
	//   87  151:invokestatic    #49  <Method float Math.abs(float)>
	//   88  154:fsub            
	//   89  155:fdiv            
	//   90  156:fstore          5
		}
		f2 = (60F * f) % 360F;
	//   91  158:ldc1            #51  <Float 60F>
	//   92  160:fload           4
	//   93  162:fmul            
	//   94  163:ldc1            #122 <Float 360F>
	//   95  165:frem            
	//   96  166:fstore          6
		f = f2;
	//   97  168:fload           6
	//   98  170:fstore          4
		if(f2 < 0.0F)
	//*  99  172:fload           6
	//* 100  174:fconst_0        
	//* 101  175:fcmpg           
	//* 102  176:ifge            186
			f = f2 + 360F;
	//  103  179:fload           6
	//  104  181:ldc1            #122 <Float 360F>
	//  105  183:fadd            
	//  106  184:fstore          4
		af[0] = constrain(f, 0.0F, 360F);
	//  107  186:aload_3         
	//  108  187:iconst_0        
	//  109  188:fload           4
	//  110  190:fconst_0        
	//  111  191:ldc1            #122 <Float 360F>
	//  112  193:invokestatic    #125 <Method float constrain(float, float, float)>
	//  113  196:fastore         
		af[1] = constrain(f1, 0.0F, 1.0F);
	//  114  197:aload_3         
	//  115  198:iconst_1        
	//  116  199:fload           5
	//  117  201:fconst_0        
	//  118  202:fconst_1        
	//  119  203:invokestatic    #125 <Method float constrain(float, float, float)>
	//  120  206:fastore         
		af[2] = constrain(f3, 0.0F, 1.0F);
	//  121  207:aload_3         
	//  122  208:iconst_2        
	//  123  209:fload           7
	//  124  211:fconst_0        
	//  125  212:fconst_1        
	//  126  213:invokestatic    #125 <Method float constrain(float, float, float)>
	//  127  216:fastore         
	//  128  217:return          
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
		if(d < 0.04045D)
	//*  14   24:dload           4
	//*  15   26:ldc2w           #143 <Double 0.04045D>
	//*  16   29:dcmpg           
	//*  17   30:ifge            44
			d /= 12.92D;
	//   18   33:dload           4
	//   19   35:ldc2w           #145 <Double 12.92D>
	//   20   38:ddiv            
	//   21   39:dstore          4
		else
	//*  22   41:goto            62
			d = Math.pow((0.055D + d) / 1.0549999999999999D, 2.3999999999999999D);
	//   23   44:ldc2w           #147 <Double 0.055D>
	//   24   47:dload           4
	//   25   49:dadd            
	//   26   50:ldc2w           #149 <Double 1.0549999999999999D>
	//   27   53:ddiv            
	//   28   54:ldc2w           #151 <Double 2.3999999999999999D>
	//   29   57:invokestatic    #103 <Method double Math.pow(double, double)>
	//   30   60:dstore          4
		double d1 = (double)j / 255D;
	//   31   62:iload_1         
	//   32   63:i2d             
	//   33   64:ldc2w           #141 <Double 255D>
	//   34   67:ddiv            
	//   35   68:dstore          6
		if(d1 < 0.04045D)
	//*  36   70:dload           6
	//*  37   72:ldc2w           #143 <Double 0.04045D>
	//*  38   75:dcmpg           
	//*  39   76:ifge            90
			d1 /= 12.92D;
	//   40   79:dload           6
	//   41   81:ldc2w           #145 <Double 12.92D>
	//   42   84:ddiv            
	//   43   85:dstore          6
		else
	//*  44   87:goto            108
			d1 = Math.pow((0.055D + d1) / 1.0549999999999999D, 2.3999999999999999D);
	//   45   90:ldc2w           #147 <Double 0.055D>
	//   46   93:dload           6
	//   47   95:dadd            
	//   48   96:ldc2w           #149 <Double 1.0549999999999999D>
	//   49   99:ddiv            
	//   50  100:ldc2w           #151 <Double 2.3999999999999999D>
	//   51  103:invokestatic    #103 <Method double Math.pow(double, double)>
	//   52  106:dstore          6
		double d2 = (double)k / 255D;
	//   53  108:iload_2         
	//   54  109:i2d             
	//   55  110:ldc2w           #141 <Double 255D>
	//   56  113:ddiv            
	//   57  114:dstore          8
		if(d2 < 0.04045D)
	//*  58  116:dload           8
	//*  59  118:ldc2w           #143 <Double 0.04045D>
	//*  60  121:dcmpg           
	//*  61  122:ifge            136
			d2 /= 12.92D;
	//   62  125:dload           8
	//   63  127:ldc2w           #145 <Double 12.92D>
	//   64  130:ddiv            
	//   65  131:dstore          8
		else
	//*  66  133:goto            154
			d2 = Math.pow((0.055D + d2) / 1.0549999999999999D, 2.3999999999999999D);
	//   67  136:ldc2w           #147 <Double 0.055D>
	//   68  139:dload           8
	//   69  141:dadd            
	//   70  142:ldc2w           #149 <Double 1.0549999999999999D>
	//   71  145:ddiv            
	//   72  146:ldc2w           #151 <Double 2.3999999999999999D>
	//   73  149:invokestatic    #103 <Method double Math.pow(double, double)>
	//   74  152:dstore          8
		ad[0] = (0.41239999999999999D * d + 0.35759999999999997D * d1 + 0.18049999999999999D * d2) * 100D;
	//   75  154:aload_3         
	//   76  155:iconst_0        
	//   77  156:ldc2w           #153 <Double 0.41239999999999999D>
	//   78  159:dload           4
	//   79  161:dmul            
	//   80  162:ldc2w           #155 <Double 0.35759999999999997D>
	//   81  165:dload           6
	//   82  167:dmul            
	//   83  168:dadd            
	//   84  169:ldc2w           #157 <Double 0.18049999999999999D>
	//   85  172:dload           8
	//   86  174:dmul            
	//   87  175:dadd            
	//   88  176:ldc2w           #24  <Double 100D>
	//   89  179:dmul            
	//   90  180:dastore         
		ad[1] = (0.21260000000000001D * d + 0.71519999999999995D * d1 + 0.0722D * d2) * 100D;
	//   91  181:aload_3         
	//   92  182:iconst_1        
	//   93  183:ldc2w           #159 <Double 0.21260000000000001D>
	//   94  186:dload           4
	//   95  188:dmul            
	//   96  189:ldc2w           #161 <Double 0.71519999999999995D>
	//   97  192:dload           6
	//   98  194:dmul            
	//   99  195:dadd            
	//  100  196:ldc2w           #163 <Double 0.0722D>
	//  101  199:dload           8
	//  102  201:dmul            
	//  103  202:dadd            
	//  104  203:ldc2w           #24  <Double 100D>
	//  105  206:dmul            
	//  106  207:dastore         
		ad[2] = (0.019300000000000001D * d + 0.1192D * d1 + 0.95050000000000001D * d2) * 100D;
	//  107  208:aload_3         
	//  108  209:iconst_2        
	//  109  210:ldc2w           #165 <Double 0.019300000000000001D>
	//  110  213:dload           4
	//  111  215:dmul            
	//  112  216:ldc2w           #167 <Double 0.1192D>
	//  113  219:dload           6
	//  114  221:dmul            
	//  115  222:dadd            
	//  116  223:ldc2w           #169 <Double 0.95050000000000001D>
	//  117  226:dload           8
	//  118  228:dmul            
	//  119  229:dadd            
	//  120  230:ldc2w           #24  <Double 100D>
	//  121  233:dmul            
	//  122  234:dastore         
	//  123  235:return          
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
	//*  45   78:ifle            101
			d = Math.pow(d4, 0.41666666666666669D) * 1.0549999999999999D - 0.055D;
	//   46   81:dload           8
	//   47   83:ldc2w           #191 <Double 0.41666666666666669D>
	//   48   86:invokestatic    #103 <Method double Math.pow(double, double)>
	//   49   89:ldc2w           #149 <Double 1.0549999999999999D>
	//   50   92:dmul            
	//   51   93:ldc2w           #147 <Double 0.055D>
	//   52   96:dsub            
	//   53   97:dstore_0        
		else
	//*  54   98:goto            108
			d = d4 * 12.92D;
	//   55  101:dload           8
	//   56  103:ldc2w           #145 <Double 12.92D>
	//   57  106:dmul            
	//   58  107:dstore_0        
		if(d3 > 0.0031308D)
	//*  59  108:dload           6
	//*  60  110:ldc2w           #189 <Double 0.0031308D>
	//*  61  113:dcmpl           
	//*  62  114:ifle            137
			d1 = Math.pow(d3, 0.41666666666666669D) * 1.0549999999999999D - 0.055D;
	//   63  117:dload           6
	//   64  119:ldc2w           #191 <Double 0.41666666666666669D>
	//   65  122:invokestatic    #103 <Method double Math.pow(double, double)>
	//   66  125:ldc2w           #149 <Double 1.0549999999999999D>
	//   67  128:dmul            
	//   68  129:ldc2w           #147 <Double 0.055D>
	//   69  132:dsub            
	//   70  133:dstore_2        
		else
	//*  71  134:goto            144
			d1 = d3 * 12.92D;
	//   72  137:dload           6
	//   73  139:ldc2w           #145 <Double 12.92D>
	//   74  142:dmul            
	//   75  143:dstore_2        
		if(d2 > 0.0031308D)
	//*  76  144:dload           4
	//*  77  146:ldc2w           #189 <Double 0.0031308D>
	//*  78  149:dcmpl           
	//*  79  150:ifle            174
			d2 = Math.pow(d2, 0.41666666666666669D) * 1.0549999999999999D - 0.055D;
	//   80  153:dload           4
	//   81  155:ldc2w           #191 <Double 0.41666666666666669D>
	//   82  158:invokestatic    #103 <Method double Math.pow(double, double)>
	//   83  161:ldc2w           #149 <Double 1.0549999999999999D>
	//   84  164:dmul            
	//   85  165:ldc2w           #147 <Double 0.055D>
	//   86  168:dsub            
	//   87  169:dstore          4
		else
	//*  88  171:goto            182
			d2 *= 12.92D;
	//   89  174:dload           4
	//   90  176:ldc2w           #145 <Double 12.92D>
	//   91  179:dmul            
	//   92  180:dstore          4
		return Color.rgb(constrain((int)Math.round(255D * d), 0, 255), constrain((int)Math.round(255D * d1), 0, 255), constrain((int)Math.round(255D * d2), 0, 255));
	//   93  182:ldc2w           #141 <Double 255D>
	//   94  185:dload_0         
	//   95  186:dmul            
	//   96  187:invokestatic    #195 <Method long Math.round(double)>
	//   97  190:l2i             
	//   98  191:iconst_0        
	//   99  192:sipush          255
	//  100  195:invokestatic    #60  <Method int constrain(int, int, int)>
	//  101  198:ldc2w           #141 <Double 255D>
	//  102  201:dload_2         
	//  103  202:dmul            
	//  104  203:invokestatic    #195 <Method long Math.round(double)>
	//  105  206:l2i             
	//  106  207:iconst_0        
	//  107  208:sipush          255
	//  108  211:invokestatic    #60  <Method int constrain(int, int, int)>
	//  109  214:ldc2w           #141 <Double 255D>
	//  110  217:dload           4
	//  111  219:dmul            
	//  112  220:invokestatic    #195 <Method long Math.round(double)>
	//  113  223:l2i             
	//  114  224:iconst_0        
	//  115  225:sipush          255
	//  116  228:invokestatic    #60  <Method int constrain(int, int, int)>
	//  117  231:invokestatic    #65  <Method int Color.rgb(int, int, int)>
	//  118  234:ireturn         
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
		return Color.argb((int)(f2 * f1 + f3 * f), (int)(f4 * f1 + f5 * f), (int)(f6 * f1 + f7 * f), (int)(f8 * f1 + f9 * f));
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
	//   60   90:fload           10
	//   61   92:fload_3         
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
			af2[2] = af[2] * f1 + af1[2] * f;
	//   38   49:aload_3         
	//   39   50:iconst_2        
	//   40   51:aload_0         
	//   41   52:iconst_2        
	//   42   53:faload          
	//   43   54:fload           4
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
			ad2[2] = ad[2] * d1 + ad1[2] * d;
	//   41   54:aload           4
	//   42   56:iconst_2        
	//   43   57:aload_0         
	//   44   58:iconst_2        
	//   45   59:daload          
	//   46   60:dload           5
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
		if(calculateContrast(setAlphaComponent(i, 255), j) < (double)f)
	//*  17   40:iload_0         
	//*  18   41:sipush          255
	//*  19   44:invokestatic    #276 <Method int setAlphaComponent(int, int)>
	//*  20   47:iload_1         
	//*  21   48:invokestatic    #278 <Method double calculateContrast(int, int)>
	//*  22   51:fload_2         
	//*  23   52:f2d             
	//*  24   53:dcmpg           
	//*  25   54:ifge            59
			return -1;
	//   26   57:iconst_m1       
	//   27   58:ireturn         
		int k = 0;
	//   28   59:iconst_0        
	//   29   60:istore_3        
		int i1 = 0;
	//   30   61:iconst_0        
	//   31   62:istore          5
		int l;
		for(l = 255; k <= 10 && l - i1 > 1; k++)
	//*  32   64:sipush          255
	//*  33   67:istore          4
	//*  34   69:iload_3         
	//*  35   70:bipush          10
	//*  36   72:icmpgt          127
	//*  37   75:iload           4
	//*  38   77:iload           5
	//*  39   79:isub            
	//*  40   80:iconst_1        
	//*  41   81:icmple          127
		{
			int j1 = (i1 + l) / 2;
	//   42   84:iload           5
	//   43   86:iload           4
	//   44   88:iadd            
	//   45   89:iconst_2        
	//   46   90:idiv            
	//   47   91:istore          6
			if(calculateContrast(setAlphaComponent(i, j1), j) < (double)f)
	//*  48   93:iload_0         
	//*  49   94:iload           6
	//*  50   96:invokestatic    #276 <Method int setAlphaComponent(int, int)>
	//*  51   99:iload_1         
	//*  52  100:invokestatic    #278 <Method double calculateContrast(int, int)>
	//*  53  103:fload_2         
	//*  54  104:f2d             
	//*  55  105:dcmpg           
	//*  56  106:ifge            116
				i1 = j1;
	//   57  109:iload           6
	//   58  111:istore          5
			else
	//*  59  113:goto            120
				l = j1;
	//   60  116:iload           6
	//   61  118:istore          4
		}

	//   62  120:iload_3         
	//   63  121:iconst_1        
	//   64  122:iadd            
	//   65  123:istore_3        
	//*  66  124:goto            69
		return l;
	//   67  127:iload           4
	//   68  129:ireturn         
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
	//*  10   15:ifle            43
			if(f1 > f)
	//*  11   18:fload_1         
	//*  12   19:fload_0         
	//*  13   20:fcmpl           
	//*  14   21:ifle            35
			{
				f3 = f + 360F;
	//   15   24:fload_0         
	//   16   25:ldc1            #122 <Float 360F>
	//   17   27:fadd            
	//   18   28:fstore_3        
				f4 = f1;
	//   19   29:fload_1         
	//   20   30:fstore          4
			} else
	//*  21   32:goto            43
			{
				f4 = f1 + 360F;
	//   22   35:fload_1         
	//   23   36:ldc1            #122 <Float 360F>
	//   24   38:fadd            
	//   25   39:fstore          4
				f3 = f;
	//   26   41:fload_0         
	//   27   42:fstore_3        
			}
		return ((f4 - f3) * f2 + f3) % 360F;
	//   28   43:fload           4
	//   29   45:fload_3         
	//   30   46:fsub            
	//   31   47:fload_2         
	//   32   48:fmul            
	//   33   49:fload_3         
	//   34   50:fadd            
	//   35   51:ldc1            #122 <Float 360F>
	//   36   53:frem            
	//   37   54:freturn         
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
