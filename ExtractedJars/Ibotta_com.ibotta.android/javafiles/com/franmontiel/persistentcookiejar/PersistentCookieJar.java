// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar;

import com.franmontiel.persistentcookiejar.cache.CookieCache;
import com.franmontiel.persistentcookiejar.persistence.CookiePersistor;
import java.util.*;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

// Referenced classes of package com.franmontiel.persistentcookiejar:
//			ClearableCookieJar

public class PersistentCookieJar
	implements ClearableCookieJar
{

	public PersistentCookieJar(CookieCache cookiecache, CookiePersistor cookiepersistor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		cache = cookiecache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field CookieCache cache>
		persistor = cookiepersistor;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field CookiePersistor persistor>
		cache.addAll(((java.util.Collection) (cookiepersistor.loadAll())));
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field CookieCache cache>
	//   10   18:aload_2         
	//   11   19:invokeinterface #25  <Method List CookiePersistor.loadAll()>
	//   12   24:invokeinterface #31  <Method void CookieCache.addAll(java.util.Collection)>
	//   13   29:return          
	}

	private static List filterPersistentCookies(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #36  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void ArrayList()>
	//    3    7:astore_1        
		list = ((List) (list.iterator()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #43  <Method Iterator List.iterator()>
	//    6   14:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    7   15:aload_0         
	//    8   16:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            52
			Cookie cookie = (Cookie)((Iterator) (list)).next();
	//   10   24:aload_0         
	//   11   25:invokeinterface #53  <Method Object Iterator.next()>
	//   12   30:checkcast       #55  <Class Cookie>
	//   13   33:astore_2        
			if(cookie.persistent())
	//*  14   34:aload_2         
	//*  15   35:invokevirtual   #58  <Method boolean Cookie.persistent()>
	//*  16   38:ifeq            15
				((List) (arraylist)).add(((Object) (cookie)));
	//   17   41:aload_1         
	//   18   42:aload_2         
	//   19   43:invokeinterface #62  <Method boolean List.add(Object)>
	//   20   48:pop             
		} while(true);
	//   21   49:goto            15
		return ((List) (arraylist));
	//   22   52:aload_1         
	//   23   53:areturn         
	}

	private static boolean isCookieExpired(Cookie cookie)
	{
		return cookie.expiresAt() < System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method long Cookie.expiresAt()>
	//    2    4:invokestatic    #75  <Method long System.currentTimeMillis()>
	//    3    7:lcmp            
	//    4    8:ifge            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		cache.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field CookieCache cache>
	//    4    6:invokeinterface #78  <Method void CookieCache.clear()>
		persistor.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field CookiePersistor persistor>
	//    7   15:invokeinterface #79  <Method void CookiePersistor.clear()>
		this;
	//    8   20:aload_0         
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		return;
	//   10   22:return          
		Exception exception;
		exception;
	//   11   23:astore_1        
	//*  12   24:aload_0         
		throw exception;
	//   13   25:monitorexit     
	//   14   26:aload_1         
	//   15   27:athrow          
	}

	public void clearSession()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		cache.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field CookieCache cache>
	//    4    6:invokeinterface #78  <Method void CookieCache.clear()>
		cache.addAll(((java.util.Collection) (persistor.loadAll())));
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field CookieCache cache>
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field CookiePersistor persistor>
	//    9   19:invokeinterface #25  <Method List CookiePersistor.loadAll()>
	//   10   24:invokeinterface #31  <Method void CookieCache.addAll(java.util.Collection)>
		this;
	//   11   29:aload_0         
		JVM INSTR monitorexit ;
	//   12   30:monitorexit     
		return;
	//   13   31:return          
		Exception exception;
		exception;
	//   14   32:astore_1        
	//*  15   33:aload_0         
		throw exception;
	//   16   34:monitorexit     
	//   17   35:aload_1         
	//   18   36:athrow          
	}

	public List loadForRequest(HttpUrl httpurl)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		ArrayList arraylist1;
		Iterator iterator;
		arraylist = new ArrayList();
	//    2    2:new             #36  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #37  <Method void ArrayList()>
	//    5    9:astore_2        
		arraylist1 = new ArrayList();
	//    6   10:new             #36  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #37  <Method void ArrayList()>
	//    9   17:astore_3        
		iterator = cache.iterator();
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field CookieCache cache>
	//   12   22:invokeinterface #83  <Method Iterator CookieCache.iterator()>
	//   13   27:astore          4
_L3:
		Cookie cookie;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_99;
	//   14   29:aload           4
	//   15   31:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            99
		cookie = (Cookie)iterator.next();
	//   17   39:aload           4
	//   18   41:invokeinterface #53  <Method Object Iterator.next()>
	//   19   46:checkcast       #55  <Class Cookie>
	//   20   49:astore          5
		if(!isCookieExpired(cookie)) goto _L2; else goto _L1
	//   21   51:aload           5
	//   22   53:invokestatic    #85  <Method boolean isCookieExpired(Cookie)>
	//   23   56:ifeq            78
_L1:
		((List) (arraylist)).add(((Object) (cookie)));
	//   24   59:aload_2         
	//   25   60:aload           5
	//   26   62:invokeinterface #62  <Method boolean List.add(Object)>
	//   27   67:pop             
		iterator.remove();
	//   28   68:aload           4
	//   29   70:invokeinterface #88  <Method void Iterator.remove()>
		  goto _L3
	//*  30   75:goto            29
_L2:
		if(!cookie.matches(httpurl)) goto _L3; else goto _L4
	//   31   78:aload           5
	//   32   80:aload_1         
	//   33   81:invokevirtual   #92  <Method boolean Cookie.matches(HttpUrl)>
	//   34   84:ifeq            29
_L4:
		((List) (arraylist1)).add(((Object) (cookie)));
	//   35   87:aload_3         
	//   36   88:aload           5
	//   37   90:invokeinterface #62  <Method boolean List.add(Object)>
	//   38   95:pop             
		  goto _L3
	//*  39   96:goto            29
		persistor.removeAll(((java.util.Collection) (arraylist)));
	//   40   99:aload_0         
	//   41  100:getfield        #19  <Field CookiePersistor persistor>
	//   42  103:aload_2         
	//   43  104:invokeinterface #95  <Method void CookiePersistor.removeAll(java.util.Collection)>
		this;
	//   44  109:aload_0         
		JVM INSTR monitorexit ;
	//   45  110:monitorexit     
		return ((List) (arraylist1));
	//   46  111:aload_3         
	//   47  112:areturn         
		httpurl;
	//   48  113:astore_1        
	//*  49  114:aload_0         
		throw httpurl;
	//   50  115:monitorexit     
	//   51  116:aload_1         
	//   52  117:athrow          
	}

	public void saveFromResponse(HttpUrl httpurl, List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		cache.addAll(((java.util.Collection) (list)));
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field CookieCache cache>
	//    4    6:aload_2         
	//    5    7:invokeinterface #31  <Method void CookieCache.addAll(java.util.Collection)>
		persistor.saveAll(((java.util.Collection) (filterPersistentCookies(list))));
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field CookiePersistor persistor>
	//    8   16:aload_2         
	//    9   17:invokestatic    #100 <Method List filterPersistentCookies(List)>
	//   10   20:invokeinterface #103 <Method void CookiePersistor.saveAll(java.util.Collection)>
		this;
	//   11   25:aload_0         
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return;
	//   13   27:return          
		httpurl;
	//   14   28:astore_1        
	//*  15   29:aload_0         
		throw httpurl;
	//   16   30:monitorexit     
	//   17   31:aload_1         
	//   18   32:athrow          
	}

	private CookieCache cache;
	private CookiePersistor persistor;
}
