// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			UpdateDisplayState

static final class UpdateDisplayState$DisplayState$1
	implements android.os.Parcelable.Creator
{

	public UpdateDisplayState.DisplayState a(Parcel parcel)
	{
		Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState)).getClassLoader());
	//    0    0:new             #21  <Class Bundle>
	//    1    3:dup             
	//    2    4:ldc1            #9   <Class UpdateDisplayState$DisplayState>
	//    3    6:invokevirtual   #27  <Method ClassLoader Class.getClassLoader()>
	//    4    9:invokespecial   #30  <Method void Bundle(ClassLoader)>
	//    5   12:astore_2        
		bundle.readFromParcel(parcel);
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #34  <Method void Bundle.readFromParcel(Parcel)>
		parcel = ((Parcel) (bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY")));
	//    9   18:aload_2         
	//   10   19:ldc1            #36  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY">
	//   11   21:invokevirtual   #40  <Method String Bundle.getString(String)>
	//   12   24:astore_1        
		bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
	//   13   25:aload_2         
	//   14   26:ldc1            #42  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY">
	//   15   28:invokevirtual   #46  <Method Bundle Bundle.getBundle(String)>
	//   16   31:astore_2        
		if("InAppNotificationState".equals(((Object) (parcel))))
	//*  17   32:ldc1            #48  <String "InAppNotificationState">
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*  20   38:ifeq            51
		{
			return ((UpdateDisplayState.DisplayState) (new AppNotificationState(bundle, ((UpdateDisplayState._cls1) (null)))));
	//   21   41:new             #56  <Class UpdateDisplayState$DisplayState$InAppNotificationState>
	//   22   44:dup             
	//   23   45:aload_2         
	//   24   46:aconst_null     
	//   25   47:invokespecial   #59  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle, UpdateDisplayState$1)>
	//   26   50:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   27   51:new             #61  <Class StringBuilder>
	//   28   54:dup             
	//   29   55:invokespecial   #62  <Method void StringBuilder()>
	//   30   58:astore_2        
			stringbuilder.append("Unrecognized display state type ");
	//   31   59:aload_2         
	//   32   60:ldc1            #64  <String "Unrecognized display state type ">
	//   33   62:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			stringbuilder.append(((String) (parcel)));
	//   35   66:aload_2         
	//   36   67:aload_1         
	//   37   68:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   39   72:new             #70  <Class RuntimeException>
	//   40   75:dup             
	//   41   76:aload_2         
	//   42   77:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   43   80:invokespecial   #77  <Method void RuntimeException(String)>
	//   44   83:athrow          
		}
	}

	public UpdateDisplayState.DisplayState[] a(int i)
	{
		return new UpdateDisplayState.DisplayState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       UpdateDisplayState.DisplayState[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method UpdateDisplayState$DisplayState a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #86  <Method UpdateDisplayState$DisplayState[] a(int)>
	//    3    5:areturn         
	}

	UpdateDisplayState$DisplayState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
