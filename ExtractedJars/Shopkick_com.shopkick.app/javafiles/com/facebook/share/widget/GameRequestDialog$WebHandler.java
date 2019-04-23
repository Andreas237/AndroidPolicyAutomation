// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;

// Referenced classes of package com.facebook.share.widget:
//			GameRequestDialog

private class GameRequestDialog$WebHandler extends com.facebook.internal.r
{

	public boolean canShow(GameRequestContent gamerequestcontent, boolean flag)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((GameRequestContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class GameRequestContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #28  <Method boolean canShow(GameRequestContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(GameRequestContent gamerequestcontent)
	{
		GameRequestValidation.validate(gamerequestcontent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method void GameRequestValidation.validate(GameRequestContent)>
		AppCall appcall = createBaseAppCall();
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field GameRequestDialog this$0>
	//    4    8:invokevirtual   #40  <Method AppCall GameRequestDialog.createBaseAppCall()>
	//    5   11:astore_2        
		DialogPresenter.setupAppCallForWebDialog(appcall, "apprequests", WebDialogParameters.create(gamerequestcontent));
	//    6   12:aload_2         
	//    7   13:ldc1            #42  <String "apprequests">
	//    8   15:aload_1         
	//    9   16:invokestatic    #48  <Method android.os.Bundle WebDialogParameters.create(GameRequestContent)>
	//   10   19:invokestatic    #54  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, android.os.Bundle)>
		return appcall;
	//   11   22:aload_2         
	//   12   23:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((GameRequestContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class GameRequestContent>
	//    3    5:invokevirtual   #57  <Method AppCall createAppCall(GameRequestContent)>
	//    4    8:areturn         
	}

	final GameRequestDialog this$0;

	private GameRequestDialog$WebHandler()
	{
		this$0 = GameRequestDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field GameRequestDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (GameRequestDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	GameRequestDialog$WebHandler(GameRequestDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void GameRequestDialog$WebHandler(GameRequestDialog)>
	//    3    5:return          
	}
}
