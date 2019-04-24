// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zze, RawBucket, DataSet, RawDataSet, 
//			DataType, Session

public class Bucket extends zza
	implements ReflectedParcelable
{

	Bucket(int i, long l, long l1, Session session, int j, 
			List list, int k, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void zza()>
		zzaSx = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #45  <Field boolean zzaSx>
		zzaiI = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #47  <Field int zzaiI>
		zzafe = l;
	//    8   14:aload_0         
	//    9   15:lload_2         
	//   10   16:putfield        #49  <Field long zzafe>
		zzaSt = l1;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #51  <Field long zzaSt>
		zzaSj = session;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #53  <Field Session zzaSj>
		zzaSu = j;
	//   17   31:aload_0         
	//   18   32:iload           7
	//   19   34:putfield        #55  <Field int zzaSu>
		zzaSv = list;
	//   20   37:aload_0         
	//   21   38:aload           8
	//   22   40:putfield        #57  <Field List zzaSv>
		zzaSw = k;
	//   23   43:aload_0         
	//   24   44:iload           9
	//   25   46:putfield        #59  <Field int zzaSw>
		zzaSx = flag;
	//   26   49:aload_0         
	//   27   50:iload           10
	//   28   52:putfield        #45  <Field boolean zzaSx>
	//   29   55:return          
	}

	public Bucket(RawBucket rawbucket, List list)
	{
		this(2, rawbucket.zzafe, rawbucket.zzaSt, rawbucket.zzaSj, rawbucket.zzaUa, zza(((Collection) (rawbucket.zzaSv)), list), rawbucket.zzaSw, rawbucket.zzaSx);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:getfield        #65  <Field long RawBucket.zzafe>
	//    4    6:aload_1         
	//    5    7:getfield        #66  <Field long RawBucket.zzaSt>
	//    6   10:aload_1         
	//    7   11:getfield        #67  <Field Session RawBucket.zzaSj>
	//    8   14:aload_1         
	//    9   15:getfield        #70  <Field int RawBucket.zzaUa>
	//   10   18:aload_1         
	//   11   19:getfield        #71  <Field List RawBucket.zzaSv>
	//   12   22:aload_2         
	//   13   23:invokestatic    #75  <Method List zza(Collection, List)>
	//   14   26:aload_1         
	//   15   27:getfield        #76  <Field int RawBucket.zzaSw>
	//   16   30:aload_1         
	//   17   31:getfield        #77  <Field boolean RawBucket.zzaSx>
	//   18   34:invokespecial   #79  <Method void Bucket(int, long, long, Session, int, List, int, boolean)>
	//   19   37:return          
	}

	private static List zza(Collection collection, List list)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #82  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #88  <Method int Collection.size()>
	//    4   10:invokespecial   #91  <Method void ArrayList(int)>
	//    5   13:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(((Object) (new DataSet((RawDataSet)((Iterator) (collection)).next(), list)))));
	//    6   14:aload_0         
	//    7   15:invokeinterface #95  <Method Iterator Collection.iterator()>
	//    8   20:astore_0        
	//    9   21:aload_0         
	//   10   22:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            57
	//   12   30:aload_2         
	//   13   31:new             #103 <Class DataSet>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokeinterface #107 <Method Object Iterator.next()>
	//   17   41:checkcast       #109 <Class RawDataSet>
	//   18   44:aload_1         
	//   19   45:invokespecial   #112 <Method void DataSet(RawDataSet, List)>
	//   20   48:invokeinterface #118 <Method boolean List.add(Object)>
	//   21   53:pop             
	//*  22   54:goto            21
		return ((List) (arraylist));
	//   23   57:aload_2         
	//   24   58:areturn         
	}

	private boolean zza(Bucket bucket)
	{
		return zzafe == bucket.zzafe && zzaSt == bucket.zzaSt && zzaSu == bucket.zzaSu && zzaa.equal(((Object) (zzaSv)), ((Object) (bucket.zzaSv))) && zzaSw == bucket.zzaSw && zzaSx == bucket.zzaSx;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long zzafe>
	//    2    4:aload_1         
	//    3    5:getfield        #49  <Field long zzafe>
	//    4    8:lcmp            
	//    5    9:ifne            73
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field long zzaSt>
	//    8   16:aload_1         
	//    9   17:getfield        #51  <Field long zzaSt>
	//   10   20:lcmp            
	//   11   21:ifne            73
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field int zzaSu>
	//   14   28:aload_1         
	//   15   29:getfield        #55  <Field int zzaSu>
	//   16   32:icmpne          73
	//   17   35:aload_0         
	//   18   36:getfield        #57  <Field List zzaSv>
	//   19   39:aload_1         
	//   20   40:getfield        #57  <Field List zzaSv>
	//   21   43:invokestatic    #126 <Method boolean zzaa.equal(Object, Object)>
	//   22   46:ifeq            73
	//   23   49:aload_0         
	//   24   50:getfield        #59  <Field int zzaSw>
	//   25   53:aload_1         
	//   26   54:getfield        #59  <Field int zzaSw>
	//   27   57:icmpne          73
	//   28   60:aload_0         
	//   29   61:getfield        #45  <Field boolean zzaSx>
	//   30   64:aload_1         
	//   31   65:getfield        #45  <Field boolean zzaSx>
	//   32   68:icmpne          73
	//   33   71:iconst_1        
	//   34   72:ireturn         
	//   35   73:iconst_0        
	//   36   74:ireturn         
	}

	public static String zzgw(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 51
	//	               1 39
	//	               2 48
	//	               3 42
	//	               4 45
	//*   2   36:goto            54
		case 1: // '\001'
			return "time";
	//    3   39:ldc1            #130 <String "time">
	//    4   41:areturn         

		case 3: // '\003'
			return "type";
	//    5   42:ldc1            #132 <String "type">
	//    6   44:areturn         

		case 4: // '\004'
			return "segment";
	//    7   45:ldc1            #134 <String "segment">
	//    8   47:areturn         

		case 2: // '\002'
			return "session";
	//    9   48:ldc1            #136 <String "session">
	//   10   50:areturn         

		case 0: // '\0'
			return "unknown";
	//   11   51:ldc1            #138 <String "unknown">
	//   12   53:areturn         
		}
		return "bug";
	//   13   54:ldc1            #140 <String "bug">
	//   14   56:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof Bucket) && zza((Bucket)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Bucket>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Bucket>
	//    9   17:invokespecial   #143 <Method boolean zza(Bucket)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public String getActivity()
	{
		return com.google.android.gms.fitness.zza.getName(zzaSu);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int zzaSu>
	//    2    4:invokestatic    #150 <Method String com.google.android.gms.fitness.zza.getName(int)>
	//    3    7:areturn         
	}

	public int getBucketType()
	{
		return zzaSw;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int zzaSw>
	//    2    4:ireturn         
	}

	public DataSet getDataSet(DataType datatype)
	{
		for(Iterator iterator = zzaSv.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field List zzaSv>
	//*   2    4:invokeinterface #154 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            45
		{
			DataSet dataset = (DataSet)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #107 <Method Object Iterator.next()>
	//    9   25:checkcast       #103 <Class DataSet>
	//   10   28:astore_3        
			if(dataset.getDataType().equals(((Object) (datatype))))
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #158 <Method DataType DataSet.getDataType()>
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #162 <Method boolean DataType.equals(Object)>
	//*  15   37:ifeq            42
				return dataset;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

	//*  18   42:goto            10
		return null;
	//   19   45:aconst_null     
	//   20   46:areturn         
	}

	public List getDataSets()
	{
		return zzaSv;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzaSv>
	//    2    4:areturn         
	}

	public long getEndTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSt, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field long zzaSt>
	//    3    5:getstatic       #173 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #177 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public Session getSession()
	{
		return zzaSj;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Session zzaSj>
	//    2    4:areturn         
	}

	public long getStartTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzafe, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field long zzafe>
	//    3    5:getstatic       #173 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #177 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Long.valueOf(zzafe), Long.valueOf(zzaSt), Integer.valueOf(zzaSu), Integer.valueOf(zzaSw)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #49  <Field long zzafe>
	//    6   10:invokestatic    #190 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #51  <Field long zzaSt>
	//   12   20:invokestatic    #190 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #55  <Field int zzaSu>
	//   18   30:invokestatic    #195 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #59  <Field int zzaSw>
	//   24   40:invokestatic    #195 <Method Integer Integer.valueOf(int)>
	//   25   43:aastore         
	//   26   44:invokestatic    #198 <Method int zzaa.hashCode(Object[])>
	//   27   47:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("startTime", ((Object) (Long.valueOf(zzafe)))).zzg("endTime", ((Object) (Long.valueOf(zzaSt)))).zzg("activity", ((Object) (Integer.valueOf(zzaSu)))).zzg("dataSets", ((Object) (zzaSv))).zzg("bucketType", ((Object) (zzgw(zzaSw)))).zzg("serverHasMoreData", ((Object) (Boolean.valueOf(zzaSx)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #203 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #205 <String "startTime">
	//    3    6:aload_0         
	//    4    7:getfield        #49  <Field long zzafe>
	//    5   10:invokestatic    #190 <Method Long Long.valueOf(long)>
	//    6   13:invokevirtual   #211 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #213 <String "endTime">
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field long zzaSt>
	//   10   22:invokestatic    #190 <Method Long Long.valueOf(long)>
	//   11   25:invokevirtual   #211 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #215 <String "activity">
	//   13   30:aload_0         
	//   14   31:getfield        #55  <Field int zzaSu>
	//   15   34:invokestatic    #195 <Method Integer Integer.valueOf(int)>
	//   16   37:invokevirtual   #211 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   17   40:ldc1            #217 <String "dataSets">
	//   18   42:aload_0         
	//   19   43:getfield        #57  <Field List zzaSv>
	//   20   46:invokevirtual   #211 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   21   49:ldc1            #219 <String "bucketType">
	//   22   51:aload_0         
	//   23   52:getfield        #59  <Field int zzaSw>
	//   24   55:invokestatic    #221 <Method String zzgw(int)>
	//   25   58:invokevirtual   #211 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   26   61:ldc1            #223 <String "serverHasMoreData">
	//   27   63:aload_0         
	//   28   64:getfield        #45  <Field boolean zzaSx>
	//   29   67:invokestatic    #228 <Method Boolean Boolean.valueOf(boolean)>
	//   30   70:invokevirtual   #211 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   31   73:invokevirtual   #230 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   32   76:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zze.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #235 <Method void com.google.android.gms.fitness.data.zze.zza(Bucket, Parcel, int)>
	//    4    6:return          
	}

	public long zzAm()
	{
		return zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field long zzaSt>
	//    2    4:lreturn         
	}

	public int zzBW()
	{
		return zzaSu;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int zzaSu>
	//    2    4:ireturn         
	}

	public boolean zzBX()
	{
		if(zzaSx)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean zzaSx>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		for(Iterator iterator = zzaSv.iterator(); iterator.hasNext();)
	//*   5    9:aload_0         
	//*   6   10:getfield        #57  <Field List zzaSv>
	//*   7   13:invokeinterface #154 <Method Iterator List.iterator()>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            48
			if(((DataSet)iterator.next()).zzBX())
	//*  12   28:aload_1         
	//*  13   29:invokeinterface #107 <Method Object Iterator.next()>
	//*  14   34:checkcast       #103 <Class DataSet>
	//*  15   37:invokevirtual   #241 <Method boolean DataSet.zzBX()>
	//*  16   40:ifeq            45
				return true;
	//   17   43:iconst_1        
	//   18   44:ireturn         

	//*  19   45:goto            19
		return false;
	//   20   48:iconst_0        
	//   21   49:ireturn         
	}

	public boolean zzb(Bucket bucket)
	{
		return zzafe == bucket.zzafe && zzaSt == bucket.zzaSt && zzaSu == bucket.zzaSu && zzaSw == bucket.zzaSw;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long zzafe>
	//    2    4:aload_1         
	//    3    5:getfield        #49  <Field long zzafe>
	//    4    8:lcmp            
	//    5    9:ifne            48
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field long zzaSt>
	//    8   16:aload_1         
	//    9   17:getfield        #51  <Field long zzaSt>
	//   10   20:lcmp            
	//   11   21:ifne            48
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field int zzaSu>
	//   14   28:aload_1         
	//   15   29:getfield        #55  <Field int zzaSu>
	//   16   32:icmpne          48
	//   17   35:aload_0         
	//   18   36:getfield        #59  <Field int zzaSw>
	//   19   39:aload_1         
	//   20   40:getfield        #59  <Field int zzaSw>
	//   21   43:icmpne          48
	//   22   46:iconst_1        
	//   23   47:ireturn         
	//   24   48:iconst_0        
	//   25   49:ireturn         
	}

	public long zzqn()
	{
		return zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long zzafe>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	public static final int TYPE_ACTIVITY_SEGMENT = 4;
	public static final int TYPE_ACTIVITY_TYPE = 3;
	public static final int TYPE_SESSION = 2;
	public static final int TYPE_TIME = 1;
	private final Session zzaSj;
	private final long zzaSt;
	private final int zzaSu;
	private final List zzaSv;
	private final int zzaSw;
	private boolean zzaSx;
	private final long zzafe;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #35  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void zze()>
	//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
