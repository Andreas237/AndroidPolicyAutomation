// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;

// Referenced classes of package android.support.v4.view:
//			ViewPager

static final class ViewPager$SavedState$1
	implements android.os.reator
{

	public ViewPager.SavedState a(Parcel parcel)
	{
		return new ViewPager.SavedState(parcel, ((ClassLoader) (null)));
	//    0    0:new             #9   <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public ViewPager.SavedState a(Parcel parcel, ClassLoader classloader)
	{
		return new ViewPager.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public ViewPager.SavedState[] a(int i)
	{
		return new ViewPager.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ViewPager.SavedState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method ViewPager$SavedState a(Parcel)>
	//    3    5:areturn         
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (a(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #31  <Method ViewPager$SavedState a(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method ViewPager$SavedState[] a(int)>
	//    3    5:areturn         
	}

	ViewPager$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
