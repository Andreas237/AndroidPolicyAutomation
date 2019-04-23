// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.support.v4.g.c;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			d, DeviceMetaData

public class zzt extends zzaz
{

	public zzt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void zzaz()>
		b = ((Set) (new c(3)));
	//    2    4:aload_0         
	//    3    5:new             #58  <Class c>
	//    4    8:dup             
	//    5    9:iconst_3        
	//    6   10:invokespecial   #61  <Method void c(int)>
	//    7   13:putfield        #63  <Field Set b>
		c = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #65  <Field int c>
	//   11   21:return          
	}

	zzt(Set set, int i, String s, int j, byte abyte0[], PendingIntent pendingintent, DeviceMetaData devicemetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void zzaz()>
		b = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #63  <Field Set b>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #65  <Field int c>
		d = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #68  <Field String d>
		e = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #70  <Field int e>
		f = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #72  <Field byte[] f>
		g = pendingintent;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #74  <Field PendingIntent g>
		h = devicemetadata;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #76  <Field DeviceMetaData h>
	//   23   43:return          
	}

	public Map a()
	{
		return ((Map) (a));
	//    0    0:getstatic       #35  <Field HashMap a>
	//    1    3:areturn         
	}

	protected boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return b.contains(((Object) (Integer.valueOf(field.a()))));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Set b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    4    8:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//    5   11:invokeinterface #93  <Method boolean Set.contains(Object)>
	//    6   16:ireturn         
	}

	protected Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		switch(field.a())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #81  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
		{
	//*   2    4:tableswitch     1 4: default 36
	//	               1 94
	//	               2 89
	//	               3 81
	//	               4 76
		default:
			int i = field.a();
	//    3   36:aload_1         
	//    4   37:invokevirtual   #81  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    5   40:istore_2        
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//    6   41:new             #96  <Class StringBuilder>
	//    7   44:dup             
	//    8   45:bipush          37
	//    9   47:invokespecial   #97  <Method void StringBuilder(int)>
	//   10   50:astore_1        
			((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   11   51:aload_1         
	//   12   52:ldc1            #99  <String "Unknown SafeParcelable id=">
	//   13   54:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   57:pop             
			((StringBuilder) (field)).append(i);
	//   15   58:aload_1         
	//   16   59:iload_2         
	//   17   60:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   18   63:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   19   64:new             #108 <Class IllegalStateException>
	//   20   67:dup             
	//   21   68:aload_1         
	//   22   69:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   23   72:invokespecial   #115 <Method void IllegalStateException(String)>
	//   24   75:athrow          

		case 4: // '\004'
			return ((Object) (f));
	//   25   76:aload_0         
	//   26   77:getfield        #72  <Field byte[] f>
	//   27   80:areturn         

		case 3: // '\003'
			return ((Object) (Integer.valueOf(e)));
	//   28   81:aload_0         
	//   29   82:getfield        #70  <Field int e>
	//   30   85:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//   31   88:areturn         

		case 2: // '\002'
			return ((Object) (d));
	//   32   89:aload_0         
	//   33   90:getfield        #68  <Field String d>
	//   34   93:areturn         

		case 1: // '\001'
			return ((Object) (Integer.valueOf(c)));
	//   35   94:aload_0         
	//   36   95:getfield        #65  <Field int c>
	//   37   98:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//   38  101:areturn         
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #122 <Method int com.google.android.gms.common.internal.safeparcel.c.a(Parcel)>
	//    2    4:istore_3        
		Set set = b;
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field Set b>
	//    5    9:astore          4
		if(set.contains(((Object) (Integer.valueOf(1)))))
	//*   6   11:aload           4
	//*   7   13:iconst_1        
	//*   8   14:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//*   9   17:invokeinterface #93  <Method boolean Set.contains(Object)>
	//*  10   22:ifeq            34
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
	//   11   25:aload_1         
	//   12   26:iconst_1        
	//   13   27:aload_0         
	//   14   28:getfield        #65  <Field int c>
	//   15   31:invokestatic    #125 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(2)))))
	//*  16   34:aload           4
	//*  17   36:iconst_2        
	//*  18   37:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//*  19   40:invokeinterface #93  <Method boolean Set.contains(Object)>
	//*  20   45:ifeq            58
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, d, true);
	//   21   48:aload_1         
	//   22   49:iconst_2        
	//   23   50:aload_0         
	//   24   51:getfield        #68  <Field String d>
	//   25   54:iconst_1        
	//   26   55:invokestatic    #128 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, String, boolean)>
		if(set.contains(((Object) (Integer.valueOf(3)))))
	//*  27   58:aload           4
	//*  28   60:iconst_3        
	//*  29   61:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//*  30   64:invokeinterface #93  <Method boolean Set.contains(Object)>
	//*  31   69:ifeq            81
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, e);
	//   32   72:aload_1         
	//   33   73:iconst_3        
	//   34   74:aload_0         
	//   35   75:getfield        #70  <Field int e>
	//   36   78:invokestatic    #125 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
		if(set.contains(((Object) (Integer.valueOf(4)))))
	//*  37   81:aload           4
	//*  38   83:iconst_4        
	//*  39   84:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//*  40   87:invokeinterface #93  <Method boolean Set.contains(Object)>
	//*  41   92:ifeq            105
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, f, true);
	//   42   95:aload_1         
	//   43   96:iconst_4        
	//   44   97:aload_0         
	//   45   98:getfield        #72  <Field byte[] f>
	//   46  101:iconst_1        
	//   47  102:invokestatic    #131 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, byte[], boolean)>
		if(set.contains(((Object) (Integer.valueOf(5)))))
	//*  48  105:aload           4
	//*  49  107:iconst_5        
	//*  50  108:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//*  51  111:invokeinterface #93  <Method boolean Set.contains(Object)>
	//*  52  116:ifeq            130
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((android.os.Parcelable) (g)), i, true);
	//   53  119:aload_1         
	//   54  120:iconst_5        
	//   55  121:aload_0         
	//   56  122:getfield        #74  <Field PendingIntent g>
	//   57  125:iload_2         
	//   58  126:iconst_1        
	//   59  127:invokestatic    #134 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		if(set.contains(((Object) (Integer.valueOf(6)))))
	//*  60  130:aload           4
	//*  61  132:bipush          6
	//*  62  134:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//*  63  137:invokeinterface #93  <Method boolean Set.contains(Object)>
	//*  64  142:ifeq            157
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ((android.os.Parcelable) (h)), i, true);
	//   65  145:aload_1         
	//   66  146:bipush          6
	//   67  148:aload_0         
	//   68  149:getfield        #76  <Field DeviceMetaData h>
	//   69  152:iload_2         
	//   70  153:iconst_1        
	//   71  154:invokestatic    #134 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   72  157:aload_1         
	//   73  158:iload_3         
	//   74  159:invokestatic    #136 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int)>
	//   75  162:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new d();
	private static final HashMap a;
	private final Set b;
	private final int c;
	private String d;
	private int e;
	private byte f[];
	private PendingIntent g;
	private DeviceMetaData h;

	static 
	{
	//    0    0:new             #25  <Class d>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void d()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #32  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #33  <Method void HashMap()>
	//    7   17:astore_0        
		a = hashmap;
	//    8   18:aload_0         
	//    9   19:putstatic       #35  <Field HashMap a>
		hashmap.put("accountType", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.b("accountType", 2))));
	//   10   22:aload_0         
	//   11   23:ldc1            #37  <String "accountType">
	//   12   25:ldc1            #37  <String "accountType">
	//   13   27:iconst_2        
	//   14   28:invokestatic    #42  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.b(String, int)>
	//   15   31:invokevirtual   #46  <Method Object HashMap.put(Object, Object)>
	//   16   34:pop             
		a.put("status", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.a("status", 3))));
	//   17   35:getstatic       #35  <Field HashMap a>
	//   18   38:ldc1            #48  <String "status">
	//   19   40:ldc1            #48  <String "status">
	//   20   42:iconst_3        
	//   21   43:invokestatic    #50  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.a(String, int)>
	//   22   46:invokevirtual   #46  <Method Object HashMap.put(Object, Object)>
	//   23   49:pop             
		a.put("transferBytes", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.d("transferBytes", 4))));
	//   24   50:getstatic       #35  <Field HashMap a>
	//   25   53:ldc1            #52  <String "transferBytes">
	//   26   55:ldc1            #52  <String "transferBytes">
	//   27   57:iconst_4        
	//   28   58:invokestatic    #54  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.d(String, int)>
	//   29   61:invokevirtual   #46  <Method Object HashMap.put(Object, Object)>
	//   30   64:pop             
	//*  31   65:return          
	}
}
