// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			jc, iy, dx

class jb extends jc
{

	jb(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void jc()>
		iy.a(4, "initialCapacity");
	//    2    4:iconst_4        
	//    3    5:ldc1            #17  <String "initialCapacity">
	//    4    7:invokestatic    #22  <Method int iy.a(int, String)>
	//    5   10:pop             
		a = new Object[4];
	//    6   11:aload_0         
	//    7   12:iconst_4        
	//    8   13:anewarray       Object[]
	//    9   16:putfield        #26  <Field Object[] a>
		b = 0;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #28  <Field int b>
	//   13   24:return          
	}

	public jb a(Object obj)
	{
		dx.a(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method Object dx.a(Object)>
	//    2    4:pop             
		int i = b + 1;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field int b>
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:istore_2        
		Object aobj[] = a;
	//    8   12:aload_0         
	//    9   13:getfield        #26  <Field Object[] a>
	//   10   16:astore_3        
		if(aobj.length < i)
	//*  11   17:aload_3         
	//*  12   18:arraylength     
	//*  13   19:iload_2         
	//*  14   20:icmpge          45
		{
			a = Arrays.copyOf(aobj, a(aobj.length, i));
	//   15   23:aload_0         
	//   16   24:aload_3         
	//   17   25:aload_3         
	//   18   26:arraylength     
	//   19   27:iload_2         
	//   20   28:invokestatic    #38  <Method int a(int, int)>
	//   21   31:invokestatic    #44  <Method Object[] Arrays.copyOf(Object[], int)>
	//   22   34:putfield        #26  <Field Object[] a>
			c = false;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #46  <Field boolean c>
		} else
	//*  26   42:goto            68
		if(c)
	//*  27   45:aload_0         
	//*  28   46:getfield        #46  <Field boolean c>
	//*  29   49:ifeq            68
		{
			a = (Object[])((Object []) (aobj)).clone();
	//   30   52:aload_0         
	//   31   53:aload_3         
	//   32   54:invokevirtual   #51  <Method Object _5B_Ljava.lang.Object_3B_.clone()>
	//   33   57:checkcast       #47  <Class Object[]>
	//   34   60:putfield        #26  <Field Object[] a>
			c = false;
	//   35   63:aload_0         
	//   36   64:iconst_0        
	//   37   65:putfield        #46  <Field boolean c>
		}
		aobj = a;
	//   38   68:aload_0         
	//   39   69:getfield        #26  <Field Object[] a>
	//   40   72:astore_3        
		i = b;
	//   41   73:aload_0         
	//   42   74:getfield        #28  <Field int b>
	//   43   77:istore_2        
		b = i + 1;
	//   44   78:aload_0         
	//   45   79:iload_2         
	//   46   80:iconst_1        
	//   47   81:iadd            
	//   48   82:putfield        #28  <Field int b>
		aobj[i] = obj;
	//   49   85:aload_3         
	//   50   86:iload_2         
	//   51   87:aload_1         
	//   52   88:aastore         
		return this;
	//   53   89:aload_0         
	//   54   90:areturn         
	}

	Object a[];
	int b;
	boolean c;
}
