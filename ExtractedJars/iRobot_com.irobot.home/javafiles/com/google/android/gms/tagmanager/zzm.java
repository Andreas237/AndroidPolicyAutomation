// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.internal.measurement.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzgh, zzn, zzgj, zzdi, 
//			zzbx, zzft

class zzm extends zzgh
{
	public static interface zza
	{

		public abstract zzbx zznl();
	}


	public zzm(Context context)
	{
		this(context, ((zza) (new zzn(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #90  <Class zzn>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokespecial   #92  <Method void zzn(Context)>
	//    6   10:invokespecial   #95  <Method void zzm(Context, zzm$zza)>
	//    7   13:return          
	}

	private zzm(Context context, zza zza1)
	{
		super(ID, new String[] {
			URL
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #34  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #43  <Field String URL>
	//    7   13:aastore         
	//    8   14:invokespecial   #99  <Method void zzgh(String, String[])>
		zzazo = zza1;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #101 <Field zzm$zza zzazo>
		zzri = context;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #103 <Field Context zzri>
	//   15   27:return          
	}

	private final boolean zzdb(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzazn.contains(((Object) (s)));
	//    2    2:getstatic       #86  <Field Set zzazn>
	//    3    5:aload_1         
	//    4    6:invokeinterface #112 <Method boolean Set.contains(Object)>
	//    5   11:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_20;
	//    6   12:iload_2         
	//    7   13:ifeq            20
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		if(!zzri.getSharedPreferences(zzazm, 0).contains(s))
			break MISSING_BLOCK_LABEL_54;
	//   12   20:aload_0         
	//   13   21:getfield        #103 <Field Context zzri>
	//   14   24:getstatic       #80  <Field String zzazm>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #118 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   31:aload_1         
	//   18   32:invokeinterface #122 <Method boolean SharedPreferences.contains(String)>
	//   19   37:ifeq            54
		zzazn.add(((Object) (s)));
	//   20   40:getstatic       #86  <Field Set zzazn>
	//   21   43:aload_1         
	//   22   44:invokeinterface #125 <Method boolean Set.add(Object)>
	//   23   49:pop             
	//*  24   50:aload_0         
	//*  25   51:monitorexit     
		return true;
	//   26   52:iconst_1        
	//   27   53:ireturn         
		this;
	//   28   54:aload_0         
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		s;
	//   32   58:astore_1        
	//*  33   59:aload_0         
		throw s;
	//   34   60:monitorexit     
	//   35   61:aload_1         
	//   36   62:athrow          
	}

	public final void zze(Map map)
	{
		String s;
		if(map.get(((Object) (zzazl))) != null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #53  <Field String zzazl>
	//*   2    4:invokeinterface #133 <Method Object Map.get(Object)>
	//*   3    9:ifnull          31
			s = zzgj.zzc((zzp)map.get(((Object) (zzazl))));
	//    4   12:aload_1         
	//    5   13:getstatic       #53  <Field String zzazl>
	//    6   16:invokeinterface #133 <Method Object Map.get(Object)>
	//    7   21:checkcast       #135 <Class zzp>
	//    8   24:invokestatic    #141 <Method String zzgj.zzc(zzp)>
	//    9   27:astore_2        
		else
	//*  10   28:goto            33
			s = null;
	//   11   31:aconst_null     
	//   12   32:astore_2        
		if(s != null && zzdb(s))
	//*  13   33:aload_2         
	//*  14   34:ifnull          46
	//*  15   37:aload_0         
	//*  16   38:aload_2         
	//*  17   39:invokespecial   #143 <Method boolean zzdb(String)>
	//*  18   42:ifeq            46
			return;
	//   19   45:return          
		android.net.Uri.Builder builder = Uri.parse(zzgj.zzc((zzp)map.get(((Object) (URL))))).buildUpon();
	//   20   46:aload_1         
	//   21   47:getstatic       #43  <Field String URL>
	//   22   50:invokeinterface #133 <Method Object Map.get(Object)>
	//   23   55:checkcast       #135 <Class zzp>
	//   24   58:invokestatic    #141 <Method String zzgj.zzc(zzp)>
	//   25   61:invokestatic    #149 <Method Uri Uri.parse(String)>
	//   26   64:invokevirtual   #153 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   27   67:astore_3        
		map = ((Map) ((zzp)map.get(((Object) (zzazk)))));
	//   28   68:aload_1         
	//   29   69:getstatic       #48  <Field String zzazk>
	//   30   72:invokeinterface #133 <Method Object Map.get(Object)>
	//   31   77:checkcast       #135 <Class zzp>
	//   32   80:astore_1        
		if(map != null)
	//*  33   81:aload_1         
	//*  34   82:ifnull          285
		{
			map = ((Map) (zzgj.zzh(((zzp) (map)))));
	//   35   85:aload_1         
	//   36   86:invokestatic    #157 <Method Object zzgj.zzh(zzp)>
	//   37   89:astore_1        
			if(!(map instanceof List))
	//*  38   90:aload_1         
	//*  39   91:instanceof      #159 <Class List>
	//*  40   94:ifne            140
			{
				map = ((Map) (String.valueOf(((Object) (builder.build().toString())))));
	//   41   97:aload_3         
	//   42   98:invokevirtual   #165 <Method Uri android.net.Uri$Builder.build()>
	//   43  101:invokevirtual   #166 <Method String Uri.toString()>
	//   44  104:invokestatic    #61  <Method String String.valueOf(Object)>
	//   45  107:astore_1        
				if(((String) (map)).length() != 0)
	//*  46  108:aload_1         
	//*  47  109:invokevirtual   #65  <Method int String.length()>
	//*  48  112:ifeq            125
					map = ((Map) ("ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(((String) (map)))));
	//   49  115:ldc1            #168 <String "ArbitraryPixel: additional params not a list: not sending partial hit: ">
	//   50  117:aload_1         
	//   51  118:invokevirtual   #172 <Method String String.concat(String)>
	//   52  121:astore_1        
				else
	//*  53  122:goto            135
					map = ((Map) (new String("ArbitraryPixel: additional params not a list: not sending partial hit: ")));
	//   54  125:new             #57  <Class String>
	//   55  128:dup             
	//   56  129:ldc1            #168 <String "ArbitraryPixel: additional params not a list: not sending partial hit: ">
	//   57  131:invokespecial   #175 <Method void String(String)>
	//   58  134:astore_1        
				zzdi.e(((String) (map)));
	//   59  135:aload_1         
	//   60  136:invokestatic    #180 <Method void zzdi.e(String)>
				return;
	//   61  139:return          
			}
			for(map = ((Map) (((List)map).iterator())); ((Iterator) (map)).hasNext();)
	//*  62  140:aload_1         
	//*  63  141:checkcast       #159 <Class List>
	//*  64  144:invokeinterface #184 <Method Iterator List.iterator()>
	//*  65  149:astore_1        
	//*  66  150:aload_1         
	//*  67  151:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*  68  156:ifeq            285
			{
				Object obj = ((Iterator) (map)).next();
	//   69  159:aload_1         
	//   70  160:invokeinterface #194 <Method Object Iterator.next()>
	//   71  165:astore          4
				if(!(obj instanceof Map))
	//*  72  167:aload           4
	//*  73  169:instanceof      #129 <Class Map>
	//*  74  172:ifne            218
				{
					map = ((Map) (String.valueOf(((Object) (builder.build().toString())))));
	//   75  175:aload_3         
	//   76  176:invokevirtual   #165 <Method Uri android.net.Uri$Builder.build()>
	//   77  179:invokevirtual   #166 <Method String Uri.toString()>
	//   78  182:invokestatic    #61  <Method String String.valueOf(Object)>
	//   79  185:astore_1        
					if(((String) (map)).length() != 0)
	//*  80  186:aload_1         
	//*  81  187:invokevirtual   #65  <Method int String.length()>
	//*  82  190:ifeq            203
						map = ((Map) ("ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(((String) (map)))));
	//   83  193:ldc1            #196 <String "ArbitraryPixel: additional params contains non-map: not sending partial hit: ">
	//   84  195:aload_1         
	//   85  196:invokevirtual   #172 <Method String String.concat(String)>
	//   86  199:astore_1        
					else
	//*  87  200:goto            213
						map = ((Map) (new String("ArbitraryPixel: additional params contains non-map: not sending partial hit: ")));
	//   88  203:new             #57  <Class String>
	//   89  206:dup             
	//   90  207:ldc1            #196 <String "ArbitraryPixel: additional params contains non-map: not sending partial hit: ">
	//   91  209:invokespecial   #175 <Method void String(String)>
	//   92  212:astore_1        
					zzdi.e(((String) (map)));
	//   93  213:aload_1         
	//   94  214:invokestatic    #180 <Method void zzdi.e(String)>
					return;
	//   95  217:return          
				}
				obj = ((Object) (((Map)obj).entrySet().iterator()));
	//   96  218:aload           4
	//   97  220:checkcast       #129 <Class Map>
	//   98  223:invokeinterface #200 <Method Set Map.entrySet()>
	//   99  228:invokeinterface #201 <Method Iterator Set.iterator()>
	//  100  233:astore          4
				while(((Iterator) (obj)).hasNext()) 
	//* 101  235:aload           4
	//* 102  237:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//* 103  242:ifeq            150
				{
					java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  104  245:aload           4
	//  105  247:invokeinterface #194 <Method Object Iterator.next()>
	//  106  252:checkcast       #203 <Class java.util.Map$Entry>
	//  107  255:astore          5
					builder.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
	//  108  257:aload_3         
	//  109  258:aload           5
	//  110  260:invokeinterface #206 <Method Object java.util.Map$Entry.getKey()>
	//  111  265:invokevirtual   #209 <Method String Object.toString()>
	//  112  268:aload           5
	//  113  270:invokeinterface #212 <Method Object java.util.Map$Entry.getValue()>
	//  114  275:invokevirtual   #209 <Method String Object.toString()>
	//  115  278:invokevirtual   #216 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  116  281:pop             
				}
			}

		}
	//* 117  282:goto            235
		map = ((Map) (builder.build().toString()));
	//  118  285:aload_3         
	//  119  286:invokevirtual   #165 <Method Uri android.net.Uri$Builder.build()>
	//  120  289:invokevirtual   #166 <Method String Uri.toString()>
	//  121  292:astore_1        
		zzazo.zznl().zzdo(((String) (map)));
	//  122  293:aload_0         
	//  123  294:getfield        #101 <Field zzm$zza zzazo>
	//  124  297:invokeinterface #220 <Method zzbx zzm$zza.zznl()>
	//  125  302:aload_1         
	//  126  303:invokeinterface #225 <Method boolean zzbx.zzdo(String)>
	//  127  308:pop             
		map = ((Map) (String.valueOf(((Object) (map)))));
	//  128  309:aload_1         
	//  129  310:invokestatic    #61  <Method String String.valueOf(Object)>
	//  130  313:astore_1        
		if(((String) (map)).length() != 0)
	//* 131  314:aload_1         
	//* 132  315:invokevirtual   #65  <Method int String.length()>
	//* 133  318:ifeq            331
			map = ((Map) ("ArbitraryPixel: url = ".concat(((String) (map)))));
	//  134  321:ldc1            #227 <String "ArbitraryPixel: url = ">
	//  135  323:aload_1         
	//  136  324:invokevirtual   #172 <Method String String.concat(String)>
	//  137  327:astore_1        
		else
	//* 138  328:goto            341
			map = ((Map) (new String("ArbitraryPixel: url = ")));
	//  139  331:new             #57  <Class String>
	//  140  334:dup             
	//  141  335:ldc1            #227 <String "ArbitraryPixel: url = ">
	//  142  337:invokespecial   #175 <Method void String(String)>
	//  143  340:astore_1        
		zzdi.v(((String) (map)));
	//  144  341:aload_1         
	//  145  342:invokestatic    #230 <Method void zzdi.v(String)>
		if(s == null)
			break MISSING_BLOCK_LABEL_385;
	//  146  345:aload_2         
	//  147  346:ifnull          385
		com/google/android/gms/tagmanager/zzm;
	//  148  349:ldc1            #2   <Class zzm>
		JVM INSTR monitorenter ;
	//  149  351:monitorenter    
		zzazn.add(((Object) (s)));
	//  150  352:getstatic       #86  <Field Set zzazn>
	//  151  355:aload_2         
	//  152  356:invokeinterface #125 <Method boolean Set.add(Object)>
	//  153  361:pop             
		com.google.android.gms.tagmanager.zzft.zza(zzri, zzazm, s, "true");
	//  154  362:aload_0         
	//  155  363:getfield        #103 <Field Context zzri>
	//  156  366:getstatic       #80  <Field String zzazm>
	//  157  369:aload_2         
	//  158  370:ldc1            #232 <String "true">
	//  159  372:invokestatic    #237 <Method void com.google.android.gms.tagmanager.zzft.zza(Context, String, String, String)>
		com/google/android/gms/tagmanager/zzm;
	//  160  375:ldc1            #2   <Class zzm>
		JVM INSTR monitorexit ;
	//  161  377:monitorexit     
		return;
	//  162  378:return          
		map;
	//  163  379:astore_1        
		com/google/android/gms/tagmanager/zzm;
	//  164  380:ldc1            #2   <Class zzm>
		JVM INSTR monitorexit ;
	//  165  382:monitorexit     
		throw map;
	//  166  383:aload_1         
	//  167  384:athrow          
	//  168  385:return          
	}

	private static final String ID;
	private static final String URL;
	private static final String zzazk;
	private static final String zzazl;
	private static final String zzazm;
	private static final Set zzazn = new HashSet();
	private final zza zzazo;
	private final Context zzri;

	static 
	{
		ID = com.google.android.gms.internal.measurement.zza.zzbu.toString();
	//    0    0:getstatic       #28  <Field zza zza.zzbu>
	//    1    3:invokevirtual   #32  <Method String zza.toString()>
	//    2    6:putstatic       #34  <Field String ID>
		URL = zzb.zzmz.toString();
	//    3    9:getstatic       #40  <Field zzb zzb.zzmz>
	//    4   12:invokevirtual   #41  <Method String zzb.toString()>
	//    5   15:putstatic       #43  <Field String URL>
		zzazk = zzb.zzds.toString();
	//    6   18:getstatic       #46  <Field zzb zzb.zzds>
	//    7   21:invokevirtual   #41  <Method String zzb.toString()>
	//    8   24:putstatic       #48  <Field String zzazk>
		zzazl = zzb.zzmy.toString();
	//    9   27:getstatic       #51  <Field zzb zzb.zzmy>
	//   10   30:invokevirtual   #41  <Method String zzb.toString()>
	//   11   33:putstatic       #53  <Field String zzazl>
		String s = ID;
	//   12   36:getstatic       #34  <Field String ID>
	//   13   39:astore_0        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 17);
	//   14   40:new             #55  <Class StringBuilder>
	//   15   43:dup             
	//   16   44:aload_0         
	//   17   45:invokestatic    #61  <Method String String.valueOf(Object)>
	//   18   48:invokevirtual   #65  <Method int String.length()>
	//   19   51:bipush          17
	//   20   53:iadd            
	//   21   54:invokespecial   #69  <Method void StringBuilder(int)>
	//   22   57:astore_1        
		stringbuilder.append("gtm_");
	//   23   58:aload_1         
	//   24   59:ldc1            #71  <String "gtm_">
	//   25   61:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   26   64:pop             
		stringbuilder.append(s);
	//   27   65:aload_1         
	//   28   66:aload_0         
	//   29   67:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   30   70:pop             
		stringbuilder.append("_unrepeatable");
	//   31   71:aload_1         
	//   32   72:ldc1            #77  <String "_unrepeatable">
	//   33   74:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   34   77:pop             
		zzazm = stringbuilder.toString();
	//   35   78:aload_1         
	//   36   79:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   37   82:putstatic       #80  <Field String zzazm>
	//   38   85:new             #82  <Class HashSet>
	//   39   88:dup             
	//   40   89:invokespecial   #84  <Method void HashSet()>
	//   41   92:putstatic       #86  <Field Set zzazn>
	//*  42   95:return          
	}
}
