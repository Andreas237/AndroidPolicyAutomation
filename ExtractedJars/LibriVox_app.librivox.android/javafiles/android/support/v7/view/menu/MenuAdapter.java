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

	public MenuAdapter(MenuBuilder menubuilder, LayoutInflater layoutinflater, boolean flag, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BaseAdapter()>
		mExpandedIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int mExpandedIndex>
		mOverflowOnly = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #23  <Field boolean mOverflowOnly>
		mInflater = layoutinflater;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #25  <Field LayoutInflater mInflater>
		mAdapterMenu = menubuilder;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #27  <Field MenuBuilder mAdapterMenu>
		mItemLayoutRes = i;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #29  <Field int mItemLayoutRes>
		findExpandedIndex();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #32  <Method void findExpandedIndex()>
	//   19   34:return          
	}

	void findExpandedIndex()
	{
		MenuItemImpl menuitemimpl = mAdapterMenu.s();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//    2    4:invokevirtual   #39  <Method MenuItemImpl MenuBuilder.s()>
	//    3    7:astore_3        
		if(menuitemimpl != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          60
		{
			ArrayList arraylist = mAdapterMenu.m();
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//    8   16:invokevirtual   #43  <Method ArrayList MenuBuilder.m()>
	//    9   19:astore          4
			int j = arraylist.size();
	//   10   21:aload           4
	//   11   23:invokevirtual   #49  <Method int ArrayList.size()>
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
	//*  20   37:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//*  21   40:checkcast       #55  <Class MenuItemImpl>
	//*  22   43:aload_3         
	//*  23   44:if_acmpne       53
				{
					mExpandedIndex = i;
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:putfield        #21  <Field int mExpandedIndex>
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
	//   35   62:putfield        #21  <Field int mExpandedIndex>
	//   36   65:return          
	}

	public MenuBuilder getAdapterMenu()
	{
		return mAdapterMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//    2    4:areturn         
	}

	public int getCount()
	{
		ArrayList arraylist;
		if(mOverflowOnly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field boolean mOverflowOnly>
	//*   2    4:ifeq            18
			arraylist = mAdapterMenu.m();
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//    5   11:invokevirtual   #43  <Method ArrayList MenuBuilder.m()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            26
			arraylist = mAdapterMenu.j();
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//   10   22:invokevirtual   #61  <Method ArrayList MenuBuilder.j()>
	//   11   25:astore_1        
		if(mExpandedIndex < 0)
	//*  12   26:aload_0         
	//*  13   27:getfield        #21  <Field int mExpandedIndex>
	//*  14   30:ifge            38
			return arraylist.size();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #49  <Method int ArrayList.size()>
	//   17   37:ireturn         
		else
			return arraylist.size() - 1;
	//   18   38:aload_1         
	//   19   39:invokevirtual   #49  <Method int ArrayList.size()>
	//   20   42:iconst_1        
	//   21   43:isub            
	//   22   44:ireturn         
	}

	public boolean getForceShowIcon()
	{
		return mForceShowIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean mForceShowIcon>
	//    2    4:ireturn         
	}

	public MenuItemImpl getItem(int i)
	{
		ArrayList arraylist;
		if(mOverflowOnly)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field boolean mOverflowOnly>
	//*   2    4:ifeq            19
			arraylist = mAdapterMenu.m();
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//    5   11:invokevirtual   #43  <Method ArrayList MenuBuilder.m()>
	//    6   14:astore          4
		else
	//*   7   16:goto            28
			arraylist = mAdapterMenu.j();
	//    8   19:aload_0         
	//    9   20:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//   10   23:invokevirtual   #61  <Method ArrayList MenuBuilder.j()>
	//   11   26:astore          4
		int k = mExpandedIndex;
	//   12   28:aload_0         
	//   13   29:getfield        #21  <Field int mExpandedIndex>
	//   14   32:istore_3        
		int j = i;
	//   15   33:iload_1         
	//   16   34:istore_2        
		if(k >= 0)
	//*  17   35:iload_3         
	//*  18   36:iflt            50
		{
			j = i;
	//   19   39:iload_1         
	//   20   40:istore_2        
			if(i >= k)
	//*  21   41:iload_1         
	//*  22   42:iload_3         
	//*  23   43:icmplt          50
				j = i + 1;
	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
		}
		return (MenuItemImpl)arraylist.get(j);
	//   28   50:aload           4
	//   29   52:iload_2         
	//   30   53:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//   31   56:checkcast       #55  <Class MenuItemImpl>
	//   32   59:areturn         
	}

	public volatile Object getItem(int i)
	{
		return ((Object) (getItem(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #69  <Method MenuItemImpl getItem(int)>
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
		View view1 = view;
	//    0    0:aload_2         
	//    1    1:astore          7
		if(view == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       22
			view1 = mInflater.inflate(mItemLayoutRes, viewgroup, false);
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field LayoutInflater mInflater>
	//    6   11:aload_0         
	//    7   12:getfield        #29  <Field int mItemLayoutRes>
	//    8   15:aload_3         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #79  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   11   20:astore          7
		int k = getItem(i).getGroupId();
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #69  <Method MenuItemImpl getItem(int)>
	//   15   27:invokevirtual   #82  <Method int MenuItemImpl.getGroupId()>
	//   16   30:istore          5
		int j = i - 1;
	//   17   32:iload_1         
	//   18   33:iconst_1        
	//   19   34:isub            
	//   20   35:istore          4
		if(j >= 0)
	//*  21   37:iload           4
	//*  22   39:iflt            56
			j = getItem(j).getGroupId();
	//   23   42:aload_0         
	//   24   43:iload           4
	//   25   45:invokevirtual   #69  <Method MenuItemImpl getItem(int)>
	//   26   48:invokevirtual   #82  <Method int MenuItemImpl.getGroupId()>
	//   27   51:istore          4
		else
	//*  28   53:goto            60
			j = k;
	//   29   56:iload           5
	//   30   58:istore          4
		view = ((View) ((ListMenuItemView)view1));
	//   31   60:aload           7
	//   32   62:checkcast       #84  <Class ListMenuItemView>
	//   33   65:astore_2        
		boolean flag;
		if(mAdapterMenu.b() && k != j)
	//*  34   66:aload_0         
	//*  35   67:getfield        #27  <Field MenuBuilder mAdapterMenu>
	//*  36   70:invokevirtual   #87  <Method boolean MenuBuilder.b()>
	//*  37   73:ifeq            89
	//*  38   76:iload           5
	//*  39   78:iload           4
	//*  40   80:icmpeq          89
			flag = true;
	//   41   83:iconst_1        
	//   42   84:istore          6
		else
	//*  43   86:goto            92
			flag = false;
	//   44   89:iconst_0        
	//   45   90:istore          6
		((ListMenuItemView) (view)).setGroupDividerEnabled(flag);
	//   46   92:aload_2         
	//   47   93:iload           6
	//   48   95:invokevirtual   #91  <Method void ListMenuItemView.setGroupDividerEnabled(boolean)>
		viewgroup = ((ViewGroup) ((MenuView.ItemView)view1));
	//   49   98:aload           7
	//   50  100:checkcast       #93  <Class MenuView$ItemView>
	//   51  103:astore_3        
		if(mForceShowIcon)
	//*  52  104:aload_0         
	//*  53  105:getfield        #65  <Field boolean mForceShowIcon>
	//*  54  108:ifeq            116
			((ListMenuItemView) (view)).setForceShowIcon(true);
	//   55  111:aload_2         
	//   56  112:iconst_1        
	//   57  113:invokevirtual   #96  <Method void ListMenuItemView.setForceShowIcon(boolean)>
		((MenuView.ItemView) (viewgroup)).initialize(getItem(i), 0);
	//   58  116:aload_3         
	//   59  117:aload_0         
	//   60  118:iload_1         
	//   61  119:invokevirtual   #69  <Method MenuItemImpl getItem(int)>
	//   62  122:iconst_0        
	//   63  123:invokeinterface #100 <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
		return view1;
	//   64  128:aload           7
	//   65  130:areturn         
	}

	public void notifyDataSetChanged()
	{
		findExpandedIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method void findExpandedIndex()>
		super.notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:invokespecial   #103 <Method void BaseAdapter.notifyDataSetChanged()>
	//    4    8:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean mForceShowIcon>
	//    3    5:return          
	}

	MenuBuilder mAdapterMenu;
	private int mExpandedIndex;
	private boolean mForceShowIcon;
	private final LayoutInflater mInflater;
	private final int mItemLayoutRes;
	private final boolean mOverflowOnly;
}
