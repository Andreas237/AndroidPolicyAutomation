// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			MediaDrmCallback

public final class HttpMediaDrmCallback
	implements MediaDrmCallback
{

	public HttpMediaDrmCallback(String s, com.google.android.exoplayer2.upstream.HttpDataSource.Factory factory)
	{
		this(s, false, factory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:invokespecial   #26  <Method void HttpMediaDrmCallback(String, boolean, com.google.android.exoplayer2.upstream.HttpDataSource$Factory)>
	//    5    7:return          
	}

	public HttpMediaDrmCallback(String s, boolean flag, com.google.android.exoplayer2.upstream.HttpDataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		dataSourceFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #32  <Field com.google.android.exoplayer2.upstream.HttpDataSource$Factory dataSourceFactory>
		defaultLicenseUrl = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #34  <Field String defaultLicenseUrl>
		forceDefaultLicenseUrl = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #36  <Field boolean forceDefaultLicenseUrl>
		keyRequestProperties = ((Map) (new HashMap()));
	//   11   19:aload_0         
	//   12   20:new             #38  <Class HashMap>
	//   13   23:dup             
	//   14   24:invokespecial   #39  <Method void HashMap()>
	//   15   27:putfield        #41  <Field Map keyRequestProperties>
	//   16   30:return          
	}

	private static byte[] executePost(com.google.android.exoplayer2.upstream.HttpDataSource.Factory factory, String s, byte abyte0[], Map map)
		throws IOException
	{
		int j;
		HttpDataSource httpdatasource;
		httpdatasource = factory.createDataSource();
	//    0    0:aload_0         
	//    1    1:invokeinterface #53  <Method HttpDataSource com.google.android.exoplayer2.upstream.HttpDataSource$Factory.createDataSource()>
	//    2    6:astore          7
		if(map != null)
	//*   3    8:aload_3         
	//*   4    9:ifnull          71
			for(factory = ((com.google.android.exoplayer2.upstream.HttpDataSource.Factory) (map.entrySet().iterator())); ((Iterator) (factory)).hasNext(); httpdatasource.setRequestProperty((String)((java.util.Map.Entry) (map)).getKey(), (String)((java.util.Map.Entry) (map)).getValue()))
	//*   5   12:aload_3         
	//*   6   13:invokeinterface #59  <Method Set Map.entrySet()>
	//*   7   18:invokeinterface #65  <Method Iterator Set.iterator()>
	//*   8   23:astore_0        
	//*   9   24:aload_0         
	//*  10   25:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  11   30:ifeq            71
				map = ((Map) ((java.util.Map.Entry)((Iterator) (factory)).next()));
	//   12   33:aload_0         
	//   13   34:invokeinterface #75  <Method Object Iterator.next()>
	//   14   39:checkcast       #77  <Class java.util.Map$Entry>
	//   15   42:astore_3        

	//   16   43:aload           7
	//   17   45:aload_3         
	//   18   46:invokeinterface #80  <Method Object java.util.Map$Entry.getKey()>
	//   19   51:checkcast       #82  <Class String>
	//   20   54:aload_3         
	//   21   55:invokeinterface #85  <Method Object java.util.Map$Entry.getValue()>
	//   22   60:checkcast       #82  <Class String>
	//   23   63:invokeinterface #91  <Method void HttpDataSource.setRequestProperty(String, String)>
	//*  24   68:goto            24
		j = 0;
	//   25   71:iconst_0        
	//   26   72:istore          5
_L4:
		s = ((String) (new DataSourceInputStream(((com.google.android.exoplayer2.upstream.DataSource) (httpdatasource)), new DataSpec(Uri.parse(s), abyte0, 0L, 0L, -1L, ((String) (null)), 1))));
	//   27   74:new             #93  <Class DataSourceInputStream>
	//   28   77:dup             
	//   29   78:aload           7
	//   30   80:new             #95  <Class DataSpec>
	//   31   83:dup             
	//   32   84:aload_1         
	//   33   85:invokestatic    #101 <Method Uri Uri.parse(String)>
	//   34   88:aload_2         
	//   35   89:lconst_0        
	//   36   90:lconst_0        
	//   37   91:ldc2w           #102 <Long -1L>
	//   38   94:aconst_null     
	//   39   95:iconst_1        
	//   40   96:invokespecial   #106 <Method void DataSpec(Uri, byte[], long, long, long, String, int)>
	//   41   99:invokespecial   #109 <Method void DataSourceInputStream(com.google.android.exoplayer2.upstream.DataSource, DataSpec)>
	//   42  102:astore_1        
		factory = ((com.google.android.exoplayer2.upstream.HttpDataSource.Factory) (Util.toByteArray(((java.io.InputStream) (s)))));
	//   43  103:aload_1         
	//   44  104:invokestatic    #115 <Method byte[] Util.toByteArray(java.io.InputStream)>
	//   45  107:astore_0        
		Util.closeQuietly(((java.io.Closeable) (s)));
	//   46  108:aload_1         
	//   47  109:invokestatic    #119 <Method void Util.closeQuietly(java.io.Closeable)>
		return ((byte []) (factory));
	//   48  112:aload_0         
	//   49  113:areturn         
		factory;
	//   50  114:astore_0        
		  goto _L1
	//*  51  115:goto            174
		map;
	//   52  118:astore_3        
		if(((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) (map)).responseCode != 307 && ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) (map)).responseCode != 308) goto _L3; else goto _L2
	//   53  119:aload_3         
	//   54  120:getfield        #122 <Field int com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException.responseCode>
	//   55  123:sipush          307
	//   56  126:icmpeq          187
	//   57  129:aload_3         
	//   58  130:getfield        #122 <Field int com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException.responseCode>
	//   59  133:sipush          308
	//   60  136:icmpne          180
	//*  61  139:goto            187
_L7:
		if(j == 0)
			break MISSING_BLOCK_LABEL_219;
	//   62  142:iload           5
	//   63  144:ifeq            219
		factory = ((com.google.android.exoplayer2.upstream.HttpDataSource.Factory) (getRedirectUrl(((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) (map)))));
	//   64  147:aload_3         
	//   65  148:invokestatic    #126 <Method String getRedirectUrl(com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException)>
	//   66  151:astore_0        
	//*  67  152:goto            155
_L8:
		if(factory != null)
			break MISSING_BLOCK_LABEL_161;
	//   68  155:aload_0         
	//   69  156:ifnonnull       161
		throw map;
	//   70  159:aload_3         
	//   71  160:athrow          
		int i;
		Util.closeQuietly(((java.io.Closeable) (s)));
	//   72  161:aload_1         
	//   73  162:invokestatic    #119 <Method void Util.closeQuietly(java.io.Closeable)>
		s = ((String) (factory));
	//   74  165:aload_0         
	//   75  166:astore_1        
		j = i;
	//   76  167:iload           4
	//   77  169:istore          5
		  goto _L4
	//*  78  171:goto            74
_L1:
		Util.closeQuietly(((java.io.Closeable) (s)));
	//   79  174:aload_1         
	//   80  175:invokestatic    #119 <Method void Util.closeQuietly(java.io.Closeable)>
		throw factory;
	//   81  178:aload_0         
	//   82  179:athrow          
_L3:
		i = j;
	//   83  180:iload           5
	//   84  182:istore          4
		  goto _L5
	//*  85  184:goto            213
_L2:
		int k;
		k = j + 1;
	//   86  187:iload           5
	//   87  189:iconst_1        
	//   88  190:iadd            
	//   89  191:istore          6
		i = k;
	//   90  193:iload           6
	//   91  195:istore          4
		if(j >= 5) goto _L5; else goto _L6
	//   92  197:iload           5
	//   93  199:iconst_5        
	//   94  200:icmpge          213
_L6:
		j = 1;
	//   95  203:iconst_1        
	//   96  204:istore          5
		i = k;
	//   97  206:iload           6
	//   98  208:istore          4
		  goto _L7
	//*  99  210:goto            142
_L5:
		j = 0;
	//  100  213:iconst_0        
	//  101  214:istore          5
		  goto _L7
	//* 102  216:goto            142
		factory = null;
	//  103  219:aconst_null     
	//  104  220:astore_0        
		  goto _L8
	//* 105  221:goto            155
	}

	private static String getRedirectUrl(com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException invalidresponsecodeexception)
	{
		invalidresponsecodeexception = ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) (invalidresponsecodeexception.headerFields));
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Map com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException.headerFields>
	//    2    4:astore_0        
		if(invalidresponsecodeexception != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          45
		{
			invalidresponsecodeexception = ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) ((List)((Map) (invalidresponsecodeexception)).get("Location")));
	//    5    9:aload_0         
	//    6   10:ldc1            #134 <String "Location">
	//    7   12:invokeinterface #138 <Method Object Map.get(Object)>
	//    8   17:checkcast       #140 <Class List>
	//    9   20:astore_0        
			if(invalidresponsecodeexception != null && !((List) (invalidresponsecodeexception)).isEmpty())
	//*  10   21:aload_0         
	//*  11   22:ifnull          45
	//*  12   25:aload_0         
	//*  13   26:invokeinterface #143 <Method boolean List.isEmpty()>
	//*  14   31:ifne            45
				return (String)((List) (invalidresponsecodeexception)).get(0);
	//   15   34:aload_0         
	//   16   35:iconst_0        
	//   17   36:invokeinterface #146 <Method Object List.get(int)>
	//   18   41:checkcast       #82  <Class String>
	//   19   44:areturn         
		}
		return null;
	//   20   45:aconst_null     
	//   21   46:areturn         
	}

	public void clearAllKeyRequestProperties()
	{
		synchronized(keyRequestProperties)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Map keyRequestProperties>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			keyRequestProperties.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field Map keyRequestProperties>
	//    7   11:invokeinterface #150 <Method void Map.clear()>
		}
	//    8   16:aload_1         
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		exception;
	//   11   19:astore_2        
		map;
	//   12   20:aload_1         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		throw exception;
	//   14   22:aload_2         
	//   15   23:athrow          
	}

	public void clearKeyRequestProperty(String s)
	{
		Assertions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #157 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		synchronized(keyRequestProperties)
	//*   3    5:aload_0         
	//*   4    6:getfield        #41  <Field Map keyRequestProperties>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:monitorenter    
		{
			keyRequestProperties.remove(((Object) (s)));
	//    8   12:aload_0         
	//    9   13:getfield        #41  <Field Map keyRequestProperties>
	//   10   16:aload_1         
	//   11   17:invokeinterface #160 <Method Object Map.remove(Object)>
	//   12   22:pop             
		}
	//   13   23:aload_2         
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		s;
	//   16   26:astore_1        
		map;
	//   17   27:aload_2         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw s;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyrequest, String s)
		throws Exception
	{
		String s1;
label0:
		{
			s1 = keyrequest.getDefaultUrl();
	//    0    0:aload_2         
	//    1    1:invokeinterface #171 <Method String ExoMediaDrm$KeyRequest.getDefaultUrl()>
	//    2    6:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   3    8:aload           4
	//*   4   10:invokestatic    #176 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   13:ifeq            19
	//*   6   16:goto            22
				s = s1;
	//    7   19:aload           4
	//    8   21:astore_3        
			if(!forceDefaultLicenseUrl)
	//*   9   22:aload_0         
	//*  10   23:getfield        #36  <Field boolean forceDefaultLicenseUrl>
	//*  11   26:ifne            39
			{
				s1 = s;
	//   12   29:aload_3         
	//   13   30:astore          4
				if(!TextUtils.isEmpty(((CharSequence) (s))))
					break label0;
	//   14   32:aload_3         
	//   15   33:invokestatic    #176 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   16   36:ifeq            45
			}
			s1 = defaultLicenseUrl;
	//   17   39:aload_0         
	//   18   40:getfield        #34  <Field String defaultLicenseUrl>
	//   19   43:astore          4
		}
		HashMap hashmap = new HashMap();
	//   20   45:new             #38  <Class HashMap>
	//   21   48:dup             
	//   22   49:invokespecial   #39  <Method void HashMap()>
	//   23   52:astore          5
		if(C.PLAYREADY_UUID.equals(((Object) (uuid))))
	//*  24   54:getstatic       #182 <Field UUID C.PLAYREADY_UUID>
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #188 <Method boolean UUID.equals(Object)>
	//*  27   61:ifeq            70
			s = "text/xml";
	//   28   64:ldc1            #190 <String "text/xml">
	//   29   66:astore_3        
		else
	//*  30   67:goto            89
		if(C.CLEARKEY_UUID.equals(((Object) (uuid))))
	//*  31   70:getstatic       #193 <Field UUID C.CLEARKEY_UUID>
	//*  32   73:aload_1         
	//*  33   74:invokevirtual   #188 <Method boolean UUID.equals(Object)>
	//*  34   77:ifeq            86
			s = "application/json";
	//   35   80:ldc1            #195 <String "application/json">
	//   36   82:astore_3        
		else
	//*  37   83:goto            89
			s = "application/octet-stream";
	//   38   86:ldc1            #197 <String "application/octet-stream">
	//   39   88:astore_3        
		((Map) (hashmap)).put("Content-Type", ((Object) (s)));
	//   40   89:aload           5
	//   41   91:ldc1            #199 <String "Content-Type">
	//   42   93:aload_3         
	//   43   94:invokeinterface #203 <Method Object Map.put(Object, Object)>
	//   44   99:pop             
		if(C.PLAYREADY_UUID.equals(((Object) (uuid))))
	//*  45  100:getstatic       #182 <Field UUID C.PLAYREADY_UUID>
	//*  46  103:aload_1         
	//*  47  104:invokevirtual   #188 <Method boolean UUID.equals(Object)>
	//*  48  107:ifeq            122
			((Map) (hashmap)).put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
	//   49  110:aload           5
	//   50  112:ldc1            #205 <String "SOAPAction">
	//   51  114:ldc1            #207 <String "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense">
	//   52  116:invokeinterface #203 <Method Object Map.put(Object, Object)>
	//   53  121:pop             
		synchronized(keyRequestProperties)
	//*  54  122:aload_0         
	//*  55  123:getfield        #41  <Field Map keyRequestProperties>
	//*  56  126:astore_1        
	//*  57  127:aload_1         
	//*  58  128:monitorenter    
		{
			((Map) (hashmap)).putAll(keyRequestProperties);
	//   59  129:aload           5
	//   60  131:aload_0         
	//   61  132:getfield        #41  <Field Map keyRequestProperties>
	//   62  135:invokeinterface #211 <Method void Map.putAll(Map)>
		}
	//   63  140:aload_1         
	//   64  141:monitorexit     
		return executePost(dataSourceFactory, s1, keyrequest.getData(), ((Map) (hashmap)));
	//   65  142:aload_0         
	//   66  143:getfield        #32  <Field com.google.android.exoplayer2.upstream.HttpDataSource$Factory dataSourceFactory>
	//   67  146:aload           4
	//   68  148:aload_2         
	//   69  149:invokeinterface #215 <Method byte[] ExoMediaDrm$KeyRequest.getData()>
	//   70  154:aload           5
	//   71  156:invokestatic    #217 <Method byte[] executePost(com.google.android.exoplayer2.upstream.HttpDataSource$Factory, String, byte[], Map)>
	//   72  159:areturn         
		keyrequest;
	//   73  160:astore_2        
		uuid;
	//   74  161:aload_1         
		JVM INSTR monitorexit ;
	//   75  162:monitorexit     
		throw keyrequest;
	//   76  163:aload_2         
	//   77  164:athrow          
	}

	public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionrequest)
		throws IOException
	{
		uuid = ((UUID) (new StringBuilder()));
	//    0    0:new             #222 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #223 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (uuid)).append(provisionrequest.getDefaultUrl());
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #226 <Method String ExoMediaDrm$ProvisionRequest.getDefaultUrl()>
	//    7   15:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (uuid)).append("&signedRequest=");
	//    9   19:aload_1         
	//   10   20:ldc1            #232 <String "&signedRequest=">
	//   11   22:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (uuid)).append(Util.fromUtf8Bytes(provisionrequest.getData()));
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokeinterface #233 <Method byte[] ExoMediaDrm$ProvisionRequest.getData()>
	//   16   33:invokestatic    #237 <Method String Util.fromUtf8Bytes(byte[])>
	//   17   36:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		uuid = ((UUID) (((StringBuilder) (uuid)).toString()));
	//   19   40:aload_1         
	//   20   41:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   21   44:astore_1        
		return executePost(dataSourceFactory, ((String) (uuid)), new byte[0], ((Map) (null)));
	//   22   45:aload_0         
	//   23   46:getfield        #32  <Field com.google.android.exoplayer2.upstream.HttpDataSource$Factory dataSourceFactory>
	//   24   49:aload_1         
	//   25   50:iconst_0        
	//   26   51:newarray        byte[]
	//   27   53:aconst_null     
	//   28   54:invokestatic    #217 <Method byte[] executePost(com.google.android.exoplayer2.upstream.HttpDataSource$Factory, String, byte[], Map)>
	//   29   57:areturn         
	}

	public void setKeyRequestProperty(String s, String s1)
	{
		Assertions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #157 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		Assertions.checkNotNull(((Object) (s1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #157 <Method Object Assertions.checkNotNull(Object)>
	//    5    9:pop             
		synchronized(keyRequestProperties)
	//*   6   10:aload_0         
	//*   7   11:getfield        #41  <Field Map keyRequestProperties>
	//*   8   14:astore_3        
	//*   9   15:aload_3         
	//*  10   16:monitorenter    
		{
			keyRequestProperties.put(((Object) (s)), ((Object) (s1)));
	//   11   17:aload_0         
	//   12   18:getfield        #41  <Field Map keyRequestProperties>
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokeinterface #203 <Method Object Map.put(Object, Object)>
	//   16   28:pop             
		}
	//   17   29:aload_3         
	//   18   30:monitorexit     
		return;
	//   19   31:return          
		s;
	//   20   32:astore_1        
		map;
	//   21   33:aload_3         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		throw s;
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	private static final int MAX_MANUAL_REDIRECTS = 5;
	private final com.google.android.exoplayer2.upstream.HttpDataSource.Factory dataSourceFactory;
	private final String defaultLicenseUrl;
	private final boolean forceDefaultLicenseUrl;
	private final Map keyRequestProperties;
}
