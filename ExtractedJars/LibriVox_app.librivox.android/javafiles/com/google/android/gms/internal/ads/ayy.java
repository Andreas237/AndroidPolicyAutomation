// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aza, ayz

public class ayy extends AbstractList
{

	public ayy(List list, Iterator iterator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractList()>
		a = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field List a>
		b = iterator1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Iterator b>
	//    8   14:return          
	}

	public Object get(int i)
	{
		if(a.size() > i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field List a>
	//*   2    4:invokeinterface #36  <Method int List.size()>
	//*   3    9:iload_1         
	//*   4   10:icmple          24
			return a.get(i);
	//    5   13:aload_0         
	//    6   14:getfield        #26  <Field List a>
	//    7   17:iload_1         
	//    8   18:invokeinterface #38  <Method Object List.get(int)>
	//    9   23:areturn         
		if(b.hasNext())
	//*  10   24:aload_0         
	//*  11   25:getfield        #28  <Field Iterator b>
	//*  12   28:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            61
		{
			a.add(b.next());
	//   14   36:aload_0         
	//   15   37:getfield        #26  <Field List a>
	//   16   40:aload_0         
	//   17   41:getfield        #28  <Field Iterator b>
	//   18   44:invokeinterface #48  <Method Object Iterator.next()>
	//   19   49:invokeinterface #52  <Method boolean List.add(Object)>
	//   20   54:pop             
			return get(i);
	//   21   55:aload_0         
	//   22   56:iload_1         
	//   23   57:invokevirtual   #53  <Method Object get(int)>
	//   24   60:areturn         
		} else
		{
			throw new NoSuchElementException();
	//   25   61:new             #55  <Class NoSuchElementException>
	//   26   64:dup             
	//   27   65:invokespecial   #56  <Method void NoSuchElementException()>
	//   28   68:athrow          
		}
	}

	public Iterator iterator()
	{
		return ((Iterator) (new ayz(this)));
	//    0    0:new             #60  <Class ayz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #63  <Method void ayz(ayy)>
	//    4    8:areturn         
	}

	public int size()
	{
		c.a("potentially expensive size() call");
	//    0    0:getstatic       #19  <Field aza c>
	//    1    3:ldc1            #65  <String "potentially expensive size() call">
	//    2    5:invokevirtual   #68  <Method void aza.a(String)>
		c.a("blowup running");
	//    3    8:getstatic       #19  <Field aza c>
	//    4   11:ldc1            #70  <String "blowup running">
	//    5   13:invokevirtual   #68  <Method void aza.a(String)>
		for(; b.hasNext(); a.add(b.next()));
	//    6   16:aload_0         
	//    7   17:getfield        #28  <Field Iterator b>
	//    8   20:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//    9   25:ifeq            50
	//   10   28:aload_0         
	//   11   29:getfield        #26  <Field List a>
	//   12   32:aload_0         
	//   13   33:getfield        #28  <Field Iterator b>
	//   14   36:invokeinterface #48  <Method Object Iterator.next()>
	//   15   41:invokeinterface #52  <Method boolean List.add(Object)>
	//   16   46:pop             
	//*  17   47:goto            16
		return a.size();
	//   18   50:aload_0         
	//   19   51:getfield        #26  <Field List a>
	//   20   54:invokeinterface #36  <Method int List.size()>
	//   21   59:ireturn         
	}

	private static final aza c = aza.a(com/google/android/gms/internal/ads/ayy);
	List a;
	Iterator b;

	static 
	{
	//    0    0:ldc1            #2   <Class ayy>
	//    1    2:invokestatic    #17  <Method aza aza.a(Class)>
	//    2    5:putstatic       #19  <Field aza c>
	//*   3    8:return          
	}
}
