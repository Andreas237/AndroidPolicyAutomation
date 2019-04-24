// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzaa;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzm, DataSource, DataType

public class DataUpdateNotification extends zza
{

	DataUpdateNotification(int i, long l, long l1, int j, DataSource datasource, 
			DataType datatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int zzaiI>
		zzaTf = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #46  <Field long zzaTf>
		zzaTg = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #48  <Field long zzaTg>
		zzaTh = j;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #50  <Field int zzaTh>
		zzaTi = datasource;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #52  <Field DataSource zzaTi>
		zzaTj = datatype;
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:putfield        #54  <Field DataType zzaTj>
	//   20   38:return          
	}

	public static DataUpdateNotification getDataUpdateNotification(Intent intent)
	{
		return (DataUpdateNotification)zzd.zza(intent, "vnd.google.fitness.data_udpate_notification", CREATOR);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "vnd.google.fitness.data_udpate_notification">
	//    2    3:getstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//    3    6:invokestatic    #62  <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzd.zza(Intent, String, android.os.Parcelable$Creator)>
	//    4    9:checkcast       #2   <Class DataUpdateNotification>
	//    5   12:areturn         
	}

	private boolean zza(DataUpdateNotification dataupdatenotification)
	{
		return zzaTf == dataupdatenotification.zzaTf && zzaTg == dataupdatenotification.zzaTg && zzaTh == dataupdatenotification.zzaTh && zzaa.equal(((Object) (zzaTi)), ((Object) (dataupdatenotification.zzaTi))) && zzaa.equal(((Object) (zzaTj)), ((Object) (dataupdatenotification.zzaTj)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long zzaTf>
	//    2    4:aload_1         
	//    3    5:getfield        #46  <Field long zzaTf>
	//    4    8:lcmp            
	//    5    9:ifne            65
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field long zzaTg>
	//    8   16:aload_1         
	//    9   17:getfield        #48  <Field long zzaTg>
	//   10   20:lcmp            
	//   11   21:ifne            65
	//   12   24:aload_0         
	//   13   25:getfield        #50  <Field int zzaTh>
	//   14   28:aload_1         
	//   15   29:getfield        #50  <Field int zzaTh>
	//   16   32:icmpne          65
	//   17   35:aload_0         
	//   18   36:getfield        #52  <Field DataSource zzaTi>
	//   19   39:aload_1         
	//   20   40:getfield        #52  <Field DataSource zzaTi>
	//   21   43:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//   22   46:ifeq            65
	//   23   49:aload_0         
	//   24   50:getfield        #54  <Field DataType zzaTj>
	//   25   53:aload_1         
	//   26   54:getfield        #54  <Field DataType zzaTj>
	//   27   57:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//   28   60:ifeq            65
	//   29   63:iconst_1        
	//   30   64:ireturn         
	//   31   65:iconst_0        
	//   32   66:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof DataUpdateNotification) && zza((DataUpdateNotification)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataUpdateNotification>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataUpdateNotification>
	//    9   17:invokespecial   #73  <Method boolean zza(DataUpdateNotification)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public DataSource getDataSource()
	{
		return zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	public int getOperationType()
	{
		return zzaTh;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int zzaTh>
	//    2    4:ireturn         
	}

	public long getUpdateEndTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaTg, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field long zzaTg>
	//    3    5:getstatic       #87  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #91  <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public long getUpdateStartTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaTf, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field long zzaTf>
	//    3    5:getstatic       #87  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #91  <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Long.valueOf(zzaTf), Long.valueOf(zzaTg), Integer.valueOf(zzaTh), zzaTi, zzaTj
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field long zzaTf>
	//    6   10:invokestatic    #101 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #48  <Field long zzaTg>
	//   12   20:invokestatic    #101 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #50  <Field int zzaTh>
	//   18   30:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #52  <Field DataSource zzaTi>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:aload_0         
	//   28   44:getfield        #54  <Field DataType zzaTj>
	//   29   47:aastore         
	//   30   48:invokestatic    #109 <Method int zzaa.hashCode(Object[])>
	//   31   51:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("updateStartTimeNanos", ((Object) (Long.valueOf(zzaTf)))).zzg("updateEndTimeNanos", ((Object) (Long.valueOf(zzaTg)))).zzg("operationType", ((Object) (Integer.valueOf(zzaTh)))).zzg("dataSource", ((Object) (zzaTi))).zzg("dataType", ((Object) (zzaTj))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #115 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #117 <String "updateStartTimeNanos">
	//    3    6:aload_0         
	//    4    7:getfield        #46  <Field long zzaTf>
	//    5   10:invokestatic    #101 <Method Long Long.valueOf(long)>
	//    6   13:invokevirtual   #123 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #125 <String "updateEndTimeNanos">
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field long zzaTg>
	//   10   22:invokestatic    #101 <Method Long Long.valueOf(long)>
	//   11   25:invokevirtual   #123 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #127 <String "operationType">
	//   13   30:aload_0         
	//   14   31:getfield        #50  <Field int zzaTh>
	//   15   34:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   16   37:invokevirtual   #123 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   17   40:ldc1            #129 <String "dataSource">
	//   18   42:aload_0         
	//   19   43:getfield        #52  <Field DataSource zzaTi>
	//   20   46:invokevirtual   #123 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   21   49:ldc1            #131 <String "dataType">
	//   22   51:aload_0         
	//   23   52:getfield        #54  <Field DataType zzaTj>
	//   24   55:invokevirtual   #123 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   25   58:invokevirtual   #133 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   26   61:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzm.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #138 <Method void com.google.android.gms.fitness.data.zzm.zza(DataUpdateNotification, Parcel, int)>
	//    4    6:return          
	}

	public long zzCl()
	{
		return zzaTf;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long zzaTf>
	//    2    4:lreturn         
	}

	public long zzCm()
	{
		return zzaTg;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long zzaTg>
	//    2    4:lreturn         
	}

	public static final String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	public static final String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
	public static final int OPERATION_DELETE = 2;
	public static final int OPERATION_INSERT = 1;
	public static final int OPERATION_UPDATE = 3;
	private final long zzaTf;
	private final long zzaTg;
	private final int zzaTh;
	private final DataSource zzaTi;
	private final DataType zzaTj;
	final int zzaiI;

	static 
	{
	//    0    0:new             #34  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void zzm()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
