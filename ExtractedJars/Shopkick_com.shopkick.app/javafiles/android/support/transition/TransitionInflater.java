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
			break MISSING_BLOCK_LABEL_175;
	//    5   11:aload           5
	//    6   13:ifnull          175
		ArrayMap arraymap = CONSTRUCTORS;
	//    7   16:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//    8   19:astore          6
		arraymap;
	//    9   21:aload           6
		JVM INSTR monitorenter ;
	//   10   23:monitorenter    
		Constructor constructor = (Constructor)CONSTRUCTORS.get(((Object) (s1)));
	//   11   24:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   12   27:aload           5
	//   13   29:invokevirtual   #50  <Method Object ArrayMap.get(Object)>
	//   14   32:checkcast       #52  <Class Constructor>
	//   15   35:astore          4
		s = ((String) (constructor));
	//   16   37:aload           4
	//   17   39:astore_3        
		if(constructor != null)
			break MISSING_BLOCK_LABEL_95;
	//   18   40:aload           4
	//   19   42:ifnonnull       95
		Class class2 = mContext.getClassLoader().loadClass(s1).asSubclass(class1);
	//   20   45:aload_0         
	//   21   46:getfield        #35  <Field Context mContext>
	//   22   49:invokevirtual   #56  <Method ClassLoader Context.getClassLoader()>
	//   23   52:aload           5
	//   24   54:invokevirtual   #62  <Method Class ClassLoader.loadClass(String)>
	//   25   57:aload_2         
	//   26   58:invokevirtual   #66  <Method Class Class.asSubclass(Class)>
	//   27   61:astore          7
		s = ((String) (constructor));
	//   28   63:aload           4
	//   29   65:astore_3        
		if(class2 == null)
			break MISSING_BLOCK_LABEL_95;
	//   30   66:aload           7
	//   31   68:ifnull          95
		s = ((String) (class2.getConstructor(CONSTRUCTOR_SIGNATURE)));
	//   32   71:aload           7
	//   33   73:getstatic       #22  <Field Class[] CONSTRUCTOR_SIGNATURE>
	//   34   76:invokevirtual   #70  <Method Constructor Class.getConstructor(Class[])>
	//   35   79:astore_3        
		((Constructor) (s)).setAccessible(true);
	//   36   80:aload_3         
	//   37   81:iconst_1        
	//   38   82:invokevirtual   #74  <Method void Constructor.setAccessible(boolean)>
		CONSTRUCTORS.put(((Object) (s1)), ((Object) (s)));
	//   39   85:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   40   88:aload           5
	//   41   90:aload_3         
	//   42   91:invokevirtual   #78  <Method Object ArrayMap.put(Object, Object)>
	//   43   94:pop             
		attributeset = ((AttributeSet) (((Constructor) (s)).newInstance(new Object[] {
			mContext, attributeset
		})));
	//   44   95:aload_3         
	//   45   96:iconst_2        
	//   46   97:anewarray       Object[]
	//   47  100:dup             
	//   48  101:iconst_0        
	//   49  102:aload_0         
	//   50  103:getfield        #35  <Field Context mContext>
	//   51  106:aastore         
	//   52  107:dup             
	//   53  108:iconst_1        
	//   54  109:aload_1         
	//   55  110:aastore         
	//   56  111:invokevirtual   #82  <Method Object Constructor.newInstance(Object[])>
	//   57  114:astore_1        
		arraymap;
	//   58  115:aload           6
		JVM INSTR monitorexit ;
	//   59  117:monitorexit     
		return ((Object) (attributeset));
	//   60  118:aload_1         
	//   61  119:areturn         
		attributeset;
	//   62  120:astore_1        
		arraymap;
	//   63  121:aload           6
		JVM INSTR monitorexit ;
	//   64  123:monitorexit     
		try
		{
			throw attributeset;
	//   65  124:aload_1         
	//   66  125:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset)
	//*  67  126:astore_1        
		{
			s = ((String) (new StringBuilder()));
	//   68  127:new             #84  <Class StringBuilder>
	//   69  130:dup             
	//   70  131:invokespecial   #85  <Method void StringBuilder()>
	//   71  134:astore_3        
		}
		((StringBuilder) (s)).append("Could not instantiate ");
	//   72  135:aload_3         
	//   73  136:ldc1            #87  <String "Could not instantiate ">
	//   74  138:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   75  141:pop             
		((StringBuilder) (s)).append(((Object) (class1)));
	//   76  142:aload_3         
	//   77  143:aload_2         
	//   78  144:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   79  147:pop             
		((StringBuilder) (s)).append(" class ");
	//   80  148:aload_3         
	//   81  149:ldc1            #96  <String " class ">
	//   82  151:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   83  154:pop             
		((StringBuilder) (s)).append(s1);
	//   84  155:aload_3         
	//   85  156:aload           5
	//   86  158:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   87  161:pop             
		throw new InflateException(((StringBuilder) (s)).toString(), ((Throwable) (attributeset)));
	//   88  162:new             #98  <Class InflateException>
	//   89  165:dup             
	//   90  166:aload_3         
	//   91  167:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   92  170:aload_1         
	//   93  171:invokespecial   #105 <Method void InflateException(String, Throwable)>
	//   94  174:athrow          
		attributeset = ((AttributeSet) (new StringBuilder()));
	//   95  175:new             #84  <Class StringBuilder>
	//   96  178:dup             
	//   97  179:invokespecial   #85  <Method void StringBuilder()>
	//   98  182:astore_1        
		((StringBuilder) (attributeset)).append(s);
	//   99  183:aload_1         
	//  100  184:aload_3         
	//  101  185:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  102  188:pop             
		((StringBuilder) (attributeset)).append(" tag must have a 'class' attribute");
	//  103  189:aload_1         
	//  104  190:ldc1            #107 <String " tag must have a 'class' attribute">
	//  105  192:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  106  195:pop             
		throw new InflateException(((StringBuilder) (attributeset)).toString());
	//  107  196:new             #98  <Class InflateException>
	//  108  199:dup             
	//  109  200:aload_1         
	//  110  201:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  111  204:invokespecial   #110 <Method void InflateException(String)>
	//  112  207:athrow          
	}

	private Transition createTransitionFromXml(XmlPullParser xmlpullparser, AttributeSet attributeset, Transition transition)
		throws XmlPullParserException, IOException
	{
		Object obj1;
label0:
		{
label1:
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
	//    8   19:astore          8
				else
	//*   9   21:goto            27
					transitionset = null;
	//   10   24:aconst_null     
	//   11   25:astore          8
				obj1 = null;
	//   12   27:aconst_null     
	//   13   28:astore          7
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
							break label0;
	//   17   38:iload           5
	//   18   40:iconst_3        
	//   19   41:icmpne          55
	//   20   44:aload_1         
	//   21   45:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   22   50:iload           4
	//   23   52:icmple          642
	//   24   55:iload           5
	//   25   57:iconst_1        
	//   26   58:icmpeq          642
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
	//*  45  102:goto            527
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
	//*  57  129:goto            527
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
	//*  69  156:goto            527
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
	//*  81  183:goto            527
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
	//*  93  210:goto            527
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
	//* 105  237:goto            527
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
	//* 117  264:goto            527
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
	//* 129  291:goto            527
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
	//* 141  318:goto            527
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
	//* 153  345:goto            527
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
	//* 165  372:goto            527
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
	//  175  392:aload           7
	//  176  394:astore          6
					} else
	//* 177  396:goto            527
					if("arcMotion".equals(obj))
	//* 178  399:ldc1            #200 <String "arcMotion">
	//* 179  401:aload           6
	//* 180  403:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 181  406:ifeq            446
					{
						if(transition != null)
	//* 182  409:aload_3         
	//* 183  410:ifnull          436
						{
							transition.setPathMotion(((PathMotion) (new ArcMotion(mContext, attributeset))));
	//  184  413:aload_3         
	//  185  414:new             #202 <Class ArcMotion>
	//  186  417:dup             
	//  187  418:aload_0         
	//  188  419:getfield        #35  <Field Context mContext>
	//  189  422:aload_2         
	//  190  423:invokespecial   #203 <Method void ArcMotion(Context, AttributeSet)>
	//  191  426:invokevirtual   #207 <Method void Transition.setPathMotion(PathMotion)>
							obj = obj1;
	//  192  429:aload           7
	//  193  431:astore          6
						} else
	//* 194  433:goto            527
						{
							throw new RuntimeException("Invalid use of arcMotion element");
	//  195  436:new             #209 <Class RuntimeException>
	//  196  439:dup             
	//  197  440:ldc1            #211 <String "Invalid use of arcMotion element">
	//  198  442:invokespecial   #212 <Method void RuntimeException(String)>
	//  199  445:athrow          
						}
					} else
					if("pathMotion".equals(obj))
	//* 200  446:ldc1            #214 <String "pathMotion">
	//* 201  448:aload           6
	//* 202  450:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 203  453:ifeq            493
					{
						if(transition != null)
	//* 204  456:aload_3         
	//* 205  457:ifnull          483
						{
							transition.setPathMotion((PathMotion)createCustom(attributeset, android/support/transition/PathMotion, "pathMotion"));
	//  206  460:aload_3         
	//  207  461:aload_0         
	//  208  462:aload_2         
	//  209  463:ldc1            #216 <Class PathMotion>
	//  210  465:ldc1            #214 <String "pathMotion">
	//  211  467:invokespecial   #192 <Method Object createCustom(AttributeSet, Class, String)>
	//  212  470:checkcast       #216 <Class PathMotion>
	//  213  473:invokevirtual   #207 <Method void Transition.setPathMotion(PathMotion)>
							obj = obj1;
	//  214  476:aload           7
	//  215  478:astore          6
						} else
	//* 216  480:goto            527
						{
							throw new RuntimeException("Invalid use of pathMotion element");
	//  217  483:new             #209 <Class RuntimeException>
	//  218  486:dup             
	//  219  487:ldc1            #218 <String "Invalid use of pathMotion element">
	//  220  489:invokespecial   #212 <Method void RuntimeException(String)>
	//  221  492:athrow          
						}
					} else
					{
						if(!"patternPathMotion".equals(obj))
							break label1;
	//  222  493:ldc1            #220 <String "patternPathMotion">
	//  223  495:aload           6
	//  224  497:invokevirtual   #138 <Method boolean String.equals(Object)>
	//  225  500:ifeq            604
						if(transition == null)
							break;
	//  226  503:aload_3         
	//  227  504:ifnull          594
						transition.setPathMotion(((PathMotion) (new PatternPathMotion(mContext, attributeset))));
	//  228  507:aload_3         
	//  229  508:new             #222 <Class PatternPathMotion>
	//  230  511:dup             
	//  231  512:aload_0         
	//  232  513:getfield        #35  <Field Context mContext>
	//  233  516:aload_2         
	//  234  517:invokespecial   #223 <Method void PatternPathMotion(Context, AttributeSet)>
	//  235  520:invokevirtual   #207 <Method void Transition.setPathMotion(PathMotion)>
						obj = obj1;
	//  236  523:aload           7
	//  237  525:astore          6
					}
					obj1 = obj;
	//  238  527:aload           6
	//  239  529:astore          7
					if(obj != null)
	//* 240  531:aload           6
	//* 241  533:ifnull          30
					{
						if(!xmlpullparser.isEmptyElementTag())
	//* 242  536:aload_1         
	//* 243  537:invokeinterface #227 <Method boolean XmlPullParser.isEmptyElementTag()>
	//* 244  542:ifne            554
							createTransitionFromXml(xmlpullparser, attributeset, ((Transition) (obj)));
	//  245  545:aload_0         
	//  246  546:aload_1         
	//  247  547:aload_2         
	//  248  548:aload           6
	//  249  550:invokespecial   #229 <Method Transition createTransitionFromXml(XmlPullParser, AttributeSet, Transition)>
	//  250  553:pop             
						if(transitionset != null)
	//* 251  554:aload           8
	//* 252  556:ifnull          573
						{
							transitionset.addTransition(((Transition) (obj)));
	//  253  559:aload           8
	//  254  561:aload           6
	//  255  563:invokevirtual   #233 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//  256  566:pop             
							obj1 = null;
	//  257  567:aconst_null     
	//  258  568:astore          7
						} else
	//* 259  570:goto            30
						if(transition == null)
	//* 260  573:aload_3         
	//* 261  574:ifnonnull       584
							obj1 = obj;
	//  262  577:aload           6
	//  263  579:astore          7
						else
	//* 264  581:goto            30
							throw new InflateException("Could not add transition to another transition.");
	//  265  584:new             #98  <Class InflateException>
	//  266  587:dup             
	//  267  588:ldc1            #235 <String "Could not add transition to another transition.">
	//  268  590:invokespecial   #110 <Method void InflateException(String)>
	//  269  593:athrow          
					}
				} while(true);
				throw new RuntimeException("Invalid use of patternPathMotion element");
	//  270  594:new             #209 <Class RuntimeException>
	//  271  597:dup             
	//  272  598:ldc1            #237 <String "Invalid use of patternPathMotion element">
	//  273  600:invokespecial   #212 <Method void RuntimeException(String)>
	//  274  603:athrow          
			}
			attributeset = ((AttributeSet) (new StringBuilder()));
	//  275  604:new             #84  <Class StringBuilder>
	//  276  607:dup             
	//  277  608:invokespecial   #85  <Method void StringBuilder()>
	//  278  611:astore_2        
			((StringBuilder) (attributeset)).append("Unknown scene name: ");
	//  279  612:aload_2         
	//  280  613:ldc1            #239 <String "Unknown scene name: ">
	//  281  615:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  282  618:pop             
			((StringBuilder) (attributeset)).append(xmlpullparser.getName());
	//  283  619:aload_2         
	//  284  620:aload_1         
	//  285  621:invokeinterface #130 <Method String XmlPullParser.getName()>
	//  286  626:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  287  629:pop             
			throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//  288  630:new             #209 <Class RuntimeException>
	//  289  633:dup             
	//  290  634:aload_2         
	//  291  635:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  292  638:invokespecial   #212 <Method void RuntimeException(String)>
	//  293  641:athrow          
		}
		return ((Transition) (obj1));
	//  294  642:aload           7
	//  295  644:areturn         
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
	//   47  108:new             #84  <Class StringBuilder>
	//   48  111:dup             
	//   49  112:invokespecial   #85  <Method void StringBuilder()>
	//   50  115:astore_2        
					((StringBuilder) (attributeset)).append("Unknown scene name: ");
	//   51  116:aload_2         
	//   52  117:ldc1            #239 <String "Unknown scene name: ">
	//   53  119:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   54  122:pop             
					((StringBuilder) (attributeset)).append(xmlpullparser.getName());
	//   55  123:aload_2         
	//   56  124:aload_1         
	//   57  125:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   58  130:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   59  133:pop             
					throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//   60  134:new             #209 <Class RuntimeException>
	//   61  137:dup             
	//   62  138:aload_2         
	//   63  139:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   64  142:invokespecial   #212 <Method void RuntimeException(String)>
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
_L2:
		int j;
		do
		{
			j = xmlpullparser.next();
	//    3    8:aload_1         
	//    4    9:invokeinterface #127 <Method int XmlPullParser.next()>
	//    5   14:istore          5
			if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
				break MISSING_BLOCK_LABEL_346;
	//    6   16:iload           5
	//    7   18:iconst_3        
	//    8   19:icmpne          33
	//    9   22:aload_1         
	//   10   23:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   11   28:iload           4
	//   12   30:icmple          346
	//   13   33:iload           5
	//   14   35:iconst_1        
	//   15   36:icmpeq          346
		} while(j != 2);
	//   16   39:iload           5
	//   17   41:iconst_2        
	//   18   42:icmpeq          48
	//*  19   45:goto            8
		if(!xmlpullparser.getName().equals("target"))
			break; /* Loop/switch isn't completed */
	//   20   48:aload_1         
	//   21   49:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   22   54:ldc2            #259 <String "target">
	//   23   57:invokevirtual   #138 <Method boolean String.equals(Object)>
	//   24   60:ifeq            308
		TypedArray typedarray = mContext.obtainStyledAttributes(attributeset, Styleable.TRANSITION_TARGET);
	//   25   63:aload_0         
	//   26   64:getfield        #35  <Field Context mContext>
	//   27   67:aload_2         
	//   28   68:getstatic       #265 <Field int[] Styleable.TRANSITION_TARGET>
	//   29   71:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   30   74:astore          8
		j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "targetId", 1, 0);
	//   31   76:aload           8
	//   32   78:aload_1         
	//   33   79:ldc2            #271 <String "targetId">
	//   34   82:iconst_1        
	//   35   83:iconst_0        
	//   36   84:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   37   87:istore          5
		if(j != 0)
	//*  38   89:iload           5
	//*  39   91:ifeq            104
		{
			transition.addTarget(j);
	//   40   94:aload_3         
	//   41   95:iload           5
	//   42   97:invokevirtual   #281 <Method Transition Transition.addTarget(int)>
	//   43  100:pop             
			break MISSING_BLOCK_LABEL_258;
	//   44  101:goto            258
		}
		j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "excludeId", 2, 0);
	//   45  104:aload           8
	//   46  106:aload_1         
	//   47  107:ldc2            #283 <String "excludeId">
	//   48  110:iconst_2        
	//   49  111:iconst_0        
	//   50  112:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   51  115:istore          5
		if(j != 0)
	//*  52  117:iload           5
	//*  53  119:ifeq            133
		{
			transition.excludeTarget(j, true);
	//   54  122:aload_3         
	//   55  123:iload           5
	//   56  125:iconst_1        
	//   57  126:invokevirtual   #287 <Method Transition Transition.excludeTarget(int, boolean)>
	//   58  129:pop             
			break MISSING_BLOCK_LABEL_258;
	//   59  130:goto            258
		}
		String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "targetName", 4);
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
			break MISSING_BLOCK_LABEL_258;
	//   72  157:goto            258
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
			break MISSING_BLOCK_LABEL_258;
	//   86  185:goto            258
		}
		String s2 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "excludeClass", 3);
	//   87  188:aload           8
	//   88  190:aload_1         
	//   89  191:ldc2            #303 <String "excludeClass">
	//   90  194:iconst_3        
	//   91  195:invokestatic    #293 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   92  198:astore          7
		if(s2 != null)
	//*  93  200:aload           7
	//*  94  202:ifnull          223
		{
			String s1 = s2;
	//   95  205:aload           7
	//   96  207:astore          6
			try
			{
				transition.excludeTarget(Class.forName(s2), true);
	//   97  209:aload_3         
	//   98  210:aload           7
	//   99  212:invokestatic    #306 <Method Class Class.forName(String)>
	//  100  215:iconst_1        
	//  101  216:invokevirtual   #309 <Method Transition Transition.excludeTarget(Class, boolean)>
	//  102  219:pop             
			}
	//* 103  220:goto            258
	//* 104  223:aload           7
	//* 105  225:astore          6
	//* 106  227:aload           8
	//* 107  229:aload_1         
	//* 108  230:ldc2            #311 <String "targetClass">
	//* 109  233:iconst_0        
	//* 110  234:invokestatic    #293 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//* 111  237:astore          7
	//* 112  239:aload           7
	//* 113  241:ifnull          258
	//* 114  244:aload           7
	//* 115  246:astore          6
	//* 116  248:aload_3         
	//* 117  249:aload           7
	//* 118  251:invokestatic    #306 <Method Class Class.forName(String)>
	//* 119  254:invokevirtual   #314 <Method Transition Transition.addTarget(Class)>
	//* 120  257:pop             
	//* 121  258:aload           8
	//* 122  260:invokevirtual   #319 <Method void TypedArray.recycle()>
	//* 123  263:goto            8
			// Misplaced declaration of an exception variable
			catch(XmlPullParser xmlpullparser)
	//* 124  266:astore_1        
			{
				typedarray.recycle();
	//  125  267:aload           8
	//  126  269:invokevirtual   #319 <Method void TypedArray.recycle()>
				attributeset = ((AttributeSet) (new StringBuilder()));
	//  127  272:new             #84  <Class StringBuilder>
	//  128  275:dup             
	//  129  276:invokespecial   #85  <Method void StringBuilder()>
	//  130  279:astore_2        
				((StringBuilder) (attributeset)).append("Could not create ");
	//  131  280:aload_2         
	//  132  281:ldc2            #321 <String "Could not create ">
	//  133  284:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  134  287:pop             
				((StringBuilder) (attributeset)).append(s1);
	//  135  288:aload_2         
	//  136  289:aload           6
	//  137  291:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  138  294:pop             
				throw new RuntimeException(((StringBuilder) (attributeset)).toString(), ((Throwable) (xmlpullparser)));
	//  139  295:new             #209 <Class RuntimeException>
	//  140  298:dup             
	//  141  299:aload_2         
	//  142  300:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  143  303:aload_1         
	//  144  304:invokespecial   #322 <Method void RuntimeException(String, Throwable)>
	//  145  307:athrow          
			}
			break MISSING_BLOCK_LABEL_258;
		}
		s1 = s2;
		s2 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "targetClass", 0);
		if(s2 == null)
			break MISSING_BLOCK_LABEL_258;
		s1 = s2;
		transition.addTarget(Class.forName(s2));
		typedarray.recycle();
		if(true) goto _L2; else goto _L1
_L1:
		attributeset = ((AttributeSet) (new StringBuilder()));
	//  146  308:new             #84  <Class StringBuilder>
	//  147  311:dup             
	//  148  312:invokespecial   #85  <Method void StringBuilder()>
	//  149  315:astore_2        
		((StringBuilder) (attributeset)).append("Unknown scene name: ");
	//  150  316:aload_2         
	//  151  317:ldc1            #239 <String "Unknown scene name: ">
	//  152  319:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  153  322:pop             
		((StringBuilder) (attributeset)).append(xmlpullparser.getName());
	//  154  323:aload_2         
	//  155  324:aload_1         
	//  156  325:invokeinterface #130 <Method String XmlPullParser.getName()>
	//  157  330:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  158  333:pop             
		throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//  159  334:new             #209 <Class RuntimeException>
	//  160  337:dup             
	//  161  338:aload_2         
	//  162  339:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  163  342:invokespecial   #212 <Method void RuntimeException(String)>
	//  164  345:athrow          
	//  165  346:return          
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
	//*  52   99:iflt            177
		{
			viewgroup = ((ViewGroup) (inflateTransition(i)));
	//   53  102:aload_0         
	//   54  103:iload           5
	//   55  105:invokevirtual   #340 <Method Transition inflateTransition(int)>
	//   56  108:astore_3        
			if(viewgroup != null)
	//*  57  109:aload_3         
	//*  58  110:ifnull          177
				if(xmlpullparser != null)
	//*  59  113:aload_2         
	//*  60  114:ifnull          142
				{
					if(attributeset == null)
	//*  61  117:aload_1         
	//*  62  118:ifnonnull       131
						transitionmanager.setTransition(((Scene) (xmlpullparser)), ((Transition) (viewgroup)));
	//   63  121:aload           4
	//   64  123:aload_2         
	//   65  124:aload_3         
	//   66  125:invokevirtual   #344 <Method void TransitionManager.setTransition(Scene, Transition)>
					else
	//*  67  128:goto            177
						transitionmanager.setTransition(((Scene) (attributeset)), ((Scene) (xmlpullparser)), ((Transition) (viewgroup)));
	//   68  131:aload           4
	//   69  133:aload_1         
	//   70  134:aload_2         
	//   71  135:aload_3         
	//   72  136:invokevirtual   #347 <Method void TransitionManager.setTransition(Scene, Scene, Transition)>
				} else
	//*  73  139:goto            177
				{
					attributeset = ((AttributeSet) (new StringBuilder()));
	//   74  142:new             #84  <Class StringBuilder>
	//   75  145:dup             
	//   76  146:invokespecial   #85  <Method void StringBuilder()>
	//   77  149:astore_1        
					((StringBuilder) (attributeset)).append("No toScene for transition ID ");
	//   78  150:aload_1         
	//   79  151:ldc2            #349 <String "No toScene for transition ID ">
	//   80  154:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   81  157:pop             
					((StringBuilder) (attributeset)).append(i);
	//   82  158:aload_1         
	//   83  159:iload           5
	//   84  161:invokevirtual   #352 <Method StringBuilder StringBuilder.append(int)>
	//   85  164:pop             
					throw new RuntimeException(((StringBuilder) (attributeset)).toString());
	//   86  165:new             #209 <Class RuntimeException>
	//   87  168:dup             
	//   88  169:aload_1         
	//   89  170:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   90  173:invokespecial   #212 <Method void RuntimeException(String)>
	//   91  176:athrow          
				}
		}
		typedarray.recycle();
	//   92  177:aload           8
	//   93  179:invokevirtual   #319 <Method void TypedArray.recycle()>
	//   94  182:return          
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
	//   11   19:invokespecial   #229 <Method Transition createTransitionFromXml(XmlPullParser, AttributeSet, Transition)>
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
	//   20   36:new             #84  <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #85  <Method void StringBuilder()>
	//   23   43:astore          4
		stringbuilder.append(xmlresourceparser.getPositionDescription());
	//   24   45:aload           4
	//   25   47:aload_2         
	//   26   48:invokeinterface #376 <Method String XmlResourceParser.getPositionDescription()>
	//   27   53:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(": ");
	//   29   57:aload           4
	//   30   59:ldc2            #378 <String ": ">
	//   31   62:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		stringbuilder.append(((IOException) (obj)).getMessage());
	//   33   66:aload           4
	//   34   68:aload_3         
	//   35   69:invokevirtual   #381 <Method String IOException.getMessage()>
	//   36   72:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		throw new InflateException(stringbuilder.toString(), ((Throwable) (obj)));
	//   38   76:new             #98  <Class InflateException>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   42   85:aload_3         
	//   43   86:invokespecial   #105 <Method void InflateException(String, Throwable)>
	//   44   89:athrow          
		obj;
	//   45   90:astore_3        
		throw new InflateException(((XmlPullParserException) (obj)).getMessage(), ((Throwable) (obj)));
	//   46   91:new             #98  <Class InflateException>
	//   47   94:dup             
	//   48   95:aload_3         
	//   49   96:invokevirtual   #382 <Method String XmlPullParserException.getMessage()>
	//   50   99:aload_3         
	//   51  100:invokespecial   #105 <Method void InflateException(String, Throwable)>
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
	//   20   36:new             #84  <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #85  <Method void StringBuilder()>
	//   23   43:astore          4
		((StringBuilder) (obj)).append(xmlresourceparser.getPositionDescription());
	//   24   45:aload           4
	//   25   47:aload_3         
	//   26   48:invokeinterface #376 <Method String XmlResourceParser.getPositionDescription()>
	//   27   53:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		((StringBuilder) (obj)).append(": ");
	//   29   57:aload           4
	//   30   59:ldc2            #378 <String ": ">
	//   31   62:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		((StringBuilder) (obj)).append(((IOException) (viewgroup)).getMessage());
	//   33   66:aload           4
	//   34   68:aload_2         
	//   35   69:invokevirtual   #381 <Method String IOException.getMessage()>
	//   36   72:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		obj = ((Object) (new InflateException(((StringBuilder) (obj)).toString())));
	//   38   76:new             #98  <Class InflateException>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   42   85:invokespecial   #110 <Method void InflateException(String)>
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
	//   51  101:new             #98  <Class InflateException>
	//   52  104:dup             
	//   53  105:aload_2         
	//   54  106:invokevirtual   #382 <Method String XmlPullParserException.getMessage()>
	//   55  109:invokespecial   #110 <Method void InflateException(String)>
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
