// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzr

public class SessionReadResult extends zza
	implements Result
{

	SessionReadResult(int i, List list, List list1, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int zzaiI>
		zzaVx = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field List zzaVx>
		zzaXd = Collections.unmodifiableList(list1);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #40  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #42  <Field List zzaXd>
		zzair = status;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #44  <Field Status zzair>
	//   15   28:return          
	}

	public SessionReadResult(List list, List list1, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		zzaiI = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #32  <Field int zzaiI>
		zzaVx = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #34  <Field List zzaVx>
		zzaXd = Collections.unmodifiableList(list1);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #40  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #42  <Field List zzaXd>
		zzair = status;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #44  <Field Status zzair>
	//   15   27:return          
	}

	public static SessionReadResult zzai(Status status)
	{
		return new SessionReadResult(((List) (new ArrayList())), ((List) (new ArrayList())), status);
	//    0    0:new             #2   <Class SessionReadResult>
	//    1    3:dup             
	//    2    4:new             #52  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #53  <Method void ArrayList()>
	//    5   11:new             #52  <Class ArrayList>
	//    6   14:dup             
	//    7   15:invokespecial   #53  <Method void ArrayList()>
	//    8   18:aload_0         
	//    9   19:invokespecial   #55  <Method void SessionReadResult(List, List, Status)>
	//   10   22:areturn         
	}

	private boolean zzb(SessionReadResult sessionreadresult)
	{
		return zzair.equals(((Object) (sessionreadresult.zzair))) && zzaa.equal(((Object) (zzaVx)), ((Object) (sessionreadresult.zzaVx))) && zzaa.equal(((Object) (zzaXd)), ((Object) (sessionreadresult.zzaXd)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Status zzair>
	//    2    4:aload_1         
	//    3    5:getfield        #44  <Field Status zzair>
	//    4    8:invokevirtual   #63  <Method boolean Status.equals(Object)>
	//    5   11:ifeq            44
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field List zzaVx>
	//    8   18:aload_1         
	//    9   19:getfield        #34  <Field List zzaVx>
	//   10   22:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            44
	//   12   28:aload_0         
	//   13   29:getfield        #42  <Field List zzaXd>
	//   14   32:aload_1         
	//   15   33:getfield        #42  <Field List zzaXd>
	//   16   36:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof SessionReadResult) && zzb((SessionReadResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class SessionReadResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class SessionReadResult>
	//    9   17:invokespecial   #71  <Method boolean zzb(SessionReadResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getDataSet(Session session)
	{
		zzac.zzb(zzaVx.contains(((Object) (session))), "Attempting to read data for session %s which was not returned", new Object[] {
			session
		});
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List zzaVx>
	//    2    4:aload_1         
	//    3    5:invokeinterface #78  <Method boolean List.contains(Object)>
	//    4   10:ldc1            #80  <String "Attempting to read data for session %s which was not returned">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_1         
	//   10   19:aastore         
	//   11   20:invokestatic    #87  <Method void zzac.zzb(boolean, String, Object[])>
		ArrayList arraylist = new ArrayList();
	//   12   23:new             #52  <Class ArrayList>
	//   13   26:dup             
	//   14   27:invokespecial   #53  <Method void ArrayList()>
	//   15   30:astore_2        
		Iterator iterator = zzaXd.iterator();
	//   16   31:aload_0         
	//   17   32:getfield        #42  <Field List zzaXd>
	//   18   35:invokeinterface #91  <Method Iterator List.iterator()>
	//   19   40:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   41:aload_3         
	//   21   42:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   22   47:ifeq            88
			com.google.android.gms.fitness.data.zzaa zzaa1 = (com.google.android.gms.fitness.data.zzaa)iterator.next();
	//   23   50:aload_3         
	//   24   51:invokeinterface #101 <Method Object Iterator.next()>
	//   25   56:checkcast       #103 <Class com.google.android.gms.fitness.data.zzaa>
	//   26   59:astore          4
			if(zzaa.equal(((Object) (session)), ((Object) (zzaa1.getSession()))))
	//*  27   61:aload_1         
	//*  28   62:aload           4
	//*  29   64:invokevirtual   #107 <Method Session com.google.android.gms.fitness.data.zzaa.getSession()>
	//*  30   67:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//*  31   70:ifeq            85
				((List) (arraylist)).add(((Object) (zzaa1.getDataSet())));
	//   32   73:aload_2         
	//   33   74:aload           4
	//   34   76:invokevirtual   #110 <Method DataSet com.google.android.gms.fitness.data.zzaa.getDataSet()>
	//   35   79:invokeinterface #113 <Method boolean List.add(Object)>
	//   36   84:pop             
		} while(true);
	//   37   85:goto            41
		return ((List) (arraylist));
	//   38   88:aload_2         
	//   39   89:areturn         
	}

	public List getDataSet(Session session, DataType datatype)
	{
		zzac.zzb(zzaVx.contains(((Object) (session))), "Attempting to read data for session %s which was not returned", new Object[] {
			session
		});
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List zzaVx>
	//    2    4:aload_1         
	//    3    5:invokeinterface #78  <Method boolean List.contains(Object)>
	//    4   10:ldc1            #80  <String "Attempting to read data for session %s which was not returned">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_1         
	//   10   19:aastore         
	//   11   20:invokestatic    #87  <Method void zzac.zzb(boolean, String, Object[])>
		ArrayList arraylist = new ArrayList();
	//   12   23:new             #52  <Class ArrayList>
	//   13   26:dup             
	//   14   27:invokespecial   #53  <Method void ArrayList()>
	//   15   30:astore_3        
		Iterator iterator = zzaXd.iterator();
	//   16   31:aload_0         
	//   17   32:getfield        #42  <Field List zzaXd>
	//   18   35:invokeinterface #91  <Method Iterator List.iterator()>
	//   19   40:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   20   42:aload           4
	//   21   44:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   22   49:ifeq            106
			com.google.android.gms.fitness.data.zzaa zzaa1 = (com.google.android.gms.fitness.data.zzaa)iterator.next();
	//   23   52:aload           4
	//   24   54:invokeinterface #101 <Method Object Iterator.next()>
	//   25   59:checkcast       #103 <Class com.google.android.gms.fitness.data.zzaa>
	//   26   62:astore          5
			if(zzaa.equal(((Object) (session)), ((Object) (zzaa1.getSession()))) && datatype.equals(((Object) (zzaa1.getDataSet().getDataType()))))
	//*  27   64:aload_1         
	//*  28   65:aload           5
	//*  29   67:invokevirtual   #107 <Method Session com.google.android.gms.fitness.data.zzaa.getSession()>
	//*  30   70:invokestatic    #69  <Method boolean zzaa.equal(Object, Object)>
	//*  31   73:ifeq            103
	//*  32   76:aload_2         
	//*  33   77:aload           5
	//*  34   79:invokevirtual   #110 <Method DataSet com.google.android.gms.fitness.data.zzaa.getDataSet()>
	//*  35   82:invokevirtual   #121 <Method DataType DataSet.getDataType()>
	//*  36   85:invokevirtual   #124 <Method boolean DataType.equals(Object)>
	//*  37   88:ifeq            103
				((List) (arraylist)).add(((Object) (zzaa1.getDataSet())));
	//   38   91:aload_3         
	//   39   92:aload           5
	//   40   94:invokevirtual   #110 <Method DataSet com.google.android.gms.fitness.data.zzaa.getDataSet()>
	//   41   97:invokeinterface #113 <Method boolean List.add(Object)>
	//   42  102:pop             
		} while(true);
	//   43  103:goto            42
		return ((List) (arraylist));
	//   44  106:aload_3         
	//   45  107:areturn         
	}

	public List getSessions()
	{
		return zzaVx;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List zzaVx>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Status zzair>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzair, zzaVx, zzaXd
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field Status zzair>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #34  <Field List zzaVx>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #42  <Field List zzaXd>
	//   16   24:aastore         
	//   17   25:invokestatic    #136 <Method int zzaa.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzair))).zzg("sessions", ((Object) (zzaVx))).zzg("sessionDataSets", ((Object) (zzaXd))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #142 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #144 <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #44  <Field Status zzair>
	//    5   10:invokevirtual   #150 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #152 <String "sessions">
	//    7   15:aload_0         
	//    8   16:getfield        #34  <Field List zzaVx>
	//    9   19:invokevirtual   #150 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #154 <String "sessionDataSets">
	//   11   24:aload_0         
	//   12   25:getfield        #42  <Field List zzaXd>
	//   13   28:invokevirtual   #150 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   31:invokevirtual   #156 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   15   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzr.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #162 <Method void com.google.android.gms.fitness.result.zzr.zza(SessionReadResult, Parcel, int)>
	//    4    6:return          
	}

	public List zzDx()
	{
		return zzaXd;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List zzaXd>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzr();
	private final List zzaVx;
	private final List zzaXd;
	private final int zzaiI;
	private final Status zzair;

	static 
	{
	//    0    0:new             #22  <Class zzr>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzr()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
