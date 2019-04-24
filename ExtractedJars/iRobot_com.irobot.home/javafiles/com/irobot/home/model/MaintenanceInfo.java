// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.*;

// Referenced classes of package com.irobot.home.model:
//			MaintenanceData

public class MaintenanceInfo
	implements Parcelable
{

	public MaintenanceInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List a>
	//    7   15:return          
	}

	public MaintenanceInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List a>
		parcel.readTypedList(a, MaintenanceData.CREATOR);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field List a>
	//   10   20:getstatic       #33  <Field android.os.Parcelable$Creator MaintenanceData.CREATOR>
	//   11   23:invokevirtual   #39  <Method void Parcel.readTypedList(List, android.os.Parcelable$Creator)>
	//   12   26:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_1        
		for(Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(" "))
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field List a>
	//*   6   12:invokeinterface #52  <Method Iterator List.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            54
			stringbuilder.append(((MaintenanceData)iterator.next()).toString());
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #62  <Method Object Iterator.next()>
	//   14   34:checkcast       #32  <Class MaintenanceData>
	//   15   37:invokevirtual   #64  <Method String MaintenanceData.toString()>
	//   16   40:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   17   43:pop             

	//   18   44:aload_1         
	//   19   45:ldc1            #70  <String " ">
	//   20   47:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:pop             
	//*  22   51:goto            18
		return stringbuilder.toString();
	//   23   54:aload_1         
	//   24   55:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   25   58:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedList(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field List a>
	//    3    5:invokevirtual   #77  <Method void Parcel.writeTypedList(List)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MaintenanceInfo a(Parcel parcel)
		{
			return new MaintenanceInfo(parcel);
		//    0    0:new             #9   <Class MaintenanceInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MaintenanceInfo(Parcel)>
		//    4    8:areturn         
		}

		public MaintenanceInfo[] a(int i)
		{
			return new MaintenanceInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MaintenanceInfo[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MaintenanceInfo a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MaintenanceInfo[] a(int)>
		//    3    5:areturn         
		}

	}
;
	List a;

	static 
	{
	//    0    0:new             #8   <Class MaintenanceInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void MaintenanceInfo$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
