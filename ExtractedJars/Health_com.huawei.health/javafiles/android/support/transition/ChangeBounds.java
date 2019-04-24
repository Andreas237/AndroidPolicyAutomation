// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import o.*;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues

public class ChangeBounds extends Transition
{

	public ChangeBounds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Transition()>
		mTempLocation = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #51  <Field int[] mTempLocation>
		mResizeClip = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #53  <Field boolean mResizeClip>
		mReparent = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #55  <Field boolean mReparent>
	//   12   21:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #63  <Field View TransitionValues.view>
	//    2    4:astore_2        
		transitionvalues.values.put("android:changeBounds:bounds", ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//    3    5:aload_1         
	//    4    6:getfield        #67  <Field Map TransitionValues.values>
	//    5    9:ldc1            #16  <String "android:changeBounds:bounds">
	//    6   11:new             #69  <Class Rect>
	//    7   14:dup             
	//    8   15:aload_2         
	//    9   16:invokevirtual   #75  <Method int View.getLeft()>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #78  <Method int View.getTop()>
	//   12   23:aload_2         
	//   13   24:invokevirtual   #81  <Method int View.getRight()>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #84  <Method int View.getBottom()>
	//   16   31:invokespecial   #87  <Method void Rect(int, int, int, int)>
	//   17   34:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   18   39:pop             
		transitionvalues.values.put("android:changeBounds:parent", ((Object) (transitionvalues.view.getParent())));
	//   19   40:aload_1         
	//   20   41:getfield        #67  <Field Map TransitionValues.values>
	//   21   44:ldc1            #19  <String "android:changeBounds:parent">
	//   22   46:aload_1         
	//   23   47:getfield        #63  <Field View TransitionValues.view>
	//   24   50:invokevirtual   #97  <Method android.view.ViewParent View.getParent()>
	//   25   53:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   26   58:pop             
		transitionvalues.view.getLocationInWindow(mTempLocation);
	//   27   59:aload_1         
	//   28   60:getfield        #63  <Field View TransitionValues.view>
	//   29   63:aload_0         
	//   30   64:getfield        #51  <Field int[] mTempLocation>
	//   31   67:invokevirtual   #101 <Method void View.getLocationInWindow(int[])>
		transitionvalues.values.put("android:changeBounds:windowX", ((Object) (Integer.valueOf(mTempLocation[0]))));
	//   32   70:aload_1         
	//   33   71:getfield        #67  <Field Map TransitionValues.values>
	//   34   74:ldc1            #22  <String "android:changeBounds:windowX">
	//   35   76:aload_0         
	//   36   77:getfield        #51  <Field int[] mTempLocation>
	//   37   80:iconst_0        
	//   38   81:iaload          
	//   39   82:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   40   85:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   41   90:pop             
		transitionvalues.values.put("android:changeBounds:windowY", ((Object) (Integer.valueOf(mTempLocation[1]))));
	//   42   91:aload_1         
	//   43   92:getfield        #67  <Field Map TransitionValues.values>
	//   44   95:ldc1            #25  <String "android:changeBounds:windowY">
	//   45   97:aload_0         
	//   46   98:getfield        #51  <Field int[] mTempLocation>
	//   47  101:iconst_1        
	//   48  102:iaload          
	//   49  103:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   50  106:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   51  111:pop             
	//   52  112:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
label0:
		{
			Object obj;
label1:
			{
				float f;
				float f1;
				int l;
				int j1;
				int l1;
				int j2;
				int k2;
				int l2;
				int i3;
label2:
				{
					if(transitionvalues == null || transitionvalues1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
						return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
					Object obj1 = ((Object) (transitionvalues.values));
	//    6   10:aload_2         
	//    7   11:getfield        #67  <Field Map TransitionValues.values>
	//    8   14:astore          22
					obj = ((Object) (transitionvalues1.values));
	//    9   16:aload_3         
	//   10   17:getfield        #67  <Field Map TransitionValues.values>
	//   11   20:astore          21
					obj1 = ((Object) ((ViewGroup)((Map) (obj1)).get("android:changeBounds:parent")));
	//   12   22:aload           22
	//   13   24:ldc1            #19  <String "android:changeBounds:parent">
	//   14   26:invokeinterface #120 <Method Object Map.get(Object)>
	//   15   31:checkcast       #122 <Class ViewGroup>
	//   16   34:astore          22
					ViewGroup viewgroup1 = (ViewGroup)((Map) (obj)).get("android:changeBounds:parent");
	//   17   36:aload           21
	//   18   38:ldc1            #19  <String "android:changeBounds:parent">
	//   19   40:invokeinterface #120 <Method Object Map.get(Object)>
	//   20   45:checkcast       #122 <Class ViewGroup>
	//   21   48:astore          23
					if(obj1 == null || viewgroup1 == null)
	//*  22   50:aload           22
	//*  23   52:ifnull          60
	//*  24   55:aload           23
	//*  25   57:ifnonnull       62
						return null;
	//   26   60:aconst_null     
	//   27   61:areturn         
					obj = ((Object) (transitionvalues1.view));
	//   28   62:aload_3         
	//   29   63:getfield        #63  <Field View TransitionValues.view>
	//   30   66:astore          21
					int i;
					if(obj1 == viewgroup1 || ((ViewGroup) (obj1)).getId() == viewgroup1.getId())
	//*  31   68:aload           22
	//*  32   70:aload           23
	//*  33   72:if_acmpeq       88
	//*  34   75:aload           22
	//*  35   77:invokevirtual   #125 <Method int ViewGroup.getId()>
	//*  36   80:aload           23
	//*  37   82:invokevirtual   #125 <Method int ViewGroup.getId()>
	//*  38   85:icmpne          94
						i = 1;
	//   39   88:iconst_1        
	//   40   89:istore          6
					else
	//*  41   91:goto            97
						i = 0;
	//   42   94:iconst_0        
	//   43   95:istore          6
					if(mReparent && !i)
						break label1;
	//   44   97:aload_0         
	//   45   98:getfield        #55  <Field boolean mReparent>
	//   46  101:ifeq            109
	//   47  104:iload           6
	//   48  106:ifeq            923
					viewgroup = ((ViewGroup) ((Rect)transitionvalues.values.get("android:changeBounds:bounds")));
	//   49  109:aload_2         
	//   50  110:getfield        #67  <Field Map TransitionValues.values>
	//   51  113:ldc1            #16  <String "android:changeBounds:bounds">
	//   52  115:invokeinterface #120 <Method Object Map.get(Object)>
	//   53  120:checkcast       #69  <Class Rect>
	//   54  123:astore_1        
					transitionvalues = ((TransitionValues) ((Rect)transitionvalues1.values.get("android:changeBounds:bounds")));
	//   55  124:aload_3         
	//   56  125:getfield        #67  <Field Map TransitionValues.values>
	//   57  128:ldc1            #16  <String "android:changeBounds:bounds">
	//   58  130:invokeinterface #120 <Method Object Map.get(Object)>
	//   59  135:checkcast       #69  <Class Rect>
	//   60  138:astore_2        
					int k4 = ((Rect) (viewgroup)).left;
	//   61  139:aload_1         
	//   62  140:getfield        #129 <Field int Rect.left>
	//   63  143:istore          19
					int l4 = ((Rect) (transitionvalues)).left;
	//   64  145:aload_2         
	//   65  146:getfield        #129 <Field int Rect.left>
	//   66  149:istore          20
					int i4 = ((Rect) (viewgroup)).top;
	//   67  151:aload_1         
	//   68  152:getfield        #132 <Field int Rect.top>
	//   69  155:istore          17
					int j4 = ((Rect) (transitionvalues)).top;
	//   70  157:aload_2         
	//   71  158:getfield        #132 <Field int Rect.top>
	//   72  161:istore          18
					i3 = ((Rect) (viewgroup)).right;
	//   73  163:aload_1         
	//   74  164:getfield        #135 <Field int Rect.right>
	//   75  167:istore          13
					int j3 = ((Rect) (transitionvalues)).right;
	//   76  169:aload_2         
	//   77  170:getfield        #135 <Field int Rect.right>
	//   78  173:istore          14
					int k3 = ((Rect) (viewgroup)).bottom;
	//   79  175:aload_1         
	//   80  176:getfield        #138 <Field int Rect.bottom>
	//   81  179:istore          15
					int l3 = ((Rect) (transitionvalues)).bottom;
	//   82  181:aload_2         
	//   83  182:getfield        #138 <Field int Rect.bottom>
	//   84  185:istore          16
					l1 = i3 - k4;
	//   85  187:iload           13
	//   86  189:iload           19
	//   87  191:isub            
	//   88  192:istore          9
					j2 = k3 - i4;
	//   89  194:iload           15
	//   90  196:iload           17
	//   91  198:isub            
	//   92  199:istore          10
					k2 = j3 - l4;
	//   93  201:iload           14
	//   94  203:iload           20
	//   95  205:isub            
	//   96  206:istore          11
					l2 = l3 - j4;
	//   97  208:iload           16
	//   98  210:iload           18
	//   99  212:isub            
	//  100  213:istore          12
					j1 = 0;
	//  101  215:iconst_0        
	//  102  216:istore          8
					l = 0;
	//  103  218:iconst_0        
	//  104  219:istore          7
					i = j1;
	//  105  221:iload           8
	//  106  223:istore          6
					if(l1 != 0)
	//* 107  225:iload           9
	//* 108  227:ifeq            320
					{
						i = j1;
	//  109  230:iload           8
	//  110  232:istore          6
						if(j2 != 0)
	//* 111  234:iload           10
	//* 112  236:ifeq            320
						{
							i = j1;
	//  113  239:iload           8
	//  114  241:istore          6
							if(k2 != 0)
	//* 115  243:iload           11
	//* 116  245:ifeq            320
							{
								i = j1;
	//  117  248:iload           8
	//  118  250:istore          6
								if(l2 != 0)
	//* 119  252:iload           12
	//* 120  254:ifeq            320
								{
									if(k4 != l4)
	//* 121  257:iload           19
	//* 122  259:iload           20
	//* 123  261:icmpeq          269
										l = 0 + 1;
	//  124  264:iconst_0        
	//  125  265:iconst_1        
	//  126  266:iadd            
	//  127  267:istore          7
									i = l;
	//  128  269:iload           7
	//  129  271:istore          6
									if(i4 != j4)
	//* 130  273:iload           17
	//* 131  275:iload           18
	//* 132  277:icmpeq          286
										i = l + 1;
	//  133  280:iload           7
	//  134  282:iconst_1        
	//  135  283:iadd            
	//  136  284:istore          6
									l = i;
	//  137  286:iload           6
	//  138  288:istore          7
									if(i3 != j3)
	//* 139  290:iload           13
	//* 140  292:iload           14
	//* 141  294:icmpeq          303
										l = i + 1;
	//  142  297:iload           6
	//  143  299:iconst_1        
	//  144  300:iadd            
	//  145  301:istore          7
									i = l;
	//  146  303:iload           7
	//  147  305:istore          6
									if(k3 != l3)
	//* 148  307:iload           15
	//* 149  309:iload           16
	//* 150  311:icmpeq          320
										i = l + 1;
	//  151  314:iload           7
	//  152  316:iconst_1        
	//  153  317:iadd            
	//  154  318:istore          6
								}
							}
						}
					}
					if(i <= 0)
						break label0;
	//  155  320:iload           6
	//  156  322:ifle            920
					if(!mResizeClip)
	//* 157  325:aload_0         
	//* 158  326:getfield        #53  <Field boolean mResizeClip>
	//* 159  329:ifne            585
					{
						viewgroup = ((ViewGroup) (new PropertyValuesHolder[i]));
	//  160  332:iload           6
	//  161  334:anewarray       PropertyValuesHolder[]
	//  162  337:astore_1        
						i = 0;
	//  163  338:iconst_0        
	//  164  339:istore          6
						if(k4 != l4)
	//* 165  341:iload           19
	//* 166  343:iload           20
	//* 167  345:icmpeq          355
							((View) (obj)).setLeft(k4);
	//  168  348:aload           21
	//  169  350:iload           19
	//  170  352:invokevirtual   #144 <Method void View.setLeft(int)>
						if(i4 != j4)
	//* 171  355:iload           17
	//* 172  357:iload           18
	//* 173  359:icmpeq          369
							((View) (obj)).setTop(i4);
	//  174  362:aload           21
	//  175  364:iload           17
	//  176  366:invokevirtual   #147 <Method void View.setTop(int)>
						if(i3 != j3)
	//* 177  369:iload           13
	//* 178  371:iload           14
	//* 179  373:icmpeq          383
							((View) (obj)).setRight(i3);
	//  180  376:aload           21
	//  181  378:iload           13
	//  182  380:invokevirtual   #150 <Method void View.setRight(int)>
						if(k3 != l3)
	//* 183  383:iload           15
	//* 184  385:iload           16
	//* 185  387:icmpeq          397
							((View) (obj)).setBottom(k3);
	//  186  390:aload           21
	//  187  392:iload           15
	//  188  394:invokevirtual   #153 <Method void View.setBottom(int)>
						if(k4 != l4)
	//* 189  397:iload           19
	//* 190  399:iload           20
	//* 191  401:icmpeq          430
						{
							i = 0 + 1;
	//  192  404:iconst_0        
	//  193  405:iconst_1        
	//  194  406:iadd            
	//  195  407:istore          6
							viewgroup[0] = ((/*<invalid signature>*/java.lang.Object) (PropertyValuesHolder.ofInt("left", new int[] {
								k4, l4
							})));
	//  196  409:aload_1         
	//  197  410:iconst_0        
	//  198  411:ldc1            #154 <String "left">
	//  199  413:iconst_2        
	//  200  414:newarray        int[]
	//  201  416:dup             
	//  202  417:iconst_0        
	//  203  418:iload           19
	//  204  420:iastore         
	//  205  421:dup             
	//  206  422:iconst_1        
	//  207  423:iload           20
	//  208  425:iastore         
	//  209  426:invokestatic    #158 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  210  429:aastore         
						}
						l = i;
	//  211  430:iload           6
	//  212  432:istore          7
						if(i4 != j4)
	//* 213  434:iload           17
	//* 214  436:iload           18
	//* 215  438:icmpeq          469
						{
							l = i + 1;
	//  216  441:iload           6
	//  217  443:iconst_1        
	//  218  444:iadd            
	//  219  445:istore          7
							viewgroup[i] = ((/*<invalid signature>*/java.lang.Object) (PropertyValuesHolder.ofInt("top", new int[] {
								i4, j4
							})));
	//  220  447:aload_1         
	//  221  448:iload           6
	//  222  450:ldc1            #159 <String "top">
	//  223  452:iconst_2        
	//  224  453:newarray        int[]
	//  225  455:dup             
	//  226  456:iconst_0        
	//  227  457:iload           17
	//  228  459:iastore         
	//  229  460:dup             
	//  230  461:iconst_1        
	//  231  462:iload           18
	//  232  464:iastore         
	//  233  465:invokestatic    #158 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  234  468:aastore         
						}
						i = l;
	//  235  469:iload           7
	//  236  471:istore          6
						if(i3 != j3)
	//* 237  473:iload           13
	//* 238  475:iload           14
	//* 239  477:icmpeq          508
						{
							i = l + 1;
	//  240  480:iload           7
	//  241  482:iconst_1        
	//  242  483:iadd            
	//  243  484:istore          6
							viewgroup[l] = ((/*<invalid signature>*/java.lang.Object) (PropertyValuesHolder.ofInt("right", new int[] {
								i3, j3
							})));
	//  244  486:aload_1         
	//  245  487:iload           7
	//  246  489:ldc1            #160 <String "right">
	//  247  491:iconst_2        
	//  248  492:newarray        int[]
	//  249  494:dup             
	//  250  495:iconst_0        
	//  251  496:iload           13
	//  252  498:iastore         
	//  253  499:dup             
	//  254  500:iconst_1        
	//  255  501:iload           14
	//  256  503:iastore         
	//  257  504:invokestatic    #158 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  258  507:aastore         
						}
						if(k3 != l3)
	//* 259  508:iload           15
	//* 260  510:iload           16
	//* 261  512:icmpeq          537
							viewgroup[i] = ((/*<invalid signature>*/java.lang.Object) (PropertyValuesHolder.ofInt("bottom", new int[] {
								k3, l3
							})));
	//  262  515:aload_1         
	//  263  516:iload           6
	//  264  518:ldc1            #161 <String "bottom">
	//  265  520:iconst_2        
	//  266  521:newarray        int[]
	//  267  523:dup             
	//  268  524:iconst_0        
	//  269  525:iload           15
	//  270  527:iastore         
	//  271  528:dup             
	//  272  529:iconst_1        
	//  273  530:iload           16
	//  274  532:iastore         
	//  275  533:invokestatic    #158 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  276  536:aastore         
						viewgroup = ((ViewGroup) (ObjectAnimator.ofPropertyValuesHolder(obj, ((PropertyValuesHolder []) (viewgroup)))));
	//  277  537:aload           21
	//  278  539:aload_1         
	//  279  540:invokestatic    #167 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  280  543:astore_1        
						if(((View) (obj)).getParent() instanceof ViewGroup)
	//* 281  544:aload           21
	//* 282  546:invokevirtual   #97  <Method android.view.ViewParent View.getParent()>
	//* 283  549:instanceof      #122 <Class ViewGroup>
	//* 284  552:ifeq            583
						{
							transitionvalues = ((TransitionValues) ((ViewGroup)((View) (obj)).getParent()));
	//  285  555:aload           21
	//  286  557:invokevirtual   #97  <Method android.view.ViewParent View.getParent()>
	//  287  560:checkcast       #122 <Class ViewGroup>
	//  288  563:astore_2        
							as.a(((ViewGroup) (transitionvalues)), true);
	//  289  564:aload_2         
	//  290  565:iconst_1        
	//  291  566:invokestatic    #173 <Method void as.a(ViewGroup, boolean)>
							addListener(((Transition.TransitionListener) (new Transition.TransitionListenerAdapter(((ViewGroup) (transitionvalues))) {

								public void onTransitionCancel(Transition transition)
								{
									as.a(e, false);
								//    0    0:aload_0         
								//    1    1:getfield        #21  <Field ViewGroup e>
								//    2    4:iconst_0        
								//    3    5:invokestatic    #36  <Method void as.a(ViewGroup, boolean)>
									b = true;
								//    4    8:aload_0         
								//    5    9:iconst_1        
								//    6   10:putfield        #26  <Field boolean b>
								//    7   13:return          
								}

								public void onTransitionEnd(Transition transition)
								{
									if(!b)
								//*   0    0:aload_0         
								//*   1    1:getfield        #26  <Field boolean b>
								//*   2    4:ifne            15
										as.a(e, false);
								//    3    7:aload_0         
								//    4    8:getfield        #21  <Field ViewGroup e>
								//    5   11:iconst_0        
								//    6   12:invokestatic    #36  <Method void as.a(ViewGroup, boolean)>
								//    7   15:return          
								}

								public void onTransitionPause(Transition transition)
								{
									as.a(e, false);
								//    0    0:aload_0         
								//    1    1:getfield        #21  <Field ViewGroup e>
								//    2    4:iconst_0        
								//    3    5:invokestatic    #36  <Method void as.a(ViewGroup, boolean)>
								//    4    8:return          
								}

								public void onTransitionResume(Transition transition)
								{
									as.a(e, true);
								//    0    0:aload_0         
								//    1    1:getfield        #21  <Field ViewGroup e>
								//    2    4:iconst_1        
								//    3    5:invokestatic    #36  <Method void as.a(ViewGroup, boolean)>
								//    4    8:return          
								}

								boolean b;
								final ChangeBounds d;
								final ViewGroup e;

			
			{
				d = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ChangeBounds d>
				e = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewGroup e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Transition$TransitionListenerAdapter()>
				b = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #26  <Field boolean b>
			//   11   19:return          
			}
							}
)));
	//  292  569:aload_0         
	//  293  570:new             #10  <Class ChangeBounds$4>
	//  294  573:dup             
	//  295  574:aload_0         
	//  296  575:aload_2         
	//  297  576:invokespecial   #176 <Method void ChangeBounds$4(ChangeBounds, ViewGroup)>
	//  298  579:invokevirtual   #180 <Method Transition addListener(Transition$TransitionListener)>
	//  299  582:pop             
						}
						return ((Animator) (viewgroup));
	//  300  583:aload_1         
	//  301  584:areturn         
					}
					if(l1 != k2)
	//* 302  585:iload           9
	//* 303  587:iload           11
	//* 304  589:icmpeq          607
						((View) (obj)).setRight(Math.max(l1, k2) + l4);
	//  305  592:aload           21
	//  306  594:iload           9
	//  307  596:iload           11
	//  308  598:invokestatic    #186 <Method int Math.max(int, int)>
	//  309  601:iload           20
	//  310  603:iadd            
	//  311  604:invokevirtual   #150 <Method void View.setRight(int)>
					if(j2 != l2)
	//* 312  607:iload           10
	//* 313  609:iload           12
	//* 314  611:icmpeq          629
						((View) (obj)).setBottom(Math.max(j2, l2) + j4);
	//  315  614:aload           21
	//  316  616:iload           10
	//  317  618:iload           12
	//  318  620:invokestatic    #186 <Method int Math.max(int, int)>
	//  319  623:iload           18
	//  320  625:iadd            
	//  321  626:invokevirtual   #153 <Method void View.setBottom(int)>
					if(k4 != l4)
	//* 322  629:iload           19
	//* 323  631:iload           20
	//* 324  633:icmpeq          647
						((View) (obj)).setTranslationX(k4 - l4);
	//  325  636:aload           21
	//  326  638:iload           19
	//  327  640:iload           20
	//  328  642:isub            
	//  329  643:i2f             
	//  330  644:invokevirtual   #190 <Method void View.setTranslationX(float)>
					if(i4 != j4)
	//* 331  647:iload           17
	//* 332  649:iload           18
	//* 333  651:icmpeq          665
						((View) (obj)).setTranslationY(i4 - j4);
	//  334  654:aload           21
	//  335  656:iload           17
	//  336  658:iload           18
	//  337  660:isub            
	//  338  661:i2f             
	//  339  662:invokevirtual   #193 <Method void View.setTranslationY(float)>
					f = l4 - k4;
	//  340  665:iload           20
	//  341  667:iload           19
	//  342  669:isub            
	//  343  670:i2f             
	//  344  671:fstore          4
					f1 = j4 - i4;
	//  345  673:iload           18
	//  346  675:iload           17
	//  347  677:isub            
	//  348  678:i2f             
	//  349  679:fstore          5
					j1 = k2 - l1;
	//  350  681:iload           11
	//  351  683:iload           9
	//  352  685:isub            
	//  353  686:istore          8
					i3 = l2 - j2;
	//  354  688:iload           12
	//  355  690:iload           10
	//  356  692:isub            
	//  357  693:istore          13
					l = 0;
	//  358  695:iconst_0        
	//  359  696:istore          7
					if(f != 0.0F)
	//* 360  698:fload           4
	//* 361  700:fconst_0        
	//* 362  701:fcmpl           
	//* 363  702:ifeq            710
						l = 0 + 1;
	//  364  705:iconst_0        
	//  365  706:iconst_1        
	//  366  707:iadd            
	//  367  708:istore          7
					i = l;
	//  368  710:iload           7
	//  369  712:istore          6
					if(f1 != 0.0F)
	//* 370  714:fload           5
	//* 371  716:fconst_0        
	//* 372  717:fcmpl           
	//* 373  718:ifeq            727
						i = l + 1;
	//  374  721:iload           7
	//  375  723:iconst_1        
	//  376  724:iadd            
	//  377  725:istore          6
					if(j1 == 0)
	//* 378  727:iload           8
	//* 379  729:ifne            741
					{
						l = i;
	//  380  732:iload           6
	//  381  734:istore          7
						if(i3 == 0)
							break label2;
	//  382  736:iload           13
	//  383  738:ifeq            747
					}
					l = i + 1;
	//  384  741:iload           6
	//  385  743:iconst_1        
	//  386  744:iadd            
	//  387  745:istore          7
				}
				viewgroup = ((ViewGroup) (new PropertyValuesHolder[l]));
	//  388  747:iload           7
	//  389  749:anewarray       PropertyValuesHolder[]
	//  390  752:astore_1        
				int j = 0;
	//  391  753:iconst_0        
	//  392  754:istore          6
				if(f != 0.0F)
	//* 393  756:fload           4
	//* 394  758:fconst_0        
	//* 395  759:fcmpl           
	//* 396  760:ifeq            791
				{
					j = 0 + 1;
	//  397  763:iconst_0        
	//  398  764:iconst_1        
	//  399  765:iadd            
	//  400  766:istore          6
					viewgroup[0] = ((/*<invalid signature>*/java.lang.Object) (PropertyValuesHolder.ofFloat("translationX", new float[] {
						((View) (obj)).getTranslationX(), 0.0F
					})));
	//  401  768:aload_1         
	//  402  769:iconst_0        
	//  403  770:ldc1            #195 <String "translationX">
	//  404  772:iconst_2        
	//  405  773:newarray        float[]
	//  406  775:dup             
	//  407  776:iconst_0        
	//  408  777:aload           21
	//  409  779:invokevirtual   #199 <Method float View.getTranslationX()>
	//  410  782:fastore         
	//  411  783:dup             
	//  412  784:iconst_1        
	//  413  785:fconst_0        
	//  414  786:fastore         
	//  415  787:invokestatic    #203 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  416  790:aastore         
				}
				if(f1 != 0.0F)
	//* 417  791:fload           5
	//* 418  793:fconst_0        
	//* 419  794:fcmpl           
	//* 420  795:ifeq            822
					viewgroup[j] = ((/*<invalid signature>*/java.lang.Object) (PropertyValuesHolder.ofFloat("translationY", new float[] {
						((View) (obj)).getTranslationY(), 0.0F
					})));
	//  421  798:aload_1         
	//  422  799:iload           6
	//  423  801:ldc1            #205 <String "translationY">
	//  424  803:iconst_2        
	//  425  804:newarray        float[]
	//  426  806:dup             
	//  427  807:iconst_0        
	//  428  808:aload           21
	//  429  810:invokevirtual   #208 <Method float View.getTranslationY()>
	//  430  813:fastore         
	//  431  814:dup             
	//  432  815:iconst_1        
	//  433  816:fconst_0        
	//  434  817:fastore         
	//  435  818:invokestatic    #203 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  436  821:aastore         
				if(j1 != 0 || i3 != 0)
	//* 437  822:iload           8
	//* 438  824:ifne            832
	//* 439  827:iload           13
	//* 440  829:ifeq            860
				{
					new Rect(0, 0, l1, j2);
	//  441  832:new             #69  <Class Rect>
	//  442  835:dup             
	//  443  836:iconst_0        
	//  444  837:iconst_0        
	//  445  838:iload           9
	//  446  840:iload           10
	//  447  842:invokespecial   #87  <Method void Rect(int, int, int, int)>
	//  448  845:pop             
					new Rect(0, 0, k2, l2);
	//  449  846:new             #69  <Class Rect>
	//  450  849:dup             
	//  451  850:iconst_0        
	//  452  851:iconst_0        
	//  453  852:iload           11
	//  454  854:iload           12
	//  455  856:invokespecial   #87  <Method void Rect(int, int, int, int)>
	//  456  859:pop             
				}
				viewgroup = ((ViewGroup) (ObjectAnimator.ofPropertyValuesHolder(obj, ((PropertyValuesHolder []) (viewgroup)))));
	//  457  860:aload           21
	//  458  862:aload_1         
	//  459  863:invokestatic    #167 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  460  866:astore_1        
				if(((View) (obj)).getParent() instanceof ViewGroup)
	//* 461  867:aload           21
	//* 462  869:invokevirtual   #97  <Method android.view.ViewParent View.getParent()>
	//* 463  872:instanceof      #122 <Class ViewGroup>
	//* 464  875:ifeq            906
				{
					transitionvalues = ((TransitionValues) ((ViewGroup)((View) (obj)).getParent()));
	//  465  878:aload           21
	//  466  880:invokevirtual   #97  <Method android.view.ViewParent View.getParent()>
	//  467  883:checkcast       #122 <Class ViewGroup>
	//  468  886:astore_2        
					as.a(((ViewGroup) (transitionvalues)), true);
	//  469  887:aload_2         
	//  470  888:iconst_1        
	//  471  889:invokestatic    #173 <Method void as.a(ViewGroup, boolean)>
					addListener(((Transition.TransitionListener) (new Transition.TransitionListenerAdapter(((ViewGroup) (transitionvalues))) {

						public void onTransitionCancel(Transition transition)
						{
							as.a(e, false);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field ViewGroup e>
						//    2    4:iconst_0        
						//    3    5:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
							a = true;
						//    4    8:aload_0         
						//    5    9:iconst_1        
						//    6   10:putfield        #26  <Field boolean a>
						//    7   13:return          
						}

						public void onTransitionEnd(Transition transition)
						{
							if(!a)
						//*   0    0:aload_0         
						//*   1    1:getfield        #26  <Field boolean a>
						//*   2    4:ifne            15
								as.a(e, false);
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field ViewGroup e>
						//    5   11:iconst_0        
						//    6   12:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
						//    7   15:return          
						}

						public void onTransitionPause(Transition transition)
						{
							as.a(e, false);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field ViewGroup e>
						//    2    4:iconst_0        
						//    3    5:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
						//    4    8:return          
						}

						public void onTransitionResume(Transition transition)
						{
							as.a(e, true);
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field ViewGroup e>
						//    2    4:iconst_1        
						//    3    5:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
						//    4    8:return          
						}

						boolean a;
						final ChangeBounds c;
						final ViewGroup e;

			
			{
				c = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ChangeBounds c>
				e = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewGroup e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Transition$TransitionListenerAdapter()>
				a = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #26  <Field boolean a>
			//   11   19:return          
			}
					}
)));
	//  472  892:aload_0         
	//  473  893:new             #8   <Class ChangeBounds$2>
	//  474  896:dup             
	//  475  897:aload_0         
	//  476  898:aload_2         
	//  477  899:invokespecial   #209 <Method void ChangeBounds$2(ChangeBounds, ViewGroup)>
	//  478  902:invokevirtual   #180 <Method Transition addListener(Transition$TransitionListener)>
	//  479  905:pop             
				}
				((ObjectAnimator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
					//    0    0:return          
					}

					final ChangeBounds c;

			
			{
				c = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ChangeBounds c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
				}
)));
	//  480  906:aload_1         
	//  481  907:new             #6   <Class ChangeBounds$1>
	//  482  910:dup             
	//  483  911:aload_0         
	//  484  912:invokespecial   #212 <Method void ChangeBounds$1(ChangeBounds)>
	//  485  915:invokevirtual   #215 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (viewgroup));
	//  486  918:aload_1         
	//  487  919:areturn         
			}
	//* 488  920:goto            1231
			int k = ((Integer)transitionvalues.values.get("android:changeBounds:windowX")).intValue();
	//  489  923:aload_2         
	//  490  924:getfield        #67  <Field Map TransitionValues.values>
	//  491  927:ldc1            #22  <String "android:changeBounds:windowX">
	//  492  929:invokeinterface #120 <Method Object Map.get(Object)>
	//  493  934:checkcast       #103 <Class Integer>
	//  494  937:invokevirtual   #218 <Method int Integer.intValue()>
	//  495  940:istore          6
			int i1 = ((Integer)transitionvalues.values.get("android:changeBounds:windowY")).intValue();
	//  496  942:aload_2         
	//  497  943:getfield        #67  <Field Map TransitionValues.values>
	//  498  946:ldc1            #25  <String "android:changeBounds:windowY">
	//  499  948:invokeinterface #120 <Method Object Map.get(Object)>
	//  500  953:checkcast       #103 <Class Integer>
	//  501  956:invokevirtual   #218 <Method int Integer.intValue()>
	//  502  959:istore          7
			int k1 = ((Integer)transitionvalues1.values.get("android:changeBounds:windowX")).intValue();
	//  503  961:aload_3         
	//  504  962:getfield        #67  <Field Map TransitionValues.values>
	//  505  965:ldc1            #22  <String "android:changeBounds:windowX">
	//  506  967:invokeinterface #120 <Method Object Map.get(Object)>
	//  507  972:checkcast       #103 <Class Integer>
	//  508  975:invokevirtual   #218 <Method int Integer.intValue()>
	//  509  978:istore          8
			int i2 = ((Integer)transitionvalues1.values.get("android:changeBounds:windowY")).intValue();
	//  510  980:aload_3         
	//  511  981:getfield        #67  <Field Map TransitionValues.values>
	//  512  984:ldc1            #25  <String "android:changeBounds:windowY">
	//  513  986:invokeinterface #120 <Method Object Map.get(Object)>
	//  514  991:checkcast       #103 <Class Integer>
	//  515  994:invokevirtual   #218 <Method int Integer.intValue()>
	//  516  997:istore          9
			if(k != k1 || i1 != i2)
	//* 517  999:iload           6
	//* 518 1001:iload           8
	//* 519 1003:icmpne          1013
	//* 520 1006:iload           7
	//* 521 1008:iload           9
	//* 522 1010:icmpeq          1231
			{
				viewgroup.getLocationInWindow(mTempLocation);
	//  523 1013:aload_1         
	//  524 1014:aload_0         
	//  525 1015:getfield        #51  <Field int[] mTempLocation>
	//  526 1018:invokevirtual   #219 <Method void ViewGroup.getLocationInWindow(int[])>
				transitionvalues = ((TransitionValues) (Bitmap.createBitmap(((View) (obj)).getWidth(), ((View) (obj)).getHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
	//  527 1021:aload           21
	//  528 1023:invokevirtual   #222 <Method int View.getWidth()>
	//  529 1026:aload           21
	//  530 1028:invokevirtual   #225 <Method int View.getHeight()>
	//  531 1031:getstatic       #231 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  532 1034:invokestatic    #237 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  533 1037:astore_2        
				((View) (obj)).draw(new Canvas(((Bitmap) (transitionvalues))));
	//  534 1038:aload           21
	//  535 1040:new             #239 <Class Canvas>
	//  536 1043:dup             
	//  537 1044:aload_2         
	//  538 1045:invokespecial   #242 <Method void Canvas(Bitmap)>
	//  539 1048:invokevirtual   #246 <Method void View.draw(Canvas)>
				transitionvalues = ((TransitionValues) (new BitmapDrawable(((Bitmap) (transitionvalues)))));
	//  540 1051:new             #248 <Class BitmapDrawable>
	//  541 1054:dup             
	//  542 1055:aload_2         
	//  543 1056:invokespecial   #249 <Method void BitmapDrawable(Bitmap)>
	//  544 1059:astore_2        
				((View) (obj)).setVisibility(4);
	//  545 1060:aload           21
	//  546 1062:iconst_4        
	//  547 1063:invokevirtual   #252 <Method void View.setVisibility(int)>
				av.e(((View) (viewgroup))).d(((android.graphics.drawable.Drawable) (transitionvalues)));
	//  548 1066:aload_1         
	//  549 1067:invokestatic    #258 <Method aw av.e(View)>
	//  550 1070:aload_2         
	//  551 1071:invokeinterface #264 <Method void aw.d(android.graphics.drawable.Drawable)>
				transitionvalues1 = ((TransitionValues) (new Rect(k - mTempLocation[0], i1 - mTempLocation[1], (k - mTempLocation[0]) + ((View) (obj)).getWidth(), (i1 - mTempLocation[1]) + ((View) (obj)).getHeight())));
	//  552 1076:new             #69  <Class Rect>
	//  553 1079:dup             
	//  554 1080:iload           6
	//  555 1082:aload_0         
	//  556 1083:getfield        #51  <Field int[] mTempLocation>
	//  557 1086:iconst_0        
	//  558 1087:iaload          
	//  559 1088:isub            
	//  560 1089:iload           7
	//  561 1091:aload_0         
	//  562 1092:getfield        #51  <Field int[] mTempLocation>
	//  563 1095:iconst_1        
	//  564 1096:iaload          
	//  565 1097:isub            
	//  566 1098:iload           6
	//  567 1100:aload_0         
	//  568 1101:getfield        #51  <Field int[] mTempLocation>
	//  569 1104:iconst_0        
	//  570 1105:iaload          
	//  571 1106:isub            
	//  572 1107:aload           21
	//  573 1109:invokevirtual   #222 <Method int View.getWidth()>
	//  574 1112:iadd            
	//  575 1113:iload           7
	//  576 1115:aload_0         
	//  577 1116:getfield        #51  <Field int[] mTempLocation>
	//  578 1119:iconst_1        
	//  579 1120:iaload          
	//  580 1121:isub            
	//  581 1122:aload           21
	//  582 1124:invokevirtual   #225 <Method int View.getHeight()>
	//  583 1127:iadd            
	//  584 1128:invokespecial   #87  <Method void Rect(int, int, int, int)>
	//  585 1131:astore_3        
				Rect rect = new Rect(k1 - mTempLocation[0], i2 - mTempLocation[1], (k1 - mTempLocation[0]) + ((View) (obj)).getWidth(), (i2 - mTempLocation[1]) + ((View) (obj)).getHeight());
	//  586 1132:new             #69  <Class Rect>
	//  587 1135:dup             
	//  588 1136:iload           8
	//  589 1138:aload_0         
	//  590 1139:getfield        #51  <Field int[] mTempLocation>
	//  591 1142:iconst_0        
	//  592 1143:iaload          
	//  593 1144:isub            
	//  594 1145:iload           9
	//  595 1147:aload_0         
	//  596 1148:getfield        #51  <Field int[] mTempLocation>
	//  597 1151:iconst_1        
	//  598 1152:iaload          
	//  599 1153:isub            
	//  600 1154:iload           8
	//  601 1156:aload_0         
	//  602 1157:getfield        #51  <Field int[] mTempLocation>
	//  603 1160:iconst_0        
	//  604 1161:iaload          
	//  605 1162:isub            
	//  606 1163:aload           21
	//  607 1165:invokevirtual   #222 <Method int View.getWidth()>
	//  608 1168:iadd            
	//  609 1169:iload           9
	//  610 1171:aload_0         
	//  611 1172:getfield        #51  <Field int[] mTempLocation>
	//  612 1175:iconst_1        
	//  613 1176:iaload          
	//  614 1177:isub            
	//  615 1178:aload           21
	//  616 1180:invokevirtual   #225 <Method int View.getHeight()>
	//  617 1183:iadd            
	//  618 1184:invokespecial   #87  <Method void Rect(int, int, int, int)>
	//  619 1187:astore          22
				transitionvalues1 = ((TransitionValues) (ObjectAnimator.ofObject(((Object) (transitionvalues)), "bounds", ((android.animation.TypeEvaluator) (sRectEvaluator)), new Object[] {
					transitionvalues1, rect
				})));
	//  620 1189:aload_2         
	//  621 1190:ldc2            #266 <String "bounds">
	//  622 1193:getstatic       #47  <Field aj sRectEvaluator>
	//  623 1196:iconst_2        
	//  624 1197:anewarray       Object[]
	//  625 1200:dup             
	//  626 1201:iconst_0        
	//  627 1202:aload_3         
	//  628 1203:aastore         
	//  629 1204:dup             
	//  630 1205:iconst_1        
	//  631 1206:aload           22
	//  632 1208:aastore         
	//  633 1209:invokestatic    #272 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//  634 1212:astore_3        
				((ObjectAnimator) (transitionvalues1)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(viewgroup, ((BitmapDrawable) (transitionvalues)), ((View) (obj))) {

					public void onAnimationEnd(Animator animator)
					{
						av.e(((View) (e))).e(((android.graphics.drawable.Drawable) (c)));
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field ViewGroup e>
					//    2    4:invokestatic    #38  <Method aw av.e(View)>
					//    3    7:aload_0         
					//    4    8:getfield        #25  <Field BitmapDrawable c>
					//    5   11:invokeinterface #43  <Method void aw.e(android.graphics.drawable.Drawable)>
						a.setVisibility(0);
					//    6   16:aload_0         
					//    7   17:getfield        #27  <Field View a>
					//    8   20:iconst_0        
					//    9   21:invokevirtual   #49  <Method void View.setVisibility(int)>
					//   10   24:return          
					}

					final View a;
					final ChangeBounds b;
					final BitmapDrawable c;
					final ViewGroup e;

			
			{
				b = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ChangeBounds b>
				e = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ViewGroup e>
				c = bitmapdrawable;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field BitmapDrawable c>
				a = view;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field View a>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
				}
)));
	//  635 1213:aload_3         
	//  636 1214:new             #12  <Class ChangeBounds$5>
	//  637 1217:dup             
	//  638 1218:aload_0         
	//  639 1219:aload_1         
	//  640 1220:aload_2         
	//  641 1221:aload           21
	//  642 1223:invokespecial   #275 <Method void ChangeBounds$5(ChangeBounds, ViewGroup, BitmapDrawable, View)>
	//  643 1226:invokevirtual   #215 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (transitionvalues1));
	//  644 1229:aload_3         
	//  645 1230:areturn         
			}
		}
		return null;
	//  646 1231:aconst_null     
	//  647 1232:areturn         
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #40  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	public void setResizeClip(boolean flag)
	{
		mResizeClip = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean mResizeClip>
	//    3    5:return          
	}

	private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
	private static final String PROPNAME_PARENT = "android:changeBounds:parent";
	private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
	private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
	private static aj sRectEvaluator = new aj();
	private static final String sTransitionProperties[] = {
		"android:changeBounds:bounds", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"
	};
	boolean mReparent;
	boolean mResizeClip;
	int mTempLocation[];

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #16  <String "android:changeBounds:bounds">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #19  <String "android:changeBounds:parent">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #22  <String "android:changeBounds:windowX">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #25  <String "android:changeBounds:windowY">
	//   17   23:aastore         
	//   18   24:putstatic       #40  <Field String[] sTransitionProperties>
	//   19   27:new             #42  <Class aj>
	//   20   30:dup             
	//   21   31:invokespecial   #45  <Method void aj()>
	//   22   34:putstatic       #47  <Field aj sRectEvaluator>
	//*  23   37:return          
	}
}
