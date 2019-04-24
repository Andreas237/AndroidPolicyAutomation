// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.*;
import org.apache.http.*;
import org.apache.http.conn.ConnectTimeoutException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzai, zza, zzar, zzl, 
//			zzaq, zzr

final class zzah extends zzai
{

	zzah(zzar zzar1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzai()>
		zzbo = zzar1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zzar zzbo>
	//    5    9:return          
	}

	public final zzaq zza(zzr zzr, Map map)
		throws IOException, zza
	{
		int j;
		int k;
		long l;
		ArrayList arraylist;
		try
		{
			zzr = ((zzr) (zzbo.zzb(zzr, map)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzar zzbo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #28  <Method HttpResponse zzar.zzb(zzr, Map)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #34  <Method StatusLine HttpResponse.getStatusLine()>
	//*   8   18:invokeinterface #40  <Method int StatusLine.getStatusCode()>
	//*   9   23:istore          4
	//*  10   25:aload_1         
	//*  11   26:invokeinterface #44  <Method Header[] HttpResponse.getAllHeaders()>
	//*  12   31:astore_2        
	//*  13   32:new             #46  <Class ArrayList>
	//*  14   35:dup             
	//*  15   36:aload_2         
	//*  16   37:arraylength     
	//*  17   38:invokespecial   #49  <Method void ArrayList(int)>
	//*  18   41:astore          8
	//*  19   43:aload_2         
	//*  20   44:arraylength     
	//*  21   45:istore          5
	//*  22   47:iconst_0        
	//*  23   48:istore_3        
	//*  24   49:iload_3         
	//*  25   50:iload           5
	//*  26   52:icmpge          96
	//*  27   55:aload_2         
	//*  28   56:iload_3         
	//*  29   57:aaload          
	//*  30   58:astore          9
	//*  31   60:aload           8
	//*  32   62:new             #51  <Class zzl>
	//*  33   65:dup             
	//*  34   66:aload           9
	//*  35   68:invokeinterface #57  <Method String Header.getName()>
	//*  36   73:aload           9
	//*  37   75:invokeinterface #60  <Method String Header.getValue()>
	//*  38   80:invokespecial   #63  <Method void zzl(String, String)>
	//*  39   83:invokeinterface #69  <Method boolean List.add(Object)>
	//*  40   88:pop             
	//*  41   89:iload_3         
	//*  42   90:iconst_1        
	//*  43   91:iadd            
	//*  44   92:istore_3        
	//*  45   93:goto            49
	//*  46   96:aload_1         
	//*  47   97:invokeinterface #73  <Method HttpEntity HttpResponse.getEntity()>
	//*  48  102:ifnonnull       117
	//*  49  105:new             #75  <Class zzaq>
	//*  50  108:dup             
	//*  51  109:iload           4
	//*  52  111:aload           8
	//*  53  113:invokespecial   #78  <Method void zzaq(int, List)>
	//*  54  116:areturn         
	//*  55  117:aload_1         
	//*  56  118:invokeinterface #73  <Method HttpEntity HttpResponse.getEntity()>
	//*  57  123:invokeinterface #84  <Method long HttpEntity.getContentLength()>
	//*  58  128:lstore          6
	//*  59  130:lload           6
	//*  60  132:l2i             
	//*  61  133:i2l             
	//*  62  134:lload           6
	//*  63  136:lcmp            
	//*  64  137:ifeq            176
	//*  65  140:new             #86  <Class StringBuilder>
	//*  66  143:dup             
	//*  67  144:bipush          40
	//*  68  146:invokespecial   #87  <Method void StringBuilder(int)>
	//*  69  149:astore_1        
	//*  70  150:aload_1         
	//*  71  151:ldc1            #89  <String "Response too large: ">
	//*  72  153:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  73  156:pop             
	//*  74  157:aload_1         
	//*  75  158:lload           6
	//*  76  160:invokevirtual   #96  <Method StringBuilder StringBuilder.append(long)>
	//*  77  163:pop             
	//*  78  164:new             #18  <Class IOException>
	//*  79  167:dup             
	//*  80  168:aload_1         
	//*  81  169:invokevirtual   #99  <Method String StringBuilder.toString()>
	//*  82  172:invokespecial   #102 <Method void IOException(String)>
	//*  83  175:athrow          
	//*  84  176:new             #75  <Class zzaq>
	//*  85  179:dup             
	//*  86  180:iload           4
	//*  87  182:aload           8
	//*  88  184:aload_1         
	//*  89  185:invokeinterface #73  <Method HttpEntity HttpResponse.getEntity()>
	//*  90  190:invokeinterface #84  <Method long HttpEntity.getContentLength()>
	//*  91  195:l2i             
	//*  92  196:aload_1         
	//*  93  197:invokeinterface #73  <Method HttpEntity HttpResponse.getEntity()>
	//*  94  202:invokeinterface #106 <Method java.io.InputStream HttpEntity.getContent()>
	//*  95  207:invokespecial   #109 <Method void zzaq(int, List, int, java.io.InputStream)>
	//*  96  210:areturn         
		// Misplaced declaration of an exception variable
		catch(zzr zzr)
	//*  97  211:astore_1        
		{
			throw new SocketTimeoutException(((ConnectTimeoutException) (zzr)).getMessage());
	//   98  212:new             #111 <Class SocketTimeoutException>
	//   99  215:dup             
	//  100  216:aload_1         
	//  101  217:invokevirtual   #114 <Method String ConnectTimeoutException.getMessage()>
	//  102  220:invokespecial   #115 <Method void SocketTimeoutException(String)>
	//  103  223:athrow          
		}
		j = ((HttpResponse) (zzr)).getStatusLine().getStatusCode();
		map = ((Map) (((HttpResponse) (zzr)).getAllHeaders()));
		arraylist = new ArrayList(map.length);
		k = map.length;
		for(int i = 0; i < k; i++)
		{
			Header header = ((Header) (map[i]));
			((List) (arraylist)).add(((Object) (new zzl(header.getName(), header.getValue()))));
		}

		if(((HttpResponse) (zzr)).getEntity() == null)
			return new zzaq(j, ((List) (arraylist)));
		l = ((HttpResponse) (zzr)).getEntity().getContentLength();
		if((long)(int)l != l)
		{
			zzr = ((zzr) (new StringBuilder(40)));
			((StringBuilder) (zzr)).append("Response too large: ");
			((StringBuilder) (zzr)).append(l);
			throw new IOException(((StringBuilder) (zzr)).toString());
		} else
		{
			return new zzaq(j, ((List) (arraylist)), (int)((HttpResponse) (zzr)).getEntity().getContentLength(), ((HttpResponse) (zzr)).getEntity().getContent());
		}
	}

	private final zzar zzbo;
}
