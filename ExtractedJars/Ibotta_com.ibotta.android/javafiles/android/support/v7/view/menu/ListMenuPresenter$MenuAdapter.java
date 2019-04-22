// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.*;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view.menu:
//			ListMenuPresenter, MenuBuilder, MenuItemImpl

private class ListMenuPresenter$MenuAdapter extends BaseAdapter
{

	void findExpandedIndex()
	{
		MenuItemImpl menuitemimpl = mMenu.getExpandedItem();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ListMenuPresenter this$0>
	//    2    4:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
	//    3    7:invokevirtual   #34  <Method MenuItemImpl MenuBuilder.getExpandedItem()>
	//    4   10:astore_3        
		if(menuitemimpl != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          66
		{
			ArrayList arraylist = mMenu.getNonActionItems();
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field ListMenuPresenter this$0>
	//    9   19:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
	//   10   22:invokevirtual   #38  <Method ArrayList MenuBuilder.getNonActionItems()>
	//   11   25:astore          4
			int j = arraylist.size();
	//   12   27:aload           4
	//   13   29:invokevirtual   #44  <Method int ArrayList.size()>
	//   14   32:istore_2        
			for(int i = 0; i < j; i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:iload_2         
	//*  19   37:icmpge          66
				if((MenuItemImpl)arraylist.get(i) == menuitemimpl)
	//*  20   40:aload           4
	//*  21   42:iload_1         
	//*  22   43:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//*  23   46:checkcast       #50  <Class MenuItemImpl>
	//*  24   49:aload_3         
	//*  25   50:if_acmpne       59
				{
					mExpandedIndex = i;
	//   26   53:aload_0         
	//   27   54:iload_1         
	//   28   55:putfield        #20  <Field int mExpandedIndex>
					return;
	//   29   58:return          
				}

	//   30   59:iload_1         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_1        
		}
	//*  34   63:goto            35
		mExpandedIndex = -1;
	//   35   66:aload_0         
	//   36   67:iconst_m1       
	//   37   68:putfield        #20  <Field int mExpandedIndex>
	//   38   71:return          
	}

	public int getCount()
	{
		int i = mMenu.getNonActionItems().size() - mItemIndexOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ListMenuPresenter this$0>
	//    2    4:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
	//    3    7:invokevirtual   #38  <Method ArrayList MenuBuilder.getNonActionItems()>
	//    4   10:invokevirtual   #44  <Method int ArrayList.size()>
	//    5   13:aload_0         
	//    6   14:getfield        #15  <Field ListMenuPresenter this$0>
	//    7   17:getfield        #54  <Field int ListMenuPresenter.mItemIndexOffset>
	//    8   20:isub            
	//    9   21:istore_1        
		if(mExpandedIndex < 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #20  <Field int mExpandedIndex>
	//*  12   26:ifge            31
			return i;
	//   13   29:iload_1         
	//   14   30:ireturn         
		else
			return i - 1;
	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:ireturn         
	}

	public MenuItemImpl getItem(int i)
	{
		ArrayList arraylist = mMenu.getNonActionItems();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ListMenuPresenter this$0>
	//    2    4:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
	//    3    7:invokevirtual   #38  <Method ArrayList MenuBuilder.getNonActionItems()>
	//    4   10:astore          4
		int j = i + mItemIndexOffset;
	//    5   12:iload_1         
	//    6   13:aload_0         
	//    7   14:getfield        #15  <Field ListMenuPresenter this$0>
	//    8   17:getfield        #54  <Field int ListMenuPresenter.mItemIndexOffset>
	//    9   20:iadd            
	//   10   21:istore_2        
		int k = mExpandedIndex;
	//   11   22:aload_0         
	//   12   23:getfield        #20  <Field int mExpandedIndex>
	//   13   26:istore_3        
		i = j;
	//   14   27:iload_2         
	//   15   28:istore_1        
		if(k >= 0)
	//*  16   29:iload_3         
	//*  17   30:iflt            44
		{
			i = j;
	//   18   33:iload_2         
	//   19   34:istore_1        
			if(j >= k)
	//*  20   35:iload_2         
	//*  21   36:iload_3         
	//*  22   37:icmplt          44
				i = j + 1;
	//   23   40:iload_2         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_1        
		}
		return (MenuItemImpl)arraylist.get(i);
	//   27   44:aload           4
	//   28   46:iload_1         
	//   29   47:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   30   50:checkcast       #50  <Class MenuItemImpl>
	//   31   53:areturn         
	}

	public volatile Object getItem(int i)
	{
		return ((Object) (getItem(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #58  <Method MenuItemImpl getItem(int)>
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
	//    1    1:astore          4
		if(view == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       28
			view1 = mInflater.inflate(mItemLayoutRes, viewgroup, false);
	//    4    7:aload_0         
	//    5    8:getfield        #15  <Field ListMenuPresenter this$0>
	//    6   11:getfield        #66  <Field LayoutInflater ListMenuPresenter.mInflater>
	//    7   14:aload_0         
	//    8   15:getfield        #15  <Field ListMenuPresenter this$0>
	//    9   18:getfield        #69  <Field int ListMenuPresenter.mItemLayoutRes>
	//   10   21:aload_3         
	//   11   22:iconst_0        
	//   12   23:invokevirtual   #75  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   13   26:astore          4
		((MenuView.ItemView)view1).initialize(getItem(i), 0);
	//   14   28:aload           4
	//   15   30:checkcast       #77  <Class MenuView$ItemView>
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:invokevirtual   #58  <Method MenuItemImpl getItem(int)>
	//   19   38:iconst_0        
	//   20   39:invokeinterface #81  <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
		return view1;
	//   21   44:aload           4
	//   22   46:areturn         
	}

	public void notifyDataSetChanged()
	{
		findExpandedIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method void findExpandedIndex()>
		super.notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:invokespecial   #84  <Method void BaseAdapter.notifyDataSetChanged()>
	//    4    8:return          
	}

	private int mExpandedIndex;
	final ListMenuPresenter this$0;

	public ListMenuPresenter$MenuAdapter()
	{
		this$0 = ListMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ListMenuPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void BaseAdapter()>
		mExpandedIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #20  <Field int mExpandedIndex>
		findExpandedIndex();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #23  <Method void findExpandedIndex()>
	//   10   18:return          
	}
}
