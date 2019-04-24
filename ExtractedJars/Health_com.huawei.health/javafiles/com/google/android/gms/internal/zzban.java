// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzbao

public class zzban extends zza
{

	zzban(int i, boolean flag, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int zzaiI>
		zzbEp = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field boolean zzbEp>
		zzbEq = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field List zzbEq>
	//   11   19:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzbao.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #40  <Method void com.google.android.gms.internal.zzbao.zza(zzban, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbao();
	final int zzaiI;
	final boolean zzbEp;
	final List zzbEq;

	static 
	{
	//    0    0:new             #18  <Class zzbao>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzbao()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
