// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			VersionInfo

class VersionInfo$1
	implements android.os.ator
{

	public VersionInfo createFromParcel(Parcel parcel)
	{
		VersionInfo versioninfo = new VersionInfo();
	//    0    0:new             #9   <Class VersionInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void VersionInfo()>
	//    3    7:astore_3        
		versioninfo.version = parcel.readString();
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
	//    7   13:putfield        #27  <Field String VersionInfo.version>
		boolean flag;
		if(parcel.readInt() == 1)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #31  <Method int Parcel.readInt()>
	//*  10   20:iconst_1        
	//*  11   21:icmpne          29
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_2        
		else
	//*  14   26:goto            31
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		versioninfo.isUpdate = flag;
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:putfield        #35  <Field boolean VersionInfo.isUpdate>
		versioninfo.url = parcel.readString();
	//   20   36:aload_3         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #23  <Method String Parcel.readString()>
	//   23   41:putfield        #38  <Field String VersionInfo.url>
		return versioninfo;
	//   24   44:aload_3         
	//   25   45:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method VersionInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public VersionInfo[] newArray(int i)
	{
		return new VersionInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       VersionInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #46  <Method VersionInfo[] newArray(int)>
	//    3    5:areturn         
	}

	VersionInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
