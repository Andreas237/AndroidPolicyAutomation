// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.view:
//			SupportMenuInflater

class SupportMenuInflater$MenuState
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
	//    6    8:invokevirtual   #74  <Method char String.charAt(int)>
	//    7   11:ireturn         
	}

	private Object newInstance(String s, Class aclass[], Object aobj[])
	{
		try
		{
			aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #82  <Field Context SupportMenuInflater.mContext>
	//    3    7:invokevirtual   #88  <Method ClassLoader Context.getClassLoader()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #94  <Method Class ClassLoader.loadClass(String)>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #100 <Method Constructor Class.getConstructor(Class[])>
	//    8   18:astore_2        
			((Constructor) (aclass)).setAccessible(true);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #106 <Method void Constructor.setAccessible(boolean)>
			aclass = ((Class []) (((Constructor) (aclass)).newInstance(aobj)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #109 <Method Object Constructor.newInstance(Object[])>
	//   15   29:astore_2        
		}
	//*  16   30:aload_2         
	//*  17   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Class aclass[])
	//*  18   32:astore_2        
		{
			Log.w("SupportMenuInflater", (new StringBuilder()).append("Cannot instantiate class: ").append(s).toString(), ((Throwable) (aclass)));
	//   19   33:ldc1            #111 <String "SupportMenuInflater">
	//   20   35:new             #113 <Class StringBuilder>
	//   21   38:dup             
	//   22   39:invokespecial   #114 <Method void StringBuilder()>
	//   23   42:ldc1            #116 <String "Cannot instantiate class: ">
	//   24   44:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   28   54:aload_2         
	//   29   55:invokestatic    #130 <Method int Log.w(String, String, Throwable)>
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
	//    2    2:getfield        #136 <Field boolean itemChecked>
	//    3    5:invokeinterface #142 <Method MenuItem MenuItem.setChecked(boolean)>
	//    4   10:aload_0         
	//    5   11:getfield        #144 <Field boolean itemVisible>
	//    6   14:invokeinterface #147 <Method MenuItem MenuItem.setVisible(boolean)>
	//    7   19:aload_0         
	//    8   20:getfield        #149 <Field boolean itemEnabled>
	//    9   23:invokeinterface #152 <Method MenuItem MenuItem.setEnabled(boolean)>
	//   10   28:astore          4
		boolean flag1;
		if(itemCheckable >= 1)
	//*  11   30:aload_0         
	//*  12   31:getfield        #154 <Field int itemCheckable>
	//*  13   34:iconst_1        
	//*  14   35:icmplt          43
			flag1 = true;
	//   15   38:iconst_1        
	//   16   39:istore_3        
		else
	//*  17   40:goto            45
			flag1 = false;
	//   18   43:iconst_0        
	//   19   44:istore_3        
		((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
	//   20   45:aload           4
	//   21   47:iload_3         
	//   22   48:invokeinterface #157 <Method MenuItem MenuItem.setCheckable(boolean)>
	//   23   53:aload_0         
	//   24   54:getfield        #159 <Field CharSequence itemTitleCondensed>
	//   25   57:invokeinterface #163 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
	//   26   62:aload_0         
	//   27   63:getfield        #165 <Field int itemIconResId>
	//   28   66:invokeinterface #169 <Method MenuItem MenuItem.setIcon(int)>
	//   29   71:aload_0         
	//   30   72:getfield        #171 <Field char itemAlphabeticShortcut>
	//   31   75:invokeinterface #175 <Method MenuItem MenuItem.setAlphabeticShortcut(char)>
	//   32   80:aload_0         
	//   33   81:getfield        #177 <Field char itemNumericShortcut>
	//   34   84:invokeinterface #180 <Method MenuItem MenuItem.setNumericShortcut(char)>
	//   35   89:pop             
		if(itemShowAsAction >= 0)
	//*  36   90:aload_0         
	//*  37   91:getfield        #182 <Field int itemShowAsAction>
	//*  38   94:iflt            107
			menuitem.setShowAsAction(itemShowAsAction);
	//   39   97:aload_1         
	//   40   98:aload_0         
	//   41   99:getfield        #182 <Field int itemShowAsAction>
	//   42  102:invokeinterface #186 <Method void MenuItem.setShowAsAction(int)>
		if(itemListenerMethodName != null)
	//*  43  107:aload_0         
	//*  44  108:getfield        #188 <Field String itemListenerMethodName>
	//*  45  111:ifnull          162
		{
			if(mContext.isRestricted())
	//*  46  114:aload_0         
	//*  47  115:getfield        #57  <Field SupportMenuInflater this$0>
	//*  48  118:getfield        #82  <Field Context SupportMenuInflater.mContext>
	//*  49  121:invokevirtual   #192 <Method boolean Context.isRestricted()>
	//*  50  124:ifeq            137
				throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
	//   51  127:new             #194 <Class IllegalStateException>
	//   52  130:dup             
	//   53  131:ldc1            #196 <String "The android:onClick attribute cannot be used within a restricted context">
	//   54  133:invokespecial   #199 <Method void IllegalStateException(String)>
	//   55  136:athrow          
			menuitem.setOnMenuItemClickListener(((android.view.er) (new MenuItemClickListener(getRealOwner(), itemListenerMethodName))));
	//   56  137:aload_1         
	//   57  138:new             #201 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
	//   58  141:dup             
	//   59  142:aload_0         
	//   60  143:getfield        #57  <Field SupportMenuInflater this$0>
	//   61  146:invokevirtual   #205 <Method Object SupportMenuInflater.getRealOwner()>
	//   62  149:aload_0         
	//   63  150:getfield        #188 <Field String itemListenerMethodName>
	//   64  153:invokespecial   #208 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
	//   65  156:invokeinterface #212 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   66  161:pop             
		}
		if(menuitem instanceof MenuItemImpl)
	//*  67  162:aload_1         
	//*  68  163:instanceof      #214 <Class MenuItemImpl>
	//*  69  166:ifeq            178
			obj = ((Object) ((MenuItemImpl)menuitem));
	//   70  169:aload_1         
	//   71  170:checkcast       #214 <Class MenuItemImpl>
	//   72  173:astore          4
	//*  73  175:goto            178
		if(itemCheckable >= 2)
	//*  74  178:aload_0         
	//*  75  179:getfield        #154 <Field int itemCheckable>
	//*  76  182:iconst_2        
	//*  77  183:icmplt          219
			if(menuitem instanceof MenuItemImpl)
	//*  78  186:aload_1         
	//*  79  187:instanceof      #214 <Class MenuItemImpl>
	//*  80  190:ifeq            204
				((MenuItemImpl)menuitem).setExclusiveCheckable(true);
	//   81  193:aload_1         
	//   82  194:checkcast       #214 <Class MenuItemImpl>
	//   83  197:iconst_1        
	//   84  198:invokevirtual   #217 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			else
	//*  85  201:goto            219
			if(menuitem instanceof MenuItemWrapperICS)
	//*  86  204:aload_1         
	//*  87  205:instanceof      #219 <Class MenuItemWrapperICS>
	//*  88  208:ifeq            219
				((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
	//   89  211:aload_1         
	//   90  212:checkcast       #219 <Class MenuItemWrapperICS>
	//   91  215:iconst_1        
	//   92  216:invokevirtual   #220 <Method void MenuItemWrapperICS.setExclusiveCheckable(boolean)>
		boolean flag = false;
	//   93  219:iconst_0        
	//   94  220:istore_2        
		if(itemActionViewClassName != null)
	//*  95  221:aload_0         
	//*  96  222:getfield        #222 <Field String itemActionViewClassName>
	//*  97  225:ifnull          258
		{
			menuitem.setActionView((View)newInstance(itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
	//   98  228:aload_1         
	//   99  229:aload_0         
	//  100  230:aload_0         
	//  101  231:getfield        #222 <Field String itemActionViewClassName>
	//  102  234:getstatic       #226 <Field Class[] SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//  103  237:aload_0         
	//  104  238:getfield        #57  <Field SupportMenuInflater this$0>
	//  105  241:getfield        #230 <Field Object[] SupportMenuInflater.mActionViewConstructorArguments>
	//  106  244:invokespecial   #232 <Method Object newInstance(String, Class[], Object[])>
	//  107  247:checkcast       #234 <Class View>
	//  108  250:invokeinterface #238 <Method MenuItem MenuItem.setActionView(View)>
	//  109  255:pop             
			flag = true;
	//  110  256:iconst_1        
	//  111  257:istore_2        
		}
		if(itemActionViewLayout > 0)
	//* 112  258:aload_0         
	//* 113  259:getfield        #240 <Field int itemActionViewLayout>
	//* 114  262:ifle            291
			if(!flag)
	//* 115  265:iload_2         
	//* 116  266:ifne            283
				menuitem.setActionView(itemActionViewLayout);
	//  117  269:aload_1         
	//  118  270:aload_0         
	//  119  271:getfield        #240 <Field int itemActionViewLayout>
	//  120  274:invokeinterface #242 <Method MenuItem MenuItem.setActionView(int)>
	//  121  279:pop             
			else
	//* 122  280:goto            291
				Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
	//  123  283:ldc1            #111 <String "SupportMenuInflater">
	//  124  285:ldc1            #244 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
	//  125  287:invokestatic    #247 <Method int Log.w(String, String)>
	//  126  290:pop             
		if(itemActionProvider != null)
	//* 127  291:aload_0         
	//* 128  292:getfield        #249 <Field ActionProvider itemActionProvider>
	//* 129  295:ifnull          307
			MenuItemCompat.setActionProvider(menuitem, itemActionProvider);
	//  130  298:aload_1         
	//  131  299:aload_0         
	//  132  300:getfield        #249 <Field ActionProvider itemActionProvider>
	//  133  303:invokestatic    #255 <Method MenuItem MenuItemCompat.setActionProvider(MenuItem, ActionProvider)>
	//  134  306:pop             
		MenuItemCompat.setContentDescription(menuitem, itemContentDescription);
	//  135  307:aload_1         
	//  136  308:aload_0         
	//  137  309:getfield        #257 <Field CharSequence itemContentDescription>
	//  138  312:invokestatic    #261 <Method void MenuItemCompat.setContentDescription(MenuItem, CharSequence)>
		MenuItemCompat.setTooltipText(menuitem, itemTooltipText);
	//  139  315:aload_1         
	//  140  316:aload_0         
	//  141  317:getfield        #263 <Field CharSequence itemTooltipText>
	//  142  320:invokestatic    #266 <Method void MenuItemCompat.setTooltipText(MenuItem, CharSequence)>
	//  143  323:return          
	}

	public void addItem()
	{
		itemAdded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #269 <Field boolean itemAdded>
		setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #62  <Field Menu menu>
	//    6   10:aload_0         
	//    7   11:getfield        #271 <Field int groupId>
	//    8   14:aload_0         
	//    9   15:getfield        #273 <Field int itemId>
	//   10   18:aload_0         
	//   11   19:getfield        #275 <Field int itemCategoryOrder>
	//   12   22:aload_0         
	//   13   23:getfield        #277 <Field CharSequence itemTitle>
	//   14   26:invokeinterface #283 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//   15   31:invokespecial   #285 <Method void setItem(MenuItem)>
	//   16   34:return          
	}

	public SubMenu addSubMenuItem()
	{
		itemAdded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #269 <Field boolean itemAdded>
		SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field Menu menu>
	//    5    9:aload_0         
	//    6   10:getfield        #271 <Field int groupId>
	//    7   13:aload_0         
	//    8   14:getfield        #273 <Field int itemId>
	//    9   17:aload_0         
	//   10   18:getfield        #275 <Field int itemCategoryOrder>
	//   11   21:aload_0         
	//   12   22:getfield        #277 <Field CharSequence itemTitle>
	//   13   25:invokeinterface #291 <Method SubMenu Menu.addSubMenu(int, int, int, CharSequence)>
	//   14   30:astore_1        
		setItem(submenu.getItem());
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokeinterface #297 <Method MenuItem SubMenu.getItem()>
	//   18   38:invokespecial   #285 <Method void setItem(MenuItem)>
		return submenu;
	//   19   41:aload_1         
	//   20   42:areturn         
	}

	public boolean hasAddedItem()
	{
		return itemAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field boolean itemAdded>
	//    2    4:ireturn         
	}

	public void readGroup(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuGroup)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #82  <Field Context SupportMenuInflater.mContext>
	//    3    7:aload_1         
	//    4    8:getstatic       #306 <Field int[] android.support.v7.appcompat.R$styleable.MenuGroup>
	//    5   11:invokevirtual   #310 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    6   14:astore_1        
		groupId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuGroup_android_id, 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getstatic       #313 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_id>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #319 <Method int TypedArray.getResourceId(int, int)>
	//   12   24:putfield        #271 <Field int groupId>
		groupCategory = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_menuCategory, 0);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getstatic       #322 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_menuCategory>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #325 <Method int TypedArray.getInt(int, int)>
	//   18   36:putfield        #327 <Field int groupCategory>
		groupOrder = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_orderInCategory, 0);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getstatic       #330 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_orderInCategory>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #325 <Method int TypedArray.getInt(int, int)>
	//   24   48:putfield        #332 <Field int groupOrder>
		groupCheckable = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_checkableBehavior, 0);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:getstatic       #335 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_checkableBehavior>
	//   28   56:iconst_0        
	//   29   57:invokevirtual   #325 <Method int TypedArray.getInt(int, int)>
	//   30   60:putfield        #337 <Field int groupCheckable>
		groupVisible = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_visible, true);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getstatic       #340 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_visible>
	//   34   68:iconst_1        
	//   35   69:invokevirtual   #344 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   36   72:putfield        #346 <Field boolean groupVisible>
		groupEnabled = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_enabled, true);
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:getstatic       #349 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_enabled>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #344 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   42   84:putfield        #351 <Field boolean groupEnabled>
		((TypedArray) (attributeset)).recycle();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #354 <Method void TypedArray.recycle()>
	//   45   91:return          
	}

	public void readItem(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuItem)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #82  <Field Context SupportMenuInflater.mContext>
	//    3    7:aload_1         
	//    4    8:getstatic       #358 <Field int[] android.support.v7.appcompat.R$styleable.MenuItem>
	//    5   11:invokevirtual   #310 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    6   14:astore_1        
		itemId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_android_id, 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getstatic       #361 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_id>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #319 <Method int TypedArray.getResourceId(int, int)>
	//   12   24:putfield        #273 <Field int itemId>
		itemCategoryOrder = 0xffff0000 & ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_android_menuCategory, groupCategory) | 0xffff & ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_android_orderInCategory, groupOrder);
	//   13   27:aload_0         
	//   14   28:ldc2            #362 <Int 0xffff0000>
	//   15   31:aload_1         
	//   16   32:getstatic       #365 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_menuCategory>
	//   17   35:aload_0         
	//   18   36:getfield        #327 <Field int groupCategory>
	//   19   39:invokevirtual   #325 <Method int TypedArray.getInt(int, int)>
	//   20   42:iand            
	//   21   43:ldc2            #366 <Int 65535>
	//   22   46:aload_1         
	//   23   47:getstatic       #369 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_orderInCategory>
	//   24   50:aload_0         
	//   25   51:getfield        #332 <Field int groupOrder>
	//   26   54:invokevirtual   #325 <Method int TypedArray.getInt(int, int)>
	//   27   57:iand            
	//   28   58:ior             
	//   29   59:putfield        #275 <Field int itemCategoryOrder>
		itemTitle = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_android_title);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:getstatic       #372 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_title>
	//   33   67:invokevirtual   #376 <Method CharSequence TypedArray.getText(int)>
	//   34   70:putfield        #277 <Field CharSequence itemTitle>
		itemTitleCondensed = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_android_titleCondensed);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:getstatic       #379 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_titleCondensed>
	//   38   78:invokevirtual   #376 <Method CharSequence TypedArray.getText(int)>
	//   39   81:putfield        #159 <Field CharSequence itemTitleCondensed>
		itemIconResId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_android_icon, 0);
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:getstatic       #382 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_icon>
	//   43   89:iconst_0        
	//   44   90:invokevirtual   #319 <Method int TypedArray.getResourceId(int, int)>
	//   45   93:putfield        #165 <Field int itemIconResId>
		itemAlphabeticShortcut = getShortcut(((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_alphabeticShortcut));
	//   46   96:aload_0         
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:getstatic       #385 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_alphabeticShortcut>
	//   50  102:invokevirtual   #389 <Method String TypedArray.getString(int)>
	//   51  105:invokespecial   #391 <Method char getShortcut(String)>
	//   52  108:putfield        #171 <Field char itemAlphabeticShortcut>
		itemNumericShortcut = getShortcut(((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_numericShortcut));
	//   53  111:aload_0         
	//   54  112:aload_0         
	//   55  113:aload_1         
	//   56  114:getstatic       #394 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_numericShortcut>
	//   57  117:invokevirtual   #389 <Method String TypedArray.getString(int)>
	//   58  120:invokespecial   #391 <Method char getShortcut(String)>
	//   59  123:putfield        #177 <Field char itemNumericShortcut>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.MenuItem_android_checkable))
	//*  60  126:aload_1         
	//*  61  127:getstatic       #397 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checkable>
	//*  62  130:invokevirtual   #401 <Method boolean TypedArray.hasValue(int)>
	//*  63  133:ifeq            162
		{
			int i;
			if(((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_checkable, false))
	//*  64  136:aload_1         
	//*  65  137:getstatic       #397 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checkable>
	//*  66  140:iconst_0        
	//*  67  141:invokevirtual   #344 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  68  144:ifeq            152
				i = 1;
	//   69  147:iconst_1        
	//   70  148:istore_2        
			else
	//*  71  149:goto            154
				i = 0;
	//   72  152:iconst_0        
	//   73  153:istore_2        
			itemCheckable = i;
	//   74  154:aload_0         
	//   75  155:iload_2         
	//   76  156:putfield        #154 <Field int itemCheckable>
		} else
	//*  77  159:goto            170
		{
			itemCheckable = groupCheckable;
	//   78  162:aload_0         
	//   79  163:aload_0         
	//   80  164:getfield        #337 <Field int groupCheckable>
	//   81  167:putfield        #154 <Field int itemCheckable>
		}
		itemChecked = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_checked, false);
	//   82  170:aload_0         
	//   83  171:aload_1         
	//   84  172:getstatic       #404 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_checked>
	//   85  175:iconst_0        
	//   86  176:invokevirtual   #344 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   87  179:putfield        #136 <Field boolean itemChecked>
		itemVisible = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_visible, groupVisible);
	//   88  182:aload_0         
	//   89  183:aload_1         
	//   90  184:getstatic       #407 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_visible>
	//   91  187:aload_0         
	//   92  188:getfield        #346 <Field boolean groupVisible>
	//   93  191:invokevirtual   #344 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   94  194:putfield        #144 <Field boolean itemVisible>
		itemEnabled = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuItem_android_enabled, groupEnabled);
	//   95  197:aload_0         
	//   96  198:aload_1         
	//   97  199:getstatic       #410 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_enabled>
	//   98  202:aload_0         
	//   99  203:getfield        #351 <Field boolean groupEnabled>
	//  100  206:invokevirtual   #344 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  101  209:putfield        #149 <Field boolean itemEnabled>
		itemShowAsAction = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuItem_showAsAction, -1);
	//  102  212:aload_0         
	//  103  213:aload_1         
	//  104  214:getstatic       #413 <Field int android.support.v7.appcompat.R$styleable.MenuItem_showAsAction>
	//  105  217:iconst_m1       
	//  106  218:invokevirtual   #325 <Method int TypedArray.getInt(int, int)>
	//  107  221:putfield        #182 <Field int itemShowAsAction>
		itemListenerMethodName = ((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_android_onClick);
	//  108  224:aload_0         
	//  109  225:aload_1         
	//  110  226:getstatic       #416 <Field int android.support.v7.appcompat.R$styleable.MenuItem_android_onClick>
	//  111  229:invokevirtual   #389 <Method String TypedArray.getString(int)>
	//  112  232:putfield        #188 <Field String itemListenerMethodName>
		itemActionViewLayout = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuItem_actionLayout, 0);
	//  113  235:aload_0         
	//  114  236:aload_1         
	//  115  237:getstatic       #419 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionLayout>
	//  116  240:iconst_0        
	//  117  241:invokevirtual   #319 <Method int TypedArray.getResourceId(int, int)>
	//  118  244:putfield        #240 <Field int itemActionViewLayout>
		itemActionViewClassName = ((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_actionViewClass);
	//  119  247:aload_0         
	//  120  248:aload_1         
	//  121  249:getstatic       #422 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionViewClass>
	//  122  252:invokevirtual   #389 <Method String TypedArray.getString(int)>
	//  123  255:putfield        #222 <Field String itemActionViewClassName>
		itemActionProviderClassName = ((TypedArray) (attributeset)).getString(android.support.v7.appcompat.R.styleable.MenuItem_actionProviderClass);
	//  124  258:aload_0         
	//  125  259:aload_1         
	//  126  260:getstatic       #425 <Field int android.support.v7.appcompat.R$styleable.MenuItem_actionProviderClass>
	//  127  263:invokevirtual   #389 <Method String TypedArray.getString(int)>
	//  128  266:putfield        #427 <Field String itemActionProviderClassName>
		boolean flag;
		if(itemActionProviderClassName != null)
	//* 129  269:aload_0         
	//* 130  270:getfield        #427 <Field String itemActionProviderClassName>
	//* 131  273:ifnull          281
			flag = true;
	//  132  276:iconst_1        
	//  133  277:istore_2        
		else
	//* 134  278:goto            283
			flag = false;
	//  135  281:iconst_0        
	//  136  282:istore_2        
		if(flag && itemActionViewLayout == 0 && itemActionViewClassName == null)
	//* 137  283:iload_2         
	//* 138  284:ifeq            329
	//* 139  287:aload_0         
	//* 140  288:getfield        #240 <Field int itemActionViewLayout>
	//* 141  291:ifne            329
	//* 142  294:aload_0         
	//* 143  295:getfield        #222 <Field String itemActionViewClassName>
	//* 144  298:ifnonnull       329
		{
			itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, mActionProviderConstructorArguments);
	//  145  301:aload_0         
	//  146  302:aload_0         
	//  147  303:aload_0         
	//  148  304:getfield        #427 <Field String itemActionProviderClassName>
	//  149  307:getstatic       #430 <Field Class[] SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
	//  150  310:aload_0         
	//  151  311:getfield        #57  <Field SupportMenuInflater this$0>
	//  152  314:getfield        #433 <Field Object[] SupportMenuInflater.mActionProviderConstructorArguments>
	//  153  317:invokespecial   #232 <Method Object newInstance(String, Class[], Object[])>
	//  154  320:checkcast       #435 <Class ActionProvider>
	//  155  323:putfield        #249 <Field ActionProvider itemActionProvider>
		} else
	//* 156  326:goto            347
		{
			if(flag)
	//* 157  329:iload_2         
	//* 158  330:ifeq            342
				Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
	//  159  333:ldc1            #111 <String "SupportMenuInflater">
	//  160  335:ldc2            #437 <String "Ignoring attribute 'actionProviderClass'. Action view already specified.">
	//  161  338:invokestatic    #247 <Method int Log.w(String, String)>
	//  162  341:pop             
			itemActionProvider = null;
	//  163  342:aload_0         
	//  164  343:aconst_null     
	//  165  344:putfield        #249 <Field ActionProvider itemActionProvider>
		}
		itemContentDescription = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_contentDescription);
	//  166  347:aload_0         
	//  167  348:aload_1         
	//  168  349:getstatic       #440 <Field int android.support.v7.appcompat.R$styleable.MenuItem_contentDescription>
	//  169  352:invokevirtual   #376 <Method CharSequence TypedArray.getText(int)>
	//  170  355:putfield        #257 <Field CharSequence itemContentDescription>
		itemTooltipText = ((TypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.MenuItem_tooltipText);
	//  171  358:aload_0         
	//  172  359:aload_1         
	//  173  360:getstatic       #443 <Field int android.support.v7.appcompat.R$styleable.MenuItem_tooltipText>
	//  174  363:invokevirtual   #376 <Method CharSequence TypedArray.getText(int)>
	//  175  366:putfield        #263 <Field CharSequence itemTooltipText>
		((TypedArray) (attributeset)).recycle();
	//  176  369:aload_1         
	//  177  370:invokevirtual   #354 <Method void TypedArray.recycle()>
		itemAdded = false;
	//  178  373:aload_0         
	//  179  374:iconst_0        
	//  180  375:putfield        #269 <Field boolean itemAdded>
	//  181  378:return          
	}

	public void resetGroup()
	{
		groupId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #271 <Field int groupId>
		groupCategory = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #327 <Field int groupCategory>
		groupOrder = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #332 <Field int groupOrder>
		groupCheckable = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #337 <Field int groupCheckable>
		groupVisible = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #346 <Field boolean groupVisible>
		groupEnabled = true;
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:putfield        #351 <Field boolean groupEnabled>
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
	private char itemAlphabeticShortcut;
	private int itemCategoryOrder;
	private int itemCheckable;
	private boolean itemChecked;
	private CharSequence itemContentDescription;
	private boolean itemEnabled;
	private int itemIconResId;
	private int itemId;
	private String itemListenerMethodName;
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
	//    2    2:putfield        #57  <Field SupportMenuInflater this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #60  <Method void Object()>
		menu = menu1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #62  <Field Menu menu>
		resetGroup();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #65  <Method void resetGroup()>
	//   10   18:return          
	}
}
