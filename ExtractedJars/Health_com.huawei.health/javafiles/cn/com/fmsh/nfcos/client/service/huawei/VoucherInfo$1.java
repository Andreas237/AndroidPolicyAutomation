// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			VoucherInfo

class VoucherInfo$1
	implements android.os.ator
{

	public VoucherInfo createFromParcel(Parcel parcel)
	{
		VoucherInfo voucherinfo = new VoucherInfo();
	//    0    0:new             #9   <Class VoucherInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void VoucherInfo()>
	//    3    7:astore_2        
		voucherinfo.token = VoucherInfo.readBytesWithNull(parcel);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokestatic    #21  <Method byte[] VoucherInfo.readBytesWithNull(Parcel)>
	//    7   13:putfield        #25  <Field byte[] VoucherInfo.token>
		return voucherinfo;
	//    8   16:aload_2         
	//    9   17:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method VoucherInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public VoucherInfo[] newArray(int i)
	{
		return new VoucherInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       VoucherInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method VoucherInfo[] newArray(int)>
	//    3    5:areturn         
	}

	VoucherInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
