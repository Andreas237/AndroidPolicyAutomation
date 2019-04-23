// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.icing:
//			fh

public final class zzj extends AbstractSafeParcelable
{

	public zzj(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String b>
		c = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field String c>
	//   11   19:return          
	}

	public final String toString()
	{
		return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
			a, b, c
		});
	//    0    0:ldc1            #32  <String "DocumentId[packageName=%s, corpusName=%s, uri=%s]">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #24  <Field String a>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #26  <Field String b>
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:aload_0         
	//   16   23:getfield        #28  <Field String c>
	//   17   26:aastore         
	//   18   27:invokestatic    #40  <Method String String.format(String, Object[])>
	//   19   30:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #50  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #26  <Field String b>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #50  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #28  <Field String c>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #50  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:invokestatic    #52  <Method void c.a(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fh();
	private final String a;
	private final String b;
	private final String c;

	static 
	{
	//    0    0:new             #14  <Class fh>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void fh()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
