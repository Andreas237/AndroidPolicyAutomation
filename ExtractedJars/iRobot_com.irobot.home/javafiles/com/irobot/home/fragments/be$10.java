// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.irobot.home.view.*;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$10 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		super.onAnimationEnd(animator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void AnimatorListenerAdapter.onAnimationEnd(Animator)>
		a.Q.setEnabled(true);
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field be a>
	//    5    9:getfield        #25  <Field CircleButton be.Q>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
		a.S.setEnabled(true);
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field be a>
	//   10   20:getfield        #34  <Field CircleButton be.S>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
		a.l.setVisibility(4);
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field be a>
	//   15   31:getfield        #38  <Field CustomSquaredImageButton be.l>
	//   16   34:iconst_4        
	//   17   35:invokevirtual   #44  <Method void CustomSquaredImageButton.setVisibility(int)>
		be.a(a, be.c(a) ^ true);
	//   18   38:aload_0         
	//   19   39:getfield        #14  <Field be a>
	//   20   42:aload_0         
	//   21   43:getfield        #14  <Field be a>
	//   22   46:invokestatic    #48  <Method boolean be.c(be)>
	//   23   49:iconst_1        
	//   24   50:ixor            
	//   25   51:invokestatic    #51  <Method boolean be.a(be, boolean)>
	//   26   54:pop             
		if(a.W.getVisibility() == 0)
	//*  27   55:aload_0         
	//*  28   56:getfield        #14  <Field be a>
	//*  29   59:getfield        #55  <Field HideableView be.W>
	//*  30   62:invokevirtual   #61  <Method int HideableView.getVisibility()>
	//*  31   65:ifne            90
		{
			a.T.setClickable(true);
	//   32   68:aload_0         
	//   33   69:getfield        #14  <Field be a>
	//   34   72:getfield        #65  <Field PercentageRingView be.T>
	//   35   75:iconst_1        
	//   36   76:invokevirtual   #70  <Method void PercentageRingView.setClickable(boolean)>
			a.O.setEnabled(false);
	//   37   79:aload_0         
	//   38   80:getfield        #14  <Field be a>
	//   39   83:getfield        #73  <Field CircleButton be.O>
	//   40   86:iconst_0        
	//   41   87:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
		}
		if(a.X.getVisibility() == 0)
	//*  42   90:aload_0         
	//*  43   91:getfield        #14  <Field be a>
	//*  44   94:getfield        #76  <Field HideableView be.X>
	//*  45   97:invokevirtual   #61  <Method int HideableView.getVisibility()>
	//*  46  100:ifne            125
		{
			a.T.setClickable(false);
	//   47  103:aload_0         
	//   48  104:getfield        #14  <Field be a>
	//   49  107:getfield        #65  <Field PercentageRingView be.T>
	//   50  110:iconst_0        
	//   51  111:invokevirtual   #70  <Method void PercentageRingView.setClickable(boolean)>
			a.O.setEnabled(true);
	//   52  114:aload_0         
	//   53  115:getfield        #14  <Field be a>
	//   54  118:getfield        #73  <Field CircleButton be.O>
	//   55  121:iconst_1        
	//   56  122:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
		}
	//   57  125:return          
	}

	public void onAnimationStart(Animator animator)
	{
		super.onAnimationStart(animator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void AnimatorListenerAdapter.onAnimationStart(Animator)>
		a.l.setEnabled(false);
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field be a>
	//    5    9:getfield        #38  <Field CustomSquaredImageButton be.l>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #80  <Method void CustomSquaredImageButton.setEnabled(boolean)>
		a.n.setEnabled(false);
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field be a>
	//   10   20:getfield        #84  <Field CircleRippleButton be.n>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #87  <Method void CircleRippleButton.setEnabled(boolean)>
		a.n.setClickable(false);
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field be a>
	//   15   31:getfield        #84  <Field CircleRippleButton be.n>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #88  <Method void CircleRippleButton.setClickable(boolean)>
		if(a.n.getAnimationProgress() > 0.0F)
	//*  18   38:aload_0         
	//*  19   39:getfield        #14  <Field be a>
	//*  20   42:getfield        #84  <Field CircleRippleButton be.n>
	//*  21   45:invokevirtual   #92  <Method float CircleRippleButton.getAnimationProgress()>
	//*  22   48:fconst_0        
	//*  23   49:fcmpl           
	//*  24   50:ifle            64
			a.n.setAnimationProgress(0.0F);
	//   25   53:aload_0         
	//   26   54:getfield        #14  <Field be a>
	//   27   57:getfield        #84  <Field CircleRippleButton be.n>
	//   28   60:fconst_0        
	//   29   61:invokevirtual   #96  <Method void CircleRippleButton.setAnimationProgress(float)>
		a.R.setVisibility(0);
	//   30   64:aload_0         
	//   31   65:getfield        #14  <Field be a>
	//   32   68:getfield        #100 <Field CustomTextView be.R>
	//   33   71:iconst_0        
	//   34   72:invokevirtual   #103 <Method void CustomTextView.setVisibility(int)>
		a.N.setVisibility(0);
	//   35   75:aload_0         
	//   36   76:getfield        #14  <Field be a>
	//   37   79:getfield        #106 <Field CustomTextView be.N>
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #103 <Method void CustomTextView.setVisibility(int)>
		a.O.setVisibility(0);
	//   40   86:aload_0         
	//   41   87:getfield        #14  <Field be a>
	//   42   90:getfield        #73  <Field CircleButton be.O>
	//   43   93:iconst_0        
	//   44   94:invokevirtual   #107 <Method void CircleButton.setVisibility(int)>
		a.Q.setVisibility(0);
	//   45   97:aload_0         
	//   46   98:getfield        #14  <Field be a>
	//   47  101:getfield        #25  <Field CircleButton be.Q>
	//   48  104:iconst_0        
	//   49  105:invokevirtual   #107 <Method void CircleButton.setVisibility(int)>
		a.S.setVisibility(0);
	//   50  108:aload_0         
	//   51  109:getfield        #14  <Field be a>
	//   52  112:getfield        #34  <Field CircleButton be.S>
	//   53  115:iconst_0        
	//   54  116:invokevirtual   #107 <Method void CircleButton.setVisibility(int)>
		a.T.setVisibility(0);
	//   55  119:aload_0         
	//   56  120:getfield        #14  <Field be a>
	//   57  123:getfield        #65  <Field PercentageRingView be.T>
	//   58  126:iconst_0        
	//   59  127:invokevirtual   #108 <Method void PercentageRingView.setVisibility(int)>
		a.ad.setVisibility(4);
	//   60  130:aload_0         
	//   61  131:getfield        #14  <Field be a>
	//   62  134:getfield        #112 <Field BatteryGaugeView be.ad>
	//   63  137:iconst_4        
	//   64  138:invokevirtual   #115 <Method void BatteryGaugeView.setVisibility(int)>
	//   65  141:return          
	}

	final be a;

	be$10(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
