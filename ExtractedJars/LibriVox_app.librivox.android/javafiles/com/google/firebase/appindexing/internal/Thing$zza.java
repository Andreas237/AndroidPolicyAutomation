// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.firebase.appindexing.internal:
//			e, Thing

public final class Thing$zza extends AbstractSafeParcelable
{

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof Thing$zza))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Thing$zza>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Thing$zza)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Thing$zza>
	//   12   20:astore_1        
		return ak.a(((Object) (Boolean.valueOf(a))), ((Object) (Boolean.valueOf(((Thing$zza) (obj)).a)))) && ak.a(((Object) (Integer.valueOf(b))), ((Object) (Integer.valueOf(((Thing$zza) (obj)).b)))) && ak.a(((Object) (c)), ((Object) (((Thing$zza) (obj)).c))) && Thing.a(d, ((Thing$zza) (obj)).d);
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field boolean a>
	//   15   25:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//   16   28:aload_1         
	//   17   29:getfield        #28  <Field boolean a>
	//   18   32:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//   19   35:invokestatic    #50  <Method boolean ak.a(Object, Object)>
	//   20   38:ifeq            91
	//   21   41:aload_0         
	//   22   42:getfield        #30  <Field int b>
	//   23   45:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   24   48:aload_1         
	//   25   49:getfield        #30  <Field int b>
	//   26   52:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   27   55:invokestatic    #50  <Method boolean ak.a(Object, Object)>
	//   28   58:ifeq            91
	//   29   61:aload_0         
	//   30   62:getfield        #32  <Field String c>
	//   31   65:aload_1         
	//   32   66:getfield        #32  <Field String c>
	//   33   69:invokestatic    #50  <Method boolean ak.a(Object, Object)>
	//   34   72:ifeq            91
	//   35   75:aload_0         
	//   36   76:getfield        #37  <Field Bundle d>
	//   37   79:aload_1         
	//   38   80:getfield        #37  <Field Bundle d>
	//   39   83:invokestatic    #60  <Method boolean Thing.a(Bundle, Bundle)>
	//   40   86:ifeq            91
	//   41   89:iconst_1        
	//   42   90:ireturn         
	//   43   91:iconst_0        
	//   44   92:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Boolean.valueOf(a), Integer.valueOf(b), c, Integer.valueOf(Thing.a(d))
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field boolean a>
	//    6   10:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #30  <Field int b>
	//   12   20:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #32  <Field String c>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #37  <Field Bundle d>
	//   23   37:invokestatic    #67  <Method int Thing.a(Bundle)>
	//   24   40:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   25   43:aastore         
	//   26   44:invokestatic    #70  <Method int ak.a(Object[])>
	//   27   47:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("worksOffline: ");
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #76  <String "worksOffline: ">
	//    3    6:invokespecial   #79  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(a);
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field boolean a>
	//    8   15:invokevirtual   #83  <Method StringBuilder StringBuilder.append(boolean)>
	//    9   18:pop             
		stringbuilder.append(", score: ");
	//   10   19:aload_1         
	//   11   20:ldc1            #85  <String ", score: ">
	//   12   22:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(b);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #30  <Field int b>
	//   17   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
		if(!c.isEmpty())
	//*  19   35:aload_0         
	//*  20   36:getfield        #32  <Field String c>
	//*  21   39:invokevirtual   #97  <Method boolean String.isEmpty()>
	//*  22   42:ifne            61
		{
			stringbuilder.append(", accountEmail: ");
	//   23   45:aload_1         
	//   24   46:ldc1            #99  <String ", accountEmail: ">
	//   25   48:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
			stringbuilder.append(c);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #32  <Field String c>
	//   30   57:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		}
		Bundle bundle = d;
	//   32   61:aload_0         
	//   33   62:getfield        #37  <Field Bundle d>
	//   34   65:astore_2        
		if(bundle != null && !bundle.isEmpty())
	//*  35   66:aload_2         
	//*  36   67:ifnull          99
	//*  37   70:aload_2         
	//*  38   71:invokevirtual   #100 <Method boolean Bundle.isEmpty()>
	//*  39   74:ifne            99
		{
			stringbuilder.append(", Properties { ");
	//   40   77:aload_1         
	//   41   78:ldc1            #102 <String ", Properties { ">
	//   42   80:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
			Thing.a(d, stringbuilder);
	//   44   84:aload_0         
	//   45   85:getfield        #37  <Field Bundle d>
	//   46   88:aload_1         
	//   47   89:invokestatic    #105 <Method void Thing.a(Bundle, StringBuilder)>
			stringbuilder.append("}");
	//   48   92:aload_1         
	//   49   93:ldc1            #107 <String "}">
	//   50   95:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   51   98:pop             
		}
		return stringbuilder.toString();
	//   52   99:aload_1         
	//   53  100:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   54  103:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field boolean a>
	//    7   11:invokestatic    #119 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #30  <Field int b>
	//   12   20:invokestatic    #122 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #32  <Field String c>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #125 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #37  <Field Bundle d>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #128 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   25   43:aload_1         
	//   26   44:iload_2         
	//   27   45:invokestatic    #130 <Method void c.a(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os..Creator CREATOR = new e();
	private final boolean a;
	private final int b;
	private final String c;
	private final Bundle d;

	static 
	{
	//    0    0:new             #18  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void e()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public Thing$zza(boolean flag, int i, String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field boolean a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field String c>
		s = ((String) (bundle));
	//   11   19:aload           4
	//   12   21:astore_3        
		if(bundle == null)
	//*  13   22:aload           4
	//*  14   24:ifnonnull       35
			s = ((String) (new Bundle()));
	//   15   27:new             #34  <Class Bundle>
	//   16   30:dup             
	//   17   31:invokespecial   #35  <Method void Bundle()>
	//   18   34:astore_3        
		d = ((Bundle) (s));
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:putfield        #37  <Field Bundle d>
	//   22   40:return          
	}
}
