// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			LazyHeaders, LazyHeaderFactory

public static final class LazyHeaders$Builder
{

	private Map copyHeaders()
	{
		HashMap hashmap = new HashMap(headers.size());
	//    0    0:new             #33  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field Map headers>
	//    4    8:invokeinterface #81  <Method int Map.size()>
	//    5   13:invokespecial   #37  <Method void HashMap(int)>
	//    6   16:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = headers.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(entry.getKey(), ((Object) (new ArrayList((Collection)entry.getValue())))))
	//*   7   17:aload_0         
	//*   8   18:getfield        #73  <Field Map headers>
	//*   9   21:invokeinterface #85  <Method Set Map.entrySet()>
	//*  10   26:invokeinterface #91  <Method Iterator Set.iterator()>
	//*  11   31:astore_2        
	//*  12   32:aload_2         
	//*  13   33:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  14   38:ifeq            83
			entry = (java.util.Map.Entry)iterator.next();
	//   15   41:aload_2         
	//   16   42:invokeinterface #101 <Method Object Iterator.next()>
	//   17   47:checkcast       #103 <Class java.util.Map$Entry>
	//   18   50:astore_3        

	//   19   51:aload_1         
	//   20   52:aload_3         
	//   21   53:invokeinterface #106 <Method Object java.util.Map$Entry.getKey()>
	//   22   58:new             #108 <Class ArrayList>
	//   23   61:dup             
	//   24   62:aload_3         
	//   25   63:invokeinterface #111 <Method Object java.util.Map$Entry.getValue()>
	//   26   68:checkcast       #113 <Class Collection>
	//   27   71:invokespecial   #116 <Method void ArrayList(Collection)>
	//   28   74:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   29   79:pop             
	//*  30   80:goto            32
		return ((Map) (hashmap));
	//   31   83:aload_1         
	//   32   84:areturn         
	}

	private void copyIfNecessary()
	{
		if(copyOnModify)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean copyOnModify>
	//*   2    4:ifeq            20
		{
			copyOnModify = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #71  <Field boolean copyOnModify>
			headers = copyHeaders();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokespecial   #121 <Method Map copyHeaders()>
	//    9   17:putfield        #73  <Field Map headers>
		}
	//   10   20:return          
	}

	private List getFactories(String s)
	{
		List list = (List)headers.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Map headers>
	//    2    4:aload_1         
	//    3    5:invokeinterface #127 <Method Object Map.get(Object)>
	//    4   10:checkcast       #129 <Class List>
	//    5   13:astore_3        
		Object obj = ((Object) (list));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(list == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       40
		{
			obj = ((Object) (new ArrayList()));
	//   10   20:new             #108 <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #130 <Method void ArrayList()>
	//   13   27:astore_2        
			headers.put(((Object) (s)), obj);
	//   14   28:aload_0         
	//   15   29:getfield        #73  <Field Map headers>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   19   39:pop             
		}
		return ((List) (obj));
	//   20   40:aload_2         
	//   21   41:areturn         
	}

	public LazyHeaders$Builder addHeader(String s, LazyHeaderFactory lazyheaderfactory)
	{
		if(isUserAgentDefault && "User-Agent".equalsIgnoreCase(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean isUserAgentDefault>
	//*   2    4:ifeq            23
	//*   3    7:ldc1            #15  <String "User-Agent">
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*   6   13:ifeq            23
		{
			return setHeader(s, lazyheaderfactory);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #142 <Method LazyHeaders$Builder setHeader(String, LazyHeaderFactory)>
	//   11   22:areturn         
		} else
		{
			copyIfNecessary();
	//   12   23:aload_0         
	//   13   24:invokespecial   #144 <Method void copyIfNecessary()>
			getFactories(s).add(((Object) (lazyheaderfactory)));
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokespecial   #146 <Method List getFactories(String)>
	//   17   32:aload_2         
	//   18   33:invokeinterface #150 <Method boolean List.add(Object)>
	//   19   38:pop             
			return this;
	//   20   39:aload_0         
	//   21   40:areturn         
		}
	}

	public LazyHeaders$Builder addHeader(String s, String s1)
	{
		return addHeader(s, ((LazyHeaderFactory) (new aderFactory(s1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #45  <Class LazyHeaders$StringHeaderFactory>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #48  <Method void LazyHeaders$StringHeaderFactory(String)>
	//    6   10:invokevirtual   #153 <Method LazyHeaders$Builder addHeader(String, LazyHeaderFactory)>
	//    7   13:areturn         
	}

	public LazyHeaders build()
	{
		copyOnModify = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #71  <Field boolean copyOnModify>
		return new LazyHeaders(headers);
	//    3    5:new             #6   <Class LazyHeaders>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #73  <Field Map headers>
	//    7   13:invokespecial   #158 <Method void LazyHeaders(Map)>
	//    8   16:areturn         
	}

	public LazyHeaders$Builder setHeader(String s, LazyHeaderFactory lazyheaderfactory)
	{
		copyIfNecessary();
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void copyIfNecessary()>
		if(lazyheaderfactory == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       22
		{
			headers.remove(((Object) (s)));
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field Map headers>
	//    6   12:aload_1         
	//    7   13:invokeinterface #161 <Method Object Map.remove(Object)>
	//    8   18:pop             
		} else
	//*   9   19:goto            42
		{
			List list = getFactories(s);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #146 <Method List getFactories(String)>
	//   13   27:astore_3        
			list.clear();
	//   14   28:aload_3         
	//   15   29:invokeinterface #164 <Method void List.clear()>
			list.add(((Object) (lazyheaderfactory)));
	//   16   34:aload_3         
	//   17   35:aload_2         
	//   18   36:invokeinterface #150 <Method boolean List.add(Object)>
	//   19   41:pop             
		}
		if(isUserAgentDefault && "User-Agent".equalsIgnoreCase(s))
	//*  20   42:aload_0         
	//*  21   43:getfield        #75  <Field boolean isUserAgentDefault>
	//*  22   46:ifeq            63
	//*  23   49:ldc1            #15  <String "User-Agent">
	//*  24   51:aload_1         
	//*  25   52:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  26   55:ifeq            63
			isUserAgentDefault = false;
	//   27   58:aload_0         
	//   28   59:iconst_0        
	//   29   60:putfield        #75  <Field boolean isUserAgentDefault>
		return this;
	//   30   63:aload_0         
	//   31   64:areturn         
	}

	public LazyHeaders$Builder setHeader(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			s1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            18
			s1 = ((String) (new aderFactory(s1)));
	//    5    9:new             #45  <Class LazyHeaders$StringHeaderFactory>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokespecial   #48  <Method void LazyHeaders$StringHeaderFactory(String)>
	//    9   17:astore_2        
		return setHeader(s, ((LazyHeaderFactory) (s1)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #142 <Method LazyHeaders$Builder setHeader(String, LazyHeaderFactory)>
	//   14   24:areturn         
	}

	private static final Map DEFAULT_HEADERS;
	private static final String DEFAULT_USER_AGENT = System.getProperty("http.agent");
	private static final String USER_AGENT_HEADER = "User-Agent";
	private boolean copyOnModify;
	private Map headers;
	private boolean isUserAgentDefault;

	static 
	{
	//    0    0:ldc1            #23  <String "http.agent">
	//    1    2:invokestatic    #29  <Method String System.getProperty(String)>
	//    2    5:putstatic       #31  <Field String DEFAULT_USER_AGENT>
		HashMap hashmap = new HashMap(2);
	//    3    8:new             #33  <Class HashMap>
	//    4   11:dup             
	//    5   12:iconst_2        
	//    6   13:invokespecial   #37  <Method void HashMap(int)>
	//    7   16:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (DEFAULT_USER_AGENT))))
	//*   8   17:getstatic       #31  <Field String DEFAULT_USER_AGENT>
	//*   9   20:invokestatic    #43  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            48
			((Map) (hashmap)).put("User-Agent", ((Object) (Collections.singletonList(((Object) (new aderFactory(DEFAULT_USER_AGENT)))))));
	//   11   26:aload_0         
	//   12   27:ldc1            #15  <String "User-Agent">
	//   13   29:new             #45  <Class LazyHeaders$StringHeaderFactory>
	//   14   32:dup             
	//   15   33:getstatic       #31  <Field String DEFAULT_USER_AGENT>
	//   16   36:invokespecial   #48  <Method void LazyHeaders$StringHeaderFactory(String)>
	//   17   39:invokestatic    #54  <Method List Collections.singletonList(Object)>
	//   18   42:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   19   47:pop             
		DEFAULT_HEADERS = Collections.unmodifiableMap(((Map) (hashmap)));
	//   20   48:aload_0         
	//   21   49:invokestatic    #64  <Method Map Collections.unmodifiableMap(Map)>
	//   22   52:putstatic       #66  <Field Map DEFAULT_HEADERS>
	//*  23   55:return          
	}

	public LazyHeaders$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		copyOnModify = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #71  <Field boolean copyOnModify>
		headers = DEFAULT_HEADERS;
	//    5    9:aload_0         
	//    6   10:getstatic       #66  <Field Map DEFAULT_HEADERS>
	//    7   13:putfield        #73  <Field Map headers>
		isUserAgentDefault = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #75  <Field boolean isUserAgentDefault>
	//   11   21:return          
	}
}
