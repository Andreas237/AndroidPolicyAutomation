// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package com.samsung.android.sensor.data:
//			SensorAntDeviceInfo, SensorAndroidDeviceInfo, SensorSapDeviceInfo, SensorUsbDeviceInfo

public class SensorDeviceInfo
	implements Parcelable
{

	public SensorDeviceInfo(String s, int i, SensorTypes.SensorConnectionType sensorconnectiontype, String s1, String s2, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String mId>
		mDataType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int mDataType>
		mConnectionType = sensorconnectiontype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field SensorTypes$SensorConnectionType mConnectionType>
		mDeviceName = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #38  <Field String mDeviceName>
		if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  14   25:aload           5
	//*  15   27:invokestatic    #44  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:iconst_1        
	//*  17   31:icmpeq          47
			mDisplayName = s2;
	//   18   34:aload_0         
	//   19   35:aload           5
	//   20   37:putfield        #46  <Field String mDisplayName>
		else
	//*  21   40:aload_0         
	//*  22   41:iload           6
	//*  23   43:putfield        #48  <Field int mManufactureId>
	//*  24   46:return          
			mDisplayName = s1;
	//   25   47:aload_0         
	//   26   48:aload           4
	//   27   50:putfield        #46  <Field String mDisplayName>
		mManufactureId = j;
	//*  28   53:goto            40
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public SensorTypes.SensorConnectionType getConnectionType()
	{
		return mConnectionType;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SensorTypes$SensorConnectionType mConnectionType>
	//    2    4:areturn         
	}

	public int getDataType()
	{
		return mDataType;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int mDataType>
	//    2    4:ireturn         
	}

	public String getDeviceName()
	{
		return mDeviceName;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mDeviceName>
	//    2    4:areturn         
	}

	public String getDisplayName()
	{
		return mDisplayName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mDisplayName>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mId>
	//    2    4:areturn         
	}

	public int getManufactureId()
	{
		return mManufactureId;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mManufactureId>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[SensorDeviceInfo] mId = ").append(mId).append(" mDataType = ").append(mDataType).append(" mConnectionType = ").append(mConnectionType.ordinal()).append(" mDeviceName = ").append(mDeviceName).append(" mDisplayName =").append(mDisplayName).append(" mManufactureId = ").append(mManufactureId).toString();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:ldc1            #64  <String "[SensorDeviceInfo] mId = ">
	//    4    9:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #32  <Field String mId>
	//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #70  <String " mDataType = ">
	//    9   21:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #34  <Field int mDataType>
	//   12   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #75  <String " mConnectionType = ">
	//   14   33:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #36  <Field SensorTypes$SensorConnectionType mConnectionType>
	//   17   40:invokevirtual   #80  <Method int SensorTypes$SensorConnectionType.ordinal()>
	//   18   43:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   19   46:ldc1            #82  <String " mDeviceName = ">
	//   20   48:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:aload_0         
	//   22   52:getfield        #38  <Field String mDeviceName>
	//   23   55:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:ldc1            #84  <String " mDisplayName =">
	//   25   60:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   26   63:aload_0         
	//   27   64:getfield        #46  <Field String mDisplayName>
	//   28   67:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   29   70:ldc1            #86  <String " mManufactureId = ">
	//   30   72:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   31   75:aload_0         
	//   32   76:getfield        #48  <Field int mManufactureId>
	//   33   79:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   34   82:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   35   85:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field String mId>
	//    3    5:invokevirtual   #96  <Method void Parcel.writeString(String)>
		parcel.writeInt(mDataType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field int mDataType>
	//    7   13:invokevirtual   #100 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mConnectionType.ordinal());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field SensorTypes$SensorConnectionType mConnectionType>
	//   11   21:invokevirtual   #80  <Method int SensorTypes$SensorConnectionType.ordinal()>
	//   12   24:invokevirtual   #100 <Method void Parcel.writeInt(int)>
		parcel.writeString(mDeviceName);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field String mDeviceName>
	//   16   32:invokevirtual   #96  <Method void Parcel.writeString(String)>
		parcel.writeString(mDisplayName);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #46  <Field String mDisplayName>
	//   20   40:invokevirtual   #96  <Method void Parcel.writeString(String)>
		parcel.writeInt(mManufactureId);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #48  <Field int mManufactureId>
	//   24   48:invokevirtual   #100 <Method void Parcel.writeInt(int)>
	//   25   51:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SensorDeviceInfo createFromParcel(Parcel parcel)
		{
			String s = parcel.readString();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method String Parcel.readString()>
		//    2    4:astore          4
			int i = parcel.readInt();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method int Parcel.readInt()>
		//    5   10:istore_2        
			SensorTypes.SensorConnectionType sensorconnectiontype = SensorTypes.SensorConnectionType.values()[parcel.readInt()];
		//    6   11:invokestatic    #32  <Method SensorTypes$SensorConnectionType[] SensorTypes$SensorConnectionType.values()>
		//    7   14:aload_1         
		//    8   15:invokevirtual   #26  <Method int Parcel.readInt()>
		//    9   18:aaload          
		//   10   19:astore          5
			String s1 = parcel.readString();
		//   11   21:aload_1         
		//   12   22:invokevirtual   #22  <Method String Parcel.readString()>
		//   13   25:astore          6
			String s2 = parcel.readString();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #22  <Method String Parcel.readString()>
		//   16   31:astore          7
			int j = parcel.readInt();
		//   17   33:aload_1         
		//   18   34:invokevirtual   #26  <Method int Parcel.readInt()>
		//   19   37:istore_3        
			if(sensorconnectiontype == SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANT)
		//*  20   38:aload           5
		//*  21   40:getstatic       #36  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANT>
		//*  22   43:if_acmpne       72
				return ((SensorDeviceInfo) (new SensorAntDeviceInfo(s, i, sensorconnectiontype, s1, parcel.readInt(), parcel.readInt(), s2, j)));
		//   23   46:new             #38  <Class SensorAntDeviceInfo>
		//   24   49:dup             
		//   25   50:aload           4
		//   26   52:iload_2         
		//   27   53:aload           5
		//   28   55:aload           6
		//   29   57:aload_1         
		//   30   58:invokevirtual   #26  <Method int Parcel.readInt()>
		//   31   61:aload_1         
		//   32   62:invokevirtual   #26  <Method int Parcel.readInt()>
		//   33   65:aload           7
		//   34   67:iload_3         
		//   35   68:invokespecial   #41  <Method void SensorAntDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, int, int, String, int)>
		//   36   71:areturn         
			if(sensorconnectiontype == SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT)
		//*  37   72:aload           5
		//*  38   74:getstatic       #44  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
		//*  39   77:if_acmpne       102
				return ((SensorDeviceInfo) (new SensorAndroidDeviceInfo(s, i, sensorconnectiontype, s1, parcel.readInt(), s2, j)));
		//   40   80:new             #46  <Class SensorAndroidDeviceInfo>
		//   41   83:dup             
		//   42   84:aload           4
		//   43   86:iload_2         
		//   44   87:aload           5
		//   45   89:aload           6
		//   46   91:aload_1         
		//   47   92:invokevirtual   #26  <Method int Parcel.readInt()>
		//   48   95:aload           7
		//   49   97:iload_3         
		//   50   98:invokespecial   #49  <Method void SensorAndroidDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, int, String, int)>
		//   51  101:areturn         
			if(sensorconnectiontype == SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_BLUETOOTH)
		//*  52  102:aload           5
		//*  53  104:getstatic       #52  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_BLUETOOTH>
		//*  54  107:if_acmpne       128
				return new SensorDeviceInfo(s, i, sensorconnectiontype, s1, s2, j);
		//   55  110:new             #9   <Class SensorDeviceInfo>
		//   56  113:dup             
		//   57  114:aload           4
		//   58  116:iload_2         
		//   59  117:aload           5
		//   60  119:aload           6
		//   61  121:aload           7
		//   62  123:iload_3         
		//   63  124:invokespecial   #55  <Method void SensorDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, String, int)>
		//   64  127:areturn         
			if(sensorconnectiontype == SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY)
		//*  65  128:aload           5
		//*  66  130:getstatic       #58  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY>
		//*  67  133:if_acmpne       162
				return ((SensorDeviceInfo) (new SensorSapDeviceInfo(s, i, sensorconnectiontype, s1, parcel.readLong(), parcel.readInt(), s2, j)));
		//   68  136:new             #60  <Class SensorSapDeviceInfo>
		//   69  139:dup             
		//   70  140:aload           4
		//   71  142:iload_2         
		//   72  143:aload           5
		//   73  145:aload           6
		//   74  147:aload_1         
		//   75  148:invokevirtual   #64  <Method long Parcel.readLong()>
		//   76  151:aload_1         
		//   77  152:invokevirtual   #26  <Method int Parcel.readInt()>
		//   78  155:aload           7
		//   79  157:iload_3         
		//   80  158:invokespecial   #67  <Method void SensorSapDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, long, int, String, int)>
		//   81  161:areturn         
			if(sensorconnectiontype == SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_USB)
		//*  82  162:aload           5
		//*  83  164:getstatic       #70  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_USB>
		//*  84  167:if_acmpne       196
				return ((SensorDeviceInfo) (new SensorUsbDeviceInfo(s, i, sensorconnectiontype, s1, parcel.readInt(), parcel.readInt(), s2, j)));
		//   85  170:new             #72  <Class SensorUsbDeviceInfo>
		//   86  173:dup             
		//   87  174:aload           4
		//   88  176:iload_2         
		//   89  177:aload           5
		//   90  179:aload           6
		//   91  181:aload_1         
		//   92  182:invokevirtual   #26  <Method int Parcel.readInt()>
		//   93  185:aload_1         
		//   94  186:invokevirtual   #26  <Method int Parcel.readInt()>
		//   95  189:aload           7
		//   96  191:iload_3         
		//   97  192:invokespecial   #73  <Method void SensorUsbDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, int, int, String, int)>
		//   98  195:areturn         
			if(sensorconnectiontype == SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_BLE)
		//*  99  196:aload           5
		//* 100  198:getstatic       #76  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_BLE>
		//* 101  201:if_acmpne       222
				return new SensorDeviceInfo(s, i, sensorconnectiontype, s1, s2, j);
		//  102  204:new             #9   <Class SensorDeviceInfo>
		//  103  207:dup             
		//  104  208:aload           4
		//  105  210:iload_2         
		//  106  211:aload           5
		//  107  213:aload           6
		//  108  215:aload           7
		//  109  217:iload_3         
		//  110  218:invokespecial   #55  <Method void SensorDeviceInfo(String, int, SensorTypes$SensorConnectionType, String, String, int)>
		//  111  221:areturn         
			else
				return null;
		//  112  222:aconst_null     
		//  113  223:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #79  <Method SensorDeviceInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SensorDeviceInfo[] newArray(int i)
		{
			return new SensorDeviceInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SensorDeviceInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #84  <Method SensorDeviceInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	protected SensorTypes.SensorConnectionType mConnectionType;
	protected int mDataType;
	protected String mDeviceName;
	protected String mDisplayName;
	protected String mId;
	protected int mManufactureId;

	static 
	{
	//    0    0:new             #8   <Class SensorDeviceInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void SensorDeviceInfo$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
