// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.design.internal:
//			c

class BottomNavigationPresenter$SavedState
	implements Parcelable
{

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
	//    2    2:getfield        #30  <Field int a>
	//    3    5:invokevirtual   #37  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new c();
	int a;

	static 
	{
	//    0    0:new             #14  <Class c>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void c()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	BottomNavigationPresenter$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	BottomNavigationPresenter$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method int Parcel.readInt()>
	//    5    9:putfield        #30  <Field int a>
	//    6   12:return          
	}
}
