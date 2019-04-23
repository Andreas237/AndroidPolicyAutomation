// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class art
{

	art(Object obj, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int b>
	//    8   14:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof art))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class art>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((art)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class art>
	//    7   13:astore_1        
		return a == ((art) (obj)).a && b == ((art) (obj)).b;
	//    8   14:aload_0         
	//    9   15:getfield        #15  <Field Object a>
	//   10   18:aload_1         
	//   11   19:getfield        #15  <Field Object a>
	//   12   22:if_acmpne       38
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field int b>
	//   15   29:aload_1         
	//   16   30:getfield        #17  <Field int b>
	//   17   33:icmpne          38
	//   18   36:iconst_1        
	//   19   37:ireturn         
	//   20   38:iconst_0        
	//   21   39:ireturn         
	}

	public final int hashCode()
	{
		return System.identityHashCode(a) * 65535 + b;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object a>
	//    2    4:invokestatic    #28  <Method int System.identityHashCode(Object)>
	//    3    7:ldc1            #29  <Int 65535>
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field int b>
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	private final Object a;
	private final int b;
}
