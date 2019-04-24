// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.internal.zzaom;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzi

public class DataReadRequest extends zza
{
	public static class Builder
	{

		static List zza(Builder builder)
		{
			return builder.zzaSs;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field List zzaSs>
		//    2    4:areturn         
		}

		static List zzb(Builder builder)
		{
			return builder.zzaVw;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field List zzaVw>
		//    2    4:areturn         
		}

		static long zzc(Builder builder)
		{
			return builder.zzafe;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field long zzafe>
		//    2    4:lreturn         
		}

		static long zzd(Builder builder)
		{
			return builder.zzaSt;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field long zzaSt>
		//    2    4:lreturn         
		}

		static List zze(Builder builder)
		{
			return builder.zzaVB;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field List zzaVB>
		//    2    4:areturn         
		}

		static List zzf(Builder builder)
		{
			return builder.zzaVC;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field List zzaVC>
		//    2    4:areturn         
		}

		static int zzg(Builder builder)
		{
			return builder.zzaSw;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int zzaSw>
		//    2    4:ireturn         
		}

		static long zzh(Builder builder)
		{
			return builder.zzaVD;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field long zzaVD>
		//    2    4:lreturn         
		}

		static DataSource zzi(Builder builder)
		{
			return builder.zzaVE;
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field DataSource zzaVE>
		//    2    4:areturn         
		}

		static int zzj(Builder builder)
		{
			return builder.zzaVF;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int zzaVF>
		//    2    4:ireturn         
		}

		static boolean zzk(Builder builder)
		{
			return builder.zzaVH;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field boolean zzaVH>
		//    2    4:ireturn         
		}

		static List zzl(Builder builder)
		{
			return builder.zzaVJ;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field List zzaVJ>
		//    2    4:areturn         
		}

		static List zzm(Builder builder)
		{
			return builder.zzaVK;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field List zzaVK>
		//    2    4:areturn         
		}

		public Builder addFilteredDataQualityStandard(int i)
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

		public Builder aggregate(DataSource datasource, DataType datatype)
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

		public Builder aggregate(DataType datatype, DataType datatype1)
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

		public Builder bucketByActivitySegment(int i, TimeUnit timeunit)
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

		public Builder bucketByActivitySegment(int i, TimeUnit timeunit, DataSource datasource)
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

		public Builder bucketByActivityType(int i, TimeUnit timeunit)
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

		public Builder bucketByActivityType(int i, TimeUnit timeunit, DataSource datasource)
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

		public Builder bucketBySession(int i, TimeUnit timeunit)
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

		public Builder bucketByTime(int i, TimeUnit timeunit)
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
			return new DataReadRequest(this);
		//  103  211:new             #6   <Class DataReadRequest>
		//  104  214:dup             
		//  105  215:aload_0         
		//  106  216:aconst_null     
		//  107  217:invokespecial   #194 <Method void DataReadRequest(DataReadRequest$Builder, DataReadRequest$1)>
		//  108  220:areturn         
		}

		public Builder enableServerQueries()
		{
			zzaVH = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #55  <Field boolean zzaVH>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder read(DataSource datasource)
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

		public Builder read(DataType datatype)
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

		public Builder setLimit(int i)
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

		public Builder setTimeRange(long l, long l1, TimeUnit timeunit)
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

		public Builder()
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


	DataReadRequest(int i, List list, List list1, long l, long l1, 
			List list2, List list3, int j, long l2, DataSource datasource, int k, 
			boolean flag, boolean flag1, IBinder ibinder, List list4, List list5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #54  <Field int zzaiI>
		zzaSs = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field List zzaSs>
		zzaVw = list1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field List zzaVw>
		zzafe = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #60  <Field long zzafe>
		zzaSt = l1;
	//   14   25:aload_0         
	//   15   26:lload           6
	//   16   28:putfield        #62  <Field long zzaSt>
		zzaVB = list2;
	//   17   31:aload_0         
	//   18   32:aload           8
	//   19   34:putfield        #64  <Field List zzaVB>
		zzaVC = list3;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #66  <Field List zzaVC>
		zzaSw = j;
	//   23   43:aload_0         
	//   24   44:iload           10
	//   25   46:putfield        #68  <Field int zzaSw>
		zzaVD = l2;
	//   26   49:aload_0         
	//   27   50:lload           11
	//   28   52:putfield        #70  <Field long zzaVD>
		zzaVE = datasource;
	//   29   55:aload_0         
	//   30   56:aload           13
	//   31   58:putfield        #72  <Field DataSource zzaVE>
		zzaVF = k;
	//   32   61:aload_0         
	//   33   62:iload           14
	//   34   64:putfield        #74  <Field int zzaVF>
		zzaVG = flag;
	//   35   67:aload_0         
	//   36   68:iload           15
	//   37   70:putfield        #76  <Field boolean zzaVG>
		zzaVH = flag1;
	//   38   73:aload_0         
	//   39   74:iload           16
	//   40   76:putfield        #78  <Field boolean zzaVH>
		if(ibinder == null)
	//*  41   79:aload           17
	//*  42   81:ifnonnull       89
			list = null;
	//   43   84:aconst_null     
	//   44   85:astore_2        
		else
	//*  45   86:goto            95
			list = ((List) (com.google.android.gms.internal.zzaom.zza.zzcq(ibinder)));
	//   46   89:aload           17
	//   47   91:invokestatic    #84  <Method zzaom com.google.android.gms.internal.zzaom$zza.zzcq(IBinder)>
	//   48   94:astore_2        
		zzaVI = ((zzaom) (list));
	//   49   95:aload_0         
	//   50   96:aload_2         
	//   51   97:putfield        #86  <Field zzaom zzaVI>
		if(list4 == null)
	//*  52  100:aload           18
	//*  53  102:ifnonnull       113
			list4 = Collections.emptyList();
	//   54  105:invokestatic    #92  <Method List Collections.emptyList()>
	//   55  108:astore          18
	//*  56  110:goto            113
		zzaVJ = list4;
	//   57  113:aload_0         
	//   58  114:aload           18
	//   59  116:putfield        #94  <Field List zzaVJ>
		if(list5 == null)
	//*  60  119:aload           19
	//*  61  121:ifnonnull       132
			list5 = Collections.emptyList();
	//   62  124:invokestatic    #92  <Method List Collections.emptyList()>
	//   63  127:astore          19
	//*  64  129:goto            132
		zzaVK = list5;
	//   65  132:aload_0         
	//   66  133:aload           19
	//   67  135:putfield        #96  <Field List zzaVK>
	//   68  138:return          
	}

	private DataReadRequest(Builder builder)
	{
		this(com.google.android.gms.fitness.request.Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), Builder.zzj(builder), false, Builder.zzk(builder), ((zzaom) (null)), Builder.zzl(builder), Builder.zzm(builder));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #103 <Method List com.google.android.gms.fitness.request.DataReadRequest$Builder.zza(DataReadRequest$Builder)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #106 <Method List DataReadRequest$Builder.zzb(DataReadRequest$Builder)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #110 <Method long DataReadRequest$Builder.zzc(DataReadRequest$Builder)>
	//    7   13:aload_1         
	//    8   14:invokestatic    #113 <Method long DataReadRequest$Builder.zzd(DataReadRequest$Builder)>
	//    9   17:aload_1         
	//   10   18:invokestatic    #116 <Method List DataReadRequest$Builder.zze(DataReadRequest$Builder)>
	//   11   21:aload_1         
	//   12   22:invokestatic    #119 <Method List DataReadRequest$Builder.zzf(DataReadRequest$Builder)>
	//   13   25:aload_1         
	//   14   26:invokestatic    #123 <Method int DataReadRequest$Builder.zzg(DataReadRequest$Builder)>
	//   15   29:aload_1         
	//   16   30:invokestatic    #126 <Method long DataReadRequest$Builder.zzh(DataReadRequest$Builder)>
	//   17   33:aload_1         
	//   18   34:invokestatic    #130 <Method DataSource DataReadRequest$Builder.zzi(DataReadRequest$Builder)>
	//   19   37:aload_1         
	//   20   38:invokestatic    #133 <Method int DataReadRequest$Builder.zzj(DataReadRequest$Builder)>
	//   21   41:iconst_0        
	//   22   42:aload_1         
	//   23   43:invokestatic    #137 <Method boolean DataReadRequest$Builder.zzk(DataReadRequest$Builder)>
	//   24   46:aconst_null     
	//   25   47:aload_1         
	//   26   48:invokestatic    #140 <Method List DataReadRequest$Builder.zzl(DataReadRequest$Builder)>
	//   27   51:aload_1         
	//   28   52:invokestatic    #143 <Method List DataReadRequest$Builder.zzm(DataReadRequest$Builder)>
	//   29   55:invokespecial   #146 <Method void DataReadRequest(List, List, long, long, List, List, int, long, DataSource, int, boolean, boolean, zzaom, List, List)>
	//   30   58:return          
	}


	public DataReadRequest(DataReadRequest datareadrequest, zzaom zzaom1)
	{
		this(datareadrequest.zzaSs, datareadrequest.zzaVw, datareadrequest.zzafe, datareadrequest.zzaSt, datareadrequest.zzaVB, datareadrequest.zzaVC, datareadrequest.zzaSw, datareadrequest.zzaVD, datareadrequest.zzaVE, datareadrequest.zzaVF, datareadrequest.zzaVG, datareadrequest.zzaVH, zzaom1, datareadrequest.zzaVJ, datareadrequest.zzaVK);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #56  <Field List zzaSs>
	//    3    5:aload_1         
	//    4    6:getfield        #58  <Field List zzaVw>
	//    5    9:aload_1         
	//    6   10:getfield        #60  <Field long zzafe>
	//    7   13:aload_1         
	//    8   14:getfield        #62  <Field long zzaSt>
	//    9   17:aload_1         
	//   10   18:getfield        #64  <Field List zzaVB>
	//   11   21:aload_1         
	//   12   22:getfield        #66  <Field List zzaVC>
	//   13   25:aload_1         
	//   14   26:getfield        #68  <Field int zzaSw>
	//   15   29:aload_1         
	//   16   30:getfield        #70  <Field long zzaVD>
	//   17   33:aload_1         
	//   18   34:getfield        #72  <Field DataSource zzaVE>
	//   19   37:aload_1         
	//   20   38:getfield        #74  <Field int zzaVF>
	//   21   41:aload_1         
	//   22   42:getfield        #76  <Field boolean zzaVG>
	//   23   45:aload_1         
	//   24   46:getfield        #78  <Field boolean zzaVH>
	//   25   49:aload_2         
	//   26   50:aload_1         
	//   27   51:getfield        #94  <Field List zzaVJ>
	//   28   54:aload_1         
	//   29   55:getfield        #96  <Field List zzaVK>
	//   30   58:invokespecial   #146 <Method void DataReadRequest(List, List, long, long, List, List, int, long, DataSource, int, boolean, boolean, zzaom, List, List)>
	//   31   61:return          
	}

	public DataReadRequest(List list, List list1, long l, long l1, List list2, 
			List list3, int i, long l2, DataSource datasource, int j, boolean flag, 
			boolean flag1, zzaom zzaom1, List list4, List list5)
	{
		if(zzaom1 == null)
	//*   0    0:aload           16
	//*   1    2:ifnonnull       11
			zzaom1 = null;
	//    2    5:aconst_null     
	//    3    6:astore          16
		else
	//*   4    8:goto            20
			zzaom1 = ((zzaom) (zzaom1.asBinder()));
	//    5   11:aload           16
	//    6   13:invokeinterface #156 <Method IBinder zzaom.asBinder()>
	//    7   18:astore          16
		this(6, list, list1, l, l1, list2, list3, i, l2, datasource, j, flag, flag1, ((IBinder) (zzaom1)), list4, list5);
	//    8   20:aload_0         
	//    9   21:bipush          6
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:lload_3         
	//   13   26:lload           5
	//   14   28:aload           7
	//   15   30:aload           8
	//   16   32:iload           9
	//   17   34:lload           10
	//   18   36:aload           12
	//   19   38:iload           13
	//   20   40:iload           14
	//   21   42:iload           15
	//   22   44:aload           16
	//   23   46:aload           17
	//   24   48:aload           18
	//   25   50:invokespecial   #158 <Method void DataReadRequest(int, List, List, long, long, List, List, int, long, DataSource, int, boolean, boolean, IBinder, List, List)>
	//   26   53:return          
	}

	private boolean zzb(DataReadRequest datareadrequest)
	{
		return zzaSs.equals(((Object) (datareadrequest.zzaSs))) && zzaVw.equals(((Object) (datareadrequest.zzaVw))) && zzafe == datareadrequest.zzafe && zzaSt == datareadrequest.zzaSt && zzaSw == datareadrequest.zzaSw && zzaVC.equals(((Object) (datareadrequest.zzaVC))) && zzaVB.equals(((Object) (datareadrequest.zzaVB))) && zzaa.equal(((Object) (zzaVE)), ((Object) (datareadrequest.zzaVE))) && zzaVD == datareadrequest.zzaVD && zzaVH == datareadrequest.zzaVH && zzaVF == datareadrequest.zzaVF && zzaVG == datareadrequest.zzaVG && zzaa.equal(((Object) (zzaVI)), ((Object) (datareadrequest.zzaVI))) && zzaa.equal(((Object) (zzaVJ)), ((Object) (datareadrequest.zzaVJ))) && zzaa.equal(((Object) (zzaVK)), ((Object) (datareadrequest.zzaVK)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List zzaSs>
	//    2    4:aload_1         
	//    3    5:getfield        #56  <Field List zzaSs>
	//    4    8:invokeinterface #166 <Method boolean List.equals(Object)>
	//    5   13:ifeq            202
	//    6   16:aload_0         
	//    7   17:getfield        #58  <Field List zzaVw>
	//    8   20:aload_1         
	//    9   21:getfield        #58  <Field List zzaVw>
	//   10   24:invokeinterface #166 <Method boolean List.equals(Object)>
	//   11   29:ifeq            202
	//   12   32:aload_0         
	//   13   33:getfield        #60  <Field long zzafe>
	//   14   36:aload_1         
	//   15   37:getfield        #60  <Field long zzafe>
	//   16   40:lcmp            
	//   17   41:ifne            202
	//   18   44:aload_0         
	//   19   45:getfield        #62  <Field long zzaSt>
	//   20   48:aload_1         
	//   21   49:getfield        #62  <Field long zzaSt>
	//   22   52:lcmp            
	//   23   53:ifne            202
	//   24   56:aload_0         
	//   25   57:getfield        #68  <Field int zzaSw>
	//   26   60:aload_1         
	//   27   61:getfield        #68  <Field int zzaSw>
	//   28   64:icmpne          202
	//   29   67:aload_0         
	//   30   68:getfield        #66  <Field List zzaVC>
	//   31   71:aload_1         
	//   32   72:getfield        #66  <Field List zzaVC>
	//   33   75:invokeinterface #166 <Method boolean List.equals(Object)>
	//   34   80:ifeq            202
	//   35   83:aload_0         
	//   36   84:getfield        #64  <Field List zzaVB>
	//   37   87:aload_1         
	//   38   88:getfield        #64  <Field List zzaVB>
	//   39   91:invokeinterface #166 <Method boolean List.equals(Object)>
	//   40   96:ifeq            202
	//   41   99:aload_0         
	//   42  100:getfield        #72  <Field DataSource zzaVE>
	//   43  103:aload_1         
	//   44  104:getfield        #72  <Field DataSource zzaVE>
	//   45  107:invokestatic    #172 <Method boolean zzaa.equal(Object, Object)>
	//   46  110:ifeq            202
	//   47  113:aload_0         
	//   48  114:getfield        #70  <Field long zzaVD>
	//   49  117:aload_1         
	//   50  118:getfield        #70  <Field long zzaVD>
	//   51  121:lcmp            
	//   52  122:ifne            202
	//   53  125:aload_0         
	//   54  126:getfield        #78  <Field boolean zzaVH>
	//   55  129:aload_1         
	//   56  130:getfield        #78  <Field boolean zzaVH>
	//   57  133:icmpne          202
	//   58  136:aload_0         
	//   59  137:getfield        #74  <Field int zzaVF>
	//   60  140:aload_1         
	//   61  141:getfield        #74  <Field int zzaVF>
	//   62  144:icmpne          202
	//   63  147:aload_0         
	//   64  148:getfield        #76  <Field boolean zzaVG>
	//   65  151:aload_1         
	//   66  152:getfield        #76  <Field boolean zzaVG>
	//   67  155:icmpne          202
	//   68  158:aload_0         
	//   69  159:getfield        #86  <Field zzaom zzaVI>
	//   70  162:aload_1         
	//   71  163:getfield        #86  <Field zzaom zzaVI>
	//   72  166:invokestatic    #172 <Method boolean zzaa.equal(Object, Object)>
	//   73  169:ifeq            202
	//   74  172:aload_0         
	//   75  173:getfield        #94  <Field List zzaVJ>
	//   76  176:aload_1         
	//   77  177:getfield        #94  <Field List zzaVJ>
	//   78  180:invokestatic    #172 <Method boolean zzaa.equal(Object, Object)>
	//   79  183:ifeq            202
	//   80  186:aload_0         
	//   81  187:getfield        #96  <Field List zzaVK>
	//   82  190:aload_1         
	//   83  191:getfield        #96  <Field List zzaVK>
	//   84  194:invokestatic    #172 <Method boolean zzaa.equal(Object, Object)>
	//   85  197:ifeq            202
	//   86  200:iconst_1        
	//   87  201:ireturn         
	//   88  202:iconst_0        
	//   89  203:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataReadRequest) && zzb((DataReadRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataReadRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataReadRequest>
	//    9   17:invokespecial   #174 <Method boolean zzb(DataReadRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public DataSource getActivityDataSource()
	{
		return zzaVE;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DataSource zzaVE>
	//    2    4:areturn         
	}

	public List getAggregatedDataSources()
	{
		return zzaVC;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field List zzaVC>
	//    2    4:areturn         
	}

	public List getAggregatedDataTypes()
	{
		return zzaVB;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzaVB>
	//    2    4:areturn         
	}

	public long getBucketDuration(TimeUnit timeunit)
	{
		return timeunit.convert(zzaVD, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field long zzaVD>
	//    3    5:getstatic       #188 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #192 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public int getBucketType()
	{
		return zzaSw;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zzaSw>
	//    2    4:ireturn         
	}

	public IBinder getCallbackBinder()
	{
		if(zzaVI == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field zzaom zzaVI>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaVI.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #86  <Field zzaom zzaVI>
	//    7   13:invokeinterface #156 <Method IBinder zzaom.asBinder()>
	//    8   18:areturn         
	}

	public List getDataSources()
	{
		return zzaVw;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field List zzaVw>
	//    2    4:areturn         
	}

	public List getDataTypes()
	{
		return zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List zzaSs>
	//    2    4:areturn         
	}

	public long getEndTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSt, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field long zzaSt>
	//    3    5:getstatic       #188 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #192 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public List getFilteredDataQualityStandards()
	{
		return zzaVK;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field List zzaVK>
	//    2    4:areturn         
	}

	public int getLimit()
	{
		return zzaVF;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int zzaVF>
	//    2    4:ireturn         
	}

	public long getStartTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzafe, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field long zzafe>
	//    3    5:getstatic       #188 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #192 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(zzaSw), Long.valueOf(zzafe), Long.valueOf(zzaSt)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #68  <Field int zzaSw>
	//    6   10:invokestatic    #212 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #60  <Field long zzafe>
	//   12   20:invokestatic    #217 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #62  <Field long zzaSt>
	//   18   30:invokestatic    #217 <Method Long Long.valueOf(long)>
	//   19   33:aastore         
	//   20   34:invokestatic    #220 <Method int zzaa.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #224 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #225 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataReadRequest{");
	//    4    8:aload_1         
	//    5    9:ldc1            #227 <String "DataReadRequest{">
	//    6   11:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		if(!zzaSs.isEmpty())
	//*   8   15:aload_0         
	//*   9   16:getfield        #56  <Field List zzaSs>
	//*  10   19:invokeinterface #235 <Method boolean List.isEmpty()>
	//*  11   24:ifne            71
		{
			for(Iterator iterator = zzaSs.iterator(); iterator.hasNext(); stringbuilder.append(((DataType)iterator.next()).zzCk()).append(" "));
	//   12   27:aload_0         
	//   13   28:getfield        #56  <Field List zzaSs>
	//   14   31:invokeinterface #239 <Method Iterator List.iterator()>
	//   15   36:astore_2        
	//   16   37:aload_2         
	//   17   38:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//   18   43:ifeq            71
	//   19   46:aload_1         
	//   20   47:aload_2         
	//   21   48:invokeinterface #248 <Method Object Iterator.next()>
	//   22   53:checkcast       #250 <Class DataType>
	//   23   56:invokevirtual   #253 <Method String DataType.zzCk()>
	//   24   59:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   25   62:ldc1            #255 <String " ">
	//   26   64:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   27   67:pop             
		}
	//*  28   68:goto            37
		if(!zzaVw.isEmpty())
	//*  29   71:aload_0         
	//*  30   72:getfield        #58  <Field List zzaVw>
	//*  31   75:invokeinterface #235 <Method boolean List.isEmpty()>
	//*  32   80:ifne            127
		{
			for(Iterator iterator1 = zzaVw.iterator(); iterator1.hasNext(); stringbuilder.append(((DataSource)iterator1.next()).toDebugString()).append(" "));
	//   33   83:aload_0         
	//   34   84:getfield        #58  <Field List zzaVw>
	//   35   87:invokeinterface #239 <Method Iterator List.iterator()>
	//   36   92:astore_2        
	//   37   93:aload_2         
	//   38   94:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//   39   99:ifeq            127
	//   40  102:aload_1         
	//   41  103:aload_2         
	//   42  104:invokeinterface #248 <Method Object Iterator.next()>
	//   43  109:checkcast       #257 <Class DataSource>
	//   44  112:invokevirtual   #260 <Method String DataSource.toDebugString()>
	//   45  115:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   46  118:ldc1            #255 <String " ">
	//   47  120:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   48  123:pop             
		}
	//*  49  124:goto            93
		if(zzaSw != 0)
	//*  50  127:aload_0         
	//*  51  128:getfield        #68  <Field int zzaSw>
	//*  52  131:ifeq            190
		{
			stringbuilder.append("bucket by ").append(Bucket.zzgw(zzaSw));
	//   53  134:aload_1         
	//   54  135:ldc2            #262 <String "bucket by ">
	//   55  138:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   56  141:aload_0         
	//   57  142:getfield        #68  <Field int zzaSw>
	//   58  145:invokestatic    #268 <Method String Bucket.zzgw(int)>
	//   59  148:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   60  151:pop             
			if(zzaVD > 0L)
	//*  61  152:aload_0         
	//*  62  153:getfield        #70  <Field long zzaVD>
	//*  63  156:lconst_0        
	//*  64  157:lcmp            
	//*  65  158:ifle            182
				stringbuilder.append(" >").append(zzaVD).append("ms");
	//   66  161:aload_1         
	//   67  162:ldc2            #270 <String " >">
	//   68  165:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   69  168:aload_0         
	//   70  169:getfield        #70  <Field long zzaVD>
	//   71  172:invokevirtual   #273 <Method StringBuilder StringBuilder.append(long)>
	//   72  175:ldc2            #275 <String "ms">
	//   73  178:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   74  181:pop             
			stringbuilder.append(": ");
	//   75  182:aload_1         
	//   76  183:ldc2            #277 <String ": ">
	//   77  186:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   78  189:pop             
		}
		if(!zzaVB.isEmpty())
	//*  79  190:aload_0         
	//*  80  191:getfield        #64  <Field List zzaVB>
	//*  81  194:invokeinterface #235 <Method boolean List.isEmpty()>
	//*  82  199:ifne            246
		{
			for(Iterator iterator2 = zzaVB.iterator(); iterator2.hasNext(); stringbuilder.append(((DataType)iterator2.next()).zzCk()).append(" "));
	//   83  202:aload_0         
	//   84  203:getfield        #64  <Field List zzaVB>
	//   85  206:invokeinterface #239 <Method Iterator List.iterator()>
	//   86  211:astore_2        
	//   87  212:aload_2         
	//   88  213:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//   89  218:ifeq            246
	//   90  221:aload_1         
	//   91  222:aload_2         
	//   92  223:invokeinterface #248 <Method Object Iterator.next()>
	//   93  228:checkcast       #250 <Class DataType>
	//   94  231:invokevirtual   #253 <Method String DataType.zzCk()>
	//   95  234:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   96  237:ldc1            #255 <String " ">
	//   97  239:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   98  242:pop             
		}
	//*  99  243:goto            212
		if(!zzaVC.isEmpty())
	//* 100  246:aload_0         
	//* 101  247:getfield        #66  <Field List zzaVC>
	//* 102  250:invokeinterface #235 <Method boolean List.isEmpty()>
	//* 103  255:ifne            302
		{
			for(Iterator iterator3 = zzaVC.iterator(); iterator3.hasNext(); stringbuilder.append(((DataSource)iterator3.next()).toDebugString()).append(" "));
	//  104  258:aload_0         
	//  105  259:getfield        #66  <Field List zzaVC>
	//  106  262:invokeinterface #239 <Method Iterator List.iterator()>
	//  107  267:astore_2        
	//  108  268:aload_2         
	//  109  269:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//  110  274:ifeq            302
	//  111  277:aload_1         
	//  112  278:aload_2         
	//  113  279:invokeinterface #248 <Method Object Iterator.next()>
	//  114  284:checkcast       #257 <Class DataSource>
	//  115  287:invokevirtual   #260 <Method String DataSource.toDebugString()>
	//  116  290:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  117  293:ldc1            #255 <String " ">
	//  118  295:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  119  298:pop             
		}
	//* 120  299:goto            268
		stringbuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[] {
			Long.valueOf(zzafe), Long.valueOf(zzafe), Long.valueOf(zzaSt), Long.valueOf(zzaSt)
		}));
	//  121  302:aload_1         
	//  122  303:ldc2            #279 <String "(%tF %tT - %tF %tT)">
	//  123  306:iconst_4        
	//  124  307:anewarray       Object[]
	//  125  310:dup             
	//  126  311:iconst_0        
	//  127  312:aload_0         
	//  128  313:getfield        #60  <Field long zzafe>
	//  129  316:invokestatic    #217 <Method Long Long.valueOf(long)>
	//  130  319:aastore         
	//  131  320:dup             
	//  132  321:iconst_1        
	//  133  322:aload_0         
	//  134  323:getfield        #60  <Field long zzafe>
	//  135  326:invokestatic    #217 <Method Long Long.valueOf(long)>
	//  136  329:aastore         
	//  137  330:dup             
	//  138  331:iconst_2        
	//  139  332:aload_0         
	//  140  333:getfield        #62  <Field long zzaSt>
	//  141  336:invokestatic    #217 <Method Long Long.valueOf(long)>
	//  142  339:aastore         
	//  143  340:dup             
	//  144  341:iconst_3        
	//  145  342:aload_0         
	//  146  343:getfield        #62  <Field long zzaSt>
	//  147  346:invokestatic    #217 <Method Long Long.valueOf(long)>
	//  148  349:aastore         
	//  149  350:invokestatic    #285 <Method String String.format(String, Object[])>
	//  150  353:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  151  356:pop             
		if(zzaVE != null)
	//* 152  357:aload_0         
	//* 153  358:getfield        #72  <Field DataSource zzaVE>
	//* 154  361:ifnull          382
			stringbuilder.append("activities: ").append(zzaVE.toDebugString());
	//  155  364:aload_1         
	//  156  365:ldc2            #287 <String "activities: ">
	//  157  368:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  158  371:aload_0         
	//  159  372:getfield        #72  <Field DataSource zzaVE>
	//  160  375:invokevirtual   #260 <Method String DataSource.toDebugString()>
	//  161  378:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  162  381:pop             
		if(!zzaVK.isEmpty())
	//* 163  382:aload_0         
	//* 164  383:getfield        #96  <Field List zzaVK>
	//* 165  386:invokeinterface #235 <Method boolean List.isEmpty()>
	//* 166  391:ifne            449
		{
			stringbuilder.append("quality: ");
	//  167  394:aload_1         
	//  168  395:ldc2            #289 <String "quality: ">
	//  169  398:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  170  401:pop             
			for(Iterator iterator4 = zzaVK.iterator(); iterator4.hasNext(); stringbuilder.append(DataSource.zzgD(((Integer)iterator4.next()).intValue())).append(" "));
	//  171  402:aload_0         
	//  172  403:getfield        #96  <Field List zzaVK>
	//  173  406:invokeinterface #239 <Method Iterator List.iterator()>
	//  174  411:astore_2        
	//  175  412:aload_2         
	//  176  413:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//  177  418:ifeq            449
	//  178  421:aload_1         
	//  179  422:aload_2         
	//  180  423:invokeinterface #248 <Method Object Iterator.next()>
	//  181  428:checkcast       #208 <Class Integer>
	//  182  431:invokevirtual   #292 <Method int Integer.intValue()>
	//  183  434:invokestatic    #295 <Method String DataSource.zzgD(int)>
	//  184  437:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  185  440:ldc1            #255 <String " ">
	//  186  442:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  187  445:pop             
		}
	//* 188  446:goto            412
		if(zzaVH)
	//* 189  449:aload_0         
	//* 190  450:getfield        #78  <Field boolean zzaVH>
	//* 191  453:ifeq            464
			stringbuilder.append(" +server");
	//  192  456:aload_1         
	//  193  457:ldc2            #297 <String " +server">
	//  194  460:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  195  463:pop             
		stringbuilder.append("}");
	//  196  464:aload_1         
	//  197  465:ldc2            #299 <String "}">
	//  198  468:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//  199  471:pop             
		return stringbuilder.toString();
	//  200  472:aload_1         
	//  201  473:invokevirtual   #301 <Method String StringBuilder.toString()>
	//  202  476:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzi.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #306 <Method void com.google.android.gms.fitness.request.zzi.zza(DataReadRequest, Parcel, int)>
	//    4    6:return          
	}

	public long zzAm()
	{
		return zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long zzaSt>
	//    2    4:lreturn         
	}

	public boolean zzCS()
	{
		return zzaVH;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean zzaVH>
	//    2    4:ireturn         
	}

	public boolean zzCT()
	{
		return zzaVG;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean zzaVG>
	//    2    4:ireturn         
	}

	public long zzCU()
	{
		return zzaVD;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long zzaVD>
	//    2    4:lreturn         
	}

	public List zzCV()
	{
		return zzaVJ;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field List zzaVJ>
	//    2    4:areturn         
	}

	public long zzqn()
	{
		return zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field long zzafe>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	public static final int NO_LIMIT = 0;
	private final List zzaSs;
	private final long zzaSt;
	private final int zzaSw;
	private final List zzaVB;
	private final List zzaVC;
	private final long zzaVD;
	private final DataSource zzaVE;
	private final int zzaVF;
	private final boolean zzaVG;
	private final boolean zzaVH;
	private final zzaom zzaVI;
	private final List zzaVJ;
	private final List zzaVK;
	private final List zzaVw;
	private final long zzafe;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #44  <Class zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void zzi()>
	//    3    7:putstatic       #49  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
