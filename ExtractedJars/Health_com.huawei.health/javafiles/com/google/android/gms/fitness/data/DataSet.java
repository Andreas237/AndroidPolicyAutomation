// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzanz;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzi, DataSource, RawDataPoint, DataPoint, 
//			RawDataSet, zzf, DataType

public final class DataSet extends zza
	implements ReflectedParcelable
{

	DataSet(int i, DataSource datasource, DataType datatype, List list, List list1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaSI = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean zzaSI>
		versionCode = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #38  <Field int versionCode>
		zzaSh = datasource;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #40  <Field DataSource zzaSh>
		zzaSg = datasource.getDataType();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #46  <Method DataType DataSource.getDataType()>
	//   14   24:putfield        #48  <Field DataType zzaSg>
		zzaSI = flag;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #36  <Field boolean zzaSI>
		zzaSG = ((List) (new ArrayList(list.size())));
	//   18   33:aload_0         
	//   19   34:new             #50  <Class ArrayList>
	//   20   37:dup             
	//   21   38:aload           4
	//   22   40:invokeinterface #56  <Method int List.size()>
	//   23   45:invokespecial   #59  <Method void ArrayList(int)>
	//   24   48:putfield        #61  <Field List zzaSG>
		if(i < 2)
	//*  25   51:iload_1         
	//*  26   52:iconst_2        
	//*  27   53:icmplt          59
	//*  28   56:goto            65
			list1 = Collections.singletonList(((Object) (datasource)));
	//   29   59:aload_2         
	//   30   60:invokestatic    #67  <Method List Collections.singletonList(Object)>
	//   31   63:astore          5
		zzaSH = list1;
	//   32   65:aload_0         
	//   33   66:aload           5
	//   34   68:putfield        #69  <Field List zzaSH>
		for(datasource = ((DataSource) (list.iterator())); ((Iterator) (datasource)).hasNext(); zzaSG.add(((Object) (new DataPoint(zzaSH, ((RawDataPoint) (datatype)))))))
	//*  35   71:aload           4
	//*  36   73:invokeinterface #73  <Method Iterator List.iterator()>
	//*  37   78:astore_2        
	//*  38   79:aload_2         
	//*  39   80:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  40   85:ifeq            123
			datatype = ((DataType) ((RawDataPoint)((Iterator) (datasource)).next()));
	//   41   88:aload_2         
	//   42   89:invokeinterface #83  <Method Object Iterator.next()>
	//   43   94:checkcast       #85  <Class RawDataPoint>
	//   44   97:astore_3        

	//   45   98:aload_0         
	//   46   99:getfield        #61  <Field List zzaSG>
	//   47  102:new             #87  <Class DataPoint>
	//   48  105:dup             
	//   49  106:aload_0         
	//   50  107:getfield        #69  <Field List zzaSH>
	//   51  110:aload_3         
	//   52  111:invokespecial   #90  <Method void DataPoint(List, RawDataPoint)>
	//   53  114:invokeinterface #94  <Method boolean List.add(Object)>
	//   54  119:pop             
	//*  55  120:goto            79
	//   56  123:return          
	}

	public DataSet(DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaSI = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean zzaSI>
		versionCode = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #38  <Field int versionCode>
		zzaSh = (DataSource)zzac.zzw(((Object) (datasource)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #103 <Method Object zzac.zzw(Object)>
	//   11   19:checkcast       #42  <Class DataSource>
	//   12   22:putfield        #40  <Field DataSource zzaSh>
		zzaSg = datasource.getDataType();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #46  <Method DataType DataSource.getDataType()>
	//   16   30:putfield        #48  <Field DataType zzaSg>
		zzaSG = ((List) (new ArrayList()));
	//   17   33:aload_0         
	//   18   34:new             #50  <Class ArrayList>
	//   19   37:dup             
	//   20   38:invokespecial   #104 <Method void ArrayList()>
	//   21   41:putfield        #61  <Field List zzaSG>
		zzaSH = ((List) (new ArrayList()));
	//   22   44:aload_0         
	//   23   45:new             #50  <Class ArrayList>
	//   24   48:dup             
	//   25   49:invokespecial   #104 <Method void ArrayList()>
	//   26   52:putfield        #69  <Field List zzaSH>
		zzaSH.add(((Object) (zzaSh)));
	//   27   55:aload_0         
	//   28   56:getfield        #69  <Field List zzaSH>
	//   29   59:aload_0         
	//   30   60:getfield        #40  <Field DataSource zzaSh>
	//   31   63:invokeinterface #94  <Method boolean List.add(Object)>
	//   32   68:pop             
	//   33   69:return          
	}

	public DataSet(RawDataSet rawdataset, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaSI = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean zzaSI>
		versionCode = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #38  <Field int versionCode>
		zzaSh = (DataSource)zzd(list, rawdataset.zzaUe);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:getfield        #110 <Field int RawDataSet.zzaUe>
	//   12   20:invokestatic    #114 <Method Object zzd(List, int)>
	//   13   23:checkcast       #42  <Class DataSource>
	//   14   26:putfield        #40  <Field DataSource zzaSh>
		zzaSg = zzaSh.getDataType();
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #40  <Field DataSource zzaSh>
	//   18   34:invokevirtual   #46  <Method DataType DataSource.getDataType()>
	//   19   37:putfield        #48  <Field DataType zzaSg>
		zzaSH = list;
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:putfield        #69  <Field List zzaSH>
		zzaSI = rawdataset.zzaSx;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getfield        #117 <Field boolean RawDataSet.zzaSx>
	//   26   50:putfield        #36  <Field boolean zzaSI>
		rawdataset = ((RawDataSet) (rawdataset.zzaUj));
	//   27   53:aload_1         
	//   28   54:getfield        #120 <Field List RawDataSet.zzaUj>
	//   29   57:astore_1        
		zzaSG = ((List) (new ArrayList(((List) (rawdataset)).size())));
	//   30   58:aload_0         
	//   31   59:new             #50  <Class ArrayList>
	//   32   62:dup             
	//   33   63:aload_1         
	//   34   64:invokeinterface #56  <Method int List.size()>
	//   35   69:invokespecial   #59  <Method void ArrayList(int)>
	//   36   72:putfield        #61  <Field List zzaSG>
		for(rawdataset = ((RawDataSet) (((List) (rawdataset)).iterator())); ((Iterator) (rawdataset)).hasNext(); zzaSG.add(((Object) (new DataPoint(zzaSH, ((RawDataPoint) (list)))))))
	//*  37   75:aload_1         
	//*  38   76:invokeinterface #73  <Method Iterator List.iterator()>
	//*  39   81:astore_1        
	//*  40   82:aload_1         
	//*  41   83:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  42   88:ifeq            126
			list = ((List) ((RawDataPoint)((Iterator) (rawdataset)).next()));
	//   43   91:aload_1         
	//   44   92:invokeinterface #83  <Method Object Iterator.next()>
	//   45   97:checkcast       #85  <Class RawDataPoint>
	//   46  100:astore_2        

	//   47  101:aload_0         
	//   48  102:getfield        #61  <Field List zzaSG>
	//   49  105:new             #87  <Class DataPoint>
	//   50  108:dup             
	//   51  109:aload_0         
	//   52  110:getfield        #69  <Field List zzaSH>
	//   53  113:aload_2         
	//   54  114:invokespecial   #90  <Method void DataPoint(List, RawDataPoint)>
	//   55  117:invokeinterface #94  <Method boolean List.add(Object)>
	//   56  122:pop             
	//*  57  123:goto            82
	//   58  126:return          
	}

	public static DataSet create(DataSource datasource)
	{
		zzac.zzb(((Object) (datasource)), "DataSource should be specified");
	//    0    0:aload_0         
	//    1    1:ldc1            #125 <String "DataSource should be specified">
	//    2    3:invokestatic    #129 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		return new DataSet(datasource);
	//    4    7:new             #2   <Class DataSet>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:invokespecial   #131 <Method void DataSet(DataSource)>
	//    8   15:areturn         
	}

	private boolean zza(DataSet dataset)
	{
		return zzaa.equal(((Object) (getDataType())), ((Object) (dataset.getDataType()))) && zzaa.equal(((Object) (zzaSh)), ((Object) (dataset.zzaSh))) && zzaa.equal(((Object) (zzaSG)), ((Object) (dataset.zzaSG))) && zzaSI == dataset.zzaSI;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method DataType getDataType()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method DataType getDataType()>
	//    4    8:invokestatic    #140 <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            55
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field DataSource zzaSh>
	//    8   18:aload_1         
	//    9   19:getfield        #40  <Field DataSource zzaSh>
	//   10   22:invokestatic    #140 <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            55
	//   12   28:aload_0         
	//   13   29:getfield        #61  <Field List zzaSG>
	//   14   32:aload_1         
	//   15   33:getfield        #61  <Field List zzaSG>
	//   16   36:invokestatic    #140 <Method boolean zzaa.equal(Object, Object)>
	//   17   39:ifeq            55
	//   18   42:aload_0         
	//   19   43:getfield        #36  <Field boolean zzaSI>
	//   20   46:aload_1         
	//   21   47:getfield        #36  <Field boolean zzaSI>
	//   22   50:icmpne          55
	//   23   53:iconst_1        
	//   24   54:ireturn         
	//   25   55:iconst_0        
	//   26   56:ireturn         
	}

	private static Object zzd(List list, int i)
	{
		if(i >= 0 && i < list.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            22
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #56  <Method int List.size()>
	//*   5   11:icmpge          22
			return list.get(i);
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokeinterface #144 <Method Object List.get(int)>
	//    9   21:areturn         
		else
			return ((Object) (null));
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	public static void zze(DataPoint datapoint)
		throws IllegalArgumentException
	{
		String s = zzanz.zza(((Object) (datapoint)), ((com.google.android.gms.internal.zzanv) (zzf.zzaSy)));
	//    0    0:aload_0         
	//    1    1:getstatic       #155 <Field zzf zzf.zzaSy>
	//    2    4:invokestatic    #160 <Method String zzanz.zza(Object, com.google.android.gms.internal.zzanv)>
	//    3    7:astore_1        
		if(s != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          61
		{
			datapoint = ((DataPoint) (String.valueOf(((Object) (datapoint)))));
	//    6   12:aload_0         
	//    7   13:invokestatic    #166 <Method String String.valueOf(Object)>
	//    8   16:astore_0        
			Log.w("Fitness", (new StringBuilder(String.valueOf(((Object) (datapoint))).length() + 20)).append("Invalid data point: ").append(((String) (datapoint))).toString());
	//    9   17:ldc1            #168 <String "Fitness">
	//   10   19:new             #170 <Class StringBuilder>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokestatic    #166 <Method String String.valueOf(Object)>
	//   14   27:invokevirtual   #173 <Method int String.length()>
	//   15   30:bipush          20
	//   16   32:iadd            
	//   17   33:invokespecial   #174 <Method void StringBuilder(int)>
	//   18   36:ldc1            #176 <String "Invalid data point: ">
	//   19   38:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:aload_0         
	//   21   42:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #190 <Method int Log.w(String, String)>
	//   24   51:pop             
			throw new IllegalArgumentException(s);
	//   25   52:new             #149 <Class IllegalArgumentException>
	//   26   55:dup             
	//   27   56:aload_1         
	//   28   57:invokespecial   #193 <Method void IllegalArgumentException(String)>
	//   29   60:athrow          
		} else
		{
			return;
	//   30   61:return          
		}
	}

	public void add(DataPoint datapoint)
	{
		DataSource datasource = datapoint.getDataSource();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #198 <Method DataSource DataPoint.getDataSource()>
	//    2    4:astore_2        
		zzac.zzb(datasource.getStreamIdentifier().equals(((Object) (zzaSh.getStreamIdentifier()))), "Conflicting data sources found %s vs %s", new Object[] {
			datasource, zzaSh
		});
	//    3    5:aload_2         
	//    4    6:invokevirtual   #201 <Method String DataSource.getStreamIdentifier()>
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field DataSource zzaSh>
	//    7   13:invokevirtual   #201 <Method String DataSource.getStreamIdentifier()>
	//    8   16:invokevirtual   #204 <Method boolean String.equals(Object)>
	//    9   19:ldc1            #206 <String "Conflicting data sources found %s vs %s">
	//   10   21:iconst_2        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_2         
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:aload_0         
	//   19   32:getfield        #40  <Field DataSource zzaSh>
	//   20   35:aastore         
	//   21   36:invokestatic    #211 <Method void zzac.zzb(boolean, String, Object[])>
		datapoint.zzCe();
	//   22   39:aload_1         
	//   23   40:invokevirtual   #214 <Method void DataPoint.zzCe()>
		zze(datapoint);
	//   24   43:aload_1         
	//   25   44:invokestatic    #216 <Method void zze(DataPoint)>
		zzd(datapoint);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #218 <Method void zzd(DataPoint)>
	//   29   52:return          
	}

	public void addAll(Iterable iterable)
	{
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); add((DataPoint)((Iterator) (iterable)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #223 <Method Iterator Iterable.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            32
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #83  <Method Object Iterator.next()>
	//    9   23:checkcast       #87  <Class DataPoint>
	//   10   26:invokevirtual   #225 <Method void add(DataPoint)>
	//*  11   29:goto            7
	//   12   32:return          
	}

	public DataPoint createDataPoint()
	{
		return DataPoint.create(zzaSh);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataSource zzaSh>
	//    2    4:invokestatic    #231 <Method DataPoint DataPoint.create(DataSource)>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof DataSet) && zza((DataSet)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataSet>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataSet>
	//    9   17:invokespecial   #233 <Method boolean zza(DataSet)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getDataPoints()
	{
		return Collections.unmodifiableList(zzaSG);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List zzaSG>
	//    2    4:invokestatic    #239 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public DataSource getDataSource()
	{
		return zzaSh;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataSource zzaSh>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaSh.getDataType();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataSource zzaSh>
	//    2    4:invokevirtual   #46  <Method DataType DataSource.getDataType()>
	//    3    7:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaSh
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field DataSource zzaSh>
	//    6   10:aastore         
	//    7   11:invokestatic    #245 <Method int zzaa.hashCode(Object[])>
	//    8   14:ireturn         
	}

	public boolean isEmpty()
	{
		return zzaSG.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List zzaSG>
	//    2    4:invokeinterface #248 <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		Object obj = ((Object) (zzCg()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method List zzCg()>
	//    2    4:astore_1        
		String s = zzaSh.toDebugString();
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field DataSource zzaSh>
	//    5    9:invokevirtual   #254 <Method String DataSource.toDebugString()>
	//    6   12:astore_2        
		if(zzaSG.size() >= 10)
	//*   7   13:aload_0         
	//*   8   14:getfield        #61  <Field List zzaSG>
	//*   9   17:invokeinterface #56  <Method int List.size()>
	//*  10   22:bipush          10
	//*  11   24:icmpge          30
	//*  12   27:goto            67
			obj = ((Object) (String.format("%d data points, first 5: %s", new Object[] {
				Integer.valueOf(zzaSG.size()), ((List) (obj)).subList(0, 5)
			})));
	//   13   30:ldc2            #256 <String "%d data points, first 5: %s">
	//   14   33:iconst_2        
	//   15   34:anewarray       Object[]
	//   16   37:dup             
	//   17   38:iconst_0        
	//   18   39:aload_0         
	//   19   40:getfield        #61  <Field List zzaSG>
	//   20   43:invokeinterface #56  <Method int List.size()>
	//   21   48:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   22   51:aastore         
	//   23   52:dup             
	//   24   53:iconst_1        
	//   25   54:aload_1         
	//   26   55:iconst_0        
	//   27   56:iconst_5        
	//   28   57:invokeinterface #265 <Method List List.subList(int, int)>
	//   29   62:aastore         
	//   30   63:invokestatic    #269 <Method String String.format(String, Object[])>
	//   31   66:astore_1        
		return String.format("DataSet{%s %s}", new Object[] {
			s, obj
		});
	//   32   67:ldc2            #271 <String "DataSet{%s %s}">
	//   33   70:iconst_2        
	//   34   71:anewarray       Object[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_2         
	//   38   77:aastore         
	//   39   78:dup             
	//   40   79:iconst_1        
	//   41   80:aload_1         
	//   42   81:aastore         
	//   43   82:invokestatic    #269 <Method String String.format(String, Object[])>
	//   44   85:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzi.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #276 <Method void com.google.android.gms.fitness.data.zzi.zza(DataSet, Parcel, int)>
	//    4    6:return          
	}

	public boolean zzBX()
	{
		return zzaSI;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzaSI>
	//    2    4:ireturn         
	}

	List zzC(List list)
	{
		ArrayList arraylist = new ArrayList(zzaSG.size());
	//    0    0:new             #50  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field List zzaSG>
	//    4    8:invokeinterface #56  <Method int List.size()>
	//    5   13:invokespecial   #59  <Method void ArrayList(int)>
	//    6   16:astore_2        
		for(Iterator iterator = zzaSG.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (new RawDataPoint((DataPoint)iterator.next(), list)))));
	//    7   17:aload_0         
	//    8   18:getfield        #61  <Field List zzaSG>
	//    9   21:invokeinterface #73  <Method Iterator List.iterator()>
	//   10   26:astore_3        
	//   11   27:aload_3         
	//   12   28:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            63
	//   14   36:aload_2         
	//   15   37:new             #85  <Class RawDataPoint>
	//   16   40:dup             
	//   17   41:aload_3         
	//   18   42:invokeinterface #83  <Method Object Iterator.next()>
	//   19   47:checkcast       #87  <Class DataPoint>
	//   20   50:aload_1         
	//   21   51:invokespecial   #281 <Method void RawDataPoint(DataPoint, List)>
	//   22   54:invokeinterface #94  <Method boolean List.add(Object)>
	//   23   59:pop             
	//*  24   60:goto            27
		return ((List) (arraylist));
	//   25   63:aload_2         
	//   26   64:areturn         
	}

	List zzCg()
	{
		return zzC(zzaSH);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #69  <Field List zzaSH>
	//    3    5:invokevirtual   #284 <Method List zzC(List)>
	//    4    8:areturn         
	}

	List zzCh()
	{
		return zzaSH;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List zzaSH>
	//    2    4:areturn         
	}

	public void zzb(Iterable iterable)
	{
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); zzd((DataPoint)((Iterator) (iterable)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #223 <Method Iterator Iterable.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            32
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #83  <Method Object Iterator.next()>
	//    9   23:checkcast       #87  <Class DataPoint>
	//   10   26:invokevirtual   #218 <Method void zzd(DataPoint)>
	//*  11   29:goto            7
	//   12   32:return          
	}

	public void zzd(DataPoint datapoint)
	{
		zzaSG.add(((Object) (datapoint)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List zzaSG>
	//    2    4:aload_1         
	//    3    5:invokeinterface #94  <Method boolean List.add(Object)>
	//    4   10:pop             
		datapoint = ((DataPoint) (datapoint.getOriginalDataSource()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #290 <Method DataSource DataPoint.getOriginalDataSource()>
	//    7   15:astore_1        
		if(datapoint != null && !zzaSH.contains(((Object) (datapoint))))
	//*   8   16:aload_1         
	//*   9   17:ifnull          44
	//*  10   20:aload_0         
	//*  11   21:getfield        #69  <Field List zzaSH>
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #293 <Method boolean List.contains(Object)>
	//*  14   30:ifne            44
			zzaSH.add(((Object) (datapoint)));
	//   15   33:aload_0         
	//   16   34:getfield        #69  <Field List zzaSH>
	//   17   37:aload_1         
	//   18   38:invokeinterface #94  <Method boolean List.add(Object)>
	//   19   43:pop             
	//   20   44:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	private final int versionCode;
	private final List zzaSG;
	private final List zzaSH;
	private boolean zzaSI;
	private final DataType zzaSg;
	private final DataSource zzaSh;

	static 
	{
	//    0    0:new             #26  <Class zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzi()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
