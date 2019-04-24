// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.design.widget:
//			BottomNavigationView

static final class BottomNavigationView$SavedState$5
	implements ParcelableCompatCreatorCallbacks
{

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (e(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #23  <Method BottomNavigationView$SavedState e(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public BottomNavigationView.SavedState[] d(int i)
	{
		return new BottomNavigationView.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       BottomNavigationView.SavedState[]
	//    2    4:areturn         
	}

	public BottomNavigationView.SavedState e(Parcel parcel, ClassLoader classloader)
	{
		return new BottomNavigationView.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #28  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (d(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #32  <Method BottomNavigationView$SavedState[] d(int)>
	//    3    5:areturn         
	}

	BottomNavigationView$SavedState$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
