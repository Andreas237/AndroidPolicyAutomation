// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;

// Referenced classes of package com.facebook.share.internal:
//			LikeDialog, LikeContent

private class LikeDialog$WebFallbackHandler extends com.facebook.internal.
{

	public boolean canShow(LikeContent likecontent)
	{
		return likecontent != null && LikeDialog.canShowWebFallback();
	//    0    0:aload_1         
	//    1    1:ifnull          12
	//    2    4:invokestatic    #27  <Method boolean LikeDialog.canShowWebFallback()>
	//    3    7:ifeq            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public volatile boolean canShow(Object obj)
	{
		return canShow((LikeContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class LikeContent>
	//    3    5:invokevirtual   #32  <Method boolean canShow(LikeContent)>
	//    4    8:ireturn         
	}

	public AppCall createAppCall(LikeContent likecontent)
	{
		AppCall appcall = createBaseAppCall();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field LikeDialog this$0>
	//    2    4:invokevirtual   #38  <Method AppCall LikeDialog.createBaseAppCall()>
	//    3    7:astore_2        
		DialogPresenter.setupAppCallForWebFallbackDialog(appcall, LikeDialog.access$200(likecontent), LikeDialog.access$300());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokestatic    #42  <Method android.os.Bundle LikeDialog.access$200(LikeContent)>
	//    7   13:invokestatic    #46  <Method com.facebook.internal.DialogFeature LikeDialog.access$300()>
	//    8   16:invokestatic    #52  <Method void DialogPresenter.setupAppCallForWebFallbackDialog(AppCall, android.os.Bundle, com.facebook.internal.DialogFeature)>
		return appcall;
	//    9   19:aload_2         
	//   10   20:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((LikeContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class LikeContent>
	//    3    5:invokevirtual   #55  <Method AppCall createAppCall(LikeContent)>
	//    4    8:areturn         
	}

	final LikeDialog this$0;

	private LikeDialog$WebFallbackHandler()
	{
		this$0 = LikeDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LikeDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (LikeDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	LikeDialog$WebFallbackHandler(LikeDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void LikeDialog$WebFallbackHandler(LikeDialog)>
	//    3    5:return          
	}
}
