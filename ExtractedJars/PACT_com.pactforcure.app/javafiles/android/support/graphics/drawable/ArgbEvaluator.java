// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.TypeEvaluator;

public class ArgbEvaluator
	implements TypeEvaluator
{

	public ArgbEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static ArgbEvaluator getInstance()
	{
		return sInstance;
	//    0    0:getstatic       #19  <Field ArgbEvaluator sInstance>
	//    1    3:areturn         
	}

	public Object evaluate(float f, Object obj, Object obj1)
	{
		int i = ((Integer)obj).intValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #27  <Class Integer>
	//    2    4:invokevirtual   #31  <Method int Integer.intValue()>
	//    3    7:istore          12
		float f1 = (float)(i >> 24 & 0xff) / 255F;
	//    4    9:iload           12
	//    5   11:bipush          24
	//    6   13:ishr            
	//    7   14:sipush          255
	//    8   17:iand            
	//    9   18:i2f             
	//   10   19:ldc1            #32  <Float 255F>
	//   11   21:fdiv            
	//   12   22:fstore          4
		float f4 = (float)(i >> 16 & 0xff) / 255F;
	//   13   24:iload           12
	//   14   26:bipush          16
	//   15   28:ishr            
	//   16   29:sipush          255
	//   17   32:iand            
	//   18   33:i2f             
	//   19   34:ldc1            #32  <Float 255F>
	//   20   36:fdiv            
	//   21   37:fstore          7
		float f5 = (float)(i >> 8 & 0xff) / 255F;
	//   22   39:iload           12
	//   23   41:bipush          8
	//   24   43:ishr            
	//   25   44:sipush          255
	//   26   47:iand            
	//   27   48:i2f             
	//   28   49:ldc1            #32  <Float 255F>
	//   29   51:fdiv            
	//   30   52:fstore          8
		float f6 = (float)(i & 0xff) / 255F;
	//   31   54:iload           12
	//   32   56:sipush          255
	//   33   59:iand            
	//   34   60:i2f             
	//   35   61:ldc1            #32  <Float 255F>
	//   36   63:fdiv            
	//   37   64:fstore          9
		i = ((Integer)obj1).intValue();
	//   38   66:aload_3         
	//   39   67:checkcast       #27  <Class Integer>
	//   40   70:invokevirtual   #31  <Method int Integer.intValue()>
	//   41   73:istore          12
		float f2 = (float)(i >> 24 & 0xff) / 255F;
	//   42   75:iload           12
	//   43   77:bipush          24
	//   44   79:ishr            
	//   45   80:sipush          255
	//   46   83:iand            
	//   47   84:i2f             
	//   48   85:ldc1            #32  <Float 255F>
	//   49   87:fdiv            
	//   50   88:fstore          5
		float f8 = (float)(i >> 16 & 0xff) / 255F;
	//   51   90:iload           12
	//   52   92:bipush          16
	//   53   94:ishr            
	//   54   95:sipush          255
	//   55   98:iand            
	//   56   99:i2f             
	//   57  100:ldc1            #32  <Float 255F>
	//   58  102:fdiv            
	//   59  103:fstore          11
		float f7 = (float)(i >> 8 & 0xff) / 255F;
	//   60  105:iload           12
	//   61  107:bipush          8
	//   62  109:ishr            
	//   63  110:sipush          255
	//   64  113:iand            
	//   65  114:i2f             
	//   66  115:ldc1            #32  <Float 255F>
	//   67  117:fdiv            
	//   68  118:fstore          10
		float f3 = (float)(i & 0xff) / 255F;
	//   69  120:iload           12
	//   70  122:sipush          255
	//   71  125:iand            
	//   72  126:i2f             
	//   73  127:ldc1            #32  <Float 255F>
	//   74  129:fdiv            
	//   75  130:fstore          6
		f4 = (float)Math.pow(f4, 2.2000000000000002D);
	//   76  132:fload           7
	//   77  134:f2d             
	//   78  135:ldc2w           #33  <Double 2.2000000000000002D>
	//   79  138:invokestatic    #40  <Method double Math.pow(double, double)>
	//   80  141:d2f             
	//   81  142:fstore          7
		f5 = (float)Math.pow(f5, 2.2000000000000002D);
	//   82  144:fload           8
	//   83  146:f2d             
	//   84  147:ldc2w           #33  <Double 2.2000000000000002D>
	//   85  150:invokestatic    #40  <Method double Math.pow(double, double)>
	//   86  153:d2f             
	//   87  154:fstore          8
		f6 = (float)Math.pow(f6, 2.2000000000000002D);
	//   88  156:fload           9
	//   89  158:f2d             
	//   90  159:ldc2w           #33  <Double 2.2000000000000002D>
	//   91  162:invokestatic    #40  <Method double Math.pow(double, double)>
	//   92  165:d2f             
	//   93  166:fstore          9
		f8 = (float)Math.pow(f8, 2.2000000000000002D);
	//   94  168:fload           11
	//   95  170:f2d             
	//   96  171:ldc2w           #33  <Double 2.2000000000000002D>
	//   97  174:invokestatic    #40  <Method double Math.pow(double, double)>
	//   98  177:d2f             
	//   99  178:fstore          11
		f7 = (float)Math.pow(f7, 2.2000000000000002D);
	//  100  180:fload           10
	//  101  182:f2d             
	//  102  183:ldc2w           #33  <Double 2.2000000000000002D>
	//  103  186:invokestatic    #40  <Method double Math.pow(double, double)>
	//  104  189:d2f             
	//  105  190:fstore          10
		f3 = (float)Math.pow(f3, 2.2000000000000002D);
	//  106  192:fload           6
	//  107  194:f2d             
	//  108  195:ldc2w           #33  <Double 2.2000000000000002D>
	//  109  198:invokestatic    #40  <Method double Math.pow(double, double)>
	//  110  201:d2f             
	//  111  202:fstore          6
		f4 = (float)Math.pow(f4 + (f8 - f4) * f, 0.45454545454545453D);
	//  112  204:fload           7
	//  113  206:fload           11
	//  114  208:fload           7
	//  115  210:fsub            
	//  116  211:fload_1         
	//  117  212:fmul            
	//  118  213:fadd            
	//  119  214:f2d             
	//  120  215:ldc2w           #41  <Double 0.45454545454545453D>
	//  121  218:invokestatic    #40  <Method double Math.pow(double, double)>
	//  122  221:d2f             
	//  123  222:fstore          7
		f5 = (float)Math.pow(f5 + (f7 - f5) * f, 0.45454545454545453D);
	//  124  224:fload           8
	//  125  226:fload           10
	//  126  228:fload           8
	//  127  230:fsub            
	//  128  231:fload_1         
	//  129  232:fmul            
	//  130  233:fadd            
	//  131  234:f2d             
	//  132  235:ldc2w           #41  <Double 0.45454545454545453D>
	//  133  238:invokestatic    #40  <Method double Math.pow(double, double)>
	//  134  241:d2f             
	//  135  242:fstore          8
		f3 = (float)Math.pow(f6 + (f3 - f6) * f, 0.45454545454545453D);
	//  136  244:fload           9
	//  137  246:fload           6
	//  138  248:fload           9
	//  139  250:fsub            
	//  140  251:fload_1         
	//  141  252:fmul            
	//  142  253:fadd            
	//  143  254:f2d             
	//  144  255:ldc2w           #41  <Double 0.45454545454545453D>
	//  145  258:invokestatic    #40  <Method double Math.pow(double, double)>
	//  146  261:d2f             
	//  147  262:fstore          6
		return ((Object) (Integer.valueOf(Math.round((f1 + (f2 - f1) * f) * 255F) << 24 | Math.round(f4 * 255F) << 16 | Math.round(f5 * 255F) << 8 | Math.round(f3 * 255F))));
	//  148  264:fload           4
	//  149  266:fload           5
	//  150  268:fload           4
	//  151  270:fsub            
	//  152  271:fload_1         
	//  153  272:fmul            
	//  154  273:fadd            
	//  155  274:ldc1            #32  <Float 255F>
	//  156  276:fmul            
	//  157  277:invokestatic    #46  <Method int Math.round(float)>
	//  158  280:bipush          24
	//  159  282:ishl            
	//  160  283:fload           7
	//  161  285:ldc1            #32  <Float 255F>
	//  162  287:fmul            
	//  163  288:invokestatic    #46  <Method int Math.round(float)>
	//  164  291:bipush          16
	//  165  293:ishl            
	//  166  294:ior             
	//  167  295:fload           8
	//  168  297:ldc1            #32  <Float 255F>
	//  169  299:fmul            
	//  170  300:invokestatic    #46  <Method int Math.round(float)>
	//  171  303:bipush          8
	//  172  305:ishl            
	//  173  306:ior             
	//  174  307:fload           6
	//  175  309:ldc1            #32  <Float 255F>
	//  176  311:fmul            
	//  177  312:invokestatic    #46  <Method int Math.round(float)>
	//  178  315:ior             
	//  179  316:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//  180  319:areturn         
	}

	private static final ArgbEvaluator sInstance = new ArgbEvaluator();

	static 
	{
	//    0    0:new             #2   <Class ArgbEvaluator>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ArgbEvaluator()>
	//    3    7:putstatic       #19  <Field ArgbEvaluator sInstance>
	//*   4   10:return          
	}
}
