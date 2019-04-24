// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.Parcel;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

static final class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1
	implements android.os.Parcelable.ClassLoaderCreator
{

	public AppCompatDelegateImplV9.PanelFeatureState.SavedState a(Parcel parcel)
	{
		return AppCompatDelegateImplV9.PanelFeatureState.SavedState.a(parcel, ((ClassLoader) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.a(Parcel, ClassLoader)>
	//    3    5:areturn         
	}

	public AppCompatDelegateImplV9.PanelFeatureState.SavedState a(Parcel parcel, ClassLoader classloader)
	{
		return AppCompatDelegateImplV9.PanelFeatureState.SavedState.a(parcel, classloader);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.a(Parcel, ClassLoader)>
	//    3    5:areturn         
	}

	public AppCompatDelegateImplV9.PanelFeatureState.SavedState[] a(int i)
	{
		return new AppCompatDelegateImplV9.PanelFeatureState.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AppCompatDelegateImplV9.PanelFeatureState.SavedState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel)>
	//    3    5:areturn         
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (a(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #36  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] a(int)>
	//    3    5:areturn         
	}

	AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
