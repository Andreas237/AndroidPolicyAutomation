// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;

import android.content.*;
import android.content.pm.*;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness:
//			HistoryApi

public static class HistoryApi$ViewIntentBuilder
{

	private Intent zzk(Intent intent)
	{
		if(zzaSi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String zzaSi>
	//*   2    4:ifnonnull       9
			return intent;
	//    3    7:aload_1         
	//    4    8:areturn         
		Intent intent1 = (new Intent(intent)).setPackage(zzaSi);
	//    5    9:new             #34  <Class Intent>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #37  <Method void Intent(Intent)>
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field String zzaSi>
	//   11   21:invokevirtual   #41  <Method Intent Intent.setPackage(String)>
	//   12   24:astore_2        
		ResolveInfo resolveinfo = zzqn.getPackageManager().resolveActivity(intent1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field Context zzqn>
	//   15   29:invokevirtual   #47  <Method PackageManager Context.getPackageManager()>
	//   16   32:aload_2         
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #53  <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   19   37:astore_3        
		if(resolveinfo != null)
	//*  20   38:aload_3         
	//*  21   39:ifnull          69
		{
			intent = ((Intent) (resolveinfo.activityInfo.name));
	//   22   42:aload_3         
	//   23   43:getfield        #59  <Field ActivityInfo ResolveInfo.activityInfo>
	//   24   46:getfield        #64  <Field String ActivityInfo.name>
	//   25   49:astore_1        
			intent1.setComponent(new ComponentName(zzaSi, ((String) (intent))));
	//   26   50:aload_2         
	//   27   51:new             #66  <Class ComponentName>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:getfield        #32  <Field String zzaSi>
	//   31   59:aload_1         
	//   32   60:invokespecial   #69  <Method void ComponentName(String, String)>
	//   33   63:invokevirtual   #73  <Method Intent Intent.setComponent(ComponentName)>
	//   34   66:pop             
			return intent1;
	//   35   67:aload_2         
	//   36   68:areturn         
		} else
		{
			return intent;
	//   37   69:aload_1         
	//   38   70:areturn         
		}
	}

	public Intent build()
	{
		boolean flag;
		if(zzaKx > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field long zzaKx>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_1        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_1        
		zzac.zza(flag, "Start time must be set");
	//   10   16:iload_1         
	//   11   17:ldc1            #79  <String "Start time must be set">
	//   12   19:invokestatic    #85  <Method void zzac.zza(boolean, Object)>
		if(zzaKy > zzaKx)
	//*  13   22:aload_0         
	//*  14   23:getfield        #87  <Field long zzaKy>
	//*  15   26:aload_0         
	//*  16   27:getfield        #77  <Field long zzaKx>
	//*  17   30:lcmp            
	//*  18   31:ifle            39
			flag = true;
	//   19   34:iconst_1        
	//   20   35:istore_1        
		else
	//*  21   36:goto            41
			flag = false;
	//   22   39:iconst_0        
	//   23   40:istore_1        
		zzac.zza(flag, "End time must be set and after start time");
	//   24   41:iload_1         
	//   25   42:ldc1            #89  <String "End time must be set and after start time">
	//   26   44:invokestatic    #85  <Method void zzac.zza(boolean, Object)>
		Intent intent = new Intent("vnd.google.fitness.VIEW");
	//   27   47:new             #34  <Class Intent>
	//   28   50:dup             
	//   29   51:ldc1            #91  <String "vnd.google.fitness.VIEW">
	//   30   53:invokespecial   #94  <Method void Intent(String)>
	//   31   56:astore_2        
		intent.setType(DataType.getMimeType(zzaSh.getDataType()));
	//   32   57:aload_2         
	//   33   58:aload_0         
	//   34   59:getfield        #96  <Field DataSource zzaSh>
	//   35   62:invokevirtual   #102 <Method DataType DataSource.getDataType()>
	//   36   65:invokestatic    #108 <Method String DataType.getMimeType(DataType)>
	//   37   68:invokevirtual   #111 <Method Intent Intent.setType(String)>
	//   38   71:pop             
		intent.putExtra("vnd.google.fitness.start_time", zzaKx);
	//   39   72:aload_2         
	//   40   73:ldc1            #113 <String "vnd.google.fitness.start_time">
	//   41   75:aload_0         
	//   42   76:getfield        #77  <Field long zzaKx>
	//   43   79:invokevirtual   #117 <Method Intent Intent.putExtra(String, long)>
	//   44   82:pop             
		intent.putExtra("vnd.google.fitness.end_time", zzaKy);
	//   45   83:aload_2         
	//   46   84:ldc1            #119 <String "vnd.google.fitness.end_time">
	//   47   86:aload_0         
	//   48   87:getfield        #87  <Field long zzaKy>
	//   49   90:invokevirtual   #117 <Method Intent Intent.putExtra(String, long)>
	//   50   93:pop             
		zzd.zza(((com.google.android.gms.common.internal.safeparcel.SafeParcelable) (zzaSh)), intent, "vnd.google.fitness.data_source");
	//   51   94:aload_0         
	//   52   95:getfield        #96  <Field DataSource zzaSh>
	//   53   98:aload_2         
	//   54   99:ldc1            #121 <String "vnd.google.fitness.data_source">
	//   55  101:invokestatic    #126 <Method void zzd.zza(com.google.android.gms.common.internal.safeparcel.SafeParcelable, Intent, String)>
		return zzk(intent);
	//   56  104:aload_0         
	//   57  105:aload_2         
	//   58  106:invokespecial   #128 <Method Intent zzk(Intent)>
	//   59  109:areturn         
	}

	public HistoryApi$ViewIntentBuilder setDataSource(DataSource datasource)
	{
		zzac.zzb(datasource.getDataType().equals(((Object) (zzaSg))), "Data source %s is not for the data type %s", new Object[] {
			datasource, zzaSg
		});
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method DataType DataSource.getDataType()>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field DataType zzaSg>
	//    4    8:invokevirtual   #134 <Method boolean DataType.equals(Object)>
	//    5   11:ldc1            #136 <String "Data source %s is not for the data type %s">
	//    6   13:iconst_2        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_1         
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:getfield        #27  <Field DataType zzaSg>
	//   16   27:aastore         
	//   17   28:invokestatic    #140 <Method void zzac.zzb(boolean, String, Object[])>
		zzaSh = datasource;
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:putfield        #96  <Field DataSource zzaSh>
		return this;
	//   21   36:aload_0         
	//   22   37:areturn         
	}

	public HistoryApi$ViewIntentBuilder setPreferredApplication(String s)
	{
		zzaSi = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String zzaSi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public HistoryApi$ViewIntentBuilder setTimeInterval(long l, long l1, TimeUnit timeunit)
	{
		zzaKx = timeunit.toMillis(l);
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:lload_1         
	//    3    4:invokevirtual   #150 <Method long TimeUnit.toMillis(long)>
	//    4    7:putfield        #77  <Field long zzaKx>
		zzaKy = timeunit.toMillis(l1);
	//    5   10:aload_0         
	//    6   11:aload           5
	//    7   13:lload_3         
	//    8   14:invokevirtual   #150 <Method long TimeUnit.toMillis(long)>
	//    9   17:putfield        #87  <Field long zzaKy>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private long zzaKx;
	private long zzaKy;
	private final DataType zzaSg;
	private DataSource zzaSh;
	private String zzaSi;
	private final Context zzqn;

	public HistoryApi$ViewIntentBuilder(Context context, DataType datatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzqn = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Context zzqn>
		zzaSg = datatype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field DataType zzaSg>
	//    8   14:return          
	}
}
