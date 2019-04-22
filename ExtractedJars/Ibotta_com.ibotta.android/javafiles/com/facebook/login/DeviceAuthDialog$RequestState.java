// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

private static class DeviceAuthDialog$RequestState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getAuthorizationUri()
	{
		return authorizationUri;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String authorizationUri>
	//    2    4:areturn         
	}

	public long getInterval()
	{
		return interval;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long interval>
	//    2    4:lreturn         
	}

	public String getRequestCode()
	{
		return requestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String requestCode>
	//    2    4:areturn         
	}

	public String getUserCode()
	{
		return userCode;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String userCode>
	//    2    4:areturn         
	}

	public void setInterval(long l)
	{
		interval = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #47  <Field long interval>
	//    3    5:return          
	}

	public void setLastPoll(long l)
	{
		lastPoll = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #49  <Field long lastPoll>
	//    3    5:return          
	}

	public void setRequestCode(String s)
	{
		requestCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String requestCode>
	//    3    5:return          
	}

	public void setUserCode(String s)
	{
		userCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String userCode>
		authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[] {
			s
		});
	//    3    5:aload_0         
	//    4    6:getstatic       #69  <Field Locale Locale.ENGLISH>
	//    5    9:ldc1            #71  <String "https://facebook.com/device?user_code=%1$s&qr=1">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_1         
	//   11   18:aastore         
	//   12   19:invokestatic    #77  <Method String String.format(Locale, String, Object[])>
	//   13   22:putfield        #54  <Field String authorizationUri>
	//   14   25:return          
	}

	public boolean withinLastRefreshWindow()
	{
		long l = lastPoll;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long lastPoll>
	//    2    4:lstore_1        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(l == 0L)
	//*   5    7:lload_1         
	//*   6    8:lconst_0        
	//*   7    9:lcmp            
	//*   8   10:ifne            15
			return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		if((new Date()).getTime() - lastPoll - interval * 1000L < 0L)
	//*  11   15:new             #81  <Class Date>
	//*  12   18:dup             
	//*  13   19:invokespecial   #82  <Method void Date()>
	//*  14   22:invokevirtual   #85  <Method long Date.getTime()>
	//*  15   25:aload_0         
	//*  16   26:getfield        #49  <Field long lastPoll>
	//*  17   29:lsub            
	//*  18   30:aload_0         
	//*  19   31:getfield        #47  <Field long interval>
	//*  20   34:ldc2w           #86  <Long 1000L>
	//*  21   37:lmul            
	//*  22   38:lsub            
	//*  23   39:lconst_0        
	//*  24   40:lcmp            
	//*  25   41:ifge            46
			flag = true;
	//   26   44:iconst_1        
	//   27   45:istore_3        
		return flag;
	//   28   46:iload_3         
	//   29   47:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(userCode);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field String userCode>
	//    3    5:invokevirtual   #92  <Method void Parcel.writeString(String)>
		parcel.writeString(requestCode);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field String requestCode>
	//    7   13:invokevirtual   #92  <Method void Parcel.writeString(String)>
		parcel.writeLong(interval);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field long interval>
	//   11   21:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		parcel.writeLong(lastPoll);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field long lastPoll>
	//   15   29:invokevirtual   #95  <Method void Parcel.writeLong(long)>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel)
		{
			return new DeviceAuthDialog.RequestState(parcel);
		//    0    0:new             #9   <Class DeviceAuthDialog$RequestState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void DeviceAuthDialog$RequestState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method DeviceAuthDialog$RequestState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DeviceAuthDialog.RequestState[] newArray(int i)
		{
			return new DeviceAuthDialog.RequestState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DeviceAuthDialog.RequestState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method DeviceAuthDialog$RequestState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private String authorizationUri;
	private long interval;
	private long lastPoll;
	private String requestCode;
	private String userCode;

	static 
	{
	//    0    0:new             #11  <Class DeviceAuthDialog$RequestState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void DeviceAuthDialog$RequestState$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	DeviceAuthDialog$RequestState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	protected DeviceAuthDialog$RequestState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		userCode = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method String Parcel.readString()>
	//    5    9:putfield        #39  <Field String userCode>
		requestCode = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #37  <Method String Parcel.readString()>
	//    9   17:putfield        #41  <Field String requestCode>
		interval = parcel.readLong();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #45  <Method long Parcel.readLong()>
	//   13   25:putfield        #47  <Field long interval>
		lastPoll = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #45  <Method long Parcel.readLong()>
	//   17   33:putfield        #49  <Field long lastPoll>
	//   18   36:return          
	}
}
