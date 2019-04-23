// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.support.v4.view.animation.*;
import android.util.Xml;
import android.view.animation.*;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.graphics.drawable:
//			PathInterpolatorCompat

public class AnimationUtilsCompat
{

	private AnimationUtilsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private static Interpolator createInterpolatorFromXml(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth();
	//    0    0:aload_3         
	//    1    1:invokeinterface #25  <Method int XmlPullParser.getDepth()>
	//    2    6:istore          4
		resources = null;
	//    3    8:aconst_null     
	//    4    9:astore_1        
		do
		{
			int j = xmlpullparser.next();
	//    5   10:aload_3         
	//    6   11:invokeinterface #28  <Method int XmlPullParser.next()>
	//    7   16:istore          5
			if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
				break;
	//    8   18:iload           5
	//    9   20:iconst_3        
	//   10   21:icmpne          35
	//   11   24:aload_3         
	//   12   25:invokeinterface #25  <Method int XmlPullParser.getDepth()>
	//   13   30:iload           4
	//   14   32:icmple          315
	//   15   35:iload           5
	//   16   37:iconst_1        
	//   17   38:icmpeq          315
			if(j == 2)
	//*  18   41:iload           5
	//*  19   43:iconst_2        
	//*  20   44:icmpeq          50
	//*  21   47:goto            10
			{
				resources = ((Resources) (Xml.asAttributeSet(xmlpullparser)));
	//   22   50:aload_3         
	//   23   51:invokestatic    #34  <Method android.util.AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   24   54:astore_1        
				theme = ((android.content.res.Resources.Theme) (xmlpullparser.getName()));
	//   25   55:aload_3         
	//   26   56:invokeinterface #38  <Method String XmlPullParser.getName()>
	//   27   61:astore_2        
				if(((String) (theme)).equals("linearInterpolator"))
	//*  28   62:aload_2         
	//*  29   63:ldc1            #40  <String "linearInterpolator">
	//*  30   65:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  31   68:ifeq            82
					resources = ((Resources) (new LinearInterpolator()));
	//   32   71:new             #48  <Class LinearInterpolator>
	//   33   74:dup             
	//   34   75:invokespecial   #49  <Method void LinearInterpolator()>
	//   35   78:astore_1        
				else
	//*  36   79:goto            10
				if(((String) (theme)).equals("accelerateInterpolator"))
	//*  37   82:aload_2         
	//*  38   83:ldc1            #51  <String "accelerateInterpolator">
	//*  39   85:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  40   88:ifeq            104
					resources = ((Resources) (new AccelerateInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   41   91:new             #53  <Class AccelerateInterpolator>
	//   42   94:dup             
	//   43   95:aload_0         
	//   44   96:aload_1         
	//   45   97:invokespecial   #56  <Method void AccelerateInterpolator(Context, android.util.AttributeSet)>
	//   46  100:astore_1        
				else
	//*  47  101:goto            10
				if(((String) (theme)).equals("decelerateInterpolator"))
	//*  48  104:aload_2         
	//*  49  105:ldc1            #58  <String "decelerateInterpolator">
	//*  50  107:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  51  110:ifeq            126
					resources = ((Resources) (new DecelerateInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   52  113:new             #60  <Class DecelerateInterpolator>
	//   53  116:dup             
	//   54  117:aload_0         
	//   55  118:aload_1         
	//   56  119:invokespecial   #61  <Method void DecelerateInterpolator(Context, android.util.AttributeSet)>
	//   57  122:astore_1        
				else
	//*  58  123:goto            10
				if(((String) (theme)).equals("accelerateDecelerateInterpolator"))
	//*  59  126:aload_2         
	//*  60  127:ldc1            #63  <String "accelerateDecelerateInterpolator">
	//*  61  129:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  62  132:ifeq            146
					resources = ((Resources) (new AccelerateDecelerateInterpolator()));
	//   63  135:new             #65  <Class AccelerateDecelerateInterpolator>
	//   64  138:dup             
	//   65  139:invokespecial   #66  <Method void AccelerateDecelerateInterpolator()>
	//   66  142:astore_1        
				else
	//*  67  143:goto            10
				if(((String) (theme)).equals("cycleInterpolator"))
	//*  68  146:aload_2         
	//*  69  147:ldc1            #68  <String "cycleInterpolator">
	//*  70  149:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  71  152:ifeq            168
					resources = ((Resources) (new CycleInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   72  155:new             #70  <Class CycleInterpolator>
	//   73  158:dup             
	//   74  159:aload_0         
	//   75  160:aload_1         
	//   76  161:invokespecial   #71  <Method void CycleInterpolator(Context, android.util.AttributeSet)>
	//   77  164:astore_1        
				else
	//*  78  165:goto            10
				if(((String) (theme)).equals("anticipateInterpolator"))
	//*  79  168:aload_2         
	//*  80  169:ldc1            #73  <String "anticipateInterpolator">
	//*  81  171:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  82  174:ifeq            190
					resources = ((Resources) (new AnticipateInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   83  177:new             #75  <Class AnticipateInterpolator>
	//   84  180:dup             
	//   85  181:aload_0         
	//   86  182:aload_1         
	//   87  183:invokespecial   #76  <Method void AnticipateInterpolator(Context, android.util.AttributeSet)>
	//   88  186:astore_1        
				else
	//*  89  187:goto            10
				if(((String) (theme)).equals("overshootInterpolator"))
	//*  90  190:aload_2         
	//*  91  191:ldc1            #78  <String "overshootInterpolator">
	//*  92  193:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  93  196:ifeq            212
					resources = ((Resources) (new OvershootInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   94  199:new             #80  <Class OvershootInterpolator>
	//   95  202:dup             
	//   96  203:aload_0         
	//   97  204:aload_1         
	//   98  205:invokespecial   #81  <Method void OvershootInterpolator(Context, android.util.AttributeSet)>
	//   99  208:astore_1        
				else
	//* 100  209:goto            10
				if(((String) (theme)).equals("anticipateOvershootInterpolator"))
	//* 101  212:aload_2         
	//* 102  213:ldc1            #83  <String "anticipateOvershootInterpolator">
	//* 103  215:invokevirtual   #46  <Method boolean String.equals(Object)>
	//* 104  218:ifeq            234
					resources = ((Resources) (new AnticipateOvershootInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//  105  221:new             #85  <Class AnticipateOvershootInterpolator>
	//  106  224:dup             
	//  107  225:aload_0         
	//  108  226:aload_1         
	//  109  227:invokespecial   #86  <Method void AnticipateOvershootInterpolator(Context, android.util.AttributeSet)>
	//  110  230:astore_1        
				else
	//* 111  231:goto            10
				if(((String) (theme)).equals("bounceInterpolator"))
	//* 112  234:aload_2         
	//* 113  235:ldc1            #88  <String "bounceInterpolator">
	//* 114  237:invokevirtual   #46  <Method boolean String.equals(Object)>
	//* 115  240:ifeq            254
					resources = ((Resources) (new BounceInterpolator()));
	//  116  243:new             #90  <Class BounceInterpolator>
	//  117  246:dup             
	//  118  247:invokespecial   #91  <Method void BounceInterpolator()>
	//  119  250:astore_1        
				else
	//* 120  251:goto            10
				if(((String) (theme)).equals("pathInterpolator"))
	//* 121  254:aload_2         
	//* 122  255:ldc1            #93  <String "pathInterpolator">
	//* 123  257:invokevirtual   #46  <Method boolean String.equals(Object)>
	//* 124  260:ifeq            277
				{
					resources = ((Resources) (new PathInterpolatorCompat(context, ((android.util.AttributeSet) (resources)), xmlpullparser)));
	//  125  263:new             #95  <Class PathInterpolatorCompat>
	//  126  266:dup             
	//  127  267:aload_0         
	//  128  268:aload_1         
	//  129  269:aload_3         
	//  130  270:invokespecial   #98  <Method void PathInterpolatorCompat(Context, android.util.AttributeSet, XmlPullParser)>
	//  131  273:astore_1        
				} else
	//* 132  274:goto            10
				{
					context = ((Context) (new StringBuilder()));
	//  133  277:new             #100 <Class StringBuilder>
	//  134  280:dup             
	//  135  281:invokespecial   #101 <Method void StringBuilder()>
	//  136  284:astore_0        
					((StringBuilder) (context)).append("Unknown interpolator name: ");
	//  137  285:aload_0         
	//  138  286:ldc1            #103 <String "Unknown interpolator name: ">
	//  139  288:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  140  291:pop             
					((StringBuilder) (context)).append(xmlpullparser.getName());
	//  141  292:aload_0         
	//  142  293:aload_3         
	//  143  294:invokeinterface #38  <Method String XmlPullParser.getName()>
	//  144  299:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  145  302:pop             
					throw new RuntimeException(((StringBuilder) (context)).toString());
	//  146  303:new             #109 <Class RuntimeException>
	//  147  306:dup             
	//  148  307:aload_0         
	//  149  308:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  150  311:invokespecial   #115 <Method void RuntimeException(String)>
	//  151  314:athrow          
				}
			}
		} while(true);
		return ((Interpolator) (resources));
	//  152  315:aload_1         
	//  153  316:areturn         
	}

	public static Interpolator loadInterpolator(Context context, int i)
		throws android.content.res.Resources.NotFoundException
	{
		Object obj;
		Object obj1;
		Object obj2;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #126 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return AnimationUtils.loadInterpolator(context, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #130 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//    6   13:areturn         
		obj1 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
		obj2 = null;
	//    9   16:aconst_null     
	//   10   17:astore          4
		obj = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		if(i != 0x10c000f)
			break MISSING_BLOCK_LABEL_35;
	//   13   21:iload_1         
	//   14   22:ldc1            #131 <Int 0x10c000f>
	//   15   24:icmpne          35
		return ((Interpolator) (new FastOutLinearInInterpolator()));
	//   16   27:new             #133 <Class FastOutLinearInInterpolator>
	//   17   30:dup             
	//   18   31:invokespecial   #134 <Method void FastOutLinearInInterpolator()>
	//   19   34:areturn         
		if(i != 0x10c000d)
			break MISSING_BLOCK_LABEL_49;
	//   20   35:iload_1         
	//   21   36:ldc1            #135 <Int 0x10c000d>
	//   22   38:icmpne          49
		return ((Interpolator) (new FastOutSlowInInterpolator()));
	//   23   41:new             #137 <Class FastOutSlowInInterpolator>
	//   24   44:dup             
	//   25   45:invokespecial   #138 <Method void FastOutSlowInInterpolator()>
	//   26   48:areturn         
		if(i != 0x10c000e)
			break MISSING_BLOCK_LABEL_63;
	//   27   49:iload_1         
	//   28   50:ldc1            #139 <Int 0x10c000e>
	//   29   52:icmpne          63
		return ((Interpolator) (new LinearOutSlowInInterpolator()));
	//   30   55:new             #141 <Class LinearOutSlowInInterpolator>
	//   31   58:dup             
	//   32   59:invokespecial   #142 <Method void LinearOutSlowInInterpolator()>
	//   33   62:areturn         
		XmlResourceParser xmlresourceparser = context.getResources().getAnimation(i);
	//   34   63:aload_0         
	//   35   64:invokevirtual   #148 <Method Resources Context.getResources()>
	//   36   67:iload_1         
	//   37   68:invokevirtual   #154 <Method XmlResourceParser Resources.getAnimation(int)>
	//   38   71:astore          5
		obj = ((Object) (xmlresourceparser));
	//   39   73:aload           5
	//   40   75:astore_2        
		obj1 = ((Object) (xmlresourceparser));
	//   41   76:aload           5
	//   42   78:astore_3        
		obj2 = ((Object) (xmlresourceparser));
	//   43   79:aload           5
	//   44   81:astore          4
		context = ((Context) (createInterpolatorFromXml(context, context.getResources(), context.getTheme(), ((XmlPullParser) (xmlresourceparser)))));
	//   45   83:aload_0         
	//   46   84:aload_0         
	//   47   85:invokevirtual   #148 <Method Resources Context.getResources()>
	//   48   88:aload_0         
	//   49   89:invokevirtual   #158 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   50   92:aload           5
	//   51   94:invokestatic    #160 <Method Interpolator createInterpolatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser)>
	//   52   97:astore_0        
		if(xmlresourceparser != null)
	//*  53   98:aload           5
	//*  54  100:ifnull          110
			xmlresourceparser.close();
	//   55  103:aload           5
	//   56  105:invokeinterface #165 <Method void XmlResourceParser.close()>
		return ((Interpolator) (context));
	//   57  110:aload_0         
	//   58  111:areturn         
_L3:
		obj = obj1;
	//   59  112:aload_3         
	//   60  113:astore_2        
		obj2 = ((Object) (new StringBuilder()));
	//   61  114:new             #100 <Class StringBuilder>
	//   62  117:dup             
	//   63  118:invokespecial   #101 <Method void StringBuilder()>
	//   64  121:astore          4
		obj = obj1;
	//   65  123:aload_3         
	//   66  124:astore_2        
		((StringBuilder) (obj2)).append("Can't load animation resource ID #0x");
	//   67  125:aload           4
	//   68  127:ldc1            #167 <String "Can't load animation resource ID #0x">
	//   69  129:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   70  132:pop             
		obj = obj1;
	//   71  133:aload_3         
	//   72  134:astore_2        
		((StringBuilder) (obj2)).append(Integer.toHexString(i));
	//   73  135:aload           4
	//   74  137:iload_1         
	//   75  138:invokestatic    #173 <Method String Integer.toHexString(int)>
	//   76  141:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   77  144:pop             
		obj = obj1;
	//   78  145:aload_3         
	//   79  146:astore_2        
		obj2 = ((Object) (new android.content.res.Resources.NotFoundException(((StringBuilder) (obj2)).toString())));
	//   80  147:new             #120 <Class android.content.res.Resources$NotFoundException>
	//   81  150:dup             
	//   82  151:aload           4
	//   83  153:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   84  156:invokespecial   #174 <Method void android.content.res.Resources$NotFoundException(String)>
	//   85  159:astore          4
		obj = obj1;
	//   86  161:aload_3         
	//   87  162:astore_2        
		((android.content.res.Resources.NotFoundException) (obj2)).initCause(((Throwable) (context)));
	//   88  163:aload           4
	//   89  165:aload_0         
	//   90  166:invokevirtual   #178 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//   91  169:pop             
		obj = obj1;
	//   92  170:aload_3         
	//   93  171:astore_2        
		throw obj2;
	//   94  172:aload           4
	//   95  174:athrow          
_L4:
		obj = obj2;
	//   96  175:aload           4
	//   97  177:astore_2        
		obj1 = ((Object) (new StringBuilder()));
	//   98  178:new             #100 <Class StringBuilder>
	//   99  181:dup             
	//  100  182:invokespecial   #101 <Method void StringBuilder()>
	//  101  185:astore_3        
		obj = obj2;
	//  102  186:aload           4
	//  103  188:astore_2        
		((StringBuilder) (obj1)).append("Can't load animation resource ID #0x");
	//  104  189:aload_3         
	//  105  190:ldc1            #167 <String "Can't load animation resource ID #0x">
	//  106  192:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  107  195:pop             
		obj = obj2;
	//  108  196:aload           4
	//  109  198:astore_2        
		((StringBuilder) (obj1)).append(Integer.toHexString(i));
	//  110  199:aload_3         
	//  111  200:iload_1         
	//  112  201:invokestatic    #173 <Method String Integer.toHexString(int)>
	//  113  204:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  114  207:pop             
		obj = obj2;
	//  115  208:aload           4
	//  116  210:astore_2        
		obj1 = ((Object) (new android.content.res.Resources.NotFoundException(((StringBuilder) (obj1)).toString())));
	//  117  211:new             #120 <Class android.content.res.Resources$NotFoundException>
	//  118  214:dup             
	//  119  215:aload_3         
	//  120  216:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  121  219:invokespecial   #174 <Method void android.content.res.Resources$NotFoundException(String)>
	//  122  222:astore_3        
		obj = obj2;
	//  123  223:aload           4
	//  124  225:astore_2        
		((android.content.res.Resources.NotFoundException) (obj1)).initCause(((Throwable) (context)));
	//  125  226:aload_3         
	//  126  227:aload_0         
	//  127  228:invokevirtual   #178 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  128  231:pop             
		obj = obj2;
	//  129  232:aload           4
	//  130  234:astore_2        
		throw obj1;
	//  131  235:aload_3         
	//  132  236:athrow          
_L2:
		if(obj != null)
	//* 133  237:aload_2         
	//* 134  238:ifnull          247
			((XmlResourceParser) (obj)).close();
	//  135  241:aload_2         
	//  136  242:invokeinterface #165 <Method void XmlResourceParser.close()>
		throw context;
	//  137  247:aload_0         
	//  138  248:athrow          
		context;
	//  139  249:astore_0        
		if(true) goto _L2; else goto _L1
	//  140  250:goto            237
_L1:
		context;
	//  141  253:astore_0        
		  goto _L3
	//* 142  254:goto            112
		context;
	//  143  257:astore_0        
		  goto _L4
	//* 144  258:goto            175
	}
}
