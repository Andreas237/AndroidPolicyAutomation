// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzo;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdh, zzy, zzai, zzdi, 
//			zzcz, zzz

final class zzae
	implements zzdh
{

	private zzae(zzy zzy1)
	{
		zzbau = zzy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzy zzbau>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	zzae(zzy zzy1, zzz zzz)
	{
		this(zzy1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void zzae(zzy)>
	//    3    5:return          
	}

	public final void onSuccess(Object obj)
	{
		zzo zzo1;
label0:
		{
			zzo1 = (zzo)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzo>
	//    2    4:astore          4
			zzy.zzc(zzbau).zzoc();
	//    3    6:aload_0         
	//    4    7:getfield        #13  <Field zzy zzbau>
	//    5   10:invokestatic    #30  <Method zzai zzy.zzc(zzy)>
	//    6   13:invokevirtual   #35  <Method void zzai.zzoc()>
			synchronized(zzbau)
	//*   7   16:aload_0         
	//*   8   17:getfield        #13  <Field zzy zzbau>
	//*   9   20:astore_1        
	//*  10   21:aload_1         
	//*  11   22:monitorenter    
			{
				if(zzo1.zzqg != null)
					break MISSING_BLOCK_LABEL_86;
	//   12   23:aload           4
	//   13   25:getfield        #39  <Field com.google.android.gms.internal.measurement.zzl zzo.zzqg>
	//   14   28:ifnonnull       86
				if(zzy.zzf(zzbau).zzqg != null)
					break label0;
	//   15   31:aload_0         
	//   16   32:getfield        #13  <Field zzy zzbau>
	//   17   35:invokestatic    #43  <Method zzo zzy.zzf(zzy)>
	//   18   38:getfield        #39  <Field com.google.android.gms.internal.measurement.zzl zzo.zzqg>
	//   19   41:ifnonnull       71
				zzdi.e("Current resource is null; network resource is also null");
	//   20   44:ldc1            #45  <String "Current resource is null; network resource is also null">
	//   21   46:invokestatic    #51  <Method void zzdi.e(String)>
				long l = zzy.zzc(zzbau).zzoa();
	//   22   49:aload_0         
	//   23   50:getfield        #13  <Field zzy zzbau>
	//   24   53:invokestatic    #30  <Method zzai zzy.zzc(zzy)>
	//   25   56:invokevirtual   #55  <Method long zzai.zzoa()>
	//   26   59:lstore_2        
				zzy.zza(zzbau, l);
	//   27   60:aload_0         
	//   28   61:getfield        #13  <Field zzy zzbau>
	//   29   64:lload_2         
	//   30   65:invokestatic    #59  <Method void zzy.zza(zzy, long)>
			}
	//   31   68:aload_1         
	//   32   69:monitorexit     
			return;
	//   33   70:return          
		}
		zzo1.zzqg = zzy.zzf(zzbau).zzqg;
	//   34   71:aload           4
	//   35   73:aload_0         
	//   36   74:getfield        #13  <Field zzy zzbau>
	//   37   77:invokestatic    #43  <Method zzo zzy.zzf(zzy)>
	//   38   80:getfield        #39  <Field com.google.android.gms.internal.measurement.zzl zzo.zzqg>
	//   39   83:putfield        #39  <Field com.google.android.gms.internal.measurement.zzl zzo.zzqg>
		zzy.zza(zzbau, zzo1, zzy.zzd(zzbau).currentTimeMillis(), false);
	//   40   86:aload_0         
	//   41   87:getfield        #13  <Field zzy zzbau>
	//   42   90:aload           4
	//   43   92:aload_0         
	//   44   93:getfield        #13  <Field zzy zzbau>
	//   45   96:invokestatic    #63  <Method Clock zzy.zzd(zzy)>
	//   46   99:invokeinterface #68  <Method long Clock.currentTimeMillis()>
	//   47  104:iconst_0        
	//   48  105:invokestatic    #71  <Method void zzy.zza(zzy, zzo, long, boolean)>
		long l1 = zzy.zzg(zzbau);
	//   49  108:aload_0         
	//   50  109:getfield        #13  <Field zzy zzbau>
	//   51  112:invokestatic    #75  <Method long zzy.zzg(zzy)>
	//   52  115:lstore_2        
		StringBuilder stringbuilder = new StringBuilder(58);
	//   53  116:new             #77  <Class StringBuilder>
	//   54  119:dup             
	//   55  120:bipush          58
	//   56  122:invokespecial   #80  <Method void StringBuilder(int)>
	//   57  125:astore          5
		stringbuilder.append("setting refresh time to current time: ");
	//   58  127:aload           5
	//   59  129:ldc1            #82  <String "setting refresh time to current time: ">
	//   60  131:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   61  134:pop             
		stringbuilder.append(l1);
	//   62  135:aload           5
	//   63  137:lload_2         
	//   64  138:invokevirtual   #89  <Method StringBuilder StringBuilder.append(long)>
	//   65  141:pop             
		zzdi.v(stringbuilder.toString());
	//   66  142:aload           5
	//   67  144:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   68  147:invokestatic    #96  <Method void zzdi.v(String)>
		if(!zzy.zzh(zzbau))
	//*  69  150:aload_0         
	//*  70  151:getfield        #13  <Field zzy zzbau>
	//*  71  154:invokestatic    #100 <Method boolean zzy.zzh(zzy)>
	//*  72  157:ifne            169
			zzy.zza(zzbau, zzo1);
	//   73  160:aload_0         
	//   74  161:getfield        #13  <Field zzy zzbau>
	//   75  164:aload           4
	//   76  166:invokestatic    #103 <Method void zzy.zza(zzy, zzo)>
		obj;
	//   77  169:aload_1         
		JVM INSTR monitorexit ;
	//   78  170:monitorexit     
		return;
	//   79  171:return          
		exception;
	//   80  172:astore          4
		obj;
	//   81  174:aload_1         
		JVM INSTR monitorexit ;
	//   82  175:monitorexit     
		throw exception;
	//   83  176:aload           4
	//   84  178:athrow          
	}

	public final void zznx()
	{
	//    0    0:return          
	}

	public final void zzu(int i)
	{
		if(i == zzcz.zzbdj)
	//*   0    0:iload_1         
	//*   1    1:getstatic       #111 <Field int zzcz.zzbdj>
	//*   2    4:icmpne          17
			zzy.zzc(zzbau).zzob();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field zzy zzbau>
	//    5   11:invokestatic    #30  <Method zzai zzy.zzc(zzy)>
	//    6   14:invokevirtual   #114 <Method void zzai.zzob()>
		zzy zzy2 = zzbau;
	//    7   17:aload_0         
	//    8   18:getfield        #13  <Field zzy zzbau>
	//    9   21:astore          6
		zzy2;
	//   10   23:aload           6
		JVM INSTR monitorenter ;
	//   11   25:monitorenter    
		zzy zzy1;
		Object obj;
		if(zzbau.isReady())
			break MISSING_BLOCK_LABEL_92;
	//   12   26:aload_0         
	//   13   27:getfield        #13  <Field zzy zzbau>
	//   14   30:invokevirtual   #118 <Method boolean zzy.isReady()>
	//   15   33:ifne            92
		if(zzy.zzb(zzbau) == null)
			break MISSING_BLOCK_LABEL_71;
	//   16   36:aload_0         
	//   17   37:getfield        #13  <Field zzy zzbau>
	//   18   40:invokestatic    #122 <Method zzv zzy.zzb(zzy)>
	//   19   43:ifnull          71
		zzy1 = zzbau;
	//   20   46:aload_0         
	//   21   47:getfield        #13  <Field zzy zzbau>
	//   22   50:astore          4
		obj = ((Object) (zzy.zzb(zzbau)));
	//   23   52:aload_0         
	//   24   53:getfield        #13  <Field zzy zzbau>
	//   25   56:invokestatic    #122 <Method zzv zzy.zzb(zzy)>
	//   26   59:astore          5
_L1:
		zzy1.setResult(((com.google.android.gms.common.api.Result) (obj)));
	//   27   61:aload           4
	//   28   63:aload           5
	//   29   65:invokevirtual   #126 <Method void zzy.setResult(com.google.android.gms.common.api.Result)>
		break MISSING_BLOCK_LABEL_92;
	//   30   68:goto            92
		zzy1 = zzbau;
	//   31   71:aload_0         
	//   32   72:getfield        #13  <Field zzy zzbau>
	//   33   75:astore          4
		obj = ((Object) (zzbau.zza(Status.RESULT_TIMEOUT)));
	//   34   77:aload_0         
	//   35   78:getfield        #13  <Field zzy zzbau>
	//   36   81:getstatic       #132 <Field Status Status.RESULT_TIMEOUT>
	//   37   84:invokevirtual   #135 <Method ContainerHolder zzy.zza(Status)>
	//   38   87:astore          5
		  goto _L1
	//*  39   89:goto            61
		zzy2;
	//   40   92:aload           6
		JVM INSTR monitorexit ;
	//   41   94:monitorexit     
		long l = zzy.zzc(zzbau).zzoa();
	//   42   95:aload_0         
	//   43   96:getfield        #13  <Field zzy zzbau>
	//   44   99:invokestatic    #30  <Method zzai zzy.zzc(zzy)>
	//   45  102:invokevirtual   #55  <Method long zzai.zzoa()>
	//   46  105:lstore_2        
		zzy.zza(zzbau, l);
	//   47  106:aload_0         
	//   48  107:getfield        #13  <Field zzy zzbau>
	//   49  110:lload_2         
	//   50  111:invokestatic    #59  <Method void zzy.zza(zzy, long)>
		return;
	//   51  114:return          
		Exception exception;
		exception;
	//   52  115:astore          4
		zzy2;
	//   53  117:aload           6
		JVM INSTR monitorexit ;
	//   54  119:monitorexit     
		throw exception;
	//   55  120:aload           4
	//   56  122:athrow          
	}

	private final zzy zzbau;
}
