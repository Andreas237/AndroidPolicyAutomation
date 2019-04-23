// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.icing:
//			fn, zzn, zzv

public final class zzs extends AbstractSafeParcelable
{

	zzs(String s, String s1, boolean flag, int j, boolean flag1, String s2, zzn azzn[], 
			String s3, zzv zzv)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String b>
		c = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #39  <Field boolean c>
		d = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #41  <Field int d>
		e = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #43  <Field boolean e>
		f = s2;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #45  <Field String f>
		g = azzn;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #47  <Field zzn[] g>
		h = s3;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #49  <Field String h>
		i = zzv;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #51  <Field zzv i>
	//   29   55:return          
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
		if(!(obj instanceof zzs))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzs>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzs)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzs>
	//   12   20:astore_1        
		return c == ((zzs) (obj)).c && d == ((zzs) (obj)).d && e == ((zzs) (obj)).e && ak.a(((Object) (a)), ((Object) (((zzs) (obj)).a))) && ak.a(((Object) (b)), ((Object) (((zzs) (obj)).b))) && ak.a(((Object) (f)), ((Object) (((zzs) (obj)).f))) && ak.a(((Object) (h)), ((Object) (((zzs) (obj)).h))) && ak.a(((Object) (i)), ((Object) (((zzs) (obj)).i))) && Arrays.equals(((Object []) (g)), ((Object []) (((zzs) (obj)).g)));
	//   13   21:aload_0         
	//   14   22:getfield        #39  <Field boolean c>
	//   15   25:aload_1         
	//   16   26:getfield        #39  <Field boolean c>
	//   17   29:icmpne          140
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field int d>
	//   20   36:aload_1         
	//   21   37:getfield        #41  <Field int d>
	//   22   40:icmpne          140
	//   23   43:aload_0         
	//   24   44:getfield        #43  <Field boolean e>
	//   25   47:aload_1         
	//   26   48:getfield        #43  <Field boolean e>
	//   27   51:icmpne          140
	//   28   54:aload_0         
	//   29   55:getfield        #35  <Field String a>
	//   30   58:aload_1         
	//   31   59:getfield        #35  <Field String a>
	//   32   62:invokestatic    #58  <Method boolean ak.a(Object, Object)>
	//   33   65:ifeq            140
	//   34   68:aload_0         
	//   35   69:getfield        #37  <Field String b>
	//   36   72:aload_1         
	//   37   73:getfield        #37  <Field String b>
	//   38   76:invokestatic    #58  <Method boolean ak.a(Object, Object)>
	//   39   79:ifeq            140
	//   40   82:aload_0         
	//   41   83:getfield        #45  <Field String f>
	//   42   86:aload_1         
	//   43   87:getfield        #45  <Field String f>
	//   44   90:invokestatic    #58  <Method boolean ak.a(Object, Object)>
	//   45   93:ifeq            140
	//   46   96:aload_0         
	//   47   97:getfield        #49  <Field String h>
	//   48  100:aload_1         
	//   49  101:getfield        #49  <Field String h>
	//   50  104:invokestatic    #58  <Method boolean ak.a(Object, Object)>
	//   51  107:ifeq            140
	//   52  110:aload_0         
	//   53  111:getfield        #51  <Field zzv i>
	//   54  114:aload_1         
	//   55  115:getfield        #51  <Field zzv i>
	//   56  118:invokestatic    #58  <Method boolean ak.a(Object, Object)>
	//   57  121:ifeq            140
	//   58  124:aload_0         
	//   59  125:getfield        #47  <Field zzn[] g>
	//   60  128:aload_1         
	//   61  129:getfield        #47  <Field zzn[] g>
	//   62  132:invokestatic    #63  <Method boolean Arrays.equals(Object[], Object[])>
	//   63  135:ifeq            140
	//   64  138:iconst_1        
	//   65  139:ireturn         
	//   66  140:iconst_0        
	//   67  141:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			a, b, Boolean.valueOf(c), Integer.valueOf(d), Boolean.valueOf(e), f, Integer.valueOf(Arrays.hashCode(((Object []) (g)))), h, i
		});
	//    0    0:bipush          9
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field String a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #37  <Field String b>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #39  <Field boolean c>
	//   16   25:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #41  <Field int d>
	//   22   35:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #43  <Field boolean e>
	//   28   45:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   29   48:aastore         
	//   30   49:dup             
	//   31   50:iconst_5        
	//   32   51:aload_0         
	//   33   52:getfield        #45  <Field String f>
	//   34   55:aastore         
	//   35   56:dup             
	//   36   57:bipush          6
	//   37   59:aload_0         
	//   38   60:getfield        #47  <Field zzn[] g>
	//   39   63:invokestatic    #81  <Method int Arrays.hashCode(Object[])>
	//   40   66:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   41   69:aastore         
	//   42   70:dup             
	//   43   71:bipush          7
	//   44   73:aload_0         
	//   45   74:getfield        #49  <Field String h>
	//   46   77:aastore         
	//   47   78:dup             
	//   48   79:bipush          8
	//   49   81:aload_0         
	//   50   82:getfield        #51  <Field zzv i>
	//   51   85:aastore         
	//   52   86:invokestatic    #83  <Method int ak.a(Object[])>
	//   53   89:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #93  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #37  <Field String b>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #93  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #39  <Field boolean c>
	//   19   31:invokestatic    #96  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #41  <Field int d>
	//   24   40:invokestatic    #99  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #43  <Field boolean e>
	//   29   49:invokestatic    #96  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #45  <Field String f>
	//   34   59:iconst_0        
	//   35   60:invokestatic    #93  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ((android.os.Parcelable []) (g)), j, false);
	//   36   63:aload_1         
	//   37   64:bipush          7
	//   38   66:aload_0         
	//   39   67:getfield        #47  <Field zzn[] g>
	//   40   70:iload_2         
	//   41   71:iconst_0        
	//   42   72:invokestatic    #102 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, h, false);
	//   43   75:aload_1         
	//   44   76:bipush          11
	//   45   78:aload_0         
	//   46   79:getfield        #49  <Field String h>
	//   47   82:iconst_0        
	//   48   83:invokestatic    #93  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, ((android.os.Parcelable) (i)), j, false);
	//   49   86:aload_1         
	//   50   87:bipush          12
	//   51   89:aload_0         
	//   52   90:getfield        #51  <Field zzv i>
	//   53   93:iload_2         
	//   54   94:iconst_0        
	//   55   95:invokestatic    #105 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   56   98:aload_1         
	//   57   99:iload_3         
	//   58  100:invokestatic    #107 <Method void c.a(Parcel, int)>
	//   59  103:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fn();
	private final String a;
	private final String b;
	private final boolean c;
	private final int d;
	private final boolean e;
	private final String f;
	private final zzn g[];
	private final String h;
	private final zzv i;

	static 
	{
	//    0    0:new             #25  <Class fn>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void fn()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
