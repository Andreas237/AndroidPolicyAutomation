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
//			zzaaf

public class zzaby
{
	static class zza
		implements android.os.IBinder.DeathRecipient, zzb
	{

		private void zzxe()
		{
			Object obj = ((Object) ((zzaaf)zzaDz.get()));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field WeakReference zzaDz>
		//    2    4:invokevirtual   #45  <Method Object WeakReference.get()>
		//    3    7:checkcast       #47  <Class zzaaf>
		//    4   10:astore_1        
			zzf zzf1 = (zzf)zzaDA.get();
		//    5   11:aload_0         
		//    6   12:getfield        #30  <Field WeakReference zzaDA>
		//    7   15:invokevirtual   #45  <Method Object WeakReference.get()>
		//    8   18:checkcast       #49  <Class zzf>
		//    9   21:astore_2        
			if(zzf1 != null && obj != null)
		//*  10   22:aload_2         
		//*  11   23:ifnull          41
		//*  12   26:aload_1         
		//*  13   27:ifnull          41
				zzf1.remove(((zzaaf) (obj)).zzvr().intValue());
		//   14   30:aload_2         
		//   15   31:aload_1         
		//   16   32:invokevirtual   #53  <Method Integer zzaaf.zzvr()>
		//   17   35:invokevirtual   #59  <Method int Integer.intValue()>
		//   18   38:invokevirtual   #63  <Method void zzf.remove(int)>
			obj = ((Object) ((IBinder)zzaDB.get()));
		//   19   41:aload_0         
		//   20   42:getfield        #34  <Field WeakReference zzaDB>
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
			zzxe();
		//    0    0:aload_0         
		//    1    1:invokespecial   #72  <Method void zzxe()>
		//    2    4:return          
		}

		public void zzc(zzaaf zzaaf1)
		{
			zzxe();
		//    0    0:aload_0         
		//    1    1:invokespecial   #72  <Method void zzxe()>
		//    2    4:return          
		}

		private final WeakReference zzaDA;
		private final WeakReference zzaDB;
		private final WeakReference zzaDz;

		private zza(zzaaf zzaaf1, zzf zzf1, IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			zzaDA = new WeakReference(((Object) (zzf1)));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_2         
		//    6   10:invokespecial   #28  <Method void WeakReference(Object)>
		//    7   13:putfield        #30  <Field WeakReference zzaDA>
			zzaDz = new WeakReference(((Object) (zzaaf1)));
		//    8   16:aload_0         
		//    9   17:new             #25  <Class WeakReference>
		//   10   20:dup             
		//   11   21:aload_1         
		//   12   22:invokespecial   #28  <Method void WeakReference(Object)>
		//   13   25:putfield        #32  <Field WeakReference zzaDz>
			zzaDB = new WeakReference(((Object) (ibinder)));
		//   14   28:aload_0         
		//   15   29:new             #25  <Class WeakReference>
		//   16   32:dup             
		//   17   33:aload_3         
		//   18   34:invokespecial   #28  <Method void WeakReference(Object)>
		//   19   37:putfield        #34  <Field WeakReference zzaDB>
		//   20   40:return          
		}

	}

	static interface zzb
	{

		public abstract void zzc(zzaaf zzaaf1);
	}


	public zzaby(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void WeakHashMap()>
	//    6   12:invokestatic    #54  <Method Set Collections.newSetFromMap(Map)>
	//    7   15:invokestatic    #58  <Method Set Collections.synchronizedSet(Set)>
	//    8   18:putfield        #60  <Field Set zzaDw>
	//    9   21:aload_0         
	//   10   22:new             #6   <Class zzaby$1>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #63  <Method void zzaby$1(zzaby)>
	//   14   30:putfield        #65  <Field zzaby$zzb zzaDx>
		zzaBQ = map;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #67  <Field Map zzaBQ>
	//   18   38:return          
	}

	static zzf zza(zzaby zzaby1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static void zza(zzaaf zzaaf1, zzf zzf1, IBinder ibinder)
	{
		if(zzaaf1.isReady())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method boolean zzaaf.isReady()>
	//*   2    4:ifeq            23
		{
			zzaaf1.zza(((zzb) (new zza(zzaaf1, zzf1, ibinder))));
	//    3    7:aload_0         
	//    4    8:new             #8   <Class zzaby$zza>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #80  <Method void zzaby$zza(zzaaf, zzf, IBinder, zzaby$1)>
	//   11   19:invokevirtual   #83  <Method void zzaaf.zza(zzaby$zzb)>
			return;
	//   12   22:return          
		}
		if(ibinder != null && ibinder.isBinderAlive())
	//*  13   23:aload_2         
	//*  14   24:ifnull          80
	//*  15   27:aload_2         
	//*  16   28:invokeinterface #88  <Method boolean IBinder.isBinderAlive()>
	//*  17   33:ifeq            80
		{
			zza zza1 = new zza(zzaaf1, zzf1, ibinder);
	//   18   36:new             #8   <Class zzaby$zza>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:aconst_null     
	//   24   44:invokespecial   #80  <Method void zzaby$zza(zzaaf, zzf, IBinder, zzaby$1)>
	//   25   47:astore_3        
			zzaaf1.zza(((zzb) (zza1)));
	//   26   48:aload_0         
	//   27   49:aload_3         
	//   28   50:invokevirtual   #83  <Method void zzaaf.zza(zzaby$zzb)>
			try
			{
				ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (zza1)), 0);
	//   29   53:aload_2         
	//   30   54:aload_3         
	//   31   55:iconst_0        
	//   32   56:invokeinterface #92  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			}
	//*  33   61:goto            79
	//*  34   64:aload_0         
	//*  35   65:invokevirtual   #95  <Method void zzaaf.cancel()>
	//*  36   68:aload_1         
	//*  37   69:aload_0         
	//*  38   70:invokevirtual   #99  <Method Integer zzaaf.zzvr()>
	//*  39   73:invokevirtual   #105 <Method int Integer.intValue()>
	//*  40   76:invokevirtual   #111 <Method void zzf.remove(int)>
	//*  41   79:return          
	//*  42   80:aload_0         
	//*  43   81:aconst_null     
	//*  44   82:invokevirtual   #83  <Method void zzaaf.zza(zzaby$zzb)>
	//*  45   85:aload_0         
	//*  46   86:invokevirtual   #95  <Method void zzaaf.cancel()>
	//*  47   89:aload_1         
	//*  48   90:aload_0         
	//*  49   91:invokevirtual   #99  <Method Integer zzaaf.zzvr()>
	//*  50   94:invokevirtual   #105 <Method int Integer.intValue()>
	//*  51   97:invokevirtual   #111 <Method void zzf.remove(int)>
	//*  52  100:return          
			// Misplaced declaration of an exception variable
			catch(IBinder ibinder)
			{
				zzaaf1.cancel();
				zzf1.remove(zzaaf1.zzvr().intValue());
			}
			return;
		} else
		{
			zzaaf1.zza(((zzb) (null)));
			zzaaf1.cancel();
			zzf1.remove(zzaaf1.zzvr().intValue());
			return;
		}
	//*  53  101:astore_2        
	//*  54  102:goto            64
	}

	public void dump(PrintWriter printwriter)
	{
		printwriter.append(" mUnconsumedApiCalls.size()=").println(zzaDw.size());
	//    0    0:aload_1         
	//    1    1:ldc1            #116 <String " mUnconsumedApiCalls.size()=">
	//    2    3:invokevirtual   #122 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    6:aload_0         
	//    4    7:getfield        #60  <Field Set zzaDw>
	//    5   10:invokeinterface #127 <Method int Set.size()>
	//    6   15:invokevirtual   #130 <Method void PrintWriter.println(int)>
	//    7   18:return          
	}

	public void release()
	{
		zzaaf azzaaf[] = (zzaaf[])zzaDw.toArray(((Object []) (zzaDv)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set zzaDw>
	//    2    4:getstatic       #41  <Field zzaaf[] zzaDv>
	//    3    7:invokeinterface #135 <Method Object[] Set.toArray(Object[])>
	//    4   12:checkcast       #136 <Class zzaaf[]>
	//    5   15:astore_3        
		int j = azzaaf.length;
	//    6   16:aload_3         
	//    7   17:arraylength     
	//    8   18:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          123
		{
			zzaaf zzaaf1 = azzaaf[i];
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:astore          4
			zzaaf1.zza(((zzb) (null)));
	//   18   31:aload           4
	//   19   33:aconst_null     
	//   20   34:invokevirtual   #83  <Method void zzaaf.zza(zzaby$zzb)>
			if(zzaaf1.zzvr() == null)
	//*  21   37:aload           4
	//*  22   39:invokevirtual   #99  <Method Integer zzaaf.zzvr()>
	//*  23   42:ifnonnull       68
			{
				if(zzaaf1.zzvF())
	//*  24   45:aload           4
	//*  25   47:invokevirtual   #139 <Method boolean zzaaf.zzvF()>
	//*  26   50:ifeq            116
					zzaDw.remove(((Object) (zzaaf1)));
	//   27   53:aload_0         
	//   28   54:getfield        #60  <Field Set zzaDw>
	//   29   57:aload           4
	//   30   59:invokeinterface #142 <Method boolean Set.remove(Object)>
	//   31   64:pop             
			} else
	//*  32   65:goto            116
			{
				zzaaf1.zzvH();
	//   33   68:aload           4
	//   34   70:invokevirtual   #145 <Method void zzaaf.zzvH()>
				zza(zzaaf1, ((zzf) (null)), ((com.google.android.gms.common.api.Api.zze)zzaBQ.get(((Object) (((zzaad.zza)zzaaf1).zzvg())))).zzvi());
	//   35   73:aload           4
	//   36   75:aconst_null     
	//   37   76:aload_0         
	//   38   77:getfield        #67  <Field Map zzaBQ>
	//   39   80:aload           4
	//   40   82:checkcast       #147 <Class zzaad$zza>
	//   41   85:invokevirtual   #151 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//   42   88:invokeinterface #157 <Method Object Map.get(Object)>
	//   43   93:checkcast       #159 <Class com.google.android.gms.common.api.Api$zze>
	//   44   96:invokeinterface #163 <Method IBinder com.google.android.gms.common.api.Api$zze.zzvi()>
	//   45  101:invokestatic    #165 <Method void zza(zzaaf, zzf, IBinder)>
				zzaDw.remove(((Object) (zzaaf1)));
	//   46  104:aload_0         
	//   47  105:getfield        #60  <Field Set zzaDw>
	//   48  108:aload           4
	//   49  110:invokeinterface #142 <Method boolean Set.remove(Object)>
	//   50  115:pop             
			}
		}

	//   51  116:iload_1         
	//   52  117:iconst_1        
	//   53  118:iadd            
	//   54  119:istore_1        
	//*  55  120:goto            21
	//   56  123:return          
	}

	void zzb(zzaaf zzaaf1)
	{
		zzaDw.add(((Object) (zzaaf1)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set zzaDw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #169 <Method boolean Set.add(Object)>
	//    4   10:pop             
		zzaaf1.zza(zzaDx);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field zzaby$zzb zzaDx>
	//    8   16:invokevirtual   #83  <Method void zzaaf.zza(zzaby$zzb)>
	//    9   19:return          
	}

	public void zzxd()
	{
		zzaaf azzaaf[] = (zzaaf[])zzaDw.toArray(((Object []) (zzaDv)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Set zzaDw>
	//    2    4:getstatic       #41  <Field zzaaf[] zzaDv>
	//    3    7:invokeinterface #135 <Method Object[] Set.toArray(Object[])>
	//    4   12:checkcast       #136 <Class zzaaf[]>
	//    5   15:astore_3        
		int j = azzaaf.length;
	//    6   16:aload_3         
	//    7   17:arraylength     
	//    8   18:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          42
			azzaaf[i].zzC(zzaDu);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:getstatic       #37  <Field Status zzaDu>
	//   18   32:invokevirtual   #175 <Method void zzaaf.zzC(Status)>

	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_1        
	//*  23   39:goto            21
	//   24   42:return          
	}

	public static final Status zzaDu = new Status(8, "The connection to Google Play services was lost");
	private static final zzaaf zzaDv[] = new zzaaf[0];
	private final Map zzaBQ;
	final Set zzaDw = Collections.synchronizedSet(Collections.newSetFromMap(((Map) (new WeakHashMap()))));
	private final zzb zzaDx = new zzb() {

		public void zzc(zzaaf zzaaf1)
		{
			zzaDy.zzaDw.remove(((Object) (zzaaf1)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field zzaby zzaDy>
		//    2    4:getfield        #24  <Field Set zzaby.zzaDw>
		//    3    7:aload_1         
		//    4    8:invokeinterface #30  <Method boolean Set.remove(Object)>
		//    5   13:pop             
			if(zzaaf1.zzvr() != null)
		//*   6   14:aload_1         
		//*   7   15:invokevirtual   #36  <Method Integer zzaaf.zzvr()>
		//*   8   18:ifnull          29
				zzaby.zza(zzaDy);
		//    9   21:aload_0         
		//   10   22:getfield        #14  <Field zzaby zzaDy>
		//   11   25:invokestatic    #40  <Method zzf zzaby.zza(zzaby)>
		//   12   28:pop             
		//   13   29:return          
		}

		final zzaby zzaDy;

			
			{
				zzaDy = zzaby.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field zzaby zzaDy>
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
	//    5   11:putstatic       #37  <Field Status zzaDu>
	//    6   14:iconst_0        
	//    7   15:anewarray       zzaaf[]
	//    8   18:putstatic       #41  <Field zzaaf[] zzaDv>
	//*   9   21:return          
	}
}
