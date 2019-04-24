// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			ResetTableViewActivity

class ResetTableViewActivity$5
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.AssetResetOrRemovalCancelled, ((com.irobot.core.ApplicationUIServiceData) (null)));
	//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AssetResetOrRemovalCancelled>
	//    3    9:aconst_null     
	//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, com.irobot.core.ApplicationUIServiceData)>
		a.d.setVisibility(4);
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field ResetTableViewActivity a>
	//    7   17:getfield        #48  <Field ProgressBar ResetTableViewActivity.d>
	//    8   20:iconst_4        
	//    9   21:invokevirtual   #54  <Method void ProgressBar.setVisibility(int)>
	//   10   24:return          
	}

	final ResetTableViewActivity a;

	ResetTableViewActivity$5(ResetTableViewActivity resettableviewactivity)
	{
		a = resettableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ResetTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
