// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableScrollView

static class ObservableScrollView$SavedState extends android.view.View.BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(prevScrollY);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field int prevScrollY>
	//    7   11:invokevirtual   #49  <Method void Parcel.writeInt(int)>
		parcel.writeInt(scrollY);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field int scrollY>
	//   11   19:invokevirtual   #49  <Method void Parcel.writeInt(int)>
	//   12   22:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableScrollView.SavedState createFromParcel(Parcel parcel)
		{
			return new ObservableScrollView.SavedState(parcel, ((ObservableScrollView._cls1) (null)));
		//    0    0:new             #9   <Class ObservableScrollView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void ObservableScrollView$SavedState(Parcel, ObservableScrollView$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method ObservableScrollView$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableScrollView.SavedState[] newArray(int i)
		{
			return new ObservableScrollView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableScrollView.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method ObservableScrollView$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	int prevScrollY;
	int scrollY;

	static 
	{
	//    0    0:new             #9   <Class ObservableScrollView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ObservableScrollView$SavedState$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private ObservableScrollView$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void android.view.View$BaseSavedState(Parcel)>
		prevScrollY = parcel.readInt();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #32  <Method int Parcel.readInt()>
	//    6   10:putfield        #34  <Field int prevScrollY>
		scrollY = parcel.readInt();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #32  <Method int Parcel.readInt()>
	//   10   18:putfield        #36  <Field int scrollY>
	//   11   21:return          
	}

	ObservableScrollView$SavedState(Parcel parcel, ObservableScrollView._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void ObservableScrollView$SavedState(Parcel)>
	//    3    5:return          
	}

	ObservableScrollView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
