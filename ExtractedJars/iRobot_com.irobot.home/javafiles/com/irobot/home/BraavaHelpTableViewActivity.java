// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import org.androidannotations.api.b.g;

// Referenced classes of package com.irobot.home:
//			BaseHelpTableActivity

public class BraavaHelpTableViewActivity extends BaseHelpTableActivity
{

	public BraavaHelpTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void BaseHelpTableActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class BraavaHelpTableViewActivity>
	//    4    7:invokevirtual   #22  <Method String Class.getSimpleName()>
	//    5   10:putfield        #24  <Field String v>
	//    6   13:return          
	}

	public void e()
	{
		super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseHelpTableActivity.e()>
		j(0x7f0f00ed);
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <Int 0x7f0f00ed>
	//    4    7:invokevirtual   #33  <Method void j(int)>
		o = new android.content.DialogInterface.OnClickListener(j.a(l).a()) {

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

			
			{
				b = BraavaHelpTableViewActivity.this;
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
;
	//    5   10:aload_0         
	//    6   11:new             #6   <Class BraavaHelpTableViewActivity$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #36  <Field String l>
	//   11   20:invokestatic    #42  <Method a j.a(String)>
	//   12   23:invokevirtual   #47  <Method AssetInfo a.a()>
	//   13   26:invokespecial   #50  <Method void BraavaHelpTableViewActivity$1(BraavaHelpTableViewActivity, AssetInfo)>
	//   14   29:putfield        #54  <Field android.content.DialogInterface$OnClickListener o>
	//   15   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void BaseHelpTableActivity.onResume()>
		boolean flag = Assembler.getInstance().getNetworkUIService(AssetId.assetIdForString(l)).getServiceData().isConnectedLocally();
	//    2    4:invokestatic    #63  <Method Assembler Assembler.getInstance()>
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field String l>
	//    5   11:invokestatic    #69  <Method AssetId AssetId.assetIdForString(String)>
	//    6   14:invokevirtual   #73  <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    7   17:invokevirtual   #79  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//    8   20:invokevirtual   #85  <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//    9   23:istore_2        
		LinearLayout linearlayout = u;
	//   10   24:aload_0         
	//   11   25:getfield        #87  <Field LinearLayout u>
	//   12   28:astore_3        
		byte byte0;
		if(flag)
	//*  13   29:iload_2         
	//*  14   30:ifeq            38
			byte0 = 0;
	//   15   33:iconst_0        
	//   16   34:istore_1        
		else
	//*  17   35:goto            41
			byte0 = 8;
	//   18   38:bipush          8
	//   19   40:istore_1        
		linearlayout.setVisibility(((int) (byte0)));
	//   20   41:aload_3         
	//   21   42:iload_1         
	//   22   43:invokevirtual   #92  <Method void LinearLayout.setVisibility(int)>
	//   23   46:return          
	}

	k t;
	protected LinearLayout u;
	private final String v = ((Class) (com/irobot/home/BraavaHelpTableViewActivity)).getSimpleName();
}
