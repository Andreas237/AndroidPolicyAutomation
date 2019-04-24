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

	public AnimationUtilsCompat()
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
	//*  58  123:goto            101
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
	//*  78  165:goto            101
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
	//*  89  187:goto            101
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
	//* 100  209:goto            101
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
	//* 111  231:goto            101
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
	//* 132  274:goto            101
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
		Object obj3;
		Object obj4;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #126 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return AnimationUtils.loadInterpolator(context, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #130 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//    6   13:areturn         
		obj4 = null;
	//    7   14:aconst_null     
	//    8   15:astore          5
		obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_2        
		obj3 = null;
	//   11   19:aconst_null     
	//   12   20:astore          4
		if(i != 0x10c000f)
			break MISSING_BLOCK_LABEL_36;
	//   13   22:iload_1         
	//   14   23:ldc1            #131 <Int 0x10c000f>
	//   15   25:icmpne          36
		return ((Interpolator) (new FastOutLinearInInterpolator()));
	//   16   28:new             #133 <Class FastOutLinearInInterpolator>
	//   17   31:dup             
	//   18   32:invokespecial   #134 <Method void FastOutLinearInInterpolator()>
	//   19   35:areturn         
		if(i != 0x10c000d)
			break MISSING_BLOCK_LABEL_50;
	//   20   36:iload_1         
	//   21   37:ldc1            #135 <Int 0x10c000d>
	//   22   39:icmpne          50
		return ((Interpolator) (new FastOutSlowInInterpolator()));
	//   23   42:new             #137 <Class FastOutSlowInInterpolator>
	//   24   45:dup             
	//   25   46:invokespecial   #138 <Method void FastOutSlowInInterpolator()>
	//   26   49:areturn         
		if(i != 0x10c000e)
			break MISSING_BLOCK_LABEL_64;
	//   27   50:iload_1         
	//   28   51:ldc1            #139 <Int 0x10c000e>
	//   29   53:icmpne          64
		return ((Interpolator) (new LinearOutSlowInInterpolator()));
	//   30   56:new             #141 <Class LinearOutSlowInInterpolator>
	//   31   59:dup             
	//   32   60:invokespecial   #142 <Method void LinearOutSlowInInterpolator()>
	//   33   63:areturn         
		Object obj1 = ((Object) (context.getResources().getAnimation(i)));
	//   34   64:aload_0         
	//   35   65:invokevirtual   #148 <Method Resources Context.getResources()>
	//   36   68:iload_1         
	//   37   69:invokevirtual   #154 <Method XmlResourceParser Resources.getAnimation(int)>
	//   38   72:astore_3        
		context = ((Context) (createInterpolatorFromXml(context, context.getResources(), context.getTheme(), ((XmlPullParser) (obj1)))));
	//   39   73:aload_0         
	//   40   74:aload_0         
	//   41   75:invokevirtual   #148 <Method Resources Context.getResources()>
	//   42   78:aload_0         
	//   43   79:invokevirtual   #158 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   44   82:aload_3         
	//   45   83:invokestatic    #160 <Method Interpolator createInterpolatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser)>
	//   46   86:astore_0        
		if(obj1 != null)
	//*  47   87:aload_3         
	//*  48   88:ifnull          97
			((XmlResourceParser) (obj1)).close();
	//   49   91:aload_3         
	//   50   92:invokeinterface #165 <Method void XmlResourceParser.close()>
		return ((Interpolator) (context));
	//   51   97:aload_0         
	//   52   98:areturn         
		context;
	//   53   99:astore_0        
		obj = obj1;
	//   54  100:aload_3         
	//   55  101:astore_2        
		  goto _L1
	//*  56  102:goto            247
		obj;
	//   57  105:astore_2        
		context = ((Context) (obj1));
	//   58  106:aload_3         
	//   59  107:astore_0        
		obj1 = obj;
	//   60  108:aload_2         
	//   61  109:astore_3        
		  goto _L2
	//*  62  110:goto            121
		obj;
	//   63  113:astore_2        
		Object obj2;
		context = ((Context) (obj1));
	//   64  114:aload_3         
	//   65  115:astore_0        
		obj2 = obj;
	//   66  116:aload_2         
	//   67  117:astore_3        
		  goto _L3
	//*  68  118:goto            184
_L2:
		obj = ((Object) (context));
	//   69  121:aload_0         
	//   70  122:astore_2        
		obj3 = ((Object) (new StringBuilder()));
	//   71  123:new             #100 <Class StringBuilder>
	//   72  126:dup             
	//   73  127:invokespecial   #101 <Method void StringBuilder()>
	//   74  130:astore          4
		obj = ((Object) (context));
	//   75  132:aload_0         
	//   76  133:astore_2        
		((StringBuilder) (obj3)).append("Can't load animation resource ID #0x");
	//   77  134:aload           4
	//   78  136:ldc1            #167 <String "Can't load animation resource ID #0x">
	//   79  138:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   80  141:pop             
		obj = ((Object) (context));
	//   81  142:aload_0         
	//   82  143:astore_2        
		((StringBuilder) (obj3)).append(Integer.toHexString(i));
	//   83  144:aload           4
	//   84  146:iload_1         
	//   85  147:invokestatic    #173 <Method String Integer.toHexString(int)>
	//   86  150:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   87  153:pop             
		obj = ((Object) (context));
	//   88  154:aload_0         
	//   89  155:astore_2        
		obj3 = ((Object) (new android.content.res.Resources.NotFoundException(((StringBuilder) (obj3)).toString())));
	//   90  156:new             #120 <Class android.content.res.Resources$NotFoundException>
	//   91  159:dup             
	//   92  160:aload           4
	//   93  162:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   94  165:invokespecial   #174 <Method void android.content.res.Resources$NotFoundException(String)>
	//   95  168:astore          4
		obj = ((Object) (context));
	//   96  170:aload_0         
	//   97  171:astore_2        
		((android.content.res.Resources.NotFoundException) (obj3)).initCause(((Throwable) (obj2)));
	//   98  172:aload           4
	//   99  174:aload_3         
	//  100  175:invokevirtual   #178 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  101  178:pop             
		obj = ((Object) (context));
	//  102  179:aload_0         
	//  103  180:astore_2        
		throw obj3;
	//  104  181:aload           4
	//  105  183:athrow          
_L3:
		obj = ((Object) (context));
	//  106  184:aload_0         
	//  107  185:astore_2        
		obj3 = ((Object) (new StringBuilder()));
	//  108  186:new             #100 <Class StringBuilder>
	//  109  189:dup             
	//  110  190:invokespecial   #101 <Method void StringBuilder()>
	//  111  193:astore          4
		obj = ((Object) (context));
	//  112  195:aload_0         
	//  113  196:astore_2        
		((StringBuilder) (obj3)).append("Can't load animation resource ID #0x");
	//  114  197:aload           4
	//  115  199:ldc1            #167 <String "Can't load animation resource ID #0x">
	//  116  201:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  117  204:pop             
		obj = ((Object) (context));
	//  118  205:aload_0         
	//  119  206:astore_2        
		((StringBuilder) (obj3)).append(Integer.toHexString(i));
	//  120  207:aload           4
	//  121  209:iload_1         
	//  122  210:invokestatic    #173 <Method String Integer.toHexString(int)>
	//  123  213:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//  124  216:pop             
		obj = ((Object) (context));
	//  125  217:aload_0         
	//  126  218:astore_2        
		obj3 = ((Object) (new android.content.res.Resources.NotFoundException(((StringBuilder) (obj3)).toString())));
	//  127  219:new             #120 <Class android.content.res.Resources$NotFoundException>
	//  128  222:dup             
	//  129  223:aload           4
	//  130  225:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  131  228:invokespecial   #174 <Method void android.content.res.Resources$NotFoundException(String)>
	//  132  231:astore          4
		obj = ((Object) (context));
	//  133  233:aload_0         
	//  134  234:astore_2        
		((android.content.res.Resources.NotFoundException) (obj3)).initCause(((Throwable) (obj2)));
	//  135  235:aload           4
	//  136  237:aload_3         
	//  137  238:invokevirtual   #178 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  138  241:pop             
		obj = ((Object) (context));
	//  139  242:aload_0         
	//  140  243:astore_2        
		throw obj3;
	//  141  244:aload           4
	//  142  246:athrow          
_L1:
		if(obj != null)
	//* 143  247:aload_2         
	//* 144  248:ifnull          257
			((XmlResourceParser) (obj)).close();
	//  145  251:aload_2         
	//  146  252:invokeinterface #165 <Method void XmlResourceParser.close()>
		throw context;
	//  147  257:aload_0         
	//  148  258:athrow          
		context;
	//  149  259:astore_0        
		if(true) goto _L1; else goto _L4
	//  150  260:goto            247
_L4:
		obj2;
	//  151  263:astore_3        
		context = ((Context) (obj3));
	//  152  264:aload           4
	//  153  266:astore_0        
		  goto _L2
	//* 154  267:goto            121
		obj2;
	//  155  270:astore_3        
		context = ((Context) (obj4));
	//  156  271:aload           5
	//  157  273:astore_0        
		  goto _L3
	//* 158  274:goto            184
	}
}
