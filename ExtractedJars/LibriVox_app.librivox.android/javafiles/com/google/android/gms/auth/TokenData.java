// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//			d

public class TokenData extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	TokenData(int i, String s, Long long1, boolean flag, boolean flag1, List list, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int a>
		b = am.a(s);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #39  <Method String am.a(String)>
	//    8   14:putfield        #41  <Field String b>
		c = long1;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #43  <Field Long c>
		d = flag;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #45  <Field boolean d>
		e = flag1;
	//   15   28:aload_0         
	//   16   29:iload           5
	//   17   31:putfield        #47  <Field boolean e>
		f = list;
	//   18   34:aload_0         
	//   19   35:aload           6
	//   20   37:putfield        #49  <Field List f>
		g = s1;
	//   21   40:aload_0         
	//   22   41:aload           7
	//   23   43:putfield        #51  <Field String g>
	//   24   46:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof TokenData))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class TokenData>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((TokenData)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class TokenData>
	//    7   13:astore_1        
		return TextUtils.equals(((CharSequence) (b)), ((CharSequence) (((TokenData) (obj)).b))) && ak.a(((Object) (c)), ((Object) (((TokenData) (obj)).c))) && d == ((TokenData) (obj)).d && e == ((TokenData) (obj)).e && ak.a(((Object) (f)), ((Object) (((TokenData) (obj)).f))) && ak.a(((Object) (g)), ((Object) (((TokenData) (obj)).g)));
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field String b>
	//   10   18:aload_1         
	//   11   19:getfield        #41  <Field String b>
	//   12   22:invokestatic    #58  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   13   25:ifeq            94
	//   14   28:aload_0         
	//   15   29:getfield        #43  <Field Long c>
	//   16   32:aload_1         
	//   17   33:getfield        #43  <Field Long c>
	//   18   36:invokestatic    #63  <Method boolean ak.a(Object, Object)>
	//   19   39:ifeq            94
	//   20   42:aload_0         
	//   21   43:getfield        #45  <Field boolean d>
	//   22   46:aload_1         
	//   23   47:getfield        #45  <Field boolean d>
	//   24   50:icmpne          94
	//   25   53:aload_0         
	//   26   54:getfield        #47  <Field boolean e>
	//   27   57:aload_1         
	//   28   58:getfield        #47  <Field boolean e>
	//   29   61:icmpne          94
	//   30   64:aload_0         
	//   31   65:getfield        #49  <Field List f>
	//   32   68:aload_1         
	//   33   69:getfield        #49  <Field List f>
	//   34   72:invokestatic    #63  <Method boolean ak.a(Object, Object)>
	//   35   75:ifeq            94
	//   36   78:aload_0         
	//   37   79:getfield        #51  <Field String g>
	//   38   82:aload_1         
	//   39   83:getfield        #51  <Field String g>
	//   40   86:invokestatic    #63  <Method boolean ak.a(Object, Object)>
	//   41   89:ifeq            94
	//   42   92:iconst_1        
	//   43   93:ireturn         
	//   44   94:iconst_0        
	//   45   95:ireturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			b, c, Boolean.valueOf(d), Boolean.valueOf(e), f, g
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #41  <Field String b>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #43  <Field Long c>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #45  <Field boolean d>
	//   16   25:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #47  <Field boolean e>
	//   22   35:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #49  <Field List f>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #51  <Field String g>
	//   33   52:aastore         
	//   34   53:invokestatic    #76  <Method int ak.a(Object[])>
	//   35   56:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field int a>
	//    7   11:invokestatic    #86  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field String b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #89  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #43  <Field Long c>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #92  <Method void c.a(Parcel, int, Long, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #45  <Field boolean d>
	//   24   40:invokestatic    #95  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #47  <Field boolean e>
	//   29   49:invokestatic    #95  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 6, f, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #49  <Field List f>
	//   34   59:iconst_0        
	//   35   60:invokestatic    #98  <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g, false);
	//   36   63:aload_1         
	//   37   64:bipush          7
	//   38   66:aload_0         
	//   39   67:getfield        #51  <Field String g>
	//   40   70:iconst_0        
	//   41   71:invokestatic    #89  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   42   74:aload_1         
	//   43   75:iload_2         
	//   44   76:invokestatic    #100 <Method void c.a(Parcel, int)>
	//   45   79:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new d();
	private final int a;
	private final String b;
	private final Long c;
	private final boolean d;
	private final boolean e;
	private final List f;
	private final String g;

	static 
	{
	//    0    0:new             #24  <Class d>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void d()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
