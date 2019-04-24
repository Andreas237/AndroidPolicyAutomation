// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.zze;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaau, zzbaw, zzbai, zzaav, 
//			zzaat, zzaaw, zzbam

public class zzaar
	implements zzaau
{
	static class zza
		implements com.google.android.gms.common.internal.zzf.zzf
	{

		static boolean zza(zza zza1)
		{
			return zza1.zzaAu;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field boolean zzaAu>
		//    2    4:ireturn         
		}

		public void zzg(ConnectionResult connectionresult)
		{
			zzaar zzaar1;
			zzaar1 = (zzaar)zzaBB.get();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field WeakReference zzaBB>
		//    2    4:invokevirtual   #44  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class zzaar>
		//    4   10:astore_3        
			if(zzaar1 == null)
		//*   5   11:aload_3         
		//*   6   12:ifnonnull       16
				return;
		//    7   15:return          
			boolean flag;
			if(Looper.myLooper() == zzaar.zzd(zzaar1).zzaAw.getLooper())
		//*   8   16:invokestatic    #50  <Method Looper Looper.myLooper()>
		//*   9   19:aload_3         
		//*  10   20:invokestatic    #54  <Method zzaav zzaar.zzd(zzaar)>
		//*  11   23:getfield        #60  <Field zzaat zzaav.zzaAw>
		//*  12   26:invokevirtual   #65  <Method Looper zzaat.getLooper()>
		//*  13   29:if_acmpne       37
				flag = true;
		//   14   32:iconst_1        
		//   15   33:istore_2        
			else
		//*  16   34:goto            39
				flag = false;
		//   17   37:iconst_0        
		//   18   38:istore_2        
			zzac.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
		//   19   39:iload_2         
		//   20   40:ldc1            #67  <String "onReportServiceBinding must be called on the GoogleApiClient handler thread">
		//   21   42:invokestatic    #72  <Method void zzac.zza(boolean, Object)>
			zzaar.zzc(zzaar1).lock();
		//   22   45:aload_3         
		//   23   46:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
		//   24   49:invokeinterface #81  <Method void Lock.lock()>
			boolean flag1 = zzaar.zza(zzaar1, 0);
		//   25   54:aload_3         
		//   26   55:iconst_0        
		//   27   56:invokestatic    #84  <Method boolean zzaar.zza(zzaar, int)>
		//   28   59:istore_2        
			if(!flag1)
		//*  29   60:iload_2         
		//*  30   61:ifne            74
			{
				zzaar.zzc(zzaar1).unlock();
		//   31   64:aload_3         
		//   32   65:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
		//   33   68:invokeinterface #87  <Method void Lock.unlock()>
				return;
		//   34   73:return          
			}
			if(!connectionresult.isSuccess())
		//*  35   74:aload_1         
		//*  36   75:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
		//*  37   78:ifne            94
				zzaar.zza(zzaar1, connectionresult, zzaxf, zzaAu);
		//   38   81:aload_3         
		//   39   82:aload_1         
		//   40   83:aload_0         
		//   41   84:getfield        #31  <Field Api zzaxf>
		//   42   87:aload_0         
		//   43   88:getfield        #33  <Field boolean zzaAu>
		//   44   91:invokestatic    #96  <Method void zzaar.zza(zzaar, ConnectionResult, Api, boolean)>
			if(zzaar.zzk(zzaar1))
		//*  45   94:aload_3         
		//*  46   95:invokestatic    #100 <Method boolean zzaar.zzk(zzaar)>
		//*  47   98:ifeq            105
				zzaar.zzj(zzaar1);
		//   48  101:aload_3         
		//   49  102:invokestatic    #104 <Method void zzaar.zzj(zzaar)>
			zzaar.zzc(zzaar1).unlock();
		//   50  105:aload_3         
		//   51  106:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
		//   52  109:invokeinterface #87  <Method void Lock.unlock()>
			return;
		//   53  114:return          
			connectionresult;
		//   54  115:astore_1        
			zzaar.zzc(zzaar1).unlock();
		//   55  116:aload_3         
		//   56  117:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
		//   57  120:invokeinterface #87  <Method void Lock.unlock()>
			throw connectionresult;
		//   58  125:aload_1         
		//   59  126:athrow          
		}

		private final boolean zzaAu;
		private final WeakReference zzaBB;
		private final Api zzaxf;

		public zza(zzaar zzaar1, Api api, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			zzaBB = new WeakReference(((Object) (zzaar1)));
		//    2    4:aload_0         
		//    3    5:new             #24  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #27  <Method void WeakReference(Object)>
		//    7   13:putfield        #29  <Field WeakReference zzaBB>
			zzaxf = api;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #31  <Field Api zzaxf>
			zzaAu = flag;
		//   11   21:aload_0         
		//   12   22:iload_3         
		//   13   23:putfield        #33  <Field boolean zzaAu>
		//   14   26:return          
		}
	}

	class zzb extends zzf
	{

		public void zzwe()
		{
			boolean flag3 = false;
		//    0    0:iconst_0        
		//    1    1:istore          5
			int i = 0;
		//    2    3:iconst_0        
		//    3    4:istore_1        
			boolean flag = true;
		//    4    5:iconst_1        
		//    5    6:istore_2        
			Iterator iterator = zzaBC.keySet().iterator();
		//    6    7:aload_0         
		//    7    8:getfield        #25  <Field Map zzaBC>
		//    8   11:invokeinterface #37  <Method Set Map.keySet()>
		//    9   16:invokeinterface #43  <Method Iterator Set.iterator()>
		//   10   21:astore          6
			boolean flag1;
			boolean flag2;
			do
			{
				flag1 = flag3;
		//   11   23:iload           5
		//   12   25:istore_3        
				flag2 = ((boolean) (i));
		//   13   26:iload_1         
		//   14   27:istore          4
				if(!iterator.hasNext())
					break;
		//   15   29:aload           6
		//   16   31:invokeinterface #49  <Method boolean Iterator.hasNext()>
		//   17   36:ifeq            100
				com.google.android.gms.common.api.Api.zze zze1 = (com.google.android.gms.common.api.Api.zze)iterator.next();
		//   18   39:aload           6
		//   19   41:invokeinterface #53  <Method Object Iterator.next()>
		//   20   46:checkcast       #55  <Class com.google.android.gms.common.api.Api$zze>
		//   21   49:astore          7
				if(zze1.zzvh())
		//*  22   51:aload           7
		//*  23   53:invokeinterface #58  <Method boolean com.google.android.gms.common.api.Api$zze.zzvh()>
		//*  24   58:ifeq            93
				{
					flag2 = true;
		//   25   61:iconst_1        
		//   26   62:istore          4
					i = 1;
		//   27   64:iconst_1        
		//   28   65:istore_1        
					flag1 = flag;
		//   29   66:iload_2         
		//   30   67:istore_3        
					if(!zza.zza((zza)zzaBC.get(((Object) (zze1)))))
		//*  31   68:aload_0         
		//*  32   69:getfield        #25  <Field Map zzaBC>
		//*  33   72:aload           7
		//*  34   74:invokeinterface #62  <Method Object Map.get(Object)>
		//*  35   79:checkcast       #64  <Class zzaar$zza>
		//*  36   82:invokestatic    #68  <Method boolean zzaar$zza.zza(zzaar$zza)>
		//*  37   85:ifne            95
					{
						flag1 = true;
		//   38   88:iconst_1        
		//   39   89:istore_3        
						break;
		//   40   90:goto            100
					}
				} else
				{
					flag1 = false;
		//   41   93:iconst_0        
		//   42   94:istore_3        
				}
				flag = flag1;
		//   43   95:iload_3         
		//   44   96:istore_2        
			} while(true);
		//   45   97:goto            23
			if(flag2)
		//*  46  100:iload           4
		//*  47  102:ifeq            126
				i = zzaar.zzb(zzaBA).isGooglePlayServicesAvailable(zzaar.zza(zzaBA));
		//   48  105:aload_0         
		//   49  106:getfield        #20  <Field zzaar zzaBA>
		//   50  109:invokestatic    #71  <Method zze zzaar.zzb(zzaar)>
		//   51  112:aload_0         
		//   52  113:getfield        #20  <Field zzaar zzaBA>
		//   53  116:invokestatic    #74  <Method Context zzaar.zza(zzaar)>
		//   54  119:invokevirtual   #80  <Method int zze.isGooglePlayServicesAvailable(Context)>
		//   55  122:istore_1        
			else
		//*  56  123:goto            128
				i = 0;
		//   57  126:iconst_0        
		//   58  127:istore_1        
			if(i != 0 && (flag1 || flag))
		//*  59  128:iload_1         
		//*  60  129:ifeq            176
		//*  61  132:iload_3         
		//*  62  133:ifne            140
		//*  63  136:iload_2         
		//*  64  137:ifeq            176
			{
				ConnectionResult connectionresult = new ConnectionResult(i, ((android.app.PendingIntent) (null)));
		//   65  140:new             #82  <Class ConnectionResult>
		//   66  143:dup             
		//   67  144:iload_1         
		//   68  145:aconst_null     
		//   69  146:invokespecial   #85  <Method void ConnectionResult(int, android.app.PendingIntent)>
		//   70  149:astore          6
				zzaar.zzd(zzaBA).zza(((zzaav.zza) (new zzaav.zza(this, ((zzaau) (zzaBA)), connectionresult) {

					public void zzwe()
					{
						zzaar.zza(zzaBE.zzaBA, zzaBD);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaar$zzb zzaBE>
					//    2    4:getfield        #30  <Field zzaar zzaar$zzb.zzaBA>
					//    3    7:aload_0         
					//    4    8:getfield        #22  <Field ConnectionResult zzaBD>
					//    5   11:invokestatic    #34  <Method void zzaar.zza(zzaar, ConnectionResult)>
					//    6   14:return          
					}

					final ConnectionResult zzaBD;
					final zzb zzaBE;

			
			{
				zzaBE = zzb1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaar$zzb zzaBE>
				zzaBD = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field ConnectionResult zzaBD>
				super(zzaau1);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void zzaav$zza(zzaau)>
			//    9   15:return          
			}
				}
)));
		//   71  151:aload_0         
		//   72  152:getfield        #20  <Field zzaar zzaBA>
		//   73  155:invokestatic    #89  <Method zzaav zzaar.zzd(zzaar)>
		//   74  158:new             #9   <Class zzaar$zzb$1>
		//   75  161:dup             
		//   76  162:aload_0         
		//   77  163:aload_0         
		//   78  164:getfield        #20  <Field zzaar zzaBA>
		//   79  167:aload           6
		//   80  169:invokespecial   #92  <Method void zzaar$zzb$1(zzaar$zzb, zzaau, ConnectionResult)>
		//   81  172:invokevirtual   #97  <Method void zzaav.zza(zzaav$zza)>
				return;
		//   82  175:return          
			}
			if(com.google.android.gms.internal.zzaar.zze(zzaBA))
		//*  83  176:aload_0         
		//*  84  177:getfield        #20  <Field zzaar zzaBA>
		//*  85  180:invokestatic    #101 <Method boolean com.google.android.gms.internal.zzaar.zze(zzaar)>
		//*  86  183:ifeq            198
				zzaar.zzf(zzaBA).connect();
		//   87  186:aload_0         
		//   88  187:getfield        #20  <Field zzaar zzaBA>
		//   89  190:invokestatic    #105 <Method zzbai zzaar.zzf(zzaar)>
		//   90  193:invokeinterface #110 <Method void zzbai.connect()>
			for(Iterator iterator1 = zzaBC.keySet().iterator(); iterator1.hasNext();)
		//*  91  198:aload_0         
		//*  92  199:getfield        #25  <Field Map zzaBC>
		//*  93  202:invokeinterface #37  <Method Set Map.keySet()>
		//*  94  207:invokeinterface #43  <Method Iterator Set.iterator()>
		//*  95  212:astore          6
		//*  96  214:aload           6
		//*  97  216:invokeinterface #49  <Method boolean Iterator.hasNext()>
		//*  98  221:ifeq            305
			{
				com.google.android.gms.common.api.Api.zze zze2 = (com.google.android.gms.common.api.Api.zze)iterator1.next();
		//   99  224:aload           6
		//  100  226:invokeinterface #53  <Method Object Iterator.next()>
		//  101  231:checkcast       #55  <Class com.google.android.gms.common.api.Api$zze>
		//  102  234:astore          7
				com.google.android.gms.common.internal.zzf.zzf zzf1 = (com.google.android.gms.common.internal.zzf.zzf)zzaBC.get(((Object) (zze2)));
		//  103  236:aload_0         
		//  104  237:getfield        #25  <Field Map zzaBC>
		//  105  240:aload           7
		//  106  242:invokeinterface #62  <Method Object Map.get(Object)>
		//  107  247:checkcast       #112 <Class com.google.android.gms.common.internal.zzf$zzf>
		//  108  250:astore          8
				if(zze2.zzvh() && i != 0)
		//* 109  252:aload           7
		//* 110  254:invokeinterface #58  <Method boolean com.google.android.gms.common.api.Api$zze.zzvh()>
		//* 111  259:ifeq            293
		//* 112  262:iload_1         
		//* 113  263:ifeq            293
					zzaar.zzd(zzaBA).zza(((zzaav.zza) (new zzaav.zza(this, ((zzaau) (zzaBA)), zzf1) {

						public void zzwe()
						{
							zzaBF.zzg(new ConnectionResult(16, ((android.app.PendingIntent) (null))));
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaBF>
						//    2    4:new             #24  <Class ConnectionResult>
						//    3    7:dup             
						//    4    8:bipush          16
						//    5   10:aconst_null     
						//    6   11:invokespecial   #27  <Method void ConnectionResult(int, android.app.PendingIntent)>
						//    7   14:invokeinterface #33  <Method void com.google.android.gms.common.internal.zzf$zzf.zzg(ConnectionResult)>
						//    8   19:return          
						}

						final com.google.android.gms.common.internal.zzf.zzf zzaBF;

			
			{
				zzaBF = zzf1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaBF>
				super(zzaau1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #21  <Method void zzaav$zza(zzaau)>
			//    6   10:return          
			}
					}
)));
		//  114  266:aload_0         
		//  115  267:getfield        #20  <Field zzaar zzaBA>
		//  116  270:invokestatic    #89  <Method zzaav zzaar.zzd(zzaar)>
		//  117  273:new             #11  <Class zzaar$zzb$2>
		//  118  276:dup             
		//  119  277:aload_0         
		//  120  278:aload_0         
		//  121  279:getfield        #20  <Field zzaar zzaBA>
		//  122  282:aload           8
		//  123  284:invokespecial   #115 <Method void zzaar$zzb$2(zzaar$zzb, zzaau, com.google.android.gms.common.internal.zzf$zzf)>
		//  124  287:invokevirtual   #97  <Method void zzaav.zza(zzaav$zza)>
				else
		//* 125  290:goto            302
					zze2.zza(zzf1);
		//  126  293:aload           7
		//  127  295:aload           8
		//  128  297:invokeinterface #118 <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzf$zzf)>
			}

		//* 129  302:goto            214
		//  130  305:return          
		}

		final zzaar zzaBA;
		private final Map zzaBC;

		public zzb(Map map)
		{
			zzaBA = zzaar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field zzaar zzaBA>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #23  <Method void zzaar$zzf(zzaar, zzaar$1)>
			zzaBC = map;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #25  <Field Map zzaBC>
		//   10   16:return          
		}
	}

	class zzc extends zzf
	{

		public void zzwe()
		{
			zzaar.zzd(zzaBA).zzaAw.zzaBR = com.google.android.gms.internal.zzaar.zzg(zzaBA);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzaar zzaBA>
		//    2    4:invokestatic    #31  <Method zzaav zzaar.zzd(zzaar)>
		//    3    7:getfield        #37  <Field zzaat zzaav.zzaAw>
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field zzaar zzaBA>
		//    6   14:invokestatic    #41  <Method Set com.google.android.gms.internal.zzaar.zzg(zzaar)>
		//    7   17:putfield        #47  <Field Set zzaat.zzaBR>
			for(Iterator iterator = zzaBG.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)iterator.next()).zza(zzaar.zzh(zzaBA), zzaar.zzd(zzaBA).zzaAw.zzaBR));
		//    8   20:aload_0         
		//    9   21:getfield        #21  <Field ArrayList zzaBG>
		//   10   24:invokevirtual   #53  <Method Iterator ArrayList.iterator()>
		//   11   27:astore_1        
		//   12   28:aload_1         
		//   13   29:invokeinterface #59  <Method boolean Iterator.hasNext()>
		//   14   34:ifeq            74
		//   15   37:aload_1         
		//   16   38:invokeinterface #63  <Method Object Iterator.next()>
		//   17   43:checkcast       #65  <Class com.google.android.gms.common.api.Api$zze>
		//   18   46:aload_0         
		//   19   47:getfield        #16  <Field zzaar zzaBA>
		//   20   50:invokestatic    #69  <Method zzr zzaar.zzh(zzaar)>
		//   21   53:aload_0         
		//   22   54:getfield        #16  <Field zzaar zzaBA>
		//   23   57:invokestatic    #31  <Method zzaav zzaar.zzd(zzaar)>
		//   24   60:getfield        #37  <Field zzaat zzaav.zzaAw>
		//   25   63:getfield        #47  <Field Set zzaat.zzaBR>
		//   26   66:invokeinterface #73  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
		//*  27   71:goto            28
		//   28   74:return          
		}

		final zzaar zzaBA;
		private final ArrayList zzaBG;

		public zzc(ArrayList arraylist)
		{
			zzaBA = zzaar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field zzaar zzaBA>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #19  <Method void zzaar$zzf(zzaar, zzaar$1)>
			zzaBG = arraylist;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #21  <Field ArrayList zzaBG>
		//   10   16:return          
		}
	}

	static class zzd extends zzbam
	{

		public void zzb(zzbaw zzbaw1)
		{
			zzaar zzaar1 = (zzaar)zzaBB.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference zzaBB>
		//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class zzaar>
		//    4   10:astore_2        
			if(zzaar1 == null)
		//*   5   11:aload_2         
		//*   6   12:ifnonnull       16
			{
				return;
		//    7   15:return          
			} else
			{
				zzaar.zzd(zzaar1).zza(((zzaav.zza) (new zzaav.zza(this, ((zzaau) (zzaar1)), zzaar1, zzbaw1) {

					public void zzwe()
					{
						zzaar.zza(zzaBH, zzaBI);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaar zzaBH>
					//    2    4:aload_0         
					//    3    5:getfield        #22  <Field zzbaw zzaBI>
					//    4    8:invokestatic    #32  <Method void zzaar.zza(zzaar, zzbaw)>
					//    5   11:return          
					}

					final zzaar zzaBH;
					final zzbaw zzaBI;

			
			{
				zzaBH = zzaar1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #20  <Field zzaar zzaBH>
				zzaBI = zzbaw1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field zzbaw zzaBI>
				super(zzaau1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #25  <Method void zzaav$zza(zzaau)>
			//    9   16:return          
			}
				}
)));
		//    8   16:aload_2         
		//    9   17:invokestatic    #35  <Method zzaav zzaar.zzd(zzaar)>
		//   10   20:new             #9   <Class zzaar$zzd$1>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:aload_2         
		//   14   26:aload_2         
		//   15   27:aload_1         
		//   16   28:invokespecial   #38  <Method void zzaar$zzd$1(zzaar$zzd, zzaau, zzaar, zzbaw)>
		//   17   31:invokevirtual   #44  <Method void zzaav.zza(zzaav$zza)>
				return;
		//   18   34:return          
			}
		}

		private final WeakReference zzaBB;

		zzd(zzaar zzaar1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void zzbam()>
			zzaBB = new WeakReference(((Object) (zzaar1)));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
		//    7   13:putfield        #24  <Field WeakReference zzaBB>
		//    8   16:return          
		}
	}

	class zze
		implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
	{

		public void onConnected(Bundle bundle)
		{
			zzaar.zzf(zzaBA).zza(((zzbap) (new zzd(zzaBA))));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaar zzaBA>
		//    2    4:invokestatic    #30  <Method zzbai zzaar.zzf(zzaar)>
		//    3    7:new             #32  <Class zzaar$zzd>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:getfield        #17  <Field zzaar zzaBA>
		//    7   15:invokespecial   #33  <Method void zzaar$zzd(zzaar)>
		//    8   18:invokeinterface #39  <Method void zzbai.zza(zzbap)>
		//    9   23:return          
		}

		public void onConnectionFailed(ConnectionResult connectionresult)
		{
			zzaar.zzc(zzaBA).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaar zzaBA>
		//    2    4:invokestatic    #46  <Method Lock zzaar.zzc(zzaar)>
		//    3    7:invokeinterface #51  <Method void Lock.lock()>
			if(zzaar.zzb(zzaBA, connectionresult))
		//*   4   12:aload_0         
		//*   5   13:getfield        #17  <Field zzaar zzaBA>
		//*   6   16:aload_1         
		//*   7   17:invokestatic    #55  <Method boolean zzaar.zzb(zzaar, ConnectionResult)>
		//*   8   20:ifeq            40
			{
				zzaar.zzi(zzaBA);
		//    9   23:aload_0         
		//   10   24:getfield        #17  <Field zzaar zzaBA>
		//   11   27:invokestatic    #58  <Method void zzaar.zzi(zzaar)>
				zzaar.zzj(zzaBA);
		//   12   30:aload_0         
		//   13   31:getfield        #17  <Field zzaar zzaBA>
		//   14   34:invokestatic    #61  <Method void zzaar.zzj(zzaar)>
				break MISSING_BLOCK_LABEL_48;
		//   15   37:goto            48
			}
			zzaar.zza(zzaBA, connectionresult);
		//   16   40:aload_0         
		//   17   41:getfield        #17  <Field zzaar zzaBA>
		//   18   44:aload_1         
		//   19   45:invokestatic    #64  <Method void zzaar.zza(zzaar, ConnectionResult)>
			zzaar.zzc(zzaBA).unlock();
		//   20   48:aload_0         
		//   21   49:getfield        #17  <Field zzaar zzaBA>
		//   22   52:invokestatic    #46  <Method Lock zzaar.zzc(zzaar)>
		//   23   55:invokeinterface #67  <Method void Lock.unlock()>
			return;
		//   24   60:return          
			connectionresult;
		//   25   61:astore_1        
			zzaar.zzc(zzaBA).unlock();
		//   26   62:aload_0         
		//   27   63:getfield        #17  <Field zzaar zzaBA>
		//   28   66:invokestatic    #46  <Method Lock zzaar.zzc(zzaar)>
		//   29   69:invokeinterface #67  <Method void Lock.unlock()>
			throw connectionresult;
		//   30   74:aload_1         
		//   31   75:athrow          
		}

		public void onConnectionSuspended(int i)
		{
		//    0    0:return          
		}

		final zzaar zzaBA;

		private zze()
		{
			zzaBA = zzaar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field zzaar zzaBA>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}

	abstract class zzf
		implements Runnable
	{

		public void run()
		{
			zzaar.zzc(zzaBA).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaar zzaBA>
		//    2    4:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
		//    3    7:invokeinterface #35  <Method void Lock.lock()>
			boolean flag = Thread.interrupted();
		//    4   12:invokestatic    #41  <Method boolean Thread.interrupted()>
		//    5   15:istore_1        
			if(flag)
		//*   6   16:iload_1         
		//*   7   17:ifeq            33
			{
				zzaar.zzc(zzaBA).unlock();
		//    8   20:aload_0         
		//    9   21:getfield        #15  <Field zzaar zzaBA>
		//   10   24:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
		//   11   27:invokeinterface #44  <Method void Lock.unlock()>
				return;
		//   12   32:return          
			}
			zzwe();
		//   13   33:aload_0         
		//   14   34:invokevirtual   #47  <Method void zzwe()>
			zzaar.zzc(zzaBA).unlock();
		//   15   37:aload_0         
		//   16   38:getfield        #15  <Field zzaar zzaBA>
		//   17   41:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
		//   18   44:invokeinterface #44  <Method void Lock.unlock()>
			return;
		//   19   49:return          
			Object obj;
			obj;
		//   20   50:astore_2        
			zzaar.zzd(zzaBA).zza(((RuntimeException) (obj)));
		//   21   51:aload_0         
		//   22   52:getfield        #15  <Field zzaar zzaBA>
		//   23   55:invokestatic    #51  <Method zzaav zzaar.zzd(zzaar)>
		//   24   58:aload_2         
		//   25   59:invokevirtual   #57  <Method void zzaav.zza(RuntimeException)>
			zzaar.zzc(zzaBA).unlock();
		//   26   62:aload_0         
		//   27   63:getfield        #15  <Field zzaar zzaBA>
		//   28   66:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
		//   29   69:invokeinterface #44  <Method void Lock.unlock()>
			return;
		//   30   74:return          
			obj;
		//   31   75:astore_2        
			zzaar.zzc(zzaBA).unlock();
		//   32   76:aload_0         
		//   33   77:getfield        #15  <Field zzaar zzaBA>
		//   34   80:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
		//   35   83:invokeinterface #44  <Method void Lock.unlock()>
			throw obj;
		//   36   88:aload_2         
		//   37   89:athrow          
		}

		protected abstract void zzwe();

		final zzaar zzaBA;

		private zzf()
		{
			zzaBA = zzaar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field zzaar zzaBA>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public zzaar(zzaav zzaav1, zzg zzg1, Map map, com.google.android.gms.common.zze zze1, com.google.android.gms.common.api.Api.zza zza1, Lock lock, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		zzaBo = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #79  <Field int zzaBo>
	//    5    9:aload_0         
	//    6   10:new             #81  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #82  <Method void Bundle()>
	//    9   17:putfield        #84  <Field Bundle zzaBq>
	//   10   20:aload_0         
	//   11   21:new             #86  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #87  <Method void HashSet()>
	//   14   28:putfield        #89  <Field Set zzaBr>
		zzaBz = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #91  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #92  <Method void ArrayList()>
	//   19   39:putfield        #94  <Field ArrayList zzaBz>
		zzaBk = zzaav1;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #96  <Field zzaav zzaBk>
		zzaAL = zzg1;
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:putfield        #98  <Field zzg zzaAL>
		zzaAO = map;
	//   26   52:aload_0         
	//   27   53:aload_3         
	//   28   54:putfield        #100 <Field Map zzaAO>
		zzaAQ = zze1;
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:putfield        #102 <Field zze zzaAQ>
		zzazo = zza1;
	//   32   63:aload_0         
	//   33   64:aload           5
	//   34   66:putfield        #104 <Field com.google.android.gms.common.api.Api$zza zzazo>
		zzaAG = lock;
	//   35   69:aload_0         
	//   36   70:aload           6
	//   37   72:putfield        #106 <Field Lock zzaAG>
		mContext = context;
	//   38   75:aload_0         
	//   39   76:aload           7
	//   40   78:putfield        #108 <Field Context mContext>
	//   41   81:return          
	}

	static Context zza(zzaar zzaar1)
	{
		return zzaar1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Context mContext>
	//    2    4:areturn         
	}

	static void zza(zzaar zzaar1, ConnectionResult connectionresult)
	{
		zzaar1.zzf(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method void zzf(ConnectionResult)>
	//    3    5:return          
	}

	static void zza(zzaar zzaar1, ConnectionResult connectionresult, Api api, boolean flag)
	{
		zzaar1.zzb(connectionresult, api, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #120 <Method void zzb(ConnectionResult, Api, boolean)>
	//    5    7:return          
	}

	static void zza(zzaar zzaar1, zzbaw zzbaw1)
	{
		zzaar1.zza(zzbaw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #124 <Method void zza(zzbaw)>
	//    3    5:return          
	}

	private void zza(zzbaw zzbaw1)
	{
		if(!zzcB(0))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #128 <Method boolean zzcB(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		Object obj = ((Object) (zzbaw1.zzyh()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #134 <Method ConnectionResult zzbaw.zzyh()>
	//    7   13:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #140 <Method boolean ConnectionResult.isSuccess()>
	//*  10   18:ifeq            125
		{
			obj = ((Object) (zzbaw1.zzPU()));
	//   11   21:aload_1         
	//   12   22:invokevirtual   #144 <Method zzaf zzbaw.zzPU()>
	//   13   25:astore_2        
			zzbaw1 = ((zzbaw) (((zzaf) (obj)).zzyh()));
	//   14   26:aload_2         
	//   15   27:invokevirtual   #147 <Method ConnectionResult zzaf.zzyh()>
	//   16   30:astore_1        
			if(!((ConnectionResult) (zzbaw1)).isSuccess())
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #140 <Method boolean ConnectionResult.isSuccess()>
	//*  19   35:ifne            91
			{
				obj = ((Object) (String.valueOf(((Object) (zzbaw1)))));
	//   20   38:aload_1         
	//   21   39:invokestatic    #153 <Method String String.valueOf(Object)>
	//   22   42:astore_2        
				Log.wtf("GoogleApiClientConnecting", (new StringBuilder(String.valueOf(obj).length() + 48)).append("Sign-in succeeded with resolve account failure: ").append(((String) (obj))).toString(), ((Throwable) (new Exception())));
	//   23   43:ldc1            #155 <String "GoogleApiClientConnecting">
	//   24   45:new             #157 <Class StringBuilder>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokestatic    #153 <Method String String.valueOf(Object)>
	//   28   53:invokevirtual   #161 <Method int String.length()>
	//   29   56:bipush          48
	//   30   58:iadd            
	//   31   59:invokespecial   #164 <Method void StringBuilder(int)>
	//   32   62:ldc1            #166 <String "Sign-in succeeded with resolve account failure: ">
	//   33   64:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:aload_2         
	//   35   68:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   37   74:new             #176 <Class Exception>
	//   38   77:dup             
	//   39   78:invokespecial   #177 <Method void Exception()>
	//   40   81:invokestatic    #183 <Method int Log.wtf(String, String, Throwable)>
	//   41   84:pop             
				zzf(((ConnectionResult) (zzbaw1)));
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:invokespecial   #116 <Method void zzf(ConnectionResult)>
				return;
	//   45   90:return          
			} else
			{
				zzaBv = true;
	//   46   91:aload_0         
	//   47   92:iconst_1        
	//   48   93:putfield        #185 <Field boolean zzaBv>
				zzaBw = ((zzaf) (obj)).zzyg();
	//   49   96:aload_0         
	//   50   97:aload_2         
	//   51   98:invokevirtual   #189 <Method zzr zzaf.zzyg()>
	//   52  101:putfield        #191 <Field zzr zzaBw>
				zzaBx = ((zzaf) (obj)).zzyi();
	//   53  104:aload_0         
	//   54  105:aload_2         
	//   55  106:invokevirtual   #194 <Method boolean zzaf.zzyi()>
	//   56  109:putfield        #196 <Field boolean zzaBx>
				zzaBy = ((zzaf) (obj)).zzyj();
	//   57  112:aload_0         
	//   58  113:aload_2         
	//   59  114:invokevirtual   #199 <Method boolean zzaf.zzyj()>
	//   60  117:putfield        #201 <Field boolean zzaBy>
				zzwg();
	//   61  120:aload_0         
	//   62  121:invokespecial   #204 <Method void zzwg()>
				return;
	//   63  124:return          
			}
		}
		if(zze(((ConnectionResult) (obj))))
	//*  64  125:aload_0         
	//*  65  126:aload_2         
	//*  66  127:invokespecial   #207 <Method boolean zze(ConnectionResult)>
	//*  67  130:ifeq            142
		{
			zzwj();
	//   68  133:aload_0         
	//   69  134:invokespecial   #210 <Method void zzwj()>
			zzwg();
	//   70  137:aload_0         
	//   71  138:invokespecial   #204 <Method void zzwg()>
			return;
	//   72  141:return          
		} else
		{
			zzf(((ConnectionResult) (obj)));
	//   73  142:aload_0         
	//   74  143:aload_2         
	//   75  144:invokespecial   #116 <Method void zzf(ConnectionResult)>
			return;
	//   76  147:return          
		}
	}

	private boolean zza(int i, boolean flag, ConnectionResult connectionresult)
	{
		if(flag && !zzd(connectionresult))
	//*   0    0:iload_2         
	//*   1    1:ifeq            14
	//*   2    4:aload_0         
	//*   3    5:aload_3         
	//*   4    6:invokespecial   #213 <Method boolean zzd(ConnectionResult)>
	//*   5    9:ifne            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		return zzaAZ == null || i < zzaBn;
	//    8   14:aload_0         
	//    9   15:getfield        #215 <Field ConnectionResult zzaAZ>
	//   10   18:ifnull          29
	//   11   21:iload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #217 <Field int zzaBn>
	//   14   26:icmpge          31
	//   15   29:iconst_1        
	//   16   30:ireturn         
	//   17   31:iconst_0        
	//   18   32:ireturn         
	}

	static boolean zza(zzaar zzaar1, int i)
	{
		return zzaar1.zzcB(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method boolean zzcB(int)>
	//    3    5:ireturn         
	}

	private void zzau(boolean flag)
	{
		if(zzaBs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field zzbai zzaBs>
	//*   2    4:ifnull          46
		{
			if(zzaBs.isConnected() && flag)
	//*   3    7:aload_0         
	//*   4    8:getfield        #222 <Field zzbai zzaBs>
	//*   5   11:invokeinterface #227 <Method boolean zzbai.isConnected()>
	//*   6   16:ifeq            32
	//*   7   19:iload_1         
	//*   8   20:ifeq            32
				zzaBs.zzPJ();
	//    9   23:aload_0         
	//   10   24:getfield        #222 <Field zzbai zzaBs>
	//   11   27:invokeinterface #230 <Method void zzbai.zzPJ()>
			zzaBs.disconnect();
	//   12   32:aload_0         
	//   13   33:getfield        #222 <Field zzbai zzaBs>
	//   14   36:invokeinterface #233 <Method void zzbai.disconnect()>
			zzaBw = null;
	//   15   41:aload_0         
	//   16   42:aconst_null     
	//   17   43:putfield        #191 <Field zzr zzaBw>
		}
	//   18   46:return          
	}

	static com.google.android.gms.common.zze zzb(zzaar zzaar1)
	{
		return zzaar1.zzaAQ;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zze zzaAQ>
	//    2    4:areturn         
	}

	private void zzb(ConnectionResult connectionresult, Api api, boolean flag)
	{
		int i = api.zzve().getPriority();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #240 <Method com.google.android.gms.common.api.Api$zzd Api.zzve()>
	//    2    4:invokevirtual   #245 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//    3    7:istore          4
		if(zza(i, flag, connectionresult))
	//*   4    9:aload_0         
	//*   5   10:iload           4
	//*   6   12:iload_3         
	//*   7   13:aload_1         
	//*   8   14:invokespecial   #247 <Method boolean zza(int, boolean, ConnectionResult)>
	//*   9   17:ifeq            31
		{
			zzaAZ = connectionresult;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #215 <Field ConnectionResult zzaAZ>
			zzaBn = i;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #217 <Field int zzaBn>
		}
		zzaBk.zzaCf.put(((Object) (api.zzvg())), ((Object) (connectionresult)));
	//   16   31:aload_0         
	//   17   32:getfield        #96  <Field zzaav zzaBk>
	//   18   35:getfield        #252 <Field Map zzaav.zzaCf>
	//   19   38:aload_2         
	//   20   39:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//   21   42:aload_1         
	//   22   43:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   23   48:pop             
	//   24   49:return          
	}

	static boolean zzb(zzaar zzaar1, ConnectionResult connectionresult)
	{
		return zzaar1.zze(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method boolean zze(ConnectionResult)>
	//    3    5:ireturn         
	}

	static Lock zzc(zzaar zzaar1)
	{
		return zzaar1.zzaAG;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Lock zzaAG>
	//    2    4:areturn         
	}

	private boolean zzcB(int i)
	{
		if(zzaBo != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field int zzaBo>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          201
		{
			Log.w("GoogleApiClientConnecting", zzaBk.zzaAw.zzwr());
	//    4    8:ldc1            #155 <String "GoogleApiClientConnecting">
	//    5   10:aload_0         
	//    6   11:getfield        #96  <Field zzaav zzaBk>
	//    7   14:getfield        #269 <Field zzaat zzaav.zzaAw>
	//    8   17:invokevirtual   #274 <Method String zzaat.zzwr()>
	//    9   20:invokestatic    #278 <Method int Log.w(String, String)>
	//   10   23:pop             
			String s = String.valueOf(((Object) (this)));
	//   11   24:aload_0         
	//   12   25:invokestatic    #153 <Method String String.valueOf(Object)>
	//   13   28:astore_3        
			Log.w("GoogleApiClientConnecting", (new StringBuilder(String.valueOf(((Object) (s))).length() + 23)).append("Unexpected callback in ").append(s).toString());
	//   14   29:ldc1            #155 <String "GoogleApiClientConnecting">
	//   15   31:new             #157 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:aload_3         
	//   18   36:invokestatic    #153 <Method String String.valueOf(Object)>
	//   19   39:invokevirtual   #161 <Method int String.length()>
	//   20   42:bipush          23
	//   21   44:iadd            
	//   22   45:invokespecial   #164 <Method void StringBuilder(int)>
	//   23   48:ldc2            #280 <String "Unexpected callback in ">
	//   24   51:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload_3         
	//   26   55:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   28   61:invokestatic    #278 <Method int Log.w(String, String)>
	//   29   64:pop             
			int j = zzaBp;
	//   30   65:aload_0         
	//   31   66:getfield        #282 <Field int zzaBp>
	//   32   69:istore_2        
			Log.w("GoogleApiClientConnecting", (new StringBuilder(33)).append("mRemainingConnections=").append(j).toString());
	//   33   70:ldc1            #155 <String "GoogleApiClientConnecting">
	//   34   72:new             #157 <Class StringBuilder>
	//   35   75:dup             
	//   36   76:bipush          33
	//   37   78:invokespecial   #164 <Method void StringBuilder(int)>
	//   38   81:ldc2            #284 <String "mRemainingConnections=">
	//   39   84:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:iload_2         
	//   41   88:invokevirtual   #287 <Method StringBuilder StringBuilder.append(int)>
	//   42   91:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   43   94:invokestatic    #278 <Method int Log.w(String, String)>
	//   44   97:pop             
			s = String.valueOf(((Object) (zzcC(zzaBo))));
	//   45   98:aload_0         
	//   46   99:aload_0         
	//   47  100:getfield        #79  <Field int zzaBo>
	//   48  103:invokespecial   #291 <Method String zzcC(int)>
	//   49  106:invokestatic    #153 <Method String String.valueOf(Object)>
	//   50  109:astore_3        
			String s1 = String.valueOf(((Object) (zzcC(i))));
	//   51  110:aload_0         
	//   52  111:iload_1         
	//   53  112:invokespecial   #291 <Method String zzcC(int)>
	//   54  115:invokestatic    #153 <Method String String.valueOf(Object)>
	//   55  118:astore          4
			i = String.valueOf(((Object) (s))).length();
	//   56  120:aload_3         
	//   57  121:invokestatic    #153 <Method String String.valueOf(Object)>
	//   58  124:invokevirtual   #161 <Method int String.length()>
	//   59  127:istore_1        
			Log.wtf("GoogleApiClientConnecting", (new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 70))).append("GoogleApiClient connecting is in step ").append(s).append(" but received callback for step ").append(s1).toString(), ((Throwable) (new Exception())));
	//   60  128:ldc1            #155 <String "GoogleApiClientConnecting">
	//   61  130:new             #157 <Class StringBuilder>
	//   62  133:dup             
	//   63  134:aload           4
	//   64  136:invokestatic    #153 <Method String String.valueOf(Object)>
	//   65  139:invokevirtual   #161 <Method int String.length()>
	//   66  142:iload_1         
	//   67  143:bipush          70
	//   68  145:iadd            
	//   69  146:iadd            
	//   70  147:invokespecial   #164 <Method void StringBuilder(int)>
	//   71  150:ldc2            #293 <String "GoogleApiClient connecting is in step ">
	//   72  153:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   73  156:aload_3         
	//   74  157:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   75  160:ldc2            #295 <String " but received callback for step ">
	//   76  163:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   77  166:aload           4
	//   78  168:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   79  171:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   80  174:new             #176 <Class Exception>
	//   81  177:dup             
	//   82  178:invokespecial   #177 <Method void Exception()>
	//   83  181:invokestatic    #183 <Method int Log.wtf(String, String, Throwable)>
	//   84  184:pop             
			zzf(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//   85  185:aload_0         
	//   86  186:new             #136 <Class ConnectionResult>
	//   87  189:dup             
	//   88  190:bipush          8
	//   89  192:aconst_null     
	//   90  193:invokespecial   #298 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   91  196:invokespecial   #116 <Method void zzf(ConnectionResult)>
			return false;
	//   92  199:iconst_0        
	//   93  200:ireturn         
		} else
		{
			return true;
	//   94  201:iconst_1        
	//   95  202:ireturn         
		}
	}

	private String zzcC(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               0: 31
	//	               1: 35
	//*   2   28:goto            39
		case 0: // '\0'
			return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
	//    3   31:ldc2            #300 <String "STEP_SERVICE_BINDINGS_AND_SIGN_IN">
	//    4   34:areturn         

		case 1: // '\001'
			return "STEP_GETTING_REMOTE_SERVICE";
	//    5   35:ldc2            #302 <String "STEP_GETTING_REMOTE_SERVICE">
	//    6   38:areturn         
		}
		return "UNKNOWN";
	//    7   39:ldc2            #304 <String "UNKNOWN">
	//    8   42:areturn         
	}

	static zzaav zzd(zzaar zzaar1)
	{
		return zzaar1.zzaBk;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaav zzaBk>
	//    2    4:areturn         
	}

	private boolean zzd(ConnectionResult connectionresult)
	{
		if(connectionresult.hasResolution())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #308 <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		return zzaAQ.zzcw(connectionresult.getErrorCode()) != null;
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field zze zzaAQ>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #311 <Method int ConnectionResult.getErrorCode()>
	//    9   17:invokevirtual   #317 <Method android.content.Intent zze.zzcw(int)>
	//   10   20:ifnull          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private boolean zze(ConnectionResult connectionresult)
	{
		return zzaBt && !connectionresult.hasResolution();
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field boolean zzaBt>
	//    2    4:ifeq            16
	//    3    7:aload_1         
	//    4    8:invokevirtual   #308 <Method boolean ConnectionResult.hasResolution()>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	static boolean zze(zzaar zzaar1)
	{
		return zzaar1.zzaBu;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field boolean zzaBu>
	//    2    4:ireturn         
	}

	static zzbai zzf(zzaar zzaar1)
	{
		return zzaar1.zzaBs;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field zzbai zzaBs>
	//    2    4:areturn         
	}

	private void zzf(ConnectionResult connectionresult)
	{
		zzwk();
	//    0    0:aload_0         
	//    1    1:invokespecial   #326 <Method void zzwk()>
		boolean flag;
		if(!connectionresult.hasResolution())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #308 <Method boolean ConnectionResult.hasResolution()>
	//*   4    8:ifne            16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		zzau(flag);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokespecial   #328 <Method void zzau(boolean)>
		zzaBk.zzh(connectionresult);
	//   13   23:aload_0         
	//   14   24:getfield        #96  <Field zzaav zzaBk>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #331 <Method void zzaav.zzh(ConnectionResult)>
		zzaBk.zzaCj.zzc(connectionresult);
	//   17   31:aload_0         
	//   18   32:getfield        #96  <Field zzaav zzaBk>
	//   19   35:getfield        #335 <Field zzabc$zza zzaav.zzaCj>
	//   20   38:aload_1         
	//   21   39:invokeinterface #339 <Method void zzabc$zza.zzc(ConnectionResult)>
	//   22   44:return          
	}

	static Set zzg(zzaar zzaar1)
	{
		return zzaar1.zzwl();
	//    0    0:aload_0         
	//    1    1:invokespecial   #345 <Method Set zzwl()>
	//    2    4:areturn         
	}

	static zzr zzh(zzaar zzaar1)
	{
		return zzaar1.zzaBw;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field zzr zzaBw>
	//    2    4:areturn         
	}

	static void zzi(zzaar zzaar1)
	{
		zzaar1.zzwj();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method void zzwj()>
	//    2    4:return          
	}

	static void zzj(zzaar zzaar1)
	{
		zzaar1.zzwg();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void zzwg()>
	//    2    4:return          
	}

	static boolean zzk(zzaar zzaar1)
	{
		return zzaar1.zzwf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #353 <Method boolean zzwf()>
	//    2    4:ireturn         
	}

	private boolean zzwf()
	{
		zzaBp = zzaBp - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #282 <Field int zzaBp>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #282 <Field int zzaBp>
		if(zzaBp > 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #282 <Field int zzaBp>
	//*   8   14:ifle            19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(zzaBp < 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #282 <Field int zzaBp>
	//*  13   23:ifge            74
		{
			Log.w("GoogleApiClientConnecting", zzaBk.zzaAw.zzwr());
	//   14   26:ldc1            #155 <String "GoogleApiClientConnecting">
	//   15   28:aload_0         
	//   16   29:getfield        #96  <Field zzaav zzaBk>
	//   17   32:getfield        #269 <Field zzaat zzaav.zzaAw>
	//   18   35:invokevirtual   #274 <Method String zzaat.zzwr()>
	//   19   38:invokestatic    #278 <Method int Log.w(String, String)>
	//   20   41:pop             
			Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", ((Throwable) (new Exception())));
	//   21   42:ldc1            #155 <String "GoogleApiClientConnecting">
	//   22   44:ldc2            #355 <String "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.">
	//   23   47:new             #176 <Class Exception>
	//   24   50:dup             
	//   25   51:invokespecial   #177 <Method void Exception()>
	//   26   54:invokestatic    #183 <Method int Log.wtf(String, String, Throwable)>
	//   27   57:pop             
			zzf(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//   28   58:aload_0         
	//   29   59:new             #136 <Class ConnectionResult>
	//   30   62:dup             
	//   31   63:bipush          8
	//   32   65:aconst_null     
	//   33   66:invokespecial   #298 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   69:invokespecial   #116 <Method void zzf(ConnectionResult)>
			return false;
	//   35   72:iconst_0        
	//   36   73:ireturn         
		}
		if(zzaAZ != null)
	//*  37   74:aload_0         
	//*  38   75:getfield        #215 <Field ConnectionResult zzaAZ>
	//*  39   78:ifnull          102
		{
			zzaBk.zzaCi = zzaBn;
	//   40   81:aload_0         
	//   41   82:getfield        #96  <Field zzaav zzaBk>
	//   42   85:aload_0         
	//   43   86:getfield        #217 <Field int zzaBn>
	//   44   89:putfield        #358 <Field int zzaav.zzaCi>
			zzf(zzaAZ);
	//   45   92:aload_0         
	//   46   93:aload_0         
	//   47   94:getfield        #215 <Field ConnectionResult zzaAZ>
	//   48   97:invokespecial   #116 <Method void zzf(ConnectionResult)>
			return false;
	//   49  100:iconst_0        
	//   50  101:ireturn         
		} else
		{
			return true;
	//   51  102:iconst_1        
	//   52  103:ireturn         
		}
	}

	private void zzwg()
	{
		if(zzaBp != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #282 <Field int zzaBp>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!zzaBu || zzaBv)
	//*   4    8:aload_0         
	//*   5    9:getfield        #322 <Field boolean zzaBu>
	//*   6   12:ifeq            22
	//*   7   15:aload_0         
	//*   8   16:getfield        #185 <Field boolean zzaBv>
	//*   9   19:ifeq            26
			zzwh();
	//   10   22:aload_0         
	//   11   23:invokespecial   #361 <Method void zzwh()>
	//   12   26:return          
	}

	private void zzwh()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #91  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void ArrayList()>
	//    3    7:astore_1        
		zzaBo = 1;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #79  <Field int zzaBo>
		zzaBp = zzaBk.zzaBQ.size();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #96  <Field zzaav zzaBk>
	//   10   18:getfield        #364 <Field Map zzaav.zzaBQ>
	//   11   21:invokeinterface #367 <Method int Map.size()>
	//   12   26:putfield        #282 <Field int zzaBp>
		Iterator iterator = zzaBk.zzaBQ.keySet().iterator();
	//   13   29:aload_0         
	//   14   30:getfield        #96  <Field zzaav zzaBk>
	//   15   33:getfield        #364 <Field Map zzaav.zzaBQ>
	//   16   36:invokeinterface #370 <Method Set Map.keySet()>
	//   17   41:invokeinterface #376 <Method Iterator Set.iterator()>
	//   18   46:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   47:aload_2         
	//   20   48:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//   21   53:ifeq            120
			com.google.android.gms.common.api.Api.zzc zzc1 = (com.google.android.gms.common.api.Api.zzc)iterator.next();
	//   22   56:aload_2         
	//   23   57:invokeinterface #385 <Method Object Iterator.next()>
	//   24   62:checkcast       #387 <Class com.google.android.gms.common.api.Api$zzc>
	//   25   65:astore_3        
			if(zzaBk.zzaCf.containsKey(((Object) (zzc1))))
	//*  26   66:aload_0         
	//*  27   67:getfield        #96  <Field zzaav zzaBk>
	//*  28   70:getfield        #252 <Field Map zzaav.zzaCf>
	//*  29   73:aload_3         
	//*  30   74:invokeinterface #391 <Method boolean Map.containsKey(Object)>
	//*  31   79:ifeq            96
			{
				if(zzwf())
	//*  32   82:aload_0         
	//*  33   83:invokespecial   #353 <Method boolean zzwf()>
	//*  34   86:ifeq            117
					zzwi();
	//   35   89:aload_0         
	//   36   90:invokespecial   #394 <Method void zzwi()>
			} else
	//*  37   93:goto            117
			{
				arraylist.add(((Object) ((com.google.android.gms.common.api.Api.zze)zzaBk.zzaBQ.get(((Object) (zzc1))))));
	//   38   96:aload_1         
	//   39   97:aload_0         
	//   40   98:getfield        #96  <Field zzaav zzaBk>
	//   41  101:getfield        #364 <Field Map zzaav.zzaBQ>
	//   42  104:aload_3         
	//   43  105:invokeinterface #398 <Method Object Map.get(Object)>
	//   44  110:checkcast       #400 <Class com.google.android.gms.common.api.Api$zze>
	//   45  113:invokevirtual   #403 <Method boolean ArrayList.add(Object)>
	//   46  116:pop             
			}
		} while(true);
	//   47  117:goto            47
		if(!arraylist.isEmpty())
	//*  48  120:aload_1         
	//*  49  121:invokevirtual   #406 <Method boolean ArrayList.isEmpty()>
	//*  50  124:ifne            152
			zzaBz.add(((Object) (zzaaw.zzwv().submit(((Runnable) (new zzc(arraylist)))))));
	//   51  127:aload_0         
	//   52  128:getfield        #94  <Field ArrayList zzaBz>
	//   53  131:invokestatic    #412 <Method ExecutorService zzaaw.zzwv()>
	//   54  134:new             #20  <Class zzaar$zzc>
	//   55  137:dup             
	//   56  138:aload_0         
	//   57  139:aload_1         
	//   58  140:invokespecial   #415 <Method void zzaar$zzc(zzaar, ArrayList)>
	//   59  143:invokeinterface #421 <Method Future ExecutorService.submit(Runnable)>
	//   60  148:invokevirtual   #403 <Method boolean ArrayList.add(Object)>
	//   61  151:pop             
	//   62  152:return          
	}

	private void zzwi()
	{
		zzaBk.zzwt();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaav zzaBk>
	//    2    4:invokevirtual   #424 <Method void zzaav.zzwt()>
		zzaaw.zzwv().execute(new Runnable() {

			public void run()
			{
				zzaar.zzb(zzaBA).zzaF(zzaar.zza(zzaBA));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field zzaar zzaBA>
			//    2    4:invokestatic    #25  <Method zze zzaar.zzb(zzaar)>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field zzaar zzaBA>
			//    5   11:invokestatic    #29  <Method Context zzaar.zza(zzaar)>
			//    6   14:invokevirtual   #35  <Method void zze.zzaF(Context)>
			//    7   17:return          
			}

			final zzaar zzaBA;

			
			{
				zzaBA = zzaar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field zzaar zzaBA>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    7:invokestatic    #412 <Method ExecutorService zzaaw.zzwv()>
	//    4   10:new             #8   <Class zzaar$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #426 <Method void zzaar$1(zzaar)>
	//    8   18:invokeinterface #430 <Method void ExecutorService.execute(Runnable)>
		if(zzaBs != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #222 <Field zzbai zzaBs>
	//*  11   27:ifnull          59
		{
			if(zzaBx)
	//*  12   30:aload_0         
	//*  13   31:getfield        #196 <Field boolean zzaBx>
	//*  14   34:ifeq            54
				zzaBs.zza(zzaBw, zzaBy);
	//   15   37:aload_0         
	//   16   38:getfield        #222 <Field zzbai zzaBs>
	//   17   41:aload_0         
	//   18   42:getfield        #191 <Field zzr zzaBw>
	//   19   45:aload_0         
	//   20   46:getfield        #201 <Field boolean zzaBy>
	//   21   49:invokeinterface #433 <Method void zzbai.zza(zzr, boolean)>
			zzau(false);
	//   22   54:aload_0         
	//   23   55:iconst_0        
	//   24   56:invokespecial   #328 <Method void zzau(boolean)>
		}
		com.google.android.gms.common.api.Api.zzc zzc1;
		for(Iterator iterator = zzaBk.zzaCf.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)zzaBk.zzaBQ.get(((Object) (zzc1)))).disconnect())
	//*  25   59:aload_0         
	//*  26   60:getfield        #96  <Field zzaav zzaBk>
	//*  27   63:getfield        #252 <Field Map zzaav.zzaCf>
	//*  28   66:invokeinterface #370 <Method Set Map.keySet()>
	//*  29   71:invokeinterface #376 <Method Iterator Set.iterator()>
	//*  30   76:astore_1        
	//*  31   77:aload_1         
	//*  32   78:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//*  33   83:ifeq            120
			zzc1 = (com.google.android.gms.common.api.Api.zzc)iterator.next();
	//   34   86:aload_1         
	//   35   87:invokeinterface #385 <Method Object Iterator.next()>
	//   36   92:checkcast       #387 <Class com.google.android.gms.common.api.Api$zzc>
	//   37   95:astore_2        

	//   38   96:aload_0         
	//   39   97:getfield        #96  <Field zzaav zzaBk>
	//   40  100:getfield        #364 <Field Map zzaav.zzaBQ>
	//   41  103:aload_2         
	//   42  104:invokeinterface #398 <Method Object Map.get(Object)>
	//   43  109:checkcast       #400 <Class com.google.android.gms.common.api.Api$zze>
	//   44  112:invokeinterface #434 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
	//*  45  117:goto            77
		Bundle bundle;
		if(zzaBq.isEmpty())
	//*  46  120:aload_0         
	//*  47  121:getfield        #84  <Field Bundle zzaBq>
	//*  48  124:invokevirtual   #435 <Method boolean Bundle.isEmpty()>
	//*  49  127:ifeq            135
			bundle = null;
	//   50  130:aconst_null     
	//   51  131:astore_1        
		else
	//*  52  132:goto            140
			bundle = zzaBq;
	//   53  135:aload_0         
	//   54  136:getfield        #84  <Field Bundle zzaBq>
	//   55  139:astore_1        
		zzaBk.zzaCj.zzo(bundle);
	//   56  140:aload_0         
	//   57  141:getfield        #96  <Field zzaav zzaBk>
	//   58  144:getfield        #335 <Field zzabc$zza zzaav.zzaCj>
	//   59  147:aload_1         
	//   60  148:invokeinterface #439 <Method void zzabc$zza.zzo(Bundle)>
	//   61  153:return          
	}

	private void zzwj()
	{
		zzaBu = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #322 <Field boolean zzaBu>
		zzaBk.zzaAw.zzaBR = Collections.emptySet();
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field zzaav zzaBk>
	//    5    9:getfield        #269 <Field zzaat zzaav.zzaAw>
	//    6   12:invokestatic    #444 <Method Set Collections.emptySet()>
	//    7   15:putfield        #447 <Field Set zzaat.zzaBR>
		Iterator iterator = zzaBr.iterator();
	//    8   18:aload_0         
	//    9   19:getfield        #89  <Field Set zzaBr>
	//   10   22:invokeinterface #376 <Method Iterator Set.iterator()>
	//   11   27:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   28:aload_1         
	//   13   29:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            90
			com.google.android.gms.common.api.Api.zzc zzc1 = (com.google.android.gms.common.api.Api.zzc)iterator.next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #385 <Method Object Iterator.next()>
	//   17   43:checkcast       #387 <Class com.google.android.gms.common.api.Api$zzc>
	//   18   46:astore_2        
			if(!zzaBk.zzaCf.containsKey(((Object) (zzc1))))
	//*  19   47:aload_0         
	//*  20   48:getfield        #96  <Field zzaav zzaBk>
	//*  21   51:getfield        #252 <Field Map zzaav.zzaCf>
	//*  22   54:aload_2         
	//*  23   55:invokeinterface #391 <Method boolean Map.containsKey(Object)>
	//*  24   60:ifne            87
				zzaBk.zzaCf.put(((Object) (zzc1)), ((Object) (new ConnectionResult(17, ((android.app.PendingIntent) (null))))));
	//   25   63:aload_0         
	//   26   64:getfield        #96  <Field zzaav zzaBk>
	//   27   67:getfield        #252 <Field Map zzaav.zzaCf>
	//   28   70:aload_2         
	//   29   71:new             #136 <Class ConnectionResult>
	//   30   74:dup             
	//   31   75:bipush          17
	//   32   77:aconst_null     
	//   33   78:invokespecial   #298 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   81:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   35   86:pop             
		} while(true);
	//   36   87:goto            28
	//   37   90:return          
	}

	private void zzwk()
	{
		for(Iterator iterator = zzaBz.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ArrayList zzaBz>
	//    2    4:invokevirtual   #448 <Method Iterator ArrayList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_1         
	//    8   18:invokeinterface #385 <Method Object Iterator.next()>
	//    9   23:checkcast       #450 <Class Future>
	//   10   26:iconst_1        
	//   11   27:invokeinterface #454 <Method boolean Future.cancel(boolean)>
	//   12   32:pop             
	//*  13   33:goto            8
		zzaBz.clear();
	//   14   36:aload_0         
	//   15   37:getfield        #94  <Field ArrayList zzaBz>
	//   16   40:invokevirtual   #457 <Method void ArrayList.clear()>
	//   17   43:return          
	}

	private Set zzwl()
	{
		if(zzaAL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field zzg zzaAL>
	//*   2    4:ifnonnull       11
			return Collections.emptySet();
	//    3    7:invokestatic    #444 <Method Set Collections.emptySet()>
	//    4   10:areturn         
		HashSet hashset = new HashSet(((java.util.Collection) (zzaAL.zzxL())));
	//    5   11:new             #86  <Class HashSet>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #98  <Field zzg zzaAL>
	//    9   19:invokevirtual   #462 <Method Set zzg.zzxL()>
	//   10   22:invokespecial   #465 <Method void HashSet(java.util.Collection)>
	//   11   25:astore_1        
		Map map = zzaAL.zzxN();
	//   12   26:aload_0         
	//   13   27:getfield        #98  <Field zzg zzaAL>
	//   14   30:invokevirtual   #469 <Method Map zzg.zzxN()>
	//   15   33:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   16   34:aload_2         
	//   17   35:invokeinterface #370 <Method Set Map.keySet()>
	//   18   40:invokeinterface #376 <Method Iterator Set.iterator()>
	//   19   45:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   46:aload_3         
	//   21   47:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//   22   52:ifeq            110
			Api api = (Api)iterator.next();
	//   23   55:aload_3         
	//   24   56:invokeinterface #385 <Method Object Iterator.next()>
	//   25   61:checkcast       #236 <Class Api>
	//   26   64:astore          4
			if(!zzaBk.zzaCf.containsKey(((Object) (api.zzvg()))))
	//*  27   66:aload_0         
	//*  28   67:getfield        #96  <Field zzaav zzaBk>
	//*  29   70:getfield        #252 <Field Map zzaav.zzaCf>
	//*  30   73:aload           4
	//*  31   75:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//*  32   78:invokeinterface #391 <Method boolean Map.containsKey(Object)>
	//*  33   83:ifne            107
				((Set) (hashset)).addAll(((java.util.Collection) (((com.google.android.gms.common.internal.zzg.zza)map.get(((Object) (api)))).zzakq)));
	//   34   86:aload_1         
	//   35   87:aload_2         
	//   36   88:aload           4
	//   37   90:invokeinterface #398 <Method Object Map.get(Object)>
	//   38   95:checkcast       #471 <Class com.google.android.gms.common.internal.zzg$zza>
	//   39   98:getfield        #474 <Field Set com.google.android.gms.common.internal.zzg$zza.zzakq>
	//   40  101:invokeinterface #478 <Method boolean Set.addAll(java.util.Collection)>
	//   41  106:pop             
		} while(true);
	//   42  107:goto            46
		return ((Set) (hashset));
	//   43  110:aload_1         
	//   44  111:areturn         
	}

	public void begin()
	{
		zzaBk.zzaCf.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaav zzaBk>
	//    2    4:getfield        #252 <Field Map zzaav.zzaCf>
	//    3    7:invokeinterface #481 <Method void Map.clear()>
		zzaBu = false;
	//    4   12:aload_0         
	//    5   13:iconst_0        
	//    6   14:putfield        #322 <Field boolean zzaBu>
		zzaAZ = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #215 <Field ConnectionResult zzaAZ>
		zzaBo = 0;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #79  <Field int zzaBo>
		zzaBt = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #319 <Field boolean zzaBt>
		zzaBv = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #185 <Field boolean zzaBv>
		zzaBx = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #196 <Field boolean zzaBx>
		boolean flag = false;
	//   22   42:iconst_0        
	//   23   43:istore_1        
		HashMap hashmap = new HashMap();
	//   24   44:new             #483 <Class HashMap>
	//   25   47:dup             
	//   26   48:invokespecial   #484 <Method void HashMap()>
	//   27   51:astore          4
		boolean flag2;
		Api api;
		com.google.android.gms.common.api.Api.zze zze2;
		for(Iterator iterator = zzaAO.keySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (zze2)), ((Object) (new zza(this, api, flag2)))))
	//*  28   53:aload_0         
	//*  29   54:getfield        #100 <Field Map zzaAO>
	//*  30   57:invokeinterface #370 <Method Set Map.keySet()>
	//*  31   62:invokeinterface #376 <Method Iterator Set.iterator()>
	//*  32   67:astore          5
	//*  33   69:aload           5
	//*  34   71:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//*  35   76:ifeq            220
		{
			api = (Api)iterator.next();
	//   36   79:aload           5
	//   37   81:invokeinterface #385 <Method Object Iterator.next()>
	//   38   86:checkcast       #236 <Class Api>
	//   39   89:astore          6
			zze2 = (com.google.android.gms.common.api.Api.zze)zzaBk.zzaBQ.get(((Object) (api.zzvg())));
	//   40   91:aload_0         
	//   41   92:getfield        #96  <Field zzaav zzaBk>
	//   42   95:getfield        #364 <Field Map zzaav.zzaBQ>
	//   43   98:aload           6
	//   44  100:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//   45  103:invokeinterface #398 <Method Object Map.get(Object)>
	//   46  108:checkcast       #400 <Class com.google.android.gms.common.api.Api$zze>
	//   47  111:astore          7
			boolean flag1;
			if(api.zzve().getPriority() == 1)
	//*  48  113:aload           6
	//*  49  115:invokevirtual   #240 <Method com.google.android.gms.common.api.Api$zzd Api.zzve()>
	//*  50  118:invokevirtual   #245 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//*  51  121:iconst_1        
	//*  52  122:icmpne          130
				flag1 = true;
	//   53  125:iconst_1        
	//   54  126:istore_2        
			else
	//*  55  127:goto            132
				flag1 = false;
	//   56  130:iconst_0        
	//   57  131:istore_2        
			flag |= flag1;
	//   58  132:iload_1         
	//   59  133:iload_2         
	//   60  134:ior             
	//   61  135:istore_1        
			flag2 = ((Boolean)zzaAO.get(((Object) (api)))).booleanValue();
	//   62  136:aload_0         
	//   63  137:getfield        #100 <Field Map zzaAO>
	//   64  140:aload           6
	//   65  142:invokeinterface #398 <Method Object Map.get(Object)>
	//   66  147:checkcast       #486 <Class Boolean>
	//   67  150:invokevirtual   #489 <Method boolean Boolean.booleanValue()>
	//   68  153:istore_3        
			if(!zze2.zzrd())
				continue;
	//   69  154:aload           7
	//   70  156:invokeinterface #492 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
	//   71  161:ifeq            196
			zzaBu = true;
	//   72  164:aload_0         
	//   73  165:iconst_1        
	//   74  166:putfield        #322 <Field boolean zzaBu>
			if(flag2)
	//*  75  169:iload_3         
	//*  76  170:ifeq            191
				zzaBr.add(((Object) (api.zzvg())));
	//   77  173:aload_0         
	//   78  174:getfield        #89  <Field Set zzaBr>
	//   79  177:aload           6
	//   80  179:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//   81  182:invokeinterface #493 <Method boolean Set.add(Object)>
	//   82  187:pop             
			else
	//*  83  188:goto            196
				zzaBt = false;
	//   84  191:aload_0         
	//   85  192:iconst_0        
	//   86  193:putfield        #319 <Field boolean zzaBt>
		}

	//   87  196:aload           4
	//   88  198:aload           7
	//   89  200:new             #10  <Class zzaar$zza>
	//   90  203:dup             
	//   91  204:aload_0         
	//   92  205:aload           6
	//   93  207:iload_3         
	//   94  208:invokespecial   #496 <Method void zzaar$zza(zzaar, Api, boolean)>
	//   95  211:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   96  216:pop             
	//*  97  217:goto            69
		if(flag)
	//*  98  220:iload_1         
	//*  99  221:ifeq            229
			zzaBu = false;
	//  100  224:aload_0         
	//  101  225:iconst_0        
	//  102  226:putfield        #322 <Field boolean zzaBu>
		if(zzaBu)
	//* 103  229:aload_0         
	//* 104  230:getfield        #322 <Field boolean zzaBu>
	//* 105  233:ifeq            310
		{
			zzaAL.zzc(Integer.valueOf(zzaBk.zzaAw.getSessionId()));
	//  106  236:aload_0         
	//  107  237:getfield        #98  <Field zzg zzaAL>
	//  108  240:aload_0         
	//  109  241:getfield        #96  <Field zzaav zzaBk>
	//  110  244:getfield        #269 <Field zzaat zzaav.zzaAw>
	//  111  247:invokevirtual   #499 <Method int zzaat.getSessionId()>
	//  112  250:invokestatic    #504 <Method Integer Integer.valueOf(int)>
	//  113  253:invokevirtual   #507 <Method void zzg.zzc(Integer)>
			zze zze1 = new zze();
	//  114  256:new             #28  <Class zzaar$zze>
	//  115  259:dup             
	//  116  260:aload_0         
	//  117  261:aconst_null     
	//  118  262:invokespecial   #510 <Method void zzaar$zze(zzaar, zzaar$1)>
	//  119  265:astore          5
			zzaBs = (zzbai)zzazo.zza(mContext, zzaBk.zzaAw.getLooper(), zzaAL, ((Object) (zzaAL.zzxR())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (zze1)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zze1)));
	//  120  267:aload_0         
	//  121  268:aload_0         
	//  122  269:getfield        #104 <Field com.google.android.gms.common.api.Api$zza zzazo>
	//  123  272:aload_0         
	//  124  273:getfield        #108 <Field Context mContext>
	//  125  276:aload_0         
	//  126  277:getfield        #96  <Field zzaav zzaBk>
	//  127  280:getfield        #269 <Field zzaat zzaav.zzaAw>
	//  128  283:invokevirtual   #514 <Method Looper zzaat.getLooper()>
	//  129  286:aload_0         
	//  130  287:getfield        #98  <Field zzg zzaAL>
	//  131  290:aload_0         
	//  132  291:getfield        #98  <Field zzg zzaAL>
	//  133  294:invokevirtual   #518 <Method zzbaj zzg.zzxR()>
	//  134  297:aload           5
	//  135  299:aload           5
	//  136  301:invokevirtual   #523 <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.common.api.Api$zza.zza(Context, Looper, zzg, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//  137  304:checkcast       #224 <Class zzbai>
	//  138  307:putfield        #222 <Field zzbai zzaBs>
		}
		zzaBp = zzaBk.zzaBQ.size();
	//  139  310:aload_0         
	//  140  311:aload_0         
	//  141  312:getfield        #96  <Field zzaav zzaBk>
	//  142  315:getfield        #364 <Field Map zzaav.zzaBQ>
	//  143  318:invokeinterface #367 <Method int Map.size()>
	//  144  323:putfield        #282 <Field int zzaBp>
		zzaBz.add(((Object) (zzaaw.zzwv().submit(((Runnable) (new zzb(((Map) (hashmap)))))))));
	//  145  326:aload_0         
	//  146  327:getfield        #94  <Field ArrayList zzaBz>
	//  147  330:invokestatic    #412 <Method ExecutorService zzaaw.zzwv()>
	//  148  333:new             #13  <Class zzaar$zzb>
	//  149  336:dup             
	//  150  337:aload_0         
	//  151  338:aload           4
	//  152  340:invokespecial   #526 <Method void zzaar$zzb(zzaar, Map)>
	//  153  343:invokeinterface #421 <Method Future ExecutorService.submit(Runnable)>
	//  154  348:invokevirtual   #403 <Method boolean ArrayList.add(Object)>
	//  155  351:pop             
	//  156  352:return          
	}

	public void connect()
	{
	//    0    0:return          
	}

	public boolean disconnect()
	{
		zzwk();
	//    0    0:aload_0         
	//    1    1:invokespecial   #326 <Method void zzwk()>
		zzau(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #328 <Method void zzau(boolean)>
		zzaBk.zzh(((ConnectionResult) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field zzaav zzaBk>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #331 <Method void zzaav.zzh(ConnectionResult)>
		return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public void onConnected(Bundle bundle)
	{
		if(!zzcB(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #128 <Method boolean zzcB(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		if(bundle != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			zzaBq.putAll(bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #84  <Field Bundle zzaBq>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #531 <Method void Bundle.putAll(Bundle)>
		if(zzwf())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #353 <Method boolean zzwf()>
	//*  13   25:ifeq            32
			zzwi();
	//   14   28:aload_0         
	//   15   29:invokespecial   #394 <Method void zzwi()>
	//   16   32:return          
	}

	public void onConnectionSuspended(int i)
	{
		zzf(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:new             #136 <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aconst_null     
	//    5    8:invokespecial   #298 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    6   11:invokespecial   #116 <Method void zzf(ConnectionResult)>
	//    7   14:return          
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		zzaBk.zzaAw.zzaAU.add(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaav zzaBk>
	//    2    4:getfield        #269 <Field zzaat zzaav.zzaAw>
	//    3    7:getfield        #537 <Field Queue zzaat.zzaAU>
	//    4   10:aload_1         
	//    5   11:invokeinterface #540 <Method boolean Queue.add(Object)>
	//    6   16:pop             
		return zza1;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, boolean flag)
	{
		if(!zzcB(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #128 <Method boolean zzcB(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		zzb(connectionresult, api, flag);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:invokespecial   #120 <Method void zzb(ConnectionResult, Api, boolean)>
		if(zzwf())
	//*  10   16:aload_0         
	//*  11   17:invokespecial   #353 <Method boolean zzwf()>
	//*  12   20:ifeq            27
			zzwi();
	//   13   23:aload_0         
	//   14   24:invokespecial   #394 <Method void zzwi()>
	//   15   27:return          
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//    0    0:new             #543 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #545 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokespecial   #548 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	private final Context mContext;
	private final Lock zzaAG;
	private final zzg zzaAL;
	private final Map zzaAO;
	private final com.google.android.gms.common.zze zzaAQ;
	private ConnectionResult zzaAZ;
	private final zzaav zzaBk;
	private int zzaBn;
	private int zzaBo;
	private int zzaBp;
	private final Bundle zzaBq = new Bundle();
	private final Set zzaBr = new HashSet();
	private zzbai zzaBs;
	private boolean zzaBt;
	private boolean zzaBu;
	private boolean zzaBv;
	private zzr zzaBw;
	private boolean zzaBx;
	private boolean zzaBy;
	private ArrayList zzaBz;
	private final com.google.android.gms.common.api.Api.zza zzazo;
}
