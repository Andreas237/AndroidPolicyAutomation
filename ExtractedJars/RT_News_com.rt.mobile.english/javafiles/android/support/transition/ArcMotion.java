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
	//*   3    3:iflt            28
	//*   4    6:fload_0         
	//*   5    7:ldc1            #94  <Float 90F>
	//*   6    9:fcmpl           
	//*   7   10:ifle            16
	//*   8   13:goto            28
			return (float)Math.tan(Math.toRadians(f / 2.0F));
	//    9   16:fload_0         
	//   10   17:fconst_2        
	//   11   18:fdiv            
	//   12   19:f2d             
	//   13   20:invokestatic    #26  <Method double Math.toRadians(double)>
	//   14   23:invokestatic    #29  <Method double Math.tan(double)>
	//   15   26:d2f             
	//   16   27:freturn         
		else
			throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
	//   17   28:new             #96  <Class IllegalArgumentException>
	//   18   31:dup             
	//   19   32:ldc1            #98  <String "Arc must be between 0 and 90 degrees">
	//   20   34:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   21   37:athrow          
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
	//*  54   89:ifge            148
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
			f6 = mMinimumVerticalTangent * f7 * mMinimumVerticalTangent;
	//   77  131:aload_0         
	//   78  132:getfield        #45  <Field float mMinimumVerticalTangent>
	//   79  135:fload           8
	//   80  137:fmul            
	//   81  138:aload_0         
	//   82  139:getfield        #45  <Field float mMinimumVerticalTangent>
	//   83  142:fmul            
	//   84  143:fstore          7
		} else
	//*  85  145:goto            198
		{
			f5 = f6 / (f4 * 2.0F);
	//   86  148:fload           7
	//   87  150:fload           5
	//   88  152:fconst_2        
	//   89  153:fmul            
	//   90  154:fdiv            
	//   91  155:fstore          6
			if(flag)
	//*  92  157:iload           13
	//*  93  159:ifeq            174
			{
				f4 = f1;
	//   94  162:fload_2         
	//   95  163:fstore          5
				f5 += f;
	//   96  165:fload           6
	//   97  167:fload_1         
	//   98  168:fadd            
	//   99  169:fstore          6
			} else
	//* 100  171:goto            184
			{
				f5 = f2 - f5;
	//  101  174:fload_3         
	//  102  175:fload           6
	//  103  177:fsub            
	//  104  178:fstore          6
				f4 = f3;
	//  105  180:fload           4
	//  106  182:fstore          5
			}
			f6 = mMinimumHorizontalTangent * f7 * mMinimumHorizontalTangent;
	//  107  184:aload_0         
	//  108  185:getfield        #43  <Field float mMinimumHorizontalTangent>
	//  109  188:fload           8
	//  110  190:fmul            
	//  111  191:aload_0         
	//  112  192:getfield        #43  <Field float mMinimumHorizontalTangent>
	//  113  195:fmul            
	//  114  196:fstore          7
		}
		float f8 = f10 - f5;
	//  115  198:fload           11
	//  116  200:fload           6
	//  117  202:fsub            
	//  118  203:fstore          9
		float f11 = f9 - f4;
	//  119  205:fload           10
	//  120  207:fload           5
	//  121  209:fsub            
	//  122  210:fstore          12
		f11 = f8 * f8 + f11 * f11;
	//  123  212:fload           9
	//  124  214:fload           9
	//  125  216:fmul            
	//  126  217:fload           12
	//  127  219:fload           12
	//  128  221:fmul            
	//  129  222:fadd            
	//  130  223:fstore          12
		f7 = f7 * mMaximumTangent * mMaximumTangent;
	//  131  225:fload           8
	//  132  227:aload_0         
	//  133  228:getfield        #47  <Field float mMaximumTangent>
	//  134  231:fmul            
	//  135  232:aload_0         
	//  136  233:getfield        #47  <Field float mMaximumTangent>
	//  137  236:fmul            
	//  138  237:fstore          8
		if(f11 >= f6)
	//* 139  239:fload           12
	//* 140  241:fload           7
	//* 141  243:fcmpg           
	//* 142  244:ifge            250
	//* 143  247:goto            268
			if(f11 > f7)
	//* 144  250:fload           12
	//* 145  252:fload           8
	//* 146  254:fcmpl           
	//* 147  255:ifle            265
				f6 = f7;
	//  148  258:fload           8
	//  149  260:fstore          7
			else
	//* 150  262:goto            268
				f6 = 0.0F;
	//  151  265:fconst_0        
	//  152  266:fstore          7
		f8 = f5;
	//  153  268:fload           6
	//  154  270:fstore          9
		f7 = f4;
	//  155  272:fload           5
	//  156  274:fstore          8
		if(f6 != 0.0F)
	//* 157  276:fload           7
	//* 158  278:fconst_0        
	//* 159  279:fcmpl           
	//* 160  280:ifeq            321
		{
			f6 = (float)Math.sqrt(f6 / f11);
	//  161  283:fload           7
	//  162  285:fload           12
	//  163  287:fdiv            
	//  164  288:f2d             
	//  165  289:invokestatic    #121 <Method double Math.sqrt(double)>
	//  166  292:d2f             
	//  167  293:fstore          7
			f8 = (f5 - f10) * f6 + f10;
	//  168  295:fload           6
	//  169  297:fload           11
	//  170  299:fsub            
	//  171  300:fload           7
	//  172  302:fmul            
	//  173  303:fload           11
	//  174  305:fadd            
	//  175  306:fstore          9
			f7 = f9 + f6 * (f4 - f9);
	//  176  308:fload           10
	//  177  310:fload           7
	//  178  312:fload           5
	//  179  314:fload           10
	//  180  316:fsub            
	//  181  317:fmul            
	//  182  318:fadd            
	//  183  319:fstore          8
		}
		path.cubicTo((f + f8) / 2.0F, (f1 + f7) / 2.0F, (f8 + f2) / 2.0F, (f7 + f3) / 2.0F, f2, f3);
	//  184  321:aload           14
	//  185  323:fload_1         
	//  186  324:fload           9
	//  187  326:fadd            
	//  188  327:fconst_2        
	//  189  328:fdiv            
	//  190  329:fload_2         
	//  191  330:fload           8
	//  192  332:fadd            
	//  193  333:fconst_2        
	//  194  334:fdiv            
	//  195  335:fload           9
	//  196  337:fload_3         
	//  197  338:fadd            
	//  198  339:fconst_2        
	//  199  340:fdiv            
	//  200  341:fload           8
	//  201  343:fload           4
	//  202  345:fadd            
	//  203  346:fconst_2        
	//  204  347:fdiv            
	//  205  348:fload_3         
	//  206  349:fload           4
	//  207  351:invokevirtual   #125 <Method void Path.cubicTo(float, float, float, float, float, float)>
		return path;
	//  208  354:aload           14
	//  209  356:areturn         
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
