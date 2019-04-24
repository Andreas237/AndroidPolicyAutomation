// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.Cache;

public class NoCache
	implements Cache
{

	public NoCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void clear()
	{
	//    0    0:return          
	}

	public com.android.volley.Cache.Entry get(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void initialize()
	{
	//    0    0:return          
	}

	public void invalidate(String s, boolean flag)
	{
	//    0    0:return          
	}

	public void put(String s, com.android.volley.Cache.Entry entry)
	{
	//    0    0:return          
	}

	public void remove(String s)
	{
	//    0    0:return          
	}
}
