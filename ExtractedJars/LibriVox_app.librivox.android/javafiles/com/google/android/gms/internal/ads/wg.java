// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wf

final class wg
{

	public wg(wf wf1)
	{
		c = wf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field wf c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		a = -1L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #18  <Long -1L>
	//    7   13:putfield        #21  <Field long a>
		b = -1L;
	//    8   16:aload_0         
	//    9   17:ldc2w           #18  <Long -1L>
	//   10   20:putfield        #23  <Field long b>
	//   11   23:return          
	}

	public final long a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long b>
	//    2    4:lreturn         
	}

	public final void b()
	{
		b = wf.a(c).b();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field wf c>
	//    3    5:invokestatic    #30  <Method e wf.a(wf)>
	//    4    8:invokeinterface #34  <Method long e.b()>
	//    5   13:putfield        #23  <Field long b>
	//    6   16:return          
	}

	public final void c()
	{
		a = wf.a(c).b();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field wf c>
	//    3    5:invokestatic    #30  <Method e wf.a(wf)>
	//    4    8:invokeinterface #34  <Method long e.b()>
	//    5   13:putfield        #21  <Field long a>
	//    6   16:return          
	}

	public final Bundle d()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #38  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putLong("topen", a);
	//    4    8:aload_1         
	//    5    9:ldc1            #41  <String "topen">
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field long a>
	//    8   15:invokevirtual   #45  <Method void Bundle.putLong(String, long)>
		bundle.putLong("tclose", b);
	//    9   18:aload_1         
	//   10   19:ldc1            #47  <String "tclose">
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field long b>
	//   13   25:invokevirtual   #45  <Method void Bundle.putLong(String, long)>
		return bundle;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	private long a;
	private long b;
	private final wf c;
}
