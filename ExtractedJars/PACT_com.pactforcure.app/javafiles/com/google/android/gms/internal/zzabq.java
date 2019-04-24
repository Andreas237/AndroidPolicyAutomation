// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzf;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx

public class zzabq
{
	private static class zza
		implements android.os.IBinder.DeathRecipient, zzb
	{

		private void zzwx()
		{
			Object obj = ((Object) ((zzzx)zzaCa.get()));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field WeakReference zzaCa>
		//    2    4:invokevirtual   #45  <Method Object WeakReference.get()>
		//    3    7:checkcast       #47  <Class zzzx>
		//    4   10:astore_1        
			zzf zzf1 = (zzf)zzaCb.get();
		//    5   11:aload_0         
		//    6   12:getfield        #30  <Field WeakReference zzaCb>
		//    7   15:invokevirtual   #45  <Method Object WeakReference.get()>
		//    8   18:checkcast       #49  <Class zzf>
		//    9   21:astore_2        
			if(zzf1 != null && obj != null)
		//*  10   22:aload_2         
		//*  11   23:ifnull          41
		//*  12   26:aload_1         
		//*  13   27:ifnull          41
				zzf1.remove(((zzzx) (obj)).zzuR().intValue());
		//   14   30:aload_2         
		//   15   31:aload_1         
		//   16   32:invokevirtual   #53  <Method Integer zzzx.zzuR()>
		//   17   35:invokevirtual   #59  <Method int Integer.intValue()>
		//   18   38:invokevirtual   #63  <Method void zzf.remove(int)>
			obj = ((Object) ((IBinder)zzaCc.get()));
		//   19   41:aload_0         
		//   20   42:getfield        #34  <Field WeakReference zzaCc>
		//   21   45:invokevirtual   #45  <Method Object WeakReference.get()>
		//   22   48:checkcast       #65  <Class IBinder>
		//   23   51:astore_1        
			if(obj != null)
		//*  24   52:aload_1         
		//*  25   53:ifnull          65
				((IBinder) (obj)).unlinkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
		//   26   56:aload_1         
		//   27   57:aload_0         
		//   28   58:iconst_0        
		//   29   59:invokeinterface #69  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
		//   30   64:pop             
		//   31   65:return          
		}

		public void binderDied()
		{
			zzwx();
		//    0    0:aload_0         
		//    1    1:invokespecial   #72  <Method void zzwx()>
		//    2    4:return          
		}

		public void zzc(zzzx zzzx1)
		{
			zzwx();
		//    0    0:aload_0         
		//    1    1:invokespecial   #72  <Method void zzwx()>
		//    2    4:return          
		}

		private final WeakReference zzaCa;
		private final WeakReference zzaCb;
		private final WeakReference zzaCc;

		private zza(zzzx zzzx1, zzf zzf1, IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			zzaCb = new WeakReference(((Object) (zzf1)));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_2         
		//    6   10:invokespecial   #28  <Method void WeakReference(Object)>
		//    7   13:putfield        #30  <Field WeakReference zzaCb>
			zzaCa = new WeakReference(((Object) (zzzx1)));
		//    8   16:aload_0         
		//    9   17:new             #25  <Class WeakReference>
		//   10   20:dup             
		//   11   21:aload_1         
		//   12   22:invokespecial   #28  <Method void WeakReference(Object)>
		//   13   25:putfield        #32  <Field WeakReference zzaCa>
			zzaCc = new WeakReference(((Object) (ibinder)));
		//   14   28:aload_0         
		//   15   29:new             #25  <Class WeakReference>
		//   16   32:dup             
		//   17   33:aload_3         
		//   18   34:invokespecial   #28  <Method void WeakReference(Object)>
		//   19   37:putfield        #34  <Field WeakReference zzaCc>
		//   20   40:return          
		}

	}

	static interface zzb
	{

		public abstract void zzc(zzzx zzzx1);
	}


	public zzabq(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void WeakHashMap()>
	//    6   12:invokestatic    #54  <Method Set Collections.newSetFromMap(Map)>
	//    7   15:invokestatic    #58  <Method Set Collections.synchronizedSet(Set)>
	//    8   18:putfield        #60  <Field Set zzaBX>
	//    9   21:aload_0         
	//   10   22:new             #6   <Class zzabq$1>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #63  <Method void zzabq$1(zzabq)>
	//   14   30:putfield        #65  <Field zzabq$zzb zzaBY>
		zzaAr = map;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #67  <Field Map zzaAr>
	//   18   38:return          
	}

	static zzf zza(zzabq zzabq1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static void zza(zzzx zzzx1, zzf zzf1, IBinder ibinder)
	{
		if(zzzx1.isReady())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method boolean zzzx.isReady()>
	//*   2    4:ifeq            23
		{
			zzzx1.zza(((zzb) (new zza(zzzx1, zzf1, ibinder))));
	//    3    7:aload_0         
	//    4    8:new             #8   <Class zzabq$zza>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #80  <Method void zzabq$zza(zzzx, zzf, IBinder, zzabq$1)>
	//   11   19:invokevirtual   #83  <Method void zzzx.zza(zzabq$zzb)>
			return;
	//   12   22:return          
		}
		if(ibinder != null && ibinder.isBinderAlive())
	//*  13   23:aload_2         
	//*  14   24:ifnull          79
	//*  15   27:aload_2         
	//*  16   28:invokeinterface #88  <Method boolean IBinder.isBinderAlive()>
	//*  17   33:ifeq            79
		{
			zza zza1 = new zza(zzzx1, zzf1, ibinder);
	//   18   36:new             #8   <Class zzabq$zza>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:aconst_null     
	//   24   44:invokespecial   #80  <Method void zzabq$zza(zzzx, zzf, IBinder, zzabq$1)>
	//   25   47:astore_3        
			zzzx1.zza(((zzb) (zza1)));
	//   26   48:aload_0         
	//   27   49:aload_3         
	//   28   50:invokevirtual   #83  <Method void zzzx.zza(zzabq$zzb)>
			try
			{
				ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (zza1)), 0);
	//   29   53:aload_2         
	//   30   54:aload_3         
	//   31   55:iconst_0        
	//   32   56:invokeinterface #92  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
				return;
	//   33   61:return          
			}
			// Misplaced declaration of an exception variable
			catch(IBinder ibinder)
	//*  34   62:astore_2        
			{
				zzzx1.cancel();
	//   35   63:aload_0         
	//   36   64:invokevirtual   #95  <Method void zzzx.cancel()>
			}
			zzf1.remove(zzzx1.zzuR().intValue());
	//   37   67:aload_1         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #99  <Method Integer zzzx.zzuR()>
	//   40   72:invokevirtual   #105 <Method int Integer.intValue()>
	//   41   75:invokevirtual   #111 <Method void zzf.remove(int)>
			return;
	//   42   78:return          
		} else
		{
			zzzx1.zza(((zzb) (null)));
	//   43   79:aload_0         
	//   44   80:aconst_null     
	//   45   81:invokevirtual   #83  <Method void zzzx.zza(zzabq$zzb)>
			zzzx1.cancel();
	//   46   84:aload_0         
	//   47   85:invokevirtual   #95  <Method void zzzx.cancel()>
			zzf1.remove(zzzx1.zzuR().intValue());
	//   48   88:aload_1         
	//   49   89:aload_0         
	//   50   90:invokevirtual   #99  <Method Integer zzzx.zzuR()>
	//   51   93:invokevirtual   #105 <Method int Integer.intValue()>
	//   52   96:invokevirtual   #111 <Method void zzf.remove(int)>
			return;
	//   53   99:return          
		}
	}

	public void dump(PrintWriter printwriter)
	{
		printwriter.append(" mUnconsumedApiCalls.size()=").println(zzaBX.size());
	//    0    0:aload_1         
	//    1    1:ldc1            #116 <String " mUnconsumedApiCalls.size()=">
	//    2    3:invokevirtual   #122 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    6:aload_0         
	//    4    7:getfield        #60  <Field Set zzaBX>
	//    5   10:invokeinterface #127 <Method int Set.size()>
	//    6   15:invokevirtual   #130 <Method void PrintWriter.println(int)>
	//    7   18:return          
	}

	public void release()
	{
		zzzx azzzx[] = (zzzx[])zzaBX.toArray(((Object []) (zzaBW)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set zzaBX>
	//    2    4:getstatic       #41  <Field zzzx[] zzaBW>
	//    3    7:invokeinterface #135 <Method Object[] Set.toArray(Object[])>
	//    4   12:checkcast       #136 <Class zzzx[]>
	//    5   15:astore_3        
		int j = azzzx.length;
	//    6   16:aload_3         
	//    7   17:arraylength     
	//    8   18:istore_2        
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		while(i < j) 
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          123
		{
			zzzx zzzx1 = azzzx[i];
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:astore          4
			zzzx1.zza(((zzb) (null)));
	//   18   31:aload           4
	//   19   33:aconst_null     
	//   20   34:invokevirtual   #83  <Method void zzzx.zza(zzabq$zzb)>
			if(zzzx1.zzuR() == null)
	//*  21   37:aload           4
	//*  22   39:invokevirtual   #99  <Method Integer zzzx.zzuR()>
	//*  23   42:ifnonnull       72
			{
				if(zzzx1.zzvc())
	//*  24   45:aload           4
	//*  25   47:invokevirtual   #139 <Method boolean zzzx.zzvc()>
	//*  26   50:ifeq            65
					zzaBX.remove(((Object) (zzzx1)));
	//   27   53:aload_0         
	//   28   54:getfield        #60  <Field Set zzaBX>
	//   29   57:aload           4
	//   30   59:invokeinterface #142 <Method boolean Set.remove(Object)>
	//   31   64:pop             
			} else
	//*  32   65:iload_1         
	//*  33   66:iconst_1        
	//*  34   67:iadd            
	//*  35   68:istore_1        
	//*  36   69:goto            21
			{
				zzzx1.zzve();
	//   37   72:aload           4
	//   38   74:invokevirtual   #145 <Method void zzzx.zzve()>
				zza(zzzx1, ((zzf) (null)), ((com.google.android.gms.common.api.Api.zze)zzaAr.get(((Object) (((zzzv.zza)zzzx1).zzuH())))).zzuJ());
	//   39   77:aload           4
	//   40   79:aconst_null     
	//   41   80:aload_0         
	//   42   81:getfield        #67  <Field Map zzaAr>
	//   43   84:aload           4
	//   44   86:checkcast       #147 <Class zzzv$zza>
	//   45   89:invokevirtual   #151 <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//   46   92:invokeinterface #157 <Method Object Map.get(Object)>
	//   47   97:checkcast       #159 <Class com.google.android.gms.common.api.Api$zze>
	//   48  100:invokeinterface #163 <Method IBinder com.google.android.gms.common.api.Api$zze.zzuJ()>
	//   49  105:invokestatic    #165 <Method void zza(zzzx, zzf, IBinder)>
				zzaBX.remove(((Object) (zzzx1)));
	//   50  108:aload_0         
	//   51  109:getfield        #60  <Field Set zzaBX>
	//   52  112:aload           4
	//   53  114:invokeinterface #142 <Method boolean Set.remove(Object)>
	//   54  119:pop             
			}
			i++;
		}
	//*  55  120:goto            65
	//   56  123:return          
	}

	void zzb(zzzx zzzx1)
	{
		zzaBX.add(((Object) (zzzx1)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set zzaBX>
	//    2    4:aload_1         
	//    3    5:invokeinterface #169 <Method boolean Set.add(Object)>
	//    4   10:pop             
		zzzx1.zza(zzaBY);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field zzabq$zzb zzaBY>
	//    8   16:invokevirtual   #83  <Method void zzzx.zza(zzabq$zzb)>
	//    9   19:return          
	}

	public void zzww()
	{
		zzzx azzzx[] = (zzzx[])zzaBX.toArray(((Object []) (zzaBW)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set zzaBX>
	//    2    4:getstatic       #41  <Field zzzx[] zzaBW>
	//    3    7:invokeinterface #135 <Method Object[] Set.toArray(Object[])>
	//    4   12:checkcast       #136 <Class zzzx[]>
	//    5   15:astore_3        
		int j = azzzx.length;
	//    6   16:aload_3         
	//    7   17:arraylength     
	//    8   18:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          42
			azzzx[i].zzB(zzaBV);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:getstatic       #37  <Field Status zzaBV>
	//   18   32:invokevirtual   #175 <Method void zzzx.zzB(Status)>

	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_1        
	//*  23   39:goto            21
	//   24   42:return          
	}

	public static final Status zzaBV = new Status(8, "The connection to Google Play services was lost");
	private static final zzzx zzaBW[] = new zzzx[0];
	private final Map zzaAr;
	final Set zzaBX = Collections.synchronizedSet(Collections.newSetFromMap(((Map) (new WeakHashMap()))));
	private final zzb zzaBY = new zzb() {

		public void zzc(zzzx zzzx1)
		{
			zzaBZ.zzaBX.remove(((Object) (zzzx1)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field zzabq zzaBZ>
		//    2    4:getfield        #24  <Field Set zzabq.zzaBX>
		//    3    7:aload_1         
		//    4    8:invokeinterface #30  <Method boolean Set.remove(Object)>
		//    5   13:pop             
			if(zzzx1.zzuR() != null)
		//*   6   14:aload_1         
		//*   7   15:invokevirtual   #36  <Method Integer zzzx.zzuR()>
		//*   8   18:ifnull          29
				zzabq.zza(zzaBZ);
		//    9   21:aload_0         
		//   10   22:getfield        #14  <Field zzabq zzaBZ>
		//   11   25:invokestatic    #40  <Method zzf zzabq.zza(zzabq)>
		//   12   28:pop             
		//   13   29:return          
		}

		final zzabq zzaBZ;

			
			{
				zzaBZ = zzabq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field zzabq zzaBZ>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:new             #29  <Class Status>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:ldc1            #31  <String "The connection to Google Play services was lost">
	//    4    8:invokespecial   #35  <Method void Status(int, String)>
	//    5   11:putstatic       #37  <Field Status zzaBV>
	//    6   14:iconst_0        
	//    7   15:anewarray       zzzx[]
	//    8   18:putstatic       #41  <Field zzzx[] zzaBW>
	//*   9   21:return          
	}
}
