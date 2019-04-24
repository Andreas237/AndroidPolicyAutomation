// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzac, DataType, DataSource

public class Subscription extends com.google.android.gms.common.internal.safeparcel.zza
{
	public static class zza
	{

		static DataType zza(zza zza1)
		{
			return zza1.zzaTj;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field DataType zzaTj>
		//    2    4:areturn         
		}

		static DataSource zzb(zza zza1)
		{
			return zza1.zzaTi;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field DataSource zzaTi>
		//    2    4:areturn         
		}

		static long zzc(zza zza1)
		{
			return zza1.zzaUo;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field long zzaUo>
		//    2    4:lreturn         
		}

		static int zzd(zza zza1)
		{
			return zza1.zzaUp;
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
			return new Subscription(this);
		//   35   71:new             #6   <Class Subscription>
		//   36   74:dup             
		//   37   75:aload_0         
		//   38   76:aconst_null     
		//   39   77:invokespecial   #63  <Method void Subscription(Subscription$zza, Subscription$1)>
		//   40   80:areturn         
		}

		public zza zzb(DataSource datasource)
		{
			zzaTi = datasource;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field DataSource zzaTi>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public zza zzd(DataType datatype)
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

		public zza()
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


	Subscription(int i, DataSource datasource, DataType datatype, long l, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int zzaiI>
		zzaTi = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field DataSource zzaTi>
		zzaTj = datatype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field DataType zzaTj>
		zzaUo = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #41  <Field long zzaUo>
		zzaUp = j;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #43  <Field int zzaUp>
	//   17   31:return          
	}

	private Subscription(zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #35  <Field int zzaiI>
		zzaTj = com.google.android.gms.fitness.data.zza.zza(zza1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #47  <Method DataType com.google.android.gms.fitness.data.Subscription$zza.zza(Subscription$zza)>
	//    8   14:putfield        #39  <Field DataType zzaTj>
		zzaTi = zza.zzb(zza1);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #51  <Method DataSource Subscription$zza.zzb(Subscription$zza)>
	//   12   22:putfield        #37  <Field DataSource zzaTi>
		zzaUo = zza.zzc(zza1);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #55  <Method long Subscription$zza.zzc(Subscription$zza)>
	//   16   30:putfield        #41  <Field long zzaUo>
		zzaUp = zza.zzd(zza1);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokestatic    #59  <Method int Subscription$zza.zzd(Subscription$zza)>
	//   20   38:putfield        #43  <Field int zzaUp>
	//   21   41:return          
	}


	private boolean zza(Subscription subscription)
	{
		return zzaa.equal(((Object) (zzaTi)), ((Object) (subscription.zzaTi))) && zzaa.equal(((Object) (zzaTj)), ((Object) (subscription.zzaTj))) && zzaUo == subscription.zzaUo && zzaUp == subscription.zzaUp;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DataSource zzaTi>
	//    2    4:aload_1         
	//    3    5:getfield        #37  <Field DataSource zzaTi>
	//    4    8:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            53
	//    6   14:aload_0         
	//    7   15:getfield        #39  <Field DataType zzaTj>
	//    8   18:aload_1         
	//    9   19:getfield        #39  <Field DataType zzaTj>
	//   10   22:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            53
	//   12   28:aload_0         
	//   13   29:getfield        #41  <Field long zzaUo>
	//   14   32:aload_1         
	//   15   33:getfield        #41  <Field long zzaUo>
	//   16   36:lcmp            
	//   17   37:ifne            53
	//   18   40:aload_0         
	//   19   41:getfield        #43  <Field int zzaUp>
	//   20   44:aload_1         
	//   21   45:getfield        #43  <Field int zzaUp>
	//   22   48:icmpne          53
	//   23   51:iconst_1        
	//   24   52:ireturn         
	//   25   53:iconst_0        
	//   26   54:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof Subscription) && zza((Subscription)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Subscription>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Subscription>
	//    9   17:invokespecial   #73  <Method boolean zza(Subscription)>
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
	//    1    1:getfield        #43  <Field int zzaUp>
	//    2    4:ireturn         
	}

	public DataSource getDataSource()
	{
		return zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaTi, zzaTi, Long.valueOf(zzaUo), Integer.valueOf(zzaUp)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field DataSource zzaTi>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #37  <Field DataSource zzaTi>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #41  <Field long zzaUo>
	//   16   24:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #43  <Field int zzaUp>
	//   22   34:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   23   37:aastore         
	//   24   38:invokestatic    #97  <Method int zzaa.hashCode(Object[])>
	//   25   41:ireturn         
	}

	public String toDebugString()
	{
		String s;
		if(zzaTi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field DataSource zzaTi>
	//*   2    4:ifnonnull       18
			s = zzaTj.getName();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field DataType zzaTj>
	//    5   11:invokevirtual   #104 <Method String DataType.getName()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            26
			s = zzaTi.toDebugString();
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field DataSource zzaTi>
	//   10   22:invokevirtual   #108 <Method String DataSource.toDebugString()>
	//   11   25:astore_1        
		return String.format("Subscription{%s}", new Object[] {
			s
		});
	//   12   26:ldc1            #110 <String "Subscription{%s}">
	//   13   28:iconst_1        
	//   14   29:anewarray       Object[]
	//   15   32:dup             
	//   16   33:iconst_0        
	//   17   34:aload_1         
	//   18   35:aastore         
	//   19   36:invokestatic    #116 <Method String String.format(String, Object[])>
	//   20   39:areturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataSource", ((Object) (zzaTi))).zzg("dataType", ((Object) (zzaTj))).zzg("samplingIntervalMicros", ((Object) (Long.valueOf(zzaUo)))).zzg("accuracyMode", ((Object) (Integer.valueOf(zzaUp)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #121 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #123 <String "dataSource">
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field DataSource zzaTi>
	//    5   10:invokevirtual   #129 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #131 <String "dataType">
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field DataType zzaTj>
	//    9   19:invokevirtual   #129 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #133 <String "samplingIntervalMicros">
	//   11   24:aload_0         
	//   12   25:getfield        #41  <Field long zzaUo>
	//   13   28:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   14   31:invokevirtual   #129 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   15   34:ldc1            #135 <String "accuracyMode">
	//   16   36:aload_0         
	//   17   37:getfield        #43  <Field int zzaUp>
	//   18   40:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   19   43:invokevirtual   #129 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   20   46:invokevirtual   #137 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   21   49:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzac.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #142 <Method void com.google.android.gms.fitness.data.zzac.zza(Subscription, Parcel, int)>
	//    4    6:return          
	}

	public DataType zzCA()
	{
		if(zzaTj == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field DataType zzaTj>
	//*   2    4:ifnonnull       15
			return zzaTi.getDataType();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field DataSource zzaTi>
	//    5   11:invokevirtual   #145 <Method DataType DataSource.getDataType()>
	//    6   14:areturn         
		else
			return zzaTj;
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field DataType zzaTj>
	//    9   19:areturn         
	}

	public long zzCz()
	{
		return zzaUo;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long zzaUo>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.data.zzac();
	private final DataSource zzaTi;
	private final DataType zzaTj;
	private final long zzaUo;
	private final int zzaUp;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #25  <Class com.google.android.gms.fitness.data.zzac>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void com.google.android.gms.fitness.data.zzac()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
