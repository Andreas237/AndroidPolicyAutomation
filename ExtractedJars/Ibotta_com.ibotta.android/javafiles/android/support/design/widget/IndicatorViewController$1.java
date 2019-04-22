// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			IndicatorViewController

class IndicatorViewController$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		IndicatorViewController.access$002(IndicatorViewController.this, val$captionToShow);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IndicatorViewController this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int val$captionToShow>
	//    4    8:invokestatic    #39  <Method int IndicatorViewController.access$002(IndicatorViewController, int)>
	//    5   11:pop             
		IndicatorViewController.access$102(IndicatorViewController.this, ((Animator) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field IndicatorViewController this$0>
	//    8   16:aconst_null     
	//    9   17:invokestatic    #43  <Method Animator IndicatorViewController.access$102(IndicatorViewController, Animator)>
	//   10   20:pop             
		animator = ((Animator) (val$captionViewToHide));
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field TextView val$captionViewToHide>
	//   13   25:astore_1        
		if(animator != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          64
		{
			((TextView) (animator)).setVisibility(4);
	//   16   30:aload_1         
	//   17   31:iconst_4        
	//   18   32:invokevirtual   #49  <Method void TextView.setVisibility(int)>
			if(val$captionToHide == 1 && IndicatorViewController.access$200(IndicatorViewController.this) != null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #27  <Field int val$captionToHide>
	//*  21   39:iconst_1        
	//*  22   40:icmpne          64
	//*  23   43:aload_0         
	//*  24   44:getfield        #21  <Field IndicatorViewController this$0>
	//*  25   47:invokestatic    #53  <Method TextView IndicatorViewController.access$200(IndicatorViewController)>
	//*  26   50:ifnull          64
				IndicatorViewController.access$200(IndicatorViewController.this).setText(((CharSequence) (null)));
	//   27   53:aload_0         
	//   28   54:getfield        #21  <Field IndicatorViewController this$0>
	//   29   57:invokestatic    #53  <Method TextView IndicatorViewController.access$200(IndicatorViewController)>
	//   30   60:aconst_null     
	//   31   61:invokevirtual   #57  <Method void TextView.setText(CharSequence)>
		}
	//   32   64:return          
	}

	public void onAnimationStart(Animator animator)
	{
		animator = ((Animator) (val$captionViewToShow));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TextView val$captionViewToShow>
	//    2    4:astore_1        
		if(animator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			((TextView) (animator)).setVisibility(0);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #49  <Method void TextView.setVisibility(int)>
	//    8   14:return          
	}

	final IndicatorViewController this$0;
	final int val$captionToHide;
	final int val$captionToShow;
	final TextView val$captionViewToHide;
	final TextView val$captionViewToShow;

	IndicatorViewController$1()
	{
		this$0 = final_indicatorviewcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field IndicatorViewController this$0>
		val$captionToShow = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int val$captionToShow>
		val$captionViewToHide = textview;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field TextView val$captionViewToHide>
		val$captionToHide = j;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #27  <Field int val$captionToHide>
		val$captionViewToShow = TextView.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #29  <Field TextView val$captionViewToShow>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #32  <Method void AnimatorListenerAdapter()>
	//   17   31:return          
	}
}
