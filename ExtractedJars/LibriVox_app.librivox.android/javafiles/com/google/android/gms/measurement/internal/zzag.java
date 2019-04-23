// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			g, zzad

public final class zzag extends AbstractSafeParcelable
{

	zzag(zzag zzag1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		am.a(((Object) (zzag1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #30  <Method Object am.a(Object)>
	//    4    8:pop             
		a = zzag1.a;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #32  <Field String a>
	//    8   14:putfield        #32  <Field String a>
		b = zzag1.b;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #34  <Field zzad b>
	//   12   22:putfield        #34  <Field zzad b>
		c = zzag1.c;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #36  <Field String c>
	//   16   30:putfield        #36  <Field String c>
		d = l;
	//   17   33:aload_0         
	//   18   34:lload_2         
	//   19   35:putfield        #38  <Field long d>
	//   20   38:return          
	}

	public zzag(String s, zzad zzad, String s1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String a>
		b = zzad;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field zzad b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field String c>
		d = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #38  <Field long d>
	//   14   25:return          
	}

	public final String toString()
	{
		String s = c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String c>
	//    2    4:astore_1        
		String s1 = a;
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field String a>
	//    5    9:astore_2        
		String s2 = String.valueOf(((Object) (b)));
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field zzad b>
	//    8   14:invokestatic    #47  <Method String String.valueOf(Object)>
	//    9   17:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 21 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   10   18:new             #49  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokestatic    #47  <Method String String.valueOf(Object)>
	//   14   26:invokevirtual   #53  <Method int String.length()>
	//   15   29:bipush          21
	//   16   31:iadd            
	//   17   32:aload_2         
	//   18   33:invokestatic    #47  <Method String String.valueOf(Object)>
	//   19   36:invokevirtual   #53  <Method int String.length()>
	//   20   39:iadd            
	//   21   40:aload_3         
	//   22   41:invokestatic    #47  <Method String String.valueOf(Object)>
	//   23   44:invokevirtual   #53  <Method int String.length()>
	//   24   47:iadd            
	//   25   48:invokespecial   #56  <Method void StringBuilder(int)>
	//   26   51:astore          4
		stringbuilder.append("origin=");
	//   27   53:aload           4
	//   28   55:ldc1            #58  <String "origin=">
	//   29   57:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
		stringbuilder.append(s);
	//   31   61:aload           4
	//   32   63:aload_1         
	//   33   64:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
		stringbuilder.append(",name=");
	//   35   68:aload           4
	//   36   70:ldc1            #64  <String ",name=">
	//   37   72:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
		stringbuilder.append(s1);
	//   39   76:aload           4
	//   40   78:aload_2         
	//   41   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
		stringbuilder.append(",params=");
	//   43   83:aload           4
	//   44   85:ldc1            #66  <String ",params=">
	//   45   87:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
		stringbuilder.append(s2);
	//   47   91:aload           4
	//   48   93:aload_3         
	//   49   94:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   50   97:pop             
		return stringbuilder.toString();
	//   51   98:aload           4
	//   52  100:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   53  103:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #78  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (b)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #34  <Field zzad b>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #81  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c, false);
	//   16   26:aload_1         
	//   17   27:iconst_4        
	//   18   28:aload_0         
	//   19   29:getfield        #36  <Field String c>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #78  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d);
	//   22   36:aload_1         
	//   23   37:iconst_5        
	//   24   38:aload_0         
	//   25   39:getfield        #38  <Field long d>
	//   26   42:invokestatic    #84  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   27   45:aload_1         
	//   28   46:iload_3         
	//   29   47:invokestatic    #86  <Method void c.a(Parcel, int)>
	//   30   50:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new g();
	public final String a;
	public final zzad b;
	public final String c;
	public final long d;

	static 
	{
	//    0    0:new             #17  <Class g>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void g()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
