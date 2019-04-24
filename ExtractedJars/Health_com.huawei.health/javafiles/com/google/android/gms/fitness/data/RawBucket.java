// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzv, Bucket, DataSet, RawDataSet, 
//			Session

public final class RawBucket extends zza
{

	public RawBucket(int i, long l, long l1, Session session, int j, 
			List list, int k, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int zzaiI>
		zzafe = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #38  <Field long zzafe>
		zzaSt = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #40  <Field long zzaSt>
		zzaSj = session;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #42  <Field Session zzaSj>
		zzaUa = j;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #44  <Field int zzaUa>
		zzaSv = list;
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:putfield        #46  <Field List zzaSv>
		zzaSw = k;
	//   20   38:aload_0         
	//   21   39:iload           9
	//   22   41:putfield        #48  <Field int zzaSw>
		zzaSx = flag;
	//   23   44:aload_0         
	//   24   45:iload           10
	//   25   47:putfield        #50  <Field boolean zzaSx>
	//   26   50:return          
	}

	public RawBucket(Bucket bucket, List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #36  <Field int zzaiI>
		zzafe = bucket.getStartTime(TimeUnit.MILLISECONDS);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #59  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   14:invokevirtual   #65  <Method long Bucket.getStartTime(TimeUnit)>
	//    9   17:putfield        #38  <Field long zzafe>
		zzaSt = bucket.getEndTime(TimeUnit.MILLISECONDS);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getstatic       #59  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   13   25:invokevirtual   #68  <Method long Bucket.getEndTime(TimeUnit)>
	//   14   28:putfield        #40  <Field long zzaSt>
		zzaSj = bucket.getSession();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #72  <Method Session Bucket.getSession()>
	//   18   36:putfield        #42  <Field Session zzaSj>
		zzaUa = bucket.zzBW();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #76  <Method int Bucket.zzBW()>
	//   22   44:putfield        #44  <Field int zzaUa>
		zzaSw = bucket.getBucketType();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #79  <Method int Bucket.getBucketType()>
	//   26   52:putfield        #48  <Field int zzaSw>
		zzaSx = bucket.zzBX();
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #83  <Method boolean Bucket.zzBX()>
	//   30   60:putfield        #50  <Field boolean zzaSx>
		bucket = ((Bucket) (bucket.getDataSets()));
	//   31   63:aload_1         
	//   32   64:invokevirtual   #87  <Method List Bucket.getDataSets()>
	//   33   67:astore_1        
		zzaSv = ((List) (new ArrayList(((List) (bucket)).size())));
	//   34   68:aload_0         
	//   35   69:new             #89  <Class ArrayList>
	//   36   72:dup             
	//   37   73:aload_1         
	//   38   74:invokeinterface #94  <Method int List.size()>
	//   39   79:invokespecial   #97  <Method void ArrayList(int)>
	//   40   82:putfield        #46  <Field List zzaSv>
		DataSet dataset;
		for(bucket = ((Bucket) (((List) (bucket)).iterator())); ((Iterator) (bucket)).hasNext(); zzaSv.add(((Object) (new RawDataSet(dataset, list, list1)))))
	//*  41   85:aload_1         
	//*  42   86:invokeinterface #101 <Method Iterator List.iterator()>
	//*  43   91:astore_1        
	//*  44   92:aload_1         
	//*  45   93:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  46   98:ifeq            136
			dataset = (DataSet)((Iterator) (bucket)).next();
	//   47  101:aload_1         
	//   48  102:invokeinterface #110 <Method Object Iterator.next()>
	//   49  107:checkcast       #112 <Class DataSet>
	//   50  110:astore          4

	//   51  112:aload_0         
	//   52  113:getfield        #46  <Field List zzaSv>
	//   53  116:new             #114 <Class RawDataSet>
	//   54  119:dup             
	//   55  120:aload           4
	//   56  122:aload_2         
	//   57  123:aload_3         
	//   58  124:invokespecial   #117 <Method void RawDataSet(DataSet, List, List)>
	//   59  127:invokeinterface #121 <Method boolean List.add(Object)>
	//   60  132:pop             
	//*  61  133:goto            92
	//   62  136:return          
	}

	private boolean zza(RawBucket rawbucket)
	{
		return zzafe == rawbucket.zzafe && zzaSt == rawbucket.zzaSt && zzaUa == rawbucket.zzaUa && zzaa.equal(((Object) (zzaSv)), ((Object) (rawbucket.zzaSv))) && zzaSw == rawbucket.zzaSw && zzaSx == rawbucket.zzaSx;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field long zzafe>
	//    2    4:aload_1         
	//    3    5:getfield        #38  <Field long zzafe>
	//    4    8:lcmp            
	//    5    9:ifne            73
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field long zzaSt>
	//    8   16:aload_1         
	//    9   17:getfield        #40  <Field long zzaSt>
	//   10   20:lcmp            
	//   11   21:ifne            73
	//   12   24:aload_0         
	//   13   25:getfield        #44  <Field int zzaUa>
	//   14   28:aload_1         
	//   15   29:getfield        #44  <Field int zzaUa>
	//   16   32:icmpne          73
	//   17   35:aload_0         
	//   18   36:getfield        #46  <Field List zzaSv>
	//   19   39:aload_1         
	//   20   40:getfield        #46  <Field List zzaSv>
	//   21   43:invokestatic    #130 <Method boolean zzaa.equal(Object, Object)>
	//   22   46:ifeq            73
	//   23   49:aload_0         
	//   24   50:getfield        #48  <Field int zzaSw>
	//   25   53:aload_1         
	//   26   54:getfield        #48  <Field int zzaSw>
	//   27   57:icmpne          73
	//   28   60:aload_0         
	//   29   61:getfield        #50  <Field boolean zzaSx>
	//   30   64:aload_1         
	//   31   65:getfield        #50  <Field boolean zzaSx>
	//   32   68:icmpne          73
	//   33   71:iconst_1        
	//   34   72:ireturn         
	//   35   73:iconst_0        
	//   36   74:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof RawBucket) && zza((RawBucket)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class RawBucket>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class RawBucket>
	//    9   17:invokespecial   #133 <Method boolean zza(RawBucket)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Long.valueOf(zzafe), Long.valueOf(zzaSt), Integer.valueOf(zzaSw)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field long zzafe>
	//    6   10:invokestatic    #142 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #40  <Field long zzaSt>
	//   12   20:invokestatic    #142 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #48  <Field int zzaSw>
	//   18   30:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:invokestatic    #150 <Method int zzaa.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("startTime", ((Object) (Long.valueOf(zzafe)))).zzg("endTime", ((Object) (Long.valueOf(zzaSt)))).zzg("activity", ((Object) (Integer.valueOf(zzaUa)))).zzg("dataSets", ((Object) (zzaSv))).zzg("bucketType", ((Object) (Integer.valueOf(zzaSw)))).zzg("serverHasMoreData", ((Object) (Boolean.valueOf(zzaSx)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #156 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #158 <String "startTime">
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field long zzafe>
	//    5   10:invokestatic    #142 <Method Long Long.valueOf(long)>
	//    6   13:invokevirtual   #164 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #166 <String "endTime">
	//    8   18:aload_0         
	//    9   19:getfield        #40  <Field long zzaSt>
	//   10   22:invokestatic    #142 <Method Long Long.valueOf(long)>
	//   11   25:invokevirtual   #164 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #168 <String "activity">
	//   13   30:aload_0         
	//   14   31:getfield        #44  <Field int zzaUa>
	//   15   34:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   16   37:invokevirtual   #164 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   17   40:ldc1            #170 <String "dataSets">
	//   18   42:aload_0         
	//   19   43:getfield        #46  <Field List zzaSv>
	//   20   46:invokevirtual   #164 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   21   49:ldc1            #172 <String "bucketType">
	//   22   51:aload_0         
	//   23   52:getfield        #48  <Field int zzaSw>
	//   24   55:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   25   58:invokevirtual   #164 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   26   61:ldc1            #174 <String "serverHasMoreData">
	//   27   63:aload_0         
	//   28   64:getfield        #50  <Field boolean zzaSx>
	//   29   67:invokestatic    #179 <Method Boolean Boolean.valueOf(boolean)>
	//   30   70:invokevirtual   #164 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   31   73:invokevirtual   #181 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   32   76:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzv.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #186 <Method void com.google.android.gms.fitness.data.zzv.zza(RawBucket, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzv();
	public final Session zzaSj;
	public final long zzaSt;
	public final List zzaSv;
	public final int zzaSw;
	public final boolean zzaSx;
	public final int zzaUa;
	public final long zzafe;
	final int zzaiI;

	static 
	{
	//    0    0:new             #26  <Class zzv>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzv()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
