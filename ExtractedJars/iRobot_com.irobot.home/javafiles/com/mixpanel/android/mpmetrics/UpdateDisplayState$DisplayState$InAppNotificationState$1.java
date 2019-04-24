// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			UpdateDisplayState

static final class UpdateDisplayState$DisplayState$InAppNotificationState$1
	implements android.os.Parcelable.Creator
{

	public UpdateDisplayState.DisplayState.InAppNotificationState a(Parcel parcel)
	{
		Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState)).getClassLoader());
	//    0    0:new             #24  <Class Bundle>
	//    1    3:dup             
	//    2    4:ldc1            #9   <Class UpdateDisplayState$DisplayState$InAppNotificationState>
	//    3    6:invokevirtual   #30  <Method ClassLoader Class.getClassLoader()>
	//    4    9:invokespecial   #33  <Method void Bundle(ClassLoader)>
	//    5   12:astore_2        
		bundle.readFromParcel(parcel);
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #37  <Method void Bundle.readFromParcel(Parcel)>
		return new UpdateDisplayState.DisplayState.InAppNotificationState(bundle, ((UpdateDisplayState._cls1) (null)));
	//    9   18:new             #9   <Class UpdateDisplayState$DisplayState$InAppNotificationState>
	//   10   21:dup             
	//   11   22:aload_2         
	//   12   23:aconst_null     
	//   13   24:invokespecial   #40  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle, UpdateDisplayState$1)>
	//   14   27:areturn         
	}

	public UpdateDisplayState.DisplayState.InAppNotificationState[] a(int i)
	{
		return new UpdateDisplayState.DisplayState.InAppNotificationState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       UpdateDisplayState.DisplayState.InAppNotificationState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method UpdateDisplayState$DisplayState$InAppNotificationState a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #49  <Method UpdateDisplayState$DisplayState$InAppNotificationState[] a(int)>
	//    3    5:areturn         
	}

	UpdateDisplayState$DisplayState$InAppNotificationState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
