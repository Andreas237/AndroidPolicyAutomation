// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;

// Referenced classes of package com.facebook.share.widget:
//			JoinAppGroupDialog

private class JoinAppGroupDialog$WebHandler extends com.facebook.internal.
{

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((String)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class String>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #28  <Method boolean canShow(String, boolean)>
	//    5    9:ireturn         
	}

	public boolean canShow(String s, boolean flag)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class String>
	//    3    5:invokevirtual   #33  <Method AppCall createAppCall(String)>
	//    4    8:areturn         
	}

	public AppCall createAppCall(String s)
	{
		AppCall appcall = createBaseAppCall();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field JoinAppGroupDialog this$0>
	//    2    4:invokevirtual   #37  <Method AppCall JoinAppGroupDialog.createBaseAppCall()>
	//    3    7:astore_2        
		Bundle bundle = new Bundle();
	//    4    8:new             #39  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #42  <Method void Bundle()>
	//    7   15:astore_3        
		bundle.putString("id", s);
	//    8   16:aload_3         
	//    9   17:ldc1            #44  <String "id">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #48  <Method void Bundle.putString(String, String)>
		DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_join", bundle);
	//   12   23:aload_2         
	//   13   24:ldc1            #50  <String "game_group_join">
	//   14   26:aload_3         
	//   15   27:invokestatic    #56  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
		return appcall;
	//   16   30:aload_2         
	//   17   31:areturn         
	}

	final JoinAppGroupDialog this$0;

	private JoinAppGroupDialog$WebHandler()
	{
		this$0 = JoinAppGroupDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field JoinAppGroupDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (JoinAppGroupDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	JoinAppGroupDialog$WebHandler(JoinAppGroupDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void JoinAppGroupDialog$WebHandler(JoinAppGroupDialog)>
	//    3    5:return          
	}
}
