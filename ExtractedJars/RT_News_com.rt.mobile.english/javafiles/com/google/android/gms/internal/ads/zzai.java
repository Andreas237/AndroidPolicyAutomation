// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.*;
import org.apache.http.*;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzar, zza, zzaq, zzl, 
//			zzr

public abstract class zzai
	implements zzar
{

	public zzai()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public abstract zzaq zza(zzr zzr, Map map)
		throws IOException, zza;

	public final HttpResponse zzb(zzr zzr, Map map)
		throws IOException, zza
	{
		zzr = ((zzr) (zza(zzr, map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #22  <Method zzaq zza(zzr, Map)>
	//    4    6:astore_1        
		map = ((Map) (new BasicHttpResponse(((org.apache.http.StatusLine) (new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), ((zzaq) (zzr)).getStatusCode(), ""))))));
	//    5    7:new             #24  <Class BasicHttpResponse>
	//    6   10:dup             
	//    7   11:new             #26  <Class BasicStatusLine>
	//    8   14:dup             
	//    9   15:new             #28  <Class ProtocolVersion>
	//   10   18:dup             
	//   11   19:ldc1            #30  <String "HTTP">
	//   12   21:iconst_1        
	//   13   22:iconst_1        
	//   14   23:invokespecial   #33  <Method void ProtocolVersion(String, int, int)>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #39  <Method int zzaq.getStatusCode()>
	//   17   30:ldc1            #41  <String "">
	//   18   32:invokespecial   #44  <Method void BasicStatusLine(ProtocolVersion, int, String)>
	//   19   35:invokespecial   #47  <Method void BasicHttpResponse(org.apache.http.StatusLine)>
	//   20   38:astore_2        
		Object obj = ((Object) (new ArrayList()));
	//   21   39:new             #49  <Class ArrayList>
	//   22   42:dup             
	//   23   43:invokespecial   #50  <Method void ArrayList()>
	//   24   46:astore_3        
		zzl zzl1;
		for(Iterator iterator = ((zzaq) (zzr)).zzq().iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (new BasicHeader(zzl1.getName(), zzl1.getValue())))))
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #54  <Method List zzaq.zzq()>
	//*  27   51:invokeinterface #60  <Method Iterator List.iterator()>
	//*  28   56:astore          4
	//*  29   58:aload           4
	//*  30   60:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//*  31   65:ifeq            107
			zzl1 = (zzl)iterator.next();
	//   32   68:aload           4
	//   33   70:invokeinterface #70  <Method Object Iterator.next()>
	//   34   75:checkcast       #72  <Class zzl>
	//   35   78:astore          5

	//   36   80:aload_3         
	//   37   81:new             #74  <Class BasicHeader>
	//   38   84:dup             
	//   39   85:aload           5
	//   40   87:invokevirtual   #78  <Method String zzl.getName()>
	//   41   90:aload           5
	//   42   92:invokevirtual   #81  <Method String zzl.getValue()>
	//   43   95:invokespecial   #84  <Method void BasicHeader(String, String)>
	//   44   98:invokeinterface #88  <Method boolean List.add(Object)>
	//   45  103:pop             
	//*  46  104:goto            58
		((BasicHttpResponse) (map)).setHeaders((Header[])((List) (obj)).toArray(((Object []) (new Header[((List) (obj)).size()]))));
	//   47  107:aload_2         
	//   48  108:aload_3         
	//   49  109:aload_3         
	//   50  110:invokeinterface #91  <Method int List.size()>
	//   51  115:anewarray       Header[]
	//   52  118:invokeinterface #97  <Method Object[] List.toArray(Object[])>
	//   53  123:checkcast       #99  <Class Header[]>
	//   54  126:invokevirtual   #103 <Method void BasicHttpResponse.setHeaders(Header[])>
		obj = ((Object) (((zzaq) (zzr)).getContent()));
	//   55  129:aload_1         
	//   56  130:invokevirtual   #107 <Method java.io.InputStream zzaq.getContent()>
	//   57  133:astore_3        
		if(obj != null)
	//*  58  134:aload_3         
	//*  59  135:ifnull          169
		{
			BasicHttpEntity basichttpentity = new BasicHttpEntity();
	//   60  138:new             #109 <Class BasicHttpEntity>
	//   61  141:dup             
	//   62  142:invokespecial   #110 <Method void BasicHttpEntity()>
	//   63  145:astore          4
			basichttpentity.setContent(((java.io.InputStream) (obj)));
	//   64  147:aload           4
	//   65  149:aload_3         
	//   66  150:invokevirtual   #114 <Method void BasicHttpEntity.setContent(java.io.InputStream)>
			basichttpentity.setContentLength(((zzaq) (zzr)).getContentLength());
	//   67  153:aload           4
	//   68  155:aload_1         
	//   69  156:invokevirtual   #117 <Method int zzaq.getContentLength()>
	//   70  159:i2l             
	//   71  160:invokevirtual   #121 <Method void BasicHttpEntity.setContentLength(long)>
			((BasicHttpResponse) (map)).setEntity(((org.apache.http.HttpEntity) (basichttpentity)));
	//   72  163:aload_2         
	//   73  164:aload           4
	//   74  166:invokevirtual   #125 <Method void BasicHttpResponse.setEntity(org.apache.http.HttpEntity)>
		}
		return ((HttpResponse) (map));
	//   75  169:aload_2         
	//   76  170:areturn         
	}
}
