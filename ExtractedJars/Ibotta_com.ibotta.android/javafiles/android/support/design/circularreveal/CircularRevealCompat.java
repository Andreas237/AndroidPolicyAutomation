// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.animation.*;
import android.view.View;
import android.view.ViewAnimationUtils;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealWidget

public final class CircularRevealCompat
{

	public static Animator createCircularReveal(CircularRevealWidget circularrevealwidget, float f, float f1, float f2)
	{
		ObjectAnimator objectanimator = ObjectAnimator.ofObject(((Object) (circularrevealwidget)), CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, ((Object []) (new CircularRevealWidget.RevealInfo[] {
			new CircularRevealWidget.RevealInfo(f, f1, f2)
		})));
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field android.util.Property CircularRevealWidget$CircularRevealProperty.CIRCULAR_REVEAL>
	//    2    4:getstatic       #19  <Field android.animation.TypeEvaluator CircularRevealWidget$CircularRevealEvaluator.CIRCULAR_REVEAL>
	//    3    7:iconst_1        
	//    4    8:anewarray       CircularRevealWidget.RevealInfo[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:new             #21  <Class CircularRevealWidget$RevealInfo>
	//    8   16:dup             
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:fload_3         
	//   12   20:invokespecial   #25  <Method void CircularRevealWidget$RevealInfo(float, float, float)>
	//   13   23:aastore         
	//   14   24:invokestatic    #31  <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//   15   27:astore          5
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  16   29:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   32:bipush          21
	//*  18   34:icmplt          112
		{
			Object obj = ((Object) (circularrevealwidget.getRevealInfo()));
	//   19   37:aload_0         
	//   20   38:invokeinterface #43  <Method CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
	//   21   43:astore          6
			if(obj != null)
	//*  22   45:aload           6
	//*  23   47:ifnull          102
			{
				float f3 = ((CircularRevealWidget.RevealInfo) (obj)).radius;
	//   24   50:aload           6
	//   25   52:getfield        #47  <Field float CircularRevealWidget$RevealInfo.radius>
	//   26   55:fstore          4
				circularrevealwidget = ((CircularRevealWidget) (ViewAnimationUtils.createCircularReveal((View)circularrevealwidget, (int)f, (int)f1, f3, f2)));
	//   27   57:aload_0         
	//   28   58:checkcast       #49  <Class View>
	//   29   61:fload_1         
	//   30   62:f2i             
	//   31   63:fload_2         
	//   32   64:f2i             
	//   33   65:fload           4
	//   34   67:fload_3         
	//   35   68:invokestatic    #54  <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   36   71:astore_0        
				obj = ((Object) (new AnimatorSet()));
	//   37   72:new             #56  <Class AnimatorSet>
	//   38   75:dup             
	//   39   76:invokespecial   #59  <Method void AnimatorSet()>
	//   40   79:astore          6
				((AnimatorSet) (obj)).playTogether(new Animator[] {
					objectanimator, circularrevealwidget
				});
	//   41   81:aload           6
	//   42   83:iconst_2        
	//   43   84:anewarray       Animator[]
	//   44   87:dup             
	//   45   88:iconst_0        
	//   46   89:aload           5
	//   47   91:aastore         
	//   48   92:dup             
	//   49   93:iconst_1        
	//   50   94:aload_0         
	//   51   95:aastore         
	//   52   96:invokevirtual   #65  <Method void AnimatorSet.playTogether(Animator[])>
				return ((Animator) (obj));
	//   53   99:aload           6
	//   54  101:areturn         
			} else
			{
				throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
	//   55  102:new             #67  <Class IllegalStateException>
	//   56  105:dup             
	//   57  106:ldc1            #69  <String "Caller must set a non-null RevealInfo before calling this.">
	//   58  108:invokespecial   #72  <Method void IllegalStateException(String)>
	//   59  111:athrow          
			}
		} else
		{
			return ((Animator) (objectanimator));
	//   60  112:aload           5
	//   61  114:areturn         
		}
	}

	public static android.animation.Animator.AnimatorListener createCircularRevealListener(CircularRevealWidget circularrevealwidget)
	{
		return ((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(circularrevealwidget) {

			public void onAnimationEnd(Animator animator)
			{
				view.destroyCircularRevealCache();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CircularRevealWidget val$view>
			//    2    4:invokeinterface #26  <Method void CircularRevealWidget.destroyCircularRevealCache()>
			//    3    9:return          
			}

			public void onAnimationStart(Animator animator)
			{
				view.buildCircularRevealCache();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CircularRevealWidget val$view>
			//    2    4:invokeinterface #30  <Method void CircularRevealWidget.buildCircularRevealCache()>
			//    3    9:return          
			}

			final CircularRevealWidget val$view;

			
			{
				view = circularrevealwidget;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CircularRevealWidget val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class CircularRevealCompat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void CircularRevealCompat$1(CircularRevealWidget)>
	//    4    8:areturn         
	}
}
