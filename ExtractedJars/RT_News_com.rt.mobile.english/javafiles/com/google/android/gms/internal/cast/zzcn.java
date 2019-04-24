// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.*;
import android.text.TextUtils;
import com.google.android.gms.cast.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdg, zzco, zzcd, zzcu, 
//			zzcv, zzcp, zzcz, zzda, 
//			zzb

public final class zzcn extends GmsClient
{

	public zzcn(Context context, Looper looper, ClientSettings clientsettings, CastDevice castdevice, long l, com.google.android.gms.cast.Cast.Listener listener, 
			Bundle bundle, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 10, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          10
	//    4    5:aload_3         
	//    5    6:aload           9
	//    6    8:aload           10
	//    7   10:invokespecial   #76  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zzhq = castdevice;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #78  <Field CastDevice zzhq>
		zzaj = listener;
	//   11   19:aload_0         
	//   12   20:aload           7
	//   13   22:putfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
		zzuz = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #82  <Field long zzuz>
		extras = bundle;
	//   17   31:aload_0         
	//   18   32:aload           8
	//   19   34:putfield        #84  <Field Bundle extras>
	//   20   37:aload_0         
	//   21   38:new             #86  <Class HashMap>
	//   22   41:dup             
	//   23   42:invokespecial   #87  <Method void HashMap()>
	//   24   45:putfield        #89  <Field Map zzuy>
	//   25   48:aload_0         
	//   26   49:new             #91  <Class AtomicLong>
	//   27   52:dup             
	//   28   53:lconst_0        
	//   29   54:invokespecial   #94  <Method void AtomicLong(long)>
	//   30   57:putfield        #96  <Field AtomicLong zzvi>
	//   31   60:aload_0         
	//   32   61:new             #86  <Class HashMap>
	//   33   64:dup             
	//   34   65:invokespecial   #87  <Method void HashMap()>
	//   35   68:putfield        #98  <Field Map zzvm>
		zzcp();
	//   36   71:aload_0         
	//   37   72:invokespecial   #101 <Method void zzcp()>
	//   38   75:return          
	}

	static ApplicationMetadata zza(zzcn zzcn1, ApplicationMetadata applicationmetadata)
	{
		zzcn1.zzux = applicationmetadata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field ApplicationMetadata zzux>
		return applicationmetadata;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza(zzcn zzcn1, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
	{
		zzcn1.zzvn = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static String zza(zzcn zzcn1, String s)
	{
		zzcn1.zzvj = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field String zzvj>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
	{
		synchronized(zzvp)
	//*   0    0:getstatic       #69  <Field Object zzvp>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzvn != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
	//*   6   10:ifnull          39
				zzvn.setResult(((Object) (new zzco(new Status(2002)))));
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
	//    9   17:new             #114 <Class zzco>
	//   10   20:dup             
	//   11   21:new             #116 <Class Status>
	//   12   24:dup             
	//   13   25:sipush          2002
	//   14   28:invokespecial   #119 <Method void Status(int)>
	//   15   31:invokespecial   #122 <Method void zzco(Status)>
	//   16   34:invokeinterface #128 <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
			zzvn = resultholder;
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:putfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
		}
	//   20   44:aload_2         
	//   21   45:monitorexit     
		return;
	//   22   46:return          
		resultholder;
	//   23   47:astore_1        
		obj;
	//   24   48:aload_2         
		JVM INSTR monitorexit ;
	//   25   49:monitorexit     
		throw resultholder;
	//   26   50:aload_1         
	//   27   51:athrow          
	}

	private final void zza(zzcd zzcd1)
	{
		zzcd1 = ((zzcd) (zzcd1.zzcl()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #137 <Method String zzcd.zzcl()>
	//    2    4:astore_1        
		boolean flag;
		if(!zzcu.zza(((Object) (zzcd1)), ((Object) (zzvb))))
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #139 <Field String zzvb>
	//*   6   10:invokestatic    #144 <Method boolean zzcu.zza(Object, Object)>
	//*   7   13:ifne            26
		{
			zzvb = ((String) (zzcd1));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #139 <Field String zzvb>
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		} else
	//*  13   23:goto            28
		{
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		}
		zzbd.d("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
			Boolean.valueOf(flag), Boolean.valueOf(zzvc)
		});
	//   16   28:getstatic       #63  <Field zzdg zzbd>
	//   17   31:ldc1            #146 <String "hasChanged=%b, mFirstApplicationStatusUpdate=%b">
	//   18   33:iconst_2        
	//   19   34:anewarray       Object[]
	//   20   37:dup             
	//   21   38:iconst_0        
	//   22   39:iload_2         
	//   23   40:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload_0         
	//   28   47:getfield        #154 <Field boolean zzvc>
	//   29   50:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//   30   53:aastore         
	//   31   54:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		if(zzaj != null && (flag || zzvc))
	//*  32   57:aload_0         
	//*  33   58:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//*  34   61:ifnull          82
	//*  35   64:iload_2         
	//*  36   65:ifne            75
	//*  37   68:aload_0         
	//*  38   69:getfield        #154 <Field boolean zzvc>
	//*  39   72:ifeq            82
			zzaj.onApplicationStatusChanged();
	//   40   75:aload_0         
	//   41   76:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//   42   79:invokevirtual   #163 <Method void com.google.android.gms.cast.Cast$Listener.onApplicationStatusChanged()>
		zzvc = false;
	//   43   82:aload_0         
	//   44   83:iconst_0        
	//   45   84:putfield        #154 <Field boolean zzvc>
	//   46   87:return          
	}

	static void zza(zzcn zzcn1, int i)
	{
		zzcn1.zzm(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #167 <Method void zzm(int)>
	//    3    5:return          
	}

	static void zza(zzcn zzcn1, long l, int i)
	{
		zzcn1.zzb(l, i);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #172 <Method void zzb(long, int)>
	//    4    6:return          
	}

	static void zza(zzcn zzcn1, zzcd zzcd1)
	{
		zzcn1.zza(zzcd1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method void zza(zzcd)>
	//    3    5:return          
	}

	static void zza(zzcn zzcn1, zzcv zzcv1)
	{
		zzcn1.zza(zzcv1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method void zza(zzcv)>
	//    3    5:return          
	}

	private final void zza(zzcv zzcv1)
	{
		ApplicationMetadata applicationmetadata = zzcv1.getApplicationMetadata();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #185 <Method ApplicationMetadata zzcv.getApplicationMetadata()>
	//    2    4:astore          7
		if(!zzcu.zza(((Object) (applicationmetadata)), ((Object) (zzux))))
	//*   3    6:aload           7
	//*   4    8:aload_0         
	//*   5    9:getfield        #105 <Field ApplicationMetadata zzux>
	//*   6   12:invokestatic    #144 <Method boolean zzcu.zza(Object, Object)>
	//*   7   15:ifne            35
		{
			zzux = applicationmetadata;
	//    8   18:aload_0         
	//    9   19:aload           7
	//   10   21:putfield        #105 <Field ApplicationMetadata zzux>
			zzaj.onApplicationMetadataChanged(zzux);
	//   11   24:aload_0         
	//   12   25:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//   13   28:aload_0         
	//   14   29:getfield        #105 <Field ApplicationMetadata zzux>
	//   15   32:invokevirtual   #189 <Method void com.google.android.gms.cast.Cast$Listener.onApplicationMetadataChanged(ApplicationMetadata)>
		}
		double d = zzcv1.getVolume();
	//   16   35:aload_1         
	//   17   36:invokevirtual   #193 <Method double zzcv.getVolume()>
	//   18   39:dstore_2        
		boolean flag;
		if(!Double.isNaN(d) && Math.abs(d - zzei) > 9.9999999999999995E-08D)
	//*  19   40:dload_2         
	//*  20   41:invokestatic    #199 <Method boolean Double.isNaN(double)>
	//*  21   44:ifne            74
	//*  22   47:dload_2         
	//*  23   48:aload_0         
	//*  24   49:getfield        #201 <Field double zzei>
	//*  25   52:dsub            
	//*  26   53:invokestatic    #207 <Method double Math.abs(double)>
	//*  27   56:ldc2w           #208 <Double 9.9999999999999995E-08D>
	//*  28   59:dcmpl           
	//*  29   60:ifle            74
		{
			zzei = d;
	//   30   63:aload_0         
	//   31   64:dload_2         
	//   32   65:putfield        #201 <Field double zzei>
			flag = true;
	//   33   68:iconst_1        
	//   34   69:istore          5
		} else
	//*  35   71:goto            77
		{
			flag = false;
	//   36   74:iconst_0        
	//   37   75:istore          5
		}
		boolean flag1 = zzcv1.zzcv();
	//   38   77:aload_1         
	//   39   78:invokevirtual   #213 <Method boolean zzcv.zzcv()>
	//   40   81:istore          6
		if(flag1 != zzej)
	//*  41   83:iload           6
	//*  42   85:aload_0         
	//*  43   86:getfield        #215 <Field boolean zzej>
	//*  44   89:icmpeq          101
		{
			zzej = flag1;
	//   45   92:aload_0         
	//   46   93:iload           6
	//   47   95:putfield        #215 <Field boolean zzej>
			flag = true;
	//   48   98:iconst_1        
	//   49   99:istore          5
		}
		zzbd.d("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
			Boolean.valueOf(flag), Boolean.valueOf(zzvd)
		});
	//   50  101:getstatic       #63  <Field zzdg zzbd>
	//   51  104:ldc1            #217 <String "hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b">
	//   52  106:iconst_2        
	//   53  107:anewarray       Object[]
	//   54  110:dup             
	//   55  111:iconst_0        
	//   56  112:iload           5
	//   57  114:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//   58  117:aastore         
	//   59  118:dup             
	//   60  119:iconst_1        
	//   61  120:aload_0         
	//   62  121:getfield        #219 <Field boolean zzvd>
	//   63  124:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//   64  127:aastore         
	//   65  128:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		if(zzaj != null && (flag || zzvd))
	//*  66  131:aload_0         
	//*  67  132:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//*  68  135:ifnull          157
	//*  69  138:iload           5
	//*  70  140:ifne            150
	//*  71  143:aload_0         
	//*  72  144:getfield        #219 <Field boolean zzvd>
	//*  73  147:ifeq            157
			zzaj.onVolumeChanged();
	//   74  150:aload_0         
	//   75  151:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//   76  154:invokevirtual   #222 <Method void com.google.android.gms.cast.Cast$Listener.onVolumeChanged()>
		int i = zzcv1.getActiveInputState();
	//   77  157:aload_1         
	//   78  158:invokevirtual   #226 <Method int zzcv.getActiveInputState()>
	//   79  161:istore          4
		if(i != zzvg)
	//*  80  163:iload           4
	//*  81  165:aload_0         
	//*  82  166:getfield        #228 <Field int zzvg>
	//*  83  169:icmpeq          184
		{
			zzvg = i;
	//   84  172:aload_0         
	//   85  173:iload           4
	//   86  175:putfield        #228 <Field int zzvg>
			flag = true;
	//   87  178:iconst_1        
	//   88  179:istore          5
		} else
	//*  89  181:goto            187
		{
			flag = false;
	//   90  184:iconst_0        
	//   91  185:istore          5
		}
		zzbd.d("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
			Boolean.valueOf(flag), Boolean.valueOf(zzvd)
		});
	//   92  187:getstatic       #63  <Field zzdg zzbd>
	//   93  190:ldc1            #230 <String "hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b">
	//   94  192:iconst_2        
	//   95  193:anewarray       Object[]
	//   96  196:dup             
	//   97  197:iconst_0        
	//   98  198:iload           5
	//   99  200:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//  100  203:aastore         
	//  101  204:dup             
	//  102  205:iconst_1        
	//  103  206:aload_0         
	//  104  207:getfield        #219 <Field boolean zzvd>
	//  105  210:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//  106  213:aastore         
	//  107  214:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		if(zzaj != null && (flag || zzvd))
	//* 108  217:aload_0         
	//* 109  218:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//* 110  221:ifnull          247
	//* 111  224:iload           5
	//* 112  226:ifne            236
	//* 113  229:aload_0         
	//* 114  230:getfield        #219 <Field boolean zzvd>
	//* 115  233:ifeq            247
			zzaj.onActiveInputStateChanged(zzvg);
	//  116  236:aload_0         
	//  117  237:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//  118  240:aload_0         
	//  119  241:getfield        #228 <Field int zzvg>
	//  120  244:invokevirtual   #233 <Method void com.google.android.gms.cast.Cast$Listener.onActiveInputStateChanged(int)>
		i = zzcv1.getStandbyState();
	//  121  247:aload_1         
	//  122  248:invokevirtual   #236 <Method int zzcv.getStandbyState()>
	//  123  251:istore          4
		if(i != zzvh)
	//* 124  253:iload           4
	//* 125  255:aload_0         
	//* 126  256:getfield        #238 <Field int zzvh>
	//* 127  259:icmpeq          274
		{
			zzvh = i;
	//  128  262:aload_0         
	//  129  263:iload           4
	//  130  265:putfield        #238 <Field int zzvh>
			flag = true;
	//  131  268:iconst_1        
	//  132  269:istore          5
		} else
	//* 133  271:goto            277
		{
			flag = false;
	//  134  274:iconst_0        
	//  135  275:istore          5
		}
		zzbd.d("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
			Boolean.valueOf(flag), Boolean.valueOf(zzvd)
		});
	//  136  277:getstatic       #63  <Field zzdg zzbd>
	//  137  280:ldc1            #240 <String "hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b">
	//  138  282:iconst_2        
	//  139  283:anewarray       Object[]
	//  140  286:dup             
	//  141  287:iconst_0        
	//  142  288:iload           5
	//  143  290:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//  144  293:aastore         
	//  145  294:dup             
	//  146  295:iconst_1        
	//  147  296:aload_0         
	//  148  297:getfield        #219 <Field boolean zzvd>
	//  149  300:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//  150  303:aastore         
	//  151  304:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		if(zzaj != null && (flag || zzvd))
	//* 152  307:aload_0         
	//* 153  308:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//* 154  311:ifnull          337
	//* 155  314:iload           5
	//* 156  316:ifne            326
	//* 157  319:aload_0         
	//* 158  320:getfield        #219 <Field boolean zzvd>
	//* 159  323:ifeq            337
			zzaj.onStandbyStateChanged(zzvh);
	//  160  326:aload_0         
	//  161  327:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//  162  330:aload_0         
	//  163  331:getfield        #238 <Field int zzvh>
	//  164  334:invokevirtual   #243 <Method void com.google.android.gms.cast.Cast$Listener.onStandbyStateChanged(int)>
		if(!zzcu.zza(((Object) (zzvf)), ((Object) (zzcv1.zzcw()))))
	//* 165  337:aload_0         
	//* 166  338:getfield        #245 <Field zzad zzvf>
	//* 167  341:aload_1         
	//* 168  342:invokevirtual   #249 <Method zzad zzcv.zzcw()>
	//* 169  345:invokestatic    #144 <Method boolean zzcu.zza(Object, Object)>
	//* 170  348:ifne            359
			zzvf = zzcv1.zzcw();
	//  171  351:aload_0         
	//  172  352:aload_1         
	//  173  353:invokevirtual   #249 <Method zzad zzcv.zzcw()>
	//  174  356:putfield        #245 <Field zzad zzvf>
		zzvd = false;
	//  175  359:aload_0         
	//  176  360:iconst_0        
	//  177  361:putfield        #219 <Field boolean zzvd>
	//  178  364:return          
	}

	static String zzb(zzcn zzcn1, String s)
	{
		zzcn1.zzvk = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #251 <Field String zzvk>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private final void zzb(long l, int i)
	{
		com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder;
		synchronized(zzvm)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Map zzvm>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			resultholder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)zzvm.remove(((Object) (Long.valueOf(l))));
	//    5    9:aload_0         
	//    6   10:getfield        #98  <Field Map zzvm>
	//    7   13:lload_1         
	//    8   14:invokestatic    #256 <Method Long Long.valueOf(long)>
	//    9   17:invokeinterface #262 <Method Object Map.remove(Object)>
	//   10   22:checkcast       #124 <Class com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder>
	//   11   25:astore          5
		}
	//   12   27:aload           4
	//   13   29:monitorexit     
		if(resultholder != null)
	//*  14   30:aload           5
	//*  15   32:ifnull          50
			resultholder.setResult(((Object) (new Status(i))));
	//   16   35:aload           5
	//   17   37:new             #116 <Class Status>
	//   18   40:dup             
	//   19   41:iload_3         
	//   20   42:invokespecial   #119 <Method void Status(int)>
	//   21   45:invokeinterface #128 <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
		return;
	//   22   50:return          
		exception;
	//   23   51:astore          5
		map;
	//   24   53:aload           4
		JVM INSTR monitorexit ;
	//   25   55:monitorexit     
		throw exception;
	//   26   56:aload           5
	//   27   58:athrow          
	}

	static String zzc(zzcn zzcn1, String s)
	{
		zzcn1.zzvb = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field String zzvb>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private final void zzc(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
	{
label0:
		{
			synchronized(zzvq)
	//*   0    0:getstatic       #71  <Field Object zzvq>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
			{
				if(zzvo == null)
					break label0;
	//    4    6:aload_0         
	//    5    7:getfield        #265 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvo>
	//    6   10:ifnull          32
				resultholder.setResult(((Object) (new Status(2001))));
	//    7   13:aload_1         
	//    8   14:new             #116 <Class Status>
	//    9   17:dup             
	//   10   18:sipush          2001
	//   11   21:invokespecial   #119 <Method void Status(int)>
	//   12   24:invokeinterface #128 <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
			}
	//   13   29:aload_2         
	//   14   30:monitorexit     
			return;
	//   15   31:return          
		}
		zzvo = resultholder;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #265 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvo>
		obj;
	//   19   37:aload_2         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		return;
	//   21   39:return          
		resultholder;
	//   22   40:astore_1        
		obj;
	//   23   41:aload_2         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		throw resultholder;
	//   25   43:aload_1         
	//   26   44:athrow          
	}

	static void zzc(zzcn zzcn1)
	{
		zzcn1.zzcp();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void zzcp()>
	//    2    4:return          
	}

	private final void zzcp()
	{
		zzve = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #269 <Field boolean zzve>
		zzvg = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #228 <Field int zzvg>
		zzvh = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #238 <Field int zzvh>
		zzux = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #105 <Field ApplicationMetadata zzux>
		zzvb = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #139 <Field String zzvb>
		zzei = 0.0D;
	//   15   25:aload_0         
	//   16   26:dconst_0        
	//   17   27:putfield        #201 <Field double zzei>
		zzej = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #215 <Field boolean zzej>
		zzvf = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #245 <Field zzad zzvf>
	//   24   40:return          
	}

	private final void zzcq()
	{
		zzbd.d("removing all MessageReceivedCallbacks", new Object[0]);
	//    0    0:getstatic       #63  <Field zzdg zzbd>
	//    1    3:ldc2            #272 <String "removing all MessageReceivedCallbacks">
	//    2    6:iconst_0        
	//    3    7:anewarray       Object[]
	//    4   10:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		synchronized(zzuy)
	//*   5   13:aload_0         
	//*   6   14:getfield        #89  <Field Map zzuy>
	//*   7   17:astore_1        
	//*   8   18:aload_1         
	//*   9   19:monitorenter    
		{
			zzuy.clear();
	//   10   20:aload_0         
	//   11   21:getfield        #89  <Field Map zzuy>
	//   12   24:invokeinterface #275 <Method void Map.clear()>
		}
	//   13   29:aload_1         
	//   14   30:monitorexit     
		return;
	//   15   31:return          
		exception;
	//   16   32:astore_2        
		map;
	//   17   33:aload_1         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		throw exception;
	//   19   35:aload_2         
	//   20   36:athrow          
	}

	private final boolean zzcr()
	{
		return zzve && zzva != null && !zzva.isDisposed();
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field boolean zzve>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field zzcp zzva>
	//    5   11:ifnull          26
	//    6   14:aload_0         
	//    7   15:getfield        #279 <Field zzcp zzva>
	//    8   18:invokevirtual   #284 <Method boolean zzcp.isDisposed()>
	//    9   21:ifne            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	static zzdg zzcs()
	{
		return zzbd;
	//    0    0:getstatic       #63  <Field zzdg zzbd>
	//    1    3:areturn         
	}

	static Object zzct()
	{
		return zzvp;
	//    0    0:getstatic       #69  <Field Object zzvp>
	//    1    3:areturn         
	}

	static com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzd(zzcn zzcn1)
	{
		return zzcn1.zzvn;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
	//    2    4:areturn         
	}

	static com.google.android.gms.cast.Cast.Listener zze(zzcn zzcn1)
	{
		return zzcn1.zzaj;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field com.google.android.gms.cast.Cast$Listener zzaj>
	//    2    4:areturn         
	}

	static Map zzf(zzcn zzcn1)
	{
		return zzcn1.zzuy;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Map zzuy>
	//    2    4:areturn         
	}

	static CastDevice zzg(zzcn zzcn1)
	{
		return zzcn1.zzhq;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CastDevice zzhq>
	//    2    4:areturn         
	}

	private final void zzm(int i)
	{
		synchronized(zzvq)
	//*   0    0:getstatic       #71  <Field Object zzvq>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzvo != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #265 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvo>
	//*   6   10:ifnull          35
			{
				zzvo.setResult(((Object) (new Status(i))));
	//    7   13:aload_0         
	//    8   14:getfield        #265 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvo>
	//    9   17:new             #116 <Class Status>
	//   10   20:dup             
	//   11   21:iload_1         
	//   12   22:invokespecial   #119 <Method void Status(int)>
	//   13   25:invokeinterface #128 <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
				zzvo = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #265 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvo>
			}
		}
	//   17   35:aload_2         
	//   18   36:monitorexit     
		return;
	//   19   37:return          
		exception;
	//   20   38:astore_3        
		obj;
	//   21   39:aload_2         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		throw exception;
	//   23   41:aload_3         
	//   24   42:athrow          
	}

	protected final IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
	//    4    6:aload_1         
	//    5    7:ldc2            #301 <String "com.google.android.gms.cast.internal.ICastDeviceController">
	//    6   10:invokeinterface #307 <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   15:astore_2        
		if(iinterface instanceof zzcz)
	//*   8   16:aload_2         
	//*   9   17:instanceof      #309 <Class zzcz>
	//*  10   20:ifeq            28
			return ((IInterface) ((zzcz)iinterface));
	//   11   23:aload_2         
	//   12   24:checkcast       #309 <Class zzcz>
	//   13   27:areturn         
		else
			return ((IInterface) (new zzda(ibinder)));
	//   14   28:new             #311 <Class zzda>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:invokespecial   #314 <Method void zzda(IBinder)>
	//   18   36:areturn         
	}

	public final void disconnect()
	{
		zzbd.d("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
			zzva, Boolean.valueOf(isConnected())
		});
	//    0    0:getstatic       #63  <Field zzdg zzbd>
	//    1    3:ldc2            #321 <String "disconnect(); ServiceListener=%s, isConnected=%b">
	//    2    6:iconst_2        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #279 <Field zzcp zzva>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:invokevirtual   #324 <Method boolean isConnected()>
	//   13   23:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//   14   26:aastore         
	//   15   27:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		zzcp zzcp1 = zzva;
	//   16   30:aload_0         
	//   17   31:getfield        #279 <Field zzcp zzva>
	//   18   34:astore_1        
		zzva = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #279 <Field zzcp zzva>
		if(zzcp1 == null || zzcp1.zzcu() == null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          112
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #328 <Method zzcn zzcp.zzcu()>
	//*  26   48:ifnonnull       54
			break MISSING_BLOCK_LABEL_112;
	//   27   51:goto            112
		zzcq();
	//   28   54:aload_0         
	//   29   55:invokespecial   #330 <Method void zzcq()>
		((zzcz)getService()).disconnect();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #334 <Method IInterface getService()>
	//   32   62:checkcast       #309 <Class zzcz>
	//   33   65:invokeinterface #336 <Method void zzcz.disconnect()>
		super.disconnect();
	//   34   70:aload_0         
	//   35   71:invokespecial   #337 <Method void GmsClient.disconnect()>
		return;
	//   36   74:return          
		Object obj;
		obj;
	//   37   75:astore_1        
		break MISSING_BLOCK_LABEL_106;
	//   38   76:goto            106
		obj;
	//   39   79:astore_1        
		zzbd.zza(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
			((Exception) (obj)).getMessage()
		});
	//   40   80:getstatic       #63  <Field zzdg zzbd>
	//   41   83:aload_1         
	//   42   84:ldc2            #339 <String "Error while disconnecting the controller interface: %s">
	//   43   87:iconst_1        
	//   44   88:anewarray       Object[]
	//   45   91:dup             
	//   46   92:iconst_0        
	//   47   93:aload_1         
	//   48   94:invokevirtual   #344 <Method String Exception.getMessage()>
	//   49   97:aastore         
	//   50   98:invokevirtual   #347 <Method void zzdg.zza(Throwable, String, Object[])>
		super.disconnect();
	//   51  101:aload_0         
	//   52  102:invokespecial   #337 <Method void GmsClient.disconnect()>
		return;
	//   53  105:return          
		super.disconnect();
	//   54  106:aload_0         
	//   55  107:invokespecial   #337 <Method void GmsClient.disconnect()>
		throw obj;
	//   56  110:aload_1         
	//   57  111:athrow          
		zzbd.d("already disposed, so short-circuiting", new Object[0]);
	//   58  112:getstatic       #63  <Field zzdg zzbd>
	//   59  115:ldc2            #349 <String "already disposed, so short-circuiting">
	//   60  118:iconst_0        
	//   61  119:anewarray       Object[]
	//   62  122:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		return;
	//   63  125:return          
	}

	public final int getActiveInputState()
		throws IllegalStateException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void checkConnected()>
		return zzvg;
	//    2    4:aload_0         
	//    3    5:getfield        #228 <Field int zzvg>
	//    4    8:ireturn         
	}

	public final ApplicationMetadata getApplicationMetadata()
		throws IllegalStateException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void checkConnected()>
		return zzux;
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field ApplicationMetadata zzux>
	//    4    8:areturn         
	}

	public final String getApplicationStatus()
		throws IllegalStateException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void checkConnected()>
		return zzvb;
	//    2    4:aload_0         
	//    3    5:getfield        #139 <Field String zzvb>
	//    4    8:areturn         
	}

	public final Bundle getConnectionHint()
	{
		if(zzvl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field Bundle zzvl>
	//*   2    4:ifnull          19
		{
			Bundle bundle = zzvl;
	//    3    7:aload_0         
	//    4    8:getfield        #358 <Field Bundle zzvl>
	//    5   11:astore_1        
			zzvl = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #358 <Field Bundle zzvl>
			return bundle;
	//    9   17:aload_1         
	//   10   18:areturn         
		} else
		{
			return super.getConnectionHint();
	//   11   19:aload_0         
	//   12   20:invokespecial   #360 <Method Bundle GmsClient.getConnectionHint()>
	//   13   23:areturn         
		}
	}

	protected final Bundle getGetServiceRequestExtraArgs()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #363 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #364 <Method void Bundle()>
	//    3    7:astore_1        
		zzbd.d("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
			zzvj, zzvk
		});
	//    4    8:getstatic       #63  <Field zzdg zzbd>
	//    5   11:ldc2            #366 <String "getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s">
	//    6   14:iconst_2        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #111 <Field String zzvj>
	//   12   24:aastore         
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:aload_0         
	//   16   28:getfield        #251 <Field String zzvk>
	//   17   31:aastore         
	//   18   32:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		zzhq.putInBundle(bundle);
	//   19   35:aload_0         
	//   20   36:getfield        #78  <Field CastDevice zzhq>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #372 <Method void CastDevice.putInBundle(Bundle)>
		bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", zzuz);
	//   23   43:aload_1         
	//   24   44:ldc2            #374 <String "com.google.android.gms.cast.EXTRA_CAST_FLAGS">
	//   25   47:aload_0         
	//   26   48:getfield        #82  <Field long zzuz>
	//   27   51:invokevirtual   #378 <Method void Bundle.putLong(String, long)>
		if(extras != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #84  <Field Bundle extras>
	//*  30   58:ifnull          69
			bundle.putAll(extras);
	//   31   61:aload_1         
	//   32   62:aload_0         
	//   33   63:getfield        #84  <Field Bundle extras>
	//   34   66:invokevirtual   #381 <Method void Bundle.putAll(Bundle)>
		zzva = new zzcp(this);
	//   35   69:aload_0         
	//   36   70:new             #281 <Class zzcp>
	//   37   73:dup             
	//   38   74:aload_0         
	//   39   75:invokespecial   #383 <Method void zzcp(zzcn)>
	//   40   78:putfield        #279 <Field zzcp zzva>
		bundle.putParcelable("listener", ((android.os.Parcelable) (new BinderWrapper(((zzb) (zzva)).asBinder()))));
	//   41   81:aload_1         
	//   42   82:ldc2            #385 <String "listener">
	//   43   85:new             #387 <Class BinderWrapper>
	//   44   88:dup             
	//   45   89:aload_0         
	//   46   90:getfield        #279 <Field zzcp zzva>
	//   47   93:invokevirtual   #393 <Method IBinder zzb.asBinder()>
	//   48   96:invokespecial   #394 <Method void BinderWrapper(IBinder)>
	//   49   99:invokevirtual   #398 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(zzvj != null)
	//*  50  102:aload_0         
	//*  51  103:getfield        #111 <Field String zzvj>
	//*  52  106:ifnull          138
		{
			bundle.putString("last_application_id", zzvj);
	//   53  109:aload_1         
	//   54  110:ldc2            #400 <String "last_application_id">
	//   55  113:aload_0         
	//   56  114:getfield        #111 <Field String zzvj>
	//   57  117:invokevirtual   #404 <Method void Bundle.putString(String, String)>
			if(zzvk != null)
	//*  58  120:aload_0         
	//*  59  121:getfield        #251 <Field String zzvk>
	//*  60  124:ifnull          138
				bundle.putString("last_session_id", zzvk);
	//   61  127:aload_1         
	//   62  128:ldc2            #406 <String "last_session_id">
	//   63  131:aload_0         
	//   64  132:getfield        #251 <Field String zzvk>
	//   65  135:invokevirtual   #404 <Method void Bundle.putString(String, String)>
		}
		return bundle;
	//   66  138:aload_1         
	//   67  139:areturn         
	}

	public final int getMinApkVersion()
	{
		return 0xbdfcb8;
	//    0    0:ldc2            #408 <Int 0xbdfcb8>
	//    1    3:ireturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.cast.internal.ICastDeviceController";
	//    0    0:ldc2            #301 <String "com.google.android.gms.cast.internal.ICastDeviceController">
	//    1    3:areturn         
	}

	public final int getStandbyState()
		throws IllegalStateException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void checkConnected()>
		return zzvh;
	//    2    4:aload_0         
	//    3    5:getfield        #238 <Field int zzvh>
	//    4    8:ireturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
	//    0    0:ldc2            #413 <String "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE">
	//    1    3:areturn         
	}

	public final double getVolume()
		throws IllegalStateException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void checkConnected()>
		return zzei;
	//    2    4:aload_0         
	//    3    5:getfield        #201 <Field double zzei>
	//    4    8:dreturn         
	}

	public final boolean isMute()
		throws IllegalStateException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void checkConnected()>
		return zzej;
	//    2    4:aload_0         
	//    3    5:getfield        #215 <Field boolean zzej>
	//    4    8:ireturn         
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		super.onConnectionFailed(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #418 <Method void GmsClient.onConnectionFailed(ConnectionResult)>
		zzcq();
	//    3    5:aload_0         
	//    4    6:invokespecial   #330 <Method void zzcq()>
	//    5    9:return          
	}

	protected final void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
	{
		zzbd.d("in onPostInitHandler; statusCode=%d", new Object[] {
			Integer.valueOf(i)
		});
	//    0    0:getstatic       #63  <Field zzdg zzbd>
	//    1    3:ldc2            #422 <String "in onPostInitHandler; statusCode=%d">
	//    2    6:iconst_1        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:iload_1         
	//    7   13:invokestatic    #427 <Method Integer Integer.valueOf(int)>
	//    8   16:aastore         
	//    9   17:invokevirtual   #158 <Method void zzdg.d(String, Object[])>
		if(i != 0 && i != 1001)
	//*  10   20:iload_1         
	//*  11   21:ifeq            42
	//*  12   24:iload_1         
	//*  13   25:sipush          1001
	//*  14   28:icmpne          34
	//*  15   31:goto            42
		{
			zzve = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #269 <Field boolean zzve>
		} else
	//*  19   39:goto            57
		{
			zzve = true;
	//   20   42:aload_0         
	//   21   43:iconst_1        
	//   22   44:putfield        #269 <Field boolean zzve>
			zzvc = true;
	//   23   47:aload_0         
	//   24   48:iconst_1        
	//   25   49:putfield        #154 <Field boolean zzvc>
			zzvd = true;
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:putfield        #219 <Field boolean zzvd>
		}
		int k = i;
	//   29   57:iload_1         
	//   30   58:istore          5
		if(i == 1001)
	//*  31   60:iload_1         
	//*  32   61:sipush          1001
	//*  33   64:icmpne          92
		{
			zzvl = new Bundle();
	//   34   67:aload_0         
	//   35   68:new             #363 <Class Bundle>
	//   36   71:dup             
	//   37   72:invokespecial   #364 <Method void Bundle()>
	//   38   75:putfield        #358 <Field Bundle zzvl>
			zzvl.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
	//   39   78:aload_0         
	//   40   79:getfield        #358 <Field Bundle zzvl>
	//   41   82:ldc2            #429 <String "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING">
	//   42   85:iconst_1        
	//   43   86:invokevirtual   #433 <Method void Bundle.putBoolean(String, boolean)>
			k = 0;
	//   44   89:iconst_0        
	//   45   90:istore          5
		}
		super.onPostInitHandler(k, ibinder, bundle, j);
	//   46   92:aload_0         
	//   47   93:iload           5
	//   48   95:aload_2         
	//   49   96:aload_3         
	//   50   97:iload           4
	//   51   99:invokespecial   #435 <Method void GmsClient.onPostInitHandler(int, IBinder, Bundle, int)>
	//   52  102:return          
	}

	public final void removeMessageReceivedCallbacks(String s)
		throws IllegalArgumentException, RemoteException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #444 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
			throw new IllegalArgumentException("Channel namespace cannot be null or empty");
	//    3    7:new             #438 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #446 <String "Channel namespace cannot be null or empty">
	//    6   14:invokespecial   #447 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
		synchronized(zzuy)
	//*   8   18:aload_0         
	//*   9   19:getfield        #89  <Field Map zzuy>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:monitorenter    
		{
			messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)zzuy.remove(((Object) (s)));
	//   13   25:aload_0         
	//   14   26:getfield        #89  <Field Map zzuy>
	//   15   29:aload_1         
	//   16   30:invokeinterface #262 <Method Object Map.remove(Object)>
	//   17   35:checkcast       #449 <Class com.google.android.gms.cast.Cast$MessageReceivedCallback>
	//   18   38:astore_3        
		}
	//   19   39:aload_2         
	//   20   40:monitorexit     
		if(messagereceivedcallback != null)
	//*  21   41:aload_3         
	//*  22   42:ifnull          85
			try
			{
				((zzcz)getService()).zzs(s);
	//   23   45:aload_0         
	//   24   46:invokevirtual   #334 <Method IInterface getService()>
	//   25   49:checkcast       #309 <Class zzcz>
	//   26   52:aload_1         
	//   27   53:invokeinterface #452 <Method void zzcz.zzs(String)>
				return;
	//   28   58:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  29   59:astore_2        
			{
				zzbd.zza(((Throwable) (obj)), "Error unregistering namespace (%s): %s", new Object[] {
					s, ((IllegalStateException) (obj)).getMessage()
				});
	//   30   60:getstatic       #63  <Field zzdg zzbd>
	//   31   63:aload_2         
	//   32   64:ldc2            #454 <String "Error unregistering namespace (%s): %s">
	//   33   67:iconst_2        
	//   34   68:anewarray       Object[]
	//   35   71:dup             
	//   36   72:iconst_0        
	//   37   73:aload_1         
	//   38   74:aastore         
	//   39   75:dup             
	//   40   76:iconst_1        
	//   41   77:aload_2         
	//   42   78:invokevirtual   #455 <Method String IllegalStateException.getMessage()>
	//   43   81:aastore         
	//   44   82:invokevirtual   #347 <Method void zzdg.zza(Throwable, String, Object[])>
			}
		return;
	//   45   85:return          
		s;
	//   46   86:astore_1        
		obj;
	//   47   87:aload_2         
		JVM INSTR monitorexit ;
	//   48   88:monitorexit     
		throw s;
	//   49   89:aload_1         
	//   50   90:athrow          
	}

	public final void requestStatus()
		throws IllegalStateException, RemoteException
	{
		zzcz zzcz1 = (zzcz)getService();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method IInterface getService()>
	//    2    4:checkcast       #309 <Class zzcz>
	//    3    7:astore_1        
		if(zzcr())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #458 <Method boolean zzcr()>
	//*   6   12:ifeq            21
			zzcz1.requestStatus();
	//    7   15:aload_1         
	//    8   16:invokeinterface #460 <Method void zzcz.requestStatus()>
	//    9   21:return          
	}

	public final void setMessageReceivedCallbacks(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
		throws IllegalArgumentException, IllegalStateException, RemoteException
	{
		zzcu.zzo(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #465 <Method void zzcu.zzo(String)>
		removeMessageReceivedCallbacks(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #467 <Method void removeMessageReceivedCallbacks(String)>
		if(messagereceivedcallback != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          62
		{
			synchronized(zzuy)
	//*   7   13:aload_0         
	//*   8   14:getfield        #89  <Field Map zzuy>
	//*   9   17:astore_3        
	//*  10   18:aload_3         
	//*  11   19:monitorenter    
			{
				zzuy.put(((Object) (s)), ((Object) (messagereceivedcallback)));
	//   12   20:aload_0         
	//   13   21:getfield        #89  <Field Map zzuy>
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokeinterface #471 <Method Object Map.put(Object, Object)>
	//   17   31:pop             
			}
	//   18   32:aload_3         
	//   19   33:monitorexit     
			messagereceivedcallback = ((com.google.android.gms.cast.Cast.MessageReceivedCallback) ((zzcz)getService()));
	//   20   34:aload_0         
	//   21   35:invokevirtual   #334 <Method IInterface getService()>
	//   22   38:checkcast       #309 <Class zzcz>
	//   23   41:astore_2        
			if(zzcr())
	//*  24   42:aload_0         
	//*  25   43:invokespecial   #458 <Method boolean zzcr()>
	//*  26   46:ifeq            62
			{
				((zzcz) (messagereceivedcallback)).zzr(s);
	//   27   49:aload_2         
	//   28   50:aload_1         
	//   29   51:invokeinterface #474 <Method void zzcz.zzr(String)>
				return;
	//   30   56:return          
			}
		}
		break MISSING_BLOCK_LABEL_62;
		s;
	//   31   57:astore_1        
		map;
	//   32   58:aload_3         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		throw s;
	//   34   60:aload_1         
	//   35   61:athrow          
	//   36   62:return          
	}

	public final void setMute(boolean flag)
		throws IllegalStateException, RemoteException
	{
		zzcz zzcz1 = (zzcz)getService();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method IInterface getService()>
	//    2    4:checkcast       #309 <Class zzcz>
	//    3    7:astore_2        
		if(zzcr())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #458 <Method boolean zzcr()>
	//*   6   12:ifeq            30
			zzcz1.zza(flag, zzei, zzej);
	//    7   15:aload_2         
	//    8   16:iload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #201 <Field double zzei>
	//   11   21:aload_0         
	//   12   22:getfield        #215 <Field boolean zzej>
	//   13   25:invokeinterface #479 <Method void zzcz.zza(boolean, double, boolean)>
	//   14   30:return          
	}

	public final void setVolume(double d)
		throws IllegalArgumentException, IllegalStateException, RemoteException
	{
		if(!Double.isInfinite(d) && !Double.isNaN(d))
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #484 <Method boolean Double.isInfinite(double)>
	//*   2    4:ifne            48
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #199 <Method boolean Double.isNaN(double)>
	//*   5   11:ifeq            17
	//*   6   14:goto            48
		{
			zzcz zzcz1 = (zzcz)getService();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #334 <Method IInterface getService()>
	//    9   21:checkcast       #309 <Class zzcz>
	//   10   24:astore_3        
			if(zzcr())
	//*  11   25:aload_0         
	//*  12   26:invokespecial   #458 <Method boolean zzcr()>
	//*  13   29:ifeq            47
				zzcz1.zza(d, zzei, zzej);
	//   14   32:aload_3         
	//   15   33:dload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #201 <Field double zzei>
	//   18   38:aload_0         
	//   19   39:getfield        #215 <Field boolean zzej>
	//   20   42:invokeinterface #487 <Method void zzcz.zza(double, double, boolean)>
			return;
	//   21   47:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(41);
	//   22   48:new             #489 <Class StringBuilder>
	//   23   51:dup             
	//   24   52:bipush          41
	//   25   54:invokespecial   #490 <Method void StringBuilder(int)>
	//   26   57:astore_3        
			stringbuilder.append("Volume cannot be ");
	//   27   58:aload_3         
	//   28   59:ldc2            #492 <String "Volume cannot be ">
	//   29   62:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			stringbuilder.append(d);
	//   31   66:aload_3         
	//   32   67:dload_1         
	//   33   68:invokevirtual   #499 <Method StringBuilder StringBuilder.append(double)>
	//   34   71:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   72:new             #438 <Class IllegalArgumentException>
	//   36   75:dup             
	//   37   76:aload_3         
	//   38   77:invokevirtual   #502 <Method String StringBuilder.toString()>
	//   39   80:invokespecial   #447 <Method void IllegalArgumentException(String)>
	//   40   83:athrow          
		}
	}

	public final void zza(String s, LaunchOptions launchoptions, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws IllegalStateException, RemoteException
	{
		zza(resultholder);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #505 <Method void zza(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) ((zzcz)getService()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method IInterface getService()>
	//    5    9:checkcast       #309 <Class zzcz>
	//    6   12:astore_3        
		if(zzcr())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #458 <Method boolean zzcr()>
	//*   9   17:ifeq            29
		{
			((zzcz) (resultholder)).zzb(s, launchoptions);
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokeinterface #508 <Method void zzcz.zzb(String, LaunchOptions)>
			return;
	//   14   28:return          
		} else
		{
			zzl(2016);
	//   15   29:aload_0         
	//   16   30:sipush          2016
	//   17   33:invokevirtual   #511 <Method void zzl(int)>
			return;
	//   18   36:return          
		}
	}

	public final void zza(String s, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws IllegalStateException, RemoteException
	{
		zzc(resultholder);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #515 <Method void zzc(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) ((zzcz)getService()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method IInterface getService()>
	//    5    9:checkcast       #309 <Class zzcz>
	//    6   12:astore_2        
		if(zzcr())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #458 <Method boolean zzcr()>
	//*   9   17:ifeq            28
		{
			((zzcz) (resultholder)).zzi(s);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokeinterface #518 <Method void zzcz.zzi(String)>
			return;
	//   13   27:return          
		} else
		{
			zzm(2016);
	//   14   28:aload_0         
	//   15   29:sipush          2016
	//   16   32:invokespecial   #167 <Method void zzm(int)>
			return;
	//   17   35:return          
		}
	}

	public final void zza(String s, String s1, zzaf zzaf1, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws IllegalStateException, RemoteException
	{
		zza(resultholder);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokespecial   #505 <Method void zza(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (zzaf1));
	//    3    6:aload_3         
	//    4    7:astore          4
		if(zzaf1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       22
			resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (new zzaf()));
	//    7   13:new             #522 <Class zzaf>
	//    8   16:dup             
	//    9   17:invokespecial   #523 <Method void zzaf()>
	//   10   20:astore          4
		zzaf1 = ((zzaf) ((zzcz)getService()));
	//   11   22:aload_0         
	//   12   23:invokevirtual   #334 <Method IInterface getService()>
	//   13   26:checkcast       #309 <Class zzcz>
	//   14   29:astore_3        
		if(zzcr())
	//*  15   30:aload_0         
	//*  16   31:invokespecial   #458 <Method boolean zzcr()>
	//*  17   34:ifeq            48
		{
			((zzcz) (zzaf1)).zza(s, s1, ((zzaf) (resultholder)));
	//   18   37:aload_3         
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:aload           4
	//   22   42:invokeinterface #526 <Method void zzcz.zza(String, String, zzaf)>
			return;
	//   23   47:return          
		} else
		{
			zzl(2016);
	//   24   48:aload_0         
	//   25   49:sipush          2016
	//   26   52:invokevirtual   #511 <Method void zzl(int)>
			return;
	//   27   55:return          
		}
	}

	public final void zza(String s, String s1, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws IllegalArgumentException, IllegalStateException, RemoteException
	{
		long l;
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #444 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
			throw new IllegalArgumentException("The message payload cannot be null or empty");
	//    3    7:new             #438 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #532 <String "The message payload cannot be null or empty">
	//    6   14:invokespecial   #447 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(s1.length() > 0x80000)
	//*   8   18:aload_2         
	//*   9   19:invokevirtual   #537 <Method int String.length()>
	//*  10   22:ldc2            #538 <Int 0x80000>
	//*  11   25:icmple          52
		{
			zzbd.w("Message send failed. Message exceeds maximum size", new Object[0]);
	//   12   28:getstatic       #63  <Field zzdg zzbd>
	//   13   31:ldc2            #540 <String "Message send failed. Message exceeds maximum size">
	//   14   34:iconst_0        
	//   15   35:anewarray       Object[]
	//   16   38:invokevirtual   #543 <Method void zzdg.w(String, Object[])>
			throw new IllegalArgumentException("Message exceeds maximum size");
	//   17   41:new             #438 <Class IllegalArgumentException>
	//   18   44:dup             
	//   19   45:ldc2            #545 <String "Message exceeds maximum size">
	//   20   48:invokespecial   #447 <Method void IllegalArgumentException(String)>
	//   21   51:athrow          
		}
		zzcu.zzo(s);
	//   22   52:aload_1         
	//   23   53:invokestatic    #465 <Method void zzcu.zzo(String)>
		l = zzvi.incrementAndGet();
	//   24   56:aload_0         
	//   25   57:getfield        #96  <Field AtomicLong zzvi>
	//   26   60:invokevirtual   #549 <Method long AtomicLong.incrementAndGet()>
	//   27   63:lstore          4
		zzvm.put(((Object) (Long.valueOf(l))), ((Object) (resultholder)));
	//   28   65:aload_0         
	//   29   66:getfield        #98  <Field Map zzvm>
	//   30   69:lload           4
	//   31   71:invokestatic    #256 <Method Long Long.valueOf(long)>
	//   32   74:aload_3         
	//   33   75:invokeinterface #471 <Method Object Map.put(Object, Object)>
	//   34   80:pop             
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) ((zzcz)getService()));
	//   35   81:aload_0         
	//   36   82:invokevirtual   #334 <Method IInterface getService()>
	//   37   85:checkcast       #309 <Class zzcz>
	//   38   88:astore_3        
		if(zzcr())
	//*  39   89:aload_0         
	//*  40   90:invokespecial   #458 <Method boolean zzcr()>
	//*  41   93:ifeq            107
		{
			((zzcz) (resultholder)).zza(s, s1, l);
	//   42   96:aload_3         
	//   43   97:aload_1         
	//   44   98:aload_2         
	//   45   99:lload           4
	//   46  101:invokeinterface #552 <Method void zzcz.zza(String, String, long)>
			return;
	//   47  106:return          
		}
		try
		{
			zzb(l, 2016);
	//   48  107:aload_0         
	//   49  108:lload           4
	//   50  110:sipush          2016
	//   51  113:invokespecial   #172 <Method void zzb(long, int)>
			return;
	//   52  116:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  53  117:astore_1        
		{
			zzvm.remove(((Object) (Long.valueOf(l))));
	//   54  118:aload_0         
	//   55  119:getfield        #98  <Field Map zzvm>
	//   56  122:lload           4
	//   57  124:invokestatic    #256 <Method Long Long.valueOf(long)>
	//   58  127:invokeinterface #262 <Method Object Map.remove(Object)>
	//   59  132:pop             
		}
		throw s;
	//   60  133:aload_1         
	//   61  134:athrow          
	}

	public final void zzb(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws IllegalStateException, RemoteException
	{
		zzc(resultholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #515 <Method void zzc(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) ((zzcz)getService()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method IInterface getService()>
	//    5    9:checkcast       #309 <Class zzcz>
	//    6   12:astore_1        
		if(zzcr())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #458 <Method boolean zzcr()>
	//*   9   17:ifeq            27
		{
			((zzcz) (resultholder)).zzcx();
	//   10   20:aload_1         
	//   11   21:invokeinterface #556 <Method void zzcz.zzcx()>
			return;
	//   12   26:return          
		} else
		{
			zzm(2016);
	//   13   27:aload_0         
	//   14   28:sipush          2016
	//   15   31:invokespecial   #167 <Method void zzm(int)>
			return;
	//   16   34:return          
		}
	}

	public final void zzl(int i)
	{
		synchronized(zzvp)
	//*   0    0:getstatic       #69  <Field Object zzvp>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzvn != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
	//*   6   10:ifnull          42
			{
				zzvn.setResult(((Object) (new zzco(new Status(i)))));
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
	//    9   17:new             #114 <Class zzco>
	//   10   20:dup             
	//   11   21:new             #116 <Class Status>
	//   12   24:dup             
	//   13   25:iload_1         
	//   14   26:invokespecial   #119 <Method void Status(int)>
	//   15   29:invokespecial   #122 <Method void zzco(Status)>
	//   16   32:invokeinterface #128 <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
				zzvn = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #108 <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzvn>
			}
		}
	//   20   42:aload_2         
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		exception;
	//   23   45:astore_3        
		obj;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw exception;
	//   26   48:aload_3         
	//   27   49:athrow          
	}

	private static final zzdg zzbd = new zzdg("CastClientImpl");
	private static final Object zzvp = new Object();
	private static final Object zzvq = new Object();
	private final Bundle extras;
	private final com.google.android.gms.cast.Cast.Listener zzaj;
	private double zzei;
	private boolean zzej;
	private final CastDevice zzhq;
	private ApplicationMetadata zzux;
	private final Map zzuy = new HashMap();
	private final long zzuz;
	private zzcp zzva;
	private String zzvb;
	private boolean zzvc;
	private boolean zzvd;
	private boolean zzve;
	private zzad zzvf;
	private int zzvg;
	private int zzvh;
	private final AtomicLong zzvi = new AtomicLong(0L);
	private String zzvj;
	private String zzvk;
	private Bundle zzvl;
	private final Map zzvm = new HashMap();
	private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzvn;
	private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzvo;

	static 
	{
	//    0    0:new             #55  <Class zzdg>
	//    1    3:dup             
	//    2    4:ldc1            #57  <String "CastClientImpl">
	//    3    6:invokespecial   #61  <Method void zzdg(String)>
	//    4    9:putstatic       #63  <Field zzdg zzbd>
	//    5   12:new             #65  <Class Object>
	//    6   15:dup             
	//    7   16:invokespecial   #67  <Method void Object()>
	//    8   19:putstatic       #69  <Field Object zzvp>
	//    9   22:new             #65  <Class Object>
	//   10   25:dup             
	//   11   26:invokespecial   #67  <Method void Object()>
	//   12   29:putstatic       #71  <Field Object zzvq>
	//*  13   32:return          
	}
}
