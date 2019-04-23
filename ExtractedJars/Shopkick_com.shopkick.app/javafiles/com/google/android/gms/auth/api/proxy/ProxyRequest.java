// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Patterns;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//			zza

public class ProxyRequest extends AbstractSafeParcelable
{
	public static class Builder
	{

		public ProxyRequest build()
		{
			if(zzcc == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field byte[] zzcc>
		//*   2    4:ifnonnull       14
				zzcc = new byte[0];
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:newarray        byte[]
		//    6   11:putfield        #34  <Field byte[] zzcc>
			return new ProxyRequest(2, zzbz, zzca, zzcb, zzcc, zzcd);
		//    7   14:new             #6   <Class ProxyRequest>
		//    8   17:dup             
		//    9   18:iconst_2        
		//   10   19:aload_0         
		//   11   20:getfield        #65  <Field String zzbz>
		//   12   23:aload_0         
		//   13   24:getfield        #28  <Field int zzca>
		//   14   27:aload_0         
		//   15   28:getfield        #32  <Field long zzcb>
		//   16   31:aload_0         
		//   17   32:getfield        #34  <Field byte[] zzcc>
		//   18   35:aload_0         
		//   19   36:getfield        #39  <Field Bundle zzcd>
		//   20   39:invokespecial   #102 <Method void ProxyRequest(int, String, int, long, byte[], Bundle)>
		//   21   42:areturn         
		}

		public Builder putHeader(String s, String s1)
		{
			Preconditions.checkNotEmpty(s, "Header name cannot be null or empty!");
		//    0    0:aload_1         
		//    1    1:ldc1            #106 <String "Header name cannot be null or empty!">
		//    2    3:invokestatic    #109 <Method String Preconditions.checkNotEmpty(String, Object)>
		//    3    6:pop             
			Bundle bundle = zzcd;
		//    4    7:aload_0         
		//    5    8:getfield        #39  <Field Bundle zzcd>
		//    6   11:astore          4
			String s2 = s1;
		//    7   13:aload_2         
		//    8   14:astore_3        
			if(s1 == null)
		//*   9   15:aload_2         
		//*  10   16:ifnonnull       22
				s2 = "";
		//   11   19:ldc1            #111 <String "">
		//   12   21:astore_3        
			bundle.putString(s, s2);
		//   13   22:aload           4
		//   14   24:aload_1         
		//   15   25:aload_3         
		//   16   26:invokevirtual   #115 <Method void Bundle.putString(String, String)>
			return this;
		//   17   29:aload_0         
		//   18   30:areturn         
		}

		public Builder setBody(byte abyte0[])
		{
			zzcc = abyte0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field byte[] zzcc>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setHttpMethod(int i)
		{
			boolean flag;
			if(i >= 0 && i <= ProxyRequest.LAST_CODE)
		//*   0    0:iload_1         
		//*   1    1:iflt            16
		//*   2    4:iload_1         
		//*   3    5:getstatic       #122 <Field int ProxyRequest.LAST_CODE>
		//*   4    8:icmpgt          16
				flag = true;
		//    5   11:iconst_1        
		//    6   12:istore_2        
			else
		//*   7   13:goto            18
				flag = false;
		//    8   16:iconst_0        
		//    9   17:istore_2        
			Preconditions.checkArgument(flag, "Unrecognized http method code.");
		//   10   18:iload_2         
		//   11   19:ldc1            #124 <String "Unrecognized http method code.">
		//   12   21:invokestatic    #128 <Method void Preconditions.checkArgument(boolean, Object)>
			zzca = i;
		//   13   24:aload_0         
		//   14   25:iload_1         
		//   15   26:putfield        #28  <Field int zzca>
			return this;
		//   16   29:aload_0         
		//   17   30:areturn         
		}

		public Builder setTimeoutMillis(long l)
		{
			boolean flag;
			if(l >= 0L)
		//*   0    0:lload_1         
		//*   1    1:lconst_0        
		//*   2    2:lcmp            
		//*   3    3:iflt            11
				flag = true;
		//    4    6:iconst_1        
		//    5    7:istore_3        
			else
		//*   6    8:goto            13
				flag = false;
		//    7   11:iconst_0        
		//    8   12:istore_3        
			Preconditions.checkArgument(flag, "The specified timeout must be non-negative.");
		//    9   13:iload_3         
		//   10   14:ldc1            #132 <String "The specified timeout must be non-negative.">
		//   11   16:invokestatic    #128 <Method void Preconditions.checkArgument(boolean, Object)>
			zzcb = l;
		//   12   19:aload_0         
		//   13   20:lload_1         
		//   14   21:putfield        #32  <Field long zzcb>
			return this;
		//   15   24:aload_0         
		//   16   25:areturn         
		}

		private String zzbz;
		private int zzca;
		private long zzcb;
		private byte zzcc[];
		private Bundle zzcd;

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			zzca = ProxyRequest.HTTP_METHOD_GET;
		//    2    4:aload_0         
		//    3    5:getstatic       #26  <Field int ProxyRequest.HTTP_METHOD_GET>
		//    4    8:putfield        #28  <Field int zzca>
			zzcb = 3000L;
		//    5   11:aload_0         
		//    6   12:ldc2w           #29  <Long 3000L>
		//    7   15:putfield        #32  <Field long zzcb>
			zzcc = null;
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:putfield        #34  <Field byte[] zzcc>
			zzcd = new Bundle();
		//   11   23:aload_0         
		//   12   24:new             #36  <Class Bundle>
		//   13   27:dup             
		//   14   28:invokespecial   #37  <Method void Bundle()>
		//   15   31:putfield        #39  <Field Bundle zzcd>
			Preconditions.checkNotEmpty(s);
		//   16   34:aload_1         
		//   17   35:invokestatic    #45  <Method String Preconditions.checkNotEmpty(String)>
		//   18   38:pop             
			if(Patterns.WEB_URL.matcher(((CharSequence) (s))).matches())
		//*  19   39:getstatic       #51  <Field Pattern Patterns.WEB_URL>
		//*  20   42:aload_1         
		//*  21   43:invokevirtual   #57  <Method Matcher Pattern.matcher(CharSequence)>
		//*  22   46:invokevirtual   #63  <Method boolean Matcher.matches()>
		//*  23   49:ifeq            58
			{
				zzbz = s;
		//   24   52:aload_0         
		//   25   53:aload_1         
		//   26   54:putfield        #65  <Field String zzbz>
				return;
		//   27   57:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51);
		//   28   58:new             #67  <Class StringBuilder>
		//   29   61:dup             
		//   30   62:aload_1         
		//   31   63:invokestatic    #73  <Method String String.valueOf(Object)>
		//   32   66:invokevirtual   #77  <Method int String.length()>
		//   33   69:bipush          51
		//   34   71:iadd            
		//   35   72:invokespecial   #80  <Method void StringBuilder(int)>
		//   36   75:astore_2        
				stringbuilder.append("The supplied url [ ");
		//   37   76:aload_2         
		//   38   77:ldc1            #82  <String "The supplied url [ ">
		//   39   79:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
		//   40   82:pop             
				stringbuilder.append(s);
		//   41   83:aload_2         
		//   42   84:aload_1         
		//   43   85:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
		//   44   88:pop             
				stringbuilder.append("] is not match Patterns.WEB_URL!");
		//   45   89:aload_2         
		//   46   90:ldc1            #88  <String "] is not match Patterns.WEB_URL!">
		//   47   92:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
		//   48   95:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   49   96:new             #90  <Class IllegalArgumentException>
		//   50   99:dup             
		//   51  100:aload_2         
		//   52  101:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   53  104:invokespecial   #96  <Method void IllegalArgumentException(String)>
		//   54  107:athrow          
			}
		}
	}


	ProxyRequest(int i, String s, int j, long l, byte abyte0[], Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #78  <Field int versionCode>
		url = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #80  <Field String url>
		httpMethod = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #82  <Field int httpMethod>
		timeoutMillis = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #84  <Field long timeoutMillis>
		body = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #86  <Field byte[] body>
		zzby = bundle;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #88  <Field Bundle zzby>
	//   20   37:return          
	}

	public Map getHeaderMap()
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap(zzby.size());
	//    0    0:new             #94  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field Bundle zzby>
	//    4    8:invokevirtual   #100 <Method int Bundle.size()>
	//    5   11:invokespecial   #103 <Method void LinkedHashMap(int)>
	//    6   14:astore_1        
		String s;
		for(Iterator iterator = zzby.keySet().iterator(); iterator.hasNext(); ((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (zzby.getString(s)))))
	//*   7   15:aload_0         
	//*   8   16:getfield        #88  <Field Bundle zzby>
	//*   9   19:invokevirtual   #107 <Method Set Bundle.keySet()>
	//*  10   22:invokeinterface #113 <Method Iterator Set.iterator()>
	//*  11   27:astore_2        
	//*  12   28:aload_2         
	//*  13   29:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//*  14   34:ifeq            66
			s = (String)iterator.next();
	//   15   37:aload_2         
	//   16   38:invokeinterface #123 <Method Object Iterator.next()>
	//   17   43:checkcast       #125 <Class String>
	//   18   46:astore_3        

	//   19   47:aload_1         
	//   20   48:aload_3         
	//   21   49:aload_0         
	//   22   50:getfield        #88  <Field Bundle zzby>
	//   23   53:aload_3         
	//   24   54:invokevirtual   #129 <Method String Bundle.getString(String)>
	//   25   57:invokeinterface #135 <Method Object Map.put(Object, Object)>
	//   26   62:pop             
	//*  27   63:goto            28
		return Collections.unmodifiableMap(((Map) (linkedhashmap)));
	//   28   66:aload_1         
	//   29   67:invokestatic    #141 <Method Map Collections.unmodifiableMap(Map)>
	//   30   70:areturn         
	}

	public String toString()
	{
		String s = url;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String url>
	//    2    4:astore_2        
		int i = httpMethod;
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field int httpMethod>
	//    5    9:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 42);
	//    6   10:new             #147 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #151 <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #154 <Method int String.length()>
	//   11   21:bipush          42
	//   12   23:iadd            
	//   13   24:invokespecial   #155 <Method void StringBuilder(int)>
	//   14   27:astore_3        
		stringbuilder.append("ProxyRequest[ url: ");
	//   15   28:aload_3         
	//   16   29:ldc1            #157 <String "ProxyRequest[ url: ">
	//   17   31:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(s);
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append(", method: ");
	//   23   41:aload_3         
	//   24   42:ldc1            #163 <String ", method: ">
	//   25   44:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		stringbuilder.append(i);
	//   27   48:aload_3         
	//   28   49:iload_1         
	//   29   50:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   30   53:pop             
		stringbuilder.append(" ]");
	//   31   54:aload_3         
	//   32   55:ldc1            #168 <String " ]">
	//   33   57:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
		return stringbuilder.toString();
	//   35   61:aload_3         
	//   36   62:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   37   65:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #178 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, url, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #80  <Field String url>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #182 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 2, httpMethod);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #82  <Field int httpMethod>
	//   13   21:invokestatic    #186 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 3, timeoutMillis);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #84  <Field long timeoutMillis>
	//   18   30:invokestatic    #190 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeByteArray(parcel, 4, body, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #86  <Field byte[] body>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #194 <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		SafeParcelWriter.writeBundle(parcel, 5, zzby, false);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #88  <Field Bundle zzby>
	//   29   49:iconst_0        
	//   30   50:invokestatic    #198 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, versionCode);
	//   31   53:aload_1         
	//   32   54:sipush          1000
	//   33   57:aload_0         
	//   34   58:getfield        #78  <Field int versionCode>
	//   35   61:invokestatic    #186 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   36   64:aload_1         
	//   37   65:iload_2         
	//   38   66:invokestatic    #201 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   39   69:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	public static final int HTTP_METHOD_DELETE = 3;
	public static final int HTTP_METHOD_GET = 0;
	public static final int HTTP_METHOD_HEAD = 4;
	public static final int HTTP_METHOD_OPTIONS = 5;
	public static final int HTTP_METHOD_PATCH = 7;
	public static final int HTTP_METHOD_POST = 1;
	public static final int HTTP_METHOD_PUT = 2;
	public static final int HTTP_METHOD_TRACE = 6;
	public static final int LAST_CODE = 7;
	public static final int VERSION_CODE = 2;
	public final byte body[];
	public final int httpMethod;
	public final long timeoutMillis;
	public final String url;
	private final int versionCode;
	private Bundle zzby;

	static 
	{
	//    0    0:new             #48  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void zza()>
	//    3    7:putstatic       #53  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:iconst_0        
	//    5   11:putstatic       #55  <Field int HTTP_METHOD_GET>
	//    6   14:iconst_1        
	//    7   15:putstatic       #57  <Field int HTTP_METHOD_POST>
	//    8   18:iconst_2        
	//    9   19:putstatic       #59  <Field int HTTP_METHOD_PUT>
	//   10   22:iconst_3        
	//   11   23:putstatic       #61  <Field int HTTP_METHOD_DELETE>
	//   12   26:iconst_4        
	//   13   27:putstatic       #63  <Field int HTTP_METHOD_HEAD>
	//   14   30:iconst_5        
	//   15   31:putstatic       #65  <Field int HTTP_METHOD_OPTIONS>
	//   16   34:bipush          6
	//   17   36:putstatic       #67  <Field int HTTP_METHOD_TRACE>
	//   18   39:bipush          7
	//   19   41:putstatic       #69  <Field int HTTP_METHOD_PATCH>
	//   20   44:bipush          7
	//   21   46:putstatic       #71  <Field int LAST_CODE>
	//*  22   49:return          
	}
}
