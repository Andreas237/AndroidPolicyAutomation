// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

static final class SlidingPaneLayout$SavedState$1
	implements ParcelableCompatCreatorCallbacks
{

	public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return new SlidingPaneLayout.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #25  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public SlidingPaneLayout.SavedState[] newArray(int i)
	{
		return new SlidingPaneLayout.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       SlidingPaneLayout.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method SlidingPaneLayout$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	SlidingPaneLayout$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
