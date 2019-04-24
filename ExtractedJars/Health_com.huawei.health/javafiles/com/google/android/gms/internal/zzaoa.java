// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.*;

public class zzaoa
{
	public static class zza
	{

		public boolean zzg(double d)
		{
			return d >= zzaUA && d <= zzaUB;
		//    0    0:dload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #17  <Field double zzaUA>
		//    3    5:dcmpl           
		//    4    6:iflt            20
		//    5    9:dload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #19  <Field double zzaUB>
		//    8   14:dcmpg           
		//    9   15:ifgt            20
		//   10   18:iconst_1        
		//   11   19:ireturn         
		//   12   20:iconst_0        
		//   13   21:ireturn         
		}

		private final double zzaUA;
		private final double zzaUB;

		private zza(double d, double d1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zzaUA = d;
		//    2    4:aload_0         
		//    3    5:dload_1         
		//    4    6:putfield        #17  <Field double zzaUA>
			zzaUB = d1;
		//    5    9:aload_0         
		//    6   10:dload_3         
		//    7   11:putfield        #19  <Field double zzaUB>
		//    8   14:return          
		}

		zza(double d, double d1, _cls1 _pcls1)
		{
			this(d, d1);
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:dload_3         
		//    3    3:invokespecial   #23  <Method void zzaoa$zza(double, double)>
		//    4    6:return          
		}
	}


	private zzaoa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		HashMap hashmap = new HashMap();
	//    2    4:new             #69  <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #70  <Method void HashMap()>
	//    5   11:astore_1        
		((Map) (hashmap)).put("latitude", ((Object) (new zza(-90D, 90D))));
	//    6   12:aload_1         
	//    7   13:ldc1            #72  <String "latitude">
	//    8   15:new             #8   <Class zzaoa$zza>
	//    9   18:dup             
	//   10   19:ldc2w           #73  <Double -90D>
	//   11   22:ldc2w           #75  <Double 90D>
	//   12   25:aconst_null     
	//   13   26:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   14   29:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   15   34:pop             
		((Map) (hashmap)).put("longitude", ((Object) (new zza(-180D, 180D))));
	//   16   35:aload_1         
	//   17   36:ldc1            #87  <String "longitude">
	//   18   38:new             #8   <Class zzaoa$zza>
	//   19   41:dup             
	//   20   42:ldc2w           #88  <Double -180D>
	//   21   45:ldc2w           #90  <Double 180D>
	//   22   48:aconst_null     
	//   23   49:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   24   52:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   25   57:pop             
		((Map) (hashmap)).put("accuracy", ((Object) (new zza(0.0D, 10000D))));
	//   26   58:aload_1         
	//   27   59:ldc1            #93  <String "accuracy">
	//   28   61:new             #8   <Class zzaoa$zza>
	//   29   64:dup             
	//   30   65:dconst_0        
	//   31   66:ldc2w           #94  <Double 10000D>
	//   32   69:aconst_null     
	//   33   70:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   34   73:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   35   78:pop             
		((Map) (hashmap)).put("bpm", ((Object) (new zza(0.0D, 1000D))));
	//   36   79:aload_1         
	//   37   80:ldc1            #97  <String "bpm">
	//   38   82:new             #8   <Class zzaoa$zza>
	//   39   85:dup             
	//   40   86:dconst_0        
	//   41   87:ldc2w           #98  <Double 1000D>
	//   42   90:aconst_null     
	//   43   91:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   44   94:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   45   99:pop             
		((Map) (hashmap)).put("altitude", ((Object) (new zza(-100000D, 100000D))));
	//   46  100:aload_1         
	//   47  101:ldc1            #27  <String "altitude">
	//   48  103:new             #8   <Class zzaoa$zza>
	//   49  106:dup             
	//   50  107:ldc2w           #100 <Double -100000D>
	//   51  110:ldc2w           #102 <Double 100000D>
	//   52  113:aconst_null     
	//   53  114:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   54  117:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   55  122:pop             
		((Map) (hashmap)).put("percentage", ((Object) (new zza(0.0D, 100D))));
	//   56  123:aload_1         
	//   57  124:ldc1            #105 <String "percentage">
	//   58  126:new             #8   <Class zzaoa$zza>
	//   59  129:dup             
	//   60  130:dconst_0        
	//   61  131:ldc2w           #106 <Double 100D>
	//   62  134:aconst_null     
	//   63  135:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   64  138:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   65  143:pop             
		((Map) (hashmap)).put("confidence", ((Object) (new zza(0.0D, 100D))));
	//   66  144:aload_1         
	//   67  145:ldc1            #109 <String "confidence">
	//   68  147:new             #8   <Class zzaoa$zza>
	//   69  150:dup             
	//   70  151:dconst_0        
	//   71  152:ldc2w           #106 <Double 100D>
	//   72  155:aconst_null     
	//   73  156:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   74  159:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   75  164:pop             
		((Map) (hashmap)).put("duration", ((Object) (new zza(0.0D, 9.2233720368547758E+18D))));
	//   76  165:aload_1         
	//   77  166:ldc1            #29  <String "duration">
	//   78  168:new             #8   <Class zzaoa$zza>
	//   79  171:dup             
	//   80  172:dconst_0        
	//   81  173:ldc2w           #110 <Double 9.2233720368547758E+18D>
	//   82  176:aconst_null     
	//   83  177:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   84  180:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   85  185:pop             
		((Map) (hashmap)).put("height", ((Object) (new zza(0.0D, 3D))));
	//   86  186:aload_1         
	//   87  187:ldc1            #113 <String "height">
	//   88  189:new             #8   <Class zzaoa$zza>
	//   89  192:dup             
	//   90  193:dconst_0        
	//   91  194:ldc2w           #114 <Double 3D>
	//   92  197:aconst_null     
	//   93  198:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//   94  201:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   95  206:pop             
		((Map) (hashmap)).put("weight", ((Object) (new zza(0.0D, 1000D))));
	//   96  207:aload_1         
	//   97  208:ldc1            #117 <String "weight">
	//   98  210:new             #8   <Class zzaoa$zza>
	//   99  213:dup             
	//  100  214:dconst_0        
	//  101  215:ldc2w           #98  <Double 1000D>
	//  102  218:aconst_null     
	//  103  219:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//  104  222:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  105  227:pop             
		((Map) (hashmap)).put("speed", ((Object) (new zza(0.0D, 11000D))));
	//  106  228:aload_1         
	//  107  229:ldc1            #119 <String "speed">
	//  108  231:new             #8   <Class zzaoa$zza>
	//  109  234:dup             
	//  110  235:dconst_0        
	//  111  236:ldc2w           #120 <Double 11000D>
	//  112  239:aconst_null     
	//  113  240:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//  114  243:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  115  248:pop             
		zzaUy = Collections.unmodifiableMap(((Map) (hashmap)));
	//  116  249:aload_0         
	//  117  250:aload_1         
	//  118  251:invokestatic    #125 <Method Map Collections.unmodifiableMap(Map)>
	//  119  254:putfield        #127 <Field Map zzaUy>
		hashmap = new HashMap();
	//  120  257:new             #69  <Class HashMap>
	//  121  260:dup             
	//  122  261:invokespecial   #70  <Method void HashMap()>
	//  123  264:astore_1        
		((Map) (hashmap)).put("com.google.step_count.delta", ((Object) (zzf("steps", ((Object) (new zza(0.0D, 1E-08D)))))));
	//  124  265:aload_1         
	//  125  266:ldc1            #129 <String "com.google.step_count.delta">
	//  126  268:ldc1            #131 <String "steps">
	//  127  270:new             #8   <Class zzaoa$zza>
	//  128  273:dup             
	//  129  274:dconst_0        
	//  130  275:ldc2w           #132 <Double 1E-08D>
	//  131  278:aconst_null     
	//  132  279:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//  133  282:invokestatic    #137 <Method Map zzf(Object, Object)>
	//  134  285:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  135  290:pop             
		((Map) (hashmap)).put("com.google.calories.consumed", ((Object) (zzf("calories", ((Object) (new zza(0.0D, 9.9999999999999995E-07D)))))));
	//  136  291:aload_1         
	//  137  292:ldc1            #139 <String "com.google.calories.consumed">
	//  138  294:ldc1            #141 <String "calories">
	//  139  296:new             #8   <Class zzaoa$zza>
	//  140  299:dup             
	//  141  300:dconst_0        
	//  142  301:ldc2w           #142 <Double 9.9999999999999995E-07D>
	//  143  304:aconst_null     
	//  144  305:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//  145  308:invokestatic    #137 <Method Map zzf(Object, Object)>
	//  146  311:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  147  316:pop             
		((Map) (hashmap)).put("com.google.calories.expended", ((Object) (zzf("calories", ((Object) (new zza(0.0D, 5.5555555555555553E-10D)))))));
	//  148  317:aload_1         
	//  149  318:ldc1            #145 <String "com.google.calories.expended">
	//  150  320:ldc1            #141 <String "calories">
	//  151  322:new             #8   <Class zzaoa$zza>
	//  152  325:dup             
	//  153  326:dconst_0        
	//  154  327:ldc2w           #146 <Double 5.5555555555555553E-10D>
	//  155  330:aconst_null     
	//  156  331:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//  157  334:invokestatic    #137 <Method Map zzf(Object, Object)>
	//  158  337:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  159  342:pop             
		((Map) (hashmap)).put("com.google.distance.delta", ((Object) (zzf("distance", ((Object) (new zza(0.0D, 9.9999999999999995E-08D)))))));
	//  160  343:aload_1         
	//  161  344:ldc1            #149 <String "com.google.distance.delta">
	//  162  346:ldc1            #151 <String "distance">
	//  163  348:new             #8   <Class zzaoa$zza>
	//  164  351:dup             
	//  165  352:dconst_0        
	//  166  353:ldc2w           #152 <Double 9.9999999999999995E-08D>
	//  167  356:aconst_null     
	//  168  357:invokespecial   #79  <Method void zzaoa$zza(double, double, zzaoa$1)>
	//  169  360:invokestatic    #137 <Method Map zzf(Object, Object)>
	//  170  363:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  171  368:pop             
		zzaUx = Collections.unmodifiableMap(((Map) (hashmap)));
	//  172  369:aload_0         
	//  173  370:aload_1         
	//  174  371:invokestatic    #125 <Method Map Collections.unmodifiableMap(Map)>
	//  175  374:putfield        #155 <Field Map zzaUx>
	//  176  377:return          
	}

	public static zzaoa zzCI()
	{
		return zzaUz;
	//    0    0:getstatic       #65  <Field zzaoa zzaUz>
	//    1    3:areturn         
	}

	private static Map zzf(Object obj, Object obj1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #69  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put(obj, obj1);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		return ((Map) (hashmap));
	//    9   17:aload_2         
	//   10   18:areturn         
	}

	zza zzK(String s, String s1)
	{
		s = ((String) ((Map)zzaUx.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field Map zzaUx>
	//    2    4:aload_1         
	//    3    5:invokeinterface #165 <Method Object Map.get(Object)>
	//    4   10:checkcast       #81  <Class Map>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          29
			return (zza)((Map) (s)).get(((Object) (s1)));
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokeinterface #165 <Method Object Map.get(Object)>
	//   11   25:checkcast       #8   <Class zzaoa$zza>
	//   12   28:areturn         
		else
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	zza zzej(String s)
	{
		return (zza)zzaUy.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Map zzaUy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #165 <Method Object Map.get(Object)>
	//    4   10:checkcast       #8   <Class zzaoa$zza>
	//    5   13:areturn         
	}

	public static final Set zzaUw = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type", "debug_session", "google.android.fitness.SessionV2"
	})))))))));
	private static final zzaoa zzaUz = new zzaoa();
	private final Map zzaUx;
	private final Map zzaUy;

	static 
	{
	//    0    0:new             #23  <Class HashSet>
	//    1    3:dup             
	//    2    4:bipush          9
	//    3    6:anewarray       String[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #27  <String "altitude">
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #29  <String "duration">
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #31  <String "food_item">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #33  <String "meal_type">
	//   19   28:aastore         
	//   20   29:dup             
	//   21   30:iconst_4        
	//   22   31:ldc1            #35  <String "repetitions">
	//   23   33:aastore         
	//   24   34:dup             
	//   25   35:iconst_5        
	//   26   36:ldc1            #37  <String "resistance">
	//   27   38:aastore         
	//   28   39:dup             
	//   29   40:bipush          6
	//   30   42:ldc1            #39  <String "resistance_type">
	//   31   44:aastore         
	//   32   45:dup             
	//   33   46:bipush          7
	//   34   48:ldc1            #41  <String "debug_session">
	//   35   50:aastore         
	//   36   51:dup             
	//   37   52:bipush          8
	//   38   54:ldc1            #43  <String "google.android.fitness.SessionV2">
	//   39   56:aastore         
	//   40   57:invokestatic    #49  <Method java.util.List Arrays.asList(Object[])>
	//   41   60:invokespecial   #53  <Method void HashSet(java.util.Collection)>
	//   42   63:invokestatic    #59  <Method Set Collections.unmodifiableSet(Set)>
	//   43   66:putstatic       #61  <Field Set zzaUw>
	//   44   69:new             #2   <Class zzaoa>
	//   45   72:dup             
	//   46   73:invokespecial   #63  <Method void zzaoa()>
	//   47   76:putstatic       #65  <Field zzaoa zzaUz>
	//*  48   79:return          
	}
}
