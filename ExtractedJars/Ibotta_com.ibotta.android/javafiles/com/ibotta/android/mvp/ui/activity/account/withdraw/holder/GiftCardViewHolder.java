// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.view.View;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.AbstractWithdrawRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.GiftCardRow;
import com.ibotta.android.mvp.ui.view.account.withdraw.GiftCardView;
import com.ibotta.api.model.card.GiftCard;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.holder:
//			AbstractWithdrawViewHolder

public class GiftCardViewHolder extends AbstractWithdrawViewHolder
{

	public GiftCardViewHolder(GiftCardView giftcardview)
	{
		super(((View) (giftcardview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void AbstractWithdrawViewHolder(View)>
		gcvGiftCard = giftcardview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #19  <Field GiftCardView gcvGiftCard>
	//    6   10:return          
	}

	private void onGiftCardClicked(GiftCard giftcard)
	{
		WithdrawAdapterListener withdrawadapterlistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WithdrawAdapterListener listener>
	//    2    4:astore_2        
		if(withdrawadapterlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			withdrawadapterlistener.onGiftCardClicked(giftcard);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method void WithdrawAdapterListener.onGiftCardClicked(GiftCard)>
	//    8   16:return          
	}

	public volatile void bind(AbstractWithdrawRow abstractwithdrawrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		bind((GiftCardRow)abstractwithdrawrow, withdrawadapterlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class GiftCardRow>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void bind(GiftCardRow, WithdrawAdapterListener)>
	//    5    9:return          
	}

	public void bind(GiftCardRow giftcardrow, WithdrawAdapterListener withdrawadapterlistener)
	{
		listener = withdrawadapterlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #28  <Field WithdrawAdapterListener listener>
		withdrawadapterlistener = ((WithdrawAdapterListener) (giftcardrow.getGiftCard().getFirstTemplate()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #42  <Method GiftCard GiftCardRow.getGiftCard()>
	//    5    9:invokevirtual   #48  <Method com.ibotta.api.model.card.GiftCard$Template GiftCard.getFirstTemplate()>
	//    6   12:astore_2        
		if(withdrawadapterlistener != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          28
			gcvGiftCard.setLogoUrl(((com.ibotta.api.model.card.GiftCard.Template) (withdrawadapterlistener)).getThumbnailUrl());
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #54  <Method String com.ibotta.api.model.card.GiftCard$Template.getThumbnailUrl()>
	//   13   25:invokevirtual   #60  <Method void GiftCardView.setLogoUrl(String)>
		gcvGiftCard.setName(giftcardrow.getGiftCard().getName());
	//   14   28:aload_0         
	//   15   29:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #42  <Method GiftCard GiftCardRow.getGiftCard()>
	//   18   36:invokevirtual   #63  <Method String GiftCard.getName()>
	//   19   39:invokevirtual   #66  <Method void GiftCardView.setName(String)>
		gcvGiftCard.setMinimum(giftcardrow.getGiftCard().getMinimum());
	//   20   42:aload_0         
	//   21   43:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #42  <Method GiftCard GiftCardRow.getGiftCard()>
	//   24   50:invokevirtual   #70  <Method float GiftCard.getMinimum()>
	//   25   53:invokevirtual   #74  <Method void GiftCardView.setMinimum(float)>
		gcvGiftCard.setBelowMinimumBalance(giftcardrow.isBelowMinimumBalance());
	//   26   56:aload_0         
	//   27   57:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   28   60:aload_1         
	//   29   61:invokevirtual   #78  <Method boolean GiftCardRow.isBelowMinimumBalance()>
	//   30   64:invokevirtual   #82  <Method void GiftCardView.setBelowMinimumBalance(boolean)>
		gcvGiftCard.setEnabled(giftcardrow.isBelowMinimumBalance() ^ true);
	//   31   67:aload_0         
	//   32   68:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   33   71:aload_1         
	//   34   72:invokevirtual   #78  <Method boolean GiftCardRow.isBelowMinimumBalance()>
	//   35   75:iconst_1        
	//   36   76:ixor            
	//   37   77:invokevirtual   #85  <Method void GiftCardView.setEnabled(boolean)>
		gcvGiftCard.setTag(((Object) (giftcardrow.getGiftCard())));
	//   38   80:aload_0         
	//   39   81:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   40   84:aload_1         
	//   41   85:invokevirtual   #42  <Method GiftCard GiftCardRow.getGiftCard()>
	//   42   88:invokevirtual   #89  <Method void GiftCardView.setTag(Object)>
		giftcardrow = ((GiftCardRow) (gcvGiftCard));
	//   43   91:aload_0         
	//   44   92:getfield        #19  <Field GiftCardView gcvGiftCard>
	//   45   95:astore_1        
		withdrawadapterlistener = ((WithdrawAdapterListener) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				onGiftCardClicked((GiftCard)view.getTag());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field GiftCardViewHolder this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #29  <Method Object View.getTag()>
			//    4    8:checkcast       #31  <Class GiftCard>
			//    5   11:invokestatic    #35  <Method void GiftCardViewHolder.access$000(GiftCardViewHolder, GiftCard)>
			//    6   14:return          
			}

			final GiftCardViewHolder this$0;

			
			{
				this$0 = GiftCardViewHolder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GiftCardViewHolder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   46   96:new             #7   <Class GiftCardViewHolder$1>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokespecial   #92  <Method void GiftCardViewHolder$1(GiftCardViewHolder)>
	//   50  104:astore_2        
		if(!(giftcardrow instanceof View))
	//*  51  105:aload_1         
	//*  52  106:instanceof      #94  <Class View>
	//*  53  109:ifne            118
		{
			((GiftCardView) (giftcardrow)).setOnClickListener(((android.view.View.OnClickListener) (withdrawadapterlistener)));
	//   54  112:aload_1         
	//   55  113:aload_2         
	//   56  114:invokevirtual   #98  <Method void GiftCardView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   57  117:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)giftcardrow, ((android.view.View.OnClickListener) (withdrawadapterlistener)));
	//   58  118:aload_1         
	//   59  119:checkcast       #94  <Class View>
	//   60  122:aload_2         
	//   61  123:invokestatic    #103 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   62  126:return          
		}
	}

	private final GiftCardView gcvGiftCard;
	private WithdrawAdapterListener listener;


/*
	static void access$000(GiftCardViewHolder giftcardviewholder, GiftCard giftcard)
	{
		giftcardviewholder.onGiftCardClicked(giftcard);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void onGiftCardClicked(GiftCard)>
		return;
	//    3    5:return          
	}

*/
}
