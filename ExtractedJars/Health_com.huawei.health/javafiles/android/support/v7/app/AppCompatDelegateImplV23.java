// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV14, AppCompatCallback

class AppCompatDelegateImplV23 extends AppCompatDelegateImplV14
{
	class AppCompatWindowCallbackV23 extends AppCompatDelegateImplV14.AppCompatWindowCallbackV14
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
		//		               0: 31
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

		AppCompatWindowCallbackV23(android.view.Window.Callback callback)
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


	AppCompatDelegateImplV23(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		super(context, window, appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #16  <Method void AppCompatDelegateImplV14(Context, Window, AppCompatCallback)>
		mUiModeManager = (UiModeManager)context.getSystemService("uimode");
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:ldc1            #18  <String "uimode">
	//    8   11:invokevirtual   #24  <Method Object Context.getSystemService(String)>
	//    9   14:checkcast       #26  <Class UiModeManager>
	//   10   17:putfield        #28  <Field UiModeManager mUiModeManager>
	//   11   20:return          
	}

	int mapNightMode(int i)
	{
		if(i == 0 && mUiModeManager.getNightMode() == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            16
	//*   2    4:aload_0         
	//*   3    5:getfield        #28  <Field UiModeManager mUiModeManager>
	//*   4    8:invokevirtual   #35  <Method int UiModeManager.getNightMode()>
	//*   5   11:ifne            16
			return -1;
	//    6   14:iconst_m1       
	//    7   15:ireturn         
		else
			return super.mapNightMode(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #37  <Method int AppCompatDelegateImplV14.mapNightMode(int)>
	//   11   21:ireturn         
	}

	android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
	{
		return ((android.view.Window.Callback) (new AppCompatWindowCallbackV23(callback)));
	//    0    0:new             #6   <Class AppCompatDelegateImplV23$AppCompatWindowCallbackV23>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #42  <Method void AppCompatDelegateImplV23$AppCompatWindowCallbackV23(AppCompatDelegateImplV23, android.view.Window$Callback)>
	//    5    9:areturn         
	}

	private final UiModeManager mUiModeManager;
}
