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

	public boolean canShow(ShareContent sharecontent, boolean flag)
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

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((ShareContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ShareContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #32  <Method boolean canShow(ShareContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(ShareContent sharecontent)
	{
		Object obj = ((Object) (ShareDialog.this));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ShareDialog this$0>
	//    2    4:astore_2        
		ShareDialog.access$600(((ShareDialog) (obj)), ((android.content.Context) (ShareDialog.access$1000(((ShareDialog) (obj))))), sharecontent, ShareDialog.Mode.FEED);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokestatic    #38  <Method android.app.Activity ShareDialog.access$1000(ShareDialog)>
	//    6   10:aload_1         
	//    7   11:getstatic       #44  <Field ShareDialog$Mode ShareDialog$Mode.FEED>
	//    8   14:invokestatic    #48  <Method void ShareDialog.access$600(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		obj = ((Object) (createBaseAppCall()));
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field ShareDialog this$0>
	//   11   21:invokevirtual   #52  <Method AppCall ShareDialog.createBaseAppCall()>
	//   12   24:astore_2        
		if(sharecontent instanceof ShareLinkContent)
	//*  13   25:aload_1         
	//*  14   26:instanceof      #25  <Class ShareLinkContent>
	//*  15   29:ifeq            49
		{
			sharecontent = ((ShareContent) ((ShareLinkContent)sharecontent));
	//   16   32:aload_1         
	//   17   33:checkcast       #25  <Class ShareLinkContent>
	//   18   36:astore_1        
			ShareContentValidation.validateForWebShare(sharecontent);
	//   19   37:aload_1         
	//   20   38:invokestatic    #58  <Method void ShareContentValidation.validateForWebShare(ShareContent)>
			sharecontent = ((ShareContent) (WebDialogParameters.createForFeed(((ShareLinkContent) (sharecontent)))));
	//   21   41:aload_1         
	//   22   42:invokestatic    #64  <Method android.os.Bundle WebDialogParameters.createForFeed(ShareLinkContent)>
	//   23   45:astore_1        
		} else
	//*  24   46:goto            57
		{
			sharecontent = ((ShareContent) (WebDialogParameters.createForFeed((ShareFeedContent)sharecontent)));
	//   25   49:aload_1         
	//   26   50:checkcast       #27  <Class ShareFeedContent>
	//   27   53:invokestatic    #67  <Method android.os.Bundle WebDialogParameters.createForFeed(ShareFeedContent)>
	//   28   56:astore_1        
		}
		DialogPresenter.setupAppCallForWebDialog(((AppCall) (obj)), "feed", ((android.os.Bundle) (sharecontent)));
	//   29   57:aload_2         
	//   30   58:ldc1            #69  <String "feed">
	//   31   60:aload_1         
	//   32   61:invokestatic    #75  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, android.os.Bundle)>
		return ((AppCall) (obj));
	//   33   64:aload_2         
	//   34   65:areturn         
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
