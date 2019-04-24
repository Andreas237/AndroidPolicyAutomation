// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.internal.zzant;
import com.google.android.gms.internal.zzapf;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzaz

public class SessionInsertRequest extends zza
{
	public static class Builder
	{

		private void zzDj()
		{
			for(Iterator iterator = zzaWA.iterator(); iterator.hasNext();)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field List zzaWA>
		//*   2    4:invokeinterface #37  <Method Iterator List.iterator()>
		//*   3    9:astore_1        
		//*   4   10:aload_1         
		//*   5   11:invokeinterface #43  <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            65
			{
				Iterator iterator2 = ((DataSet)iterator.next()).getDataPoints().iterator();
		//    7   19:aload_1         
		//    8   20:invokeinterface #47  <Method Object Iterator.next()>
		//    9   25:checkcast       #49  <Class DataSet>
		//   10   28:invokevirtual   #53  <Method List DataSet.getDataPoints()>
		//   11   31:invokeinterface #37  <Method Iterator List.iterator()>
		//   12   36:astore_2        
				while(iterator2.hasNext()) 
		//*  13   37:aload_2         
		//*  14   38:invokeinterface #43  <Method boolean Iterator.hasNext()>
		//*  15   43:ifeq            62
					zzg((DataPoint)iterator2.next());
		//   16   46:aload_0         
		//   17   47:aload_2         
		//   18   48:invokeinterface #47  <Method Object Iterator.next()>
		//   19   53:checkcast       #55  <Class DataPoint>
		//   20   56:invokespecial   #59  <Method void zzg(DataPoint)>
			}

		//*  21   59:goto            37
		//*  22   62:goto            10
			for(Iterator iterator1 = zzaWB.iterator(); iterator1.hasNext(); zzg((DataPoint)iterator1.next()));
		//   23   65:aload_0         
		//   24   66:getfield        #27  <Field List zzaWB>
		//   25   69:invokeinterface #37  <Method Iterator List.iterator()>
		//   26   74:astore_1        
		//   27   75:aload_1         
		//   28   76:invokeinterface #43  <Method boolean Iterator.hasNext()>
		//   29   81:ifeq            100
		//   30   84:aload_0         
		//   31   85:aload_1         
		//   32   86:invokeinterface #47  <Method Object Iterator.next()>
		//   33   91:checkcast       #55  <Class DataPoint>
		//   34   94:invokespecial   #59  <Method void zzg(DataPoint)>
		//*  35   97:goto            75
		//   36  100:return          
		}

		static Session zza(Builder builder)
		{
			return builder.zzaWz;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Session zzaWz>
		//    2    4:areturn         
		}

		static List zzb(Builder builder)
		{
			return builder.zzaWA;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List zzaWA>
		//    2    4:areturn         
		}

		static List zzc(Builder builder)
		{
			return builder.zzaWB;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field List zzaWB>
		//    2    4:areturn         
		}

		private void zzg(DataPoint datapoint)
		{
			zzi(datapoint);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #69  <Method void zzi(DataPoint)>
			zzh(datapoint);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #72  <Method void zzh(DataPoint)>
		//    6   10:return          
		}

		private void zzh(DataPoint datapoint)
		{
			long l2 = zzaWz.getStartTime(TimeUnit.NANOSECONDS);
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Session zzaWz>
		//    2    4:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//    3    7:invokevirtual   #84  <Method long Session.getStartTime(TimeUnit)>
		//    4   10:lstore          6
			long l3 = zzaWz.getEndTime(TimeUnit.NANOSECONDS);
		//    5   12:aload_0         
		//    6   13:getfield        #63  <Field Session zzaWz>
		//    7   16:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//    8   19:invokevirtual   #87  <Method long Session.getEndTime(TimeUnit)>
		//    9   22:lstore          8
			long l4 = datapoint.getStartTime(TimeUnit.NANOSECONDS);
		//   10   24:aload_1         
		//   11   25:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   12   28:invokevirtual   #88  <Method long DataPoint.getStartTime(TimeUnit)>
		//   13   31:lstore          10
			long l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
		//   14   33:aload_1         
		//   15   34:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   16   37:invokevirtual   #89  <Method long DataPoint.getEndTime(TimeUnit)>
		//   17   40:lstore          4
			if(l4 != 0L && l1 != 0L)
		//*  18   42:lload           10
		//*  19   44:lconst_0        
		//*  20   45:lcmp            
		//*  21   46:ifeq            201
		//*  22   49:lload           4
		//*  23   51:lconst_0        
		//*  24   52:lcmp            
		//*  25   53:ifeq            201
			{
				TimeUnit timeunit = TimeUnit.MILLISECONDS;
		//   26   56:getstatic       #92  <Field TimeUnit TimeUnit.MILLISECONDS>
		//   27   59:astore          13
				long l = l1;
		//   28   61:lload           4
		//   29   63:lstore_2        
				if(l1 > l3)
		//*  30   64:lload           4
		//*  31   66:lload           8
		//*  32   68:lcmp            
		//*  33   69:ifle            83
					l = zzant.zza(l1, TimeUnit.NANOSECONDS, timeunit);
		//   34   72:lload           4
		//   35   74:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   36   77:aload           13
		//   37   79:invokestatic    #97  <Method long zzant.zza(long, TimeUnit, TimeUnit)>
		//   38   82:lstore_2        
				boolean flag;
				if(l4 >= l2 && l <= l3)
		//*  39   83:lload           10
		//*  40   85:lload           6
		//*  41   87:lcmp            
		//*  42   88:iflt            104
		//*  43   91:lload_2         
		//*  44   92:lload           8
		//*  45   94:lcmp            
		//*  46   95:ifgt            104
					flag = true;
		//   47   98:iconst_1        
		//   48   99:istore          12
				else
		//*  49  101:goto            107
					flag = false;
		//   50  104:iconst_0        
		//   51  105:istore          12
				zzac.zza(flag, "Data point %s has start and end times outside session interval [%d, %d]", new Object[] {
					datapoint, Long.valueOf(l2), Long.valueOf(l3)
				});
		//   52  107:iload           12
		//   53  109:ldc1            #99  <String "Data point %s has start and end times outside session interval [%d, %d]">
		//   54  111:iconst_3        
		//   55  112:anewarray       Object[]
		//   56  115:dup             
		//   57  116:iconst_0        
		//   58  117:aload_1         
		//   59  118:aastore         
		//   60  119:dup             
		//   61  120:iconst_1        
		//   62  121:lload           6
		//   63  123:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   64  126:aastore         
		//   65  127:dup             
		//   66  128:iconst_2        
		//   67  129:lload           8
		//   68  131:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   69  134:aastore         
		//   70  135:invokestatic    #110 <Method void zzac.zza(boolean, String, Object[])>
				if(l != datapoint.getEndTime(TimeUnit.NANOSECONDS))
		//*  71  138:lload_2         
		//*  72  139:aload_1         
		//*  73  140:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//*  74  143:invokevirtual   #89  <Method long DataPoint.getEndTime(TimeUnit)>
		//*  75  146:lcmp            
		//*  76  147:ifeq            201
				{
					Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
						Long.valueOf(datapoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
					}));
		//   77  150:ldc1            #112 <String "Fitness">
		//   78  152:ldc1            #114 <String "Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time">
		//   79  154:iconst_3        
		//   80  155:anewarray       Object[]
		//   81  158:dup             
		//   82  159:iconst_0        
		//   83  160:aload_1         
		//   84  161:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   85  164:invokevirtual   #89  <Method long DataPoint.getEndTime(TimeUnit)>
		//   86  167:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   87  170:aastore         
		//   88  171:dup             
		//   89  172:iconst_1        
		//   90  173:lload_2         
		//   91  174:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   92  177:aastore         
		//   93  178:dup             
		//   94  179:iconst_2        
		//   95  180:aload           13
		//   96  182:aastore         
		//   97  183:invokestatic    #120 <Method String String.format(String, Object[])>
		//   98  186:invokestatic    #126 <Method int Log.w(String, String)>
		//   99  189:pop             
					datapoint.setTimeInterval(l4, l, TimeUnit.NANOSECONDS);
		//  100  190:aload_1         
		//  101  191:lload           10
		//  102  193:lload_2         
		//  103  194:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//  104  197:invokevirtual   #130 <Method DataPoint DataPoint.setTimeInterval(long, long, TimeUnit)>
		//  105  200:pop             
				}
			}
		//  106  201:return          
		}

		private void zzi(DataPoint datapoint)
		{
label0:
			{
				long l;
				long l2;
				long l3;
				TimeUnit timeunit;
label1:
				{
					l2 = zzaWz.getStartTime(TimeUnit.NANOSECONDS);
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Session zzaWz>
		//    2    4:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//    3    7:invokevirtual   #84  <Method long Session.getStartTime(TimeUnit)>
		//    4   10:lstore          6
					l3 = zzaWz.getEndTime(TimeUnit.NANOSECONDS);
		//    5   12:aload_0         
		//    6   13:getfield        #63  <Field Session zzaWz>
		//    7   16:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//    8   19:invokevirtual   #87  <Method long Session.getEndTime(TimeUnit)>
		//    9   22:lstore          8
					long l1 = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
		//   10   24:aload_1         
		//   11   25:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   12   28:invokevirtual   #133 <Method long DataPoint.getTimestamp(TimeUnit)>
		//   13   31:lstore          4
					if(l1 == 0L)
						break label0;
		//   14   33:lload           4
		//   15   35:lconst_0        
		//   16   36:lcmp            
		//   17   37:ifeq            190
					timeunit = TimeUnit.MILLISECONDS;
		//   18   40:getstatic       #92  <Field TimeUnit TimeUnit.MILLISECONDS>
		//   19   43:astore          11
					if(l1 >= l2)
		//*  20   45:lload           4
		//*  21   47:lload           6
		//*  22   49:lcmp            
		//*  23   50:iflt            64
					{
						l = l1;
		//   24   53:lload           4
		//   25   55:lstore_2        
						if(l1 <= l3)
							break label1;
		//   26   56:lload           4
		//   27   58:lload           8
		//   28   60:lcmp            
		//   29   61:ifle            75
					}
					l = zzant.zza(l1, TimeUnit.NANOSECONDS, timeunit);
		//   30   64:lload           4
		//   31   66:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   32   69:aload           11
		//   33   71:invokestatic    #97  <Method long zzant.zza(long, TimeUnit, TimeUnit)>
		//   34   74:lstore_2        
				}
				boolean flag;
				if(l >= l2 && l <= l3)
		//*  35   75:lload_2         
		//*  36   76:lload           6
		//*  37   78:lcmp            
		//*  38   79:iflt            95
		//*  39   82:lload_2         
		//*  40   83:lload           8
		//*  41   85:lcmp            
		//*  42   86:ifgt            95
					flag = true;
		//   43   89:iconst_1        
		//   44   90:istore          10
				else
		//*  45   92:goto            98
					flag = false;
		//   46   95:iconst_0        
		//   47   96:istore          10
				zzac.zza(flag, "Data point %s has time stamp outside session interval [%d, %d]", new Object[] {
					datapoint, Long.valueOf(l2), Long.valueOf(l3)
				});
		//   48   98:iload           10
		//   49  100:ldc1            #135 <String "Data point %s has time stamp outside session interval [%d, %d]">
		//   50  102:iconst_3        
		//   51  103:anewarray       Object[]
		//   52  106:dup             
		//   53  107:iconst_0        
		//   54  108:aload_1         
		//   55  109:aastore         
		//   56  110:dup             
		//   57  111:iconst_1        
		//   58  112:lload           6
		//   59  114:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   60  117:aastore         
		//   61  118:dup             
		//   62  119:iconst_2        
		//   63  120:lload           8
		//   64  122:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   65  125:aastore         
		//   66  126:invokestatic    #110 <Method void zzac.zza(boolean, String, Object[])>
				if(datapoint.getTimestamp(TimeUnit.NANOSECONDS) != l)
		//*  67  129:aload_1         
		//*  68  130:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//*  69  133:invokevirtual   #133 <Method long DataPoint.getTimestamp(TimeUnit)>
		//*  70  136:lload_2         
		//*  71  137:lcmp            
		//*  72  138:ifeq            190
				{
					Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
						Long.valueOf(datapoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
					}));
		//   73  141:ldc1            #112 <String "Fitness">
		//   74  143:ldc1            #137 <String "Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time">
		//   75  145:iconst_3        
		//   76  146:anewarray       Object[]
		//   77  149:dup             
		//   78  150:iconst_0        
		//   79  151:aload_1         
		//   80  152:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   81  155:invokevirtual   #133 <Method long DataPoint.getTimestamp(TimeUnit)>
		//   82  158:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   83  161:aastore         
		//   84  162:dup             
		//   85  163:iconst_1        
		//   86  164:lload_2         
		//   87  165:invokestatic    #105 <Method Long Long.valueOf(long)>
		//   88  168:aastore         
		//   89  169:dup             
		//   90  170:iconst_2        
		//   91  171:aload           11
		//   92  173:aastore         
		//   93  174:invokestatic    #120 <Method String String.format(String, Object[])>
		//   94  177:invokestatic    #126 <Method int Log.w(String, String)>
		//   95  180:pop             
					datapoint.setTimestamp(l, TimeUnit.NANOSECONDS);
		//   96  181:aload_1         
		//   97  182:lload_2         
		//   98  183:getstatic       #78  <Field TimeUnit TimeUnit.NANOSECONDS>
		//   99  186:invokevirtual   #141 <Method DataPoint DataPoint.setTimestamp(long, TimeUnit)>
		//  100  189:pop             
				}
			}
		//  101  190:return          
		}

		public Builder addAggregateDataPoint(DataPoint datapoint)
		{
			boolean flag;
			if(datapoint != null)
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
			zzac.zzb(flag, "Must specify a valid aggregate data point.");
		//    7   11:iload_2         
		//    8   12:ldc1            #145 <String "Must specify a valid aggregate data point.">
		//    9   14:invokestatic    #148 <Method void zzac.zzb(boolean, Object)>
			com.google.android.gms.fitness.data.DataSource datasource = datapoint.getDataSource();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #152 <Method com.google.android.gms.fitness.data.DataSource DataPoint.getDataSource()>
		//   12   21:astore_3        
			if(!zzaWC.contains(((Object) (datasource))))
		//*  13   22:aload_0         
		//*  14   23:getfield        #29  <Field List zzaWC>
		//*  15   26:aload_3         
		//*  16   27:invokeinterface #156 <Method boolean List.contains(Object)>
		//*  17   32:ifne            40
				flag = true;
		//   18   35:iconst_1        
		//   19   36:istore_2        
			else
		//*  20   37:goto            42
				flag = false;
		//   21   40:iconst_0        
		//   22   41:istore_2        
			zzac.zza(flag, "Data set/Aggregate data point for this data source %s is already added.", new Object[] {
				datasource
			});
		//   23   42:iload_2         
		//   24   43:ldc1            #158 <String "Data set/Aggregate data point for this data source %s is already added.">
		//   25   45:iconst_1        
		//   26   46:anewarray       Object[]
		//   27   49:dup             
		//   28   50:iconst_0        
		//   29   51:aload_3         
		//   30   52:aastore         
		//   31   53:invokestatic    #110 <Method void zzac.zza(boolean, String, Object[])>
			DataSet.zze(datapoint);
		//   32   56:aload_1         
		//   33   57:invokestatic    #161 <Method void DataSet.zze(DataPoint)>
			zzaWC.add(((Object) (datasource)));
		//   34   60:aload_0         
		//   35   61:getfield        #29  <Field List zzaWC>
		//   36   64:aload_3         
		//   37   65:invokeinterface #164 <Method boolean List.add(Object)>
		//   38   70:pop             
			zzaWB.add(((Object) (datapoint)));
		//   39   71:aload_0         
		//   40   72:getfield        #27  <Field List zzaWB>
		//   41   75:aload_1         
		//   42   76:invokeinterface #164 <Method boolean List.add(Object)>
		//   43   81:pop             
			return this;
		//   44   82:aload_0         
		//   45   83:areturn         
		}

		public Builder addDataSet(DataSet dataset)
		{
			boolean flag;
			if(dataset != null)
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
			zzac.zzb(flag, "Must specify a valid data set.");
		//    7   11:iload_2         
		//    8   12:ldc1            #168 <String "Must specify a valid data set.">
		//    9   14:invokestatic    #148 <Method void zzac.zzb(boolean, Object)>
			com.google.android.gms.fitness.data.DataSource datasource = dataset.getDataSource();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #169 <Method com.google.android.gms.fitness.data.DataSource DataSet.getDataSource()>
		//   12   21:astore_3        
			if(!zzaWC.contains(((Object) (datasource))))
		//*  13   22:aload_0         
		//*  14   23:getfield        #29  <Field List zzaWC>
		//*  15   26:aload_3         
		//*  16   27:invokeinterface #156 <Method boolean List.contains(Object)>
		//*  17   32:ifne            40
				flag = true;
		//   18   35:iconst_1        
		//   19   36:istore_2        
			else
		//*  20   37:goto            42
				flag = false;
		//   21   40:iconst_0        
		//   22   41:istore_2        
			zzac.zza(flag, "Data set for this data source %s is already added.", new Object[] {
				datasource
			});
		//   23   42:iload_2         
		//   24   43:ldc1            #171 <String "Data set for this data source %s is already added.">
		//   25   45:iconst_1        
		//   26   46:anewarray       Object[]
		//   27   49:dup             
		//   28   50:iconst_0        
		//   29   51:aload_3         
		//   30   52:aastore         
		//   31   53:invokestatic    #110 <Method void zzac.zza(boolean, String, Object[])>
			if(!dataset.getDataPoints().isEmpty())
		//*  32   56:aload_1         
		//*  33   57:invokevirtual   #53  <Method List DataSet.getDataPoints()>
		//*  34   60:invokeinterface #174 <Method boolean List.isEmpty()>
		//*  35   65:ifne            73
				flag = true;
		//   36   68:iconst_1        
		//   37   69:istore_2        
			else
		//*  38   70:goto            75
				flag = false;
		//   39   73:iconst_0        
		//   40   74:istore_2        
			zzac.zzb(flag, "No data points specified in the input data set.");
		//   41   75:iload_2         
		//   42   76:ldc1            #176 <String "No data points specified in the input data set.">
		//   43   78:invokestatic    #148 <Method void zzac.zzb(boolean, Object)>
			zzaWC.add(((Object) (datasource)));
		//   44   81:aload_0         
		//   45   82:getfield        #29  <Field List zzaWC>
		//   46   85:aload_3         
		//   47   86:invokeinterface #164 <Method boolean List.add(Object)>
		//   48   91:pop             
			zzaWA.add(((Object) (dataset)));
		//   49   92:aload_0         
		//   50   93:getfield        #25  <Field List zzaWA>
		//   51   96:aload_1         
		//   52   97:invokeinterface #164 <Method boolean List.add(Object)>
		//   53  102:pop             
			return this;
		//   54  103:aload_0         
		//   55  104:areturn         
		}

		public SessionInsertRequest build()
		{
			boolean flag;
			if(zzaWz != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field Session zzaWz>
		//*   2    4:ifnull          12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			zzac.zza(flag, "Must specify a valid session.");
		//    8   14:iload_1         
		//    9   15:ldc1            #180 <String "Must specify a valid session.">
		//   10   17:invokestatic    #182 <Method void zzac.zza(boolean, Object)>
			if(zzaWz.getEndTime(TimeUnit.MILLISECONDS) != 0L)
		//*  11   20:aload_0         
		//*  12   21:getfield        #63  <Field Session zzaWz>
		//*  13   24:getstatic       #92  <Field TimeUnit TimeUnit.MILLISECONDS>
		//*  14   27:invokevirtual   #87  <Method long Session.getEndTime(TimeUnit)>
		//*  15   30:lconst_0        
		//*  16   31:lcmp            
		//*  17   32:ifeq            40
				flag = true;
		//   18   35:iconst_1        
		//   19   36:istore_1        
			else
		//*  20   37:goto            42
				flag = false;
		//   21   40:iconst_0        
		//   22   41:istore_1        
			zzac.zza(flag, "Must specify a valid end time, cannot insert a continuing session.");
		//   23   42:iload_1         
		//   24   43:ldc1            #184 <String "Must specify a valid end time, cannot insert a continuing session.">
		//   25   45:invokestatic    #182 <Method void zzac.zza(boolean, Object)>
			zzDj();
		//   26   48:aload_0         
		//   27   49:invokespecial   #186 <Method void zzDj()>
			return new SessionInsertRequest(this);
		//   28   52:new             #6   <Class SessionInsertRequest>
		//   29   55:dup             
		//   30   56:aload_0         
		//   31   57:aconst_null     
		//   32   58:invokespecial   #189 <Method void SessionInsertRequest(SessionInsertRequest$Builder, SessionInsertRequest$1)>
		//   33   61:areturn         
		}

		public Builder setSession(Session session)
		{
			zzaWz = session;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #63  <Field Session zzaWz>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private List zzaWA;
		private List zzaWB;
		private List zzaWC;
		private Session zzaWz;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zzaWA = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #23  <Method void ArrayList()>
		//    6   12:putfield        #25  <Field List zzaWA>
			zzaWB = ((List) (new ArrayList()));
		//    7   15:aload_0         
		//    8   16:new             #22  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #23  <Method void ArrayList()>
		//   11   23:putfield        #27  <Field List zzaWB>
			zzaWC = ((List) (new ArrayList()));
		//   12   26:aload_0         
		//   13   27:new             #22  <Class ArrayList>
		//   14   30:dup             
		//   15   31:invokespecial   #23  <Method void ArrayList()>
		//   16   34:putfield        #29  <Field List zzaWC>
		//   17   37:return          
		}
	}


	SessionInsertRequest(int i, Session session, List list, List list1, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int versionCode>
		zzaWz = session;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field Session zzaWz>
		zzaWA = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #47  <Field List zzaWA>
		zzaWB = Collections.unmodifiableList(list1);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   15   28:putfield        #49  <Field List zzaWB>
		zzaWh = com.google.android.gms.internal.zzapf.zza.zzcJ(ibinder);
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:invokestatic    #55  <Method zzapf com.google.android.gms.internal.zzapf$zza.zzcJ(IBinder)>
	//   19   37:putfield        #57  <Field zzapf zzaWh>
	//   20   40:return          
	}

	public SessionInsertRequest(Session session, List list, List list1, zzapf zzapf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		versionCode = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #37  <Field int versionCode>
		zzaWz = session;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field Session zzaWz>
		zzaWA = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #47  <Field List zzaWA>
		zzaWB = Collections.unmodifiableList(list1);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   15   27:putfield        #49  <Field List zzaWB>
		zzaWh = zzapf1;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #57  <Field zzapf zzaWh>
	//   19   36:return          
	}

	private SessionInsertRequest(Builder builder)
	{
		this(com.google.android.gms.fitness.request.Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), ((zzapf) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #66  <Method Session com.google.android.gms.fitness.request.SessionInsertRequest$Builder.zza(SessionInsertRequest$Builder)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #70  <Method List SessionInsertRequest$Builder.zzb(SessionInsertRequest$Builder)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #73  <Method List SessionInsertRequest$Builder.zzc(SessionInsertRequest$Builder)>
	//    7   13:aconst_null     
	//    8   14:invokespecial   #75  <Method void SessionInsertRequest(Session, List, List, zzapf)>
	//    9   17:return          
	}


	public SessionInsertRequest(SessionInsertRequest sessioninsertrequest, zzapf zzapf1)
	{
		this(sessioninsertrequest.zzaWz, sessioninsertrequest.zzaWA, sessioninsertrequest.zzaWB, zzapf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #39  <Field Session zzaWz>
	//    3    5:aload_1         
	//    4    6:getfield        #47  <Field List zzaWA>
	//    5    9:aload_1         
	//    6   10:getfield        #49  <Field List zzaWB>
	//    7   13:aload_2         
	//    8   14:invokespecial   #75  <Method void SessionInsertRequest(Session, List, List, zzapf)>
	//    9   17:return          
	}

	private boolean zzb(SessionInsertRequest sessioninsertrequest)
	{
		return zzaa.equal(((Object) (zzaWz)), ((Object) (sessioninsertrequest.zzaWz))) && zzaa.equal(((Object) (zzaWA)), ((Object) (sessioninsertrequest.zzaWA))) && zzaa.equal(((Object) (zzaWB)), ((Object) (sessioninsertrequest.zzaWB)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Session zzaWz>
	//    2    4:aload_1         
	//    3    5:getfield        #39  <Field Session zzaWz>
	//    4    8:invokestatic    #86  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            44
	//    6   14:aload_0         
	//    7   15:getfield        #47  <Field List zzaWA>
	//    8   18:aload_1         
	//    9   19:getfield        #47  <Field List zzaWA>
	//   10   22:invokestatic    #86  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            44
	//   12   28:aload_0         
	//   13   29:getfield        #49  <Field List zzaWB>
	//   14   32:aload_1         
	//   15   33:getfield        #49  <Field List zzaWB>
	//   16   36:invokestatic    #86  <Method boolean zzaa.equal(Object, Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof SessionInsertRequest) && zzb((SessionInsertRequest)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class SessionInsertRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class SessionInsertRequest>
	//    9   17:invokespecial   #90  <Method boolean zzb(SessionInsertRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getAggregateDataPoints()
	{
		return zzaWB;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List zzaWB>
	//    2    4:areturn         
	}

	public IBinder getCallbackBinder()
	{
		if(zzaWh == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field zzapf zzaWh>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaWh.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field zzapf zzaWh>
	//    7   13:invokeinterface #100 <Method IBinder zzapf.asBinder()>
	//    8   18:areturn         
	}

	public List getDataSets()
	{
		return zzaWA;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List zzaWA>
	//    2    4:areturn         
	}

	public Session getSession()
	{
		return zzaWz;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Session zzaWz>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaWz, zzaWA, zzaWB
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #39  <Field Session zzaWz>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #47  <Field List zzaWA>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #49  <Field List zzaWB>
	//   16   24:aastore         
	//   17   25:invokestatic    #112 <Method int zzaa.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("session", ((Object) (zzaWz))).zzg("dataSets", ((Object) (zzaWA))).zzg("aggregateDataPoints", ((Object) (zzaWB))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #118 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #120 <String "session">
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field Session zzaWz>
	//    5   10:invokevirtual   #126 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #128 <String "dataSets">
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field List zzaWA>
	//    9   19:invokevirtual   #126 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #130 <String "aggregateDataPoints">
	//   11   24:aload_0         
	//   12   25:getfield        #49  <Field List zzaWB>
	//   13   28:invokevirtual   #126 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   31:invokevirtual   #132 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   15   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzaz.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #137 <Method void com.google.android.gms.fitness.request.zzaz.zza(SessionInsertRequest, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaz();
	private final int versionCode;
	private final List zzaWA;
	private final List zzaWB;
	private final zzapf zzaWh;
	private final Session zzaWz;

	static 
	{
	//    0    0:new             #27  <Class zzaz>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzaz()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
