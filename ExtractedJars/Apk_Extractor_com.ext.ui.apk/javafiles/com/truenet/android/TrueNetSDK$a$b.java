// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.support.v7.ae;
import android.support.v7.af;
import android.support.v7.br;
import android.support.v7.g;
import android.support.v7.w;
import com.startapp.common.c.b;
import com.truenet.android.a.a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK, b, RedirectsResult, LinksData, 
//			Link, ValidationResult, ValidationResults

static final class TrueNetSDK$a$b extends af
	implements w
{

	public Object a(Object obj, Object obj1)
	{
		a((com.truenet.android.b)obj, ((Number)obj1).intValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class com.truenet.android.b>
	//    3    5:aload_2         
	//    4    6:checkcast       #37  <Class Number>
	//    5    9:invokevirtual   #41  <Method int Number.intValue()>
	//    6   12:invokevirtual   #44  <Method void a(com.truenet.android.b, int)>
		return ((Object) (br.a));
	//    7   15:getstatic       #49  <Field br br.a>
	//    8   18:areturn         
	}

	public final void a(com.truenet.android.b b1, int i)
	{
		ae.b(((Object) (b1)), "info");
	//    0    0:aload_1         
	//    1    1:ldc1            #52  <String "info">
	//    2    3:invokestatic    #58  <Method void ae.b(Object, String)>
		Object obj = ((Object) ((Iterable)b1.d()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #62  <Method List b.d()>
	//    5   10:checkcast       #64  <Class Iterable>
	//    6   13:astore          6
		Object obj1 = ((Object) ((Collection)new ArrayList(g.a(((Iterable) (obj)), 10))));
	//    7   15:new             #66  <Class ArrayList>
	//    8   18:dup             
	//    9   19:aload           6
	//   10   21:bipush          10
	//   11   23:invokestatic    #71  <Method int g.a(Iterable, int)>
	//   12   26:invokespecial   #72  <Method void ArrayList(int)>
	//   13   29:checkcast       #74  <Class Collection>
	//   14   32:astore          7
		Object obj2 = ((Object) (((Iterable) (obj)).iterator()));
	//   15   34:aload           6
	//   16   36:invokeinterface #78  <Method Iterator Iterable.iterator()>
	//   17   41:astore          8
		while(((Iterator) (obj2)).hasNext()) 
	//*  18   43:aload           8
	//*  19   45:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//*  20   50:ifeq            135
		{
			obj = ((Object) ((b.b)((Iterator) (obj2)).next()));
	//   21   53:aload           8
	//   22   55:invokeinterface #88  <Method Object Iterator.next()>
	//   23   60:checkcast       #90  <Class b$b>
	//   24   63:astore          6
			RedirectsResult redirectsresult = JVM INSTR new #92  <Class RedirectsResult>;
	//   25   65:new             #92  <Class RedirectsResult>
	//   26   68:astore          9
			String s = ((b.b) (obj)).a();
	//   27   70:aload           6
	//   28   72:invokevirtual   #95  <Method String com.truenet.android.b$b.a()>
	//   29   75:astore          10
			long l = ((b.b) (obj)).b();
	//   30   77:aload           6
	//   31   79:invokevirtual   #98  <Method long com.truenet.android.b$b.b()>
	//   32   82:lstore          4
			int j = ((b.b) (obj)).c();
	//   33   84:aload           6
	//   34   86:invokevirtual   #101 <Method int b$b.c()>
	//   35   89:istore_3        
			obj = ((Object) (((b.b) (obj)).d()));
	//   36   90:aload           6
	//   37   92:invokevirtual   #102 <Method List b$b.d()>
	//   38   95:astore          6
			if(obj == null)
	//*  39   97:aload           6
	//*  40   99:ifnull          127
	//*  41  102:aload           9
	//*  42  104:aload           10
	//*  43  106:lload           4
	//*  44  108:iload_3         
	//*  45  109:aload           6
	//*  46  111:invokespecial   #105 <Method void RedirectsResult(String, long, int, List)>
	//*  47  114:aload           7
	//*  48  116:aload           9
	//*  49  118:invokeinterface #109 <Method boolean Collection.add(Object)>
	//*  50  123:pop             
	//*  51  124:goto            43
				obj = ((Object) (g.a()));
	//   52  127:invokestatic    #111 <Method List g.a()>
	//   53  130:astore          6
			redirectsresult.RedirectsResult(s, l, j, ((List) (obj)));
			((Collection) (obj1)).add(((Object) (redirectsresult)));
		}
	//*  54  132:goto            102
		List list = (List)obj1;
	//   55  135:aload           7
	//   56  137:checkcast       #113 <Class List>
	//   57  140:astore          9
		Link link = (Link)$links.getValidation().get(i);
	//   58  142:aload_0         
	//   59  143:getfield        #24  <Field LinksData $links>
	//   60  146:invokevirtual   #118 <Method List LinksData.getValidation()>
	//   61  149:iload_2         
	//   62  150:invokeinterface #122 <Method Object List.get(int)>
	//   63  155:checkcast       #124 <Class Link>
	//   64  158:astore          10
		obj = ((Object) (JVM INSTR new #126 <Class ValidationResult>));
	//   65  160:new             #126 <Class ValidationResult>
	//   66  163:astore          6
		String s1 = link.getInstanceId();
	//   67  165:aload           10
	//   68  167:invokevirtual   #129 <Method String Link.getInstanceId()>
	//   69  170:astore          11
		i = b1.b();
	//   70  172:aload_1         
	//   71  173:invokevirtual   #131 <Method int com.truenet.android.b.b()>
	//   72  176:istore_2        
		long l1 = b1.c();
	//   73  177:aload_1         
	//   74  178:invokevirtual   #133 <Method long b.c()>
	//   75  181:lstore          4
		String s2 = b1.e();
	//   76  183:aload_1         
	//   77  184:invokevirtual   #136 <Method String b.e()>
	//   78  187:astore          12
		obj1 = ((Object) (b1.f()));
	//   79  189:aload_1         
	//   80  190:invokevirtual   #139 <Method String b.f()>
	//   81  193:astore          7
		if(obj1 != null && com.truenet.android.a.g.a(new URL(link.getHtmlStorage()), ((String) (obj1)), $context))
	//*  82  195:aload           7
	//*  83  197:ifnull          317
	//*  84  200:new             #141 <Class URL>
	//*  85  203:dup             
	//*  86  204:aload           10
	//*  87  206:invokevirtual   #144 <Method String Link.getHtmlStorage()>
	//*  88  209:invokespecial   #147 <Method void URL(String)>
	//*  89  212:aload           7
	//*  90  214:aload_0         
	//*  91  215:getfield        #26  <Field Context $context>
	//*  92  218:invokestatic    #152 <Method boolean com.truenet.android.a.g.a(URL, String, Context)>
	//*  93  221:iconst_1        
	//*  94  222:icmpne          373
		{
			obj1 = ((Object) (link.getHtmlStorage()));
	//   95  225:aload           10
	//   96  227:invokevirtual   #144 <Method String Link.getHtmlStorage()>
	//   97  230:astore          7
			obj2 = obj;
	//   98  232:aload           6
	//   99  234:astore          8
		} else
	//* 100  236:aload_1         
	//* 101  237:invokevirtual   #155 <Method android.graphics.Bitmap com.truenet.android.b.a()>
	//* 102  240:astore_1        
	//* 103  241:aload_1         
	//* 104  242:ifnull          328
	//* 105  245:aload_1         
	//* 106  246:aload           10
	//* 107  248:invokevirtual   #158 <Method String Link.getImageStorage()>
	//* 108  251:invokestatic    #163 <Method boolean a.a(android.graphics.Bitmap, String)>
	//* 109  254:iconst_1        
	//* 110  255:icmpne          328
	//* 111  258:aload           10
	//* 112  260:invokevirtual   #158 <Method String Link.getImageStorage()>
	//* 113  263:astore_1        
	//* 114  264:aload           6
	//* 115  266:aload           11
	//* 116  268:iload_2         
	//* 117  269:lload           4
	//* 118  271:aload           9
	//* 119  273:aload           12
	//* 120  275:aload           7
	//* 121  277:aload_1         
	//* 122  278:getstatic       #167 <Field TrueNetSDK$a TrueNetSDK.Companion>
	//* 123  281:aload_0         
	//* 124  282:getfield        #26  <Field Context $context>
	//* 125  285:invokestatic    #170 <Method String com.truenet.android.TrueNetSDK$a.b(TrueNetSDK$a, Context)>
	//* 126  288:aload           10
	//* 127  290:invokevirtual   #173 <Method String Link.getMetaData()>
	//* 128  293:invokespecial   #176 <Method void ValidationResult(String, int, long, List, String, String, String, String, String)>
	//* 129  296:aload_0         
	//* 130  297:getfield        #24  <Field LinksData $links>
	//* 131  300:invokevirtual   #179 <Method boolean LinksData.getBulkResponse()>
	//* 132  303:ifeq            334
	//* 133  306:aload_0         
	//* 134  307:getfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
	//* 135  310:aload           8
	//* 136  312:invokevirtual   #182 <Method boolean ConcurrentLinkedQueue.add(Object)>
	//* 137  315:pop             
	//* 138  316:return          
		{
			obj2 = obj;
	//  139  317:aload           6
	//  140  319:astore          8
			obj1 = "";
	//  141  321:ldc1            #184 <String "">
	//  142  323:astore          7
		}
		b1 = ((com.truenet.android.b) (b1.a()));
		if(b1 != null && com.truenet.android.a.a.a(((android.graphics.Bitmap) (b1)), link.getImageStorage()))
			b1 = ((com.truenet.android.b) (link.getImageStorage()));
		else
	//* 143  325:goto            236
			b1 = "";
	//  144  328:ldc1            #184 <String "">
	//  145  330:astore_1        
		((ValidationResult) (obj)).ValidationResult(s1, i, l1, list, s2, ((String) (obj1)), ((String) (b1)), com.truenet.android.TrueNetSDK.a.b(TrueNetSDK.Companion, $context), link.getMetaData());
		if($links.getBulkResponse())
		{
			$bulkQueue.add(obj2);
			return;
		} else
	//* 146  331:goto            264
		{
			b1 = ((com.truenet.android.b) (com.startapp.common.c.b.a(((Object) (new ValidationResults(g.a(obj2)))))));
	//  147  334:new             #186 <Class ValidationResults>
	//  148  337:dup             
	//  149  338:aload           8
	//  150  340:invokestatic    #189 <Method List g.a(Object)>
	//  151  343:invokespecial   #192 <Method void ValidationResults(List)>
	//  152  346:invokestatic    #197 <Method String b.a(Object)>
	//  153  349:astore_1        
			URL url = TrueNetSDK.access$getResultUrl$cp();
	//  154  350:invokestatic    #201 <Method URL TrueNetSDK.access$getResultUrl$cp()>
	//  155  353:astore          6
			ae.a(((Object) (b1)), "json");
	//  156  355:aload_1         
	//  157  356:ldc1            #203 <String "json">
	//  158  358:invokestatic    #205 <Method void ae.a(Object, String)>
			com.truenet.android.a.g.b(url, ((String) (b1)), $context);
	//  159  361:aload           6
	//  160  363:aload_1         
	//  161  364:aload_0         
	//  162  365:getfield        #26  <Field Context $context>
	//  163  368:invokestatic    #208 <Method String com.truenet.android.a.g.b(URL, String, Context)>
	//  164  371:pop             
			return;
	//  165  372:return          
		}
	//* 166  373:goto            317
	}

	final ConcurrentLinkedQueue $bulkQueue;
	final Context $context;
	final LinksData $links;

	TrueNetSDK$a$b(LinksData linksdata, Context context, ConcurrentLinkedQueue concurrentlinkedqueue)
	{
		$links = linksdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field LinksData $links>
		$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Context $context>
		$bulkQueue = concurrentlinkedqueue;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
		super(2);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:invokespecial   #31  <Method void af(int)>
	//   12   20:return          
	}
}
