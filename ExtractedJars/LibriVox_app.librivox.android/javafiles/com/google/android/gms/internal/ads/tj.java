// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.ak;

// Referenced classes of package com.google.android.gms.internal.ads:
//			tq

public final class tj extends tq
{

	public tj(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void tq()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int b>
	//    8   14:return          
	}

	public final String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String a>
	//    2    4:areturn         
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int b>
	//    2    4:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			if(!(obj instanceof tj))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class tj>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((tj)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class tj>
	//    9   17:astore_1        
			return ak.a(((Object) (a)), ((Object) (((tj) (obj)).a))) && ak.a(((Object) (Integer.valueOf(b))), ((Object) (Integer.valueOf(((tj) (obj)).b))));
	//   10   18:aload_0         
	//   11   19:getfield        #16  <Field String a>
	//   12   22:aload_1         
	//   13   23:getfield        #16  <Field String a>
	//   14   26:invokestatic    #28  <Method boolean ak.a(Object, Object)>
	//   15   29:ifeq            54
	//   16   32:aload_0         
	//   17   33:getfield        #18  <Field int b>
	//   18   36:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   19   39:aload_1         
	//   20   40:getfield        #18  <Field int b>
	//   21   43:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   22   46:invokestatic    #28  <Method boolean ak.a(Object, Object)>
	//   23   49:ifeq            54
	//   24   52:iconst_1        
	//   25   53:ireturn         
	//   26   54:iconst_0        
	//   27   55:ireturn         
		} else
		{
			return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		}
	}

	private final String a;
	private final int b;
}
