// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.graphics.Bitmap;

public class ck
{

	public ck()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public ck(String s, String s1, String s2, Bitmap bitmap, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String b>
		i = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String i>
		g = bitmap;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field Bitmap g>
		h = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #33  <Field boolean h>
	//   17   31:return          
	}

	public String a()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String i>
	//    2    4:areturn         
	}

	public void a(int j)
	{
		d = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int d>
	//    3    5:return          
	}

	public void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String a>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field boolean f>
	//    3    5:return          
	}

	public void b(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String b>
	//    3    5:return          
	}

	public boolean b()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean h>
	//    2    4:ireturn         
	}

	public Bitmap c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bitmap g>
	//    2    4:areturn         
	}

	public void c(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String c>
	//    3    5:return          
	}

	public String d()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:areturn         
	}

	public void d(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String e>
	//    3    5:return          
	}

	public String e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String b>
	//    2    4:areturn         
	}

	public String f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String e>
	//    2    4:areturn         
	}

	public boolean g()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean f>
	//    2    4:ireturn         
	}

	private String a;
	private String b;
	private String c;
	private int d;
	private String e;
	private boolean f;
	private Bitmap g;
	private boolean h;
	private String i;
}
