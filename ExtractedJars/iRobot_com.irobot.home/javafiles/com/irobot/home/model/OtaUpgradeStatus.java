// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.*;
import java.util.*;

public class OtaUpgradeStatus
	implements Parcelable
{

	public OtaUpgradeStatus()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void Object()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #89  <Field int a>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #91  <Field int b>
	//    8   14:return          
	}

	public OtaUpgradeStatus(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #98  <Method int Parcel.readInt()>
	//    5    9:putfield        #89  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #98  <Method int Parcel.readInt()>
	//    9   17:putfield        #91  <Field int b>
		c = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #102 <Method String Parcel.readString()>
	//   13   25:putfield        #104 <Field String c>
	//   14   28:return          
	}

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int a>
	//    2    4:ireturn         
	}

	public void a(AssetOtaUpdateStatusEvent assetotaupdatestatusevent)
	{
		a = ((Integer)d.get(((Object) (assetotaupdatestatusevent.status())))).intValue();
	//    0    0:aload_0         
	//    1    1:getstatic       #69  <Field Map d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method OtaUpdateStatus AssetOtaUpdateStatusEvent.status()>
	//    4    8:invokeinterface #115 <Method Object Map.get(Object)>
	//    5   13:checkcast       #36  <Class Integer>
	//    6   16:invokevirtual   #118 <Method int Integer.intValue()>
	//    7   19:putfield        #89  <Field int a>
		b = ((Integer)e.get(((Object) (assetotaupdatestatusevent.error())))).intValue();
	//    8   22:aload_0         
	//    9   23:getstatic       #82  <Field Map e>
	//   10   26:aload_1         
	//   11   27:invokevirtual   #122 <Method OtaUpdateError AssetOtaUpdateStatusEvent.error()>
	//   12   30:invokeinterface #115 <Method Object Map.get(Object)>
	//   13   35:checkcast       #36  <Class Integer>
	//   14   38:invokevirtual   #118 <Method int Integer.intValue()>
	//   15   41:putfield        #91  <Field int b>
		c = assetotaupdatestatusevent.packageLabel();
	//   16   44:aload_0         
	//   17   45:aload_1         
	//   18   46:invokevirtual   #125 <Method String AssetOtaUpdateStatusEvent.packageLabel()>
	//   19   49:putfield        #104 <Field String c>
	//   20   52:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field int a>
	//    3    5:invokevirtual   #132 <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field int b>
	//    7   13:invokevirtual   #132 <Method void Parcel.writeInt(int)>
		parcel.writeString(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #104 <Field String c>
	//   11   21:invokevirtual   #136 <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public OtaUpgradeStatus a(Parcel parcel)
		{
			return new OtaUpgradeStatus(parcel);
		//    0    0:new             #9   <Class OtaUpgradeStatus>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void OtaUpgradeStatus(Parcel)>
		//    4    8:areturn         
		}

		public OtaUpgradeStatus[] a(int i)
		{
			return new OtaUpgradeStatus[i];
		//    0    0:iload_1         
		//    1    1:anewarray       OtaUpgradeStatus[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method OtaUpgradeStatus a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method OtaUpgradeStatus[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private static transient Map d;
	private static transient Map e;
	private int a;
	private int b;
	private String c;

	static 
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #25  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void HashMap()>
	//    3    7:astore_0        
		((Map) (hashmap)).put(((Object) (OtaUpdateStatus.None)), ((Object) (Integer.valueOf(0))));
	//    4    8:aload_0         
	//    5    9:getstatic       #34  <Field OtaUpdateStatus OtaUpdateStatus.None>
	//    6   12:iconst_0        
	//    7   13:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//    8   16:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//    9   21:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateStatus.DownloadAvailable)), ((Object) (Integer.valueOf(1))));
	//   10   22:aload_0         
	//   11   23:getstatic       #49  <Field OtaUpdateStatus OtaUpdateStatus.DownloadAvailable>
	//   12   26:iconst_1        
	//   13   27:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   14   30:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   15   35:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateStatus.Downloading)), ((Object) (Integer.valueOf(2))));
	//   16   36:aload_0         
	//   17   37:getstatic       #52  <Field OtaUpdateStatus OtaUpdateStatus.Downloading>
	//   18   40:iconst_2        
	//   19   41:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   20   44:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   21   49:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateStatus.ReadyToInstall)), ((Object) (Integer.valueOf(3))));
	//   22   50:aload_0         
	//   23   51:getstatic       #55  <Field OtaUpdateStatus OtaUpdateStatus.ReadyToInstall>
	//   24   54:iconst_3        
	//   25   55:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   26   58:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   27   63:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateStatus.Installing)), ((Object) (Integer.valueOf(4))));
	//   28   64:aload_0         
	//   29   65:getstatic       #58  <Field OtaUpdateStatus OtaUpdateStatus.Installing>
	//   30   68:iconst_4        
	//   31   69:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   32   72:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   33   77:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateStatus.Error)), ((Object) (Integer.valueOf(5))));
	//   34   78:aload_0         
	//   35   79:getstatic       #61  <Field OtaUpdateStatus OtaUpdateStatus.Error>
	//   36   82:iconst_5        
	//   37   83:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   38   86:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   39   91:pop             
		d = Collections.unmodifiableMap(((Map) (hashmap)));
	//   40   92:aload_0         
	//   41   93:invokestatic    #67  <Method Map Collections.unmodifiableMap(Map)>
	//   42   96:putstatic       #69  <Field Map d>
		hashmap = new HashMap();
	//   43   99:new             #25  <Class HashMap>
	//   44  102:dup             
	//   45  103:invokespecial   #28  <Method void HashMap()>
	//   46  106:astore_0        
		((Map) (hashmap)).put(((Object) (OtaUpdateError.None)), ((Object) (Integer.valueOf(0))));
	//   47  107:aload_0         
	//   48  108:getstatic       #74  <Field OtaUpdateError OtaUpdateError.None>
	//   49  111:iconst_0        
	//   50  112:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   51  115:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   52  120:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateError.AuthenticationFailure)), ((Object) (Integer.valueOf(1))));
	//   53  121:aload_0         
	//   54  122:getstatic       #77  <Field OtaUpdateError OtaUpdateError.AuthenticationFailure>
	//   55  125:iconst_1        
	//   56  126:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   57  129:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   58  134:pop             
		((Map) (hashmap)).put(((Object) (OtaUpdateError.AbortedByUser)), ((Object) (Integer.valueOf(2))));
	//   59  135:aload_0         
	//   60  136:getstatic       #80  <Field OtaUpdateError OtaUpdateError.AbortedByUser>
	//   61  139:iconst_2        
	//   62  140:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   63  143:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   64  148:pop             
		e = Collections.unmodifiableMap(((Map) (hashmap)));
	//   65  149:aload_0         
	//   66  150:invokestatic    #67  <Method Map Collections.unmodifiableMap(Map)>
	//   67  153:putstatic       #82  <Field Map e>
	//   68  156:new             #8   <Class OtaUpgradeStatus$1>
	//   69  159:dup             
	//   70  160:invokespecial   #83  <Method void OtaUpgradeStatus$1()>
	//   71  163:putstatic       #85  <Field android.os.Parcelable$Creator CREATOR>
	//*  72  166:return          
	}
}
