// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common:
//			n

public final class ConnectionResult extends AbstractSafeParcelable
{

	public ConnectionResult(int i)
	{
		this(i, ((PendingIntent) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #33  <Method void ConnectionResult(int, PendingIntent, String)>
	//    5    7:return          
	}

	ConnectionResult(int i, int j, PendingIntent pendingintent, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		b = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int b>
		c = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field int c>
		d = pendingintent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field PendingIntent d>
		e = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #43  <Field String e>
	//   14   25:return          
	}

	public ConnectionResult(int i, PendingIntent pendingintent)
	{
		this(i, pendingintent, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #33  <Method void ConnectionResult(int, PendingIntent, String)>
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
	//    5    5:invokespecial   #46  <Method void ConnectionResult(int, int, PendingIntent, String)>
	//    6    8:return          
	}

	static String a(int i)
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
	//   10  132:new             #49  <Class StringBuilder>
	//   11  135:dup             
	//   12  136:bipush          31
	//   13  138:invokespecial   #50  <Method void StringBuilder(int)>
	//   14  141:astore_1        
						stringbuilder.append("UNKNOWN_ERROR_CODE(");
	//   15  142:aload_1         
	//   16  143:ldc1            #52  <String "UNKNOWN_ERROR_CODE(">
	//   17  145:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   18  148:pop             
						stringbuilder.append(i);
	//   19  149:aload_1         
	//   20  150:iload_0         
	//   21  151:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   22  154:pop             
						stringbuilder.append(")");
	//   23  155:aload_1         
	//   24  156:ldc1            #61  <String ")">
	//   25  158:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   26  161:pop             
						return stringbuilder.toString();
	//   27  162:aload_1         
	//   28  163:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   29  166:areturn         

					case 21: // '\025'
						return "API_VERSION_UPDATE_REQUIRED";
	//   30  167:ldc1            #67  <String "API_VERSION_UPDATE_REQUIRED">
	//   31  169:areturn         

					case 20: // '\024'
						return "RESTRICTED_PROFILE";
	//   32  170:ldc1            #69  <String "RESTRICTED_PROFILE">
	//   33  172:areturn         

					case 19: // '\023'
						return "SERVICE_MISSING_PERMISSION";
	//   34  173:ldc1            #71  <String "SERVICE_MISSING_PERMISSION">
	//   35  175:areturn         

					case 18: // '\022'
						return "SERVICE_UPDATING";
	//   36  176:ldc1            #73  <String "SERVICE_UPDATING">
	//   37  178:areturn         

					case 17: // '\021'
						return "SIGN_IN_FAILED";
	//   38  179:ldc1            #75  <String "SIGN_IN_FAILED">
	//   39  181:areturn         

					case 16: // '\020'
						return "API_UNAVAILABLE";
	//   40  182:ldc1            #77  <String "API_UNAVAILABLE">
	//   41  184:areturn         

					case 15: // '\017'
						return "INTERRUPTED";
	//   42  185:ldc1            #79  <String "INTERRUPTED">
	//   43  187:areturn         

					case 14: // '\016'
						return "TIMEOUT";
	//   44  188:ldc1            #81  <String "TIMEOUT">
	//   45  190:areturn         

					case 13: // '\r'
						return "CANCELED";
	//   46  191:ldc1            #83  <String "CANCELED">
	//   47  193:areturn         
					}

				case 11: // '\013'
					return "LICENSE_CHECK_FAILED";
	//   48  194:ldc1            #85  <String "LICENSE_CHECK_FAILED">
	//   49  196:areturn         

				case 10: // '\n'
					return "DEVELOPER_ERROR";
	//   50  197:ldc1            #87  <String "DEVELOPER_ERROR">
	//   51  199:areturn         

				case 9: // '\t'
					return "SERVICE_INVALID";
	//   52  200:ldc1            #89  <String "SERVICE_INVALID">
	//   53  202:areturn         

				case 8: // '\b'
					return "INTERNAL_ERROR";
	//   54  203:ldc1            #91  <String "INTERNAL_ERROR">
	//   55  205:areturn         

				case 7: // '\007'
					return "NETWORK_ERROR";
	//   56  206:ldc1            #93  <String "NETWORK_ERROR">
	//   57  208:areturn         

				case 6: // '\006'
					return "RESOLUTION_REQUIRED";
	//   58  209:ldc1            #95  <String "RESOLUTION_REQUIRED">
	//   59  211:areturn         

				case 5: // '\005'
					return "INVALID_ACCOUNT";
	//   60  212:ldc1            #97  <String "INVALID_ACCOUNT">
	//   61  214:areturn         

				case 4: // '\004'
					return "SIGN_IN_REQUIRED";
	//   62  215:ldc1            #99  <String "SIGN_IN_REQUIRED">
	//   63  217:areturn         

				case 3: // '\003'
					return "SERVICE_DISABLED";
	//   64  218:ldc1            #101 <String "SERVICE_DISABLED">
	//   65  220:areturn         

				case 2: // '\002'
					return "SERVICE_VERSION_UPDATE_REQUIRED";
	//   66  221:ldc1            #103 <String "SERVICE_VERSION_UPDATE_REQUIRED">
	//   67  223:areturn         

				case 1: // '\001'
					return "SERVICE_MISSING";
	//   68  224:ldc1            #105 <String "SERVICE_MISSING">
	//   69  226:areturn         

				case 0: // '\0'
					return "SUCCESS";
	//   70  227:ldc1            #107 <String "SUCCESS">
	//   71  229:areturn         

				case -1: 
					return "UNKNOWN";
	//   72  230:ldc1            #109 <String "UNKNOWN">
	//   73  232:areturn         
				}
			else
				return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
	//   74  233:ldc1            #111 <String "DRIVE_EXTERNAL_STORAGE_REQUIRED">
	//   75  235:areturn         
		} else
		{
			return "UNFINISHED";
	//   76  236:ldc1            #113 <String "UNFINISHED">
	//   77  238:areturn         
		}
	}

	public final boolean a()
	{
		return c != 0 && d != null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int c>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field PendingIntent d>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final boolean b()
	{
		return c == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int c>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int c>
	//    2    4:ireturn         
	}

	public final PendingIntent d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field PendingIntent d>
	//    2    4:areturn         
	}

	public final String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String e>
	//    2    4:areturn         
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
		return c == ((ConnectionResult) (obj)).c && ak.a(((Object) (d)), ((Object) (((ConnectionResult) (obj)).d))) && ak.a(((Object) (e)), ((Object) (((ConnectionResult) (obj)).e)));
	//   13   21:aload_0         
	//   14   22:getfield        #39  <Field int c>
	//   15   25:aload_1         
	//   16   26:getfield        #39  <Field int c>
	//   17   29:icmpne          62
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field PendingIntent d>
	//   20   36:aload_1         
	//   21   37:getfield        #41  <Field PendingIntent d>
	//   22   40:invokestatic    #123 <Method boolean ak.a(Object, Object)>
	//   23   43:ifeq            62
	//   24   46:aload_0         
	//   25   47:getfield        #43  <Field String e>
	//   26   50:aload_1         
	//   27   51:getfield        #43  <Field String e>
	//   28   54:invokestatic    #123 <Method boolean ak.a(Object, Object)>
	//   29   57:ifeq            62
	//   30   60:iconst_1        
	//   31   61:ireturn         
	//   32   62:iconst_0        
	//   33   63:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Integer.valueOf(c), d, e
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #39  <Field int c>
	//    6   10:invokestatic    #132 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field PendingIntent d>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #43  <Field String e>
	//   17   27:aastore         
	//   18   28:invokestatic    #135 <Method int ak.a(Object[])>
	//   19   31:ireturn         
	}

	public final String toString()
	{
		return ak.a(((Object) (this))).a("statusCode", ((Object) (a(c)))).a("resolution", ((Object) (d))).a("message", ((Object) (e))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #138 <Method al ak.a(Object)>
	//    2    4:ldc1            #140 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field int c>
	//    5   10:invokestatic    #142 <Method String a(int)>
	//    6   13:invokevirtual   #147 <Method al al.a(String, Object)>
	//    7   16:ldc1            #149 <String "resolution">
	//    8   18:aload_0         
	//    9   19:getfield        #41  <Field PendingIntent d>
	//   10   22:invokevirtual   #147 <Method al al.a(String, Object)>
	//   11   25:ldc1            #151 <String "message">
	//   12   27:aload_0         
	//   13   28:getfield        #43  <Field String e>
	//   14   31:invokevirtual   #147 <Method al al.a(String, Object)>
	//   15   34:invokevirtual   #152 <Method String al.toString()>
	//   16   37:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #159 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int b>
	//    7   11:invokestatic    #162 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, c());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #164 <Method int c()>
	//   12   20:invokestatic    #162 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (d())), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #166 <Method PendingIntent d()>
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokestatic    #169 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #171 <Method String e()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #174 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   26   44:aload_1         
	//   27   45:iload_3         
	//   28   46:invokestatic    #176 <Method void c.a(Parcel, int)>
	//   29   49:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new n();
	public static final ConnectionResult a = new ConnectionResult(0);
	private final int b;
	private final int c;
	private final PendingIntent d;
	private final String e;

	static 
	{
	//    0    0:new             #2   <Class ConnectionResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #21  <Method void ConnectionResult(int)>
	//    4    8:putstatic       #23  <Field ConnectionResult a>
	//    5   11:new             #25  <Class n>
	//    6   14:dup             
	//    7   15:invokespecial   #27  <Method void n()>
	//    8   18:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   21:return          
	}
}
