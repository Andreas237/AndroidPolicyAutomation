// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.CountDownTimer;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity

class WizardFragmentActivity$b extends CountDownTimer
{

	public void onFinish()
	{
		a.s();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WizardFragmentActivity a>
	//    2    4:invokevirtual   #22  <Method void WizardFragmentActivity.s()>
	//    3    7:return          
	}

	public void onTick(long l)
	{
	//    0    0:return          
	}

	final WizardFragmentActivity a;

	public WizardFragmentActivity$b(WizardFragmentActivity wizardfragmentactivity, long l, long l1)
	{
		a = wizardfragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field WizardFragmentActivity a>
		super(l, l1);
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:lload           4
	//    6    9:invokespecial   #16  <Method void CountDownTimer(long, long)>
	//    7   12:return          
	}
}
