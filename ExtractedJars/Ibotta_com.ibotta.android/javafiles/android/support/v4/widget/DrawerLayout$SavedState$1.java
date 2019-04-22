// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

static final class DrawerLayout$SavedState$1
	implements android.os.tor
{

	public DrawerLayout.SavedState createFromParcel(Parcel parcel)
	{
		return new DrawerLayout.SavedState(parcel, ((ClassLoader) (null)));
	//    0    0:new             #9   <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public DrawerLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return new DrawerLayout.SavedState(parcel, classloader);
	//    0    0:new             #9   <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method DrawerLayout$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #29  <Method DrawerLayout$SavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public DrawerLayout.SavedState[] newArray(int i)
	{
		return new DrawerLayout.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       DrawerLayout.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #34  <Method DrawerLayout$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	DrawerLayout$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
