// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class ActionMenuItem
	implements SupportMenuItem
{

	public ActionMenuItem(Context context, int i, int j, int k, int l, CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		mIconResId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #52  <Field int mIconResId>
		mFlags = 16;
	//    5    9:aload_0         
	//    6   10:bipush          16
	//    7   12:putfield        #54  <Field int mFlags>
		mContext = context;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #56  <Field Context mContext>
		mId = j;
	//   11   20:aload_0         
	//   12   21:iload_3         
	//   13   22:putfield        #58  <Field int mId>
		mGroup = i;
	//   14   25:aload_0         
	//   15   26:iload_2         
	//   16   27:putfield        #60  <Field int mGroup>
		mCategoryOrder = k;
	//   17   30:aload_0         
	//   18   31:iload           4
	//   19   33:putfield        #62  <Field int mCategoryOrder>
		mOrdering = l;
	//   20   36:aload_0         
	//   21   37:iload           5
	//   22   39:putfield        #64  <Field int mOrdering>
		mTitle = charsequence;
	//   23   42:aload_0         
	//   24   43:aload           6
	//   25   45:putfield        #66  <Field CharSequence mTitle>
	//   26   48:return          
	}

	public boolean collapseActionView()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean expandActionView()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ActionProvider getActionProvider()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public View getActionView()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public char getAlphabeticShortcut()
	{
		return mShortcutAlphabeticChar;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field char mShortcutAlphabeticChar>
	//    2    4:ireturn         
	}

	public CharSequence getContentDescription()
	{
		return mContentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field CharSequence mContentDescription>
	//    2    4:areturn         
	}

	public int getGroupId()
	{
		return mGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mGroup>
	//    2    4:ireturn         
	}

	public Drawable getIcon()
	{
		return mIconDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Drawable mIconDrawable>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Intent mIntent>
	//    2    4:areturn         
	}

	public int getItemId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int mId>
	//    2    4:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public char getNumericShortcut()
	{
		return mShortcutNumericChar;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field char mShortcutNumericChar>
	//    2    4:ireturn         
	}

	public int getOrder()
	{
		return mOrdering;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int mOrdering>
	//    2    4:ireturn         
	}

	public SubMenu getSubMenu()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public android.support.v4.view.ActionProvider getSupportActionProvider()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		if(mTitleCondensed != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field CharSequence mTitleCondensed>
	//*   2    4:ifnull          12
			return mTitleCondensed;
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field CharSequence mTitleCondensed>
	//    5   11:areturn         
		else
			return mTitle;
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field CharSequence mTitle>
	//    8   16:areturn         
	}

	public CharSequence getTooltipText()
	{
		return mTooltipText;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field CharSequence mTooltipText>
	//    2    4:areturn         
	}

	public boolean hasSubMenu()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean invoke()
	{
		if(mClickListener != null && mClickListener.onMenuItemClick(((MenuItem) (this))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #117 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #123 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//*   7   17:ifeq            22
			return true;
	//    8   20:iconst_1        
	//    9   21:ireturn         
		if(mIntent != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #95  <Field Intent mIntent>
	//*  12   26:ifnull          42
		{
			mContext.startActivity(mIntent);
	//   13   29:aload_0         
	//   14   30:getfield        #56  <Field Context mContext>
	//   15   33:aload_0         
	//   16   34:getfield        #95  <Field Intent mIntent>
	//   17   37:invokevirtual   #129 <Method void Context.startActivity(Intent)>
			return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		} else
		{
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		}
	}

	public boolean isActionViewExpanded()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCheckable()
	{
		return (mFlags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isChecked()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isEnabled()
	{
		return (mFlags & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean isVisible()
	{
		return (mFlags & 8) == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifne            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public MenuItem setActionProvider(ActionProvider actionprovider)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public SupportMenuItem setActionView(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public SupportMenuItem setActionView(View view)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public volatile MenuItem setActionView(int i)
	{
		return ((MenuItem) (setActionView(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #142 <Method SupportMenuItem setActionView(int)>
	//    3    5:areturn         
	}

	public volatile MenuItem setActionView(View view)
	{
		return ((MenuItem) (setActionView(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method SupportMenuItem setActionView(View)>
	//    3    5:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c)
	{
		mShortcutAlphabeticChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field char mShortcutAlphabeticChar>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:istore_3        
		boolean flag1;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			flag1 = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag1 = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		mFlags = i & -2 | flag1;
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:bipush          -2
	//   13   20:iand            
	//   14   21:iload_2         
	//   15   22:ior             
	//   16   23:putfield        #54  <Field int mFlags>
		return ((MenuItem) (this));
	//   17   26:aload_0         
	//   18   27:areturn         
	}

	public MenuItem setChecked(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
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
		mFlags = i & -3 | byte0;
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:bipush          -3
	//   13   20:iand            
	//   14   21:iload_2         
	//   15   22:ior             
	//   16   23:putfield        #54  <Field int mFlags>
		return ((MenuItem) (this));
	//   17   26:aload_0         
	//   18   27:areturn         
	}

	public SupportMenuItem setContentDescription(CharSequence charsequence)
	{
		mContentDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field CharSequence mContentDescription>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setContentDescription(CharSequence charsequence)
	{
		return ((MenuItem) (setContentDescription(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #155 <Method SupportMenuItem setContentDescription(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setEnabled(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:istore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            15
			byte0 = 16;
	//    5    9:bipush          16
	//    6   11:istore_2        
		else
	//*   7   12:goto            17
			byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		mFlags = i & 0xffffffef | byte0;
	//   10   17:aload_0         
	//   11   18:iload_3         
	//   12   19:bipush          -17
	//   13   21:iand            
	//   14   22:iload_2         
	//   15   23:ior             
	//   16   24:putfield        #54  <Field int mFlags>
		return ((MenuItem) (this));
	//   17   27:aload_0         
	//   18   28:areturn         
	}

	public ActionMenuItem setExclusiveCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
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
	//   16   23:putfield        #54  <Field int mFlags>
		return this;
	//   17   26:aload_0         
	//   18   27:areturn         
	}

	public MenuItem setIcon(int i)
	{
		mIconResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int mIconResId>
		mIconDrawable = ContextCompat.getDrawable(mContext, i);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field Context mContext>
	//    6   10:iload_1         
	//    7   11:invokestatic    #165 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    8   14:putfield        #91  <Field Drawable mIconDrawable>
		return ((MenuItem) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		mIconDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field Drawable mIconDrawable>
		mIconResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #52  <Field int mIconResId>
		return ((MenuItem) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		mIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field Intent mIntent>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setNumericShortcut(char c)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field char mShortcutNumericChar>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		mClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setShortcut(char c, char c1)
	{
		mShortcutNumericChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field char mShortcutNumericChar>
		mShortcutAlphabeticChar = c1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #81  <Field char mShortcutAlphabeticChar>
		return ((MenuItem) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public void setShowAsAction(int i)
	{
	//    0    0:return          
	}

	public SupportMenuItem setShowAsActionFlags(int i)
	{
		setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #180 <Method void setShowAsAction(int)>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setShowAsActionFlags(int i)
	{
		return ((MenuItem) (setShowAsActionFlags(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #182 <Method SupportMenuItem setShowAsActionFlags(int)>
	//    3    5:areturn         
	}

	public SupportMenuItem setSupportActionProvider(android.support.v4.view.ActionProvider actionprovider)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public SupportMenuItem setSupportOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		return ((SupportMenuItem) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public MenuItem setTitle(int i)
	{
		mTitle = ((CharSequence) (mContext.getResources().getString(i)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field Context mContext>
	//    3    5:invokevirtual   #191 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #197 <Method String Resources.getString(int)>
	//    6   12:putfield        #66  <Field CharSequence mTitle>
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field CharSequence mTitle>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setTitleCondensed(CharSequence charsequence)
	{
		mTitleCondensed = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field CharSequence mTitleCondensed>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportMenuItem setTooltipText(CharSequence charsequence)
	{
		mTooltipText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field CharSequence mTooltipText>
		return ((SupportMenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setTooltipText(CharSequence charsequence)
	{
		return ((MenuItem) (setTooltipText(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #201 <Method SupportMenuItem setTooltipText(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mFlags>
	//    2    4:istore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		mFlags = i & 8 | byte0;
	//   10   17:aload_0         
	//   11   18:iload_3         
	//   12   19:bipush          8
	//   13   21:iand            
	//   14   22:iload_2         
	//   15   23:ior             
	//   16   24:putfield        #54  <Field int mFlags>
		return ((MenuItem) (this));
	//   17   27:aload_0         
	//   18   28:areturn         
	}

	private static final int CHECKABLE = 1;
	private static final int CHECKED = 2;
	private static final int ENABLED = 16;
	private static final int EXCLUSIVE = 4;
	private static final int HIDDEN = 8;
	private static final int NO_ICON = 0;
	private final int mCategoryOrder;
	private android.view.MenuItem.OnMenuItemClickListener mClickListener;
	private CharSequence mContentDescription;
	private Context mContext;
	private int mFlags;
	private final int mGroup;
	private Drawable mIconDrawable;
	private int mIconResId;
	private final int mId;
	private Intent mIntent;
	private final int mOrdering;
	private char mShortcutAlphabeticChar;
	private char mShortcutNumericChar;
	private CharSequence mTitle;
	private CharSequence mTitleCondensed;
	private CharSequence mTooltipText;
}
