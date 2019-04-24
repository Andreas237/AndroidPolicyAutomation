// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.os.Bundle;

// Referenced classes of package android.a.a.a:
//			p

public static final class p$a
{

	public p$a a(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			e.putAll(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Bundle e>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #42  <Method void Bundle.putAll(Bundle)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public p$a a(CharSequence charsequence)
	{
		b = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field CharSequence b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public p$a a(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field boolean d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public p$a a(CharSequence acharsequence[])
	{
		c = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field CharSequence[] c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Bundle a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Bundle e>
	//    2    4:areturn         
	}

	public p b()
	{
		return new p(a, b, c, d, e);
	//    0    0:new             #6   <Class p>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field CharSequence b>
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field CharSequence[] c>
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field boolean d>
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field Bundle e>
	//   12   24:invokespecial   #54  <Method void p(String, CharSequence, CharSequence[], boolean, Bundle)>
	//   13   27:areturn         
	}

	private final String a;
	private CharSequence b;
	private CharSequence c[];
	private boolean d;
	private Bundle e;

	public p$a(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		d = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #23  <Field boolean d>
		e = new Bundle();
	//    5    9:aload_0         
	//    6   10:new             #25  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #26  <Method void Bundle()>
	//    9   17:putfield        #28  <Field Bundle e>
		if(s == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       34
		{
			throw new IllegalArgumentException("Result key can't be null");
	//   12   24:new             #30  <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc1            #32  <String "Result key can't be null">
	//   15   30:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
		} else
		{
			a = s;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #36  <Field String a>
			return;
	//   20   39:return          
		}
	}
}
