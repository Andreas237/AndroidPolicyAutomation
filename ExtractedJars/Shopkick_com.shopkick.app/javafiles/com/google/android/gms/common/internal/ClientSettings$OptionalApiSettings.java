// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//			ClientSettings, Preconditions

public static final class ClientSettings$OptionalApiSettings
{

	public final Set mScopes;

	public ClientSettings$OptionalApiSettings(Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		Preconditions.checkNotNull(((Object) (set)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #21  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		mScopes = Collections.unmodifiableSet(set);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #27  <Method Set Collections.unmodifiableSet(Set)>
	//    8   14:putfield        #29  <Field Set mScopes>
	//    9   17:return          
	}
}
