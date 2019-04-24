// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			UpdateDisplayState, InAppNotification

public static final class UpdateDisplayState$DisplayState$InAppNotificationState extends UpdateDisplayState.DisplayState
{

	public InAppNotification a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field InAppNotification a>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #40  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putParcelable(c, ((android.os.Parcelable) (a)));
	//    4    8:aload_3         
	//    5    9:getstatic       #38  <Field String c>
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field InAppNotification a>
	//    8   16:invokevirtual   #70  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putInt(d, b);
	//    9   19:aload_3         
	//   10   20:getstatic       #50  <Field String d>
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field int b>
	//   13   27:invokevirtual   #74  <Method void Bundle.putInt(String, int)>
		parcel.writeBundle(bundle);
	//   14   30:aload_1         
	//   15   31:aload_3         
	//   16   32:invokevirtual   #79  <Method void Parcel.writeBundle(Bundle)>
	//   17   35:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

	}
;
	private static String c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
	private static String d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
	private final InAppNotification a;
	private final int b;

	static 
	{
	//    0    0:new             #10  <Class UpdateDisplayState$DisplayState$InAppNotificationState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void UpdateDisplayState$DisplayState$InAppNotificationState$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private UpdateDisplayState$DisplayState$InAppNotificationState(Bundle bundle)
	{
		super(((UpdateDisplayState._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #36  <Method void UpdateDisplayState$DisplayState(UpdateDisplayState$1)>
		a = (InAppNotification)bundle.getParcelable(c);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #38  <Field String c>
	//    6   10:invokevirtual   #44  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    7   13:checkcast       #46  <Class InAppNotification>
	//    8   16:putfield        #48  <Field InAppNotification a>
		b = bundle.getInt(d);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getstatic       #50  <Field String d>
	//   12   24:invokevirtual   #54  <Method int Bundle.getInt(String)>
	//   13   27:putfield        #56  <Field int b>
	//   14   30:return          
	}

	UpdateDisplayState$DisplayState$InAppNotificationState(Bundle bundle, UpdateDisplayState._cls1 _pcls1)
	{
		this(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle)>
	//    3    5:return          
	}

	public UpdateDisplayState$DisplayState$InAppNotificationState(InAppNotification inappnotification, int i)
	{
		super(((UpdateDisplayState._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #36  <Method void UpdateDisplayState$DisplayState(UpdateDisplayState$1)>
		a = inappnotification;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #48  <Field InAppNotification a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #56  <Field int b>
	//    9   15:return          
	}
}
