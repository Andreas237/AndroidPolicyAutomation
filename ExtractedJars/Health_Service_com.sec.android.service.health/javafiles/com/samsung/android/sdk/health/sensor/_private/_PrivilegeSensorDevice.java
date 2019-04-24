// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor._private;

import android.os.*;
import java.util.ArrayList;
import java.util.List;

public class _PrivilegeSensorDevice
	implements Parcelable
{

	public _PrivilegeSensorDevice()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mDataTypeList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ArrayList()>
	//    6   12:putfield        #37  <Field List mDataTypeList>
	//    7   15:return          
	}

	public _PrivilegeSensorDevice(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mDataTypeList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ArrayList()>
	//    6   12:putfield        #37  <Field List mDataTypeList>
		readFromParcel(parcel);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #41  <Method void readFromParcel(Parcel)>
	//   10   20:return          
	}

	public _PrivilegeSensorDevice(String s, String s1, int i, int j, int k, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mDataTypeList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ArrayList()>
	//    6   12:putfield        #37  <Field List mDataTypeList>
		mDeviceId = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #44  <Field String mDeviceId>
		mDeviceName = s1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #46  <Field String mDeviceName>
		mConnectivityType = i;
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:putfield        #48  <Field int mConnectivityType>
		mDeviceType = j;
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:putfield        #50  <Field int mDeviceType>
		mDataTypeList = ((List) (new ArrayList()));
	//   19   36:aload_0         
	//   20   37:new             #34  <Class ArrayList>
	//   21   40:dup             
	//   22   41:invokespecial   #35  <Method void ArrayList()>
	//   23   44:putfield        #37  <Field List mDataTypeList>
		mDataTypeList.add(((Object) (Integer.valueOf(k))));
	//   24   47:aload_0         
	//   25   48:getfield        #37  <Field List mDataTypeList>
	//   26   51:iload           5
	//   27   53:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//   28   56:invokeinterface #62  <Method boolean List.add(Object)>
	//   29   61:pop             
		mExtras = bundle;
	//   30   62:aload_0         
	//   31   63:aload           6
	//   32   65:putfield        #64  <Field Bundle mExtras>
	//   33   68:return          
	}

	private void readFromParcel(Parcel parcel)
	{
		mDeviceId = parcel.readString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #70  <Method String Parcel.readString()>
	//    3    5:putfield        #44  <Field String mDeviceId>
		mDeviceName = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #70  <Method String Parcel.readString()>
	//    7   13:putfield        #46  <Field String mDeviceName>
		mDeviceType = parcel.readInt();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #74  <Method int Parcel.readInt()>
	//   11   21:putfield        #50  <Field int mDeviceType>
		mConnectivityType = parcel.readInt();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #74  <Method int Parcel.readInt()>
	//   15   29:putfield        #48  <Field int mConnectivityType>
		mExtras = parcel.readBundle();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #78  <Method Bundle Parcel.readBundle()>
	//   19   37:putfield        #64  <Field Bundle mExtras>
		parcel.readList(mDataTypeList, ((Class) (java/lang/Integer)).getClassLoader());
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #37  <Field List mDataTypeList>
	//   23   45:ldc1            #52  <Class Integer>
	//   24   47:invokevirtual   #84  <Method ClassLoader Class.getClassLoader()>
	//   25   50:invokevirtual   #88  <Method void Parcel.readList(List, ClassLoader)>
		mObjectId = parcel.readInt();
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #74  <Method int Parcel.readInt()>
	//   29   58:putfield        #90  <Field int mObjectId>
	//   30   61:return          
	}

	public void addDataType(int i)
	{
		if(mDataTypeList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field List mDataTypeList>
	//*   2    4:ifnonnull       18
			mDataTypeList = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #34  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #35  <Method void ArrayList()>
	//    7   15:putfield        #37  <Field List mDataTypeList>
		if(!mDataTypeList.contains(((Object) (Integer.valueOf(i)))))
	//*   8   18:aload_0         
	//*   9   19:getfield        #37  <Field List mDataTypeList>
	//*  10   22:iload_1         
	//*  11   23:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//*  12   26:invokeinterface #95  <Method boolean List.contains(Object)>
	//*  13   31:ifne            48
			mDataTypeList.add(((Object) (Integer.valueOf(i))));
	//   14   34:aload_0         
	//   15   35:getfield        #37  <Field List mDataTypeList>
	//   16   38:iload_1         
	//   17   39:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//   18   42:invokeinterface #62  <Method boolean List.add(Object)>
	//   19   47:pop             
	//   20   48:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getConnectivityType()
	{
		return mConnectivityType;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mConnectivityType>
	//    2    4:ireturn         
	}

	public List getDataType()
	{
		return mDataTypeList;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List mDataTypeList>
	//    2    4:areturn         
	}

	public int getDeviceType()
	{
		return mDeviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int mDeviceType>
	//    2    4:ireturn         
	}

	public String getId()
	{
		return mDeviceId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String mDeviceId>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mDeviceName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mDeviceName>
	//    2    4:areturn         
	}

	public int getObjectId()
	{
		return mObjectId;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int mObjectId>
	//    2    4:ireturn         
	}

	public void setDataType(List list)
	{
		mDataTypeList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field List mDataTypeList>
	//    3    5:return          
	}

	public void setObjectId(int i)
	{
		mObjectId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field int mObjectId>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("_ShealthSensorDevice : deviceId == ").append(mDeviceId).append(", deviceName == ").append(mDeviceName).append(", connectivityType == ").append(mConnectivityType).append(", deviceType == ").append(mDeviceType).append(", dataTypeList == ").append(((Object) (mDataTypeList))).append(", deviceName == ").append(mDeviceName).append(", deviceName == ").append(mDeviceName).append(", deviceName == ").append(mDeviceName).toString();
	//    0    0:new             #112 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void StringBuilder()>
	//    3    7:ldc1            #115 <String "_ShealthSensorDevice : deviceId == ">
	//    4    9:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #44  <Field String mDeviceId>
	//    7   16:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #121 <String ", deviceName == ">
	//    9   21:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #46  <Field String mDeviceName>
	//   12   28:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #123 <String ", connectivityType == ">
	//   14   33:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #48  <Field int mConnectivityType>
	//   17   40:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #128 <String ", deviceType == ">
	//   19   45:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #50  <Field int mDeviceType>
	//   22   52:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #130 <String ", dataTypeList == ">
	//   24   57:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #37  <Field List mDataTypeList>
	//   27   64:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   28   67:ldc1            #121 <String ", deviceName == ">
	//   29   69:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #46  <Field String mDeviceName>
	//   32   76:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:ldc1            #121 <String ", deviceName == ">
	//   34   81:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #46  <Field String mDeviceName>
	//   37   88:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   38   91:ldc1            #121 <String ", deviceName == ">
	//   39   93:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #46  <Field String mDeviceName>
	//   42  100:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   43  103:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   44  106:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mDeviceId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field String mDeviceId>
	//    3    5:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeString(mDeviceName);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field String mDeviceName>
	//    7   13:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeInt(mDeviceType);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field int mDeviceType>
	//   11   21:invokevirtual   #144 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mConnectivityType);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field int mConnectivityType>
	//   15   29:invokevirtual   #144 <Method void Parcel.writeInt(int)>
		parcel.writeBundle(mExtras);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #64  <Field Bundle mExtras>
	//   19   37:invokevirtual   #148 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeList(mDataTypeList);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #37  <Field List mDataTypeList>
	//   23   45:invokevirtual   #151 <Method void Parcel.writeList(List)>
		parcel.writeInt(mObjectId);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #90  <Field int mObjectId>
	//   27   53:invokevirtual   #144 <Method void Parcel.writeInt(int)>
	//   28   56:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public _PrivilegeSensorDevice createFromParcel(Parcel parcel)
		{
			return new _PrivilegeSensorDevice(parcel);
		//    0    0:new             #9   <Class _PrivilegeSensorDevice>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void _PrivilegeSensorDevice(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method _PrivilegeSensorDevice createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public _PrivilegeSensorDevice[] newArray(int i)
		{
			return new _PrivilegeSensorDevice[i];
		//    0    0:iload_1         
		//    1    1:anewarray       _PrivilegeSensorDevice[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method _PrivilegeSensorDevice[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private int mConnectivityType;
	private List mDataTypeList;
	private String mDeviceId;
	private String mDeviceName;
	private int mDeviceType;
	private Bundle mExtras;
	private int mObjectId;

	static 
	{
	//    0    0:new             #8   <Class _PrivilegeSensorDevice$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void _PrivilegeSensorDevice$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
