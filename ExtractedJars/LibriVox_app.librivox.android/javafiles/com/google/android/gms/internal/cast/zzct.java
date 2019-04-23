// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.cast:
//			u, aj

public final class zzct extends AbstractSafeParcelable
{

	public zzct()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #21  <Method void zzct(String)>
	//    3    5:return          
	}

	zzct(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String a>
	//    5    9:return          
	}

	public final String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String a>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzct))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzct>
	//*   7   11:ifne            16
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((zzct)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzct>
	//   12   20:astore_1        
			return aj.a(((Object) (a)), ((Object) (((zzct) (obj)).a)));
	//   13   21:aload_0         
	//   14   22:getfield        #24  <Field String a>
	//   15   25:aload_1         
	//   16   26:getfield        #24  <Field String a>
	//   17   29:invokestatic    #32  <Method boolean aj.a(Object, Object)>
	//   18   32:ireturn         
		}
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			a
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field String a>
	//    6   10:aastore         
	//    7   11:invokestatic    #41  <Method int ak.a(Object[])>
	//    8   14:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #51  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #53  <Method void c.a(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new u();
	private String a;

	static 
	{
	//    0    0:new             #12  <Class u>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void u()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
