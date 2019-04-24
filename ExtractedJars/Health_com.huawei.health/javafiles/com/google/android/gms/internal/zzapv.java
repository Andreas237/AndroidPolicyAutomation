// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzapw

public class zzapv extends zza
{

	zzapv(int i, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int zzaiI>
		zzaSs = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field List zzaSs>
	//    8   14:return          
	}

	public List getDataTypes()
	{
		return Collections.unmodifiableList(zzaSs);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List zzaSs>
	//    2    4:invokestatic    #38  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataTypes", ((Object) (zzaSs))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #49  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #51  <String "dataTypes">
	//    3    6:aload_0         
	//    4    7:getfield        #28  <Field List zzaSs>
	//    5   10:invokevirtual   #57  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:invokevirtual   #59  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//    7   16:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzapw.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #65  <Method void com.google.android.gms.internal.zzapw.zza(zzapv, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzapw();
	private final List zzaSs;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #16  <Class zzapw>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzapw()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
