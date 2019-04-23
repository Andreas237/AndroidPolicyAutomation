// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.*;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			bp

public class NavigationView$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeBundle(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Bundle a>
	//    7   11:invokevirtual   #40  <Method void Parcel.writeBundle(Bundle)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bp();
	public Bundle a;

	static 
	{
	//    0    0:new             #12  <Class bp>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bp()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public NavigationView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		a = parcel.readBundle(classloader);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #27  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    8   12:putfield        #29  <Field Bundle a>
	//    9   15:return          
	}

	public NavigationView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
