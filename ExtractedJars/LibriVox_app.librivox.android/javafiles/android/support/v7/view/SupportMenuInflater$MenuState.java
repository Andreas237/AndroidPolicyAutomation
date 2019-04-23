// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v4.view.d;
import android.support.v4.view.q;
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
	//    6    8:invokevirtual   #81  <Method char String.charAt(int)>
	//    7   11:ireturn         
	}

	private Object newInstance(String s, Class aclass[], Object aobj[])
	{
		try
		{
			aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #91  <Field Context SupportMenuInflater.mContext>
	//    3    7:invokevirtual   #97  <Method ClassLoader Context.getClassLoader()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #103 <Method Class ClassLoader.loadClass(String)>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #109 <Method Constructor Class.getConstructor(Class[])>
	//    8   18:astore_2        
			((Constructor) (aclass)).setAccessible(true);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #115 <Method void Constructor.setAccessible(boolean)>
			aclass = ((Class []) (((Constructor) (aclass)).newInstance(aobj)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #118 <Method Object Constructor.newInstance(Object[])>
	//   15   29:astore_2        
		}
	//*  16   30:aload_2         
	//*  17   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Class aclass[])
	//*  18   32:astore_2        
		{
			aobj = ((Object []) (new StringBuilder()));
	//   19   33:new             #120 <Class StringBuilder>
	//   20   36:dup             
	//   21   37:invokespecial   #121 <Method void StringBuilder()>
	//   22   40:astore_3        
			((StringBuilder) (aobj)).append("Cannot instantiate class: ");
	//   23   41:aload_3         
	//   24   42:ldc1            #123 <String "Cannot instantiate class: ">
	//   25   44:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
			((StringBuilder) (aobj)).append(s);
	//   27   48:aload_3         
	//   28   49:aload_1         
	//   29   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
			Log.w("SupportMenuInflater", ((StringBuilder) (aobj)).toString(), ((Throwable) (aclass)));
	//   31   54:ldc1            #129 <String "SupportMenuInflater">
	//   32   56:aload_3         
	//   33   57:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   34   60:aload_2         
	//   35   61:invokestatic    #139 <Method int Log.w(String, String, Throwable)>
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
	//    2    2:getfield        #143 <Field boolean itemChecked>
	//    3    5:invokeinterface #149 <Method MenuItem MenuItem.setChecked(boolean)>
	//    4   10:aload_0         
	//    5   11:getfield        #151 <Field boolean itemVisible>
	//    6   14:invokeinterface #154 <Method MenuItem MenuItem.setVisible(boolean)>
	//    7   19:aload_0         
	//    8   20:getfield        #156 <Field boolean itemEnabled>
	//    9   23:invokeinterface #159 <Method MenuItem MenuItem.setEnabled(boolean)>
	//   10   28:astore          5
		int i = itemCheckable;
	//   11   30:aload_0         
	//   12   31:getfield        #161 <Field int itemCheckable>
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
	//   26   55:invokeinterface #164 <Method MenuItem MenuItem.setCheckable(boolean)>
	//   27   60:aload_0         
	//   28   61:getfield        #166 <Field CharSequence itemTitleCondensed>
	//   29   64:invokeinterface #170 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
	//   30   69:aload_0         
	//   31   70:getfield        #172 <Field int itemIconResId>
	//   32   73:invokeinterface #176 <Method MenuItem MenuItem.setIcon(int)>
	//   33   78:pop             
		i = itemShowAsAction;
	//   34   79:aload_0         
	//   35   80:getfield        #178 <Field int itemShowAsAction>
	//   36   83:istore_3        
		if(i >= 0)
	//*  37   84:iload_3         
	//*  38   85:iflt            95
			menuitem.setShowAsAction(i);
	//   39   88:aload_1         
	//   40   89:iload_3         
	//   41   90:invokeinterface #182 <Method void MenuItem.setShowAsAction(int)>
		if(itemListenerMethodName != null)
	//*  42   95:aload_0         
	//*  43   96:getfield        #184 <Field String itemListenerMethodName>
	//*  44   99:ifnull          153
			if(!mContext.isRestricted())
	//*  45  102:aload_0         
	//*  46  103:getfield        #60  <Field SupportMenuInflater this$0>
	//*  47  106:getfield        #91  <Field Context SupportMenuInflater.mContext>
	//*  48  109:invokevirtual   #188 <Method boolean Context.isRestricted()>
	//*  49  112:ifne            143
				menuitem.setOnMenuItemClickListener(((android.view.er) (new MenuItemClickListener(getRealOwner(), itemListenerMethodName))));
	//   50  115:aload_1         
	//   51  116:new             #190 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
	//   52  119:dup             
	//   53  120:aload_0         
	//   54  121:getfield        #60  <Field SupportMenuInflater this$0>
	//   55  124:invokevirtual   #194 <Method Object SupportMenuInflater.getRealOwner()>
	//   56  127:aload_0         
	//   57  128:getfield        #184 <Field String itemListenerMethodName>
	//   58  131:invokespecial   #197 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
	//   59  134:invokeinterface #201 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   60  139:pop             
			else
	//*  61  140:goto            153
				throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
	//   62  143:new             #203 <Class IllegalStateException>
	//   63  146:dup             
	//   64  147:ldc1            #205 <String "The android:onClick attribute cannot be used within a restricted context">
	//   65  149:invokespecial   #208 <Method void IllegalStateException(String)>
	//   66  152:athrow          
		flag1 = menuitem instanceof MenuItemImpl;
	//   67  153:aload_1         
	//   68  154:instanceof      #210 <Class MenuItemImpl>
	//   69  157:istore          4
		if(flag1)
	//*  70  159:iload           4
	//*  71  161:ifeq            170
			obj = ((Object) ((MenuItemImpl)menuitem));
	//   72  164:aload_1         
	//   73  165:checkcast       #210 <Class MenuItemImpl>
	//   74  168:astore          5
		if(itemCheckable >= 2)
	//*  75  170:aload_0         
	//*  76  171:getfield        #161 <Field int itemCheckable>
	//*  77  174:iconst_2        
	//*  78  175:icmplt          209
			if(flag1)
	//*  79  178:iload           4
	//*  80  180:ifeq            194
				((MenuItemImpl)menuitem).setExclusiveCheckable(true);
	//   81  183:aload_1         
	//   82  184:checkcast       #210 <Class MenuItemImpl>
	//   83  187:iconst_1        
	//   84  188:invokevirtual   #213 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			else
	//*  85  191:goto            209
			if(menuitem instanceof MenuItemWrapperICS)
	//*  86  194:aload_1         
	//*  87  195:instanceof      #215 <Class MenuItemWrapperICS>
	//*  88  198:ifeq            209
				((MenuItemWrapperICS)menuitem).setExclusiveCheckable(true);
	//   89  201:aload_1         
	//   90  202:checkcast       #215 <Class MenuItemWrapperICS>
	//   91  205:iconst_1        
	//   92  206:invokevirtual   #216 <Method void MenuItemWrapperICS.setExclusiveCheckable(boolean)>
		obj = ((Object) (itemActionViewClassName));
	//   93  209:aload_0         
	//   94  210:getfield        #218 <Field String itemActionViewClassName>
	//   95  213:astore          5
		if(obj != null)
	//*  96  215:aload           5
	//*  97  217:ifnull          248
		{
			menuitem.setActionView((View)newInstance(((String) (obj)), SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
	//   98  220:aload_1         
	//   99  221:aload_0         
	//  100  222:aload           5
	//  101  224:getstatic       #222 <Field Class[] SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//  102  227:aload_0         
	//  103  228:getfield        #60  <Field SupportMenuInflater this$0>
	//  104  231:getfield        #226 <Field Object[] SupportMenuInflater.mActionViewConstructorArguments>
	//  105  234:invokespecial   #228 <Method Object newInstance(String, Class[], Object[])>
	//  106  237:checkcast       #230 <Class View>
	//  107  240:invokeinterface #234 <Method MenuItem MenuItem.setActionView(View)>
	//  108  245:pop             
			flag = true;
	//  109  246:iconst_1        
	//  110  247:istore_2        
		}
		i = itemActionViewLayout;
	//  111  248:aload_0         
	//  112  249:getfield        #236 <Field int itemActionViewLayout>
	//  113  252:istore_3        
		if(i > 0)
	//* 114  253:iload_3         
	//* 115  254:ifle            280
			if(!flag)
	//* 116  257:iload_2         
	//* 117  258:ifne            272
				menuitem.setActionView(i);
	//  118  261:aload_1         
	//  119  262:iload_3         
	//  120  263:invokeinterface #238 <Method MenuItem MenuItem.setActionView(int)>
	//  121  268:pop             
			else
	//* 122  269:goto            280
				Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
	//  123  272:ldc1            #129 <String "SupportMenuInflater">
	//  124  274:ldc1            #240 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
	//  125  276:invokestatic    #243 <Method int Log.w(String, String)>
	//  126  279:pop             
		obj = ((Object) (itemActionProvider));
	//  127  280:aload_0         
	//  128  281:getfield        #245 <Field d itemActionProvider>
	//  129  284:astore          5
		if(obj != null)
	//* 130  286:aload           5
	//* 131  288:ifnull          298
			q.a(menuitem, ((d) (obj)));
	//  132  291:aload_1         
	//  133  292:aload           5
	//  134  294:invokestatic    #251 <Method MenuItem q.a(MenuItem, d)>
	//  135  297:pop             
		q.a(menuitem, itemContentDescription);
	//  136  298:aload_1         
	//  137  299:aload_0         
	//  138  300:getfield        #253 <Field CharSequence itemContentDescription>
	//  139  303:invokestatic    #256 <Method void q.a(MenuItem, CharSequence)>
		q.b(menuitem, itemTooltipText);
	//  140  306:aload_1         
	//  141  307:aload_0         
	//  142  308:getfield        #258 <Field CharSequence itemTooltipText>
	//  143  311:invokestatic    #261 <Method void q.b(MenuItem, CharSequence)>
		q.b(menuitem, itemAlphabeticShortcut, itemAlphabeticModifiers);
	//  144  314:aload_1         
	//  145  315:aload_0         
	//  146  316:getfield        #263 <Field char itemAlphabeticShortcut>
	//  147  319:aload_0         
	//  148  320:getfield        #265 <Field int itemAlphabeticModifiers>
	//  149  323:invokestatic    #268 <Method void q.b(MenuItem, char, int)>
		q.a(menuitem, itemNumericShortcut, itemNumericModifiers);
	//  150  326:aload_1         
	//  151  327:aload_0         
	//  152  328:getfield        #270 <Field char itemNumericShortcut>
	//  153  331:aload_0         
	//  154  332:getfield        #272 <Field int itemNumericModifiers>
	//  155  335:invokestatic    #274 <Method void q.a(MenuItem, char, int)>
		obj = ((Object) (itemIconTintMode));
	//  156  338:aload_0         
	//  157  339:getfield        #67  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
	//  158  342:astore          5
		if(obj != null)
	//* 159  344:aload           5
	//* 160  346:ifnull          355
			q.a(menuitem, ((android.graphics.PorterDuff.Mode) (obj)));
	//  161  349:aload_1         
	//  162  350:aload           5
	//  163  352:invokestatic    #277 <Method void q.a(MenuItem, android.graphics.PorterDuff$Mode)>
		obj = ((Object) (itemIconTintList));
	//  164  355:aload_0         
	//  165  356:getfield        #65  <Field ColorStateList itemIconTintList>
	//  166  359:astore          5
		if(obj != null)
	//* 167  361:aload           5
	//* 168  363:ifnull          372
			q.a(menuitem, ((ColorStateList) (obj)));
	//  169  366:aload_1         
	//  170  367:aload           5
	//  171  369:invokestatic    #280 <Method void q.a(MenuItem, ColorStateList)>
	//  172  372:return          
	}

	public void addItem()
	{
		itemAdded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #283 <Field boolean itemAdded>
		setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #69  <Field Menu menu>
	//    6   10:aload_0         
	//    7   11:getfield        #285 <Field int groupId>
	//    8   14:aload_0         
	//    9   15:getfield        #287 <Field int itemId>
	//   10   18:aload_0         
	//   11   19:getfield        #289 <Field int itemCategoryOrder>
	//   12   22:aload_0         
	//   13   23:getfield        #291 <Field CharSequence itemTitle>
	//   14   26:invokeinterface #297 <Method MenuItem Menu.add(int, int, int, CharSequence)>
	//   15   31:invokespecial   #299 <Method void setItem(MenuItem)>
	//   16   34:return          
	}

	public SubMenu addSubMenuItem()
	{
		itemAdded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #283 <Field boolean itemAdded>
		SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field Menu menu>
	//    5    9:aload_0         
	//    6   10:getfield        #285 <Field int groupId>
	//    7   13:aload_0         
	//    8   14:getfield        #287 <Field int itemId>
	//    9   17:aload_0         
	//   10   18:getfield        #289 <Field int itemCategoryOrder>
	//   11   21:aload_0         
	//   12   22:getfield        #291 <Field CharSequence itemTitle>
	//   13   25:invokeinterface #305 <Method SubMenu Menu.addSubMenu(int, int, int, CharSequence)>
	//   14   30:astore_1        
		setItem(submenu.getItem());
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokeinterface #311 <Method MenuItem SubMenu.getItem()>
	//   18   38:invokespecial   #299 <Method void setItem(MenuItem)>
		return submenu;
	//   19   41:aload_1         
	//   20   42:areturn         
	}

	public boolean hasAddedItem()
	{
		return itemAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field boolean itemAdded>
	//    2    4:ireturn         
	}

	public void readGroup(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuGroup)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SupportMenuInflater this$0>
	//    2    4:getfield        #91  <Field Context SupportMenuInflater.mContext>
	//    3    7:aload_1         
	//    4    8:getstatic       #320 <Field int[] android.support.v7.appcompat.R$styleable.MenuGroup>
	//    5   11:invokevirtual   #324 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    6   14:astore_1        
		groupId = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuGroup_android_id, 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getstatic       #327 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_id>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #333 <Method int TypedArray.getResourceId(int, int)>
	//   12   24:putfield        #285 <Field int groupId>
		groupCategory = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_menuCategory, 0);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getstatic       #336 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_menuCategory>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #339 <Method int TypedArray.getInt(int, int)>
	//   18   36:putfield        #341 <Field int groupCategory>
		groupOrder = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_orderInCategory, 0);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getstatic       #344 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_orderInCategory>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #339 <Method int TypedArray.getInt(int, int)>
	//   24   48:putfield        #346 <Field int groupOrder>
		groupCheckable = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.MenuGroup_android_checkableBehavior, 0);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:getstatic       #349 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_checkableBehavior>
	//   28   56:iconst_0        
	//   29   57:invokevirtual   #339 <Method int TypedArray.getInt(int, int)>
	//   30   60:putfield        #351 <Field int groupCheckable>
		groupVisible = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_visible, true);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getstatic       #354 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_visible>
	//   34   68:iconst_1        
	//   35   69:invokevirtual   #358 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   36   72:putfield        #360 <Field boolean groupVisible>
		groupEnabled = ((TypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuGroup_android_enabled, true);
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:getstatic       #363 <Field int android.support.v7.appcompat.R$styleable.MenuGroup_android_enabled>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #358 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   42   84:putfield        #365 <Field boolean groupEnabled>
		((TypedArray) (attributeset)).recycle();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #368 <Method void TypedArray.recycle()>
	//   45   91:return          
	}

	public void readItem(AttributeSet attributeset)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #371 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #373 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #376 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void resetGroup()
	{
		groupId = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #285 <Field int groupId>
		groupCategory = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #341 <Field int groupCategory>
		groupOrder = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #346 <Field int groupOrder>
		groupCheckable = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #351 <Field int groupCheckable>
		groupVisible = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #360 <Field boolean groupVisible>
		groupEnabled = true;
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:putfield        #365 <Field boolean groupEnabled>
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
	d itemActionProvider;
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
	//    2    2:putfield        #60  <Field SupportMenuInflater this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #63  <Method void Object()>
		itemIconTintList = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #65  <Field ColorStateList itemIconTintList>
		itemIconTintMode = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #67  <Field android.graphics.PorterDuff$Mode itemIconTintMode>
		menu = menu1;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #69  <Field Menu menu>
		resetGroup();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #72  <Method void resetGroup()>
	//   16   28:return          
	}
}
