// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.wearable:
//			zzh, DataItem, DataItemAsset, Asset

public class PutDataRequest extends zza
{

	private PutDataRequest(Uri uri)
	{
		this(uri, new Bundle(), ((byte []) (null)), zzbSV);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #54  <Class Bundle>
	//    3    5:dup             
	//    4    6:invokespecial   #55  <Method void Bundle()>
	//    5    9:aconst_null     
	//    6   10:getstatic       #45  <Field long zzbSV>
	//    7   13:invokespecial   #58  <Method void PutDataRequest(Uri, Bundle, byte[], long)>
	//    8   16:return          
	}

	PutDataRequest(Uri uri, Bundle bundle, byte abyte0[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void zza()>
		mUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #61  <Field Uri mUri>
		zzbSX = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #63  <Field Bundle zzbSX>
		zzbSX.setClassLoader(((Class) (com/google/android/gms/wearable/internal/DataItemAssetParcelable)).getClassLoader());
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field Bundle zzbSX>
	//   10   18:ldc1            #65  <Class DataItemAssetParcelable>
	//   11   20:invokevirtual   #71  <Method ClassLoader Class.getClassLoader()>
	//   12   23:invokevirtual   #75  <Method void Bundle.setClassLoader(ClassLoader)>
		zzbeL = abyte0;
	//   13   26:aload_0         
	//   14   27:aload_3         
	//   15   28:putfield        #77  <Field byte[] zzbeL>
		zzbSY = l;
	//   16   31:aload_0         
	//   17   32:lload           4
	//   18   34:putfield        #79  <Field long zzbSY>
	//   19   37:return          
	}

	public static PutDataRequest create(String s)
	{
		return zzy(zzin(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #85  <Method Uri zzin(String)>
	//    2    4:invokestatic    #89  <Method PutDataRequest zzy(Uri)>
	//    3    7:areturn         
	}

	public static PutDataRequest createFromDataItem(DataItem dataitem)
	{
		PutDataRequest putdatarequest = zzy(dataitem.getUri());
	//    0    0:aload_0         
	//    1    1:invokeinterface #97  <Method Uri DataItem.getUri()>
	//    2    6:invokestatic    #89  <Method PutDataRequest zzy(Uri)>
	//    3    9:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = dataitem.getAssets().entrySet().iterator(); iterator.hasNext(); putdatarequest.putAsset((String)entry.getKey(), Asset.createFromRef(((DataItemAsset)entry.getValue()).getId())))
	//*   4   10:aload_0         
	//*   5   11:invokeinterface #101 <Method Map DataItem.getAssets()>
	//*   6   16:invokeinterface #107 <Method Set Map.entrySet()>
	//*   7   21:invokeinterface #113 <Method Iterator Set.iterator()>
	//*   8   26:astore_2        
	//*   9   27:aload_2         
	//*  10   28:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//*  11   33:ifeq            146
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   12   36:aload_2         
	//   13   37:invokeinterface #123 <Method Object Iterator.next()>
	//   14   42:checkcast       #125 <Class java.util.Map$Entry>
	//   15   45:astore_3        
			if(((DataItemAsset)entry.getValue()).getId() == null)
	//*  16   46:aload_3         
	//*  17   47:invokeinterface #128 <Method Object java.util.Map$Entry.getValue()>
	//*  18   52:checkcast       #130 <Class DataItemAsset>
	//*  19   55:invokeinterface #134 <Method String DataItemAsset.getId()>
	//*  20   60:ifnonnull       112
			{
				dataitem = ((DataItem) (String.valueOf(((Object) ((String)entry.getKey())))));
	//   21   63:aload_3         
	//   22   64:invokeinterface #137 <Method Object java.util.Map$Entry.getKey()>
	//   23   69:checkcast       #139 <Class String>
	//   24   72:invokestatic    #143 <Method String String.valueOf(Object)>
	//   25   75:astore_0        
				if(((String) (dataitem)).length() != 0)
	//*  26   76:aload_0         
	//*  27   77:invokevirtual   #147 <Method int String.length()>
	//*  28   80:ifeq            93
					dataitem = ((DataItem) ("Cannot create an asset for a put request without a digest: ".concat(((String) (dataitem)))));
	//   29   83:ldc1            #149 <String "Cannot create an asset for a put request without a digest: ">
	//   30   85:aload_0         
	//   31   86:invokevirtual   #153 <Method String String.concat(String)>
	//   32   89:astore_0        
				else
	//*  33   90:goto            103
					dataitem = ((DataItem) (new String("Cannot create an asset for a put request without a digest: ")));
	//   34   93:new             #139 <Class String>
	//   35   96:dup             
	//   36   97:ldc1            #149 <String "Cannot create an asset for a put request without a digest: ">
	//   37   99:invokespecial   #156 <Method void String(String)>
	//   38  102:astore_0        
				throw new IllegalStateException(((String) (dataitem)));
	//   39  103:new             #158 <Class IllegalStateException>
	//   40  106:dup             
	//   41  107:aload_0         
	//   42  108:invokespecial   #159 <Method void IllegalStateException(String)>
	//   43  111:athrow          
			}
		}

	//   44  112:aload_1         
	//   45  113:aload_3         
	//   46  114:invokeinterface #137 <Method Object java.util.Map$Entry.getKey()>
	//   47  119:checkcast       #139 <Class String>
	//   48  122:aload_3         
	//   49  123:invokeinterface #128 <Method Object java.util.Map$Entry.getValue()>
	//   50  128:checkcast       #130 <Class DataItemAsset>
	//   51  131:invokeinterface #134 <Method String DataItemAsset.getId()>
	//   52  136:invokestatic    #165 <Method Asset Asset.createFromRef(String)>
	//   53  139:invokevirtual   #169 <Method PutDataRequest putAsset(String, Asset)>
	//   54  142:pop             
	//*  55  143:goto            27
		putdatarequest.setData(dataitem.getData());
	//   56  146:aload_1         
	//   57  147:aload_0         
	//   58  148:invokeinterface #173 <Method byte[] DataItem.getData()>
	//   59  153:invokevirtual   #177 <Method PutDataRequest setData(byte[])>
	//   60  156:pop             
		return putdatarequest;
	//   61  157:aload_1         
	//   62  158:areturn         
	}

	public static PutDataRequest createWithAutoAppendedId(String s)
	{
		StringBuilder stringbuilder = new StringBuilder(s);
	//    0    0:new             #180 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #181 <Method void StringBuilder(String)>
	//    4    8:astore_1        
		if(!s.endsWith("/"))
	//*   5    9:aload_0         
	//*   6   10:ldc1            #183 <String "/">
	//*   7   12:invokevirtual   #187 <Method boolean String.endsWith(String)>
	//*   8   15:ifne            25
			stringbuilder.append("/");
	//    9   18:aload_1         
	//   10   19:ldc1            #183 <String "/">
	//   11   21:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append("PN").append(zzbSW.nextLong());
	//   13   25:aload_1         
	//   14   26:ldc1            #193 <String "PN">
	//   15   28:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:getstatic       #50  <Field Random zzbSW>
	//   17   34:invokevirtual   #199 <Method long Random.nextLong()>
	//   18   37:invokevirtual   #202 <Method StringBuilder StringBuilder.append(long)>
	//   19   40:pop             
		return new PutDataRequest(zzin(stringbuilder.toString()));
	//   20   41:new             #2   <Class PutDataRequest>
	//   21   44:dup             
	//   22   45:aload_1         
	//   23   46:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   24   49:invokestatic    #85  <Method Uri zzin(String)>
	//   25   52:invokespecial   #207 <Method void PutDataRequest(Uri)>
	//   26   55:areturn         
	}

	private static Uri zzin(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("An empty path was supplied.");
	//    3    7:new             #215 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #217 <String "An empty path was supplied.">
	//    6   13:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(!s.startsWith("/"))
	//*   8   17:aload_0         
	//*   9   18:ldc1            #183 <String "/">
	//*  10   20:invokevirtual   #221 <Method boolean String.startsWith(String)>
	//*  11   23:ifne            36
			throw new IllegalArgumentException("A path must start with a single / .");
	//   12   26:new             #215 <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc1            #223 <String "A path must start with a single / .">
	//   15   32:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   16   35:athrow          
		if(s.startsWith("//"))
	//*  17   36:aload_0         
	//*  18   37:ldc1            #225 <String "//">
	//*  19   39:invokevirtual   #221 <Method boolean String.startsWith(String)>
	//*  20   42:ifeq            55
			throw new IllegalArgumentException("A path must start with a single / .");
	//   21   45:new             #215 <Class IllegalArgumentException>
	//   22   48:dup             
	//   23   49:ldc1            #223 <String "A path must start with a single / .">
	//   24   51:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   25   54:athrow          
		else
			return (new android.net.Uri.Builder()).scheme("wear").path(s).build();
	//   26   55:new             #227 <Class android.net.Uri$Builder>
	//   27   58:dup             
	//   28   59:invokespecial   #228 <Method void android.net.Uri$Builder()>
	//   29   62:ldc1            #11  <String "wear">
	//   30   64:invokevirtual   #232 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   31   67:aload_0         
	//   32   68:invokevirtual   #235 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   33   71:invokevirtual   #238 <Method Uri android.net.Uri$Builder.build()>
	//   34   74:areturn         
	}

	public static PutDataRequest zzy(Uri uri)
	{
		return new PutDataRequest(uri);
	//    0    0:new             #2   <Class PutDataRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #207 <Method void PutDataRequest(Uri)>
	//    4    8:areturn         
	}

	public Asset getAsset(String s)
	{
		return (Asset)zzbSX.getParcelable(s);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Bundle zzbSX>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #243 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    4    8:checkcast       #161 <Class Asset>
	//    5   11:areturn         
	}

	public Map getAssets()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #245 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #246 <Method void HashMap()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = zzbSX.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) ((Asset)zzbSX.getParcelable(s)))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #63  <Field Bundle zzbSX>
	//*   6   12:invokevirtual   #249 <Method Set Bundle.keySet()>
	//*   7   15:invokeinterface #113 <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            60
			s = (String)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #123 <Method Object Iterator.next()>
	//   14   36:checkcast       #139 <Class String>
	//   15   39:astore_3        

	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:aload_0         
	//   19   43:getfield        #63  <Field Bundle zzbSX>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #243 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   22   50:checkcast       #161 <Class Asset>
	//   23   53:invokevirtual   #253 <Method Object HashMap.put(Object, Object)>
	//   24   56:pop             
	//*  25   57:goto            21
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   26   60:aload_1         
	//   27   61:invokestatic    #259 <Method Map Collections.unmodifiableMap(Map)>
	//   28   64:areturn         
	}

	public byte[] getData()
	{
		return zzbeL;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field byte[] zzbeL>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Uri mUri>
	//    2    4:areturn         
	}

	public boolean hasAsset(String s)
	{
		return zzbSX.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Bundle zzbSX>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #265 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
	}

	public boolean isUrgent()
	{
		return zzbSY == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field long zzbSY>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public PutDataRequest putAsset(String s, Asset asset)
	{
		zzac.zzw(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #272 <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzac.zzw(((Object) (asset)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #272 <Method Object zzac.zzw(Object)>
	//    5    9:pop             
		zzbSX.putParcelable(s, ((android.os.Parcelable) (asset)));
	//    6   10:aload_0         
	//    7   11:getfield        #63  <Field Bundle zzbSX>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #276 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public PutDataRequest removeAsset(String s)
	{
		zzbSX.remove(s);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Bundle zzbSX>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #280 <Method void Bundle.remove(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PutDataRequest setData(byte abyte0[])
	{
		zzbeL = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field byte[] zzbeL>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PutDataRequest setUrgent()
	{
		zzbSY = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #79  <Field long zzbSY>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String toString()
	{
		return toString(Log.isLoggable("DataMap", 3));
	//    0    0:aload_0         
	//    1    1:ldc2            #284 <String "DataMap">
	//    2    4:iconst_3        
	//    3    5:invokestatic    #290 <Method boolean Log.isLoggable(String, int)>
	//    4    8:invokevirtual   #293 <Method String toString(boolean)>
	//    5   11:areturn         
	}

	public String toString(boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder("PutDataRequest[");
	//    0    0:new             #180 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #295 <String "PutDataRequest[">
	//    3    7:invokespecial   #181 <Method void StringBuilder(String)>
	//    4   10:astore          6
		Object obj;
		if(zzbeL == null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #77  <Field byte[] zzbeL>
	//*   7   16:ifnonnull       27
			obj = "null";
	//    8   19:ldc2            #297 <String "null">
	//    9   22:astore          5
		else
	//*  10   24:goto            37
			obj = ((Object) (Integer.valueOf(zzbeL.length)));
	//   11   27:aload_0         
	//   12   28:getfield        #77  <Field byte[] zzbeL>
	//   13   31:arraylength     
	//   14   32:invokestatic    #302 <Method Integer Integer.valueOf(int)>
	//   15   35:astore          5
		obj = ((Object) (String.valueOf(obj)));
	//   16   37:aload           5
	//   17   39:invokestatic    #143 <Method String String.valueOf(Object)>
	//   18   42:astore          5
		stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 7)).append("dataSz=").append(((String) (obj))).toString());
	//   19   44:aload           6
	//   20   46:new             #180 <Class StringBuilder>
	//   21   49:dup             
	//   22   50:aload           5
	//   23   52:invokestatic    #143 <Method String String.valueOf(Object)>
	//   24   55:invokevirtual   #147 <Method int String.length()>
	//   25   58:bipush          7
	//   26   60:iadd            
	//   27   61:invokespecial   #305 <Method void StringBuilder(int)>
	//   28   64:ldc2            #307 <String "dataSz=">
	//   29   67:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   30   70:aload           5
	//   31   72:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   32   75:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   33   78:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   34   81:pop             
		int i = zzbSX.size();
	//   35   82:aload_0         
	//   36   83:getfield        #63  <Field Bundle zzbSX>
	//   37   86:invokevirtual   #310 <Method int Bundle.size()>
	//   38   89:istore_2        
		stringbuilder.append((new StringBuilder(23)).append(", numAssets=").append(i).toString());
	//   39   90:aload           6
	//   40   92:new             #180 <Class StringBuilder>
	//   41   95:dup             
	//   42   96:bipush          23
	//   43   98:invokespecial   #305 <Method void StringBuilder(int)>
	//   44  101:ldc2            #312 <String ", numAssets=">
	//   45  104:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   46  107:iload_2         
	//   47  108:invokevirtual   #315 <Method StringBuilder StringBuilder.append(int)>
	//   48  111:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   49  114:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   50  117:pop             
		obj = ((Object) (String.valueOf(((Object) (mUri)))));
	//   51  118:aload_0         
	//   52  119:getfield        #61  <Field Uri mUri>
	//   53  122:invokestatic    #143 <Method String String.valueOf(Object)>
	//   54  125:astore          5
		stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 6)).append(", uri=").append(((String) (obj))).toString());
	//   55  127:aload           6
	//   56  129:new             #180 <Class StringBuilder>
	//   57  132:dup             
	//   58  133:aload           5
	//   59  135:invokestatic    #143 <Method String String.valueOf(Object)>
	//   60  138:invokevirtual   #147 <Method int String.length()>
	//   61  141:bipush          6
	//   62  143:iadd            
	//   63  144:invokespecial   #305 <Method void StringBuilder(int)>
	//   64  147:ldc2            #317 <String ", uri=">
	//   65  150:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   66  153:aload           5
	//   67  155:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   68  158:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   69  161:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   70  164:pop             
		long l = zzbSY;
	//   71  165:aload_0         
	//   72  166:getfield        #79  <Field long zzbSY>
	//   73  169:lstore_3        
		stringbuilder.append((new StringBuilder(35)).append(", syncDeadline=").append(l).toString());
	//   74  170:aload           6
	//   75  172:new             #180 <Class StringBuilder>
	//   76  175:dup             
	//   77  176:bipush          35
	//   78  178:invokespecial   #305 <Method void StringBuilder(int)>
	//   79  181:ldc2            #319 <String ", syncDeadline=">
	//   80  184:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   81  187:lload_3         
	//   82  188:invokevirtual   #202 <Method StringBuilder StringBuilder.append(long)>
	//   83  191:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   84  194:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   85  197:pop             
		if(!flag)
	//*  86  198:iload_1         
	//*  87  199:ifne            217
		{
			stringbuilder.append("]");
	//   88  202:aload           6
	//   89  204:ldc2            #321 <String "]">
	//   90  207:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   91  210:pop             
			return stringbuilder.toString();
	//   92  211:aload           6
	//   93  213:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   94  216:areturn         
		}
		stringbuilder.append("]\n  assets: ");
	//   95  217:aload           6
	//   96  219:ldc2            #323 <String "]\n  assets: ">
	//   97  222:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   98  225:pop             
		int j;
		String s;
		String s1;
		for(Iterator iterator = zzbSX.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder(String.valueOf(((Object) (s1))).length() + (j + 7))).append("\n    ").append(s).append(": ").append(s1).toString()))
	//*  99  226:aload_0         
	//* 100  227:getfield        #63  <Field Bundle zzbSX>
	//* 101  230:invokevirtual   #249 <Method Set Bundle.keySet()>
	//* 102  233:invokeinterface #113 <Method Iterator Set.iterator()>
	//* 103  238:astore          5
	//* 104  240:aload           5
	//* 105  242:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//* 106  247:ifeq            339
		{
			s = (String)iterator.next();
	//  107  250:aload           5
	//  108  252:invokeinterface #123 <Method Object Iterator.next()>
	//  109  257:checkcast       #139 <Class String>
	//  110  260:astore          7
			s1 = String.valueOf(((Object) (zzbSX.getParcelable(s))));
	//  111  262:aload_0         
	//  112  263:getfield        #63  <Field Bundle zzbSX>
	//  113  266:aload           7
	//  114  268:invokevirtual   #243 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  115  271:invokestatic    #143 <Method String String.valueOf(Object)>
	//  116  274:astore          8
			j = String.valueOf(((Object) (s))).length();
	//  117  276:aload           7
	//  118  278:invokestatic    #143 <Method String String.valueOf(Object)>
	//  119  281:invokevirtual   #147 <Method int String.length()>
	//  120  284:istore_2        
		}

	//  121  285:aload           6
	//  122  287:new             #180 <Class StringBuilder>
	//  123  290:dup             
	//  124  291:aload           8
	//  125  293:invokestatic    #143 <Method String String.valueOf(Object)>
	//  126  296:invokevirtual   #147 <Method int String.length()>
	//  127  299:iload_2         
	//  128  300:bipush          7
	//  129  302:iadd            
	//  130  303:iadd            
	//  131  304:invokespecial   #305 <Method void StringBuilder(int)>
	//  132  307:ldc2            #325 <String "\n    ">
	//  133  310:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  134  313:aload           7
	//  135  315:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  136  318:ldc2            #327 <String ": ">
	//  137  321:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  138  324:aload           8
	//  139  326:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  140  329:invokevirtual   #205 <Method String StringBuilder.toString()>
	//  141  332:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  142  335:pop             
	//* 143  336:goto            240
		stringbuilder.append("\n  ]");
	//  144  339:aload           6
	//  145  341:ldc2            #329 <String "\n  ]">
	//  146  344:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  147  347:pop             
		return stringbuilder.toString();
	//  148  348:aload           6
	//  149  350:invokevirtual   #205 <Method String StringBuilder.toString()>
	//  150  353:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.zzh.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #335 <Method void com.google.android.gms.wearable.zzh.zza(PutDataRequest, Parcel, int)>
	//    4    6:return          
	}

	public Bundle zzUg()
	{
		return zzbSX;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Bundle zzbSX>
	//    2    4:areturn         
	}

	public long zzUh()
	{
		return zzbSY;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field long zzbSY>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzh();
	public static final String WEAR_URI_SCHEME = "wear";
	private static final long zzbSV;
	private static final Random zzbSW = new SecureRandom();
	private final Uri mUri;
	private final Bundle zzbSX;
	private long zzbSY;
	private byte zzbeL[];

	static 
	{
	//    0    0:new             #26  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzh()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		zzbSV = TimeUnit.MINUTES.toMillis(30L);
	//    4   10:getstatic       #37  <Field TimeUnit TimeUnit.MINUTES>
	//    5   13:ldc2w           #38  <Long 30L>
	//    6   16:invokevirtual   #43  <Method long TimeUnit.toMillis(long)>
	//    7   19:putstatic       #45  <Field long zzbSV>
	//    8   22:new             #47  <Class SecureRandom>
	//    9   25:dup             
	//   10   26:invokespecial   #48  <Method void SecureRandom()>
	//   11   29:putstatic       #50  <Field Random zzbSW>
	//*  12   32:return          
	}
}
