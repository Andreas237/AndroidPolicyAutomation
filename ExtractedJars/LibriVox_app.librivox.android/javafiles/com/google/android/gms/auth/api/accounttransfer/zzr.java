// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.auth.zzaz;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			c, zzt

public class zzr extends zzaz
{

	public zzr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zzaz()>
		b = ((Set) (new HashSet(3)));
	//    2    4:aload_0         
	//    3    5:new             #56  <Class HashSet>
	//    4    8:dup             
	//    5    9:iconst_3        
	//    6   10:invokespecial   #59  <Method void HashSet(int)>
	//    7   13:putfield        #61  <Field Set b>
		c = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #63  <Field int c>
	//   11   21:return          
	}

	zzr(Set set, int i, zzt zzt1, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zzaz()>
		b = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #61  <Field Set b>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #63  <Field int c>
		d = zzt1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #66  <Field zzt d>
		e = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #68  <Field String e>
		f = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #70  <Field String f>
		g = s2;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #72  <Field String g>
	//   20   37:return          
	}

	public Map a()
	{
		return ((Map) (a));
	//    0    0:getstatic       #32  <Field HashMap a>
	//    1    3:areturn         
	}

	protected boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return b.contains(((Object) (Integer.valueOf(field.a()))));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Set b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    4    8:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//    5   11:invokeinterface #89  <Method boolean Set.contains(Object)>
	//    6   16:ireturn         
	}

	protected Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		switch(field.a())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #77  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
		{
	//*   2    4:tableswitch     1 4: default 36
	//	               1 91
	//	               2 86
	//	               3 81
	//	               4 76
		default:
			int i = field.a();
	//    3   36:aload_1         
	//    4   37:invokevirtual   #77  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    5   40:istore_2        
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//    6   41:new             #92  <Class StringBuilder>
	//    7   44:dup             
	//    8   45:bipush          37
	//    9   47:invokespecial   #93  <Method void StringBuilder(int)>
	//   10   50:astore_1        
			((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   11   51:aload_1         
	//   12   52:ldc1            #95  <String "Unknown SafeParcelable id=">
	//   13   54:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   57:pop             
			((StringBuilder) (field)).append(i);
	//   15   58:aload_1         
	//   16   59:iload_2         
	//   17   60:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   18   63:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   19   64:new             #104 <Class IllegalStateException>
	//   20   67:dup             
	//   21   68:aload_1         
	//   22   69:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   23   72:invokespecial   #111 <Method void IllegalStateException(String)>
	//   24   75:athrow          

		case 4: // '\004'
			return ((Object) (f));
	//   25   76:aload_0         
	//   26   77:getfield        #70  <Field String f>
	//   27   80:areturn         

		case 3: // '\003'
			return ((Object) (e));
	//   28   81:aload_0         
	//   29   82:getfield        #68  <Field String e>
	//   30   85:areturn         

		case 2: // '\002'
			return ((Object) (d));
	//   31   86:aload_0         
	//   32   87:getfield        #66  <Field zzt d>
	//   33   90:areturn         

		case 1: // '\001'
			return ((Object) (Integer.valueOf(c)));
	//   34   91:aload_0         
	//   35   92:getfield        #63  <Field int c>
	//   36   95:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   37   98:areturn         
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #118 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		Set set = b;
	//    3    5:aload_0         
	//    4    6:getfield        #61  <Field Set b>
	//    5    9:astore          4
		if(set.contains(((Object) (Integer.valueOf(1)))))
	//*   6   11:aload           4
	//*   7   13:iconst_1        
	//*   8   14:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*   9   17:invokeinterface #89  <Method boolean Set.contains(Object)>
	//*  10   22:ifeq            34
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
	//   11   25:aload_1         
	//   12   26:iconst_1        
	//   13   27:aload_0         
	//   14   28:getfield        #63  <Field int c>
	//   15   31:invokestatic    #121 <Method void c.a(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(2)))))
	//*  16   34:aload           4
	//*  17   36:iconst_2        
	//*  18   37:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  19   40:invokeinterface #89  <Method boolean Set.contains(Object)>
	//*  20   45:ifeq            59
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (d)), i, true);
	//   21   48:aload_1         
	//   22   49:iconst_2        
	//   23   50:aload_0         
	//   24   51:getfield        #66  <Field zzt d>
	//   25   54:iload_2         
	//   26   55:iconst_1        
	//   27   56:invokestatic    #124 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		if(set.contains(((Object) (Integer.valueOf(3)))))
	//*  28   59:aload           4
	//*  29   61:iconst_3        
	//*  30   62:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  31   65:invokeinterface #89  <Method boolean Set.contains(Object)>
	//*  32   70:ifeq            83
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, e, true);
	//   33   73:aload_1         
	//   34   74:iconst_3        
	//   35   75:aload_0         
	//   36   76:getfield        #68  <Field String e>
	//   37   79:iconst_1        
	//   38   80:invokestatic    #127 <Method void c.a(Parcel, int, String, boolean)>
		if(set.contains(((Object) (Integer.valueOf(4)))))
	//*  39   83:aload           4
	//*  40   85:iconst_4        
	//*  41   86:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  42   89:invokeinterface #89  <Method boolean Set.contains(Object)>
	//*  43   94:ifeq            107
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, f, true);
	//   44   97:aload_1         
	//   45   98:iconst_4        
	//   46   99:aload_0         
	//   47  100:getfield        #70  <Field String f>
	//   48  103:iconst_1        
	//   49  104:invokestatic    #127 <Method void c.a(Parcel, int, String, boolean)>
		if(set.contains(((Object) (Integer.valueOf(5)))))
	//*  50  107:aload           4
	//*  51  109:iconst_5        
	//*  52  110:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  53  113:invokeinterface #89  <Method boolean Set.contains(Object)>
	//*  54  118:ifeq            131
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, g, true);
	//   55  121:aload_1         
	//   56  122:iconst_5        
	//   57  123:aload_0         
	//   58  124:getfield        #72  <Field String g>
	//   59  127:iconst_1        
	//   60  128:invokestatic    #127 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   61  131:aload_1         
	//   62  132:iload_3         
	//   63  133:invokestatic    #129 <Method void c.a(Parcel, int)>
	//   64  136:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.api.accounttransfer.c();
	private static final HashMap a;
	private final Set b;
	private final int c;
	private zzt d;
	private String e;
	private String f;
	private String g;

	static 
	{
	//    0    0:new             #22  <Class com.google.android.gms.auth.api.accounttransfer.c>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void com.google.android.gms.auth.api.accounttransfer.c()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #29  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #30  <Method void HashMap()>
	//    7   17:astore_0        
		a = hashmap;
	//    8   18:aload_0         
	//    9   19:putstatic       #32  <Field HashMap a>
		hashmap.put("authenticatorInfo", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.a("authenticatorInfo", 2, com/google/android/gms/auth/api/accounttransfer/zzt))));
	//   10   22:aload_0         
	//   11   23:ldc1            #34  <String "authenticatorInfo">
	//   12   25:ldc1            #34  <String "authenticatorInfo">
	//   13   27:iconst_2        
	//   14   28:ldc1            #36  <Class zzt>
	//   15   30:invokestatic    #41  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.a(String, int, Class)>
	//   16   33:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   17   36:pop             
		a.put("signature", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.b("signature", 3))));
	//   18   37:getstatic       #32  <Field HashMap a>
	//   19   40:ldc1            #47  <String "signature">
	//   20   42:ldc1            #47  <String "signature">
	//   21   44:iconst_3        
	//   22   45:invokestatic    #50  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.b(String, int)>
	//   23   48:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   24   51:pop             
		a.put("package", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.b("package", 4))));
	//   25   52:getstatic       #32  <Field HashMap a>
	//   26   55:ldc1            #52  <String "package">
	//   27   57:ldc1            #52  <String "package">
	//   28   59:iconst_4        
	//   29   60:invokestatic    #50  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.b(String, int)>
	//   30   63:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   31   66:pop             
	//*  32   67:return          
	}
}
