// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.ArrayList;

// Referenced classes of package com.appboy:
//			Appboy, AppboyUser

class Appboy$13
	implements Runnable
{

	public void run()
	{
		Object obj;
		try
		{
			if(StringUtils.isNullOrEmpty(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field String a>
	//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   3    7:ifeq            20
			{
				AppboyLogger.e(Appboy.b(), "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.");
	//    4   10:invokestatic    #37  <Method String Appboy.b()>
	//    5   13:ldc1            #39  <String "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.">
	//    6   15:invokestatic    #45  <Method int AppboyLogger.e(String, String)>
	//    7   18:pop             
				return;
	//    8   19:return          
			}
		}
	//*   9   20:aload_0         
	//*  10   21:getfield        #19  <Field Appboy b>
	//*  11   24:invokestatic    #49  <Method AppboyUser Appboy.g(Appboy)>
	//*  12   27:invokevirtual   #54  <Method String AppboyUser.getUserId()>
	//*  13   30:astore_1        
	//*  14   31:aload_1         
	//*  15   32:aload_0         
	//*  16   33:getfield        #21  <Field String a>
	//*  17   36:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*  18   39:ifeq            87
	//*  19   42:invokestatic    #37  <Method String Appboy.b()>
	//*  20   45:astore_1        
	//*  21   46:new             #62  <Class StringBuilder>
	//*  22   49:dup             
	//*  23   50:invokespecial   #63  <Method void StringBuilder()>
	//*  24   53:astore_2        
	//*  25   54:aload_2         
	//*  26   55:ldc1            #65  <String "Received request to change current user ">
	//*  27   57:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  28   60:pop             
	//*  29   61:aload_2         
	//*  30   62:aload_0         
	//*  31   63:getfield        #21  <Field String a>
	//*  32   66:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  33   69:pop             
	//*  34   70:aload_2         
	//*  35   71:ldc1            #71  <String " to the same user id. Doing nothing.">
	//*  36   73:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  37   76:pop             
	//*  38   77:aload_1         
	//*  39   78:aload_2         
	//*  40   79:invokevirtual   #74  <Method String StringBuilder.toString()>
	//*  41   82:invokestatic    #77  <Method int AppboyLogger.i(String, String)>
	//*  42   85:pop             
	//*  43   86:return          
	//*  44   87:aload_1         
	//*  45   88:ldc1            #79  <String "">
	//*  46   90:invokevirtual   #60  <Method boolean String.equals(Object)>
	//*  47   93:ifeq            164
	//*  48   96:invokestatic    #37  <Method String Appboy.b()>
	//*  49   99:astore_1        
	//*  50  100:new             #62  <Class StringBuilder>
	//*  51  103:dup             
	//*  52  104:invokespecial   #63  <Method void StringBuilder()>
	//*  53  107:astore_2        
	//*  54  108:aload_2         
	//*  55  109:ldc1            #81  <String "Changing anonymous user to ">
	//*  56  111:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  57  114:pop             
	//*  58  115:aload_2         
	//*  59  116:aload_0         
	//*  60  117:getfield        #21  <Field String a>
	//*  61  120:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  62  123:pop             
	//*  63  124:aload_1         
	//*  64  125:aload_2         
	//*  65  126:invokevirtual   #74  <Method String StringBuilder.toString()>
	//*  66  129:invokestatic    #77  <Method int AppboyLogger.i(String, String)>
	//*  67  132:pop             
	//*  68  133:aload_0         
	//*  69  134:getfield        #19  <Field Appboy b>
	//*  70  137:invokestatic    #84  <Method i Appboy.b(Appboy)>
	//*  71  140:aload_0         
	//*  72  141:getfield        #21  <Field String a>
	//*  73  144:invokevirtual   #88  <Method void i.b(String)>
	//*  74  147:aload_0         
	//*  75  148:getfield        #19  <Field Appboy b>
	//*  76  151:invokestatic    #49  <Method AppboyUser Appboy.g(Appboy)>
	//*  77  154:aload_0         
	//*  78  155:getfield        #21  <Field String a>
	//*  79  158:invokevirtual   #90  <Method void AppboyUser.a(String)>
	//*  80  161:goto            257
	//*  81  164:invokestatic    #37  <Method String Appboy.b()>
	//*  82  167:astore_2        
	//*  83  168:new             #62  <Class StringBuilder>
	//*  84  171:dup             
	//*  85  172:invokespecial   #63  <Method void StringBuilder()>
	//*  86  175:astore_3        
	//*  87  176:aload_3         
	//*  88  177:ldc1            #92  <String "Changing current user ">
	//*  89  179:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  90  182:pop             
	//*  91  183:aload_3         
	//*  92  184:aload_1         
	//*  93  185:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  94  188:pop             
	//*  95  189:aload_3         
	//*  96  190:ldc1            #94  <String " to new user ">
	//*  97  192:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  98  195:pop             
	//*  99  196:aload_3         
	//* 100  197:aload_0         
	//* 101  198:getfield        #21  <Field String a>
	//* 102  201:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 103  204:pop             
	//* 104  205:aload_3         
	//* 105  206:ldc1            #96  <String ".">
	//* 106  208:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 107  211:pop             
	//* 108  212:aload_2         
	//* 109  213:aload_3         
	//* 110  214:invokevirtual   #74  <Method String StringBuilder.toString()>
	//* 111  217:invokestatic    #77  <Method int AppboyLogger.i(String, String)>
	//* 112  220:pop             
	//* 113  221:new             #98  <Class FeedUpdatedEvent>
	//* 114  224:dup             
	//* 115  225:new             #100 <Class ArrayList>
	//* 116  228:dup             
	//* 117  229:invokespecial   #101 <Method void ArrayList()>
	//* 118  232:aload_0         
	//* 119  233:getfield        #21  <Field String a>
	//* 120  236:iconst_0        
	//* 121  237:invokestatic    #106 <Method long dl.a()>
	//* 122  240:invokespecial   #109 <Method void FeedUpdatedEvent(java.util.List, String, boolean, long)>
	//* 123  243:astore_1        
	//* 124  244:aload_0         
	//* 125  245:getfield        #19  <Field Appboy b>
	//* 126  248:invokestatic    #113 <Method z Appboy.c(Appboy)>
	//* 127  251:aload_1         
	//* 128  252:ldc1            #98  <Class FeedUpdatedEvent>
	//* 129  254:invokevirtual   #118 <Method void z.a(Object, Class)>
	//* 130  257:aload_0         
	//* 131  258:getfield        #19  <Field Appboy b>
	//* 132  261:getfield        #121 <Field bf Appboy.g>
	//* 133  264:invokevirtual   #125 <Method void bf.c()>
	//* 134  267:aload_0         
	//* 135  268:getfield        #19  <Field Appboy b>
	//* 136  271:invokestatic    #84  <Method i Appboy.b(Appboy)>
	//* 137  274:aload_0         
	//* 138  275:getfield        #21  <Field String a>
	//* 139  278:invokevirtual   #126 <Method void i.a(String)>
	//* 140  281:aload_0         
	//* 141  282:getfield        #19  <Field Appboy b>
	//* 142  285:getfield        #129 <Field ea Appboy.b>
	//* 143  288:astore_1        
	//* 144  289:new             #131 <Class ea>
	//* 145  292:dup             
	//* 146  293:aload_0         
	//* 147  294:getfield        #19  <Field Appboy b>
	//* 148  297:invokestatic    #134 <Method android.content.Context Appboy.a(Appboy)>
	//* 149  300:aload_0         
	//* 150  301:getfield        #19  <Field Appboy b>
	//* 151  304:invokestatic    #84  <Method i Appboy.b(Appboy)>
	//* 152  307:aload_0         
	//* 153  308:getfield        #19  <Field Appboy b>
	//* 154  311:getfield        #138 <Field com.appboy.configuration.AppboyConfigurationProvider Appboy.h>
	//* 155  314:aload_0         
	//* 156  315:getfield        #19  <Field Appboy b>
	//* 157  318:invokestatic    #113 <Method z Appboy.c(Appboy)>
	//* 158  321:aload_0         
	//* 159  322:getfield        #19  <Field Appboy b>
	//* 160  325:invokestatic    #142 <Method bo.app.ba Appboy.d(Appboy)>
	//* 161  328:aload_0         
	//* 162  329:getfield        #19  <Field Appboy b>
	//* 163  332:getfield        #145 <Field bo.app.bp com.appboy.Appboy.i>
	//* 164  335:invokestatic    #148 <Method boolean Appboy.c()>
	//* 165  338:invokestatic    #150 <Method boolean Appboy.d()>
	//* 166  341:aload_0         
	//* 167  342:getfield        #19  <Field Appboy b>
	//* 168  345:invokestatic    #153 <Method bo.app.br Appboy.e(Appboy)>
	//* 169  348:invokespecial   #156 <Method void ea(android.content.Context, i, com.appboy.configuration.AppboyConfigurationProvider, bo.app.aa, bo.app.ba, bo.app.bp, boolean, boolean, bo.app.br)>
	//* 170  351:astore_2        
	//* 171  352:aload_0         
	//* 172  353:getfield        #19  <Field Appboy b>
	//* 173  356:aload_2         
	//* 174  357:invokestatic    #159 <Method void Appboy.a(Appboy, ea)>
	//* 175  360:aload_0         
	//* 176  361:getfield        #19  <Field Appboy b>
	//* 177  364:getfield        #129 <Field ea Appboy.b>
	//* 178  367:invokevirtual   #162 <Method dj ea.g()>
	//* 179  370:invokevirtual   #166 <Method void dj.d()>
	//* 180  373:aload_0         
	//* 181  374:getfield        #19  <Field Appboy b>
	//* 182  377:getfield        #121 <Field bf Appboy.g>
	//* 183  380:invokevirtual   #169 <Method bo.app.by bf.a()>
	//* 184  383:pop             
	//* 185  384:aload_0         
	//* 186  385:getfield        #19  <Field Appboy b>
	//* 187  388:getfield        #121 <Field bf Appboy.g>
	//* 188  391:new             #171 <Class bo.app.cg$a>
	//* 189  394:dup             
	//* 190  395:invokespecial   #172 <Method void bo.app.cg$a()>
	//* 191  398:invokevirtual   #175 <Method bo.app.cg$a bo.app.cg$a.a()>
	//* 192  401:invokevirtual   #178 <Method void bf.a(bo.app.cg$a)>
	//* 193  404:aload_1         
	//* 194  405:invokevirtual   #181 <Method void ea.n()>
	//* 195  408:return          
		catch(Exception exception)
	//* 196  409:astore_1        
		{
			String s1 = Appboy.b();
	//  197  410:invokestatic    #37  <Method String Appboy.b()>
	//  198  413:astore_2        
			StringBuilder stringbuilder3 = new StringBuilder();
	//  199  414:new             #62  <Class StringBuilder>
	//  200  417:dup             
	//  201  418:invokespecial   #63  <Method void StringBuilder()>
	//  202  421:astore_3        
			stringbuilder3.append("Failed to set external id to: ");
	//  203  422:aload_3         
	//  204  423:ldc1            #183 <String "Failed to set external id to: ">
	//  205  425:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  206  428:pop             
			stringbuilder3.append(a);
	//  207  429:aload_3         
	//  208  430:aload_0         
	//  209  431:getfield        #21  <Field String a>
	//  210  434:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  211  437:pop             
			AppboyLogger.w(s1, stringbuilder3.toString(), ((Throwable) (exception)));
	//  212  438:aload_2         
	//  213  439:aload_3         
	//  214  440:invokevirtual   #74  <Method String StringBuilder.toString()>
	//  215  443:aload_1         
	//  216  444:invokestatic    #187 <Method int AppboyLogger.w(String, String, Throwable)>
	//  217  447:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//  218  448:aload_0         
	//  219  449:getfield        #19  <Field Appboy b>
	//  220  452:aload_1         
	//  221  453:invokestatic    #190 <Method void Appboy.a(Appboy, Throwable)>
			return;
	//  222  456:return          
		}
		obj = ((Object) (Appboy.g(b).getUserId()));
		if(((String) (obj)).equals(((Object) (a))))
		{
			obj = ((Object) (Appboy.b()));
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Received request to change current user ");
			stringbuilder.append(a);
			stringbuilder.append(" to the same user id. Doing nothing.");
			AppboyLogger.i(((String) (obj)), stringbuilder.toString());
			return;
		}
		if(((String) (obj)).equals(""))
		{
			obj = ((Object) (Appboy.b()));
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Changing anonymous user to ");
			stringbuilder1.append(a);
			AppboyLogger.i(((String) (obj)), stringbuilder1.toString());
			Appboy.b(b).b(a);
			Appboy.g(b).a(a);
			break MISSING_BLOCK_LABEL_257;
		}
		String s = Appboy.b();
		StringBuilder stringbuilder2 = new StringBuilder();
		stringbuilder2.append("Changing current user ");
		stringbuilder2.append(((String) (obj)));
		stringbuilder2.append(" to new user ");
		stringbuilder2.append(a);
		stringbuilder2.append(".");
		AppboyLogger.i(s, stringbuilder2.toString());
		obj = ((Object) (new FeedUpdatedEvent(((java.util.List) (new ArrayList())), a, false, dl.a())));
		Appboy.c(b).a(obj, com/appboy/events/FeedUpdatedEvent);
		b.g.c();
		Appboy.b(b).a(a);
		ea ea1 = b.b;
		ea ea2 = new ea(Appboy.a(b), Appboy.b(b), b.h, ((bo.app.aa) (Appboy.c(b))), Appboy.d(b), b.i, Appboy.c(), Appboy.d(), Appboy.e(b));
		Appboy.a(b, ea2);
		b.b.g().d();
		b.g.a();
		b.g.a((new bo.app.cg.a()).a());
		ea1.n();
		return;
	}

	final String a;
	final Appboy b;

	Appboy$13(Appboy appboy, String s)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Appboy b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
