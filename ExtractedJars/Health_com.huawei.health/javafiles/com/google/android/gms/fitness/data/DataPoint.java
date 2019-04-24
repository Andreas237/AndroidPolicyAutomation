// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzant;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzh, DataSource, DataType, Value, 
//			Field, RawDataPoint

public final class DataPoint extends zza
	implements ReflectedParcelable
{

	DataPoint(int i, DataSource datasource, long l, long l1, Value avalue[], 
			DataSource datasource1, long l2, long l3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int versionCode>
		zzaSh = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field DataSource zzaSh>
		zzaSD = datasource1;
	//    8   14:aload_0         
	//    9   15:aload           8
	//   10   17:putfield        #39  <Field DataSource zzaSD>
		zzaSA = l;
	//   11   20:aload_0         
	//   12   21:lload_3         
	//   13   22:putfield        #41  <Field long zzaSA>
		zzaSB = l1;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #43  <Field long zzaSB>
		zzaSC = avalue;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #45  <Field Value[] zzaSC>
		zzaSE = l2;
	//   20   37:aload_0         
	//   21   38:lload           9
	//   22   40:putfield        #47  <Field long zzaSE>
		zzaSF = l3;
	//   23   43:aload_0         
	//   24   44:lload           11
	//   25   46:putfield        #49  <Field long zzaSF>
	//   26   49:return          
	}

	private DataPoint(DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		versionCode = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #35  <Field int versionCode>
		zzaSh = (DataSource)zzac.zzb(((Object) (datasource)), "Data source cannot be null");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #52  <String "Data source cannot be null">
	//    8   13:invokestatic    #58  <Method Object zzac.zzb(Object, Object)>
	//    9   16:checkcast       #60  <Class DataSource>
	//   10   19:putfield        #37  <Field DataSource zzaSh>
		datasource = ((DataSource) (datasource.getDataType().getFields()));
	//   11   22:aload_1         
	//   12   23:invokevirtual   #64  <Method DataType DataSource.getDataType()>
	//   13   26:invokevirtual   #70  <Method List DataType.getFields()>
	//   14   29:astore_1        
		zzaSC = new Value[((List) (datasource)).size()];
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokeinterface #76  <Method int List.size()>
	//   18   37:anewarray       Value[]
	//   19   40:putfield        #45  <Field Value[] zzaSC>
		int i = 0;
	//   20   43:iconst_0        
	//   21   44:istore_2        
		for(datasource = ((DataSource) (((List) (datasource)).iterator())); ((Iterator) (datasource)).hasNext();)
	//*  22   45:aload_1         
	//*  23   46:invokeinterface #82  <Method Iterator List.iterator()>
	//*  24   51:astore_1        
	//*  25   52:aload_1         
	//*  26   53:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//*  27   58:ifeq            95
		{
			Field field = (Field)((Iterator) (datasource)).next();
	//   28   61:aload_1         
	//   29   62:invokeinterface #92  <Method Object Iterator.next()>
	//   30   67:checkcast       #94  <Class Field>
	//   31   70:astore_3        
			zzaSC[i] = new Value(field.getFormat());
	//   32   71:aload_0         
	//   33   72:getfield        #45  <Field Value[] zzaSC>
	//   34   75:iload_2         
	//   35   76:new             #78  <Class Value>
	//   36   79:dup             
	//   37   80:aload_3         
	//   38   81:invokevirtual   #97  <Method int Field.getFormat()>
	//   39   84:invokespecial   #100 <Method void Value(int)>
	//   40   87:aastore         
			i++;
	//   41   88:iload_2         
	//   42   89:iconst_1        
	//   43   90:iadd            
	//   44   91:istore_2        
		}

	//*  45   92:goto            52
	//   46   95:return          
	}

	public DataPoint(DataSource datasource, DataSource datasource1, RawDataPoint rawdatapoint)
	{
		this(4, datasource, zza(Long.valueOf(rawdatapoint.zzaUb), 0L), zza(Long.valueOf(rawdatapoint.zzaUc), 0L), rawdatapoint.zzaUd, datasource1, zza(Long.valueOf(rawdatapoint.zzaUg), 0L), zza(Long.valueOf(rawdatapoint.zzaUh), 0L));
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_1         
	//    3    3:aload_3         
	//    4    4:getfield        #106 <Field long RawDataPoint.zzaUb>
	//    5    7:invokestatic    #112 <Method Long Long.valueOf(long)>
	//    6   10:lconst_0        
	//    7   11:invokestatic    #116 <Method long zza(Long, long)>
	//    8   14:aload_3         
	//    9   15:getfield        #119 <Field long RawDataPoint.zzaUc>
	//   10   18:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   11   21:lconst_0        
	//   12   22:invokestatic    #116 <Method long zza(Long, long)>
	//   13   25:aload_3         
	//   14   26:getfield        #122 <Field Value[] RawDataPoint.zzaUd>
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:getfield        #125 <Field long RawDataPoint.zzaUg>
	//   18   34:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   19   37:lconst_0        
	//   20   38:invokestatic    #116 <Method long zza(Long, long)>
	//   21   41:aload_3         
	//   22   42:getfield        #128 <Field long RawDataPoint.zzaUh>
	//   23   45:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   24   48:lconst_0        
	//   25   49:invokestatic    #116 <Method long zza(Long, long)>
	//   26   52:invokespecial   #130 <Method void DataPoint(int, DataSource, long, long, Value[], DataSource, long, long)>
	//   27   55:return          
	}

	DataPoint(List list, RawDataPoint rawdatapoint)
	{
		this(zzc(list, rawdatapoint.zzaUe), zzc(list, rawdatapoint.zzaUf), rawdatapoint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getfield        #134 <Field int RawDataPoint.zzaUe>
	//    4    6:invokestatic    #138 <Method DataSource zzc(List, int)>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:getfield        #141 <Field int RawDataPoint.zzaUf>
	//    8   14:invokestatic    #138 <Method DataSource zzc(List, int)>
	//    9   17:aload_2         
	//   10   18:invokespecial   #143 <Method void DataPoint(DataSource, DataSource, RawDataPoint)>
	//   11   21:return          
	}

	public static DataPoint create(DataSource datasource)
	{
		return new DataPoint(datasource);
	//    0    0:new             #2   <Class DataPoint>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void DataPoint(DataSource)>
	//    4    8:areturn         
	}

	public static DataPoint extract(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return (DataPoint)zzd.zza(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
	//    4    6:aload_0         
	//    5    7:ldc1            #153 <String "com.google.android.gms.fitness.EXTRA_DATA_POINT">
	//    6    9:getstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//    7   12:invokestatic    #158 <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzd.zza(Intent, String, android.os.Parcelable$Creator)>
	//    8   15:checkcast       #2   <Class DataPoint>
	//    9   18:areturn         
	}

	private boolean zzBZ()
	{
		return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method DataType getDataType()>
	//    2    4:getstatic       #164 <Field DataType DataType.TYPE_LOCATION_SAMPLE>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private static long zza(Long long1, long l)
	{
		if(long1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			return long1.longValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #168 <Method long Long.longValue()>
	//    4    8:lreturn         
		else
			return l;
	//    5    9:lload_1         
	//    6   10:lreturn         
	}

	private static DataSource zzc(List list, int i)
	{
		if(i >= 0 && i < list.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            25
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #76  <Method int List.size()>
	//*   5   11:icmpge          25
			return (DataSource)list.get(i);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokeinterface #172 <Method Object List.get(int)>
	//    9   21:checkcast       #60  <Class DataSource>
	//   10   24:areturn         
		else
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
	}

	private boolean zzc(DataPoint datapoint)
	{
		return zzaa.equal(((Object) (zzaSh)), ((Object) (datapoint.zzaSh))) && zzaSA == datapoint.zzaSA && zzaSB == datapoint.zzaSB && Arrays.equals(((Object []) (zzaSC)), ((Object []) (datapoint.zzaSC))) && zzaa.equal(((Object) (getOriginalDataSource())), ((Object) (datapoint.getOriginalDataSource())));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DataSource zzaSh>
	//    2    4:aload_1         
	//    3    5:getfield        #37  <Field DataSource zzaSh>
	//    4    8:invokestatic    #180 <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            68
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field long zzaSA>
	//    8   18:aload_1         
	//    9   19:getfield        #41  <Field long zzaSA>
	//   10   22:lcmp            
	//   11   23:ifne            68
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field long zzaSB>
	//   14   30:aload_1         
	//   15   31:getfield        #43  <Field long zzaSB>
	//   16   34:lcmp            
	//   17   35:ifne            68
	//   18   38:aload_0         
	//   19   39:getfield        #45  <Field Value[] zzaSC>
	//   20   42:aload_1         
	//   21   43:getfield        #45  <Field Value[] zzaSC>
	//   22   46:invokestatic    #186 <Method boolean Arrays.equals(Object[], Object[])>
	//   23   49:ifeq            68
	//   24   52:aload_0         
	//   25   53:invokevirtual   #190 <Method DataSource getOriginalDataSource()>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #190 <Method DataSource getOriginalDataSource()>
	//   28   60:invokestatic    #180 <Method boolean zzaa.equal(Object, Object)>
	//   29   63:ifeq            68
	//   30   66:iconst_1        
	//   31   67:ireturn         
	//   32   68:iconst_0        
	//   33   69:ireturn         
	}

	private void zzgz(int i)
	{
		List list = getDataType().getFields();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method DataType getDataType()>
	//    2    4:invokevirtual   #70  <Method List DataType.getFields()>
	//    3    7:astore          4
		int j = list.size();
	//    4    9:aload           4
	//    5   11:invokeinterface #76  <Method int List.size()>
	//    6   16:istore_2        
		boolean flag;
		if(i == j)
	//*   7   17:iload_1         
	//*   8   18:iload_2         
	//*   9   19:icmpne          27
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_3        
		else
	//*  12   24:goto            29
			flag = false;
	//   13   27:iconst_0        
	//   14   28:istore_3        
		zzac.zzb(flag, "Attempting to insert %s values, but needed %s: %s", new Object[] {
			Integer.valueOf(i), Integer.valueOf(j), list
		});
	//   15   29:iload_3         
	//   16   30:ldc1            #193 <String "Attempting to insert %s values, but needed %s: %s">
	//   17   32:iconst_3        
	//   18   33:anewarray       Object[]
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:iload_1         
	//   22   39:invokestatic    #200 <Method Integer Integer.valueOf(int)>
	//   23   42:aastore         
	//   24   43:dup             
	//   25   44:iconst_1        
	//   26   45:iload_2         
	//   27   46:invokestatic    #200 <Method Integer Integer.valueOf(int)>
	//   28   49:aastore         
	//   29   50:dup             
	//   30   51:iconst_2        
	//   31   52:aload           4
	//   32   54:aastore         
	//   33   55:invokestatic    #203 <Method void zzac.zzb(boolean, String, Object[])>
	//   34   58:return          
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataPoint) && zzc((DataPoint)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataPoint>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataPoint>
	//    9   17:invokespecial   #206 <Method boolean zzc(DataPoint)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public DataSource getDataSource()
	{
		return zzaSh;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DataSource zzaSh>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaSh.getDataType();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field DataSource zzaSh>
	//    2    4:invokevirtual   #64  <Method DataType DataSource.getDataType()>
	//    3    7:areturn         
	}

	public long getEndTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSA, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field long zzaSA>
	//    3    5:getstatic       #215 <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #219 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public DataSource getOriginalDataSource()
	{
		if(zzaSD != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field DataSource zzaSD>
	//*   2    4:ifnull          12
			return zzaSD;
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field DataSource zzaSD>
	//    5   11:areturn         
		else
			return zzaSh;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field DataSource zzaSh>
	//    8   16:areturn         
	}

	public long getStartTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSB, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field long zzaSB>
	//    3    5:getstatic       #215 <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #219 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public long getTimestamp(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSA, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field long zzaSA>
	//    3    5:getstatic       #215 <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #219 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public long getTimestampNanos()
	{
		return zzaSA;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long zzaSA>
	//    2    4:lreturn         
	}

	public Value getValue(Field field)
	{
		int i = getDataType().indexOf(field);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method DataType getDataType()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #228 <Method int DataType.indexOf(Field)>
	//    4    8:istore_2        
		return zzaSC[i];
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field Value[] zzaSC>
	//    7   13:iload_2         
	//    8   14:aaload          
	//    9   15:areturn         
	}

	public int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaSh, Long.valueOf(zzaSA), Long.valueOf(zzaSB)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field DataSource zzaSh>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #41  <Field long zzaSA>
	//   11   17:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #43  <Field long zzaSB>
	//   17   27:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   18   30:aastore         
	//   19   31:invokestatic    #233 <Method int zzaa.hashCode(Object[])>
	//   20   34:ireturn         
	}

	public transient DataPoint setFloatValues(float af[])
	{
		zzgz(af.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokespecial   #237 <Method void zzgz(int)>
		for(int i = 0; i < af.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:aload_1         
	//*   8   10:arraylength     
	//*   9   11:icmpge          33
			zzaSC[i].setFloat(af[i]);
	//   10   14:aload_0         
	//   11   15:getfield        #45  <Field Value[] zzaSC>
	//   12   18:iload_2         
	//   13   19:aaload          
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:faload          
	//   17   23:invokevirtual   #241 <Method void Value.setFloat(float)>

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            8
		return this;
	//   23   33:aload_0         
	//   24   34:areturn         
	}

	public transient DataPoint setIntValues(int ai[])
	{
		zzgz(ai.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokespecial   #237 <Method void zzgz(int)>
		for(int i = 0; i < ai.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:aload_1         
	//*   8   10:arraylength     
	//*   9   11:icmpge          33
			zzaSC[i].setInt(ai[i]);
	//   10   14:aload_0         
	//   11   15:getfield        #45  <Field Value[] zzaSC>
	//   12   18:iload_2         
	//   13   19:aaload          
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:iaload          
	//   17   23:invokevirtual   #246 <Method void Value.setInt(int)>

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            8
		return this;
	//   23   33:aload_0         
	//   24   34:areturn         
	}

	public DataPoint setTimeInterval(long l, long l1, TimeUnit timeunit)
	{
		zzaSB = timeunit.toNanos(l);
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:lload_1         
	//    3    4:invokevirtual   #252 <Method long TimeUnit.toNanos(long)>
	//    4    7:putfield        #43  <Field long zzaSB>
		zzaSA = timeunit.toNanos(l1);
	//    5   10:aload_0         
	//    6   11:aload           5
	//    7   13:lload_3         
	//    8   14:invokevirtual   #252 <Method long TimeUnit.toNanos(long)>
	//    9   17:putfield        #41  <Field long zzaSA>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public DataPoint setTimestamp(long l, TimeUnit timeunit)
	{
		zzaSA = timeunit.toNanos(l);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #252 <Method long TimeUnit.toNanos(long)>
	//    4    6:putfield        #41  <Field long zzaSA>
		if(zzBZ() && zzant.zza(timeunit))
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #256 <Method boolean zzBZ()>
	//*   7   13:ifeq            50
	//*   8   16:aload_3         
	//*   9   17:invokestatic    #261 <Method boolean zzant.zza(TimeUnit)>
	//*  10   20:ifeq            50
		{
			Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
	//   11   23:ldc2            #263 <String "Fitness">
	//   12   26:ldc2            #265 <String "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.">
	//   13   29:invokestatic    #271 <Method int Log.w(String, String)>
	//   14   32:pop             
			zzaSA = zzant.zza(zzaSA, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #41  <Field long zzaSA>
	//   18   38:getstatic       #215 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   19   41:getstatic       #274 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   20   44:invokestatic    #277 <Method long zzant.zza(long, TimeUnit, TimeUnit)>
	//   21   47:putfield        #41  <Field long zzaSA>
		}
		return this;
	//   22   50:aload_0         
	//   23   51:areturn         
	}

	public String toString()
	{
		String s1 = Arrays.toString(((Object []) (zzaSC)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Value[] zzaSC>
	//    2    4:invokestatic    #282 <Method String Arrays.toString(Object[])>
	//    3    7:astore          10
		long l = zzaSB;
	//    4    9:aload_0         
	//    5   10:getfield        #43  <Field long zzaSB>
	//    6   13:lstore_1        
		long l1 = zzaSA;
	//    7   14:aload_0         
	//    8   15:getfield        #41  <Field long zzaSA>
	//    9   18:lstore_3        
		long l2 = zzaSE;
	//   10   19:aload_0         
	//   11   20:getfield        #47  <Field long zzaSE>
	//   12   23:lstore          5
		long l3 = zzaSF;
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field long zzaSF>
	//   15   29:lstore          7
		String s2 = zzaSh.toDebugString();
	//   16   31:aload_0         
	//   17   32:getfield        #37  <Field DataSource zzaSh>
	//   18   35:invokevirtual   #285 <Method String DataSource.toDebugString()>
	//   19   38:astore          11
		String s;
		if(zzaSD != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #39  <Field DataSource zzaSD>
	//*  22   44:ifnull          59
			s = zzaSD.toDebugString();
	//   23   47:aload_0         
	//   24   48:getfield        #39  <Field DataSource zzaSD>
	//   25   51:invokevirtual   #285 <Method String DataSource.toDebugString()>
	//   26   54:astore          9
		else
	//*  27   56:goto            64
			s = "N/A";
	//   28   59:ldc2            #287 <String "N/A">
	//   29   62:astore          9
		return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[] {
			s1, Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), s2, s
		});
	//   30   64:ldc2            #289 <String "DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}">
	//   31   67:bipush          7
	//   32   69:anewarray       Object[]
	//   33   72:dup             
	//   34   73:iconst_0        
	//   35   74:aload           10
	//   36   76:aastore         
	//   37   77:dup             
	//   38   78:iconst_1        
	//   39   79:lload_1         
	//   40   80:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   41   83:aastore         
	//   42   84:dup             
	//   43   85:iconst_2        
	//   44   86:lload_3         
	//   45   87:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   46   90:aastore         
	//   47   91:dup             
	//   48   92:iconst_3        
	//   49   93:lload           5
	//   50   95:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   51   98:aastore         
	//   52   99:dup             
	//   53  100:iconst_4        
	//   54  101:lload           7
	//   55  103:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   56  106:aastore         
	//   57  107:dup             
	//   58  108:iconst_5        
	//   59  109:aload           11
	//   60  111:aastore         
	//   61  112:dup             
	//   62  113:bipush          6
	//   63  115:aload           9
	//   64  117:aastore         
	//   65  118:invokestatic    #295 <Method String String.format(String, Object[])>
	//   66  121:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzh.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #300 <Method void com.google.android.gms.fitness.data.zzh.zza(DataPoint, Parcel, int)>
	//    4    6:return          
	}

	public Value[] zzCa()
	{
		return zzaSC;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Value[] zzaSC>
	//    2    4:areturn         
	}

	public DataSource zzCb()
	{
		return zzaSD;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DataSource zzaSD>
	//    2    4:areturn         
	}

	public long zzCc()
	{
		return zzaSE;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long zzaSE>
	//    2    4:lreturn         
	}

	public long zzCd()
	{
		return zzaSF;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long zzaSF>
	//    2    4:lreturn         
	}

	public void zzCe()
	{
		DataSource datasource = getDataSource();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #308 <Method DataSource getDataSource()>
	//    2    4:astore_2        
		zzac.zzb(getDataType().getName().equals(((Object) (datasource.getDataType().getName()))), "Conflicting data types found %s vs %s", new Object[] {
			getDataType(), getDataType()
		});
	//    3    5:aload_0         
	//    4    6:invokevirtual   #160 <Method DataType getDataType()>
	//    5    9:invokevirtual   #311 <Method String DataType.getName()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #64  <Method DataType DataSource.getDataType()>
	//    8   16:invokevirtual   #311 <Method String DataType.getName()>
	//    9   19:invokevirtual   #313 <Method boolean String.equals(Object)>
	//   10   22:ldc2            #315 <String "Conflicting data types found %s vs %s">
	//   11   25:iconst_2        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:invokevirtual   #160 <Method DataType getDataType()>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:aload_0         
	//   21   39:invokevirtual   #160 <Method DataType getDataType()>
	//   22   42:aastore         
	//   23   43:invokestatic    #203 <Method void zzac.zzb(boolean, String, Object[])>
		boolean flag;
		if(zzaSA > 0L)
	//*  24   46:aload_0         
	//*  25   47:getfield        #41  <Field long zzaSA>
	//*  26   50:lconst_0        
	//*  27   51:lcmp            
	//*  28   52:ifle            60
			flag = true;
	//   29   55:iconst_1        
	//   30   56:istore_1        
		else
	//*  31   57:goto            62
			flag = false;
	//   32   60:iconst_0        
	//   33   61:istore_1        
		zzac.zzb(flag, "Data point does not have the timestamp set: %s", new Object[] {
			this
		});
	//   34   62:iload_1         
	//   35   63:ldc2            #317 <String "Data point does not have the timestamp set: %s">
	//   36   66:iconst_1        
	//   37   67:anewarray       Object[]
	//   38   70:dup             
	//   39   71:iconst_0        
	//   40   72:aload_0         
	//   41   73:aastore         
	//   42   74:invokestatic    #203 <Method void zzac.zzb(boolean, String, Object[])>
		if(zzaSB <= zzaSA)
	//*  43   77:aload_0         
	//*  44   78:getfield        #43  <Field long zzaSB>
	//*  45   81:aload_0         
	//*  46   82:getfield        #41  <Field long zzaSA>
	//*  47   85:lcmp            
	//*  48   86:ifgt            94
			flag = true;
	//   49   89:iconst_1        
	//   50   90:istore_1        
		else
	//*  51   91:goto            96
			flag = false;
	//   52   94:iconst_0        
	//   53   95:istore_1        
		zzac.zzb(flag, "Data point with start time greater than end time found: %s", new Object[] {
			this
		});
	//   54   96:iload_1         
	//   55   97:ldc2            #319 <String "Data point with start time greater than end time found: %s">
	//   56  100:iconst_1        
	//   57  101:anewarray       Object[]
	//   58  104:dup             
	//   59  105:iconst_0        
	//   60  106:aload_0         
	//   61  107:aastore         
	//   62  108:invokestatic    #203 <Method void zzac.zzb(boolean, String, Object[])>
	//   63  111:return          
	}

	public long zzCf()
	{
		return zzaSB;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long zzaSB>
	//    2    4:lreturn         
	}

	public Value zzgy(int i)
	{
		DataType datatype = getDataType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method DataType getDataType()>
	//    2    4:astore_2        
		if(i < 0 || i >= datatype.getFields().size())
	//*   3    5:iload_1         
	//*   4    6:iflt            22
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #70  <Method List DataType.getFields()>
	//*   8   14:invokeinterface #76  <Method int List.size()>
	//*   9   19:icmplt          51
			throw new IllegalArgumentException(String.format("fieldIndex %s is out of range for %s", new Object[] {
				Integer.valueOf(i), datatype
			}));
	//   10   22:new             #324 <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc2            #326 <String "fieldIndex %s is out of range for %s">
	//   13   29:iconst_2        
	//   14   30:anewarray       Object[]
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:iload_1         
	//   18   36:invokestatic    #200 <Method Integer Integer.valueOf(int)>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:aload_2         
	//   23   43:aastore         
	//   24   44:invokestatic    #295 <Method String String.format(String, Object[])>
	//   25   47:invokespecial   #329 <Method void IllegalArgumentException(String)>
	//   26   50:athrow          
		else
			return zzaSC[i];
	//   27   51:aload_0         
	//   28   52:getfield        #45  <Field Value[] zzaSC>
	//   29   55:iload_1         
	//   30   56:aaload          
	//   31   57:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzh();
	private final int versionCode;
	private long zzaSA;
	private long zzaSB;
	private final Value zzaSC[];
	private DataSource zzaSD;
	private long zzaSE;
	private long zzaSF;
	private final DataSource zzaSh;

	static 
	{
	//    0    0:new             #25  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzh()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
