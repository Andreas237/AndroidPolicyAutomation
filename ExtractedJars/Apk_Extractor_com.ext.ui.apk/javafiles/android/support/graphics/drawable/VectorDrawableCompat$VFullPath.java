// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
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
	//	               0 30
	//	               1 34
	//	               2 38
		default:
			return cap;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 0: // '\0'
			return android.graphics.Paint.Cap.BUTT;
	//    4   30:getstatic       #52  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Cap.ROUND;
	//    6   34:getstatic       #76  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
	//    7   37:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Cap.SQUARE;
	//    8   38:getstatic       #79  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
	//    9   41:areturn         
		}
	}

	private android.graphics.Paint.Join getStrokeLineJoin(int i, android.graphics.Paint.Join join)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 30
	//	               1 34
	//	               2 38
		default:
			return join;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 0: // '\0'
			return android.graphics.Paint.Join.MITER;
	//    4   30:getstatic       #59  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Join.ROUND;
	//    6   34:getstatic       #83  <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//    7   37:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Join.BEVEL;
	//    8   38:getstatic       #86  <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
	//    9   41:areturn         
		}
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
	{
		mThemeAttrs = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #71  <Field int[] mThemeAttrs>
		if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
	//*   3    5:aload_2         
	//*   4    6:ldc1            #90  <String "pathData">
	//*   5    8:invokestatic    #96  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*   6   11:ifne            15
			return;
	//    7   14:return          
		String s = typedarray.getString(0);
	//    8   15:aload_1         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #102 <Method String TypedArray.getString(int)>
	//   11   20:astore_3        
		if(s != null)
	//*  12   21:aload_3         
	//*  13   22:ifnull          30
			mPathName = s;
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:putfield        #106 <Field String mPathName>
		s = typedarray.getString(2);
	//   17   30:aload_1         
	//   18   31:iconst_2        
	//   19   32:invokevirtual   #102 <Method String TypedArray.getString(int)>
	//   20   35:astore_3        
		if(s != null)
	//*  21   36:aload_3         
	//*  22   37:ifnull          48
			mNodes = PathParser.createNodesFromPathData(s);
	//   23   40:aload_0         
	//   24   41:aload_3         
	//   25   42:invokestatic    #112 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//   26   45:putfield        #116 <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		mFillColor = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "fillColor", 1, mFillColor);
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:aload_2         
	//   30   51:ldc1            #118 <String "fillColor">
	//   31   53:iconst_1        
	//   32   54:aload_0         
	//   33   55:getfield        #35  <Field int mFillColor>
	//   34   58:invokestatic    #122 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   35   61:putfield        #35  <Field int mFillColor>
		mFillAlpha = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "fillAlpha", 12, mFillAlpha);
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:aload_2         
	//   39   67:ldc1            #124 <String "fillAlpha">
	//   40   69:bipush          12
	//   41   71:aload_0         
	//   42   72:getfield        #41  <Field float mFillAlpha>
	//   43   75:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   44   78:putfield        #41  <Field float mFillAlpha>
		mStrokeLineCap = getStrokeLineCap(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineCap", 8, -1), mStrokeLineCap);
	//   45   81:aload_0         
	//   46   82:aload_0         
	//   47   83:aload_1         
	//   48   84:aload_2         
	//   49   85:ldc1            #130 <String "strokeLineCap">
	//   50   87:bipush          8
	//   51   89:iconst_m1       
	//   52   90:invokestatic    #133 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   53   93:aload_0         
	//   54   94:getfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
	//   55   97:invokespecial   #135 <Method android.graphics.Paint$Cap getStrokeLineCap(int, android.graphics.Paint$Cap)>
	//   56  100:putfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = getStrokeLineJoin(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineJoin", 9, -1), mStrokeLineJoin);
	//   57  103:aload_0         
	//   58  104:aload_0         
	//   59  105:aload_1         
	//   60  106:aload_2         
	//   61  107:ldc1            #137 <String "strokeLineJoin">
	//   62  109:bipush          9
	//   63  111:iconst_m1       
	//   64  112:invokestatic    #133 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   65  115:aload_0         
	//   66  116:getfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
	//   67  119:invokespecial   #139 <Method android.graphics.Paint$Join getStrokeLineJoin(int, android.graphics.Paint$Join)>
	//   68  122:putfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeMiterLimit", 10, mStrokeMiterlimit);
	//   69  125:aload_0         
	//   70  126:aload_1         
	//   71  127:aload_2         
	//   72  128:ldc1            #141 <String "strokeMiterLimit">
	//   73  130:bipush          10
	//   74  132:aload_0         
	//   75  133:getfield        #64  <Field float mStrokeMiterlimit>
	//   76  136:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   77  139:putfield        #64  <Field float mStrokeMiterlimit>
		mStrokeColor = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "strokeColor", 3, mStrokeColor);
	//   78  142:aload_0         
	//   79  143:aload_1         
	//   80  144:aload_2         
	//   81  145:ldc1            #143 <String "strokeColor">
	//   82  147:iconst_3        
	//   83  148:aload_0         
	//   84  149:getfield        #31  <Field int mStrokeColor>
	//   85  152:invokestatic    #122 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   86  155:putfield        #31  <Field int mStrokeColor>
		mStrokeAlpha = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeAlpha", 11, mStrokeAlpha);
	//   87  158:aload_0         
	//   88  159:aload_1         
	//   89  160:aload_2         
	//   90  161:ldc1            #145 <String "strokeAlpha">
	//   91  163:bipush          11
	//   92  165:aload_0         
	//   93  166:getfield        #37  <Field float mStrokeAlpha>
	//   94  169:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   95  172:putfield        #37  <Field float mStrokeAlpha>
		mStrokeWidth = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeWidth", 4, mStrokeWidth);
	//   96  175:aload_0         
	//   97  176:aload_1         
	//   98  177:aload_2         
	//   99  178:ldc1            #147 <String "strokeWidth">
	//  100  180:iconst_4        
	//  101  181:aload_0         
	//  102  182:getfield        #33  <Field float mStrokeWidth>
	//  103  185:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  104  188:putfield        #33  <Field float mStrokeWidth>
		mTrimPathEnd = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathEnd", 6, mTrimPathEnd);
	//  105  191:aload_0         
	//  106  192:aload_1         
	//  107  193:aload_2         
	//  108  194:ldc1            #149 <String "trimPathEnd">
	//  109  196:bipush          6
	//  110  198:aload_0         
	//  111  199:getfield        #45  <Field float mTrimPathEnd>
	//  112  202:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  113  205:putfield        #45  <Field float mTrimPathEnd>
		mTrimPathOffset = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathOffset", 7, mTrimPathOffset);
	//  114  208:aload_0         
	//  115  209:aload_1         
	//  116  210:aload_2         
	//  117  211:ldc1            #151 <String "trimPathOffset">
	//  118  213:bipush          7
	//  119  215:aload_0         
	//  120  216:getfield        #47  <Field float mTrimPathOffset>
	//  121  219:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  122  222:putfield        #47  <Field float mTrimPathOffset>
		mTrimPathStart = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathStart", 5, mTrimPathStart);
	//  123  225:aload_0         
	//  124  226:aload_1         
	//  125  227:aload_2         
	//  126  228:ldc1            #153 <String "trimPathStart">
	//  127  230:iconst_5        
	//  128  231:aload_0         
	//  129  232:getfield        #43  <Field float mTrimPathStart>
	//  130  235:invokestatic    #128 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  131  238:putfield        #43  <Field float mTrimPathStart>
		mFillRule = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "fillType", 13, mFillRule);
	//  132  241:aload_0         
	//  133  242:aload_1         
	//  134  243:aload_2         
	//  135  244:ldc1            #155 <String "fillType">
	//  136  246:bipush          13
	//  137  248:aload_0         
	//  138  249:getfield        #39  <Field int mFillRule>
	//  139  252:invokestatic    #133 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//  140  255:putfield        #39  <Field int mFillRule>
	//  141  258:return          
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		if(mThemeAttrs != null);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int[] mThemeAttrs>
	//    2    4:ifnonnull       7
	//    3    7:return          
	}

	public boolean canApplyTheme()
	{
		return mThemeAttrs != null;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int[] mThemeAttrs>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	float getFillAlpha()
	{
		return mFillAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float mFillAlpha>
	//    2    4:freturn         
	}

	int getFillColor()
	{
		return mFillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mFillColor>
	//    2    4:ireturn         
	}

	float getStrokeAlpha()
	{
		return mStrokeAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float mStrokeAlpha>
	//    2    4:freturn         
	}

	int getStrokeColor()
	{
		return mStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mStrokeColor>
	//    2    4:ireturn         
	}

	float getStrokeWidth()
	{
		return mStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mStrokeWidth>
	//    2    4:freturn         
	}

	float getTrimPathEnd()
	{
		return mTrimPathEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float mTrimPathEnd>
	//    2    4:freturn         
	}

	float getTrimPathOffset()
	{
		return mTrimPathOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float mTrimPathOffset>
	//    2    4:freturn         
	}

	float getTrimPathStart()
	{
		return mTrimPathStart;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float mTrimPathStart>
	//    2    4:freturn         
	}

	public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #176 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH>
	//    4    6:invokestatic    #180 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokespecial   #182 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
		((TypedArray) (resources)).recycle();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #185 <Method void TypedArray.recycle()>
	//   12   21:return          
	}

	void setFillAlpha(float f)
	{
		mFillAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #41  <Field float mFillAlpha>
	//    3    5:return          
	}

	void setFillColor(int i)
	{
		mFillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int mFillColor>
	//    3    5:return          
	}

	void setStrokeAlpha(float f)
	{
		mStrokeAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #37  <Field float mStrokeAlpha>
	//    3    5:return          
	}

	void setStrokeColor(int i)
	{
		mStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mStrokeColor>
	//    3    5:return          
	}

	void setStrokeWidth(float f)
	{
		mStrokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #33  <Field float mStrokeWidth>
	//    3    5:return          
	}

	void setTrimPathEnd(float f)
	{
		mTrimPathEnd = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #45  <Field float mTrimPathEnd>
	//    3    5:return          
	}

	void setTrimPathOffset(float f)
	{
		mTrimPathOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #47  <Field float mTrimPathOffset>
	//    3    5:return          
	}

	void setTrimPathStart(float f)
	{
		mTrimPathStart = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #43  <Field float mTrimPathStart>
	//    3    5:return          
	}

	float mFillAlpha;
	int mFillColor;
	int mFillRule;
	float mStrokeAlpha;
	int mStrokeColor;
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
	//    1    1:invokespecial   #29  <Method void VectorDrawableCompat$VPath()>
		mStrokeColor = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field int mStrokeColor>
		mStrokeWidth = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #33  <Field float mStrokeWidth>
		mFillColor = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #35  <Field int mFillColor>
		mStrokeAlpha = 1.0F;
	//   11   19:aload_0         
	//   12   20:fconst_1        
	//   13   21:putfield        #37  <Field float mStrokeAlpha>
		mFillRule = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #39  <Field int mFillRule>
		mFillAlpha = 1.0F;
	//   17   29:aload_0         
	//   18   30:fconst_1        
	//   19   31:putfield        #41  <Field float mFillAlpha>
		mTrimPathStart = 0.0F;
	//   20   34:aload_0         
	//   21   35:fconst_0        
	//   22   36:putfield        #43  <Field float mTrimPathStart>
		mTrimPathEnd = 1.0F;
	//   23   39:aload_0         
	//   24   40:fconst_1        
	//   25   41:putfield        #45  <Field float mTrimPathEnd>
		mTrimPathOffset = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #47  <Field float mTrimPathOffset>
		mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
	//   29   49:aload_0         
	//   30   50:getstatic       #52  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   31   53:putfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = android.graphics.Paint.Join.MITER;
	//   32   56:aload_0         
	//   33   57:getstatic       #59  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   34   60:putfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = 4F;
	//   35   63:aload_0         
	//   36   64:ldc1            #62  <Float 4F>
	//   37   66:putfield        #64  <Field float mStrokeMiterlimit>
	//   38   69:return          
	}

	public VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath vectordrawablecompat$vfullpath)
	{
		super(((VectorDrawableCompat.VPath) (vectordrawablecompat$vfullpath)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void VectorDrawableCompat$VPath(VectorDrawableCompat$VPath)>
		mStrokeColor = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #31  <Field int mStrokeColor>
		mStrokeWidth = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #33  <Field float mStrokeWidth>
		mFillColor = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #35  <Field int mFillColor>
		mStrokeAlpha = 1.0F;
	//   12   20:aload_0         
	//   13   21:fconst_1        
	//   14   22:putfield        #37  <Field float mStrokeAlpha>
		mFillRule = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #39  <Field int mFillRule>
		mFillAlpha = 1.0F;
	//   18   30:aload_0         
	//   19   31:fconst_1        
	//   20   32:putfield        #41  <Field float mFillAlpha>
		mTrimPathStart = 0.0F;
	//   21   35:aload_0         
	//   22   36:fconst_0        
	//   23   37:putfield        #43  <Field float mTrimPathStart>
		mTrimPathEnd = 1.0F;
	//   24   40:aload_0         
	//   25   41:fconst_1        
	//   26   42:putfield        #45  <Field float mTrimPathEnd>
		mTrimPathOffset = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #47  <Field float mTrimPathOffset>
		mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
	//   30   50:aload_0         
	//   31   51:getstatic       #52  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   32   54:putfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = android.graphics.Paint.Join.MITER;
	//   33   57:aload_0         
	//   34   58:getstatic       #59  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   35   61:putfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = 4F;
	//   36   64:aload_0         
	//   37   65:ldc1            #62  <Float 4F>
	//   38   67:putfield        #64  <Field float mStrokeMiterlimit>
		mThemeAttrs = vectordrawablecompat$vfullpath.mThemeAttrs;
	//   39   70:aload_0         
	//   40   71:aload_1         
	//   41   72:getfield        #71  <Field int[] mThemeAttrs>
	//   42   75:putfield        #71  <Field int[] mThemeAttrs>
		mStrokeColor = vectordrawablecompat$vfullpath.mStrokeColor;
	//   43   78:aload_0         
	//   44   79:aload_1         
	//   45   80:getfield        #31  <Field int mStrokeColor>
	//   46   83:putfield        #31  <Field int mStrokeColor>
		mStrokeWidth = vectordrawablecompat$vfullpath.mStrokeWidth;
	//   47   86:aload_0         
	//   48   87:aload_1         
	//   49   88:getfield        #33  <Field float mStrokeWidth>
	//   50   91:putfield        #33  <Field float mStrokeWidth>
		mStrokeAlpha = vectordrawablecompat$vfullpath.mStrokeAlpha;
	//   51   94:aload_0         
	//   52   95:aload_1         
	//   53   96:getfield        #37  <Field float mStrokeAlpha>
	//   54   99:putfield        #37  <Field float mStrokeAlpha>
		mFillColor = vectordrawablecompat$vfullpath.mFillColor;
	//   55  102:aload_0         
	//   56  103:aload_1         
	//   57  104:getfield        #35  <Field int mFillColor>
	//   58  107:putfield        #35  <Field int mFillColor>
		mFillRule = vectordrawablecompat$vfullpath.mFillRule;
	//   59  110:aload_0         
	//   60  111:aload_1         
	//   61  112:getfield        #39  <Field int mFillRule>
	//   62  115:putfield        #39  <Field int mFillRule>
		mFillAlpha = vectordrawablecompat$vfullpath.mFillAlpha;
	//   63  118:aload_0         
	//   64  119:aload_1         
	//   65  120:getfield        #41  <Field float mFillAlpha>
	//   66  123:putfield        #41  <Field float mFillAlpha>
		mTrimPathStart = vectordrawablecompat$vfullpath.mTrimPathStart;
	//   67  126:aload_0         
	//   68  127:aload_1         
	//   69  128:getfield        #43  <Field float mTrimPathStart>
	//   70  131:putfield        #43  <Field float mTrimPathStart>
		mTrimPathEnd = vectordrawablecompat$vfullpath.mTrimPathEnd;
	//   71  134:aload_0         
	//   72  135:aload_1         
	//   73  136:getfield        #45  <Field float mTrimPathEnd>
	//   74  139:putfield        #45  <Field float mTrimPathEnd>
		mTrimPathOffset = vectordrawablecompat$vfullpath.mTrimPathOffset;
	//   75  142:aload_0         
	//   76  143:aload_1         
	//   77  144:getfield        #47  <Field float mTrimPathOffset>
	//   78  147:putfield        #47  <Field float mTrimPathOffset>
		mStrokeLineCap = vectordrawablecompat$vfullpath.mStrokeLineCap;
	//   79  150:aload_0         
	//   80  151:aload_1         
	//   81  152:getfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
	//   82  155:putfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
		mStrokeLineJoin = vectordrawablecompat$vfullpath.mStrokeLineJoin;
	//   83  158:aload_0         
	//   84  159:aload_1         
	//   85  160:getfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
	//   86  163:putfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
		mStrokeMiterlimit = vectordrawablecompat$vfullpath.mStrokeMiterlimit;
	//   87  166:aload_0         
	//   88  167:aload_1         
	//   89  168:getfield        #64  <Field float mStrokeMiterlimit>
	//   90  171:putfield        #64  <Field float mStrokeMiterlimit>
	//   91  174:return          
	}
}
