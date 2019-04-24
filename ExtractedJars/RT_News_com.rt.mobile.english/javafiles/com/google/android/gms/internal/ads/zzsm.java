// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzm, zzsf, zzsn, zzso, 
//			zzsr, zzamg, zzae, zzsg, 
//			zznk, zzkb, zzni, zzaev, 
//			zzsi, zzp, zzakb, zzr

public final class zzsm
	implements zzm
{

	public zzsm(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Object()>
	//    6   12:putfield        #25  <Field Object mLock>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #27  <Field Context mContext>
	//   10   20:return          
	}

	private final void disconnect()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzbnl != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field zzsf zzbnl>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		zzbnl.disconnect();
	//   11   17:aload_0         
	//   12   18:getfield        #31  <Field zzsf zzbnl>
	//   13   21:invokevirtual   #35  <Method void zzsf.disconnect()>
		zzbnl = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #31  <Field zzsf zzbnl>
		Binder.flushPendingCommands();
	//   17   29:invokestatic    #40  <Method void Binder.flushPendingCommands()>
		obj;
	//   18   32:aload_1         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return;
	//   20   34:return          
		exception;
	//   21   35:astore_2        
		obj;
	//   22   36:aload_1         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		throw exception;
	//   24   38:aload_2         
	//   25   39:athrow          
	}

	static void zza(zzsm zzsm1)
	{
		zzsm1.disconnect();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void disconnect()>
	//    2    4:return          
	}

	static boolean zza(zzsm zzsm1, boolean flag)
	{
		zzsm1.zzbnm = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #46  <Field boolean zzbnm>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static Object zzb(zzsm zzsm1)
	{
		return zzsm1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object mLock>
	//    2    4:areturn         
	}

	private final Future zzb(zzsg zzsg1)
	{
		zzsn zzsn1 = new zzsn(this);
	//    0    0:new             #51  <Class zzsn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void zzsn(zzsm)>
	//    4    8:astore_2        
		zzso zzso1 = new zzso(this, ((zzaoj) (zzsn1)), zzsg1);
	//    5    9:new             #55  <Class zzso>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokespecial   #58  <Method void zzso(zzsm, zzaoj, zzsg)>
	//   11   19:astore_3        
		zzsr zzsr1 = new zzsr(this, ((zzaoj) (zzsn1)));
	//   12   20:new             #60  <Class zzsr>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokespecial   #63  <Method void zzsr(zzsm, zzaoj)>
	//   17   29:astore          4
		synchronized(mLock)
	//*  18   31:aload_0         
	//*  19   32:getfield        #25  <Field Object mLock>
	//*  20   35:astore_1        
	//*  21   36:aload_1         
	//*  22   37:monitorenter    
		{
			zzbnl = new zzsf(mContext, zzbv.zzez().zzsa(), ((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) (zzso1)), ((com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) (zzsr1)));
	//   23   38:aload_0         
	//   24   39:new             #33  <Class zzsf>
	//   25   42:dup             
	//   26   43:aload_0         
	//   27   44:getfield        #27  <Field Context mContext>
	//   28   47:invokestatic    #69  <Method zzamg zzbv.zzez()>
	//   29   50:invokevirtual   #75  <Method android.os.Looper zzamg.zzsa()>
	//   30   53:aload_3         
	//   31   54:aload           4
	//   32   56:invokespecial   #78  <Method void zzsf(Context, android.os.Looper, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener)>
	//   33   59:putfield        #31  <Field zzsf zzbnl>
			zzbnl.checkAvailabilityAndConnect();
	//   34   62:aload_0         
	//   35   63:getfield        #31  <Field zzsf zzbnl>
	//   36   66:invokevirtual   #81  <Method void zzsf.checkAvailabilityAndConnect()>
		}
	//   37   69:aload_1         
	//   38   70:monitorexit     
		return ((Future) (zzsn1));
	//   39   71:aload_2         
	//   40   72:areturn         
		exception;
	//   41   73:astore_2        
		zzsg1;
	//   42   74:aload_1         
		JVM INSTR monitorexit ;
	//   43   75:monitorexit     
		throw exception;
	//   44   76:aload_2         
	//   45   77:athrow          
	}

	static boolean zzc(zzsm zzsm1)
	{
		return zzsm1.zzbnm;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean zzbnm>
	//    2    4:ireturn         
	}

	static zzsf zzd(zzsm zzsm1)
	{
		return zzsm1.zzbnl;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzsf zzbnl>
	//    2    4:areturn         
	}

	public final zzp zzc(zzr zzr)
		throws zzae
	{
		long l;
		long l1;
		zzr = ((zzr) (zzsg.zzh(zzr)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #102 <Method zzsg zzsg.zzh(zzr)>
	//    2    4:astore_1        
		zzna zzna = zznk.zzbdx;
	//    3    5:getstatic       #108 <Field zzna zznk.zzbdx>
	//    4    8:astore          7
		l1 = ((Integer)zzkb.zzik().zzd(zzna)).intValue();
	//    5   10:invokestatic    #114 <Method zzni zzkb.zzik()>
	//    6   13:aload           7
	//    7   15:invokevirtual   #119 <Method Object zzni.zzd(zzna)>
	//    8   18:checkcast       #121 <Class Integer>
	//    9   21:invokevirtual   #125 <Method int Integer.intValue()>
	//   10   24:i2l             
	//   11   25:lstore          5
		l = zzbv.zzer().elapsedRealtime();
	//   12   27:invokestatic    #129 <Method Clock zzbv.zzer()>
	//   13   30:invokeinterface #135 <Method long Clock.elapsedRealtime()>
	//   14   35:lstore_3        
		zzr = ((zzr) ((zzsi)(new zzaev((ParcelFileDescriptor)zzb(((zzsg) (zzr))).get(l1, TimeUnit.MILLISECONDS))).zza(zzsi.CREATOR)));
	//   15   36:new             #137 <Class zzaev>
	//   16   39:dup             
	//   17   40:aload_0         
	//   18   41:aload_1         
	//   19   42:invokespecial   #139 <Method Future zzb(zzsg)>
	//   20   45:lload           5
	//   21   47:getstatic       #145 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   22   50:invokeinterface #151 <Method Object Future.get(long, TimeUnit)>
	//   23   55:checkcast       #153 <Class ParcelFileDescriptor>
	//   24   58:invokespecial   #156 <Method void zzaev(ParcelFileDescriptor)>
	//   25   61:getstatic       #162 <Field android.os.Parcelable$Creator zzsi.CREATOR>
	//   26   64:invokevirtual   #165 <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzaev.zza(android.os.Parcelable$Creator)>
	//   27   67:checkcast       #158 <Class zzsi>
	//   28   70:astore_1        
		if(((zzsi) (zzr)).zzbnj)
	//*  29   71:aload_1         
	//*  30   72:getfield        #168 <Field boolean zzsi.zzbnj>
	//*  31   75:ifeq            90
			throw new zzae(((zzsi) (zzr)).zzbnk);
	//   32   78:new             #90  <Class zzae>
	//   33   81:dup             
	//   34   82:aload_1         
	//   35   83:getfield        #172 <Field String zzsi.zzbnk>
	//   36   86:invokespecial   #175 <Method void zzae(String)>
	//   37   89:athrow          
		if(((zzsi) (zzr)).zzbnh.length != ((zzsi) (zzr)).zzbni.length)
	//*  38   90:aload_1         
	//*  39   91:getfield        #179 <Field String[] zzsi.zzbnh>
	//*  40   94:arraylength     
	//*  41   95:aload_1         
	//*  42   96:getfield        #182 <Field String[] zzsi.zzbni>
	//*  43   99:arraylength     
	//*  44  100:icmpeq          108
		{
			zzr = null;
	//   45  103:aconst_null     
	//   46  104:astore_1        
			break MISSING_BLOCK_LABEL_179;
	//   47  105:goto            179
		}
		int i;
		long l2;
		Object obj;
		try
		{
			obj = ((Object) (new HashMap()));
	//   48  108:new             #184 <Class HashMap>
	//   49  111:dup             
	//   50  112:invokespecial   #185 <Method void HashMap()>
	//   51  115:astore          7
		}
	//*  52  117:iconst_0        
	//*  53  118:istore_2        
	//*  54  119:iload_2         
	//*  55  120:aload_1         
	//*  56  121:getfield        #179 <Field String[] zzsi.zzbnh>
	//*  57  124:arraylength     
	//*  58  125:icmpge          153
	//*  59  128:aload           7
	//*  60  130:aload_1         
	//*  61  131:getfield        #179 <Field String[] zzsi.zzbnh>
	//*  62  134:iload_2         
	//*  63  135:aaload          
	//*  64  136:aload_1         
	//*  65  137:getfield        #182 <Field String[] zzsi.zzbni>
	//*  66  140:iload_2         
	//*  67  141:aaload          
	//*  68  142:invokevirtual   #189 <Method Object HashMap.put(Object, Object)>
	//*  69  145:pop             
	//*  70  146:iload_2         
	//*  71  147:iconst_1        
	//*  72  148:iadd            
	//*  73  149:istore_2        
	//*  74  150:goto            119
	//*  75  153:new             #191 <Class zzp>
	//*  76  156:dup             
	//*  77  157:aload_1         
	//*  78  158:getfield        #195 <Field int zzsi.statusCode>
	//*  79  161:aload_1         
	//*  80  162:getfield        #199 <Field byte[] zzsi.data>
	//*  81  165:aload           7
	//*  82  167:aload_1         
	//*  83  168:getfield        #202 <Field boolean zzsi.zzac>
	//*  84  171:aload_1         
	//*  85  172:getfield        #206 <Field long zzsi.zzad>
	//*  86  175:invokespecial   #209 <Method void zzp(int, byte[], java.util.Map, boolean, long)>
	//*  87  178:astore_1        
	//*  88  179:invokestatic    #129 <Method Clock zzbv.zzer()>
	//*  89  182:invokeinterface #135 <Method long Clock.elapsedRealtime()>
	//*  90  187:lstore          5
	//*  91  189:new             #211 <Class StringBuilder>
	//*  92  192:dup             
	//*  93  193:bipush          52
	//*  94  195:invokespecial   #214 <Method void StringBuilder(int)>
	//*  95  198:astore          7
	//*  96  200:aload           7
	//*  97  202:ldc1            #216 <String "Http assets remote cache took ">
	//*  98  204:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//*  99  207:pop             
	//* 100  208:aload           7
	//* 101  210:lload           5
	//* 102  212:lload_3         
	//* 103  213:lsub            
	//* 104  214:invokevirtual   #223 <Method StringBuilder StringBuilder.append(long)>
	//* 105  217:pop             
	//* 106  218:aload           7
	//* 107  220:ldc1            #225 <String "ms">
	//* 108  222:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 109  225:pop             
	//* 110  226:aload           7
	//* 111  228:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 112  231:invokestatic    #234 <Method void zzakb.v(String)>
	//* 113  234:aload_1         
	//* 114  235:areturn         
	//* 115  236:astore_1        
	//* 116  237:invokestatic    #129 <Method Clock zzbv.zzer()>
	//* 117  240:invokeinterface #135 <Method long Clock.elapsedRealtime()>
	//* 118  245:lstore          5
	//* 119  247:new             #211 <Class StringBuilder>
	//* 120  250:dup             
	//* 121  251:bipush          52
	//* 122  253:invokespecial   #214 <Method void StringBuilder(int)>
	//* 123  256:astore          7
	//* 124  258:aload           7
	//* 125  260:ldc1            #216 <String "Http assets remote cache took ">
	//* 126  262:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 127  265:pop             
	//* 128  266:aload           7
	//* 129  268:lload           5
	//* 130  270:lload_3         
	//* 131  271:lsub            
	//* 132  272:invokevirtual   #223 <Method StringBuilder StringBuilder.append(long)>
	//* 133  275:pop             
	//* 134  276:aload           7
	//* 135  278:ldc1            #225 <String "ms">
	//* 136  280:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 137  283:pop             
	//* 138  284:aload           7
	//* 139  286:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 140  289:invokestatic    #234 <Method void zzakb.v(String)>
	//* 141  292:aload_1         
	//* 142  293:athrow          
	//* 143  294:invokestatic    #129 <Method Clock zzbv.zzer()>
	//* 144  297:invokeinterface #135 <Method long Clock.elapsedRealtime()>
	//* 145  302:lstore          5
	//* 146  304:new             #211 <Class StringBuilder>
	//* 147  307:dup             
	//* 148  308:bipush          52
	//* 149  310:invokespecial   #214 <Method void StringBuilder(int)>
	//* 150  313:astore_1        
	//* 151  314:aload_1         
	//* 152  315:ldc1            #216 <String "Http assets remote cache took ">
	//* 153  317:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 154  320:pop             
	//* 155  321:aload_1         
	//* 156  322:lload           5
	//* 157  324:lload_3         
	//* 158  325:lsub            
	//* 159  326:invokevirtual   #223 <Method StringBuilder StringBuilder.append(long)>
	//* 160  329:pop             
	//* 161  330:aload_1         
	//* 162  331:ldc1            #225 <String "ms">
	//* 163  333:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 164  336:pop             
	//* 165  337:aload_1         
	//* 166  338:invokevirtual   #229 <Method String StringBuilder.toString()>
	//* 167  341:invokestatic    #234 <Method void zzakb.v(String)>
	//* 168  344:aconst_null     
	//* 169  345:areturn         
		// Misplaced declaration of an exception variable
		catch(zzr zzr)
		{
			l2 = zzbv.zzer().elapsedRealtime();
			zzr = ((zzr) (new StringBuilder(52)));
			((StringBuilder) (zzr)).append("Http assets remote cache took ");
			((StringBuilder) (zzr)).append(l2 - l);
			((StringBuilder) (zzr)).append("ms");
			zzakb.v(((StringBuilder) (zzr)).toString());
			return null;
		}
		i = 0;
		if(i >= ((zzsi) (zzr)).zzbnh.length)
			break; /* Loop/switch isn't completed */
		((HashMap) (obj)).put(((Object) (((zzsi) (zzr)).zzbnh[i])), ((Object) (((zzsi) (zzr)).zzbni[i])));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_119;
_L1:
		zzr = ((zzr) (new zzp(((zzsi) (zzr)).statusCode, ((zzsi) (zzr)).data, ((java.util.Map) (obj)), ((zzsi) (zzr)).zzac, ((zzsi) (zzr)).zzad)));
		l2 = zzbv.zzer().elapsedRealtime();
		obj = ((Object) (new StringBuilder(52)));
		((StringBuilder) (obj)).append("Http assets remote cache took ");
		((StringBuilder) (obj)).append(l2 - l);
		((StringBuilder) (obj)).append("ms");
		zzakb.v(((StringBuilder) (obj)).toString());
		return ((zzp) (zzr));
		zzr;
		l2 = zzbv.zzer().elapsedRealtime();
		obj = ((Object) (new StringBuilder(52)));
		((StringBuilder) (obj)).append("Http assets remote cache took ");
		((StringBuilder) (obj)).append(l2 - l);
		((StringBuilder) (obj)).append("ms");
		zzakb.v(((StringBuilder) (obj)).toString());
		throw zzr;
	//* 170  346:astore_1        
	//* 171  347:goto            294
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private zzsf zzbnl;
	private boolean zzbnm;
}
