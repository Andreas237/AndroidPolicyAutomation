// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.*;
import java.util.*;

// Referenced classes of package com.appscend.utilities:
//			SerializableHttpCookie

public class PersistentCookieStore
	implements CookieStore
{

	public PersistentCookieStore(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		sharedPreferences = context.getSharedPreferences("cookieStore", 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #10  <String "cookieStore">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #37  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   12:putfield        #39  <Field SharedPreferences sharedPreferences>
		loadAllFromPersistence();
	//    8   15:aload_0         
	//    9   16:invokespecial   #42  <Method void loadAllFromPersistence()>
	//   10   19:return          
	}

	private boolean checkDomainsMatch(String s, String s1)
	{
		if(!s1.equals(((Object) (s))))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*   3    5:ifne            45
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #52  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append(".");
	//    8   16:aload_3         
	//    9   17:ldc1            #55  <String ".">
	//   10   19:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(s);
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			if(!s1.endsWith(stringbuilder.toString()))
	//*  16   29:aload_2         
	//*  17   30:aload_3         
	//*  18   31:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  19   34:invokevirtual   #67  <Method boolean String.endsWith(String)>
	//*  20   37:ifeq            43
	//*  21   40:goto            45
				return false;
	//   22   43:iconst_0        
	//   23   44:ireturn         
		}
		return true;
	//   24   45:iconst_1        
	//   25   46:ireturn         
	}

	private boolean checkPathsMatch(String s, String s1)
	{
		boolean flag;
label0:
		{
			flag = s1.equals(((Object) (s)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method boolean String.equals(Object)>
	//    3    5:istore_3        
			boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
			if(!flag && (!s1.startsWith(s) || s.charAt(s.length() - 1) != '/'))
	//*   6    9:iload_3         
	//*   7   10:ifne            69
	//*   8   13:aload_2         
	//*   9   14:aload_1         
	//*  10   15:invokevirtual   #71  <Method boolean String.startsWith(String)>
	//*  11   18:ifeq            36
	//*  12   21:aload_1         
	//*  13   22:aload_1         
	//*  14   23:invokevirtual   #75  <Method int String.length()>
	//*  15   26:iconst_1        
	//*  16   27:isub            
	//*  17   28:invokevirtual   #79  <Method char String.charAt(int)>
	//*  18   31:bipush          47
	//*  19   33:icmpeq          69
			{
				flag = flag1;
	//   20   36:iload           4
	//   21   38:istore_3        
				if(!s1.startsWith(s))
					break label0;
	//   22   39:aload_2         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #71  <Method boolean String.startsWith(String)>
	//   25   44:ifeq            71
				flag = flag1;
	//   26   47:iload           4
	//   27   49:istore_3        
				if(s1.substring(s.length() - 1).charAt(0) != '/')
					break label0;
	//   28   50:aload_2         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #75  <Method int String.length()>
	//   31   55:iconst_1        
	//   32   56:isub            
	//   33   57:invokevirtual   #83  <Method String String.substring(int)>
	//   34   60:iconst_0        
	//   35   61:invokevirtual   #79  <Method char String.charAt(int)>
	//   36   64:bipush          47
	//   37   66:icmpne          71
			}
			flag = true;
	//   38   69:iconst_1        
	//   39   70:istore_3        
		}
		return flag;
	//   40   71:iload_3         
	//   41   72:ireturn         
	}

	private static URI cookieUri(URI uri, HttpCookie httpcookie)
	{
		String s;
		if(httpcookie.getDomain() == null)
			break MISSING_BLOCK_LABEL_89;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #92  <Method String HttpCookie.getDomain()>
	//    2    4:ifnull          89
		String s1 = httpcookie.getDomain();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #92  <Method String HttpCookie.getDomain()>
	//    5   11:astore_3        
		s = s1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(s1.charAt(0) == '.')
	//*   8   14:aload_3         
	//*   9   15:iconst_0        
	//*  10   16:invokevirtual   #79  <Method char String.charAt(int)>
	//*  11   19:bipush          46
	//*  12   21:icmpne          30
			s = s1.substring(1);
	//   13   24:aload_3         
	//   14   25:iconst_1        
	//   15   26:invokevirtual   #83  <Method String String.substring(int)>
	//   16   29:astore_2        
		String s2;
		if(uri.getScheme() == null)
	//*  17   30:aload_0         
	//*  18   31:invokevirtual   #97  <Method String URI.getScheme()>
	//*  19   34:ifnonnull       43
		{
			s2 = "http";
	//   20   37:ldc1            #99  <String "http">
	//   21   39:astore_3        
			break MISSING_BLOCK_LABEL_48;
	//   22   40:goto            48
		}
		s2 = uri.getScheme();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #97  <Method String URI.getScheme()>
	//   25   47:astore_3        
		if(httpcookie.getPath() == null)
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #102 <Method String HttpCookie.getPath()>
	//*  28   52:ifnonnull       61
		{
			httpcookie = "/";
	//   29   55:ldc1            #104 <String "/">
	//   30   57:astore_1        
			break MISSING_BLOCK_LABEL_66;
	//   31   58:goto            66
		}
		httpcookie = ((HttpCookie) (httpcookie.getPath()));
	//   32   61:aload_1         
	//   33   62:invokevirtual   #102 <Method String HttpCookie.getPath()>
	//   34   65:astore_1        
		httpcookie = ((HttpCookie) (new URI(s2, s, ((String) (httpcookie)), ((String) (null)))));
	//   35   66:new             #94  <Class URI>
	//   36   69:dup             
	//   37   70:aload_3         
	//   38   71:aload_2         
	//   39   72:aload_1         
	//   40   73:aconst_null     
	//   41   74:invokespecial   #107 <Method void URI(String, String, String, String)>
	//   42   77:astore_1        
		return ((URI) (httpcookie));
	//   43   78:aload_1         
	//   44   79:areturn         
		httpcookie;
	//   45   80:astore_1        
		Log.w(TAG, ((Throwable) (httpcookie)));
	//   46   81:getstatic       #109 <Field String TAG>
	//   47   84:aload_1         
	//   48   85:invokestatic    #115 <Method int Log.w(String, Throwable)>
	//   49   88:pop             
		return uri;
	//   50   89:aload_0         
	//   51   90:areturn         
	}

	private List getValidCookies(URI uri)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #119 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void HashSet()>
	//    3    7:astore_2        
		Object obj = ((Object) (allCookies.keySet().iterator()));
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field Map allCookies>
	//    6   12:invokeinterface #128 <Method Set Map.keySet()>
	//    7   17:invokeinterface #134 <Method Iterator Set.iterator()>
	//    8   22:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//    9   23:aload_3         
	//   10   24:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            99
			URI uri1 = (URI)((Iterator) (obj)).next();
	//   12   32:aload_3         
	//   13   33:invokeinterface #144 <Method Object Iterator.next()>
	//   14   38:checkcast       #94  <Class URI>
	//   15   41:astore          4
			if(checkDomainsMatch(uri1.getHost(), uri.getHost()) && checkPathsMatch(uri1.getPath(), uri.getPath()))
	//*  16   43:aload_0         
	//*  17   44:aload           4
	//*  18   46:invokevirtual   #147 <Method String URI.getHost()>
	//*  19   49:aload_1         
	//*  20   50:invokevirtual   #147 <Method String URI.getHost()>
	//*  21   53:invokespecial   #149 <Method boolean checkDomainsMatch(String, String)>
	//*  22   56:ifeq            23
	//*  23   59:aload_0         
	//*  24   60:aload           4
	//*  25   62:invokevirtual   #150 <Method String URI.getPath()>
	//*  26   65:aload_1         
	//*  27   66:invokevirtual   #150 <Method String URI.getPath()>
	//*  28   69:invokespecial   #152 <Method boolean checkPathsMatch(String, String)>
	//*  29   72:ifeq            23
				((Set) (hashset)).addAll((Collection)allCookies.get(((Object) (uri1))));
	//   30   75:aload_2         
	//   31   76:aload_0         
	//   32   77:getfield        #122 <Field Map allCookies>
	//   33   80:aload           4
	//   34   82:invokeinterface #156 <Method Object Map.get(Object)>
	//   35   87:checkcast       #158 <Class Collection>
	//   36   90:invokeinterface #162 <Method boolean Set.addAll(Collection)>
	//   37   95:pop             
		} while(true);
	//   38   96:goto            23
		obj = ((Object) (new ArrayList()));
	//   39   99:new             #164 <Class ArrayList>
	//   40  102:dup             
	//   41  103:invokespecial   #165 <Method void ArrayList()>
	//   42  106:astore_3        
		Iterator iterator = ((Set) (hashset)).iterator();
	//   43  107:aload_2         
	//   44  108:invokeinterface #134 <Method Iterator Set.iterator()>
	//   45  113:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   46  115:aload           4
	//   47  117:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   48  122:ifeq            179
			HttpCookie httpcookie = (HttpCookie)iterator.next();
	//   49  125:aload           4
	//   50  127:invokeinterface #144 <Method Object Iterator.next()>
	//   51  132:checkcast       #89  <Class HttpCookie>
	//   52  135:astore          5
			if(httpcookie == null)
	//*  53  137:aload           5
	//*  54  139:ifnonnull       152
				iterator.remove();
	//   55  142:aload           4
	//   56  144:invokeinterface #168 <Method void Iterator.remove()>
			else
	//*  57  149:goto            115
			if(httpcookie.hasExpired())
	//*  58  152:aload           5
	//*  59  154:invokevirtual   #171 <Method boolean HttpCookie.hasExpired()>
	//*  60  157:ifeq            115
			{
				((List) (obj)).add(((Object) (httpcookie)));
	//   61  160:aload_3         
	//   62  161:aload           5
	//   63  163:invokeinterface #176 <Method boolean List.add(Object)>
	//   64  168:pop             
				iterator.remove();
	//   65  169:aload           4
	//   66  171:invokeinterface #168 <Method void Iterator.remove()>
			}
		} while(true);
	//   67  176:goto            115
		if(!((List) (obj)).isEmpty())
	//*  68  179:aload_3         
	//*  69  180:invokeinterface #179 <Method boolean List.isEmpty()>
	//*  70  185:ifne            194
			removeFromPersistence(uri, ((List) (obj)));
	//   71  188:aload_0         
	//   72  189:aload_1         
	//   73  190:aload_3         
	//   74  191:invokespecial   #183 <Method void removeFromPersistence(URI, List)>
		return ((List) (new ArrayList(((Collection) (hashset)))));
	//   75  194:new             #164 <Class ArrayList>
	//   76  197:dup             
	//   77  198:aload_2         
	//   78  199:invokespecial   #186 <Method void ArrayList(Collection)>
	//   79  202:areturn         
	}

	private void loadAllFromPersistence()
	{
		Iterator iterator;
		allCookies = ((Map) (new HashMap()));
	//    0    0:aload_0         
	//    1    1:new             #190 <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #191 <Method void HashMap()>
	//    4    8:putfield        #122 <Field Map allCookies>
		iterator = sharedPreferences.getAll().entrySet().iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    7   15:invokeinterface #197 <Method Map SharedPreferences.getAll()>
	//    8   20:invokeinterface #200 <Method Set Map.entrySet()>
	//    9   25:invokeinterface #134 <Method Iterator Set.iterator()>
	//   10   30:astore_3        
_L2:
		Object obj;
		String as[];
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   11   31:aload_3         
	//   12   32:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   13   37:ifeq            167
		obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   14   40:aload_3         
	//   15   41:invokeinterface #144 <Method Object Iterator.next()>
	//   16   46:checkcast       #202 <Class java.util.Map$Entry>
	//   17   49:astore_1        
		as = ((String)((java.util.Map.Entry) (obj)).getKey()).split("\\|", 2);
	//   18   50:aload_1         
	//   19   51:invokeinterface #205 <Method Object java.util.Map$Entry.getKey()>
	//   20   56:checkcast       #46  <Class String>
	//   21   59:ldc1            #16  <String "\\|">
	//   22   61:iconst_2        
	//   23   62:invokevirtual   #209 <Method String[] String.split(String, int)>
	//   24   65:astore_2        
		Set set;
		URI uri;
		HttpCookie httpcookie;
		uri = new URI(as[0]);
	//   25   66:new             #94  <Class URI>
	//   26   69:dup             
	//   27   70:aload_2         
	//   28   71:iconst_0        
	//   29   72:aaload          
	//   30   73:invokespecial   #212 <Method void URI(String)>
	//   31   76:astore          4
		obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   32   78:aload_1         
	//   33   79:invokeinterface #215 <Method Object java.util.Map$Entry.getValue()>
	//   34   84:checkcast       #46  <Class String>
	//   35   87:astore_1        
		httpcookie = (new SerializableHttpCookie()).decode(((String) (obj)));
	//   36   88:new             #217 <Class SerializableHttpCookie>
	//   37   91:dup             
	//   38   92:invokespecial   #218 <Method void SerializableHttpCookie()>
	//   39   95:aload_1         
	//   40   96:invokevirtual   #222 <Method HttpCookie SerializableHttpCookie.decode(String)>
	//   41   99:astore          5
		set = (Set)allCookies.get(((Object) (uri)));
	//   42  101:aload_0         
	//   43  102:getfield        #122 <Field Map allCookies>
	//   44  105:aload           4
	//   45  107:invokeinterface #156 <Method Object Map.get(Object)>
	//   46  112:checkcast       #130 <Class Set>
	//   47  115:astore_2        
		obj = ((Object) (set));
	//   48  116:aload_2         
	//   49  117:astore_1        
		if(set != null)
			break MISSING_BLOCK_LABEL_143;
	//   50  118:aload_2         
	//   51  119:ifnonnull       143
		obj = ((Object) (new HashSet()));
	//   52  122:new             #119 <Class HashSet>
	//   53  125:dup             
	//   54  126:invokespecial   #120 <Method void HashSet()>
	//   55  129:astore_1        
		allCookies.put(((Object) (uri)), obj);
	//   56  130:aload_0         
	//   57  131:getfield        #122 <Field Map allCookies>
	//   58  134:aload           4
	//   59  136:aload_1         
	//   60  137:invokeinterface #226 <Method Object Map.put(Object, Object)>
	//   61  142:pop             
		((Set) (obj)).add(((Object) (httpcookie)));
	//   62  143:aload_1         
	//   63  144:aload           5
	//   64  146:invokeinterface #227 <Method boolean Set.add(Object)>
	//   65  151:pop             
		continue; /* Loop/switch isn't completed */
	//   66  152:goto            31
		URISyntaxException urisyntaxexception;
		urisyntaxexception;
	//   67  155:astore_1        
		Log.w(TAG, ((Throwable) (urisyntaxexception)));
	//   68  156:getstatic       #109 <Field String TAG>
	//   69  159:aload_1         
	//   70  160:invokestatic    #115 <Method int Log.w(String, Throwable)>
	//   71  163:pop             
		if(true) goto _L2; else goto _L1
	//   72  164:goto            31
_L1:
	//   73  167:return          
	}

	private void removeAllFromPersistence()
	{
		sharedPreferences.edit().clear().apply();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #232 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:invokeinterface #237 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    4   14:invokeinterface #240 <Method void android.content.SharedPreferences$Editor.apply()>
	//    5   19:return          
	}

	private void removeFromPersistence(URI uri, HttpCookie httpcookie)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #232 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #52  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #53  <Method void StringBuilder()>
	//    7   17:astore          4
		stringbuilder.append(uri.toString());
	//    8   19:aload           4
	//    9   21:aload_1         
	//   10   22:invokevirtual   #242 <Method String URI.toString()>
	//   11   25:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder.append("|");
	//   13   29:aload           4
	//   14   31:ldc1            #13  <String "|">
	//   15   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
		stringbuilder.append(httpcookie.getName());
	//   17   37:aload           4
	//   18   39:aload_2         
	//   19   40:invokevirtual   #245 <Method String HttpCookie.getName()>
	//   20   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		editor.remove(stringbuilder.toString());
	//   22   47:aload_3         
	//   23   48:aload           4
	//   24   50:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   25   53:invokeinterface #248 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   26   58:pop             
		editor.apply();
	//   27   59:aload_3         
	//   28   60:invokeinterface #240 <Method void android.content.SharedPreferences$Editor.apply()>
	//   29   65:return          
	}

	private void removeFromPersistence(URI uri, List list)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #232 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		StringBuilder stringbuilder;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); editor.remove(stringbuilder.toString()))
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #249 <Method Iterator List.iterator()>
	//*   6   16:astore_2        
	//*   7   17:aload_2         
	//*   8   18:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            90
		{
			HttpCookie httpcookie = (HttpCookie)((Iterator) (list)).next();
	//   10   26:aload_2         
	//   11   27:invokeinterface #144 <Method Object Iterator.next()>
	//   12   32:checkcast       #89  <Class HttpCookie>
	//   13   35:astore          4
			stringbuilder = new StringBuilder();
	//   14   37:new             #52  <Class StringBuilder>
	//   15   40:dup             
	//   16   41:invokespecial   #53  <Method void StringBuilder()>
	//   17   44:astore          5
			stringbuilder.append(uri.toString());
	//   18   46:aload           5
	//   19   48:aload_1         
	//   20   49:invokevirtual   #242 <Method String URI.toString()>
	//   21   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   22   55:pop             
			stringbuilder.append("|");
	//   23   56:aload           5
	//   24   58:ldc1            #13  <String "|">
	//   25   60:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   26   63:pop             
			stringbuilder.append(httpcookie.getName());
	//   27   64:aload           5
	//   28   66:aload           4
	//   29   68:invokevirtual   #245 <Method String HttpCookie.getName()>
	//   30   71:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   31   74:pop             
		}

	//   32   75:aload_3         
	//   33   76:aload           5
	//   34   78:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   35   81:invokeinterface #248 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   36   86:pop             
	//*  37   87:goto            17
		editor.apply();
	//   38   90:aload_3         
	//   39   91:invokeinterface #240 <Method void android.content.SharedPreferences$Editor.apply()>
	//   40   96:return          
	}

	private void saveToPersistence(URI uri, HttpCookie httpcookie)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #232 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #52  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #53  <Method void StringBuilder()>
	//    7   17:astore          4
		stringbuilder.append(uri.toString());
	//    8   19:aload           4
	//    9   21:aload_1         
	//   10   22:invokevirtual   #242 <Method String URI.toString()>
	//   11   25:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder.append("|");
	//   13   29:aload           4
	//   14   31:ldc1            #13  <String "|">
	//   15   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
		stringbuilder.append(httpcookie.getName());
	//   17   37:aload           4
	//   18   39:aload_2         
	//   19   40:invokevirtual   #245 <Method String HttpCookie.getName()>
	//   20   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		editor.putString(stringbuilder.toString(), (new SerializableHttpCookie()).encode(httpcookie));
	//   22   47:aload_3         
	//   23   48:aload           4
	//   24   50:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   25   53:new             #217 <Class SerializableHttpCookie>
	//   26   56:dup             
	//   27   57:invokespecial   #218 <Method void SerializableHttpCookie()>
	//   28   60:aload_2         
	//   29   61:invokevirtual   #255 <Method String SerializableHttpCookie.encode(HttpCookie)>
	//   30   64:invokeinterface #259 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   31   69:pop             
		editor.apply();
	//   32   70:aload_3         
	//   33   71:invokeinterface #240 <Method void android.content.SharedPreferences$Editor.apply()>
	//   34   76:return          
	}

	public void add(URI uri, HttpCookie httpcookie)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Set set;
		URI uri1;
		uri1 = cookieUri(uri, httpcookie);
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokestatic    #261 <Method URI cookieUri(URI, HttpCookie)>
	//    5    7:astore          4
		set = (Set)allCookies.get(((Object) (uri1)));
	//    6    9:aload_0         
	//    7   10:getfield        #122 <Field Map allCookies>
	//    8   13:aload           4
	//    9   15:invokeinterface #156 <Method Object Map.get(Object)>
	//   10   20:checkcast       #130 <Class Set>
	//   11   23:astore_3        
		uri = ((URI) (set));
	//   12   24:aload_3         
	//   13   25:astore_1        
		if(set != null)
			break MISSING_BLOCK_LABEL_51;
	//   14   26:aload_3         
	//   15   27:ifnonnull       51
		uri = ((URI) (new HashSet()));
	//   16   30:new             #119 <Class HashSet>
	//   17   33:dup             
	//   18   34:invokespecial   #120 <Method void HashSet()>
	//   19   37:astore_1        
		allCookies.put(((Object) (uri1)), ((Object) (uri)));
	//   20   38:aload_0         
	//   21   39:getfield        #122 <Field Map allCookies>
	//   22   42:aload           4
	//   23   44:aload_1         
	//   24   45:invokeinterface #226 <Method Object Map.put(Object, Object)>
	//   25   50:pop             
		((Set) (uri)).remove(((Object) (httpcookie)));
	//   26   51:aload_1         
	//   27   52:aload_2         
	//   28   53:invokeinterface #263 <Method boolean Set.remove(Object)>
	//   29   58:pop             
		((Set) (uri)).add(((Object) (httpcookie)));
	//   30   59:aload_1         
	//   31   60:aload_2         
	//   32   61:invokeinterface #227 <Method boolean Set.add(Object)>
	//   33   66:pop             
		saveToPersistence(uri1, httpcookie);
	//   34   67:aload_0         
	//   35   68:aload           4
	//   36   70:aload_2         
	//   37   71:invokespecial   #265 <Method void saveToPersistence(URI, HttpCookie)>
		this;
	//   38   74:aload_0         
		JVM INSTR monitorexit ;
	//   39   75:monitorexit     
		return;
	//   40   76:return          
		uri;
	//   41   77:astore_1        
	//*  42   78:aload_0         
		throw uri;
	//   43   79:monitorexit     
	//   44   80:aload_1         
	//   45   81:athrow          
	}

	public List get(URI uri)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		uri = ((URI) (getValidCookies(uri)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #267 <Method List getValidCookies(URI)>
	//    5    7:astore_1        
		this;
	//    6    8:aload_0         
		JVM INSTR monitorexit ;
	//    7    9:monitorexit     
		return ((List) (uri));
	//    8   10:aload_1         
	//    9   11:areturn         
		uri;
	//   10   12:astore_1        
	//*  11   13:aload_0         
		throw uri;
	//   12   14:monitorexit     
	//   13   15:aload_1         
	//   14   16:athrow          
	}

	public List getCookies()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    2    2:new             #164 <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #165 <Method void ArrayList()>
	//    5    9:astore_1        
		for(Iterator iterator = allCookies.keySet().iterator(); iterator.hasNext(); ((List) (arraylist)).addAll(((Collection) (getValidCookies((URI)iterator.next())))));
	//    6   10:aload_0         
	//    7   11:getfield        #122 <Field Map allCookies>
	//    8   14:invokeinterface #128 <Method Set Map.keySet()>
	//    9   19:invokeinterface #134 <Method Iterator Set.iterator()>
	//   10   24:astore_2        
	//   11   25:aload_2         
	//   12   26:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            57
	//   14   34:aload_1         
	//   15   35:aload_0         
	//   16   36:aload_2         
	//   17   37:invokeinterface #144 <Method Object Iterator.next()>
	//   18   42:checkcast       #94  <Class URI>
	//   19   45:invokespecial   #267 <Method List getValidCookies(URI)>
	//   20   48:invokeinterface #270 <Method boolean List.addAll(Collection)>
	//   21   53:pop             
	//*  22   54:goto            25
		this;
	//   23   57:aload_0         
		JVM INSTR monitorexit ;
	//   24   58:monitorexit     
		return ((List) (arraylist));
	//   25   59:aload_1         
	//   26   60:areturn         
		Exception exception;
		exception;
	//   27   61:astore_1        
	//*  28   62:aload_0         
		throw exception;
	//   29   63:monitorexit     
	//   30   64:aload_1         
	//   31   65:athrow          
	}

	public List getURIs()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist = new ArrayList(((Collection) (allCookies.keySet())));
	//    2    2:new             #164 <Class ArrayList>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #122 <Field Map allCookies>
	//    6   10:invokeinterface #128 <Method Set Map.keySet()>
	//    7   15:invokespecial   #186 <Method void ArrayList(Collection)>
	//    8   18:astore_1        
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return ((List) (arraylist));
	//   11   21:aload_1         
	//   12   22:areturn         
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public boolean remove(URI uri, HttpCookie httpcookie)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Set set = (Set)allCookies.get(((Object) (uri)));
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field Map allCookies>
	//    4    6:aload_1         
	//    5    7:invokeinterface #156 <Method Object Map.get(Object)>
	//    6   12:checkcast       #130 <Class Set>
	//    7   15:astore          4
		if(set == null) goto _L2; else goto _L1
	//    8   17:aload           4
	//    9   19:ifnull          53
_L1:
		boolean flag = set.remove(((Object) (httpcookie)));
	//   10   22:aload           4
	//   11   24:aload_2         
	//   12   25:invokeinterface #263 <Method boolean Set.remove(Object)>
	//   13   30:istore_3        
	//*  14   31:goto            34
_L4:
		if(!flag)
			break MISSING_BLOCK_LABEL_44;
	//   15   34:iload_3         
	//   16   35:ifeq            44
		removeFromPersistence(uri, httpcookie);
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:aload_2         
	//   20   41:invokespecial   #276 <Method void removeFromPersistence(URI, HttpCookie)>
		this;
	//   21   44:aload_0         
		JVM INSTR monitorexit ;
	//   22   45:monitorexit     
		return flag;
	//   23   46:iload_3         
	//   24   47:ireturn         
		uri;
	//   25   48:astore_1        
	//*  26   49:aload_0         
		throw uri;
	//   27   50:monitorexit     
	//   28   51:aload_1         
	//   29   52:athrow          
_L2:
		flag = false;
	//   30   53:iconst_0        
	//   31   54:istore_3        
		if(true) goto _L4; else goto _L3
	//   32   55:goto            34
_L3:
	}

	public boolean removeAll()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		allCookies.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field Map allCookies>
	//    4    6:invokeinterface #279 <Method void Map.clear()>
		removeAllFromPersistence();
	//    5   11:aload_0         
	//    6   12:invokespecial   #281 <Method void removeAllFromPersistence()>
		this;
	//    7   15:aload_0         
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		Exception exception;
		exception;
	//   11   19:astore_1        
	//*  12   20:aload_0         
		throw exception;
	//   13   21:monitorexit     
	//   14   22:aload_1         
	//   15   23:athrow          
	}

	private static final String SP_COOKIE_STORE = "cookieStore";
	private static final String SP_KEY_DELIMITER = "|";
	private static final String SP_KEY_DELIMITER_REGEX = "\\|";
	private static final String TAG = "PersistentCookieStore";
	private Map allCookies;
	private SharedPreferences sharedPreferences;

	static 
	{
	//    0    0:return          
	}
}
