// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

static final class StaggeredGridLayoutManager$SavedState$1
	implements android.os.Parcelable.Creator
{

	public StaggeredGridLayoutManager.SavedState a(Parcel parcel)
	{
		return new StaggeredGridLayoutManager.SavedState(parcel);
	//    0    0:new             #9   <Class StaggeredGridLayoutManager$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
	//    4    8:areturn         
	}

	public StaggeredGridLayoutManager.SavedState[] a(int i)
	{
		return new StaggeredGridLayoutManager.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       StaggeredGridLayoutManager.SavedState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method StaggeredGridLayoutManager$SavedState a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #31  <Method StaggeredGridLayoutManager$SavedState[] a(int)>
	//    3    5:areturn         
	}

	StaggeredGridLayoutManager$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
