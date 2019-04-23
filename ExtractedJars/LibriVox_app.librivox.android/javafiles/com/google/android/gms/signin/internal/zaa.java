// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ah;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.signin.internal:
//			b

public final class zaa extends AbstractSafeParcelable
	implements ah
{

	public zaa()
	{
		this(0, ((Intent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void zaa(int, Intent)>
	//    4    6:return          
	}

	zaa(int i, int j, Intent intent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field int b>
		c = intent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field Intent c>
	//   11   19:return          
	}

	private zaa(int i, Intent intent)
	{
		this(2, 0, ((Intent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:invokespecial   #36  <Method void zaa(int, int, Intent)>
	//    5    7:return          
	}

	public final Status b()
	{
		if(b == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field int b>
	//*   2    4:ifne            11
			return Status.a;
	//    3    7:getstatic       #42  <Field Status Status.a>
	//    4   10:areturn         
		else
			return Status.e;
	//    5   11:getstatic       #45  <Field Status Status.e>
	//    6   14:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field int a>
	//    7   11:invokestatic    #55  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field int b>
	//   12   20:invokestatic    #55  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (c)), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #34  <Field Intent c>
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokestatic    #58  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:invokestatic    #60  <Method void c.a(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	private final int a;
	private int b;
	private Intent c;

	static 
	{
	//    0    0:new             #17  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void b()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
