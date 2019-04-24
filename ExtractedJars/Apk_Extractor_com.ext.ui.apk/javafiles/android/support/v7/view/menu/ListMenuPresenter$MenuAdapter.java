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
	//    4   10:astore_3        
		int j = mItemIndexOffset + i;
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field ListMenuPresenter this$0>
	//    7   15:getfield        #54  <Field int ListMenuPresenter.mItemIndexOffset>
	//    8   18:iload_1         
	//    9   19:iadd            
	//   10   20:istore_2        
		i = j;
	//   11   21:iload_2         
	//   12   22:istore_1        
		if(mExpandedIndex >= 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #20  <Field int mExpandedIndex>
	//*  15   27:iflt            44
		{
			i = j;
	//   16   30:iload_2         
	//   17   31:istore_1        
			if(j >= mExpandedIndex)
	//*  18   32:iload_2         
	//*  19   33:aload_0         
	//*  20   34:getfield        #20  <Field int mExpandedIndex>
	//*  21   37:icmplt          44
				i = j + 1;
	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
		}
		return (MenuItemImpl)arraylist.get(i);
	//   26   44:aload_3         
	//   27   45:iload_1         
	//   28   46:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   29   49:checkcast       #50  <Class MenuItemImpl>
	//   30   52:areturn         
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
		if(view == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       41
			view = mInflater.inflate(mItemLayoutRes, viewgroup, false);
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field ListMenuPresenter this$0>
	//    4    8:getfield        #66  <Field LayoutInflater ListMenuPresenter.mInflater>
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field ListMenuPresenter this$0>
	//    7   15:getfield        #69  <Field int ListMenuPresenter.mItemLayoutRes>
	//    8   18:aload_3         
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #75  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   11   23:astore_2        
		((MenuView.ItemView)view).initialize(getItem(i), 0);
	//   12   24:aload_2         
	//   13   25:checkcast       #77  <Class MenuView$ItemView>
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #58  <Method MenuItemImpl getItem(int)>
	//   17   33:iconst_0        
	//   18   34:invokeinterface #81  <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
		return view;
	//   19   39:aload_2         
	//   20   40:areturn         
	//*  21   41:goto            24
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
