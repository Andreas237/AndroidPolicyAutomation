// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package bo.app:
//			fi, ex, fr

public final class fh extends fi
	implements ex
{

	public fh(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void fi(List)>
	//    3    5:return          
	}

	public boolean a(fr fr)
	{
		Iterator iterator = a.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List a>
	//    2    4:invokeinterface #24  <Method Iterator List.iterator()>
	//    3    9:astore_3        
		boolean flag;
		for(flag = false; iterator.hasNext(); flag = true)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:aload_3         
	//*   7   13:invokeinterface #30  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            46
			if(!((ex)iterator.next()).a(fr))
	//*   9   21:aload_3         
	//*  10   22:invokeinterface #34  <Method Object Iterator.next()>
	//*  11   27:checkcast       #6   <Class ex>
	//*  12   30:aload_1         
	//*  13   31:invokeinterface #36  <Method boolean ex.a(fr)>
	//*  14   36:ifne            41
				return false;
	//   15   39:iconst_0        
	//   16   40:ireturn         

	//   17   41:iconst_1        
	//   18   42:istore_2        
	//*  19   43:goto            12
		return flag;
	//   20   46:iload_2         
	//   21   47:ireturn         
	}
}
