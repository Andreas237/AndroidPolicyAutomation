// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

static final class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1
	implements ParcelableCompatCreatorCallbacks
{

	public AppCompatDelegateImplV9.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return AppCompatDelegateImplV9.PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #28  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public AppCompatDelegateImplV9.PanelFeatureState.SavedState[] newArray(int i)
	{
		return new AppCompatDelegateImplV9.PanelFeatureState.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AppCompatDelegateImplV9.PanelFeatureState.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
