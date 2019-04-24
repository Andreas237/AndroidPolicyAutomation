// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzaf, zzeh, zzex, zzes, 
//			zzdg, zzai, zzal, zzah, 
//			Container, TagManager, zzv, zzac, 
//			zzdi, zzag, zzad, zzae, 
//			zzab, zzaa, zzej, ContainerHolder

public final class zzy extends BasePendingResult
{

	private zzy(Context context, TagManager tagmanager, Looper looper, String s, int i, zzah zzah1, zzag zzag1, 
			zzrf zzrf1, Clock clock, zzej zzej, zzai zzai1)
	{
		Looper looper1;
		if(looper == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       12
			looper1 = Looper.getMainLooper();
	//    2    4:invokestatic    #50  <Method Looper Looper.getMainLooper()>
	//    3    7:astore          12
		else
	//*   4    9:goto            15
			looper1 = looper;
	//    5   12:aload_3         
	//    6   13:astore          12
		super(looper1);
	//    7   15:aload_0         
	//    8   16:aload           12
	//    9   18:invokespecial   #53  <Method void BasePendingResult(Looper)>
		zzri = context;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #55  <Field Context zzri>
		zzbaf = tagmanager;
	//   13   26:aload_0         
	//   14   27:aload_2         
	//   15   28:putfield        #57  <Field TagManager zzbaf>
		context = ((Context) (looper));
	//   16   31:aload_3         
	//   17   32:astore_1        
		if(looper == null)
	//*  18   33:aload_3         
	//*  19   34:ifnonnull       41
			context = ((Context) (Looper.getMainLooper()));
	//   20   37:invokestatic    #50  <Method Looper Looper.getMainLooper()>
	//   21   40:astore_1        
		zzazy = ((Looper) (context));
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:putfield        #59  <Field Looper zzazy>
		zzazq = s;
	//   25   46:aload_0         
	//   26   47:aload           4
	//   27   49:putfield        #61  <Field String zzazq>
		zzbak = i;
	//   28   52:aload_0         
	//   29   53:iload           5
	//   30   55:putfield        #63  <Field int zzbak>
		zzbam = zzah1;
	//   31   58:aload_0         
	//   32   59:aload           6
	//   33   61:putfield        #65  <Field zzah zzbam>
		zzbas = zzag1;
	//   34   64:aload_0         
	//   35   65:aload           7
	//   36   67:putfield        #67  <Field zzag zzbas>
		zzban = zzrf1;
	//   37   70:aload_0         
	//   38   71:aload           8
	//   39   73:putfield        #69  <Field zzrf zzban>
		zzbai = new zzaf(this, ((zzz) (null)));
	//   40   76:aload_0         
	//   41   77:new             #71  <Class zzaf>
	//   42   80:dup             
	//   43   81:aload_0         
	//   44   82:aconst_null     
	//   45   83:invokespecial   #74  <Method void zzaf(zzy, zzz)>
	//   46   86:putfield        #76  <Field zzaf zzbai>
		zzbaq = new zzo();
	//   47   89:aload_0         
	//   48   90:new             #78  <Class zzo>
	//   49   93:dup             
	//   50   94:invokespecial   #81  <Method void zzo()>
	//   51   97:putfield        #83  <Field zzo zzbaq>
		zzrz = clock;
	//   52  100:aload_0         
	//   53  101:aload           9
	//   54  103:putfield        #85  <Field Clock zzrz>
		zzbaj = zzej;
	//   55  106:aload_0         
	//   56  107:aload           10
	//   57  109:putfield        #87  <Field zzej zzbaj>
		zzbal = zzai1;
	//   58  112:aload_0         
	//   59  113:aload           11
	//   60  115:putfield        #89  <Field zzai zzbal>
		if(zznw())
	//*  61  118:aload_0         
	//*  62  119:invokespecial   #93  <Method boolean zznw()>
	//*  63  122:ifeq            135
			zzdf(zzeh.zzpm().zzpo());
	//   64  125:aload_0         
	//   65  126:invokestatic    #99  <Method zzeh zzeh.zzpm()>
	//   66  129:invokevirtual   #103 <Method String zzeh.zzpo()>
	//   67  132:invokevirtual   #107 <Method void zzdf(String)>
	//   68  135:return          
	}

	public zzy(Context context, TagManager tagmanager, Looper looper, String s, int i, zzal zzal1)
	{
		this(context, tagmanager, looper, s, i, ((zzah) (new zzex(context, s))), ((zzag) (new zzes(context, s, zzal1))), new zzrf(context), DefaultClock.getInstance(), ((zzej) (new zzdg(1, 5, 0xdbba0L, 5000L, "refreshing", DefaultClock.getInstance()))), new zzai(context, s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:new             #112 <Class zzex>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokespecial   #115 <Method void zzex(Context, String)>
	//   11   18:new             #117 <Class zzes>
	//   12   21:dup             
	//   13   22:aload_1         
	//   14   23:aload           4
	//   15   25:aload           6
	//   16   27:invokespecial   #120 <Method void zzes(Context, String, zzal)>
	//   17   30:new             #122 <Class zzrf>
	//   18   33:dup             
	//   19   34:aload_1         
	//   20   35:invokespecial   #125 <Method void zzrf(Context)>
	//   21   38:invokestatic    #131 <Method Clock DefaultClock.getInstance()>
	//   22   41:new             #133 <Class zzdg>
	//   23   44:dup             
	//   24   45:iconst_1        
	//   25   46:iconst_5        
	//   26   47:ldc2w           #134 <Long 0xdbba0L>
	//   27   50:ldc2w           #136 <Long 5000L>
	//   28   53:ldc1            #139 <String "refreshing">
	//   29   55:invokestatic    #131 <Method Clock DefaultClock.getInstance()>
	//   30   58:invokespecial   #142 <Method void zzdg(int, int, long, long, String, Clock)>
	//   31   61:new             #144 <Class zzai>
	//   32   64:dup             
	//   33   65:aload_1         
	//   34   66:aload           4
	//   35   68:invokespecial   #145 <Method void zzai(Context, String)>
	//   36   71:invokespecial   #147 <Method void zzy(Context, TagManager, Looper, String, int, zzah, zzag, zzrf, Clock, zzej, zzai)>
		zzban.zzfh(zzal1.zzoe());
	//   37   74:aload_0         
	//   38   75:getfield        #69  <Field zzrf zzban>
	//   39   78:aload           6
	//   40   80:invokevirtual   #152 <Method String zzal.zzoe()>
	//   41   83:invokevirtual   #155 <Method void zzrf.zzfh(String)>
	//   42   86:return          
	}

	static zzej zza(zzy zzy1)
	{
		return zzy1.zzbaj;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field zzej zzbaj>
	//    2    4:areturn         
	}

	private final void zza(zzo zzo1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzbam != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #65  <Field zzah zzbam>
	//*   4    6:ifnull          51
		{
			zzre zzre1 = new zzre();
	//    5    9:new             #160 <Class zzre>
	//    6   12:dup             
	//    7   13:invokespecial   #161 <Method void zzre()>
	//    8   16:astore_2        
			zzre1.zzbqe = zzazv;
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #163 <Field long zzazv>
	//   12   22:putfield        #166 <Field long zzre.zzbqe>
			zzre1.zzqg = new zzl();
	//   13   25:aload_2         
	//   14   26:new             #168 <Class zzl>
	//   15   29:dup             
	//   16   30:invokespecial   #169 <Method void zzl()>
	//   17   33:putfield        #173 <Field zzl zzre.zzqg>
			zzre1.zzbqf = zzo1;
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:putfield        #176 <Field zzo zzre.zzbqf>
			zzbam.zza(zzre1);
	//   21   41:aload_0         
	//   22   42:getfield        #65  <Field zzah zzbam>
	//   23   45:aload_2         
	//   24   46:invokeinterface #181 <Method void zzah.zza(zzre)>
		}
		this;
	//   25   51:aload_0         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		return;
	//   27   53:return          
		zzo1;
	//   28   54:astore_1        
	//*  29   55:aload_0         
		throw zzo1;
	//   30   56:monitorexit     
	//   31   57:aload_1         
	//   32   58:athrow          
	}

	private final void zza(zzo zzo1, long l, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_16;
	//    2    2:iload           4
	//    3    4:ifeq            16
		flag = zzbap;
	//    4    7:aload_0         
	//    5    8:getfield        #184 <Field boolean zzbap>
	//    6   11:istore          4
	//*   7   13:goto            16
		zzv zzv1;
		if(!isReady())
			break MISSING_BLOCK_LABEL_37;
	//    8   16:aload_0         
	//    9   17:invokevirtual   #187 <Method boolean isReady()>
	//   10   20:ifeq            37
		zzv1 = zzbao;
	//   11   23:aload_0         
	//   12   24:getfield        #189 <Field zzv zzbao>
	//   13   27:astore          7
		if(zzv1 != null)
			break MISSING_BLOCK_LABEL_37;
	//   14   29:aload           7
	//   15   31:ifnonnull       37
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return;
	//   18   36:return          
		zzbaq = zzo1;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #83  <Field zzo zzbaq>
		zzazv = l;
	//   22   42:aload_0         
	//   23   43:lload_2         
	//   24   44:putfield        #163 <Field long zzazv>
		long l1 = zzbal.zznz();
	//   25   47:aload_0         
	//   26   48:getfield        #89  <Field zzai zzbal>
	//   27   51:invokevirtual   #193 <Method long zzai.zznz()>
	//   28   54:lstore          5
		zzao(Math.max(0L, Math.min(l1, (zzazv + l1) - zzrz.currentTimeMillis())));
	//   29   56:aload_0         
	//   30   57:lconst_0        
	//   31   58:lload           5
	//   32   60:aload_0         
	//   33   61:getfield        #163 <Field long zzazv>
	//   34   64:lload           5
	//   35   66:ladd            
	//   36   67:aload_0         
	//   37   68:getfield        #85  <Field Clock zzrz>
	//   38   71:invokeinterface #198 <Method long Clock.currentTimeMillis()>
	//   39   76:lsub            
	//   40   77:invokestatic    #204 <Method long Math.min(long, long)>
	//   41   80:invokestatic    #207 <Method long Math.max(long, long)>
	//   42   83:invokespecial   #211 <Method void zzao(long)>
		zzo1 = ((zzo) (new Container(zzri, zzbaf.getDataLayer(), zzazq, l, zzo1)));
	//   43   86:new             #213 <Class Container>
	//   44   89:dup             
	//   45   90:aload_0         
	//   46   91:getfield        #55  <Field Context zzri>
	//   47   94:aload_0         
	//   48   95:getfield        #57  <Field TagManager zzbaf>
	//   49   98:invokevirtual   #219 <Method DataLayer TagManager.getDataLayer()>
	//   50  101:aload_0         
	//   51  102:getfield        #61  <Field String zzazq>
	//   52  105:lload_2         
	//   53  106:aload_1         
	//   54  107:invokespecial   #222 <Method void Container(Context, DataLayer, String, long, zzo)>
	//   55  110:astore_1        
		if(zzbao == null)
	//*  56  111:aload_0         
	//*  57  112:getfield        #189 <Field zzv zzbao>
	//*  58  115:ifnonnull       145
		{
			zzbao = new zzv(zzbaf, zzazy, ((Container) (zzo1)), ((zzw) (zzbai)));
	//   59  118:aload_0         
	//   60  119:new             #224 <Class zzv>
	//   61  122:dup             
	//   62  123:aload_0         
	//   63  124:getfield        #57  <Field TagManager zzbaf>
	//   64  127:aload_0         
	//   65  128:getfield        #59  <Field Looper zzazy>
	//   66  131:aload_1         
	//   67  132:aload_0         
	//   68  133:getfield        #76  <Field zzaf zzbai>
	//   69  136:invokespecial   #227 <Method void zzv(TagManager, Looper, Container, zzw)>
	//   70  139:putfield        #189 <Field zzv zzbao>
			break MISSING_BLOCK_LABEL_153;
	//   71  142:goto            153
		}
		zzbao.zza(((Container) (zzo1)));
	//   72  145:aload_0         
	//   73  146:getfield        #189 <Field zzv zzbao>
	//   74  149:aload_1         
	//   75  150:invokevirtual   #230 <Method void zzv.zza(Container)>
		if(!isReady() && zzbat.zzb(((Container) (zzo1))))
	//*  76  153:aload_0         
	//*  77  154:invokevirtual   #187 <Method boolean isReady()>
	//*  78  157:ifne            181
	//*  79  160:aload_0         
	//*  80  161:getfield        #232 <Field zzac zzbat>
	//*  81  164:aload_1         
	//*  82  165:invokeinterface #238 <Method boolean zzac.zzb(Container)>
	//*  83  170:ifeq            181
			setResult(((Result) (zzbao)));
	//   84  173:aload_0         
	//   85  174:aload_0         
	//   86  175:getfield        #189 <Field zzv zzbao>
	//   87  178:invokevirtual   #242 <Method void setResult(Result)>
		this;
	//   88  181:aload_0         
		JVM INSTR monitorexit ;
	//   89  182:monitorexit     
		return;
	//   90  183:return          
	//*  91  184:aload_0         
_L2:
		throw zzo1;
	//   92  185:monitorexit     
	//   93  186:aload_1         
	//   94  187:athrow          
		zzo1;
	//   95  188:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  96  189:goto            184
	}

	static void zza(zzy zzy1, long l)
	{
		zzy1.zzao(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #211 <Method void zzao(long)>
	//    3    5:return          
	}

	static void zza(zzy zzy1, zzo zzo1)
	{
		zzy1.zza(zzo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #246 <Method void zza(zzo)>
	//    3    5:return          
	}

	static void zza(zzy zzy1, zzo zzo1, long l, boolean flag)
	{
		zzy1.zza(zzo1, l, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:invokespecial   #249 <Method void zza(zzo, long, boolean)>
	//    5    8:return          
	}

	private final void zzao(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzbas != null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:getfield        #67  <Field zzag zzbas>
	//    4    6:ifnonnull       17
		zzdi.zzab("Refresh requested, but no network load scheduler.");
	//    5    9:ldc1            #251 <String "Refresh requested, but no network load scheduler.">
	//    6   11:invokestatic    #256 <Method void zzdi.zzab(String)>
		this;
	//    7   14:aload_0         
		JVM INSTR monitorexit ;
	//    8   15:monitorexit     
		return;
	//    9   16:return          
		zzbas.zza(l, zzbaq.zzqh);
	//   10   17:aload_0         
	//   11   18:getfield        #67  <Field zzag zzbas>
	//   12   21:lload_1         
	//   13   22:aload_0         
	//   14   23:getfield        #83  <Field zzo zzbaq>
	//   15   26:getfield        #259 <Field String zzo.zzqh>
	//   16   29:invokeinterface #264 <Method void zzag.zza(long, String)>
		this;
	//   17   34:aload_0         
		JVM INSTR monitorexit ;
	//   18   35:monitorexit     
		return;
	//   19   36:return          
		Exception exception;
		exception;
	//   20   37:astore_3        
	//*  21   38:aload_0         
		throw exception;
	//   22   39:monitorexit     
	//   23   40:aload_3         
	//   24   41:athrow          
	}

	static zzv zzb(zzy zzy1)
	{
		return zzy1.zzbao;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field zzv zzbao>
	//    2    4:areturn         
	}

	static zzai zzc(zzy zzy1)
	{
		return zzy1.zzbal;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field zzai zzbal>
	//    2    4:areturn         
	}

	static Clock zzd(zzy zzy1)
	{
		return zzy1.zzrz;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Clock zzrz>
	//    2    4:areturn         
	}

	static boolean zze(zzy zzy1)
	{
		return zzy1.zzbap;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field boolean zzbap>
	//    2    4:ireturn         
	}

	static zzo zzf(zzy zzy1)
	{
		return zzy1.zzbaq;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field zzo zzbaq>
	//    2    4:areturn         
	}

	static long zzg(zzy zzy1)
	{
		return zzy1.zzazv;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field long zzazv>
	//    2    4:lreturn         
	}

	static boolean zzh(zzy zzy1)
	{
		return zzy1.zznw();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method boolean zznw()>
	//    2    4:ireturn         
	}

	private final void zzn(boolean flag)
	{
		zzbam.zza(((zzdh) (new zzad(this, ((zzz) (null))))));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field zzah zzbam>
	//    2    4:new             #280 <Class zzad>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #281 <Method void zzad(zzy, zzz)>
	//    7   13:invokeinterface #284 <Method void zzah.zza(zzdh)>
		zzbas.zza(((zzdh) (new zzae(this, ((zzz) (null))))));
	//    8   18:aload_0         
	//    9   19:getfield        #67  <Field zzag zzbas>
	//   10   22:new             #286 <Class zzae>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:invokespecial   #287 <Method void zzae(zzy, zzz)>
	//   15   31:invokeinterface #288 <Method void zzag.zza(zzdh)>
		com.google.android.gms.internal.measurement.zzrk zzrk = zzbam.zzv(zzbak);
	//   16   36:aload_0         
	//   17   37:getfield        #65  <Field zzah zzbam>
	//   18   40:aload_0         
	//   19   41:getfield        #63  <Field int zzbak>
	//   20   44:invokeinterface #292 <Method com.google.android.gms.internal.measurement.zzrk zzah.zzv(int)>
	//   21   49:astore_2        
		if(zzrk != null)
	//*  22   50:aload_2         
	//*  23   51:ifnull          101
			zzbao = new zzv(zzbaf, zzazy, new Container(zzri, zzbaf.getDataLayer(), zzazq, 0L, zzrk), ((zzw) (zzbai)));
	//   24   54:aload_0         
	//   25   55:new             #224 <Class zzv>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:getfield        #57  <Field TagManager zzbaf>
	//   29   63:aload_0         
	//   30   64:getfield        #59  <Field Looper zzazy>
	//   31   67:new             #213 <Class Container>
	//   32   70:dup             
	//   33   71:aload_0         
	//   34   72:getfield        #55  <Field Context zzri>
	//   35   75:aload_0         
	//   36   76:getfield        #57  <Field TagManager zzbaf>
	//   37   79:invokevirtual   #219 <Method DataLayer TagManager.getDataLayer()>
	//   38   82:aload_0         
	//   39   83:getfield        #61  <Field String zzazq>
	//   40   86:lconst_0        
	//   41   87:aload_2         
	//   42   88:invokespecial   #295 <Method void Container(Context, DataLayer, String, long, com.google.android.gms.internal.measurement.zzrk)>
	//   43   91:aload_0         
	//   44   92:getfield        #76  <Field zzaf zzbai>
	//   45   95:invokespecial   #227 <Method void zzv(TagManager, Looper, Container, zzw)>
	//   46   98:putfield        #189 <Field zzv zzbao>
		zzbat = ((zzac) (new zzab(this, flag)));
	//   47  101:aload_0         
	//   48  102:new             #297 <Class zzab>
	//   49  105:dup             
	//   50  106:aload_0         
	//   51  107:iload_1         
	//   52  108:invokespecial   #300 <Method void zzab(zzy, boolean)>
	//   53  111:putfield        #232 <Field zzac zzbat>
		if(zznw())
	//*  54  114:aload_0         
	//*  55  115:invokespecial   #93  <Method boolean zznw()>
	//*  56  118:ifeq            135
		{
			zzbas.zza(0L, "");
	//   57  121:aload_0         
	//   58  122:getfield        #67  <Field zzag zzbas>
	//   59  125:lconst_0        
	//   60  126:ldc2            #302 <String "">
	//   61  129:invokeinterface #264 <Method void zzag.zza(long, String)>
			return;
	//   62  134:return          
		} else
		{
			zzbam.zzny();
	//   63  135:aload_0         
	//   64  136:getfield        #65  <Field zzah zzbam>
	//   65  139:invokeinterface #305 <Method void zzah.zzny()>
			return;
	//   66  144:return          
		}
	}

	private final boolean zznw()
	{
		zzeh zzeh1 = zzeh.zzpm();
	//    0    0:invokestatic    #99  <Method zzeh zzeh.zzpm()>
	//    1    3:astore_1        
		return (zzeh1.zzpn() == zzeh.zza.zzbeh || zzeh1.zzpn() == zzeh.zza.zzbei) && zzazq.equals(((Object) (zzeh1.getContainerId())));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #309 <Method zzeh$zza zzeh.zzpn()>
	//    4    8:getstatic       #315 <Field zzeh$zza zzeh$zza.zzbeh>
	//    5   11:if_acmpeq       24
	//    6   14:aload_1         
	//    7   15:invokevirtual   #309 <Method zzeh$zza zzeh.zzpn()>
	//    8   18:getstatic       #318 <Field zzeh$zza zzeh$zza.zzbei>
	//    9   21:if_acmpne       40
	//   10   24:aload_0         
	//   11   25:getfield        #61  <Field String zzazq>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #321 <Method String zzeh.getContainerId()>
	//   14   32:invokevirtual   #327 <Method boolean String.equals(Object)>
	//   15   35:ifeq            40
	//   16   38:iconst_1        
	//   17   39:ireturn         
	//   18   40:iconst_0        
	//   19   41:ireturn         
	}

	protected final Result createFailedResult(Status status)
	{
		return ((Result) (zza(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #332 <Method ContainerHolder zza(Status)>
	//    3    5:areturn         
	}

	protected final ContainerHolder zza(Status status)
	{
		if(zzbao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field zzv zzbao>
	//*   2    4:ifnull          12
			return ((ContainerHolder) (zzbao));
	//    3    7:aload_0         
	//    4    8:getfield        #189 <Field zzv zzbao>
	//    5   11:areturn         
		if(status == Status.RESULT_TIMEOUT)
	//*   6   12:aload_1         
	//*   7   13:getstatic       #338 <Field Status Status.RESULT_TIMEOUT>
	//*   8   16:if_acmpne       25
			zzdi.e("timer expired: setting result to failure");
	//    9   19:ldc2            #340 <String "timer expired: setting result to failure">
	//   10   22:invokestatic    #343 <Method void zzdi.e(String)>
		return ((ContainerHolder) (new zzv(status)));
	//   11   25:new             #224 <Class zzv>
	//   12   28:dup             
	//   13   29:aload_1         
	//   14   30:invokespecial   #346 <Method void zzv(Status)>
	//   15   33:areturn         
	}

	final void zzdf(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzbar = s;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #348 <Field String zzbar>
		if(zzbas != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #67  <Field zzag zzbas>
	//*   7   11:ifnull          24
			zzbas.zzdg(s);
	//    8   14:aload_0         
	//    9   15:getfield        #67  <Field zzag zzbas>
	//   10   18:aload_1         
	//   11   19:invokeinterface #351 <Method void zzag.zzdg(String)>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		s;
	//   15   27:astore_1        
	//*  16   28:aload_0         
		throw s;
	//   17   29:monitorexit     
	//   18   30:aload_1         
	//   19   31:athrow          
	}

	final String zznq()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = zzbar;
	//    2    2:aload_0         
	//    3    3:getfield        #348 <Field String zzbar>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final void zznt()
	{
		Object obj = ((Object) (zzbam.zzv(zzbak)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field zzah zzbam>
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field int zzbak>
	//    4    8:invokeinterface #292 <Method com.google.android.gms.internal.measurement.zzrk zzah.zzv(int)>
	//    5   13:astore_1        
		if(obj != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          74
		{
			obj = ((Object) (new Container(zzri, zzbaf.getDataLayer(), zzazq, 0L, ((com.google.android.gms.internal.measurement.zzrk) (obj)))));
	//    8   18:new             #213 <Class Container>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #55  <Field Context zzri>
	//   12   26:aload_0         
	//   13   27:getfield        #57  <Field TagManager zzbaf>
	//   14   30:invokevirtual   #219 <Method DataLayer TagManager.getDataLayer()>
	//   15   33:aload_0         
	//   16   34:getfield        #61  <Field String zzazq>
	//   17   37:lconst_0        
	//   18   38:aload_1         
	//   19   39:invokespecial   #295 <Method void Container(Context, DataLayer, String, long, com.google.android.gms.internal.measurement.zzrk)>
	//   20   42:astore_1        
			setResult(((Result) (new zzv(zzbaf, zzazy, ((Container) (obj)), ((zzw) (new zzaa(this)))))));
	//   21   43:aload_0         
	//   22   44:new             #224 <Class zzv>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:getfield        #57  <Field TagManager zzbaf>
	//   26   52:aload_0         
	//   27   53:getfield        #59  <Field Looper zzazy>
	//   28   56:aload_1         
	//   29   57:new             #355 <Class zzaa>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:invokespecial   #358 <Method void zzaa(zzy)>
	//   33   65:invokespecial   #227 <Method void zzv(TagManager, Looper, Container, zzw)>
	//   34   68:invokevirtual   #242 <Method void setResult(Result)>
		} else
	//*  35   71:goto            101
		{
			zzdi.e("Default was requested, but no default container was found");
	//   36   74:ldc2            #360 <String "Default was requested, but no default container was found">
	//   37   77:invokestatic    #343 <Method void zzdi.e(String)>
			setResult(((Result) (zza(new Status(10, "Default was requested, but no default container was found", ((android.app.PendingIntent) (null)))))));
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:new             #334 <Class Status>
	//   41   85:dup             
	//   42   86:bipush          10
	//   43   88:ldc2            #360 <String "Default was requested, but no default container was found">
	//   44   91:aconst_null     
	//   45   92:invokespecial   #363 <Method void Status(int, String, android.app.PendingIntent)>
	//   46   95:invokevirtual   #332 <Method ContainerHolder zza(Status)>
	//   47   98:invokevirtual   #242 <Method void setResult(Result)>
		}
		zzbas = null;
	//   48  101:aload_0         
	//   49  102:aconst_null     
	//   50  103:putfield        #67  <Field zzag zzbas>
		zzbam = null;
	//   51  106:aload_0         
	//   52  107:aconst_null     
	//   53  108:putfield        #65  <Field zzah zzbam>
	//   54  111:return          
	}

	public final void zznu()
	{
		zzn(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #366 <Method void zzn(boolean)>
	//    3    5:return          
	}

	public final void zznv()
	{
		zzn(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #366 <Method void zzn(boolean)>
	//    3    5:return          
	}

	private final String zzazq;
	private long zzazv;
	private final Looper zzazy;
	private final TagManager zzbaf;
	private final zzaf zzbai;
	private final zzej zzbaj;
	private final int zzbak;
	private final zzai zzbal;
	private zzah zzbam;
	private zzrf zzban;
	private volatile zzv zzbao;
	private volatile boolean zzbap;
	private zzo zzbaq;
	private String zzbar;
	private zzag zzbas;
	private zzac zzbat;
	private final Context zzri;
	private final Clock zzrz;
}
