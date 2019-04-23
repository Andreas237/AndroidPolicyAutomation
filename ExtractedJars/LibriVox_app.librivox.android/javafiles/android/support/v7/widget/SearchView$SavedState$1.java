// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;

final class SearchView$SavedState$1
	implements android.os.eator
{

	public SearchView.SavedState createFromParcel(Parcel parcel)
	{
		return new SearchView.SavedState(parcel, ((ClassLoader) (null)));
	//    0    0:new             #15  <Class SearchView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #18  <Method void SearchView$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return new SearchView.SavedState(parcel, classloader);
	//    0    0:new             #15  <Class SearchView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #18  <Method void SearchView$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method SearchView$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #25  <Method SearchView$SavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public SearchView.SavedState[] newArray(int i)
	{
		return new SearchView.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       SearchView.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method SearchView$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	SearchView$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
