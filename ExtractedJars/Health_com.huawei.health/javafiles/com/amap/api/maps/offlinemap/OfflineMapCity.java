// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.offlinemap:
//			City

public class OfflineMapCity extends City
{

	public OfflineMapCity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void City()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "">
	//    4    7:putfield        #30  <Field String a>
		b = 0L;
	//    5   10:aload_0         
	//    6   11:lconst_0        
	//    7   12:putfield        #32  <Field long b>
		c = 6;
	//    8   15:aload_0         
	//    9   16:bipush          6
	//   10   18:putfield        #34  <Field int c>
		d = "";
	//   11   21:aload_0         
	//   12   22:ldc1            #28  <String "">
	//   13   24:putfield        #36  <Field String d>
		e = 0;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #38  <Field int e>
	//   17   32:return          
	}

	public OfflineMapCity(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void City(Parcel)>
		a = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #28  <String "">
	//    5    8:putfield        #30  <Field String a>
		b = 0L;
	//    6   11:aload_0         
	//    7   12:lconst_0        
	//    8   13:putfield        #32  <Field long b>
		c = 6;
	//    9   16:aload_0         
	//   10   17:bipush          6
	//   11   19:putfield        #34  <Field int c>
		d = "";
	//   12   22:aload_0         
	//   13   23:ldc1            #28  <String "">
	//   14   25:putfield        #36  <Field String d>
		e = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #38  <Field int e>
		a = parcel.readString();
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokevirtual   #47  <Method String Parcel.readString()>
	//   21   38:putfield        #30  <Field String a>
		b = parcel.readLong();
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #51  <Method long Parcel.readLong()>
	//   25   46:putfield        #32  <Field long b>
		c = parcel.readInt();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #55  <Method int Parcel.readInt()>
	//   29   54:putfield        #34  <Field int c>
		d = parcel.readString();
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:invokevirtual   #47  <Method String Parcel.readString()>
	//   33   62:putfield        #36  <Field String d>
		e = parcel.readInt();
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:invokevirtual   #55  <Method int Parcel.readInt()>
	//   37   70:putfield        #38  <Field int e>
	//   38   73:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long getSize()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long b>
	//    2    4:lreturn         
	}

	public int getState()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int c>
	//    2    4:ireturn         
	}

	public String getUrl()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String a>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String d>
	//    2    4:areturn         
	}

	public int getcompleteCode()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int e>
	//    2    4:ireturn         
	}

	public void setCompleteCode(int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int e>
	//    3    5:return          
	}

	public void setSize(long l)
	{
		b = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #32  <Field long b>
	//    3    5:return          
	}

	public void setState(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int c>
	//    3    5:return          
	}

	public void setUrl(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String a>
	//    3    5:return          
	}

	public void setVersion(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String d>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #73  <Method void City.writeToParcel(Parcel, int)>
		parcel.writeString(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field String a>
	//    7   11:invokevirtual   #76  <Method void Parcel.writeString(String)>
		parcel.writeLong(b);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field long b>
	//   11   19:invokevirtual   #79  <Method void Parcel.writeLong(long)>
		parcel.writeInt(c);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #34  <Field int c>
	//   15   27:invokevirtual   #82  <Method void Parcel.writeInt(int)>
		parcel.writeString(d);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #36  <Field String d>
	//   19   35:invokevirtual   #76  <Method void Parcel.writeString(String)>
		parcel.writeInt(e);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #38  <Field int e>
	//   23   43:invokevirtual   #82  <Method void Parcel.writeInt(int)>
	//   24   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public OfflineMapCity a(Parcel parcel)
		{
			return new OfflineMapCity(parcel);
		//    0    0:new             #9   <Class OfflineMapCity>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void OfflineMapCity(Parcel)>
		//    4    8:areturn         
		}

		public OfflineMapCity[] a(int i)
		{
			return new OfflineMapCity[i];
		//    0    0:iload_1         
		//    1    1:anewarray       OfflineMapCity[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method OfflineMapCity a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method OfflineMapCity[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private long b;
	private int c;
	private String d;
	private int e;

	static 
	{
	//    0    0:new             #6   <Class OfflineMapCity$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void OfflineMapCity$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
