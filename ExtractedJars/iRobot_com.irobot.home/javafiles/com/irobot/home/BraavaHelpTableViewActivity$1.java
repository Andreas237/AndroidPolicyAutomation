// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.AssetInfo;
import com.irobot.home.util.k;
import org.androidannotations.api.b.g;

// Referenced classes of package com.irobot.home:
//			BraavaHelpTableViewActivity

class BraavaHelpTableViewActivity$1
	implements android.content.r
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.t.d().b(((Object) (Integer.valueOf(0))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BraavaHelpTableViewActivity b>
	//    2    4:getfield        #30  <Field k BraavaHelpTableViewActivity.t>
	//    3    7:invokevirtual   #36  <Method g k.d()>
	//    4   10:iconst_0        
	//    5   11:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//    6   14:invokevirtual   #47  <Method void g.b(Object)>
		b.t.a().n();
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field BraavaHelpTableViewActivity b>
	//    9   21:getfield        #30  <Field k BraavaHelpTableViewActivity.t>
	//   10   24:invokevirtual   #50  <Method com.irobot.home.util.k$a k.a()>
	//   11   27:invokevirtual   #55  <Method void com.irobot.home.util.k$a.n()>
		dialoginterface.dismiss();
	//   12   30:aload_1         
	//   13   31:invokeinterface #60  <Method void DialogInterface.dismiss()>
		AnalyticsSubsystem.getInstance().trackReActivateAppOverviewPressed(a);
	//   14   36:invokestatic    #66  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   15   39:aload_0         
	//   16   40:getfield        #21  <Field AssetInfo a>
	//   17   43:invokevirtual   #70  <Method void AnalyticsSubsystem.trackReActivateAppOverviewPressed(AssetInfo)>
	//   18   46:return          
	}

	final AssetInfo a;
	final BraavaHelpTableViewActivity b;

	BraavaHelpTableViewActivity$1(BraavaHelpTableViewActivity braavahelptableviewactivity, AssetInfo assetinfo)
	{
		b = braavahelptableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaHelpTableViewActivity b>
		a = assetinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AssetInfo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
