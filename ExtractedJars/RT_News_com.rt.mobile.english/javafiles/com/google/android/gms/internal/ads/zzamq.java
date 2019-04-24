// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamr, zznk, zzkb, zzni

public final class zzamq
{

	public zzamq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzsh = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean zzsh>
	//    5    9:aload_0         
	//    6   10:new             #26  <Class WeakHashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void WeakHashMap()>
	//    9   17:putfield        #29  <Field Map zzcud>
	//   10   20:aload_0         
	//   11   21:new             #31  <Class zzamr>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #34  <Method void zzamr(zzamq)>
	//   15   29:putfield        #36  <Field BroadcastReceiver zzcuc>
	//   16   32:return          
	}

	static void zza(zzamq zzamq1, Context context, Intent intent)
	{
		zzamq1.zzc(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method void zzc(Context, Intent)>
	//    4    6:return          
	}

	private final void zzc(Context context, Intent intent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Iterator iterator = zzcud.entrySet().iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field Map zzcud>
	//    4    6:invokeinterface #49  <Method Set Map.entrySet()>
	//    5   11:invokeinterface #55  <Method Iterator Set.iterator()>
	//    6   16:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   17:aload_3         
	//    8   18:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            75
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   10   26:aload_3         
	//   11   27:invokeinterface #65  <Method Object Iterator.next()>
	//   12   32:checkcast       #67  <Class java.util.Map$Entry>
	//   13   35:astore          4
			if(((IntentFilter)entry.getValue()).hasAction(intent.getAction()))
	//*  14   37:aload           4
	//*  15   39:invokeinterface #70  <Method Object java.util.Map$Entry.getValue()>
	//*  16   44:checkcast       #72  <Class IntentFilter>
	//*  17   47:aload_2         
	//*  18   48:invokevirtual   #78  <Method String Intent.getAction()>
	//*  19   51:invokevirtual   #82  <Method boolean IntentFilter.hasAction(String)>
	//*  20   54:ifeq            17
				((BroadcastReceiver)entry.getKey()).onReceive(context, intent);
	//   21   57:aload           4
	//   22   59:invokeinterface #85  <Method Object java.util.Map$Entry.getKey()>
	//   23   64:checkcast       #87  <Class BroadcastReceiver>
	//   24   67:aload_1         
	//   25   68:aload_2         
	//   26   69:invokevirtual   #90  <Method void BroadcastReceiver.onReceive(Context, Intent)>
		} while(true);
	//   27   72:goto            17
		this;
	//   28   75:aload_0         
		JVM INSTR monitorexit ;
	//   29   76:monitorexit     
		return;
	//   30   77:return          
		context;
	//   31   78:astore_1        
	//*  32   79:aload_0         
		throw context;
	//   33   80:monitorexit     
	//   34   81:aload_1         
	//   35   82:athrow          
	}

	public final void initialize(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzsh;
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field boolean zzsh>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzsz = context.getApplicationContext();
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokevirtual   #98  <Method Context Context.getApplicationContext()>
	//   13   19:putfield        #100 <Field Context zzsz>
		if(zzsz == null)
	//*  14   22:aload_0         
	//*  15   23:getfield        #100 <Field Context zzsz>
	//*  16   26:ifnonnull       34
			zzsz = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #100 <Field Context zzsz>
		zznk.initialize(zzsz);
	//   20   34:aload_0         
	//   21   35:getfield        #100 <Field Context zzsz>
	//   22   38:invokestatic    #104 <Method void zznk.initialize(Context)>
		context = ((Context) (zznk.zzbcc));
	//   23   41:getstatic       #108 <Field zzna zznk.zzbcc>
	//   24   44:astore_1        
		zzcue = ((Boolean)zzkb.zzik().zzd(((zzna) (context)))).booleanValue();
	//   25   45:aload_0         
	//   26   46:invokestatic    #114 <Method zzni zzkb.zzik()>
	//   27   49:aload_1         
	//   28   50:invokevirtual   #120 <Method Object zzni.zzd(zzna)>
	//   29   53:checkcast       #122 <Class Boolean>
	//   30   56:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//   31   59:putfield        #127 <Field boolean zzcue>
		context = ((Context) (new IntentFilter()));
	//   32   62:new             #72  <Class IntentFilter>
	//   33   65:dup             
	//   34   66:invokespecial   #128 <Method void IntentFilter()>
	//   35   69:astore_1        
		((IntentFilter) (context)).addAction("android.intent.action.SCREEN_ON");
	//   36   70:aload_1         
	//   37   71:ldc1            #130 <String "android.intent.action.SCREEN_ON">
	//   38   73:invokevirtual   #134 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (context)).addAction("android.intent.action.SCREEN_OFF");
	//   39   76:aload_1         
	//   40   77:ldc1            #136 <String "android.intent.action.SCREEN_OFF">
	//   41   79:invokevirtual   #134 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (context)).addAction("android.intent.action.USER_PRESENT");
	//   42   82:aload_1         
	//   43   83:ldc1            #138 <String "android.intent.action.USER_PRESENT">
	//   44   85:invokevirtual   #134 <Method void IntentFilter.addAction(String)>
		zzsz.registerReceiver(zzcuc, ((IntentFilter) (context)));
	//   45   88:aload_0         
	//   46   89:getfield        #100 <Field Context zzsz>
	//   47   92:aload_0         
	//   48   93:getfield        #36  <Field BroadcastReceiver zzcuc>
	//   49   96:aload_1         
	//   50   97:invokevirtual   #142 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   51  100:pop             
		zzsh = true;
	//   52  101:aload_0         
	//   53  102:iconst_1        
	//   54  103:putfield        #24  <Field boolean zzsh>
		this;
	//   55  106:aload_0         
		JVM INSTR monitorexit ;
	//   56  107:monitorexit     
		return;
	//   57  108:return          
		context;
	//   58  109:astore_1        
	//*  59  110:aload_0         
		throw context;
	//   60  111:monitorexit     
	//   61  112:aload_1         
	//   62  113:athrow          
	}

	public final void zza(Context context, BroadcastReceiver broadcastreceiver)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzcue)
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:getfield        #127 <Field boolean zzcue>
	//    4    6:ifeq            23
		zzcud.remove(((Object) (broadcastreceiver)));
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field Map zzcud>
	//    7   13:aload_2         
	//    8   14:invokeinterface #147 <Method Object Map.remove(Object)>
	//    9   19:pop             
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		context.unregisterReceiver(broadcastreceiver);
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #151 <Method void Context.unregisterReceiver(BroadcastReceiver)>
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		context;
	//   19   31:astore_1        
	//*  20   32:aload_0         
		throw context;
	//   21   33:monitorexit     
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public final void zza(Context context, BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzcue)
			break MISSING_BLOCK_LABEL_24;
	//    2    2:aload_0         
	//    3    3:getfield        #127 <Field boolean zzcue>
	//    4    6:ifeq            24
		zzcud.put(((Object) (broadcastreceiver)), ((Object) (intentfilter)));
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field Map zzcud>
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokeinterface #156 <Method Object Map.put(Object, Object)>
	//   10   20:pop             
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		context.registerReceiver(broadcastreceiver, intentfilter);
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:aload_3         
	//   17   27:invokevirtual   #142 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   18   30:pop             
		this;
	//   19   31:aload_0         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		return;
	//   21   33:return          
		context;
	//   22   34:astore_1        
	//*  23   35:aload_0         
		throw context;
	//   24   36:monitorexit     
	//   25   37:aload_1         
	//   26   38:athrow          
	}

	private final BroadcastReceiver zzcuc = new zzamr(this);
	private final Map zzcud = new WeakHashMap();
	private boolean zzcue;
	private boolean zzsh;
	private Context zzsz;
}
