// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.c;
import android.support.v4.c.a.b;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.d;
import android.view.*;

public class ActionMenuItem
	implements b
{

	public ActionMenuItem(Context context, int i, int j, int k, int l, CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		mShortcutNumericModifiers = 4096;
	//    2    4:aload_0         
	//    3    5:sipush          4096
	//    4    8:putfield        #57  <Field int mShortcutNumericModifiers>
		mShortcutAlphabeticModifiers = 4096;
	//    5   11:aload_0         
	//    6   12:sipush          4096
	//    7   15:putfield        #59  <Field int mShortcutAlphabeticModifiers>
		mIconResId = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #61  <Field int mIconResId>
		mIconTintList = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #63  <Field ColorStateList mIconTintList>
		mIconTintMode = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #65  <Field android.graphics.PorterDuff$Mode mIconTintMode>
		mHasIconTint = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #67  <Field boolean mHasIconTint>
		mHasIconTintMode = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #69  <Field boolean mHasIconTintMode>
		mFlags = 16;
	//   23   43:aload_0         
	//   24   44:bipush          16
	//   25   46:putfield        #71  <Field int mFlags>
		mContext = context;
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:putfield        #73  <Field Context mContext>
		mId = j;
	//   29   54:aload_0         
	//   30   55:iload_3         
	//   31   56:putfield        #75  <Field int mId>
		mGroup = i;
	//   32   59:aload_0         
	//   33   60:iload_2         
	//   34   61:putfield        #77  <Field int mGroup>
		mCategoryOrder = k;
	//   35   64:aload_0         
	//   36   65:iload           4
	//   37   67:putfield        #79  <Field int mCategoryOrder>
		mOrdering = l;
	//   38   70:aload_0         
	//   39   71:iload           5
	//   40   73:putfield        #81  <Field int mOrdering>
		mTitle = charsequence;
	//   41   76:aload_0         
	//   42   77:aload           6
	//   43   79:putfield        #83  <Field CharSequence mTitle>
	//   44   82:return          
	}

	private void applyIconTint()
	{
		if(mIconDrawable != null && (mHasIconTint || mHasIconTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field Drawable mIconDrawable>
	//*   2    4:ifnull          79
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field boolean mHasIconTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #69  <Field boolean mHasIconTintMode>
	//*   8   18:ifeq            79
		{
			mIconDrawable = a.g(mIconDrawable);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field Drawable mIconDrawable>
	//   12   26:invokestatic    #93  <Method Drawable a.g(Drawable)>
	//   13   29:putfield        #87  <Field Drawable mIconDrawable>
			mIconDrawable = mIconDrawable.mutate();
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #87  <Field Drawable mIconDrawable>
	//   17   37:invokevirtual   #99  <Method Drawable Drawable.mutate()>
	//   18   40:putfield        #87  <Field Drawable mIconDrawable>
			if(mHasIconTint)
	//*  19   43:aload_0         
	//*  20   44:getfield        #67  <Field boolean mHasIconTint>
	//*  21   47:ifeq            61
				a.a(mIconDrawable, mIconTintList);
	//   22   50:aload_0         
	//   23   51:getfield        #87  <Field Drawable mIconDrawable>
	//   24   54:aload_0         
	//   25   55:getfield        #63  <Field ColorStateList mIconTintList>
	//   26   58:invokestatic    #103 <Method void a.a(Drawable, ColorStateList)>
			if(mHasIconTintMode)
	//*  27   61:aload_0         
	//*  28   62:getfield        #69  <Field boolean mHasIconTintMode>
	//*  29   65:ifeq            79
				a.a(mIconDrawable, mIconTintMode);
	//   30   68:aload_0         
	//   31   69:getfield        #87  <Field Drawable mIconDrawable>
	//   32   72:aload_0         
	//   33   73:getfield        #65  <Field android.graphics.PorterDuff$Mode mIconTintMode>
	//   34   76:invokestatic    #106 <Method void a.a(Drawable, android.graphics.PorterDuff$Mode)>
		}
	//   35   79:return          
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
	//    0    0:new             #113 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public View getActionView()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getAlphabeticModifiers()
	{
		return mShortcutAlphabeticModifiers;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mShortcutAlphabeticModifiers>
	//    2    4:ireturn         
	}

	public char getAlphabeticShortcut()
	{
		return mShortcutAlphabeticChar;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field char mShortcutAlphabeticChar>
	//    2    4:ireturn         
	}

	public CharSequence getContentDescription()
	{
		return mContentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field CharSequence mContentDescription>
	//    2    4:areturn         
	}

	public int getGroupId()
	{
		return mGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mGroup>
	//    2    4:ireturn         
	}

	public Drawable getIcon()
	{
		return mIconDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Drawable mIconDrawable>
	//    2    4:areturn         
	}

	public ColorStateList getIconTintList()
	{
		return mIconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ColorStateList mIconTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getIconTintMode()
	{
		return mIconTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field android.graphics.PorterDuff$Mode mIconTintMode>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field Intent mIntent>
	//    2    4:areturn         
	}

	public int getItemId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int mId>
	//    2    4:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getNumericModifiers()
	{
		return mShortcutNumericModifiers;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int mShortcutNumericModifiers>
	//    2    4:ireturn         
	}

	public char getNumericShortcut()
	{
		return mShortcutNumericChar;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field char mShortcutNumericChar>
	//    2    4:ireturn         
	}

	public int getOrder()
	{
		return mOrdering;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mOrdering>
	//    2    4:ireturn         
	}

	public SubMenu getSubMenu()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public d getSupportActionProvider()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		CharSequence charsequence = mTitleCondensed;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field CharSequence mTitleCondensed>
	//    2    4:astore_1        
		if(charsequence != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return charsequence;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mTitle;
	//    7   11:aload_0         
	//    8   12:getfield        #83  <Field CharSequence mTitle>
	//    9   15:areturn         
	}

	public CharSequence getTooltipText()
	{
		return mTooltipText;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field CharSequence mTooltipText>
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
		Object obj = ((Object) (mClickListener));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
	//    2    4:astore_1        
		if(obj != null && ((android.view.MenuItem.OnMenuItemClickListener) (obj)).onMenuItemClick(((MenuItem) (this))))
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:invokeinterface #165 <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		obj = ((Object) (mIntent));
	//   11   21:aload_0         
	//   12   22:getfield        #136 <Field Intent mIntent>
	//   13   25:astore_1        
		if(obj != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          40
		{
			mContext.startActivity(((Intent) (obj)));
	//   16   30:aload_0         
	//   17   31:getfield        #73  <Field Context mContext>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #171 <Method void Context.startActivity(Intent)>
			return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         
		} else
		{
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
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
	//    1    1:getfield        #71  <Field int mFlags>
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
	//    1    1:getfield        #71  <Field int mFlags>
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
	//    1    1:getfield        #71  <Field int mFlags>
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
	//    1    1:getfield        #71  <Field int mFlags>
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
	//    0    0:new             #113 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public b setActionView(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #113 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public b setActionView(View view)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #113 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public volatile MenuItem setActionView(int i)
	{
		return ((MenuItem) (setActionView(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #184 <Method b setActionView(int)>
	//    3    5:areturn         
	}

	public volatile MenuItem setActionView(View view)
	{
		return ((MenuItem) (setActionView(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #187 <Method b setActionView(View)>
	//    3    5:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c1)
	{
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #195 <Method char Character.toLowerCase(char)>
	//    3    5:putfield        #122 <Field char mShortcutAlphabeticChar>
		return ((MenuItem) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c1, int i)
	{
		mShortcutAlphabeticChar = Character.toLowerCase(c1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #195 <Method char Character.toLowerCase(char)>
	//    3    5:putfield        #122 <Field char mShortcutAlphabeticChar>
		mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i);
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:invokestatic    #202 <Method int KeyEvent.normalizeMetaState(int)>
	//    7   13:putfield        #59  <Field int mShortcutAlphabeticModifiers>
		return ((MenuItem) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		mFlags = flag | mFlags & -2;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #71  <Field int mFlags>
	//    4    6:bipush          -2
	//    5    8:iand            
	//    6    9:ior             
	//    7   10:putfield        #71  <Field int mFlags>
		return ((MenuItem) (this));
	//    8   13:aload_0         
	//    9   14:areturn         
	}

	public MenuItem setChecked(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mFlags>
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
	//   16   23:putfield        #71  <Field int mFlags>
		return ((MenuItem) (this));
	//   17   26:aload_0         
	//   18   27:areturn         
	}

	public b setContentDescription(CharSequence charsequence)
	{
		mContentDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field CharSequence mContentDescription>
		return ((b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setContentDescription(CharSequence charsequence)
	{
		return ((MenuItem) (setContentDescription(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method b setContentDescription(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setEnabled(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mFlags>
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
		mFlags = byte0 | i & 0xffffffef;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:iload_3         
	//   13   20:bipush          -17
	//   14   22:iand            
	//   15   23:ior             
	//   16   24:putfield        #71  <Field int mFlags>
		return ((MenuItem) (this));
	//   17   27:aload_0         
	//   18   28:areturn         
	}

	public ActionMenuItem setExclusiveCheckable(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mFlags>
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
	//   16   23:putfield        #71  <Field int mFlags>
		return this;
	//   17   26:aload_0         
	//   18   27:areturn         
	}

	public MenuItem setIcon(int i)
	{
		mIconResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int mIconResId>
		mIconDrawable = c.a(mContext, i);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #73  <Field Context mContext>
	//    6   10:iload_1         
	//    7   11:invokestatic    #219 <Method Drawable c.a(Context, int)>
	//    8   14:putfield        #87  <Field Drawable mIconDrawable>
		applyIconTint();
	//    9   17:aload_0         
	//   10   18:invokespecial   #221 <Method void applyIconTint()>
		return ((MenuItem) (this));
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		mIconDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field Drawable mIconDrawable>
		mIconResId = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #61  <Field int mIconResId>
		applyIconTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #221 <Method void applyIconTint()>
		return ((MenuItem) (this));
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public MenuItem setIconTintList(ColorStateList colorstatelist)
	{
		mIconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field ColorStateList mIconTintList>
		mHasIconTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #67  <Field boolean mHasIconTint>
		applyIconTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #221 <Method void applyIconTint()>
		return ((MenuItem) (this));
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mIconTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field android.graphics.PorterDuff$Mode mIconTintMode>
		mHasIconTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #69  <Field boolean mHasIconTintMode>
		applyIconTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #221 <Method void applyIconTint()>
		return ((MenuItem) (this));
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		mIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field Intent mIntent>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setNumericShortcut(char c1)
	{
		mShortcutNumericChar = c1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #143 <Field char mShortcutNumericChar>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setNumericShortcut(char c1, int i)
	{
		mShortcutNumericChar = c1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #143 <Field char mShortcutNumericChar>
		mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #202 <Method int KeyEvent.normalizeMetaState(int)>
	//    6   10:putfield        #57  <Field int mShortcutNumericModifiers>
		return ((MenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #113 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		mClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field android.view.MenuItem$OnMenuItemClickListener mClickListener>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setShortcut(char c1, char c2)
	{
		mShortcutNumericChar = c1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #143 <Field char mShortcutNumericChar>
		mShortcutAlphabeticChar = Character.toLowerCase(c2);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #195 <Method char Character.toLowerCase(char)>
	//    6   10:putfield        #122 <Field char mShortcutAlphabeticChar>
		return ((MenuItem) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public MenuItem setShortcut(char c1, char c2, int i, int j)
	{
		mShortcutNumericChar = c1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #143 <Field char mShortcutNumericChar>
		mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:invokestatic    #202 <Method int KeyEvent.normalizeMetaState(int)>
	//    6   10:putfield        #57  <Field int mShortcutNumericModifiers>
		mShortcutAlphabeticChar = Character.toLowerCase(c2);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokestatic    #195 <Method char Character.toLowerCase(char)>
	//   10   18:putfield        #122 <Field char mShortcutAlphabeticChar>
		mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(j);
	//   11   21:aload_0         
	//   12   22:iload           4
	//   13   24:invokestatic    #202 <Method int KeyEvent.normalizeMetaState(int)>
	//   14   27:putfield        #59  <Field int mShortcutAlphabeticModifiers>
		return ((MenuItem) (this));
	//   15   30:aload_0         
	//   16   31:areturn         
	}

	public void setShowAsAction(int i)
	{
	//    0    0:return          
	}

	public b setShowAsActionFlags(int i)
	{
		setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #241 <Method void setShowAsAction(int)>
		return ((b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setShowAsActionFlags(int i)
	{
		return ((MenuItem) (setShowAsActionFlags(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #243 <Method b setShowAsActionFlags(int)>
	//    3    5:areturn         
	}

	public b setSupportActionProvider(d d)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #113 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public MenuItem setTitle(int i)
	{
		mTitle = ((CharSequence) (mContext.getResources().getString(i)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field Context mContext>
	//    3    5:invokevirtual   #250 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #256 <Method String Resources.getString(int)>
	//    6   12:putfield        #83  <Field CharSequence mTitle>
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field CharSequence mTitle>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MenuItem setTitleCondensed(CharSequence charsequence)
	{
		mTitleCondensed = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field CharSequence mTitleCondensed>
		return ((MenuItem) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public b setTooltipText(CharSequence charsequence)
	{
		mTooltipText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field CharSequence mTooltipText>
		return ((b) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile MenuItem setTooltipText(CharSequence charsequence)
	{
		return ((MenuItem) (setTooltipText(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #260 <Method b setTooltipText(CharSequence)>
	//    3    5:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		int i = mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mFlags>
	//    2    4:istore_3        
		byte byte0 = 8;
	//    3    5:bipush          8
	//    4    7:istore_2        
		if(flag)
	//*   5    8:iload_1         
	//*   6    9:ifeq            14
			byte0 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		mFlags = i & 8 | byte0;
	//    9   14:aload_0         
	//   10   15:iload_3         
	//   11   16:bipush          8
	//   12   18:iand            
	//   13   19:iload_2         
	//   14   20:ior             
	//   15   21:putfield        #71  <Field int mFlags>
		return ((MenuItem) (this));
	//   16   24:aload_0         
	//   17   25:areturn         
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
	private boolean mHasIconTint;
	private boolean mHasIconTintMode;
	private Drawable mIconDrawable;
	private int mIconResId;
	private ColorStateList mIconTintList;
	private android.graphics.PorterDuff.Mode mIconTintMode;
	private final int mId;
	private Intent mIntent;
	private final int mOrdering;
	private char mShortcutAlphabeticChar;
	private int mShortcutAlphabeticModifiers;
	private char mShortcutNumericChar;
	private int mShortcutNumericModifiers;
	private CharSequence mTitle;
	private CharSequence mTitleCondensed;
	private CharSequence mTooltipText;
}
