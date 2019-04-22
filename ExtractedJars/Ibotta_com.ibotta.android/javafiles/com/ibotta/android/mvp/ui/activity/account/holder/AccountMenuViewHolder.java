// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.holder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ibotta.android.mvp.ui.activity.account.AccountAdapterListener;
import com.ibotta.android.mvp.ui.activity.account.AccountMenu;
import com.ibotta.android.mvp.ui.activity.account.row.AbstractAccountRow;
import com.ibotta.android.mvp.ui.activity.account.row.AccountMenuRow;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.holder:
//			AbstractAccountViewHolder

public class AccountMenuViewHolder extends AbstractAccountViewHolder
{

	public AccountMenuViewHolder(View view)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void AbstractAccountViewHolder(View)>
		vRoot = view;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #26  <Field View vRoot>
		ButterKnife.bind(((Object) (this)), view);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #32  <Method butterknife.Unbinder ButterKnife.bind(Object, View)>
	//    9   15:pop             
	//   10   16:return          
	}

	public volatile void bind(AbstractAccountRow abstractaccountrow, AccountAdapterListener accountadapterlistener)
	{
		bind((AccountMenuRow)abstractaccountrow, accountadapterlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class AccountMenuRow>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method void bind(AccountMenuRow, AccountAdapterListener)>
	//    5    9:return          
	}

	public void bind(AccountMenuRow accountmenurow, final AccountAdapterListener listener)
	{
		final AccountMenu accountMenu = accountmenurow.getAccountMenu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method AccountMenu AccountMenuRow.getAccountMenu()>
	//    2    4:astore_3        
		ivIcon.setImageResource(accountMenu.getIconResId());
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field ImageView ivIcon>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #51  <Method int AccountMenu.getIconResId()>
	//    7   13:invokevirtual   #57  <Method void ImageView.setImageResource(int)>
		tvName.setText(accountMenu.getNameResId());
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field TextView tvName>
	//   10   20:aload_3         
	//   11   21:invokevirtual   #62  <Method int AccountMenu.getNameResId()>
	//   12   24:invokevirtual   #67  <Method void TextView.setText(int)>
		if(!TextUtils.isEmpty(((CharSequence) (accountmenurow.getExtra()))))
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #71  <Method String AccountMenuRow.getExtra()>
	//*  15   31:invokestatic    #77  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   34:ifne            59
		{
			tvExtra.setVisibility(0);
	//   17   37:aload_0         
	//   18   38:getfield        #79  <Field TextView tvExtra>
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #82  <Method void TextView.setVisibility(int)>
			tvExtra.setText(((CharSequence) (accountmenurow.getExtra())));
	//   21   45:aload_0         
	//   22   46:getfield        #79  <Field TextView tvExtra>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #71  <Method String AccountMenuRow.getExtra()>
	//   25   53:invokevirtual   #85  <Method void TextView.setText(CharSequence)>
		} else
	//*  26   56:goto            68
		{
			tvExtra.setVisibility(8);
	//   27   59:aload_0         
	//   28   60:getfield        #79  <Field TextView tvExtra>
	//   29   63:bipush          8
	//   30   65:invokevirtual   #82  <Method void TextView.setVisibility(int)>
		}
		accountmenurow = ((AccountMenuRow) (vRoot));
	//   31   68:aload_0         
	//   32   69:getfield        #26  <Field View vRoot>
	//   33   72:astore_1        
		listener = ((AccountAdapterListener) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				listener.onRowClicked(accountMenu);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field AccountAdapterListener val$listener>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field AccountMenu val$accountMenu>
			//    4    8:invokeinterface #37  <Method void AccountAdapterListener.onRowClicked(AccountMenu)>
			//    5   13:return          
			}

			final AccountMenuViewHolder this$0;
			final AccountMenu val$accountMenu;
			final AccountAdapterListener val$listener;

			
			{
				this$0 = AccountMenuViewHolder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AccountMenuViewHolder this$0>
				listener = accountadapterlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AccountAdapterListener val$listener>
				accountMenu = accountmenu;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AccountMenu val$accountMenu>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//   34   73:new             #7   <Class AccountMenuViewHolder$1>
	//   35   76:dup             
	//   36   77:aload_0         
	//   37   78:aload_2         
	//   38   79:aload_3         
	//   39   80:invokespecial   #88  <Method void AccountMenuViewHolder$1(AccountMenuViewHolder, AccountAdapterListener, AccountMenu)>
	//   40   83:astore_2        
		if(!(accountmenurow instanceof View))
	//*  41   84:aload_1         
	//*  42   85:instanceof      #90  <Class View>
	//*  43   88:ifne            99
			((View) (accountmenurow)).setOnClickListener(((android.view.View.OnClickListener) (listener)));
	//   44   91:aload_1         
	//   45   92:aload_2         
	//   46   93:invokevirtual   #94  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  47   96:goto            107
			ViewInstrumentation.setOnClickListener((View)accountmenurow, ((android.view.View.OnClickListener) (listener)));
	//   48   99:aload_1         
	//   49  100:checkcast       #90  <Class View>
	//   50  103:aload_2         
	//   51  104:invokestatic    #99  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		vRoot.setFocusable(true);
	//   52  107:aload_0         
	//   53  108:getfield        #26  <Field View vRoot>
	//   54  111:iconst_1        
	//   55  112:invokevirtual   #103 <Method void View.setFocusable(boolean)>
	//   56  115:return          
	}

	protected ImageView ivIcon;
	protected TextView tvExtra;
	protected TextView tvName;
	private final View vRoot;
}
