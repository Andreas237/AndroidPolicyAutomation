// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class VoucherInfo
	implements Parcelable
{

	public VoucherInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	static byte[] readBytesWithNull(Parcel parcel)
	{
		int i = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method int Parcel.readInt()>
	//    2    4:istore_1        
		byte abyte0[] = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(i >= 0)
	//*   5    7:iload_1         
	//*   6    8:iflt            20
		{
			abyte0 = new byte[i];
	//    7   11:iload_1         
	//    8   12:newarray        byte[]
	//    9   14:astore_2        
			parcel.readByteArray(abyte0);
	//   10   15:aload_0         
	//   11   16:aload_2         
	//   12   17:invokevirtual   #34  <Method void Parcel.readByteArray(byte[])>
		}
		return abyte0;
	//   13   20:aload_2         
	//   14   21:areturn         
	}

	static void writeBytesWithNull(Parcel parcel, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			parcel.writeInt(-1);
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		} else
		{
			parcel.writeInt(abyte0.length);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeByteArray(abyte0);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #43  <Method void Parcel.writeByteArray(byte[])>
			return;
	//   13   21:return          
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		token = readBytesWithNull(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #48  <Method byte[] readBytesWithNull(Parcel)>
	//    3    5:putfield        #50  <Field byte[] token>
	//    4    8:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		writeBytesWithNull(parcel, token);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field byte[] token>
	//    3    5:invokestatic    #54  <Method void writeBytesWithNull(Parcel, byte[])>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

	}
;
	public byte token[];

	static 
	{
	//    0    0:new             #8   <Class VoucherInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void VoucherInfo$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
