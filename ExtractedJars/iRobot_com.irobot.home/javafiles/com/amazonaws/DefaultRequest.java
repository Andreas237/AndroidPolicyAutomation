// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import java.io.InputStream;
import java.net.URI;
import java.util.*;

// Referenced classes of package com.amazonaws:
//			Request, AmazonWebServiceRequest

public class DefaultRequest
	implements Request
{

	public DefaultRequest(AmazonWebServiceRequest amazonwebservicerequest, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = ((Map) (new LinkedHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #31  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void LinkedHashMap()>
	//    6   12:putfield        #34  <Field Map b>
		c = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #36  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void HashMap()>
	//   11   23:putfield        #39  <Field Map c>
		g = HttpMethodName.POST;
	//   12   26:aload_0         
	//   13   27:getstatic       #44  <Field HttpMethodName HttpMethodName.POST>
	//   14   30:putfield        #46  <Field HttpMethodName g>
		e = s;
	//   15   33:aload_0         
	//   16   34:aload_2         
	//   17   35:putfield        #48  <Field String e>
		f = amazonwebservicerequest;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #50  <Field AmazonWebServiceRequest f>
	//   21   43:return          
	}

	public DefaultRequest(String s)
	{
		this(((AmazonWebServiceRequest) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #54  <Method void DefaultRequest(AmazonWebServiceRequest, String)>
	//    4    6:return          
	}

	public Map a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map c>
	//    2    4:areturn         
	}

	public void a(int j)
	{
		i = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int i>
	//    3    5:return          
	}

	public void a(HttpMethodName httpmethodname)
	{
		g = httpmethodname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field HttpMethodName g>
	//    3    5:return          
	}

	public void a(InputStream inputstream)
	{
		h = inputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field InputStream h>
	//    3    5:return          
	}

	public void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String a>
	//    3    5:return          
	}

	public void a(String s, String s1)
	{
		c.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map c>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void a(URI uri)
	{
		d = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field URI d>
	//    3    5:return          
	}

	public String b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String a>
	//    2    4:areturn         
	}

	public void b(String s, String s1)
	{
		b.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Map b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public Map c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Map b>
	//    2    4:areturn         
	}

	public HttpMethodName d()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field HttpMethodName g>
	//    2    4:areturn         
	}

	public URI e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field URI d>
	//    2    4:areturn         
	}

	public InputStream f()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field InputStream h>
	//    2    4:areturn         
	}

	public int g()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int i>
	//    2    4:ireturn         
	}

	public String toString()
	{
		String s1;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(((Object) (d())));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #87  <Method HttpMethodName d()>
	//    7   13:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(" ");
	//    9   17:aload_3         
	//   10   18:ldc1            #93  <String " ">
	//   11   20:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (e())));
	//   13   24:aload_3         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #98  <Method URI e()>
	//   16   29:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append(" ");
	//   18   33:aload_3         
	//   19   34:ldc1            #93  <String " ">
	//   20   36:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		s1 = b();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #100 <Method String b()>
	//   24   44:astore_2        
		if(s1 != null) goto _L2; else goto _L1
	//   25   45:aload_2         
	//   26   46:ifnonnull       61
_L1:
		String s = "/";
	//   27   49:ldc1            #102 <String "/">
	//   28   51:astore_1        
_L4:
		stringbuilder.append(s);
	//   29   52:aload_3         
	//   30   53:aload_1         
	//   31   54:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   32   57:pop             
		break; /* Loop/switch isn't completed */
	//   33   58:goto            84
_L2:
		s = s1;
	//   34   61:aload_2         
	//   35   62:astore_1        
		if(!s1.startsWith("/"))
	//*  36   63:aload_2         
	//*  37   64:ldc1            #102 <String "/">
	//*  38   66:invokevirtual   #108 <Method boolean String.startsWith(String)>
	//*  39   69:ifne            52
		{
			stringbuilder.append("/");
	//   40   72:aload_3         
	//   41   73:ldc1            #102 <String "/">
	//   42   75:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
			s = s1;
	//   44   79:aload_2         
	//   45   80:astore_1        
		}
		if(true) goto _L4; else goto _L3
	//   46   81:goto            52
_L3:
		stringbuilder.append(" ");
	//   47   84:aload_3         
	//   48   85:ldc1            #93  <String " ">
	//   49   87:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
		if(!c().isEmpty())
	//*  51   91:aload_0         
	//*  52   92:invokevirtual   #110 <Method Map c()>
	//*  53   95:invokeinterface #114 <Method boolean Map.isEmpty()>
	//*  54  100:ifne            196
		{
			stringbuilder.append("Parameters: (");
	//   55  103:aload_3         
	//   56  104:ldc1            #116 <String "Parameters: (">
	//   57  106:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   58  109:pop             
			for(Iterator iterator = c().keySet().iterator(); iterator.hasNext(); stringbuilder.append(", "))
	//*  59  110:aload_0         
	//*  60  111:invokevirtual   #110 <Method Map c()>
	//*  61  114:invokeinterface #120 <Method Set Map.keySet()>
	//*  62  119:invokeinterface #126 <Method Iterator Set.iterator()>
	//*  63  124:astore_1        
	//*  64  125:aload_1         
	//*  65  126:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*  66  131:ifeq            189
			{
				String s2 = (String)iterator.next();
	//   67  134:aload_1         
	//   68  135:invokeinterface #135 <Method Object Iterator.next()>
	//   69  140:checkcast       #104 <Class String>
	//   70  143:astore_2        
				String s4 = (String)c().get(((Object) (s2)));
	//   71  144:aload_0         
	//   72  145:invokevirtual   #110 <Method Map c()>
	//   73  148:aload_2         
	//   74  149:invokeinterface #139 <Method Object Map.get(Object)>
	//   75  154:checkcast       #104 <Class String>
	//   76  157:astore          4
				stringbuilder.append(s2);
	//   77  159:aload_3         
	//   78  160:aload_2         
	//   79  161:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
				stringbuilder.append(": ");
	//   81  165:aload_3         
	//   82  166:ldc1            #141 <String ": ">
	//   83  168:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   84  171:pop             
				stringbuilder.append(s4);
	//   85  172:aload_3         
	//   86  173:aload           4
	//   87  175:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   88  178:pop             
			}

	//   89  179:aload_3         
	//   90  180:ldc1            #143 <String ", ">
	//   91  182:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   92  185:pop             
	//*  93  186:goto            125
			stringbuilder.append(") ");
	//   94  189:aload_3         
	//   95  190:ldc1            #145 <String ") ">
	//   96  192:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   97  195:pop             
		}
		if(!a().isEmpty())
	//*  98  196:aload_0         
	//*  99  197:invokevirtual   #147 <Method Map a()>
	//* 100  200:invokeinterface #114 <Method boolean Map.isEmpty()>
	//* 101  205:ifne            301
		{
			stringbuilder.append("Headers: (");
	//  102  208:aload_3         
	//  103  209:ldc1            #149 <String "Headers: (">
	//  104  211:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  105  214:pop             
			for(Iterator iterator1 = a().keySet().iterator(); iterator1.hasNext(); stringbuilder.append(", "))
	//* 106  215:aload_0         
	//* 107  216:invokevirtual   #147 <Method Map a()>
	//* 108  219:invokeinterface #120 <Method Set Map.keySet()>
	//* 109  224:invokeinterface #126 <Method Iterator Set.iterator()>
	//* 110  229:astore_1        
	//* 111  230:aload_1         
	//* 112  231:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//* 113  236:ifeq            294
			{
				String s3 = (String)iterator1.next();
	//  114  239:aload_1         
	//  115  240:invokeinterface #135 <Method Object Iterator.next()>
	//  116  245:checkcast       #104 <Class String>
	//  117  248:astore_2        
				String s5 = (String)a().get(((Object) (s3)));
	//  118  249:aload_0         
	//  119  250:invokevirtual   #147 <Method Map a()>
	//  120  253:aload_2         
	//  121  254:invokeinterface #139 <Method Object Map.get(Object)>
	//  122  259:checkcast       #104 <Class String>
	//  123  262:astore          4
				stringbuilder.append(s3);
	//  124  264:aload_3         
	//  125  265:aload_2         
	//  126  266:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  127  269:pop             
				stringbuilder.append(": ");
	//  128  270:aload_3         
	//  129  271:ldc1            #141 <String ": ">
	//  130  273:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  131  276:pop             
				stringbuilder.append(s5);
	//  132  277:aload_3         
	//  133  278:aload           4
	//  134  280:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  135  283:pop             
			}

	//  136  284:aload_3         
	//  137  285:ldc1            #143 <String ", ">
	//  138  287:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  139  290:pop             
	//* 140  291:goto            230
			stringbuilder.append(") ");
	//  141  294:aload_3         
	//  142  295:ldc1            #145 <String ") ">
	//  143  297:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  144  300:pop             
		}
		return stringbuilder.toString();
	//  145  301:aload_3         
	//  146  302:invokevirtual   #151 <Method String StringBuilder.toString()>
	//  147  305:areturn         
	}

	private String a;
	private Map b;
	private Map c;
	private URI d;
	private String e;
	private final AmazonWebServiceRequest f;
	private HttpMethodName g;
	private InputStream h;
	private int i;
}
