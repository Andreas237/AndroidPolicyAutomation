// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			Dynamics

class SimpleDynamics extends Dynamics
	implements Parcelable
{

	public SimpleDynamics(float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Dynamics()>
		f = f1;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #26  <Field float f>
		g = f2;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #28  <Field float g>
	//    8   14:return          
	}

	public SimpleDynamics(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void Dynamics(Parcel)>
		f = parcel.readFloat();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #37  <Method float Parcel.readFloat()>
	//    6   10:putfield        #26  <Field float f>
		g = parcel.readFloat();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #37  <Method float Parcel.readFloat()>
	//   10   18:putfield        #28  <Field float g>
	//   11   21:return          
	}

	public void a(double d)
	{
		super.a(d);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokespecial   #41  <Method void Dynamics.a(double)>
	//    3    5:return          
	}

	protected void a(int i)
	{
		b = b + c() * g;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field float b>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #48  <Method float c()>
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field float g>
	//    7   13:fmul            
	//    8   14:fadd            
	//    9   15:putfield        #45  <Field float b>
		a = a + (b * (float)i) / 1000F;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #50  <Field float a>
	//   13   23:aload_0         
	//   14   24:getfield        #45  <Field float b>
	//   15   27:iload_1         
	//   16   28:i2f             
	//   17   29:fmul            
	//   18   30:ldc1            #51  <Float 1000F>
	//   19   32:fdiv            
	//   20   33:fadd            
	//   21   34:putfield        #50  <Field float a>
		b = b * f;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #45  <Field float b>
	//   25   42:aload_0         
	//   26   43:getfield        #26  <Field float f>
	//   27   46:fmul            
	//   28   47:putfield        #45  <Field float b>
	//   29   50:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append(", Friction: [").append(f).append("], Snap:[").append(g).append("]").toString();
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #60  <Method String Dynamics.toString()>
	//    5   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #66  <String ", Friction: [">
	//    7   16:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #26  <Field float f>
	//   10   23:invokevirtual   #69  <Method StringBuilder StringBuilder.append(float)>
	//   11   26:ldc1            #71  <String "], Snap:[">
	//   12   28:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_0         
	//   14   32:getfield        #28  <Field float g>
	//   15   35:invokevirtual   #69  <Method StringBuilder StringBuilder.append(float)>
	//   16   38:ldc1            #73  <String "]">
	//   17   40:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   19   46:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #78  <Method void Dynamics.writeToParcel(Parcel, int)>
		parcel.writeFloat(f);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field float f>
	//    7   11:invokevirtual   #82  <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(g);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field float g>
	//   11   19:invokevirtual   #82  <Method void Parcel.writeFloat(float)>
	//   12   22:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SimpleDynamics a(Parcel parcel)
		{
			return new SimpleDynamics(parcel);
		//    0    0:new             #9   <Class SimpleDynamics>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void SimpleDynamics(Parcel)>
		//    4    8:areturn         
		}

		public SimpleDynamics[] a(int i)
		{
			return new SimpleDynamics[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SimpleDynamics[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method SimpleDynamics a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method SimpleDynamics[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private float f;
	private float g;

	static 
	{
	//    0    0:new             #8   <Class SimpleDynamics$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void SimpleDynamics$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
