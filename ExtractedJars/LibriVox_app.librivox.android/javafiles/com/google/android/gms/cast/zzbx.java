// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;

// Referenced classes of package com.google.android.gms.cast:
//			ah

public final class zzbx extends AbstractSafeParcelable
{

	public zzbx(String s, int i, int j, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #30  <Field int c>
		d = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field String d>
	//   14   25:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzbx))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbx>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzbx)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbx>
	//   12   20:astore_1        
		return aj.a(((Object) (a)), ((Object) (((zzbx) (obj)).a))) && aj.a(((Object) (Integer.valueOf(b))), ((Object) (Integer.valueOf(((zzbx) (obj)).b)))) && aj.a(((Object) (Integer.valueOf(c))), ((Object) (Integer.valueOf(((zzbx) (obj)).c)))) && aj.a(((Object) (((zzbx) (obj)).d)), ((Object) (d)));
	//   13   21:aload_0         
	//   14   22:getfield        #26  <Field String a>
	//   15   25:aload_1         
	//   16   26:getfield        #26  <Field String a>
	//   17   29:invokestatic    #39  <Method boolean aj.a(Object, Object)>
	//   18   32:ifeq            91
	//   19   35:aload_0         
	//   20   36:getfield        #28  <Field int b>
	//   21   39:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   22   42:aload_1         
	//   23   43:getfield        #28  <Field int b>
	//   24   46:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   25   49:invokestatic    #39  <Method boolean aj.a(Object, Object)>
	//   26   52:ifeq            91
	//   27   55:aload_0         
	//   28   56:getfield        #30  <Field int c>
	//   29   59:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   30   62:aload_1         
	//   31   63:getfield        #30  <Field int c>
	//   32   66:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   33   69:invokestatic    #39  <Method boolean aj.a(Object, Object)>
	//   34   72:ifeq            91
	//   35   75:aload_1         
	//   36   76:getfield        #32  <Field String d>
	//   37   79:aload_0         
	//   38   80:getfield        #32  <Field String d>
	//   39   83:invokestatic    #39  <Method boolean aj.a(Object, Object)>
	//   40   86:ifeq            91
	//   41   89:iconst_1        
	//   42   90:ireturn         
	//   43   91:iconst_0        
	//   44   92:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			a, Integer.valueOf(b), Integer.valueOf(c), d
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field String a>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #28  <Field int b>
	//   11   17:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #30  <Field int c>
	//   17   27:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #32  <Field String d>
	//   23   37:aastore         
	//   24   38:invokestatic    #54  <Method int ak.a(Object[])>
	//   25   41:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #64  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #28  <Field int b>
	//   13   21:invokestatic    #67  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #30  <Field int c>
	//   18   30:invokestatic    #67  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d, false);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #32  <Field String d>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #64  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   25   43:aload_1         
	//   26   44:iload_2         
	//   27   45:invokestatic    #69  <Method void c.a(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ah();
	private final String a;
	private final int b;
	private final int c;
	private final String d;

	static 
	{
	//    0    0:new             #16  <Class ah>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ah()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
