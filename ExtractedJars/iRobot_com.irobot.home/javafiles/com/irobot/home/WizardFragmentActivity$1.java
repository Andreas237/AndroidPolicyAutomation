// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.CompoundButton;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity

class WizardFragmentActivity$1
	implements android.widget.hangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		a.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WizardFragmentActivity a>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #25  <Method void WizardFragmentActivity.a(boolean)>
	//    4    8:return          
	}

	final WizardFragmentActivity a;

	WizardFragmentActivity$1(WizardFragmentActivity wizardfragmentactivity)
	{
		a = wizardfragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WizardFragmentActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
