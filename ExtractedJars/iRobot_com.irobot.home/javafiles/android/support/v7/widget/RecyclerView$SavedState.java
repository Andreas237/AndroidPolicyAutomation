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

	void a(RecyclerView$SavedState recyclerview$savedstate)
	{
		a = recyclerview$savedstate.a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #41  <Field Parcelable a>
	//    3    5:putfield        #41  <Field Parcelable a>
	//    4    8:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeParcelable(a, 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field Parcelable a>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #53  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    9   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public RecyclerView.SavedState a(Parcel parcel)
		{
			return new RecyclerView.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class RecyclerView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public RecyclerView.SavedState a(Parcel parcel, ClassLoader classloader)
		{
			return new RecyclerView.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class RecyclerView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public RecyclerView.SavedState[] a(int i)
		{
			return new RecyclerView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RecyclerView.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method RecyclerView$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #31  <Method RecyclerView$SavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method RecyclerView$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	Parcelable a;

	static 
	{
	//    0    0:new             #9   <Class RecyclerView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void RecyclerView$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	RecyclerView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		if(classloader == null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          13
	//*   6   10:goto            19
			classloader = ((Class) (android/support/v7/widget/RecyclerView$h)).getClassLoader();
	//    7   13:ldc1            #27  <Class RecyclerView$h>
	//    8   15:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//    9   18:astore_2        
		a = parcel.readParcelable(classloader);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:invokevirtual   #39  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   14   25:putfield        #41  <Field Parcelable a>
	//   15   28:return          
	}

	RecyclerView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
