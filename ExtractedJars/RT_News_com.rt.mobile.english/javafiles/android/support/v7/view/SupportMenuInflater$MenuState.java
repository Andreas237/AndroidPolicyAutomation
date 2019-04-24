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
			aobj = ((Object []) (new StringBuilder()));
	//   19   33:new             #121 <Class StringBuilder>
	//   20   36:dup             
	//   21   37:invokespecial   #122 <Method void StringBuilder()>
	//   22   40:astore_3        
			((StringBuilder) (aobj)).append("Cannot instantiate class: ");
	//   23   41:aload_3         
	//   24   42:ldc1            #124 <String "Cannot instantiate class: ">
	//   25   44:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
			((StringBuilder) (aobj)).append(s);
	//   27   48:aload_3         
	//   28   49:aload_1         
	//   29   50:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
			Log.w("SupportMenuInflater", ((StringBuilder) (aobj)).toString(), ((Throwable) (aclass)));
	//   31   54:ldc1            #130 <String "SupportMenuInflater">
	//   32   56:aload_3         
	//   33   57:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   34   60:aload_2         
	//   35   61:invokestatic    #140 <Method int Log.w(String, String, Throwable)>
	//   36   64:pop             
			return ((Object) (null));
	//   37   65:aconst_null     
	//   38   66:areturn         
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
	//   10   28:astore          5
		int i = itemCheckable;
	//   11   30:aload_0         
	//   12   31:getfield        #164 <Field int itemCheckable>
	//   13   34:istore_3        
		boolean flag = false;
	//   14   35:iconst_0        
	//   15   36:istore_2        
		boolean flag1;
		if(i >= 1)
	//*  16   37:iload_3         
	//*  17   38:iconst_1        
	//*  18   39:icmplt          48
			flag1 = true;
	//   19   42:iconst_1        
	//   20   43:istore          4
		else
	//*  21   45:goto            51
			flag1 = false;
	//   22   48:iconst_0        
	//   23   49:istore          4
		((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId);
	//   24   51:aload           5
	//   25   53:iload           4
	//   26   55:invokeinterface #167 <Method MenuItem MenuItem.setCheckable(boolean)>
	//   27   60:aload_0         
	//   28   61:getfield        #169 <Field CharSequence itemTitleCondensed>
	//   29   64:invokeinterface #173 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
	//   30   69:aload_0         
	//   31   70:getfield        #175 <Field int itemIconResId>
	//   32   73:invokeinterface #179 <Method MenuItem MenuItem.setIcon(int)>
	//   33   78:pop             
		if(itemShowAsAction >= 0)
	//*  34   79:aload_0         
	//*  35   80:getfield        #181 <Field int itemShowAsAction>
	//*  36   83:iflt            96
			menuitem.setShowAsAction(itemShowAsAction);
	//   37   86:aload_1         
	//   38   87:aload_0         
	//   39   88:getfield        #181 <Field int itemShowAsAction>
	//   40   91:invokeinterface #185 <Method void MenuItem.setShowAsAction(int)>
		if(itemListenerMethodName != null)
	//*  41   96:aload_0         
	//*  42   97:getfield        #187 <Field String itemListenerMethodName>
	//*  43  100:ifnull          151
		{
			if(mContext.isRestricted())
	//*  44  103:aload_0         
	//*  45  104:getfield        #63  <Field SupportMenuInflater this$0>
	//*  46  107:getfield        #92  <Field Context SupportMenuInflater.mContext>
	//*  47  110:invokevirtual   #191 <Method boolean Context.isRestricted()>
	//*  48  113:ifeq            126
				throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
	//   49  116:new             #193 <Class IllegalStateException>
	//   50  119:dup             
	//   51  120:ldc1            #195 <String "The android:onClick attribute cannot be used within a restricted context">
	//   52  122:invokespecial   #198 <Method void IllegalStateException(String)>
	//   53  125:athrow          
			menuitem.setOnMenuItemClickListener(((android.view.er) (new MenuItemClickListener(getRealOwner(), itemListenerMethodName))));
	//   54  126:aload_1         
	//   55  127:new             #200 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
	//   56  130:dup             
	//   57  131:aload_0         
	//   58  132:getfield        #63  <Field SupportMenuInflater this$0>
	//   59  135:invokevirtual   #204 <Method Object SupportMenuInflater.getRealOwner()>
	//   60  138:aload_0         
	//   61  139:getfield        #187 <Field String itemListenerMethodName>
	//   62  142:invokespecial   #207 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
	//   63  145:invokeinterface #211 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   64  150:pop             
		}
		flag1 = menuitem instanceof MenuItemImpl;
	//   65  151:aload_1         
	//   66  152:instanceof      #213 <Class MenuItemImpl>
	//   67  155:istore          4
		if(flag1)
	//*  68  157:iload           4
	//*  69  159:ifeq            168
			obj = ((Object) ((MenuItemImpl)menuitem));
	//   70  162:aload_1         
	//   71  163:checkcast       #213 <Class MenuItemImpl>
	//   72  166:astore          5
		if(itemCheckable >= 2)
	//*  73  168:aload_0         
	//*  74  169:getfield        #164 <Field int itemCheckable>
	//*  75  172:iconst_2        
	//*  76  173:icmplt          207
			if(flag1)
	//*  77  176:iload           4
	//*  78  178:ifeq            192
				((MenuItemImpl)menuitem).setExclusiveCheckable(true);
	//   79  181:aload_1         
	//   80  182:checkcast       #213 <Class MenuItemImpl>
	//   81  185:iconst_1        
	//   82  186:invokevirtual   #216 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			else
	//*  83  189:goto            207
			if(menuitem instanceof MenuItemWrapperICS)
	//*  84  192:aload_1         
	//*  85  193:instanceof      #218 <Class MenuItemWrapperICS>
	//*  86  196:ifeq            207
				((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
	//   87  199:aload_1         
	//   88  200:checkcast       #218 <Class MenuItemWrapperICS>
	//   89  203:iconst_1        
	//   90  204:invokevirtual   #219 <Method void MenuItemWrapperICS.setExclusiveCheckable(boolean)>
		if(itemActionViewClassName != null)
	//*  91  207:aload_0         
	//*  92  208:getfield        #221 <Field String itemActionViewClassName>
	//*  93  211:ifnull          244
		{
			menuitem.setActionView((View)newInstance(itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
	//   94  214:aload_1         
	//   95  215:aload_0         
	//   96  216:aload_0         
	//   97  217:getfield        #221 <Field String itemActionViewClassName>
	//   98  220:getstatic       #225 <Field Class[] SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//   99  223:aload_0         
	//  100  224:getfield        #63  <Field SupportMenuInflater this$0>
	//  101  227:getfield        #229 <Field Object[] SupportMenuInflater.mActionViewConstructorArguments>
	//  102  230:invokespecial   #231 <Method Object newInstance(String, Class[], Object[])>
	//  103  233:checkcast       #233 <Class View>
	//  104  236:invokeinterface #237 <Method MenuItem MenuItem.setActionView(View)>
	//  105  241:pop             
			flag = true;
	//  106  242:iconst_1        
	//  107  243:istore_2        
		}
		if(itemActionViewLayout > 0)
	//* 108  244:aload_0         
	//* 109  245:getfield        #239 <Field int itemActionViewLayout>
	//* 110  248:ifle            277
			if(!flag)
	//* 111  251:iload_2         
	//* 112  252:ifne            269
				menuitem.setActionView(itemActionViewLayout);
	//  113  255:aload_1         
	//  114  256:aload_0         
	//  115  257:getfield        #239 <Field int itemActionViewLayout>
	//  116  260:invokeinterface #241 <Method MenuItem MenuItem.setActionView(int)>
	//  117  265:pop             
			else
	//* 118  266:goto            277
				Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
	//  119  269:ldc1            #130 <String "SupportMenuInflater">
	//  120  271:ldc1            #243 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
	//  121  273:invokestatic    #246 <Method int Log.w(String, String)>
	//  122  276:pop             
		if(itemActionProvider != null)
	//* 123  277:aload_0         
	//* 124  278:getfield        #248 <Field ActionProvider itemActionProvider>
	//* 125  281:ifnull          293
			MenuItemCompat.setActionProvider(menuitem, itemActionProvider);
	//  126  284:aload_1         
	//  127  285:aload_0         
	//  128  286:getfield        #248 <Field ActionProvider itemActionProvider>
	//  129  289:invokestatic    #254 <Method MenuItem MenuItemCompat.setActionProvider(MenuItem, ActionProvider)>
	//  130  292:pop             
		MenuItemCompat.setContentDescription(menuitem, itemContentDescription);
	//  131  293:aload_1         
	//  132  294:aload_0         
	//  133  295:getfield        #256 <Field CharSequence itemContentDescription>
	//  134  298:invokestatic    #260 <Method void MenuItemCompat.setContentDescription(MenuItem, CharSequence)>
		MenuItemCompat.setTooltipText(menuitem, itemTooltipText);
	//  135  301:aload_1         
	//  136  302:aload_0         
	//  137  303:getfield        #262 <Field CharSequence itemTooltipText>
	//  138  306:invokestatic    #265 <Method void MenuItemCompat.setTooltipText(MenuItem, CharSequence)>
		MenuItemCompat.setAlphabeticShortcut(menuitem, itemAlphabeticShortcut, itemAlphabeticModifiers);
	//  139  309:aload_1         
	//  140  310:aload_0         
	//  141  311:getfield        #267 <Field char itemAlphabeticShortcut>
	//  142  314:aload_0         
	//  143  315:getfield        #269 <Field int itemAlphabeticModifiers>
	//  144  318:invokestatic    #273 <Method void MenuItemCompat.setAlphabeticShortcut(MenuItem, char, int)>
		MenuItemCompat.setNumericShortcut(menuitem, itemNumericShortcut, itemNumericModifiers);
	//  145  321:aload_1         
	//  146  322:aload_0         
	//  147  323:getfield        #275 <Field char itemNumericShortcut>
	//  148  326:aload_0         
	//  149  327:getfield        #277 <Field int itemNumericModifiers>
	//  150  330:invokestatic    #280 <Method void MenuItemCompat.setNumericShortcut(MenuItem, char, int)>
		if(itemIconTintMode != null)
	//* 151  333:aload_0         
	//* 152  334:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//* 153  337:ifnull          348
			MenuItemCompat.setIconTintMode(menuitem, itemIconTintMode);
	//  154  340:aload_1         
	//  155  341:aload_0         
	//  156  342:getfield        #70  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//  157  345:invokestatic    #284 <Method void MenuItemCompat.setIconTintMode(MenuItem, android.graphics.PorterDuff$Mode)>
		if(itemIconTintList != null)
	//* 158  348:aload_0         
	//* 159  349:getfield        #68  <Field ColorStateList itemIconTintList>
	//* 160  352:ifnull          363
			MenuItemCompat.setIconTintList(menuitem, itemIconTintList);
	//  161  355:aload_1         
	//  162  356:aload_0         
	//  163  357:getfield        #68  <Field ColorStateList itemIconTintList>
	//  164  360:invokestatic    #288 <Method void MenuItemCompat.setIconTintList(MenuItem, ColorStateList)>
	//  165  363:return          
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
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #379 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #381 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #384 <Method void Runtime(String)>
	//    4   10:athrow          
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
