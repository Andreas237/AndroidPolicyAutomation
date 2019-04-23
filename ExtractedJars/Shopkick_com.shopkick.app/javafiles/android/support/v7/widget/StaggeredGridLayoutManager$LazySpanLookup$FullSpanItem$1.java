// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

static final class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
	implements android.os.Parcelable.Creator
{

	public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel)
	{
		return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
	//    0    0:new             #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #25  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i)
	{
		return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
	//    0    0:iload_1         
	//    1    1:anewarray       StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] newArray(int)>
	//    3    5:areturn         
	}

	StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
