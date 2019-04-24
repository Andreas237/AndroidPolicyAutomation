// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.RobotPadCategory;

public class PadSettings
	implements Parcelable
{

	public PadSettings(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = (RobotPadCategory)parcel.readSerializable();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method java.io.Serializable Parcel.readSerializable()>
	//    5    9:checkcast       #36  <Class RobotPadCategory>
	//    6   12:putfield        #38  <Field RobotPadCategory a>
		b = parcel.readString();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #42  <Method String Parcel.readString()>
	//   10   20:putfield        #44  <Field String b>
		c = parcel.readInt();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #48  <Method int Parcel.readInt()>
	//   14   28:putfield        #50  <Field int c>
		d = parcel.readInt();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #48  <Method int Parcel.readInt()>
	//   18   36:putfield        #52  <Field int d>
	//   19   39:return          
	}

	public PadSettings(RobotPadCategory robotpadcategory, String s, int i)
	{
		this(robotpadcategory, s, i, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_2        
	//    5    5:invokespecial   #56  <Method void PadSettings(RobotPadCategory, String, int, int)>
	//    6    8:return          
	}

	public PadSettings(RobotPadCategory robotpadcategory, String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = robotpadcategory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field RobotPadCategory a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #44  <Field String b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #50  <Field int c>
		d = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #52  <Field int d>
	//   14   25:return          
	}

	public RobotPadCategory a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field RobotPadCategory a>
	//    2    4:areturn         
	}

	public void a(int i)
	{
		d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int d>
	//    3    5:return          
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String b>
	//    2    4:areturn         
	}

	public int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int c>
	//    2    4:ireturn         
	}

	public int d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int d>
	//    2    4:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean e()
	{
		return d == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int d>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeSerializable(((java.io.Serializable) (a)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field RobotPadCategory a>
	//    3    5:invokevirtual   #67  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field String b>
	//    7   13:invokevirtual   #71  <Method void Parcel.writeString(String)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field int c>
	//   11   21:invokevirtual   #74  <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #52  <Field int d>
	//   15   29:invokevirtual   #74  <Method void Parcel.writeInt(int)>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PadSettings a(Parcel parcel)
		{
			return new PadSettings(parcel);
		//    0    0:new             #9   <Class PadSettings>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void PadSettings(Parcel)>
		//    4    8:areturn         
		}

		public PadSettings[] a(int i)
		{
			return new PadSettings[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PadSettings[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method PadSettings a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method PadSettings[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private RobotPadCategory a;
	private String b;
	private int c;
	private int d;

	static 
	{
	//    0    0:new             #8   <Class PadSettings$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void PadSettings$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
