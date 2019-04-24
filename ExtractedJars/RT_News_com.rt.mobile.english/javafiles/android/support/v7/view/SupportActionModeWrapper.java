// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view:
//			ActionMode

public class SupportActionModeWrapper extends ActionMode
{
	public static class CallbackWrapper
		implements ActionMode.Callback
	{

		private Menu getMenuWrapper(Menu menu)
		{
			Menu menu2 = (Menu)mMenus.get(((Object) (menu)));
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field SimpleArrayMap mMenus>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #49  <Method Object SimpleArrayMap.get(Object)>
		//    4    8:checkcast       #51  <Class Menu>
		//    5   11:astore_3        
			Menu menu1 = menu2;
		//    6   12:aload_3         
		//    7   13:astore_2        
			if(menu2 == null)
		//*   8   14:aload_3         
		//*   9   15:ifnonnull       40
			{
				menu1 = MenuWrapperFactory.wrapSupportMenu(mContext, (SupportMenu)menu);
		//   10   18:aload_0         
		//   11   19:getfield        #30  <Field Context mContext>
		//   12   22:aload_1         
		//   13   23:checkcast       #53  <Class SupportMenu>
		//   14   26:invokestatic    #59  <Method Menu MenuWrapperFactory.wrapSupportMenu(Context, SupportMenu)>
		//   15   29:astore_2        
				mMenus.put(((Object) (menu)), ((Object) (menu1)));
		//   16   30:aload_0         
		//   17   31:getfield        #42  <Field SimpleArrayMap mMenus>
		//   18   34:aload_1         
		//   19   35:aload_2         
		//   20   36:invokevirtual   #63  <Method Object SimpleArrayMap.put(Object, Object)>
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
		//    1    1:getfield        #37  <Field ArrayList mActionModes>
		//    2    4:invokevirtual   #69  <Method int ArrayList.size()>
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
		//   10   16:getfield        #37  <Field ArrayList mActionModes>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #72  <Method Object ArrayList.get(int)>
		//   13   23:checkcast       #8   <Class SupportActionModeWrapper>
		//   14   26:astore          4
				if(supportactionmodewrapper != null && supportactionmodewrapper.mWrappedObject == actionmode)
		//*  15   28:aload           4
		//*  16   30:ifnull          45
		//*  17   33:aload           4
		//*  18   35:getfield        #76  <Field android.support.v7.view.ActionMode SupportActionModeWrapper.mWrappedObject>
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
		//   28   52:new             #8   <Class SupportActionModeWrapper>
		//   29   55:dup             
		//   30   56:aload_0         
		//   31   57:getfield        #30  <Field Context mContext>
		//   32   60:aload_1         
		//   33   61:invokespecial   #79  <Method void SupportActionModeWrapper(Context, android.support.v7.view.ActionMode)>
		//   34   64:astore_1        
			mActionModes.add(((Object) (actionmode)));
		//   35   65:aload_0         
		//   36   66:getfield        #37  <Field ArrayList mActionModes>
		//   37   69:aload_1         
		//   38   70:invokevirtual   #83  <Method boolean ArrayList.add(Object)>
		//   39   73:pop             
			return ((ActionMode) (actionmode));
		//   40   74:aload_1         
		//   41   75:areturn         
		}

		public boolean onActionItemClicked(android.support.v7.view.ActionMode actionmode, MenuItem menuitem)
		{
			return mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionmode), MenuWrapperFactory.wrapSupportMenuItem(mContext, (SupportMenuItem)menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.view.ActionMode$Callback mWrappedCallback>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #87  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
		//    5    9:aload_0         
		//    6   10:getfield        #30  <Field Context mContext>
		//    7   13:aload_2         
		//    8   14:checkcast       #89  <Class SupportMenuItem>
		//    9   17:invokestatic    #93  <Method MenuItem MenuWrapperFactory.wrapSupportMenuItem(Context, SupportMenuItem)>
		//   10   20:invokeinterface #98  <Method boolean android.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
		//   11   25:ireturn         
		}

		public boolean onCreateActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
		{
			return mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.view.ActionMode$Callback mWrappedCallback>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #87  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokespecial   #102 <Method Menu getMenuWrapper(Menu)>
		//    8   14:invokeinterface #105 <Method boolean android.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
		//    9   19:ireturn         
		}

		public void onDestroyActionMode(android.support.v7.view.ActionMode actionmode)
		{
			mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionmode));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.view.ActionMode$Callback mWrappedCallback>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #87  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
		//    5    9:invokeinterface #110 <Method void android.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
		//    6   14:return          
		}

		public boolean onPrepareActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
		{
			return mWrappedCallback.onPrepareActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.view.ActionMode$Callback mWrappedCallback>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #87  <Method ActionMode getActionModeWrapper(android.support.v7.view.ActionMode)>
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokespecial   #102 <Method Menu getMenuWrapper(Menu)>
		//    8   14:invokeinterface #113 <Method boolean android.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
		//    9   19:ireturn         
		}

		final ArrayList mActionModes = new ArrayList();
		final Context mContext;
		final SimpleArrayMap mMenus = new SimpleArrayMap();
		final android.view.ActionMode.Callback mWrappedCallback;

		public CallbackWrapper(Context context, android.view.ActionMode.Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			mContext = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field Context mContext>
			mWrappedCallback = callback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #32  <Field android.view.ActionMode$Callback mWrappedCallback>
		//    8   14:aload_0         
		//    9   15:new             #34  <Class ArrayList>
		//   10   18:dup             
		//   11   19:invokespecial   #35  <Method void ArrayList()>
		//   12   22:putfield        #37  <Field ArrayList mActionModes>
		//   13   25:aload_0         
		//   14   26:new             #39  <Class SimpleArrayMap>
		//   15   29:dup             
		//   16   30:invokespecial   #40  <Method void SimpleArrayMap()>
		//   17   33:putfield        #42  <Field SimpleArrayMap mMenus>
		//   18   36:return          
		}
	}


	public SupportActionModeWrapper(Context context, android.support.v7.view.ActionMode actionmode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ActionMode()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context mContext>
		mWrappedObject = actionmode;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    8   14:return          
	}

	public void finish()
	{
		mWrappedObject.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #30  <Method void ActionMode.finish()>
	//    3    7:return          
	}

	public View getCustomView()
	{
		return mWrappedObject.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #34  <Method View ActionMode.getCustomView()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return MenuWrapperFactory.wrapSupportMenu(mContext, (SupportMenu)mWrappedObject.getMenu());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    4    8:invokevirtual   #38  <Method Menu ActionMode.getMenu()>
	//    5   11:checkcast       #40  <Class SupportMenu>
	//    6   14:invokestatic    #46  <Method Menu MenuWrapperFactory.wrapSupportMenu(Context, SupportMenu)>
	//    7   17:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return mWrappedObject.getMenuInflater();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #50  <Method MenuInflater ActionMode.getMenuInflater()>
	//    3    7:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mWrappedObject.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #54  <Method CharSequence ActionMode.getSubtitle()>
	//    3    7:areturn         
	}

	public Object getTag()
	{
		return mWrappedObject.getTag();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #58  <Method Object ActionMode.getTag()>
	//    3    7:areturn         
	}

	public CharSequence getTitle()
	{
		return mWrappedObject.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #61  <Method CharSequence ActionMode.getTitle()>
	//    3    7:areturn         
	}

	public boolean getTitleOptionalHint()
	{
		return mWrappedObject.getTitleOptionalHint();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #65  <Method boolean ActionMode.getTitleOptionalHint()>
	//    3    7:ireturn         
	}

	public void invalidate()
	{
		mWrappedObject.invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #68  <Method void ActionMode.invalidate()>
	//    3    7:return          
	}

	public boolean isTitleOptional()
	{
		return mWrappedObject.isTitleOptional();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #71  <Method boolean ActionMode.isTitleOptional()>
	//    3    7:ireturn         
	}

	public void setCustomView(View view)
	{
		mWrappedObject.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #75  <Method void ActionMode.setCustomView(View)>
	//    4    8:return          
	}

	public void setSubtitle(int i)
	{
		mWrappedObject.setSubtitle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #79  <Method void ActionMode.setSubtitle(int)>
	//    4    8:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mWrappedObject.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method void ActionMode.setSubtitle(CharSequence)>
	//    4    8:return          
	}

	public void setTag(Object obj)
	{
		mWrappedObject.setTag(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #86  <Method void ActionMode.setTag(Object)>
	//    4    8:return          
	}

	public void setTitle(int i)
	{
		mWrappedObject.setTitle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #89  <Method void ActionMode.setTitle(int)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mWrappedObject.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method void ActionMode.setTitle(CharSequence)>
	//    4    8:return          
	}

	public void setTitleOptionalHint(boolean flag)
	{
		mWrappedObject.setTitleOptionalHint(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #95  <Method void ActionMode.setTitleOptionalHint(boolean)>
	//    4    8:return          
	}

	final Context mContext;
	final android.support.v7.view.ActionMode mWrappedObject;
}
