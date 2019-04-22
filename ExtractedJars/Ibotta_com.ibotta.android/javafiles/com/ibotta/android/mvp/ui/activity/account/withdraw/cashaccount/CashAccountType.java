// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;


public final class CashAccountType extends Enum
{

	private CashAccountType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #32  <Method void Enum(String, int)>
		drawableResId = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #34  <Field int drawableResId>
	//    7   11:return          
	}

	public static CashAccountType valueOf(String s)
	{
		return (CashAccountType)Enum.valueOf(com/ibotta/android/mvp/ui/activity/account/withdraw/cashaccount/CashAccountType, s);
	//    0    0:ldc1            #2   <Class CashAccountType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CashAccountType>
	//    4    9:areturn         
	}

	public static CashAccountType[] values()
	{
		return (CashAccountType[])((CashAccountType []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field CashAccountType[] $VALUES>
	//    1    3:invokevirtual   #48  <Method Object _5B_Lcom.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount.CashAccountType_3B_.clone()>
	//    2    6:checkcast       #44  <Class CashAccountType[]>
	//    3    9:areturn         
	}

	public int getDrawableResId()
	{
		return drawableResId;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int drawableResId>
	//    2    4:ireturn         
	}

	private static final CashAccountType $VALUES[];
	public static final CashAccountType PAYPAL;
	public static final CashAccountType VENMO;
	private final int drawableResId;

	static 
	{
		VENMO = new CashAccountType("VENMO", 0, 0x7f080122);
	//    0    0:new             #2   <Class CashAccountType>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "VENMO">
	//    3    6:iconst_0        
	//    4    7:ldc1            #16  <Int 0x7f080122>
	//    5    9:invokespecial   #20  <Method void CashAccountType(String, int, int)>
	//    6   12:putstatic       #22  <Field CashAccountType VENMO>
		PAYPAL = new CashAccountType("PAYPAL", 1, 0x7f080121);
	//    7   15:new             #2   <Class CashAccountType>
	//    8   18:dup             
	//    9   19:ldc1            #23  <String "PAYPAL">
	//   10   21:iconst_1        
	//   11   22:ldc1            #24  <Int 0x7f080121>
	//   12   24:invokespecial   #20  <Method void CashAccountType(String, int, int)>
	//   13   27:putstatic       #26  <Field CashAccountType PAYPAL>
		$VALUES = (new CashAccountType[] {
			VENMO, PAYPAL
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       CashAccountType[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:getstatic       #22  <Field CashAccountType VENMO>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:getstatic       #26  <Field CashAccountType PAYPAL>
	//   23   45:aastore         
	//   24   46:putstatic       #28  <Field CashAccountType[] $VALUES>
	//*  25   49:return          
	}
}
