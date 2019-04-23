// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;

import android.os.Parcel;

// Referenced classes of package io.card.payment:
//			CreditCard

final class CreditCard$1
	implements android.os.eator
{

	public CreditCard a(Parcel parcel)
	{
		return new CreditCard(parcel, ((CreditCard$1) (null)));
	//    0    0:new             #15  <Class CreditCard>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #18  <Method void CreditCard(Parcel, CreditCard$1)>
	//    5    9:areturn         
	}

	public CreditCard[] a(int i)
	{
		return new CreditCard[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CreditCard[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #23  <Method CreditCard a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method CreditCard[] a(int)>
	//    3    5:areturn         
	}

	CreditCard$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
