// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.IntentFilter;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfm, zzfo, zzdi, zzfp, 
//			zzby, zzfq, zzeb, zzfr, 
//			zzdn, zzcc, zzcb

final class zzfn extends zzfm
{

	private zzfn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zzfm()>
		zzbgd = 0x1b7740;
	//    2    4:aload_0         
	//    3    5:ldc1            #42  <Int 0x1b7740>
	//    4    7:putfield        #44  <Field int zzbgd>
		zzbge = true;
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:putfield        #46  <Field boolean zzbge>
		zzbgf = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #48  <Field boolean zzbgf>
		connected = true;
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:putfield        #50  <Field boolean connected>
		zzbgg = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #52  <Field boolean zzbgg>
		zzbdt = ((zzcc) (new zzfo(this)));
	//   17   30:aload_0         
	//   18   31:new             #54  <Class zzfo>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:invokespecial   #57  <Method void zzfo(zzfn)>
	//   22   39:putfield        #59  <Field zzcc zzbdt>
		zzbgj = false;
	//   23   42:aload_0         
	//   24   43:iconst_0        
	//   25   44:putfield        #61  <Field boolean zzbgj>
	//   26   47:return          
	}

	private final boolean isPowerSaveMode()
	{
		return zzbgj || !connected || zzbgd <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean zzbgj>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field boolean connected>
	//    5   11:ifeq            26
	//    6   14:aload_0         
	//    7   15:getfield        #44  <Field int zzbgd>
	//    8   18:ifgt            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	static Context zza(zzfn zzfn1)
	{
		return zzfn1.zzbga;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Context zzbga>
	//    2    4:areturn         
	}

	static boolean zzb(zzfn zzfn1)
	{
		return zzfn1.isPowerSaveMode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method boolean isPowerSaveMode()>
	//    2    4:ireturn         
	}

	static int zzc(zzfn zzfn1)
	{
		return zzfn1.zzbgd;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int zzbgd>
	//    2    4:ireturn         
	}

	static boolean zzd(zzfn zzfn1)
	{
		return zzfn1.connected;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean connected>
	//    2    4:ireturn         
	}

	static zzcb zze(zzfn zzfn1)
	{
		return zzfn1.zzbgb;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field zzcb zzbgb>
	//    2    4:areturn         
	}

	public static zzfn zzqe()
	{
		if(zzbgk == null)
	//*   0    0:getstatic       #82  <Field zzfn zzbgk>
	//*   1    3:ifnonnull       16
			zzbgk = new zzfn();
	//    2    6:new             #2   <Class zzfn>
	//    3    9:dup             
	//    4   10:invokespecial   #83  <Method void zzfn()>
	//    5   13:putstatic       #82  <Field zzfn zzbgk>
		return zzbgk;
	//    6   16:getstatic       #82  <Field zzfn zzbgk>
	//    7   19:areturn         
	}

	static Object zzqg()
	{
		return zzbfz;
	//    0    0:getstatic       #39  <Field Object zzbfz>
	//    1    3:areturn         
	}

	public final void dispatch()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzbgf)
			break MISSING_BLOCK_LABEL_22;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field boolean zzbgf>
	//    4    6:ifne            22
		zzdi.v("Dispatch call queued. Dispatch will run once initialization is complete.");
	//    5    9:ldc1            #88  <String "Dispatch call queued. Dispatch will run once initialization is complete.">
	//    6   11:invokestatic    #94  <Method void zzdi.v(String)>
		zzbge = true;
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:putfield        #46  <Field boolean zzbge>
		this;
	//   10   19:aload_0         
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		zzbgc.zzh(((Runnable) (new zzfp(this))));
	//   13   22:aload_0         
	//   14   23:getfield        #96  <Field zzby zzbgc>
	//   15   26:new             #98  <Class zzfp>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokespecial   #99  <Method void zzfp(zzfn)>
	//   19   34:invokeinterface #105 <Method void zzby.zzh(Runnable)>
		this;
	//   20   39:aload_0         
		JVM INSTR monitorexit ;
	//   21   40:monitorexit     
		return;
	//   22   41:return          
		Exception exception;
		exception;
	//   23   42:astore_1        
	//*  24   43:aload_0         
		throw exception;
	//   25   44:monitorexit     
	//   26   45:aload_1         
	//   27   46:athrow          
	}

	final void zza(Context context, zzby zzby1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Context context1 = zzbga;
	//    2    2:aload_0         
	//    3    3:getfield        #67  <Field Context zzbga>
	//    4    6:astore_3        
		if(context1 == null)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:aload_3         
	//    6    8:ifnull          14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzbga = context.getApplicationContext();
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokevirtual   #112 <Method Context Context.getApplicationContext()>
	//   13   19:putfield        #67  <Field Context zzbga>
		if(zzbgc == null)
	//*  14   22:aload_0         
	//*  15   23:getfield        #96  <Field zzby zzbgc>
	//*  16   26:ifnonnull       34
			zzbgc = zzby1;
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:putfield        #96  <Field zzby zzbgc>
		this;
	//   20   34:aload_0         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		context;
	//   23   37:astore_1        
	//*  24   38:aload_0         
		throw context;
	//   25   39:monitorexit     
	//   26   40:aload_1         
	//   27   41:athrow          
	}

	final void zzb(boolean flag, boolean flag1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag2;
		flag2 = isPowerSaveMode();
	//    2    2:aload_0         
	//    3    3:invokespecial   #71  <Method boolean isPowerSaveMode()>
	//    4    6:istore_3        
		zzbgj = flag;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #61  <Field boolean zzbgj>
		connected = flag1;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #50  <Field boolean connected>
		flag = isPowerSaveMode();
	//   11   17:aload_0         
	//   12   18:invokespecial   #71  <Method boolean isPowerSaveMode()>
	//   13   21:istore_1        
		if(flag != flag2)
			break MISSING_BLOCK_LABEL_30;
	//   14   22:iload_1         
	//   15   23:iload_3         
	//   16   24:icmpne          30
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		return;
	//   19   29:return          
		if(!isPowerSaveMode())
			break MISSING_BLOCK_LABEL_54;
	//   20   30:aload_0         
	//   21   31:invokespecial   #71  <Method boolean isPowerSaveMode()>
	//   22   34:ifeq            54
		zzbgh.cancel();
	//   23   37:aload_0         
	//   24   38:getfield        #115 <Field zzfq zzbgh>
	//   25   41:invokeinterface #120 <Method void zzfq.cancel()>
		zzdi.v("PowerSaveMode initiated.");
	//   26   46:ldc1            #122 <String "PowerSaveMode initiated.">
	//   27   48:invokestatic    #94  <Method void zzdi.v(String)>
		this;
	//   28   51:aload_0         
		JVM INSTR monitorexit ;
	//   29   52:monitorexit     
		return;
	//   30   53:return          
		zzbgh.zzh(zzbgd);
	//   31   54:aload_0         
	//   32   55:getfield        #115 <Field zzfq zzbgh>
	//   33   58:aload_0         
	//   34   59:getfield        #44  <Field int zzbgd>
	//   35   62:i2l             
	//   36   63:invokeinterface #125 <Method void zzfq.zzh(long)>
		zzdi.v("PowerSaveMode terminated.");
	//   37   68:ldc1            #127 <String "PowerSaveMode terminated.">
	//   38   70:invokestatic    #94  <Method void zzdi.v(String)>
		this;
	//   39   73:aload_0         
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		return;
	//   41   75:return          
		Exception exception;
		exception;
	//   42   76:astore          4
	//*  43   78:aload_0         
		throw exception;
	//   44   79:monitorexit     
	//   45   80:aload           4
	//   46   82:athrow          
	}

	public final void zzp(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzb(zzbgj, flag);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #61  <Field boolean zzbgj>
	//    5    7:iload_1         
	//    6    8:invokevirtual   #132 <Method void zzb(boolean, boolean)>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_2        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_2         
	//   14   18:athrow          
	}

	public final void zzqd()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isPowerSaveMode())
	//*   2    2:aload_0         
	//*   3    3:invokespecial   #71  <Method boolean isPowerSaveMode()>
	//*   4    6:ifne            18
			zzbgh.zzqh();
	//    5    9:aload_0         
	//    6   10:getfield        #115 <Field zzfq zzbgh>
	//    7   13:invokeinterface #136 <Method void zzfq.zzqh()>
		this;
	//    8   18:aload_0         
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		return;
	//   10   20:return          
		Exception exception;
		exception;
	//   11   21:astore_1        
	//*  12   22:aload_0         
		throw exception;
	//   13   23:monitorexit     
	//   14   24:aload_1         
	//   15   25:athrow          
	}

	final zzcb zzqf()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzcb zzcb;
		if(zzbgb == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #78  <Field zzcb zzbgb>
	//*   4    6:ifnonnull       45
		{
			if(zzbga == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #67  <Field Context zzbga>
	//*   7   13:ifnonnull       26
				throw new IllegalStateException("Cant get a store unless we have a context");
	//    8   16:new             #140 <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc1            #142 <String "Cant get a store unless we have a context">
	//   11   22:invokespecial   #144 <Method void IllegalStateException(String)>
	//   12   25:athrow          
			zzbgb = ((zzcb) (new zzeb(zzbdt, zzbga)));
	//   13   26:aload_0         
	//   14   27:new             #146 <Class zzeb>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:getfield        #59  <Field zzcc zzbdt>
	//   18   35:aload_0         
	//   19   36:getfield        #67  <Field Context zzbga>
	//   20   39:invokespecial   #149 <Method void zzeb(zzcc, Context)>
	//   21   42:putfield        #78  <Field zzcb zzbgb>
		}
		if(zzbgh == null)
	//*  22   45:aload_0         
	//*  23   46:getfield        #115 <Field zzfq zzbgh>
	//*  24   49:ifnonnull       86
		{
			zzbgh = ((zzfq) (new zzfr(this, ((zzfo) (null)))));
	//   25   52:aload_0         
	//   26   53:new             #151 <Class zzfr>
	//   27   56:dup             
	//   28   57:aload_0         
	//   29   58:aconst_null     
	//   30   59:invokespecial   #154 <Method void zzfr(zzfn, zzfo)>
	//   31   62:putfield        #115 <Field zzfq zzbgh>
			if(zzbgd > 0)
	//*  32   65:aload_0         
	//*  33   66:getfield        #44  <Field int zzbgd>
	//*  34   69:ifle            86
				zzbgh.zzh(zzbgd);
	//   35   72:aload_0         
	//   36   73:getfield        #115 <Field zzfq zzbgh>
	//   37   76:aload_0         
	//   38   77:getfield        #44  <Field int zzbgd>
	//   39   80:i2l             
	//   40   81:invokeinterface #125 <Method void zzfq.zzh(long)>
		}
		zzbgf = true;
	//   41   86:aload_0         
	//   42   87:iconst_1        
	//   43   88:putfield        #48  <Field boolean zzbgf>
		if(zzbge)
	//*  44   91:aload_0         
	//*  45   92:getfield        #46  <Field boolean zzbge>
	//*  46   95:ifeq            107
		{
			((zzfm)this).dispatch();
	//   47   98:aload_0         
	//   48   99:invokevirtual   #156 <Method void zzfm.dispatch()>
			zzbge = false;
	//   49  102:aload_0         
	//   50  103:iconst_0        
	//   51  104:putfield        #46  <Field boolean zzbge>
		}
		if(zzbgi == null && zzbgg)
	//*  52  107:aload_0         
	//*  53  108:getfield        #158 <Field zzdn zzbgi>
	//*  54  111:ifnonnull       193
	//*  55  114:aload_0         
	//*  56  115:getfield        #52  <Field boolean zzbgg>
	//*  57  118:ifeq            193
		{
			zzbgi = new zzdn(((zzfm) (this)));
	//   58  121:aload_0         
	//   59  122:new             #160 <Class zzdn>
	//   60  125:dup             
	//   61  126:aload_0         
	//   62  127:invokespecial   #163 <Method void zzdn(zzfm)>
	//   63  130:putfield        #158 <Field zzdn zzbgi>
			zzdn zzdn1 = zzbgi;
	//   64  133:aload_0         
	//   65  134:getfield        #158 <Field zzdn zzbgi>
	//   66  137:astore_1        
			Context context = zzbga;
	//   67  138:aload_0         
	//   68  139:getfield        #67  <Field Context zzbga>
	//   69  142:astore_2        
			IntentFilter intentfilter = new IntentFilter();
	//   70  143:new             #165 <Class IntentFilter>
	//   71  146:dup             
	//   72  147:invokespecial   #166 <Method void IntentFilter()>
	//   73  150:astore_3        
			intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
	//   74  151:aload_3         
	//   75  152:ldc1            #168 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   76  154:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
			context.registerReceiver(((android.content.BroadcastReceiver) (zzdn1)), intentfilter);
	//   77  157:aload_2         
	//   78  158:aload_1         
	//   79  159:aload_3         
	//   80  160:invokevirtual   #175 <Method android.content.Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   81  163:pop             
			intentfilter = new IntentFilter();
	//   82  164:new             #165 <Class IntentFilter>
	//   83  167:dup             
	//   84  168:invokespecial   #166 <Method void IntentFilter()>
	//   85  171:astore_3        
			intentfilter.addAction("com.google.analytics.RADIO_POWERED");
	//   86  172:aload_3         
	//   87  173:ldc1            #177 <String "com.google.analytics.RADIO_POWERED">
	//   88  175:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
			intentfilter.addCategory(context.getPackageName());
	//   89  178:aload_3         
	//   90  179:aload_2         
	//   91  180:invokevirtual   #181 <Method String Context.getPackageName()>
	//   92  183:invokevirtual   #184 <Method void IntentFilter.addCategory(String)>
			context.registerReceiver(((android.content.BroadcastReceiver) (zzdn1)), intentfilter);
	//   93  186:aload_2         
	//   94  187:aload_1         
	//   95  188:aload_3         
	//   96  189:invokevirtual   #175 <Method android.content.Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   97  192:pop             
		}
		zzcb = zzbgb;
	//   98  193:aload_0         
	//   99  194:getfield        #78  <Field zzcb zzbgb>
	//  100  197:astore_1        
		this;
	//  101  198:aload_0         
		JVM INSTR monitorexit ;
	//  102  199:monitorexit     
		return zzcb;
	//  103  200:aload_1         
	//  104  201:areturn         
		Exception exception;
		exception;
	//  105  202:astore_1        
	//* 106  203:aload_0         
		throw exception;
	//  107  204:monitorexit     
	//  108  205:aload_1         
	//  109  206:athrow          
	}

	private static final Object zzbfz = new Object();
	private static zzfn zzbgk;
	private boolean connected;
	private zzcc zzbdt;
	private Context zzbga;
	private zzcb zzbgb;
	private volatile zzby zzbgc;
	private int zzbgd;
	private boolean zzbge;
	private boolean zzbgf;
	private boolean zzbgg;
	private zzfq zzbgh;
	private zzdn zzbgi;
	private boolean zzbgj;

	static 
	{
	//    0    0:new             #34  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void Object()>
	//    3    7:putstatic       #39  <Field Object zzbfz>
	//*   4   10:return          
	}
}
