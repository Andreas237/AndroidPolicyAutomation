// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wi, wr

public final class wq
{

	private wq(wr wr1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object a>
		d = wr1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field wr d>
		e = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #28  <Field String e>
	//   13   25:return          
	}

	public wq(String s)
	{
		this(aw.i().n(), s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #36  <Method wi aw.i()>
	//    2    4:invokevirtual   #42  <Method wr wi.n()>
	//    3    7:aload_1         
	//    4    8:invokespecial   #44  <Method void wq(wr, String)>
	//    5   11:return          
	}

	public final String a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String e>
	//    2    4:areturn         
	}

	public final void a(int i, int j)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object a>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			b = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #48  <Field int b>
			c = j;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #50  <Field int c>
			d.a(this);
	//   11   17:aload_0         
	//   12   18:getfield        #26  <Field wr d>
	//   13   21:aload_0         
	//   14   22:invokevirtual   #55  <Method void wr.a(wq)>
		}
	//   15   25:aload_3         
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		exception;
	//   18   28:astore          4
		obj;
	//   19   30:aload_3         
		JVM INSTR monitorexit ;
	//   20   31:monitorexit     
		throw exception;
	//   21   32:aload           4
	//   22   34:athrow          
	}

	public final Bundle b()
	{
		Bundle bundle;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			bundle = new Bundle();
	//    5    7:new             #58  <Class Bundle>
	//    6   10:dup             
	//    7   11:invokespecial   #59  <Method void Bundle()>
	//    8   14:astore_2        
			bundle.putInt("pmnli", b);
	//    9   15:aload_2         
	//   10   16:ldc1            #61  <String "pmnli">
	//   11   18:aload_0         
	//   12   19:getfield        #48  <Field int b>
	//   13   22:invokevirtual   #65  <Method void Bundle.putInt(String, int)>
			bundle.putInt("pmnll", c);
	//   14   25:aload_2         
	//   15   26:ldc1            #67  <String "pmnll">
	//   16   28:aload_0         
	//   17   29:getfield        #50  <Field int c>
	//   18   32:invokevirtual   #65  <Method void Bundle.putInt(String, int)>
		}
	//   19   35:aload_1         
	//   20   36:monitorexit     
		return bundle;
	//   21   37:aload_2         
	//   22   38:areturn         
		exception;
	//   23   39:astore_2        
		obj;
	//   24   40:aload_1         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		throw exception;
	//   26   42:aload_2         
	//   27   43:athrow          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #73  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #73  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((wq)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class wq>
	//   16   28:astore_1        
			String s = e;
	//   17   29:aload_0         
	//   18   30:getfield        #28  <Field String e>
	//   19   33:astore_2        
			if(s != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          47
				return s.equals(((Object) (((wq) (obj)).e)));
	//   22   38:aload_2         
	//   23   39:aload_1         
	//   24   40:getfield        #28  <Field String e>
	//   25   43:invokevirtual   #77  <Method boolean String.equals(Object)>
	//   26   46:ireturn         
			return ((wq) (obj)).e == null;
	//   27   47:aload_1         
	//   28   48:getfield        #28  <Field String e>
	//   29   51:ifnonnull       56
	//   30   54:iconst_1        
	//   31   55:ireturn         
	//   32   56:iconst_0        
	//   33   57:ireturn         
		} else
		{
			return false;
	//   34   58:iconst_0        
	//   35   59:ireturn         
		}
	}

	public final int hashCode()
	{
		String s = e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String e>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return s.hashCode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #81  <Method int String.hashCode()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private final Object a;
	private int b;
	private int c;
	private final wr d;
	private final String e;
}
