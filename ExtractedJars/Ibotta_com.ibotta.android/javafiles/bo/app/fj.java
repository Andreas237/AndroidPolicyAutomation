// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package bo.app:
//			fi, ex, fr

public final class fj extends fi
	implements ex
{

	public fj(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void fi(List)>
	//    3    5:return          
	}

	public boolean a(fr fr)
	{
		for(Iterator iterator = a.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field List a>
	//*   2    4:invokeinterface #24  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #30  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
			if(((ex)iterator.next()).a(fr))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #34  <Method Object Iterator.next()>
	//*   9   25:checkcast       #6   <Class ex>
	//*  10   28:aload_1         
	//*  11   29:invokeinterface #36  <Method boolean ex.a(fr)>
	//*  12   34:ifeq            10
				return true;
	//   13   37:iconst_1        
	//   14   38:ireturn         

		return false;
	//   15   39:iconst_0        
	//   16   40:ireturn         
	}
}
