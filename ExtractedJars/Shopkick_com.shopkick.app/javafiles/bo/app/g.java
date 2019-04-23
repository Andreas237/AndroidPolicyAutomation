// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			d, v

final class g
	implements d
{

	public g(d d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = d1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field d b>
	//    5    9:return          
	}

	public JSONObject a(URI uri, Map map)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #34  <Method long System.currentTimeMillis()>
	//    1    3:lstore_3        
		map = ((Map) (b.a(uri, map)));
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field d b>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #36  <Method JSONObject d.a(URI, Map)>
	//    7   15:astore_2        
		long l1 = System.currentTimeMillis();
	//    8   16:invokestatic    #34  <Method long System.currentTimeMillis()>
	//    9   19:lstore          5
		String s = a;
	//   10   21:getstatic       #20  <Field String a>
	//   11   24:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   12   26:new             #38  <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #39  <Method void StringBuilder()>
	//   15   33:astore          8
		stringbuilder.append("Request Executed in [");
	//   16   35:aload           8
	//   17   37:ldc1            #41  <String "Request Executed in [">
	//   18   39:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
		stringbuilder.append(l1 - l);
	//   20   43:aload           8
	//   21   45:lload           5
	//   22   47:lload_3         
	//   23   48:lsub            
	//   24   49:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   25   52:pop             
		stringbuilder.append("ms] [");
	//   26   53:aload           8
	//   27   55:ldc1            #50  <String "ms] [">
	//   28   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(v.a.toString());
	//   30   61:aload           8
	//   31   63:getstatic       #55  <Field v v.a>
	//   32   66:invokevirtual   #59  <Method String v.toString()>
	//   33   69:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(":");
	//   35   73:aload           8
	//   36   75:ldc1            #61  <String ":">
	//   37   77:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
		stringbuilder.append(uri.toString());
	//   39   81:aload           8
	//   40   83:aload_1         
	//   41   84:invokevirtual   #64  <Method String URI.toString()>
	//   42   87:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   43   90:pop             
		stringbuilder.append("]");
	//   44   91:aload           8
	//   45   93:ldc1            #66  <String "]">
	//   46   95:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   47   98:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   48   99:aload           7
	//   49  101:aload           8
	//   50  103:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   51  106:invokestatic    #71  <Method int AppboyLogger.d(String, String)>
	//   52  109:pop             
		return ((JSONObject) (map));
	//   53  110:aload_2         
	//   54  111:areturn         
		map;
	//   55  112:astore_2        
		long l2 = System.currentTimeMillis();
	//   56  113:invokestatic    #34  <Method long System.currentTimeMillis()>
	//   57  116:lstore          5
		String s1 = a;
	//   58  118:getstatic       #20  <Field String a>
	//   59  121:astore          7
		StringBuilder stringbuilder1 = new StringBuilder();
	//   60  123:new             #38  <Class StringBuilder>
	//   61  126:dup             
	//   62  127:invokespecial   #39  <Method void StringBuilder()>
	//   63  130:astore          8
		stringbuilder1.append("Request Executed in [");
	//   64  132:aload           8
	//   65  134:ldc1            #41  <String "Request Executed in [">
	//   66  136:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   67  139:pop             
		stringbuilder1.append(l2 - l);
	//   68  140:aload           8
	//   69  142:lload           5
	//   70  144:lload_3         
	//   71  145:lsub            
	//   72  146:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   73  149:pop             
		stringbuilder1.append("ms] [");
	//   74  150:aload           8
	//   75  152:ldc1            #50  <String "ms] [">
	//   76  154:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
		stringbuilder1.append(v.a.toString());
	//   78  158:aload           8
	//   79  160:getstatic       #55  <Field v v.a>
	//   80  163:invokevirtual   #59  <Method String v.toString()>
	//   81  166:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   82  169:pop             
		stringbuilder1.append(":");
	//   83  170:aload           8
	//   84  172:ldc1            #61  <String ":">
	//   85  174:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   86  177:pop             
		stringbuilder1.append(uri.toString());
	//   87  178:aload           8
	//   88  180:aload_1         
	//   89  181:invokevirtual   #64  <Method String URI.toString()>
	//   90  184:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   91  187:pop             
		stringbuilder1.append("]");
	//   92  188:aload           8
	//   93  190:ldc1            #66  <String "]">
	//   94  192:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   95  195:pop             
		AppboyLogger.d(s1, stringbuilder1.toString());
	//   96  196:aload           7
	//   97  198:aload           8
	//   98  200:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   99  203:invokestatic    #71  <Method int AppboyLogger.d(String, String)>
	//  100  206:pop             
		throw map;
	//  101  207:aload_2         
	//  102  208:athrow          
	}

	public JSONObject a(URI uri, Map map, JSONObject jsonobject)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #34  <Method long System.currentTimeMillis()>
	//    1    3:lstore          4
		map = ((Map) (b.a(uri, map, jsonobject)));
	//    2    5:aload_0         
	//    3    6:getfield        #27  <Field d b>
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:invokeinterface #76  <Method JSONObject d.a(URI, Map, JSONObject)>
	//    8   17:astore_2        
		long l1 = System.currentTimeMillis();
	//    9   18:invokestatic    #34  <Method long System.currentTimeMillis()>
	//   10   21:lstore          6
		jsonobject = ((JSONObject) (a));
	//   11   23:getstatic       #20  <Field String a>
	//   12   26:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #38  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #39  <Method void StringBuilder()>
	//   16   34:astore          8
		stringbuilder.append("Request Executed in [");
	//   17   36:aload           8
	//   18   38:ldc1            #41  <String "Request Executed in [">
	//   19   40:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		stringbuilder.append(l1 - l);
	//   21   44:aload           8
	//   22   46:lload           6
	//   23   48:lload           4
	//   24   50:lsub            
	//   25   51:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   26   54:pop             
		stringbuilder.append("ms] [");
	//   27   55:aload           8
	//   28   57:ldc1            #50  <String "ms] [">
	//   29   59:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		stringbuilder.append(v.b.toString());
	//   31   63:aload           8
	//   32   65:getstatic       #78  <Field v v.b>
	//   33   68:invokevirtual   #59  <Method String v.toString()>
	//   34   71:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
		stringbuilder.append(":");
	//   36   75:aload           8
	//   37   77:ldc1            #61  <String ":">
	//   38   79:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
		stringbuilder.append(uri.toString());
	//   40   83:aload           8
	//   41   85:aload_1         
	//   42   86:invokevirtual   #64  <Method String URI.toString()>
	//   43   89:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
		stringbuilder.append("]");
	//   45   93:aload           8
	//   46   95:ldc1            #66  <String "]">
	//   47   97:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
		AppboyLogger.d(((String) (jsonobject)), stringbuilder.toString());
	//   49  101:aload_3         
	//   50  102:aload           8
	//   51  104:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   52  107:invokestatic    #71  <Method int AppboyLogger.d(String, String)>
	//   53  110:pop             
		return ((JSONObject) (map));
	//   54  111:aload_2         
	//   55  112:areturn         
		map;
	//   56  113:astore_2        
		long l2 = System.currentTimeMillis();
	//   57  114:invokestatic    #34  <Method long System.currentTimeMillis()>
	//   58  117:lstore          6
		jsonobject = ((JSONObject) (a));
	//   59  119:getstatic       #20  <Field String a>
	//   60  122:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   61  123:new             #38  <Class StringBuilder>
	//   62  126:dup             
	//   63  127:invokespecial   #39  <Method void StringBuilder()>
	//   64  130:astore          8
		stringbuilder1.append("Request Executed in [");
	//   65  132:aload           8
	//   66  134:ldc1            #41  <String "Request Executed in [">
	//   67  136:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   68  139:pop             
		stringbuilder1.append(l2 - l);
	//   69  140:aload           8
	//   70  142:lload           6
	//   71  144:lload           4
	//   72  146:lsub            
	//   73  147:invokevirtual   #48  <Method StringBuilder StringBuilder.append(long)>
	//   74  150:pop             
		stringbuilder1.append("ms] [");
	//   75  151:aload           8
	//   76  153:ldc1            #50  <String "ms] [">
	//   77  155:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   78  158:pop             
		stringbuilder1.append(v.b.toString());
	//   79  159:aload           8
	//   80  161:getstatic       #78  <Field v v.b>
	//   81  164:invokevirtual   #59  <Method String v.toString()>
	//   82  167:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   83  170:pop             
		stringbuilder1.append(":");
	//   84  171:aload           8
	//   85  173:ldc1            #61  <String ":">
	//   86  175:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   87  178:pop             
		stringbuilder1.append(uri.toString());
	//   88  179:aload           8
	//   89  181:aload_1         
	//   90  182:invokevirtual   #64  <Method String URI.toString()>
	//   91  185:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   92  188:pop             
		stringbuilder1.append("]");
	//   93  189:aload           8
	//   94  191:ldc1            #66  <String "]">
	//   95  193:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   96  196:pop             
		AppboyLogger.d(((String) (jsonobject)), stringbuilder1.toString());
	//   97  197:aload_3         
	//   98  198:aload           8
	//   99  200:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  100  203:invokestatic    #71  <Method int AppboyLogger.d(String, String)>
	//  101  206:pop             
		throw map;
	//  102  207:aload_2         
	//  103  208:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/g);
	private final d b;

	static 
	{
	//    0    0:ldc1            #2   <Class g>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
