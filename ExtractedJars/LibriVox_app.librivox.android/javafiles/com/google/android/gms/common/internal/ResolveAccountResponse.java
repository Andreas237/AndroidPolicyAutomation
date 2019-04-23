// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//			ax, ac, ab

public class ResolveAccountResponse extends AbstractSafeParcelable
{

	ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int a>
		b = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field IBinder b>
		c = connectionresult;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field ConnectionResult c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #35  <Field boolean d>
		e = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #37  <Field boolean e>
	//   17   31:return          
	}

	public ab a()
	{
		return ac.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IBinder b>
	//    2    4:invokestatic    #43  <Method ab ac.a(IBinder)>
	//    3    7:areturn         
	}

	public ConnectionResult b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ConnectionResult c>
	//    2    4:areturn         
	}

	public boolean c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ResolveAccountResponse))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ResolveAccountResponse>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ResolveAccountResponse)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ResolveAccountResponse>
	//   12   20:astore_1        
		return c.equals(((Object) (((ResolveAccountResponse) (obj)).c))) && ((Object) (a())).equals(((Object) (((ResolveAccountResponse) (obj)).a())));
	//   13   21:aload_0         
	//   14   22:getfield        #33  <Field ConnectionResult c>
	//   15   25:aload_1         
	//   16   26:getfield        #33  <Field ConnectionResult c>
	//   17   29:invokevirtual   #51  <Method boolean ConnectionResult.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:invokevirtual   #53  <Method ab a()>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #53  <Method ab a()>
	//   23   43:invokevirtual   #56  <Method boolean Object.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field int a>
	//    7   11:invokestatic    #66  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field IBinder b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #69  <Method void c.a(Parcel, int, IBinder, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (b())), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #71  <Method ConnectionResult b()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #74  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #76  <Method boolean c()>
	//   25   41:invokestatic    #79  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #81  <Method boolean d()>
	//   30   50:invokestatic    #79  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   31   53:aload_1         
	//   32   54:iload_3         
	//   33   55:invokestatic    #83  <Method void c.a(Parcel, int)>
	//   34   58:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ax();
	private final int a;
	private IBinder b;
	private ConnectionResult c;
	private boolean d;
	private boolean e;

	static 
	{
	//    0    0:new             #19  <Class ax>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ax()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
