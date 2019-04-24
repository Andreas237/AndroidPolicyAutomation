// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			Streams

static class Streams$AppendableWriter$CurrentWrite
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

	Streams$AppendableWriter$CurrentWrite()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
