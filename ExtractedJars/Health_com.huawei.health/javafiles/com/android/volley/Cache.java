// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import java.util.Collections;
import java.util.Map;

public interface Cache
{
	public static class Entry
	{

		public boolean isExpired()
		{
			return ttl < System.currentTimeMillis();
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field long ttl>
		//    2    4:invokestatic    #42  <Method long System.currentTimeMillis()>
		//    3    7:lcmp            
		//    4    8:ifge            13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public boolean refreshNeeded()
		{
			return softTtl < System.currentTimeMillis();
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field long softTtl>
		//    2    4:invokestatic    #42  <Method long System.currentTimeMillis()>
		//    3    7:lcmp            
		//    4    8:ifge            13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public byte data[];
		public String etag;
		public long lastModified;
		public Map responseHeaders;
		public long serverDate;
		public long softTtl;
		public long ttl;

		public Entry()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			responseHeaders = Collections.emptyMap();
		//    2    4:aload_0         
		//    3    5:invokestatic    #29  <Method Map Collections.emptyMap()>
		//    4    8:putfield        #31  <Field Map responseHeaders>
		//    5   11:return          
		}
	}


	public abstract void clear();

	public abstract Entry get(String s);

	public abstract void initialize();

	public abstract void invalidate(String s, boolean flag);

	public abstract void put(String s, Entry entry);

	public abstract void remove(String s);
}
