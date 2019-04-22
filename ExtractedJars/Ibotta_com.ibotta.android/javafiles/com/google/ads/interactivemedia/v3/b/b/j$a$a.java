// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;


// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			j

static class j$a$a
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

	j$a$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
