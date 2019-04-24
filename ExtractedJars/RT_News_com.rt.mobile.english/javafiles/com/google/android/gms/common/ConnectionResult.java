// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common:
//			ConnectionResultCreator

public final class ConnectionResult extends AbstractSafeParcelable
{

	public ConnectionResult(int i)
	{
		this(i, ((PendingIntent) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #93  <Method void ConnectionResult(int, PendingIntent, String)>
	//    5    7:return          
	}

	ConnectionResult(int i, int j, PendingIntent pendingintent, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #99  <Field int zzal>
		zzam = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #101 <Field int zzam>
		zzan = pendingintent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #103 <Field PendingIntent zzan>
		zzao = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #105 <Field String zzao>
	//   14   25:return          
	}

	public ConnectionResult(int i, PendingIntent pendingintent)
	{
		this(i, pendingintent, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #93  <Method void ConnectionResult(int, PendingIntent, String)>
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
	//    5    5:invokespecial   #110 <Method void ConnectionResult(int, int, PendingIntent, String)>
	//    6    8:return          
	}

	static String zza(int i)
	{
		if(i != 99)
	//*   0    0:iload_0         
	//*   1    1:bipush          99
	//*   2    3:icmpeq          236
		{
			if(i != 1500)
	//*   3    6:iload_0         
	//*   4    7:sipush          1500
	//*   5   10:icmpeq          233
				switch(i)
	//*   6   13:iload_0         
				{
	//*   7   14:tableswitch     -1 11: default 80
	//	               -1 230
	//	               0 227
	//	               1 224
	//	               2 221
	//	               3 218
	//	               4 215
	//	               5 212
	//	               6 209
	//	               7 206
	//	               8 203
	//	               9 200
	//	               10 197
	//	               11 194
				default:
					switch(i)
	//*   8   80:iload_0         
					{
	//*   9   81:tableswitch     13 21: default 132
	//	               13 191
	//	               14 188
	//	               15 185
	//	               16 182
	//	               17 179
	//	               18 176
	//	               19 173
	//	               20 170
	//	               21 167
					default:
						StringBuilder stringbuilder = new StringBuilder(31);
	//   10  132:new             #114 <Class StringBuilder>
	//   11  135:dup             
	//   12  136:bipush          31
	//   13  138:invokespecial   #115 <Method void StringBuilder(int)>
	//   14  141:astore_1        
						stringbuilder.append("UNKNOWN_ERROR_CODE(");
	//   15  142:aload_1         
	//   16  143:ldc1            #117 <String "UNKNOWN_ERROR_CODE(">
	//   17  145:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   18  148:pop             
						stringbuilder.append(i);
	//   19  149:aload_1         
	//   20  150:iload_0         
	//   21  151:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   22  154:pop             
						stringbuilder.append(")");
	//   23  155:aload_1         
	//   24  156:ldc1            #126 <String ")">
	//   25  158:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   26  161:pop             
						return stringbuilder.toString();
	//   27  162:aload_1         
	//   28  163:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   29  166:areturn         

					case 21: // '\025'
						return "API_VERSION_UPDATE_REQUIRED";
	//   30  167:ldc1            #131 <String "API_VERSION_UPDATE_REQUIRED">
	//   31  169:areturn         

					case 20: // '\024'
						return "RESTRICTED_PROFILE";
	//   32  170:ldc1            #132 <String "RESTRICTED_PROFILE">
	//   33  172:areturn         

					case 19: // '\023'
						return "SERVICE_MISSING_PERMISSION";
	//   34  173:ldc1            #133 <String "SERVICE_MISSING_PERMISSION">
	//   35  175:areturn         

					case 18: // '\022'
						return "SERVICE_UPDATING";
	//   36  176:ldc1            #134 <String "SERVICE_UPDATING">
	//   37  178:areturn         

					case 17: // '\021'
						return "SIGN_IN_FAILED";
	//   38  179:ldc1            #135 <String "SIGN_IN_FAILED">
	//   39  181:areturn         

					case 16: // '\020'
						return "API_UNAVAILABLE";
	//   40  182:ldc1            #136 <String "API_UNAVAILABLE">
	//   41  184:areturn         

					case 15: // '\017'
						return "INTERRUPTED";
	//   42  185:ldc1            #137 <String "INTERRUPTED">
	//   43  187:areturn         

					case 14: // '\016'
						return "TIMEOUT";
	//   44  188:ldc1            #138 <String "TIMEOUT">
	//   45  190:areturn         

					case 13: // '\r'
						return "CANCELED";
	//   46  191:ldc1            #139 <String "CANCELED">
	//   47  193:areturn         
					}

				case 11: // '\013'
					return "LICENSE_CHECK_FAILED";
	//   48  194:ldc1            #140 <String "LICENSE_CHECK_FAILED">
	//   49  196:areturn         

				case 10: // '\n'
					return "DEVELOPER_ERROR";
	//   50  197:ldc1            #141 <String "DEVELOPER_ERROR">
	//   51  199:areturn         

				case 9: // '\t'
					return "SERVICE_INVALID";
	//   52  200:ldc1            #142 <String "SERVICE_INVALID">
	//   53  202:areturn         

				case 8: // '\b'
					return "INTERNAL_ERROR";
	//   54  203:ldc1            #143 <String "INTERNAL_ERROR">
	//   55  205:areturn         

				case 7: // '\007'
					return "NETWORK_ERROR";
	//   56  206:ldc1            #144 <String "NETWORK_ERROR">
	//   57  208:areturn         

				case 6: // '\006'
					return "RESOLUTION_REQUIRED";
	//   58  209:ldc1            #145 <String "RESOLUTION_REQUIRED">
	//   59  211:areturn         

				case 5: // '\005'
					return "INVALID_ACCOUNT";
	//   60  212:ldc1            #146 <String "INVALID_ACCOUNT">
	//   61  214:areturn         

				case 4: // '\004'
					return "SIGN_IN_REQUIRED";
	//   62  215:ldc1            #147 <String "SIGN_IN_REQUIRED">
	//   63  217:areturn         

				case 3: // '\003'
					return "SERVICE_DISABLED";
	//   64  218:ldc1            #148 <String "SERVICE_DISABLED">
	//   65  220:areturn         

				case 2: // '\002'
					return "SERVICE_VERSION_UPDATE_REQUIRED";
	//   66  221:ldc1            #149 <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//   67  223:areturn         

				case 1: // '\001'
					return "SERVICE_MISSING";
	//   68  224:ldc1            #150 <String "SERVICE_MISSING">
	//   69  226:areturn         

				case 0: // '\0'
					return "SUCCESS";
	//   70  227:ldc1            #151 <String "SUCCESS">
	//   71  229:areturn         

				case -1: 
					return "UNKNOWN";
	//   72  230:ldc1            #152 <String "UNKNOWN">
	//   73  232:areturn         
				}
			else
				return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
	//   74  233:ldc1            #153 <String "DRIVE_EXTERNAL_STORAGE_REQUIRED">
	//   75  235:areturn         
		} else
		{
			return "UNFINISHED";
	//   76  236:ldc1            #154 <String "UNFINISHED">
	//   77  238:areturn         
		}
	}

	public final boolean equals(Object obj)
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
		return zzam == ((ConnectionResult) (obj)).zzam && Objects.equal(((Object) (zzan)), ((Object) (((ConnectionResult) (obj)).zzan))) && Objects.equal(((Object) (zzao)), ((Object) (((ConnectionResult) (obj)).zzao)));
	//   13   21:aload_0         
	//   14   22:getfield        #101 <Field int zzam>
	//   15   25:aload_1         
	//   16   26:getfield        #101 <Field int zzam>
	//   17   29:icmpne          62
	//   18   32:aload_0         
	//   19   33:getfield        #103 <Field PendingIntent zzan>
	//   20   36:aload_1         
	//   21   37:getfield        #103 <Field PendingIntent zzan>
	//   22   40:invokestatic    #162 <Method boolean Objects.equal(Object, Object)>
	//   23   43:ifeq            62
	//   24   46:aload_0         
	//   25   47:getfield        #105 <Field String zzao>
	//   26   50:aload_1         
	//   27   51:getfield        #105 <Field String zzao>
	//   28   54:invokestatic    #162 <Method boolean Objects.equal(Object, Object)>
	//   29   57:ifeq            62
	//   30   60:iconst_1        
	//   31   61:ireturn         
	//   32   62:iconst_0        
	//   33   63:ireturn         
	}

	public final int getErrorCode()
	{
		return zzam;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int zzam>
	//    2    4:ireturn         
	}

	public final String getErrorMessage()
	{
		return zzao;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String zzao>
	//    2    4:areturn         
	}

	public final PendingIntent getResolution()
	{
		return zzan;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field PendingIntent zzan>
	//    2    4:areturn         
	}

	public final boolean hasResolution()
	{
		return zzam != 0 && zzan != null;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int zzam>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field PendingIntent zzan>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzam), zzan, zzao
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #101 <Field int zzam>
	//    6   10:invokestatic    #176 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #103 <Field PendingIntent zzan>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #105 <Field String zzao>
	//   17   27:aastore         
	//   18   28:invokestatic    #179 <Method int Objects.hashCode(Object[])>
	//   19   31:ireturn         
	}

	public final boolean isSuccess()
	{
		return zzam == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int zzam>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final void startResolutionForResult(Activity activity, int i)
		throws android.content.IntentSender.SendIntentException
	{
		if(!hasResolution())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #186 <Method boolean hasResolution()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activity.startIntentSenderForResult(zzan.getIntentSender(), i, ((android.content.Intent) (null)), 0, 0, 0);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #103 <Field PendingIntent zzan>
	//    7   13:invokevirtual   #192 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//    8   16:iload_2         
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #198 <Method void Activity.startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int)>
			return;
	//   14   24:return          
		}
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("statusCode", ((Object) (zza(zzam)))).add("resolution", ((Object) (zzan))).add("message", ((Object) (zzao))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #203 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #205 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:getfield        #101 <Field int zzam>
	//    5   10:invokestatic    #207 <Method String zza(int)>
	//    6   13:invokevirtual   #213 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    7   16:ldc1            #215 <String "resolution">
	//    8   18:aload_0         
	//    9   19:getfield        #103 <Field PendingIntent zzan>
	//   10   22:invokevirtual   #213 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   25:ldc1            #217 <String "message">
	//   12   27:aload_0         
	//   13   28:getfield        #105 <Field String zzao>
	//   14   31:invokevirtual   #213 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   15   34:invokevirtual   #218 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   16   37:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #226 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #99  <Field int zzal>
	//    7   11:invokestatic    #230 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, getErrorCode());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #232 <Method int getErrorCode()>
	//   12   20:invokestatic    #230 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getResolution())), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #234 <Method PendingIntent getResolution()>
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokestatic    #238 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 4, getErrorMessage(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #240 <Method String getErrorMessage()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #244 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   26   44:aload_1         
	//   27   45:iload_3         
	//   28   46:invokestatic    #247 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   29   49:return          
	}

	public static final int API_UNAVAILABLE = 16;
	public static final int API_VERSION_UPDATE_REQUIRED = 21;
	public static final int CANCELED = 13;
	public static final android.os.Parcelable.Creator CREATOR = new ConnectionResultCreator();
	public static final int DEVELOPER_ERROR = 10;
	public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
	public static final int INTERNAL_ERROR = 8;
	public static final int INTERRUPTED = 15;
	public static final int INVALID_ACCOUNT = 5;
	public static final int LICENSE_CHECK_FAILED = 11;
	public static final int NETWORK_ERROR = 7;
	public static final int RESOLUTION_REQUIRED = 6;
	public static final int RESTRICTED_PROFILE = 20;
	public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);
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
	public static final int UNFINISHED = 99;
	public static final int UNKNOWN = -1;
	private final int zzal;
	private final int zzam;
	private final PendingIntent zzan;
	private final String zzao;

	static 
	{
	//    0    0:new             #2   <Class ConnectionResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #81  <Method void ConnectionResult(int)>
	//    4    8:putstatic       #83  <Field ConnectionResult RESULT_SUCCESS>
	//    5   11:new             #85  <Class ConnectionResultCreator>
	//    6   14:dup             
	//    7   15:invokespecial   #87  <Method void ConnectionResultCreator()>
	//    8   18:putstatic       #89  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   21:return          
	}
}
