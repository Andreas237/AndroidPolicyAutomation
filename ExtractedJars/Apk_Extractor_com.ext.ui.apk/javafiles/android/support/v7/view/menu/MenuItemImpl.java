// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
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
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.view.menu:
//			MenuBuilder, SubMenuBuilder

public final class MenuItemImpl
	implements SupportMenuItem
{

	MenuItemImpl(MenuBuilder menubuilder, int i, int j, int k, int l, CharSequence charsequence, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Object()>
		mShortcutNumericModifiers = 4096;
	//    2    4:aload_0         
	//    3    5:sipush          4096
	//    4    8:putfield        #90  <Field int mShortcutNumericModifiers>
		mShortcutAlphabeticModifiers = 4096;
	//    5   11:aload_0         
	//    6   12:sipush          4096
	//    7   15:putfield        #92  <Field int mShortcutAlphabeticModifiers>
		mIconResId = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #94  <Field int mIconResId>
		mIconTintList = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #96  <Field ColorStateList mIconTintList>
		mIconTintMode = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #98  <Field android.graphics.PorterDuff$Mode mIconTintMode>
		mHasIconTint = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #100 <Field boolean mHasIconTint>
		mHasIconTintMode = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #102 <Field boolean mHasIconTintMode>
		mNeedToApplyIconTint = false;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #104 <Field boolean mNeedToApplyIconTint>
		mFlags = 16;
	//   26   48:aload_0         
	//   27   49:bipush          16
	//   28   51:putfield        #106 <Field int mFlags>
		mShowAsAction = 0;
	//   29   54:aload_0         
	//   30   55:iconst_0        
	//   31   56:putfield        #108 <Field int mShowAsAction>
		mIsActionViewExpanded = false;
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:putfield        #110 <Field boolean mIsActionViewExpanded>
		mMenu = menubuilder;
	//   35   64:aload_0         
	//   36   65:aload_1         
	//   37   66:putfield        #112 <Field MenuBuilder mMenu>
		mId = j;
	//   38   69:aload_0         
	//   39   70:iload_3         
	//   40   71:putfield        #114 <Field int mId>
		mGroup = i;
	//   41   74:aload_0         
	//   42   75:iload_2         
	//   43   76:putfield        #116 <Field int mGroup>
		mCategoryOrder = k;
	//   44   79:aload_0         
	//   45   80:iload           4
	//   46   82:putfield        #118 <Field int mCategoryOrder>
		mOrdering = l;
	//   47   85:aload_0         
	//   48   86:iload           5
	//   49   88:putfield        #120 <Field int mOrdering>
		mTitle = charsequence;
	//   50   91:aload_0         
	//   51   92:aload           6
	//   52   94:putfield        #122 <Field CharSequence mTitle>
		mShowAsAction = i1;
	//   53   97:aload_0         
	//   54   98:iload           7
	//   55  100:putfield        #108 <Field int mShowAsAction>
	//   56  103:return          
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
	//    7    9:getfield        #104 <Field boolean mNeedToApplyIconTint>
	//    8   12:ifeq            74
			if(!mHasIconTint)
	//*   9   15:aload_0         
	//*  10   16:getfield        #100 <Field boolean mHasIconTint>
	//*  11   19:ifne            31
			{
				drawable1 = drawable;
	//   12   22:aload_1         
	//   13   23:astore_2        
				if(!mHasIconTintMode)
					break label0;
	//   14   24:aload_0         
	//   15   25:getfield        #102 <Field boolean mHasIconTintMode>
	//   16   28:ifeq            74
			}
			drawable1 = DrawableCompat.wrap(drawable).mutate();
	//   17   31:aload_1         
	//   18   32:invokestatic    #130 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   19   35:invokevirtual   #136 <Method Drawable Drawable.mutate()>
	//   20   38:astore_2        
			if(mHasIconTint)
	//*  21   39:aload_0         
	//*  22   40:getfield        #100 <Field boolean mHasIconTint>
	//*  23   43:ifeq            54
				DrawableCompat.setTintList(drawable1, mIconTintList);
	//   24   46:aload_2         
	//   25   47:aload_0         
	//   26   48:getfield        #96  <Field ColorStateList mIconTintList>
	//   27   51:invokestatic    #140 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasIconTintMode)
	//*  28   54:aload_0         
	//*  29   55:getfield        #102 <Field boolean mHasIconTintMode>
	//*  30   58:ifeq            69
				DrawableCompat.setTintMode(drawable1, mIconTintMode);
	//   31   61:aload_2         
	//   32   62:aload_0         
	//   33   63:getfield        #98  <Field android.graphics.PorterDuff$Mode mIconTintMode>
	//   34   66:invokestatic    #144 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			mNeedToApplyIconTint = false;
	//   35   69:aload_0         
	//   36   70:iconst_0        
	//   37   71:putfield        #104 <Field boolean mNeedToApplyIconTint>
		}
		return drawable1;
	//   38   74:aload_2         
	//   39   75:areturn         
	}

	public void actionFormatChanged()
	{
		mMenu.onItemActionRequestChanged(this);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field MenuBuilder mMenu>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #151 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
	//    4    8:return          
	}

	public boolean collapseActionView()
	{
		if((mShowAsAction & 8) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field int mShowAsAction>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifne            12
	//*   5   10:iconst_0        
	//*   6   11:ireturn         
		{
			if(mActionView == null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #155 <Field View mActionView>
	//*   9   16:ifnonnull       21
				return true;
	//   10   19:iconst_1        
	//   11   20:ireturn         
			if(mOnActionExpandListener == null || mOnActionExpandListener.onMenuItemActionCollapse(((MenuItem) (this))))
	//*  12   21:aload_0         
	//*  13   22:getfield        #157 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//*  14   25:ifnull          41
	//*  15   28:aload_0         
	//*  16   29:getfield        #157 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//*  17   32:aload_0         
	//*  18   33:invokeinterface #163 <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
	//*  19   38:ifeq            10
				return mMenu.collapseItemActionView(this);
	//   20   41:aload_0         
	//   21   42:getfield        #112 <Field MenuBuilder mMenu>
	//   22   45:aload_0         
	//   23   46:invokevirtual   #167 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
	//   24   49:ireturn         
		}
		return false;
	}

	public boolean expandActionView()
	{
		while(!hasCollapsibleActionView() || mOnActionExpandListener != null && !mOnActionExpandListener.onMenuItemActionExpand(((MenuItem) (this)))) 
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #171 <Method boolean hasCollapsibleActionView()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:getfield        #157 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//    7   13:ifnull          29
	//    8   16:aload_0         
	//    9   17:getfield        #157 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//   10   20:aload_0         
	//   11   21:invokeinterface #174 <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
	//   12   26:ifeq            7
		return mMenu.expandItemActionView(this);
	//   13   29:aload_0         
	//   14   30:getfield        #112 <Field MenuBuilder mMenu>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #177 <Method boolean MenuBuilder.expandItemActionView(MenuItemImpl)>
	//   17   37:ireturn         
	}

	public android.view.ActionProvider getActionProvider()
	{
		throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
	//    0    0:new             #181 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #183 <String "This is not supported, use MenuItemCompat.getActionProvider()">
	//    3    6:invokespecial   #186 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public View getActionView()
	{
		if(mActionView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field View mActionView>
	//*   2    4:ifnull          12
			return mActionView;
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field View mActionView>
	//    5   11:areturn         
		if(mActionProvider != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #190 <Field ActionProvider mActionProvider>
	//*   8   16:ifnull          36
		{
			mActionView = mActionProvider.onCreateActionView(((MenuItem) (this)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #190 <Field ActionProvider mActionProvider>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #196 <Method View ActionProvider.onCreateActionView(MenuItem)>
	//   14   28:putfield        #155 <Field View mActionView>
			return mActionView;
	//   15   31:aload_0         
	//   16   32:getfield        #155 <Field View mActionView>
	//   17   35:areturn         
		} else
		{
			return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
		}
	}

	public int getAlphabeticModifiers()
	{
		return mShortcutAlphabeticModifiers;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int mShortcutAlphabeticModifiers>
	//    2    4:ireturn         
	}

	public char getAlphabeticShortcut()
	{
		return mShortcutAlphabeticChar;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field char mShortcutAlphabeticChar>
	//    2    4:ireturn         
	}

	Runnable getCallback()
	{
		return mItemCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field Runnable mItemCallback>
	//    2    4:areturn         
	}

	public CharSequence getContentDescription()
	{
		return mContentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field CharSequence mContentDescription>
	//    2    4:areturn         
	}

	public int getGroupId()
	{
		return mGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int mGroup>
	//    2    4:ireturn         
	}

	public Drawable getIcon()
	{
		if(mIconDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field Drawable mIconDrawable>
	//*   2    4:ifnull          16
			return applyIconTintIfNecessary(mIconDrawable);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #214 <Field Drawable mIconDrawable>
	//    6   12:invokespecial   #216 <Method Drawable applyIconTintIfNecessary(Drawable)>
	//    7   15:areturn         
		if(mIconResId != 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #94  <Field int mIconResId>
	//*  10   20:ifeq            54
		{
			Drawable drawable = AppCompatResources.getDrawable(mMenu.getContext(), mIconResId);
	//   11   23:aload_0         
	//   12   24:getfield        #112 <Field MenuBuilder mMenu>
	//   13   27:invokevirtual   #220 <Method Context MenuBuilder.getContext()>
	//   14   30:aload_0         
	//   15   31:getfield        #94  <Field int mIconResId>
	//   16   34:invokestatic    #226 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   17   37:astore_1        
			mIconResId = 0;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #94  <Field int mIconResId>
			mIconDrawable = drawable;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #214 <Field Drawable mIconDrawable>
			return applyIconTintIfNecessary(drawable);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokespecial   #216 <Method Drawable applyIconTintIfNecessary(Drawable)>
	//   27   53:areturn         
		} else
		{
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		}
	}

	public ColorStateList getIconTintList()
	{
		return mIconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ColorStateList mIconTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getIconTintMode()
	{
		return mIconTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field android.graphics.PorterDuff$Mode mIconTintMode>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field Intent mIntent>
	//    2    4:areturn         
	}

	public int getItemId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int mId>
	//    2    4:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return mMenuInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
	//    2    4:areturn         
	}

	public int getNumericModifiers()
	{
		return mShortcutNumericModifiers;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int mShortcutNumericModifiers>
	//    2    4:ireturn         
	}

	public char getNumericShortcut()
	{
		return mShortcutNumericChar;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field char mShortcutNumericChar>
	//    2    4:ireturn         
	}

	public int getOrder()
	{
		return mCategoryOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mCategoryOrder>
	//    2    4:ireturn         
	}

	public int getOrdering()
	{
		return mOrdering;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int mOrdering>
	//    2    4:ireturn         
	}

	char getShortcut()
	{
		if(mMenu.isQwertyMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field MenuBuilder mMenu>
	//*   2    4:invokevirtual   #251 <Method boolean MenuBuilder.isQwertyMode()>
	//*   3    7:ifeq            15
			return mShortcutAlphabeticChar;
	//    4   10:aload_0         
	//    5   11:getfield        #202 <Field char mShortcutAlphabeticChar>
	//    6   14:ireturn         
		else
			return mShortcutNumericChar;
	//    7   15:aload_0         
	//    8   16:getfield        #245 <Field char mShortcutNumericChar>
	//    9   19:ireturn         
	}

	String getShortcutLabel()
	{
		char c;
		StringBuilder stringbuilder;
		c = getShortcut();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #255 <Method char getShortcut()>
	//    2    4:istore_1        
		if(c == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			return "";
	//    5    9:ldc2            #257 <String "">
	//    6   12:areturn         
		stringbuilder = new StringBuilder(sPrependShortcutLabel);
	//    7   13:new             #259 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:getstatic       #261 <Field String sPrependShortcutLabel>
	//   10   20:invokespecial   #262 <Method void StringBuilder(String)>
	//   11   23:astore_2        
		c;
	//   12   24:iload_1         
		JVM INSTR lookupswitch 3: default 60
	//	               8: 82
	//	               10: 71
	//	               32: 93;
	//   13   25:lookupswitch    3: default 60
	//	               8: 82
	//	               10: 71
	//	               32: 93
		   goto _L1 _L2 _L3 _L4
_L1:
		stringbuilder.append(c);
	//   14   60:aload_2         
	//   15   61:iload_1         
	//   16   62:invokevirtual   #266 <Method StringBuilder StringBuilder.append(char)>
	//   17   65:pop             
_L6:
		return stringbuilder.toString();
	//   18   66:aload_2         
	//   19   67:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   20   70:areturn         
_L3:
		stringbuilder.append(sEnterShortcutLabel);
	//   21   71:aload_2         
	//   22   72:getstatic       #271 <Field String sEnterShortcutLabel>
	//   23   75:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   24   78:pop             
		continue; /* Loop/switch isn't completed */
	//   25   79:goto            66
_L2:
		stringbuilder.append(sDeleteShortcutLabel);
	//   26   82:aload_2         
	//   27   83:getstatic       #276 <Field String sDeleteShortcutLabel>
	//   28   86:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   29   89:pop             
		continue; /* Loop/switch isn't completed */
	//   30   90:goto            66
_L4:
		stringbuilder.append(sSpaceShortcutLabel);
	//   31   93:aload_2         
	//   32   94:getstatic       #278 <Field String sSpaceShortcutLabel>
	//   33   97:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   34  100:pop             
		if(true) goto _L6; else goto _L5
	//   35  101:goto            66
_L5:
	}

	public SubMenu getSubMenu()
	{
		return ((SubMenu) (mSubMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field SubMenuBuilder mSubMenu>
	//    2    4:areturn         
	}

	public ActionProvider getSupportActionProvider()
	{
		return mActionProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ActionProvider mActionProvider>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		CharSequence charsequence;
		Object obj;
		if(mTitleCondensed != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #288 <Field CharSequence mTitleCondensed>
	//*   2    4:ifnull          46
			charsequence = mTitleCondensed;
	//    3    7:aload_0         
	//    4    8:getfield        #288 <Field CharSequence mTitleCondensed>
	//    5   11:astore_1        
		else
	//*   6   12:aload_1         
	//*   7   13:astore_2        
	//*   8   14:getstatic       #293 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   17:bipush          18
	//*  10   19:icmpge          44
	//*  11   22:aload_1         
	//*  12   23:astore_2        
	//*  13   24:aload_1         
	//*  14   25:ifnull          44
	//*  15   28:aload_1         
	//*  16   29:astore_2        
	//*  17   30:aload_1         
	//*  18   31:instanceof      #295 <Class String>
	//*  19   34:ifne            44
	//*  20   37:aload_1         
	//*  21   38:invokeinterface #298 <Method String CharSequence.toString()>
	//*  22   43:astore_2        
	//*  23   44:aload_2         
	//*  24   45:areturn         
			charsequence = mTitle;
	//   25   46:aload_0         
	//   26   47:getfield        #122 <Field CharSequence mTitle>
	//   27   50:astore_1        
		obj = ((Object) (charsequence));
		if(android.os.Build.VERSION.SDK_INT < 18)
		{
			obj = ((Object) (charsequence));
			if(charsequence != null)
			{
				obj = ((Object) (charsequence));
				if(!(charsequence instanceof String))
					obj = ((Object) (charsequence.toString()));
			}
		}
		return ((CharSequence) (obj));
	//*  28   51:goto            12
	}

	CharSequence getTitleForItemView(MenuView.ItemView itemview)
	{
		if(itemview != null && itemview.prefersCondensedTitle())
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #305 <Method boolean MenuView$ItemView.prefersCondensedTitle()>
	//*   4   10:ifeq            18
			return getTitleCondensed();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #307 <Method CharSequence getTitleCondensed()>
	//    7   17:areturn         
		else
			return getTitle();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #309 <Method CharSequence getTitle()>
	//   10   22:areturn         
	}

	public CharSequence getTooltipText()
	{
		return mTooltipText;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field CharSequence mTooltipText>
	//    2    4:areturn         
	}

	public boolean hasCollapsibleActionView()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		if((mShowAsAction & 8) != 0)
	//*   4    4:aload_0         
	//*   5    5:getfield        #108 <Field int mShowAsAction>
	//*   6    8:bipush          8
	//*   7   10:iand            
	//*   8   11:ifeq            51
		{
			if(mActionView == null && mActionProvider != null)
	//*   9   14:aload_0         
	//*  10   15:getfield        #155 <Field View mActionView>
	//*  11   18:ifnonnull       40
	//*  12   21:aload_0         
	//*  13   22:getfield        #190 <Field ActionProvider mActionProvider>
	//*  14   25:ifnull          40
				mActionView = mActionProvider.onCreateActionView(((MenuItem) (this)));
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #190 <Field ActionProvider mActionProvider>
	//   18   33:aload_0         
	//   19   34:invokevirtual   #196 <Method View ActionProvider.onCreateActionView(MenuItem)>
	//   20   37:putfield        #155 <Field View mActionView>
			flag = flag1;
	//   21   40:iload_2         
	//   22   41:istore_1        
			if(mActionView != null)
	//*  23   42:aload_0         
	//*  24   43:getfield        #155 <Field View mActionView>
	//*  25   46:ifnull          51
				flag = true;
	//   26   49:iconst_1        
	//   27   50:istore_1        
		}
		return flag;
	//   28   51:iload_1         
	//   29   52:ireturn         
	}

	public boolean hasSubMenu()
	{
		return mSubMenu != null;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field SubMenuBuilder mSubMenu>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean invoke()
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #318 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #323 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//*   7   17:ifeq            22
_L2:
		return true;
	//    8   20:iconst_1        
	//    9   21:ireturn         
		if(mClickListener != null && mClickListener.onMenuItemClick(((MenuItem) (this))) || mMenu.dispatchMenuItemSelected(mMenu, ((MenuItem) (this)))) goto _L2; else goto _L1
	//   10   22:aload_0         
	//   11   23:getfield        #112 <Field MenuBuilder mMenu>
	//   12   26:aload_0         
	//   13   27:getfield        #112 <Field MenuBuilder mMenu>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #327 <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
	//   16   34:ifne            20
_L1:
		if(mItemCallback != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #206 <Field Runnable mItemCallback>
	//*  19   41:ifnull          55
		{
			mItemCallback.run();
	//   20   44:aload_0         
	//   21   45:getfield        #206 <Field Runnable mItemCallback>
	//   22   48:invokeinterface #332 <Method void Runnable.run()>
			return true;
	//   23   53:iconst_1        
	//   24   54:ireturn         
		}
		if(mIntent == null)
			continue; /* Loop/switch isn't completed */
	//   25   55:aload_0         
	//   26   56:getfield        #234 <Field Intent mIntent>
	//   27   59:ifnull          89
		mMenu.getContext().startActivity(mIntent);
	//   28   62:aload_0         
	//   29   63:getfield        #112 <Field MenuBuilder mMenu>
	//   30   66:invokevirtual   #220 <Method Context MenuBuilder.getContext()>
	//   31   69:aload_0         
	//   32   70:getfield        #234 <Field Intent mIntent>
	//   33   73:invokevirtual   #338 <Method void Context.startActivity(Intent)>
		return true;
	//   34   76:iconst_1        
	//   35   77:ireturn         
		ActivityNotFoundException activitynotfoundexception;
		activitynotfoundexception;
	//   36   78:astore_1        
		Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", ((Throwable) (activitynotfoundexception)));
	//   37   79:ldc1            #33  <String "MenuItemImpl">
	//   38   81:ldc2            #340 <String "Can't find activity to handle intent; ignoring">
	//   39   84:aload_1         
	//   40   85:invokestatic    #346 <Method int Log.e(String, String, Throwable)>
	//   41   88:pop             
		if(mActionProvider != null && mActionProvider.onPerformDefaultAction()) goto _L2; else goto _L3
	//   42   89:aload_0         
	//   43   90:getfield        #190 <Field ActionProvider mActionProvider>
	//   44   93:ifnull          106
	//   45   96:aload_0         
	//   46   97:getfield        #190 <Field ActionProvider mActionProvider>
	//   47  100:invokevirtual   #349 <Method boolean ActionProvider.onPerformDefaultAction()>
	//   48  103:ifne            20
_L3:
		return false;
	//   49  106:iconst_0        
	//   50  107:ireturn         
	}

	public boolean isActionButton()
	{
		return (mFlags & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mFlags>
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
	//    1    1:getfield        #110 <Field boolean mIsActionViewExpanded>
	//    2    4:ireturn         
	}

	public boolean isCheckable()
	{
		return (mFlags & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mFlags>
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
	//    1    1:getfield        #106 <Field int mFlags>
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
	//    1    1:getfield        #106 <Field int mFlags>
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
	//    1    1:getfield        #106 <Field int mFlags>
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
		if(mActionProvider == null || !mActionProvider.overridesItemVisibility()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ActionProvider mActionProvider>
	//    2    4:ifnull          41
	//    3    7:aload_0         
	//    4    8:getfield        #190 <Field ActionProvider mActionProvider>
	//    5   11:invokevirtual   #359 <Method boolean ActionProvider.overridesItemVisibility()>
	//    6   14:ifeq            41
_L1:
		if((mFlags & 8) != 0 || !mActionProvider.isVisible()) goto _L4; else goto _L3
	//    7   17:aload_0         
	//    8   18:getfield        #106 <Field int mFlags>
	//    9   21:bipush          8
	//   10   23:iand            
	//   11   24:ifne            39
	//   12   27:aload_0         
	//   13   28:getfield        #190 <Field ActionProvider mActionProvider>
	//   14   31:invokevirtual   #361 <Method boolean ActionProvider.isVisible()>
	//   15   34:ifeq            39
_L3:
		return true;
	//   16   37:iconst_1        
	//   17   38:ireturn         
_L4:
		return false;
	//   18   39:iconst_0        
	//   19   40:ireturn         
_L2:
		if((mFlags & 8) != 0)
	//*  20   41:aload_0         
	//*  21   42:getfield        #106 <Field int mFlags>
	//*  22   45:bipush          8
	//*  23   47:iand            
	//*  24   48:ifeq            37
			return false;
	//   25   51:iconst_0        
	//   26   52:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	public boolean requestsActionButton()
	{
		return (mShowAsAction & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int mShowAsAction>
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
	//    1    1:getfield        #108 <Field int mShowAsAction>
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
	//    0    0:new             #181 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #367 <String "This is not supported, use MenuItemCompat.setActionProvider()">
	//    3    7:invokespecial   #186 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public SupportMenuItem setActionView(int i)
	{
		Context context = mMenu.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #220 <Method Context MenuBuilder.getContext()>
	//    3    7:astore_2        
		setActionView(LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (new LinearLayout(context))), false));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokestatic    #375 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   13:iload_1         
	//    8   14:new             #377 <Class LinearLayout>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #380 <Method void LinearLayout(Context)>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #384 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   14   26:invokevirtual   #387 <Method SupportMenuItem setActionView(View)>
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
	//    2    2:putfield        #155 <Field View mActionView>
		mActionProvider = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #190 <Field ActionProvider mActionProvider>
		if(view != null && view.getId() == -1 && mId > 0)
	//*   6   10:aload_1         
	//*   7   11:ifnull          37
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #392 <Method int View.getId()>
	//*  10   18:iconst_m1       
	//*  11   19:icmpne          37
	//*  12   22:aload_0         
	//*  13   23:getfield        #114 <Field int mId>
	//*  14   26:ifle            37
			view.setId(mId);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #114 <Field int mId>
	//   18   34:invokevirtual   #396 <Method void View.setId(int)>
		mMenu.onItemActionRequestChanged(this);
	//   19   37:aload_0         
	//   20   38:getfield        #112 <Field MenuBuilder mMenu>
	//   21   41:aload_0         
	//   22   42:invokevirtual   #151 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
		return ((SupportMenuItem) (this));
	//   23   45:aload_0         
	//   24   46:areturn         
	}

	public volatile MenuItem setActionView(int i)
	{
		return ((MenuItem) (setActionView(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #399 <Method SupportMenuItem setActionView(int)>
	//    3    5:areturn         
	}

	public volatile MenuItem setActionView(View view)
	{
		return ((MenuItem) (setActionView(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #387 <Method SupportMenuItem setActionView(View)>
	//    3    5:areturn         
	}

	public void setActionViewExpanded(boolean flag)
	{
		mIsActionViewExpanded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #110 <Field boolean mIsActionViewExpanded>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
	//    7   13:return          
	}

	public MenuItem setAlphabeticShortcut(char c)
	{
		if(mShortcutAlphabeticChar == c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field char mShortcutAlphabeticChar>
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
	//    8   12:invokestatic    #413 <Method char Character.toLowerCase(char)>
	//    9   15:putfield        #202 <Field char mShortcutAlphabeticChar>
			mMenu.onItemsChanged(false);
	//   10   18:aload_0         
	//   11   19:getfield        #112 <Field MenuBuilder mMenu>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public MenuItem setAlphabeticShortcut(char c, int i)
	{
		if(mShortcutAlphabeticChar == c && mShortcutAlphabeticModifiers == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field char mShortcutAlphabeticChar>
	//*   2    4:iload_1         
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #92  <Field int mShortcutAlphabeticModifiers>
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
	//   12   20:invokestatic    #413 <Method char Character.toLowerCase(char)>
	//   13   23:putfield        #202 <Field char mShortcutAlphabeticChar>
			mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokestatic    #420 <Method int KeyEvent.normalizeMetaState(int)>
	//   17   31:putfield        #92  <Field int mShortcutAlphabeticModifiers>
			mMenu.onItemsChanged(false);
	//   18   34:aload_0         
	//   19   35:getfield        #112 <Field MenuBuilder mMenu>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
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
	//    2    2:putfield        #206 <Field Runnable mItemCallback>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mFlags>
	//    2    4:istore_3        
		int j = mFlags;
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field int mFlags>
	//    5    9:istore          4
		boolean flag1;
		if(flag)
	//*   6   11:iload_1         
	//*   7   12:ifeq            46
			flag1 = true;
	//    8   15:iconst_1        
	//    9   16:istore_2        
		else
	//*  10   17:aload_0         
	//*  11   18:iload_2         
	//*  12   19:iload           4
	//*  13   21:bipush          -2
	//*  14   23:iand            
	//*  15   24:ior             
	//*  16   25:putfield        #106 <Field int mFlags>
	//*  17   28:iload_3         
	//*  18   29:aload_0         
	//*  19   30:getfield        #106 <Field int mFlags>
	//*  20   33:icmpeq          44
	//*  21   36:aload_0         
	//*  22   37:getfield        #112 <Field MenuBuilder mMenu>
	//*  23   40:iconst_0        
	//*  24   41:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
	//*  25   44:aload_0         
	//*  26   45:areturn         
			flag1 = false;
	//   27   46:iconst_0        
	//   28   47:istore_2        
		mFlags = flag1 | j & -2;
		if(i != mFlags)
			mMenu.onItemsChanged(false);
		return ((MenuItem) (this));
	//*  29   48:goto            17
	}

	public MenuItem setChecked(boolean flag)
	{
		if((mFlags & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field int mFlags>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            19
		{
			mMenu.setExclusiveItemChecked(((MenuItem) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #112 <Field MenuBuilder mMenu>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #429 <Method void MenuBuilder.setExclusiveItemChecked(MenuItem)>
			return ((MenuItem) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
		} else
		{
			setCheckedInt(flag);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #432 <Method void setCheckedInt(boolean)>
			return ((MenuItem) (this));
	//   14   24:aload_0         
	//   15   25:areturn         
		}
	}

	void setCheckedInt(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mFlags>
	//    2    4:istore_3        
		int j = mFlags;
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field int mFlags>
	//    5    9:istore          4
		byte byte0;
		if(flag)
	//*   6   11:iload_1         
	//*   7   12:ifeq            45
			byte0 = 2;
	//    8   15:iconst_2        
	//    9   16:istore_2        
		else
	//*  10   17:aload_0         
	//*  11   18:iload_2         
	//*  12   19:iload           4
	//*  13   21:bipush          -3
	//*  14   23:iand            
	//*  15   24:ior             
	//*  16   25:putfield        #106 <Field int mFlags>
	//*  17   28:iload_3         
	//*  18   29:aload_0         
	//*  19   30:getfield        #106 <Field int mFlags>
	//*  20   33:icmpeq          44
	//*  21   36:aload_0         
	//*  22   37:getfield        #112 <Field MenuBuilder mMenu>
	//*  23   40:iconst_0        
	//*  24   41:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
	//*  25   44:return          
			byte0 = 0;
	//   26   45:iconst_0        
	//   27   46:istore_2        
		mFlags = byte0 | j & -3;
		if(i != mFlags)
			mMenu.onItemsChanged(false);
	//*  28   47:goto            17
	}

	public SupportMenuItem setContentDescription(CharSequence charsequence)
	{
		mContentDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #210 <Field CharSequence mContentDescription>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((SupportMenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public volatile MenuItem setContentDescription(CharSequence charsequence)
	{
		return ((MenuItem) (setContentDescription(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #437 <Method SupportMenuItem setContentDescription(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setEnabled(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            25
			mFlags = mFlags | 0x10;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field int mFlags>
	//    5    9:bipush          16
	//    6   11:ior             
	//    7   12:putfield        #106 <Field int mFlags>
		else
	//*   8   15:aload_0         
	//*   9   16:getfield        #112 <Field MenuBuilder mMenu>
	//*  10   19:iconst_0        
	//*  11   20:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
	//*  12   23:aload_0         
	//*  13   24:areturn         
			mFlags = mFlags & 0xffffffef;
	//   14   25:aload_0         
	//   15   26:aload_0         
	//   16   27:getfield        #106 <Field int mFlags>
	//   17   30:bipush          -17
	//   18   32:iand            
	//   19   33:putfield        #106 <Field int mFlags>
		mMenu.onItemsChanged(false);
		return ((MenuItem) (this));
	//*  20   36:goto            15
	}

	public void setExclusiveCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mFlags>
	//    2    4:istore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            22
			byte0 = 4;
	//    5    9:iconst_4        
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:bipush          -5
	//*  11   16:iand            
	//*  12   17:ior             
	//*  13   18:putfield        #106 <Field int mFlags>
	//*  14   21:return          
			byte0 = 0;
	//   15   22:iconst_0        
	//   16   23:istore_2        
		mFlags = byte0 | i & -5;
	//*  17   24:goto            11
	}

	public MenuItem setIcon(int i)
	{
		mIconDrawable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #214 <Field Drawable mIconDrawable>
		mIconResId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #94  <Field int mIconResId>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #104 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #112 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		mIconResId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #94  <Field int mIconResId>
		mIconDrawable = drawable;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #214 <Field Drawable mIconDrawable>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #104 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #112 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIconTintList(ColorStateList colorstatelist)
	{
		mIconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field ColorStateList mIconTintList>
		mHasIconTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #100 <Field boolean mHasIconTint>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #104 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #112 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mIconTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field android.graphics.PorterDuff$Mode mIconTintMode>
		mHasIconTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #102 <Field boolean mHasIconTintMode>
		mNeedToApplyIconTint = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #104 <Field boolean mNeedToApplyIconTint>
		mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #112 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		mIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #234 <Field Intent mIntent>
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
	//    4    6:getfield        #106 <Field int mFlags>
	//    5    9:bipush          32
	//    6   11:ior             
	//    7   12:putfield        #106 <Field int mFlags>
			return;
	//    8   15:return          
		} else
		{
			mFlags = mFlags & 0xffffffdf;
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #106 <Field int mFlags>
	//   12   21:bipush          -33
	//   13   23:iand            
	//   14   24:putfield        #106 <Field int mFlags>
			return;
	//   15   27:return          
		}
	}

	void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		mMenuInfo = contextmenuinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #241 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
	//    3    5:return          
	}

	public MenuItem setNumericShortcut(char c)
	{
		if(mShortcutNumericChar == c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field char mShortcutNumericChar>
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
	//    8   12:putfield        #245 <Field char mShortcutNumericChar>
			mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #112 <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public MenuItem setNumericShortcut(char c, int i)
	{
		if(mShortcutNumericChar == c && mShortcutNumericModifiers == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field char mShortcutNumericChar>
	//*   2    4:iload_1         
	//*   3    5:icmpne          18
	//*   4    8:aload_0         
	//*   5    9:getfield        #90  <Field int mShortcutNumericModifiers>
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
	//   12   20:putfield        #245 <Field char mShortcutNumericChar>
			mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:invokestatic    #420 <Method int KeyEvent.normalizeMetaState(int)>
	//   16   28:putfield        #90  <Field int mShortcutNumericModifiers>
			mMenu.onItemsChanged(false);
	//   17   31:aload_0         
	//   18   32:getfield        #112 <Field MenuBuilder mMenu>
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
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
	//    2    2:putfield        #157 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		mClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #318 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setShortcut(char c, char c1)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #245 <Field char mShortcutNumericChar>
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #413 <Method char Character.toLowerCase(char)>
	//    6   10:putfield        #202 <Field char mShortcutAlphabeticChar>
		mMenu.onItemsChanged(false);
	//    7   13:aload_0         
	//    8   14:getfield        #112 <Field MenuBuilder mMenu>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public MenuItem setShortcut(char c, char c1, int i, int j)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #245 <Field char mShortcutNumericChar>
		mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:invokestatic    #420 <Method int KeyEvent.normalizeMetaState(int)>
	//    6   10:putfield        #90  <Field int mShortcutNumericModifiers>
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokestatic    #413 <Method char Character.toLowerCase(char)>
	//   10   18:putfield        #202 <Field char mShortcutAlphabeticChar>
		mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(j);
	//   11   21:aload_0         
	//   12   22:iload           4
	//   13   24:invokestatic    #420 <Method int KeyEvent.normalizeMetaState(int)>
	//   14   27:putfield        #92  <Field int mShortcutAlphabeticModifiers>
		mMenu.onItemsChanged(false);
	//   15   30:aload_0         
	//   16   31:getfield        #112 <Field MenuBuilder mMenu>
	//   17   34:iconst_0        
	//   18   35:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
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
	//    4   28:new             #463 <Class IllegalArgumentException>
	//    5   31:dup             
	//    6   32:ldc2            #465 <String "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.">
	//    7   35:invokespecial   #466 <Method void IllegalArgumentException(String)>
	//    8   38:athrow          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			mShowAsAction = i;
	//    9   39:aload_0         
	//   10   40:iload_1         
	//   11   41:putfield        #108 <Field int mShowAsAction>
			break;
		}
		mMenu.onItemActionRequestChanged(this);
	//   12   44:aload_0         
	//   13   45:getfield        #112 <Field MenuBuilder mMenu>
	//   14   48:aload_0         
	//   15   49:invokevirtual   #151 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
	//   16   52:return          
	}

	public SupportMenuItem setShowAsActionFlags(int i)
	{
		setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #469 <Method void setShowAsAction(int)>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setShowAsActionFlags(int i)
	{
		return ((MenuItem) (setShowAsActionFlags(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #471 <Method SupportMenuItem setShowAsActionFlags(int)>
	//    3    5:areturn         
	}

	public void setSubMenu(SubMenuBuilder submenubuilder)
	{
		mSubMenu = submenubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #282 <Field SubMenuBuilder mSubMenu>
		submenubuilder.setHeaderTitle(getTitle());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #309 <Method CharSequence getTitle()>
	//    6   10:invokevirtual   #479 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
	//    7   13:pop             
	//    8   14:return          
	}

	public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
	{
		if(mActionProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field ActionProvider mActionProvider>
	//*   2    4:ifnull          14
			mActionProvider.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #190 <Field ActionProvider mActionProvider>
	//    5   11:invokevirtual   #484 <Method void ActionProvider.reset()>
		mActionView = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #155 <Field View mActionView>
		mActionProvider = actionprovider;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #190 <Field ActionProvider mActionProvider>
		mMenu.onItemsChanged(true);
	//   12   24:aload_0         
	//   13   25:getfield        #112 <Field MenuBuilder mMenu>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		if(mActionProvider != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #190 <Field ActionProvider mActionProvider>
	//*  18   36:ifnull          54
			mActionProvider.setVisibilityListener(new android.support.v4.view.ActionProvider.VisibilityListener() {

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
	//   19   39:aload_0         
	//   20   40:getfield        #190 <Field ActionProvider mActionProvider>
	//   21   43:new             #8   <Class MenuItemImpl$1>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:invokespecial   #486 <Method void MenuItemImpl$1(MenuItemImpl)>
	//   25   51:invokevirtual   #490 <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
		return ((SupportMenuItem) (this));
	//   26   54:aload_0         
	//   27   55:areturn         
	}

	public MenuItem setTitle(int i)
	{
		return setTitle(((CharSequence) (mMenu.getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #112 <Field MenuBuilder mMenu>
	//    3    5:invokevirtual   #220 <Method Context MenuBuilder.getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #495 <Method String Context.getString(int)>
	//    6   12:invokevirtual   #497 <Method MenuItem setTitle(CharSequence)>
	//    7   15:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field CharSequence mTitle>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		if(mSubMenu != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #282 <Field SubMenuBuilder mSubMenu>
	//*   9   17:ifnull          29
			mSubMenu.setHeaderTitle(charsequence);
	//   10   20:aload_0         
	//   11   21:getfield        #282 <Field SubMenuBuilder mSubMenu>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #479 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
	//   14   28:pop             
		return ((MenuItem) (this));
	//   15   29:aload_0         
	//   16   30:areturn         
	}

	public MenuItem setTitleCondensed(CharSequence charsequence)
	{
		mTitleCondensed = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #288 <Field CharSequence mTitleCondensed>
		if(charsequence == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			charsequence = mTitle;
	//    5    9:aload_0         
	//    6   10:getfield        #122 <Field CharSequence mTitle>
	//    7   13:astore_1        
		mMenu.onItemsChanged(false);
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field MenuBuilder mMenu>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public SupportMenuItem setTooltipText(CharSequence charsequence)
	{
		mTooltipText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #312 <Field CharSequence mTooltipText>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #405 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((SupportMenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public volatile MenuItem setTooltipText(CharSequence charsequence)
	{
		return ((MenuItem) (setTooltipText(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #501 <Method SupportMenuItem setTooltipText(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		if(setVisibleInt(flag))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #506 <Method boolean setVisibleInt(boolean)>
	//*   3    5:ifeq            16
			mMenu.onItemVisibleChanged(this);
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field MenuBuilder mMenu>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #509 <Method void MenuBuilder.onItemVisibleChanged(MenuItemImpl)>
		return ((MenuItem) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	boolean setVisibleInt(boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int i = mFlags;
	//    2    3:aload_0         
	//    3    4:getfield        #106 <Field int mFlags>
	//    4    7:istore_3        
		int j = mFlags;
	//    5    8:aload_0         
	//    6    9:getfield        #106 <Field int mFlags>
	//    7   12:istore          4
		byte byte0;
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            46
			byte0 = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		else
	//*  12   20:aload_0         
	//*  13   21:iload_2         
	//*  14   22:iload           4
	//*  15   24:bipush          -9
	//*  16   26:iand            
	//*  17   27:ior             
	//*  18   28:putfield        #106 <Field int mFlags>
	//*  19   31:iload           5
	//*  20   33:istore_1        
	//*  21   34:iload_3         
	//*  22   35:aload_0         
	//*  23   36:getfield        #106 <Field int mFlags>
	//*  24   39:icmpeq          44
	//*  25   42:iconst_1        
	//*  26   43:istore_1        
	//*  27   44:iload_1         
	//*  28   45:ireturn         
			byte0 = 8;
	//   29   46:bipush          8
	//   30   48:istore_2        
		mFlags = byte0 | j & -9;
		flag = flag1;
		if(i != mFlags)
			flag = true;
		return flag;
	//*  31   49:goto            20
	}

	public boolean shouldShowIcon()
	{
		return mMenu.getOptionalIconsVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #513 <Method boolean MenuBuilder.getOptionalIconsVisible()>
	//    3    7:ireturn         
	}

	boolean shouldShowShortcut()
	{
		return mMenu.isShortcutsVisible() && getShortcut() != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #517 <Method boolean MenuBuilder.isShortcutsVisible()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokevirtual   #255 <Method char getShortcut()>
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
	//    1    1:getfield        #108 <Field int mShowAsAction>
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
		if(mTitle != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field CharSequence mTitle>
	//*   2    4:ifnull          17
			return mTitle.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #122 <Field CharSequence mTitle>
	//    5   11:invokeinterface #298 <Method String CharSequence.toString()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
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
	private static String sDeleteShortcutLabel;
	private static String sEnterShortcutLabel;
	private static String sPrependShortcutLabel;
	private static String sSpaceShortcutLabel;
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
