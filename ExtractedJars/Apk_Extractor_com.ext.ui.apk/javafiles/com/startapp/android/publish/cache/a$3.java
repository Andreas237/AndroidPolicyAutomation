// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import android.content.Context;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.g;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.startapp.android.publish.cache:
//			a, d, ACMConfig

class a$3
	implements d
{

	public void a()
	{
		Object obj;
		MetaData.getInstance().removeMetaDataListener(((d) (this)));
	//    0    0:invokestatic    #31  <Method MetaData MetaData.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #35  <Method void MetaData.removeMetaDataListener(d)>
		obj = ((Object) (d.a().b().getAutoLoad()));
	//    3    7:invokestatic    #40  <Method com.startapp.android.publish.cache.d d.a()>
	//    4   10:invokevirtual   #43  <Method ACMConfig com.startapp.android.publish.cache.d.b()>
	//    5   13:invokevirtual   #49  <Method Set ACMConfig.getAutoLoad()>
	//    6   16:astore_2        
		if(obj == null) goto _L2; else goto _L1
	//    7   17:aload_2         
	//    8   18:ifnull          235
_L1:
		obj = ((Object) (b.a(((Set) (obj))).iterator()));
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field a b>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #52  <Method Set a.a(Set)>
	//   13   29:invokeinterface #58  <Method Iterator Set.iterator()>
	//   14   34:astore_2        
_L8:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
	//   15   35:aload_2         
	//   16   36:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   17   41:ifeq            235
_L3:
		int i;
		Object obj1;
		obj1 = ((Object) ((com.startapp.android.publish.adsCommon.tAppAd.AdMode)((Iterator) (obj)).next()));
	//   18   44:aload_2         
	//   19   45:invokeinterface #68  <Method Object Iterator.next()>
	//   20   50:checkcast       #70  <Class com.startapp.android.publish.adsCommon.StartAppAd$AdMode>
	//   21   53:astore_3        
		g.a("preCache", 3, (new StringBuilder()).append("preCacheAds load ").append(((com.startapp.android.publish.adsCommon.tAppAd.AdMode) (obj1)).name()).toString());
	//   22   54:ldc1            #72  <String "preCache">
	//   23   56:iconst_3        
	//   24   57:new             #74  <Class StringBuilder>
	//   25   60:dup             
	//   26   61:invokespecial   #75  <Method void StringBuilder()>
	//   27   64:ldc1            #77  <String "preCacheAds load ">
	//   28   66:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   29   69:aload_3         
	//   30   70:invokevirtual   #85  <Method String com.startapp.android.publish.adsCommon.StartAppAd$AdMode.name()>
	//   31   73:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   32   76:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   33   79:invokestatic    #93  <Method void g.a(String, int, String)>
		i = com.startapp.android.publish.adsCommon.b.a().b();
	//   34   82:invokestatic    #98  <Method b b.a()>
	//   35   85:invokevirtual   #101 <Method int b.b()>
	//   36   88:istore_1        
		if(obj1 != com.startapp.android.publish.adsCommon.tAppAd.AdMode.FULLPAGE) goto _L5; else goto _L4
	//   37   89:aload_3         
	//   38   90:getstatic       #105 <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.FULLPAGE>
	//   39   93:if_acmpne       170
_L4:
		if(i > 0)
	//*  40   96:iload_1         
	//*  41   97:ifle            124
			b.a(a, ((com.startapp.android.publish.adsCommon.StartAppAd) (null)), com.startapp.android.publish.adsCommon.tAppAd.AdMode.FULLPAGE, new AdPreferences(), ((com.startapp.android.publish.adsCommon.adListeners.AdEventListener) (null)));
	//   42  100:aload_0         
	//   43  101:getfield        #19  <Field a b>
	//   44  104:aload_0         
	//   45  105:getfield        #21  <Field Context a>
	//   46  108:aconst_null     
	//   47  109:getstatic       #105 <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.FULLPAGE>
	//   48  112:new             #107 <Class AdPreferences>
	//   49  115:dup             
	//   50  116:invokespecial   #108 <Method void AdPreferences()>
	//   51  119:aconst_null     
	//   52  120:invokevirtual   #111 <Method c a.a(Context, com.startapp.android.publish.adsCommon.StartAppAd, com.startapp.android.publish.adsCommon.StartAppAd$AdMode, AdPreferences, com.startapp.android.publish.adsCommon.adListeners.AdEventListener)>
	//   53  123:pop             
_L6:
		obj1 = ((Object) (b.a(((com.startapp.android.publish.adsCommon.tAppAd.AdMode) (obj1)))));
	//   54  124:aload_0         
	//   55  125:getfield        #19  <Field a b>
	//   56  128:aload_3         
	//   57  129:invokevirtual   #114 <Method String a.a(com.startapp.android.publish.adsCommon.StartAppAd$AdMode)>
	//   58  132:astore_3        
		if(obj1 != null)
	//*  59  133:aload_3         
	//*  60  134:ifnull          35
		{
			i = k.a(a, ((String) (obj1)), Integer.valueOf(0)).intValue();
	//   61  137:aload_0         
	//   62  138:getfield        #21  <Field Context a>
	//   63  141:aload_3         
	//   64  142:iconst_0        
	//   65  143:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   66  146:invokestatic    #125 <Method Integer k.a(Context, String, Integer)>
	//   67  149:invokevirtual   #128 <Method int Integer.intValue()>
	//   68  152:istore_1        
			k.b(a, ((String) (obj1)), Integer.valueOf(i + 1));
	//   69  153:aload_0         
	//   70  154:getfield        #21  <Field Context a>
	//   71  157:aload_3         
	//   72  158:iload_1         
	//   73  159:iconst_1        
	//   74  160:iadd            
	//   75  161:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   76  164:invokestatic    #131 <Method void k.b(Context, String, Integer)>
		}
		continue; /* Loop/switch isn't completed */
	//   77  167:goto            35
_L5:
		if(obj1 == com.startapp.android.publish.adsCommon.tAppAd.AdMode.OFFERWALL)
	//*  78  170:aload_3         
	//*  79  171:getstatic       #134 <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.OFFERWALL>
	//*  80  174:if_acmpne       210
		{
			if(i < 100)
	//*  81  177:iload_1         
	//*  82  178:bipush          100
	//*  83  180:icmpge          124
				b.a(a, ((com.startapp.android.publish.adsCommon.StartAppAd) (null)), com.startapp.android.publish.adsCommon.tAppAd.AdMode.OFFERWALL, new AdPreferences(), ((com.startapp.android.publish.adsCommon.adListeners.AdEventListener) (null)));
	//   84  183:aload_0         
	//   85  184:getfield        #19  <Field a b>
	//   86  187:aload_0         
	//   87  188:getfield        #21  <Field Context a>
	//   88  191:aconst_null     
	//   89  192:getstatic       #134 <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.OFFERWALL>
	//   90  195:new             #107 <Class AdPreferences>
	//   91  198:dup             
	//   92  199:invokespecial   #108 <Method void AdPreferences()>
	//   93  202:aconst_null     
	//   94  203:invokevirtual   #111 <Method c a.a(Context, com.startapp.android.publish.adsCommon.StartAppAd, com.startapp.android.publish.adsCommon.StartAppAd$AdMode, AdPreferences, com.startapp.android.publish.adsCommon.adListeners.AdEventListener)>
	//   95  206:pop             
		} else
	//*  96  207:goto            124
		{
			b.a(a, ((com.startapp.android.publish.adsCommon.StartAppAd) (null)), ((com.startapp.android.publish.adsCommon.tAppAd.AdMode) (obj1)), new AdPreferences(), ((com.startapp.android.publish.adsCommon.adListeners.AdEventListener) (null)));
	//   97  210:aload_0         
	//   98  211:getfield        #19  <Field a b>
	//   99  214:aload_0         
	//  100  215:getfield        #21  <Field Context a>
	//  101  218:aconst_null     
	//  102  219:aload_3         
	//  103  220:new             #107 <Class AdPreferences>
	//  104  223:dup             
	//  105  224:invokespecial   #108 <Method void AdPreferences()>
	//  106  227:aconst_null     
	//  107  228:invokevirtual   #111 <Method c a.a(Context, com.startapp.android.publish.adsCommon.StartAppAd, com.startapp.android.publish.adsCommon.StartAppAd$AdMode, AdPreferences, com.startapp.android.publish.adsCommon.adListeners.AdEventListener)>
	//  108  231:pop             
		}
		if(true) goto _L6; else goto _L2
	//  109  232:goto            124
_L2:
		return;
	//  110  235:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	public void b()
	{
		g.a("AdCacheManager", 3, "Failed loading metadata, unable to pre-cache.");
	//    0    0:ldc1            #136 <String "AdCacheManager">
	//    1    2:iconst_3        
	//    2    3:ldc1            #138 <String "Failed loading metadata, unable to pre-cache.">
	//    3    5:invokestatic    #93  <Method void g.a(String, int, String)>
		MetaData.getInstance().removeMetaDataListener(((d) (this)));
	//    4    8:invokestatic    #31  <Method MetaData MetaData.getInstance()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #35  <Method void MetaData.removeMetaDataListener(d)>
	//    7   15:return          
	}

	final Context a;
	final a b;

	a$3(a a1, Context context)
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
