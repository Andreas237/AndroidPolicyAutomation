// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;

// Referenced classes of package android.support.design.widget:
//			BottomNavigationView

static final class BottomNavigationView$SavedState$1
	implements android.os.Parcelable.ClassLoaderCreator
{

	public BottomNavigationView.SavedState a(Parcel parcel)
	{
		return new BottomNavigationView.SavedState(parcel, ((ClassLoader) (null)));
	//    0    0:new             #9   <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public BottomNavigationView.SavedState a(Parcel parcel, ClassLoader classloader)
	{
		return new BottomNavigationView.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public BottomNavigationView.SavedState[] a(int i)
	{
		return new BottomNavigationView.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       BottomNavigationView.SavedState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method BottomNavigationView$SavedState a(Parcel)>
	//    3    5:areturn         
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (a(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #31  <Method BottomNavigationView$SavedState a(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method BottomNavigationView$SavedState[] a(int)>
	//    3    5:areturn         
	}

	BottomNavigationView$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
