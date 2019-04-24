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
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzo

public class ListSubscriptionsResult extends zza
	implements Result
{

	ListSubscriptionsResult(int i, List list, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int zzaiI>
		zzaXb = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field List zzaXb>
		zzair = status;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field Status zzair>
	//   11   19:return          
	}

	public ListSubscriptionsResult(List list, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaiI = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #30  <Field int zzaiI>
		zzaXb = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #43  <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #32  <Field List zzaXb>
		zzair = (Status)zzac.zzb(((Object) (status)), "status");
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:ldc1            #45  <String "status">
	//   12   21:invokestatic    #51  <Method Object zzac.zzb(Object, Object)>
	//   13   24:checkcast       #53  <Class Status>
	//   14   27:putfield        #34  <Field Status zzair>
	//   15   30:return          
	}

	public static ListSubscriptionsResult zzah(Status status)
	{
		return new ListSubscriptionsResult(Collections.emptyList(), status);
	//    0    0:new             #2   <Class ListSubscriptionsResult>
	//    1    3:dup             
	//    2    4:invokestatic    #60  <Method List Collections.emptyList()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #62  <Method void ListSubscriptionsResult(List, Status)>
	//    5   11:areturn         
	}

	private boolean zzb(ListSubscriptionsResult listsubscriptionsresult)
	{
		return zzair.equals(((Object) (listsubscriptionsresult.zzair))) && zzaa.equal(((Object) (zzaXb)), ((Object) (listsubscriptionsresult.zzaXb)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Status zzair>
	//    2    4:aload_1         
	//    3    5:getfield        #34  <Field Status zzair>
	//    4    8:invokevirtual   #67  <Method boolean Status.equals(Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field List zzaXb>
	//    8   18:aload_1         
	//    9   19:getfield        #32  <Field List zzaXb>
	//   10   22:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof ListSubscriptionsResult) && zzb((ListSubscriptionsResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class ListSubscriptionsResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class ListSubscriptionsResult>
	//    9   17:invokespecial   #75  <Method boolean zzb(ListSubscriptionsResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Status zzair>
	//    2    4:areturn         
	}

	public List getSubscriptions()
	{
		return zzaXb;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List zzaXb>
	//    2    4:areturn         
	}

	public List getSubscriptions(DataType datatype)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #82  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void ArrayList()>
	//    3    7:astore_2        
		Iterator iterator = zzaXb.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field List zzaXb>
	//    6   12:invokeinterface #89  <Method Iterator List.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            62
			Subscription subscription = (Subscription)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #99  <Method Object Iterator.next()>
	//   13   33:checkcast       #101 <Class Subscription>
	//   14   36:astore          4
			if(datatype.equals(((Object) (subscription.zzCA()))))
	//*  15   38:aload_1         
	//*  16   39:aload           4
	//*  17   41:invokevirtual   #105 <Method DataType Subscription.zzCA()>
	//*  18   44:invokevirtual   #108 <Method boolean DataType.equals(Object)>
	//*  19   47:ifeq            59
				((List) (arraylist)).add(((Object) (subscription)));
	//   20   50:aload_2         
	//   21   51:aload           4
	//   22   53:invokeinterface #111 <Method boolean List.add(Object)>
	//   23   58:pop             
		} while(true);
	//   24   59:goto            18
		return Collections.unmodifiableList(((List) (arraylist)));
	//   25   62:aload_2         
	//   26   63:invokestatic    #43  <Method List Collections.unmodifiableList(List)>
	//   27   66:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzair, zzaXb
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field Status zzair>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #32  <Field List zzaXb>
	//   11   17:aastore         
	//   12   18:invokestatic    #120 <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzair))).zzg("subscriptions", ((Object) (zzaXb))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #45  <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #34  <Field Status zzair>
	//    5   10:invokevirtual   #132 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #134 <String "subscriptions">
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field List zzaXb>
	//    9   19:invokevirtual   #132 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #136 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzo.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #142 <Method void com.google.android.gms.fitness.result.zzo.zza(ListSubscriptionsResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzo();
	private final List zzaXb;
	private final int zzaiI;
	private final Status zzair;

	static 
	{
	//    0    0:new             #20  <Class zzo>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzo()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
