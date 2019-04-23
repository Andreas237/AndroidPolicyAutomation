// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.Parcel;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

static final class AppCompatDelegateImpl$PanelFeatureState$SavedState$1
	implements android.os.Parcelable.ClassLoaderCreator
{

	public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel)
	{
		return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(parcel, ((ClassLoader) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
	//    3    5:areturn         
	}

	public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int i)
	{
		return new AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AppCompatDelegateImpl.PanelFeatureState.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #37  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	AppCompatDelegateImpl$PanelFeatureState$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
