// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Parcel;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableListView

static final class ObservableListView$SavedState$1
	implements android.os.Parcelable.Creator
{

	public ObservableListView.SavedState createFromParcel(Parcel parcel)
	{
		return new ObservableListView.SavedState(parcel, ((ObservableListView._cls1) (null)));
	//    0    0:new             #9   <Class ObservableListView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void ObservableListView$SavedState(Parcel, ObservableListView$1)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method ObservableListView$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ObservableListView.SavedState[] newArray(int i)
	{
		return new ObservableListView.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ObservableListView.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method ObservableListView$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	ObservableListView$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
