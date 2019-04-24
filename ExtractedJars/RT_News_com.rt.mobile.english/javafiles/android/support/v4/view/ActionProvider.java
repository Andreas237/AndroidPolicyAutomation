// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.*;

public abstract class ActionProvider
{
	public static interface SubUiVisibilityListener
	{

		public abstract void onSubUiVisibilityChanged(boolean flag);
	}

	public static interface VisibilityListener
	{

		public abstract void onActionProviderVisibilityChanged(boolean flag);
	}


	public ActionProvider(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Context mContext>
	//    5    9:return          
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Context mContext>
	//    2    4:areturn         
	}

	public boolean hasSubMenu()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public abstract View onCreateActionView();

	public View onCreateActionView(MenuItem menuitem)
	{
		return onCreateActionView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method View onCreateActionView()>
	//    2    4:areturn         
	}

	public boolean onPerformDefaultAction()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onPrepareSubMenu(SubMenu submenu)
	{
	//    0    0:return          
	}

	public boolean overridesItemVisibility()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void refreshVisibility()
	{
		if(mVisibilityListener != null && overridesItemVisibility())
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ActionProvider$VisibilityListener mVisibilityListener>
	//*   2    4:ifnull          27
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #47  <Method boolean overridesItemVisibility()>
	//*   5   11:ifeq            27
			mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field ActionProvider$VisibilityListener mVisibilityListener>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #49  <Method boolean isVisible()>
	//   10   22:invokeinterface #53  <Method void ActionProvider$VisibilityListener.onActionProviderVisibilityChanged(boolean)>
	//   11   27:return          
	}

	public void reset()
	{
		mVisibilityListener = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #45  <Field ActionProvider$VisibilityListener mVisibilityListener>
		mSubUiVisibilityListener = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #60  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
	//    6   10:return          
	}

	public void setSubUiVisibilityListener(SubUiVisibilityListener subuivisibilitylistener)
	{
		mSubUiVisibilityListener = subuivisibilitylistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
	//    3    5:return          
	}

	public void setVisibilityListener(VisibilityListener visibilitylistener)
	{
		if(mVisibilityListener != null && visibilitylistener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ActionProvider$VisibilityListener mVisibilityListener>
	//*   2    4:ifnull          55
	//*   3    7:aload_1         
	//*   4    8:ifnull          55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #67  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #68  <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
	//    9   19:aload_2         
	//   10   20:ldc1            #70  <String "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ">
	//   11   22:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #78  <Method Class Object.getClass()>
	//   16   31:invokevirtual   #84  <Method String Class.getSimpleName()>
	//   17   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(" instance while it is still in use somewhere else?");
	//   19   38:aload_2         
	//   20   39:ldc1            #86  <String " instance while it is still in use somewhere else?">
	//   21   41:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			Log.w("ActionProvider(support)", stringbuilder.toString());
	//   23   45:ldc1            #14  <String "ActionProvider(support)">
	//   24   47:aload_2         
	//   25   48:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #95  <Method int Log.w(String, String)>
	//   27   54:pop             
		}
		mVisibilityListener = visibilitylistener;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:putfield        #45  <Field ActionProvider$VisibilityListener mVisibilityListener>
	//   31   60:return          
	}

	public void subUiVisibilityChanged(boolean flag)
	{
		if(mSubUiVisibilityListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
	//*   2    4:ifnull          17
			mSubUiVisibilityListener.onSubUiVisibilityChanged(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #99  <Method void ActionProvider$SubUiVisibilityListener.onSubUiVisibilityChanged(boolean)>
	//    7   17:return          
	}

	private static final String TAG = "ActionProvider(support)";
	private final Context mContext;
	private SubUiVisibilityListener mSubUiVisibilityListener;
	private VisibilityListener mVisibilityListener;
}
