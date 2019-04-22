// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.*;

// Referenced classes of package com.google.android.gms.analytics:
//			zzd

public class HitBuilders
{
	public static class AppViewBuilder extends HitBuilder
	{

		public AppViewBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "screenview");
		//    2    4:aload_0         
		//    3    5:ldc1            #16  <String "&t">
		//    4    7:ldc1            #18  <String "screenview">
		//    5    9:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}
	}

	public static class EventBuilder extends HitBuilder
	{

		public EventBuilder setAction(String s)
		{
			((HitBuilder)this).set("&ea", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #33  <String "&ea">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public EventBuilder setCategory(String s)
		{
			((HitBuilder)this).set("&ec", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "&ec">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public EventBuilder setLabel(String s)
		{
			((HitBuilder)this).set("&el", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #38  <String "&el">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public EventBuilder setValue(long l)
		{
			((HitBuilder)this).set("&ev", Long.toString(l));
		//    0    0:aload_0         
		//    1    1:ldc1            #42  <String "&ev">
		//    2    3:lload_1         
		//    3    4:invokestatic    #48  <Method String Long.toString(long)>
		//    4    7:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public EventBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "event");
		//    2    4:aload_0         
		//    3    5:ldc1            #15  <String "&t">
		//    4    7:ldc1            #17  <String "event">
		//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}

		public EventBuilder(String s, String s1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void HitBuilders$EventBuilder()>
			setCategory(s);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #28  <Method HitBuilders$EventBuilder setCategory(String)>
		//    5    9:pop             
			setAction(s1);
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:invokevirtual   #31  <Method HitBuilders$EventBuilder setAction(String)>
		//    9   15:pop             
		//   10   16:return          
		}
	}

	public static class ExceptionBuilder extends HitBuilder
	{

		public ExceptionBuilder setDescription(String s)
		{
			((HitBuilder)this).set("&exd", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #26  <String "&exd">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public ExceptionBuilder setFatal(boolean flag)
		{
			((HitBuilder)this).set("&exf", zzdd.zzc(flag));
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "&exf">
		//    2    3:iload_1         
		//    3    4:invokestatic    #36  <Method String zzdd.zzc(boolean)>
		//    4    7:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public ExceptionBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "exception");
		//    2    4:aload_0         
		//    3    5:ldc1            #15  <String "&t">
		//    4    7:ldc1            #17  <String "exception">
		//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}
	}

	public static class HitBuilder
	{

		private final HitBuilder zza(String s, String s1)
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

		public HitBuilder addImpression(Product product, String s)
		{
			if(product == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       11
			{
				zzcl.zzab("product should be non-null");
		//    2    4:ldc1            #54  <String "product should be non-null">
		//    3    6:invokestatic    #60  <Method void zzcl.zzab(String)>
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
			if(!zzrj.containsKey(((Object) (s1))))
		//*  12   20:aload_0         
		//*  13   21:getfield        #32  <Field Map zzrj>
		//*  14   24:aload_3         
		//*  15   25:invokeinterface #66  <Method boolean Map.containsKey(Object)>
		//*  16   30:ifne            51
				zzrj.put(((Object) (s1)), ((Object) (new ArrayList())));
		//   17   33:aload_0         
		//   18   34:getfield        #32  <Field Map zzrj>
		//   19   37:aload_3         
		//   20   38:new             #34  <Class ArrayList>
		//   21   41:dup             
		//   22   42:invokespecial   #35  <Method void ArrayList()>
		//   23   45:invokeinterface #48  <Method Object Map.put(Object, Object)>
		//   24   50:pop             
			((List)zzrj.get(((Object) (s1)))).add(((Object) (product)));
		//   25   51:aload_0         
		//   26   52:getfield        #32  <Field Map zzrj>
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

		public HitBuilder addProduct(Product product)
		{
			if(product == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       11
			{
				zzcl.zzab("product should be non-null");
		//    2    4:ldc1            #54  <String "product should be non-null">
		//    3    6:invokestatic    #60  <Method void zzcl.zzab(String)>
				return this;
		//    4    9:aload_0         
		//    5   10:areturn         
			} else
			{
				zzrl.add(((Object) (product)));
		//    6   11:aload_0         
		//    7   12:getfield        #39  <Field List zzrl>
		//    8   15:aload_1         
		//    9   16:invokeinterface #75  <Method boolean List.add(Object)>
		//   10   21:pop             
				return this;
		//   11   22:aload_0         
		//   12   23:areturn         
			}
		}

		public HitBuilder addPromotion(Promotion promotion)
		{
			if(promotion == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       11
			{
				zzcl.zzab("promotion should be non-null");
		//    2    4:ldc1            #83  <String "promotion should be non-null">
		//    3    6:invokestatic    #60  <Method void zzcl.zzab(String)>
				return this;
		//    4    9:aload_0         
		//    5   10:areturn         
			} else
			{
				zzrk.add(((Object) (promotion)));
		//    6   11:aload_0         
		//    7   12:getfield        #37  <Field List zzrk>
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
			Object obj = ((Object) (zzri));
		//    6   13:aload_0         
		//    7   14:getfield        #91  <Field ProductAction zzri>
		//    8   17:astore_3        
			if(obj != null)
		//*   9   18:aload_3         
		//*  10   19:ifnull          33
				((Map) (hashmap)).putAll(((ProductAction) (obj)).build());
		//   11   22:aload           4
		//   12   24:aload_3         
		//   13   25:invokevirtual   #95  <Method Map ProductAction.build()>
		//   14   28:invokeinterface #98  <Method void Map.putAll(Map)>
			obj = ((Object) (zzrk.iterator()));
		//   15   33:aload_0         
		//   16   34:getfield        #37  <Field List zzrk>
		//   17   37:invokeinterface #102 <Method Iterator List.iterator()>
		//   18   42:astore_3        
			for(int i = 1; ((Iterator) (obj)).hasNext(); i++)
		//*  19   43:iconst_1        
		//*  20   44:istore_1        
		//*  21   45:aload_3         
		//*  22   46:invokeinterface #108 <Method boolean Iterator.hasNext()>
		//*  23   51:ifeq            84
				((Map) (hashmap)).putAll(((Promotion)((Iterator) (obj)).next()).zzn(zzd.zzh(i)));
		//   24   54:aload           4
		//   25   56:aload_3         
		//   26   57:invokeinterface #112 <Method Object Iterator.next()>
		//   27   62:checkcast       #114 <Class Promotion>
		//   28   65:iload_1         
		//   29   66:invokestatic    #120 <Method String zzd.zzh(int)>
		//   30   69:invokevirtual   #124 <Method Map Promotion.zzn(String)>
		//   31   72:invokeinterface #98  <Method void Map.putAll(Map)>

		//   32   77:iload_1         
		//   33   78:iconst_1        
		//   34   79:iadd            
		//   35   80:istore_1        
		//*  36   81:goto            45
			obj = ((Object) (zzrl.iterator()));
		//   37   84:aload_0         
		//   38   85:getfield        #39  <Field List zzrl>
		//   39   88:invokeinterface #102 <Method Iterator List.iterator()>
		//   40   93:astore_3        
			for(int j = 1; ((Iterator) (obj)).hasNext(); j++)
		//*  41   94:iconst_1        
		//*  42   95:istore_1        
		//*  43   96:aload_3         
		//*  44   97:invokeinterface #108 <Method boolean Iterator.hasNext()>
		//*  45  102:ifeq            135
				((Map) (hashmap)).putAll(((Product)((Iterator) (obj)).next()).zzn(zzd.zzf(j)));
		//   46  105:aload           4
		//   47  107:aload_3         
		//   48  108:invokeinterface #112 <Method Object Iterator.next()>
		//   49  113:checkcast       #126 <Class Product>
		//   50  116:iload_1         
		//   51  117:invokestatic    #129 <Method String zzd.zzf(int)>
		//   52  120:invokevirtual   #130 <Method Map Product.zzn(String)>
		//   53  123:invokeinterface #98  <Method void Map.putAll(Map)>

		//   54  128:iload_1         
		//   55  129:iconst_1        
		//   56  130:iadd            
		//   57  131:istore_1        
		//*  58  132:goto            96
			Iterator iterator = zzrj.entrySet().iterator();
		//   59  135:aload_0         
		//   60  136:getfield        #32  <Field Map zzrj>
		//   61  139:invokeinterface #134 <Method Set Map.entrySet()>
		//   62  144:invokeinterface #137 <Method Iterator Set.iterator()>
		//   63  149:astore          5
			for(int k = 1; iterator.hasNext(); k++)
		//*  64  151:iconst_1        
		//*  65  152:istore_1        
		//*  66  153:aload           5
		//*  67  155:invokeinterface #108 <Method boolean Iterator.hasNext()>
		//*  68  160:ifeq            368
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
		//   69  163:aload           5
		//   70  165:invokeinterface #112 <Method Object Iterator.next()>
		//   71  170:checkcast       #139 <Class java.util.Map$Entry>
		//   72  173:astore          6
				Object obj1 = ((Object) ((List)entry.getValue()));
		//   73  175:aload           6
		//   74  177:invokeinterface #142 <Method Object java.util.Map$Entry.getValue()>
		//   75  182:checkcast       #72  <Class List>
		//   76  185:astore_3        
				String s = zzd.zzk(k);
		//   77  186:iload_1         
		//   78  187:invokestatic    #145 <Method String zzd.zzk(int)>
		//   79  190:astore          7
				Iterator iterator1 = ((List) (obj1)).iterator();
		//   80  192:aload_3         
		//   81  193:invokeinterface #102 <Method Iterator List.iterator()>
		//   82  198:astore          8
				for(int l = 1; iterator1.hasNext(); l++)
		//*  83  200:iconst_1        
		//*  84  201:istore_2        
		//*  85  202:aload           8
		//*  86  204:invokeinterface #108 <Method boolean Iterator.hasNext()>
		//*  87  209:ifeq            286
				{
					Product product = (Product)iterator1.next();
		//   88  212:aload           8
		//   89  214:invokeinterface #112 <Method Object Iterator.next()>
		//   90  219:checkcast       #126 <Class Product>
		//   91  222:astore          9
					obj1 = ((Object) (String.valueOf(((Object) (s)))));
		//   92  224:aload           7
		//   93  226:invokestatic    #151 <Method String String.valueOf(Object)>
		//   94  229:astore_3        
					String s1 = String.valueOf(((Object) (zzd.zzj(l))));
		//   95  230:iload_2         
		//   96  231:invokestatic    #154 <Method String zzd.zzj(int)>
		//   97  234:invokestatic    #151 <Method String String.valueOf(Object)>
		//   98  237:astore          10
					if(s1.length() != 0)
		//*  99  239:aload           10
		//* 100  241:invokevirtual   #158 <Method int String.length()>
		//* 101  244:ifeq            257
						obj1 = ((Object) (((String) (obj1)).concat(s1)));
		//  102  247:aload_3         
		//  103  248:aload           10
		//  104  250:invokevirtual   #162 <Method String String.concat(String)>
		//  105  253:astore_3        
					else
		//* 106  254:goto            266
						obj1 = ((Object) (new String(((String) (obj1)))));
		//  107  257:new             #147 <Class String>
		//  108  260:dup             
		//  109  261:aload_3         
		//  110  262:invokespecial   #164 <Method void String(String)>
		//  111  265:astore_3        
					((Map) (hashmap)).putAll(product.zzn(((String) (obj1))));
		//  112  266:aload           4
		//  113  268:aload           9
		//  114  270:aload_3         
		//  115  271:invokevirtual   #130 <Method Map Product.zzn(String)>
		//  116  274:invokeinterface #98  <Method void Map.putAll(Map)>
				}

		//  117  279:iload_2         
		//  118  280:iconst_1        
		//  119  281:iadd            
		//  120  282:istore_2        
		//* 121  283:goto            202
				if(TextUtils.isEmpty((CharSequence)entry.getKey()))
					continue;
		//  122  286:aload           6
		//  123  288:invokeinterface #167 <Method Object java.util.Map$Entry.getKey()>
		//  124  293:checkcast       #169 <Class CharSequence>
		//  125  296:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
		//  126  299:ifne            361
				obj1 = ((Object) (String.valueOf(((Object) (s)))));
		//  127  302:aload           7
		//  128  304:invokestatic    #151 <Method String String.valueOf(Object)>
		//  129  307:astore_3        
				s = String.valueOf("nm");
		//  130  308:ldc1            #177 <String "nm">
		//  131  310:invokestatic    #151 <Method String String.valueOf(Object)>
		//  132  313:astore          7
				if(s.length() != 0)
		//* 133  315:aload           7
		//* 134  317:invokevirtual   #158 <Method int String.length()>
		//* 135  320:ifeq            333
					obj1 = ((Object) (((String) (obj1)).concat(s)));
		//  136  323:aload_3         
		//  137  324:aload           7
		//  138  326:invokevirtual   #162 <Method String String.concat(String)>
		//  139  329:astore_3        
				else
		//* 140  330:goto            342
					obj1 = ((Object) (new String(((String) (obj1)))));
		//  141  333:new             #147 <Class String>
		//  142  336:dup             
		//  143  337:aload_3         
		//  144  338:invokespecial   #164 <Method void String(String)>
		//  145  341:astore_3        
				((Map) (hashmap)).put(obj1, ((Object) ((String)entry.getKey())));
		//  146  342:aload           4
		//  147  344:aload_3         
		//  148  345:aload           6
		//  149  347:invokeinterface #167 <Method Object java.util.Map$Entry.getKey()>
		//  150  352:checkcast       #147 <Class String>
		//  151  355:invokeinterface #48  <Method Object Map.put(Object, Object)>
		//  152  360:pop             
			}

		//  153  361:iload_1         
		//  154  362:iconst_1        
		//  155  363:iadd            
		//  156  364:istore_1        
		//* 157  365:goto            153
			return ((Map) (hashmap));
		//  158  368:aload           4
		//  159  370:areturn         
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

		public final HitBuilder set(String s, String s1)
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
				zzcl.zzab("HitBuilder.set() called with a null paramName.");
		//   10   18:ldc1            #182 <String "HitBuilder.set() called with a null paramName.">
		//   11   20:invokestatic    #60  <Method void zzcl.zzab(String)>
				return this;
		//   12   23:aload_0         
		//   13   24:areturn         
			}
		}

		public final HitBuilder setAll(Map map1)
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

		public HitBuilder setCampaignParamsFromUrl(String s)
		{
			s = zzdd.zzag(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #192 <Method String zzdd.zzag(String)>
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
				s = ((String) (zzdd.zzae(s)));
		//    8   14:aload_1         
		//    9   15:invokestatic    #195 <Method Map zzdd.zzae(String)>
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

		public HitBuilder setCustomDimension(int i, String s)
		{
			set(zzd.zzb(i), s);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #247 <Method String zzd.zzb(int)>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
		//    5    9:pop             
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public HitBuilder setCustomMetric(int i, float f)
		{
			set(zzd.zzd(i), Float.toString(f));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #255 <Method String zzd.zzd(int)>
		//    3    5:fload_2         
		//    4    6:invokestatic    #261 <Method String Float.toString(float)>
		//    5    9:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
		//    6   12:pop             
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		protected HitBuilder setHitType(String s)
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

		public HitBuilder setNewSession()
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

		public HitBuilder setNonInteraction(boolean flag)
		{
			set("&ni", zzdd.zzc(flag));
		//    0    0:aload_0         
		//    1    1:ldc2            #276 <String "&ni">
		//    2    4:iload_1         
		//    3    5:invokestatic    #280 <Method String zzdd.zzc(boolean)>
		//    4    8:invokevirtual   #249 <Method HitBuilders$HitBuilder set(String, String)>
		//    5   11:pop             
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public HitBuilder setProductAction(ProductAction productaction)
		{
			zzri = productaction;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #91  <Field ProductAction zzri>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public HitBuilder setPromotionAction(String s)
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
		private ProductAction zzri;
		private Map zzrj;
		private List zzrk;
		private List zzrl;

		protected HitBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			map = ((Map) (new HashMap()));
		//    2    4:aload_0         
		//    3    5:new             #27  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void HashMap()>
		//    6   12:putfield        #30  <Field Map map>
			zzrj = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #27  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #28  <Method void HashMap()>
		//   11   23:putfield        #32  <Field Map zzrj>
			zzrk = ((List) (new ArrayList()));
		//   12   26:aload_0         
		//   13   27:new             #34  <Class ArrayList>
		//   14   30:dup             
		//   15   31:invokespecial   #35  <Method void ArrayList()>
		//   16   34:putfield        #37  <Field List zzrk>
			zzrl = ((List) (new ArrayList()));
		//   17   37:aload_0         
		//   18   38:new             #34  <Class ArrayList>
		//   19   41:dup             
		//   20   42:invokespecial   #35  <Method void ArrayList()>
		//   21   45:putfield        #39  <Field List zzrl>
		//   22   48:return          
		}
	}

	public static class ItemBuilder extends HitBuilder
	{

		public ItemBuilder setCategory(String s)
		{
			((HitBuilder)this).set("&iv", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "&iv">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public ItemBuilder setCurrencyCode(String s)
		{
			((HitBuilder)this).set("&cu", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "&cu">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public ItemBuilder setName(String s)
		{
			((HitBuilder)this).set("&in", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #33  <String "&in">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public ItemBuilder setPrice(double d)
		{
			((HitBuilder)this).set("&ip", Double.toString(d));
		//    0    0:aload_0         
		//    1    1:ldc1            #37  <String "&ip">
		//    2    3:dload_1         
		//    3    4:invokestatic    #43  <Method String Double.toString(double)>
		//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public ItemBuilder setQuantity(long l)
		{
			((HitBuilder)this).set("&iq", Long.toString(l));
		//    0    0:aload_0         
		//    1    1:ldc1            #47  <String "&iq">
		//    2    3:lload_1         
		//    3    4:invokestatic    #52  <Method String Long.toString(long)>
		//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public ItemBuilder setSku(String s)
		{
			((HitBuilder)this).set("&ic", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #55  <String "&ic">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public ItemBuilder setTransactionId(String s)
		{
			((HitBuilder)this).set("&ti", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #58  <String "&ti">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public ItemBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "item");
		//    2    4:aload_0         
		//    3    5:ldc1            #16  <String "&t">
		//    4    7:ldc1            #18  <String "item">
		//    5    9:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}
	}

	public static class ScreenViewBuilder extends HitBuilder
	{

		public ScreenViewBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "screenview");
		//    2    4:aload_0         
		//    3    5:ldc1            #15  <String "&t">
		//    4    7:ldc1            #17  <String "screenview">
		//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}
	}

	public static class SocialBuilder extends HitBuilder
	{

		public SocialBuilder setAction(String s)
		{
			((HitBuilder)this).set("&sa", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #26  <String "&sa">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public SocialBuilder setNetwork(String s)
		{
			((HitBuilder)this).set("&sn", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <String "&sn">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public SocialBuilder setTarget(String s)
		{
			((HitBuilder)this).set("&st", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #32  <String "&st">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public SocialBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "social");
		//    2    4:aload_0         
		//    3    5:ldc1            #15  <String "&t">
		//    4    7:ldc1            #17  <String "social">
		//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}
	}

	public static class TimingBuilder extends HitBuilder
	{

		public TimingBuilder setCategory(String s)
		{
			((HitBuilder)this).set("&utc", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #37  <String "&utc">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public TimingBuilder setLabel(String s)
		{
			((HitBuilder)this).set("&utl", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #40  <String "&utl">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public TimingBuilder setValue(long l)
		{
			((HitBuilder)this).set("&utt", Long.toString(l));
		//    0    0:aload_0         
		//    1    1:ldc1            #42  <String "&utt">
		//    2    3:lload_1         
		//    3    4:invokestatic    #48  <Method String Long.toString(long)>
		//    4    7:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public TimingBuilder setVariable(String s)
		{
			((HitBuilder)this).set("&utv", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #50  <String "&utv">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public TimingBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "timing");
		//    2    4:aload_0         
		//    3    5:ldc1            #15  <String "&t">
		//    4    7:ldc1            #17  <String "timing">
		//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}

		public TimingBuilder(String s, String s1, long l)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void HitBuilders$TimingBuilder()>
			setVariable(s1);
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #28  <Method HitBuilders$TimingBuilder setVariable(String)>
		//    5    9:pop             
			setValue(l);
		//    6   10:aload_0         
		//    7   11:lload_3         
		//    8   12:invokevirtual   #32  <Method HitBuilders$TimingBuilder setValue(long)>
		//    9   15:pop             
			setCategory(s);
		//   10   16:aload_0         
		//   11   17:aload_1         
		//   12   18:invokevirtual   #35  <Method HitBuilders$TimingBuilder setCategory(String)>
		//   13   21:pop             
		//   14   22:return          
		}
	}

	public static class TransactionBuilder extends HitBuilder
	{

		public TransactionBuilder setAffiliation(String s)
		{
			((HitBuilder)this).set("&ta", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "&ta">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public TransactionBuilder setCurrencyCode(String s)
		{
			((HitBuilder)this).set("&cu", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "&cu">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public TransactionBuilder setRevenue(double d)
		{
			((HitBuilder)this).set("&tr", Double.toString(d));
		//    0    0:aload_0         
		//    1    1:ldc1            #34  <String "&tr">
		//    2    3:dload_1         
		//    3    4:invokestatic    #40  <Method String Double.toString(double)>
		//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public TransactionBuilder setShipping(double d)
		{
			((HitBuilder)this).set("&ts", Double.toString(d));
		//    0    0:aload_0         
		//    1    1:ldc1            #43  <String "&ts">
		//    2    3:dload_1         
		//    3    4:invokestatic    #40  <Method String Double.toString(double)>
		//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public TransactionBuilder setTax(double d)
		{
			((HitBuilder)this).set("&tt", Double.toString(d));
		//    0    0:aload_0         
		//    1    1:ldc1            #46  <String "&tt">
		//    2    3:dload_1         
		//    3    4:invokestatic    #40  <Method String Double.toString(double)>
		//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public TransactionBuilder setTransactionId(String s)
		{
			((HitBuilder)this).set("&ti", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #49  <String "&ti">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public TransactionBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void HitBuilders$HitBuilder()>
			((HitBuilder)this).set("&t", "transaction");
		//    2    4:aload_0         
		//    3    5:ldc1            #16  <String "&t">
		//    4    7:ldc1            #18  <String "transaction">
		//    5    9:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
		//    6   12:pop             
		//    7   13:return          
		}
	}


	public HitBuilders()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}
}
