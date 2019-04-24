// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.*;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			NavigationView

public static class NavigationView$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #47  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeBundle(menuState);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field Bundle menuState>
	//    7   11:invokevirtual   #51  <Method void Parcel.writeBundle(Bundle)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public NavigationView.SavedState a(Parcel parcel, ClassLoader classloader)
		{
			return new NavigationView.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class NavigationView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method NavigationView$SavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public NavigationView.SavedState[] e(int i)
		{
			return new NavigationView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       NavigationView.SavedState[]
		//    2    4:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (e(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #32  <Method NavigationView$SavedState[] e(int)>
		//    3    5:areturn         
		}

	}
);
	public Bundle menuState;

	static 
	{
	//    0    0:new             #9   <Class NavigationView$SavedState$4>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void NavigationView$SavedState$4()>
	//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public NavigationView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
		menuState = parcel.readBundle(classloader);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #37  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    8   12:putfield        #39  <Field Bundle menuState>
	//    9   15:return          
	}

	public NavigationView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
