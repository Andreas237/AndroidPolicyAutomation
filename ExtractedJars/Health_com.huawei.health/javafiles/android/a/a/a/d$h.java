// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import java.util.ArrayList;

// Referenced classes of package android.a.a.a:
//			d

public static class d$h extends d$r
{

	public d$h a(CharSequence charsequence)
	{
		e = d$d.f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #30  <Method CharSequence d$d.f(CharSequence)>
	//    3    5:putfield        #34  <Field CharSequence e>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$h b(CharSequence charsequence)
	{
		f = d$d.f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #30  <Method CharSequence d$d.f(CharSequence)>
	//    3    5:putfield        #37  <Field CharSequence f>
		g = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #41  <Field boolean g>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public d$h c(CharSequence charsequence)
	{
		a.add(((Object) (d$d.f(charsequence))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayList a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #30  <Method CharSequence d$d.f(CharSequence)>
	//    4    8:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	ArrayList a;

	public d$h()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void d$r()>
		a = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList a>
	//    7   15:return          
	}

	public d$h(d$d d$d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void d$r()>
		a = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList a>
		a(d$d1);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #23  <Method void a(d$d)>
	//   10   20:return          
	}
}
