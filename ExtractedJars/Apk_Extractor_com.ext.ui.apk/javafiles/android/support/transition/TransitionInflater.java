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
	//*   6   13:ifnonnull       43
			throw new InflateException((new StringBuilder()).append(s).append(" tag must have a 'class' attribute").toString());
	//    7   16:new             #48  <Class InflateException>
	//    8   19:dup             
	//    9   20:new             #50  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #51  <Method void StringBuilder()>
	//   12   27:aload_3         
	//   13   28:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #57  <String " tag must have a 'class' attribute">
	//   15   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   17   39:invokespecial   #64  <Method void InflateException(String)>
	//   18   42:athrow          
		ArrayMap arraymap = CONSTRUCTORS;
	//   19   43:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   20   46:astore          6
		arraymap;
	//   21   48:aload           6
		JVM INSTR monitorenter ;
	//   22   50:monitorenter    
		Constructor constructor = (Constructor)CONSTRUCTORS.get(((Object) (s1)));
	//   23   51:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   24   54:aload           5
	//   25   56:invokevirtual   #68  <Method Object ArrayMap.get(Object)>
	//   26   59:checkcast       #70  <Class Constructor>
	//   27   62:astore          4
		s = ((String) (constructor));
	//   28   64:aload           4
	//   29   66:astore_3        
		if(constructor != null)
			break MISSING_BLOCK_LABEL_122;
	//   30   67:aload           4
	//   31   69:ifnonnull       122
		Class class2 = mContext.getClassLoader().loadClass(s1).asSubclass(class1);
	//   32   72:aload_0         
	//   33   73:getfield        #35  <Field Context mContext>
	//   34   76:invokevirtual   #74  <Method ClassLoader Context.getClassLoader()>
	//   35   79:aload           5
	//   36   81:invokevirtual   #80  <Method Class ClassLoader.loadClass(String)>
	//   37   84:aload_2         
	//   38   85:invokevirtual   #84  <Method Class Class.asSubclass(Class)>
	//   39   88:astore          7
		s = ((String) (constructor));
	//   40   90:aload           4
	//   41   92:astore_3        
		if(class2 == null)
			break MISSING_BLOCK_LABEL_122;
	//   42   93:aload           7
	//   43   95:ifnull          122
		s = ((String) (class2.getConstructor(CONSTRUCTOR_SIGNATURE)));
	//   44   98:aload           7
	//   45  100:getstatic       #22  <Field Class[] CONSTRUCTOR_SIGNATURE>
	//   46  103:invokevirtual   #88  <Method Constructor Class.getConstructor(Class[])>
	//   47  106:astore_3        
		((Constructor) (s)).setAccessible(true);
	//   48  107:aload_3         
	//   49  108:iconst_1        
	//   50  109:invokevirtual   #92  <Method void Constructor.setAccessible(boolean)>
		CONSTRUCTORS.put(((Object) (s1)), ((Object) (s)));
	//   51  112:getstatic       #29  <Field ArrayMap CONSTRUCTORS>
	//   52  115:aload           5
	//   53  117:aload_3         
	//   54  118:invokevirtual   #96  <Method Object ArrayMap.put(Object, Object)>
	//   55  121:pop             
		attributeset = ((AttributeSet) (((Constructor) (s)).newInstance(new Object[] {
			mContext, attributeset
		})));
	//   56  122:aload_3         
	//   57  123:iconst_2        
	//   58  124:anewarray       Object[]
	//   59  127:dup             
	//   60  128:iconst_0        
	//   61  129:aload_0         
	//   62  130:getfield        #35  <Field Context mContext>
	//   63  133:aastore         
	//   64  134:dup             
	//   65  135:iconst_1        
	//   66  136:aload_1         
	//   67  137:aastore         
	//   68  138:invokevirtual   #100 <Method Object Constructor.newInstance(Object[])>
	//   69  141:astore_1        
		arraymap;
	//   70  142:aload           6
		JVM INSTR monitorexit ;
	//   71  144:monitorexit     
		return ((Object) (attributeset));
	//   72  145:aload_1         
	//   73  146:areturn         
		attributeset;
	//   74  147:astore_1        
		arraymap;
	//   75  148:aload           6
		JVM INSTR monitorexit ;
	//   76  150:monitorexit     
		try
		{
			throw attributeset;
	//   77  151:aload_1         
	//   78  152:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset)
	//*  79  153:astore_1        
		{
			throw new InflateException((new StringBuilder()).append("Could not instantiate ").append(((Object) (class1))).append(" class ").append(s1).toString(), ((Throwable) (attributeset)));
	//   80  154:new             #48  <Class InflateException>
	//   81  157:dup             
	//   82  158:new             #50  <Class StringBuilder>
	//   83  161:dup             
	//   84  162:invokespecial   #51  <Method void StringBuilder()>
	//   85  165:ldc1            #102 <String "Could not instantiate ">
	//   86  167:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   87  170:aload_2         
	//   88  171:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   89  174:ldc1            #107 <String " class ">
	//   90  176:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   91  179:aload           5
	//   92  181:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   93  184:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   94  187:aload_1         
	//   95  188:invokespecial   #110 <Method void InflateException(String, Throwable)>
	//   96  191:athrow          
		}
	}

	private Transition createTransitionFromXml(XmlPullParser xmlpullparser, AttributeSet attributeset, Transition transition)
		throws XmlPullParserException, IOException
	{
		Object obj;
		Object obj1;
		int i = xmlpullparser.getDepth();
	//    0    0:aload_1         
	//    1    1:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//    2    6:istore          4
		int j;
		TransitionSet transitionset;
		if(transition instanceof TransitionSet)
	//*   3    8:aload_3         
	//*   4    9:instanceof      #124 <Class TransitionSet>
	//*   5   12:ifeq            143
			transitionset = (TransitionSet)transition;
	//    6   15:aload_3         
	//    7   16:checkcast       #124 <Class TransitionSet>
	//    8   19:astore          8
		else
	//*   9   21:aconst_null     
	//*  10   22:astore          6
	//*  11   24:aload_1         
	//*  12   25:invokeinterface #127 <Method int XmlPullParser.next()>
	//*  13   30:istore          5
	//*  14   32:iload           5
	//*  15   34:iconst_3        
	//*  16   35:icmpne          49
	//*  17   38:aload_1         
	//*  18   39:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//*  19   44:iload           4
	//*  20   46:icmple          618
	//*  21   49:iload           5
	//*  22   51:iconst_1        
	//*  23   52:icmpeq          618
	//*  24   55:iload           5
	//*  25   57:iconst_2        
	//*  26   58:icmpne          24
	//*  27   61:aload_1         
	//*  28   62:invokeinterface #130 <Method String XmlPullParser.getName()>
	//*  29   67:astore          7
	//*  30   69:ldc1            #132 <String "fade">
	//*  31   71:aload           7
	//*  32   73:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  33   76:ifeq            149
	//*  34   79:new             #140 <Class Fade>
	//*  35   82:dup             
	//*  36   83:aload_0         
	//*  37   84:getfield        #35  <Field Context mContext>
	//*  38   87:aload_2         
	//*  39   88:invokespecial   #143 <Method void Fade(Context, AttributeSet)>
	//*  40   91:astore          6
	//*  41   93:aload           6
	//*  42   95:astore          7
	//*  43   97:aload           6
	//*  44   99:ifnull          136
	//*  45  102:aload_1         
	//*  46  103:invokeinterface #147 <Method boolean XmlPullParser.isEmptyElementTag()>
	//*  47  108:ifne            120
	//*  48  111:aload_0         
	//*  49  112:aload_1         
	//*  50  113:aload_2         
	//*  51  114:aload           6
	//*  52  116:invokespecial   #149 <Method Transition createTransitionFromXml(XmlPullParser, AttributeSet, Transition)>
	//*  53  119:pop             
	//*  54  120:aload           8
	//*  55  122:ifnull          600
	//*  56  125:aload           8
	//*  57  127:aload           6
	//*  58  129:invokevirtual   #153 <Method TransitionSet TransitionSet.addTransition(Transition)>
	//*  59  132:pop             
	//*  60  133:aconst_null     
	//*  61  134:astore          7
	//*  62  136:aload           7
	//*  63  138:astore          6
	//*  64  140:goto            24
			transitionset = null;
	//   65  143:aconst_null     
	//   66  144:astore          8
		obj = null;
_L7:
		j = xmlpullparser.next();
		if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
			break MISSING_BLOCK_LABEL_618;
		if(j != 2)
			continue; /* Loop/switch isn't completed */
		obj1 = ((Object) (xmlpullparser.getName()));
		if("fade".equals(obj1))
			obj = ((Object) (new Fade(mContext, attributeset)));
		else
	//*  67  146:goto            21
		if("changeBounds".equals(obj1))
	//*  68  149:ldc1            #155 <String "changeBounds">
	//*  69  151:aload           7
	//*  70  153:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  71  156:ifeq            176
			obj = ((Object) (new ChangeBounds(mContext, attributeset)));
	//   72  159:new             #157 <Class ChangeBounds>
	//   73  162:dup             
	//   74  163:aload_0         
	//   75  164:getfield        #35  <Field Context mContext>
	//   76  167:aload_2         
	//   77  168:invokespecial   #158 <Method void ChangeBounds(Context, AttributeSet)>
	//   78  171:astore          6
		else
	//*  79  173:goto            93
		if("slide".equals(obj1))
	//*  80  176:ldc1            #160 <String "slide">
	//*  81  178:aload           7
	//*  82  180:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  83  183:ifeq            203
			obj = ((Object) (new Slide(mContext, attributeset)));
	//   84  186:new             #162 <Class Slide>
	//   85  189:dup             
	//   86  190:aload_0         
	//   87  191:getfield        #35  <Field Context mContext>
	//   88  194:aload_2         
	//   89  195:invokespecial   #163 <Method void Slide(Context, AttributeSet)>
	//   90  198:astore          6
		else
	//*  91  200:goto            93
		if("explode".equals(obj1))
	//*  92  203:ldc1            #165 <String "explode">
	//*  93  205:aload           7
	//*  94  207:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  95  210:ifeq            230
			obj = ((Object) (new Explode(mContext, attributeset)));
	//   96  213:new             #167 <Class Explode>
	//   97  216:dup             
	//   98  217:aload_0         
	//   99  218:getfield        #35  <Field Context mContext>
	//  100  221:aload_2         
	//  101  222:invokespecial   #168 <Method void Explode(Context, AttributeSet)>
	//  102  225:astore          6
		else
	//* 103  227:goto            93
		if("changeImageTransform".equals(obj1))
	//* 104  230:ldc1            #170 <String "changeImageTransform">
	//* 105  232:aload           7
	//* 106  234:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 107  237:ifeq            257
			obj = ((Object) (new ChangeImageTransform(mContext, attributeset)));
	//  108  240:new             #172 <Class ChangeImageTransform>
	//  109  243:dup             
	//  110  244:aload_0         
	//  111  245:getfield        #35  <Field Context mContext>
	//  112  248:aload_2         
	//  113  249:invokespecial   #173 <Method void ChangeImageTransform(Context, AttributeSet)>
	//  114  252:astore          6
		else
	//* 115  254:goto            93
		if("changeTransform".equals(obj1))
	//* 116  257:ldc1            #175 <String "changeTransform">
	//* 117  259:aload           7
	//* 118  261:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 119  264:ifeq            284
			obj = ((Object) (new ChangeTransform(mContext, attributeset)));
	//  120  267:new             #177 <Class ChangeTransform>
	//  121  270:dup             
	//  122  271:aload_0         
	//  123  272:getfield        #35  <Field Context mContext>
	//  124  275:aload_2         
	//  125  276:invokespecial   #178 <Method void ChangeTransform(Context, AttributeSet)>
	//  126  279:astore          6
		else
	//* 127  281:goto            93
		if("changeClipBounds".equals(obj1))
	//* 128  284:ldc1            #180 <String "changeClipBounds">
	//* 129  286:aload           7
	//* 130  288:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 131  291:ifeq            311
			obj = ((Object) (new ChangeClipBounds(mContext, attributeset)));
	//  132  294:new             #182 <Class ChangeClipBounds>
	//  133  297:dup             
	//  134  298:aload_0         
	//  135  299:getfield        #35  <Field Context mContext>
	//  136  302:aload_2         
	//  137  303:invokespecial   #183 <Method void ChangeClipBounds(Context, AttributeSet)>
	//  138  306:astore          6
		else
	//* 139  308:goto            93
		if("autoTransition".equals(obj1))
	//* 140  311:ldc1            #185 <String "autoTransition">
	//* 141  313:aload           7
	//* 142  315:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 143  318:ifeq            338
			obj = ((Object) (new AutoTransition(mContext, attributeset)));
	//  144  321:new             #187 <Class AutoTransition>
	//  145  324:dup             
	//  146  325:aload_0         
	//  147  326:getfield        #35  <Field Context mContext>
	//  148  329:aload_2         
	//  149  330:invokespecial   #188 <Method void AutoTransition(Context, AttributeSet)>
	//  150  333:astore          6
		else
	//* 151  335:goto            93
		if("changeScroll".equals(obj1))
	//* 152  338:ldc1            #190 <String "changeScroll">
	//* 153  340:aload           7
	//* 154  342:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 155  345:ifeq            365
			obj = ((Object) (new ChangeScroll(mContext, attributeset)));
	//  156  348:new             #192 <Class ChangeScroll>
	//  157  351:dup             
	//  158  352:aload_0         
	//  159  353:getfield        #35  <Field Context mContext>
	//  160  356:aload_2         
	//  161  357:invokespecial   #193 <Method void ChangeScroll(Context, AttributeSet)>
	//  162  360:astore          6
		else
	//* 163  362:goto            93
		if("transitionSet".equals(obj1))
	//* 164  365:ldc1            #195 <String "transitionSet">
	//* 165  367:aload           7
	//* 166  369:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 167  372:ifeq            392
			obj = ((Object) (new TransitionSet(mContext, attributeset)));
	//  168  375:new             #124 <Class TransitionSet>
	//  169  378:dup             
	//  170  379:aload_0         
	//  171  380:getfield        #35  <Field Context mContext>
	//  172  383:aload_2         
	//  173  384:invokespecial   #196 <Method void TransitionSet(Context, AttributeSet)>
	//  174  387:astore          6
		else
	//* 175  389:goto            93
		if("transition".equals(obj1))
	//* 176  392:ldc1            #198 <String "transition">
	//* 177  394:aload           7
	//* 178  396:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 179  399:ifeq            419
			obj = ((Object) ((Transition)createCustom(attributeset, android/support/transition/Transition, "transition")));
	//  180  402:aload_0         
	//  181  403:aload_2         
	//  182  404:ldc1            #200 <Class Transition>
	//  183  406:ldc1            #198 <String "transition">
	//  184  408:invokespecial   #202 <Method Object createCustom(AttributeSet, Class, String)>
	//  185  411:checkcast       #200 <Class Transition>
	//  186  414:astore          6
		else
	//* 187  416:goto            93
		if("targets".equals(obj1))
	//* 188  419:ldc1            #204 <String "targets">
	//* 189  421:aload           7
	//* 190  423:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 191  426:ifeq            439
			getTargetIds(xmlpullparser, attributeset, transition);
	//  192  429:aload_0         
	//  193  430:aload_1         
	//  194  431:aload_2         
	//  195  432:aload_3         
	//  196  433:invokespecial   #208 <Method void getTargetIds(XmlPullParser, AttributeSet, Transition)>
		else
	//* 197  436:goto            93
		if("arcMotion".equals(obj1))
	//* 198  439:ldc1            #210 <String "arcMotion">
	//* 199  441:aload           7
	//* 200  443:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 201  446:ifeq            482
		{
			if(transition == null)
	//* 202  449:aload_3         
	//* 203  450:ifnonnull       463
				throw new RuntimeException("Invalid use of arcMotion element");
	//  204  453:new             #212 <Class RuntimeException>
	//  205  456:dup             
	//  206  457:ldc1            #214 <String "Invalid use of arcMotion element">
	//  207  459:invokespecial   #215 <Method void RuntimeException(String)>
	//  208  462:athrow          
			transition.setPathMotion(((PathMotion) (new ArcMotion(mContext, attributeset))));
	//  209  463:aload_3         
	//  210  464:new             #217 <Class ArcMotion>
	//  211  467:dup             
	//  212  468:aload_0         
	//  213  469:getfield        #35  <Field Context mContext>
	//  214  472:aload_2         
	//  215  473:invokespecial   #218 <Method void ArcMotion(Context, AttributeSet)>
	//  216  476:invokevirtual   #222 <Method void Transition.setPathMotion(PathMotion)>
		} else
	//* 217  479:goto            93
		if("pathMotion".equals(obj1))
	//* 218  482:ldc1            #224 <String "pathMotion">
	//* 219  484:aload           7
	//* 220  486:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 221  489:ifeq            525
		{
			if(transition == null)
	//* 222  492:aload_3         
	//* 223  493:ifnonnull       506
				throw new RuntimeException("Invalid use of pathMotion element");
	//  224  496:new             #212 <Class RuntimeException>
	//  225  499:dup             
	//  226  500:ldc1            #226 <String "Invalid use of pathMotion element">
	//  227  502:invokespecial   #215 <Method void RuntimeException(String)>
	//  228  505:athrow          
			transition.setPathMotion((PathMotion)createCustom(attributeset, android/support/transition/PathMotion, "pathMotion"));
	//  229  506:aload_3         
	//  230  507:aload_0         
	//  231  508:aload_2         
	//  232  509:ldc1            #228 <Class PathMotion>
	//  233  511:ldc1            #224 <String "pathMotion">
	//  234  513:invokespecial   #202 <Method Object createCustom(AttributeSet, Class, String)>
	//  235  516:checkcast       #228 <Class PathMotion>
	//  236  519:invokevirtual   #222 <Method void Transition.setPathMotion(PathMotion)>
		} else
	//* 237  522:goto            93
		if("patternPathMotion".equals(obj1))
	//* 238  525:ldc1            #230 <String "patternPathMotion">
	//* 239  527:aload           7
	//* 240  529:invokevirtual   #138 <Method boolean String.equals(Object)>
	//* 241  532:ifeq            568
		{
			if(transition == null)
	//* 242  535:aload_3         
	//* 243  536:ifnonnull       549
				throw new RuntimeException("Invalid use of patternPathMotion element");
	//  244  539:new             #212 <Class RuntimeException>
	//  245  542:dup             
	//  246  543:ldc1            #232 <String "Invalid use of patternPathMotion element">
	//  247  545:invokespecial   #215 <Method void RuntimeException(String)>
	//  248  548:athrow          
			transition.setPathMotion(((PathMotion) (new PatternPathMotion(mContext, attributeset))));
	//  249  549:aload_3         
	//  250  550:new             #234 <Class PatternPathMotion>
	//  251  553:dup             
	//  252  554:aload_0         
	//  253  555:getfield        #35  <Field Context mContext>
	//  254  558:aload_2         
	//  255  559:invokespecial   #235 <Method void PatternPathMotion(Context, AttributeSet)>
	//  256  562:invokevirtual   #222 <Method void Transition.setPathMotion(PathMotion)>
		} else
	//* 257  565:goto            93
		{
			throw new RuntimeException((new StringBuilder()).append("Unknown scene name: ").append(xmlpullparser.getName()).toString());
	//  258  568:new             #212 <Class RuntimeException>
	//  259  571:dup             
	//  260  572:new             #50  <Class StringBuilder>
	//  261  575:dup             
	//  262  576:invokespecial   #51  <Method void StringBuilder()>
	//  263  579:ldc1            #237 <String "Unknown scene name: ">
	//  264  581:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  265  584:aload_1         
	//  266  585:invokeinterface #130 <Method String XmlPullParser.getName()>
	//  267  590:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  268  593:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  269  596:invokespecial   #215 <Method void RuntimeException(String)>
	//  270  599:athrow          
		}
		obj1 = obj;
		if(obj == null) goto _L2; else goto _L1
_L1:
		if(!xmlpullparser.isEmptyElementTag())
			createTransitionFromXml(xmlpullparser, attributeset, ((Transition) (obj)));
		if(transitionset == null) goto _L4; else goto _L3
_L3:
		transitionset.addTransition(((Transition) (obj)));
		obj1 = null;
_L2:
		obj = obj1;
		continue; /* Loop/switch isn't completed */
_L4:
		obj1 = obj;
	//  271  600:aload           6
	//  272  602:astore          7
		if(transition == null) goto _L2; else goto _L5
	//  273  604:aload_3         
	//  274  605:ifnull          136
_L5:
		throw new InflateException("Could not add transition to another transition.");
	//  275  608:new             #48  <Class InflateException>
	//  276  611:dup             
	//  277  612:ldc1            #239 <String "Could not add transition to another transition.">
	//  278  614:invokespecial   #64  <Method void InflateException(String)>
	//  279  617:athrow          
		return ((Transition) (obj));
	//  280  618:aload           6
	//  281  620:areturn         
		if(true) goto _L7; else goto _L6
_L6:
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
	//   14   33:icmple          137
	//   15   36:iload           5
	//   16   38:iconst_1        
	//   17   39:icmpeq          137
			if(j == 2)
	//*  18   42:iload           5
	//*  19   44:iconst_2        
	//*  20   45:icmpne          11
			{
				String s = xmlpullparser.getName();
	//   21   48:aload_1         
	//   22   49:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   23   54:astore          7
				if(s.equals("transitionManager"))
	//*  24   56:aload           7
	//*  25   58:ldc1            #244 <String "transitionManager">
	//*  26   60:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  27   63:ifeq            78
					transitionmanager = new TransitionManager();
	//   28   66:new             #246 <Class TransitionManager>
	//   29   69:dup             
	//   30   70:invokespecial   #247 <Method void TransitionManager()>
	//   31   73:astore          6
				else
	//*  32   75:goto            11
				if(s.equals("transition") && transitionmanager != null)
	//*  33   78:aload           7
	//*  34   80:ldc1            #198 <String "transition">
	//*  35   82:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*  36   85:ifeq            105
	//*  37   88:aload           6
	//*  38   90:ifnull          105
					loadTransition(attributeset, xmlpullparser, viewgroup, transitionmanager);
	//   39   93:aload_0         
	//   40   94:aload_2         
	//   41   95:aload_1         
	//   42   96:aload_3         
	//   43   97:aload           6
	//   44   99:invokespecial   #251 <Method void loadTransition(AttributeSet, XmlPullParser, ViewGroup, TransitionManager)>
				else
	//*  45  102:goto            11
					throw new RuntimeException((new StringBuilder()).append("Unknown scene name: ").append(xmlpullparser.getName()).toString());
	//   46  105:new             #212 <Class RuntimeException>
	//   47  108:dup             
	//   48  109:new             #50  <Class StringBuilder>
	//   49  112:dup             
	//   50  113:invokespecial   #51  <Method void StringBuilder()>
	//   51  116:ldc1            #237 <String "Unknown scene name: ">
	//   52  118:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   53  121:aload_1         
	//   54  122:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   55  127:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   56  130:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   57  133:invokespecial   #215 <Method void RuntimeException(String)>
	//   58  136:athrow          
			}
		} while(true);
		return transitionmanager;
	//   59  137:aload           6
	//   60  139:areturn         
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
		TypedArray typedarray;
		int j;
		do
		{
			j = xmlpullparser.next();
	//    3    8:aload_1         
	//    4    9:invokeinterface #127 <Method int XmlPullParser.next()>
	//    5   14:istore          5
			if(j == 3 && xmlpullparser.getDepth() <= i || j == 1)
				break MISSING_BLOCK_LABEL_331;
	//    6   16:iload           5
	//    7   18:iconst_3        
	//    8   19:icmpne          33
	//    9   22:aload_1         
	//   10   23:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   11   28:iload           4
	//   12   30:icmple          331
	//   13   33:iload           5
	//   14   35:iconst_1        
	//   15   36:icmpeq          331
		} while(j != 2);
	//   16   39:iload           5
	//   17   41:iconst_2        
	//   18   42:icmpne          8
		if(!xmlpullparser.getName().equals("target"))
			break MISSING_BLOCK_LABEL_299;
	//   19   45:aload_1         
	//   20   46:invokeinterface #130 <Method String XmlPullParser.getName()>
	//   21   51:ldc2            #259 <String "target">
	//   22   54:invokevirtual   #138 <Method boolean String.equals(Object)>
	//   23   57:ifeq            299
		typedarray = mContext.obtainStyledAttributes(attributeset, Styleable.TRANSITION_TARGET);
	//   24   60:aload_0         
	//   25   61:getfield        #35  <Field Context mContext>
	//   26   64:aload_2         
	//   27   65:getstatic       #265 <Field int[] Styleable.TRANSITION_TARGET>
	//   28   68:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   29   71:astore          8
		j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "targetId", 1, 0);
	//   30   73:aload           8
	//   31   75:aload_1         
	//   32   76:ldc2            #271 <String "targetId">
	//   33   79:iconst_1        
	//   34   80:iconst_0        
	//   35   81:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   36   84:istore          5
		if(j == 0)
			break; /* Loop/switch isn't completed */
	//   37   86:iload           5
	//   38   88:ifeq            106
		transition.addTarget(j);
	//   39   91:aload_3         
	//   40   92:iload           5
	//   41   94:invokevirtual   #281 <Method Transition Transition.addTarget(int)>
	//   42   97:pop             
_L3:
		typedarray.recycle();
	//   43   98:aload           8
	//   44  100:invokevirtual   #286 <Method void TypedArray.recycle()>
		if(true) goto _L2; else goto _L1
	//   45  103:goto            8
_L1:
		String s;
		String s1;
		int k = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "excludeId", 2, 0);
	//   46  106:aload           8
	//   47  108:aload_1         
	//   48  109:ldc2            #288 <String "excludeId">
	//   49  112:iconst_2        
	//   50  113:iconst_0        
	//   51  114:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   52  117:istore          5
		if(k != 0)
	//*  53  119:iload           5
	//*  54  121:ifeq            135
		{
			transition.excludeTarget(k, true);
	//   55  124:aload_3         
	//   56  125:iload           5
	//   57  127:iconst_1        
	//   58  128:invokevirtual   #292 <Method Transition Transition.excludeTarget(int, boolean)>
	//   59  131:pop             
		} else
	//*  60  132:goto            98
		{
			s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "targetName", 4);
	//   61  135:aload           8
	//   62  137:aload_1         
	//   63  138:ldc2            #294 <String "targetName">
	//   64  141:iconst_4        
	//   65  142:invokestatic    #298 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   66  145:astore          6
			if(s != null)
	//*  67  147:aload           6
	//*  68  149:ifnull          162
			{
				transition.addTarget(s);
	//   69  152:aload_3         
	//   70  153:aload           6
	//   71  155:invokevirtual   #301 <Method Transition Transition.addTarget(String)>
	//   72  158:pop             
			} else
	//*  73  159:goto            98
			{
				s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "excludeName", 5);
	//   74  162:aload           8
	//   75  164:aload_1         
	//   76  165:ldc2            #303 <String "excludeName">
	//   77  168:iconst_5        
	//   78  169:invokestatic    #298 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   79  172:astore          6
				if(s != null)
	//*  80  174:aload           6
	//*  81  176:ifnull          190
				{
					transition.excludeTarget(s, true);
	//   82  179:aload_3         
	//   83  180:aload           6
	//   84  182:iconst_1        
	//   85  183:invokevirtual   #306 <Method Transition Transition.excludeTarget(String, boolean)>
	//   86  186:pop             
				} else
	//*  87  187:goto            98
				{
label0:
					{
						s1 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "excludeClass", 3);
	//   88  190:aload           8
	//   89  192:aload_1         
	//   90  193:ldc2            #308 <String "excludeClass">
	//   91  196:iconst_3        
	//   92  197:invokestatic    #298 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   93  200:astore          7
						if(s1 == null)
							break label0;
	//   94  202:aload           7
	//   95  204:ifnull          261
						s = s1;
	//   96  207:aload           7
	//   97  209:astore          6
						try
						{
							transition.excludeTarget(Class.forName(s1), true);
	//   98  211:aload_3         
	//   99  212:aload           7
	//  100  214:invokestatic    #311 <Method Class Class.forName(String)>
	//  101  217:iconst_1        
	//  102  218:invokevirtual   #314 <Method Transition Transition.excludeTarget(Class, boolean)>
	//  103  221:pop             
						}
	//* 104  222:goto            98
						// Misplaced declaration of an exception variable
						catch(XmlPullParser xmlpullparser)
	//* 105  225:astore_1        
						{
							typedarray.recycle();
	//  106  226:aload           8
	//  107  228:invokevirtual   #286 <Method void TypedArray.recycle()>
							throw new RuntimeException((new StringBuilder()).append("Could not create ").append(s).toString(), ((Throwable) (xmlpullparser)));
	//  108  231:new             #212 <Class RuntimeException>
	//  109  234:dup             
	//  110  235:new             #50  <Class StringBuilder>
	//  111  238:dup             
	//  112  239:invokespecial   #51  <Method void StringBuilder()>
	//  113  242:ldc2            #316 <String "Could not create ">
	//  114  245:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  115  248:aload           6
	//  116  250:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  117  253:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  118  256:aload_1         
	//  119  257:invokespecial   #317 <Method void RuntimeException(String, Throwable)>
	//  120  260:athrow          
						}
					}
				}
			}
		}
		  goto _L3
		s = s1;
	//  121  261:aload           7
	//  122  263:astore          6
		s1 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "targetClass", 0);
	//  123  265:aload           8
	//  124  267:aload_1         
	//  125  268:ldc2            #319 <String "targetClass">
	//  126  271:iconst_0        
	//  127  272:invokestatic    #298 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//  128  275:astore          7
		if(s1 == null) goto _L3; else goto _L4
	//  129  277:aload           7
	//  130  279:ifnull          98
_L4:
		s = s1;
	//  131  282:aload           7
	//  132  284:astore          6
		transition.addTarget(Class.forName(s1));
	//  133  286:aload_3         
	//  134  287:aload           7
	//  135  289:invokestatic    #311 <Method Class Class.forName(String)>
	//  136  292:invokevirtual   #322 <Method Transition Transition.addTarget(Class)>
	//  137  295:pop             
		  goto _L3
	//* 138  296:goto            98
		throw new RuntimeException((new StringBuilder()).append("Unknown scene name: ").append(xmlpullparser.getName()).toString());
	//  139  299:new             #212 <Class RuntimeException>
	//  140  302:dup             
	//  141  303:new             #50  <Class StringBuilder>
	//  142  306:dup             
	//  143  307:invokespecial   #51  <Method void StringBuilder()>
	//  144  310:ldc1            #237 <String "Unknown scene name: ">
	//  145  312:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  146  315:aload_1         
	//  147  316:invokeinterface #130 <Method String XmlPullParser.getName()>
	//  148  321:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  149  324:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  150  327:invokespecial   #215 <Method void RuntimeException(String)>
	//  151  330:athrow          
	//  152  331:return          
	}

	private void loadTransition(AttributeSet attributeset, XmlPullParser xmlpullparser, ViewGroup viewgroup, TransitionManager transitionmanager)
		throws android.content.res.Resources.NotFoundException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		TypedArray typedarray = mContext.obtainStyledAttributes(attributeset, Styleable.TRANSITION_MANAGER);
	//    2    3:aload_0         
	//    3    4:getfield        #35  <Field Context mContext>
	//    4    7:aload_1         
	//    5    8:getstatic       #327 <Field int[] Styleable.TRANSITION_MANAGER>
	//    6   11:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    7   14:astore          8
		int i = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "transition", 2, -1);
	//    8   16:aload           8
	//    9   18:aload_2         
	//   10   19:ldc1            #198 <String "transition">
	//   11   21:iconst_2        
	//   12   22:iconst_m1       
	//   13   23:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   14   26:istore          5
		int j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "fromScene", 0, -1);
	//   15   28:aload           8
	//   16   30:aload_2         
	//   17   31:ldc2            #329 <String "fromScene">
	//   18   34:iconst_0        
	//   19   35:iconst_m1       
	//   20   36:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   21   39:istore          6
		if(j < 0)
	//*  22   41:iload           6
	//*  23   43:ifge            118
			attributeset = null;
	//   24   46:aconst_null     
	//   25   47:astore_1        
		else
	//*  26   48:aload           8
	//*  27   50:aload_2         
	//*  28   51:ldc2            #331 <String "toScene">
	//*  29   54:iconst_1        
	//*  30   55:iconst_m1       
	//*  31   56:invokestatic    #277 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//*  32   59:istore          6
	//*  33   61:iload           6
	//*  34   63:ifge            132
	//*  35   66:aload           7
	//*  36   68:astore_2        
	//*  37   69:iload           5
	//*  38   71:iflt            157
	//*  39   74:aload_0         
	//*  40   75:iload           5
	//*  41   77:invokevirtual   #334 <Method Transition inflateTransition(int)>
	//*  42   80:astore_3        
	//*  43   81:aload_3         
	//*  44   82:ifnull          157
	//*  45   85:aload_2         
	//*  46   86:ifnonnull       146
	//*  47   89:new             #212 <Class RuntimeException>
	//*  48   92:dup             
	//*  49   93:new             #50  <Class StringBuilder>
	//*  50   96:dup             
	//*  51   97:invokespecial   #51  <Method void StringBuilder()>
	//*  52  100:ldc2            #336 <String "No toScene for transition ID ">
	//*  53  103:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  54  106:iload           5
	//*  55  108:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//*  56  111:invokevirtual   #61  <Method String StringBuilder.toString()>
	//*  57  114:invokespecial   #215 <Method void RuntimeException(String)>
	//*  58  117:athrow          
			attributeset = ((AttributeSet) (Scene.getSceneForLayout(viewgroup, j, mContext)));
	//   59  118:aload_3         
	//   60  119:iload           6
	//   61  121:aload_0         
	//   62  122:getfield        #35  <Field Context mContext>
	//   63  125:invokestatic    #345 <Method Scene Scene.getSceneForLayout(ViewGroup, int, Context)>
	//   64  128:astore_1        
		j = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "toScene", 1, -1);
		if(j < 0)
			xmlpullparser = ((XmlPullParser) (obj));
		else
	//*  65  129:goto            48
			xmlpullparser = ((XmlPullParser) (Scene.getSceneForLayout(viewgroup, j, mContext)));
	//   66  132:aload_3         
	//   67  133:iload           6
	//   68  135:aload_0         
	//   69  136:getfield        #35  <Field Context mContext>
	//   70  139:invokestatic    #345 <Method Scene Scene.getSceneForLayout(ViewGroup, int, Context)>
	//   71  142:astore_2        
		if(i >= 0)
		{
			viewgroup = ((ViewGroup) (inflateTransition(i)));
			if(viewgroup != null)
			{
				if(xmlpullparser == null)
					throw new RuntimeException((new StringBuilder()).append("No toScene for transition ID ").append(i).toString());
	//*  72  143:goto            69
				if(attributeset == null)
	//*  73  146:aload_1         
	//*  74  147:ifnonnull       163
					transitionmanager.setTransition(((Scene) (xmlpullparser)), ((Transition) (viewgroup)));
	//   75  150:aload           4
	//   76  152:aload_2         
	//   77  153:aload_3         
	//   78  154:invokevirtual   #349 <Method void TransitionManager.setTransition(Scene, Transition)>
				else
	//*  79  157:aload           8
	//*  80  159:invokevirtual   #286 <Method void TypedArray.recycle()>
	//*  81  162:return          
					transitionmanager.setTransition(((Scene) (attributeset)), ((Scene) (xmlpullparser)), ((Transition) (viewgroup)));
	//   82  163:aload           4
	//   83  165:aload_1         
	//   84  166:aload_2         
	//   85  167:aload_3         
	//   86  168:invokevirtual   #352 <Method void TransitionManager.setTransition(Scene, Scene, Transition)>
			}
		}
		typedarray.recycle();
	//*  87  171:goto            157
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
	//   11   19:invokespecial   #149 <Method Transition createTransitionFromXml(XmlPullParser, AttributeSet, Transition)>
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
		throw new InflateException(((XmlPullParserException) (obj)).getMessage(), ((Throwable) (obj)));
	//   18   32:new             #48  <Class InflateException>
	//   19   35:dup             
	//   20   36:aload_3         
	//   21   37:invokevirtual   #376 <Method String XmlPullParserException.getMessage()>
	//   22   40:aload_3         
	//   23   41:invokespecial   #110 <Method void InflateException(String, Throwable)>
	//   24   44:athrow          
		obj;
	//   25   45:astore_3        
		xmlresourceparser.close();
	//   26   46:aload_2         
	//   27   47:invokeinterface #373 <Method void XmlResourceParser.close()>
		throw obj;
	//   28   52:aload_3         
	//   29   53:athrow          
		obj;
	//   30   54:astore_3        
		throw new InflateException((new StringBuilder()).append(xmlresourceparser.getPositionDescription()).append(": ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//   31   55:new             #48  <Class InflateException>
	//   32   58:dup             
	//   33   59:new             #50  <Class StringBuilder>
	//   34   62:dup             
	//   35   63:invokespecial   #51  <Method void StringBuilder()>
	//   36   66:aload_2         
	//   37   67:invokeinterface #379 <Method String XmlResourceParser.getPositionDescription()>
	//   38   72:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   39   75:ldc2            #381 <String ": ">
	//   40   78:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:aload_3         
	//   42   82:invokevirtual   #382 <Method String IOException.getMessage()>
	//   43   85:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   45   91:aload_3         
	//   46   92:invokespecial   #110 <Method void InflateException(String, Throwable)>
	//   47   95:athrow          
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
		InflateException inflateexception = new InflateException(((XmlPullParserException) (viewgroup)).getMessage());
	//   18   32:new             #48  <Class InflateException>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:invokevirtual   #376 <Method String XmlPullParserException.getMessage()>
	//   22   40:invokespecial   #64  <Method void InflateException(String)>
	//   23   43:astore          4
		inflateexception.initCause(((Throwable) (viewgroup)));
	//   24   45:aload           4
	//   25   47:aload_2         
	//   26   48:invokevirtual   #390 <Method Throwable InflateException.initCause(Throwable)>
	//   27   51:pop             
		throw inflateexception;
	//   28   52:aload           4
	//   29   54:athrow          
		viewgroup;
	//   30   55:astore_2        
		xmlresourceparser.close();
	//   31   56:aload_3         
	//   32   57:invokeinterface #373 <Method void XmlResourceParser.close()>
		throw viewgroup;
	//   33   62:aload_2         
	//   34   63:athrow          
		viewgroup;
	//   35   64:astore_2        
		InflateException inflateexception1 = new InflateException((new StringBuilder()).append(xmlresourceparser.getPositionDescription()).append(": ").append(((IOException) (viewgroup)).getMessage()).toString());
	//   36   65:new             #48  <Class InflateException>
	//   37   68:dup             
	//   38   69:new             #50  <Class StringBuilder>
	//   39   72:dup             
	//   40   73:invokespecial   #51  <Method void StringBuilder()>
	//   41   76:aload_3         
	//   42   77:invokeinterface #379 <Method String XmlResourceParser.getPositionDescription()>
	//   43   82:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   44   85:ldc2            #381 <String ": ">
	//   45   88:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:aload_2         
	//   47   92:invokevirtual   #382 <Method String IOException.getMessage()>
	//   48   95:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   50  101:invokespecial   #64  <Method void InflateException(String)>
	//   51  104:astore          4
		inflateexception1.initCause(((Throwable) (viewgroup)));
	//   52  106:aload           4
	//   53  108:aload_2         
	//   54  109:invokevirtual   #390 <Method Throwable InflateException.initCause(Throwable)>
	//   55  112:pop             
		throw inflateexception1;
	//   56  113:aload           4
	//   57  115:athrow          
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
