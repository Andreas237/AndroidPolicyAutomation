// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BetaFeaturesActivity

class BetaFeaturesActivity$a$1
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		AnalyticsSubsystem.getInstance().trackLeaveBetaProgramConfirmationButtonPressed(j.j().a());
	//    0    0:invokestatic    #31  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #37  <Method a j.j()>
	//    2    6:invokevirtual   #42  <Method com.irobot.core.AssetInfo a.a()>
	//    3    9:invokevirtual   #46  <Method void AnalyticsSubsystem.trackLeaveBetaProgramConfirmationButtonPressed(com.irobot.core.AssetInfo)>
		com.irobot.home.BetaFeaturesActivity.a(a.a).sendCommand(AccountUIServiceCommand.BetaOptOutConfirmed, ((com.irobot.core.AccountUIServiceData) (null)));
	//    4   12:aload_0         
	//    5   13:getfield        #19  <Field BetaFeaturesActivity$a a>
	//    6   16:getfield        #49  <Field BetaFeaturesActivity com.irobot.home.BetaFeaturesActivity$a.a>
	//    7   19:invokestatic    #52  <Method AccountService com.irobot.home.BetaFeaturesActivity.a(BetaFeaturesActivity)>
	//    8   22:getstatic       #58  <Field AccountUIServiceCommand AccountUIServiceCommand.BetaOptOutConfirmed>
	//    9   25:aconst_null     
	//   10   26:invokevirtual   #64  <Method void AccountService.sendCommand(AccountUIServiceCommand, com.irobot.core.AccountUIServiceData)>
	//   11   29:return          
	}

	final BetaFeaturesActivity.a a;

	BetaFeaturesActivity$a$1(BetaFeaturesActivity.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BetaFeaturesActivity$a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
