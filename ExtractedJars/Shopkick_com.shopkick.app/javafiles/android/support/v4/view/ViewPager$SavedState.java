// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.view:
//			AbsSavedState, ViewPager

public static class ViewPager$SavedState extends AbsSavedState
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FragmentPager.SavedState{");
	//    4    8:aload_1         
	//    5    9:ldc1            #69  <String "FragmentPager.SavedState{">
	//    6   11:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #79  <Method int System.identityHashCode(Object)>
	//   11   20:invokestatic    #85  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" position=");
	//   14   27:aload_1         
	//   15   28:ldc1            #87  <String " position=">
	//   16   30:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(position);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #49  <Field int position>
	//   21   39:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #92  <String "}">
	//   25   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #98  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(position);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field int position>
	//    7   11:invokevirtual   #102 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(adapterState, i);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #55  <Field Parcelable adapterState>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #106 <Method void Parcel.writeParcelable(Parcelable, int)>
	//   13   23:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public ViewPager.SavedState createFromParcel(Parcel parcel)
		{
			return new ViewPager.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class ViewPager$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

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

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method ViewPager$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method ViewPager$SavedState createFromParcel(Parcel, ClassLoader)>
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
		//    2    2:invokevirtual   #34  <Method ViewPager$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	Parcelable adapterState;
	ClassLoader loader;
	int position;

	static 
	{
	//    0    0:new             #9   <Class ViewPager$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ViewPager$SavedState$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	ViewPager$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
		ClassLoader classloader1 = classloader;
	//    4    6:aload_2         
	//    5    7:astore_3        
		if(classloader == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       20
			classloader1 = ((Object)this).getClass().getClassLoader();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #35  <Method Class Object.getClass()>
	//   10   16:invokevirtual   #41  <Method ClassLoader Class.getClassLoader()>
	//   11   19:astore_3        
		position = parcel.readInt();
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #47  <Method int Parcel.readInt()>
	//   15   25:putfield        #49  <Field int position>
		adapterState = parcel.readParcelable(classloader1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_3         
	//   19   31:invokevirtual   #53  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   20   34:putfield        #55  <Field Parcelable adapterState>
		loader = classloader1;
	//   21   37:aload_0         
	//   22   38:aload_3         
	//   23   39:putfield        #57  <Field ClassLoader loader>
	//   24   42:return          
	}

	public ViewPager$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
