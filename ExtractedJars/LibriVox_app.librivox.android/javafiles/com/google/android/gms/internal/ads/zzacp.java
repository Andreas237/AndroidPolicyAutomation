// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bt, zzzw

public final class zzacp extends AbstractSafeParcelable
{

	public zzacp(int i, boolean flag, int j, boolean flag1, int k, zzzw zzzw1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #33  <Field boolean b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #35  <Field int c>
		d = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #37  <Field boolean d>
		e = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #39  <Field int e>
		f = zzzw1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #41  <Field zzzw f>
		g = flag2;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #43  <Field boolean g>
	//   23   43:return          
	}

	public zzacp(e e1)
	{
		boolean flag = e1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method boolean e.a()>
	//    2    4:istore          4
		int i = e1.b();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #52  <Method int e.b()>
	//    5   10:istore_2        
		boolean flag1 = e1.c();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #54  <Method boolean e.c()>
	//    8   15:istore          5
		int j = e1.d();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #56  <Method int e.d()>
	//   11   21:istore_3        
		zzzw zzzw1;
		if(e1.e() != null)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #59  <Method com.google.android.gms.ads.q e.e()>
	//*  14   26:ifnull          45
			zzzw1 = new zzzw(e1.e());
	//   15   29:new             #61  <Class zzzw>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokevirtual   #59  <Method com.google.android.gms.ads.q e.e()>
	//   19   37:invokespecial   #64  <Method void zzzw(com.google.android.gms.ads.q)>
	//   20   40:astore          6
		else
	//*  21   42:goto            48
			zzzw1 = null;
	//   22   45:aconst_null     
	//   23   46:astore          6
		this(3, flag, i, flag1, j, zzzw1, e1.f());
	//   24   48:aload_0         
	//   25   49:iconst_3        
	//   26   50:iload           4
	//   27   52:iload_2         
	//   28   53:iload           5
	//   29   55:iload_3         
	//   30   56:aload           6
	//   31   58:aload_1         
	//   32   59:invokevirtual   #66  <Method boolean e.f()>
	//   33   62:invokespecial   #68  <Method void zzacp(int, boolean, int, boolean, int, zzzw, boolean)>
	//   34   65:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field int a>
	//    7   11:invokestatic    #78  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field boolean b>
	//   12   20:invokestatic    #81  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #35  <Field int c>
	//   17   29:invokestatic    #78  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field boolean d>
	//   22   38:invokestatic    #81  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e);
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:getfield        #39  <Field int e>
	//   27   47:invokestatic    #78  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ((android.os.Parcelable) (f)), i, false);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:getfield        #41  <Field zzzw f>
	//   32   57:iload_2         
	//   33   58:iconst_0        
	//   34   59:invokestatic    #84  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g);
	//   35   62:aload_1         
	//   36   63:bipush          7
	//   37   65:aload_0         
	//   38   66:getfield        #43  <Field boolean g>
	//   39   69:invokestatic    #81  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   40   72:aload_1         
	//   41   73:iload_3         
	//   42   74:invokestatic    #86  <Method void c.a(Parcel, int)>
	//   43   77:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bt();
	public final int a;
	public final boolean b;
	public final int c;
	public final boolean d;
	public final int e;
	public final zzzw f;
	private final boolean g;

	static 
	{
	//    0    0:new             #21  <Class bt>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void bt()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
