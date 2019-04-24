// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzc

public class DataReadResult extends zza
	implements Result
{

	DataReadResult(int i, List list, Status status, List list1, int j, List list2, List list3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int zzaiI>
		zzair = status;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #39  <Field Status zzair>
		zzaWQ = j;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #41  <Field int zzaWQ>
		zzaWR = list2;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #43  <Field List zzaWR>
		zzaWS = list3;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #45  <Field List zzaWS>
		zzaSv = ((List) (new ArrayList(list.size())));
	//   17   32:aload_0         
	//   18   33:new             #47  <Class ArrayList>
	//   19   36:dup             
	//   20   37:aload_2         
	//   21   38:invokeinterface #53  <Method int List.size()>
	//   22   43:invokespecial   #56  <Method void ArrayList(int)>
	//   23   46:putfield        #58  <Field List zzaSv>
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); zzaSv.add(((Object) (new DataSet(((RawDataSet) (status)), list2)))))
	//*  24   49:aload_2         
	//*  25   50:invokeinterface #62  <Method Iterator List.iterator()>
	//*  26   55:astore_2        
	//*  27   56:aload_2         
	//*  28   57:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  29   62:ifeq            98
			status = ((Status) ((RawDataSet)((Iterator) (list)).next()));
	//   30   65:aload_2         
	//   31   66:invokeinterface #72  <Method Object Iterator.next()>
	//   32   71:checkcast       #74  <Class RawDataSet>
	//   33   74:astore_3        

	//   34   75:aload_0         
	//   35   76:getfield        #58  <Field List zzaSv>
	//   36   79:new             #76  <Class DataSet>
	//   37   82:dup             
	//   38   83:aload_3         
	//   39   84:aload           6
	//   40   86:invokespecial   #79  <Method void DataSet(RawDataSet, List)>
	//   41   89:invokeinterface #83  <Method boolean List.add(Object)>
	//   42   94:pop             
	//*  43   95:goto            56
		zzaWP = ((List) (new ArrayList(list1.size())));
	//   44   98:aload_0         
	//   45   99:new             #47  <Class ArrayList>
	//   46  102:dup             
	//   47  103:aload           4
	//   48  105:invokeinterface #53  <Method int List.size()>
	//   49  110:invokespecial   #56  <Method void ArrayList(int)>
	//   50  113:putfield        #85  <Field List zzaWP>
		for(list = ((List) (list1.iterator())); ((Iterator) (list)).hasNext(); zzaWP.add(((Object) (new Bucket(((RawBucket) (status)), list2)))))
	//*  51  116:aload           4
	//*  52  118:invokeinterface #62  <Method Iterator List.iterator()>
	//*  53  123:astore_2        
	//*  54  124:aload_2         
	//*  55  125:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  56  130:ifeq            166
			status = ((Status) ((RawBucket)((Iterator) (list)).next()));
	//   57  133:aload_2         
	//   58  134:invokeinterface #72  <Method Object Iterator.next()>
	//   59  139:checkcast       #87  <Class RawBucket>
	//   60  142:astore_3        

	//   61  143:aload_0         
	//   62  144:getfield        #85  <Field List zzaWP>
	//   63  147:new             #89  <Class Bucket>
	//   64  150:dup             
	//   65  151:aload_3         
	//   66  152:aload           6
	//   67  154:invokespecial   #92  <Method void Bucket(RawBucket, List)>
	//   68  157:invokeinterface #83  <Method boolean List.add(Object)>
	//   69  162:pop             
	//*  70  163:goto            124
	//   71  166:return          
	}

	public DataReadResult(List list, List list1, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzaiI = 5;
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #37  <Field int zzaiI>
		zzaSv = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #58  <Field List zzaSv>
		zzair = status;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field Status zzair>
		zzaWP = list1;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #85  <Field List zzaWP>
		zzaWQ = 1;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #41  <Field int zzaWQ>
		zzaWR = ((List) (new ArrayList()));
	//   17   29:aload_0         
	//   18   30:new             #47  <Class ArrayList>
	//   19   33:dup             
	//   20   34:invokespecial   #96  <Method void ArrayList()>
	//   21   37:putfield        #43  <Field List zzaWR>
		zzaWS = ((List) (new ArrayList()));
	//   22   40:aload_0         
	//   23   41:new             #47  <Class ArrayList>
	//   24   44:dup             
	//   25   45:invokespecial   #96  <Method void ArrayList()>
	//   26   48:putfield        #45  <Field List zzaWS>
	//   27   51:return          
	}

	public static DataReadResult zza(Status status, List list, List list1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void ArrayList()>
	//    3    7:astore_3        
		for(list1 = ((List) (list1.iterator())); ((Iterator) (list1)).hasNext(); ((List) (arraylist)).add(((Object) (DataSet.create((DataSource)((Iterator) (list1)).next())))));
	//    4    8:aload_2         
	//    5    9:invokeinterface #62  <Method Iterator List.iterator()>
	//    6   14:astore_2        
	//    7   15:aload_2         
	//    8   16:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            46
	//   10   24:aload_3         
	//   11   25:aload_2         
	//   12   26:invokeinterface #72  <Method Object Iterator.next()>
	//   13   31:checkcast       #101 <Class DataSource>
	//   14   34:invokestatic    #105 <Method DataSet DataSet.create(DataSource)>
	//   15   37:invokeinterface #83  <Method boolean List.add(Object)>
	//   16   42:pop             
	//*  17   43:goto            15
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (DataSet.create((new com.google.android.gms.fitness.data.DataSource.Builder()).setDataType(((DataType) (list1))).setType(1).setName("Default").build())))))
	//*  18   46:aload_1         
	//*  19   47:invokeinterface #62  <Method Iterator List.iterator()>
	//*  20   52:astore_1        
	//*  21   53:aload_1         
	//*  22   54:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  23   59:ifeq            108
			list1 = ((List) ((DataType)((Iterator) (list)).next()));
	//   24   62:aload_1         
	//   25   63:invokeinterface #72  <Method Object Iterator.next()>
	//   26   68:checkcast       #107 <Class DataType>
	//   27   71:astore_2        

	//   28   72:aload_3         
	//   29   73:new             #109 <Class com.google.android.gms.fitness.data.DataSource$Builder>
	//   30   76:dup             
	//   31   77:invokespecial   #110 <Method void com.google.android.gms.fitness.data.DataSource$Builder()>
	//   32   80:aload_2         
	//   33   81:invokevirtual   #114 <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setDataType(DataType)>
	//   34   84:iconst_1        
	//   35   85:invokevirtual   #118 <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setType(int)>
	//   36   88:ldc1            #120 <String "Default">
	//   37   90:invokevirtual   #124 <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setName(String)>
	//   38   93:invokevirtual   #128 <Method DataSource com.google.android.gms.fitness.data.DataSource$Builder.build()>
	//   39   96:invokestatic    #105 <Method DataSet DataSet.create(DataSource)>
	//   40   99:invokeinterface #83  <Method boolean List.add(Object)>
	//   41  104:pop             
	//*  42  105:goto            53
		return new DataReadResult(((List) (arraylist)), Collections.emptyList(), status);
	//   43  108:new             #2   <Class DataReadResult>
	//   44  111:dup             
	//   45  112:aload_3         
	//   46  113:invokestatic    #134 <Method List Collections.emptyList()>
	//   47  116:aload_0         
	//   48  117:invokespecial   #136 <Method void DataReadResult(List, List, Status)>
	//   49  120:areturn         
	}

	private void zza(Bucket bucket, List list)
	{
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #62  <Method Iterator List.iterator()>
	//*   2    6:astore_3        
	//*   3    7:aload_3         
	//*   4    8:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            77
		{
			list = ((List) ((Bucket)iterator.next()));
	//    6   16:aload_3         
	//    7   17:invokeinterface #72  <Method Object Iterator.next()>
	//    8   22:checkcast       #89  <Class Bucket>
	//    9   25:astore_2        
			if(((Bucket) (list)).zzb(bucket))
	//*  10   26:aload_2         
	//*  11   27:aload_1         
	//*  12   28:invokevirtual   #142 <Method boolean Bucket.zzb(Bucket)>
	//*  13   31:ifeq            74
			{
				for(bucket = ((Bucket) (bucket.getDataSets().iterator())); ((Iterator) (bucket)).hasNext(); zza((DataSet)((Iterator) (bucket)).next(), ((Bucket) (list)).getDataSets()));
	//   14   34:aload_1         
	//   15   35:invokevirtual   #145 <Method List Bucket.getDataSets()>
	//   16   38:invokeinterface #62  <Method Iterator List.iterator()>
	//   17   43:astore_1        
	//   18   44:aload_1         
	//   19   45:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   20   50:ifeq            73
	//   21   53:aload_0         
	//   22   54:aload_1         
	//   23   55:invokeinterface #72  <Method Object Iterator.next()>
	//   24   60:checkcast       #76  <Class DataSet>
	//   25   63:aload_2         
	//   26   64:invokevirtual   #145 <Method List Bucket.getDataSets()>
	//   27   67:invokespecial   #148 <Method void zza(DataSet, List)>
	//*  28   70:goto            44
				return;
	//   29   73:return          
			}
		}

	//*  30   74:goto            7
		zzaWP.add(((Object) (bucket)));
	//   31   77:aload_0         
	//   32   78:getfield        #85  <Field List zzaWP>
	//   33   81:aload_1         
	//   34   82:invokeinterface #83  <Method boolean List.add(Object)>
	//   35   87:pop             
	//   36   88:return          
	}

	private void zza(DataSet dataset, List list)
	{
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #62  <Method Iterator List.iterator()>
	//*   2    6:astore_3        
	//*   3    7:aload_3         
	//*   4    8:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            55
		{
			DataSet dataset1 = (DataSet)iterator.next();
	//    6   16:aload_3         
	//    7   17:invokeinterface #72  <Method Object Iterator.next()>
	//    8   22:checkcast       #76  <Class DataSet>
	//    9   25:astore          4
			if(dataset1.getDataSource().equals(((Object) (dataset.getDataSource()))))
	//*  10   27:aload           4
	//*  11   29:invokevirtual   #152 <Method DataSource DataSet.getDataSource()>
	//*  12   32:aload_1         
	//*  13   33:invokevirtual   #152 <Method DataSource DataSet.getDataSource()>
	//*  14   36:invokevirtual   #155 <Method boolean DataSource.equals(Object)>
	//*  15   39:ifeq            52
			{
				dataset1.zzb(((Iterable) (dataset.getDataPoints())));
	//   16   42:aload           4
	//   17   44:aload_1         
	//   18   45:invokevirtual   #158 <Method List DataSet.getDataPoints()>
	//   19   48:invokevirtual   #161 <Method void DataSet.zzb(Iterable)>
				return;
	//   20   51:return          
			}
		}

	//*  21   52:goto            7
		list.add(((Object) (dataset)));
	//   22   55:aload_2         
	//   23   56:aload_1         
	//   24   57:invokeinterface #83  <Method boolean List.add(Object)>
	//   25   62:pop             
	//   26   63:return          
	}

	private boolean zzc(DataReadResult datareadresult)
	{
		return zzair.equals(((Object) (datareadresult.zzair))) && zzaa.equal(((Object) (zzaSv)), ((Object) (datareadresult.zzaSv))) && zzaa.equal(((Object) (zzaWP)), ((Object) (datareadresult.zzaWP)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Status zzair>
	//    2    4:aload_1         
	//    3    5:getfield        #39  <Field Status zzair>
	//    4    8:invokevirtual   #167 <Method boolean Status.equals(Object)>
	//    5   11:ifeq            44
	//    6   14:aload_0         
	//    7   15:getfield        #58  <Field List zzaSv>
	//    8   18:aload_1         
	//    9   19:getfield        #58  <Field List zzaSv>
	//   10   22:invokestatic    #173 <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            44
	//   12   28:aload_0         
	//   13   29:getfield        #85  <Field List zzaWP>
	//   14   32:aload_1         
	//   15   33:getfield        #85  <Field List zzaWP>
	//   16   36:invokestatic    #173 <Method boolean zzaa.equal(Object, Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataReadResult) && zzc((DataReadResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataReadResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataReadResult>
	//    9   17:invokespecial   #175 <Method boolean zzc(DataReadResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getBuckets()
	{
		return zzaWP;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List zzaWP>
	//    2    4:areturn         
	}

	public DataSet getDataSet(DataSource datasource)
	{
		for(Iterator iterator = zzaSv.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field List zzaSv>
	//*   2    4:invokeinterface #62  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            45
		{
			DataSet dataset = (DataSet)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #72  <Method Object Iterator.next()>
	//    9   25:checkcast       #76  <Class DataSet>
	//   10   28:astore_3        
			if(datasource.equals(((Object) (dataset.getDataSource()))))
	//*  11   29:aload_1         
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #152 <Method DataSource DataSet.getDataSource()>
	//*  14   34:invokevirtual   #155 <Method boolean DataSource.equals(Object)>
	//*  15   37:ifeq            42
				return dataset;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

	//*  18   42:goto            10
		return DataSet.create(datasource);
	//   19   45:aload_1         
	//   20   46:invokestatic    #105 <Method DataSet DataSet.create(DataSource)>
	//   21   49:areturn         
	}

	public DataSet getDataSet(DataType datatype)
	{
		for(Iterator iterator = zzaSv.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field List zzaSv>
	//*   2    4:invokeinterface #62  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            45
		{
			DataSet dataset = (DataSet)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #72  <Method Object Iterator.next()>
	//    9   25:checkcast       #76  <Class DataSet>
	//   10   28:astore_3        
			if(datatype.equals(((Object) (dataset.getDataType()))))
	//*  11   29:aload_1         
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #183 <Method DataType DataSet.getDataType()>
	//*  14   34:invokevirtual   #184 <Method boolean DataType.equals(Object)>
	//*  15   37:ifeq            42
				return dataset;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

	//*  18   42:goto            10
		return DataSet.create((new com.google.android.gms.fitness.data.DataSource.Builder()).setDataType(datatype).setType(1).build());
	//   19   45:new             #109 <Class com.google.android.gms.fitness.data.DataSource$Builder>
	//   20   48:dup             
	//   21   49:invokespecial   #110 <Method void com.google.android.gms.fitness.data.DataSource$Builder()>
	//   22   52:aload_1         
	//   23   53:invokevirtual   #114 <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setDataType(DataType)>
	//   24   56:iconst_1        
	//   25   57:invokevirtual   #118 <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setType(int)>
	//   26   60:invokevirtual   #128 <Method DataSource com.google.android.gms.fitness.data.DataSource$Builder.build()>
	//   27   63:invokestatic    #105 <Method DataSet DataSet.create(DataSource)>
	//   28   66:areturn         
	}

	public List getDataSets()
	{
		return zzaSv;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field List zzaSv>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Status zzair>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzair, zzaSv, zzaWP
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #39  <Field Status zzair>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #58  <Field List zzaSv>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #85  <Field List zzaWP>
	//   16   24:aastore         
	//   17   25:invokestatic    #194 <Method int zzaa.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		com.google.android.gms.common.internal.zzaa.zza zza1 = zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzair)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #200 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #202 <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field Status zzair>
	//    5   10:invokevirtual   #208 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:astore_3        
		Object obj;
		if(zzaSv.size() > 5)
	//*   7   14:aload_0         
	//*   8   15:getfield        #58  <Field List zzaSv>
	//*   9   18:invokeinterface #53  <Method int List.size()>
	//*  10   23:iconst_5        
	//*  11   24:icmple          62
		{
			int i = zzaSv.size();
	//   12   27:aload_0         
	//   13   28:getfield        #58  <Field List zzaSv>
	//   14   31:invokeinterface #53  <Method int List.size()>
	//   15   36:istore_1        
			obj = ((Object) ((new StringBuilder(21)).append(i).append(" data sets").toString()));
	//   16   37:new             #210 <Class StringBuilder>
	//   17   40:dup             
	//   18   41:bipush          21
	//   19   43:invokespecial   #211 <Method void StringBuilder(int)>
	//   20   46:iload_1         
	//   21   47:invokevirtual   #215 <Method StringBuilder StringBuilder.append(int)>
	//   22   50:ldc1            #217 <String " data sets">
	//   23   52:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   24   55:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   25   58:astore_2        
		} else
	//*  26   59:goto            67
		{
			obj = ((Object) (zzaSv));
	//   27   62:aload_0         
	//   28   63:getfield        #58  <Field List zzaSv>
	//   29   66:astore_2        
		}
		zza1 = zza1.zzg("dataSets", obj);
	//   30   67:aload_3         
	//   31   68:ldc1            #224 <String "dataSets">
	//   32   70:aload_2         
	//   33   71:invokevirtual   #208 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   34   74:astore_3        
		if(zzaWP.size() > 5)
	//*  35   75:aload_0         
	//*  36   76:getfield        #85  <Field List zzaWP>
	//*  37   79:invokeinterface #53  <Method int List.size()>
	//*  38   84:iconst_5        
	//*  39   85:icmple          123
		{
			int j = zzaWP.size();
	//   40   88:aload_0         
	//   41   89:getfield        #85  <Field List zzaWP>
	//   42   92:invokeinterface #53  <Method int List.size()>
	//   43   97:istore_1        
			obj = ((Object) ((new StringBuilder(19)).append(j).append(" buckets").toString()));
	//   44   98:new             #210 <Class StringBuilder>
	//   45  101:dup             
	//   46  102:bipush          19
	//   47  104:invokespecial   #211 <Method void StringBuilder(int)>
	//   48  107:iload_1         
	//   49  108:invokevirtual   #215 <Method StringBuilder StringBuilder.append(int)>
	//   50  111:ldc1            #226 <String " buckets">
	//   51  113:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   53  119:astore_2        
		} else
	//*  54  120:goto            128
		{
			obj = ((Object) (zzaWP));
	//   55  123:aload_0         
	//   56  124:getfield        #85  <Field List zzaWP>
	//   57  127:astore_2        
		}
		return zza1.zzg("buckets", obj).toString();
	//   58  128:aload_3         
	//   59  129:ldc1            #228 <String "buckets">
	//   60  131:aload_2         
	//   61  132:invokevirtual   #208 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   62  135:invokevirtual   #229 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   63  138:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzc.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #234 <Method void com.google.android.gms.fitness.result.zzc.zza(DataReadResult, Parcel, int)>
	//    4    6:return          
	}

	List zzCh()
	{
		return zzaWR;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List zzaWR>
	//    2    4:areturn         
	}

	public int zzDq()
	{
		return zzaWQ;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int zzaWQ>
	//    2    4:ireturn         
	}

	List zzDr()
	{
		ArrayList arraylist = new ArrayList(zzaWP.size());
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field List zzaWP>
	//    4    8:invokeinterface #53  <Method int List.size()>
	//    5   13:invokespecial   #56  <Method void ArrayList(int)>
	//    6   16:astore_1        
		for(Iterator iterator = zzaWP.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (new RawBucket((Bucket)iterator.next(), zzaWR, zzaWS)))));
	//    7   17:aload_0         
	//    8   18:getfield        #85  <Field List zzaWP>
	//    9   21:invokeinterface #62  <Method Iterator List.iterator()>
	//   10   26:astore_2        
	//   11   27:aload_2         
	//   12   28:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            70
	//   14   36:aload_1         
	//   15   37:new             #87  <Class RawBucket>
	//   16   40:dup             
	//   17   41:aload_2         
	//   18   42:invokeinterface #72  <Method Object Iterator.next()>
	//   19   47:checkcast       #89  <Class Bucket>
	//   20   50:aload_0         
	//   21   51:getfield        #43  <Field List zzaWR>
	//   22   54:aload_0         
	//   23   55:getfield        #45  <Field List zzaWS>
	//   24   58:invokespecial   #241 <Method void RawBucket(Bucket, List, List)>
	//   25   61:invokeinterface #83  <Method boolean List.add(Object)>
	//   26   66:pop             
	//*  27   67:goto            27
		return ((List) (arraylist));
	//   28   70:aload_1         
	//   29   71:areturn         
	}

	List zzDs()
	{
		ArrayList arraylist = new ArrayList(zzaSv.size());
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field List zzaSv>
	//    4    8:invokeinterface #53  <Method int List.size()>
	//    5   13:invokespecial   #56  <Method void ArrayList(int)>
	//    6   16:astore_1        
		for(Iterator iterator = zzaSv.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (new RawDataSet((DataSet)iterator.next(), zzaWR, zzaWS)))));
	//    7   17:aload_0         
	//    8   18:getfield        #58  <Field List zzaSv>
	//    9   21:invokeinterface #62  <Method Iterator List.iterator()>
	//   10   26:astore_2        
	//   11   27:aload_2         
	//   12   28:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            70
	//   14   36:aload_1         
	//   15   37:new             #74  <Class RawDataSet>
	//   16   40:dup             
	//   17   41:aload_2         
	//   18   42:invokeinterface #72  <Method Object Iterator.next()>
	//   19   47:checkcast       #76  <Class DataSet>
	//   20   50:aload_0         
	//   21   51:getfield        #43  <Field List zzaWR>
	//   22   54:aload_0         
	//   23   55:getfield        #45  <Field List zzaWS>
	//   24   58:invokespecial   #246 <Method void RawDataSet(DataSet, List, List)>
	//   25   61:invokeinterface #83  <Method boolean List.add(Object)>
	//   26   66:pop             
	//*  27   67:goto            27
		return ((List) (arraylist));
	//   28   70:aload_1         
	//   29   71:areturn         
	}

	List zzDt()
	{
		return zzaWS;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzaWS>
	//    2    4:areturn         
	}

	public void zzb(DataReadResult datareadresult)
	{
		for(Iterator iterator = datareadresult.getDataSets().iterator(); iterator.hasNext(); zza((DataSet)iterator.next(), zzaSv));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #251 <Method List getDataSets()>
	//    2    4:invokeinterface #62  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            39
	//    7   19:aload_0         
	//    8   20:aload_2         
	//    9   21:invokeinterface #72  <Method Object Iterator.next()>
	//   10   26:checkcast       #76  <Class DataSet>
	//   11   29:aload_0         
	//   12   30:getfield        #58  <Field List zzaSv>
	//   13   33:invokespecial   #148 <Method void zza(DataSet, List)>
	//*  14   36:goto            10
		for(datareadresult = ((DataReadResult) (datareadresult.getBuckets().iterator())); ((Iterator) (datareadresult)).hasNext(); zza((Bucket)((Iterator) (datareadresult)).next(), zzaWP));
	//   15   39:aload_1         
	//   16   40:invokevirtual   #253 <Method List getBuckets()>
	//   17   43:invokeinterface #62  <Method Iterator List.iterator()>
	//   18   48:astore_1        
	//   19   49:aload_1         
	//   20   50:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   21   55:ifeq            78
	//   22   58:aload_0         
	//   23   59:aload_1         
	//   24   60:invokeinterface #72  <Method Object Iterator.next()>
	//   25   65:checkcast       #89  <Class Bucket>
	//   26   68:aload_0         
	//   27   69:getfield        #85  <Field List zzaWP>
	//   28   72:invokespecial   #255 <Method void zza(Bucket, List)>
	//*  29   75:goto            49
	//   30   78:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	private final List zzaSv;
	private final List zzaWP;
	private int zzaWQ;
	private final List zzaWR;
	private final List zzaWS;
	private final int zzaiI;
	private final Status zzair;

	static 
	{
	//    0    0:new             #27  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzc()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
