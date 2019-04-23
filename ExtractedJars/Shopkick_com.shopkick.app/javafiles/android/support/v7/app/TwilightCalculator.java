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
	//    6    9:fstore          11
		float f1 = 0.01720197F * f + 6.24006F;
	//    7   11:ldc1            #47  <Float 0.01720197F>
	//    8   13:fload           11
	//    9   15:fmul            
	//   10   16:ldc1            #48  <Float 6.24006F>
	//   11   18:fadd            
	//   12   19:fstore          12
		double d3 = f1;
	//   13   21:fload           12
	//   14   23:f2d             
	//   15   24:dstore          9
		double d2 = Math.sin(d3) * 0.033419601619243622D + d3 + Math.sin(2.0F * f1) * 0.00034906598739326D + Math.sin(f1 * 3F) * 5.2360001063789241E-06D + 1.796593063D + 3.1415926535897931D;
	//   16   26:dload           9
	//   17   28:invokestatic    #54  <Method double Math.sin(double)>
	//   18   31:ldc2w           #55  <Double 0.033419601619243622D>
	//   19   34:dmul            
	//   20   35:dload           9
	//   21   37:dadd            
	//   22   38:fconst_2        
	//   23   39:fload           12
	//   24   41:fmul            
	//   25   42:f2d             
	//   26   43:invokestatic    #54  <Method double Math.sin(double)>
	//   27   46:ldc2w           #57  <Double 0.00034906598739326D>
	//   28   49:dmul            
	//   29   50:dadd            
	//   30   51:fload           12
	//   31   53:ldc1            #59  <Float 3F>
	//   32   55:fmul            
	//   33   56:f2d             
	//   34   57:invokestatic    #54  <Method double Math.sin(double)>
	//   35   60:ldc2w           #60  <Double 5.2360001063789241E-06D>
	//   36   63:dmul            
	//   37   64:dadd            
	//   38   65:ldc2w           #62  <Double 1.796593063D>
	//   39   68:dadd            
	//   40   69:ldc2w           #64  <Double 3.1415926535897931D>
	//   41   72:dadd            
	//   42   73:dstore          7
		d1 = -d1 / 360D;
	//   43   75:dload           5
	//   44   77:dneg            
	//   45   78:ldc2w           #66  <Double 360D>
	//   46   81:ddiv            
	//   47   82:dstore          5
		d1 = (double)((float)Math.round((double)(f - 0.0009F) - d1) + 0.0009F) + d1 + Math.sin(d3) * 0.0053D + Math.sin(2D * d2) * -0.0068999999999999999D;
	//   48   84:fload           11
	//   49   86:ldc1            #20  <Float 0.0009F>
	//   50   88:fsub            
	//   51   89:f2d             
	//   52   90:dload           5
	//   53   92:dsub            
	//   54   93:invokestatic    #71  <Method long Math.round(double)>
	//   55   96:l2f             
	//   56   97:ldc1            #20  <Float 0.0009F>
	//   57   99:fadd            
	//   58  100:f2d             
	//   59  101:dload           5
	//   60  103:dadd            
	//   61  104:dload           9
	//   62  106:invokestatic    #54  <Method double Math.sin(double)>
	//   63  109:ldc2w           #72  <Double 0.0053D>
	//   64  112:dmul            
	//   65  113:dadd            
	//   66  114:ldc2w           #74  <Double 2D>
	//   67  117:dload           7
	//   68  119:dmul            
	//   69  120:invokestatic    #54  <Method double Math.sin(double)>
	//   70  123:ldc2w           #76  <Double -0.0068999999999999999D>
	//   71  126:dmul            
	//   72  127:dadd            
	//   73  128:dstore          5
		d2 = Math.asin(Math.sin(d2) * Math.sin(0.40927970409393311D));
	//   74  130:dload           7
	//   75  132:invokestatic    #54  <Method double Math.sin(double)>
	//   76  135:ldc2w           #78  <Double 0.40927970409393311D>
	//   77  138:invokestatic    #54  <Method double Math.sin(double)>
	//   78  141:dmul            
	//   79  142:invokestatic    #82  <Method double Math.asin(double)>
	//   80  145:dstore          7
		d = 0.01745329238474369D * d;
	//   81  147:ldc2w           #83  <Double 0.01745329238474369D>
	//   82  150:dload_3         
	//   83  151:dmul            
	//   84  152:dstore_3        
		d = (Math.sin(-0.10471975803375244D) - Math.sin(d) * Math.sin(d2)) / (Math.cos(d) * Math.cos(d2));
	//   85  153:ldc2w           #85  <Double -0.10471975803375244D>
	//   86  156:invokestatic    #54  <Method double Math.sin(double)>
	//   87  159:dload_3         
	//   88  160:invokestatic    #54  <Method double Math.sin(double)>
	//   89  163:dload           7
	//   90  165:invokestatic    #54  <Method double Math.sin(double)>
	//   91  168:dmul            
	//   92  169:dsub            
	//   93  170:dload_3         
	//   94  171:invokestatic    #89  <Method double Math.cos(double)>
	//   95  174:dload           7
	//   96  176:invokestatic    #89  <Method double Math.cos(double)>
	//   97  179:dmul            
	//   98  180:ddiv            
	//   99  181:dstore_3        
		if(d >= 1.0D)
	//* 100  182:dload_3         
	//* 101  183:dconst_1        
	//* 102  184:dcmpl           
	//* 103  185:iflt            208
		{
			state = 1;
	//  104  188:aload_0         
	//  105  189:iconst_1        
	//  106  190:putfield        #91  <Field int state>
			sunset = -1L;
	//  107  193:aload_0         
	//  108  194:ldc2w           #92  <Long -1L>
	//  109  197:putfield        #95  <Field long sunset>
			sunrise = -1L;
	//  110  200:aload_0         
	//  111  201:ldc2w           #92  <Long -1L>
	//  112  204:putfield        #97  <Field long sunrise>
			return;
	//  113  207:return          
		}
		if(d <= -1D)
	//* 114  208:dload_3         
	//* 115  209:ldc2w           #98  <Double -1D>
	//* 116  212:dcmpg           
	//* 117  213:ifgt            236
		{
			state = 0;
	//  118  216:aload_0         
	//  119  217:iconst_0        
	//  120  218:putfield        #91  <Field int state>
			sunset = -1L;
	//  121  221:aload_0         
	//  122  222:ldc2w           #92  <Long -1L>
	//  123  225:putfield        #95  <Field long sunset>
			sunrise = -1L;
	//  124  228:aload_0         
	//  125  229:ldc2w           #92  <Long -1L>
	//  126  232:putfield        #97  <Field long sunrise>
			return;
	//  127  235:return          
		}
		d = (float)(Math.acos(d) / 6.2831853071795862D);
	//  128  236:dload_3         
	//  129  237:invokestatic    #102 <Method double Math.acos(double)>
	//  130  240:ldc2w           #103 <Double 6.2831853071795862D>
	//  131  243:ddiv            
	//  132  244:d2f             
	//  133  245:f2d             
	//  134  246:dstore_3        
		sunset = Math.round((d1 + d) * 86400000D) + 0x6d62da00L;
	//  135  247:aload_0         
	//  136  248:dload           5
	//  137  250:dload_3         
	//  138  251:dadd            
	//  139  252:ldc2w           #105 <Double 86400000D>
	//  140  255:dmul            
	//  141  256:invokestatic    #71  <Method long Math.round(double)>
	//  142  259:ldc2w           #27  <Long 0x6d62da00L>
	//  143  262:ladd            
	//  144  263:putfield        #95  <Field long sunset>
		sunrise = Math.round((d1 - d) * 86400000D) + 0x6d62da00L;
	//  145  266:aload_0         
	//  146  267:dload           5
	//  147  269:dload_3         
	//  148  270:dsub            
	//  149  271:ldc2w           #105 <Double 86400000D>
	//  150  274:dmul            
	//  151  275:invokestatic    #71  <Method long Math.round(double)>
	//  152  278:ldc2w           #27  <Long 0x6d62da00L>
	//  153  281:ladd            
	//  154  282:putfield        #97  <Field long sunrise>
		if(sunrise < l && sunset > l)
	//* 155  285:aload_0         
	//* 156  286:getfield        #97  <Field long sunrise>
	//* 157  289:lload_1         
	//* 158  290:lcmp            
	//* 159  291:ifge            309
	//* 160  294:aload_0         
	//* 161  295:getfield        #95  <Field long sunset>
	//* 162  298:lload_1         
	//* 163  299:lcmp            
	//* 164  300:ifle            309
		{
			state = 0;
	//  165  303:aload_0         
	//  166  304:iconst_0        
	//  167  305:putfield        #91  <Field int state>
			return;
	//  168  308:return          
		} else
		{
			state = 1;
	//  169  309:aload_0         
	//  170  310:iconst_1        
	//  171  311:putfield        #91  <Field int state>
			return;
	//  172  314:return          
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
