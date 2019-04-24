// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
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
	//    3    3:invokespecial   #41  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field int a>
	//    7   11:invokevirtual   #45  <Method void Parcel.writeInt(int)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public BottomSheetBehavior.SavedState a(Parcel parcel)
		{
			return new BottomSheetBehavior.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public BottomSheetBehavior.SavedState a(Parcel parcel, ClassLoader classloader)
		{
			return new BottomSheetBehavior.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public BottomSheetBehavior.SavedState[] a(int i)
		{
			return new BottomSheetBehavior.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       BottomSheetBehavior.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method BottomSheetBehavior$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #31  <Method BottomSheetBehavior$SavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method BottomSheetBehavior$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	final int a;

	static 
	{
	//    0    0:new             #9   <Class BottomSheetBehavior$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void BottomSheetBehavior$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public BottomSheetBehavior$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		a = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #31  <Method int Parcel.readInt()>
	//    7   11:putfield        #33  <Field int a>
	//    8   14:return          
	}

	public BottomSheetBehavior$SavedState(Parcelable parcelable, int i)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void AbsSavedState(Parcelable)>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #33  <Field int a>
	//    6   10:return          
	}
}
