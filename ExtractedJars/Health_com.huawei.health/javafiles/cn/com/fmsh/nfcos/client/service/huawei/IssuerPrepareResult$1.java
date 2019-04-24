// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			IssuerPrepareResult

class IssuerPrepareResult$1
	implements android.os.Parcelable.Creator
{

	public IssuerPrepareResult createFromParcel(Parcel parcel)
	{
		IssuerPrepareResult issuerprepareresult = new IssuerPrepareResult();
	//    0    0:new             #9   <Class IssuerPrepareResult>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void IssuerPrepareResult()>
	//    3    7:astore_2        
		issuerprepareresult.sir = IssuerPrepareResult.readBytesWithNull(parcel);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokestatic    #21  <Method byte[] IssuerPrepareResult.readBytesWithNull(Parcel)>
	//    7   13:putfield        #25  <Field byte[] IssuerPrepareResult.sir>
		issuerprepareresult.failDesc = IssuerPrepareResult.readBytesWithNull(parcel);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokestatic    #21  <Method byte[] IssuerPrepareResult.readBytesWithNull(Parcel)>
	//   11   21:putfield        #28  <Field byte[] IssuerPrepareResult.failDesc>
		return issuerprepareresult;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method IssuerPrepareResult createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public IssuerPrepareResult[] newArray(int i)
	{
		return new IssuerPrepareResult[i];
	//    0    0:iload_1         
	//    1    1:anewarray       IssuerPrepareResult[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #36  <Method IssuerPrepareResult[] newArray(int)>
	//    3    5:areturn         
	}

	IssuerPrepareResult$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
