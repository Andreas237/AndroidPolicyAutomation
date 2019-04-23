// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			f, a, CredentialPickerConfig

public final class CredentialRequest extends AbstractSafeParcelable
{

	CredentialRequest(int j, boolean flag, String as[], CredentialPickerConfig credentialpickerconfig, CredentialPickerConfig credentialpickerconfig1, boolean flag1, String s, 
			String s1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
		a = j;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field boolean b>
		c = (String[])am.a(((Object) (as)));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #41  <Method Object am.a(Object)>
	//   11   19:checkcast       #42  <Class String[]>
	//   12   22:putfield        #44  <Field String[] c>
		as = ((String []) (credentialpickerconfig));
	//   13   25:aload           4
	//   14   27:astore_3        
		if(credentialpickerconfig == null)
	//*  15   28:aload           4
	//*  16   30:ifnonnull       44
			as = ((String []) ((new a()).a()));
	//   17   33:new             #46  <Class a>
	//   18   36:dup             
	//   19   37:invokespecial   #47  <Method void a()>
	//   20   40:invokevirtual   #50  <Method CredentialPickerConfig a.a()>
	//   21   43:astore_3        
		d = ((CredentialPickerConfig) (as));
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:putfield        #52  <Field CredentialPickerConfig d>
		as = ((String []) (credentialpickerconfig1));
	//   25   49:aload           5
	//   26   51:astore_3        
		if(credentialpickerconfig1 == null)
	//*  27   52:aload           5
	//*  28   54:ifnonnull       68
			as = ((String []) ((new a()).a()));
	//   29   57:new             #46  <Class a>
	//   30   60:dup             
	//   31   61:invokespecial   #47  <Method void a()>
	//   32   64:invokevirtual   #50  <Method CredentialPickerConfig a.a()>
	//   33   67:astore_3        
		e = ((CredentialPickerConfig) (as));
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:putfield        #54  <Field CredentialPickerConfig e>
		if(j < 3)
	//*  37   73:iload_1         
	//*  38   74:iconst_3        
	//*  39   75:icmpge          96
		{
			f = true;
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:putfield        #56  <Field boolean f>
			g = null;
	//   43   83:aload_0         
	//   44   84:aconst_null     
	//   45   85:putfield        #58  <Field String g>
			h = null;
	//   46   88:aload_0         
	//   47   89:aconst_null     
	//   48   90:putfield        #60  <Field String h>
		} else
	//*  49   93:goto            114
		{
			f = flag1;
	//   50   96:aload_0         
	//   51   97:iload           6
	//   52   99:putfield        #56  <Field boolean f>
			g = s;
	//   53  102:aload_0         
	//   54  103:aload           7
	//   55  105:putfield        #58  <Field String g>
			h = s1;
	//   56  108:aload_0         
	//   57  109:aload           8
	//   58  111:putfield        #60  <Field String h>
		}
		i = flag2;
	//   59  114:aload_0         
	//   60  115:iload           9
	//   61  117:putfield        #62  <Field boolean i>
	//   62  120:return          
	}

	public final boolean a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean b>
	//    2    4:ireturn         
	}

	public final String[] b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String[] c>
	//    2    4:areturn         
	}

	public final CredentialPickerConfig c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field CredentialPickerConfig d>
	//    2    4:areturn         
	}

	public final CredentialPickerConfig d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field CredentialPickerConfig e>
	//    2    4:areturn         
	}

	public final boolean e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean f>
	//    2    4:ireturn         
	}

	public final String f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String g>
	//    2    4:areturn         
	}

	public final String g()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String h>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #74  <Method boolean a()>
	//    7   11:invokestatic    #77  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #79  <Method String[] b()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #82  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (c())), j, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #84  <Method CredentialPickerConfig c()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #87  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((android.os.Parcelable) (d())), j, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #89  <Method CredentialPickerConfig d()>
	//   25   41:iload_2         
	//   26   42:iconst_0        
	//   27   43:invokestatic    #87  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e());
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:invokevirtual   #91  <Method boolean e()>
	//   32   52:invokestatic    #77  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f(), false);
	//   33   55:aload_1         
	//   34   56:bipush          6
	//   35   58:aload_0         
	//   36   59:invokevirtual   #93  <Method String f()>
	//   37   62:iconst_0        
	//   38   63:invokestatic    #96  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g(), false);
	//   39   66:aload_1         
	//   40   67:bipush          7
	//   41   69:aload_0         
	//   42   70:invokevirtual   #98  <Method String g()>
	//   43   73:iconst_0        
	//   44   74:invokestatic    #96  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, a);
	//   45   77:aload_1         
	//   46   78:sipush          1000
	//   47   81:aload_0         
	//   48   82:getfield        #34  <Field int a>
	//   49   85:invokestatic    #101 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i);
	//   50   88:aload_1         
	//   51   89:bipush          8
	//   52   91:aload_0         
	//   53   92:getfield        #62  <Field boolean i>
	//   54   95:invokestatic    #77  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   55   98:aload_1         
	//   56   99:iload_3         
	//   57  100:invokestatic    #103 <Method void c.a(Parcel, int)>
	//   58  103:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new f();
	private final int a;
	private final boolean b;
	private final String c[];
	private final CredentialPickerConfig d;
	private final CredentialPickerConfig e;
	private final boolean f;
	private final String g;
	private final String h;
	private final boolean i;

	static 
	{
	//    0    0:new             #24  <Class f>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void f()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
