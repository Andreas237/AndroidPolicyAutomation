// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.holder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ibotta.android.mvp.ui.activity.account.AccountRowType;
import com.ibotta.android.mvp.ui.view.account.AccountProfileView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.holder:
//			AccountMenuViewHolder, AccountProfileViewHolder, AbstractAccountViewHolder

public class AccountViewHolderFactory
{

	public AccountViewHolderFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public AbstractAccountViewHolder createViewHolder(ViewGroup viewgroup, int i)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType[];

			static 
			{
				$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType = new int[AccountRowType.values().length];
			//    0    0:invokestatic    #18  <Method AccountRowType[] AccountRowType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType[AccountRowType.PROFILE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
			//    5   12:getstatic       #24  <Field AccountRowType AccountRowType.PROFILE>
			//    6   15:invokevirtual   #28  <Method int AccountRowType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
			//*  10   23:getstatic       #31  <Field AccountRowType AccountRowType.MENU>
			//*  11   26:invokevirtual   #28  <Method int AccountRowType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType[AccountRowType.MENU.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.com.ibotta.android.mvp.ui.activity.account.AccountRowType[AccountRowType.values()[i].ordinal()])
	//*   0    0:getstatic       #17  <Field int[] AccountViewHolderFactory$1.$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountRowType>
	//*   1    3:invokestatic    #23  <Method AccountRowType[] AccountRowType.values()>
	//*   2    6:iload_2         
	//*   3    7:aaload          
	//*   4    8:invokevirtual   #27  <Method int AccountRowType.ordinal()>
	//*   5   11:iaload          
		{
	//*   6   12:tableswitch     1 2: default 36
	//	               1 60
	//	               2 38
		default:
			return null;
	//    7   36:aconst_null     
	//    8   37:areturn         

		case 2: // '\002'
			return ((AbstractAccountViewHolder) (new AccountMenuViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0c0120, ((ViewGroup) (null)), false))));
	//    9   38:new             #29  <Class AccountMenuViewHolder>
	//   10   41:dup             
	//   11   42:aload_1         
	//   12   43:invokevirtual   #35  <Method android.content.Context ViewGroup.getContext()>
	//   13   46:invokestatic    #41  <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//   14   49:ldc1            #42  <Int 0x7f0c0120>
	//   15   51:aconst_null     
	//   16   52:iconst_0        
	//   17   53:invokevirtual   #46  <Method android.view.View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   18   56:invokespecial   #49  <Method void AccountMenuViewHolder(android.view.View)>
	//   19   59:areturn         

		case 1: // '\001'
			return ((AbstractAccountViewHolder) (new AccountProfileViewHolder(new AccountProfileView(viewgroup.getContext()))));
	//   20   60:new             #51  <Class AccountProfileViewHolder>
	//   21   63:dup             
	//   22   64:new             #53  <Class AccountProfileView>
	//   23   67:dup             
	//   24   68:aload_1         
	//   25   69:invokevirtual   #35  <Method android.content.Context ViewGroup.getContext()>
	//   26   72:invokespecial   #56  <Method void AccountProfileView(android.content.Context)>
	//   27   75:invokespecial   #59  <Method void AccountProfileViewHolder(AccountProfileView)>
	//   28   78:areturn         
		}
	}
}
