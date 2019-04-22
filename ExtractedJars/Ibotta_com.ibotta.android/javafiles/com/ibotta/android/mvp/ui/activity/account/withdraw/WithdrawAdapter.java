// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import android.view.ViewGroup;
import com.ibotta.android.mvp.ui.activity.account.withdraw.holder.AbstractWithdrawViewHolder;
import com.ibotta.android.mvp.ui.activity.account.withdraw.holder.WithdrawViewHolderFactory;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.AbstractWithdrawRow;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawAdapterListener

public class WithdrawAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

	public WithdrawAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		rows = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List rows>
		factory = new WithdrawViewHolderFactory();
	//    7   15:aload_0         
	//    8   16:new             #23  <Class WithdrawViewHolderFactory>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void WithdrawViewHolderFactory()>
	//   11   23:putfield        #26  <Field WithdrawViewHolderFactory factory>
	//   12   26:return          
	}

	public AbstractWithdrawRow getItem(int i)
	{
		return (AbstractWithdrawRow)rows.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List rows>
	//    2    4:iload_1         
	//    3    5:invokeinterface #35  <Method Object List.get(int)>
	//    4   10:checkcast       #37  <Class AbstractWithdrawRow>
	//    5   13:areturn         
	}

	public int getItemCount()
	{
		return rows.size();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List rows>
	//    2    4:invokeinterface #42  <Method int List.size()>
	//    3    9:ireturn         
	}

	public int getItemViewType(int i)
	{
		return ((AbstractWithdrawRow)rows.get(i)).getType();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List rows>
	//    2    4:iload_1         
	//    3    5:invokeinterface #35  <Method Object List.get(int)>
	//    4   10:checkcast       #37  <Class AbstractWithdrawRow>
	//    5   13:invokevirtual   #47  <Method int AbstractWithdrawRow.getType()>
	//    6   16:ireturn         
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((AbstractWithdrawViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class AbstractWithdrawViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #54  <Method void onBindViewHolder(AbstractWithdrawViewHolder, int)>
	//    5    9:return          
	}

	public void onBindViewHolder(AbstractWithdrawViewHolder abstractwithdrawviewholder, int i)
	{
		abstractwithdrawviewholder.bind((AbstractWithdrawRow)rows.get(i), listener);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field List rows>
	//    3    5:iload_2         
	//    4    6:invokeinterface #35  <Method Object List.get(int)>
	//    5   11:checkcast       #37  <Class AbstractWithdrawRow>
	//    6   14:aload_0         
	//    7   15:getfield        #56  <Field WithdrawAdapterListener listener>
	//    8   18:invokevirtual   #60  <Method void AbstractWithdrawViewHolder.bind(AbstractWithdrawRow, WithdrawAdapterListener)>
	//    9   21:return          
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #65  <Method AbstractWithdrawViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public AbstractWithdrawViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return factory.createViewHolder(viewgroup, i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WithdrawViewHolderFactory factory>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #68  <Method AbstractWithdrawViewHolder WithdrawViewHolderFactory.createViewHolder(ViewGroup, int)>
	//    5    9:areturn         
	}

	public void setListener(WithdrawAdapterListener withdrawadapterlistener)
	{
		listener = withdrawadapterlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field WithdrawAdapterListener listener>
	//    3    5:return          
	}

	public void setRows(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			rows = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field List rows>
		else
	//*   5    9:goto            21
			rows.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field List rows>
	//    8   16:invokeinterface #75  <Method void List.clear()>
		notifyDataSetChanged();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #78  <Method void notifyDataSetChanged()>
	//   11   25:return          
	}

	private WithdrawViewHolderFactory factory;
	private WithdrawAdapterListener listener;
	private List rows;
}
