// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfa, zznk, zzvf, zzkb, 
//			zzni, zzet, zzajh, zzaqw, 
//			zzez, zzfb, zzff, zzang, 
//			zzjn, zzgd

public final class zzes
	implements zzfa
{

	public zzes(Context context, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void Object()>
	//    6   12:putfield        #29  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #31  <Class WeakHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #32  <Method void WeakHashMap()>
	//   11   23:putfield        #34  <Field WeakHashMap zzaem>
	//   12   26:aload_0         
	//   13   27:new             #36  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #37  <Method void ArrayList()>
	//   16   34:putfield        #39  <Field ArrayList zzaen>
		zzaeo = context.getApplicationContext();
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #45  <Method Context Context.getApplicationContext()>
	//   20   42:putfield        #47  <Field Context zzaeo>
		zzyf = zzang;
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:putfield        #49  <Field zzang zzyf>
		context = context.getApplicationContext();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #45  <Method Context Context.getApplicationContext()>
	//   26   54:astore_1        
		zzna zzna = zznk.zzaub;
	//   27   55:getstatic       #55  <Field zzna zznk.zzaub>
	//   28   58:astore_3        
		zzaep = new zzvf(context, zzang, (String)zzkb.zzik().zzd(zzna));
	//   29   59:aload_0         
	//   30   60:new             #57  <Class zzvf>
	//   31   63:dup             
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   35   69:aload_3         
	//   36   70:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   37   73:checkcast       #71  <Class String>
	//   38   76:invokespecial   #74  <Method void zzvf(Context, zzang, String)>
	//   39   79:putfield        #76  <Field zzvf zzaep>
	//   40   82:return          
	}

	private final boolean zzg(zzajh zzajh1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzajh1 = ((zzajh) ((zzet)zzaem.get(((Object) (zzajh1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field WeakHashMap zzaem>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #85  <Class zzet>
	//   10   18:astore_1        
		if(zzajh1 == null) goto _L2; else goto _L1
	//   11   19:aload_1         
	//   12   20:ifnull          44
_L1:
		if(!((zzet) (zzajh1)).zzge()) goto _L2; else goto _L3
	//   13   23:aload_1         
	//   14   24:invokevirtual   #89  <Method boolean zzet.zzge()>
	//   15   27:ifeq            44
_L3:
		boolean flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
	//*  18   32:goto            35
_L5:
		obj;
	//   19   35:aload_3         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return flag;
	//   21   37:iload_2         
	//   22   38:ireturn         
		zzajh1;
	//   23   39:astore_1        
		obj;
	//   24   40:aload_3         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		throw zzajh1;
	//   26   42:aload_1         
	//   27   43:athrow          
_L2:
		flag = false;
	//   28   44:iconst_0        
	//   29   45:istore_2        
		if(true) goto _L5; else goto _L4
	//   30   46:goto            35
_L4:
	}

	public final void zza(zzet zzet1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!zzet1.zzge())
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #89  <Method boolean zzet.zzge()>
	//*   7   11:ifne            72
		{
			zzaen.remove(((Object) (zzet1)));
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field ArrayList zzaen>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #95  <Method boolean ArrayList.remove(Object)>
	//   12   22:pop             
			Iterator iterator = zzaem.entrySet().iterator();
	//   13   23:aload_0         
	//   14   24:getfield        #34  <Field WeakHashMap zzaem>
	//   15   27:invokevirtual   #99  <Method Set WeakHashMap.entrySet()>
	//   16   30:invokeinterface #105 <Method Iterator Set.iterator()>
	//   17   35:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   18   36:aload_3         
	//   19   37:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   20   42:ifeq            72
				if(((java.util.Map.Entry)iterator.next()).getValue() == zzet1)
	//*  21   45:aload_3         
	//*  22   46:invokeinterface #114 <Method Object Iterator.next()>
	//*  23   51:checkcast       #116 <Class java.util.Map$Entry>
	//*  24   54:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//*  25   59:aload_1         
	//*  26   60:if_acmpne       36
					iterator.remove();
	//   27   63:aload_3         
	//   28   64:invokeinterface #121 <Method void Iterator.remove()>
			} while(true);
	//   29   69:goto            36
		}
		obj;
	//   30   72:aload_2         
		JVM INSTR monitorexit ;
	//   31   73:monitorexit     
		return;
	//   32   74:return          
		zzet1;
	//   33   75:astore_1        
		obj;
	//   34   76:aload_2         
		JVM INSTR monitorexit ;
	//   35   77:monitorexit     
		throw zzet1;
	//   36   78:aload_1         
	//   37   79:athrow          
	}

	public final void zza(zzjn zzjn, zzajh zzajh1)
	{
		zza(zzjn, zzajh1, zzajh1.zzbyo.getView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_2         
	//    4    4:getfield        #128 <Field zzaqw zzajh.zzbyo>
	//    5    7:invokeinterface #134 <Method View zzaqw.getView()>
	//    6   12:invokevirtual   #137 <Method void zza(zzjn, zzajh, View)>
	//    7   15:return          
	}

	public final void zza(zzjn zzjn, zzajh zzajh1, View view)
	{
		zza(zzjn, zzajh1, ((zzgd) (new zzez(view, zzajh1))), ((zzaqw) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #139 <Class zzez>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:aload_2         
	//    7    9:invokespecial   #142 <Method void zzez(View, zzajh)>
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #145 <Method void zza(zzjn, zzajh, zzgd, zzaqw)>
	//   10   16:return          
	}

	public final void zza(zzjn zzjn, zzajh zzajh1, View view, zzaqw zzaqw1)
	{
		zza(zzjn, zzajh1, ((zzgd) (new zzez(view, zzajh1))), zzaqw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #139 <Class zzez>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:aload_2         
	//    7    9:invokespecial   #142 <Method void zzez(View, zzajh)>
	//    8   12:aload           4
	//    9   14:invokevirtual   #145 <Method void zza(zzjn, zzajh, zzgd, zzaqw)>
	//   10   17:return          
	}

	public final void zza(zzjn zzjn, zzajh zzajh1, zzgd zzgd, zzaqw zzaqw1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(zzg(zzajh1))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:invokespecial   #149 <Method boolean zzg(zzajh)>
	//*   8   14:ifeq            32
		{
			zzjn = ((zzjn) ((zzet)zzaem.get(((Object) (zzajh1)))));
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field WeakHashMap zzaem>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//   13   25:checkcast       #85  <Class zzet>
	//   14   28:astore_1        
			break MISSING_BLOCK_LABEL_75;
	//   15   29:goto            75
		}
		zzjn = ((zzjn) (new zzet(zzaeo, zzjn, zzajh1, zzyf, zzgd)));
	//   16   32:new             #85  <Class zzet>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:getfield        #47  <Field Context zzaeo>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:getfield        #49  <Field zzang zzyf>
	//   24   46:aload_3         
	//   25   47:invokespecial   #152 <Method void zzet(Context, zzjn, zzajh, zzang, zzgd)>
	//   26   50:astore_1        
		((zzet) (zzjn)).zza(((zzfa) (this)));
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:invokevirtual   #155 <Method void zzet.zza(zzfa)>
		zzaem.put(((Object) (zzajh1)), ((Object) (zzjn)));
	//   30   56:aload_0         
	//   31   57:getfield        #34  <Field WeakHashMap zzaem>
	//   32   60:aload_2         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #159 <Method Object WeakHashMap.put(Object, Object)>
	//   35   65:pop             
		zzaen.add(((Object) (zzjn)));
	//   36   66:aload_0         
	//   37   67:getfield        #39  <Field ArrayList zzaen>
	//   38   70:aload_1         
	//   39   71:invokevirtual   #162 <Method boolean ArrayList.add(Object)>
	//   40   74:pop             
		if(zzaqw1 == null)
			break MISSING_BLOCK_LABEL_99;
	//   41   75:aload           4
	//   42   77:ifnull          99
		zzajh1 = ((zzajh) (new zzfb(((zzet) (zzjn)), zzaqw1)));
	//   43   80:new             #164 <Class zzfb>
	//   44   83:dup             
	//   45   84:aload_1         
	//   46   85:aload           4
	//   47   87:invokespecial   #167 <Method void zzfb(zzet, zzaqw)>
	//   48   90:astore_2        
_L1:
		((zzet) (zzjn)).zza(((zzfo) (zzajh1)));
	//   49   91:aload_1         
	//   50   92:aload_2         
	//   51   93:invokevirtual   #170 <Method void zzet.zza(zzfo)>
		break MISSING_BLOCK_LABEL_119;
	//   52   96:goto            119
		zzajh1 = ((zzajh) (new zzff(((zzet) (zzjn)), zzaep, zzaeo)));
	//   53   99:new             #172 <Class zzff>
	//   54  102:dup             
	//   55  103:aload_1         
	//   56  104:aload_0         
	//   57  105:getfield        #76  <Field zzvf zzaep>
	//   58  108:aload_0         
	//   59  109:getfield        #47  <Field Context zzaeo>
	//   60  112:invokespecial   #175 <Method void zzff(zzet, zzvf, Context)>
	//   61  115:astore_2        
		  goto _L1
	//*  62  116:goto            91
		obj;
	//   63  119:aload           5
		JVM INSTR monitorexit ;
	//   64  121:monitorexit     
		return;
	//   65  122:return          
		zzjn;
	//   66  123:astore_1        
		obj;
	//   67  124:aload           5
		JVM INSTR monitorexit ;
	//   68  126:monitorexit     
		throw zzjn;
	//   69  127:aload_1         
	//   70  128:athrow          
	}

	public final void zzh(zzajh zzajh1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzajh1 = ((zzajh) ((zzet)zzaem.get(((Object) (zzajh1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field WeakHashMap zzaem>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #85  <Class zzet>
	//   10   18:astore_1        
		if(zzajh1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((zzet) (zzajh1)).zzgc();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #181 <Method void zzet.zzgc()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		zzajh1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw zzajh1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final void zzi(zzajh zzajh1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzajh1 = ((zzajh) ((zzet)zzaem.get(((Object) (zzajh1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field WeakHashMap zzaem>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #85  <Class zzet>
	//   10   18:astore_1        
		if(zzajh1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((zzet) (zzajh1)).stop();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #185 <Method void zzet.stop()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		zzajh1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw zzajh1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final void zzj(zzajh zzajh1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzajh1 = ((zzajh) ((zzet)zzaem.get(((Object) (zzajh1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field WeakHashMap zzaem>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #85  <Class zzet>
	//   10   18:astore_1        
		if(zzajh1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((zzet) (zzajh1)).pause();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #189 <Method void zzet.pause()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		zzajh1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw zzajh1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final void zzk(zzajh zzajh1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzajh1 = ((zzajh) ((zzet)zzaem.get(((Object) (zzajh1)))));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field WeakHashMap zzaem>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #85  <Class zzet>
	//   10   18:astore_1        
		if(zzajh1 == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((zzet) (zzajh1)).resume();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #193 <Method void zzet.resume()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		zzajh1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw zzajh1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	private final Object mLock = new Object();
	private final WeakHashMap zzaem = new WeakHashMap();
	private final ArrayList zzaen = new ArrayList();
	private final Context zzaeo;
	private final zzvf zzaep;
	private final zzang zzyf;
}
