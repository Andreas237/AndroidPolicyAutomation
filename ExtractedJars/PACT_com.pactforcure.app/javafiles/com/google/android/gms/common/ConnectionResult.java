// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.common:
//			zzb

public final class ConnectionResult extends zza
{

	public ConnectionResult(int i)
	{
		this(i, ((PendingIntent) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #77  <Method void ConnectionResult(int, PendingIntent, String)>
	//    5    7:return          
	}

	ConnectionResult(int i, int j, PendingIntent pendingintent, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #81  <Field int mVersionCode>
		zzauz = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #83  <Field int zzauz>
		mPendingIntent = pendingintent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #85  <Field PendingIntent mPendingIntent>
		zzawY = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #87  <Field String zzawY>
	//   14   25:return          
	}

	public ConnectionResult(int i, PendingIntent pendingintent)
	{
		this(i, pendingintent, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #77  <Method void ConnectionResult(int, PendingIntent, String)>
	//    5    7:return          
	}

	public ConnectionResult(int i, PendingIntent pendingintent, String s)
	{
		this(1, i, pendingintent, s);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #90  <Method void ConnectionResult(int, int, PendingIntent, String)>
	//    6    8:return          
	}

	static String getStatusString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    24: default 204
	//	               -1: 300
	//	               0: 231
	//	               1: 234
	//	               2: 237
	//	               3: 240
	//	               4: 243
	//	               5: 246
	//	               6: 249
	//	               7: 252
	//	               8: 255
	//	               9: 258
	//	               10: 261
	//	               11: 264
	//	               13: 267
	//	               14: 270
	//	               15: 273
	//	               16: 276
	//	               17: 279
	//	               18: 282
	//	               19: 285
	//	               20: 288
	//	               21: 291
	//	               99: 297
	//	               1500: 294
		default:
			return (new StringBuilder(31)).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
	//    2  204:new             #94  <Class StringBuilder>
	//    3  207:dup             
	//    4  208:bipush          31
	//    5  210:invokespecial   #95  <Method void StringBuilder(int)>
	//    6  213:ldc1            #97  <String "UNKNOWN_ERROR_CODE(">
	//    7  215:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    8  218:iload_0         
	//    9  219:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   10  222:ldc1            #106 <String ")">
	//   11  224:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   12  227:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   13  230:areturn         

		case 0: // '\0'
			return "SUCCESS";
	//   14  231:ldc1            #111 <String "SUCCESS">
	//   15  233:areturn         

		case 1: // '\001'
			return "SERVICE_MISSING";
	//   16  234:ldc1            #112 <String "SERVICE_MISSING">
	//   17  236:areturn         

		case 2: // '\002'
			return "SERVICE_VERSION_UPDATE_REQUIRED";
	//   18  237:ldc1            #113 <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//   19  239:areturn         

		case 3: // '\003'
			return "SERVICE_DISABLED";
	//   20  240:ldc1            #114 <String "SERVICE_DISABLED">
	//   21  242:areturn         

		case 4: // '\004'
			return "SIGN_IN_REQUIRED";
	//   22  243:ldc1            #115 <String "SIGN_IN_REQUIRED">
	//   23  245:areturn         

		case 5: // '\005'
			return "INVALID_ACCOUNT";
	//   24  246:ldc1            #116 <String "INVALID_ACCOUNT">
	//   25  248:areturn         

		case 6: // '\006'
			return "RESOLUTION_REQUIRED";
	//   26  249:ldc1            #117 <String "RESOLUTION_REQUIRED">
	//   27  251:areturn         

		case 7: // '\007'
			return "NETWORK_ERROR";
	//   28  252:ldc1            #118 <String "NETWORK_ERROR">
	//   29  254:areturn         

		case 8: // '\b'
			return "INTERNAL_ERROR";
	//   30  255:ldc1            #119 <String "INTERNAL_ERROR">
	//   31  257:areturn         

		case 9: // '\t'
			return "SERVICE_INVALID";
	//   32  258:ldc1            #120 <String "SERVICE_INVALID">
	//   33  260:areturn         

		case 10: // '\n'
			return "DEVELOPER_ERROR";
	//   34  261:ldc1            #121 <String "DEVELOPER_ERROR">
	//   35  263:areturn         

		case 11: // '\013'
			return "LICENSE_CHECK_FAILED";
	//   36  264:ldc1            #122 <String "LICENSE_CHECK_FAILED">
	//   37  266:areturn         

		case 13: // '\r'
			return "CANCELED";
	//   38  267:ldc1            #123 <String "CANCELED">
	//   39  269:areturn         

		case 14: // '\016'
			return "TIMEOUT";
	//   40  270:ldc1            #124 <String "TIMEOUT">
	//   41  272:areturn         

		case 15: // '\017'
			return "INTERRUPTED";
	//   42  273:ldc1            #125 <String "INTERRUPTED">
	//   43  275:areturn         

		case 16: // '\020'
			return "API_UNAVAILABLE";
	//   44  276:ldc1            #126 <String "API_UNAVAILABLE">
	//   45  278:areturn         

		case 17: // '\021'
			return "SIGN_IN_FAILED";
	//   46  279:ldc1            #127 <String "SIGN_IN_FAILED">
	//   47  281:areturn         

		case 18: // '\022'
			return "SERVICE_UPDATING";
	//   48  282:ldc1            #128 <String "SERVICE_UPDATING">
	//   49  284:areturn         

		case 19: // '\023'
			return "SERVICE_MISSING_PERMISSION";
	//   50  285:ldc1            #129 <String "SERVICE_MISSING_PERMISSION">
	//   51  287:areturn         

		case 20: // '\024'
			return "RESTRICTED_PROFILE";
	//   52  288:ldc1            #130 <String "RESTRICTED_PROFILE">
	//   53  290:areturn         

		case 21: // '\025'
			return "API_VERSION_UPDATE_REQUIRED";
	//   54  291:ldc1            #132 <String "API_VERSION_UPDATE_REQUIRED">
	//   55  293:areturn         

		case 1500: 
			return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
	//   56  294:ldc1            #133 <String "DRIVE_EXTERNAL_STORAGE_REQUIRED">
	//   57  296:areturn         

		case 99: // 'c'
			return "UNFINISHED";
	//   58  297:ldc1            #135 <String "UNFINISHED">
	//   59  299:areturn         

		case -1: 
			return "UNKNOWN";
	//   60  300:ldc1            #137 <String "UNKNOWN">
	//   61  302:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof ConnectionResult))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ConnectionResult>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((ConnectionResult)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ConnectionResult>
	//   12   20:astore_1        
			if(zzauz != ((ConnectionResult) (obj)).zzauz || !zzaa.equal(((Object) (mPendingIntent)), ((Object) (((ConnectionResult) (obj)).mPendingIntent))) || !zzaa.equal(((Object) (zzawY)), ((Object) (((ConnectionResult) (obj)).zzawY))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #83  <Field int zzauz>
	//*  15   25:aload_1         
	//*  16   26:getfield        #83  <Field int zzauz>
	//*  17   29:icmpne          60
	//*  18   32:aload_0         
	//*  19   33:getfield        #85  <Field PendingIntent mPendingIntent>
	//*  20   36:aload_1         
	//*  21   37:getfield        #85  <Field PendingIntent mPendingIntent>
	//*  22   40:invokestatic    #145 <Method boolean zzaa.equal(Object, Object)>
	//*  23   43:ifeq            60
	//*  24   46:aload_0         
	//*  25   47:getfield        #87  <Field String zzawY>
	//*  26   50:aload_1         
	//*  27   51:getfield        #87  <Field String zzawY>
	//*  28   54:invokestatic    #145 <Method boolean zzaa.equal(Object, Object)>
	//*  29   57:ifne            5
				return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
		}
		return true;
	}

	public int getErrorCode()
	{
		return zzauz;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzauz>
	//    2    4:ireturn         
	}

	public String getErrorMessage()
	{
		return zzawY;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String zzawY>
	//    2    4:areturn         
	}

	public PendingIntent getResolution()
	{
		return mPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field PendingIntent mPendingIntent>
	//    2    4:areturn         
	}

	public boolean hasResolution()
	{
		return zzauz != 0 && mPendingIntent != null;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzauz>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #85  <Field PendingIntent mPendingIntent>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(zzauz), mPendingIntent, zzawY
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #83  <Field int zzauz>
	//    6   10:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #85  <Field PendingIntent mPendingIntent>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #87  <Field String zzawY>
	//   17   27:aastore         
	//   18   28:invokestatic    #166 <Method int zzaa.hashCode(Object[])>
	//   19   31:ireturn         
	}

	public boolean isSuccess()
	{
		return zzauz == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzauz>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void startResolutionForResult(Activity activity, int i)
		throws android.content.IntentSender.SendIntentException
	{
		if(!hasResolution())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #173 <Method boolean hasResolution()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activity.startIntentSenderForResult(mPendingIntent.getIntentSender(), i, ((android.content.Intent) (null)), 0, 0, 0);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field PendingIntent mPendingIntent>
	//    7   13:invokevirtual   #179 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//    8   16:iload_2         
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #185 <Method void Activity.startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int)>
			return;
	//   14   24:return          
		}
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("statusCode", ((Object) (getStatusString(zzauz)))).zzg("resolution", ((Object) (mPendingIntent))).zzg("message", ((Object) (zzawY))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #192 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:getfield        #83  <Field int zzauz>
	//    5   10:invokestatic    #194 <Method String getStatusString(int)>
	//    6   13:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #202 <String "resolution">
	//    8   18:aload_0         
	//    9   19:getfield        #85  <Field PendingIntent mPendingIntent>
	//   10   22:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:ldc1            #204 <String "message">
	//   12   27:aload_0         
	//   13   28:getfield        #87  <Field String zzawY>
	//   14   31:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   15   34:invokevirtual   #205 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   16   37:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #211 <Method void com.google.android.gms.common.zzb.zza(ConnectionResult, Parcel, int)>
	//    4    6:return          
	}

	public static final int API_UNAVAILABLE = 16;
	public static final int CANCELED = 13;
	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	public static final int DEVELOPER_ERROR = 10;
	public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
	public static final int INTERNAL_ERROR = 8;
	public static final int INTERRUPTED = 15;
	public static final int INVALID_ACCOUNT = 5;
	public static final int LICENSE_CHECK_FAILED = 11;
	public static final int NETWORK_ERROR = 7;
	public static final int RESOLUTION_REQUIRED = 6;
	public static final int RESTRICTED_PROFILE = 20;
	public static final int SERVICE_DISABLED = 3;
	public static final int SERVICE_INVALID = 9;
	public static final int SERVICE_MISSING = 1;
	public static final int SERVICE_MISSING_PERMISSION = 19;
	public static final int SERVICE_UPDATING = 18;
	public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
	public static final int SIGN_IN_FAILED = 17;
	public static final int SIGN_IN_REQUIRED = 4;
	public static final int SUCCESS = 0;
	public static final int TIMEOUT = 14;
	public static final ConnectionResult zzawX = new ConnectionResult(0);
	private final PendingIntent mPendingIntent;
	final int mVersionCode;
	private final int zzauz;
	private final String zzawY;

	static 
	{
	//    0    0:new             #2   <Class ConnectionResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #65  <Method void ConnectionResult(int)>
	//    4    8:putstatic       #67  <Field ConnectionResult zzawX>
	//    5   11:new             #69  <Class zzb>
	//    6   14:dup             
	//    7   15:invokespecial   #71  <Method void zzb()>
	//    8   18:putstatic       #73  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   21:return          
	}
}
