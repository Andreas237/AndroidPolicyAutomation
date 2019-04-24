// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.iid.InstanceID;
import com.mixpanel.android.a.b;
import com.mixpanel.android.a.f;
import com.mixpanel.android.a.h;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			a, s, h, d, 
//			e, i, j

class a$e
{
	class a extends Handler
	{

		private JSONObject a(a.a a1)
		{
			JSONObject jsonobject = new JSONObject();
		//    0    0:new             #64  <Class JSONObject>
		//    1    3:dup             
		//    2    4:invokespecial   #67  <Method void JSONObject()>
		//    3    7:astore_2        
			JSONObject jsonobject1 = a1.b();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #72  <Method JSONObject com.mixpanel.android.mpmetrics.a$a.b()>
		//    6   12:astore_3        
			JSONObject jsonobject2 = b();
		//    7   13:aload_0         
		//    8   14:invokespecial   #73  <Method JSONObject b()>
		//    9   17:astore          4
			jsonobject2.put("token", ((Object) (a1.d())));
		//   10   19:aload           4
		//   11   21:ldc1            #75  <String "token">
		//   12   23:aload_1         
		//   13   24:invokevirtual   #78  <Method String a$a.d()>
		//   14   27:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   15   30:pop             
			if(jsonobject1 != null)
		//*  16   31:aload_3         
		//*  17   32:ifnull          80
			{
				String s1;
				for(Iterator iterator = jsonobject1.keys(); iterator.hasNext(); jsonobject2.put(s1, jsonobject1.get(s1)))
		//*  18   35:aload_3         
		//*  19   36:invokevirtual   #86  <Method Iterator JSONObject.keys()>
		//*  20   39:astore          5
		//*  21   41:aload           5
		//*  22   43:invokeinterface #92  <Method boolean Iterator.hasNext()>
		//*  23   48:ifeq            80
					s1 = (String)iterator.next();
		//   24   51:aload           5
		//   25   53:invokeinterface #96  <Method Object Iterator.next()>
		//   26   58:checkcast       #98  <Class String>
		//   27   61:astore          6

		//   28   63:aload           4
		//   29   65:aload           6
		//   30   67:aload_3         
		//   31   68:aload           6
		//   32   70:invokevirtual   #102 <Method Object JSONObject.get(String)>
		//   33   73:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   34   76:pop             
			}
		//*  35   77:goto            41
			jsonobject.put("event", ((Object) (a1.a())));
		//   36   80:aload_2         
		//   37   81:ldc1            #104 <String "event">
		//   38   83:aload_1         
		//   39   84:invokevirtual   #106 <Method String a$a.a()>
		//   40   87:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   41   90:pop             
			jsonobject.put("properties", ((Object) (jsonobject2)));
		//   42   91:aload_2         
		//   43   92:ldc1            #108 <String "properties">
		//   44   94:aload           4
		//   45   96:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   46   99:pop             
			return jsonobject;
		//   47  100:aload_2         
		//   48  101:areturn         
		}

		private void a(i k, String s1)
		{
			if(!a.a.b().a(a.a.a, a.a.b.z()))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field a$e a>
		//*   2    4:getfield        #34  <Field a a$e.a>
		//*   3    7:invokevirtual   #112 <Method h com.mixpanel.android.mpmetrics.a.b()>
		//*   4   10:aload_0         
		//*   5   11:getfield        #26  <Field a$e a>
		//*   6   14:getfield        #34  <Field a a$e.a>
		//*   7   17:getfield        #37  <Field android.content.Context a.a>
		//*   8   20:aload_0         
		//*   9   21:getfield        #26  <Field a$e a>
		//*  10   24:getfield        #34  <Field a a$e.a>
		//*  11   27:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//*  12   30:invokevirtual   #116 <Method com.mixpanel.android.a.g h.z()>
		//*  13   33:invokeinterface #121 <Method boolean h.a(android.content.Context, com.mixpanel.android.a.g)>
		//*  14   38:ifne            54
			{
				com.mixpanel.android.mpmetrics.a.a(a.a, "Not flushing data to Mixpanel because the device is not connected to the internet.");
		//   15   41:aload_0         
		//   16   42:getfield        #26  <Field a$e a>
		//   17   45:getfield        #34  <Field a a$e.a>
		//   18   48:ldc1            #123 <String "Not flushing data to Mixpanel because the device is not connected to the internet.">
		//   19   50:invokestatic    #126 <Method void a.a(a, String)>
				return;
		//   20   53:return          
			} else
			{
				a(k, s1, i.b.EVENTS, a.a.b.k());
		//   21   54:aload_0         
		//   22   55:aload_1         
		//   23   56:aload_2         
		//   24   57:getstatic       #132 <Field i$b i$b.EVENTS>
		//   25   60:aload_0         
		//   26   61:getfield        #26  <Field a$e a>
		//   27   64:getfield        #34  <Field a a$e.a>
		//   28   67:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   29   70:invokevirtual   #135 <Method String h.k()>
		//   30   73:invokespecial   #138 <Method void a(i, String, i$b, String)>
				a(k, s1, i.b.PEOPLE, a.a.b.l());
		//   31   76:aload_0         
		//   32   77:aload_1         
		//   33   78:aload_2         
		//   34   79:getstatic       #141 <Field i$b i$b.PEOPLE>
		//   35   82:aload_0         
		//   36   83:getfield        #26  <Field a$e a>
		//   37   86:getfield        #34  <Field a a$e.a>
		//   38   89:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   39   92:invokevirtual   #144 <Method String h.l()>
		//   40   95:invokespecial   #138 <Method void a(i, String, i$b, String)>
				return;
		//   41   98:return          
			}
		}

		private void a(i k, String s1, i.b b1, String s2)
		{
			boolean flag3;
			Object obj;
			Object obj1;
			h h1;
			h1 = a.a.b();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field a$e a>
		//    2    4:getfield        #34  <Field a a$e.a>
		//    3    7:invokevirtual   #112 <Method h com.mixpanel.android.mpmetrics.a.b()>
		//    4   10:astore          13
			obj = ((Object) (c.b(s1)));
		//    5   12:aload_0         
		//    6   13:getfield        #50  <Field d c>
		//    7   16:aload_2         
		//    8   17:invokevirtual   #161 <Method e com.mixpanel.android.mpmetrics.d.b(String)>
		//    9   20:astore          9
			if(obj != null && ((e) (obj)).d() != null)
		//*  10   22:aload           9
		//*  11   24:ifnull          44
		//*  12   27:aload           9
		//*  13   29:invokevirtual   #166 <Method Boolean e.d()>
		//*  14   32:ifnonnull       38
		//*  15   35:goto            44
				flag3 = true;
		//   16   38:iconst_1        
		//   17   39:istore          8
			else
		//*  18   41:goto            47
				flag3 = false;
		//   19   44:iconst_0        
		//   20   45:istore          8
			String as[] = k.a(b1, s1, flag3);
		//   21   47:aload_1         
		//   22   48:aload_3         
		//   23   49:aload_2         
		//   24   50:iload           8
		//   25   52:invokevirtual   #171 <Method String[] i.a(i$b, String, boolean)>
		//   26   55:astore          11
			obj = ((Object) (Integer.valueOf(0)));
		//   27   57:iconst_0        
		//   28   58:invokestatic    #177 <Method Integer Integer.valueOf(int)>
		//   29   61:astore          9
			obj1 = ((Object) (as));
		//   30   63:aload           11
		//   31   65:astore          10
			if(as != null)
		//*  32   67:aload           11
		//*  33   69:ifnull          85
			{
				obj = ((Object) (Integer.valueOf(as[2])));
		//   34   72:aload           11
		//   35   74:iconst_2        
		//   36   75:aaload          
		//   37   76:invokestatic    #180 <Method Integer Integer.valueOf(String)>
		//   38   79:astore          9
				obj1 = ((Object) (as));
		//   39   81:aload           11
		//   40   83:astore          10
			}
_L2:
			boolean flag;
			boolean flag1;
			boolean flag2;
			Object obj3;
			String s4;
			flag1 = false;
		//   41   85:iconst_0        
		//   42   86:istore          6
			flag2 = false;
		//   43   88:iconst_0        
		//   44   89:istore          7
			flag = false;
		//   45   91:iconst_0        
		//   46   92:istore          5
			if(obj1 == null || ((Integer) (obj)).intValue() <= 0)
				break MISSING_BLOCK_LABEL_862;
		//   47   94:aload           10
		//   48   96:ifnull          862
		//   49   99:aload           9
		//   50  101:invokevirtual   #183 <Method int Integer.intValue()>
		//   51  104:ifle            862
			s4 = obj1[0];
		//   52  107:aload           10
		//   53  109:iconst_0        
		//   54  110:aaload          
		//   55  111:astore          14
			obj1 = ((Object) (obj1[1]));
		//   56  113:aload           10
		//   57  115:iconst_1        
		//   58  116:aaload          
		//   59  117:astore          10
			String s3 = com.mixpanel.android.a.b.a(((String) (obj1)));
		//   60  119:aload           10
		//   61  121:invokestatic    #188 <Method String b.a(String)>
		//   62  124:astore          11
			obj3 = ((Object) (new HashMap()));
		//   63  126:new             #190 <Class HashMap>
		//   64  129:dup             
		//   65  130:invokespecial   #191 <Method void HashMap()>
		//   66  133:astore          12
			((Map) (obj3)).put("data", ((Object) (s3)));
		//   67  135:aload           12
		//   68  137:ldc1            #193 <String "data">
		//   69  139:aload           11
		//   70  141:invokeinterface #198 <Method Object Map.put(Object, Object)>
		//   71  146:pop             
			if(h.a)
		//*  72  147:getstatic       #201 <Field boolean h.a>
		//*  73  150:ifeq            165
				((Map) (obj3)).put("verbose", "1");
		//   74  153:aload           12
		//   75  155:ldc1            #203 <String "verbose">
		//   76  157:ldc1            #205 <String "1">
		//   77  159:invokeinterface #198 <Method Object Map.put(Object, Object)>
		//   78  164:pop             
			byte abyte0[] = h1.a(s2, ((Map) (obj3)), a.a.b.y());
		//   79  165:aload           13
		//   80  167:aload           4
		//   81  169:aload           12
		//   82  171:aload_0         
		//   83  172:getfield        #26  <Field a$e a>
		//   84  175:getfield        #34  <Field a a$e.a>
		//   85  178:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   86  181:invokevirtual   #209 <Method javax.net.ssl.SSLSocketFactory h.y()>
		//   87  184:invokeinterface #212 <Method byte[] h.a(String, Map, javax.net.ssl.SSLSocketFactory)>
		//   88  189:astore          11
			if(abyte0 != null)
				break MISSING_BLOCK_LABEL_269;
		//   89  191:aload           11
		//   90  193:ifnonnull       269
			obj1 = ((Object) (a.a));
		//   91  196:aload_0         
		//   92  197:getfield        #26  <Field a$e a>
		//   93  200:getfield        #34  <Field a a$e.a>
		//   94  203:astore          10
			abyte0 = ((byte []) (new StringBuilder()));
		//   95  205:new             #214 <Class StringBuilder>
		//   96  208:dup             
		//   97  209:invokespecial   #215 <Method void StringBuilder()>
		//   98  212:astore          11
			((StringBuilder) (abyte0)).append("Response was null, unexpected failure posting to ");
		//   99  214:aload           11
		//  100  216:ldc1            #217 <String "Response was null, unexpected failure posting to ">
		//  101  218:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  102  221:pop             
			((StringBuilder) (abyte0)).append(s2);
		//  103  222:aload           11
		//  104  224:aload           4
		//  105  226:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  106  229:pop             
			((StringBuilder) (abyte0)).append(".");
		//  107  230:aload           11
		//  108  232:ldc1            #223 <String ".">
		//  109  234:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  110  237:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (obj1)), ((StringBuilder) (abyte0)).toString());
		//  111  238:aload           10
		//  112  240:aload           11
		//  113  242:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  114  245:invokestatic    #126 <Method void a.a(a, String)>
			flag = flag2;
		//  115  248:iload           7
		//  116  250:istore          5
			break MISSING_BLOCK_LABEL_677;
		//  117  252:goto            677
			obj1;
		//  118  255:astore          10
			break MISSING_BLOCK_LABEL_587;
		//  119  257:goto            587
			obj1;
		//  120  260:astore          10
			flag = flag1;
		//  121  262:iload           6
		//  122  264:istore          5
			break MISSING_BLOCK_LABEL_626;
		//  123  266:goto            626
			Object obj2 = ((Object) (new String(abyte0, "UTF-8")));
		//  124  269:new             #98  <Class String>
		//  125  272:dup             
		//  126  273:aload           11
		//  127  275:ldc1            #228 <String "UTF-8">
		//  128  277:invokespecial   #231 <Method void String(byte[], String)>
		//  129  280:astore          11
			if(g > 0)
		//* 130  282:aload_0         
		//* 131  283:getfield        #233 <Field int g>
		//* 132  286:ifle            300
			{
				g = 0;
		//  133  289:aload_0         
		//  134  290:iconst_0        
		//  135  291:putfield        #233 <Field int g>
				removeMessages(2, ((Object) (s1)));
		//  136  294:aload_0         
		//  137  295:iconst_2        
		//  138  296:aload_2         
		//  139  297:invokevirtual   #237 <Method void removeMessages(int, Object)>
			}
			obj3 = ((Object) (a.a));
		//  140  300:aload_0         
		//  141  301:getfield        #26  <Field a$e a>
		//  142  304:getfield        #34  <Field a a$e.a>
		//  143  307:astore          12
			StringBuilder stringbuilder = new StringBuilder();
		//  144  309:new             #214 <Class StringBuilder>
		//  145  312:dup             
		//  146  313:invokespecial   #215 <Method void StringBuilder()>
		//  147  316:astore          15
			stringbuilder.append("Successfully posted to ");
		//  148  318:aload           15
		//  149  320:ldc1            #239 <String "Successfully posted to ">
		//  150  322:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  151  325:pop             
			stringbuilder.append(s2);
		//  152  326:aload           15
		//  153  328:aload           4
		//  154  330:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  155  333:pop             
			stringbuilder.append(": \n");
		//  156  334:aload           15
		//  157  336:ldc1            #241 <String ": \n">
		//  158  338:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  159  341:pop             
			stringbuilder.append(((String) (obj1)));
		//  160  342:aload           15
		//  161  344:aload           10
		//  162  346:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  163  349:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (obj3)), stringbuilder.toString());
		//  164  350:aload           12
		//  165  352:aload           15
		//  166  354:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  167  357:invokestatic    #126 <Method void a.a(a, String)>
			obj1 = ((Object) (a.a));
		//  168  360:aload_0         
		//  169  361:getfield        #26  <Field a$e a>
		//  170  364:getfield        #34  <Field a a$e.a>
		//  171  367:astore          10
			obj3 = ((Object) (new StringBuilder()));
		//  172  369:new             #214 <Class StringBuilder>
		//  173  372:dup             
		//  174  373:invokespecial   #215 <Method void StringBuilder()>
		//  175  376:astore          12
			((StringBuilder) (obj3)).append("Response was ");
		//  176  378:aload           12
		//  177  380:ldc1            #243 <String "Response was ">
		//  178  382:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  179  385:pop             
			((StringBuilder) (obj3)).append(((String) (obj2)));
		//  180  386:aload           12
		//  181  388:aload           11
		//  182  390:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  183  393:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (obj1)), ((StringBuilder) (obj3)).toString());
		//  184  394:aload           10
		//  185  396:aload           12
		//  186  398:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  187  401:invokestatic    #126 <Method void a.a(a, String)>
			flag = true;
		//  188  404:iconst_1        
		//  189  405:istore          5
			break MISSING_BLOCK_LABEL_677;
		//  190  407:goto            677
			obj1;
		//  191  410:astore          10
			throw new RuntimeException("UTF not supported on this platform?", ((Throwable) (obj1)));
		//  192  412:new             #245 <Class RuntimeException>
		//  193  415:dup             
		//  194  416:ldc1            #247 <String "UTF not supported on this platform?">
		//  195  418:aload           10
		//  196  420:invokespecial   #250 <Method void RuntimeException(String, Throwable)>
		//  197  423:athrow          
			obj1;
		//  198  424:astore          10
			obj2 = ((Object) (a.a));
		//  199  426:aload_0         
		//  200  427:getfield        #26  <Field a$e a>
		//  201  430:getfield        #34  <Field a a$e.a>
		//  202  433:astore          11
			obj3 = ((Object) (new StringBuilder()));
		//  203  435:new             #214 <Class StringBuilder>
		//  204  438:dup             
		//  205  439:invokespecial   #215 <Method void StringBuilder()>
		//  206  442:astore          12
			break MISSING_BLOCK_LABEL_467;
		//  207  444:goto            467
			obj1;
		//  208  447:astore          10
			obj2 = ((Object) (a.a));
		//  209  449:aload_0         
		//  210  450:getfield        #26  <Field a$e a>
		//  211  453:getfield        #34  <Field a a$e.a>
		//  212  456:astore          11
			obj3 = ((Object) (new StringBuilder()));
		//  213  458:new             #214 <Class StringBuilder>
		//  214  461:dup             
		//  215  462:invokespecial   #215 <Method void StringBuilder()>
		//  216  465:astore          12
			((StringBuilder) (obj3)).append("Cannot post message to ");
		//  217  467:aload           12
		//  218  469:ldc1            #252 <String "Cannot post message to ">
		//  219  471:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  220  474:pop             
			((StringBuilder) (obj3)).append(s2);
		//  221  475:aload           12
		//  222  477:aload           4
		//  223  479:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  224  482:pop             
			((StringBuilder) (obj3)).append(".");
		//  225  483:aload           12
		//  226  485:ldc1            #223 <String ".">
		//  227  487:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  228  490:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (obj2)), ((StringBuilder) (obj3)).toString(), ((Throwable) (obj1)));
		//  229  491:aload           11
		//  230  493:aload           12
		//  231  495:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  232  498:aload           10
		//  233  500:invokestatic    #255 <Method void a.a(a, String, Throwable)>
			break MISSING_BLOCK_LABEL_576;
		//  234  503:goto            576
			obj1;
		//  235  506:astore          10
			obj2 = ((Object) (a.a));
		//  236  508:aload_0         
		//  237  509:getfield        #26  <Field a$e a>
		//  238  512:getfield        #34  <Field a a$e.a>
		//  239  515:astore          11
			obj3 = ((Object) (new StringBuilder()));
		//  240  517:new             #214 <Class StringBuilder>
		//  241  520:dup             
		//  242  521:invokespecial   #215 <Method void StringBuilder()>
		//  243  524:astore          12
			((StringBuilder) (obj3)).append("Cannot post message to ");
		//  244  526:aload           12
		//  245  528:ldc1            #252 <String "Cannot post message to ">
		//  246  530:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  247  533:pop             
			((StringBuilder) (obj3)).append(s2);
		//  248  534:aload           12
		//  249  536:aload           4
		//  250  538:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  251  541:pop             
			((StringBuilder) (obj3)).append(".");
		//  252  542:aload           12
		//  253  544:ldc1            #223 <String ".">
		//  254  546:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  255  549:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (obj2)), ((StringBuilder) (obj3)).toString(), ((Throwable) (obj1)));
		//  256  550:aload           11
		//  257  552:aload           12
		//  258  554:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  259  557:aload           10
		//  260  559:invokestatic    #255 <Method void a.a(a, String, Throwable)>
			f = ((com.mixpanel.android.a.h.a) (obj1)).a() * 1000;
		//  261  562:aload_0         
		//  262  563:aload           10
		//  263  565:invokevirtual   #257 <Method int com.mixpanel.android.a.h$a.a()>
		//  264  568:sipush          1000
		//  265  571:imul            
		//  266  572:i2l             
		//  267  573:putfield        #259 <Field long f>
			flag = false;
		//  268  576:iconst_0        
		//  269  577:istore          5
			break MISSING_BLOCK_LABEL_677;
		//  270  579:goto            677
			obj1;
		//  271  582:astore          10
			flag = true;
		//  272  584:iconst_1        
		//  273  585:istore          5
			obj2 = ((Object) (new StringBuilder()));
		//  274  587:new             #214 <Class StringBuilder>
		//  275  590:dup             
		//  276  591:invokespecial   #215 <Method void StringBuilder()>
		//  277  594:astore          11
			((StringBuilder) (obj2)).append("Cannot interpret ");
		//  278  596:aload           11
		//  279  598:ldc2            #261 <String "Cannot interpret ">
		//  280  601:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  281  604:pop             
			((StringBuilder) (obj2)).append(s2);
		//  282  605:aload           11
		//  283  607:aload           4
		//  284  609:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  285  612:pop             
			obj3 = " as a URL.";
		//  286  613:ldc2            #263 <String " as a URL.">
		//  287  616:astore          12
			break MISSING_BLOCK_LABEL_656;
		//  288  618:goto            656
			obj1;
		//  289  621:astore          10
			flag = true;
		//  290  623:iconst_1        
		//  291  624:istore          5
			obj2 = ((Object) (new StringBuilder()));
		//  292  626:new             #214 <Class StringBuilder>
		//  293  629:dup             
		//  294  630:invokespecial   #215 <Method void StringBuilder()>
		//  295  633:astore          11
			((StringBuilder) (obj2)).append("Out of memory when posting to ");
		//  296  635:aload           11
		//  297  637:ldc2            #265 <String "Out of memory when posting to ">
		//  298  640:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  299  643:pop             
			((StringBuilder) (obj2)).append(s2);
		//  300  644:aload           11
		//  301  646:aload           4
		//  302  648:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  303  651:pop             
			obj3 = ".";
		//  304  652:ldc1            #223 <String ".">
		//  305  654:astore          12
			((StringBuilder) (obj2)).append(((String) (obj3)));
		//  306  656:aload           11
		//  307  658:aload           12
		//  308  660:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  309  663:pop             
			com.mixpanel.android.a.f.e("MixpanelAPI.Messages", ((StringBuilder) (obj2)).toString(), ((Throwable) (obj1)));
		//  310  664:ldc2            #267 <String "MixpanelAPI.Messages">
		//  311  667:aload           11
		//  312  669:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  313  672:aload           10
		//  314  674:invokestatic    #272 <Method void f.e(String, String, Throwable)>
			if(!flag)
				break; /* Loop/switch isn't completed */
		//  315  677:iload           5
		//  316  679:ifeq            732
			com.mixpanel.android.mpmetrics.a.a(a.a, "Not retrying this batch of events, deleting them from DB.");
		//  317  682:aload_0         
		//  318  683:getfield        #26  <Field a$e a>
		//  319  686:getfield        #34  <Field a a$e.a>
		//  320  689:ldc2            #274 <String "Not retrying this batch of events, deleting them from DB.">
		//  321  692:invokestatic    #126 <Method void a.a(a, String)>
			k.a(s4, b1, s1, flag3);
		//  322  695:aload_1         
		//  323  696:aload           14
		//  324  698:aload_3         
		//  325  699:aload_2         
		//  326  700:iload           8
		//  327  702:invokevirtual   #277 <Method void i.a(String, i$b, String, boolean)>
			obj1 = ((Object) (k.a(b1, s1, flag3)));
		//  328  705:aload_1         
		//  329  706:aload_3         
		//  330  707:aload_2         
		//  331  708:iload           8
		//  332  710:invokevirtual   #171 <Method String[] i.a(i$b, String, boolean)>
		//  333  713:astore          10
			if(obj1 != null)
		//* 334  715:aload           10
		//* 335  717:ifnull          729
				obj = ((Object) (Integer.valueOf(((String) (obj1[2])))));
		//  336  720:aload           10
		//  337  722:iconst_2        
		//  338  723:aaload          
		//  339  724:invokestatic    #180 <Method Integer Integer.valueOf(String)>
		//  340  727:astore          9
			if(true) goto _L2; else goto _L1
		//  341  729:goto            85
_L1:
			removeMessages(2, ((Object) (s1)));
		//  342  732:aload_0         
		//  343  733:iconst_2        
		//  344  734:aload_2         
		//  345  735:invokevirtual   #237 <Method void removeMessages(int, Object)>
			f = Math.max((long)Math.pow(2D, g) * 60000L, f);
		//  346  738:aload_0         
		//  347  739:ldc2w           #278 <Double 2D>
		//  348  742:aload_0         
		//  349  743:getfield        #233 <Field int g>
		//  350  746:i2d             
		//  351  747:invokestatic    #285 <Method double Math.pow(double, double)>
		//  352  750:d2l             
		//  353  751:ldc2w           #286 <Long 60000L>
		//  354  754:lmul            
		//  355  755:aload_0         
		//  356  756:getfield        #259 <Field long f>
		//  357  759:invokestatic    #291 <Method long Math.max(long, long)>
		//  358  762:putfield        #259 <Field long f>
			f = Math.min(f, 0x927c0L);
		//  359  765:aload_0         
		//  360  766:aload_0         
		//  361  767:getfield        #259 <Field long f>
		//  362  770:ldc2w           #292 <Long 0x927c0L>
		//  363  773:invokestatic    #296 <Method long Math.min(long, long)>
		//  364  776:putfield        #259 <Field long f>
			k = ((i) (Message.obtain()));
		//  365  779:invokestatic    #302 <Method Message Message.obtain()>
		//  366  782:astore_1        
			k.what = 2;
		//  367  783:aload_1         
		//  368  784:iconst_2        
		//  369  785:putfield        #305 <Field int Message.what>
			k.obj = ((Object) (s1));
		//  370  788:aload_1         
		//  371  789:aload_2         
		//  372  790:putfield        #309 <Field Object Message.obj>
			sendMessageDelayed(((Message) (k)), f);
		//  373  793:aload_0         
		//  374  794:aload_1         
		//  375  795:aload_0         
		//  376  796:getfield        #259 <Field long f>
		//  377  799:invokevirtual   #313 <Method boolean sendMessageDelayed(Message, long)>
		//  378  802:pop             
			g = g + 1;
		//  379  803:aload_0         
		//  380  804:aload_0         
		//  381  805:getfield        #233 <Field int g>
		//  382  808:iconst_1        
		//  383  809:iadd            
		//  384  810:putfield        #233 <Field int g>
			k = ((i) (a.a));
		//  385  813:aload_0         
		//  386  814:getfield        #26  <Field a$e a>
		//  387  817:getfield        #34  <Field a a$e.a>
		//  388  820:astore_1        
			s1 = ((String) (new StringBuilder()));
		//  389  821:new             #214 <Class StringBuilder>
		//  390  824:dup             
		//  391  825:invokespecial   #215 <Method void StringBuilder()>
		//  392  828:astore_2        
			((StringBuilder) (s1)).append("Retrying this batch of events in ");
		//  393  829:aload_2         
		//  394  830:ldc2            #315 <String "Retrying this batch of events in ">
		//  395  833:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  396  836:pop             
			((StringBuilder) (s1)).append(f);
		//  397  837:aload_2         
		//  398  838:aload_0         
		//  399  839:getfield        #259 <Field long f>
		//  400  842:invokevirtual   #318 <Method StringBuilder StringBuilder.append(long)>
		//  401  845:pop             
			((StringBuilder) (s1)).append(" ms");
		//  402  846:aload_2         
		//  403  847:ldc2            #320 <String " ms">
		//  404  850:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  405  853:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (k)), ((StringBuilder) (s1)).toString());
		//  406  854:aload_1         
		//  407  855:aload_2         
		//  408  856:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  409  859:invokestatic    #126 <Method void a.a(a, String)>
		//  410  862:return          
		}

		private void a(String s1)
		{
			if(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(a.a.a) != 0)
		//*   0    0:invokestatic    #329 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #26  <Field a$e a>
		//*   3    7:getfield        #34  <Field a a$e.a>
		//*   4   10:getfield        #37  <Field android.content.Context a.a>
		//*   5   13:invokevirtual   #333 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
		//*   6   16:ifeq            29
			{
				com.mixpanel.android.a.f.c("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
		//    7   19:ldc2            #267 <String "MixpanelAPI.Messages">
		//    8   22:ldc2            #335 <String "Can't register for push notifications, Google Play Services are not installed.">
		//    9   25:invokestatic    #338 <Method void f.c(String, String)>
				return;
		//   10   28:return          
			}
			s1 = InstanceID.getInstance(a.a.a).getToken(s1, "GCM", ((android.os.Bundle) (null)));
		//   11   29:aload_0         
		//   12   30:getfield        #26  <Field a$e a>
		//   13   33:getfield        #34  <Field a a$e.a>
		//   14   36:getfield        #37  <Field android.content.Context a.a>
		//   15   39:invokestatic    #343 <Method InstanceID InstanceID.getInstance(android.content.Context)>
		//   16   42:aload_1         
		//   17   43:ldc2            #345 <String "GCM">
		//   18   46:aconst_null     
		//   19   47:invokevirtual   #349 <Method String InstanceID.getToken(String, String, android.os.Bundle)>
		//   20   50:astore_1        
			j.a(new j.a(this, s1) {

				public void a(j j1)
				{
					StringBuilder stringbuilder = new StringBuilder();
				//    0    0:new             #32  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #33  <Method void StringBuilder()>
				//    3    7:astore_2        
					stringbuilder.append("Using existing pushId ");
				//    4    8:aload_2         
				//    5    9:ldc1            #35  <String "Using existing pushId ">
				//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
				//    7   14:pop             
					stringbuilder.append(a);
				//    8   15:aload_2         
				//    9   16:aload_0         
				//   10   17:getfield        #25  <Field String a>
				//   11   20:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
				//   12   23:pop             
					com.mixpanel.android.a.f.a("MixpanelAPI.Messages", stringbuilder.toString());
				//   13   24:ldc1            #41  <String "MixpanelAPI.Messages">
				//   14   26:aload_2         
				//   15   27:invokevirtual   #45  <Method String StringBuilder.toString()>
				//   16   30:invokestatic    #50  <Method void f.a(String, String)>
					j1.c().c(a);
				//   17   33:aload_1         
				//   18   34:invokevirtual   #56  <Method j$c j.c()>
				//   19   37:aload_0         
				//   20   38:getfield        #25  <Field String a>
				//   21   41:invokeinterface #60  <Method void j$c.c(String)>
				//   22   46:return          
				}

				final String a;
				final a b;

			
			{
				b = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field a$e$a b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #28  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//   21   51:new             #12  <Class a$e$a$1>
		//   22   54:dup             
		//   23   55:aload_0         
		//   24   56:aload_1         
		//   25   57:invokespecial   #352 <Method void a$e$a$1(a$e$a, String)>
		//   26   60:invokestatic    #357 <Method void j.a(j$a)>
			return;
		//   27   63:return          
		//*  28   64:astore_1        
		//*  29   65:goto            88
_L2:
			try
			{
				com.mixpanel.android.a.f.c("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
		//   30   68:ldc2            #267 <String "MixpanelAPI.Messages">
		//   31   71:ldc2            #359 <String "Can't register for push notifications, Google Play services are not configured.">
		//   32   74:invokestatic    #338 <Method void f.c(String, String)>
				return;
		//   33   77:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s1)
		//*  34   78:ldc2            #267 <String "MixpanelAPI.Messages">
		//*  35   81:ldc2            #361 <String "Google play services were not part of this build, push notifications cannot be registered or delivered">
		//*  36   84:invokestatic    #363 <Method void f.d(String, String)>
		//*  37   87:return          
			{
				com.mixpanel.android.a.f.c("MixpanelAPI.Messages", "Exception when trying to register for GCM", ((Throwable) (s1)));
		//   38   88:ldc2            #267 <String "MixpanelAPI.Messages">
		//   39   91:ldc2            #365 <String "Exception when trying to register for GCM">
		//   40   94:aload_1         
		//   41   95:invokestatic    #367 <Method void f.c(String, String, Throwable)>
			}
		//*  42   98:return          
		//*  43   99:astore_1        
		//*  44  100:goto            68
			// Misplaced declaration of an exception variable
			catch(String s1)
			{
				com.mixpanel.android.a.f.d("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
				return;
			}
			return;
			s1;
			if(true) goto _L2; else goto _L1
_L1:
		//*  45  103:astore_1        
		//*  46  104:goto            78
		}

		private JSONObject b()
		{
			JSONObject jsonobject;
			jsonobject = new JSONObject();
		//    0    0:new             #64  <Class JSONObject>
		//    1    3:dup             
		//    2    4:invokespecial   #67  <Method void JSONObject()>
		//    3    7:astore_3        
			jsonobject.put("mp_lib", "android");
		//    4    8:aload_3         
		//    5    9:ldc2            #369 <String "mp_lib">
		//    6   12:ldc2            #371 <String "android">
		//    7   15:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//    8   18:pop             
			jsonobject.put("$lib_version", "5.2.1");
		//    9   19:aload_3         
		//   10   20:ldc2            #373 <String "$lib_version">
		//   11   23:ldc2            #375 <String "5.2.1">
		//   12   26:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   13   29:pop             
			jsonobject.put("$os", "Android");
		//   14   30:aload_3         
		//   15   31:ldc2            #377 <String "$os">
		//   16   34:ldc2            #379 <String "Android">
		//   17   37:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   18   40:pop             
			String s1;
			if(android.os.Build.VERSION.RELEASE == null)
		//*  19   41:getstatic       #385 <Field String android.os.Build$VERSION.RELEASE>
		//*  20   44:ifnonnull       54
				s1 = "UNKNOWN";
		//   21   47:ldc2            #387 <String "UNKNOWN">
		//   22   50:astore_2        
			else
		//*  23   51:goto            58
				s1 = android.os.Build.VERSION.RELEASE;
		//   24   54:getstatic       #385 <Field String android.os.Build$VERSION.RELEASE>
		//   25   57:astore_2        
			jsonobject.put("$os_version", ((Object) (s1)));
		//   26   58:aload_3         
		//   27   59:ldc2            #389 <String "$os_version">
		//   28   62:aload_2         
		//   29   63:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   30   66:pop             
			if(Build.MANUFACTURER == null)
		//*  31   67:getstatic       #394 <Field String Build.MANUFACTURER>
		//*  32   70:ifnonnull       80
				s1 = "UNKNOWN";
		//   33   73:ldc2            #387 <String "UNKNOWN">
		//   34   76:astore_2        
			else
		//*  35   77:goto            84
				s1 = Build.MANUFACTURER;
		//   36   80:getstatic       #394 <Field String Build.MANUFACTURER>
		//   37   83:astore_2        
			jsonobject.put("$manufacturer", ((Object) (s1)));
		//   38   84:aload_3         
		//   39   85:ldc2            #396 <String "$manufacturer">
		//   40   88:aload_2         
		//   41   89:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   42   92:pop             
			if(Build.BRAND == null)
		//*  43   93:getstatic       #399 <Field String Build.BRAND>
		//*  44   96:ifnonnull       106
				s1 = "UNKNOWN";
		//   45   99:ldc2            #387 <String "UNKNOWN">
		//   46  102:astore_2        
			else
		//*  47  103:goto            110
				s1 = Build.BRAND;
		//   48  106:getstatic       #399 <Field String Build.BRAND>
		//   49  109:astore_2        
			jsonobject.put("$brand", ((Object) (s1)));
		//   50  110:aload_3         
		//   51  111:ldc2            #401 <String "$brand">
		//   52  114:aload_2         
		//   53  115:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   54  118:pop             
			if(Build.MODEL == null)
		//*  55  119:getstatic       #404 <Field String Build.MODEL>
		//*  56  122:ifnonnull       132
				s1 = "UNKNOWN";
		//   57  125:ldc2            #387 <String "UNKNOWN">
		//   58  128:astore_2        
			else
		//*  59  129:goto            136
				s1 = Build.MODEL;
		//   60  132:getstatic       #404 <Field String Build.MODEL>
		//   61  135:astore_2        
			jsonobject.put("$model", ((Object) (s1)));
		//   62  136:aload_3         
		//   63  137:ldc2            #406 <String "$model">
		//   64  140:aload_2         
		//   65  141:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   66  144:pop             
			int k = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(a.a.a);
		//   67  145:invokestatic    #329 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
		//   68  148:aload_0         
		//   69  149:getfield        #26  <Field a$e a>
		//   70  152:getfield        #34  <Field a a$e.a>
		//   71  155:getfield        #37  <Field android.content.Context a.a>
		//   72  158:invokevirtual   #333 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
		//   73  161:istore_1        
			if(k == 9) goto _L2; else goto _L1
		//   74  162:iload_1         
		//   75  163:bipush          9
		//   76  165:icmpeq          212
_L1:
			k;
		//   77  168:iload_1         
			JVM INSTR tableswitch 0 3: default 526
		//		               0 550
		//		               1 543
		//		               2 536
		//		               3 529;
		//   78  169:tableswitch     0 3: default 526
		//		               0 550
		//		               1 543
		//		               2 536
		//		               3 529
			   goto _L3 _L4 _L5 _L6 _L7
_L10:
			Object obj;
			jsonobject.put("$google_play_services", obj);
		//   79  200:aload_3         
		//   80  201:ldc2            #408 <String "$google_play_services">
		//   81  204:aload_2         
		//   82  205:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   83  208:pop             
			  goto _L3
		//*  84  209:goto            244
_L2:
			obj = "invalid";
		//   85  212:ldc2            #410 <String "invalid">
		//   86  215:astore_2        
			continue; /* Loop/switch isn't completed */
		//   87  216:goto            200
_L8:
			try
			{
				jsonobject.put("$google_play_services", "not configured");
		//   88  219:aload_3         
		//   89  220:ldc2            #408 <String "$google_play_services">
		//   90  223:ldc2            #412 <String "not configured">
		//   91  226:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//   92  229:pop             
			}
		//*  93  230:goto            244
		//*  94  233:aload_3         
		//*  95  234:ldc2            #408 <String "$google_play_services">
		//*  96  237:ldc2            #414 <String "not included">
		//*  97  240:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//*  98  243:pop             
		//*  99  244:aload_0         
		//* 100  245:getfield        #26  <Field a$e a>
		//* 101  248:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 102  251:invokevirtual   #420 <Method DisplayMetrics com.mixpanel.android.mpmetrics.s.f()>
		//* 103  254:astore_2        
		//* 104  255:aload_3         
		//* 105  256:ldc2            #422 <String "$screen_dpi">
		//* 106  259:aload_2         
		//* 107  260:getfield        #427 <Field int DisplayMetrics.densityDpi>
		//* 108  263:invokevirtual   #430 <Method JSONObject JSONObject.put(String, int)>
		//* 109  266:pop             
		//* 110  267:aload_3         
		//* 111  268:ldc2            #432 <String "$screen_height">
		//* 112  271:aload_2         
		//* 113  272:getfield        #435 <Field int DisplayMetrics.heightPixels>
		//* 114  275:invokevirtual   #430 <Method JSONObject JSONObject.put(String, int)>
		//* 115  278:pop             
		//* 116  279:aload_3         
		//* 117  280:ldc2            #437 <String "$screen_width">
		//* 118  283:aload_2         
		//* 119  284:getfield        #440 <Field int DisplayMetrics.widthPixels>
		//* 120  287:invokevirtual   #430 <Method JSONObject JSONObject.put(String, int)>
		//* 121  290:pop             
		//* 122  291:aload_0         
		//* 123  292:getfield        #26  <Field a$e a>
		//* 124  295:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 125  298:invokevirtual   #441 <Method String s.a()>
		//* 126  301:astore_2        
		//* 127  302:aload_2         
		//* 128  303:ifnull          324
		//* 129  306:aload_3         
		//* 130  307:ldc2            #443 <String "$app_version">
		//* 131  310:aload_2         
		//* 132  311:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 133  314:pop             
		//* 134  315:aload_3         
		//* 135  316:ldc2            #445 <String "$app_version_string">
		//* 136  319:aload_2         
		//* 137  320:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 138  323:pop             
		//* 139  324:aload_0         
		//* 140  325:getfield        #26  <Field a$e a>
		//* 141  328:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 142  331:invokevirtual   #448 <Method Integer com.mixpanel.android.mpmetrics.s.b()>
		//* 143  334:astore_2        
		//* 144  335:aload_2         
		//* 145  336:ifnull          357
		//* 146  339:aload_3         
		//* 147  340:ldc2            #450 <String "$app_release">
		//* 148  343:aload_2         
		//* 149  344:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 150  347:pop             
		//* 151  348:aload_3         
		//* 152  349:ldc2            #452 <String "$app_build_number">
		//* 153  352:aload_2         
		//* 154  353:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 155  356:pop             
		//* 156  357:aload_0         
		//* 157  358:getfield        #26  <Field a$e a>
		//* 158  361:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 159  364:invokevirtual   #454 <Method boolean s.d()>
		//* 160  367:invokestatic    #459 <Method Boolean Boolean.valueOf(boolean)>
		//* 161  370:astore_2        
		//* 162  371:aload_2         
		//* 163  372:ifnull          387
		//* 164  375:aload_3         
		//* 165  376:ldc2            #461 <String "$has_nfc">
		//* 166  379:aload_2         
		//* 167  380:invokevirtual   #464 <Method boolean Boolean.booleanValue()>
		//* 168  383:invokevirtual   #467 <Method JSONObject JSONObject.put(String, boolean)>
		//* 169  386:pop             
		//* 170  387:aload_0         
		//* 171  388:getfield        #26  <Field a$e a>
		//* 172  391:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 173  394:invokevirtual   #469 <Method boolean s.e()>
		//* 174  397:invokestatic    #459 <Method Boolean Boolean.valueOf(boolean)>
		//* 175  400:astore_2        
		//* 176  401:aload_2         
		//* 177  402:ifnull          417
		//* 178  405:aload_3         
		//* 179  406:ldc2            #471 <String "$has_telephone">
		//* 180  409:aload_2         
		//* 181  410:invokevirtual   #464 <Method boolean Boolean.booleanValue()>
		//* 182  413:invokevirtual   #467 <Method JSONObject JSONObject.put(String, boolean)>
		//* 183  416:pop             
		//* 184  417:aload_0         
		//* 185  418:getfield        #26  <Field a$e a>
		//* 186  421:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 187  424:invokevirtual   #473 <Method String s.g()>
		//* 188  427:astore_2        
		//* 189  428:aload_2         
		//* 190  429:ifnull          441
		//* 191  432:aload_3         
		//* 192  433:ldc2            #475 <String "$carrier">
		//* 193  436:aload_2         
		//* 194  437:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 195  440:pop             
		//* 196  441:aload_0         
		//* 197  442:getfield        #26  <Field a$e a>
		//* 198  445:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 199  448:invokevirtual   #478 <Method Boolean com.mixpanel.android.mpmetrics.s.h()>
		//* 200  451:astore_2        
		//* 201  452:aload_2         
		//* 202  453:ifnull          468
		//* 203  456:aload_3         
		//* 204  457:ldc2            #480 <String "$wifi">
		//* 205  460:aload_2         
		//* 206  461:invokevirtual   #464 <Method boolean Boolean.booleanValue()>
		//* 207  464:invokevirtual   #467 <Method JSONObject JSONObject.put(String, boolean)>
		//* 208  467:pop             
		//* 209  468:aload_0         
		//* 210  469:getfield        #26  <Field a$e a>
		//* 211  472:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 212  475:invokevirtual   #483 <Method Boolean s.i()>
		//* 213  478:astore_2        
		//* 214  479:aload_2         
		//* 215  480:ifnull          492
		//* 216  483:aload_3         
		//* 217  484:ldc2            #485 <String "$bluetooth_enabled">
		//* 218  487:aload_2         
		//* 219  488:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 220  491:pop             
		//* 221  492:aload_0         
		//* 222  493:getfield        #26  <Field a$e a>
		//* 223  496:invokestatic    #417 <Method s a$e.c(a$e)>
		//* 224  499:invokevirtual   #488 <Method String s.j()>
		//* 225  502:astore_2        
		//* 226  503:aload_2         
		//* 227  504:ifnull          516
		//* 228  507:aload_3         
		//* 229  508:ldc2            #490 <String "$bluetooth_version">
		//* 230  511:aload_2         
		//* 231  512:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
		//* 232  515:pop             
		//* 233  516:aload_3         
		//* 234  517:areturn         
		//* 235  518:astore_2        
		//* 236  519:goto            219
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				jsonobject.put("$google_play_services", "not included");
			}
_L3:
			obj = ((Object) (a.e.c(a).f()));
			jsonobject.put("$screen_dpi", ((DisplayMetrics) (obj)).densityDpi);
			jsonobject.put("$screen_height", ((DisplayMetrics) (obj)).heightPixels);
			jsonobject.put("$screen_width", ((DisplayMetrics) (obj)).widthPixels);
			obj = ((Object) (a.e.c(a).a()));
			if(obj != null)
			{
				jsonobject.put("$app_version", obj);
				jsonobject.put("$app_version_string", obj);
			}
			obj = ((Object) (a.e.c(a).b()));
			if(obj != null)
			{
				jsonobject.put("$app_release", obj);
				jsonobject.put("$app_build_number", obj);
			}
			obj = ((Object) (Boolean.valueOf(a.e.c(a).d())));
			if(obj != null)
				jsonobject.put("$has_nfc", ((Boolean) (obj)).booleanValue());
			obj = ((Object) (Boolean.valueOf(a.e.c(a).e())));
			if(obj != null)
				jsonobject.put("$has_telephone", ((Boolean) (obj)).booleanValue());
			obj = ((Object) (a.e.c(a).g()));
			if(obj != null)
				jsonobject.put("$carrier", obj);
			obj = ((Object) (a.e.c(a).h()));
			if(obj != null)
				jsonobject.put("$wifi", ((Boolean) (obj)).booleanValue());
			obj = ((Object) (a.e.c(a).i()));
			if(obj != null)
				jsonobject.put("$bluetooth_enabled", obj);
			obj = ((Object) (a.e.c(a).j()));
			if(obj != null)
				jsonobject.put("$bluetooth_version", obj);
			return jsonobject;
			obj;
			if(true) goto _L8; else goto _L7
		//* 237  522:astore_2        
		//* 238  523:goto            233
		//* 239  526:goto            244
_L7:
			obj = "disabled";
		//  240  529:ldc2            #492 <String "disabled">
		//  241  532:astore_2        
			continue; /* Loop/switch isn't completed */
		//  242  533:goto            200
_L6:
			obj = "out of date";
		//  243  536:ldc2            #494 <String "out of date">
		//  244  539:astore_2        
			continue; /* Loop/switch isn't completed */
		//  245  540:goto            200
_L5:
			obj = "missing";
		//  246  543:ldc2            #496 <String "missing">
		//  247  546:astore_2        
			continue; /* Loop/switch isn't completed */
		//  248  547:goto            200
_L4:
			obj = "available";
		//  249  550:ldc2            #498 <String "available">
		//  250  553:astore_2        
			if(true) goto _L10; else goto _L9
		//  251  554:goto            200
_L9:
		}

		protected d a()
		{
			return new d(a.a.a, a.a.b);
		//    0    0:new             #158 <Class d>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field a$e a>
		//    4    8:getfield        #34  <Field a a$e.a>
		//    5   11:getfield        #37  <Field android.content.Context a.a>
		//    6   14:aload_0         
		//    7   15:getfield        #26  <Field a$e a>
		//    8   18:getfield        #34  <Field a a$e.a>
		//    9   21:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   10   24:invokespecial   #501 <Method void d(android.content.Context, com.mixpanel.android.mpmetrics.h)>
		//   11   27:areturn         
		}

		public void handleMessage(Message message)
		{
			byte byte0;
			if(b == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field i b>
		//*   2    4:ifnonnull       87
			{
				b = a.a.b(a.a.a);
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field a$e a>
		//    6   12:getfield        #34  <Field a a$e.a>
		//    7   15:aload_0         
		//    8   16:getfield        #26  <Field a$e a>
		//    9   19:getfield        #34  <Field a a$e.a>
		//   10   22:getfield        #37  <Field android.content.Context a.a>
		//   11   25:invokevirtual   #510 <Method i com.mixpanel.android.mpmetrics.a.b(android.content.Context)>
		//   12   28:putfield        #31  <Field i b>
				b.a(System.currentTimeMillis() - (long)a.a.b.c(), i.b.EVENTS);
		//   13   31:aload_0         
		//   14   32:getfield        #31  <Field i b>
		//   15   35:invokestatic    #516 <Method long System.currentTimeMillis()>
		//   16   38:aload_0         
		//   17   39:getfield        #26  <Field a$e a>
		//   18   42:getfield        #34  <Field a a$e.a>
		//   19   45:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   20   48:invokevirtual   #518 <Method int h.c()>
		//   21   51:i2l             
		//   22   52:lsub            
		//   23   53:getstatic       #132 <Field i$b i$b.EVENTS>
		//   24   56:invokevirtual   #521 <Method void i.a(long, i$b)>
				b.a(System.currentTimeMillis() - (long)a.a.b.c(), i.b.PEOPLE);
		//   25   59:aload_0         
		//   26   60:getfield        #31  <Field i b>
		//   27   63:invokestatic    #516 <Method long System.currentTimeMillis()>
		//   28   66:aload_0         
		//   29   67:getfield        #26  <Field a$e a>
		//   30   70:getfield        #34  <Field a a$e.a>
		//   31   73:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   32   76:invokevirtual   #518 <Method int h.c()>
		//   33   79:i2l             
		//   34   80:lsub            
		//   35   81:getstatic       #141 <Field i$b i$b.PEOPLE>
		//   36   84:invokevirtual   #521 <Method void i.a(long, i$b)>
			}
			byte0 = -3;
		//   37   87:bipush          -3
		//   38   89:istore_3        
			int k = message.what;
		//   39   90:aload_1         
		//   40   91:getfield        #305 <Field int Message.what>
		//   41   94:istore_2        
			boolean flag = false;
		//   42   95:iconst_0        
		//   43   96:istore          4
			if(k != 0) goto _L2; else goto _L1
		//   44   98:iload_2         
		//   45   99:ifne            197
_L1:
			a.d d1 = (a.d)message.obj;
		//   46  102:aload_1         
		//   47  103:getfield        #309 <Field Object Message.obj>
		//   48  106:checkcast       #523 <Class a$d>
		//   49  109:astore          9
			com.mixpanel.android.mpmetrics.a.a(a.a, "Queuing people record for sending later");
		//   50  111:aload_0         
		//   51  112:getfield        #26  <Field a$e a>
		//   52  115:getfield        #34  <Field a a$e.a>
		//   53  118:ldc2            #525 <String "Queuing people record for sending later">
		//   54  121:invokestatic    #126 <Method void a.a(a, String)>
			message = ((Message) (a.a));
		//   55  124:aload_0         
		//   56  125:getfield        #26  <Field a$e a>
		//   57  128:getfield        #34  <Field a a$e.a>
		//   58  131:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
		//   59  132:new             #214 <Class StringBuilder>
		//   60  135:dup             
		//   61  136:invokespecial   #215 <Method void StringBuilder()>
		//   62  139:astore          10
			stringbuilder1.append("    ");
		//   63  141:aload           10
		//   64  143:ldc2            #527 <String "    ">
		//   65  146:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//   66  149:pop             
			stringbuilder1.append(d1.toString());
		//   67  150:aload           10
		//   68  152:aload           9
		//   69  154:invokevirtual   #528 <Method String a$d.toString()>
		//   70  157:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//   71  160:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (message)), stringbuilder1.toString());
		//   72  161:aload_1         
		//   73  162:aload           10
		//   74  164:invokevirtual   #226 <Method String StringBuilder.toString()>
		//   75  167:invokestatic    #126 <Method void a.a(a, String)>
			message = ((Message) (d1.d()));
		//   76  170:aload           9
		//   77  172:invokevirtual   #529 <Method String a$d.d()>
		//   78  175:astore_1        
			k = b.a(d1.a(), ((String) (message)), i.b.PEOPLE, false);
		//   79  176:aload_0         
		//   80  177:getfield        #31  <Field i b>
		//   81  180:aload           9
		//   82  182:invokevirtual   #531 <Method JSONObject a$d.a()>
		//   83  185:aload_1         
		//   84  186:getstatic       #141 <Field i$b i$b.PEOPLE>
		//   85  189:iconst_0        
		//   86  190:invokevirtual   #534 <Method int i.a(JSONObject, String, i$b, boolean)>
		//   87  193:istore_2        
			  goto _L3
		//*  88  194:goto            795
_L2:
			if(message.what != 1) goto _L5; else goto _L4
		//   89  197:aload_1         
		//   90  198:getfield        #305 <Field int Message.what>
		//   91  201:iconst_1        
		//   92  202:icmpne          397
_L4:
			a.a a3 = (a.a)message.obj;
		//   93  205:aload_1         
		//   94  206:getfield        #309 <Field Object Message.obj>
		//   95  209:checkcast       #69  <Class a$a>
		//   96  212:astore          10
			Object obj;
			obj = ((Object) (a(a3)));
		//   97  214:aload_0         
		//   98  215:aload           10
		//   99  217:invokespecial   #536 <Method JSONObject a(a$a)>
		//  100  220:astore          9
			com.mixpanel.android.mpmetrics.a.a(a.a, "Queuing event for sending later");
		//  101  222:aload_0         
		//  102  223:getfield        #26  <Field a$e a>
		//  103  226:getfield        #34  <Field a a$e.a>
		//  104  229:ldc2            #538 <String "Queuing event for sending later">
		//  105  232:invokestatic    #126 <Method void a.a(a, String)>
			message = ((Message) (a.a));
		//  106  235:aload_0         
		//  107  236:getfield        #26  <Field a$e a>
		//  108  239:getfield        #34  <Field a a$e.a>
		//  109  242:astore_1        
			StringBuilder stringbuilder4 = new StringBuilder();
		//  110  243:new             #214 <Class StringBuilder>
		//  111  246:dup             
		//  112  247:invokespecial   #215 <Method void StringBuilder()>
		//  113  250:astore          11
			stringbuilder4.append("    ");
		//  114  252:aload           11
		//  115  254:ldc2            #527 <String "    ">
		//  116  257:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  117  260:pop             
			stringbuilder4.append(((JSONObject) (obj)).toString());
		//  118  261:aload           11
		//  119  263:aload           9
		//  120  265:invokevirtual   #539 <Method String JSONObject.toString()>
		//  121  268:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  122  271:pop             
			com.mixpanel.android.mpmetrics.a.a(((com.mixpanel.android.mpmetrics.a) (message)), stringbuilder4.toString());
		//  123  272:aload_1         
		//  124  273:aload           11
		//  125  275:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  126  278:invokestatic    #126 <Method void a.a(a, String)>
			message = ((Message) (a3.d()));
		//  127  281:aload           10
		//  128  283:invokevirtual   #78  <Method String a$a.d()>
		//  129  286:astore_1        
			e e1 = c.b(((String) (message)));
		//  130  287:aload_0         
		//  131  288:getfield        #50  <Field d c>
		//  132  291:aload_1         
		//  133  292:invokevirtual   #161 <Method e com.mixpanel.android.mpmetrics.d.b(String)>
		//  134  295:astore          11
			if(e1 == null)
				break MISSING_BLOCK_LABEL_319;
		//  135  297:aload           11
		//  136  299:ifnull          319
			if(a3.c() && !e1.e())
		//* 137  302:aload           10
		//* 138  304:invokevirtual   #541 <Method boolean a$a.c()>
		//* 139  307:ifeq            319
		//* 140  310:aload           11
		//* 141  312:invokevirtual   #542 <Method boolean e.e()>
		//* 142  315:ifne            319
				return;
		//  143  318:return          
			k = b.a(((JSONObject) (obj)), ((String) (message)), i.b.EVENTS, a3.c());
		//  144  319:aload_0         
		//  145  320:getfield        #31  <Field i b>
		//  146  323:aload           9
		//  147  325:aload_1         
		//  148  326:getstatic       #132 <Field i$b i$b.EVENTS>
		//  149  329:aload           10
		//  150  331:invokevirtual   #541 <Method boolean a$a.c()>
		//  151  334:invokevirtual   #534 <Method int i.a(JSONObject, String, i$b, boolean)>
		//  152  337:istore_2        
			  goto _L3
		//* 153  338:goto            1157
			Object obj1;
			obj1;
		//  154  341:astore          9
			break MISSING_BLOCK_LABEL_350;
		//  155  343:goto            350
			obj1;
		//  156  346:astore          9
			message = null;
		//  157  348:aconst_null     
		//  158  349:astore_1        
			StringBuilder stringbuilder5 = new StringBuilder();
		//  159  350:new             #214 <Class StringBuilder>
		//  160  353:dup             
		//  161  354:invokespecial   #215 <Method void StringBuilder()>
		//  162  357:astore          11
			stringbuilder5.append("Exception tracking event ");
		//  163  359:aload           11
		//  164  361:ldc2            #544 <String "Exception tracking event ">
		//  165  364:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  166  367:pop             
			stringbuilder5.append(a3.a());
		//  167  368:aload           11
		//  168  370:aload           10
		//  169  372:invokevirtual   #106 <Method String a$a.a()>
		//  170  375:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  171  378:pop             
			com.mixpanel.android.a.f.e("MixpanelAPI.Messages", stringbuilder5.toString(), ((Throwable) (obj1)));
		//  172  379:ldc2            #267 <String "MixpanelAPI.Messages">
		//  173  382:aload           11
		//  174  384:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  175  387:aload           9
		//  176  389:invokestatic    #272 <Method void f.e(String, String, Throwable)>
			k = ((int) (byte0));
		//  177  392:iload_3         
		//  178  393:istore_2        
			  goto _L3
		//* 179  394:goto            1157
_L5:
			if(message.what != 2) goto _L7; else goto _L6
		//  180  397:aload_1         
		//  181  398:getfield        #305 <Field int Message.what>
		//  182  401:iconst_2        
		//  183  402:icmpne          542
_L6:
			com.mixpanel.android.mpmetrics.a.a(a.a, "Flushing queue due to scheduled or forced flush");
		//  184  405:aload_0         
		//  185  406:getfield        #26  <Field a$e a>
		//  186  409:getfield        #34  <Field a a$e.a>
		//  187  412:ldc2            #546 <String "Flushing queue due to scheduled or forced flush">
		//  188  415:invokestatic    #126 <Method void a.a(a, String)>
			a.e.a(a);
		//  189  418:aload_0         
		//  190  419:getfield        #26  <Field a$e a>
		//  191  422:invokestatic    #549 <Method void a$e.a(a$e)>
			obj1 = ((Object) ((String)message.obj));
		//  192  425:aload_1         
		//  193  426:getfield        #309 <Field Object Message.obj>
		//  194  429:checkcast       #98  <Class String>
		//  195  432:astore          9
			if(message.arg1 == 1)
		//* 196  434:aload_1         
		//* 197  435:getfield        #552 <Field int Message.arg1>
		//* 198  438:iconst_1        
		//* 199  439:icmpne          445
				flag = true;
		//  200  442:iconst_1        
		//  201  443:istore          4
			a(b, ((String) (obj1)));
		//  202  445:aload_0         
		//  203  446:aload_0         
		//  204  447:getfield        #31  <Field i b>
		//  205  450:aload           9
		//  206  452:invokespecial   #554 <Method void a(i, String)>
			k = ((int) (byte0));
		//  207  455:iload_3         
		//  208  456:istore_2        
			message = ((Message) (obj1));
		//  209  457:aload           9
		//  210  459:astore_1        
			if(!flag) goto _L3; else goto _L8
		//  211  460:iload           4
		//  212  462:ifeq            795
_L8:
			long l;
			long l1;
			l = SystemClock.elapsedRealtime();
		//  213  465:invokestatic    #559 <Method long SystemClock.elapsedRealtime()>
		//  214  468:lstore          5
			l1 = e;
		//  215  470:aload_0         
		//  216  471:getfield        #561 <Field long e>
		//  217  474:lstore          7
			k = ((int) (byte0));
		//  218  476:iload_3         
		//  219  477:istore_2        
			message = ((Message) (obj1));
		//  220  478:aload           9
		//  221  480:astore_1        
			if(l < l1) goto _L3; else goto _L9
		//  222  481:lload           5
		//  223  483:lload           7
		//  224  485:lcmp            
		//  225  486:iflt            795
_L9:
			c.a(((String) (obj1)), a.a.b());
		//  226  489:aload_0         
		//  227  490:getfield        #50  <Field d c>
		//  228  493:aload           9
		//  229  495:aload_0         
		//  230  496:getfield        #26  <Field a$e a>
		//  231  499:getfield        #34  <Field a a$e.a>
		//  232  502:invokevirtual   #112 <Method h com.mixpanel.android.mpmetrics.a.b()>
		//  233  505:invokevirtual   #564 <Method void d.a(String, h)>
			k = ((int) (byte0));
		//  234  508:iload_3         
		//  235  509:istore_2        
			message = ((Message) (obj1));
		//  236  510:aload           9
		//  237  512:astore_1        
			  goto _L3
		//* 238  513:goto            795
			message;
		//  239  516:astore_1        
			e = SystemClock.elapsedRealtime() + (long)(((com.mixpanel.android.a.h.a) (message)).a() * 1000);
		//  240  517:aload_0         
		//  241  518:invokestatic    #559 <Method long SystemClock.elapsedRealtime()>
		//  242  521:aload_1         
		//  243  522:invokevirtual   #257 <Method int com.mixpanel.android.a.h$a.a()>
		//  244  525:sipush          1000
		//  245  528:imul            
		//  246  529:i2l             
		//  247  530:ladd            
		//  248  531:putfield        #561 <Field long e>
			k = ((int) (byte0));
		//  249  534:iload_3         
		//  250  535:istore_2        
			message = ((Message) (obj1));
		//  251  536:aload           9
		//  252  538:astore_1        
			  goto _L3
		//* 253  539:goto            795
_L7:
			if(message.what != 12) goto _L11; else goto _L10
		//  254  542:aload_1         
		//  255  543:getfield        #305 <Field int Message.what>
		//  256  546:bipush          12
		//  257  548:icmpne          644
_L10:
			com.mixpanel.android.mpmetrics.a.a(a.a, "Installing a check for in-app notifications");
		//  258  551:aload_0         
		//  259  552:getfield        #26  <Field a$e a>
		//  260  555:getfield        #34  <Field a a$e.a>
		//  261  558:ldc2            #566 <String "Installing a check for in-app notifications">
		//  262  561:invokestatic    #126 <Method void a.a(a, String)>
			message = ((Message) ((e)message.obj));
		//  263  564:aload_1         
		//  264  565:getfield        #309 <Field Object Message.obj>
		//  265  568:checkcast       #163 <Class e>
		//  266  571:astore_1        
			c.a(((e) (message)));
		//  267  572:aload_0         
		//  268  573:getfield        #50  <Field d c>
		//  269  576:aload_1         
		//  270  577:invokevirtual   #569 <Method void d.a(e)>
			l = SystemClock.elapsedRealtime();
		//  271  580:invokestatic    #559 <Method long SystemClock.elapsedRealtime()>
		//  272  583:lstore          5
			l1 = e;
		//  273  585:aload_0         
		//  274  586:getfield        #561 <Field long e>
		//  275  589:lstore          7
			if(l < l1) goto _L13; else goto _L12
		//  276  591:lload           5
		//  277  593:lload           7
		//  278  595:lcmp            
		//  279  596:iflt            1160
_L12:
			c.a(((e) (message)).a(), a.a.b());
		//  280  599:aload_0         
		//  281  600:getfield        #50  <Field d c>
		//  282  603:aload_1         
		//  283  604:invokevirtual   #570 <Method String e.a()>
		//  284  607:aload_0         
		//  285  608:getfield        #26  <Field a$e a>
		//  286  611:getfield        #34  <Field a a$e.a>
		//  287  614:invokevirtual   #112 <Method h com.mixpanel.android.mpmetrics.a.b()>
		//  288  617:invokevirtual   #564 <Method void d.a(String, h)>
			  goto _L13
		//* 289  620:goto            1160
			message;
		//  290  623:astore_1        
			e = SystemClock.elapsedRealtime() + (long)(((com.mixpanel.android.a.h.a) (message)).a() * 1000);
		//  291  624:aload_0         
		//  292  625:invokestatic    #559 <Method long SystemClock.elapsedRealtime()>
		//  293  628:aload_1         
		//  294  629:invokevirtual   #257 <Method int com.mixpanel.android.a.h$a.a()>
		//  295  632:sipush          1000
		//  296  635:imul            
		//  297  636:i2l             
		//  298  637:ladd            
		//  299  638:putfield        #561 <Field long e>
			  goto _L13
		//* 300  641:goto            1160
_L11:
			if(message.what != 13) goto _L15; else goto _L14
		//  301  644:aload_1         
		//  302  645:getfield        #305 <Field int Message.what>
		//  303  648:bipush          13
		//  304  650:icmpne          667
_L14:
			a((String)message.obj);
		//  305  653:aload_0         
		//  306  654:aload_1         
		//  307  655:getfield        #309 <Field Object Message.obj>
		//  308  658:checkcast       #98  <Class String>
		//  309  661:invokespecial   #572 <Method void a(String)>
			  goto _L13
		//* 310  664:goto            1160
_L15:
			if(message.what != 5) goto _L17; else goto _L16
		//  311  667:aload_1         
		//  312  668:getfield        #305 <Field int Message.what>
		//  313  671:iconst_5        
		//  314  672:icmpne          756
_L16:
			message = ((Message) (new StringBuilder()));
		//  315  675:new             #214 <Class StringBuilder>
		//  316  678:dup             
		//  317  679:invokespecial   #215 <Method void StringBuilder()>
		//  318  682:astore_1        
			((StringBuilder) (message)).append("Worker received a hard kill. Dumping all events and force-killing. Thread id ");
		//  319  683:aload_1         
		//  320  684:ldc2            #574 <String "Worker received a hard kill. Dumping all events and force-killing. Thread id ">
		//  321  687:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  322  690:pop             
			((StringBuilder) (message)).append(Thread.currentThread().getId());
		//  323  691:aload_1         
		//  324  692:invokestatic    #580 <Method Thread Thread.currentThread()>
		//  325  695:invokevirtual   #583 <Method long Thread.getId()>
		//  326  698:invokevirtual   #318 <Method StringBuilder StringBuilder.append(long)>
		//  327  701:pop             
			com.mixpanel.android.a.f.d("MixpanelAPI.Messages", ((StringBuilder) (message)).toString());
		//  328  702:ldc2            #267 <String "MixpanelAPI.Messages">
		//  329  705:aload_1         
		//  330  706:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  331  709:invokestatic    #363 <Method void f.d(String, String)>
			synchronized(com.mixpanel.android.mpmetrics.a.e.b(a))
		//* 332  712:aload_0         
		//* 333  713:getfield        #26  <Field a$e a>
		//* 334  716:invokestatic    #586 <Method Object com.mixpanel.android.mpmetrics.a$e.b(a$e)>
		//* 335  719:astore_1        
		//* 336  720:aload_1         
		//* 337  721:monitorenter    
			{
				b.a();
		//  338  722:aload_0         
		//  339  723:getfield        #31  <Field i b>
		//  340  726:invokevirtual   #588 <Method void i.a()>
				a.e.a(a, ((Handler) (null)));
		//  341  729:aload_0         
		//  342  730:getfield        #26  <Field a$e a>
		//  343  733:aconst_null     
		//  344  734:invokestatic    #591 <Method Handler a$e.a(a$e, Handler)>
		//  345  737:pop             
				Looper.myLooper().quit();
		//  346  738:invokestatic    #597 <Method Looper Looper.myLooper()>
		//  347  741:invokevirtual   #600 <Method void Looper.quit()>
			}
		//  348  744:aload_1         
		//  349  745:monitorexit     
			  goto _L13
		//* 350  746:goto            1160
			exception;
		//  351  749:astore          9
			message;
		//  352  751:aload_1         
			JVM INSTR monitorexit ;
		//  353  752:monitorexit     
			throw exception;
		//  354  753:aload           9
		//  355  755:athrow          
_L17:
			StringBuilder stringbuilder = new StringBuilder();
		//  356  756:new             #214 <Class StringBuilder>
		//  357  759:dup             
		//  358  760:invokespecial   #215 <Method void StringBuilder()>
		//  359  763:astore          9
			stringbuilder.append("Unexpected message received by Mixpanel worker: ");
		//  360  765:aload           9
		//  361  767:ldc2            #602 <String "Unexpected message received by Mixpanel worker: ">
		//  362  770:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  363  773:pop             
			stringbuilder.append(((Object) (message)));
		//  364  774:aload           9
		//  365  776:aload_1         
		//  366  777:invokevirtual   #605 <Method StringBuilder StringBuilder.append(Object)>
		//  367  780:pop             
			com.mixpanel.android.a.f.e("MixpanelAPI.Messages", stringbuilder.toString());
		//  368  781:ldc2            #267 <String "MixpanelAPI.Messages">
		//  369  784:aload           9
		//  370  786:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  371  789:invokestatic    #607 <Method void f.e(String, String)>
			  goto _L13
		//* 372  792:goto            1160
_L3:
			if(k < a.a.b.a() && k != -2)
				break MISSING_BLOCK_LABEL_962;
		//  373  795:iload_2         
		//  374  796:aload_0         
		//  375  797:getfield        #26  <Field a$e a>
		//  376  800:getfield        #34  <Field a a$e.a>
		//  377  803:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//  378  806:invokevirtual   #608 <Method int h.a()>
		//  379  809:icmpge          818
		//  380  812:iload_2         
		//  381  813:bipush          -2
		//  382  815:icmpne          962
			if(g > 0 || message == null)
				break MISSING_BLOCK_LABEL_962;
		//  383  818:aload_0         
		//  384  819:getfield        #233 <Field int g>
		//  385  822:ifgt            962
		//  386  825:aload_1         
		//  387  826:ifnull          962
			com.mixpanel.android.mpmetrics.a a1 = a.a;
		//  388  829:aload_0         
		//  389  830:getfield        #26  <Field a$e a>
		//  390  833:getfield        #34  <Field a a$e.a>
		//  391  836:astore          9
			StringBuilder stringbuilder2 = new StringBuilder();
		//  392  838:new             #214 <Class StringBuilder>
		//  393  841:dup             
		//  394  842:invokespecial   #215 <Method void StringBuilder()>
		//  395  845:astore          10
			stringbuilder2.append("Flushing queue due to bulk upload limit (");
		//  396  847:aload           10
		//  397  849:ldc2            #610 <String "Flushing queue due to bulk upload limit (">
		//  398  852:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  399  855:pop             
			stringbuilder2.append(k);
		//  400  856:aload           10
		//  401  858:iload_2         
		//  402  859:invokevirtual   #613 <Method StringBuilder StringBuilder.append(int)>
		//  403  862:pop             
			stringbuilder2.append(") for project ");
		//  404  863:aload           10
		//  405  865:ldc2            #615 <String ") for project ">
		//  406  868:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  407  871:pop             
			stringbuilder2.append(((String) (message)));
		//  408  872:aload           10
		//  409  874:aload_1         
		//  410  875:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  411  878:pop             
			com.mixpanel.android.mpmetrics.a.a(a1, stringbuilder2.toString());
		//  412  879:aload           9
		//  413  881:aload           10
		//  414  883:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  415  886:invokestatic    #126 <Method void a.a(a, String)>
			a.e.a(a);
		//  416  889:aload_0         
		//  417  890:getfield        #26  <Field a$e a>
		//  418  893:invokestatic    #549 <Method void a$e.a(a$e)>
			a(b, ((String) (message)));
		//  419  896:aload_0         
		//  420  897:aload_0         
		//  421  898:getfield        #31  <Field i b>
		//  422  901:aload_1         
		//  423  902:invokespecial   #554 <Method void a(i, String)>
			l = SystemClock.elapsedRealtime();
		//  424  905:invokestatic    #559 <Method long SystemClock.elapsedRealtime()>
		//  425  908:lstore          5
			l1 = e;
		//  426  910:aload_0         
		//  427  911:getfield        #561 <Field long e>
		//  428  914:lstore          7
			if(l < l1)
				break; /* Loop/switch isn't completed */
		//  429  916:lload           5
		//  430  918:lload           7
		//  431  920:lcmp            
		//  432  921:iflt            1167
			c.a(((String) (message)), a.a.b());
		//  433  924:aload_0         
		//  434  925:getfield        #50  <Field d c>
		//  435  928:aload_1         
		//  436  929:aload_0         
		//  437  930:getfield        #26  <Field a$e a>
		//  438  933:getfield        #34  <Field a a$e.a>
		//  439  936:invokevirtual   #112 <Method h com.mixpanel.android.mpmetrics.a.b()>
		//  440  939:invokevirtual   #564 <Method void d.a(String, h)>
			return;
		//  441  942:return          
			message;
		//  442  943:astore_1        
			e = SystemClock.elapsedRealtime() + (long)(((com.mixpanel.android.a.h.a) (message)).a() * 1000);
		//  443  944:aload_0         
		//  444  945:invokestatic    #559 <Method long SystemClock.elapsedRealtime()>
		//  445  948:aload_1         
		//  446  949:invokevirtual   #257 <Method int com.mixpanel.android.a.h$a.a()>
		//  447  952:sipush          1000
		//  448  955:imul            
		//  449  956:i2l             
		//  450  957:ladd            
		//  451  958:putfield        #561 <Field long e>
			return;
		//  452  961:return          
			if(k <= 0)
				break; /* Loop/switch isn't completed */
		//  453  962:iload_2         
		//  454  963:ifle            1167
			if(!hasMessages(2, ((Object) (message))))
		//* 455  966:aload_0         
		//* 456  967:iconst_2        
		//* 457  968:aload_1         
		//* 458  969:invokevirtual   #619 <Method boolean hasMessages(int, Object)>
		//* 459  972:ifne            1167
			{
				com.mixpanel.android.mpmetrics.a a2 = a.a;
		//  460  975:aload_0         
		//  461  976:getfield        #26  <Field a$e a>
		//  462  979:getfield        #34  <Field a a$e.a>
		//  463  982:astore          9
				StringBuilder stringbuilder3 = new StringBuilder();
		//  464  984:new             #214 <Class StringBuilder>
		//  465  987:dup             
		//  466  988:invokespecial   #215 <Method void StringBuilder()>
		//  467  991:astore          10
				stringbuilder3.append("Queue depth ");
		//  468  993:aload           10
		//  469  995:ldc2            #621 <String "Queue depth ">
		//  470  998:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  471 1001:pop             
				stringbuilder3.append(k);
		//  472 1002:aload           10
		//  473 1004:iload_2         
		//  474 1005:invokevirtual   #613 <Method StringBuilder StringBuilder.append(int)>
		//  475 1008:pop             
				stringbuilder3.append(" - Adding flush in ");
		//  476 1009:aload           10
		//  477 1011:ldc2            #623 <String " - Adding flush in ">
		//  478 1014:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
		//  479 1017:pop             
				stringbuilder3.append(d);
		//  480 1018:aload           10
		//  481 1020:aload_0         
		//  482 1021:getfield        #60  <Field long d>
		//  483 1024:invokevirtual   #318 <Method StringBuilder StringBuilder.append(long)>
		//  484 1027:pop             
				com.mixpanel.android.mpmetrics.a.a(a2, stringbuilder3.toString());
		//  485 1028:aload           9
		//  486 1030:aload           10
		//  487 1032:invokevirtual   #226 <Method String StringBuilder.toString()>
		//  488 1035:invokestatic    #126 <Method void a.a(a, String)>
				if(d >= 0L)
		//* 489 1038:aload_0         
		//* 490 1039:getfield        #60  <Field long d>
		//* 491 1042:lconst_0        
		//* 492 1043:lcmp            
		//* 493 1044:iflt            1167
				{
					Message message1 = Message.obtain();
		//  494 1047:invokestatic    #302 <Method Message Message.obtain()>
		//  495 1050:astore          9
					message1.what = 2;
		//  496 1052:aload           9
		//  497 1054:iconst_2        
		//  498 1055:putfield        #305 <Field int Message.what>
					message1.obj = ((Object) (message));
		//  499 1058:aload           9
		//  500 1060:aload_1         
		//  501 1061:putfield        #309 <Field Object Message.obj>
					message1.arg1 = 1;
		//  502 1064:aload           9
		//  503 1066:iconst_1        
		//  504 1067:putfield        #552 <Field int Message.arg1>
					sendMessageDelayed(message1, d);
		//  505 1070:aload_0         
		//  506 1071:aload           9
		//  507 1073:aload_0         
		//  508 1074:getfield        #60  <Field long d>
		//  509 1077:invokevirtual   #313 <Method boolean sendMessageDelayed(Message, long)>
		//  510 1080:pop             
					return;
		//  511 1081:return          
				}
			}
			break; /* Loop/switch isn't completed */
			message1;
		//  512 1082:astore          9
			com.mixpanel.android.a.f.e("MixpanelAPI.Messages", "Worker threw an unhandled exception", ((Throwable) (message1)));
		//  513 1084:ldc2            #267 <String "MixpanelAPI.Messages">
		//  514 1087:ldc2            #625 <String "Worker threw an unhandled exception">
		//  515 1090:aload           9
		//  516 1092:invokestatic    #272 <Method void f.e(String, String, Throwable)>
			message = ((Message) (com.mixpanel.android.mpmetrics.a.e.b(a)));
		//  517 1095:aload_0         
		//  518 1096:getfield        #26  <Field a$e a>
		//  519 1099:invokestatic    #586 <Method Object com.mixpanel.android.mpmetrics.a$e.b(a$e)>
		//  520 1102:astore_1        
			message;
		//  521 1103:aload_1         
			JVM INSTR monitorenter ;
		//  522 1104:monitorenter    
			a.e.a(a, ((Handler) (null)));
		//  523 1105:aload_0         
		//  524 1106:getfield        #26  <Field a$e a>
		//  525 1109:aconst_null     
		//  526 1110:invokestatic    #591 <Method Handler a$e.a(a$e, Handler)>
		//  527 1113:pop             
			Looper.myLooper().quit();
		//  528 1114:invokestatic    #597 <Method Looper Looper.myLooper()>
		//  529 1117:invokevirtual   #600 <Method void Looper.quit()>
			com.mixpanel.android.a.f.e("MixpanelAPI.Messages", "Mixpanel will not process any more analytics messages", ((Throwable) (message1)));
		//  530 1120:ldc2            #267 <String "MixpanelAPI.Messages">
		//  531 1123:ldc2            #627 <String "Mixpanel will not process any more analytics messages">
		//  532 1126:aload           9
		//  533 1128:invokestatic    #272 <Method void f.e(String, String, Throwable)>
			break MISSING_BLOCK_LABEL_1147;
		//  534 1131:goto            1147
			message1;
		//  535 1134:astore          9
			com.mixpanel.android.a.f.e("MixpanelAPI.Messages", "Could not halt looper", ((Throwable) (message1)));
		//  536 1136:ldc2            #267 <String "MixpanelAPI.Messages">
		//  537 1139:ldc2            #629 <String "Could not halt looper">
		//  538 1142:aload           9
		//  539 1144:invokestatic    #272 <Method void f.e(String, String, Throwable)>
			message;
		//  540 1147:aload_1         
			JVM INSTR monitorexit ;
		//  541 1148:monitorexit     
			return;
		//  542 1149:return          
			message1;
		//  543 1150:astore          9
			message;
		//  544 1152:aload_1         
			JVM INSTR monitorexit ;
		//  545 1153:monitorexit     
			throw message1;
		//  546 1154:aload           9
		//  547 1156:athrow          
		//* 548 1157:goto            795
_L13:
			message = null;
		//  549 1160:aconst_null     
		//  550 1161:astore_1        
			k = ((int) (byte0));
		//  551 1162:iload_3         
		//  552 1163:istore_2        
			if(true) goto _L3; else goto _L18
		//  553 1164:goto            795
_L18:
		//  554 1167:return          
		}

		final a.e a;
		private i b;
		private final d c = a();
		private final long d;
		private long e;
		private long f;
		private int g;

		public a(Looper looper)
		{
			a = a.e.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field a$e a>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #29  <Method void Handler(Looper)>
			b = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #31  <Field i b>
			a.e.a(a.e.this, s.a(a.e.this.a.a));
		//    9   15:aload_1         
		//   10   16:aload_1         
		//   11   17:getfield        #34  <Field a a$e.a>
		//   12   20:getfield        #37  <Field android.content.Context a.a>
		//   13   23:invokestatic    #42  <Method s s.a(android.content.Context)>
		//   14   26:invokestatic    #45  <Method s a$e.a(a$e, s)>
		//   15   29:pop             
		//   16   30:aload_0         
		//   17   31:aload_0         
		//   18   32:invokevirtual   #48  <Method d a()>
		//   19   35:putfield        #50  <Field d c>
			d = a.e.this.a.b.b();
		//   20   38:aload_0         
		//   21   39:aload_1         
		//   22   40:getfield        #34  <Field a a$e.a>
		//   23   43:getfield        #53  <Field com.mixpanel.android.mpmetrics.h com.mixpanel.android.mpmetrics.a.b>
		//   24   46:invokevirtual   #58  <Method int com.mixpanel.android.mpmetrics.h.b()>
		//   25   49:i2l             
		//   26   50:putfield        #60  <Field long d>
		//   27   53:return          
		}
	}


	static Handler a(a$e a$e1, Handler handler)
	{
		a$e1.c = handler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Handler c>
		return handler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static s a(a$e a$e1, s s)
	{
		a$e1.g = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field s g>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(a$e a$e1)
	{
		a$e1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void b()>
	//    2    4:return          
	}

	static Object b(a$e a$e1)
	{
		return a$e1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object b>
	//    2    4:areturn         
	}

	private void b()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #59  <Method long System.currentTimeMillis()>
	//    1    3:lstore_1        
		long l1 = d + 1L;
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field long d>
	//    4    8:lconst_1        
	//    5    9:ladd            
	//    6   10:lstore_3        
		if(f > 0L)
	//*   7   11:aload_0         
	//*   8   12:getfield        #39  <Field long f>
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifle            101
		{
			e = ((l - f) + e * d) / l1;
	//   12   20:aload_0         
	//   13   21:lload_1         
	//   14   22:aload_0         
	//   15   23:getfield        #39  <Field long f>
	//   16   26:lsub            
	//   17   27:aload_0         
	//   18   28:getfield        #35  <Field long e>
	//   19   31:aload_0         
	//   20   32:getfield        #33  <Field long d>
	//   21   35:lmul            
	//   22   36:ladd            
	//   23   37:lload_3         
	//   24   38:ldiv            
	//   25   39:putfield        #35  <Field long e>
			long l2 = e / 1000L;
	//   26   42:aload_0         
	//   27   43:getfield        #35  <Field long e>
	//   28   46:ldc2w           #60  <Long 1000L>
	//   29   49:ldiv            
	//   30   50:lstore          5
			com.mixpanel.android.mpmetrics.a a1 = a;
	//   31   52:aload_0         
	//   32   53:getfield        #26  <Field a a>
	//   33   56:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   34   58:new             #63  <Class StringBuilder>
	//   35   61:dup             
	//   36   62:invokespecial   #64  <Method void StringBuilder()>
	//   37   65:astore          8
			stringbuilder.append("Average send frequency approximately ");
	//   38   67:aload           8
	//   39   69:ldc1            #66  <String "Average send frequency approximately ">
	//   40   71:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
			stringbuilder.append(l2);
	//   42   75:aload           8
	//   43   77:lload           5
	//   44   79:invokevirtual   #73  <Method StringBuilder StringBuilder.append(long)>
	//   45   82:pop             
			stringbuilder.append(" seconds.");
	//   46   83:aload           8
	//   47   85:ldc1            #75  <String " seconds.">
	//   48   87:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   49   90:pop             
			com.mixpanel.android.mpmetrics.a.a(a1, stringbuilder.toString());
	//   50   91:aload           7
	//   51   93:aload           8
	//   52   95:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   53   98:invokestatic    #82  <Method void a.a(a, String)>
		}
		f = l;
	//   54  101:aload_0         
	//   55  102:lload_1         
	//   56  103:putfield        #39  <Field long f>
		d = l1;
	//   57  106:aload_0         
	//   58  107:lload_3         
	//   59  108:putfield        #33  <Field long d>
	//   60  111:return          
	}

	static s c(a$e a$e1)
	{
		return a$e1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field s g>
	//    2    4:areturn         
	}

	protected Handler a()
	{
		HandlerThread handlerthread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
	//    0    0:new             #85  <Class HandlerThread>
	//    1    3:dup             
	//    2    4:ldc1            #87  <String "com.mixpanel.android.AnalyticsWorker">
	//    3    6:bipush          10
	//    4    8:invokespecial   #90  <Method void HandlerThread(String, int)>
	//    5   11:astore_1        
		handlerthread.start();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #93  <Method void HandlerThread.start()>
		return ((Handler) (new a(handlerthread.getLooper())));
	//    8   16:new             #9   <Class a$e$a>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #97  <Method Looper HandlerThread.getLooper()>
	//   13   25:invokespecial   #100 <Method void a$e$a(a$e, Looper)>
	//   14   28:areturn         
	}

	public void a(Message message)
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object b>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(c == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #44  <Field Handler c>
	//*   7   11:ifnonnull       58
		{
			com.mixpanel.android.mpmetrics.a a1 = a;
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field a a>
	//   10   18:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #63  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #64  <Method void StringBuilder()>
	//   14   26:astore          4
			stringbuilder.append("Dead mixpanel worker dropping a message: ");
	//   15   28:aload           4
	//   16   30:ldc1            #103 <String "Dead mixpanel worker dropping a message: ">
	//   17   32:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append(message.what);
	//   19   36:aload           4
	//   20   38:aload_1         
	//   21   39:getfield        #109 <Field int Message.what>
	//   22   42:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
			com.mixpanel.android.mpmetrics.a.a(a1, stringbuilder.toString());
	//   24   46:aload_3         
	//   25   47:aload           4
	//   26   49:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   27   52:invokestatic    #82  <Method void a.a(a, String)>
			break MISSING_BLOCK_LABEL_67;
	//   28   55:goto            67
		}
		c.sendMessage(message);
	//   29   58:aload_0         
	//   30   59:getfield        #44  <Field Handler c>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #118 <Method boolean Handler.sendMessage(Message)>
	//   33   66:pop             
		obj;
	//   34   67:aload_2         
		JVM INSTR monitorexit ;
	//   35   68:monitorexit     
		return;
	//   36   69:return          
		message;
	//   37   70:astore_1        
		obj;
	//   38   71:aload_2         
		JVM INSTR monitorexit ;
	//   39   72:monitorexit     
		throw message;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	final com.mixpanel.android.mpmetrics.a a;
	private final Object b = new Object();
	private Handler c;
	private long d;
	private long e;
	private long f;
	private s g;

	public a$e(com.mixpanel.android.mpmetrics.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #29  <Method void Object()>
	//    9   17:putfield        #31  <Field Object b>
		d = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #33  <Field long d>
		e = 0L;
	//   13   25:aload_0         
	//   14   26:lconst_0        
	//   15   27:putfield        #35  <Field long e>
		f = -1L;
	//   16   30:aload_0         
	//   17   31:ldc2w           #36  <Long -1L>
	//   18   34:putfield        #39  <Field long f>
		c = a();
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #42  <Method Handler a()>
	//   22   42:putfield        #44  <Field Handler c>
	//   23   45:return          
	}
}
