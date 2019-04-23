// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ah;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.icing:
//			fk

public final class zzp extends AbstractSafeParcelable
	implements ah
{

	public zzp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void AbstractSafeParcelable()>
	//    2    4:return          
	}

	zzp(Status status, List list, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void AbstractSafeParcelable()>
		a = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Status a>
		b = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field List b>
		c = as;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field String[] c>
	//   11   19:return          
	}

	public final Status b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Status a>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ((android.os.Parcelable) (a)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Status a>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #44  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, b, false);
	//   10   16:aload_1         
	//   11   17:iconst_2        
	//   12   18:aload_0         
	//   13   19:getfield        #31  <Field List b>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #47  <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:getfield        #33  <Field String[] c>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #50  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokestatic    #52  <Method void c.a(Parcel, int)>
	//   25   41:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fk();
	private Status a;
	private List b;
	private String c[];

	static 
	{
	//    0    0:new             #19  <Class fk>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void fk()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
