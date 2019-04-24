// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.*;

public class SensorData
	implements Parcelable
{

	public SensorData(int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mData = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field Bundle mData>
		mDataType = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #29  <Field int mDataType>
		mData = bundle;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #27  <Field Bundle mData>
	//   11   19:return          
	}

	public SensorData(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mData = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field Bundle mData>
		readFromParcel(parcel);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #33  <Method void readFromParcel(Parcel)>
	//    8   14:return          
	}

	private void readFromParcel(Parcel parcel)
	{
		mDataType = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method int Parcel.readInt()>
	//    3    5:putfield        #29  <Field int mDataType>
		mData = parcel.readBundle();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #43  <Method Bundle Parcel.readBundle()>
	//    7   13:putfield        #27  <Field Bundle mData>
	//    8   16:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Bundle getData()
	{
		return mData;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle mData>
	//    2    4:areturn         
	}

	public int getDataType()
	{
		return mDataType;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mDataType>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[SensorData] mDataType : ").append(mDataType).toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:ldc1            #53  <String "[SensorData] mDataType : ">
	//    4    9:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #29  <Field int mDataType>
	//    7   16:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:invokevirtual   #62  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mDataType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field int mDataType>
	//    3    5:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		parcel.writeBundle(mData);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Bundle mData>
	//    7   13:invokevirtual   #72  <Method void Parcel.writeBundle(Bundle)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SensorData createFromParcel(Parcel parcel)
		{
			return new SensorData(parcel);
		//    0    0:new             #9   <Class SensorData>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void SensorData(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method SensorData createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SensorData[] newArray(int i)
		{
			return new SensorData[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SensorData[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method SensorData[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private Bundle mData;
	private int mDataType;

	static 
	{
	//    0    0:new             #8   <Class SensorData$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void SensorData$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
