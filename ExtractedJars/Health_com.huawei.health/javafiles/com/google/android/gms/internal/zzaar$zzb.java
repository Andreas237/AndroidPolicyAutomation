// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.zze;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzaav, zzbai, zzaau

class zzaar$zzb extends zzaar$zzf
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
				if(!zzaar$zza.zza((zzaar$zza)zzaBC.get(((Object) (zze1)))))
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
	//   53  116:invokestatic    #74  <Method android.content.Context zzaar.zza(zzaar)>
	//   54  119:invokevirtual   #80  <Method int zze.isGooglePlayServicesAvailable(android.content.Context)>
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
			zzaar.zzd(zzaBA).zza(((zzaav$zza) (new zzaav.zza(((zzaau) (zzaBA)), connectionresult) {

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
				final zzaar.zzb zzaBE;

			
			{
				zzaBE = zzaar.zzb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaar$zzb zzaBE>
				zzaBD = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field ConnectionResult zzaBD>
				super(zzaau);
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
			com.google.android.gms.common.internal.zzf.zzf zzf = (com.google.android.gms.common.internal.zzf.zzf)zzaBC.get(((Object) (zze2)));
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
				zzaar.zzd(zzaBA).zza(((zzaav$zza) (new zzaav.zza(((zzaau) (zzaBA)), zzf) {

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
				zzaBF = zzf;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaBF>
				super(zzaau);
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
				zze2.zza(zzf);
	//  126  293:aload           7
	//  127  295:aload           8
	//  128  297:invokeinterface #118 <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzf$zzf)>
		}

	//* 129  302:goto            214
	//  130  305:return          
	}

	final zzaar zzaBA;
	private final Map zzaBC;

	public zzaar$zzb(zzaar zzaar1, Map map)
	{
		zzaBA = zzaar1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzaar zzaBA>
		super(zzaar1, ((zzaar._cls1) (null)));
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
