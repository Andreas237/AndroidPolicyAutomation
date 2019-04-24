// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.zzc;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaj, zzaan, zzaxn, zzaam

private class zzaaj$zzb extends zzaaj$zzf
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
		com.google.android.gms.common.api.Api.zze zze;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_308;
	//   13   26:aload           6
	//   14   28:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            308
		zze = (com.google.android.gms.common.api.Api.zze)iterator.next();
	//   16   36:aload           6
	//   17   38:invokeinterface #53  <Method Object Iterator.next()>
	//   18   43:checkcast       #55  <Class com.google.android.gms.common.api.Api$zze>
	//   19   46:astore          7
		if(!zze.zzuI()) goto _L2; else goto _L1
	//   20   48:aload           7
	//   21   50:invokeinterface #58  <Method boolean com.google.android.gms.common.api.Api$zze.zzuI()>
	//   22   55:ifeq            156
_L1:
		if(zzaaj$zza.zza((zzaaj$zza)zzaAc.get(((Object) (zze)))) != 0) goto _L4; else goto _L3
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
	//   41   98:invokestatic    #74  <Method android.content.Context zzaaj.zza(zzaaj)>
	//   42  101:invokevirtual   #80  <Method int zzc.isGooglePlayServicesAvailable(android.content.Context)>
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
			zzaaj.zzd(zzaAa).zza(((zzaan$zza) (new zzaan.zza(((zzaam) (zzaAa)), connectionresult) {

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
				final zzaaj.zzb zzaAe;

			
			{
				zzaAe = zzaaj.zzb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaaj$zzb zzaAe>
				zzaAd = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field ConnectionResult zzaAd>
				super(zzaam);
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
				com.google.android.gms.common.api.Api.zze zze1 = (com.google.android.gms.common.api.Api.zze)iterator1.next();
	//   97  219:aload           6
	//   98  221:invokeinterface #53  <Method Object Iterator.next()>
	//   99  226:checkcast       #55  <Class com.google.android.gms.common.api.Api$zze>
	//  100  229:astore          7
				com.google.android.gms.common.internal.zzf.zzf zzf = (com.google.android.gms.common.internal.zzf.zzf)zzaAc.get(((Object) (zze1)));
	//  101  231:aload_0         
	//  102  232:getfield        #25  <Field Map zzaAc>
	//  103  235:aload           7
	//  104  237:invokeinterface #62  <Method Object Map.get(Object)>
	//  105  242:checkcast       #112 <Class com.google.android.gms.common.internal.zzf$zzf>
	//  106  245:astore          8
				if(zze1.zzuI() && i != 0)
	//* 107  247:aload           7
	//* 108  249:invokeinterface #58  <Method boolean com.google.android.gms.common.api.Api$zze.zzuI()>
	//* 109  254:ifeq            289
	//* 110  257:iload           4
	//* 111  259:ifeq            289
					zzaaj.zzd(zzaAa).zza(((zzaan$zza) (new zzaan.zza(((zzaam) (zzaAa)), zzf) {

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
				zzaAf = zzf;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaAf>
				super(zzaam);
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
					zze1.zza(zzf);
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

	public zzaaj$zzb(zzaaj zzaaj1, Map map)
	{
		zzaAa = zzaaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzaaj zzaAa>
		super(zzaaj1, ((zzaaj._cls1) (null)));
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
