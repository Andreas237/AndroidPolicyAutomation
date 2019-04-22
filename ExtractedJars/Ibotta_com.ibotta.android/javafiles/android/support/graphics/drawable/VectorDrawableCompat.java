// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.support.v4.content.res.*;
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
		//		               0 38
		//		               1 34
		//		               2 30
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

		public VFullPath()
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

		public VFullPath(VFullPath vfullpath)
		{
			super(((VPath) (vfullpath)));
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
			mThemeAttrs = vfullpath.mThemeAttrs;
		//   33   60:aload_0         
		//   34   61:aload_1         
		//   35   62:getfield        #68  <Field int[] mThemeAttrs>
		//   36   65:putfield        #68  <Field int[] mThemeAttrs>
			mStrokeColor = vfullpath.mStrokeColor;
		//   37   68:aload_0         
		//   38   69:aload_1         
		//   39   70:getfield        #70  <Field ComplexColorCompat mStrokeColor>
		//   40   73:putfield        #70  <Field ComplexColorCompat mStrokeColor>
			mStrokeWidth = vfullpath.mStrokeWidth;
		//   41   76:aload_0         
		//   42   77:aload_1         
		//   43   78:getfield        #32  <Field float mStrokeWidth>
		//   44   81:putfield        #32  <Field float mStrokeWidth>
			mStrokeAlpha = vfullpath.mStrokeAlpha;
		//   45   84:aload_0         
		//   46   85:aload_1         
		//   47   86:getfield        #34  <Field float mStrokeAlpha>
		//   48   89:putfield        #34  <Field float mStrokeAlpha>
			mFillColor = vfullpath.mFillColor;
		//   49   92:aload_0         
		//   50   93:aload_1         
		//   51   94:getfield        #72  <Field ComplexColorCompat mFillColor>
		//   52   97:putfield        #72  <Field ComplexColorCompat mFillColor>
			mFillRule = vfullpath.mFillRule;
		//   53  100:aload_0         
		//   54  101:aload_1         
		//   55  102:getfield        #36  <Field int mFillRule>
		//   56  105:putfield        #36  <Field int mFillRule>
			mFillAlpha = vfullpath.mFillAlpha;
		//   57  108:aload_0         
		//   58  109:aload_1         
		//   59  110:getfield        #38  <Field float mFillAlpha>
		//   60  113:putfield        #38  <Field float mFillAlpha>
			mTrimPathStart = vfullpath.mTrimPathStart;
		//   61  116:aload_0         
		//   62  117:aload_1         
		//   63  118:getfield        #40  <Field float mTrimPathStart>
		//   64  121:putfield        #40  <Field float mTrimPathStart>
			mTrimPathEnd = vfullpath.mTrimPathEnd;
		//   65  124:aload_0         
		//   66  125:aload_1         
		//   67  126:getfield        #42  <Field float mTrimPathEnd>
		//   68  129:putfield        #42  <Field float mTrimPathEnd>
			mTrimPathOffset = vfullpath.mTrimPathOffset;
		//   69  132:aload_0         
		//   70  133:aload_1         
		//   71  134:getfield        #44  <Field float mTrimPathOffset>
		//   72  137:putfield        #44  <Field float mTrimPathOffset>
			mStrokeLineCap = vfullpath.mStrokeLineCap;
		//   73  140:aload_0         
		//   74  141:aload_1         
		//   75  142:getfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
		//   76  145:putfield        #51  <Field android.graphics.Paint$Cap mStrokeLineCap>
			mStrokeLineJoin = vfullpath.mStrokeLineJoin;
		//   77  148:aload_0         
		//   78  149:aload_1         
		//   79  150:getfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
		//   80  153:putfield        #58  <Field android.graphics.Paint$Join mStrokeLineJoin>
			mStrokeMiterlimit = vfullpath.mStrokeMiterlimit;
		//   81  156:aload_0         
		//   82  157:aload_1         
		//   83  158:getfield        #61  <Field float mStrokeMiterlimit>
		//   84  161:putfield        #61  <Field float mStrokeMiterlimit>
		//   85  164:return          
		}
	}

	private static class VGroup extends VObject
	{

		private void updateLocalMatrix()
		{
			mLocalMatrix.reset();
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Matrix mLocalMatrix>
		//    2    4:invokevirtual   #119 <Method void Matrix.reset()>
			mLocalMatrix.postTranslate(-mPivotX, -mPivotY);
		//    3    7:aload_0         
		//    4    8:getfield        #59  <Field Matrix mLocalMatrix>
		//    5   11:aload_0         
		//    6   12:getfield        #47  <Field float mPivotX>
		//    7   15:fneg            
		//    8   16:aload_0         
		//    9   17:getfield        #49  <Field float mPivotY>
		//   10   20:fneg            
		//   11   21:invokevirtual   #123 <Method boolean Matrix.postTranslate(float, float)>
		//   12   24:pop             
			mLocalMatrix.postScale(mScaleX, mScaleY);
		//   13   25:aload_0         
		//   14   26:getfield        #59  <Field Matrix mLocalMatrix>
		//   15   29:aload_0         
		//   16   30:getfield        #51  <Field float mScaleX>
		//   17   33:aload_0         
		//   18   34:getfield        #53  <Field float mScaleY>
		//   19   37:invokevirtual   #126 <Method boolean Matrix.postScale(float, float)>
		//   20   40:pop             
			mLocalMatrix.postRotate(mRotate, 0.0F, 0.0F);
		//   21   41:aload_0         
		//   22   42:getfield        #59  <Field Matrix mLocalMatrix>
		//   23   45:aload_0         
		//   24   46:getfield        #45  <Field float mRotate>
		//   25   49:fconst_0        
		//   26   50:fconst_0        
		//   27   51:invokevirtual   #130 <Method boolean Matrix.postRotate(float, float, float)>
		//   28   54:pop             
			mLocalMatrix.postTranslate(mTranslateX + mPivotX, mTranslateY + mPivotY);
		//   29   55:aload_0         
		//   30   56:getfield        #59  <Field Matrix mLocalMatrix>
		//   31   59:aload_0         
		//   32   60:getfield        #55  <Field float mTranslateX>
		//   33   63:aload_0         
		//   34   64:getfield        #47  <Field float mPivotX>
		//   35   67:fadd            
		//   36   68:aload_0         
		//   37   69:getfield        #57  <Field float mTranslateY>
		//   38   72:aload_0         
		//   39   73:getfield        #49  <Field float mPivotY>
		//   40   76:fadd            
		//   41   77:invokevirtual   #123 <Method boolean Matrix.postTranslate(float, float)>
		//   42   80:pop             
		//   43   81:return          
		}

		private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
		{
			mThemeAttrs = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #65  <Field int[] mThemeAttrs>
			mRotate = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "rotation", 5, mRotate);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:ldc1            #134 <String "rotation">
		//    7   10:iconst_5        
		//    8   11:aload_0         
		//    9   12:getfield        #45  <Field float mRotate>
		//   10   15:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   11   18:putfield        #45  <Field float mRotate>
			mPivotX = typedarray.getFloat(1, mPivotX);
		//   12   21:aload_0         
		//   13   22:aload_1         
		//   14   23:iconst_1        
		//   15   24:aload_0         
		//   16   25:getfield        #47  <Field float mPivotX>
		//   17   28:invokevirtual   #146 <Method float TypedArray.getFloat(int, float)>
		//   18   31:putfield        #47  <Field float mPivotX>
			mPivotY = typedarray.getFloat(2, mPivotY);
		//   19   34:aload_0         
		//   20   35:aload_1         
		//   21   36:iconst_2        
		//   22   37:aload_0         
		//   23   38:getfield        #49  <Field float mPivotY>
		//   24   41:invokevirtual   #146 <Method float TypedArray.getFloat(int, float)>
		//   25   44:putfield        #49  <Field float mPivotY>
			mScaleX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleX", 3, mScaleX);
		//   26   47:aload_0         
		//   27   48:aload_1         
		//   28   49:aload_2         
		//   29   50:ldc1            #148 <String "scaleX">
		//   30   52:iconst_3        
		//   31   53:aload_0         
		//   32   54:getfield        #51  <Field float mScaleX>
		//   33   57:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   34   60:putfield        #51  <Field float mScaleX>
			mScaleY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleY", 4, mScaleY);
		//   35   63:aload_0         
		//   36   64:aload_1         
		//   37   65:aload_2         
		//   38   66:ldc1            #150 <String "scaleY">
		//   39   68:iconst_4        
		//   40   69:aload_0         
		//   41   70:getfield        #53  <Field float mScaleY>
		//   42   73:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   43   76:putfield        #53  <Field float mScaleY>
			mTranslateX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateX", 6, mTranslateX);
		//   44   79:aload_0         
		//   45   80:aload_1         
		//   46   81:aload_2         
		//   47   82:ldc1            #152 <String "translateX">
		//   48   84:bipush          6
		//   49   86:aload_0         
		//   50   87:getfield        #55  <Field float mTranslateX>
		//   51   90:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   52   93:putfield        #55  <Field float mTranslateX>
			mTranslateY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateY", 7, mTranslateY);
		//   53   96:aload_0         
		//   54   97:aload_1         
		//   55   98:aload_2         
		//   56   99:ldc1            #154 <String "translateY">
		//   57  101:bipush          7
		//   58  103:aload_0         
		//   59  104:getfield        #57  <Field float mTranslateY>
		//   60  107:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   61  110:putfield        #57  <Field float mTranslateY>
			typedarray = ((TypedArray) (typedarray.getString(0)));
		//   62  113:aload_1         
		//   63  114:iconst_0        
		//   64  115:invokevirtual   #158 <Method String TypedArray.getString(int)>
		//   65  118:astore_1        
			if(typedarray != null)
		//*  66  119:aload_1         
		//*  67  120:ifnull          128
				mGroupName = ((String) (typedarray));
		//   68  123:aload_0         
		//   69  124:aload_1         
		//   70  125:putfield        #61  <Field String mGroupName>
			updateLocalMatrix();
		//   71  128:aload_0         
		//   72  129:invokespecial   #160 <Method void updateLocalMatrix()>
		//   73  132:return          
		}

		public String getGroupName()
		{
			return mGroupName;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field String mGroupName>
		//    2    4:areturn         
		}

		public Matrix getLocalMatrix()
		{
			return mLocalMatrix;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Matrix mLocalMatrix>
		//    2    4:areturn         
		}

		public float getPivotX()
		{
			return mPivotX;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field float mPivotX>
		//    2    4:freturn         
		}

		public float getPivotY()
		{
			return mPivotY;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field float mPivotY>
		//    2    4:freturn         
		}

		public float getRotation()
		{
			return mRotate;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field float mRotate>
		//    2    4:freturn         
		}

		public float getScaleX()
		{
			return mScaleX;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field float mScaleX>
		//    2    4:freturn         
		}

		public float getScaleY()
		{
			return mScaleY;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field float mScaleY>
		//    2    4:freturn         
		}

		public float getTranslateX()
		{
			return mTranslateX;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field float mTranslateX>
		//    2    4:freturn         
		}

		public float getTranslateY()
		{
			return mTranslateY;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field float mTranslateY>
		//    2    4:freturn         
		}

		public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP)));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:aload_2         
		//    3    3:getstatic       #179 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP>
		//    4    6:invokestatic    #183 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//    5    9:astore_1        
			updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload           4
		//    9   14:invokespecial   #185 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			((TypedArray) (resources)).recycle();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #188 <Method void TypedArray.recycle()>
		//   12   21:return          
		}

		public boolean isStateful()
		{
			for(int i = 0; i < mChildren.size(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:getfield        #43  <Field ArrayList mChildren>
		//*   5    7:invokevirtual   #81  <Method int ArrayList.size()>
		//*   6   10:icmpge          39
				if(((VObject)mChildren.get(i)).isStateful())
		//*   7   13:aload_0         
		//*   8   14:getfield        #43  <Field ArrayList mChildren>
		//*   9   17:iload_1         
		//*  10   18:invokevirtual   #85  <Method Object ArrayList.get(int)>
		//*  11   21:checkcast       #4   <Class VectorDrawableCompat$VObject>
		//*  12   24:invokevirtual   #192 <Method boolean VectorDrawableCompat$VObject.isStateful()>
		//*  13   27:ifeq            32
					return true;
		//   14   30:iconst_1        
		//   15   31:ireturn         

		//   16   32:iload_1         
		//   17   33:iconst_1        
		//   18   34:iadd            
		//   19   35:istore_1        
		//*  20   36:goto            2
			return false;
		//   21   39:iconst_0        
		//   22   40:ireturn         
		}

		public boolean onStateChanged(int ai[])
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			boolean flag = false;
		//    2    2:iconst_0        
		//    3    3:istore_3        
			for(; i < mChildren.size(); i++)
		//*   4    4:iload_2         
		//*   5    5:aload_0         
		//*   6    6:getfield        #43  <Field ArrayList mChildren>
		//*   7    9:invokevirtual   #81  <Method int ArrayList.size()>
		//*   8   12:icmpge          40
				flag |= ((VObject)mChildren.get(i)).onStateChanged(ai);
		//    9   15:iload_3         
		//   10   16:aload_0         
		//   11   17:getfield        #43  <Field ArrayList mChildren>
		//   12   20:iload_2         
		//   13   21:invokevirtual   #85  <Method Object ArrayList.get(int)>
		//   14   24:checkcast       #4   <Class VectorDrawableCompat$VObject>
		//   15   27:aload_1         
		//   16   28:invokevirtual   #196 <Method boolean VectorDrawableCompat$VObject.onStateChanged(int[])>
		//   17   31:ior             
		//   18   32:istore_3        

		//   19   33:iload_2         
		//   20   34:iconst_1        
		//   21   35:iadd            
		//   22   36:istore_2        
		//*  23   37:goto            4
			return flag;
		//   24   40:iload_3         
		//   25   41:ireturn         
		}

		public void setPivotX(float f)
		{
			if(f != mPivotX)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #47  <Field float mPivotX>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mPivotX = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #47  <Field float mPivotX>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setPivotY(float f)
		{
			if(f != mPivotY)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #49  <Field float mPivotY>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mPivotY = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #49  <Field float mPivotY>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setRotation(float f)
		{
			if(f != mRotate)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #45  <Field float mRotate>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mRotate = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #45  <Field float mRotate>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setScaleX(float f)
		{
			if(f != mScaleX)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #51  <Field float mScaleX>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mScaleX = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #51  <Field float mScaleX>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setScaleY(float f)
		{
			if(f != mScaleY)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #53  <Field float mScaleY>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mScaleY = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #53  <Field float mScaleY>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setTranslateX(float f)
		{
			if(f != mTranslateX)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #55  <Field float mTranslateX>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mTranslateX = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #55  <Field float mTranslateX>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		public void setTranslateY(float f)
		{
			if(f != mTranslateY)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #57  <Field float mTranslateY>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mTranslateY = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #57  <Field float mTranslateY>
				updateLocalMatrix();
		//    8   14:aload_0         
		//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
			}
		//   10   18:return          
		}

		int mChangingConfigurations;
		final ArrayList mChildren;
		private String mGroupName;
		final Matrix mLocalMatrix;
		private float mPivotX;
		private float mPivotY;
		float mRotate;
		private float mScaleX;
		private float mScaleY;
		final Matrix mStackedMatrix;
		private int mThemeAttrs[];
		private float mTranslateX;
		private float mTranslateY;

		public VGroup()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #32  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
			mStackedMatrix = new Matrix();
		//    3    5:aload_0         
		//    4    6:new             #34  <Class Matrix>
		//    5    9:dup             
		//    6   10:invokespecial   #36  <Method void Matrix()>
		//    7   13:putfield        #38  <Field Matrix mStackedMatrix>
			mChildren = new ArrayList();
		//    8   16:aload_0         
		//    9   17:new             #40  <Class ArrayList>
		//   10   20:dup             
		//   11   21:invokespecial   #41  <Method void ArrayList()>
		//   12   24:putfield        #43  <Field ArrayList mChildren>
			mRotate = 0.0F;
		//   13   27:aload_0         
		//   14   28:fconst_0        
		//   15   29:putfield        #45  <Field float mRotate>
			mPivotX = 0.0F;
		//   16   32:aload_0         
		//   17   33:fconst_0        
		//   18   34:putfield        #47  <Field float mPivotX>
			mPivotY = 0.0F;
		//   19   37:aload_0         
		//   20   38:fconst_0        
		//   21   39:putfield        #49  <Field float mPivotY>
			mScaleX = 1.0F;
		//   22   42:aload_0         
		//   23   43:fconst_1        
		//   24   44:putfield        #51  <Field float mScaleX>
			mScaleY = 1.0F;
		//   25   47:aload_0         
		//   26   48:fconst_1        
		//   27   49:putfield        #53  <Field float mScaleY>
			mTranslateX = 0.0F;
		//   28   52:aload_0         
		//   29   53:fconst_0        
		//   30   54:putfield        #55  <Field float mTranslateX>
			mTranslateY = 0.0F;
		//   31   57:aload_0         
		//   32   58:fconst_0        
		//   33   59:putfield        #57  <Field float mTranslateY>
			mLocalMatrix = new Matrix();
		//   34   62:aload_0         
		//   35   63:new             #34  <Class Matrix>
		//   36   66:dup             
		//   37   67:invokespecial   #36  <Method void Matrix()>
		//   38   70:putfield        #59  <Field Matrix mLocalMatrix>
			mGroupName = null;
		//   39   73:aload_0         
		//   40   74:aconst_null     
		//   41   75:putfield        #61  <Field String mGroupName>
		//   42   78:return          
		}

		public VGroup(VGroup vgroup, ArrayMap arraymap)
		{
label0:
			{
				super();
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #32  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
				mStackedMatrix = new Matrix();
		//    3    5:aload_0         
		//    4    6:new             #34  <Class Matrix>
		//    5    9:dup             
		//    6   10:invokespecial   #36  <Method void Matrix()>
		//    7   13:putfield        #38  <Field Matrix mStackedMatrix>
				mChildren = new ArrayList();
		//    8   16:aload_0         
		//    9   17:new             #40  <Class ArrayList>
		//   10   20:dup             
		//   11   21:invokespecial   #41  <Method void ArrayList()>
		//   12   24:putfield        #43  <Field ArrayList mChildren>
				mRotate = 0.0F;
		//   13   27:aload_0         
		//   14   28:fconst_0        
		//   15   29:putfield        #45  <Field float mRotate>
				mPivotX = 0.0F;
		//   16   32:aload_0         
		//   17   33:fconst_0        
		//   18   34:putfield        #47  <Field float mPivotX>
				mPivotY = 0.0F;
		//   19   37:aload_0         
		//   20   38:fconst_0        
		//   21   39:putfield        #49  <Field float mPivotY>
				mScaleX = 1.0F;
		//   22   42:aload_0         
		//   23   43:fconst_1        
		//   24   44:putfield        #51  <Field float mScaleX>
				mScaleY = 1.0F;
		//   25   47:aload_0         
		//   26   48:fconst_1        
		//   27   49:putfield        #53  <Field float mScaleY>
				mTranslateX = 0.0F;
		//   28   52:aload_0         
		//   29   53:fconst_0        
		//   30   54:putfield        #55  <Field float mTranslateX>
				mTranslateY = 0.0F;
		//   31   57:aload_0         
		//   32   58:fconst_0        
		//   33   59:putfield        #57  <Field float mTranslateY>
				mLocalMatrix = new Matrix();
		//   34   62:aload_0         
		//   35   63:new             #34  <Class Matrix>
		//   36   66:dup             
		//   37   67:invokespecial   #36  <Method void Matrix()>
		//   38   70:putfield        #59  <Field Matrix mLocalMatrix>
				mGroupName = null;
		//   39   73:aload_0         
		//   40   74:aconst_null     
		//   41   75:putfield        #61  <Field String mGroupName>
				mRotate = vgroup.mRotate;
		//   42   78:aload_0         
		//   43   79:aload_1         
		//   44   80:getfield        #45  <Field float mRotate>
		//   45   83:putfield        #45  <Field float mRotate>
				mPivotX = vgroup.mPivotX;
		//   46   86:aload_0         
		//   47   87:aload_1         
		//   48   88:getfield        #47  <Field float mPivotX>
		//   49   91:putfield        #47  <Field float mPivotX>
				mPivotY = vgroup.mPivotY;
		//   50   94:aload_0         
		//   51   95:aload_1         
		//   52   96:getfield        #49  <Field float mPivotY>
		//   53   99:putfield        #49  <Field float mPivotY>
				mScaleX = vgroup.mScaleX;
		//   54  102:aload_0         
		//   55  103:aload_1         
		//   56  104:getfield        #51  <Field float mScaleX>
		//   57  107:putfield        #51  <Field float mScaleX>
				mScaleY = vgroup.mScaleY;
		//   58  110:aload_0         
		//   59  111:aload_1         
		//   60  112:getfield        #53  <Field float mScaleY>
		//   61  115:putfield        #53  <Field float mScaleY>
				mTranslateX = vgroup.mTranslateX;
		//   62  118:aload_0         
		//   63  119:aload_1         
		//   64  120:getfield        #55  <Field float mTranslateX>
		//   65  123:putfield        #55  <Field float mTranslateX>
				mTranslateY = vgroup.mTranslateY;
		//   66  126:aload_0         
		//   67  127:aload_1         
		//   68  128:getfield        #57  <Field float mTranslateY>
		//   69  131:putfield        #57  <Field float mTranslateY>
				mThemeAttrs = vgroup.mThemeAttrs;
		//   70  134:aload_0         
		//   71  135:aload_1         
		//   72  136:getfield        #65  <Field int[] mThemeAttrs>
		//   73  139:putfield        #65  <Field int[] mThemeAttrs>
				mGroupName = vgroup.mGroupName;
		//   74  142:aload_0         
		//   75  143:aload_1         
		//   76  144:getfield        #61  <Field String mGroupName>
		//   77  147:putfield        #61  <Field String mGroupName>
				mChangingConfigurations = vgroup.mChangingConfigurations;
		//   78  150:aload_0         
		//   79  151:aload_1         
		//   80  152:getfield        #67  <Field int mChangingConfigurations>
		//   81  155:putfield        #67  <Field int mChangingConfigurations>
				Object obj = ((Object) (mGroupName));
		//   82  158:aload_0         
		//   83  159:getfield        #61  <Field String mGroupName>
		//   84  162:astore          4
				if(obj != null)
		//*  85  164:aload           4
		//*  86  166:ifnull          177
					arraymap.put(obj, ((Object) (this)));
		//   87  169:aload_2         
		//   88  170:aload           4
		//   89  172:aload_0         
		//   90  173:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
		//   91  176:pop             
				mLocalMatrix.set(vgroup.mLocalMatrix);
		//   92  177:aload_0         
		//   93  178:getfield        #59  <Field Matrix mLocalMatrix>
		//   94  181:aload_1         
		//   95  182:getfield        #59  <Field Matrix mLocalMatrix>
		//   96  185:invokevirtual   #77  <Method void Matrix.set(Matrix)>
				obj = ((Object) (vgroup.mChildren));
		//   97  188:aload_1         
		//   98  189:getfield        #43  <Field ArrayList mChildren>
		//   99  192:astore          4
				int i = 0;
		//  100  194:iconst_0        
		//  101  195:istore_3        
				do
				{
					if(i >= ((ArrayList) (obj)).size())
						break label0;
		//  102  196:iload_3         
		//  103  197:aload           4
		//  104  199:invokevirtual   #81  <Method int ArrayList.size()>
		//  105  202:icmpge          328
					vgroup = ((VGroup) (((ArrayList) (obj)).get(i)));
		//  106  205:aload           4
		//  107  207:iload_3         
		//  108  208:invokevirtual   #85  <Method Object ArrayList.get(int)>
		//  109  211:astore_1        
					if(vgroup instanceof VGroup)
		//* 110  212:aload_1         
		//* 111  213:instanceof      #2   <Class VectorDrawableCompat$VGroup>
		//* 112  216:ifeq            244
					{
						vgroup = (VGroup)vgroup;
		//  113  219:aload_1         
		//  114  220:checkcast       #2   <Class VectorDrawableCompat$VGroup>
		//  115  223:astore_1        
						mChildren.add(((Object) (new VGroup(vgroup, arraymap))));
		//  116  224:aload_0         
		//  117  225:getfield        #43  <Field ArrayList mChildren>
		//  118  228:new             #2   <Class VectorDrawableCompat$VGroup>
		//  119  231:dup             
		//  120  232:aload_1         
		//  121  233:aload_2         
		//  122  234:invokespecial   #87  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
		//  123  237:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
		//  124  240:pop             
					} else
		//* 125  241:goto            311
					{
						if(vgroup instanceof VFullPath)
		//* 126  244:aload_1         
		//* 127  245:instanceof      #93  <Class VectorDrawableCompat$VFullPath>
		//* 128  248:ifeq            266
						{
							vgroup = ((VGroup) (new VFullPath((VFullPath)vgroup)));
		//  129  251:new             #93  <Class VectorDrawableCompat$VFullPath>
		//  130  254:dup             
		//  131  255:aload_1         
		//  132  256:checkcast       #93  <Class VectorDrawableCompat$VFullPath>
		//  133  259:invokespecial   #96  <Method void VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath)>
		//  134  262:astore_1        
						} else
		//* 135  263:goto            285
						{
							if(!(vgroup instanceof VClipPath))
								break;
		//  136  266:aload_1         
		//  137  267:instanceof      #98  <Class VectorDrawableCompat$VClipPath>
		//  138  270:ifeq            318
							vgroup = ((VGroup) (new VClipPath((VClipPath)vgroup)));
		//  139  273:new             #98  <Class VectorDrawableCompat$VClipPath>
		//  140  276:dup             
		//  141  277:aload_1         
		//  142  278:checkcast       #98  <Class VectorDrawableCompat$VClipPath>
		//  143  281:invokespecial   #101 <Method void VectorDrawableCompat$VClipPath(VectorDrawableCompat$VClipPath)>
		//  144  284:astore_1        
						}
						mChildren.add(((Object) (vgroup)));
		//  145  285:aload_0         
		//  146  286:getfield        #43  <Field ArrayList mChildren>
		//  147  289:aload_1         
		//  148  290:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
		//  149  293:pop             
						if(((VPath) (vgroup)).mPathName != null)
		//* 150  294:aload_1         
		//* 151  295:getfield        #106 <Field String VectorDrawableCompat$VPath.mPathName>
		//* 152  298:ifnull          311
							arraymap.put(((Object) (((VPath) (vgroup)).mPathName)), ((Object) (vgroup)));
		//  153  301:aload_2         
		//  154  302:aload_1         
		//  155  303:getfield        #106 <Field String VectorDrawableCompat$VPath.mPathName>
		//  156  306:aload_1         
		//  157  307:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
		//  158  310:pop             
					}
					i++;
		//  159  311:iload_3         
		//  160  312:iconst_1        
		//  161  313:iadd            
		//  162  314:istore_3        
				} while(true);
		//  163  315:goto            196
				throw new IllegalStateException("Unknown object in the tree!");
		//  164  318:new             #108 <Class IllegalStateException>
		//  165  321:dup             
		//  166  322:ldc1            #110 <String "Unknown object in the tree!">
		//  167  324:invokespecial   #113 <Method void IllegalStateException(String)>
		//  168  327:athrow          
			}
		//  169  328:return          
		}
	}

	private static abstract class VObject
	{

		public boolean isStateful()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onStateChanged(int ai[])
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private VObject()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

	}

	private static abstract class VPath extends VObject
	{

		public android.support.v4.graphics.PathParser.PathDataNode[] getPathData()
		{
			return mNodes;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//    2    4:areturn         
		}

		public String getPathName()
		{
			return mPathName;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String mPathName>
		//    2    4:areturn         
		}

		public boolean isClipPath()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setPathData(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
		{
			if(!PathParser.canMorph(mNodes, apathdatanode))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//*   2    4:aload_1         
		//*   3    5:invokestatic    #44  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//*   4    8:ifne            20
			{
				mNodes = PathParser.deepCopyNodes(apathdatanode);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokestatic    #32  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
		//    8   16:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
				return;
		//    9   19:return          
			} else
			{
				PathParser.updateNodes(mNodes, apathdatanode);
		//   10   20:aload_0         
		//   11   21:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   12   24:aload_1         
		//   13   25:invokestatic    #48  <Method void PathParser.updateNodes(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
				return;
		//   14   28:return          
			}
		}

		public void toPath(Path path)
		{
			path.reset();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #55  <Method void Path.reset()>
			android.support.v4.graphics.PathParser.PathDataNode apathdatanode[] = mNodes;
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//    4    8:astore_2        
			if(apathdatanode != null)
		//*   5    9:aload_2         
		//*   6   10:ifnull          18
				android.support.v4.graphics.PathParser.PathDataNode.nodesToPath(apathdatanode, path);
		//    7   13:aload_2         
		//    8   14:aload_1         
		//    9   15:invokestatic    #61  <Method void android.support.v4.graphics.PathParser$PathDataNode.nodesToPath(android.support.v4.graphics.PathParser$PathDataNode[], Path)>
		//   10   18:return          
		}

		int mChangingConfigurations;
		protected android.support.v4.graphics.PathParser.PathDataNode mNodes[];
		String mPathName;

		public VPath()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #18  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
			mNodes = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//    6   10:return          
		}

		public VPath(VPath vpath)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #18  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
			mNodes = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
			mPathName = vpath.mPathName;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #24  <Field String mPathName>
		//    9   15:putfield        #24  <Field String mPathName>
			mChangingConfigurations = vpath.mChangingConfigurations;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:getfield        #26  <Field int mChangingConfigurations>
		//   13   23:putfield        #26  <Field int mChangingConfigurations>
			mNodes = PathParser.deepCopyNodes(vpath.mNodes);
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   17   31:invokestatic    #32  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
		//   18   34:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		//   19   37:return          
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
		//    1    1:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #103 <Method void Matrix.set(Matrix)>
			vgroup.mStackedMatrix.preConcat(vgroup.mLocalMatrix);
		//    4    8:aload_1         
		//    5    9:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
		//    6   12:aload_1         
		//    7   13:getfield        #106 <Field Matrix VectorDrawableCompat$VGroup.mLocalMatrix>
		//    8   16:invokevirtual   #110 <Method boolean Matrix.preConcat(Matrix)>
		//    9   19:pop             
			canvas.save();
		//   10   20:aload_3         
		//   11   21:invokevirtual   #116 <Method int Canvas.save()>
		//   12   24:pop             
			for(int k = 0; k < vgroup.mChildren.size(); k++)
		//*  13   25:iconst_0        
		//*  14   26:istore          7
		//*  15   28:iload           7
		//*  16   30:aload_1         
		//*  17   31:getfield        #120 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
		//*  18   34:invokevirtual   #125 <Method int ArrayList.size()>
		//*  19   37:icmpge          114
			{
				matrix = ((Matrix) ((VObject)vgroup.mChildren.get(k)));
		//   20   40:aload_1         
		//   21   41:getfield        #120 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
		//   22   44:iload           7
		//   23   46:invokevirtual   #129 <Method Object ArrayList.get(int)>
		//   24   49:checkcast       #131 <Class VectorDrawableCompat$VObject>
		//   25   52:astore_2        
				if(matrix instanceof VGroup)
		//*  26   53:aload_2         
		//*  27   54:instanceof      #69  <Class VectorDrawableCompat$VGroup>
		//*  28   57:ifeq            82
				{
					drawGroupTree((VGroup)matrix, vgroup.mStackedMatrix, canvas, i, j, colorfilter);
		//   29   60:aload_0         
		//   30   61:aload_2         
		//   31   62:checkcast       #69  <Class VectorDrawableCompat$VGroup>
		//   32   65:aload_1         
		//   33   66:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
		//   34   69:aload_3         
		//   35   70:iload           4
		//   36   72:iload           5
		//   37   74:aload           6
		//   38   76:invokespecial   #133 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
					continue;
		//   39   79:goto            105
				}
				if(matrix instanceof VPath)
		//*  40   82:aload_2         
		//*  41   83:instanceof      #135 <Class VectorDrawableCompat$VPath>
		//*  42   86:ifeq            105
					drawPath(vgroup, (VPath)matrix, canvas, i, j, colorfilter);
		//   43   89:aload_0         
		//   44   90:aload_1         
		//   45   91:aload_2         
		//   46   92:checkcast       #135 <Class VectorDrawableCompat$VPath>
		//   47   95:aload_3         
		//   48   96:iload           4
		//   49   98:iload           5
		//   50  100:aload           6
		//   51  102:invokespecial   #139 <Method void drawPath(VectorDrawableCompat$VGroup, VectorDrawableCompat$VPath, Canvas, int, int, ColorFilter)>
			}

		//   52  105:iload           7
		//   53  107:iconst_1        
		//   54  108:iadd            
		//   55  109:istore          7
		//*  56  111:goto            28
			canvas.restore();
		//   57  114:aload_3         
		//   58  115:invokevirtual   #142 <Method void Canvas.restore()>
		//   59  118:return          
		}

		private void drawPath(VGroup vgroup, VPath vpath, Canvas canvas, int i, int j, ColorFilter colorfilter)
		{
			float f1 = (float)i / mViewportWidth;
		//    0    0:iload           4
		//    1    2:i2f             
		//    2    3:aload_0         
		//    3    4:getfield        #54  <Field float mViewportWidth>
		//    4    7:fdiv            
		//    5    8:fstore          8
			float f2 = (float)j / mViewportHeight;
		//    6   10:iload           5
		//    7   12:i2f             
		//    8   13:aload_0         
		//    9   14:getfield        #56  <Field float mViewportHeight>
		//   10   17:fdiv            
		//   11   18:fstore          9
			float f = Math.min(f1, f2);
		//   12   20:fload           8
		//   13   22:fload           9
		//   14   24:invokestatic    #148 <Method float Math.min(float, float)>
		//   15   27:fstore          7
			vgroup = ((VGroup) (vgroup.mStackedMatrix));
		//   16   29:aload_1         
		//   17   30:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
		//   18   33:astore_1        
			mFinalPathMatrix.set(((Matrix) (vgroup)));
		//   19   34:aload_0         
		//   20   35:getfield        #48  <Field Matrix mFinalPathMatrix>
		//   21   38:aload_1         
		//   22   39:invokevirtual   #103 <Method void Matrix.set(Matrix)>
			mFinalPathMatrix.postScale(f1, f2);
		//   23   42:aload_0         
		//   24   43:getfield        #48  <Field Matrix mFinalPathMatrix>
		//   25   46:fload           8
		//   26   48:fload           9
		//   27   50:invokevirtual   #152 <Method boolean Matrix.postScale(float, float)>
		//   28   53:pop             
			f1 = getMatrixScale(((Matrix) (vgroup)));
		//   29   54:aload_0         
		//   30   55:aload_1         
		//   31   56:invokespecial   #156 <Method float getMatrixScale(Matrix)>
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
		//   40   71:getfield        #77  <Field Path mPath>
		//   41   74:invokevirtual   #159 <Method void VectorDrawableCompat$VPath.toPath(Path)>
			vgroup = ((VGroup) (mPath));
		//   42   77:aload_0         
		//   43   78:getfield        #77  <Field Path mPath>
		//   44   81:astore_1        
			mRenderPath.reset();
		//   45   82:aload_0         
		//   46   83:getfield        #79  <Field Path mRenderPath>
		//   47   86:invokevirtual   #162 <Method void Path.reset()>
			if(vpath.isClipPath())
		//*  48   89:aload_2         
		//*  49   90:invokevirtual   #166 <Method boolean VectorDrawableCompat$VPath.isClipPath()>
		//*  50   93:ifeq            118
			{
				mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
		//   51   96:aload_0         
		//   52   97:getfield        #79  <Field Path mRenderPath>
		//   53  100:aload_1         
		//   54  101:aload_0         
		//   55  102:getfield        #48  <Field Matrix mFinalPathMatrix>
		//   56  105:invokevirtual   #170 <Method void Path.addPath(Path, Matrix)>
				canvas.clipPath(mRenderPath);
		//   57  108:aload_3         
		//   58  109:aload_0         
		//   59  110:getfield        #79  <Field Path mRenderPath>
		//   60  113:invokevirtual   #174 <Method boolean Canvas.clipPath(Path)>
		//   61  116:pop             
				return;
		//   62  117:return          
			}
			vpath = ((VPath) ((VFullPath)vpath));
		//   63  118:aload_2         
		//   64  119:checkcast       #176 <Class VectorDrawableCompat$VFullPath>
		//   65  122:astore_2        
			if(((VFullPath) (vpath)).mTrimPathStart != 0.0F || ((VFullPath) (vpath)).mTrimPathEnd != 1.0F)
		//*  66  123:aload_2         
		//*  67  124:getfield        #179 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
		//*  68  127:fconst_0        
		//*  69  128:fcmpl           
		//*  70  129:ifne            141
		//*  71  132:aload_2         
		//*  72  133:getfield        #182 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
		//*  73  136:fconst_1        
		//*  74  137:fcmpl           
		//*  75  138:ifeq            290
			{
				float f6 = ((VFullPath) (vpath)).mTrimPathStart;
		//   76  141:aload_2         
		//   77  142:getfield        #179 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
		//   78  145:fstore          12
				float f7 = ((VFullPath) (vpath)).mTrimPathOffset;
		//   79  147:aload_2         
		//   80  148:getfield        #185 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
		//   81  151:fstore          13
				float f4 = ((VFullPath) (vpath)).mTrimPathEnd;
		//   82  153:aload_2         
		//   83  154:getfield        #182 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
		//   84  157:fstore          10
				float f5 = ((VFullPath) (vpath)).mTrimPathOffset;
		//   85  159:aload_2         
		//   86  160:getfield        #185 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
		//   87  163:fstore          11
				if(mPathMeasure == null)
		//*  88  165:aload_0         
		//*  89  166:getfield        #187 <Field PathMeasure mPathMeasure>
		//*  90  169:ifnonnull       183
					mPathMeasure = new PathMeasure();
		//   91  172:aload_0         
		//   92  173:new             #189 <Class PathMeasure>
		//   93  176:dup             
		//   94  177:invokespecial   #190 <Method void PathMeasure()>
		//   95  180:putfield        #187 <Field PathMeasure mPathMeasure>
				mPathMeasure.setPath(mPath, false);
		//   96  183:aload_0         
		//   97  184:getfield        #187 <Field PathMeasure mPathMeasure>
		//   98  187:aload_0         
		//   99  188:getfield        #77  <Field Path mPath>
		//  100  191:iconst_0        
		//  101  192:invokevirtual   #194 <Method void PathMeasure.setPath(Path, boolean)>
				float f3 = mPathMeasure.getLength();
		//  102  195:aload_0         
		//  103  196:getfield        #187 <Field PathMeasure mPathMeasure>
		//  104  199:invokevirtual   #198 <Method float PathMeasure.getLength()>
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
		//  123  229:invokevirtual   #162 <Method void Path.reset()>
				if(f6 > f4)
		//* 124  232:fload           12
		//* 125  234:fload           10
		//* 126  236:fcmpl           
		//* 127  237:ifle            270
				{
					mPathMeasure.getSegment(f6, f3, ((Path) (vgroup)), true);
		//  128  240:aload_0         
		//  129  241:getfield        #187 <Field PathMeasure mPathMeasure>
		//  130  244:fload           12
		//  131  246:fload           9
		//  132  248:aload_1         
		//  133  249:iconst_1        
		//  134  250:invokevirtual   #202 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  135  253:pop             
					mPathMeasure.getSegment(0.0F, f4, ((Path) (vgroup)), true);
		//  136  254:aload_0         
		//  137  255:getfield        #187 <Field PathMeasure mPathMeasure>
		//  138  258:fconst_0        
		//  139  259:fload           10
		//  140  261:aload_1         
		//  141  262:iconst_1        
		//  142  263:invokevirtual   #202 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  143  266:pop             
				} else
		//* 144  267:goto            284
				{
					mPathMeasure.getSegment(f6, f4, ((Path) (vgroup)), true);
		//  145  270:aload_0         
		//  146  271:getfield        #187 <Field PathMeasure mPathMeasure>
		//  147  274:fload           12
		//  148  276:fload           10
		//  149  278:aload_1         
		//  150  279:iconst_1        
		//  151  280:invokevirtual   #202 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
		//  152  283:pop             
				}
				((Path) (vgroup)).rLineTo(0.0F, 0.0F);
		//  153  284:aload_1         
		//  154  285:fconst_0        
		//  155  286:fconst_0        
		//  156  287:invokevirtual   #206 <Method void Path.rLineTo(float, float)>
			}
			mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
		//  157  290:aload_0         
		//  158  291:getfield        #79  <Field Path mRenderPath>
		//  159  294:aload_1         
		//  160  295:aload_0         
		//  161  296:getfield        #48  <Field Matrix mFinalPathMatrix>
		//  162  299:invokevirtual   #170 <Method void Path.addPath(Path, Matrix)>
			if(((VFullPath) (vpath)).mFillColor.willDraw())
		//* 163  302:aload_2         
		//* 164  303:getfield        #210 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mFillColor>
		//* 165  306:invokevirtual   #215 <Method boolean ComplexColorCompat.willDraw()>
		//* 166  309:ifeq            461
			{
				vgroup = ((VGroup) (((VFullPath) (vpath)).mFillColor));
		//  167  312:aload_2         
		//  168  313:getfield        #210 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mFillColor>
		//  169  316:astore_1        
				if(mFillPaint == null)
		//* 170  317:aload_0         
		//* 171  318:getfield        #217 <Field Paint mFillPaint>
		//* 172  321:ifnonnull       346
				{
					mFillPaint = new Paint(1);
		//  173  324:aload_0         
		//  174  325:new             #219 <Class Paint>
		//  175  328:dup             
		//  176  329:iconst_1        
		//  177  330:invokespecial   #222 <Method void Paint(int)>
		//  178  333:putfield        #217 <Field Paint mFillPaint>
					mFillPaint.setStyle(android.graphics.Paint.Style.FILL);
		//  179  336:aload_0         
		//  180  337:getfield        #217 <Field Paint mFillPaint>
		//  181  340:getstatic       #228 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
		//  182  343:invokevirtual   #232 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				}
				Paint paint = mFillPaint;
		//  183  346:aload_0         
		//  184  347:getfield        #217 <Field Paint mFillPaint>
		//  185  350:astore          14
				if(((ComplexColorCompat) (vgroup)).isGradient())
		//* 186  352:aload_1         
		//* 187  353:invokevirtual   #235 <Method boolean ComplexColorCompat.isGradient()>
		//* 188  356:ifeq            397
				{
					vgroup = ((VGroup) (((ComplexColorCompat) (vgroup)).getShader()));
		//  189  359:aload_1         
		//  190  360:invokevirtual   #239 <Method Shader ComplexColorCompat.getShader()>
		//  191  363:astore_1        
					((Shader) (vgroup)).setLocalMatrix(mFinalPathMatrix);
		//  192  364:aload_1         
		//  193  365:aload_0         
		//  194  366:getfield        #48  <Field Matrix mFinalPathMatrix>
		//  195  369:invokevirtual   #244 <Method void Shader.setLocalMatrix(Matrix)>
					paint.setShader(((Shader) (vgroup)));
		//  196  372:aload           14
		//  197  374:aload_1         
		//  198  375:invokevirtual   #248 <Method Shader Paint.setShader(Shader)>
		//  199  378:pop             
					paint.setAlpha(Math.round(((VFullPath) (vpath)).mFillAlpha * 255F));
		//  200  379:aload           14
		//  201  381:aload_2         
		//  202  382:getfield        #251 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
		//  203  385:ldc1            #252 <Float 255F>
		//  204  387:fmul            
		//  205  388:invokestatic    #256 <Method int Math.round(float)>
		//  206  391:invokevirtual   #259 <Method void Paint.setAlpha(int)>
				} else
		//* 207  394:goto            413
				{
					paint.setColor(VectorDrawableCompat.applyAlpha(((ComplexColorCompat) (vgroup)).getColor(), ((VFullPath) (vpath)).mFillAlpha));
		//  208  397:aload           14
		//  209  399:aload_1         
		//  210  400:invokevirtual   #262 <Method int ComplexColorCompat.getColor()>
		//  211  403:aload_2         
		//  212  404:getfield        #251 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
		//  213  407:invokestatic    #266 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//  214  410:invokevirtual   #269 <Method void Paint.setColor(int)>
				}
				paint.setColorFilter(colorfilter);
		//  215  413:aload           14
		//  216  415:aload           6
		//  217  417:invokevirtual   #273 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//  218  420:pop             
				Path path = mRenderPath;
		//  219  421:aload_0         
		//  220  422:getfield        #79  <Field Path mRenderPath>
		//  221  425:astore          15
				if(((VFullPath) (vpath)).mFillRule == 0)
		//* 222  427:aload_2         
		//* 223  428:getfield        #276 <Field int VectorDrawableCompat$VFullPath.mFillRule>
		//* 224  431:ifne            441
					vgroup = ((VGroup) (android.graphics.Path.FillType.WINDING));
		//  225  434:getstatic       #282 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
		//  226  437:astore_1        
				else
		//* 227  438:goto            445
					vgroup = ((VGroup) (android.graphics.Path.FillType.EVEN_ODD));
		//  228  441:getstatic       #285 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
		//  229  444:astore_1        
				path.setFillType(((android.graphics.Path.FillType) (vgroup)));
		//  230  445:aload           15
		//  231  447:aload_1         
		//  232  448:invokevirtual   #289 <Method void Path.setFillType(android.graphics.Path$FillType)>
				canvas.drawPath(mRenderPath, paint);
		//  233  451:aload_3         
		//  234  452:aload_0         
		//  235  453:getfield        #79  <Field Path mRenderPath>
		//  236  456:aload           14
		//  237  458:invokevirtual   #292 <Method void Canvas.drawPath(Path, Paint)>
			}
			if(((VFullPath) (vpath)).mStrokeColor.willDraw())
		//* 238  461:aload_2         
		//* 239  462:getfield        #295 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mStrokeColor>
		//* 240  465:invokevirtual   #215 <Method boolean ComplexColorCompat.willDraw()>
		//* 241  468:ifeq            643
			{
				Object obj = ((Object) (((VFullPath) (vpath)).mStrokeColor));
		//  242  471:aload_2         
		//  243  472:getfield        #295 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mStrokeColor>
		//  244  475:astore          14
				if(mStrokePaint == null)
		//* 245  477:aload_0         
		//* 246  478:getfield        #297 <Field Paint mStrokePaint>
		//* 247  481:ifnonnull       506
				{
					mStrokePaint = new Paint(1);
		//  248  484:aload_0         
		//  249  485:new             #219 <Class Paint>
		//  250  488:dup             
		//  251  489:iconst_1        
		//  252  490:invokespecial   #222 <Method void Paint(int)>
		//  253  493:putfield        #297 <Field Paint mStrokePaint>
					mStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
		//  254  496:aload_0         
		//  255  497:getfield        #297 <Field Paint mStrokePaint>
		//  256  500:getstatic       #300 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
		//  257  503:invokevirtual   #232 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				}
				vgroup = ((VGroup) (mStrokePaint));
		//  258  506:aload_0         
		//  259  507:getfield        #297 <Field Paint mStrokePaint>
		//  260  510:astore_1        
				if(((VFullPath) (vpath)).mStrokeLineJoin != null)
		//* 261  511:aload_2         
		//* 262  512:getfield        #304 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
		//* 263  515:ifnull          526
					((Paint) (vgroup)).setStrokeJoin(((VFullPath) (vpath)).mStrokeLineJoin);
		//  264  518:aload_1         
		//  265  519:aload_2         
		//  266  520:getfield        #304 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
		//  267  523:invokevirtual   #308 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
				if(((VFullPath) (vpath)).mStrokeLineCap != null)
		//* 268  526:aload_2         
		//* 269  527:getfield        #312 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
		//* 270  530:ifnull          541
					((Paint) (vgroup)).setStrokeCap(((VFullPath) (vpath)).mStrokeLineCap);
		//  271  533:aload_1         
		//  272  534:aload_2         
		//  273  535:getfield        #312 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
		//  274  538:invokevirtual   #316 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
				((Paint) (vgroup)).setStrokeMiter(((VFullPath) (vpath)).mStrokeMiterlimit);
		//  275  541:aload_1         
		//  276  542:aload_2         
		//  277  543:getfield        #319 <Field float VectorDrawableCompat$VFullPath.mStrokeMiterlimit>
		//  278  546:invokevirtual   #323 <Method void Paint.setStrokeMiter(float)>
				if(((ComplexColorCompat) (obj)).isGradient())
		//* 279  549:aload           14
		//* 280  551:invokevirtual   #235 <Method boolean ComplexColorCompat.isGradient()>
		//* 281  554:ifeq            597
				{
					obj = ((Object) (((ComplexColorCompat) (obj)).getShader()));
		//  282  557:aload           14
		//  283  559:invokevirtual   #239 <Method Shader ComplexColorCompat.getShader()>
		//  284  562:astore          14
					((Shader) (obj)).setLocalMatrix(mFinalPathMatrix);
		//  285  564:aload           14
		//  286  566:aload_0         
		//  287  567:getfield        #48  <Field Matrix mFinalPathMatrix>
		//  288  570:invokevirtual   #244 <Method void Shader.setLocalMatrix(Matrix)>
					((Paint) (vgroup)).setShader(((Shader) (obj)));
		//  289  573:aload_1         
		//  290  574:aload           14
		//  291  576:invokevirtual   #248 <Method Shader Paint.setShader(Shader)>
		//  292  579:pop             
					((Paint) (vgroup)).setAlpha(Math.round(((VFullPath) (vpath)).mStrokeAlpha * 255F));
		//  293  580:aload_1         
		//  294  581:aload_2         
		//  295  582:getfield        #326 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
		//  296  585:ldc1            #252 <Float 255F>
		//  297  587:fmul            
		//  298  588:invokestatic    #256 <Method int Math.round(float)>
		//  299  591:invokevirtual   #259 <Method void Paint.setAlpha(int)>
				} else
		//* 300  594:goto            613
				{
					((Paint) (vgroup)).setColor(VectorDrawableCompat.applyAlpha(((ComplexColorCompat) (obj)).getColor(), ((VFullPath) (vpath)).mStrokeAlpha));
		//  301  597:aload_1         
		//  302  598:aload           14
		//  303  600:invokevirtual   #262 <Method int ComplexColorCompat.getColor()>
		//  304  603:aload_2         
		//  305  604:getfield        #326 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
		//  306  607:invokestatic    #266 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//  307  610:invokevirtual   #269 <Method void Paint.setColor(int)>
				}
				((Paint) (vgroup)).setColorFilter(colorfilter);
		//  308  613:aload_1         
		//  309  614:aload           6
		//  310  616:invokevirtual   #273 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//  311  619:pop             
				((Paint) (vgroup)).setStrokeWidth(((VFullPath) (vpath)).mStrokeWidth * (f * f1));
		//  312  620:aload_1         
		//  313  621:aload_2         
		//  314  622:getfield        #329 <Field float VectorDrawableCompat$VFullPath.mStrokeWidth>
		//  315  625:fload           7
		//  316  627:fload           8
		//  317  629:fmul            
		//  318  630:fmul            
		//  319  631:invokevirtual   #332 <Method void Paint.setStrokeWidth(float)>
				canvas.drawPath(mRenderPath, ((Paint) (vgroup)));
		//  320  634:aload_3         
		//  321  635:aload_0         
		//  322  636:getfield        #79  <Field Path mRenderPath>
		//  323  639:aload_1         
		//  324  640:invokevirtual   #292 <Method void Canvas.drawPath(Path, Paint)>
			}
		//  325  643:return          
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
		//   23   27:invokevirtual   #336 <Method void Matrix.mapVectors(float[])>
			float f = (float)Math.hypot(af[0], af[1]);
		//   24   30:aload           5
		//   25   32:iconst_0        
		//   26   33:faload          
		//   27   34:f2d             
		//   28   35:aload           5
		//   29   37:iconst_1        
		//   30   38:faload          
		//   31   39:f2d             
		//   32   40:invokestatic    #340 <Method double Math.hypot(double, double)>
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
		//   43   55:invokestatic    #340 <Method double Math.hypot(double, double)>
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
		//   58   77:invokestatic    #342 <Method float cross(float, float, float, float)>
		//   59   80:fstore_3        
			f2 = Math.max(f, f2);
		//   60   81:fload_2         
		//   61   82:fload           4
		//   62   84:invokestatic    #345 <Method float Math.max(float, float)>
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
		//   71   99:invokestatic    #349 <Method float Math.abs(float)>
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
		//    2    2:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
		//    3    5:getstatic       #44  <Field Matrix IDENTITY_MATRIX>
		//    4    8:aload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:aload           4
		//    8   13:invokespecial   #133 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
		//    9   16:return          
		}

		public float getAlpha()
		{
			return (float)getRootAlpha() / 255F;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #355 <Method int getRootAlpha()>
		//    2    4:i2f             
		//    3    5:ldc1            #252 <Float 255F>
		//    4    7:fdiv            
		//    5    8:freturn         
		}

		public int getRootAlpha()
		{
			return mRootAlpha;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field int mRootAlpha>
		//    2    4:ireturn         
		}

		public boolean isStateful()
		{
			if(mIsStateful == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field Boolean mIsStateful>
		//*   2    4:ifnonnull       21
				mIsStateful = Boolean.valueOf(mRootGroup.isStateful());
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
		//    6   12:invokevirtual   #358 <Method boolean VectorDrawableCompat$VGroup.isStateful()>
		//    7   15:invokestatic    #364 <Method Boolean Boolean.valueOf(boolean)>
		//    8   18:putfield        #62  <Field Boolean mIsStateful>
			return mIsStateful.booleanValue();
		//    9   21:aload_0         
		//   10   22:getfield        #62  <Field Boolean mIsStateful>
		//   11   25:invokevirtual   #367 <Method boolean Boolean.booleanValue()>
		//   12   28:ireturn         
		}

		public boolean onStateChanged(int ai[])
		{
			return mRootGroup.onStateChanged(ai);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #371 <Method boolean VectorDrawableCompat$VGroup.onStateChanged(int[])>
		//    4    8:ireturn         
		}

		public void setAlpha(float f)
		{
			setRootAlpha((int)(f * 255F));
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:ldc1            #252 <Float 255F>
		//    3    4:fmul            
		//    4    5:f2i             
		//    5    6:invokevirtual   #374 <Method void setRootAlpha(int)>
		//    6    9:return          
		}

		public void setRootAlpha(int i)
		{
			mRootAlpha = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #58  <Field int mRootAlpha>
		//    3    5:return          
		}

		private static final Matrix IDENTITY_MATRIX = new Matrix();
		float mBaseHeight;
		float mBaseWidth;
		private int mChangingConfigurations;
		Paint mFillPaint;
		private final Matrix mFinalPathMatrix;
		Boolean mIsStateful;
		private final Path mPath;
		private PathMeasure mPathMeasure;
		private final Path mRenderPath;
		int mRootAlpha;
		final VGroup mRootGroup;
		String mRootName;
		Paint mStrokePaint;
		final ArrayMap mVGTargetsMap;
		float mViewportHeight;
		float mViewportWidth;

		static 
		{
		//    0    0:new             #39  <Class Matrix>
		//    1    3:dup             
		//    2    4:invokespecial   #42  <Method void Matrix()>
		//    3    7:putstatic       #44  <Field Matrix IDENTITY_MATRIX>
		//*   4   10:return          
		}

		public VPathRenderer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #46  <Method void Object()>
			mFinalPathMatrix = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #39  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #42  <Method void Matrix()>
		//    6   12:putfield        #48  <Field Matrix mFinalPathMatrix>
			mBaseWidth = 0.0F;
		//    7   15:aload_0         
		//    8   16:fconst_0        
		//    9   17:putfield        #50  <Field float mBaseWidth>
			mBaseHeight = 0.0F;
		//   10   20:aload_0         
		//   11   21:fconst_0        
		//   12   22:putfield        #52  <Field float mBaseHeight>
			mViewportWidth = 0.0F;
		//   13   25:aload_0         
		//   14   26:fconst_0        
		//   15   27:putfield        #54  <Field float mViewportWidth>
			mViewportHeight = 0.0F;
		//   16   30:aload_0         
		//   17   31:fconst_0        
		//   18   32:putfield        #56  <Field float mViewportHeight>
			mRootAlpha = 255;
		//   19   35:aload_0         
		//   20   36:sipush          255
		//   21   39:putfield        #58  <Field int mRootAlpha>
			mRootName = null;
		//   22   42:aload_0         
		//   23   43:aconst_null     
		//   24   44:putfield        #60  <Field String mRootName>
			mIsStateful = null;
		//   25   47:aload_0         
		//   26   48:aconst_null     
		//   27   49:putfield        #62  <Field Boolean mIsStateful>
			mVGTargetsMap = new ArrayMap();
		//   28   52:aload_0         
		//   29   53:new             #64  <Class ArrayMap>
		//   30   56:dup             
		//   31   57:invokespecial   #65  <Method void ArrayMap()>
		//   32   60:putfield        #67  <Field ArrayMap mVGTargetsMap>
			mRootGroup = new VGroup();
		//   33   63:aload_0         
		//   34   64:new             #69  <Class VectorDrawableCompat$VGroup>
		//   35   67:dup             
		//   36   68:invokespecial   #70  <Method void VectorDrawableCompat$VGroup()>
		//   37   71:putfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
			mPath = new Path();
		//   38   74:aload_0         
		//   39   75:new             #74  <Class Path>
		//   40   78:dup             
		//   41   79:invokespecial   #75  <Method void Path()>
		//   42   82:putfield        #77  <Field Path mPath>
			mRenderPath = new Path();
		//   43   85:aload_0         
		//   44   86:new             #74  <Class Path>
		//   45   89:dup             
		//   46   90:invokespecial   #75  <Method void Path()>
		//   47   93:putfield        #79  <Field Path mRenderPath>
		//   48   96:return          
		}

		public VPathRenderer(VPathRenderer vpathrenderer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #46  <Method void Object()>
			mFinalPathMatrix = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #39  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #42  <Method void Matrix()>
		//    6   12:putfield        #48  <Field Matrix mFinalPathMatrix>
			mBaseWidth = 0.0F;
		//    7   15:aload_0         
		//    8   16:fconst_0        
		//    9   17:putfield        #50  <Field float mBaseWidth>
			mBaseHeight = 0.0F;
		//   10   20:aload_0         
		//   11   21:fconst_0        
		//   12   22:putfield        #52  <Field float mBaseHeight>
			mViewportWidth = 0.0F;
		//   13   25:aload_0         
		//   14   26:fconst_0        
		//   15   27:putfield        #54  <Field float mViewportWidth>
			mViewportHeight = 0.0F;
		//   16   30:aload_0         
		//   17   31:fconst_0        
		//   18   32:putfield        #56  <Field float mViewportHeight>
			mRootAlpha = 255;
		//   19   35:aload_0         
		//   20   36:sipush          255
		//   21   39:putfield        #58  <Field int mRootAlpha>
			mRootName = null;
		//   22   42:aload_0         
		//   23   43:aconst_null     
		//   24   44:putfield        #60  <Field String mRootName>
			mIsStateful = null;
		//   25   47:aload_0         
		//   26   48:aconst_null     
		//   27   49:putfield        #62  <Field Boolean mIsStateful>
			mVGTargetsMap = new ArrayMap();
		//   28   52:aload_0         
		//   29   53:new             #64  <Class ArrayMap>
		//   30   56:dup             
		//   31   57:invokespecial   #65  <Method void ArrayMap()>
		//   32   60:putfield        #67  <Field ArrayMap mVGTargetsMap>
			mRootGroup = new VGroup(vpathrenderer.mRootGroup, mVGTargetsMap);
		//   33   63:aload_0         
		//   34   64:new             #69  <Class VectorDrawableCompat$VGroup>
		//   35   67:dup             
		//   36   68:aload_1         
		//   37   69:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
		//   38   72:aload_0         
		//   39   73:getfield        #67  <Field ArrayMap mVGTargetsMap>
		//   40   76:invokespecial   #83  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
		//   41   79:putfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
			mPath = new Path(vpathrenderer.mPath);
		//   42   82:aload_0         
		//   43   83:new             #74  <Class Path>
		//   44   86:dup             
		//   45   87:aload_1         
		//   46   88:getfield        #77  <Field Path mPath>
		//   47   91:invokespecial   #86  <Method void Path(Path)>
		//   48   94:putfield        #77  <Field Path mPath>
			mRenderPath = new Path(vpathrenderer.mRenderPath);
		//   49   97:aload_0         
		//   50   98:new             #74  <Class Path>
		//   51  101:dup             
		//   52  102:aload_1         
		//   53  103:getfield        #79  <Field Path mRenderPath>
		//   54  106:invokespecial   #86  <Method void Path(Path)>
		//   55  109:putfield        #79  <Field Path mRenderPath>
			mBaseWidth = vpathrenderer.mBaseWidth;
		//   56  112:aload_0         
		//   57  113:aload_1         
		//   58  114:getfield        #50  <Field float mBaseWidth>
		//   59  117:putfield        #50  <Field float mBaseWidth>
			mBaseHeight = vpathrenderer.mBaseHeight;
		//   60  120:aload_0         
		//   61  121:aload_1         
		//   62  122:getfield        #52  <Field float mBaseHeight>
		//   63  125:putfield        #52  <Field float mBaseHeight>
			mViewportWidth = vpathrenderer.mViewportWidth;
		//   64  128:aload_0         
		//   65  129:aload_1         
		//   66  130:getfield        #54  <Field float mViewportWidth>
		//   67  133:putfield        #54  <Field float mViewportWidth>
			mViewportHeight = vpathrenderer.mViewportHeight;
		//   68  136:aload_0         
		//   69  137:aload_1         
		//   70  138:getfield        #56  <Field float mViewportHeight>
		//   71  141:putfield        #56  <Field float mViewportHeight>
			mChangingConfigurations = vpathrenderer.mChangingConfigurations;
		//   72  144:aload_0         
		//   73  145:aload_1         
		//   74  146:getfield        #88  <Field int mChangingConfigurations>
		//   75  149:putfield        #88  <Field int mChangingConfigurations>
			mRootAlpha = vpathrenderer.mRootAlpha;
		//   76  152:aload_0         
		//   77  153:aload_1         
		//   78  154:getfield        #58  <Field int mRootAlpha>
		//   79  157:putfield        #58  <Field int mRootAlpha>
			mRootName = vpathrenderer.mRootName;
		//   80  160:aload_0         
		//   81  161:aload_1         
		//   82  162:getfield        #60  <Field String mRootName>
		//   83  165:putfield        #60  <Field String mRootName>
			String s = vpathrenderer.mRootName;
		//   84  168:aload_1         
		//   85  169:getfield        #60  <Field String mRootName>
		//   86  172:astore_2        
			if(s != null)
		//*  87  173:aload_2         
		//*  88  174:ifnull          187
				mVGTargetsMap.put(((Object) (s)), ((Object) (this)));
		//   89  177:aload_0         
		//   90  178:getfield        #67  <Field ArrayMap mVGTargetsMap>
		//   91  181:aload_2         
		//   92  182:aload_0         
		//   93  183:invokevirtual   #92  <Method Object ArrayMap.put(Object, Object)>
		//   94  186:pop             
			mIsStateful = vpathrenderer.mIsStateful;
		//   95  187:aload_0         
		//   96  188:aload_1         
		//   97  189:getfield        #62  <Field Boolean mIsStateful>
		//   98  192:putfield        #62  <Field Boolean mIsStateful>
		//   99  195:return          
		}
	}

	private static class VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState
	{

		public boolean canReuseBitmap(int i, int j)
		{
			return i == mCachedBitmap.getWidth() && j == mCachedBitmap.getHeight();
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #66  <Field Bitmap mCachedBitmap>
		//    3    5:invokevirtual   #72  <Method int Bitmap.getWidth()>
		//    4    8:icmpne          24
		//    5   11:iload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #66  <Field Bitmap mCachedBitmap>
		//    8   16:invokevirtual   #75  <Method int Bitmap.getHeight()>
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
		//    1    1:getfield        #79  <Field boolean mCacheDirty>
		//    2    4:ifne            56
		//    3    7:aload_0         
		//    4    8:getfield        #81  <Field ColorStateList mCachedTint>
		//    5   11:aload_0         
		//    6   12:getfield        #32  <Field ColorStateList mTint>
		//    7   15:if_acmpne       56
		//    8   18:aload_0         
		//    9   19:getfield        #83  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
		//   10   22:aload_0         
		//   11   23:getfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
		//   12   26:if_acmpne       56
		//   13   29:aload_0         
		//   14   30:getfield        #85  <Field boolean mCachedAutoMirrored>
		//   15   33:aload_0         
		//   16   34:getfield        #62  <Field boolean mAutoMirrored>
		//   17   37:icmpne          56
		//   18   40:aload_0         
		//   19   41:getfield        #87  <Field int mCachedRootAlpha>
		//   20   44:aload_0         
		//   21   45:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   22   48:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
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
		//*   1    1:getfield        #66  <Field Bitmap mCachedBitmap>
		//*   2    4:ifnull          16
		//*   3    7:aload_0         
		//*   4    8:iload_1         
		//*   5    9:iload_2         
		//*   6   10:invokevirtual   #94  <Method boolean canReuseBitmap(int, int)>
		//*   7   13:ifne            33
			{
				mCachedBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:getstatic       #100 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
		//   12   22:invokestatic    #104 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   13   25:putfield        #66  <Field Bitmap mCachedBitmap>
				mCacheDirty = true;
		//   14   28:aload_0         
		//   15   29:iconst_1        
		//   16   30:putfield        #79  <Field boolean mCacheDirty>
			}
		//   17   33:return          
		}

		public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorfilter, Rect rect)
		{
			colorfilter = ((ColorFilter) (getPaint(colorfilter)));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #110 <Method Paint getPaint(ColorFilter)>
		//    3    5:astore_2        
			canvas.drawBitmap(mCachedBitmap, ((Rect) (null)), rect, ((Paint) (colorfilter)));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #66  <Field Bitmap mCachedBitmap>
		//    7   11:aconst_null     
		//    8   12:aload_3         
		//    9   13:aload_2         
		//   10   14:invokevirtual   #116 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
		//   11   17:return          
		}

		public int getChangingConfigurations()
		{
			return mChangingConfigurations;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int mChangingConfigurations>
		//    2    4:ireturn         
		}

		public Paint getPaint(ColorFilter colorfilter)
		{
			if(!hasTranslucentRoot() && colorfilter == null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #120 <Method boolean hasTranslucentRoot()>
		//*   2    4:ifne            13
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       13
				return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
			if(mTempPaint == null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #122 <Field Paint mTempPaint>
		//*   9   17:ifnonnull       39
			{
				mTempPaint = new Paint();
		//   10   20:aload_0         
		//   11   21:new             #54  <Class Paint>
		//   12   24:dup             
		//   13   25:invokespecial   #123 <Method void Paint()>
		//   14   28:putfield        #122 <Field Paint mTempPaint>
				mTempPaint.setFilterBitmap(true);
		//   15   31:aload_0         
		//   16   32:getfield        #122 <Field Paint mTempPaint>
		//   17   35:iconst_1        
		//   18   36:invokevirtual   #127 <Method void Paint.setFilterBitmap(boolean)>
			}
			mTempPaint.setAlpha(mVPathRenderer.getRootAlpha());
		//   19   39:aload_0         
		//   20   40:getfield        #122 <Field Paint mTempPaint>
		//   21   43:aload_0         
		//   22   44:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   23   47:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//   24   50:invokevirtual   #131 <Method void Paint.setAlpha(int)>
			mTempPaint.setColorFilter(colorfilter);
		//   25   53:aload_0         
		//   26   54:getfield        #122 <Field Paint mTempPaint>
		//   27   57:aload_1         
		//   28   58:invokevirtual   #135 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//   29   61:pop             
			return mTempPaint;
		//   30   62:aload_0         
		//   31   63:getfield        #122 <Field Paint mTempPaint>
		//   32   66:areturn         
		}

		public boolean hasTranslucentRoot()
		{
			return mVPathRenderer.getRootAlpha() < 255;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//    2    4:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//    3    7:sipush          255
		//    4   10:icmpge          15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean isStateful()
		{
			return mVPathRenderer.isStateful();
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//    2    4:invokevirtual   #138 <Method boolean VectorDrawableCompat$VPathRenderer.isStateful()>
		//    3    7:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new VectorDrawableCompat(this)));
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #143 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
		//    4    8:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new VectorDrawableCompat(this)));
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #143 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
		//    4    8:areturn         
		}

		public boolean onStateChanged(int ai[])
		{
			boolean flag = mVPathRenderer.onStateChanged(ai);
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #149 <Method boolean VectorDrawableCompat$VPathRenderer.onStateChanged(int[])>
		//    4    8:istore_2        
			mCacheDirty = mCacheDirty | flag;
		//    5    9:aload_0         
		//    6   10:aload_0         
		//    7   11:getfield        #79  <Field boolean mCacheDirty>
		//    8   14:iload_2         
		//    9   15:ior             
		//   10   16:putfield        #79  <Field boolean mCacheDirty>
			return flag;
		//   11   19:iload_2         
		//   12   20:ireturn         
		}

		public void updateCacheStates()
		{
			mCachedTint = mTint;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #32  <Field ColorStateList mTint>
		//    3    5:putfield        #81  <Field ColorStateList mCachedTint>
			mCachedTintMode = mTintMode;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
		//    7   13:putfield        #83  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
			mCachedRootAlpha = mVPathRenderer.getRootAlpha();
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   11   21:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
		//   12   24:putfield        #87  <Field int mCachedRootAlpha>
			mCachedAutoMirrored = mAutoMirrored;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #62  <Field boolean mAutoMirrored>
		//   16   32:putfield        #85  <Field boolean mCachedAutoMirrored>
			mCacheDirty = false;
		//   17   35:aload_0         
		//   18   36:iconst_0        
		//   19   37:putfield        #79  <Field boolean mCacheDirty>
		//   20   40:return          
		}

		public void updateCachedBitmap(int i, int j)
		{
			mCachedBitmap.eraseColor(0);
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field Bitmap mCachedBitmap>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #154 <Method void Bitmap.eraseColor(int)>
			Canvas canvas = new Canvas(mCachedBitmap);
		//    4    8:new             #112 <Class Canvas>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #66  <Field Bitmap mCachedBitmap>
		//    8   16:invokespecial   #157 <Method void Canvas(Bitmap)>
		//    9   19:astore_3        
			mVPathRenderer.draw(canvas, i, j, ((ColorFilter) (null)));
		//   10   20:aload_0         
		//   11   21:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   12   24:aload_3         
		//   13   25:iload_1         
		//   14   26:iload_2         
		//   15   27:aconst_null     
		//   16   28:invokevirtual   #161 <Method void VectorDrawableCompat$VPathRenderer.draw(Canvas, int, int, ColorFilter)>
		//   17   31:return          
		}

		boolean mAutoMirrored;
		boolean mCacheDirty;
		boolean mCachedAutoMirrored;
		Bitmap mCachedBitmap;
		int mCachedRootAlpha;
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
		//    1    1:invokespecial   #30  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mTint = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #32  <Field ColorStateList mTint>
			mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #35  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
		//    7   13:putfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
			mVPathRenderer = new VPathRenderer();
		//    8   16:aload_0         
		//    9   17:new             #39  <Class VectorDrawableCompat$VPathRenderer>
		//   10   20:dup             
		//   11   21:invokespecial   #40  <Method void VectorDrawableCompat$VPathRenderer()>
		//   12   24:putfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   13   27:return          
		}

		public VectorDrawableCompatState(VectorDrawableCompatState vectordrawablecompatstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mTint = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #32  <Field ColorStateList mTint>
			mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #35  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
		//    7   13:putfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
			if(vectordrawablecompatstate != null)
		//*   8   16:aload_1         
		//*   9   17:ifnull          129
			{
				mChangingConfigurations = vectordrawablecompatstate.mChangingConfigurations;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #46  <Field int mChangingConfigurations>
		//   13   25:putfield        #46  <Field int mChangingConfigurations>
				mVPathRenderer = new VPathRenderer(vectordrawablecompatstate.mVPathRenderer);
		//   14   28:aload_0         
		//   15   29:new             #39  <Class VectorDrawableCompat$VPathRenderer>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   19   37:invokespecial   #49  <Method void VectorDrawableCompat$VPathRenderer(VectorDrawableCompat$VPathRenderer)>
		//   20   40:putfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
				if(vectordrawablecompatstate.mVPathRenderer.mFillPaint != null)
		//*  21   43:aload_1         
		//*  22   44:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//*  23   47:getfield        #52  <Field Paint VectorDrawableCompat$VPathRenderer.mFillPaint>
		//*  24   50:ifnull          74
					mVPathRenderer.mFillPaint = new Paint(vectordrawablecompatstate.mVPathRenderer.mFillPaint);
		//   25   53:aload_0         
		//   26   54:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   27   57:new             #54  <Class Paint>
		//   28   60:dup             
		//   29   61:aload_1         
		//   30   62:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   31   65:getfield        #52  <Field Paint VectorDrawableCompat$VPathRenderer.mFillPaint>
		//   32   68:invokespecial   #57  <Method void Paint(Paint)>
		//   33   71:putfield        #52  <Field Paint VectorDrawableCompat$VPathRenderer.mFillPaint>
				if(vectordrawablecompatstate.mVPathRenderer.mStrokePaint != null)
		//*  34   74:aload_1         
		//*  35   75:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//*  36   78:getfield        #60  <Field Paint VectorDrawableCompat$VPathRenderer.mStrokePaint>
		//*  37   81:ifnull          105
					mVPathRenderer.mStrokePaint = new Paint(vectordrawablecompatstate.mVPathRenderer.mStrokePaint);
		//   38   84:aload_0         
		//   39   85:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   40   88:new             #54  <Class Paint>
		//   41   91:dup             
		//   42   92:aload_1         
		//   43   93:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
		//   44   96:getfield        #60  <Field Paint VectorDrawableCompat$VPathRenderer.mStrokePaint>
		//   45   99:invokespecial   #57  <Method void Paint(Paint)>
		//   46  102:putfield        #60  <Field Paint VectorDrawableCompat$VPathRenderer.mStrokePaint>
				mTint = vectordrawablecompatstate.mTint;
		//   47  105:aload_0         
		//   48  106:aload_1         
		//   49  107:getfield        #32  <Field ColorStateList mTint>
		//   50  110:putfield        #32  <Field ColorStateList mTint>
				mTintMode = vectordrawablecompatstate.mTintMode;
		//   51  113:aload_0         
		//   52  114:aload_1         
		//   53  115:getfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
		//   54  118:putfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
				mAutoMirrored = vectordrawablecompatstate.mAutoMirrored;
		//   55  121:aload_0         
		//   56  122:aload_1         
		//   57  123:getfield        #62  <Field boolean mAutoMirrored>
		//   58  126:putfield        #62  <Field boolean mAutoMirrored>
			}
		//   59  129:return          
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
	//    1    1:invokespecial   #62  <Method void VectorDrawableCommon()>
		mAllowCaching = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #64  <Field boolean mAllowCaching>
		mTmpFloats = new float[9];
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:newarray        float[]
	//    8   14:putfield        #66  <Field float[] mTmpFloats>
		mTmpMatrix = new Matrix();
	//    9   17:aload_0         
	//   10   18:new             #68  <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #69  <Method void Matrix()>
	//   13   25:putfield        #71  <Field Matrix mTmpMatrix>
		mTmpBounds = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #73  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #74  <Method void Rect()>
	//   18   36:putfield        #76  <Field Rect mTmpBounds>
		mVectorState = new VectorDrawableCompatState();
	//   19   39:aload_0         
	//   20   40:new             #26  <Class VectorDrawableCompat$VectorDrawableCompatState>
	//   21   43:dup             
	//   22   44:invokespecial   #77  <Method void VectorDrawableCompat$VectorDrawableCompatState()>
	//   23   47:putfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   24   50:return          
	}

	VectorDrawableCompat(VectorDrawableCompatState vectordrawablecompatstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void VectorDrawableCommon()>
		mAllowCaching = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #64  <Field boolean mAllowCaching>
		mTmpFloats = new float[9];
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:newarray        float[]
	//    8   14:putfield        #66  <Field float[] mTmpFloats>
		mTmpMatrix = new Matrix();
	//    9   17:aload_0         
	//   10   18:new             #68  <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #69  <Method void Matrix()>
	//   13   25:putfield        #71  <Field Matrix mTmpMatrix>
		mTmpBounds = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #73  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #74  <Method void Rect()>
	//   18   36:putfield        #76  <Field Rect mTmpBounds>
		mVectorState = vectordrawablecompatstate;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
		mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, vectordrawablecompatstate.mTintMode);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   26   50:aload_1         
	//   27   51:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   28   54:aload_1         
	//   29   55:getfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   30   58:invokevirtual   #94  <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   31   61:putfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   32   64:return          
	}

	static int applyAlpha(int i, float f)
	{
		return i & 0xffffff | (int)((float)Color.alpha(i) * f) << 24;
	//    0    0:iload_0         
	//    1    1:ldc1            #98  <Int 0xffffff>
	//    2    3:iand            
	//    3    4:iload_0         
	//    4    5:invokestatic    #104 <Method int Color.alpha(int)>
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
	//*   0    0:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          46
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    3    8:new             #2   <Class VectorDrawableCompat>
	//    4   11:dup             
	//    5   12:invokespecial   #119 <Method void VectorDrawableCompat()>
	//    6   15:astore_3        
			vectordrawablecompat.mDelegateDrawable = ResourcesCompat.getDrawable(resources, i, theme);
	//    7   16:aload_3         
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:aload_2         
	//   11   20:invokestatic    #125 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   12   23:putfield        #129 <Field Drawable mDelegateDrawable>
			vectordrawablecompat.mCachedConstantStateDelegate = ((android.graphics.drawable.Drawable.ConstantState) (new VectorDrawableDelegateState(vectordrawablecompat.mDelegateDrawable.getConstantState())));
	//   13   26:aload_3         
	//   14   27:new             #29  <Class VectorDrawableCompat$VectorDrawableDelegateState>
	//   15   30:dup             
	//   16   31:aload_3         
	//   17   32:getfield        #129 <Field Drawable mDelegateDrawable>
	//   18   35:invokevirtual   #135 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   19   38:invokespecial   #138 <Method void VectorDrawableCompat$VectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   20   41:putfield        #140 <Field android.graphics.drawable.Drawable$ConstantState mCachedConstantStateDelegate>
			return vectordrawablecompat;
	//   21   44:aload_3         
	//   22   45:areturn         
		}
		android.content.res.XmlResourceParser xmlresourceparser;
		AttributeSet attributeset;
		xmlresourceparser = resources.getXml(i);
	//   23   46:aload_0         
	//   24   47:iload_1         
	//   25   48:invokevirtual   #146 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   26   51:astore_3        
		attributeset = Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser)));
	//   27   52:aload_3         
	//   28   53:invokestatic    #152 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   29   56:astore          4
		do
			i = ((XmlPullParser) (xmlresourceparser)).next();
	//   30   58:aload_3         
	//   31   59:invokeinterface #158 <Method int XmlPullParser.next()>
	//   32   64:istore_1        
		while(i != 2 && i != 1);
	//   33   65:iload_1         
	//   34   66:iconst_2        
	//   35   67:icmpeq          78
	//   36   70:iload_1         
	//   37   71:iconst_1        
	//   38   72:icmpeq          78
	//*  39   75:goto            58
		if(i != 2)
			break MISSING_BLOCK_LABEL_92;
	//   40   78:iload_1         
	//   41   79:iconst_2        
	//   42   80:icmpne          92
		return createFromXmlInner(resources, ((XmlPullParser) (xmlresourceparser)), attributeset, theme);
	//   43   83:aload_0         
	//   44   84:aload_3         
	//   45   85:aload           4
	//   46   87:aload_2         
	//   47   88:invokestatic    #162 <Method VectorDrawableCompat createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   48   91:areturn         
		throw new XmlPullParserException("No start tag found");
	//   49   92:new             #110 <Class XmlPullParserException>
	//   50   95:dup             
	//   51   96:ldc1            #164 <String "No start tag found">
	//   52   98:invokespecial   #167 <Method void XmlPullParserException(String)>
	//   53  101:athrow          
		resources;
	//   54  102:astore_0        
		Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   55  103:ldc1            #169 <String "VectorDrawableCompat">
	//   56  105:ldc1            #171 <String "parser error">
	//   57  107:aload_0         
	//   58  108:invokestatic    #177 <Method int Log.e(String, String, Throwable)>
	//   59  111:pop             
		break MISSING_BLOCK_LABEL_125;
	//   60  112:goto            125
		resources;
	//   61  115:astore_0        
		Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   62  116:ldc1            #169 <String "VectorDrawableCompat">
	//   63  118:ldc1            #171 <String "parser error">
	//   64  120:aload_0         
	//   65  121:invokestatic    #177 <Method int Log.e(String, String, Throwable)>
	//   66  124:pop             
		return null;
	//   67  125:aconst_null     
	//   68  126:areturn         
	}

	public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    0    0:new             #2   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void VectorDrawableCompat()>
	//    3    7:astore          4
		vectordrawablecompat.inflate(resources, xmlpullparser, attributeset, theme);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #182 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		return vectordrawablecompat;
	//   10   18:aload           4
	//   11   20:areturn         
	}

	private void inflateInternal(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    2    4:astore          9
		VPathRenderer vpathrenderer = vectordrawablecompatstate.mVPathRenderer;
	//    3    6:aload           9
	//    4    8:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//    5   11:astore          10
		ArrayDeque arraydeque = new ArrayDeque();
	//    6   13:new             #190 <Class ArrayDeque>
	//    7   16:dup             
	//    8   17:invokespecial   #191 <Method void ArrayDeque()>
	//    9   20:astore          11
		arraydeque.push(((Object) (vpathrenderer.mRootGroup)));
	//   10   22:aload           11
	//   11   24:aload           10
	//   12   26:getfield        #195 <Field VectorDrawableCompat$VGroup VectorDrawableCompat$VPathRenderer.mRootGroup>
	//   13   29:invokevirtual   #199 <Method void ArrayDeque.push(Object)>
		int k = xmlpullparser.getEventType();
	//   14   32:aload_2         
	//   15   33:invokeinterface #202 <Method int XmlPullParser.getEventType()>
	//   16   38:istore          7
		int l = xmlpullparser.getDepth();
	//   17   40:aload_2         
	//   18   41:invokeinterface #205 <Method int XmlPullParser.getDepth()>
	//   19   46:istore          8
		int i;
		int j;
		for(i = 1; k != 1 && (xmlpullparser.getDepth() >= l + 1 || k != 3); i = j)
	//*  20   48:iconst_1        
	//*  21   49:istore          5
	//*  22   51:iload           7
	//*  23   53:iconst_1        
	//*  24   54:icmpeq          438
	//*  25   57:aload_2         
	//*  26   58:invokeinterface #205 <Method int XmlPullParser.getDepth()>
	//*  27   63:iload           8
	//*  28   65:iconst_1        
	//*  29   66:iadd            
	//*  30   67:icmpge          76
	//*  31   70:iload           7
	//*  32   72:iconst_3        
	//*  33   73:icmpeq          438
		{
			if(k == 2)
	//*  34   76:iload           7
	//*  35   78:iconst_2        
	//*  36   79:icmpne          384
			{
				Object obj = ((Object) (xmlpullparser.getName()));
	//   37   82:aload_2         
	//   38   83:invokeinterface #209 <Method String XmlPullParser.getName()>
	//   39   88:astore          13
				VGroup vgroup = (VGroup)arraydeque.peek();
	//   40   90:aload           11
	//   41   92:invokevirtual   #213 <Method Object ArrayDeque.peek()>
	//   42   95:checkcast       #14  <Class VectorDrawableCompat$VGroup>
	//   43   98:astore          12
				if("path".equals(obj))
	//*  44  100:ldc1            #215 <String "path">
	//*  45  102:aload           13
	//*  46  104:invokevirtual   #221 <Method boolean String.equals(Object)>
	//*  47  107:ifeq            190
				{
					obj = ((Object) (new VFullPath()));
	//   48  110:new             #11  <Class VectorDrawableCompat$VFullPath>
	//   49  113:dup             
	//   50  114:invokespecial   #222 <Method void VectorDrawableCompat$VFullPath()>
	//   51  117:astore          13
					((VFullPath) (obj)).inflate(resources, attributeset, theme, xmlpullparser);
	//   52  119:aload           13
	//   53  121:aload_1         
	//   54  122:aload_3         
	//   55  123:aload           4
	//   56  125:aload_2         
	//   57  126:invokevirtual   #225 <Method void VectorDrawableCompat$VFullPath.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					vgroup.mChildren.add(obj);
	//   58  129:aload           12
	//   59  131:getfield        #229 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   60  134:aload           13
	//   61  136:invokevirtual   #234 <Method boolean ArrayList.add(Object)>
	//   62  139:pop             
					if(((VFullPath) (obj)).getPathName() != null)
	//*  63  140:aload           13
	//*  64  142:invokevirtual   #237 <Method String VectorDrawableCompat$VFullPath.getPathName()>
	//*  65  145:ifnull          164
						vpathrenderer.mVGTargetsMap.put(((Object) (((VFullPath) (obj)).getPathName())), obj);
	//   66  148:aload           10
	//   67  150:getfield        #241 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//   68  153:aload           13
	//   69  155:invokevirtual   #237 <Method String VectorDrawableCompat$VFullPath.getPathName()>
	//   70  158:aload           13
	//   71  160:invokevirtual   #247 <Method Object ArrayMap.put(Object, Object)>
	//   72  163:pop             
					j = 0;
	//   73  164:iconst_0        
	//   74  165:istore          6
					i = vectordrawablecompatstate.mChangingConfigurations;
	//   75  167:aload           9
	//   76  169:getfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//   77  172:istore          5
					vectordrawablecompatstate.mChangingConfigurations = ((VFullPath) (obj)).mChangingConfigurations | i;
	//   78  174:aload           9
	//   79  176:aload           13
	//   80  178:getfield        #251 <Field int VectorDrawableCompat$VFullPath.mChangingConfigurations>
	//   81  181:iload           5
	//   82  183:ior             
	//   83  184:putfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
				} else
	//*  84  187:goto            423
				if("clip-path".equals(obj))
	//*  85  190:ldc1            #253 <String "clip-path">
	//*  86  192:aload           13
	//*  87  194:invokevirtual   #221 <Method boolean String.equals(Object)>
	//*  88  197:ifeq            281
				{
					obj = ((Object) (new VClipPath()));
	//   89  200:new             #8   <Class VectorDrawableCompat$VClipPath>
	//   90  203:dup             
	//   91  204:invokespecial   #254 <Method void VectorDrawableCompat$VClipPath()>
	//   92  207:astore          13
					((VClipPath) (obj)).inflate(resources, attributeset, theme, xmlpullparser);
	//   93  209:aload           13
	//   94  211:aload_1         
	//   95  212:aload_3         
	//   96  213:aload           4
	//   97  215:aload_2         
	//   98  216:invokevirtual   #255 <Method void VectorDrawableCompat$VClipPath.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					vgroup.mChildren.add(obj);
	//   99  219:aload           12
	//  100  221:getfield        #229 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//  101  224:aload           13
	//  102  226:invokevirtual   #234 <Method boolean ArrayList.add(Object)>
	//  103  229:pop             
					if(((VClipPath) (obj)).getPathName() != null)
	//* 104  230:aload           13
	//* 105  232:invokevirtual   #256 <Method String VectorDrawableCompat$VClipPath.getPathName()>
	//* 106  235:ifnull          254
						vpathrenderer.mVGTargetsMap.put(((Object) (((VClipPath) (obj)).getPathName())), obj);
	//  107  238:aload           10
	//  108  240:getfield        #241 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  109  243:aload           13
	//  110  245:invokevirtual   #256 <Method String VectorDrawableCompat$VClipPath.getPathName()>
	//  111  248:aload           13
	//  112  250:invokevirtual   #247 <Method Object ArrayMap.put(Object, Object)>
	//  113  253:pop             
					j = vectordrawablecompatstate.mChangingConfigurations;
	//  114  254:aload           9
	//  115  256:getfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//  116  259:istore          6
					vectordrawablecompatstate.mChangingConfigurations = ((VClipPath) (obj)).mChangingConfigurations | j;
	//  117  261:aload           9
	//  118  263:aload           13
	//  119  265:getfield        #257 <Field int VectorDrawableCompat$VClipPath.mChangingConfigurations>
	//  120  268:iload           6
	//  121  270:ior             
	//  122  271:putfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
					j = i;
	//  123  274:iload           5
	//  124  276:istore          6
				} else
	//* 125  278:goto            423
				{
					j = i;
	//  126  281:iload           5
	//  127  283:istore          6
					if("group".equals(obj))
	//* 128  285:ldc2            #259 <String "group">
	//* 129  288:aload           13
	//* 130  290:invokevirtual   #221 <Method boolean String.equals(Object)>
	//* 131  293:ifeq            423
					{
						VGroup vgroup1 = new VGroup();
	//  132  296:new             #14  <Class VectorDrawableCompat$VGroup>
	//  133  299:dup             
	//  134  300:invokespecial   #260 <Method void VectorDrawableCompat$VGroup()>
	//  135  303:astore          13
						vgroup1.inflate(resources, attributeset, theme, xmlpullparser);
	//  136  305:aload           13
	//  137  307:aload_1         
	//  138  308:aload_3         
	//  139  309:aload           4
	//  140  311:aload_2         
	//  141  312:invokevirtual   #261 <Method void VectorDrawableCompat$VGroup.inflate(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
						vgroup.mChildren.add(((Object) (vgroup1)));
	//  142  315:aload           12
	//  143  317:getfield        #229 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//  144  320:aload           13
	//  145  322:invokevirtual   #234 <Method boolean ArrayList.add(Object)>
	//  146  325:pop             
						arraydeque.push(((Object) (vgroup1)));
	//  147  326:aload           11
	//  148  328:aload           13
	//  149  330:invokevirtual   #199 <Method void ArrayDeque.push(Object)>
						if(vgroup1.getGroupName() != null)
	//* 150  333:aload           13
	//* 151  335:invokevirtual   #264 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//* 152  338:ifnull          357
							vpathrenderer.mVGTargetsMap.put(((Object) (vgroup1.getGroupName())), ((Object) (vgroup1)));
	//  153  341:aload           10
	//  154  343:getfield        #241 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  155  346:aload           13
	//  156  348:invokevirtual   #264 <Method String VectorDrawableCompat$VGroup.getGroupName()>
	//  157  351:aload           13
	//  158  353:invokevirtual   #247 <Method Object ArrayMap.put(Object, Object)>
	//  159  356:pop             
						j = vectordrawablecompatstate.mChangingConfigurations;
	//  160  357:aload           9
	//  161  359:getfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
	//  162  362:istore          6
						vectordrawablecompatstate.mChangingConfigurations = vgroup1.mChangingConfigurations | j;
	//  163  364:aload           9
	//  164  366:aload           13
	//  165  368:getfield        #265 <Field int VectorDrawableCompat$VGroup.mChangingConfigurations>
	//  166  371:iload           6
	//  167  373:ior             
	//  168  374:putfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
						j = i;
	//  169  377:iload           5
	//  170  379:istore          6
					}
				}
			} else
	//* 171  381:goto            423
			{
				j = i;
	//  172  384:iload           5
	//  173  386:istore          6
				if(k == 3)
	//* 174  388:iload           7
	//* 175  390:iconst_3        
	//* 176  391:icmpne          423
				{
					j = i;
	//  177  394:iload           5
	//  178  396:istore          6
					if("group".equals(((Object) (xmlpullparser.getName()))))
	//* 179  398:ldc2            #259 <String "group">
	//* 180  401:aload_2         
	//* 181  402:invokeinterface #209 <Method String XmlPullParser.getName()>
	//* 182  407:invokevirtual   #221 <Method boolean String.equals(Object)>
	//* 183  410:ifeq            423
					{
						arraydeque.pop();
	//  184  413:aload           11
	//  185  415:invokevirtual   #268 <Method Object ArrayDeque.pop()>
	//  186  418:pop             
						j = i;
	//  187  419:iload           5
	//  188  421:istore          6
					}
				}
			}
			k = xmlpullparser.next();
	//  189  423:aload_2         
	//  190  424:invokeinterface #158 <Method int XmlPullParser.next()>
	//  191  429:istore          7
		}

	//  192  431:iload           6
	//  193  433:istore          5
	//* 194  435:goto            51
		if(i == 0)
	//* 195  438:iload           5
	//* 196  440:ifne            444
			return;
	//  197  443:return          
		else
			throw new XmlPullParserException("no path defined");
	//  198  444:new             #110 <Class XmlPullParserException>
	//  199  447:dup             
	//  200  448:ldc2            #270 <String "no path defined">
	//  201  451:invokespecial   #167 <Method void XmlPullParserException(String)>
	//  202  454:athrow          
	}

	private boolean needMirroring()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
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
	//*  10   15:invokevirtual   #275 <Method boolean isAutoMirrored()>
	//*  11   18:ifeq            33
			{
				flag = flag1;
	//   12   21:iload_3         
	//   13   22:istore_2        
				if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 1)
	//*  14   23:aload_0         
	//*  15   24:invokestatic    #281 <Method int DrawableCompat.getLayoutDirection(Drawable)>
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
	//   13   46:getstatic       #286 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.ADD>
	//   14   49:areturn         

					case 15: // '\017'
						return android.graphics.PorterDuff.Mode.SCREEN;
	//   15   50:getstatic       #289 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   16   53:areturn         

					case 14: // '\016'
						return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   17   54:getstatic       #292 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   18   57:areturn         
					}
				else
					return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//   19   58:getstatic       #295 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   20   61:areturn         
			} else
			{
				return android.graphics.PorterDuff.Mode.SRC_IN;
	//   21   62:getstatic       #56  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   22   65:areturn         
			}
		} else
		{
			return android.graphics.PorterDuff.Mode.SRC_OVER;
	//   23   66:getstatic       #298 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   24   69:areturn         
		}
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
		throws XmlPullParserException
	{
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    2    4:astore          4
		VPathRenderer vpathrenderer = vectordrawablecompatstate.mVPathRenderer;
	//    3    6:aload           4
	//    4    8:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//    5   11:astore_3        
		vectordrawablecompatstate.mTintMode = parseTintModeCompat(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
	//    6   12:aload           4
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:ldc2            #302 <String "tintMode">
	//   10   19:bipush          6
	//   11   21:iconst_m1       
	//   12   22:invokestatic    #308 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   13   25:getstatic       #56  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   14   28:invokestatic    #310 <Method android.graphics.PorterDuff$Mode parseTintModeCompat(int, android.graphics.PorterDuff$Mode)>
	//   15   31:putfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
		ColorStateList colorstatelist = typedarray.getColorStateList(1);
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #316 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   19   39:astore          5
		if(colorstatelist != null)
	//*  20   41:aload           5
	//*  21   43:ifnull          53
			vectordrawablecompatstate.mTint = colorstatelist;
	//   22   46:aload           4
	//   23   48:aload           5
	//   24   50:putfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
		vectordrawablecompatstate.mAutoMirrored = TypedArrayUtils.getNamedBoolean(typedarray, xmlpullparser, "autoMirrored", 5, vectordrawablecompatstate.mAutoMirrored);
	//   25   53:aload           4
	//   26   55:aload_1         
	//   27   56:aload_2         
	//   28   57:ldc2            #318 <String "autoMirrored">
	//   29   60:iconst_5        
	//   30   61:aload           4
	//   31   63:getfield        #321 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
	//   32   66:invokestatic    #325 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   33   69:putfield        #321 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
		vpathrenderer.mViewportWidth = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportWidth", 7, vpathrenderer.mViewportWidth);
	//   34   72:aload_3         
	//   35   73:aload_1         
	//   36   74:aload_2         
	//   37   75:ldc2            #327 <String "viewportWidth">
	//   38   78:bipush          7
	//   39   80:aload_3         
	//   40   81:getfield        #331 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//   41   84:invokestatic    #335 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   42   87:putfield        #331 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
		vpathrenderer.mViewportHeight = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportHeight", 8, vpathrenderer.mViewportHeight);
	//   43   90:aload_3         
	//   44   91:aload_1         
	//   45   92:aload_2         
	//   46   93:ldc2            #337 <String "viewportHeight">
	//   47   96:bipush          8
	//   48   98:aload_3         
	//   49   99:getfield        #340 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//   50  102:invokestatic    #335 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   51  105:putfield        #340 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
		if(vpathrenderer.mViewportWidth > 0.0F)
	//*  52  108:aload_3         
	//*  53  109:getfield        #331 <Field float VectorDrawableCompat$VPathRenderer.mViewportWidth>
	//*  54  112:fconst_0        
	//*  55  113:fcmpg           
	//*  56  114:ifle            324
		{
			if(vpathrenderer.mViewportHeight > 0.0F)
	//*  57  117:aload_3         
	//*  58  118:getfield        #340 <Field float VectorDrawableCompat$VPathRenderer.mViewportHeight>
	//*  59  121:fconst_0        
	//*  60  122:fcmpg           
	//*  61  123:ifle            287
			{
				vpathrenderer.mBaseWidth = typedarray.getDimension(3, vpathrenderer.mBaseWidth);
	//   62  126:aload_3         
	//   63  127:aload_1         
	//   64  128:iconst_3        
	//   65  129:aload_3         
	//   66  130:getfield        #343 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   67  133:invokevirtual   #347 <Method float TypedArray.getDimension(int, float)>
	//   68  136:putfield        #343 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
				vpathrenderer.mBaseHeight = typedarray.getDimension(2, vpathrenderer.mBaseHeight);
	//   69  139:aload_3         
	//   70  140:aload_1         
	//   71  141:iconst_2        
	//   72  142:aload_3         
	//   73  143:getfield        #350 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//   74  146:invokevirtual   #347 <Method float TypedArray.getDimension(int, float)>
	//   75  149:putfield        #350 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
				if(vpathrenderer.mBaseWidth > 0.0F)
	//*  76  152:aload_3         
	//*  77  153:getfield        #343 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//*  78  156:fconst_0        
	//*  79  157:fcmpg           
	//*  80  158:ifle            250
				{
					if(vpathrenderer.mBaseHeight > 0.0F)
	//*  81  161:aload_3         
	//*  82  162:getfield        #350 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//*  83  165:fconst_0        
	//*  84  166:fcmpg           
	//*  85  167:ifle            213
					{
						vpathrenderer.setAlpha(TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "alpha", 4, vpathrenderer.getAlpha()));
	//   86  170:aload_3         
	//   87  171:aload_1         
	//   88  172:aload_2         
	//   89  173:ldc2            #351 <String "alpha">
	//   90  176:iconst_4        
	//   91  177:aload_3         
	//   92  178:invokevirtual   #355 <Method float VectorDrawableCompat$VPathRenderer.getAlpha()>
	//   93  181:invokestatic    #335 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   94  184:invokevirtual   #359 <Method void VectorDrawableCompat$VPathRenderer.setAlpha(float)>
						typedarray = ((TypedArray) (typedarray.getString(0)));
	//   95  187:aload_1         
	//   96  188:iconst_0        
	//   97  189:invokevirtual   #363 <Method String TypedArray.getString(int)>
	//   98  192:astore_1        
						if(typedarray != null)
	//*  99  193:aload_1         
	//* 100  194:ifnull          212
						{
							vpathrenderer.mRootName = ((String) (typedarray));
	//  101  197:aload_3         
	//  102  198:aload_1         
	//  103  199:putfield        #367 <Field String VectorDrawableCompat$VPathRenderer.mRootName>
							vpathrenderer.mVGTargetsMap.put(((Object) (typedarray)), ((Object) (vpathrenderer)));
	//  104  202:aload_3         
	//  105  203:getfield        #241 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//  106  206:aload_1         
	//  107  207:aload_3         
	//  108  208:invokevirtual   #247 <Method Object ArrayMap.put(Object, Object)>
	//  109  211:pop             
						}
						return;
	//  110  212:return          
					} else
					{
						xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  111  213:new             #369 <Class StringBuilder>
	//  112  216:dup             
	//  113  217:invokespecial   #370 <Method void StringBuilder()>
	//  114  220:astore_2        
						((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//  115  221:aload_2         
	//  116  222:aload_1         
	//  117  223:invokevirtual   #373 <Method String TypedArray.getPositionDescription()>
	//  118  226:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  119  229:pop             
						((StringBuilder) (xmlpullparser)).append("<vector> tag requires height > 0");
	//  120  230:aload_2         
	//  121  231:ldc2            #379 <String "<vector> tag requires height > 0">
	//  122  234:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  123  237:pop             
						throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//  124  238:new             #110 <Class XmlPullParserException>
	//  125  241:dup             
	//  126  242:aload_2         
	//  127  243:invokevirtual   #382 <Method String StringBuilder.toString()>
	//  128  246:invokespecial   #167 <Method void XmlPullParserException(String)>
	//  129  249:athrow          
					}
				} else
				{
					xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  130  250:new             #369 <Class StringBuilder>
	//  131  253:dup             
	//  132  254:invokespecial   #370 <Method void StringBuilder()>
	//  133  257:astore_2        
					((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//  134  258:aload_2         
	//  135  259:aload_1         
	//  136  260:invokevirtual   #373 <Method String TypedArray.getPositionDescription()>
	//  137  263:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  138  266:pop             
					((StringBuilder) (xmlpullparser)).append("<vector> tag requires width > 0");
	//  139  267:aload_2         
	//  140  268:ldc2            #384 <String "<vector> tag requires width > 0">
	//  141  271:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  142  274:pop             
					throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//  143  275:new             #110 <Class XmlPullParserException>
	//  144  278:dup             
	//  145  279:aload_2         
	//  146  280:invokevirtual   #382 <Method String StringBuilder.toString()>
	//  147  283:invokespecial   #167 <Method void XmlPullParserException(String)>
	//  148  286:athrow          
				}
			} else
			{
				xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  149  287:new             #369 <Class StringBuilder>
	//  150  290:dup             
	//  151  291:invokespecial   #370 <Method void StringBuilder()>
	//  152  294:astore_2        
				((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//  153  295:aload_2         
	//  154  296:aload_1         
	//  155  297:invokevirtual   #373 <Method String TypedArray.getPositionDescription()>
	//  156  300:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  157  303:pop             
				((StringBuilder) (xmlpullparser)).append("<vector> tag requires viewportHeight > 0");
	//  158  304:aload_2         
	//  159  305:ldc2            #386 <String "<vector> tag requires viewportHeight > 0">
	//  160  308:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  161  311:pop             
				throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//  162  312:new             #110 <Class XmlPullParserException>
	//  163  315:dup             
	//  164  316:aload_2         
	//  165  317:invokevirtual   #382 <Method String StringBuilder.toString()>
	//  166  320:invokespecial   #167 <Method void XmlPullParserException(String)>
	//  167  323:athrow          
			}
		} else
		{
			xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//  168  324:new             #369 <Class StringBuilder>
	//  169  327:dup             
	//  170  328:invokespecial   #370 <Method void StringBuilder()>
	//  171  331:astore_2        
			((StringBuilder) (xmlpullparser)).append(typedarray.getPositionDescription());
	//  172  332:aload_2         
	//  173  333:aload_1         
	//  174  334:invokevirtual   #373 <Method String TypedArray.getPositionDescription()>
	//  175  337:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  176  340:pop             
			((StringBuilder) (xmlpullparser)).append("<vector> tag requires viewportWidth > 0");
	//  177  341:aload_2         
	//  178  342:ldc2            #388 <String "<vector> tag requires viewportWidth > 0">
	//  179  345:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//  180  348:pop             
			throw new XmlPullParserException(((StringBuilder) (xmlpullparser)).toString());
	//  181  349:new             #110 <Class XmlPullParserException>
	//  182  352:dup             
	//  183  353:aload_2         
	//  184  354:invokevirtual   #382 <Method String StringBuilder.toString()>
	//  185  357:invokespecial   #167 <Method void XmlPullParserException(String)>
	//  186  360:athrow          
		}
	}

	public volatile void applyTheme(android.content.res.Resources.Theme theme)
	{
		super.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #392 <Method void VectorDrawableCommon.applyTheme(android.content.res.Resources$Theme)>
	//    3    5:return          
	}

	public boolean canApplyTheme()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			DrawableCompat.canApplyTheme(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #396 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
	//    6   14:pop             
		return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #399 <Method void VectorDrawableCommon.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #403 <Method void Drawable.draw(Canvas)>
			return;
	//    7   15:return          
		}
		copyBounds(mTmpBounds);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field Rect mTmpBounds>
	//   11   21:invokevirtual   #407 <Method void copyBounds(Rect)>
		if(mTmpBounds.width() > 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #76  <Field Rect mTmpBounds>
	//*  14   28:invokevirtual   #410 <Method int Rect.width()>
	//*  15   31:ifle            347
		{
			if(mTmpBounds.height() <= 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #76  <Field Rect mTmpBounds>
	//*  18   38:invokevirtual   #413 <Method int Rect.height()>
	//*  19   41:ifgt            45
				return;
	//   20   44:return          
			ColorFilter colorfilter = mColorFilter;
	//   21   45:aload_0         
	//   22   46:getfield        #415 <Field ColorFilter mColorFilter>
	//   23   49:astore          10
			Object obj = ((Object) (colorfilter));
	//   24   51:aload           10
	//   25   53:astore          9
			if(colorfilter == null)
	//*  26   55:aload           10
	//*  27   57:ifnonnull       66
				obj = ((Object) (mTintFilter));
	//   28   60:aload_0         
	//   29   61:getfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   30   64:astore          9
			canvas.getMatrix(mTmpMatrix);
	//   31   66:aload_1         
	//   32   67:aload_0         
	//   33   68:getfield        #71  <Field Matrix mTmpMatrix>
	//   34   71:invokevirtual   #421 <Method void Canvas.getMatrix(Matrix)>
			mTmpMatrix.getValues(mTmpFloats);
	//   35   74:aload_0         
	//   36   75:getfield        #71  <Field Matrix mTmpMatrix>
	//   37   78:aload_0         
	//   38   79:getfield        #66  <Field float[] mTmpFloats>
	//   39   82:invokevirtual   #425 <Method void Matrix.getValues(float[])>
			float f = Math.abs(mTmpFloats[0]);
	//   40   85:aload_0         
	//   41   86:getfield        #66  <Field float[] mTmpFloats>
	//   42   89:iconst_0        
	//   43   90:faload          
	//   44   91:invokestatic    #431 <Method float Math.abs(float)>
	//   45   94:fstore_2        
			float f1 = Math.abs(mTmpFloats[4]);
	//   46   95:aload_0         
	//   47   96:getfield        #66  <Field float[] mTmpFloats>
	//   48   99:iconst_4        
	//   49  100:faload          
	//   50  101:invokestatic    #431 <Method float Math.abs(float)>
	//   51  104:fstore_3        
			float f3 = Math.abs(mTmpFloats[1]);
	//   52  105:aload_0         
	//   53  106:getfield        #66  <Field float[] mTmpFloats>
	//   54  109:iconst_1        
	//   55  110:faload          
	//   56  111:invokestatic    #431 <Method float Math.abs(float)>
	//   57  114:fstore          5
			float f2 = Math.abs(mTmpFloats[3]);
	//   58  116:aload_0         
	//   59  117:getfield        #66  <Field float[] mTmpFloats>
	//   60  120:iconst_3        
	//   61  121:faload          
	//   62  122:invokestatic    #431 <Method float Math.abs(float)>
	//   63  125:fstore          4
			if(f3 != 0.0F || f2 != 0.0F)
	//*  64  127:fload           5
	//*  65  129:fconst_0        
	//*  66  130:fcmpl           
	//*  67  131:ifne            141
	//*  68  134:fload           4
	//*  69  136:fconst_0        
	//*  70  137:fcmpl           
	//*  71  138:ifeq            145
			{
				f = 1.0F;
	//   72  141:fconst_1        
	//   73  142:fstore_2        
				f1 = 1.0F;
	//   74  143:fconst_1        
	//   75  144:fstore_3        
			}
			int i = (int)((float)mTmpBounds.width() * f);
	//   76  145:aload_0         
	//   77  146:getfield        #76  <Field Rect mTmpBounds>
	//   78  149:invokevirtual   #410 <Method int Rect.width()>
	//   79  152:i2f             
	//   80  153:fload_2         
	//   81  154:fmul            
	//   82  155:f2i             
	//   83  156:istore          6
			int j = (int)((float)mTmpBounds.height() * f1);
	//   84  158:aload_0         
	//   85  159:getfield        #76  <Field Rect mTmpBounds>
	//   86  162:invokevirtual   #413 <Method int Rect.height()>
	//   87  165:i2f             
	//   88  166:fload_3         
	//   89  167:fmul            
	//   90  168:f2i             
	//   91  169:istore          7
			i = Math.min(2048, i);
	//   92  171:sipush          2048
	//   93  174:iload           6
	//   94  176:invokestatic    #435 <Method int Math.min(int, int)>
	//   95  179:istore          6
			j = Math.min(2048, j);
	//   96  181:sipush          2048
	//   97  184:iload           7
	//   98  186:invokestatic    #435 <Method int Math.min(int, int)>
	//   99  189:istore          7
			if(i > 0)
	//* 100  191:iload           6
	//* 101  193:ifle            346
			{
				if(j <= 0)
	//* 102  196:iload           7
	//* 103  198:ifgt            202
					return;
	//  104  201:return          
				int k = canvas.save();
	//  105  202:aload_1         
	//  106  203:invokevirtual   #438 <Method int Canvas.save()>
	//  107  206:istore          8
				canvas.translate(mTmpBounds.left, mTmpBounds.top);
	//  108  208:aload_1         
	//  109  209:aload_0         
	//  110  210:getfield        #76  <Field Rect mTmpBounds>
	//  111  213:getfield        #441 <Field int Rect.left>
	//  112  216:i2f             
	//  113  217:aload_0         
	//  114  218:getfield        #76  <Field Rect mTmpBounds>
	//  115  221:getfield        #444 <Field int Rect.top>
	//  116  224:i2f             
	//  117  225:invokevirtual   #448 <Method void Canvas.translate(float, float)>
				if(needMirroring())
	//* 118  228:aload_0         
	//* 119  229:invokespecial   #450 <Method boolean needMirroring()>
	//* 120  232:ifeq            256
				{
					canvas.translate(mTmpBounds.width(), 0.0F);
	//  121  235:aload_1         
	//  122  236:aload_0         
	//  123  237:getfield        #76  <Field Rect mTmpBounds>
	//  124  240:invokevirtual   #410 <Method int Rect.width()>
	//  125  243:i2f             
	//  126  244:fconst_0        
	//  127  245:invokevirtual   #448 <Method void Canvas.translate(float, float)>
					canvas.scale(-1F, 1.0F);
	//  128  248:aload_1         
	//  129  249:ldc2            #451 <Float -1F>
	//  130  252:fconst_1        
	//  131  253:invokevirtual   #454 <Method void Canvas.scale(float, float)>
				}
				mTmpBounds.offsetTo(0, 0);
	//  132  256:aload_0         
	//  133  257:getfield        #76  <Field Rect mTmpBounds>
	//  134  260:iconst_0        
	//  135  261:iconst_0        
	//  136  262:invokevirtual   #458 <Method void Rect.offsetTo(int, int)>
				mVectorState.createCachedBitmapIfNeeded(i, j);
	//  137  265:aload_0         
	//  138  266:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  139  269:iload           6
	//  140  271:iload           7
	//  141  273:invokevirtual   #461 <Method void VectorDrawableCompat$VectorDrawableCompatState.createCachedBitmapIfNeeded(int, int)>
				if(!mAllowCaching)
	//* 142  276:aload_0         
	//* 143  277:getfield        #64  <Field boolean mAllowCaching>
	//* 144  280:ifne            297
					mVectorState.updateCachedBitmap(i, j);
	//  145  283:aload_0         
	//  146  284:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  147  287:iload           6
	//  148  289:iload           7
	//  149  291:invokevirtual   #464 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCachedBitmap(int, int)>
				else
	//* 150  294:goto            325
				if(!mVectorState.canReuseCache())
	//* 151  297:aload_0         
	//* 152  298:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//* 153  301:invokevirtual   #467 <Method boolean VectorDrawableCompat$VectorDrawableCompatState.canReuseCache()>
	//* 154  304:ifne            325
				{
					mVectorState.updateCachedBitmap(i, j);
	//  155  307:aload_0         
	//  156  308:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  157  311:iload           6
	//  158  313:iload           7
	//  159  315:invokevirtual   #464 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCachedBitmap(int, int)>
					mVectorState.updateCacheStates();
	//  160  318:aload_0         
	//  161  319:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  162  322:invokevirtual   #470 <Method void VectorDrawableCompat$VectorDrawableCompatState.updateCacheStates()>
				}
				mVectorState.drawCachedBitmapWithRootAlpha(canvas, ((ColorFilter) (obj)), mTmpBounds);
	//  163  325:aload_0         
	//  164  326:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//  165  329:aload_1         
	//  166  330:aload           9
	//  167  332:aload_0         
	//  168  333:getfield        #76  <Field Rect mTmpBounds>
	//  169  336:invokevirtual   #474 <Method void VectorDrawableCompat$VectorDrawableCompatState.drawCachedBitmapWithRootAlpha(Canvas, ColorFilter, Rect)>
				canvas.restoreToCount(k);
	//  170  339:aload_1         
	//  171  340:iload           8
	//  172  342:invokevirtual   #478 <Method void Canvas.restoreToCount(int)>
				return;
	//  173  345:return          
			} else
			{
				return;
	//  174  346:return          
			}
		} else
		{
			return;
	//  175  347:return          
		}
	}

	public int getAlpha()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getAlpha(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #480 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.mVPathRenderer.getRootAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:invokevirtual   #483 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   11   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #486 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mVectorState.getChangingConfigurations();
	//    7   15:aload_0         
	//    8   16:invokespecial   #487 <Method int VectorDrawableCommon.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   11   23:invokevirtual   #488 <Method int VectorDrawableCompat$VectorDrawableCompatState.getChangingConfigurations()>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #492 <Method ColorFilter VectorDrawableCommon.getColorFilter()>
	//    2    4:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDelegateDrawable != null && android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          30
	//*   3    7:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          24
	//*   5   12:icmplt          30
		{
			return ((android.graphics.drawable.Drawable.ConstantState) (new VectorDrawableDelegateState(mDelegateDrawable.getConstantState())));
	//    6   15:new             #29  <Class VectorDrawableCompat$VectorDrawableDelegateState>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:getfield        #129 <Field Drawable mDelegateDrawable>
	//   10   23:invokevirtual   #135 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   11   26:invokespecial   #138 <Method void VectorDrawableCompat$VectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   12   29:areturn         
		} else
		{
			mVectorState.mChangingConfigurations = getChangingConfigurations();
	//   13   30:aload_0         
	//   14   31:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   15   34:aload_0         
	//   16   35:invokevirtual   #493 <Method int getChangingConfigurations()>
	//   17   38:putfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (mVectorState));
	//   18   41:aload_0         
	//   19   42:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   20   45:areturn         
		}
	}

	public volatile Drawable getCurrent()
	{
		return super.getCurrent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #497 <Method Drawable VectorDrawableCommon.getCurrent()>
	//    2    4:areturn         
	}

	public int getIntrinsicHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #500 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.mVPathRenderer.mBaseHeight;
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:getfield        #350 <Field float VectorDrawableCompat$VPathRenderer.mBaseHeight>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #503 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.mVPathRenderer.mBaseWidth;
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   10   22:getfield        #343 <Field float VectorDrawableCompat$VPathRenderer.mBaseWidth>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #506 <Method int VectorDrawableCommon.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #509 <Method int VectorDrawableCommon.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getOpacity();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #512 <Method int Drawable.getOpacity()>
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
	//    2    2:invokespecial   #516 <Method boolean VectorDrawableCommon.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #520 <Method int[] VectorDrawableCommon.getState()>
	//    2    4:areturn         
	}

	Object getTargetByName(String s)
	{
		return mVectorState.mVPathRenderer.mVGTargetsMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    2    4:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//    3    7:getfield        #241 <Field ArrayMap VectorDrawableCompat$VPathRenderer.mVGTargetsMap>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #526 <Method Object ArrayMap.get(Object)>
	//    6   14:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #530 <Method Region VectorDrawableCommon.getTransparentRegion()>
	//    2    4:areturn         
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			mDelegateDrawable.inflate(resources, xmlpullparser, attributeset);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #533 <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
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
	//   15   23:invokevirtual   #182 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   16   26:return          
		}
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.inflate(mDelegateDrawable, resources, xmlpullparser, attributeset, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokestatic    #536 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   10   19:return          
		} else
		{
			VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//   11   20:aload_0         
	//   12   21:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   13   24:astore          5
			vectordrawablecompatstate.mVPathRenderer = new VPathRenderer();
	//   14   26:aload           5
	//   15   28:new             #23  <Class VectorDrawableCompat$VPathRenderer>
	//   16   31:dup             
	//   17   32:invokespecial   #537 <Method void VectorDrawableCompat$VPathRenderer()>
	//   18   35:putfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
			TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
	//   19   38:aload_1         
	//   20   39:aload           4
	//   21   41:aload_3         
	//   22   42:getstatic       #543 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY>
	//   23   45:invokestatic    #547 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   24   48:astore          6
			updateStateFromTypedArray(typedarray, xmlpullparser);
	//   25   50:aload_0         
	//   26   51:aload           6
	//   27   53:aload_2         
	//   28   54:invokespecial   #549 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			typedarray.recycle();
	//   29   57:aload           6
	//   30   59:invokevirtual   #552 <Method void TypedArray.recycle()>
			vectordrawablecompatstate.mChangingConfigurations = getChangingConfigurations();
	//   31   62:aload           5
	//   32   64:aload_0         
	//   33   65:invokevirtual   #493 <Method int getChangingConfigurations()>
	//   34   68:putfield        #250 <Field int VectorDrawableCompat$VectorDrawableCompatState.mChangingConfigurations>
			vectordrawablecompatstate.mCacheDirty = true;
	//   35   71:aload           5
	//   36   73:iconst_1        
	//   37   74:putfield        #555 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mCacheDirty>
			inflateInternal(resources, xmlpullparser, attributeset, theme);
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:aload_2         
	//   41   80:aload_3         
	//   42   81:aload           4
	//   43   83:invokespecial   #557 <Method void inflateInternal(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, vectordrawablecompatstate.mTintMode);
	//   44   86:aload_0         
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   48   92:aload           5
	//   49   94:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   50   97:aload           5
	//   51   99:getfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   52  102:invokevirtual   #94  <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   53  105:putfield        #83  <Field PorterDuffColorFilter mTintFilter>
			return;
	//   54  108:return          
		}
	}

	public void invalidateSelf()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
		{
			mDelegateDrawable.invalidateSelf();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #560 <Method void Drawable.invalidateSelf()>
			return;
	//    6   14:return          
		} else
		{
			super.invalidateSelf();
	//    7   15:aload_0         
	//    8   16:invokespecial   #561 <Method void VectorDrawableCommon.invalidateSelf()>
			return;
	//    9   19:return          
		}
	}

	public boolean isAutoMirrored()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.isAutoMirrored(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #563 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.mAutoMirrored;
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//    9   19:getfield        #321 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
	//   10   22:ireturn         
	}

	public boolean isStateful()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.isStateful();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #566 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		if(!super.isStateful())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #567 <Method boolean VectorDrawableCommon.isStateful()>
	//*   9   19:ifne            66
		{
			VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//   10   22:aload_0         
	//   11   23:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   12   26:astore_1        
			if(vectordrawablecompatstate == null || !vectordrawablecompatstate.isStateful() && (mVectorState.mTint == null || !mVectorState.mTint.isStateful()))
	//*  13   27:aload_1         
	//*  14   28:ifnull          64
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #568 <Method boolean VectorDrawableCompat$VectorDrawableCompatState.isStateful()>
	//*  17   35:ifne            66
	//*  18   38:aload_0         
	//*  19   39:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  20   42:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  21   45:ifnull          64
	//*  22   48:aload_0         
	//*  23   49:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  24   52:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  25   55:invokevirtual   #571 <Method boolean ColorStateList.isStateful()>
	//*  26   58:ifeq            64
	//*  27   61:goto            66
				return false;
	//   28   64:iconst_0        
	//   29   65:ireturn         
		}
		return true;
	//   30   66:iconst_1        
	//   31   67:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #574 <Method void VectorDrawableCommon.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #577 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
			return ((Drawable) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
		}
		if(!mMutated && super.mutate() == this)
	//*   9   17:aload_0         
	//*  10   18:getfield        #579 <Field boolean mMutated>
	//*  11   21:ifne            52
	//*  12   24:aload_0         
	//*  13   25:invokespecial   #580 <Method Drawable VectorDrawableCommon.mutate()>
	//*  14   28:aload_0         
	//*  15   29:if_acmpne       52
		{
			mVectorState = new VectorDrawableCompatState(mVectorState);
	//   16   32:aload_0         
	//   17   33:new             #26  <Class VectorDrawableCompat$VectorDrawableCompatState>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   21   41:invokespecial   #582 <Method void VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompat$VectorDrawableCompatState)>
	//   22   44:putfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
			mMutated = true;
	//   23   47:aload_0         
	//   24   48:iconst_1        
	//   25   49:putfield        #579 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   26   52:aload_0         
	//   27   53:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #586 <Method void Drawable.setBounds(Rect)>
	//    7   15:return          
	}

	protected boolean onStateChange(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #591 <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		boolean flag1 = false;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//   10   18:aload_0         
	//   11   19:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   12   22:astore          4
		boolean flag = flag1;
	//   13   24:iload_3         
	//   14   25:istore_2        
		if(vectordrawablecompatstate.mTint != null)
	//*  15   26:aload           4
	//*  16   28:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  17   31:ifnull          72
		{
			flag = flag1;
	//   18   34:iload_3         
	//   19   35:istore_2        
			if(vectordrawablecompatstate.mTintMode != null)
	//*  20   36:aload           4
	//*  21   38:getfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//*  22   41:ifnull          72
			{
				mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, vectordrawablecompatstate.mTintMode);
	//   23   44:aload_0         
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   27   50:aload           4
	//   28   52:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   29   55:aload           4
	//   30   57:getfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   31   60:invokevirtual   #94  <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   32   63:putfield        #83  <Field PorterDuffColorFilter mTintFilter>
				invalidateSelf();
	//   33   66:aload_0         
	//   34   67:invokevirtual   #592 <Method void invalidateSelf()>
				flag = true;
	//   35   70:iconst_1        
	//   36   71:istore_2        
			}
		}
		flag1 = flag;
	//   37   72:iload_2         
	//   38   73:istore_3        
		if(vectordrawablecompatstate.isStateful())
	//*  39   74:aload           4
	//*  40   76:invokevirtual   #568 <Method boolean VectorDrawableCompat$VectorDrawableCompatState.isStateful()>
	//*  41   79:ifeq            99
		{
			flag1 = flag;
	//   42   82:iload_2         
	//   43   83:istore_3        
			if(vectordrawablecompatstate.onStateChanged(ai))
	//*  44   84:aload           4
	//*  45   86:aload_1         
	//*  46   87:invokevirtual   #595 <Method boolean VectorDrawableCompat$VectorDrawableCompatState.onStateChanged(int[])>
	//*  47   90:ifeq            99
			{
				invalidateSelf();
	//   48   93:aload_0         
	//   49   94:invokevirtual   #592 <Method void invalidateSelf()>
				flag1 = true;
	//   50   97:iconst_1        
	//   51   98:istore_3        
			}
		}
		return flag1;
	//   52   99:iload_3         
	//   53  100:ireturn         
	}

	public void scheduleSelf(Runnable runnable, long l)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.scheduleSelf(runnable, l);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:lload_2         
	//    7   13:invokevirtual   #599 <Method void Drawable.scheduleSelf(Runnable, long)>
			return;
	//    8   16:return          
		} else
		{
			super.scheduleSelf(runnable, l);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:invokespecial   #600 <Method void VectorDrawableCommon.scheduleSelf(Runnable, long)>
			return;
	//   13   23:return          
		}
	}

	void setAllowCaching(boolean flag)
	{
		mAllowCaching = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean mAllowCaching>
	//    3    5:return          
	}

	public void setAlpha(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #604 <Method void Drawable.setAlpha(int)>
			return;
	//    7   15:return          
		}
		if(mVectorState.mVPathRenderer.getRootAlpha() != i)
	//*   8   16:aload_0         
	//*   9   17:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//*  10   20:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//*  11   23:invokevirtual   #483 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//*  12   26:iload_1         
	//*  13   27:icmpeq          45
		{
			mVectorState.mVPathRenderer.setRootAlpha(i);
	//   14   30:aload_0         
	//   15   31:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   16   34:getfield        #188 <Field VectorDrawableCompat$VPathRenderer VectorDrawableCompat$VectorDrawableCompatState.mVPathRenderer>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #607 <Method void VectorDrawableCompat$VPathRenderer.setRootAlpha(int)>
			invalidateSelf();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #592 <Method void invalidateSelf()>
		}
	//   21   45:return          
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setAutoMirrored(mDelegateDrawable, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #611 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
			return;
	//    7   15:return          
		} else
		{
			mVectorState.mAutoMirrored = flag;
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:iload_1         
	//   11   21:putfield        #321 <Field boolean VectorDrawableCompat$VectorDrawableCompatState.mAutoMirrored>
			return;
	//   12   24:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #614 <Method void VectorDrawableCommon.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #618 <Method void VectorDrawableCommon.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    4    6:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setColorFilter(colorfilter);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #621 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mColorFilter = colorfilter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #415 <Field ColorFilter mColorFilter>
			invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #592 <Method void invalidateSelf()>
			return;
	//   13   25:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #624 <Method void VectorDrawableCommon.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #627 <Method void VectorDrawableCommon.setHotspot(float, float)>
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
	//    5    6:invokespecial   #631 <Method void VectorDrawableCommon.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #632 <Method boolean VectorDrawableCommon.setState(int[])>
	//    3    5:ireturn         
	}

	public void setTint(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTint(mDelegateDrawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #636 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			setTintList(ColorStateList.valueOf(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #639 <Method ColorStateList ColorStateList.valueOf(int)>
	//   11   21:invokevirtual   #643 <Method void setTintList(ColorStateList)>
			return;
	//   12   24:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintList(mDelegateDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #646 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			return;
	//    7   15:return          
		}
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_2        
		if(vectordrawablecompatstate.mTint != colorstatelist)
	//*  11   21:aload_2         
	//*  12   22:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       55
		{
			vectordrawablecompatstate.mTint = colorstatelist;
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:putfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
			mTintFilter = updateTintFilter(mTintFilter, colorstatelist, vectordrawablecompatstate.mTintMode);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:getfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//   25   45:invokevirtual   #94  <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   48:putfield        #83  <Field PorterDuffColorFilter mTintFilter>
			invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #592 <Method void invalidateSelf()>
		}
	//   29   55:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintMode(mDelegateDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #651 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		}
		VectorDrawableCompatState vectordrawablecompatstate = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field VectorDrawableCompat$VectorDrawableCompatState mVectorState>
	//   10   20:astore_2        
		if(vectordrawablecompatstate.mTintMode != mode)
	//*  11   21:aload_2         
	//*  12   22:getfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       55
		{
			vectordrawablecompatstate.mTintMode = mode;
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:putfield        #90  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$VectorDrawableCompatState.mTintMode>
			mTintFilter = updateTintFilter(mTintFilter, vectordrawablecompatstate.mTint, mode);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #83  <Field PorterDuffColorFilter mTintFilter>
	//   22   40:aload_2         
	//   23   41:getfield        #87  <Field ColorStateList VectorDrawableCompat$VectorDrawableCompatState.mTint>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #94  <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   48:putfield        #83  <Field PorterDuffColorFilter mTintFilter>
			invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #592 <Method void invalidateSelf()>
		}
	//   29   55:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
			return mDelegateDrawable.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #655 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		else
			return super.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokespecial   #656 <Method boolean VectorDrawableCommon.setVisible(boolean, boolean)>
	//   13   23:ireturn         
	}

	public void unscheduleSelf(Runnable runnable)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.unscheduleSelf(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #660 <Method void Drawable.unscheduleSelf(Runnable)>
			return;
	//    7   15:return          
		} else
		{
			super.unscheduleSelf(runnable);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #661 <Method void VectorDrawableCommon.unscheduleSelf(Runnable)>
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
	//    5   11:new             #663 <Class PorterDuffColorFilter>
	//    6   14:dup             
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #664 <Method int[] getState()>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #668 <Method int ColorStateList.getColorForState(int[], int)>
	//   12   24:aload_3         
	//   13   25:invokespecial   #670 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE;
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
	//    0    0:getstatic       #56  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #58  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
