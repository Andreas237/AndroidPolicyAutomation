// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			ed, dq, s, af, 
//			fe

static class dq$b extends ed
{

	protected volatile Object a(Object aobj[])
	{
		return ((Object) (a((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #61  <Class Void[]>
	//    3    5:invokevirtual   #64  <Method List a(Void[])>
	//    4    8:areturn         
	}

	protected transient List a(Void avoid[])
	{
		int i1;
		int j1;
		try
		{
			avoid = ((Void []) ((s)i.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field WeakReference i>
	//    2    4:invokevirtual   #70  <Method Object WeakReference.get()>
	//    3    7:checkcast       #72  <Class s>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
	//*   7   15:aconst_null     
	//*   8   16:areturn         
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #76  <Method int s.getMapWidth()>
	//*  11   23:istore_2        
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #79  <Method int s.getMapHeight()>
	//*  14   30:istore_3        
	//*  15   31:aload_0         
	//*  16   32:aload_1         
	//*  17   33:invokeinterface #82  <Method float s.g()>
	//*  18   38:f2i             
	//*  19   39:putfield        #84  <Field int d>
	//*  20   42:iload_2         
	//*  21   43:ifle            50
	//*  22   46:iload_3         
	//*  23   47:ifgt            52
	//*  24   50:aconst_null     
	//*  25   51:areturn         
	//*  26   52:aload_1         
	//*  27   53:aload_0         
	//*  28   54:getfield        #84  <Field int d>
	//*  29   57:aload_0         
	//*  30   58:getfield        #33  <Field int f>
	//*  31   61:aload_0         
	//*  32   62:getfield        #35  <Field int g>
	//*  33   65:aload_0         
	//*  34   66:getfield        #37  <Field int h>
	//*  35   69:aload_0         
	//*  36   70:getfield        #52  <Field WeakReference l>
	//*  37   73:invokevirtual   #70  <Method Object WeakReference.get()>
	//*  38   76:checkcast       #86  <Class af>
	//*  39   79:aload_0         
	//*  40   80:getfield        #54  <Field WeakReference m>
	//*  41   83:invokevirtual   #70  <Method Object WeakReference.get()>
	//*  42   86:checkcast       #88  <Class fe>
	//*  43   89:invokestatic    #91  <Method java.util.ArrayList dq.a(s, int, int, int, int, af, fe)>
	//*  44   92:astore_1        
	//*  45   93:aload_1         
	//*  46   94:areturn         
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*  47   95:astore_1        
		{
			((Throwable) (avoid)).printStackTrace();
	//   48   96:aload_1         
	//   49   97:invokevirtual   #94  <Method void Throwable.printStackTrace()>
			return null;
	//   50  100:aconst_null     
	//   51  101:areturn         
		}
		if(avoid == null)
			return null;
		i1 = ((s) (avoid)).getMapWidth();
		j1 = ((s) (avoid)).getMapHeight();
		d = (int)((s) (avoid)).g();
		if(i1 <= 0 || j1 <= 0)
			return null;
		avoid = ((Void []) (dq.a(((s) (avoid)), d, f, g, h, (af)l.get(), (fe)m.get())));
		return ((List) (avoid));
	}

	protected volatile void a(Object obj)
	{
		a((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #97  <Class List>
	//    3    5:invokevirtual   #100 <Method void a(List)>
	//    4    8:return          
	}

	protected void a(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i1 = list.size();
	//    3    5:aload_1         
	//    4    6:invokeinterface #103 <Method int List.size()>
	//    5   11:istore_2        
		if(i1 <= 0)
	//*   6   12:iload_2         
	//*   7   13:ifgt            17
			return;
	//    8   16:return          
		try
		{
			dq.a((s)i.get(), list, d, e, j, k, (af)l.get(), (fe)m.get());
	//    9   17:aload_0         
	//   10   18:getfield        #46  <Field WeakReference i>
	//   11   21:invokevirtual   #70  <Method Object WeakReference.get()>
	//   12   24:checkcast       #72  <Class s>
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #84  <Field int d>
	//   16   32:aload_0         
	//   17   33:getfield        #39  <Field boolean e>
	//   18   36:aload_0         
	//   19   37:getfield        #48  <Field List j>
	//   20   40:aload_0         
	//   21   41:getfield        #50  <Field boolean k>
	//   22   44:aload_0         
	//   23   45:getfield        #52  <Field WeakReference l>
	//   24   48:invokevirtual   #70  <Method Object WeakReference.get()>
	//   25   51:checkcast       #86  <Class af>
	//   26   54:aload_0         
	//   27   55:getfield        #54  <Field WeakReference m>
	//   28   58:invokevirtual   #70  <Method Object WeakReference.get()>
	//   29   61:checkcast       #88  <Class fe>
	//   30   64:invokestatic    #106 <Method boolean dq.a(s, List, int, boolean, List, boolean, af, fe)>
	//   31   67:pop             
			list.clear();
	//   32   68:aload_1         
	//   33   69:invokeinterface #109 <Method void List.clear()>
			return;
	//   34   74:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  35   75:astore_1        
		{
			((Throwable) (list)).printStackTrace();
	//   36   76:aload_1         
	//   37   77:invokevirtual   #94  <Method void Throwable.printStackTrace()>
		}
		return;
	//   38   80:return          
	}

	private int d;
	private boolean e;
	private int f;
	private int g;
	private int h;
	private WeakReference i;
	private List j;
	private boolean k;
	private WeakReference l;
	private WeakReference m;

	public dq$b(boolean flag, s s1, int i1, int j1, int k1, List list, boolean flag1, 
			af af1, fe fe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ed()>
		f = 256;
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:putfield        #33  <Field int f>
		g = 256;
	//    5   11:aload_0         
	//    6   12:sipush          256
	//    7   15:putfield        #35  <Field int g>
		h = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #37  <Field int h>
		e = flag;
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:putfield        #39  <Field boolean e>
		i = new WeakReference(((Object) (s1)));
	//   14   28:aload_0         
	//   15   29:new             #41  <Class WeakReference>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokespecial   #44  <Method void WeakReference(Object)>
	//   19   37:putfield        #46  <Field WeakReference i>
		f = i1;
	//   20   40:aload_0         
	//   21   41:iload_3         
	//   22   42:putfield        #33  <Field int f>
		g = j1;
	//   23   45:aload_0         
	//   24   46:iload           4
	//   25   48:putfield        #35  <Field int g>
		h = k1;
	//   26   51:aload_0         
	//   27   52:iload           5
	//   28   54:putfield        #37  <Field int h>
		j = list;
	//   29   57:aload_0         
	//   30   58:aload           6
	//   31   60:putfield        #48  <Field List j>
		k = flag1;
	//   32   63:aload_0         
	//   33   64:iload           7
	//   34   66:putfield        #50  <Field boolean k>
		l = new WeakReference(((Object) (af1)));
	//   35   69:aload_0         
	//   36   70:new             #41  <Class WeakReference>
	//   37   73:dup             
	//   38   74:aload           8
	//   39   76:invokespecial   #44  <Method void WeakReference(Object)>
	//   40   79:putfield        #52  <Field WeakReference l>
		m = new WeakReference(((Object) (fe1)));
	//   41   82:aload_0         
	//   42   83:new             #41  <Class WeakReference>
	//   43   86:dup             
	//   44   87:aload           9
	//   45   89:invokespecial   #44  <Method void WeakReference(Object)>
	//   46   92:putfield        #54  <Field WeakReference m>
	//   47   95:return          
	}
}
