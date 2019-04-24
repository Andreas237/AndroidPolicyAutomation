// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BetaFeaturesActivity

private class BetaFeaturesActivity$b
	implements com.irobot.home.b.d.b
{

	public void a()
	{
		o.b(BetaFeaturesActivity.g(), "User wants to submit an idea.");
	//    0    0:invokestatic    #26  <Method String BetaFeaturesActivity.g()>
	//    1    3:ldc1            #28  <String "User wants to submit an idea.">
	//    2    5:invokestatic    #33  <Method void o.b(String, String)>
	//    3    8:return          
	}

	public void a(FeatureType featuretype)
	{
		String s = BetaFeaturesActivity.g();
	//    0    0:invokestatic    #26  <Method String BetaFeaturesActivity.g()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("User wants to view details on ");
	//    6   12:aload_3         
	//    7   13:ldc1            #39  <String "User wants to view details on ">
	//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(featuretype.name());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #48  <Method String FeatureType.name()>
	//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		o.b(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #33  <Method void o.b(String, String)>
	//   19   36:return          
	}

	public void a(FeatureType featuretype, boolean flag)
	{
		com.irobot.home.BetaFeaturesActivity.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BetaFeaturesActivity a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #55  <Method void com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity, boolean)>
		AccountUIServiceData accountuiservicedata = AccountUIServiceData.create();
	//    4    8:invokestatic    #61  <Method AccountUIServiceData AccountUIServiceData.create()>
	//    5   11:astore_3        
		accountuiservicedata.setBetaFeatureType(featuretype);
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #64  <Method void AccountUIServiceData.setBetaFeatureType(FeatureType)>
		accountuiservicedata.setBetaFeatureStatus(flag);
	//    9   17:aload_3         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #68  <Method void AccountUIServiceData.setBetaFeatureStatus(boolean)>
		com.irobot.home.BetaFeaturesActivity.a(a).sendCommand(AccountUIServiceCommand.BetaFeatureStatusChanged, accountuiservicedata);
	//   12   22:aload_0         
	//   13   23:getfield        #15  <Field BetaFeaturesActivity a>
	//   14   26:invokestatic    #71  <Method AccountService com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity)>
	//   15   29:getstatic       #77  <Field AccountUIServiceCommand AccountUIServiceCommand.BetaFeatureStatusChanged>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #83  <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
		if(featuretype == FeatureType.WifiMaps)
	//*  18   36:aload_1         
	//*  19   37:getstatic       #87  <Field FeatureType FeatureType.WifiMaps>
	//*  20   40:if_acmpne       56
			AnalyticsSubsystem.getInstance().trackWifiCoverageToggled(j.j().a(), flag);
	//   21   43:invokestatic    #93  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   22   46:invokestatic    #99  <Method a j.j()>
	//   23   49:invokevirtual   #104 <Method com.irobot.core.AssetInfo a.a()>
	//   24   52:iload_2         
	//   25   53:invokevirtual   #108 <Method void AnalyticsSubsystem.trackWifiCoverageToggled(com.irobot.core.AssetInfo, boolean)>
	//   26   56:return          
	}

	final BetaFeaturesActivity a;

	private BetaFeaturesActivity$b(BetaFeaturesActivity betafeaturesactivity)
	{
		a = betafeaturesactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BetaFeaturesActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	BetaFeaturesActivity$b(BetaFeaturesActivity betafeaturesactivity, BetaFeaturesActivity$1 betafeaturesactivity$1)
	{
		this(betafeaturesactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void BetaFeaturesActivity$b(BetaFeaturesActivity)>
	//    3    5:return          
	}
}
