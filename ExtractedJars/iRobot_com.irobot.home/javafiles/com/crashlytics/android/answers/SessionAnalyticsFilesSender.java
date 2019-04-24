// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.s;
import b.a.a.a.a.d.f;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.i;
import b.a.a.a.l;
import java.io.File;
import java.util.Iterator;
import java.util.List;

class SessionAnalyticsFilesSender extends a
	implements f
{

	public SessionAnalyticsFilesSender(i j, String s1, String s2, e e, String s3)
	{
		super(j, s1, s2, e, c.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #22  <Field c c.POST>
	//    6    9:invokespecial   #25  <Method void a(i, String, String, e, c)>
		apiKey = s3;
	//    7   12:aload_0         
	//    8   13:aload           5
	//    9   15:putfield        #27  <Field String apiKey>
	//   10   18:return          
	}

	public boolean send(List list)
	{
		Object obj = ((Object) (getHttpRequest().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion()).a("X-CRASHLYTICS-API-KEY", apiKey)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method d getHttpRequest()>
	//    2    4:ldc1            #36  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    3    6:ldc1            #38  <String "android">
	//    4    8:invokevirtual   #44  <Method d d.a(String, String)>
	//    5   11:ldc1            #46  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//    6   13:aload_0         
	//    7   14:getfield        #50  <Field i kit>
	//    8   17:invokevirtual   #56  <Method String i.getVersion()>
	//    9   20:invokevirtual   #44  <Method d d.a(String, String)>
	//   10   23:ldc1            #58  <String "X-CRASHLYTICS-API-KEY">
	//   11   25:aload_0         
	//   12   26:getfield        #27  <Field String apiKey>
	//   13   29:invokevirtual   #44  <Method d d.a(String, String)>
	//   14   32:astore          4
		Object obj1 = ((Object) (list.iterator()));
	//   15   34:aload_1         
	//   16   35:invokeinterface #64  <Method Iterator List.iterator()>
	//   17   40:astore          5
		boolean flag = false;
	//   18   42:iconst_0        
	//   19   43:istore_3        
		for(int j = 0; ((Iterator) (obj1)).hasNext(); j++)
	//*  20   44:iconst_0        
	//*  21   45:istore_2        
	//*  22   46:aload           5
	//*  23   48:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  24   53:ifeq            119
		{
			File file = (File)((Iterator) (obj1)).next();
	//   25   56:aload           5
	//   26   58:invokeinterface #74  <Method Object Iterator.next()>
	//   27   63:checkcast       #76  <Class File>
	//   28   66:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   68:new             #78  <Class StringBuilder>
	//   30   71:dup             
	//   31   72:invokespecial   #81  <Method void StringBuilder()>
	//   32   75:astore          7
			stringbuilder1.append("session_analytics_file_");
	//   33   77:aload           7
	//   34   79:ldc1            #13  <String "session_analytics_file_">
	//   35   81:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   36   84:pop             
			stringbuilder1.append(j);
	//   37   85:aload           7
	//   38   87:iload_2         
	//   39   88:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   40   91:pop             
			((d) (obj)).a(stringbuilder1.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
	//   41   92:aload           4
	//   42   94:aload           7
	//   43   96:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   44   99:aload           6
	//   45  101:invokevirtual   #94  <Method String File.getName()>
	//   46  104:ldc1            #10  <String "application/vnd.crashlytics.android.events">
	//   47  106:aload           6
	//   48  108:invokevirtual   #97  <Method d d.a(String, String, String, File)>
	//   49  111:pop             
		}

	//   50  112:iload_2         
	//   51  113:iconst_1        
	//   52  114:iadd            
	//   53  115:istore_2        
	//*  54  116:goto            46
		obj1 = ((Object) (b.a.a.a.c.g()));
	//   55  119:invokestatic    #103 <Method l b.a.a.a.c.g()>
	//   56  122:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   57  124:new             #78  <Class StringBuilder>
	//   58  127:dup             
	//   59  128:invokespecial   #81  <Method void StringBuilder()>
	//   60  131:astore          6
		stringbuilder.append("Sending ");
	//   61  133:aload           6
	//   62  135:ldc1            #105 <String "Sending ">
	//   63  137:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   64  140:pop             
		stringbuilder.append(list.size());
	//   65  141:aload           6
	//   66  143:aload_1         
	//   67  144:invokeinterface #109 <Method int List.size()>
	//   68  149:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   69  152:pop             
		stringbuilder.append(" analytics files to ");
	//   70  153:aload           6
	//   71  155:ldc1            #111 <String " analytics files to ">
	//   72  157:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   73  160:pop             
		stringbuilder.append(getUrl());
	//   74  161:aload           6
	//   75  163:aload_0         
	//   76  164:invokevirtual   #114 <Method String getUrl()>
	//   77  167:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   78  170:pop             
		((l) (obj1)).a("Answers", stringbuilder.toString());
	//   79  171:aload           5
	//   80  173:ldc1            #116 <String "Answers">
	//   81  175:aload           6
	//   82  177:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   83  180:invokeinterface #121 <Method void l.a(String, String)>
		int k = ((d) (obj)).b();
	//   84  185:aload           4
	//   85  187:invokevirtual   #124 <Method int d.b()>
	//   86  190:istore_2        
		list = ((List) (b.a.a.a.c.g()));
	//   87  191:invokestatic    #103 <Method l b.a.a.a.c.g()>
	//   88  194:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   89  195:new             #78  <Class StringBuilder>
	//   90  198:dup             
	//   91  199:invokespecial   #81  <Method void StringBuilder()>
	//   92  202:astore          4
		((StringBuilder) (obj)).append("Response code for analytics file send is ");
	//   93  204:aload           4
	//   94  206:ldc1            #126 <String "Response code for analytics file send is ">
	//   95  208:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   96  211:pop             
		((StringBuilder) (obj)).append(k);
	//   97  212:aload           4
	//   98  214:iload_2         
	//   99  215:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//  100  218:pop             
		((l) (list)).a("Answers", ((StringBuilder) (obj)).toString());
	//  101  219:aload_1         
	//  102  220:ldc1            #116 <String "Answers">
	//  103  222:aload           4
	//  104  224:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  105  227:invokeinterface #121 <Method void l.a(String, String)>
		if(s.a(k) == 0)
	//* 106  232:iload_2         
	//* 107  233:invokestatic    #131 <Method int s.a(int)>
	//* 108  236:ifne            241
			flag = true;
	//  109  239:iconst_1        
	//  110  240:istore_3        
		return flag;
	//  111  241:iload_3         
	//  112  242:ireturn         
	}

	static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
	static final String FILE_PARAM_NAME = "session_analytics_file_";
	private final String apiKey;
}
