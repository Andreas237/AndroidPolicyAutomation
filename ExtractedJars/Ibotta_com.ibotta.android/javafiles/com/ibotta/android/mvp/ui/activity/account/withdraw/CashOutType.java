// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;


public final class CashOutType extends Enum
{

	private CashOutType(String s, int i, String s1, int j, int k)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #43  <Field String name>
		drawableResId = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #45  <Field int drawableResId>
		svgDrawableResId = k;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #47  <Field int svgDrawableResId>
	//   13   23:return          
	}

	public static CashOutType fromString(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		try
		{
			s = ((String) (valueOf(s)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #56  <Method CashOutType valueOf(String)>
	//    6   10:astore_0        
		}
	//*   7   11:aload_0         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   13:astore_0        
		{
			return null;
	//   10   14:aconst_null     
	//   11   15:areturn         
		}
		return ((CashOutType) (s));
	}

	public static CashOutType valueOf(String s)
	{
		return (CashOutType)Enum.valueOf(com/ibotta/android/mvp/ui/activity/account/withdraw/CashOutType, s);
	//    0    0:ldc1            #2   <Class CashOutType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CashOutType>
	//    4    9:areturn         
	}

	public static CashOutType[] values()
	{
		return (CashOutType[])((CashOutType []) ($VALUES)).clone();
	//    0    0:getstatic       #37  <Field CashOutType[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType_3B_.clone()>
	//    2    6:checkcast       #62  <Class CashOutType[]>
	//    3    9:areturn         
	}

	public int getDrawableResId()
	{
		return drawableResId;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int drawableResId>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String name>
	//    2    4:areturn         
	}

	public int getSvgDrawableResId()
	{
		return svgDrawableResId;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int svgDrawableResId>
	//    2    4:ireturn         
	}

	private static final CashOutType $VALUES[];
	public static final CashOutType PAYPAL;
	public static final CashOutType VENMO;
	private final int drawableResId;
	private final String name;
	private final int svgDrawableResId;

	static 
	{
		VENMO = new CashOutType("VENMO", 0, "Venmo", 0x7f080122, 0x7f08028e);
	//    0    0:new             #2   <Class CashOutType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "VENMO">
	//    3    6:iconst_0        
	//    4    7:ldc1            #20  <String "Venmo">
	//    5    9:ldc1            #21  <Int 0x7f080122>
	//    6   11:ldc1            #22  <Int 0x7f08028e>
	//    7   13:invokespecial   #26  <Method void CashOutType(String, int, String, int, int)>
	//    8   16:putstatic       #28  <Field CashOutType VENMO>
		PAYPAL = new CashOutType("PAYPAL", 1, "PayPal", 0x7f080121, 0x7f08028c);
	//    9   19:new             #2   <Class CashOutType>
	//   10   22:dup             
	//   11   23:ldc1            #29  <String "PAYPAL">
	//   12   25:iconst_1        
	//   13   26:ldc1            #31  <String "PayPal">
	//   14   28:ldc1            #32  <Int 0x7f080121>
	//   15   30:ldc1            #33  <Int 0x7f08028c>
	//   16   32:invokespecial   #26  <Method void CashOutType(String, int, String, int, int)>
	//   17   35:putstatic       #35  <Field CashOutType PAYPAL>
		$VALUES = (new CashOutType[] {
			VENMO, PAYPAL
		});
	//   18   38:iconst_2        
	//   19   39:anewarray       CashOutType[]
	//   20   42:dup             
	//   21   43:iconst_0        
	//   22   44:getstatic       #28  <Field CashOutType VENMO>
	//   23   47:aastore         
	//   24   48:dup             
	//   25   49:iconst_1        
	//   26   50:getstatic       #35  <Field CashOutType PAYPAL>
	//   27   53:aastore         
	//   28   54:putstatic       #37  <Field CashOutType[] $VALUES>
	//*  29   57:return          
	}
}
