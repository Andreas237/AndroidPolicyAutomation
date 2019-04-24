// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.Parcel;

// Referenced classes of package com.samsung.android.sensor.data:
//			SensorDeviceInfo

public class SensorSapDeviceInfo extends SensorDeviceInfo
{

	public SensorSapDeviceInfo(String s, int i, SensorTypes.SensorConnectionType sensorconnectiontype, String s1, long l, int j, 
			String s2, int k)
	{
		super(s, i, sensorconnectiontype, s1, s2, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           8
	//    6    8:iload           9
	//    7   10:invokespecial   #13  <Method void SensorDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, String, int)>
		mAccessoryId = l;
	//    8   13:aload_0         
	//    9   14:lload           5
	//   10   16:putfield        #15  <Field long mAccessoryId>
		mTransportId = j;
	//   11   19:aload_0         
	//   12   20:iload           7
	//   13   22:putfield        #17  <Field int mTransportId>
	//   14   25:return          
	}

	public long getAccessoryId()
	{
		return mAccessoryId;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long mAccessoryId>
	//    2    4:lreturn         
	}

	public int getTransportId()
	{
		return mTransportId;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mTransportId>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[SensorSapDeviceInfo] mAccessoryId = ").append(mAccessoryId).append(" mTransportId = ").append(mTransportId).append(" ").append(super.toString()).toString();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:ldc1            #31  <String "[SensorSapDeviceInfo] mAccessoryId = ">
	//    4    9:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #15  <Field long mAccessoryId>
	//    7   16:invokevirtual   #38  <Method StringBuilder StringBuilder.append(long)>
	//    8   19:ldc1            #40  <String " mTransportId = ">
	//    9   21:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field int mTransportId>
	//   12   28:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #45  <String " ">
	//   14   33:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:invokespecial   #47  <Method String SensorDeviceInfo.toString()>
	//   17   40:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   19   46:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field String mId>
	//    3    5:invokevirtual   #60  <Method void Parcel.writeString(String)>
		parcel.writeInt(mDataType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field int mDataType>
	//    7   13:invokevirtual   #67  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mConnectionType.ordinal());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #71  <Field SensorTypes$SensorConnectionType mConnectionType>
	//   11   21:invokevirtual   #76  <Method int SensorTypes$SensorConnectionType.ordinal()>
	//   12   24:invokevirtual   #67  <Method void Parcel.writeInt(int)>
		parcel.writeString(mDeviceName);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #79  <Field String mDeviceName>
	//   16   32:invokevirtual   #60  <Method void Parcel.writeString(String)>
		parcel.writeString(mDisplayName);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #82  <Field String mDisplayName>
	//   20   40:invokevirtual   #60  <Method void Parcel.writeString(String)>
		parcel.writeInt(mManufactureId);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #85  <Field int mManufactureId>
	//   24   48:invokevirtual   #67  <Method void Parcel.writeInt(int)>
		parcel.writeLong(mAccessoryId);
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #15  <Field long mAccessoryId>
	//   28   56:invokevirtual   #89  <Method void Parcel.writeLong(long)>
		parcel.writeInt(mTransportId);
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:getfield        #17  <Field int mTransportId>
	//   32   64:invokevirtual   #67  <Method void Parcel.writeInt(int)>
	//   33   67:return          
	}

	private long mAccessoryId;
	private int mTransportId;
}
