// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//			b

public class ProxyRequest extends AbstractSafeParcelable
{

	ProxyRequest(int i1, String s, int j1, long l1, byte abyte0[], Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void AbstractSafeParcelable()>
		n = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #58  <Field int n>
		j = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field String j>
		k = j1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #62  <Field int k>
		l = l1;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #64  <Field long l>
		m = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #66  <Field byte[] m>
		o = bundle;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #68  <Field Bundle o>
	//   20   37:return          
	}

	public String toString()
	{
		String s = j;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String j>
	//    2    4:astore_2        
		int i1 = k;
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field int k>
	//    5    9:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 42);
	//    6   10:new             #72  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #78  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #82  <Method int String.length()>
	//   11   21:bipush          42
	//   12   23:iadd            
	//   13   24:invokespecial   #85  <Method void StringBuilder(int)>
	//   14   27:astore_3        
		stringbuilder.append("ProxyRequest[ url: ");
	//   15   28:aload_3         
	//   16   29:ldc1            #87  <String "ProxyRequest[ url: ">
	//   17   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(s);
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append(", method: ");
	//   23   41:aload_3         
	//   24   42:ldc1            #93  <String ", method: ">
	//   25   44:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		stringbuilder.append(i1);
	//   27   48:aload_3         
	//   28   49:iload_1         
	//   29   50:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   30   53:pop             
		stringbuilder.append(" ]");
	//   31   54:aload_3         
	//   32   55:ldc1            #98  <String " ]">
	//   33   57:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
		return stringbuilder.toString();
	//   35   61:aload_3         
	//   36   62:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   37   65:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #107 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, j, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #60  <Field String j>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #110 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, k);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #62  <Field int k>
	//   13   21:invokestatic    #113 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, l);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #64  <Field long l>
	//   18   30:invokestatic    #116 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, m, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #66  <Field byte[] m>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #119 <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, o, false);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #68  <Field Bundle o>
	//   29   49:iconst_0        
	//   30   50:invokestatic    #122 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, n);
	//   31   53:aload_1         
	//   32   54:sipush          1000
	//   33   57:aload_0         
	//   34   58:getfield        #58  <Field int n>
	//   35   61:invokestatic    #113 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   36   64:aload_1         
	//   37   65:iload_2         
	//   38   66:invokestatic    #124 <Method void c.a(Parcel, int)>
	//   39   69:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	public static final int a = 0;
	public static final int b = 1;
	public static final int c = 2;
	public static final int d = 3;
	public static final int e = 4;
	public static final int f = 5;
	public static final int g = 6;
	public static final int h = 7;
	public static final int i = 7;
	public final String j;
	public final int k;
	public final long l;
	public final byte m[];
	private final int n;
	private Bundle o;

	static 
	{
	//    0    0:new             #30  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void b()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:iconst_0        
	//    5   11:putstatic       #37  <Field int a>
	//    6   14:iconst_1        
	//    7   15:putstatic       #39  <Field int b>
	//    8   18:iconst_2        
	//    9   19:putstatic       #41  <Field int c>
	//   10   22:iconst_3        
	//   11   23:putstatic       #43  <Field int d>
	//   12   26:iconst_4        
	//   13   27:putstatic       #45  <Field int e>
	//   14   30:iconst_5        
	//   15   31:putstatic       #47  <Field int f>
	//   16   34:bipush          6
	//   17   36:putstatic       #49  <Field int g>
	//   18   39:bipush          7
	//   19   41:putstatic       #51  <Field int h>
	//   20   44:bipush          7
	//   21   46:putstatic       #53  <Field int i>
	//*  22   49:return          
	}
}
