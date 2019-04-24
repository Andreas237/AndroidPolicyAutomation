// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.irobot.home.model:
//			j

public class MissionStatistics
	implements Parcelable
{

	public MissionStatistics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		b = j.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #40  <Field j j.NONE>
	//    4    8:putfield        #42  <Field j b>
	//    5   11:return          
	}

	public MissionStatistics(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #49  <Method int Parcel.readInt()>
	//    5    9:putfield        #51  <Field int a>
		b = com.irobot.home.model.j.valueOf(parcel.readString());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #55  <Method String Parcel.readString()>
	//    9   17:invokestatic    #59  <Method j j.valueOf(String)>
	//   10   20:putfield        #42  <Field j b>
		c = parcel.readInt();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #49  <Method int Parcel.readInt()>
	//   14   28:putfield        #61  <Field int c>
		d = parcel.readInt();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #49  <Method int Parcel.readInt()>
	//   18   36:putfield        #63  <Field int d>
		e = parcel.readInt();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #49  <Method int Parcel.readInt()>
	//   22   44:putfield        #65  <Field int e>
		f = parcel.readInt();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #49  <Method int Parcel.readInt()>
	//   26   52:putfield        #67  <Field int f>
		g = parcel.readInt();
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #49  <Method int Parcel.readInt()>
	//   30   60:putfield        #69  <Field int g>
		h = parcel.readInt();
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #49  <Method int Parcel.readInt()>
	//   34   68:putfield        #71  <Field int h>
		i = parcel.readInt();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #49  <Method int Parcel.readInt()>
	//   38   76:putfield        #73  <Field int i>
		j = parcel.readInt();
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokevirtual   #49  <Method int Parcel.readInt()>
	//   42   84:putfield        #75  <Field int j>
		k = parcel.readInt();
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #49  <Method int Parcel.readInt()>
	//   46   92:putfield        #77  <Field int k>
		l = parcel.readInt();
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokevirtual   #49  <Method int Parcel.readInt()>
	//   50  100:putfield        #79  <Field int l>
		m = parcel.readInt();
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokevirtual   #49  <Method int Parcel.readInt()>
	//   54  108:putfield        #81  <Field int m>
	//   55  111:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int a>
	//    3    5:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeString(b.name());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field j b>
	//    7   13:invokevirtual   #91  <Method String j.name()>
	//    8   16:invokevirtual   #95  <Method void Parcel.writeString(String)>
		parcel.writeInt(c);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field int c>
	//   12   24:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #63  <Field int d>
	//   16   32:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #65  <Field int e>
	//   20   40:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #67  <Field int f>
	//   24   48:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #69  <Field int g>
	//   28   56:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(h);
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:getfield        #71  <Field int h>
	//   32   64:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #73  <Field int i>
	//   36   72:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   37   75:aload_1         
	//   38   76:aload_0         
	//   39   77:getfield        #75  <Field int j>
	//   40   80:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   41   83:aload_1         
	//   42   84:aload_0         
	//   43   85:getfield        #77  <Field int k>
	//   44   88:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(l);
	//   45   91:aload_1         
	//   46   92:aload_0         
	//   47   93:getfield        #79  <Field int l>
	//   48   96:invokevirtual   #88  <Method void Parcel.writeInt(int)>
		parcel.writeInt(m);
	//   49   99:aload_1         
	//   50  100:aload_0         
	//   51  101:getfield        #81  <Field int m>
	//   52  104:invokevirtual   #88  <Method void Parcel.writeInt(int)>
	//   53  107:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MissionStatistics a(Parcel parcel)
		{
			return new MissionStatistics(parcel);
		//    0    0:new             #9   <Class MissionStatistics>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MissionStatistics(Parcel)>
		//    4    8:areturn         
		}

		public MissionStatistics[] a(int i1)
		{
			return new MissionStatistics[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       MissionStatistics[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MissionStatistics a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MissionStatistics[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private int a;
	private j b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	private int m;

	static 
	{
	//    0    0:new             #8   <Class MissionStatistics$1>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void MissionStatistics$1()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
