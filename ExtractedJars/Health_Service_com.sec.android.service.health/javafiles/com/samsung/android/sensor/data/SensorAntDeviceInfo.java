// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.Parcel;

// Referenced classes of package com.samsung.android.sensor.data:
//			SensorDeviceInfo

public class SensorAntDeviceInfo extends SensorDeviceInfo
{

	public SensorAntDeviceInfo(String s, int i, SensorTypes.SensorConnectionType sensorconnectiontype, String s1, int j, int k, String s2, 
			int l)
	{
		super(s, i, sensorconnectiontype, s1, s2, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           7
	//    6    8:iload           8
	//    7   10:invokespecial   #12  <Method void SensorDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, String, int)>
		mDeviceType = j;
	//    8   13:aload_0         
	//    9   14:iload           5
	//   10   16:putfield        #14  <Field int mDeviceType>
		mDeviceNumber = k;
	//   11   19:aload_0         
	//   12   20:iload           6
	//   13   22:putfield        #16  <Field int mDeviceNumber>
	//   14   25:return          
	}

	public int getDeviceNumber()
	{
		return mDeviceNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int mDeviceNumber>
	//    2    4:ireturn         
	}

	public int getDeviceType()
	{
		return mDeviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int mDeviceType>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[SensorAntDeviceInfo] mDeviceType = ").append(mDeviceType).append(" mDeviceNumber = ").append(mDeviceNumber).append(" ").append(super.toString()).toString();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:ldc1            #29  <String "[SensorAntDeviceInfo] mDeviceType = ">
	//    4    9:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #14  <Field int mDeviceType>
	//    7   16:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #38  <String " mDeviceNumber = ">
	//    9   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field int mDeviceNumber>
	//   12   28:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #40  <String " ">
	//   14   33:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:invokespecial   #42  <Method String SensorDeviceInfo.toString()>
	//   17   40:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   19   46:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field String mId>
	//    3    5:invokevirtual   #55  <Method void Parcel.writeString(String)>
		parcel.writeInt(mDataType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field int mDataType>
	//    7   13:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mConnectionType.ordinal());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #66  <Field SensorTypes$SensorConnectionType mConnectionType>
	//   11   21:invokevirtual   #71  <Method int SensorTypes$SensorConnectionType.ordinal()>
	//   12   24:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		parcel.writeString(mDeviceName);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #74  <Field String mDeviceName>
	//   16   32:invokevirtual   #55  <Method void Parcel.writeString(String)>
		parcel.writeString(mDisplayName);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #77  <Field String mDisplayName>
	//   20   40:invokevirtual   #55  <Method void Parcel.writeString(String)>
		parcel.writeInt(mManufactureId);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #80  <Field int mManufactureId>
	//   24   48:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mDeviceType);
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #14  <Field int mDeviceType>
	//   28   56:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mDeviceNumber);
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:getfield        #16  <Field int mDeviceNumber>
	//   32   64:invokevirtual   #62  <Method void Parcel.writeInt(int)>
	//   33   67:return          
	}

	private int mDeviceNumber;
	private int mDeviceType;
}
