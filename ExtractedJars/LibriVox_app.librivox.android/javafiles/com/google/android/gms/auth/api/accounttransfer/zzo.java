// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.support.v4.g.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			b

public class zzo extends zzaz
{

	public zzo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void zzaz()>
		b = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #53  <Field int b>
	//    5    9:return          
	}

	zzo(int i, List list, List list1, List list2, List list3, List list4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void zzaz()>
		b = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #53  <Field int b>
		c = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field List c>
		d = list1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field List d>
		e = list2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #60  <Field List e>
		f = list3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #62  <Field List f>
		g = list4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #64  <Field List g>
	//   20   37:return          
	}

	public Map a()
	{
		return ((Map) (a));
	//    0    0:getstatic       #30  <Field a a>
	//    1    3:areturn         
	}

	protected boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
	{
		switch(field.a())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #70  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
		{
	//*   2    4:tableswitch     1 6: default 44
	//	               1 109
	//	               2 104
	//	               3 99
	//	               4 94
	//	               5 89
	//	               6 84
		default:
			int i = field.a();
	//    3   44:aload_1         
	//    4   45:invokevirtual   #70  <Method int com.google.android.gms.common.server.response.FastJsonResponse$Field.a()>
	//    5   48:istore_2        
			field = ((com.google.android.gms.common.server.response.FastJsonResponse.Field) (new StringBuilder(37)));
	//    6   49:new             #72  <Class StringBuilder>
	//    7   52:dup             
	//    8   53:bipush          37
	//    9   55:invokespecial   #75  <Method void StringBuilder(int)>
	//   10   58:astore_1        
			((StringBuilder) (field)).append("Unknown SafeParcelable id=");
	//   11   59:aload_1         
	//   12   60:ldc1            #77  <String "Unknown SafeParcelable id=">
	//   13   62:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   14   65:pop             
			((StringBuilder) (field)).append(i);
	//   15   66:aload_1         
	//   16   67:iload_2         
	//   17   68:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   18   71:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   19   72:new             #86  <Class IllegalStateException>
	//   20   75:dup             
	//   21   76:aload_1         
	//   22   77:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   23   80:invokespecial   #93  <Method void IllegalStateException(String)>
	//   24   83:athrow          

		case 6: // '\006'
			return ((Object) (g));
	//   25   84:aload_0         
	//   26   85:getfield        #64  <Field List g>
	//   27   88:areturn         

		case 5: // '\005'
			return ((Object) (f));
	//   28   89:aload_0         
	//   29   90:getfield        #62  <Field List f>
	//   30   93:areturn         

		case 4: // '\004'
			return ((Object) (e));
	//   31   94:aload_0         
	//   32   95:getfield        #60  <Field List e>
	//   33   98:areturn         

		case 3: // '\003'
			return ((Object) (d));
	//   34   99:aload_0         
	//   35  100:getfield        #58  <Field List d>
	//   36  103:areturn         

		case 2: // '\002'
			return ((Object) (c));
	//   37  104:aload_0         
	//   38  105:getfield        #56  <Field List c>
	//   39  108:areturn         

		case 1: // '\001'
			return ((Object) (Integer.valueOf(b)));
	//   40  109:aload_0         
	//   41  110:getfield        #53  <Field int b>
	//   42  113:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   43  116:areturn         
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #106 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #53  <Field int b>
	//    7   11:invokestatic    #109 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, c, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #56  <Field List c>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #112 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 3, d, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #58  <Field List d>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #112 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 4, e, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #60  <Field List e>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #112 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 5, f, false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:getfield        #62  <Field List f>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #112 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 6, g, false);
	//   32   54:aload_1         
	//   33   55:bipush          6
	//   34   57:aload_0         
	//   35   58:getfield        #64  <Field List g>
	//   36   61:iconst_0        
	//   37   62:invokestatic    #112 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   38   65:aload_1         
	//   39   66:iload_2         
	//   40   67:invokestatic    #114 <Method void c.a(Parcel, int)>
	//   41   70:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	private static final a a;
	private final int b;
	private List c;
	private List d;
	private List e;
	private List f;
	private List g;

	static 
	{
	//    0    0:new             #20  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void b()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		a a1 = new a();
	//    4   10:new             #27  <Class a>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void a()>
	//    7   17:astore_0        
		a = a1;
	//    8   18:aload_0         
	//    9   19:putstatic       #30  <Field a a>
		a1.put("registered", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.c("registered", 2))));
	//   10   22:aload_0         
	//   11   23:ldc1            #32  <String "registered">
	//   12   25:ldc1            #32  <String "registered">
	//   13   27:iconst_2        
	//   14   28:invokestatic    #37  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.c(String, int)>
	//   15   31:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   16   34:pop             
		a.put("in_progress", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.c("in_progress", 3))));
	//   17   35:getstatic       #30  <Field a a>
	//   18   38:ldc1            #43  <String "in_progress">
	//   19   40:ldc1            #43  <String "in_progress">
	//   20   42:iconst_3        
	//   21   43:invokestatic    #37  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.c(String, int)>
	//   22   46:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   23   49:pop             
		a.put("success", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.c("success", 4))));
	//   24   50:getstatic       #30  <Field a a>
	//   25   53:ldc1            #45  <String "success">
	//   26   55:ldc1            #45  <String "success">
	//   27   57:iconst_4        
	//   28   58:invokestatic    #37  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.c(String, int)>
	//   29   61:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   30   64:pop             
		a.put("failed", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.c("failed", 5))));
	//   31   65:getstatic       #30  <Field a a>
	//   32   68:ldc1            #47  <String "failed">
	//   33   70:ldc1            #47  <String "failed">
	//   34   72:iconst_5        
	//   35   73:invokestatic    #37  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.c(String, int)>
	//   36   76:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   37   79:pop             
		a.put("escrowed", ((Object) (com.google.android.gms.common.server.response.FastJsonResponse.Field.c("escrowed", 6))));
	//   38   80:getstatic       #30  <Field a a>
	//   39   83:ldc1            #49  <String "escrowed">
	//   40   85:ldc1            #49  <String "escrowed">
	//   41   87:bipush          6
	//   42   89:invokestatic    #37  <Method com.google.android.gms.common.server.response.FastJsonResponse$Field com.google.android.gms.common.server.response.FastJsonResponse$Field.c(String, int)>
	//   43   92:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   44   95:pop             
	//*  45   96:return          
	}
}
