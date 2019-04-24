// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.home.IRobotApplication;
import com.irobot.home.SelectRobotTypeActivity_;
import com.irobot.home.g.f;
import com.irobot.home.g.g;
import com.irobot.home.model.IRobotModel;

// Referenced classes of package com.irobot.home.fragments:
//			ag

class ag$3
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		if(a.b.h().b() < 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ag a>
	//*   2    4:getfield        #25  <Field IRobotApplication ag.b>
	//*   3    7:invokevirtual   #31  <Method IRobotModel IRobotApplication.h()>
	//*   4   10:invokevirtual   #36  <Method int IRobotModel.b()>
	//*   5   13:bipush          10
	//*   6   15:icmpge          45
		{
			ag.a(a).y();
	//    7   18:aload_0         
	//    8   19:getfield        #17  <Field ag a>
	//    9   22:invokestatic    #39  <Method ag$a ag.a(ag)>
	//   10   25:invokeinterface #44  <Method void ag$a.y()>
			SelectRobotTypeActivity_.a(((android.content.Context) (a.getActivity()))).a();
	//   11   30:aload_0         
	//   12   31:getfield        #17  <Field ag a>
	//   13   34:invokevirtual   #48  <Method android.app.Activity ag.getActivity()>
	//   14   37:invokestatic    #53  <Method com.irobot.home.SelectRobotTypeActivity_$a SelectRobotTypeActivity_.a(android.content.Context)>
	//   15   40:invokevirtual   #58  <Method org.androidannotations.api.a.e com.irobot.home.SelectRobotTypeActivity_$a.a()>
	//   16   43:pop             
			return;
	//   17   44:return          
		} else
		{
			g.c().a().show(a.getFragmentManager(), ((String) (null)));
	//   18   45:invokestatic    #64  <Method com.irobot.home.g.g$a g.c()>
	//   19   48:invokevirtual   #69  <Method f com.irobot.home.g.g$a.a()>
	//   20   51:aload_0         
	//   21   52:getfield        #17  <Field ag a>
	//   22   55:invokevirtual   #73  <Method android.app.FragmentManager ag.getFragmentManager()>
	//   23   58:aconst_null     
	//   24   59:invokevirtual   #79  <Method void f.show(android.app.FragmentManager, String)>
			return;
	//   25   62:return          
		}
	}

	final ag a;

	ag$3(ag ag1)
	{
		a = ag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ag a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
