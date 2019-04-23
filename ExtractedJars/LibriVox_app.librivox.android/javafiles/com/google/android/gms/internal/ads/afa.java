// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bms

final class afa
{

	afa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field ArrayList a>
	//    7   15:return          
	}

	final long a()
	{
		Iterator iterator = a.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList a>
	//    2    4:invokevirtual   #26  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_3        
_L4:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    4    8:aload_3         
	//    5    9:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            140
_L1:
		Object obj = ((Object) (((bms)iterator.next()).c()));
	//    7   17:aload_3         
	//    8   18:invokeinterface #36  <Method Object Iterator.next()>
	//    9   23:checkcast       #38  <Class bms>
	//   10   26:invokevirtual   #42  <Method Map bms.c()>
	//   11   29:astore          4
		if(obj == null) goto _L4; else goto _L3
	//   12   31:aload           4
	//   13   33:ifnull          8
_L3:
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   14   36:aload           4
	//   15   38:invokeinterface #48  <Method Set Map.entrySet()>
	//   16   43:invokeinterface #51  <Method Iterator Set.iterator()>
	//   17   48:astore          4
_L6:
		java.util.Map.Entry entry;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_131;
	//   18   50:aload           4
	//   19   52:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//   20   57:ifeq            131
		entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   21   60:aload           4
	//   22   62:invokeinterface #36  <Method Object Iterator.next()>
	//   23   67:checkcast       #53  <Class java.util.Map$Entry>
	//   24   70:astore          5
		if(!"content-length".equalsIgnoreCase((String)entry.getKey())) goto _L6; else goto _L5
	//   25   72:ldc1            #55  <String "content-length">
	//   26   74:aload           5
	//   27   76:invokeinterface #58  <Method Object java.util.Map$Entry.getKey()>
	//   28   81:checkcast       #60  <Class String>
	//   29   84:invokevirtual   #64  <Method boolean String.equalsIgnoreCase(String)>
	//   30   87:ifeq            50
_L5:
		long l = Long.parseLong((String)((List)entry.getValue()).get(0));
	//   31   90:aload           5
	//   32   92:invokeinterface #67  <Method Object java.util.Map$Entry.getValue()>
	//   33   97:checkcast       #69  <Class List>
	//   34  100:iconst_0        
	//   35  101:invokeinterface #73  <Method Object List.get(int)>
	//   36  106:checkcast       #60  <Class String>
	//   37  109:invokestatic    #79  <Method long Long.parseLong(String)>
	//   38  112:lstore_1        
		b = Math.max(b, l);
	//   39  113:aload_0         
	//   40  114:aload_0         
	//   41  115:getfield        #81  <Field long b>
	//   42  118:lload_1         
	//   43  119:invokestatic    #87  <Method long Math.max(long, long)>
	//   44  122:putfield        #81  <Field long b>
		  goto _L6
	//*  45  125:goto            50
	//*  46  128:goto            50
		iterator.remove();
	//   47  131:aload_3         
	//   48  132:invokeinterface #90  <Method void Iterator.remove()>
		  goto _L4
	//*  49  137:goto            8
_L2:
		return b;
	//   50  140:aload_0         
	//   51  141:getfield        #81  <Field long b>
	//   52  144:lreturn         
		RuntimeException runtimeexception;
		runtimeexception;
	//   53  145:astore          5
		  goto _L6
	//*  54  147:goto            128
	}

	final void a(bms bms1)
	{
		a.add(((Object) (bms1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final ArrayList a = new ArrayList();
	private long b;
}
