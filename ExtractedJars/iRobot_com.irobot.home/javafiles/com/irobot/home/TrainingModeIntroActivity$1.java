// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.view.ViewPager;
import android.support.v4.view.p;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			TrainingModeIntroActivity

class TrainingModeIntroActivity$1
	implements android.support.v4.view.ViewPager.e
{

	public void a(int i)
	{
	//    0    0:return          
	}

	public void a(int i, float f, int j)
	{
		CustomButton custombutton;
		if(i == a.a.getAdapter().getCount() - 1)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #17  <Field TrainingModeIntroActivity a>
	//*   3    5:getfield        #25  <Field ViewPager TrainingModeIntroActivity.a>
	//*   4    8:invokevirtual   #31  <Method p ViewPager.getAdapter()>
	//*   5   11:invokevirtual   #37  <Method int p.getCount()>
	//*   6   14:iconst_1        
	//*   7   15:isub            
	//*   8   16:icmpne          50
		{
			custombutton = a.c;
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field TrainingModeIntroActivity a>
	//   11   23:getfield        #41  <Field CustomButton TrainingModeIntroActivity.c>
	//   12   26:astore          4
			j = 0;
	//   13   28:iconst_0        
	//   14   29:istore_3        
		} else
	//*  15   30:aload           4
	//*  16   32:iload_3         
	//*  17   33:invokevirtual   #46  <Method void CustomButton.setVisibility(int)>
	//*  18   36:aload_0         
	//*  19   37:getfield        #17  <Field TrainingModeIntroActivity a>
	//*  20   40:getfield        #50  <Field CustomTextView TrainingModeIntroActivity.d>
	//*  21   43:iload_3         
	//*  22   44:invokevirtual   #53  <Method void CustomTextView.setVisibility(int)>
	//*  23   47:goto            64
		{
			custombutton = a.c;
	//   24   50:aload_0         
	//   25   51:getfield        #17  <Field TrainingModeIntroActivity a>
	//   26   54:getfield        #41  <Field CustomButton TrainingModeIntroActivity.c>
	//   27   57:astore          4
			j = 4;
	//   28   59:iconst_4        
	//   29   60:istore_3        
		}
		custombutton.setVisibility(j);
		a.d.setVisibility(j);
	//*  30   61:goto            30
		TrainingModeIntroActivity.a(a, i);
	//   31   64:aload_0         
	//   32   65:getfield        #17  <Field TrainingModeIntroActivity a>
	//   33   68:iload_1         
	//   34   69:invokestatic    #56  <Method int TrainingModeIntroActivity.a(TrainingModeIntroActivity, int)>
	//   35   72:pop             
	//   36   73:return          
	}

	public void b(int i)
	{
		TrainingModeIntroActivity.a(a, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TrainingModeIntroActivity a>
	//    2    4:iload_1         
	//    3    5:invokestatic    #56  <Method int TrainingModeIntroActivity.a(TrainingModeIntroActivity, int)>
	//    4    8:pop             
	//    5    9:return          
	}

	final TrainingModeIntroActivity a;

	TrainingModeIntroActivity$1(TrainingModeIntroActivity trainingmodeintroactivity)
	{
		a = trainingmodeintroactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TrainingModeIntroActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
