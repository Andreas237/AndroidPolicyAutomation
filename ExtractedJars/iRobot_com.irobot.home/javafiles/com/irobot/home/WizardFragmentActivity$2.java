// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.view.View;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity

class WizardFragmentActivity$2
	implements android.view.er
{

	public void onLayoutChange(View view, int i, int k, int l, int i1, int j1, int k1, 
			int l1, int i2)
	{
		view = a.u;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WizardFragmentActivity a>
	//    2    4:getfield        #26  <Field View WizardFragmentActivity.u>
	//    3    7:astore_1        
		float f;
		if(j.a(a.v))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field WizardFragmentActivity a>
	//*   6   12:getfield        #30  <Field android.support.v4.widget.NestedScrollView WizardFragmentActivity.v>
	//*   7   15:invokestatic    #35  <Method boolean j.a(android.support.v4.widget.NestedScrollView)>
	//*   8   18:ifeq            38
			f = a.getResources().getDimension(0x7f070060);
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field WizardFragmentActivity a>
	//   11   25:invokevirtual   #39  <Method Resources WizardFragmentActivity.getResources()>
	//   12   28:ldc1            #40  <Int 0x7f070060>
	//   13   30:invokevirtual   #46  <Method float Resources.getDimension(int)>
	//   14   33:fstore          10
		else
	//*  15   35:goto            41
			f = 0.0F;
	//   16   38:fconst_0        
	//   17   39:fstore          10
		view.setElevation(f);
	//   18   41:aload_1         
	//   19   42:fload           10
	//   20   44:invokevirtual   #52  <Method void View.setElevation(float)>
	//   21   47:return          
	}

	final WizardFragmentActivity a;

	WizardFragmentActivity$2(WizardFragmentActivity wizardfragmentactivity)
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
