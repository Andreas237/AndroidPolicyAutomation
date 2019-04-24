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
	static class InflatedOnMenuItemClickListener
		implements android.view.MenuItem.OnMenuItemClickListener
	{

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			boolean flag;
			if(mMethod.getReturnType() != Boolean.TYPE)
				break MISSING_BLOCK_LABEL_41;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field Method mMethod>
		//    2    4:invokevirtual   #77  <Method Class Method.getReturnType()>
		//    3    7:getstatic       #83  <Field Class Boolean.TYPE>
		//    4   10:if_acmpne       41
			flag = ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
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
		//   18   38:istore_2        
			return flag;
		//   19   39:iload_2         
		//   20   40:ireturn         
			try
			{
				mMethod.invoke(mRealOwner, new Object[] {
					menuitem
				});
		//   21   41:aload_0         
		//   22   42:getfield        #43  <Field Method mMethod>
		//   23   45:aload_0         
		//   24   46:getfield        #33  <Field Object mRealOwner>
		//   25   49:iconst_1        
		//   26   50:anewarray       Object[]
		//   27   53:dup             
		//   28   54:iconst_0        
		//   29   55:aload_1         
		//   30   56:aastore         
		//   31   57:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
		//   32   60:pop             
			}
		//*  33   61:iconst_1        
		//*  34   62:ireturn         
			// Misplaced declaration of an exception variable
			catch(MenuItem menuitem)
		//*  35   63:astore_1        
			{
				throw new RuntimeException(((Throwable) (menuitem)));
		//   36   64:new             #93  <Class RuntimeException>
		//   37   67:dup             
		//   38   68:aload_1         
		//   39   69:invokespecial   #96  <Method void RuntimeException(Throwable)>
		//   40   72:athrow          
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
				s = ((String) (new InflateException((new StringBuilder()).append("Couldn't resolve menu item onClick handler ").append(s).append(" in class ").append(class1.getName()).toString())));
		//   16   28:new             #45  <Class InflateException>
		//   17   31:dup             
		//   18   32:new             #47  <Class StringBuilder>
		//   19   35:dup             
		//   20   36:invokespecial   #48  <Method void StringBuilder()>
		//   21   39:ldc1            #50  <String "Couldn't resolve menu item onClick handler ">
		//   22   41:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   23   44:aload_2         
		//   24   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   25   48:ldc1            #56  <String " in class ">
		//   26   50:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   27   53:aload_3         
		//   28   54:invokevirtual   #60  <Method String Class.getName()>
		//   29   57:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   30   60:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   31   63:invokespecial   #66  <Method void InflateException(String)>
		//   32   66:astore_2        
			}
			((InflateException) (s)).initCause(((Throwable) (obj)));
		//   33   67:aload_2         
		//   34   68:aload_1         
		//   35   69:invokevirtual   #70  <Method Throwable InflateException.initCause(Throwable)>
		//   36   72:pop             
			throw s;
		//   37   73:aload_2         
		//   38   74:athrow          
		}
	}

	class MenuState
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
				menuitem.setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (new InflatedOnMenuItemClickListener(getRealOwner(), itemListenerMethodName))));
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

		public MenuState(Menu menu1)
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
		boolean flag2 = false;
	//    9   19:iconst_0        
	//   10   20:istore          6
		Menu menu1 = null;
	//   11   22:aconst_null     
	//   12   23:astore          9
		do
		{
			if(i == 2)
	//*  13   25:iload           4
	//*  14   27:iconst_2        
	//*  15   28:icmpne          85
			{
				menu = ((Menu) (xmlpullparser.getName()));
	//   16   31:aload_1         
	//   17   32:invokeinterface #95  <Method String XmlPullParser.getName()>
	//   18   37:astore_3        
				if(((String) (menu)).equals("menu"))
	//*  19   38:aload_3         
	//*  20   39:ldc1            #34  <String "menu">
	//*  21   41:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  22   44:ifeq            58
					i = xmlpullparser.next();
	//   23   47:aload_1         
	//   24   48:invokeinterface #104 <Method int XmlPullParser.next()>
	//   25   53:istore          4
				else
	//*  26   55:goto            107
					throw new RuntimeException((new StringBuilder()).append("Expecting menu, got ").append(((String) (menu))).toString());
	//   27   58:new             #106 <Class RuntimeException>
	//   28   61:dup             
	//   29   62:new             #108 <Class StringBuilder>
	//   30   65:dup             
	//   31   66:invokespecial   #110 <Method void StringBuilder()>
	//   32   69:ldc1            #112 <String "Expecting menu, got ">
	//   33   71:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   34   74:aload_3         
	//   35   75:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   37   81:invokespecial   #122 <Method void RuntimeException(String)>
	//   38   84:athrow          
				break;
			}
			int j = xmlpullparser.next();
	//   39   85:aload_1         
	//   40   86:invokeinterface #104 <Method int XmlPullParser.next()>
	//   41   91:istore          5
			i = j;
	//   42   93:iload           5
	//   43   95:istore          4
			if(j != 1)
				continue;
	//   44   97:iload           5
	//   45   99:iconst_1        
	//   46  100:icmpne          25
			i = j;
	//   47  103:iload           5
	//   48  105:istore          4
			break;
		} while(true);
		boolean flag1 = false;
	//   49  107:iconst_0        
	//   50  108:istore          5
		int k = i;
	//   51  110:iload           4
	//   52  112:istore          8
		boolean flag3;
		for(; !flag1; flag1 = flag3)
	//*  53  114:iload           5
	//*  54  116:ifne            507
		{
			boolean flag;
			switch(k)
	//*  55  119:iload           8
			{
	//*  56  121:tableswitch     1 3: default 148
	//	               1 475
	//	               2 162
	//	               3 290
			default:
				flag = flag2;
	//   57  148:iload           6
	//   58  150:istore          4
				menu = menu1;
	//   59  152:aload           9
	//   60  154:astore_3        
				flag3 = flag1;
	//   61  155:iload           5
	//   62  157:istore          7
				break;
	//   63  159:goto            485

			case 2: // '\002'
				if(flag2)
	//*  64  162:iload           6
	//*  65  164:ifeq            181
				{
					flag = flag2;
	//   66  167:iload           6
	//   67  169:istore          4
					menu = menu1;
	//   68  171:aload           9
	//   69  173:astore_3        
					flag3 = flag1;
	//   70  174:iload           5
	//   71  176:istore          7
					break;
	//   72  178:goto            485
				}
				menu = ((Menu) (xmlpullparser.getName()));
	//   73  181:aload_1         
	//   74  182:invokeinterface #95  <Method String XmlPullParser.getName()>
	//   75  187:astore_3        
				if(((String) (menu)).equals("group"))
	//*  76  188:aload_3         
	//*  77  189:ldc1            #28  <String "group">
	//*  78  191:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  79  194:ifeq            217
				{
					menustate.readGroup(attributeset);
	//   80  197:aload           10
	//   81  199:aload_2         
	//   82  200:invokevirtual   #126 <Method void SupportMenuInflater$MenuState.readGroup(AttributeSet)>
					flag = flag2;
	//   83  203:iload           6
	//   84  205:istore          4
					menu = menu1;
	//   85  207:aload           9
	//   86  209:astore_3        
					flag3 = flag1;
	//   87  210:iload           5
	//   88  212:istore          7
					break;
	//   89  214:goto            485
				}
				if(((String) (menu)).equals("item"))
	//*  90  217:aload_3         
	//*  91  218:ldc1            #31  <String "item">
	//*  92  220:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  93  223:ifeq            246
				{
					menustate.readItem(attributeset);
	//   94  226:aload           10
	//   95  228:aload_2         
	//   96  229:invokevirtual   #129 <Method void SupportMenuInflater$MenuState.readItem(AttributeSet)>
					flag = flag2;
	//   97  232:iload           6
	//   98  234:istore          4
					menu = menu1;
	//   99  236:aload           9
	//  100  238:astore_3        
					flag3 = flag1;
	//  101  239:iload           5
	//  102  241:istore          7
					break;
	//  103  243:goto            485
				}
				if(((String) (menu)).equals("menu"))
	//* 104  246:aload_3         
	//* 105  247:ldc1            #34  <String "menu">
	//* 106  249:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 107  252:ifeq            280
				{
					parseMenu(xmlpullparser, attributeset, ((Menu) (menustate.addSubMenuItem())));
	//  108  255:aload_0         
	//  109  256:aload_1         
	//  110  257:aload_2         
	//  111  258:aload           10
	//  112  260:invokevirtual   #133 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
	//  113  263:invokespecial   #135 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
					flag = flag2;
	//  114  266:iload           6
	//  115  268:istore          4
					menu = menu1;
	//  116  270:aload           9
	//  117  272:astore_3        
					flag3 = flag1;
	//  118  273:iload           5
	//  119  275:istore          7
				} else
	//* 120  277:goto            485
				{
					flag = true;
	//  121  280:iconst_1        
	//  122  281:istore          4
					flag3 = flag1;
	//  123  283:iload           5
	//  124  285:istore          7
				}
				break;
	//  125  287:goto            485

			case 3: // '\003'
				String s = xmlpullparser.getName();
	//  126  290:aload_1         
	//  127  291:invokeinterface #95  <Method String XmlPullParser.getName()>
	//  128  296:astore          11
				if(flag2 && s.equals(((Object) (menu1))))
	//* 129  298:iload           6
	//* 130  300:ifeq            325
	//* 131  303:aload           11
	//* 132  305:aload           9
	//* 133  307:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 134  310:ifeq            325
				{
					flag = false;
	//  135  313:iconst_0        
	//  136  314:istore          4
					menu = null;
	//  137  316:aconst_null     
	//  138  317:astore_3        
					flag3 = flag1;
	//  139  318:iload           5
	//  140  320:istore          7
					break;
	//  141  322:goto            485
				}
				if(s.equals("group"))
	//* 142  325:aload           11
	//* 143  327:ldc1            #28  <String "group">
	//* 144  329:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 145  332:ifeq            354
				{
					menustate.resetGroup();
	//  146  335:aload           10
	//  147  337:invokevirtual   #138 <Method void SupportMenuInflater$MenuState.resetGroup()>
					flag = flag2;
	//  148  340:iload           6
	//  149  342:istore          4
					menu = menu1;
	//  150  344:aload           9
	//  151  346:astore_3        
					flag3 = flag1;
	//  152  347:iload           5
	//  153  349:istore          7
					break;
	//  154  351:goto            485
				}
				if(s.equals("item"))
	//* 155  354:aload           11
	//* 156  356:ldc1            #31  <String "item">
	//* 157  358:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 158  361:ifeq            441
				{
					flag = flag2;
	//  159  364:iload           6
	//  160  366:istore          4
					menu = menu1;
	//  161  368:aload           9
	//  162  370:astore_3        
					flag3 = flag1;
	//  163  371:iload           5
	//  164  373:istore          7
					if(menustate.hasAddedItem())
						break;
	//  165  375:aload           10
	//  166  377:invokevirtual   #142 <Method boolean SupportMenuInflater$MenuState.hasAddedItem()>
	//  167  380:ifne            485
					if(menustate.itemActionProvider != null && menustate.itemActionProvider.hasSubMenu())
	//* 168  383:aload           10
	//* 169  385:getfield        #146 <Field ActionProvider SupportMenuInflater$MenuState.itemActionProvider>
	//* 170  388:ifnull          422
	//* 171  391:aload           10
	//* 172  393:getfield        #146 <Field ActionProvider SupportMenuInflater$MenuState.itemActionProvider>
	//* 173  396:invokevirtual   #151 <Method boolean ActionProvider.hasSubMenu()>
	//* 174  399:ifeq            422
					{
						menustate.addSubMenuItem();
	//  175  402:aload           10
	//  176  404:invokevirtual   #133 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
	//  177  407:pop             
						flag = flag2;
	//  178  408:iload           6
	//  179  410:istore          4
						menu = menu1;
	//  180  412:aload           9
	//  181  414:astore_3        
						flag3 = flag1;
	//  182  415:iload           5
	//  183  417:istore          7
					} else
	//* 184  419:goto            485
					{
						menustate.addItem();
	//  185  422:aload           10
	//  186  424:invokevirtual   #154 <Method void SupportMenuInflater$MenuState.addItem()>
						flag = flag2;
	//  187  427:iload           6
	//  188  429:istore          4
						menu = menu1;
	//  189  431:aload           9
	//  190  433:astore_3        
						flag3 = flag1;
	//  191  434:iload           5
	//  192  436:istore          7
					}
					break;
	//  193  438:goto            485
				}
				flag = flag2;
	//  194  441:iload           6
	//  195  443:istore          4
				menu = menu1;
	//  196  445:aload           9
	//  197  447:astore_3        
				flag3 = flag1;
	//  198  448:iload           5
	//  199  450:istore          7
				if(s.equals("menu"))
	//* 200  452:aload           11
	//* 201  454:ldc1            #34  <String "menu">
	//* 202  456:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 203  459:ifeq            485
				{
					flag3 = true;
	//  204  462:iconst_1        
	//  205  463:istore          7
					flag = flag2;
	//  206  465:iload           6
	//  207  467:istore          4
					menu = menu1;
	//  208  469:aload           9
	//  209  471:astore_3        
				}
				break;

	//* 210  472:goto            485
			case 1: // '\001'
				throw new RuntimeException("Unexpected end of document");
	//  211  475:new             #106 <Class RuntimeException>
	//  212  478:dup             
	//  213  479:ldc1            #156 <String "Unexpected end of document">
	//  214  481:invokespecial   #122 <Method void RuntimeException(String)>
	//  215  484:athrow          
			}
			k = xmlpullparser.next();
	//  216  485:aload_1         
	//  217  486:invokeinterface #104 <Method int XmlPullParser.next()>
	//  218  491:istore          8
			flag2 = flag;
	//  219  493:iload           4
	//  220  495:istore          6
			menu1 = menu;
	//  221  497:aload_3         
	//  222  498:astore          9
		}

	//  223  500:iload           7
	//  224  502:istore          5
	//* 225  504:goto            114
	//  226  507:return          
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
		XmlResourceParser xmlresourceparser1;
		XmlResourceParser xmlresourceparser2;
		if(!(menu instanceof SupportMenu))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #165 <Class SupportMenu>
	//*   2    4:ifne            14
		{
			super.inflate(i, menu);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #167 <Method void MenuInflater.inflate(int, Menu)>
			return;
	//    7   13:return          
		}
		xmlresourceparser2 = null;
	//    8   14:aconst_null     
	//    9   15:astore          5
		xmlresourceparser = null;
	//   10   17:aconst_null     
	//   11   18:astore_3        
		xmlresourceparser1 = null;
	//   12   19:aconst_null     
	//   13   20:astore          4
		XmlResourceParser xmlresourceparser3 = mContext.getResources().getLayout(i);
	//   14   22:aload_0         
	//   15   23:getfield        #58  <Field Context mContext>
	//   16   26:invokevirtual   #171 <Method Resources Context.getResources()>
	//   17   29:iload_1         
	//   18   30:invokevirtual   #177 <Method XmlResourceParser Resources.getLayout(int)>
	//   19   33:astore          6
		xmlresourceparser1 = xmlresourceparser3;
	//   20   35:aload           6
	//   21   37:astore          4
		xmlresourceparser2 = xmlresourceparser3;
	//   22   39:aload           6
	//   23   41:astore          5
		xmlresourceparser = xmlresourceparser3;
	//   24   43:aload           6
	//   25   45:astore_3        
		parseMenu(((XmlPullParser) (xmlresourceparser3)), Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser3))), menu);
	//   26   46:aload_0         
	//   27   47:aload           6
	//   28   49:aload           6
	//   29   51:invokestatic    #183 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   30   54:aload_2         
	//   31   55:invokespecial   #135 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
		if(xmlresourceparser3 != null)
	//*  32   58:aload           6
	//*  33   60:ifnull          114
		{
			xmlresourceparser3.close();
	//   34   63:aload           6
	//   35   65:invokeinterface #188 <Method void XmlResourceParser.close()>
			return;
	//   36   70:return          
		} else
	//*  37   71:astore_2        
	//*  38   72:aload           4
	//*  39   74:astore_3        
	//*  40   75:new             #190 <Class InflateException>
	//*  41   78:dup             
	//*  42   79:ldc1            #192 <String "Error inflating menu XML">
	//*  43   81:aload_2         
	//*  44   82:invokespecial   #195 <Method void InflateException(String, Throwable)>
	//*  45   85:athrow          
	//*  46   86:astore_2        
	//*  47   87:aload           5
	//*  48   89:astore_3        
	//*  49   90:new             #190 <Class InflateException>
	//*  50   93:dup             
	//*  51   94:ldc1            #192 <String "Error inflating menu XML">
	//*  52   96:aload_2         
	//*  53   97:invokespecial   #195 <Method void InflateException(String, Throwable)>
	//*  54  100:athrow          
	//*  55  101:astore_2        
	//*  56  102:aload_3         
	//*  57  103:ifnull          112
	//*  58  106:aload_3         
	//*  59  107:invokeinterface #188 <Method void XmlResourceParser.close()>
	//*  60  112:aload_2         
	//*  61  113:athrow          
		{
			return;
	//   62  114:return          
		}
		menu;
		xmlresourceparser = xmlresourceparser1;
		throw new InflateException("Error inflating menu XML", ((Throwable) (menu)));
		menu;
		xmlresourceparser = xmlresourceparser2;
		throw new InflateException("Error inflating menu XML", ((Throwable) (menu)));
		menu;
		if(xmlresourceparser != null)
			xmlresourceparser.close();
		throw menu;
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
