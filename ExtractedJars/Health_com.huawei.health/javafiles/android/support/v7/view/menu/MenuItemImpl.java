// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.content.res.AppCompatResources;
import android.util.Log;
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
	//    1    1:invokespecial   #79  <Method void Object()>
		mIconResId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #81  <Field int mIconResId>
		mFlags = 16;
	//    5    9:aload_0         
	//    6   10:bipush          16
	//    7   12:putfield        #83  <Field int mFlags>
		mShowAsAction = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #85  <Field int mShowAsAction>
		mIsActionViewExpanded = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #87  <Field boolean mIsActionViewExpanded>
		mMenu = menubuilder;
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:putfield        #89  <Field MenuBuilder mMenu>
		mId = j;
	//   17   30:aload_0         
	//   18   31:iload_3         
	//   19   32:putfield        #91  <Field int mId>
		mGroup = i;
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:putfield        #93  <Field int mGroup>
		mCategoryOrder = k;
	//   23   40:aload_0         
	//   24   41:iload           4
	//   25   43:putfield        #95  <Field int mCategoryOrder>
		mOrdering = l;
	//   26   46:aload_0         
	//   27   47:iload           5
	//   28   49:putfield        #97  <Field int mOrdering>
		mTitle = charsequence;
	//   29   52:aload_0         
	//   30   53:aload           6
	//   31   55:putfield        #99  <Field CharSequence mTitle>
		mShowAsAction = i1;
	//   32   58:aload_0         
	//   33   59:iload           7
	//   34   61:putfield        #85  <Field int mShowAsAction>
	//   35   64:return          
	}

	public void actionFormatChanged()
	{
		mMenu.onItemActionRequestChanged(this);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field MenuBuilder mMenu>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #107 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
	//    4    8:return          
	}

	public boolean collapseActionView()
	{
		if((mShowAsAction & 8) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int mShowAsAction>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifne            12
			return false;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		if(mActionView == null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #111 <Field View mActionView>
	//*   9   16:ifnonnull       21
			return true;
	//   10   19:iconst_1        
	//   11   20:ireturn         
		if(mOnActionExpandListener == null || mOnActionExpandListener.onMenuItemActionCollapse(((MenuItem) (this))))
	//*  12   21:aload_0         
	//*  13   22:getfield        #113 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//*  14   25:ifnull          41
	//*  15   28:aload_0         
	//*  16   29:getfield        #113 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//*  17   32:aload_0         
	//*  18   33:invokeinterface #119 <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
	//*  19   38:ifeq            50
			return mMenu.collapseItemActionView(this);
	//   20   41:aload_0         
	//   21   42:getfield        #89  <Field MenuBuilder mMenu>
	//   22   45:aload_0         
	//   23   46:invokevirtual   #123 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
	//   24   49:ireturn         
		else
			return false;
	//   25   50:iconst_0        
	//   26   51:ireturn         
	}

	public boolean expandActionView()
	{
		if(!hasCollapsibleActionView())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method boolean hasCollapsibleActionView()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(mOnActionExpandListener == null || mOnActionExpandListener.onMenuItemActionExpand(((MenuItem) (this))))
	//*   5    9:aload_0         
	//*   6   10:getfield        #113 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//*   7   13:ifnull          29
	//*   8   16:aload_0         
	//*   9   17:getfield        #113 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #130 <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
	//*  12   26:ifeq            38
			return mMenu.expandItemActionView(this);
	//   13   29:aload_0         
	//   14   30:getfield        #89  <Field MenuBuilder mMenu>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #133 <Method boolean MenuBuilder.expandItemActionView(MenuItemImpl)>
	//   17   37:ireturn         
		else
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
	}

	public android.view.ActionProvider getActionProvider()
	{
		throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
	//    0    0:new             #137 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #139 <String "This is not supported, use MenuItemCompat.getActionProvider()">
	//    3    6:invokespecial   #142 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public View getActionView()
	{
		if(mActionView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field View mActionView>
	//*   2    4:ifnull          12
			return mActionView;
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field View mActionView>
	//    5   11:areturn         
		if(mActionProvider != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #146 <Field ActionProvider mActionProvider>
	//*   8   16:ifnull          36
		{
			mActionView = mActionProvider.onCreateActionView(((MenuItem) (this)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #146 <Field ActionProvider mActionProvider>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #152 <Method View ActionProvider.onCreateActionView(MenuItem)>
	//   14   28:putfield        #111 <Field View mActionView>
			return mActionView;
	//   15   31:aload_0         
	//   16   32:getfield        #111 <Field View mActionView>
	//   17   35:areturn         
		} else
		{
			return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
		}
	}

	public char getAlphabeticShortcut()
	{
		return mShortcutAlphabeticChar;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field char mShortcutAlphabeticChar>
	//    2    4:ireturn         
	}

	Runnable getCallback()
	{
		return mItemCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Runnable mItemCallback>
	//    2    4:areturn         
	}

	public CharSequence getContentDescription()
	{
		return mContentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field CharSequence mContentDescription>
	//    2    4:areturn         
	}

	public int getGroupId()
	{
		return mGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int mGroup>
	//    2    4:ireturn         
	}

	public Drawable getIcon()
	{
		if(mIconDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field Drawable mIconDrawable>
	//*   2    4:ifnull          12
			return mIconDrawable;
	//    3    7:aload_0         
	//    4    8:getfield        #170 <Field Drawable mIconDrawable>
	//    5   11:areturn         
		if(mIconResId != 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #81  <Field int mIconResId>
	//*   8   16:ifeq            46
		{
			Drawable drawable = AppCompatResources.getDrawable(mMenu.getContext(), mIconResId);
	//    9   19:aload_0         
	//   10   20:getfield        #89  <Field MenuBuilder mMenu>
	//   11   23:invokevirtual   #174 <Method Context MenuBuilder.getContext()>
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field int mIconResId>
	//   14   30:invokestatic    #180 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   15   33:astore_1        
			mIconResId = 0;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #81  <Field int mIconResId>
			mIconDrawable = drawable;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #170 <Field Drawable mIconDrawable>
			return drawable;
	//   22   44:aload_1         
	//   23   45:areturn         
		} else
		{
			return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		}
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Intent mIntent>
	//    2    4:areturn         
	}

	public int getItemId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int mId>
	//    2    4:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return mMenuInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
	//    2    4:areturn         
	}

	public char getNumericShortcut()
	{
		return mShortcutNumericChar;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field char mShortcutNumericChar>
	//    2    4:ireturn         
	}

	public int getOrder()
	{
		return mCategoryOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int mCategoryOrder>
	//    2    4:ireturn         
	}

	public int getOrdering()
	{
		return mOrdering;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int mOrdering>
	//    2    4:ireturn         
	}

	char getShortcut()
	{
		if(mMenu.isQwertyMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field MenuBuilder mMenu>
	//*   2    4:invokevirtual   #200 <Method boolean MenuBuilder.isQwertyMode()>
	//*   3    7:ifeq            15
			return mShortcutAlphabeticChar;
	//    4   10:aload_0         
	//    5   11:getfield        #156 <Field char mShortcutAlphabeticChar>
	//    6   14:ireturn         
		else
			return mShortcutNumericChar;
	//    7   15:aload_0         
	//    8   16:getfield        #194 <Field char mShortcutNumericChar>
	//    9   19:ireturn         
	}

	String getShortcutLabel()
	{
		char c = getShortcut();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method char getShortcut()>
	//    2    4:istore_1        
		if(c == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            12
			return "";
	//    5    9:ldc1            #206 <String "">
	//    6   11:areturn         
		StringBuilder stringbuilder = new StringBuilder(sPrependShortcutLabel);
	//    7   12:new             #208 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:getstatic       #210 <Field String sPrependShortcutLabel>
	//   10   19:invokespecial   #211 <Method void StringBuilder(String)>
	//   11   22:astore_2        
		switch(c)
	//*  12   23:iload_1         
		{
	//*  13   24:lookupswitch    3: default 60
	//	               8: 74
	//	               10: 63
	//	               32: 85
	//*  14   60:goto            96
		case 10: // '\n'
			stringbuilder.append(sEnterShortcutLabel);
	//   15   63:aload_2         
	//   16   64:getstatic       #213 <Field String sEnterShortcutLabel>
	//   17   67:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   18   70:pop             
			break;

	//*  19   71:goto            102
		case 8: // '\b'
			stringbuilder.append(sDeleteShortcutLabel);
	//   20   74:aload_2         
	//   21   75:getstatic       #219 <Field String sDeleteShortcutLabel>
	//   22   78:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   23   81:pop             
			break;

	//*  24   82:goto            102
		case 32: // ' '
			stringbuilder.append(sSpaceShortcutLabel);
	//   25   85:aload_2         
	//   26   86:getstatic       #221 <Field String sSpaceShortcutLabel>
	//   27   89:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   28   92:pop             
			break;

	//*  29   93:goto            102
		default:
			stringbuilder.append(c);
	//   30   96:aload_2         
	//   31   97:iload_1         
	//   32   98:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//   33  101:pop             
			break;
		}
		return stringbuilder.toString();
	//   34  102:aload_2         
	//   35  103:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   36  106:areturn         
	}

	public SubMenu getSubMenu()
	{
		return ((SubMenu) (mSubMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field SubMenuBuilder mSubMenu>
	//    2    4:areturn         
	}

	public ActionProvider getSupportActionProvider()
	{
		return mActionProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ActionProvider mActionProvider>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		CharSequence charsequence;
		if(mTitleCondensed != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field CharSequence mTitleCondensed>
	//*   2    4:ifnull          15
			charsequence = mTitleCondensed;
	//    3    7:aload_0         
	//    4    8:getfield        #237 <Field CharSequence mTitleCondensed>
	//    5   11:astore_1        
		else
	//*   6   12:goto            20
			charsequence = mTitle;
	//    7   15:aload_0         
	//    8   16:getfield        #99  <Field CharSequence mTitle>
	//    9   19:astore_1        
		if(android.os.Build.VERSION.SDK_INT < 18 && charsequence != null && !(charsequence instanceof String))
	//*  10   20:getstatic       #242 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          18
	//*  12   25:icmpge          46
	//*  13   28:aload_1         
	//*  14   29:ifnull          46
	//*  15   32:aload_1         
	//*  16   33:instanceof      #244 <Class String>
	//*  17   36:ifne            46
			return ((CharSequence) (charsequence.toString()));
	//   18   39:aload_1         
	//   19   40:invokeinterface #247 <Method String CharSequence.toString()>
	//   20   45:areturn         
		else
			return charsequence;
	//   21   46:aload_1         
	//   22   47:areturn         
	}

	CharSequence getTitleForItemView(MenuView.ItemView itemview)
	{
		if(itemview != null && itemview.prefersCondensedTitle())
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #254 <Method boolean MenuView$ItemView.prefersCondensedTitle()>
	//*   4   10:ifeq            18
			return getTitleCondensed();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #256 <Method CharSequence getTitleCondensed()>
	//    7   17:areturn         
		else
			return getTitle();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #258 <Method CharSequence getTitle()>
	//   10   22:areturn         
	}

	public CharSequence getTooltipText()
	{
		return mTooltipText;
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field CharSequence mTooltipText>
	//    2    4:areturn         
	}

	public boolean hasCollapsibleActionView()
	{
		if((mShowAsAction & 8) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int mShowAsAction>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifeq            47
		{
			if(mActionView == null && mActionProvider != null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #111 <Field View mActionView>
	//*   7   14:ifnonnull       36
	//*   8   17:aload_0         
	//*   9   18:getfield        #146 <Field ActionProvider mActionProvider>
	//*  10   21:ifnull          36
				mActionView = mActionProvider.onCreateActionView(((MenuItem) (this)));
	//   11   24:aload_0         
	//   12   25:aload_0         
	//   13   26:getfield        #146 <Field ActionProvider mActionProvider>
	//   14   29:aload_0         
	//   15   30:invokevirtual   #152 <Method View ActionProvider.onCreateActionView(MenuItem)>
	//   16   33:putfield        #111 <Field View mActionView>
			return mActionView != null;
	//   17   36:aload_0         
	//   18   37:getfield        #111 <Field View mActionView>
	//   19   40:ifnull          45
	//   20   43:iconst_1        
	//   21   44:ireturn         
	//   22   45:iconst_0        
	//   23   46:ireturn         
		} else
		{
			return false;
	//   24   47:iconst_0        
	//   25   48:ireturn         
		}
	}

	public boolean hasSubMenu()
	{
		return mSubMenu != null;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field SubMenuBuilder mSubMenu>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean invoke()
	{
		if(mClickListener != null && mClickListener.onMenuItemClick(((MenuItem) (this))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #267 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #272 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//*   7   17:ifeq            22
			return true;
	//    8   20:iconst_1        
	//    9   21:ireturn         
		if(mMenu.dispatchMenuItemSelected(mMenu.getRootMenu(), ((MenuItem) (this))))
	//*  10   22:aload_0         
	//*  11   23:getfield        #89  <Field MenuBuilder mMenu>
	//*  12   26:aload_0         
	//*  13   27:getfield        #89  <Field MenuBuilder mMenu>
	//*  14   30:invokevirtual   #276 <Method MenuBuilder MenuBuilder.getRootMenu()>
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #280 <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
	//*  17   37:ifeq            42
			return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		if(mItemCallback != null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #160 <Field Runnable mItemCallback>
	//*  22   46:ifnull          60
		{
			mItemCallback.run();
	//   23   49:aload_0         
	//   24   50:getfield        #160 <Field Runnable mItemCallback>
	//   25   53:invokeinterface #285 <Method void Runnable.run()>
			return true;
	//   26   58:iconst_1        
	//   27   59:ireturn         
		}
		if(mIntent == null)
			break MISSING_BLOCK_LABEL_94;
	//   28   60:aload_0         
	//   29   61:getfield        #184 <Field Intent mIntent>
	//   30   64:ifnull          94
		mMenu.getContext().startActivity(mIntent);
	//   31   67:aload_0         
	//   32   68:getfield        #89  <Field MenuBuilder mMenu>
	//   33   71:invokevirtual   #174 <Method Context MenuBuilder.getContext()>
	//   34   74:aload_0         
	//   35   75:getfield        #184 <Field Intent mIntent>
	//   36   78:invokevirtual   #291 <Method void Context.startActivity(Intent)>
		return true;
	//   37   81:iconst_1        
	//   38   82:ireturn         
		ActivityNotFoundException activitynotfoundexception;
		activitynotfoundexception;
	//   39   83:astore_1        
		Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", ((Throwable) (activitynotfoundexception)));
	//   40   84:ldc1            #33  <String "MenuItemImpl">
	//   41   86:ldc2            #293 <String "Can't find activity to handle intent; ignoring">
	//   42   89:aload_1         
	//   43   90:invokestatic    #299 <Method int Log.e(String, String, Throwable)>
	//   44   93:pop             
		return mActionProvider != null && mActionProvider.onPerformDefaultAction();
	//   45   94:aload_0         
	//   46   95:getfield        #146 <Field ActionProvider mActionProvider>
	//   47   98:ifnull          113
	//   48  101:aload_0         
	//   49  102:getfield        #146 <Field ActionProvider mActionProvider>
	//   50  105:invokevirtual   #302 <Method boolean ActionProvider.onPerformDefaultAction()>
	//   51  108:ifeq            113
	//   52  111:iconst_1        
	//   53  112:ireturn         
	//   54  113:iconst_0        
	//   55  114:ireturn         
	}

	public boolean isActionButton()
	{
		return (mFlags & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mFlags>
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
	//    1    1:getfield        #87  <Field boolean mIsActionViewExpanded>
	//    2    4:ireturn         
	}

	public boolean isCheckable()
	{
		return (mFlags & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mFlags>
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
	//    1    1:getfield        #83  <Field int mFlags>
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
	//    1    1:getfield        #83  <Field int mFlags>
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
	//    1    1:getfield        #83  <Field int mFlags>
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
		if(mActionProvider != null && mActionProvider.overridesItemVisibility())
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field ActionProvider mActionProvider>
	//*   2    4:ifnull          41
	//*   3    7:aload_0         
	//*   4    8:getfield        #146 <Field ActionProvider mActionProvider>
	//*   5   11:invokevirtual   #312 <Method boolean ActionProvider.overridesItemVisibility()>
	//*   6   14:ifeq            41
			return (mFlags & 8) == 0 && mActionProvider.isVisible();
	//    7   17:aload_0         
	//    8   18:getfield        #83  <Field int mFlags>
	//    9   21:bipush          8
	//   10   23:iand            
	//   11   24:ifne            39
	//   12   27:aload_0         
	//   13   28:getfield        #146 <Field ActionProvider mActionProvider>
	//   14   31:invokevirtual   #314 <Method boolean ActionProvider.isVisible()>
	//   15   34:ifeq            39
	//   16   37:iconst_1        
	//   17   38:ireturn         
	//   18   39:iconst_0        
	//   19   40:ireturn         
		return (mFlags & 8) == 0;
	//   20   41:aload_0         
	//   21   42:getfield        #83  <Field int mFlags>
	//   22   45:bipush          8
	//   23   47:iand            
	//   24   48:ifne            53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public boolean requestsActionButton()
	{
		return (mShowAsAction & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int mShowAsAction>
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
	//    1    1:getfield        #85  <Field int mShowAsAction>
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
	//    0    0:new             #137 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #320 <String "This is not supported, use MenuItemCompat.setActionProvider()">
	//    3    7:invokespecial   #142 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public SupportMenuItem setActionView(int i)
	{
		Context context = mMenu.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #174 <Method Context MenuBuilder.getContext()>
	//    3    7:astore_2        
		setActionView(LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (new LinearLayout(context))), false));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokestatic    #328 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   13:iload_1         
	//    8   14:new             #330 <Class LinearLayout>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #333 <Method void LinearLayout(Context)>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #337 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   14   26:invokevirtual   #340 <Method SupportMenuItem setActionView(View)>
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
	//    2    2:putfield        #111 <Field View mActionView>
		mActionProvider = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #146 <Field ActionProvider mActionProvider>
		if(view != null && view.getId() == -1 && mId > 0)
	//*   6   10:aload_1         
	//*   7   11:ifnull          37
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #345 <Method int View.getId()>
	//*  10   18:iconst_m1       
	//*  11   19:icmpne          37
	//*  12   22:aload_0         
	//*  13   23:getfield        #91  <Field int mId>
	//*  14   26:ifle            37
			view.setId(mId);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #91  <Field int mId>
	//   18   34:invokevirtual   #349 <Method void View.setId(int)>
		mMenu.onItemActionRequestChanged(this);
	//   19   37:aload_0         
	//   20   38:getfield        #89  <Field MenuBuilder mMenu>
	//   21   41:aload_0         
	//   22   42:invokevirtual   #107 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
		return ((SupportMenuItem) (this));
	//   23   45:aload_0         
	//   24   46:areturn         
	}

	public volatile MenuItem setActionView(int i)
	{
		return ((MenuItem) (setActionView(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #352 <Method SupportMenuItem setActionView(int)>
	//    3    5:areturn         
	}

	public volatile MenuItem setActionView(View view)
	{
		return ((MenuItem) (setActionView(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #340 <Method SupportMenuItem setActionView(View)>
	//    3    5:areturn         
	}

	public void setActionViewExpanded(boolean flag)
	{
		mIsActionViewExpanded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean mIsActionViewExpanded>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
	//    7   13:return          
	}

	public MenuItem setAlphabeticShortcut(char c)
	{
		if(mShortcutAlphabeticChar == c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field char mShortcutAlphabeticChar>
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
	//    8   12:invokestatic    #366 <Method char Character.toLowerCase(char)>
	//    9   15:putfield        #156 <Field char mShortcutAlphabeticChar>
			mMenu.onItemsChanged(false);
	//   10   18:aload_0         
	//   11   19:getfield        #89  <Field MenuBuilder mMenu>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public MenuItem setCallback(Runnable runnable)
	{
		mItemCallback = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #160 <Field Runnable mItemCallback>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mFlags>
	//    2    4:istore_3        
		int j = mFlags;
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field int mFlags>
	//    5    9:istore          4
		boolean flag1;
		if(flag)
	//*   6   11:iload_1         
	//*   7   12:ifeq            20
			flag1 = true;
	//    8   15:iconst_1        
	//    9   16:istore_2        
		else
	//*  10   17:goto            22
			flag1 = false;
	//   11   20:iconst_0        
	//   12   21:istore_2        
		mFlags = j & -2 | flag1;
	//   13   22:aload_0         
	//   14   23:iload           4
	//   15   25:bipush          -2
	//   16   27:iand            
	//   17   28:iload_2         
	//   18   29:ior             
	//   19   30:putfield        #83  <Field int mFlags>
		if(i != mFlags)
	//*  20   33:iload_3         
	//*  21   34:aload_0         
	//*  22   35:getfield        #83  <Field int mFlags>
	//*  23   38:icmpeq          49
			mMenu.onItemsChanged(false);
	//   24   41:aload_0         
	//   25   42:getfield        #89  <Field MenuBuilder mMenu>
	//   26   45:iconst_0        
	//   27   46:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   28   49:aload_0         
	//   29   50:areturn         
	}

	public MenuItem setChecked(boolean flag)
	{
		if((mFlags & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field int mFlags>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            19
		{
			mMenu.setExclusiveItemChecked(((MenuItem) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #89  <Field MenuBuilder mMenu>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #375 <Method void MenuBuilder.setExclusiveItemChecked(MenuItem)>
			return ((MenuItem) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
		} else
		{
			setCheckedInt(flag);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #378 <Method void setCheckedInt(boolean)>
			return ((MenuItem) (this));
	//   14   24:aload_0         
	//   15   25:areturn         
		}
	}

	void setCheckedInt(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mFlags>
	//    2    4:istore_3        
		int j = mFlags;
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field int mFlags>
	//    5    9:istore          4
		byte byte0;
		if(flag)
	//*   6   11:iload_1         
	//*   7   12:ifeq            20
			byte0 = 2;
	//    8   15:iconst_2        
	//    9   16:istore_2        
		else
	//*  10   17:goto            22
			byte0 = 0;
	//   11   20:iconst_0        
	//   12   21:istore_2        
		mFlags = j & -3 | byte0;
	//   13   22:aload_0         
	//   14   23:iload           4
	//   15   25:bipush          -3
	//   16   27:iand            
	//   17   28:iload_2         
	//   18   29:ior             
	//   19   30:putfield        #83  <Field int mFlags>
		if(i != mFlags)
	//*  20   33:iload_3         
	//*  21   34:aload_0         
	//*  22   35:getfield        #83  <Field int mFlags>
	//*  23   38:icmpeq          49
			mMenu.onItemsChanged(false);
	//   24   41:aload_0         
	//   25   42:getfield        #89  <Field MenuBuilder mMenu>
	//   26   45:iconst_0        
	//   27   46:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
	//   28   49:return          
	}

	public SupportMenuItem setContentDescription(CharSequence charsequence)
	{
		mContentDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #164 <Field CharSequence mContentDescription>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((SupportMenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public volatile MenuItem setContentDescription(CharSequence charsequence)
	{
		return ((MenuItem) (setContentDescription(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #383 <Method SupportMenuItem setContentDescription(CharSequence)>
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
	//    4    6:getfield        #83  <Field int mFlags>
	//    5    9:bipush          16
	//    6   11:ior             
	//    7   12:putfield        #83  <Field int mFlags>
		else
	//*   8   15:goto            29
			mFlags = mFlags & 0xffffffef;
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #83  <Field int mFlags>
	//   12   23:bipush          -17
	//   13   25:iand            
	//   14   26:putfield        #83  <Field int mFlags>
		mMenu.onItemsChanged(false);
	//   15   29:aload_0         
	//   16   30:getfield        #89  <Field MenuBuilder mMenu>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   19   37:aload_0         
	//   20   38:areturn         
	}

	public void setExclusiveCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mFlags>
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
		mFlags = i & -5 | byte0;
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:bipush          -5
	//   13   20:iand            
	//   14   21:iload_2         
	//   15   22:ior             
	//   16   23:putfield        #83  <Field int mFlags>
	//   17   26:return          
	}

	public MenuItem setIcon(int i)
	{
		mIconDrawable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #170 <Field Drawable mIconDrawable>
		mIconResId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #81  <Field int mIconResId>
		mMenu.onItemsChanged(false);
	//    6   10:aload_0         
	//    7   11:getfield        #89  <Field MenuBuilder mMenu>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		mIconResId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #81  <Field int mIconResId>
		mIconDrawable = drawable;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #170 <Field Drawable mIconDrawable>
		mMenu.onItemsChanged(false);
	//    6   10:aload_0         
	//    7   11:getfield        #89  <Field MenuBuilder mMenu>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		mIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #184 <Field Intent mIntent>
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
	//    4    6:getfield        #83  <Field int mFlags>
	//    5    9:bipush          32
	//    6   11:ior             
	//    7   12:putfield        #83  <Field int mFlags>
			return;
	//    8   15:return          
		} else
		{
			mFlags = mFlags & 0xffffffdf;
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #83  <Field int mFlags>
	//   12   21:bipush          -33
	//   13   23:iand            
	//   14   24:putfield        #83  <Field int mFlags>
			return;
	//   15   27:return          
		}
	}

	void setMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		mMenuInfo = contextmenuinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #191 <Field android.view.ContextMenu$ContextMenuInfo mMenuInfo>
	//    3    5:return          
	}

	public MenuItem setNumericShortcut(char c)
	{
		if(mShortcutNumericChar == c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field char mShortcutNumericChar>
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
	//    8   12:putfield        #194 <Field char mShortcutNumericChar>
			mMenu.onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:getfield        #89  <Field MenuBuilder mMenu>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
			return ((MenuItem) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
	//    0    0:new             #137 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #397 <String "This is not supported, use MenuItemCompat.setOnActionExpandListener()">
	//    3    7:invokespecial   #142 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		mClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #267 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setShortcut(char c, char c1)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #194 <Field char mShortcutNumericChar>
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #366 <Method char Character.toLowerCase(char)>
	//    6   10:putfield        #156 <Field char mShortcutAlphabeticChar>
		mMenu.onItemsChanged(false);
	//    7   13:aload_0         
	//    8   14:getfield        #89  <Field MenuBuilder mMenu>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public void setShowAsAction(int i)
	{
		switch(i & 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:iand            
		{
	//*   3    3:tableswitch     0 2: default 28
	//	               0 31
	//	               1 31
	//	               2 31
	//*   4   28:goto            34
	//*   5   31:goto            45
		default:
			throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
	//    6   34:new             #404 <Class IllegalArgumentException>
	//    7   37:dup             
	//    8   38:ldc2            #406 <String "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.">
	//    9   41:invokespecial   #407 <Method void IllegalArgumentException(String)>
	//   10   44:athrow          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			mShowAsAction = i;
	//   11   45:aload_0         
	//   12   46:iload_1         
	//   13   47:putfield        #85  <Field int mShowAsAction>
			break;
		}
		mMenu.onItemActionRequestChanged(this);
	//   14   50:aload_0         
	//   15   51:getfield        #89  <Field MenuBuilder mMenu>
	//   16   54:aload_0         
	//   17   55:invokevirtual   #107 <Method void MenuBuilder.onItemActionRequestChanged(MenuItemImpl)>
	//   18   58:return          
	}

	public SupportMenuItem setShowAsActionFlags(int i)
	{
		setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #410 <Method void setShowAsAction(int)>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setShowAsActionFlags(int i)
	{
		return ((MenuItem) (setShowAsActionFlags(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #412 <Method SupportMenuItem setShowAsActionFlags(int)>
	//    3    5:areturn         
	}

	public void setSubMenu(SubMenuBuilder submenubuilder)
	{
		mSubMenu = submenubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #231 <Field SubMenuBuilder mSubMenu>
		submenubuilder.setHeaderTitle(getTitle());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #258 <Method CharSequence getTitle()>
	//    6   10:invokevirtual   #420 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
	//    7   13:pop             
	//    8   14:return          
	}

	public SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
	{
		if(mActionProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field ActionProvider mActionProvider>
	//*   2    4:ifnull          14
			mActionProvider.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field ActionProvider mActionProvider>
	//    5   11:invokevirtual   #425 <Method void ActionProvider.reset()>
		mActionView = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #111 <Field View mActionView>
		mActionProvider = actionprovider;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #146 <Field ActionProvider mActionProvider>
		mMenu.onItemsChanged(true);
	//   12   24:aload_0         
	//   13   25:getfield        #89  <Field MenuBuilder mMenu>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		if(mActionProvider != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #146 <Field ActionProvider mActionProvider>
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
	//   20   40:getfield        #146 <Field ActionProvider mActionProvider>
	//   21   43:new             #8   <Class MenuItemImpl$1>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:invokespecial   #427 <Method void MenuItemImpl$1(MenuItemImpl)>
	//   25   51:invokevirtual   #431 <Method void ActionProvider.setVisibilityListener(android.support.v4.view.ActionProvider$VisibilityListener)>
		return ((SupportMenuItem) (this));
	//   26   54:aload_0         
	//   27   55:areturn         
	}

	public SupportMenuItem setSupportOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		mOnActionExpandListener = onactionexpandlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field android.view.MenuItem$OnActionExpandListener mOnActionExpandListener>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setTitle(int i)
	{
		return setTitle(((CharSequence) (mMenu.getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field MenuBuilder mMenu>
	//    3    5:invokevirtual   #174 <Method Context MenuBuilder.getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #438 <Method String Context.getString(int)>
	//    6   12:invokevirtual   #440 <Method MenuItem setTitle(CharSequence)>
	//    7   15:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field CharSequence mTitle>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		if(mSubMenu != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #231 <Field SubMenuBuilder mSubMenu>
	//*   9   17:ifnull          29
			mSubMenu.setHeaderTitle(charsequence);
	//   10   20:aload_0         
	//   11   21:getfield        #231 <Field SubMenuBuilder mSubMenu>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #420 <Method SubMenu SubMenuBuilder.setHeaderTitle(CharSequence)>
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
	//    2    2:putfield        #237 <Field CharSequence mTitleCondensed>
		if(charsequence == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			charsequence = mTitle;
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field CharSequence mTitle>
	//    7   13:astore_1        
		mMenu.onItemsChanged(false);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field MenuBuilder mMenu>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((MenuItem) (this));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public SupportMenuItem setTooltipText(CharSequence charsequence)
	{
		mTooltipText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #261 <Field CharSequence mTooltipText>
		mMenu.onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field MenuBuilder mMenu>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #358 <Method void MenuBuilder.onItemsChanged(boolean)>
		return ((SupportMenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public volatile MenuItem setTooltipText(CharSequence charsequence)
	{
		return ((MenuItem) (setTooltipText(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #444 <Method SupportMenuItem setTooltipText(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		if(setVisibleInt(flag))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #449 <Method boolean setVisibleInt(boolean)>
	//*   3    5:ifeq            16
			mMenu.onItemVisibleChanged(this);
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field MenuBuilder mMenu>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #452 <Method void MenuBuilder.onItemVisibleChanged(MenuItemImpl)>
		return ((MenuItem) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	boolean setVisibleInt(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mFlags>
	//    2    4:istore_3        
		int j = mFlags;
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field int mFlags>
	//    5    9:istore          4
		byte byte0;
		if(flag)
	//*   6   11:iload_1         
	//*   7   12:ifeq            20
			byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		else
	//*  10   17:goto            23
			byte0 = 8;
	//   11   20:bipush          8
	//   12   22:istore_2        
		mFlags = j & -9 | byte0;
	//   13   23:aload_0         
	//   14   24:iload           4
	//   15   26:bipush          -9
	//   16   28:iand            
	//   17   29:iload_2         
	//   18   30:ior             
	//   19   31:putfield        #83  <Field int mFlags>
		return i != mFlags;
	//   20   34:iload_3         
	//   21   35:aload_0         
	//   22   36:getfield        #83  <Field int mFlags>
	//   23   39:icmpeq          44
	//   24   42:iconst_1        
	//   25   43:ireturn         
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	public boolean shouldShowIcon()
	{
		return mMenu.getOptionalIconsVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #456 <Method boolean MenuBuilder.getOptionalIconsVisible()>
	//    3    7:ireturn         
	}

	boolean shouldShowShortcut()
	{
		return mMenu.isShortcutsVisible() && getShortcut() != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #460 <Method boolean MenuBuilder.isShortcutsVisible()>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokevirtual   #204 <Method char getShortcut()>
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
	//    1    1:getfield        #85  <Field int mShowAsAction>
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
	//*   1    1:getfield        #99  <Field CharSequence mTitle>
	//*   2    4:ifnull          17
			return mTitle.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field CharSequence mTitle>
	//    5   11:invokeinterface #247 <Method String CharSequence.toString()>
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
	private Drawable mIconDrawable;
	private int mIconResId;
	private final int mId;
	private Intent mIntent;
	private boolean mIsActionViewExpanded;
	private Runnable mItemCallback;
	MenuBuilder mMenu;
	private android.view.ContextMenu.ContextMenuInfo mMenuInfo;
	private android.view.MenuItem.OnActionExpandListener mOnActionExpandListener;
	private final int mOrdering;
	private char mShortcutAlphabeticChar;
	private char mShortcutNumericChar;
	private int mShowAsAction;
	private SubMenuBuilder mSubMenu;
	private CharSequence mTitle;
	private CharSequence mTitleCondensed;
	private CharSequence mTooltipText;
}
