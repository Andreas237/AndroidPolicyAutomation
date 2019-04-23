// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common:
//			o

public class Feature extends AbstractSafeParcelable
{

	public Feature(String s, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int b>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #31  <Field long c>
	//   11   19:return          
	}

	public Feature(String s, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String a>
		c = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #31  <Field long c>
		b = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #29  <Field int b>
	//   11   19:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String a>
	//    2    4:areturn         
	}

	public long b()
	{
		long l1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long c>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #35  <Long -1L>
	//*   7   11:lcmp            
	//*   8   12:ifne            21
			l = b;
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field int b>
	//   11   19:i2l             
	//   12   20:lstore_1        
		return l;
	//   13   21:lload_1         
	//   14   22:lreturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Feature)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Feature>
	//*   2    4:ifeq            63
		{
			obj = ((Object) ((Feature)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class Feature>
	//    5   11:astore_1        
			return (a() != null && a().equals(((Object) (((Feature) (obj)).a()))) || a() == null && ((Feature) (obj)).a() == null) && b() == ((Feature) (obj)).b();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #40  <Method String a()>
	//    8   16:ifnull          33
	//    9   19:aload_0         
	//   10   20:invokevirtual   #40  <Method String a()>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #40  <Method String a()>
	//   13   27:invokevirtual   #44  <Method boolean String.equals(Object)>
	//   14   30:ifne            47
	//   15   33:aload_0         
	//   16   34:invokevirtual   #40  <Method String a()>
	//   17   37:ifnonnull       61
	//   18   40:aload_1         
	//   19   41:invokevirtual   #40  <Method String a()>
	//   20   44:ifnonnull       61
	//   21   47:aload_0         
	//   22   48:invokevirtual   #46  <Method long b()>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #46  <Method long b()>
	//   25   55:lcmp            
	//   26   56:ifne            61
	//   27   59:iconst_1        
	//   28   60:ireturn         
	//   29   61:iconst_0        
	//   30   62:ireturn         
		} else
		{
			return false;
	//   31   63:iconst_0        
	//   32   64:ireturn         
		}
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a(), Long.valueOf(b())
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:invokevirtual   #40  <Method String a()>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:invokevirtual   #46  <Method long b()>
	//   11   17:invokestatic    #56  <Method Long Long.valueOf(long)>
	//   12   20:aastore         
	//   13   21:invokestatic    #61  <Method int ak.a(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		return ak.a(((Object) (this))).a("name", ((Object) (a()))).a("version", ((Object) (Long.valueOf(b())))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #65  <Method al ak.a(Object)>
	//    2    4:ldc1            #67  <String "name">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #40  <Method String a()>
	//    5   10:invokevirtual   #72  <Method al al.a(String, Object)>
	//    6   13:ldc1            #74  <String "version">
	//    7   15:aload_0         
	//    8   16:invokevirtual   #46  <Method long b()>
	//    9   19:invokestatic    #56  <Method Long Long.valueOf(long)>
	//   10   22:invokevirtual   #72  <Method al al.a(String, Object)>
	//   11   25:invokevirtual   #76  <Method String al.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #40  <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #86  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #29  <Field int b>
	//   13   21:invokestatic    #89  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #46  <Method long b()>
	//   18   30:invokestatic    #92  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #94  <Method void c.a(Parcel, int)>
	//   22   38:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new o();
	private final String a;
	private final int b;
	private final long c;

	static 
	{
	//    0    0:new             #17  <Class o>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void o()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
