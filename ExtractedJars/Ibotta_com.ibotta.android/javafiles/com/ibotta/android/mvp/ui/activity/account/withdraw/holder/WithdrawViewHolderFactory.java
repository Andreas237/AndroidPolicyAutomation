// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.holder;

import android.view.ViewGroup;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.WithdrawRowType;
import com.ibotta.android.mvp.ui.view.account.withdraw.CashOutView;
import com.ibotta.android.mvp.ui.view.account.withdraw.GiftCardView;
import com.ibotta.android.views.base.title.TitleBarView;
import com.ibotta.android.views.empty.EmptyView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.holder:
//			GiftCardViewHolder, CashOutViewHolder, EmptyWithdrawViewHolder, TitleBarViewHolder, 
//			AbstractWithdrawViewHolder

public class WithdrawViewHolderFactory
{

	public WithdrawViewHolderFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public AbstractWithdrawViewHolder createViewHolder(ViewGroup viewgroup, int i)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType[];

			static 
			{
				$SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType = new int[WithdrawRowType.values().length];
			//    0    0:invokestatic    #18  <Method WithdrawRowType[] WithdrawRowType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType>
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType[WithdrawRowType.TITLE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType>
			//    5   12:getstatic       #24  <Field WithdrawRowType WithdrawRowType.TITLE>
			//    6   15:invokevirtual   #28  <Method int WithdrawRowType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType>
			//*  10   23:getstatic       #31  <Field WithdrawRowType WithdrawRowType.EMPTY>
			//*  11   26:invokevirtual   #28  <Method int WithdrawRowType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType>
			//*  15   34:getstatic       #34  <Field WithdrawRowType WithdrawRowType.CASH>
			//*  16   37:invokevirtual   #28  <Method int WithdrawRowType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType>
			//*  20   45:getstatic       #37  <Field WithdrawRowType WithdrawRowType.GIFT_CARD>
			//*  21   48:invokevirtual   #28  <Method int WithdrawRowType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType[WithdrawRowType.EMPTY.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType[WithdrawRowType.CASH.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType[WithdrawRowType.GIFT_CARD.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.com.ibotta.android.mvp.ui.activity.account.withdraw.row.WithdrawRowType[WithdrawRowType.values()[i].ordinal()])
	//*   0    0:getstatic       #17  <Field int[] WithdrawViewHolderFactory$1.$SwitchMap$com$ibotta$android$mvp$ui$activity$account$withdraw$row$WithdrawRowType>
	//*   1    3:invokestatic    #23  <Method WithdrawRowType[] WithdrawRowType.values()>
	//*   2    6:iload_2         
	//*   3    7:aaload          
	//*   4    8:invokevirtual   #27  <Method int WithdrawRowType.ordinal()>
	//*   5   11:iaload          
		{
	//*   6   12:tableswitch     1 4: default 44
	//	               1 103
	//	               2 84
	//	               3 65
	//	               4 46
		default:
			return null;
	//    7   44:aconst_null     
	//    8   45:areturn         

		case 4: // '\004'
			return ((AbstractWithdrawViewHolder) (new GiftCardViewHolder(new GiftCardView(viewgroup.getContext()))));
	//    9   46:new             #29  <Class GiftCardViewHolder>
	//   10   49:dup             
	//   11   50:new             #31  <Class GiftCardView>
	//   12   53:dup             
	//   13   54:aload_1         
	//   14   55:invokevirtual   #37  <Method android.content.Context ViewGroup.getContext()>
	//   15   58:invokespecial   #40  <Method void GiftCardView(android.content.Context)>
	//   16   61:invokespecial   #43  <Method void GiftCardViewHolder(GiftCardView)>
	//   17   64:areturn         

		case 3: // '\003'
			return ((AbstractWithdrawViewHolder) (new CashOutViewHolder(new CashOutView(viewgroup.getContext()))));
	//   18   65:new             #45  <Class CashOutViewHolder>
	//   19   68:dup             
	//   20   69:new             #47  <Class CashOutView>
	//   21   72:dup             
	//   22   73:aload_1         
	//   23   74:invokevirtual   #37  <Method android.content.Context ViewGroup.getContext()>
	//   24   77:invokespecial   #48  <Method void CashOutView(android.content.Context)>
	//   25   80:invokespecial   #51  <Method void CashOutViewHolder(CashOutView)>
	//   26   83:areturn         

		case 2: // '\002'
			return ((AbstractWithdrawViewHolder) (new EmptyWithdrawViewHolder(new EmptyView(viewgroup.getContext()))));
	//   27   84:new             #53  <Class EmptyWithdrawViewHolder>
	//   28   87:dup             
	//   29   88:new             #55  <Class EmptyView>
	//   30   91:dup             
	//   31   92:aload_1         
	//   32   93:invokevirtual   #37  <Method android.content.Context ViewGroup.getContext()>
	//   33   96:invokespecial   #56  <Method void EmptyView(android.content.Context)>
	//   34   99:invokespecial   #59  <Method void EmptyWithdrawViewHolder(EmptyView)>
	//   35  102:areturn         

		case 1: // '\001'
			return ((AbstractWithdrawViewHolder) (new TitleBarViewHolder(new TitleBarView(viewgroup.getContext()))));
	//   36  103:new             #61  <Class TitleBarViewHolder>
	//   37  106:dup             
	//   38  107:new             #63  <Class TitleBarView>
	//   39  110:dup             
	//   40  111:aload_1         
	//   41  112:invokevirtual   #37  <Method android.content.Context ViewGroup.getContext()>
	//   42  115:invokespecial   #64  <Method void TitleBarView(android.content.Context)>
	//   43  118:invokespecial   #67  <Method void TitleBarViewHolder(TitleBarView)>
	//   44  121:areturn         
		}
	}
}
