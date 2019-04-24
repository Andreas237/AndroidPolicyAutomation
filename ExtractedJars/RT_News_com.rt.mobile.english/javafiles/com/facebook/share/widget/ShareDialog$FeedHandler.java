// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.*;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;

// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

private class ShareDialog$FeedHandler extends com.facebook.internal.andler
{

	public boolean canShow(ShareContent sharecontent)
	{
		return (sharecontent instanceof ShareLinkContent) || (sharecontent instanceof ShareFeedContent);
	//    0    0:aload_1         
	//    1    1:instanceof      #25  <Class ShareLinkContent>
	//    2    4:ifne            19
	//    3    7:aload_1         
	//    4    8:instanceof      #27  <Class ShareFeedContent>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public volatile boolean canShow(Object obj)
	{
		return canShow((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ShareContent>
	//    3    5:invokevirtual   #32  <Method boolean canShow(ShareContent)>
	//    4    8:ireturn         
	}

	public AppCall createAppCall(ShareContent sharecontent)
	{
		ShareDialog.access$500(ShareDialog.this, ((android.content.Context) (ShareDialog.access$900(ShareDialog.this))), sharecontent, ShareDialog.Mode.FEED);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ShareDialog this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field ShareDialog this$0>
	//    4    8:invokestatic    #38  <Method android.app.Activity ShareDialog.access$900(ShareDialog)>
	//    5   11:aload_1         
	//    6   12:getstatic       #44  <Field ShareDialog$Mode ShareDialog$Mode.FEED>
	//    7   15:invokestatic    #48  <Method void ShareDialog.access$500(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		AppCall appcall = createBaseAppCall();
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field ShareDialog this$0>
	//   10   22:invokevirtual   #52  <Method AppCall ShareDialog.createBaseAppCall()>
	//   11   25:astore_2        
		if(sharecontent instanceof ShareLinkContent)
	//*  12   26:aload_1         
	//*  13   27:instanceof      #25  <Class ShareLinkContent>
	//*  14   30:ifeq            50
		{
			sharecontent = ((ShareContent) ((ShareLinkContent)sharecontent));
	//   15   33:aload_1         
	//   16   34:checkcast       #25  <Class ShareLinkContent>
	//   17   37:astore_1        
			ShareContentValidation.validateForWebShare(sharecontent);
	//   18   38:aload_1         
	//   19   39:invokestatic    #58  <Method void ShareContentValidation.validateForWebShare(ShareContent)>
			sharecontent = ((ShareContent) (WebDialogParameters.createForFeed(((ShareLinkContent) (sharecontent)))));
	//   20   42:aload_1         
	//   21   43:invokestatic    #64  <Method android.os.Bundle WebDialogParameters.createForFeed(ShareLinkContent)>
	//   22   46:astore_1        
		} else
	//*  23   47:goto            58
		{
			sharecontent = ((ShareContent) (WebDialogParameters.createForFeed((ShareFeedContent)sharecontent)));
	//   24   50:aload_1         
	//   25   51:checkcast       #27  <Class ShareFeedContent>
	//   26   54:invokestatic    #67  <Method android.os.Bundle WebDialogParameters.createForFeed(ShareFeedContent)>
	//   27   57:astore_1        
		}
		DialogPresenter.setupAppCallForWebDialog(appcall, "feed", ((android.os.Bundle) (sharecontent)));
	//   28   58:aload_2         
	//   29   59:ldc1            #69  <String "feed">
	//   30   61:aload_1         
	//   31   62:invokestatic    #75  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, android.os.Bundle)>
		return appcall;
	//   32   65:aload_2         
	//   33   66:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ShareContent>
	//    3    5:invokevirtual   #78  <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.FEED));
	//    0    0:getstatic       #44  <Field ShareDialog$Mode ShareDialog$Mode.FEED>
	//    1    3:areturn         
	}

	final ShareDialog this$0;

	private ShareDialog$FeedHandler()
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

	ShareDialog$FeedHandler(ShareDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ShareDialog$FeedHandler(ShareDialog)>
	//    3    5:return          
	}
}
