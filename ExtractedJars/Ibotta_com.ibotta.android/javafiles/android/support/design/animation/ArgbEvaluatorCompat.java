// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.animation.TypeEvaluator;

public class ArgbEvaluatorCompat
	implements TypeEvaluator
{

	public ArgbEvaluatorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static ArgbEvaluatorCompat getInstance()
	{
		return instance;
	//    0    0:getstatic       #16  <Field ArgbEvaluatorCompat instance>
	//    1    3:areturn         
	}

	public Integer evaluate(float f, Integer integer, Integer integer1)
	{
		int i = integer.intValue();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #28  <Method int Integer.intValue()>
	//    2    4:istore          12
		float f1 = (float)(i >> 24 & 0xff) / 255F;
	//    3    6:iload           12
	//    4    8:bipush          24
	//    5   10:ishr            
	//    6   11:sipush          255
	//    7   14:iand            
	//    8   15:i2f             
	//    9   16:ldc1            #29  <Float 255F>
	//   10   18:fdiv            
	//   11   19:fstore          4
		float f4 = (float)(i >> 16 & 0xff) / 255F;
	//   12   21:iload           12
	//   13   23:bipush          16
	//   14   25:ishr            
	//   15   26:sipush          255
	//   16   29:iand            
	//   17   30:i2f             
	//   18   31:ldc1            #29  <Float 255F>
	//   19   33:fdiv            
	//   20   34:fstore          7
		float f5 = (float)(i >> 8 & 0xff) / 255F;
	//   21   36:iload           12
	//   22   38:bipush          8
	//   23   40:ishr            
	//   24   41:sipush          255
	//   25   44:iand            
	//   26   45:i2f             
	//   27   46:ldc1            #29  <Float 255F>
	//   28   48:fdiv            
	//   29   49:fstore          8
		float f6 = (float)(i & 0xff) / 255F;
	//   30   51:iload           12
	//   31   53:sipush          255
	//   32   56:iand            
	//   33   57:i2f             
	//   34   58:ldc1            #29  <Float 255F>
	//   35   60:fdiv            
	//   36   61:fstore          9
		i = integer1.intValue();
	//   37   63:aload_3         
	//   38   64:invokevirtual   #28  <Method int Integer.intValue()>
	//   39   67:istore          12
		float f2 = (float)(i >> 24 & 0xff) / 255F;
	//   40   69:iload           12
	//   41   71:bipush          24
	//   42   73:ishr            
	//   43   74:sipush          255
	//   44   77:iand            
	//   45   78:i2f             
	//   46   79:ldc1            #29  <Float 255F>
	//   47   81:fdiv            
	//   48   82:fstore          5
		float f8 = (float)(i >> 16 & 0xff) / 255F;
	//   49   84:iload           12
	//   50   86:bipush          16
	//   51   88:ishr            
	//   52   89:sipush          255
	//   53   92:iand            
	//   54   93:i2f             
	//   55   94:ldc1            #29  <Float 255F>
	//   56   96:fdiv            
	//   57   97:fstore          11
		float f7 = (float)(i >> 8 & 0xff) / 255F;
	//   58   99:iload           12
	//   59  101:bipush          8
	//   60  103:ishr            
	//   61  104:sipush          255
	//   62  107:iand            
	//   63  108:i2f             
	//   64  109:ldc1            #29  <Float 255F>
	//   65  111:fdiv            
	//   66  112:fstore          10
		float f3 = (float)(i & 0xff) / 255F;
	//   67  114:iload           12
	//   68  116:sipush          255
	//   69  119:iand            
	//   70  120:i2f             
	//   71  121:ldc1            #29  <Float 255F>
	//   72  123:fdiv            
	//   73  124:fstore          6
		f4 = (float)Math.pow(f4, 2.2000000000000002D);
	//   74  126:fload           7
	//   75  128:f2d             
	//   76  129:ldc2w           #30  <Double 2.2000000000000002D>
	//   77  132:invokestatic    #37  <Method double Math.pow(double, double)>
	//   78  135:d2f             
	//   79  136:fstore          7
		f5 = (float)Math.pow(f5, 2.2000000000000002D);
	//   80  138:fload           8
	//   81  140:f2d             
	//   82  141:ldc2w           #30  <Double 2.2000000000000002D>
	//   83  144:invokestatic    #37  <Method double Math.pow(double, double)>
	//   84  147:d2f             
	//   85  148:fstore          8
		f6 = (float)Math.pow(f6, 2.2000000000000002D);
	//   86  150:fload           9
	//   87  152:f2d             
	//   88  153:ldc2w           #30  <Double 2.2000000000000002D>
	//   89  156:invokestatic    #37  <Method double Math.pow(double, double)>
	//   90  159:d2f             
	//   91  160:fstore          9
		f8 = (float)Math.pow(f8, 2.2000000000000002D);
	//   92  162:fload           11
	//   93  164:f2d             
	//   94  165:ldc2w           #30  <Double 2.2000000000000002D>
	//   95  168:invokestatic    #37  <Method double Math.pow(double, double)>
	//   96  171:d2f             
	//   97  172:fstore          11
		f7 = (float)Math.pow(f7, 2.2000000000000002D);
	//   98  174:fload           10
	//   99  176:f2d             
	//  100  177:ldc2w           #30  <Double 2.2000000000000002D>
	//  101  180:invokestatic    #37  <Method double Math.pow(double, double)>
	//  102  183:d2f             
	//  103  184:fstore          10
		f3 = (float)Math.pow(f3, 2.2000000000000002D);
	//  104  186:fload           6
	//  105  188:f2d             
	//  106  189:ldc2w           #30  <Double 2.2000000000000002D>
	//  107  192:invokestatic    #37  <Method double Math.pow(double, double)>
	//  108  195:d2f             
	//  109  196:fstore          6
		f4 = (float)Math.pow(f4 + (f8 - f4) * f, 0.45454545454545453D);
	//  110  198:fload           7
	//  111  200:fload           11
	//  112  202:fload           7
	//  113  204:fsub            
	//  114  205:fload_1         
	//  115  206:fmul            
	//  116  207:fadd            
	//  117  208:f2d             
	//  118  209:ldc2w           #38  <Double 0.45454545454545453D>
	//  119  212:invokestatic    #37  <Method double Math.pow(double, double)>
	//  120  215:d2f             
	//  121  216:fstore          7
		f5 = (float)Math.pow(f5 + (f7 - f5) * f, 0.45454545454545453D);
	//  122  218:fload           8
	//  123  220:fload           10
	//  124  222:fload           8
	//  125  224:fsub            
	//  126  225:fload_1         
	//  127  226:fmul            
	//  128  227:fadd            
	//  129  228:f2d             
	//  130  229:ldc2w           #38  <Double 0.45454545454545453D>
	//  131  232:invokestatic    #37  <Method double Math.pow(double, double)>
	//  132  235:d2f             
	//  133  236:fstore          8
		f3 = (float)Math.pow(f6 + f * (f3 - f6), 0.45454545454545453D);
	//  134  238:fload           9
	//  135  240:fload_1         
	//  136  241:fload           6
	//  137  243:fload           9
	//  138  245:fsub            
	//  139  246:fmul            
	//  140  247:fadd            
	//  141  248:f2d             
	//  142  249:ldc2w           #38  <Double 0.45454545454545453D>
	//  143  252:invokestatic    #37  <Method double Math.pow(double, double)>
	//  144  255:d2f             
	//  145  256:fstore          6
		i = Math.round((f1 + (f2 - f1) * f) * 255F);
	//  146  258:fload           4
	//  147  260:fload           5
	//  148  262:fload           4
	//  149  264:fsub            
	//  150  265:fload_1         
	//  151  266:fmul            
	//  152  267:fadd            
	//  153  268:ldc1            #29  <Float 255F>
	//  154  270:fmul            
	//  155  271:invokestatic    #43  <Method int Math.round(float)>
	//  156  274:istore          12
		return Integer.valueOf(Math.round(f4 * 255F) << 16 | i << 24 | Math.round(f5 * 255F) << 8 | Math.round(f3 * 255F));
	//  157  276:fload           7
	//  158  278:ldc1            #29  <Float 255F>
	//  159  280:fmul            
	//  160  281:invokestatic    #43  <Method int Math.round(float)>
	//  161  284:bipush          16
	//  162  286:ishl            
	//  163  287:iload           12
	//  164  289:bipush          24
	//  165  291:ishl            
	//  166  292:ior             
	//  167  293:fload           8
	//  168  295:ldc1            #29  <Float 255F>
	//  169  297:fmul            
	//  170  298:invokestatic    #43  <Method int Math.round(float)>
	//  171  301:bipush          8
	//  172  303:ishl            
	//  173  304:ior             
	//  174  305:fload           6
	//  175  307:ldc1            #29  <Float 255F>
	//  176  309:fmul            
	//  177  310:invokestatic    #43  <Method int Math.round(float)>
	//  178  313:ior             
	//  179  314:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//  180  317:areturn         
	}

	public volatile Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (evaluate(f, (Integer)obj, (Integer)obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #24  <Class Integer>
	//    4    6:aload_3         
	//    5    7:checkcast       #24  <Class Integer>
	//    6   10:invokevirtual   #50  <Method Integer evaluate(float, Integer, Integer)>
	//    7   13:areturn         
	}

	private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

	static 
	{
	//    0    0:new             #2   <Class ArgbEvaluatorCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArgbEvaluatorCompat()>
	//    3    7:putstatic       #16  <Field ArgbEvaluatorCompat instance>
	//*   4   10:return          
	}
}
