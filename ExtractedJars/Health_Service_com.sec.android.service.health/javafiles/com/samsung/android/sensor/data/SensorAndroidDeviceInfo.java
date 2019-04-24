// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.Parcel;

// Referenced classes of package com.samsung.android.sensor.data:
//			SensorDeviceInfo

public class SensorAndroidDeviceInfo extends SensorDeviceInfo
{

	public SensorAndroidDeviceInfo(String s, int i, SensorTypes.SensorConnectionType sensorconnectiontype, String s1, int j, String s2, int k)
	{
		super(s, i, sensorconnectiontype, s1, s2, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           6
	//    6    8:iload           7
	//    7   10:invokespecial   #11  <Method void SensorDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, String, int)>
		mDeviceType = j;
	//    8   13:aload_0         
	//    9   14:iload           5
	//   10   16:putfield        #13  <Field int mDeviceType>
	//   11   19:return          
	}

	public int getDeviceType()
	{
		return mDeviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int mDeviceType>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field String mId>
	//    3    5:invokevirtual   #28  <Method void Parcel.writeString(String)>
		parcel.writeInt(mDataType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int mDataType>
	//    7   13:invokevirtual   #35  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mConnectionType.ordinal());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field SensorTypes$SensorConnectionType mConnectionType>
	//   11   21:invokevirtual   #44  <Method int SensorTypes$SensorConnectionType.ordinal()>
	//   12   24:invokevirtual   #35  <Method void Parcel.writeInt(int)>
		parcel.writeString(mDeviceName);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field String mDeviceName>
	//   16   32:invokevirtual   #28  <Method void Parcel.writeString(String)>
		parcel.writeString(mDisplayName);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #50  <Field String mDisplayName>
	//   20   40:invokevirtual   #28  <Method void Parcel.writeString(String)>
		parcel.writeInt(mManufactureId);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #53  <Field int mManufactureId>
	//   24   48:invokevirtual   #35  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mDeviceType);
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #13  <Field int mDeviceType>
	//   28   56:invokevirtual   #35  <Method void Parcel.writeInt(int)>
	//   29   59:return          
	}

	private int mDeviceType;
}
