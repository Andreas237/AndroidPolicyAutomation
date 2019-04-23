// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.AppGroupCreationContent;

// Referenced classes of package com.facebook.share.widget:
//			CreateAppGroupDialog

private class CreateAppGroupDialog$WebHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
{

	public boolean canShow(AppGroupCreationContent appgroupcreationcontent, boolean flag)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((AppGroupCreationContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class AppGroupCreationContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #28  <Method boolean canShow(AppGroupCreationContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(AppGroupCreationContent appgroupcreationcontent)
	{
		AppCall appcall = createBaseAppCall();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CreateAppGroupDialog this$0>
	//    2    4:invokevirtual   #34  <Method AppCall CreateAppGroupDialog.createBaseAppCall()>
	//    3    7:astore_2        
		DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_create", WebDialogParameters.create(appgroupcreationcontent));
	//    4    8:aload_2         
	//    5    9:ldc1            #36  <String "game_group_create">
	//    6   11:aload_1         
	//    7   12:invokestatic    #42  <Method android.os.Bundle WebDialogParameters.create(AppGroupCreationContent)>
	//    8   15:invokestatic    #48  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, android.os.Bundle)>
		return appcall;
	//    9   18:aload_2         
	//   10   19:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((AppGroupCreationContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class AppGroupCreationContent>
	//    3    5:invokevirtual   #51  <Method AppCall createAppCall(AppGroupCreationContent)>
	//    4    8:areturn         
	}

	final CreateAppGroupDialog this$0;

	private CreateAppGroupDialog$WebHandler()
	{
		this$0 = CreateAppGroupDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CreateAppGroupDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (CreateAppGroupDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	CreateAppGroupDialog$WebHandler(CreateAppGroupDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void CreateAppGroupDialog$WebHandler(CreateAppGroupDialog)>
	//    3    5:return          
	}
}
