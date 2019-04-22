// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.*;
import okhttp3.Cookie;

// Referenced classes of package com.franmontiel.persistentcookiejar.persistence:
//			CookiePersistor, SerializableCookie

public class SharedPrefsCookiePersistor
	implements CookiePersistor
{

	public SharedPrefsCookiePersistor(Context context)
	{
		this(context.getSharedPreferences("CookiePersistence", 0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #15  <String "CookiePersistence">
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #21  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5    8:invokespecial   #24  <Method void SharedPrefsCookiePersistor(SharedPreferences)>
	//    6   11:return          
	}

	public SharedPrefsCookiePersistor(SharedPreferences sharedpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		sharedPreferences = sharedpreferences;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field SharedPreferences sharedPreferences>
	//    5    9:return          
	}

	private static String createCookieKey(Cookie cookie)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_2        
		String s;
		if(cookie.secure())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #41  <Method boolean Cookie.secure()>
	//*   6   12:ifeq            21
			s = "https";
	//    7   15:ldc1            #43  <String "https">
	//    8   17:astore_1        
		else
	//*   9   18:goto            24
			s = "http";
	//   10   21:ldc1            #45  <String "http">
	//   11   23:astore_1        
		stringbuilder.append(s);
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append("://");
	//   16   30:aload_2         
	//   17   31:ldc1            #51  <String "://">
	//   18   33:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append(cookie.domain());
	//   20   37:aload_2         
	//   21   38:aload_0         
	//   22   39:invokevirtual   #55  <Method String Cookie.domain()>
	//   23   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		stringbuilder.append(cookie.path());
	//   25   46:aload_2         
	//   26   47:aload_0         
	//   27   48:invokevirtual   #58  <Method String Cookie.path()>
	//   28   51:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		stringbuilder.append("|");
	//   30   55:aload_2         
	//   31   56:ldc1            #60  <String "|">
	//   32   58:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
		stringbuilder.append(cookie.name());
	//   34   62:aload_2         
	//   35   63:aload_0         
	//   36   64:invokevirtual   #63  <Method String Cookie.name()>
	//   37   67:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   38   70:pop             
		return stringbuilder.toString();
	//   39   71:aload_2         
	//   40   72:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   41   75:areturn         
	}

	public void clear()
	{
		sharedPreferences.edit().clear().commit();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #73  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:invokeinterface #77  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    4   14:invokeinterface #80  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    5   19:pop             
	//    6   20:return          
	}

	public List loadAll()
	{
		ArrayList arraylist = new ArrayList(sharedPreferences.getAll().size());
	//    0    0:new             #84  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field SharedPreferences sharedPreferences>
	//    4    8:invokeinterface #88  <Method Map SharedPreferences.getAll()>
	//    5   13:invokeinterface #94  <Method int Map.size()>
	//    6   18:invokespecial   #97  <Method void ArrayList(int)>
	//    7   21:astore_1        
		Iterator iterator = sharedPreferences.getAll().entrySet().iterator();
	//    8   22:aload_0         
	//    9   23:getfield        #30  <Field SharedPreferences sharedPreferences>
	//   10   26:invokeinterface #88  <Method Map SharedPreferences.getAll()>
	//   11   31:invokeinterface #101 <Method Set Map.entrySet()>
	//   12   36:invokeinterface #107 <Method Iterator Set.iterator()>
	//   13   41:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   42:aload_2         
	//   15   43:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//   16   48:ifeq            96
			Object obj = ((Object) ((String)((java.util.Map.Entry)iterator.next()).getValue()));
	//   17   51:aload_2         
	//   18   52:invokeinterface #116 <Method Object Iterator.next()>
	//   19   57:checkcast       #118 <Class java.util.Map$Entry>
	//   20   60:invokeinterface #121 <Method Object java.util.Map$Entry.getValue()>
	//   21   65:checkcast       #123 <Class String>
	//   22   68:astore_3        
			obj = ((Object) ((new SerializableCookie()).decode(((String) (obj)))));
	//   23   69:new             #125 <Class SerializableCookie>
	//   24   72:dup             
	//   25   73:invokespecial   #126 <Method void SerializableCookie()>
	//   26   76:aload_3         
	//   27   77:invokevirtual   #130 <Method Cookie SerializableCookie.decode(String)>
	//   28   80:astore_3        
			if(obj != null)
	//*  29   81:aload_3         
	//*  30   82:ifnull          42
				((List) (arraylist)).add(obj);
	//   31   85:aload_1         
	//   32   86:aload_3         
	//   33   87:invokeinterface #136 <Method boolean List.add(Object)>
	//   34   92:pop             
		} while(true);
	//   35   93:goto            42
		return ((List) (arraylist));
	//   36   96:aload_1         
	//   37   97:areturn         
	}

	public void removeAll(Collection collection)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #73  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); editor.remove(createCookieKey((Cookie)((Iterator) (collection)).next())));
	//    4   10:aload_1         
	//    5   11:invokeinterface #143 <Method Iterator Collection.iterator()>
	//    6   16:astore_1        
	//    7   17:aload_1         
	//    8   18:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            48
	//   10   26:aload_2         
	//   11   27:aload_1         
	//   12   28:invokeinterface #116 <Method Object Iterator.next()>
	//   13   33:checkcast       #37  <Class Cookie>
	//   14   36:invokestatic    #145 <Method String createCookieKey(Cookie)>
	//   15   39:invokeinterface #149 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   16   44:pop             
	//*  17   45:goto            17
		editor.commit();
	//   18   48:aload_2         
	//   19   49:invokeinterface #80  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   20   54:pop             
	//   21   55:return          
	}

	public void saveAll(Collection collection)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #73  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Cookie cookie;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); editor.putString(createCookieKey(cookie), (new SerializableCookie()).encode(cookie)))
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #143 <Method Iterator Collection.iterator()>
	//*   6   16:astore_1        
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            61
			cookie = (Cookie)((Iterator) (collection)).next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #116 <Method Object Iterator.next()>
	//   12   32:checkcast       #37  <Class Cookie>
	//   13   35:astore_3        

	//   14   36:aload_2         
	//   15   37:aload_3         
	//   16   38:invokestatic    #145 <Method String createCookieKey(Cookie)>
	//   17   41:new             #125 <Class SerializableCookie>
	//   18   44:dup             
	//   19   45:invokespecial   #126 <Method void SerializableCookie()>
	//   20   48:aload_3         
	//   21   49:invokevirtual   #154 <Method String SerializableCookie.encode(Cookie)>
	//   22   52:invokeinterface #158 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   23   57:pop             
	//*  24   58:goto            17
		editor.commit();
	//   25   61:aload_2         
	//   26   62:invokeinterface #80  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   27   67:pop             
	//   28   68:return          
	}

	private final SharedPreferences sharedPreferences;
}
