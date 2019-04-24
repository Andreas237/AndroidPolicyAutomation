// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;

// Referenced classes of package com.irobot.home:
//			MapCustomizationCompleteActivity

class MapCustomizationCompleteActivity$1
	implements android.view.ener
{

	public void onGlobalLayout()
	{
		a.f.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//    2    4:getfield        #25  <Field LinearLayout MapCustomizationCompleteActivity.f>
	//    3    7:invokevirtual   #31  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		a.h = ObjectAnimator.ofFloat(((Object) (a.f)), "translationY", new float[] {
			-400F, 0.0F
		});
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   10   22:getfield        #25  <Field LinearLayout MapCustomizationCompleteActivity.f>
	//   11   25:ldc1            #39  <String "translationY">
	//   12   27:iconst_2        
	//   13   28:newarray        float[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:ldc1            #40  <Float -400F>
	//   17   34:fastore         
	//   18   35:dup             
	//   19   36:iconst_1        
	//   20   37:fconst_0        
	//   21   38:fastore         
	//   22   39:invokestatic    #46  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   23   42:putfield        #50  <Field ObjectAnimator MapCustomizationCompleteActivity.h>
		a.h.setDuration(a.getResources().getInteger(0x7f0a000c));
	//   24   45:aload_0         
	//   25   46:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   26   49:getfield        #50  <Field ObjectAnimator MapCustomizationCompleteActivity.h>
	//   27   52:aload_0         
	//   28   53:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   29   56:invokevirtual   #54  <Method Resources MapCustomizationCompleteActivity.getResources()>
	//   30   59:ldc1            #55  <Int 0x7f0a000c>
	//   31   61:invokevirtual   #61  <Method int Resources.getInteger(int)>
	//   32   64:i2l             
	//   33   65:invokevirtual   #65  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   34   68:pop             
		a.i = ObjectAnimator.ofFloat(((Object) (a.f)), "alpha", new float[] {
			0.0F, 1.0F
		});
	//   35   69:aload_0         
	//   36   70:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   37   73:aload_0         
	//   38   74:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   39   77:getfield        #25  <Field LinearLayout MapCustomizationCompleteActivity.f>
	//   40   80:ldc1            #67  <String "alpha">
	//   41   82:iconst_2        
	//   42   83:newarray        float[]
	//   43   85:dup             
	//   44   86:iconst_0        
	//   45   87:fconst_0        
	//   46   88:fastore         
	//   47   89:dup             
	//   48   90:iconst_1        
	//   49   91:fconst_1        
	//   50   92:fastore         
	//   51   93:invokestatic    #46  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   52   96:putfield        #70  <Field ObjectAnimator MapCustomizationCompleteActivity.i>
		a.i.setDuration(a.getResources().getInteger(0x7f0a000c));
	//   53   99:aload_0         
	//   54  100:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   55  103:getfield        #70  <Field ObjectAnimator MapCustomizationCompleteActivity.i>
	//   56  106:aload_0         
	//   57  107:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   58  110:invokevirtual   #54  <Method Resources MapCustomizationCompleteActivity.getResources()>
	//   59  113:ldc1            #55  <Int 0x7f0a000c>
	//   60  115:invokevirtual   #61  <Method int Resources.getInteger(int)>
	//   61  118:i2l             
	//   62  119:invokevirtual   #65  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   63  122:pop             
		a.g = new AnimatorSet();
	//   64  123:aload_0         
	//   65  124:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   66  127:new             #72  <Class AnimatorSet>
	//   67  130:dup             
	//   68  131:invokespecial   #73  <Method void AnimatorSet()>
	//   69  134:putfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
		a.g.play(((android.animation.Animator) (a.h))).with(((android.animation.Animator) (a.i)));
	//   70  137:aload_0         
	//   71  138:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   72  141:getfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
	//   73  144:aload_0         
	//   74  145:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   75  148:getfield        #50  <Field ObjectAnimator MapCustomizationCompleteActivity.h>
	//   76  151:invokevirtual   #81  <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//   77  154:aload_0         
	//   78  155:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   79  158:getfield        #70  <Field ObjectAnimator MapCustomizationCompleteActivity.i>
	//   80  161:invokevirtual   #86  <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//   81  164:pop             
		a.g.setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator())));
	//   82  165:aload_0         
	//   83  166:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   84  169:getfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
	//   85  172:new             #88  <Class AccelerateDecelerateInterpolator>
	//   86  175:dup             
	//   87  176:invokespecial   #89  <Method void AccelerateDecelerateInterpolator()>
	//   88  179:invokevirtual   #93  <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
		a.g.start();
	//   89  182:aload_0         
	//   90  183:getfield        #17  <Field MapCustomizationCompleteActivity a>
	//   91  186:getfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
	//   92  189:invokevirtual   #96  <Method void AnimatorSet.start()>
	//   93  192:return          
	}

	final MapCustomizationCompleteActivity a;

	MapCustomizationCompleteActivity$1(MapCustomizationCompleteActivity mapcustomizationcompleteactivity)
	{
		a = mapcustomizationcompleteactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MapCustomizationCompleteActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
