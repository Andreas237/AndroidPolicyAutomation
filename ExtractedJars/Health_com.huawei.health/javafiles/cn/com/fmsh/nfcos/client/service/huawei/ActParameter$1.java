// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			ActParameter

class ActParameter$1
	implements android.os.tor
{

	public ActParameter createFromParcel(Parcel parcel)
	{
		ActParameter actparameter = new ActParameter();
	//    0    0:new             #9   <Class ActParameter>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ActParameter()>
	//    3    7:astore_2        
		actparameter.tagName = parcel.readByte();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method byte Parcel.readByte()>
	//    7   13:putfield        #27  <Field byte ActParameter.tagName>
		actparameter.tagValue = parcel.readString();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #31  <Method String Parcel.readString()>
	//   11   21:putfield        #35  <Field String ActParameter.tagValue>
		return actparameter;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method ActParameter createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ActParameter[] newArray(int i)
	{
		return new ActParameter[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ActParameter[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #43  <Method ActParameter[] newArray(int)>
	//    3    5:areturn         
	}

	ActParameter$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
