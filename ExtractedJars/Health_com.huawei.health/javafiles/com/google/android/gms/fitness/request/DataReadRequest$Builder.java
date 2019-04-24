// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			DataReadRequest

public static class DataReadRequest$Builder
{

	static List zza(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List zzaSs>
	//    2    4:areturn         
	}

	static List zzb(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVw;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzaVw>
	//    2    4:areturn         
	}

	static long zzc(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long zzafe>
	//    2    4:lreturn         
	}

	static long zzd(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long zzaSt>
	//    2    4:lreturn         
	}

	static List zze(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVB;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List zzaVB>
	//    2    4:areturn         
	}

	static List zzf(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVC;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzaVC>
	//    2    4:areturn         
	}

	static int zzg(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaSw;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzaSw>
	//    2    4:ireturn         
	}

	static long zzh(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVD;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long zzaVD>
	//    2    4:lreturn         
	}

	static DataSource zzi(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVE;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field DataSource zzaVE>
	//    2    4:areturn         
	}

	static int zzj(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVF;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int zzaVF>
	//    2    4:ireturn         
	}

	static boolean zzk(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVH;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean zzaVH>
	//    2    4:ireturn         
	}

	static List zzl(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVJ;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzaVJ>
	//    2    4:areturn         
	}

	static List zzm(DataReadRequest$Builder datareadrequest$builder)
	{
		return datareadrequest$builder.zzaVK;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field List zzaVK>
	//    2    4:areturn         
	}

	public DataReadRequest$Builder addFilteredDataQualityStandard(int i)
	{
		zzac.zzb(zzaVJ.isEmpty(), "Cannot add data quality standard filter when filtering by device.");
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzaVJ>
	//    2    4:invokeinterface #92  <Method boolean List.isEmpty()>
	//    3    9:ldc1            #94  <String "Cannot add data quality standard filter when filtering by device.">
	//    4   11:invokestatic    #99  <Method void zzac.zzb(boolean, Object)>
		zzaVK.add(((Object) (Integer.valueOf(i))));
	//    5   14:aload_0         
	//    6   15:getfield        #59  <Field List zzaVK>
	//    7   18:iload_1         
	//    8   19:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//    9   22:invokeinterface #109 <Method boolean List.add(Object)>
	//   10   27:pop             
		return this;
	//   11   28:aload_0         
	//   12   29:areturn         
	}

	public DataReadRequest$Builder aggregate(DataSource datasource, DataType datatype)
	{
		zzac.zzb(((Object) (datasource)), "Attempting to add a null data source");
	//    0    0:aload_1         
	//    1    1:ldc1            #113 <String "Attempting to add a null data source">
	//    2    3:invokestatic    #116 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(!zzaVw.contains(((Object) (datasource))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #41  <Field List zzaVw>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #119 <Method boolean List.contains(Object)>
	//*   8   17:ifne            25
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_3        
		else
	//*  11   22:goto            27
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_3        
		zzac.zza(flag, "Cannot add the same data source for aggregated and detailed");
	//   14   27:iload_3         
	//   15   28:ldc1            #121 <String "Cannot add the same data source for aggregated and detailed">
	//   16   30:invokestatic    #123 <Method void zzac.zza(boolean, Object)>
		DataType datatype1 = datasource.getDataType();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #129 <Method DataType DataSource.getDataType()>
	//   19   37:astore          4
		List list = DataType.getAggregatesForInput(datatype1);
	//   20   39:aload           4
	//   21   41:invokestatic    #135 <Method List DataType.getAggregatesForInput(DataType)>
	//   22   44:astore          5
		if(!list.isEmpty())
	//*  23   46:aload           5
	//*  24   48:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  25   53:ifne            61
			flag = true;
	//   26   56:iconst_1        
	//   27   57:istore_3        
		else
	//*  28   58:goto            63
			flag = false;
	//   29   61:iconst_0        
	//   30   62:istore_3        
		zzac.zzb(flag, "Unsupported input data type specified for aggregation: %s", new Object[] {
			datatype1
		});
	//   31   63:iload_3         
	//   32   64:ldc1            #137 <String "Unsupported input data type specified for aggregation: %s">
	//   33   66:iconst_1        
	//   34   67:anewarray       Object[]
	//   35   70:dup             
	//   36   71:iconst_0        
	//   37   72:aload           4
	//   38   74:aastore         
	//   39   75:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzac.zzb(list.contains(((Object) (datatype))), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
			datatype1, datatype
		});
	//   40   78:aload           5
	//   41   80:aload_2         
	//   42   81:invokeinterface #119 <Method boolean List.contains(Object)>
	//   43   86:ldc1            #142 <String "Invalid output aggregate data type specified: %s -> %s">
	//   44   88:iconst_2        
	//   45   89:anewarray       Object[]
	//   46   92:dup             
	//   47   93:iconst_0        
	//   48   94:aload           4
	//   49   96:aastore         
	//   50   97:dup             
	//   51   98:iconst_1        
	//   52   99:aload_2         
	//   53  100:aastore         
	//   54  101:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(!zzaVC.contains(((Object) (datasource))))
	//*  55  104:aload_0         
	//*  56  105:getfield        #45  <Field List zzaVC>
	//*  57  108:aload_1         
	//*  58  109:invokeinterface #119 <Method boolean List.contains(Object)>
	//*  59  114:ifne            128
			zzaVC.add(((Object) (datasource)));
	//   60  117:aload_0         
	//   61  118:getfield        #45  <Field List zzaVC>
	//   62  121:aload_1         
	//   63  122:invokeinterface #109 <Method boolean List.add(Object)>
	//   64  127:pop             
		return this;
	//   65  128:aload_0         
	//   66  129:areturn         
	}

	public DataReadRequest$Builder aggregate(DataType datatype, DataType datatype1)
	{
		zzac.zzb(((Object) (datatype)), "Attempting to use a null data type");
	//    0    0:aload_1         
	//    1    1:ldc1            #145 <String "Attempting to use a null data type">
	//    2    3:invokestatic    #116 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(!zzaSs.contains(((Object) (datatype))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #39  <Field List zzaSs>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #119 <Method boolean List.contains(Object)>
	//*   8   17:ifne            25
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_3        
		else
	//*  11   22:goto            27
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_3        
		zzac.zza(flag, "Cannot add the same data type as aggregated and detailed");
	//   14   27:iload_3         
	//   15   28:ldc1            #147 <String "Cannot add the same data type as aggregated and detailed">
	//   16   30:invokestatic    #123 <Method void zzac.zza(boolean, Object)>
		List list = DataType.getAggregatesForInput(datatype);
	//   17   33:aload_1         
	//   18   34:invokestatic    #135 <Method List DataType.getAggregatesForInput(DataType)>
	//   19   37:astore          4
		if(!list.isEmpty())
	//*  20   39:aload           4
	//*  21   41:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  22   46:ifne            54
			flag = true;
	//   23   49:iconst_1        
	//   24   50:istore_3        
		else
	//*  25   51:goto            56
			flag = false;
	//   26   54:iconst_0        
	//   27   55:istore_3        
		zzac.zzb(flag, "Unsupported input data type specified for aggregation: %s", new Object[] {
			datatype
		});
	//   28   56:iload_3         
	//   29   57:ldc1            #137 <String "Unsupported input data type specified for aggregation: %s">
	//   30   59:iconst_1        
	//   31   60:anewarray       Object[]
	//   32   63:dup             
	//   33   64:iconst_0        
	//   34   65:aload_1         
	//   35   66:aastore         
	//   36   67:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzac.zzb(list.contains(((Object) (datatype1))), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
			datatype, datatype1
		});
	//   37   70:aload           4
	//   38   72:aload_2         
	//   39   73:invokeinterface #119 <Method boolean List.contains(Object)>
	//   40   78:ldc1            #142 <String "Invalid output aggregate data type specified: %s -> %s">
	//   41   80:iconst_2        
	//   42   81:anewarray       Object[]
	//   43   84:dup             
	//   44   85:iconst_0        
	//   45   86:aload_1         
	//   46   87:aastore         
	//   47   88:dup             
	//   48   89:iconst_1        
	//   49   90:aload_2         
	//   50   91:aastore         
	//   51   92:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(!zzaVB.contains(((Object) (datatype))))
	//*  52   95:aload_0         
	//*  53   96:getfield        #43  <Field List zzaVB>
	//*  54   99:aload_1         
	//*  55  100:invokeinterface #119 <Method boolean List.contains(Object)>
	//*  56  105:ifne            119
			zzaVB.add(((Object) (datatype)));
	//   57  108:aload_0         
	//   58  109:getfield        #43  <Field List zzaVB>
	//   59  112:aload_1         
	//   60  113:invokeinterface #109 <Method boolean List.add(Object)>
	//   61  118:pop             
		return this;
	//   62  119:aload_0         
	//   63  120:areturn         
	}

	public DataReadRequest$Builder bucketByActivitySegment(int i, TimeUnit timeunit)
	{
		boolean flag;
		if(zzaSw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zzaSw>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		zzac.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
			Integer.valueOf(zzaSw)
		});
	//    8   14:iload_3         
	//    9   15:ldc1            #151 <String "Bucketing strategy already set to %s">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:aload_0         
	//   15   24:getfield        #47  <Field int zzaSw>
	//   16   27:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(i > 0)
	//*  19   34:iload_1         
	//*  20   35:ifle            43
			flag = true;
	//   21   38:iconst_1        
	//   22   39:istore_3        
		else
	//*  23   40:goto            45
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore_3        
		zzac.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
			Integer.valueOf(i)
		});
	//   26   45:iload_3         
	//   27   46:ldc1            #153 <String "Must specify a valid minimum duration for an activity segment: %d">
	//   28   48:iconst_1        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:iload_1         
	//   33   55:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   34   58:aastore         
	//   35   59:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaSw = 4;
	//   36   62:aload_0         
	//   37   63:iconst_4        
	//   38   64:putfield        #47  <Field int zzaSw>
		zzaVD = timeunit.toMillis(i);
	//   39   67:aload_0         
	//   40   68:aload_2         
	//   41   69:iload_1         
	//   42   70:i2l             
	//   43   71:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//   44   74:putfield        #49  <Field long zzaVD>
		return this;
	//   45   77:aload_0         
	//   46   78:areturn         
	}

	public DataReadRequest$Builder bucketByActivitySegment(int i, TimeUnit timeunit, DataSource datasource)
	{
		boolean flag;
		if(zzaSw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zzaSw>
	//*   2    4:ifne            13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          4
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
		zzac.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
			Integer.valueOf(zzaSw)
		});
	//    8   16:iload           4
	//    9   18:ldc1            #151 <String "Bucketing strategy already set to %s">
	//   10   20:iconst_1        
	//   11   21:anewarray       Object[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_0         
	//   15   27:getfield        #47  <Field int zzaSw>
	//   16   30:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   33:aastore         
	//   18   34:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(i > 0)
	//*  19   37:iload_1         
	//*  20   38:ifle            47
			flag = true;
	//   21   41:iconst_1        
	//   22   42:istore          4
		else
	//*  23   44:goto            50
			flag = false;
	//   24   47:iconst_0        
	//   25   48:istore          4
		zzac.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
			Integer.valueOf(i)
		});
	//   26   50:iload           4
	//   27   52:ldc1            #153 <String "Must specify a valid minimum duration for an activity segment: %d">
	//   28   54:iconst_1        
	//   29   55:anewarray       Object[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:iload_1         
	//   33   61:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   34   64:aastore         
	//   35   65:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(datasource != null)
	//*  36   68:aload_3         
	//*  37   69:ifnull          78
			flag = true;
	//   38   72:iconst_1        
	//   39   73:istore          4
		else
	//*  40   75:goto            81
			flag = false;
	//   41   78:iconst_0        
	//   42   79:istore          4
		zzac.zzb(flag, "Invalid activity data source specified");
	//   43   81:iload           4
	//   44   83:ldc1            #162 <String "Invalid activity data source specified">
	//   45   85:invokestatic    #99  <Method void zzac.zzb(boolean, Object)>
		zzac.zzb(datasource.getDataType().equals(((Object) (DataType.TYPE_ACTIVITY_SEGMENT))), "Invalid activity data source specified: %s", new Object[] {
			datasource
		});
	//   46   88:aload_3         
	//   47   89:invokevirtual   #129 <Method DataType DataSource.getDataType()>
	//   48   92:getstatic       #166 <Field DataType DataType.TYPE_ACTIVITY_SEGMENT>
	//   49   95:invokevirtual   #169 <Method boolean DataType.equals(Object)>
	//   50   98:ldc1            #171 <String "Invalid activity data source specified: %s">
	//   51  100:iconst_1        
	//   52  101:anewarray       Object[]
	//   53  104:dup             
	//   54  105:iconst_0        
	//   55  106:aload_3         
	//   56  107:aastore         
	//   57  108:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaVE = datasource;
	//   58  111:aload_0         
	//   59  112:aload_3         
	//   60  113:putfield        #79  <Field DataSource zzaVE>
		zzaSw = 4;
	//   61  116:aload_0         
	//   62  117:iconst_4        
	//   63  118:putfield        #47  <Field int zzaSw>
		zzaVD = timeunit.toMillis(i);
	//   64  121:aload_0         
	//   65  122:aload_2         
	//   66  123:iload_1         
	//   67  124:i2l             
	//   68  125:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//   69  128:putfield        #49  <Field long zzaVD>
		return this;
	//   70  131:aload_0         
	//   71  132:areturn         
	}

	public DataReadRequest$Builder bucketByActivityType(int i, TimeUnit timeunit)
	{
		boolean flag;
		if(zzaSw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zzaSw>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		zzac.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
			Integer.valueOf(zzaSw)
		});
	//    8   14:iload_3         
	//    9   15:ldc1            #151 <String "Bucketing strategy already set to %s">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:aload_0         
	//   15   24:getfield        #47  <Field int zzaSw>
	//   16   27:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(i > 0)
	//*  19   34:iload_1         
	//*  20   35:ifle            43
			flag = true;
	//   21   38:iconst_1        
	//   22   39:istore_3        
		else
	//*  23   40:goto            45
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore_3        
		zzac.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
			Integer.valueOf(i)
		});
	//   26   45:iload_3         
	//   27   46:ldc1            #153 <String "Must specify a valid minimum duration for an activity segment: %d">
	//   28   48:iconst_1        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:iload_1         
	//   33   55:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   34   58:aastore         
	//   35   59:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaSw = 3;
	//   36   62:aload_0         
	//   37   63:iconst_3        
	//   38   64:putfield        #47  <Field int zzaSw>
		zzaVD = timeunit.toMillis(i);
	//   39   67:aload_0         
	//   40   68:aload_2         
	//   41   69:iload_1         
	//   42   70:i2l             
	//   43   71:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//   44   74:putfield        #49  <Field long zzaVD>
		return this;
	//   45   77:aload_0         
	//   46   78:areturn         
	}

	public DataReadRequest$Builder bucketByActivityType(int i, TimeUnit timeunit, DataSource datasource)
	{
		boolean flag;
		if(zzaSw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zzaSw>
	//*   2    4:ifne            13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          4
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
		zzac.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
			Integer.valueOf(zzaSw)
		});
	//    8   16:iload           4
	//    9   18:ldc1            #151 <String "Bucketing strategy already set to %s">
	//   10   20:iconst_1        
	//   11   21:anewarray       Object[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_0         
	//   15   27:getfield        #47  <Field int zzaSw>
	//   16   30:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   33:aastore         
	//   18   34:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(i > 0)
	//*  19   37:iload_1         
	//*  20   38:ifle            47
			flag = true;
	//   21   41:iconst_1        
	//   22   42:istore          4
		else
	//*  23   44:goto            50
			flag = false;
	//   24   47:iconst_0        
	//   25   48:istore          4
		zzac.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
			Integer.valueOf(i)
		});
	//   26   50:iload           4
	//   27   52:ldc1            #153 <String "Must specify a valid minimum duration for an activity segment: %d">
	//   28   54:iconst_1        
	//   29   55:anewarray       Object[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:iload_1         
	//   33   61:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   34   64:aastore         
	//   35   65:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(datasource != null)
	//*  36   68:aload_3         
	//*  37   69:ifnull          78
			flag = true;
	//   38   72:iconst_1        
	//   39   73:istore          4
		else
	//*  40   75:goto            81
			flag = false;
	//   41   78:iconst_0        
	//   42   79:istore          4
		zzac.zzb(flag, "Invalid activity data source specified");
	//   43   81:iload           4
	//   44   83:ldc1            #162 <String "Invalid activity data source specified">
	//   45   85:invokestatic    #99  <Method void zzac.zzb(boolean, Object)>
		zzac.zzb(datasource.getDataType().equals(((Object) (DataType.TYPE_ACTIVITY_SEGMENT))), "Invalid activity data source specified: %s", new Object[] {
			datasource
		});
	//   46   88:aload_3         
	//   47   89:invokevirtual   #129 <Method DataType DataSource.getDataType()>
	//   48   92:getstatic       #166 <Field DataType DataType.TYPE_ACTIVITY_SEGMENT>
	//   49   95:invokevirtual   #169 <Method boolean DataType.equals(Object)>
	//   50   98:ldc1            #171 <String "Invalid activity data source specified: %s">
	//   51  100:iconst_1        
	//   52  101:anewarray       Object[]
	//   53  104:dup             
	//   54  105:iconst_0        
	//   55  106:aload_3         
	//   56  107:aastore         
	//   57  108:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaVE = datasource;
	//   58  111:aload_0         
	//   59  112:aload_3         
	//   60  113:putfield        #79  <Field DataSource zzaVE>
		zzaSw = 3;
	//   61  116:aload_0         
	//   62  117:iconst_3        
	//   63  118:putfield        #47  <Field int zzaSw>
		zzaVD = timeunit.toMillis(i);
	//   64  121:aload_0         
	//   65  122:aload_2         
	//   66  123:iload_1         
	//   67  124:i2l             
	//   68  125:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//   69  128:putfield        #49  <Field long zzaVD>
		return this;
	//   70  131:aload_0         
	//   71  132:areturn         
	}

	public DataReadRequest$Builder bucketBySession(int i, TimeUnit timeunit)
	{
		boolean flag;
		if(zzaSw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zzaSw>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		zzac.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
			Integer.valueOf(zzaSw)
		});
	//    8   14:iload_3         
	//    9   15:ldc1            #151 <String "Bucketing strategy already set to %s">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:aload_0         
	//   15   24:getfield        #47  <Field int zzaSw>
	//   16   27:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(i > 0)
	//*  19   34:iload_1         
	//*  20   35:ifle            43
			flag = true;
	//   21   38:iconst_1        
	//   22   39:istore_3        
		else
	//*  23   40:goto            45
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore_3        
		zzac.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
			Integer.valueOf(i)
		});
	//   26   45:iload_3         
	//   27   46:ldc1            #153 <String "Must specify a valid minimum duration for an activity segment: %d">
	//   28   48:iconst_1        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:iload_1         
	//   33   55:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   34   58:aastore         
	//   35   59:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaSw = 2;
	//   36   62:aload_0         
	//   37   63:iconst_2        
	//   38   64:putfield        #47  <Field int zzaSw>
		zzaVD = timeunit.toMillis(i);
	//   39   67:aload_0         
	//   40   68:aload_2         
	//   41   69:iload_1         
	//   42   70:i2l             
	//   43   71:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//   44   74:putfield        #49  <Field long zzaVD>
		return this;
	//   45   77:aload_0         
	//   46   78:areturn         
	}

	public DataReadRequest$Builder bucketByTime(int i, TimeUnit timeunit)
	{
		boolean flag;
		if(zzaSw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zzaSw>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		zzac.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
			Integer.valueOf(zzaSw)
		});
	//    8   14:iload_3         
	//    9   15:ldc1            #151 <String "Bucketing strategy already set to %s">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:aload_0         
	//   15   24:getfield        #47  <Field int zzaSw>
	//   16   27:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		if(i > 0)
	//*  19   34:iload_1         
	//*  20   35:ifle            43
			flag = true;
	//   21   38:iconst_1        
	//   22   39:istore_3        
		else
	//*  23   40:goto            45
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore_3        
		zzac.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
			Integer.valueOf(i)
		});
	//   26   45:iload_3         
	//   27   46:ldc1            #153 <String "Must specify a valid minimum duration for an activity segment: %d">
	//   28   48:iconst_1        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:iload_1         
	//   33   55:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   34   58:aastore         
	//   35   59:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaSw = 1;
	//   36   62:aload_0         
	//   37   63:iconst_1        
	//   38   64:putfield        #47  <Field int zzaSw>
		zzaVD = timeunit.toMillis(i);
	//   39   67:aload_0         
	//   40   68:aload_2         
	//   41   69:iload_1         
	//   42   70:i2l             
	//   43   71:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//   44   74:putfield        #49  <Field long zzaVD>
		return this;
	//   45   77:aload_0         
	//   46   78:areturn         
	}

	public DataReadRequest build()
	{
		boolean flag1;
		if(!zzaVw.isEmpty() || !zzaSs.isEmpty() || !zzaVC.isEmpty() || !zzaVB.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field List zzaVw>
	//*   2    4:invokeinterface #92  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            48
	//*   4   12:aload_0         
	//*   5   13:getfield        #39  <Field List zzaSs>
	//*   6   16:invokeinterface #92  <Method boolean List.isEmpty()>
	//*   7   21:ifeq            48
	//*   8   24:aload_0         
	//*   9   25:getfield        #45  <Field List zzaVC>
	//*  10   28:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  11   33:ifeq            48
	//*  12   36:aload_0         
	//*  13   37:getfield        #43  <Field List zzaVB>
	//*  14   40:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  15   45:ifne            53
			flag1 = true;
	//   16   48:iconst_1        
	//   17   49:istore_2        
		else
	//*  18   50:goto            55
			flag1 = false;
	//   19   53:iconst_0        
	//   20   54:istore_2        
		zzac.zza(flag1, "Must add at least one data source (aggregated or detailed)");
	//   21   55:iload_2         
	//   22   56:ldc1            #178 <String "Must add at least one data source (aggregated or detailed)">
	//   23   58:invokestatic    #123 <Method void zzac.zza(boolean, Object)>
		if(zzafe > 0L)
	//*  24   61:aload_0         
	//*  25   62:getfield        #67  <Field long zzafe>
	//*  26   65:lconst_0        
	//*  27   66:lcmp            
	//*  28   67:ifle            75
			flag1 = true;
	//   29   70:iconst_1        
	//   30   71:istore_2        
		else
	//*  31   72:goto            77
			flag1 = false;
	//   32   75:iconst_0        
	//   33   76:istore_2        
		zzac.zza(flag1, "Invalid start time: %s", new Object[] {
			Long.valueOf(zzafe)
		});
	//   34   77:iload_2         
	//   35   78:ldc1            #180 <String "Invalid start time: %s">
	//   36   80:iconst_1        
	//   37   81:anewarray       Object[]
	//   38   84:dup             
	//   39   85:iconst_0        
	//   40   86:aload_0         
	//   41   87:getfield        #67  <Field long zzafe>
	//   42   90:invokestatic    #185 <Method Long Long.valueOf(long)>
	//   43   93:aastore         
	//   44   94:invokestatic    #187 <Method void zzac.zza(boolean, String, Object[])>
		if(zzaSt > 0L && zzaSt > zzafe)
	//*  45   97:aload_0         
	//*  46   98:getfield        #70  <Field long zzaSt>
	//*  47  101:lconst_0        
	//*  48  102:lcmp            
	//*  49  103:ifle            123
	//*  50  106:aload_0         
	//*  51  107:getfield        #70  <Field long zzaSt>
	//*  52  110:aload_0         
	//*  53  111:getfield        #67  <Field long zzafe>
	//*  54  114:lcmp            
	//*  55  115:ifle            123
			flag1 = true;
	//   56  118:iconst_1        
	//   57  119:istore_2        
		else
	//*  58  120:goto            125
			flag1 = false;
	//   59  123:iconst_0        
	//   60  124:istore_2        
		zzac.zza(flag1, "Invalid end time: %s", new Object[] {
			Long.valueOf(zzaSt)
		});
	//   61  125:iload_2         
	//   62  126:ldc1            #189 <String "Invalid end time: %s">
	//   63  128:iconst_1        
	//   64  129:anewarray       Object[]
	//   65  132:dup             
	//   66  133:iconst_0        
	//   67  134:aload_0         
	//   68  135:getfield        #70  <Field long zzaSt>
	//   69  138:invokestatic    #185 <Method Long Long.valueOf(long)>
	//   70  141:aastore         
	//   71  142:invokestatic    #187 <Method void zzac.zza(boolean, String, Object[])>
		boolean flag;
		if(zzaVC.isEmpty() && zzaVB.isEmpty())
	//*  72  145:aload_0         
	//*  73  146:getfield        #45  <Field List zzaVC>
	//*  74  149:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  75  154:ifeq            174
	//*  76  157:aload_0         
	//*  77  158:getfield        #43  <Field List zzaVB>
	//*  78  161:invokeinterface #92  <Method boolean List.isEmpty()>
	//*  79  166:ifeq            174
			flag = true;
	//   80  169:iconst_1        
	//   81  170:istore_1        
		else
	//*  82  171:goto            176
			flag = false;
	//   83  174:iconst_0        
	//   84  175:istore_1        
		if(flag && zzaSw == 0 || !flag && zzaSw != 0)
	//*  85  176:iload_1         
	//*  86  177:ifeq            187
	//*  87  180:aload_0         
	//*  88  181:getfield        #47  <Field int zzaSw>
	//*  89  184:ifeq            198
	//*  90  187:iload_1         
	//*  91  188:ifne            203
	//*  92  191:aload_0         
	//*  93  192:getfield        #47  <Field int zzaSw>
	//*  94  195:ifeq            203
			flag1 = true;
	//   95  198:iconst_1        
	//   96  199:istore_2        
		else
	//*  97  200:goto            205
			flag1 = false;
	//   98  203:iconst_0        
	//   99  204:istore_2        
		zzac.zza(flag1, "Must specify a valid bucketing strategy while requesting aggregation");
	//  100  205:iload_2         
	//  101  206:ldc1            #191 <String "Must specify a valid bucketing strategy while requesting aggregation">
	//  102  208:invokestatic    #123 <Method void zzac.zza(boolean, Object)>
		return new DataReadRequest(this, ((DataReadRequest._cls1) (null)));
	//  103  211:new             #6   <Class DataReadRequest>
	//  104  214:dup             
	//  105  215:aload_0         
	//  106  216:aconst_null     
	//  107  217:invokespecial   #194 <Method void DataReadRequest(DataReadRequest$Builder, DataReadRequest$1)>
	//  108  220:areturn         
	}

	public DataReadRequest$Builder enableServerQueries()
	{
		zzaVH = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #55  <Field boolean zzaVH>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DataReadRequest$Builder read(DataSource datasource)
	{
		zzac.zzb(((Object) (datasource)), "Attempting to add a null data source");
	//    0    0:aload_1         
	//    1    1:ldc1            #113 <String "Attempting to add a null data source">
	//    2    3:invokestatic    #116 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(!zzaVC.contains(((Object) (datasource))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #45  <Field List zzaVC>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #119 <Method boolean List.contains(Object)>
	//*   8   17:ifne            25
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_2        
		else
	//*  11   22:goto            27
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_2        
		zzac.zzb(flag, "Cannot add the same data source as aggregated and detailed");
	//   14   27:iload_2         
	//   15   28:ldc1            #200 <String "Cannot add the same data source as aggregated and detailed">
	//   16   30:invokestatic    #99  <Method void zzac.zzb(boolean, Object)>
		if(!zzaVw.contains(((Object) (datasource))))
	//*  17   33:aload_0         
	//*  18   34:getfield        #41  <Field List zzaVw>
	//*  19   37:aload_1         
	//*  20   38:invokeinterface #119 <Method boolean List.contains(Object)>
	//*  21   43:ifne            57
			zzaVw.add(((Object) (datasource)));
	//   22   46:aload_0         
	//   23   47:getfield        #41  <Field List zzaVw>
	//   24   50:aload_1         
	//   25   51:invokeinterface #109 <Method boolean List.add(Object)>
	//   26   56:pop             
		return this;
	//   27   57:aload_0         
	//   28   58:areturn         
	}

	public DataReadRequest$Builder read(DataType datatype)
	{
		zzac.zzb(((Object) (datatype)), "Attempting to use a null data type");
	//    0    0:aload_1         
	//    1    1:ldc1            #145 <String "Attempting to use a null data type">
	//    2    3:invokestatic    #116 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(!zzaVB.contains(((Object) (datatype))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #43  <Field List zzaVB>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #119 <Method boolean List.contains(Object)>
	//*   8   17:ifne            25
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_2        
		else
	//*  11   22:goto            27
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_2        
		zzac.zza(flag, "Cannot add the same data type as aggregated and detailed");
	//   14   27:iload_2         
	//   15   28:ldc1            #147 <String "Cannot add the same data type as aggregated and detailed">
	//   16   30:invokestatic    #123 <Method void zzac.zza(boolean, Object)>
		if(!zzaSs.contains(((Object) (datatype))))
	//*  17   33:aload_0         
	//*  18   34:getfield        #39  <Field List zzaSs>
	//*  19   37:aload_1         
	//*  20   38:invokeinterface #119 <Method boolean List.contains(Object)>
	//*  21   43:ifne            57
			zzaSs.add(((Object) (datatype)));
	//   22   46:aload_0         
	//   23   47:getfield        #39  <Field List zzaSs>
	//   24   50:aload_1         
	//   25   51:invokeinterface #109 <Method boolean List.add(Object)>
	//   26   56:pop             
		return this;
	//   27   57:aload_0         
	//   28   58:areturn         
	}

	public DataReadRequest$Builder setLimit(int i)
	{
		boolean flag;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		zzac.zzb(flag, "Invalid limit %d is specified", new Object[] {
			Integer.valueOf(i)
		});
	//    7   11:iload_2         
	//    8   12:ldc1            #204 <String "Invalid limit %d is specified">
	//    9   14:iconst_1        
	//   10   15:anewarray       Object[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:iload_1         
	//   14   21:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   15   24:aastore         
	//   16   25:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaVF = i;
	//   17   28:aload_0         
	//   18   29:iload_1         
	//   19   30:putfield        #51  <Field int zzaVF>
		return this;
	//   20   33:aload_0         
	//   21   34:areturn         
	}

	public DataReadRequest$Builder setTimeRange(long l, long l1, TimeUnit timeunit)
	{
		zzafe = timeunit.toMillis(l);
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:lload_1         
	//    3    4:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//    4    7:putfield        #67  <Field long zzafe>
		zzaSt = timeunit.toMillis(l1);
	//    5   10:aload_0         
	//    6   11:aload           5
	//    7   13:lload_3         
	//    8   14:invokevirtual   #159 <Method long TimeUnit.toMillis(long)>
	//    9   17:putfield        #70  <Field long zzaSt>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private List zzaSs;
	private long zzaSt;
	private int zzaSw;
	private List zzaVB;
	private List zzaVC;
	private long zzaVD;
	private DataSource zzaVE;
	private int zzaVF;
	private boolean zzaVG;
	private boolean zzaVH;
	private final List zzaVJ = new ArrayList();
	private final List zzaVK = new ArrayList();
	private List zzaVw;
	private long zzafe;

	public DataReadRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		zzaSs = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #36  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void ArrayList()>
	//    6   12:putfield        #39  <Field List zzaSs>
		zzaVw = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #36  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void ArrayList()>
	//   11   23:putfield        #41  <Field List zzaVw>
		zzaVB = ((List) (new ArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #36  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #37  <Method void ArrayList()>
	//   16   34:putfield        #43  <Field List zzaVB>
		zzaVC = ((List) (new ArrayList()));
	//   17   37:aload_0         
	//   18   38:new             #36  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #37  <Method void ArrayList()>
	//   21   45:putfield        #45  <Field List zzaVC>
		zzaSw = 0;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #47  <Field int zzaSw>
		zzaVD = 0L;
	//   25   53:aload_0         
	//   26   54:lconst_0        
	//   27   55:putfield        #49  <Field long zzaVD>
		zzaVF = 0;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #51  <Field int zzaVF>
		zzaVG = false;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #53  <Field boolean zzaVG>
		zzaVH = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #55  <Field boolean zzaVH>
	//   37   73:aload_0         
	//   38   74:new             #36  <Class ArrayList>
	//   39   77:dup             
	//   40   78:invokespecial   #37  <Method void ArrayList()>
	//   41   81:putfield        #57  <Field List zzaVJ>
	//   42   84:aload_0         
	//   43   85:new             #36  <Class ArrayList>
	//   44   88:dup             
	//   45   89:invokespecial   #37  <Method void ArrayList()>
	//   46   92:putfield        #59  <Field List zzaVK>
	//   47   95:return          
	}
}
