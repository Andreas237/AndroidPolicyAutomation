// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			j

private static final class j$a extends Writer
{
	static class a
		implements CharSequence
	{

		public char charAt(int i)
		{
			return a[i];
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field char[] a>
		//    2    4:iload_1         
		//    3    5:caload          
		//    4    6:ireturn         
		}

		public int length()
		{
			return a.length;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field char[] a>
		//    2    4:arraylength     
		//    3    5:ireturn         
		}

		public CharSequence subSequence(int i, int k)
		{
			return ((CharSequence) (new String(a, i, k - i)));
		//    0    0:new             #27  <Class String>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field char[] a>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_1         
		//    7   11:isub            
		//    8   12:invokespecial   #30  <Method void String(char[], int, int)>
		//    9   15:areturn         
		}

		char a[];

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	public void close()
	{
	//    0    0:return          
	}

	public void flush()
	{
	//    0    0:return          
	}

	public void write(int i)
		throws IOException
	{
		a.append((char)i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Appendable a>
	//    2    4:iload_1         
	//    3    5:int2char        
	//    4    6:invokeinterface #38  <Method Appendable Appendable.append(char)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void write(char ac[], int i, int k)
		throws IOException
	{
		a a1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field j$a$a b>
	//    2    4:astore          4
		a1.a = ac;
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:putfield        #43  <Field char[] j$a$a.a>
		a.append(((CharSequence) (a1)), i, k + i);
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field Appendable a>
	//    8   16:aload           4
	//    9   18:iload_2         
	//   10   19:iload_3         
	//   11   20:iload_2         
	//   12   21:iadd            
	//   13   22:invokeinterface #46  <Method Appendable Appendable.append(CharSequence, int, int)>
	//   14   27:pop             
	//   15   28:return          
	}

	private final Appendable a;
	private final a b;

	private j$a(Appendable appendable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Writer()>
		b = new a();
	//    2    4:aload_0         
	//    3    5:new             #9   <Class j$a$a>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void j$a$a()>
	//    6   12:putfield        #20  <Field j$a$a b>
		a = appendable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field Appendable a>
	//   10   20:return          
	}

	j$a(Appendable appendable, j$1 j$1)
	{
		this(appendable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void j$a(Appendable)>
	//    3    5:return          
	}
}
