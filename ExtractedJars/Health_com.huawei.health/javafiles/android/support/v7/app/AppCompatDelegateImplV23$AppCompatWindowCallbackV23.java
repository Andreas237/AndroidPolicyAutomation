// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV23

class AppCompatDelegateImplV23$AppCompatWindowCallbackV23 extends AppCompatDelegateImplV14$AppCompatWindowCallbackV14
{

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
	{
		if(isHandleNativeActionModesEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field AppCompatDelegateImplV23 this$0>
	//*   2    4:invokevirtual   #24  <Method boolean AppCompatDelegateImplV23.isHandleNativeActionModesEnabled()>
	//*   3    7:ifeq            37
			switch(i)
	//*   4   10:iload_2         
			{
	//*   5   11:lookupswitch    1: default 28
	//	               0: 31
	//*   6   28:goto            37
			case 0: // '\0'
				return startAsSupportActionMode(callback);
	//    7   31:aload_0         
	//    8   32:aload_1         
	//    9   33:invokevirtual   #27  <Method ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
	//   10   36:areturn         
			}
		return super.onWindowStartingActionMode(callback, i);
	//   11   37:aload_0         
	//   12   38:aload_1         
	//   13   39:iload_2         
	//   14   40:invokespecial   #29  <Method ActionMode AppCompatDelegateImplV14$AppCompatWindowCallbackV14.onWindowStartingActionMode(android.view.ActionMode$Callback, int)>
	//   15   43:areturn         
	}

	final AppCompatDelegateImplV23 this$0;

	AppCompatDelegateImplV23$AppCompatWindowCallbackV23(android.view.Window.Callback callback)
	{
		this$0 = AppCompatDelegateImplV23.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppCompatDelegateImplV23 this$0>
		super(((AppCompatDelegateImplV14) (AppCompatDelegateImplV23.this)), callback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #16  <Method void AppCompatDelegateImplV14$AppCompatWindowCallbackV14(AppCompatDelegateImplV14, android.view.Window$Callback)>
	//    7   11:return          
	}
}
