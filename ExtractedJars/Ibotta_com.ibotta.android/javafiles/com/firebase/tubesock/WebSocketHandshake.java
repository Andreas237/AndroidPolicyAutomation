// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.net.URI;
import java.util.*;

// Referenced classes of package com.firebase.tubesock:
//			Base64, WebSocketException

class WebSocketHandshake
{

	public WebSocketHandshake(URI uri, String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		url = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field URI url>
		protocol = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field String protocol>
		nonce = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field String nonce>
		extraHeaders = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field Map extraHeaders>
		url = uri;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #22  <Field URI url>
		protocol = s;
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:putfield        #24  <Field String protocol>
		extraHeaders = map;
	//   20   34:aload_0         
	//   21   35:aload_3         
	//   22   36:putfield        #28  <Field Map extraHeaders>
		nonce = createNonce();
	//   23   39:aload_0         
	//   24   40:aload_0         
	//   25   41:invokespecial   #32  <Method String createNonce()>
	//   26   44:putfield        #26  <Field String nonce>
	//   27   47:return          
	}

	private String createNonce()
	{
		byte abyte0[] = new byte[16];
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		for(int i = 0; i < 16; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:bipush          16
	//*   7   10:icmpge          32
			abyte0[i] = (byte)rand(0, 255);
	//    8   13:aload_2         
	//    9   14:iload_1         
	//   10   15:aload_0         
	//   11   16:iconst_0        
	//   12   17:sipush          255
	//   13   20:invokespecial   #39  <Method int rand(int, int)>
	//   14   23:int2byte        
	//   15   24:bastore         

	//   16   25:iload_1         
	//   17   26:iconst_1        
	//   18   27:iadd            
	//   19   28:istore_1        
	//*  20   29:goto            7
		return Base64.encodeToString(abyte0, false);
	//   21   32:aload_2         
	//   22   33:iconst_0        
	//   23   34:invokestatic    #45  <Method String Base64.encodeToString(byte[], boolean)>
	//   24   37:areturn         
	}

	private String generateHeader(LinkedHashMap linkedhashmap)
	{
		String s = new String();
	//    0    0:new             #49  <Class String>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void String()>
	//    3    7:astore_2        
		for(Iterator iterator = linkedhashmap.keySet().iterator(); iterator.hasNext();)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #56  <Method Set LinkedHashMap.keySet()>
	//*   6   12:invokeinterface #62  <Method Iterator Set.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            102
		{
			String s1 = (String)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #72  <Method Object Iterator.next()>
	//   13   33:checkcast       #49  <Class String>
	//   14   36:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   15   38:new             #74  <Class StringBuilder>
	//   16   41:dup             
	//   17   42:invokespecial   #75  <Method void StringBuilder()>
	//   18   45:astore          5
			stringbuilder.append(s);
	//   19   47:aload           5
	//   20   49:aload_2         
	//   21   50:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   22   53:pop             
			stringbuilder.append(s1);
	//   23   54:aload           5
	//   24   56:aload           4
	//   25   58:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
			stringbuilder.append(": ");
	//   27   62:aload           5
	//   28   64:ldc1            #81  <String ": ">
	//   29   66:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   30   69:pop             
			stringbuilder.append((String)linkedhashmap.get(((Object) (s1))));
	//   31   70:aload           5
	//   32   72:aload_1         
	//   33   73:aload           4
	//   34   75:invokevirtual   #85  <Method Object LinkedHashMap.get(Object)>
	//   35   78:checkcast       #49  <Class String>
	//   36   81:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder.append("\r\n");
	//   38   85:aload           5
	//   39   87:ldc1            #87  <String "\r\n">
	//   40   89:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   41   92:pop             
			s = stringbuilder.toString();
	//   42   93:aload           5
	//   43   95:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   44   98:astore_2        
		}

	//*  45   99:goto            18
		return s;
	//   46  102:aload_2         
	//   47  103:areturn         
	}

	private int rand(int i, int j)
	{
		return (int)(Math.random() * (double)j + (double)i);
	//    0    0:invokestatic    #97  <Method double Math.random()>
	//    1    3:iload_2         
	//    2    4:i2d             
	//    3    5:dmul            
	//    4    6:iload_1         
	//    5    7:i2d             
	//    6    8:dadd            
	//    7    9:d2i             
	//    8   10:ireturn         
	}

	public byte[] getHandshake()
	{
		Object obj2 = ((Object) (url.getPath()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field URI url>
	//    2    4:invokevirtual   #104 <Method String URI.getPath()>
	//    3    7:astore_3        
		Object obj = ((Object) (url.getQuery()));
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field URI url>
	//    6   12:invokevirtual   #107 <Method String URI.getQuery()>
	//    7   15:astore_1        
		Object obj1 = ((Object) (new StringBuilder()));
	//    8   16:new             #74  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #75  <Method void StringBuilder()>
	//   11   23:astore_2        
		((StringBuilder) (obj1)).append(((String) (obj2)));
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		if(obj == null)
	//*  16   30:aload_1         
	//*  17   31:ifnonnull       40
		{
			obj = "";
	//   18   34:ldc1            #109 <String "">
	//   19   36:astore_1        
		} else
	//*  20   37:goto            66
		{
			obj2 = ((Object) (new StringBuilder()));
	//   21   40:new             #74  <Class StringBuilder>
	//   22   43:dup             
	//   23   44:invokespecial   #75  <Method void StringBuilder()>
	//   24   47:astore_3        
			((StringBuilder) (obj2)).append("?");
	//   25   48:aload_3         
	//   26   49:ldc1            #111 <String "?">
	//   27   51:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (obj2)).append(((String) (obj)));
	//   29   55:aload_3         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			obj = ((Object) (((StringBuilder) (obj2)).toString()));
	//   33   61:aload_3         
	//   34   62:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   35   65:astore_1        
		}
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   36   66:aload_2         
	//   37   67:aload_1         
	//   38   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		obj2 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   40   72:aload_2         
	//   41   73:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   42   76:astore_3        
		obj1 = ((Object) (url.getHost()));
	//   43   77:aload_0         
	//   44   78:getfield        #22  <Field URI url>
	//   45   81:invokevirtual   #114 <Method String URI.getHost()>
	//   46   84:astore_2        
		obj = obj1;
	//   47   85:aload_2         
	//   48   86:astore_1        
		if(url.getPort() != -1)
	//*  49   87:aload_0         
	//*  50   88:getfield        #22  <Field URI url>
	//*  51   91:invokevirtual   #118 <Method int URI.getPort()>
	//*  52   94:iconst_m1       
	//*  53   95:icmpeq          136
		{
			obj = ((Object) (new StringBuilder()));
	//   54   98:new             #74  <Class StringBuilder>
	//   55  101:dup             
	//   56  102:invokespecial   #75  <Method void StringBuilder()>
	//   57  105:astore_1        
			((StringBuilder) (obj)).append(((String) (obj1)));
	//   58  106:aload_1         
	//   59  107:aload_2         
	//   60  108:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   61  111:pop             
			((StringBuilder) (obj)).append(":");
	//   62  112:aload_1         
	//   63  113:ldc1            #120 <String ":">
	//   64  115:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   65  118:pop             
			((StringBuilder) (obj)).append(url.getPort());
	//   66  119:aload_1         
	//   67  120:aload_0         
	//   68  121:getfield        #22  <Field URI url>
	//   69  124:invokevirtual   #118 <Method int URI.getPort()>
	//   70  127:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   71  130:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   72  131:aload_1         
	//   73  132:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   74  135:astore_1        
		}
		obj1 = ((Object) (new LinkedHashMap()));
	//   75  136:new             #52  <Class LinkedHashMap>
	//   76  139:dup             
	//   77  140:invokespecial   #124 <Method void LinkedHashMap()>
	//   78  143:astore_2        
		((LinkedHashMap) (obj1)).put("Host", obj);
	//   79  144:aload_2         
	//   80  145:ldc1            #126 <String "Host">
	//   81  147:aload_1         
	//   82  148:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//   83  151:pop             
		((LinkedHashMap) (obj1)).put("Upgrade", "websocket");
	//   84  152:aload_2         
	//   85  153:ldc1            #132 <String "Upgrade">
	//   86  155:ldc1            #134 <String "websocket">
	//   87  157:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//   88  160:pop             
		((LinkedHashMap) (obj1)).put("Connection", "Upgrade");
	//   89  161:aload_2         
	//   90  162:ldc1            #136 <String "Connection">
	//   91  164:ldc1            #132 <String "Upgrade">
	//   92  166:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//   93  169:pop             
		((LinkedHashMap) (obj1)).put("Sec-WebSocket-Version", "13");
	//   94  170:aload_2         
	//   95  171:ldc1            #138 <String "Sec-WebSocket-Version">
	//   96  173:ldc1            #8   <String "13">
	//   97  175:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//   98  178:pop             
		((LinkedHashMap) (obj1)).put("Sec-WebSocket-Key", ((Object) (nonce)));
	//   99  179:aload_2         
	//  100  180:ldc1            #140 <String "Sec-WebSocket-Key">
	//  101  182:aload_0         
	//  102  183:getfield        #26  <Field String nonce>
	//  103  186:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//  104  189:pop             
		obj = ((Object) (protocol));
	//  105  190:aload_0         
	//  106  191:getfield        #24  <Field String protocol>
	//  107  194:astore_1        
		if(obj != null)
	//* 108  195:aload_1         
	//* 109  196:ifnull          207
			((LinkedHashMap) (obj1)).put("Sec-WebSocket-Protocol", obj);
	//  110  199:aload_2         
	//  111  200:ldc1            #142 <String "Sec-WebSocket-Protocol">
	//  112  202:aload_1         
	//  113  203:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//  114  206:pop             
		obj = ((Object) (extraHeaders));
	//  115  207:aload_0         
	//  116  208:getfield        #28  <Field Map extraHeaders>
	//  117  211:astore_1        
		if(obj != null)
	//* 118  212:aload_1         
	//* 119  213:ifnull          278
		{
			obj = ((Object) (((Map) (obj)).keySet().iterator()));
	//  120  216:aload_1         
	//  121  217:invokeinterface #145 <Method Set Map.keySet()>
	//  122  222:invokeinterface #62  <Method Iterator Set.iterator()>
	//  123  227:astore_1        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//  124  228:aload_1         
	//  125  229:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//  126  234:ifeq            278
				String s = (String)((Iterator) (obj)).next();
	//  127  237:aload_1         
	//  128  238:invokeinterface #72  <Method Object Iterator.next()>
	//  129  243:checkcast       #49  <Class String>
	//  130  246:astore          4
				if(!((LinkedHashMap) (obj1)).containsKey(((Object) (s))))
	//* 131  248:aload_2         
	//* 132  249:aload           4
	//* 133  251:invokevirtual   #149 <Method boolean LinkedHashMap.containsKey(Object)>
	//* 134  254:ifne            228
					((LinkedHashMap) (obj1)).put(((Object) (s)), extraHeaders.get(((Object) (s))));
	//  135  257:aload_2         
	//  136  258:aload           4
	//  137  260:aload_0         
	//  138  261:getfield        #28  <Field Map extraHeaders>
	//  139  264:aload           4
	//  140  266:invokeinterface #150 <Method Object Map.get(Object)>
	//  141  271:invokevirtual   #130 <Method Object LinkedHashMap.put(Object, Object)>
	//  142  274:pop             
			} while(true);
	//  143  275:goto            228
		}
		obj = ((Object) (new StringBuilder()));
	//  144  278:new             #74  <Class StringBuilder>
	//  145  281:dup             
	//  146  282:invokespecial   #75  <Method void StringBuilder()>
	//  147  285:astore_1        
		((StringBuilder) (obj)).append("GET ");
	//  148  286:aload_1         
	//  149  287:ldc1            #152 <String "GET ">
	//  150  289:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  151  292:pop             
		((StringBuilder) (obj)).append(((String) (obj2)));
	//  152  293:aload_1         
	//  153  294:aload_3         
	//  154  295:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  155  298:pop             
		((StringBuilder) (obj)).append(" HTTP/1.1\r\n");
	//  156  299:aload_1         
	//  157  300:ldc1            #154 <String " HTTP/1.1\r\n">
	//  158  302:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  159  305:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  160  306:aload_1         
	//  161  307:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  162  310:astore_1        
		obj2 = ((Object) (new StringBuilder()));
	//  163  311:new             #74  <Class StringBuilder>
	//  164  314:dup             
	//  165  315:invokespecial   #75  <Method void StringBuilder()>
	//  166  318:astore_3        
		((StringBuilder) (obj2)).append(((String) (obj)));
	//  167  319:aload_3         
	//  168  320:aload_1         
	//  169  321:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  170  324:pop             
		((StringBuilder) (obj2)).append(generateHeader(((LinkedHashMap) (obj1))));
	//  171  325:aload_3         
	//  172  326:aload_0         
	//  173  327:aload_2         
	//  174  328:invokespecial   #156 <Method String generateHeader(LinkedHashMap)>
	//  175  331:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  176  334:pop             
		obj = ((Object) (((StringBuilder) (obj2)).toString()));
	//  177  335:aload_3         
	//  178  336:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  179  339:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//  180  340:new             #74  <Class StringBuilder>
	//  181  343:dup             
	//  182  344:invokespecial   #75  <Method void StringBuilder()>
	//  183  347:astore_2        
		((StringBuilder) (obj1)).append(((String) (obj)));
	//  184  348:aload_2         
	//  185  349:aload_1         
	//  186  350:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  187  353:pop             
		((StringBuilder) (obj1)).append("\r\n");
	//  188  354:aload_2         
	//  189  355:ldc1            #87  <String "\r\n">
	//  190  357:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  191  360:pop             
		obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//  192  361:aload_2         
	//  193  362:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  194  365:astore_1        
		byte abyte0[] = new byte[((String) (obj)).getBytes().length];
	//  195  366:aload_1         
	//  196  367:invokevirtual   #159 <Method byte[] String.getBytes()>
	//  197  370:arraylength     
	//  198  371:newarray        byte[]
	//  199  373:astore_2        
		System.arraycopy(((Object) (((String) (obj)).getBytes())), 0, ((Object) (abyte0)), 0, ((String) (obj)).getBytes().length);
	//  200  374:aload_1         
	//  201  375:invokevirtual   #159 <Method byte[] String.getBytes()>
	//  202  378:iconst_0        
	//  203  379:aload_2         
	//  204  380:iconst_0        
	//  205  381:aload_1         
	//  206  382:invokevirtual   #159 <Method byte[] String.getBytes()>
	//  207  385:arraylength     
	//  208  386:invokestatic    #165 <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//  209  389:aload_2         
	//  210  390:areturn         
	}

	public void verifyServerHandshakeHeaders(HashMap hashmap)
	{
		if(((String)hashmap.get("Upgrade")).toLowerCase(Locale.US).equals("websocket"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #132 <String "Upgrade">
	//*   2    3:invokevirtual   #170 <Method Object HashMap.get(Object)>
	//*   3    6:checkcast       #49  <Class String>
	//*   4    9:getstatic       #176 <Field Locale Locale.US>
	//*   5   12:invokevirtual   #180 <Method String String.toLowerCase(Locale)>
	//*   6   15:ldc1            #134 <String "websocket">
	//*   7   17:invokevirtual   #183 <Method boolean String.equals(Object)>
	//*   8   20:ifeq            57
		{
			if(((String)hashmap.get("Connection")).toLowerCase(Locale.US).equals("upgrade"))
	//*   9   23:aload_1         
	//*  10   24:ldc1            #136 <String "Connection">
	//*  11   26:invokevirtual   #170 <Method Object HashMap.get(Object)>
	//*  12   29:checkcast       #49  <Class String>
	//*  13   32:getstatic       #176 <Field Locale Locale.US>
	//*  14   35:invokevirtual   #180 <Method String String.toLowerCase(Locale)>
	//*  15   38:ldc1            #185 <String "upgrade">
	//*  16   40:invokevirtual   #183 <Method boolean String.equals(Object)>
	//*  17   43:ifeq            47
				return;
	//   18   46:return          
			else
				throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
	//   19   47:new             #187 <Class WebSocketException>
	//   20   50:dup             
	//   21   51:ldc1            #189 <String "connection failed: missing header field in server handshake: Connection">
	//   22   53:invokespecial   #192 <Method void WebSocketException(String)>
	//   23   56:athrow          
		} else
		{
			throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
	//   24   57:new             #187 <Class WebSocketException>
	//   25   60:dup             
	//   26   61:ldc1            #194 <String "connection failed: missing header field in server handshake: Upgrade">
	//   27   63:invokespecial   #192 <Method void WebSocketException(String)>
	//   28   66:athrow          
		}
	}

	public void verifyServerStatusLine(String s)
	{
		int i = Integer.valueOf(s.substring(9, 12)).intValue();
	//    0    0:aload_1         
	//    1    1:bipush          9
	//    2    3:bipush          12
	//    3    5:invokevirtual   #200 <Method String String.substring(int, int)>
	//    4    8:invokestatic    #206 <Method Integer Integer.valueOf(String)>
	//    5   11:invokevirtual   #209 <Method int Integer.intValue()>
	//    6   14:istore_2        
		if(i != 407)
	//*   7   15:iload_2         
	//*   8   16:sipush          407
	//*   9   19:icmpeq          79
		{
			if(i != 404)
	//*  10   22:iload_2         
	//*  11   23:sipush          404
	//*  12   26:icmpeq          69
			{
				if(i == 101)
	//*  13   29:iload_2         
	//*  14   30:bipush          101
	//*  15   32:icmpne          36
				{
					return;
	//   16   35:return          
				} else
				{
					s = ((String) (new StringBuilder()));
	//   17   36:new             #74  <Class StringBuilder>
	//   18   39:dup             
	//   19   40:invokespecial   #75  <Method void StringBuilder()>
	//   20   43:astore_1        
					((StringBuilder) (s)).append("connection failed: unknown status code ");
	//   21   44:aload_1         
	//   22   45:ldc1            #211 <String "connection failed: unknown status code ">
	//   23   47:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
					((StringBuilder) (s)).append(i);
	//   25   51:aload_1         
	//   26   52:iload_2         
	//   27   53:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   28   56:pop             
					throw new WebSocketException(((StringBuilder) (s)).toString());
	//   29   57:new             #187 <Class WebSocketException>
	//   30   60:dup             
	//   31   61:aload_1         
	//   32   62:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   33   65:invokespecial   #192 <Method void WebSocketException(String)>
	//   34   68:athrow          
				}
			} else
			{
				throw new WebSocketException("connection failed: 404 not found");
	//   35   69:new             #187 <Class WebSocketException>
	//   36   72:dup             
	//   37   73:ldc1            #213 <String "connection failed: 404 not found">
	//   38   75:invokespecial   #192 <Method void WebSocketException(String)>
	//   39   78:athrow          
			}
		} else
		{
			throw new WebSocketException("connection failed: proxy authentication not supported");
	//   40   79:new             #187 <Class WebSocketException>
	//   41   82:dup             
	//   42   83:ldc1            #215 <String "connection failed: proxy authentication not supported">
	//   43   85:invokespecial   #192 <Method void WebSocketException(String)>
	//   44   88:athrow          
		}
	}

	private static final String WEBSOCKET_VERSION = "13";
	private Map extraHeaders;
	private String nonce;
	private String protocol;
	private URI url;
}
