// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.cast.*;

// Referenced classes of package com.google.android.gms.cast:
//			d

final class ar extends al
{

	ar(d d, w w, String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field String a>
		super(w);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void al(w)>
	//    6   10:return          
	}

	public final void a(c c)
	{
		((al)this).a((ac)c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ac>
	//    3    5:invokevirtual   #20  <Method void al.a(ac)>
	//    4    8:return          
	}

	public final void a(ac ac1)
	{
		if(TextUtils.isEmpty(((CharSequence) (a))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field String a>
	//*   2    4:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            32
		{
			((v)this).b(((v)this).a(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", ((android.app.PendingIntent) (null)))));
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:new             #30  <Class Status>
	//    7   15:dup             
	//    8   16:sipush          2001
	//    9   19:ldc1            #32  <String "IllegalArgument: sessionId cannot be null or empty">
	//   10   21:aconst_null     
	//   11   22:invokespecial   #35  <Method void Status(int, String, android.app.PendingIntent)>
	//   12   25:invokevirtual   #40  <Method com.google.android.gms.common.api.ah v.a(Status)>
	//   13   28:invokevirtual   #44  <Method void v.b(com.google.android.gms.common.api.ah)>
			return;
	//   14   31:return          
		}
		try
		{
			ac1.a(a, ((com.google.android.gms.common.api.internal.f) (this)));
	//   15   32:aload_1         
	//   16   33:aload_0         
	//   17   34:getfield        #10  <Field String a>
	//   18   37:aload_0         
	//   19   38:invokevirtual   #47  <Method void ac.a(String, com.google.android.gms.common.api.internal.f)>
			return;
	//   20   41:return          
		}
	//*  21   42:aload_0         
	//*  22   43:sipush          2001
	//*  23   46:invokevirtual   #50  <Method void v.a(int)>
	//*  24   49:return          
		// Misplaced declaration of an exception variable
		catch(ac ac1)
		{
			((v)this).a(2001);
		}
	//*  25   50:astore_1        
	//*  26   51:goto            42
	}

	private final String a;
}
