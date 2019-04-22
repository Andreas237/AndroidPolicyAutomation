// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.util.*;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpUsageException

public class ArgsHelper
{

	public ArgsHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String[] drainToArray(Iterator iterator)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_1        
		for(; iterator.hasNext(); ((List) (arraylist)).add(iterator.next()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #20  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            33
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:invokeinterface #24  <Method Object Iterator.next()>
	//   10   24:invokeinterface #30  <Method boolean List.add(Object)>
	//   11   29:pop             
	//*  12   30:goto            8
		return (String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()])));
	//   13   33:aload_1         
	//   14   34:aload_1         
	//   15   35:invokeinterface #34  <Method int List.size()>
	//   16   40:anewarray       String[]
	//   17   43:invokeinterface #40  <Method Object[] List.toArray(Object[])>
	//   18   48:checkcast       #42  <Class String[]>
	//   19   51:areturn         
	}

	public static String nextArg(Iterator iterator, String s)
		throws DumpUsageException
	{
		if(iterator.hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #20  <Method boolean Iterator.hasNext()>
	//*   2    6:ifeq            19
			return (String)iterator.next();
	//    3    9:aload_0         
	//    4   10:invokeinterface #24  <Method Object Iterator.next()>
	//    5   15:checkcast       #36  <Class String>
	//    6   18:areturn         
		else
			throw new DumpUsageException(s);
	//    7   19:new             #48  <Class DumpUsageException>
	//    8   22:dup             
	//    9   23:aload_1         
	//   10   24:invokespecial   #51  <Method void DumpUsageException(String)>
	//   11   27:athrow          
	}

	public static String nextOptionalArg(Iterator iterator, String s)
	{
		if(iterator.hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #20  <Method boolean Iterator.hasNext()>
	//*   2    6:ifeq            19
			s = (String)iterator.next();
	//    3    9:aload_0         
	//    4   10:invokeinterface #24  <Method Object Iterator.next()>
	//    5   15:checkcast       #36  <Class String>
	//    6   18:astore_1        
		return s;
	//    7   19:aload_1         
	//    8   20:areturn         
	}
}
