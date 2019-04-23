// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.*;
import android.support.v4.c.a.a;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			BaseMenuWrapper

class MenuWrapperICS extends BaseMenuWrapper
	implements Menu
{

	MenuWrapperICS(Context context, a a1)
	{
		super(context, ((Object) (a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void BaseMenuWrapper(Context, Object)>
	//    4    6:return          
	}

	public MenuItem add(int i)
	{
		return getMenuItemWrapper(((a)mWrappedObject).add(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:invokeinterface #22  <Method MenuItem a.add(int)>
	//    6   14:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public MenuItem add(int i, int j, int k, int l)
	{
		return getMenuItemWrapper(((a)mWrappedObject).add(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #29  <Method MenuItem a.add(int, int, int, int)>
	//    9   18:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   10   21:areturn         
	}

	public MenuItem add(int i, int j, int k, CharSequence charsequence)
	{
		return getMenuItemWrapper(((a)mWrappedObject).add(i, j, k, charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokeinterface #32  <Method MenuItem a.add(int, int, int, CharSequence)>
	//    9   18:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//   10   21:areturn         
	}

	public MenuItem add(CharSequence charsequence)
	{
		return getMenuItemWrapper(((a)mWrappedObject).add(charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:aload_1         
	//    5    9:invokeinterface #35  <Method MenuItem a.add(CharSequence)>
	//    6   14:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
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
		j = ((a)mWrappedObject).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field Object mWrappedObject>
	//   11   23:checkcast       #20  <Class a>
	//   12   26:iload_1         
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:aload           6
	//   18   35:iload           7
	//   19   37:aload           9
	//   20   39:invokeinterface #41  <Method int a.addIntentOptions(int, int, int, ComponentName, Intent[], Intent, int, MenuItem[])>
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
	//   38   69:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
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
		return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:invokeinterface #45  <Method SubMenu a.addSubMenu(int)>
	//    6   14:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    7   17:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, int l)
	{
		return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #52  <Method SubMenu a.addSubMenu(int, int, int, int)>
	//    9   18:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//   10   21:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
	{
		return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(i, j, k, charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokeinterface #55  <Method SubMenu a.addSubMenu(int, int, int, CharSequence)>
	//    9   18:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//   10   21:areturn         
	}

	public SubMenu addSubMenu(CharSequence charsequence)
	{
		return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(charsequence));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:aload_1         
	//    5    9:invokeinterface #58  <Method SubMenu a.addSubMenu(CharSequence)>
	//    6   14:invokevirtual   #49  <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    7   17:areturn         
	}

	public void clear()
	{
		internalClear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method void internalClear()>
		((a)mWrappedObject).clear();
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Object mWrappedObject>
	//    4    8:checkcast       #20  <Class a>
	//    5   11:invokeinterface #65  <Method void a.clear()>
	//    6   16:return          
	}

	public void close()
	{
		((a)mWrappedObject).close();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:invokeinterface #68  <Method void a.close()>
	//    4   12:return          
	}

	public MenuItem findItem(int i)
	{
		return getMenuItemWrapper(((a)mWrappedObject).findItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:invokeinterface #71  <Method MenuItem a.findItem(int)>
	//    6   14:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public MenuItem getItem(int i)
	{
		return getMenuItemWrapper(((a)mWrappedObject).getItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Object mWrappedObject>
	//    3    5:checkcast       #20  <Class a>
	//    4    8:iload_1         
	//    5    9:invokeinterface #74  <Method MenuItem a.getItem(int)>
	//    6   14:invokevirtual   #26  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    7   17:areturn         
	}

	public boolean hasVisibleItems()
	{
		return ((a)mWrappedObject).hasVisibleItems();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:invokeinterface #78  <Method boolean a.hasVisibleItems()>
	//    4   12:ireturn         
	}

	public boolean isShortcutKey(int i, KeyEvent keyevent)
	{
		return ((a)mWrappedObject).isShortcutKey(i, keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #82  <Method boolean a.isShortcutKey(int, KeyEvent)>
	//    6   14:ireturn         
	}

	public boolean performIdentifierAction(int i, int j)
	{
		return ((a)mWrappedObject).performIdentifierAction(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #86  <Method boolean a.performIdentifierAction(int, int)>
	//    6   14:ireturn         
	}

	public boolean performShortcut(int i, KeyEvent keyevent, int j)
	{
		return ((a)mWrappedObject).performShortcut(i, keyevent, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokeinterface #90  <Method boolean a.performShortcut(int, KeyEvent, int)>
	//    7   15:ireturn         
	}

	public void removeGroup(int i)
	{
		internalRemoveGroup(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #95  <Method void internalRemoveGroup(int)>
		((a)mWrappedObject).removeGroup(i);
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Object mWrappedObject>
	//    5    9:checkcast       #20  <Class a>
	//    6   12:iload_1         
	//    7   13:invokeinterface #97  <Method void a.removeGroup(int)>
	//    8   18:return          
	}

	public void removeItem(int i)
	{
		internalRemoveItem(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #101 <Method void internalRemoveItem(int)>
		((a)mWrappedObject).removeItem(i);
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Object mWrappedObject>
	//    5    9:checkcast       #20  <Class a>
	//    6   12:iload_1         
	//    7   13:invokeinterface #103 <Method void a.removeItem(int)>
	//    8   18:return          
	}

	public void setGroupCheckable(int i, boolean flag, boolean flag1)
	{
		((a)mWrappedObject).setGroupCheckable(i, flag, flag1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokeinterface #107 <Method void a.setGroupCheckable(int, boolean, boolean)>
	//    7   15:return          
	}

	public void setGroupEnabled(int i, boolean flag)
	{
		((a)mWrappedObject).setGroupEnabled(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #111 <Method void a.setGroupEnabled(int, boolean)>
	//    6   14:return          
	}

	public void setGroupVisible(int i, boolean flag)
	{
		((a)mWrappedObject).setGroupVisible(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #114 <Method void a.setGroupVisible(int, boolean)>
	//    6   14:return          
	}

	public void setQwertyMode(boolean flag)
	{
		((a)mWrappedObject).setQwertyMode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:iload_1         
	//    4    8:invokeinterface #118 <Method void a.setQwertyMode(boolean)>
	//    5   13:return          
	}

	public int size()
	{
		return ((a)mWrappedObject).size();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class a>
	//    3    7:invokeinterface #122 <Method int a.size()>
	//    4   12:ireturn         
	}
}
