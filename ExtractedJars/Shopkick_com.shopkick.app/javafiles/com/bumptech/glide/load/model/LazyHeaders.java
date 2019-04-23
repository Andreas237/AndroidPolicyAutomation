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
		//    0    0:new             #29  <Class HashMap>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #69  <Field Map headers>
		//    4    8:invokeinterface #77  <Method int Map.size()>
		//    5   13:invokespecial   #33  <Method void HashMap(int)>
		//    6   16:astore_1        
			java.util.Map.Entry entry;
			ArrayList arraylist;
			for(Iterator iterator = headers.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(entry.getKey(), ((Object) (arraylist))))
		//*   7   17:aload_0         
		//*   8   18:getfield        #69  <Field Map headers>
		//*   9   21:invokeinterface #81  <Method Set Map.entrySet()>
		//*  10   26:invokeinterface #87  <Method Iterator Set.iterator()>
		//*  11   31:astore_2        
		//*  12   32:aload_2         
		//*  13   33:invokeinterface #93  <Method boolean Iterator.hasNext()>
		//*  14   38:ifeq            87
			{
				entry = (java.util.Map.Entry)iterator.next();
		//   15   41:aload_2         
		//   16   42:invokeinterface #97  <Method Object Iterator.next()>
		//   17   47:checkcast       #99  <Class java.util.Map$Entry>
		//   18   50:astore_3        
				arraylist = new ArrayList((Collection)entry.getValue());
		//   19   51:new             #101 <Class ArrayList>
		//   20   54:dup             
		//   21   55:aload_3         
		//   22   56:invokeinterface #104 <Method Object java.util.Map$Entry.getValue()>
		//   23   61:checkcast       #106 <Class Collection>
		//   24   64:invokespecial   #109 <Method void ArrayList(Collection)>
		//   25   67:astore          4
			}

		//   26   69:aload_1         
		//   27   70:aload_3         
		//   28   71:invokeinterface #112 <Method Object java.util.Map$Entry.getKey()>
		//   29   76:aload           4
		//   30   78:invokeinterface #56  <Method Object Map.put(Object, Object)>
		//   31   83:pop             
		//*  32   84:goto            32
			return ((Map) (hashmap));
		//   33   87:aload_1         
		//   34   88:areturn         
		}

		private void copyIfNecessary()
		{
			if(copyOnModify)
		//*   0    0:aload_0         
		//*   1    1:getfield        #67  <Field boolean copyOnModify>
		//*   2    4:ifeq            20
			{
				copyOnModify = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #67  <Field boolean copyOnModify>
				headers = copyHeaders();
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:invokespecial   #117 <Method Map copyHeaders()>
		//    9   17:putfield        #69  <Field Map headers>
			}
		//   10   20:return          
		}

		private List getFactories(String s)
		{
			List list = (List)headers.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Map headers>
		//    2    4:aload_1         
		//    3    5:invokeinterface #123 <Method Object Map.get(Object)>
		//    4   10:checkcast       #125 <Class List>
		//    5   13:astore_3        
			Object obj = ((Object) (list));
		//    6   14:aload_3         
		//    7   15:astore_2        
			if(list == null)
		//*   8   16:aload_3         
		//*   9   17:ifnonnull       40
			{
				obj = ((Object) (new ArrayList()));
		//   10   20:new             #101 <Class ArrayList>
		//   11   23:dup             
		//   12   24:invokespecial   #126 <Method void ArrayList()>
		//   13   27:astore_2        
				headers.put(((Object) (s)), obj);
		//   14   28:aload_0         
		//   15   29:getfield        #69  <Field Map headers>
		//   16   32:aload_1         
		//   17   33:aload_2         
		//   18   34:invokeinterface #56  <Method Object Map.put(Object, Object)>
		//   19   39:pop             
			}
			return ((List) (obj));
		//   20   40:aload_2         
		//   21   41:areturn         
		}

		static String getSanitizedUserAgent()
		{
			String s = System.getProperty("http.agent");
		//    0    0:ldc1            #130 <String "http.agent">
		//    1    2:invokestatic    #136 <Method String System.getProperty(String)>
		//    2    5:astore_3        
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*   3    6:aload_3         
		//*   4    7:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   5   10:ifeq            15
				return s;
		//    6   13:aload_3         
		//    7   14:areturn         
			int j = s.length();
		//    8   15:aload_3         
		//    9   16:invokevirtual   #141 <Method int String.length()>
		//   10   19:istore_2        
			StringBuilder stringbuilder = new StringBuilder(s.length());
		//   11   20:new             #143 <Class StringBuilder>
		//   12   23:dup             
		//   13   24:aload_3         
		//   14   25:invokevirtual   #141 <Method int String.length()>
		//   15   28:invokespecial   #144 <Method void StringBuilder(int)>
		//   16   31:astore          4
			for(int i = 0; i < j; i++)
		//*  17   33:iconst_0        
		//*  18   34:istore_1        
		//*  19   35:iload_1         
		//*  20   36:iload_2         
		//*  21   37:icmpge          89
			{
				char c = s.charAt(i);
		//   22   40:aload_3         
		//   23   41:iload_1         
		//   24   42:invokevirtual   #148 <Method char String.charAt(int)>
		//   25   45:istore_0        
				if((c > '\037' || c == '\t') && c < '\177')
		//*  26   46:iload_0         
		//*  27   47:bipush          31
		//*  28   49:icmpgt          58
		//*  29   52:iload_0         
		//*  30   53:bipush          9
		//*  31   55:icmpne          74
		//*  32   58:iload_0         
		//*  33   59:bipush          127
		//*  34   61:icmpge          74
					stringbuilder.append(c);
		//   35   64:aload           4
		//   36   66:iload_0         
		//   37   67:invokevirtual   #152 <Method StringBuilder StringBuilder.append(char)>
		//   38   70:pop             
				else
		//*  39   71:goto            82
					stringbuilder.append('?');
		//   40   74:aload           4
		//   41   76:bipush          63
		//   42   78:invokevirtual   #152 <Method StringBuilder StringBuilder.append(char)>
		//   43   81:pop             
			}

		//   44   82:iload_1         
		//   45   83:iconst_1        
		//   46   84:iadd            
		//   47   85:istore_1        
		//*  48   86:goto            35
			return stringbuilder.toString();
		//   49   89:aload           4
		//   50   91:invokevirtual   #155 <Method String StringBuilder.toString()>
		//   51   94:areturn         
		}

		public Builder addHeader(String s, LazyHeaderFactory lazyheaderfactory)
		{
			if(isUserAgentDefault && "User-Agent".equalsIgnoreCase(s))
		//*   0    0:aload_0         
		//*   1    1:getfield        #71  <Field boolean isUserAgentDefault>
		//*   2    4:ifeq            23
		//*   3    7:ldc1            #15  <String "User-Agent">
		//*   4    9:aload_1         
		//*   5   10:invokevirtual   #162 <Method boolean String.equalsIgnoreCase(String)>
		//*   6   13:ifeq            23
			{
				return setHeader(s, lazyheaderfactory);
		//    7   16:aload_0         
		//    8   17:aload_1         
		//    9   18:aload_2         
		//   10   19:invokevirtual   #165 <Method LazyHeaders$Builder setHeader(String, LazyHeaderFactory)>
		//   11   22:areturn         
			} else
			{
				copyIfNecessary();
		//   12   23:aload_0         
		//   13   24:invokespecial   #167 <Method void copyIfNecessary()>
				getFactories(s).add(((Object) (lazyheaderfactory)));
		//   14   27:aload_0         
		//   15   28:aload_1         
		//   16   29:invokespecial   #169 <Method List getFactories(String)>
		//   17   32:aload_2         
		//   18   33:invokeinterface #173 <Method boolean List.add(Object)>
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
		//    2    2:new             #41  <Class LazyHeaders$StringHeaderFactory>
		//    3    5:dup             
		//    4    6:aload_2         
		//    5    7:invokespecial   #44  <Method void LazyHeaders$StringHeaderFactory(String)>
		//    6   10:invokevirtual   #176 <Method LazyHeaders$Builder addHeader(String, LazyHeaderFactory)>
		//    7   13:areturn         
		}

		public LazyHeaders build()
		{
			copyOnModify = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #67  <Field boolean copyOnModify>
			return new LazyHeaders(headers);
		//    3    5:new             #6   <Class LazyHeaders>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:getfield        #69  <Field Map headers>
		//    7   13:invokespecial   #181 <Method void LazyHeaders(Map)>
		//    8   16:areturn         
		}

		public Builder setHeader(String s, LazyHeaderFactory lazyheaderfactory)
		{
			copyIfNecessary();
		//    0    0:aload_0         
		//    1    1:invokespecial   #167 <Method void copyIfNecessary()>
			if(lazyheaderfactory == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       22
			{
				headers.remove(((Object) (s)));
		//    4    8:aload_0         
		//    5    9:getfield        #69  <Field Map headers>
		//    6   12:aload_1         
		//    7   13:invokeinterface #184 <Method Object Map.remove(Object)>
		//    8   18:pop             
			} else
		//*   9   19:goto            42
			{
				List list = getFactories(s);
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:invokespecial   #169 <Method List getFactories(String)>
		//   13   27:astore_3        
				list.clear();
		//   14   28:aload_3         
		//   15   29:invokeinterface #187 <Method void List.clear()>
				list.add(((Object) (lazyheaderfactory)));
		//   16   34:aload_3         
		//   17   35:aload_2         
		//   18   36:invokeinterface #173 <Method boolean List.add(Object)>
		//   19   41:pop             
			}
			if(isUserAgentDefault && "User-Agent".equalsIgnoreCase(s))
		//*  20   42:aload_0         
		//*  21   43:getfield        #71  <Field boolean isUserAgentDefault>
		//*  22   46:ifeq            63
		//*  23   49:ldc1            #15  <String "User-Agent">
		//*  24   51:aload_1         
		//*  25   52:invokevirtual   #162 <Method boolean String.equalsIgnoreCase(String)>
		//*  26   55:ifeq            63
				isUserAgentDefault = false;
		//   27   58:aload_0         
		//   28   59:iconst_0        
		//   29   60:putfield        #71  <Field boolean isUserAgentDefault>
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
		//    5    9:new             #41  <Class LazyHeaders$StringHeaderFactory>
		//    6   12:dup             
		//    7   13:aload_2         
		//    8   14:invokespecial   #44  <Method void LazyHeaders$StringHeaderFactory(String)>
		//    9   17:astore_2        
			return setHeader(s, ((LazyHeaderFactory) (s1)));
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:aload_2         
		//   13   21:invokevirtual   #165 <Method LazyHeaders$Builder setHeader(String, LazyHeaderFactory)>
		//   14   24:areturn         
		}

		private static final Map DEFAULT_HEADERS;
		private static final String DEFAULT_USER_AGENT = getSanitizedUserAgent();
		private static final String USER_AGENT_HEADER = "User-Agent";
		private boolean copyOnModify;
		private Map headers;
		private boolean isUserAgentDefault;

		static 
		{
		//    0    0:invokestatic    #25  <Method String getSanitizedUserAgent()>
		//    1    3:putstatic       #27  <Field String DEFAULT_USER_AGENT>
			HashMap hashmap = new HashMap(2);
		//    2    6:new             #29  <Class HashMap>
		//    3    9:dup             
		//    4   10:iconst_2        
		//    5   11:invokespecial   #33  <Method void HashMap(int)>
		//    6   14:astore_0        
			if(!TextUtils.isEmpty(((CharSequence) (DEFAULT_USER_AGENT))))
		//*   7   15:getstatic       #27  <Field String DEFAULT_USER_AGENT>
		//*   8   18:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   9   21:ifne            46
				((Map) (hashmap)).put("User-Agent", ((Object) (Collections.singletonList(((Object) (new StringHeaderFactory(DEFAULT_USER_AGENT)))))));
		//   10   24:aload_0         
		//   11   25:ldc1            #15  <String "User-Agent">
		//   12   27:new             #41  <Class LazyHeaders$StringHeaderFactory>
		//   13   30:dup             
		//   14   31:getstatic       #27  <Field String DEFAULT_USER_AGENT>
		//   15   34:invokespecial   #44  <Method void LazyHeaders$StringHeaderFactory(String)>
		//   16   37:invokestatic    #50  <Method List Collections.singletonList(Object)>
		//   17   40:invokeinterface #56  <Method Object Map.put(Object, Object)>
		//   18   45:pop             
			DEFAULT_HEADERS = Collections.unmodifiableMap(((Map) (hashmap)));
		//   19   46:aload_0         
		//   20   47:invokestatic    #60  <Method Map Collections.unmodifiableMap(Map)>
		//   21   50:putstatic       #62  <Field Map DEFAULT_HEADERS>
		//*  22   53:return          
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #65  <Method void Object()>
			copyOnModify = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #67  <Field boolean copyOnModify>
			headers = DEFAULT_HEADERS;
		//    5    9:aload_0         
		//    6   10:getstatic       #62  <Field Map DEFAULT_HEADERS>
		//    7   13:putfield        #69  <Field Map headers>
			isUserAgentDefault = true;
		//    8   16:aload_0         
		//    9   17:iconst_1        
		//   10   18:putfield        #71  <Field boolean isUserAgentDefault>
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #34  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("StringHeaderFactory{value='");
		//    4    8:aload_1         
		//    5    9:ldc1            #37  <String "StringHeaderFactory{value='">
		//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(value);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #18  <Field String value>
		//   11   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append('\'');
		//   13   24:aload_1         
		//   14   25:bipush          39
		//   15   27:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   16   30:pop             
			stringbuilder.append('}');
		//   17   31:aload_1         
		//   18   32:bipush          125
		//   19   34:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
		//   20   37:pop             
			return stringbuilder.toString();
		//   21   38:aload_1         
		//   22   39:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   23   42:areturn         
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

	private String buildHeaderValue(List list)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore          4
		int j = list.size();
	//    4    9:aload_1         
	//    5   10:invokeinterface #45  <Method int List.size()>
	//    6   15:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   16:iconst_0        
	//*   8   17:istore_2        
	//*   9   18:iload_2         
	//*  10   19:iload_3         
	//*  11   20:icmpge          83
		{
			String s = ((LazyHeaderFactory)list.get(i)).buildHeader();
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:invokeinterface #49  <Method Object List.get(int)>
	//   15   30:checkcast       #51  <Class LazyHeaderFactory>
	//   16   33:invokeinterface #55  <Method String LazyHeaderFactory.buildHeader()>
	//   17   38:astore          5
			if(TextUtils.isEmpty(((CharSequence) (s))))
				continue;
	//   18   40:aload           5
	//   19   42:invokestatic    #61  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   20   45:ifne            76
			stringbuilder.append(s);
	//   21   48:aload           4
	//   22   50:aload           5
	//   23   52:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   24   55:pop             
			if(i != list.size() - 1)
	//*  25   56:iload_2         
	//*  26   57:aload_1         
	//*  27   58:invokeinterface #45  <Method int List.size()>
	//*  28   63:iconst_1        
	//*  29   64:isub            
	//*  30   65:icmpeq          76
				stringbuilder.append(',');
	//   31   68:aload           4
	//   32   70:bipush          44
	//   33   72:invokevirtual   #68  <Method StringBuilder StringBuilder.append(char)>
	//   34   75:pop             
		}

	//   35   76:iload_2         
	//   36   77:iconst_1        
	//   37   78:iadd            
	//   38   79:istore_2        
	//*  39   80:goto            18
		return stringbuilder.toString();
	//   40   83:aload           4
	//   41   85:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   42   88:areturn         
	}

	private Map generateHeaders()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #78  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void HashMap()>
	//    3    7:astore_1        
		Iterator iterator = headers.entrySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field Map headers>
	//    6   12:invokeinterface #85  <Method Set Map.entrySet()>
	//    7   17:invokeinterface #91  <Method Iterator Set.iterator()>
	//    8   22:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   23:aload_2         
	//   10   24:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            83
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #101 <Method Object Iterator.next()>
	//   14   38:checkcast       #103 <Class java.util.Map$Entry>
	//   15   41:astore_3        
			String s = buildHeaderValue((List)entry.getValue());
	//   16   42:aload_0         
	//   17   43:aload_3         
	//   18   44:invokeinterface #106 <Method Object java.util.Map$Entry.getValue()>
	//   19   49:checkcast       #41  <Class List>
	//   20   52:invokespecial   #108 <Method String buildHeaderValue(List)>
	//   21   55:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  22   57:aload           4
	//*  23   59:invokestatic    #61  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   62:ifne            23
				((Map) (hashmap)).put(entry.getKey(), ((Object) (s)));
	//   25   65:aload_1         
	//   26   66:aload_3         
	//   27   67:invokeinterface #111 <Method Object java.util.Map$Entry.getKey()>
	//   28   72:aload           4
	//   29   74:invokeinterface #115 <Method Object Map.put(Object, Object)>
	//   30   79:pop             
		} while(true);
	//   31   80:goto            23
		return ((Map) (hashmap));
	//   32   83:aload_1         
	//   33   84:areturn         
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
	//   10   20:invokeinterface #120 <Method boolean Map.equals(Object)>
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
	//    1    1:getfield        #123 <Field Map combinedHeaders>
	//    2    4:ifnonnull       37
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(combinedHeaders == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #123 <Field Map combinedHeaders>
	//*   7   13:ifnonnull       27
			combinedHeaders = Collections.unmodifiableMap(generateHeaders());
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokespecial   #125 <Method Map generateHeaders()>
	//   11   21:invokestatic    #28  <Method Map Collections.unmodifiableMap(Map)>
	//   12   24:putfield        #123 <Field Map combinedHeaders>
		this;
	//   13   27:aload_0         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   15   29:goto            37
		Exception exception;
		exception;
	//   16   32:astore_1        
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		throw exception;
	//   19   35:aload_1         
	//   20   36:athrow          
		return combinedHeaders;
	//   21   37:aload_0         
	//   22   38:getfield        #123 <Field Map combinedHeaders>
	//   23   41:areturn         
	}

	public int hashCode()
	{
		return headers.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map headers>
	//    2    4:invokeinterface #128 <Method int Map.hashCode()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("LazyHeaders{headers=");
	//    4    8:aload_1         
	//    5    9:ldc1            #130 <String "LazyHeaders{headers=">
	//    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (headers)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field Map headers>
	//   11   20:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append('}');
	//   13   24:aload_1         
	//   14   25:bipush          125
	//   15   27:invokevirtual   #68  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private volatile Map combinedHeaders;
	private final Map headers;
}
