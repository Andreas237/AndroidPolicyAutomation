// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			InvoiceToken

class InvoiceToken$1
	implements android.os.tor
{

	public InvoiceToken createFromParcel(Parcel parcel)
	{
		InvoiceToken invoicetoken = new InvoiceToken();
	//    0    0:new             #9   <Class InvoiceToken>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void InvoiceToken()>
	//    3    7:astore_2        
		invoicetoken.token = parcel.readString();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
	//    7   13:putfield        #27  <Field String InvoiceToken.token>
		return invoicetoken;
	//    8   16:aload_2         
	//    9   17:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method InvoiceToken createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public InvoiceToken[] newArray(int i)
	{
		return new InvoiceToken[i];
	//    0    0:iload_1         
	//    1    1:anewarray       InvoiceToken[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method InvoiceToken[] newArray(int)>
	//    3    5:areturn         
	}

	InvoiceToken$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
