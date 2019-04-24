// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.view.ViewGroup;
import com.irobot.home.util.m;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BraavaSetupWelcomeActivity

class BraavaSetupWelcomeActivity$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		int i = ((ViewGroup)view.getParent()).indexOfChild(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method android.view.ViewParent View.getParent()>
	//    2    4:checkcast       #30  <Class ViewGroup>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #34  <Method int ViewGroup.indexOfChild(View)>
	//    5   11:istore_2        
		BraavaSetupWelcomeActivity.a(a, m.a(a.e.size(), i));
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field BraavaSetupWelcomeActivity a>
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field BraavaSetupWelcomeActivity a>
	//   10   20:getfield        #37  <Field List BraavaSetupWelcomeActivity.e>
	//   11   23:invokeinterface #43  <Method int List.size()>
	//   12   28:iload_2         
	//   13   29:invokestatic    #48  <Method int m.a(int, int)>
	//   14   32:invokestatic    #51  <Method void BraavaSetupWelcomeActivity.a(BraavaSetupWelcomeActivity, int)>
	//   15   35:return          
	}

	final BraavaSetupWelcomeActivity a;

	BraavaSetupWelcomeActivity$2(BraavaSetupWelcomeActivity braavasetupwelcomeactivity)
	{
		a = braavasetupwelcomeactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BraavaSetupWelcomeActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
