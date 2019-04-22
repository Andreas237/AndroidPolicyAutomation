// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import java.util.*;

// Referenced classes of package com.android.volley:
//			Header

public class NetworkResponse
{

	private NetworkResponse(int i, byte abyte0[], Map map, List list, boolean flag, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int statusCode>
		data = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field byte[] data>
		headers = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Map headers>
		if(list == null)
	//*  11   19:aload           4
	//*  12   21:ifnonnull       32
			allHeaders = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #31  <Field List allHeaders>
		else
	//*  16   29:goto            41
			allHeaders = Collections.unmodifiableList(list);
	//   17   32:aload_0         
	//   18   33:aload           4
	//   19   35:invokestatic    #37  <Method List Collections.unmodifiableList(List)>
	//   20   38:putfield        #31  <Field List allHeaders>
		notModified = flag;
	//   21   41:aload_0         
	//   22   42:iload           5
	//   23   44:putfield        #39  <Field boolean notModified>
		networkTimeMs = l;
	//   24   47:aload_0         
	//   25   48:lload           6
	//   26   50:putfield        #41  <Field long networkTimeMs>
	//   27   53:return          
	}

	public NetworkResponse(int i, byte abyte0[], Map map, boolean flag, long l)
	{
		this(i, abyte0, map, toAllHeaderList(map), flag, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_3         
	//    5    5:invokestatic    #50  <Method List toAllHeaderList(Map)>
	//    6    8:iload           4
	//    7   10:lload           5
	//    8   12:invokespecial   #52  <Method void NetworkResponse(int, byte[], Map, List, boolean, long)>
	//    9   15:return          
	}

	public NetworkResponse(int i, byte abyte0[], boolean flag, long l, List list)
	{
		this(i, abyte0, toHeaderMap(list), list, flag, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload           6
	//    4    5:invokestatic    #59  <Method Map toHeaderMap(List)>
	//    5    8:aload           6
	//    6   10:iload_3         
	//    7   11:lload           4
	//    8   13:invokespecial   #52  <Method void NetworkResponse(int, byte[], Map, List, boolean, long)>
	//    9   16:return          
	}

	public NetworkResponse(byte abyte0[], Map map)
	{
		this(200, abyte0, map, false, 0L);
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:lconst_0        
	//    6    8:invokespecial   #63  <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//    7   11:return          
	}

	private static List toAllHeaderList(Map map)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(map.isEmpty())
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #70  <Method boolean Map.isEmpty()>
	//*   6   12:ifeq            19
			return Collections.emptyList();
	//    7   15:invokestatic    #74  <Method List Collections.emptyList()>
	//    8   18:areturn         
		ArrayList arraylist = new ArrayList(map.size());
	//    9   19:new             #76  <Class ArrayList>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokeinterface #80  <Method int Map.size()>
	//   13   29:invokespecial   #83  <Method void ArrayList(int)>
	//   14   32:astore_1        
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((List) (arraylist)).add(((Object) (new Header((String)entry.getKey(), (String)entry.getValue())))))
	//*  15   33:aload_0         
	//*  16   34:invokeinterface #87  <Method Set Map.entrySet()>
	//*  17   39:invokeinterface #93  <Method Iterator Set.iterator()>
	//*  18   44:astore_0        
	//*  19   45:aload_0         
	//*  20   46:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*  21   51:ifeq            99
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   22   54:aload_0         
	//   23   55:invokeinterface #102 <Method Object Iterator.next()>
	//   24   60:checkcast       #104 <Class java.util.Map$Entry>
	//   25   63:astore_2        

	//   26   64:aload_1         
	//   27   65:new             #106 <Class Header>
	//   28   68:dup             
	//   29   69:aload_2         
	//   30   70:invokeinterface #109 <Method Object java.util.Map$Entry.getKey()>
	//   31   75:checkcast       #111 <Class String>
	//   32   78:aload_2         
	//   33   79:invokeinterface #114 <Method Object java.util.Map$Entry.getValue()>
	//   34   84:checkcast       #111 <Class String>
	//   35   87:invokespecial   #117 <Method void Header(String, String)>
	//   36   90:invokeinterface #123 <Method boolean List.add(Object)>
	//   37   95:pop             
	//*  38   96:goto            45
		return ((List) (arraylist));
	//   39   99:aload_1         
	//   40  100:areturn         
	}

	private static Map toHeaderMap(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(list.isEmpty())
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #125 <Method boolean List.isEmpty()>
	//*   6   12:ifeq            19
			return Collections.emptyMap();
	//    7   15:invokestatic    #129 <Method Map Collections.emptyMap()>
	//    8   18:areturn         
		TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
	//    9   19:new             #131 <Class TreeMap>
	//   10   22:dup             
	//   11   23:getstatic       #135 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//   12   26:invokespecial   #138 <Method void TreeMap(java.util.Comparator)>
	//   13   29:astore_1        
		Header header;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (treemap)).put(((Object) (header.getName())), ((Object) (header.getValue()))))
	//*  14   30:aload_0         
	//*  15   31:invokeinterface #139 <Method Iterator List.iterator()>
	//*  16   36:astore_0        
	//*  17   37:aload_0         
	//*  18   38:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            74
			header = (Header)((Iterator) (list)).next();
	//   20   46:aload_0         
	//   21   47:invokeinterface #102 <Method Object Iterator.next()>
	//   22   52:checkcast       #106 <Class Header>
	//   23   55:astore_2        

	//   24   56:aload_1         
	//   25   57:aload_2         
	//   26   58:invokevirtual   #143 <Method String Header.getName()>
	//   27   61:aload_2         
	//   28   62:invokevirtual   #145 <Method String Header.getValue()>
	//   29   65:invokeinterface #149 <Method Object Map.put(Object, Object)>
	//   30   70:pop             
	//*  31   71:goto            37
		return ((Map) (treemap));
	//   32   74:aload_1         
	//   33   75:areturn         
	}

	public final List allHeaders;
	public final byte data[];
	public final Map headers;
	public final long networkTimeMs;
	public final boolean notModified;
	public final int statusCode;
}
