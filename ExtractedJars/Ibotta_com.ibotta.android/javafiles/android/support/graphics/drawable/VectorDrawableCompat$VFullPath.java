// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.content.res.ComplexColorCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat, AndroidResources

private static class VectorDrawableCompat$VFullPath extends VectorDrawableCompat.VPath
{

	private android.graphics.Paint.Cap getStrokeLineCap(int i, android.graphics.Paint.Cap cap)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 34
	//	               2 30
		default:
			return cap;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Cap.SQUARE;
	//    4   30:getstatic       #77  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Cap.ROUND;
	//    6   34:getstatic       #80  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
	//    7   37:areturn         

		case 0: // '\0'
			return android.graphics.Paint.Cap.BUTT;
	//    8   38:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//    9   41:areturn         
		}
	}

	private android.graphics.Paint.Join getStrokeLineJoin(int i, android.graphics.Paint.Join join)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 34
	//	               2 30
		default:
			return join;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Join.BEVEL;
	//    4   30:getstatic       #85  <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Join.ROUND;
	//    6   34:getstatic       #87  <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//    7   37:areturn         

		case 0: // '\0'
			return android.graphics.Paint.Join.MITER;
	//    8   38:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//    9   41:areturn         
		}
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser, android.content.res.Resources.Theme theme)
	{
		mThemeAttrs = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #68  <Field int[] mThemeAttrs>
		if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
	//*   3    5:aload_2         
	//*   4    6:ldc1            #91  <String "pathData">
	//*   5    8:invokestatic    #97  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*   6   11:ifne            15
			return;
	//    7   14:return          
		String s = typedarray.getString(0);
	//    8   15:aload_1         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #103 <Method String TypedArray.getString(int)>
	//   11   20:astore          4
		if(s != null)
	//*  12   22:aload           4
	//*  13   24:ifnull          33
			mPathName = s;
	//   14   27:aload_0         
	//   15   28:aload           4
	//   16   30:putfield        #107 <Field String mPathName>
		s = typedarray.getString(2);
	//   17   33:aload_1         
	//   18   34:iconst_2        
	//   19   35:invokevirtual   #103 <Method String TypedArray.getString(int)>
	//   20   38:astore          4
		if(s != null)
	//*  21   40:aload           4
	//*  22   42:ifnull          54
			mNodes = PathParser.createNodesFromPathData(s);
	//   23   45:aload_0         
	//   24   46:aload           4
	//   25   48:invokestatic    #113 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//   26   51:putfield        #117 <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		mFillColor = TypedArrayUtils.getNamedComplexColor(typedarray, xmlpullparser, theme, "fillColor", 1, 0);
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:aload_2         
	//   30   57:aload_3         
	//   31   58:ldc1            #119 <String "fillColor">
	//   32   60:iconst_1        
	//   33   61:iconst_0        
	//   34   62:invokestatic    #123 <Method ComplexColorCompat TypedArrayUtils.getNamedComplexColor(TypedArray, XmlPullParser, android.content.res.Resources$Theme, String, int, int)>
	//   35   65:putfield        #72  <Field ComplexColorCompat mFillColor>
		mFillAlpha = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "fillAlpha", 12, mFillAlpha);
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:aload_2         
	//   39   71:ldc1            #125 <String "fillAlpha">
	//   40   73:bipush          12
	//   41   75:aload_0         
	//   42   76:getfield        #38  <Field float mFillAlpha>
	//   43   79:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   44   82:putfield        #38  <Field float mFillAlpha>
		mStrokeLineCap = getStrokeLineCap(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineCap", 8, -1), mStrokeLineCap);
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:aload_1         
	//   48   88:aload_2         
	//   49   89:ldc1            #131 <String "strokeLineCap">
	//   50   91:bipush          8
	//   51   93:iconst_m1       
	//   52   94:invokestatic    #135 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   53   97:aload_0         
	//   54   98:getfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
	//   55  101:invokespecial   #137 <Method android.graphics.Paint$Cap getStrokeLineCap(int, android.graphics.Paint$Cap)>
	//   56  104:putfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = getStrokeLineJoin(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineJoin", 9, -1), mStrokeLineJoin);
	//   57  107:aload_0         
	//   58  108:aload_0         
	//   59  109:aload_1         
	//   60  110:aload_2         
	//   61  111:ldc1            #139 <String "strokeLineJoin">
	//   62  113:bipush          9
	//   63  115:iconst_m1       
	//   64  116:invokestatic    #135 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   65  119:aload_0         
	//   66  120:getfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
	//   67  123:invokespecial   #141 <Method android.graphics.Paint$Join getStrokeLineJoin(int, android.graphics.Paint$Join)>
	//   68  126:putfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeMiterLimit", 10, mStrokeMiterlimit);
	//   69  129:aload_0         
	//   70  130:aload_1         
	//   71  131:aload_2         
	//   72  132:ldc1            #143 <String "strokeMiterLimit">
	//   73  134:bipush          10
	//   74  136:aload_0         
	//   75  137:getfield        #61  <Field float mStrokeMiterlimit>
	//   76  140:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   77  143:putfield        #61  <Field float mStrokeMiterlimit>
		mStrokeColor = TypedArrayUtils.getNamedComplexColor(typedarray, xmlpullparser, theme, "strokeColor", 3, 0);
	//   78  146:aload_0         
	//   79  147:aload_1         
	//   80  148:aload_2         
	//   81  149:aload_3         
	//   82  150:ldc1            #145 <String "strokeColor">
	//   83  152:iconst_3        
	//   84  153:iconst_0        
	//   85  154:invokestatic    #123 <Method ComplexColorCompat TypedArrayUtils.getNamedComplexColor(TypedArray, XmlPullParser, android.content.res.Resources$Theme, String, int, int)>
	//   86  157:putfield        #70  <Field ComplexColorCompat mStrokeColor>
		mStrokeAlpha = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeAlpha", 11, mStrokeAlpha);
	//   87  160:aload_0         
	//   88  161:aload_1         
	//   89  162:aload_2         
	//   90  163:ldc1            #147 <String "strokeAlpha">
	//   91  165:bipush          11
	//   92  167:aload_0         
	//   93  168:getfield        #34  <Field float mStrokeAlpha>
	//   94  171:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   95  174:putfield        #34  <Field float mStrokeAlpha>
		mStrokeWidth = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeWidth", 4, mStrokeWidth);
	//   96  177:aload_0         
	//   97  178:aload_1         
	//   98  179:aload_2         
	//   99  180:ldc1            #149 <String "strokeWidth">
	//  100  182:iconst_4        
	//  101  183:aload_0         
	//  102  184:getfield        #32  <Field float mStrokeWidth>
	//  103  187:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  104  190:putfield        #32  <Field float mStrokeWidth>
		mTrimPathEnd = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathEnd", 6, mTrimPathEnd);
	//  105  193:aload_0         
	//  106  194:aload_1         
	//  107  195:aload_2         
	//  108  196:ldc1            #151 <String "trimPathEnd">
	//  109  198:bipush          6
	//  110  200:aload_0         
	//  111  201:getfield        #42  <Field float mTrimPathEnd>
	//  112  204:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  113  207:putfield        #42  <Field float mTrimPathEnd>
		mTrimPathOffset = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathOffset", 7, mTrimPathOffset);
	//  114  210:aload_0         
	//  115  211:aload_1         
	//  116  212:aload_2         
	//  117  213:ldc1            #153 <String "trimPathOffset">
	//  118  215:bipush          7
	//  119  217:aload_0         
	//  120  218:getfield        #44  <Field float mTrimPathOffset>
	//  121  221:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  122  224:putfield        #44  <Field float mTrimPathOffset>
		mTrimPathStart = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathStart", 5, mTrimPathStart);
	//  123  227:aload_0         
	//  124  228:aload_1         
	//  125  229:aload_2         
	//  126  230:ldc1            #155 <String "trimPathStart">
	//  127  232:iconst_5        
	//  128  233:aload_0         
	//  129  234:getfield        #40  <Field float mTrimPathStart>
	//  130  237:invokestatic    #129 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  131  240:putfield        #40  <Field float mTrimPathStart>
		mFillRule = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "fillType", 13, mFillRule);
	//  132  243:aload_0         
	//  133  244:aload_1         
	//  134  245:aload_2         
	//  135  246:ldc1            #157 <String "fillType">
	//  136  248:bipush          13
	//  137  250:aload_0         
	//  138  251:getfield        #36  <Field int mFillRule>
	//  139  254:invokestatic    #135 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//  140  257:putfield        #36  <Field int mFillRule>
	//  141  260:return          
	}

	float getFillAlpha()
	{
		return mFillAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float mFillAlpha>
	//    2    4:freturn         
	}

	int getFillColor()
	{
		return mFillColor.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ComplexColorCompat mFillColor>
	//    2    4:invokevirtual   #167 <Method int ComplexColorCompat.getColor()>
	//    3    7:ireturn         
	}

	float getStrokeAlpha()
	{
		return mStrokeAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float mStrokeAlpha>
	//    2    4:freturn         
	}

	int getStrokeColor()
	{
		return mStrokeColor.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ComplexColorCompat mStrokeColor>
	//    2    4:invokevirtual   #167 <Method int ComplexColorCompat.getColor()>
	//    3    7:ireturn         
	}

	float getStrokeWidth()
	{
		return mStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float mStrokeWidth>
	//    2    4:freturn         
	}

	float getTrimPathEnd()
	{
		return mTrimPathEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float mTrimPathEnd>
	//    2    4:freturn         
	}

	float getTrimPathOffset()
	{
		return mTrimPathOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float mTrimPathOffset>
	//    2    4:freturn         
	}

	float getTrimPathStart()
	{
		return mTrimPathStart;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float mTrimPathStart>
	//    2    4:freturn         
	}

	public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #181 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH>
	//    4    6:invokestatic    #185 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser, theme);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:aload_3         
	//   10   15:invokespecial   #187 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser, android.content.res.Resources$Theme)>
		((TypedArray) (resources)).recycle();
	//   11   18:aload_1         
	//   12   19:invokevirtual   #190 <Method void TypedArray.recycle()>
	//   13   22:return          
	}

	public boolean isStateful()
	{
		return mFillColor.isStateful() || mStrokeColor.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ComplexColorCompat mFillColor>
	//    2    4:invokevirtual   #194 <Method boolean ComplexColorCompat.isStateful()>
	//    3    7:ifne            25
	//    4   10:aload_0         
	//    5   11:getfield        #70  <Field ComplexColorCompat mStrokeColor>
	//    6   14:invokevirtual   #194 <Method boolean ComplexColorCompat.isStateful()>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public boolean onStateChanged(int ai[])
	{
		boolean flag = mFillColor.onStateChanged(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ComplexColorCompat mFillColor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #198 <Method boolean ComplexColorCompat.onStateChanged(int[])>
	//    4    8:istore_2        
		return mStrokeColor.onStateChanged(ai) | flag;
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field ComplexColorCompat mStrokeColor>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #198 <Method boolean ComplexColorCompat.onStateChanged(int[])>
	//    9   17:iload_2         
	//   10   18:ior             
	//   11   19:ireturn         
	}

	void setFillAlpha(float f)
	{
		mFillAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #38  <Field float mFillAlpha>
	//    3    5:return          
	}

	void setFillColor(int i)
	{
		mFillColor.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ComplexColorCompat mFillColor>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method void ComplexColorCompat.setColor(int)>
	//    4    8:return          
	}

	void setStrokeAlpha(float f)
	{
		mStrokeAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #34  <Field float mStrokeAlpha>
	//    3    5:return          
	}

	void setStrokeColor(int i)
	{
		mStrokeColor.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ComplexColorCompat mStrokeColor>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #205 <Method void ComplexColorCompat.setColor(int)>
	//    4    8:return          
	}

	void setStrokeWidth(float f)
	{
		mStrokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float mStrokeWidth>
	//    3    5:return          
	}

	void setTrimPathEnd(float f)
	{
		mTrimPathEnd = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #42  <Field float mTrimPathEnd>
	//    3    5:return          
	}

	void setTrimPathOffset(float f)
	{
		mTrimPathOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #44  <Field float mTrimPathOffset>
	//    3    5:return          
	}

	void setTrimPathStart(float f)
	{
		mTrimPathStart = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float mTrimPathStart>
	//    3    5:return          
	}

	float mFillAlpha;
	ComplexColorCompat mFillColor;
	int mFillRule;
	float mStrokeAlpha;
	ComplexColorCompat mStrokeColor;
	android.graphics.Paint.Cap mStrokeLineCap;
	android.graphics.Paint.Join mStrokeLineJoin;
	float mStrokeMiterlimit;
	float mStrokeWidth;
	private int mThemeAttrs[];
	float mTrimPathEnd;
	float mTrimPathOffset;
	float mTrimPathStart;

	public VectorDrawableCompat$VFullPath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void VectorDrawableCompat$VPath()>
		mStrokeWidth = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #32  <Field float mStrokeWidth>
		mStrokeAlpha = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #34  <Field float mStrokeAlpha>
		mFillRule = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #36  <Field int mFillRule>
		mFillAlpha = 1.0F;
	//   11   19:aload_0         
	//   12   20:fconst_1        
	//   13   21:putfield        #38  <Field float mFillAlpha>
		mTrimPathStart = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #40  <Field float mTrimPathStart>
		mTrimPathEnd = 1.0F;
	//   17   29:aload_0         
	//   18   30:fconst_1        
	//   19   31:putfield        #42  <Field float mTrimPathEnd>
		mTrimPathOffset = 0.0F;
	//   20   34:aload_0         
	//   21   35:fconst_0        
	//   22   36:putfield        #44  <Field float mTrimPathOffset>
		mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
	//   23   39:aload_0         
	//   24   40:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   25   43:putfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = android.graphics.Paint.Join.MITER;
	//   26   46:aload_0         
	//   27   47:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   28   50:putfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = 4F;
	//   29   53:aload_0         
	//   30   54:ldc1            #59  <Float 4F>
	//   31   56:putfield        #61  <Field float mStrokeMiterlimit>
	//   32   59:return          
	}

	public VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath vectordrawablecompat$vfullpath)
	{
		super(((VectorDrawableCompat.VPath) (vectordrawablecompat$vfullpath)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void VectorDrawableCompat$VPath(VectorDrawableCompat$VPath)>
		mStrokeWidth = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #32  <Field float mStrokeWidth>
		mStrokeAlpha = 1.0F;
	//    6   10:aload_0         
	//    7   11:fconst_1        
	//    8   12:putfield        #34  <Field float mStrokeAlpha>
		mFillRule = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #36  <Field int mFillRule>
		mFillAlpha = 1.0F;
	//   12   20:aload_0         
	//   13   21:fconst_1        
	//   14   22:putfield        #38  <Field float mFillAlpha>
		mTrimPathStart = 0.0F;
	//   15   25:aload_0         
	//   16   26:fconst_0        
	//   17   27:putfield        #40  <Field float mTrimPathStart>
		mTrimPathEnd = 1.0F;
	//   18   30:aload_0         
	//   19   31:fconst_1        
	//   20   32:putfield        #42  <Field float mTrimPathEnd>
		mTrimPathOffset = 0.0F;
	//   21   35:aload_0         
	//   22   36:fconst_0        
	//   23   37:putfield        #44  <Field float mTrimPathOffset>
		mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
	//   24   40:aload_0         
	//   25   41:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   26   44:putfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = android.graphics.Paint.Join.MITER;
	//   27   47:aload_0         
	//   28   48:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   29   51:putfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = 4F;
	//   30   54:aload_0         
	//   31   55:ldc1            #59  <Float 4F>
	//   32   57:putfield        #61  <Field float mStrokeMiterlimit>
		mThemeAttrs = vectordrawablecompat$vfullpath.mThemeAttrs;
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:getfield        #68  <Field int[] mThemeAttrs>
	//   36   65:putfield        #68  <Field int[] mThemeAttrs>
		mStrokeColor = vectordrawablecompat$vfullpath.mStrokeColor;
	//   37   68:aload_0         
	//   38   69:aload_1         
	//   39   70:getfield        #70  <Field ComplexColorCompat mStrokeColor>
	//   40   73:putfield        #70  <Field ComplexColorCompat mStrokeColor>
		mStrokeWidth = vectordrawablecompat$vfullpath.mStrokeWidth;
	//   41   76:aload_0         
	//   42   77:aload_1         
	//   43   78:getfield        #32  <Field float mStrokeWidth>
	//   44   81:putfield        #32  <Field float mStrokeWidth>
		mStrokeAlpha = vectordrawablecompat$vfullpath.mStrokeAlpha;
	//   45   84:aload_0         
	//   46   85:aload_1         
	//   47   86:getfield        #34  <Field float mStrokeAlpha>
	//   48   89:putfield        #34  <Field float mStrokeAlpha>
		mFillColor = vectordrawablecompat$vfullpath.mFillColor;
	//   49   92:aload_0         
	//   50   93:aload_1         
	//   51   94:getfield        #72  <Field ComplexColorCompat mFillColor>
	//   52   97:putfield        #72  <Field ComplexColorCompat mFillColor>
		mFillRule = vectordrawablecompat$vfullpath.mFillRule;
	//   53  100:aload_0         
	//   54  101:aload_1         
	//   55  102:getfield        #36  <Field int mFillRule>
	//   56  105:putfield        #36  <Field int mFillRule>
		mFillAlpha = vectordrawablecompat$vfullpath.mFillAlpha;
	//   57  108:aload_0         
	//   58  109:aload_1         
	//   59  110:getfield        #38  <Field float mFillAlpha>
	//   60  113:putfield        #38  <Field float mFillAlpha>
		mTrimPathStart = vectordrawablecompat$vfullpath.mTrimPathStart;
	//   61  116:aload_0         
	//   62  117:aload_1         
	//   63  118:getfield        #40  <Field float mTrimPathStart>
	//   64  121:putfield        #40  <Field float mTrimPathStart>
		mTrimPathEnd = vectordrawablecompat$vfullpath.mTrimPathEnd;
	//   65  124:aload_0         
	//   66  125:aload_1         
	//   67  126:getfield        #42  <Field float mTrimPathEnd>
	//   68  129:putfield        #42  <Field float mTrimPathEnd>
		mTrimPathOffset = vectordrawablecompat$vfullpath.mTrimPathOffset;
	//   69  132:aload_0         
	//   70  133:aload_1         
	//   71  134:getfield        #44  <Field float mTrimPathOffset>
	//   72  137:putfield        #44  <Field float mTrimPathOffset>
		mStrokeLineCap = vectordrawablecompat$vfullpath.mStrokeLineCap;
	//   73  140:aload_0         
	//   74  141:aload_1         
	//   75  142:getfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
	//   76  145:putfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = vectordrawablecompat$vfullpath.mStrokeLineJoin;
	//   77  148:aload_0         
	//   78  149:aload_1         
	//   79  150:getfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
	//   80  153:putfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = vectordrawablecompat$vfullpath.mStrokeMiterlimit;
	//   81  156:aload_0         
	//   82  157:aload_1         
	//   83  158:getfield        #61  <Field float mStrokeMiterlimit>
	//   84  161:putfield        #61  <Field float mStrokeMiterlimit>
	//   85  164:return          
	}
}
