// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.widget:
//			w

class NestedScrollView$SavedState extends android.view.View.BaseSavedState
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("HorizontalScrollView.SavedState{");
	//    4    8:aload_1         
	//    5    9:ldc1            #39  <String "HorizontalScrollView.SavedState{">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #49  <Method int System.identityHashCode(Object)>
	//   11   20:invokestatic    #55  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" scrollPosition=");
	//   14   27:aload_1         
	//   15   28:ldc1            #57  <String " scrollPosition=">
	//   16   30:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(a);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field int a>
	//   21   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #62  <String "}">
	//   25   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #68  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field int a>
	//    7   11:invokevirtual   #72  <Method void Parcel.writeInt(int)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new w();
	public int a;

	static 
	{
	//    0    0:new             #12  <Class w>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void w()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	NestedScrollView$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void android.view.View$BaseSavedState(Parcel)>
		a = parcel.readInt();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
	//    6   10:putfield        #29  <Field int a>
	//    7   13:return          
	}

	NestedScrollView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
