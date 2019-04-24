// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

protected static class BottomSheetBehavior$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(state);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field int state>
	//    7   11:invokevirtual   #53  <Method void Parcel.writeInt(int)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

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

	}
);
	final int state;

	static 
	{
	//    0    0:new             #9   <Class BottomSheetBehavior$SavedState$3>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void BottomSheetBehavior$SavedState$3()>
	//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public BottomSheetBehavior$SavedState(Parcel parcel)
	{
		this(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #32  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	public BottomSheetBehavior$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void AbsSavedState(Parcel, ClassLoader)>
		state = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #39  <Method int Parcel.readInt()>
	//    7   11:putfield        #41  <Field int state>
	//    8   14:return          
	}

	public BottomSheetBehavior$SavedState(Parcelable parcelable, int i)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void AbsSavedState(Parcelable)>
		state = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #41  <Field int state>
	//    6   10:return          
	}
}
