// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ah;
import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			o, i, u, l

final class k extends o
{

	k(w w, Context context, GoogleSignInOptions googlesigninoptions)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Context a>
		b = googlesigninoptions;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field GoogleSignInOptions b>
		super(w);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #17  <Method void o(w)>
	//    9   15:return          
	}

	protected final ah a(Status status)
	{
		return ((ah) (new c(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) (null)), status)));
	//    0    0:new             #21  <Class c>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokespecial   #24  <Method void c(com.google.android.gms.auth.api.signin.GoogleSignInAccount, Status)>
	//    5    9:areturn         
	}

	protected final void a(com.google.android.gms.common.api.c c1)
	{
		((u)((i)c1).x()).a(((s) (new l(this))), b);
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class i>
	//    2    4:invokevirtual   #31  <Method android.os.IInterface i.x()>
	//    3    7:checkcast       #33  <Class u>
	//    4   10:new             #35  <Class l>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #38  <Method void l(k)>
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field GoogleSignInOptions b>
	//   10   22:invokeinterface #41  <Method void u.a(s, GoogleSignInOptions)>
	//   11   27:return          
	}

	final Context a;
	final GoogleSignInOptions b;
}
