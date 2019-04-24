// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzanx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			SensorRequest

public static class SensorRequest$Builder
{

	static DataSource zza(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	static DataType zzb(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	static long zzc(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaUo;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long zzaUo>
	//    2    4:lreturn         
	}

	static long zzd(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaWs;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long zzaWs>
	//    2    4:lreturn         
	}

	static long zze(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaWr;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long zzaWr>
	//    2    4:lreturn         
	}

	static int zzf(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaUp;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzaUp>
	//    2    4:ireturn         
	}

	static long zzg(SensorRequest$Builder sensorrequest$builder)
	{
		return sensorrequest$builder.zzaWx;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field long zzaWx>
	//    2    4:lreturn         
	}

	public SensorRequest build()
	{
		boolean flag;
		if(zzaTi != null || zzaTj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field DataSource zzaTi>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field DataType zzaTj>
	//*   5   11:ifnull          19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_1        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		zzac.zza(flag, "Must call setDataSource() or setDataType()");
	//   11   21:iload_1         
	//   12   22:ldc1            #60  <String "Must call setDataSource() or setDataType()">
	//   13   24:invokestatic    #65  <Method void zzac.zza(boolean, Object)>
		if(zzaTj == null || zzaTi == null || zzaTj.equals(((Object) (zzaTi.getDataType()))))
	//*  14   27:aload_0         
	//*  15   28:getfield        #49  <Field DataType zzaTj>
	//*  16   31:ifnull          58
	//*  17   34:aload_0         
	//*  18   35:getfield        #45  <Field DataSource zzaTi>
	//*  19   38:ifnull          58
	//*  20   41:aload_0         
	//*  21   42:getfield        #49  <Field DataType zzaTj>
	//*  22   45:aload_0         
	//*  23   46:getfield        #45  <Field DataSource zzaTi>
	//*  24   49:invokevirtual   #71  <Method DataType DataSource.getDataType()>
	//*  25   52:invokevirtual   #77  <Method boolean DataType.equals(Object)>
	//*  26   55:ifeq            63
			flag = true;
	//   27   58:iconst_1        
	//   28   59:istore_1        
		else
	//*  29   60:goto            65
			flag = false;
	//   30   63:iconst_0        
	//   31   64:istore_1        
		zzac.zza(flag, "Specified data type is incompatible with specified data source");
	//   32   65:iload_1         
	//   33   66:ldc1            #79  <String "Specified data type is incompatible with specified data source">
	//   34   68:invokestatic    #65  <Method void zzac.zza(boolean, Object)>
		return new SensorRequest(this, ((SensorRequest._cls1) (null)));
	//   35   71:new             #6   <Class SensorRequest>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:invokespecial   #82  <Method void SensorRequest(SensorRequest$Builder, SensorRequest$1)>
	//   40   80:areturn         
	}

	public SensorRequest$Builder setAccuracyMode(int i)
	{
		zzaUp = zzanx.zzhc(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #90  <Method int zzanx.zzhc(int)>
	//    3    5:putfield        #36  <Field int zzaUp>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SensorRequest$Builder setDataSource(DataSource datasource)
	{
		zzaTi = datasource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field DataSource zzaTi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SensorRequest$Builder setDataType(DataType datatype)
	{
		zzaTj = datatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field DataType zzaTj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SensorRequest$Builder setFastestRate(int i, TimeUnit timeunit)
	{
		boolean flag;
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		zzac.zzb(flag, "Cannot use a negative interval");
	//    7   11:iload_3         
	//    8   12:ldc1            #98  <String "Cannot use a negative interval">
	//    9   14:invokestatic    #100 <Method void zzac.zzb(boolean, Object)>
		zzaWy = true;
	//   10   17:aload_0         
	//   11   18:iconst_1        
	//   12   19:putfield        #34  <Field boolean zzaWy>
		zzaWs = timeunit.toMicros(i);
	//   13   22:aload_0         
	//   14   23:aload_2         
	//   15   24:iload_1         
	//   16   25:i2l             
	//   17   26:invokevirtual   #106 <Method long TimeUnit.toMicros(long)>
	//   18   29:putfield        #30  <Field long zzaWs>
		return this;
	//   19   32:aload_0         
	//   20   33:areturn         
	}

	public SensorRequest$Builder setMaxDeliveryLatency(int i, TimeUnit timeunit)
	{
		boolean flag;
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		zzac.zzb(flag, "Cannot use a negative delivery interval");
	//    7   11:iload_3         
	//    8   12:ldc1            #109 <String "Cannot use a negative delivery interval">
	//    9   14:invokestatic    #100 <Method void zzac.zzb(boolean, Object)>
		zzaWr = timeunit.toMicros(i);
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:iload_1         
	//   13   20:i2l             
	//   14   21:invokevirtual   #106 <Method long TimeUnit.toMicros(long)>
	//   15   24:putfield        #32  <Field long zzaWr>
		return this;
	//   16   27:aload_0         
	//   17   28:areturn         
	}

	public SensorRequest$Builder setSamplingRate(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(l >= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          4
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          4
		zzac.zzb(flag, "Cannot use a negative sampling interval");
	//    9   15:iload           4
	//   10   17:ldc1            #113 <String "Cannot use a negative sampling interval">
	//   11   19:invokestatic    #100 <Method void zzac.zzb(boolean, Object)>
		zzaUo = timeunit.toMicros(l);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:lload_1         
	//   15   25:invokevirtual   #106 <Method long TimeUnit.toMicros(long)>
	//   16   28:putfield        #28  <Field long zzaUo>
		if(!zzaWy)
	//*  17   31:aload_0         
	//*  18   32:getfield        #34  <Field boolean zzaWy>
	//*  19   35:ifne            50
			zzaWs = zzaUo / 2L;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #28  <Field long zzaUo>
	//   23   43:ldc2w           #114 <Long 2L>
	//   24   46:ldiv            
	//   25   47:putfield        #30  <Field long zzaWs>
		return this;
	//   26   50:aload_0         
	//   27   51:areturn         
	}

	public SensorRequest$Builder setTimeout(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(l > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          4
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          4
		zzac.zzb(flag, "Invalid time out value specified: %d", new Object[] {
			Long.valueOf(l)
		});
	//    9   15:iload           4
	//   10   17:ldc1            #118 <String "Invalid time out value specified: %d">
	//   11   19:iconst_1        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:lload_1         
	//   16   26:invokestatic    #124 <Method Long Long.valueOf(long)>
	//   17   29:aastore         
	//   18   30:invokestatic    #127 <Method void zzac.zzb(boolean, String, Object[])>
		if(timeunit != null)
	//*  19   33:aload_3         
	//*  20   34:ifnull          43
			flag = true;
	//   21   37:iconst_1        
	//   22   38:istore          4
		else
	//*  23   40:goto            46
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore          4
		zzac.zzb(flag, "Invalid time unit specified");
	//   26   46:iload           4
	//   27   48:ldc1            #129 <String "Invalid time unit specified">
	//   28   50:invokestatic    #100 <Method void zzac.zzb(boolean, Object)>
		zzaWx = timeunit.toMicros(l);
	//   29   53:aload_0         
	//   30   54:aload_3         
	//   31   55:lload_1         
	//   32   56:invokevirtual   #106 <Method long TimeUnit.toMicros(long)>
	//   33   59:putfield        #40  <Field long zzaWx>
		return this;
	//   34   62:aload_0         
	//   35   63:areturn         
	}

	private DataSource zzaTi;
	private DataType zzaTj;
	private long zzaUo;
	private int zzaUp;
	private long zzaWr;
	private long zzaWs;
	private long zzaWx;
	private boolean zzaWy;

	public SensorRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzaUo = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #25  <Long -1L>
	//    4    8:putfield        #28  <Field long zzaUo>
		zzaWs = 0L;
	//    5   11:aload_0         
	//    6   12:lconst_0        
	//    7   13:putfield        #30  <Field long zzaWs>
		zzaWr = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #32  <Field long zzaWr>
		zzaWy = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #34  <Field boolean zzaWy>
		zzaUp = 2;
	//   14   26:aload_0         
	//   15   27:iconst_2        
	//   16   28:putfield        #36  <Field int zzaUp>
		zzaWx = 0xffffffffL;
	//   17   31:aload_0         
	//   18   32:ldc2w           #37  <Long 0xffffffffL>
	//   19   35:putfield        #40  <Field long zzaWx>
	//   20   38:return          
	}
}
