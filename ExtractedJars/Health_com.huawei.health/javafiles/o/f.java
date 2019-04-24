// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.a.a.a.p;
import android.os.Bundle;

public final class f
	implements android.a.a.a.s.a.a
{

	public f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public p a(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
	{
		return new p(s, charsequence, acharsequence, flag, bundle);
	//    0    0:new             #15  <Class p>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokespecial   #18  <Method void p(String, CharSequence, CharSequence[], boolean, Bundle)>
	//    8   14:areturn         
	}

	public p[] a(int i)
	{
		return new p[i];
	//    0    0:iload_1         
	//    1    1:anewarray       p[]
	//    2    4:areturn         
	}

	public android.a.a.a.s.a b(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
	{
		return ((android.a.a.a.s.a) (a(s, charsequence, acharsequence, flag, bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #23  <Method p a(String, CharSequence, CharSequence[], boolean, Bundle)>
	//    7   11:areturn         
	}

	public android.a.a.a.s.a[] b(int i)
	{
		return ((android.a.a.a.s.a []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method p[] a(int)>
	//    3    5:areturn         
	}
}
