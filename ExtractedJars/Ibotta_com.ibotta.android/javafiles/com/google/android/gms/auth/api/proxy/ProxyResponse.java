// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//			zze

public class ProxyResponse extends AbstractSafeParcelable
{

	ProxyResponse(int i, int j, PendingIntent pendingintent, int k, Bundle bundle, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int versionCode>
		googlePlayServicesStatusCode = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #50  <Field int googlePlayServicesStatusCode>
		statusCode = k;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #52  <Field int statusCode>
		zzdw = bundle;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #54  <Field Bundle zzdw>
		body = abyte0;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #56  <Field byte[] body>
		recoveryAction = pendingintent;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #58  <Field PendingIntent recoveryAction>
	//   20   37:return          
	}

	public ProxyResponse(int i, PendingIntent pendingintent, int j, Bundle bundle, byte abyte0[])
	{
		this(1, i, pendingintent, j, bundle, abyte0);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:iload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:invokespecial   #63  <Method void ProxyResponse(int, int, PendingIntent, int, Bundle, byte[])>
	//    8   12:return          
	}

	private ProxyResponse(int i, Bundle bundle, byte abyte0[])
	{
		this(1, 0, ((PendingIntent) (null)), i, bundle, abyte0);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:iload_1         
	//    5    5:aload_2         
	//    6    6:aload_3         
	//    7    7:invokespecial   #63  <Method void ProxyResponse(int, int, PendingIntent, int, Bundle, byte[])>
	//    8   10:return          
	}

	public ProxyResponse(int i, Map map, byte abyte0[])
	{
		this(i, zzd(map), abyte0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #69  <Method Bundle zzd(Map)>
	//    4    6:aload_3         
	//    5    7:invokespecial   #71  <Method void ProxyResponse(int, Bundle, byte[])>
	//    6   10:return          
	}

	public static ProxyResponse createErrorProxyResponse(int i, PendingIntent pendingintent, int j, Map map, byte abyte0[])
	{
		return new ProxyResponse(1, i, pendingintent, j, zzd(map), abyte0);
	//    0    0:new             #2   <Class ProxyResponse>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:invokestatic    #69  <Method Bundle zzd(Map)>
	//    8   12:aload           4
	//    9   14:invokespecial   #63  <Method void ProxyResponse(int, int, PendingIntent, int, Bundle, byte[])>
	//   10   17:areturn         
	}

	private static Bundle zzd(Map map)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #78  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void Bundle()>
	//    3    7:astore_1        
		if(map == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return bundle;
	//    6   12:aload_1         
	//    7   13:areturn         
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); bundle.putString((String)entry.getKey(), (String)entry.getValue()))
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #85  <Method Set Map.entrySet()>
	//*  10   20:invokeinterface #91  <Method Iterator Set.iterator()>
	//*  11   25:astore_0        
	//*  12   26:aload_0         
	//*  13   27:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            70
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   15   35:aload_0         
	//   16   36:invokeinterface #101 <Method Object Iterator.next()>
	//   17   41:checkcast       #103 <Class java.util.Map$Entry>
	//   18   44:astore_2        

	//   19   45:aload_1         
	//   20   46:aload_2         
	//   21   47:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   22   52:checkcast       #108 <Class String>
	//   23   55:aload_2         
	//   24   56:invokeinterface #111 <Method Object java.util.Map$Entry.getValue()>
	//   25   61:checkcast       #108 <Class String>
	//   26   64:invokevirtual   #115 <Method void Bundle.putString(String, String)>
	//*  27   67:goto            26
		return bundle;
	//   28   70:aload_1         
	//   29   71:areturn         
	}

	public Map getHeaders()
	{
		if(zzdw == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Bundle zzdw>
	//*   2    4:ifnonnull       11
			return Collections.emptyMap();
	//    3    7:invokestatic    #123 <Method Map Collections.emptyMap()>
	//    4   10:areturn         
		HashMap hashmap = new HashMap();
	//    5   11:new             #125 <Class HashMap>
	//    6   14:dup             
	//    7   15:invokespecial   #126 <Method void HashMap()>
	//    8   18:astore_1        
		String s;
		for(Iterator iterator = zzdw.keySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (s)), ((Object) (zzdw.getString(s)))))
	//*   9   19:aload_0         
	//*  10   20:getfield        #54  <Field Bundle zzdw>
	//*  11   23:invokevirtual   #129 <Method Set Bundle.keySet()>
	//*  12   26:invokeinterface #91  <Method Iterator Set.iterator()>
	//*  13   31:astore_2        
	//*  14   32:aload_2         
	//*  15   33:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            70
			s = (String)iterator.next();
	//   17   41:aload_2         
	//   18   42:invokeinterface #101 <Method Object Iterator.next()>
	//   19   47:checkcast       #108 <Class String>
	//   20   50:astore_3        

	//   21   51:aload_1         
	//   22   52:aload_3         
	//   23   53:aload_0         
	//   24   54:getfield        #54  <Field Bundle zzdw>
	//   25   57:aload_3         
	//   26   58:invokevirtual   #133 <Method String Bundle.getString(String)>
	//   27   61:invokeinterface #137 <Method Object Map.put(Object, Object)>
	//   28   66:pop             
	//*  29   67:goto            32
		return ((Map) (hashmap));
	//   30   70:aload_1         
	//   31   71:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #146 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, googlePlayServicesStatusCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field int googlePlayServicesStatusCode>
	//    7   11:invokestatic    #150 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (recoveryAction)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #58  <Field PendingIntent recoveryAction>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #154 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, statusCode);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #52  <Field int statusCode>
	//   19   31:invokestatic    #150 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 4, zzdw, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #54  <Field Bundle zzdw>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #158 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeByteArray(parcel, 5, body, false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:getfield        #56  <Field byte[] body>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #162 <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, versionCode);
	//   32   54:aload_1         
	//   33   55:sipush          1000
	//   34   58:aload_0         
	//   35   59:getfield        #48  <Field int versionCode>
	//   36   62:invokestatic    #150 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   37   65:aload_1         
	//   38   66:iload_3         
	//   39   67:invokestatic    #165 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   40   70:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	public static final int STATUS_CODE_NO_CONNECTION = -1;
	public final byte body[];
	public final int googlePlayServicesStatusCode;
	public final PendingIntent recoveryAction;
	public final int statusCode;
	private final int versionCode;
	private final Bundle zzdw;

	static 
	{
	//    0    0:new             #36  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zze()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
