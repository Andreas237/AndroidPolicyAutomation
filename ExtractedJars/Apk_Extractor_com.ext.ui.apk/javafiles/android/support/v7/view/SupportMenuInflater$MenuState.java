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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		Object obj = ((Object) (menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled)));
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #146 <Field boolean itemChecked>
	//    5    7:invokeinterface #152 <Method MenuItem MenuItem.setChecked(boolean)>
	//    6   12:aload_0         
	//    7   13:getfield        #154 <Field boolean itemVisible>
	//    8   16:invokeinterface #157 <Method MenuItem MenuItem.setVisible(boolean)>
	//    9   21:aload_0         
	//   10   22:getfield        #159 <Field boolean itemEnabled>
	//   11   25:invokeinterface #162 <Method MenuItem MenuItem.setEnabled(boolean)>
	//   12   30:astore          4
		boolean flag1;
		if(itemCheckable >= 1)
	//*  13   32:aload_0         
	//*  14   33:getfield        #164 <Field int itemCheckable>
	//*  15   36:iconst_1        
	//*  16   37:icmplt          116
			flag1 = true;
	//   17   40:iconst_1        
	//   18   41:istore_3        
		else
	//*  19   42:aload           4
	//*  20   44:iload_3         
	//*  21   45:invokeinterface #167 <Method MenuItem MenuItem.setCheckable(boolean)>
	//*  22   50:aload_0         
	//*  23   51:getfield        #169 <Field CharSequence itemTitleCondensed>
	//*  24   54:invokeinterface #173 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
	//*  25   59:aload_0         
	//*  26   60:getfield        #175 <Field int itemIconResId>
	//*  27   63:invokeinterface #179 <Method MenuItem MenuItem.setIcon(int)>
	//*  28   68:pop             
	//*  29   69:aload_0         
	//*  30   70:getfield        #181 <Field int itemShowAsAction>
	//*  31   73:iflt            86
	//*  32   76:aload_1         
	//*  33   77:aload_0         
	//*  34   78:getfield        #181 <Field int itemShowAsAction>
	//*  35   81:invokeinterface #185 <Method void MenuItem.setShowAsAction(int)>
	//*  36   86:aload_0         
	//*  37   87:getfield        #187 <Field String itemListenerMethodName>
	//*  38   90:ifnull          146
	//*  39   93:aload_0         
	//*  40   94:getfield        #63  <Field SupportMenuInflater this$0>
	//*  41   97:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//*  42  100:invokevirtual   #191 <Method boolean Context.isRestricted()>
	//*  43  103:ifeq            121
	//*  44  106:new             #193 <Class IllegalStateException>
	//*  45  109:dup             
	//*  46  110:ldc1            #195 <String "The android:onClick attribute cannot be used within a restricted context">
	//*  47  112:invokespecial   #198 <Method void IllegalStateException(String)>
	//*  48  115:athrow          
			flag1 = false;
	//   49  116:iconst_0        
	//   50  117:istore_3        
		((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId);
		if(itemShowAsAction >= 0)
			menuitem.setShowAsAction(itemShowAsAction);
		if(itemListenerMethodName != null)
		{
			if(mContext.isRestricted())
				throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
	//*  51  118:goto            42
			menuitem.setOnMenuItemClickListener(((android.view.er) (new MenuItemClickListener(getRealOwner(), itemListenerMethodName))));
	//   52  121:aload_1         
	//   53  122:new             #200 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
	//   54  125:dup             
	//   55  126:aload_0         
	//   56  127:getfield        #63  <Field SupportMenuInflater this$0>
	//   57  130:invokevirtual   #204 <Method Object SupportMenuInflater.getRealOwner()>
	//   58  133:aload_0         
	//   59  134:getfield        #187 <Field String itemListenerMethodName>
	//   60  137:invokespecial   #207 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
	//   61  140:invokeinterface #211 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   62  145:pop             
		}
		if(menuitem instanceof MenuItemImpl)
	//*  63  146:aload_1         
	//*  64  147:instanceof      #213 <Class MenuItemImpl>
	//*  65  150:ifeq            159
			obj = ((Object) ((MenuItemImpl)menuitem));
	//   66  153:aload_1         
	//   67  154:checkcast       #213 <Class MenuItemImpl>
	//   68  157:astore          4
		if(itemCheckable >= 2)
	//*  69  159:aload_0         
	//*  70  160:getfield        #164 <Field int itemCheckable>
	//*  71  163:iconst_2        
	//*  72  164:icmplt          182
			if(menuitem instanceof MenuItemImpl)
	//*  73  167:aload_1         
	//*  74  168:instanceof      #213 <Class MenuItemImpl>
	//*  75  171:ifeq            326
				((MenuItemImpl)menuitem).setExclusiveCheckable(true);
	//   76  174:aload_1         
	//   77  175:checkcast       #213 <Class MenuItemImpl>
	//   78  178:iconst_1        
	//   79  179:invokevirtual   #216 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			else
	//*  80  182:aload_0         
	//*  81  183:getfield        #218 <Field String itemActionViewClassName>
	//*  82  186:ifnull          356
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
	//*  95  217:aload_0         
	//*  96  218:getfield        #236 <Field int itemActionViewLayout>
	//*  97  221:ifle            239
	//*  98  224:iload_2         
	//*  99  225:ifne            344
	//* 100  228:aload_1         
	//* 101  229:aload_0         
	//* 102  230:getfield        #236 <Field int itemActionViewLayout>
	//* 103  233:invokeinterface #238 <Method MenuItem MenuItem.setActionView(int)>
	//* 104  238:pop             
	//* 105  239:aload_0         
	//* 106  240:getfield        #240 <Field ActionProvider itemActionProvider>
	//* 107  243:ifnull          255
	//* 108  246:aload_1         
	//* 109  247:aload_0         
	//* 110  248:getfield        #240 <Field ActionProvider itemActionProvider>
	//* 111  251:invokestatic    #246 <Method MenuItem MenuItemCompat.setActionProvider(MenuItem, ActionProvider)>
	//* 112  254:pop             
	//* 113  255:aload_1         
	//* 114  256:aload_0         
	//* 115  257:getfield        #248 <Field CharSequence itemContentDescription>
	//* 116  260:invokestatic    #252 <Method void MenuItemCompat.setContentDescription(MenuItem, CharSequence)>
	//* 117  263:aload_1         
	//* 118  264:aload_0         
	//* 119  265:getfield        #254 <Field CharSequence itemTooltipText>
	//* 120  268:invokestatic    #257 <Method void MenuItemCompat.setTooltipText(MenuItem, CharSequence)>
	//* 121  271:aload_1         
	//* 122  272:aload_0         
	//* 123  273:getfield        #259 <Field char itemAlphabeticShortcut>
	//* 124  276:aload_0         
	//* 125  277:getfield        #261 <Field int itemAlphabeticModifiers>
	//* 126  280:invokestatic    #265 <Method void MenuItemCompat.setAlphabeticShortcut(MenuItem, char, int)>
	//* 127  283:aload_1         
	//* 128  284:aload_0         
	//* 129  285:getfield        #267 <Field char itemNumericShortcut>
	//* 130  288:aload_0         
	//* 131  289:getfield        #269 <Field int itemNumericModifiers>
	//* 132  292:invokestatic    #272 <Method void MenuItemCompat.setNumericShortcut(MenuItem, char, int)>
	//* 133  295:aload_0         
	//* 134  296:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 135  299:ifnull          310
	//* 136  302:aload_1         
	//* 137  303:aload_0         
	//* 138  304:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 139  307:invokestatic    #276 <Method void MenuItemCompat.setIconTintMode(MenuItem, android.graphics.PorterDuff$Mode)>
	//* 140  310:aload_0         
	//* 141  311:getfield        #68  <Field ColorStateList itemIconTintList>
	//* 142  314:ifnull          325
	//* 143  317:aload_1         
	//* 144  318:aload_0         
	//* 145  319:getfield        #68  <Field ColorStateList itemIconTintList>
	//* 146  322:invokestatic    #280 <Method void MenuItemCompat.setIconTintList(MenuItem, ColorStateList)>
	//* 147  325:return          
			if(menuitem instanceof MenuItemWrapperICS)
	//* 148  326:aload_1         
	//* 149  327:instanceof      #282 <Class MenuItemWrapperICS>
	//* 150  330:ifeq            182
				((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
	//  151  333:aload_1         
	//  152  334:checkcast       #282 <Class MenuItemWrapperICS>
	//  153  337:iconst_1        
	//  154  338:invokevirtual   #283 <Method void MenuItemWrapperICS.setExclusiveCheckable(boolean)>
		if(itemActionViewClassName != null)
			menuitem.setActionView((View)newInstance(itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
		else
	//* 155  341:goto            182
	//* 156  344:ldc1            #121 <String "SupportMenuInflater">
	//* 157  346:ldc2            #285 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
	//* 158  349:invokestatic    #288 <Method int Log.w(String, String)>
	//* 159  352:pop             
	//* 160  353:goto            239
			flag = false;
	//  161  356:iconst_0        
	//  162  357:istore_2        
		if(itemActionViewLayout > 0)
			if(!flag)
				menuitem.setActionView(itemActionViewLayout);
			else
				Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
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
	//* 163  358:goto            217
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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuItem)));
	//    2    2:aload_0         
	//    3    3:getfield        #63  <Field SupportMenuInflater this$0>
	//    4    6:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//    5    9:aload_1         
	//    6   10:getstatic       #380 <Field int[] android.support.v7.appcompat.R$styleable.MenuItem>
	//    7   13:invokevirtual   #332 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   16:astore_1        
		itemId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_android_id, 0);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getstatic       #383 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_id>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//   14   26:putfield        #295 <Field int itemId>
		itemCategoryOrder = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_android_menuCategory, groupCategory) & 0xffff0000 | ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_android_orderInCategory, groupOrder) & 0xffff;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getstatic       #386 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_menuCategory>
	//   18   34:aload_0         
	//   19   35:getfield        #349 <Field int groupCategory>
	//   20   38:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   21   41:ldc2            #387 <Int 0xffff0000>
	//   22   44:iand            
	//   23   45:aload_1         
	//   24   46:getstatic       #390 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_orderInCategory>
	//   25   49:aload_0         
	//   26   50:getfield        #354 <Field int groupOrder>
	//   27   53:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   28   56:ldc2            #391 <Int 65535>
	//   29   59:iand            
	//   30   60:ior             
	//   31   61:putfield        #297 <Field int itemCategoryOrder>
		itemTitle = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_android_title);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getstatic       #394 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_title>
	//   35   69:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//   36   72:putfield        #299 <Field CharSequence itemTitle>
		itemTitleCondensed = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_android_titleCondensed);
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:getstatic       #401 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_titleCondensed>
	//   40   80:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//   41   83:putfield        #169 <Field CharSequence itemTitleCondensed>
		itemIconResId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_android_icon, 0);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:getstatic       #404 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_icon>
	//   45   91:iconst_0        
	//   46   92:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//   47   95:putfield        #175 <Field int itemIconResId>
		itemAlphabeticShortcut = getShortcut(((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_alphabeticShortcut));
	//   48   98:aload_0         
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:getstatic       #407 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_alphabeticShortcut>
	//   52  104:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//   53  107:invokespecial   #413 <Method char getShortcut(String)>
	//   54  110:putfield        #259 <Field char itemAlphabeticShortcut>
		itemAlphabeticModifiers = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_alphabeticModifiers, 4096);
	//   55  113:aload_0         
	//   56  114:aload_1         
	//   57  115:getstatic       #416 <Field int android.support.v7.appcompat.R$styleable.MenuItem_alphabeticModifiers>
	//   58  118:sipush          4096
	//   59  121:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   60  124:putfield        #261 <Field int itemAlphabeticModifiers>
		itemNumericShortcut = getShortcut(((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_numericShortcut));
	//   61  127:aload_0         
	//   62  128:aload_0         
	//   63  129:aload_1         
	//   64  130:getstatic       #419 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_numericShortcut>
	//   65  133:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//   66  136:invokespecial   #413 <Method char getShortcut(String)>
	//   67  139:putfield        #267 <Field char itemNumericShortcut>
		itemNumericModifiers = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_numericModifiers, 4096);
	//   68  142:aload_0         
	//   69  143:aload_1         
	//   70  144:getstatic       #422 <Field int android.support.v7.appcompat.R$styleable.MenuItem_numericModifiers>
	//   71  147:sipush          4096
	//   72  150:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//   73  153:putfield        #269 <Field int itemNumericModifiers>
		int i;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_android_checkable))
	//*  74  156:aload_1         
	//*  75  157:getstatic       #425 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checkable>
	//*  76  160:invokevirtual   #429 <Method boolean TypedArray.hasValue(int)>
	//*  77  163:ifeq            422
		{
			if(((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_checkable, false))
	//*  78  166:aload_1         
	//*  79  167:getstatic       #425 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checkable>
	//*  80  170:iconst_0        
	//*  81  171:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  82  174:ifeq            417
				i = 1;
	//   83  177:iconst_1        
	//   84  178:istore_2        
			else
	//*  85  179:aload_0         
	//*  86  180:iload_2         
	//*  87  181:putfield        #164 <Field int itemCheckable>
	//*  88  184:aload_0         
	//*  89  185:aload_1         
	//*  90  186:getstatic       #432 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checked>
	//*  91  189:iconst_0        
	//*  92  190:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  93  193:putfield        #146 <Field boolean itemChecked>
	//*  94  196:aload_0         
	//*  95  197:aload_1         
	//*  96  198:getstatic       #435 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_visible>
	//*  97  201:aload_0         
	//*  98  202:getfield        #368 <Field boolean groupVisible>
	//*  99  205:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 100  208:putfield        #154 <Field boolean itemVisible>
	//* 101  211:aload_0         
	//* 102  212:aload_1         
	//* 103  213:getstatic       #438 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_enabled>
	//* 104  216:aload_0         
	//* 105  217:getfield        #373 <Field boolean groupEnabled>
	//* 106  220:invokevirtual   #366 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 107  223:putfield        #159 <Field boolean itemEnabled>
	//* 108  226:aload_0         
	//* 109  227:aload_1         
	//* 110  228:getstatic       #441 <Field int android.support.v7.appcompat.R$styleable.MenuItem_showAsAction>
	//* 111  231:iconst_m1       
	//* 112  232:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//* 113  235:putfield        #181 <Field int itemShowAsAction>
	//* 114  238:aload_0         
	//* 115  239:aload_1         
	//* 116  240:getstatic       #444 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_onClick>
	//* 117  243:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//* 118  246:putfield        #187 <Field String itemListenerMethodName>
	//* 119  249:aload_0         
	//* 120  250:aload_1         
	//* 121  251:getstatic       #447 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionLayout>
	//* 122  254:iconst_0        
	//* 123  255:invokevirtual   #341 <Method int TypedArray.getResourceId(int, int)>
	//* 124  258:putfield        #236 <Field int itemActionViewLayout>
	//* 125  261:aload_0         
	//* 126  262:aload_1         
	//* 127  263:getstatic       #450 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionViewClass>
	//* 128  266:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//* 129  269:putfield        #218 <Field String itemActionViewClassName>
	//* 130  272:aload_0         
	//* 131  273:aload_1         
	//* 132  274:getstatic       #453 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionProviderClass>
	//* 133  277:invokevirtual   #411 <Method String TypedArray.getString(int)>
	//* 134  280:putfield        #455 <Field String itemActionProviderClassName>
	//* 135  283:aload_0         
	//* 136  284:getfield        #455 <Field String itemActionProviderClassName>
	//* 137  287:ifnull          433
	//* 138  290:iload_3         
	//* 139  291:istore_2        
	//* 140  292:iload_2         
	//* 141  293:ifeq            438
	//* 142  296:aload_0         
	//* 143  297:getfield        #236 <Field int itemActionViewLayout>
	//* 144  300:ifne            438
	//* 145  303:aload_0         
	//* 146  304:getfield        #218 <Field String itemActionViewClassName>
	//* 147  307:ifnonnull       438
	//* 148  310:aload_0         
	//* 149  311:aload_0         
	//* 150  312:aload_0         
	//* 151  313:getfield        #455 <Field String itemActionProviderClassName>
	//* 152  316:getstatic       #458 <Field Class[] SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
	//* 153  319:aload_0         
	//* 154  320:getfield        #63  <Field SupportMenuInflater this$0>
	//* 155  323:getfield        #461 <Field Object[] SupportMenuInflater.mActionProviderConstructorArguments>
	//* 156  326:invokespecial   #228 <Method Object newInstance(String, Class[], Object[])>
	//* 157  329:checkcast       #463 <Class ActionProvider>
	//* 158  332:putfield        #240 <Field ActionProvider itemActionProvider>
	//* 159  335:aload_0         
	//* 160  336:aload_1         
	//* 161  337:getstatic       #466 <Field int android.support.v7.appcompat.R$styleable.MenuItem_contentDescription>
	//* 162  340:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//* 163  343:putfield        #248 <Field CharSequence itemContentDescription>
	//* 164  346:aload_0         
	//* 165  347:aload_1         
	//* 166  348:getstatic       #469 <Field int android.support.v7.appcompat.R$styleable.MenuItem_tooltipText>
	//* 167  351:invokevirtual   #398 <Method CharSequence TypedArray.getText(int)>
	//* 168  354:putfield        #254 <Field CharSequence itemTooltipText>
	//* 169  357:aload_1         
	//* 170  358:getstatic       #472 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTintMode>
	//* 171  361:invokevirtual   #429 <Method boolean TypedArray.hasValue(int)>
	//* 172  364:ifeq            459
	//* 173  367:aload_0         
	//* 174  368:aload_1         
	//* 175  369:getstatic       #472 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTintMode>
	//* 176  372:iconst_m1       
	//* 177  373:invokevirtual   #347 <Method int TypedArray.getInt(int, int)>
	//* 178  376:aload_0         
	//* 179  377:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 180  380:invokestatic    #478 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//* 181  383:putfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 182  386:aload_1         
	//* 183  387:getstatic       #481 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTint>
	//* 184  390:invokevirtual   #429 <Method boolean TypedArray.hasValue(int)>
	//* 185  393:ifeq            467
	//* 186  396:aload_0         
	//* 187  397:aload_1         
	//* 188  398:getstatic       #481 <Field int android.support.v7.appcompat.R$styleable.MenuItem_iconTint>
	//* 189  401:invokevirtual   #485 <Method ColorStateList TypedArray.getColorStateList(int)>
	//* 190  404:putfield        #68  <Field ColorStateList itemIconTintList>
	//* 191  407:aload_1         
	//* 192  408:invokevirtual   #376 <Method void TypedArray.recycle()>
	//* 193  411:aload_0         
	//* 194  412:iconst_0        
	//* 195  413:putfield        #291 <Field boolean itemAdded>
	//* 196  416:return          
				i = 0;
	//  197  417:iconst_0        
	//  198  418:istore_2        
			itemCheckable = i;
		} else
	//* 199  419:goto            179
		{
			itemCheckable = groupCheckable;
	//  200  422:aload_0         
	//  201  423:aload_0         
	//  202  424:getfield        #359 <Field int groupCheckable>
	//  203  427:putfield        #164 <Field int itemCheckable>
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
			i = ((int) (flag));
		else
	//* 204  430:goto            184
			i = 0;
	//  205  433:iconst_0        
	//  206  434:istore_2        
		if(i != 0 && itemActionViewLayout == 0 && itemActionViewClassName == null)
		{
			itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, mActionProviderConstructorArguments);
		} else
	//* 207  435:goto            292
		{
			if(i != 0)
	//* 208  438:iload_2         
	//* 209  439:ifeq            451
				Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
	//  210  442:ldc1            #121 <String "SupportMenuInflater">
	//  211  444:ldc2            #487 <String "Ignoring attribute 'actionProviderClass'. Action view already specified.">
	//  212  447:invokestatic    #288 <Method int Log.w(String, String)>
	//  213  450:pop             
			itemActionProvider = null;
	//  214  451:aload_0         
	//  215  452:aconst_null     
	//  216  453:putfield        #240 <Field ActionProvider itemActionProvider>
		}
		itemContentDescription = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_contentDescription);
		itemTooltipText = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_tooltipText);
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_iconTintMode))
			itemIconTintMode = DrawableUtils.parseTintMode(((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_iconTintMode, -1), itemIconTintMode);
		else
	//* 217  456:goto            335
			itemIconTintMode = null;
	//  218  459:aload_0         
	//  219  460:aconst_null     
	//  220  461:putfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_iconTint))
			itemIconTintList = ((TypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.MenuItem_iconTint);
		else
	//* 221  464:goto            386
			itemIconTintList = null;
	//  222  467:aload_0         
	//  223  468:aconst_null     
	//  224  469:putfield        #68  <Field ColorStateList itemIconTintList>
		((TypedArray) (attributeset)).recycle();
		itemAdded = false;
	//* 225  472:goto            407
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
