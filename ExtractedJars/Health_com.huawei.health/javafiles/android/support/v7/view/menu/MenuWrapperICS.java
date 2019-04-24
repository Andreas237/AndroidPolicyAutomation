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
	//    3    3:invokespecial   #15  <Method void BaseMenuWrapper(Context, Object)>
	//    4    6:return          
	}

	public MenuItem add(int i)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #26  <Method MenuItem SupportMenu.add(int)>
	//    6   14:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public MenuItem add(int i, int j, int k, int l)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #33  <Method MenuItem SupportMenu.add(int, int, int, int)>
	//    9   18:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   10   21:areturn         
	}

	public MenuItem add(int i, int j, int k, CharSequence charsequence)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(i, j, k, charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokeinterface #36  <Method MenuItem SupportMenu.add(int, int, int, CharSequence)>
	//    9   18:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   10   21:areturn         
	}

	public MenuItem add(CharSequence charsequence)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).add(charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:aload_1         
	//    5    9:invokeinterface #39  <Method MenuItem SupportMenu.add(CharSequence)>
	//    6   14:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
			MenuItem amenuitem[])
	{
		MenuItem amenuitem1[] = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		if(amenuitem != null)
	//*   2    3:aload           8
	//*   3    5:ifnull          16
			amenuitem1 = new MenuItem[amenuitem.length];
	//    4    8:aload           8
	//    5   10:arraylength     
	//    6   11:anewarray       MenuItem[]
	//    7   14:astore          9
		j = ((SupportMenu)mWrappedObject).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field Object mWrappedObject>
	//   10   20:checkcast       #24  <Class SupportMenu>
	//   11   23:iload_1         
	//   12   24:iload_2         
	//   13   25:iload_3         
	//   14   26:aload           4
	//   15   28:aload           5
	//   16   30:aload           6
	//   17   32:iload           7
	//   18   34:aload           9
	//   19   36:invokeinterface #45  <Method int SupportMenu.addIntentOptions(int, int, int, ComponentName, Intent[], Intent, int, MenuItem[])>
	//   20   41:istore_2        
		if(amenuitem1 != null)
	//*  21   42:aload           9
	//*  22   44:ifnull          77
		{
			i = 0;
	//   23   47:iconst_0        
	//   24   48:istore_1        
			for(k = amenuitem1.length; i < k; i++)
	//*  25   49:aload           9
	//*  26   51:arraylength     
	//*  27   52:istore_3        
	//*  28   53:iload_1         
	//*  29   54:iload_3         
	//*  30   55:icmpge          77
				amenuitem[i] = getMenuItemWrapper(amenuitem1[i]);
	//   31   58:aload           8
	//   32   60:iload_1         
	//   33   61:aload_0         
	//   34   62:aload           9
	//   35   64:iload_1         
	//   36   65:aaload          
	//   37   66:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   38   69:aastore         

	//   39   70:iload_1         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:istore_1        
		}
	//*  43   74:goto            53
		return j;
	//   44   77:iload_2         
	//   45   78:ireturn         
	}

	public SubMenu addSubMenu(int i)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #49  <Method SubMenu SupportMenu.addSubMenu(int)>
	//    6   14:invokevirtual   #53  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    7   17:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, int l)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #56  <Method SubMenu SupportMenu.addSubMenu(int, int, int, int)>
	//    9   18:invokevirtual   #53  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//   10   21:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(i, j, k, charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokeinterface #59  <Method SubMenu SupportMenu.addSubMenu(int, int, int, CharSequence)>
	//    9   18:invokevirtual   #53  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//   10   21:areturn         
	}

	public SubMenu addSubMenu(CharSequence charsequence)
	{
		return getSubMenuWrapper(((SupportMenu)mWrappedObject).addSubMenu(charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:aload_1         
	//    5    9:invokeinterface #62  <Method SubMenu SupportMenu.addSubMenu(CharSequence)>
	//    6   14:invokevirtual   #53  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    7   17:areturn         
	}

	public void clear()
	{
		internalClear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method void internalClear()>
		((SupportMenu)mWrappedObject).clear();
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Object mWrappedObject>
	//    4    8:checkcast       #24  <Class SupportMenu>
	//    5   11:invokeinterface #69  <Method void SupportMenu.clear()>
	//    6   16:return          
	}

	public void close()
	{
		((SupportMenu)mWrappedObject).close();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:invokeinterface #72  <Method void SupportMenu.close()>
	//    4   12:return          
	}

	public MenuItem findItem(int i)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).findItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #75  <Method MenuItem SupportMenu.findItem(int)>
	//    6   14:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public MenuItem getItem(int i)
	{
		return getMenuItemWrapper(((SupportMenu)mWrappedObject).getItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Object mWrappedObject>
	//    3    5:checkcast       #24  <Class SupportMenu>
	//    4    8:iload_1         
	//    5    9:invokeinterface #78  <Method MenuItem SupportMenu.getItem(int)>
	//    6   14:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public boolean hasVisibleItems()
	{
		return ((SupportMenu)mWrappedObject).hasVisibleItems();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:invokeinterface #82  <Method boolean SupportMenu.hasVisibleItems()>
	//    4   12:ireturn         
	}

	public boolean isShortcutKey(int i, KeyEvent keyevent)
	{
		return ((SupportMenu)mWrappedObject).isShortcutKey(i, keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #86  <Method boolean SupportMenu.isShortcutKey(int, KeyEvent)>
	//    6   14:ireturn         
	}

	public boolean performIdentifierAction(int i, int j)
	{
		return ((SupportMenu)mWrappedObject).performIdentifierAction(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #90  <Method boolean SupportMenu.performIdentifierAction(int, int)>
	//    6   14:ireturn         
	}

	public boolean performShortcut(int i, KeyEvent keyevent, int j)
	{
		return ((SupportMenu)mWrappedObject).performShortcut(i, keyevent, j);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokeinterface #94  <Method boolean SupportMenu.performShortcut(int, KeyEvent, int)>
	//    7   15:ireturn         
	}

	public void removeGroup(int i)
	{
		internalRemoveGroup(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #99  <Method void internalRemoveGroup(int)>
		((SupportMenu)mWrappedObject).removeGroup(i);
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Object mWrappedObject>
	//    5    9:checkcast       #24  <Class SupportMenu>
	//    6   12:iload_1         
	//    7   13:invokeinterface #101 <Method void SupportMenu.removeGroup(int)>
	//    8   18:return          
	}

	public void removeItem(int i)
	{
		internalRemoveItem(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #105 <Method void internalRemoveItem(int)>
		((SupportMenu)mWrappedObject).removeItem(i);
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Object mWrappedObject>
	//    5    9:checkcast       #24  <Class SupportMenu>
	//    6   12:iload_1         
	//    7   13:invokeinterface #107 <Method void SupportMenu.removeItem(int)>
	//    8   18:return          
	}

	public void setGroupCheckable(int i, boolean flag, boolean flag1)
	{
		((SupportMenu)mWrappedObject).setGroupCheckable(i, flag, flag1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokeinterface #111 <Method void SupportMenu.setGroupCheckable(int, boolean, boolean)>
	//    7   15:return          
	}

	public void setGroupEnabled(int i, boolean flag)
	{
		((SupportMenu)mWrappedObject).setGroupEnabled(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #115 <Method void SupportMenu.setGroupEnabled(int, boolean)>
	//    6   14:return          
	}

	public void setGroupVisible(int i, boolean flag)
	{
		((SupportMenu)mWrappedObject).setGroupVisible(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #118 <Method void SupportMenu.setGroupVisible(int, boolean)>
	//    6   14:return          
	}

	public void setQwertyMode(boolean flag)
	{
		((SupportMenu)mWrappedObject).setQwertyMode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:iload_1         
	//    4    8:invokeinterface #122 <Method void SupportMenu.setQwertyMode(boolean)>
	//    5   13:return          
	}

	public int size()
	{
		return ((SupportMenu)mWrappedObject).size();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportMenu>
	//    3    7:invokeinterface #126 <Method int SupportMenu.size()>
	//    4   12:ireturn         
	}
}
