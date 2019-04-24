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
import java.util.ArrayDeque;
import java.util.ArrayList;
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
		//		               0 38
		//		               1 34
		//		               2 30
			default:
				return cap;
		//    2   28:aload_2         
		//    3   29:areturn         

			case 2: // '\002'
				return android.graphics.Paint.Cap.SQUARE;
		//    4   30:getstatic       #78  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
		//    5   33:areturn         

			case 1: // '\001'
				return android.graphics.Paint.Cap.ROUND;
		//    6   34:getstatic       #81  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
		//    7   37:areturn         

			case 0: // '\0'
				return android.graphics.Paint.Cap.BUTT;
		//    8   38:getstatic       #54  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//    9   41:areturn         
			}
		}

		private android.graphics.Paint.Join getStrokeLineJoin(int i, android.graphics.Paint.Join join)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 38
		//		               1 34
		//		               2 30
			default:
				return join;
		//    2   28:aload_2         
		//    3   29:areturn         

			case 2: // '\002'
				return android.graphics.Paint.Join.BEVEL;
		//    4   30:getstatic       #86  <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
		//    5   33:areturn         

			case 1: // '\001'
				return android.graphics.Paint.Join.ROUND;
		//    6   34:getstatic       #88  <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
		//    7   37:areturn         

			case 0: // '\0'
				return android.graphics.Paint.Join.MITER;
		//    8   38:getstatic       #61  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//    9   41:areturn         
			}
		}

		private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
		{
			mThemeAttrs = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #73  <Field int[] mThemeAttrs>
			if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
		//*   3    5:aload_2         
		//*   4    6:ldc1            #92  <String "pathData">
		//*   5    8:invokestatic    #98  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
		//*   6   11:ifne            15
				return;
		//    7   14:return          
			String s = typedarray.getString(0);
		//    8   15:aload_1         
		//    9   16:iconst_0        
		//   10   17:invokevirtual   #104 <Method String TypedArray.getString(int)>
		//   11   20:astore_3        
			if(s != null)
		//*  12   21:aload_3         
		//*  13   22:ifnull          30
				mPathName = s;
		//   14   25:aload_0         
		//   15   26:aload_3         
		//   16   27:putfield        #108 <Field String mPathName>
			s = typedarray.getString(2);
		//   17   30:aload_1         
		//   18   31:iconst_2        
		//   19   32:invokevirtual   #104 <Method String TypedArray.getString(int)>
		//   20   35:astore_3        
			if(s != null)
		//*  21   36:aload_3         
		//*  22   37:ifnull          48
				mNodes = PathParser.createNodesFromPathData(s);
		//   23   40:aload_0         
		//   24   41:aload_3         
		//   25   42:invokestatic    #114 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
		//   26   45:putfield        #118 <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
			mFillColor = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "fillColor", 1, mFillColor);
		//   27   48:aload_0         
		//   28   49:aload_1         
		//   29   50:aload_2         
		//   30   51:ldc1            #120 <String "fillColor">
		//   31   53:iconst_1        
		//   32   54:aload_0         
		//   33   55:getfield        #37  <Field int mFillColor>
		//   34   58:invokestatic    #124 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
		//   35   61:putfield        #37  <Field int mFillColor>
			mFillAlpha = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "fillAlpha", 12, mFillAlpha);
		//   36   64:aload_0         
		//   37   65:aload_1         
		//   38   66:aload_2         
		//   39   67:ldc1            #126 <String "fillAlpha">
		//   40   69:bipush          12
		//   41   71:aload_0         
		//   42   72:getfield        #43  <Field float mFillAlpha>
		//   43   75:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   44   78:putfield        #43  <Field float mFillAlpha>
			mStrokeLineCap = getStrokeLineCap(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineCap", 8, -1), mStrokeLineCap);
		//   45   81:aload_0         
		//   46   82:aload_0         
		//   47   83:aload_1         
		//   48   84:aload_2         
		//   49   85:ldc1            #132 <String "strokeLineCap">
		//   50   87:bipush          8
		//   51   89:iconst_m1       
		//   52   90:invokestatic    #135 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
		//   53   93:aload_0         
		//   54   94:getfield        #56  <Field android.graphics.Paint$Cap mStrokeLineCap>
		//   55   97:invokespecial   #137 <Method android.graphics.Paint$Cap getStrokeLineCap(int, android.graphics.Paint$Cap)>
		//   56  100:putfield        #56  <Field android.graphics.Paint$Cap mStrokeLineCap>
			mStrokeLineJoin = getStrokeLineJoin(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineJoin", 9, -1), mStrokeLineJoin);
		//   57  103:aload_0         
		//   58  104:aload_0         
		//   59  105:aload_1         
		//   60  106:aload_2         
		//   61  107:ldc1            #139 <String "strokeLineJoin">
		//   62  109:bipush          9
		//   63  111:iconst_m1       
		//   64  112:invokestatic    #135 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
		//   65  115:aload_0         
		//   66  116:getfield        #63  <Field android.graphics.Paint$Join mStrokeLineJoin>
		//   67  119:invokespecial   #141 <Method android.graphics.Paint$Join getStrokeLineJoin(int, android.graphics.Paint$Join)>
		//   68  122:putfield        #63  <Field android.graphics.Paint$Join mStrokeLineJoin>
			mStrokeMiterlimit = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeMiterLimit", 10, mStrokeMiterlimit);
		//   69  125:aload_0         
		//   70  126:aload_1         
		//   71  127:aload_2         
		//   72  128:ldc1            #143 <String "strokeMiterLimit">
		//   73  130:bipush          10
		//   74  132:aload_0         
		//   75  133:getfield        #66  <Field float mStrokeMiterlimit>
		//   76  136:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   77  139:putfield        #66  <Field float mStrokeMiterlimit>
			mStrokeColor = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "strokeColor", 3, mStrokeColor);
		//   78  142:aload_0         
		//   79  143:aload_1         
		//   80  144:aload_2         
		//   81  145:ldc1            #145 <String "strokeColor">
		//   82  147:iconst_3        
		//   83  148:aload_0         
		//   84  149:getfield        #33  <Field int mStrokeColor>
		//   85  152:invokestatic    #124 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
		//   86  155:putfield        #33  <Field int mStrokeColor>
			mStrokeAlpha = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeAlpha", 11, mStrokeAlpha);
		//   87  158:aload_0         
		//   88  159:aload_1         
		//   89  160:aload_2         
		//   90  161:ldc1            #147 <String "strokeAlpha">
		//   91  163:bipush          11
		//   92  165:aload_0         
		//   93  166:getfield        #39  <Field float mStrokeAlpha>
		//   94  169:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   95  172:putfield        #39  <Field float mStrokeAlpha>
			mStrokeWidth = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeWidth", 4, mStrokeWidth);
		//   96  175:aload_0         
		//   97  176:aload_1         
		//   98  177:aload_2         
		//   99  178:ldc1            #149 <String "strokeWidth">
		//  100  180:iconst_4        
		//  101  181:aload_0         
		//  102  182:getfield        #35  <Field float mStrokeWidth>
		//  103  185:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  104  188:putfield        #35  <Field float mStrokeWidth>
			mTrimPathEnd = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathEnd", 6, mTrimPathEnd);
		//  105  191:aload_0         
		//  106  192:aload_1         
		//  107  193:aload_2         
		//  108  194:ldc1            #151 <String "trimPathEnd">
		//  109  196:bipush          6
		//  110  198:aload_0         
		//  111  199:getfield        #47  <Field float mTrimPathEnd>
		//  112  202:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  113  205:putfield        #47  <Field float mTrimPathEnd>
			mTrimPathOffset = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathOffset", 7, mTrimPathOffset);
		//  114  208:aload_0         
		//  115  209:aload_1         
		//  116  210:aload_2         
		//  117  211:ldc1            #153 <String "trimPathOffset">
		//  118  213:bipush          7
		//  119  215:aload_0         
		//  120  216:getfield        #49  <Field float mTrimPathOffset>
		//  121  219:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  122  222:putfield        #49  <Field float mTrimPathOffset>
			mTrimPathStart = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathStart", 5, mTrimPathStart);
		//  123  225:aload_0         
		//  124  226:aload_1         
		//  125  227:aload_2         
		//  126  228:ldc1            #155 <String "trimPathStart">
		//  127  230:iconst_5        
		//  128  231:aload_0         
		//  129  232:getfield        #45  <Field float mTrimPathStart>
		//  130  235:invokestatic    #130 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  131  238:putfield        #45  <Field float mTrimPathStart>
			mFillRule = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "fillType", 13, mFillRule);
		//  132  241:aload_0         
		//  133  242:aload_1         
		//  134  243:aload_2         
		//  135  244:ldc1            #157 <String "fillType">
		//  136  246:bipush          13
		//  137  248:aload_0         
		//  138  249:getfield        #41  <Field int mFillRule>
		//  139  252:invokestatic    #135 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
		//  140  255:putfield        #41  <Field int mFillRule>
		//  141  258:return          
		}

		public void applyTheme(android.content.res.Resources.Theme theme)
		{
			if(mThemeAttrs == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #73  <Field int[] mThemeAttrs>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			else
				return;
		//    4    8:return          
		}

		public boolean canApplyTheme()
		{
			return mThemeAttrs != null;
		//    0    0:aload_0         
		//    1    1:getfield        #73  <Field int[] mThemeAttrs>
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
		//    1    1:getfield        #43  <Field float mFillAlpha>
		//    2    4:freturn         
		}

		int getFillColor()
		{
			return mFillColor;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int mFillColor>
		//    2    4:ireturn         
		}

		float getStrokeAlpha()
		{
			return mStrokeAlpha;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field float mStrokeAlpha>
		//    2    4:freturn         
		}

		int getStrokeColor()
		{
			return mStrokeColor;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int mStrokeColor>
		//    2    4:ireturn         
		}

		float getStrokeWidth()
		{
			return mStrokeWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field float mStrokeWidth>
		//    2    4:freturn         
		}

		float getTrimPathEnd()
		{
			return mTrimPathEnd;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field float mTrimPathEnd>
		//    2    4:freturn         
		}

		float getTrimPathOffset()
		{
			return mTrimPathOffset;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field float mTrimPathOffset>
		//    2    4:freturn         
		}

		float getTrimPathStart()
		{
			return mTrimPathStart;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field float mTrimPathStart>
		//    2    4:freturn         
		}

		public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH)));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:aload_2         
		//    3    3:getstatic       #178 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH>
		//    4    6:invokestatic    #182 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//    5    9:astore_1        
			updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload           4
		//    9   14:invokespecial   #184 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			((TypedArray) (resources)).recycle();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #187 <Method void TypedArray.recycle()>
		//   12   21:return          
		}

		void setFillAlpha(float f)
		{
			mFillAlpha = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #43  <Field float mFillAlpha>
		//    3    5:return          
		}

		void setFillColor(int i)
		{
			mFillColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #37  <Field int mFillColor>
		//    3    5:return          
		}

		void setStrokeAlpha(float f)
		{
			mStrokeAlpha = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #39  <Field float mStrokeAlpha>
		//    3    5:return          
		}

		void setStrokeColor(int i)
		{
			mStrokeColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #33  <Field int mStrokeColor>
		//    3    5:return          
		}

		void setStrokeWidth(float f)
		{
			mStrokeWidth = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #35  <Field float mStrokeWidth>
		//    3    5:return          
		}

		void setTrimPathEnd(float f)
		{
			mTrimPathEnd = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #47  <Field float mTrimPathEnd>
		//    3    5:return          
		}

		void setTrimPathOffset(float f)
		{
			mTrimPathOffset = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #49  <Field float mTrimPathOffset>
		//    3    5:return          
		}

		void setTrimPathStart(float f)
		{
			mTrimPathStart = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #45  <Field float mTrimPathStart>
		//    3    5:return          
		}

		private static final int FILL_TYPE_WINDING = 0;
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
		//    1    1:invokespecial   #31  <Method void VectorDrawableCompat$VPath()>
			mStrokeColor = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #33  <Field int mStrokeColor>
			mStrokeWidth = 0.0F;
		//    5    9:aload_0         
		//    6   10:fconst_0        
		//    7   11:putfield        #35  <Field float mStrokeWidth>
			mFillColor = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #37  <Field int mFillColor>
			mStrokeAlpha = 1.0F;
		//   11   19:aload_0         
		//   12   20:fconst_1        
		//   13   21:putfield        #39  <Field float mStrokeAlpha>
			mFillRule = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #41  <Field int mFillRule>
			mFillAlpha = 1.0F;
		//   17   29:aload_0         
		//   18   30:fconst_1        
		//   19   31:putfield        #43  <Field float mFillAlpha>
			mTrimPathStart = 0.0F;
		//   20   34:aload_0         
		//   21   35:fconst_0        
		//   22   36:putfield        #45  <Field float mTrimPathStart>
			mTrimPathEnd = 1.0F;
		//   23   39:aload_0         
		//   24   40:fconst_1        
		//   25   41:putfield        #47  <Field float mTrimPathEnd>
			mTrimPathOffset = 0.0F;
		//   26   44:aload_0         
		//   27   45:fconst_0        
		//   28   46:putfield        #49  <Field float mTrimPathOffset>
			mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
		//   29   49:aload_0         
		//   30   50:getstatic       #54  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//   31   53:putfield        #56  <Field android.graphics.Paint$Cap mStrokeLineCap>
			mStrokeLineJoin = android.graphics.Paint.Join.MITER;
		//   32   56:aload_0         
		//   33   57:getstatic       #61  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//   34   60:putfield        #63  <Field android.graphics.Paint$Join mStrokeLineJoin>
			mStrokeMiterlimit = 4F;
		//   35   63:aload_0         
		//   36   64:ldc1            #64  <Float 4F>
		//   37   66:putfield        #66  <Field float mStrokeMiterlimit>
		//   38   69:return          
		}

		public VFullPath(VFullPath vfullpath)
		{
			super(((VPath) (vfullpath)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #71  <Method void VectorDrawableCompat$VPath(VectorDrawableCompat$VPath)>
			mStrokeColor = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #33  <Field int mStrokeColor>
			mStrokeWidth = 0.0F;
		//    6   10:aload_0         
		//    7   11:fconst_0        
		//    8   12:putfield        #35  <Field float mStrokeWidth>
			mFillColor = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #37  <Field int mFillColor>
			mStrokeAlpha = 1.0F;
		//   12   20:aload_0         
		//   13   21:fconst_1        
		//   14   22:putfield        #39  <Field float mStrokeAlpha>
			mFillRule = 0;
		//   15   25:aload_0         
		//   16   26:iconst_0        
		//   17   27:putfield        #41  <Field int mFillRule>
			mFillAlpha = 1.0F;
		//   18   30:aload_0         
		//   19   31:fconst_1        
		//   20   32:putfield        #43  <Field float mFillAlpha>
			mTrimPathStart = 0.0F;
		//   21   35:aload_0         
		//   22   36:fconst_0        
		//   23   37:putfield        #45  <Field float mTrimPathStart>
			mTrimPathEnd = 1.0F;
		//   24   40:aload_0         
		//   25   41:fconst_1        
		//   26   42:putfield        #47  <Field float mTrimPathEnd>
			mTrimPathOffset = 0.0F;
		//   27   45:aload_0         
		//   28   46:fconst_0        
		//   29   47:putfield        #49  <Field float mTrimPathOffset>
			mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
		//   30   50:aload_0         
		//   31   51:getstatic       #54  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//   32   54:putfield        #56  <Field android.graphics.Paint$Cap mStrokeLineCap>
			mStrokeLineJoin = android.graphics.Paint.Join.MITER;
		//   33   57:aload_0         
		//   34   58:getstatic       #61  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//   35   61:putfield        #63  <Field android.graphics.Paint$Join mStrokeLineJoin>
			mStrokeMiterlimit = 4F;
		//   36   64:aload_0         
		//   37   65:ldc1            #64  <Float 4F>
		//   38   67:putfield        #66  <Field float mStrokeMiterlimit>
			mThemeAttrs = vfullpath.mThemeAttrs;
		//   39   70:aload_0         
		//   40   71:aload_1         
		//   41   72:getfield        #73  <Field int[] mThemeAttrs>
		//   42   75:putfield        #73  <Field int[] mThemeAttrs>
			mStrokeColor = vfullpath.mStrokeColor;
		//   43   78:aload_0         
		//   44   79:aload_1         
		//   45   80:getfield        #33  <Field int mStrokeColor>
		//   46   83:putfield        #33  <Field int mStrokeColor>
			mStrokeWidth = vfullpath.mStrokeWidth;
		//   47   86:aload_0         
		//   48   87:aload_1         
		//   49   88:getfield        #35  <Field float mStrokeWidth>
		//   50   91:putfield        #35  <Field float mStrokeWidth>
			mStrokeAlpha = vfullpath.mStrokeAlpha;
		//   51   94:aload_0         
		//   52   95:aload_1         
		//   53   96:getfield        #39  <Field float mStrokeAlpha>
		//   54   99:putfield        #39  <Field float mStrokeAlpha>
			mFillColor = vfullpath.mFillColor;
		//   55  102:aload_0         
		//   56  103:aload_1         
		//   57  104:getfield        #37  <Field int mFillColor>
		//   58  107:putfield        #37  <Field int mFillColor>
			mFillRule = vfullpath.mFillRule;
		//   59  110:aload_0         
		//   60  111:aload_1         
		//   61  112:getfield        #41  <Field int mFillRule>
		//   62  115:putfield        #41  <Field int mFillRule>
			mFillAlpha = vfullpath.mFillAlpha;
		//   63  118:aload_0         
		//   64  119:aload_1         
		//   65  120:getfield        #43  <Field float mFillAlpha>
		//   66  123:putfield        #43  <Field float mFillAlpha>
			mTrimPathStart = vfullpath.mTrimPathStart;
		//   67  126:aload_0         
		//   68  127:aload_1         
		//   69  128:getfield        #45  <Field float mTrimPathStart>
		//   70  131:putfield        #45  <Field float mTrimPathStart>
			mTrimPathEnd = vfullpath.mTrimPathEnd;
		//   71  134:aload_0         
		//   72  135:aload_1         
		//   73  136:getfield        #47  <Field float mTrimPathEnd>
		//   74  139:putfield        #47  <Field float mTrimPathEnd>
			mTrimPathOffset = vfullpath.mTrimPathOffset;
		//   75  142:aload_0         
		//   76  143:aload_1         
		//   77  144:getfield        #49  <Field float mTrimPathOffset>
		//   78  147:putfield        #49  <Field float mTrimPathOffset>
			mStrokeLineCap = vfullpath.mStrokeLineCap;
		//   79  150:aload_0         
		//   80  151:aload_1         
		//   81  152:getfield        #56  <Field android.graphics.Paint$Cap mStrokeLineCap>
		//   82  155:putfield        #56  <Field android.graphics.Paint$Cap mStrokeLineCap>
			mStrokeLineJoin = vfullpath.mStrokeLineJoin;
		//   83  158:aload_0         
		//   84  159:aload_1         
		//   85  160:getfield        #63  <Field android.graphics.Paint$Join mStrokeLineJoin>
		//   86  163:putfield        #63  <Field android.graphics.Paint$Join mStrokeLineJoin>
			mStrokeMiterlimit = vfullpath.mStrokeMiterlimit;
		//   87  166:aload_0         
		//   88  167:aload_1         
		//   89  168:getfield        #66  <Field float mStrokeMiterlimit>
		//   90  171:putfield        #66  <Field float mStrokeMiterlimit>
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
label0:
			{
				super();
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
					if(i >= arraylist.size())
						break label0;
		//  100  193:iload_3         
		//  101  194:aload           4
		//  102  196:invokevirtual   #79  <Method int ArrayList.size()>
		//  103  199:icmpge          325
					vgroup = ((VGroup) (arraylist.get(i)));
		//  104  202:aload           4
		//  105  204:iload_3         
		//  106  205:invokevirtual   #83  <Method Object ArrayList.get(int)>
		//  107  208:astore_1        
					if(vgroup instanceof VGroup)
		//* 108  209:aload_1         
		//* 109  210:instanceof      #2   <Class VectorDrawableCompat$VGroup>
		//* 110  213:ifeq            241
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
		//* 123  238:goto            308
					{
						if(vgroup instanceof VFullPath)
		//* 124  241:aload_1         
		//* 125  242:instanceof      #91  <Class VectorDrawableCompat$VFullPath>
		//* 126  245:ifeq            263
						{
							vgroup = ((VGroup) (new VFullPath((VFullPath)vgroup)));
		//  127  248:new             #91  <Class VectorDrawableCompat$VFullPath>
		//  128  251:dup             
		//  129  252:aload_1         
		//  130  253:checkcast       #91  <Class VectorDrawableCompat$VFullPath>
		//  131  256:invokespecial   #94  <Method void VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath)>
		//  132  259:astore_1        
						} else
		//* 133  260:goto            282
						{
							if(!(vgroup instanceof VClipPath))
								break;
		//  134  263:aload_1         
		//  135  264:instanceof      #96  <Class VectorDrawableCompat$VClipPath>
		//  136  267:ifeq            315
							vgroup = ((VGroup) (new VClipPath((VClipPath)vgroup)));
		//  137  270:new             #96  <Class VectorDrawableCompat$VClipPath>
		//  138  273:dup             
		//  139  274:aload_1         
		//  140  275:checkcast       #96  <Class VectorDrawableCompat$VClipPath>
		//  141  278:invokespecial   #99  <Method void VectorDrawableCompat$VClipPath(VectorDrawableCompat$VClipPath)>
		//  142  281:astore_1        
						}
						mChildren.add(((Object) (vgroup)));
		//  143  282:aload_0         
		//  144  283:getfield        #41  <Field ArrayList mChildren>
		//  145  286:aload_1         
		//  146  287:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
		//  147  290:pop             
						if(((VPath) (vgroup)).mPathName != null)
		//* 148  291:aload_1         
		//* 149  292:getfield        #104 <Field String VectorDrawableCompat$VPath.mPathName>
		//* 150  295:ifnull          308
							arraymap.put(((Object) (((VPath) (vgroup)).mPathName)), ((Object) (vgroup)));
		//  151  298:aload_2         
		//  152  299:aload_1         
		//  153  300:getfield        #104 <Field String VectorDrawableCompat$VPath.mPathName>
		//  154  303:aload_1         
		//  155  304:invokevirtual   #71  <Method Object ArrayMap.put(Object, Object)>
		//  156  307:pop             
					}
					i++;
		//  157  308:iload_3         
		//  158  309:iconst_1        
		//  159  310:iadd            
		//  160  311:istore_3        
				} while(true);
		//  161  312:goto            193
				throw new IllegalStateException("Unknown object in the tree!");
		//  162  315:new             #106 <Class IllegalStateException>
		//  163  318:dup             
		//  164  319:ldc1            #108 <String "Unknown object in the tree!">
		//  165  321:invokespecial   #111 <Method void IllegalStateException(String)>
		//  166  324:athrow          
			}
		//  167  325:return          
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
		//*   7    9:icmpge          129
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    8   12:new             #46  <Class StringBuilder>
		//    9   15:dup             
		//   10   16:invokespecial   #47  <Method void StringBuilder()>
		//   11   19:astore          5
				stringbuilder.append(s);
		//   12   21:aload           5
		//   13   23:aload           4
		//   14   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   15   28:pop             
				stringbuilder.append(apathdatanode[i].mType);
		//   16   29:aload           5
		//   17   31:aload_1         
		//   18   32:iload_2         
		//   19   33:aaload          
		//   20   34:getfield        #57  <Field char android.support.v4.graphics.PathParser$PathDataNode.mType>
		//   21   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(char)>
		//   22   40:pop             
				stringbuilder.append(":");
		//   23   41:aload           5
		//   24   43:ldc1            #62  <String ":">
		//   25   45:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
				s = stringbuilder.toString();
		//   27   49:aload           5
		//   28   51:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   29   54:astore          4
				float af[] = apathdatanode[i].mParams;
		//   30   56:aload_1         
		//   31   57:iload_2         
		//   32   58:aaload          
		//   33   59:getfield        #69  <Field float[] android.support.v4.graphics.PathParser$PathDataNode.mParams>
		//   34   62:astore          5
				for(int j = 0; j < af.length; j++)
		//*  35   64:iconst_0        
		//*  36   65:istore_3        
		//*  37   66:iload_3         
		//*  38   67:aload           5
		//*  39   69:arraylength     
		//*  40   70:icmpge          122
				{
					StringBuilder stringbuilder1 = new StringBuilder();
		//   41   73:new             #46  <Class StringBuilder>
		//   42   76:dup             
		//   43   77:invokespecial   #47  <Method void StringBuilder()>
		//   44   80:astore          6
					stringbuilder1.append(s);
		//   45   82:aload           6
		//   46   84:aload           4
		//   47   86:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   48   89:pop             
					stringbuilder1.append(af[j]);
		//   49   90:aload           6
		//   50   92:aload           5
		//   51   94:iload_3         
		//   52   95:faload          
		//   53   96:invokevirtual   #72  <Method StringBuilder StringBuilder.append(float)>
		//   54   99:pop             
					stringbuilder1.append(",");
		//   55  100:aload           6
		//   56  102:ldc1            #74  <String ",">
		//   57  104:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   58  107:pop             
					s = stringbuilder1.toString();
		//   59  108:aload           6
		//   60  110:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   61  113:astore          4
				}

		//   62  115:iload_3         
		//   63  116:iconst_1        
		//   64  117:iadd            
		//   65  118:istore_3        
			}

		//   66  119:goto            66
		//   67  122:iload_2         
		//   68  123:iconst_1        
		//   69  124:iadd            
		//   70  125:istore_2        
		//*  71  126:goto            6
			return s;
		//   72  129:aload           4
		//   73  131:areturn         
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
		//*   6    7:icmpge          47
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    7   10:new             #46  <Class StringBuilder>
		//    8   13:dup             
		//    9   14:invokespecial   #47  <Method void StringBuilder()>
		//   10   17:astore          4
				stringbuilder.append(s);
		//   11   19:aload           4
		//   12   21:aload_3         
		//   13   22:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   14   25:pop             
				stringbuilder.append("    ");
		//   15   26:aload           4
		//   16   28:ldc1            #80  <String "    ">
		//   17   30:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   18   33:pop             
				s = stringbuilder.toString();
		//   19   34:aload           4
		//   20   36:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   21   39:astore_3        
			}

		//   22   40:iload_2         
		//   23   41:iconst_1        
		//   24   42:iadd            
		//   25   43:istore_2        
		//*  26   44:goto            5
			StringBuilder stringbuilder1 = new StringBuilder();
		//   27   47:new             #46  <Class StringBuilder>
		//   28   50:dup             
		//   29   51:invokespecial   #47  <Method void StringBuilder()>
		//   30   54:astore          4
			stringbuilder1.append(s);
		//   31   56:aload           4
		//   32   58:aload_3         
		//   33   59:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder1.append("current path is :");
		//   35   63:aload           4
		//   36   65:ldc1            #82  <String "current path is :">
		//   37   67:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   38   70:pop             
			stringbuilder1.append(mPathName);
		//   39   71:aload           4
		//   40   73:aload_0         
		//   41   74:getfield        #23  <Field String mPathName>
		//   42   77:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   43   80:pop             
			stringbuilder1.append(" pathData is ");
		//   44   81:aload           4
		//   45   83:ldc1            #84  <String " pathData is ">
		//   46   85:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   47   88:pop             
			stringbuilder1.append(nodesToString(mNodes));
		//   48   89:aload           4
		//   49   91:aload_0         
		//   50   92:aload_0         
		//   51   93:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   52   96:invokevirtual   #86  <Method String nodesToString(android.support.v4.graphics.PathParser$PathDataNode[])>
		//   53   99:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   54  102:pop             
			Log.v("VectorDrawableCompat", stringbuilder1.toString());
		//   55  103:ldc1            #88  <String "VectorDrawableCompat">
		//   56  105:aload           4
		//   57  107:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   58  110:invokestatic    #94  <Method int Log.v(String, String)>
		//   59  113:pop             
		//   60  114:return          
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
			for(int k = 0; k < vgroup.mChildren.size(); k++)
		//*  13   25:iconst_0        
		//*  14   26:istore          7
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
		//*  27   54:ifeq            79
				{
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
					continue;
		//   38   76:goto            102
				}
				if(matrix instanceof VPath)
		//*  39   79:aload_2         
		//*  40   80:instanceof      #140 <Class VectorDrawableCompat$VPath>
		//*  41   83:ifeq            102
					drawPath(vgroup, (VPath)matrix, canvas, i, j, colorfilter);
		//   42   86:aload_0         
		//   43   87:aload_1         
		//   44   88:aload_2         
		//   45   89:checkcast       #140 <Class VectorDrawableCompat$VPath>
		//   46   92:aload_3         
		//   47   93:iload           4
		//   48   95:iload           5
		//   49   97:aload           6
		//   50   99:invokespecial   #144 <Method void drawPath(VectorDrawableCompat$VGroup, VectorDrawableCompat$VPath, Canvas, int, int, ColorFilter)>
			}

		//   51  102:iload           7
		//   52  104:iconst_1        
		//   53  105:iadd            
		//   54  106:istore          7
		//*  55  108:goto            28
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
			if(f1 == 0.0F)
		//*  33   61:fload           8
		//*  34   63:fconst_0        
		//*  35   64:fcmpl           
		//*  36   65:ifne            69
				return;
		//   37   68:return          
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
		//*  75  138:ifeq            290
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
				if(f6 > f4)
		//* 124  232:fload           12
		//* 125  234:fload           10
		//* 126  236:fcmpl           
		//* 127  237:ifle            270
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
		//* 144  267:goto            284
				{
					mPathMeasure.getSegment(f6, f4, ((Path) (vgroup)), true);
		//  145  270:aload_0         
		//  146  271:getfield        #192 <Field PathMeasure mPathMeasure>
		//  147  274:fload           12
		//  148  276:fload           10
		//  149  278:aload_1         
		//  150  279:iconst_1        
		//  151  280:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  152  283:pop             
				}
				((Path) (vgroup)).rLineTo(0.0F, 0.0F);
		//  153  284:aload_1         
		//  154  285:fconst_0        
		//  155  286:fconst_0        
		//  156  287:invokevirtual   #211 <Method void Path.rLineTo(float, float)>
			}
			mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
		//  157  290:aload_0         
		//  158  291:getfield        #75  <Field Path mRenderPath>
		//  159  294:aload_1         
		//  160  295:aload_0         
		//  161  296:getfield        #46  <Field Matrix mFinalPathMatrix>
		//  162  299:invokevirtual   #175 <Method void Path.addPath(Path, Matrix)>
			if(((VFullPath) (vpath)).mFillColor != 0)
		//* 163  302:aload_2         
		//* 164  303:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
		//* 165  306:ifeq            415
			{
				if(mFillPaint == null)
		//* 166  309:aload_0         
		//* 167  310:getfield        #92  <Field Paint mFillPaint>
		//* 168  313:ifnonnull       345
				{
					mFillPaint = new Paint();
		//  169  316:aload_0         
		//  170  317:new             #216 <Class Paint>
		//  171  320:dup             
		//  172  321:invokespecial   #217 <Method void Paint()>
		//  173  324:putfield        #92  <Field Paint mFillPaint>
					mFillPaint.setStyle(android.graphics.Paint.Style.FILL);
		//  174  327:aload_0         
		//  175  328:getfield        #92  <Field Paint mFillPaint>
		//  176  331:getstatic       #223 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
		//  177  334:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
					mFillPaint.setAntiAlias(true);
		//  178  337:aload_0         
		//  179  338:getfield        #92  <Field Paint mFillPaint>
		//  180  341:iconst_1        
		//  181  342:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
				}
				Paint paint = mFillPaint;
		//  182  345:aload_0         
		//  183  346:getfield        #92  <Field Paint mFillPaint>
		//  184  349:astore          14
				paint.setColor(VectorDrawableCompat.applyAlpha(((VFullPath) (vpath)).mFillColor, ((VFullPath) (vpath)).mFillAlpha));
		//  185  351:aload           14
		//  186  353:aload_2         
		//  187  354:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
		//  188  357:aload_2         
		//  189  358:getfield        #234 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
		//  190  361:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//  191  364:invokevirtual   #242 <Method void Paint.setColor(int)>
				paint.setColorFilter(colorfilter);
		//  192  367:aload           14
		//  193  369:aload           6
		//  194  371:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//  195  374:pop             
				Path path = mRenderPath;
		//  196  375:aload_0         
		//  197  376:getfield        #75  <Field Path mRenderPath>
		//  198  379:astore          15
				if(((VFullPath) (vpath)).mFillRule == 0)
		//* 199  381:aload_2         
		//* 200  382:getfield        #249 <Field int VectorDrawableCompat$VFullPath.mFillRule>
		//* 201  385:ifne            395
					vgroup = ((VGroup) (android.graphics.Path.FillType.WINDING));
		//  202  388:getstatic       #255 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
		//  203  391:astore_1        
				else
		//* 204  392:goto            399
					vgroup = ((VGroup) (android.graphics.Path.FillType.EVEN_ODD));
		//  205  395:getstatic       #258 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
		//  206  398:astore_1        
				path.setFillType(((android.graphics.Path.FillType) (vgroup)));
		//  207  399:aload           15
		//  208  401:aload_1         
		//  209  402:invokevirtual   #262 <Method void Path.setFillType(android.graphics.Path$FillType)>
				canvas.drawPath(mRenderPath, paint);
		//  210  405:aload_3         
		//  211  406:aload_0         
		//  212  407:getfield        #75  <Field Path mRenderPath>
		//  213  410:aload           14
		//  214  412:invokevirtual   #265 <Method void Canvas.drawPath(Path, Paint)>
			}
			if(((VFullPath) (vpath)).mStrokeColor != 0)
		//* 215  415:aload_2         
		//* 216  416:getfield        #268 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
		//* 217  419:ifeq            546
			{
				if(mStrokePaint == null)
		//* 218  422:aload_0         
		//* 219  423:getfield        #97  <Field Paint mStrokePaint>
		//* 220  426:ifnonnull       458
				{
					mStrokePaint = new Paint();
		//  221  429:aload_0         
		//  222  430:new             #216 <Class Paint>
		//  223  433:dup             
		//  224  434:invokespecial   #217 <Method void Paint()>
		//  225  437:putfield        #97  <Field Paint mStrokePaint>
					mStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
		//  226  440:aload_0         
		//  227  441:getfield        #97  <Field Paint mStrokePaint>
		//  228  444:getstatic       #271 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
		//  229  447:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
					mStrokePaint.setAntiAlias(true);
		//  230  450:aload_0         
		//  231  451:getfield        #97  <Field Paint mStrokePaint>
		//  232  454:iconst_1        
		//  233  455:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
				}
				vgroup = ((VGroup) (mStrokePaint));
		//  234  458:aload_0         
		//  235  459:getfield        #97  <Field Paint mStrokePaint>
		//  236  462:astore_1        
				if(((VFullPath) (vpath)).mStrokeLineJoin != null)
		//* 237  463:aload_2         
		//* 238  464:getfield        #275 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
		//* 239  467:ifnull          478
					((Paint) (vgroup)).setStrokeJoin(((VFullPath) (vpath)).mStrokeLineJoin);
		//  240  470:aload_1         
		//  241  471:aload_2         
		//  242  472:getfield        #275 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
		//  243  475:invokevirtual   #279 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
				if(((VFullPath) (vpath)).mStrokeLineCap != null)
		//* 244  478:aload_2         
		//* 245  479:getfield        #283 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
		//* 246  482:ifnull          493
					((Paint) (vgroup)).setStrokeCap(((VFullPath) (vpath)).mStrokeLineCap);
		//  247  485:aload_1         
		//  248  486:aload_2         
		//  249  487:getfield        #283 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
		//  250  490:invokevirtual   #287 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
				((Paint) (vgroup)).setStrokeMiter(((VFullPath) (vpath)).mStrokeMiterlimit);
		//  251  493:aload_1         
		//  252  494:aload_2         
		//  253  495:getfield        #290 <Field float VectorDrawableCompat$VFullPath.mStrokeMiterlimit>
		//  254  498:invokevirtual   #294 <Method void Paint.setStrokeMiter(float)>
				((Paint) (vgroup)).setColor(VectorDrawableCompat.applyAlpha(((VFullPath) (vpath)).mStrokeColor, ((VFullPath) (vpath)).mStrokeAlpha));
		//  255  501:aload_1         
		//  256  502:aload_2         
		//  257  503:getfield        #268 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
		//  258  506:aload_2         
		//  259  507:getfield        #297 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
		//  260  510:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//  261  513:invokevirtual   #242 <Method void Paint.setColor(int)>
				((Paint) (vgroup)).setColorFilter(colorfilter);
		//  262  516:aload_1         
		//  263  517:aload           6
		//  264  519:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//  265  522:pop             
				((Paint) (vgroup)).setStrokeWidth(((VFullPath) (vpath)).mStrokeWidth * (f * f1));
		//  266  523:aload_1         
		//  267  524:aload_2         
		//  268  525:getfield        #300 <Field float VectorDrawableCompat$VFullPath.mStrokeWidth>
		//  269  528:fload           7
		//  270  530:fload           8
		//  271  532:fmul            
		//  272  533:fmul            
		//  273  534:invokevirtual   #303 <Method void Paint.setStrokeWidth(float)>
				canvas.drawPath(mRenderPath, ((Paint) (vgroup)));
		//  274  537:aload_3         
		//  275  538:aload_0         
		//  276  539:getfield        #75  <Field Path mRenderPath>
		//  277  542:aload_1         
		//  278  543:invokevirtual   #265 <Method void Canvas.drawPath(Path, Paint)>
			}
		//  279  546:return          
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
			setRootAlpha((int)(f * 255F));
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:ldc2            #327 <Float 255F>
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
	//   35   67:icmpeq          78
	//   36   70:iload_1         
	//   37   71:iconst_1        
	//   38   72:icmpeq          78
	//*  39   75:goto            58
		if(i == 2)
			break MISSING_BLOCK_LABEL_93;
	//   40   78:iload_1         
	//   41   79:iconst_2        
	//   42   80:icmpeq          93
		throw new XmlPullParserException("No start tag found");
	//   43   83:new             #134 <Class XmlPullParserException>
	//   44   86:dup             
	//   45   87:ldc1            #183 <String "No start tag found">
	//   46   89:invokespecial   #186 <Method void XmlPullParserException(String)>
	//   47   92:athrow          
		resources = ((Resources) (createFromXmlInner(resources, ((XmlPullParser) (xmlresourceparser)), attributeset, theme)));
	//   48   93:aload_0         
	//   49   94:aload_3         
	//   50   95:aload           4
	//   51   97:aload_2         
	//   52   98:invokestatic    #190 <Method VectorDrawableCompat createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   53  101:astore_0        
		return ((VectorDrawableCompat) (resources));
	//   54  102:aload_0         
	//   55  103:areturn         
		resources;
	//   56  104:astore_0        
		Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   57  105:ldc1            #43  <String "VectorDrawableCompat">
	//   58  107:ldc1            #192 <String "parser error">
	//   59  109:aload_0         
	//   60  110:invokestatic    #198 <Method int Log.e(String, String, Throwable)>
	//   61  113:pop             
		break MISSING_BLOCK_LABEL_127;
	//   62  114:goto            127
		resources;
	//   63  117:astore_0        
		Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   64  118:ldc1            #43  <String "VectorDrawableCompat">
	//   65  120:ldc1            #192 <String "parser error">
	//   66  122:aload_0         
	//   67  123:invokestatic    #198 <Method int Log.e(String, String, Throwable)>
	//   68  126:pop             
		return null;
	//   69  127:aconst_null     
	//   70  128:areturn         
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
		ArrayDeque arraydeque = new ArrayDeque();
	//    6   13:new             #211 <Class ArrayDeque>
	//    7   16:dup             
	//    8   17:invokespecial   #212 <Method void ArrayDeque()>
	//    9   20:astore          11
		arraydeque.push(((Object) (vpathrenderer.mRootGroup)));
	//   10   22:aload           11
	//   11   24:aload           10
	//   12   26:getfield        #216 <Field VectorDrawableCompat$VGroup VectorDrawableCompat$VPathRenderer.mRootGroup>
	//   13   29:invokevirtual   #220 <Method void ArrayDeque.push(Object)>
		int k = xmlpullparser.getEventType();
	//   14   32:aload_2         
	//   15   33:invokeinterface #223 <Method int XmlPullParser.getEventType()>
	//   16   38:istore          7
		int l = xmlpullparser.getDepth();
	//   17   40:aload_2         
	//   18   41:invokeinterface #226 <Method int XmlPullParser.getDepth()>
	//   19   46:istore          8
		int i;
		int j;
		for(i = 1; k != 1 && (xmlpullparser.getDepth() >= l + 1 || k != 3); i = j)
	//*  20   48:iconst_1        
	//*  21   49:istore          5
	//*  22   51:iload           7
	//*  23   53:iconst_1        
	//*  24   54:icmpeq          436
	//*  25   57:aload_2         
	//*  26   58:invokeinterface #226 <Method int XmlPullParser.getDepth()>
	//*  27   63:iload           8
	//*  28   65:iconst_1        
	//*  29   66:iadd            
	//*  30   67:icmpge          76
	//*  31   70:iload           7
	//*  32   72:iconst_3        
	//*  33   73:icmpeq          436
		{
			if(k == 2)
	//*  34   76:iload           7
	//*  35   78:iconst_2        
	//*  36   79:icmpne          383
			{
				Object obj = ((Object) (xmlpullparser.getName()));
	//   37   82:aload_2         
	//   38   83:invokeinterface #230 <Method String XmlPullParser.getName()>
	//   39   88:astore          13
				VGroup vgroup = (VGroup)arraydeque.peek();
	//   40   90:aload           11
	//   41   92:invokevirtual   #234 <Method Object ArrayDeque.peek()>
	//   42   95:checkcast       #12  <Class VectorDrawableCompat$VGroup>
	//   43   98:astore          12
				if("path".equals(obj))
	//*  44  100:ldc1            #54  <String "path">
	//*  45  102:aload           13
	//*  46  104:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  47  107:ifeq            190
				{
					obj = ((Object) (new VFullPath()));
	//   48  110:new             #9   <Class VectorDrawableCompat$VFullPath>
	//   49  113:dup             
	//   50  114:invokespecial   #241 <Method void VectorDrawableCompat$VFullPath()>
	//   51  117:astore          13
					((VFullPath) (obj)).inflate(resources, attributeset, theme, xmlpullparser);
	//   52  119:aload           13
	//   53  121:aload_1         
	//   54  122:aload_3         
	//   55  123:aload           4
	//   56  125:aload_2         
	//   57  126:invokevirtual   #244 <Method void VectorDrawableCompat$VFullPath.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					vgroup.mChildren.add(obj);
	//   58  129:aload           12
	//   59  131:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   60  134:aload           13
	//   61  136:invokevirtual   #253 <Method boolean ArrayList.add(Object)>
	//   62  139:pop             
					if(((VFullPath) (obj)).getPathName() != null)
	//*  63  140:aload           13
	//*  64  142:invokevirtual   #256 <Method String VectorDrawableCompat$VFullPath.getPathName()>
	//*  65  145:ifnull          164
						vpathrenderer.mVGTargetsMap.put(((Object) (((VFullPath) (obj)).getPathName())), obj);
	//   66  148:aload           10
	//   67  150:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//   68  153:aload           13
	//   69  155:invokevirtual   #256 <Method String VectorDrawableCompat$VFullPath.getPathName()>
	//   70  158:aload           13
	//   71  160:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//   72  163:pop             
					j = 0;
	//   73  164:iconst_0        
	//   74  165:istore          6
					i = vectordrawablecompatstate.mChangingConfigurations;
	//   75  167:aload           9
	//   76  169:getfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//   77  172:istore          5
					vectordrawablecompatstate.mChangingConfigurations = ((VFullPath) (obj)).mChangingConfigurations | i;
	//   78  174:aload           9
	//   79  176:aload           13
	//   80  178:getfield        #270 <Field int VectorDrawableCompat$VFullPath.mChangingConfigurations>
	//   81  181:iload           5
	//   82  183:ior             
	//   83  184:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
				} else
	//*  84  187:goto            421
				if("clip-path".equals(obj))
	//*  85  190:ldc1            #48  <String "clip-path">
	//*  86  192:aload           13
	//*  87  194:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  88  197:ifeq            281
				{
					obj = ((Object) (new VClipPath()));
	//   89  200:new             #6   <Class VectorDrawableCompat$VClipPath>
	//   90  203:dup             
	//   91  204:invokespecial   #271 <Method void VectorDrawableCompat$VClipPath()>
	//   92  207:astore          13
					((VClipPath) (obj)).inflate(resources, attributeset, theme, xmlpullparser);
	//   93  209:aload           13
	//   94  211:aload_1         
	//   95  212:aload_3         
	//   96  213:aload           4
	//   97  215:aload_2         
	//   98  216:invokevirtual   #272 <Method void VectorDrawableCompat$VClipPath.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					vgroup.mChildren.add(obj);
	//   99  219:aload           12
	//  100  221:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//  101  224:aload           13
	//  102  226:invokevirtual   #253 <Method boolean ArrayList.add(Object)>
	//  103  229:pop             
					if(((VClipPath) (obj)).getPathName() != null)
	//* 104  230:aload           13
	//* 105  232:invokevirtual   #273 <Method String VectorDrawableCompat$VClipPath.getPathName()>
	//* 106  235:ifnull          254
						vpathrenderer.mVGTargetsMap.put(((Object) (((VClipPath) (obj)).getPathName())), obj);
	//  107  238:aload           10
	//  108  240:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  109  243:aload           13
	//  110  245:invokevirtual   #273 <Method String VectorDrawableCompat$VClipPath.getPathName()>
	//  111  248:aload           13
	//  112  250:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//  113  253:pop             
					j = vectordrawablecompatstate.mChangingConfigurations;
	//  114  254:aload           9
	//  115  256:getfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//  116  259:istore          6
					vectordrawablecompatstate.mChangingConfigurations = ((VClipPath) (obj)).mChangingConfigurations | j;
	//  117  261:aload           9
	//  118  263:aload           13
	//  119  265:getfield        #274 <Field int VectorDrawableCompat$VClipPath.mChangingConfigurations>
	//  120  268:iload           6
	//  121  270:ior             
	//  122  271:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
					j = i;
	//  123  274:iload           5
	//  124  276:istore          6
				} else
	//* 125  278:goto            421
				{
					j = i;
	//  126  281:iload           5
	//  127  283:istore          6
					if("group".equals(obj))
	//* 128  285:ldc1            #51  <String "group">
	//* 129  287:aload           13
	//* 130  289:invokevirtual   #240 <Method boolean String.equals(Object)>
	//* 131  292:ifeq            421
					{
						VGroup vgroup1 = new VGroup();
	//  132  295:new             #12  <Class VectorDrawableCompat$VGroup>
	//  133  298:dup             
	//  134  299:invokespecial   #275 <Method void VectorDrawableCompat$VGroup()>
	//  135  302:astore          13
						vgroup1.inflate(resources, attributeset, theme, xmlpullparser);
	//  136  304:aload           13
	//  137  306:aload_1         
	//  138  307:aload_3         
	//  139  308:aload           4
	//  140  310:aload_2         
	//  141  311:invokevirtual   #276 <Method void VectorDrawableCompat$VGroup.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
						vgroup.mChildren.add(((Object) (vgroup1)));
	//  142  314:aload           12
	//  143  316:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//  144  319:aload           13
	//  145  321:invokevirtual   #253 <Method boolean ArrayList.add(Object)>
	//  146  324:pop             
						arraydeque.push(((Object) (vgroup1)));
	//  147  325:aload           11
	//  148  327:aload           13
	//  149  329:invokevirtual   #220 <Method void ArrayDeque.push(Object)>
						if(vgroup1.getGroupName() != null)
	//* 150  332:aload           13
	//* 151  334:invokevirtual   #279 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//* 152  337:ifnull          356
							vpathrenderer.mVGTargetsMap.put(((Object) (vgroup1.getGroupName())), ((Object) (vgroup1)));
	//  153  340:aload           10
	//  154  342:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  155  345:aload           13
	//  156  347:invokevirtual   #279 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//  157  350:aload           13
	//  158  352:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//  159  355:pop             
						j = vectordrawablecompatstate.mChangingConfigurations;
	//  160  356:aload           9
	//  161  358:getfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//  162  361:istore          6
						vectordrawablecompatstate.mChangingConfigurations = vgroup1.mChangingConfigurations | j;
	//  163  363:aload           9
	//  164  365:aload           13
	//  165  367:getfield        #280 <Field int VectorDrawableCompat$VGroup.mChangingConfigurations>
	//  166  370:iload           6
	//  167  372:ior             
	//  168  373:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
						j = i;
	//  169  376:iload           5
	//  170  378:istore          6
					}
				}
			} else
	//* 171  380:goto            421
			{
				j = i;
	//  172  383:iload           5
	//  173  385:istore          6
				if(k == 3)
	//* 174  387:iload           7
	//* 175  389:iconst_3        
	//* 176  390:icmpne          421
				{
					j = i;
	//  177  393:iload           5
	//  178  395:istore          6
					if("group".equals(((Object) (xmlpullparser.getName()))))
	//* 179  397:ldc1            #51  <String "group">
	//* 180  399:aload_2         
	//* 181  400:invokeinterface #230 <Method String XmlPullParser.getName()>
	//* 182  405:invokevirtual   #240 <Method boolean String.equals(Object)>
	//* 183  408:ifeq            421
					{
						arraydeque.pop();
	//  184  411:aload           11
	//  185  413:invokevirtual   #283 <Method Object ArrayDeque.pop()>
	//  186  416:pop             
						j = i;
	//  187  417:iload           5
	//  188  419:istore          6
					}
				}
			}
			k = xmlpullparser.next();
	//  189  421:aload_2         
	//  190  422:invokeinterface #181 <Method int XmlPullParser.next()>
	//  191  427:istore          7
		}

	//  192  429:iload           6
	//  193  431:istore          5
	//* 194  433:goto            51
		if(i != 0)
	//* 195  436:iload           5
	//* 196  438:ifeq            452
			throw new XmlPullParserException("no path defined");
	//  197  441:new             #134 <Class XmlPullParserException>
	//  198  444:dup             
	//  199  445:ldc2            #285 <String "no path defined">
	//  200  448:invokespecial   #186 <Method void XmlPullParserException(String)>
	//  201  451:athrow          
		else
			return;
	//  202  452:return          
	}

	private boolean needMirroring()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		if(i >= 17)
	//*   4    6:iload_1         
	//*   5    7:bipush          17
	//*   6    9:icmplt          35
		{
			boolean flag = flag1;
	//    7   12:iload_3         
	//    8   13:istore_2        
			if(isAutoMirrored())
	//*   9   14:aload_0         
	//*  10   15:invokevirtual   #290 <Method boolean isAutoMirrored()>
	//*  11   18:ifeq            33
			{
				flag = flag1;
	//   12   21:iload_3         
	//   13   22:istore_2        
				if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 1)
	//*  14   23:aload_0         
	//*  15   24:invokestatic    #296 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  16   27:iconst_1        
	//*  17   28:icmpne          33
					flag = true;
	//   18   31:iconst_1        
	//   19   32:istore_2        
			}
			return flag;
	//   20   33:iload_2         
	//   21   34:ireturn         
		} else
		{
			return false;
	//   22   35:iconst_0        
	//   23   36:ireturn         
		}
	}

	private static android.graphics.PorterDuff.Mode parseTintModeCompat(int i, android.graphics.PorterDuff.Mode mode)
	{
		if(i != 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:icmpeq          66
		{
			if(i != 5)
	//*   3    5:iload_0         
	//*   4    6:iconst_5        
	//*   5    7:icmpeq          62
			{
				if(i != 9)
	//*   6   10:iload_0         
	//*   7   11:bipush          9
	//*   8   13:icmpeq          58
					switch(i)
	//*   9   16:iload_0         
					{
	//*  10   17:tableswitch     14 16: default 44
	//	               14 54
	//	               15 50
	//	               16 46
					default:
						return mode;
	//   11   44:aload_1         
	//   12   45:areturn         

					case 16: // '\020'
						return android.graphics.PorterDuff.Mode.ADD;
	//   13   46:getstatic       #301 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.ADD>
	//   14   49:areturn         

					case 15: // '\017'
						return android.graphics.PorterDuff.Mode.SCREEN;
	//   15   50:getstatic       #304 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   16   53:areturn         

					case 14: // '\016'
						return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   17   54:getstatic       #307 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   18   57:areturn         
					}
				else
					return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//   19   58:getstatic       #310 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   20   61:areturn         
			} else
			{
				return android.graphics.PorterDuff.Mode.SRC_IN;
	//   21   62:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   22   65:areturn         
			}
		} else
		{
			return android.graphics.PorterDuff.Mode.SRC_OVER;
	//   23   66:getstatic       #313 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   24   69:areturn         
		}
	}

	private void printGroupTree(VGroup vgroup, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		String s = "";
	//    2    3:ldc2            #317 <String "">
	//    3    6:astore          5
		for(int j = 0; j < i; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iload_2         
	//*   8   12:icmpge          55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #319 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #320 <Method void StringBuilder()>
	//   12   22:astore          6
			stringbuilder.append(s);
	//   13   24:aload           6
	//   14   26:aload           5
	//   15   28:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append("    ");
	//   17   32:aload           6
	//   18   34:ldc2            #326 <String "    ">
	//   19   37:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			s = stringbuilder.toString();
	//   21   41:aload           6
	//   22   43:invokevirtual   #329 <Method String StringBuilder.toString()>
	//   23   46:astore          5
		}

	//   24   48:iload_3         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_3        
	//*  28   52:goto            10
		StringBuilder stringbuilder1 = new StringBuilder();
	//   29   55:new             #319 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #320 <Method void StringBuilder()>
	//   32   62:astore          6
		stringbuilder1.append(s);
	//   33   64:aload           6
	//   34   66:aload           5
	//   35   68:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		stringbuilder1.append("current group is :");
	//   37   72:aload           6
	//   38   74:ldc2            #331 <String "current group is :">
	//   39   77:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
		stringbuilder1.append(vgroup.getGroupName());
	//   41   81:aload           6
	//   42   83:aload_1         
	//   43   84:invokevirtual   #279 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//   44   87:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
		stringbuilder1.append(" rotation is ");
	//   46   91:aload           6
	//   47   93:ldc2            #333 <String " rotation is ">
	//   48   96:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		stringbuilder1.append(vgroup.mRotate);
	//   50  100:aload           6
	//   51  102:aload_1         
	//   52  103:getfield        #337 <Field float VectorDrawableCompat$VGroup.mRotate>
	//   53  106:invokevirtual   #340 <Method StringBuilder StringBuilder.append(float)>
	//   54  109:pop             
		Log.v("VectorDrawableCompat", stringbuilder1.toString());
	//   55  110:ldc1            #43  <String "VectorDrawableCompat">
	//   56  112:aload           6
	//   57  114:invokevirtual   #329 <Method String StringBuilder.toString()>
	//   58  117:invokestatic    #344 <Method int Log.v(String, String)>
	//   59  120:pop             
		stringbuilder1 = new StringBuilder();
	//   60  121:new             #319 <Class StringBuilder>
	//   61  124:dup             
	//   62  125:invokespecial   #320 <Method void StringBuilder()>
	//   63  128:astore          6
		stringbuilder1.append(s);
	//   64  130:aload           6
	//   65  132:aload           5
	//   66  134:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   67  137:pop             
		stringbuilder1.append("matrix is :");
	//   68  138:aload           6
	//   69  140:ldc2            #346 <String "matrix is :">
	//   70  143:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   71  146:pop             
		stringbuilder1.append(vgroup.getLocalMatrix().toString());
	//   72  147:aload           6
	//   73  149:aload_1         
	//   74  150:invokevirtual   #350 <Method Matrix VectorDrawableCompat$VGroup.getLocalMatrix()>
	//   75  153:invokevirtual   #351 <Method String Matrix.toString()>
	//   76  156:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   77  159:pop             
		Log.v("VectorDrawableCompat", stringbuilder1.toString());
	//   78  160:ldc1            #43  <String "VectorDrawableCompat">
	//   79  162:aload           6
	//   80  164:invokevirtual   #329 <Method String StringBuilder.toString()>
	//   81  167:invokestatic    #344 <Method int Log.v(String, String)>
	//   82  170:pop             
		for(int k = ((int) (flag)); k < vgroup.mChildren.size(); k++)
	//*  83  171:iload           4
	//*  84  173:istore_3        
	//*  85  174:iload_3         
	//*  86  175:aload_1         
	//*  87  176:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//*  88  179:invokevirtual   #354 <Method int ArrayList.size()>
	//*  89  182:icmpge          236
		{
			Object obj = vgroup.mChildren.get(k);
	//   90  185:aload_1         
	//   91  186:getfield        #248 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   92  189:iload_3         
	//   93  190:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   94  193:astore          5
			if(obj instanceof VGroup)
	//*  95  195:aload           5
	//*  96  197:instanceof      #12  <Class VectorDrawableCompat$VGroup>
	//*  97  200:ifeq            218
				printGroupTree((VGroup)obj, i + 1);
	//   98  203:aload_0         
	//   99  204:aload           5
	//  100  206:checkcast       #12  <Class VectorDrawableCompat$VGroup>
	//  101  209:iload_2         
	//  102  210:iconst_1        
	//  103  211:iadd            
	//  104  212:invokespecial   #360 <Method void printGroupTree(VectorDrawableCompat$VGroup, int)>
			else
	//* 105  215:goto            229
				((VPath)obj).printVPath(i + 1);
	//  106  218:aload           5
	//  107  220:checkcast       #15  <Class VectorDrawableCompat$VPath>
	//  108  223:iload_2         
	//  109  224:iconst_1        
	//  110  225:iadd            
	//  111  226:invokevirtual   #364 <Method void VectorDrawableCompat$VPath.printVPath(int)>
		}

	//  112  229:iload_3         
	//  113  230:iconst_1        
	//  114  231:iadd            
	//  115  232:istore_3        
	//* 116  233:goto            174
	//  117  236:return          
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
	//    9   16:ldc2            #368 <String "tintMode">
	//   10   19:bipush          6
	//   11   21:iconst_m1       
	//   12   22:invokestatic    #374 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   13   25:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   14   28:invokestatic    #376 <Method android.graphics.PorterDuff$Mode parseTintModeCompat(int, android.graphics.PorterDuff$Mode)>
	//   15   31:putfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
		ColorStateList colorstatelist = typedarray.getColorStateList(1);
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #382 <Method ColorStateList TypedArray.getColorStateList(int)>
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
	//   28   57:ldc2            #384 <String "autoMirrored">
	//   29   60:iconst_5        
	//   30   61:aload           4
	//   31   63:getfield        #387 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
	//   32   66:invokestatic    #391 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   33   69:putfield        #387 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
		vpathrenderer.mViewportWidth = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportWidth", 7, vpathrenderer.mViewportWidth);
	//   34   72:aload_3         
	//   35   73:aload_1         
	//   36   74:aload_2         
	//   37   75:ldc2            #393 <String "viewportWidth">
	//   38   78:bipush          7
	//   39   80:aload_3         
	//   40   81:getfield        #396 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//   41   84:invokestatic    #400 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   42   87:putfield        #396 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
		vpathrenderer.mViewportHeight = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportHeight", 8, vpathrenderer.mViewportHeight);
	//   43   90:aload_3         
	//   44   91:aload_1         
	//   45   92:aload_2         
	//   46   93:ldc2            #402 <String "viewportHeight">
	//   47   96:bipush          8
	//   48   98:aload_3         
	//   49   99:getfield        #405 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//   50  102:invokestatic    #400 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   51  105:putfield        #405 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
		if(vpathrenderer.mViewportWidth <= 0.0F)
	//*  52  108:aload_3         
	//*  53  109:getfield        #396 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//*  54  112:fconst_0        
	//*  55  113:fcmpg           
	//*  56  114:ifgt            154
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//   57  117:new             #319 <Class StringBuilder>
	//   58  120:dup             
	//   59  121:invokespecial   #320 <Method void StringBuilder()>
	//   60  124:astore_2        
			((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//   61  125:aload_2         
	//   62  126:aload_1         
	//   63  127:invokevirtual   #408 <Method String TypedArray.getPositionDescription()>
	//   64  130:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   65  133:pop             
			((StringBuilder) (xmlpullparser)).append("<vector> tag requires viewportWidth > 0");
	//   66  134:aload_2         
	//   67  135:ldc2            #410 <String "<vector> tag requires viewportWidth > 0">
	//   68  138:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   69  141:pop             
			throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//   70  142:new             #134 <Class XmlPullParserException>
	//   71  145:dup             
	//   72  146:aload_2         
	//   73  147:invokevirtual   #329 <Method String StringBuilder.toString()>
	//   74  150:invokespecial   #186 <Method void XmlPullParserException(String)>
	//   75  153:athrow          
		}
		if(vpathrenderer.mViewportHeight <= 0.0F)
	//*  76  154:aload_3         
	//*  77  155:getfield        #405 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//*  78  158:fconst_0        
	//*  79  159:fcmpg           
	//*  80  160:ifgt            200
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//   81  163:new             #319 <Class StringBuilder>
	//   82  166:dup             
	//   83  167:invokespecial   #320 <Method void StringBuilder()>
	//   84  170:astore_2        
			((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//   85  171:aload_2         
	//   86  172:aload_1         
	//   87  173:invokevirtual   #408 <Method String TypedArray.getPositionDescription()>
	//   88  176:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   89  179:pop             
			((StringBuilder) (xmlpullparser)).append("<vector> tag requires viewportHeight > 0");
	//   90  180:aload_2         
	//   91  181:ldc2            #412 <String "<vector> tag requires viewportHeight > 0">
	//   92  184:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   93  187:pop             
			throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//   94  188:new             #134 <Class XmlPullParserException>
	//   95  191:dup             
	//   96  192:aload_2         
	//   97  193:invokevirtual   #329 <Method String StringBuilder.toString()>
	//   98  196:invokespecial   #186 <Method void XmlPullParserException(String)>
	//   99  199:athrow          
		}
		vpathrenderer.mBaseWidth = typedarray.getDimension(3, vpathrenderer.mBaseWidth);
	//  100  200:aload_3         
	//  101  201:aload_1         
	//  102  202:iconst_3        
	//  103  203:aload_3         
	//  104  204:getfield        #415 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//  105  207:invokevirtual   #419 <Method float TypedArray.getDimension(int, float)>
	//  106  210:putfield        #415 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
		vpathrenderer.mBaseHeight = typedarray.getDimension(2, vpathrenderer.mBaseHeight);
	//  107  213:aload_3         
	//  108  214:aload_1         
	//  109  215:iconst_2        
	//  110  216:aload_3         
	//  111  217:getfield        #422 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//  112  220:invokevirtual   #419 <Method float TypedArray.getDimension(int, float)>
	//  113  223:putfield        #422 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
		if(vpathrenderer.mBaseWidth <= 0.0F)
	//* 114  226:aload_3         
	//* 115  227:getfield        #415 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//* 116  230:fconst_0        
	//* 117  231:fcmpg           
	//* 118  232:ifgt            272
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  119  235:new             #319 <Class StringBuilder>
	//  120  238:dup             
	//  121  239:invokespecial   #320 <Method void StringBuilder()>
	//  122  242:astore_2        
			((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//  123  243:aload_2         
	//  124  244:aload_1         
	//  125  245:invokevirtual   #408 <Method String TypedArray.getPositionDescription()>
	//  126  248:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//  127  251:pop             
			((StringBuilder) (xmlpullparser)).append("<vector> tag requires width > 0");
	//  128  252:aload_2         
	//  129  253:ldc2            #424 <String "<vector> tag requires width > 0">
	//  130  256:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//  131  259:pop             
			throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//  132  260:new             #134 <Class XmlPullParserException>
	//  133  263:dup             
	//  134  264:aload_2         
	//  135  265:invokevirtual   #329 <Method String StringBuilder.toString()>
	//  136  268:invokespecial   #186 <Method void XmlPullParserException(String)>
	//  137  271:athrow          
		}
		if(vpathrenderer.mBaseHeight <= 0.0F)
	//* 138  272:aload_3         
	//* 139  273:getfield        #422 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//* 140  276:fconst_0        
	//* 141  277:fcmpg           
	//* 142  278:ifgt            318
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  143  281:new             #319 <Class StringBuilder>
	//  144  284:dup             
	//  145  285:invokespecial   #320 <Method void StringBuilder()>
	//  146  288:astore_2        
			((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//  147  289:aload_2         
	//  148  290:aload_1         
	//  149  291:invokevirtual   #408 <Method String TypedArray.getPositionDescription()>
	//  150  294:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//  151  297:pop             
			((StringBuilder) (xmlpullparser)).append("<vector> tag requires height > 0");
	//  152  298:aload_2         
	//  153  299:ldc2            #426 <String "<vector> tag requires height > 0">
	//  154  302:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//  155  305:pop             
			throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//  156  306:new             #134 <Class XmlPullParserException>
	//  157  309:dup             
	//  158  310:aload_2         
	//  159  311:invokevirtual   #329 <Method String StringBuilder.toString()>
	//  160  314:invokespecial   #186 <Method void XmlPullParserException(String)>
	//  161  317:athrow          
		}
		vpathrenderer.setAlpha(TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "alpha", 4, vpathrenderer.getAlpha()));
	//  162  318:aload_3         
	//  163  319:aload_1         
	//  164  320:aload_2         
	//  165  321:ldc2            #427 <String "alpha">
	//  166  324:iconst_4        
	//  167  325:aload_3         
	//  168  326:invokevirtual   #431 <Method float VectorDrawableCompat$VPathRenderer.getAlpha()>
	//  169  329:invokestatic    #400 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  170  332:invokevirtual   #435 <Method void VectorDrawableCompat$VPathRenderer.setAlpha(float)>
		typedarray = ((TypedArray) (typedarray.getString(0)));
	//  171  335:aload_1         
	//  172  336:iconst_0        
	//  173  337:invokevirtual   #439 <Method String TypedArray.getString(int)>
	//  174  340:astore_1        
		if(typedarray != null)
	//* 175  341:aload_1         
	//* 176  342:ifnull          360
		{
			vpathrenderer.mRootName = ((String) (typedarray));
	//  177  345:aload_3         
	//  178  346:aload_1         
	//  179  347:putfield        #442 <Field String VectorDrawableCompat$VPathRenderer.mRootName>
			vpathrenderer.mVGTargetsMap.put(((Object) (typedarray)), ((Object) (vpathrenderer)));
	//  180  350:aload_3         
	//  181  351:getfield        #260 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  182  354:aload_1         
	//  183  355:aload_3         
	//  184  356:invokevirtual   #266 <Method Object ArrayMap.put(Object, Object)>
	//  185  359:pop             
		}
	//  186  360:return          
	}

	public volatile void applyTheme(android.content.res.Resources.Theme theme)
	{
		super.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #446 <Method void VectorDrawableCommon.applyTheme(android.content.res.Resources$Theme)>
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
	//    5   11:invokestatic    #450 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
	//    6   14:pop             
		return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #453 <Method void VectorDrawableCommon.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #457 <Method void Drawable.draw(Canvas)>
			return;
	//    7   15:return          
		}
		copyBounds(mTmpBounds);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #100 <Field Rect mTmpBounds>
	//   11   21:invokevirtual   #461 <Method void copyBounds(Rect)>
		if(mTmpBounds.width() > 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #100 <Field Rect mTmpBounds>
	//*  14   28:invokevirtual   #464 <Method int Rect.width()>
	//*  15   31:ifle            348
		{
			if(mTmpBounds.height() <= 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #100 <Field Rect mTmpBounds>
	//*  18   38:invokevirtual   #467 <Method int Rect.height()>
	//*  19   41:ifgt            45
				return;
	//   20   44:return          
			Object obj;
			if(mColorFilter == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #469 <Field ColorFilter mColorFilter>
	//*  23   49:ifnonnull       61
				obj = ((Object) (mTintFilter));
	//   24   52:aload_0         
	//   25   53:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   26   56:astore          9
			else
	//*  27   58:goto            67
				obj = ((Object) (mColorFilter));
	//   28   61:aload_0         
	//   29   62:getfield        #469 <Field ColorFilter mColorFilter>
	//   30   65:astore          9
			canvas.getMatrix(mTmpMatrix);
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #95  <Field Matrix mTmpMatrix>
	//   34   72:invokevirtual   #475 <Method void Canvas.getMatrix(Matrix)>
			mTmpMatrix.getValues(mTmpFloats);
	//   35   75:aload_0         
	//   36   76:getfield        #95  <Field Matrix mTmpMatrix>
	//   37   79:aload_0         
	//   38   80:getfield        #90  <Field float[] mTmpFloats>
	//   39   83:invokevirtual   #479 <Method void Matrix.getValues(float[])>
			float f = Math.abs(mTmpFloats[0]);
	//   40   86:aload_0         
	//   41   87:getfield        #90  <Field float[] mTmpFloats>
	//   42   90:iconst_0        
	//   43   91:faload          
	//   44   92:invokestatic    #485 <Method float Math.abs(float)>
	//   45   95:fstore_2        
			float f1 = Math.abs(mTmpFloats[4]);
	//   46   96:aload_0         
	//   47   97:getfield        #90  <Field float[] mTmpFloats>
	//   48  100:iconst_4        
	//   49  101:faload          
	//   50  102:invokestatic    #485 <Method float Math.abs(float)>
	//   51  105:fstore_3        
			float f3 = Math.abs(mTmpFloats[1]);
	//   52  106:aload_0         
	//   53  107:getfield        #90  <Field float[] mTmpFloats>
	//   54  110:iconst_1        
	//   55  111:faload          
	//   56  112:invokestatic    #485 <Method float Math.abs(float)>
	//   57  115:fstore          5
			float f2 = Math.abs(mTmpFloats[3]);
	//   58  117:aload_0         
	//   59  118:getfield        #90  <Field float[] mTmpFloats>
	//   60  121:iconst_3        
	//   61  122:faload          
	//   62  123:invokestatic    #485 <Method float Math.abs(float)>
	//   63  126:fstore          4
			if(f3 != 0.0F || f2 != 0.0F)
	//*  64  128:fload           5
	//*  65  130:fconst_0        
	//*  66  131:fcmpl           
	//*  67  132:ifne            142
	//*  68  135:fload           4
	//*  69  137:fconst_0        
	//*  70  138:fcmpl           
	//*  71  139:ifeq            146
			{
				f = 1.0F;
	//   72  142:fconst_1        
	//   73  143:fstore_2        
				f1 = f;
	//   74  144:fload_2         
	//   75  145:fstore_3        
			}
			int i = (int)((float)mTmpBounds.width() * f);
	//   76  146:aload_0         
	//   77  147:getfield        #100 <Field Rect mTmpBounds>
	//   78  150:invokevirtual   #464 <Method int Rect.width()>
	//   79  153:i2f             
	//   80  154:fload_2         
	//   81  155:fmul            
	//   82  156:f2i             
	//   83  157:istore          6
			int j = (int)((float)mTmpBounds.height() * f1);
	//   84  159:aload_0         
	//   85  160:getfield        #100 <Field Rect mTmpBounds>
	//   86  163:invokevirtual   #467 <Method int Rect.height()>
	//   87  166:i2f             
	//   88  167:fload_3         
	//   89  168:fmul            
	//   90  169:f2i             
	//   91  170:istore          7
			i = Math.min(2048, i);
	//   92  172:sipush          2048
	//   93  175:iload           6
	//   94  177:invokestatic    #489 <Method int Math.min(int, int)>
	//   95  180:istore          6
			j = Math.min(2048, j);
	//   96  182:sipush          2048
	//   97  185:iload           7
	//   98  187:invokestatic    #489 <Method int Math.min(int, int)>
	//   99  190:istore          7
			if(i > 0)
	//* 100  192:iload           6
	//* 101  194:ifle            347
			{
				if(j <= 0)
	//* 102  197:iload           7
	//* 103  199:ifgt            203
					return;
	//  104  202:return          
				int k = canvas.save();
	//  105  203:aload_1         
	//  106  204:invokevirtual   #492 <Method int Canvas.save()>
	//  107  207:istore          8
				canvas.translate(mTmpBounds.left, mTmpBounds.top);
	//  108  209:aload_1         
	//  109  210:aload_0         
	//  110  211:getfield        #100 <Field Rect mTmpBounds>
	//  111  214:getfield        #495 <Field int Rect.left>
	//  112  217:i2f             
	//  113  218:aload_0         
	//  114  219:getfield        #100 <Field Rect mTmpBounds>
	//  115  222:getfield        #498 <Field int Rect.top>
	//  116  225:i2f             
	//  117  226:invokevirtual   #502 <Method void Canvas.translate(float, float)>
				if(needMirroring())
	//* 118  229:aload_0         
	//* 119  230:invokespecial   #504 <Method boolean needMirroring()>
	//* 120  233:ifeq            257
				{
					canvas.translate(mTmpBounds.width(), 0.0F);
	//  121  236:aload_1         
	//  122  237:aload_0         
	//  123  238:getfield        #100 <Field Rect mTmpBounds>
	//  124  241:invokevirtual   #464 <Method int Rect.width()>
	//  125  244:i2f             
	//  126  245:fconst_0        
	//  127  246:invokevirtual   #502 <Method void Canvas.translate(float, float)>
					canvas.scale(-1F, 1.0F);
	//  128  249:aload_1         
	//  129  250:ldc2            #505 <Float -1F>
	//  130  253:fconst_1        
	//  131  254:invokevirtual   #508 <Method void Canvas.scale(float, float)>
				}
				mTmpBounds.offsetTo(0, 0);
	//  132  257:aload_0         
	//  133  258:getfield        #100 <Field Rect mTmpBounds>
	//  134  261:iconst_0        
	//  135  262:iconst_0        
	//  136  263:invokevirtual   #512 <Method void Rect.offsetTo(int, int)>
				mVectorState.createCachedBitmapIfNeeded(i, j);
	//  137  266:aload_0         
	//  138  267:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  139  270:iload           6
	//  140  272:iload           7
	//  141  274:invokevirtual   #515 <Method void VectorDrawableCompat$VectorDrawableCompatState.createCachedBitmapIfNeeded(int, int)>
				if(!mAllowCaching)
	//* 142  277:aload_0         
	//* 143  278:getfield        #88  <Field boolean mAllowCaching>
	//* 144  281:ifne            298
					mVectorState.updateCachedBitmap(i, j);
	//  145  284:aload_0         
	//  146  285:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  147  288:iload           6
	//  148  290:iload           7
	//  149  292:invokevirtual   #518 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCachedBitmap(int, int)>
				else
	//* 150  295:goto            326
				if(!mVectorState.canReuseCache())
	//* 151  298:aload_0         
	//* 152  299:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//* 153  302:invokevirtual   #521 <Method boolean VectorDrawableCompat$VectorDrawableCompatState.canReuseCache()>
	//* 154  305:ifne            326
				{
					mVectorState.updateCachedBitmap(i, j);
	//  155  308:aload_0         
	//  156  309:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  157  312:iload           6
	//  158  314:iload           7
	//  159  316:invokevirtual   #518 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCachedBitmap(int, int)>
					mVectorState.updateCacheStates();
	//  160  319:aload_0         
	//  161  320:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  162  323:invokevirtual   #524 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCacheStates()>
				}
				mVectorState.drawCachedBitmapWithRootAlpha(canvas, ((ColorFilter) (obj)), mTmpBounds);
	//  163  326:aload_0         
	//  164  327:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  165  330:aload_1         
	//  166  331:aload           9
	//  167  333:aload_0         
	//  168  334:getfield        #100 <Field Rect mTmpBounds>
	//  169  337:invokevirtual   #528 <Method void VectorDrawableCompat$VectorDrawableCompatState.drawCachedBitmapWithRootAlpha(Canvas, ColorFilter, Rect)>
				canvas.restoreToCount(k);
	//  170  340:aload_1         
	//  171  341:iload           8
	//  172  343:invokevirtual   #531 <Method void Canvas.restoreToCount(int)>
				return;
	//  173  346:return          
			} else
			{
				return;
	//  174  347:return          
			}
		} else
		{
			return;
	//  175  348:return          
		}
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
	//    5   11:invokestatic    #533 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.mVPathRenderer.getRootAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:invokevirtual   #536 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
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
	//    5   11:invokevirtual   #539 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mVectorState.getChangingConfigurations();
	//    7   15:aload_0         
	//    8   16:invokespecial   #540 <Method int VectorDrawableCommon.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   11   23:invokevirtual   #541 <Method int VectorDrawableCompat$VectorDrawableCompatState.getChangingConfigurations()>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #545 <Method ColorFilter VectorDrawableCommon.getColorFilter()>
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
	//   16   35:invokevirtual   #546 <Method int getChangingConfigurations()>
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
	//    1    1:invokespecial   #550 <Method Drawable VectorDrawableCommon.getCurrent()>
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
	//    5   11:invokevirtual   #553 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.mVPathRenderer.mBaseHeight;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:getfield        #422 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
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
	//    5   11:invokevirtual   #556 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.mVPathRenderer.mBaseWidth;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:getfield        #415 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #559 <Method int VectorDrawableCommon.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #562 <Method int VectorDrawableCommon.getMinimumWidth()>
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
	//    5   11:invokevirtual   #565 <Method int Drawable.getOpacity()>
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
	//    2    2:invokespecial   #569 <Method boolean VectorDrawableCommon.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public float getPixelSize()
	{
		if(mVectorState != null && mVectorState.mVPathRenderer != null && mVectorState.mVPathRenderer.mBaseWidth != 0.0F && mVectorState.mVPathRenderer.mBaseHeight != 0.0F && mVectorState.mVPathRenderer.mViewportHeight != 0.0F && mVectorState.mVPathRenderer.mViewportWidth != 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*   2    4:ifnull          136
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*   5   11:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*   6   14:ifnull          136
	//*   7   17:aload_0         
	//*   8   18:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*   9   21:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  10   24:getfield        #415 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//*  11   27:fconst_0        
	//*  12   28:fcmpl           
	//*  13   29:ifeq            136
	//*  14   32:aload_0         
	//*  15   33:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  16   36:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  17   39:getfield        #422 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//*  18   42:fconst_0        
	//*  19   43:fcmpl           
	//*  20   44:ifeq            136
	//*  21   47:aload_0         
	//*  22   48:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  23   51:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  24   54:getfield        #405 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//*  25   57:fconst_0        
	//*  26   58:fcmpl           
	//*  27   59:ifeq            136
	//*  28   62:aload_0         
	//*  29   63:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  30   66:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  31   69:getfield        #396 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//*  32   72:fconst_0        
	//*  33   73:fcmpl           
	//*  34   74:ifne            80
	//*  35   77:goto            136
		{
			float f = mVectorState.mVPathRenderer.mBaseWidth;
	//   36   80:aload_0         
	//   37   81:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   38   84:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   39   87:getfield        #415 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   40   90:fstore_1        
			float f1 = mVectorState.mVPathRenderer.mBaseHeight;
	//   41   91:aload_0         
	//   42   92:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   43   95:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   44   98:getfield        #422 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//   45  101:fstore_2        
			float f2 = mVectorState.mVPathRenderer.mViewportWidth;
	//   46  102:aload_0         
	//   47  103:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   48  106:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   49  109:getfield        #396 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//   50  112:fstore_3        
			float f3 = mVectorState.mVPathRenderer.mViewportHeight;
	//   51  113:aload_0         
	//   52  114:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   53  117:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   54  120:getfield        #405 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//   55  123:fstore          4
			return Math.min(f2 / f, f3 / f1);
	//   56  125:fload_3         
	//   57  126:fload_1         
	//   58  127:fdiv            
	//   59  128:fload           4
	//   60  130:fload_2         
	//   61  131:fdiv            
	//   62  132:invokestatic    #577 <Method float Math.min(float, float)>
	//   63  135:freturn         
		} else
		{
			return 1.0F;
	//   64  136:fconst_1        
	//   65  137:freturn         
		}
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #581 <Method int[] VectorDrawableCommon.getState()>
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
	//    5   11:invokevirtual   #586 <Method Object ArrayMap.get(Object)>
	//    6   14:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #590 <Method Region VectorDrawableCommon.getTransparentRegion()>
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
	//    8   14:invokevirtual   #593 <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
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
	//    9   16:invokestatic    #596 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
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
	//   17   32:invokespecial   #597 <Method void VectorDrawableCompat$VPathRenderer()>
	//   18   35:putfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
			TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
	//   19   38:aload_1         
	//   20   39:aload           4
	//   21   41:aload_3         
	//   22   42:getstatic       #603 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY>
	//   23   45:invokestatic    #607 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   24   48:astore          6
			updateStateFromTypedArray(typedarray, xmlpullparser);
	//   25   50:aload_0         
	//   26   51:aload           6
	//   27   53:aload_2         
	//   28   54:invokespecial   #609 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			typedarray.recycle();
	//   29   57:aload           6
	//   30   59:invokevirtual   #612 <Method void TypedArray.recycle()>
			vectordrawablecompatstate.mChangingConfigurations = getChangingConfigurations();
	//   31   62:aload           5
	//   32   64:aload_0         
	//   33   65:invokevirtual   #546 <Method int getChangingConfigurations()>
	//   34   68:putfield        #269 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
			vectordrawablecompatstate.mCacheDirty = true;
	//   35   71:aload           5
	//   36   73:iconst_1        
	//   37   74:putfield        #615 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mCacheDirty>
			inflateInternal(resources, xmlpullparser, attributeset, theme);
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:aload_2         
	//   41   80:aload_3         
	//   42   81:aload           4
	//   43   83:invokespecial   #617 <Method void inflateInternal(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
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
	//    5   11:invokevirtual   #620 <Method void Drawable.invalidateSelf()>
			return;
	//    6   14:return          
		} else
		{
			super.invalidateSelf();
	//    7   15:aload_0         
	//    8   16:invokespecial   #621 <Method void VectorDrawableCommon.invalidateSelf()>
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
	//    5   11:invokestatic    #623 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.mAutoMirrored;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #387 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
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
	//    5   11:invokevirtual   #626 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		return super.isStateful() || mVectorState != null && mVectorState.mTint != null && mVectorState.mTint.isStateful();
	//    7   15:aload_0         
	//    8   16:invokespecial   #627 <Method boolean VectorDrawableCommon.isStateful()>
	//    9   19:ifne            57
	//   10   22:aload_0         
	//   11   23:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   12   26:ifnull          55
	//   13   29:aload_0         
	//   14   30:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   15   33:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   16   36:ifnull          55
	//   17   39:aload_0         
	//   18   40:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   19   43:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   20   46:invokevirtual   #630 <Method boolean ColorStateList.isStateful()>
	//   21   49:ifeq            55
	//   22   52:goto            57
	//   23   55:iconst_0        
	//   24   56:ireturn         
	//   25   57:iconst_1        
	//   26   58:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #633 <Method void VectorDrawableCommon.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #636 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
			return ((Drawable) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
		}
		if(!mMutated && super.mutate() == this)
	//*   9   17:aload_0         
	//*  10   18:getfield        #638 <Field boolean mMutated>
	//*  11   21:ifne            52
	//*  12   24:aload_0         
	//*  13   25:invokespecial   #639 <Method Drawable VectorDrawableCommon.mutate()>
	//*  14   28:aload_0         
	//*  15   29:if_acmpne       52
		{
			mVectorState = new VectorDrawableCompatState(mVectorState);
	//   16   32:aload_0         
	//   17   33:new             #21  <Class VectorDrawableCompat$VectorDrawableCompatState>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   21   41:invokespecial   #641 <Method void VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompat$VectorDrawableCompatState)>
	//   22   44:putfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
			mMutated = true;
	//   23   47:aload_0         
	//   24   48:iconst_1        
	//   25   49:putfield        #638 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   26   52:aload_0         
	//   27   53:areturn         
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
	//    6   12:invokevirtual   #645 <Method void Drawable.setBounds(Rect)>
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
	//    6   12:invokevirtual   #650 <Method boolean Drawable.setState(int[])>
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
	//   28   56:invokevirtual   #651 <Method void invalidateSelf()>
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
	//    7   13:invokevirtual   #655 <Method void Drawable.scheduleSelf(Runnable, long)>
			return;
	//    8   16:return          
		} else
		{
			super.scheduleSelf(runnable, l);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:invokespecial   #656 <Method void VectorDrawableCommon.scheduleSelf(Runnable, long)>
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
		{
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #660 <Method void Drawable.setAlpha(int)>
			return;
	//    7   15:return          
		}
		if(mVectorState.mVPathRenderer.getRootAlpha() != i)
	//*   8   16:aload_0         
	//*   9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  10   20:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  11   23:invokevirtual   #536 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//*  12   26:iload_1         
	//*  13   27:icmpeq          45
		{
			mVectorState.mVPathRenderer.setRootAlpha(i);
	//   14   30:aload_0         
	//   15   31:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   16   34:getfield        #209 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #663 <Method void VectorDrawableCompat$VPathRenderer.setRootAlpha(int)>
			invalidateSelf();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #651 <Method void invalidateSelf()>
		}
	//   21   45:return          
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
	//    6   12:invokestatic    #667 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
			return;
	//    7   15:return          
		} else
		{
			mVectorState.mAutoMirrored = flag;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:iload_1         
	//   11   21:putfield        #387 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
			return;
	//   12   24:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #670 <Method void VectorDrawableCommon.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #674 <Method void VectorDrawableCommon.setColorFilter(int, android.graphics.PorterDuff$Mode)>
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
	//    6   12:invokevirtual   #677 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mColorFilter = colorfilter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #469 <Field ColorFilter mColorFilter>
			invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #651 <Method void invalidateSelf()>
			return;
	//   13   25:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #680 <Method void VectorDrawableCommon.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #683 <Method void VectorDrawableCommon.setHotspot(float, float)>
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
	//    5    6:invokespecial   #687 <Method void VectorDrawableCommon.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #688 <Method boolean VectorDrawableCommon.setState(int[])>
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
	//    6   12:invokestatic    #692 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			setTintList(ColorStateList.valueOf(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #695 <Method ColorStateList ColorStateList.valueOf(int)>
	//   11   21:invokevirtual   #699 <Method void setTintList(ColorStateList)>
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
	//    6   12:invokestatic    #702 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			return;
	//    7   15:return          
		}
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_2        
		if(vectordrawablecompatstate.mTint != colorstatelist)
	//*  11   21:aload_2         
	//*  12   22:getfield        #111 <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       55
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
	//   28   52:invokevirtual   #651 <Method void invalidateSelf()>
		}
	//   29   55:return          
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
	//    6   12:invokestatic    #707 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		}
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_2        
		if(vectordrawablecompatstate.mTintMode != mode)
	//*  11   21:aload_2         
	//*  12   22:getfield        #114 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       55
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
	//   28   52:invokevirtual   #651 <Method void invalidateSelf()>
		}
	//   29   55:return          
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
	//    7   13:invokevirtual   #711 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		else
			return super.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokespecial   #712 <Method boolean VectorDrawableCommon.setVisible(boolean, boolean)>
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
	//    6   12:invokevirtual   #716 <Method void Drawable.unscheduleSelf(Runnable)>
			return;
	//    7   15:return          
		} else
		{
			super.unscheduleSelf(runnable);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #717 <Method void VectorDrawableCommon.unscheduleSelf(Runnable)>
			return;
	//   11   21:return          
		}
	}

	PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterduffcolorfilter, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
	{
		if(colorstatelist != null && mode != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            29
			return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
	//    5   11:new             #719 <Class PorterDuffColorFilter>
	//    6   14:dup             
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #720 <Method int[] getState()>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #724 <Method int ColorStateList.getColorForState(int[], int)>
	//   12   24:aload_3         
	//   13   25:invokespecial   #726 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
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
