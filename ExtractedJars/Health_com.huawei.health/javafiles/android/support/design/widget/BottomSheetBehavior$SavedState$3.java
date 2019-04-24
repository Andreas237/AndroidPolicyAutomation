// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

static final class BottomSheetBehavior$SavedState$3
	implements ParcelableCompatCreatorCallbacks
{

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (e(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #23  <Method BottomSheetBehavior$SavedState e(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public BottomSheetBehavior.SavedState e(Parcel parcel, ClassLoader classloader)
	{
		return new BottomSheetBehavior.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #26  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public BottomSheetBehavior.SavedState[] e(int i)
	{
		return new BottomSheetBehavior.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       BottomSheetBehavior.SavedState[]
	//    2    4:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (e(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #31  <Method BottomSheetBehavior$SavedState[] e(int)>
	//    3    5:areturn         
	}

	BottomSheetBehavior$SavedState$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
