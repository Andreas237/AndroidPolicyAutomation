// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import android.view.ViewGroup;
import com.ibotta.android.mvp.ui.activity.account.holder.AbstractAccountViewHolder;
import com.ibotta.android.mvp.ui.activity.account.holder.AccountViewHolderFactory;
import com.ibotta.android.mvp.ui.activity.account.row.AbstractAccountRow;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountAdapterListener

public class AccountAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

	public AccountAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		accountRows = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List accountRows>
		factory = new AccountViewHolderFactory();
	//    7   15:aload_0         
	//    8   16:new             #23  <Class AccountViewHolderFactory>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void AccountViewHolderFactory()>
	//   11   23:putfield        #26  <Field AccountViewHolderFactory factory>
	//   12   26:return          
	}

	public int getItemCount()
	{
		return accountRows.size();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List accountRows>
	//    2    4:invokeinterface #34  <Method int List.size()>
	//    3    9:ireturn         
	}

	public int getItemViewType(int i)
	{
		return ((AbstractAccountRow)accountRows.get(i)).getType();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List accountRows>
	//    2    4:iload_1         
	//    3    5:invokeinterface #40  <Method Object List.get(int)>
	//    4   10:checkcast       #42  <Class AbstractAccountRow>
	//    5   13:invokevirtual   #45  <Method int AbstractAccountRow.getType()>
	//    6   16:ireturn         
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((AbstractAccountViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class AbstractAccountViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #52  <Method void onBindViewHolder(AbstractAccountViewHolder, int)>
	//    5    9:return          
	}

	public void onBindViewHolder(AbstractAccountViewHolder abstractaccountviewholder, int i)
	{
		abstractaccountviewholder.bind((AbstractAccountRow)accountRows.get(i), listener);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field List accountRows>
	//    3    5:iload_2         
	//    4    6:invokeinterface #40  <Method Object List.get(int)>
	//    5   11:checkcast       #42  <Class AbstractAccountRow>
	//    6   14:aload_0         
	//    7   15:getfield        #54  <Field AccountAdapterListener listener>
	//    8   18:invokevirtual   #58  <Method void AbstractAccountViewHolder.bind(AbstractAccountRow, AccountAdapterListener)>
	//    9   21:return          
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #63  <Method AbstractAccountViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public AbstractAccountViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return factory.createViewHolder(viewgroup, i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AccountViewHolderFactory factory>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #66  <Method AbstractAccountViewHolder AccountViewHolderFactory.createViewHolder(ViewGroup, int)>
	//    5    9:areturn         
	}

	public void setAccountMenu(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			accountRows = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field List accountRows>
		else
	//*   5    9:goto            21
			accountRows.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field List accountRows>
	//    8   16:invokeinterface #71  <Method void List.clear()>
		notifyDataSetChanged();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #74  <Method void notifyDataSetChanged()>
	//   11   25:return          
	}

	public void setListener(AccountAdapterListener accountadapterlistener)
	{
		listener = accountadapterlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field AccountAdapterListener listener>
	//    3    5:return          
	}

	private List accountRows;
	private AccountViewHolderFactory factory;
	private AccountAdapterListener listener;
}
