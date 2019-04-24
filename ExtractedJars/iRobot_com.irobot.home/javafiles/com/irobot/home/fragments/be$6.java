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

class be$6
	implements android.view.reeObserver.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		b.P.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.reeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field be b>
	//    2    4:getfield        #29  <Field LinearLayout be.P>
	//    3    7:invokevirtual   #35  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #41  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		int i = b.P.getWidth();
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field be b>
	//    8   18:getfield        #29  <Field LinearLayout be.P>
	//    9   21:invokevirtual   #45  <Method int LinearLayout.getWidth()>
	//   10   24:istore_1        
		int j = b.P.getHeight();
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field be b>
	//   13   29:getfield        #29  <Field LinearLayout be.P>
	//   14   32:invokevirtual   #48  <Method int LinearLayout.getHeight()>
	//   15   35:istore_2        
		if(!a)
	//*  16   36:aload_0         
	//*  17   37:getfield        #21  <Field boolean a>
	//*  18   40:ifeq            46
	//*  19   43:goto            49
			i = -i;
	//   20   46:iload_1         
	//   21   47:ineg            
	//   22   48:istore_1        
		b.ar = ObjectAnimator.ofFloat(((Object) (b.P)), "translationX", new float[] {
			(float)i * 0.75F
		});
	//   23   49:aload_0         
	//   24   50:getfield        #19  <Field be b>
	//   25   53:aload_0         
	//   26   54:getfield        #19  <Field be b>
	//   27   57:getfield        #29  <Field LinearLayout be.P>
	//   28   60:ldc1            #50  <String "translationX">
	//   29   62:iconst_1        
	//   30   63:newarray        float[]
	//   31   65:dup             
	//   32   66:iconst_0        
	//   33   67:iload_1         
	//   34   68:i2f             
	//   35   69:ldc1            #51  <Float 0.75F>
	//   36   71:fmul            
	//   37   72:fastore         
	//   38   73:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   39   76:putfield        #61  <Field ObjectAnimator be.ar>
		b.ar.setDuration(b.getResources().getInteger(0x7f0a0005));
	//   40   79:aload_0         
	//   41   80:getfield        #19  <Field be b>
	//   42   83:getfield        #61  <Field ObjectAnimator be.ar>
	//   43   86:aload_0         
	//   44   87:getfield        #19  <Field be b>
	//   45   90:invokevirtual   #65  <Method Resources be.getResources()>
	//   46   93:ldc1            #66  <Int 0x7f0a0005>
	//   47   95:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//   48   98:i2l             
	//   49   99:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   50  102:pop             
		b.as = ObjectAnimator.ofFloat(((Object) (b.P)), "translationY", new float[] {
			(float)(-j) * 0.75F
		});
	//   51  103:aload_0         
	//   52  104:getfield        #19  <Field be b>
	//   53  107:aload_0         
	//   54  108:getfield        #19  <Field be b>
	//   55  111:getfield        #29  <Field LinearLayout be.P>
	//   56  114:ldc1            #78  <String "translationY">
	//   57  116:iconst_1        
	//   58  117:newarray        float[]
	//   59  119:dup             
	//   60  120:iconst_0        
	//   61  121:iload_2         
	//   62  122:ineg            
	//   63  123:i2f             
	//   64  124:ldc1            #51  <Float 0.75F>
	//   65  126:fmul            
	//   66  127:fastore         
	//   67  128:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   68  131:putfield        #81  <Field ObjectAnimator be.as>
		b.as.setDuration(b.getResources().getInteger(0x7f0a0005));
	//   69  134:aload_0         
	//   70  135:getfield        #19  <Field be b>
	//   71  138:getfield        #81  <Field ObjectAnimator be.as>
	//   72  141:aload_0         
	//   73  142:getfield        #19  <Field be b>
	//   74  145:invokevirtual   #65  <Method Resources be.getResources()>
	//   75  148:ldc1            #66  <Int 0x7f0a0005>
	//   76  150:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//   77  153:i2l             
	//   78  154:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   79  157:pop             
		b.at = ObjectAnimator.ofFloat(((Object) (b.Q)), "alpha", new float[] {
			1.0F
		});
	//   80  158:aload_0         
	//   81  159:getfield        #19  <Field be b>
	//   82  162:aload_0         
	//   83  163:getfield        #19  <Field be b>
	//   84  166:getfield        #85  <Field com.irobot.home.view.CircleButton be.Q>
	//   85  169:ldc1            #87  <String "alpha">
	//   86  171:iconst_1        
	//   87  172:newarray        float[]
	//   88  174:dup             
	//   89  175:iconst_0        
	//   90  176:fconst_1        
	//   91  177:fastore         
	//   92  178:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   93  181:putfield        #90  <Field ObjectAnimator be.at>
		b.at.setDuration(b.getResources().getInteger(0x7f0a0005));
	//   94  184:aload_0         
	//   95  185:getfield        #19  <Field be b>
	//   96  188:getfield        #90  <Field ObjectAnimator be.at>
	//   97  191:aload_0         
	//   98  192:getfield        #19  <Field be b>
	//   99  195:invokevirtual   #65  <Method Resources be.getResources()>
	//  100  198:ldc1            #66  <Int 0x7f0a0005>
	//  101  200:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  102  203:i2l             
	//  103  204:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  104  207:pop             
		b.au = ObjectAnimator.ofFloat(((Object) (b.R)), "alpha", new float[] {
			1.0F
		});
	//  105  208:aload_0         
	//  106  209:getfield        #19  <Field be b>
	//  107  212:aload_0         
	//  108  213:getfield        #19  <Field be b>
	//  109  216:getfield        #94  <Field com.irobot.home.view.CustomTextView be.R>
	//  110  219:ldc1            #87  <String "alpha">
	//  111  221:iconst_1        
	//  112  222:newarray        float[]
	//  113  224:dup             
	//  114  225:iconst_0        
	//  115  226:fconst_1        
	//  116  227:fastore         
	//  117  228:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  118  231:putfield        #97  <Field ObjectAnimator be.au>
		b.au.setDuration(b.getResources().getInteger(0x7f0a0005));
	//  119  234:aload_0         
	//  120  235:getfield        #19  <Field be b>
	//  121  238:getfield        #97  <Field ObjectAnimator be.au>
	//  122  241:aload_0         
	//  123  242:getfield        #19  <Field be b>
	//  124  245:invokevirtual   #65  <Method Resources be.getResources()>
	//  125  248:ldc1            #66  <Int 0x7f0a0005>
	//  126  250:invokevirtual   #72  <Method int Resources.getInteger(int)>
	//  127  253:i2l             
	//  128  254:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  129  257:pop             
		b.aj = new AnimatorSet();
	//  130  258:aload_0         
	//  131  259:getfield        #19  <Field be b>
	//  132  262:new             #99  <Class AnimatorSet>
	//  133  265:dup             
	//  134  266:invokespecial   #100 <Method void AnimatorSet()>
	//  135  269:putfield        #104 <Field AnimatorSet be.aj>
		b.aj.play(((android.animation.Animator) (b.ar))).with(((android.animation.Animator) (b.as))).with(((android.animation.Animator) (b.at)));
	//  136  272:aload_0         
	//  137  273:getfield        #19  <Field be b>
	//  138  276:getfield        #104 <Field AnimatorSet be.aj>
	//  139  279:aload_0         
	//  140  280:getfield        #19  <Field be b>
	//  141  283:getfield        #61  <Field ObjectAnimator be.ar>
	//  142  286:invokevirtual   #108 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  143  289:aload_0         
	//  144  290:getfield        #19  <Field be b>
	//  145  293:getfield        #81  <Field ObjectAnimator be.as>
	//  146  296:invokevirtual   #113 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  147  299:aload_0         
	//  148  300:getfield        #19  <Field be b>
	//  149  303:getfield        #90  <Field ObjectAnimator be.at>
	//  150  306:invokevirtual   #113 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  151  309:pop             
		b.ai = new AnimatorSet();
	//  152  310:aload_0         
	//  153  311:getfield        #19  <Field be b>
	//  154  314:new             #99  <Class AnimatorSet>
	//  155  317:dup             
	//  156  318:invokespecial   #100 <Method void AnimatorSet()>
	//  157  321:putfield        #116 <Field AnimatorSet be.ai>
		b.ai.play(((android.animation.Animator) (b.au)));
	//  158  324:aload_0         
	//  159  325:getfield        #19  <Field be b>
	//  160  328:getfield        #116 <Field AnimatorSet be.ai>
	//  161  331:aload_0         
	//  162  332:getfield        #19  <Field be b>
	//  163  335:getfield        #97  <Field ObjectAnimator be.au>
	//  164  338:invokevirtual   #108 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  165  341:pop             
	//  166  342:return          
	}

	final boolean a;
	final be b;

	be$6(be be1, boolean flag)
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
