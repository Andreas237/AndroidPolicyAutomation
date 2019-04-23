// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;

final class LinearLayoutManager$SavedState$1
	implements android.os.Parcelable.Creator
{

	public LinearLayoutManager.SavedState createFromParcel(Parcel parcel)
	{
		return new LinearLayoutManager.SavedState(parcel);
	//    0    0:new             #15  <Class LinearLayoutManager$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void LinearLayoutManager$SavedState(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method LinearLayoutManager$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LinearLayoutManager.SavedState[] newArray(int i)
	{
		return new LinearLayoutManager.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LinearLayoutManager.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method LinearLayoutManager$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	LinearLayoutManager$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
