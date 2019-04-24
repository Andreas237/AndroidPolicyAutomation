// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakg, zzakd, zzakb

final class zzake extends zzakg
{

	zzake(zzakd zzakd1, Context context)
	{
		zzcrh = zzakd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzakd zzcrh>
		zzcrg = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Context zzcrg>
		super(((zzake) (null)));
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #17  <Method void zzakg(zzake)>
	//    9   15:return          
	}

	public final void zzdn()
	{
		SharedPreferences sharedpreferences;
		android.content.SharedPreferences.Editor editor;
		sharedpreferences = zzcrg.getSharedPreferences("admob", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzcrg>
	//    2    4:ldc1            #24  <String "admob">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #30  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore_2        
		editor = sharedpreferences.edit();
	//    6   11:aload_2         
	//    7   12:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   17:astore_3        
		Object obj = zzakd.zza(zzcrh);
	//    9   18:aload_0         
	//   10   19:getfield        #12  <Field zzakd zzcrh>
	//   11   22:invokestatic    #42  <Method Object zzakd.zza(zzakd)>
	//   12   25:astore_1        
		obj;
	//   13   26:aload_1         
		JVM INSTR monitorenter ;
	//   14   27:monitorenter    
		zzakd.zza(zzcrh, sharedpreferences);
	//   15   28:aload_0         
	//   16   29:getfield        #12  <Field zzakd zzcrh>
	//   17   32:aload_2         
	//   18   33:invokestatic    #45  <Method SharedPreferences zzakd.zza(zzakd, SharedPreferences)>
	//   19   36:pop             
		zzcrh.zzcqw = editor;
	//   20   37:aload_0         
	//   21   38:getfield        #12  <Field zzakd zzcrh>
	//   22   41:aload_3         
	//   23   42:putfield        #49  <Field android.content.SharedPreferences$Editor zzakd.zzcqw>
		zzakd.zza(zzcrh, zzakd.zzb(zzcrh));
	//   24   45:aload_0         
	//   25   46:getfield        #12  <Field zzakd zzcrh>
	//   26   49:aload_0         
	//   27   50:getfield        #12  <Field zzakd zzcrh>
	//   28   53:invokestatic    #53  <Method boolean zzakd.zzb(zzakd)>
	//   29   56:invokestatic    #56  <Method boolean zzakd.zza(zzakd, boolean)>
	//   30   59:pop             
		zzakd.zzb(zzcrh, zzakd.zzd(zzcrh).getBoolean("use_https", zzakd.zzc(zzcrh)));
	//   31   60:aload_0         
	//   32   61:getfield        #12  <Field zzakd zzcrh>
	//   33   64:aload_0         
	//   34   65:getfield        #12  <Field zzakd zzcrh>
	//   35   68:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//   36   71:ldc1            #62  <String "use_https">
	//   37   73:aload_0         
	//   38   74:getfield        #12  <Field zzakd zzcrh>
	//   39   77:invokestatic    #65  <Method boolean zzakd.zzc(zzakd)>
	//   40   80:invokeinterface #69  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   41   85:invokestatic    #71  <Method boolean zzakd.zzb(zzakd, boolean)>
	//   42   88:pop             
		zzakd.zzc(zzcrh, zzakd.zzd(zzcrh).getBoolean("content_url_opted_out", zzakd.zze(zzcrh)));
	//   43   89:aload_0         
	//   44   90:getfield        #12  <Field zzakd zzcrh>
	//   45   93:aload_0         
	//   46   94:getfield        #12  <Field zzakd zzcrh>
	//   47   97:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//   48  100:ldc1            #73  <String "content_url_opted_out">
	//   49  102:aload_0         
	//   50  103:getfield        #12  <Field zzakd zzcrh>
	//   51  106:invokestatic    #76  <Method boolean zzakd.zze(zzakd)>
	//   52  109:invokeinterface #69  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   53  114:invokestatic    #78  <Method boolean zzakd.zzc(zzakd, boolean)>
	//   54  117:pop             
		zzakd.zza(zzcrh, zzakd.zzd(zzcrh).getString("content_url_hashes", zzakd.zzf(zzcrh)));
	//   55  118:aload_0         
	//   56  119:getfield        #12  <Field zzakd zzcrh>
	//   57  122:aload_0         
	//   58  123:getfield        #12  <Field zzakd zzcrh>
	//   59  126:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//   60  129:ldc1            #80  <String "content_url_hashes">
	//   61  131:aload_0         
	//   62  132:getfield        #12  <Field zzakd zzcrh>
	//   63  135:invokestatic    #84  <Method String zzakd.zzf(zzakd)>
	//   64  138:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//   65  143:invokestatic    #91  <Method String zzakd.zza(zzakd, String)>
	//   66  146:pop             
		zzakd.zzd(zzcrh, zzakd.zzd(zzcrh).getBoolean("auto_collect_location", zzakd.zzg(zzcrh)));
	//   67  147:aload_0         
	//   68  148:getfield        #12  <Field zzakd zzcrh>
	//   69  151:aload_0         
	//   70  152:getfield        #12  <Field zzakd zzcrh>
	//   71  155:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//   72  158:ldc1            #93  <String "auto_collect_location">
	//   73  160:aload_0         
	//   74  161:getfield        #12  <Field zzakd zzcrh>
	//   75  164:invokestatic    #96  <Method boolean zzakd.zzg(zzakd)>
	//   76  167:invokeinterface #69  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   77  172:invokestatic    #98  <Method boolean zzakd.zzd(zzakd, boolean)>
	//   78  175:pop             
		zzakd.zze(zzcrh, zzakd.zzd(zzcrh).getBoolean("content_vertical_opted_out", zzakd.zzh(zzcrh)));
	//   79  176:aload_0         
	//   80  177:getfield        #12  <Field zzakd zzcrh>
	//   81  180:aload_0         
	//   82  181:getfield        #12  <Field zzakd zzcrh>
	//   83  184:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//   84  187:ldc1            #100 <String "content_vertical_opted_out">
	//   85  189:aload_0         
	//   86  190:getfield        #12  <Field zzakd zzcrh>
	//   87  193:invokestatic    #103 <Method boolean zzakd.zzh(zzakd)>
	//   88  196:invokeinterface #69  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   89  201:invokestatic    #105 <Method boolean zzakd.zze(zzakd, boolean)>
	//   90  204:pop             
		zzakd.zzb(zzcrh, zzakd.zzd(zzcrh).getString("content_vertical_hashes", zzakd.zzi(zzcrh)));
	//   91  205:aload_0         
	//   92  206:getfield        #12  <Field zzakd zzcrh>
	//   93  209:aload_0         
	//   94  210:getfield        #12  <Field zzakd zzcrh>
	//   95  213:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//   96  216:ldc1            #107 <String "content_vertical_hashes">
	//   97  218:aload_0         
	//   98  219:getfield        #12  <Field zzakd zzcrh>
	//   99  222:invokestatic    #110 <Method String zzakd.zzi(zzakd)>
	//  100  225:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//  101  230:invokestatic    #112 <Method String zzakd.zzb(zzakd, String)>
	//  102  233:pop             
		zzakd.zza(zzcrh, zzakd.zzd(zzcrh).getInt("version_code", zzakd.zzj(zzcrh)));
	//  103  234:aload_0         
	//  104  235:getfield        #12  <Field zzakd zzcrh>
	//  105  238:aload_0         
	//  106  239:getfield        #12  <Field zzakd zzcrh>
	//  107  242:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  108  245:ldc1            #114 <String "version_code">
	//  109  247:aload_0         
	//  110  248:getfield        #12  <Field zzakd zzcrh>
	//  111  251:invokestatic    #118 <Method int zzakd.zzj(zzakd)>
	//  112  254:invokeinterface #122 <Method int SharedPreferences.getInt(String, int)>
	//  113  259:invokestatic    #125 <Method int zzakd.zza(zzakd, int)>
	//  114  262:pop             
		zzakd.zzc(zzcrh, zzakd.zzd(zzcrh).getString("app_settings_json", zzakd.zzk(zzcrh)));
	//  115  263:aload_0         
	//  116  264:getfield        #12  <Field zzakd zzcrh>
	//  117  267:aload_0         
	//  118  268:getfield        #12  <Field zzakd zzcrh>
	//  119  271:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  120  274:ldc1            #127 <String "app_settings_json">
	//  121  276:aload_0         
	//  122  277:getfield        #12  <Field zzakd zzcrh>
	//  123  280:invokestatic    #130 <Method String zzakd.zzk(zzakd)>
	//  124  283:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//  125  288:invokestatic    #132 <Method String zzakd.zzc(zzakd, String)>
	//  126  291:pop             
		zzakd.zza(zzcrh, zzakd.zzd(zzcrh).getLong("app_settings_last_update_ms", zzakd.zzl(zzcrh)));
	//  127  292:aload_0         
	//  128  293:getfield        #12  <Field zzakd zzcrh>
	//  129  296:aload_0         
	//  130  297:getfield        #12  <Field zzakd zzcrh>
	//  131  300:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  132  303:ldc1            #134 <String "app_settings_last_update_ms">
	//  133  305:aload_0         
	//  134  306:getfield        #12  <Field zzakd zzcrh>
	//  135  309:invokestatic    #138 <Method long zzakd.zzl(zzakd)>
	//  136  312:invokeinterface #142 <Method long SharedPreferences.getLong(String, long)>
	//  137  317:invokestatic    #145 <Method long zzakd.zza(zzakd, long)>
	//  138  320:pop2            
		zzakd.zzb(zzcrh, zzakd.zzd(zzcrh).getLong("app_last_background_time_ms", zzakd.zzm(zzcrh)));
	//  139  321:aload_0         
	//  140  322:getfield        #12  <Field zzakd zzcrh>
	//  141  325:aload_0         
	//  142  326:getfield        #12  <Field zzakd zzcrh>
	//  143  329:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  144  332:ldc1            #147 <String "app_last_background_time_ms">
	//  145  334:aload_0         
	//  146  335:getfield        #12  <Field zzakd zzcrh>
	//  147  338:invokestatic    #150 <Method long zzakd.zzm(zzakd)>
	//  148  341:invokeinterface #142 <Method long SharedPreferences.getLong(String, long)>
	//  149  346:invokestatic    #152 <Method long zzakd.zzb(zzakd, long)>
	//  150  349:pop2            
		zzakd.zzb(zzcrh, zzakd.zzd(zzcrh).getInt("request_in_session_count", zzakd.zzn(zzcrh)));
	//  151  350:aload_0         
	//  152  351:getfield        #12  <Field zzakd zzcrh>
	//  153  354:aload_0         
	//  154  355:getfield        #12  <Field zzakd zzcrh>
	//  155  358:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  156  361:ldc1            #154 <String "request_in_session_count">
	//  157  363:aload_0         
	//  158  364:getfield        #12  <Field zzakd zzcrh>
	//  159  367:invokestatic    #157 <Method int zzakd.zzn(zzakd)>
	//  160  370:invokeinterface #122 <Method int SharedPreferences.getInt(String, int)>
	//  161  375:invokestatic    #159 <Method int zzakd.zzb(zzakd, int)>
	//  162  378:pop             
		zzakd.zzc(zzcrh, zzakd.zzd(zzcrh).getLong("first_ad_req_time_ms", zzakd.zzo(zzcrh)));
	//  163  379:aload_0         
	//  164  380:getfield        #12  <Field zzakd zzcrh>
	//  165  383:aload_0         
	//  166  384:getfield        #12  <Field zzakd zzcrh>
	//  167  387:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  168  390:ldc1            #161 <String "first_ad_req_time_ms">
	//  169  392:aload_0         
	//  170  393:getfield        #12  <Field zzakd zzcrh>
	//  171  396:invokestatic    #164 <Method long zzakd.zzo(zzakd)>
	//  172  399:invokeinterface #142 <Method long SharedPreferences.getLong(String, long)>
	//  173  404:invokestatic    #166 <Method long zzakd.zzc(zzakd, long)>
	//  174  407:pop2            
		zzakd.zza(zzcrh, zzakd.zzd(zzcrh).getStringSet("never_pool_slots", zzakd.zzp(zzcrh)));
	//  175  408:aload_0         
	//  176  409:getfield        #12  <Field zzakd zzcrh>
	//  177  412:aload_0         
	//  178  413:getfield        #12  <Field zzakd zzcrh>
	//  179  416:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  180  419:ldc1            #168 <String "never_pool_slots">
	//  181  421:aload_0         
	//  182  422:getfield        #12  <Field zzakd zzcrh>
	//  183  425:invokestatic    #172 <Method java.util.Set zzakd.zzp(zzakd)>
	//  184  428:invokeinterface #176 <Method java.util.Set SharedPreferences.getStringSet(String, java.util.Set)>
	//  185  433:invokestatic    #179 <Method java.util.Set zzakd.zza(zzakd, java.util.Set)>
	//  186  436:pop             
		zzakd.zza(zzcrh, new JSONObject(zzakd.zzd(zzcrh).getString("native_advanced_settings", "{}")));
	//  187  437:aload_0         
	//  188  438:getfield        #12  <Field zzakd zzcrh>
	//  189  441:new             #181 <Class JSONObject>
	//  190  444:dup             
	//  191  445:aload_0         
	//  192  446:getfield        #12  <Field zzakd zzcrh>
	//  193  449:invokestatic    #60  <Method SharedPreferences zzakd.zzd(zzakd)>
	//  194  452:ldc1            #183 <String "native_advanced_settings">
	//  195  454:ldc1            #185 <String "{}">
	//  196  456:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//  197  461:invokespecial   #188 <Method void JSONObject(String)>
	//  198  464:invokestatic    #191 <Method JSONObject zzakd.zza(zzakd, JSONObject)>
	//  199  467:pop             
		break MISSING_BLOCK_LABEL_478;
	//  200  468:goto            478
		Object obj1;
		obj1;
	//  201  471:astore_2        
		zzakb.zzc("Could not convert native advanced settings to json object", ((Throwable) (obj1)));
	//  202  472:ldc1            #193 <String "Could not convert native advanced settings to json object">
	//  203  474:aload_2         
	//  204  475:invokestatic    #198 <Method void zzakb.zzc(String, Throwable)>
		zzakd.zza(zzcrh, zzakd.zzq(zzcrh));
	//  205  478:aload_0         
	//  206  479:getfield        #12  <Field zzakd zzcrh>
	//  207  482:aload_0         
	//  208  483:getfield        #12  <Field zzakd zzcrh>
	//  209  486:invokestatic    #202 <Method android.os.Bundle zzakd.zzq(zzakd)>
	//  210  489:invokestatic    #205 <Method void zzakd.zza(zzakd, android.os.Bundle)>
		obj;
	//  211  492:aload_1         
		JVM INSTR monitorexit ;
	//  212  493:monitorexit     
		return;
	//  213  494:return          
		obj1;
	//  214  495:astore_2        
		obj;
	//  215  496:aload_1         
		JVM INSTR monitorexit ;
	//  216  497:monitorexit     
		throw obj1;
	//  217  498:aload_2         
	//  218  499:athrow          
	}

	private final Context zzcrg;
	private final zzakd zzcrh;
}
