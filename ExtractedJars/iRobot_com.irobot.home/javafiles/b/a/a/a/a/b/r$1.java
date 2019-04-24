// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.b;

import java.io.InputStream;

// Referenced classes of package b.a.a.a.a.b:
//			r

class r$1
	implements r$c
{

	public void read(InputStream inputstream, int i)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean a>
	//*   2    4:ifeq            15
			a = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #28  <Field boolean a>
		else
	//*   6   12:goto            25
			b.append(", ");
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field StringBuilder b>
	//    9   19:ldc1            #33  <String ", ">
	//   10   21:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		b.append(i);
	//   12   25:aload_0         
	//   13   26:getfield        #23  <Field StringBuilder b>
	//   14   29:iload_2         
	//   15   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   16   33:pop             
	//   17   34:return          
	}

	boolean a;
	final StringBuilder b;
	final r c;

	r$1(r r1, StringBuilder stringbuilder)
	{
		c = r1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field r c>
		b = stringbuilder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field StringBuilder b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
		a = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #28  <Field boolean a>
	//   11   19:return          
	}
}
