// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.*;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			w

class BottomNavigationView$SavedState extends AbsSavedState
{

	private void a(Parcel parcel, ClassLoader classloader)
	{
		a = parcel.readBundle(classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    4    6:putfield        #34  <Field Bundle a>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeBundle(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field Bundle a>
	//    7   11:invokevirtual   #42  <Method void Parcel.writeBundle(Bundle)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new w();
	Bundle a;

	static 
	{
	//    0    0:new             #12  <Class w>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void w()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		a(parcel, classloader);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #23  <Method void a(Parcel, ClassLoader)>
	//    8   12:return          
	}

	public BottomNavigationView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
