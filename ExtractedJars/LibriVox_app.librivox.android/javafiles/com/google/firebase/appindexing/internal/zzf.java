// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.firebase.appindexing.internal:
//			d

public final class zzf extends AbstractSafeParcelable
{

	public zzf(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int a>
	//    5    9:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field int a>
	//    7   11:invokestatic    #44  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #46  <Method void c.a(Parcel, int)>
	//   11   19:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new d();
	private static final zzf b = new zzf(1);
	private static final zzf c = new zzf(2);
	private static final zzf d = new zzf(3);
	public final int a;

	static 
	{
	//    0    0:new             #2   <Class zzf>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #18  <Method void zzf(int)>
	//    4    8:putstatic       #20  <Field zzf b>
	//    5   11:new             #2   <Class zzf>
	//    6   14:dup             
	//    7   15:iconst_2        
	//    8   16:invokespecial   #18  <Method void zzf(int)>
	//    9   19:putstatic       #22  <Field zzf c>
	//   10   22:new             #2   <Class zzf>
	//   11   25:dup             
	//   12   26:iconst_3        
	//   13   27:invokespecial   #18  <Method void zzf(int)>
	//   14   30:putstatic       #24  <Field zzf d>
	//   15   33:new             #26  <Class d>
	//   16   36:dup             
	//   17   37:invokespecial   #28  <Method void d()>
	//   18   40:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*  19   43:return          
	}
}
