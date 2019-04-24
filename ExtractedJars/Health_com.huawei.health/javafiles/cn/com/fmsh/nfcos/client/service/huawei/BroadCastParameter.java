// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class BroadCastParameter
	implements Parcelable
{

	public BroadCastParameter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		broadcastType = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method int Parcel.readInt()>
	//    3    5:putfield        #34  <Field int broadcastType>
		process = parcel.readInt();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method int Parcel.readInt()>
	//    7   13:putfield        #36  <Field int process>
	//    8   16:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(broadcastType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int broadcastType>
	//    3    5:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(process);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field int process>
	//    7   13:invokevirtual   #42  <Method void Parcel.writeInt(int)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public BroadCastParameter createFromParcel(Parcel parcel)
		{
			BroadCastParameter broadcastparameter = new BroadCastParameter();
		//    0    0:new             #9   <Class BroadCastParameter>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void BroadCastParameter()>
		//    3    7:astore_2        
			broadcastparameter.broadcastType = parcel.readInt();
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
		//    7   13:putfield        #27  <Field int BroadCastParameter.broadcastType>
			broadcastparameter.process = parcel.readInt();
		//    8   16:aload_2         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #23  <Method int Parcel.readInt()>
		//   11   21:putfield        #30  <Field int BroadCastParameter.process>
			return broadcastparameter;
		//   12   24:aload_2         
		//   13   25:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #33  <Method BroadCastParameter createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public BroadCastParameter[] newArray(int i)
		{
			return new BroadCastParameter[i];
		//    0    0:iload_1         
		//    1    1:anewarray       BroadCastParameter[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #38  <Method BroadCastParameter[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public int broadcastType;
	public int process;

	static 
	{
	//    0    0:new             #8   <Class BroadCastParameter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void BroadCastParameter$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
