// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.design.internal:
//			BottomNavigationPresenter

static class BottomNavigationPresenter$SavedState
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
	//    2    2:getfield        #34  <Field int a>
	//    3    5:invokevirtual   #41  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public BottomNavigationPresenter.SavedState a(Parcel parcel)
		{
			return new BottomNavigationPresenter.SavedState(parcel);
		//    0    0:new             #9   <Class BottomNavigationPresenter$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void BottomNavigationPresenter$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public BottomNavigationPresenter.SavedState[] a(int i)
		{
			return new BottomNavigationPresenter.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       BottomNavigationPresenter.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #27  <Method BottomNavigationPresenter$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method BottomNavigationPresenter$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;

	static 
	{
	//    0    0:new             #11  <Class BottomNavigationPresenter$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void BottomNavigationPresenter$SavedState$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	BottomNavigationPresenter$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	BottomNavigationPresenter$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
	//    5    9:putfield        #34  <Field int a>
	//    6   12:return          
	}
}
