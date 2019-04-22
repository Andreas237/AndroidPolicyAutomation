// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.row;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.row:
//			WithdrawRowType

public abstract class AbstractWithdrawRow
{

	public AbstractWithdrawRow(WithdrawRowType withdrawrowtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		rowType = withdrawrowtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field WithdrawRowType rowType>
	//    5    9:return          
	}

	public int getType()
	{
		return rowType.ordinal();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WithdrawRowType rowType>
	//    2    4:invokevirtual   #21  <Method int WithdrawRowType.ordinal()>
	//    3    7:ireturn         
	}

	public WithdrawRowType getTypeEnum()
	{
		return rowType;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WithdrawRowType rowType>
	//    2    4:areturn         
	}

	private final WithdrawRowType rowType;
}
