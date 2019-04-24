// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import com.autonavi.amap.mapcore.FileUtil;
import java.io.File;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, fd, af, hm

class b$d
	implements Runnable
{

	public boolean equals(Object obj)
	{
		return obj instanceof b$d;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class b$d>
	//    2    4:ireturn         
	}

	public void run()
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		flag3 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		flag4 = true;
	//    2    3:iconst_1        
	//    3    4:istore          5
		flag2 = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		flag = flag3;
	//    6    8:iload           4
	//    7   10:istore_1        
		flag1 = flag4;
	//    8   11:iload           5
	//    9   13:istore_2        
		Context context = b.getApplicationContext();
	//   10   14:aload_0         
	//   11   15:getfield        #24  <Field Context b>
	//   12   18:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//   13   21:astore          6
		flag = flag3;
	//   14   23:iload           4
	//   15   25:istore_1        
		flag1 = flag4;
	//   16   26:iload           5
	//   17   28:istore_2        
		Object obj1 = ((Object) (fd.c(context)));
	//   18   29:aload           6
	//   19   31:invokestatic    #43  <Method String fd.c(Context)>
	//   20   34:astore          8
		flag = flag3;
	//   21   36:iload           4
	//   22   38:istore_1        
		flag1 = flag4;
	//   23   39:iload           5
	//   24   41:istore_2        
		String s = fd.a(context);
	//   25   42:aload           6
	//   26   44:invokestatic    #45  <Method String fd.a(Context)>
	//   27   47:astore          7
		flag = flag3;
	//   28   49:iload           4
	//   29   51:istore_1        
		flag1 = flag4;
	//   30   52:iload           5
	//   31   54:istore_2        
		obj1 = ((Object) (new File(((String) (obj1)))));
	//   32   55:new             #47  <Class File>
	//   33   58:dup             
	//   34   59:aload           8
	//   35   61:invokespecial   #50  <Method void File(String)>
	//   36   64:astore          8
		flag = flag3;
	//   37   66:iload           4
	//   38   68:istore_1        
		flag1 = flag4;
	//   39   69:iload           5
	//   40   71:istore_2        
		if(!((File) (obj1)).exists()) goto _L2; else goto _L1
	//   41   72:aload           8
	//   42   74:invokevirtual   #54  <Method boolean File.exists()>
	//   43   77:ifeq            103
_L1:
		if(false) goto _L4; else goto _L3
	//   44   80:iconst_1        
	//   45   81:ifeq            305
_L3:
		flag = flag3;
	//   46   84:iload           4
	//   47   86:istore_1        
		flag1 = flag4;
	//   48   87:iload           5
	//   49   89:istore_2        
		if(!FileUtil.deleteFile(((File) (obj1)))) goto _L4; else goto _L5
	//   50   90:aload           8
	//   51   92:invokestatic    #60  <Method boolean FileUtil.deleteFile(File)>
	//   52   95:ifeq            305
_L5:
		flag = true;
	//   53   98:iconst_1        
	//   54   99:istore_1        
		  goto _L6
	//*  55  100:goto            307
_L2:
		if(!flag2) goto _L8; else goto _L7
	//   56  103:iload_3         
	//   57  104:ifeq            312
_L7:
		flag = flag2;
	//   58  107:iload_3         
	//   59  108:istore_1        
		flag1 = flag2;
	//   60  109:iload_3         
	//   61  110:istore_2        
		if(!FileUtil.deleteFile(new File(s))) goto _L8; else goto _L9
	//   62  111:new             #47  <Class File>
	//   63  114:dup             
	//   64  115:aload           7
	//   65  117:invokespecial   #50  <Method void File(String)>
	//   66  120:invokestatic    #60  <Method boolean FileUtil.deleteFile(File)>
	//   67  123:ifeq            312
_L9:
		flag1 = true;
	//   68  126:iconst_1        
	//   69  127:istore_2        
	//*  70  128:goto            131
_L10:
		if(!flag1)
			break MISSING_BLOCK_LABEL_317;
	//   71  131:iload_2         
	//   72  132:ifeq            317
		flag = flag1;
	//   73  135:iload_2         
	//   74  136:istore_1        
		if(!fd.e(context))
			break MISSING_BLOCK_LABEL_317;
	//   75  137:aload           6
	//   76  139:invokestatic    #64  <Method boolean fd.e(Context)>
	//   77  142:ifeq            317
		flag2 = true;
	//   78  145:iconst_1        
	//   79  146:istore_3        
	//*  80  147:goto            150
_L11:
		flag = flag2;
	//   81  150:iload_3         
	//   82  151:istore_1        
		flag1 = flag2;
	//   83  152:iload_3         
	//   84  153:istore_2        
		if(com.amap.api.mapcore.util.b.i(a) == null)
			break MISSING_BLOCK_LABEL_178;
	//   85  154:aload_0         
	//   86  155:getfield        #19  <Field b a>
	//   87  158:invokestatic    #68  <Method af b.i(b)>
	//   88  161:ifnull          178
		flag = flag2;
	//   89  164:iload_3         
	//   90  165:istore_1        
		flag1 = flag2;
	//   91  166:iload_3         
	//   92  167:istore_2        
		com.amap.api.mapcore.util.b.i(a).h();
	//   93  168:aload_0         
	//   94  169:getfield        #19  <Field b a>
	//   95  172:invokestatic    #68  <Method af b.i(b)>
	//   96  175:invokevirtual   #73  <Method void af.h()>
		try
		{
			if(a.f != null && c != null)
	//*  97  178:aload_0         
	//*  98  179:getfield        #19  <Field b a>
	//*  99  182:getfield        #77  <Field com.autonavi.ae.gmap.GLMapEngine b.f>
	//* 100  185:ifnull          205
	//* 101  188:aload_0         
	//* 102  189:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//* 103  192:ifnull          205
				c.onRemoveCacheFinish(flag2);
	//  104  195:aload_0         
	//  105  196:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//  106  199:iload_3         
	//  107  200:invokeinterface #83  <Method void com.amap.api.maps.AMap$OnCacheRemoveListener.onRemoveCacheFinish(boolean)>
			return;
	//  108  205:return          
		}
		catch(Throwable throwable)
	//* 109  206:astore          6
		{
			throwable.printStackTrace();
	//  110  208:aload           6
	//  111  210:invokevirtual   #86  <Method void Throwable.printStackTrace()>
		}
		return;
	//  112  213:return          
		Object obj;
		obj;
	//  113  214:astore          6
		flag1 = flag;
	//  114  216:iload_1         
	//  115  217:istore_2        
		hm.c(((Throwable) (obj)), "AMapDelegateImp", "RemoveCacheRunnable");
	//  116  218:aload           6
	//  117  220:ldc1            #88  <String "AMapDelegateImp">
	//  118  222:ldc1            #90  <String "RemoveCacheRunnable">
	//  119  224:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		try
		{
			if(a.f != null && c != null)
	//* 120  227:aload_0         
	//* 121  228:getfield        #19  <Field b a>
	//* 122  231:getfield        #77  <Field com.autonavi.ae.gmap.GLMapEngine b.f>
	//* 123  234:ifnull          254
	//* 124  237:aload_0         
	//* 125  238:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//* 126  241:ifnull          254
				c.onRemoveCacheFinish(false);
	//  127  244:aload_0         
	//  128  245:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//  129  248:iconst_0        
	//  130  249:invokeinterface #83  <Method void com.amap.api.maps.AMap$OnCacheRemoveListener.onRemoveCacheFinish(boolean)>
			return;
	//  131  254:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 132  255:astore          6
		{
			((Throwable) (obj)).printStackTrace();
	//  133  257:aload           6
	//  134  259:invokevirtual   #86  <Method void Throwable.printStackTrace()>
		}
		return;
	//  135  262:return          
		obj;
	//  136  263:astore          6
		try
		{
			if(a.f != null && c != null)
	//* 137  265:aload_0         
	//* 138  266:getfield        #19  <Field b a>
	//* 139  269:getfield        #77  <Field com.autonavi.ae.gmap.GLMapEngine b.f>
	//* 140  272:ifnull          292
	//* 141  275:aload_0         
	//* 142  276:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//* 143  279:ifnull          292
				c.onRemoveCacheFinish(flag1);
	//  144  282:aload_0         
	//  145  283:getfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//  146  286:iload_2         
	//  147  287:invokeinterface #83  <Method void com.amap.api.maps.AMap$OnCacheRemoveListener.onRemoveCacheFinish(boolean)>
		}
	//* 148  292:goto            302
		catch(Throwable throwable1)
	//* 149  295:astore          7
		{
			throwable1.printStackTrace();
	//  150  297:aload           7
	//  151  299:invokevirtual   #86  <Method void Throwable.printStackTrace()>
		}
		throw obj;
	//  152  302:aload           6
	//  153  304:athrow          
_L4:
		flag = false;
	//  154  305:iconst_0        
	//  155  306:istore_1        
_L6:
		flag2 = flag;
	//  156  307:iload_1         
	//  157  308:istore_3        
		  goto _L2
	//* 158  309:goto            103
_L8:
		flag1 = false;
	//  159  312:iconst_0        
	//  160  313:istore_2        
		  goto _L10
	//* 161  314:goto            131
		flag2 = false;
	//  162  317:iconst_0        
	//  163  318:istore_3        
		  goto _L11
	//* 164  319:goto            150
	}

	final b a;
	private Context b;
	private com.amap.api.maps..OnCacheRemoveListener c;

	public b$d(b b1, Context context, com.amap.api.maps..OnCacheRemoveListener oncacheremovelistener)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Context b>
		c = oncacheremovelistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field com.amap.api.maps.AMap$OnCacheRemoveListener c>
	//   11   19:return          
	}
}
