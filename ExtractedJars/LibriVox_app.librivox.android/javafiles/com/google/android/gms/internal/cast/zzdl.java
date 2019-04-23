// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzad;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.cast:
//			ak, aj

public final class zzdl extends AbstractSafeParcelable
{

	public zzdl()
	{
		this((0.0D / 0.0D), false, -1, ((ApplicationMetadata) (null)), -1, ((zzad) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2w           #28  <Double (0.0D / 0.0D)>
	//    2    4:iconst_0        
	//    3    5:iconst_m1       
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:aconst_null     
	//    7    9:invokespecial   #32  <Method void zzdl(double, boolean, int, ApplicationMetadata, int, zzad)>
	//    8   12:return          
	}

	zzdl(double d1, boolean flag, int i, ApplicationMetadata applicationmetadata, int j, zzad zzad)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractSafeParcelable()>
		a = d1;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #35  <Field double a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #37  <Field boolean b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #39  <Field int c>
		d = applicationmetadata;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #41  <Field ApplicationMetadata d>
		e = j;
	//   14   26:aload_0         
	//   15   27:iload           6
	//   16   29:putfield        #43  <Field int e>
		f = zzad;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #45  <Field zzad f>
	//   20   38:return          
	}

	public final double a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field double a>
	//    2    4:dreturn         
	}

	public final boolean b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean b>
	//    2    4:ireturn         
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int c>
	//    2    4:ireturn         
	}

	public final int d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int e>
	//    2    4:ireturn         
	}

	public final ApplicationMetadata e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ApplicationMetadata d>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzdl))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzdl>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzdl)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzdl>
	//   12   20:astore_1        
		if(a == ((zzdl) (obj)).a && b == ((zzdl) (obj)).b && c == ((zzdl) (obj)).c && aj.a(((Object) (d)), ((Object) (((zzdl) (obj)).d))) && e == ((zzdl) (obj)).e)
	//*  13   21:aload_0         
	//*  14   22:getfield        #35  <Field double a>
	//*  15   25:aload_1         
	//*  16   26:getfield        #35  <Field double a>
	//*  17   29:dcmpl           
	//*  18   30:ifne            95
	//*  19   33:aload_0         
	//*  20   34:getfield        #37  <Field boolean b>
	//*  21   37:aload_1         
	//*  22   38:getfield        #37  <Field boolean b>
	//*  23   41:icmpne          95
	//*  24   44:aload_0         
	//*  25   45:getfield        #39  <Field int c>
	//*  26   48:aload_1         
	//*  27   49:getfield        #39  <Field int c>
	//*  28   52:icmpne          95
	//*  29   55:aload_0         
	//*  30   56:getfield        #41  <Field ApplicationMetadata d>
	//*  31   59:aload_1         
	//*  32   60:getfield        #41  <Field ApplicationMetadata d>
	//*  33   63:invokestatic    #56  <Method boolean aj.a(Object, Object)>
	//*  34   66:ifeq            95
	//*  35   69:aload_0         
	//*  36   70:getfield        #43  <Field int e>
	//*  37   73:aload_1         
	//*  38   74:getfield        #43  <Field int e>
	//*  39   77:icmpne          95
		{
			obj = ((Object) (f));
	//   40   80:aload_0         
	//   41   81:getfield        #45  <Field zzad f>
	//   42   84:astore_1        
			if(aj.a(obj, obj))
	//*  43   85:aload_1         
	//*  44   86:aload_1         
	//*  45   87:invokestatic    #56  <Method boolean aj.a(Object, Object)>
	//*  46   90:ifeq            95
				return true;
	//   47   93:iconst_1        
	//   48   94:ireturn         
		}
		return false;
	//   49   95:iconst_0        
	//   50   96:ireturn         
	}

	public final zzad f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field zzad f>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Double.valueOf(a), Boolean.valueOf(b), Integer.valueOf(c), d, Integer.valueOf(e), f
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field double a>
	//    6   11:invokestatic    #66  <Method Double Double.valueOf(double)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #37  <Field boolean b>
	//   12   21:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #39  <Field int c>
	//   18   31:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_3        
	//   22   37:aload_0         
	//   23   38:getfield        #41  <Field ApplicationMetadata d>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #43  <Field int e>
	//   29   48:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #45  <Field zzad f>
	//   35   58:aastore         
	//   36   59:invokestatic    #81  <Method int ak.a(Object[])>
	//   37   62:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field double a>
	//    7   11:invokestatic    #91  <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field boolean b>
	//   12   20:invokestatic    #94  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #39  <Field int c>
	//   17   29:invokestatic    #97  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((android.os.Parcelable) (d)), i, false);
	//   18   32:aload_1         
	//   19   33:iconst_5        
	//   20   34:aload_0         
	//   21   35:getfield        #41  <Field ApplicationMetadata d>
	//   22   38:iload_2         
	//   23   39:iconst_0        
	//   24   40:invokestatic    #100 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e);
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:getfield        #43  <Field int e>
	//   29   50:invokestatic    #97  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ((android.os.Parcelable) (f)), i, false);
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:getfield        #45  <Field zzad f>
	//   34   60:iload_2         
	//   35   61:iconst_0        
	//   36   62:invokestatic    #100 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   37   65:aload_1         
	//   38   66:iload_3         
	//   39   67:invokestatic    #102 <Method void c.a(Parcel, int)>
	//   40   70:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.internal.cast.ak();
	private double a;
	private boolean b;
	private int c;
	private ApplicationMetadata d;
	private int e;
	private zzad f;

	static 
	{
	//    0    0:new             #21  <Class com.google.android.gms.internal.cast.ak>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void com.google.android.gms.internal.cast.ak()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
