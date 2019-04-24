// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.graphics.Bitmap;

// Referenced classes of package android.a.a.a:
//			d

public static class d$b extends d$r
{

	public d$b a(Bitmap bitmap)
	{
		a = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Bitmap a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$b a(CharSequence charsequence)
	{
		e = d$d.f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method CharSequence d$d.f(CharSequence)>
	//    3    5:putfield        #33  <Field CharSequence e>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$b b(Bitmap bitmap)
	{
		b = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Bitmap b>
		c = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #37  <Field boolean c>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public d$b b(CharSequence charsequence)
	{
		f = d$d.f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method CharSequence d$d.f(CharSequence)>
	//    3    5:putfield        #39  <Field CharSequence f>
		g = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #42  <Field boolean g>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	Bitmap a;
	Bitmap b;
	boolean c;

	public d$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void d$r()>
	//    2    4:return          
	}

	public d$b(d$d d$d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void d$r()>
		a(d$d1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method void a(d$d)>
	//    5    9:return          
	}
}
