// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.*;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			UpdateDisplayState, InAppNotification

public static abstract class UpdateDisplayState$DisplayState
	implements Parcelable
{
	public static final class InAppNotificationState extends UpdateDisplayState.DisplayState
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
			bundle.putParcelable(c, ((Parcelable) (a)));
		//    4    8:aload_3         
		//    5    9:getstatic       #38  <Field String c>
		//    6   12:aload_0         
		//    7   13:getfield        #48  <Field InAppNotification a>
		//    8   16:invokevirtual   #70  <Method void Bundle.putParcelable(String, Parcelable)>
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

			public InAppNotificationState a(Parcel parcel)
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
				return new InAppNotificationState(bundle, ((UpdateDisplayState._cls1) (null)));
			//    9   18:new             #9   <Class UpdateDisplayState$DisplayState$InAppNotificationState>
			//   10   21:dup             
			//   11   22:aload_2         
			//   12   23:aconst_null     
			//   13   24:invokespecial   #40  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle, UpdateDisplayState$1)>
			//   14   27:areturn         
			}

			public InAppNotificationState[] a(int i)
			{
				return new InAppNotificationState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       InAppNotificationState[]
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

		private InAppNotificationState(Bundle bundle)
		{
			super(((UpdateDisplayState._cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #36  <Method void UpdateDisplayState$DisplayState(UpdateDisplayState$1)>
			a = (InAppNotification)bundle.getParcelable(c);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getstatic       #38  <Field String c>
		//    6   10:invokevirtual   #44  <Method Parcelable Bundle.getParcelable(String)>
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

		InAppNotificationState(Bundle bundle, UpdateDisplayState._cls1 _pcls1)
		{
			this(bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #59  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle)>
		//    3    5:return          
		}

		public InAppNotificationState(InAppNotification inappnotification, int i)
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


	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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
				return ((UpdateDisplayState.DisplayState) (new InAppNotificationState(bundle, ((UpdateDisplayState._cls1) (null)))));
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

	}
;

	static 
	{
	//    0    0:new             #11  <Class UpdateDisplayState$DisplayState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void UpdateDisplayState$DisplayState$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private UpdateDisplayState$DisplayState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	UpdateDisplayState$DisplayState(UpdateDisplayState._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void UpdateDisplayState$DisplayState()>
	//    2    4:return          
	}
}
