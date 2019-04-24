// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$SavedState extends AbsSavedState
{

	void copyFrom(RecyclerView$SavedState recyclerview$savedstate)
	{
		mLayoutState = recyclerview$savedstate.mLayoutState;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #37  <Field Parcelable mLayoutState>
	//    3    5:putfield        #37  <Field Parcelable mLayoutState>
	//    4    8:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeParcelable(mLayoutState, 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field Parcelable mLayoutState>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #58  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    9   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public RecyclerView.SavedState createFromParcel(Parcel parcel)
		{
			return new RecyclerView.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class RecyclerView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new RecyclerView.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class RecyclerView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method RecyclerView$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method RecyclerView$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public RecyclerView.SavedState[] newArray(int i)
		{
			return new RecyclerView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RecyclerView.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #34  <Method RecyclerView$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	Parcelable mLayoutState;

	static 
	{
	//    0    0:new             #9   <Class RecyclerView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RecyclerView$SavedState$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	RecyclerView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
		if(classloader == null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:invokevirtual   #35  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//*  10   16:putfield        #37  <Field Parcelable mLayoutState>
	//*  11   19:return          
			classloader = ((Class) (android/support/v7/widget/RecyclerView$LayoutManager)).getClassLoader();
	//   12   20:ldc1            #39  <Class RecyclerView$LayoutManager>
	//   13   22:invokevirtual   #45  <Method ClassLoader Class.getClassLoader()>
	//   14   25:astore_2        
		mLayoutState = parcel.readParcelable(classloader);
	//*  15   26:goto            10
	}

	RecyclerView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
