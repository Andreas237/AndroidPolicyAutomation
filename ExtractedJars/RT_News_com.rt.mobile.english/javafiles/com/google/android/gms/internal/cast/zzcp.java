// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdc, zzcn, zzcq, zzco, 
//			zzdg, zzcs, zzcr, zzct, 
//			zzcd, zzcv

final class zzcp extends zzdc
{

	public zzcp(zzcn zzcn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzdc()>
		zzvv = new AtomicReference(((Object) (zzcn1)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void AtomicReference(Object)>
	//    7   13:putfield        #22  <Field AtomicReference zzvv>
		handler = new Handler(zzcn1.getLooper());
	//    8   16:aload_0         
	//    9   17:new             #24  <Class Handler>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #30  <Method android.os.Looper zzcn.getLooper()>
	//   13   25:invokespecial   #33  <Method void Handler(android.os.Looper)>
	//   14   28:putfield        #35  <Field Handler handler>
	//   15   31:return          
	}

	public final boolean isDisposed()
	{
		return zzvv.get() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:ifnonnull       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final void onApplicationDisconnected(int i)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_2        
		if(zzcn1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		zzcn.zza(zzcn1, ((String) (null)));
	//    8   16:aload_2         
	//    9   17:aconst_null     
	//   10   18:invokestatic    #48  <Method String zzcn.zza(zzcn, String)>
	//   11   21:pop             
		zzcn.zzb(zzcn1, ((String) (null)));
	//   12   22:aload_2         
	//   13   23:aconst_null     
	//   14   24:invokestatic    #51  <Method String zzcn.zzb(zzcn, String)>
	//   15   27:pop             
		zzcn.zza(zzcn1, i);
	//   16   28:aload_2         
	//   17   29:iload_1         
	//   18   30:invokestatic    #54  <Method void zzcn.zza(zzcn, int)>
		if(zzcn.zze(zzcn1) != null)
	//*  19   33:aload_2         
	//*  20   34:invokestatic    #58  <Method com.google.android.gms.cast.Cast$Listener zzcn.zze(zzcn)>
	//*  21   37:ifnull          58
			handler.post(((Runnable) (new zzcq(this, zzcn1, i))));
	//   22   40:aload_0         
	//   23   41:getfield        #35  <Field Handler handler>
	//   24   44:new             #60  <Class zzcq>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:iload_1         
	//   29   51:invokespecial   #63  <Method void zzcq(zzcp, zzcn, int)>
	//   30   54:invokevirtual   #67  <Method boolean Handler.post(Runnable)>
	//   31   57:pop             
	//   32   58:return          
	}

	public final void zza(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore          6
		if(zzcn1 == null)
	//*   5   12:aload           6
	//*   6   14:ifnonnull       18
			return;
	//    7   17:return          
		zzcn.zza(zzcn1, applicationmetadata);
	//    8   18:aload           6
	//    9   20:aload_1         
	//   10   21:invokestatic    #71  <Method ApplicationMetadata zzcn.zza(zzcn, ApplicationMetadata)>
	//   11   24:pop             
		zzcn.zza(zzcn1, applicationmetadata.getApplicationId());
	//   12   25:aload           6
	//   13   27:aload_1         
	//   14   28:invokevirtual   #77  <Method String ApplicationMetadata.getApplicationId()>
	//   15   31:invokestatic    #48  <Method String zzcn.zza(zzcn, String)>
	//   16   34:pop             
		zzcn.zzb(zzcn1, s1);
	//   17   35:aload           6
	//   18   37:aload_3         
	//   19   38:invokestatic    #51  <Method String zzcn.zzb(zzcn, String)>
	//   20   41:pop             
		zzcn.zzc(zzcn1, s);
	//   21   42:aload           6
	//   22   44:aload_2         
	//   23   45:invokestatic    #80  <Method String zzcn.zzc(zzcn, String)>
	//   24   48:pop             
		synchronized(zzcn.zzct())
	//*  25   49:invokestatic    #83  <Method Object zzcn.zzct()>
	//*  26   52:astore          5
	//*  27   54:aload           5
	//*  28   56:monitorenter    
		{
			if(zzcn.zzd(zzcn1) != null)
	//*  29   57:aload           6
	//*  30   59:invokestatic    #87  <Method com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzcn.zzd(zzcn)>
	//*  31   62:ifnull          102
			{
				zzcn.zzd(zzcn1).setResult(((Object) (new zzco(new Status(0), applicationmetadata, s, s1, flag))));
	//   32   65:aload           6
	//   33   67:invokestatic    #87  <Method com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzcn.zzd(zzcn)>
	//   34   70:new             #89  <Class zzco>
	//   35   73:dup             
	//   36   74:new             #91  <Class Status>
	//   37   77:dup             
	//   38   78:iconst_0        
	//   39   79:invokespecial   #93  <Method void Status(int)>
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:aload_3         
	//   43   85:iload           4
	//   44   87:invokespecial   #96  <Method void zzco(Status, ApplicationMetadata, String, String, boolean)>
	//   45   90:invokeinterface #101 <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
				zzcn.zza(zzcn1, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (null)));
	//   46   95:aload           6
	//   47   97:aconst_null     
	//   48   98:invokestatic    #104 <Method com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzcn.zza(zzcn, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   49  101:pop             
			}
		}
	//   50  102:aload           5
	//   51  104:monitorexit     
		return;
	//   52  105:return          
		applicationmetadata;
	//   53  106:astore_1        
		obj;
	//   54  107:aload           5
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		throw applicationmetadata;
	//   56  110:aload_1         
	//   57  111:athrow          
	}

	public final void zza(String s, double d, boolean flag)
	{
		zzcn.zzcs().d("Deprecated callback: \"onStatusreceived\"", new Object[0]);
	//    0    0:invokestatic    #109 <Method zzdg zzcn.zzcs()>
	//    1    3:ldc1            #111 <String "Deprecated callback: \"onStatusreceived\"">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #119 <Method void zzdg.d(String, Object[])>
	//    5   12:return          
	}

	public final void zza(String s, long l)
	{
		s = ((String) ((zzcn)zzvv.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_1        
		if(s == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zza(((zzcn) (s)), l, 0);
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:iconst_0        
	//   11   19:invokestatic    #123 <Method void zzcn.zza(zzcn, long, int)>
			return;
	//   12   22:return          
		}
	}

	public final void zza(String s, long l, int i)
	{
		s = ((String) ((zzcn)zzvv.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_1        
		if(s == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zza(((zzcn) (s)), l, i);
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:iload           4
	//   11   20:invokestatic    #123 <Method void zzcn.zza(zzcn, long, int)>
			return;
	//   12   23:return          
		}
	}

	public final void zza(String s, byte abyte0[])
	{
		if((zzcn)zzvv.get() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AtomicReference zzvv>
	//*   2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//*   3    7:checkcast       #26  <Class zzcn>
	//*   4   10:ifnonnull       14
		{
			return;
	//    5   13:return          
		} else
		{
			zzcn.zzcs().d("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
				s, Integer.valueOf(abyte0.length)
			});
	//    6   14:invokestatic    #109 <Method zzdg zzcn.zzcs()>
	//    7   17:ldc1            #127 <String "IGNORING: Receive (type=binary, ns=%s) <%d bytes>">
	//    8   19:iconst_2        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:aload_1         
	//   13   26:aastore         
	//   14   27:dup             
	//   15   28:iconst_1        
	//   16   29:aload_2         
	//   17   30:arraylength     
	//   18   31:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:invokevirtual   #119 <Method void zzdg.d(String, Object[])>
			return;
	//   21   38:return          
		}
	}

	public final void zzb(zzcd zzcd)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_2        
		if(zzcn1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zzcs().d("onApplicationStatusChanged", new Object[0]);
	//    8   16:invokestatic    #109 <Method zzdg zzcn.zzcs()>
	//    9   19:ldc1            #136 <String "onApplicationStatusChanged">
	//   10   21:iconst_0        
	//   11   22:anewarray       Object[]
	//   12   25:invokevirtual   #119 <Method void zzdg.d(String, Object[])>
			handler.post(((Runnable) (new zzcs(this, zzcn1, zzcd))));
	//   13   28:aload_0         
	//   14   29:getfield        #35  <Field Handler handler>
	//   15   32:new             #138 <Class zzcs>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload_2         
	//   19   38:aload_1         
	//   20   39:invokespecial   #141 <Method void zzcs(zzcp, zzcn, zzcd)>
	//   21   42:invokevirtual   #67  <Method boolean Handler.post(Runnable)>
	//   22   45:pop             
			return;
	//   23   46:return          
		}
	}

	public final void zzb(zzcv zzcv)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_2        
		if(zzcn1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zzcs().d("onDeviceStatusChanged", new Object[0]);
	//    8   16:invokestatic    #109 <Method zzdg zzcn.zzcs()>
	//    9   19:ldc1            #144 <String "onDeviceStatusChanged">
	//   10   21:iconst_0        
	//   11   22:anewarray       Object[]
	//   12   25:invokevirtual   #119 <Method void zzdg.d(String, Object[])>
			handler.post(((Runnable) (new zzcr(this, zzcn1, zzcv))));
	//   13   28:aload_0         
	//   14   29:getfield        #35  <Field Handler handler>
	//   15   32:new             #146 <Class zzcr>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload_2         
	//   19   38:aload_1         
	//   20   39:invokespecial   #149 <Method void zzcr(zzcp, zzcn, zzcv)>
	//   21   42:invokevirtual   #67  <Method boolean Handler.post(Runnable)>
	//   22   45:pop             
			return;
	//   23   46:return          
		}
	}

	public final void zzb(String s, String s1)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_3        
		if(zzcn1 == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zzcs().d("Receive (type=text, ns=%s) %s", new Object[] {
				s, s1
			});
	//    8   16:invokestatic    #109 <Method zzdg zzcn.zzcs()>
	//    9   19:ldc1            #152 <String "Receive (type=text, ns=%s) %s">
	//   10   21:iconst_2        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_1         
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:aload_2         
	//   19   32:aastore         
	//   20   33:invokevirtual   #119 <Method void zzdg.d(String, Object[])>
			handler.post(((Runnable) (new zzct(this, zzcn1, s, s1))));
	//   21   36:aload_0         
	//   22   37:getfield        #35  <Field Handler handler>
	//   23   40:new             #154 <Class zzct>
	//   24   43:dup             
	//   25   44:aload_0         
	//   26   45:aload_3         
	//   27   46:aload_1         
	//   28   47:aload_2         
	//   29   48:invokespecial   #157 <Method void zzct(zzcp, zzcn, String, String)>
	//   30   51:invokevirtual   #67  <Method boolean Handler.post(Runnable)>
	//   31   54:pop             
			return;
	//   32   55:return          
		}
	}

	public final zzcn zzcu()
	{
		zzcn zzcn1 = (zzcn)zzvv.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #163 <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #26  <Class zzcn>
	//    5   11:astore_1        
		if(zzcn1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
		{
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		} else
		{
			zzcn.zzc(zzcn1);
	//   10   18:aload_1         
	//   11   19:invokestatic    #165 <Method void zzcn.zzc(zzcn)>
			return zzcn1;
	//   12   22:aload_1         
	//   13   23:areturn         
		}
	}

	public final void zzf(int i)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_2        
		if(zzcn1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn1.zzl(i);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #169 <Method void zzcn.zzl(int)>
			return;
	//   11   21:return          
		}
	}

	public final void zzn(int i)
	{
		zzcn zzcn1 = zzcu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method zzcn zzcu()>
	//    2    4:astore_2        
		if(zzcn1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		zzcn.zzcs().d("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
			Integer.valueOf(i)
		});
	//    6   10:invokestatic    #109 <Method zzdg zzcn.zzcs()>
	//    7   13:ldc1            #174 <String "ICastDeviceControllerListener.onDisconnected: %d">
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:iload_1         
	//   13   22:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokevirtual   #119 <Method void zzdg.d(String, Object[])>
		if(i != 0)
	//*  16   29:iload_1         
	//*  17   30:ifeq            38
			zzcn1.triggerConnectionSuspended(2);
	//   18   33:aload_2         
	//   19   34:iconst_2        
	//   20   35:invokevirtual   #177 <Method void zzcn.triggerConnectionSuspended(int)>
	//   21   38:return          
	}

	public final void zzo(int i)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_2        
		if(zzcn1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zza(zzcn1, i);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #54  <Method void zzcn.zza(zzcn, int)>
			return;
	//   11   21:return          
		}
	}

	public final void zzp(int i)
	{
		zzcn zzcn1 = (zzcn)zzvv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AtomicReference zzvv>
	//    2    4:invokevirtual   #42  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #26  <Class zzcn>
	//    4   10:astore_2        
		if(zzcn1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzcn.zza(zzcn1, i);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokestatic    #54  <Method void zzcn.zza(zzcn, int)>
			return;
	//   11   21:return          
		}
	}

	private final Handler handler;
	private final AtomicReference zzvv;
}
