// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzt, zzu

public final class zzs extends zza
{

	public zzs(zzu zzu, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void zza()>
		zzbTW = zzu;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field zzu zzbTW>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int type>
		zzbTU = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field int zzbTU>
		zzbTV = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #33  <Field int zzbTV>
	//   14   25:return          
	}

	private static String zzpr(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 35
	//	               2 38
	//	               3 44
	//	               4 41
	//*   2   32:goto            47
		case 1: // '\001'
			return "CHANNEL_OPENED";
	//    3   35:ldc1            #37  <String "CHANNEL_OPENED">
	//    4   37:areturn         

		case 2: // '\002'
			return "CHANNEL_CLOSED";
	//    5   38:ldc1            #39  <String "CHANNEL_CLOSED">
	//    6   40:areturn         

		case 4: // '\004'
			return "OUTPUT_CLOSED";
	//    7   41:ldc1            #41  <String "OUTPUT_CLOSED">
	//    8   43:areturn         

		case 3: // '\003'
			return "INPUT_CLOSED";
	//    9   44:ldc1            #43  <String "INPUT_CLOSED">
	//   10   46:areturn         
		}
		return Integer.toString(i);
	//   11   47:iload_0         
	//   12   48:invokestatic    #48  <Method String Integer.toString(int)>
	//   13   51:areturn         
	}

	private static String zzps(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 44
	//	               1 35
	//	               2 38
	//	               3 41
	//*   2   32:goto            47
		case 1: // '\001'
			return "CLOSE_REASON_DISCONNECTED";
	//    3   35:ldc1            #51  <String "CLOSE_REASON_DISCONNECTED">
	//    4   37:areturn         

		case 2: // '\002'
			return "CLOSE_REASON_REMOTE_CLOSE";
	//    5   38:ldc1            #53  <String "CLOSE_REASON_REMOTE_CLOSE">
	//    6   40:areturn         

		case 3: // '\003'
			return "CLOSE_REASON_LOCAL_CLOSE";
	//    7   41:ldc1            #55  <String "CLOSE_REASON_LOCAL_CLOSE">
	//    8   43:areturn         

		case 0: // '\0'
			return "CLOSE_REASON_NORMAL";
	//    9   44:ldc1            #57  <String "CLOSE_REASON_NORMAL">
	//   10   46:areturn         
		}
		return Integer.toString(i);
	//   11   47:iload_0         
	//   12   48:invokestatic    #48  <Method String Integer.toString(int)>
	//   13   51:areturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (zzbTW)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field zzu zzbTW>
	//    2    4:invokestatic    #64  <Method String String.valueOf(Object)>
	//    3    7:astore          4
		String s1 = String.valueOf(((Object) (zzpr(type))));
	//    4    9:aload_0         
	//    5   10:getfield        #29  <Field int type>
	//    6   13:invokestatic    #66  <Method String zzpr(int)>
	//    7   16:invokestatic    #64  <Method String String.valueOf(Object)>
	//    8   19:astore          5
		String s2 = String.valueOf(((Object) (zzps(zzbTU))));
	//    9   21:aload_0         
	//   10   22:getfield        #31  <Field int zzbTU>
	//   11   25:invokestatic    #68  <Method String zzps(int)>
	//   12   28:invokestatic    #64  <Method String String.valueOf(Object)>
	//   13   31:astore          6
		int i = zzbTV;
	//   14   33:aload_0         
	//   15   34:getfield        #33  <Field int zzbTV>
	//   16   37:istore_1        
		int j = String.valueOf(((Object) (s))).length();
	//   17   38:aload           4
	//   18   40:invokestatic    #64  <Method String String.valueOf(Object)>
	//   19   43:invokevirtual   #72  <Method int String.length()>
	//   20   46:istore_2        
		int k = String.valueOf(((Object) (s1))).length();
	//   21   47:aload           5
	//   22   49:invokestatic    #64  <Method String String.valueOf(Object)>
	//   23   52:invokevirtual   #72  <Method int String.length()>
	//   24   55:istore_3        
		return (new StringBuilder(String.valueOf(((Object) (s2))).length() + (j + 81 + k))).append("ChannelEventParcelable[, channel=").append(s).append(", type=").append(s1).append(", closeReason=").append(s2).append(", appErrorCode=").append(i).append("]").toString();
	//   25   56:new             #74  <Class StringBuilder>
	//   26   59:dup             
	//   27   60:aload           6
	//   28   62:invokestatic    #64  <Method String String.valueOf(Object)>
	//   29   65:invokevirtual   #72  <Method int String.length()>
	//   30   68:iload_2         
	//   31   69:bipush          81
	//   32   71:iadd            
	//   33   72:iload_3         
	//   34   73:iadd            
	//   35   74:iadd            
	//   36   75:invokespecial   #77  <Method void StringBuilder(int)>
	//   37   78:ldc1            #79  <String "ChannelEventParcelable[, channel=">
	//   38   80:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   39   83:aload           4
	//   40   85:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   41   88:ldc1            #85  <String ", type=">
	//   42   90:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:aload           5
	//   44   95:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   45   98:ldc1            #87  <String ", closeReason=">
	//   46  100:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   47  103:aload           6
	//   48  105:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   49  108:ldc1            #89  <String ", appErrorCode=">
	//   50  110:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   51  113:iload_1         
	//   52  114:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   53  117:ldc1            #94  <String "]">
	//   54  119:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   55  122:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   56  125:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzt.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #102 <Method void com.google.android.gms.wearable.internal.zzt.zza(zzs, Parcel, int)>
	//    4    6:return          
	}

	public void zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int type>
		{
	//*   2    4:tableswitch     1 4: default 36
	//	               1 39
	//	               2 50
	//	               3 69
	//	               4 88
	//*   3   36:goto            107
		case 1: // '\001'
			channellistener.onChannelOpened(((com.google.android.gms.wearable.Channel) (zzbTW)));
	//    4   39:aload_1         
	//    5   40:aload_0         
	//    6   41:getfield        #27  <Field zzu zzbTW>
	//    7   44:invokeinterface #109 <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onChannelOpened(com.google.android.gms.wearable.Channel)>
			return;
	//    8   49:return          

		case 2: // '\002'
			channellistener.onChannelClosed(((com.google.android.gms.wearable.Channel) (zzbTW)), zzbTU, zzbTV);
	//    9   50:aload_1         
	//   10   51:aload_0         
	//   11   52:getfield        #27  <Field zzu zzbTW>
	//   12   55:aload_0         
	//   13   56:getfield        #31  <Field int zzbTU>
	//   14   59:aload_0         
	//   15   60:getfield        #33  <Field int zzbTV>
	//   16   63:invokeinterface #113 <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onChannelClosed(com.google.android.gms.wearable.Channel, int, int)>
			return;
	//   17   68:return          

		case 3: // '\003'
			channellistener.onInputClosed(((com.google.android.gms.wearable.Channel) (zzbTW)), zzbTU, zzbTV);
	//   18   69:aload_1         
	//   19   70:aload_0         
	//   20   71:getfield        #27  <Field zzu zzbTW>
	//   21   74:aload_0         
	//   22   75:getfield        #31  <Field int zzbTU>
	//   23   78:aload_0         
	//   24   79:getfield        #33  <Field int zzbTV>
	//   25   82:invokeinterface #116 <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onInputClosed(com.google.android.gms.wearable.Channel, int, int)>
			return;
	//   26   87:return          

		case 4: // '\004'
			channellistener.onOutputClosed(((com.google.android.gms.wearable.Channel) (zzbTW)), zzbTU, zzbTV);
	//   27   88:aload_1         
	//   28   89:aload_0         
	//   29   90:getfield        #27  <Field zzu zzbTW>
	//   30   93:aload_0         
	//   31   94:getfield        #31  <Field int zzbTU>
	//   32   97:aload_0         
	//   33   98:getfield        #33  <Field int zzbTV>
	//   34  101:invokeinterface #119 <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onOutputClosed(com.google.android.gms.wearable.Channel, int, int)>
			return;
	//   35  106:return          
		}
		int i = type;
	//   36  107:aload_0         
	//   37  108:getfield        #29  <Field int type>
	//   38  111:istore_2        
		Log.w("ChannelEventParcelable", (new StringBuilder(25)).append("Unknown type: ").append(i).toString());
	//   39  112:ldc1            #121 <String "ChannelEventParcelable">
	//   40  114:new             #74  <Class StringBuilder>
	//   41  117:dup             
	//   42  118:bipush          25
	//   43  120:invokespecial   #77  <Method void StringBuilder(int)>
	//   44  123:ldc1            #123 <String "Unknown type: ">
	//   45  125:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   46  128:iload_2         
	//   47  129:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   48  132:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   49  135:invokestatic    #129 <Method int Log.w(String, String)>
	//   50  138:pop             
	//   51  139:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzt();
	final int type;
	final int zzbTU;
	final int zzbTV;
	final zzu zzbTW;

	static 
	{
	//    0    0:new             #17  <Class zzt>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzt()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
