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
	//    6    9:fstore          9
		float f1 = 6.24006F + 0.01720197F * f;
	//    7   11:ldc1            #47  <Float 6.24006F>
	//    8   13:ldc1            #48  <Float 0.01720197F>
	//    9   15:fload           9
	//   10   17:fmul            
	//   11   18:fadd            
	//   12   19:fstore          10
		double d2 = 1.796593063D + ((double)f1 + Math.sin(f1) * 0.033419601619243622D + Math.sin(2.0F * f1) * 0.00034906598739326D + Math.sin(3F * f1) * 5.2360001063789241E-06D) + 3.1415926535897931D;
	//   13   21:ldc2w           #49  <Double 1.796593063D>
	//   14   24:fload           10
	//   15   26:f2d             
	//   16   27:fload           10
	//   17   29:f2d             
	//   18   30:invokestatic    #56  <Method double Math.sin(double)>
	//   19   33:ldc2w           #57  <Double 0.033419601619243622D>
	//   20   36:dmul            
	//   21   37:dadd            
	//   22   38:fconst_2        
	//   23   39:fload           10
	//   24   41:fmul            
	//   25   42:f2d             
	//   26   43:invokestatic    #56  <Method double Math.sin(double)>
	//   27   46:ldc2w           #59  <Double 0.00034906598739326D>
	//   28   49:dmul            
	//   29   50:dadd            
	//   30   51:ldc1            #61  <Float 3F>
	//   31   53:fload           10
	//   32   55:fmul            
	//   33   56:f2d             
	//   34   57:invokestatic    #56  <Method double Math.sin(double)>
	//   35   60:ldc2w           #62  <Double 5.2360001063789241E-06D>
	//   36   63:dmul            
	//   37   64:dadd            
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
		d1 = (double)(0.0009F + (float)Math.round((double)(f - 0.0009F) - d1)) + d1 + Math.sin(f1) * 0.0053D + Math.sin(2D * d2) * -0.0068999999999999999D;
	//   47   81:ldc1            #20  <Float 0.0009F>
	//   48   83:fload           9
	//   49   85:ldc1            #20  <Float 0.0009F>
	//   50   87:fsub            
	//   51   88:f2d             
	//   52   89:dload           5
	//   53   91:dsub            
	//   54   92:invokestatic    #71  <Method long Math.round(double)>
	//   55   95:l2f             
	//   56   96:fadd            
	//   57   97:f2d             
	//   58   98:dload           5
	//   59  100:dadd            
	//   60  101:fload           10
	//   61  103:f2d             
	//   62  104:invokestatic    #56  <Method double Math.sin(double)>
	//   63  107:ldc2w           #72  <Double 0.0053D>
	//   64  110:dmul            
	//   65  111:dadd            
	//   66  112:ldc2w           #74  <Double 2D>
	//   67  115:dload           7
	//   68  117:dmul            
	//   69  118:invokestatic    #56  <Method double Math.sin(double)>
	//   70  121:ldc2w           #76  <Double -0.0068999999999999999D>
	//   71  124:dmul            
	//   72  125:dadd            
	//   73  126:dstore          5
		d2 = Math.asin(Math.sin(d2) * Math.sin(0.40927970409393311D));
	//   74  128:dload           7
	//   75  130:invokestatic    #56  <Method double Math.sin(double)>
	//   76  133:ldc2w           #78  <Double 0.40927970409393311D>
	//   77  136:invokestatic    #56  <Method double Math.sin(double)>
	//   78  139:dmul            
	//   79  140:invokestatic    #82  <Method double Math.asin(double)>
	//   80  143:dstore          7
		d *= 0.01745329238474369D;
	//   81  145:dload_3         
	//   82  146:ldc2w           #83  <Double 0.01745329238474369D>
	//   83  149:dmul            
	//   84  150:dstore_3        
		d = (Math.sin(-0.10471975803375244D) - Math.sin(d) * Math.sin(d2)) / (Math.cos(d) * Math.cos(d2));
	//   85  151:ldc2w           #85  <Double -0.10471975803375244D>
	//   86  154:invokestatic    #56  <Method double Math.sin(double)>
	//   87  157:dload_3         
	//   88  158:invokestatic    #56  <Method double Math.sin(double)>
	//   89  161:dload           7
	//   90  163:invokestatic    #56  <Method double Math.sin(double)>
	//   91  166:dmul            
	//   92  167:dsub            
	//   93  168:dload_3         
	//   94  169:invokestatic    #89  <Method double Math.cos(double)>
	//   95  172:dload           7
	//   96  174:invokestatic    #89  <Method double Math.cos(double)>
	//   97  177:dmul            
	//   98  178:ddiv            
	//   99  179:dstore_3        
		if(d >= 1.0D)
	//* 100  180:dload_3         
	//* 101  181:dconst_1        
	//* 102  182:dcmpl           
	//* 103  183:iflt            206
		{
			state = 1;
	//  104  186:aload_0         
	//  105  187:iconst_1        
	//  106  188:putfield        #91  <Field int state>
			sunset = -1L;
	//  107  191:aload_0         
	//  108  192:ldc2w           #92  <Long -1L>
	//  109  195:putfield        #95  <Field long sunset>
			sunrise = -1L;
	//  110  198:aload_0         
	//  111  199:ldc2w           #92  <Long -1L>
	//  112  202:putfield        #97  <Field long sunrise>
			return;
	//  113  205:return          
		}
		if(d <= -1D)
	//* 114  206:dload_3         
	//* 115  207:ldc2w           #98  <Double -1D>
	//* 116  210:dcmpg           
	//* 117  211:ifgt            234
		{
			state = 0;
	//  118  214:aload_0         
	//  119  215:iconst_0        
	//  120  216:putfield        #91  <Field int state>
			sunset = -1L;
	//  121  219:aload_0         
	//  122  220:ldc2w           #92  <Long -1L>
	//  123  223:putfield        #95  <Field long sunset>
			sunrise = -1L;
	//  124  226:aload_0         
	//  125  227:ldc2w           #92  <Long -1L>
	//  126  230:putfield        #97  <Field long sunrise>
			return;
	//  127  233:return          
		}
		f = (float)(Math.acos(d) / 6.2831853071795862D);
	//  128  234:dload_3         
	//  129  235:invokestatic    #102 <Method double Math.acos(double)>
	//  130  238:ldc2w           #103 <Double 6.2831853071795862D>
	//  131  241:ddiv            
	//  132  242:d2f             
	//  133  243:fstore          9
		sunset = Math.round(((double)f + d1) * 86400000D) + 0x6d62da00L;
	//  134  245:aload_0         
	//  135  246:fload           9
	//  136  248:f2d             
	//  137  249:dload           5
	//  138  251:dadd            
	//  139  252:ldc2w           #105 <Double 86400000D>
	//  140  255:dmul            
	//  141  256:invokestatic    #71  <Method long Math.round(double)>
	//  142  259:ldc2w           #27  <Long 0x6d62da00L>
	//  143  262:ladd            
	//  144  263:putfield        #95  <Field long sunset>
		sunrise = Math.round((d1 - (double)f) * 86400000D) + 0x6d62da00L;
	//  145  266:aload_0         
	//  146  267:dload           5
	//  147  269:fload           9
	//  148  271:f2d             
	//  149  272:dsub            
	//  150  273:ldc2w           #105 <Double 86400000D>
	//  151  276:dmul            
	//  152  277:invokestatic    #71  <Method long Math.round(double)>
	//  153  280:ldc2w           #27  <Long 0x6d62da00L>
	//  154  283:ladd            
	//  155  284:putfield        #97  <Field long sunrise>
		if(sunrise < l && sunset > l)
	//* 156  287:aload_0         
	//* 157  288:getfield        #97  <Field long sunrise>
	//* 158  291:lload_1         
	//* 159  292:lcmp            
	//* 160  293:ifge            311
	//* 161  296:aload_0         
	//* 162  297:getfield        #95  <Field long sunset>
	//* 163  300:lload_1         
	//* 164  301:lcmp            
	//* 165  302:ifle            311
		{
			state = 0;
	//  166  305:aload_0         
	//  167  306:iconst_0        
	//  168  307:putfield        #91  <Field int state>
			return;
	//  169  310:return          
		} else
		{
			state = 1;
	//  170  311:aload_0         
	//  171  312:iconst_1        
	//  172  313:putfield        #91  <Field int state>
			return;
	//  173  316:return          
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
