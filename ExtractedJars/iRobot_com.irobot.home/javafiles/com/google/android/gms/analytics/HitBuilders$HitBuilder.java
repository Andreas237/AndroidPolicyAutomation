// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzdg;
import java.util.*;

// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders, zzd

public static class HitBuilders$HitBuilder
{

	private final HitBuilders$HitBuilder zza(String s, String s1)
	{
		if(s1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			map.put(((Object) (s)), ((Object) (s1)));
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Map map>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public HitBuilders$HitBuilder addImpression(Product product, String s)
	{
		if(product == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzco.zzab("product should be non-null");
	//    2    4:ldc1            #54  <String "product should be non-null">
	//    3    6:invokestatic    #60  <Method void zzco.zzab(String)>
			return this;
	//    4    9:aload_0         
	//    5   10:areturn         
		}
		String s1 = s;
	//    6   11:aload_2         
	//    7   12:astore_3        
		if(s == null)
	//*   8   13:aload_2         
	//*   9   14:ifnonnull       20
			s1 = "";
	//   10   17:ldc1            #62  <String "">
	//   11   19:astore_3        
		if(!zzru.containsKey(((Object) (s1))))
	//*  12   20:aload_0         
	//*  13   21:getfield        #32  <Field Map zzru>
	//*  14   24:aload_3         
	//*  15   25:invokeinterface #66  <Method boolean Map.containsKey(Object)>
	//*  16   30:ifne            51
			zzru.put(((Object) (s1)), ((Object) (new ArrayList())));
	//   17   33:aload_0         
	//   18   34:getfield        #32  <Field Map zzru>
	//   19   37:aload_3         
	//   20   38:new             #34  <Class ArrayList>
	//   21   41:dup             
	//   22   42:invokespecial   #35  <Method void ArrayList()>
	//   23   45:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   24   50:pop             
		((List)zzru.get(((Object) (s1)))).add(((Object) (product)));
	//   25   51:aload_0         
	//   26   52:getfield        #32  <Field Map zzru>
	//   27   55:aload_3         
	//   28   56:invokeinterface #70  <Method Object Map.get(Object)>
	//   29   61:checkcast       #72  <Class List>
	//   30   64:aload_1         
	//   31   65:invokeinterface #75  <Method boolean List.add(Object)>
	//   32   70:pop             
		return this;
	//   33   71:aload_0         
	//   34   72:areturn         
	}

	public HitBuilders$HitBuilder addProduct(Product product)
	{
		if(product == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzco.zzab("product should be non-null");
	//    2    4:ldc1            #54  <String "product should be non-null">
	//    3    6:invokestatic    #60  <Method void zzco.zzab(String)>
			return this;
	//    4    9:aload_0         
	//    5   10:areturn         
		} else
		{
			zzrw.add(((Object) (product)));
	//    6   11:aload_0         
	//    7   12:getfield        #39  <Field List zzrw>
	//    8   15:aload_1         
	//    9   16:invokeinterface #75  <Method boolean List.add(Object)>
	//   10   21:pop             
			return this;
	//   11   22:aload_0         
	//   12   23:areturn         
		}
	}

	public HitBuilders$HitBuilder addPromotion(Promotion promotion)
	{
		if(promotion == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzco.zzab("promotion should be non-null");
	//    2    4:ldc1            #83  <String "promotion should be non-null">
	//    3    6:invokestatic    #60  <Method void zzco.zzab(String)>
			return this;
	//    4    9:aload_0         
	//    5   10:areturn         
		} else
		{
			zzrv.add(((Object) (promotion)));
	//    6   11:aload_0         
	//    7   12:getfield        #37  <Field List zzrv>
	//    8   15:aload_1         
	//    9   16:invokeinterface #75  <Method boolean List.add(Object)>
	//   10   21:pop             
			return this;
	//   11   22:aload_0         
	//   12   23:areturn         
		}
	}

	public Map build()
	{
		HashMap hashmap = new HashMap(map);
	//    0    0:new             #27  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Map map>
	//    4    8:invokespecial   #89  <Method void HashMap(Map)>
	//    5   11:astore          4
		if(zzrt != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #91  <Field ProductAction zzrt>
	//*   8   17:ifnull          34
			((Map) (hashmap)).putAll(zzrt.build());
	//    9   20:aload           4
	//   10   22:aload_0         
	//   11   23:getfield        #91  <Field ProductAction zzrt>
	//   12   26:invokevirtual   #95  <Method Map ProductAction.build()>
	//   13   29:invokeinterface #98  <Method void Map.putAll(Map)>
		Iterator iterator = zzrv.iterator();
	//   14   34:aload_0         
	//   15   35:getfield        #37  <Field List zzrv>
	//   16   38:invokeinterface #102 <Method Iterator List.iterator()>
	//   17   43:astore_3        
		for(int i = 1; iterator.hasNext(); i++)
	//*  18   44:iconst_1        
	//*  19   45:istore_1        
	//*  20   46:aload_3         
	//*  21   47:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  22   52:ifeq            85
			((Map) (hashmap)).putAll(((Promotion)iterator.next()).zzn(zzd.zzj(i)));
	//   23   55:aload           4
	//   24   57:aload_3         
	//   25   58:invokeinterface #112 <Method Object Iterator.next()>
	//   26   63:checkcast       #114 <Class Promotion>
	//   27   66:iload_1         
	//   28   67:invokestatic    #120 <Method String zzd.zzj(int)>
	//   29   70:invokevirtual   #124 <Method Map Promotion.zzn(String)>
	//   30   73:invokeinterface #98  <Method void Map.putAll(Map)>

	//   31   78:iload_1         
	//   32   79:iconst_1        
	//   33   80:iadd            
	//   34   81:istore_1        
	//*  35   82:goto            46
		iterator = zzrw.iterator();
	//   36   85:aload_0         
	//   37   86:getfield        #39  <Field List zzrw>
	//   38   89:invokeinterface #102 <Method Iterator List.iterator()>
	//   39   94:astore_3        
		for(int j = 1; iterator.hasNext(); j++)
	//*  40   95:iconst_1        
	//*  41   96:istore_1        
	//*  42   97:aload_3         
	//*  43   98:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  44  103:ifeq            136
			((Map) (hashmap)).putAll(((Product)iterator.next()).zzn(zzd.zzh(j)));
	//   45  106:aload           4
	//   46  108:aload_3         
	//   47  109:invokeinterface #112 <Method Object Iterator.next()>
	//   48  114:checkcast       #126 <Class Product>
	//   49  117:iload_1         
	//   50  118:invokestatic    #129 <Method String zzd.zzh(int)>
	//   51  121:invokevirtual   #130 <Method Map Product.zzn(String)>
	//   52  124:invokeinterface #98  <Method void Map.putAll(Map)>

	//   53  129:iload_1         
	//   54  130:iconst_1        
	//   55  131:iadd            
	//   56  132:istore_1        
	//*  57  133:goto            97
		Iterator iterator1 = zzru.entrySet().iterator();
	//   58  136:aload_0         
	//   59  137:getfield        #32  <Field Map zzru>
	//   60  140:invokeinterface #134 <Method Set Map.entrySet()>
	//   61  145:invokeinterface #137 <Method Iterator Set.iterator()>
	//   62  150:astore          5
		for(int k = 1; iterator1.hasNext(); k++)
	//*  63  152:iconst_1        
	//*  64  153:istore_1        
	//*  65  154:aload           5
	//*  66  156:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  67  161:ifeq            369
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   68  164:aload           5
	//   69  166:invokeinterface #112 <Method Object Iterator.next()>
	//   70  171:checkcast       #139 <Class java.util.Map$Entry>
	//   71  174:astore          6
			Object obj = ((Object) ((List)entry.getValue()));
	//   72  176:aload           6
	//   73  178:invokeinterface #142 <Method Object java.util.Map$Entry.getValue()>
	//   74  183:checkcast       #72  <Class List>
	//   75  186:astore_3        
			String s = zzd.zzm(k);
	//   76  187:iload_1         
	//   77  188:invokestatic    #145 <Method String zzd.zzm(int)>
	//   78  191:astore          7
			Iterator iterator2 = ((List) (obj)).iterator();
	//   79  193:aload_3         
	//   80  194:invokeinterface #102 <Method Iterator List.iterator()>
	//   81  199:astore          8
			for(int l = 1; iterator2.hasNext(); l++)
	//*  82  201:iconst_1        
	//*  83  202:istore_2        
	//*  84  203:aload           8
	//*  85  205:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  86  210:ifeq            287
			{
				Product product = (Product)iterator2.next();
	//   87  213:aload           8
	//   88  215:invokeinterface #112 <Method Object Iterator.next()>
	//   89  220:checkcast       #126 <Class Product>
	//   90  223:astore          9
				obj = ((Object) (String.valueOf(((Object) (s)))));
	//   91  225:aload           7
	//   92  227:invokestatic    #151 <Method String String.valueOf(Object)>
	//   93  230:astore_3        
				String s1 = String.valueOf(((Object) (zzd.zzl(l))));
	//   94  231:iload_2         
	//   95  232:invokestatic    #154 <Method String zzd.zzl(int)>
	//   96  235:invokestatic    #151 <Method String String.valueOf(Object)>
	//   97  238:astore          10
				if(s1.length() != 0)
	//*  98  240:aload           10
	//*  99  242:invokevirtual   #158 <Method int String.length()>
	//* 100  245:ifeq            258
					obj = ((Object) (((String) (obj)).concat(s1)));
	//  101  248:aload_3         
	//  102  249:aload           10
	//  103  251:invokevirtual   #162 <Method String String.concat(String)>
	//  104  254:astore_3        
				else
	//* 105  255:goto            267
					obj = ((Object) (new String(((String) (obj)))));
	//  106  258:new             #147 <Class String>
	//  107  261:dup             
	//  108  262:aload_3         
	//  109  263:invokespecial   #164 <Method void String(String)>
	//  110  266:astore_3        
				((Map) (hashmap)).putAll(product.zzn(((String) (obj))));
	//  111  267:aload           4
	//  112  269:aload           9
	//  113  271:aload_3         
	//  114  272:invokevirtual   #130 <Method Map Product.zzn(String)>
	//  115  275:invokeinterface #98  <Method void Map.putAll(Map)>
			}

	//  116  280:iload_2         
	//  117  281:iconst_1        
	//  118  282:iadd            
	//  119  283:istore_2        
	//* 120  284:goto            203
			if(TextUtils.isEmpty((CharSequence)entry.getKey()))
				continue;
	//  121  287:aload           6
	//  122  289:invokeinterface #167 <Method Object java.util.Map$Entry.getKey()>
	//  123  294:checkcast       #169 <Class CharSequence>
	//  124  297:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  125  300:ifne            362
			obj = ((Object) (String.valueOf(((Object) (s)))));
	//  126  303:aload           7
	//  127  305:invokestatic    #151 <Method String String.valueOf(Object)>
	//  128  308:astore_3        
			s = String.valueOf("nm");
	//  129  309:ldc1            #177 <String "nm">
	//  130  311:invokestatic    #151 <Method String String.valueOf(Object)>
	//  131  314:astore          7
			if(s.length() != 0)
	//* 132  316:aload           7
	//* 133  318:invokevirtual   #158 <Method int String.length()>
	//* 134  321:ifeq            334
				obj = ((Object) (((String) (obj)).concat(s)));
	//  135  324:aload_3         
	//  136  325:aload           7
	//  137  327:invokevirtual   #162 <Method String String.concat(String)>
	//  138  330:astore_3        
			else
	//* 139  331:goto            343
				obj = ((Object) (new String(((String) (obj)))));
	//  140  334:new             #147 <Class String>
	//  141  337:dup             
	//  142  338:aload_3         
	//  143  339:invokespecial   #164 <Method void String(String)>
	//  144  342:astore_3        
			((Map) (hashmap)).put(obj, ((Object) ((String)entry.getKey())));
	//  145  343:aload           4
	//  146  345:aload_3         
	//  147  346:aload           6
	//  148  348:invokeinterface #167 <Method Object java.util.Map$Entry.getKey()>
	//  149  353:checkcast       #147 <Class String>
	//  150  356:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//  151  361:pop             
		}

	//  152  362:iload_1         
	//  153  363:iconst_1        
	//  154  364:iadd            
	//  155  365:istore_1        
	//* 156  366:goto            154
		return ((Map) (hashmap));
	//  157  369:aload           4
	//  158  371:areturn         
	}

	protected String get(String s)
	{
		return (String)map.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map map>
	//    2    4:aload_1         
	//    3    5:invokeinterface #70  <Method Object Map.get(Object)>
	//    4   10:checkcast       #147 <Class String>
	//    5   13:areturn         
	}

	public final HitBuilders$HitBuilder set(String s, String s1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
		{
			map.put(((Object) (s)), ((Object) (s1)));
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Map map>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//    7   15:pop             
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			zzco.zzab("HitBuilder.set() called with a null paramName.");
	//   10   18:ldc1            #182 <String "HitBuilder.set() called with a null paramName.">
	//   11   20:invokestatic    #60  <Method void zzco.zzab(String)>
			return this;
	//   12   23:aload_0         
	//   13   24:areturn         
		}
	}

	public final HitBuilders$HitBuilder setAll(Map map1)
	{
		if(map1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		} else
		{
			map.putAll(((Map) (new HashMap(map1))));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field Map map>
	//    6   10:new             #27  <Class HashMap>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #89  <Method void HashMap(Map)>
	//   10   18:invokeinterface #98  <Method void Map.putAll(Map)>
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		}
	}

	public HitBuilders$HitBuilder setCampaignParamsFromUrl(String s)
	{
		s = zzdg.zzag(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #192 <Method String zzdg.zzag(String)>
	//    2    4:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            14
		{
			return this;
	//    6   12:aload_0         
	//    7   13:areturn         
		} else
		{
			s = ((String) (zzdg.zzae(s)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #195 <Method Map zzdg.zzae(String)>
	//   10   18:astore_1        
			zza("&cc", (String)((Map) (s)).get("utm_content"));
	//   11   19:aload_0         
	//   12   20:ldc1            #197 <String "&cc">
	//   13   22:aload_1         
	//   14   23:ldc1            #199 <String "utm_content">
	//   15   25:invokeinterface #70  <Method Object Map.get(Object)>
	//   16   30:checkcast       #147 <Class String>
	//   17   33:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   18   36:pop             
			zza("&cm", (String)((Map) (s)).get("utm_medium"));
	//   19   37:aload_0         
	//   20   38:ldc1            #203 <String "&cm">
	//   21   40:aload_1         
	//   22   41:ldc1            #205 <String "utm_medium">
	//   23   43:invokeinterface #70  <Method Object Map.get(Object)>
	//   24   48:checkcast       #147 <Class String>
	//   25   51:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   26   54:pop             
			zza("&cn", (String)((Map) (s)).get("utm_campaign"));
	//   27   55:aload_0         
	//   28   56:ldc1            #207 <String "&cn">
	//   29   58:aload_1         
	//   30   59:ldc1            #209 <String "utm_campaign">
	//   31   61:invokeinterface #70  <Method Object Map.get(Object)>
	//   32   66:checkcast       #147 <Class String>
	//   33   69:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   34   72:pop             
			zza("&cs", (String)((Map) (s)).get("utm_source"));
	//   35   73:aload_0         
	//   36   74:ldc1            #211 <String "&cs">
	//   37   76:aload_1         
	//   38   77:ldc1            #213 <String "utm_source">
	//   39   79:invokeinterface #70  <Method Object Map.get(Object)>
	//   40   84:checkcast       #147 <Class String>
	//   41   87:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   42   90:pop             
			zza("&ck", (String)((Map) (s)).get("utm_term"));
	//   43   91:aload_0         
	//   44   92:ldc1            #215 <String "&ck">
	//   45   94:aload_1         
	//   46   95:ldc1            #217 <String "utm_term">
	//   47   97:invokeinterface #70  <Method Object Map.get(Object)>
	//   48  102:checkcast       #147 <Class String>
	//   49  105:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   50  108:pop             
			zza("&ci", (String)((Map) (s)).get("utm_id"));
	//   51  109:aload_0         
	//   52  110:ldc1            #219 <String "&ci">
	//   53  112:aload_1         
	//   54  113:ldc1            #221 <String "utm_id">
	//   55  115:invokeinterface #70  <Method Object Map.get(Object)>
	//   56  120:checkcast       #147 <Class String>
	//   57  123:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   58  126:pop             
			zza("&anid", (String)((Map) (s)).get("anid"));
	//   59  127:aload_0         
	//   60  128:ldc1            #223 <String "&anid">
	//   61  130:aload_1         
	//   62  131:ldc1            #225 <String "anid">
	//   63  133:invokeinterface #70  <Method Object Map.get(Object)>
	//   64  138:checkcast       #147 <Class String>
	//   65  141:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   66  144:pop             
			zza("&gclid", (String)((Map) (s)).get("gclid"));
	//   67  145:aload_0         
	//   68  146:ldc1            #227 <String "&gclid">
	//   69  148:aload_1         
	//   70  149:ldc1            #229 <String "gclid">
	//   71  151:invokeinterface #70  <Method Object Map.get(Object)>
	//   72  156:checkcast       #147 <Class String>
	//   73  159:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   74  162:pop             
			zza("&dclid", (String)((Map) (s)).get("dclid"));
	//   75  163:aload_0         
	//   76  164:ldc1            #231 <String "&dclid">
	//   77  166:aload_1         
	//   78  167:ldc1            #233 <String "dclid">
	//   79  169:invokeinterface #70  <Method Object Map.get(Object)>
	//   80  174:checkcast       #147 <Class String>
	//   81  177:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   82  180:pop             
			zza("&aclid", (String)((Map) (s)).get("aclid"));
	//   83  181:aload_0         
	//   84  182:ldc1            #235 <String "&aclid">
	//   85  184:aload_1         
	//   86  185:ldc1            #237 <String "aclid">
	//   87  187:invokeinterface #70  <Method Object Map.get(Object)>
	//   88  192:checkcast       #147 <Class String>
	//   89  195:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   90  198:pop             
			zza("&gmob_t", (String)((Map) (s)).get("gmob_t"));
	//   91  199:aload_0         
	//   92  200:ldc1            #239 <String "&gmob_t">
	//   93  202:aload_1         
	//   94  203:ldc1            #241 <String "gmob_t">
	//   95  205:invokeinterface #70  <Method Object Map.get(Object)>
	//   96  210:checkcast       #147 <Class String>
	//   97  213:invokespecial   #201 <Method HitBuilders$HitBuilder zza(String, String)>
	//   98  216:pop             
			return this;
	//   99  217:aload_0         
	//  100  218:areturn         
		}
	}

	public HitBuilders$HitBuilder setCustomDimension(int i, String s)
	{
		set(zzd.zzd(i), s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #247 <Method String zzd.zzd(int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public HitBuilders$HitBuilder setCustomMetric(int i, float f)
	{
		set(zzd.zzf(i), Float.toString(f));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #255 <Method String zzd.zzf(int)>
	//    3    5:fload_2         
	//    4    6:invokestatic    #261 <Method String Float.toString(float)>
	//    5    9:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
	//    6   12:pop             
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	protected HitBuilders$HitBuilder setHitType(String s)
	{
		set("&t", s);
	//    0    0:aload_0         
	//    1    1:ldc2            #265 <String "&t">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public HitBuilders$HitBuilder setNewSession()
	{
		set("&sc", "start");
	//    0    0:aload_0         
	//    1    1:ldc2            #269 <String "&sc">
	//    2    4:ldc2            #271 <String "start">
	//    3    7:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public HitBuilders$HitBuilder setNonInteraction(boolean flag)
	{
		set("&ni", zzdg.zzc(flag));
	//    0    0:aload_0         
	//    1    1:ldc2            #276 <String "&ni">
	//    2    4:iload_1         
	//    3    5:invokestatic    #280 <Method String zzdg.zzc(boolean)>
	//    4    8:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public HitBuilders$HitBuilder setProductAction(ProductAction productaction)
	{
		zzrt = productaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field ProductAction zzrt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public HitBuilders$HitBuilder setPromotionAction(String s)
	{
		map.put("&promoa", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map map>
	//    2    4:ldc2            #287 <String "&promoa">
	//    3    7:aload_1         
	//    4    8:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	private Map map;
	private ProductAction zzrt;
	private Map zzru;
	private List zzrv;
	private List zzrw;

	protected HitBuilders$HitBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		map = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void HashMap()>
	//    6   12:putfield        #30  <Field Map map>
		zzru = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #27  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void HashMap()>
	//   11   23:putfield        #32  <Field Map zzru>
		zzrv = ((List) (new ArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #34  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #35  <Method void ArrayList()>
	//   16   34:putfield        #37  <Field List zzrv>
		zzrw = ((List) (new ArrayList()));
	//   17   37:aload_0         
	//   18   38:new             #34  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #35  <Method void ArrayList()>
	//   21   45:putfield        #39  <Field List zzrw>
	//   22   48:return          
	}
}
