// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookRequestError

private static class FacebookRequestError$Range
{

	boolean contains(int i)
	{
		return start <= i && i <= end;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int start>
	//    2    4:iload_1         
	//    3    5:icmpgt          18
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field int end>
	//    7   13:icmpgt          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private final int end;
	private final int start;

	private FacebookRequestError$Range(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		start = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int start>
		end = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int end>
	//    8   14:return          
	}

	FacebookRequestError$Range(int i, int j, FacebookRequestError._cls1 _pcls1)
	{
		this(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #23  <Method void FacebookRequestError$Range(int, int)>
	//    4    6:return          
	}
}
