// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bim

public final class bmq
{

	private bmq(int i, byte abyte0[], Map map, List list, boolean flag, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int a>
		b = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field byte[] b>
		c = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Map c>
		if(list == null)
	//*  11   19:aload           4
	//*  12   21:ifnonnull       32
			d = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #29  <Field List d>
		else
	//*  16   29:goto            41
			d = Collections.unmodifiableList(list);
	//   17   32:aload_0         
	//   18   33:aload           4
	//   19   35:invokestatic    #35  <Method List Collections.unmodifiableList(List)>
	//   20   38:putfield        #29  <Field List d>
		e = flag;
	//   21   41:aload_0         
	//   22   42:iload           5
	//   23   44:putfield        #37  <Field boolean e>
		f = l;
	//   24   47:aload_0         
	//   25   48:lload           6
	//   26   50:putfield        #39  <Field long f>
	//   27   53:return          
	}

	public bmq(int i, byte abyte0[], Map map, boolean flag, long l)
	{
		Object obj;
		if(map == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       10
			obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          7
		else
	//*   4    7:goto            115
		if(map.isEmpty())
	//*   5   10:aload_3         
	//*   6   11:invokeinterface #48  <Method boolean Map.isEmpty()>
	//*   7   16:ifeq            27
		{
			obj = ((Object) (Collections.emptyList()));
	//    8   19:invokestatic    #52  <Method List Collections.emptyList()>
	//    9   22:astore          7
		} else
	//*  10   24:goto            115
		{
			obj = ((Object) (new ArrayList(map.size())));
	//   11   27:new             #54  <Class ArrayList>
	//   12   30:dup             
	//   13   31:aload_3         
	//   14   32:invokeinterface #58  <Method int Map.size()>
	//   15   37:invokespecial   #61  <Method void ArrayList(int)>
	//   16   40:astore          7
			java.util.Map.Entry entry;
			for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (new bim((String)entry.getKey(), (String)entry.getValue())))))
	//*  17   42:aload_3         
	//*  18   43:invokeinterface #65  <Method Set Map.entrySet()>
	//*  19   48:invokeinterface #71  <Method Iterator Set.iterator()>
	//*  20   53:astore          8
	//*  21   55:aload           8
	//*  22   57:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  23   62:ifeq            115
				entry = (java.util.Map.Entry)iterator.next();
	//   24   65:aload           8
	//   25   67:invokeinterface #80  <Method Object Iterator.next()>
	//   26   72:checkcast       #82  <Class java.util.Map$Entry>
	//   27   75:astore          9

	//   28   77:aload           7
	//   29   79:new             #84  <Class bim>
	//   30   82:dup             
	//   31   83:aload           9
	//   32   85:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   33   90:checkcast       #89  <Class String>
	//   34   93:aload           9
	//   35   95:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   36  100:checkcast       #89  <Class String>
	//   37  103:invokespecial   #95  <Method void bim(String, String)>
	//   38  106:invokeinterface #101 <Method boolean List.add(Object)>
	//   39  111:pop             
		}
	//*  40  112:goto            55
		this(i, abyte0, map, ((List) (obj)), flag, l);
	//   41  115:aload_0         
	//   42  116:iload_1         
	//   43  117:aload_2         
	//   44  118:aload_3         
	//   45  119:aload           7
	//   46  121:iload           4
	//   47  123:lload           5
	//   48  125:invokespecial   #103 <Method void bmq(int, byte[], Map, List, boolean, long)>
	//   49  128:return          
	}

	public bmq(int i, byte abyte0[], boolean flag, long l, List list)
	{
		Object obj;
		if(list == null)
	//*   0    0:aload           6
	//*   1    2:ifnonnull       11
			obj = null;
	//    2    5:aconst_null     
	//    3    6:astore          7
		else
	//*   4    8:goto            93
		if(list.isEmpty())
	//*   5   11:aload           6
	//*   6   13:invokeinterface #106 <Method boolean List.isEmpty()>
	//*   7   18:ifeq            29
		{
			obj = ((Object) (Collections.emptyMap()));
	//    8   21:invokestatic    #110 <Method Map Collections.emptyMap()>
	//    9   24:astore          7
		} else
	//*  10   26:goto            93
		{
			obj = ((Object) (new TreeMap(String.CASE_INSENSITIVE_ORDER)));
	//   11   29:new             #112 <Class TreeMap>
	//   12   32:dup             
	//   13   33:getstatic       #116 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//   14   36:invokespecial   #119 <Method void TreeMap(java.util.Comparator)>
	//   15   39:astore          7
			bim bim1;
			for(Iterator iterator = list.iterator(); iterator.hasNext(); ((Map) (obj)).put(((Object) (bim1.a())), ((Object) (bim1.b()))))
	//*  16   41:aload           6
	//*  17   43:invokeinterface #120 <Method Iterator List.iterator()>
	//*  18   48:astore          8
	//*  19   50:aload           8
	//*  20   52:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  21   57:ifeq            93
				bim1 = (bim)iterator.next();
	//   22   60:aload           8
	//   23   62:invokeinterface #80  <Method Object Iterator.next()>
	//   24   67:checkcast       #84  <Class bim>
	//   25   70:astore          9

	//   26   72:aload           7
	//   27   74:aload           9
	//   28   76:invokevirtual   #123 <Method String bim.a()>
	//   29   79:aload           9
	//   30   81:invokevirtual   #125 <Method String bim.b()>
	//   31   84:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   32   89:pop             
		}
	//*  33   90:goto            50
		this(i, abyte0, ((Map) (obj)), list, flag, l);
	//   34   93:aload_0         
	//   35   94:iload_1         
	//   36   95:aload_2         
	//   37   96:aload           7
	//   38   98:aload           6
	//   39  100:iload_3         
	//   40  101:lload           4
	//   41  103:invokespecial   #103 <Method void bmq(int, byte[], Map, List, boolean, long)>
	//   42  106:return          
	}

	public bmq(byte abyte0[], Map map)
	{
		this(200, abyte0, map, false, 0L);
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:lconst_0        
	//    6    8:invokespecial   #132 <Method void bmq(int, byte[], Map, boolean, long)>
	//    7   11:return          
	}

	public final int a;
	public final byte b[];
	public final Map c;
	public final List d;
	public final boolean e;
	private final long f;
}
