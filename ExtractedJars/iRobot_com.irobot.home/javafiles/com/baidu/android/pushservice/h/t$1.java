// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.h;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.baidu.android.pushservice.e.b;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.h;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.baidu.android.pushservice.h:
//			t, u

static final class t$1 extends c
{

	public void a()
	{
		boolean flag1;
		boolean flag2;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		Object obj = ((Object) (((ActivityManager)a.getSystemService("activity")).getRunningServices(1000)));
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field Context a>
	//    6   10:ldc1            #28  <String "activity">
	//    7   12:invokevirtual   #34  <Method Object Context.getSystemService(String)>
	//    8   15:checkcast       #36  <Class ActivityManager>
	//    9   18:sipush          1000
	//   10   21:invokevirtual   #40  <Method List ActivityManager.getRunningServices(int)>
	//   11   24:astore          6
		if(!u.I(a)) goto _L2; else goto _L1
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field Context a>
	//   14   30:invokestatic    #46  <Method boolean u.I(Context)>
	//   15   33:ifeq            126
_L1:
		boolean flag = flag2;
	//   16   36:iload           5
	//   17   38:istore_3        
		if(!u.u(a).contains(((Object) (b)))) goto _L4; else goto _L3
	//   18   39:aload_0         
	//   19   40:getfield        #17  <Field Context a>
	//   20   43:invokestatic    #50  <Method List u.u(Context)>
	//   21   46:aload_0         
	//   22   47:getfield        #19  <Field String b>
	//   23   50:invokeinterface #56  <Method boolean List.contains(Object)>
	//   24   55:ifeq            377
_L3:
		obj = ((Object) (((List) (com.baidu.android.pushservice.i.c.a("netstat -ant", ((java.io.File) (null))))).iterator()));
	//   25   58:ldc1            #58  <String "netstat -ant">
	//   26   60:aconst_null     
	//   27   61:invokestatic    #63  <Method java.util.ArrayList com.baidu.android.pushservice.i.c.a(String, java.io.File)>
	//   28   64:invokeinterface #67  <Method Iterator List.iterator()>
	//   29   69:astore          6
_L7:
		flag = flag2;
	//   30   71:iload           5
	//   31   73:istore_3        
		if(!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
	//   32   74:aload           6
	//   33   76:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//   34   81:ifeq            377
_L5:
		Object obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   35   84:aload           6
	//   36   86:invokeinterface #77  <Method Object Iterator.next()>
	//   37   91:checkcast       #79  <Class String>
	//   38   94:astore          7
		if(!((String) (obj1)).toUpperCase().contains("ESTABLISHED") || !((String) (obj1)).contains(((CharSequence) (String.valueOf(h.b))))) goto _L7; else goto _L6
	//   39   96:aload           7
	//   40   98:invokevirtual   #83  <Method String String.toUpperCase()>
	//   41  101:ldc1            #85  <String "ESTABLISHED">
	//   42  103:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
	//   43  106:ifeq            71
	//   44  109:aload           7
	//   45  111:getstatic       #92  <Field int h.b>
	//   46  114:invokestatic    #96  <Method String String.valueOf(int)>
	//   47  117:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
	//   48  120:ifeq            71
	//*  49  123:goto            444
_L2:
		flag = flag2;
	//   50  126:iload           5
	//   51  128:istore_3        
		if(TextUtils.isEmpty(((CharSequence) (b)))) goto _L4; else goto _L8
	//   52  129:aload_0         
	//   53  130:getfield        #19  <Field String b>
	//   54  133:invokestatic    #101 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   55  136:ifne            377
_L8:
		flag = flag2;
	//   56  139:iload           5
	//   57  141:istore_3        
		if(obj == null) goto _L4; else goto _L9
	//   58  142:aload           6
	//   59  144:ifnull          377
_L9:
		flag = flag2;
	//   60  147:iload           5
	//   61  149:istore_3        
		if(((List) (obj)).isEmpty()) goto _L4; else goto _L10
	//   62  150:aload           6
	//   63  152:invokeinterface #103 <Method boolean List.isEmpty()>
	//   64  157:ifne            377
_L10:
		obj = ((Object) (((List) (obj)).iterator()));
	//   65  160:aload           6
	//   66  162:invokeinterface #67  <Method Iterator List.iterator()>
	//   67  167:astore          6
_L13:
		flag = flag2;
	//   68  169:iload           5
	//   69  171:istore_3        
		if(!((Iterator) (obj)).hasNext()) goto _L4; else goto _L11
	//   70  172:aload           6
	//   71  174:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//   72  179:ifeq            377
_L11:
		String s;
		obj1 = ((Object) ((android.app.vityManager.RunningServiceInfo)((Iterator) (obj)).next()));
	//   73  182:aload           6
	//   74  184:invokeinterface #77  <Method Object Iterator.next()>
	//   75  189:checkcast       #105 <Class android.app.ActivityManager$RunningServiceInfo>
	//   76  192:astore          7
		s = ((android.app.vityManager.RunningServiceInfo) (obj1)).service.getPackageName();
	//   77  194:aload           7
	//   78  196:getfield        #109 <Field ComponentName android.app.ActivityManager$RunningServiceInfo.service>
	//   79  199:invokevirtual   #114 <Method String ComponentName.getPackageName()>
	//   80  202:astore          8
		if(!((android.app.vityManager.RunningServiceInfo) (obj1)).service.getClassName().equals("com.baidu.android.pushservice.PushService") || !b.equals(((Object) (s)))) goto _L13; else goto _L12
	//   81  204:aload           7
	//   82  206:getfield        #109 <Field ComponentName android.app.ActivityManager$RunningServiceInfo.service>
	//   83  209:invokevirtual   #117 <Method String ComponentName.getClassName()>
	//   84  212:ldc1            #119 <String "com.baidu.android.pushservice.PushService">
	//   85  214:invokevirtual   #122 <Method boolean String.equals(Object)>
	//   86  217:ifeq            169
	//   87  220:aload_0         
	//   88  221:getfield        #19  <Field String b>
	//   89  224:aload           8
	//   90  226:invokevirtual   #122 <Method boolean String.equals(Object)>
	//   91  229:ifeq            169
_L12:
		obj = ((Object) (((List) (com.baidu.android.pushservice.i.c.a("netstat -ant", ((java.io.File) (null))))).iterator()));
	//   92  232:ldc1            #58  <String "netstat -ant">
	//   93  234:aconst_null     
	//   94  235:invokestatic    #63  <Method java.util.ArrayList com.baidu.android.pushservice.i.c.a(String, java.io.File)>
	//   95  238:invokeinterface #67  <Method Iterator List.iterator()>
	//   96  243:astore          6
		flag = false;
	//   97  245:iconst_0        
	//   98  246:istore_3        
_L21:
		if(!((Iterator) (obj)).hasNext()) goto _L4; else goto _L14
	//   99  247:aload           6
	//  100  249:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//  101  254:ifeq            350
_L14:
		obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//  102  257:aload           6
	//  103  259:invokeinterface #77  <Method Object Iterator.next()>
	//  104  264:checkcast       #79  <Class String>
	//  105  267:astore          7
		if(!flag) goto _L15; else goto _L4
	//  106  269:iload_3         
	//  107  270:ifeq            276
	//* 108  273:goto            350
_L15:
		if(!((String) (obj1)).toUpperCase().contains("ESTABLISHED"))
			continue; /* Loop/switch isn't completed */
	//  109  276:aload           7
	//  110  278:invokevirtual   #83  <Method String String.toUpperCase()>
	//  111  281:ldc1            #85  <String "ESTABLISHED">
	//  112  283:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
	//  113  286:ifeq            247
		if(!((String) (obj1)).contains(((CharSequence) (String.valueOf(h.a))))) goto _L16; else goto _L6
	//  114  289:aload           7
	//  115  291:getstatic       #124 <Field int h.a>
	//  116  294:invokestatic    #96  <Method String String.valueOf(int)>
	//  117  297:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
	//  118  300:ifeq            306
	//* 119  303:goto            444
_L16:
		int j;
		String as[];
		as = h.c;
	//  120  306:getstatic       #128 <Field String[] h.c>
	//  121  309:astore          8
		j = as.length;
	//  122  311:aload           8
	//  123  313:arraylength     
	//  124  314:istore_2        
		int i = 0;
	//  125  315:iconst_0        
	//  126  316:istore_1        
_L18:
		if(i >= j)
			continue; /* Loop/switch isn't completed */
	//  127  317:iload_1         
	//  128  318:iload_2         
	//  129  319:icmpge          247
		flag1 = ((String) (obj1)).contains(((CharSequence) (as[i])));
	//  130  322:aload           7
	//  131  324:aload           8
	//  132  326:iload_1         
	//  133  327:aaload          
	//  134  328:invokevirtual   #88  <Method boolean String.contains(CharSequence)>
	//  135  331:istore          4
		if(flag1)
	//* 136  333:iload           4
	//* 137  335:ifeq            343
		{
			flag = true;
	//  138  338:iconst_1        
	//  139  339:istore_3        
			continue; /* Loop/switch isn't completed */
	//  140  340:goto            247
		}
		i++;
	//  141  343:iload_1         
	//  142  344:iconst_1        
	//  143  345:iadd            
	//  144  346:istore_1        
		if(true) goto _L18; else goto _L17
	//  145  347:goto            317
_L17:
	//* 146  350:goto            377
		Exception exception;
		exception;
	//  147  353:astore          6
		break MISSING_BLOCK_LABEL_363;
	//  148  355:goto            363
		exception;
	//  149  358:astore          6
		flag = flag1;
	//  150  360:iload           4
	//  151  362:istore_3        
		com.baidu.android.pushservice.e.b.b("ServiceUtils", exception.getMessage(), a);
	//  152  363:ldc1            #130 <String "ServiceUtils">
	//  153  365:aload           6
	//  154  367:invokevirtual   #133 <Method String Exception.getMessage()>
	//  155  370:aload_0         
	//  156  371:getfield        #17  <Field Context a>
	//  157  374:invokestatic    #138 <Method void b.b(String, String, Context)>
_L4:
		StringBuilder stringbuilder = new StringBuilder();
	//  158  377:new             #140 <Class StringBuilder>
	//  159  380:dup             
	//  160  381:invokespecial   #142 <Method void StringBuilder()>
	//  161  384:astore          6
		stringbuilder.append("checkAndStartPushService, running is ");
	//  162  386:aload           6
	//  163  388:ldc1            #144 <String "checkAndStartPushService, running is ">
	//  164  390:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//  165  393:pop             
		stringbuilder.append(flag);
	//  166  394:aload           6
	//  167  396:iload_3         
	//  168  397:invokevirtual   #151 <Method StringBuilder StringBuilder.append(boolean)>
	//  169  400:pop             
		com.baidu.android.pushservice.e.b.a("ServiceUtils", stringbuilder.toString(), a.getApplicationContext());
	//  170  401:ldc1            #130 <String "ServiceUtils">
	//  171  403:aload           6
	//  172  405:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  173  408:aload_0         
	//  174  409:getfield        #17  <Field Context a>
	//  175  412:invokevirtual   #158 <Method Context Context.getApplicationContext()>
	//  176  415:invokestatic    #160 <Method void b.a(String, String, Context)>
		if(!flag)
	//* 177  418:iload_3         
	//* 178  419:ifne            436
			t.a(a, new Intent());
	//  179  422:aload_0         
	//  180  423:getfield        #17  <Field Context a>
	//  181  426:new             #162 <Class Intent>
	//  182  429:dup             
	//  183  430:invokespecial   #163 <Method void Intent()>
	//  184  433:invokestatic    #166 <Method void t.a(Context, Intent)>
		t.e(a);
	//  185  436:aload_0         
	//  186  437:getfield        #17  <Field Context a>
	//  187  440:invokestatic    #169 <Method void t.e(Context)>
		return;
	//  188  443:return          
_L6:
		flag = true;
	//  189  444:iconst_1        
	//  190  445:istore_3        
		if(true) goto _L4; else goto _L19
	//  191  446:goto            377
_L19:
		if(true) goto _L21; else goto _L20
_L20:
	}

	final Context a;
	final String b;

	t$1(String s, short word0, Context context, String s1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #17  <Field Context a>
		b = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #19  <Field String b>
		super(s, word0);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:iload_2         
	//    9   14:invokespecial   #22  <Method void c(String, short)>
	//   10   17:return          
	}
}
