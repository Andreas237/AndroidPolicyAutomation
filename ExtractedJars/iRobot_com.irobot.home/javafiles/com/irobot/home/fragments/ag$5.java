// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.home.BugReportActivity_;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			ag

class ag$5
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		BugReportActivity_.a(((android.content.Context) (a.getActivity()))).a(j.j().a().getAssetId().getId()).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ag a>
	//    2    4:invokevirtual   #26  <Method android.app.Activity ag.getActivity()>
	//    3    7:invokestatic    #31  <Method com.irobot.home.BugReportActivity_$a BugReportActivity_.a(android.content.Context)>
	//    4   10:invokestatic    #37  <Method a j.j()>
	//    5   13:invokevirtual   #42  <Method AssetInfo a.a()>
	//    6   16:invokevirtual   #48  <Method AssetId AssetInfo.getAssetId()>
	//    7   19:invokevirtual   #54  <Method String AssetId.getId()>
	//    8   22:invokevirtual   #59  <Method com.irobot.home.BugReportActivity_$a com.irobot.home.BugReportActivity_$a.a(String)>
	//    9   25:invokevirtual   #62  <Method org.androidannotations.api.a.e com.irobot.home.BugReportActivity_$a.a()>
	//   10   28:pop             
	//   11   29:return          
	}

	final ag a;

	ag$5(ag ag1)
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
