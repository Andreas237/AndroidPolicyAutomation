// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.content.Context;
import android.net.Uri;
import android.webkit.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.Callable;
import org.json.*;

// Referenced classes of package bolts:
//			AppLinkResolver, AppLink, Capture, Task, 
//			Continuation, TaskCompletionSource

public class WebViewAppLinkResolver
	implements AppLinkResolver
{

	public WebViewAppLinkResolver(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #60  <Field Context context>
	//    5    9:return          
	}

	private static List getAlList(Map map, String s)
	{
		map = ((Map) ((List)map.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #91  <Method Object Map.get(Object)>
	//    3    7:checkcast       #93  <Class List>
	//    4   10:astore_0        
		if(map == null)
	//*   5   11:aload_0         
	//*   6   12:ifnonnull       19
			return Collections.emptyList();
	//    7   15:invokestatic    #99  <Method List Collections.emptyList()>
	//    8   18:areturn         
		else
			return ((List) (map));
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	private static AppLink makeAppLinkFromAlData(Map map, Uri uri)
	{
		ArrayList arraylist;
label0:
		{
label1:
			{
				Object obj1;
label2:
				{
					arraylist = new ArrayList();
	//    0    0:new             #103 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void ArrayList()>
	//    3    7:astore          7
					obj1 = ((Object) ((List)map.get("android")));
	//    4    9:aload_0         
	//    5   10:ldc1            #23  <String "android">
	//    6   12:invokeinterface #91  <Method Object Map.get(Object)>
	//    7   17:checkcast       #93  <Class List>
	//    8   20:astore          6
					Object obj = obj1;
	//    9   22:aload           6
	//   10   24:astore          5
					if(obj1 == null)
	//*  11   26:aload           6
	//*  12   28:ifnonnull       36
						obj = ((Object) (Collections.emptyList()));
	//   13   31:invokestatic    #99  <Method List Collections.emptyList()>
	//   14   34:astore          5
					obj1 = ((Object) (((List) (obj)).iterator()));
	//   15   36:aload           5
	//   16   38:invokeinterface #108 <Method Iterator List.iterator()>
	//   17   43:astore          6
					do
					{
						boolean flag = ((Iterator) (obj1)).hasNext();
	//   18   45:aload           6
	//   19   47:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//   20   52:istore          4
						int i = 0;
	//   21   54:iconst_0        
	//   22   55:istore_2        
						obj = null;
	//   23   56:aconst_null     
	//   24   57:astore          5
						if(!flag)
							break;
	//   25   59:iload           4
	//   26   61:ifeq            360
						obj = ((Object) ((Map)((Iterator) (obj1)).next()));
	//   27   64:aload           6
	//   28   66:invokeinterface #118 <Method Object Iterator.next()>
	//   29   71:checkcast       #87  <Class Map>
	//   30   74:astore          5
						List list = getAlList(((Map) (obj)), "url");
	//   31   76:aload           5
	//   32   78:ldc1            #38  <String "url">
	//   33   80:invokestatic    #120 <Method List getAlList(Map, String)>
	//   34   83:astore          8
						List list1 = getAlList(((Map) (obj)), "package");
	//   35   85:aload           5
	//   36   87:ldc1            #32  <String "package">
	//   37   89:invokestatic    #120 <Method List getAlList(Map, String)>
	//   38   92:astore          9
						List list2 = getAlList(((Map) (obj)), "class");
	//   39   94:aload           5
	//   40   96:ldc1            #29  <String "class">
	//   41   98:invokestatic    #120 <Method List getAlList(Map, String)>
	//   42  101:astore          10
						List list3 = getAlList(((Map) (obj)), "app_name");
	//   43  103:aload           5
	//   44  105:ldc1            #26  <String "app_name">
	//   45  107:invokestatic    #120 <Method List getAlList(Map, String)>
	//   46  110:astore          11
						int j = Math.max(list.size(), Math.max(list1.size(), Math.max(list2.size(), list3.size())));
	//   47  112:aload           8
	//   48  114:invokeinterface #124 <Method int List.size()>
	//   49  119:aload           9
	//   50  121:invokeinterface #124 <Method int List.size()>
	//   51  126:aload           10
	//   52  128:invokeinterface #124 <Method int List.size()>
	//   53  133:aload           11
	//   54  135:invokeinterface #124 <Method int List.size()>
	//   55  140:invokestatic    #130 <Method int Math.max(int, int)>
	//   56  143:invokestatic    #130 <Method int Math.max(int, int)>
	//   57  146:invokestatic    #130 <Method int Math.max(int, int)>
	//   58  149:istore_3        
						while(i < j) 
	//*  59  150:iload_2         
	//*  60  151:iload_3         
	//*  61  152:icmpge          45
						{
							if(list.size() > i)
	//*  62  155:aload           8
	//*  63  157:invokeinterface #124 <Method int List.size()>
	//*  64  162:iload_2         
	//*  65  163:icmple          189
								obj = ((Map)list.get(i)).get("value");
	//   66  166:aload           8
	//   67  168:iload_2         
	//   68  169:invokeinterface #133 <Method Object List.get(int)>
	//   69  174:checkcast       #87  <Class Map>
	//   70  177:ldc1            #20  <String "value">
	//   71  179:invokeinterface #91  <Method Object Map.get(Object)>
	//   72  184:astore          5
							else
	//*  73  186:goto            192
								obj = null;
	//   74  189:aconst_null     
	//   75  190:astore          5
							Uri uri1 = tryCreateUrl((String)obj);
	//   76  192:aload           5
	//   77  194:checkcast       #135 <Class String>
	//   78  197:invokestatic    #139 <Method Uri tryCreateUrl(String)>
	//   79  200:astore          12
							if(list1.size() > i)
	//*  80  202:aload           9
	//*  81  204:invokeinterface #124 <Method int List.size()>
	//*  82  209:iload_2         
	//*  83  210:icmple          236
								obj = ((Map)list1.get(i)).get("value");
	//   84  213:aload           9
	//   85  215:iload_2         
	//   86  216:invokeinterface #133 <Method Object List.get(int)>
	//   87  221:checkcast       #87  <Class Map>
	//   88  224:ldc1            #20  <String "value">
	//   89  226:invokeinterface #91  <Method Object Map.get(Object)>
	//   90  231:astore          5
							else
	//*  91  233:goto            239
								obj = null;
	//   92  236:aconst_null     
	//   93  237:astore          5
							String s = (String)obj;
	//   94  239:aload           5
	//   95  241:checkcast       #135 <Class String>
	//   96  244:astore          13
							if(list2.size() > i)
	//*  97  246:aload           10
	//*  98  248:invokeinterface #124 <Method int List.size()>
	//*  99  253:iload_2         
	//* 100  254:icmple          280
								obj = ((Map)list2.get(i)).get("value");
	//  101  257:aload           10
	//  102  259:iload_2         
	//  103  260:invokeinterface #133 <Method Object List.get(int)>
	//  104  265:checkcast       #87  <Class Map>
	//  105  268:ldc1            #20  <String "value">
	//  106  270:invokeinterface #91  <Method Object Map.get(Object)>
	//  107  275:astore          5
							else
	//* 108  277:goto            283
								obj = null;
	//  109  280:aconst_null     
	//  110  281:astore          5
							String s1 = (String)obj;
	//  111  283:aload           5
	//  112  285:checkcast       #135 <Class String>
	//  113  288:astore          14
							if(list3.size() > i)
	//* 114  290:aload           11
	//* 115  292:invokeinterface #124 <Method int List.size()>
	//* 116  297:iload_2         
	//* 117  298:icmple          324
								obj = ((Map)list3.get(i)).get("value");
	//  118  301:aload           11
	//  119  303:iload_2         
	//  120  304:invokeinterface #133 <Method Object List.get(int)>
	//  121  309:checkcast       #87  <Class Map>
	//  122  312:ldc1            #20  <String "value">
	//  123  314:invokeinterface #91  <Method Object Map.get(Object)>
	//  124  319:astore          5
							else
	//* 125  321:goto            327
								obj = null;
	//  126  324:aconst_null     
	//  127  325:astore          5
							((List) (arraylist)).add(((Object) (new AppLink.Target(s, s1, uri1, (String)obj))));
	//  128  327:aload           7
	//  129  329:new             #141 <Class AppLink$Target>
	//  130  332:dup             
	//  131  333:aload           13
	//  132  335:aload           14
	//  133  337:aload           12
	//  134  339:aload           5
	//  135  341:checkcast       #135 <Class String>
	//  136  344:invokespecial   #144 <Method void AppLink$Target(String, String, Uri, String)>
	//  137  347:invokeinterface #148 <Method boolean List.add(Object)>
	//  138  352:pop             
							i++;
	//  139  353:iload_2         
	//  140  354:iconst_1        
	//  141  355:iadd            
	//  142  356:istore_2        
						}
					} while(true);
	//  143  357:goto            150
					map = ((Map) ((List)map.get("web")));
	//  144  360:aload_0         
	//  145  361:ldc1            #41  <String "web">
	//  146  363:invokeinterface #91  <Method Object Map.get(Object)>
	//  147  368:checkcast       #93  <Class List>
	//  148  371:astore_0        
					if(map == null || ((List) (map)).size() <= 0)
						break label1;
	//  149  372:aload_0         
	//  150  373:ifnull          547
	//  151  376:aload_0         
	//  152  377:invokeinterface #124 <Method int List.size()>
	//  153  382:ifle            547
					map = (Map)((List) (map)).get(0);
	//  154  385:aload_0         
	//  155  386:iconst_0        
	//  156  387:invokeinterface #133 <Method Object List.get(int)>
	//  157  392:checkcast       #87  <Class Map>
	//  158  395:astore_0        
					obj1 = ((Object) ((List)map.get("url")));
	//  159  396:aload_0         
	//  160  397:ldc1            #38  <String "url">
	//  161  399:invokeinterface #91  <Method Object Map.get(Object)>
	//  162  404:checkcast       #93  <Class List>
	//  163  407:astore          6
					map = ((Map) ((List)map.get("should_fallback")));
	//  164  409:aload_0         
	//  165  410:ldc1            #35  <String "should_fallback">
	//  166  412:invokeinterface #91  <Method Object Map.get(Object)>
	//  167  417:checkcast       #93  <Class List>
	//  168  420:astore_0        
					if(map != null && ((List) (map)).size() > 0)
	//* 169  421:aload_0         
	//* 170  422:ifnull          495
	//* 171  425:aload_0         
	//* 172  426:invokeinterface #124 <Method int List.size()>
	//* 173  431:ifle            495
					{
						map = ((Map) ((String)((Map)((List) (map)).get(0)).get("value")));
	//  174  434:aload_0         
	//  175  435:iconst_0        
	//  176  436:invokeinterface #133 <Method Object List.get(int)>
	//  177  441:checkcast       #87  <Class Map>
	//  178  444:ldc1            #20  <String "value">
	//  179  446:invokeinterface #91  <Method Object Map.get(Object)>
	//  180  451:checkcast       #135 <Class String>
	//  181  454:astore_0        
						if(Arrays.asList(((Object []) (new String[] {
	"no", "false", "0"
}))).contains(((Object) (((String) (map)).toLowerCase()))))
	//* 182  455:iconst_3        
	//* 183  456:anewarray       String[]
	//* 184  459:dup             
	//* 185  460:iconst_0        
	//* 186  461:ldc1            #150 <String "no">
	//* 187  463:aastore         
	//* 188  464:dup             
	//* 189  465:iconst_1        
	//* 190  466:ldc1            #152 <String "false">
	//* 191  468:aastore         
	//* 192  469:dup             
	//* 193  470:iconst_2        
	//* 194  471:ldc1            #154 <String "0">
	//* 195  473:aastore         
	//* 196  474:invokestatic    #160 <Method List Arrays.asList(Object[])>
	//* 197  477:aload_0         
	//* 198  478:invokevirtual   #164 <Method String String.toLowerCase()>
	//* 199  481:invokeinterface #167 <Method boolean List.contains(Object)>
	//* 200  486:ifeq            495
						{
							map = ((Map) (obj));
	//  201  489:aload           5
	//  202  491:astore_0        
							break label2;
	//  203  492:goto            497
						}
					}
					map = ((Map) (uri));
	//  204  495:aload_1         
	//  205  496:astore_0        
				}
				if(map != null && obj1 != null && ((List) (obj1)).size() > 0)
	//* 206  497:aload_0         
	//* 207  498:ifnull          544
	//* 208  501:aload           6
	//* 209  503:ifnull          544
	//* 210  506:aload           6
	//* 211  508:invokeinterface #124 <Method int List.size()>
	//* 212  513:ifle            544
					map = ((Map) (tryCreateUrl((String)((Map)((List) (obj1)).get(0)).get("value"))));
	//  213  516:aload           6
	//  214  518:iconst_0        
	//  215  519:invokeinterface #133 <Method Object List.get(int)>
	//  216  524:checkcast       #87  <Class Map>
	//  217  527:ldc1            #20  <String "value">
	//  218  529:invokeinterface #91  <Method Object Map.get(Object)>
	//  219  534:checkcast       #135 <Class String>
	//  220  537:invokestatic    #139 <Method Uri tryCreateUrl(String)>
	//  221  540:astore_0        
				break label0;
	//  222  541:goto            549
			}
	//* 223  544:goto            549
			map = ((Map) (uri));
	//  224  547:aload_1         
	//  225  548:astore_0        
		}
		return new AppLink(uri, ((List) (arraylist)), ((Uri) (map)));
	//  226  549:new             #169 <Class AppLink>
	//  227  552:dup             
	//  228  553:aload_1         
	//  229  554:aload           7
	//  230  556:aload_0         
	//  231  557:invokespecial   #172 <Method void AppLink(Uri, List, Uri)>
	//  232  560:areturn         
	}

	private static Map parseAlData(JSONArray jsonarray)
		throws JSONException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #175 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void HashMap()>
	//    3    7:astore          6
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #181 <Method int JSONArray.length()>
	//*   9   16:icmpge          260
		{
			JSONObject jsonobject = jsonarray.getJSONObject(i);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #185 <Method JSONObject JSONArray.getJSONObject(int)>
	//   13   24:astore          9
			String as[] = jsonobject.getString("property").split(":");
	//   14   26:aload           9
	//   15   28:ldc1            #187 <String "property">
	//   16   30:invokevirtual   #193 <Method String JSONObject.getString(String)>
	//   17   33:ldc1            #195 <String ":">
	//   18   35:invokevirtual   #199 <Method String[] String.split(String)>
	//   19   38:astore          10
			if(!as[0].equals("al"))
	//*  20   40:aload           10
	//*  21   42:iconst_0        
	//*  22   43:aaload          
	//*  23   44:ldc1            #45  <String "al">
	//*  24   46:invokevirtual   #202 <Method boolean String.equals(Object)>
	//*  25   49:ifne            55
				continue;
	//   26   52:goto            253
			Object obj = ((Object) (hashmap));
	//   27   55:aload           6
	//   28   57:astore          4
			int j = 1;
	//   29   59:iconst_1        
	//   30   60:istore_2        
			do
			{
				int k = as.length;
	//   31   61:aload           10
	//   32   63:arraylength     
	//   33   64:istore_3        
				Object obj2 = null;
	//   34   65:aconst_null     
	//   35   66:astore          7
				if(j >= k)
					break;
	//   36   68:iload_2         
	//   37   69:iload_3         
	//   38   70:icmpge          202
				List list = (List)((Map) (obj)).get(((Object) (as[j])));
	//   39   73:aload           4
	//   40   75:aload           10
	//   41   77:iload_2         
	//   42   78:aaload          
	//   43   79:invokeinterface #91  <Method Object Map.get(Object)>
	//   44   84:checkcast       #93  <Class List>
	//   45   87:astore          8
				Object obj1 = ((Object) (list));
	//   46   89:aload           8
	//   47   91:astore          5
				if(list == null)
	//*  48   93:aload           8
	//*  49   95:ifnonnull       121
				{
					obj1 = ((Object) (new ArrayList()));
	//   50   98:new             #103 <Class ArrayList>
	//   51  101:dup             
	//   52  102:invokespecial   #104 <Method void ArrayList()>
	//   53  105:astore          5
					((Map) (obj)).put(((Object) (as[j])), obj1);
	//   54  107:aload           4
	//   55  109:aload           10
	//   56  111:iload_2         
	//   57  112:aaload          
	//   58  113:aload           5
	//   59  115:invokeinterface #206 <Method Object Map.put(Object, Object)>
	//   60  120:pop             
				}
				obj = ((Object) (obj2));
	//   61  121:aload           7
	//   62  123:astore          4
				if(((List) (obj1)).size() > 0)
	//*  63  125:aload           5
	//*  64  127:invokeinterface #124 <Method int List.size()>
	//*  65  132:ifle            156
					obj = ((Object) ((Map)((List) (obj1)).get(((List) (obj1)).size() - 1)));
	//   66  135:aload           5
	//   67  137:aload           5
	//   68  139:invokeinterface #124 <Method int List.size()>
	//   69  144:iconst_1        
	//   70  145:isub            
	//   71  146:invokeinterface #133 <Method Object List.get(int)>
	//   72  151:checkcast       #87  <Class Map>
	//   73  154:astore          4
				if(obj == null || j == as.length - 1)
	//*  74  156:aload           4
	//*  75  158:ifnull          176
	//*  76  161:iload_2         
	//*  77  162:aload           10
	//*  78  164:arraylength     
	//*  79  165:iconst_1        
	//*  80  166:isub            
	//*  81  167:icmpne          173
	//*  82  170:goto            176
	//*  83  173:goto            195
				{
					obj = ((Object) (new HashMap()));
	//   84  176:new             #175 <Class HashMap>
	//   85  179:dup             
	//   86  180:invokespecial   #176 <Method void HashMap()>
	//   87  183:astore          4
					((List) (obj1)).add(obj);
	//   88  185:aload           5
	//   89  187:aload           4
	//   90  189:invokeinterface #148 <Method boolean List.add(Object)>
	//   91  194:pop             
				}
				j++;
	//   92  195:iload_2         
	//   93  196:iconst_1        
	//   94  197:iadd            
	//   95  198:istore_2        
			} while(true);
	//   96  199:goto            61
			if(!jsonobject.has("content"))
				continue;
	//   97  202:aload           9
	//   98  204:ldc1            #208 <String "content">
	//   99  206:invokevirtual   #212 <Method boolean JSONObject.has(String)>
	//  100  209:ifeq            253
			if(jsonobject.isNull("content"))
	//* 101  212:aload           9
	//* 102  214:ldc1            #208 <String "content">
	//* 103  216:invokevirtual   #215 <Method boolean JSONObject.isNull(String)>
	//* 104  219:ifeq            236
				((Map) (obj)).put("value", ((Object) (null)));
	//  105  222:aload           4
	//  106  224:ldc1            #20  <String "value">
	//  107  226:aconst_null     
	//  108  227:invokeinterface #206 <Method Object Map.put(Object, Object)>
	//  109  232:pop             
			else
	//* 110  233:goto            253
				((Map) (obj)).put("value", ((Object) (jsonobject.getString("content"))));
	//  111  236:aload           4
	//  112  238:ldc1            #20  <String "value">
	//  113  240:aload           9
	//  114  242:ldc1            #208 <String "content">
	//  115  244:invokevirtual   #193 <Method String JSONObject.getString(String)>
	//  116  247:invokeinterface #206 <Method Object Map.put(Object, Object)>
	//  117  252:pop             
		}

	//  118  253:iload_1         
	//  119  254:iconst_1        
	//  120  255:iadd            
	//  121  256:istore_1        
	//* 122  257:goto            11
		return ((Map) (hashmap));
	//  123  260:aload           6
	//  124  262:areturn         
	}

	private static String readFromConnection(URLConnection urlconnection)
		throws IOException
	{
		InputStream inputstream;
		if(urlconnection instanceof HttpURLConnection)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #220 <Class HttpURLConnection>
	//*   2    4:ifeq            30
		{
			HttpURLConnection httpurlconnection = (HttpURLConnection)urlconnection;
	//    3    7:aload_0         
	//    4    8:checkcast       #220 <Class HttpURLConnection>
	//    5   11:astore          4
			try
			{
				inputstream = urlconnection.getInputStream();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #226 <Method InputStream URLConnection.getInputStream()>
	//    8   17:astore_3        
			}
	//*   9   18:goto            35
	//*  10   21:aload           4
	//*  11   23:invokevirtual   #229 <Method InputStream HttpURLConnection.getErrorStream()>
	//*  12   26:astore_3        
	//*  13   27:goto            35
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #226 <Method InputStream URLConnection.getInputStream()>
	//*  16   34:astore_3        
	//*  17   35:new             #231 <Class ByteArrayOutputStream>
	//*  18   38:dup             
	//*  19   39:invokespecial   #232 <Method void ByteArrayOutputStream()>
	//*  20   42:astore          6
	//*  21   44:sipush          1024
	//*  22   47:newarray        byte[]
	//*  23   49:astore          4
	//*  24   51:aload_3         
	//*  25   52:aload           4
	//*  26   54:invokevirtual   #238 <Method int InputStream.read(byte[])>
	//*  27   57:istore_2        
	//*  28   58:iconst_0        
	//*  29   59:istore_1        
	//*  30   60:iload_2         
	//*  31   61:iconst_m1       
	//*  32   62:icmpeq          77
	//*  33   65:aload           6
	//*  34   67:aload           4
	//*  35   69:iconst_0        
	//*  36   70:iload_2         
	//*  37   71:invokevirtual   #242 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  38   74:goto            51
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #245 <Method String URLConnection.getContentEncoding()>
	//*  41   81:astore          5
	//*  42   83:aload           5
	//*  43   85:astore          4
	//*  44   87:aload           5
	//*  45   89:ifnonnull       142
	//*  46   92:aload_0         
	//*  47   93:invokevirtual   #248 <Method String URLConnection.getContentType()>
	//*  48   96:ldc1            #250 <String ";">
	//*  49   98:invokevirtual   #199 <Method String[] String.split(String)>
	//*  50  101:astore          4
	//*  51  103:aload           4
	//*  52  105:arraylength     
	//*  53  106:istore_2        
	//*  54  107:aload           5
	//*  55  109:astore_0        
	//*  56  110:iload_1         
	//*  57  111:iload_2         
	//*  58  112:icmpge          181
	//*  59  115:aload           4
	//*  60  117:iload_1         
	//*  61  118:aaload          
	//*  62  119:invokevirtual   #253 <Method String String.trim()>
	//*  63  122:astore_0        
	//*  64  123:aload_0         
	//*  65  124:ldc1            #255 <String "charset=">
	//*  66  126:invokevirtual   #258 <Method boolean String.startsWith(String)>
	//*  67  129:ifeq            174
	//*  68  132:aload_0         
	//*  69  133:bipush          8
	//*  70  135:invokevirtual   #262 <Method String String.substring(int)>
	//*  71  138:astore_0        
	//*  72  139:goto            181
	//*  73  142:new             #135 <Class String>
	//*  74  145:dup             
	//*  75  146:aload           6
	//*  76  148:invokevirtual   #266 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  77  151:aload           4
	//*  78  153:invokespecial   #269 <Method void String(byte[], String)>
	//*  79  156:astore_0        
	//*  80  157:aload_3         
	//*  81  158:invokevirtual   #272 <Method void InputStream.close()>
	//*  82  161:aload_0         
	//*  83  162:areturn         
	//*  84  163:astore_0        
	//*  85  164:aload_3         
	//*  86  165:invokevirtual   #272 <Method void InputStream.close()>
	//*  87  168:aload_0         
	//*  88  169:athrow          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				inputstream = httpurlconnection.getErrorStream();
			}
		} else
		{
			inputstream = urlconnection.getInputStream();
		}
		byte abyte0[];
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
		abyte0 = new byte[1024];
_L1:
		int j = inputstream.read(abyte0);
		int i;
		i = 0;
		if(j == -1)
			break MISSING_BLOCK_LABEL_77;
		bytearrayoutputstream.write(abyte0, 0, j);
		  goto _L1
		String s = urlconnection.getContentEncoding();
		Object obj = ((Object) (s));
		if(s != null) goto _L3; else goto _L2
_L2:
		obj = ((Object) (urlconnection.getContentType().split(";")));
		j = obj.length;
_L6:
		urlconnection = ((URLConnection) (s));
		if(i >= j)
			break MISSING_BLOCK_LABEL_181;
		  goto _L4
_L3:
		urlconnection = ((URLConnection) (new String(bytearrayoutputstream.toByteArray(), ((String) (obj)))));
		inputstream.close();
		return ((String) (urlconnection));
		urlconnection;
		inputstream.close();
		throw urlconnection;
_L4:
		urlconnection = ((URLConnection) (((String) (obj[i])).trim()));
		Exception exception;
		if(((String) (urlconnection)).startsWith("charset="))
		{
			urlconnection = ((URLConnection) (((String) (urlconnection)).substring(8)));
			break MISSING_BLOCK_LABEL_181;
		}
	//*  89  170:astore_3        
	//*  90  171:goto            21
		i++;
	//   91  174:iload_1         
	//   92  175:iconst_1        
	//   93  176:iadd            
	//   94  177:istore_1        
		if(true) goto _L6; else goto _L5
	//   95  178:goto            107
_L5:
		obj = ((Object) (urlconnection));
	//   96  181:aload_0         
	//   97  182:astore          4
		if(urlconnection == null)
	//*  98  184:aload_0         
	//*  99  185:ifnonnull       142
			obj = "UTF-8";
	//  100  188:ldc2            #274 <String "UTF-8">
	//  101  191:astore          4
		  goto _L3
	//* 102  193:goto            142
	}

	private static Uri tryCreateUrl(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Uri.parse(s);
	//    4    6:aload_0         
	//    5    7:invokestatic    #279 <Method Uri Uri.parse(String)>
	//    6   10:areturn         
	}

	public Task getAppLinkFromUrlInBackground(final Uri url)
	{
		final Capture content = new Capture();
	//    0    0:new             #283 <Class Capture>
	//    1    3:dup             
	//    2    4:invokespecial   #284 <Method void Capture()>
	//    3    7:astore_2        
		final Capture contentType = new Capture();
	//    4    8:new             #283 <Class Capture>
	//    5   11:dup             
	//    6   12:invokespecial   #284 <Method void Capture()>
	//    7   15:astore_3        
		return Task.callInBackground(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				URLConnection urlconnection;
				URL url1 = new URL(url.toString());
			//    0    0:new             #43  <Class URL>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field Uri val$url>
			//    4    8:invokevirtual   #49  <Method String Uri.toString()>
			//    5   11:invokespecial   #52  <Method void URL(String)>
			//    6   14:astore_2        
				urlconnection = null;
			//    7   15:aconst_null     
			//    8   16:astore_3        
				while(url1 != null) 
			//*   9   17:aload_2         
			//*  10   18:ifnull          120
				{
					urlconnection = url1.openConnection();
			//   11   21:aload_2         
			//   12   22:invokevirtual   #56  <Method URLConnection URL.openConnection()>
			//   13   25:astore_3        
					boolean flag = urlconnection instanceof HttpURLConnection;
			//   14   26:aload_3         
			//   15   27:instanceof      #58  <Class HttpURLConnection>
			//   16   30:istore_1        
					if(flag)
			//*  17   31:iload_1         
			//*  18   32:ifeq            43
						((HttpURLConnection)urlconnection).setInstanceFollowRedirects(true);
			//   19   35:aload_3         
			//   20   36:checkcast       #58  <Class HttpURLConnection>
			//   21   39:iconst_1        
			//   22   40:invokevirtual   #62  <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
					urlconnection.setRequestProperty("Prefer-Html-Meta-Tags", "al");
			//   23   43:aload_3         
			//   24   44:ldc1            #64  <String "Prefer-Html-Meta-Tags">
			//   25   46:ldc1            #66  <String "al">
			//   26   48:invokevirtual   #72  <Method void URLConnection.setRequestProperty(String, String)>
					urlconnection.connect();
			//   27   51:aload_3         
			//   28   52:invokevirtual   #75  <Method void URLConnection.connect()>
					if(flag)
			//*  29   55:iload_1         
			//*  30   56:ifeq            115
					{
						HttpURLConnection httpurlconnection = (HttpURLConnection)urlconnection;
			//   31   59:aload_3         
			//   32   60:checkcast       #58  <Class HttpURLConnection>
			//   33   63:astore          4
						if(httpurlconnection.getResponseCode() >= 300 && httpurlconnection.getResponseCode() < 400)
			//*  34   65:aload           4
			//*  35   67:invokevirtual   #79  <Method int HttpURLConnection.getResponseCode()>
			//*  36   70:sipush          300
			//*  37   73:icmplt          110
			//*  38   76:aload           4
			//*  39   78:invokevirtual   #79  <Method int HttpURLConnection.getResponseCode()>
			//*  40   81:sipush          400
			//*  41   84:icmpge          110
						{
							url1 = new URL(httpurlconnection.getHeaderField("Location"));
			//   42   87:new             #43  <Class URL>
			//   43   90:dup             
			//   44   91:aload           4
			//   45   93:ldc1            #81  <String "Location">
			//   46   95:invokevirtual   #85  <Method String HttpURLConnection.getHeaderField(String)>
			//   47   98:invokespecial   #52  <Method void URL(String)>
			//   48  101:astore_2        
							httpurlconnection.disconnect();
			//   49  102:aload           4
			//   50  104:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
						} else
			//*  51  107:goto            17
						{
							url1 = null;
			//   52  110:aconst_null     
			//   53  111:astore_2        
						}
					} else
			//*  54  112:goto            17
					{
						url1 = null;
			//   55  115:aconst_null     
			//   56  116:astore_2        
					}
				}
			//*  57  117:goto            17
				content.set(((Object) (WebViewAppLinkResolver.readFromConnection(urlconnection))));
			//   58  120:aload_0         
			//   59  121:getfield        #27  <Field Capture val$content>
			//   60  124:aload_3         
			//   61  125:invokestatic    #92  <Method String WebViewAppLinkResolver.access$300(URLConnection)>
			//   62  128:invokevirtual   #98  <Method void Capture.set(Object)>
				contentType.set(((Object) (urlconnection.getContentType())));
			//   63  131:aload_0         
			//   64  132:getfield        #29  <Field Capture val$contentType>
			//   65  135:aload_3         
			//   66  136:invokevirtual   #101 <Method String URLConnection.getContentType()>
			//   67  139:invokevirtual   #98  <Method void Capture.set(Object)>
				if(urlconnection instanceof HttpURLConnection)
			//*  68  142:aload_3         
			//*  69  143:instanceof      #58  <Class HttpURLConnection>
			//*  70  146:ifeq            156
					((HttpURLConnection)urlconnection).disconnect();
			//   71  149:aload_3         
			//   72  150:checkcast       #58  <Class HttpURLConnection>
			//   73  153:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
				return null;
			//   74  156:aconst_null     
			//   75  157:areturn         
				Exception exception;
				exception;
			//   76  158:astore_2        
				if(urlconnection instanceof HttpURLConnection)
			//*  77  159:aload_3         
			//*  78  160:instanceof      #58  <Class HttpURLConnection>
			//*  79  163:ifeq            173
					((HttpURLConnection)urlconnection).disconnect();
			//   80  166:aload_3         
			//   81  167:checkcast       #58  <Class HttpURLConnection>
			//   82  170:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
				throw exception;
			//   83  173:aload_2         
			//   84  174:athrow          
			}

			final WebViewAppLinkResolver this$0;
			final Capture val$content;
			final Capture val$contentType;
			final Uri val$url;

			
			{
				this$0 = WebViewAppLinkResolver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field WebViewAppLinkResolver this$0>
				url = uri;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Uri val$url>
				content = capture;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Capture val$content>
				contentType = capture1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Capture val$contentType>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
).onSuccessTask(new Continuation() {

			public Task then(Task task)
				throws Exception
			{
				TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
			//    0    0:new             #43  <Class TaskCompletionSource>
			//    1    3:dup             
			//    2    4:invokespecial   #44  <Method void TaskCompletionSource()>
			//    3    7:astore_2        
				WebView webview = new WebView(context);
			//    4    8:new             #46  <Class WebView>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field WebViewAppLinkResolver this$0>
			//    8   16:invokestatic    #50  <Method Context WebViewAppLinkResolver.access$200(WebViewAppLinkResolver)>
			//    9   19:invokespecial   #53  <Method void WebView(Context)>
			//   10   22:astore_3        
				webview.getSettings().setJavaScriptEnabled(true);
			//   11   23:aload_3         
			//   12   24:invokevirtual   #57  <Method WebSettings WebView.getSettings()>
			//   13   27:iconst_1        
			//   14   28:invokevirtual   #63  <Method void WebSettings.setJavaScriptEnabled(boolean)>
				webview.setNetworkAvailable(false);
			//   15   31:aload_3         
			//   16   32:iconst_0        
			//   17   33:invokevirtual   #66  <Method void WebView.setNetworkAvailable(boolean)>
				webview.setWebViewClient(((WebViewClient) (new WebViewClient() {

					private void runJavaScript(WebView webview)
					{
						if(!loaded)
					//*   0    0:aload_0         
					//*   1    1:getfield        #22  <Field boolean loaded>
					//*   2    4:ifne            18
						{
							loaded = true;
					//    3    7:aload_0         
					//    4    8:iconst_1        
					//    5    9:putfield        #22  <Field boolean loaded>
							webview.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
					//    6   12:aload_1         
					//    7   13:ldc1            #27  <String "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())">
					//    8   15:invokevirtual   #33  <Method void WebView.loadUrl(String)>
						}
					//    9   18:return          
					}

					public void onLoadResource(WebView webview, String s)
					{
						super.onLoadResource(webview, s);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:aload_2         
					//    3    3:invokespecial   #37  <Method void WebViewClient.onLoadResource(WebView, String)>
						runJavaScript(webview);
					//    4    6:aload_0         
					//    5    7:aload_1         
					//    6    8:invokespecial   #39  <Method void runJavaScript(WebView)>
					//    7   11:return          
					}

					public void onPageFinished(WebView webview, String s)
					{
						super.onPageFinished(webview, s);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:aload_2         
					//    3    3:invokespecial   #42  <Method void WebViewClient.onPageFinished(WebView, String)>
						runJavaScript(webview);
					//    4    6:aload_0         
					//    5    7:aload_1         
					//    6    8:invokespecial   #39  <Method void runJavaScript(WebView)>
					//    7   11:return          
					}

					private boolean loaded;
					final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewAppLinkResolver$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void WebViewClient()>
				loaded = false;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #22  <Field boolean loaded>
			//    8   14:return          
			}
				}
)));
			//   18   36:aload_3         
			//   19   37:new             #14  <Class WebViewAppLinkResolver$2$1>
			//   20   40:dup             
			//   21   41:aload_0         
			//   22   42:invokespecial   #69  <Method void WebViewAppLinkResolver$2$1(WebViewAppLinkResolver$2)>
			//   23   45:invokevirtual   #73  <Method void WebView.setWebViewClient(WebViewClient)>
				webview.addJavascriptInterface(((Object) (((_cls2) (taskcompletionsource)). new Object() {

					public void setValue(String s)
					{
						try
						{
							tcs.trySetResult(((Object) (new JSONArray(s))));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field TaskCompletionSource val$tcs>
					//    2    4:new             #30  <Class JSONArray>
					//    3    7:dup             
					//    4    8:aload_1         
					//    5    9:invokespecial   #32  <Method void JSONArray(String)>
					//    6   12:invokevirtual   #38  <Method boolean TaskCompletionSource.trySetResult(Object)>
					//    7   15:pop             
							return;
					//    8   16:return          
						}
						// Misplaced declaration of an exception variable
						catch(String s)
					//*   9   17:astore_1        
						{
							tcs.trySetError(((Exception) (s)));
					//   10   18:aload_0         
					//   11   19:getfield        #19  <Field TaskCompletionSource val$tcs>
					//   12   22:aload_1         
					//   13   23:invokevirtual   #42  <Method boolean TaskCompletionSource.trySetError(Exception)>
					//   14   26:pop             
						}
					//   15   27:return          
					}

					final _cls2 this$1;
					final TaskCompletionSource val$tcs;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewAppLinkResolver$2 this$1>
				tcs = TaskCompletionSource.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field TaskCompletionSource val$tcs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
				}
)), "boltsWebViewAppLinkResolverResult");
			//   24   48:aload_3         
			//   25   49:new             #16  <Class WebViewAppLinkResolver$2$2>
			//   26   52:dup             
			//   27   53:aload_0         
			//   28   54:aload_2         
			//   29   55:invokespecial   #76  <Method void WebViewAppLinkResolver$2$2(WebViewAppLinkResolver$2, TaskCompletionSource)>
			//   30   58:ldc1            #78  <String "boltsWebViewAppLinkResolverResult">
			//   31   60:invokevirtual   #82  <Method void WebView.addJavascriptInterface(Object, String)>
				if(contentType.get() != null)
			//*  32   63:aload_0         
			//*  33   64:getfield        #29  <Field Capture val$contentType>
			//*  34   67:invokevirtual   #88  <Method Object Capture.get()>
			//*  35   70:ifnull          94
					task = ((Task) (((String)contentType.get()).split(";")[0]));
			//   36   73:aload_0         
			//   37   74:getfield        #29  <Field Capture val$contentType>
			//   38   77:invokevirtual   #88  <Method Object Capture.get()>
			//   39   80:checkcast       #90  <Class String>
			//   40   83:ldc1            #92  <String ";">
			//   41   85:invokevirtual   #96  <Method String[] String.split(String)>
			//   42   88:iconst_0        
			//   43   89:aaload          
			//   44   90:astore_1        
				else
			//*  45   91:goto            96
					task = null;
			//   46   94:aconst_null     
			//   47   95:astore_1        
				webview.loadDataWithBaseURL(url.toString(), (String)content.get(), ((String) (task)), ((String) (null)), ((String) (null)));
			//   48   96:aload_3         
			//   49   97:aload_0         
			//   50   98:getfield        #31  <Field Uri val$url>
			//   51  101:invokevirtual   #102 <Method String Uri.toString()>
			//   52  104:aload_0         
			//   53  105:getfield        #33  <Field Capture val$content>
			//   54  108:invokevirtual   #88  <Method Object Capture.get()>
			//   55  111:checkcast       #90  <Class String>
			//   56  114:aload_1         
			//   57  115:aconst_null     
			//   58  116:aconst_null     
			//   59  117:invokevirtual   #106 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
				return taskcompletionsource.getTask();
			//   60  120:aload_2         
			//   61  121:invokevirtual   #110 <Method Task TaskCompletionSource.getTask()>
			//   62  124:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #116 <Method Task then(Task)>
			//    3    5:areturn         
			}

			final WebViewAppLinkResolver this$0;
			final Capture val$content;
			final Capture val$contentType;
			final Uri val$url;

			
			{
				this$0 = WebViewAppLinkResolver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field WebViewAppLinkResolver this$0>
				contentType = capture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field Capture val$contentType>
				url = uri;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field Uri val$url>
				content = capture1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field Capture val$content>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #36  <Method void Object()>
			//   14   25:return          
			}
		}
, Task.UI_THREAD_EXECUTOR).onSuccess(new Continuation() {

			public AppLink then(Task task)
				throws Exception
			{
				return WebViewAppLinkResolver.makeAppLinkFromAlData(WebViewAppLinkResolver.parseAlData((JSONArray)task.getResult()), url);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #36  <Method Object Task.getResult()>
			//    2    4:checkcast       #38  <Class JSONArray>
			//    3    7:invokestatic    #42  <Method Map WebViewAppLinkResolver.access$000(JSONArray)>
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field Uri val$url>
			//    6   14:invokestatic    #46  <Method AppLink WebViewAppLinkResolver.access$100(Map, Uri)>
			//    7   17:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #52  <Method AppLink then(Task)>
			//    3    5:areturn         
			}

			final WebViewAppLinkResolver this$0;
			final Uri val$url;

			
			{
				this$0 = WebViewAppLinkResolver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field WebViewAppLinkResolver this$0>
				url = uri;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Uri val$url>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    8   16:new             #16  <Class WebViewAppLinkResolver$3>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokespecial   #287 <Method void WebViewAppLinkResolver$3(WebViewAppLinkResolver, Uri, Capture, Capture)>
	//   15   27:invokestatic    #293 <Method Task Task.callInBackground(Callable)>
	//   16   30:new             #10  <Class WebViewAppLinkResolver$2>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokespecial   #296 <Method void WebViewAppLinkResolver$2(WebViewAppLinkResolver, Capture, Uri, Capture)>
	//   23   41:getstatic       #300 <Field java.util.concurrent.Executor Task.UI_THREAD_EXECUTOR>
	//   24   44:invokevirtual   #304 <Method Task Task.onSuccessTask(Continuation, java.util.concurrent.Executor)>
	//   25   47:new             #8   <Class WebViewAppLinkResolver$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokespecial   #307 <Method void WebViewAppLinkResolver$1(WebViewAppLinkResolver, Uri)>
	//   30   56:invokevirtual   #311 <Method Task Task.onSuccess(Continuation)>
	//   31   59:areturn         
	}

	private static final String KEY_AL_VALUE = "value";
	private static final String KEY_ANDROID = "android";
	private static final String KEY_APP_NAME = "app_name";
	private static final String KEY_CLASS = "class";
	private static final String KEY_PACKAGE = "package";
	private static final String KEY_SHOULD_FALLBACK = "should_fallback";
	private static final String KEY_URL = "url";
	private static final String KEY_WEB = "web";
	private static final String KEY_WEB_URL = "url";
	private static final String META_TAG_PREFIX = "al";
	private static final String PREFER_HEADER = "Prefer-Html-Meta-Tags";
	private static final String TAG_EXTRACTION_JAVASCRIPT = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";
	private final Context context;


/*
	static Map access$000(JSONArray jsonarray)
		throws JSONException
	{
		return parseAlData(jsonarray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method Map parseAlData(JSONArray)>
	//    2    4:areturn         
	}

*/


/*
	static AppLink access$100(Map map, Uri uri)
	{
		return makeAppLinkFromAlData(map, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #74  <Method AppLink makeAppLinkFromAlData(Map, Uri)>
	//    3    5:areturn         
	}

*/


/*
	static Context access$200(WebViewAppLinkResolver webviewapplinkresolver)
	{
		return webviewapplinkresolver.context;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(URLConnection urlconnection)
		throws IOException
	{
		return readFromConnection(urlconnection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #83  <Method String readFromConnection(URLConnection)>
	//    2    4:areturn         
	}

*/
}
