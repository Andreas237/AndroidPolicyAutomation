// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.api:
//			ap

public final class Scope extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	Scope(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		am.a(s, "scopeUri must not be null or empty");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "scopeUri must not be null or empty">
	//    4    7:invokestatic    #31  <Method String am.a(String, Object)>
	//    5   10:pop             
		a = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #33  <Field int a>
		b = s;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #35  <Field String b>
	//   12   21:return          
	}

	public Scope(String s)
	{
		this(1, s);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #38  <Method void Scope(int, String)>
	//    4    6:return          
	}

	public final String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String b>
	//    2    4:areturn         
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
		if(!(obj instanceof Scope))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Scope>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return b.equals(((Object) (((Scope)obj).b)));
	//   10   16:aload_0         
	//   11   17:getfield        #35  <Field String b>
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Scope>
	//   14   24:getfield        #35  <Field String b>
	//   15   27:invokevirtual   #45  <Method boolean String.equals(Object)>
	//   16   30:ireturn         
	}

	public final int hashCode()
	{
		return b.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String b>
	//    2    4:invokevirtual   #49  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final String toString()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String b>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #57  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field int a>
	//    7   11:invokestatic    #60  <Method void c.a(Parcel, int, int)>
		c.a(parcel, 2, a(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #62  <Method String a()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #65  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #67  <Method void c.a(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ap();
	private final int a;
	private final String b;

	static 
	{
	//    0    0:new             #16  <Class ap>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ap()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
