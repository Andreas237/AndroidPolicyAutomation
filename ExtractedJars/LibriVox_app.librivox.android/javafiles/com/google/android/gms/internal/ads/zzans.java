// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			mr, aif

public final class zzans extends AbstractSafeParcelable
{

	zzans(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #30  <Field int c>
	//   11   19:return          
	}

	public static zzans a(aif aif)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #33  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	public final String toString()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int a>
	//    2    4:istore_1        
		int j = b;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field int b>
	//    5    9:istore_2        
		int k = c;
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field int c>
	//    8   14:istore_3        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    9   15:new             #38  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:bipush          35
	//   12   21:invokespecial   #41  <Method void StringBuilder(int)>
	//   13   24:astore          4
		stringbuilder.append(i);
	//   14   26:aload           4
	//   15   28:iload_1         
	//   16   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		stringbuilder.append(".");
	//   18   33:aload           4
	//   19   35:ldc1            #47  <String ".">
	//   20   37:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(j);
	//   22   41:aload           4
	//   23   43:iload_2         
	//   24   44:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   25   47:pop             
		stringbuilder.append(".");
	//   26   48:aload           4
	//   27   50:ldc1            #47  <String ".">
	//   28   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
		stringbuilder.append(k);
	//   30   56:aload           4
	//   31   58:iload_3         
	//   32   59:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   33   62:pop             
		return stringbuilder.toString();
	//   34   63:aload           4
	//   35   65:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   36   68:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int a>
	//    7   11:invokestatic    #62  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field int b>
	//   12   20:invokestatic    #62  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #30  <Field int c>
	//   17   29:invokestatic    #62  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #64  <Method void c.a(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new mr();
	private final int a;
	private final int b;
	private final int c;

	static 
	{
	//    0    0:new             #16  <Class mr>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void mr()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
