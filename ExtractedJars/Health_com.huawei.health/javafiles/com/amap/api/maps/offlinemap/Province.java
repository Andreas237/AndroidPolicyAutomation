// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

public class Province
	implements Parcelable
{

	public Province()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <String "">
	//    4    7:putfield        #29  <Field String a>
		d = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #27  <String "">
	//    7   13:putfield        #31  <Field String d>
	//    8   16:return          
	}

	public Province(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <String "">
	//    4    7:putfield        #29  <Field String a>
		d = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #27  <String "">
	//    7   13:putfield        #31  <Field String d>
		a = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #38  <Method String Parcel.readString()>
	//   11   21:putfield        #29  <Field String a>
		b = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #38  <Method String Parcel.readString()>
	//   15   29:putfield        #40  <Field String b>
		c = parcel.readString();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #38  <Method String Parcel.readString()>
	//   19   37:putfield        #42  <Field String c>
		d = parcel.readString();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #38  <Method String Parcel.readString()>
	//   23   45:putfield        #31  <Field String d>
	//   24   48:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getJianpin()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String b>
	//    2    4:areturn         
	}

	public String getPinyin()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String c>
	//    2    4:areturn         
	}

	public String getProvinceCode()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String d>
	//    2    4:areturn         
	}

	public String getProvinceName()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String a>
	//    2    4:areturn         
	}

	public void setJianpin(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String b>
	//    3    5:return          
	}

	public void setPinyin(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String c>
	//    3    5:return          
	}

	public void setProvinceCode(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String d>
	//    3    5:return          
	}

	public void setProvinceName(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String a>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field String a>
	//    3    5:invokevirtual   #58  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field String b>
	//    7   13:invokevirtual   #58  <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field String c>
	//   11   21:invokevirtual   #58  <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field String d>
	//   15   29:invokevirtual   #58  <Method void Parcel.writeString(String)>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Province a(Parcel parcel)
		{
			return new Province(parcel);
		//    0    0:new             #9   <Class Province>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Province(Parcel)>
		//    4    8:areturn         
		}

		public Province[] a(int i)
		{
			return new Province[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Province[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method Province a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method Province[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private String c;
	private String d;

	static 
	{
	//    0    0:new             #8   <Class Province$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Province$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
