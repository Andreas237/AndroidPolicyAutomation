// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

public class Position
	implements Parcelable
{

	public Position()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public Position(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
	//    5    9:putfield        #34  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method int Parcel.readInt()>
	//    9   17:putfield        #36  <Field int b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #32  <Method int Parcel.readInt()>
	//   13   25:putfield        #38  <Field int c>
	//   14   28:return          
	}

	public Position(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = jsonobject.getInt("theta");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #41  <String "theta">
	//    5    8:invokevirtual   #47  <Method int JSONObject.getInt(String)>
	//    6   11:putfield        #34  <Field int a>
		b = jsonobject.getJSONObject("point").getInt("x");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #49  <String "point">
	//   10   18:invokevirtual   #53  <Method JSONObject JSONObject.getJSONObject(String)>
	//   11   21:ldc1            #55  <String "x">
	//   12   23:invokevirtual   #47  <Method int JSONObject.getInt(String)>
	//   13   26:putfield        #36  <Field int b>
		c = jsonobject.getJSONObject("point").getInt("y");
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:ldc1            #49  <String "point">
	//   17   33:invokevirtual   #53  <Method JSONObject JSONObject.getJSONObject(String)>
	//   18   36:ldc1            #57  <String "y">
	//   19   38:invokevirtual   #47  <Method int JSONObject.getInt(String)>
	//   20   41:putfield        #38  <Field int c>
	//   21   44:return          
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
	//    2    2:getfield        #34  <Field int a>
	//    3    5:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field int b>
	//    7   13:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field int c>
	//   11   21:invokevirtual   #64  <Method void Parcel.writeInt(int)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Position a(Parcel parcel)
		{
			return new Position(parcel);
		//    0    0:new             #9   <Class Position>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Position(Parcel)>
		//    4    8:areturn         
		}

		public Position[] a(int i)
		{
			return new Position[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Position[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method Position a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method Position[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private int a;
	private int b;
	private int c;

	static 
	{
	//    0    0:new             #8   <Class Position$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Position$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
