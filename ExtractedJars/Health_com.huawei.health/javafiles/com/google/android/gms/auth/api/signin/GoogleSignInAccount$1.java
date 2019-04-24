// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInAccount

final class GoogleSignInAccount$1
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		return zza((Scope)obj, (Scope)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Scope>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class Scope>
	//    5    9:invokevirtual   #22  <Method int zza(Scope, Scope)>
	//    6   12:ireturn         
	}

	public int zza(Scope scope, Scope scope1)
	{
		return scope.zzvt().compareTo(scope1.zzvt());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method String Scope.zzvt()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #26  <Method String Scope.zzvt()>
	//    4    8:invokevirtual   #32  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	GoogleSignInAccount$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
