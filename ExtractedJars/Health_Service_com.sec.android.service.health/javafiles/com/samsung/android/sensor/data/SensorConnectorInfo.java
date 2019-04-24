// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sensor.aidl.ISensorDeviceScanCallback;

public class SensorConnectorInfo
	implements Parcelable
{

	public SensorConnectorInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mScanDataTypeFilter = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field int mScanDataTypeFilter>
		mScanConnectionTypeFilter = SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_NONE;
	//    5    9:aload_0         
	//    6   10:getstatic       #36  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_NONE>
	//    7   13:putfield        #38  <Field SensorTypes$SensorConnectionType mScanConnectionTypeFilter>
		mScanCallback = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #40  <Field ISensorDeviceScanCallback mScanCallback>
		readFromParcel(parcel);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #43  <Method void readFromParcel(Parcel)>
	//   14   26:return          
	}

	public SensorConnectorInfo(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mScanDataTypeFilter = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field int mScanDataTypeFilter>
		mScanConnectionTypeFilter = SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_NONE;
	//    5    9:aload_0         
	//    6   10:getstatic       #36  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_NONE>
	//    7   13:putfield        #38  <Field SensorTypes$SensorConnectionType mScanConnectionTypeFilter>
		mScanCallback = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #40  <Field ISensorDeviceScanCallback mScanCallback>
		mName = s;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #46  <Field String mName>
	//   14   26:return          
	}

	private void readFromParcel(Parcel parcel)
	{
		mName = parcel.readString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method String Parcel.readString()>
	//    3    5:putfield        #46  <Field String mName>
		mScanDataTypeFilter = parcel.readInt();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #56  <Method int Parcel.readInt()>
	//    7   13:putfield        #31  <Field int mScanDataTypeFilter>
		mScanConnectionTypeFilter = SensorTypes.SensorConnectionType.values()[parcel.readInt()];
	//    8   16:aload_0         
	//    9   17:invokestatic    #60  <Method SensorTypes$SensorConnectionType[] SensorTypes$SensorConnectionType.values()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #56  <Method int Parcel.readInt()>
	//   12   24:aaload          
	//   13   25:putfield        #38  <Field SensorTypes$SensorConnectionType mScanConnectionTypeFilter>
	//   14   28:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ISensorDeviceScanCallback getDeviceScanCallback()
	{
		return mScanCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ISensorDeviceScanCallback mScanCallback>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mName>
	//    2    4:areturn         
	}

	public SensorTypes.SensorConnectionType getScanConnectionTypeFilter()
	{
		return mScanConnectionTypeFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field SensorTypes$SensorConnectionType mScanConnectionTypeFilter>
	//    2    4:areturn         
	}

	public int getScanDataTypeFilter()
	{
		return mScanDataTypeFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mScanDataTypeFilter>
	//    2    4:ireturn         
	}

	public void setDeviceScanCallback(ISensorDeviceScanCallback isensordevicescancallback)
	{
		mScanCallback = isensordevicescancallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field ISensorDeviceScanCallback mScanCallback>
	//    3    5:return          
	}

	public void setScanConnectionTypeFilter(SensorTypes.SensorConnectionType sensorconnectiontype)
	{
		mScanConnectionTypeFilter = sensorconnectiontype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field SensorTypes$SensorConnectionType mScanConnectionTypeFilter>
	//    3    5:return          
	}

	public void setScanDataTypeFilter(int i)
	{
		mScanDataTypeFilter = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mScanDataTypeFilter>
	//    3    5:return          
	}

	public String toString()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mName>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mName);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field String mName>
	//    3    5:invokevirtual   #79  <Method void Parcel.writeString(String)>
		parcel.writeInt(mScanDataTypeFilter);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int mScanDataTypeFilter>
	//    7   13:invokevirtual   #82  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mScanConnectionTypeFilter.ordinal());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field SensorTypes$SensorConnectionType mScanConnectionTypeFilter>
	//   11   21:invokevirtual   #85  <Method int SensorTypes$SensorConnectionType.ordinal()>
	//   12   24:invokevirtual   #82  <Method void Parcel.writeInt(int)>
	//   13   27:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SensorConnectorInfo createFromParcel(Parcel parcel)
		{
			return new SensorConnectorInfo(parcel);
		//    0    0:new             #9   <Class SensorConnectorInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void SensorConnectorInfo(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method SensorConnectorInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SensorConnectorInfo[] newArray(int i)
		{
			return new SensorConnectorInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SensorConnectorInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method SensorConnectorInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private String mName;
	private ISensorDeviceScanCallback mScanCallback;
	private SensorTypes.SensorConnectionType mScanConnectionTypeFilter;
	private int mScanDataTypeFilter;

	static 
	{
	//    0    0:new             #8   <Class SensorConnectorInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void SensorConnectorInfo$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
