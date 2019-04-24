// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v4.view:
//			AbsSavedState, ViewPager

public static class ViewPager$SavedState extends AbsSavedState
{

	public String toString()
	{
		return (new StringBuilder()).append("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" position=").append(position).append("}").toString();
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StringBuilder()>
	//    3    7:ldc1            #73  <String "FragmentPager.SavedState{">
	//    4    9:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #83  <Method int System.identityHashCode(Object)>
	//    7   16:invokestatic    #89  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #91  <String " position=">
	//   10   24:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #55  <Field int position>
	//   13   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   14   34:ldc1            #96  <String "}">
	//   15   36:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #102 <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(position);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field int position>
	//    7   11:invokevirtual   #106 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(adapterState, i);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #61  <Field Parcelable adapterState>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #110 <Method void Parcel.writeParcelable(Parcelable, int)>
	//   13   23:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new ViewPager.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class ViewPager$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #25  <Method ViewPager$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public ViewPager.SavedState[] newArray(int i)
		{
			return new ViewPager.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ViewPager.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method ViewPager$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
);
	Parcelable adapterState;
	ClassLoader loader;
	int position;

	static 
	{
	//    0    0:new             #9   <Class ViewPager$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ViewPager$SavedState$1()>
	//    3    7:invokestatic    #29  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	ViewPager$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method void AbsSavedState(Parcel, ClassLoader)>
		ClassLoader classloader1 = classloader;
	//    4    6:aload_2         
	//    5    7:astore_3        
		if(classloader == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       20
			classloader1 = ((Object)this).getClass().getClassLoader();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #41  <Method Class Object.getClass()>
	//   10   16:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
	//   11   19:astore_3        
		position = parcel.readInt();
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #53  <Method int Parcel.readInt()>
	//   15   25:putfield        #55  <Field int position>
		adapterState = parcel.readParcelable(classloader1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_3         
	//   19   31:invokevirtual   #59  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   20   34:putfield        #61  <Field Parcelable adapterState>
		loader = classloader1;
	//   21   37:aload_0         
	//   22   38:aload_3         
	//   23   39:putfield        #63  <Field ClassLoader loader>
	//   24   42:return          
	}

	public ViewPager$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
