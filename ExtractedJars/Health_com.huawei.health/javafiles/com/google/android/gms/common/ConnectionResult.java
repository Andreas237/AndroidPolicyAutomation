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
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #81  <Field int zzaiI>
		zzavD = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #83  <Field int zzavD>
		mPendingIntent = pendingintent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #85  <Field PendingIntent mPendingIntent>
		zzayk = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #87  <Field String zzayk>
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
	//	               -1: 276
	//	               0: 207
	//	               1: 210
	//	               2: 213
	//	               3: 216
	//	               4: 219
	//	               5: 222
	//	               6: 225
	//	               7: 228
	//	               8: 231
	//	               9: 234
	//	               10: 237
	//	               11: 240
	//	               13: 243
	//	               14: 246
	//	               15: 249
	//	               16: 252
	//	               17: 255
	//	               18: 258
	//	               19: 261
	//	               20: 264
	//	               21: 267
	//	               99: 273
	//	               1500: 270
	//*   2  204:goto            279
		case 0: // '\0'
			return "SUCCESS";
	//    3  207:ldc1            #93  <String "SUCCESS">
	//    4  209:areturn         

		case 1: // '\001'
			return "SERVICE_MISSING";
	//    5  210:ldc1            #94  <String "SERVICE_MISSING">
	//    6  212:areturn         

		case 2: // '\002'
			return "SERVICE_VERSION_UPDATE_REQUIRED";
	//    7  213:ldc1            #95  <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//    8  215:areturn         

		case 3: // '\003'
			return "SERVICE_DISABLED";
	//    9  216:ldc1            #96  <String "SERVICE_DISABLED">
	//   10  218:areturn         

		case 4: // '\004'
			return "SIGN_IN_REQUIRED";
	//   11  219:ldc1            #97  <String "SIGN_IN_REQUIRED">
	//   12  221:areturn         

		case 5: // '\005'
			return "INVALID_ACCOUNT";
	//   13  222:ldc1            #98  <String "INVALID_ACCOUNT">
	//   14  224:areturn         

		case 6: // '\006'
			return "RESOLUTION_REQUIRED";
	//   15  225:ldc1            #99  <String "RESOLUTION_REQUIRED">
	//   16  227:areturn         

		case 7: // '\007'
			return "NETWORK_ERROR";
	//   17  228:ldc1            #100 <String "NETWORK_ERROR">
	//   18  230:areturn         

		case 8: // '\b'
			return "INTERNAL_ERROR";
	//   19  231:ldc1            #101 <String "INTERNAL_ERROR">
	//   20  233:areturn         

		case 9: // '\t'
			return "SERVICE_INVALID";
	//   21  234:ldc1            #102 <String "SERVICE_INVALID">
	//   22  236:areturn         

		case 10: // '\n'
			return "DEVELOPER_ERROR";
	//   23  237:ldc1            #103 <String "DEVELOPER_ERROR">
	//   24  239:areturn         

		case 11: // '\013'
			return "LICENSE_CHECK_FAILED";
	//   25  240:ldc1            #104 <String "LICENSE_CHECK_FAILED">
	//   26  242:areturn         

		case 13: // '\r'
			return "CANCELED";
	//   27  243:ldc1            #105 <String "CANCELED">
	//   28  245:areturn         

		case 14: // '\016'
			return "TIMEOUT";
	//   29  246:ldc1            #106 <String "TIMEOUT">
	//   30  248:areturn         

		case 15: // '\017'
			return "INTERRUPTED";
	//   31  249:ldc1            #107 <String "INTERRUPTED">
	//   32  251:areturn         

		case 16: // '\020'
			return "API_UNAVAILABLE";
	//   33  252:ldc1            #108 <String "API_UNAVAILABLE">
	//   34  254:areturn         

		case 17: // '\021'
			return "SIGN_IN_FAILED";
	//   35  255:ldc1            #109 <String "SIGN_IN_FAILED">
	//   36  257:areturn         

		case 18: // '\022'
			return "SERVICE_UPDATING";
	//   37  258:ldc1            #110 <String "SERVICE_UPDATING">
	//   38  260:areturn         

		case 19: // '\023'
			return "SERVICE_MISSING_PERMISSION";
	//   39  261:ldc1            #111 <String "SERVICE_MISSING_PERMISSION">
	//   40  263:areturn         

		case 20: // '\024'
			return "RESTRICTED_PROFILE";
	//   41  264:ldc1            #112 <String "RESTRICTED_PROFILE">
	//   42  266:areturn         

		case 21: // '\025'
			return "API_VERSION_UPDATE_REQUIRED";
	//   43  267:ldc1            #114 <String "API_VERSION_UPDATE_REQUIRED">
	//   44  269:areturn         

		case 1500: 
			return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
	//   45  270:ldc1            #115 <String "DRIVE_EXTERNAL_STORAGE_REQUIRED">
	//   46  272:areturn         

		case 99: // 'c'
			return "UNFINISHED";
	//   47  273:ldc1            #117 <String "UNFINISHED">
	//   48  275:areturn         

		case -1: 
			return "UNKNOWN";
	//   49  276:ldc1            #119 <String "UNKNOWN">
	//   50  278:areturn         
		}
		return (new StringBuilder(31)).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
	//   51  279:new             #121 <Class StringBuilder>
	//   52  282:dup             
	//   53  283:bipush          31
	//   54  285:invokespecial   #122 <Method void StringBuilder(int)>
	//   55  288:ldc1            #124 <String "UNKNOWN_ERROR_CODE(">
	//   56  290:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   57  293:iload_0         
	//   58  294:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   59  297:ldc1            #133 <String ")">
	//   60  299:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   61  302:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   62  305:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
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
		return zzavD == ((ConnectionResult) (obj)).zzavD && zzaa.equal(((Object) (mPendingIntent)), ((Object) (((ConnectionResult) (obj)).mPendingIntent))) && zzaa.equal(((Object) (zzayk)), ((Object) (((ConnectionResult) (obj)).zzayk)));
	//   13   21:aload_0         
	//   14   22:getfield        #83  <Field int zzavD>
	//   15   25:aload_1         
	//   16   26:getfield        #83  <Field int zzavD>
	//   17   29:icmpne          62
	//   18   32:aload_0         
	//   19   33:getfield        #85  <Field PendingIntent mPendingIntent>
	//   20   36:aload_1         
	//   21   37:getfield        #85  <Field PendingIntent mPendingIntent>
	//   22   40:invokestatic    #145 <Method boolean zzaa.equal(Object, Object)>
	//   23   43:ifeq            62
	//   24   46:aload_0         
	//   25   47:getfield        #87  <Field String zzayk>
	//   26   50:aload_1         
	//   27   51:getfield        #87  <Field String zzayk>
	//   28   54:invokestatic    #145 <Method boolean zzaa.equal(Object, Object)>
	//   29   57:ifeq            62
	//   30   60:iconst_1        
	//   31   61:ireturn         
	//   32   62:iconst_0        
	//   33   63:ireturn         
	}

	public int getErrorCode()
	{
		return zzavD;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzavD>
	//    2    4:ireturn         
	}

	public String getErrorMessage()
	{
		return zzayk;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String zzayk>
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
		return zzavD != 0 && mPendingIntent != null;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzavD>
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
			Integer.valueOf(zzavD), mPendingIntent, zzayk
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #83  <Field int zzavD>
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
	//   16   24:getfield        #87  <Field String zzayk>
	//   17   27:aastore         
	//   18   28:invokestatic    #166 <Method int zzaa.hashCode(Object[])>
	//   19   31:ireturn         
	}

	public boolean isSuccess()
	{
		return zzavD == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzavD>
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
		return zzaa.zzv(((Object) (this))).zzg("statusCode", ((Object) (getStatusString(zzavD)))).zzg("resolution", ((Object) (mPendingIntent))).zzg("message", ((Object) (zzayk))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #192 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:getfield        #83  <Field int zzavD>
	//    5   10:invokestatic    #194 <Method String getStatusString(int)>
	//    6   13:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #202 <String "resolution">
	//    8   18:aload_0         
	//    9   19:getfield        #85  <Field PendingIntent mPendingIntent>
	//   10   22:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:ldc1            #204 <String "message">
	//   12   27:aload_0         
	//   13   28:getfield        #87  <Field String zzayk>
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
	public static final ConnectionResult zzayj = new ConnectionResult(0);
	private final PendingIntent mPendingIntent;
	final int zzaiI;
	private final int zzavD;
	private final String zzayk;

	static 
	{
	//    0    0:new             #2   <Class ConnectionResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #65  <Method void ConnectionResult(int)>
	//    4    8:putstatic       #67  <Field ConnectionResult zzayj>
	//    5   11:new             #69  <Class zzb>
	//    6   14:dup             
	//    7   15:invokespecial   #71  <Method void zzb()>
	//    8   18:putstatic       #73  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   21:return          
	}
}
