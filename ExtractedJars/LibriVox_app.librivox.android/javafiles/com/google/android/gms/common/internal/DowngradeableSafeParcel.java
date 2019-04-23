// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//			ReflectedParcelable

public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public DowngradeableSafeParcel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractSafeParcelable()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean d>
	//    5    9:return          
	}

	private static final Object a = new Object();
	private static ClassLoader b = null;
	private static Integer c = null;
	private boolean d;

	static 
	{
	//    0    0:new             #18  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object a>
	//    4   10:aconst_null     
	//    5   11:putstatic       #25  <Field ClassLoader b>
	//    6   14:aconst_null     
	//    7   15:putstatic       #27  <Field Integer c>
	//*   8   18:return          
	}
}
