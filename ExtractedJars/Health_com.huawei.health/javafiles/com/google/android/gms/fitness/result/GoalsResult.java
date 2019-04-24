// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzn

public class GoalsResult extends zza
	implements Result
{

	GoalsResult(int i, Status status, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int versionCode>
		zzahw = status;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field Status zzahw>
		zzaXa = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field List zzaXa>
	//   11   19:return          
	}

	public GoalsResult(Status status, List list)
	{
		this(1, status, list);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #39  <Method void GoalsResult(int, Status, List)>
	//    5    7:return          
	}

	public static GoalsResult zzag(Status status)
	{
		return new GoalsResult(status, Collections.emptyList());
	//    0    0:new             #2   <Class GoalsResult>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #48  <Method List Collections.emptyList()>
	//    4    8:invokespecial   #50  <Method void GoalsResult(Status, List)>
	//    5   11:areturn         
	}

	public List getGoals()
	{
		return zzaXa;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List zzaXa>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzahw;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Status zzahw>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int versionCode>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzn.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #62  <Method void com.google.android.gms.fitness.result.zzn.zza(GoalsResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzn();
	private final int versionCode;
	private final List zzaXa;
	private final Status zzahw;

	static 
	{
	//    0    0:new             #20  <Class zzn>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzn()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
