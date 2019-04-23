// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.util.Log;
import android.view.*;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.view.menu:
//			BaseMenuWrapper

public class MenuItemWrapperICS extends BaseMenuWrapper
	implements MenuItem
{

	MenuItemWrapperICS(Context context, b b1)
	{
		super(context, ((Object) (b1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void BaseMenuWrapper(Context, Object)>
	//    4    6:return          
	}

	public boolean collapseActionView()
	{
		return ((b)mWrappedObject).collapseActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #28  <Method boolean b.collapseActionView()>
	//    4   12:ireturn         
	}

	ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
	{
		return new ActionProviderWrapper(mContext, actionprovider);
	//    0    0:new             #32  <Class MenuItemWrapperICS$ActionProviderWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field Context mContext>
	//    5    9:aload_1         
	//    6   10:invokespecial   #39  <Method void MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS, Context, ActionProvider)>
	//    7   13:areturn         
	}

	public boolean expandActionView()
	{
		return ((b)mWrappedObject).expandActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #42  <Method boolean b.expandActionView()>
	//    4   12:ireturn         
	}

	public ActionProvider getActionProvider()
	{
		d d = ((b)mWrappedObject).getSupportActionProvider();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #48  <Method d b.getSupportActionProvider()>
	//    4   12:astore_1        
		if(d instanceof ActionProviderWrapper)
	//*   5   13:aload_1         
	//*   6   14:instanceof      #32  <Class MenuItemWrapperICS$ActionProviderWrapper>
	//*   7   17:ifeq            28
			return ((ActionProviderWrapper)d).mInner;
	//    8   20:aload_1         
	//    9   21:checkcast       #32  <Class MenuItemWrapperICS$ActionProviderWrapper>
	//   10   24:getfield        #52  <Field ActionProvider MenuItemWrapperICS$ActionProviderWrapper.mInner>
	//   11   27:areturn         
		else
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
	}

	public View getActionView()
	{
		View view = ((b)mWrappedObject).getActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #56  <Method View b.getActionView()>
	//    4   12:astore_1        
		if(view instanceof CollapsibleActionViewWrapper)
	//*   5   13:aload_1         
	//*   6   14:instanceof      #58  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//*   7   17:ifeq            28
			return ((CollapsibleActionViewWrapper)view).getWrappedView();
	//    8   20:aload_1         
	//    9   21:checkcast       #58  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//   10   24:invokevirtual   #61  <Method View MenuItemWrapperICS$CollapsibleActionViewWrapper.getWrappedView()>
	//   11   27:areturn         
		else
			return view;
	//   12   28:aload_1         
	//   13   29:areturn         
	}

	public int getAlphabeticModifiers()
	{
		return ((b)mWrappedObject).getAlphabeticModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #65  <Method int b.getAlphabeticModifiers()>
	//    4   12:ireturn         
	}

	public char getAlphabeticShortcut()
	{
		return ((b)mWrappedObject).getAlphabeticShortcut();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #69  <Method char b.getAlphabeticShortcut()>
	//    4   12:ireturn         
	}

	public CharSequence getContentDescription()
	{
		return ((b)mWrappedObject).getContentDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #73  <Method CharSequence b.getContentDescription()>
	//    4   12:areturn         
	}

	public int getGroupId()
	{
		return ((b)mWrappedObject).getGroupId();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #76  <Method int b.getGroupId()>
	//    4   12:ireturn         
	}

	public Drawable getIcon()
	{
		return ((b)mWrappedObject).getIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #80  <Method Drawable b.getIcon()>
	//    4   12:areturn         
	}

	public ColorStateList getIconTintList()
	{
		return ((b)mWrappedObject).getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #84  <Method ColorStateList b.getIconTintList()>
	//    4   12:areturn         
	}

	public android.graphics.PorterDuff.Mode getIconTintMode()
	{
		return ((b)mWrappedObject).getIconTintMode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #88  <Method android.graphics.PorterDuff$Mode b.getIconTintMode()>
	//    4   12:areturn         
	}

	public Intent getIntent()
	{
		return ((b)mWrappedObject).getIntent();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #92  <Method Intent b.getIntent()>
	//    4   12:areturn         
	}

	public int getItemId()
	{
		return ((b)mWrappedObject).getItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #95  <Method int b.getItemId()>
	//    4   12:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return ((b)mWrappedObject).getMenuInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #99  <Method android.view.ContextMenu$ContextMenuInfo b.getMenuInfo()>
	//    4   12:areturn         
	}

	public int getNumericModifiers()
	{
		return ((b)mWrappedObject).getNumericModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #102 <Method int b.getNumericModifiers()>
	//    4   12:ireturn         
	}

	public char getNumericShortcut()
	{
		return ((b)mWrappedObject).getNumericShortcut();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #105 <Method char b.getNumericShortcut()>
	//    4   12:ireturn         
	}

	public int getOrder()
	{
		return ((b)mWrappedObject).getOrder();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #108 <Method int b.getOrder()>
	//    4   12:ireturn         
	}

	public SubMenu getSubMenu()
	{
		return getSubMenuWrapper(((b)mWrappedObject).getSubMenu());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Object mWrappedObject>
	//    3    5:checkcast       #26  <Class b>
	//    4    8:invokeinterface #112 <Method SubMenu b.getSubMenu()>
	//    5   13:invokevirtual   #116 <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    6   16:areturn         
	}

	public CharSequence getTitle()
	{
		return ((b)mWrappedObject).getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #119 <Method CharSequence b.getTitle()>
	//    4   12:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		return ((b)mWrappedObject).getTitleCondensed();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #122 <Method CharSequence b.getTitleCondensed()>
	//    4   12:areturn         
	}

	public CharSequence getTooltipText()
	{
		return ((b)mWrappedObject).getTooltipText();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #125 <Method CharSequence b.getTooltipText()>
	//    4   12:areturn         
	}

	public boolean hasSubMenu()
	{
		return ((b)mWrappedObject).hasSubMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #128 <Method boolean b.hasSubMenu()>
	//    4   12:ireturn         
	}

	public boolean isActionViewExpanded()
	{
		return ((b)mWrappedObject).isActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #131 <Method boolean b.isActionViewExpanded()>
	//    4   12:ireturn         
	}

	public boolean isCheckable()
	{
		return ((b)mWrappedObject).isCheckable();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #134 <Method boolean b.isCheckable()>
	//    4   12:ireturn         
	}

	public boolean isChecked()
	{
		return ((b)mWrappedObject).isChecked();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #137 <Method boolean b.isChecked()>
	//    4   12:ireturn         
	}

	public boolean isEnabled()
	{
		return ((b)mWrappedObject).isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #140 <Method boolean b.isEnabled()>
	//    4   12:ireturn         
	}

	public boolean isVisible()
	{
		return ((b)mWrappedObject).isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:invokeinterface #143 <Method boolean b.isVisible()>
	//    4   12:ireturn         
	}

	public MenuItem setActionProvider(ActionProvider actionprovider)
	{
		b b1 = (b)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:astore_2        
		if(actionprovider != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			actionprovider = ((ActionProvider) (createActionProviderWrapper(actionprovider)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #147 <Method MenuItemWrapperICS$ActionProviderWrapper createActionProviderWrapper(ActionProvider)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            23
			actionprovider = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		b1.setSupportActionProvider(((d) (actionprovider)));
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokeinterface #151 <Method b b.setSupportActionProvider(d)>
	//   16   30:pop             
		return ((MenuItem) (this));
	//   17   31:aload_0         
	//   18   32:areturn         
	}

	public MenuItem setActionView(int i)
	{
		((b)mWrappedObject).setActionView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #155 <Method MenuItem b.setActionView(int)>
	//    5   13:pop             
		View view = ((b)mWrappedObject).getActionView();
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field Object mWrappedObject>
	//    8   18:checkcast       #26  <Class b>
	//    9   21:invokeinterface #56  <Method View b.getActionView()>
	//   10   26:astore_2        
		if(view instanceof CollapsibleActionView)
	//*  11   27:aload_2         
	//*  12   28:instanceof      #157 <Class CollapsibleActionView>
	//*  13   31:ifeq            55
			((b)mWrappedObject).setActionView(((View) (new CollapsibleActionViewWrapper(view))));
	//   14   34:aload_0         
	//   15   35:getfield        #24  <Field Object mWrappedObject>
	//   16   38:checkcast       #26  <Class b>
	//   17   41:new             #58  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//   18   44:dup             
	//   19   45:aload_2         
	//   20   46:invokespecial   #160 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
	//   21   49:invokeinterface #163 <Method MenuItem b.setActionView(View)>
	//   22   54:pop             
		return ((MenuItem) (this));
	//   23   55:aload_0         
	//   24   56:areturn         
	}

	public MenuItem setActionView(View view)
	{
		Object obj = ((Object) (view));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(view instanceof CollapsibleActionView)
	//*   2    2:aload_1         
	//*   3    3:instanceof      #157 <Class CollapsibleActionView>
	//*   4    6:ifeq            18
			obj = ((Object) (new CollapsibleActionViewWrapper(view)));
	//    5    9:new             #58  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #160 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
	//    9   17:astore_2        
		((b)mWrappedObject).setActionView(((View) (obj)));
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field Object mWrappedObject>
	//   12   22:checkcast       #26  <Class b>
	//   13   25:aload_2         
	//   14   26:invokeinterface #163 <Method MenuItem b.setActionView(View)>
	//   15   31:pop             
		return ((MenuItem) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c)
	{
		((b)mWrappedObject).setAlphabeticShortcut(c);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #167 <Method MenuItem b.setAlphabeticShortcut(char)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c, int i)
	{
		((b)mWrappedObject).setAlphabeticShortcut(c, i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #170 <Method MenuItem b.setAlphabeticShortcut(char, int)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		((b)mWrappedObject).setCheckable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #174 <Method MenuItem b.setCheckable(boolean)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setChecked(boolean flag)
	{
		((b)mWrappedObject).setChecked(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #177 <Method MenuItem b.setChecked(boolean)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setContentDescription(CharSequence charsequence)
	{
		((b)mWrappedObject).setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #182 <Method b b.setContentDescription(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setEnabled(boolean flag)
	{
		((b)mWrappedObject).setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #185 <Method MenuItem b.setEnabled(boolean)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public void setExclusiveCheckable(boolean flag)
	{
		try
		{
			if(mSetExclusiveCheckableMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field Method mSetExclusiveCheckableMethod>
	//*   2    4:ifnonnull       36
				mSetExclusiveCheckableMethod = ((Object) ((b)mWrappedObject)).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
					Boolean.TYPE
				});
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Object mWrappedObject>
	//    6   12:checkcast       #26  <Class b>
	//    7   15:invokevirtual   #197 <Method Class Object.getClass()>
	//    8   18:ldc1            #198 <String "setExclusiveCheckable">
	//    9   20:iconst_1        
	//   10   21:anewarray       Class[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:getstatic       #206 <Field Class Boolean.TYPE>
	//   14   29:aastore         
	//   15   30:invokevirtual   #210 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   16   33:putfield        #191 <Field Method mSetExclusiveCheckableMethod>
			mSetExclusiveCheckableMethod.invoke(mWrappedObject, new Object[] {
				Boolean.valueOf(flag)
			});
	//   17   36:aload_0         
	//   18   37:getfield        #191 <Field Method mSetExclusiveCheckableMethod>
	//   19   40:aload_0         
	//   20   41:getfield        #24  <Field Object mWrappedObject>
	//   21   44:iconst_1        
	//   22   45:anewarray       Object[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:iload_1         
	//   26   51:invokestatic    #214 <Method Boolean Boolean.valueOf(boolean)>
	//   27   54:aastore         
	//   28   55:invokevirtual   #220 <Method Object Method.invoke(Object, Object[])>
	//   29   58:pop             
			return;
	//   30   59:return          
		}
		catch(Exception exception)
	//*  31   60:astore_2        
		{
			Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", ((Throwable) (exception)));
	//   32   61:ldc1            #10  <String "MenuItemWrapper">
	//   33   63:ldc1            #222 <String "Error while calling setExclusiveCheckable">
	//   34   65:aload_2         
	//   35   66:invokestatic    #228 <Method int Log.w(String, String, Throwable)>
	//   36   69:pop             
		}
	//   37   70:return          
	}

	public MenuItem setIcon(int i)
	{
		((b)mWrappedObject).setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #231 <Method MenuItem b.setIcon(int)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		((b)mWrappedObject).setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #234 <Method MenuItem b.setIcon(Drawable)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIconTintList(ColorStateList colorstatelist)
	{
		((b)mWrappedObject).setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #238 <Method MenuItem b.setIconTintList(ColorStateList)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode)
	{
		((b)mWrappedObject).setIconTintMode(mode);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #242 <Method MenuItem b.setIconTintMode(android.graphics.PorterDuff$Mode)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		((b)mWrappedObject).setIntent(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #246 <Method MenuItem b.setIntent(Intent)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setNumericShortcut(char c)
	{
		((b)mWrappedObject).setNumericShortcut(c);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #249 <Method MenuItem b.setNumericShortcut(char)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setNumericShortcut(char c, int i)
	{
		((b)mWrappedObject).setNumericShortcut(c, i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #251 <Method MenuItem b.setNumericShortcut(char, int)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		b b1 = (b)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:astore_2        
		if(onactionexpandlistener != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
			onactionexpandlistener = ((android.view.MenuItem.OnActionExpandListener) (new OnActionExpandListenerWrapper(onactionexpandlistener)));
	//    6   12:new             #255 <Class MenuItemWrapperICS$OnActionExpandListenerWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #258 <Method void MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnActionExpandListener)>
	//   11   21:astore_1        
		else
	//*  12   22:goto            27
			onactionexpandlistener = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		b1.setOnActionExpandListener(onactionexpandlistener);
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokeinterface #260 <Method MenuItem b.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
	//   18   34:pop             
		return ((MenuItem) (this));
	//   19   35:aload_0         
	//   20   36:areturn         
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		b b1 = (b)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:astore_2        
		if(onmenuitemclicklistener != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
			onmenuitemclicklistener = ((android.view.MenuItem.OnMenuItemClickListener) (new OnMenuItemClickListenerWrapper(onmenuitemclicklistener)));
	//    6   12:new             #264 <Class MenuItemWrapperICS$OnMenuItemClickListenerWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #267 <Method void MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnMenuItemClickListener)>
	//   11   21:astore_1        
		else
	//*  12   22:goto            27
			onmenuitemclicklistener = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		b1.setOnMenuItemClickListener(onmenuitemclicklistener);
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokeinterface #269 <Method MenuItem b.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   18   34:pop             
		return ((MenuItem) (this));
	//   19   35:aload_0         
	//   20   36:areturn         
	}

	public MenuItem setShortcut(char c, char c1)
	{
		((b)mWrappedObject).setShortcut(c, c1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #273 <Method MenuItem b.setShortcut(char, char)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setShortcut(char c, char c1, int i, int j)
	{
		((b)mWrappedObject).setShortcut(c, c1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokeinterface #276 <Method MenuItem b.setShortcut(char, char, int, int)>
	//    8   17:pop             
		return ((MenuItem) (this));
	//    9   18:aload_0         
	//   10   19:areturn         
	}

	public void setShowAsAction(int i)
	{
		((b)mWrappedObject).setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #280 <Method void b.setShowAsAction(int)>
	//    5   13:return          
	}

	public MenuItem setShowAsActionFlags(int i)
	{
		((b)mWrappedObject).setShowAsActionFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #283 <Method MenuItem b.setShowAsActionFlags(int)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTitle(int i)
	{
		((b)mWrappedObject).setTitle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #286 <Method MenuItem b.setTitle(int)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		((b)mWrappedObject).setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #288 <Method MenuItem b.setTitle(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTitleCondensed(CharSequence charsequence)
	{
		((b)mWrappedObject).setTitleCondensed(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #291 <Method MenuItem b.setTitleCondensed(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTooltipText(CharSequence charsequence)
	{
		((b)mWrappedObject).setTooltipText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:aload_1         
	//    4    8:invokeinterface #294 <Method b b.setTooltipText(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		return ((b)mWrappedObject).setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mWrappedObject>
	//    2    4:checkcast       #26  <Class b>
	//    3    7:iload_1         
	//    4    8:invokeinterface #297 <Method MenuItem b.setVisible(boolean)>
	//    5   13:areturn         
	}

	static final String LOG_TAG = "MenuItemWrapper";
	private Method mSetExclusiveCheckableMethod;

	private class ActionProviderWrapper extends d
	{

		public boolean hasSubMenu()
		{
			return mInner.hasSubMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #24  <Method boolean ActionProvider.hasSubMenu()>
		//    3    7:ireturn         
		}

		public View onCreateActionView()
		{
			return mInner.onCreateActionView();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #28  <Method View ActionProvider.onCreateActionView()>
		//    3    7:areturn         
		}

		public boolean onPerformDefaultAction()
		{
			return mInner.onPerformDefaultAction();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #31  <Method boolean ActionProvider.onPerformDefaultAction()>
		//    3    7:ireturn         
		}

		public void onPrepareSubMenu(SubMenu submenu)
		{
			mInner.onPrepareSubMenu(getSubMenuWrapper(submenu));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ActionProvider mInner>
		//    2    4:aload_0         
		//    3    5:getfield        #12  <Field MenuItemWrapperICS this$0>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #39  <Method SubMenu MenuItemWrapperICS.getSubMenuWrapper(SubMenu)>
		//    6   12:invokevirtual   #41  <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
		//    7   15:return          
		}

		final ActionProvider mInner;
		final MenuItemWrapperICS this$0;

		public ActionProviderWrapper(Context context, ActionProvider actionprovider)
		{
			this$0 = MenuItemWrapperICS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MenuItemWrapperICS this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #15  <Method void d(Context)>
			mInner = actionprovider;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #17  <Field ActionProvider mInner>
		//    9   15:return          
		}
	}


	private class CollapsibleActionViewWrapper extends FrameLayout
		implements android.support.v7.view.CollapsibleActionView
	{

		View getWrappedView()
		{
			return (View)mWrappedView;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field CollapsibleActionView mWrappedView>
		//    2    4:checkcast       #12  <Class View>
		//    3    7:areturn         
		}

		public void onActionViewCollapsed()
		{
			mWrappedView.onActionViewCollapsed();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field CollapsibleActionView mWrappedView>
		//    2    4:invokeinterface #33  <Method void CollapsibleActionView.onActionViewCollapsed()>
		//    3    9:return          
		}

		public void onActionViewExpanded()
		{
			mWrappedView.onActionViewExpanded();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field CollapsibleActionView mWrappedView>
		//    2    4:invokeinterface #36  <Method void CollapsibleActionView.onActionViewExpanded()>
		//    3    9:return          
		}

		final CollapsibleActionView mWrappedView;

		CollapsibleActionViewWrapper(View view)
		{
			super(view.getContext());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #16  <Method Context View.getContext()>
		//    3    5:invokespecial   #19  <Method void FrameLayout(Context)>
			mWrappedView = (CollapsibleActionView)view;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:checkcast       #21  <Class CollapsibleActionView>
		//    7   13:putfield        #23  <Field CollapsibleActionView mWrappedView>
			addView(view);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #26  <Method void addView(View)>
		//   11   21:return          
		}
	}


	private class OnActionExpandListenerWrapper extends BaseWrapper
		implements android.view.MenuItem.OnActionExpandListener
	{

		public boolean onMenuItemActionCollapse(MenuItem menuitem)
		{
			return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionCollapse(getMenuItemWrapper(menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Object mWrappedObject>
		//    2    4:checkcast       #6   <Class android.view.MenuItem$OnActionExpandListener>
		//    3    7:aload_0         
		//    4    8:getfield        #12  <Field MenuItemWrapperICS this$0>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #28  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
		//    7   15:invokeinterface #30  <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
		//    8   20:ireturn         
		}

		public boolean onMenuItemActionExpand(MenuItem menuitem)
		{
			return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionExpand(getMenuItemWrapper(menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Object mWrappedObject>
		//    2    4:checkcast       #6   <Class android.view.MenuItem$OnActionExpandListener>
		//    3    7:aload_0         
		//    4    8:getfield        #12  <Field MenuItemWrapperICS this$0>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #28  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
		//    7   15:invokeinterface #33  <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
		//    8   20:ireturn         
		}

		final MenuItemWrapperICS this$0;

		OnActionExpandListenerWrapper(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
		{
			this$0 = MenuItemWrapperICS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MenuItemWrapperICS this$0>
			super(((Object) (onactionexpandlistener)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #15  <Method void BaseWrapper(Object)>
		//    6   10:return          
		}
	}


	private class OnMenuItemClickListenerWrapper extends BaseWrapper
		implements android.view.MenuItem.OnMenuItemClickListener
	{

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			return ((android.view.MenuItem.OnMenuItemClickListener)mWrappedObject).onMenuItemClick(getMenuItemWrapper(menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Object mWrappedObject>
		//    2    4:checkcast       #6   <Class android.view.MenuItem$OnMenuItemClickListener>
		//    3    7:aload_0         
		//    4    8:getfield        #12  <Field MenuItemWrapperICS this$0>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #28  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
		//    7   15:invokeinterface #30  <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
		//    8   20:ireturn         
		}

		final MenuItemWrapperICS this$0;

		OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
		{
			this$0 = MenuItemWrapperICS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MenuItemWrapperICS this$0>
			super(((Object) (onmenuitemclicklistener)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #15  <Method void BaseWrapper(Object)>
		//    6   10:return          
		}
	}

}
