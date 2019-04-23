// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			g, CredentialPickerConfig

public final class HintRequest extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	HintRequest(int i, CredentialPickerConfig credentialpickerconfig, boolean flag, boolean flag1, String as[], boolean flag2, String s, 
			String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int a>
		b = (CredentialPickerConfig)am.a(((Object) (credentialpickerconfig)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #40  <Method Object am.a(Object)>
	//    8   14:checkcast       #42  <Class CredentialPickerConfig>
	//    9   17:putfield        #44  <Field CredentialPickerConfig b>
		c = flag;
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:putfield        #46  <Field boolean c>
		d = flag1;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #48  <Field boolean d>
		e = (String[])am.a(((Object) (as)));
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:invokestatic    #40  <Method Object am.a(Object)>
	//   19   37:checkcast       #49  <Class String[]>
	//   20   40:putfield        #51  <Field String[] e>
		if(a < 2)
	//*  21   43:aload_0         
	//*  22   44:getfield        #35  <Field int a>
	//*  23   47:iconst_2        
	//*  24   48:icmpge          67
		{
			f = true;
	//   25   51:aload_0         
	//   26   52:iconst_1        
	//   27   53:putfield        #53  <Field boolean f>
			g = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #55  <Field String g>
			h = null;
	//   31   61:aload_0         
	//   32   62:aconst_null     
	//   33   63:putfield        #57  <Field String h>
			return;
	//   34   66:return          
		} else
		{
			f = flag2;
	//   35   67:aload_0         
	//   36   68:iload           6
	//   37   70:putfield        #53  <Field boolean f>
			g = s;
	//   38   73:aload_0         
	//   39   74:aload           7
	//   40   76:putfield        #55  <Field String g>
			h = s1;
	//   41   79:aload_0         
	//   42   80:aload           8
	//   43   82:putfield        #57  <Field String h>
			return;
	//   44   85:return          
		}
	}

	public final CredentialPickerConfig a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CredentialPickerConfig b>
	//    2    4:areturn         
	}

	public final boolean b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean c>
	//    2    4:ireturn         
	}

	public final String[] c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String[] e>
	//    2    4:areturn         
	}

	public final boolean d()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean f>
	//    2    4:ireturn         
	}

	public final String e()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String g>
	//    2    4:areturn         
	}

	public final String f()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String h>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ((android.os.Parcelable) (a())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #70  <Method CredentialPickerConfig a()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #73  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b());
	//   10   16:aload_1         
	//   11   17:iconst_2        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #75  <Method boolean b()>
	//   14   22:invokestatic    #78  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #48  <Field boolean d>
	//   19   31:invokestatic    #78  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #80  <Method String[] c()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #83  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #85  <Method boolean d()>
	//   30   50:invokestatic    #78  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e(), false);
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:invokevirtual   #87  <Method String e()>
	//   35   60:iconst_0        
	//   36   61:invokestatic    #90  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f(), false);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:invokevirtual   #92  <Method String f()>
	//   41   71:iconst_0        
	//   42   72:invokestatic    #90  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, a);
	//   43   75:aload_1         
	//   44   76:sipush          1000
	//   45   79:aload_0         
	//   46   80:getfield        #35  <Field int a>
	//   47   83:invokestatic    #95  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   48   86:aload_1         
	//   49   87:iload_3         
	//   50   88:invokestatic    #97  <Method void c.a(Parcel, int)>
	//   51   91:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new g();
	private final int a;
	private final CredentialPickerConfig b;
	private final boolean c;
	private final boolean d;
	private final String e[];
	private final boolean f;
	private final String g;
	private final String h;

	static 
	{
	//    0    0:new             #25  <Class g>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void g()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
