// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;

// Referenced classes of package com.android.volley.toolbox:
//			BaseHttpStack, HttpStack, HttpResponse

class AdaptedHttpStack extends BaseHttpStack
{

	AdaptedHttpStack(HttpStack httpstack)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BaseHttpStack()>
		mHttpStack = httpstack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field HttpStack mHttpStack>
	//    5    9:return          
	}

	public com.android.volley.toolbox.HttpResponse executeRequest(Request request, Map map)
		throws IOException, AuthFailureError
	{
		int j;
		int k;
		long l;
		ArrayList arraylist;
		try
		{
			request = ((Request) (mHttpStack.performRequest(request, map)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field HttpStack mHttpStack>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #28  <Method HttpResponse HttpStack.performRequest(Request, Map)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #34  <Method StatusLine HttpResponse.getStatusLine()>
	//*   8   18:invokeinterface #40  <Method int StatusLine.getStatusCode()>
	//*   9   23:istore          4
	//*  10   25:aload_1         
	//*  11   26:invokeinterface #44  <Method org.apache.http.Header[] HttpResponse.getAllHeaders()>
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
	//*  32   62:new             #51  <Class Header>
	//*  33   65:dup             
	//*  34   66:aload           9
	//*  35   68:invokeinterface #57  <Method String org.apache.http.Header.getName()>
	//*  36   73:aload           9
	//*  37   75:invokeinterface #60  <Method String org.apache.http.Header.getValue()>
	//*  38   80:invokespecial   #63  <Method void Header(String, String)>
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
	//*  49  105:new             #75  <Class com.android.volley.toolbox.HttpResponse>
	//*  50  108:dup             
	//*  51  109:iload           4
	//*  52  111:aload           8
	//*  53  113:invokespecial   #78  <Method void com.android.volley.toolbox.HttpResponse(int, List)>
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
	//*  64  137:ifne            175
	//*  65  140:new             #75  <Class com.android.volley.toolbox.HttpResponse>
	//*  66  143:dup             
	//*  67  144:iload           4
	//*  68  146:aload           8
	//*  69  148:aload_1         
	//*  70  149:invokeinterface #73  <Method HttpEntity HttpResponse.getEntity()>
	//*  71  154:invokeinterface #84  <Method long HttpEntity.getContentLength()>
	//*  72  159:l2i             
	//*  73  160:aload_1         
	//*  74  161:invokeinterface #73  <Method HttpEntity HttpResponse.getEntity()>
	//*  75  166:invokeinterface #88  <Method java.io.InputStream HttpEntity.getContent()>
	//*  76  171:invokespecial   #91  <Method void com.android.volley.toolbox.HttpResponse(int, List, int, java.io.InputStream)>
	//*  77  174:areturn         
	//*  78  175:new             #93  <Class StringBuilder>
	//*  79  178:dup             
	//*  80  179:invokespecial   #94  <Method void StringBuilder()>
	//*  81  182:astore_1        
	//*  82  183:aload_1         
	//*  83  184:ldc1            #96  <String "Response too large: ">
	//*  84  186:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//*  85  189:pop             
	//*  86  190:aload_1         
	//*  87  191:lload           6
	//*  88  193:invokevirtual   #103 <Method StringBuilder StringBuilder.append(long)>
	//*  89  196:pop             
	//*  90  197:new             #18  <Class IOException>
	//*  91  200:dup             
	//*  92  201:aload_1         
	//*  93  202:invokevirtual   #106 <Method String StringBuilder.toString()>
	//*  94  205:invokespecial   #109 <Method void IOException(String)>
	//*  95  208:athrow          
		// Misplaced declaration of an exception variable
		catch(Request request)
	//*  96  209:astore_1        
		{
			throw new SocketTimeoutException(((ConnectTimeoutException) (request)).getMessage());
	//   97  210:new             #111 <Class SocketTimeoutException>
	//   98  213:dup             
	//   99  214:aload_1         
	//  100  215:invokevirtual   #114 <Method String ConnectTimeoutException.getMessage()>
	//  101  218:invokespecial   #115 <Method void SocketTimeoutException(String)>
	//  102  221:athrow          
		}
		j = ((HttpResponse) (request)).getStatusLine().getStatusCode();
		map = ((Map) (((HttpResponse) (request)).getAllHeaders()));
		arraylist = new ArrayList(map.length);
		k = map.length;
		for(int i = 0; i < k; i++)
		{
			org.apache.http.Header header = ((org.apache.http.Header) (map[i]));
			((List) (arraylist)).add(((Object) (new Header(header.getName(), header.getValue()))));
		}

		if(((HttpResponse) (request)).getEntity() == null)
			return new com.android.volley.toolbox.HttpResponse(j, ((List) (arraylist)));
		l = ((HttpResponse) (request)).getEntity().getContentLength();
		if((long)(int)l == l)
		{
			return new com.android.volley.toolbox.HttpResponse(j, ((List) (arraylist)), (int)((HttpResponse) (request)).getEntity().getContentLength(), ((HttpResponse) (request)).getEntity().getContent());
		} else
		{
			request = ((Request) (new StringBuilder()));
			((StringBuilder) (request)).append("Response too large: ");
			((StringBuilder) (request)).append(l);
			throw new IOException(((StringBuilder) (request)).toString());
		}
	}

	private final HttpStack mHttpStack;
}
