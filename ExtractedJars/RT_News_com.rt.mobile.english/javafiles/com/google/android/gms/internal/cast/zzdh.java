// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.SystemClock;
import com.google.android.gms.cast.*;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcg, zzcu, zzdn, zzdj, 
//			zzcm, zzdk, zzdg, zzdi, 
//			zzdm

public final class zzdh extends zzcg
{

	public zzdh(String s)
	{
		super(NAMESPACE, "MediaControlChannel", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #44  <Field String NAMESPACE>
	//    2    4:ldc1            #49  <String "MediaControlChannel">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #52  <Method void zzcg(String, String, String)>
	//    5   10:aload_0         
	//    6   11:new             #54  <Class zzdn>
	//    7   14:dup             
	//    8   15:ldc2w           #55  <Long 0x5265c00L>
	//    9   18:invokespecial   #59  <Method void zzdn(long)>
	//   10   21:putfield        #61  <Field zzdn zzws>
	//   11   24:aload_0         
	//   12   25:new             #54  <Class zzdn>
	//   13   28:dup             
	//   14   29:ldc2w           #55  <Long 0x5265c00L>
	//   15   32:invokespecial   #59  <Method void zzdn(long)>
	//   16   35:putfield        #63  <Field zzdn zzwt>
	//   17   38:aload_0         
	//   18   39:new             #54  <Class zzdn>
	//   19   42:dup             
	//   20   43:ldc2w           #55  <Long 0x5265c00L>
	//   21   46:invokespecial   #59  <Method void zzdn(long)>
	//   22   49:putfield        #65  <Field zzdn zzwu>
	//   23   52:aload_0         
	//   24   53:new             #54  <Class zzdn>
	//   25   56:dup             
	//   26   57:ldc2w           #55  <Long 0x5265c00L>
	//   27   60:invokespecial   #59  <Method void zzdn(long)>
	//   28   63:putfield        #67  <Field zzdn zzwv>
	//   29   66:aload_0         
	//   30   67:new             #54  <Class zzdn>
	//   31   70:dup             
	//   32   71:ldc2w           #68  <Long 10000L>
	//   33   74:invokespecial   #59  <Method void zzdn(long)>
	//   34   77:putfield        #71  <Field zzdn zzww>
	//   35   80:aload_0         
	//   36   81:new             #54  <Class zzdn>
	//   37   84:dup             
	//   38   85:ldc2w           #55  <Long 0x5265c00L>
	//   39   88:invokespecial   #59  <Method void zzdn(long)>
	//   40   91:putfield        #73  <Field zzdn zzwx>
	//   41   94:aload_0         
	//   42   95:new             #54  <Class zzdn>
	//   43   98:dup             
	//   44   99:ldc2w           #55  <Long 0x5265c00L>
	//   45  102:invokespecial   #59  <Method void zzdn(long)>
	//   46  105:putfield        #75  <Field zzdn zzwy>
	//   47  108:aload_0         
	//   48  109:new             #54  <Class zzdn>
	//   49  112:dup             
	//   50  113:ldc2w           #55  <Long 0x5265c00L>
	//   51  116:invokespecial   #59  <Method void zzdn(long)>
	//   52  119:putfield        #77  <Field zzdn zzwz>
	//   53  122:aload_0         
	//   54  123:new             #54  <Class zzdn>
	//   55  126:dup             
	//   56  127:ldc2w           #55  <Long 0x5265c00L>
	//   57  130:invokespecial   #59  <Method void zzdn(long)>
	//   58  133:putfield        #79  <Field zzdn zzxa>
	//   59  136:aload_0         
	//   60  137:new             #54  <Class zzdn>
	//   61  140:dup             
	//   62  141:ldc2w           #55  <Long 0x5265c00L>
	//   63  144:invokespecial   #59  <Method void zzdn(long)>
	//   64  147:putfield        #81  <Field zzdn zzxb>
	//   65  150:aload_0         
	//   66  151:new             #54  <Class zzdn>
	//   67  154:dup             
	//   68  155:ldc2w           #55  <Long 0x5265c00L>
	//   69  158:invokespecial   #59  <Method void zzdn(long)>
	//   70  161:putfield        #83  <Field zzdn zzxc>
	//   71  164:aload_0         
	//   72  165:new             #54  <Class zzdn>
	//   73  168:dup             
	//   74  169:ldc2w           #55  <Long 0x5265c00L>
	//   75  172:invokespecial   #59  <Method void zzdn(long)>
	//   76  175:putfield        #85  <Field zzdn zzxd>
	//   77  178:aload_0         
	//   78  179:new             #54  <Class zzdn>
	//   79  182:dup             
	//   80  183:ldc2w           #55  <Long 0x5265c00L>
	//   81  186:invokespecial   #59  <Method void zzdn(long)>
	//   82  189:putfield        #87  <Field zzdn zzxe>
	//   83  192:aload_0         
	//   84  193:new             #54  <Class zzdn>
	//   85  196:dup             
	//   86  197:ldc2w           #55  <Long 0x5265c00L>
	//   87  200:invokespecial   #59  <Method void zzdn(long)>
	//   88  203:putfield        #89  <Field zzdn zzxf>
	//   89  206:aload_0         
	//   90  207:new             #54  <Class zzdn>
	//   91  210:dup             
	//   92  211:ldc2w           #55  <Long 0x5265c00L>
	//   93  214:invokespecial   #59  <Method void zzdn(long)>
	//   94  217:putfield        #91  <Field zzdn zzxg>
	//   95  220:aload_0         
	//   96  221:new             #54  <Class zzdn>
	//   97  224:dup             
	//   98  225:ldc2w           #55  <Long 0x5265c00L>
	//   99  228:invokespecial   #59  <Method void zzdn(long)>
	//  100  231:putfield        #93  <Field zzdn zzxi>
	//  101  234:aload_0         
	//  102  235:new             #54  <Class zzdn>
	//  103  238:dup             
	//  104  239:ldc2w           #55  <Long 0x5265c00L>
	//  105  242:invokespecial   #59  <Method void zzdn(long)>
	//  106  245:putfield        #95  <Field zzdn zzxh>
	//  107  248:aload_0         
	//  108  249:new             #54  <Class zzdn>
	//  109  252:dup             
	//  110  253:ldc2w           #55  <Long 0x5265c00L>
	//  111  256:invokespecial   #59  <Method void zzdn(long)>
	//  112  259:putfield        #97  <Field zzdn zzxj>
		((zzcg)this).zza(zzws);
	//  113  262:aload_0         
	//  114  263:aload_0         
	//  115  264:getfield        #61  <Field zzdn zzws>
	//  116  267:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzwt);
	//  117  270:aload_0         
	//  118  271:aload_0         
	//  119  272:getfield        #63  <Field zzdn zzwt>
	//  120  275:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzwu);
	//  121  278:aload_0         
	//  122  279:aload_0         
	//  123  280:getfield        #65  <Field zzdn zzwu>
	//  124  283:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzwv);
	//  125  286:aload_0         
	//  126  287:aload_0         
	//  127  288:getfield        #67  <Field zzdn zzwv>
	//  128  291:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzww);
	//  129  294:aload_0         
	//  130  295:aload_0         
	//  131  296:getfield        #71  <Field zzdn zzww>
	//  132  299:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzwx);
	//  133  302:aload_0         
	//  134  303:aload_0         
	//  135  304:getfield        #73  <Field zzdn zzwx>
	//  136  307:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzwy);
	//  137  310:aload_0         
	//  138  311:aload_0         
	//  139  312:getfield        #75  <Field zzdn zzwy>
	//  140  315:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzwz);
	//  141  318:aload_0         
	//  142  319:aload_0         
	//  143  320:getfield        #77  <Field zzdn zzwz>
	//  144  323:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxa);
	//  145  326:aload_0         
	//  146  327:aload_0         
	//  147  328:getfield        #79  <Field zzdn zzxa>
	//  148  331:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxb);
	//  149  334:aload_0         
	//  150  335:aload_0         
	//  151  336:getfield        #81  <Field zzdn zzxb>
	//  152  339:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxc);
	//  153  342:aload_0         
	//  154  343:aload_0         
	//  155  344:getfield        #83  <Field zzdn zzxc>
	//  156  347:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxd);
	//  157  350:aload_0         
	//  158  351:aload_0         
	//  159  352:getfield        #85  <Field zzdn zzxd>
	//  160  355:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxe);
	//  161  358:aload_0         
	//  162  359:aload_0         
	//  163  360:getfield        #87  <Field zzdn zzxe>
	//  164  363:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxf);
	//  165  366:aload_0         
	//  166  367:aload_0         
	//  167  368:getfield        #89  <Field zzdn zzxf>
	//  168  371:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxg);
	//  169  374:aload_0         
	//  170  375:aload_0         
	//  171  376:getfield        #91  <Field zzdn zzxg>
	//  172  379:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxi);
	//  173  382:aload_0         
	//  174  383:aload_0         
	//  175  384:getfield        #93  <Field zzdn zzxi>
	//  176  387:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxi);
	//  177  390:aload_0         
	//  178  391:aload_0         
	//  179  392:getfield        #93  <Field zzdn zzxi>
	//  180  395:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		((zzcg)this).zza(zzxj);
	//  181  398:aload_0         
	//  182  399:aload_0         
	//  183  400:getfield        #97  <Field zzdn zzxj>
	//  184  403:invokevirtual   #101 <Method void zzcg.zza(zzdn)>
		zzcz();
	//  185  406:aload_0         
	//  186  407:invokespecial   #104 <Method void zzcz()>
	//  187  410:return          
	}

	private final void onMetadataUpdated()
	{
		if(zzwr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field zzdj zzwr>
	//*   2    4:ifnull          16
			zzwr.onMetadataUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field zzdj zzwr>
	//    5   11:invokeinterface #111 <Method void zzdj.onMetadataUpdated()>
	//    6   16:return          
	}

	private final void onPreloadStatusUpdated()
	{
		if(zzwr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field zzdj zzwr>
	//*   2    4:ifnull          16
			zzwr.onPreloadStatusUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field zzdj zzwr>
	//    5   11:invokeinterface #114 <Method void zzdj.onPreloadStatusUpdated()>
	//    6   16:return          
	}

	private final void onQueueStatusUpdated()
	{
		if(zzwr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field zzdj zzwr>
	//*   2    4:ifnull          16
			zzwr.onQueueStatusUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field zzdj zzwr>
	//    5   11:invokeinterface #117 <Method void zzdj.onQueueStatusUpdated()>
	//    6   16:return          
	}

	private final void onStatusUpdated()
	{
		if(zzwr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field zzdj zzwr>
	//*   2    4:ifnull          16
			zzwr.onStatusUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field zzdj zzwr>
	//    5   11:invokeinterface #120 <Method void zzdj.onStatusUpdated()>
	//    6   16:return          
	}

	private final long zza(double d, long l, long l1)
	{
		long l3 = SystemClock.elapsedRealtime() - zzwp;
	//    0    0:invokestatic    #127 <Method long SystemClock.elapsedRealtime()>
	//    1    3:aload_0         
	//    2    4:getfield        #129 <Field long zzwp>
	//    3    7:lsub            
	//    4    8:lstore          9
		long l2 = l3;
	//    5   10:lload           9
	//    6   12:lstore          7
		if(l3 < 0L)
	//*   7   14:lload           9
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:ifge            24
			l2 = 0L;
	//   11   21:lconst_0        
	//   12   22:lstore          7
		if(l2 == 0L)
	//*  13   24:lload           7
	//*  14   26:lconst_0        
	//*  15   27:lcmp            
	//*  16   28:ifne            33
			return l;
	//   17   31:lload_3         
	//   18   32:lreturn         
		l += (long)((double)l2 * d);
	//   19   33:lload_3         
	//   20   34:lload           7
	//   21   36:l2d             
	//   22   37:dload_1         
	//   23   38:dmul            
	//   24   39:d2l             
	//   25   40:ladd            
	//   26   41:lstore_3        
		if(l1 > 0L && l > l1)
	//*  27   42:lload           5
	//*  28   44:lconst_0        
	//*  29   45:lcmp            
	//*  30   46:ifle            59
	//*  31   49:lload_3         
	//*  32   50:lload           5
	//*  33   52:lcmp            
	//*  34   53:ifle            59
			return l1;
	//   35   56:lload           5
	//   36   58:lreturn         
		if(l < 0L)
	//*  37   59:lload_3         
	//*  38   60:lconst_0        
	//*  39   61:lcmp            
	//*  40   62:ifge            67
			return 0L;
	//   41   65:lconst_0        
	//   42   66:lreturn         
		else
			return l;
	//   43   67:lload_3         
	//   44   68:lreturn         
	}

	private final long zza(zzdm zzdm, boolean flag)
		throws IllegalStateException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          5
		long l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_3        
		if(flag)
	//*   7   14:iload_2         
	//*   8   15:ifeq            27
			zzwz.zza(l, zzdm);
	//    9   18:aload_0         
	//   10   19:getfield        #77  <Field zzdn zzwz>
	//   11   22:lload_3         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		try
		{
			jsonobject.put("requestId", l);
	//   14   27:aload           5
	//   15   29:ldc1            #148 <String "requestId">
	//   16   31:lload_3         
	//   17   32:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   18   35:pop             
			jsonobject.put("type", "GET_STATUS");
	//   19   36:aload           5
	//   20   38:ldc1            #154 <String "type">
	//   21   40:ldc1            #156 <String "GET_STATUS">
	//   22   42:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   23   45:pop             
			if(zzwq != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #161 <Field MediaStatus zzwq>
	//*  26   50:ifnull          68
				jsonobject.put("mediaSessionId", zzwq.zzj());
	//   27   53:aload           5
	//   28   55:ldc1            #163 <String "mediaSessionId">
	//   29   57:aload_0         
	//   30   58:getfield        #161 <Field MediaStatus zzwq>
	//   31   61:invokevirtual   #168 <Method long MediaStatus.zzj()>
	//   32   64:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   33   67:pop             
		}
	//*  34   68:aload_0         
	//*  35   69:aload           5
	//*  36   71:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  37   74:lload_3         
	//*  38   75:aconst_null     
	//*  39   76:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  40   79:lload_3         
	//*  41   80:lreturn         
		// Misplaced declaration of an exception variable
		catch(zzdm zzdm) { }
	//   42   81:astore_1        
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
		return l;
	//*  43   82:goto            68
	}

	private static String zza(String s, List list, long l)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          5
		jsonobject.put("requestId", l);
	//    4    9:aload           5
	//    5   11:ldc1            #148 <String "requestId">
	//    6   13:lload_2         
	//    7   14:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//    8   17:pop             
		jsonobject.put("type", "PRECACHE");
	//    9   18:aload           5
	//   10   20:ldc1            #154 <String "type">
	//   11   22:ldc1            #179 <String "PRECACHE">
	//   12   24:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   13   27:pop             
		if(s == null)
			break MISSING_BLOCK_LABEL_41;
	//   14   28:aload_0         
	//   15   29:ifnull          41
		jsonobject.put("precacheData", ((Object) (s)));
	//   16   32:aload           5
	//   17   34:ldc1            #181 <String "precacheData">
	//   18   36:aload_0         
	//   19   37:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   20   40:pop             
		if(list == null)
			break MISSING_BLOCK_LABEL_115;
	//   21   41:aload_1         
	//   22   42:ifnull          115
		if(list.isEmpty())
			break MISSING_BLOCK_LABEL_115;
	//   23   45:aload_1         
	//   24   46:invokeinterface #187 <Method boolean List.isEmpty()>
	//   25   51:ifne            115
		s = ((String) (new JSONArray()));
	//   26   54:new             #189 <Class JSONArray>
	//   27   57:dup             
	//   28   58:invokespecial   #190 <Method void JSONArray()>
	//   29   61:astore_0        
		int i = 0;
	//   30   62:iconst_0        
	//   31   63:istore          4
_L2:
		if(i >= list.size())
			break; /* Loop/switch isn't completed */
	//   32   65:iload           4
	//   33   67:aload_1         
	//   34   68:invokeinterface #194 <Method int List.size()>
	//   35   73:icmpge          106
		((JSONArray) (s)).put(i, ((Object) (((zzbp)list.get(i)).toJson())));
	//   36   76:aload_0         
	//   37   77:iload           4
	//   38   79:aload_1         
	//   39   80:iload           4
	//   40   82:invokeinterface #198 <Method Object List.get(int)>
	//   41   87:checkcast       #200 <Class zzbp>
	//   42   90:invokevirtual   #204 <Method JSONObject zzbp.toJson()>
	//   43   93:invokevirtual   #207 <Method JSONArray JSONArray.put(int, Object)>
	//   44   96:pop             
		i++;
	//   45   97:iload           4
	//   46   99:iconst_1        
	//   47  100:iadd            
	//   48  101:istore          4
		if(true) goto _L2; else goto _L1
	//   49  103:goto            65
_L1:
		try
		{
			jsonobject.put("requestItems", ((Object) (s)));
	//   50  106:aload           5
	//   51  108:ldc1            #209 <String "requestItems">
	//   52  110:aload_0         
	//   53  111:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   54  114:pop             
		}
	//*  55  115:aload           5
	//*  56  117:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  57  120:areturn         
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   58  121:astore_0        
		return jsonobject.toString();
	//*  59  122:goto            115
	}

	static void zza(zzdh zzdh1)
	{
		zzdh1.zzda();
	//    0    0:aload_0         
	//    1    1:invokespecial   #215 <Method void zzda()>
	//    2    4:return          
	}

	private static int[] zzb(JSONArray jsonarray)
		throws JSONException
	{
		if(jsonarray == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int ai[] = new int[jsonarray.length()];
	//    4    6:aload_0         
	//    5    7:invokevirtual   #220 <Method int JSONArray.length()>
	//    6   10:newarray        int[]
	//    7   12:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   8   13:iconst_0        
	//*   9   14:istore_1        
	//*  10   15:iload_1         
	//*  11   16:aload_0         
	//*  12   17:invokevirtual   #220 <Method int JSONArray.length()>
	//*  13   20:icmpge          38
			ai[i] = jsonarray.getInt(i);
	//   14   23:aload_2         
	//   15   24:iload_1         
	//   16   25:aload_0         
	//   17   26:iload_1         
	//   18   27:invokevirtual   #224 <Method int JSONArray.getInt(int)>
	//   19   30:iastore         

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            15
		return ai;
	//   25   38:aload_2         
	//   26   39:areturn         
	}

	private final void zzcz()
	{
		zzwp = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #129 <Field long zzwp>
		zzwq = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #161 <Field MediaStatus zzwq>
		for(Iterator iterator = ((zzcg)this).zzcn().iterator(); iterator.hasNext(); ((zzdn)iterator.next()).zzq(2002));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #228 <Method List zzcg.zzcn()>
	//    8   14:invokeinterface #232 <Method Iterator List.iterator()>
	//    9   19:astore_1        
	//   10   20:aload_1         
	//   11   21:invokeinterface #237 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            48
	//   13   29:aload_1         
	//   14   30:invokeinterface #241 <Method Object Iterator.next()>
	//   15   35:checkcast       #54  <Class zzdn>
	//   16   38:sipush          2002
	//   17   41:invokevirtual   #245 <Method boolean zzdn.zzq(int)>
	//   18   44:pop             
	//*  19   45:goto            20
	//   20   48:return          
	}

	private final void zzda()
	{
		zza(((zzdm) (null)), false);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:invokespecial   #247 <Method long zza(zzdm, boolean)>
	//    4    6:pop2            
	//    5    7:return          
	}

	private final long zzj()
		throws zzdk
	{
		if(zzwq == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field MediaStatus zzwq>
	//*   2    4:ifnonnull       15
			throw new zzdk();
	//    3    7:new             #249 <Class zzdk>
	//    4   10:dup             
	//    5   11:invokespecial   #250 <Method void zzdk()>
	//    6   14:athrow          
		else
			return zzwq.zzj();
	//    7   15:aload_0         
	//    8   16:getfield        #161 <Field MediaStatus zzwq>
	//    9   19:invokevirtual   #168 <Method long MediaStatus.zzj()>
	//   10   22:lreturn         
	}

	public final long getApproximateAdBreakClipPositionMs()
	{
		if(zzwp != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field long zzwp>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            101
		{
			if(zzwq == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #161 <Field MediaStatus zzwq>
	//*   7   13:ifnonnull       18
				return 0L;
	//    8   16:lconst_0        
	//    9   17:lreturn         
			AdBreakStatus adbreakstatus = zzwq.getAdBreakStatus();
	//   10   18:aload_0         
	//   11   19:getfield        #161 <Field MediaStatus zzwq>
	//   12   22:invokevirtual   #255 <Method AdBreakStatus MediaStatus.getAdBreakStatus()>
	//   13   25:astore          7
			if(adbreakstatus == null)
	//*  14   27:aload           7
	//*  15   29:ifnonnull       34
				return 0L;
	//   16   32:lconst_0        
	//   17   33:lreturn         
			AdBreakClipInfo adbreakclipinfo = zzwq.getCurrentAdBreakClip();
	//   18   34:aload_0         
	//   19   35:getfield        #161 <Field MediaStatus zzwq>
	//   20   38:invokevirtual   #259 <Method AdBreakClipInfo MediaStatus.getCurrentAdBreakClip()>
	//   21   41:astore          8
			if(adbreakclipinfo == null)
	//*  22   43:aload           8
	//*  23   45:ifnonnull       50
				return 0L;
	//   24   48:lconst_0        
	//   25   49:lreturn         
			double d2 = zzwq.getPlaybackRate();
	//   26   50:aload_0         
	//   27   51:getfield        #161 <Field MediaStatus zzwq>
	//   28   54:invokevirtual   #263 <Method double MediaStatus.getPlaybackRate()>
	//   29   57:dstore          5
			double d1 = 0.0D;
	//   30   59:dconst_0        
	//   31   60:dstore_3        
			double d = d1;
	//   32   61:dload_3         
	//   33   62:dstore_1        
			if(d2 == 0.0D)
	//*  34   63:dload           5
	//*  35   65:dconst_0        
	//*  36   66:dcmpl           
	//*  37   67:ifne            85
			{
				d = d1;
	//   38   70:dload_3         
	//   39   71:dstore_1        
				if(zzwq.getPlayerState() == 2)
	//*  40   72:aload_0         
	//*  41   73:getfield        #161 <Field MediaStatus zzwq>
	//*  42   76:invokevirtual   #266 <Method int MediaStatus.getPlayerState()>
	//*  43   79:iconst_2        
	//*  44   80:icmpne          85
					d = 1.0D;
	//   45   83:dconst_1        
	//   46   84:dstore_1        
			}
			return zza(d, adbreakstatus.getCurrentBreakClipTimeInMs(), adbreakclipinfo.getDurationInMs());
	//   47   85:aload_0         
	//   48   86:dload_1         
	//   49   87:aload           7
	//   50   89:invokevirtual   #271 <Method long AdBreakStatus.getCurrentBreakClipTimeInMs()>
	//   51   92:aload           8
	//   52   94:invokevirtual   #276 <Method long AdBreakClipInfo.getDurationInMs()>
	//   53   97:invokespecial   #278 <Method long zza(double, long, long)>
	//   54  100:lreturn         
		} else
		{
			return 0L;
	//   55  101:lconst_0        
	//   56  102:lreturn         
		}
	}

	public final long getApproximateStreamPosition()
	{
		MediaInfo mediainfo = getMediaInfo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method MediaInfo getMediaInfo()>
	//    2    4:astore          6
		if(mediainfo == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       13
			return 0L;
	//    5   11:lconst_0        
	//    6   12:lreturn         
		if(zzwp == 0L)
	//*   7   13:aload_0         
	//*   8   14:getfield        #129 <Field long zzwp>
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            24
			return 0L;
	//   12   22:lconst_0        
	//   13   23:lreturn         
		double d = zzwq.getPlaybackRate();
	//   14   24:aload_0         
	//   15   25:getfield        #161 <Field MediaStatus zzwq>
	//   16   28:invokevirtual   #263 <Method double MediaStatus.getPlaybackRate()>
	//   17   31:dstore_1        
		long l = zzwq.getStreamPosition();
	//   18   32:aload_0         
	//   19   33:getfield        #161 <Field MediaStatus zzwq>
	//   20   36:invokevirtual   #286 <Method long MediaStatus.getStreamPosition()>
	//   21   39:lstore          4
		int i = zzwq.getPlayerState();
	//   22   41:aload_0         
	//   23   42:getfield        #161 <Field MediaStatus zzwq>
	//   24   45:invokevirtual   #266 <Method int MediaStatus.getPlayerState()>
	//   25   48:istore_3        
		if(d != 0.0D)
	//*  26   49:dload_1         
	//*  27   50:dconst_0        
	//*  28   51:dcmpl           
	//*  29   52:ifeq            76
		{
			if(i != 2)
	//*  30   55:iload_3         
	//*  31   56:iconst_2        
	//*  32   57:icmpeq          63
				return l;
	//   33   60:lload           4
	//   34   62:lreturn         
			else
				return zza(d, l, mediainfo.getStreamDuration());
	//   35   63:aload_0         
	//   36   64:dload_1         
	//   37   65:lload           4
	//   38   67:aload           6
	//   39   69:invokevirtual   #291 <Method long MediaInfo.getStreamDuration()>
	//   40   72:invokespecial   #278 <Method long zza(double, long, long)>
	//   41   75:lreturn         
		} else
		{
			return l;
	//   42   76:lload           4
	//   43   78:lreturn         
		}
	}

	public final MediaInfo getMediaInfo()
	{
		if(zzwq == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field MediaStatus zzwq>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzwq.getMediaInfo();
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field MediaStatus zzwq>
	//    7   13:invokevirtual   #292 <Method MediaInfo MediaStatus.getMediaInfo()>
	//    8   16:areturn         
	}

	public final MediaStatus getMediaStatus()
	{
		return zzwq;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaStatus zzwq>
	//    2    4:areturn         
	}

	public final long getStreamDuration()
	{
		MediaInfo mediainfo = getMediaInfo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method MediaInfo getMediaInfo()>
	//    2    4:astore_1        
		if(mediainfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return mediainfo.getStreamDuration();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #291 <Method long MediaInfo.getStreamDuration()>
	//    7   13:lreturn         
		else
			return 0L;
	//    8   14:lconst_0        
	//    9   15:lreturn         
	}

	public final long zza(zzdm zzdm)
		throws IllegalStateException, zzdk
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          4
		long l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_2        
		zzwx.zza(l, zzdm);
	//    7   14:aload_0         
	//    8   15:getfield        #73  <Field zzdn zzwx>
	//    9   18:lload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		try
		{
			jsonobject.put("requestId", l);
	//   12   23:aload           4
	//   13   25:ldc1            #148 <String "requestId">
	//   14   27:lload_2         
	//   15   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   31:pop             
			jsonobject.put("type", "SKIP_AD");
	//   17   32:aload           4
	//   18   34:ldc1            #154 <String "type">
	//   19   36:ldc2            #297 <String "SKIP_AD">
	//   20   39:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
			jsonobject.put("mediaSessionId", zzj());
	//   22   43:aload           4
	//   23   45:ldc1            #163 <String "mediaSessionId">
	//   24   47:aload_0         
	//   25   48:invokespecial   #298 <Method long zzj()>
	//   26   51:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   54:pop             
		}
	//*  28   55:goto            90
		// Misplaced declaration of an exception variable
		catch(zzdm zzdm)
	//*  29   58:astore_1        
		{
			zzuv.w(String.format(Locale.ROOT, "Error creating SkipAd message: %s", new Object[] {
				((JSONException) (zzdm)).getMessage()
			}), new Object[0]);
	//   30   59:aload_0         
	//   31   60:getfield        #302 <Field zzdg zzuv>
	//   32   63:getstatic       #308 <Field Locale Locale.ROOT>
	//   33   66:ldc2            #310 <String "Error creating SkipAd message: %s">
	//   34   69:iconst_1        
	//   35   70:anewarray       Object[]
	//   36   73:dup             
	//   37   74:iconst_0        
	//   38   75:aload_1         
	//   39   76:invokevirtual   #315 <Method String JSONException.getMessage()>
	//   40   79:aastore         
	//   41   80:invokestatic    #321 <Method String String.format(Locale, String, Object[])>
	//   42   83:iconst_0        
	//   43   84:anewarray       Object[]
	//   44   87:invokevirtual   #327 <Method void zzdg.w(String, Object[])>
		}
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
	//   45   90:aload_0         
	//   46   91:aload           4
	//   47   93:invokevirtual   #172 <Method String JSONObject.toString()>
	//   48   96:lload_2         
	//   49   97:aconst_null     
	//   50   98:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
		return l;
	//   51  101:lload_2         
	//   52  102:lreturn         
	}

	public final long zza(zzdm zzdm, double d, JSONObject jsonobject)
		throws IllegalStateException, zzdk, IllegalArgumentException
	{
		long l;
		JSONObject jsonobject1;
		if(Double.isInfinite(d) || Double.isNaN(d))
	//*   0    0:dload_2         
	//*   1    1:invokestatic    #336 <Method boolean Double.isInfinite(double)>
	//*   2    4:ifne            133
	//*   3    7:dload_2         
	//*   4    8:invokestatic    #339 <Method boolean Double.isNaN(double)>
	//*   5   11:ifeq            17
			break MISSING_BLOCK_LABEL_133;
	//    6   14:goto            133
		jsonobject1 = new JSONObject();
	//    7   17:new             #136 <Class JSONObject>
	//    8   20:dup             
	//    9   21:invokespecial   #138 <Method void JSONObject()>
	//   10   24:astore          7
		l = ((zzcm)this).zzco();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #143 <Method long zzcm.zzco()>
	//   13   30:lstore          5
		zzwx.zza(l, zzdm);
	//   14   32:aload_0         
	//   15   33:getfield        #73  <Field zzdn zzwx>
	//   16   36:lload           5
	//   17   38:aload_1         
	//   18   39:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   19   42:aload           7
	//   20   44:ldc1            #148 <String "requestId">
	//   21   46:lload           5
	//   22   48:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   23   51:pop             
		jsonobject1.put("type", "SET_VOLUME");
	//   24   52:aload           7
	//   25   54:ldc1            #154 <String "type">
	//   26   56:ldc2            #341 <String "SET_VOLUME">
	//   27   59:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   28   62:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   29   63:aload           7
	//   30   65:ldc1            #163 <String "mediaSessionId">
	//   31   67:aload_0         
	//   32   68:invokespecial   #298 <Method long zzj()>
	//   33   71:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   34   74:pop             
		zzdm = ((zzdm) (new JSONObject()));
	//   35   75:new             #136 <Class JSONObject>
	//   36   78:dup             
	//   37   79:invokespecial   #138 <Method void JSONObject()>
	//   38   82:astore_1        
		((JSONObject) (zzdm)).put("level", d);
	//   39   83:aload_1         
	//   40   84:ldc2            #343 <String "level">
	//   41   87:dload_2         
	//   42   88:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//   43   91:pop             
		jsonobject1.put("volume", ((Object) (zzdm)));
	//   44   92:aload           7
	//   45   94:ldc2            #348 <String "volume">
	//   46   97:aload_1         
	//   47   98:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   48  101:pop             
		if(jsonobject != null)
	//*  49  102:aload           4
	//*  50  104:ifnull          118
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   51  107:aload           7
	//   52  109:ldc2            #350 <String "customData">
	//   53  112:aload           4
	//   54  114:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   55  117:pop             
			}
	//*  56  118:aload_0         
	//*  57  119:aload           7
	//*  58  121:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  59  124:lload           5
	//*  60  126:aconst_null     
	//*  61  127:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  62  130:lload           5
	//*  63  132:lreturn         
	//*  64  133:new             #352 <Class StringBuilder>
	//*  65  136:dup             
	//*  66  137:bipush          41
	//*  67  139:invokespecial   #355 <Method void StringBuilder(int)>
	//*  68  142:astore_1        
	//*  69  143:aload_1         
	//*  70  144:ldc2            #357 <String "Volume cannot be ">
	//*  71  147:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//*  72  150:pop             
	//*  73  151:aload_1         
	//*  74  152:dload_2         
	//*  75  153:invokevirtual   #364 <Method StringBuilder StringBuilder.append(double)>
	//*  76  156:pop             
	//*  77  157:new             #330 <Class IllegalArgumentException>
	//*  78  160:dup             
	//*  79  161:aload_1         
	//*  80  162:invokevirtual   #365 <Method String StringBuilder.toString()>
	//*  81  165:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//*  82  168:athrow          
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   83  169:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
		zzdm = ((zzdm) (new StringBuilder(41)));
		((StringBuilder) (zzdm)).append("Volume cannot be ");
		((StringBuilder) (zzdm)).append(d);
		throw new IllegalArgumentException(((StringBuilder) (zzdm)).toString());
	//*  84  170:goto            118
	}

	public final long zza(zzdm zzdm, int i, int j, int k)
		throws zzdk, IllegalArgumentException
	{
		long l;
		JSONObject jsonobject;
		if((j <= 0 || k != 0) && (j != 0 || k <= 0))
	//*   0    0:iload_3         
	//*   1    1:ifle            9
	//*   2    4:iload           4
	//*   3    6:ifeq            21
	//*   4    9:iload_3         
	//*   5   10:ifne            134
	//*   6   13:iload           4
	//*   7   15:ifgt            21
			break MISSING_BLOCK_LABEL_134;
	//    8   18:goto            134
		jsonobject = new JSONObject();
	//    9   21:new             #136 <Class JSONObject>
	//   10   24:dup             
	//   11   25:invokespecial   #138 <Method void JSONObject()>
	//   12   28:astore          7
		l = ((zzcm)this).zzco();
	//   13   30:aload_0         
	//   14   31:invokevirtual   #143 <Method long zzcm.zzco()>
	//   15   34:lstore          5
		zzxi.zza(l, zzdm);
	//   16   36:aload_0         
	//   17   37:getfield        #93  <Field zzdn zzxi>
	//   18   40:lload           5
	//   19   42:aload_1         
	//   20   43:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject.put("requestId", l);
	//   21   46:aload           7
	//   22   48:ldc1            #148 <String "requestId">
	//   23   50:lload           5
	//   24   52:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   25   55:pop             
		jsonobject.put("type", "QUEUE_GET_ITEM_RANGE");
	//   26   56:aload           7
	//   27   58:ldc1            #154 <String "type">
	//   28   60:ldc2            #370 <String "QUEUE_GET_ITEM_RANGE">
	//   29   63:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   30   66:pop             
		jsonobject.put("mediaSessionId", zzj());
	//   31   67:aload           7
	//   32   69:ldc1            #163 <String "mediaSessionId">
	//   33   71:aload_0         
	//   34   72:invokespecial   #298 <Method long zzj()>
	//   35   75:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   36   78:pop             
		jsonobject.put("itemId", i);
	//   37   79:aload           7
	//   38   81:ldc2            #372 <String "itemId">
	//   39   84:iload_2         
	//   40   85:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//   41   88:pop             
		if(j <= 0)
			break MISSING_BLOCK_LABEL_103;
	//   42   89:iload_3         
	//   43   90:ifle            103
		jsonobject.put("nextCount", j);
	//   44   93:aload           7
	//   45   95:ldc2            #377 <String "nextCount">
	//   46   98:iload_3         
	//   47   99:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//   48  102:pop             
		if(k > 0)
	//*  49  103:iload           4
	//*  50  105:ifle            119
			try
			{
				jsonobject.put("prevCount", k);
	//   51  108:aload           7
	//   52  110:ldc2            #379 <String "prevCount">
	//   53  113:iload           4
	//   54  115:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//   55  118:pop             
			}
	//*  56  119:aload_0         
	//*  57  120:aload           7
	//*  58  122:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  59  125:lload           5
	//*  60  127:aconst_null     
	//*  61  128:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  62  131:lload           5
	//*  63  133:lreturn         
	//*  64  134:new             #330 <Class IllegalArgumentException>
	//*  65  137:dup             
	//*  66  138:ldc2            #381 <String "Exactly one of nextCount and prevCount must be positive and the other must be zero">
	//*  67  141:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//*  68  144:athrow          
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   69  145:astore_1        
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
		return l;
		throw new IllegalArgumentException("Exactly one of nextCount and prevCount must be positive and the other must be zero");
	//*  70  146:goto            119
	}

	public final long zza(zzdm zzdm, int i, long l, MediaQueueItem amediaqueueitem[], int j, Integer integer, 
			JSONObject jsonobject)
		throws IllegalArgumentException, IllegalStateException, zzdk
	{
		long l1;
		JSONObject jsonobject1;
		if(l != -1L && l < 0L)
	//*   0    0:lload_3         
	//*   1    1:ldc2w           #383 <Long -1L>
	//*   2    4:lcmp            
	//*   3    5:ifeq            50
	//*   4    8:lload_3         
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifge            50
		{
			zzdm = ((zzdm) (new StringBuilder(53)));
	//    8   14:new             #352 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:bipush          53
	//   11   20:invokespecial   #355 <Method void StringBuilder(int)>
	//   12   23:astore_1        
			((StringBuilder) (zzdm)).append("playPosition cannot be negative: ");
	//   13   24:aload_1         
	//   14   25:ldc2            #386 <String "playPosition cannot be negative: ">
	//   15   28:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			((StringBuilder) (zzdm)).append(l);
	//   17   32:aload_1         
	//   18   33:lload_3         
	//   19   34:invokevirtual   #389 <Method StringBuilder StringBuilder.append(long)>
	//   20   37:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzdm)).toString());
	//   21   38:new             #330 <Class IllegalArgumentException>
	//   22   41:dup             
	//   23   42:aload_1         
	//   24   43:invokevirtual   #365 <Method String StringBuilder.toString()>
	//   25   46:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//   26   49:athrow          
		}
		jsonobject1 = new JSONObject();
	//   27   50:new             #136 <Class JSONObject>
	//   28   53:dup             
	//   29   54:invokespecial   #138 <Method void JSONObject()>
	//   30   57:astore          11
		l1 = ((zzcm)this).zzco();
	//   31   59:aload_0         
	//   32   60:invokevirtual   #143 <Method long zzcm.zzco()>
	//   33   63:lstore          9
		zzxd.zza(l1, zzdm);
	//   34   65:aload_0         
	//   35   66:getfield        #85  <Field zzdn zzxd>
	//   36   69:lload           9
	//   37   71:aload_1         
	//   38   72:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l1);
	//   39   75:aload           11
	//   40   77:ldc1            #148 <String "requestId">
	//   41   79:lload           9
	//   42   81:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   43   84:pop             
		jsonobject1.put("type", "QUEUE_UPDATE");
	//   44   85:aload           11
	//   45   87:ldc1            #154 <String "type">
	//   46   89:ldc2            #391 <String "QUEUE_UPDATE">
	//   47   92:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   48   95:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   49   96:aload           11
	//   50   98:ldc1            #163 <String "mediaSessionId">
	//   51  100:aload_0         
	//   52  101:invokespecial   #298 <Method long zzj()>
	//   53  104:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   54  107:pop             
		if(i == 0)
			break MISSING_BLOCK_LABEL_122;
	//   55  108:iload_2         
	//   56  109:ifeq            122
		jsonobject1.put("currentItemId", i);
	//   57  112:aload           11
	//   58  114:ldc2            #393 <String "currentItemId">
	//   59  117:iload_2         
	//   60  118:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//   61  121:pop             
		if(j == 0)
			break MISSING_BLOCK_LABEL_138;
	//   62  122:iload           6
	//   63  124:ifeq            138
		jsonobject1.put("jump", j);
	//   64  127:aload           11
	//   65  129:ldc2            #395 <String "jump">
	//   66  132:iload           6
	//   67  134:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//   68  137:pop             
		if(amediaqueueitem == null)
			break MISSING_BLOCK_LABEL_196;
	//   69  138:aload           5
	//   70  140:ifnull          196
		if(amediaqueueitem.length <= 0)
			break MISSING_BLOCK_LABEL_196;
	//   71  143:aload           5
	//   72  145:arraylength     
	//   73  146:ifle            196
		zzdm = ((zzdm) (new JSONArray()));
	//   74  149:new             #189 <Class JSONArray>
	//   75  152:dup             
	//   76  153:invokespecial   #190 <Method void JSONArray()>
	//   77  156:astore_1        
		i = 0;
	//   78  157:iconst_0        
	//   79  158:istore_2        
_L2:
		if(i >= amediaqueueitem.length)
			break; /* Loop/switch isn't completed */
	//   80  159:iload_2         
	//   81  160:aload           5
	//   82  162:arraylength     
	//   83  163:icmpge          186
		((JSONArray) (zzdm)).put(i, ((Object) (amediaqueueitem[i].toJson())));
	//   84  166:aload_1         
	//   85  167:iload_2         
	//   86  168:aload           5
	//   87  170:iload_2         
	//   88  171:aaload          
	//   89  172:invokevirtual   #398 <Method JSONObject MediaQueueItem.toJson()>
	//   90  175:invokevirtual   #207 <Method JSONArray JSONArray.put(int, Object)>
	//   91  178:pop             
		i++;
	//   92  179:iload_2         
	//   93  180:iconst_1        
	//   94  181:iadd            
	//   95  182:istore_2        
		if(true) goto _L2; else goto _L1
	//   96  183:goto            159
_L1:
		jsonobject1.put("items", ((Object) (zzdm)));
	//   97  186:aload           11
	//   98  188:ldc2            #400 <String "items">
	//   99  191:aload_1         
	//  100  192:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//  101  195:pop             
		if(integer == null) goto _L4; else goto _L3
	//  102  196:aload           7
	//  103  198:ifnull          249
_L3:
		integer.intValue();
	//  104  201:aload           7
	//  105  203:invokevirtual   #405 <Method int Integer.intValue()>
		JVM INSTR tableswitch 0 3: default 307
	//	               0 331
	//	               1 324
	//	               2 317
	//	               3 310;
	//  106  206:tableswitch     0 3: default 307
	//	               0 331
	//	               1 324
	//	               2 317
	//	               3 310
		   goto _L4 _L5 _L6 _L7 _L8
_L5:
		break MISSING_BLOCK_LABEL_331;
_L9:
		jsonobject1.put("repeatMode", ((Object) (zzdm)));
	//  107  236:aload           11
	//  108  238:ldc2            #407 <String "repeatMode">
	//  109  241:aload_1         
	//  110  242:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//  111  245:pop             
	//* 112  246:goto            249
_L4:
		if(l == -1L)
			break MISSING_BLOCK_LABEL_272;
	//  113  249:lload_3         
	//  114  250:ldc2w           #383 <Long -1L>
	//  115  253:lcmp            
	//  116  254:ifeq            272
		jsonobject1.put("currentTime", (double)l / 1000D);
	//  117  257:aload           11
	//  118  259:ldc2            #409 <String "currentTime">
	//  119  262:lload_3         
	//  120  263:l2d             
	//  121  264:ldc2w           #410 <Double 1000D>
	//  122  267:ddiv            
	//  123  268:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//  124  271:pop             
		if(jsonobject != null)
	//* 125  272:aload           8
	//* 126  274:ifnull          288
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//  127  277:aload           11
	//  128  279:ldc2            #350 <String "customData">
	//  129  282:aload           8
	//  130  284:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//  131  287:pop             
			}
	//* 132  288:aload_0         
	//* 133  289:aload           11
	//* 134  291:invokevirtual   #172 <Method String JSONObject.toString()>
	//* 135  294:lload           9
	//* 136  296:aconst_null     
	//* 137  297:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//* 138  300:lload           9
	//* 139  302:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//  140  303:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l1, ((String) (null)));
		return l1;
	//* 141  304:goto            288
	//* 142  307:goto            249
_L8:
		zzdm = "REPEAT_ALL_AND_SHUFFLE";
	//  143  310:ldc2            #413 <String "REPEAT_ALL_AND_SHUFFLE">
	//  144  313:astore_1        
		  goto _L9
	//* 145  314:goto            236
_L7:
		zzdm = "REPEAT_SINGLE";
	//  146  317:ldc2            #415 <String "REPEAT_SINGLE">
	//  147  320:astore_1        
		  goto _L9
	//* 148  321:goto            236
_L6:
		zzdm = "REPEAT_ALL";
	//  149  324:ldc2            #417 <String "REPEAT_ALL">
	//  150  327:astore_1        
		  goto _L9
	//* 151  328:goto            236
		zzdm = "REPEAT_OFF";
	//  152  331:ldc2            #419 <String "REPEAT_OFF">
	//  153  334:astore_1        
		  goto _L9
	//* 154  335:goto            236
	}

	public final long zza(zzdm zzdm, long l, int i, JSONObject jsonobject)
		throws IllegalStateException, zzdk
	{
		long l1;
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          8
		l1 = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore          6
		zzww.zza(l1, ((zzdm) (new zzdi(this, zzdm))));
	//    7   15:aload_0         
	//    8   16:getfield        #71  <Field zzdn zzww>
	//    9   19:lload           6
	//   10   21:new             #422 <Class zzdi>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #425 <Method void zzdi(zzdh, zzdm)>
	//   15   30:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l1);
	//   16   33:aload           8
	//   17   35:ldc1            #148 <String "requestId">
	//   18   37:lload           6
	//   19   39:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   20   42:pop             
		jsonobject1.put("type", "SEEK");
	//   21   43:aload           8
	//   22   45:ldc1            #154 <String "type">
	//   23   47:ldc2            #427 <String "SEEK">
	//   24   50:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   25   53:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   26   54:aload           8
	//   27   56:ldc1            #163 <String "mediaSessionId">
	//   28   58:aload_0         
	//   29   59:invokespecial   #298 <Method long zzj()>
	//   30   62:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   31   65:pop             
		jsonobject1.put("currentTime", (double)l / 1000D);
	//   32   66:aload           8
	//   33   68:ldc2            #409 <String "currentTime">
	//   34   71:lload_2         
	//   35   72:l2d             
	//   36   73:ldc2w           #410 <Double 1000D>
	//   37   76:ddiv            
	//   38   77:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//   39   80:pop             
		if(i != 1) goto _L2; else goto _L1
	//   40   81:iload           4
	//   41   83:iconst_1        
	//   42   84:icmpne          139
_L1:
		zzdm = "PLAYBACK_START";
	//   43   87:ldc2            #429 <String "PLAYBACK_START">
	//   44   90:astore_1        
_L6:
		jsonobject1.put("resumeState", ((Object) (zzdm)));
	//   45   91:aload           8
	//   46   93:ldc2            #431 <String "resumeState">
	//   47   96:aload_1         
	//   48   97:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   49  100:pop             
	//*  50  101:goto            104
_L4:
		if(jsonobject != null)
	//*  51  104:aload           5
	//*  52  106:ifnull          120
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   53  109:aload           8
	//   54  111:ldc2            #350 <String "customData">
	//   55  114:aload           5
	//   56  116:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   57  119:pop             
			}
	//*  58  120:aload_0         
	//*  59  121:aload           8
	//*  60  123:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  61  126:lload           6
	//*  62  128:aconst_null     
	//*  63  129:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  64  132:lload           6
	//*  65  134:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   66  135:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l1, ((String) (null)));
		return l1;
	//*  67  136:goto            120
_L2:
		if(i != 2) goto _L4; else goto _L3
	//   68  139:iload           4
	//   69  141:iconst_2        
	//   70  142:icmpne          104
_L3:
		zzdm = "PLAYBACK_PAUSE";
	//   71  145:ldc2            #433 <String "PLAYBACK_PAUSE">
	//   72  148:astore_1        
		if(true) goto _L6; else goto _L5
	//   73  149:goto            91
_L5:
	}

	public final long zza(zzdm zzdm, MediaInfo mediainfo, MediaLoadOptions medialoadoptions)
		throws IllegalStateException, IllegalArgumentException
	{
		long l;
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          7
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore          5
		zzws.zza(l, zzdm);
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field zzdn zzws>
	//    9   19:lload           5
	//   10   21:aload_1         
	//   11   22:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject.put("requestId", l);
	//   12   25:aload           7
	//   13   27:ldc1            #148 <String "requestId">
	//   14   29:lload           5
	//   15   31:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   34:pop             
		jsonobject.put("type", "LOAD");
	//   17   35:aload           7
	//   18   37:ldc1            #154 <String "type">
	//   19   39:ldc2            #437 <String "LOAD">
	//   20   42:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
		jsonobject.put("media", ((Object) (mediainfo.toJson())));
	//   22   46:aload           7
	//   23   48:ldc2            #439 <String "media">
	//   24   51:aload_2         
	//   25   52:invokevirtual   #440 <Method JSONObject MediaInfo.toJson()>
	//   26   55:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   27   58:pop             
		jsonobject.put("autoplay", medialoadoptions.getAutoplay());
	//   28   59:aload           7
	//   29   61:ldc2            #442 <String "autoplay">
	//   30   64:aload_3         
	//   31   65:invokevirtual   #447 <Method boolean MediaLoadOptions.getAutoplay()>
	//   32   68:invokevirtual   #450 <Method JSONObject JSONObject.put(String, boolean)>
	//   33   71:pop             
		jsonobject.put("currentTime", (double)medialoadoptions.getPlayPosition() / 1000D);
	//   34   72:aload           7
	//   35   74:ldc2            #409 <String "currentTime">
	//   36   77:aload_3         
	//   37   78:invokevirtual   #453 <Method long MediaLoadOptions.getPlayPosition()>
	//   38   81:l2d             
	//   39   82:ldc2w           #410 <Double 1000D>
	//   40   85:ddiv            
	//   41   86:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//   42   89:pop             
		jsonobject.put("playbackRate", medialoadoptions.getPlaybackRate());
	//   43   90:aload           7
	//   44   92:ldc2            #455 <String "playbackRate">
	//   45   95:aload_3         
	//   46   96:invokevirtual   #456 <Method double MediaLoadOptions.getPlaybackRate()>
	//   47   99:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//   48  102:pop             
		if(medialoadoptions.getCredentials() != null)
	//*  49  103:aload_3         
	//*  50  104:invokevirtual   #459 <Method String MediaLoadOptions.getCredentials()>
	//*  51  107:ifnull          123
			jsonobject.put("credentials", ((Object) (medialoadoptions.getCredentials())));
	//   52  110:aload           7
	//   53  112:ldc2            #461 <String "credentials">
	//   54  115:aload_3         
	//   55  116:invokevirtual   #459 <Method String MediaLoadOptions.getCredentials()>
	//   56  119:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   57  122:pop             
		if(medialoadoptions.getCredentialsType() != null)
	//*  58  123:aload_3         
	//*  59  124:invokevirtual   #464 <Method String MediaLoadOptions.getCredentialsType()>
	//*  60  127:ifnull          143
			jsonobject.put("credentialsType", ((Object) (medialoadoptions.getCredentialsType())));
	//   61  130:aload           7
	//   62  132:ldc2            #466 <String "credentialsType">
	//   63  135:aload_3         
	//   64  136:invokevirtual   #464 <Method String MediaLoadOptions.getCredentialsType()>
	//   65  139:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   66  142:pop             
		zzdm = ((zzdm) (medialoadoptions.getActiveTrackIds()));
	//   67  143:aload_3         
	//   68  144:invokevirtual   #470 <Method long[] MediaLoadOptions.getActiveTrackIds()>
	//   69  147:astore_1        
		if(zzdm == null)
			break MISSING_BLOCK_LABEL_200;
	//   70  148:aload_1         
	//   71  149:ifnull          200
		mediainfo = ((MediaInfo) (new JSONArray()));
	//   72  152:new             #189 <Class JSONArray>
	//   73  155:dup             
	//   74  156:invokespecial   #190 <Method void JSONArray()>
	//   75  159:astore_2        
		int i = 0;
	//   76  160:iconst_0        
	//   77  161:istore          4
_L2:
		if(i >= zzdm.length)
			break; /* Loop/switch isn't completed */
	//   78  163:iload           4
	//   79  165:aload_1         
	//   80  166:arraylength     
	//   81  167:icmpge          190
		((JSONArray) (mediainfo)).put(i, zzdm[i]);
	//   82  170:aload_2         
	//   83  171:iload           4
	//   84  173:aload_1         
	//   85  174:iload           4
	//   86  176:laload          
	//   87  177:invokevirtual   #473 <Method JSONArray JSONArray.put(int, long)>
	//   88  180:pop             
		i++;
	//   89  181:iload           4
	//   90  183:iconst_1        
	//   91  184:iadd            
	//   92  185:istore          4
		if(true) goto _L2; else goto _L1
	//   93  187:goto            163
_L1:
		jsonobject.put("activeTrackIds", ((Object) (mediainfo)));
	//   94  190:aload           7
	//   95  192:ldc2            #475 <String "activeTrackIds">
	//   96  195:aload_2         
	//   97  196:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   98  199:pop             
		zzdm = ((zzdm) (medialoadoptions.getCustomData()));
	//   99  200:aload_3         
	//  100  201:invokevirtual   #478 <Method JSONObject MediaLoadOptions.getCustomData()>
	//  101  204:astore_1        
		if(zzdm != null)
	//* 102  205:aload_1         
	//* 103  206:ifnull          219
			try
			{
				jsonobject.put("customData", ((Object) (zzdm)));
	//  104  209:aload           7
	//  105  211:ldc2            #350 <String "customData">
	//  106  214:aload_1         
	//  107  215:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//  108  218:pop             
			}
	//* 109  219:aload_0         
	//* 110  220:aload           7
	//* 111  222:invokevirtual   #172 <Method String JSONObject.toString()>
	//* 112  225:lload           5
	//* 113  227:aconst_null     
	//* 114  228:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//* 115  231:lload           5
	//* 116  233:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//  117  234:astore_1        
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
		return l;
	//* 118  235:goto            219
	}

	public final long zza(zzdm zzdm, TextTrackStyle texttrackstyle)
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          5
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_3        
		zzxb.zza(l, zzdm);
	//    7   14:aload_0         
	//    8   15:getfield        #81  <Field zzdn zzxb>
	//    9   18:lload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject.put("requestId", l);
	//   12   23:aload           5
	//   13   25:ldc1            #148 <String "requestId">
	//   14   27:lload_3         
	//   15   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   31:pop             
		jsonobject.put("type", "EDIT_TRACKS_INFO");
	//   17   32:aload           5
	//   18   34:ldc1            #154 <String "type">
	//   19   36:ldc2            #482 <String "EDIT_TRACKS_INFO">
	//   20   39:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
		if(texttrackstyle == null)
			break MISSING_BLOCK_LABEL_60;
	//   22   43:aload_2         
	//   23   44:ifnull          60
		jsonobject.put("textTrackStyle", ((Object) (texttrackstyle.toJson())));
	//   24   47:aload           5
	//   25   49:ldc2            #484 <String "textTrackStyle">
	//   26   52:aload_2         
	//   27   53:invokevirtual   #487 <Method JSONObject TextTrackStyle.toJson()>
	//   28   56:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   29   59:pop             
		jsonobject.put("mediaSessionId", zzj());
	//   30   60:aload           5
	//   31   62:ldc1            #163 <String "mediaSessionId">
	//   32   64:aload_0         
	//   33   65:invokespecial   #298 <Method long zzj()>
	//   34   68:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   35   71:pop             
_L2:
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
	//   36   72:aload_0         
	//   37   73:aload           5
	//   38   75:invokevirtual   #172 <Method String JSONObject.toString()>
	//   39   78:lload_3         
	//   40   79:aconst_null     
	//   41   80:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
		return l;
	//   42   83:lload_3         
	//   43   84:lreturn         
		zzdm;
	//   44   85:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  45   86:goto            72
	}

	public final long zza(zzdm zzdm, JSONObject jsonobject)
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          5
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_3        
		zzwt.zza(l, zzdm);
	//    7   14:aload_0         
	//    8   15:getfield        #63  <Field zzdn zzwt>
	//    9   18:lload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   12   23:aload           5
	//   13   25:ldc1            #148 <String "requestId">
	//   14   27:lload_3         
	//   15   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   31:pop             
		jsonobject1.put("type", "PAUSE");
	//   17   32:aload           5
	//   18   34:ldc1            #154 <String "type">
	//   19   36:ldc2            #490 <String "PAUSE">
	//   20   39:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   22   43:aload           5
	//   23   45:ldc1            #163 <String "mediaSessionId">
	//   24   47:aload_0         
	//   25   48:invokespecial   #298 <Method long zzj()>
	//   26   51:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   54:pop             
		if(jsonobject != null)
	//*  28   55:aload_2         
	//*  29   56:ifnull          69
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   30   59:aload           5
	//   31   61:ldc2            #350 <String "customData">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   34   68:pop             
			}
	//*  35   69:aload_0         
	//*  36   70:aload           5
	//*  37   72:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  38   75:lload_3         
	//*  39   76:aconst_null     
	//*  40   77:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  41   80:lload_3         
	//*  42   81:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   43   82:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
	//*  44   83:goto            69
	}

	public final long zza(zzdm zzdm, boolean flag, JSONObject jsonobject)
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          6
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore          4
		zzwy.zza(l, zzdm);
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field zzdn zzwy>
	//    9   19:lload           4
	//   10   21:aload_1         
	//   11   22:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   12   25:aload           6
	//   13   27:ldc1            #148 <String "requestId">
	//   14   29:lload           4
	//   15   31:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   34:pop             
		jsonobject1.put("type", "SET_VOLUME");
	//   17   35:aload           6
	//   18   37:ldc1            #154 <String "type">
	//   19   39:ldc2            #341 <String "SET_VOLUME">
	//   20   42:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   22   46:aload           6
	//   23   48:ldc1            #163 <String "mediaSessionId">
	//   24   50:aload_0         
	//   25   51:invokespecial   #298 <Method long zzj()>
	//   26   54:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   57:pop             
		zzdm = ((zzdm) (new JSONObject()));
	//   28   58:new             #136 <Class JSONObject>
	//   29   61:dup             
	//   30   62:invokespecial   #138 <Method void JSONObject()>
	//   31   65:astore_1        
		((JSONObject) (zzdm)).put("muted", flag);
	//   32   66:aload_1         
	//   33   67:ldc2            #493 <String "muted">
	//   34   70:iload_2         
	//   35   71:invokevirtual   #450 <Method JSONObject JSONObject.put(String, boolean)>
	//   36   74:pop             
		jsonobject1.put("volume", ((Object) (zzdm)));
	//   37   75:aload           6
	//   38   77:ldc2            #348 <String "volume">
	//   39   80:aload_1         
	//   40   81:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   41   84:pop             
		if(jsonobject != null)
	//*  42   85:aload_3         
	//*  43   86:ifnull          99
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   44   89:aload           6
	//   45   91:ldc2            #350 <String "customData">
	//   46   94:aload_3         
	//   47   95:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   48   98:pop             
			}
	//*  49   99:aload_0         
	//*  50  100:aload           6
	//*  51  102:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  52  105:lload           4
	//*  53  107:aconst_null     
	//*  54  108:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  55  111:lload           4
	//*  56  113:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   57  114:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
	//*  58  115:goto            99
	}

	public final long zza(zzdm zzdm, int ai[])
		throws zzdk, IllegalArgumentException
	{
		long l;
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          7
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore          5
		zzxh.zza(l, zzdm);
	//    7   15:aload_0         
	//    8   16:getfield        #95  <Field zzdn zzxh>
	//    9   19:lload           5
	//   10   21:aload_1         
	//   11   22:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		int j;
		jsonobject.put("requestId", l);
	//   12   25:aload           7
	//   13   27:ldc1            #148 <String "requestId">
	//   14   29:lload           5
	//   15   31:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   34:pop             
		jsonobject.put("type", "QUEUE_GET_ITEMS");
	//   17   35:aload           7
	//   18   37:ldc1            #154 <String "type">
	//   19   39:ldc2            #496 <String "QUEUE_GET_ITEMS">
	//   20   42:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
		jsonobject.put("mediaSessionId", zzj());
	//   22   46:aload           7
	//   23   48:ldc1            #163 <String "mediaSessionId">
	//   24   50:aload_0         
	//   25   51:invokespecial   #298 <Method long zzj()>
	//   26   54:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   57:pop             
		zzdm = ((zzdm) (new JSONArray()));
	//   28   58:new             #189 <Class JSONArray>
	//   29   61:dup             
	//   30   62:invokespecial   #190 <Method void JSONArray()>
	//   31   65:astore_1        
		j = ai.length;
	//   32   66:aload_2         
	//   33   67:arraylength     
	//   34   68:istore          4
		int i = 0;
	//   35   70:iconst_0        
	//   36   71:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   37   72:iload_3         
	//   38   73:iload           4
	//   39   75:icmpge          93
		((JSONArray) (zzdm)).put(ai[i]);
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:iload_3         
	//   43   81:iaload          
	//   44   82:invokevirtual   #499 <Method JSONArray JSONArray.put(int)>
	//   45   85:pop             
		i++;
	//   46   86:iload_3         
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore_3        
		if(true) goto _L2; else goto _L1
	//   50   90:goto            72
_L1:
		try
		{
			jsonobject.put("itemIds", ((Object) (zzdm)));
	//   51   93:aload           7
	//   52   95:ldc2            #501 <String "itemIds">
	//   53   98:aload_1         
	//   54   99:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   55  102:pop             
		}
	//*  56  103:aload_0         
	//*  57  104:aload           7
	//*  58  106:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  59  109:lload           5
	//*  60  111:aconst_null     
	//*  61  112:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  62  115:lload           5
	//*  63  117:lreturn         
		// Misplaced declaration of an exception variable
		catch(zzdm zzdm) { }
	//   64  118:astore_1        
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
		return l;
	//*  65  119:goto            103
	}

	public final long zza(zzdm zzdm, int ai[], int i, JSONObject jsonobject)
		throws IllegalStateException, zzdk, IllegalArgumentException
	{
		long l;
		JSONObject jsonobject1;
		if(ai == null || ai.length == 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          163
	//*   2    4:aload_2         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
			break MISSING_BLOCK_LABEL_163;
	//    5    9:goto            163
		jsonobject1 = new JSONObject();
	//    6   12:new             #136 <Class JSONObject>
	//    7   15:dup             
	//    8   16:invokespecial   #138 <Method void JSONObject()>
	//    9   19:astore          8
		l = ((zzcm)this).zzco();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #143 <Method long zzcm.zzco()>
	//   12   25:lstore          6
		zzxf.zza(l, zzdm);
	//   13   27:aload_0         
	//   14   28:getfield        #89  <Field zzdn zzxf>
	//   15   31:lload           6
	//   16   33:aload_1         
	//   17   34:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   18   37:aload           8
	//   19   39:ldc1            #148 <String "requestId">
	//   20   41:lload           6
	//   21   43:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   22   46:pop             
		jsonobject1.put("type", "QUEUE_REORDER");
	//   23   47:aload           8
	//   24   49:ldc1            #154 <String "type">
	//   25   51:ldc2            #504 <String "QUEUE_REORDER">
	//   26   54:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   27   57:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   28   58:aload           8
	//   29   60:ldc1            #163 <String "mediaSessionId">
	//   30   62:aload_0         
	//   31   63:invokespecial   #298 <Method long zzj()>
	//   32   66:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   33   69:pop             
		zzdm = ((zzdm) (new JSONArray()));
	//   34   70:new             #189 <Class JSONArray>
	//   35   73:dup             
	//   36   74:invokespecial   #190 <Method void JSONArray()>
	//   37   77:astore_1        
		int j = 0;
	//   38   78:iconst_0        
	//   39   79:istore          5
_L2:
		if(j >= ai.length)
			break; /* Loop/switch isn't completed */
	//   40   81:iload           5
	//   41   83:aload_2         
	//   42   84:arraylength     
	//   43   85:icmpge          108
		((JSONArray) (zzdm)).put(j, ai[j]);
	//   44   88:aload_1         
	//   45   89:iload           5
	//   46   91:aload_2         
	//   47   92:iload           5
	//   48   94:iaload          
	//   49   95:invokevirtual   #507 <Method JSONArray JSONArray.put(int, int)>
	//   50   98:pop             
		j++;
	//   51   99:iload           5
	//   52  101:iconst_1        
	//   53  102:iadd            
	//   54  103:istore          5
		if(true) goto _L2; else goto _L1
	//   55  105:goto            81
_L1:
		jsonobject1.put("itemIds", ((Object) (zzdm)));
	//   56  108:aload           8
	//   57  110:ldc2            #501 <String "itemIds">
	//   58  113:aload_1         
	//   59  114:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   60  117:pop             
		if(i == 0)
			break MISSING_BLOCK_LABEL_132;
	//   61  118:iload_3         
	//   62  119:ifeq            132
		jsonobject1.put("insertBefore", i);
	//   63  122:aload           8
	//   64  124:ldc2            #509 <String "insertBefore">
	//   65  127:iload_3         
	//   66  128:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//   67  131:pop             
		if(jsonobject != null)
	//*  68  132:aload           4
	//*  69  134:ifnull          148
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   70  137:aload           8
	//   71  139:ldc2            #350 <String "customData">
	//   72  142:aload           4
	//   73  144:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   74  147:pop             
			}
	//*  75  148:aload_0         
	//*  76  149:aload           8
	//*  77  151:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  78  154:lload           6
	//*  79  156:aconst_null     
	//*  80  157:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  81  160:lload           6
	//*  82  162:lreturn         
	//*  83  163:new             #330 <Class IllegalArgumentException>
	//*  84  166:dup             
	//*  85  167:ldc2            #511 <String "itemIdsToReorder must not be null or empty.">
	//*  86  170:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//*  87  173:athrow          
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   88  174:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
		throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
	//*  89  175:goto            148
	}

	public final long zza(zzdm zzdm, int ai[], JSONObject jsonobject)
		throws IllegalStateException, zzdk, IllegalArgumentException
	{
		long l;
		JSONObject jsonobject1;
		if(ai == null || ai.length == 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          147
	//*   2    4:aload_2         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
			break MISSING_BLOCK_LABEL_147;
	//    5    9:goto            147
		jsonobject1 = new JSONObject();
	//    6   12:new             #136 <Class JSONObject>
	//    7   15:dup             
	//    8   16:invokespecial   #138 <Method void JSONObject()>
	//    9   19:astore          7
		l = ((zzcm)this).zzco();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #143 <Method long zzcm.zzco()>
	//   12   25:lstore          5
		zzxe.zza(l, zzdm);
	//   13   27:aload_0         
	//   14   28:getfield        #87  <Field zzdn zzxe>
	//   15   31:lload           5
	//   16   33:aload_1         
	//   17   34:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   18   37:aload           7
	//   19   39:ldc1            #148 <String "requestId">
	//   20   41:lload           5
	//   21   43:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   22   46:pop             
		jsonobject1.put("type", "QUEUE_REMOVE");
	//   23   47:aload           7
	//   24   49:ldc1            #154 <String "type">
	//   25   51:ldc2            #514 <String "QUEUE_REMOVE">
	//   26   54:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   27   57:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   28   58:aload           7
	//   29   60:ldc1            #163 <String "mediaSessionId">
	//   30   62:aload_0         
	//   31   63:invokespecial   #298 <Method long zzj()>
	//   32   66:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   33   69:pop             
		zzdm = ((zzdm) (new JSONArray()));
	//   34   70:new             #189 <Class JSONArray>
	//   35   73:dup             
	//   36   74:invokespecial   #190 <Method void JSONArray()>
	//   37   77:astore_1        
		int i = 0;
	//   38   78:iconst_0        
	//   39   79:istore          4
_L2:
		if(i >= ai.length)
			break; /* Loop/switch isn't completed */
	//   40   81:iload           4
	//   41   83:aload_2         
	//   42   84:arraylength     
	//   43   85:icmpge          108
		((JSONArray) (zzdm)).put(i, ai[i]);
	//   44   88:aload_1         
	//   45   89:iload           4
	//   46   91:aload_2         
	//   47   92:iload           4
	//   48   94:iaload          
	//   49   95:invokevirtual   #507 <Method JSONArray JSONArray.put(int, int)>
	//   50   98:pop             
		i++;
	//   51   99:iload           4
	//   52  101:iconst_1        
	//   53  102:iadd            
	//   54  103:istore          4
		if(true) goto _L2; else goto _L1
	//   55  105:goto            81
_L1:
		jsonobject1.put("itemIds", ((Object) (zzdm)));
	//   56  108:aload           7
	//   57  110:ldc2            #501 <String "itemIds">
	//   58  113:aload_1         
	//   59  114:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   60  117:pop             
		if(jsonobject != null)
	//*  61  118:aload_3         
	//*  62  119:ifnull          132
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   63  122:aload           7
	//   64  124:ldc2            #350 <String "customData">
	//   65  127:aload_3         
	//   66  128:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   67  131:pop             
			}
	//*  68  132:aload_0         
	//*  69  133:aload           7
	//*  70  135:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  71  138:lload           5
	//*  72  140:aconst_null     
	//*  73  141:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  74  144:lload           5
	//*  75  146:lreturn         
	//*  76  147:new             #330 <Class IllegalArgumentException>
	//*  77  150:dup             
	//*  78  151:ldc2            #516 <String "itemIdsToRemove must not be null or empty.">
	//*  79  154:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//*  80  157:athrow          
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   81  158:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
		throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
	//*  82  159:goto            132
	}

	public final long zza(zzdm zzdm, long al[])
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          6
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore          4
		zzxa.zza(l, zzdm);
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field zzdn zzxa>
	//    9   19:lload           4
	//   10   21:aload_1         
	//   11   22:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject.put("requestId", l);
	//   12   25:aload           6
	//   13   27:ldc1            #148 <String "requestId">
	//   14   29:lload           4
	//   15   31:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   34:pop             
		jsonobject.put("type", "EDIT_TRACKS_INFO");
	//   17   35:aload           6
	//   18   37:ldc1            #154 <String "type">
	//   19   39:ldc2            #482 <String "EDIT_TRACKS_INFO">
	//   20   42:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
		jsonobject.put("mediaSessionId", zzj());
	//   22   46:aload           6
	//   23   48:ldc1            #163 <String "mediaSessionId">
	//   24   50:aload_0         
	//   25   51:invokespecial   #298 <Method long zzj()>
	//   26   54:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   57:pop             
		zzdm = ((zzdm) (new JSONArray()));
	//   28   58:new             #189 <Class JSONArray>
	//   29   61:dup             
	//   30   62:invokespecial   #190 <Method void JSONArray()>
	//   31   65:astore_1        
		int i = 0;
	//   32   66:iconst_0        
	//   33   67:istore_3        
_L2:
		if(i >= al.length)
			break; /* Loop/switch isn't completed */
	//   34   68:iload_3         
	//   35   69:aload_2         
	//   36   70:arraylength     
	//   37   71:icmpge          90
		((JSONArray) (zzdm)).put(i, al[i]);
	//   38   74:aload_1         
	//   39   75:iload_3         
	//   40   76:aload_2         
	//   41   77:iload_3         
	//   42   78:laload          
	//   43   79:invokevirtual   #473 <Method JSONArray JSONArray.put(int, long)>
	//   44   82:pop             
		i++;
	//   45   83:iload_3         
	//   46   84:iconst_1        
	//   47   85:iadd            
	//   48   86:istore_3        
		if(true) goto _L2; else goto _L1
	//   49   87:goto            68
_L1:
		try
		{
			jsonobject.put("activeTrackIds", ((Object) (zzdm)));
	//   50   90:aload           6
	//   51   92:ldc2            #475 <String "activeTrackIds">
	//   52   95:aload_1         
	//   53   96:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   54   99:pop             
		}
	//*  55  100:aload_0         
	//*  56  101:aload           6
	//*  57  103:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  58  106:lload           4
	//*  59  108:aconst_null     
	//*  60  109:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  61  112:lload           4
	//*  62  114:lreturn         
		// Misplaced declaration of an exception variable
		catch(zzdm zzdm) { }
	//   63  115:astore_1        
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
		return l;
	//*  64  116:goto            100
	}

	public final long zza(zzdm zzdm, MediaQueueItem amediaqueueitem[], int i, int j, int k, long l, 
			JSONObject jsonobject)
		throws IllegalStateException, zzdk, IllegalArgumentException
	{
		long l1;
		JSONObject jsonobject1;
		if(amediaqueueitem == null || amediaqueueitem.length == 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          316
	//*   2    4:aload_2         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
			break MISSING_BLOCK_LABEL_316;
	//    5    9:goto            316
		j = 0;
	//    6   12:iconst_0        
	//    7   13:istore          4
		if(k != -1 && (k < 0 || k >= amediaqueueitem.length))
	//*   8   15:iload           5
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          70
	//*  11   21:iload           5
	//*  12   23:iflt            33
	//*  13   26:iload           5
	//*  14   28:aload_2         
	//*  15   29:arraylength     
	//*  16   30:icmplt          70
			throw new IllegalArgumentException(String.format(Locale.ROOT, "currentItemIndexInItemsToInsert %d out of range [0, %d).", new Object[] {
				Integer.valueOf(k), Integer.valueOf(amediaqueueitem.length)
			}));
	//   17   33:new             #330 <Class IllegalArgumentException>
	//   18   36:dup             
	//   19   37:getstatic       #308 <Field Locale Locale.ROOT>
	//   20   40:ldc2            #520 <String "currentItemIndexInItemsToInsert %d out of range [0, %d).">
	//   21   43:iconst_2        
	//   22   44:anewarray       Object[]
	//   23   47:dup             
	//   24   48:iconst_0        
	//   25   49:iload           5
	//   26   51:invokestatic    #524 <Method Integer Integer.valueOf(int)>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_1        
	//   30   57:aload_2         
	//   31   58:arraylength     
	//   32   59:invokestatic    #524 <Method Integer Integer.valueOf(int)>
	//   33   62:aastore         
	//   34   63:invokestatic    #321 <Method String String.format(Locale, String, Object[])>
	//   35   66:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//   36   69:athrow          
		if(l != -1L && l < 0L)
	//*  37   70:lload           6
	//*  38   72:ldc2w           #383 <Long -1L>
	//*  39   75:lcmp            
	//*  40   76:ifeq            123
	//*  41   79:lload           6
	//*  42   81:lconst_0        
	//*  43   82:lcmp            
	//*  44   83:ifge            123
		{
			zzdm = ((zzdm) (new StringBuilder(54)));
	//   45   86:new             #352 <Class StringBuilder>
	//   46   89:dup             
	//   47   90:bipush          54
	//   48   92:invokespecial   #355 <Method void StringBuilder(int)>
	//   49   95:astore_1        
			((StringBuilder) (zzdm)).append("playPosition can not be negative: ");
	//   50   96:aload_1         
	//   51   97:ldc2            #526 <String "playPosition can not be negative: ">
	//   52  100:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
			((StringBuilder) (zzdm)).append(l);
	//   54  104:aload_1         
	//   55  105:lload           6
	//   56  107:invokevirtual   #389 <Method StringBuilder StringBuilder.append(long)>
	//   57  110:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzdm)).toString());
	//   58  111:new             #330 <Class IllegalArgumentException>
	//   59  114:dup             
	//   60  115:aload_1         
	//   61  116:invokevirtual   #365 <Method String StringBuilder.toString()>
	//   62  119:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//   63  122:athrow          
		}
		jsonobject1 = new JSONObject();
	//   64  123:new             #136 <Class JSONObject>
	//   65  126:dup             
	//   66  127:invokespecial   #138 <Method void JSONObject()>
	//   67  130:astore          11
		l1 = ((zzcm)this).zzco();
	//   68  132:aload_0         
	//   69  133:invokevirtual   #143 <Method long zzcm.zzco()>
	//   70  136:lstore          9
		zzxc.zza(l1, zzdm);
	//   71  138:aload_0         
	//   72  139:getfield        #83  <Field zzdn zzxc>
	//   73  142:lload           9
	//   74  144:aload_1         
	//   75  145:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l1);
	//   76  148:aload           11
	//   77  150:ldc1            #148 <String "requestId">
	//   78  152:lload           9
	//   79  154:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   80  157:pop             
		jsonobject1.put("type", "QUEUE_INSERT");
	//   81  158:aload           11
	//   82  160:ldc1            #154 <String "type">
	//   83  162:ldc2            #528 <String "QUEUE_INSERT">
	//   84  165:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   85  168:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   86  169:aload           11
	//   87  171:ldc1            #163 <String "mediaSessionId">
	//   88  173:aload_0         
	//   89  174:invokespecial   #298 <Method long zzj()>
	//   90  177:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   91  180:pop             
		zzdm = ((zzdm) (new JSONArray()));
	//   92  181:new             #189 <Class JSONArray>
	//   93  184:dup             
	//   94  185:invokespecial   #190 <Method void JSONArray()>
	//   95  188:astore_1        
_L1:
		if(j >= amediaqueueitem.length)
			break MISSING_BLOCK_LABEL_219;
	//   96  189:iload           4
	//   97  191:aload_2         
	//   98  192:arraylength     
	//   99  193:icmpge          219
		((JSONArray) (zzdm)).put(j, ((Object) (amediaqueueitem[j].toJson())));
	//  100  196:aload_1         
	//  101  197:iload           4
	//  102  199:aload_2         
	//  103  200:iload           4
	//  104  202:aaload          
	//  105  203:invokevirtual   #398 <Method JSONObject MediaQueueItem.toJson()>
	//  106  206:invokevirtual   #207 <Method JSONArray JSONArray.put(int, Object)>
	//  107  209:pop             
		j++;
	//  108  210:iload           4
	//  109  212:iconst_1        
	//  110  213:iadd            
	//  111  214:istore          4
		  goto _L1
	//* 112  216:goto            189
		jsonobject1.put("items", ((Object) (zzdm)));
	//  113  219:aload           11
	//  114  221:ldc2            #400 <String "items">
	//  115  224:aload_1         
	//  116  225:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//  117  228:pop             
		if(i == 0)
			break MISSING_BLOCK_LABEL_243;
	//  118  229:iload_3         
	//  119  230:ifeq            243
		jsonobject1.put("insertBefore", i);
	//  120  233:aload           11
	//  121  235:ldc2            #509 <String "insertBefore">
	//  122  238:iload_3         
	//  123  239:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//  124  242:pop             
		if(k == -1)
			break MISSING_BLOCK_LABEL_260;
	//  125  243:iload           5
	//  126  245:iconst_m1       
	//  127  246:icmpeq          260
		jsonobject1.put("currentItemIndex", k);
	//  128  249:aload           11
	//  129  251:ldc2            #530 <String "currentItemIndex">
	//  130  254:iload           5
	//  131  256:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//  132  259:pop             
		if(l == -1L)
			break MISSING_BLOCK_LABEL_285;
	//  133  260:lload           6
	//  134  262:ldc2w           #383 <Long -1L>
	//  135  265:lcmp            
	//  136  266:ifeq            285
		jsonobject1.put("currentTime", (double)l / 1000D);
	//  137  269:aload           11
	//  138  271:ldc2            #409 <String "currentTime">
	//  139  274:lload           6
	//  140  276:l2d             
	//  141  277:ldc2w           #410 <Double 1000D>
	//  142  280:ddiv            
	//  143  281:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//  144  284:pop             
		if(jsonobject != null)
	//* 145  285:aload           8
	//* 146  287:ifnull          301
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//  147  290:aload           11
	//  148  292:ldc2            #350 <String "customData">
	//  149  295:aload           8
	//  150  297:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//  151  300:pop             
			}
	//* 152  301:aload_0         
	//* 153  302:aload           11
	//* 154  304:invokevirtual   #172 <Method String JSONObject.toString()>
	//* 155  307:lload           9
	//* 156  309:aconst_null     
	//* 157  310:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//* 158  313:lload           9
	//* 159  315:lreturn         
	//* 160  316:new             #330 <Class IllegalArgumentException>
	//* 161  319:dup             
	//* 162  320:ldc2            #532 <String "itemsToInsert must not be null or empty.">
	//* 163  323:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//* 164  326:athrow          
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//  165  327:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l1, ((String) (null)));
		return l1;
		throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
	//* 166  328:goto            301
	}

	public final long zza(zzdm zzdm, MediaQueueItem amediaqueueitem[], int i, int j, long l, JSONObject jsonobject)
		throws IllegalStateException, IllegalArgumentException
	{
		if(amediaqueueitem != null && amediaqueueitem.length != 0) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          366
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:ifne            12
	//*   5    9:goto            366
_L2:
		if(i >= 0 && i < amediaqueueitem.length) goto _L4; else goto _L3
	//    6   12:iload_3         
	//    7   13:iflt            330
	//    8   16:iload_3         
	//    9   17:aload_2         
	//   10   18:arraylength     
	//   11   19:icmplt          25
	//*  12   22:goto            330
_L4:
		long l1;
		JSONObject jsonobject1;
		if(l != -1L && l < 0L)
	//*  13   25:lload           5
	//*  14   27:ldc2w           #383 <Long -1L>
	//*  15   30:lcmp            
	//*  16   31:ifeq            78
	//*  17   34:lload           5
	//*  18   36:lconst_0        
	//*  19   37:lcmp            
	//*  20   38:ifge            78
		{
			zzdm = ((zzdm) (new StringBuilder(54)));
	//   21   41:new             #352 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:bipush          54
	//   24   47:invokespecial   #355 <Method void StringBuilder(int)>
	//   25   50:astore_1        
			((StringBuilder) (zzdm)).append("playPosition can not be negative: ");
	//   26   51:aload_1         
	//   27   52:ldc2            #526 <String "playPosition can not be negative: ">
	//   28   55:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			((StringBuilder) (zzdm)).append(l);
	//   30   59:aload_1         
	//   31   60:lload           5
	//   32   62:invokevirtual   #389 <Method StringBuilder StringBuilder.append(long)>
	//   33   65:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzdm)).toString());
	//   34   66:new             #330 <Class IllegalArgumentException>
	//   35   69:dup             
	//   36   70:aload_1         
	//   37   71:invokevirtual   #365 <Method String StringBuilder.toString()>
	//   38   74:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//   39   77:athrow          
		}
		jsonobject1 = new JSONObject();
	//   40   78:new             #136 <Class JSONObject>
	//   41   81:dup             
	//   42   82:invokespecial   #138 <Method void JSONObject()>
	//   43   85:astore          11
		l1 = ((zzcm)this).zzco();
	//   44   87:aload_0         
	//   45   88:invokevirtual   #143 <Method long zzcm.zzco()>
	//   46   91:lstore          9
		zzws.zza(l1, zzdm);
	//   47   93:aload_0         
	//   48   94:getfield        #61  <Field zzdn zzws>
	//   49   97:lload           9
	//   50   99:aload_1         
	//   51  100:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l1);
	//   52  103:aload           11
	//   53  105:ldc1            #148 <String "requestId">
	//   54  107:lload           9
	//   55  109:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   56  112:pop             
		jsonobject1.put("type", "QUEUE_LOAD");
	//   57  113:aload           11
	//   58  115:ldc1            #154 <String "type">
	//   59  117:ldc2            #535 <String "QUEUE_LOAD">
	//   60  120:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   61  123:pop             
		zzdm = ((zzdm) (new JSONArray()));
	//   62  124:new             #189 <Class JSONArray>
	//   63  127:dup             
	//   64  128:invokespecial   #190 <Method void JSONArray()>
	//   65  131:astore_1        
		int k = 0;
	//   66  132:iconst_0        
	//   67  133:istore          8
_L6:
		if(k >= amediaqueueitem.length)
			break; /* Loop/switch isn't completed */
	//   68  135:iload           8
	//   69  137:aload_2         
	//   70  138:arraylength     
	//   71  139:icmpge          165
		((JSONArray) (zzdm)).put(k, ((Object) (amediaqueueitem[k].toJson())));
	//   72  142:aload_1         
	//   73  143:iload           8
	//   74  145:aload_2         
	//   75  146:iload           8
	//   76  148:aaload          
	//   77  149:invokevirtual   #398 <Method JSONObject MediaQueueItem.toJson()>
	//   78  152:invokevirtual   #207 <Method JSONArray JSONArray.put(int, Object)>
	//   79  155:pop             
		k++;
	//   80  156:iload           8
	//   81  158:iconst_1        
	//   82  159:iadd            
	//   83  160:istore          8
		if(true) goto _L6; else goto _L5
	//   84  162:goto            135
_L5:
		jsonobject1.put("items", ((Object) (zzdm)));
	//   85  165:aload           11
	//   86  167:ldc2            #400 <String "items">
	//   87  170:aload_1         
	//   88  171:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   89  174:pop             
		j;
	//   90  175:iload           4
		JVM INSTR tableswitch 0 3: default 381
	//	               0 405
	//	               1 398
	//	               2 391
	//	               3 384;
	//   91  177:tableswitch     0 3: default 381
	//	               0 405
	//	               1 398
	//	               2 391
	//	               3 384
		   goto _L7 _L8 _L9 _L10 _L11
	//*  92  208:goto            278
_L13:
		jsonobject1.put("repeatMode", ((Object) (zzdm)));
	//   93  211:aload           11
	//   94  213:ldc2            #407 <String "repeatMode">
	//   95  216:aload_1         
	//   96  217:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   97  220:pop             
	//*  98  221:goto            224
		jsonobject1.put("startIndex", i);
	//   99  224:aload           11
	//  100  226:ldc2            #537 <String "startIndex">
	//  101  229:iload_3         
	//  102  230:invokevirtual   #375 <Method JSONObject JSONObject.put(String, int)>
	//  103  233:pop             
		if(l == -1L)
			break MISSING_BLOCK_LABEL_259;
	//  104  234:lload           5
	//  105  236:ldc2w           #383 <Long -1L>
	//  106  239:lcmp            
	//  107  240:ifeq            259
		jsonobject1.put("currentTime", (double)l / 1000D);
	//  108  243:aload           11
	//  109  245:ldc2            #409 <String "currentTime">
	//  110  248:lload           5
	//  111  250:l2d             
	//  112  251:ldc2w           #410 <Double 1000D>
	//  113  254:ddiv            
	//  114  255:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//  115  258:pop             
		break MISSING_BLOCK_LABEL_259;
	//* 116  259:aload           7
	//* 117  261:ifnull          315
	//* 118  264:aload           11
	//* 119  266:ldc2            #350 <String "customData">
	//* 120  269:aload           7
	//* 121  271:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//* 122  274:pop             
	//* 123  275:goto            315
_L7:
		zzdm = ((zzdm) (new StringBuilder(32)));
	//  124  278:new             #352 <Class StringBuilder>
	//  125  281:dup             
	//  126  282:bipush          32
	//  127  284:invokespecial   #355 <Method void StringBuilder(int)>
	//  128  287:astore_1        
		((StringBuilder) (zzdm)).append("Invalid repeat mode: ");
	//  129  288:aload_1         
	//  130  289:ldc2            #539 <String "Invalid repeat mode: ">
	//  131  292:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//  132  295:pop             
		((StringBuilder) (zzdm)).append(j);
	//  133  296:aload_1         
	//  134  297:iload           4
	//  135  299:invokevirtual   #542 <Method StringBuilder StringBuilder.append(int)>
	//  136  302:pop             
		throw new IllegalArgumentException(((StringBuilder) (zzdm)).toString());
	//  137  303:new             #330 <Class IllegalArgumentException>
	//  138  306:dup             
	//  139  307:aload_1         
	//  140  308:invokevirtual   #365 <Method String StringBuilder.toString()>
	//  141  311:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//  142  314:athrow          
		if(jsonobject != null)
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
			}
	//* 143  315:aload_0         
	//* 144  316:aload           11
	//* 145  318:invokevirtual   #172 <Method String JSONObject.toString()>
	//* 146  321:lload           9
	//* 147  323:aconst_null     
	//* 148  324:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//* 149  327:lload           9
	//* 150  329:lreturn         
	//* 151  330:new             #352 <Class StringBuilder>
	//* 152  333:dup             
	//* 153  334:bipush          31
	//* 154  336:invokespecial   #355 <Method void StringBuilder(int)>
	//* 155  339:astore_1        
	//* 156  340:aload_1         
	//* 157  341:ldc2            #544 <String "Invalid startIndex: ">
	//* 158  344:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//* 159  347:pop             
	//* 160  348:aload_1         
	//* 161  349:iload_3         
	//* 162  350:invokevirtual   #542 <Method StringBuilder StringBuilder.append(int)>
	//* 163  353:pop             
	//* 164  354:new             #330 <Class IllegalArgumentException>
	//* 165  357:dup             
	//* 166  358:aload_1         
	//* 167  359:invokevirtual   #365 <Method String StringBuilder.toString()>
	//* 168  362:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//* 169  365:athrow          
	//* 170  366:new             #330 <Class IllegalArgumentException>
	//* 171  369:dup             
	//* 172  370:ldc2            #546 <String "items must not be null or empty.">
	//* 173  373:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//* 174  376:athrow          
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//  175  377:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l1, ((String) (null)));
		return l1;
_L3:
		zzdm = ((zzdm) (new StringBuilder(31)));
		((StringBuilder) (zzdm)).append("Invalid startIndex: ");
		((StringBuilder) (zzdm)).append(i);
		throw new IllegalArgumentException(((StringBuilder) (zzdm)).toString());
_L1:
		throw new IllegalArgumentException("items must not be null or empty.");
	//* 176  378:goto            315
	//* 177  381:goto            208
_L11:
		zzdm = "REPEAT_ALL_AND_SHUFFLE";
	//  178  384:ldc2            #413 <String "REPEAT_ALL_AND_SHUFFLE">
	//  179  387:astore_1        
		continue; /* Loop/switch isn't completed */
	//  180  388:goto            211
_L10:
		zzdm = "REPEAT_SINGLE";
	//  181  391:ldc2            #415 <String "REPEAT_SINGLE">
	//  182  394:astore_1        
		continue; /* Loop/switch isn't completed */
	//  183  395:goto            211
_L9:
		zzdm = "REPEAT_ALL";
	//  184  398:ldc2            #417 <String "REPEAT_ALL">
	//  185  401:astore_1        
		continue; /* Loop/switch isn't completed */
	//  186  402:goto            211
_L8:
		zzdm = "REPEAT_OFF";
	//  187  405:ldc2            #419 <String "REPEAT_OFF">
	//  188  408:astore_1        
		if(true) goto _L13; else goto _L12
	//  189  409:goto            211
_L12:
	}

	public final void zza(long l, int i)
	{
		for(Iterator iterator = ((zzcg)this).zzcn().iterator(); iterator.hasNext(); ((zzdn)iterator.next()).zzc(l, i, ((Object) (null))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #228 <Method List zzcg.zzcn()>
	//    2    4:invokeinterface #232 <Method Iterator List.iterator()>
	//    3    9:astore          4
	//    4   11:aload           4
	//    5   13:invokeinterface #237 <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            41
	//    7   21:aload           4
	//    8   23:invokeinterface #241 <Method Object Iterator.next()>
	//    9   28:checkcast       #54  <Class zzdn>
	//   10   31:lload_1         
	//   11   32:iload_3         
	//   12   33:aconst_null     
	//   13   34:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//   14   37:pop             
	//*  15   38:goto            11
	//   16   41:return          
	}

	public final void zza(zzdj zzdj1)
	{
		zzwr = zzdj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field zzdj zzwr>
	//    3    5:return          
	}

	public final long zzb(zzdm zzdm)
		throws IllegalStateException
	{
		return zza(zzdm, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #247 <Method long zza(zzdm, boolean)>
	//    4    6:lreturn         
	}

	public final long zzb(zzdm zzdm, double d, JSONObject jsonobject)
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject1;
		if(zzwq == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field MediaStatus zzwq>
	//*   2    4:ifnonnull       15
			throw new zzdk();
	//    3    7:new             #249 <Class zzdk>
	//    4   10:dup             
	//    5   11:invokespecial   #250 <Method void zzdk()>
	//    6   14:athrow          
		jsonobject1 = new JSONObject();
	//    7   15:new             #136 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #138 <Method void JSONObject()>
	//   10   22:astore          7
		l = ((zzcm)this).zzco();
	//   11   24:aload_0         
	//   12   25:invokevirtual   #143 <Method long zzcm.zzco()>
	//   13   28:lstore          5
		zzxj.zza(l, zzdm);
	//   14   30:aload_0         
	//   15   31:getfield        #97  <Field zzdn zzxj>
	//   16   34:lload           5
	//   17   36:aload_1         
	//   18   37:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   19   40:aload           7
	//   20   42:ldc1            #148 <String "requestId">
	//   21   44:lload           5
	//   22   46:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   23   49:pop             
		jsonobject1.put("type", "SET_PLAYBACK_RATE");
	//   24   50:aload           7
	//   25   52:ldc1            #154 <String "type">
	//   26   54:ldc2            #554 <String "SET_PLAYBACK_RATE">
	//   27   57:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   28   60:pop             
		jsonobject1.put("playbackRate", d);
	//   29   61:aload           7
	//   30   63:ldc2            #455 <String "playbackRate">
	//   31   66:dload_2         
	//   32   67:invokevirtual   #346 <Method JSONObject JSONObject.put(String, double)>
	//   33   70:pop             
		jsonobject1.put("mediaSessionId", zzwq.zzj());
	//   34   71:aload           7
	//   35   73:ldc1            #163 <String "mediaSessionId">
	//   36   75:aload_0         
	//   37   76:getfield        #161 <Field MediaStatus zzwq>
	//   38   79:invokevirtual   #168 <Method long MediaStatus.zzj()>
	//   39   82:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   40   85:pop             
		if(jsonobject != null)
	//*  41   86:aload           4
	//*  42   88:ifnull          102
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   43   91:aload           7
	//   44   93:ldc2            #350 <String "customData">
	//   45   96:aload           4
	//   46   98:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   47  101:pop             
			}
	//*  48  102:aload_0         
	//*  49  103:aload           7
	//*  50  105:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  51  108:lload           5
	//*  52  110:aconst_null     
	//*  53  111:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  54  114:lload           5
	//*  55  116:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   56  117:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
	//*  57  118:goto            102
	}

	public final long zzb(zzdm zzdm, JSONObject jsonobject)
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          5
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_3        
		zzwv.zza(l, zzdm);
	//    7   14:aload_0         
	//    8   15:getfield        #67  <Field zzdn zzwv>
	//    9   18:lload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   12   23:aload           5
	//   13   25:ldc1            #148 <String "requestId">
	//   14   27:lload_3         
	//   15   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   31:pop             
		jsonobject1.put("type", "STOP");
	//   17   32:aload           5
	//   18   34:ldc1            #154 <String "type">
	//   19   36:ldc2            #556 <String "STOP">
	//   20   39:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   22   43:aload           5
	//   23   45:ldc1            #163 <String "mediaSessionId">
	//   24   47:aload_0         
	//   25   48:invokespecial   #298 <Method long zzj()>
	//   26   51:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   54:pop             
		if(jsonobject != null)
	//*  28   55:aload_2         
	//*  29   56:ifnull          69
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   30   59:aload           5
	//   31   61:ldc2            #350 <String "customData">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   34   68:pop             
			}
	//*  35   69:aload_0         
	//*  36   70:aload           5
	//*  37   72:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  38   75:lload_3         
	//*  39   76:aconst_null     
	//*  40   77:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  41   80:lload_3         
	//*  42   81:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   43   82:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
	//*  44   83:goto            69
	}

	public final long zzb(String s, List list)
		throws IllegalStateException
	{
		long l = ((zzcm)this).zzco();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method long zzcm.zzco()>
	//    2    4:lstore_3        
		((zzcm)this).zza(zza(s, list, l), l, ((String) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:lload_3         
	//    7    9:invokestatic    #559 <Method String zza(String, List, long)>
	//    8   12:lload_3         
	//    9   13:aconst_null     
	//   10   14:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
		return l;
	//   11   17:lload_3         
	//   12   18:lreturn         
	}

	public final long zzc(zzdm zzdm)
		throws zzdk, IllegalStateException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          4
		long l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_2        
		zzxg.zza(l, zzdm);
	//    7   14:aload_0         
	//    8   15:getfield        #91  <Field zzdn zzxg>
	//    9   18:lload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		try
		{
			jsonobject.put("requestId", l);
	//   12   23:aload           4
	//   13   25:ldc1            #148 <String "requestId">
	//   14   27:lload_2         
	//   15   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   31:pop             
			jsonobject.put("type", "QUEUE_GET_ITEM_IDS");
	//   17   32:aload           4
	//   18   34:ldc1            #154 <String "type">
	//   19   36:ldc2            #562 <String "QUEUE_GET_ITEM_IDS">
	//   20   39:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
			jsonobject.put("mediaSessionId", zzj());
	//   22   43:aload           4
	//   23   45:ldc1            #163 <String "mediaSessionId">
	//   24   47:aload_0         
	//   25   48:invokespecial   #298 <Method long zzj()>
	//   26   51:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   54:pop             
		}
	//*  28   55:aload_0         
	//*  29   56:aload           4
	//*  30   58:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  31   61:lload_2         
	//*  32   62:aconst_null     
	//*  33   63:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  34   66:lload_2         
	//*  35   67:lreturn         
		// Misplaced declaration of an exception variable
		catch(zzdm zzdm) { }
	//   36   68:astore_1        
		((zzcm)this).zza(jsonobject.toString(), l, ((String) (null)));
		return l;
	//*  37   69:goto            55
	}

	public final long zzc(zzdm zzdm, JSONObject jsonobject)
		throws IllegalStateException, zzdk
	{
		long l;
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject();
	//    0    0:new             #136 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void JSONObject()>
	//    3    7:astore          5
		l = ((zzcm)this).zzco();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #143 <Method long zzcm.zzco()>
	//    6   13:lstore_3        
		zzwu.zza(l, zzdm);
	//    7   14:aload_0         
	//    8   15:getfield        #65  <Field zzdn zzwu>
	//    9   18:lload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #146 <Method void zzdn.zza(long, zzdm)>
		jsonobject1.put("requestId", l);
	//   12   23:aload           5
	//   13   25:ldc1            #148 <String "requestId">
	//   14   27:lload_3         
	//   15   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   16   31:pop             
		jsonobject1.put("type", "PLAY");
	//   17   32:aload           5
	//   18   34:ldc1            #154 <String "type">
	//   19   36:ldc2            #564 <String "PLAY">
	//   20   39:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
		jsonobject1.put("mediaSessionId", zzj());
	//   22   43:aload           5
	//   23   45:ldc1            #163 <String "mediaSessionId">
	//   24   47:aload_0         
	//   25   48:invokespecial   #298 <Method long zzj()>
	//   26   51:invokevirtual   #152 <Method JSONObject JSONObject.put(String, long)>
	//   27   54:pop             
		if(jsonobject != null)
	//*  28   55:aload_2         
	//*  29   56:ifnull          69
			try
			{
				jsonobject1.put("customData", ((Object) (jsonobject)));
	//   30   59:aload           5
	//   31   61:ldc2            #350 <String "customData">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #159 <Method JSONObject JSONObject.put(String, Object)>
	//   34   68:pop             
			}
	//*  35   69:aload_0         
	//*  36   70:aload           5
	//*  37   72:invokevirtual   #172 <Method String JSONObject.toString()>
	//*  38   75:lload_3         
	//*  39   76:aconst_null     
	//*  40   77:invokevirtual   #175 <Method void zzcm.zza(String, long, String)>
	//*  41   80:lload_3         
	//*  42   81:lreturn         
			// Misplaced declaration of an exception variable
			catch(zzdm zzdm) { }
	//   43   82:astore_1        
		((zzcm)this).zza(jsonobject1.toString(), l, ((String) (null)));
		return l;
	//*  44   83:goto            69
	}

	public final void zzcm()
	{
		super.zzcm();
	//    0    0:aload_0         
	//    1    1:invokespecial   #567 <Method void zzcg.zzcm()>
		zzcz();
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void zzcz()>
	//    4    8:return          
	}

	public final void zzn(String s)
	{
		zzuv.d("message received: %s", new Object[] {
			s
		});
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field zzdg zzuv>
	//    2    4:ldc2            #570 <String "message received: %s">
	//    3    7:iconst_1        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:aastore         
	//    9   15:invokevirtual   #573 <Method void zzdg.d(String, Object[])>
		int i;
		long l;
		Object obj;
		String s1;
		obj = ((Object) (new JSONObject(s)));
	//   10   18:new             #136 <Class JSONObject>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokespecial   #574 <Method void JSONObject(String)>
	//   14   26:astore          8
		s1 = ((JSONObject) (obj)).getString("type");
	//   15   28:aload           8
	//   16   30:ldc1            #154 <String "type">
	//   17   32:invokevirtual   #577 <Method String JSONObject.getString(String)>
	//   18   35:astore          9
		l = ((JSONObject) (obj)).optLong("requestId", -1L);
	//   19   37:aload           8
	//   20   39:ldc1            #148 <String "requestId">
	//   21   41:ldc2w           #383 <Long -1L>
	//   22   44:invokevirtual   #581 <Method long JSONObject.optLong(String, long)>
	//   23   47:lstore          5
		i = s1.hashCode();
	//   24   49:aload           9
	//   25   51:invokevirtual   #584 <Method int String.hashCode()>
	//   26   54:istore_2        
		byte byte0 = 3;
	//   27   55:iconst_3        
	//   28   56:istore_3        
		i;
	//   29   57:iload_2         
		JVM INSTR lookupswitch 8: default 1216
	//	               -1830647528: 246
	//	               -1790231854: 229
	//	               -1125000185: 213
	//	               -262628938: 197
	//	               154411710: 180
	//	               431600379: 164
	//	               823510221: 148
	//	               2107149050: 132;
	//   30   58:lookupswitch    8: default 1216
	//	               -1830647528: 246
	//	               -1790231854: 229
	//	               -1125000185: 213
	//	               -262628938: 197
	//	               154411710: 180
	//	               431600379: 164
	//	               823510221: 148
	//	               2107149050: 132
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
		if(!s1.equals("QUEUE_ITEM_IDS")) goto _L1; else goto _L10
	//   31  132:aload           9
	//   32  134:ldc2            #586 <String "QUEUE_ITEM_IDS">
	//   33  137:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   34  140:ifeq            1216
_L10:
		i = 5;
	//   35  143:iconst_5        
	//   36  144:istore_2        
		  goto _L11
	//*  37  145:goto            1218
_L8:
		if(!s1.equals("MEDIA_STATUS")) goto _L1; else goto _L12
	//   38  148:aload           9
	//   39  150:ldc2            #592 <String "MEDIA_STATUS">
	//   40  153:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   41  156:ifeq            1216
_L12:
		i = 0;
	//   42  159:iconst_0        
	//   43  160:istore_2        
		  goto _L11
	//*  44  161:goto            1218
_L7:
		if(!s1.equals("INVALID_PLAYER_STATE")) goto _L1; else goto _L13
	//   45  164:aload           9
	//   46  166:ldc2            #594 <String "INVALID_PLAYER_STATE">
	//   47  169:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   48  172:ifeq            1216
_L13:
		i = 1;
	//   49  175:iconst_1        
	//   50  176:istore_2        
		  goto _L11
	//*  51  177:goto            1218
_L6:
		if(!s1.equals("QUEUE_CHANGE")) goto _L1; else goto _L14
	//   52  180:aload           9
	//   53  182:ldc2            #596 <String "QUEUE_CHANGE">
	//   54  185:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   55  188:ifeq            1216
_L14:
		i = 6;
	//   56  191:bipush          6
	//   57  193:istore_2        
		  goto _L11
	//*  58  194:goto            1218
_L5:
		if(!s1.equals("LOAD_FAILED")) goto _L1; else goto _L15
	//   59  197:aload           9
	//   60  199:ldc2            #598 <String "LOAD_FAILED">
	//   61  202:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   62  205:ifeq            1216
_L15:
		i = 2;
	//   63  208:iconst_2        
	//   64  209:istore_2        
		  goto _L11
	//*  65  210:goto            1218
_L4:
		if(!s1.equals("INVALID_REQUEST")) goto _L1; else goto _L16
	//   66  213:aload           9
	//   67  215:ldc2            #600 <String "INVALID_REQUEST">
	//   68  218:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   69  221:ifeq            1216
_L16:
		i = 4;
	//   70  224:iconst_4        
	//   71  225:istore_2        
		  goto _L11
	//*  72  226:goto            1218
_L3:
		if(!s1.equals("QUEUE_ITEMS")) goto _L1; else goto _L17
	//   73  229:aload           9
	//   74  231:ldc2            #602 <String "QUEUE_ITEMS">
	//   75  234:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   76  237:ifeq            1216
_L17:
		i = 7;
	//   77  240:bipush          7
	//   78  242:istore_2        
		  goto _L11
	//*  79  243:goto            1218
_L2:
		if(!s1.equals("LOAD_CANCELLED")) goto _L1; else goto _L18
	//   80  246:aload           9
	//   81  248:ldc2            #604 <String "LOAD_CANCELLED">
	//   82  251:invokevirtual   #590 <Method boolean String.equals(Object)>
	//   83  254:ifeq            1216
_L18:
		i = 3;
	//   84  257:iconst_3        
	//   85  258:istore_2        
		  goto _L11
	//*  86  259:goto            1218
_L73:
		zzxh.zzc(l, 0, ((Object) (null)));
	//   87  262:aload_0         
	//   88  263:getfield        #95  <Field zzdn zzxh>
	//   89  266:lload           5
	//   90  268:iconst_0        
	//   91  269:aconst_null     
	//   92  270:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//   93  273:pop             
		if(zzwr == null) goto _L20; else goto _L19
	//   94  274:aload_0         
	//   95  275:getfield        #107 <Field zzdj zzwr>
	//   96  278:ifnull          1186
_L19:
		MediaQueueItem amediaqueueitem[];
		obj = ((Object) (((JSONObject) (obj)).getJSONArray("items")));
	//   97  281:aload           8
	//   98  283:ldc2            #400 <String "items">
	//   99  286:invokevirtual   #608 <Method JSONArray JSONObject.getJSONArray(String)>
	//  100  289:astore          8
		amediaqueueitem = new MediaQueueItem[((JSONArray) (obj)).length()];
	//  101  291:aload           8
	//  102  293:invokevirtual   #220 <Method int JSONArray.length()>
	//  103  296:anewarray       MediaQueueItem[]
	//  104  299:astore          9
		i = 0;
	//  105  301:iconst_0        
	//  106  302:istore_2        
_L22:
		if(i >= ((JSONArray) (obj)).length())
			break; /* Loop/switch isn't completed */
	//  107  303:iload_2         
	//  108  304:aload           8
	//  109  306:invokevirtual   #220 <Method int JSONArray.length()>
	//  110  309:icmpge          339
		amediaqueueitem[i] = (new com.google.android.gms.cast.MediaQueueItem.Builder(((JSONArray) (obj)).getJSONObject(i))).build();
	//  111  312:aload           9
	//  112  314:iload_2         
	//  113  315:new             #610 <Class com.google.android.gms.cast.MediaQueueItem$Builder>
	//  114  318:dup             
	//  115  319:aload           8
	//  116  321:iload_2         
	//  117  322:invokevirtual   #614 <Method JSONObject JSONArray.getJSONObject(int)>
	//  118  325:invokespecial   #617 <Method void com.google.android.gms.cast.MediaQueueItem$Builder(JSONObject)>
	//  119  328:invokevirtual   #621 <Method MediaQueueItem com.google.android.gms.cast.MediaQueueItem$Builder.build()>
	//  120  331:aastore         
		i++;
	//  121  332:iload_2         
	//  122  333:iconst_1        
	//  123  334:iadd            
	//  124  335:istore_2        
		if(true) goto _L22; else goto _L21
	//  125  336:goto            303
	//* 126  339:aload_0         
	//* 127  340:getfield        #107 <Field zzdj zzwr>
	//* 128  343:aload           9
	//* 129  345:invokeinterface #624 <Method void zzdj.zzb(MediaQueueItem[])>
	//* 130  350:return          
_L72:
		zzxi.zzc(l, 0, ((Object) (null)));
	//  131  351:aload_0         
	//  132  352:getfield        #93  <Field zzdn zzxi>
	//  133  355:lload           5
	//  134  357:iconst_0        
	//  135  358:aconst_null     
	//  136  359:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//  137  362:pop             
		if(zzwr == null) goto _L24; else goto _L23
	//  138  363:aload_0         
	//  139  364:getfield        #107 <Field zzdj zzwr>
	//  140  367:ifnull          1301
_L23:
		s2 = ((JSONObject) (obj)).getString("changeType");
	//  141  370:aload           8
	//  142  372:ldc2            #626 <String "changeType">
	//  143  375:invokevirtual   #577 <Method String JSONObject.getString(String)>
	//  144  378:astore          9
		ai = zzb(((JSONObject) (obj)).getJSONArray("itemIds"));
	//  145  380:aload           8
	//  146  382:ldc2            #501 <String "itemIds">
	//  147  385:invokevirtual   #608 <Method JSONArray JSONObject.getJSONArray(String)>
	//  148  388:invokestatic    #628 <Method int[] zzb(JSONArray)>
	//  149  391:astore          10
		j = ((JSONObject) (obj)).optInt("insertBefore", 0);
	//  150  393:aload           8
	//  151  395:ldc2            #509 <String "insertBefore">
	//  152  398:iconst_0        
	//  153  399:invokevirtual   #632 <Method int JSONObject.optInt(String, int)>
	//  154  402:istore          4
		if(ai == null) goto _L24; else goto _L25
	//  155  404:aload           10
	//  156  406:ifnull          1301
_L25:
		s2.hashCode();
	//  157  409:aload           9
	//  158  411:invokevirtual   #584 <Method int String.hashCode()>
		JVM INSTR lookupswitch 5: default 1265
	//	               -2130463047: 528
	//	               -1881281404: 512
	//	               -1785516855: 496
	//	               1122976047: 480
	//	               1395699694: 464;
	//  159  414:lookupswitch    5: default 1265
	//	               -2130463047: 528
	//	               -1881281404: 512
	//	               -1785516855: 496
	//	               1122976047: 480
	//	               1395699694: 464
		   goto _L26 _L27 _L28 _L29 _L30 _L31
_L31:
		if(!s2.equals("NO_CHANGE")) goto _L26; else goto _L32
	//  160  464:aload           9
	//  161  466:ldc2            #634 <String "NO_CHANGE">
	//  162  469:invokevirtual   #590 <Method boolean String.equals(Object)>
	//  163  472:ifeq            1265
_L32:
		i = 4;
	//  164  475:iconst_4        
	//  165  476:istore_2        
		  goto _L33
	//* 166  477:goto            1267
_L30:
		if(!s2.equals("ITEMS_CHANGE")) goto _L26; else goto _L34
	//  167  480:aload           9
	//  168  482:ldc2            #636 <String "ITEMS_CHANGE">
	//  169  485:invokevirtual   #590 <Method boolean String.equals(Object)>
	//  170  488:ifeq            1265
_L34:
		i = 1;
	//  171  491:iconst_1        
	//  172  492:istore_2        
		  goto _L33
	//* 173  493:goto            1267
_L29:
		if(!s2.equals("UPDATE")) goto _L26; else goto _L35
	//  174  496:aload           9
	//  175  498:ldc2            #638 <String "UPDATE">
	//  176  501:invokevirtual   #590 <Method boolean String.equals(Object)>
	//  177  504:ifeq            1265
_L35:
		i = ((int) (byte0));
	//  178  507:iload_3         
	//  179  508:istore_2        
		  goto _L33
	//* 180  509:goto            1267
_L28:
		if(!s2.equals("REMOVE")) goto _L26; else goto _L36
	//  181  512:aload           9
	//  182  514:ldc2            #640 <String "REMOVE">
	//  183  517:invokevirtual   #590 <Method boolean String.equals(Object)>
	//  184  520:ifeq            1265
_L36:
		i = 2;
	//  185  523:iconst_2        
	//  186  524:istore_2        
		  goto _L33
	//* 187  525:goto            1267
_L27:
		if(!s2.equals("INSERT")) goto _L26; else goto _L37
	//  188  528:aload           9
	//  189  530:ldc2            #642 <String "INSERT">
	//  190  533:invokevirtual   #590 <Method boolean String.equals(Object)>
	//  191  536:ifeq            1265
_L37:
		i = 0;
	//  192  539:iconst_0        
	//  193  540:istore_2        
		  goto _L33
	//* 194  541:goto            1267
_L78:
		zzwr.zza(ai);
	//  195  544:aload_0         
	//  196  545:getfield        #107 <Field zzdj zzwr>
	//  197  548:aload           10
	//  198  550:invokeinterface #645 <Method void zzdj.zza(int[])>
		return;
	//  199  555:return          
_L77:
		zzwr.zzc(ai);
	//  200  556:aload_0         
	//  201  557:getfield        #107 <Field zzdj zzwr>
	//  202  560:aload           10
	//  203  562:invokeinterface #647 <Method void zzdj.zzc(int[])>
		return;
	//  204  567:return          
_L76:
		zzwr.zzb(ai);
	//  205  568:aload_0         
	//  206  569:getfield        #107 <Field zzdj zzwr>
	//  207  572:aload           10
	//  208  574:invokeinterface #649 <Method void zzdj.zzb(int[])>
		return;
	//  209  579:return          
_L75:
		zzwr.zza(ai, j);
	//  210  580:aload_0         
	//  211  581:getfield        #107 <Field zzdj zzwr>
	//  212  584:aload           10
	//  213  586:iload           4
	//  214  588:invokeinterface #652 <Method void zzdj.zza(int[], int)>
		return;
	//  215  593:return          
_L71:
		zzxg.zzc(l, 0, ((Object) (null)));
	//  216  594:aload_0         
	//  217  595:getfield        #91  <Field zzdn zzxg>
	//  218  598:lload           5
	//  219  600:iconst_0        
	//  220  601:aconst_null     
	//  221  602:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//  222  605:pop             
		if(zzwr == null) goto _L39; else goto _L38
	//  223  606:aload_0         
	//  224  607:getfield        #107 <Field zzdj zzwr>
	//  225  610:ifnull          1302
_L38:
		obj = ((Object) (zzb(((JSONObject) (obj)).getJSONArray("itemIds"))));
	//  226  613:aload           8
	//  227  615:ldc2            #501 <String "itemIds">
	//  228  618:invokevirtual   #608 <Method JSONArray JSONObject.getJSONArray(String)>
	//  229  621:invokestatic    #628 <Method int[] zzb(JSONArray)>
	//  230  624:astore          8
		if(obj == null) goto _L39; else goto _L40
	//  231  626:aload           8
	//  232  628:ifnull          1302
_L40:
		zzwr.zza(((int []) (obj)));
	//  233  631:aload_0         
	//  234  632:getfield        #107 <Field zzdj zzwr>
	//  235  635:aload           8
	//  236  637:invokeinterface #645 <Method void zzdj.zza(int[])>
		return;
	//  237  642:return          
_L70:
		zzuv.w("received unexpected error: Invalid Request.", new Object[0]);
	//  238  643:aload_0         
	//  239  644:getfield        #302 <Field zzdg zzuv>
	//  240  647:ldc2            #654 <String "received unexpected error: Invalid Request.">
	//  241  650:iconst_0        
	//  242  651:anewarray       Object[]
	//  243  654:invokevirtual   #327 <Method void zzdg.w(String, Object[])>
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("customData")));
	//  244  657:aload           8
	//  245  659:ldc2            #350 <String "customData">
	//  246  662:invokevirtual   #658 <Method JSONObject JSONObject.optJSONObject(String)>
	//  247  665:astore          8
		for(Iterator iterator1 = ((zzcg)this).zzcn().iterator(); iterator1.hasNext(); ((zzdn)iterator1.next()).zzc(l, 2100, obj));
	//  248  667:aload_0         
	//  249  668:invokevirtual   #228 <Method List zzcg.zzcn()>
	//  250  671:invokeinterface #232 <Method Iterator List.iterator()>
	//  251  676:astore          9
	//  252  678:aload           9
	//  253  680:invokeinterface #237 <Method boolean Iterator.hasNext()>
	//  254  685:ifeq            1303
	//  255  688:aload           9
	//  256  690:invokeinterface #241 <Method Object Iterator.next()>
	//  257  695:checkcast       #54  <Class zzdn>
	//  258  698:lload           5
	//  259  700:sipush          2100
	//  260  703:aload           8
	//  261  705:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//  262  708:pop             
		  goto _L41
	//* 263  709:goto            678
_L69:
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("customData")));
	//  264  712:aload           8
	//  265  714:ldc2            #350 <String "customData">
	//  266  717:invokevirtual   #658 <Method JSONObject JSONObject.optJSONObject(String)>
	//  267  720:astore          8
		zzws.zzc(l, 2101, obj);
	//  268  722:aload_0         
	//  269  723:getfield        #61  <Field zzdn zzws>
	//  270  726:lload           5
	//  271  728:sipush          2101
	//  272  731:aload           8
	//  273  733:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//  274  736:pop             
		return;
	//  275  737:return          
_L68:
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("customData")));
	//  276  738:aload           8
	//  277  740:ldc2            #350 <String "customData">
	//  278  743:invokevirtual   #658 <Method JSONObject JSONObject.optJSONObject(String)>
	//  279  746:astore          8
		zzws.zzc(l, 2100, obj);
	//  280  748:aload_0         
	//  281  749:getfield        #61  <Field zzdn zzws>
	//  282  752:lload           5
	//  283  754:sipush          2100
	//  284  757:aload           8
	//  285  759:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//  286  762:pop             
		return;
	//  287  763:return          
_L67:
		zzuv.w("received unexpected error: Invalid Player State.", new Object[0]);
	//  288  764:aload_0         
	//  289  765:getfield        #302 <Field zzdg zzuv>
	//  290  768:ldc2            #660 <String "received unexpected error: Invalid Player State.">
	//  291  771:iconst_0        
	//  292  772:anewarray       Object[]
	//  293  775:invokevirtual   #327 <Method void zzdg.w(String, Object[])>
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("customData")));
	//  294  778:aload           8
	//  295  780:ldc2            #350 <String "customData">
	//  296  783:invokevirtual   #658 <Method JSONObject JSONObject.optJSONObject(String)>
	//  297  786:astore          8
		for(Iterator iterator2 = ((zzcg)this).zzcn().iterator(); iterator2.hasNext(); ((zzdn)iterator2.next()).zzc(l, 2100, obj));
	//  298  788:aload_0         
	//  299  789:invokevirtual   #228 <Method List zzcg.zzcn()>
	//  300  792:invokeinterface #232 <Method Iterator List.iterator()>
	//  301  797:astore          9
	//  302  799:aload           9
	//  303  801:invokeinterface #237 <Method boolean Iterator.hasNext()>
	//  304  806:ifeq            1304
	//  305  809:aload           9
	//  306  811:invokeinterface #241 <Method Object Iterator.next()>
	//  307  816:checkcast       #54  <Class zzdn>
	//  308  819:lload           5
	//  309  821:sipush          2100
	//  310  824:aload           8
	//  311  826:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//  312  829:pop             
		  goto _L42
	//* 313  830:goto            799
_L66:
		obj = ((Object) (((JSONObject) (obj)).getJSONArray("status")));
	//  314  833:aload           8
	//  315  835:ldc2            #662 <String "status">
	//  316  838:invokevirtual   #608 <Method JSONArray JSONObject.getJSONArray(String)>
	//  317  841:astore          8
		if(((JSONArray) (obj)).length() <= 0) goto _L44; else goto _L43
	//  318  843:aload           8
	//  319  845:invokevirtual   #220 <Method int JSONArray.length()>
	//  320  848:ifle            1153
_L43:
		obj = ((Object) (((JSONArray) (obj)).getJSONObject(0)));
	//  321  851:aload           8
	//  322  853:iconst_0        
	//  323  854:invokevirtual   #614 <Method JSONObject JSONArray.getJSONObject(int)>
	//  324  857:astore          8
		flag1 = zzws.test(l);
	//  325  859:aload_0         
	//  326  860:getfield        #61  <Field zzdn zzws>
	//  327  863:lload           5
	//  328  865:invokevirtual   #666 <Method boolean zzdn.test(long)>
	//  329  868:istore          7
		if(zzww.zzdb() && !zzww.test(l))
	//* 330  870:aload_0         
	//* 331  871:getfield        #71  <Field zzdn zzww>
	//* 332  874:invokevirtual   #669 <Method boolean zzdn.zzdb()>
	//* 333  877:ifeq            1305
	//* 334  880:aload_0         
	//* 335  881:getfield        #71  <Field zzdn zzww>
	//* 336  884:lload           5
	//* 337  886:invokevirtual   #666 <Method boolean zzdn.test(long)>
	//* 338  889:ifne            1305
			i = 1;
	//  339  892:iconst_1        
	//  340  893:istore_2        
		else
	//* 341  894:goto            897
	//* 342  897:aload_0         
	//* 343  898:getfield        #73  <Field zzdn zzwx>
	//* 344  901:invokevirtual   #669 <Method boolean zzdn.zzdb()>
	//* 345  904:ifeq            919
	//* 346  907:aload_0         
	//* 347  908:getfield        #73  <Field zzdn zzwx>
	//* 348  911:lload           5
	//* 349  913:invokevirtual   #666 <Method boolean zzdn.test(long)>
	//* 350  916:ifeq            1310
	//* 351  919:aload_0         
	//* 352  920:getfield        #75  <Field zzdn zzwy>
	//* 353  923:invokevirtual   #669 <Method boolean zzdn.zzdb()>
	//* 354  926:ifeq            1315
	//* 355  929:aload_0         
	//* 356  930:getfield        #75  <Field zzdn zzwy>
	//* 357  933:lload           5
	//* 358  935:invokevirtual   #666 <Method boolean zzdn.test(long)>
	//* 359  938:ifne            1315
	//* 360  941:goto            1310
	//* 361  944:iload           7
	//* 362  946:ifne            974
	//* 363  949:aload_0         
	//* 364  950:getfield        #161 <Field MediaStatus zzwq>
	//* 365  953:ifnonnull       959
	//* 366  956:goto            974
	//* 367  959:aload_0         
	//* 368  960:getfield        #161 <Field MediaStatus zzwq>
	//* 369  963:aload           8
	//* 370  965:iload           4
	//* 371  967:invokevirtual   #672 <Method int MediaStatus.zza(JSONObject, int)>
	//* 372  970:istore_2        
	//* 373  971:goto            997
	//* 374  974:aload_0         
	//* 375  975:new             #165 <Class MediaStatus>
	//* 376  978:dup             
	//* 377  979:aload           8
	//* 378  981:invokespecial   #673 <Method void MediaStatus(JSONObject)>
	//* 379  984:putfield        #161 <Field MediaStatus zzwq>
	//* 380  987:aload_0         
	//* 381  988:invokestatic    #127 <Method long SystemClock.elapsedRealtime()>
	//* 382  991:putfield        #129 <Field long zzwp>
	//* 383  994:bipush          127
	//* 384  996:istore_2        
	//* 385  997:iload_2         
	//* 386  998:iconst_1        
	//* 387  999:iand            
	//* 388 1000:ifeq            1014
	//* 389 1003:aload_0         
	//* 390 1004:invokestatic    #127 <Method long SystemClock.elapsedRealtime()>
	//* 391 1007:putfield        #129 <Field long zzwp>
	//* 392 1010:aload_0         
	//* 393 1011:invokespecial   #674 <Method void onStatusUpdated()>
	//* 394 1014:iload_2         
	//* 395 1015:iconst_2        
	//* 396 1016:iand            
	//* 397 1017:ifeq            1031
	//* 398 1020:aload_0         
	//* 399 1021:invokestatic    #127 <Method long SystemClock.elapsedRealtime()>
	//* 400 1024:putfield        #129 <Field long zzwp>
	//* 401 1027:aload_0         
	//* 402 1028:invokespecial   #674 <Method void onStatusUpdated()>
	//* 403 1031:iload_2         
	//* 404 1032:iconst_4        
	//* 405 1033:iand            
	//* 406 1034:ifeq            1041
	//* 407 1037:aload_0         
	//* 408 1038:invokespecial   #675 <Method void onMetadataUpdated()>
	//* 409 1041:iload_2         
	//* 410 1042:bipush          8
	//* 411 1044:iand            
	//* 412 1045:ifeq            1052
	//* 413 1048:aload_0         
	//* 414 1049:invokespecial   #676 <Method void onQueueStatusUpdated()>
	//* 415 1052:iload_2         
	//* 416 1053:bipush          16
	//* 417 1055:iand            
	//* 418 1056:ifeq            1063
	//* 419 1059:aload_0         
	//* 420 1060:invokespecial   #677 <Method void onPreloadStatusUpdated()>
	//* 421 1063:iload_2         
	//* 422 1064:bipush          32
	//* 423 1066:iand            
	//* 424 1067:ifeq            1093
	//* 425 1070:aload_0         
	//* 426 1071:invokestatic    #127 <Method long SystemClock.elapsedRealtime()>
	//* 427 1074:putfield        #129 <Field long zzwp>
	//* 428 1077:aload_0         
	//* 429 1078:getfield        #107 <Field zzdj zzwr>
	//* 430 1081:ifnull          1093
	//* 431 1084:aload_0         
	//* 432 1085:getfield        #107 <Field zzdj zzwr>
	//* 433 1088:invokeinterface #680 <Method void zzdj.onAdBreakStatusUpdated()>
	//* 434 1093:iload_2         
	//* 435 1094:bipush          64
	//* 436 1096:iand            
	//* 437 1097:ifeq            1111
	//* 438 1100:aload_0         
	//* 439 1101:invokestatic    #127 <Method long SystemClock.elapsedRealtime()>
	//* 440 1104:putfield        #129 <Field long zzwp>
	//* 441 1107:aload_0         
	//* 442 1108:invokespecial   #674 <Method void onStatusUpdated()>
	//* 443 1111:aload_0         
	//* 444 1112:invokevirtual   #228 <Method List zzcg.zzcn()>
	//* 445 1115:invokeinterface #232 <Method Iterator List.iterator()>
	//* 446 1120:astore          8
	//* 447 1122:aload           8
	//* 448 1124:invokeinterface #237 <Method boolean Iterator.hasNext()>
	//* 449 1129:ifeq            1343
	//* 450 1132:aload           8
	//* 451 1134:invokeinterface #241 <Method Object Iterator.next()>
	//* 452 1139:checkcast       #54  <Class zzdn>
	//* 453 1142:lload           5
	//* 454 1144:iconst_0        
	//* 455 1145:aconst_null     
	//* 456 1146:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//* 457 1149:pop             
	//* 458 1150:goto            1122
	//* 459 1153:aload_0         
	//* 460 1154:aconst_null     
	//* 461 1155:putfield        #161 <Field MediaStatus zzwq>
	//* 462 1158:aload_0         
	//* 463 1159:invokespecial   #674 <Method void onStatusUpdated()>
	//* 464 1162:aload_0         
	//* 465 1163:invokespecial   #675 <Method void onMetadataUpdated()>
	//* 466 1166:aload_0         
	//* 467 1167:invokespecial   #676 <Method void onQueueStatusUpdated()>
	//* 468 1170:aload_0         
	//* 469 1171:invokespecial   #677 <Method void onPreloadStatusUpdated()>
	//* 470 1174:aload_0         
	//* 471 1175:getfield        #77  <Field zzdn zzwz>
	//* 472 1178:lload           5
	//* 473 1180:iconst_0        
	//* 474 1181:aconst_null     
	//* 475 1182:invokevirtual   #551 <Method boolean zzdn.zzc(long, int, Object)>
	//* 476 1185:pop             
	//* 477 1186:return          
	//* 478 1187:astore          8
	//* 479 1189:aload_0         
	//* 480 1190:getfield        #302 <Field zzdg zzuv>
	//* 481 1193:ldc2            #682 <String "Message is malformed (%s); ignoring: %s">
	//* 482 1196:iconst_2        
	//* 483 1197:anewarray       Object[]
	//* 484 1200:dup             
	//* 485 1201:iconst_0        
	//* 486 1202:aload           8
	//* 487 1204:invokevirtual   #315 <Method String JSONException.getMessage()>
	//* 488 1207:aastore         
	//* 489 1208:dup             
	//* 490 1209:iconst_1        
	//* 491 1210:aload_1         
	//* 492 1211:aastore         
	//* 493 1212:invokevirtual   #327 <Method void zzdg.w(String, Object[])>
	//* 494 1215:return          
	//* 495 1216:iconst_m1       
	//* 496 1217:istore_2        
	//* 497 1218:iload_2         
	//* 498 1219:tableswitch     0 7: default 1264
	//	               0 833
	//	               1 764
	//	               2 738
	//	               3 712
	//	               4 643
	//	               5 594
	//	               6 351
	//	               7 262
	//* 499 1264:return          
	//* 500 1265:iconst_m1       
	//* 501 1266:istore_2        
	//* 502 1267:iload_2         
	//* 503 1268:tableswitch     0 3: default 1300
	//	               0 580
	//	               1 568
	//	               2 556
	//	               3 544
	//* 504 1300:return          
	//* 505 1301:return          
	//* 506 1302:return          
	//* 507 1303:return          
	//* 508 1304:return          
			i = 0;
	//  509 1305:iconst_0        
	//  510 1306:istore_2        
		  goto _L45
_L79:
		if(flag1) goto _L47; else goto _L46
_L46:
		if(zzwq != null) goto _L48; else goto _L47
_L48:
		i = zzwq.zza(((JSONObject) (obj)), k);
		  goto _L49
_L47:
		zzwq = new MediaStatus(((JSONObject) (obj)));
		zzwp = SystemClock.elapsedRealtime();
		i = 127;
_L49:
		if((i & 1) == 0) goto _L51; else goto _L50
_L50:
		zzwp = SystemClock.elapsedRealtime();
		onStatusUpdated();
_L51:
		if((i & 2) == 0) goto _L53; else goto _L52
_L52:
		zzwp = SystemClock.elapsedRealtime();
		onStatusUpdated();
_L53:
		if((i & 4) == 0) goto _L55; else goto _L54
_L54:
		onMetadataUpdated();
_L55:
		if((i & 8) == 0) goto _L57; else goto _L56
_L56:
		onQueueStatusUpdated();
_L57:
		if((i & 0x10) == 0) goto _L59; else goto _L58
_L58:
		onPreloadStatusUpdated();
_L59:
		if((i & 0x20) == 0) goto _L61; else goto _L60
_L60:
		zzwp = SystemClock.elapsedRealtime();
		if(zzwr != null)
			zzwr.onAdBreakStatusUpdated();
_L61:
		if((i & 0x40) == 0) goto _L63; else goto _L62
_L62:
		zzwp = SystemClock.elapsedRealtime();
		onStatusUpdated();
_L63:
		for(Iterator iterator = ((zzcg)this).zzcn().iterator(); iterator.hasNext(); ((zzdn)iterator.next()).zzc(l, 0, ((Object) (null))));
		  goto _L64
_L44:
		zzwq = null;
		onStatusUpdated();
		onMetadataUpdated();
		onQueueStatusUpdated();
		onPreloadStatusUpdated();
		zzwz.zzc(l, 0, ((Object) (null)));
_L20:
		return;
_L21:
		int j;
		boolean flag1;
		String s2;
		int ai[];
		try
		{
			zzwr.zzb(amediaqueueitem);
			return;
		}
		catch(JSONException jsonexception)
		{
			zzuv.w("Message is malformed (%s); ignoring: %s", new Object[] {
				jsonexception.getMessage(), s
			});
		}
		return;
_L1:
		i = -1;
_L11:
		i;
		JVM INSTR tableswitch 0 7: default 1264
	//	               0 833
	//	               1 764
	//	               2 738
	//	               3 712
	//	               4 643
	//	               5 594
	//	               6 351
	//	               7 262;
		   goto _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73
_L65:
		return;
_L26:
		i = -1;
_L33:
		i;
		JVM INSTR tableswitch 0 3: default 1300
	//	               0 580
	//	               1 568
	//	               2 556
	//	               3 544;
		   goto _L74 _L75 _L76 _L77 _L78
_L74:
		return;
_L24:
		return;
_L39:
		return;
_L41:
		return;
_L42:
		return;
_L45:
		boolean flag;
		int k;
		if(zzwx.zzdb() && !zzwx.test(l) || zzwy.zzdb() && !zzwy.test(l))
	//* 511 1307:goto            897
			flag = true;
	//  512 1310:iconst_1        
	//  513 1311:istore_3        
		else
	//* 514 1312:goto            1317
			flag = false;
	//  515 1315:iconst_0        
	//  516 1316:istore_3        
		if(i != 0)
	//* 517 1317:iload_2         
	//* 518 1318:ifeq            1326
			i = 2;
	//  519 1321:iconst_2        
	//  520 1322:istore_2        
		else
	//* 521 1323:goto            1328
			i = 0;
	//  522 1326:iconst_0        
	//  523 1327:istore_2        
		k = i;
	//  524 1328:iload_2         
	//  525 1329:istore          4
		if(flag)
	//* 526 1331:iload_3         
	//* 527 1332:ifeq            944
			k = i | 1;
	//  528 1335:iload_2         
	//  529 1336:iconst_1        
	//  530 1337:ior             
	//  531 1338:istore          4
		  goto _L79
	//* 532 1340:goto            944
_L64:
	//  533 1343:return          
	}

	public static final String NAMESPACE = zzcu.zzp("com.google.cast.media");
	private long zzwp;
	private MediaStatus zzwq;
	private zzdj zzwr;
	private final zzdn zzws = new zzdn(0x5265c00L);
	private final zzdn zzwt = new zzdn(0x5265c00L);
	private final zzdn zzwu = new zzdn(0x5265c00L);
	private final zzdn zzwv = new zzdn(0x5265c00L);
	private final zzdn zzww = new zzdn(10000L);
	private final zzdn zzwx = new zzdn(0x5265c00L);
	private final zzdn zzwy = new zzdn(0x5265c00L);
	private final zzdn zzwz = new zzdn(0x5265c00L);
	private final zzdn zzxa = new zzdn(0x5265c00L);
	private final zzdn zzxb = new zzdn(0x5265c00L);
	private final zzdn zzxc = new zzdn(0x5265c00L);
	private final zzdn zzxd = new zzdn(0x5265c00L);
	private final zzdn zzxe = new zzdn(0x5265c00L);
	private final zzdn zzxf = new zzdn(0x5265c00L);
	private final zzdn zzxg = new zzdn(0x5265c00L);
	private final zzdn zzxh = new zzdn(0x5265c00L);
	private final zzdn zzxi = new zzdn(0x5265c00L);
	private final zzdn zzxj = new zzdn(0x5265c00L);

	static 
	{
	//    0    0:ldc1            #36  <String "com.google.cast.media">
	//    1    2:invokestatic    #42  <Method String zzcu.zzp(String)>
	//    2    5:putstatic       #44  <Field String NAMESPACE>
	//*   3    8:return          
	}
}
