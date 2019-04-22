// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


class GammaEvaluator
{

	private static float EOCF_sRGB(float f)
	{
		if(f <= 0.04045F)
	//*   0    0:fload_0         
	//*   1    1:ldc1            #7   <Float 0.04045F>
	//*   2    3:fcmpg           
	//*   3    4:ifgt            12
			return f / 12.92F;
	//    4    7:fload_0         
	//    5    8:ldc1            #8   <Float 12.92F>
	//    6   10:fdiv            
	//    7   11:freturn         
		else
			return (float)Math.pow((f + 0.055F) / 1.055F, 2.4000000953674316D);
	//    8   12:fload_0         
	//    9   13:ldc1            #9   <Float 0.055F>
	//   10   15:fadd            
	//   11   16:ldc1            #10  <Float 1.055F>
	//   12   18:fdiv            
	//   13   19:f2d             
	//   14   20:ldc2w           #11  <Double 2.4000000953674316D>
	//   15   23:invokestatic    #18  <Method double Math.pow(double, double)>
	//   16   26:d2f             
	//   17   27:freturn         
	}

	private static float OECF_sRGB(float f)
	{
		if(f <= 0.0031308F)
	//*   0    0:fload_0         
	//*   1    1:ldc1            #21  <Float 0.0031308F>
	//*   2    3:fcmpg           
	//*   3    4:ifgt            12
			return f * 12.92F;
	//    4    7:fload_0         
	//    5    8:ldc1            #8   <Float 12.92F>
	//    6   10:fmul            
	//    7   11:freturn         
		else
			return (float)(Math.pow(f, 0.4166666567325592D) * 1.0549999475479126D - 0.054999999701976776D);
	//    8   12:fload_0         
	//    9   13:f2d             
	//   10   14:ldc2w           #22  <Double 0.4166666567325592D>
	//   11   17:invokestatic    #18  <Method double Math.pow(double, double)>
	//   12   20:ldc2w           #24  <Double 1.0549999475479126D>
	//   13   23:dmul            
	//   14   24:ldc2w           #26  <Double 0.054999999701976776D>
	//   15   27:dsub            
	//   16   28:d2f             
	//   17   29:freturn         
	}

	static int evaluate(float f, int i, int j)
	{
		float f1 = (float)(i >> 24 & 0xff) / 255F;
	//    0    0:iload_1         
	//    1    1:bipush          24
	//    2    3:ishr            
	//    3    4:sipush          255
	//    4    7:iand            
	//    5    8:i2f             
	//    6    9:ldc1            #30  <Float 255F>
	//    7   11:fdiv            
	//    8   12:fstore_3        
		float f4 = (float)(i >> 16 & 0xff) / 255F;
	//    9   13:iload_1         
	//   10   14:bipush          16
	//   11   16:ishr            
	//   12   17:sipush          255
	//   13   20:iand            
	//   14   21:i2f             
	//   15   22:ldc1            #30  <Float 255F>
	//   16   24:fdiv            
	//   17   25:fstore          6
		float f5 = (float)(i >> 8 & 0xff) / 255F;
	//   18   27:iload_1         
	//   19   28:bipush          8
	//   20   30:ishr            
	//   21   31:sipush          255
	//   22   34:iand            
	//   23   35:i2f             
	//   24   36:ldc1            #30  <Float 255F>
	//   25   38:fdiv            
	//   26   39:fstore          7
		float f6 = (float)(i & 0xff) / 255F;
	//   27   41:iload_1         
	//   28   42:sipush          255
	//   29   45:iand            
	//   30   46:i2f             
	//   31   47:ldc1            #30  <Float 255F>
	//   32   49:fdiv            
	//   33   50:fstore          8
		float f2 = (float)(j >> 24 & 0xff) / 255F;
	//   34   52:iload_2         
	//   35   53:bipush          24
	//   36   55:ishr            
	//   37   56:sipush          255
	//   38   59:iand            
	//   39   60:i2f             
	//   40   61:ldc1            #30  <Float 255F>
	//   41   63:fdiv            
	//   42   64:fstore          4
		float f8 = (float)(j >> 16 & 0xff) / 255F;
	//   43   66:iload_2         
	//   44   67:bipush          16
	//   45   69:ishr            
	//   46   70:sipush          255
	//   47   73:iand            
	//   48   74:i2f             
	//   49   75:ldc1            #30  <Float 255F>
	//   50   77:fdiv            
	//   51   78:fstore          10
		float f7 = (float)(j >> 8 & 0xff) / 255F;
	//   52   80:iload_2         
	//   53   81:bipush          8
	//   54   83:ishr            
	//   55   84:sipush          255
	//   56   87:iand            
	//   57   88:i2f             
	//   58   89:ldc1            #30  <Float 255F>
	//   59   91:fdiv            
	//   60   92:fstore          9
		float f3 = (float)(j & 0xff) / 255F;
	//   61   94:iload_2         
	//   62   95:sipush          255
	//   63   98:iand            
	//   64   99:i2f             
	//   65  100:ldc1            #30  <Float 255F>
	//   66  102:fdiv            
	//   67  103:fstore          5
		f4 = EOCF_sRGB(f4);
	//   68  105:fload           6
	//   69  107:invokestatic    #32  <Method float EOCF_sRGB(float)>
	//   70  110:fstore          6
		f5 = EOCF_sRGB(f5);
	//   71  112:fload           7
	//   72  114:invokestatic    #32  <Method float EOCF_sRGB(float)>
	//   73  117:fstore          7
		f6 = EOCF_sRGB(f6);
	//   74  119:fload           8
	//   75  121:invokestatic    #32  <Method float EOCF_sRGB(float)>
	//   76  124:fstore          8
		f8 = EOCF_sRGB(f8);
	//   77  126:fload           10
	//   78  128:invokestatic    #32  <Method float EOCF_sRGB(float)>
	//   79  131:fstore          10
		f7 = EOCF_sRGB(f7);
	//   80  133:fload           9
	//   81  135:invokestatic    #32  <Method float EOCF_sRGB(float)>
	//   82  138:fstore          9
		f3 = EOCF_sRGB(f3);
	//   83  140:fload           5
	//   84  142:invokestatic    #32  <Method float EOCF_sRGB(float)>
	//   85  145:fstore          5
		f4 = OECF_sRGB(f4 + (f8 - f4) * f);
	//   86  147:fload           6
	//   87  149:fload           10
	//   88  151:fload           6
	//   89  153:fsub            
	//   90  154:fload_0         
	//   91  155:fmul            
	//   92  156:fadd            
	//   93  157:invokestatic    #34  <Method float OECF_sRGB(float)>
	//   94  160:fstore          6
		f5 = OECF_sRGB(f5 + (f7 - f5) * f);
	//   95  162:fload           7
	//   96  164:fload           9
	//   97  166:fload           7
	//   98  168:fsub            
	//   99  169:fload_0         
	//  100  170:fmul            
	//  101  171:fadd            
	//  102  172:invokestatic    #34  <Method float OECF_sRGB(float)>
	//  103  175:fstore          7
		f3 = OECF_sRGB(f6 + f * (f3 - f6));
	//  104  177:fload           8
	//  105  179:fload_0         
	//  106  180:fload           5
	//  107  182:fload           8
	//  108  184:fsub            
	//  109  185:fmul            
	//  110  186:fadd            
	//  111  187:invokestatic    #34  <Method float OECF_sRGB(float)>
	//  112  190:fstore          5
		i = Math.round((f1 + (f2 - f1) * f) * 255F);
	//  113  192:fload_3         
	//  114  193:fload           4
	//  115  195:fload_3         
	//  116  196:fsub            
	//  117  197:fload_0         
	//  118  198:fmul            
	//  119  199:fadd            
	//  120  200:ldc1            #30  <Float 255F>
	//  121  202:fmul            
	//  122  203:invokestatic    #38  <Method int Math.round(float)>
	//  123  206:istore_1        
		return Math.round(f4 * 255F) << 16 | i << 24 | Math.round(f5 * 255F) << 8 | Math.round(f3 * 255F);
	//  124  207:fload           6
	//  125  209:ldc1            #30  <Float 255F>
	//  126  211:fmul            
	//  127  212:invokestatic    #38  <Method int Math.round(float)>
	//  128  215:bipush          16
	//  129  217:ishl            
	//  130  218:iload_1         
	//  131  219:bipush          24
	//  132  221:ishl            
	//  133  222:ior             
	//  134  223:fload           7
	//  135  225:ldc1            #30  <Float 255F>
	//  136  227:fmul            
	//  137  228:invokestatic    #38  <Method int Math.round(float)>
	//  138  231:bipush          8
	//  139  233:ishl            
	//  140  234:ior             
	//  141  235:fload           5
	//  142  237:ldc1            #30  <Float 255F>
	//  143  239:fmul            
	//  144  240:invokestatic    #38  <Method int Math.round(float)>
	//  145  243:ior             
	//  146  244:ireturn         
	}
}
