// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;


final class JsonScope
{

	JsonScope()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	static final int CLOSED = 8;
	static final int DANGLING_NAME = 4;
	static final int EMPTY_ARRAY = 1;
	static final int EMPTY_DOCUMENT = 6;
	static final int EMPTY_OBJECT = 3;
	static final int NONEMPTY_ARRAY = 2;
	static final int NONEMPTY_DOCUMENT = 7;
	static final int NONEMPTY_OBJECT = 5;
}
