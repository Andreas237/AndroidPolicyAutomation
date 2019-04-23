// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.auth.zzaz;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			a, zzr, zzo

public final class zzl extends zzaz
{

	public zzl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaz()>
		b = ((Set) (new HashSet(1)));
	//    2    4:aload_0         
	//    3    5:new             #54  <Class HashSet>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #57  <Method void HashSet(int)>
	//    7   13:putfield        #59  <Field Set b>
		c = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #61  <Field int c>
	//   11   21:return          
	}

	zzl(Set set, int i, ArrayList arraylist, int j, zzo zzo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaz()>
		b = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field Set b>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #61  <Field int c>
		d = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #64  <Field ArrayList d>
		e = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #66  <Field int e>
		f = zzo1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #68  <Field zzo f>
	//   17   31:return          
	}

	public final Map a()
	{
		return ((Map) (a));
	//    0    0:getstatic       #31  <Field HashMap a>
	//    1    3:areturn         
	}

	protected final boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return b.contains(((Object) (Integer.valueOf(field.a()))));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Set b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    4    8:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//    5   11:invokeinterface #85  <Method boolean Set.contains(Object)>
	//    6   16:ireturn         
	}

	protected final Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		int i = field.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #73  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    2    4:istore_2        
		if(i != 4)
	//*   3    5:iload_2         
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          85
			switch(i)
	//*   6   10:iload_2         
			{
	//*   7   11:tableswitch     1 2: default 32
	//	               1 77
	//	               2 72
			default:
				int j = field.a();
	//    8   32:aload_1         
	//    9   33:invokevirtual   #73  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//   10   36:istore_2        
				field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//   11   37:new             #88  <Class StringBuilder>
	//   12   40:dup             
	//   13   41:bipush          37
	//   14   43:invokespecial   #89  <Method void StringBuilder(int)>
	//   15   46:astore_1        
				((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   16   47:aload_1         
	//   17   48:ldc1            #91  <String "Unknown SafeParcelable id=">
	//   18   50:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   19   53:pop             
				((StringBuilder) (field)).append(j);
	//   20   54:aload_1         
	//   21   55:iload_2         
	//   22   56:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//   23   59:pop             
				throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   24   60:new             #100 <Class IllegalStateException>
	//   25   63:dup             
	//   26   64:aload_1         
	//   27   65:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   28   68:invokespecial   #107 <Method void IllegalStateException(String)>
	//   29   71:athrow          

			case 2: // '\002'
				return ((Object) (d));
	//   30   72:aload_0         
	//   31   73:getfield        #64  <Field ArrayList d>
	//   32   76:areturn         

			case 1: // '\001'
				return ((Object) (Integer.valueOf(c)));
	//   33   77:aload_0         
	//   34   78:getfield        #61  <Field int c>
	//   35   81:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   36   84:areturn         
			}
		else
			return ((Object) (f));
	//   37   85:aload_0         
	//   38   86:getfield        #68  <Field zzo f>
	//   39   89:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #114 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		Set set = b;
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Set b>
	//    5    9:astore          4
		if(set.contains(((Object) (Integer.valueOf(1)))))
	//*   6   11:aload           4
	//*   7   13:iconst_1        
	//*   8   14:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//*   9   17:invokeinterface #85  <Method boolean Set.contains(Object)>
	//*  10   22:ifeq            34
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
	//   11   25:aload_1         
	//   12   26:iconst_1        
	//   13   27:aload_0         
	//   14   28:getfield        #61  <Field int c>
	//   15   31:invokestatic    #117 <Method void c.a(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(2)))))
	//*  16   34:aload           4
	//*  17   36:iconst_2        
	//*  18   37:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//*  19   40:invokeinterface #85  <Method boolean Set.contains(Object)>
	//*  20   45:ifeq            58
			com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, ((java.util.List) (d)), true);
	//   21   48:aload_1         
	//   22   49:iconst_2        
	//   23   50:aload_0         
	//   24   51:getfield        #64  <Field ArrayList d>
	//   25   54:iconst_1        
	//   26   55:invokestatic    #120 <Method void c.c(Parcel, int, java.util.List, boolean)>
		if(set.contains(((Object) (Integer.valueOf(3)))))
	//*  27   58:aload           4
	//*  28   60:iconst_3        
	//*  29   61:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//*  30   64:invokeinterface #85  <Method boolean Set.contains(Object)>
	//*  31   69:ifeq            81
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, e);
	//   32   72:aload_1         
	//   33   73:iconst_3        
	//   34   74:aload_0         
	//   35   75:getfield        #66  <Field int e>
	//   36   78:invokestatic    #117 <Method void c.a(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(4)))))
	//*  37   81:aload           4
	//*  38   83:iconst_4        
	//*  39   84:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//*  40   87:invokeinterface #85  <Method boolean Set.contains(Object)>
	//*  41   92:ifeq            106
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((android.os.Parcelable) (f)), i, true);
	//   42   95:aload_1         
	//   43   96:iconst_4        
	//   44   97:aload_0         
	//   45   98:getfield        #68  <Field zzo f>
	//   46  101:iload_2         
	//   47  102:iconst_1        
	//   48  103:invokestatic    #123 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   49  106:aload_1         
	//   50  107:iload_3         
	//   51  108:invokestatic    #125 <Method void c.a(Parcel, int)>
	//   52  111:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new a();
	private static final HashMap a;
	private final Set b;
	private final int c;
	private ArrayList d;
	private int e;
	private zzo f;

	static 
	{
	//    0    0:new             #21  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void a()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #28  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #29  <Method void HashMap()>
	//    7   17:astore_0        
		a = hashmap;
	//    8   18:aload_0         
	//    9   19:putstatic       #31  <Field HashMap a>
		hashmap.put("authenticatorData", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.b("authenticatorData", 2, com/google/android/gms/auth/api/accounttransfer/zzr))));
	//   10   22:aload_0         
	//   11   23:ldc1            #33  <String "authenticatorData">
	//   12   25:ldc1            #33  <String "authenticatorData">
	//   13   27:iconst_2        
	//   14   28:ldc1            #35  <Class zzr>
	//   15   30:invokestatic    #40  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.b(String, int, Class)>
	//   16   33:invokevirtual   #44  <Method Object HashMap.put(Object, Object)>
	//   17   36:pop             
		a.put("progress", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.a("progress", 4, com/google/android/gms/auth/api/accounttransfer/zzo))));
	//   18   37:getstatic       #31  <Field HashMap a>
	//   19   40:ldc1            #46  <String "progress">
	//   20   42:ldc1            #46  <String "progress">
	//   21   44:iconst_4        
	//   22   45:ldc1            #48  <Class zzo>
	//   23   47:invokestatic    #50  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.a(String, int, Class)>
	//   24   50:invokevirtual   #44  <Method Object HashMap.put(Object, Object)>
	//   25   53:pop             
	//*  26   54:return          
	}
}
