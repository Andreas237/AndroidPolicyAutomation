// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout

static final class AppBarLayout$Behavior$SavedState$4
	implements ParcelableCompatCreatorCallbacks
{

	public AppBarLayout.Behavior.SavedState b(Parcel parcel, ClassLoader classloader)
	{
		return new AppBarLayout.Behavior.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public AppBarLayout.Behavior.SavedState[] c(int i)
	{
		return new AppBarLayout.Behavior.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AppBarLayout.Behavior.SavedState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (b(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #31  <Method AppBarLayout$Behavior$SavedState b(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (c(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method AppBarLayout$Behavior$SavedState[] c(int)>
	//    3    5:areturn         
	}

	AppBarLayout$Behavior$SavedState$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
