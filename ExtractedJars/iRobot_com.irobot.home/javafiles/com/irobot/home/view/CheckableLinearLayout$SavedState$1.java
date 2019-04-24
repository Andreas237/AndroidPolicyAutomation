// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.os.Parcel;

// Referenced classes of package com.irobot.home.view:
//			CheckableLinearLayout

static final class CheckableLinearLayout$SavedState$1
	implements android.os.Parcelable.Creator
{

	public CheckableLinearLayout.SavedState a(Parcel parcel)
	{
		return new CheckableLinearLayout.SavedState(parcel, ((CheckableLinearLayout._cls1) (null)));
	//    0    0:new             #9   <Class CheckableLinearLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void CheckableLinearLayout$SavedState(Parcel, CheckableLinearLayout$1)>
	//    5    9:areturn         
	}

	public CheckableLinearLayout.SavedState[] a(int i)
	{
		return new CheckableLinearLayout.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CheckableLinearLayout.SavedState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method CheckableLinearLayout$SavedState a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #31  <Method CheckableLinearLayout$SavedState[] a(int)>
	//    3    5:areturn         
	}

	CheckableLinearLayout$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
