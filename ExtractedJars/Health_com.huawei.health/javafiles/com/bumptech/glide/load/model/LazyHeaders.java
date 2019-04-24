// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			Headers, LazyHeaderFactory

public final class LazyHeaders
	implements Headers
{
	public static final class Builder
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

		public Builder addHeader(String s, LazyHeaderFactory lazyheaderfactory)
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

		public Builder addHeader(String s, String s1)
		{
			return addHeader(s, ((LazyHeaderFactory) (new StringHeaderFactory(s1))));
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

		public Builder setHeader(String s, LazyHeaderFactory lazyheaderfactory)
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

		public Builder setHeader(String s, String s1)
		{
			if(s1 == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       9
				s1 = null;
		//    2    4:aconst_null     
		//    3    5:astore_2        
			else
		//*   4    6:goto            18
				s1 = ((String) (new StringHeaderFactory(s1)));
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
				((Map) (hashmap)).put("User-Agent", ((Object) (Collections.singletonList(((Object) (new StringHeaderFactory(DEFAULT_USER_AGENT)))))));
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

		public Builder()
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

	static final class StringHeaderFactory
		implements LazyHeaderFactory
	{

		public String buildHeader()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String value>
		//    2    4:areturn         
		}

		public boolean equals(Object obj)
		{
			if(obj instanceof StringHeaderFactory)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class LazyHeaders$StringHeaderFactory>
		//*   2    4:ifeq            24
			{
				obj = ((Object) ((StringHeaderFactory)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class LazyHeaders$StringHeaderFactory>
		//    5   11:astore_1        
				return value.equals(((Object) (((StringHeaderFactory) (obj)).value)));
		//    6   12:aload_0         
		//    7   13:getfield        #18  <Field String value>
		//    8   16:aload_1         
		//    9   17:getfield        #18  <Field String value>
		//   10   20:invokevirtual   #27  <Method boolean String.equals(Object)>
		//   11   23:ireturn         
			} else
			{
				return false;
		//   12   24:iconst_0        
		//   13   25:ireturn         
			}
		}

		public int hashCode()
		{
			return value.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String value>
		//    2    4:invokevirtual   #31  <Method int String.hashCode()>
		//    3    7:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("StringHeaderFactory{value='").append(value).append('\'').append('}').toString();
		//    0    0:new             #34  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:ldc1            #37  <String "StringHeaderFactory{value='">
		//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #18  <Field String value>
		//    7   16:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:bipush          39
		//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   10   24:bipush          125
		//   11   26:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   12   29:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   13   32:areturn         
		}

		private final String value;

		StringHeaderFactory(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			value = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String value>
		//    5    9:return          
		}
	}


	LazyHeaders(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		headers = Collections.unmodifiableMap(map);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method Map Collections.unmodifiableMap(Map)>
	//    5    9:putfield        #30  <Field Map headers>
	//    6   12:return          
	}

	private Map generateHeaders()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #37  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void HashMap()>
	//    3    7:astore_3        
		Iterator iterator = headers.entrySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field Map headers>
	//    6   12:invokeinterface #44  <Method Set Map.entrySet()>
	//    7   17:invokeinterface #50  <Method Iterator Set.iterator()>
	//    8   22:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   24:aload           4
	//   10   26:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//   11   31:ifeq            177
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   12   34:aload           4
	//   13   36:invokeinterface #60  <Method Object Iterator.next()>
	//   14   41:checkcast       #62  <Class java.util.Map$Entry>
	//   15   44:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   16   46:new             #64  <Class StringBuilder>
	//   17   49:dup             
	//   18   50:invokespecial   #65  <Method void StringBuilder()>
	//   19   53:astore          6
			List list = (List)entry.getValue();
	//   20   55:aload           5
	//   21   57:invokeinterface #68  <Method Object java.util.Map$Entry.getValue()>
	//   22   62:checkcast       #70  <Class List>
	//   23   65:astore          7
			int j = list.size();
	//   24   67:aload           7
	//   25   69:invokeinterface #74  <Method int List.size()>
	//   26   74:istore_2        
			for(int i = 0; i < j; i++)
	//*  27   75:iconst_0        
	//*  28   76:istore_1        
	//*  29   77:iload_1         
	//*  30   78:iload_2         
	//*  31   79:icmpge          144
			{
				String s = ((LazyHeaderFactory)list.get(i)).buildHeader();
	//   32   82:aload           7
	//   33   84:iload_1         
	//   34   85:invokeinterface #78  <Method Object List.get(int)>
	//   35   90:checkcast       #80  <Class LazyHeaderFactory>
	//   36   93:invokeinterface #84  <Method String LazyHeaderFactory.buildHeader()>
	//   37   98:astore          8
				if(TextUtils.isEmpty(((CharSequence) (s))))
					continue;
	//   38  100:aload           8
	//   39  102:invokestatic    #90  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   40  105:ifne            137
				stringbuilder.append(s);
	//   41  108:aload           6
	//   42  110:aload           8
	//   43  112:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   44  115:pop             
				if(i != list.size() - 1)
	//*  45  116:iload_1         
	//*  46  117:aload           7
	//*  47  119:invokeinterface #74  <Method int List.size()>
	//*  48  124:iconst_1        
	//*  49  125:isub            
	//*  50  126:icmpeq          137
					stringbuilder.append(',');
	//   51  129:aload           6
	//   52  131:bipush          44
	//   53  133:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   54  136:pop             
			}

	//   55  137:iload_1         
	//   56  138:iconst_1        
	//   57  139:iadd            
	//   58  140:istore_1        
	//*  59  141:goto            77
			if(!TextUtils.isEmpty(((CharSequence) (stringbuilder.toString()))))
	//*  60  144:aload           6
	//*  61  146:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  62  149:invokestatic    #90  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  152:ifne            174
				((Map) (hashmap)).put(entry.getKey(), ((Object) (stringbuilder.toString())));
	//   64  155:aload_3         
	//   65  156:aload           5
	//   66  158:invokeinterface #103 <Method Object java.util.Map$Entry.getKey()>
	//   67  163:aload           6
	//   68  165:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   69  168:invokeinterface #107 <Method Object Map.put(Object, Object)>
	//   70  173:pop             
		} while(true);
	//   71  174:goto            24
		return ((Map) (hashmap));
	//   72  177:aload_3         
	//   73  178:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof LazyHeaders)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class LazyHeaders>
	//*   2    4:ifeq            26
		{
			obj = ((Object) ((LazyHeaders)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class LazyHeaders>
	//    5   11:astore_1        
			return headers.equals(((Object) (((LazyHeaders) (obj)).headers)));
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Map headers>
	//    8   16:aload_1         
	//    9   17:getfield        #30  <Field Map headers>
	//   10   20:invokeinterface #112 <Method boolean Map.equals(Object)>
	//   11   25:ireturn         
		} else
		{
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		}
	}

	public Map getHeaders()
	{
		if(combinedHeaders != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Map combinedHeaders>
	//    2    4:ifnonnull       37
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(combinedHeaders == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #115 <Field Map combinedHeaders>
	//*   7   13:ifnonnull       27
			combinedHeaders = Collections.unmodifiableMap(generateHeaders());
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokespecial   #117 <Method Map generateHeaders()>
	//   11   21:invokestatic    #28  <Method Map Collections.unmodifiableMap(Map)>
	//   12   24:putfield        #115 <Field Map combinedHeaders>
		this;
	//   13   27:aload_0         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   15   29:goto            37
		Exception exception;
		exception;
	//   16   32:astore_1        
	//*  17   33:aload_0         
		throw exception;
	//   18   34:monitorexit     
	//   19   35:aload_1         
	//   20   36:athrow          
		return combinedHeaders;
	//   21   37:aload_0         
	//   22   38:getfield        #115 <Field Map combinedHeaders>
	//   23   41:areturn         
	}

	public int hashCode()
	{
		return headers.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map headers>
	//    2    4:invokeinterface #120 <Method int Map.hashCode()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("LazyHeaders{headers=").append(((Object) (headers))).append('}').toString();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:ldc1            #122 <String "LazyHeaders{headers=">
	//    4    9:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #30  <Field Map headers>
	//    7   16:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:bipush          125
	//    9   21:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private volatile Map combinedHeaders;
	private final Map headers;
}
