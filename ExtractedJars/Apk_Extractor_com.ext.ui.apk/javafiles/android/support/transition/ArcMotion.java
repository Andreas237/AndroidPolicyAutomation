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
		if(f < 0.0F || f > 90F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            13
	//*   4    6:fload_0         
	//*   5    7:ldc1            #94  <Float 90F>
	//*   6    9:fcmpl           
	//*   7   10:ifle            23
			throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
	//    8   13:new             #96  <Class IllegalArgumentException>
	//    9   16:dup             
	//   10   17:ldc1            #98  <String "Arc must be between 0 and 90 degrees">
	//   11   19:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   12   22:athrow          
		else
			return (float)Math.tan(Math.toRadians(f / 2.0F));
	//   13   23:fload_0         
	//   14   24:fconst_2        
	//   15   25:fdiv            
	//   16   26:f2d             
	//   17   27:invokestatic    #26  <Method double Math.toRadians(double)>
	//   18   30:invokestatic    #29  <Method double Math.tan(double)>
	//   19   33:d2f             
	//   20   34:freturn         
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
		float f6 = f5 * f5 + f4 * f4;
	//   16   27:fload           6
	//   17   29:fload           6
	//   18   31:fmul            
	//   19   32:fload           5
	//   20   34:fload           5
	//   21   36:fmul            
	//   22   37:fadd            
	//   23   38:fstore          7
		float f9 = (f + f2) / 2.0F;
	//   24   40:fload_1         
	//   25   41:fload_3         
	//   26   42:fadd            
	//   27   43:fconst_2        
	//   28   44:fdiv            
	//   29   45:fstore          10
		float f8 = (f1 + f3) / 2.0F;
	//   30   47:fload_2         
	//   31   48:fload           4
	//   32   50:fadd            
	//   33   51:fconst_2        
	//   34   52:fdiv            
	//   35   53:fstore          9
		float f7 = f6 * 0.25F;
	//   36   55:fload           7
	//   37   57:ldc1            #115 <Float 0.25F>
	//   38   59:fmul            
	//   39   60:fstore          8
		float f10;
		boolean flag;
		if(f1 > f3)
	//*  40   62:fload_2         
	//*  41   63:fload           4
	//*  42   65:fcmpl           
	//*  43   66:ifle            265
			flag = true;
	//   44   69:iconst_1        
	//   45   70:istore          13
		else
	//*  46   72:fload           5
	//*  47   74:invokestatic    #118 <Method float Math.abs(float)>
	//*  48   77:fload           6
	//*  49   79:invokestatic    #118 <Method float Math.abs(float)>
	//*  50   82:fcmpg           
	//*  51   83:ifge            283
	//*  52   86:fload           7
	//*  53   88:fconst_2        
	//*  54   89:fload           6
	//*  55   91:fmul            
	//*  56   92:fdiv            
	//*  57   93:invokestatic    #118 <Method float Math.abs(float)>
	//*  58   96:fstore          5
	//*  59   98:iload           13
	//*  60  100:ifeq            271
	//*  61  103:fload           4
	//*  62  105:fload           5
	//*  63  107:fadd            
	//*  64  108:fstore          5
	//*  65  110:fload_3         
	//*  66  111:fstore          6
	//*  67  113:aload_0         
	//*  68  114:getfield        #45  <Field float mMinimumVerticalTangent>
	//*  69  117:fstore          7
	//*  70  119:aload_0         
	//*  71  120:getfield        #45  <Field float mMinimumVerticalTangent>
	//*  72  123:fstore          11
	//*  73  125:fload           7
	//*  74  127:fload           8
	//*  75  129:fmul            
	//*  76  130:fload           11
	//*  77  132:fmul            
	//*  78  133:fstore          7
	//*  79  135:fload           10
	//*  80  137:fload           6
	//*  81  139:fsub            
	//*  82  140:fstore          11
	//*  83  142:fload           9
	//*  84  144:fload           5
	//*  85  146:fsub            
	//*  86  147:fstore          12
	//*  87  149:fload           12
	//*  88  151:fload           12
	//*  89  153:fmul            
	//*  90  154:fload           11
	//*  91  156:fload           11
	//*  92  158:fmul            
	//*  93  159:fadd            
	//*  94  160:fstore          11
	//*  95  162:aload_0         
	//*  96  163:getfield        #47  <Field float mMaximumTangent>
	//*  97  166:fload           8
	//*  98  168:fmul            
	//*  99  169:aload_0         
	//* 100  170:getfield        #47  <Field float mMaximumTangent>
	//* 101  173:fmul            
	//* 102  174:fstore          8
	//* 103  176:fload           11
	//* 104  178:fload           7
	//* 105  180:fcmpg           
	//* 106  181:ifge            344
	//* 107  184:fload           7
	//* 108  186:fconst_0        
	//* 109  187:fcmpl           
	//* 110  188:ifeq            359
	//* 111  191:fload           7
	//* 112  193:fload           11
	//* 113  195:fdiv            
	//* 114  196:f2d             
	//* 115  197:invokestatic    #121 <Method double Math.sqrt(double)>
	//* 116  200:d2f             
	//* 117  201:fstore          7
	//* 118  203:fload           6
	//* 119  205:fload           10
	//* 120  207:fsub            
	//* 121  208:fload           7
	//* 122  210:fmul            
	//* 123  211:fload           10
	//* 124  213:fadd            
	//* 125  214:fstore          6
	//* 126  216:fload           9
	//* 127  218:fload           7
	//* 128  220:fload           5
	//* 129  222:fload           9
	//* 130  224:fsub            
	//* 131  225:fmul            
	//* 132  226:fadd            
	//* 133  227:fstore          5
	//* 134  229:aload           14
	//* 135  231:fload_1         
	//* 136  232:fload           6
	//* 137  234:fadd            
	//* 138  235:fconst_2        
	//* 139  236:fdiv            
	//* 140  237:fload_2         
	//* 141  238:fload           5
	//* 142  240:fadd            
	//* 143  241:fconst_2        
	//* 144  242:fdiv            
	//* 145  243:fload           6
	//* 146  245:fload_3         
	//* 147  246:fadd            
	//* 148  247:fconst_2        
	//* 149  248:fdiv            
	//* 150  249:fload           5
	//* 151  251:fload           4
	//* 152  253:fadd            
	//* 153  254:fconst_2        
	//* 154  255:fdiv            
	//* 155  256:fload_3         
	//* 156  257:fload           4
	//* 157  259:invokevirtual   #125 <Method void Path.cubicTo(float, float, float, float, float, float)>
	//* 158  262:aload           14
	//* 159  264:areturn         
			flag = false;
	//  160  265:iconst_0        
	//  161  266:istore          13
		if(Math.abs(f4) < Math.abs(f5))
		{
			f4 = Math.abs(f6 / (2.0F * f5));
			float f11;
			if(flag)
			{
				f4 = f3 + f4;
				f5 = f2;
			} else
	//* 162  268:goto            72
			{
				f4 = f1 + f4;
	//  163  271:fload_2         
	//  164  272:fload           5
	//  165  274:fadd            
	//  166  275:fstore          5
				f5 = f;
	//  167  277:fload_1         
	//  168  278:fstore          6
			}
			f6 = mMinimumVerticalTangent;
			f10 = mMinimumVerticalTangent;
			f6 = f6 * f7 * f10;
		} else
	//* 169  280:goto            113
		{
			f4 = f6 / (f4 * 2.0F);
	//  170  283:fload           7
	//  171  285:fload           5
	//  172  287:fconst_2        
	//  173  288:fmul            
	//  174  289:fdiv            
	//  175  290:fstore          5
			if(flag)
	//* 176  292:iload           13
	//* 177  294:ifeq            331
			{
				f5 = f + f4;
	//  178  297:fload_1         
	//  179  298:fload           5
	//  180  300:fadd            
	//  181  301:fstore          6
				f4 = f1;
	//  182  303:fload_2         
	//  183  304:fstore          5
			} else
	//* 184  306:aload_0         
	//* 185  307:getfield        #43  <Field float mMinimumHorizontalTangent>
	//* 186  310:fstore          7
	//* 187  312:aload_0         
	//* 188  313:getfield        #43  <Field float mMinimumHorizontalTangent>
	//* 189  316:fstore          11
	//* 190  318:fload           7
	//* 191  320:fload           8
	//* 192  322:fmul            
	//* 193  323:fload           11
	//* 194  325:fmul            
	//* 195  326:fstore          7
	//* 196  328:goto            135
			{
				f5 = f2 - f4;
	//  197  331:fload_3         
	//  198  332:fload           5
	//  199  334:fsub            
	//  200  335:fstore          6
				f4 = f3;
	//  201  337:fload           4
	//  202  339:fstore          5
			}
			f6 = mMinimumHorizontalTangent;
			f10 = mMinimumHorizontalTangent;
			f6 = f6 * f7 * f10;
		}
		f10 = f9 - f5;
		f11 = f8 - f4;
		f10 = f11 * f11 + f10 * f10;
		f7 = mMaximumTangent * f7 * mMaximumTangent;
		if(f10 >= f6)
	//* 203  341:goto            306
			if(f10 > f7)
	//* 204  344:fload           11
	//* 205  346:fload           8
	//* 206  348:fcmpl           
	//* 207  349:ifle            362
				f6 = f7;
	//  208  352:fload           8
	//  209  354:fstore          7
			else
	//* 210  356:goto            184
	//* 211  359:goto            229
				f6 = 0.0F;
	//  212  362:fconst_0        
	//  213  363:fstore          7
		if(f6 != 0.0F)
		{
			f6 = (float)Math.sqrt(f6 / f10);
			f5 = (f5 - f9) * f6 + f9;
			f4 = f8 + f6 * (f4 - f8);
		}
		path.cubicTo((f + f5) / 2.0F, (f1 + f4) / 2.0F, (f5 + f2) / 2.0F, (f4 + f3) / 2.0F, f2, f3);
		return path;
	//* 214  365:goto            184
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
