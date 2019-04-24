// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.gson.internal:
//			Streams

private static final class Streams$AppendableWriter extends Writer
{
	static class CurrentWrite
		implements CharSequence
	{

		public char charAt(int i)
		{
			return chars[i];
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field char[] chars>
		//    2    4:iload_1         
		//    3    5:caload          
		//    4    6:ireturn         
		}

		public int length()
		{
			return chars.length;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field char[] chars>
		//    2    4:arraylength     
		//    3    5:ireturn         
		}

		public CharSequence subSequence(int i, int j)
		{
			return ((CharSequence) (new String(chars, i, j - i)));
		//    0    0:new             #29  <Class String>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field char[] chars>
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_1         
		//    7   11:isub            
		//    8   12:invokespecial   #32  <Method void String(char[], int, int)>
		//    9   15:areturn         
		}

		char chars[];

		CurrentWrite()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
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
		appendable.append((char)i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Appendable appendable>
	//    2    4:iload_1         
	//    3    5:int2char        
	//    4    6:invokeinterface #40  <Method Appendable Appendable.append(char)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void write(char ac[], int i, int j)
		throws IOException
	{
		currentWrite.chars = ac;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
	//    2    4:aload_1         
	//    3    5:putfield        #46  <Field char[] Streams$AppendableWriter$CurrentWrite.chars>
		appendable.append(((CharSequence) (currentWrite)), i, i + j);
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Appendable appendable>
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
	//    8   16:iload_2         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:iadd            
	//   12   20:invokeinterface #49  <Method Appendable Appendable.append(CharSequence, int, int)>
	//   13   25:pop             
	//   14   26:return          
	}

	private final Appendable appendable;
	private final CurrentWrite currentWrite;

	private Streams$AppendableWriter(Appendable appendable1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Writer()>
		currentWrite = new CurrentWrite();
	//    2    4:aload_0         
	//    3    5:new             #9   <Class Streams$AppendableWriter$CurrentWrite>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Streams$AppendableWriter$CurrentWrite()>
	//    6   12:putfield        #22  <Field Streams$AppendableWriter$CurrentWrite currentWrite>
		appendable = appendable1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #24  <Field Appendable appendable>
	//   10   20:return          
	}

	Streams$AppendableWriter(Appendable appendable1, Streams._cls1 _pcls1)
	{
		this(appendable1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void Streams$AppendableWriter(Appendable)>
	//    3    5:return          
	}
}
