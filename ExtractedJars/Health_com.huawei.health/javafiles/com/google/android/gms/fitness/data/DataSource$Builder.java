// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.fitness.data:
//			DataSource, zzb, Device, DataType

public static final class DataSource$Builder
{

	static DataType zza(DataSource$Builder datasource$builder)
	{
		return datasource$builder.zzaSg;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field DataType zzaSg>
	//    2    4:areturn         
	}

	static int zzb(DataSource$Builder datasource$builder)
	{
		return datasource$builder.type;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int type>
	//    2    4:ireturn         
	}

	static String zzc(DataSource$Builder datasource$builder)
	{
		return datasource$builder.name;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String name>
	//    2    4:areturn         
	}

	static Device zzd(DataSource$Builder datasource$builder)
	{
		return datasource$builder.zzaSK;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Device zzaSK>
	//    2    4:areturn         
	}

	static zzb zze(DataSource$Builder datasource$builder)
	{
		return datasource$builder.zzaSL;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field zzb zzaSL>
	//    2    4:areturn         
	}

	static String zzf(DataSource$Builder datasource$builder)
	{
		return datasource$builder.zzaSM;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzaSM>
	//    2    4:areturn         
	}

	static int[] zzg(DataSource$Builder datasource$builder)
	{
		return datasource$builder.zzaSN;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int[] zzaSN>
	//    2    4:areturn         
	}

	public DataSource build()
	{
		boolean flag;
		if(zzaSg != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field DataType zzaSg>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		zzac.zza(flag, "Must set data type");
	//    8   14:iload_1         
	//    9   15:ldc1            #58  <String "Must set data type">
	//   10   17:invokestatic    #63  <Method void zzac.zza(boolean, Object)>
		if(type >= 0)
	//*  11   20:aload_0         
	//*  12   21:getfield        #26  <Field int type>
	//*  13   24:iflt            32
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore_1        
		else
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_1        
		zzac.zza(flag, "Must set data source type");
	//   19   34:iload_1         
	//   20   35:ldc1            #65  <String "Must set data source type">
	//   21   37:invokestatic    #63  <Method void zzac.zza(boolean, Object)>
		return new DataSource(this, ((DataSource._cls1) (null)));
	//   22   40:new             #6   <Class DataSource>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:aconst_null     
	//   26   46:invokespecial   #68  <Method void DataSource(DataSource$Builder, DataSource$1)>
	//   27   49:areturn         
	}

	public DataSource$Builder setAppPackageName(Context context)
	{
		return setAppPackageName(context.getPackageName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #76  <Method String Context.getPackageName()>
	//    3    5:invokevirtual   #79  <Method DataSource$Builder setAppPackageName(String)>
	//    4    8:areturn         
	}

	public DataSource$Builder setAppPackageName(String s)
	{
		zzaSL = com.google.android.gms.fitness.data.zzb.zzdV(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #85  <Method zzb zzb.zzdV(String)>
	//    3    5:putfield        #49  <Field zzb zzaSL>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public transient DataSource$Builder setDataQualityStandards(int ai[])
	{
		zzaSN = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field int[] zzaSN>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DataSource$Builder setDataType(DataType datatype)
	{
		zzaSg = datatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field DataType zzaSg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DataSource$Builder setDevice(Device device)
	{
		zzaSK = device;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Device zzaSK>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DataSource$Builder setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String name>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DataSource$Builder setStreamName(String s)
	{
		boolean flag;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		zzac.zzb(flag, "Must specify a valid stream name");
	//    7   11:iload_2         
	//    8   12:ldc1            #95  <String "Must specify a valid stream name">
	//    9   14:invokestatic    #97  <Method void zzac.zzb(boolean, Object)>
		zzaSM = s;
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:putfield        #30  <Field String zzaSM>
		return this;
	//   13   22:aload_0         
	//   14   23:areturn         
	}

	public DataSource$Builder setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int type>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String name;
	private int type;
	private Device zzaSK;
	private zzb zzaSL;
	private String zzaSM;
	private int zzaSN[];
	private DataType zzaSg;

	public DataSource$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		type = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #26  <Field int type>
		zzaSM = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #28  <String "">
	//    7   12:putfield        #30  <Field String zzaSM>
	//    8   15:return          
	}
}
