// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			LazyHeaders

public static final class LazyHeaders$Builder
{

	static String getSanitizedUserAgent()
	{
		String s = System.getProperty("http.agent");
	//    0    0:ldc1            #73  <String "http.agent">
	//    1    2:invokestatic    #79  <Method String System.getProperty(String)>
	//    2    5:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    6:aload_3         
	//*   4    7:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   10:ifeq            15
			return s;
	//    6   13:aload_3         
	//    7   14:areturn         
		int j = s.length();
	//    8   15:aload_3         
	//    9   16:invokevirtual   #85  <Method int String.length()>
	//   10   19:istore_2        
		StringBuilder stringbuilder = new StringBuilder(s.length());
	//   11   20:new             #87  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:aload_3         
	//   14   25:invokevirtual   #85  <Method int String.length()>
	//   15   28:invokespecial   #88  <Method void StringBuilder(int)>
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
	//   24   42:invokevirtual   #92  <Method char String.charAt(int)>
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
	//   37   67:invokevirtual   #96  <Method StringBuilder StringBuilder.append(char)>
	//   38   70:pop             
			else
	//*  39   71:goto            82
				stringbuilder.append('?');
	//   40   74:aload           4
	//   41   76:bipush          63
	//   42   78:invokevirtual   #96  <Method StringBuilder StringBuilder.append(char)>
	//   43   81:pop             
		}

	//   44   82:iload_1         
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:istore_1        
	//*  48   86:goto            35
		return stringbuilder.toString();
	//   49   89:aload           4
	//   50   91:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   51   94:areturn         
	}

	public LazyHeaders build()
	{
		copyOnModify = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #66  <Field boolean copyOnModify>
		return new LazyHeaders(headers);
	//    3    5:new             #6   <Class LazyHeaders>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field Map headers>
	//    7   13:invokespecial   #105 <Method void LazyHeaders(Map)>
	//    8   16:areturn         
	}

	private static final Map DEFAULT_HEADERS;
	private static final String DEFAULT_USER_AGENT = getSanitizedUserAgent();
	private boolean copyOnModify;
	private Map headers;
	private boolean isUserAgentDefault;

	static 
	{
	//    0    0:invokestatic    #22  <Method String getSanitizedUserAgent()>
	//    1    3:putstatic       #24  <Field String DEFAULT_USER_AGENT>
		HashMap hashmap = new HashMap(2);
	//    2    6:new             #26  <Class HashMap>
	//    3    9:dup             
	//    4   10:iconst_2        
	//    5   11:invokespecial   #30  <Method void HashMap(int)>
	//    6   14:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (DEFAULT_USER_AGENT))))
	//*   7   15:getstatic       #24  <Field String DEFAULT_USER_AGENT>
	//*   8   18:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   21:ifne            46
			((Map) (hashmap)).put("User-Agent", ((Object) (Collections.singletonList(((Object) (new aderFactory(DEFAULT_USER_AGENT)))))));
	//   10   24:aload_0         
	//   11   25:ldc1            #38  <String "User-Agent">
	//   12   27:new             #40  <Class LazyHeaders$StringHeaderFactory>
	//   13   30:dup             
	//   14   31:getstatic       #24  <Field String DEFAULT_USER_AGENT>
	//   15   34:invokespecial   #43  <Method void LazyHeaders$StringHeaderFactory(String)>
	//   16   37:invokestatic    #49  <Method java.util.List Collections.singletonList(Object)>
	//   17   40:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   18   45:pop             
		DEFAULT_HEADERS = Collections.unmodifiableMap(((Map) (hashmap)));
	//   19   46:aload_0         
	//   20   47:invokestatic    #59  <Method Map Collections.unmodifiableMap(Map)>
	//   21   50:putstatic       #61  <Field Map DEFAULT_HEADERS>
	//*  22   53:return          
	}

	public LazyHeaders$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		copyOnModify = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #66  <Field boolean copyOnModify>
		headers = DEFAULT_HEADERS;
	//    5    9:aload_0         
	//    6   10:getstatic       #61  <Field Map DEFAULT_HEADERS>
	//    7   13:putfield        #68  <Field Map headers>
		isUserAgentDefault = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #70  <Field boolean isUserAgentDefault>
	//   11   21:return          
	}
}
