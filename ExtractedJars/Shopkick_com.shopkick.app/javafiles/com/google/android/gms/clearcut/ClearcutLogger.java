// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.clearcut.zzaa;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzp;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.clearcut:
//			zza, zzb, zze

public final class ClearcutLogger
{
	public class LogEventBuilder
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
				com.google.android.gms.clearcut.zze zze1 = new com.google.android.gms.clearcut.zze(new zzr(ClearcutLogger.zzi(zzac), ClearcutLogger.zzj(zzac), zzk, zzj, zzl, zzm, ClearcutLogger.zzh(zzac), zzo), zzaa, ((zzb) (null)), ((zzb) (null)), ClearcutLogger.zzb(((ArrayList) (null))), ((String []) (null)), ClearcutLogger.zzb(((ArrayList) (null))), ((byte [][]) (null)), ((ExperimentTokens []) (null)), zzz);
		//    6   12:new             #151 <Class com.google.android.gms.clearcut.zze>
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
		//   43   85:invokespecial   #171 <Method void com.google.android.gms.clearcut.zze(zzr, zzha, ClearcutLogger$zzb, ClearcutLogger$zzb, int[], String[], int[], byte[][], ExperimentTokens[], boolean)>
		//   44   88:astore_1        
				if(ClearcutLogger.zzk(zzac).zza(zze1))
		//*  45   89:aload_0         
		//*  46   90:getfield        #42  <Field ClearcutLogger zzac>
		//*  47   93:invokestatic    #174 <Method ClearcutLogger$zza ClearcutLogger.zzk(ClearcutLogger)>
		//*  48   96:aload_1         
		//*  49   97:invokeinterface #179 <Method boolean ClearcutLogger$zza.zza(com.google.android.gms.clearcut.zze)>
		//*  50  102:ifeq            120
				{
					ClearcutLogger.zzl(zzac).zzb(zze1);
		//   51  105:aload_0         
		//   52  106:getfield        #42  <Field ClearcutLogger zzac>
		//   53  109:invokestatic    #182 <Method zzb ClearcutLogger.zzl(ClearcutLogger)>
		//   54  112:aload_1         
		//   55  113:invokeinterface #187 <Method com.google.android.gms.common.api.PendingResult zzb.zzb(com.google.android.gms.clearcut.zze)>
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

		public LogEventBuilder setEventCode(int i)
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
		private final zzb zzt;
		private ArrayList zzu;
		private ArrayList zzv;
		private ArrayList zzw;
		private ArrayList zzx;
		private ArrayList zzy;
		private boolean zzz;

		private LogEventBuilder(byte abyte0[])
		{
			this(abyte0, ((zzb) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokespecial   #39  <Method void ClearcutLogger$LogEventBuilder(ClearcutLogger, byte[], ClearcutLogger$zzb)>
		//    5    7:return          
		}

		private LogEventBuilder(byte abyte0[], zzb zzb1)
		{
			zzac = ClearcutLogger.this;
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
			zzb1 = ((zzb) (zzac));
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
			zzl = ClearcutLogger.zzc(ClearcutLogger.this);
		//   56  106:aload_0         
		//   57  107:aload_1         
		//   58  108:invokestatic    #60  <Method String ClearcutLogger.zzc(ClearcutLogger)>
		//   59  111:putfield        #62  <Field String zzl>
			zzm = null;
		//   60  114:aload_0         
		//   61  115:aconst_null     
		//   62  116:putfield        #64  <Field String zzm>
			zzaa.zzbkc = com.google.android.gms.internal.clearcut.zzaa.zze(com.google.android.gms.clearcut.ClearcutLogger.zze(ClearcutLogger.this));
		//   63  119:aload_0         
		//   64  120:getfield        #87  <Field zzha zzaa>
		//   65  123:aload_1         
		//   66  124:invokestatic    #93  <Method Context com.google.android.gms.clearcut.ClearcutLogger.zze(ClearcutLogger)>
		//   67  127:invokestatic    #98  <Method boolean zzaa.zze(Context)>
		//   68  130:putfield        #101 <Field boolean zzha.zzbkc>
			zzaa.zzbjf = ClearcutLogger.zzf(ClearcutLogger.this).currentTimeMillis();
		//   69  133:aload_0         
		//   70  134:getfield        #87  <Field zzha zzaa>
		//   71  137:aload_1         
		//   72  138:invokestatic    #105 <Method Clock ClearcutLogger.zzf(ClearcutLogger)>
		//   73  141:invokeinterface #111 <Method long Clock.currentTimeMillis()>
		//   74  146:putfield        #115 <Field long zzha.zzbjf>
			zzaa.zzbjg = ClearcutLogger.zzf(ClearcutLogger.this).elapsedRealtime();
		//   75  149:aload_0         
		//   76  150:getfield        #87  <Field zzha zzaa>
		//   77  153:aload_1         
		//   78  154:invokestatic    #105 <Method Clock ClearcutLogger.zzf(ClearcutLogger)>
		//   79  157:invokeinterface #118 <Method long Clock.elapsedRealtime()>
		//   80  162:putfield        #121 <Field long zzha.zzbjg>
			zzb1 = ((zzb) (zzaa));
		//   81  165:aload_0         
		//   82  166:getfield        #87  <Field zzha zzaa>
		//   83  169:astore_3        
			ClearcutLogger.zzg(ClearcutLogger.this);
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

		LogEventBuilder(byte abyte0[], com.google.android.gms.clearcut.zza zza1)
		{
			this(abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #147 <Method void ClearcutLogger$LogEventBuilder(ClearcutLogger, byte[])>
		//    4    6:return          
		}
	}

	public static interface zza
	{

		public abstract boolean zza(com.google.android.gms.clearcut.zze zze1);
	}

	public static interface zzb
	{

		public abstract byte[] zza();
	}

	public static final class zzc
	{

		public zzc()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private ClearcutLogger(Context context, int i, String s, String s1, String s2, boolean flag, com.google.android.gms.clearcut.zzb zzb1, 
			Clock clock, zzc zzc1, zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
		zzk = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #96  <Field int zzk>
		zzo = com.google.android.gms.internal.clearcut.zzge.zzv.zzb.zzbhk;
	//    5    9:aload_0         
	//    6   10:getstatic       #101 <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb com.google.android.gms.internal.clearcut.zzge$zzv$zzb.zzbhk>
	//    7   13:putfield        #103 <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb zzo>
		zzh = context;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #105 <Field Context zzh>
		packageName = context.getPackageName();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #111 <Method String Context.getPackageName()>
	//   14   26:putfield        #113 <Field String packageName>
		zzi = zza(context);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #116 <Method int zza(Context)>
	//   18   34:putfield        #118 <Field int zzi>
		zzk = -1;
	//   19   37:aload_0         
	//   20   38:iconst_m1       
	//   21   39:putfield        #96  <Field int zzk>
		zzj = s;
	//   22   42:aload_0         
	//   23   43:aload_3         
	//   24   44:putfield        #120 <Field String zzj>
		zzl = s1;
	//   25   47:aload_0         
	//   26   48:aload           4
	//   27   50:putfield        #122 <Field String zzl>
		zzm = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #124 <Field String zzm>
		zzn = flag;
	//   31   58:aload_0         
	//   32   59:iload           6
	//   33   61:putfield        #126 <Field boolean zzn>
		zzp = zzb1;
	//   34   64:aload_0         
	//   35   65:aload           7
	//   36   67:putfield        #128 <Field zzb zzp>
		zzq = clock;
	//   37   70:aload_0         
	//   38   71:aload           8
	//   39   73:putfield        #130 <Field Clock zzq>
		zzr = new zzc();
	//   40   76:aload_0         
	//   41   77:new             #15  <Class ClearcutLogger$zzc>
	//   42   80:dup             
	//   43   81:invokespecial   #131 <Method void ClearcutLogger$zzc()>
	//   44   84:putfield        #133 <Field ClearcutLogger$zzc zzr>
		zzo = com.google.android.gms.internal.clearcut.zzge.zzv.zzb.zzbhk;
	//   45   87:aload_0         
	//   46   88:getstatic       #101 <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb com.google.android.gms.internal.clearcut.zzge$zzv$zzb.zzbhk>
	//   47   91:putfield        #103 <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb zzo>
		zzs = zza1;
	//   48   94:aload_0         
	//   49   95:aload           10
	//   50   97:putfield        #135 <Field ClearcutLogger$zza zzs>
		if(flag)
	//*  51  100:iload           6
	//*  52  102:ifeq            126
		{
			if(s1 == null)
	//*  53  105:aload           4
	//*  54  107:ifnonnull       116
				flag = true;
	//   55  110:iconst_1        
	//   56  111:istore          6
			else
	//*  57  113:goto            119
				flag = false;
	//   58  116:iconst_0        
	//   59  117:istore          6
			Preconditions.checkArgument(flag, "can't be anonymous with an upload account");
	//   60  119:iload           6
	//   61  121:ldc1            #137 <String "can't be anonymous with an upload account">
	//   62  123:invokestatic    #143 <Method void Preconditions.checkArgument(boolean, Object)>
		}
	//   63  126:return          
	}

	public ClearcutLogger(Context context, String s, String s1)
	{
		this(context, -1, s, s1, ((String) (null)), false, com.google.android.gms.internal.clearcut.zze.zzb(context), DefaultClock.getInstance(), ((zzc) (null)), ((zza) (new zzp(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:iconst_0        
	//    7    7:aload_1         
	//    8    8:invokestatic    #151 <Method zzb zze.zzb(Context)>
	//    9   11:invokestatic    #157 <Method Clock DefaultClock.getInstance()>
	//   10   14:aconst_null     
	//   11   15:new             #159 <Class zzp>
	//   12   18:dup             
	//   13   19:aload_1         
	//   14   20:invokespecial   #162 <Method void zzp(Context)>
	//   15   23:invokespecial   #164 <Method void ClearcutLogger(Context, int, String, String, String, boolean, zzb, Clock, ClearcutLogger$zzc, ClearcutLogger$zza)>
	//   16   26:return          
	}

	public static ClearcutLogger anonymousLogger(Context context, String s)
	{
		return new ClearcutLogger(context, -1, s, ((String) (null)), ((String) (null)), true, com.google.android.gms.internal.clearcut.zze.zzb(context), DefaultClock.getInstance(), ((zzc) (null)), ((zza) (new zzp(context))));
	//    0    0:new             #2   <Class ClearcutLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:iconst_1        
	//    8   10:aload_0         
	//    9   11:invokestatic    #151 <Method zzb zze.zzb(Context)>
	//   10   14:invokestatic    #157 <Method Clock DefaultClock.getInstance()>
	//   11   17:aconst_null     
	//   12   18:new             #159 <Class zzp>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:invokespecial   #162 <Method void zzp(Context)>
	//   16   26:invokespecial   #164 <Method void ClearcutLogger(Context, int, String, String, String, boolean, zzb, Clock, ClearcutLogger$zzc, ClearcutLogger$zza)>
	//   17   29:areturn         
	}

	private static int zza(Context context)
	{
		int i;
		try
		{
			i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #111 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #179 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #184 <Field int PackageInfo.versionCode>
	//    7   15:istore_1        
		}
	//*   8   16:iload_1         
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			Log.wtf("ClearcutLogger", "This can't happen.", ((Throwable) (context)));
	//   11   19:ldc1            #186 <String "ClearcutLogger">
	//   12   21:ldc1            #188 <String "This can't happen.">
	//   13   23:aload_0         
	//   14   24:invokestatic    #194 <Method int Log.wtf(String, String, Throwable)>
	//   15   27:pop             
			return 0;
	//   16   28:iconst_0        
	//   17   29:ireturn         
		}
		return i;
	}

	static int zza(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int zzk>
	//    2    4:ireturn         
	}

	private static int[] zza(ArrayList arraylist)
	{
		if(arraylist == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int ai[] = new int[arraylist.size()];
	//    4    6:aload_0         
	//    5    7:invokevirtual   #202 <Method int ArrayList.size()>
	//    6   10:newarray        int[]
	//    7   12:astore          4
		arraylist = (ArrayList)arraylist;
	//    8   14:aload_0         
	//    9   15:checkcast       #198 <Class ArrayList>
	//   10   18:astore_0        
		int k = arraylist.size();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #202 <Method int ArrayList.size()>
	//   13   23:istore_3        
		int j = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		for(int i = 0; j < k; i++)
	//*  16   26:iconst_0        
	//*  17   27:istore_1        
	//*  18   28:iload_2         
	//*  19   29:iload_3         
	//*  20   30:icmpge          63
		{
			Object obj = arraylist.get(j);
	//   21   33:aload_0         
	//   22   34:iload_2         
	//   23   35:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   24   38:astore          5
			j++;
	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
			ai[i] = ((Integer)obj).intValue();
	//   29   44:aload           4
	//   30   46:iload_1         
	//   31   47:aload           5
	//   32   49:checkcast       #208 <Class Integer>
	//   33   52:invokevirtual   #211 <Method int Integer.intValue()>
	//   34   55:iastore         
		}

	//   35   56:iload_1         
	//   36   57:iconst_1        
	//   37   58:iadd            
	//   38   59:istore_1        
	//*  39   60:goto            28
		return ai;
	//   40   63:aload           4
	//   41   65:areturn         
	}

	static String zzb(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String zzj>
	//    2    4:areturn         
	}

	static int[] zzb(ArrayList arraylist)
	{
		return zza(((ArrayList) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #216 <Method int[] zza(ArrayList)>
	//    2    4:areturn         
	}

	static String zzc(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzl;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field String zzl>
	//    2    4:areturn         
	}

	static com.google.android.gms.internal.clearcut.zzge.zzv.zzb zzd(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field com.google.android.gms.internal.clearcut.zzge$zzv$zzb zzo>
	//    2    4:areturn         
	}

	static Context zze(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Context zzh>
	//    2    4:areturn         
	}

	static Clock zzf(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field Clock zzq>
	//    2    4:areturn         
	}

	static zzc zzg(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field ClearcutLogger$zzc zzr>
	//    2    4:areturn         
	}

	static boolean zzh(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzn;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field boolean zzn>
	//    2    4:ireturn         
	}

	static String zzi(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String packageName>
	//    2    4:areturn         
	}

	static int zzj(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int zzi>
	//    2    4:ireturn         
	}

	static zza zzk(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field ClearcutLogger$zza zzs>
	//    2    4:areturn         
	}

	static com.google.android.gms.clearcut.zzb zzl(ClearcutLogger clearcutlogger)
	{
		return clearcutlogger.zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field zzb zzp>
	//    2    4:areturn         
	}

	public final LogEventBuilder newEvent(byte abyte0[])
	{
		return new LogEventBuilder(abyte0, ((com.google.android.gms.clearcut.zza) (null)));
	//    0    0:new             #6   <Class ClearcutLogger$LogEventBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #229 <Method void ClearcutLogger$LogEventBuilder(ClearcutLogger, byte[], zza)>
	//    6   10:areturn         
	}

	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
	private static final ExperimentTokens zze[] = new ExperimentTokens[0];
	private static final String zzf[] = new String[0];
	private static final byte zzg[][] = new byte[0][];
	private final String packageName;
	private final Context zzh;
	private final int zzi;
	private String zzj;
	private int zzk;
	private String zzl;
	private String zzm;
	private final boolean zzn;
	private com.google.android.gms.internal.clearcut.zzge.zzv.zzb zzo;
	private final com.google.android.gms.clearcut.zzb zzp;
	private final Clock zzq;
	private zzc zzr;
	private final zza zzs;

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #59  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #64  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new com.google.android.gms.clearcut.zza()));
	//    4   10:new             #66  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #67  <Method void zza()>
	//    7   17:putstatic       #69  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("ClearcutLogger.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #71  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #73  <String "ClearcutLogger.API">
	//   11   26:getstatic       #69  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #64  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #76  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #78  <Field Api API>
	//   15   38:iconst_0        
	//   16   39:anewarray       ExperimentTokens[]
	//   17   42:putstatic       #82  <Field ExperimentTokens[] zze>
	//   18   45:iconst_0        
	//   19   46:anewarray       String[]
	//   20   49:putstatic       #86  <Field String[] zzf>
	//   21   52:iconst_0        
	//   22   53:anewarray       byte[][]
	//   23   56:putstatic       #90  <Field byte[][] zzg>
	//*  24   59:return          
	}
}
