// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$16
	implements android.content.tener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (BroadcastSetupActivity.s(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:invokestatic    #26  <Method ProvisioningStep BroadcastSetupActivity.s(BroadcastSetupActivity)>
	//    3    7:astore_1        
		if(ProvisioningStep.Undefined != dialoginterface)
	//*   4    8:getstatic       #32  <Field ProvisioningStep ProvisioningStep.Undefined>
	//*   5   11:aload_1         
	//*   6   12:if_acmpeq       22
			AnalyticsSubsystem.getInstance().trackProvCancelButtonPressed(((ProvisioningStep) (dialoginterface)));
	//    7   15:invokestatic    #38  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #42  <Method void AnalyticsSubsystem.trackProvCancelButtonPressed(ProvisioningStep)>
		dialoginterface = ((DialogInterface) (Assembler.getInstance().getAssetSetupUIService()));
	//   10   22:invokestatic    #47  <Method Assembler Assembler.getInstance()>
	//   11   25:invokevirtual   #51  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   12   28:astore_1        
		if(dialoginterface != null)
	//*  13   29:aload_1         
	//*  14   30:ifnull          41
			((AssetSetupUIService) (dialoginterface)).sendCommand(AssetSetupUIServiceCommand.CancelProvisioning, ((com.irobot.core.AssetSetupUIServiceData) (null)));
	//   15   33:aload_1         
	//   16   34:getstatic       #57  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.CancelProvisioning>
	//   17   37:aconst_null     
	//   18   38:invokevirtual   #63  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, com.irobot.core.AssetSetupUIServiceData)>
		a.finish();
	//   19   41:aload_0         
	//   20   42:getfield        #17  <Field BroadcastSetupActivity a>
	//   21   45:invokevirtual   #66  <Method void BroadcastSetupActivity.finish()>
	//   22   48:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$16(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
