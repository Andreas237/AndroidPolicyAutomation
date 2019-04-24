// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			PathMotion, ac

public class ArcMotion extends PathMotion
{

	public ArcMotion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void PathMotion()>
		b = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #33  <Field float b>
		c = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #35  <Field float c>
		d = 70F;
	//    8   14:aload_0         
	//    9   15:ldc1            #36  <Float 70F>
	//   10   17:putfield        #38  <Field float d>
		e = 0.0F;
	//   11   20:aload_0         
	//   12   21:fconst_0        
	//   13   22:putfield        #40  <Field float e>
		f = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #42  <Field float f>
		g = a;
	//   17   30:aload_0         
	//   18   31:getstatic       #27  <Field float a>
	//   19   34:putfield        #44  <Field float g>
	//   20   37:return          
	}

	public ArcMotion(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #47  <Method void PathMotion(Context, AttributeSet)>
		b = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #33  <Field float b>
		c = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #35  <Field float c>
		d = 70F;
	//   10   16:aload_0         
	//   11   17:ldc1            #36  <Float 70F>
	//   12   19:putfield        #38  <Field float d>
		e = 0.0F;
	//   13   22:aload_0         
	//   14   23:fconst_0        
	//   15   24:putfield        #40  <Field float e>
		f = 0.0F;
	//   16   27:aload_0         
	//   17   28:fconst_0        
	//   18   29:putfield        #42  <Field float f>
		g = a;
	//   19   32:aload_0         
	//   20   33:getstatic       #27  <Field float a>
	//   21   36:putfield        #44  <Field float g>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.j)));
	//   22   39:aload_1         
	//   23   40:aload_2         
	//   24   41:getstatic       #53  <Field int[] ac.j>
	//   25   44:invokevirtual   #59  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   26   47:astore_1        
		attributeset = ((AttributeSet) ((XmlPullParser)attributeset));
	//   27   48:aload_2         
	//   28   49:checkcast       #61  <Class XmlPullParser>
	//   29   52:astore_2        
		b(android.support.v4.content.a.c.a(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "minimumVerticalAngle", 1, 0.0F));
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:aload_2         
	//   33   56:ldc1            #63  <String "minimumVerticalAngle">
	//   34   58:iconst_1        
	//   35   59:fconst_0        
	//   36   60:invokestatic    #68  <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//   37   63:invokevirtual   #71  <Method void b(float)>
		a(android.support.v4.content.a.c.a(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "minimumHorizontalAngle", 0, 0.0F));
	//   38   66:aload_0         
	//   39   67:aload_1         
	//   40   68:aload_2         
	//   41   69:ldc1            #73  <String "minimumHorizontalAngle">
	//   42   71:iconst_0        
	//   43   72:fconst_0        
	//   44   73:invokestatic    #68  <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//   45   76:invokevirtual   #75  <Method void a(float)>
		c(android.support.v4.content.a.c.a(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "maximumAngle", 2, 70F));
	//   46   79:aload_0         
	//   47   80:aload_1         
	//   48   81:aload_2         
	//   49   82:ldc1            #77  <String "maximumAngle">
	//   50   84:iconst_2        
	//   51   85:ldc1            #36  <Float 70F>
	//   52   87:invokestatic    #68  <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//   53   90:invokevirtual   #79  <Method void c(float)>
		((TypedArray) (context)).recycle();
	//   54   93:aload_1         
	//   55   94:invokevirtual   #84  <Method void TypedArray.recycle()>
	//   56   97:return          
	}

	private static float d(float f1)
	{
		if(f1 >= 0.0F && f1 <= 90F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            28
	//*   4    6:fload_0         
	//*   5    7:ldc1            #86  <Float 90F>
	//*   6    9:fcmpl           
	//*   7   10:ifle            16
	//*   8   13:goto            28
			return (float)Math.tan(Math.toRadians(f1 / 2.0F));
	//    9   16:fload_0         
	//   10   17:fconst_2        
	//   11   18:fdiv            
	//   12   19:f2d             
	//   13   20:invokestatic    #22  <Method double Math.toRadians(double)>
	//   14   23:invokestatic    #25  <Method double Math.tan(double)>
	//   15   26:d2f             
	//   16   27:freturn         
		else
			throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
	//   17   28:new             #88  <Class IllegalArgumentException>
	//   18   31:dup             
	//   19   32:ldc1            #90  <String "Arc must be between 0 and 90 degrees">
	//   20   34:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   21   37:athrow          
	}

	public Path a(float f1, float f2, float f3, float f4)
	{
		Path path = new Path();
	//    0    0:new             #96  <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void Path()>
	//    3    7:astore          14
		path.moveTo(f1, f2);
	//    4    9:aload           14
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokevirtual   #101 <Method void Path.moveTo(float, float)>
		float f5 = f3 - f1;
	//    8   16:fload_3         
	//    9   17:fload_1         
	//   10   18:fsub            
	//   11   19:fstore          5
		float f6 = f4 - f2;
	//   12   21:fload           4
	//   13   23:fload_2         
	//   14   24:fsub            
	//   15   25:fstore          6
		float f7 = f5 * f5 + f6 * f6;
	//   16   27:fload           5
	//   17   29:fload           5
	//   18   31:fmul            
	//   19   32:fload           6
	//   20   34:fload           6
	//   21   36:fmul            
	//   22   37:fadd            
	//   23   38:fstore          7
		float f11 = (f1 + f3) / 2.0F;
	//   24   40:fload_1         
	//   25   41:fload_3         
	//   26   42:fadd            
	//   27   43:fconst_2        
	//   28   44:fdiv            
	//   29   45:fstore          11
		float f10 = (f2 + f4) / 2.0F;
	//   30   47:fload_2         
	//   31   48:fload           4
	//   32   50:fadd            
	//   33   51:fconst_2        
	//   34   52:fdiv            
	//   35   53:fstore          10
		float f9 = 0.25F * f7;
	//   36   55:ldc1            #102 <Float 0.25F>
	//   37   57:fload           7
	//   38   59:fmul            
	//   39   60:fstore          9
		boolean flag;
		if(f2 > f4)
	//*  40   62:fload_2         
	//*  41   63:fload           4
	//*  42   65:fcmpl           
	//*  43   66:ifle            75
			flag = true;
	//   44   69:iconst_1        
	//   45   70:istore          13
		else
	//*  46   72:goto            78
			flag = false;
	//   47   75:iconst_0        
	//   48   76:istore          13
		float f8;
		if(Math.abs(f5) < Math.abs(f6))
	//*  49   78:fload           5
	//*  50   80:invokestatic    #105 <Method float Math.abs(float)>
	//*  51   83:fload           6
	//*  52   85:invokestatic    #105 <Method float Math.abs(float)>
	//*  53   88:fcmpg           
	//*  54   89:ifge            156
		{
			f5 = Math.abs(f7 / (f6 * 2.0F));
	//   55   92:fload           7
	//   56   94:fload           6
	//   57   96:fconst_2        
	//   58   97:fmul            
	//   59   98:fdiv            
	//   60   99:invokestatic    #105 <Method float Math.abs(float)>
	//   61  102:fstore          5
			if(flag)
	//*  62  104:iload           13
	//*  63  106:ifeq            122
			{
				f5 += f4;
	//   64  109:fload           5
	//   65  111:fload           4
	//   66  113:fadd            
	//   67  114:fstore          5
				f6 = f3;
	//   68  116:fload_3         
	//   69  117:fstore          6
			} else
	//*  70  119:goto            131
			{
				f5 += f2;
	//   71  122:fload           5
	//   72  124:fload_2         
	//   73  125:fadd            
	//   74  126:fstore          5
				f6 = f1;
	//   75  128:fload_1         
	//   76  129:fstore          6
			}
			f7 = f * f9;
	//   77  131:aload_0         
	//   78  132:getfield        #42  <Field float f>
	//   79  135:fload           9
	//   80  137:fmul            
	//   81  138:fstore          7
			f8 = f;
	//   82  140:aload_0         
	//   83  141:getfield        #42  <Field float f>
	//   84  144:fstore          8
		} else
	//*  85  146:fload           7
	//*  86  148:fload           8
	//*  87  150:fmul            
	//*  88  151:fstore          7
	//*  89  153:goto            210
		{
			f6 = f7 / (f5 * 2.0F);
	//   90  156:fload           7
	//   91  158:fload           5
	//   92  160:fconst_2        
	//   93  161:fmul            
	//   94  162:fdiv            
	//   95  163:fstore          6
			if(flag)
	//*  96  165:iload           13
	//*  97  167:ifeq            182
			{
				f5 = f2;
	//   98  170:fload_2         
	//   99  171:fstore          5
				f6 += f1;
	//  100  173:fload           6
	//  101  175:fload_1         
	//  102  176:fadd            
	//  103  177:fstore          6
			} else
	//* 104  179:goto            192
			{
				f6 = f3 - f6;
	//  105  182:fload_3         
	//  106  183:fload           6
	//  107  185:fsub            
	//  108  186:fstore          6
				f5 = f4;
	//  109  188:fload           4
	//  110  190:fstore          5
			}
			f7 = e * f9;
	//  111  192:aload_0         
	//  112  193:getfield        #40  <Field float e>
	//  113  196:fload           9
	//  114  198:fmul            
	//  115  199:fstore          7
			f8 = e;
	//  116  201:aload_0         
	//  117  202:getfield        #40  <Field float e>
	//  118  205:fstore          8
		}
		f7 *= f8;
	//* 119  207:goto            146
		f8 = f11 - f6;
	//  120  210:fload           11
	//  121  212:fload           6
	//  122  214:fsub            
	//  123  215:fstore          8
		float f12 = f10 - f5;
	//  124  217:fload           10
	//  125  219:fload           5
	//  126  221:fsub            
	//  127  222:fstore          12
		f12 = f8 * f8 + f12 * f12;
	//  128  224:fload           8
	//  129  226:fload           8
	//  130  228:fmul            
	//  131  229:fload           12
	//  132  231:fload           12
	//  133  233:fmul            
	//  134  234:fadd            
	//  135  235:fstore          12
		f8 = f9 * g * g;
	//  136  237:fload           9
	//  137  239:aload_0         
	//  138  240:getfield        #44  <Field float g>
	//  139  243:fmul            
	//  140  244:aload_0         
	//  141  245:getfield        #44  <Field float g>
	//  142  248:fmul            
	//  143  249:fstore          8
		if(f12 >= f7)
	//* 144  251:fload           12
	//* 145  253:fload           7
	//* 146  255:fcmpg           
	//* 147  256:ifge            262
	//* 148  259:goto            280
			if(f12 > f8)
	//* 149  262:fload           12
	//* 150  264:fload           8
	//* 151  266:fcmpl           
	//* 152  267:ifle            277
				f7 = f8;
	//  153  270:fload           8
	//  154  272:fstore          7
			else
	//* 155  274:goto            280
				f7 = 0.0F;
	//  156  277:fconst_0        
	//  157  278:fstore          7
		f9 = f6;
	//  158  280:fload           6
	//  159  282:fstore          9
		f8 = f5;
	//  160  284:fload           5
	//  161  286:fstore          8
		if(f7 != 0.0F)
	//* 162  288:fload           7
	//* 163  290:fconst_0        
	//* 164  291:fcmpl           
	//* 165  292:ifeq            333
		{
			f7 = (float)Math.sqrt(f7 / f12);
	//  166  295:fload           7
	//  167  297:fload           12
	//  168  299:fdiv            
	//  169  300:f2d             
	//  170  301:invokestatic    #108 <Method double Math.sqrt(double)>
	//  171  304:d2f             
	//  172  305:fstore          7
			f9 = (f6 - f11) * f7 + f11;
	//  173  307:fload           6
	//  174  309:fload           11
	//  175  311:fsub            
	//  176  312:fload           7
	//  177  314:fmul            
	//  178  315:fload           11
	//  179  317:fadd            
	//  180  318:fstore          9
			f8 = f10 + f7 * (f5 - f10);
	//  181  320:fload           10
	//  182  322:fload           7
	//  183  324:fload           5
	//  184  326:fload           10
	//  185  328:fsub            
	//  186  329:fmul            
	//  187  330:fadd            
	//  188  331:fstore          8
		}
		path.cubicTo((f1 + f9) / 2.0F, (f2 + f8) / 2.0F, (f9 + f3) / 2.0F, (f8 + f4) / 2.0F, f3, f4);
	//  189  333:aload           14
	//  190  335:fload_1         
	//  191  336:fload           9
	//  192  338:fadd            
	//  193  339:fconst_2        
	//  194  340:fdiv            
	//  195  341:fload_2         
	//  196  342:fload           8
	//  197  344:fadd            
	//  198  345:fconst_2        
	//  199  346:fdiv            
	//  200  347:fload           9
	//  201  349:fload_3         
	//  202  350:fadd            
	//  203  351:fconst_2        
	//  204  352:fdiv            
	//  205  353:fload           8
	//  206  355:fload           4
	//  207  357:fadd            
	//  208  358:fconst_2        
	//  209  359:fdiv            
	//  210  360:fload_3         
	//  211  361:fload           4
	//  212  363:invokevirtual   #112 <Method void Path.cubicTo(float, float, float, float, float, float)>
		return path;
	//  213  366:aload           14
	//  214  368:areturn         
	}

	public void a(float f1)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #33  <Field float b>
		e = d(f1);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokestatic    #114 <Method float d(float)>
	//    6   10:putfield        #40  <Field float e>
	//    7   13:return          
	}

	public void b(float f1)
	{
		c = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #35  <Field float c>
		f = d(f1);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokestatic    #114 <Method float d(float)>
	//    6   10:putfield        #42  <Field float f>
	//    7   13:return          
	}

	public void c(float f1)
	{
		d = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #38  <Field float d>
		g = d(f1);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokestatic    #114 <Method float d(float)>
	//    6   10:putfield        #44  <Field float g>
	//    7   13:return          
	}

	private static final float a = (float)Math.tan(Math.toRadians(35D));
	private float b;
	private float c;
	private float d;
	private float e;
	private float f;
	private float g;

	static 
	{
	//    0    0:ldc2w           #15  <Double 35D>
	//    1    3:invokestatic    #22  <Method double Math.toRadians(double)>
	//    2    6:invokestatic    #25  <Method double Math.tan(double)>
	//    3    9:d2f             
	//    4   10:putstatic       #27  <Field float a>
	//*   5   13:return          
	}
}
