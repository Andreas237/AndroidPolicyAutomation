// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

class FragmentTransitionCompat21$2
	implements android.transition.
{

	public void onTransitionCancel(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionEnd(Transition transition)
	{
		transition.removeListener(((android.transition.) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #38  <Method Transition Transition.removeListener(android.transition.Transition$TransitionListener)>
	//    3    5:pop             
		val$fragmentView.setVisibility(8);
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field View val$fragmentView>
	//    6   10:bipush          8
	//    7   12:invokevirtual   #44  <Method void View.setVisibility(int)>
		int j = val$exitingViews.size();
	//    8   15:aload_0         
	//    9   16:getfield        #25  <Field ArrayList val$exitingViews>
	//   10   19:invokevirtual   #50  <Method int ArrayList.size()>
	//   11   22:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:iload_3         
	//*  16   27:icmpge          52
			((View)val$exitingViews.get(i)).setVisibility(0);
	//   17   30:aload_0         
	//   18   31:getfield        #25  <Field ArrayList val$exitingViews>
	//   19   34:iload_2         
	//   20   35:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//   21   38:checkcast       #40  <Class View>
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #44  <Method void View.setVisibility(int)>

	//   24   45:iload_2         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_2        
	//*  28   49:goto            25
	//   29   52:return          
	}

	public void onTransitionPause(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionResume(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionStart(Transition transition)
	{
	//    0    0:return          
	}

	final FragmentTransitionCompat21 this$0;
	final ArrayList val$exitingViews;
	final View val$fragmentView;

	FragmentTransitionCompat21$2()
	{
		this$0 = final_fragmenttransitioncompat21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FragmentTransitionCompat21 this$0>
		val$fragmentView = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field View val$fragmentView>
		val$exitingViews = ArrayList.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field ArrayList val$exitingViews>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
