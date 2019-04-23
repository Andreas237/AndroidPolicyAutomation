// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;

final class StaggeredGridLayoutManager$SavedState$1
	implements android.os.Parcelable.Creator
{

	public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel)
	{
		return new StaggeredGridLayoutManager.SavedState(parcel);
	//    0    0:new             #15  <Class StaggeredGridLayoutManager$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method StaggeredGridLayoutManager$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public StaggeredGridLayoutManager.SavedState[] newArray(int i)
	{
		return new StaggeredGridLayoutManager.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       StaggeredGridLayoutManager.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method StaggeredGridLayoutManager$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	StaggeredGridLayoutManager$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
