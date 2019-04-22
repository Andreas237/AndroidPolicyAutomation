// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.res.*;
import android.graphics.Color;
import android.util.*;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content.res:
//			GrowingArrayUtils

public final class ColorStateListInflaterCompat
{

	public static ColorStateList createFromXml(Resources resources, XmlPullParser xmlpullparser, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		AttributeSet attributeset = Xml.asAttributeSet(xmlpullparser);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    2    4:astore          4
		int i;
		do
			i = xmlpullparser.next();
	//    3    6:aload_1         
	//    4    7:invokeinterface #28  <Method int XmlPullParser.next()>
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
	//   20   36:invokestatic    #32  <Method ColorStateList createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   21   39:areturn         
		else
			throw new XmlPullParserException("No start tag found");
	//   22   40:new             #12  <Class XmlPullParserException>
	//   23   43:dup             
	//   24   44:ldc1            #34  <String "No start tag found">
	//   25   46:invokespecial   #38  <Method void XmlPullParserException(String)>
	//   26   49:athrow          
	}

	public static ColorStateList createFromXmlInner(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		String s = xmlpullparser.getName();
	//    0    0:aload_1         
	//    1    1:invokeinterface #46  <Method String XmlPullParser.getName()>
	//    2    6:astore          4
		if(s.equals("selector"))
	//*   3    8:aload           4
	//*   4   10:ldc1            #48  <String "selector">
	//*   5   12:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*   6   15:ifeq            26
		{
			return inflate(resources, xmlpullparser, attributeset, theme);
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:aload_2         
	//   10   21:aload_3         
	//   11   22:invokestatic    #57  <Method ColorStateList inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   12   25:areturn         
		} else
		{
			resources = ((Resources) (new StringBuilder()));
	//   13   26:new             #59  <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #62  <Method void StringBuilder()>
	//   16   33:astore_0        
			((StringBuilder) (resources)).append(xmlpullparser.getPositionDescription());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokeinterface #65  <Method String XmlPullParser.getPositionDescription()>
	//   20   41:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (resources)).append(": invalid color state list tag ");
	//   22   45:aload_0         
	//   23   46:ldc1            #71  <String ": invalid color state list tag ">
	//   24   48:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (resources)).append(s);
	//   26   52:aload_0         
	//   27   53:aload           4
	//   28   55:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			throw new XmlPullParserException(((StringBuilder) (resources)).toString());
	//   30   59:new             #12  <Class XmlPullParserException>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   34   67:invokespecial   #38  <Method void XmlPullParserException(String)>
	//   35   70:athrow          
		}
	}

	private static ColorStateList inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		int l1 = xmlpullparser.getDepth() + 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #77  <Method int XmlPullParser.getDepth()>
	//    2    6:iconst_1        
	//    3    7:iadd            
	//    4    8:istore          10
		int ai[][] = new int[20][];
	//    5   10:bipush          20
	//    6   12:anewarray       int[][]
	//    7   15:astore          13
		int ai1[] = new int[ai.length];
	//    8   17:aload           13
	//    9   19:arraylength     
	//   10   20:newarray        int[]
	//   11   22:astore          14
		int i = 0;
	//   12   24:iconst_0        
	//   13   25:istore          5
		do
		{
			int j = xmlpullparser.next();
	//   14   27:aload_1         
	//   15   28:invokeinterface #28  <Method int XmlPullParser.next()>
	//   16   33:istore          6
			if(j == 1)
				break;
	//   17   35:iload           6
	//   18   37:iconst_1        
	//   19   38:icmpeq          356
			int l = xmlpullparser.getDepth();
	//   20   41:aload_1         
	//   21   42:invokeinterface #77  <Method int XmlPullParser.getDepth()>
	//   22   47:istore          7
			if(l < l1 && j == 3)
				break;
	//   23   49:iload           7
	//   24   51:iload           10
	//   25   53:icmpge          62
	//   26   56:iload           6
	//   27   58:iconst_3        
	//   28   59:icmpeq          356
			if(j == 2 && l <= l1 && xmlpullparser.getName().equals("item"))
	//*  29   62:iload           6
	//*  30   64:iconst_2        
	//*  31   65:icmpne          353
	//*  32   68:iload           7
	//*  33   70:iload           10
	//*  34   72:icmpgt          353
	//*  35   75:aload_1         
	//*  36   76:invokeinterface #46  <Method String XmlPullParser.getName()>
	//*  37   81:ldc1            #81  <String "item">
	//*  38   83:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*  39   86:ifne            92
	//*  40   89:goto            353
			{
				TypedArray typedarray = obtainAttributes(resources, theme, attributeset, android.support.compat.R.styleable.ColorStateListItem);
	//   41   92:aload_0         
	//   42   93:aload_3         
	//   43   94:aload_2         
	//   44   95:getstatic       #86  <Field int[] android.support.compat.R$styleable.ColorStateListItem>
	//   45   98:invokestatic    #90  <Method TypedArray obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   46  101:astore          15
				int i2 = typedarray.getColor(android.support.compat.R.styleable.ColorStateListItem_android_color, -65281);
	//   47  103:aload           15
	//   48  105:getstatic       #94  <Field int android.support.compat.R$styleable.ColorStateListItem_android_color>
	//   49  108:ldc1            #95  <Int -65281>
	//   50  110:invokevirtual   #101 <Method int TypedArray.getColor(int, int)>
	//   51  113:istore          11
				float f = 1.0F;
	//   52  115:fconst_1        
	//   53  116:fstore          4
				if(typedarray.hasValue(android.support.compat.R.styleable.ColorStateListItem_android_alpha))
	//*  54  118:aload           15
	//*  55  120:getstatic       #104 <Field int android.support.compat.R$styleable.ColorStateListItem_android_alpha>
	//*  56  123:invokevirtual   #108 <Method boolean TypedArray.hasValue(int)>
	//*  57  126:ifeq            143
					f = typedarray.getFloat(android.support.compat.R.styleable.ColorStateListItem_android_alpha, 1.0F);
	//   58  129:aload           15
	//   59  131:getstatic       #104 <Field int android.support.compat.R$styleable.ColorStateListItem_android_alpha>
	//   60  134:fconst_1        
	//   61  135:invokevirtual   #112 <Method float TypedArray.getFloat(int, float)>
	//   62  138:fstore          4
				else
	//*  63  140:goto            165
				if(typedarray.hasValue(android.support.compat.R.styleable.ColorStateListItem_alpha))
	//*  64  143:aload           15
	//*  65  145:getstatic       #115 <Field int android.support.compat.R$styleable.ColorStateListItem_alpha>
	//*  66  148:invokevirtual   #108 <Method boolean TypedArray.hasValue(int)>
	//*  67  151:ifeq            165
					f = typedarray.getFloat(android.support.compat.R.styleable.ColorStateListItem_alpha, 1.0F);
	//   68  154:aload           15
	//   69  156:getstatic       #115 <Field int android.support.compat.R$styleable.ColorStateListItem_alpha>
	//   70  159:fconst_1        
	//   71  160:invokevirtual   #112 <Method float TypedArray.getFloat(int, float)>
	//   72  163:fstore          4
				typedarray.recycle();
	//   73  165:aload           15
	//   74  167:invokevirtual   #118 <Method void TypedArray.recycle()>
				int j2 = attributeset.getAttributeCount();
	//   75  170:aload_2         
	//   76  171:invokeinterface #123 <Method int AttributeSet.getAttributeCount()>
	//   77  176:istore          12
				int ai2[] = new int[j2];
	//   78  178:iload           12
	//   79  180:newarray        int[]
	//   80  182:astore          15
				int k = 0;
	//   81  184:iconst_0        
	//   82  185:istore          6
				int i1;
				int j1;
				for(i1 = 0; k < j2; i1 = j1)
	//*  83  187:iconst_0        
	//*  84  188:istore          7
	//*  85  190:iload           6
	//*  86  192:iload           12
	//*  87  194:icmpge          291
				{
					int k1 = attributeset.getAttributeNameResource(k);
	//   88  197:aload_2         
	//   89  198:iload           6
	//   90  200:invokeinterface #127 <Method int AttributeSet.getAttributeNameResource(int)>
	//   91  205:istore          9
					j1 = i1;
	//   92  207:iload           7
	//   93  209:istore          8
					if(k1 != 0x10101a5)
	//*  94  211:iload           9
	//*  95  213:ldc1            #128 <Int 0x10101a5>
	//*  96  215:icmpeq          278
					{
						j1 = i1;
	//   97  218:iload           7
	//   98  220:istore          8
						if(k1 != 0x101031f)
	//*  99  222:iload           9
	//* 100  224:ldc1            #129 <Int 0x101031f>
	//* 101  226:icmpeq          278
						{
							j1 = i1;
	//  102  229:iload           7
	//  103  231:istore          8
							if(k1 != android.support.compat.R.attr.alpha)
	//* 104  233:iload           9
	//* 105  235:getstatic       #134 <Field int android.support.compat.R$attr.alpha>
	//* 106  238:icmpeq          278
							{
								if(attributeset.getAttributeBooleanValue(k, false))
	//* 107  241:aload_2         
	//* 108  242:iload           6
	//* 109  244:iconst_0        
	//* 110  245:invokeinterface #138 <Method boolean AttributeSet.getAttributeBooleanValue(int, boolean)>
	//* 111  250:ifeq            260
									j1 = k1;
	//  112  253:iload           9
	//  113  255:istore          8
								else
	//* 114  257:goto            265
									j1 = -k1;
	//  115  260:iload           9
	//  116  262:ineg            
	//  117  263:istore          8
								ai2[i1] = j1;
	//  118  265:aload           15
	//  119  267:iload           7
	//  120  269:iload           8
	//  121  271:iastore         
								j1 = i1 + 1;
	//  122  272:iload           7
	//  123  274:iconst_1        
	//  124  275:iadd            
	//  125  276:istore          8
							}
						}
					}
					k++;
	//  126  278:iload           6
	//  127  280:iconst_1        
	//  128  281:iadd            
	//  129  282:istore          6
				}

	//  130  284:iload           8
	//  131  286:istore          7
	//* 132  288:goto            190
				ai2 = StateSet.trimStateSet(ai2, i1);
	//  133  291:aload           15
	//  134  293:iload           7
	//  135  295:invokestatic    #144 <Method int[] StateSet.trimStateSet(int[], int)>
	//  136  298:astore          15
				k = modulateColorAlpha(i2, f);
	//  137  300:iload           11
	//  138  302:fload           4
	//  139  304:invokestatic    #148 <Method int modulateColorAlpha(int, float)>
	//  140  307:istore          6
				if(i != 0)
	//* 141  309:iload           5
	//* 142  311:ifeq            319
					i1 = ai2.length;
	//  143  314:aload           15
	//  144  316:arraylength     
	//  145  317:istore          7
				ai1 = GrowingArrayUtils.append(ai1, i, k);
	//  146  319:aload           14
	//  147  321:iload           5
	//  148  323:iload           6
	//  149  325:invokestatic    #153 <Method int[] GrowingArrayUtils.append(int[], int, int)>
	//  150  328:astore          14
				ai = (int[][])GrowingArrayUtils.append(((Object []) (ai)), i, ((Object) (ai2)));
	//  151  330:aload           13
	//  152  332:iload           5
	//  153  334:aload           15
	//  154  336:invokestatic    #156 <Method Object[] GrowingArrayUtils.append(Object[], int, Object)>
	//  155  339:checkcast       #158 <Class int[][]>
	//  156  342:astore          13
				i++;
	//  157  344:iload           5
	//  158  346:iconst_1        
	//  159  347:iadd            
	//  160  348:istore          5
			}
		} while(true);
	//  161  350:goto            27
	//* 162  353:goto            27
		resources = ((Resources) (new int[i]));
	//  163  356:iload           5
	//  164  358:newarray        int[]
	//  165  360:astore_0        
		xmlpullparser = ((XmlPullParser) (new int[i][]));
	//  166  361:iload           5
	//  167  363:anewarray       int[][]
	//  168  366:astore_1        
		System.arraycopy(((Object) (ai1)), 0, ((Object) (resources)), 0, i);
	//  169  367:aload           14
	//  170  369:iconst_0        
	//  171  370:aload_0         
	//  172  371:iconst_0        
	//  173  372:iload           5
	//  174  374:invokestatic    #164 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (ai)), 0, ((Object) (xmlpullparser)), 0, i);
	//  175  377:aload           13
	//  176  379:iconst_0        
	//  177  380:aload_1         
	//  178  381:iconst_0        
	//  179  382:iload           5
	//  180  384:invokestatic    #164 <Method void System.arraycopy(Object, int, Object, int, int)>
		return new ColorStateList(((int [][]) (xmlpullparser)), ((int []) (resources)));
	//  181  387:new             #166 <Class ColorStateList>
	//  182  390:dup             
	//  183  391:aload_1         
	//  184  392:aload_0         
	//  185  393:invokespecial   #169 <Method void ColorStateList(int[][], int[])>
	//  186  396:areturn         
	}

	private static int modulateColorAlpha(int i, float f)
	{
		return i & 0xffffff | Math.round((float)Color.alpha(i) * f) << 24;
	//    0    0:iload_0         
	//    1    1:ldc1            #178 <Int 0xffffff>
	//    2    3:iand            
	//    3    4:iload_0         
	//    4    5:invokestatic    #182 <Method int Color.alpha(int)>
	//    5    8:i2f             
	//    6    9:fload_1         
	//    7   10:fmul            
	//    8   11:invokestatic    #188 <Method int Math.round(float)>
	//    9   14:bipush          24
	//   10   16:ishl            
	//   11   17:ior             
	//   12   18:ireturn         
	}

	private static TypedArray obtainAttributes(Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, int ai[])
	{
		if(theme == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
			return resources.obtainAttributes(attributeset, ai);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #193 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    6   10:areturn         
		else
			return theme.obtainStyledAttributes(attributeset, ai, 0, 0);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:iconst_0        
	//   11   15:iconst_0        
	//   12   16:invokevirtual   #199 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   13   19:areturn         
	}
}
