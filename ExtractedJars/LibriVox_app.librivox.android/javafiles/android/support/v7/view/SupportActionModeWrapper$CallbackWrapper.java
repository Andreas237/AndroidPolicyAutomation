// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.support.v4.c.a.a;
import android.support.v4.c.a.b;
import android.support.v4.g.w;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view:
//			SupportActionModeWrapper, ActionMode

public class SupportActionModeWrapper$CallbackWrapper
	implements ActionMode.Callback
{

	private Menu getMenuWrapper(Menu menu)
	{
		Menu menu2 = (Menu)mMenus.get(((Object) (menu)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field w mMenus>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method Object w.get(Object)>
	//    4    8:checkcast       #42  <Class Menu>
	//    5   11:astore_3        
		Menu menu1 = menu2;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(menu2 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       40
		{
			menu1 = MenuWrapperFactory.wrapSupportMenu(mContext, (a)menu);
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field Context mContext>
	//   12   22:aload_1         
	//   13   23:checkcast       #44  <Class a>
	//   14   26:invokestatic    #50  <Method Menu MenuWrapperFactory.wrapSupportMenu(Context, a)>
	//   15   29:astore_2        
			mMenus.put(((Object) (menu)), ((Object) (menu1)));
	//   16   30:aload_0         
	//   17   31:getfield        #33  <Field w mMenus>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #54  <Method Object w.put(Object, Object)>
	//   21   39:pop             
		}
		return menu1;
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	public ActionMode getActionModeWrapper(android.support.v7.view.ActionMode actionmode)
	{
		int j = mActionModes.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList mActionModes>
	//    2    4:invokevirtual   #60  <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          52
		{
			SupportActionModeWrapper supportactionmodewrapper = (SupportActionModeWrapper)mActionModes.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field ArrayList mActionModes>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #63  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #65  <Class SupportActionModeWrapper>
	//   14   26:astore          4
			if(supportactionmodewrapper != null && supportactionmodewrapper.mWrappedObject == actionmode)
	//*  15   28:aload           4
	//*  16   30:ifnull          45
	//*  17   33:aload           4
	//*  18   35:getfield        #69  <Field android.support.v7.view.ActionMode SupportActionModeWrapper.mWrappedObject>
	//*  19   38:aload_1         
	//*  20   39:if_acmpne       45
				return ((ActionMode) (supportactionmodewrapper));
	//   21   42:aload           4
	//   22   44:areturn         
		}

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            10
		actionmode = ((android.support.v7.view.ActionMode) (new SupportActionModeWrapper(mContext, actionmode)));
	//   28   52:new             #65  <Class SupportActionModeWrapper>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:getfield        #21  <Field Context mContext>
	//   32   60:aload_1         
	//   33   61:invokespecial   #72  <Method void SupportActionModeWrapper(Context, android.support.v7.view.ActionMode)>
	//   34   64:astore_1        
		mActionModes.add(((Object) (actionmode)));
	//   35   65:aload_0         
	//   36   66:getfield        #28  <Field ArrayList mActionModes>
	//   37   69:aload_1         
	//   38   70:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   39   73:pop             
		return ((ActionMode) (actionmode));
	//   40   74:aload_1         
	//   41   75:areturn         
	}

	public boolean onActionItemClicked(android.support.v7.view.ActionMode actionmode, MenuItem menuitem)
	{
		return mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionmode), MenuWrapperFactory.wrapSupportMenuItem(mContext, (b)menuitem));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.ActionMode$Callback mWrappedCallback>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field Context mContext>
	//    7   13:aload_2         
	//    8   14:checkcast       #82  <Class b>
	//    9   17:invokestatic    #86  <Method MenuItem MenuWrapperFactory.wrapSupportMenuItem(Context, b)>
	//   10   20:invokeinterface #91  <Method boolean android.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
	//   11   25:ireturn         
	}

	public boolean onCreateActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
	{
		return mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.ActionMode$Callback mWrappedCallback>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #95  <Method Menu getMenuWrapper(Menu)>
	//    8   14:invokeinterface #98  <Method boolean android.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//    9   19:ireturn         
	}

	public void onDestroyActionMode(android.support.v7.view.ActionMode actionmode)
	{
		mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionmode));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.ActionMode$Callback mWrappedCallback>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
	//    5    9:invokeinterface #103 <Method void android.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
	//    6   14:return          
	}

	public boolean onPrepareActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
	{
		return mWrappedCallback.onPrepareActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.ActionMode$Callback mWrappedCallback>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #95  <Method Menu getMenuWrapper(Menu)>
	//    8   14:invokeinterface #106 <Method boolean android.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
	//    9   19:ireturn         
	}

	final ArrayList mActionModes = new ArrayList();
	final Context mContext;
	final w mMenus = new w();
	final android.view.ActionMode.Callback mWrappedCallback;

	public SupportActionModeWrapper$CallbackWrapper(Context context, android.view.ActionMode.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Context mContext>
		mWrappedCallback = callback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field android.view.ActionMode$Callback mWrappedCallback>
	//    8   14:aload_0         
	//    9   15:new             #25  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #26  <Method void ArrayList()>
	//   12   22:putfield        #28  <Field ArrayList mActionModes>
	//   13   25:aload_0         
	//   14   26:new             #30  <Class w>
	//   15   29:dup             
	//   16   30:invokespecial   #31  <Method void w()>
	//   17   33:putfield        #33  <Field w mMenus>
	//   18   36:return          
	}
}
