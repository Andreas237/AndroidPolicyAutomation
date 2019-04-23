// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//			ap

public class AuthAccountRequest extends AbstractSafeParcelable
{

	AuthAccountRequest(int i, IBinder ibinder, Scope ascope[], Integer integer, Integer integer1, Account account)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int a>
		b = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field IBinder b>
		c = ascope;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field Scope[] c>
		d = integer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #38  <Field Integer d>
		e = integer1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #40  <Field Integer e>
		f = account;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #42  <Field Account f>
	//   20   37:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #49  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field int a>
	//    7   11:invokestatic    #52  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field IBinder b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #55  <Method void c.a(Parcel, int, IBinder, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable []) (c)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #36  <Field Scope[] c>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #58  <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #38  <Field Integer d>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #61  <Method void c.a(Parcel, int, Integer, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e, false);
	//   27   45:aload_1         
	//   28   46:iconst_5        
	//   29   47:aload_0         
	//   30   48:getfield        #40  <Field Integer e>
	//   31   51:iconst_0        
	//   32   52:invokestatic    #61  <Method void c.a(Parcel, int, Integer, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ((android.os.Parcelable) (f)), i, false);
	//   33   55:aload_1         
	//   34   56:bipush          6
	//   35   58:aload_0         
	//   36   59:getfield        #42  <Field Account f>
	//   37   62:iload_2         
	//   38   63:iconst_0        
	//   39   64:invokestatic    #64  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   40   67:aload_1         
	//   41   68:iload_3         
	//   42   69:invokestatic    #66  <Method void c.a(Parcel, int)>
	//   43   72:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ap();
	private final int a;
	private final IBinder b;
	private final Scope c[];
	private Integer d;
	private Integer e;
	private Account f;

	static 
	{
	//    0    0:new             #22  <Class ap>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ap()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
