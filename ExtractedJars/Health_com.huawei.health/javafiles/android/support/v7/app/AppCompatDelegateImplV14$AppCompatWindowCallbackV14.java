// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV14

class AppCompatDelegateImplV14$AppCompatWindowCallbackV14 extends e
{

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
	{
		if(isHandleNativeActionModesEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field AppCompatDelegateImplV14 this$0>
	//*   2    4:invokevirtual   #23  <Method boolean AppCompatDelegateImplV14.isHandleNativeActionModesEnabled()>
	//*   3    7:ifeq            16
			return startAsSupportActionMode(callback);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #26  <Method ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
	//    7   15:areturn         
		else
			return super.onWindowStartingActionMode(callback);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #28  <Method ActionMode AppCompatDelegateImplBase$AppCompatWindowCallbackBase.onWindowStartingActionMode(android.view.ActionMode$Callback)>
	//   11   21:areturn         
	}

	final ActionMode startAsSupportActionMode(android.view.ActionMode.Callback callback)
	{
		callback = ((android.view.ActionMode.Callback) (new android.support.v7.view.SupportActionModeWrapper.CallbackWrapper(mContext, callback)));
	//    0    0:new             #30  <Class android.support.v7.view.SupportActionModeWrapper$CallbackWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field AppCompatDelegateImplV14 this$0>
	//    4    8:getfield        #34  <Field android.content.Context AppCompatDelegateImplV14.mContext>
	//    5   11:aload_1         
	//    6   12:invokespecial   #37  <Method void android.support.v7.view.SupportActionModeWrapper$CallbackWrapper(android.content.Context, android.view.ActionMode$Callback)>
	//    7   15:astore_1        
		android.support.v7.view.ActionMode actionmode = startSupportActionMode(((android.support.v7.view.ActionMode.Callback) (callback)));
	//    8   16:aload_0         
	//    9   17:getfield        #13  <Field AppCompatDelegateImplV14 this$0>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method android.support.v7.view.ActionMode AppCompatDelegateImplV14.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   12   24:astore_2        
		if(actionmode != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          35
			return ((android.support.v7.view.SupportActionModeWrapper.CallbackWrapper) (callback)).getActionModeWrapper(actionmode);
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #45  <Method ActionMode android.support.v7.view.SupportActionModeWrapper$CallbackWrapper.getActionModeWrapper(android.support.v7.view.ActionMode)>
	//   18   34:areturn         
		else
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
	}

	final AppCompatDelegateImplV14 this$0;

	AppCompatDelegateImplV14$AppCompatWindowCallbackV14(android.view.Window.Callback callback)
	{
		this$0 = AppCompatDelegateImplV14.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppCompatDelegateImplV14 this$0>
		super(((AppCompatDelegateImplBase) (AppCompatDelegateImplV14.this)), callback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #16  <Method void AppCompatDelegateImplBase$AppCompatWindowCallbackBase(AppCompatDelegateImplBase, android.view.Window$Callback)>
	//    7   11:return          
	}
}
