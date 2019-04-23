// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			atq, atp, ato

final class atr
	implements atq
{

	atr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final int a(int i, Object obj, Object obj1)
	{
		obj = ((Object) ((atp)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #15  <Class atp>
	//    2    4:astore_2        
		if(((atp) (obj)).isEmpty())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #19  <Method boolean atp.isEmpty()>
	//*   5    9:ifeq            14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		obj = ((Object) (((atp) (obj)).entrySet().iterator()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #23  <Method Set atp.entrySet()>
	//   10   18:invokeinterface #29  <Method Iterator Set.iterator()>
	//   11   23:astore_2        
		if(!((Iterator) (obj)).hasNext())
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//*  14   30:ifne            35
		{
			return 0;
	//   15   33:iconst_0        
	//   16   34:ireturn         
		} else
		{
			obj = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
	//   17   35:aload_2         
	//   18   36:invokeinterface #38  <Method Object Iterator.next()>
	//   19   41:checkcast       #40  <Class java.util.Map$Entry>
	//   20   44:astore_2        
			((java.util.Map.Entry) (obj)).getKey();
	//   21   45:aload_2         
	//   22   46:invokeinterface #43  <Method Object java.util.Map$Entry.getKey()>
	//   23   51:pop             
			((java.util.Map.Entry) (obj)).getValue();
	//   24   52:aload_2         
	//   25   53:invokeinterface #46  <Method Object java.util.Map$Entry.getValue()>
	//   26   58:pop             
			throw new NoSuchMethodError();
	//   27   59:new             #48  <Class NoSuchMethodError>
	//   28   62:dup             
	//   29   63:invokespecial   #49  <Method void NoSuchMethodError()>
	//   30   66:athrow          
		}
	}

	public final Object a(Object obj, Object obj1)
	{
		atp atp1 = (atp)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class atp>
	//    2    4:astore_3        
		obj1 = ((Object) ((atp)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class atp>
	//    5    9:astore_2        
		obj = ((Object) (atp1));
	//    6   10:aload_3         
	//    7   11:astore_1        
		if(!((atp) (obj1)).isEmpty())
	//*   8   12:aload_2         
	//*   9   13:invokevirtual   #19  <Method boolean atp.isEmpty()>
	//*  10   16:ifne            38
		{
			obj = ((Object) (atp1));
	//   11   19:aload_3         
	//   12   20:astore_1        
			if(!atp1.d())
	//*  13   21:aload_3         
	//*  14   22:invokevirtual   #53  <Method boolean atp.d()>
	//*  15   25:ifne            33
				obj = ((Object) (atp1.b()));
	//   16   28:aload_3         
	//   17   29:invokevirtual   #57  <Method atp atp.b()>
	//   18   32:astore_1        
			((atp) (obj)).a(((atp) (obj1)));
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #60  <Method void atp.a(atp)>
		}
		return obj;
	//   22   38:aload_1         
	//   23   39:areturn         
	}

	public final Map a(Object obj)
	{
		return ((Map) ((atp)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class atp>
	//    2    4:areturn         
	}

	public final Map b(Object obj)
	{
		return ((Map) ((atp)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class atp>
	//    2    4:areturn         
	}

	public final boolean c(Object obj)
	{
		return !((atp)obj).d();
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class atp>
	//    2    4:invokevirtual   #53  <Method boolean atp.d()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final Object d(Object obj)
	{
		((atp)obj).c();
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class atp>
	//    2    4:invokevirtual   #66  <Method void atp.c()>
		return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
	}

	public final Object e(Object obj)
	{
		return ((Object) (atp.a().b()));
	//    0    0:invokestatic    #69  <Method atp atp.a()>
	//    1    3:invokevirtual   #57  <Method atp atp.b()>
	//    2    6:areturn         
	}

	public final ato f(Object obj)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #48  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}
}
