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

	private CircularRevealCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static Animator createCircularReveal(CircularRevealWidget circularrevealwidget, float f, float f1, float f2)
	{
		ObjectAnimator objectanimator = ObjectAnimator.ofObject(((Object) (circularrevealwidget)), CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, ((Object []) (new CircularRevealWidget.RevealInfo[] {
			new CircularRevealWidget.RevealInfo(f, f1, f2)
		})));
	//    0    0:aload_0         
	//    1    1:getstatic       #19  <Field android.util.Property CircularRevealWidget$CircularRevealProperty.CIRCULAR_REVEAL>
	//    2    4:getstatic       #24  <Field android.animation.TypeEvaluator CircularRevealWidget$CircularRevealEvaluator.CIRCULAR_REVEAL>
	//    3    7:iconst_1        
	//    4    8:anewarray       CircularRevealWidget.RevealInfo[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:new             #26  <Class CircularRevealWidget$RevealInfo>
	//    8   16:dup             
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:fload_3         
	//   12   20:invokespecial   #29  <Method void CircularRevealWidget$RevealInfo(float, float, float)>
	//   13   23:aastore         
	//   14   24:invokestatic    #35  <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//   15   27:astore          5
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  16   29:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   32:bipush          21
	//*  18   34:icmplt          112
		{
			Object obj = ((Object) (circularrevealwidget.getRevealInfo()));
	//   19   37:aload_0         
	//   20   38:invokeinterface #47  <Method CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
	//   21   43:astore          6
			if(obj != null)
	//*  22   45:aload           6
	//*  23   47:ifnull          102
			{
				float f3 = ((CircularRevealWidget.RevealInfo) (obj)).radius;
	//   24   50:aload           6
	//   25   52:getfield        #51  <Field float CircularRevealWidget$RevealInfo.radius>
	//   26   55:fstore          4
				circularrevealwidget = ((CircularRevealWidget) (ViewAnimationUtils.createCircularReveal((View)circularrevealwidget, (int)f, (int)f1, f3, f2)));
	//   27   57:aload_0         
	//   28   58:checkcast       #53  <Class View>
	//   29   61:fload_1         
	//   30   62:f2i             
	//   31   63:fload_2         
	//   32   64:f2i             
	//   33   65:fload           4
	//   34   67:fload_3         
	//   35   68:invokestatic    #58  <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   36   71:astore_0        
				obj = ((Object) (new AnimatorSet()));
	//   37   72:new             #60  <Class AnimatorSet>
	//   38   75:dup             
	//   39   76:invokespecial   #61  <Method void AnimatorSet()>
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
	//   52   96:invokevirtual   #67  <Method void AnimatorSet.playTogether(Animator[])>
				return ((Animator) (obj));
	//   53   99:aload           6
	//   54  101:areturn         
			} else
			{
				throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
	//   55  102:new             #69  <Class IllegalStateException>
	//   56  105:dup             
	//   57  106:ldc1            #71  <String "Caller must set a non-null RevealInfo before calling this.">
	//   58  108:invokespecial   #74  <Method void IllegalStateException(String)>
	//   59  111:athrow          
			}
		} else
		{
			return ((Animator) (objectanimator));
	//   60  112:aload           5
	//   61  114:areturn         
		}
	}

	public static Animator createCircularReveal(CircularRevealWidget circularrevealwidget, float f, float f1, float f2, float f3)
	{
		ObjectAnimator objectanimator = ObjectAnimator.ofObject(((Object) (circularrevealwidget)), CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, ((Object []) (new CircularRevealWidget.RevealInfo[] {
			new CircularRevealWidget.RevealInfo(f, f1, f2), new CircularRevealWidget.RevealInfo(f, f1, f3)
		})));
	//    0    0:aload_0         
	//    1    1:getstatic       #19  <Field android.util.Property CircularRevealWidget$CircularRevealProperty.CIRCULAR_REVEAL>
	//    2    4:getstatic       #24  <Field android.animation.TypeEvaluator CircularRevealWidget$CircularRevealEvaluator.CIRCULAR_REVEAL>
	//    3    7:iconst_2        
	//    4    8:anewarray       CircularRevealWidget.RevealInfo[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:new             #26  <Class CircularRevealWidget$RevealInfo>
	//    8   16:dup             
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:fload_3         
	//   12   20:invokespecial   #29  <Method void CircularRevealWidget$RevealInfo(float, float, float)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:new             #26  <Class CircularRevealWidget$RevealInfo>
	//   17   29:dup             
	//   18   30:fload_1         
	//   19   31:fload_2         
	//   20   32:fload           4
	//   21   34:invokespecial   #29  <Method void CircularRevealWidget$RevealInfo(float, float, float)>
	//   22   37:aastore         
	//   23   38:invokestatic    #35  <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//   24   41:astore          5
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  25   43:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   46:bipush          21
	//*  27   48:icmplt          96
		{
			circularrevealwidget = ((CircularRevealWidget) (ViewAnimationUtils.createCircularReveal((View)circularrevealwidget, (int)f, (int)f1, f2, f3)));
	//   28   51:aload_0         
	//   29   52:checkcast       #53  <Class View>
	//   30   55:fload_1         
	//   31   56:f2i             
	//   32   57:fload_2         
	//   33   58:f2i             
	//   34   59:fload_3         
	//   35   60:fload           4
	//   36   62:invokestatic    #58  <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   37   65:astore_0        
			AnimatorSet animatorset = new AnimatorSet();
	//   38   66:new             #60  <Class AnimatorSet>
	//   39   69:dup             
	//   40   70:invokespecial   #61  <Method void AnimatorSet()>
	//   41   73:astore          6
			animatorset.playTogether(new Animator[] {
				objectanimator, circularrevealwidget
			});
	//   42   75:aload           6
	//   43   77:iconst_2        
	//   44   78:anewarray       Animator[]
	//   45   81:dup             
	//   46   82:iconst_0        
	//   47   83:aload           5
	//   48   85:aastore         
	//   49   86:dup             
	//   50   87:iconst_1        
	//   51   88:aload_0         
	//   52   89:aastore         
	//   53   90:invokevirtual   #67  <Method void AnimatorSet.playTogether(Animator[])>
			return ((Animator) (animatorset));
	//   54   93:aload           6
	//   55   95:areturn         
		} else
		{
			return ((Animator) (objectanimator));
	//   56   96:aload           5
	//   57   98:areturn         
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
	//    3    5:invokespecial   #80  <Method void CircularRevealCompat$1(CircularRevealWidget)>
	//    4    8:areturn         
	}
}
