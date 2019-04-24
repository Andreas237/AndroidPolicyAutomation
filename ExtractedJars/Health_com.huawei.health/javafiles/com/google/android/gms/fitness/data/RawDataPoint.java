// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzanu;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzw, DataPoint, Value

public final class RawDataPoint extends zza
{

	public RawDataPoint(int i, long l, long l1, Value avalue[], int j, 
			int k, long l2, long l3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int versionCode>
		zzaUb = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #35  <Field long zzaUb>
		zzaUc = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #37  <Field long zzaUc>
		zzaUe = j;
	//   11   20:aload_0         
	//   12   21:iload           7
	//   13   23:putfield        #39  <Field int zzaUe>
		zzaUf = k;
	//   14   26:aload_0         
	//   15   27:iload           8
	//   16   29:putfield        #41  <Field int zzaUf>
		zzaUg = l2;
	//   17   32:aload_0         
	//   18   33:lload           9
	//   19   35:putfield        #43  <Field long zzaUg>
		zzaUh = l3;
	//   20   38:aload_0         
	//   21   39:lload           11
	//   22   41:putfield        #45  <Field long zzaUh>
		zzaUd = avalue;
	//   23   44:aload_0         
	//   24   45:aload           6
	//   25   47:putfield        #47  <Field Value[] zzaUd>
	//   26   50:return          
	}

	RawDataPoint(DataPoint datapoint, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zza()>
		versionCode = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #33  <Field int versionCode>
		zzaUb = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #54  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    8   14:invokevirtual   #60  <Method long DataPoint.getTimestamp(TimeUnit)>
	//    9   17:putfield        #35  <Field long zzaUb>
		zzaUc = datapoint.getStartTime(TimeUnit.NANOSECONDS);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getstatic       #54  <Field TimeUnit TimeUnit.NANOSECONDS>
	//   13   25:invokevirtual   #63  <Method long DataPoint.getStartTime(TimeUnit)>
	//   14   28:putfield        #37  <Field long zzaUc>
		zzaUd = datapoint.zzCa();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #67  <Method Value[] DataPoint.zzCa()>
	//   18   36:putfield        #47  <Field Value[] zzaUd>
		zzaUe = zzanu.zza(((Object) (datapoint.getDataSource())), list);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #71  <Method DataSource DataPoint.getDataSource()>
	//   22   44:aload_2         
	//   23   45:invokestatic    #77  <Method int zzanu.zza(Object, List)>
	//   24   48:putfield        #39  <Field int zzaUe>
		zzaUf = zzanu.zza(((Object) (datapoint.zzCb())), list);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #80  <Method DataSource DataPoint.zzCb()>
	//   28   56:aload_2         
	//   29   57:invokestatic    #77  <Method int zzanu.zza(Object, List)>
	//   30   60:putfield        #41  <Field int zzaUf>
		zzaUg = datapoint.zzCc();
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #84  <Method long DataPoint.zzCc()>
	//   34   68:putfield        #43  <Field long zzaUg>
		zzaUh = datapoint.zzCd();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #87  <Method long DataPoint.zzCd()>
	//   38   76:putfield        #45  <Field long zzaUh>
	//   39   79:return          
	}

	private boolean zza(RawDataPoint rawdatapoint)
	{
		return zzaUb == rawdatapoint.zzaUb && zzaUc == rawdatapoint.zzaUc && Arrays.equals(((Object []) (zzaUd)), ((Object []) (rawdatapoint.zzaUd))) && zzaUe == rawdatapoint.zzaUe && zzaUf == rawdatapoint.zzaUf && zzaUg == rawdatapoint.zzaUg;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long zzaUb>
	//    2    4:aload_1         
	//    3    5:getfield        #35  <Field long zzaUb>
	//    4    8:lcmp            
	//    5    9:ifne            74
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field long zzaUc>
	//    8   16:aload_1         
	//    9   17:getfield        #37  <Field long zzaUc>
	//   10   20:lcmp            
	//   11   21:ifne            74
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field Value[] zzaUd>
	//   14   28:aload_1         
	//   15   29:getfield        #47  <Field Value[] zzaUd>
	//   16   32:invokestatic    #96  <Method boolean Arrays.equals(Object[], Object[])>
	//   17   35:ifeq            74
	//   18   38:aload_0         
	//   19   39:getfield        #39  <Field int zzaUe>
	//   20   42:aload_1         
	//   21   43:getfield        #39  <Field int zzaUe>
	//   22   46:icmpne          74
	//   23   49:aload_0         
	//   24   50:getfield        #41  <Field int zzaUf>
	//   25   53:aload_1         
	//   26   54:getfield        #41  <Field int zzaUf>
	//   27   57:icmpne          74
	//   28   60:aload_0         
	//   29   61:getfield        #43  <Field long zzaUg>
	//   30   64:aload_1         
	//   31   65:getfield        #43  <Field long zzaUg>
	//   32   68:lcmp            
	//   33   69:ifne            74
	//   34   72:iconst_1        
	//   35   73:ireturn         
	//   36   74:iconst_0        
	//   37   75:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof RawDataPoint) && zza((RawDataPoint)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class RawDataPoint>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class RawDataPoint>
	//    9   17:invokespecial   #99  <Method boolean zza(RawDataPoint)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Long.valueOf(zzaUb), Long.valueOf(zzaUc)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #35  <Field long zzaUb>
	//    6   10:invokestatic    #109 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field long zzaUc>
	//   12   20:invokestatic    #109 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:invokestatic    #114 <Method int zzaa.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[] {
			Arrays.toString(((Object []) (zzaUd))), Long.valueOf(zzaUc), Long.valueOf(zzaUb), Integer.valueOf(zzaUe), Integer.valueOf(zzaUf)
		});
	//    0    0:ldc1            #118 <String "RawDataPoint{%s@[%s, %s](%d,%d)}">
	//    1    2:iconst_5        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #47  <Field Value[] zzaUd>
	//    7   12:invokestatic    #121 <Method String Arrays.toString(Object[])>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #37  <Field long zzaUc>
	//   13   22:invokestatic    #109 <Method Long Long.valueOf(long)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_0         
	//   18   29:getfield        #35  <Field long zzaUb>
	//   19   32:invokestatic    #109 <Method Long Long.valueOf(long)>
	//   20   35:aastore         
	//   21   36:dup             
	//   22   37:iconst_3        
	//   23   38:aload_0         
	//   24   39:getfield        #39  <Field int zzaUe>
	//   25   42:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//   26   45:aastore         
	//   27   46:dup             
	//   28   47:iconst_4        
	//   29   48:aload_0         
	//   30   49:getfield        #41  <Field int zzaUf>
	//   31   52:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//   32   55:aastore         
	//   33   56:invokestatic    #132 <Method String String.format(String, Object[])>
	//   34   59:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzw.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #137 <Method void com.google.android.gms.fitness.data.zzw.zza(RawDataPoint, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzw();
	final int versionCode;
	public final long zzaUb;
	public final long zzaUc;
	public final Value zzaUd[];
	public final int zzaUe;
	public final int zzaUf;
	public final long zzaUg;
	public final long zzaUh;

	static 
	{
	//    0    0:new             #23  <Class zzw>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzw()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
