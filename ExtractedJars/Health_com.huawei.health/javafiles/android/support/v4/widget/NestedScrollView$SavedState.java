// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.widget:
//			NestedScrollView

static class NestedScrollView$SavedState extends android.view.View.BaseSavedState
{

	public String toString()
	{
		return (new StringBuilder()).append("HorizontalScrollView.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" scrollPosition=").append(scrollPosition).append("}").toString();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:ldc1            #43  <String "HorizontalScrollView.SavedState{">
	//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #53  <Method int System.identityHashCode(Object)>
	//    7   16:invokestatic    #59  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #61  <String " scrollPosition=">
	//   10   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #33  <Field int scrollPosition>
	//   13   31:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   14   34:ldc1            #66  <String "}">
	//   15   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #72  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(scrollPosition);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field int scrollPosition>
	//    7   11:invokevirtual   #76  <Method void Parcel.writeInt(int)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public NestedScrollView.SavedState createFromParcel(Parcel parcel)
		{
			return new NestedScrollView.SavedState(parcel);
		//    0    0:new             #9   <Class NestedScrollView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void NestedScrollView$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method NestedScrollView$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public NestedScrollView.SavedState[] newArray(int i)
		{
			return new NestedScrollView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       NestedScrollView.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method NestedScrollView$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public int scrollPosition;

	static 
	{
	//    0    0:new             #9   <Class NestedScrollView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void NestedScrollView$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	NestedScrollView$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void android.view.View$BaseSavedState(Parcel)>
		scrollPosition = parcel.readInt();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//    6   10:putfield        #33  <Field int scrollPosition>
	//    7   13:return          
	}

	NestedScrollView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
