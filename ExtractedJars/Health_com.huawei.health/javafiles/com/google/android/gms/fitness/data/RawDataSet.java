// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzanu;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzx, DataSet

public final class RawDataSet extends zza
{

	public RawDataSet(int i, int j, int k, List list, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int zzaiI>
		zzaUe = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #33  <Field int zzaUe>
		zzaUi = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #35  <Field int zzaUi>
		zzaUj = list;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field List zzaUj>
		zzaSx = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #39  <Field boolean zzaSx>
	//   17   31:return          
	}

	public RawDataSet(DataSet dataset, List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		zzaiI = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #31  <Field int zzaiI>
		zzaUj = dataset.zzC(list);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #48  <Method List DataSet.zzC(List)>
	//    9   15:putfield        #37  <Field List zzaUj>
		zzaSx = dataset.zzBX();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #52  <Method boolean DataSet.zzBX()>
	//   13   23:putfield        #39  <Field boolean zzaSx>
		zzaUe = zzanu.zza(((Object) (dataset.getDataSource())), list);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #56  <Method DataSource DataSet.getDataSource()>
	//   17   31:aload_2         
	//   18   32:invokestatic    #62  <Method int zzanu.zza(Object, List)>
	//   19   35:putfield        #33  <Field int zzaUe>
		zzaUi = zzanu.zza(((Object) (dataset.getDataType())), list1);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #66  <Method DataType DataSet.getDataType()>
	//   23   43:aload_3         
	//   24   44:invokestatic    #62  <Method int zzanu.zza(Object, List)>
	//   25   47:putfield        #35  <Field int zzaUi>
	//   26   50:return          
	}

	private boolean zza(RawDataSet rawdataset)
	{
		return zzaUe == rawdataset.zzaUe && zzaSx == rawdataset.zzaSx && zzaa.equal(((Object) (zzaUj)), ((Object) (rawdataset.zzaUj)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzaUe>
	//    2    4:aload_1         
	//    3    5:getfield        #33  <Field int zzaUe>
	//    4    8:icmpne          38
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field boolean zzaSx>
	//    7   15:aload_1         
	//    8   16:getfield        #39  <Field boolean zzaSx>
	//    9   19:icmpne          38
	//   10   22:aload_0         
	//   11   23:getfield        #37  <Field List zzaUj>
	//   12   26:aload_1         
	//   13   27:getfield        #37  <Field List zzaUj>
	//   14   30:invokestatic    #74  <Method boolean zzaa.equal(Object, Object)>
	//   15   33:ifeq            38
	//   16   36:iconst_1        
	//   17   37:ireturn         
	//   18   38:iconst_0        
	//   19   39:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof RawDataSet) && zza((RawDataSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class RawDataSet>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class RawDataSet>
	//    9   17:invokespecial   #78  <Method boolean zza(RawDataSet)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(zzaUe)
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field int zzaUe>
	//    6   10:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:invokestatic    #91  <Method int zzaa.hashCode(Object[])>
	//    9   17:ireturn         
	}

	public String toString()
	{
		return String.format("RawDataSet{%s@[%s]}", new Object[] {
			Integer.valueOf(zzaUe), zzaUj
		});
	//    0    0:ldc1            #95  <String "RawDataSet{%s@[%s]}">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #33  <Field int zzaUe>
	//    7   12:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #37  <Field List zzaUj>
	//   13   22:aastore         
	//   14   23:invokestatic    #101 <Method String String.format(String, Object[])>
	//   15   26:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzx.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #106 <Method void com.google.android.gms.fitness.data.zzx.zza(RawDataSet, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzx();
	public final boolean zzaSx;
	public final int zzaUe;
	public final int zzaUi;
	public final List zzaUj;
	final int zzaiI;

	static 
	{
	//    0    0:new             #21  <Class zzx>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zzx()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
