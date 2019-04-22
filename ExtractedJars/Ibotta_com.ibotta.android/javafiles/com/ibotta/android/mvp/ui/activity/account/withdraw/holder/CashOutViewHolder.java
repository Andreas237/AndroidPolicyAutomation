// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.view.View;
import com.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.AbstractWithdrawRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.CashOutRow;
import com.ibotta.android.mvp.ui.view.account.withdraw.CashOutView;
import com.ibotta.api.model.customer.CustomerAccount;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.holder:
//			AbstractWithdrawViewHolder

public class CashOutViewHolder extends AbstractWithdrawViewHolder
{

	public CashOutViewHolder(CashOutView cashoutview)
	{
		super(((View) (cashoutview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void AbstractWithdrawViewHolder(View)>
		coCashOut = cashoutview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field CashOutView coCashOut>
	//    6   10:return          
	}

	public static void lambda$bind$0(CashOutViewHolder cashoutviewholder, View view)
	{
		cashoutviewholder.onLinkAccountClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void onLinkAccountClick()>
	//    2    4:return          
	}

	public static boolean lambda$bind$1(CashOutViewHolder cashoutviewholder, View view)
	{
		cashoutviewholder.onLinkAccountLongClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void onLinkAccountLongClick()>
		return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	}

	private void onLinkAccountClick()
	{
		WithdrawAdapterListener withdrawadapterlistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field WithdrawAdapterListener listener>
	//    2    4:astore_1        
		if(withdrawadapterlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          49
		{
			CustomerAccount customeraccount = customerAccount;
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field CustomerAccount customerAccount>
	//    7   13:astore_2        
			if(customeraccount == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       29
			{
				withdrawadapterlistener.linkAccount(type);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #39  <Field CashOutType type>
	//   13   23:invokeinterface #45  <Method void WithdrawAdapterListener.linkAccount(CashOutType)>
				return;
	//   14   28:return          
			}
			if(customeraccount.isServiceEnabled())
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #51  <Method boolean CustomerAccount.isServiceEnabled()>
	//*  17   33:ifeq            49
				listener.onAccountClicked(customerAccount);
	//   18   36:aload_0         
	//   19   37:getfield        #35  <Field WithdrawAdapterListener listener>
	//   20   40:aload_0         
	//   21   41:getfield        #37  <Field CustomerAccount customerAccount>
	//   22   44:invokeinterface #55  <Method void WithdrawAdapterListener.onAccountClicked(CustomerAccount)>
		}
	//   23   49:return          
	}

	private void onLinkAccountLongClick()
	{
		WithdrawAdapterListener withdrawadapterlistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field WithdrawAdapterListener listener>
	//    2    4:astore_1        
		if(withdrawadapterlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
		{
			CustomerAccount customeraccount = customerAccount;
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field CustomerAccount customerAccount>
	//    7   13:astore_2        
			if(customeraccount != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          25
				withdrawadapterlistener.unlinkAccount(customeraccount);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokeinterface #58  <Method void WithdrawAdapterListener.unlinkAccount(CustomerAccount)>
		}
	//   13   25:return          
	}

	public volatile void bind(AbstractWithdrawRow abstractwithdrawrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		bind((CashOutRow)abstractwithdrawrow, withdrawadapterlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class CashOutRow>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #65  <Method void bind(CashOutRow, WithdrawAdapterListener)>
	//    5    9:return          
	}

	public void bind(CashOutRow cashoutrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		listener = withdrawadapterlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #35  <Field WithdrawAdapterListener listener>
		type = cashoutrow.getCashOutType();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #69  <Method CashOutType CashOutRow.getCashOutType()>
	//    6   10:putfield        #39  <Field CashOutType type>
		customerAccount = cashoutrow.getCustomerAccount();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #73  <Method CustomerAccount CashOutRow.getCustomerAccount()>
	//   10   18:putfield        #37  <Field CustomerAccount customerAccount>
		coCashOut.setLogo(cashoutrow.getCashOutType().getDrawableResId());
	//   11   21:aload_0         
	//   12   22:getfield        #21  <Field CashOutView coCashOut>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #69  <Method CashOutType CashOutRow.getCashOutType()>
	//   15   29:invokevirtual   #79  <Method int CashOutType.getDrawableResId()>
	//   16   32:invokevirtual   #85  <Method void CashOutView.setLogo(int)>
		coCashOut.setMinimum(cashoutrow.getMinimumAmount());
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field CashOutView coCashOut>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #89  <Method float CashOutRow.getMinimumAmount()>
	//   21   43:invokevirtual   #93  <Method void CashOutView.setMinimum(float)>
		coCashOut.setAccount(customerAccount);
	//   22   46:aload_0         
	//   23   47:getfield        #21  <Field CashOutView coCashOut>
	//   24   50:aload_0         
	//   25   51:getfield        #37  <Field CustomerAccount customerAccount>
	//   26   54:invokevirtual   #96  <Method void CashOutView.setAccount(CustomerAccount)>
		coCashOut.setBelowMinimumBalance(cashoutrow.isBelowMinimumBalance());
	//   27   57:aload_0         
	//   28   58:getfield        #21  <Field CashOutView coCashOut>
	//   29   61:aload_1         
	//   30   62:invokevirtual   #99  <Method boolean CashOutRow.isBelowMinimumBalance()>
	//   31   65:invokevirtual   #103 <Method void CashOutView.setBelowMinimumBalance(boolean)>
		cashoutrow = ((CashOutRow) (coCashOut));
	//   32   68:aload_0         
	//   33   69:getfield        #21  <Field CashOutView coCashOut>
	//   34   72:astore_1        
		withdrawadapterlistener = ((WithdrawAdapterListener) (new _2D_..Lambda.CashOutViewHolder.dYGjEvm0svcnGR82InpevSiN47I(this)));
	//   35   73:new             #105 <Class _2D_$$Lambda$CashOutViewHolder$dYGjEvm0svcnGR82InpevSiN47I>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokespecial   #108 <Method void _2D_$$Lambda$CashOutViewHolder$dYGjEvm0svcnGR82InpevSiN47I(CashOutViewHolder)>
	//   39   81:astore_2        
		if(!(cashoutrow instanceof View))
	//*  40   82:aload_1         
	//*  41   83:instanceof      #110 <Class View>
	//*  42   86:ifne            97
			((CashOutView) (cashoutrow)).setOnClickListener(((android.view.View.OnClickListener) (withdrawadapterlistener)));
	//   43   89:aload_1         
	//   44   90:aload_2         
	//   45   91:invokevirtual   #114 <Method void CashOutView.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  46   94:goto            105
			ViewInstrumentation.setOnClickListener((View)cashoutrow, ((android.view.View.OnClickListener) (withdrawadapterlistener)));
	//   47   97:aload_1         
	//   48   98:checkcast       #110 <Class View>
	//   49  101:aload_2         
	//   50  102:invokestatic    #119 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		cashoutrow = ((CashOutRow) (coCashOut));
	//   51  105:aload_0         
	//   52  106:getfield        #21  <Field CashOutView coCashOut>
	//   53  109:astore_1        
		withdrawadapterlistener = ((WithdrawAdapterListener) (new _2D_..Lambda.CashOutViewHolder.Klz6hSEr_2D_WqVapUtI9I_2D_zU_2D_4eoo(this)));
	//   54  110:new             #121 <Class _2D_$$Lambda$CashOutViewHolder$Klz6hSEr_2D_WqVapUtI9I_2D_zU_2D_4eoo>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:invokespecial   #122 <Method void _2D_$$Lambda$CashOutViewHolder$Klz6hSEr_2D_WqVapUtI9I_2D_zU_2D_4eoo(CashOutViewHolder)>
	//   58  118:astore_2        
		if(!(cashoutrow instanceof View))
	//*  59  119:aload_1         
	//*  60  120:instanceof      #110 <Class View>
	//*  61  123:ifne            132
		{
			((CashOutView) (cashoutrow)).setOnLongClickListener(((android.view.View.OnLongClickListener) (withdrawadapterlistener)));
	//   62  126:aload_1         
	//   63  127:aload_2         
	//   64  128:invokevirtual   #126 <Method void CashOutView.setOnLongClickListener(android.view.View$OnLongClickListener)>
			return;
	//   65  131:return          
		} else
		{
			ViewInstrumentation.setOnLongClickListener((View)cashoutrow, ((android.view.View.OnLongClickListener) (withdrawadapterlistener)));
	//   66  132:aload_1         
	//   67  133:checkcast       #110 <Class View>
	//   68  136:aload_2         
	//   69  137:invokestatic    #129 <Method void ViewInstrumentation.setOnLongClickListener(View, android.view.View$OnLongClickListener)>
			return;
	//   70  140:return          
		}
	}

	private final CashOutView coCashOut;
	private CustomerAccount customerAccount;
	private WithdrawAdapterListener listener;
	private CashOutType type;
}
