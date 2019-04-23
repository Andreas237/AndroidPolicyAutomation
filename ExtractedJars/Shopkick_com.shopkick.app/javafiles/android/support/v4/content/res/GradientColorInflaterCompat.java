// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content.res:
//			TypedArrayUtils

final class GradientColorInflaterCompat
{
	static final class ColorStops
	{

		final int mColors[];
		final float mOffsets[] = {
			0.0F, 1.0F
		};

		ColorStops(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mColors = (new int[] {
				i, j
			});
		//    2    4:aload_0         
		//    3    5:iconst_2        
		//    4    6:newarray        int[]
		//    5    8:dup             
		//    6    9:iconst_0        
		//    7   10:iload_1         
		//    8   11:iastore         
		//    9   12:dup             
		//   10   13:iconst_1        
		//   11   14:iload_2         
		//   12   15:iastore         
		//   13   16:putfield        #19  <Field int[] mColors>
		//   14   19:aload_0         
		//   15   20:iconst_2        
		//   16   21:newarray        float[]
		//   17   23:dup             
		//   18   24:iconst_0        
		//   19   25:fconst_0        
		//   20   26:fastore         
		//   21   27:dup             
		//   22   28:iconst_1        
		//   23   29:fconst_1        
		//   24   30:fastore         
		//   25   31:putfield        #21  <Field float[] mOffsets>
		//   26   34:return          
		}

		ColorStops(int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mColors = (new int[] {
				i, j, k
			});
		//    2    4:aload_0         
		//    3    5:iconst_3        
		//    4    6:newarray        int[]
		//    5    8:dup             
		//    6    9:iconst_0        
		//    7   10:iload_1         
		//    8   11:iastore         
		//    9   12:dup             
		//   10   13:iconst_1        
		//   11   14:iload_2         
		//   12   15:iastore         
		//   13   16:dup             
		//   14   17:iconst_2        
		//   15   18:iload_3         
		//   16   19:iastore         
		//   17   20:putfield        #19  <Field int[] mColors>
		//   18   23:aload_0         
		//   19   24:iconst_3        
		//   20   25:newarray        float[]
		//   21   27:dup             
		//   22   28:iconst_0        
		//   23   29:fconst_0        
		//   24   30:fastore         
		//   25   31:dup             
		//   26   32:iconst_1        
		//   27   33:ldc1            #25  <Float 0.5F>
		//   28   35:fastore         
		//   29   36:dup             
		//   30   37:iconst_2        
		//   31   38:fconst_1        
		//   32   39:fastore         
		//   33   40:putfield        #21  <Field float[] mOffsets>
		//   34   43:return          
		}

		ColorStops(List list, List list1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			int j = list.size();
		//    2    4:aload_1         
		//    3    5:invokeinterface #33  <Method int List.size()>
		//    4   10:istore          4
			mColors = new int[j];
		//    5   12:aload_0         
		//    6   13:iload           4
		//    7   15:newarray        int[]
		//    8   17:putfield        #19  <Field int[] mColors>
			mOffsets = new float[j];
		//    9   20:aload_0         
		//   10   21:iload           4
		//   11   23:newarray        float[]
		//   12   25:putfield        #21  <Field float[] mOffsets>
			for(int i = 0; i < j; i++)
		//*  13   28:iconst_0        
		//*  14   29:istore_3        
		//*  15   30:iload_3         
		//*  16   31:iload           4
		//*  17   33:icmpge          81
			{
				mColors[i] = ((Integer)list.get(i)).intValue();
		//   18   36:aload_0         
		//   19   37:getfield        #19  <Field int[] mColors>
		//   20   40:iload_3         
		//   21   41:aload_1         
		//   22   42:iload_3         
		//   23   43:invokeinterface #37  <Method Object List.get(int)>
		//   24   48:checkcast       #39  <Class Integer>
		//   25   51:invokevirtual   #42  <Method int Integer.intValue()>
		//   26   54:iastore         
				mOffsets[i] = ((Float)list1.get(i)).floatValue();
		//   27   55:aload_0         
		//   28   56:getfield        #21  <Field float[] mOffsets>
		//   29   59:iload_3         
		//   30   60:aload_2         
		//   31   61:iload_3         
		//   32   62:invokeinterface #37  <Method Object List.get(int)>
		//   33   67:checkcast       #44  <Class Float>
		//   34   70:invokevirtual   #48  <Method float Float.floatValue()>
		//   35   73:fastore         
			}

		//   36   74:iload_3         
		//   37   75:iconst_1        
		//   38   76:iadd            
		//   39   77:istore_3        
		//*  40   78:goto            30
		//   41   81:return          
		}
	}


	private GradientColorInflaterCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	private static ColorStops checkColors(ColorStops colorstops, int i, int j, boolean flag, int k)
	{
		if(colorstops != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return colorstops;
	//    2    4:aload_0         
	//    3    5:areturn         
		if(flag)
	//*   4    6:iload_3         
	//*   5    7:ifeq            22
			return new ColorStops(i, k, j);
	//    6   10:new             #6   <Class GradientColorInflaterCompat$ColorStops>
	//    7   13:dup             
	//    8   14:iload_1         
	//    9   15:iload           4
	//   10   17:iload_2         
	//   11   18:invokespecial   #30  <Method void GradientColorInflaterCompat$ColorStops(int, int, int)>
	//   12   21:areturn         
		else
			return new ColorStops(i, j);
	//   13   22:new             #6   <Class GradientColorInflaterCompat$ColorStops>
	//   14   25:dup             
	//   15   26:iload_1         
	//   16   27:iload_2         
	//   17   28:invokespecial   #33  <Method void GradientColorInflaterCompat$ColorStops(int, int)>
	//   18   31:areturn         
	}

	static Shader createFromXml(Resources resources, XmlPullParser xmlpullparser, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		AttributeSet attributeset = Xml.asAttributeSet(xmlpullparser);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    2    4:astore          4
		int i;
		do
			i = xmlpullparser.next();
	//    3    6:aload_1         
	//    4    7:invokeinterface #53  <Method int XmlPullParser.next()>
	//    5   12:istore_3        
		while(i != 2 && i != 1);
	//    6   13:iload_3         
	//    7   14:iconst_2        
	//    8   15:icmpeq          26
	//    9   18:iload_3         
	//   10   19:iconst_1        
	//   11   20:icmpeq          26
	//*  12   23:goto            6
		if(i == 2)
	//*  13   26:iload_3         
	//*  14   27:iconst_2        
	//*  15   28:icmpne          40
			return createFromXmlInner(resources, xmlpullparser, attributeset, theme);
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aload           4
	//   19   35:aload_2         
	//   20   36:invokestatic    #57  <Method Shader createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   21   39:areturn         
		else
			throw new XmlPullParserException("No start tag found");
	//   22   40:new             #38  <Class XmlPullParserException>
	//   23   43:dup             
	//   24   44:ldc1            #59  <String "No start tag found">
	//   25   46:invokespecial   #62  <Method void XmlPullParserException(String)>
	//   26   49:athrow          
	}

	static Shader createFromXmlInner(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws IOException, XmlPullParserException
	{
		Object obj = ((Object) (xmlpullparser.getName()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #67  <Method String XmlPullParser.getName()>
	//    2    6:astore          17
		if(((String) (obj)).equals("gradient"))
	//*   3    8:aload           17
	//*   4   10:ldc1            #69  <String "gradient">
	//*   5   12:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*   6   15:ifeq            345
		{
			obj = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.compat.R.styleable.GradientColor)));
	//    7   18:aload_0         
	//    8   19:aload_3         
	//    9   20:aload_2         
	//   10   21:getstatic       #81  <Field int[] android.support.compat.R$styleable.GradientColor>
	//   11   24:invokestatic    #87  <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   12   27:astore          17
			float f = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "startX", android.support.compat.R.styleable.GradientColor_android_startX, 0.0F);
	//   13   29:aload           17
	//   14   31:aload_1         
	//   15   32:ldc1            #89  <String "startX">
	//   16   34:getstatic       #92  <Field int android.support.compat.R$styleable.GradientColor_android_startX>
	//   17   37:fconst_0        
	//   18   38:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   19   41:fstore          4
			float f1 = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "startY", android.support.compat.R.styleable.GradientColor_android_startY, 0.0F);
	//   20   43:aload           17
	//   21   45:aload_1         
	//   22   46:ldc1            #98  <String "startY">
	//   23   48:getstatic       #101 <Field int android.support.compat.R$styleable.GradientColor_android_startY>
	//   24   51:fconst_0        
	//   25   52:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   26   55:fstore          5
			float f2 = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "endX", android.support.compat.R.styleable.GradientColor_android_endX, 0.0F);
	//   27   57:aload           17
	//   28   59:aload_1         
	//   29   60:ldc1            #103 <String "endX">
	//   30   62:getstatic       #106 <Field int android.support.compat.R$styleable.GradientColor_android_endX>
	//   31   65:fconst_0        
	//   32   66:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   33   69:fstore          6
			float f3 = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "endY", android.support.compat.R.styleable.GradientColor_android_endY, 0.0F);
	//   34   71:aload           17
	//   35   73:aload_1         
	//   36   74:ldc1            #108 <String "endY">
	//   37   76:getstatic       #111 <Field int android.support.compat.R$styleable.GradientColor_android_endY>
	//   38   79:fconst_0        
	//   39   80:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   40   83:fstore          7
			float f4 = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "centerX", android.support.compat.R.styleable.GradientColor_android_centerX, 0.0F);
	//   41   85:aload           17
	//   42   87:aload_1         
	//   43   88:ldc1            #113 <String "centerX">
	//   44   90:getstatic       #116 <Field int android.support.compat.R$styleable.GradientColor_android_centerX>
	//   45   93:fconst_0        
	//   46   94:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   47   97:fstore          8
			float f5 = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "centerY", android.support.compat.R.styleable.GradientColor_android_centerY, 0.0F);
	//   48   99:aload           17
	//   49  101:aload_1         
	//   50  102:ldc1            #118 <String "centerY">
	//   51  104:getstatic       #121 <Field int android.support.compat.R$styleable.GradientColor_android_centerY>
	//   52  107:fconst_0        
	//   53  108:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   54  111:fstore          9
			int i = TypedArrayUtils.getNamedInt(((TypedArray) (obj)), xmlpullparser, "type", android.support.compat.R.styleable.GradientColor_android_type, 0);
	//   55  113:aload           17
	//   56  115:aload_1         
	//   57  116:ldc1            #123 <String "type">
	//   58  118:getstatic       #126 <Field int android.support.compat.R$styleable.GradientColor_android_type>
	//   59  121:iconst_0        
	//   60  122:invokestatic    #130 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   61  125:istore          11
			int j = TypedArrayUtils.getNamedColor(((TypedArray) (obj)), xmlpullparser, "startColor", android.support.compat.R.styleable.GradientColor_android_startColor, 0);
	//   62  127:aload           17
	//   63  129:aload_1         
	//   64  130:ldc1            #132 <String "startColor">
	//   65  132:getstatic       #135 <Field int android.support.compat.R$styleable.GradientColor_android_startColor>
	//   66  135:iconst_0        
	//   67  136:invokestatic    #138 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   68  139:istore          12
			boolean flag = TypedArrayUtils.hasAttribute(xmlpullparser, "centerColor");
	//   69  141:aload_1         
	//   70  142:ldc1            #140 <String "centerColor">
	//   71  144:invokestatic    #144 <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//   72  147:istore          16
			int k = TypedArrayUtils.getNamedColor(((TypedArray) (obj)), xmlpullparser, "centerColor", android.support.compat.R.styleable.GradientColor_android_centerColor, 0);
	//   73  149:aload           17
	//   74  151:aload_1         
	//   75  152:ldc1            #140 <String "centerColor">
	//   76  154:getstatic       #147 <Field int android.support.compat.R$styleable.GradientColor_android_centerColor>
	//   77  157:iconst_0        
	//   78  158:invokestatic    #138 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   79  161:istore          13
			int l = TypedArrayUtils.getNamedColor(((TypedArray) (obj)), xmlpullparser, "endColor", android.support.compat.R.styleable.GradientColor_android_endColor, 0);
	//   80  163:aload           17
	//   81  165:aload_1         
	//   82  166:ldc1            #149 <String "endColor">
	//   83  168:getstatic       #152 <Field int android.support.compat.R$styleable.GradientColor_android_endColor>
	//   84  171:iconst_0        
	//   85  172:invokestatic    #138 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   86  175:istore          14
			int i1 = TypedArrayUtils.getNamedInt(((TypedArray) (obj)), xmlpullparser, "tileMode", android.support.compat.R.styleable.GradientColor_android_tileMode, 0);
	//   87  177:aload           17
	//   88  179:aload_1         
	//   89  180:ldc1            #154 <String "tileMode">
	//   90  182:getstatic       #157 <Field int android.support.compat.R$styleable.GradientColor_android_tileMode>
	//   91  185:iconst_0        
	//   92  186:invokestatic    #130 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   93  189:istore          15
			float f6 = TypedArrayUtils.getNamedFloat(((TypedArray) (obj)), xmlpullparser, "gradientRadius", android.support.compat.R.styleable.GradientColor_android_gradientRadius, 0.0F);
	//   94  191:aload           17
	//   95  193:aload_1         
	//   96  194:ldc1            #159 <String "gradientRadius">
	//   97  196:getstatic       #162 <Field int android.support.compat.R$styleable.GradientColor_android_gradientRadius>
	//   98  199:fconst_0        
	//   99  200:invokestatic    #96  <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  100  203:fstore          10
			((TypedArray) (obj)).recycle();
	//  101  205:aload           17
	//  102  207:invokevirtual   #167 <Method void TypedArray.recycle()>
			resources = ((Resources) (checkColors(inflateChildElements(resources, xmlpullparser, attributeset, theme), j, l, flag, k)));
	//  103  210:aload_0         
	//  104  211:aload_1         
	//  105  212:aload_2         
	//  106  213:aload_3         
	//  107  214:invokestatic    #171 <Method GradientColorInflaterCompat$ColorStops inflateChildElements(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//  108  217:iload           12
	//  109  219:iload           14
	//  110  221:iload           16
	//  111  223:iload           13
	//  112  225:invokestatic    #173 <Method GradientColorInflaterCompat$ColorStops checkColors(GradientColorInflaterCompat$ColorStops, int, int, boolean, int)>
	//  113  228:astore_0        
			switch(i)
	//* 114  229:iload           11
			{
	//* 115  231:tableswitch     1 2: default 252
	//	               1 301
	//	               2 281
			default:
				return ((Shader) (new LinearGradient(f, f1, f2, f3, ((ColorStops) (resources)).mColors, ((ColorStops) (resources)).mOffsets, parseTileMode(i1))));
	//  116  252:new             #175 <Class LinearGradient>
	//  117  255:dup             
	//  118  256:fload           4
	//  119  258:fload           5
	//  120  260:fload           6
	//  121  262:fload           7
	//  122  264:aload_0         
	//  123  265:getfield        #178 <Field int[] GradientColorInflaterCompat$ColorStops.mColors>
	//  124  268:aload_0         
	//  125  269:getfield        #182 <Field float[] GradientColorInflaterCompat$ColorStops.mOffsets>
	//  126  272:iload           15
	//  127  274:invokestatic    #186 <Method android.graphics.Shader$TileMode parseTileMode(int)>
	//  128  277:invokespecial   #189 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  129  280:areturn         

			case 2: // '\002'
				return ((Shader) (new SweepGradient(f4, f5, ((ColorStops) (resources)).mColors, ((ColorStops) (resources)).mOffsets)));
	//  130  281:new             #191 <Class SweepGradient>
	//  131  284:dup             
	//  132  285:fload           8
	//  133  287:fload           9
	//  134  289:aload_0         
	//  135  290:getfield        #178 <Field int[] GradientColorInflaterCompat$ColorStops.mColors>
	//  136  293:aload_0         
	//  137  294:getfield        #182 <Field float[] GradientColorInflaterCompat$ColorStops.mOffsets>
	//  138  297:invokespecial   #194 <Method void SweepGradient(float, float, int[], float[])>
	//  139  300:areturn         

			case 1: // '\001'
				break;
			}
			if(f6 > 0.0F)
	//* 140  301:fload           10
	//* 141  303:fconst_0        
	//* 142  304:fcmpg           
	//* 143  305:ifle            335
				return ((Shader) (new RadialGradient(f4, f5, f6, ((ColorStops) (resources)).mColors, ((ColorStops) (resources)).mOffsets, parseTileMode(i1))));
	//  144  308:new             #196 <Class RadialGradient>
	//  145  311:dup             
	//  146  312:fload           8
	//  147  314:fload           9
	//  148  316:fload           10
	//  149  318:aload_0         
	//  150  319:getfield        #178 <Field int[] GradientColorInflaterCompat$ColorStops.mColors>
	//  151  322:aload_0         
	//  152  323:getfield        #182 <Field float[] GradientColorInflaterCompat$ColorStops.mOffsets>
	//  153  326:iload           15
	//  154  328:invokestatic    #186 <Method android.graphics.Shader$TileMode parseTileMode(int)>
	//  155  331:invokespecial   #199 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  156  334:areturn         
			else
				throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
	//  157  335:new             #38  <Class XmlPullParserException>
	//  158  338:dup             
	//  159  339:ldc1            #201 <String "<gradient> tag requires 'gradientRadius' attribute with radial type">
	//  160  341:invokespecial   #62  <Method void XmlPullParserException(String)>
	//  161  344:athrow          
		} else
		{
			resources = ((Resources) (new StringBuilder()));
	//  162  345:new             #203 <Class StringBuilder>
	//  163  348:dup             
	//  164  349:invokespecial   #204 <Method void StringBuilder()>
	//  165  352:astore_0        
			((StringBuilder) (resources)).append(xmlpullparser.getPositionDescription());
	//  166  353:aload_0         
	//  167  354:aload_1         
	//  168  355:invokeinterface #207 <Method String XmlPullParser.getPositionDescription()>
	//  169  360:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//  170  363:pop             
			((StringBuilder) (resources)).append(": invalid gradient color tag ");
	//  171  364:aload_0         
	//  172  365:ldc1            #213 <String ": invalid gradient color tag ">
	//  173  367:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//  174  370:pop             
			((StringBuilder) (resources)).append(((String) (obj)));
	//  175  371:aload_0         
	//  176  372:aload           17
	//  177  374:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//  178  377:pop             
			throw new XmlPullParserException(((StringBuilder) (resources)).toString());
	//  179  378:new             #38  <Class XmlPullParserException>
	//  180  381:dup             
	//  181  382:aload_0         
	//  182  383:invokevirtual   #216 <Method String StringBuilder.toString()>
	//  183  386:invokespecial   #62  <Method void XmlPullParserException(String)>
	//  184  389:athrow          
		}
	}

	private static ColorStops inflateChildElements(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth() + 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #219 <Method int XmlPullParser.getDepth()>
	//    2    6:iconst_1        
	//    3    7:iadd            
	//    4    8:istore          5
		ArrayList arraylist = new ArrayList(20);
	//    5   10:new             #221 <Class ArrayList>
	//    6   13:dup             
	//    7   14:bipush          20
	//    8   16:invokespecial   #224 <Method void ArrayList(int)>
	//    9   19:astore          10
		ArrayList arraylist1 = new ArrayList(20);
	//   10   21:new             #221 <Class ArrayList>
	//   11   24:dup             
	//   12   25:bipush          20
	//   13   27:invokespecial   #224 <Method void ArrayList(int)>
	//   14   30:astore          11
		do
		{
			int j = xmlpullparser.next();
	//   15   32:aload_1         
	//   16   33:invokeinterface #53  <Method int XmlPullParser.next()>
	//   17   38:istore          6
			if(j == 1)
				break;
	//   18   40:iload           6
	//   19   42:iconst_1        
	//   20   43:icmpeq          244
			int l = xmlpullparser.getDepth();
	//   21   46:aload_1         
	//   22   47:invokeinterface #219 <Method int XmlPullParser.getDepth()>
	//   23   52:istore          7
			if(l < i && j == 3)
				break;
	//   24   54:iload           7
	//   25   56:iload           5
	//   26   58:icmpge          67
	//   27   61:iload           6
	//   28   63:iconst_3        
	//   29   64:icmpeq          244
			if(j == 2 && l <= i && xmlpullparser.getName().equals("item"))
	//*  30   67:iload           6
	//*  31   69:iconst_2        
	//*  32   70:icmpeq          76
	//*  33   73:goto            32
	//*  34   76:iload           7
	//*  35   78:iload           5
	//*  36   80:icmpgt          32
	//*  37   83:aload_1         
	//*  38   84:invokeinterface #67  <Method String XmlPullParser.getName()>
	//*  39   89:ldc1            #226 <String "item">
	//*  40   91:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  41   94:ifne            100
	//*  42   97:goto            32
			{
				TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.compat.R.styleable.GradientColorItem);
	//   43  100:aload_0         
	//   44  101:aload_3         
	//   45  102:aload_2         
	//   46  103:getstatic       #229 <Field int[] android.support.compat.R$styleable.GradientColorItem>
	//   47  106:invokestatic    #87  <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   48  109:astore          12
				boolean flag = typedarray.hasValue(android.support.compat.R.styleable.GradientColorItem_android_color);
	//   49  111:aload           12
	//   50  113:getstatic       #232 <Field int android.support.compat.R$styleable.GradientColorItem_android_color>
	//   51  116:invokevirtual   #236 <Method boolean TypedArray.hasValue(int)>
	//   52  119:istore          8
				boolean flag1 = typedarray.hasValue(android.support.compat.R.styleable.GradientColorItem_android_offset);
	//   53  121:aload           12
	//   54  123:getstatic       #239 <Field int android.support.compat.R$styleable.GradientColorItem_android_offset>
	//   55  126:invokevirtual   #236 <Method boolean TypedArray.hasValue(int)>
	//   56  129:istore          9
				if(flag && flag1)
	//*  57  131:iload           8
	//*  58  133:ifeq            197
	//*  59  136:iload           9
	//*  60  138:ifeq            197
				{
					int k = typedarray.getColor(android.support.compat.R.styleable.GradientColorItem_android_color, 0);
	//   61  141:aload           12
	//   62  143:getstatic       #232 <Field int android.support.compat.R$styleable.GradientColorItem_android_color>
	//   63  146:iconst_0        
	//   64  147:invokevirtual   #243 <Method int TypedArray.getColor(int, int)>
	//   65  150:istore          6
					float f = typedarray.getFloat(android.support.compat.R.styleable.GradientColorItem_android_offset, 0.0F);
	//   66  152:aload           12
	//   67  154:getstatic       #239 <Field int android.support.compat.R$styleable.GradientColorItem_android_offset>
	//   68  157:fconst_0        
	//   69  158:invokevirtual   #247 <Method float TypedArray.getFloat(int, float)>
	//   70  161:fstore          4
					typedarray.recycle();
	//   71  163:aload           12
	//   72  165:invokevirtual   #167 <Method void TypedArray.recycle()>
					((List) (arraylist1)).add(((Object) (Integer.valueOf(k))));
	//   73  168:aload           11
	//   74  170:iload           6
	//   75  172:invokestatic    #253 <Method Integer Integer.valueOf(int)>
	//   76  175:invokeinterface #258 <Method boolean List.add(Object)>
	//   77  180:pop             
					((List) (arraylist)).add(((Object) (Float.valueOf(f))));
	//   78  181:aload           10
	//   79  183:fload           4
	//   80  185:invokestatic    #263 <Method Float Float.valueOf(float)>
	//   81  188:invokeinterface #258 <Method boolean List.add(Object)>
	//   82  193:pop             
				} else
	//*  83  194:goto            32
				{
					resources = ((Resources) (new StringBuilder()));
	//   84  197:new             #203 <Class StringBuilder>
	//   85  200:dup             
	//   86  201:invokespecial   #204 <Method void StringBuilder()>
	//   87  204:astore_0        
					((StringBuilder) (resources)).append(xmlpullparser.getPositionDescription());
	//   88  205:aload_0         
	//   89  206:aload_1         
	//   90  207:invokeinterface #207 <Method String XmlPullParser.getPositionDescription()>
	//   91  212:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//   92  215:pop             
					((StringBuilder) (resources)).append(": <item> tag requires a 'color' attribute and a 'offset' ");
	//   93  216:aload_0         
	//   94  217:ldc2            #265 <String ": <item> tag requires a 'color' attribute and a 'offset' ">
	//   95  220:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//   96  223:pop             
					((StringBuilder) (resources)).append("attribute!");
	//   97  224:aload_0         
	//   98  225:ldc2            #267 <String "attribute!">
	//   99  228:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//  100  231:pop             
					throw new XmlPullParserException(((StringBuilder) (resources)).toString());
	//  101  232:new             #38  <Class XmlPullParserException>
	//  102  235:dup             
	//  103  236:aload_0         
	//  104  237:invokevirtual   #216 <Method String StringBuilder.toString()>
	//  105  240:invokespecial   #62  <Method void XmlPullParserException(String)>
	//  106  243:athrow          
				}
			}
		} while(true);
		if(((List) (arraylist1)).size() > 0)
	//* 107  244:aload           11
	//* 108  246:invokeinterface #270 <Method int List.size()>
	//* 109  251:ifle            266
			return new ColorStops(((List) (arraylist1)), ((List) (arraylist)));
	//  110  254:new             #6   <Class GradientColorInflaterCompat$ColorStops>
	//  111  257:dup             
	//  112  258:aload           11
	//  113  260:aload           10
	//  114  262:invokespecial   #273 <Method void GradientColorInflaterCompat$ColorStops(List, List)>
	//  115  265:areturn         
		else
			return null;
	//  116  266:aconst_null     
	//  117  267:areturn         
	}

	private static android.graphics.Shader.TileMode parseTileMode(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 32
	//	               2 28
		default:
			return android.graphics.Shader.TileMode.CLAMP;
	//    2   24:getstatic       #279 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//    3   27:areturn         

		case 2: // '\002'
			return android.graphics.Shader.TileMode.MIRROR;
	//    4   28:getstatic       #282 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.MIRROR>
	//    5   31:areturn         

		case 1: // '\001'
			return android.graphics.Shader.TileMode.REPEAT;
	//    6   32:getstatic       #285 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//    7   35:areturn         
		}
	}

	private static final int TILE_MODE_CLAMP = 0;
	private static final int TILE_MODE_MIRROR = 2;
	private static final int TILE_MODE_REPEAT = 1;
}
