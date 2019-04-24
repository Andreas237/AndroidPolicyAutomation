// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCommon, AndroidResources

public class VectorDrawableCompat extends VectorDrawableCommon
{
	private static class VClipPath extends VPath
	{

		private void updateStateFromTypedArray(TypedArray typedarray)
		{
			String s = typedarray.getString(0);
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method String TypedArray.getString(int)>
		//    3    5:astore_2        
			if(s != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          15
				mPathName = s;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #28  <Field String mPathName>
			typedarray = ((TypedArray) (typedarray.getString(1)));
		//    9   15:aload_1         
		//   10   16:iconst_1        
		//   11   17:invokevirtual   #24  <Method String TypedArray.getString(int)>
		//   12   20:astore_1        
			if(typedarray != null)
		//*  13   21:aload_1         
		//*  14   22:ifnull          33
				mNodes = PathParser.createNodesFromPathData(((String) (typedarray)));
		//   15   25:aload_0         
		//   16   26:aload_1         
		//   17   27:invokestatic    #34  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
		//   18   30:putfield        #38  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   19   33:return          
		}

		public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
		//*   0    0:aload           4
		//*   1    2:ldc1            #42  <String "pathData">
		//*   2    4:invokestatic    #48  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
		//*   3    7:ifne            11
			{
				return;
		//    4   10:return          
			} else
			{
				resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH)));
		//    5   11:aload_1         
		//    6   12:aload_3         
		//    7   13:aload_2         
		//    8   14:getstatic       #54  <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH>
		//    9   17:invokestatic    #58  <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//   10   20:astore_1        
				updateStateFromTypedArray(((TypedArray) (resources)));
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokespecial   #60  <Method void updateStateFromTypedArray(TypedArray)>
				((TypedArray) (resources)).recycle();
		//   14   26:aload_1         
		//   15   27:invokevirtual   #63  <Method void TypedArray.recycle()>
				return;
		//   16   30:return          
			}
		}

		public boolean isClipPath()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public VClipPath()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void VectorDrawableCompat$VPath()>
		//    2    4:return          
		}

		public VClipPath(VClipPath vclippath)
		{
			super(((VPath) (vclippath)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void VectorDrawableCompat$VPath(VectorDrawableCompat$VPath)>
		//    3    5:return          
		}
	}

	private static class VFullPath extends VPath
	{

		private android.graphics.Paint.Cap getStrokeLineCap(int i, android.graphics.Paint.Cap cap)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 30
		//		               1 34
		//		               2 38
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
		//		               0 30
		//		               1 34
		//		               2 38
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

		public VFullPath()
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

		public VFullPath(VFullPath vfullpath)
		{
			super(((VPath) (vfullpath)));
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
			mThemeAttrs = vfullpath.mThemeAttrs;
		//   39   70:aload_0         
		//   40   71:aload_1         
		//   41   72:getfield        #71  <Field int[] mThemeAttrs>
		//   42   75:putfield        #71  <Field int[] mThemeAttrs>
			mStrokeColor = vfullpath.mStrokeColor;
		//   43   78:aload_0         
		//   44   79:aload_1         
		//   45   80:getfield        #31  <Field int mStrokeColor>
		//   46   83:putfield        #31  <Field int mStrokeColor>
			mStrokeWidth = vfullpath.mStrokeWidth;
		//   47   86:aload_0         
		//   48   87:aload_1         
		//   49   88:getfield        #33  <Field float mStrokeWidth>
		//   50   91:putfield        #33  <Field float mStrokeWidth>
			mStrokeAlpha = vfullpath.mStrokeAlpha;
		//   51   94:aload_0         
		//   52   95:aload_1         
		//   53   96:getfield        #37  <Field float mStrokeAlpha>
		//   54   99:putfield        #37  <Field float mStrokeAlpha>
			mFillColor = vfullpath.mFillColor;
		//   55  102:aload_0         
		//   56  103:aload_1         
		//   57  104:getfield        #35  <Field int mFillColor>
		//   58  107:putfield        #35  <Field int mFillColor>
			mFillRule = vfullpath.mFillRule;
		//   59  110:aload_0         
		//   60  111:aload_1         
		//   61  112:getfield        #39  <Field int mFillRule>
		//   62  115:putfield        #39  <Field int mFillRule>
			mFillAlpha = vfullpath.mFillAlpha;
		//   63  118:aload_0         
		//   64  119:aload_1         
		//   65  120:getfield        #41  <Field float mFillAlpha>
		//   66  123:putfield        #41  <Field float mFillAlpha>
			mTrimPathStart = vfullpath.mTrimPathStart;
		//   67  126:aload_0         
		//   68  127:aload_1         
		//   69  128:getfield        #43  <Field float mTrimPathStart>
		//   70  131:putfield        #43  <Field float mTrimPathStart>
			mTrimPathEnd = vfullpath.mTrimPathEnd;
		//   71  134:aload_0         
		//   72  135:aload_1         
		//   73  136:getfield        #45  <Field float mTrimPathEnd>
		//   74  139:putfield        #45  <Field float mTrimPathEnd>
			mTrimPathOffset = vfullpath.mTrimPathOffset;
		//   75  142:aload_0         
		//   76  143:aload_1         
		//   77  144:getfield        #47  <Field float mTrimPathOffset>
		//   78  147:putfield        #47  <Field float mTrimPathOffset>
			mStrokeLineCap = vfullpath.mStrokeLineCap;
		//   79  150:aload_0         
		//   80  151:aload_1         
		//   81  152:getfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
		//   82  155:putfield        #54  <Field android.graphics.Paint$Cap mStrokeLineCap>
			mStrokeLineJoin = vfullpath.mStrokeLineJoin;
		//   83  158:aload_0         
		//   84  159:aload_1         
		//   85  160:getfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
		//   86  163:putfield        #61  <Field android.graphics.Paint$Join mStrokeLineJoin>
			mStrokeMiterlimit = vfullpath.mStrokeMiterlimit;
		//   87  166:aload_0         
		//   88  167:aload_1         
		//   89  168:getfield        #64  <Field float mStrokeMiterlimit>
		//   90  171:putfield        #64  <Field float mStrokeMiterlimit>
		//   91  174:return          
		}
	}

	private static class VGroup
	{

		private void updateLocalMatrix()
		{
			mLocalMatrix.reset();
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Matrix mLocalMatrix>
		//    2    4:invokevirtual   #120 <Method void Matrix.reset()>
			mLocalMatrix.postTranslate(-mPivotX, -mPivotY);
		//    3    7:aload_0         
		//    4    8:getfield        #57  <Field Matrix mLocalMatrix>
		//    5   11:aload_0         
		//    6   12:getfield        #45  <Field float mPivotX>
		//    7   15:fneg            
		//    8   16:aload_0         
		//    9   17:getfield        #47  <Field float mPivotY>
		//   10   20:fneg            
		//   11   21:invokevirtual   #124 <Method boolean Matrix.postTranslate(float, float)>
		//   12   24:pop             
			mLocalMatrix.postScale(mScaleX, mScaleY);
		//   13   25:aload_0         
		//   14   26:getfield        #57  <Field Matrix mLocalMatrix>
		//   15   29:aload_0         
		//   16   30:getfield        #49  <Field float mScaleX>
		//   17   33:aload_0         
		//   18   34:getfield        #51  <Field float mScaleY>
		//   19   37:invokevirtual   #127 <Method boolean Matrix.postScale(float, float)>
		//   20   40:pop             
			mLocalMatrix.postRotate(mRotate, 0.0F, 0.0F);
		//   21   41:aload_0         
		//   22   42:getfield        #57  <Field Matrix mLocalMatrix>
		//   23   45:aload_0         
		//   24   46:getfield        #43  <Field float mRotate>
		//   25   49:fconst_0        
		//   26   50:fconst_0        
		//   27   51:invokevirtual   #131 <Method boolean Matrix.postRotate(float, float, float)>
		//   28   54:pop             
			mLocalMatrix.postTranslate(mTranslateX + mPivotX, mTranslateY + mPivotY);
		//   29   55:aload_0         
		//   30   56:getfield        #57  <Field Matrix mLocalMatrix>
		//   31   59:aload_0         
		//   32   60:getfield        #53  <Field float mTranslateX>
		//   33   63:aload_0         
		//   34   64:getfield        #45  <Field float mPivotX>
		//   35   67:fadd            
		//   36   68:aload_0         
		//   37   69:getfield        #55  <Field float mTranslateY>
		//   38   72:aload_0         
		//   39   73:getfield        #47  <Field float mPivotY>
		//   40   76:fadd            
		//   41   77:invokevirtual   #124 <Method boolean Matrix.postTranslate(float, float)>
		//   42   80:pop             
		//   43   81:return          
		}

		private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
		{
			mThemeAttrs = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #63  <Field int[] mThemeAttrs>
			mRotate = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "rotation", 5, mRotate);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:ldc1            #135 <String "rotation">
		//    7   10:iconst_5        
		//    8   11:aload_0         
		//    9   12:getfield        #43  <Field float mRotate>
		//   10   15:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   11   18:putfield        #43  <Field float mRotate>
			mPivotX = typedarray.getFloat(1, mPivotX);
		//   12   21:aload_0         
		//   13   22:aload_1         
		//   14   23:iconst_1        
		//   15   24:aload_0         
		//   16   25:getfield        #45  <Field float mPivotX>
		//   17   28:invokevirtual   #147 <Method float TypedArray.getFloat(int, float)>
		//   18   31:putfield        #45  <Field float mPivotX>
			mPivotY = typedarray.getFloat(2, mPivotY);
		//   19   34:aload_0         
		//   20   35:aload_1         
		//   21   36:iconst_2        
		//   22   37:aload_0         
		//   23   38:getfield        #47  <Field float mPivotY>
		//   24   41:invokevirtual   #147 <Method float TypedArray.getFloat(int, float)>
		//   25   44:putfield        #47  <Field float mPivotY>
			mScaleX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleX", 3, mScaleX);
		//   26   47:aload_0         
		//   27   48:aload_1         
		//   28   49:aload_2         
		//   29   50:ldc1            #149 <String "scaleX">
		//   30   52:iconst_3        
		//   31   53:aload_0         
		//   32   54:getfield        #49  <Field float mScaleX>
		//   33   57:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   34   60:putfield        #49  <Field float mScaleX>
			mScaleY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleY", 4, mScaleY);
		//   35   63:aload_0         
		//   36   64:aload_1         
		//   37   65:aload_2         
		//   38   66:ldc1            #151 <String "scaleY">
		//   39   68:iconst_4        
		//   40   69:aload_0         
		//   41   70:getfield        #51  <Field float mScaleY>
		//   42   73:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   43   76:putfield        #51  <Field float mScaleY>
			mTranslateX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateX", 6, mTranslateX);
		//   44   79:aload_0         
		//   45   80:aload_1         
		//   46   81:aload_2         
		//   47   82:ldc1            #153 <String "translateX">
		//   48   84:bipush          6
		//   49   86:aload_0         
		//   50   87:getfield        #53  <Field float mTranslateX>
		//   51   90:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   52   93:putfield        #53  <Field float mTranslateX>
			mTranslateY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateY", 7, mTranslateY);
		//   53   96:aload_0         
		//   54   97:aload_1         
		//   55   98:aload_2         
		//   56   99:ldc1            #155 <String "translateY">
		//   57  101:bipush          7
		//   58  103:aload_0         
		//   59  104:getfield        #55  <Field float mTranslateY>
		//   60  107:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   61  110:putfield        #55  <Field float mTranslateY>
			typedarray = ((TypedArray) (typedarray.getString(0)));
		//   62  113:aload_1         
		//   63  114:iconst_0        
		//   64  115:invokevirtual   #159 <Method String TypedArray.getString(int)>
		//   65  118:astore_1        
			if(typedarray != null)
		//*  66  119:aload_1         
		//*  67  120:ifnull          128
				mGroupName = ((String) (typedarray));
		//   68  123:aload_0         
		//   69  124:aload_1         
		//   70  125:putfield        #59  <Field String mGroupName>
			updateLocalMatrix();
		//   71  128:aload_0         
		//   72  129:invokespecial   #161 <Method void updateLocalMatrix()>
		//   73  132:return          
		}

		public String getGroupName()
		{
			return mGroupName;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field String mGroupName>
		//    2    4:areturn         
		}

		public Matrix getLocalMatrix()
		{
			return mLocalMatrix;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Matrix mLocalMatrix>
		//    2    4:areturn         
		}

		public float getPivotX()
		{
			return mPivotX;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field float mPivotX>
		//    2    4:freturn         
		}

		public float getPivotY()
		{
			return mPivotY;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field float mPivotY>
		//    2    4:freturn         
		}

		public float getRotation()
		{
			return mRotate;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field float mRotate>
		//    2    4:freturn         
		}

		public float getScaleX()
		{
			return mScaleX;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field float mScaleX>
		//    2    4:freturn         
		}

		public float getScaleY()
		{
			return mScaleY;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field float mScaleY>
		//    2    4:freturn         
		}

		public float getTranslateX()
		{
			return mTranslateX;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field float mTranslateX>
		//    2    4:freturn         
		}

		public float getTranslateY()
		{
			return mTranslateY;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field float mTranslateY>
		//    2    4:freturn         
		}

		public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP)));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:aload_2         
		//    3    3:getstatic       #180 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP>
		//    4    6:invokestatic    #184 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//    5    9:astore_1        
			updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload           4
		//    9   14:invokespecial   #186 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			((TypedArray) (resources)).recycle();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #189 <Method void TypedArray.recycle()>
		//   12   21:return          
		}

		public void setPivotX(float f)
		{
			if(f != mPivotX)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #45  <Field float mPivotX>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mPivotX = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #45  <Field float mPivotX>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setPivotY(float f)
		{
			if(f != mPivotY)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #47  <Field float mPivotY>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mPivotY = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #47  <Field float mPivotY>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setRotation(float f)
		{
			if(f != mRotate)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #43  <Field float mRotate>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mRotate = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #43  <Field float mRotate>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setScaleX(float f)
		{
			if(f != mScaleX)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #49  <Field float mScaleX>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mScaleX = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #49  <Field float mScaleX>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setScaleY(float f)
		{
			if(f != mScaleY)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #51  <Field float mScaleY>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mScaleY = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #51  <Field float mScaleY>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setTranslateX(float f)
		{
			if(f != mTranslateX)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #53  <Field float mTranslateX>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mTranslateX = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #53  <Field float mTranslateX>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setTranslateY(float f)
		{
			if(f != mTranslateY)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #55  <Field float mTranslateY>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mTranslateY = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #55  <Field float mTranslateY>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		int mChangingConfigurations;
		final ArrayList mChildren;
		private String mGroupName;
		private final Matrix mLocalMatrix;
		private float mPivotX;
		private float mPivotY;
		float mRotate;
		private float mScaleX;
		private float mScaleY;
		private final Matrix mStackedMatrix;
		private int mThemeAttrs[];
		private float mTranslateX;
		private float mTranslateY;


/*
		static Matrix access$200(VGroup vgroup)
		{
			return vgroup.mStackedMatrix;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Matrix mStackedMatrix>
		//    2    4:areturn         
		}

*/


/*
		static Matrix access$300(VGroup vgroup)
		{
			return vgroup.mLocalMatrix;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Matrix mLocalMatrix>
		//    2    4:areturn         
		}

*/

		public VGroup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mStackedMatrix = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #33  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #34  <Method void Matrix()>
		//    6   12:putfield        #36  <Field Matrix mStackedMatrix>
			mChildren = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #38  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #39  <Method void ArrayList()>
		//   11   23:putfield        #41  <Field ArrayList mChildren>
			mRotate = 0.0F;
		//   12   26:aload_0         
		//   13   27:fconst_0        
		//   14   28:putfield        #43  <Field float mRotate>
			mPivotX = 0.0F;
		//   15   31:aload_0         
		//   16   32:fconst_0        
		//   17   33:putfield        #45  <Field float mPivotX>
			mPivotY = 0.0F;
		//   18   36:aload_0         
		//   19   37:fconst_0        
		//   20   38:putfield        #47  <Field float mPivotY>
			mScaleX = 1.0F;
		//   21   41:aload_0         
		//   22   42:fconst_1        
		//   23   43:putfield        #49  <Field float mScaleX>
			mScaleY = 1.0F;
		//   24   46:aload_0         
		//   25   47:fconst_1        
		//   26   48:putfield        #51  <Field float mScaleY>
			mTranslateX = 0.0F;
		//   27   51:aload_0         
		//   28   52:fconst_0        
		//   29   53:putfield        #53  <Field float mTranslateX>
			mTranslateY = 0.0F;
		//   30   56:aload_0         
		//   31   57:fconst_0        
		//   32   58:putfield        #55  <Field float mTranslateY>
			mLocalMatrix = new Matrix();
		//   33   61:aload_0         
		//   34   62:new             #33  <Class Matrix>
		//   35   65:dup             
		//   36   66:invokespecial   #34  <Method void Matrix()>
		//   37   69:putfield        #57  <Field Matrix mLocalMatrix>
			mGroupName = null;
		//   38   72:aload_0         
		//   39   73:aconst_null     
		//   40   74:putfield        #59  <Field String mGroupName>
		//   41   77:return          
		}

		public VGroup(VGroup vgroup, ArrayMap arraymap)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mStackedMatrix = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #33  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #34  <Method void Matrix()>
		//    6   12:putfield        #36  <Field Matrix mStackedMatrix>
			mChildren = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #38  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #39  <Method void ArrayList()>
		//   11   23:putfield        #41  <Field ArrayList mChildren>
			mRotate = 0.0F;
		//   12   26:aload_0         
		//   13   27:fconst_0        
		//   14   28:putfield        #43  <Field float mRotate>
			mPivotX = 0.0F;
		//   15   31:aload_0         
		//   16   32:fconst_0        
		//   17   33:putfield        #45  <Field float mPivotX>
			mPivotY = 0.0F;
		//   18   36:aload_0         
		//   19   37:fconst_0        
		//   20   38:putfield        #47  <Field float mPivotY>
			mScaleX = 1.0F;
		//   21   41:aload_0         
		//   22   42:fconst_1        
		//   23   43:putfield        #49  <Field float mScaleX>
			mScaleY = 1.0F;
		//   24   46:aload_0         
		//   25   47:fconst_1        
		//   26   48:putfield        #51  <Field float mScaleY>
			mTranslateX = 0.0F;
		//   27   51:aload_0         
		//   28   52:fconst_0        
		//   29   53:putfield        #53  <Field float mTranslateX>
			mTranslateY = 0.0F;
		//   30   56:aload_0         
		//   31   57:fconst_0        
		//   32   58:putfield        #55  <Field float mTranslateY>
			mLocalMatrix = new Matrix();
		//   33   61:aload_0         
		//   34   62:new             #33  <Class Matrix>
		//   35   65:dup             
		//   36   66:invokespecial   #34  <Method void Matrix()>
		//   37   69:putfield        #57  <Field Matrix mLocalMatrix>
			mGroupName = null;
		//   38   72:aload_0         
		//   39   73:aconst_null     
		//   40   74:putfield        #59  <Field String mGroupName>
			mRotate = vgroup.mRotate;
		//   41   77:aload_0         
		//   42   78:aload_1         
		//   43   79:getfield        #43  <Field float mRotate>
		//   44   82:putfield        #43  <Field float mRotate>
			mPivotX = vgroup.mPivotX;
		//   45   85:aload_0         
		//   46   86:aload_1         
		//   47   87:getfield        #45  <Field float mPivotX>
		//   48   90:putfield        #45  <Field float mPivotX>
			mPivotY = vgroup.mPivotY;
		//   49   93:aload_0         
		//   50   94:aload_1         
		//   51   95:getfield        #47  <Field float mPivotY>
		//   52   98:putfield        #47  <Field float mPivotY>
			mScaleX = vgroup.mScaleX;
		//   53  101:aload_0         
		//   54  102:aload_1         
		//   55  103:getfield        #49  <Field float mScaleX>
		//   56  106:putfield        #49  <Field float mScaleX>
			mScaleY = vgroup.mScaleY;
		//   57  109:aload_0         
		//   58  110:aload_1         
		//   59  111:getfield        #51  <Field float mScaleY>
		//   60  114:putfield        #51  <Field float mScaleY>
			mTranslateX = vgroup.mTranslateX;
		//   61  117:aload_0         
		//   62  118:aload_1         
		//   63  119:getfield        #53  <Field float mTranslateX>
		//   64  122:putfield        #53  <Field float mTranslateX>
			mTranslateY = vgroup.mTranslateY;
		//   65  125:aload_0         
		//   66  126:aload_1         
		//   67  127:getfield        #55  <Field float mTranslateY>
		//   68  130:putfield        #55  <Field float mTranslateY>
			mThemeAttrs = vgroup.mThemeAttrs;
		//   69  133:aload_0         
		//   70  134:aload_1         
		//   71  135:getfield        #63  <Field int[] mThemeAttrs>
		//   72  138:putfield        #63  <Field int[] mThemeAttrs>
			mGroupName = vgroup.mGroupName;
		//   73  141:aload_0         
		//   74  142:aload_1         
		//   75  143:getfield        #59  <Field String mGroupName>
		//   76  146:putfield        #59  <Field String mGroupName>
			mChangingConfigurations = vgroup.mChangingConfigurations;
		//   77  149:aload_0         
		//   78  150:aload_1         
		//   79  151:getfield        #65  <Field int mChangingConfigurations>
		//   80  154:putfield        #65  <Field int mChangingConfigurations>
			if(mGroupName != null)
		//*  81  157:aload_0         
		//*  82  158:getfield        #59  <Field String mGroupName>
		//*  83  161:ifnull          174
				arraymap.put(((Object) (mGroupName)), ((Object) (this)));
		//   84  164:aload_2         
		//   85  165:aload_0         
		//   86  166:getfield        #59  <Field String mGroupName>
		//   87  169:aload_0         
		//   88  170:invokevirtual   #71  <Method Object ArrayMap.put(Object, Object)>
		//   89  173:pop             
			mLocalMatrix.set(vgroup.mLocalMatrix);
		//   90  174:aload_0         
		//   91  175:getfield        #57  <Field Matrix mLocalMatrix>
		//   92  178:aload_1         
		//   93  179:getfield        #57  <Field Matrix mLocalMatrix>
		//   94  182:invokevirtual   #75  <Method void Matrix.set(Matrix)>
			ArrayList arraylist = vgroup.mChildren;
		//   95  185:aload_1         
		//   96  186:getfield        #41  <Field ArrayList mChildren>
		//   97  189:astore          4
			int i = 0;
		//   98  191:iconst_0        
		//   99  192:istore_3        
			do
			{
				if(i < arraylist.size())
		//* 100  193:iload_3         
		//* 101  194:aload           4
		//* 102  196:invokevirtual   #79  <Method int ArrayList.size()>
		//* 103  199:icmpge          325
				{
					vgroup = ((VGroup) (arraylist.get(i)));
		//  104  202:aload           4
		//  105  204:iload_3         
		//  106  205:invokevirtual   #83  <Method Object ArrayList.get(int)>
		//  107  208:astore_1        
					if(vgroup instanceof VGroup)
		//* 108  209:aload_1         
		//* 109  210:instanceof      #2   <Class VectorDrawableCompat$VGroup>
		//* 110  213:ifeq            245
					{
						vgroup = (VGroup)vgroup;
		//  111  216:aload_1         
		//  112  217:checkcast       #2   <Class VectorDrawableCompat$VGroup>
		//  113  220:astore_1        
						mChildren.add(((Object) (new VGroup(vgroup, arraymap))));
		//  114  221:aload_0         
		//  115  222:getfield        #41  <Field ArrayList mChildren>
		//  116  225:new             #2   <Class VectorDrawableCompat$VGroup>
		//  117  228:dup             
		//  118  229:aload_1         
		//  119  230:aload_2         
		//  120  231:invokespecial   #85  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
		//  121  234:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
		//  122  237:pop             
					} else
		//* 123  238:iload_3         
		//* 124  239:iconst_1        
		//* 125  240:iadd            
		//* 126  241:istore_3        
		//* 127  242:goto            193
					{
						if(vgroup instanceof VFullPath)
		//* 128  245:aload_1         
		//* 129  246:instanceof      #91  <Class VectorDrawableCompat$VFullPath>
		//* 130  249:ifeq            293
							vgroup = ((VGroup) (new VFullPath((VFullPath)vgroup)));
		//  131  252:new             #91  <Class VectorDrawableCompat$VFullPath>
		//  132  255:dup             
		//  133  256:aload_1         
		//  134  257:checkcast       #91  <Class VectorDrawableCompat$VFullPath>
		//  135  260:invokespecial   #94  <Method void VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath)>
		//  136  263:astore_1        
						else
		//* 137  264:aload_0         
		//* 138  265:getfield        #41  <Field ArrayList mChildren>
		//* 139  268:aload_1         
		//* 140  269:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
		//* 141  272:pop             
		//* 142  273:aload_1         
		//* 143  274:getfield        #99  <Field String VectorDrawableCompat$VPath.mPathName>
		//* 144  277:ifnull          238
		//* 145  280:aload_2         
		//* 146  281:aload_1         
		//* 147  282:getfield        #99  <Field String VectorDrawableCompat$VPath.mPathName>
		//* 148  285:aload_1         
		//* 149  286:invokevirtual   #71  <Method Object ArrayMap.put(Object, Object)>
		//* 150  289:pop             
		//* 151  290:goto            238
						if(vgroup instanceof VClipPath)
		//* 152  293:aload_1         
		//* 153  294:instanceof      #101 <Class VectorDrawableCompat$VClipPath>
		//* 154  297:ifeq            315
							vgroup = ((VGroup) (new VClipPath((VClipPath)vgroup)));
		//  155  300:new             #101 <Class VectorDrawableCompat$VClipPath>
		//  156  303:dup             
		//  157  304:aload_1         
		//  158  305:checkcast       #101 <Class VectorDrawableCompat$VClipPath>
		//  159  308:invokespecial   #104 <Method void VectorDrawableCompat$VClipPath(VectorDrawableCompat$VClipPath)>
		//  160  311:astore_1        
						else
		//* 161  312:goto            264
							throw new IllegalStateException("Unknown object in the tree!");
		//  162  315:new             #106 <Class IllegalStateException>
		//  163  318:dup             
		//  164  319:ldc1            #108 <String "Unknown object in the tree!">
		//  165  321:invokespecial   #111 <Method void IllegalStateException(String)>
		//  166  324:athrow          
						mChildren.add(((Object) (vgroup)));
						if(((VPath) (vgroup)).mPathName != null)
							arraymap.put(((Object) (((VPath) (vgroup)).mPathName)), ((Object) (vgroup)));
					}
				} else
				{
					return;
		//  167  325:return          
				}
				i++;
			} while(true);
		}
	}

	private static class VPath
	{

		public void applyTheme(android.content.res.Resources.Theme theme)
		{
		//    0    0:return          
		}

		public boolean canApplyTheme()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public android.support.v4.graphics.PathParser.PathDataNode[] getPathData()
		{
			return mNodes;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//    2    4:areturn         
		}

		public String getPathName()
		{
			return mPathName;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String mPathName>
		//    2    4:areturn         
		}

		public boolean isClipPath()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String nodesToString(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
		{
			String s = " ";
		//    0    0:ldc1            #44  <String " ">
		//    1    2:astore          4
			for(int i = 0; i < apathdatanode.length; i++)
		//*   2    4:iconst_0        
		//*   3    5:istore_2        
		//*   4    6:iload_2         
		//*   5    7:aload_1         
		//*   6    8:arraylength     
		//*   7    9:icmpge          103
			{
				s = (new StringBuilder()).append(s).append(apathdatanode[i].mType).append(":").toString();
		//    8   12:new             #46  <Class StringBuilder>
		//    9   15:dup             
		//   10   16:invokespecial   #47  <Method void StringBuilder()>
		//   11   19:aload           4
		//   12   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   13   24:aload_1         
		//   14   25:iload_2         
		//   15   26:aaload          
		//   16   27:getfield        #57  <Field char android.support.v4.graphics.PathParser$PathDataNode.mType>
		//   17   30:invokevirtual   #60  <Method StringBuilder StringBuilder.append(char)>
		//   18   33:ldc1            #62  <String ":">
		//   19   35:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   20   38:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   21   41:astore          4
				float af[] = apathdatanode[i].mParams;
		//   22   43:aload_1         
		//   23   44:iload_2         
		//   24   45:aaload          
		//   25   46:getfield        #69  <Field float[] android.support.v4.graphics.PathParser$PathDataNode.mParams>
		//   26   49:astore          5
				for(int j = 0; j < af.length; j++)
		//*  27   51:iconst_0        
		//*  28   52:istore_3        
		//*  29   53:iload_3         
		//*  30   54:aload           5
		//*  31   56:arraylength     
		//*  32   57:icmpge          96
					s = (new StringBuilder()).append(s).append(af[j]).append(",").toString();
		//   33   60:new             #46  <Class StringBuilder>
		//   34   63:dup             
		//   35   64:invokespecial   #47  <Method void StringBuilder()>
		//   36   67:aload           4
		//   37   69:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   38   72:aload           5
		//   39   74:iload_3         
		//   40   75:faload          
		//   41   76:invokevirtual   #72  <Method StringBuilder StringBuilder.append(float)>
		//   42   79:ldc1            #74  <String ",">
		//   43   81:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   44   84:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   45   87:astore          4

		//   46   89:iload_3         
		//   47   90:iconst_1        
		//   48   91:iadd            
		//   49   92:istore_3        
			}

		//   50   93:goto            53
		//   51   96:iload_2         
		//   52   97:iconst_1        
		//   53   98:iadd            
		//   54   99:istore_2        
		//*  55  100:goto            6
			return s;
		//   56  103:aload           4
		//   57  105:areturn         
		}

		public void printVPath(int i)
		{
			String s = "";
		//    0    0:ldc1            #78  <String "">
		//    1    2:astore_3        
			for(int j = 0; j < i; j++)
		//*   2    3:iconst_0        
		//*   3    4:istore_2        
		//*   4    5:iload_2         
		//*   5    6:iload_1         
		//*   6    7:icmpge          37
				s = (new StringBuilder()).append(s).append("    ").toString();
		//    7   10:new             #46  <Class StringBuilder>
		//    8   13:dup             
		//    9   14:invokespecial   #47  <Method void StringBuilder()>
		//   10   17:aload_3         
		//   11   18:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   12   21:ldc1            #80  <String "    ">
		//   13   23:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   14   26:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   15   29:astore_3        

		//   16   30:iload_2         
		//   17   31:iconst_1        
		//   18   32:iadd            
		//   19   33:istore_2        
		//*  20   34:goto            5
			Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("current path is :").append(mPathName).append(" pathData is ").append(nodesToString(mNodes)).toString());
		//   21   37:ldc1            #82  <String "VectorDrawableCompat">
		//   22   39:new             #46  <Class StringBuilder>
		//   23   42:dup             
		//   24   43:invokespecial   #47  <Method void StringBuilder()>
		//   25   46:aload_3         
		//   26   47:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   27   50:ldc1            #84  <String "current path is :">
		//   28   52:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   29   55:aload_0         
		//   30   56:getfield        #23  <Field String mPathName>
		//   31   59:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   32   62:ldc1            #86  <String " pathData is ">
		//   33   64:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   34   67:aload_0         
		//   35   68:aload_0         
		//   36   69:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   37   72:invokevirtual   #88  <Method String nodesToString(android.support.v4.graphics.PathParser$PathDataNode[])>
		//   38   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   39   78:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   40   81:invokestatic    #94  <Method int Log.v(String, String)>
		//   41   84:pop             
		//   42   85:return          
		}

		public void setPathData(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
		{
			if(!PathParser.canMorph(mNodes, apathdatanode))
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//*   2    4:aload_1         
		//*   3    5:invokestatic    #100 <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//*   4    8:ifne            20
			{
				mNodes = PathParser.deepCopyNodes(apathdatanode);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokestatic    #31  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
		//    8   16:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
				return;
		//    9   19:return          
			} else
			{
				PathParser.updateNodes(mNodes, apathdatanode);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   12   24:aload_1         
		//   13   25:invokestatic    #104 <Method void PathParser.updateNodes(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
				return;
		//   14   28:return          
			}
		}

		public void toPath(Path path)
		{
			path.reset();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #111 <Method void Path.reset()>
			if(mNodes != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//*   4    8:ifnull          19
				android.support.v4.graphics.PathParser.PathDataNode.nodesToPath(mNodes, path);
		//    5   11:aload_0         
		//    6   12:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//    7   15:aload_1         
		//    8   16:invokestatic    #115 <Method void android.support.v4.graphics.PathParser$PathDataNode.nodesToPath(android.support.v4.graphics.PathParser$PathDataNode[], Path)>
		//    9   19:return          
		}

		int mChangingConfigurations;
		protected android.support.v4.graphics.PathParser.PathDataNode mNodes[];
		String mPathName;

		public VPath()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mNodes = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//    5    9:return          
		}

		public VPath(VPath vpath)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mNodes = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
			mPathName = vpath.mPathName;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #23  <Field String mPathName>
		//    8   14:putfield        #23  <Field String mPathName>
			mChangingConfigurations = vpath.mChangingConfigurations;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #25  <Field int mChangingConfigurations>
		//   12   22:putfield        #25  <Field int mChangingConfigurations>
			mNodes = PathParser.deepCopyNodes(vpath.mNodes);
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   16   30:invokestatic    #31  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
		//   17   33:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   18   36:return          
		}
	}

	private static class VPathRenderer
	{

		private static float cross(float f, float f1, float f2, float f3)
		{
			return f * f3 - f1 * f2;
		//    0    0:fload_0         
		//    1    1:fload_3         
		//    2    2:fmul            
		//    3    3:fload_1         
		//    4    4:fload_2         
		//    5    5:fmul            
		//    6    6:fsub            
		//    7    7:freturn         
		}

		private void drawGroupTree(VGroup vgroup, Matrix matrix, Canvas canvas, int i, int j, ColorFilter colorfilter)
		{
			vgroup.mStackedMatrix.set(matrix);
		//    0    0:aload_1         
		//    1    1:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #110 <Method void Matrix.set(Matrix)>
			vgroup.mStackedMatrix.preConcat(vgroup.mLocalMatrix);
		//    4    8:aload_1         
		//    5    9:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
		//    6   12:aload_1         
		//    7   13:invokestatic    #113 <Method Matrix VectorDrawableCompat$VGroup.access$300(VectorDrawableCompat$VGroup)>
		//    8   16:invokevirtual   #117 <Method boolean Matrix.preConcat(Matrix)>
		//    9   19:pop             
			canvas.save();
		//   10   20:aload_3         
		//   11   21:invokevirtual   #123 <Method int Canvas.save()>
		//   12   24:pop             
			int k = 0;
		//   13   25:iconst_0        
		//   14   26:istore          7
			while(k < vgroup.mChildren.size()) 
		//*  15   28:iload           7
		//*  16   30:aload_1         
		//*  17   31:getfield        #127 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
		//*  18   34:invokevirtual   #132 <Method int ArrayList.size()>
		//*  19   37:icmpge          111
			{
				matrix = ((Matrix) (vgroup.mChildren.get(k)));
		//   20   40:aload_1         
		//   21   41:getfield        #127 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
		//   22   44:iload           7
		//   23   46:invokevirtual   #136 <Method Object ArrayList.get(int)>
		//   24   49:astore_2        
				if(matrix instanceof VGroup)
		//*  25   50:aload_2         
		//*  26   51:instanceof      #65  <Class VectorDrawableCompat$VGroup>
		//*  27   54:ifeq            85
					drawGroupTree((VGroup)matrix, vgroup.mStackedMatrix, canvas, i, j, colorfilter);
		//   28   57:aload_0         
		//   29   58:aload_2         
		//   30   59:checkcast       #65  <Class VectorDrawableCompat$VGroup>
		//   31   62:aload_1         
		//   32   63:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
		//   33   66:aload_3         
		//   34   67:iload           4
		//   35   69:iload           5
		//   36   71:aload           6
		//   37   73:invokespecial   #138 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
				else
		//*  38   76:iload           7
		//*  39   78:iconst_1        
		//*  40   79:iadd            
		//*  41   80:istore          7
		//*  42   82:goto            28
				if(matrix instanceof VPath)
		//*  43   85:aload_2         
		//*  44   86:instanceof      #140 <Class VectorDrawableCompat$VPath>
		//*  45   89:ifeq            76
					drawPath(vgroup, (VPath)matrix, canvas, i, j, colorfilter);
		//   46   92:aload_0         
		//   47   93:aload_1         
		//   48   94:aload_2         
		//   49   95:checkcast       #140 <Class VectorDrawableCompat$VPath>
		//   50   98:aload_3         
		//   51   99:iload           4
		//   52  101:iload           5
		//   53  103:aload           6
		//   54  105:invokespecial   #144 <Method void drawPath(VectorDrawableCompat$VGroup, VectorDrawableCompat$VPath, Canvas, int, int, ColorFilter)>
				k++;
			}
		//*  55  108:goto            76
			canvas.restore();
		//   56  111:aload_3         
		//   57  112:invokevirtual   #147 <Method void Canvas.restore()>
		//   58  115:return          
		}

		private void drawPath(VGroup vgroup, VPath vpath, Canvas canvas, int i, int j, ColorFilter colorfilter)
		{
			float f1 = (float)i / mViewportWidth;
		//    0    0:iload           4
		//    1    2:i2f             
		//    2    3:aload_0         
		//    3    4:getfield        #52  <Field float mViewportWidth>
		//    4    7:fdiv            
		//    5    8:fstore          8
			float f2 = (float)j / mViewportHeight;
		//    6   10:iload           5
		//    7   12:i2f             
		//    8   13:aload_0         
		//    9   14:getfield        #54  <Field float mViewportHeight>
		//   10   17:fdiv            
		//   11   18:fstore          9
			float f = Math.min(f1, f2);
		//   12   20:fload           8
		//   13   22:fload           9
		//   14   24:invokestatic    #153 <Method float Math.min(float, float)>
		//   15   27:fstore          7
			vgroup = ((VGroup) (vgroup.mStackedMatrix));
		//   16   29:aload_1         
		//   17   30:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
		//   18   33:astore_1        
			mFinalPathMatrix.set(((Matrix) (vgroup)));
		//   19   34:aload_0         
		//   20   35:getfield        #46  <Field Matrix mFinalPathMatrix>
		//   21   38:aload_1         
		//   22   39:invokevirtual   #110 <Method void Matrix.set(Matrix)>
			mFinalPathMatrix.postScale(f1, f2);
		//   23   42:aload_0         
		//   24   43:getfield        #46  <Field Matrix mFinalPathMatrix>
		//   25   46:fload           8
		//   26   48:fload           9
		//   27   50:invokevirtual   #157 <Method boolean Matrix.postScale(float, float)>
		//   28   53:pop             
			f1 = getMatrixScale(((Matrix) (vgroup)));
		//   29   54:aload_0         
		//   30   55:aload_1         
		//   31   56:invokespecial   #161 <Method float getMatrixScale(Matrix)>
		//   32   59:fstore          8
			if(f1 != 0.0F)
		//*  33   61:fload           8
		//*  34   63:fconst_0        
		//*  35   64:fcmpl           
		//*  36   65:ifne            69
		//*  37   68:return          
			{
				vpath.toPath(mPath);
		//   38   69:aload_2         
		//   39   70:aload_0         
		//   40   71:getfield        #73  <Field Path mPath>
		//   41   74:invokevirtual   #164 <Method void VectorDrawableCompat$VPath.toPath(Path)>
				vgroup = ((VGroup) (mPath));
		//   42   77:aload_0         
		//   43   78:getfield        #73  <Field Path mPath>
		//   44   81:astore_1        
				mRenderPath.reset();
		//   45   82:aload_0         
		//   46   83:getfield        #75  <Field Path mRenderPath>
		//   47   86:invokevirtual   #167 <Method void Path.reset()>
				if(vpath.isClipPath())
		//*  48   89:aload_2         
		//*  49   90:invokevirtual   #171 <Method boolean VectorDrawableCompat$VPath.isClipPath()>
		//*  50   93:ifeq            118
				{
					mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
		//   51   96:aload_0         
		//   52   97:getfield        #75  <Field Path mRenderPath>
		//   53  100:aload_1         
		//   54  101:aload_0         
		//   55  102:getfield        #46  <Field Matrix mFinalPathMatrix>
		//   56  105:invokevirtual   #175 <Method void Path.addPath(Path, Matrix)>
					canvas.clipPath(mRenderPath);
		//   57  108:aload_3         
		//   58  109:aload_0         
		//   59  110:getfield        #75  <Field Path mRenderPath>
		//   60  113:invokevirtual   #179 <Method boolean Canvas.clipPath(Path)>
		//   61  116:pop             
					return;
		//   62  117:return          
				}
				vpath = ((VPath) ((VFullPath)vpath));
		//   63  118:aload_2         
		//   64  119:checkcast       #181 <Class VectorDrawableCompat$VFullPath>
		//   65  122:astore_2        
				if(((VFullPath) (vpath)).mTrimPathStart != 0.0F || ((VFullPath) (vpath)).mTrimPathEnd != 1.0F)
		//*  66  123:aload_2         
		//*  67  124:getfield        #184 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
		//*  68  127:fconst_0        
		//*  69  128:fcmpl           
		//*  70  129:ifne            141
		//*  71  132:aload_2         
		//*  72  133:getfield        #187 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
		//*  73  136:fconst_1        
		//*  74  137:fcmpl           
		//*  75  138:ifeq            273
				{
					float f6 = ((VFullPath) (vpath)).mTrimPathStart;
		//   76  141:aload_2         
		//   77  142:getfield        #184 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
		//   78  145:fstore          12
					float f7 = ((VFullPath) (vpath)).mTrimPathOffset;
		//   79  147:aload_2         
		//   80  148:getfield        #190 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
		//   81  151:fstore          13
					float f4 = ((VFullPath) (vpath)).mTrimPathEnd;
		//   82  153:aload_2         
		//   83  154:getfield        #187 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
		//   84  157:fstore          10
					float f5 = ((VFullPath) (vpath)).mTrimPathOffset;
		//   85  159:aload_2         
		//   86  160:getfield        #190 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
		//   87  163:fstore          11
					if(mPathMeasure == null)
		//*  88  165:aload_0         
		//*  89  166:getfield        #192 <Field PathMeasure mPathMeasure>
		//*  90  169:ifnonnull       183
						mPathMeasure = new PathMeasure();
		//   91  172:aload_0         
		//   92  173:new             #194 <Class PathMeasure>
		//   93  176:dup             
		//   94  177:invokespecial   #195 <Method void PathMeasure()>
		//   95  180:putfield        #192 <Field PathMeasure mPathMeasure>
					mPathMeasure.setPath(mPath, false);
		//   96  183:aload_0         
		//   97  184:getfield        #192 <Field PathMeasure mPathMeasure>
		//   98  187:aload_0         
		//   99  188:getfield        #73  <Field Path mPath>
		//  100  191:iconst_0        
		//  101  192:invokevirtual   #199 <Method void PathMeasure.setPath(Path, boolean)>
					float f3 = mPathMeasure.getLength();
		//  102  195:aload_0         
		//  103  196:getfield        #192 <Field PathMeasure mPathMeasure>
		//  104  199:invokevirtual   #203 <Method float PathMeasure.getLength()>
		//  105  202:fstore          9
					f6 = ((f6 + f7) % 1.0F) * f3;
		//  106  204:fload           12
		//  107  206:fload           13
		//  108  208:fadd            
		//  109  209:fconst_1        
		//  110  210:frem            
		//  111  211:fload           9
		//  112  213:fmul            
		//  113  214:fstore          12
					f4 = ((f4 + f5) % 1.0F) * f3;
		//  114  216:fload           10
		//  115  218:fload           11
		//  116  220:fadd            
		//  117  221:fconst_1        
		//  118  222:frem            
		//  119  223:fload           9
		//  120  225:fmul            
		//  121  226:fstore          10
					((Path) (vgroup)).reset();
		//  122  228:aload_1         
		//  123  229:invokevirtual   #167 <Method void Path.reset()>
					Paint paint;
					Path path;
					if(f6 > f4)
		//* 124  232:fload           12
		//* 125  234:fload           10
		//* 126  236:fcmpl           
		//* 127  237:ifle            523
					{
						mPathMeasure.getSegment(f6, f3, ((Path) (vgroup)), true);
		//  128  240:aload_0         
		//  129  241:getfield        #192 <Field PathMeasure mPathMeasure>
		//  130  244:fload           12
		//  131  246:fload           9
		//  132  248:aload_1         
		//  133  249:iconst_1        
		//  134  250:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  135  253:pop             
						mPathMeasure.getSegment(0.0F, f4, ((Path) (vgroup)), true);
		//  136  254:aload_0         
		//  137  255:getfield        #192 <Field PathMeasure mPathMeasure>
		//  138  258:fconst_0        
		//  139  259:fload           10
		//  140  261:aload_1         
		//  141  262:iconst_1        
		//  142  263:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  143  266:pop             
					} else
		//* 144  267:aload_1         
		//* 145  268:fconst_0        
		//* 146  269:fconst_0        
		//* 147  270:invokevirtual   #211 <Method void Path.rLineTo(float, float)>
		//* 148  273:aload_0         
		//* 149  274:getfield        #75  <Field Path mRenderPath>
		//* 150  277:aload_1         
		//* 151  278:aload_0         
		//* 152  279:getfield        #46  <Field Matrix mFinalPathMatrix>
		//* 153  282:invokevirtual   #175 <Method void Path.addPath(Path, Matrix)>
		//* 154  285:aload_2         
		//* 155  286:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
		//* 156  289:ifeq            391
		//* 157  292:aload_0         
		//* 158  293:getfield        #92  <Field Paint mFillPaint>
		//* 159  296:ifnonnull       328
		//* 160  299:aload_0         
		//* 161  300:new             #216 <Class Paint>
		//* 162  303:dup             
		//* 163  304:invokespecial   #217 <Method void Paint()>
		//* 164  307:putfield        #92  <Field Paint mFillPaint>
		//* 165  310:aload_0         
		//* 166  311:getfield        #92  <Field Paint mFillPaint>
		//* 167  314:getstatic       #223 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
		//* 168  317:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		//* 169  320:aload_0         
		//* 170  321:getfield        #92  <Field Paint mFillPaint>
		//* 171  324:iconst_1        
		//* 172  325:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
		//* 173  328:aload_0         
		//* 174  329:getfield        #92  <Field Paint mFillPaint>
		//* 175  332:astore          14
		//* 176  334:aload           14
		//* 177  336:aload_2         
		//* 178  337:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
		//* 179  340:aload_2         
		//* 180  341:getfield        #234 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
		//* 181  344:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//* 182  347:invokevirtual   #242 <Method void Paint.setColor(int)>
		//* 183  350:aload           14
		//* 184  352:aload           6
		//* 185  354:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//* 186  357:pop             
		//* 187  358:aload_0         
		//* 188  359:getfield        #75  <Field Path mRenderPath>
		//* 189  362:astore          15
		//* 190  364:aload_2         
		//* 191  365:getfield        #249 <Field int VectorDrawableCompat$VFullPath.mFillRule>
		//* 192  368:ifne            540
		//* 193  371:getstatic       #255 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
		//* 194  374:astore_1        
		//* 195  375:aload           15
		//* 196  377:aload_1         
		//* 197  378:invokevirtual   #259 <Method void Path.setFillType(android.graphics.Path$FillType)>
		//* 198  381:aload_3         
		//* 199  382:aload_0         
		//* 200  383:getfield        #75  <Field Path mRenderPath>
		//* 201  386:aload           14
		//* 202  388:invokevirtual   #262 <Method void Canvas.drawPath(Path, Paint)>
		//* 203  391:aload_2         
		//* 204  392:getfield        #265 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
		//* 205  395:ifeq            68
		//* 206  398:aload_0         
		//* 207  399:getfield        #97  <Field Paint mStrokePaint>
		//* 208  402:ifnonnull       434
		//* 209  405:aload_0         
		//* 210  406:new             #216 <Class Paint>
		//* 211  409:dup             
		//* 212  410:invokespecial   #217 <Method void Paint()>
		//* 213  413:putfield        #97  <Field Paint mStrokePaint>
		//* 214  416:aload_0         
		//* 215  417:getfield        #97  <Field Paint mStrokePaint>
		//* 216  420:getstatic       #268 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
		//* 217  423:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		//* 218  426:aload_0         
		//* 219  427:getfield        #97  <Field Paint mStrokePaint>
		//* 220  430:iconst_1        
		//* 221  431:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
		//* 222  434:aload_0         
		//* 223  435:getfield        #97  <Field Paint mStrokePaint>
		//* 224  438:astore_1        
		//* 225  439:aload_2         
		//* 226  440:getfield        #272 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
		//* 227  443:ifnull          454
		//* 228  446:aload_1         
		//* 229  447:aload_2         
		//* 230  448:getfield        #272 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
		//* 231  451:invokevirtual   #276 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
		//* 232  454:aload_2         
		//* 233  455:getfield        #280 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
		//* 234  458:ifnull          469
		//* 235  461:aload_1         
		//* 236  462:aload_2         
		//* 237  463:getfield        #280 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
		//* 238  466:invokevirtual   #284 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
		//* 239  469:aload_1         
		//* 240  470:aload_2         
		//* 241  471:getfield        #287 <Field float VectorDrawableCompat$VFullPath.mStrokeMiterlimit>
		//* 242  474:invokevirtual   #291 <Method void Paint.setStrokeMiter(float)>
		//* 243  477:aload_1         
		//* 244  478:aload_2         
		//* 245  479:getfield        #265 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
		//* 246  482:aload_2         
		//* 247  483:getfield        #294 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
		//* 248  486:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//* 249  489:invokevirtual   #242 <Method void Paint.setColor(int)>
		//* 250  492:aload_1         
		//* 251  493:aload           6
		//* 252  495:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//* 253  498:pop             
		//* 254  499:aload_1         
		//* 255  500:aload_2         
		//* 256  501:getfield        #297 <Field float VectorDrawableCompat$VFullPath.mStrokeWidth>
		//* 257  504:fload           7
		//* 258  506:fload           8
		//* 259  508:fmul            
		//* 260  509:fmul            
		//* 261  510:invokevirtual   #300 <Method void Paint.setStrokeWidth(float)>
		//* 262  513:aload_3         
		//* 263  514:aload_0         
		//* 264  515:getfield        #75  <Field Path mRenderPath>
		//* 265  518:aload_1         
		//* 266  519:invokevirtual   #262 <Method void Canvas.drawPath(Path, Paint)>
		//* 267  522:return          
					{
						mPathMeasure.getSegment(f6, f4, ((Path) (vgroup)), true);
		//  268  523:aload_0         
		//  269  524:getfield        #192 <Field PathMeasure mPathMeasure>
		//  270  527:fload           12
		//  271  529:fload           10
		//  272  531:aload_1         
		//  273  532:iconst_1        
		//  274  533:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  275  536:pop             
					}
					((Path) (vgroup)).rLineTo(0.0F, 0.0F);
				}
				mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
				if(((VFullPath) (vpath)).mFillColor != 0)
				{
					if(mFillPaint == null)
					{
						mFillPaint = new Paint();
						mFillPaint.setStyle(android.graphics.Paint.Style.FILL);
						mFillPaint.setAntiAlias(true);
					}
					paint = mFillPaint;
					paint.setColor(VectorDrawableCompat.applyAlpha(((VFullPath) (vpath)).mFillColor, ((VFullPath) (vpath)).mFillAlpha));
					paint.setColorFilter(colorfilter);
					path = mRenderPath;
					if(((VFullPath) (vpath)).mFillRule == 0)
						vgroup = ((VGroup) (android.graphics.Path.FillType.WINDING));
					else
		//* 276  537:goto            267
						vgroup = ((VGroup) (android.graphics.Path.FillType.EVEN_ODD));
		//  277  540:getstatic       #303 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
		//  278  543:astore_1        
					path.setFillType(((android.graphics.Path.FillType) (vgroup)));
					canvas.drawPath(mRenderPath, paint);
				}
				if(((VFullPath) (vpath)).mStrokeColor != 0)
				{
					if(mStrokePaint == null)
					{
						mStrokePaint = new Paint();
						mStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
						mStrokePaint.setAntiAlias(true);
					}
					vgroup = ((VGroup) (mStrokePaint));
					if(((VFullPath) (vpath)).mStrokeLineJoin != null)
						((Paint) (vgroup)).setStrokeJoin(((VFullPath) (vpath)).mStrokeLineJoin);
					if(((VFullPath) (vpath)).mStrokeLineCap != null)
						((Paint) (vgroup)).setStrokeCap(((VFullPath) (vpath)).mStrokeLineCap);
					((Paint) (vgroup)).setStrokeMiter(((VFullPath) (vpath)).mStrokeMiterlimit);
					((Paint) (vgroup)).setColor(VectorDrawableCompat.applyAlpha(((VFullPath) (vpath)).mStrokeColor, ((VFullPath) (vpath)).mStrokeAlpha));
					((Paint) (vgroup)).setColorFilter(colorfilter);
					((Paint) (vgroup)).setStrokeWidth(((VFullPath) (vpath)).mStrokeWidth * (f * f1));
					canvas.drawPath(mRenderPath, ((Paint) (vgroup)));
					return;
				}
			}
		//* 279  544:goto            375
		}

		private float getMatrixScale(Matrix matrix)
		{
			float af[] = new float[4];
		//    0    0:iconst_4        
		//    1    1:newarray        float[]
		//    2    3:astore          5
			float[] _tmp = af;
		//    3    5:aload           5
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:fconst_0        
		//    7   10:fastore         
		//    8   11:dup             
		//    9   12:iconst_1        
		//   10   13:fconst_1        
		//   11   14:fastore         
		//   12   15:dup             
		//   13   16:iconst_2        
		//   14   17:fconst_1        
		//   15   18:fastore         
		//   16   19:dup             
		//   17   20:iconst_3        
		//   18   21:fconst_0        
		//   19   22:fastore         
		//   20   23:pop             
			af[0] = 0.0F;
			af[1] = 1.0F;
			af[2] = 1.0F;
			af[3] = 0.0F;
			matrix.mapVectors(af);
		//   21   24:aload_1         
		//   22   25:aload           5
		//   23   27:invokevirtual   #307 <Method void Matrix.mapVectors(float[])>
			float f = (float)Math.hypot(af[0], af[1]);
		//   24   30:aload           5
		//   25   32:iconst_0        
		//   26   33:faload          
		//   27   34:f2d             
		//   28   35:aload           5
		//   29   37:iconst_1        
		//   30   38:faload          
		//   31   39:f2d             
		//   32   40:invokestatic    #311 <Method double Math.hypot(double, double)>
		//   33   43:d2f             
		//   34   44:fstore_2        
			float f2 = (float)Math.hypot(af[2], af[3]);
		//   35   45:aload           5
		//   36   47:iconst_2        
		//   37   48:faload          
		//   38   49:f2d             
		//   39   50:aload           5
		//   40   52:iconst_3        
		//   41   53:faload          
		//   42   54:f2d             
		//   43   55:invokestatic    #311 <Method double Math.hypot(double, double)>
		//   44   58:d2f             
		//   45   59:fstore          4
			float f1 = cross(af[0], af[1], af[2], af[3]);
		//   46   61:aload           5
		//   47   63:iconst_0        
		//   48   64:faload          
		//   49   65:aload           5
		//   50   67:iconst_1        
		//   51   68:faload          
		//   52   69:aload           5
		//   53   71:iconst_2        
		//   54   72:faload          
		//   55   73:aload           5
		//   56   75:iconst_3        
		//   57   76:faload          
		//   58   77:invokestatic    #313 <Method float cross(float, float, float, float)>
		//   59   80:fstore_3        
			f2 = Math.max(f, f2);
		//   60   81:fload_2         
		//   61   82:fload           4
		//   62   84:invokestatic    #316 <Method float Math.max(float, float)>
		//   63   87:fstore          4
			f = 0.0F;
		//   64   89:fconst_0        
		//   65   90:fstore_2        
			if(f2 > 0.0F)
		//*  66   91:fload           4
		//*  67   93:fconst_0        
		//*  68   94:fcmpl           
		//*  69   95:ifle            106
				f = Math.abs(f1) / f2;
		//   70   98:fload_3         
		//   71   99:invokestatic    #320 <Method float Math.abs(float)>
		//   72  102:fload           4
		//   73  104:fdiv            
		//   74  105:fstore_2        
			return f;
		//   75  106:fload_2         
		//   76  107:freturn         
		}

		public void draw(Canvas canvas, int i, int j, ColorFilter colorfilter)
		{
			drawGroupTree(mRootGroup, IDENTITY_MATRIX, canvas, i, j, colorfilter);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
		//    3    5:getstatic       #42  <Field Matrix IDENTITY_MATRIX>
		//    4    8:aload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:aload           4
		//    8   13:invokespecial   #138 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
		//    9   16:return          
		}

		public float getAlpha()
		{
			return (float)getRootAlpha() / 255F;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #326 <Method int getRootAlpha()>
		//    2    4:i2f             
		//    3    5:ldc2            #327 <Float 255F>
		//    4    8:fdiv            
		//    5    9:freturn         
		}

		public int getRootAlpha()
		{
			return mRootAlpha;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field int mRootAlpha>
		//    2    4:ireturn         
		}

		public void setAlpha(float f)
		{
			setRootAlpha((int)(255F * f));
		//    0    0:aload_0         
		//    1    1:ldc2            #327 <Float 255F>
		//    2    4:fload_1         
		//    3    5:fmul            
		//    4    6:f2i             
		//    5    7:invokevirtual   #331 <Method void setRootAlpha(int)>
		//    6   10:return          
		}

		public void setRootAlpha(int i)
		{
			mRootAlpha = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #56  <Field int mRootAlpha>
		//    3    5:return          
		}

		private static final Matrix IDENTITY_MATRIX = new Matrix();
		float mBaseHeight;
		float mBaseWidth;
		private int mChangingConfigurations;
		private Paint mFillPaint;
		private final Matrix mFinalPathMatrix;
		private final Path mPath;
		private PathMeasure mPathMeasure;
		private final Path mRenderPath;
		int mRootAlpha;
		final VGroup mRootGroup;
		String mRootName;
		private Paint mStrokePaint;
		final ArrayMap mVGTargetsMap;
		float mViewportHeight;
		float mViewportWidth;

		static 
		{
		//    0    0:new             #37  <Class Matrix>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void Matrix()>
		//    3    7:putstatic       #42  <Field Matrix IDENTITY_MATRIX>
		//*   4   10:return          
		}


/*
		static Paint access$000(VPathRenderer vpathrenderer)
		{
			return vpathrenderer.mFillPaint;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field Paint mFillPaint>
		//    2    4:areturn         
		}

*/


/*
		static Paint access$002(VPathRenderer vpathrenderer, Paint paint)
		{
			vpathrenderer.mFillPaint = paint;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #92  <Field Paint mFillPaint>
			return paint;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Paint access$100(VPathRenderer vpathrenderer)
		{
			return vpathrenderer.mStrokePaint;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field Paint mStrokePaint>
		//    2    4:areturn         
		}

*/


/*
		static Paint access$102(VPathRenderer vpathrenderer, Paint paint)
		{
			vpathrenderer.mStrokePaint = paint;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #97  <Field Paint mStrokePaint>
			return paint;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		public VPathRenderer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
			mFinalPathMatrix = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #37  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #40  <Method void Matrix()>
		//    6   12:putfield        #46  <Field Matrix mFinalPathMatrix>
			mBaseWidth = 0.0F;
		//    7   15:aload_0         
		//    8   16:fconst_0        
		//    9   17:putfield        #48  <Field float mBaseWidth>
			mBaseHeight = 0.0F;
		//   10   20:aload_0         
		//   11   21:fconst_0        
		//   12   22:putfield        #50  <Field float mBaseHeight>
			mViewportWidth = 0.0F;
		//   13   25:aload_0         
		//   14   26:fconst_0        
		//   15   27:putfield        #52  <Field float mViewportWidth>
			mViewportHeight = 0.0F;
		//   16   30:aload_0         
		//   17   31:fconst_0        
		//   18   32:putfield        #54  <Field float mViewportHeight>
			mRootAlpha = 255;
		//   19   35:aload_0         
		//   20   36:sipush          255
		//   21   39:putfield        #56  <Field int mRootAlpha>
			mRootName = null;
		//   22   42:aload_0         
		//   23   43:aconst_null     
		//   24   44:putfield        #58  <Field String mRootName>
			mVGTargetsMap = new ArrayMap();
		//   25   47:aload_0         
		//   26   48:new             #60  <Class ArrayMap>
		//   27   51:dup             
		//   28   52:invokespecial   #61  <Method void ArrayMap()>
		//   29   55:putfield        #63  <Field ArrayMap mVGTargetsMap>
			mRootGroup = new VGroup();
		//   30   58:aload_0         
		//   31   59:new             #65  <Class VectorDrawableCompat$VGroup>
		//   32   62:dup             
		//   33   63:invokespecial   #66  <Method void VectorDrawableCompat$VGroup()>
		//   34   66:putfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
			mPath = new Path();
		//   35   69:aload_0         
		//   36   70:new             #70  <Class Path>
		//   37   73:dup             
		//   38   74:invokespecial   #71  <Method void Path()>
		//   39   77:putfield        #73  <Field Path mPath>
			mRenderPath = new Path();
		//   40   80:aload_0         
		//   41   81:new             #70  <Class Path>
		//   42   84:dup             
		//   43   85:invokespecial   #71  <Method void Path()>
		//   44   88:putfield        #75  <Field Path mRenderPath>
		//   45   91:return          
		}

		public VPathRenderer(VPathRenderer vpathrenderer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
			mFinalPathMatrix = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #37  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #40  <Method void Matrix()>
		//    6   12:putfield        #46  <Field Matrix mFinalPathMatrix>
			mBaseWidth = 0.0F;
		//    7   15:aload_0         
		//    8   16:fconst_0        
		//    9   17:putfield        #48  <Field float mBaseWidth>
			mBaseHeight = 0.0F;
		//   10   20:aload_0         
		//   11   21:fconst_0        
		//   12   22:putfield        #50  <Field float mBaseHeight>
			mViewportWidth = 0.0F;
		//   13   25:aload_0         
		//   14   26:fconst_0        
		//   15   27:putfield        #52  <Field float mViewportWidth>
			mViewportHeight = 0.0F;
		//   16   30:aload_0         
		//   17   31:fconst_0        
		//   18   32:putfield        #54  <Field float mViewportHeight>
			mRootAlpha = 255;
		//   19   35:aload_0         
		//   20   36:sipush          255
		//   21   39:putfield        #56  <Field int mRootAlpha>
			mRootName = null;
		//   22   42:aload_0         
		//   23   43:aconst_null     
		//   24   44:putfield        #58  <Field String mRootName>
			mVGTargetsMap = new ArrayMap();
		//   25   47:aload_0         
		//   26   48:new             #60  <Class ArrayMap>
		//   27   51:dup             
		//   28   52:invokespecial   #61  <Method void ArrayMap()>
		//   29   55:putfield        #63  <Field ArrayMap mVGTargetsMap>
			mRootGroup = new VGroup(vpathrenderer.mRootGroup, mVGTargetsMap);
		//   30   58:aload_0         
		//   31   59:new             #65  <Class VectorDrawableCompat$VGroup>
		//   32   62:dup             
		//   33   63:aload_1         
		//   34   64:getfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
		//   35   67:aload_0         
		//   36   68:getfield        #63  <Field ArrayMap mVGTargetsMap>
		//   37   71:invokespecial   #79  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
		//   38   74:putfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
			mPath = new Path(vpathrenderer.mPath);
		//   39   77:aload_0         
		//   40   78:new             #70  <Class Path>
		//   41   81:dup             
		//   42   82:aload_1         
		//   43   83:getfield        #73  <Field Path mPath>
		//   44   86:invokespecial   #82  <Method void Path(Path)>
		//   45   89:putfield        #73  <Field Path mPath>
			mRenderPath = new Path(vpathrenderer.mRenderPath);
		//   46   92:aload_0         
		//   47   93:new             #70  <Class Path>
		//   48   96:dup             
		//   49   97:aload_1         
		//   50   98:getfield        #75  <Field Path mRenderPath>
		//   51  101:invokespecial   #82  <Method void Path(Path)>
		//   52  104:putfield        #75  <Field Path mRenderPath>
			mBaseWidth = vpathrenderer.mBaseWidth;
		//   53  107:aload_0         
		//   54  108:aload_1         
		//   55  109:getfield        #48  <Field float mBaseWidth>
		//   56  112:putfield        #48  <Field float mBaseWidth>
			mBaseHeight = vpathrenderer.mBaseHeight;
		//   57  115:aload_0         
		//   58  116:aload_1         
		//   59  117:getfield        #50  <Field float mBaseHeight>
		//   60  120:putfield        #50  <Field float mBaseHeight>
			mViewportWidth = vpathrenderer.mViewportWidth;
		//   61  123:aload_0         
		//   62  124:aload_1         
		//   63  125:getfield        #52  <Field float mViewportWidth>
		//   64  128:putfield        #52  <Field float mViewportWidth>
			mViewportHeight = vpathrenderer.mViewportHeight;
		//   65  131:aload_0         
		//   66  132:aload_1         
		//   67  133:getfield        #54  <Field float mViewportHeight>
		//   68  136:putfield        #54  <Field float mViewportHeight>
			mChangingConfigurations = vpathrenderer.mChangingConfigurations;
		//   69  139:aload_0         
		//   70  140:aload_1         
		//   71  141:getfield        #84  <Field int mChangingConfigurations>
		//   72  144:putfield        #84  <Field int mChangingConfigurations>
			mRootAlpha = vpathrenderer.mRootAlpha;
		//   73  147:aload_0         
		//   74  148:aload_1         
		//   75  149:getfield        #56  <Field int mRootAlpha>
		//   76  152:putfield        #56  <Field int mRootAlpha>
			mRootName = vpathrenderer.mRootName;
		//   77  155:aload_0         
		//   78  156:aload_1         
		//   79  157:getfield        #58  <Field String mRootName>
		//   80  160:putfield        #58  <Field String mRootName>
			if(vpathrenderer.mRootName != null)
		//*  81  163:aload_1         
		//*  82  164:getfield        #58  <Field String mRootName>
		//*  83  167:ifnull          183
				mVGTargetsMap.put(((Object) (vpathrenderer.mRootName)), ((Object) (this)));
		//   84  170:aload_0         
		//   85  171:getfield        #63  <Field ArrayMap mVGTargetsMap>
		//   86  174:aload_1         
		//   87  175:getfield        #58  <Field String mRootName>
		//   88  178:aload_0         
		//   89  179:invokevirtual   #88  <Method Object ArrayMap.put(Object, Object)>
		//   90  182:pop             
		//   91  183:return          
		}
	}

	private static class VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState
	{

		public boolean canReuseBitmap(int i, int j)
		{
			return i == mCachedBitmap.getWidth() && j == mCachedBitmap.getHeight();
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #76  <Field Bitmap mCachedBitmap>
		//    3    5:invokevirtual   #82  <Method int Bitmap.getWidth()>
		//    4    8:icmpne          24
		//    5   11:iload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #76  <Field Bitmap mCachedBitmap>
		//    8   16:invokevirtual   #85  <Method int Bitmap.getHeight()>
		//    9   19:icmpne          24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		public boolean canReuseCache()
		{
			return !mCacheDirty && mCachedTint == mTint && mCachedTintMode == mTintMode && mCachedAutoMirrored == mAutoMirrored && mCachedRootAlpha == mVPathRenderer.getRootAlpha();
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field boolean mCacheDirty>
		//    2    4:ifne            56
		//    3    7:aload_0         
		//    4    8:getfield        #91  <Field ColorStateList mCachedTint>
		//    5   11:aload_0         
		//    6   12:getfield        #34  <Field ColorStateList mTint>
		//    7   15:if_acmpne       56
		//    8   18:aload_0         
		//    9   19:getfield        #93  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
		//   10   22:aload_0         
		//   11   23:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		//   12   26:if_acmpne       56
		//   13   29:aload_0         
		//   14   30:getfield        #95  <Field boolean mCachedAutoMirrored>
		//   15   33:aload_0         
		//   16   34:getfield        #72  <Field boolean mAutoMirrored>
		//   17   37:icmpne          56
		//   18   40:aload_0         
		//   19   41:getfield        #97  <Field int mCachedRootAlpha>
		//   20   44:aload_0         
		//   21   45:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   22   48:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//   23   51:icmpne          56
		//   24   54:iconst_1        
		//   25   55:ireturn         
		//   26   56:iconst_0        
		//   27   57:ireturn         
		}

		public void createCachedBitmapIfNeeded(int i, int j)
		{
			if(mCachedBitmap == null || !canReuseBitmap(i, j))
		//*   0    0:aload_0         
		//*   1    1:getfield        #76  <Field Bitmap mCachedBitmap>
		//*   2    4:ifnull          16
		//*   3    7:aload_0         
		//*   4    8:iload_1         
		//*   5    9:iload_2         
		//*   6   10:invokevirtual   #104 <Method boolean canReuseBitmap(int, int)>
		//*   7   13:ifne            33
			{
				mCachedBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:getstatic       #110 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
		//   12   22:invokestatic    #114 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   13   25:putfield        #76  <Field Bitmap mCachedBitmap>
				mCacheDirty = true;
		//   14   28:aload_0         
		//   15   29:iconst_1        
		//   16   30:putfield        #89  <Field boolean mCacheDirty>
			}
		//   17   33:return          
		}

		public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorfilter, Rect rect)
		{
			colorfilter = ((ColorFilter) (getPaint(colorfilter)));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #120 <Method Paint getPaint(ColorFilter)>
		//    3    5:astore_2        
			canvas.drawBitmap(mCachedBitmap, ((Rect) (null)), rect, ((Paint) (colorfilter)));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #76  <Field Bitmap mCachedBitmap>
		//    7   11:aconst_null     
		//    8   12:aload_3         
		//    9   13:aload_2         
		//   10   14:invokevirtual   #126 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
		//   11   17:return          
		}

		public int getChangingConfigurations()
		{
			return mChangingConfigurations;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field int mChangingConfigurations>
		//    2    4:ireturn         
		}

		public Paint getPaint(ColorFilter colorfilter)
		{
			if(!hasTranslucentRoot() && colorfilter == null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #130 <Method boolean hasTranslucentRoot()>
		//*   2    4:ifne            13
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       13
				return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
			if(mTempPaint == null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #132 <Field Paint mTempPaint>
		//*   9   17:ifnonnull       39
			{
				mTempPaint = new Paint();
		//   10   20:aload_0         
		//   11   21:new             #57  <Class Paint>
		//   12   24:dup             
		//   13   25:invokespecial   #133 <Method void Paint()>
		//   14   28:putfield        #132 <Field Paint mTempPaint>
				mTempPaint.setFilterBitmap(true);
		//   15   31:aload_0         
		//   16   32:getfield        #132 <Field Paint mTempPaint>
		//   17   35:iconst_1        
		//   18   36:invokevirtual   #137 <Method void Paint.setFilterBitmap(boolean)>
			}
			mTempPaint.setAlpha(mVPathRenderer.getRootAlpha());
		//   19   39:aload_0         
		//   20   40:getfield        #132 <Field Paint mTempPaint>
		//   21   43:aload_0         
		//   22   44:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   23   47:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//   24   50:invokevirtual   #141 <Method void Paint.setAlpha(int)>
			mTempPaint.setColorFilter(colorfilter);
		//   25   53:aload_0         
		//   26   54:getfield        #132 <Field Paint mTempPaint>
		//   27   57:aload_1         
		//   28   58:invokevirtual   #145 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//   29   61:pop             
			return mTempPaint;
		//   30   62:aload_0         
		//   31   63:getfield        #132 <Field Paint mTempPaint>
		//   32   66:areturn         
		}

		public boolean hasTranslucentRoot()
		{
			return mVPathRenderer.getRootAlpha() < 255;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//    2    4:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//    3    7:sipush          255
		//    4   10:icmpge          15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new VectorDrawableCompat(this)));
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #149 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
		//    4    8:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new VectorDrawableCompat(this)));
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #149 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
		//    4    8:areturn         
		}

		public void updateCacheStates()
		{
			mCachedTint = mTint;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #34  <Field ColorStateList mTint>
		//    3    5:putfield        #91  <Field ColorStateList mCachedTint>
			mCachedTintMode = mTintMode;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		//    7   13:putfield        #93  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
			mCachedRootAlpha = mVPathRenderer.getRootAlpha();
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   11   21:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//   12   24:putfield        #97  <Field int mCachedRootAlpha>
			mCachedAutoMirrored = mAutoMirrored;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #72  <Field boolean mAutoMirrored>
		//   16   32:putfield        #95  <Field boolean mCachedAutoMirrored>
			mCacheDirty = false;
		//   17   35:aload_0         
		//   18   36:iconst_0        
		//   19   37:putfield        #89  <Field boolean mCacheDirty>
		//   20   40:return          
		}

		public void updateCachedBitmap(int i, int j)
		{
			mCachedBitmap.eraseColor(0);
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field Bitmap mCachedBitmap>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #155 <Method void Bitmap.eraseColor(int)>
			Canvas canvas = new Canvas(mCachedBitmap);
		//    4    8:new             #122 <Class Canvas>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #76  <Field Bitmap mCachedBitmap>
		//    8   16:invokespecial   #158 <Method void Canvas(Bitmap)>
		//    9   19:astore_3        
			mVPathRenderer.draw(canvas, i, j, ((ColorFilter) (null)));
		//   10   20:aload_0         
		//   11   21:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   12   24:aload_3         
		//   13   25:iload_1         
		//   14   26:iload_2         
		//   15   27:aconst_null     
		//   16   28:invokevirtual   #162 <Method void VectorDrawableCompat$VPathRenderer.draw(Canvas, int, int, ColorFilter)>
		//   17   31:return          
		}

		boolean mAutoMirrored;
		boolean mCacheDirty;
		boolean mCachedAutoMirrored;
		Bitmap mCachedBitmap;
		int mCachedRootAlpha;
		int mCachedThemeAttrs[];
		ColorStateList mCachedTint;
		android.graphics.PorterDuff.Mode mCachedTintMode;
		int mChangingConfigurations;
		Paint mTempPaint;
		ColorStateList mTint;
		android.graphics.PorterDuff.Mode mTintMode;
		VPathRenderer mVPathRenderer;

		public VectorDrawableCompatState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mTint = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #34  <Field ColorStateList mTint>
			mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #37  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
		//    7   13:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
			mVPathRenderer = new VPathRenderer();
		//    8   16:aload_0         
		//    9   17:new             #41  <Class VectorDrawableCompat$VPathRenderer>
		//   10   20:dup             
		//   11   21:invokespecial   #42  <Method void VectorDrawableCompat$VPathRenderer()>
		//   12   24:putfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   13   27:return          
		}

		public VectorDrawableCompatState(VectorDrawableCompatState vectordrawablecompatstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mTint = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #34  <Field ColorStateList mTint>
			mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #37  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
		//    7   13:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
			if(vectordrawablecompatstate != null)
		//*   8   16:aload_1         
		//*   9   17:ifnull          131
			{
				mChangingConfigurations = vectordrawablecompatstate.mChangingConfigurations;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #48  <Field int mChangingConfigurations>
		//   13   25:putfield        #48  <Field int mChangingConfigurations>
				mVPathRenderer = new VPathRenderer(vectordrawablecompatstate.mVPathRenderer);
		//   14   28:aload_0         
		//   15   29:new             #41  <Class VectorDrawableCompat$VPathRenderer>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   19   37:invokespecial   #51  <Method void VectorDrawableCompat$VPathRenderer(VectorDrawableCompat$VPathRenderer)>
		//   20   40:putfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
				if(vectordrawablecompatstate.mVPathRenderer.mFillPaint != null)
		//*  21   43:aload_1         
		//*  22   44:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//*  23   47:invokestatic    #55  <Method Paint VectorDrawableCompat$VPathRenderer.access$000(VectorDrawableCompat$VPathRenderer)>
		//*  24   50:ifnull          75
					mVPathRenderer.mFillPaint = new Paint(vectordrawablecompatstate.mVPathRenderer.mFillPaint);
		//   25   53:aload_0         
		//   26   54:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   27   57:new             #57  <Class Paint>
		//   28   60:dup             
		//   29   61:aload_1         
		//   30   62:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   31   65:invokestatic    #55  <Method Paint VectorDrawableCompat$VPathRenderer.access$000(VectorDrawableCompat$VPathRenderer)>
		//   32   68:invokespecial   #60  <Method void Paint(Paint)>
		//   33   71:invokestatic    #64  <Method Paint VectorDrawableCompat$VPathRenderer.access$002(VectorDrawableCompat$VPathRenderer, Paint)>
		//   34   74:pop             
				if(vectordrawablecompatstate.mVPathRenderer.mStrokePaint != null)
		//*  35   75:aload_1         
		//*  36   76:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//*  37   79:invokestatic    #67  <Method Paint VectorDrawableCompat$VPathRenderer.access$100(VectorDrawableCompat$VPathRenderer)>
		//*  38   82:ifnull          107
					mVPathRenderer.mStrokePaint = new Paint(vectordrawablecompatstate.mVPathRenderer.mStrokePaint);
		//   39   85:aload_0         
		//   40   86:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   41   89:new             #57  <Class Paint>
		//   42   92:dup             
		//   43   93:aload_1         
		//   44   94:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   45   97:invokestatic    #67  <Method Paint VectorDrawableCompat$VPathRenderer.access$100(VectorDrawableCompat$VPathRenderer)>
		//   46  100:invokespecial   #60  <Method void Paint(Paint)>
		//   47  103:invokestatic    #70  <Method Paint VectorDrawableCompat$VPathRenderer.access$102(VectorDrawableCompat$VPathRenderer, Paint)>
		//   48  106:pop             
				mTint = vectordrawablecompatstate.mTint;
		//   49  107:aload_0         
		//   50  108:aload_1         
		//   51  109:getfield        #34  <Field ColorStateList mTint>
		//   52  112:putfield        #34  <Field ColorStateList mTint>
				mTintMode = vectordrawablecompatstate.mTintMode;
		//   53  115:aload_0         
		//   54  116:aload_1         
		//   55  117:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		//   56  120:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
				mAutoMirrored = vectordrawablecompatstate.mAutoMirrored;
		//   57  123:aload_0         
		//   58  124:aload_1         
		//   59  125:getfield        #72  <Field boolean mAutoMirrored>
		//   60  128:putfield        #72  <Field boolean mAutoMirrored>
			}
		//   61  131:return          
		}
	}

	private static class VectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState
	{

		public boolean canApplyTheme()
		{
			return mDelegateState.canApplyTheme();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    2    4:invokevirtual   #24  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
		//    3    7:ireturn         
		}

		public int getChangingConfigurations()
		{
			return mDelegateState.getChangingConfigurations();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    2    4:invokevirtual   #28  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//    3    7:ireturn         
		}

		public Drawable newDrawable()
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void VectorDrawableCompat()>
		//    3    7:astore_1        
			vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)mDelegateState.newDrawable()));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    7   13:invokevirtual   #33  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//    8   16:checkcast       #35  <Class VectorDrawable>
		//    9   19:putfield        #39  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
			return ((Drawable) (vectordrawablecompat));
		//   10   22:aload_1         
		//   11   23:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void VectorDrawableCompat()>
		//    3    7:astore_2        
			vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)mDelegateState.newDrawable(resources)));
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #42  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//    9   17:checkcast       #35  <Class VectorDrawable>
		//   10   20:putfield        #39  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
			return ((Drawable) (vectordrawablecompat));
		//   11   23:aload_2         
		//   12   24:areturn         
		}

		public Drawable newDrawable(Resources resources, android.content.res.Resources.Theme theme)
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void VectorDrawableCompat()>
		//    3    7:astore_3        
			vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)mDelegateState.newDrawable(resources, theme)));
		//    4    8:aload_3         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokevirtual   #45  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
		//   10   18:checkcast       #35  <Class VectorDrawable>
		//   11   21:putfield        #39  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
			return ((Drawable) (vectordrawablecompat));
		//   12   24:aload_3         
		//   13   25:areturn         
		}

		private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

		public VectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mDelegateState = constantstate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    5    9:return          
		}
	}


	VectorDrawableCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void VectorDrawableCommon()>
		mAllowCaching = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #88  <Field boolean mAllowCaching>
		mTmpFloats = new float[9];
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:newarray        float[]
	//    8   14:putfield        #90  <Field float[] mTmpFloats>
		mTmpMatrix = new Matrix();
	//    9   17:aload_0         
	//   10   18:new             #92  <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #93  <Method void Matrix()>
	//   13   25:putfield        #95  <Field Matrix mTmpMatrix>
		mTmpBounds = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #97  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #98  <Method void Rect()>
	//   18   36:putfield        #100 <Field Rect mTmpBounds>
		mVectorState = new VectorDrawableCompatState();
	//   19   39:aload_0         
	//   20   40:new             #21  <Class VectorDrawableCompat$VectorDrawableCompatState>
	//   21   43:dup             
	//   22   44:invokespecial   #101 <Method void VectorDrawableCompat$VectorDrawableCompatState()>
	//   23   47:putfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   24   50:return          
	}

	VectorDrawableCompat(VectorDrawableCompatState vectordrawablecompatstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void VectorDrawableCommon()>
		mAllowCaching = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #88  <Field boolean mAllowCaching>
		mTmpFloats = new float[9];
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:newarray        float[]
	//    8   14:putfield        #90  <Field float[] mTmpFloats>
		mTmpMatrix = new Matrix();
	//    9   17:aload_0         
	//   10   18:new             #92  <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #93  <Method void Matrix()>
	//   13   25:putfield        #95  <Field Matrix mTmpMatrix>
		mTmpBounds = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #97  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #98  <Method void Rect()>
	//   18   36:putfield        #100 <Field Rect mTmpBounds>
		mVectorState = vectordrawablecompatstate;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
		mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, vectordrawablecompatstate.mTintMode);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   26   50:aload_1         
	//   27   51:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   28   54:aload_1         
	//   29   55:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   30   58:invokevirtual   #118 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   31   61:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   32   64:return          
	}

	static int applyAlpha(int i, float f)
	{
		return i & 0xffffff | (int)((float)Color.alpha(i) * f) << 24;
	//    0    0:iload_0         
	//    1    1:ldc1            #122 <Int 0xffffff>
	//    2    3:iand            
	//    3    4:iload_0         
	//    4    5:invokestatic    #128 <Method int Color.alpha(int)>
	//    5    8:i2f             
	//    6    9:fload_1         
	//    7   10:fmul            
	//    8   11:f2i             
	//    9   12:bipush          24
	//   10   14:ishl            
	//   11   15:ior             
	//   12   16:ireturn         
	}

	public static VectorDrawableCompat create(Resources resources, int i, android.content.res.Resources.Theme theme)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          46
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    3    8:new             #2   <Class VectorDrawableCompat>
	//    4   11:dup             
	//    5   12:invokespecial   #142 <Method void VectorDrawableCompat()>
	//    6   15:astore_3        
			vectordrawablecompat.mDelegateDrawable = ResourcesCompat.getDrawable(resources, i, theme);
	//    7   16:aload_3         
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:aload_2         
	//   11   20:invokestatic    #148 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   12   23:putfield        #152 <Field Drawable mDelegateDrawable>
			vectordrawablecompat.mCachedConstantStateDelegate = ((android.graphics.drawable.Drawable.ConstantState) (new VectorDrawableDelegateState(vectordrawablecompat.mDelegateDrawable.getConstantState())));
	//   13   26:aload_3         
	//   14   27:new             #24  <Class VectorDrawableCompat$VectorDrawableDelegateState>
	//   15   30:dup             
	//   16   31:aload_3         
	//   17   32:getfield        #152 <Field Drawable mDelegateDrawable>
	//   18   35:invokevirtual   #158 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   19   38:invokespecial   #161 <Method void VectorDrawableCompat$VectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   20   41:putfield        #163 <Field android.graphics.drawable.Drawable$ConstantState mCachedConstantStateDelegate>
			return vectordrawablecompat;
	//   21   44:aload_3         
	//   22   45:areturn         
		}
		android.content.res.XmlResourceParser xmlresourceparser;
		AttributeSet attributeset;
		xmlresourceparser = resources.getXml(i);
	//   23   46:aload_0         
	//   24   47:iload_1         
	//   25   48:invokevirtual   #169 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   26   51:astore_3        
		attributeset = Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser)));
	//   27   52:aload_3         
	//   28   53:invokestatic    #175 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   29   56:astore          4
		do
			i = ((XmlPullParser) (xmlresourceparser)).next();
	//   30   58:aload_3         
	//   31   59:invokeinterface #181 <Method int XmlPullParser.next()>
	//   32   64:istore_1        
		while(i != 2 && i != 1);
	//   33   65:iload_1         
	//   34   66:iconst_2        
	//   35   67:icmpeq          75
	//   36   70:iload_1         
	//   37   71:iconst_1        
	//   38   72:icmpne          58
		if(i != 2)
	//*  39   75:iload_1         
	//*  40   76:iconst_2        
	//*  41   77:icmpeq          102
		{
			try
			{
				throw new XmlPullParserException("No start tag found");
	//   42   80:new             #134 <Class XmlPullParserException>
	//   43   83:dup             
	//   44   84:ldc1            #183 <String "No start tag found">
	//   45   86:invokespecial   #186 <Method void XmlPullParserException(String)>
	//   46   89:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  47   90:astore_0        
			{
				Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   48   91:ldc1            #43  <String "VectorDrawableCompat">
	//   49   93:ldc1            #188 <String "parser error">
	//   50   95:aload_0         
	//   51   96:invokestatic    #194 <Method int Log.e(String, String, Throwable)>
	//   52   99:pop             
			}
	//*  53  100:aconst_null     
	//*  54  101:areturn         
	//*  55  102:aload_0         
	//*  56  103:aload_3         
	//*  57  104:aload           4
	//*  58  106:aload_2         
	//*  59  107:invokestatic    #198 <Method VectorDrawableCompat createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//*  60  110:astore_0        
	//*  61  111:aload_0         
	//*  62  112:areturn         
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  63  113:astore_0        
			{
				Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   64  114:ldc1            #43  <String "VectorDrawableCompat">
	//   65  116:ldc1            #188 <String "parser error">
	//   66  118:aload_0         
	//   67  119:invokestatic    #194 <Method int Log.e(String, String, Throwable)>
	//   68  122:pop             
			}
			return null;
		}
		resources = ((Resources) (createFromXmlInner(resources, ((XmlPullParser) (xmlresourceparser)), attributeset, theme)));
		return ((VectorDrawableCompat) (resources));
	//*  69  123:goto            100
	}

	public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    0    0:new             #2   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void VectorDrawableCompat()>
	//    3    7:astore          4
		vectordrawablecompat.inflate(resources, xmlpullparser, attributeset, theme);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #203 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		return vectordrawablecompat;
	//   10   18:aload           4
	//   11   20:areturn         
	}

	private void inflateInternal(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    2    4:astore          9
		VPathRenderer vpathrenderer = vectordrawablecompatstate.mVPathRenderer;
	//    3    6:aload           9
	//    4    8:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//    5   11:astore          10
		boolean flag = true;
	//    6   13:iconst_1        
	//    7   14:istore          5
		Stack stack = new Stack();
	//    8   16:new             #211 <Class Stack>
	//    9   19:dup             
	//   10   20:invokespecial   #212 <Method void Stack()>
	//   11   23:astore          11
		stack.push(((Object) (vpathrenderer.mRootGroup)));
	//   12   25:aload           11
	//   13   27:aload           10
	//   14   29:getfield        #216 <Field VectorDrawableCompat$VGroup VectorDrawableCompat$VPathRenderer.mRootGroup>
	//   15   32:invokevirtual   #220 <Method Object Stack.push(Object)>
	//   16   35:pop             
		int i = xmlpullparser.getEventType();
	//   17   36:aload_2         
	//   18   37:invokeinterface #223 <Method int XmlPullParser.getEventType()>
	//   19   42:istore          7
		int j = xmlpullparser.getDepth();
	//   20   44:aload_2         
	//   21   45:invokeinterface #226 <Method int XmlPullParser.getDepth()>
	//   22   50:istore          8
		while(i != 1 && (xmlpullparser.getDepth() >= j + 1 || i != 3)) 
	//*  23   52:iload           7
	//*  24   54:iconst_1        
	//*  25   55:icmpeq          426
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #226 <Method int XmlPullParser.getDepth()>
	//*  28   64:iload           8
	//*  29   66:iconst_1        
	//*  30   67:iadd            
	//*  31   68:icmpge          77
	//*  32   71:iload           7
	//*  33   73:iconst_3        
	//*  34   74:icmpeq          426
		{
			boolean flag1;
			if(i == 2)
	//*  35   77:iload           7
	//*  36   79:iconst_2        
	//*  37   80:icmpne          385
			{
				Object obj = ((Object) (xmlpullparser.getName()));
	//   38   83:aload_2         
	//   39   84:invokeinterface #230 <Method String XmlPullParser.getName()>
	//   40   89:astore          13
				VGroup vgroup = (VGroup)stack.peek();
	//   41   91:aload           11
	//   42   93:invokevirtual   #234 <Method Object Stack.peek()>
	//   43   96:checkcast       #12  <Class VectorDrawableCompat$VGroup>
	//   44   99:astore          12
				if("path".equals(obj))
	//*  45  101:ldc1            #54  <String "path">
	//*  46  103:aload           13
	//*  47  105:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  48  108:ifeq            199
				{
					obj = ((Object) (new VFullPath()));
	//   49  111:new             #9   <Class VectorDrawableCompat$VFullPath>
	//   50  114:dup             
	//   51  115:invokespecial   #241 <Method void VectorDrawableCompat$VFullPath()>
	//   52  118:astore          13
					((VFullPath) (obj)).inflate(resources, attributeset, theme, xmlpullparser);
	//   53  120:aload           13
	//   54  122:aload_1         
	//   55  123:aload_3         
	//   56  124:aload           4
	//   57  126:aload_2         
	//   58  127:invokevirtual   #244 <Method void VectorDrawableCompat$VFullPath.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					vgroup.mChildren.add(obj);
	//   59  130:aload           12
	//   60  132:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   61  135:aload           13
	//   62  137:invokevirtual   #253 <Method boolean ArrayList.add(Object)>
	//   63  140:pop             
					if(((VFullPath) (obj)).getPathName() != null)
	//*  64  141:aload           13
	//*  65  143:invokevirtual   #256 <Method String VectorDrawableCompat$VFullPath.getPathName()>
	//*  66  146:ifnull          165
						vpathrenderer.mVGTargetsMap.put(((Object) (((VFullPath) (obj)).getPathName())), obj);
	//   67  149:aload           10
	//   68  151:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//   69  154:aload           13
	//   70  156:invokevirtual   #256 <Method String VectorDrawableCompat$VFullPath.getPathName()>
	//   71  159:aload           13
	//   72  161:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//   73  164:pop             
					flag1 = false;
	//   74  165:iconst_0        
	//   75  166:istore          6
					vectordrawablecompatstate.mChangingConfigurations = vectordrawablecompatstate.mChangingConfigurations | ((VFullPath) (obj)).mChangingConfigurations;
	//   76  168:aload           9
	//   77  170:aload           9
	//   78  172:getfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//   79  175:aload           13
	//   80  177:getfield        #270 <Field int VectorDrawableCompat$VFullPath.mChangingConfigurations>
	//   81  180:ior             
	//   82  181:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
				} else
	//*  83  184:aload_2         
	//*  84  185:invokeinterface #181 <Method int XmlPullParser.next()>
	//*  85  190:istore          7
	//*  86  192:iload           6
	//*  87  194:istore          5
	//*  88  196:goto            52
				if("clip-path".equals(obj))
	//*  89  199:ldc1            #48  <String "clip-path">
	//*  90  201:aload           13
	//*  91  203:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  92  206:ifeq            286
				{
					obj = ((Object) (new VClipPath()));
	//   93  209:new             #6   <Class VectorDrawableCompat$VClipPath>
	//   94  212:dup             
	//   95  213:invokespecial   #271 <Method void VectorDrawableCompat$VClipPath()>
	//   96  216:astore          13
					((VClipPath) (obj)).inflate(resources, attributeset, theme, xmlpullparser);
	//   97  218:aload           13
	//   98  220:aload_1         
	//   99  221:aload_3         
	//  100  222:aload           4
	//  101  224:aload_2         
	//  102  225:invokevirtual   #272 <Method void VectorDrawableCompat$VClipPath.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					vgroup.mChildren.add(obj);
	//  103  228:aload           12
	//  104  230:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//  105  233:aload           13
	//  106  235:invokevirtual   #253 <Method boolean ArrayList.add(Object)>
	//  107  238:pop             
					if(((VClipPath) (obj)).getPathName() != null)
	//* 108  239:aload           13
	//* 109  241:invokevirtual   #273 <Method String VectorDrawableCompat$VClipPath.getPathName()>
	//* 110  244:ifnull          263
						vpathrenderer.mVGTargetsMap.put(((Object) (((VClipPath) (obj)).getPathName())), obj);
	//  111  247:aload           10
	//  112  249:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  113  252:aload           13
	//  114  254:invokevirtual   #273 <Method String VectorDrawableCompat$VClipPath.getPathName()>
	//  115  257:aload           13
	//  116  259:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//  117  262:pop             
					vectordrawablecompatstate.mChangingConfigurations = vectordrawablecompatstate.mChangingConfigurations | ((VClipPath) (obj)).mChangingConfigurations;
	//  118  263:aload           9
	//  119  265:aload           9
	//  120  267:getfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//  121  270:aload           13
	//  122  272:getfield        #274 <Field int VectorDrawableCompat$VClipPath.mChangingConfigurations>
	//  123  275:ior             
	//  124  276:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
					flag1 = flag;
	//  125  279:iload           5
	//  126  281:istore          6
				} else
	//* 127  283:goto            184
				{
					flag1 = flag;
	//  128  286:iload           5
	//  129  288:istore          6
					if("group".equals(obj))
	//* 130  290:ldc1            #51  <String "group">
	//* 131  292:aload           13
	//* 132  294:invokevirtual   #240 <Method boolean String.equals(Object)>
	//* 133  297:ifeq            184
					{
						VGroup vgroup1 = new VGroup();
	//  134  300:new             #12  <Class VectorDrawableCompat$VGroup>
	//  135  303:dup             
	//  136  304:invokespecial   #275 <Method void VectorDrawableCompat$VGroup()>
	//  137  307:astore          13
						vgroup1.inflate(resources, attributeset, theme, xmlpullparser);
	//  138  309:aload           13
	//  139  311:aload_1         
	//  140  312:aload_3         
	//  141  313:aload           4
	//  142  315:aload_2         
	//  143  316:invokevirtual   #276 <Method void VectorDrawableCompat$VGroup.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
						vgroup.mChildren.add(((Object) (vgroup1)));
	//  144  319:aload           12
	//  145  321:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//  146  324:aload           13
	//  147  326:invokevirtual   #253 <Method boolean ArrayList.add(Object)>
	//  148  329:pop             
						stack.push(((Object) (vgroup1)));
	//  149  330:aload           11
	//  150  332:aload           13
	//  151  334:invokevirtual   #220 <Method Object Stack.push(Object)>
	//  152  337:pop             
						if(vgroup1.getGroupName() != null)
	//* 153  338:aload           13
	//* 154  340:invokevirtual   #279 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//* 155  343:ifnull          362
							vpathrenderer.mVGTargetsMap.put(((Object) (vgroup1.getGroupName())), ((Object) (vgroup1)));
	//  156  346:aload           10
	//  157  348:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  158  351:aload           13
	//  159  353:invokevirtual   #279 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//  160  356:aload           13
	//  161  358:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//  162  361:pop             
						vectordrawablecompatstate.mChangingConfigurations = vectordrawablecompatstate.mChangingConfigurations | vgroup1.mChangingConfigurations;
	//  163  362:aload           9
	//  164  364:aload           9
	//  165  366:getfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//  166  369:aload           13
	//  167  371:getfield        #280 <Field int VectorDrawableCompat$VGroup.mChangingConfigurations>
	//  168  374:ior             
	//  169  375:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
						flag1 = flag;
	//  170  378:iload           5
	//  171  380:istore          6
					}
				}
			} else
	//* 172  382:goto            184
			{
				flag1 = flag;
	//  173  385:iload           5
	//  174  387:istore          6
				if(i == 3)
	//* 175  389:iload           7
	//* 176  391:iconst_3        
	//* 177  392:icmpne          184
				{
					flag1 = flag;
	//  178  395:iload           5
	//  179  397:istore          6
					if("group".equals(((Object) (xmlpullparser.getName()))))
	//* 180  399:ldc1            #51  <String "group">
	//* 181  401:aload_2         
	//* 182  402:invokeinterface #230 <Method String XmlPullParser.getName()>
	//* 183  407:invokevirtual   #240 <Method boolean String.equals(Object)>
	//* 184  410:ifeq            184
					{
						stack.pop();
	//  185  413:aload           11
	//  186  415:invokevirtual   #283 <Method Object Stack.pop()>
	//  187  418:pop             
						flag1 = flag;
	//  188  419:iload           5
	//  189  421:istore          6
					}
				}
			}
			i = xmlpullparser.next();
			flag = flag1;
		}
	//* 190  423:goto            184
		if(flag)
	//* 191  426:iload           5
	//* 192  428:ifeq            495
		{
			resources = ((Resources) (new StringBuffer()));
	//  193  431:new             #285 <Class StringBuffer>
	//  194  434:dup             
	//  195  435:invokespecial   #286 <Method void StringBuffer()>
	//  196  438:astore_1        
			if(((StringBuffer) (resources)).length() > 0)
	//* 197  439:aload_1         
	//* 198  440:invokevirtual   #289 <Method int StringBuffer.length()>
	//* 199  443:ifle            454
				((StringBuffer) (resources)).append(" or ");
	//  200  446:aload_1         
	//  201  447:ldc2            #291 <String " or ">
	//  202  450:invokevirtual   #295 <Method StringBuffer StringBuffer.append(String)>
	//  203  453:pop             
			((StringBuffer) (resources)).append("path");
	//  204  454:aload_1         
	//  205  455:ldc1            #54  <String "path">
	//  206  457:invokevirtual   #295 <Method StringBuffer StringBuffer.append(String)>
	//  207  460:pop             
			throw new XmlPullParserException((new StringBuilder()).append("no ").append(((Object) (resources))).append(" defined").toString());
	//  208  461:new             #134 <Class XmlPullParserException>
	//  209  464:dup             
	//  210  465:new             #297 <Class StringBuilder>
	//  211  468:dup             
	//  212  469:invokespecial   #298 <Method void StringBuilder()>
	//  213  472:ldc2            #300 <String "no ">
	//  214  475:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  215  478:aload_1         
	//  216  479:invokevirtual   #306 <Method StringBuilder StringBuilder.append(Object)>
	//  217  482:ldc2            #308 <String " defined">
	//  218  485:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  219  488:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  220  491:invokespecial   #186 <Method void XmlPullParserException(String)>
	//  221  494:athrow          
		} else
		{
			return;
	//  222  495:return          
		}
	}

	private boolean needMirroring()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          27
			return isAutoMirrored() && DrawableCompat.getLayoutDirection(((Drawable) (this))) == 1;
	//    3    8:aload_0         
	//    4    9:invokevirtual   #316 <Method boolean isAutoMirrored()>
	//    5   12:ifeq            25
	//    6   15:aload_0         
	//    7   16:invokestatic    #322 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//    8   19:iconst_1        
	//    9   20:icmpne          25
	//   10   23:iconst_1        
	//   11   24:ireturn         
	//   12   25:iconst_0        
	//   13   26:ireturn         
		else
			return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
	}

	private static android.graphics.PorterDuff.Mode parseTintModeCompat(int i, android.graphics.PorterDuff.Mode mode)
	{
		i;
	//    0    0:iload_0         
		JVM INSTR tableswitch 3 16: default 72
	//	               3 74
	//	               4 72
	//	               5 78
	//	               6 72
	//	               7 72
	//	               8 72
	//	               9 82
	//	               10 72
	//	               11 72
	//	               12 72
	//	               13 72
	//	               14 86
	//	               15 90
	//	               16 94;
	//    1    1:tableswitch     3 16: default 72
	//	               3 74
	//	               4 72
	//	               5 78
	//	               6 72
	//	               7 72
	//	               8 72
	//	               9 82
	//	               10 72
	//	               11 72
	//	               12 72
	//	               13 72
	//	               14 86
	//	               15 90
	//	               16 94
		   goto _L1 _L2 _L1 _L3 _L1 _L1 _L1 _L4 _L1 _L1 _L1 _L1 _L5 _L6 _L7
_L1:
		return mode;
	//    2   72:aload_1         
	//    3   73:areturn         
_L2:
		return android.graphics.PorterDuff.Mode.SRC_OVER;
	//    4   74:getstatic       #327 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//    5   77:areturn         
_L3:
		return android.graphics.PorterDuff.Mode.SRC_IN;
	//    6   78:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    7   81:areturn         
_L4:
		return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//    8   82:getstatic       #330 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//    9   85:areturn         
_L5:
		return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   10   86:getstatic       #333 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   11   89:areturn         
_L6:
		return android.graphics.PorterDuff.Mode.SCREEN;
	//   12   90:getstatic       #336 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   13   93:areturn         
_L7:
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  14   94:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   97:bipush          11
	//*  16   99:icmplt          72
			return android.graphics.PorterDuff.Mode.ADD;
	//   17  102:getstatic       #339 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.ADD>
	//   18  105:areturn         
		if(true) goto _L1; else goto _L8
_L8:
	}

	private void printGroupTree(VGroup vgroup, int i)
	{
		String s = "";
	//    0    0:ldc2            #343 <String "">
	//    1    3:astore          4
		for(int j = 0; j < i; j++)
	//*   2    5:iconst_0        
	//*   3    6:istore_3        
	//*   4    7:iload_3         
	//*   5    8:iload_2         
	//*   6    9:icmpge          42
			s = (new StringBuilder()).append(s).append("    ").toString();
	//    7   12:new             #297 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #298 <Method void StringBuilder()>
	//   10   19:aload           4
	//   11   21:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:ldc2            #345 <String "    ">
	//   13   27:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   15   33:astore          4

	//   16   35:iload_3         
	//   17   36:iconst_1        
	//   18   37:iadd            
	//   19   38:istore_3        
	//*  20   39:goto            7
		Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("current group is :").append(vgroup.getGroupName()).append(" rotation is ").append(vgroup.mRotate).toString());
	//   21   42:ldc1            #43  <String "VectorDrawableCompat">
	//   22   44:new             #297 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #298 <Method void StringBuilder()>
	//   25   51:aload           4
	//   26   53:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:ldc2            #347 <String "current group is :">
	//   28   59:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:aload_1         
	//   30   63:invokevirtual   #279 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//   31   66:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:ldc2            #349 <String " rotation is ">
	//   33   72:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   34   75:aload_1         
	//   35   76:getfield        #353 <Field float VectorDrawableCompat$VGroup.mRotate>
	//   36   79:invokevirtual   #356 <Method StringBuilder StringBuilder.append(float)>
	//   37   82:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   38   85:invokestatic    #360 <Method int Log.v(String, String)>
	//   39   88:pop             
		Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("matrix is :").append(vgroup.getLocalMatrix().toString()).toString());
	//   40   89:ldc1            #43  <String "VectorDrawableCompat">
	//   41   91:new             #297 <Class StringBuilder>
	//   42   94:dup             
	//   43   95:invokespecial   #298 <Method void StringBuilder()>
	//   44   98:aload           4
	//   45  100:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   46  103:ldc2            #362 <String "matrix is :">
	//   47  106:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   48  109:aload_1         
	//   49  110:invokevirtual   #366 <Method Matrix VectorDrawableCompat$VGroup.getLocalMatrix()>
	//   50  113:invokevirtual   #367 <Method String Matrix.toString()>
	//   51  116:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   52  119:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   53  122:invokestatic    #360 <Method int Log.v(String, String)>
	//   54  125:pop             
		int k = 0;
	//   55  126:iconst_0        
	//   56  127:istore_3        
		while(k < vgroup.mChildren.size()) 
	//*  57  128:iload_3         
	//*  58  129:aload_1         
	//*  59  130:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//*  60  133:invokevirtual   #370 <Method int ArrayList.size()>
	//*  61  136:icmpge          190
		{
			Object obj = vgroup.mChildren.get(k);
	//   62  139:aload_1         
	//   63  140:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   64  143:iload_3         
	//   65  144:invokevirtual   #374 <Method Object ArrayList.get(int)>
	//   66  147:astore          4
			if(obj instanceof VGroup)
	//*  67  149:aload           4
	//*  68  151:instanceof      #12  <Class VectorDrawableCompat$VGroup>
	//*  69  154:ifeq            176
				printGroupTree((VGroup)obj, i + 1);
	//   70  157:aload_0         
	//   71  158:aload           4
	//   72  160:checkcast       #12  <Class VectorDrawableCompat$VGroup>
	//   73  163:iload_2         
	//   74  164:iconst_1        
	//   75  165:iadd            
	//   76  166:invokespecial   #376 <Method void printGroupTree(VectorDrawableCompat$VGroup, int)>
			else
	//*  77  169:iload_3         
	//*  78  170:iconst_1        
	//*  79  171:iadd            
	//*  80  172:istore_3        
	//*  81  173:goto            128
				((VPath)obj).printVPath(i + 1);
	//   82  176:aload           4
	//   83  178:checkcast       #15  <Class VectorDrawableCompat$VPath>
	//   84  181:iload_2         
	//   85  182:iconst_1        
	//   86  183:iadd            
	//   87  184:invokevirtual   #380 <Method void VectorDrawableCompat$VPath.printVPath(int)>
			k++;
		}
	//*  88  187:goto            169
	//   89  190:return          
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
		throws XmlPullParserException
	{
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    2    4:astore          4
		VPathRenderer vpathrenderer = vectordrawablecompatstate.mVPathRenderer;
	//    3    6:aload           4
	//    4    8:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//    5   11:astore_3        
		vectordrawablecompatstate.mTintMode = parseTintModeCompat(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
	//    6   12:aload           4
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:ldc2            #384 <String "tintMode">
	//   10   19:bipush          6
	//   11   21:iconst_m1       
	//   12   22:invokestatic    #390 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   13   25:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   14   28:invokestatic    #392 <Method android.graphics.PorterDuff$Mode parseTintModeCompat(int, android.graphics.PorterDuff$Mode)>
	//   15   31:putfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
		ColorStateList colorstatelist = typedarray.getColorStateList(1);
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #398 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   19   39:astore          5
		if(colorstatelist != null)
	//*  20   41:aload           5
	//*  21   43:ifnull          53
			vectordrawablecompatstate.mTint = colorstatelist;
	//   22   46:aload           4
	//   23   48:aload           5
	//   24   50:putfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
		vectordrawablecompatstate.mAutoMirrored = TypedArrayUtils.getNamedBoolean(typedarray, xmlpullparser, "autoMirrored", 5, vectordrawablecompatstate.mAutoMirrored);
	//   25   53:aload           4
	//   26   55:aload_1         
	//   27   56:aload_2         
	//   28   57:ldc2            #400 <String "autoMirrored">
	//   29   60:iconst_5        
	//   30   61:aload           4
	//   31   63:getfield        #403 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
	//   32   66:invokestatic    #407 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   33   69:putfield        #403 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
		vpathrenderer.mViewportWidth = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportWidth", 7, vpathrenderer.mViewportWidth);
	//   34   72:aload_3         
	//   35   73:aload_1         
	//   36   74:aload_2         
	//   37   75:ldc2            #409 <String "viewportWidth">
	//   38   78:bipush          7
	//   39   80:aload_3         
	//   40   81:getfield        #412 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//   41   84:invokestatic    #416 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   42   87:putfield        #412 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
		vpathrenderer.mViewportHeight = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportHeight", 8, vpathrenderer.mViewportHeight);
	//   43   90:aload_3         
	//   44   91:aload_1         
	//   45   92:aload_2         
	//   46   93:ldc2            #418 <String "viewportHeight">
	//   47   96:bipush          8
	//   48   98:aload_3         
	//   49   99:getfield        #421 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//   50  102:invokestatic    #416 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   51  105:putfield        #421 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
		if(vpathrenderer.mViewportWidth <= 0.0F)
	//*  52  108:aload_3         
	//*  53  109:getfield        #412 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//*  54  112:fconst_0        
	//*  55  113:fcmpg           
	//*  56  114:ifgt            148
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires viewportWidth > 0").toString());
	//   57  117:new             #134 <Class XmlPullParserException>
	//   58  120:dup             
	//   59  121:new             #297 <Class StringBuilder>
	//   60  124:dup             
	//   61  125:invokespecial   #298 <Method void StringBuilder()>
	//   62  128:aload_1         
	//   63  129:invokevirtual   #424 <Method String TypedArray.getPositionDescription()>
	//   64  132:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:ldc2            #426 <String "<vector> tag requires viewportWidth > 0">
	//   66  138:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   67  141:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   68  144:invokespecial   #186 <Method void XmlPullParserException(String)>
	//   69  147:athrow          
		if(vpathrenderer.mViewportHeight <= 0.0F)
	//*  70  148:aload_3         
	//*  71  149:getfield        #421 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//*  72  152:fconst_0        
	//*  73  153:fcmpg           
	//*  74  154:ifgt            188
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires viewportHeight > 0").toString());
	//   75  157:new             #134 <Class XmlPullParserException>
	//   76  160:dup             
	//   77  161:new             #297 <Class StringBuilder>
	//   78  164:dup             
	//   79  165:invokespecial   #298 <Method void StringBuilder()>
	//   80  168:aload_1         
	//   81  169:invokevirtual   #424 <Method String TypedArray.getPositionDescription()>
	//   82  172:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   83  175:ldc2            #428 <String "<vector> tag requires viewportHeight > 0">
	//   84  178:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   85  181:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   86  184:invokespecial   #186 <Method void XmlPullParserException(String)>
	//   87  187:athrow          
		vpathrenderer.mBaseWidth = typedarray.getDimension(3, vpathrenderer.mBaseWidth);
	//   88  188:aload_3         
	//   89  189:aload_1         
	//   90  190:iconst_3        
	//   91  191:aload_3         
	//   92  192:getfield        #431 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   93  195:invokevirtual   #435 <Method float TypedArray.getDimension(int, float)>
	//   94  198:putfield        #431 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
		vpathrenderer.mBaseHeight = typedarray.getDimension(2, vpathrenderer.mBaseHeight);
	//   95  201:aload_3         
	//   96  202:aload_1         
	//   97  203:iconst_2        
	//   98  204:aload_3         
	//   99  205:getfield        #438 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//  100  208:invokevirtual   #435 <Method float TypedArray.getDimension(int, float)>
	//  101  211:putfield        #438 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
		if(vpathrenderer.mBaseWidth <= 0.0F)
	//* 102  214:aload_3         
	//* 103  215:getfield        #431 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//* 104  218:fconst_0        
	//* 105  219:fcmpg           
	//* 106  220:ifgt            254
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires width > 0").toString());
	//  107  223:new             #134 <Class XmlPullParserException>
	//  108  226:dup             
	//  109  227:new             #297 <Class StringBuilder>
	//  110  230:dup             
	//  111  231:invokespecial   #298 <Method void StringBuilder()>
	//  112  234:aload_1         
	//  113  235:invokevirtual   #424 <Method String TypedArray.getPositionDescription()>
	//  114  238:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  115  241:ldc2            #440 <String "<vector> tag requires width > 0">
	//  116  244:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  117  247:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  118  250:invokespecial   #186 <Method void XmlPullParserException(String)>
	//  119  253:athrow          
		if(vpathrenderer.mBaseHeight <= 0.0F)
	//* 120  254:aload_3         
	//* 121  255:getfield        #438 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//* 122  258:fconst_0        
	//* 123  259:fcmpg           
	//* 124  260:ifgt            294
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires height > 0").toString());
	//  125  263:new             #134 <Class XmlPullParserException>
	//  126  266:dup             
	//  127  267:new             #297 <Class StringBuilder>
	//  128  270:dup             
	//  129  271:invokespecial   #298 <Method void StringBuilder()>
	//  130  274:aload_1         
	//  131  275:invokevirtual   #424 <Method String TypedArray.getPositionDescription()>
	//  132  278:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  133  281:ldc2            #442 <String "<vector> tag requires height > 0">
	//  134  284:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  135  287:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  136  290:invokespecial   #186 <Method void XmlPullParserException(String)>
	//  137  293:athrow          
		vpathrenderer.setAlpha(TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "alpha", 4, vpathrenderer.getAlpha()));
	//  138  294:aload_3         
	//  139  295:aload_1         
	//  140  296:aload_2         
	//  141  297:ldc2            #443 <String "alpha">
	//  142  300:iconst_4        
	//  143  301:aload_3         
	//  144  302:invokevirtual   #447 <Method float VectorDrawableCompat$VPathRenderer.getAlpha()>
	//  145  305:invokestatic    #416 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  146  308:invokevirtual   #451 <Method void VectorDrawableCompat$VPathRenderer.setAlpha(float)>
		typedarray = ((TypedArray) (typedarray.getString(0)));
	//  147  311:aload_1         
	//  148  312:iconst_0        
	//  149  313:invokevirtual   #455 <Method String TypedArray.getString(int)>
	//  150  316:astore_1        
		if(typedarray != null)
	//* 151  317:aload_1         
	//* 152  318:ifnull          336
		{
			vpathrenderer.mRootName = ((String) (typedarray));
	//  153  321:aload_3         
	//  154  322:aload_1         
	//  155  323:putfield        #458 <Field String VectorDrawableCompat$VPathRenderer.mRootName>
			vpathrenderer.mVGTargetsMap.put(((Object) (typedarray)), ((Object) (vpathrenderer)));
	//  156  326:aload_3         
	//  157  327:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  158  330:aload_1         
	//  159  331:aload_3         
	//  160  332:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//  161  335:pop             
		}
	//  162  336:return          
	}

	public volatile void applyTheme(android.content.res.Resources.Theme theme)
	{
		super.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #462 <Method void VectorDrawableCommon.applyTheme(android.content.res.Resources$Theme)>
	//    3    5:return          
	}

	public boolean canApplyTheme()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			DrawableCompat.canApplyTheme(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #466 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
	//    6   14:pop             
		return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #469 <Method void VectorDrawableCommon.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//    2    4:ifnull          16
_L1:
		mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #473 <Method void Drawable.draw(Canvas)>
_L4:
		return;
	//    7   15:return          
_L2:
		copyBounds(mTmpBounds);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #100 <Field Rect mTmpBounds>
	//   11   21:invokevirtual   #477 <Method void copyBounds(Rect)>
		if(mTmpBounds.width() <= 0 || mTmpBounds.height() <= 0) goto _L4; else goto _L3
	//   12   24:aload_0         
	//   13   25:getfield        #100 <Field Rect mTmpBounds>
	//   14   28:invokevirtual   #480 <Method int Rect.width()>
	//   15   31:ifle            15
	//   16   34:aload_0         
	//   17   35:getfield        #100 <Field Rect mTmpBounds>
	//   18   38:invokevirtual   #483 <Method int Rect.height()>
	//   19   41:ifle            15
_L3:
		int i;
		int j;
		float f;
		float f1;
		float f2;
		float f3;
		int k;
		Object obj;
		if(mColorFilter == null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #485 <Field ColorFilter mColorFilter>
	//*  22   48:ifnonnull       305
			obj = ((Object) (mTintFilter));
	//   23   51:aload_0         
	//   24   52:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   25   55:astore          9
		else
	//*  26   57:aload_1         
	//*  27   58:aload_0         
	//*  28   59:getfield        #95  <Field Matrix mTmpMatrix>
	//*  29   62:invokevirtual   #491 <Method void Canvas.getMatrix(Matrix)>
	//*  30   65:aload_0         
	//*  31   66:getfield        #95  <Field Matrix mTmpMatrix>
	//*  32   69:aload_0         
	//*  33   70:getfield        #90  <Field float[] mTmpFloats>
	//*  34   73:invokevirtual   #495 <Method void Matrix.getValues(float[])>
	//*  35   76:aload_0         
	//*  36   77:getfield        #90  <Field float[] mTmpFloats>
	//*  37   80:iconst_0        
	//*  38   81:faload          
	//*  39   82:invokestatic    #501 <Method float Math.abs(float)>
	//*  40   85:fstore_2        
	//*  41   86:aload_0         
	//*  42   87:getfield        #90  <Field float[] mTmpFloats>
	//*  43   90:iconst_4        
	//*  44   91:faload          
	//*  45   92:invokestatic    #501 <Method float Math.abs(float)>
	//*  46   95:fstore_3        
	//*  47   96:aload_0         
	//*  48   97:getfield        #90  <Field float[] mTmpFloats>
	//*  49  100:iconst_1        
	//*  50  101:faload          
	//*  51  102:invokestatic    #501 <Method float Math.abs(float)>
	//*  52  105:fstore          5
	//*  53  107:aload_0         
	//*  54  108:getfield        #90  <Field float[] mTmpFloats>
	//*  55  111:iconst_3        
	//*  56  112:faload          
	//*  57  113:invokestatic    #501 <Method float Math.abs(float)>
	//*  58  116:fstore          4
	//*  59  118:fload           5
	//*  60  120:fconst_0        
	//*  61  121:fcmpl           
	//*  62  122:ifne            132
	//*  63  125:fload           4
	//*  64  127:fconst_0        
	//*  65  128:fcmpl           
	//*  66  129:ifeq            136
	//*  67  132:fconst_1        
	//*  68  133:fstore_2        
	//*  69  134:fconst_1        
	//*  70  135:fstore_3        
	//*  71  136:aload_0         
	//*  72  137:getfield        #100 <Field Rect mTmpBounds>
	//*  73  140:invokevirtual   #480 <Method int Rect.width()>
	//*  74  143:i2f             
	//*  75  144:fload_2         
	//*  76  145:fmul            
	//*  77  146:f2i             
	//*  78  147:istore          6
	//*  79  149:aload_0         
	//*  80  150:getfield        #100 <Field Rect mTmpBounds>
	//*  81  153:invokevirtual   #483 <Method int Rect.height()>
	//*  82  156:i2f             
	//*  83  157:fload_3         
	//*  84  158:fmul            
	//*  85  159:f2i             
	//*  86  160:istore          7
	//*  87  162:sipush          2048
	//*  88  165:iload           6
	//*  89  167:invokestatic    #505 <Method int Math.min(int, int)>
	//*  90  170:istore          6
	//*  91  172:sipush          2048
	//*  92  175:iload           7
	//*  93  177:invokestatic    #505 <Method int Math.min(int, int)>
	//*  94  180:istore          7
	//*  95  182:iload           6
	//*  96  184:ifle            15
	//*  97  187:iload           7
	//*  98  189:ifle            15
	//*  99  192:aload_1         
	//* 100  193:invokevirtual   #508 <Method int Canvas.save()>
	//* 101  196:istore          8
	//* 102  198:aload_1         
	//* 103  199:aload_0         
	//* 104  200:getfield        #100 <Field Rect mTmpBounds>
	//* 105  203:getfield        #511 <Field int Rect.left>
	//* 106  206:i2f             
	//* 107  207:aload_0         
	//* 108  208:getfield        #100 <Field Rect mTmpBounds>
	//* 109  211:getfield        #514 <Field int Rect.top>
	//* 110  214:i2f             
	//* 111  215:invokevirtual   #518 <Method void Canvas.translate(float, float)>
	//* 112  218:aload_0         
	//* 113  219:invokespecial   #520 <Method boolean needMirroring()>
	//* 114  222:ifeq            246
	//* 115  225:aload_1         
	//* 116  226:aload_0         
	//* 117  227:getfield        #100 <Field Rect mTmpBounds>
	//* 118  230:invokevirtual   #480 <Method int Rect.width()>
	//* 119  233:i2f             
	//* 120  234:fconst_0        
	//* 121  235:invokevirtual   #518 <Method void Canvas.translate(float, float)>
	//* 122  238:aload_1         
	//* 123  239:ldc2            #521 <Float -1F>
	//* 124  242:fconst_1        
	//* 125  243:invokevirtual   #524 <Method void Canvas.scale(float, float)>
	//* 126  246:aload_0         
	//* 127  247:getfield        #100 <Field Rect mTmpBounds>
	//* 128  250:iconst_0        
	//* 129  251:iconst_0        
	//* 130  252:invokevirtual   #528 <Method void Rect.offsetTo(int, int)>
	//* 131  255:aload_0         
	//* 132  256:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//* 133  259:iload           6
	//* 134  261:iload           7
	//* 135  263:invokevirtual   #531 <Method void VectorDrawableCompat$VectorDrawableCompatState.createCachedBitmapIfNeeded(int, int)>
	//* 136  266:aload_0         
	//* 137  267:getfield        #88  <Field boolean mAllowCaching>
	//* 138  270:ifne            314
	//* 139  273:aload_0         
	//* 140  274:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//* 141  277:iload           6
	//* 142  279:iload           7
	//* 143  281:invokevirtual   #534 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCachedBitmap(int, int)>
	//* 144  284:aload_0         
	//* 145  285:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//* 146  288:aload_1         
	//* 147  289:aload           9
	//* 148  291:aload_0         
	//* 149  292:getfield        #100 <Field Rect mTmpBounds>
	//* 150  295:invokevirtual   #538 <Method void VectorDrawableCompat$VectorDrawableCompatState.drawCachedBitmapWithRootAlpha(Canvas, ColorFilter, Rect)>
	//* 151  298:aload_1         
	//* 152  299:iload           8
	//* 153  301:invokevirtual   #541 <Method void Canvas.restoreToCount(int)>
	//* 154  304:return          
			obj = ((Object) (mColorFilter));
	//  155  305:aload_0         
	//  156  306:getfield        #485 <Field ColorFilter mColorFilter>
	//  157  309:astore          9
		canvas.getMatrix(mTmpMatrix);
		mTmpMatrix.getValues(mTmpFloats);
		f = Math.abs(mTmpFloats[0]);
		f1 = Math.abs(mTmpFloats[4]);
		f3 = Math.abs(mTmpFloats[1]);
		f2 = Math.abs(mTmpFloats[3]);
		if(f3 != 0.0F || f2 != 0.0F)
		{
			f = 1.0F;
			f1 = 1.0F;
		}
		i = (int)((float)mTmpBounds.width() * f);
		j = (int)((float)mTmpBounds.height() * f1);
		i = Math.min(2048, i);
		j = Math.min(2048, j);
		if(i <= 0 || j <= 0) goto _L4; else goto _L5
_L5:
		k = canvas.save();
		canvas.translate(mTmpBounds.left, mTmpBounds.top);
		if(needMirroring())
		{
			canvas.translate(mTmpBounds.width(), 0.0F);
			canvas.scale(-1F, 1.0F);
		}
		mTmpBounds.offsetTo(0, 0);
		mVectorState.createCachedBitmapIfNeeded(i, j);
		if(mAllowCaching) goto _L7; else goto _L6
_L6:
		mVectorState.updateCachedBitmap(i, j);
_L9:
		mVectorState.drawCachedBitmapWithRootAlpha(canvas, ((ColorFilter) (obj)), mTmpBounds);
		canvas.restoreToCount(k);
		return;
	//* 158  311:goto            57
_L7:
		if(!mVectorState.canReuseCache())
	//* 159  314:aload_0         
	//* 160  315:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//* 161  318:invokevirtual   #544 <Method boolean VectorDrawableCompat$VectorDrawableCompatState.canReuseCache()>
	//* 162  321:ifne            284
		{
			mVectorState.updateCachedBitmap(i, j);
	//  163  324:aload_0         
	//  164  325:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  165  328:iload           6
	//  166  330:iload           7
	//  167  332:invokevirtual   #534 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCachedBitmap(int, int)>
			mVectorState.updateCacheStates();
	//  168  335:aload_0         
	//  169  336:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  170  339:invokevirtual   #547 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCacheStates()>
		}
		if(true) goto _L9; else goto _L8
	//  171  342:goto            284
_L8:
	}

	public int getAlpha()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getAlpha(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #549 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.mVPathRenderer.getRootAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:invokevirtual   #552 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   11   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #555 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mVectorState.getChangingConfigurations();
	//    7   15:aload_0         
	//    8   16:invokespecial   #556 <Method int VectorDrawableCommon.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   11   23:invokevirtual   #557 <Method int VectorDrawableCompat$VectorDrawableCompatState.getChangingConfigurations()>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #561 <Method ColorFilter VectorDrawableCommon.getColorFilter()>
	//    2    4:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDelegateDrawable != null && android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          30
	//*   3    7:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          24
	//*   5   12:icmplt          30
		{
			return ((android.graphics.drawable.Drawable.ConstantState) (new VectorDrawableDelegateState(mDelegateDrawable.getConstantState())));
	//    6   15:new             #24  <Class VectorDrawableCompat$VectorDrawableDelegateState>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:getfield        #152 <Field Drawable mDelegateDrawable>
	//   10   23:invokevirtual   #158 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   11   26:invokespecial   #161 <Method void VectorDrawableCompat$VectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   12   29:areturn         
		} else
		{
			mVectorState.mChangingConfigurations = getChangingConfigurations();
	//   13   30:aload_0         
	//   14   31:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   15   34:aload_0         
	//   16   35:invokevirtual   #562 <Method int getChangingConfigurations()>
	//   17   38:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (mVectorState));
	//   18   41:aload_0         
	//   19   42:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   20   45:areturn         
		}
	}

	public volatile Drawable getCurrent()
	{
		return super.getCurrent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #566 <Method Drawable VectorDrawableCommon.getCurrent()>
	//    2    4:areturn         
	}

	public int getIntrinsicHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #569 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.mVPathRenderer.mBaseHeight;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:getfield        #438 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #572 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.mVPathRenderer.mBaseWidth;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:getfield        #431 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #575 <Method int VectorDrawableCommon.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #578 <Method int VectorDrawableCommon.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getOpacity();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #581 <Method int Drawable.getOpacity()>
	//    6   14:ireturn         
		else
			return -3;
	//    7   15:bipush          -3
	//    8   17:ireturn         
	}

	public volatile boolean getPadding(Rect rect)
	{
		return super.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #585 <Method boolean VectorDrawableCommon.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public float getPixelSize()
	{
		if(mVectorState == null || mVectorState.mVPathRenderer == null || mVectorState.mVPathRenderer.mBaseWidth == 0.0F || mVectorState.mVPathRenderer.mBaseHeight == 0.0F || mVectorState.mVPathRenderer.mViewportHeight == 0.0F || mVectorState.mVPathRenderer.mViewportWidth == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*   2    4:ifnull          77
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*   5   11:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*   6   14:ifnull          77
	//*   7   17:aload_0         
	//*   8   18:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*   9   21:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  10   24:getfield        #431 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//*  11   27:fconst_0        
	//*  12   28:fcmpl           
	//*  13   29:ifeq            77
	//*  14   32:aload_0         
	//*  15   33:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  16   36:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  17   39:getfield        #438 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//*  18   42:fconst_0        
	//*  19   43:fcmpl           
	//*  20   44:ifeq            77
	//*  21   47:aload_0         
	//*  22   48:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  23   51:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  24   54:getfield        #421 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//*  25   57:fconst_0        
	//*  26   58:fcmpl           
	//*  27   59:ifeq            77
	//*  28   62:aload_0         
	//*  29   63:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  30   66:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  31   69:getfield        #412 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//*  32   72:fconst_0        
	//*  33   73:fcmpl           
	//*  34   74:ifne            79
		{
			return 1.0F;
	//   35   77:fconst_1        
	//   36   78:freturn         
		} else
		{
			float f = mVectorState.mVPathRenderer.mBaseWidth;
	//   37   79:aload_0         
	//   38   80:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   39   83:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   40   86:getfield        #431 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   41   89:fstore_1        
			float f1 = mVectorState.mVPathRenderer.mBaseHeight;
	//   42   90:aload_0         
	//   43   91:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   44   94:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   45   97:getfield        #438 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//   46  100:fstore_2        
			float f2 = mVectorState.mVPathRenderer.mViewportWidth;
	//   47  101:aload_0         
	//   48  102:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   49  105:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   50  108:getfield        #412 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//   51  111:fstore_3        
			float f3 = mVectorState.mVPathRenderer.mViewportHeight;
	//   52  112:aload_0         
	//   53  113:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   54  116:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   55  119:getfield        #421 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//   56  122:fstore          4
			return Math.min(f2 / f, f3 / f1);
	//   57  124:fload_3         
	//   58  125:fload_1         
	//   59  126:fdiv            
	//   60  127:fload           4
	//   61  129:fload_2         
	//   62  130:fdiv            
	//   63  131:invokestatic    #593 <Method float Math.min(float, float)>
	//   64  134:freturn         
		}
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #597 <Method int[] VectorDrawableCommon.getState()>
	//    2    4:areturn         
	}

	Object getTargetByName(String s)
	{
		return mVectorState.mVPathRenderer.mVGTargetsMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    2    4:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//    3    7:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #601 <Method Object ArrayMap.get(Object)>
	//    6   14:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #605 <Method Region VectorDrawableCommon.getTransparentRegion()>
	//    2    4:areturn         
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			mDelegateDrawable.inflate(resources, xmlpullparser, attributeset);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #608 <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
			return;
	//    9   17:return          
		} else
		{
			inflate(resources, xmlpullparser, attributeset, ((android.content.res.Resources.Theme) (null)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:aconst_null     
	//   15   23:invokevirtual   #203 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   16   26:return          
		}
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.inflate(mDelegateDrawable, resources, xmlpullparser, attributeset, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokestatic    #611 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   10   19:return          
		} else
		{
			VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//   11   20:aload_0         
	//   12   21:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   13   24:astore          5
			vectordrawablecompatstate.mVPathRenderer = new VPathRenderer();
	//   14   26:aload           5
	//   15   28:new             #18  <Class VectorDrawableCompat$VPathRenderer>
	//   16   31:dup             
	//   17   32:invokespecial   #612 <Method void VectorDrawableCompat$VPathRenderer()>
	//   18   35:putfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
			TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
	//   19   38:aload_1         
	//   20   39:aload           4
	//   21   41:aload_3         
	//   22   42:getstatic       #618 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY>
	//   23   45:invokestatic    #622 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   24   48:astore          6
			updateStateFromTypedArray(typedarray, xmlpullparser);
	//   25   50:aload_0         
	//   26   51:aload           6
	//   27   53:aload_2         
	//   28   54:invokespecial   #624 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			typedarray.recycle();
	//   29   57:aload           6
	//   30   59:invokevirtual   #627 <Method void TypedArray.recycle()>
			vectordrawablecompatstate.mChangingConfigurations = getChangingConfigurations();
	//   31   62:aload           5
	//   32   64:aload_0         
	//   33   65:invokevirtual   #562 <Method int getChangingConfigurations()>
	//   34   68:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
			vectordrawablecompatstate.mCacheDirty = true;
	//   35   71:aload           5
	//   36   73:iconst_1        
	//   37   74:putfield        #630 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mCacheDirty>
			inflateInternal(resources, xmlpullparser, attributeset, theme);
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:aload_2         
	//   41   80:aload_3         
	//   42   81:aload           4
	//   43   83:invokespecial   #632 <Method void inflateInternal(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, vectordrawablecompatstate.mTintMode);
	//   44   86:aload_0         
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   48   92:aload           5
	//   49   94:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   50   97:aload           5
	//   51   99:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   52  102:invokevirtual   #118 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   53  105:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
			return;
	//   54  108:return          
		}
	}

	public void invalidateSelf()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
		{
			mDelegateDrawable.invalidateSelf();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #635 <Method void Drawable.invalidateSelf()>
			return;
	//    6   14:return          
		} else
		{
			super.invalidateSelf();
	//    7   15:aload_0         
	//    8   16:invokespecial   #636 <Method void VectorDrawableCommon.invalidateSelf()>
			return;
	//    9   19:return          
		}
	}

	public boolean isAutoMirrored()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.isAutoMirrored(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #638 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.mAutoMirrored;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #403 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
	//   10   22:ireturn         
	}

	public boolean isStateful()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.isStateful();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #641 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		return super.isStateful() || mVectorState != null && mVectorState.mTint != null && mVectorState.mTint.isStateful();
	//    7   15:aload_0         
	//    8   16:invokespecial   #642 <Method boolean VectorDrawableCommon.isStateful()>
	//    9   19:ifne            52
	//   10   22:aload_0         
	//   11   23:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   12   26:ifnull          54
	//   13   29:aload_0         
	//   14   30:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   15   33:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   16   36:ifnull          54
	//   17   39:aload_0         
	//   18   40:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   19   43:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   20   46:invokevirtual   #645 <Method boolean ColorStateList.isStateful()>
	//   21   49:ifeq            54
	//   22   52:iconst_1        
	//   23   53:ireturn         
	//   24   54:iconst_0        
	//   25   55:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #648 <Method void VectorDrawableCommon.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #651 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
		else
	//*   7   15:aload_0         
	//*   8   16:areturn         
		if(!mMutated && super.mutate() == this)
	//*   9   17:aload_0         
	//*  10   18:getfield        #653 <Field boolean mMutated>
	//*  11   21:ifne            15
	//*  12   24:aload_0         
	//*  13   25:invokespecial   #654 <Method Drawable VectorDrawableCommon.mutate()>
	//*  14   28:aload_0         
	//*  15   29:if_acmpne       15
		{
			mVectorState = new VectorDrawableCompatState(mVectorState);
	//   16   32:aload_0         
	//   17   33:new             #21  <Class VectorDrawableCompat$VectorDrawableCompatState>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   21   41:invokespecial   #656 <Method void VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompat$VectorDrawableCompatState)>
	//   22   44:putfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
			mMutated = true;
	//   23   47:aload_0         
	//   24   48:iconst_1        
	//   25   49:putfield        #653 <Field boolean mMutated>
			return ((Drawable) (this));
	//   26   52:aload_0         
	//   27   53:areturn         
		}
		return ((Drawable) (this));
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #660 <Method void Drawable.setBounds(Rect)>
	//    7   15:return          
	}

	protected boolean onStateChange(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #665 <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		ai = ((int []) (mVectorState));
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_1        
		if(((VectorDrawableCompatState) (ai)).mTint != null && ((VectorDrawableCompatState) (ai)).mTintMode != null)
	//*  11   21:aload_1         
	//*  12   22:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  13   25:ifnull          61
	//*  14   28:aload_1         
	//*  15   29:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//*  16   32:ifnull          61
		{
			mTintFilter = updateTintFilter(mTintFilter, ((VectorDrawableCompatState) (ai)).mTint, ((VectorDrawableCompatState) (ai)).mTintMode);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   21   41:aload_1         
	//   22   42:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   23   45:aload_1         
	//   24   46:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   25   49:invokevirtual   #118 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   52:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
			invalidateSelf();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #666 <Method void invalidateSelf()>
			return true;
	//   29   59:iconst_1        
	//   30   60:ireturn         
		} else
		{
			return false;
	//   31   61:iconst_0        
	//   32   62:ireturn         
		}
	}

	public void scheduleSelf(Runnable runnable, long l)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.scheduleSelf(runnable, l);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:lload_2         
	//    7   13:invokevirtual   #670 <Method void Drawable.scheduleSelf(Runnable, long)>
			return;
	//    8   16:return          
		} else
		{
			super.scheduleSelf(runnable, l);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:invokespecial   #671 <Method void VectorDrawableCommon.scheduleSelf(Runnable, long)>
			return;
	//   13   23:return          
		}
	}

	void setAllowCaching(boolean flag)
	{
		mAllowCaching = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean mAllowCaching>
	//    3    5:return          
	}

	public void setAlpha(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #675 <Method void Drawable.setAlpha(int)>
		else
	//*   7   15:return          
		if(mVectorState.mVPathRenderer.getRootAlpha() != i)
	//*   8   16:aload_0         
	//*   9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  10   20:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  11   23:invokevirtual   #552 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//*  12   26:iload_1         
	//*  13   27:icmpeq          15
		{
			mVectorState.mVPathRenderer.setRootAlpha(i);
	//   14   30:aload_0         
	//   15   31:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   16   34:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #678 <Method void VectorDrawableCompat$VPathRenderer.setRootAlpha(int)>
			invalidateSelf();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #666 <Method void invalidateSelf()>
			return;
	//   21   45:return          
		}
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setAutoMirrored(mDelegateDrawable, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #682 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
			return;
	//    7   15:return          
		} else
		{
			mVectorState.mAutoMirrored = flag;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:iload_1         
	//   11   21:putfield        #403 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
			return;
	//   12   24:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #685 <Method void VectorDrawableCommon.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #689 <Method void VectorDrawableCommon.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    4    6:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setColorFilter(colorfilter);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #692 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mColorFilter = colorfilter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #485 <Field ColorFilter mColorFilter>
			invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #666 <Method void invalidateSelf()>
			return;
	//   13   25:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #695 <Method void VectorDrawableCommon.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #698 <Method void VectorDrawableCommon.setHotspot(float, float)>
	//    4    6:return          
	}

	public volatile void setHotspotBounds(int i, int j, int k, int l)
	{
		super.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #702 <Method void VectorDrawableCommon.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #703 <Method boolean VectorDrawableCommon.setState(int[])>
	//    3    5:ireturn         
	}

	public void setTint(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTint(mDelegateDrawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #707 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			setTintList(ColorStateList.valueOf(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #710 <Method ColorStateList ColorStateList.valueOf(int)>
	//   11   21:invokevirtual   #714 <Method void setTintList(ColorStateList)>
			return;
	//   12   24:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintList(mDelegateDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #717 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		} else
	//*   7   15:return          
		{
			VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_2        
			if(vectordrawablecompatstate.mTint != colorstatelist)
	//*  11   21:aload_2         
	//*  12   22:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       15
			{
				vectordrawablecompatstate.mTint = colorstatelist;
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:putfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
				mTintFilter = updateTintFilter(mTintFilter, colorstatelist, vectordrawablecompatstate.mTintMode);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   25   45:invokevirtual   #118 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   48:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
				invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #666 <Method void invalidateSelf()>
				return;
	//   29   55:return          
			}
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintMode(mDelegateDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #722 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		} else
	//*   7   15:return          
		{
			VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_2        
			if(vectordrawablecompatstate.mTintMode != mode)
	//*  11   21:aload_2         
	//*  12   22:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       15
			{
				vectordrawablecompatstate.mTintMode = mode;
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:putfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
				mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, mode);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   22   40:aload_2         
	//   23   41:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #118 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   48:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
				invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #666 <Method void invalidateSelf()>
				return;
	//   29   55:return          
			}
		}
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
			return mDelegateDrawable.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #726 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		else
			return super.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokespecial   #727 <Method boolean VectorDrawableCommon.setVisible(boolean, boolean)>
	//   13   23:ireturn         
	}

	public void unscheduleSelf(Runnable runnable)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.unscheduleSelf(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #731 <Method void Drawable.unscheduleSelf(Runnable)>
			return;
	//    7   15:return          
		} else
		{
			super.unscheduleSelf(runnable);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #732 <Method void VectorDrawableCommon.unscheduleSelf(Runnable)>
			return;
	//   11   21:return          
		}
	}

	PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterduffcolorfilter, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
	{
		if(colorstatelist == null || mode == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
	//    6   10:new             #734 <Class PorterDuffColorFilter>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #735 <Method int[] getState()>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #739 <Method int ColorStateList.getColorForState(int[], int)>
	//   13   23:aload_3         
	//   14   24:invokespecial   #741 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   15   27:areturn         
	}

	private static final boolean DBG_VECTOR_DRAWABLE = false;
	static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE;
	private static final int LINECAP_BUTT = 0;
	private static final int LINECAP_ROUND = 1;
	private static final int LINECAP_SQUARE = 2;
	private static final int LINEJOIN_BEVEL = 2;
	private static final int LINEJOIN_MITER = 0;
	private static final int LINEJOIN_ROUND = 1;
	static final String LOGTAG = "VectorDrawableCompat";
	private static final int MAX_CACHED_BITMAP_SIZE = 2048;
	private static final String SHAPE_CLIP_PATH = "clip-path";
	private static final String SHAPE_GROUP = "group";
	private static final String SHAPE_PATH = "path";
	private static final String SHAPE_VECTOR = "vector";
	private boolean mAllowCaching;
	private android.graphics.drawable.Drawable.ConstantState mCachedConstantStateDelegate;
	private ColorFilter mColorFilter;
	private boolean mMutated;
	private PorterDuffColorFilter mTintFilter;
	private final Rect mTmpBounds;
	private final float mTmpFloats[];
	private final Matrix mTmpMatrix;
	private VectorDrawableCompatState mVectorState;

	static 
	{
		DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #82  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
