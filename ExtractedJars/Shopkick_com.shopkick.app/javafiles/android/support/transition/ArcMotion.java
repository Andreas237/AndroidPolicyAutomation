// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			PathMotion, Styleable

public class ArcMotion extends PathMotion
{

	public ArcMotion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void PathMotion()>
		mMinimumHorizontalAngle = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #37  <Field float mMinimumHorizontalAngle>
		mMinimumVerticalAngle = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #39  <Field float mMinimumVerticalAngle>
		mMaximumAngle = 70F;
	//    8   14:aload_0         
	//    9   15:ldc1            #7   <Float 70F>
	//   10   17:putfield        #41  <Field float mMaximumAngle>
		mMinimumHorizontalTangent = 0.0F;
	//   11   20:aload_0         
	//   12   21:fconst_0        
	//   13   22:putfield        #43  <Field float mMinimumHorizontalTangent>
		mMinimumVerticalTangent = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #45  <Field float mMinimumVerticalTangent>
		mMaximumTangent = DEFAULT_MAX_TANGENT;
	//   17   30:aload_0         
	//   18   31:getstatic       #31  <Field float DEFAULT_MAX_TANGENT>
	//   19   34:putfield        #47  <Field float mMaximumTangent>
	//   20   37:return          
	}

	public ArcMotion(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void PathMotion(Context, AttributeSet)>
		mMinimumHorizontalAngle = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #37  <Field float mMinimumHorizontalAngle>
		mMinimumVerticalAngle = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #39  <Field float mMinimumVerticalAngle>
		mMaximumAngle = 70F;
	//   10   16:aload_0         
	//   11   17:ldc1            #7   <Float 70F>
	//   12   19:putfield        #41  <Field float mMaximumAngle>
		mMinimumHorizontalTangent = 0.0F;
	//   13   22:aload_0         
	//   14   23:fconst_0        
	//   15   24:putfield        #43  <Field float mMinimumHorizontalTangent>
		mMinimumVerticalTangent = 0.0F;
	//   16   27:aload_0         
	//   17   28:fconst_0        
	//   18   29:putfield        #45  <Field float mMinimumVerticalTangent>
		mMaximumTangent = DEFAULT_MAX_TANGENT;
	//   19   32:aload_0         
	//   20   33:getstatic       #31  <Field float DEFAULT_MAX_TANGENT>
	//   21   36:putfield        #47  <Field float mMaximumTangent>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.ARC_MOTION)));
	//   22   39:aload_1         
	//   23   40:aload_2         
	//   24   41:getstatic       #56  <Field int[] Styleable.ARC_MOTION>
	//   25   44:invokevirtual   #62  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   26   47:astore_1        
		attributeset = ((AttributeSet) ((XmlPullParser)attributeset));
	//   27   48:aload_2         
	//   28   49:checkcast       #64  <Class XmlPullParser>
	//   29   52:astore_2        
		setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "minimumVerticalAngle", 1, 0.0F));
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:aload_2         
	//   33   56:ldc1            #66  <String "minimumVerticalAngle">
	//   34   58:iconst_1        
	//   35   59:fconst_0        
	//   36   60:invokestatic    #72  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   37   63:invokevirtual   #76  <Method void setMinimumVerticalAngle(float)>
		setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "minimumHorizontalAngle", 0, 0.0F));
	//   38   66:aload_0         
	//   39   67:aload_1         
	//   40   68:aload_2         
	//   41   69:ldc1            #78  <String "minimumHorizontalAngle">
	//   42   71:iconst_0        
	//   43   72:fconst_0        
	//   44   73:invokestatic    #72  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   45   76:invokevirtual   #81  <Method void setMinimumHorizontalAngle(float)>
		setMaximumAngle(TypedArrayUtils.getNamedFloat(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "maximumAngle", 2, 70F));
	//   46   79:aload_0         
	//   47   80:aload_1         
	//   48   81:aload_2         
	//   49   82:ldc1            #83  <String "maximumAngle">
	//   50   84:iconst_2        
	//   51   85:ldc1            #7   <Float 70F>
	//   52   87:invokestatic    #72  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   53   90:invokevirtual   #86  <Method void setMaximumAngle(float)>
		((TypedArray) (context)).recycle();
	//   54   93:aload_1         
	//   55   94:invokevirtual   #91  <Method void TypedArray.recycle()>
	//   56   97:return          
	}

	private static float toTangent(float f)
	{
		if(f >= 0.0F && f <= 90F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            25
	//*   4    6:fload_0         
	//*   5    7:ldc1            #94  <Float 90F>
	//*   6    9:fcmpl           
	//*   7   10:ifgt            25
			return (float)Math.tan(Math.toRadians(f / 2.0F));
	//    8   13:fload_0         
	//    9   14:fconst_2        
	//   10   15:fdiv            
	//   11   16:f2d             
	//   12   17:invokestatic    #26  <Method double Math.toRadians(double)>
	//   13   20:invokestatic    #29  <Method double Math.tan(double)>
	//   14   23:d2f             
	//   15   24:freturn         
		else
			throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
	//   16   25:new             #96  <Class IllegalArgumentException>
	//   17   28:dup             
	//   18   29:ldc1            #98  <String "Arc must be between 0 and 90 degrees">
	//   19   31:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   20   34:athrow          
	}

	public float getMaximumAngle()
	{
		return mMaximumAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float mMaximumAngle>
	//    2    4:freturn         
	}

	public float getMinimumHorizontalAngle()
	{
		return mMinimumHorizontalAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float mMinimumHorizontalAngle>
	//    2    4:freturn         
	}

	public float getMinimumVerticalAngle()
	{
		return mMinimumVerticalAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float mMinimumVerticalAngle>
	//    2    4:freturn         
	}

	public Path getPath(float f, float f1, float f2, float f3)
	{
		Path path = new Path();
	//    0    0:new             #109 <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void Path()>
	//    3    7:astore          14
		path.moveTo(f, f1);
	//    4    9:aload           14
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokevirtual   #114 <Method void Path.moveTo(float, float)>
		float f4 = f2 - f;
	//    8   16:fload_3         
	//    9   17:fload_1         
	//   10   18:fsub            
	//   11   19:fstore          5
		float f5 = f3 - f1;
	//   12   21:fload           4
	//   13   23:fload_2         
	//   14   24:fsub            
	//   15   25:fstore          6
		float f6 = f4 * f4 + f5 * f5;
	//   16   27:fload           5
	//   17   29:fload           5
	//   18   31:fmul            
	//   19   32:fload           6
	//   20   34:fload           6
	//   21   36:fmul            
	//   22   37:fadd            
	//   23   38:fstore          7
		float f10 = (f + f2) / 2.0F;
	//   24   40:fload_1         
	//   25   41:fload_3         
	//   26   42:fadd            
	//   27   43:fconst_2        
	//   28   44:fdiv            
	//   29   45:fstore          11
		float f9 = (f1 + f3) / 2.0F;
	//   30   47:fload_2         
	//   31   48:fload           4
	//   32   50:fadd            
	//   33   51:fconst_2        
	//   34   52:fdiv            
	//   35   53:fstore          10
		float f7 = 0.25F * f6;
	//   36   55:ldc1            #115 <Float 0.25F>
	//   37   57:fload           7
	//   38   59:fmul            
	//   39   60:fstore          8
		boolean flag;
		if(f1 > f3)
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
		if(Math.abs(f4) < Math.abs(f5))
	//*  49   78:fload           5
	//*  50   80:invokestatic    #118 <Method float Math.abs(float)>
	//*  51   83:fload           6
	//*  52   85:invokestatic    #118 <Method float Math.abs(float)>
	//*  53   88:fcmpg           
	//*  54   89:ifge            150
		{
			f4 = Math.abs(f6 / (f5 * 2.0F));
	//   55   92:fload           7
	//   56   94:fload           6
	//   57   96:fconst_2        
	//   58   97:fmul            
	//   59   98:fdiv            
	//   60   99:invokestatic    #118 <Method float Math.abs(float)>
	//   61  102:fstore          5
			if(flag)
	//*  62  104:iload           13
	//*  63  106:ifeq            122
			{
				f4 += f3;
	//   64  109:fload           5
	//   65  111:fload           4
	//   66  113:fadd            
	//   67  114:fstore          5
				f5 = f2;
	//   68  116:fload_3         
	//   69  117:fstore          6
			} else
	//*  70  119:goto            131
			{
				f4 += f1;
	//   71  122:fload           5
	//   72  124:fload_2         
	//   73  125:fadd            
	//   74  126:fstore          5
				f5 = f;
	//   75  128:fload_1         
	//   76  129:fstore          6
			}
			f6 = mMinimumVerticalTangent;
	//   77  131:aload_0         
	//   78  132:getfield        #45  <Field float mMinimumVerticalTangent>
	//   79  135:fstore          7
			f6 = f7 * f6 * f6;
	//   80  137:fload           8
	//   81  139:fload           7
	//   82  141:fmul            
	//   83  142:fload           7
	//   84  144:fmul            
	//   85  145:fstore          7
		} else
	//*  86  147:goto            202
		{
			f5 = f6 / (f4 * 2.0F);
	//   87  150:fload           7
	//   88  152:fload           5
	//   89  154:fconst_2        
	//   90  155:fmul            
	//   91  156:fdiv            
	//   92  157:fstore          6
			if(flag)
	//*  93  159:iload           13
	//*  94  161:ifeq            176
			{
				f4 = f1;
	//   95  164:fload_2         
	//   96  165:fstore          5
				f5 += f;
	//   97  167:fload           6
	//   98  169:fload_1         
	//   99  170:fadd            
	//  100  171:fstore          6
			} else
	//* 101  173:goto            186
			{
				f5 = f2 - f5;
	//  102  176:fload_3         
	//  103  177:fload           6
	//  104  179:fsub            
	//  105  180:fstore          6
				f4 = f3;
	//  106  182:fload           4
	//  107  184:fstore          5
			}
			f6 = mMinimumHorizontalTangent;
	//  108  186:aload_0         
	//  109  187:getfield        #43  <Field float mMinimumHorizontalTangent>
	//  110  190:fstore          7
			f6 = f7 * f6 * f6;
	//  111  192:fload           8
	//  112  194:fload           7
	//  113  196:fmul            
	//  114  197:fload           7
	//  115  199:fmul            
	//  116  200:fstore          7
		}
		float f8 = f10 - f5;
	//  117  202:fload           11
	//  118  204:fload           6
	//  119  206:fsub            
	//  120  207:fstore          9
		float f11 = f9 - f4;
	//  121  209:fload           10
	//  122  211:fload           5
	//  123  213:fsub            
	//  124  214:fstore          12
		f11 = f8 * f8 + f11 * f11;
	//  125  216:fload           9
	//  126  218:fload           9
	//  127  220:fmul            
	//  128  221:fload           12
	//  129  223:fload           12
	//  130  225:fmul            
	//  131  226:fadd            
	//  132  227:fstore          12
		f8 = mMaximumTangent;
	//  133  229:aload_0         
	//  134  230:getfield        #47  <Field float mMaximumTangent>
	//  135  233:fstore          9
		f7 = f7 * f8 * f8;
	//  136  235:fload           8
	//  137  237:fload           9
	//  138  239:fmul            
	//  139  240:fload           9
	//  140  242:fmul            
	//  141  243:fstore          8
		if(f11 >= f6)
	//* 142  245:fload           12
	//* 143  247:fload           7
	//* 144  249:fcmpg           
	//* 145  250:ifge            256
	//* 146  253:goto            274
			if(f11 > f7)
	//* 147  256:fload           12
	//* 148  258:fload           8
	//* 149  260:fcmpl           
	//* 150  261:ifle            271
				f6 = f7;
	//  151  264:fload           8
	//  152  266:fstore          7
			else
	//* 153  268:goto            274
				f6 = 0.0F;
	//  154  271:fconst_0        
	//  155  272:fstore          7
		f8 = f5;
	//  156  274:fload           6
	//  157  276:fstore          9
		f7 = f4;
	//  158  278:fload           5
	//  159  280:fstore          8
		if(f6 != 0.0F)
	//* 160  282:fload           7
	//* 161  284:fconst_0        
	//* 162  285:fcmpl           
	//* 163  286:ifeq            327
		{
			f6 = (float)Math.sqrt(f6 / f11);
	//  164  289:fload           7
	//  165  291:fload           12
	//  166  293:fdiv            
	//  167  294:f2d             
	//  168  295:invokestatic    #121 <Method double Math.sqrt(double)>
	//  169  298:d2f             
	//  170  299:fstore          7
			f8 = (f5 - f10) * f6 + f10;
	//  171  301:fload           6
	//  172  303:fload           11
	//  173  305:fsub            
	//  174  306:fload           7
	//  175  308:fmul            
	//  176  309:fload           11
	//  177  311:fadd            
	//  178  312:fstore          9
			f7 = f9 + f6 * (f4 - f9);
	//  179  314:fload           10
	//  180  316:fload           7
	//  181  318:fload           5
	//  182  320:fload           10
	//  183  322:fsub            
	//  184  323:fmul            
	//  185  324:fadd            
	//  186  325:fstore          8
		}
		path.cubicTo((f + f8) / 2.0F, (f1 + f7) / 2.0F, (f8 + f2) / 2.0F, (f7 + f3) / 2.0F, f2, f3);
	//  187  327:aload           14
	//  188  329:fload_1         
	//  189  330:fload           9
	//  190  332:fadd            
	//  191  333:fconst_2        
	//  192  334:fdiv            
	//  193  335:fload_2         
	//  194  336:fload           8
	//  195  338:fadd            
	//  196  339:fconst_2        
	//  197  340:fdiv            
	//  198  341:fload           9
	//  199  343:fload_3         
	//  200  344:fadd            
	//  201  345:fconst_2        
	//  202  346:fdiv            
	//  203  347:fload           8
	//  204  349:fload           4
	//  205  351:fadd            
	//  206  352:fconst_2        
	//  207  353:fdiv            
	//  208  354:fload_3         
	//  209  355:fload           4
	//  210  357:invokevirtual   #125 <Method void Path.cubicTo(float, float, float, float, float, float)>
		return path;
	//  211  360:aload           14
	//  212  362:areturn         
	}

	public void setMaximumAngle(float f)
	{
		mMaximumAngle = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #41  <Field float mMaximumAngle>
		mMaximumTangent = toTangent(f);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokestatic    #127 <Method float toTangent(float)>
	//    6   10:putfield        #47  <Field float mMaximumTangent>
	//    7   13:return          
	}

	public void setMinimumHorizontalAngle(float f)
	{
		mMinimumHorizontalAngle = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #37  <Field float mMinimumHorizontalAngle>
		mMinimumHorizontalTangent = toTangent(f);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokestatic    #127 <Method float toTangent(float)>
	//    6   10:putfield        #43  <Field float mMinimumHorizontalTangent>
	//    7   13:return          
	}

	public void setMinimumVerticalAngle(float f)
	{
		mMinimumVerticalAngle = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #39  <Field float mMinimumVerticalAngle>
		mMinimumVerticalTangent = toTangent(f);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokestatic    #127 <Method float toTangent(float)>
	//    6   10:putfield        #45  <Field float mMinimumVerticalTangent>
	//    7   13:return          
	}

	private static final float DEFAULT_MAX_ANGLE_DEGREES = 70F;
	private static final float DEFAULT_MAX_TANGENT = (float)Math.tan(Math.toRadians(35D));
	private static final float DEFAULT_MIN_ANGLE_DEGREES = 0F;
	private float mMaximumAngle;
	private float mMaximumTangent;
	private float mMinimumHorizontalAngle;
	private float mMinimumHorizontalTangent;
	private float mMinimumVerticalAngle;
	private float mMinimumVerticalTangent;

	static 
	{
	//    0    0:ldc2w           #19  <Double 35D>
	//    1    3:invokestatic    #26  <Method double Math.toRadians(double)>
	//    2    6:invokestatic    #29  <Method double Math.tan(double)>
	//    3    9:d2f             
	//    4   10:putstatic       #31  <Field float DEFAULT_MAX_TANGENT>
	//*   5   13:return          
	}
}
