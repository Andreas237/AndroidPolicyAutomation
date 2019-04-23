// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.clearcut;

import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.clearcut.*;
import java.util.ArrayList;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.clearcut:
//			ClearcutLogger, zze, zzb, zza

public class ClearcutLogger$LogEventBuilder
{

	public void log()
	{
		if(!zzab)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field boolean zzab>
	//*   2    4:ifne            129
		{
			zzab = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #89  <Field boolean zzab>
			zze zze1 = new zze(new zzr(ClearcutLogger.zzi(zzac), ClearcutLogger.zzj(zzac), zzk, zzj, zzl, zzm, ClearcutLogger.zzh(zzac), zzo), zzaa, ((ClearcutLogger.zzb) (null)), ((ClearcutLogger.zzb) (null)), ClearcutLogger.zzb(((ArrayList) (null))), ((String []) (null)), ClearcutLogger.zzb(((ArrayList) (null))), ((byte [][]) (null)), ((com.google.android.gms.phenotype.ExperimentTokens []) (null)), zzz);
	//    6   12:new             #151 <Class zze>
	//    7   15:dup             
	//    8   16:new             #153 <Class zzr>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field ClearcutLogger zzac>
	//   12   24:invokestatic    #156 <Method String ClearcutLogger.zzi(ClearcutLogger)>
	//   13   27:aload_0         
	//   14   28:getfield        #42  <Field ClearcutLogger zzac>
	//   15   31:invokestatic    #158 <Method int ClearcutLogger.zzj(ClearcutLogger)>
	//   16   34:aload_0         
	//   17   35:getfield        #51  <Field int zzk>
	//   18   38:aload_0         
	//   19   39:getfield        #57  <Field String zzj>
	//   20   42:aload_0         
	//   21   43:getfield        #62  <Field String zzl>
	//   22   46:aload_0         
	//   23   47:getfield        #64  <Field String zzm>
	//   24   50:aload_0         
	//   25   51:getfield        #42  <Field ClearcutLogger zzac>
	//   26   54:invokestatic    #162 <Method boolean ClearcutLogger.zzh(ClearcutLogger)>
	//   27   57:aload_0         
	//   28   58:getfield        #70  <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb zzo>
	//   29   61:invokespecial   #165 <Method void zzr(String, int, int, String, String, String, boolean, com.google.android.gms.internal.clearcut.zzge$zzv$zzb)>
	//   30   64:aload_0         
	//   31   65:getfield        #87  <Field zzha zzaa>
	//   32   68:aconst_null     
	//   33   69:aconst_null     
	//   34   70:aconst_null     
	//   35   71:invokestatic    #168 <Method int[] ClearcutLogger.zzb(ArrayList)>
	//   36   74:aconst_null     
	//   37   75:aconst_null     
	//   38   76:invokestatic    #168 <Method int[] ClearcutLogger.zzb(ArrayList)>
	//   39   79:aconst_null     
	//   40   80:aconst_null     
	//   41   81:aload_0         
	//   42   82:getfield        #82  <Field boolean zzz>
	//   43   85:invokespecial   #171 <Method void zze(zzr, zzha, ClearcutLogger$zzb, ClearcutLogger$zzb, int[], String[], int[], byte[][], com.google.android.gms.phenotype.ExperimentTokens[], boolean)>
	//   44   88:astore_1        
			if(ClearcutLogger.zzk(zzac).zza(zze1))
	//*  45   89:aload_0         
	//*  46   90:getfield        #42  <Field ClearcutLogger zzac>
	//*  47   93:invokestatic    #174 <Method ClearcutLogger$zza ClearcutLogger.zzk(ClearcutLogger)>
	//*  48   96:aload_1         
	//*  49   97:invokeinterface #179 <Method boolean ClearcutLogger$zza.zza(zze)>
	//*  50  102:ifeq            120
			{
				ClearcutLogger.zzl(zzac).zzb(zze1);
	//   51  105:aload_0         
	//   52  106:getfield        #42  <Field ClearcutLogger zzac>
	//   53  109:invokestatic    #182 <Method zzb ClearcutLogger.zzl(ClearcutLogger)>
	//   54  112:aload_1         
	//   55  113:invokeinterface #187 <Method com.google.android.gms.common.api.PendingResult zzb.zzb(zze)>
	//   56  118:pop             
				return;
	//   57  119:return          
			} else
			{
				PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, ((com.google.android.gms.common.api.GoogleApiClient) (null)));
	//   58  120:getstatic       #193 <Field Status Status.RESULT_SUCCESS>
	//   59  123:aconst_null     
	//   60  124:invokestatic    #199 <Method com.google.android.gms.common.api.PendingResult PendingResults.immediatePendingResult(Status, com.google.android.gms.common.api.GoogleApiClient)>
	//   61  127:pop             
				return;
	//   62  128:return          
			}
		} else
		{
			throw new IllegalStateException("do not reuse LogEventBuilder");
	//   63  129:new             #201 <Class IllegalStateException>
	//   64  132:dup             
	//   65  133:ldc1            #203 <String "do not reuse LogEventBuilder">
	//   66  135:invokespecial   #206 <Method void IllegalStateException(String)>
	//   67  138:athrow          
		}
	}

	public ClearcutLogger$LogEventBuilder setEventCode(int i)
	{
		zzaa.zzbji = i;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field zzha zzaa>
	//    2    4:iload_1         
	//    3    5:putfield        #212 <Field int zzha.zzbji>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final zzha zzaa;
	private boolean zzab;
	private final ClearcutLogger zzac;
	private String zzj;
	private int zzk;
	private String zzl;
	private String zzm;
	private com.google.android.gms.internal.clearcut.zzge.zzv.zzb zzo;
	private final ClearcutLogger.zzb zzt;
	private ArrayList zzu;
	private ArrayList zzv;
	private ArrayList zzw;
	private ArrayList zzx;
	private ArrayList zzy;
	private boolean zzz;

	private ClearcutLogger$LogEventBuilder(ClearcutLogger clearcutlogger, byte abyte0[])
	{
		this(clearcutlogger, abyte0, ((ClearcutLogger.zzb) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #39  <Method void ClearcutLogger$LogEventBuilder(ClearcutLogger, byte[], ClearcutLogger$zzb)>
	//    5    7:return          
	}

	private ClearcutLogger$LogEventBuilder(ClearcutLogger clearcutlogger, byte abyte0[], ClearcutLogger.zzb zzb1)
	{
		zzac = clearcutlogger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field ClearcutLogger zzac>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #45  <Method void Object()>
		zzk = ClearcutLogger.zza(zzac);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field ClearcutLogger zzac>
	//    8   14:invokestatic    #49  <Method int ClearcutLogger.zza(ClearcutLogger)>
	//    9   17:putfield        #51  <Field int zzk>
		zzj = ClearcutLogger.zzb(zzac);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #42  <Field ClearcutLogger zzac>
	//   13   25:invokestatic    #55  <Method String ClearcutLogger.zzb(ClearcutLogger)>
	//   14   28:putfield        #57  <Field String zzj>
		zzl = ClearcutLogger.zzc(zzac);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #42  <Field ClearcutLogger zzac>
	//   18   36:invokestatic    #60  <Method String ClearcutLogger.zzc(ClearcutLogger)>
	//   19   39:putfield        #62  <Field String zzl>
		zzb1 = ((ClearcutLogger.zzb) (zzac));
	//   20   42:aload_0         
	//   21   43:getfield        #42  <Field ClearcutLogger zzac>
	//   22   46:astore_3        
		zzm = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #64  <Field String zzm>
		zzo = ClearcutLogger.zzd(((ClearcutLogger) (zzb1)));
	//   26   52:aload_0         
	//   27   53:aload_3         
	//   28   54:invokestatic    #68  <Method com.google.android.gms.internal.clearcut.zzge$zzv$zzb ClearcutLogger.zzd(ClearcutLogger)>
	//   29   57:putfield        #70  <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb zzo>
		zzu = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #72  <Field ArrayList zzu>
		zzv = null;
	//   33   65:aload_0         
	//   34   66:aconst_null     
	//   35   67:putfield        #74  <Field ArrayList zzv>
		zzw = null;
	//   36   70:aload_0         
	//   37   71:aconst_null     
	//   38   72:putfield        #76  <Field ArrayList zzw>
		zzx = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #78  <Field ArrayList zzx>
		zzy = null;
	//   42   80:aload_0         
	//   43   81:aconst_null     
	//   44   82:putfield        #80  <Field ArrayList zzy>
		zzz = true;
	//   45   85:aload_0         
	//   46   86:iconst_1        
	//   47   87:putfield        #82  <Field boolean zzz>
		zzaa = new zzha();
	//   48   90:aload_0         
	//   49   91:new             #84  <Class zzha>
	//   50   94:dup             
	//   51   95:invokespecial   #85  <Method void zzha()>
	//   52   98:putfield        #87  <Field zzha zzaa>
		zzab = false;
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:putfield        #89  <Field boolean zzab>
		zzl = ClearcutLogger.zzc(clearcutlogger);
	//   56  106:aload_0         
	//   57  107:aload_1         
	//   58  108:invokestatic    #60  <Method String ClearcutLogger.zzc(ClearcutLogger)>
	//   59  111:putfield        #62  <Field String zzl>
		zzm = null;
	//   60  114:aload_0         
	//   61  115:aconst_null     
	//   62  116:putfield        #64  <Field String zzm>
		zzaa.zzbkc = com.google.android.gms.internal.clearcut.zzaa.zze(ClearcutLogger.zze(clearcutlogger));
	//   63  119:aload_0         
	//   64  120:getfield        #87  <Field zzha zzaa>
	//   65  123:aload_1         
	//   66  124:invokestatic    #93  <Method android.content.Context ClearcutLogger.zze(ClearcutLogger)>
	//   67  127:invokestatic    #98  <Method boolean zzaa.zze(android.content.Context)>
	//   68  130:putfield        #101 <Field boolean zzha.zzbkc>
		zzaa.zzbjf = ClearcutLogger.zzf(clearcutlogger).currentTimeMillis();
	//   69  133:aload_0         
	//   70  134:getfield        #87  <Field zzha zzaa>
	//   71  137:aload_1         
	//   72  138:invokestatic    #105 <Method Clock ClearcutLogger.zzf(ClearcutLogger)>
	//   73  141:invokeinterface #111 <Method long Clock.currentTimeMillis()>
	//   74  146:putfield        #115 <Field long zzha.zzbjf>
		zzaa.zzbjg = ClearcutLogger.zzf(clearcutlogger).elapsedRealtime();
	//   75  149:aload_0         
	//   76  150:getfield        #87  <Field zzha zzaa>
	//   77  153:aload_1         
	//   78  154:invokestatic    #105 <Method Clock ClearcutLogger.zzf(ClearcutLogger)>
	//   79  157:invokeinterface #118 <Method long Clock.elapsedRealtime()>
	//   80  162:putfield        #121 <Field long zzha.zzbjg>
		zzb1 = ((ClearcutLogger.zzb) (zzaa));
	//   81  165:aload_0         
	//   82  166:getfield        #87  <Field zzha zzaa>
	//   83  169:astore_3        
		ClearcutLogger.zzg(clearcutlogger);
	//   84  170:aload_1         
	//   85  171:invokestatic    #125 <Method ClearcutLogger$zzc ClearcutLogger.zzg(ClearcutLogger)>
	//   86  174:pop             
		long l = zzaa.zzbjf;
	//   87  175:aload_0         
	//   88  176:getfield        #87  <Field zzha zzaa>
	//   89  179:getfield        #115 <Field long zzha.zzbjf>
	//   90  182:lstore          4
		zzb1.zzbju = TimeZone.getDefault().getOffset(l) / 1000;
	//   91  184:aload_3         
	//   92  185:invokestatic    #131 <Method TimeZone TimeZone.getDefault()>
	//   93  188:lload           4
	//   94  190:invokevirtual   #135 <Method int TimeZone.getOffset(long)>
	//   95  193:sipush          1000
	//   96  196:idiv            
	//   97  197:i2l             
	//   98  198:putfield        #138 <Field long zzha.zzbju>
		if(abyte0 != null)
	//*  99  201:aload_2         
	//* 100  202:ifnull          213
			zzaa.zzbjp = abyte0;
	//  101  205:aload_0         
	//  102  206:getfield        #87  <Field zzha zzaa>
	//  103  209:aload_2         
	//  104  210:putfield        #142 <Field byte[] zzha.zzbjp>
		zzt = null;
	//  105  213:aload_0         
	//  106  214:aconst_null     
	//  107  215:putfield        #144 <Field ClearcutLogger$zzb zzt>
	//  108  218:return          
	}

	ClearcutLogger$LogEventBuilder(ClearcutLogger clearcutlogger, byte abyte0[], zza zza)
	{
		this(clearcutlogger, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #147 <Method void ClearcutLogger$LogEventBuilder(ClearcutLogger, byte[])>
	//    4    6:return          
	}
}
