// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package androidx.versionedparcelable:
//			a, c, d

public class ParcelImpl
	implements Parcelable
{

	protected ParcelImpl(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = (new c(parcel)).h();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class c>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #26  <Method void c(Parcel)>
	//    7   13:invokevirtual   #30  <Method d c.h()>
	//    8   16:putfield        #32  <Field d a>
	//    9   19:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		(new c(parcel)).a(a);
	//    0    0:new             #24  <Class c>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #26  <Method void c(Parcel)>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field d a>
	//    6   12:invokevirtual   #39  <Method void c.a(d)>
	//    7   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new a();
	private final d a;

	static 
	{
	//    0    0:new             #14  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void a()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
