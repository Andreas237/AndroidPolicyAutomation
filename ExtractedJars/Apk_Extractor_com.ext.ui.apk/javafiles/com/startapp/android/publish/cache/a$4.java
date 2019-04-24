// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import android.content.Context;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.e;
import com.startapp.common.a.g;
import java.util.*;

// Referenced classes of package com.startapp.android.publish.cache:
//			a, i, c, g

class a$4
	implements Runnable
{

	public void run()
	{
		Iterator iterator;
		e.a(a, i.b());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context a>
	//    2    4:invokestatic    #33  <Method String i.b()>
	//    3    7:invokestatic    #38  <Method void e.a(Context, String)>
		e.a(a, i.c());
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Context a>
	//    6   14:invokestatic    #41  <Method String i.c()>
	//    7   17:invokestatic    #38  <Method void e.a(Context, String)>
		iterator = b.a.entrySet().iterator();
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field a b>
	//   10   24:getfield        #44  <Field Map a.a>
	//   11   27:invokeinterface #50  <Method Set Map.entrySet()>
	//   12   32:invokeinterface #56  <Method Iterator Set.iterator()>
	//   13   37:astore_3        
		Object obj = null;
	//   14   38:aconst_null     
	//   15   39:astore_1        
_L3:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   16   40:aload_3         
	//   17   41:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   18   46:ifeq            203
_L1:
		c c1;
		Object obj1;
		obj1 = ((Object) ((java.util.Entry)iterator.next()));
	//   19   49:aload_3         
	//   20   50:invokeinterface #66  <Method Object Iterator.next()>
	//   21   55:checkcast       #68  <Class java.util.Map$Entry>
	//   22   58:astore          4
		c1 = (c)((java.util.Entry) (obj1)).getKey();
	//   23   60:aload           4
	//   24   62:invokeinterface #71  <Method Object java.util.Map$Entry.getKey()>
	//   25   67:checkcast       #73  <Class c>
	//   26   70:astore_2        
		if(c1.a() != com.startapp.android.publish.common.model.eferences.Placement.INAPP_SPLASH)
			break MISSING_BLOCK_LABEL_86;
	//   27   71:aload_2         
	//   28   72:invokevirtual   #76  <Method com.startapp.android.publish.common.model.AdPreferences$Placement c.a()>
	//   29   75:getstatic       #82  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_SPLASH>
	//   30   78:if_acmpne       86
		obj = ((Object) (c1));
	//   31   81:aload_2         
	//   32   82:astore_1        
		  goto _L3
	//*  33   83:goto            40
		obj1 = ((Object) ((com.startapp.android.publish.cache.g)((java.util.Entry) (obj1)).getValue()));
	//   34   86:aload           4
	//   35   88:invokeinterface #85  <Method Object java.util.Map$Entry.getValue()>
	//   36   93:checkcast       #87  <Class com.startapp.android.publish.cache.g>
	//   37   96:astore          4
		g.a("AdCacheManager", 3, (new StringBuilder()).append("Saving to disk: ").append(c1.toString()).toString());
	//   38   98:ldc1            #89  <String "AdCacheManager">
	//   39  100:iconst_3        
	//   40  101:new             #91  <Class StringBuilder>
	//   41  104:dup             
	//   42  105:invokespecial   #92  <Method void StringBuilder()>
	//   43  108:ldc1            #94  <String "Saving to disk: ">
	//   44  110:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   45  113:aload_2         
	//   46  114:invokevirtual   #101 <Method String c.toString()>
	//   47  117:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   48  120:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   49  123:invokestatic    #107 <Method void g.a(String, int, String)>
		i.a(a, c1.a(), ((com.startapp.android.publish.cache.g) (obj1)).a(), b.c(c1), ((com.startapp.android.publish.cache.g) (obj1)).l());
	//   50  126:aload_0         
	//   51  127:getfield        #21  <Field Context a>
	//   52  130:aload_2         
	//   53  131:invokevirtual   #76  <Method com.startapp.android.publish.common.model.AdPreferences$Placement c.a()>
	//   54  134:aload           4
	//   55  136:invokevirtual   #110 <Method com.startapp.android.publish.common.model.AdPreferences g.a()>
	//   56  139:aload_0         
	//   57  140:getfield        #19  <Field a b>
	//   58  143:aload_2         
	//   59  144:invokevirtual   #113 <Method String a.c(c)>
	//   60  147:aload           4
	//   61  149:invokevirtual   #117 <Method int g.l()>
	//   62  152:invokestatic    #120 <Method void i.a(Context, com.startapp.android.publish.common.model.AdPreferences$Placement, com.startapp.android.publish.common.model.AdPreferences, String, int)>
		i.a(a, ((com.startapp.android.publish.cache.g) (obj1)), b.c(c1));
	//   63  155:aload_0         
	//   64  156:getfield        #21  <Field Context a>
	//   65  159:aload           4
	//   66  161:aload_0         
	//   67  162:getfield        #19  <Field a b>
	//   68  165:aload_2         
	//   69  166:invokevirtual   #113 <Method String a.c(c)>
	//   70  169:invokestatic    #123 <Method void i.a(Context, com.startapp.android.publish.cache.g, String)>
		  goto _L3
	//*  71  172:goto            40
		obj;
	//   72  175:astore_1        
		g.a("AdCacheManager", 3, "Saving to disk: exception caught");
	//   73  176:ldc1            #89  <String "AdCacheManager">
	//   74  178:iconst_3        
	//   75  179:ldc1            #125 <String "Saving to disk: exception caught">
	//   76  181:invokestatic    #107 <Method void g.a(String, int, String)>
		f.a(a, d.b, "AdCacheManager.saveToDisk - Unexpected Thread Exception", ((Exception) (obj)).getMessage(), "");
	//   77  184:aload_0         
	//   78  185:getfield        #21  <Field Context a>
	//   79  188:getstatic       #130 <Field d d.b>
	//   80  191:ldc1            #132 <String "AdCacheManager.saveToDisk - Unexpected Thread Exception">
	//   81  193:aload_1         
	//   82  194:invokevirtual   #135 <Method String Exception.getMessage()>
	//   83  197:ldc1            #137 <String "">
	//   84  199:invokestatic    #142 <Method void f.a(Context, d, String, String, String)>
_L5:
		return;
	//   85  202:return          
_L2:
		if(obj == null) goto _L5; else goto _L4
	//   86  203:aload_1         
	//   87  204:ifnull          202
_L4:
		b.a.remove(obj);
	//   88  207:aload_0         
	//   89  208:getfield        #19  <Field a b>
	//   90  211:getfield        #44  <Field Map a.a>
	//   91  214:aload_1         
	//   92  215:invokeinterface #146 <Method Object Map.remove(Object)>
	//   93  220:pop             
		return;
	//   94  221:return          
	}

	final Context a;
	final a b;

	a$4(a a1, Context context)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field a b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
