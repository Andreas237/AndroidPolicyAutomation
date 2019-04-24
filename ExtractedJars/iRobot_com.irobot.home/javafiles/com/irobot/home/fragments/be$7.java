// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$7
	implements android.view.reeObserver.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		int i = b.M.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field be b>
	//    2    4:getfield        #29  <Field LinearLayout be.M>
	//    3    7:invokevirtual   #35  <Method int LinearLayout.getWidth()>
	//    4   10:istore_1        
		int j = b.M.getHeight();
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field be b>
	//    7   15:getfield        #29  <Field LinearLayout be.M>
	//    8   18:invokevirtual   #38  <Method int LinearLayout.getHeight()>
	//    9   21:istore_2        
		b.M.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.reeObserver.OnGlobalLayoutListener) (this)));
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field be b>
	//   12   26:getfield        #29  <Field LinearLayout be.M>
	//   13   29:invokevirtual   #42  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #48  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		if(!a)
	//*  16   36:aload_0         
	//*  17   37:getfield        #21  <Field boolean a>
	//*  18   40:ifeq            46
	//*  19   43:goto            49
			i = -i;
	//   20   46:iload_1         
	//   21   47:ineg            
	//   22   48:istore_1        
		b.av = ObjectAnimator.ofFloat(((Object) (b.M)), "translationX", new float[] {
			(float)(-i) * 0.75F
		});
	//   23   49:aload_0         
	//   24   50:getfield        #19  <Field be b>
	//   25   53:aload_0         
	//   26   54:getfield        #19  <Field be b>
	//   27   57:getfield        #29  <Field LinearLayout be.M>
	//   28   60:ldc1            #50  <String "translationX">
	//   29   62:iconst_1        
	//   30   63:newarray        float[]
	//   31   65:dup             
	//   32   66:iconst_0        
	//   33   67:iload_1         
	//   34   68:ineg            
	//   35   69:i2f             
	//   36   70:ldc1            #51  <Float 0.75F>
	//   37   72:fmul            
	//   38   73:fastore         
	//   39   74:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   40   77:putfield        #61  <Field ObjectAnimator be.av>
		b.av.setDuration(b.getResources().getInteger(0x7f0a0005));
	//   41   80:aload_0         
	//   42   81:getfield        #19  <Field be b>
	//   43   84:getfield        #61  <Field ObjectAnimator be.av>
	//   44   87:aload_0         
	//   45   88:getfield        #19  <Field be b>
	//   46   91:invokevirtual   #65  <Method Resources be.getResources()>
	//   47   94:ldc1            #66  <Int 0x7f0a0005>
	//   48   96:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//   49   99:i2l             
	//   50  100:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   51  103:pop             
		b.aw = ObjectAnimator.ofFloat(((Object) (b.M)), "translationY", new float[] {
			(float)(-j) * 0.75F
		});
	//   52  104:aload_0         
	//   53  105:getfield        #19  <Field be b>
	//   54  108:aload_0         
	//   55  109:getfield        #19  <Field be b>
	//   56  112:getfield        #29  <Field LinearLayout be.M>
	//   57  115:ldc1            #78  <String "translationY">
	//   58  117:iconst_1        
	//   59  118:newarray        float[]
	//   60  120:dup             
	//   61  121:iconst_0        
	//   62  122:iload_2         
	//   63  123:ineg            
	//   64  124:i2f             
	//   65  125:ldc1            #51  <Float 0.75F>
	//   66  127:fmul            
	//   67  128:fastore         
	//   68  129:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   69  132:putfield        #81  <Field ObjectAnimator be.aw>
		b.aw.setDuration(b.getResources().getInteger(0x7f0a0005));
	//   70  135:aload_0         
	//   71  136:getfield        #19  <Field be b>
	//   72  139:getfield        #81  <Field ObjectAnimator be.aw>
	//   73  142:aload_0         
	//   74  143:getfield        #19  <Field be b>
	//   75  146:invokevirtual   #65  <Method Resources be.getResources()>
	//   76  149:ldc1            #66  <Int 0x7f0a0005>
	//   77  151:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//   78  154:i2l             
	//   79  155:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   80  158:pop             
		b.ax = ObjectAnimator.ofFloat(((Object) (b.O)), "alpha", new float[] {
			1.0F
		});
	//   81  159:aload_0         
	//   82  160:getfield        #19  <Field be b>
	//   83  163:aload_0         
	//   84  164:getfield        #19  <Field be b>
	//   85  167:getfield        #84  <Field com.irobot.home.view.CircleButton be.O>
	//   86  170:ldc1            #86  <String "alpha">
	//   87  172:iconst_1        
	//   88  173:newarray        float[]
	//   89  175:dup             
	//   90  176:iconst_0        
	//   91  177:fconst_1        
	//   92  178:fastore         
	//   93  179:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   94  182:putfield        #89  <Field ObjectAnimator be.ax>
		b.ax.setDuration(b.getResources().getInteger(0x7f0a0005));
	//   95  185:aload_0         
	//   96  186:getfield        #19  <Field be b>
	//   97  189:getfield        #89  <Field ObjectAnimator be.ax>
	//   98  192:aload_0         
	//   99  193:getfield        #19  <Field be b>
	//  100  196:invokevirtual   #65  <Method Resources be.getResources()>
	//  101  199:ldc1            #66  <Int 0x7f0a0005>
	//  102  201:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  103  204:i2l             
	//  104  205:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  105  208:pop             
		b.ay = ObjectAnimator.ofFloat(((Object) (b.N)), "alpha", new float[] {
			1.0F
		});
	//  106  209:aload_0         
	//  107  210:getfield        #19  <Field be b>
	//  108  213:aload_0         
	//  109  214:getfield        #19  <Field be b>
	//  110  217:getfield        #93  <Field com.irobot.home.view.CustomTextView be.N>
	//  111  220:ldc1            #86  <String "alpha">
	//  112  222:iconst_1        
	//  113  223:newarray        float[]
	//  114  225:dup             
	//  115  226:iconst_0        
	//  116  227:fconst_1        
	//  117  228:fastore         
	//  118  229:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  119  232:putfield        #96  <Field ObjectAnimator be.ay>
		b.ay.setDuration(b.getResources().getInteger(0x7f0a0005));
	//  120  235:aload_0         
	//  121  236:getfield        #19  <Field be b>
	//  122  239:getfield        #96  <Field ObjectAnimator be.ay>
	//  123  242:aload_0         
	//  124  243:getfield        #19  <Field be b>
	//  125  246:invokevirtual   #65  <Method Resources be.getResources()>
	//  126  249:ldc1            #66  <Int 0x7f0a0005>
	//  127  251:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  128  254:i2l             
	//  129  255:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  130  258:pop             
		b.az = ObjectAnimator.ofFloat(((Object) (b.T)), "alpha", new float[] {
			1.0F
		});
	//  131  259:aload_0         
	//  132  260:getfield        #19  <Field be b>
	//  133  263:aload_0         
	//  134  264:getfield        #19  <Field be b>
	//  135  267:getfield        #100 <Field com.irobot.home.view.PercentageRingView be.T>
	//  136  270:ldc1            #86  <String "alpha">
	//  137  272:iconst_1        
	//  138  273:newarray        float[]
	//  139  275:dup             
	//  140  276:iconst_0        
	//  141  277:fconst_1        
	//  142  278:fastore         
	//  143  279:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  144  282:putfield        #103 <Field ObjectAnimator be.az>
		b.az.setDuration(b.getResources().getInteger(0x7f0a0005));
	//  145  285:aload_0         
	//  146  286:getfield        #19  <Field be b>
	//  147  289:getfield        #103 <Field ObjectAnimator be.az>
	//  148  292:aload_0         
	//  149  293:getfield        #19  <Field be b>
	//  150  296:invokevirtual   #65  <Method Resources be.getResources()>
	//  151  299:ldc1            #66  <Int 0x7f0a0005>
	//  152  301:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  153  304:i2l             
	//  154  305:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  155  308:pop             
		b.aB = ObjectAnimator.ofFloat(((Object) (b.V)), "alpha", new float[] {
			1.0F
		});
	//  156  309:aload_0         
	//  157  310:getfield        #19  <Field be b>
	//  158  313:aload_0         
	//  159  314:getfield        #19  <Field be b>
	//  160  317:getfield        #106 <Field LinearLayout be.V>
	//  161  320:ldc1            #86  <String "alpha">
	//  162  322:iconst_1        
	//  163  323:newarray        float[]
	//  164  325:dup             
	//  165  326:iconst_0        
	//  166  327:fconst_1        
	//  167  328:fastore         
	//  168  329:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  169  332:putfield        #109 <Field ObjectAnimator be.aB>
		b.aB.setDuration(b.getResources().getInteger(0x7f0a0005));
	//  170  335:aload_0         
	//  171  336:getfield        #19  <Field be b>
	//  172  339:getfield        #109 <Field ObjectAnimator be.aB>
	//  173  342:aload_0         
	//  174  343:getfield        #19  <Field be b>
	//  175  346:invokevirtual   #65  <Method Resources be.getResources()>
	//  176  349:ldc1            #66  <Int 0x7f0a0005>
	//  177  351:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  178  354:i2l             
	//  179  355:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  180  358:pop             
		b.aA = ObjectAnimator.ofFloat(((Object) (b.Y)), "alpha", new float[] {
			1.0F
		});
	//  181  359:aload_0         
	//  182  360:getfield        #19  <Field be b>
	//  183  363:aload_0         
	//  184  364:getfield        #19  <Field be b>
	//  185  367:getfield        #113 <Field android.widget.RelativeLayout be.Y>
	//  186  370:ldc1            #86  <String "alpha">
	//  187  372:iconst_1        
	//  188  373:newarray        float[]
	//  189  375:dup             
	//  190  376:iconst_0        
	//  191  377:fconst_1        
	//  192  378:fastore         
	//  193  379:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  194  382:putfield        #116 <Field ObjectAnimator be.aA>
		b.aA.setDuration(b.getResources().getInteger(0x7f0a0005));
	//  195  385:aload_0         
	//  196  386:getfield        #19  <Field be b>
	//  197  389:getfield        #116 <Field ObjectAnimator be.aA>
	//  198  392:aload_0         
	//  199  393:getfield        #19  <Field be b>
	//  200  396:invokevirtual   #65  <Method Resources be.getResources()>
	//  201  399:ldc1            #66  <Int 0x7f0a0005>
	//  202  401:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  203  404:i2l             
	//  204  405:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  205  408:pop             
		b.ag = new AnimatorSet();
	//  206  409:aload_0         
	//  207  410:getfield        #19  <Field be b>
	//  208  413:new             #118 <Class AnimatorSet>
	//  209  416:dup             
	//  210  417:invokespecial   #119 <Method void AnimatorSet()>
	//  211  420:putfield        #123 <Field AnimatorSet be.ag>
		b.ag.play(((android.animation.Animator) (b.av))).with(((android.animation.Animator) (b.aw))).with(((android.animation.Animator) (b.ax))).with(((android.animation.Animator) (b.az))).with(((android.animation.Animator) (b.aB))).with(((android.animation.Animator) (b.aA)));
	//  212  423:aload_0         
	//  213  424:getfield        #19  <Field be b>
	//  214  427:getfield        #123 <Field AnimatorSet be.ag>
	//  215  430:aload_0         
	//  216  431:getfield        #19  <Field be b>
	//  217  434:getfield        #61  <Field ObjectAnimator be.av>
	//  218  437:invokevirtual   #127 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  219  440:aload_0         
	//  220  441:getfield        #19  <Field be b>
	//  221  444:getfield        #81  <Field ObjectAnimator be.aw>
	//  222  447:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  223  450:aload_0         
	//  224  451:getfield        #19  <Field be b>
	//  225  454:getfield        #89  <Field ObjectAnimator be.ax>
	//  226  457:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  227  460:aload_0         
	//  228  461:getfield        #19  <Field be b>
	//  229  464:getfield        #103 <Field ObjectAnimator be.az>
	//  230  467:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  231  470:aload_0         
	//  232  471:getfield        #19  <Field be b>
	//  233  474:getfield        #109 <Field ObjectAnimator be.aB>
	//  234  477:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  235  480:aload_0         
	//  236  481:getfield        #19  <Field be b>
	//  237  484:getfield        #116 <Field ObjectAnimator be.aA>
	//  238  487:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  239  490:pop             
		b.ah = new AnimatorSet();
	//  240  491:aload_0         
	//  241  492:getfield        #19  <Field be b>
	//  242  495:new             #118 <Class AnimatorSet>
	//  243  498:dup             
	//  244  499:invokespecial   #119 <Method void AnimatorSet()>
	//  245  502:putfield        #135 <Field AnimatorSet be.ah>
		b.ah.play(((android.animation.Animator) (b.ay)));
	//  246  505:aload_0         
	//  247  506:getfield        #19  <Field be b>
	//  248  509:getfield        #135 <Field AnimatorSet be.ah>
	//  249  512:aload_0         
	//  250  513:getfield        #19  <Field be b>
	//  251  516:getfield        #96  <Field ObjectAnimator be.ay>
	//  252  519:invokevirtual   #127 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  253  522:pop             
	//  254  523:return          
	}

	final boolean a;
	final be b;

	be$7(be be1, boolean flag)
	{
		b = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field be b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
