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
import com.google.android.gms.common.zzc;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaam, zzayb, zzaxn, zzaan, 
//			zzaal, zzaao, zzaxr

public class zzaaj
	implements zzaam
{
	private static class zza
		implements com.google.android.gms.common.internal.zzf.zzf
	{

		static int zza(zza zza1)
		{
			return zza1.zzazb;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int zzazb>
		//    2    4:ireturn         
		}

		public void zzg(ConnectionResult connectionresult)
		{
			zzaaj zzaaj1;
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			zzaaj1 = (zzaaj)zzaAb.get();
		//    2    2:aload_0         
		//    3    3:getfield        #29  <Field WeakReference zzaAb>
		//    4    6:invokevirtual   #44  <Method Object WeakReference.get()>
		//    5    9:checkcast       #8   <Class zzaaj>
		//    6   12:astore_3        
			if(zzaaj1 == null)
		//*   7   13:aload_3         
		//*   8   14:ifnonnull       18
				return;
		//    9   17:return          
			if(Looper.myLooper() == zzaaj.zzd(zzaaj1).zzazd.getLooper())
		//*  10   18:invokestatic    #50  <Method Looper Looper.myLooper()>
		//*  11   21:aload_3         
		//*  12   22:invokestatic    #54  <Method zzaan zzaaj.zzd(zzaaj)>
		//*  13   25:getfield        #60  <Field zzaal zzaan.zzazd>
		//*  14   28:invokevirtual   #65  <Method Looper zzaal.getLooper()>
		//*  15   31:if_acmpne       36
				flag = true;
		//   16   34:iconst_1        
		//   17   35:istore_2        
			zzac.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
		//   18   36:iload_2         
		//   19   37:ldc1            #67  <String "onReportServiceBinding must be called on the GoogleApiClient handler thread">
		//   20   39:invokestatic    #72  <Method void zzac.zza(boolean, Object)>
			com.google.android.gms.internal.zzaaj.zzc(zzaaj1).lock();
		//   21   42:aload_3         
		//   22   43:invokestatic    #76  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   23   46:invokeinterface #81  <Method void Lock.lock()>
			boolean flag1 = zzaaj.zza(zzaaj1, 0);
		//   24   51:aload_3         
		//   25   52:iconst_0        
		//   26   53:invokestatic    #84  <Method boolean zzaaj.zza(zzaaj, int)>
		//   27   56:istore_2        
			if(!flag1)
		//*  28   57:iload_2         
		//*  29   58:ifne            71
			{
				com.google.android.gms.internal.zzaaj.zzc(zzaaj1).unlock();
		//   30   61:aload_3         
		//   31   62:invokestatic    #76  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   32   65:invokeinterface #87  <Method void Lock.unlock()>
				return;
		//   33   70:return          
			}
			if(!connectionresult.isSuccess())
		//*  34   71:aload_1         
		//*  35   72:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
		//*  36   75:ifne            91
				zzaaj.zza(zzaaj1, connectionresult, zzawb, zzazb);
		//   37   78:aload_3         
		//   38   79:aload_1         
		//   39   80:aload_0         
		//   40   81:getfield        #31  <Field Api zzawb>
		//   41   84:aload_0         
		//   42   85:getfield        #33  <Field int zzazb>
		//   43   88:invokestatic    #96  <Method void zzaaj.zza(zzaaj, ConnectionResult, Api, int)>
			if(zzaaj.zzk(zzaaj1))
		//*  44   91:aload_3         
		//*  45   92:invokestatic    #100 <Method boolean zzaaj.zzk(zzaaj)>
		//*  46   95:ifeq            102
				zzaaj.zzj(zzaaj1);
		//   47   98:aload_3         
		//   48   99:invokestatic    #104 <Method void zzaaj.zzj(zzaaj)>
			com.google.android.gms.internal.zzaaj.zzc(zzaaj1).unlock();
		//   49  102:aload_3         
		//   50  103:invokestatic    #76  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   51  106:invokeinterface #87  <Method void Lock.unlock()>
			return;
		//   52  111:return          
			connectionresult;
		//   53  112:astore_1        
			com.google.android.gms.internal.zzaaj.zzc(zzaaj1).unlock();
		//   54  113:aload_3         
		//   55  114:invokestatic    #76  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   56  117:invokeinterface #87  <Method void Lock.unlock()>
			throw connectionresult;
		//   57  122:aload_1         
		//   58  123:athrow          
		}

		private final WeakReference zzaAb;
		private final Api zzawb;
		private final int zzazb;

		public zza(zzaaj zzaaj1, Api api, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			zzaAb = new WeakReference(((Object) (zzaaj1)));
		//    2    4:aload_0         
		//    3    5:new             #24  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #27  <Method void WeakReference(Object)>
		//    7   13:putfield        #29  <Field WeakReference zzaAb>
			zzawb = api;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #31  <Field Api zzawb>
			zzazb = i;
		//   11   21:aload_0         
		//   12   22:iload_3         
		//   13   23:putfield        #33  <Field int zzazb>
		//   14   26:return          
		}
	}

	private class zzb extends zzf
	{

		public void zzvA()
		{
			boolean flag;
			boolean flag1;
			int i;
			boolean flag3;
			Iterator iterator;
			flag3 = true;
		//    0    0:iconst_1        
		//    1    1:istore          5
			i = 0;
		//    2    3:iconst_0        
		//    3    4:istore          4
			iterator = zzaAc.keySet().iterator();
		//    4    6:aload_0         
		//    5    7:getfield        #25  <Field Map zzaAc>
		//    6   10:invokeinterface #37  <Method Set Map.keySet()>
		//    7   15:invokeinterface #43  <Method Iterator Set.iterator()>
		//    8   20:astore          6
			flag1 = true;
		//    9   22:iconst_1        
		//   10   23:istore_2        
			flag = false;
		//   11   24:iconst_0        
		//   12   25:istore_1        
_L5:
			com.google.android.gms.common.api.Api.zze zze1;
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_308;
		//   13   26:aload           6
		//   14   28:invokeinterface #49  <Method boolean Iterator.hasNext()>
		//   15   33:ifeq            308
			zze1 = (com.google.android.gms.common.api.Api.zze)iterator.next();
		//   16   36:aload           6
		//   17   38:invokeinterface #53  <Method Object Iterator.next()>
		//   18   43:checkcast       #55  <Class com.google.android.gms.common.api.Api$zze>
		//   19   46:astore          7
			if(!zze1.zzuI()) goto _L2; else goto _L1
		//   20   48:aload           7
		//   21   50:invokeinterface #58  <Method boolean com.google.android.gms.common.api.Api$zze.zzuI()>
		//   22   55:ifeq            156
_L1:
			if(zza.zza((zza)zzaAc.get(((Object) (zze1)))) != 0) goto _L4; else goto _L3
		//   23   58:aload_0         
		//   24   59:getfield        #25  <Field Map zzaAc>
		//   25   62:aload           7
		//   26   64:invokeinterface #62  <Method Object Map.get(Object)>
		//   27   69:checkcast       #64  <Class zzaaj$zza>
		//   28   72:invokestatic    #68  <Method int zzaaj$zza.zza(zzaaj$zza)>
		//   29   75:ifne            301
_L3:
			boolean flag2;
			flag = true;
		//   30   78:iconst_1        
		//   31   79:istore_1        
			flag2 = flag3;
		//   32   80:iload           5
		//   33   82:istore_3        
_L7:
			if(flag2)
		//*  34   83:iload_3         
		//*  35   84:ifeq            106
				i = zzaaj.zzb(zzaAa).isGooglePlayServicesAvailable(zzaaj.zza(zzaAa));
		//   36   87:aload_0         
		//   37   88:getfield        #20  <Field zzaaj zzaAa>
		//   38   91:invokestatic    #71  <Method zzc zzaaj.zzb(zzaaj)>
		//   39   94:aload_0         
		//   40   95:getfield        #20  <Field zzaaj zzaAa>
		//   41   98:invokestatic    #74  <Method Context zzaaj.zza(zzaaj)>
		//   42  101:invokevirtual   #80  <Method int zzc.isGooglePlayServicesAvailable(Context)>
		//   43  104:istore          4
			if(i != 0 && (flag || flag1))
		//*  44  106:iload           4
		//*  45  108:ifeq            171
		//*  46  111:iload_1         
		//*  47  112:ifne            119
		//*  48  115:iload_2         
		//*  49  116:ifeq            171
			{
				ConnectionResult connectionresult = new ConnectionResult(i, ((android.app.PendingIntent) (null)));
		//   50  119:new             #82  <Class ConnectionResult>
		//   51  122:dup             
		//   52  123:iload           4
		//   53  125:aconst_null     
		//   54  126:invokespecial   #85  <Method void ConnectionResult(int, android.app.PendingIntent)>
		//   55  129:astore          6
				zzaaj.zzd(zzaAa).zza(((zzaan.zza) (new zzaan.zza(this, ((zzaam) (zzaAa)), connectionresult) {

					public void zzvA()
					{
						zzaaj.zza(zzaAe.zzaAa, zzaAd);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaaj$zzb zzaAe>
					//    2    4:getfield        #30  <Field zzaaj zzaaj$zzb.zzaAa>
					//    3    7:aload_0         
					//    4    8:getfield        #22  <Field ConnectionResult zzaAd>
					//    5   11:invokestatic    #34  <Method void zzaaj.zza(zzaaj, ConnectionResult)>
					//    6   14:return          
					}

					final ConnectionResult zzaAd;
					final zzb zzaAe;

			
			{
				zzaAe = zzb1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaaj$zzb zzaAe>
				zzaAd = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field ConnectionResult zzaAd>
				super(zzaam1);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void zzaan$zza(zzaam)>
			//    9   15:return          
			}
				}
)));
		//   56  131:aload_0         
		//   57  132:getfield        #20  <Field zzaaj zzaAa>
		//   58  135:invokestatic    #89  <Method zzaan zzaaj.zzd(zzaaj)>
		//   59  138:new             #9   <Class zzaaj$zzb$1>
		//   60  141:dup             
		//   61  142:aload_0         
		//   62  143:aload_0         
		//   63  144:getfield        #20  <Field zzaaj zzaAa>
		//   64  147:aload           6
		//   65  149:invokespecial   #92  <Method void zzaaj$zzb$1(zzaaj$zzb, zzaam, ConnectionResult)>
		//   66  152:invokevirtual   #97  <Method void zzaan.zza(zzaan$zza)>
			} else
		//*  67  155:return          
		//*  68  156:iconst_0        
		//*  69  157:istore_3        
		//*  70  158:iload_1         
		//*  71  159:istore_2        
		//*  72  160:iload_3         
		//*  73  161:istore_1        
		//*  74  162:iload_2         
		//*  75  163:istore_3        
		//*  76  164:iload_1         
		//*  77  165:istore_2        
		//*  78  166:iload_3         
		//*  79  167:istore_1        
		//*  80  168:goto            26
			{
				if(zzaaj.zze(zzaAa))
		//*  81  171:aload_0         
		//*  82  172:getfield        #20  <Field zzaaj zzaAa>
		//*  83  175:invokestatic    #101 <Method boolean zzaaj.zze(zzaaj)>
		//*  84  178:ifeq            193
					zzaaj.zzf(zzaAa).connect();
		//   85  181:aload_0         
		//   86  182:getfield        #20  <Field zzaaj zzaAa>
		//   87  185:invokestatic    #105 <Method zzaxn zzaaj.zzf(zzaaj)>
		//   88  188:invokeinterface #110 <Method void zzaxn.connect()>
				Iterator iterator1 = zzaAc.keySet().iterator();
		//   89  193:aload_0         
		//   90  194:getfield        #25  <Field Map zzaAc>
		//   91  197:invokeinterface #37  <Method Set Map.keySet()>
		//   92  202:invokeinterface #43  <Method Iterator Set.iterator()>
		//   93  207:astore          6
				while(iterator1.hasNext()) 
		//*  94  209:aload           6
		//*  95  211:invokeinterface #49  <Method boolean Iterator.hasNext()>
		//*  96  216:ifeq            155
				{
					com.google.android.gms.common.api.Api.zze zze2 = (com.google.android.gms.common.api.Api.zze)iterator1.next();
		//   97  219:aload           6
		//   98  221:invokeinterface #53  <Method Object Iterator.next()>
		//   99  226:checkcast       #55  <Class com.google.android.gms.common.api.Api$zze>
		//  100  229:astore          7
					com.google.android.gms.common.internal.zzf.zzf zzf1 = (com.google.android.gms.common.internal.zzf.zzf)zzaAc.get(((Object) (zze2)));
		//  101  231:aload_0         
		//  102  232:getfield        #25  <Field Map zzaAc>
		//  103  235:aload           7
		//  104  237:invokeinterface #62  <Method Object Map.get(Object)>
		//  105  242:checkcast       #112 <Class com.google.android.gms.common.internal.zzf$zzf>
		//  106  245:astore          8
					if(zze2.zzuI() && i != 0)
		//* 107  247:aload           7
		//* 108  249:invokeinterface #58  <Method boolean com.google.android.gms.common.api.Api$zze.zzuI()>
		//* 109  254:ifeq            289
		//* 110  257:iload           4
		//* 111  259:ifeq            289
						zzaaj.zzd(zzaAa).zza(((zzaan.zza) (new zzaan.zza(this, ((zzaam) (zzaAa)), zzf1) {

							public void zzvA()
							{
								zzaAf.zzg(new ConnectionResult(16, ((android.app.PendingIntent) (null))));
							//    0    0:aload_0         
							//    1    1:getfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaAf>
							//    2    4:new             #24  <Class ConnectionResult>
							//    3    7:dup             
							//    4    8:bipush          16
							//    5   10:aconst_null     
							//    6   11:invokespecial   #27  <Method void ConnectionResult(int, android.app.PendingIntent)>
							//    7   14:invokeinterface #33  <Method void com.google.android.gms.common.internal.zzf$zzf.zzg(ConnectionResult)>
							//    8   19:return          
							}

							final com.google.android.gms.common.internal.zzf.zzf zzaAf;

			
			{
				zzaAf = zzf1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaAf>
				super(zzaam1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #21  <Method void zzaan$zza(zzaam)>
			//    6   10:return          
			}
						}
)));
		//  112  262:aload_0         
		//  113  263:getfield        #20  <Field zzaaj zzaAa>
		//  114  266:invokestatic    #89  <Method zzaan zzaaj.zzd(zzaaj)>
		//  115  269:new             #11  <Class zzaaj$zzb$2>
		//  116  272:dup             
		//  117  273:aload_0         
		//  118  274:aload_0         
		//  119  275:getfield        #20  <Field zzaaj zzaAa>
		//  120  278:aload           8
		//  121  280:invokespecial   #115 <Method void zzaaj$zzb$2(zzaaj$zzb, zzaam, com.google.android.gms.common.internal.zzf$zzf)>
		//  122  283:invokevirtual   #97  <Method void zzaan.zza(zzaan$zza)>
					else
		//* 123  286:goto            209
						zze2.zza(zzf1);
		//  124  289:aload           7
		//  125  291:aload           8
		//  126  293:invokeinterface #118 <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzf$zzf)>
				}
			}
			return;
_L2:
			flag2 = false;
			flag1 = flag;
			flag = flag2;
_L6:
			flag2 = flag1;
			flag1 = flag;
			flag = flag2;
			  goto _L5
		//* 127  298:goto            209
_L4:
			flag = flag1;
		//  128  301:iload_2         
		//  129  302:istore_1        
			flag1 = true;
		//  130  303:iconst_1        
		//  131  304:istore_2        
			  goto _L6
		//* 132  305:goto            162
			flag2 = flag;
		//  133  308:iload_1         
		//  134  309:istore_3        
			flag = false;
		//  135  310:iconst_0        
		//  136  311:istore_1        
			  goto _L7
		//* 137  312:goto            83
		}

		final zzaaj zzaAa;
		private final Map zzaAc;

		public zzb(Map map)
		{
			zzaAa = zzaaj.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field zzaaj zzaAa>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #23  <Method void zzaaj$zzf(zzaaj, zzaaj$1)>
			zzaAc = map;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #25  <Field Map zzaAc>
		//   10   16:return          
		}
	}

	private class zzc extends zzf
	{

		public void zzvA()
		{
			zzaaj.zzd(zzaAa).zzazd.zzaAs = com.google.android.gms.internal.zzaaj.zzg(zzaAa);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzaaj zzaAa>
		//    2    4:invokestatic    #31  <Method zzaan zzaaj.zzd(zzaaj)>
		//    3    7:getfield        #37  <Field zzaal zzaan.zzazd>
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field zzaaj zzaAa>
		//    6   14:invokestatic    #41  <Method Set com.google.android.gms.internal.zzaaj.zzg(zzaaj)>
		//    7   17:putfield        #47  <Field Set zzaal.zzaAs>
			for(Iterator iterator = zzaAg.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)iterator.next()).zza(zzaaj.zzh(zzaAa), zzaaj.zzd(zzaAa).zzazd.zzaAs));
		//    8   20:aload_0         
		//    9   21:getfield        #21  <Field ArrayList zzaAg>
		//   10   24:invokevirtual   #53  <Method Iterator ArrayList.iterator()>
		//   11   27:astore_1        
		//   12   28:aload_1         
		//   13   29:invokeinterface #59  <Method boolean Iterator.hasNext()>
		//   14   34:ifeq            74
		//   15   37:aload_1         
		//   16   38:invokeinterface #63  <Method Object Iterator.next()>
		//   17   43:checkcast       #65  <Class com.google.android.gms.common.api.Api$zze>
		//   18   46:aload_0         
		//   19   47:getfield        #16  <Field zzaaj zzaAa>
		//   20   50:invokestatic    #69  <Method zzr zzaaj.zzh(zzaaj)>
		//   21   53:aload_0         
		//   22   54:getfield        #16  <Field zzaaj zzaAa>
		//   23   57:invokestatic    #31  <Method zzaan zzaaj.zzd(zzaaj)>
		//   24   60:getfield        #37  <Field zzaal zzaan.zzazd>
		//   25   63:getfield        #47  <Field Set zzaal.zzaAs>
		//   26   66:invokeinterface #73  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
		//*  27   71:goto            28
		//   28   74:return          
		}

		final zzaaj zzaAa;
		private final ArrayList zzaAg;

		public zzc(ArrayList arraylist)
		{
			zzaAa = zzaaj.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field zzaaj zzaAa>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #19  <Method void zzaaj$zzf(zzaaj, zzaaj$1)>
			zzaAg = arraylist;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #21  <Field ArrayList zzaAg>
		//   10   16:return          
		}
	}

	private static class zzd extends zzaxr
	{

		public void zzb(zzayb zzayb1)
		{
			zzaaj zzaaj1 = (zzaaj)zzaAb.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference zzaAb>
		//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class zzaaj>
		//    4   10:astore_2        
			if(zzaaj1 == null)
		//*   5   11:aload_2         
		//*   6   12:ifnonnull       16
			{
				return;
		//    7   15:return          
			} else
			{
				zzaaj.zzd(zzaaj1).zza(((zzaan.zza) (new zzaan.zza(this, ((zzaam) (zzaaj1)), zzaaj1, zzayb1) {

					public void zzvA()
					{
						zzaaj.zza(zzaAh, zzaAi);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaaj zzaAh>
					//    2    4:aload_0         
					//    3    5:getfield        #22  <Field zzayb zzaAi>
					//    4    8:invokestatic    #32  <Method void zzaaj.zza(zzaaj, zzayb)>
					//    5   11:return          
					}

					final zzaaj zzaAh;
					final zzayb zzaAi;

			
			{
				zzaAh = zzaaj1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #20  <Field zzaaj zzaAh>
				zzaAi = zzayb1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field zzayb zzaAi>
				super(zzaam1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #25  <Method void zzaan$zza(zzaam)>
			//    9   16:return          
			}
				}
)));
		//    8   16:aload_2         
		//    9   17:invokestatic    #35  <Method zzaan zzaaj.zzd(zzaaj)>
		//   10   20:new             #9   <Class zzaaj$zzd$1>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:aload_2         
		//   14   26:aload_2         
		//   15   27:aload_1         
		//   16   28:invokespecial   #38  <Method void zzaaj$zzd$1(zzaaj$zzd, zzaam, zzaaj, zzayb)>
		//   17   31:invokevirtual   #44  <Method void zzaan.zza(zzaan$zza)>
				return;
		//   18   34:return          
			}
		}

		private final WeakReference zzaAb;

		zzd(zzaaj zzaaj1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void zzaxr()>
			zzaAb = new WeakReference(((Object) (zzaaj1)));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
		//    7   13:putfield        #24  <Field WeakReference zzaAb>
		//    8   16:return          
		}
	}

	private class zze
		implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
	{

		public void onConnected(Bundle bundle)
		{
			zzaaj.zzf(zzaAa).zza(((zzaxu) (new zzd(zzaAa))));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaaj zzaAa>
		//    2    4:invokestatic    #30  <Method zzaxn zzaaj.zzf(zzaaj)>
		//    3    7:new             #32  <Class zzaaj$zzd>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:getfield        #17  <Field zzaaj zzaAa>
		//    7   15:invokespecial   #33  <Method void zzaaj$zzd(zzaaj)>
		//    8   18:invokeinterface #39  <Method void zzaxn.zza(zzaxu)>
		//    9   23:return          
		}

		public void onConnectionFailed(ConnectionResult connectionresult)
		{
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaaj zzaAa>
		//    2    4:invokestatic    #46  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//    3    7:invokeinterface #51  <Method void Lock.lock()>
			if(!zzaaj.zzb(zzaAa, connectionresult)) goto _L2; else goto _L1
		//    4   12:aload_0         
		//    5   13:getfield        #17  <Field zzaaj zzaAa>
		//    6   16:aload_1         
		//    7   17:invokestatic    #55  <Method boolean zzaaj.zzb(zzaaj, ConnectionResult)>
		//    8   20:ifeq            50
_L1:
			zzaaj.zzi(zzaAa);
		//    9   23:aload_0         
		//   10   24:getfield        #17  <Field zzaaj zzaAa>
		//   11   27:invokestatic    #58  <Method void zzaaj.zzi(zzaaj)>
			zzaaj.zzj(zzaAa);
		//   12   30:aload_0         
		//   13   31:getfield        #17  <Field zzaaj zzaAa>
		//   14   34:invokestatic    #61  <Method void zzaaj.zzj(zzaaj)>
_L4:
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).unlock();
		//   15   37:aload_0         
		//   16   38:getfield        #17  <Field zzaaj zzaAa>
		//   17   41:invokestatic    #46  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   18   44:invokeinterface #64  <Method void Lock.unlock()>
			return;
		//   19   49:return          
_L2:
			zzaaj.zza(zzaAa, connectionresult);
		//   20   50:aload_0         
		//   21   51:getfield        #17  <Field zzaaj zzaAa>
		//   22   54:aload_1         
		//   23   55:invokestatic    #67  <Method void zzaaj.zza(zzaaj, ConnectionResult)>
			if(true) goto _L4; else goto _L3
		//   24   58:goto            37
_L3:
			connectionresult;
		//   25   61:astore_1        
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).unlock();
		//   26   62:aload_0         
		//   27   63:getfield        #17  <Field zzaaj zzaAa>
		//   28   66:invokestatic    #46  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   29   69:invokeinterface #64  <Method void Lock.unlock()>
			throw connectionresult;
		//   30   74:aload_1         
		//   31   75:athrow          
		}

		public void onConnectionSuspended(int i)
		{
		//    0    0:return          
		}

		final zzaaj zzaAa;

		private zze()
		{
			zzaAa = zzaaj.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field zzaaj zzaAa>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}

	private abstract class zzf
		implements Runnable
	{

		public void run()
		{
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaaj zzaAa>
		//    2    4:invokestatic    #30  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//    3    7:invokeinterface #35  <Method void Lock.lock()>
			boolean flag = Thread.interrupted();
		//    4   12:invokestatic    #41  <Method boolean Thread.interrupted()>
		//    5   15:istore_1        
			if(flag)
		//*   6   16:iload_1         
		//*   7   17:ifeq            33
			{
				com.google.android.gms.internal.zzaaj.zzc(zzaAa).unlock();
		//    8   20:aload_0         
		//    9   21:getfield        #15  <Field zzaaj zzaAa>
		//   10   24:invokestatic    #30  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   11   27:invokeinterface #44  <Method void Lock.unlock()>
				return;
		//   12   32:return          
			}
			zzvA();
		//   13   33:aload_0         
		//   14   34:invokevirtual   #47  <Method void zzvA()>
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).unlock();
		//   15   37:aload_0         
		//   16   38:getfield        #15  <Field zzaaj zzaAa>
		//   17   41:invokestatic    #30  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   18   44:invokeinterface #44  <Method void Lock.unlock()>
			return;
		//   19   49:return          
			Object obj;
			obj;
		//   20   50:astore_2        
			zzaaj.zzd(zzaAa).zza(((RuntimeException) (obj)));
		//   21   51:aload_0         
		//   22   52:getfield        #15  <Field zzaaj zzaAa>
		//   23   55:invokestatic    #51  <Method zzaan zzaaj.zzd(zzaaj)>
		//   24   58:aload_2         
		//   25   59:invokevirtual   #57  <Method void zzaan.zza(RuntimeException)>
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).unlock();
		//   26   62:aload_0         
		//   27   63:getfield        #15  <Field zzaaj zzaAa>
		//   28   66:invokestatic    #30  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   29   69:invokeinterface #44  <Method void Lock.unlock()>
			return;
		//   30   74:return          
			obj;
		//   31   75:astore_2        
			com.google.android.gms.internal.zzaaj.zzc(zzaAa).unlock();
		//   32   76:aload_0         
		//   33   77:getfield        #15  <Field zzaaj zzaAa>
		//   34   80:invokestatic    #30  <Method Lock com.google.android.gms.internal.zzaaj.zzc(zzaaj)>
		//   35   83:invokeinterface #44  <Method void Lock.unlock()>
			throw obj;
		//   36   88:aload_2         
		//   37   89:athrow          
		}

		protected abstract void zzvA();

		final zzaaj zzaAa;

		private zzf()
		{
			zzaAa = zzaaj.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field zzaaj zzaAa>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public zzaaj(zzaan zzaan1, zzg zzg1, Map map, com.google.android.gms.common.zzc zzc1, com.google.android.gms.common.api.Api.zza zza1, Lock lock, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		zzazO = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #79  <Field int zzazO>
	//    5    9:aload_0         
	//    6   10:new             #81  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #82  <Method void Bundle()>
	//    9   17:putfield        #84  <Field Bundle zzazQ>
	//   10   20:aload_0         
	//   11   21:new             #86  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #87  <Method void HashSet()>
	//   14   28:putfield        #89  <Field Set zzazR>
		zzazZ = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #91  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #92  <Method void ArrayList()>
	//   19   39:putfield        #94  <Field ArrayList zzazZ>
		zzazK = zzaan1;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #96  <Field zzaan zzazK>
		zzazs = zzg1;
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:putfield        #98  <Field zzg zzazs>
		zzazu = map;
	//   26   52:aload_0         
	//   27   53:aload_3         
	//   28   54:putfield        #100 <Field Map zzazu>
		zzazw = zzc1;
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:putfield        #102 <Field zzc zzazw>
		zzaxY = zza1;
	//   32   63:aload_0         
	//   33   64:aload           5
	//   34   66:putfield        #104 <Field com.google.android.gms.common.api.Api$zza zzaxY>
		zzazn = lock;
	//   35   69:aload_0         
	//   36   70:aload           6
	//   37   72:putfield        #106 <Field Lock zzazn>
		mContext = context;
	//   38   75:aload_0         
	//   39   76:aload           7
	//   40   78:putfield        #108 <Field Context mContext>
	//   41   81:return          
	}

	static Context zza(zzaaj zzaaj1)
	{
		return zzaaj1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Context mContext>
	//    2    4:areturn         
	}

	static void zza(zzaaj zzaaj1, ConnectionResult connectionresult)
	{
		zzaaj1.zzf(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method void zzf(ConnectionResult)>
	//    3    5:return          
	}

	static void zza(zzaaj zzaaj1, ConnectionResult connectionresult, Api api, int i)
	{
		zzaaj1.zzb(connectionresult, api, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #120 <Method void zzb(ConnectionResult, Api, int)>
	//    5    7:return          
	}

	static void zza(zzaaj zzaaj1, zzayb zzayb1)
	{
		zzaaj1.zza(zzayb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #124 <Method void zza(zzayb)>
	//    3    5:return          
	}

	private void zza(zzayb zzayb1)
	{
		if(!zzcv(0))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #128 <Method boolean zzcv(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		Object obj = ((Object) (zzayb1.zzxA()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #134 <Method ConnectionResult zzayb.zzxA()>
	//    7   13:astore_2        
		if(((ConnectionResult) (obj)).isSuccess())
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #140 <Method boolean ConnectionResult.isSuccess()>
	//*  10   18:ifeq            125
		{
			obj = ((Object) (zzayb1.zzOp()));
	//   11   21:aload_1         
	//   12   22:invokevirtual   #144 <Method zzaf zzayb.zzOp()>
	//   13   25:astore_2        
			zzayb1 = ((zzayb) (((zzaf) (obj)).zzxA()));
	//   14   26:aload_2         
	//   15   27:invokevirtual   #147 <Method ConnectionResult zzaf.zzxA()>
	//   16   30:astore_1        
			if(!((ConnectionResult) (zzayb1)).isSuccess())
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #140 <Method boolean ConnectionResult.isSuccess()>
	//*  19   35:ifne            91
			{
				obj = ((Object) (String.valueOf(((Object) (zzayb1)))));
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
				zzf(((ConnectionResult) (zzayb1)));
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:invokespecial   #116 <Method void zzf(ConnectionResult)>
				return;
	//   45   90:return          
			} else
			{
				zzazV = true;
	//   46   91:aload_0         
	//   47   92:iconst_1        
	//   48   93:putfield        #185 <Field boolean zzazV>
				zzazW = ((zzaf) (obj)).zzxz();
	//   49   96:aload_0         
	//   50   97:aload_2         
	//   51   98:invokevirtual   #189 <Method zzr zzaf.zzxz()>
	//   52  101:putfield        #191 <Field zzr zzazW>
				zzazX = ((zzaf) (obj)).zzxB();
	//   53  104:aload_0         
	//   54  105:aload_2         
	//   55  106:invokevirtual   #194 <Method boolean zzaf.zzxB()>
	//   56  109:putfield        #196 <Field boolean zzazX>
				zzazY = ((zzaf) (obj)).zzxC();
	//   57  112:aload_0         
	//   58  113:aload_2         
	//   59  114:invokevirtual   #199 <Method boolean zzaf.zzxC()>
	//   60  117:putfield        #201 <Field boolean zzazY>
				zzvC();
	//   61  120:aload_0         
	//   62  121:invokespecial   #204 <Method void zzvC()>
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
			zzvF();
	//   68  133:aload_0         
	//   69  134:invokespecial   #210 <Method void zzvF()>
			zzvC();
	//   70  137:aload_0         
	//   71  138:invokespecial   #204 <Method void zzvC()>
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

	private boolean zza(int i, int j, ConnectionResult connectionresult)
	{
		while(j == 1 && !zzd(connectionresult) || zzazA != null && i >= zzazN) 
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          15
	//*   3    5:aload_0         
	//*   4    6:aload_3         
	//*   5    7:invokespecial   #213 <Method boolean zzd(ConnectionResult)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	//    9   15:aload_0         
	//   10   16:getfield        #215 <Field ConnectionResult zzazA>
	//   11   19:ifnull          30
	//   12   22:iload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #217 <Field int zzazN>
	//   15   27:icmpge          13
		return true;
	//   16   30:iconst_1        
	//   17   31:ireturn         
	}

	static boolean zza(zzaaj zzaaj1, int i)
	{
		return zzaaj1.zzcv(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method boolean zzcv(int)>
	//    3    5:ireturn         
	}

	private void zzaq(boolean flag)
	{
		if(zzazS != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field zzaxn zzazS>
	//*   2    4:ifnull          46
		{
			if(zzazS.isConnected() && flag)
	//*   3    7:aload_0         
	//*   4    8:getfield        #222 <Field zzaxn zzazS>
	//*   5   11:invokeinterface #227 <Method boolean zzaxn.isConnected()>
	//*   6   16:ifeq            32
	//*   7   19:iload_1         
	//*   8   20:ifeq            32
				zzazS.zzOe();
	//    9   23:aload_0         
	//   10   24:getfield        #222 <Field zzaxn zzazS>
	//   11   27:invokeinterface #230 <Method void zzaxn.zzOe()>
			zzazS.disconnect();
	//   12   32:aload_0         
	//   13   33:getfield        #222 <Field zzaxn zzazS>
	//   14   36:invokeinterface #233 <Method void zzaxn.disconnect()>
			zzazW = null;
	//   15   41:aload_0         
	//   16   42:aconst_null     
	//   17   43:putfield        #191 <Field zzr zzazW>
		}
	//   18   46:return          
	}

	static com.google.android.gms.common.zzc zzb(zzaaj zzaaj1)
	{
		return zzaaj1.zzazw;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zzc zzazw>
	//    2    4:areturn         
	}

	private void zzb(ConnectionResult connectionresult, Api api, int i)
	{
		if(i != 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpeq          36
		{
			int j = api.zzuF().getPriority();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #240 <Method com.google.android.gms.common.api.Api$zzd Api.zzuF()>
	//    5    9:invokevirtual   #245 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//    6   12:istore          4
			if(zza(j, i, connectionresult))
	//*   7   14:aload_0         
	//*   8   15:iload           4
	//*   9   17:iload_3         
	//*  10   18:aload_1         
	//*  11   19:invokespecial   #247 <Method boolean zza(int, int, ConnectionResult)>
	//*  12   22:ifeq            36
			{
				zzazA = connectionresult;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #215 <Field ConnectionResult zzazA>
				zzazN = j;
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:putfield        #217 <Field int zzazN>
			}
		}
		zzazK.zzaAG.put(((Object) (api.zzuH())), ((Object) (connectionresult)));
	//   19   36:aload_0         
	//   20   37:getfield        #96  <Field zzaan zzazK>
	//   21   40:getfield        #252 <Field Map zzaan.zzaAG>
	//   22   43:aload_2         
	//   23   44:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//   24   47:aload_1         
	//   25   48:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   26   53:pop             
	//   27   54:return          
	}

	static boolean zzb(zzaaj zzaaj1, ConnectionResult connectionresult)
	{
		return zzaaj1.zze(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method boolean zze(ConnectionResult)>
	//    3    5:ireturn         
	}

	static Lock zzc(zzaaj zzaaj1)
	{
		return zzaaj1.zzazn;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Lock zzazn>
	//    2    4:areturn         
	}

	private boolean zzcv(int i)
	{
		if(zzazO != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field int zzazO>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          199
		{
			Log.w("GoogleApiClientConnecting", zzazK.zzazd.zzvN());
	//    4    8:ldc1            #155 <String "GoogleApiClientConnecting">
	//    5   10:aload_0         
	//    6   11:getfield        #96  <Field zzaan zzazK>
	//    7   14:getfield        #269 <Field zzaal zzaan.zzazd>
	//    8   17:invokevirtual   #274 <Method String zzaal.zzvN()>
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
			int j = zzazP;
	//   30   65:aload_0         
	//   31   66:getfield        #282 <Field int zzazP>
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
			s = String.valueOf(((Object) (zzcw(zzazO))));
	//   45   98:aload_0         
	//   46   99:aload_0         
	//   47  100:getfield        #79  <Field int zzazO>
	//   48  103:invokespecial   #291 <Method String zzcw(int)>
	//   49  106:invokestatic    #153 <Method String String.valueOf(Object)>
	//   50  109:astore_3        
			String s1 = String.valueOf(((Object) (zzcw(i))));
	//   51  110:aload_0         
	//   52  111:iload_1         
	//   53  112:invokespecial   #291 <Method String zzcw(int)>
	//   54  115:invokestatic    #153 <Method String String.valueOf(Object)>
	//   55  118:astore          4
			Log.wtf("GoogleApiClientConnecting", (new StringBuilder(String.valueOf(((Object) (s))).length() + 70 + String.valueOf(((Object) (s1))).length())).append("GoogleApiClient connecting is in step ").append(s).append(" but received callback for step ").append(s1).toString(), ((Throwable) (new Exception())));
	//   56  120:ldc1            #155 <String "GoogleApiClientConnecting">
	//   57  122:new             #157 <Class StringBuilder>
	//   58  125:dup             
	//   59  126:aload_3         
	//   60  127:invokestatic    #153 <Method String String.valueOf(Object)>
	//   61  130:invokevirtual   #161 <Method int String.length()>
	//   62  133:bipush          70
	//   63  135:iadd            
	//   64  136:aload           4
	//   65  138:invokestatic    #153 <Method String String.valueOf(Object)>
	//   66  141:invokevirtual   #161 <Method int String.length()>
	//   67  144:iadd            
	//   68  145:invokespecial   #164 <Method void StringBuilder(int)>
	//   69  148:ldc2            #293 <String "GoogleApiClient connecting is in step ">
	//   70  151:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   71  154:aload_3         
	//   72  155:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   73  158:ldc2            #295 <String " but received callback for step ">
	//   74  161:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   75  164:aload           4
	//   76  166:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   77  169:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   78  172:new             #176 <Class Exception>
	//   79  175:dup             
	//   80  176:invokespecial   #177 <Method void Exception()>
	//   81  179:invokestatic    #183 <Method int Log.wtf(String, String, Throwable)>
	//   82  182:pop             
			zzf(new ConnectionResult(8, ((android.app.PendingIntent) (null))));
	//   83  183:aload_0         
	//   84  184:new             #136 <Class ConnectionResult>
	//   85  187:dup             
	//   86  188:bipush          8
	//   87  190:aconst_null     
	//   88  191:invokespecial   #298 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   89  194:invokespecial   #116 <Method void zzf(ConnectionResult)>
			return false;
	//   90  197:iconst_0        
	//   91  198:ireturn         
		} else
		{
			return true;
	//   92  199:iconst_1        
	//   93  200:ireturn         
		}
	}

	private String zzcw(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 28
	//	               1 32
		default:
			return "UNKNOWN";
	//    2   24:ldc2            #300 <String "UNKNOWN">
	//    3   27:areturn         

		case 0: // '\0'
			return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
	//    4   28:ldc2            #302 <String "STEP_SERVICE_BINDINGS_AND_SIGN_IN">
	//    5   31:areturn         

		case 1: // '\001'
			return "STEP_GETTING_REMOTE_SERVICE";
	//    6   32:ldc2            #304 <String "STEP_GETTING_REMOTE_SERVICE">
	//    7   35:areturn         
		}
	}

	static zzaan zzd(zzaaj zzaaj1)
	{
		return zzaaj1.zzazK;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaan zzazK>
	//    2    4:areturn         
	}

	private boolean zzd(ConnectionResult connectionresult)
	{
		while(connectionresult.hasResolution() || zzazw.zzcr(connectionresult.getErrorCode()) != null) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #308 <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field zzc zzazw>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #311 <Method int ConnectionResult.getErrorCode()>
	//    9   17:invokevirtual   #317 <Method android.content.Intent zzc.zzcr(int)>
	//   10   20:ifnonnull       7
		return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private boolean zze(ConnectionResult connectionresult)
	{
		return zzazT == 2 || zzazT == 1 && !connectionresult.hasResolution();
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field int zzazT>
	//    2    4:iconst_2        
	//    3    5:icmpeq          23
	//    4    8:aload_0         
	//    5    9:getfield        #319 <Field int zzazT>
	//    6   12:iconst_1        
	//    7   13:icmpne          25
	//    8   16:aload_1         
	//    9   17:invokevirtual   #308 <Method boolean ConnectionResult.hasResolution()>
	//   10   20:ifne            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	static boolean zze(zzaaj zzaaj1)
	{
		return zzaaj1.zzazU;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field boolean zzazU>
	//    2    4:ireturn         
	}

	static zzaxn zzf(zzaaj zzaaj1)
	{
		return zzaaj1.zzazS;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field zzaxn zzazS>
	//    2    4:areturn         
	}

	private void zzf(ConnectionResult connectionresult)
	{
		zzvG();
	//    0    0:aload_0         
	//    1    1:invokespecial   #326 <Method void zzvG()>
		boolean flag;
		if(!connectionresult.hasResolution())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #308 <Method boolean ConnectionResult.hasResolution()>
	//*   4    8:ifne            40
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:iload_2         
	//*   9   15:invokespecial   #328 <Method void zzaq(boolean)>
	//*  10   18:aload_0         
	//*  11   19:getfield        #96  <Field zzaan zzazK>
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #331 <Method void zzaan.zzh(ConnectionResult)>
	//*  14   26:aload_0         
	//*  15   27:getfield        #96  <Field zzaan zzazK>
	//*  16   30:getfield        #335 <Field zzaau$zza zzaan.zzaAK>
	//*  17   33:aload_1         
	//*  18   34:invokeinterface #339 <Method void com.google.android.gms.internal.zzaau$zza.zzc(ConnectionResult)>
	//*  19   39:return          
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore_2        
		zzaq(flag);
		zzazK.zzh(connectionresult);
		zzazK.zzaAK.zzc(connectionresult);
	//*  22   42:goto            13
	}

	static Set zzg(zzaaj zzaaj1)
	{
		return zzaaj1.zzvH();
	//    0    0:aload_0         
	//    1    1:invokespecial   #345 <Method Set zzvH()>
	//    2    4:areturn         
	}

	static zzr zzh(zzaaj zzaaj1)
	{
		return zzaaj1.zzazW;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field zzr zzazW>
	//    2    4:areturn         
	}

	static void zzi(zzaaj zzaaj1)
	{
		zzaaj1.zzvF();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method void zzvF()>
	//    2    4:return          
	}

	static void zzj(zzaaj zzaaj1)
	{
		zzaaj1.zzvC();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void zzvC()>
	//    2    4:return          
	}

	static boolean zzk(zzaaj zzaaj1)
	{
		return zzaaj1.zzvB();
	//    0    0:aload_0         
	//    1    1:invokespecial   #353 <Method boolean zzvB()>
	//    2    4:ireturn         
	}

	private boolean zzvB()
	{
		zzazP = zzazP - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #282 <Field int zzazP>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #282 <Field int zzazP>
		if(zzazP > 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #282 <Field int zzazP>
	//*   8   14:ifle            19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(zzazP < 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #282 <Field int zzazP>
	//*  13   23:ifge            74
		{
			Log.w("GoogleApiClientConnecting", zzazK.zzazd.zzvN());
	//   14   26:ldc1            #155 <String "GoogleApiClientConnecting">
	//   15   28:aload_0         
	//   16   29:getfield        #96  <Field zzaan zzazK>
	//   17   32:getfield        #269 <Field zzaal zzaan.zzazd>
	//   18   35:invokevirtual   #274 <Method String zzaal.zzvN()>
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
		if(zzazA != null)
	//*  37   74:aload_0         
	//*  38   75:getfield        #215 <Field ConnectionResult zzazA>
	//*  39   78:ifnull          102
		{
			zzazK.zzaAJ = zzazN;
	//   40   81:aload_0         
	//   41   82:getfield        #96  <Field zzaan zzazK>
	//   42   85:aload_0         
	//   43   86:getfield        #217 <Field int zzazN>
	//   44   89:putfield        #358 <Field int zzaan.zzaAJ>
			zzf(zzazA);
	//   45   92:aload_0         
	//   46   93:aload_0         
	//   47   94:getfield        #215 <Field ConnectionResult zzazA>
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

	private void zzvC()
	{
		while(zzazP != 0 || zzazU && !zzazV) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #282 <Field int zzazP>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:aload_0         
	//    5    9:getfield        #322 <Field boolean zzazU>
	//    6   12:ifeq            22
	//    7   15:aload_0         
	//    8   16:getfield        #185 <Field boolean zzazV>
	//    9   19:ifeq            7
		zzvD();
	//   10   22:aload_0         
	//   11   23:invokespecial   #361 <Method void zzvD()>
	//   12   26:return          
	}

	private void zzvD()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #91  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void ArrayList()>
	//    3    7:astore_1        
		zzazO = 1;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #79  <Field int zzazO>
		zzazP = zzazK.zzaAr.size();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #96  <Field zzaan zzazK>
	//   10   18:getfield        #364 <Field Map zzaan.zzaAr>
	//   11   21:invokeinterface #367 <Method int Map.size()>
	//   12   26:putfield        #282 <Field int zzazP>
		Iterator iterator = zzazK.zzaAr.keySet().iterator();
	//   13   29:aload_0         
	//   14   30:getfield        #96  <Field zzaan zzazK>
	//   15   33:getfield        #364 <Field Map zzaan.zzaAr>
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
			if(zzazK.zzaAG.containsKey(((Object) (zzc1))))
	//*  26   66:aload_0         
	//*  27   67:getfield        #96  <Field zzaan zzazK>
	//*  28   70:getfield        #252 <Field Map zzaan.zzaAG>
	//*  29   73:aload_3         
	//*  30   74:invokeinterface #391 <Method boolean Map.containsKey(Object)>
	//*  31   79:ifeq            96
			{
				if(zzvB())
	//*  32   82:aload_0         
	//*  33   83:invokespecial   #353 <Method boolean zzvB()>
	//*  34   86:ifeq            47
					zzvE();
	//   35   89:aload_0         
	//   36   90:invokespecial   #394 <Method void zzvE()>
			} else
	//*  37   93:goto            47
			{
				arraylist.add(((Object) ((com.google.android.gms.common.api.Api.zze)zzazK.zzaAr.get(((Object) (zzc1))))));
	//   38   96:aload_1         
	//   39   97:aload_0         
	//   40   98:getfield        #96  <Field zzaan zzazK>
	//   41  101:getfield        #364 <Field Map zzaan.zzaAr>
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
			zzazZ.add(((Object) (zzaao.zzvR().submit(((Runnable) (new zzc(arraylist)))))));
	//   51  127:aload_0         
	//   52  128:getfield        #94  <Field ArrayList zzazZ>
	//   53  131:invokestatic    #412 <Method ExecutorService zzaao.zzvR()>
	//   54  134:new             #20  <Class zzaaj$zzc>
	//   55  137:dup             
	//   56  138:aload_0         
	//   57  139:aload_1         
	//   58  140:invokespecial   #415 <Method void zzaaj$zzc(zzaaj, ArrayList)>
	//   59  143:invokeinterface #421 <Method Future ExecutorService.submit(Runnable)>
	//   60  148:invokevirtual   #403 <Method boolean ArrayList.add(Object)>
	//   61  151:pop             
	//   62  152:return          
	}

	private void zzvE()
	{
		zzazK.zzvP();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaan zzazK>
	//    2    4:invokevirtual   #424 <Method void zzaan.zzvP()>
		zzaao.zzvR().execute(new Runnable() {

			public void run()
			{
				zzaaj.zzb(zzaAa).zzan(zzaaj.zza(zzaAa));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field zzaaj zzaAa>
			//    2    4:invokestatic    #25  <Method zzc zzaaj.zzb(zzaaj)>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field zzaaj zzaAa>
			//    5   11:invokestatic    #29  <Method Context zzaaj.zza(zzaaj)>
			//    6   14:invokevirtual   #35  <Method void zzc.zzan(Context)>
			//    7   17:return          
			}

			final zzaaj zzaAa;

			
			{
				zzaAa = zzaaj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field zzaaj zzaAa>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    7:invokestatic    #412 <Method ExecutorService zzaao.zzvR()>
	//    4   10:new             #8   <Class zzaaj$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #426 <Method void zzaaj$1(zzaaj)>
	//    8   18:invokeinterface #430 <Method void ExecutorService.execute(Runnable)>
		if(zzazS != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #222 <Field zzaxn zzazS>
	//*  11   27:ifnull          59
		{
			if(zzazX)
	//*  12   30:aload_0         
	//*  13   31:getfield        #196 <Field boolean zzazX>
	//*  14   34:ifeq            54
				zzazS.zza(zzazW, zzazY);
	//   15   37:aload_0         
	//   16   38:getfield        #222 <Field zzaxn zzazS>
	//   17   41:aload_0         
	//   18   42:getfield        #191 <Field zzr zzazW>
	//   19   45:aload_0         
	//   20   46:getfield        #201 <Field boolean zzazY>
	//   21   49:invokeinterface #433 <Method void zzaxn.zza(zzr, boolean)>
			zzaq(false);
	//   22   54:aload_0         
	//   23   55:iconst_0        
	//   24   56:invokespecial   #328 <Method void zzaq(boolean)>
		}
		com.google.android.gms.common.api.Api.zzc zzc1;
		for(Iterator iterator = zzazK.zzaAG.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)zzazK.zzaAr.get(((Object) (zzc1)))).disconnect())
	//*  25   59:aload_0         
	//*  26   60:getfield        #96  <Field zzaan zzazK>
	//*  27   63:getfield        #252 <Field Map zzaan.zzaAG>
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
	//   39   97:getfield        #96  <Field zzaan zzazK>
	//   40  100:getfield        #364 <Field Map zzaan.zzaAr>
	//   41  103:aload_2         
	//   42  104:invokeinterface #398 <Method Object Map.get(Object)>
	//   43  109:checkcast       #400 <Class com.google.android.gms.common.api.Api$zze>
	//   44  112:invokeinterface #434 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
	//*  45  117:goto            77
		Bundle bundle;
		if(zzazQ.isEmpty())
	//*  46  120:aload_0         
	//*  47  121:getfield        #84  <Field Bundle zzazQ>
	//*  48  124:invokevirtual   #435 <Method boolean Bundle.isEmpty()>
	//*  49  127:ifeq            146
			bundle = null;
	//   50  130:aconst_null     
	//   51  131:astore_1        
		else
	//*  52  132:aload_0         
	//*  53  133:getfield        #96  <Field zzaan zzazK>
	//*  54  136:getfield        #335 <Field zzaau$zza zzaan.zzaAK>
	//*  55  139:aload_1         
	//*  56  140:invokeinterface #439 <Method void zzaau$zza.zzo(Bundle)>
	//*  57  145:return          
			bundle = zzazQ;
	//   58  146:aload_0         
	//   59  147:getfield        #84  <Field Bundle zzazQ>
	//   60  150:astore_1        
		zzazK.zzaAK.zzo(bundle);
	//*  61  151:goto            132
	}

	private void zzvF()
	{
		zzazU = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #322 <Field boolean zzazU>
		zzazK.zzazd.zzaAs = Collections.emptySet();
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field zzaan zzazK>
	//    5    9:getfield        #269 <Field zzaal zzaan.zzazd>
	//    6   12:invokestatic    #444 <Method Set Collections.emptySet()>
	//    7   15:putfield        #447 <Field Set zzaal.zzaAs>
		Iterator iterator = zzazR.iterator();
	//    8   18:aload_0         
	//    9   19:getfield        #89  <Field Set zzazR>
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
			if(!zzazK.zzaAG.containsKey(((Object) (zzc1))))
	//*  19   47:aload_0         
	//*  20   48:getfield        #96  <Field zzaan zzazK>
	//*  21   51:getfield        #252 <Field Map zzaan.zzaAG>
	//*  22   54:aload_2         
	//*  23   55:invokeinterface #391 <Method boolean Map.containsKey(Object)>
	//*  24   60:ifne            28
				zzazK.zzaAG.put(((Object) (zzc1)), ((Object) (new ConnectionResult(17, ((android.app.PendingIntent) (null))))));
	//   25   63:aload_0         
	//   26   64:getfield        #96  <Field zzaan zzazK>
	//   27   67:getfield        #252 <Field Map zzaan.zzaAG>
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

	private void zzvG()
	{
		for(Iterator iterator = zzazZ.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ArrayList zzazZ>
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
		zzazZ.clear();
	//   14   36:aload_0         
	//   15   37:getfield        #94  <Field ArrayList zzazZ>
	//   16   40:invokevirtual   #457 <Method void ArrayList.clear()>
	//   17   43:return          
	}

	private Set zzvH()
	{
		if(zzazs == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field zzg zzazs>
	//*   2    4:ifnonnull       11
			return Collections.emptySet();
	//    3    7:invokestatic    #444 <Method Set Collections.emptySet()>
	//    4   10:areturn         
		HashSet hashset = new HashSet(((java.util.Collection) (zzazs.zzxe())));
	//    5   11:new             #86  <Class HashSet>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #98  <Field zzg zzazs>
	//    9   19:invokevirtual   #462 <Method Set zzg.zzxe()>
	//   10   22:invokespecial   #465 <Method void HashSet(java.util.Collection)>
	//   11   25:astore_1        
		Map map = zzazs.zzxg();
	//   12   26:aload_0         
	//   13   27:getfield        #98  <Field zzg zzazs>
	//   14   30:invokevirtual   #469 <Method Map zzg.zzxg()>
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
			if(!zzazK.zzaAG.containsKey(((Object) (api.zzuH()))))
	//*  27   66:aload_0         
	//*  28   67:getfield        #96  <Field zzaan zzazK>
	//*  29   70:getfield        #252 <Field Map zzaan.zzaAG>
	//*  30   73:aload           4
	//*  31   75:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//*  32   78:invokeinterface #391 <Method boolean Map.containsKey(Object)>
	//*  33   83:ifne            46
				((Set) (hashset)).addAll(((java.util.Collection) (((com.google.android.gms.common.internal.zzg.zza)map.get(((Object) (api)))).zzajm)));
	//   34   86:aload_1         
	//   35   87:aload_2         
	//   36   88:aload           4
	//   37   90:invokeinterface #398 <Method Object Map.get(Object)>
	//   38   95:checkcast       #471 <Class com.google.android.gms.common.internal.zzg$zza>
	//   39   98:getfield        #474 <Field Set com.google.android.gms.common.internal.zzg$zza.zzajm>
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
		zzazK.zzaAG.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaan zzazK>
	//    2    4:getfield        #252 <Field Map zzaan.zzaAG>
	//    3    7:invokeinterface #481 <Method void Map.clear()>
		zzazU = false;
	//    4   12:aload_0         
	//    5   13:iconst_0        
	//    6   14:putfield        #322 <Field boolean zzazU>
		zzazA = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #215 <Field ConnectionResult zzazA>
		zzazO = 0;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #79  <Field int zzazO>
		zzazT = 2;
	//   13   27:aload_0         
	//   14   28:iconst_2        
	//   15   29:putfield        #319 <Field int zzazT>
		zzazV = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #185 <Field boolean zzazV>
		zzazX = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #196 <Field boolean zzazX>
		HashMap hashmap = new HashMap();
	//   22   42:new             #483 <Class HashMap>
	//   23   45:dup             
	//   24   46:invokespecial   #484 <Method void HashMap()>
	//   25   49:astore          4
		Iterator iterator = zzazu.keySet().iterator();
	//   26   51:aload_0         
	//   27   52:getfield        #100 <Field Map zzazu>
	//   28   55:invokeinterface #370 <Method Set Map.keySet()>
	//   29   60:invokeinterface #376 <Method Iterator Set.iterator()>
	//   30   65:astore          5
		boolean flag = false;
	//   31   67:iconst_0        
	//   32   68:istore_1        
		while(iterator.hasNext()) 
	//*  33   69:aload           5
	//*  34   71:invokeinterface #381 <Method boolean Iterator.hasNext()>
	//*  35   76:ifeq            225
		{
			Api api = (Api)iterator.next();
	//   36   79:aload           5
	//   37   81:invokeinterface #385 <Method Object Iterator.next()>
	//   38   86:checkcast       #236 <Class Api>
	//   39   89:astore          6
			com.google.android.gms.common.api.Api.zze zze2 = (com.google.android.gms.common.api.Api.zze)zzazK.zzaAr.get(((Object) (api.zzuH())));
	//   40   91:aload_0         
	//   41   92:getfield        #96  <Field zzaan zzazK>
	//   42   95:getfield        #364 <Field Map zzaan.zzaAr>
	//   43   98:aload           6
	//   44  100:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//   45  103:invokeinterface #398 <Method Object Map.get(Object)>
	//   46  108:checkcast       #400 <Class com.google.android.gms.common.api.Api$zze>
	//   47  111:astore          7
			int i = ((Integer)zzazu.get(((Object) (api)))).intValue();
	//   48  113:aload_0         
	//   49  114:getfield        #100 <Field Map zzazu>
	//   50  117:aload           6
	//   51  119:invokeinterface #398 <Method Object Map.get(Object)>
	//   52  124:checkcast       #486 <Class Integer>
	//   53  127:invokevirtual   #489 <Method int Integer.intValue()>
	//   54  130:istore_3        
			boolean flag1;
			if(api.zzuF().getPriority() == 1)
	//*  55  131:aload           6
	//*  56  133:invokevirtual   #240 <Method com.google.android.gms.common.api.Api$zzd Api.zzuF()>
	//*  57  136:invokevirtual   #245 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//*  58  139:iconst_1        
	//*  59  140:icmpne          220
				flag1 = true;
	//   60  143:iconst_1        
	//   61  144:istore_2        
			else
	//*  62  145:aload           7
	//*  63  147:invokeinterface #492 <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
	//*  64  152:ifeq            192
	//*  65  155:aload_0         
	//*  66  156:iconst_1        
	//*  67  157:putfield        #322 <Field boolean zzazU>
	//*  68  160:iload_3         
	//*  69  161:aload_0         
	//*  70  162:getfield        #319 <Field int zzazT>
	//*  71  165:icmpge          173
	//*  72  168:aload_0         
	//*  73  169:iload_3         
	//*  74  170:putfield        #319 <Field int zzazT>
	//*  75  173:iload_3         
	//*  76  174:ifeq            192
	//*  77  177:aload_0         
	//*  78  178:getfield        #89  <Field Set zzazR>
	//*  79  181:aload           6
	//*  80  183:invokevirtual   #256 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//*  81  186:invokeinterface #493 <Method boolean Set.add(Object)>
	//*  82  191:pop             
	//*  83  192:aload           4
	//*  84  194:aload           7
	//*  85  196:new             #10  <Class zzaaj$zza>
	//*  86  199:dup             
	//*  87  200:aload_0         
	//*  88  201:aload           6
	//*  89  203:iload_3         
	//*  90  204:invokespecial   #496 <Method void zzaaj$zza(zzaaj, Api, int)>
	//*  91  207:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//*  92  212:pop             
	//*  93  213:iload_2         
	//*  94  214:iload_1         
	//*  95  215:ior             
	//*  96  216:istore_1        
	//*  97  217:goto            69
				flag1 = false;
	//   98  220:iconst_0        
	//   99  221:istore_2        
			if(zze2.zzqD())
			{
				zzazU = true;
				if(i < zzazT)
					zzazT = i;
				if(i != 0)
					zzazR.add(((Object) (api.zzuH())));
			}
			((Map) (hashmap)).put(((Object) (zze2)), ((Object) (new zza(this, api, i))));
			flag = flag1 | flag;
		}
	//* 100  222:goto            145
		if(flag)
	//* 101  225:iload_1         
	//* 102  226:ifeq            234
			zzazU = false;
	//  103  229:aload_0         
	//  104  230:iconst_0        
	//  105  231:putfield        #322 <Field boolean zzazU>
		if(zzazU)
	//* 106  234:aload_0         
	//* 107  235:getfield        #322 <Field boolean zzazU>
	//* 108  238:ifeq            315
		{
			zzazs.zzc(Integer.valueOf(zzazK.zzazd.getSessionId()));
	//  109  241:aload_0         
	//  110  242:getfield        #98  <Field zzg zzazs>
	//  111  245:aload_0         
	//  112  246:getfield        #96  <Field zzaan zzazK>
	//  113  249:getfield        #269 <Field zzaal zzaan.zzazd>
	//  114  252:invokevirtual   #499 <Method int zzaal.getSessionId()>
	//  115  255:invokestatic    #502 <Method Integer Integer.valueOf(int)>
	//  116  258:invokevirtual   #505 <Method void zzg.zzc(Integer)>
			zze zze1 = new zze();
	//  117  261:new             #28  <Class zzaaj$zze>
	//  118  264:dup             
	//  119  265:aload_0         
	//  120  266:aconst_null     
	//  121  267:invokespecial   #508 <Method void zzaaj$zze(zzaaj, zzaaj$1)>
	//  122  270:astore          5
			zzazS = (zzaxn)zzaxY.zza(mContext, zzazK.zzazd.getLooper(), zzazs, ((Object) (zzazs.zzxk())), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (zze1)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zze1)));
	//  123  272:aload_0         
	//  124  273:aload_0         
	//  125  274:getfield        #104 <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//  126  277:aload_0         
	//  127  278:getfield        #108 <Field Context mContext>
	//  128  281:aload_0         
	//  129  282:getfield        #96  <Field zzaan zzazK>
	//  130  285:getfield        #269 <Field zzaal zzaan.zzazd>
	//  131  288:invokevirtual   #512 <Method Looper zzaal.getLooper()>
	//  132  291:aload_0         
	//  133  292:getfield        #98  <Field zzg zzazs>
	//  134  295:aload_0         
	//  135  296:getfield        #98  <Field zzg zzazs>
	//  136  299:invokevirtual   #516 <Method zzaxo zzg.zzxk()>
	//  137  302:aload           5
	//  138  304:aload           5
	//  139  306:invokevirtual   #521 <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.common.api.Api$zza.zza(Context, Looper, zzg, Object, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//  140  309:checkcast       #224 <Class zzaxn>
	//  141  312:putfield        #222 <Field zzaxn zzazS>
		}
		zzazP = zzazK.zzaAr.size();
	//  142  315:aload_0         
	//  143  316:aload_0         
	//  144  317:getfield        #96  <Field zzaan zzazK>
	//  145  320:getfield        #364 <Field Map zzaan.zzaAr>
	//  146  323:invokeinterface #367 <Method int Map.size()>
	//  147  328:putfield        #282 <Field int zzazP>
		zzazZ.add(((Object) (zzaao.zzvR().submit(((Runnable) (new zzb(((Map) (hashmap)))))))));
	//  148  331:aload_0         
	//  149  332:getfield        #94  <Field ArrayList zzazZ>
	//  150  335:invokestatic    #412 <Method ExecutorService zzaao.zzvR()>
	//  151  338:new             #13  <Class zzaaj$zzb>
	//  152  341:dup             
	//  153  342:aload_0         
	//  154  343:aload           4
	//  155  345:invokespecial   #524 <Method void zzaaj$zzb(zzaaj, Map)>
	//  156  348:invokeinterface #421 <Method Future ExecutorService.submit(Runnable)>
	//  157  353:invokevirtual   #403 <Method boolean ArrayList.add(Object)>
	//  158  356:pop             
	//  159  357:return          
	}

	public void connect()
	{
	//    0    0:return          
	}

	public boolean disconnect()
	{
		zzvG();
	//    0    0:aload_0         
	//    1    1:invokespecial   #326 <Method void zzvG()>
		zzaq(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #328 <Method void zzaq(boolean)>
		zzazK.zzh(((ConnectionResult) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field zzaan zzazK>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #331 <Method void zzaan.zzh(ConnectionResult)>
		return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public void onConnected(Bundle bundle)
	{
		if(zzcv(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #128 <Method boolean zzcv(int)>
	//*   3    5:ifne            9
	//*   4    8:return          
		{
			if(bundle != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
				zzazQ.putAll(bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #84  <Field Bundle zzazQ>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #529 <Method void Bundle.putAll(Bundle)>
			if(zzvB())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #353 <Method boolean zzvB()>
	//*  13   25:ifeq            8
			{
				zzvE();
	//   14   28:aload_0         
	//   15   29:invokespecial   #394 <Method void zzvE()>
				return;
	//   16   32:return          
			}
		}
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

	public zzzv.zza zza(zzzv.zza zza1)
	{
		zzazK.zzazd.zzaAl.add(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zzaan zzazK>
	//    2    4:getfield        #269 <Field zzaal zzaan.zzazd>
	//    3    7:getfield        #535 <Field Queue zzaal.zzaAl>
	//    4   10:aload_1         
	//    5   11:invokeinterface #538 <Method boolean Queue.add(Object)>
	//    6   16:pop             
		return zza1;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, int i)
	{
		if(zzcv(1))
	//*   0    0:aload_0         
	//*   1    1:iconst_1        
	//*   2    2:invokespecial   #128 <Method boolean zzcv(int)>
	//*   3    5:ifne            9
	//*   4    8:return          
		{
			zzb(connectionresult, api, i);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:invokespecial   #120 <Method void zzb(ConnectionResult, Api, int)>
			if(zzvB())
	//*  10   16:aload_0         
	//*  11   17:invokespecial   #353 <Method boolean zzvB()>
	//*  12   20:ifeq            8
			{
				zzvE();
	//   13   23:aload_0         
	//   14   24:invokespecial   #394 <Method void zzvE()>
				return;
	//   15   27:return          
			}
		}
	}

	public zzzv.zza zzb(zzzv.zza zza1)
	{
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//    0    0:new             #541 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #543 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokespecial   #546 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	private final Context mContext;
	private final com.google.android.gms.common.api.Api.zza zzaxY;
	private ConnectionResult zzazA;
	private final zzaan zzazK;
	private int zzazN;
	private int zzazO;
	private int zzazP;
	private final Bundle zzazQ = new Bundle();
	private final Set zzazR = new HashSet();
	private zzaxn zzazS;
	private int zzazT;
	private boolean zzazU;
	private boolean zzazV;
	private zzr zzazW;
	private boolean zzazX;
	private boolean zzazY;
	private ArrayList zzazZ;
	private final Lock zzazn;
	private final zzg zzazs;
	private final Map zzazu;
	private final com.google.android.gms.common.zzc zzazw;
}
