// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.irobot.home.view.*;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$11 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		super.onAnimationEnd(animator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void AnimatorListenerAdapter.onAnimationEnd(Animator)>
		a.l.setEnabled(true);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field be a>
	//    5    9:getfield        #26  <Field CustomSquaredImageButton be.l>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #32  <Method void CustomSquaredImageButton.setEnabled(boolean)>
		a.n.setEnabled(true);
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field be a>
	//   10   20:getfield        #36  <Field CircleRippleButton be.n>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #39  <Method void CircleRippleButton.setEnabled(boolean)>
		a.n.setClickable(true);
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field be a>
	//   15   31:getfield        #36  <Field CircleRippleButton be.n>
	//   16   34:iconst_1        
	//   17   35:invokevirtual   #42  <Method void CircleRippleButton.setClickable(boolean)>
		a.O.setVisibility(4);
	//   18   38:aload_0         
	//   19   39:getfield        #15  <Field be a>
	//   20   42:getfield        #46  <Field CircleButton be.O>
	//   21   45:iconst_4        
	//   22   46:invokevirtual   #52  <Method void CircleButton.setVisibility(int)>
		a.Q.setVisibility(4);
	//   23   49:aload_0         
	//   24   50:getfield        #15  <Field be a>
	//   25   53:getfield        #55  <Field CircleButton be.Q>
	//   26   56:iconst_4        
	//   27   57:invokevirtual   #52  <Method void CircleButton.setVisibility(int)>
		a.S.setVisibility(4);
	//   28   60:aload_0         
	//   29   61:getfield        #15  <Field be a>
	//   30   64:getfield        #58  <Field CircleButton be.S>
	//   31   67:iconst_4        
	//   32   68:invokevirtual   #52  <Method void CircleButton.setVisibility(int)>
		a.T.setVisibility(4);
	//   33   71:aload_0         
	//   34   72:getfield        #15  <Field be a>
	//   35   75:getfield        #62  <Field PercentageRingView be.T>
	//   36   78:iconst_4        
	//   37   79:invokevirtual   #65  <Method void PercentageRingView.setVisibility(int)>
		be.a(a, true ^ be.c(a));
	//   38   82:aload_0         
	//   39   83:getfield        #15  <Field be a>
	//   40   86:iconst_1        
	//   41   87:aload_0         
	//   42   88:getfield        #15  <Field be a>
	//   43   91:invokestatic    #69  <Method boolean be.c(be)>
	//   44   94:ixor            
	//   45   95:invokestatic    #72  <Method boolean be.a(be, boolean)>
	//   46   98:pop             
		a.ad.setVisibility(0);
	//   47   99:aload_0         
	//   48  100:getfield        #15  <Field be a>
	//   49  103:getfield        #76  <Field BatteryGaugeView be.ad>
	//   50  106:iconst_0        
	//   51  107:invokevirtual   #79  <Method void BatteryGaugeView.setVisibility(int)>
	//   52  110:return          
	}

	public void onAnimationStart(Animator animator)
	{
		super.onAnimationStart(animator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void AnimatorListenerAdapter.onAnimationStart(Animator)>
		a.l.setVisibility(0);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field be a>
	//    5    9:getfield        #26  <Field CustomSquaredImageButton be.l>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #83  <Method void CustomSquaredImageButton.setVisibility(int)>
		a.R.setVisibility(4);
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field be a>
	//   10   20:getfield        #87  <Field CustomTextView be.R>
	//   11   23:iconst_4        
	//   12   24:invokevirtual   #90  <Method void CustomTextView.setVisibility(int)>
		a.N.setVisibility(4);
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field be a>
	//   15   31:getfield        #93  <Field CustomTextView be.N>
	//   16   34:iconst_4        
	//   17   35:invokevirtual   #90  <Method void CustomTextView.setVisibility(int)>
		if(a.n.getAnimationProgress() > 0.0F)
	//*  18   38:aload_0         
	//*  19   39:getfield        #15  <Field be a>
	//*  20   42:getfield        #36  <Field CircleRippleButton be.n>
	//*  21   45:invokevirtual   #97  <Method float CircleRippleButton.getAnimationProgress()>
	//*  22   48:fconst_0        
	//*  23   49:fcmpl           
	//*  24   50:ifle            64
			a.n.setAnimationProgress(0.0F);
	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field be a>
	//   27   57:getfield        #36  <Field CircleRippleButton be.n>
	//   28   60:fconst_0        
	//   29   61:invokevirtual   #101 <Method void CircleRippleButton.setAnimationProgress(float)>
		a.O.setEnabled(false);
	//   30   64:aload_0         
	//   31   65:getfield        #15  <Field be a>
	//   32   68:getfield        #46  <Field CircleButton be.O>
	//   33   71:iconst_0        
	//   34   72:invokevirtual   #102 <Method void CircleButton.setEnabled(boolean)>
		a.Q.setEnabled(false);
	//   35   75:aload_0         
	//   36   76:getfield        #15  <Field be a>
	//   37   79:getfield        #55  <Field CircleButton be.Q>
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #102 <Method void CircleButton.setEnabled(boolean)>
		a.S.setEnabled(false);
	//   40   86:aload_0         
	//   41   87:getfield        #15  <Field be a>
	//   42   90:getfield        #58  <Field CircleButton be.S>
	//   43   93:iconst_0        
	//   44   94:invokevirtual   #102 <Method void CircleButton.setEnabled(boolean)>
		a.T.setClickable(false);
	//   45   97:aload_0         
	//   46   98:getfield        #15  <Field be a>
	//   47  101:getfield        #62  <Field PercentageRingView be.T>
	//   48  104:iconst_0        
	//   49  105:invokevirtual   #103 <Method void PercentageRingView.setClickable(boolean)>
	//   50  108:return          
	}

	final be a;

	be$11(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
