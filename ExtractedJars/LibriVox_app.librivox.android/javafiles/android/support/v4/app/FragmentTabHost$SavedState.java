// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//			bb

class FragmentTabHost$SavedState extends android.view.View.BaseSavedState
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FragmentTabHost.SavedState{");
	//    4    8:aload_1         
	//    5    9:ldc1            #38  <String "FragmentTabHost.SavedState{">
	//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #48  <Method int System.identityHashCode(Object)>
	//   11   20:invokestatic    #54  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" curTab=");
	//   14   27:aload_1         
	//   15   28:ldc1            #56  <String " curTab=">
	//   16   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(a);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field String a>
	//   21   39:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #58  <String "}">
	//   25   46:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #64  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeString(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field String a>
	//    7   11:invokevirtual   #68  <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bb();
	String a;

	static 
	{
	//    0    0:new             #12  <Class bb>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bb()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	FragmentTabHost$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void android.view.View$BaseSavedState(Parcel)>
		a = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method String Parcel.readString()>
	//    6   10:putfield        #29  <Field String a>
	//    7   13:return          
	}

	FragmentTabHost$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
