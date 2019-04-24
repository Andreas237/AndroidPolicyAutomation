// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;

import android.os.Parcel;

// Referenced classes of package com.samsung.android.sensor.data:
//			SensorDeviceInfo, SensorAntDeviceInfo, SensorAndroidDeviceInfo, SensorSapDeviceInfo, 
//			SensorUsbDeviceInfo

static final class SensorDeviceInfo$1
	implements android.os.Parcelable$Creator
{

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
		onnectionType onnectiontype = onnectionType.values()[parcel.readInt()];
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
		if(onnectiontype == onnectionType.SENSOR_CONNECTION_TYPE_ANT)
	//*  20   38:aload           5
	//*  21   40:getstatic       #36  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANT>
	//*  22   43:if_acmpne       72
			return ((SensorDeviceInfo) (new SensorAntDeviceInfo(s, i, onnectiontype, s1, parcel.readInt(), parcel.readInt(), s2, j)));
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
		if(onnectiontype == onnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT)
	//*  37   72:aload           5
	//*  38   74:getstatic       #44  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//*  39   77:if_acmpne       102
			return ((SensorDeviceInfo) (new SensorAndroidDeviceInfo(s, i, onnectiontype, s1, parcel.readInt(), s2, j)));
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
		if(onnectiontype == onnectionType.SENSOR_CONNECTION_TYPE_BLUETOOTH)
	//*  52  102:aload           5
	//*  53  104:getstatic       #52  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_BLUETOOTH>
	//*  54  107:if_acmpne       128
			return new SensorDeviceInfo(s, i, onnectiontype, s1, s2, j);
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
		if(onnectiontype == onnectionType.SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY)
	//*  65  128:aload           5
	//*  66  130:getstatic       #58  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY>
	//*  67  133:if_acmpne       162
			return ((SensorDeviceInfo) (new SensorSapDeviceInfo(s, i, onnectiontype, s1, parcel.readLong(), parcel.readInt(), s2, j)));
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
		if(onnectiontype == onnectionType.SENSOR_CONNECTION_TYPE_USB)
	//*  82  162:aload           5
	//*  83  164:getstatic       #70  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_USB>
	//*  84  167:if_acmpne       196
			return ((SensorDeviceInfo) (new SensorUsbDeviceInfo(s, i, onnectiontype, s1, parcel.readInt(), parcel.readInt(), s2, j)));
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
		if(onnectiontype == onnectionType.SENSOR_CONNECTION_TYPE_BLE)
	//*  99  196:aload           5
	//* 100  198:getstatic       #76  <Field SensorTypes$SensorConnectionType SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_BLE>
	//* 101  201:if_acmpne       222
			return new SensorDeviceInfo(s, i, onnectiontype, s1, s2, j);
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

	SensorDeviceInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
