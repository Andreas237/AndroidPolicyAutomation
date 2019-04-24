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
//			Continuation

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
						obj = null;
	//   21   54:aconst_null     
	//   22   55:astore          5
						int i = 0;
	//   23   57:iconst_0        
	//   24   58:istore_2        
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
	//    3    7:astore          5
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #181 <Method int JSONArray.length()>
	//*   9   16:icmpge          248
		{
			JSONObject jsonobject = jsonarray.getJSONObject(i);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #185 <Method JSONObject JSONArray.getJSONObject(int)>
	//   13   24:astore          8
			String as[] = jsonobject.getString("property").split(":");
	//   14   26:aload           8
	//   15   28:ldc1            #187 <String "property">
	//   16   30:invokevirtual   #193 <Method String JSONObject.getString(String)>
	//   17   33:ldc1            #195 <String ":">
	//   18   35:invokevirtual   #199 <Method String[] String.split(String)>
	//   19   38:astore          9
			if(!as[0].equals("al"))
	//*  20   40:aload           9
	//*  21   42:iconst_0        
	//*  22   43:aaload          
	//*  23   44:ldc1            #45  <String "al">
	//*  24   46:invokevirtual   #202 <Method boolean String.equals(Object)>
	//*  25   49:ifne            55
				continue;
	//   26   52:goto            241
			Object obj = ((Object) (hashmap));
	//   27   55:aload           5
	//   28   57:astore_3        
			int j = 1;
	//   29   58:iconst_1        
	//   30   59:istore_2        
			do
			{
				Object obj2 = null;
	//   31   60:aconst_null     
	//   32   61:astore          6
				if(j >= as.length)
					break;
	//   33   63:iload_2         
	//   34   64:aload           9
	//   35   66:arraylength     
	//   36   67:icmpge          192
				List list = (List)((Map) (obj)).get(((Object) (as[j])));
	//   37   70:aload_3         
	//   38   71:aload           9
	//   39   73:iload_2         
	//   40   74:aaload          
	//   41   75:invokeinterface #91  <Method Object Map.get(Object)>
	//   42   80:checkcast       #93  <Class List>
	//   43   83:astore          7
				Object obj1 = ((Object) (list));
	//   44   85:aload           7
	//   45   87:astore          4
				if(list == null)
	//*  46   89:aload           7
	//*  47   91:ifnonnull       116
				{
					obj1 = ((Object) (new ArrayList()));
	//   48   94:new             #103 <Class ArrayList>
	//   49   97:dup             
	//   50   98:invokespecial   #104 <Method void ArrayList()>
	//   51  101:astore          4
					((Map) (obj)).put(((Object) (as[j])), obj1);
	//   52  103:aload_3         
	//   53  104:aload           9
	//   54  106:iload_2         
	//   55  107:aaload          
	//   56  108:aload           4
	//   57  110:invokeinterface #206 <Method Object Map.put(Object, Object)>
	//   58  115:pop             
				}
				obj = ((Object) (obj2));
	//   59  116:aload           6
	//   60  118:astore_3        
				if(((List) (obj1)).size() > 0)
	//*  61  119:aload           4
	//*  62  121:invokeinterface #124 <Method int List.size()>
	//*  63  126:ifle            149
					obj = ((Object) ((Map)((List) (obj1)).get(((List) (obj1)).size() - 1)));
	//   64  129:aload           4
	//   65  131:aload           4
	//   66  133:invokeinterface #124 <Method int List.size()>
	//   67  138:iconst_1        
	//   68  139:isub            
	//   69  140:invokeinterface #133 <Method Object List.get(int)>
	//   70  145:checkcast       #87  <Class Map>
	//   71  148:astore_3        
				if(obj == null || j == as.length - 1)
	//*  72  149:aload_3         
	//*  73  150:ifnull          168
	//*  74  153:iload_2         
	//*  75  154:aload           9
	//*  76  156:arraylength     
	//*  77  157:iconst_1        
	//*  78  158:isub            
	//*  79  159:icmpne          165
	//*  80  162:goto            168
	//*  81  165:goto            185
				{
					obj = ((Object) (new HashMap()));
	//   82  168:new             #175 <Class HashMap>
	//   83  171:dup             
	//   84  172:invokespecial   #176 <Method void HashMap()>
	//   85  175:astore_3        
					((List) (obj1)).add(obj);
	//   86  176:aload           4
	//   87  178:aload_3         
	//   88  179:invokeinterface #148 <Method boolean List.add(Object)>
	//   89  184:pop             
				}
				j++;
	//   90  185:iload_2         
	//   91  186:iconst_1        
	//   92  187:iadd            
	//   93  188:istore_2        
			} while(true);
	//   94  189:goto            60
			if(!jsonobject.has("content"))
				continue;
	//   95  192:aload           8
	//   96  194:ldc1            #208 <String "content">
	//   97  196:invokevirtual   #212 <Method boolean JSONObject.has(String)>
	//   98  199:ifeq            241
			if(jsonobject.isNull("content"))
	//*  99  202:aload           8
	//* 100  204:ldc1            #208 <String "content">
	//* 101  206:invokevirtual   #215 <Method boolean JSONObject.isNull(String)>
	//* 102  209:ifeq            225
				((Map) (obj)).put("value", ((Object) (null)));
	//  103  212:aload_3         
	//  104  213:ldc1            #20  <String "value">
	//  105  215:aconst_null     
	//  106  216:invokeinterface #206 <Method Object Map.put(Object, Object)>
	//  107  221:pop             
			else
	//* 108  222:goto            241
				((Map) (obj)).put("value", ((Object) (jsonobject.getString("content"))));
	//  109  225:aload_3         
	//  110  226:ldc1            #20  <String "value">
	//  111  228:aload           8
	//  112  230:ldc1            #208 <String "content">
	//  113  232:invokevirtual   #193 <Method String JSONObject.getString(String)>
	//  114  235:invokeinterface #206 <Method Object Map.put(Object, Object)>
	//  115  240:pop             
		}

	//  116  241:iload_1         
	//  117  242:iconst_1        
	//  118  243:iadd            
	//  119  244:istore_1        
	//* 120  245:goto            11
		return ((Map) (hashmap));
	//  121  248:aload           5
	//  122  250:areturn         
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
	//*  45   89:ifnonnull       145
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
	//*  58  112:icmpge          184
	//*  59  115:aload           4
	//*  60  117:iload_1         
	//*  61  118:aaload          
	//*  62  119:invokevirtual   #253 <Method String String.trim()>
	//*  63  122:astore_0        
	//*  64  123:aload_0         
	//*  65  124:ldc1            #255 <String "charset=">
	//*  66  126:invokevirtual   #258 <Method boolean String.startsWith(String)>
	//*  67  129:ifeq            177
	//*  68  132:aload_0         
	//*  69  133:ldc1            #255 <String "charset=">
	//*  70  135:invokevirtual   #259 <Method int String.length()>
	//*  71  138:invokevirtual   #263 <Method String String.substring(int)>
	//*  72  141:astore_0        
	//*  73  142:goto            184
	//*  74  145:new             #135 <Class String>
	//*  75  148:dup             
	//*  76  149:aload           6
	//*  77  151:invokevirtual   #267 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  78  154:aload           4
	//*  79  156:invokespecial   #270 <Method void String(byte[], String)>
	//*  80  159:astore_0        
	//*  81  160:aload_3         
	//*  82  161:invokevirtual   #273 <Method void InputStream.close()>
	//*  83  164:aload_0         
	//*  84  165:areturn         
	//*  85  166:astore_0        
	//*  86  167:aload_3         
	//*  87  168:invokevirtual   #273 <Method void InputStream.close()>
	//*  88  171:aload_0         
	//*  89  172:athrow          
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
			break MISSING_BLOCK_LABEL_184;
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
			urlconnection = ((URLConnection) (((String) (urlconnection)).substring("charset=".length())));
			break MISSING_BLOCK_LABEL_184;
		}
	//*  90  173:astore_3        
	//*  91  174:goto            21
		i++;
	//   92  177:iload_1         
	//   93  178:iconst_1        
	//   94  179:iadd            
	//   95  180:istore_1        
		if(true) goto _L6; else goto _L5
	//   96  181:goto            107
_L5:
		obj = ((Object) (urlconnection));
	//   97  184:aload_0         
	//   98  185:astore          4
		if(urlconnection == null)
	//*  99  187:aload_0         
	//* 100  188:ifnonnull       145
			obj = "UTF-8";
	//  101  191:ldc2            #275 <String "UTF-8">
	//  102  194:astore          4
		  goto _L3
	//* 103  196:goto            145
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
	//    5    7:invokestatic    #280 <Method Uri Uri.parse(String)>
	//    6   10:areturn         
	}

	public Task getAppLinkFromUrlInBackground(final Uri url)
	{
		final Capture content = new Capture();
	//    0    0:new             #284 <Class Capture>
	//    1    3:dup             
	//    2    4:invokespecial   #285 <Method void Capture()>
	//    3    7:astore_2        
		final Capture contentType = new Capture();
	//    4    8:new             #284 <Class Capture>
	//    5   11:dup             
	//    6   12:invokespecial   #285 <Method void Capture()>
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
				do
				{
					if(url1 == null)
						break;
			//    9   17:aload_2         
			//   10   18:ifnull          115
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
			//*  30   56:ifeq            110
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
							continue;
			//   51  107:goto            17
						}
					}
					url1 = null;
			//   52  110:aconst_null     
			//   53  111:astore_2        
				} while(true);
			//   54  112:goto            17
				content.set(((Object) (WebViewAppLinkResolver.readFromConnection(urlconnection))));
			//   55  115:aload_0         
			//   56  116:getfield        #27  <Field Capture val$content>
			//   57  119:aload_3         
			//   58  120:invokestatic    #92  <Method String WebViewAppLinkResolver.access$300(URLConnection)>
			//   59  123:invokevirtual   #98  <Method void Capture.set(Object)>
				contentType.set(((Object) (urlconnection.getContentType())));
			//   60  126:aload_0         
			//   61  127:getfield        #29  <Field Capture val$contentType>
			//   62  130:aload_3         
			//   63  131:invokevirtual   #101 <Method String URLConnection.getContentType()>
			//   64  134:invokevirtual   #98  <Method void Capture.set(Object)>
				if(urlconnection instanceof HttpURLConnection)
			//*  65  137:aload_3         
			//*  66  138:instanceof      #58  <Class HttpURLConnection>
			//*  67  141:ifeq            151
					((HttpURLConnection)urlconnection).disconnect();
			//   68  144:aload_3         
			//   69  145:checkcast       #58  <Class HttpURLConnection>
			//   70  148:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
				return null;
			//   71  151:aconst_null     
			//   72  152:areturn         
				Exception exception;
				exception;
			//   73  153:astore_2        
				if(urlconnection instanceof HttpURLConnection)
			//*  74  154:aload_3         
			//*  75  155:instanceof      #58  <Class HttpURLConnection>
			//*  76  158:ifeq            168
					((HttpURLConnection)urlconnection).disconnect();
			//   77  161:aload_3         
			//   78  162:checkcast       #58  <Class HttpURLConnection>
			//   79  165:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
				throw exception;
			//   80  168:aload_2         
			//   81  169:athrow          
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
				Task.TaskCompletionSource taskcompletionsource = Task.create();
			//    0    0:invokestatic    #47  <Method Task$TaskCompletionSource Task.create()>
			//    1    3:astore_2        
				WebView webview = new WebView(context);
			//    2    4:new             #49  <Class WebView>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:getfield        #27  <Field WebViewAppLinkResolver this$0>
			//    6   12:invokestatic    #53  <Method Context WebViewAppLinkResolver.access$200(WebViewAppLinkResolver)>
			//    7   15:invokespecial   #56  <Method void WebView(Context)>
			//    8   18:astore_3        
				webview.getSettings().setJavaScriptEnabled(true);
			//    9   19:aload_3         
			//   10   20:invokevirtual   #60  <Method WebSettings WebView.getSettings()>
			//   11   23:iconst_1        
			//   12   24:invokevirtual   #66  <Method void WebSettings.setJavaScriptEnabled(boolean)>
				webview.setNetworkAvailable(false);
			//   13   27:aload_3         
			//   14   28:iconst_0        
			//   15   29:invokevirtual   #69  <Method void WebView.setNetworkAvailable(boolean)>
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
			//   16   32:aload_3         
			//   17   33:new             #14  <Class WebViewAppLinkResolver$2$1>
			//   18   36:dup             
			//   19   37:aload_0         
			//   20   38:invokespecial   #72  <Method void WebViewAppLinkResolver$2$1(WebViewAppLinkResolver$2)>
			//   21   41:invokevirtual   #76  <Method void WebView.setWebViewClient(WebViewClient)>
				webview.addJavascriptInterface(((Object) (((_cls2) (taskcompletionsource)). new Object() {

					public void setValue(String s)
					{
						try
						{
							tcs.trySetResult(((Object) (new JSONArray(s))));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field Task$TaskCompletionSource val$tcs>
					//    2    4:new             #30  <Class JSONArray>
					//    3    7:dup             
					//    4    8:aload_1         
					//    5    9:invokespecial   #32  <Method void JSONArray(String)>
					//    6   12:invokevirtual   #38  <Method boolean Task$TaskCompletionSource.trySetResult(Object)>
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
					//   11   19:getfield        #19  <Field Task$TaskCompletionSource val$tcs>
					//   12   22:aload_1         
					//   13   23:invokevirtual   #42  <Method boolean Task$TaskCompletionSource.trySetError(Exception)>
					//   14   26:pop             
						}
					//   15   27:return          
					}

					final _cls2 this$1;
					final Task.TaskCompletionSource val$tcs;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewAppLinkResolver$2 this$1>
				tcs = Task.TaskCompletionSource.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Task$TaskCompletionSource val$tcs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
				}
)), "boltsWebViewAppLinkResolverResult");
			//   22   44:aload_3         
			//   23   45:new             #16  <Class WebViewAppLinkResolver$2$2>
			//   24   48:dup             
			//   25   49:aload_0         
			//   26   50:aload_2         
			//   27   51:invokespecial   #79  <Method void WebViewAppLinkResolver$2$2(WebViewAppLinkResolver$2, Task$TaskCompletionSource)>
			//   28   54:ldc1            #81  <String "boltsWebViewAppLinkResolverResult">
			//   29   56:invokevirtual   #85  <Method void WebView.addJavascriptInterface(Object, String)>
				if(contentType.get() != null)
			//*  30   59:aload_0         
			//*  31   60:getfield        #29  <Field Capture val$contentType>
			//*  32   63:invokevirtual   #91  <Method Object Capture.get()>
			//*  33   66:ifnull          90
					task = ((Task) (((String)contentType.get()).split(";")[0]));
			//   34   69:aload_0         
			//   35   70:getfield        #29  <Field Capture val$contentType>
			//   36   73:invokevirtual   #91  <Method Object Capture.get()>
			//   37   76:checkcast       #93  <Class String>
			//   38   79:ldc1            #95  <String ";">
			//   39   81:invokevirtual   #99  <Method String[] String.split(String)>
			//   40   84:iconst_0        
			//   41   85:aaload          
			//   42   86:astore_1        
				else
			//*  43   87:goto            92
					task = null;
			//   44   90:aconst_null     
			//   45   91:astore_1        
				webview.loadDataWithBaseURL(url.toString(), (String)content.get(), ((String) (task)), ((String) (null)), ((String) (null)));
			//   46   92:aload_3         
			//   47   93:aload_0         
			//   48   94:getfield        #31  <Field Uri val$url>
			//   49   97:invokevirtual   #105 <Method String Uri.toString()>
			//   50  100:aload_0         
			//   51  101:getfield        #33  <Field Capture val$content>
			//   52  104:invokevirtual   #91  <Method Object Capture.get()>
			//   53  107:checkcast       #93  <Class String>
			//   54  110:aload_1         
			//   55  111:aconst_null     
			//   56  112:aconst_null     
			//   57  113:invokevirtual   #109 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
				return taskcompletionsource.getTask();
			//   58  116:aload_2         
			//   59  117:invokevirtual   #115 <Method Task Task$TaskCompletionSource.getTask()>
			//   60  120:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #121 <Method Task then(Task)>
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
	//   14   24:invokespecial   #288 <Method void WebViewAppLinkResolver$3(WebViewAppLinkResolver, Uri, Capture, Capture)>
	//   15   27:invokestatic    #294 <Method Task Task.callInBackground(Callable)>
	//   16   30:new             #10  <Class WebViewAppLinkResolver$2>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokespecial   #297 <Method void WebViewAppLinkResolver$2(WebViewAppLinkResolver, Capture, Uri, Capture)>
	//   23   41:getstatic       #301 <Field java.util.concurrent.Executor Task.UI_THREAD_EXECUTOR>
	//   24   44:invokevirtual   #305 <Method Task Task.onSuccessTask(Continuation, java.util.concurrent.Executor)>
	//   25   47:new             #8   <Class WebViewAppLinkResolver$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokespecial   #308 <Method void WebViewAppLinkResolver$1(WebViewAppLinkResolver, Uri)>
	//   30   56:invokevirtual   #312 <Method Task Task.onSuccess(Continuation)>
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
