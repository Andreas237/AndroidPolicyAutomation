// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx, zzaji, zzabk, zzakb, 
//			zzaej, zzakk, zzabi, zzabj, 
//			zzabm, zzajh

public abstract class zzabh extends zzajx
{

	protected zzabh(Context context, zzaji zzaji1, zzabm zzabm)
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #23  <Method void zzajx(boolean)>
	//    3    5:aload_0         
	//    4    6:new             #25  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void Object()>
	//    7   13:putfield        #30  <Field Object mLock>
	//    8   16:aload_0         
	//    9   17:new             #25  <Class Object>
	//   10   20:dup             
	//   11   21:invokespecial   #28  <Method void Object()>
	//   12   24:putfield        #32  <Field Object zzbzh>
		mContext = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #34  <Field Context mContext>
		zzbze = zzaji1;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #36  <Field zzaji zzbze>
		zzbzf = zzaji1.zzcos;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:getfield        #41  <Field zzaej zzaji.zzcos>
	//   22   42:putfield        #43  <Field zzaej zzbzf>
		zzbzd = zzabm;
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:putfield        #45  <Field zzabm zzbzd>
	//   26   50:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	protected abstract zzajh zzaa(int i);

	public final void zzdn()
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object mLock>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		zzakb.zzck("AdRendererBackgroundTask started.");
	//    5    7:ldc1            #54  <String "AdRendererBackgroundTask started.">
	//    6    9:invokestatic    #60  <Method void zzakb.zzck(String)>
		i = zzbze.errorCode;
	//    7   12:aload_0         
	//    8   13:getfield        #36  <Field zzaji zzbze>
	//    9   16:getfield        #64  <Field int zzaji.errorCode>
	//   10   19:istore_1        
		zze(SystemClock.elapsedRealtime());
	//   11   20:aload_0         
	//   12   21:invokestatic    #70  <Method long SystemClock.elapsedRealtime()>
	//   13   24:invokevirtual   #74  <Method void zze(long)>
		break MISSING_BLOCK_LABEL_124;
	//   14   27:goto            124
		Object obj;
		obj;
	//   15   30:astore_2        
		i = ((zzabk) (obj)).getErrorCode();
	//   16   31:aload_2         
	//   17   32:invokevirtual   #78  <Method int zzabk.getErrorCode()>
	//   18   35:istore_1        
		if(i == 3 || i == -1)
	//*  19   36:iload_1         
	//*  20   37:iconst_3        
	//*  21   38:icmpeq          59
	//*  22   41:iload_1         
	//*  23   42:iconst_m1       
	//*  24   43:icmpne          49
			break MISSING_BLOCK_LABEL_59;
	//   25   46:goto            59
		zzakb.zzdk(((zzabk) (obj)).getMessage());
	//   26   49:aload_2         
	//   27   50:invokevirtual   #82  <Method String zzabk.getMessage()>
	//   28   53:invokestatic    #85  <Method void zzakb.zzdk(String)>
		break MISSING_BLOCK_LABEL_66;
	//   29   56:goto            66
		zzakb.zzdj(((zzabk) (obj)).getMessage());
	//   30   59:aload_2         
	//   31   60:invokevirtual   #82  <Method String zzabk.getMessage()>
	//   32   63:invokestatic    #88  <Method void zzakb.zzdj(String)>
		zzaej zzaej1;
		if(zzbzf != null)
			break MISSING_BLOCK_LABEL_90;
	//   33   66:aload_0         
	//   34   67:getfield        #43  <Field zzaej zzbzf>
	//   35   70:ifnonnull       90
		zzaej1 = new zzaej(i);
	//   36   73:new             #90  <Class zzaej>
	//   37   76:dup             
	//   38   77:iload_1         
	//   39   78:invokespecial   #93  <Method void zzaej(int)>
	//   40   81:astore_2        
_L1:
		zzbzf = zzaej1;
	//   41   82:aload_0         
	//   42   83:aload_2         
	//   43   84:putfield        #43  <Field zzaej zzbzf>
		break MISSING_BLOCK_LABEL_109;
	//   44   87:goto            109
		zzaej1 = new zzaej(i, zzbzf.zzbsu);
	//   45   90:new             #90  <Class zzaej>
	//   46   93:dup             
	//   47   94:iload_1         
	//   48   95:aload_0         
	//   49   96:getfield        #43  <Field zzaej zzbzf>
	//   50   99:getfield        #97  <Field long zzaej.zzbsu>
	//   51  102:invokespecial   #100 <Method void zzaej(int, long)>
	//   52  105:astore_2        
		  goto _L1
	//*  53  106:goto            82
		zzakk.zzcrm.post(((Runnable) (new zzabi(this))));
	//   54  109:getstatic       #106 <Field Handler zzakk.zzcrm>
	//   55  112:new             #108 <Class zzabi>
	//   56  115:dup             
	//   57  116:aload_0         
	//   58  117:invokespecial   #111 <Method void zzabi(zzabh)>
	//   59  120:invokevirtual   #117 <Method boolean Handler.post(Runnable)>
	//   60  123:pop             
		zzajh zzajh = zzaa(i);
	//   61  124:aload_0         
	//   62  125:iload_1         
	//   63  126:invokevirtual   #119 <Method zzajh zzaa(int)>
	//   64  129:astore_2        
		zzakk.zzcrm.post(((Runnable) (new zzabj(this, zzajh))));
	//   65  130:getstatic       #106 <Field Handler zzakk.zzcrm>
	//   66  133:new             #121 <Class zzabj>
	//   67  136:dup             
	//   68  137:aload_0         
	//   69  138:aload_2         
	//   70  139:invokespecial   #124 <Method void zzabj(zzabh, zzajh)>
	//   71  142:invokevirtual   #117 <Method boolean Handler.post(Runnable)>
	//   72  145:pop             
		obj1;
	//   73  146:aload_3         
		JVM INSTR monitorexit ;
	//   74  147:monitorexit     
		return;
	//   75  148:return          
		zzajh;
	//   76  149:astore_2        
		obj1;
	//   77  150:aload_3         
		JVM INSTR monitorexit ;
	//   78  151:monitorexit     
		throw zzajh;
	//   79  152:aload_2         
	//   80  153:athrow          
	}

	protected abstract void zze(long l)
		throws zzabk;

	protected final Context mContext;
	protected final Object mLock = new Object();
	protected final zzabm zzbzd;
	protected final zzaji zzbze;
	protected zzaej zzbzf;
	protected final Object zzbzh = new Object();
}
