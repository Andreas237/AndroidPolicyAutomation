// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.view:
//			SupportMenuInflater

private class SupportMenuInflater$MenuState
{

	private char getShortcut(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return '\0';
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return s.charAt(0);
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #84  <Method char String.charAt(int)>
	//    7   11:ireturn         
	}

	private Object newInstance(String s, Class aclass[], Object aobj[])
	{
		try
		{
			aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//    3    7:invokevirtual   #98  <Method ClassLoader Context.getClassLoader()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #104 <Method Class ClassLoader.loadClass(String)>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #110 <Method Constructor Class.getConstructor(Class[])>
	//    8   18:astore_2        
			((Constructor) (aclass)).setAccessible(true);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #116 <Method void Constructor.setAccessible(boolean)>
			aclass = ((Class []) (((Constructor) (aclass)).newInstance(aobj)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #119 <Method Object Constructor.newInstance(Object[])>
	//   15   29:astore_2        
		}
	//*  16   30:aload_2         
	//*  17   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Class aclass[])
	//*  18   32:astore_2        
		{
			Log.w("SupportMenuInflater", (new StringBuilder()).append("Cannot instantiate class: ").append(s).toString(), ((Throwable) (aclass)));
	//   19   33:ldc1            #121 <String "SupportMenuInflater">
	//   20   35:new             #123 <Class StringBuilder>
	//   21   38:dup             
	//   22   39:invokespecial   #124 <Method void StringBuilder()>
	//   23   42:ldc1            #126 <String "Cannot instantiate class: ">
	//   24   44:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   28   54:aload_2         
	//   29   55:invokestatic    #140 <Method int Log.w(String, String, Throwable)>
	//   30   58:pop             
			return ((Object) (null));
	//   31   59:aconst_null     
	//   32   60:areturn         
		}
		return ((Object) (aclass));
	}

	private void setItem(MenuItem menuitem)
	{
		Object obj = ((Object) (menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #146 <Field boolean itemChecked>
	//    3    5:invokeinterface #152 <Method MenuItem MenuItem.setChecked(boolean)>
	//    4   10:aload_0         
	//    5   11:getfield        #154 <Field boolean itemVisible>
	//    6   14:invokeinterface #157 <Method MenuItem MenuItem.setVisible(boolean)>
	//    7   19:aload_0         
	//    8   20:getfield        #159 <Field boolean itemEnabled>
	//    9   23:invokeinterface #162 <Method MenuItem MenuItem.setEnabled(boolean)>
	//   10   28:astore          4
		boolean flag1;
		if(itemCheckable >= 1)
	//*  11   30:aload_0         
	//*  12   31:getfield        #164 <Field int itemCheckable>
	//*  13   34:iconst_1        
	//*  14   35:icmplt          114
			flag1 = true;
	//   15   38:iconst_1        
	//   16   39:istore_3        
		else
	//*  17   40:aload           4
	//*  18   42:iload_3         
	//*  19   43:invokeinterface #167 <Method MenuItem MenuItem.setCheckable(boolean)>
	//*  20   48:aload_0         
	//*  21   49:getfield        #169 <Field CharSequence itemTitleCondensed>
	//*  22   52:invokeinterface #173 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
	//*  23   57:aload_0         
	//*  24   58:getfield        #175 <Field int itemIconResId>
	//*  25   61:invokeinterface #179 <Method MenuItem MenuItem.setIcon(int)>
	//*  26   66:pop             
	//*  27   67:aload_0         
	//*  28   68:getfield        #181 <Field int itemShowAsAction>
	//*  29   71:iflt            84
	//*  30   74:aload_1         
	//*  31   75:aload_0         
	//*  32   76:getfield        #181 <Field int itemShowAsAction>
	//*  33   79:invokeinterface #185 <Method void MenuItem.setShowAsAction(int)>
	//*  34   84:aload_0         
	//*  35   85:getfield        #187 <Field String itemListenerMethodName>
	//*  36   88:ifnull          144
	//*  37   91:aload_0         
	//*  38   92:getfield        #63  <Field SupportMenuInflater this$0>
	//*  39   95:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//*  40   98:invokevirtual   #191 <Method boolean Context.isRestricted()>
	//*  41  101:ifeq            119
	//*  42  104:new             #193 <Class IllegalStateException>
	//*  43  107:dup             
	//*  44  108:ldc1            #195 <String "The android:onClick attribute cannot be used within a restricted context">
	//*  45  110:invokespecial   #198 <Method void IllegalStateException(String)>
	//*  46  113:athrow          
			flag1 = false;
	//   47  114:iconst_0        
	//   48  115:istore_3        
		((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId);
		if(itemShowAsAction >= 0)
			menuitem.setShowAsAction(itemShowAsAction);
		if(itemListenerMethodName != null)
		{
			if(mContext.isRestricted())
				throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
	//*  49  116:goto            40
			menuitem.setOnMenuItemClickListener(((android.view.er) (new MenuItemClickListener(getRealOwner(), itemListenerMethodName))));
	//   50  119:aload_1         
	//   51  120:new             #200 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
	//   52  123:dup             
	//   53  124:aload_0         
	//   54  125:getfield        #63  <Field SupportMenuInflater this$0>
	//   55  128:invokevirtual   #204 <Method Object SupportMenuInflater.getRealOwner()>
	//   56  131:aload_0         
	//   57  132:getfield        #187 <Field String itemListenerMethodName>
	//   58  135:invokespecial   #207 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
	//   59  138:invokeinterface #211 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   60  143:pop             
		}
		if(menuitem instanceof MenuItemImpl)
	//*  61  144:aload_1         
	//*  62  145:instanceof      #213 <Class MenuItemImpl>
	//*  63  148:ifeq            328
			obj = ((Object) ((MenuItemImpl)menuitem));
	//   64  151:aload_1         
	//   65  152:checkcast       #213 <Class MenuItemImpl>
	//   66  155:astore          4
		boolean flag;
		if(itemCheckable >= 2)
	//*  67  157:aload_0         
	//*  68  158:getfield        #164 <Field int itemCheckable>
	//*  69  161:iconst_2        
	//*  70  162:icmplt          180
			if(menuitem instanceof MenuItemImpl)
	//*  71  165:aload_1         
	//*  72  166:instanceof      #213 <Class MenuItemImpl>
	//*  73  169:ifeq            331
				((MenuItemImpl)menuitem).setExclusiveCheckable(true);
	//   74  172:aload_1         
	//   75  173:checkcast       #213 <Class MenuItemImpl>
	//   76  176:iconst_1        
	//   77  177:invokevirtual   #216 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			else
	//*  78  180:iconst_0        
	//*  79  181:istore_2        
	//*  80  182:aload_0         
	//*  81  183:getfield        #218 <Field String itemActionViewClassName>
	//*  82  186:ifnull          219
	//*  83  189:aload_1         
	//*  84  190:aload_0         
	//*  85  191:aload_0         
	//*  86  192:getfield        #218 <Field String itemActionViewClassName>
	//*  87  195:getstatic       #222 <Field Class[] SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//*  88  198:aload_0         
	//*  89  199:getfield        #63  <Field SupportMenuInflater this$0>
	//*  90  202:getfield        #226 <Field Object[] SupportMenuInflater.mActionViewConstructorArguments>
	//*  91  205:invokespecial   #228 <Method Object newInstance(String, Class[], Object[])>
	//*  92  208:checkcast       #230 <Class View>
	//*  93  211:invokeinterface #234 <Method MenuItem MenuItem.setActionView(View)>
	//*  94  216:pop             
	//*  95  217:iconst_1        
	//*  96  218:istore_2        
	//*  97  219:aload_0         
	//*  98  220:getfield        #236 <Field int itemActionViewLayout>
	//*  99  223:ifle            241
	//* 100  226:iload_2         
	//* 101  227:ifne            349
	//* 102  230:aload_1         
	//* 103  231:aload_0         
	//* 104  232:getfield        #236 <Field int itemActionViewLayout>
	//* 105  235:invokeinterface #238 <Method MenuItem MenuItem.setActionView(int)>
	//* 106  240:pop             
	//* 107  241:aload_0         
	//* 108  242:getfield        #240 <Field ActionProvider itemActionProvider>
	//* 109  245:ifnull          257
	//* 110  248:aload_1         
	//* 111  249:aload_0         
	//* 112  250:getfield        #240 <Field ActionProvider itemActionProvider>
	//* 113  253:invokestatic    #246 <Method MenuItem MenuItemCompat.setActionProvider(MenuItem, ActionProvider)>
	//* 114  256:pop             
	//* 115  257:aload_1         
	//* 116  258:aload_0         
	//* 117  259:getfield        #248 <Field CharSequence itemContentDescription>
	//* 118  262:invokestatic    #252 <Method void MenuItemCompat.setContentDescription(MenuItem, CharSequence)>
	//* 119  265:aload_1         
	//* 120  266:aload_0         
	//* 121  267:getfield        #254 <Field CharSequence itemTooltipText>
	//* 122  270:invokestatic    #257 <Method void MenuItemCompat.setTooltipText(MenuItem, CharSequence)>
	//* 123  273:aload_1         
	//* 124  274:aload_0         
	//* 125  275:getfield        #259 <Field char itemAlphabeticShortcut>
	//* 126  278:aload_0         
	//* 127  279:getfield        #261 <Field int itemAlphabeticModifiers>
	//* 128  282:invokestatic    #265 <Method void MenuItemCompat.setAlphabeticShortcut(MenuItem, char, int)>
	//* 129  285:aload_1         
	//* 130  286:aload_0         
	//* 131  287:getfield        #267 <Field char itemNumericShortcut>
	//* 132  290:aload_0         
	//* 133  291:getfield        #269 <Field int itemNumericModifiers>
	//* 134  294:invokestatic    #272 <Method void MenuItemCompat.setNumericShortcut(MenuItem, char, int)>
	//* 135  297:aload_0         
	//* 136  298:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 137  301:ifnull          312
	//* 138  304:aload_1         
	//* 139  305:aload_0         
	//* 140  306:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 141  309:invokestatic    #276 <Method void MenuItemCompat.setIconTintMode(MenuItem, android.graphics.PorterDuff$Mode)>
	//* 142  312:aload_0         
	//* 143  313:getfield        #68  <Field ColorStateList itemIconTintList>
	//* 144  316:ifnull          327
	//* 145  319:aload_1         
	//* 146  320:aload_0         
	//* 147  321:getfield        #68  <Field ColorStateList itemIconTintList>
	//* 148  324:invokestatic    #280 <Method void MenuItemCompat.setIconTintList(MenuItem, ColorStateList)>
	//* 149  327:return          
	//* 150  328:goto            157
			if(menuitem instanceof MenuItemWrapperICS)
	//* 151  331:aload_1         
	//* 152  332:instanceof      #282 <Class MenuItemWrapperICS>
	//* 153  335:ifeq            180
				((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
	//  154  338:aload_1         
	//  155  339:checkcast       #282 <Class MenuItemWrapperICS>
	//  156  342:iconst_1        
	//  157  343:invokevirtual   #283 <Method void MenuItemWrapperICS.setExclusiveCheckable(boolean)>
		flag = false;
		if(itemActionViewClassName != null)
		{
			menuitem.setActionView((View)newInstance(itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
			flag = true;
		}
		if(itemActionViewLayout > 0)
			if(!flag)
				menuitem.setActionView(itemActionViewLayout);
			else
	//* 158  346:goto            180
				Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
	//  159  349:ldc1            #121 <String "SupportMenuInflater">
	//  160  351:ldc2            #285 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
	//  161  354:invokestatic    #288 <Method int Log.w(String, String)>
	//  162  357:pop             
		if(itemActionProvider != null)
			MenuItemCompat.setActionProvider(menuitem, itemActionProvider);
		MenuItemCompat.setContentDescription(menuitem, itemContentDescription);
		MenuItemCompat.setTooltipText(menuitem, itemTooltipText);
		MenuItemCompat.setAlphabeticShortcut(menuitem, itemAlphabeticShortcut, itemAlphabeticModifiers);
		MenuItemCompat.setNumericShortcut(menuitem, itemNumericShortcut, itemNumericModifiers);
		if(itemIconTintMode != null)
			MenuItemCompat.setIconTintMode(menuitem, itemIconTintMode);
		if(itemIconTintList != null)
			MenuItemCompat.setIconTintList(menuitem, itemIconTintList);
	//* 163  358:goto            241
	}

	public void addItem()
	{
		itemAdded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #291 <Field boolean itemAdded>
		setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #72  <Field Menu menu>
	//    6   10:aload_0         
	//    7   11:getfield        #293 <Field int groupId>
	//    8   14:aload_0         
	//    9   15:getfield        #295 <Field int itemId>
	//   10   18:aload_0         
	//   11   19:getfield        #297 <Field int itemCategoryOrder>
	//   12   22:aload_0         
	//   13   23:getfield        #299 <Field CharSequence itemTitle>
	//   14   26:invokeinterface #305 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//   15   31:invokespecial   #307 <Method void setItem(MenuItem)>
	//   16   34:return          
	}

	public SubMenu addSubMenuItem()
	{
		itemAdded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #291 <Field boolean itemAdded>
		SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Menu menu>
	//    5    9:aload_0         
	//    6   10:getfield        #293 <Field int groupId>
	//    7   13:aload_0         
	//    8   14:getfield        #295 <Field int itemId>
	//    9   17:aload_0         
	//   10   18:getfield        #297 <Field int itemCategoryOrder>
	//   11   21:aload_0         
	//   12   22:getfield        #299 <Field CharSequence itemTitle>
	//   13   25:invokeinterface #313 <Method SubMenu Menu.addSubMenu(int, int, int, CharSequence)>
	//   14   30:astore_1        
		setItem(submenu.getItem());
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokeinterface #319 <Method MenuItem SubMenu.getItem()>
	//   18   38:invokespecial   #307 <Method void setItem(MenuItem)>
		return submenu;
	//   19   41:aload_1         
	//   20   42:areturn         
	}

	public boolean hasAddedItem()
	{
		return itemAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field boolean itemAdded>
	//    2    4:ireturn         
	}

	public void readGroup(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuGroup)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//    3    7:aload_1         
	//    4    8:getstatic       #328 <Field int[] android.support.v7.appcompat.R$styleable.MenuGroup>
	//    5   11:invokevirtual   #332 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    6   14:astore_1        
		groupId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuGroup_android_id, 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getstatic       #335 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_id>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//   12   24:putfield        #293 <Field int groupId>
		groupCategory = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_menuCategory, 0);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getstatic       #344 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_menuCategory>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   18   36:putfield        #349 <Field int groupCategory>
		groupOrder = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_orderInCategory, 0);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getstatic       #352 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_orderInCategory>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   24   48:putfield        #354 <Field int groupOrder>
		groupCheckable = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_checkableBehavior, 0);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:getstatic       #357 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_checkableBehavior>
	//   28   56:iconst_0        
	//   29   57:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   30   60:putfield        #359 <Field int groupCheckable>
		groupVisible = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_visible, true);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getstatic       #362 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_visible>
	//   34   68:iconst_1        
	//   35   69:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   36   72:putfield        #368 <Field boolean groupVisible>
		groupEnabled = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_enabled, true);
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:getstatic       #371 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_enabled>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   42   84:putfield        #373 <Field boolean groupEnabled>
		((TypedArray) (attributeset)).recycle();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #376 <Method void TypedArray.recycle()>
	//   45   91:return          
	}

	public void readItem(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuItem)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//    3    7:aload_1         
	//    4    8:getstatic       #380 <Field int[] android.support.v7.appcompat.R$styleable.MenuItem>
	//    5   11:invokevirtual   #332 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    6   14:astore_1        
		itemId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_android_id, 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getstatic       #383 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_id>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//   12   24:putfield        #295 <Field int itemId>
		itemCategoryOrder = 0xffff0000 & ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_android_menuCategory, groupCategory) | 0xffff & ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_android_orderInCategory, groupOrder);
	//   13   27:aload_0         
	//   14   28:ldc2            #384 <Int 0xffff0000>
	//   15   31:aload_1         
	//   16   32:getstatic       #387 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_menuCategory>
	//   17   35:aload_0         
	//   18   36:getfield        #349 <Field int groupCategory>
	//   19   39:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   20   42:iand            
	//   21   43:ldc2            #388 <Int 65535>
	//   22   46:aload_1         
	//   23   47:getstatic       #391 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_orderInCategory>
	//   24   50:aload_0         
	//   25   51:getfield        #354 <Field int groupOrder>
	//   26   54:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   27   57:iand            
	//   28   58:ior             
	//   29   59:putfield        #297 <Field int itemCategoryOrder>
		itemTitle = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_android_title);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:getstatic       #394 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_title>
	//   33   67:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//   34   70:putfield        #299 <Field CharSequence itemTitle>
		itemTitleCondensed = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_android_titleCondensed);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:getstatic       #401 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_titleCondensed>
	//   38   78:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//   39   81:putfield        #169 <Field CharSequence itemTitleCondensed>
		itemIconResId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_android_icon, 0);
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:getstatic       #404 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_icon>
	//   43   89:iconst_0        
	//   44   90:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//   45   93:putfield        #175 <Field int itemIconResId>
		itemAlphabeticShortcut = getShortcut(((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_alphabeticShortcut));
	//   46   96:aload_0         
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:getstatic       #407 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_alphabeticShortcut>
	//   50  102:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//   51  105:invokespecial   #413 <Method char getShortcut(String)>
	//   52  108:putfield        #259 <Field char itemAlphabeticShortcut>
		itemAlphabeticModifiers = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_alphabeticModifiers, 4096);
	//   53  111:aload_0         
	//   54  112:aload_1         
	//   55  113:getstatic       #416 <Field int android.support.v7.appcompat.R$styleable.MenuItem_alphabeticModifiers>
	//   56  116:sipush          4096
	//   57  119:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   58  122:putfield        #261 <Field int itemAlphabeticModifiers>
		itemNumericShortcut = getShortcut(((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_numericShortcut));
	//   59  125:aload_0         
	//   60  126:aload_0         
	//   61  127:aload_1         
	//   62  128:getstatic       #419 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_numericShortcut>
	//   63  131:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//   64  134:invokespecial   #413 <Method char getShortcut(String)>
	//   65  137:putfield        #267 <Field char itemNumericShortcut>
		itemNumericModifiers = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_numericModifiers, 4096);
	//   66  140:aload_0         
	//   67  141:aload_1         
	//   68  142:getstatic       #422 <Field int android.support.v7.appcompat.R$styleable.MenuItem_numericModifiers>
	//   69  145:sipush          4096
	//   70  148:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   71  151:putfield        #269 <Field int itemNumericModifiers>
		int i;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_android_checkable))
	//*  72  154:aload_1         
	//*  73  155:getstatic       #425 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checkable>
	//*  74  158:invokevirtual   #429 <Method boolean TypedArray.hasValue(int)>
	//*  75  161:ifeq            420
		{
			if(((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_checkable, false))
	//*  76  164:aload_1         
	//*  77  165:getstatic       #425 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checkable>
	//*  78  168:iconst_0        
	//*  79  169:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  80  172:ifeq            415
				i = 1;
	//   81  175:iconst_1        
	//   82  176:istore_2        
			else
	//*  83  177:aload_0         
	//*  84  178:iload_2         
	//*  85  179:putfield        #164 <Field int itemCheckable>
	//*  86  182:aload_0         
	//*  87  183:aload_1         
	//*  88  184:getstatic       #432 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checked>
	//*  89  187:iconst_0        
	//*  90  188:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  91  191:putfield        #146 <Field boolean itemChecked>
	//*  92  194:aload_0         
	//*  93  195:aload_1         
	//*  94  196:getstatic       #435 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_visible>
	//*  95  199:aload_0         
	//*  96  200:getfield        #368 <Field boolean groupVisible>
	//*  97  203:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  98  206:putfield        #154 <Field boolean itemVisible>
	//*  99  209:aload_0         
	//* 100  210:aload_1         
	//* 101  211:getstatic       #438 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_enabled>
	//* 102  214:aload_0         
	//* 103  215:getfield        #373 <Field boolean groupEnabled>
	//* 104  218:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 105  221:putfield        #159 <Field boolean itemEnabled>
	//* 106  224:aload_0         
	//* 107  225:aload_1         
	//* 108  226:getstatic       #441 <Field int android.support.v7.appcompat.R$styleable.MenuItem_showAsAction>
	//* 109  229:iconst_m1       
	//* 110  230:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//* 111  233:putfield        #181 <Field int itemShowAsAction>
	//* 112  236:aload_0         
	//* 113  237:aload_1         
	//* 114  238:getstatic       #444 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_onClick>
	//* 115  241:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//* 116  244:putfield        #187 <Field String itemListenerMethodName>
	//* 117  247:aload_0         
	//* 118  248:aload_1         
	//* 119  249:getstatic       #447 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionLayout>
	//* 120  252:iconst_0        
	//* 121  253:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//* 122  256:putfield        #236 <Field int itemActionViewLayout>
	//* 123  259:aload_0         
	//* 124  260:aload_1         
	//* 125  261:getstatic       #450 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionViewClass>
	//* 126  264:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//* 127  267:putfield        #218 <Field String itemActionViewClassName>
	//* 128  270:aload_0         
	//* 129  271:aload_1         
	//* 130  272:getstatic       #453 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionProviderClass>
	//* 131  275:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//* 132  278:putfield        #455 <Field String itemActionProviderClassName>
	//* 133  281:aload_0         
	//* 134  282:getfield        #455 <Field String itemActionProviderClassName>
	//* 135  285:ifnull          431
	//* 136  288:iconst_1        
	//* 137  289:istore_2        
	//* 138  290:iload_2         
	//* 139  291:ifeq            436
	//* 140  294:aload_0         
	//* 141  295:getfield        #236 <Field int itemActionViewLayout>
	//* 142  298:ifne            436
	//* 143  301:aload_0         
	//* 144  302:getfield        #218 <Field String itemActionViewClassName>
	//* 145  305:ifnonnull       436
	//* 146  308:aload_0         
	//* 147  309:aload_0         
	//* 148  310:aload_0         
	//* 149  311:getfield        #455 <Field String itemActionProviderClassName>
	//* 150  314:getstatic       #458 <Field Class[] SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
	//* 151  317:aload_0         
	//* 152  318:getfield        #63  <Field SupportMenuInflater this$0>
	//* 153  321:getfield        #461 <Field Object[] SupportMenuInflater.mActionProviderConstructorArguments>
	//* 154  324:invokespecial   #228 <Method Object newInstance(String, Class[], Object[])>
	//* 155  327:checkcast       #463 <Class ActionProvider>
	//* 156  330:putfield        #240 <Field ActionProvider itemActionProvider>
	//* 157  333:aload_0         
	//* 158  334:aload_1         
	//* 159  335:getstatic       #466 <Field int android.support.v7.appcompat.R$styleable.MenuItem_contentDescription>
	//* 160  338:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//* 161  341:putfield        #248 <Field CharSequence itemContentDescription>
	//* 162  344:aload_0         
	//* 163  345:aload_1         
	//* 164  346:getstatic       #469 <Field int android.support.v7.appcompat.R$styleable.MenuItem_tooltipText>
	//* 165  349:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//* 166  352:putfield        #254 <Field CharSequence itemTooltipText>
	//* 167  355:aload_1         
	//* 168  356:getstatic       #472 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTintMode>
	//* 169  359:invokevirtual   #429 <Method boolean TypedArray.hasValue(int)>
	//* 170  362:ifeq            457
	//* 171  365:aload_0         
	//* 172  366:aload_1         
	//* 173  367:getstatic       #472 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTintMode>
	//* 174  370:iconst_m1       
	//* 175  371:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//* 176  374:aload_0         
	//* 177  375:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 178  378:invokestatic    #478 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//* 179  381:putfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 180  384:aload_1         
	//* 181  385:getstatic       #481 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTint>
	//* 182  388:invokevirtual   #429 <Method boolean TypedArray.hasValue(int)>
	//* 183  391:ifeq            465
	//* 184  394:aload_0         
	//* 185  395:aload_1         
	//* 186  396:getstatic       #481 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTint>
	//* 187  399:invokevirtual   #485 <Method ColorStateList TypedArray.getColorStateList(int)>
	//* 188  402:putfield        #68  <Field ColorStateList itemIconTintList>
	//* 189  405:aload_1         
	//* 190  406:invokevirtual   #376 <Method void TypedArray.recycle()>
	//* 191  409:aload_0         
	//* 192  410:iconst_0        
	//* 193  411:putfield        #291 <Field boolean itemAdded>
	//* 194  414:return          
				i = 0;
	//  195  415:iconst_0        
	//  196  416:istore_2        
			itemCheckable = i;
		} else
	//* 197  417:goto            177
		{
			itemCheckable = groupCheckable;
	//  198  420:aload_0         
	//  199  421:aload_0         
	//  200  422:getfield        #359 <Field int groupCheckable>
	//  201  425:putfield        #164 <Field int itemCheckable>
		}
		itemChecked = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_checked, false);
		itemVisible = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_visible, groupVisible);
		itemEnabled = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_enabled, groupEnabled);
		itemShowAsAction = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_showAsAction, -1);
		itemListenerMethodName = ((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_onClick);
		itemActionViewLayout = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_actionLayout, 0);
		itemActionViewClassName = ((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_actionViewClass);
		itemActionProviderClassName = ((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_actionProviderClass);
		if(itemActionProviderClassName != null)
			i = 1;
		else
	//* 202  428:goto            182
			i = 0;
	//  203  431:iconst_0        
	//  204  432:istore_2        
		if(i != 0 && itemActionViewLayout == 0 && itemActionViewClassName == null)
		{
			itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, mActionProviderConstructorArguments);
		} else
	//* 205  433:goto            290
		{
			if(i != 0)
	//* 206  436:iload_2         
	//* 207  437:ifeq            449
				Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
	//  208  440:ldc1            #121 <String "SupportMenuInflater">
	//  209  442:ldc2            #487 <String "Ignoring attribute 'actionProviderClass'. Action view already specified.">
	//  210  445:invokestatic    #288 <Method int Log.w(String, String)>
	//  211  448:pop             
			itemActionProvider = null;
	//  212  449:aload_0         
	//  213  450:aconst_null     
	//  214  451:putfield        #240 <Field ActionProvider itemActionProvider>
		}
		itemContentDescription = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_contentDescription);
		itemTooltipText = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_tooltipText);
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_iconTintMode))
			itemIconTintMode = DrawableUtils.parseTintMode(((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_iconTintMode, -1), itemIconTintMode);
		else
	//* 215  454:goto            333
			itemIconTintMode = null;
	//  216  457:aload_0         
	//  217  458:aconst_null     
	//  218  459:putfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_iconTint))
			itemIconTintList = ((TypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.MenuItem_iconTint);
		else
	//* 219  462:goto            384
			itemIconTintList = null;
	//  220  465:aload_0         
	//  221  466:aconst_null     
	//  222  467:putfield        #68  <Field ColorStateList itemIconTintList>
		((TypedArray) (attributeset)).recycle();
		itemAdded = false;
	//* 223  470:goto            405
	}

	public void resetGroup()
	{
		groupId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #293 <Field int groupId>
		groupCategory = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #349 <Field int groupCategory>
		groupOrder = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #354 <Field int groupOrder>
		groupCheckable = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #359 <Field int groupCheckable>
		groupVisible = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #368 <Field boolean groupVisible>
		groupEnabled = true;
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:putfield        #373 <Field boolean groupEnabled>
	//   18   30:return          
	}

	private static final int defaultGroupId = 0;
	private static final int defaultItemCategory = 0;
	private static final int defaultItemCheckable = 0;
	private static final boolean defaultItemChecked = false;
	private static final boolean defaultItemEnabled = true;
	private static final int defaultItemId = 0;
	private static final int defaultItemOrder = 0;
	private static final boolean defaultItemVisible = true;
	private int groupCategory;
	private int groupCheckable;
	private boolean groupEnabled;
	private int groupId;
	private int groupOrder;
	private boolean groupVisible;
	ActionProvider itemActionProvider;
	private String itemActionProviderClassName;
	private String itemActionViewClassName;
	private int itemActionViewLayout;
	private boolean itemAdded;
	private int itemAlphabeticModifiers;
	private char itemAlphabeticShortcut;
	private int itemCategoryOrder;
	private int itemCheckable;
	private boolean itemChecked;
	private CharSequence itemContentDescription;
	private boolean itemEnabled;
	private int itemIconResId;
	private ColorStateList itemIconTintList;
	private android.graphics.PorterDuff.Mode itemIconTintMode;
	private int itemId;
	private String itemListenerMethodName;
	private int itemNumericModifiers;
	private char itemNumericShortcut;
	private int itemShowAsAction;
	private CharSequence itemTitle;
	private CharSequence itemTitleCondensed;
	private CharSequence itemTooltipText;
	private boolean itemVisible;
	private Menu menu;
	final SupportMenuInflater this$0;

	public SupportMenuInflater$MenuState(Menu menu1)
	{
		this$0 = SupportMenuInflater.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field SupportMenuInflater this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #66  <Method void Object()>
		itemIconTintList = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field ColorStateList itemIconTintList>
		itemIconTintMode = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
		menu = menu1;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #72  <Field Menu menu>
		resetGroup();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #75  <Method void resetGroup()>
	//   16   28:return          
	}
}
