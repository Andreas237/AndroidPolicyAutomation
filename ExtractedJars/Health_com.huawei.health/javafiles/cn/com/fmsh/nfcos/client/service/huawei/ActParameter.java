// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;
import cn.com.fmsh.util.FM_Bytes;

public class ActParameter
	implements Parcelable
{

	public ActParameter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public ActParameter(byte byte0, byte byte1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		tagName = byte0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field byte tagName>
		tagValue = String.valueOf(((int) (byte1)));
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:invokestatic    #33  <Method String String.valueOf(int)>
	//    8   14:putfield        #35  <Field String tagValue>
	//    9   17:return          
	}

	public ActParameter(byte byte0, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		tagName = byte0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field byte tagName>
		tagValue = String.valueOf(i);
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:invokestatic    #33  <Method String String.valueOf(int)>
	//    8   14:putfield        #35  <Field String tagValue>
	//    9   17:return          
	}

	public ActParameter(byte byte0, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		tagName = byte0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field byte tagName>
		tagValue = FM_Bytes.bytesToHexString(abyte0);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #43  <Method String FM_Bytes.bytesToHexString(byte[])>
	//    8   14:putfield        #35  <Field String tagValue>
	//    9   17:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		tagName = parcel.readByte();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method byte Parcel.readByte()>
	//    3    5:putfield        #27  <Field byte tagName>
		tagValue = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #57  <Method String Parcel.readString()>
	//    7   13:putfield        #35  <Field String tagValue>
	//    8   16:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeByte(tagName);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field byte tagName>
	//    3    5:invokevirtual   #63  <Method void Parcel.writeByte(byte)>
		parcel.writeString(tagValue);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field String tagValue>
	//    7   13:invokevirtual   #67  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

	}
;
	public byte tagName;
	public String tagValue;

	static 
	{
	//    0    0:new             #8   <Class ActParameter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ActParameter$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
