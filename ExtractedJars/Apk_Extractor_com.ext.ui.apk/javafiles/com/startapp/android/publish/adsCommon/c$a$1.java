// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.common.metaData.MetaData;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			c

class c$a$1
	implements Runnable
{

	public void run()
	{
		if(a.c) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field c$a a>
	//    2    4:getfield        #29  <Field boolean c$a.c>
	//    3    7:ifne            149
_L1:
		e e1;
		e1 = new e(d.h);
	//    4   10:new             #31  <Class e>
	//    5   13:dup             
	//    6   14:getstatic       #37  <Field d d.h>
	//    7   17:invokespecial   #40  <Method void e(d)>
	//    8   20:astore_1        
		e1.a(a.a());
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field c$a a>
	//   12   26:invokevirtual   #43  <Method org.json.JSONArray c$a.a()>
	//   13   29:invokevirtual   #46  <Method void e.a(org.json.JSONArray)>
		if(!a.l) goto _L4; else goto _L3
	//   14   32:aload_0         
	//   15   33:getfield        #19  <Field c$a a>
	//   16   36:getfield        #49  <Field boolean c$a.l>
	//   17   39:ifeq            150
_L3:
		e1.d("Page Finished");
	//   18   42:aload_1         
	//   19   43:ldc1            #51  <String "Page Finished">
	//   20   45:invokevirtual   #55  <Method void e.d(String)>
_L7:
		f.a(a.m, e1, a.b);
	//   21   48:aload_0         
	//   22   49:getfield        #19  <Field c$a a>
	//   23   52:getfield        #59  <Field android.content.Context c$a.m>
	//   24   55:aload_1         
	//   25   56:aload_0         
	//   26   57:getfield        #19  <Field c$a a>
	//   27   60:getfield        #62  <Field String c$a.b>
	//   28   63:invokestatic    #67  <Method void f.a(android.content.Context, e, String)>
_L8:
		a.k = true;
	//   29   66:aload_0         
	//   30   67:getfield        #19  <Field c$a a>
	//   31   70:iconst_1        
	//   32   71:putfield        #70  <Field boolean c$a.k>
		c.a(a.m);
	//   33   74:aload_0         
	//   34   75:getfield        #19  <Field c$a a>
	//   35   78:getfield        #59  <Field android.content.Context c$a.m>
	//   36   81:invokestatic    #73  <Method void c.a(android.content.Context)>
		if(!a.f || !MetaData.getInstance().isInAppBrowser()) goto _L6; else goto _L5
	//   37   84:aload_0         
	//   38   85:getfield        #19  <Field c$a a>
	//   39   88:getfield        #76  <Field boolean com.startapp.android.publish.adsCommon.c$a.f>
	//   40   91:ifeq            163
	//   41   94:invokestatic    #82  <Method MetaData MetaData.getInstance()>
	//   42   97:invokevirtual   #86  <Method boolean MetaData.isInAppBrowser()>
	//   43  100:ifeq            163
_L5:
		c.b(a.m, a.a, a.b);
	//   44  103:aload_0         
	//   45  104:getfield        #19  <Field c$a a>
	//   46  107:getfield        #59  <Field android.content.Context c$a.m>
	//   47  110:aload_0         
	//   48  111:getfield        #19  <Field c$a a>
	//   49  114:getfield        #88  <Field String c$a.a>
	//   50  117:aload_0         
	//   51  118:getfield        #19  <Field c$a a>
	//   52  121:getfield        #62  <Field String c$a.b>
	//   53  124:invokestatic    #91  <Method void c.b(android.content.Context, String, String)>
_L9:
		if(a.j != null)
	//*  54  127:aload_0         
	//*  55  128:getfield        #19  <Field c$a a>
	//*  56  131:getfield        #95  <Field Runnable c$a.j>
	//*  57  134:ifnull          149
			a.j.run();
	//   58  137:aload_0         
	//   59  138:getfield        #19  <Field c$a a>
	//   60  141:getfield        #95  <Field Runnable c$a.j>
	//   61  144:invokeinterface #97  <Method void Runnable.run()>
_L2:
		return;
	//   62  149:return          
_L4:
		e1.d("Timeout");
	//   63  150:aload_1         
	//   64  151:ldc1            #99  <String "Timeout">
	//   65  153:invokevirtual   #55  <Method void e.d(String)>
		  goto _L7
	//*  66  156:goto            48
		Exception exception;
		exception;
	//   67  159:astore_1        
		  goto _L8
	//*  68  160:goto            66
_L6:
		c.a(a.m, a.a, a.b);
	//   69  163:aload_0         
	//   70  164:getfield        #19  <Field c$a a>
	//   71  167:getfield        #59  <Field android.content.Context c$a.m>
	//   72  170:aload_0         
	//   73  171:getfield        #19  <Field c$a a>
	//   74  174:getfield        #88  <Field String c$a.a>
	//   75  177:aload_0         
	//   76  178:getfield        #19  <Field c$a a>
	//   77  181:getfield        #62  <Field String c$a.b>
	//   78  184:invokestatic    #101 <Method void c.a(android.content.Context, String, String)>
		  goto _L9
	//*  79  187:goto            127
		exception;
	//   80  190:astore_1        
		f.a(a.m, d.b, "AdsCommonUtils.startTimeout - error after time elapsed", exception.getMessage(), a.b);
	//   81  191:aload_0         
	//   82  192:getfield        #19  <Field c$a a>
	//   83  195:getfield        #59  <Field android.content.Context c$a.m>
	//   84  198:getstatic       #103 <Field d d.b>
	//   85  201:ldc1            #105 <String "AdsCommonUtils.startTimeout - error after time elapsed">
	//   86  203:aload_1         
	//   87  204:invokevirtual   #109 <Method String Exception.getMessage()>
	//   88  207:aload_0         
	//   89  208:getfield        #19  <Field c$a a>
	//   90  211:getfield        #62  <Field String c$a.b>
	//   91  214:invokestatic    #112 <Method void f.a(android.content.Context, d, String, String, String)>
		return;
	//   92  217:return          
		  goto _L7
	}

	final c.a a;

	c$a$1(c.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field c$a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
