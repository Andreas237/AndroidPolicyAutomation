// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Subscription, DataSource, DataType

public static class Subscription$zza
{

	static DataType zza(Subscription$zza subscription$zza)
	{
		return subscription$zza.zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	static DataSource zzb(Subscription$zza subscription$zza)
	{
		return subscription$zza.zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	static long zzc(Subscription$zza subscription$zza)
	{
		return subscription$zza.zzaUo;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long zzaUo>
	//    2    4:lreturn         
	}

	static int zzd(Subscription$zza subscription$zza)
	{
		return subscription$zza.zzaUp;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zzaUp>
	//    2    4:ireturn         
	}

	public Subscription zzCB()
	{
		boolean flag;
		if(zzaTi != null || zzaTj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field DataSource zzaTi>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field DataType zzaTj>
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
	//   12   22:ldc1            #41  <String "Must call setDataSource() or setDataType()">
	//   13   24:invokestatic    #46  <Method void zzac.zza(boolean, Object)>
		if(zzaTj == null || zzaTi == null || zzaTj.equals(((Object) (zzaTi.getDataType()))))
	//*  14   27:aload_0         
	//*  15   28:getfield        #29  <Field DataType zzaTj>
	//*  16   31:ifnull          58
	//*  17   34:aload_0         
	//*  18   35:getfield        #33  <Field DataSource zzaTi>
	//*  19   38:ifnull          58
	//*  20   41:aload_0         
	//*  21   42:getfield        #29  <Field DataType zzaTj>
	//*  22   45:aload_0         
	//*  23   46:getfield        #33  <Field DataSource zzaTi>
	//*  24   49:invokevirtual   #52  <Method DataType DataSource.getDataType()>
	//*  25   52:invokevirtual   #58  <Method boolean DataType.equals(Object)>
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
	//   33   66:ldc1            #60  <String "Specified data type is incompatible with specified data source">
	//   34   68:invokestatic    #46  <Method void zzac.zza(boolean, Object)>
		return new Subscription(this, ((Subscription._cls1) (null)));
	//   35   71:new             #6   <Class Subscription>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:invokespecial   #63  <Method void Subscription(Subscription$zza, Subscription$1)>
	//   40   80:areturn         
	}

	public Subscription$zza zzb(DataSource datasource)
	{
		zzaTi = datasource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field DataSource zzaTi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Subscription$zza zzd(DataType datatype)
	{
		zzaTj = datatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field DataType zzaTj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private DataSource zzaTi;
	private DataType zzaTj;
	private long zzaUo;
	private int zzaUp;

	public Subscription$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzaUo = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #20  <Long -1L>
	//    4    8:putfield        #23  <Field long zzaUo>
		zzaUp = 2;
	//    5   11:aload_0         
	//    6   12:iconst_2        
	//    7   13:putfield        #25  <Field int zzaUp>
	//    8   16:return          
	}
}
