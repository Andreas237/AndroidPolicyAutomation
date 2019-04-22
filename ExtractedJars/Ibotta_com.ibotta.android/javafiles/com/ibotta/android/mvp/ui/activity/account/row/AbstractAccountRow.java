// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.row;

import com.ibotta.android.mvp.ui.activity.account.AccountRowType;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.row:
//			AccountRow

public abstract class AbstractAccountRow
	implements AccountRow
{

	public AbstractAccountRow(AccountRowType accountrowtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		accountRowType = accountrowtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field AccountRowType accountRowType>
	//    5    9:return          
	}

	public int getType()
	{
		return accountRowType.ordinal();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccountRowType accountRowType>
	//    2    4:invokevirtual   #23  <Method int AccountRowType.ordinal()>
	//    3    7:ireturn         
	}

	private final AccountRowType accountRowType;
}
