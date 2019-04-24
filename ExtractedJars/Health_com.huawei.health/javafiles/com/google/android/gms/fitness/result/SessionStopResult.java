// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzs

public class SessionStopResult extends zza
	implements Result
{

	SessionStopResult(int i, Status status, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int zzaiI>
		zzair = status;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field Status zzair>
		zzaVx = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #38  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #40  <Field List zzaVx>
	//   12   22:return          
	}

	public SessionStopResult(Status status, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaiI = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #30  <Field int zzaiI>
		zzair = status;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #32  <Field Status zzair>
		zzaVx = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #38  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #40  <Field List zzaVx>
	//   12   22:return          
	}

	public static SessionStopResult zzaj(Status status)
	{
		return new SessionStopResult(status, Collections.emptyList());
	//    0    0:new             #2   <Class SessionStopResult>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #50  <Method List Collections.emptyList()>
	//    4    8:invokespecial   #52  <Method void SessionStopResult(Status, List)>
	//    5   11:areturn         
	}

	private boolean zzb(SessionStopResult sessionstopresult)
	{
		return zzair.equals(((Object) (sessionstopresult.zzair))) && zzaa.equal(((Object) (zzaVx)), ((Object) (sessionstopresult.zzaVx)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Status zzair>
	//    2    4:aload_1         
	//    3    5:getfield        #32  <Field Status zzair>
	//    4    8:invokevirtual   #60  <Method boolean Status.equals(Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field List zzaVx>
	//    8   18:aload_1         
	//    9   19:getfield        #40  <Field List zzaVx>
	//   10   22:invokestatic    #66  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof SessionStopResult) && zzb((SessionStopResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class SessionStopResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class SessionStopResult>
	//    9   17:invokespecial   #68  <Method boolean zzb(SessionStopResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getSessions()
	{
		return zzaVx;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List zzaVx>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Status zzair>
	//    2    4:areturn         
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
			zzair, zzaVx
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field Status zzair>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #40  <Field List zzaVx>
	//   11   17:aastore         
	//   12   18:invokestatic    #80  <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzair))).zzg("sessions", ((Object) (zzaVx))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #86  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #88  <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field Status zzair>
	//    5   10:invokevirtual   #94  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #96  <String "sessions">
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field List zzaVx>
	//    9   19:invokevirtual   #94  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #98  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzs.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #104 <Method void com.google.android.gms.fitness.result.zzs.zza(SessionStopResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzs();
	private final List zzaVx;
	private final int zzaiI;
	private final Status zzair;

	static 
	{
	//    0    0:new             #20  <Class zzs>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzs()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
