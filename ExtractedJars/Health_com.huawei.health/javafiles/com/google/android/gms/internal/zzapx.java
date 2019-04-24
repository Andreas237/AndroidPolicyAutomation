// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//			zzapy

public class zzapx extends zza
{

	zzapx(int i, DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int zzaiI>
		zzaTi = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field DataSource zzaTi>
	//    8   14:return          
	}

	public DataSource getDataSource()
	{
		return zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return String.format("ApplicationUnregistrationRequest{%s}", new Object[] {
			zzaTi
		});
	//    0    0:ldc1            #35  <String "ApplicationUnregistrationRequest{%s}">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #27  <Field DataSource zzaTi>
	//    7   12:aastore         
	//    8   13:invokestatic    #43  <Method String String.format(String, Object[])>
	//    9   16:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzapy.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #49  <Method void com.google.android.gms.internal.zzapy.zza(zzapx, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzapy();
	private final DataSource zzaTi;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #15  <Class zzapy>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzapy()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
