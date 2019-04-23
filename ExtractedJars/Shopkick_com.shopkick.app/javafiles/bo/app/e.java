// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.net.URI;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			d, dt

final class e
	implements d
{

	public e(d d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = d1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field d b>
	//    5    9:return          
	}

	private String a(Map map)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #30  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ArrayList()>
	//    3    7:astore_2        
		StringBuilder stringbuilder;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((List) (obj)).add(((Object) (stringbuilder.toString()))))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #37  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #43  <Method Iterator Set.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            117
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_1         
	//   12   30:invokeinterface #53  <Method Object Iterator.next()>
	//   13   35:checkcast       #55  <Class java.util.Map$Entry>
	//   14   38:astore_3        
			stringbuilder = new StringBuilder();
	//   15   39:new             #57  <Class StringBuilder>
	//   16   42:dup             
	//   17   43:invokespecial   #58  <Method void StringBuilder()>
	//   18   46:astore          4
			stringbuilder.append("(");
	//   19   48:aload           4
	//   20   50:ldc1            #60  <String "(">
	//   21   52:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   22   55:pop             
			stringbuilder.append((String)entry.getKey());
	//   23   56:aload           4
	//   24   58:aload_3         
	//   25   59:invokeinterface #67  <Method Object java.util.Map$Entry.getKey()>
	//   26   64:checkcast       #69  <Class String>
	//   27   67:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28   70:pop             
			stringbuilder.append(" / ");
	//   29   71:aload           4
	//   30   73:ldc1            #71  <String " / ">
	//   31   75:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   32   78:pop             
			stringbuilder.append((String)entry.getValue());
	//   33   79:aload           4
	//   34   81:aload_3         
	//   35   82:invokeinterface #74  <Method Object java.util.Map$Entry.getValue()>
	//   36   87:checkcast       #69  <Class String>
	//   37   90:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   38   93:pop             
			stringbuilder.append(")");
	//   39   94:aload           4
	//   40   96:ldc1            #76  <String ")">
	//   41   98:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   42  101:pop             
		}

	//   43  102:aload_2         
	//   44  103:aload           4
	//   45  105:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   46  108:invokeinterface #86  <Method boolean List.add(Object)>
	//   47  113:pop             
	//*  48  114:goto            20
		map = ((Map) (new StringBuilder()));
	//   49  117:new             #57  <Class StringBuilder>
	//   50  120:dup             
	//   51  121:invokespecial   #58  <Method void StringBuilder()>
	//   52  124:astore_1        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((StringBuilder) (map)).append(", "))
	//*  53  125:aload_2         
	//*  54  126:invokeinterface #87  <Method Iterator List.iterator()>
	//*  55  131:astore_2        
	//*  56  132:aload_2         
	//*  57  133:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  58  138:ifeq            165
			((StringBuilder) (map)).append((String)((Iterator) (obj)).next());
	//   59  141:aload_1         
	//   60  142:aload_2         
	//   61  143:invokeinterface #53  <Method Object Iterator.next()>
	//   62  148:checkcast       #69  <Class String>
	//   63  151:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   64  154:pop             

	//   65  155:aload_1         
	//   66  156:ldc1            #89  <String ", ">
	//   67  158:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   68  161:pop             
	//*  69  162:goto            132
		if(((StringBuilder) (map)).length() == 0)
	//*  70  165:aload_1         
	//*  71  166:invokevirtual   #93  <Method int StringBuilder.length()>
	//*  72  169:ifne            175
			return "";
	//   73  172:ldc1            #95  <String "">
	//   74  174:areturn         
		else
			return ((StringBuilder) (map)).substring(0, ((StringBuilder) (map)).length() - 2);
	//   75  175:aload_1         
	//   76  176:iconst_0        
	//   77  177:aload_1         
	//   78  178:invokevirtual   #93  <Method int StringBuilder.length()>
	//   79  181:iconst_2        
	//   80  182:isub            
	//   81  183:invokevirtual   #99  <Method String StringBuilder.substring(int, int)>
	//   82  186:areturn         
	}

	private void a(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			jsonobject = "none";
	//    2    4:ldc1            #106 <String "none">
	//    3    6:astore_1        
			break MISSING_BLOCK_LABEL_15;
	//    4    7:goto            15
		}
		jsonobject = ((JSONObject) (dt.a(jsonobject)));
	//    5   10:aload_1         
	//    6   11:invokestatic    #111 <Method String dt.a(JSONObject)>
	//    7   14:astore_1        
		String s = a;
	//    8   15:getstatic       #20  <Field String a>
	//    9   18:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #57  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #58  <Method void StringBuilder()>
	//   13   26:astore_3        
		stringbuilder.append("Result [");
	//   14   27:aload_3         
	//   15   28:ldc1            #113 <String "Result [">
	//   16   30:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((String) (jsonobject)));
	//   18   34:aload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("]");
	//   22   40:aload_3         
	//   23   41:ldc1            #115 <String "]">
	//   24   43:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   26   47:aload_2         
	//   27   48:aload_3         
	//   28   49:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   29   52:invokestatic    #119 <Method int AppboyLogger.d(String, String)>
	//   30   55:pop             
		return;
	//   31   56:return          
		jsonobject;
	//   32   57:astore_1        
		AppboyLogger.d(a, "Exception while logging result: ", ((Throwable) (jsonobject)));
	//   33   58:getstatic       #20  <Field String a>
	//   34   61:ldc1            #121 <String "Exception while logging result: ">
	//   35   63:aload_1         
	//   36   64:invokestatic    #124 <Method int AppboyLogger.d(String, String, Throwable)>
	//   37   67:pop             
		return;
	//   38   68:return          
	}

	private void b(URI uri, Map map)
	{
		try
		{
			String s = a;
	//    0    0:getstatic       #20  <Field String a>
	//    1    3:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #57  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:astore          4
			stringbuilder.append("Making request to [");
	//    6   13:aload           4
	//    7   15:ldc1            #127 <String "Making request to [">
	//    8   17:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(uri.toString());
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:invokevirtual   #130 <Method String URI.toString()>
	//   13   27:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append("], with headers: [");
	//   15   31:aload           4
	//   16   33:ldc1            #132 <String "], with headers: [">
	//   17   35:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(a(map));
	//   19   39:aload           4
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:invokespecial   #134 <Method String a(Map)>
	//   23   46:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			stringbuilder.append("]");
	//   25   50:aload           4
	//   26   52:ldc1            #115 <String "]">
	//   27   54:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   29   58:aload_3         
	//   30   59:aload           4
	//   31   61:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   32   64:invokestatic    #119 <Method int AppboyLogger.d(String, String)>
	//   33   67:pop             
			return;
	//   34   68:return          
		}
		// Misplaced declaration of an exception variable
		catch(URI uri)
	//*  35   69:astore_1        
		{
			AppboyLogger.d(a, "Exception while logging request: ", ((Throwable) (uri)));
	//   36   70:getstatic       #20  <Field String a>
	//   37   73:ldc1            #136 <String "Exception while logging request: ">
	//   38   75:aload_1         
	//   39   76:invokestatic    #124 <Method int AppboyLogger.d(String, String, Throwable)>
	//   40   79:pop             
		}
	//   41   80:return          
	}

	private void b(URI uri, Map map, JSONObject jsonobject)
	{
		try
		{
			String s = a;
	//    0    0:getstatic       #20  <Field String a>
	//    1    3:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #57  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #58  <Method void StringBuilder()>
	//    5   12:astore          5
			stringbuilder.append("Making request to [");
	//    6   14:aload           5
	//    7   16:ldc1            #127 <String "Making request to [">
	//    8   18:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(uri.toString());
	//   10   22:aload           5
	//   11   24:aload_1         
	//   12   25:invokevirtual   #130 <Method String URI.toString()>
	//   13   28:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
			stringbuilder.append("], with headers: [");
	//   15   32:aload           5
	//   16   34:ldc1            #132 <String "], with headers: [">
	//   17   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
			stringbuilder.append(a(map));
	//   19   40:aload           5
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:invokespecial   #134 <Method String a(Map)>
	//   23   47:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			stringbuilder.append("] and JSON parameters: [");
	//   25   51:aload           5
	//   26   53:ldc1            #140 <String "] and JSON parameters: [">
	//   27   55:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			stringbuilder.append(dt.a(jsonobject));
	//   29   59:aload           5
	//   30   61:aload_3         
	//   31   62:invokestatic    #111 <Method String dt.a(JSONObject)>
	//   32   65:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
			stringbuilder.append("]");
	//   34   69:aload           5
	//   35   71:ldc1            #115 <String "]">
	//   36   73:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   38   77:aload           4
	//   39   79:aload           5
	//   40   81:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   41   84:invokestatic    #119 <Method int AppboyLogger.d(String, String)>
	//   42   87:pop             
			return;
	//   43   88:return          
		}
		// Misplaced declaration of an exception variable
		catch(URI uri)
	//*  44   89:astore_1        
		{
			AppboyLogger.d(a, "Exception while logging request: ", ((Throwable) (uri)));
	//   45   90:getstatic       #20  <Field String a>
	//   46   93:ldc1            #136 <String "Exception while logging request: ">
	//   47   95:aload_1         
	//   48   96:invokestatic    #124 <Method int AppboyLogger.d(String, String, Throwable)>
	//   49   99:pop             
		}
	//   50  100:return          
	}

	public JSONObject a(URI uri, Map map)
	{
		b(uri, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #144 <Method void b(URI, Map)>
		uri = ((URI) (b.a(uri, map)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field d b>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #146 <Method JSONObject d.a(URI, Map)>
	//    9   17:astore_1        
		a(((JSONObject) (uri)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #148 <Method void a(JSONObject)>
		return ((JSONObject) (uri));
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public JSONObject a(URI uri, Map map, JSONObject jsonobject)
	{
		b(uri, map, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #152 <Method void b(URI, Map, JSONObject)>
		uri = ((URI) (b.a(uri, map, jsonobject)));
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field d b>
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokeinterface #154 <Method JSONObject d.a(URI, Map, JSONObject)>
	//   11   19:astore_1        
		a(((JSONObject) (uri)));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokespecial   #148 <Method void a(JSONObject)>
		return ((JSONObject) (uri));
	//   15   25:aload_1         
	//   16   26:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/e);
	private final d b;

	static 
	{
	//    0    0:ldc1            #2   <Class e>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
