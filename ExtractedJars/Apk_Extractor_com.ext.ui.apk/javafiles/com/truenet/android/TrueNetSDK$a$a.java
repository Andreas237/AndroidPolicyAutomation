// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.support.v7.ae;
import android.support.v7.af;
import android.support.v7.br;
import android.support.v7.g;
import android.support.v7.v;
import com.startapp.common.c.b;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK, LinksData, ValidationResults

static final class TrueNetSDK$a$a extends af
	implements v
{

	public Object a()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void b()>
		return ((Object) (br.a));
	//    2    4:getstatic       #46  <Field br br.a>
	//    3    7:areturn         
	}

	public final void b()
	{
		if($links.getBulkResponse())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field LinksData $links>
	//*   2    4:invokevirtual   #52  <Method boolean LinksData.getBulkResponse()>
	//*   3    7:ifeq            51
		{
			String s = com.startapp.common.c.b.a(((Object) (new ValidationResults(g.a((Iterable)$bulkQueue)))));
	//    4   10:new             #54  <Class ValidationResults>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
	//    8   18:checkcast       #56  <Class Iterable>
	//    9   21:invokestatic    #61  <Method java.util.List g.a(Iterable)>
	//   10   24:invokespecial   #64  <Method void ValidationResults(java.util.List)>
	//   11   27:invokestatic    #69  <Method String b.a(Object)>
	//   12   30:astore_1        
			java.net.URL url = TrueNetSDK.access$getResultUrl$cp();
	//   13   31:invokestatic    #73  <Method java.net.URL TrueNetSDK.access$getResultUrl$cp()>
	//   14   34:astore_2        
			ae.a(((Object) (s)), "json");
	//   15   35:aload_1         
	//   16   36:ldc1            #75  <String "json">
	//   17   38:invokestatic    #80  <Method void ae.a(Object, String)>
			com.truenet.android.a.g.b(url, s, $context);
	//   18   41:aload_2         
	//   19   42:aload_1         
	//   20   43:aload_0         
	//   21   44:getfield        #30  <Field Context $context>
	//   22   47:invokestatic    #85  <Method String com.truenet.android.a.g.b(java.net.URL, String, Context)>
	//   23   50:pop             
		}
		TrueNetSDK.a.a(TrueNetSDK.Companion, $context, $links.getSleep());
	//   24   51:getstatic       #89  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//   25   54:aload_0         
	//   26   55:getfield        #30  <Field Context $context>
	//   27   58:aload_0         
	//   28   59:getfield        #26  <Field LinksData $links>
	//   29   62:invokevirtual   #93  <Method long LinksData.getSleep()>
	//   30   65:invokestatic    #96  <Method void TrueNetSDK$a.a(TrueNetSDK$a, Context, long)>
		if($links.getSleep() != 0L)
	//*  31   68:aload_0         
	//*  32   69:getfield        #26  <Field LinksData $links>
	//*  33   72:invokevirtual   #93  <Method long LinksData.getSleep()>
	//*  34   75:lconst_0        
	//*  35   76:lcmp            
	//*  36   77:ifeq            90
			$finish.a();
	//   37   80:aload_0         
	//   38   81:getfield        #32  <Field v $finish>
	//   39   84:invokeinterface #98  <Method Object v.a()>
	//   40   89:pop             
	//   41   90:return          
	}

	final ConcurrentLinkedQueue $bulkQueue;
	final Context $context;
	final v $finish;
	final LinksData $links;

	TrueNetSDK$a$a(LinksData linksdata, ConcurrentLinkedQueue concurrentlinkedqueue, Context context, v v1)
	{
		$links = linksdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field LinksData $links>
		$bulkQueue = concurrentlinkedqueue;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field ConcurrentLinkedQueue $bulkQueue>
		$context = context;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field Context $context>
		$finish = v1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field v $finish>
		super(0);
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:invokespecial   #35  <Method void af(int)>
	//   15   26:return          
	}
}
