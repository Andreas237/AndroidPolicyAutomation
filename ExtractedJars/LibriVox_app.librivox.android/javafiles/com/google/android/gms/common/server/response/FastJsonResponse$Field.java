// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.server.converter.zaa;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//			b, SafeParcelResponse, a, zak

public class FastJsonResponse$Field extends AbstractSafeParcelable
{

	public static FastJsonResponse$Field a(String s, int l)
	{
		return new FastJsonResponse$Field(0, false, 0, false, s, l, ((Class) (null)), ((a) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field a(String s, int l, Class class1)
	{
		return new FastJsonResponse$Field(11, false, 11, false, s, l, class1, ((a) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_0        
	//    4    7:bipush          11
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
	//   11   17:areturn         
	}

	static a a(FastJsonResponse$Field fastjsonresponse$field)
	{
		return fastjsonresponse$field.k;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field a k>
	//    2    4:areturn         
	}

	public static FastJsonResponse$Field b(String s, int l)
	{
		return new FastJsonResponse$Field(7, false, 7, false, s, l, ((Class) (null)), ((a) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_0        
	//    4    7:bipush          7
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field b(String s, int l, Class class1)
	{
		return new FastJsonResponse$Field(11, true, 11, true, s, l, class1, ((a) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_1        
	//    4    7:bipush          11
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field c(String s, int l)
	{
		return new FastJsonResponse$Field(7, true, 7, true, s, l, ((Class) (null)), ((a) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_1        
	//    4    7:bipush          7
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field d(String s, int l)
	{
		return new FastJsonResponse$Field(8, false, 8, false, s, l, ((Class) (null)), ((a) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:iconst_0        
	//    4    7:bipush          8
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
	//   11   17:areturn         
	}

	private final String d()
	{
		String s = i;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String i>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return s;
	//    7   11:aload_1         
	//    8   12:areturn         
	}

	private final zaa e()
	{
		a a1 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field a k>
	//    2    4:astore_1        
		if(a1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zaa.a(a1);
	//    7   11:aload_1         
	//    8   12:invokestatic    #78  <Method zaa zaa.a(a)>
	//    9   15:areturn         
	}

	public int a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int f>
	//    2    4:ireturn         
	}

	public final Object a(Object obj)
	{
		return k.a(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field a k>
	//    2    4:aload_1         
	//    3    5:invokeinterface #84  <Method Object a.a(Object)>
	//    4   10:areturn         
	}

	public final void a(zak zak1)
	{
		j = zak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field zak j>
	//    3    5:return          
	}

	public final boolean b()
	{
		return k != null;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field a k>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final Map c()
	{
		am.a(((Object) (i)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String i>
	//    2    4:invokestatic    #92  <Method Object am.a(Object)>
	//    3    7:pop             
		am.a(((Object) (j)));
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field zak j>
	//    6   12:invokestatic    #92  <Method Object am.a(Object)>
	//    7   15:pop             
		return j.a(i);
	//    8   16:aload_0         
	//    9   17:getfield        #87  <Field zak j>
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field String i>
	//   12   24:invokevirtual   #97  <Method Map zak.a(String)>
	//   13   27:areturn         
	}

	public String toString()
	{
		al al1 = ak.a(((Object) (this))).a("versionCode", ((Object) (Integer.valueOf(h)))).a("typeIn", ((Object) (Integer.valueOf(a)))).a("typeInArray", ((Object) (Boolean.valueOf(b)))).a("typeOut", ((Object) (Integer.valueOf(c)))).a("typeOutArray", ((Object) (Boolean.valueOf(d)))).a("outputFieldName", ((Object) (e))).a("safeParcelFieldId", ((Object) (Integer.valueOf(f)))).a("concreteTypeName", ((Object) (d())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method al ak.a(Object)>
	//    2    4:ldc1            #105 <String "versionCode">
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field int h>
	//    5   10:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//    6   13:invokevirtual   #116 <Method al al.a(String, Object)>
	//    7   16:ldc1            #118 <String "typeIn">
	//    8   18:aload_0         
	//    9   19:getfield        #39  <Field int a>
	//   10   22:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//   11   25:invokevirtual   #116 <Method al al.a(String, Object)>
	//   12   28:ldc1            #120 <String "typeInArray">
	//   13   30:aload_0         
	//   14   31:getfield        #41  <Field boolean b>
	//   15   34:invokestatic    #125 <Method Boolean Boolean.valueOf(boolean)>
	//   16   37:invokevirtual   #116 <Method al al.a(String, Object)>
	//   17   40:ldc1            #127 <String "typeOut">
	//   18   42:aload_0         
	//   19   43:getfield        #43  <Field int c>
	//   20   46:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//   21   49:invokevirtual   #116 <Method al al.a(String, Object)>
	//   22   52:ldc1            #129 <String "typeOutArray">
	//   23   54:aload_0         
	//   24   55:getfield        #45  <Field boolean d>
	//   25   58:invokestatic    #125 <Method Boolean Boolean.valueOf(boolean)>
	//   26   61:invokevirtual   #116 <Method al al.a(String, Object)>
	//   27   64:ldc1            #131 <String "outputFieldName">
	//   28   66:aload_0         
	//   29   67:getfield        #47  <Field String e>
	//   30   70:invokevirtual   #116 <Method al al.a(String, Object)>
	//   31   73:ldc1            #133 <String "safeParcelFieldId">
	//   32   75:aload_0         
	//   33   76:getfield        #49  <Field int f>
	//   34   79:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//   35   82:invokevirtual   #116 <Method al al.a(String, Object)>
	//   36   85:ldc1            #135 <String "concreteTypeName">
	//   37   87:aload_0         
	//   38   88:invokespecial   #137 <Method String d()>
	//   39   91:invokevirtual   #116 <Method al al.a(String, Object)>
	//   40   94:astore_1        
		Object obj = ((Object) (g));
	//   41   95:aload_0         
	//   42   96:getfield        #51  <Field Class g>
	//   43   99:astore_2        
		if(obj != null)
	//*  44  100:aload_2         
	//*  45  101:ifnull          115
			al1.a("concreteType.class", ((Object) (((Class) (obj)).getCanonicalName())));
	//   46  104:aload_1         
	//   47  105:ldc1            #139 <String "concreteType.class">
	//   48  107:aload_2         
	//   49  108:invokevirtual   #69  <Method String Class.getCanonicalName()>
	//   50  111:invokevirtual   #116 <Method al al.a(String, Object)>
	//   51  114:pop             
		obj = ((Object) (k));
	//   52  115:aload_0         
	//   53  116:getfield        #57  <Field a k>
	//   54  119:astore_2        
		if(obj != null)
	//*  55  120:aload_2         
	//*  56  121:ifnull          138
			al1.a("converterName", ((Object) (obj.getClass().getCanonicalName())));
	//   57  124:aload_1         
	//   58  125:ldc1            #141 <String "converterName">
	//   59  127:aload_2         
	//   60  128:invokevirtual   #147 <Method Class Object.getClass()>
	//   61  131:invokevirtual   #69  <Method String Class.getCanonicalName()>
	//   62  134:invokevirtual   #116 <Method al al.a(String, Object)>
	//   63  137:pop             
		return al1.toString();
	//   64  138:aload_1         
	//   65  139:invokevirtual   #149 <Method String al.toString()>
	//   66  142:areturn         
	}

	public void writeToParcel(Parcel parcel, int l)
	{
		int i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, h);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int h>
	//    7   11:invokestatic    #159 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field int a>
	//   12   20:invokestatic    #159 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #41  <Field boolean b>
	//   17   29:invokestatic    #162 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #43  <Field int c>
	//   22   38:invokestatic    #159 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d);
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:getfield        #45  <Field boolean d>
	//   27   47:invokestatic    #162 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e, false);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:getfield        #47  <Field String e>
	//   32   57:iconst_0        
	//   33   58:invokestatic    #165 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, a());
	//   34   61:aload_1         
	//   35   62:bipush          7
	//   36   64:aload_0         
	//   37   65:invokevirtual   #167 <Method int a()>
	//   38   68:invokestatic    #159 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, d(), false);
	//   39   71:aload_1         
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:invokespecial   #137 <Method String d()>
	//   43   78:iconst_0        
	//   44   79:invokestatic    #165 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, ((android.os.Parcelable) (e())), l, false);
	//   45   82:aload_1         
	//   46   83:bipush          9
	//   47   85:aload_0         
	//   48   86:invokespecial   #169 <Method zaa e()>
	//   49   89:iload_2         
	//   50   90:iconst_0        
	//   51   91:invokestatic    #172 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:invokestatic    #174 <Method void c.a(Parcel, int)>
	//   55   99:return          
	}

	public static final b CREATOR = new b();
	protected final int a;
	protected final boolean b;
	protected final int c;
	protected final boolean d;
	protected final String e;
	protected final int f;
	protected final Class g;
	private final int h;
	private final String i;
	private zak j;
	private a k;

	static 
	{
	//    0    0:new             #27  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void b()>
	//    3    7:putstatic       #32  <Field b CREATOR>
	//*   4   10:return          
	}

	FastJsonResponse$Field(int l, int i1, boolean flag, int j1, boolean flag1, String s, int k1, 
			String s1, zaa zaa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		h = l;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int h>
		a = i1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field int a>
		b = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #41  <Field boolean b>
		c = j1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #43  <Field int c>
		d = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #45  <Field boolean d>
		e = s;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #47  <Field String e>
		f = k1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #49  <Field int f>
		if(s1 == null)
	//*  23   43:aload           8
	//*  24   45:ifnonnull       61
		{
			g = null;
	//   25   48:aload_0         
	//   26   49:aconst_null     
	//   27   50:putfield        #51  <Field Class g>
			i = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #53  <Field String i>
		} else
	//*  31   58:goto            73
		{
			g = com/google/android/gms/common/server/response/SafeParcelResponse;
	//   32   61:aload_0         
	//   33   62:ldc1            #55  <Class SafeParcelResponse>
	//   34   64:putfield        #51  <Field Class g>
			i = s1;
	//   35   67:aload_0         
	//   36   68:aload           8
	//   37   70:putfield        #53  <Field String i>
		}
		if(zaa1 == null)
	//*  38   73:aload           9
	//*  39   75:ifnonnull       84
		{
			k = null;
	//   40   78:aload_0         
	//   41   79:aconst_null     
	//   42   80:putfield        #57  <Field a k>
			return;
	//   43   83:return          
		} else
		{
			k = zaa1.a();
	//   44   84:aload_0         
	//   45   85:aload           9
	//   46   87:invokevirtual   #62  <Method a zaa.a()>
	//   47   90:putfield        #57  <Field a k>
			return;
	//   48   93:return          
		}
	}

	private FastJsonResponse$Field(int l, boolean flag, int i1, boolean flag1, String s, int j1, Class class1, 
			a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		h = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #37  <Field int h>
		a = l;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #39  <Field int a>
		b = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #41  <Field boolean b>
		c = i1;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #43  <Field int c>
		d = flag1;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #45  <Field boolean d>
		e = s;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #47  <Field String e>
		f = j1;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #49  <Field int f>
		g = class1;
	//   23   42:aload_0         
	//   24   43:aload           7
	//   25   45:putfield        #51  <Field Class g>
		if(class1 == null)
	//*  26   48:aload           7
	//*  27   50:ifnonnull       61
			i = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #53  <Field String i>
		else
	//*  31   58:goto            70
			i = class1.getCanonicalName();
	//   32   61:aload_0         
	//   33   62:aload           7
	//   34   64:invokevirtual   #69  <Method String Class.getCanonicalName()>
	//   35   67:putfield        #53  <Field String i>
		k = a1;
	//   36   70:aload_0         
	//   37   71:aload           8
	//   38   73:putfield        #57  <Field a k>
	//   39   76:return          
	}
}
