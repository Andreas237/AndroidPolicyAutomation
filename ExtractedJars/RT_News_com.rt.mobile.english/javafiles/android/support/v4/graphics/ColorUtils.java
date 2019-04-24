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
		float f3 = (1.0F - Math.abs((f / 60F) % 2.0F - 1.0F)) * f1;
	//   29   32:fconst_1        
	//   30   33:fload_1         
	//   31   34:ldc1            #51  <Float 60F>
	//   32   36:fdiv            
	//   33   37:fconst_2        
	//   34   38:frem            
	//   35   39:fconst_1        
	//   36   40:fsub            
	//   37   41:invokestatic    #49  <Method float Math.abs(float)>
	//   38   44:fsub            
	//   39   45:fload_2         
	//   40   46:fmul            
	//   41   47:fstore          4
		int i;
		int j;
		int k;
		switch((int)f / 60)
	//*  42   49:fload_1         
	//*  43   50:f2i             
	//*  44   51:bipush          60
	//*  45   53:idiv            
		{
	//*  46   54:tableswitch     0 6: default 96
	//	               0 285
	//	               1 250
	//	               2 215
	//	               3 180
	//	               4 145
	//	               5 110
	//	               6 110
		default:
			k = 0;
	//   47   96:iconst_0        
	//   48   97:istore          7
			i = k;
	//   49   99:iload           7
	//   50  101:istore          5
			j = i;
	//   51  103:iload           5
	//   52  105:istore          6
			break;

	//*  53  107:goto            317
		case 5: // '\005'
		case 6: // '\006'
			i = Math.round((f1 + f2) * 255F);
	//   54  110:fload_2         
	//   55  111:fload_3         
	//   56  112:fadd            
	//   57  113:ldc1            #52  <Float 255F>
	//   58  115:fmul            
	//   59  116:invokestatic    #56  <Method int Math.round(float)>
	//   60  119:istore          5
			j = Math.round(255F * f2);
	//   61  121:ldc1            #52  <Float 255F>
	//   62  123:fload_3         
	//   63  124:fmul            
	//   64  125:invokestatic    #56  <Method int Math.round(float)>
	//   65  128:istore          6
			k = Math.round(255F * (f3 + f2));
	//   66  130:ldc1            #52  <Float 255F>
	//   67  132:fload           4
	//   68  134:fload_3         
	//   69  135:fadd            
	//   70  136:fmul            
	//   71  137:invokestatic    #56  <Method int Math.round(float)>
	//   72  140:istore          7
			break;

	//*  73  142:goto            317
		case 4: // '\004'
			i = Math.round((f3 + f2) * 255F);
	//   74  145:fload           4
	//   75  147:fload_3         
	//   76  148:fadd            
	//   77  149:ldc1            #52  <Float 255F>
	//   78  151:fmul            
	//   79  152:invokestatic    #56  <Method int Math.round(float)>
	//   80  155:istore          5
			j = Math.round(255F * f2);
	//   81  157:ldc1            #52  <Float 255F>
	//   82  159:fload_3         
	//   83  160:fmul            
	//   84  161:invokestatic    #56  <Method int Math.round(float)>
	//   85  164:istore          6
			k = Math.round(255F * (f1 + f2));
	//   86  166:ldc1            #52  <Float 255F>
	//   87  168:fload_2         
	//   88  169:fload_3         
	//   89  170:fadd            
	//   90  171:fmul            
	//   91  172:invokestatic    #56  <Method int Math.round(float)>
	//   92  175:istore          7
			break;

	//*  93  177:goto            317
		case 3: // '\003'
			i = Math.round(255F * f2);
	//   94  180:ldc1            #52  <Float 255F>
	//   95  182:fload_3         
	//   96  183:fmul            
	//   97  184:invokestatic    #56  <Method int Math.round(float)>
	//   98  187:istore          5
			j = Math.round((f3 + f2) * 255F);
	//   99  189:fload           4
	//  100  191:fload_3         
	//  101  192:fadd            
	//  102  193:ldc1            #52  <Float 255F>
	//  103  195:fmul            
	//  104  196:invokestatic    #56  <Method int Math.round(float)>
	//  105  199:istore          6
			k = Math.round(255F * (f1 + f2));
	//  106  201:ldc1            #52  <Float 255F>
	//  107  203:fload_2         
	//  108  204:fload_3         
	//  109  205:fadd            
	//  110  206:fmul            
	//  111  207:invokestatic    #56  <Method int Math.round(float)>
	//  112  210:istore          7
			break;

	//* 113  212:goto            317
		case 2: // '\002'
			i = Math.round(255F * f2);
	//  114  215:ldc1            #52  <Float 255F>
	//  115  217:fload_3         
	//  116  218:fmul            
	//  117  219:invokestatic    #56  <Method int Math.round(float)>
	//  118  222:istore          5
			j = Math.round((f1 + f2) * 255F);
	//  119  224:fload_2         
	//  120  225:fload_3         
	//  121  226:fadd            
	//  122  227:ldc1            #52  <Float 255F>
	//  123  229:fmul            
	//  124  230:invokestatic    #56  <Method int Math.round(float)>
	//  125  233:istore          6
			k = Math.round(255F * (f3 + f2));
	//  126  235:ldc1            #52  <Float 255F>
	//  127  237:fload           4
	//  128  239:fload_3         
	//  129  240:fadd            
	//  130  241:fmul            
	//  131  242:invokestatic    #56  <Method int Math.round(float)>
	//  132  245:istore          7
			break;

	//* 133  247:goto            317
		case 1: // '\001'
			i = Math.round((f3 + f2) * 255F);
	//  134  250:fload           4
	//  135  252:fload_3         
	//  136  253:fadd            
	//  137  254:ldc1            #52  <Float 255F>
	//  138  256:fmul            
	//  139  257:invokestatic    #56  <Method int Math.round(float)>
	//  140  260:istore          5
			j = Math.round((f1 + f2) * 255F);
	//  141  262:fload_2         
	//  142  263:fload_3         
	//  143  264:fadd            
	//  144  265:ldc1            #52  <Float 255F>
	//  145  267:fmul            
	//  146  268:invokestatic    #56  <Method int Math.round(float)>
	//  147  271:istore          6
			k = Math.round(255F * f2);
	//  148  273:ldc1            #52  <Float 255F>
	//  149  275:fload_3         
	//  150  276:fmul            
	//  151  277:invokestatic    #56  <Method int Math.round(float)>
	//  152  280:istore          7
			break;

	//* 153  282:goto            317
		case 0: // '\0'
			i = Math.round((f1 + f2) * 255F);
	//  154  285:fload_2         
	//  155  286:fload_3         
	//  156  287:fadd            
	//  157  288:ldc1            #52  <Float 255F>
	//  158  290:fmul            
	//  159  291:invokestatic    #56  <Method int Math.round(float)>
	//  160  294:istore          5
			j = Math.round((f3 + f2) * 255F);
	//  161  296:fload           4
	//  162  298:fload_3         
	//  163  299:fadd            
	//  164  300:ldc1            #52  <Float 255F>
	//  165  302:fmul            
	//  166  303:invokestatic    #56  <Method int Math.round(float)>
	//  167  306:istore          6
			k = Math.round(255F * f2);
	//  168  308:ldc1            #52  <Float 255F>
	//  169  310:fload_3         
	//  170  311:fmul            
	//  171  312:invokestatic    #56  <Method int Math.round(float)>
	//  172  315:istore          7
			break;
		}
		return Color.rgb(constrain(i, 0, 255), constrain(j, 0, 255), constrain(k, 0, 255));
	//  173  317:iload           5
	//  174  319:iconst_0        
	//  175  320:sipush          255
	//  176  323:invokestatic    #60  <Method int constrain(int, int, int)>
	//  177  326:iload           6
	//  178  328:iconst_0        
	//  179  329:sipush          255
	//  180  332:invokestatic    #60  <Method int constrain(int, int, int)>
	//  181  335:iload           7
	//  182  337:iconst_0        
	//  183  338:sipush          255
	//  184  341:invokestatic    #60  <Method int constrain(int, int, int)>
	//  185  344:invokestatic    #65  <Method int Color.rgb(int, int, int)>
	//  186  347:ireturn         
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
		double d4 = (d + 16D) / 116D;
	//    0    0:dload_0         
	//    1    1:ldc2w           #90  <Double 16D>
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
			d1 = (d5 * 116D - 16D) / 903.29999999999995D;
	//   27   52:dload           11
	//   28   54:ldc2w           #92  <Double 116D>
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
		ad[0] = d1 * 95.046999999999997D;
	//   65  131:aload           6
	//   66  133:iconst_0        
	//   67  134:dload_2         
	//   68  135:ldc2w           #21  <Double 95.046999999999997D>
	//   69  138:dmul            
	//   70  139:dastore         
		ad[1] = d * 100D;
	//   71  140:aload           6
	//   72  142:iconst_1        
	//   73  143:dload_0         
	//   74  144:ldc2w           #24  <Double 100D>
	//   75  147:dmul            
	//   76  148:dastore         
		ad[2] = d2 * 108.883D;
	//   77  149:aload           6
	//   78  151:iconst_2        
	//   79  152:dload           4
	//   80  154:ldc2w           #27  <Double 108.883D>
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
	//*  40   70:ifne            83
		{
			f = 0.0F;
	//   41   73:fconst_0        
	//   42   74:fstore          4
			f1 = f;
	//   43   76:fload           4
	//   44   78:fstore          5
		} else
	//*  45   80:goto            159
		{
			if(f5 == f)
	//*  46   83:fload           9
	//*  47   85:fload           4
	//*  48   87:fcmpl           
	//*  49   88:ifne            107
				f = ((f2 - f4) / f1) % 6F;
	//   50   91:fload           6
	//   51   93:fload           8
	//   52   95:fsub            
	//   53   96:fload           5
	//   54   98:fdiv            
	//   55   99:ldc1            #120 <Float 6F>
	//   56  101:frem            
	//   57  102:fstore          4
			else
	//*  58  104:goto            143
			if(f5 == f2)
	//*  59  107:fload           9
	//*  60  109:fload           6
	//*  61  111:fcmpl           
	//*  62  112:ifne            130
				f = (f4 - f) / f1 + 2.0F;
	//   63  115:fload           8
	//   64  117:fload           4
	//   65  119:fsub            
	//   66  120:fload           5
	//   67  122:fdiv            
	//   68  123:fconst_2        
	//   69  124:fadd            
	//   70  125:fstore          4
			else
	//*  71  127:goto            143
				f = (f - f2) / f1 + 4F;
	//   72  130:fload           4
	//   73  132:fload           6
	//   74  134:fsub            
	//   75  135:fload           5
	//   76  137:fdiv            
	//   77  138:ldc1            #121 <Float 4F>
	//   78  140:fadd            
	//   79  141:fstore          4
			f1 /= 1.0F - Math.abs(2.0F * f3 - 1.0F);
	//   80  143:fload           5
	//   81  145:fconst_1        
	//   82  146:fconst_2        
	//   83  147:fload           7
	//   84  149:fmul            
	//   85  150:fconst_1        
	//   86  151:fsub            
	//   87  152:invokestatic    #49  <Method float Math.abs(float)>
	//   88  155:fsub            
	//   89  156:fdiv            
	//   90  157:fstore          5
		}
		f2 = (f * 60F) % 360F;
	//   91  159:fload           4
	//   92  161:ldc1            #51  <Float 60F>
	//   93  163:fmul            
	//   94  164:ldc1            #122 <Float 360F>
	//   95  166:frem            
	//   96  167:fstore          6
		f = f2;
	//   97  169:fload           6
	//   98  171:fstore          4
		if(f2 < 0.0F)
	//*  99  173:fload           6
	//* 100  175:fconst_0        
	//* 101  176:fcmpg           
	//* 102  177:ifge            187
			f = f2 + 360F;
	//  103  180:fload           6
	//  104  182:ldc1            #122 <Float 360F>
	//  105  184:fadd            
	//  106  185:fstore          4
		af[0] = constrain(f, 0.0F, 360F);
	//  107  187:aload_3         
	//  108  188:iconst_0        
	//  109  189:fload           4
	//  110  191:fconst_0        
	//  111  192:ldc1            #122 <Float 360F>
	//  112  194:invokestatic    #125 <Method float constrain(float, float, float)>
	//  113  197:fastore         
		af[1] = constrain(f1, 0.0F, 1.0F);
	//  114  198:aload_3         
	//  115  199:iconst_1        
	//  116  200:fload           5
	//  117  202:fconst_0        
	//  118  203:fconst_1        
	//  119  204:invokestatic    #125 <Method float constrain(float, float, float)>
	//  120  207:fastore         
		af[2] = constrain(f3, 0.0F, 1.0F);
	//  121  208:aload_3         
	//  122  209:iconst_2        
	//  123  210:fload           7
	//  124  212:fconst_0        
	//  125  213:fconst_1        
	//  126  214:invokestatic    #125 <Method float constrain(float, float, float)>
	//  127  217:fastore         
	//  128  218:return          
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
	//*  22   41:goto            65
			d = Math.pow((d + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
	//   23   44:dload           4
	//   24   46:ldc2w           #147 <Double 0.055D>
	//   25   49:dadd            
	//   26   50:ldc2w           #149 <Double 1.0549999999999999D>
	//   27   53:ddiv            
	//   28   54:ldc2w           #151 <Double 2.3999999999999999D>
	//   29   57:invokestatic    #103 <Method double Math.pow(double, double)>
	//   30   60:dstore          4
	//*  31   62:goto            41
		double d1 = (double)j / 255D;
	//   32   65:iload_1         
	//   33   66:i2d             
	//   34   67:ldc2w           #141 <Double 255D>
	//   35   70:ddiv            
	//   36   71:dstore          6
		if(d1 < 0.04045D)
	//*  37   73:dload           6
	//*  38   75:ldc2w           #143 <Double 0.04045D>
	//*  39   78:dcmpg           
	//*  40   79:ifge            93
			d1 /= 12.92D;
	//   41   82:dload           6
	//   42   84:ldc2w           #145 <Double 12.92D>
	//   43   87:ddiv            
	//   44   88:dstore          6
		else
	//*  45   90:goto            114
			d1 = Math.pow((d1 + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
	//   46   93:dload           6
	//   47   95:ldc2w           #147 <Double 0.055D>
	//   48   98:dadd            
	//   49   99:ldc2w           #149 <Double 1.0549999999999999D>
	//   50  102:ddiv            
	//   51  103:ldc2w           #151 <Double 2.3999999999999999D>
	//   52  106:invokestatic    #103 <Method double Math.pow(double, double)>
	//   53  109:dstore          6
	//*  54  111:goto            90
		double d2 = (double)k / 255D;
	//   55  114:iload_2         
	//   56  115:i2d             
	//   57  116:ldc2w           #141 <Double 255D>
	//   58  119:ddiv            
	//   59  120:dstore          8
		if(d2 < 0.04045D)
	//*  60  122:dload           8
	//*  61  124:ldc2w           #143 <Double 0.04045D>
	//*  62  127:dcmpg           
	//*  63  128:ifge            142
			d2 /= 12.92D;
	//   64  131:dload           8
	//   65  133:ldc2w           #145 <Double 12.92D>
	//   66  136:ddiv            
	//   67  137:dstore          8
		else
	//*  68  139:goto            160
			d2 = Math.pow((d2 + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
	//   69  142:dload           8
	//   70  144:ldc2w           #147 <Double 0.055D>
	//   71  147:dadd            
	//   72  148:ldc2w           #149 <Double 1.0549999999999999D>
	//   73  151:ddiv            
	//   74  152:ldc2w           #151 <Double 2.3999999999999999D>
	//   75  155:invokestatic    #103 <Method double Math.pow(double, double)>
	//   76  158:dstore          8
		ad[0] = (0.41239999999999999D * d + 0.35759999999999997D * d1 + 0.18049999999999999D * d2) * 100D;
	//   77  160:aload_3         
	//   78  161:iconst_0        
	//   79  162:ldc2w           #153 <Double 0.41239999999999999D>
	//   80  165:dload           4
	//   81  167:dmul            
	//   82  168:ldc2w           #155 <Double 0.35759999999999997D>
	//   83  171:dload           6
	//   84  173:dmul            
	//   85  174:dadd            
	//   86  175:ldc2w           #157 <Double 0.18049999999999999D>
	//   87  178:dload           8
	//   88  180:dmul            
	//   89  181:dadd            
	//   90  182:ldc2w           #24  <Double 100D>
	//   91  185:dmul            
	//   92  186:dastore         
		ad[1] = (0.21260000000000001D * d + 0.71519999999999995D * d1 + 0.0722D * d2) * 100D;
	//   93  187:aload_3         
	//   94  188:iconst_1        
	//   95  189:ldc2w           #159 <Double 0.21260000000000001D>
	//   96  192:dload           4
	//   97  194:dmul            
	//   98  195:ldc2w           #161 <Double 0.71519999999999995D>
	//   99  198:dload           6
	//  100  200:dmul            
	//  101  201:dadd            
	//  102  202:ldc2w           #163 <Double 0.0722D>
	//  103  205:dload           8
	//  104  207:dmul            
	//  105  208:dadd            
	//  106  209:ldc2w           #24  <Double 100D>
	//  107  212:dmul            
	//  108  213:dastore         
		ad[2] = 100D * (d * 0.019300000000000001D + d1 * 0.1192D + d2 * 0.95050000000000001D);
	//  109  214:aload_3         
	//  110  215:iconst_2        
	//  111  216:ldc2w           #24  <Double 100D>
	//  112  219:dload           4
	//  113  221:ldc2w           #165 <Double 0.019300000000000001D>
	//  114  224:dmul            
	//  115  225:dload           6
	//  116  227:ldc2w           #167 <Double 0.1192D>
	//  117  230:dmul            
	//  118  231:dadd            
	//  119  232:dload           8
	//  120  234:ldc2w           #169 <Double 0.95050000000000001D>
	//  121  237:dmul            
	//  122  238:dadd            
	//  123  239:dmul            
	//  124  240:dastore         
	//  125  241:return          
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
		d2 = (d * 0.0557D + d1 * -0.20399999999999999D + 1.0569999999999999D * d2) / 100D;
	//   28   48:dload_0         
	//   29   49:ldc2w           #183 <Double 0.0557D>
	//   30   52:dmul            
	//   31   53:dload_2         
	//   32   54:ldc2w           #185 <Double -0.20399999999999999D>
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
			d = 12.92D * d4;
	//   55  101:ldc2w           #145 <Double 12.92D>
	//   56  104:dload           8
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
			d1 = 12.92D * d3;
	//   72  137:ldc2w           #145 <Double 12.92D>
	//   73  140:dload           6
	//   74  142:dmul            
	//   75  143:dstore_2        
		if(d2 > 0.0031308D)
	//*  76  144:dload           4
	//*  77  146:ldc2w           #189 <Double 0.0031308D>
	//*  78  149:dcmpl           
	//*  79  150:ifle            174
			d2 = 1.0549999999999999D * Math.pow(d2, 0.41666666666666669D) - 0.055D;
	//   80  153:ldc2w           #149 <Double 1.0549999999999999D>
	//   81  156:dload           4
	//   82  158:ldc2w           #191 <Double 0.41666666666666669D>
	//   83  161:invokestatic    #103 <Method double Math.pow(double, double)>
	//   84  164:dmul            
	//   85  165:ldc2w           #147 <Double 0.055D>
	//   86  168:dsub            
	//   87  169:dstore          4
		else
	//*  88  171:goto            182
			d2 = 12.92D * d2;
	//   89  174:ldc2w           #145 <Double 12.92D>
	//   90  177:dload           4
	//   91  179:dmul            
	//   92  180:dstore          4
		return Color.rgb(constrain((int)Math.round(d * 255D), 0, 255), constrain((int)Math.round(d1 * 255D), 0, 255), constrain((int)Math.round(255D * d2), 0, 255));
	//   93  182:dload_0         
	//   94  183:ldc2w           #141 <Double 255D>
	//   95  186:dmul            
	//   96  187:invokestatic    #195 <Method long Math.round(double)>
	//   97  190:l2i             
	//   98  191:iconst_0        
	//   99  192:sipush          255
	//  100  195:invokestatic    #60  <Method int constrain(int, int, int)>
	//  101  198:dload_2         
	//  102  199:ldc2w           #141 <Double 255D>
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
			ad[1] = 500D * (d - d1);
	//   34   63:aload           6
	//   35   65:iconst_1        
	//   36   66:ldc2w           #94  <Double 500D>
	//   37   69:dload_0         
	//   38   70:dload_2         
	//   39   71:dsub            
	//   40   72:dmul            
	//   41   73:dastore         
			ad[2] = 200D * (d1 - d2);
	//   42   74:aload           6
	//   43   76:iconst_2        
	//   44   77:ldc2w           #96  <Double 200D>
	//   45   80:dload_2         
	//   46   81:dload           4
	//   47   83:dsub            
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
	//*   3    7:icmpeq          50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #239 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #240 <Method void StringBuilder()>
	//    7   17:astore          7
			stringbuilder.append("background can not be translucent: #");
	//    8   19:aload           7
	//    9   21:ldc1            #242 <String "background can not be translucent: #">
	//   10   23:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   12   27:aload           7
	//   13   29:iload_1         
	//   14   30:invokestatic    #252 <Method String Integer.toHexString(int)>
	//   15   33:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   37:new             #135 <Class IllegalArgumentException>
	//   18   40:dup             
	//   19   41:aload           7
	//   20   43:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   21   46:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   22   49:athrow          
		}
		int k = i;
	//   23   50:iload_0         
	//   24   51:istore          6
		if(Color.alpha(i) < 255)
	//*  25   53:iload_0         
	//*  26   54:invokestatic    #211 <Method int Color.alpha(int)>
	//*  27   57:sipush          255
	//*  28   60:icmpge          70
			k = compositeColors(i, j);
	//   29   63:iload_0         
	//   30   64:iload_1         
	//   31   65:invokestatic    #260 <Method int compositeColors(int, int)>
	//   32   68:istore          6
		double d = calculateLuminance(k) + 0.050000000000000003D;
	//   33   70:iload           6
	//   34   72:invokestatic    #264 <Method double calculateLuminance(int)>
	//   35   75:ldc2w           #265 <Double 0.050000000000000003D>
	//   36   78:dadd            
	//   37   79:dstore_2        
		double d1 = calculateLuminance(j) + 0.050000000000000003D;
	//   38   80:iload_1         
	//   39   81:invokestatic    #264 <Method double calculateLuminance(int)>
	//   40   84:ldc2w           #265 <Double 0.050000000000000003D>
	//   41   87:dadd            
	//   42   88:dstore          4
		return Math.max(d, d1) / Math.min(d, d1);
	//   43   90:dload_2         
	//   44   91:dload           4
	//   45   93:invokestatic    #203 <Method double Math.max(double, double)>
	//   46   96:dload_2         
	//   47   97:dload           4
	//   48   99:invokestatic    #268 <Method double Math.min(double, double)>
	//   49  102:ddiv            
	//   50  103:dreturn         
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
		int k = Color.alpha(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #211 <Method int Color.alpha(int)>
	//    2    4:istore          7
		int l = 255;
	//    3    6:sipush          255
	//    4    9:istore          8
		if(k != 255)
	//*   5   11:iload           7
	//*   6   13:sipush          255
	//*   7   16:icmpeq          59
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   19:new             #239 <Class StringBuilder>
	//    9   22:dup             
	//   10   23:invokespecial   #240 <Method void StringBuilder()>
	//   11   26:astore          11
			stringbuilder.append("background can not be translucent: #");
	//   12   28:aload           11
	//   13   30:ldc1            #242 <String "background can not be translucent: #">
	//   14   32:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   16   36:aload           11
	//   17   38:iload_1         
	//   18   39:invokestatic    #252 <Method String Integer.toHexString(int)>
	//   19   42:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   46:new             #135 <Class IllegalArgumentException>
	//   22   49:dup             
	//   23   50:aload           11
	//   24   52:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   25   55:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   26   58:athrow          
		}
		double d = calculateContrast(setAlphaComponent(i, 255), j);
	//   27   59:iload_0         
	//   28   60:sipush          255
	//   29   63:invokestatic    #276 <Method int setAlphaComponent(int, int)>
	//   30   66:iload_1         
	//   31   67:invokestatic    #278 <Method double calculateContrast(int, int)>
	//   32   70:dstore_3        
		double d1 = f;
	//   33   71:fload_2         
	//   34   72:f2d             
	//   35   73:dstore          5
		if(d < d1)
	//*  36   75:dload_3         
	//*  37   76:dload           5
	//*  38   78:dcmpg           
	//*  39   79:ifge            84
			return -1;
	//   40   82:iconst_m1       
	//   41   83:ireturn         
		k = 0;
	//   42   84:iconst_0        
	//   43   85:istore          7
		for(int i1 = 0; k <= 10 && l - i1 > 1; k++)
	//*  44   87:iconst_0        
	//*  45   88:istore          9
	//*  46   90:iload           7
	//*  47   92:bipush          10
	//*  48   94:icmpgt          151
	//*  49   97:iload           8
	//*  50   99:iload           9
	//*  51  101:isub            
	//*  52  102:iconst_1        
	//*  53  103:icmple          151
		{
			int j1 = (i1 + l) / 2;
	//   54  106:iload           9
	//   55  108:iload           8
	//   56  110:iadd            
	//   57  111:iconst_2        
	//   58  112:idiv            
	//   59  113:istore          10
			if(calculateContrast(setAlphaComponent(i, j1), j) < d1)
	//*  60  115:iload_0         
	//*  61  116:iload           10
	//*  62  118:invokestatic    #276 <Method int setAlphaComponent(int, int)>
	//*  63  121:iload_1         
	//*  64  122:invokestatic    #278 <Method double calculateContrast(int, int)>
	//*  65  125:dload           5
	//*  66  127:dcmpg           
	//*  67  128:ifge            138
				i1 = j1;
	//   68  131:iload           10
	//   69  133:istore          9
			else
	//*  70  135:goto            142
				l = j1;
	//   71  138:iload           10
	//   72  140:istore          8
		}

	//   73  142:iload           7
	//   74  144:iconst_1        
	//   75  145:iadd            
	//   76  146:istore          7
	//*  77  148:goto            90
		return l;
	//   78  151:iload           8
	//   79  153:ireturn         
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
		return (f3 + (f4 - f3) * f2) % 360F;
	//   28   43:fload_3         
	//   29   44:fload           4
	//   30   46:fload_3         
	//   31   47:fsub            
	//   32   48:fload_2         
	//   33   49:fmul            
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
		f1 = f;
	//    6    8:fload_0         
	//    7    9:fstore_1        
		if(f > f2)
	//*   8   10:fload_0         
	//*   9   11:fload_2         
	//*  10   12:fcmpl           
	//*  11   13:ifle            18
			f1 = f2;
	//   12   16:fload_2         
	//   13   17:fstore_1        
		return f1;
	//   14   18:fload_1         
	//   15   19:freturn         
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
		j = i;
	//    5    7:iload_0         
	//    6    8:istore_1        
		if(i > k)
	//*   7    9:iload_0         
	//*   8   10:iload_2         
	//*   9   11:icmple          16
			j = k;
	//   10   14:iload_2         
	//   11   15:istore_1        
		return j;
	//   12   16:iload_1         
	//   13   17:ireturn         
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
		if(j >= 0 && j <= 255)
	//*   0    0:iload_1         
	//*   1    1:iflt            25
	//*   2    4:iload_1         
	//*   3    5:sipush          255
	//*   4    8:icmple          14
	//*   5   11:goto            25
			return i & 0xffffff | j << 24;
	//    6   14:iload_0         
	//    7   15:ldc2            #314 <Int 0xffffff>
	//    8   18:iand            
	//    9   19:iload_1         
	//   10   20:bipush          24
	//   11   22:ishl            
	//   12   23:ior             
	//   13   24:ireturn         
		else
			throw new IllegalArgumentException("alpha must be between 0 and 255.");
	//   14   25:new             #135 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:ldc2            #316 <String "alpha must be between 0 and 255.">
	//   17   32:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   18   35:athrow          
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
