// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.*;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			BottomNavigationView

static class BottomNavigationView$SavedState extends AbsSavedState
{

	private void readFromParcel(Parcel parcel, ClassLoader classloader)
	{
		menuPresenterState = parcel.readBundle(classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #43  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    4    6:putfield        #45  <Field Bundle menuPresenterState>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeBundle(menuPresenterState);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field Bundle menuPresenterState>
	//    7   11:invokevirtual   #54  <Method void Parcel.writeBundle(Bundle)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

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

	}
);
	Bundle menuPresenterState;

	static 
	{
	//    0    0:new             #9   <Class BottomNavigationView$SavedState$5>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void BottomNavigationView$SavedState$5()>
	//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
		readFromParcel(parcel, classloader);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #34  <Method void readFromParcel(Parcel, ClassLoader)>
	//    8   12:return          
	}

	public BottomNavigationView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
