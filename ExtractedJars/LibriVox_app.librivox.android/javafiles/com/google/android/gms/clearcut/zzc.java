// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.clearcut:
//			h

public final class zzc extends AbstractSafeParcelable
{

	public zzc(boolean flag, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field boolean a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #27  <Field long b>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #29  <Field long c>
	//   11   20:return          
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
		if(obj instanceof zzc)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzc>
	//*   7   11:ifeq            56
		{
			obj = ((Object) ((zzc)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class zzc>
	//   10   18:astore_1        
			if(a == ((zzc) (obj)).a && b == ((zzc) (obj)).b && c == ((zzc) (obj)).c)
	//*  11   19:aload_0         
	//*  12   20:getfield        #25  <Field boolean a>
	//*  13   23:aload_1         
	//*  14   24:getfield        #25  <Field boolean a>
	//*  15   27:icmpne          56
	//*  16   30:aload_0         
	//*  17   31:getfield        #27  <Field long b>
	//*  18   34:aload_1         
	//*  19   35:getfield        #27  <Field long b>
	//*  20   38:lcmp            
	//*  21   39:ifne            56
	//*  22   42:aload_0         
	//*  23   43:getfield        #29  <Field long c>
	//*  24   46:aload_1         
	//*  25   47:getfield        #29  <Field long c>
	//*  26   50:lcmp            
	//*  27   51:ifne            56
				return true;
	//   28   54:iconst_1        
	//   29   55:ireturn         
		}
		return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Boolean.valueOf(a), Long.valueOf(b), Long.valueOf(c)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field boolean a>
	//    6   10:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field long b>
	//   12   20:invokestatic    #46  <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #29  <Field long c>
	//   18   30:invokestatic    #46  <Method Long Long.valueOf(long)>
	//   19   33:aastore         
	//   20   34:invokestatic    #51  <Method int ak.a(Object[])>
	//   21   37:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
	//    0    0:new             #55  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #57  <String "CollectForDebugParcelable[skipPersistentStorage: ">
	//    3    6:invokespecial   #60  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(a);
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field boolean a>
	//    8   15:invokevirtual   #64  <Method StringBuilder StringBuilder.append(boolean)>
	//    9   18:pop             
		stringbuilder.append(",collectForDebugStartTimeMillis: ");
	//   10   19:aload_1         
	//   11   20:ldc1            #66  <String ",collectForDebugStartTimeMillis: ">
	//   12   22:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(b);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #27  <Field long b>
	//   17   31:invokevirtual   #72  <Method StringBuilder StringBuilder.append(long)>
	//   18   34:pop             
		stringbuilder.append(",collectForDebugExpiryTimeMillis: ");
	//   19   35:aload_1         
	//   20   36:ldc1            #74  <String ",collectForDebugExpiryTimeMillis: ">
	//   21   38:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(c);
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:getfield        #29  <Field long c>
	//   26   47:invokevirtual   #72  <Method StringBuilder StringBuilder.append(long)>
	//   27   50:pop             
		stringbuilder.append("]");
	//   28   51:aload_1         
	//   29   52:ldc1            #76  <String "]">
	//   30   54:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
		return stringbuilder.toString();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   62:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field boolean a>
	//    7   11:invokestatic    #88  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, c);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field long c>
	//   12   20:invokestatic    #91  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #27  <Field long b>
	//   17   29:invokestatic    #91  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #93  <Method void c.a(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new h();
	private final boolean a;
	private final long b;
	private final long c;

	static 
	{
	//    0    0:new             #15  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void h()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
