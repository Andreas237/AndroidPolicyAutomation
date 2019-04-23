// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.icing:
//			fo

public final class zzv extends AbstractSafeParcelable
{

	public zzv(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field boolean a>
	//    5    9:return          
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
		if(!(obj instanceof zzv))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzv>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzv)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzv>
	//   12   20:astore_1        
		return a == ((zzv) (obj)).a;
	//   13   21:aload_0         
	//   14   22:getfield        #22  <Field boolean a>
	//   15   25:aload_1         
	//   16   26:getfield        #22  <Field boolean a>
	//   17   29:icmpne          34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public final int hashCode()
	{
		return !a ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean a>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #33  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field boolean a>
	//    7   11:invokestatic    #36  <Method void c.a(Parcel, int, boolean)>
		c.a(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #38  <Method void c.a(Parcel, int)>
	//   11   19:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fo();
	private final boolean a;

	static 
	{
	//    0    0:new             #12  <Class fo>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void fo()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
