// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.*;

// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

private class ShareDialog$WebShareHandler extends com.facebook.internal.er
{

	private String getActionName(ShareContent sharecontent)
	{
		if(sharecontent instanceof ShareLinkContent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #25  <Class ShareLinkContent>
	//*   2    4:ifeq            10
			return "share";
	//    3    7:ldc1            #27  <String "share">
	//    4    9:areturn         
		if(sharecontent instanceof ShareOpenGraphContent)
	//*   5   10:aload_1         
	//*   6   11:instanceof      #29  <Class ShareOpenGraphContent>
	//*   7   14:ifeq            20
			return "share_open_graph";
	//    8   17:ldc1            #31  <String "share_open_graph">
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public boolean canShow(ShareContent sharecontent)
	{
		return sharecontent != null && ShareDialog.access$700(((Object) (sharecontent)).getClass());
	//    0    0:aload_1         
	//    1    1:ifnull          16
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method Class Object.getClass()>
	//    4    8:invokestatic    #43  <Method boolean ShareDialog.access$700(Class)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public volatile boolean canShow(Object obj)
	{
		return canShow((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class ShareContent>
	//    3    5:invokevirtual   #48  <Method boolean canShow(ShareContent)>
	//    4    8:ireturn         
	}

	public AppCall createAppCall(ShareContent sharecontent)
	{
		ShareDialog.access$500(ShareDialog.this, ((android.content.Context) (ShareDialog.access$800(ShareDialog.this))), sharecontent, ShareDialog.Mode.WEB);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ShareDialog this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field ShareDialog this$0>
	//    4    8:invokestatic    #54  <Method android.app.Activity ShareDialog.access$800(ShareDialog)>
	//    5   11:aload_1         
	//    6   12:getstatic       #60  <Field ShareDialog$Mode ShareDialog$Mode.WEB>
	//    7   15:invokestatic    #64  <Method void ShareDialog.access$500(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		AppCall appcall = createBaseAppCall();
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field ShareDialog this$0>
	//   10   22:invokevirtual   #68  <Method AppCall ShareDialog.createBaseAppCall()>
	//   11   25:astore_3        
		ShareContentValidation.validateForWebShare(sharecontent);
	//   12   26:aload_1         
	//   13   27:invokestatic    #74  <Method void ShareContentValidation.validateForWebShare(ShareContent)>
		android.os.Bundle bundle;
		if(sharecontent instanceof ShareLinkContent)
	//*  14   30:aload_1         
	//*  15   31:instanceof      #25  <Class ShareLinkContent>
	//*  16   34:ifeq            48
			bundle = WebDialogParameters.create((ShareLinkContent)sharecontent);
	//   17   37:aload_1         
	//   18   38:checkcast       #25  <Class ShareLinkContent>
	//   19   41:invokestatic    #80  <Method android.os.Bundle WebDialogParameters.create(ShareLinkContent)>
	//   20   44:astore_2        
		else
	//*  21   45:goto            56
			bundle = WebDialogParameters.create((ShareOpenGraphContent)sharecontent);
	//   22   48:aload_1         
	//   23   49:checkcast       #29  <Class ShareOpenGraphContent>
	//   24   52:invokestatic    #83  <Method android.os.Bundle WebDialogParameters.create(ShareOpenGraphContent)>
	//   25   55:astore_2        
		DialogPresenter.setupAppCallForWebDialog(appcall, getActionName(sharecontent), bundle);
	//   26   56:aload_3         
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokespecial   #85  <Method String getActionName(ShareContent)>
	//   30   62:aload_2         
	//   31   63:invokestatic    #91  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, android.os.Bundle)>
		return appcall;
	//   32   66:aload_3         
	//   33   67:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class ShareContent>
	//    3    5:invokevirtual   #94  <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.WEB));
	//    0    0:getstatic       #60  <Field ShareDialog$Mode ShareDialog$Mode.WEB>
	//    1    3:areturn         
	}

	final ShareDialog this$0;

	private ShareDialog$WebShareHandler()
	{
		this$0 = ShareDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ShareDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (ShareDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	ShareDialog$WebShareHandler(ShareDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ShareDialog$WebShareHandler(ShareDialog)>
	//    3    5:return          
	}
}
