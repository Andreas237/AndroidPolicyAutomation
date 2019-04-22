// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar.cache;

import java.util.*;
import okhttp3.Cookie;

// Referenced classes of package com.franmontiel.persistentcookiejar.cache:
//			CookieCache, IdentifiableCookie

public class SetCookieCache
	implements CookieCache
{
	private class SetCookieCacheIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			return iterator.hasNext();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Iterator iterator>
		//    2    4:invokeinterface #38  <Method boolean Iterator.hasNext()>
		//    3    9:ireturn         
		}

		public volatile Object next()
		{
			return ((Object) (next()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #43  <Method Cookie next()>
		//    2    4:areturn         
		}

		public Cookie next()
		{
			return ((IdentifiableCookie)iterator.next()).getCookie();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Iterator iterator>
		//    2    4:invokeinterface #45  <Method Object Iterator.next()>
		//    3    9:checkcast       #47  <Class IdentifiableCookie>
		//    4   12:invokevirtual   #50  <Method Cookie IdentifiableCookie.getCookie()>
		//    5   15:areturn         
		}

		public void remove()
		{
			iterator.remove();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Iterator iterator>
		//    2    4:invokeinterface #53  <Method void Iterator.remove()>
		//    3    9:return          
		}

		private Iterator iterator;
		final SetCookieCache this$0;

		public SetCookieCacheIterator()
		{
			this$0 = SetCookieCache.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field SetCookieCache this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			iterator = cookies.iterator();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #26  <Method Set SetCookieCache.access$000(SetCookieCache)>
		//    8   14:invokeinterface #31  <Method Iterator Set.iterator()>
		//    9   19:putfield        #33  <Field Iterator iterator>
		//   10   22:return          
		}
	}


	public SetCookieCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		cookies = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashSet()>
	//    6   12:putfield        #21  <Field Set cookies>
	//    7   15:return          
	}

	public void addAll(Collection collection)
	{
		IdentifiableCookie identifiablecookie;
		for(collection = ((Collection) (IdentifiableCookie.decorateAll(collection).iterator())); ((Iterator) (collection)).hasNext(); cookies.add(((Object) (identifiablecookie))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #32  <Method List IdentifiableCookie.decorateAll(Collection)>
	//*   2    4:invokeinterface #38  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            54
		{
			identifiablecookie = (IdentifiableCookie)((Iterator) (collection)).next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #48  <Method Object Iterator.next()>
	//    9   25:checkcast       #28  <Class IdentifiableCookie>
	//   10   28:astore_2        
			cookies.remove(((Object) (identifiablecookie)));
	//   11   29:aload_0         
	//   12   30:getfield        #21  <Field Set cookies>
	//   13   33:aload_2         
	//   14   34:invokeinterface #54  <Method boolean Set.remove(Object)>
	//   15   39:pop             
		}

	//   16   40:aload_0         
	//   17   41:getfield        #21  <Field Set cookies>
	//   18   44:aload_2         
	//   19   45:invokeinterface #57  <Method boolean Set.add(Object)>
	//   20   50:pop             
	//*  21   51:goto            10
	//   22   54:return          
	}

	public void clear()
	{
		cookies.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Set cookies>
	//    2    4:invokeinterface #62  <Method void Set.clear()>
	//    3    9:return          
	}

	public Iterator iterator()
	{
		return ((Iterator) (new SetCookieCacheIterator()));
	//    0    0:new             #8   <Class SetCookieCache$SetCookieCacheIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #65  <Method void SetCookieCache$SetCookieCacheIterator(SetCookieCache)>
	//    4    8:areturn         
	}

	private Set cookies;


/*
	static Set access$000(SetCookieCache setcookiecache)
	{
		return setcookiecache.cookies;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Set cookies>
	//    2    4:areturn         
	}

*/
}
