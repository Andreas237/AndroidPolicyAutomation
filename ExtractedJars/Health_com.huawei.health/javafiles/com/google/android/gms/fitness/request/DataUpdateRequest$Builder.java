// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			DataUpdateRequest

public static class DataUpdateRequest$Builder
{

	private void zzCY()
	{
		zzac.zza(zzafe, "Must set a non-zero value for startTimeMillis/startTime");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long zzafe>
	//    2    4:ldc1            #22  <String "Must set a non-zero value for startTimeMillis/startTime">
	//    3    6:invokestatic    #28  <Method long zzac.zza(long, Object)>
	//    4    9:pop2            
		zzac.zza(zzaSt, "Must set a non-zero value for endTimeMillis/endTime");
	//    5   10:aload_0         
	//    6   11:getfield        #30  <Field long zzaSt>
	//    7   14:ldc1            #32  <String "Must set a non-zero value for endTimeMillis/endTime">
	//    8   16:invokestatic    #28  <Method long zzac.zza(long, Object)>
	//    9   19:pop2            
		zzac.zzb(((Object) (zzaUn)), "Must set the data set");
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field DataSet zzaUn>
	//   12   24:ldc1            #36  <String "Must set the data set">
	//   13   26:invokestatic    #40  <Method Object zzac.zzb(Object, Object)>
	//   14   29:pop             
		long l;
		long l1;
		boolean flag1;
		for(Iterator iterator = zzaUn.getDataPoints().iterator(); iterator.hasNext(); zzac.zza(flag1, "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", new Object[] {
	Long.valueOf(l), Long.valueOf(l1), Long.valueOf(zzafe), Long.valueOf(zzaSt)
}))
	//*  15   30:aload_0         
	//*  16   31:getfield        #34  <Field DataSet zzaUn>
	//*  17   34:invokevirtual   #46  <Method List DataSet.getDataPoints()>
	//*  18   37:invokeinterface #52  <Method Iterator List.iterator()>
	//*  19   42:astore          7
	//*  20   44:aload           7
	//*  21   46:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  22   51:ifeq            211
		{
			DataPoint datapoint = (DataPoint)iterator.next();
	//   23   54:aload           7
	//   24   56:invokeinterface #62  <Method Object Iterator.next()>
	//   25   61:checkcast       #64  <Class DataPoint>
	//   26   64:astore          8
			l = datapoint.getStartTime(TimeUnit.MILLISECONDS);
	//   27   66:aload           8
	//   28   68:getstatic       #70  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   29   71:invokevirtual   #74  <Method long DataPoint.getStartTime(TimeUnit)>
	//   30   74:lstore_2        
			l1 = datapoint.getEndTime(TimeUnit.MILLISECONDS);
	//   31   75:aload           8
	//   32   77:getstatic       #70  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   33   80:invokevirtual   #77  <Method long DataPoint.getEndTime(TimeUnit)>
	//   34   83:lstore          4
			boolean flag;
			if(l > l1 || l != 0L && l < zzafe || l != 0L && l > zzaSt || l1 > zzaSt || l1 < zzafe)
	//*  35   85:lload_2         
	//*  36   86:lload           4
	//*  37   88:lcmp            
	//*  38   89:ifgt            142
	//*  39   92:lload_2         
	//*  40   93:lconst_0        
	//*  41   94:lcmp            
	//*  42   95:ifeq            107
	//*  43   98:lload_2         
	//*  44   99:aload_0         
	//*  45  100:getfield        #20  <Field long zzafe>
	//*  46  103:lcmp            
	//*  47  104:iflt            142
	//*  48  107:lload_2         
	//*  49  108:lconst_0        
	//*  50  109:lcmp            
	//*  51  110:ifeq            122
	//*  52  113:lload_2         
	//*  53  114:aload_0         
	//*  54  115:getfield        #30  <Field long zzaSt>
	//*  55  118:lcmp            
	//*  56  119:ifgt            142
	//*  57  122:lload           4
	//*  58  124:aload_0         
	//*  59  125:getfield        #30  <Field long zzaSt>
	//*  60  128:lcmp            
	//*  61  129:ifgt            142
	//*  62  132:lload           4
	//*  63  134:aload_0         
	//*  64  135:getfield        #20  <Field long zzafe>
	//*  65  138:lcmp            
	//*  66  139:ifge            147
				flag = true;
	//   67  142:iconst_1        
	//   68  143:istore_1        
			else
	//*  69  144:goto            149
				flag = false;
	//   70  147:iconst_0        
	//   71  148:istore_1        
			if(!flag)
	//*  72  149:iload_1         
	//*  73  150:ifne            159
				flag1 = true;
	//   74  153:iconst_1        
	//   75  154:istore          6
			else
	//*  76  156:goto            162
				flag1 = false;
	//   77  159:iconst_0        
	//   78  160:istore          6
		}

	//   79  162:iload           6
	//   80  164:ldc1            #79  <String "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d">
	//   81  166:iconst_4        
	//   82  167:anewarray       Object[]
	//   83  170:dup             
	//   84  171:iconst_0        
	//   85  172:lload_2         
	//   86  173:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   87  176:aastore         
	//   88  177:dup             
	//   89  178:iconst_1        
	//   90  179:lload           4
	//   91  181:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   92  184:aastore         
	//   93  185:dup             
	//   94  186:iconst_2        
	//   95  187:aload_0         
	//   96  188:getfield        #20  <Field long zzafe>
	//   97  191:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   98  194:aastore         
	//   99  195:dup             
	//  100  196:iconst_3        
	//  101  197:aload_0         
	//  102  198:getfield        #30  <Field long zzaSt>
	//  103  201:invokestatic    #85  <Method Long Long.valueOf(long)>
	//  104  204:aastore         
	//  105  205:invokestatic    #88  <Method void zzac.zza(boolean, String, Object[])>
	//* 106  208:goto            44
	//  107  211:return          
	}

	static long zza(DataUpdateRequest$Builder dataupdaterequest$builder)
	{
		return dataupdaterequest$builder.zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long zzafe>
	//    2    4:lreturn         
	}

	static long zzb(DataUpdateRequest$Builder dataupdaterequest$builder)
	{
		return dataupdaterequest$builder.zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long zzaSt>
	//    2    4:lreturn         
	}

	static DataSet zzc(DataUpdateRequest$Builder dataupdaterequest$builder)
	{
		return dataupdaterequest$builder.zzaUn;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field DataSet zzaUn>
	//    2    4:areturn         
	}

	public DataUpdateRequest build()
	{
		zzCY();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void zzCY()>
		return new DataUpdateRequest(this, ((DataUpdateRequest._cls1) (null)));
	//    2    4:new             #6   <Class DataUpdateRequest>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #98  <Method void DataUpdateRequest(DataUpdateRequest$Builder, DataUpdateRequest$1)>
	//    7   13:areturn         
	}

	public DataUpdateRequest$Builder setDataSet(DataSet dataset)
	{
		zzac.zzb(((Object) (dataset)), "Must set the data set");
	//    0    0:aload_1         
	//    1    1:ldc1            #36  <String "Must set the data set">
	//    2    3:invokestatic    #40  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzaUn = dataset;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #34  <Field DataSet zzaUn>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	public DataUpdateRequest$Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
	{
		boolean flag;
		if(l > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          6
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          6
		zzac.zzb(flag, "Invalid start time :%d", new Object[] {
			Long.valueOf(l)
		});
	//    9   15:iload           6
	//   10   17:ldc1            #104 <String "Invalid start time :%d">
	//   11   19:iconst_1        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:lload_1         
	//   16   26:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   17   29:aastore         
	//   18   30:invokestatic    #106 <Method void zzac.zzb(boolean, String, Object[])>
		if(l1 >= l)
	//*  19   33:lload_3         
	//*  20   34:lload_1         
	//*  21   35:lcmp            
	//*  22   36:iflt            45
			flag = true;
	//   23   39:iconst_1        
	//   24   40:istore          6
		else
	//*  25   42:goto            48
			flag = false;
	//   26   45:iconst_0        
	//   27   46:istore          6
		zzac.zzb(flag, "Invalid end time :%d", new Object[] {
			Long.valueOf(l1)
		});
	//   28   48:iload           6
	//   29   50:ldc1            #108 <String "Invalid end time :%d">
	//   30   52:iconst_1        
	//   31   53:anewarray       Object[]
	//   32   56:dup             
	//   33   57:iconst_0        
	//   34   58:lload_3         
	//   35   59:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   36   62:aastore         
	//   37   63:invokestatic    #106 <Method void zzac.zzb(boolean, String, Object[])>
		zzafe = timeunit.toMillis(l);
	//   38   66:aload_0         
	//   39   67:aload           5
	//   40   69:lload_1         
	//   41   70:invokevirtual   #112 <Method long TimeUnit.toMillis(long)>
	//   42   73:putfield        #20  <Field long zzafe>
		zzaSt = timeunit.toMillis(l1);
	//   43   76:aload_0         
	//   44   77:aload           5
	//   45   79:lload_3         
	//   46   80:invokevirtual   #112 <Method long TimeUnit.toMillis(long)>
	//   47   83:putfield        #30  <Field long zzaSt>
		return this;
	//   48   86:aload_0         
	//   49   87:areturn         
	}

	private long zzaSt;
	private DataSet zzaUn;
	private long zzafe;

	public DataUpdateRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
