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
//			hc, qa, bim, oz, 
//			boq

final class gb extends hc
{

	gb(qa qa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void hc()>
		a = qa1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field qa a>
	//    5    9:return          
	}

	public final oz a(boq boq, Map map)
	{
		int j;
		int k;
		long l;
		ArrayList arraylist;
		try
		{
			boq = ((boq) (a.b(boq, map)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field qa a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #23  <Method HttpResponse qa.b(boq, Map)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #29  <Method StatusLine HttpResponse.getStatusLine()>
	//*   8   18:invokeinterface #35  <Method int StatusLine.getStatusCode()>
	//*   9   23:istore          4
	//*  10   25:aload_1         
	//*  11   26:invokeinterface #39  <Method Header[] HttpResponse.getAllHeaders()>
	//*  12   31:astore_2        
	//*  13   32:new             #41  <Class ArrayList>
	//*  14   35:dup             
	//*  15   36:aload_2         
	//*  16   37:arraylength     
	//*  17   38:invokespecial   #44  <Method void ArrayList(int)>
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
	//*  32   62:new             #46  <Class bim>
	//*  33   65:dup             
	//*  34   66:aload           9
	//*  35   68:invokeinterface #52  <Method String Header.getName()>
	//*  36   73:aload           9
	//*  37   75:invokeinterface #55  <Method String Header.getValue()>
	//*  38   80:invokespecial   #58  <Method void bim(String, String)>
	//*  39   83:invokeinterface #64  <Method boolean List.add(Object)>
	//*  40   88:pop             
	//*  41   89:iload_3         
	//*  42   90:iconst_1        
	//*  43   91:iadd            
	//*  44   92:istore_3        
	//*  45   93:goto            49
	//*  46   96:aload_1         
	//*  47   97:invokeinterface #68  <Method HttpEntity HttpResponse.getEntity()>
	//*  48  102:ifnonnull       117
	//*  49  105:new             #70  <Class oz>
	//*  50  108:dup             
	//*  51  109:iload           4
	//*  52  111:aload           8
	//*  53  113:invokespecial   #73  <Method void oz(int, List)>
	//*  54  116:areturn         
	//*  55  117:aload_1         
	//*  56  118:invokeinterface #68  <Method HttpEntity HttpResponse.getEntity()>
	//*  57  123:invokeinterface #79  <Method long HttpEntity.getContentLength()>
	//*  58  128:lstore          6
	//*  59  130:lload           6
	//*  60  132:l2i             
	//*  61  133:i2l             
	//*  62  134:lload           6
	//*  63  136:lcmp            
	//*  64  137:ifne            175
	//*  65  140:new             #70  <Class oz>
	//*  66  143:dup             
	//*  67  144:iload           4
	//*  68  146:aload           8
	//*  69  148:aload_1         
	//*  70  149:invokeinterface #68  <Method HttpEntity HttpResponse.getEntity()>
	//*  71  154:invokeinterface #79  <Method long HttpEntity.getContentLength()>
	//*  72  159:l2i             
	//*  73  160:aload_1         
	//*  74  161:invokeinterface #68  <Method HttpEntity HttpResponse.getEntity()>
	//*  75  166:invokeinterface #83  <Method java.io.InputStream HttpEntity.getContent()>
	//*  76  171:invokespecial   #86  <Method void oz(int, List, int, java.io.InputStream)>
	//*  77  174:areturn         
	//*  78  175:new             #88  <Class StringBuilder>
	//*  79  178:dup             
	//*  80  179:bipush          40
	//*  81  181:invokespecial   #89  <Method void StringBuilder(int)>
	//*  82  184:astore_1        
	//*  83  185:aload_1         
	//*  84  186:ldc1            #91  <String "Response too large: ">
	//*  85  188:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  86  191:pop             
	//*  87  192:aload_1         
	//*  88  193:lload           6
	//*  89  195:invokevirtual   #98  <Method StringBuilder StringBuilder.append(long)>
	//*  90  198:pop             
	//*  91  199:new             #100 <Class IOException>
	//*  92  202:dup             
	//*  93  203:aload_1         
	//*  94  204:invokevirtual   #103 <Method String StringBuilder.toString()>
	//*  95  207:invokespecial   #106 <Method void IOException(String)>
	//*  96  210:athrow          
		// Misplaced declaration of an exception variable
		catch(boq boq)
	//*  97  211:astore_1        
		{
			throw new SocketTimeoutException(((ConnectTimeoutException) (boq)).getMessage());
	//   98  212:new             #108 <Class SocketTimeoutException>
	//   99  215:dup             
	//  100  216:aload_1         
	//  101  217:invokevirtual   #111 <Method String ConnectTimeoutException.getMessage()>
	//  102  220:invokespecial   #112 <Method void SocketTimeoutException(String)>
	//  103  223:athrow          
		}
		j = ((HttpResponse) (boq)).getStatusLine().getStatusCode();
		map = ((Map) (((HttpResponse) (boq)).getAllHeaders()));
		arraylist = new ArrayList(map.length);
		k = map.length;
		for(int i = 0; i < k; i++)
		{
			Header header = ((Header) (map[i]));
			((List) (arraylist)).add(((Object) (new bim(header.getName(), header.getValue()))));
		}

		if(((HttpResponse) (boq)).getEntity() == null)
			return new oz(j, ((List) (arraylist)));
		l = ((HttpResponse) (boq)).getEntity().getContentLength();
		if((long)(int)l == l)
		{
			return new oz(j, ((List) (arraylist)), (int)((HttpResponse) (boq)).getEntity().getContentLength(), ((HttpResponse) (boq)).getEntity().getContent());
		} else
		{
			boq = ((boq) (new StringBuilder(40)));
			((StringBuilder) (boq)).append("Response too large: ");
			((StringBuilder) (boq)).append(l);
			throw new IOException(((StringBuilder) (boq)).toString());
		}
	}

	private final qa a;
}
