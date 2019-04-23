// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			z

public class BottomSheetBehavior$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field int a>
	//    7   11:invokevirtual   #41  <Method void Parcel.writeInt(int)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new z();
	final int a;

	static 
	{
	//    0    0:new             #12  <Class z>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void z()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public BottomSheetBehavior$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		a = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #27  <Method int Parcel.readInt()>
	//    7   11:putfield        #29  <Field int a>
	//    8   14:return          
	}

	public BottomSheetBehavior$SavedState(Parcelable parcelable, int i)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void AbsSavedState(Parcelable)>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #29  <Field int a>
	//    6   10:return          
	}
}
