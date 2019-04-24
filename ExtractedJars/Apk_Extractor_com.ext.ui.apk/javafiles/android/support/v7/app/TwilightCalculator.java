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
	//    6    9:fstore          15
		float f1 = 6.24006F + 0.01720197F * f;
	//    7   11:ldc1            #47  <Float 6.24006F>
	//    8   13:ldc1            #48  <Float 0.01720197F>
	//    9   15:fload           15
	//   10   17:fmul            
	//   11   18:fadd            
	//   12   19:fstore          16
		double d2 = (double)f1 + 0.033419601619243622D * Math.sin(f1) + 0.00034906598739326D * Math.sin(2.0F * f1) + 5.2360001063789241E-06D * Math.sin(3F * f1) + 1.796593063D + 3.1415926535897931D;
	//   13   21:fload           16
	//   14   23:f2d             
	//   15   24:ldc2w           #49  <Double 0.033419601619243622D>
	//   16   27:fload           16
	//   17   29:f2d             
	//   18   30:invokestatic    #56  <Method double Math.sin(double)>
	//   19   33:dmul            
	//   20   34:dadd            
	//   21   35:ldc2w           #57  <Double 0.00034906598739326D>
	//   22   38:fconst_2        
	//   23   39:fload           16
	//   24   41:fmul            
	//   25   42:f2d             
	//   26   43:invokestatic    #56  <Method double Math.sin(double)>
	//   27   46:dmul            
	//   28   47:dadd            
	//   29   48:ldc2w           #59  <Double 5.2360001063789241E-06D>
	//   30   51:ldc1            #61  <Float 3F>
	//   31   53:fload           16
	//   32   55:fmul            
	//   33   56:f2d             
	//   34   57:invokestatic    #56  <Method double Math.sin(double)>
	//   35   60:dmul            
	//   36   61:dadd            
	//   37   62:ldc2w           #62  <Double 1.796593063D>
	//   38   65:dadd            
	//   39   66:ldc2w           #64  <Double 3.1415926535897931D>
	//   40   69:dadd            
	//   41   70:dstore          7
		d1 = -d1 / 360D;
	//   42   72:dload           5
	//   43   74:dneg            
	//   44   75:ldc2w           #66  <Double 360D>
	//   45   78:ddiv            
	//   46   79:dstore          5
		double d3 = (float)Math.round((double)(f - 0.0009F) - d1) + 0.0009F;
	//   47   81:fload           15
	//   48   83:ldc1            #20  <Float 0.0009F>
	//   49   85:fsub            
	//   50   86:f2d             
	//   51   87:dload           5
	//   52   89:dsub            
	//   53   90:invokestatic    #71  <Method long Math.round(double)>
	//   54   93:l2f             
	//   55   94:ldc1            #20  <Float 0.0009F>
	//   56   96:fadd            
	//   57   97:f2d             
	//   58   98:dstore          9
		d1 = Math.sin(f1) * 0.0053D + (d1 + d3) + -0.0068999999999999999D * Math.sin(2D * d2);
	//   59  100:fload           16
	//   60  102:f2d             
	//   61  103:invokestatic    #56  <Method double Math.sin(double)>
	//   62  106:ldc2w           #72  <Double 0.0053D>
	//   63  109:dmul            
	//   64  110:dload           5
	//   65  112:dload           9
	//   66  114:dadd            
	//   67  115:dadd            
	//   68  116:ldc2w           #74  <Double -0.0068999999999999999D>
	//   69  119:ldc2w           #76  <Double 2D>
	//   70  122:dload           7
	//   71  124:dmul            
	//   72  125:invokestatic    #56  <Method double Math.sin(double)>
	//   73  128:dmul            
	//   74  129:dadd            
	//   75  130:dstore          5
		d2 = Math.asin(Math.sin(d2) * Math.sin(0.40927970409393311D));
	//   76  132:dload           7
	//   77  134:invokestatic    #56  <Method double Math.sin(double)>
	//   78  137:ldc2w           #78  <Double 0.40927970409393311D>
	//   79  140:invokestatic    #56  <Method double Math.sin(double)>
	//   80  143:dmul            
	//   81  144:invokestatic    #82  <Method double Math.asin(double)>
	//   82  147:dstore          7
		double d5 = 0.01745329238474369D * d;
	//   83  149:ldc2w           #83  <Double 0.01745329238474369D>
	//   84  152:dload_3         
	//   85  153:dmul            
	//   86  154:dstore          13
		d = Math.sin(-0.10471975803375244D);
	//   87  156:ldc2w           #85  <Double -0.10471975803375244D>
	//   88  159:invokestatic    #56  <Method double Math.sin(double)>
	//   89  162:dstore_3        
		d3 = Math.sin(d5);
	//   90  163:dload           13
	//   91  165:invokestatic    #56  <Method double Math.sin(double)>
	//   92  168:dstore          9
		double d4 = Math.sin(d2);
	//   93  170:dload           7
	//   94  172:invokestatic    #56  <Method double Math.sin(double)>
	//   95  175:dstore          11
		d5 = Math.cos(d5);
	//   96  177:dload           13
	//   97  179:invokestatic    #89  <Method double Math.cos(double)>
	//   98  182:dstore          13
		d = (d - d3 * d4) / (Math.cos(d2) * d5);
	//   99  184:dload_3         
	//  100  185:dload           9
	//  101  187:dload           11
	//  102  189:dmul            
	//  103  190:dsub            
	//  104  191:dload           7
	//  105  193:invokestatic    #89  <Method double Math.cos(double)>
	//  106  196:dload           13
	//  107  198:dmul            
	//  108  199:ddiv            
	//  109  200:dstore_3        
		if(d >= 1.0D)
	//* 110  201:dload_3         
	//* 111  202:dconst_1        
	//* 112  203:dcmpl           
	//* 113  204:iflt            227
		{
			state = 1;
	//  114  207:aload_0         
	//  115  208:iconst_1        
	//  116  209:putfield        #91  <Field int state>
			sunset = -1L;
	//  117  212:aload_0         
	//  118  213:ldc2w           #92  <Long -1L>
	//  119  216:putfield        #95  <Field long sunset>
			sunrise = -1L;
	//  120  219:aload_0         
	//  121  220:ldc2w           #92  <Long -1L>
	//  122  223:putfield        #97  <Field long sunrise>
			return;
	//  123  226:return          
		}
		if(d <= -1D)
	//* 124  227:dload_3         
	//* 125  228:ldc2w           #98  <Double -1D>
	//* 126  231:dcmpg           
	//* 127  232:ifgt            255
		{
			state = 0;
	//  128  235:aload_0         
	//  129  236:iconst_0        
	//  130  237:putfield        #91  <Field int state>
			sunset = -1L;
	//  131  240:aload_0         
	//  132  241:ldc2w           #92  <Long -1L>
	//  133  244:putfield        #95  <Field long sunset>
			sunrise = -1L;
	//  134  247:aload_0         
	//  135  248:ldc2w           #92  <Long -1L>
	//  136  251:putfield        #97  <Field long sunrise>
			return;
	//  137  254:return          
		}
		f = (float)(Math.acos(d) / 6.2831853071795862D);
	//  138  255:dload_3         
	//  139  256:invokestatic    #102 <Method double Math.acos(double)>
	//  140  259:ldc2w           #103 <Double 6.2831853071795862D>
	//  141  262:ddiv            
	//  142  263:d2f             
	//  143  264:fstore          15
		sunset = Math.round(((double)f + d1) * 86400000D) + 0x6d62da00L;
	//  144  266:aload_0         
	//  145  267:fload           15
	//  146  269:f2d             
	//  147  270:dload           5
	//  148  272:dadd            
	//  149  273:ldc2w           #105 <Double 86400000D>
	//  150  276:dmul            
	//  151  277:invokestatic    #71  <Method long Math.round(double)>
	//  152  280:ldc2w           #27  <Long 0x6d62da00L>
	//  153  283:ladd            
	//  154  284:putfield        #95  <Field long sunset>
		sunrise = Math.round((d1 - (double)f) * 86400000D) + 0x6d62da00L;
	//  155  287:aload_0         
	//  156  288:dload           5
	//  157  290:fload           15
	//  158  292:f2d             
	//  159  293:dsub            
	//  160  294:ldc2w           #105 <Double 86400000D>
	//  161  297:dmul            
	//  162  298:invokestatic    #71  <Method long Math.round(double)>
	//  163  301:ldc2w           #27  <Long 0x6d62da00L>
	//  164  304:ladd            
	//  165  305:putfield        #97  <Field long sunrise>
		if(sunrise < l && sunset > l)
	//* 166  308:aload_0         
	//* 167  309:getfield        #97  <Field long sunrise>
	//* 168  312:lload_1         
	//* 169  313:lcmp            
	//* 170  314:ifge            332
	//* 171  317:aload_0         
	//* 172  318:getfield        #95  <Field long sunset>
	//* 173  321:lload_1         
	//* 174  322:lcmp            
	//* 175  323:ifle            332
		{
			state = 0;
	//  176  326:aload_0         
	//  177  327:iconst_0        
	//  178  328:putfield        #91  <Field int state>
			return;
	//  179  331:return          
		} else
		{
			state = 1;
	//  180  332:aload_0         
	//  181  333:iconst_1        
	//  182  334:putfield        #91  <Field int state>
			return;
	//  183  337:return          
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
