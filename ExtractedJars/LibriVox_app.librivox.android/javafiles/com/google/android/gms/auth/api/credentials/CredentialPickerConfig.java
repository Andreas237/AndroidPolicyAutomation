// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			e, a, d

public final class CredentialPickerConfig extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	CredentialPickerConfig(int i, boolean flag, boolean flag1, boolean flag2, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field boolean b>
		c = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #34  <Field boolean c>
		flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
		boolean flag3 = true;
	//   13   21:iconst_1        
	//   14   22:istore          6
		if(i < 2)
	//*  15   24:iload_1         
	//*  16   25:iconst_2        
	//*  17   26:icmpge          51
		{
			d = flag2;
	//   18   29:aload_0         
	//   19   30:iload           4
	//   20   32:putfield        #36  <Field boolean d>
			i = ((int) (flag3));
	//   21   35:iload           6
	//   22   37:istore_1        
			if(flag2)
	//*  23   38:iload           4
	//*  24   40:ifeq            45
				i = 3;
	//   25   43:iconst_3        
	//   26   44:istore_1        
			e = i;
	//   27   45:aload_0         
	//   28   46:iload_1         
	//   29   47:putfield        #38  <Field int e>
			return;
	//   30   50:return          
		}
		if(j != 3)
	//*  31   51:iload           5
	//*  32   53:iconst_3        
	//*  33   54:icmpne          60
	//*  34   57:goto            62
			flag = false;
	//   35   60:iconst_0        
	//   36   61:istore_2        
		d = flag;
	//   37   62:aload_0         
	//   38   63:iload_2         
	//   39   64:putfield        #36  <Field boolean d>
		e = j;
	//   40   67:aload_0         
	//   41   68:iload           5
	//   42   70:putfield        #38  <Field int e>
	//   43   73:return          
	}

	private CredentialPickerConfig(a a1)
	{
		this(2, com.google.android.gms.auth.api.credentials.a.a(a1), com.google.android.gms.auth.api.credentials.a.b(a1), false, com.google.android.gms.auth.api.credentials.a.c(a1));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:invokestatic    #44  <Method boolean a.a(a)>
	//    4    6:aload_1         
	//    5    7:invokestatic    #46  <Method boolean a.b(a)>
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokestatic    #49  <Method int com.google.android.gms.auth.api.credentials.a.c(a)>
	//    9   15:invokespecial   #51  <Method void CredentialPickerConfig(int, boolean, boolean, boolean, int)>
	//   10   18:return          
	}

	CredentialPickerConfig(a a1, d d1)
	{
		this(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void CredentialPickerConfig(a)>
	//    3    5:return          
	}

	public final boolean a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean b>
	//    2    4:ireturn         
	}

	public final boolean b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean c>
	//    2    4:ireturn         
	}

	public final boolean c()
	{
		return e == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int e>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #65  <Method boolean a()>
	//    7   11:invokestatic    #68  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #70  <Method boolean b()>
	//   12   20:invokestatic    #68  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #72  <Method boolean c()>
	//   17   29:invokestatic    #68  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #38  <Field int e>
	//   22   38:invokestatic    #75  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, a);
	//   23   41:aload_1         
	//   24   42:sipush          1000
	//   25   45:aload_0         
	//   26   46:getfield        #30  <Field int a>
	//   27   49:invokestatic    #75  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:invokestatic    #77  <Method void c.a(Parcel, int)>
	//   31   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new e();
	private final int a;
	private final boolean b;
	private final boolean c;
	private final boolean d;
	private final int e;

	static 
	{
	//    0    0:new             #20  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void e()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
