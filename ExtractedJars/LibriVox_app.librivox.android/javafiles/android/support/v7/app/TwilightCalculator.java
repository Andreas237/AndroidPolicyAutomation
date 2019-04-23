// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


class TwilightCalculator
{

	TwilightCalculator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	static TwilightCalculator getInstance()
	{
		if(sInstance == null)
	//*   0    0:getstatic       #42  <Field TwilightCalculator sInstance>
	//*   1    3:ifnonnull       16
			sInstance = new TwilightCalculator();
	//    2    6:new             #2   <Class TwilightCalculator>
	//    3    9:dup             
	//    4   10:invokespecial   #43  <Method void TwilightCalculator()>
	//    5   13:putstatic       #42  <Field TwilightCalculator sInstance>
		return sInstance;
	//    6   16:getstatic       #42  <Field TwilightCalculator sInstance>
	//    7   19:areturn         
	}

	public void calculateTwilight(long l, double d, double d1)
	{
		float f = (float)(l - 0x6d62da00L) / 8.64E+07F;
	//    0    0:lload_1         
	//    1    1:ldc2w           #27  <Long 0x6d62da00L>
	//    2    4:lsub            
	//    3    5:l2f             
	//    4    6:ldc1            #46  <Float 8.64E+07F>
	//    5    8:fdiv            
	//    6    9:fstore          13
		float f1 = 0.01720197F * f + 6.24006F;
	//    7   11:ldc1            #47  <Float 0.01720197F>
	//    8   13:fload           13
	//    9   15:fmul            
	//   10   16:ldc1            #48  <Float 6.24006F>
	//   11   18:fadd            
	//   12   19:fstore          14
		double d2 = f1;
	//   13   21:fload           14
	//   14   23:f2d             
	//   15   24:dstore          7
		double d3 = Math.sin(d2);
	//   16   26:dload           7
	//   17   28:invokestatic    #54  <Method double Math.sin(double)>
	//   18   31:dstore          9
		Double.isNaN(d2);
	//   19   33:dload           7
	//   20   35:invokestatic    #60  <Method boolean Double.isNaN(double)>
	//   21   38:pop             
		d3 = d3 * 0.033419601619243622D + d2 + Math.sin(2.0F * f1) * 0.00034906598739326D + Math.sin(f1 * 3F) * 5.2360001063789241E-06D + 1.796593063D + 3.1415926535897931D;
	//   22   39:dload           9
	//   23   41:ldc2w           #61  <Double 0.033419601619243622D>
	//   24   44:dmul            
	//   25   45:dload           7
	//   26   47:dadd            
	//   27   48:fconst_2        
	//   28   49:fload           14
	//   29   51:fmul            
	//   30   52:f2d             
	//   31   53:invokestatic    #54  <Method double Math.sin(double)>
	//   32   56:ldc2w           #63  <Double 0.00034906598739326D>
	//   33   59:dmul            
	//   34   60:dadd            
	//   35   61:fload           14
	//   36   63:ldc1            #65  <Float 3F>
	//   37   65:fmul            
	//   38   66:f2d             
	//   39   67:invokestatic    #54  <Method double Math.sin(double)>
	//   40   70:ldc2w           #66  <Double 5.2360001063789241E-06D>
	//   41   73:dmul            
	//   42   74:dadd            
	//   43   75:ldc2w           #68  <Double 1.796593063D>
	//   44   78:dadd            
	//   45   79:ldc2w           #70  <Double 3.1415926535897931D>
	//   46   82:dadd            
	//   47   83:dstore          9
		d1 = -d1 / 360D;
	//   48   85:dload           5
	//   49   87:dneg            
	//   50   88:ldc2w           #72  <Double 360D>
	//   51   91:ddiv            
	//   52   92:dstore          5
		double d4 = f - 0.0009F;
	//   53   94:fload           13
	//   54   96:ldc1            #20  <Float 0.0009F>
	//   55   98:fsub            
	//   56   99:f2d             
	//   57  100:dstore          11
		Double.isNaN(d4);
	//   58  102:dload           11
	//   59  104:invokestatic    #60  <Method boolean Double.isNaN(double)>
	//   60  107:pop             
		d4 = (float)Math.round(d4 - d1) + 0.0009F;
	//   61  108:dload           11
	//   62  110:dload           5
	//   63  112:dsub            
	//   64  113:invokestatic    #77  <Method long Math.round(double)>
	//   65  116:l2f             
	//   66  117:ldc1            #20  <Float 0.0009F>
	//   67  119:fadd            
	//   68  120:f2d             
	//   69  121:dstore          11
		Double.isNaN(d4);
	//   70  123:dload           11
	//   71  125:invokestatic    #60  <Method boolean Double.isNaN(double)>
	//   72  128:pop             
		d1 = d4 + d1 + Math.sin(d2) * 0.0053D + Math.sin(2D * d3) * -0.0068999999999999999D;
	//   73  129:dload           11
	//   74  131:dload           5
	//   75  133:dadd            
	//   76  134:dload           7
	//   77  136:invokestatic    #54  <Method double Math.sin(double)>
	//   78  139:ldc2w           #78  <Double 0.0053D>
	//   79  142:dmul            
	//   80  143:dadd            
	//   81  144:ldc2w           #80  <Double 2D>
	//   82  147:dload           9
	//   83  149:dmul            
	//   84  150:invokestatic    #54  <Method double Math.sin(double)>
	//   85  153:ldc2w           #82  <Double -0.0068999999999999999D>
	//   86  156:dmul            
	//   87  157:dadd            
	//   88  158:dstore          5
		d2 = Math.asin(Math.sin(d3) * Math.sin(0.40927970409393311D));
	//   89  160:dload           9
	//   90  162:invokestatic    #54  <Method double Math.sin(double)>
	//   91  165:ldc2w           #84  <Double 0.40927970409393311D>
	//   92  168:invokestatic    #54  <Method double Math.sin(double)>
	//   93  171:dmul            
	//   94  172:invokestatic    #88  <Method double Math.asin(double)>
	//   95  175:dstore          7
		d = 0.01745329238474369D * d;
	//   96  177:ldc2w           #89  <Double 0.01745329238474369D>
	//   97  180:dload_3         
	//   98  181:dmul            
	//   99  182:dstore_3        
		d = (Math.sin(-0.10471975803375244D) - Math.sin(d) * Math.sin(d2)) / (Math.cos(d) * Math.cos(d2));
	//  100  183:ldc2w           #91  <Double -0.10471975803375244D>
	//  101  186:invokestatic    #54  <Method double Math.sin(double)>
	//  102  189:dload_3         
	//  103  190:invokestatic    #54  <Method double Math.sin(double)>
	//  104  193:dload           7
	//  105  195:invokestatic    #54  <Method double Math.sin(double)>
	//  106  198:dmul            
	//  107  199:dsub            
	//  108  200:dload_3         
	//  109  201:invokestatic    #95  <Method double Math.cos(double)>
	//  110  204:dload           7
	//  111  206:invokestatic    #95  <Method double Math.cos(double)>
	//  112  209:dmul            
	//  113  210:ddiv            
	//  114  211:dstore_3        
		if(d >= 1.0D)
	//* 115  212:dload_3         
	//* 116  213:dconst_1        
	//* 117  214:dcmpl           
	//* 118  215:iflt            238
		{
			state = 1;
	//  119  218:aload_0         
	//  120  219:iconst_1        
	//  121  220:putfield        #97  <Field int state>
			sunset = -1L;
	//  122  223:aload_0         
	//  123  224:ldc2w           #98  <Long -1L>
	//  124  227:putfield        #101 <Field long sunset>
			sunrise = -1L;
	//  125  230:aload_0         
	//  126  231:ldc2w           #98  <Long -1L>
	//  127  234:putfield        #103 <Field long sunrise>
			return;
	//  128  237:return          
		}
		if(d <= -1D)
	//* 129  238:dload_3         
	//* 130  239:ldc2w           #104 <Double -1D>
	//* 131  242:dcmpg           
	//* 132  243:ifgt            266
		{
			state = 0;
	//  133  246:aload_0         
	//  134  247:iconst_0        
	//  135  248:putfield        #97  <Field int state>
			sunset = -1L;
	//  136  251:aload_0         
	//  137  252:ldc2w           #98  <Long -1L>
	//  138  255:putfield        #101 <Field long sunset>
			sunrise = -1L;
	//  139  258:aload_0         
	//  140  259:ldc2w           #98  <Long -1L>
	//  141  262:putfield        #103 <Field long sunrise>
			return;
	//  142  265:return          
		}
		d = (float)(Math.acos(d) / 6.2831853071795862D);
	//  143  266:dload_3         
	//  144  267:invokestatic    #108 <Method double Math.acos(double)>
	//  145  270:ldc2w           #109 <Double 6.2831853071795862D>
	//  146  273:ddiv            
	//  147  274:d2f             
	//  148  275:f2d             
	//  149  276:dstore_3        
		Double.isNaN(d);
	//  150  277:dload_3         
	//  151  278:invokestatic    #60  <Method boolean Double.isNaN(double)>
	//  152  281:pop             
		sunset = Math.round((d1 + d) * 86400000D) + 0x6d62da00L;
	//  153  282:aload_0         
	//  154  283:dload           5
	//  155  285:dload_3         
	//  156  286:dadd            
	//  157  287:ldc2w           #111 <Double 86400000D>
	//  158  290:dmul            
	//  159  291:invokestatic    #77  <Method long Math.round(double)>
	//  160  294:ldc2w           #27  <Long 0x6d62da00L>
	//  161  297:ladd            
	//  162  298:putfield        #101 <Field long sunset>
		Double.isNaN(d);
	//  163  301:dload_3         
	//  164  302:invokestatic    #60  <Method boolean Double.isNaN(double)>
	//  165  305:pop             
		sunrise = Math.round((d1 - d) * 86400000D) + 0x6d62da00L;
	//  166  306:aload_0         
	//  167  307:dload           5
	//  168  309:dload_3         
	//  169  310:dsub            
	//  170  311:ldc2w           #111 <Double 86400000D>
	//  171  314:dmul            
	//  172  315:invokestatic    #77  <Method long Math.round(double)>
	//  173  318:ldc2w           #27  <Long 0x6d62da00L>
	//  174  321:ladd            
	//  175  322:putfield        #103 <Field long sunrise>
		if(sunrise < l && sunset > l)
	//* 176  325:aload_0         
	//* 177  326:getfield        #103 <Field long sunrise>
	//* 178  329:lload_1         
	//* 179  330:lcmp            
	//* 180  331:ifge            349
	//* 181  334:aload_0         
	//* 182  335:getfield        #101 <Field long sunset>
	//* 183  338:lload_1         
	//* 184  339:lcmp            
	//* 185  340:ifle            349
		{
			state = 0;
	//  186  343:aload_0         
	//  187  344:iconst_0        
	//  188  345:putfield        #97  <Field int state>
			return;
	//  189  348:return          
		} else
		{
			state = 1;
	//  190  349:aload_0         
	//  191  350:iconst_1        
	//  192  351:putfield        #97  <Field int state>
			return;
	//  193  354:return          
		}
	}

	private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.1047198F;
	private static final float C1 = 0.0334196F;
	private static final float C2 = 0.000349066F;
	private static final float C3 = 5.236E-06F;
	public static final int DAY = 0;
	private static final float DEGREES_TO_RADIANS = 0.01745329F;
	private static final float J0 = 0.0009F;
	public static final int NIGHT = 1;
	private static final float OBLIQUITY = 0.4092797F;
	private static final long UTC_2000 = 0x6d62da00L;
	private static TwilightCalculator sInstance;
	public int state;
	public long sunrise;
	public long sunset;
}
