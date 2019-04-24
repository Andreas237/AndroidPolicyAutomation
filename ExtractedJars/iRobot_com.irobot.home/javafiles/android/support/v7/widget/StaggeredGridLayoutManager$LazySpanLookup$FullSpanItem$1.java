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

	public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel parcel)
	{
		return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
	//    0    0:new             #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #25  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
	//    4    8:areturn         
	}

	public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] a(int i)
	{
		return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
	//    0    0:iload_1         
	//    1    1:anewarray       StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #34  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] a(int)>
	//    3    5:areturn         
	}

	StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
