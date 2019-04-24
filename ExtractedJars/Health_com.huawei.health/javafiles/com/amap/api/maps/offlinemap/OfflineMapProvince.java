// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.amap.api.maps.offlinemap:
//			Province, OfflineMapCity

public class OfflineMapProvince extends Province
{

	public OfflineMapProvince()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Province()>
		b = 6;
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:putfield        #31  <Field int b>
		e = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #33  <Field int e>
	//    8   15:return          
	}

	public OfflineMapProvince(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void Province(Parcel)>
		b = 6;
	//    3    5:aload_0         
	//    4    6:bipush          6
	//    5    8:putfield        #31  <Field int b>
		e = 0;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #33  <Field int e>
		a = parcel.readString();
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #42  <Method String Parcel.readString()>
	//   12   21:putfield        #44  <Field String a>
		b = parcel.readInt();
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #48  <Method int Parcel.readInt()>
	//   16   29:putfield        #31  <Field int b>
		c = parcel.readLong();
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #52  <Method long Parcel.readLong()>
	//   20   37:putfield        #54  <Field long c>
		d = parcel.readString();
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #42  <Method String Parcel.readString()>
	//   24   45:putfield        #56  <Field String d>
		e = parcel.readInt();
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #48  <Method int Parcel.readInt()>
	//   28   53:putfield        #33  <Field int e>
		f = parcel.createTypedArrayList(OfflineMapCity.CREATOR);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:getstatic       #59  <Field android.os.Parcelable$Creator OfflineMapCity.CREATOR>
	//   32   61:invokevirtual   #63  <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   33   64:putfield        #65  <Field ArrayList f>
	//   34   67:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ArrayList getCityList()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field ArrayList f>
	//*   2    4:ifnonnull       15
			return new ArrayList();
	//    3    7:new             #70  <Class ArrayList>
	//    4   10:dup             
	//    5   11:invokespecial   #71  <Method void ArrayList()>
	//    6   14:areturn         
		else
			return f;
	//    7   15:aload_0         
	//    8   16:getfield        #65  <Field ArrayList f>
	//    9   19:areturn         
	}

	public ArrayList getDownloadedCityList()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #70  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void ArrayList()>
	//    3    7:astore_1        
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #65  <Field ArrayList f>
	//*   6   12:ifnonnull       17
			return arraylist;
	//    7   15:aload_1         
	//    8   16:areturn         
		Iterator iterator = f.iterator();
	//    9   17:aload_0         
	//   10   18:getfield        #65  <Field ArrayList f>
	//   11   21:invokevirtual   #78  <Method Iterator ArrayList.iterator()>
	//   12   24:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   25:aload_2         
	//   14   26:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            62
			OfflineMapCity offlinemapcity = (OfflineMapCity)iterator.next();
	//   16   34:aload_2         
	//   17   35:invokeinterface #88  <Method Object Iterator.next()>
	//   18   40:checkcast       #58  <Class OfflineMapCity>
	//   19   43:astore_3        
			if(offlinemapcity.getState() != 6)
	//*  20   44:aload_3         
	//*  21   45:invokevirtual   #91  <Method int OfflineMapCity.getState()>
	//*  22   48:bipush          6
	//*  23   50:icmpeq          59
				arraylist.add(((Object) (offlinemapcity)));
	//   24   53:aload_1         
	//   25   54:aload_3         
	//   26   55:invokevirtual   #95  <Method boolean ArrayList.add(Object)>
	//   27   58:pop             
		} while(true);
	//   28   59:goto            25
		return arraylist;
	//   29   62:aload_1         
	//   30   63:areturn         
	}

	public long getSize()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field long c>
	//    2    4:lreturn         
	}

	public int getState()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int b>
	//    2    4:ireturn         
	}

	public String getUrl()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String a>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String d>
	//    2    4:areturn         
	}

	public int getcompleteCode()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int e>
	//    2    4:ireturn         
	}

	public void setCityList(ArrayList arraylist)
	{
		f = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field ArrayList f>
	//    3    5:return          
	}

	public void setCompleteCode(int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int e>
	//    3    5:return          
	}

	public void setSize(long l)
	{
		c = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #54  <Field long c>
	//    3    5:return          
	}

	public void setState(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int b>
	//    3    5:return          
	}

	public void setUrl(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String a>
	//    3    5:return          
	}

	public void setVersion(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field String d>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #114 <Method void Province.writeToParcel(Parcel, int)>
		parcel.writeString(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field String a>
	//    7   11:invokevirtual   #117 <Method void Parcel.writeString(String)>
		parcel.writeInt(b);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field int b>
	//   11   19:invokevirtual   #120 <Method void Parcel.writeInt(int)>
		parcel.writeLong(c);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #54  <Field long c>
	//   15   27:invokevirtual   #123 <Method void Parcel.writeLong(long)>
		parcel.writeString(d);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #56  <Field String d>
	//   19   35:invokevirtual   #117 <Method void Parcel.writeString(String)>
		parcel.writeInt(e);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #33  <Field int e>
	//   23   43:invokevirtual   #120 <Method void Parcel.writeInt(int)>
		parcel.writeTypedList(((java.util.List) (f)));
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #65  <Field ArrayList f>
	//   27   51:invokevirtual   #127 <Method void Parcel.writeTypedList(java.util.List)>
	//   28   54:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public OfflineMapProvince a(Parcel parcel)
		{
			return new OfflineMapProvince(parcel);
		//    0    0:new             #9   <Class OfflineMapProvince>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void OfflineMapProvince(Parcel)>
		//    4    8:areturn         
		}

		public OfflineMapProvince[] a(int i)
		{
			return new OfflineMapProvince[i];
		//    0    0:iload_1         
		//    1    1:anewarray       OfflineMapProvince[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method OfflineMapProvince a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method OfflineMapProvince[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private int b;
	private long c;
	private String d;
	private int e;
	private ArrayList f;

	static 
	{
	//    0    0:new             #6   <Class OfflineMapProvince$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void OfflineMapProvince$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
