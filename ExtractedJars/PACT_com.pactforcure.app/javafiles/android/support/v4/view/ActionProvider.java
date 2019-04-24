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
	//*   2    4:ifnull          47
	//*   3    7:aload_1         
	//*   4    8:ifnull          47
			Log.w("ActionProvider(support)", (new StringBuilder()).append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(((Object)this).getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
	//    5   11:ldc1            #14  <String "ActionProvider(support)">
	//    6   13:new             #67  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #68  <Method void StringBuilder()>
	//    9   20:ldc1            #70  <String "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ">
	//   10   22:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #78  <Method Class Object.getClass()>
	//   13   29:invokevirtual   #84  <Method String Class.getSimpleName()>
	//   14   32:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc1            #86  <String " instance while it is still in use somewhere else?">
	//   16   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   17   40:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   18   43:invokestatic    #95  <Method int Log.w(String, String)>
	//   19   46:pop             
		mVisibilityListener = visibilitylistener;
	//   20   47:aload_0         
	//   21   48:aload_1         
	//   22   49:putfield        #45  <Field ActionProvider$VisibilityListener mVisibilityListener>
	//   23   52:return          
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
