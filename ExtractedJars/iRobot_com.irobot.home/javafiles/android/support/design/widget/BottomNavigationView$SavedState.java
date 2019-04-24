// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.*;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			BottomNavigationView

static class BottomNavigationView$SavedState extends AbsSavedState
{

	private void a(Parcel parcel, ClassLoader classloader)
	{
		a = parcel.readBundle(classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #36  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    4    6:putfield        #38  <Field Bundle a>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeBundle(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field Bundle a>
	//    7   11:invokevirtual   #46  <Method void Parcel.writeBundle(Bundle)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

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

	}
;
	Bundle a;

	static 
	{
	//    0    0:new             #9   <Class BottomNavigationView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void BottomNavigationView$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		a(parcel, classloader);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #27  <Method void a(Parcel, ClassLoader)>
	//    8   12:return          
	}

	public BottomNavigationView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
