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
		float f6;
		float f7;
		float f8;
		float f11;
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
		f6 = f4 * f4 + f5 * f5;
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
		f7 = f6 * 0.25F;
	//   36   55:fload           7
	//   37   57:ldc1            #115 <Float 0.25F>
	//   38   59:fmul            
	//   39   60:fstore          8
		boolean flag;
		if(f1 > f3)
	//*  40   62:fload_2         
	//*  41   63:fload           4
	//*  42   65:fcmpl           
	//*  43   66:ifle            268
			flag = true;
	//   44   69:iconst_1        
	//   45   70:istore          13
		else
	//*  46   72:fload           5
	//*  47   74:invokestatic    #118 <Method float Math.abs(float)>
	//*  48   77:fload           6
	//*  49   79:invokestatic    #118 <Method float Math.abs(float)>
	//*  50   82:fcmpg           
	//*  51   83:ifge            286
	//*  52   86:fload           7
	//*  53   88:fconst_2        
	//*  54   89:fload           6
	//*  55   91:fmul            
	//*  56   92:fdiv            
	//*  57   93:invokestatic    #118 <Method float Math.abs(float)>
	//*  58   96:fstore          5
	//*  59   98:iload           13
	//*  60  100:ifeq            274
	//*  61  103:fload           4
	//*  62  105:fload           5
	//*  63  107:fadd            
	//*  64  108:fstore          5
	//*  65  110:fload_3         
	//*  66  111:fstore          6
	//*  67  113:aload_0         
	//*  68  114:getfield        #45  <Field float mMinimumVerticalTangent>
	//*  69  117:fload           8
	//*  70  119:fmul            
	//*  71  120:aload_0         
	//*  72  121:getfield        #45  <Field float mMinimumVerticalTangent>
	//*  73  124:fmul            
	//*  74  125:fstore          7
	//*  75  127:fload           11
	//*  76  129:fload           6
	//*  77  131:fsub            
	//*  78  132:fstore          9
	//*  79  134:fload           10
	//*  80  136:fload           5
	//*  81  138:fsub            
	//*  82  139:fstore          12
	//*  83  141:fload           9
	//*  84  143:fload           9
	//*  85  145:fmul            
	//*  86  146:fload           12
	//*  87  148:fload           12
	//*  88  150:fmul            
	//*  89  151:fadd            
	//*  90  152:fstore          12
	//*  91  154:aload_0         
	//*  92  155:getfield        #47  <Field float mMaximumTangent>
	//*  93  158:fload           8
	//*  94  160:fmul            
	//*  95  161:aload_0         
	//*  96  162:getfield        #47  <Field float mMaximumTangent>
	//*  97  165:fmul            
	//*  98  166:fstore          8
	//*  99  168:fconst_0        
	//* 100  169:fstore          9
	//* 101  171:fload           12
	//* 102  173:fload           7
	//* 103  175:fcmpg           
	//* 104  176:ifge            339
	//* 105  179:fload           6
	//* 106  181:fstore          9
	//* 107  183:fload           5
	//* 108  185:fstore          8
	//* 109  187:fload           7
	//* 110  189:fconst_0        
	//* 111  190:fcmpl           
	//* 112  191:ifeq            232
	//* 113  194:fload           7
	//* 114  196:fload           12
	//* 115  198:fdiv            
	//* 116  199:f2d             
	//* 117  200:invokestatic    #121 <Method double Math.sqrt(double)>
	//* 118  203:d2f             
	//* 119  204:fstore          7
	//* 120  206:fload           11
	//* 121  208:fload           6
	//* 122  210:fload           11
	//* 123  212:fsub            
	//* 124  213:fload           7
	//* 125  215:fmul            
	//* 126  216:fadd            
	//* 127  217:fstore          9
	//* 128  219:fload           10
	//* 129  221:fload           5
	//* 130  223:fload           10
	//* 131  225:fsub            
	//* 132  226:fload           7
	//* 133  228:fmul            
	//* 134  229:fadd            
	//* 135  230:fstore          8
	//* 136  232:aload           14
	//* 137  234:fload_1         
	//* 138  235:fload           9
	//* 139  237:fadd            
	//* 140  238:fconst_2        
	//* 141  239:fdiv            
	//* 142  240:fload_2         
	//* 143  241:fload           8
	//* 144  243:fadd            
	//* 145  244:fconst_2        
	//* 146  245:fdiv            
	//* 147  246:fload           9
	//* 148  248:fload_3         
	//* 149  249:fadd            
	//* 150  250:fconst_2        
	//* 151  251:fdiv            
	//* 152  252:fload           8
	//* 153  254:fload           4
	//* 154  256:fadd            
	//* 155  257:fconst_2        
	//* 156  258:fdiv            
	//* 157  259:fload_3         
	//* 158  260:fload           4
	//* 159  262:invokevirtual   #125 <Method void Path.cubicTo(float, float, float, float, float, float)>
	//* 160  265:aload           14
	//* 161  267:areturn         
			flag = false;
	//  162  268:iconst_0        
	//  163  269:istore          13
		if(Math.abs(f4) < Math.abs(f5))
		{
			f4 = Math.abs(f6 / (2.0F * f5));
			if(flag)
			{
				f4 = f3 + f4;
				f5 = f2;
			} else
	//* 164  271:goto            72
			{
				f4 = f1 + f4;
	//  165  274:fload_2         
	//  166  275:fload           5
	//  167  277:fadd            
	//  168  278:fstore          5
				f5 = f;
	//  169  280:fload_1         
	//  170  281:fstore          6
			}
			f6 = mMinimumVerticalTangent * f7 * mMinimumVerticalTangent;
		} else
	//* 171  283:goto            113
		{
			f4 = f6 / (2.0F * f4);
	//  172  286:fload           7
	//  173  288:fconst_2        
	//  174  289:fload           5
	//  175  291:fmul            
	//  176  292:fdiv            
	//  177  293:fstore          5
			if(flag)
	//* 178  295:iload           13
	//* 179  297:ifeq            326
			{
				f5 = f + f4;
	//  180  300:fload_1         
	//  181  301:fload           5
	//  182  303:fadd            
	//  183  304:fstore          6
				f4 = f1;
	//  184  306:fload_2         
	//  185  307:fstore          5
			} else
	//* 186  309:aload_0         
	//* 187  310:getfield        #43  <Field float mMinimumHorizontalTangent>
	//* 188  313:fload           8
	//* 189  315:fmul            
	//* 190  316:aload_0         
	//* 191  317:getfield        #43  <Field float mMinimumHorizontalTangent>
	//* 192  320:fmul            
	//* 193  321:fstore          7
	//* 194  323:goto            127
			{
				f5 = f2 - f4;
	//  195  326:fload_3         
	//  196  327:fload           5
	//  197  329:fsub            
	//  198  330:fstore          6
				f4 = f3;
	//  199  332:fload           4
	//  200  334:fstore          5
			}
			f6 = mMinimumHorizontalTangent * f7 * mMinimumHorizontalTangent;
		}
		f8 = f10 - f5;
		f11 = f9 - f4;
		f11 = f8 * f8 + f11 * f11;
		f7 = mMaximumTangent * f7 * mMaximumTangent;
		f8 = 0.0F;
		if(f11 >= f6) goto _L2; else goto _L1
_L1:
		f8 = f5;
		f7 = f4;
		if(f6 != 0.0F)
		{
			f6 = (float)Math.sqrt(f6 / f11);
			f8 = f10 + (f5 - f10) * f6;
			f7 = f9 + (f4 - f9) * f6;
		}
		path.cubicTo((f + f8) / 2.0F, (f1 + f7) / 2.0F, (f8 + f2) / 2.0F, (f7 + f3) / 2.0F, f2, f3);
		return path;
	//* 201  336:goto            309
_L2:
		f6 = f8;
	//  202  339:fload           9
	//  203  341:fstore          7
		if(f11 > f7)
	//* 204  343:fload           12
	//* 205  345:fload           8
	//* 206  347:fcmpl           
	//* 207  348:ifle            179
			f6 = f7;
	//  208  351:fload           8
	//  209  353:fstore          7
		if(true) goto _L1; else goto _L3
	//  210  355:goto            179
_L3:
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
