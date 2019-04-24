// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzanx;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
	public static class Builder
	{

		static DataSource zza(Builder builder)
		{
			return builder.zzaTi;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field DataSource zzaTi>
		//    2    4:areturn         
		}

		static DataType zzb(Builder builder)
		{
			return builder.zzaTj;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field DataType zzaTj>
		//    2    4:areturn         
		}

		static long zzc(Builder builder)
		{
			return builder.zzaUo;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field long zzaUo>
		//    2    4:lreturn         
		}

		static long zzd(Builder builder)
		{
			return builder.zzaWs;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field long zzaWs>
		//    2    4:lreturn         
		}

		static long zze(Builder builder)
		{
			return builder.zzaWr;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field long zzaWr>
		//    2    4:lreturn         
		}

		static int zzf(Builder builder)
		{
			return builder.zzaUp;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int zzaUp>
		//    2    4:ireturn         
		}

		static long zzg(Builder builder)
		{
			return builder.zzaWx;
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
			return new SensorRequest(this);
		//   35   71:new             #6   <Class SensorRequest>
		//   36   74:dup             
		//   37   75:aload_0         
		//   38   76:aconst_null     
		//   39   77:invokespecial   #82  <Method void SensorRequest(SensorRequest$Builder, SensorRequest$1)>
		//   40   80:areturn         
		}

		public Builder setAccuracyMode(int i)
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

		public Builder setDataSource(DataSource datasource)
		{
			zzaTi = datasource;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field DataSource zzaTi>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDataType(DataType datatype)
		{
			zzaTj = datatype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field DataType zzaTj>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setFastestRate(int i, TimeUnit timeunit)
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

		public Builder setMaxDeliveryLatency(int i, TimeUnit timeunit)
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

		public Builder setSamplingRate(long l, TimeUnit timeunit)
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

		public Builder setTimeout(long l, TimeUnit timeunit)
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

		public Builder()
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


	private SensorRequest(DataSource datasource, LocationRequest locationrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		zzaWw = locationrequest;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #35  <Field LocationRequest zzaWw>
		zzaUo = TimeUnit.MILLISECONDS.toMicros(locationrequest.getInterval());
	//    5    9:aload_0         
	//    6   10:getstatic       #41  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #47  <Method long LocationRequest.getInterval()>
	//    9   17:invokevirtual   #51  <Method long TimeUnit.toMicros(long)>
	//   10   20:putfield        #53  <Field long zzaUo>
		zzaWs = TimeUnit.MILLISECONDS.toMicros(locationrequest.getFastestInterval());
	//   11   23:aload_0         
	//   12   24:getstatic       #41  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #56  <Method long LocationRequest.getFastestInterval()>
	//   15   31:invokevirtual   #51  <Method long TimeUnit.toMicros(long)>
	//   16   34:putfield        #58  <Field long zzaWs>
		zzaWr = zzaUo;
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #53  <Field long zzaUo>
	//   20   42:putfield        #60  <Field long zzaWr>
		zzaTj = datasource.getDataType();
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #66  <Method DataType DataSource.getDataType()>
	//   24   50:putfield        #68  <Field DataType zzaTj>
		zzaUp = zza(locationrequest);
	//   25   53:aload_0         
	//   26   54:aload_2         
	//   27   55:invokestatic    #72  <Method int zza(LocationRequest)>
	//   28   58:putfield        #74  <Field int zzaUp>
		zzaTi = datasource;
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:putfield        #76  <Field DataSource zzaTi>
		long l = locationrequest.getExpirationTime();
	//   32   66:aload_2         
	//   33   67:invokevirtual   #79  <Method long LocationRequest.getExpirationTime()>
	//   34   70:lstore_3        
		if(l == 0xffffffffL)
	//*  35   71:lload_3         
	//*  36   72:ldc2w           #80  <Long 0xffffffffL>
	//*  37   75:lcmp            
	//*  38   76:ifne            87
		{
			zzaWx = 0xffffffffL;
	//   39   79:aload_0         
	//   40   80:ldc2w           #80  <Long 0xffffffffL>
	//   41   83:putfield        #83  <Field long zzaWx>
			return;
	//   42   86:return          
		} else
		{
			zzaWx = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
	//   43   87:aload_0         
	//   44   88:getstatic       #41  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   45   91:lload_3         
	//   46   92:invokestatic    #88  <Method long SystemClock.elapsedRealtime()>
	//   47   95:lsub            
	//   48   96:invokevirtual   #51  <Method long TimeUnit.toMicros(long)>
	//   49   99:putfield        #83  <Field long zzaWx>
			return;
	//   50  102:return          
		}
	}

	private SensorRequest(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		zzaTi = Builder.zza(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #93  <Method DataSource SensorRequest$Builder.zza(SensorRequest$Builder)>
	//    5    9:putfield        #76  <Field DataSource zzaTi>
		zzaTj = Builder.zzb(builder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #97  <Method DataType SensorRequest$Builder.zzb(SensorRequest$Builder)>
	//    9   17:putfield        #68  <Field DataType zzaTj>
		zzaUo = Builder.zzc(builder);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #101 <Method long SensorRequest$Builder.zzc(SensorRequest$Builder)>
	//   13   25:putfield        #53  <Field long zzaUo>
		zzaWs = Builder.zzd(builder);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #104 <Method long SensorRequest$Builder.zzd(SensorRequest$Builder)>
	//   17   33:putfield        #58  <Field long zzaWs>
		zzaWr = Builder.zze(builder);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #107 <Method long SensorRequest$Builder.zze(SensorRequest$Builder)>
	//   21   41:putfield        #60  <Field long zzaWr>
		zzaUp = Builder.zzf(builder);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #111 <Method int SensorRequest$Builder.zzf(SensorRequest$Builder)>
	//   25   49:putfield        #74  <Field int zzaUp>
		zzaWw = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #35  <Field LocationRequest zzaWw>
		zzaWx = Builder.zzg(builder);
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokestatic    #114 <Method long SensorRequest$Builder.zzg(SensorRequest$Builder)>
	//   32   62:putfield        #83  <Field long zzaWx>
	//   33   65:return          
	}


	public static SensorRequest fromLocationRequest(DataSource datasource, LocationRequest locationrequest)
	{
		return new SensorRequest(datasource, locationrequest);
	//    0    0:new             #2   <Class SensorRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #121 <Method void SensorRequest(DataSource, LocationRequest)>
	//    5    9:areturn         
	}

	private static int zza(LocationRequest locationrequest)
	{
		switch(locationrequest.getPriority())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #125 <Method int LocationRequest.getPriority()>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               100: 35
	//	               104: 37
	//*   3   32:goto            39
		case 100: // 'd'
			return 3;
	//    4   35:iconst_3        
	//    5   36:ireturn         

		case 104: // 'h'
			return 1;
	//    6   37:iconst_1        
	//    7   38:ireturn         
		}
		return 2;
	//    8   39:iconst_2        
	//    9   40:ireturn         
	}

	private boolean zza(SensorRequest sensorrequest)
	{
		return zzaa.equal(((Object) (zzaTi)), ((Object) (sensorrequest.zzaTi))) && zzaa.equal(((Object) (zzaTj)), ((Object) (sensorrequest.zzaTj))) && zzaUo == sensorrequest.zzaUo && zzaWs == sensorrequest.zzaWs && zzaWr == sensorrequest.zzaWr && zzaUp == sensorrequest.zzaUp && zzaa.equal(((Object) (zzaWw)), ((Object) (sensorrequest.zzaWw))) && zzaWx == sensorrequest.zzaWx;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field DataSource zzaTi>
	//    2    4:aload_1         
	//    3    5:getfield        #76  <Field DataSource zzaTi>
	//    4    8:invokestatic    #132 <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            103
	//    6   14:aload_0         
	//    7   15:getfield        #68  <Field DataType zzaTj>
	//    8   18:aload_1         
	//    9   19:getfield        #68  <Field DataType zzaTj>
	//   10   22:invokestatic    #132 <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            103
	//   12   28:aload_0         
	//   13   29:getfield        #53  <Field long zzaUo>
	//   14   32:aload_1         
	//   15   33:getfield        #53  <Field long zzaUo>
	//   16   36:lcmp            
	//   17   37:ifne            103
	//   18   40:aload_0         
	//   19   41:getfield        #58  <Field long zzaWs>
	//   20   44:aload_1         
	//   21   45:getfield        #58  <Field long zzaWs>
	//   22   48:lcmp            
	//   23   49:ifne            103
	//   24   52:aload_0         
	//   25   53:getfield        #60  <Field long zzaWr>
	//   26   56:aload_1         
	//   27   57:getfield        #60  <Field long zzaWr>
	//   28   60:lcmp            
	//   29   61:ifne            103
	//   30   64:aload_0         
	//   31   65:getfield        #74  <Field int zzaUp>
	//   32   68:aload_1         
	//   33   69:getfield        #74  <Field int zzaUp>
	//   34   72:icmpne          103
	//   35   75:aload_0         
	//   36   76:getfield        #35  <Field LocationRequest zzaWw>
	//   37   79:aload_1         
	//   38   80:getfield        #35  <Field LocationRequest zzaWw>
	//   39   83:invokestatic    #132 <Method boolean zzaa.equal(Object, Object)>
	//   40   86:ifeq            103
	//   41   89:aload_0         
	//   42   90:getfield        #83  <Field long zzaWx>
	//   43   93:aload_1         
	//   44   94:getfield        #83  <Field long zzaWx>
	//   45   97:lcmp            
	//   46   98:ifne            103
	//   47  101:iconst_1        
	//   48  102:ireturn         
	//   49  103:iconst_0        
	//   50  104:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof SensorRequest) && zza((SensorRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class SensorRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class SensorRequest>
	//    9   17:invokespecial   #136 <Method boolean zza(SensorRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public int getAccuracyMode()
	{
		return zzaUp;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int zzaUp>
	//    2    4:ireturn         
	}

	public DataSource getDataSource()
	{
		return zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	public long getFastestRate(TimeUnit timeunit)
	{
		return timeunit.convert(zzaWs, TimeUnit.MICROSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #58  <Field long zzaWs>
	//    3    5:getstatic       #144 <Field TimeUnit TimeUnit.MICROSECONDS>
	//    4    8:invokevirtual   #148 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public long getMaxDeliveryLatency(TimeUnit timeunit)
	{
		return timeunit.convert(zzaWr, TimeUnit.MICROSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field long zzaWr>
	//    3    5:getstatic       #144 <Field TimeUnit TimeUnit.MICROSECONDS>
	//    4    8:invokevirtual   #148 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public long getSamplingRate(TimeUnit timeunit)
	{
		return timeunit.convert(zzaUo, TimeUnit.MICROSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field long zzaUo>
	//    3    5:getstatic       #144 <Field TimeUnit TimeUnit.MICROSECONDS>
	//    4    8:invokevirtual   #148 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaTi, zzaTj, Long.valueOf(zzaUo), Long.valueOf(zzaWs), Long.valueOf(zzaWr), Integer.valueOf(zzaUp), zzaWw, Long.valueOf(zzaWx)
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #76  <Field DataSource zzaTi>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #68  <Field DataType zzaTj>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #53  <Field long zzaUo>
	//   16   25:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #58  <Field long zzaWs>
	//   22   35:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #60  <Field long zzaWr>
	//   28   45:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   29   48:aastore         
	//   30   49:dup             
	//   31   50:iconst_5        
	//   32   51:aload_0         
	//   33   52:getfield        #74  <Field int zzaUp>
	//   34   55:invokestatic    #162 <Method Integer Integer.valueOf(int)>
	//   35   58:aastore         
	//   36   59:dup             
	//   37   60:bipush          6
	//   38   62:aload_0         
	//   39   63:getfield        #35  <Field LocationRequest zzaWw>
	//   40   66:aastore         
	//   41   67:dup             
	//   42   68:bipush          7
	//   43   70:aload_0         
	//   44   71:getfield        #83  <Field long zzaWx>
	//   45   74:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   46   77:aastore         
	//   47   78:invokestatic    #165 <Method int zzaa.hashCode(Object[])>
	//   48   81:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataSource", ((Object) (zzaTi))).zzg("dataType", ((Object) (zzaTj))).zzg("samplingRateMicros", ((Object) (Long.valueOf(zzaUo)))).zzg("deliveryLatencyMicros", ((Object) (Long.valueOf(zzaWr)))).zzg("timeOutMicros", ((Object) (Long.valueOf(zzaWx)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #171 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #173 <String "dataSource">
	//    3    6:aload_0         
	//    4    7:getfield        #76  <Field DataSource zzaTi>
	//    5   10:invokevirtual   #178 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #180 <String "dataType">
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field DataType zzaTj>
	//    9   19:invokevirtual   #178 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #182 <String "samplingRateMicros">
	//   11   24:aload_0         
	//   12   25:getfield        #53  <Field long zzaUo>
	//   13   28:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   14   31:invokevirtual   #178 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   15   34:ldc1            #184 <String "deliveryLatencyMicros">
	//   16   36:aload_0         
	//   17   37:getfield        #60  <Field long zzaWr>
	//   18   40:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   19   43:invokevirtual   #178 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   20   46:ldc1            #186 <String "timeOutMicros">
	//   21   48:aload_0         
	//   22   49:getfield        #83  <Field long zzaWx>
	//   23   52:invokestatic    #157 <Method Long Long.valueOf(long)>
	//   24   55:invokevirtual   #178 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   25   58:invokevirtual   #188 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   26   61:areturn         
	}

	public long zzDi()
	{
		return zzaWx;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long zzaWx>
	//    2    4:lreturn         
	}

	public static final int ACCURACY_MODE_DEFAULT = 2;
	public static final int ACCURACY_MODE_HIGH = 3;
	public static final int ACCURACY_MODE_LOW = 1;
	private final DataSource zzaTi;
	private final DataType zzaTj;
	private final long zzaUo;
	private final int zzaUp;
	private final long zzaWr;
	private final long zzaWs;
	private final LocationRequest zzaWw;
	private final long zzaWx;
}
