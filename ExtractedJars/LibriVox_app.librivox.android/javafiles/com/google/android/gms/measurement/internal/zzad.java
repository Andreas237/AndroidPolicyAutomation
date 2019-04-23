// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			f, e

public final class zzad extends AbstractSafeParcelable
	implements Iterable
{

	zzad(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Bundle a>
	//    5    9:return          
	}

	static Bundle a(zzad zzad1)
	{
		return zzad1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:areturn         
	}

	public final int a()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:invokevirtual   #31  <Method int Bundle.size()>
	//    3    7:ireturn         
	}

	final Object a(String s)
	{
		return a.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method Object Bundle.get(String)>
	//    4    8:areturn         
	}

	public final Bundle b()
	{
		return new Bundle(a);
	//    0    0:new             #28  <Class Bundle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Bundle a>
	//    4    8:invokespecial   #39  <Method void Bundle(Bundle)>
	//    5   11:areturn         
	}

	final Long b(String s)
	{
		return Long.valueOf(a.getLong(s));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #44  <Method long Bundle.getLong(String)>
	//    4    8:invokestatic    #50  <Method Long Long.valueOf(long)>
	//    5   11:areturn         
	}

	final Double c(String s)
	{
		return Double.valueOf(a.getDouble(s));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method double Bundle.getDouble(String)>
	//    4    8:invokestatic    #61  <Method Double Double.valueOf(double)>
	//    5   11:areturn         
	}

	final String d(String s)
	{
		return a.getString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #66  <Method String Bundle.getString(String)>
	//    4    8:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new e(this)));
	//    0    0:new             #70  <Class e>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #73  <Method void e(zzad)>
	//    4    8:areturn         
	}

	public final String toString()
	{
		return a.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle a>
	//    2    4:invokevirtual   #77  <Method String Bundle.toString()>
	//    3    7:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #84  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #86  <Method Bundle b()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #89  <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #91  <Method void c.a(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new f();
	private final Bundle a;

	static 
	{
	//    0    0:new             #14  <Class f>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void f()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
