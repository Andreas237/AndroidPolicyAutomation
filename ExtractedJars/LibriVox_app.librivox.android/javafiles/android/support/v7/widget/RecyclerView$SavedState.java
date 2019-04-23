// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

public class RecyclerView$SavedState extends AbsSavedState
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
	//    3    3:invokespecial   #46  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeParcelable(mLayoutState, 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field Parcelable mLayoutState>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #50  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    9   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new _cls1();
	Parcelable mLayoutState;

	static 
	{
		class _cls1
			implements android.os.Parcelable.ClassLoaderCreator
		{

			public RecyclerView.SavedState createFromParcel(Parcel parcel)
			{
				return new RecyclerView.SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #15  <Class RecyclerView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #18  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new RecyclerView.SavedState(parcel, classloader);
			//    0    0:new             #15  <Class RecyclerView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #18  <Method void RecyclerView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #22  <Method RecyclerView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #25  <Method RecyclerView$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #30  <Method RecyclerView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

			_cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
		}

	//    0    0:new             #12  <Class RecyclerView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void RecyclerView$SavedState$1()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	RecyclerView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		if(classloader == null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          13
	//*   6   10:goto            19
			classloader = ((Class) (android/support/v7/widget/RecyclerView$LayoutManager)).getClassLoader();
	//    7   13:ldc1            #23  <Class RecyclerView$LayoutManager>
	//    8   15:invokevirtual   #29  <Method ClassLoader Class.getClassLoader()>
	//    9   18:astore_2        
		mLayoutState = parcel.readParcelable(classloader);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:invokevirtual   #35  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   14   25:putfield        #37  <Field Parcelable mLayoutState>
	//   15   28:return          
	}

	RecyclerView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
