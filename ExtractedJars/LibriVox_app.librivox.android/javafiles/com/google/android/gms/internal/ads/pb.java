// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aao, ap, ov

final class pb
	implements aao
{

	pb(ov ov, String s, Integer integer, Integer integer1, int i, int j, int k, 
			int l, boolean flag)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #22  <Field String a>
		b = integer;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field Integer b>
		c = integer1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #26  <Field Integer c>
		d = i;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #28  <Field int d>
		e = j;
	//   12   22:aload_0         
	//   13   23:iload           6
	//   14   25:putfield        #30  <Field int e>
		f = k;
	//   15   28:aload_0         
	//   16   29:iload           7
	//   17   31:putfield        #32  <Field int f>
		g = l;
	//   18   34:aload_0         
	//   19   35:iload           8
	//   20   37:putfield        #34  <Field int g>
		h = flag;
	//   21   40:aload_0         
	//   22   41:iload           9
	//   23   43:putfield        #36  <Field boolean h>
		super();
	//   24   46:aload_0         
	//   25   47:invokespecial   #39  <Method void Object()>
	//   26   50:return          
	}

	public final Object a(Object obj)
	{
		List list = (List)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #43  <Class List>
	//    2    4:astore_3        
		obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
		if(list != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          87
		{
			if(list.isEmpty())
	//*   7   11:aload_3         
	//*   8   12:invokeinterface #47  <Method boolean List.isEmpty()>
	//*   9   17:ifeq            22
				return ((Object) (null));
	//   10   20:aconst_null     
	//   11   21:areturn         
			String s = a;
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field String a>
	//   14   26:astore          4
			Integer integer = b;
	//   15   28:aload_0         
	//   16   29:getfield        #24  <Field Integer b>
	//   17   32:astore          5
			Integer integer1 = c;
	//   18   34:aload_0         
	//   19   35:getfield        #26  <Field Integer c>
	//   20   38:astore          6
			int i = d;
	//   21   40:aload_0         
	//   22   41:getfield        #28  <Field int d>
	//   23   44:istore_2        
			if(i > 0)
	//*  24   45:iload_2         
	//*  25   46:ifle            54
				obj = ((Object) (Integer.valueOf(i)));
	//   26   49:iload_2         
	//   27   50:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   28   53:astore_1        
			return ((Object) (new ap(s, list, integer, integer1, ((Integer) (obj)), e + f, g, h)));
	//   29   54:new             #55  <Class ap>
	//   30   57:dup             
	//   31   58:aload           4
	//   32   60:aload_3         
	//   33   61:aload           5
	//   34   63:aload           6
	//   35   65:aload_1         
	//   36   66:aload_0         
	//   37   67:getfield        #30  <Field int e>
	//   38   70:aload_0         
	//   39   71:getfield        #32  <Field int f>
	//   40   74:iadd            
	//   41   75:aload_0         
	//   42   76:getfield        #34  <Field int g>
	//   43   79:aload_0         
	//   44   80:getfield        #36  <Field boolean h>
	//   45   83:invokespecial   #58  <Method void ap(String, List, Integer, Integer, Integer, int, int, boolean)>
	//   46   86:areturn         
		} else
		{
			return ((Object) (null));
	//   47   87:aconst_null     
	//   48   88:areturn         
		}
	}

	private final String a;
	private final Integer b;
	private final Integer c;
	private final int d;
	private final int e;
	private final int f;
	private final int g;
	private final boolean h;
}
