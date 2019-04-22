// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar.cache;

import java.util.Iterator;
import java.util.Set;
import okhttp3.Cookie;

// Referenced classes of package com.franmontiel.persistentcookiejar.cache:
//			SetCookieCache, IdentifiableCookie

private class SetCookieCache$SetCookieCacheIterator
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

	public SetCookieCache$SetCookieCacheIterator()
	{
		this$0 = SetCookieCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SetCookieCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		iterator = SetCookieCache.access$000(SetCookieCache.this).iterator();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #26  <Method Set SetCookieCache.access$000(SetCookieCache)>
	//    8   14:invokeinterface #31  <Method Iterator Set.iterator()>
	//    9   19:putfield        #33  <Field Iterator iterator>
	//   10   22:return          
	}
}
