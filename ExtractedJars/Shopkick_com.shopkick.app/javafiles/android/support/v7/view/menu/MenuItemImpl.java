// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.content.res.AppCompatResources;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.view.menu:
//			MenuBuilder, SubMenuBuilder

public final class MenuItemImpl
	implements SupportMenuItem
{

	MenuItemImpl(MenuBuilder menubuilder, int i, int j, int k, int l, CharSequence charsequence, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		mShortcutNumericModifiers = 4096;
	//    2    4:aload_0         
	//    3    5:sipush          4096
	//    4    8:putfield        #86  <Field int mShortcutNumericModifiers>
		mShortcutAlphabeticModifiers = 4096;
	//    5   11:aload_0         
	//    6   12:sipush          4096
	//    7   15:putfield        #88  <Field int mShortcutAlphabeticModifiers>
		mIconResId = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #90  <Field int mIconResId>
		mIconTintList = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #92  <Field ColorStateList mIconTintList>
		mIconTintMode = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #94  <Field android.graphics.PorterDuff$Mode mIconTintMode>
		mHasIconTint = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #96  <Field boolean mHasIconTint>
		mHasIconTintMode = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #98  <Field boolean mHasIconTintMode>
		mNeedToApplyIconTint = false;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #100 <Field boolean mNeedToApplyIconTint>
		mFlags = 16;
	//   26   48:aload_0         
	//   27   49:bipush          16
	//   28   51:putfield        #102 <Field int mFlags>
		mShowAsAction = 0;
	//   29   54:aload_0         
	//   30   55:iconst_0        
	//   31   56:putfield        #104 <Field int mShowAsAction>
		mIsActionViewExpanded = false;
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:putfield        #106 <Field boolean mIsActionViewExpanded>
		mMenu = menubuilder;
	//   35   64:aload_0         
	//   36   65:aload_1         
	//   37   66:putfield        #108 <Field MenuBuilder mMenu>
		mId = j;
	//   38   69:aload_0         
	//   39   70:iload_3         
	//   40   71:putfield        #110 <Field int mId>
		mGroup = i;
	//   41   74:aload_0         
	//   42   75:iload_2         
	//   43   76:putfield        #112 <Field int mGroup>
		mCategoryOrder = k;
	//   44   79:aload_0         
	//   45   80:iload           4
	//   46   82:putfield        #114 <Field int mCategoryOrder>
		mOrdering = l;
	//   47   85:aload_0         
	//   48   86:iload           5
	//   49   88:putfield        #116 <Field int mOrdering>
		mTitle = charsequence;
	//   50   91:aload_0         
	//   51   92:aload           6
	//   52   94:putfield        #118 <Field CharSequence mTitle>
		mShowAsAction = i1;
	//   53   97:aload_0         
	//   54   98:iload           7
	//   55  100:putfield        #104 <Field int mShowAsAction>
	//   56  103:return          
	}

	private static void appendModifier(StringBuilder stringbuilder, int i, int j, String s)
	{
		if((i & j) == j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:iand            
	//*   3    3:iload_2         
	//*   4    4:icmpne          13
			stringbuilder.append(s);
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//    8   12:pop             
	//    9   13:return          
	}

	private Drawable applyIconTintIfNecessary(Drawable drawable)
	{
		Drawable drawable1;
label0:
		{
			drawable1 = drawable;
	//    0    0:aload_1         
	//    1    1:astore_2        
			if(drawable == null)
				break label0;
	//    2    2:aload_1         
	//    3    3:ifnull          74
			drawable1 = drawable;
	//    4    6:aload_1         
	//    5    7:astore_2        
			if(!mNeedToApplyIconTint)
				break label0;
	//    6    8:aload_0         
	//    7    9:getfield        #100 <Field boolean mNeedToApplyIconTint>
	//    8   12:ifeq            74
			if(!mHasIconTint)
	//*   9   15:aload_0         
	//*  10   16:getfield        #96  <Field boolean mHasIconTint>
	//*  11   19:ifne            31
			{
				drawable1 = drawable;
	//   12   22:aload_1         
	//   13   23:astore_2        
				if(!mHasIconTintMode)
					break label0;
	//   14   24:aload_0         
	//   15   25:getfield        #98  <Field boolean mHasIconTintMode>
	//   16   28:ifeq            74
			}
			drawable1 = DrawableCompat.wrap(drawable).mutate();
	//   17   31:aload_1         
	//   18   32:invokestatic    #134 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   19   35:invokevirtual   #140 <Method Drawable Drawable.mutate()>
	//   20   38:astore_2        
			if(mHasIconTint)
	//*  21   39:aload_0         
	//*  22   40:getfield        #96  <Field boolean mHasIconTint>
	//*  23   43:ifeq            54
				DrawableCompat.setTintList(drawable1, mIconTintList);
	//   24   46:aload_2         
	//   25   47:aload_0         
	//   26   48:getfield        #92  <Field ColorStateList mIconTintList>
	//   27   51:invokestatic    #144 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasIconTintMode)
	//*  28   54:aload_0         
	//*  29   55:getfield        #98  <Field boolean mHasIconTintMode>
	//*  30   58:ifeq            69
				DrawableCompat.setTintMode(drawable1, mIconTintMode);
	//   31   61:aload_2         
	//   32   62:aload_0         
	//   33   63:getfield        #94  <Field android.graphics.PorterDuff$Mode mIconTintMode>
	//   34   66:invokestatic    #148 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			mNeedToApplyIconTint = false;
	//   35   69:aload_0         
	//   36   70:iconst_0        
	//   37   71:putfield        #100 <Field boolean mNeedToApplyIconTint>
		}
		return drawable1;
	//   38   74:aload_2         
	//   39   75:areturn         
	}

	public void actionFormatChanged()
	{
		mMenu.onItemActionRequestChanged(this);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MenuBuilder mMenu>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
	//    4    8:return          
	}

	public boolean collapseActionView()
	{
		if((mShowAsAction & 8) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field int mShowAsAction>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifne            12
			return false;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		if(mActionView == null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #159 <Field View mActionView>
	//*   9   16:ifnonnull       21
			return true;
	//   10   19:iconst_1        
	//   11   20:ireturn         
		android.view.MenuItem.OnActionExpandListener onactionexpandlistener = mOnActionExpandListener;
	//   12   21:aload_0         
	//   13   22:getfield        #161 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//   14   25:astore_1        
		if(onactionexpandlistener != null && !onactionexpandlistener.onMenuItemActionCollapse(((MenuItem) (this))))
	//*  15   26:aload_1         
	//*  16   27:ifnull          45
	//*  17   30:aload_1         
	//*  18   31:aload_0         
	//*  19   32:invokeinterface #167 <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
	//*  20   37:ifeq            43
	//*  21   40:goto            45
			return false;
	//   22   43:iconst_0        
	//   23   44:ireturn         
		else
			return mMenu.collapseItemActionView(this);
	//   24   45:aload_0         
	//   25   46:getfield        #108 <Field MenuBuilder mMenu>
	//   26   49:aload_0         
	//   27   50:invokevirtual   #171 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
	//   28   53:ireturn         
	}

	public boolean expandActionView()
	{
		if(!hasCollapsibleActionView())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #175 <Method boolean hasCollapsibleActionView()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		android.view.MenuItem.OnActionExpandListener onactionexpandlistener = mOnActionExpandListener;
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//    7   13:astore_1        
		if(onactionexpandlistener != null && !onactionexpandlistener.onMenuItemActionExpand(((MenuItem) (this))))
	//*   8   14:aload_1         
	//*   9   15:ifnull          33
	//*  10   18:aload_1         
	//*  11   19:aload_0         
	//*  12   20:invokeinterface #178 <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
	//*  13   25:ifeq            31
	//*  14   28:goto            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		else
			return mMenu.expandItemActionView(this);
	//   17   33:aload_0         
	//   18   34:getfield        #108 <Field MenuBuilder mMenu>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #181 <Method boolean MenuBuilder.expandItemActionView(MenuItemImpl)>
	//   21   41:ireturn         
	}

	public android.view.ActionProvider getActionProvider()
	{
		throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
	//    0    0:new             #185 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #187 <String "This is not supported, use MenuItemCompat.getActionProvider()">
	//    3    6:invokespecial   #190 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public View getActionView()
	{
		Object obj = ((Object) (mActionView));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field View mActionView>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((View) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		obj = ((Object) (mActionProvider));
	//    7   11:aload_0         
	//    8   12:getfield        #194 <Field ActionProvider mActionProvider>
	//    9   15:astore_1        
		if(obj != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          34
		{
			mActionView = ((ActionProvider) (obj)).onCreateActionView(((MenuItem) (this)));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_0         
	//   15   23:invokevirtual   #200 <Method View ActionProvider.onCreateActionView(MenuItem)>
	//   16   26:putfield        #159 <Field View mActionView>
			return mActionView;
	//   17   29:aload_0         
	//   18   30:getfield        #159 <Field View mActionView>
	//   19   33:areturn         
		} else
		{
			return null;
	//   20   34:aconst_null     
	//   21   35:areturn         
		}
	}

	public int getAlphabeticModifiers()
	{
		return mShortcutAlphabeticModifiers;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int mShortcutAlphabeticModifiers>
	//    2    4:ireturn         
	}

	public char getAlphabeticShortcut()
	{
		return mShortcutAlphabeticChar;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field char mShortcutAlphabeticChar>
	//    2    4:ireturn         
	}

	Runnable getCallback()
	{
		return mItemCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field Runnable mItemCallback>
	//    2    4:areturn         
	}

	public CharSequence getContentDescription()
	{
		return mContentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field CharSequence mContentDescription>
	//    2    4:areturn         
	}

	public int getGroupId()
	{
		return mGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int mGroup>
	//    2    4:ireturn         
	}

	public Drawable getIcon()
	{
		Drawable drawable = mIconDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field Drawable mIconDrawable>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			return applyIconTintIfNecessary(drawable);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #220 <Method Drawable applyIconTintIfNecessary(Drawable)>
	//    8   14:areturn         
		if(mIconResId != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #90  <Field int mIconResId>
	//*  11   19:ifeq            53
		{
			Drawable drawable1 = AppCompatResources.getDrawable(mMenu.getContext(), mIconResId);
	//   12   22:aload_0         
	//   13   23:getfield        #108 <Field MenuBuilder mMenu>
	//   14   26:invokevirtual   #224 <Method Context MenuBuilder.getContext()>
	//   15   29:aload_0         
	//   16   30:getfield        #90  <Field int mIconResId>
	//   17   33:invokestatic    #230 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   18   36:astore_1        
			mIconResId = 0;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #90  <Field int mIconResId>
			mIconDrawable = drawable1;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:putfield        #218 <Field Drawable mIconDrawable>
			return applyIconTintIfNecessary(drawable1);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokespecial   #220 <Method Drawable applyIconTintIfNecessary(Drawable)>
	//   28   52:areturn         
		} else
		{
			return null;
	//   29   53:aconst_null     
	//   30   54:areturn         
		}
	}

	public ColorStateList getIconTintList()
	{
		return mIconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ColorStateList mIconTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getIconTintMode()
	{
		return mIconTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field android.graphics.PorterDuff$Mode mIconTintMode>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field Intent mIntent>
	//    2    4:areturn         
	}

	public int getItemId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int mId>
	//    2    4:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return mMenuInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
	//    2    4:areturn         
	}

	public int getNumericModifiers()
	{
		return mShortcutNumericModifiers;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int mShortcutNumericModifiers>
	//    2    4:ireturn         
	}

	public char getNumericShortcut()
	{
		return mShortcutNumericChar;
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field char mShortcutNumericChar>
	//    2    4:ireturn         
	}

	public int getOrder()
	{
		return mCategoryOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int mCategoryOrder>
	//    2    4:ireturn         
	}

	public int getOrdering()
	{
		return mOrdering;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int mOrdering>
	//    2    4:ireturn         
	}

	char getShortcut()
	{
		if(mMenu.isQwertyMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field MenuBuilder mMenu>
	//*   2    4:invokevirtual   #255 <Method boolean MenuBuilder.isQwertyMode()>
	//*   3    7:ifeq            15
			return mShortcutAlphabeticChar;
	//    4   10:aload_0         
	//    5   11:getfield        #206 <Field char mShortcutAlphabeticChar>
	//    6   14:ireturn         
		else
			return mShortcutNumericChar;
	//    7   15:aload_0         
	//    8   16:getfield        #249 <Field char mShortcutNumericChar>
	//    9   19:ireturn         
	}

	String getShortcutLabel()
	{
		char c = getShortcut();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method char getShortcut()>
	//    2    4:istore_1        
		if(c == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			return "";
	//    5    9:ldc2            #261 <String "">
	//    6   12:areturn         
		Resources resources = mMenu.getContext().getResources();
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field MenuBuilder mMenu>
	//    9   17:invokevirtual   #224 <Method Context MenuBuilder.getContext()>
	//   10   20:invokevirtual   #267 <Method Resources Context.getResources()>
	//   11   23:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #123 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #268 <Method void StringBuilder()>
	//   15   31:astore          4
		if(ViewConfiguration.get(mMenu.getContext()).hasPermanentMenuKey())
	//*  16   33:aload_0         
	//*  17   34:getfield        #108 <Field MenuBuilder mMenu>
	//*  18   37:invokevirtual   #224 <Method Context MenuBuilder.getContext()>
	//*  19   40:invokestatic    #274 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  20   43:invokevirtual   #277 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//*  21   46:ifeq            62
			stringbuilder.append(resources.getString(android.support.v7.appcompat.R.string.abc_prepend_shortcut_label));
	//   22   49:aload           4
	//   23   51:aload_3         
	//   24   52:getstatic       #282 <Field int android.support.v7.appcompat.R$string.abc_prepend_shortcut_label>
	//   25   55:invokevirtual   #288 <Method String Resources.getString(int)>
	//   26   58:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
		int i;
		if(mMenu.isQwertyMode())
	//*  28   62:aload_0         
	//*  29   63:getfield        #108 <Field MenuBuilder mMenu>
	//*  30   66:invokevirtual   #255 <Method boolean MenuBuilder.isQwertyMode()>
	//*  31   69:ifeq            80
			i = mShortcutAlphabeticModifiers;
	//   32   72:aload_0         
	//   33   73:getfield        #88  <Field int mShortcutAlphabeticModifiers>
	//   34   76:istore_2        
		else
	//*  35   77:goto            85
			i = mShortcutNumericModifiers;
	//   36   80:aload_0         
	//   37   81:getfield        #86  <Field int mShortcutNumericModifiers>
	//   38   84:istore_2        
		appendModifier(stringbuilder, i, 0x10000, resources.getString(android.support.v7.appcompat.R.string.abc_menu_meta_shortcut_label));
	//   39   85:aload           4
	//   40   87:iload_2         
	//   41   88:ldc2            #289 <Int 0x10000>
	//   42   91:aload_3         
	//   43   92:getstatic       #292 <Field int android.support.v7.appcompat.R$string.abc_menu_meta_shortcut_label>
	//   44   95:invokevirtual   #288 <Method String Resources.getString(int)>
	//   45   98:invokestatic    #294 <Method void appendModifier(StringBuilder, int, int, String)>
		appendModifier(stringbuilder, i, 4096, resources.getString(android.support.v7.appcompat.R.string.abc_menu_ctrl_shortcut_label));
	//   46  101:aload           4
	//   47  103:iload_2         
	//   48  104:sipush          4096
	//   49  107:aload_3         
	//   50  108:getstatic       #297 <Field int android.support.v7.appcompat.R$string.abc_menu_ctrl_shortcut_label>
	//   51  111:invokevirtual   #288 <Method String Resources.getString(int)>
	//   52  114:invokestatic    #294 <Method void appendModifier(StringBuilder, int, int, String)>
		appendModifier(stringbuilder, i, 2, resources.getString(android.support.v7.appcompat.R.string.abc_menu_alt_shortcut_label));
	//   53  117:aload           4
	//   54  119:iload_2         
	//   55  120:iconst_2        
	//   56  121:aload_3         
	//   57  122:getstatic       #300 <Field int android.support.v7.appcompat.R$string.abc_menu_alt_shortcut_label>
	//   58  125:invokevirtual   #288 <Method String Resources.getString(int)>
	//   59  128:invokestatic    #294 <Method void appendModifier(StringBuilder, int, int, String)>
		appendModifier(stringbuilder, i, 1, resources.getString(android.support.v7.appcompat.R.string.abc_menu_shift_shortcut_label));
	//   60  131:aload           4
	//   61  133:iload_2         
	//   62  134:iconst_1        
	//   63  135:aload_3         
	//   64  136:getstatic       #303 <Field int android.support.v7.appcompat.R$string.abc_menu_shift_shortcut_label>
	//   65  139:invokevirtual   #288 <Method String Resources.getString(int)>
	//   66  142:invokestatic    #294 <Method void appendModifier(StringBuilder, int, int, String)>
		appendModifier(stringbuilder, i, 4, resources.getString(android.support.v7.appcompat.R.string.abc_menu_sym_shortcut_label));
	//   67  145:aload           4
	//   68  147:iload_2         
	//   69  148:iconst_4        
	//   70  149:aload_3         
	//   71  150:getstatic       #306 <Field int android.support.v7.appcompat.R$string.abc_menu_sym_shortcut_label>
	//   72  153:invokevirtual   #288 <Method String Resources.getString(int)>
	//   73  156:invokestatic    #294 <Method void appendModifier(StringBuilder, int, int, String)>
		appendModifier(stringbuilder, i, 8, resources.getString(android.support.v7.appcompat.R.string.abc_menu_function_shortcut_label));
	//   74  159:aload           4
	//   75  161:iload_2         
	//   76  162:bipush          8
	//   77  164:aload_3         
	//   78  165:getstatic       #309 <Field int android.support.v7.appcompat.R$string.abc_menu_function_shortcut_label>
	//   79  168:invokevirtual   #288 <Method String Resources.getString(int)>
	//   80  171:invokestatic    #294 <Method void appendModifier(StringBuilder, int, int, String)>
		if(c != '\b')
	//*  81  174:iload_1         
	//*  82  175:bipush          8
	//*  83  177:icmpeq          234
		{
			if(c != '\n')
	//*  84  180:iload_1         
	//*  85  181:bipush          10
	//*  86  183:icmpeq          218
			{
				if(c != ' ')
	//*  87  186:iload_1         
	//*  88  187:bipush          32
	//*  89  189:icmpeq          202
					stringbuilder.append(c);
	//   90  192:aload           4
	//   91  194:iload_1         
	//   92  195:invokevirtual   #312 <Method StringBuilder StringBuilder.append(char)>
	//   93  198:pop             
				else
	//*  94  199:goto            247
					stringbuilder.append(resources.getString(android.support.v7.appcompat.R.string.abc_menu_space_shortcut_label));
	//   95  202:aload           4
	//   96  204:aload_3         
	//   97  205:getstatic       #315 <Field int android.support.v7.appcompat.R$string.abc_menu_space_shortcut_label>
	//   98  208:invokevirtual   #288 <Method String Resources.getString(int)>
	//   99  211:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  100  214:pop             
			} else
	//* 101  215:goto            247
			{
				stringbuilder.append(resources.getString(android.support.v7.appcompat.R.string.abc_menu_enter_shortcut_label));
	//  102  218:aload           4
	//  103  220:aload_3         
	//  104  221:getstatic       #318 <Field int android.support.v7.appcompat.R$string.abc_menu_enter_shortcut_label>
	//  105  224:invokevirtual   #288 <Method String Resources.getString(int)>
	//  106  227:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  107  230:pop             
			}
		} else
	//* 108  231:goto            247
		{
			stringbuilder.append(resources.getString(android.support.v7.appcompat.R.string.abc_menu_delete_shortcut_label));
	//  109  234:aload           4
	//  110  236:aload_3         
	//  111  237:getstatic       #321 <Field int android.support.v7.appcompat.R$string.abc_menu_delete_shortcut_label>
	//  112  240:invokevirtual   #288 <Method String Resources.getString(int)>
	//  113  243:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  114  246:pop             
		}
		return stringbuilder.toString();
	//  115  247:aload           4
	//  116  249:invokevirtual   #324 <Method String StringBuilder.toString()>
	//  117  252:areturn         
	}

	public SubMenu getSubMenu()
	{
		return ((SubMenu) (mSubMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #328 <Field SubMenuBuilder mSubMenu>
	//    2    4:areturn         
	}

	public ActionProvider getSupportActionProvider()
	{
		return mActionProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActionProvider mActionProvider>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		CharSequence charsequence = mTitleCondensed;
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field CharSequence mTitleCondensed>
	//    2    4:astore_1        
		if(charsequence == null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          12
	//*   5    9:goto            17
			charsequence = mTitle;
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field CharSequence mTitle>
	//    8   16:astore_1        
		if(android.os.Build.VERSION.SDK_INT < 18 && charsequence != null && !(charsequence instanceof String))
	//*   9   17:getstatic       #339 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          18
	//*  11   22:icmpge          43
	//*  12   25:aload_1         
	//*  13   26:ifnull          43
	//*  14   29:aload_1         
	//*  15   30:instanceof      #341 <Class String>
	//*  16   33:ifne            43
			return ((CharSequence) (charsequence.toString()));
	//   17   36:aload_1         
	//   18   37:invokeinterface #344 <Method String CharSequence.toString()>
	//   19   42:areturn         
		else
			return charsequence;
	//   20   43:aload_1         
	//   21   44:areturn         
	}

	CharSequence getTitleForItemView(MenuView.ItemView itemview)
	{
		if(itemview != null && itemview.prefersCondensedTitle())
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #351 <Method boolean MenuView$ItemView.prefersCondensedTitle()>
	//*   4   10:ifeq            18
			return getTitleCondensed();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #353 <Method CharSequence getTitleCondensed()>
	//    7   17:areturn         
		else
			return getTitle();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #355 <Method CharSequence getTitle()>
	//   10   22:areturn         
	}

	public CharSequence getTooltipText()
	{
		return mTooltipText;
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field CharSequence mTooltipText>
	//    2    4:areturn         
	}

	public boolean hasCollapsibleActionView()
	{
		int i = mShowAsAction;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int mShowAsAction>
	//    2    4:istore_1        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if((i & 8) != 0)
	//*   5    7:iload_1         
	//*   6    8:bipush          8
	//*   7   10:iand            
	//*   8   11:ifeq            50
		{
			if(mActionView == null)
	//*   9   14:aload_0         
	//*  10   15:getfield        #159 <Field View mActionView>
	//*  11   18:ifnonnull       39
			{
				ActionProvider actionprovider = mActionProvider;
	//   12   21:aload_0         
	//   13   22:getfield        #194 <Field ActionProvider mActionProvider>
	//   14   25:astore_3        
				if(actionprovider != null)
	//*  15   26:aload_3         
	//*  16   27:ifnull          39
					mActionView = actionprovider.onCreateActionView(((MenuItem) (this)));
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:aload_0         
	//   20   33:invokevirtual   #200 <Method View ActionProvider.onCreateActionView(MenuItem)>
	//   21   36:putfield        #159 <Field View mActionView>
			}
			if(mActionView != null)
	//*  22   39:aload_0         
	//*  23   40:getfield        #159 <Field View mActionView>
	//*  24   43:ifnull          48
				flag = true;
	//   25   46:iconst_1        
	//   26   47:istore_2        
			return flag;
	//   27   48:iload_2         
	//   28   49:ireturn         
		} else
		{
			return false;
	//   29   50:iconst_0        
	//   30   51:ireturn         
		}
	}

	public boolean hasSubMenu()
	{
		return mSubMenu != null;
	//    0    0:aload_0         
	//    1    1:getfield        #328 <Field SubMenuBuilder mSubMenu>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean invoke()
	{
		Object obj = ((Object) (mClickListener));
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//    2    4:astore_1        
		if(obj != null && ((android.view.MenuItem.OnMenuItemClickListener) (obj)).onMenuItemClick(((MenuItem) (this))))
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:invokeinterface #369 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		obj = ((Object) (mMenu));
	//   11   21:aload_0         
	//   12   22:getfield        #108 <Field MenuBuilder mMenu>
	//   13   25:astore_1        
		if(((MenuBuilder) (obj)).dispatchMenuItemSelected(((MenuBuilder) (obj)), ((MenuItem) (this))))
	//*  14   26:aload_1         
	//*  15   27:aload_1         
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #373 <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
	//*  18   32:ifeq            37
			return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
		obj = ((Object) (mItemCallback));
	//   21   37:aload_0         
	//   22   38:getfield        #210 <Field Runnable mItemCallback>
	//   23   41:astore_1        
		if(obj != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          54
		{
			((Runnable) (obj)).run();
	//   26   46:aload_1         
	//   27   47:invokeinterface #378 <Method void Runnable.run()>
			return true;
	//   28   52:iconst_1        
	//   29   53:ireturn         
		}
		if(mIntent == null)
			break MISSING_BLOCK_LABEL_88;
	//   30   54:aload_0         
	//   31   55:getfield        #238 <Field Intent mIntent>
	//   32   58:ifnull          88
		mMenu.getContext().startActivity(mIntent);
	//   33   61:aload_0         
	//   34   62:getfield        #108 <Field MenuBuilder mMenu>
	//   35   65:invokevirtual   #224 <Method Context MenuBuilder.getContext()>
	//   36   68:aload_0         
	//   37   69:getfield        #238 <Field Intent mIntent>
	//   38   72:invokevirtual   #382 <Method void Context.startActivity(Intent)>
		return true;
	//   39   75:iconst_1        
	//   40   76:ireturn         
		ActivityNotFoundException activitynotfoundexception;
		activitynotfoundexception;
	//   41   77:astore_1        
		Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", ((Throwable) (activitynotfoundexception)));
	//   42   78:ldc1            #33  <String "MenuItemImpl">
	//   43   80:ldc2            #384 <String "Can't find activity to handle intent; ignoring">
	//   44   83:aload_1         
	//   45   84:invokestatic    #390 <Method int Log.e(String, String, Throwable)>
	//   46   87:pop             
		ActionProvider actionprovider = mActionProvider;
	//   47   88:aload_0         
	//   48   89:getfield        #194 <Field ActionProvider mActionProvider>
	//   49   92:astore_1        
		return actionprovider != null && actionprovider.onPerformDefaultAction();
	//   50   93:aload_1         
	//   51   94:ifnull          106
	//   52   97:aload_1         
	//   53   98:invokevirtual   #393 <Method boolean ActionProvider.onPerformDefaultAction()>
	//   54  101:ifeq            106
	//   55  104:iconst_1        
	//   56  105:ireturn         
	//   57  106:iconst_0        
	//   58  107:ireturn         
	}

	public boolean isActionButton()
	{
		return (mFlags & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isActionViewExpanded()
	{
		return mIsActionViewExpanded;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean mIsActionViewExpanded>
	//    2    4:ireturn         
	}

	public boolean isCheckable()
	{
		return (mFlags & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean isChecked()
	{
		return (mFlags & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean isEnabled()
	{
		return (mFlags & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean isExclusiveCheckable()
	{
		return (mFlags & 4) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isVisible()
	{
		ActionProvider actionprovider = mActionProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActionProvider mActionProvider>
	//    2    4:astore_1        
		if(actionprovider != null && actionprovider.overridesItemVisibility())
	//*   3    5:aload_1         
	//*   4    6:ifnull          40
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #403 <Method boolean ActionProvider.overridesItemVisibility()>
	//*   7   13:ifeq            40
			return (mFlags & 8) == 0 && mActionProvider.isVisible();
	//    8   16:aload_0         
	//    9   17:getfield        #102 <Field int mFlags>
	//   10   20:bipush          8
	//   11   22:iand            
	//   12   23:ifne            38
	//   13   26:aload_0         
	//   14   27:getfield        #194 <Field ActionProvider mActionProvider>
	//   15   30:invokevirtual   #405 <Method boolean ActionProvider.isVisible()>
	//   16   33:ifeq            38
	//   17   36:iconst_1        
	//   18   37:ireturn         
	//   19   38:iconst_0        
	//   20   39:ireturn         
		return (mFlags & 8) == 0;
	//   21   40:aload_0         
	//   22   41:getfield        #102 <Field int mFlags>
	//   23   44:bipush          8
	//   24   46:iand            
	//   25   47:ifne            52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public boolean requestsActionButton()
	{
		return (mShowAsAction & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int mShowAsAction>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean requiresActionButton()
	{
		return (mShowAsAction & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int mShowAsAction>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public MenuItem setActionProvider(android.view.ActionProvider actionprovider)
	{
		throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
	//    0    0:new             #185 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #411 <String "This is not supported, use MenuItemCompat.setActionProvider()">
	//    3    7:invokespecial   #190 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public SupportMenuItem setActionView(int i)
	{
		Context context = mMenu.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #224 <Method Context MenuBuilder.getContext()>
	//    3    7:astore_2        
		setActionView(LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (new LinearLayout(context))), false));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokestatic    #419 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   13:iload_1         
	//    8   14:new             #421 <Class LinearLayout>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #424 <Method void LinearLayout(Context)>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #428 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   14   26:invokevirtual   #431 <Method SupportMenuItem setActionView(View)>
	//   15   29:pop             
		return ((SupportMenuItem) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public SupportMenuItem setActionView(View view)
	{
		mActionView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field View mActionView>
		mActionProvider = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #194 <Field ActionProvider mActionProvider>
		if(view != null && view.getId() == -1)
	//*   6   10:aload_1         
	//*   7   11:ifnull          36
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #436 <Method int View.getId()>
	//*  10   18:iconst_m1       
	//*  11   19:icmpne          36
		{
			int i = mId;
	//   12   22:aload_0         
	//   13   23:getfield        #110 <Field int mId>
	//   14   26:istore_2        
			if(i > 0)
	//*  15   27:iload_2         
	//*  16   28:ifle            36
				view.setId(i);
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #440 <Method void View.setId(int)>
		}
		mMenu.onItemActionRequestChanged(this);
	//   20   36:aload_0         
	//   21   37:getfield        #108 <Field MenuBuilder mMenu>
	//   22   40:aload_0         
	//   23   41:invokevirtual   #155 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
		return ((SupportMenuItem) (this));
	//   24   44:aload_0         
	//   25   45:areturn         
	}

	public volatile MenuItem setActionView(int i)
	{
		return ((MenuItem) (setActionView(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #443 <Method SupportMenuItem setActionView(int)>
	//    3    5:areturn         
	}

	public volatile MenuItem setActionView(View view)
	{
		return ((MenuItem) (setActionView(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #431 <Method SupportMenuItem setActionView(View)>
	//    3    5:areturn         
	}

	public void setActionViewExpanded(boolean flag)
	{
		mIsActionViewExpanded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field boolean mIsActionViewExpanded>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #108 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
	//    7   13:return          
	}

	public MenuItem setAlphabeticShortcut(char c)
	{
		if(mShortcutAlphabeticChar == c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field char mShortcutAlphabeticChar>
	//*   2    4:iload_1         
	//*   3    5:icmpne          10
		{
			return ((MenuItem) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			mShortcutAlphabeticChar = Character.toLowerCase(c);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokestatic    #457 <Method char Character.toLowerCase(char)>
	//    9   15:putfield        #206 <Field char mShortcutAlphabeticChar>
			mMenu.onItemsChanged(false);
	//   10   18:aload_0         
	//   11   19:getfield        #108 <Field MenuBuilder mMenu>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public MenuItem setAlphabeticShortcut(char c, int i)
	{
		if(mShortcutAlphabeticChar == c && mShortcutAlphabeticModifiers == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field char mShortcutAlphabeticChar>
	//*   2    4:iload_1         
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #88  <Field int mShortcutAlphabeticModifiers>
	//*   6   12:iload_2         
	//*   7   13:icmpne          18
		{
			return ((MenuItem) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			mShortcutAlphabeticChar = Character.toLowerCase(c);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokestatic    #457 <Method char Character.toLowerCase(char)>
	//   13   23:putfield        #206 <Field char mShortcutAlphabeticChar>
			mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokestatic    #464 <Method int KeyEvent.normalizeMetaState(int)>
	//   17   31:putfield        #88  <Field int mShortcutAlphabeticModifiers>
			mMenu.onItemsChanged(false);
	//   18   34:aload_0         
	//   19   35:getfield        #108 <Field MenuBuilder mMenu>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
		}
	}

	public MenuItem setCallback(Runnable runnable)
	{
		mItemCallback = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #210 <Field Runnable mItemCallback>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:istore_2        
		mFlags = flag | i & -2;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:bipush          -2
	//    7   10:iand            
	//    8   11:ior             
	//    9   12:putfield        #102 <Field int mFlags>
		if(i != mFlags)
	//*  10   15:iload_2         
	//*  11   16:aload_0         
	//*  12   17:getfield        #102 <Field int mFlags>
	//*  13   20:icmpeq          31
			mMenu.onItemsChanged(false);
	//   14   23:aload_0         
	//   15   24:getfield        #108 <Field MenuBuilder mMenu>
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   18   31:aload_0         
	//   19   32:areturn         
	}

	public MenuItem setChecked(boolean flag)
	{
		if((mFlags & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int mFlags>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            19
		{
			mMenu.setExclusiveItemChecked(((MenuItem) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #108 <Field MenuBuilder mMenu>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #473 <Method void MenuBuilder.setExclusiveItemChecked(MenuItem)>
			return ((MenuItem) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
		} else
		{
			setCheckedInt(flag);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #476 <Method void setCheckedInt(boolean)>
			return ((MenuItem) (this));
	//   14   24:aload_0         
	//   15   25:areturn         
		}
	}

	void setCheckedInt(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:istore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 2;
	//    5    9:iconst_2        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			byte0 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		mFlags = byte0 | i & -3;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:bipush          -3
	//   14   21:iand            
	//   15   22:ior             
	//   16   23:putfield        #102 <Field int mFlags>
		if(i != mFlags)
	//*  17   26:iload_3         
	//*  18   27:aload_0         
	//*  19   28:getfield        #102 <Field int mFlags>
	//*  20   31:icmpeq          42
			mMenu.onItemsChanged(false);
	//   21   34:aload_0         
	//   22   35:getfield        #108 <Field MenuBuilder mMenu>
	//   23   38:iconst_0        
	//   24   39:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
	//   25   42:return          
	}

	public SupportMenuItem setContentDescription(CharSequence charsequence)
	{
		mContentDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #214 <Field CharSequence mContentDescription>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #108 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((SupportMenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public volatile MenuItem setContentDescription(CharSequence charsequence)
	{
		return ((MenuItem) (setContentDescription(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #481 <Method SupportMenuItem setContentDescription(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setEnabled(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            18
			mFlags = mFlags | 0x10;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field int mFlags>
	//    5    9:bipush          16
	//    6   11:ior             
	//    7   12:putfield        #102 <Field int mFlags>
		else
	//*   8   15:goto            29
			mFlags = mFlags & 0xffffffef;
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #102 <Field int mFlags>
	//   12   23:bipush          -17
	//   13   25:iand            
	//   14   26:putfield        #102 <Field int mFlags>
		mMenu.onItemsChanged(false);
	//   15   29:aload_0         
	//   16   30:getfield        #108 <Field MenuBuilder mMenu>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   19   37:aload_0         
	//   20   38:areturn         
	}

	public void setExclusiveCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:istore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 4;
	//    5    9:iconst_4        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			byte0 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		mFlags = byte0 | i & -5;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:bipush          -5
	//   14   21:iand            
	//   15   22:ior             
	//   16   23:putfield        #102 <Field int mFlags>
	//   17   26:return          
	}

	public MenuItem setIcon(int i)
	{
		mIconDrawable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #218 <Field Drawable mIconDrawable>
		mIconResId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #90  <Field int mIconResId>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #100 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		mIconResId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #90  <Field int mIconResId>
		mIconDrawable = drawable;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #218 <Field Drawable mIconDrawable>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #100 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIconTintList(ColorStateList colorstatelist)
	{
		mIconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field ColorStateList mIconTintList>
		mHasIconTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #96  <Field boolean mHasIconTint>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #100 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mIconTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field android.graphics.PorterDuff$Mode mIconTintMode>
		mHasIconTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #98  <Field boolean mHasIconTintMode>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #100 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		mIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #238 <Field Intent mIntent>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setIsActionButton(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
		{
			mFlags = mFlags | 0x20;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field int mFlags>
	//    5    9:bipush          32
	//    6   11:ior             
	//    7   12:putfield        #102 <Field int mFlags>
			return;
	//    8   15:return          
		} else
		{
			mFlags = mFlags & 0xffffffdf;
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #102 <Field int mFlags>
	//   12   21:bipush          -33
	//   13   23:iand            
	//   14   24:putfield        #102 <Field int mFlags>
			return;
	//   15   27:return          
		}
	}

	void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		mMenuInfo = contextmenuinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #245 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
	//    3    5:return          
	}

	public MenuItem setNumericShortcut(char c)
	{
		if(mShortcutNumericChar == c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field char mShortcutNumericChar>
	//*   2    4:iload_1         
	//*   3    5:icmpne          10
		{
			return ((MenuItem) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			mShortcutNumericChar = c;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #249 <Field char mShortcutNumericChar>
			mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public MenuItem setNumericShortcut(char c, int i)
	{
		if(mShortcutNumericChar == c && mShortcutNumericModifiers == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field char mShortcutNumericChar>
	//*   2    4:iload_1         
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #86  <Field int mShortcutNumericModifiers>
	//*   6   12:iload_2         
	//*   7   13:icmpne          18
		{
			return ((MenuItem) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			mShortcutNumericChar = c;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #249 <Field char mShortcutNumericChar>
			mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:invokestatic    #464 <Method int KeyEvent.normalizeMetaState(int)>
	//   16   28:putfield        #86  <Field int mShortcutNumericModifiers>
			mMenu.onItemsChanged(false);
	//   17   31:aload_0         
	//   18   32:getfield        #108 <Field MenuBuilder mMenu>
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   21   39:aload_0         
	//   22   40:areturn         
		}
	}

	public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		mOnActionExpandListener = onactionexpandlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		mClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #364 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setShortcut(char c, char c1)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #249 <Field char mShortcutNumericChar>
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #457 <Method char Character.toLowerCase(char)>
	//    6   10:putfield        #206 <Field char mShortcutAlphabeticChar>
		mMenu.onItemsChanged(false);
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field MenuBuilder mMenu>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public MenuItem setShortcut(char c, char c1, int i, int j)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #249 <Field char mShortcutNumericChar>
		mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:invokestatic    #464 <Method int KeyEvent.normalizeMetaState(int)>
	//    6   10:putfield        #86  <Field int mShortcutNumericModifiers>
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokestatic    #457 <Method char Character.toLowerCase(char)>
	//   10   18:putfield        #206 <Field char mShortcutAlphabeticChar>
		mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(j);
	//   11   21:aload_0         
	//   12   22:iload           4
	//   13   24:invokestatic    #464 <Method int KeyEvent.normalizeMetaState(int)>
	//   14   27:putfield        #88  <Field int mShortcutAlphabeticModifiers>
		mMenu.onItemsChanged(false);
	//   15   30:aload_0         
	//   16   31:getfield        #108 <Field MenuBuilder mMenu>
	//   17   34:iconst_0        
	//   18   35:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   19   38:aload_0         
	//   20   39:areturn         
	}

	public void setShowAsAction(int i)
	{
		switch(i & 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:iand            
		{
	//*   3    3:tableswitch     0 2: default 28
	//	               0 39
	//	               1 39
	//	               2 39
		default:
			throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
	//    4   28:new             #507 <Class IllegalArgumentException>
	//    5   31:dup             
	//    6   32:ldc2            #509 <String "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.">
	//    7   35:invokespecial   #510 <Method void IllegalArgumentException(String)>
	//    8   38:athrow          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			mShowAsAction = i;
	//    9   39:aload_0         
	//   10   40:iload_1         
	//   11   41:putfield        #104 <Field int mShowAsAction>
			break;
		}
		mMenu.onItemActionRequestChanged(this);
	//   12   44:aload_0         
	//   13   45:getfield        #108 <Field MenuBuilder mMenu>
	//   14   48:aload_0         
	//   15   49:invokevirtual   #155 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
	//   16   52:return          
	}

	public SupportMenuItem setShowAsActionFlags(int i)
	{
		setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #513 <Method void setShowAsAction(int)>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setShowAsActionFlags(int i)
	{
		return ((MenuItem) (setShowAsActionFlags(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #515 <Method SupportMenuItem setShowAsActionFlags(int)>
	//    3    5:areturn         
	}

	public void setSubMenu(SubMenuBuilder submenubuilder)
	{
		mSubMenu = submenubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #328 <Field SubMenuBuilder mSubMenu>
		submenubuilder.setHeaderTitle(getTitle());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #355 <Method CharSequence getTitle()>
	//    6   10:invokevirtual   #523 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
	//    7   13:pop             
	//    8   14:return          
	}

	public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
	{
		ActionProvider actionprovider1 = mActionProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActionProvider mActionProvider>
	//    2    4:astore_2        
		if(actionprovider1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			actionprovider1.reset();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #528 <Method void ActionProvider.reset()>
		mActionView = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #159 <Field View mActionView>
		mActionProvider = actionprovider;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #194 <Field ActionProvider mActionProvider>
		mMenu.onItemsChanged(true);
	//   13   23:aload_0         
	//   14   24:getfield        #108 <Field MenuBuilder mMenu>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		actionprovider = mActionProvider;
	//   17   31:aload_0         
	//   18   32:getfield        #194 <Field ActionProvider mActionProvider>
	//   19   35:astore_1        
		if(actionprovider != null)
	//*  20   36:aload_1         
	//*  21   37:ifnull          52
			actionprovider.setVisibilityListener(new android.support.v4.view.ActionProvider.VisibilityListener() {

				public void onActionProviderVisibilityChanged(boolean flag)
				{
					mMenu.onItemVisibleChanged(MenuItemImpl.this);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MenuItemImpl this$0>
				//    2    4:getfield        #27  <Field MenuBuilder MenuItemImpl.mMenu>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field MenuItemImpl this$0>
				//    5   11:invokevirtual   #32  <Method void MenuBuilder.onItemVisibleChanged(MenuItemImpl)>
				//    6   14:return          
				}

				final MenuItemImpl this$0;

			
			{
				this$0 = MenuItemImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MenuItemImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   22   40:aload_1         
	//   23   41:new             #8   <Class MenuItemImpl$1>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:invokespecial   #530 <Method void MenuItemImpl$1(MenuItemImpl)>
	//   27   49:invokevirtual   #534 <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
		return ((SupportMenuItem) (this));
	//   28   52:aload_0         
	//   29   53:areturn         
	}

	public MenuItem setTitle(int i)
	{
		return setTitle(((CharSequence) (mMenu.getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #108 <Field MenuBuilder mMenu>
	//    3    5:invokevirtual   #224 <Method Context MenuBuilder.getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #536 <Method String Context.getString(int)>
	//    6   12:invokevirtual   #538 <Method MenuItem setTitle(CharSequence)>
	//    7   15:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field CharSequence mTitle>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #108 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		SubMenuBuilder submenubuilder = mSubMenu;
	//    7   13:aload_0         
	//    8   14:getfield        #328 <Field SubMenuBuilder mSubMenu>
	//    9   17:astore_2        
		if(submenubuilder != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          28
			submenubuilder.setHeaderTitle(charsequence);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #523 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
	//   15   27:pop             
		return ((MenuItem) (this));
	//   16   28:aload_0         
	//   17   29:areturn         
	}

	public MenuItem setTitleCondensed(CharSequence charsequence)
	{
		mTitleCondensed = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #334 <Field CharSequence mTitleCondensed>
		if(charsequence == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			charsequence = mTitle;
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field CharSequence mTitle>
	//    7   13:astore_1        
		mMenu.onItemsChanged(false);
	//    8   14:aload_0         
	//    9   15:getfield        #108 <Field MenuBuilder mMenu>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public SupportMenuItem setTooltipText(CharSequence charsequence)
	{
		mTooltipText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #358 <Field CharSequence mTooltipText>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #108 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #449 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((SupportMenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public volatile MenuItem setTooltipText(CharSequence charsequence)
	{
		return ((MenuItem) (setTooltipText(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #542 <Method SupportMenuItem setTooltipText(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		if(setVisibleInt(flag))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #547 <Method boolean setVisibleInt(boolean)>
	//*   3    5:ifeq            16
			mMenu.onItemVisibleChanged(this);
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field MenuBuilder mMenu>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #550 <Method void MenuBuilder.onItemVisibleChanged(MenuItemImpl)>
		return ((MenuItem) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	boolean setVisibleInt(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int mFlags>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		byte byte0;
		if(flag)
	//*   5    8:iload_1         
	//*   6    9:ifeq            17
			byte0 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		else
	//*   9   14:goto            20
			byte0 = 8;
	//   10   17:bipush          8
	//   11   19:istore_2        
		mFlags = byte0 | i & -9;
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:iload_3         
	//   15   23:bipush          -9
	//   16   25:iand            
	//   17   26:ior             
	//   18   27:putfield        #102 <Field int mFlags>
		flag = flag1;
	//   19   30:iload           4
	//   20   32:istore_1        
		if(i != mFlags)
	//*  21   33:iload_3         
	//*  22   34:aload_0         
	//*  23   35:getfield        #102 <Field int mFlags>
	//*  24   38:icmpeq          43
			flag = true;
	//   25   41:iconst_1        
	//   26   42:istore_1        
		return flag;
	//   27   43:iload_1         
	//   28   44:ireturn         
	}

	public boolean shouldShowIcon()
	{
		return mMenu.getOptionalIconsVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #554 <Method boolean MenuBuilder.getOptionalIconsVisible()>
	//    3    7:ireturn         
	}

	boolean shouldShowShortcut()
	{
		return mMenu.isShortcutsVisible() && getShortcut() != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #558 <Method boolean MenuBuilder.isShortcutsVisible()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokevirtual   #259 <Method char getShortcut()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean showsTextAsAction()
	{
		return (mShowAsAction & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int mShowAsAction>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public String toString()
	{
		CharSequence charsequence = mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field CharSequence mTitle>
	//    2    4:astore_1        
		if(charsequence != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return charsequence.toString();
	//    5    9:aload_1         
	//    6   10:invokeinterface #344 <Method String CharSequence.toString()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	private static final int CHECKABLE = 1;
	private static final int CHECKED = 2;
	private static final int ENABLED = 16;
	private static final int EXCLUSIVE = 4;
	private static final int HIDDEN = 8;
	private static final int IS_ACTION = 32;
	static final int NO_ICON = 0;
	private static final int SHOW_AS_ACTION_MASK = 3;
	private static final String TAG = "MenuItemImpl";
	private ActionProvider mActionProvider;
	private View mActionView;
	private final int mCategoryOrder;
	private android.view.MenuItem.OnMenuItemClickListener mClickListener;
	private CharSequence mContentDescription;
	private int mFlags;
	private final int mGroup;
	private boolean mHasIconTint;
	private boolean mHasIconTintMode;
	private Drawable mIconDrawable;
	private int mIconResId;
	private ColorStateList mIconTintList;
	private android.graphics.PorterDuff.Mode mIconTintMode;
	private final int mId;
	private Intent mIntent;
	private boolean mIsActionViewExpanded;
	private Runnable mItemCallback;
	MenuBuilder mMenu;
	private android.view.ContextMenu.ContextMenuInfo mMenuInfo;
	private boolean mNeedToApplyIconTint;
	private android.view.MenuItem.OnActionExpandListener mOnActionExpandListener;
	private final int mOrdering;
	private char mShortcutAlphabeticChar;
	private int mShortcutAlphabeticModifiers;
	private char mShortcutNumericChar;
	private int mShortcutNumericModifiers;
	private int mShowAsAction;
	private SubMenuBuilder mSubMenu;
	private CharSequence mTitle;
	private CharSequence mTitleCondensed;
	private CharSequence mTooltipText;
}
