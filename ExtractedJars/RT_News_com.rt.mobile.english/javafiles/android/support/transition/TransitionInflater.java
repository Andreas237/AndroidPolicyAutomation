// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.content.res.*;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.transition:
//			TransitionSet, Fade, ChangeBounds, Slide, 
//			Explode, ChangeImageTransform, ChangeTransform, ChangeClipBounds, 
//			AutoTransition, ChangeScroll, Transition, ArcMotion, 
//			PathMotion, PatternPathMotion, TransitionManager, Styleable, 
//			Scene

public class TransitionInflater
{

	private TransitionInflater(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Context mContext>
	//    5    9:return          
	}

	private Object createCustom(AttributeSet attributeset, Class class1, String s)
	{
		String s1;
		s1 = attributeset.getAttributeValue(((String) (null)), "class");
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:ldc1            #42  <String "class">
	//    3    4:invokeinterface #46  <Method String AttributeSet.getAttributeValue(String, String)>
	//    4    9:astore          5
		if(s1 == null)
	//*   5   11:aload           5
	//*   6   13:ifnonnull       49
		{
			attributeset = ((AttributeSet) (new StringBuilder()));
	//    7   16:new             #48  <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #49  <Method void StringBuilder()>
	//   10   23:astore_1        
			((StringBuilder) (attributeset)).append(s);
	//   11   24:aload_1         
	//   12   25:aload_3         
	//   13   26:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (attributeset)).append(" tag must have a 'class' attribute");
	//   15   30:aload_1         
	//   16   31:ldc1            #55  <String " tag must have a 'class' attribute">
	//   17   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throw new InflateException(((StringBuilder) (attributeset)).toString());
	//   19   37:new             #57  <Class InflateException>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #64  <Method void InflateException(String)>
	//   24   48:athrow          
		}
		ArrayMap arraymap = CONSTRUCTORS;
	//   25   49:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   26   52:astore          6
		arraymap;
	//   27   54:aload           6
		JVM INSTR monitorenter ;
	//   28   56:monitorenter    
		Constructor constructor = (Constructor)CONSTRUCTORS.get(((Object) (s1)));
	//   29   57:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   30   60:aload           5
	//   31   62:invokevirtual   #68  <Method Object ArrayMap.get(Object)>
	//   32   65:checkcast       #70  <Class Constructor>
	//   33   68:astore          4
		s = ((String) (constructor));
	//   34   70:aload           4
	//   35   72:astore_3        
		if(constructor != null)
			break MISSING_BLOCK_LABEL_128;
	//   36   73:aload           4
	//   37   75:ifnonnull       128
		Class class2 = mContext.getClassLoader().loadClass(s1).asSubclass(class1);
	//   38   78:aload_0         
	//   39   79:getfield        #35  <Field Context mContext>
	//   40   82:invokevirtual   #74  <Method ClassLoader Context.getClassLoader()>
	//   41   85:aload           5
	//   42   87:invokevirtual   #80  <Method Class ClassLoader.loadClass(String)>
	//   43   90:aload_2         
	//   44   91:invokevirtual   #84  <Method Class Class.asSubclass(Class)>
	//   45   94:astore          7
		s = ((String) (constructor));
	//   46   96:aload           4
	//   47   98:astore_3        
		if(class2 == null)
			break MISSING_BLOCK_LABEL_128;
	//   48   99:aload           7
	//   49  101:ifnull          128
		s = ((String) (class2.getConstructor(CONSTRUCTOR_SIGNATURE)));
	//   50  104:aload           7
	//   51  106:getstatic       #22  <Field Class[] CONSTRUCTOR_SIGNATURE>
	//   52  109:invokevirtual   #88  <Method Constructor Class.getConstructor(Class[])>
	//   53  112:astore_3        
		((Constructor) (s)).setAccessible(true);
	//   54  113:aload_3         
	//   55  114:iconst_1        
	//   56  115:invokevirtual   #92  <Method void Constructor.setAccessible(boolean)>
		CONSTRUCTORS.put(((Object) (s1)), ((Object) (s)));
	//   57  118:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   58  121:aload           5
	//   59  123:aload_3         
	//   60  124:invokevirtual   #96  <Method Object ArrayMap.put(Object, Object)>
	//   61  127:pop             
		attributeset = ((AttributeSet) (((Constructor) (s)).newInstance(new Object[] {
			mContext, attributeset
		})));
	//   62  128:aload_3         
	//   63  129:iconst_2        
	//   64  130:anewarray       Object[]
	//   65  133:dup             
	//   66  134:iconst_0        
	//   67  135:aload_0         
	//   68  136:getfield        #35  <Field Context mContext>
	//   69  139:aastore         
	//   70  140:dup             
	//   71  141:iconst_1        
	//   72  142:aload_1         
	//   73  143:aastore         
	//   74  144:invokevirtual   #100 <Method Object Constructor.newInstance(Object[])>
	//   75  147:astore_1        
		arraymap;
	//   76  148:aload           6
		JVM INSTR monitorexit ;
	//   77  150:monitorexit     
		return ((Object) (attributeset));
	//   78  151:aload_1         
	//   79  152:areturn         
		attributeset;
	//   80  153:astore_1        
		arraymap;
	//   81  154:aload           6
		JVM INSTR monitorexit ;
	//   82  156:monitorexit     
		try
		{
			throw attributeset;
	//   83  157:aload_1         
	//   84  158:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset)
	//*  85  159:astore_1        
		{
			s = ((String) (new StringBuilder()));
	//   86  160:new             #48  <Class StringBuilder>
	//   87  163:dup             
	//   88  164:invokespecial   #49  <Method void StringBuilder()>
	//   89  167:astore_3        
		}
		((StringBuilder) (s)).append("Could not instantiate ");
	//   90  168:aload_3         
	//   91  169:ldc1            #102 <String "Could not instantiate ">
	//   92  171:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   93  174:pop             
		((StringBuilder) (s)).append(((Object) (class1)));
	//   94  175:aload_3         
	//   95  176:aload_2         
	//   96  177:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   97  180:pop             
		((StringBuilder) (s)).append(" class ");
	//   98  181:aload_3         
	//   99  182:ldc1            #107 <String " class ">
	//  100  184:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  101  187:pop             
		((StringBuilder) (s)).append(s1);
	//  102  188:aload_3         
	//  103  189:aload           5
	//  104  191:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  105  194:pop             
		throw new InflateException(((StringBuilder) (s)).toString(), ((Throwable) (attributeset)));
	//  106  195:new             #57  <Class InflateException>
	//  107  198:dup             
	//  108  199:aload_3         
	//  109  200:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  110  203:aload_1         
	//  111  204:invokespecial   #110 <Method void InflateException(String, Throwable)>
	//  112  207:athrow          
	}

	private Transition createTransitionFromXml(XmlPullParser xmlpullparser, AttributeSet attributeset, Transition transition)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth();
	//    0    0:aload_1         
	//    1    1:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//    2    6:istore          4
		TransitionSet transitionset;
		if(transition instanceof TransitionSet)
	//*   3    8:aload_3         
	//*   4    9:instanceof      #124 <Class TransitionSet>
	//*   5   12:ifeq            24
			transitionset = (TransitionSet)transition;
	//    6   15:aload_3         
	//    7   16:checkcast       #124 <Class TransitionSet>
	//    8   19:astore          7
		else
	//*   9   21:goto            27
			transitionset = null;
	//   10   24:aconst_null     
	//   11   25:astore          7
label0:
		do
		{
			Object obj1;
label1:
			{
				obj1 = null;
	//   12   27:aconst_null     
	//   13   28:astore          8
				do
				{
					int j;
					do
					{
						j = xmlpullparser.next();
	//   14   30:aload_1         
	//   15   31:invokeinterface #127 <Method int XmlPullParser.next()>
	//   16   36:istore          5
						if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
							break label1;
	//   17   38:iload           5
	//   18   40:iconst_3        
	//   19   41:icmpne          55
	//   20   44:aload_1         
	//   21   45:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   22   50:iload           4
	//   23   52:icmple          636
	//   24   55:iload           5
	//   25   57:iconst_1        
	//   26   58:icmpeq          636
					} while(j != 2);
	//   27   61:iload           5
	//   28   63:iconst_2        
	//   29   64:icmpeq          70
	//*  30   67:goto            30
					Object obj = ((Object) (xmlpullparser.getName()));
	//   31   70:aload_1         
	//   32   71:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   33   76:astore          6
					if("fade".equals(obj))
	//*  34   78:ldc1            #132 <String "fade">
	//*  35   80:aload           6
	//*  36   82:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  37   85:ifeq            105
						obj = ((Object) (new Fade(mContext, attributeset)));
	//   38   88:new             #140 <Class Fade>
	//   39   91:dup             
	//   40   92:aload_0         
	//   41   93:getfield        #35  <Field Context mContext>
	//   42   96:aload_2         
	//   43   97:invokespecial   #143 <Method void Fade(Context, AttributeSet)>
	//   44  100:astore          6
					else
	//*  45  102:goto            537
					if("changeBounds".equals(obj))
	//*  46  105:ldc1            #145 <String "changeBounds">
	//*  47  107:aload           6
	//*  48  109:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  49  112:ifeq            132
						obj = ((Object) (new ChangeBounds(mContext, attributeset)));
	//   50  115:new             #147 <Class ChangeBounds>
	//   51  118:dup             
	//   52  119:aload_0         
	//   53  120:getfield        #35  <Field Context mContext>
	//   54  123:aload_2         
	//   55  124:invokespecial   #148 <Method void ChangeBounds(Context, AttributeSet)>
	//   56  127:astore          6
					else
	//*  57  129:goto            537
					if("slide".equals(obj))
	//*  58  132:ldc1            #150 <String "slide">
	//*  59  134:aload           6
	//*  60  136:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  61  139:ifeq            159
						obj = ((Object) (new Slide(mContext, attributeset)));
	//   62  142:new             #152 <Class Slide>
	//   63  145:dup             
	//   64  146:aload_0         
	//   65  147:getfield        #35  <Field Context mContext>
	//   66  150:aload_2         
	//   67  151:invokespecial   #153 <Method void Slide(Context, AttributeSet)>
	//   68  154:astore          6
					else
	//*  69  156:goto            537
					if("explode".equals(obj))
	//*  70  159:ldc1            #155 <String "explode">
	//*  71  161:aload           6
	//*  72  163:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  73  166:ifeq            186
						obj = ((Object) (new Explode(mContext, attributeset)));
	//   74  169:new             #157 <Class Explode>
	//   75  172:dup             
	//   76  173:aload_0         
	//   77  174:getfield        #35  <Field Context mContext>
	//   78  177:aload_2         
	//   79  178:invokespecial   #158 <Method void Explode(Context, AttributeSet)>
	//   80  181:astore          6
					else
	//*  81  183:goto            537
					if("changeImageTransform".equals(obj))
	//*  82  186:ldc1            #160 <String "changeImageTransform">
	//*  83  188:aload           6
	//*  84  190:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  85  193:ifeq            213
						obj = ((Object) (new ChangeImageTransform(mContext, attributeset)));
	//   86  196:new             #162 <Class ChangeImageTransform>
	//   87  199:dup             
	//   88  200:aload_0         
	//   89  201:getfield        #35  <Field Context mContext>
	//   90  204:aload_2         
	//   91  205:invokespecial   #163 <Method void ChangeImageTransform(Context, AttributeSet)>
	//   92  208:astore          6
					else
	//*  93  210:goto            537
					if("changeTransform".equals(obj))
	//*  94  213:ldc1            #165 <String "changeTransform">
	//*  95  215:aload           6
	//*  96  217:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  97  220:ifeq            240
						obj = ((Object) (new ChangeTransform(mContext, attributeset)));
	//   98  223:new             #167 <Class ChangeTransform>
	//   99  226:dup             
	//  100  227:aload_0         
	//  101  228:getfield        #35  <Field Context mContext>
	//  102  231:aload_2         
	//  103  232:invokespecial   #168 <Method void ChangeTransform(Context, AttributeSet)>
	//  104  235:astore          6
					else
	//* 105  237:goto            537
					if("changeClipBounds".equals(obj))
	//* 106  240:ldc1            #170 <String "changeClipBounds">
	//* 107  242:aload           6
	//* 108  244:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 109  247:ifeq            267
						obj = ((Object) (new ChangeClipBounds(mContext, attributeset)));
	//  110  250:new             #172 <Class ChangeClipBounds>
	//  111  253:dup             
	//  112  254:aload_0         
	//  113  255:getfield        #35  <Field Context mContext>
	//  114  258:aload_2         
	//  115  259:invokespecial   #173 <Method void ChangeClipBounds(Context, AttributeSet)>
	//  116  262:astore          6
					else
	//* 117  264:goto            537
					if("autoTransition".equals(obj))
	//* 118  267:ldc1            #175 <String "autoTransition">
	//* 119  269:aload           6
	//* 120  271:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 121  274:ifeq            294
						obj = ((Object) (new AutoTransition(mContext, attributeset)));
	//  122  277:new             #177 <Class AutoTransition>
	//  123  280:dup             
	//  124  281:aload_0         
	//  125  282:getfield        #35  <Field Context mContext>
	//  126  285:aload_2         
	//  127  286:invokespecial   #178 <Method void AutoTransition(Context, AttributeSet)>
	//  128  289:astore          6
					else
	//* 129  291:goto            537
					if("changeScroll".equals(obj))
	//* 130  294:ldc1            #180 <String "changeScroll">
	//* 131  296:aload           6
	//* 132  298:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 133  301:ifeq            321
						obj = ((Object) (new ChangeScroll(mContext, attributeset)));
	//  134  304:new             #182 <Class ChangeScroll>
	//  135  307:dup             
	//  136  308:aload_0         
	//  137  309:getfield        #35  <Field Context mContext>
	//  138  312:aload_2         
	//  139  313:invokespecial   #183 <Method void ChangeScroll(Context, AttributeSet)>
	//  140  316:astore          6
					else
	//* 141  318:goto            537
					if("transitionSet".equals(obj))
	//* 142  321:ldc1            #185 <String "transitionSet">
	//* 143  323:aload           6
	//* 144  325:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 145  328:ifeq            348
						obj = ((Object) (new TransitionSet(mContext, attributeset)));
	//  146  331:new             #124 <Class TransitionSet>
	//  147  334:dup             
	//  148  335:aload_0         
	//  149  336:getfield        #35  <Field Context mContext>
	//  150  339:aload_2         
	//  151  340:invokespecial   #186 <Method void TransitionSet(Context, AttributeSet)>
	//  152  343:astore          6
					else
	//* 153  345:goto            537
					if("transition".equals(obj))
	//* 154  348:ldc1            #188 <String "transition">
	//* 155  350:aload           6
	//* 156  352:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 157  355:ifeq            375
						obj = ((Object) ((Transition)createCustom(attributeset, android/support/transition/Transition, "transition")));
	//  158  358:aload_0         
	//  159  359:aload_2         
	//  160  360:ldc1            #190 <Class Transition>
	//  161  362:ldc1            #188 <String "transition">
	//  162  364:invokespecial   #192 <Method Object createCustom(AttributeSet, Class, String)>
	//  163  367:checkcast       #190 <Class Transition>
	//  164  370:astore          6
					else
	//* 165  372:goto            537
					if("targets".equals(obj))
	//* 166  375:ldc1            #194 <String "targets">
	//* 167  377:aload           6
	//* 168  379:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 169  382:ifeq            399
					{
						getTargetIds(xmlpullparser, attributeset, transition);
	//  170  385:aload_0         
	//  171  386:aload_1         
	//  172  387:aload_2         
	//  173  388:aload_3         
	//  174  389:invokespecial   #198 <Method void getTargetIds(XmlPullParser, AttributeSet, Transition)>
						obj = obj1;
	//  175  392:aload           8
	//  176  394:astore          6
					} else
	//* 177  396:goto            537
					if("arcMotion".equals(obj))
	//* 178  399:ldc1            #200 <String "arcMotion">
	//* 179  401:aload           6
	//* 180  403:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 181  406:ifeq            446
					{
						if(transition == null)
	//* 182  409:aload_3         
	//* 183  410:ifnonnull       423
							throw new RuntimeException("Invalid use of arcMotion element");
	//  184  413:new             #202 <Class RuntimeException>
	//  185  416:dup             
	//  186  417:ldc1            #204 <String "Invalid use of arcMotion element">
	//  187  419:invokespecial   #205 <Method void RuntimeException(String)>
	//  188  422:athrow          
						transition.setPathMotion(((PathMotion) (new ArcMotion(mContext, attributeset))));
	//  189  423:aload_3         
	//  190  424:new             #207 <Class ArcMotion>
	//  191  427:dup             
	//  192  428:aload_0         
	//  193  429:getfield        #35  <Field Context mContext>
	//  194  432:aload_2         
	//  195  433:invokespecial   #208 <Method void ArcMotion(Context, AttributeSet)>
	//  196  436:invokevirtual   #212 <Method void Transition.setPathMotion(PathMotion)>
						obj = obj1;
	//  197  439:aload           8
	//  198  441:astore          6
					} else
	//* 199  443:goto            537
					if("pathMotion".equals(obj))
	//* 200  446:ldc1            #214 <String "pathMotion">
	//* 201  448:aload           6
	//* 202  450:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 203  453:ifeq            493
					{
						if(transition == null)
	//* 204  456:aload_3         
	//* 205  457:ifnonnull       470
							throw new RuntimeException("Invalid use of pathMotion element");
	//  206  460:new             #202 <Class RuntimeException>
	//  207  463:dup             
	//  208  464:ldc1            #216 <String "Invalid use of pathMotion element">
	//  209  466:invokespecial   #205 <Method void RuntimeException(String)>
	//  210  469:athrow          
						transition.setPathMotion((PathMotion)createCustom(attributeset, android/support/transition/PathMotion, "pathMotion"));
	//  211  470:aload_3         
	//  212  471:aload_0         
	//  213  472:aload_2         
	//  214  473:ldc1            #218 <Class PathMotion>
	//  215  475:ldc1            #214 <String "pathMotion">
	//  216  477:invokespecial   #192 <Method Object createCustom(AttributeSet, Class, String)>
	//  217  480:checkcast       #218 <Class PathMotion>
	//  218  483:invokevirtual   #212 <Method void Transition.setPathMotion(PathMotion)>
						obj = obj1;
	//  219  486:aload           8
	//  220  488:astore          6
					} else
	//* 221  490:goto            537
					{
						if(!"patternPathMotion".equals(obj))
							break;
	//  222  493:ldc1            #220 <String "patternPathMotion">
	//  223  495:aload           6
	//  224  497:invokevirtual   #138 <Method boolean String.equals(Object)>
	//  225  500:ifeq            598
						if(transition == null)
	//* 226  503:aload_3         
	//* 227  504:ifnonnull       517
							throw new RuntimeException("Invalid use of patternPathMotion element");
	//  228  507:new             #202 <Class RuntimeException>
	//  229  510:dup             
	//  230  511:ldc1            #222 <String "Invalid use of patternPathMotion element">
	//  231  513:invokespecial   #205 <Method void RuntimeException(String)>
	//  232  516:athrow          
						transition.setPathMotion(((PathMotion) (new PatternPathMotion(mContext, attributeset))));
	//  233  517:aload_3         
	//  234  518:new             #224 <Class PatternPathMotion>
	//  235  521:dup             
	//  236  522:aload_0         
	//  237  523:getfield        #35  <Field Context mContext>
	//  238  526:aload_2         
	//  239  527:invokespecial   #225 <Method void PatternPathMotion(Context, AttributeSet)>
	//  240  530:invokevirtual   #212 <Method void Transition.setPathMotion(PathMotion)>
						obj = obj1;
	//  241  533:aload           8
	//  242  535:astore          6
					}
					obj1 = obj;
	//  243  537:aload           6
	//  244  539:astore          8
					if(obj != null)
	//* 245  541:aload           6
	//* 246  543:ifnull          30
					{
						if(!xmlpullparser.isEmptyElementTag())
	//* 247  546:aload_1         
	//* 248  547:invokeinterface #229 <Method boolean XmlPullParser.isEmptyElementTag()>
	//* 249  552:ifne            564
							createTransitionFromXml(xmlpullparser, attributeset, ((Transition) (obj)));
	//  250  555:aload_0         
	//  251  556:aload_1         
	//  252  557:aload_2         
	//  253  558:aload           6
	//  254  560:invokespecial   #231 <Method Transition createTransitionFromXml(XmlPullParser, AttributeSet, Transition)>
	//  255  563:pop             
						if(transitionset != null)
	//* 256  564:aload           7
	//* 257  566:ifnull          580
						{
							transitionset.addTransition(((Transition) (obj)));
	//  258  569:aload           7
	//  259  571:aload           6
	//  260  573:invokevirtual   #235 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//  261  576:pop             
							continue label0;
	//  262  577:goto            27
						}
						obj1 = obj;
	//  263  580:aload           6
	//  264  582:astore          8
						if(transition != null)
	//* 265  584:aload_3         
	//* 266  585:ifnull          30
							throw new InflateException("Could not add transition to another transition.");
	//  267  588:new             #57  <Class InflateException>
	//  268  591:dup             
	//  269  592:ldc1            #237 <String "Could not add transition to another transition.">
	//  270  594:invokespecial   #64  <Method void InflateException(String)>
	//  271  597:athrow          
					}
				} while(true);
				attributeset = ((AttributeSet) (new StringBuilder()));
	//  272  598:new             #48  <Class StringBuilder>
	//  273  601:dup             
	//  274  602:invokespecial   #49  <Method void StringBuilder()>
	//  275  605:astore_2        
				((StringBuilder) (attributeset)).append("Unknown scene name: ");
	//  276  606:aload_2         
	//  277  607:ldc1            #239 <String "Unknown scene name: ">
	//  278  609:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  279  612:pop             
				((StringBuilder) (attributeset)).append(xmlpullparser.getName());
	//  280  613:aload_2         
	//  281  614:aload_1         
	//  282  615:invokeinterface #130 <Method String XmlPullParser.getName()>
	//  283  620:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  284  623:pop             
				throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//  285  624:new             #202 <Class RuntimeException>
	//  286  627:dup             
	//  287  628:aload_2         
	//  288  629:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  289  632:invokespecial   #205 <Method void RuntimeException(String)>
	//  290  635:athrow          
			}
			return ((Transition) (obj1));
	//  291  636:aload           8
	//  292  638:areturn         
		} while(true);
	}

	private TransitionManager createTransitionManagerFromXml(XmlPullParser xmlpullparser, AttributeSet attributeset, ViewGroup viewgroup)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth();
	//    0    0:aload_1         
	//    1    1:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//    2    6:istore          4
		TransitionManager transitionmanager = null;
	//    3    8:aconst_null     
	//    4    9:astore          6
		do
		{
			int j = xmlpullparser.next();
	//    5   11:aload_1         
	//    6   12:invokeinterface #127 <Method int XmlPullParser.next()>
	//    7   17:istore          5
			if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
				break;
	//    8   19:iload           5
	//    9   21:iconst_3        
	//   10   22:icmpne          36
	//   11   25:aload_1         
	//   12   26:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   13   31:iload           4
	//   14   33:icmple          146
	//   15   36:iload           5
	//   16   38:iconst_1        
	//   17   39:icmpeq          146
			if(j == 2)
	//*  18   42:iload           5
	//*  19   44:iconst_2        
	//*  20   45:icmpeq          51
	//*  21   48:goto            11
			{
				String s = xmlpullparser.getName();
	//   22   51:aload_1         
	//   23   52:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   24   57:astore          7
				if(s.equals("transitionManager"))
	//*  25   59:aload           7
	//*  26   61:ldc1            #244 <String "transitionManager">
	//*  27   63:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  28   66:ifeq            81
					transitionmanager = new TransitionManager();
	//   29   69:new             #246 <Class TransitionManager>
	//   30   72:dup             
	//   31   73:invokespecial   #247 <Method void TransitionManager()>
	//   32   76:astore          6
				else
	//*  33   78:goto            11
				if(s.equals("transition") && transitionmanager != null)
	//*  34   81:aload           7
	//*  35   83:ldc1            #188 <String "transition">
	//*  36   85:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  37   88:ifeq            108
	//*  38   91:aload           6
	//*  39   93:ifnull          108
				{
					loadTransition(attributeset, xmlpullparser, viewgroup, transitionmanager);
	//   40   96:aload_0         
	//   41   97:aload_2         
	//   42   98:aload_1         
	//   43   99:aload_3         
	//   44  100:aload           6
	//   45  102:invokespecial   #251 <Method void loadTransition(AttributeSet, XmlPullParser, ViewGroup, TransitionManager)>
				} else
	//*  46  105:goto            11
				{
					attributeset = ((AttributeSet) (new StringBuilder()));
	//   47  108:new             #48  <Class StringBuilder>
	//   48  111:dup             
	//   49  112:invokespecial   #49  <Method void StringBuilder()>
	//   50  115:astore_2        
					((StringBuilder) (attributeset)).append("Unknown scene name: ");
	//   51  116:aload_2         
	//   52  117:ldc1            #239 <String "Unknown scene name: ">
	//   53  119:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   54  122:pop             
					((StringBuilder) (attributeset)).append(xmlpullparser.getName());
	//   55  123:aload_2         
	//   56  124:aload_1         
	//   57  125:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   58  130:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   59  133:pop             
					throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//   60  134:new             #202 <Class RuntimeException>
	//   61  137:dup             
	//   62  138:aload_2         
	//   63  139:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   64  142:invokespecial   #205 <Method void RuntimeException(String)>
	//   65  145:athrow          
				}
			}
		} while(true);
		return transitionmanager;
	//   66  146:aload           6
	//   67  148:areturn         
	}

	public static TransitionInflater from(Context context)
	{
		return new TransitionInflater(context);
	//    0    0:new             #2   <Class TransitionInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #255 <Method void TransitionInflater(Context)>
	//    4    8:areturn         
	}

	private void getTargetIds(XmlPullParser xmlpullparser, AttributeSet attributeset, Transition transition)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth();
	//    0    0:aload_1         
	//    1    1:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//    2    6:istore          4
_L3:
		int j = xmlpullparser.next();
	//    3    8:aload_1         
	//    4    9:invokeinterface #127 <Method int XmlPullParser.next()>
	//    5   14:istore          5
		if(j == 3 && xmlpullparser.getDepth() <= i || j == 1) goto _L2; else goto _L1
	//    6   16:iload           5
	//    7   18:iconst_3        
	//    8   19:icmpne          33
	//    9   22:aload_1         
	//   10   23:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   11   28:iload           4
	//   12   30:icmple          342
	//   13   33:iload           5
	//   14   35:iconst_1        
	//   15   36:icmpeq          342
_L1:
		if(j == 2) goto _L4; else goto _L3
	//   16   39:iload           5
	//   17   41:iconst_2        
	//   18   42:icmpeq          48
	//*  19   45:goto            8
_L4:
		if(!xmlpullparser.getName().equals("target")) goto _L6; else goto _L5
	//   20   48:aload_1         
	//   21   49:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   22   54:ldc2            #259 <String "target">
	//   23   57:invokevirtual   #138 <Method boolean String.equals(Object)>
	//   24   60:ifeq            304
_L5:
		String s;
		TypedArray typedarray;
		typedarray = mContext.obtainStyledAttributes(attributeset, Styleable.TRANSITION_TARGET);
	//   25   63:aload_0         
	//   26   64:getfield        #35  <Field Context mContext>
	//   27   67:aload_2         
	//   28   68:getstatic       #265 <Field int[] Styleable.TRANSITION_TARGET>
	//   29   71:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   30   74:astore          8
		int k = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "targetId", 1, 0);
	//   31   76:aload           8
	//   32   78:aload_1         
	//   33   79:ldc2            #271 <String "targetId">
	//   34   82:iconst_1        
	//   35   83:iconst_0        
	//   36   84:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   37   87:istore          5
		if(k != 0)
	//*  38   89:iload           5
	//*  39   91:ifeq            104
		{
			transition.addTarget(k);
	//   40   94:aload_3         
	//   41   95:iload           5
	//   42   97:invokevirtual   #281 <Method Transition Transition.addTarget(int)>
	//   43  100:pop             
			break MISSING_BLOCK_LABEL_256;
	//   44  101:goto            256
		}
		k = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "excludeId", 2, 0);
	//   45  104:aload           8
	//   46  106:aload_1         
	//   47  107:ldc2            #283 <String "excludeId">
	//   48  110:iconst_2        
	//   49  111:iconst_0        
	//   50  112:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   51  115:istore          5
		if(k != 0)
	//*  52  117:iload           5
	//*  53  119:ifeq            133
		{
			transition.excludeTarget(k, true);
	//   54  122:aload_3         
	//   55  123:iload           5
	//   56  125:iconst_1        
	//   57  126:invokevirtual   #287 <Method Transition Transition.excludeTarget(int, boolean)>
	//   58  129:pop             
			break MISSING_BLOCK_LABEL_256;
	//   59  130:goto            256
		}
		s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "targetName", 4);
	//   60  133:aload           8
	//   61  135:aload_1         
	//   62  136:ldc2            #289 <String "targetName">
	//   63  139:iconst_4        
	//   64  140:invokestatic    #293 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   65  143:astore          6
		if(s != null)
	//*  66  145:aload           6
	//*  67  147:ifnull          160
		{
			transition.addTarget(s);
	//   68  150:aload_3         
	//   69  151:aload           6
	//   70  153:invokevirtual   #296 <Method Transition Transition.addTarget(String)>
	//   71  156:pop             
			break MISSING_BLOCK_LABEL_256;
	//   72  157:goto            256
		}
		s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "excludeName", 5);
	//   73  160:aload           8
	//   74  162:aload_1         
	//   75  163:ldc2            #298 <String "excludeName">
	//   76  166:iconst_5        
	//   77  167:invokestatic    #293 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   78  170:astore          6
		if(s != null)
	//*  79  172:aload           6
	//*  80  174:ifnull          188
		{
			transition.excludeTarget(s, true);
	//   81  177:aload_3         
	//   82  178:aload           6
	//   83  180:iconst_1        
	//   84  181:invokevirtual   #301 <Method Transition Transition.excludeTarget(String, boolean)>
	//   85  184:pop             
			break MISSING_BLOCK_LABEL_256;
	//   86  185:goto            256
		}
		s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "excludeClass", 3);
	//   87  188:aload           8
	//   88  190:aload_1         
	//   89  191:ldc2            #303 <String "excludeClass">
	//   90  194:iconst_3        
	//   91  195:invokestatic    #293 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   92  198:astore          6
		if(s == null) goto _L8; else goto _L7
	//   93  200:aload           6
	//   94  202:ifnull          219
_L7:
		String s1;
		try
		{
			transition.excludeTarget(Class.forName(s), true);
	//   95  205:aload_3         
	//   96  206:aload           6
	//   97  208:invokestatic    #306 <Method Class Class.forName(String)>
	//   98  211:iconst_1        
	//   99  212:invokevirtual   #309 <Method Transition Transition.excludeTarget(Class, boolean)>
	//  100  215:pop             
			break MISSING_BLOCK_LABEL_256;
	//  101  216:goto            256
		}
	//* 102  219:aload           8
	//* 103  221:aload_1         
	//* 104  222:ldc2            #311 <String "targetClass">
	//* 105  225:iconst_0        
	//* 106  226:invokestatic    #293 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//* 107  229:astore          7
	//* 108  231:aload           7
	//* 109  233:ifnull          256
	//* 110  236:aload_3         
	//* 111  237:aload           7
	//* 112  239:invokestatic    #306 <Method Class Class.forName(String)>
	//* 113  242:invokevirtual   #314 <Method Transition Transition.addTarget(Class)>
	//* 114  245:pop             
	//* 115  246:goto            256
	//* 116  249:astore_2        
	//* 117  250:aload           7
	//* 118  252:astore_1        
	//* 119  253:goto            264
	//* 120  256:aload           8
	//* 121  258:invokevirtual   #319 <Method void TypedArray.recycle()>
	//* 122  261:goto            8
	//* 123  264:aload           8
	//* 124  266:invokevirtual   #319 <Method void TypedArray.recycle()>
	//* 125  269:new             #48  <Class StringBuilder>
	//* 126  272:dup             
	//* 127  273:invokespecial   #49  <Method void StringBuilder()>
	//* 128  276:astore_3        
	//* 129  277:aload_3         
	//* 130  278:ldc2            #321 <String "Could not create ">
	//* 131  281:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 132  284:pop             
	//* 133  285:aload_3         
	//* 134  286:aload_1         
	//* 135  287:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 136  290:pop             
	//* 137  291:new             #202 <Class RuntimeException>
	//* 138  294:dup             
	//* 139  295:aload_3         
	//* 140  296:invokevirtual   #61  <Method String StringBuilder.toString()>
	//* 141  299:aload_2         
	//* 142  300:invokespecial   #322 <Method void RuntimeException(String, Throwable)>
	//* 143  303:athrow          
	//* 144  304:new             #48  <Class StringBuilder>
	//* 145  307:dup             
	//* 146  308:invokespecial   #49  <Method void StringBuilder()>
	//* 147  311:astore_2        
	//* 148  312:aload_2         
	//* 149  313:ldc1            #239 <String "Unknown scene name: ">
	//* 150  315:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 151  318:pop             
	//* 152  319:aload_2         
	//* 153  320:aload_1         
	//* 154  321:invokeinterface #130 <Method String XmlPullParser.getName()>
	//* 155  326:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 156  329:pop             
	//* 157  330:new             #202 <Class RuntimeException>
	//* 158  333:dup             
	//* 159  334:aload_2         
	//* 160  335:invokevirtual   #61  <Method String StringBuilder.toString()>
	//* 161  338:invokespecial   #205 <Method void RuntimeException(String)>
	//* 162  341:athrow          
	//* 163  342:return          
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset)
	//* 164  343:astore_2        
		{
			xmlpullparser = ((XmlPullParser) (s));
	//  165  344:aload           6
	//  166  346:astore_1        
		}
		  goto _L9
_L8:
		s1 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "targetClass", 0);
		if(s1 != null)
			try
			{
				transition.addTarget(Class.forName(s1));
			}
			// Misplaced declaration of an exception variable
			catch(AttributeSet attributeset)
			{
				xmlpullparser = ((XmlPullParser) (s1));
				break MISSING_BLOCK_LABEL_264;
			}
		typedarray.recycle();
		  goto _L3
_L11:
		typedarray.recycle();
		transition = ((Transition) (new StringBuilder()));
		((StringBuilder) (transition)).append("Could not create ");
		((StringBuilder) (transition)).append(((String) (xmlpullparser)));
		throw new RuntimeException(((StringBuilder) (transition)).toString(), ((Throwable) (attributeset)));
_L6:
		attributeset = ((AttributeSet) (new StringBuilder()));
		((StringBuilder) (attributeset)).append("Unknown scene name: ");
		((StringBuilder) (attributeset)).append(xmlpullparser.getName());
		throw new RuntimeException(((StringBuilder) (attributeset)).toString());
_L2:
		return;
_L9:
		if(true) goto _L11; else goto _L10
	//  167  347:goto            264
_L10:
	}

	private void loadTransition(AttributeSet attributeset, XmlPullParser xmlpullparser, ViewGroup viewgroup, TransitionManager transitionmanager)
		throws android.content.res.Resources.NotFoundException
	{
		TypedArray typedarray = mContext.obtainStyledAttributes(attributeset, Styleable.TRANSITION_MANAGER);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:getstatic       #327 <Field int[] Styleable.TRANSITION_MANAGER>
	//    4    8:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    5   11:astore          8
		int i = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "transition", 2, -1);
	//    6   13:aload           8
	//    7   15:aload_2         
	//    8   16:ldc1            #188 <String "transition">
	//    9   18:iconst_2        
	//   10   19:iconst_m1       
	//   11   20:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   12   23:istore          5
		int j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "fromScene", 0, -1);
	//   13   25:aload           8
	//   14   27:aload_2         
	//   15   28:ldc2            #329 <String "fromScene">
	//   16   31:iconst_0        
	//   17   32:iconst_m1       
	//   18   33:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   19   36:istore          6
		Object obj = null;
	//   20   38:aconst_null     
	//   21   39:astore          7
		if(j < 0)
	//*  22   41:iload           6
	//*  23   43:ifge            51
			attributeset = null;
	//   24   46:aconst_null     
	//   25   47:astore_1        
		else
	//*  26   48:goto            62
			attributeset = ((AttributeSet) (Scene.getSceneForLayout(viewgroup, j, mContext)));
	//   27   51:aload_3         
	//   28   52:iload           6
	//   29   54:aload_0         
	//   30   55:getfield        #35  <Field Context mContext>
	//   31   58:invokestatic    #335 <Method Scene Scene.getSceneForLayout(ViewGroup, int, Context)>
	//   32   61:astore_1        
		j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "toScene", 1, -1);
	//   33   62:aload           8
	//   34   64:aload_2         
	//   35   65:ldc2            #337 <String "toScene">
	//   36   68:iconst_1        
	//   37   69:iconst_m1       
	//   38   70:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   39   73:istore          6
		if(j < 0)
	//*  40   75:iload           6
	//*  41   77:ifge            86
			xmlpullparser = ((XmlPullParser) (obj));
	//   42   80:aload           7
	//   43   82:astore_2        
		else
	//*  44   83:goto            97
			xmlpullparser = ((XmlPullParser) (Scene.getSceneForLayout(viewgroup, j, mContext)));
	//   45   86:aload_3         
	//   46   87:iload           6
	//   47   89:aload_0         
	//   48   90:getfield        #35  <Field Context mContext>
	//   49   93:invokestatic    #335 <Method Scene Scene.getSceneForLayout(ViewGroup, int, Context)>
	//   50   96:astore_2        
		if(i >= 0)
	//*  51   97:iload           5
	//*  52   99:iflt            174
		{
			viewgroup = ((ViewGroup) (inflateTransition(i)));
	//   53  102:aload_0         
	//   54  103:iload           5
	//   55  105:invokevirtual   #340 <Method Transition inflateTransition(int)>
	//   56  108:astore_3        
			if(viewgroup != null)
	//*  57  109:aload_3         
	//*  58  110:ifnull          174
			{
				if(xmlpullparser == null)
	//*  59  113:aload_2         
	//*  60  114:ifnonnull       152
				{
					attributeset = ((AttributeSet) (new StringBuilder()));
	//   61  117:new             #48  <Class StringBuilder>
	//   62  120:dup             
	//   63  121:invokespecial   #49  <Method void StringBuilder()>
	//   64  124:astore_1        
					((StringBuilder) (attributeset)).append("No toScene for transition ID ");
	//   65  125:aload_1         
	//   66  126:ldc2            #342 <String "No toScene for transition ID ">
	//   67  129:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   68  132:pop             
					((StringBuilder) (attributeset)).append(i);
	//   69  133:aload_1         
	//   70  134:iload           5
	//   71  136:invokevirtual   #345 <Method StringBuilder StringBuilder.append(int)>
	//   72  139:pop             
					throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//   73  140:new             #202 <Class RuntimeException>
	//   74  143:dup             
	//   75  144:aload_1         
	//   76  145:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   77  148:invokespecial   #205 <Method void RuntimeException(String)>
	//   78  151:athrow          
				}
				if(attributeset == null)
	//*  79  152:aload_1         
	//*  80  153:ifnonnull       166
					transitionmanager.setTransition(((Scene) (xmlpullparser)), ((Transition) (viewgroup)));
	//   81  156:aload           4
	//   82  158:aload_2         
	//   83  159:aload_3         
	//   84  160:invokevirtual   #349 <Method void TransitionManager.setTransition(Scene, Transition)>
				else
	//*  85  163:goto            174
					transitionmanager.setTransition(((Scene) (attributeset)), ((Scene) (xmlpullparser)), ((Transition) (viewgroup)));
	//   86  166:aload           4
	//   87  168:aload_1         
	//   88  169:aload_2         
	//   89  170:aload_3         
	//   90  171:invokevirtual   #352 <Method void TransitionManager.setTransition(Scene, Scene, Transition)>
			}
		}
		typedarray.recycle();
	//   91  174:aload           8
	//   92  176:invokevirtual   #319 <Method void TypedArray.recycle()>
	//   93  179:return          
	}

	public Transition inflateTransition(int i)
	{
		XmlResourceParser xmlresourceparser = mContext.getResources().getXml(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Context mContext>
	//    2    4:invokevirtual   #356 <Method Resources Context.getResources()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #362 <Method XmlResourceParser Resources.getXml(int)>
	//    5   11:astore_2        
		Transition transition = createTransitionFromXml(((XmlPullParser) (xmlresourceparser)), Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser))), ((Transition) (null)));
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_2         
	//    9   15:invokestatic    #368 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   10   18:aconst_null     
	//   11   19:invokespecial   #231 <Method Transition createTransitionFromXml(XmlPullParser, AttributeSet, Transition)>
	//   12   22:astore_3        
		xmlresourceparser.close();
	//   13   23:aload_2         
	//   14   24:invokeinterface #373 <Method void XmlResourceParser.close()>
		return transition;
	//   15   29:aload_3         
	//   16   30:areturn         
		Object obj;
		obj;
	//   17   31:astore_3        
		break MISSING_BLOCK_LABEL_104;
	//   18   32:goto            104
		obj;
	//   19   35:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #48  <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #49  <Method void StringBuilder()>
	//   23   43:astore          4
		stringbuilder.append(xmlresourceparser.getPositionDescription());
	//   24   45:aload           4
	//   25   47:aload_2         
	//   26   48:invokeinterface #376 <Method String XmlResourceParser.getPositionDescription()>
	//   27   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(": ");
	//   29   57:aload           4
	//   30   59:ldc2            #378 <String ": ">
	//   31   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		stringbuilder.append(((IOException) (obj)).getMessage());
	//   33   66:aload           4
	//   34   68:aload_3         
	//   35   69:invokevirtual   #381 <Method String IOException.getMessage()>
	//   36   72:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		throw new InflateException(stringbuilder.toString(), ((Throwable) (obj)));
	//   38   76:new             #57  <Class InflateException>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   42   85:aload_3         
	//   43   86:invokespecial   #110 <Method void InflateException(String, Throwable)>
	//   44   89:athrow          
		obj;
	//   45   90:astore_3        
		throw new InflateException(((XmlPullParserException) (obj)).getMessage(), ((Throwable) (obj)));
	//   46   91:new             #57  <Class InflateException>
	//   47   94:dup             
	//   48   95:aload_3         
	//   49   96:invokevirtual   #382 <Method String XmlPullParserException.getMessage()>
	//   50   99:aload_3         
	//   51  100:invokespecial   #110 <Method void InflateException(String, Throwable)>
	//   52  103:athrow          
		xmlresourceparser.close();
	//   53  104:aload_2         
	//   54  105:invokeinterface #373 <Method void XmlResourceParser.close()>
		throw obj;
	//   55  110:aload_3         
	//   56  111:athrow          
	}

	public TransitionManager inflateTransitionManager(int i, ViewGroup viewgroup)
	{
		XmlResourceParser xmlresourceparser = mContext.getResources().getXml(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Context mContext>
	//    2    4:invokevirtual   #356 <Method Resources Context.getResources()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #362 <Method XmlResourceParser Resources.getXml(int)>
	//    5   11:astore_3        
		viewgroup = ((ViewGroup) (createTransitionManagerFromXml(((XmlPullParser) (xmlresourceparser)), Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser))), viewgroup)));
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload_3         
	//    9   15:invokestatic    #368 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   10   18:aload_2         
	//   11   19:invokespecial   #386 <Method TransitionManager createTransitionManagerFromXml(XmlPullParser, AttributeSet, ViewGroup)>
	//   12   22:astore_2        
		xmlresourceparser.close();
	//   13   23:aload_3         
	//   14   24:invokeinterface #373 <Method void XmlResourceParser.close()>
		return ((TransitionManager) (viewgroup));
	//   15   29:aload_2         
	//   16   30:areturn         
		viewgroup;
	//   17   31:astore_2        
		break MISSING_BLOCK_LABEL_124;
	//   18   32:goto            124
		viewgroup;
	//   19   35:astore_2        
		Object obj = ((Object) (new StringBuilder()));
	//   20   36:new             #48  <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #49  <Method void StringBuilder()>
	//   23   43:astore          4
		((StringBuilder) (obj)).append(xmlresourceparser.getPositionDescription());
	//   24   45:aload           4
	//   25   47:aload_3         
	//   26   48:invokeinterface #376 <Method String XmlResourceParser.getPositionDescription()>
	//   27   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		((StringBuilder) (obj)).append(": ");
	//   29   57:aload           4
	//   30   59:ldc2            #378 <String ": ">
	//   31   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		((StringBuilder) (obj)).append(((IOException) (viewgroup)).getMessage());
	//   33   66:aload           4
	//   34   68:aload_2         
	//   35   69:invokevirtual   #381 <Method String IOException.getMessage()>
	//   36   72:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		obj = ((Object) (new InflateException(((StringBuilder) (obj)).toString())));
	//   38   76:new             #57  <Class InflateException>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   42   85:invokespecial   #64  <Method void InflateException(String)>
	//   43   88:astore          4
		((InflateException) (obj)).initCause(((Throwable) (viewgroup)));
	//   44   90:aload           4
	//   45   92:aload_2         
	//   46   93:invokevirtual   #390 <Method Throwable InflateException.initCause(Throwable)>
	//   47   96:pop             
		throw obj;
	//   48   97:aload           4
	//   49   99:athrow          
		viewgroup;
	//   50  100:astore_2        
		InflateException inflateexception = new InflateException(((XmlPullParserException) (viewgroup)).getMessage());
	//   51  101:new             #57  <Class InflateException>
	//   52  104:dup             
	//   53  105:aload_2         
	//   54  106:invokevirtual   #382 <Method String XmlPullParserException.getMessage()>
	//   55  109:invokespecial   #64  <Method void InflateException(String)>
	//   56  112:astore          4
		inflateexception.initCause(((Throwable) (viewgroup)));
	//   57  114:aload           4
	//   58  116:aload_2         
	//   59  117:invokevirtual   #390 <Method Throwable InflateException.initCause(Throwable)>
	//   60  120:pop             
		throw inflateexception;
	//   61  121:aload           4
	//   62  123:athrow          
		xmlresourceparser.close();
	//   63  124:aload_3         
	//   64  125:invokeinterface #373 <Method void XmlResourceParser.close()>
		throw viewgroup;
	//   65  130:aload_2         
	//   66  131:athrow          
	}

	private static final ArrayMap CONSTRUCTORS = new ArrayMap();
	private static final Class CONSTRUCTOR_SIGNATURE[] = {
		android/content/Context, android/util/AttributeSet
	};
	private final Context mContext;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #18  <Class Context>
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #20  <Class AttributeSet>
	//    9   13:aastore         
	//   10   14:putstatic       #22  <Field Class[] CONSTRUCTOR_SIGNATURE>
	//   11   17:new             #24  <Class ArrayMap>
	//   12   20:dup             
	//   13   21:invokespecial   #27  <Method void ArrayMap()>
	//   14   24:putstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//*  15   27:return          
	}
}
