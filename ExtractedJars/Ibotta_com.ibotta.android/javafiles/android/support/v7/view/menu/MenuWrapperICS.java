// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.*;
import android.support.v4.internal.view.SupportMenu;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			BaseMenuWrapper

class MenuWrapperICS extends BaseMenuWrapper
	implements Menu
{

	MenuWrapperICS(Context context, SupportMenu supportmenu)
	{
		super(context, ((Object) (supportmenu)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void BaseMenuWrapper(Context, Object)>
	//    4    6:return          
	}

	public MenuItem add(int i)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #23  <Method MenuItem SupportMenu.add(int)>
	//    6   14:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public MenuItem add(int i, int j, int k, int l)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #30  <Method MenuItem SupportMenu.add(int, int, int, int)>
	//    9   18:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   10   21:areturn         
	}

	public MenuItem add(int i, int j, int k, CharSequence charsequence)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i, j, k, charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokeinterface #33  <Method MenuItem SupportMenu.add(int, int, int, CharSequence)>
	//    9   18:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   10   21:areturn         
	}

	public MenuItem add(CharSequence charsequence)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:aload_1         
	//    5    9:invokeinterface #36  <Method MenuItem SupportMenu.add(CharSequence)>
	//    6   14:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
			MenuItem amenuitem[])
	{
		MenuItem amenuitem1[];
		if(amenuitem != null)
	//*   0    0:aload           8
	//*   1    2:ifnull          16
			amenuitem1 = new MenuItem[amenuitem.length];
	//    2    5:aload           8
	//    3    7:arraylength     
	//    4    8:anewarray       MenuItem[]
	//    5   11:astore          9
		else
	//*   6   13:goto            19
			amenuitem1 = null;
	//    7   16:aconst_null     
	//    8   17:astore          9
		j = ((SupportMenu)mWrappedObject).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field Object mWrappedObject>
	//   11   23:checkcast       #21  <Class SupportMenu>
	//   12   26:iload_1         
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:aload           6
	//   18   35:iload           7
	//   19   37:aload           9
	//   20   39:invokeinterface #42  <Method int SupportMenu.addIntentOptions(int, int, int, ComponentName, Intent[], Intent, int, MenuItem[])>
	//   21   44:istore_2        
		if(amenuitem1 != null)
	//*  22   45:aload           9
	//*  23   47:ifnull          80
		{
			i = 0;
	//   24   50:iconst_0        
	//   25   51:istore_1        
			for(k = amenuitem1.length; i < k; i++)
	//*  26   52:aload           9
	//*  27   54:arraylength     
	//*  28   55:istore_3        
	//*  29   56:iload_1         
	//*  30   57:iload_3         
	//*  31   58:icmpge          80
				amenuitem[i] = getMenuItemWrapper(amenuitem1[i]);
	//   32   61:aload           8
	//   33   63:iload_1         
	//   34   64:aload_0         
	//   35   65:aload           9
	//   36   67:iload_1         
	//   37   68:aaload          
	//   38   69:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   39   72:aastore         

	//   40   73:iload_1         
	//   41   74:iconst_1        
	//   42   75:iadd            
	//   43   76:istore_1        
		}
	//*  44   77:goto            56
		return j;
	//   45   80:iload_2         
	//   46   81:ireturn         
	}

	public SubMenu addSubMenu(int i)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #46  <Method SubMenu SupportMenu.addSubMenu(int)>
	//    6   14:invokevirtual   #50  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    7   17:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, int l)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #53  <Method SubMenu SupportMenu.addSubMenu(int, int, int, int)>
	//    9   18:invokevirtual   #50  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//   10   21:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i, j, k, charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokeinterface #56  <Method SubMenu SupportMenu.addSubMenu(int, int, int, CharSequence)>
	//    9   18:invokevirtual   #50  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//   10   21:areturn         
	}

	public SubMenu addSubMenu(CharSequence charsequence)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:aload_1         
	//    5    9:invokeinterface #59  <Method SubMenu SupportMenu.addSubMenu(CharSequence)>
	//    6   14:invokevirtual   #50  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    7   17:areturn         
	}

	public void clear()
	{
		internalClear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method void internalClear()>
		((SupportMenu)mWrappedObject).clear();
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Object mWrappedObject>
	//    4    8:checkcast       #21  <Class SupportMenu>
	//    5   11:invokeinterface #66  <Method void SupportMenu.clear()>
	//    6   16:return          
	}

	public void close()
	{
		((SupportMenu)mWrappedObject).close();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:invokeinterface #69  <Method void SupportMenu.close()>
	//    4   12:return          
	}

	public MenuItem findItem(int i)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).findItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #72  <Method MenuItem SupportMenu.findItem(int)>
	//    6   14:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public MenuItem getItem(int i)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).getItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object mWrappedObject>
	//    3    5:checkcast       #21  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #75  <Method MenuItem SupportMenu.getItem(int)>
	//    6   14:invokevirtual   #27  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public boolean hasVisibleItems()
	{
		return ((SupportMenu)mWrappedObject).hasVisibleItems();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:invokeinterface #79  <Method boolean SupportMenu.hasVisibleItems()>
	//    4   12:ireturn         
	}

	public boolean isShortcutKey(int i, KeyEvent keyevent)
	{
		return ((SupportMenu)mWrappedObject).isShortcutKey(i, keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #83  <Method boolean SupportMenu.isShortcutKey(int, KeyEvent)>
	//    6   14:ireturn         
	}

	public boolean performIdentifierAction(int i, int j)
	{
		return ((SupportMenu)mWrappedObject).performIdentifierAction(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #87  <Method boolean SupportMenu.performIdentifierAction(int, int)>
	//    6   14:ireturn         
	}

	public boolean performShortcut(int i, KeyEvent keyevent, int j)
	{
		return ((SupportMenu)mWrappedObject).performShortcut(i, keyevent, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokeinterface #91  <Method boolean SupportMenu.performShortcut(int, KeyEvent, int)>
	//    7   15:ireturn         
	}

	public void removeGroup(int i)
	{
		internalRemoveGroup(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #96  <Method void internalRemoveGroup(int)>
		((SupportMenu)mWrappedObject).removeGroup(i);
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Object mWrappedObject>
	//    5    9:checkcast       #21  <Class SupportMenu>
	//    6   12:iload_1         
	//    7   13:invokeinterface #98  <Method void SupportMenu.removeGroup(int)>
	//    8   18:return          
	}

	public void removeItem(int i)
	{
		internalRemoveItem(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #102 <Method void internalRemoveItem(int)>
		((SupportMenu)mWrappedObject).removeItem(i);
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Object mWrappedObject>
	//    5    9:checkcast       #21  <Class SupportMenu>
	//    6   12:iload_1         
	//    7   13:invokeinterface #104 <Method void SupportMenu.removeItem(int)>
	//    8   18:return          
	}

	public void setGroupCheckable(int i, boolean flag, boolean flag1)
	{
		((SupportMenu)mWrappedObject).setGroupCheckable(i, flag, flag1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokeinterface #108 <Method void SupportMenu.setGroupCheckable(int, boolean, boolean)>
	//    7   15:return          
	}

	public void setGroupEnabled(int i, boolean flag)
	{
		((SupportMenu)mWrappedObject).setGroupEnabled(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #112 <Method void SupportMenu.setGroupEnabled(int, boolean)>
	//    6   14:return          
	}

	public void setGroupVisible(int i, boolean flag)
	{
		((SupportMenu)mWrappedObject).setGroupVisible(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #115 <Method void SupportMenu.setGroupVisible(int, boolean)>
	//    6   14:return          
	}

	public void setQwertyMode(boolean flag)
	{
		((SupportMenu)mWrappedObject).setQwertyMode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:invokeinterface #119 <Method void SupportMenu.setQwertyMode(boolean)>
	//    5   13:return          
	}

	public int size()
	{
		return ((SupportMenu)mWrappedObject).size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mWrappedObject>
	//    2    4:checkcast       #21  <Class SupportMenu>
	//    3    7:invokeinterface #123 <Method int SupportMenu.size()>
	//    4   12:ireturn         
	}
}
