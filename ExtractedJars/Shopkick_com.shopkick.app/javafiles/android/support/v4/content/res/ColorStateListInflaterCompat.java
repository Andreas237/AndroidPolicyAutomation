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

	private ColorStateListInflaterCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static ColorStateList createFromXml(Resources resources, XmlPullParser xmlpullparser, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		AttributeSet attributeset = Xml.asAttributeSet(xmlpullparser);
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    2    4:astore          4
		int i;
		do
			i = xmlpullparser.next();
	//    3    6:aload_1         
	//    4    7:invokeinterface #36  <Method int XmlPullParser.next()>
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
	//   20   36:invokestatic    #40  <Method ColorStateList createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   21   39:areturn         
		else
			throw new XmlPullParserException("No start tag found");
	//   22   40:new             #20  <Class XmlPullParserException>
	//   23   43:dup             
	//   24   44:ldc1            #42  <String "No start tag found">
	//   25   46:invokespecial   #45  <Method void XmlPullParserException(String)>
	//   26   49:athrow          
	}

	public static ColorStateList createFromXmlInner(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		String s = xmlpullparser.getName();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method String XmlPullParser.getName()>
	//    2    6:astore          4
		if(s.equals("selector"))
	//*   3    8:aload           4
	//*   4   10:ldc1            #54  <String "selector">
	//*   5   12:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*   6   15:ifeq            26
		{
			return inflate(resources, xmlpullparser, attributeset, theme);
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:aload_2         
	//   10   21:aload_3         
	//   11   22:invokestatic    #63  <Method ColorStateList inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   12   25:areturn         
		} else
		{
			resources = ((Resources) (new StringBuilder()));
	//   13   26:new             #65  <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #66  <Method void StringBuilder()>
	//   16   33:astore_0        
			((StringBuilder) (resources)).append(xmlpullparser.getPositionDescription());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokeinterface #69  <Method String XmlPullParser.getPositionDescription()>
	//   20   41:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (resources)).append(": invalid color state list tag ");
	//   22   45:aload_0         
	//   23   46:ldc1            #75  <String ": invalid color state list tag ">
	//   24   48:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (resources)).append(s);
	//   26   52:aload_0         
	//   27   53:aload           4
	//   28   55:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			throw new XmlPullParserException(((StringBuilder) (resources)).toString());
	//   30   59:new             #20  <Class XmlPullParserException>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   67:invokespecial   #45  <Method void XmlPullParserException(String)>
	//   35   70:athrow          
		}
	}

	private static ColorStateList inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		int l1 = xmlpullparser.getDepth() + 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #81  <Method int XmlPullParser.getDepth()>
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
	//   15   28:invokeinterface #36  <Method int XmlPullParser.next()>
	//   16   33:istore          6
			if(j == 1)
				break;
	//   17   35:iload           6
	//   18   37:iconst_1        
	//   19   38:icmpeq          357
			int l = xmlpullparser.getDepth();
	//   20   41:aload_1         
	//   21   42:invokeinterface #81  <Method int XmlPullParser.getDepth()>
	//   22   47:istore          7
			if(l < l1 && j == 3)
				break;
	//   23   49:iload           7
	//   24   51:iload           10
	//   25   53:icmpge          62
	//   26   56:iload           6
	//   27   58:iconst_3        
	//   28   59:icmpeq          357
			if(j == 2 && l <= l1 && xmlpullparser.getName().equals("item"))
	//*  29   62:iload           6
	//*  30   64:iconst_2        
	//*  31   65:icmpne          354
	//*  32   68:iload           7
	//*  33   70:iload           10
	//*  34   72:icmpgt          354
	//*  35   75:aload_1         
	//*  36   76:invokeinterface #52  <Method String XmlPullParser.getName()>
	//*  37   81:ldc1            #85  <String "item">
	//*  38   83:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*  39   86:ifne            92
	//*  40   89:goto            354
			{
				TypedArray typedarray = obtainAttributes(resources, theme, attributeset, android.support.compat.R.styleable.ColorStateListItem);
	//   41   92:aload_0         
	//   42   93:aload_3         
	//   43   94:aload_2         
	//   44   95:getstatic       #90  <Field int[] android.support.compat.R$styleable.ColorStateListItem>
	//   45   98:invokestatic    #94  <Method TypedArray obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   46  101:astore          15
				int i2 = typedarray.getColor(android.support.compat.R.styleable.ColorStateListItem_android_color, -65281);
	//   47  103:aload           15
	//   48  105:getstatic       #97  <Field int android.support.compat.R$styleable.ColorStateListItem_android_color>
	//   49  108:ldc1            #98  <Int -65281>
	//   50  110:invokevirtual   #104 <Method int TypedArray.getColor(int, int)>
	//   51  113:istore          11
				float f = 1.0F;
	//   52  115:fconst_1        
	//   53  116:fstore          4
				if(typedarray.hasValue(android.support.compat.R.styleable.ColorStateListItem_android_alpha))
	//*  54  118:aload           15
	//*  55  120:getstatic       #107 <Field int android.support.compat.R$styleable.ColorStateListItem_android_alpha>
	//*  56  123:invokevirtual   #111 <Method boolean TypedArray.hasValue(int)>
	//*  57  126:ifeq            143
					f = typedarray.getFloat(android.support.compat.R.styleable.ColorStateListItem_android_alpha, 1.0F);
	//   58  129:aload           15
	//   59  131:getstatic       #107 <Field int android.support.compat.R$styleable.ColorStateListItem_android_alpha>
	//   60  134:fconst_1        
	//   61  135:invokevirtual   #115 <Method float TypedArray.getFloat(int, float)>
	//   62  138:fstore          4
				else
	//*  63  140:goto            165
				if(typedarray.hasValue(android.support.compat.R.styleable.ColorStateListItem_alpha))
	//*  64  143:aload           15
	//*  65  145:getstatic       #118 <Field int android.support.compat.R$styleable.ColorStateListItem_alpha>
	//*  66  148:invokevirtual   #111 <Method boolean TypedArray.hasValue(int)>
	//*  67  151:ifeq            165
					f = typedarray.getFloat(android.support.compat.R.styleable.ColorStateListItem_alpha, 1.0F);
	//   68  154:aload           15
	//   69  156:getstatic       #118 <Field int android.support.compat.R$styleable.ColorStateListItem_alpha>
	//   70  159:fconst_1        
	//   71  160:invokevirtual   #115 <Method float TypedArray.getFloat(int, float)>
	//   72  163:fstore          4
				typedarray.recycle();
	//   73  165:aload           15
	//   74  167:invokevirtual   #121 <Method void TypedArray.recycle()>
				int j2 = attributeset.getAttributeCount();
	//   75  170:aload_2         
	//   76  171:invokeinterface #126 <Method int AttributeSet.getAttributeCount()>
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
				for(i1 = k; k < j2; i1 = j1)
	//*  83  187:iload           6
	//*  84  189:istore          7
	//*  85  191:iload           6
	//*  86  193:iload           12
	//*  87  195:icmpge          292
				{
					int k1 = attributeset.getAttributeNameResource(k);
	//   88  198:aload_2         
	//   89  199:iload           6
	//   90  201:invokeinterface #130 <Method int AttributeSet.getAttributeNameResource(int)>
	//   91  206:istore          9
					j1 = i1;
	//   92  208:iload           7
	//   93  210:istore          8
					if(k1 != 0x10101a5)
	//*  94  212:iload           9
	//*  95  214:ldc1            #131 <Int 0x10101a5>
	//*  96  216:icmpeq          279
					{
						j1 = i1;
	//   97  219:iload           7
	//   98  221:istore          8
						if(k1 != 0x101031f)
	//*  99  223:iload           9
	//* 100  225:ldc1            #132 <Int 0x101031f>
	//* 101  227:icmpeq          279
						{
							j1 = i1;
	//  102  230:iload           7
	//  103  232:istore          8
							if(k1 != android.support.compat.R.attr.alpha)
	//* 104  234:iload           9
	//* 105  236:getstatic       #137 <Field int android.support.compat.R$attr.alpha>
	//* 106  239:icmpeq          279
							{
								if(attributeset.getAttributeBooleanValue(k, false))
	//* 107  242:aload_2         
	//* 108  243:iload           6
	//* 109  245:iconst_0        
	//* 110  246:invokeinterface #141 <Method boolean AttributeSet.getAttributeBooleanValue(int, boolean)>
	//* 111  251:ifeq            261
									j1 = k1;
	//  112  254:iload           9
	//  113  256:istore          8
								else
	//* 114  258:goto            266
									j1 = -k1;
	//  115  261:iload           9
	//  116  263:ineg            
	//  117  264:istore          8
								ai2[i1] = j1;
	//  118  266:aload           15
	//  119  268:iload           7
	//  120  270:iload           8
	//  121  272:iastore         
								j1 = i1 + 1;
	//  122  273:iload           7
	//  123  275:iconst_1        
	//  124  276:iadd            
	//  125  277:istore          8
							}
						}
					}
					k++;
	//  126  279:iload           6
	//  127  281:iconst_1        
	//  128  282:iadd            
	//  129  283:istore          6
				}

	//  130  285:iload           8
	//  131  287:istore          7
	//* 132  289:goto            191
				ai2 = StateSet.trimStateSet(ai2, i1);
	//  133  292:aload           15
	//  134  294:iload           7
	//  135  296:invokestatic    #147 <Method int[] StateSet.trimStateSet(int[], int)>
	//  136  299:astore          15
				k = modulateColorAlpha(i2, f);
	//  137  301:iload           11
	//  138  303:fload           4
	//  139  305:invokestatic    #151 <Method int modulateColorAlpha(int, float)>
	//  140  308:istore          6
				if(i != 0)
	//* 141  310:iload           5
	//* 142  312:ifeq            320
					i1 = ai2.length;
	//  143  315:aload           15
	//  144  317:arraylength     
	//  145  318:istore          7
				ai1 = GrowingArrayUtils.append(ai1, i, k);
	//  146  320:aload           14
	//  147  322:iload           5
	//  148  324:iload           6
	//  149  326:invokestatic    #156 <Method int[] GrowingArrayUtils.append(int[], int, int)>
	//  150  329:astore          14
				ai = (int[][])GrowingArrayUtils.append(((Object []) (ai)), i, ((Object) (ai2)));
	//  151  331:aload           13
	//  152  333:iload           5
	//  153  335:aload           15
	//  154  337:invokestatic    #159 <Method Object[] GrowingArrayUtils.append(Object[], int, Object)>
	//  155  340:checkcast       #161 <Class int[][]>
	//  156  343:astore          13
				i++;
	//  157  345:iload           5
	//  158  347:iconst_1        
	//  159  348:iadd            
	//  160  349:istore          5
			}
		} while(true);
	//  161  351:goto            27
	//* 162  354:goto            27
		resources = ((Resources) (new int[i]));
	//  163  357:iload           5
	//  164  359:newarray        int[]
	//  165  361:astore_0        
		xmlpullparser = ((XmlPullParser) (new int[i][]));
	//  166  362:iload           5
	//  167  364:anewarray       int[][]
	//  168  367:astore_1        
		System.arraycopy(((Object) (ai1)), 0, ((Object) (resources)), 0, i);
	//  169  368:aload           14
	//  170  370:iconst_0        
	//  171  371:aload_0         
	//  172  372:iconst_0        
	//  173  373:iload           5
	//  174  375:invokestatic    #167 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (ai)), 0, ((Object) (xmlpullparser)), 0, i);
	//  175  378:aload           13
	//  176  380:iconst_0        
	//  177  381:aload_1         
	//  178  382:iconst_0        
	//  179  383:iload           5
	//  180  385:invokestatic    #167 <Method void System.arraycopy(Object, int, Object, int, int)>
		return new ColorStateList(((int [][]) (xmlpullparser)), ((int []) (resources)));
	//  181  388:new             #169 <Class ColorStateList>
	//  182  391:dup             
	//  183  392:aload_1         
	//  184  393:aload_0         
	//  185  394:invokespecial   #172 <Method void ColorStateList(int[][], int[])>
	//  186  397:areturn         
	}

	private static int modulateColorAlpha(int i, float f)
	{
		return i & 0xffffff | Math.round((float)Color.alpha(i) * f) << 24;
	//    0    0:iload_0         
	//    1    1:ldc1            #181 <Int 0xffffff>
	//    2    3:iand            
	//    3    4:iload_0         
	//    4    5:invokestatic    #185 <Method int Color.alpha(int)>
	//    5    8:i2f             
	//    6    9:fload_1         
	//    7   10:fmul            
	//    8   11:invokestatic    #191 <Method int Math.round(float)>
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
	//    5    7:invokevirtual   #196 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    6   10:areturn         
		else
			return theme.obtainStyledAttributes(attributeset, ai, 0, 0);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:iconst_0        
	//   11   15:iconst_0        
	//   12   16:invokevirtual   #202 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   13   19:areturn         
	}

	private static final int DEFAULT_COLOR = 0xffff0000;
}
