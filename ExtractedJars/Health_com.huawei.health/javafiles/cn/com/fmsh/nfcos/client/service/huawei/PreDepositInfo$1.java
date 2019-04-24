// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			PreDepositInfo

class PreDepositInfo$1
	implements android.os.r
{

	public PreDepositInfo createFromParcel(Parcel parcel)
	{
		PreDepositInfo predepositinfo = new PreDepositInfo();
	//    0    0:new             #9   <Class PreDepositInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void PreDepositInfo()>
	//    3    7:astore_2        
		predepositinfo.total = parcel.readInt();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
	//    7   13:putfield        #27  <Field int PreDepositInfo.total>
		predepositinfo.blance = parcel.readInt();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #23  <Method int Parcel.readInt()>
	//   11   21:putfield        #30  <Field int PreDepositInfo.blance>
		return predepositinfo;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method PreDepositInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public PreDepositInfo[] newArray(int i)
	{
		return new PreDepositInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PreDepositInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #38  <Method PreDepositInfo[] newArray(int)>
	//    3    5:areturn         
	}

	PreDepositInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
