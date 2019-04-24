// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

public class City
	implements Parcelable
{

	public City()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "">
	//    4    7:putfield        #30  <Field String a>
		b = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #28  <String "">
	//    7   13:putfield        #32  <Field String b>
		e = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #28  <String "">
	//   10   19:putfield        #34  <Field String e>
	//   11   22:return          
	}

	public City(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "">
	//    4    7:putfield        #30  <Field String a>
		b = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #28  <String "">
	//    7   13:putfield        #32  <Field String b>
		e = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #28  <String "">
	//   10   19:putfield        #34  <Field String e>
		a = parcel.readString();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #41  <Method String Parcel.readString()>
	//   14   27:putfield        #30  <Field String a>
		b = parcel.readString();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #41  <Method String Parcel.readString()>
	//   18   35:putfield        #32  <Field String b>
		c = parcel.readString();
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #41  <Method String Parcel.readString()>
	//   22   43:putfield        #43  <Field String c>
		d = parcel.readString();
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:invokevirtual   #41  <Method String Parcel.readString()>
	//   26   51:putfield        #45  <Field String d>
		e = parcel.readString();
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #41  <Method String Parcel.readString()>
	//   30   59:putfield        #34  <Field String e>
	//   31   62:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getAdcode()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String e>
	//    2    4:areturn         
	}

	public String getCity()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String a>
	//    2    4:areturn         
	}

	public String getCode()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String b>
	//    2    4:areturn         
	}

	public String getJianpin()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String c>
	//    2    4:areturn         
	}

	public String getPinyin()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String d>
	//    2    4:areturn         
	}

	public void setAdcode(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String e>
	//    3    5:return          
	}

	public void setCity(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String a>
	//    3    5:return          
	}

	public void setCode(String s)
	{
		if(s != null && !"[]".equals(((Object) (s))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:ldc1            #58  <String "[]">
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*   5   10:ifne            18
			b = s;
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:putfield        #32  <Field String b>
	//    9   18:return          
	}

	public void setJianpin(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String c>
	//    3    5:return          
	}

	public void setPinyin(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String d>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field String a>
	//    3    5:invokevirtual   #71  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field String b>
	//    7   13:invokevirtual   #71  <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field String c>
	//   11   21:invokevirtual   #71  <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #45  <Field String d>
	//   15   29:invokevirtual   #71  <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #34  <Field String e>
	//   19   37:invokevirtual   #71  <Method void Parcel.writeString(String)>
	//   20   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public City a(Parcel parcel)
		{
			return new City(parcel);
		//    0    0:new             #9   <Class City>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void City(Parcel)>
		//    4    8:areturn         
		}

		public City[] a(int i)
		{
			return new City[i];
		//    0    0:iload_1         
		//    1    1:anewarray       City[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method City a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method City[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;

	static 
	{
	//    0    0:new             #8   <Class City$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void City$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
