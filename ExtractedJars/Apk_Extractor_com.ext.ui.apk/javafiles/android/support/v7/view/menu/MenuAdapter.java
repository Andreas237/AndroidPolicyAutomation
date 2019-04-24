// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.*;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view.menu:
//			MenuBuilder, MenuItemImpl, ListMenuItemView

public class MenuAdapter extends BaseAdapter
{

	public MenuAdapter(MenuBuilder menubuilder, LayoutInflater layoutinflater, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void BaseAdapter()>
		mExpandedIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #34  <Field int mExpandedIndex>
		mOverflowOnly = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #36  <Field boolean mOverflowOnly>
		mInflater = layoutinflater;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #38  <Field LayoutInflater mInflater>
		mAdapterMenu = menubuilder;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #40  <Field MenuBuilder mAdapterMenu>
		findExpandedIndex();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #43  <Method void findExpandedIndex()>
	//   16   28:return          
	}

	void findExpandedIndex()
	{
		MenuItemImpl menuitemimpl = mAdapterMenu.getExpandedItem();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//    2    4:invokevirtual   #49  <Method MenuItemImpl MenuBuilder.getExpandedItem()>
	//    3    7:astore_3        
		if(menuitemimpl != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          60
		{
			ArrayList arraylist = mAdapterMenu.getNonActionItems();
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//    8   16:invokevirtual   #53  <Method ArrayList MenuBuilder.getNonActionItems()>
	//    9   19:astore          4
			int j = arraylist.size();
	//   10   21:aload           4
	//   11   23:invokevirtual   #59  <Method int ArrayList.size()>
	//   12   26:istore_2        
			for(int i = 0; i < j; i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          60
				if((MenuItemImpl)arraylist.get(i) == menuitemimpl)
	//*  18   34:aload           4
	//*  19   36:iload_1         
	//*  20   37:invokevirtual   #63  <Method Object ArrayList.get(int)>
	//*  21   40:checkcast       #65  <Class MenuItemImpl>
	//*  22   43:aload_3         
	//*  23   44:if_acmpne       53
				{
					mExpandedIndex = i;
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:putfield        #34  <Field int mExpandedIndex>
					return;
	//   27   52:return          
				}

	//   28   53:iload_1         
	//   29   54:iconst_1        
	//   30   55:iadd            
	//   31   56:istore_1        
		}
	//*  32   57:goto            29
		mExpandedIndex = -1;
	//   33   60:aload_0         
	//   34   61:iconst_m1       
	//   35   62:putfield        #34  <Field int mExpandedIndex>
	//   36   65:return          
	}

	public MenuBuilder getAdapterMenu()
	{
		return mAdapterMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//    2    4:areturn         
	}

	public int getCount()
	{
		ArrayList arraylist;
		if(mOverflowOnly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean mOverflowOnly>
	//*   2    4:ifeq            27
			arraylist = mAdapterMenu.getNonActionItems();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//    5   11:invokevirtual   #53  <Method ArrayList MenuBuilder.getNonActionItems()>
	//    6   14:astore_1        
		else
	//*   7   15:aload_0         
	//*   8   16:getfield        #34  <Field int mExpandedIndex>
	//*   9   19:ifge            38
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #59  <Method int ArrayList.size()>
	//*  12   26:ireturn         
			arraylist = mAdapterMenu.getVisibleItems();
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//   15   31:invokevirtual   #71  <Method ArrayList MenuBuilder.getVisibleItems()>
	//   16   34:astore_1        
		if(mExpandedIndex < 0)
			return arraylist.size();
		else
	//*  17   35:goto            15
			return arraylist.size() - 1;
	//   18   38:aload_1         
	//   19   39:invokevirtual   #59  <Method int ArrayList.size()>
	//   20   42:iconst_1        
	//   21   43:isub            
	//   22   44:ireturn         
	}

	public boolean getForceShowIcon()
	{
		return mForceShowIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean mForceShowIcon>
	//    2    4:ireturn         
	}

	public MenuItemImpl getItem(int i)
	{
		int j;
		ArrayList arraylist;
		if(mOverflowOnly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean mOverflowOnly>
	//*   2    4:ifeq            47
			arraylist = mAdapterMenu.getNonActionItems();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//    5   11:invokevirtual   #53  <Method ArrayList MenuBuilder.getNonActionItems()>
	//    6   14:astore_3        
		else
	//*   7   15:iload_1         
	//*   8   16:istore_2        
	//*   9   17:aload_0         
	//*  10   18:getfield        #34  <Field int mExpandedIndex>
	//*  11   21:iflt            38
	//*  12   24:iload_1         
	//*  13   25:istore_2        
	//*  14   26:iload_1         
	//*  15   27:aload_0         
	//*  16   28:getfield        #34  <Field int mExpandedIndex>
	//*  17   31:icmplt          38
	//*  18   34:iload_1         
	//*  19   35:iconst_1        
	//*  20   36:iadd            
	//*  21   37:istore_2        
	//*  22   38:aload_3         
	//*  23   39:iload_2         
	//*  24   40:invokevirtual   #63  <Method Object ArrayList.get(int)>
	//*  25   43:checkcast       #65  <Class MenuItemImpl>
	//*  26   46:areturn         
			arraylist = mAdapterMenu.getVisibleItems();
	//   27   47:aload_0         
	//   28   48:getfield        #40  <Field MenuBuilder mAdapterMenu>
	//   29   51:invokevirtual   #71  <Method ArrayList MenuBuilder.getVisibleItems()>
	//   30   54:astore_3        
		j = i;
		if(mExpandedIndex >= 0)
		{
			j = i;
			if(i >= mExpandedIndex)
				j = i + 1;
		}
		return (MenuItemImpl)arraylist.get(j);
	//*  31   55:goto            15
	}

	public volatile Object getItem(int i)
	{
		return ((Object) (getItem(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #79  <Method MenuItemImpl getItem(int)>
	//    3    5:areturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		if(view == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       51
			view = mInflater.inflate(ITEM_LAYOUT, viewgroup, false);
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field LayoutInflater mInflater>
	//    4    8:getstatic       #27  <Field int ITEM_LAYOUT>
	//    5   11:aload_3         
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #89  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    8   16:astore_2        
		viewgroup = ((ViewGroup) ((MenuView.ItemView)view));
	//    9   17:aload_2         
	//   10   18:checkcast       #91  <Class MenuView$ItemView>
	//   11   21:astore_3        
		if(mForceShowIcon)
	//*  12   22:aload_0         
	//*  13   23:getfield        #75  <Field boolean mForceShowIcon>
	//*  14   26:ifeq            37
			((ListMenuItemView)view).setForceShowIcon(true);
	//   15   29:aload_2         
	//   16   30:checkcast       #93  <Class ListMenuItemView>
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #97  <Method void ListMenuItemView.setForceShowIcon(boolean)>
		((MenuView.ItemView) (viewgroup)).initialize(getItem(i), 0);
	//   19   37:aload_3         
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #79  <Method MenuItemImpl getItem(int)>
	//   23   43:iconst_0        
	//   24   44:invokeinterface #101 <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
		return view;
	//   25   49:aload_2         
	//   26   50:areturn         
	//*  27   51:goto            17
	}

	public void notifyDataSetChanged()
	{
		findExpandedIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void findExpandedIndex()>
		super.notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void BaseAdapter.notifyDataSetChanged()>
	//    4    8:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean mForceShowIcon>
	//    3    5:return          
	}

	static final int ITEM_LAYOUT;
	MenuBuilder mAdapterMenu;
	private int mExpandedIndex;
	private boolean mForceShowIcon;
	private final LayoutInflater mInflater;
	private final boolean mOverflowOnly;

	static 
	{
		ITEM_LAYOUT = android.support.v7.appcompat.R.layout.abc_popup_menu_item_layout;
	//    0    0:getstatic       #25  <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_item_layout>
	//    1    3:putstatic       #27  <Field int ITEM_LAYOUT>
	//*   2    6:return          
	}
}
