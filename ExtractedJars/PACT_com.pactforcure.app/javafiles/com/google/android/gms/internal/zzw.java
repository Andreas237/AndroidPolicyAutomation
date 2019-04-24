// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.net.URI;
import java.util.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.android.gms.internal:
//			zzy, zza, zzk

public class zzw
	implements zzy
{
	public static final class zza extends HttpEntityEnclosingRequestBase
	{

		public String getMethod()
		{
			return "PATCH";
		//    0    0:ldc1            #27  <String "PATCH">
		//    1    2:areturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void HttpEntityEnclosingRequestBase()>
		//    2    4:return          
		}

		public zza(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void HttpEntityEnclosingRequestBase()>
			setURI(URI.create(s));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #19  <Method URI URI.create(String)>
		//    5    9:invokevirtual   #23  <Method void setURI(URI)>
		//    6   12:return          
		}
	}


	public zzw(HttpClient httpclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzaC = httpclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field HttpClient zzaC>
	//    5    9:return          
	}

	private static void zza(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, zzk zzk1)
		throws com.google.android.gms.internal.zza
	{
		zzk1 = ((zzk) (zzk1.zzm()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method byte[] zzk.zzm()>
	//    2    4:astore_1        
		if(zzk1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			httpentityenclosingrequestbase.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (zzk1))))));
	//    5    9:aload_0         
	//    6   10:new             #30  <Class ByteArrayEntity>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #33  <Method void ByteArrayEntity(byte[])>
	//   10   18:invokevirtual   #39  <Method void HttpEntityEnclosingRequestBase.setEntity(org.apache.http.HttpEntity)>
	//   11   21:return          
	}

	private static void zza(HttpUriRequest httpurirequest, Map map)
	{
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(((Object) (s)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #49  <Method Set Map.keySet()>
	//*   2    6:invokeinterface #55  <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            51
			s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #65  <Method Object Iterator.next()>
	//    9   27:checkcast       #67  <Class String>
	//   10   30:astore_3        

	//   11   31:aload_0         
	//   12   32:aload_3         
	//   13   33:aload_1         
	//   14   34:aload_3         
	//   15   35:invokeinterface #71  <Method Object Map.get(Object)>
	//   16   40:checkcast       #67  <Class String>
	//   17   43:invokeinterface #77  <Method void HttpUriRequest.setHeader(String, String)>
	//*  18   48:goto            12
	//   19   51:return          
	}

	static HttpUriRequest zzb(zzk zzk1, Map map)
		throws com.google.android.gms.internal.zza
	{
		switch(zzk1.getMethod())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #84  <Method int zzk.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 66
	//	               0 123
	//	               1 147
	//	               2 176
	//	               3 135
	//	               4 205
	//	               5 217
	//	               6 229
	//	               7 241
		default:
			throw new IllegalStateException("Unknown request method.");
	//    3   56:new             #86  <Class IllegalStateException>
	//    4   59:dup             
	//    5   60:ldc1            #88  <String "Unknown request method.">
	//    6   62:invokespecial   #91  <Method void IllegalStateException(String)>
	//    7   65:athrow          

		case -1: 
			map = ((Map) (zzk1.zzj()));
	//    8   66:aload_0         
	//    9   67:invokevirtual   #94  <Method byte[] zzk.zzj()>
	//   10   70:astore_1        
			if(map != null)
	//*  11   71:aload_1         
	//*  12   72:ifnull          111
			{
				HttpPost httppost = new HttpPost(zzk1.getUrl());
	//   13   75:new             #96  <Class HttpPost>
	//   14   78:dup             
	//   15   79:aload_0         
	//   16   80:invokevirtual   #100 <Method String zzk.getUrl()>
	//   17   83:invokespecial   #101 <Method void HttpPost(String)>
	//   18   86:astore_2        
				httppost.addHeader("Content-Type", zzk1.zzi());
	//   19   87:aload_2         
	//   20   88:ldc1            #103 <String "Content-Type">
	//   21   90:aload_0         
	//   22   91:invokevirtual   #106 <Method String zzk.zzi()>
	//   23   94:invokevirtual   #109 <Method void HttpPost.addHeader(String, String)>
				httppost.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (map))))));
	//   24   97:aload_2         
	//   25   98:new             #30  <Class ByteArrayEntity>
	//   26  101:dup             
	//   27  102:aload_1         
	//   28  103:invokespecial   #33  <Method void ByteArrayEntity(byte[])>
	//   29  106:invokevirtual   #110 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
				return ((HttpUriRequest) (httppost));
	//   30  109:aload_2         
	//   31  110:areturn         
			} else
			{
				return ((HttpUriRequest) (new HttpGet(zzk1.getUrl())));
	//   32  111:new             #112 <Class HttpGet>
	//   33  114:dup             
	//   34  115:aload_0         
	//   35  116:invokevirtual   #100 <Method String zzk.getUrl()>
	//   36  119:invokespecial   #113 <Method void HttpGet(String)>
	//   37  122:areturn         
			}

		case 0: // '\0'
			return ((HttpUriRequest) (new HttpGet(zzk1.getUrl())));
	//   38  123:new             #112 <Class HttpGet>
	//   39  126:dup             
	//   40  127:aload_0         
	//   41  128:invokevirtual   #100 <Method String zzk.getUrl()>
	//   42  131:invokespecial   #113 <Method void HttpGet(String)>
	//   43  134:areturn         

		case 3: // '\003'
			return ((HttpUriRequest) (new HttpDelete(zzk1.getUrl())));
	//   44  135:new             #115 <Class HttpDelete>
	//   45  138:dup             
	//   46  139:aload_0         
	//   47  140:invokevirtual   #100 <Method String zzk.getUrl()>
	//   48  143:invokespecial   #116 <Method void HttpDelete(String)>
	//   49  146:areturn         

		case 1: // '\001'
			map = ((Map) (new HttpPost(zzk1.getUrl())));
	//   50  147:new             #96  <Class HttpPost>
	//   51  150:dup             
	//   52  151:aload_0         
	//   53  152:invokevirtual   #100 <Method String zzk.getUrl()>
	//   54  155:invokespecial   #101 <Method void HttpPost(String)>
	//   55  158:astore_1        
			((HttpPost) (map)).addHeader("Content-Type", zzk1.zzl());
	//   56  159:aload_1         
	//   57  160:ldc1            #103 <String "Content-Type">
	//   58  162:aload_0         
	//   59  163:invokevirtual   #119 <Method String zzk.zzl()>
	//   60  166:invokevirtual   #109 <Method void HttpPost.addHeader(String, String)>
			zza(((HttpEntityEnclosingRequestBase) (map)), zzk1);
	//   61  169:aload_1         
	//   62  170:aload_0         
	//   63  171:invokestatic    #121 <Method void zza(HttpEntityEnclosingRequestBase, zzk)>
			return ((HttpUriRequest) (map));
	//   64  174:aload_1         
	//   65  175:areturn         

		case 2: // '\002'
			map = ((Map) (new HttpPut(zzk1.getUrl())));
	//   66  176:new             #123 <Class HttpPut>
	//   67  179:dup             
	//   68  180:aload_0         
	//   69  181:invokevirtual   #100 <Method String zzk.getUrl()>
	//   70  184:invokespecial   #124 <Method void HttpPut(String)>
	//   71  187:astore_1        
			((HttpPut) (map)).addHeader("Content-Type", zzk1.zzl());
	//   72  188:aload_1         
	//   73  189:ldc1            #103 <String "Content-Type">
	//   74  191:aload_0         
	//   75  192:invokevirtual   #119 <Method String zzk.zzl()>
	//   76  195:invokevirtual   #125 <Method void HttpPut.addHeader(String, String)>
			zza(((HttpEntityEnclosingRequestBase) (map)), zzk1);
	//   77  198:aload_1         
	//   78  199:aload_0         
	//   79  200:invokestatic    #121 <Method void zza(HttpEntityEnclosingRequestBase, zzk)>
			return ((HttpUriRequest) (map));
	//   80  203:aload_1         
	//   81  204:areturn         

		case 4: // '\004'
			return ((HttpUriRequest) (new HttpHead(zzk1.getUrl())));
	//   82  205:new             #127 <Class HttpHead>
	//   83  208:dup             
	//   84  209:aload_0         
	//   85  210:invokevirtual   #100 <Method String zzk.getUrl()>
	//   86  213:invokespecial   #128 <Method void HttpHead(String)>
	//   87  216:areturn         

		case 5: // '\005'
			return ((HttpUriRequest) (new HttpOptions(zzk1.getUrl())));
	//   88  217:new             #130 <Class HttpOptions>
	//   89  220:dup             
	//   90  221:aload_0         
	//   91  222:invokevirtual   #100 <Method String zzk.getUrl()>
	//   92  225:invokespecial   #131 <Method void HttpOptions(String)>
	//   93  228:areturn         

		case 6: // '\006'
			return ((HttpUriRequest) (new HttpTrace(zzk1.getUrl())));
	//   94  229:new             #133 <Class HttpTrace>
	//   95  232:dup             
	//   96  233:aload_0         
	//   97  234:invokevirtual   #100 <Method String zzk.getUrl()>
	//   98  237:invokespecial   #134 <Method void HttpTrace(String)>
	//   99  240:areturn         

		case 7: // '\007'
			map = ((Map) (new zza(zzk1.getUrl())));
	//  100  241:new             #8   <Class zzw$zza>
	//  101  244:dup             
	//  102  245:aload_0         
	//  103  246:invokevirtual   #100 <Method String zzk.getUrl()>
	//  104  249:invokespecial   #135 <Method void zzw$zza(String)>
	//  105  252:astore_1        
			((zza) (map)).addHeader("Content-Type", zzk1.zzl());
	//  106  253:aload_1         
	//  107  254:ldc1            #103 <String "Content-Type">
	//  108  256:aload_0         
	//  109  257:invokevirtual   #119 <Method String zzk.zzl()>
	//  110  260:invokevirtual   #136 <Method void zzw$zza.addHeader(String, String)>
			zza(((HttpEntityEnclosingRequestBase) (map)), zzk1);
	//  111  263:aload_1         
	//  112  264:aload_0         
	//  113  265:invokestatic    #121 <Method void zza(HttpEntityEnclosingRequestBase, zzk)>
			return ((HttpUriRequest) (map));
	//  114  268:aload_1         
	//  115  269:areturn         
		}
	}

	public HttpResponse zza(zzk zzk1, Map map)
		throws IOException, com.google.android.gms.internal.zza
	{
		HttpUriRequest httpurirequest = zzb(zzk1, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #142 <Method HttpUriRequest zzb(zzk, Map)>
	//    3    5:astore          4
		zza(httpurirequest, map);
	//    4    7:aload           4
	//    5    9:aload_2         
	//    6   10:invokestatic    #144 <Method void zza(HttpUriRequest, Map)>
		zza(httpurirequest, zzk1.getHeaders());
	//    7   13:aload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #148 <Method Map zzk.getHeaders()>
	//   10   19:invokestatic    #144 <Method void zza(HttpUriRequest, Map)>
		map = ((Map) (httpurirequest.getParams()));
	//   11   22:aload           4
	//   12   24:invokeinterface #152 <Method org.apache.http.params.HttpParams HttpUriRequest.getParams()>
	//   13   29:astore_2        
		int i = zzk1.zzp();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #155 <Method int zzk.zzp()>
	//   16   34:istore_3        
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (map)), 5000);
	//   17   35:aload_2         
	//   18   36:sipush          5000
	//   19   39:invokestatic    #161 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (map)), i);
	//   20   42:aload_2         
	//   21   43:iload_3         
	//   22   44:invokestatic    #164 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
		return zzaC.execute(httpurirequest);
	//   23   47:aload_0         
	//   24   48:getfield        #18  <Field HttpClient zzaC>
	//   25   51:aload           4
	//   26   53:invokeinterface #170 <Method HttpResponse HttpClient.execute(HttpUriRequest)>
	//   27   58:areturn         
	}

	protected final HttpClient zzaC;
}
