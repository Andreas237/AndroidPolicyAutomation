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
		resources = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		int i = xmlpullparser.getDepth();
	//    2    2:aload_3         
	//    3    3:invokeinterface #25  <Method int XmlPullParser.getDepth()>
	//    4    8:istore          4
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
	//   14   32:icmple          306
	//   15   35:iload           5
	//   16   37:iconst_1        
	//   17   38:icmpeq          306
			if(j == 2)
	//*  18   41:iload           5
	//*  19   43:iconst_2        
	//*  20   44:icmpne          10
			{
				resources = ((Resources) (Xml.asAttributeSet(xmlpullparser)));
	//   21   47:aload_3         
	//   22   48:invokestatic    #34  <Method android.util.AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   23   51:astore_1        
				theme = ((android.content.res.Resources.Theme) (xmlpullparser.getName()));
	//   24   52:aload_3         
	//   25   53:invokeinterface #38  <Method String XmlPullParser.getName()>
	//   26   58:astore_2        
				if(((String) (theme)).equals("linearInterpolator"))
	//*  27   59:aload_2         
	//*  28   60:ldc1            #40  <String "linearInterpolator">
	//*  29   62:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  30   65:ifeq            79
					resources = ((Resources) (new LinearInterpolator()));
	//   31   68:new             #48  <Class LinearInterpolator>
	//   32   71:dup             
	//   33   72:invokespecial   #49  <Method void LinearInterpolator()>
	//   34   75:astore_1        
				else
	//*  35   76:goto            10
				if(((String) (theme)).equals("accelerateInterpolator"))
	//*  36   79:aload_2         
	//*  37   80:ldc1            #51  <String "accelerateInterpolator">
	//*  38   82:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  39   85:ifeq            101
					resources = ((Resources) (new AccelerateInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   40   88:new             #53  <Class AccelerateInterpolator>
	//   41   91:dup             
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:invokespecial   #56  <Method void AccelerateInterpolator(Context, android.util.AttributeSet)>
	//   45   97:astore_1        
				else
	//*  46   98:goto            10
				if(((String) (theme)).equals("decelerateInterpolator"))
	//*  47  101:aload_2         
	//*  48  102:ldc1            #58  <String "decelerateInterpolator">
	//*  49  104:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  50  107:ifeq            123
					resources = ((Resources) (new DecelerateInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   51  110:new             #60  <Class DecelerateInterpolator>
	//   52  113:dup             
	//   53  114:aload_0         
	//   54  115:aload_1         
	//   55  116:invokespecial   #61  <Method void DecelerateInterpolator(Context, android.util.AttributeSet)>
	//   56  119:astore_1        
				else
	//*  57  120:goto            10
				if(((String) (theme)).equals("accelerateDecelerateInterpolator"))
	//*  58  123:aload_2         
	//*  59  124:ldc1            #63  <String "accelerateDecelerateInterpolator">
	//*  60  126:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  61  129:ifeq            143
					resources = ((Resources) (new AccelerateDecelerateInterpolator()));
	//   62  132:new             #65  <Class AccelerateDecelerateInterpolator>
	//   63  135:dup             
	//   64  136:invokespecial   #66  <Method void AccelerateDecelerateInterpolator()>
	//   65  139:astore_1        
				else
	//*  66  140:goto            10
				if(((String) (theme)).equals("cycleInterpolator"))
	//*  67  143:aload_2         
	//*  68  144:ldc1            #68  <String "cycleInterpolator">
	//*  69  146:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  70  149:ifeq            165
					resources = ((Resources) (new CycleInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   71  152:new             #70  <Class CycleInterpolator>
	//   72  155:dup             
	//   73  156:aload_0         
	//   74  157:aload_1         
	//   75  158:invokespecial   #71  <Method void CycleInterpolator(Context, android.util.AttributeSet)>
	//   76  161:astore_1        
				else
	//*  77  162:goto            10
				if(((String) (theme)).equals("anticipateInterpolator"))
	//*  78  165:aload_2         
	//*  79  166:ldc1            #73  <String "anticipateInterpolator">
	//*  80  168:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  81  171:ifeq            187
					resources = ((Resources) (new AnticipateInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   82  174:new             #75  <Class AnticipateInterpolator>
	//   83  177:dup             
	//   84  178:aload_0         
	//   85  179:aload_1         
	//   86  180:invokespecial   #76  <Method void AnticipateInterpolator(Context, android.util.AttributeSet)>
	//   87  183:astore_1        
				else
	//*  88  184:goto            10
				if(((String) (theme)).equals("overshootInterpolator"))
	//*  89  187:aload_2         
	//*  90  188:ldc1            #78  <String "overshootInterpolator">
	//*  91  190:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  92  193:ifeq            209
					resources = ((Resources) (new OvershootInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//   93  196:new             #80  <Class OvershootInterpolator>
	//   94  199:dup             
	//   95  200:aload_0         
	//   96  201:aload_1         
	//   97  202:invokespecial   #81  <Method void OvershootInterpolator(Context, android.util.AttributeSet)>
	//   98  205:astore_1        
				else
	//*  99  206:goto            10
				if(((String) (theme)).equals("anticipateOvershootInterpolator"))
	//* 100  209:aload_2         
	//* 101  210:ldc1            #83  <String "anticipateOvershootInterpolator">
	//* 102  212:invokevirtual   #46  <Method boolean String.equals(Object)>
	//* 103  215:ifeq            231
					resources = ((Resources) (new AnticipateOvershootInterpolator(context, ((android.util.AttributeSet) (resources)))));
	//  104  218:new             #85  <Class AnticipateOvershootInterpolator>
	//  105  221:dup             
	//  106  222:aload_0         
	//  107  223:aload_1         
	//  108  224:invokespecial   #86  <Method void AnticipateOvershootInterpolator(Context, android.util.AttributeSet)>
	//  109  227:astore_1        
				else
	//* 110  228:goto            10
				if(((String) (theme)).equals("bounceInterpolator"))
	//* 111  231:aload_2         
	//* 112  232:ldc1            #88  <String "bounceInterpolator">
	//* 113  234:invokevirtual   #46  <Method boolean String.equals(Object)>
	//* 114  237:ifeq            251
					resources = ((Resources) (new BounceInterpolator()));
	//  115  240:new             #90  <Class BounceInterpolator>
	//  116  243:dup             
	//  117  244:invokespecial   #91  <Method void BounceInterpolator()>
	//  118  247:astore_1        
				else
	//* 119  248:goto            10
				if(((String) (theme)).equals("pathInterpolator"))
	//* 120  251:aload_2         
	//* 121  252:ldc1            #93  <String "pathInterpolator">
	//* 122  254:invokevirtual   #46  <Method boolean String.equals(Object)>
	//* 123  257:ifeq            274
					resources = ((Resources) (new PathInterpolatorCompat(context, ((android.util.AttributeSet) (resources)), xmlpullparser)));
	//  124  260:new             #95  <Class PathInterpolatorCompat>
	//  125  263:dup             
	//  126  264:aload_0         
	//  127  265:aload_1         
	//  128  266:aload_3         
	//  129  267:invokespecial   #98  <Method void PathInterpolatorCompat(Context, android.util.AttributeSet, XmlPullParser)>
	//  130  270:astore_1        
				else
	//* 131  271:goto            10
					throw new RuntimeException((new StringBuilder()).append("Unknown interpolator name: ").append(xmlpullparser.getName()).toString());
	//  132  274:new             #100 <Class RuntimeException>
	//  133  277:dup             
	//  134  278:new             #102 <Class StringBuilder>
	//  135  281:dup             
	//  136  282:invokespecial   #103 <Method void StringBuilder()>
	//  137  285:ldc1            #105 <String "Unknown interpolator name: ">
	//  138  287:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  139  290:aload_3         
	//  140  291:invokeinterface #38  <Method String XmlPullParser.getName()>
	//  141  296:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  142  299:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  143  302:invokespecial   #115 <Method void RuntimeException(String)>
	//  144  305:athrow          
			}
		} while(true);
		return ((Interpolator) (resources));
	//  145  306:aload_1         
	//  146  307:areturn         
	}

	public static Interpolator loadInterpolator(Context context, int i)
		throws android.content.res.Resources.NotFoundException
	{
		if(android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
	//    0    0:getstatic       #126 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          16
_L1:
		context = ((Context) (AnimationUtils.loadInterpolator(context, i)));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #130 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//    6   13:astore_0        
_L4:
		return ((Interpolator) (context));
	//    7   14:aload_0         
	//    8   15:areturn         
_L2:
		Object obj;
		Object obj1;
		Object obj2;
		obj = null;
	//    9   16:aconst_null     
	//   10   17:astore_2        
		obj2 = null;
	//   11   18:aconst_null     
	//   12   19:astore          4
		obj1 = null;
	//   13   21:aconst_null     
	//   14   22:astore_3        
		if(i != 0x10c000f)
			break; /* Loop/switch isn't completed */
	//   15   23:iload_1         
	//   16   24:ldc1            #131 <Int 0x10c000f>
	//   17   26:icmpne          49
		context = ((Context) (new FastOutLinearInInterpolator()));
	//   18   29:new             #133 <Class FastOutLinearInInterpolator>
	//   19   32:dup             
	//   20   33:invokespecial   #134 <Method void FastOutLinearInInterpolator()>
	//   21   36:astore_0        
		if(false)
	//*  22   37:iconst_0        
	//*  23   38:ifeq            14
			throw new NullPointerException();
	//   24   41:new             #136 <Class NullPointerException>
	//   25   44:dup             
	//   26   45:invokespecial   #137 <Method void NullPointerException()>
	//   27   48:athrow          
		if(true) goto _L4; else goto _L3
_L3:
		if(i != 0x10c000d)
			break; /* Loop/switch isn't completed */
	//   28   49:iload_1         
	//   29   50:ldc1            #138 <Int 0x10c000d>
	//   30   52:icmpne          75
		context = ((Context) (new FastOutSlowInInterpolator()));
	//   31   55:new             #140 <Class FastOutSlowInInterpolator>
	//   32   58:dup             
	//   33   59:invokespecial   #141 <Method void FastOutSlowInInterpolator()>
	//   34   62:astore_0        
		if(false)
	//*  35   63:iconst_0        
	//*  36   64:ifeq            14
			throw new NullPointerException();
	//   37   67:new             #136 <Class NullPointerException>
	//   38   70:dup             
	//   39   71:invokespecial   #137 <Method void NullPointerException()>
	//   40   74:athrow          
		if(true) goto _L4; else goto _L5
_L5:
		if(i != 0x10c000e)
			break MISSING_BLOCK_LABEL_101;
	//   41   75:iload_1         
	//   42   76:ldc1            #142 <Int 0x10c000e>
	//   43   78:icmpne          101
		context = ((Context) (new LinearOutSlowInInterpolator()));
	//   44   81:new             #144 <Class LinearOutSlowInInterpolator>
	//   45   84:dup             
	//   46   85:invokespecial   #145 <Method void LinearOutSlowInInterpolator()>
	//   47   88:astore_0        
		if(true) goto _L4; else goto _L6
	//   48   89:iconst_0        
	//   49   90:ifeq            14
_L6:
		throw new NullPointerException();
	//   50   93:new             #136 <Class NullPointerException>
	//   51   96:dup             
	//   52   97:invokespecial   #137 <Method void NullPointerException()>
	//   53  100:athrow          
		XmlResourceParser xmlresourceparser = context.getResources().getAnimation(i);
	//   54  101:aload_0         
	//   55  102:invokevirtual   #151 <Method Resources Context.getResources()>
	//   56  105:iload_1         
	//   57  106:invokevirtual   #157 <Method XmlResourceParser Resources.getAnimation(int)>
	//   58  109:astore          5
		obj1 = ((Object) (xmlresourceparser));
	//   59  111:aload           5
	//   60  113:astore_3        
		obj = ((Object) (xmlresourceparser));
	//   61  114:aload           5
	//   62  116:astore_2        
		obj2 = ((Object) (xmlresourceparser));
	//   63  117:aload           5
	//   64  119:astore          4
		context = ((Context) (createInterpolatorFromXml(context, context.getResources(), context.getTheme(), ((XmlPullParser) (xmlresourceparser)))));
	//   65  121:aload_0         
	//   66  122:aload_0         
	//   67  123:invokevirtual   #151 <Method Resources Context.getResources()>
	//   68  126:aload_0         
	//   69  127:invokevirtual   #161 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   70  130:aload           5
	//   71  132:invokestatic    #163 <Method Interpolator createInterpolatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser)>
	//   72  135:astore_0        
		obj = ((Object) (context));
	//   73  136:aload_0         
	//   74  137:astore_2        
		context = ((Context) (obj));
	//   75  138:aload_2         
	//   76  139:astore_0        
		if(xmlresourceparser != null)
	//*  77  140:aload           5
	//*  78  142:ifnull          14
		{
			xmlresourceparser.close();
	//   79  145:aload           5
	//   80  147:invokeinterface #168 <Method void XmlResourceParser.close()>
			return ((Interpolator) (obj));
	//   81  152:aload_2         
	//   82  153:areturn         
		}
		  goto _L4
		context;
	//   83  154:astore_0        
		obj = obj1;
	//   84  155:aload_3         
	//   85  156:astore_2        
		obj2 = ((Object) (new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Can't load animation resource ID #0x").append(Integer.toHexString(i)).toString())));
	//   86  157:new             #120 <Class android.content.res.Resources$NotFoundException>
	//   87  160:dup             
	//   88  161:new             #102 <Class StringBuilder>
	//   89  164:dup             
	//   90  165:invokespecial   #103 <Method void StringBuilder()>
	//   91  168:ldc1            #170 <String "Can't load animation resource ID #0x">
	//   92  170:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   93  173:iload_1         
	//   94  174:invokestatic    #176 <Method String Integer.toHexString(int)>
	//   95  177:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   96  180:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   97  183:invokespecial   #177 <Method void android.content.res.Resources$NotFoundException(String)>
	//   98  186:astore          4
		obj = obj1;
	//   99  188:aload_3         
	//  100  189:astore_2        
		((android.content.res.Resources.NotFoundException) (obj2)).initCause(((Throwable) (context)));
	//  101  190:aload           4
	//  102  192:aload_0         
	//  103  193:invokevirtual   #181 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  104  196:pop             
		obj = obj1;
	//  105  197:aload_3         
	//  106  198:astore_2        
		throw obj2;
	//  107  199:aload           4
	//  108  201:athrow          
		context;
	//  109  202:astore_0        
		if(obj != null)
	//* 110  203:aload_2         
	//* 111  204:ifnull          213
			((XmlResourceParser) (obj)).close();
	//  112  207:aload_2         
	//  113  208:invokeinterface #168 <Method void XmlResourceParser.close()>
		throw context;
	//  114  213:aload_0         
	//  115  214:athrow          
		context;
	//  116  215:astore_0        
		obj = obj2;
	//  117  216:aload           4
	//  118  218:astore_2        
		obj1 = ((Object) (new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Can't load animation resource ID #0x").append(Integer.toHexString(i)).toString())));
	//  119  219:new             #120 <Class android.content.res.Resources$NotFoundException>
	//  120  222:dup             
	//  121  223:new             #102 <Class StringBuilder>
	//  122  226:dup             
	//  123  227:invokespecial   #103 <Method void StringBuilder()>
	//  124  230:ldc1            #170 <String "Can't load animation resource ID #0x">
	//  125  232:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  126  235:iload_1         
	//  127  236:invokestatic    #176 <Method String Integer.toHexString(int)>
	//  128  239:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  129  242:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  130  245:invokespecial   #177 <Method void android.content.res.Resources$NotFoundException(String)>
	//  131  248:astore_3        
		obj = obj2;
	//  132  249:aload           4
	//  133  251:astore_2        
		((android.content.res.Resources.NotFoundException) (obj1)).initCause(((Throwable) (context)));
	//  134  252:aload_3         
	//  135  253:aload_0         
	//  136  254:invokevirtual   #181 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  137  257:pop             
		obj = obj2;
	//  138  258:aload           4
	//  139  260:astore_2        
		throw obj1;
	//  140  261:aload_3         
	//  141  262:athrow          
	}
}
