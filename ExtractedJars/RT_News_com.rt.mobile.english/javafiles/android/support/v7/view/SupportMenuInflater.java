// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.*;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.util.*;
import android.view.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SupportMenuInflater extends MenuInflater
{
	private static class InflatedOnMenuItemClickListener
		implements android.view.MenuItem.OnMenuItemClickListener
	{

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			try
			{
				if(mMethod.getReturnType() == Boolean.TYPE)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field Method mMethod>
		//*   2    4:invokevirtual   #77  <Method Class Method.getReturnType()>
		//*   3    7:getstatic       #83  <Field Class Boolean.TYPE>
		//*   4   10:if_acmpne       39
					return ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
						menuitem
					})).booleanValue();
		//    5   13:aload_0         
		//    6   14:getfield        #43  <Field Method mMethod>
		//    7   17:aload_0         
		//    8   18:getfield        #33  <Field Object mRealOwner>
		//    9   21:iconst_1        
		//   10   22:anewarray       Object[]
		//   11   25:dup             
		//   12   26:iconst_0        
		//   13   27:aload_1         
		//   14   28:aastore         
		//   15   29:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
		//   16   32:checkcast       #79  <Class Boolean>
		//   17   35:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
		//   18   38:ireturn         
				mMethod.invoke(mRealOwner, new Object[] {
					menuitem
				});
		//   19   39:aload_0         
		//   20   40:getfield        #43  <Field Method mMethod>
		//   21   43:aload_0         
		//   22   44:getfield        #33  <Field Object mRealOwner>
		//   23   47:iconst_1        
		//   24   48:anewarray       Object[]
		//   25   51:dup             
		//   26   52:iconst_0        
		//   27   53:aload_1         
		//   28   54:aastore         
		//   29   55:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
		//   30   58:pop             
			}
		//*  31   59:iconst_1        
		//*  32   60:ireturn         
			// Misplaced declaration of an exception variable
			catch(MenuItem menuitem)
		//*  33   61:astore_1        
			{
				throw new RuntimeException(((Throwable) (menuitem)));
		//   34   62:new             #93  <Class RuntimeException>
		//   35   65:dup             
		//   36   66:aload_1         
		//   37   67:invokespecial   #96  <Method void RuntimeException(Throwable)>
		//   38   70:athrow          
			}
			return true;
		}

		private static final Class PARAM_TYPES[] = {
			android/view/MenuItem
		};
		private Method mMethod;
		private Object mRealOwner;

		static 
		{
		//    0    0:iconst_1        
		//    1    1:anewarray       Class[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:ldc1            #22  <Class MenuItem>
		//    5    8:aastore         
		//    6    9:putstatic       #24  <Field Class[] PARAM_TYPES>
		//*   7   12:return          
		}

		public InflatedOnMenuItemClickListener(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mRealOwner = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field Object mRealOwner>
			Class class1 = obj.getClass();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #37  <Method Class Object.getClass()>
		//    7   13:astore_3        
			try
			{
				mMethod = class1.getMethod(s, PARAM_TYPES);
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:aload_2         
		//   11   17:getstatic       #24  <Field Class[] PARAM_TYPES>
		//   12   20:invokevirtual   #41  <Method Method Class.getMethod(String, Class[])>
		//   13   23:putfield        #43  <Field Method mMethod>
				return;
		//   14   26:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  15   27:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   16   28:new             #45  <Class StringBuilder>
		//   17   31:dup             
		//   18   32:invokespecial   #46  <Method void StringBuilder()>
		//   19   35:astore          4
				stringbuilder.append("Couldn't resolve menu item onClick handler ");
		//   20   37:aload           4
		//   21   39:ldc1            #48  <String "Couldn't resolve menu item onClick handler ">
		//   22   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   23   44:pop             
				stringbuilder.append(s);
		//   24   45:aload           4
		//   25   47:aload_2         
		//   26   48:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   27   51:pop             
				stringbuilder.append(" in class ");
		//   28   52:aload           4
		//   29   54:ldc1            #54  <String " in class ">
		//   30   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   31   59:pop             
				stringbuilder.append(class1.getName());
		//   32   60:aload           4
		//   33   62:aload_3         
		//   34   63:invokevirtual   #58  <Method String Class.getName()>
		//   35   66:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   36   69:pop             
				s = ((String) (new InflateException(stringbuilder.toString())));
		//   37   70:new             #60  <Class InflateException>
		//   38   73:dup             
		//   39   74:aload           4
		//   40   76:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   41   79:invokespecial   #66  <Method void InflateException(String)>
		//   42   82:astore_2        
				((InflateException) (s)).initCause(((Throwable) (obj)));
		//   43   83:aload_2         
		//   44   84:aload_1         
		//   45   85:invokevirtual   #70  <Method Throwable InflateException.initCause(Throwable)>
		//   46   88:pop             
				throw s;
		//   47   89:aload_2         
		//   48   90:athrow          
			}
		}
	}

	private class MenuState
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
				menuitem.setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (new InflatedOnMenuItemClickListener(getRealOwner(), itemListenerMethodName))));
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

		public MenuState(Menu menu1)
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


	public SupportMenuInflater(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void MenuInflater(Context)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #58  <Field Context mContext>
		mActionViewConstructorArguments = (new Object[] {
			context
		});
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:aastore         
	//   13   19:putfield        #62  <Field Object[] mActionViewConstructorArguments>
		mActionProviderConstructorArguments = mActionViewConstructorArguments;
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:getfield        #62  <Field Object[] mActionViewConstructorArguments>
	//   17   27:putfield        #64  <Field Object[] mActionProviderConstructorArguments>
	//   18   30:return          
	}

	private Object findRealOwner(Object obj)
	{
		if(obj instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #68  <Class Activity>
	//*   2    4:ifeq            9
			return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(obj instanceof ContextWrapper)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #70  <Class ContextWrapper>
	//*   7   13:ifeq            28
			return findRealOwner(((Object) (((ContextWrapper)obj).getBaseContext())));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #70  <Class ContextWrapper>
	//   11   21:invokevirtual   #74  <Method Context ContextWrapper.getBaseContext()>
	//   12   24:invokespecial   #76  <Method Object findRealOwner(Object)>
	//   13   27:areturn         
		else
			return obj;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	private void parseMenu(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
		throws XmlPullParserException, IOException
	{
		MenuState menustate = new MenuState(menu);
	//    0    0:new             #9   <Class SupportMenuInflater$MenuState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokespecial   #85  <Method void SupportMenuInflater$MenuState(SupportMenuInflater, Menu)>
	//    5    9:astore          10
		int i = xmlpullparser.getEventType();
	//    6   11:aload_1         
	//    7   12:invokeinterface #91  <Method int XmlPullParser.getEventType()>
	//    8   17:istore          4
		do
		{
			if(i == 2)
	//*   9   19:iload           4
	//*  10   21:iconst_2        
	//*  11   22:icmpne          85
			{
				menu = ((Menu) (xmlpullparser.getName()));
	//   12   25:aload_1         
	//   13   26:invokeinterface #95  <Method String XmlPullParser.getName()>
	//   14   31:astore_3        
				if(((String) (menu)).equals("menu"))
	//*  15   32:aload_3         
	//*  16   33:ldc1            #34  <String "menu">
	//*  17   35:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  18   38:ifeq            52
				{
					i = xmlpullparser.next();
	//   19   41:aload_1         
	//   20   42:invokeinterface #104 <Method int XmlPullParser.next()>
	//   21   47:istore          4
				} else
	//*  22   49:goto            107
				{
					xmlpullparser = ((XmlPullParser) (new StringBuilder()));
	//   23   52:new             #106 <Class StringBuilder>
	//   24   55:dup             
	//   25   56:invokespecial   #108 <Method void StringBuilder()>
	//   26   59:astore_1        
					((StringBuilder) (xmlpullparser)).append("Expecting menu, got ");
	//   27   60:aload_1         
	//   28   61:ldc1            #110 <String "Expecting menu, got ">
	//   29   63:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
					((StringBuilder) (xmlpullparser)).append(((String) (menu)));
	//   31   67:aload_1         
	//   32   68:aload_3         
	//   33   69:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
					throw new RuntimeException(((StringBuilder) (xmlpullparser)).toString());
	//   35   73:new             #116 <Class RuntimeException>
	//   36   76:dup             
	//   37   77:aload_1         
	//   38   78:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   39   81:invokespecial   #122 <Method void RuntimeException(String)>
	//   40   84:athrow          
				}
				break;
			}
			int j = xmlpullparser.next();
	//   41   85:aload_1         
	//   42   86:invokeinterface #104 <Method int XmlPullParser.next()>
	//   43   91:istore          5
			i = j;
	//   44   93:iload           5
	//   45   95:istore          4
			if(j != 1)
				continue;
	//   46   97:iload           5
	//   47   99:iconst_1        
	//   48  100:icmpne          19
			i = j;
	//   49  103:iload           5
	//   50  105:istore          4
			break;
		} while(true);
		Menu menu1 = null;
	//   51  107:aconst_null     
	//   52  108:astore          9
		boolean flag1 = false;
	//   53  110:iconst_0        
	//   54  111:istore          5
		boolean flag2 = flag1;
	//   55  113:iload           5
	//   56  115:istore          6
		int k = i;
	//   57  117:iload           4
	//   58  119:istore          8
		boolean flag3;
		for(; !flag1; flag1 = flag3)
	//*  59  121:iload           5
	//*  60  123:ifne            515
		{
			boolean flag;
			switch(k)
	//*  61  126:iload           8
			{
	//*  62  128:tableswitch     1 3: default 156
	//	               1 483
	//	               2 355
	//	               3 170
			default:
				flag = flag2;
	//   63  156:iload           6
	//   64  158:istore          4
				menu = menu1;
	//   65  160:aload           9
	//   66  162:astore_3        
				flag3 = flag1;
	//   67  163:iload           5
	//   68  165:istore          7
				break;
	//   69  167:goto            493

			case 3: // '\003'
				String s = xmlpullparser.getName();
	//   70  170:aload_1         
	//   71  171:invokeinterface #95  <Method String XmlPullParser.getName()>
	//   72  176:astore          11
				if(flag2 && s.equals(((Object) (menu1))))
	//*  73  178:iload           6
	//*  74  180:ifeq            205
	//*  75  183:aload           11
	//*  76  185:aload           9
	//*  77  187:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  78  190:ifeq            205
				{
					menu = null;
	//   79  193:aconst_null     
	//   80  194:astore_3        
					flag = false;
	//   81  195:iconst_0        
	//   82  196:istore          4
					flag3 = flag1;
	//   83  198:iload           5
	//   84  200:istore          7
					break;
	//   85  202:goto            493
				}
				if(s.equals("group"))
	//*  86  205:aload           11
	//*  87  207:ldc1            #28  <String "group">
	//*  88  209:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  89  212:ifeq            234
				{
					menustate.resetGroup();
	//   90  215:aload           10
	//   91  217:invokevirtual   #125 <Method void SupportMenuInflater$MenuState.resetGroup()>
					flag = flag2;
	//   92  220:iload           6
	//   93  222:istore          4
					menu = menu1;
	//   94  224:aload           9
	//   95  226:astore_3        
					flag3 = flag1;
	//   96  227:iload           5
	//   97  229:istore          7
					break;
	//   98  231:goto            493
				}
				if(s.equals("item"))
	//*  99  234:aload           11
	//* 100  236:ldc1            #31  <String "item">
	//* 101  238:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 102  241:ifeq            321
				{
					flag = flag2;
	//  103  244:iload           6
	//  104  246:istore          4
					menu = menu1;
	//  105  248:aload           9
	//  106  250:astore_3        
					flag3 = flag1;
	//  107  251:iload           5
	//  108  253:istore          7
					if(menustate.hasAddedItem())
						break;
	//  109  255:aload           10
	//  110  257:invokevirtual   #129 <Method boolean SupportMenuInflater$MenuState.hasAddedItem()>
	//  111  260:ifne            493
					if(menustate.itemActionProvider != null && menustate.itemActionProvider.hasSubMenu())
	//* 112  263:aload           10
	//* 113  265:getfield        #133 <Field ActionProvider SupportMenuInflater$MenuState.itemActionProvider>
	//* 114  268:ifnull          302
	//* 115  271:aload           10
	//* 116  273:getfield        #133 <Field ActionProvider SupportMenuInflater$MenuState.itemActionProvider>
	//* 117  276:invokevirtual   #138 <Method boolean ActionProvider.hasSubMenu()>
	//* 118  279:ifeq            302
					{
						menustate.addSubMenuItem();
	//  119  282:aload           10
	//  120  284:invokevirtual   #142 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
	//  121  287:pop             
						flag = flag2;
	//  122  288:iload           6
	//  123  290:istore          4
						menu = menu1;
	//  124  292:aload           9
	//  125  294:astore_3        
						flag3 = flag1;
	//  126  295:iload           5
	//  127  297:istore          7
					} else
	//* 128  299:goto            493
					{
						menustate.addItem();
	//  129  302:aload           10
	//  130  304:invokevirtual   #145 <Method void SupportMenuInflater$MenuState.addItem()>
						flag = flag2;
	//  131  307:iload           6
	//  132  309:istore          4
						menu = menu1;
	//  133  311:aload           9
	//  134  313:astore_3        
						flag3 = flag1;
	//  135  314:iload           5
	//  136  316:istore          7
					}
					break;
	//  137  318:goto            493
				}
				flag = flag2;
	//  138  321:iload           6
	//  139  323:istore          4
				menu = menu1;
	//  140  325:aload           9
	//  141  327:astore_3        
				flag3 = flag1;
	//  142  328:iload           5
	//  143  330:istore          7
				if(s.equals("menu"))
	//* 144  332:aload           11
	//* 145  334:ldc1            #34  <String "menu">
	//* 146  336:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 147  339:ifeq            493
				{
					flag3 = true;
	//  148  342:iconst_1        
	//  149  343:istore          7
					flag = flag2;
	//  150  345:iload           6
	//  151  347:istore          4
					menu = menu1;
	//  152  349:aload           9
	//  153  351:astore_3        
				}
				break;
	//  154  352:goto            493

			case 2: // '\002'
				if(flag2)
	//* 155  355:iload           6
	//* 156  357:ifeq            374
				{
					flag = flag2;
	//  157  360:iload           6
	//  158  362:istore          4
					menu = menu1;
	//  159  364:aload           9
	//  160  366:astore_3        
					flag3 = flag1;
	//  161  367:iload           5
	//  162  369:istore          7
					break;
	//  163  371:goto            493
				}
				menu = ((Menu) (xmlpullparser.getName()));
	//  164  374:aload_1         
	//  165  375:invokeinterface #95  <Method String XmlPullParser.getName()>
	//  166  380:astore_3        
				if(((String) (menu)).equals("group"))
	//* 167  381:aload_3         
	//* 168  382:ldc1            #28  <String "group">
	//* 169  384:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 170  387:ifeq            410
				{
					menustate.readGroup(attributeset);
	//  171  390:aload           10
	//  172  392:aload_2         
	//  173  393:invokevirtual   #149 <Method void SupportMenuInflater$MenuState.readGroup(AttributeSet)>
					flag = flag2;
	//  174  396:iload           6
	//  175  398:istore          4
					menu = menu1;
	//  176  400:aload           9
	//  177  402:astore_3        
					flag3 = flag1;
	//  178  403:iload           5
	//  179  405:istore          7
					break;
	//  180  407:goto            493
				}
				if(((String) (menu)).equals("item"))
	//* 181  410:aload_3         
	//* 182  411:ldc1            #31  <String "item">
	//* 183  413:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 184  416:ifeq            439
				{
					menustate.readItem(attributeset);
	//  185  419:aload           10
	//  186  421:aload_2         
	//  187  422:invokevirtual   #152 <Method void SupportMenuInflater$MenuState.readItem(AttributeSet)>
					flag = flag2;
	//  188  425:iload           6
	//  189  427:istore          4
					menu = menu1;
	//  190  429:aload           9
	//  191  431:astore_3        
					flag3 = flag1;
	//  192  432:iload           5
	//  193  434:istore          7
					break;
	//  194  436:goto            493
				}
				if(((String) (menu)).equals("menu"))
	//* 195  439:aload_3         
	//* 196  440:ldc1            #34  <String "menu">
	//* 197  442:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 198  445:ifeq            473
				{
					parseMenu(xmlpullparser, attributeset, ((Menu) (menustate.addSubMenuItem())));
	//  199  448:aload_0         
	//  200  449:aload_1         
	//  201  450:aload_2         
	//  202  451:aload           10
	//  203  453:invokevirtual   #142 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
	//  204  456:invokespecial   #154 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
					flag = flag2;
	//  205  459:iload           6
	//  206  461:istore          4
					menu = menu1;
	//  207  463:aload           9
	//  208  465:astore_3        
					flag3 = flag1;
	//  209  466:iload           5
	//  210  468:istore          7
				} else
	//* 211  470:goto            493
				{
					flag = true;
	//  212  473:iconst_1        
	//  213  474:istore          4
					flag3 = flag1;
	//  214  476:iload           5
	//  215  478:istore          7
				}
				break;

	//* 216  480:goto            493
			case 1: // '\001'
				throw new RuntimeException("Unexpected end of document");
	//  217  483:new             #116 <Class RuntimeException>
	//  218  486:dup             
	//  219  487:ldc1            #156 <String "Unexpected end of document">
	//  220  489:invokespecial   #122 <Method void RuntimeException(String)>
	//  221  492:athrow          
			}
			k = xmlpullparser.next();
	//  222  493:aload_1         
	//  223  494:invokeinterface #104 <Method int XmlPullParser.next()>
	//  224  499:istore          8
			flag2 = flag;
	//  225  501:iload           4
	//  226  503:istore          6
			menu1 = menu;
	//  227  505:aload_3         
	//  228  506:astore          9
		}

	//  229  508:iload           7
	//  230  510:istore          5
	//* 231  512:goto            121
	//  232  515:return          
	}

	Object getRealOwner()
	{
		if(mRealOwner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field Object mRealOwner>
	//*   2    4:ifnonnull       19
			mRealOwner = findRealOwner(((Object) (mContext)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field Context mContext>
	//    7   13:invokespecial   #76  <Method Object findRealOwner(Object)>
	//    8   16:putfield        #161 <Field Object mRealOwner>
		return mRealOwner;
	//    9   19:aload_0         
	//   10   20:getfield        #161 <Field Object mRealOwner>
	//   11   23:areturn         
	}

	public void inflate(int i, Menu menu)
	{
		XmlResourceParser xmlresourceparser;
		Object obj;
		Object obj1;
		if(!(menu instanceof SupportMenu))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #166 <Class SupportMenu>
	//*   2    4:ifne            14
		{
			super.inflate(i, menu);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #168 <Method void MenuInflater.inflate(int, Menu)>
			return;
	//    7   13:return          
		}
		obj = null;
	//    8   14:aconst_null     
	//    9   15:astore          5
		obj1 = null;
	//   10   17:aconst_null     
	//   11   18:astore          6
		xmlresourceparser = null;
	//   12   20:aconst_null     
	//   13   21:astore_3        
		XmlResourceParser xmlresourceparser1 = mContext.getResources().getLayout(i);
	//   14   22:aload_0         
	//   15   23:getfield        #58  <Field Context mContext>
	//   16   26:invokevirtual   #172 <Method Resources Context.getResources()>
	//   17   29:iload_1         
	//   18   30:invokevirtual   #178 <Method XmlResourceParser Resources.getLayout(int)>
	//   19   33:astore          4
		parseMenu(((XmlPullParser) (xmlresourceparser1)), Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser1))), menu);
	//   20   35:aload_0         
	//   21   36:aload           4
	//   22   38:aload           4
	//   23   40:invokestatic    #184 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   24   43:aload_2         
	//   25   44:invokespecial   #154 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
		if(xmlresourceparser1 != null)
	//*  26   47:aload           4
	//*  27   49:ifnull          59
			xmlresourceparser1.close();
	//   28   52:aload           4
	//   29   54:invokeinterface #189 <Method void XmlResourceParser.close()>
		return;
	//   30   59:return          
		menu;
	//   31   60:astore_2        
		xmlresourceparser = xmlresourceparser1;
	//   32   61:aload           4
	//   33   63:astore_3        
		  goto _L1
	//*  34   64:goto            111
		menu;
	//   35   67:astore_2        
		xmlresourceparser = xmlresourceparser1;
	//   36   68:aload           4
	//   37   70:astore_3        
		  goto _L2
	//*  38   71:goto            89
		menu;
	//   39   74:astore_2        
		xmlresourceparser = xmlresourceparser1;
	//   40   75:aload           4
	//   41   77:astore_3        
		  goto _L3
	//*  42   78:goto            100
		menu;
	//   43   81:astore_2        
		  goto _L1
	//*  44   82:goto            111
		menu;
	//   45   85:astore_2        
		xmlresourceparser = ((XmlResourceParser) (obj));
	//   46   86:aload           5
	//   47   88:astore_3        
_L2:
		throw new InflateException("Error inflating menu XML", ((Throwable) (menu)));
	//   48   89:new             #191 <Class InflateException>
	//   49   92:dup             
	//   50   93:ldc1            #193 <String "Error inflating menu XML">
	//   51   95:aload_2         
	//   52   96:invokespecial   #196 <Method void InflateException(String, Throwable)>
	//   53   99:athrow          
_L3:
		throw new InflateException("Error inflating menu XML", ((Throwable) (menu)));
	//   54  100:new             #191 <Class InflateException>
	//   55  103:dup             
	//   56  104:ldc1            #193 <String "Error inflating menu XML">
	//   57  106:aload_2         
	//   58  107:invokespecial   #196 <Method void InflateException(String, Throwable)>
	//   59  110:athrow          
_L1:
		if(xmlresourceparser != null)
	//*  60  111:aload_3         
	//*  61  112:ifnull          121
			xmlresourceparser.close();
	//   62  115:aload_3         
	//   63  116:invokeinterface #189 <Method void XmlResourceParser.close()>
		throw menu;
	//   64  121:aload_2         
	//   65  122:athrow          
		menu;
	//   66  123:astore_2        
		xmlresourceparser = ((XmlResourceParser) (obj1));
	//   67  124:aload           6
	//   68  126:astore_3        
		  goto _L3
	//*  69  127:goto            100
	}

	static final Class ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE[] = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
	static final Class ACTION_VIEW_CONSTRUCTOR_SIGNATURE[] = {
		android/content/Context
	};
	static final String LOG_TAG = "SupportMenuInflater";
	static final int NO_ID = 0;
	private static final String XML_GROUP = "group";
	private static final String XML_ITEM = "item";
	private static final String XML_MENU = "menu";
	final Object mActionProviderConstructorArguments[];
	final Object mActionViewConstructorArguments[];
	Context mContext;
	private Object mRealOwner;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #47  <Class Context>
	//    5    8:aastore         
	//    6    9:putstatic       #49  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//    7   12:getstatic       #49  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
	//    8   15:putstatic       #51  <Field Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
	//*   9   18:return          
	}
}