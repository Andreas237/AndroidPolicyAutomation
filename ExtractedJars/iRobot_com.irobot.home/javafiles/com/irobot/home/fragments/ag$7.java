// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.home.AccountOverviewActivity_;

// Referenced classes of package com.irobot.home.fragments:
//			ag

class ag$7
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		AccountOverviewActivity_.a(((android.content.Context) (a.getActivity()))).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ag a>
	//    2    4:invokevirtual   #26  <Method android.app.Activity ag.getActivity()>
	//    3    7:invokestatic    #31  <Method com.irobot.home.AccountOverviewActivity_$a AccountOverviewActivity_.a(android.content.Context)>
	//    4   10:invokevirtual   #36  <Method org.androidannotations.api.a.e com.irobot.home.AccountOverviewActivity_$a.a()>
	//    5   13:pop             
	//    6   14:return          
	}

	final ag a;

	ag$7(ag ag1)
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
