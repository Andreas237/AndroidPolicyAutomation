// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.config;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.android.pushservice.PushSettings;
import com.baidu.android.pushservice.a;
import com.baidu.android.pushservice.c.b;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.h.m;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.i.e;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice.config:
//			ModeConfig

class ModeConfig$1 extends c
{

	public void a()
	{
		Object obj2;
		obj2 = ((Object) (new HashMap()));
	//    0    0:new             #32  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void HashMap()>
	//    3    7:astore          4
		com.baidu.android.pushservice.c.b.b(((HashMap) (obj2)));
	//    4    9:aload           4
	//    5   11:invokestatic    #39  <Method void b.b(HashMap)>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #41  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #42  <Method void StringBuilder()>
	//    9   21:astore_2        
		stringbuilder.append(ModeConfig.access$000(c));
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field ModeConfig c>
	//   13   27:invokestatic    #46  <Method int ModeConfig.access$000(ModeConfig)>
	//   14   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   15   33:pop             
		stringbuilder.append("");
	//   16   34:aload_2         
	//   17   35:ldc1            #52  <String "">
	//   18   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		((HashMap) (obj2)).put("version", ((Object) (stringbuilder.toString())));
	//   20   41:aload           4
	//   21   43:ldc1            #57  <String "version">
	//   22   45:aload_2         
	//   23   46:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   24   49:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//   25   52:pop             
		((HashMap) (obj2)).put("model", ((Object) (Build.MODEL)));
	//   26   53:aload           4
	//   27   55:ldc1            #67  <String "model">
	//   28   57:getstatic       #73  <Field String Build.MODEL>
	//   29   60:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//   30   63:pop             
		stringbuilder = new StringBuilder();
	//   31   64:new             #41  <Class StringBuilder>
	//   32   67:dup             
	//   33   68:invokespecial   #42  <Method void StringBuilder()>
	//   34   71:astore_2        
		stringbuilder.append(android.os..SDK_INT);
	//   35   72:aload_2         
	//   36   73:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//   37   76:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   38   79:pop             
		stringbuilder.append("");
	//   39   80:aload_2         
	//   40   81:ldc1            #52  <String "">
	//   41   83:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		((HashMap) (obj2)).put("osSdkInt", ((Object) (stringbuilder.toString())));
	//   43   87:aload           4
	//   44   89:ldc1            #81  <String "osSdkInt">
	//   45   91:aload_2         
	//   46   92:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   47   95:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//   48   98:pop             
		if((!u.a() || !PushSettings.m(c.mContext)) && (!u.b() || !PushSettings.n(c.mContext))) goto _L2; else goto _L1
	//   49   99:invokestatic    #86  <Method boolean u.a()>
	//   50  102:ifeq            118
	//   51  105:aload_0         
	//   52  106:getfield        #19  <Field ModeConfig c>
	//   53  109:getfield        #90  <Field Context ModeConfig.mContext>
	//   54  112:invokestatic    #96  <Method boolean PushSettings.m(Context)>
	//   55  115:ifne            137
	//   56  118:invokestatic    #98  <Method boolean u.b()>
	//   57  121:ifeq            290
	//   58  124:aload_0         
	//   59  125:getfield        #19  <Field ModeConfig c>
	//   60  128:getfield        #90  <Field Context ModeConfig.mContext>
	//   61  131:invokestatic    #101 <Method boolean PushSettings.n(Context)>
	//   62  134:ifeq            290
_L1:
		((HashMap) (obj2)).put("manufacture", ((Object) (Build.MANUFACTURER)));
	//   63  137:aload           4
	//   64  139:ldc1            #103 <String "manufacture">
	//   65  141:getstatic       #106 <Field String Build.MANUFACTURER>
	//   66  144:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//   67  147:pop             
		StringBuilder stringbuilder1 = new StringBuilder();
	//   68  148:new             #41  <Class StringBuilder>
	//   69  151:dup             
	//   70  152:invokespecial   #42  <Method void StringBuilder()>
	//   71  155:astore_2        
		stringbuilder1.append(((int) (com.baidu.android.pushservice.a.a())));
	//   72  156:aload_2         
	//   73  157:invokestatic    #111 <Method short a.a()>
	//   74  160:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   75  163:pop             
		stringbuilder1.append("");
	//   76  164:aload_2         
	//   77  165:ldc1            #52  <String "">
	//   78  167:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   79  170:pop             
		((HashMap) (obj2)).put("sdk_version", ((Object) (stringbuilder1.toString())));
	//   80  171:aload           4
	//   81  173:ldc1            #113 <String "sdk_version">
	//   82  175:aload_2         
	//   83  176:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   84  179:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//   85  182:pop             
		((HashMap) (obj2)).put("cuid", ((Object) (e.a(c.mContext))));
	//   86  183:aload           4
	//   87  185:ldc1            #115 <String "cuid">
	//   88  187:aload_0         
	//   89  188:getfield        #19  <Field ModeConfig c>
	//   90  191:getfield        #90  <Field Context ModeConfig.mContext>
	//   91  194:invokestatic    #120 <Method String e.a(Context)>
	//   92  197:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//   93  200:pop             
		((HashMap) (obj2)).put("channelid", ((Object) (PushSettings.a(c.mContext))));
	//   94  201:aload           4
	//   95  203:ldc1            #122 <String "channelid">
	//   96  205:aload_0         
	//   97  206:getfield        #19  <Field ModeConfig c>
	//   98  209:getfield        #90  <Field Context ModeConfig.mContext>
	//   99  212:invokestatic    #123 <Method String PushSettings.a(Context)>
	//  100  215:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//  101  218:pop             
		((HashMap) (obj2)).put("package_name", ((Object) (c.mContext.getPackageName())));
	//  102  219:aload           4
	//  103  221:ldc1            #125 <String "package_name">
	//  104  223:aload_0         
	//  105  224:getfield        #19  <Field ModeConfig c>
	//  106  227:getfield        #90  <Field Context ModeConfig.mContext>
	//  107  230:invokevirtual   #130 <Method String Context.getPackageName()>
	//  108  233:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//  109  236:pop             
		((HashMap) (obj2)).put("pkg_sign", ((Object) (u.q(c.mContext, c.mContext.getPackageName()))));
	//  110  237:aload           4
	//  111  239:ldc1            #132 <String "pkg_sign">
	//  112  241:aload_0         
	//  113  242:getfield        #19  <Field ModeConfig c>
	//  114  245:getfield        #90  <Field Context ModeConfig.mContext>
	//  115  248:aload_0         
	//  116  249:getfield        #19  <Field ModeConfig c>
	//  117  252:getfield        #90  <Field Context ModeConfig.mContext>
	//  118  255:invokevirtual   #130 <Method String Context.getPackageName()>
	//  119  258:invokestatic    #136 <Method String u.q(Context, String)>
	//  120  261:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//  121  264:pop             
		String s = "rom_version";
	//  122  265:ldc1            #138 <String "rom_version">
	//  123  267:astore_2        
		Object obj1 = ((Object) (u.G(c.mContext)));
	//  124  268:aload_0         
	//  125  269:getfield        #19  <Field ModeConfig c>
	//  126  272:getfield        #90  <Field Context ModeConfig.mContext>
	//  127  275:invokestatic    #141 <Method String u.G(Context)>
	//  128  278:astore_3        
_L3:
		((HashMap) (obj2)).put(((Object) (s)), obj1);
	//  129  279:aload           4
	//  130  281:aload_2         
	//  131  282:aload_3         
	//  132  283:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//  133  286:pop             
		break MISSING_BLOCK_LABEL_335;
	//  134  287:goto            335
_L2:
		((HashMap) (obj2)).put("manufacturer", ((Object) (Build.MANUFACTURER)));
	//  135  290:aload           4
	//  136  292:ldc1            #143 <String "manufacturer">
	//  137  294:getstatic       #106 <Field String Build.MANUFACTURER>
	//  138  297:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
	//  139  300:pop             
		s = "pushSdkInt";
	//  140  301:ldc1            #145 <String "pushSdkInt">
	//  141  303:astore_2        
		obj1 = ((Object) (new StringBuilder()));
	//  142  304:new             #41  <Class StringBuilder>
	//  143  307:dup             
	//  144  308:invokespecial   #42  <Method void StringBuilder()>
	//  145  311:astore_3        
		((StringBuilder) (obj1)).append(((int) (com.baidu.android.pushservice.a.a())));
	//  146  312:aload_3         
	//  147  313:invokestatic    #111 <Method short a.a()>
	//  148  316:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//  149  319:pop             
		((StringBuilder) (obj1)).append("");
	//  150  320:aload_3         
	//  151  321:ldc1            #52  <String "">
	//  152  323:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  153  326:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  154  327:aload_3         
	//  155  328:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  156  331:astore_3        
		  goto _L3
	//* 157  332:goto            279
		Object obj = ((Object) (ModeConfig.access$100()));
	//  158  335:invokestatic    #148 <Method String ModeConfig.access$100()>
	//  159  338:astore_2        
		obj1 = ((Object) (new StringBuilder()));
	//  160  339:new             #41  <Class StringBuilder>
	//  161  342:dup             
	//  162  343:invokespecial   #42  <Method void StringBuilder()>
	//  163  346:astore_3        
		((StringBuilder) (obj1)).append("update config request send, params=");
	//  164  347:aload_3         
	//  165  348:ldc1            #150 <String "update config request send, params=">
	//  166  350:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  167  353:pop             
		((StringBuilder) (obj1)).append(com.baidu.android.pushservice.c.b.a(((HashMap) (obj2))));
	//  168  354:aload_3         
	//  169  355:aload           4
	//  170  357:invokestatic    #153 <Method String b.a(HashMap)>
	//  171  360:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  172  363:pop             
		com.baidu.android.pushservice.e.a.c(((String) (obj)), ((StringBuilder) (obj1)).toString());
	//  173  364:aload_2         
	//  174  365:aload_3         
	//  175  366:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  176  369:invokestatic    #158 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		obj = ((Object) (ModeConfig.access$200(c, ((HashMap) (obj2)))));
	//  177  372:aload_0         
	//  178  373:getfield        #19  <Field ModeConfig c>
	//  179  376:aload           4
	//  180  378:invokestatic    #162 <Method String ModeConfig.access$200(ModeConfig, HashMap)>
	//  181  381:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
			break MISSING_BLOCK_LABEL_558;
	//  182  382:aload_2         
	//  183  383:invokestatic    #168 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  184  386:ifne            558
		obj = ((Object) (new JSONObject(((String) (obj)))));
	//  185  389:new             #170 <Class JSONObject>
	//  186  392:dup             
	//  187  393:aload_2         
	//  188  394:invokespecial   #173 <Method void JSONObject(String)>
	//  189  397:astore_2        
		obj1 = ((Object) ((JSONObject)((JSONObject) (obj)).get("response_params")));
	//  190  398:aload_2         
	//  191  399:ldc1            #175 <String "response_params">
	//  192  401:invokevirtual   #179 <Method Object JSONObject.get(String)>
	//  193  404:checkcast       #170 <Class JSONObject>
	//  194  407:astore_3        
		obj2 = ((Object) (ModeConfig.access$100()));
	//  195  408:invokestatic    #148 <Method String ModeConfig.access$100()>
	//  196  411:astore          4
		StringBuilder stringbuilder2 = new StringBuilder();
	//  197  413:new             #41  <Class StringBuilder>
	//  198  416:dup             
	//  199  417:invokespecial   #42  <Method void StringBuilder()>
	//  200  420:astore          5
		stringbuilder2.append("new config content=");
	//  201  422:aload           5
	//  202  424:ldc1            #181 <String "new config content=">
	//  203  426:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  204  429:pop             
		stringbuilder2.append(((JSONObject) (obj)).toString());
	//  205  430:aload           5
	//  206  432:aload_2         
	//  207  433:invokevirtual   #182 <Method String JSONObject.toString()>
	//  208  436:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  209  439:pop             
		com.baidu.android.pushservice.e.a.c(((String) (obj2)), stringbuilder2.toString());
	//  210  440:aload           4
	//  211  442:aload           5
	//  212  444:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  213  447:invokestatic    #158 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_558;
	//  214  450:aload_3         
	//  215  451:ifnull          558
		boolean flag;
		if(((JSONObject) (obj1)).getInt("status") != 1)
			break MISSING_BLOCK_LABEL_558;
	//  216  454:aload_3         
	//  217  455:ldc1            #184 <String "status">
	//  218  457:invokevirtual   #188 <Method int JSONObject.getInt(String)>
	//  219  460:iconst_1        
	//  220  461:icmpne          558
		String s1 = ((JSONObject) (obj1)).getString("sdkconfig");
	//  221  464:aload_3         
	//  222  465:ldc1            #190 <String "sdkconfig">
	//  223  467:invokevirtual   #194 <Method String JSONObject.getString(String)>
	//  224  470:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
			break MISSING_BLOCK_LABEL_558;
	//  225  471:aload_2         
	//  226  472:invokestatic    #168 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  227  475:ifne            558
		flag = c.writeConfig(s1);
	//  228  478:aload_0         
	//  229  479:getfield        #19  <Field ModeConfig c>
	//  230  482:aload_2         
	//  231  483:invokevirtual   #198 <Method boolean ModeConfig.writeConfig(String)>
	//  232  486:istore_1        
		s1 = ModeConfig.access$100();
	//  233  487:invokestatic    #148 <Method String ModeConfig.access$100()>
	//  234  490:astore_2        
		obj1 = ((Object) (new StringBuilder()));
	//  235  491:new             #41  <Class StringBuilder>
	//  236  494:dup             
	//  237  495:invokespecial   #42  <Method void StringBuilder()>
	//  238  498:astore_3        
		((StringBuilder) (obj1)).append("write config >> ");
	//  239  499:aload_3         
	//  240  500:ldc1            #200 <String "write config >> ">
	//  241  502:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  242  505:pop             
		((StringBuilder) (obj1)).append(flag);
	//  243  506:aload_3         
	//  244  507:iload_1         
	//  245  508:invokevirtual   #203 <Method StringBuilder StringBuilder.append(boolean)>
	//  246  511:pop             
		com.baidu.android.pushservice.e.a.c(s1, ((StringBuilder) (obj1)).toString());
	//  247  512:aload_2         
	//  248  513:aload_3         
	//  249  514:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  250  517:invokestatic    #158 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		if(flag)
	//* 251  520:iload_1         
	//* 252  521:ifeq            558
			try
			{
				c.reload();
	//  253  524:aload_0         
	//  254  525:getfield        #19  <Field ModeConfig c>
	//  255  528:invokevirtual   #206 <Method void ModeConfig.reload()>
				m.a(c.mContext, "last_update_config_time", a);
	//  256  531:aload_0         
	//  257  532:getfield        #19  <Field ModeConfig c>
	//  258  535:getfield        #90  <Field Context ModeConfig.mContext>
	//  259  538:ldc1            #208 <String "last_update_config_time">
	//  260  540:aload_0         
	//  261  541:getfield        #21  <Field long a>
	//  262  544:invokestatic    #213 <Method void m.a(Context, String, long)>
			}
	//* 263  547:goto            558
			catch(Exception exception)
	//* 264  550:astore_2        
			{
				com.baidu.android.pushservice.e.a.a(ModeConfig.access$100(), ((Throwable) (exception)));
	//  265  551:invokestatic    #148 <Method String ModeConfig.access$100()>
	//  266  554:aload_2         
	//  267  555:invokestatic    #216 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
			}
		if(b != null && !ModeConfig.access$300())
	//* 268  558:aload_0         
	//* 269  559:getfield        #23  <Field ModeConfig$a b>
	//* 270  562:ifnull          580
	//* 271  565:invokestatic    #219 <Method boolean ModeConfig.access$300()>
	//* 272  568:ifne            580
			b.a();
	//  273  571:aload_0         
	//  274  572:getfield        #23  <Field ModeConfig$a b>
	//  275  575:invokeinterface #223 <Method void com.baidu.android.pushservice.config.ModeConfig$a.a()>
		return;
	//  276  580:return          
	}

	final long a;
	final ModeConfig$a b;
	final ModeConfig c;

	ModeConfig$1(ModeConfig modeconfig, String s, short word0, long l, ModeConfig$a modeconfig$a)
	{
		c = modeconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ModeConfig c>
		a = l;
	//    3    5:aload_0         
	//    4    6:lload           4
	//    5    8:putfield        #21  <Field long a>
		b = modeconfig$a;
	//    6   11:aload_0         
	//    7   12:aload           6
	//    8   14:putfield        #23  <Field ModeConfig$a b>
		super(s, word0);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #26  <Method void c(String, short)>
	//   13   23:return          
	}
}
