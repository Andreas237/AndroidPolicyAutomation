// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.view:
//			AbsSavedState, ar

public class ViewPager$SavedState extends AbsSavedState
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FragmentPager.SavedState{");
	//    4    8:aload_1         
	//    5    9:ldc1            #63  <String "FragmentPager.SavedState{">
	//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #73  <Method int System.identityHashCode(Object)>
	//   11   20:invokestatic    #79  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" position=");
	//   14   27:aload_1         
	//   15   28:ldc1            #81  <String " position=">
	//   16   30:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(a);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #45  <Field int a>
	//   21   39:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #86  <String "}">
	//   25   46:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #92  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field int a>
	//    7   11:invokevirtual   #96  <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(b, i);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field Parcelable b>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #100 <Method void Parcel.writeParcelable(Parcelable, int)>
	//   13   23:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ar();
	int a;
	Parcelable b;
	ClassLoader c;

	static 
	{
	//    0    0:new             #16  <Class ar>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ar()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	ViewPager$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		ClassLoader classloader1 = classloader;
	//    4    6:aload_2         
	//    5    7:astore_3        
		if(classloader == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       20
			classloader1 = ((Object)this).getClass().getClassLoader();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #31  <Method Class Object.getClass()>
	//   10   16:invokevirtual   #37  <Method ClassLoader Class.getClassLoader()>
	//   11   19:astore_3        
		a = parcel.readInt();
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #43  <Method int Parcel.readInt()>
	//   15   25:putfield        #45  <Field int a>
		b = parcel.readParcelable(classloader1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_3         
	//   19   31:invokevirtual   #49  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   20   34:putfield        #51  <Field Parcelable b>
		c = classloader1;
	//   21   37:aload_0         
	//   22   38:aload_3         
	//   23   39:putfield        #53  <Field ClassLoader c>
	//   24   42:return          
	}

	public ViewPager$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
