// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities.tuple;

import com.firebase.client.core.Path;

public class PathAndId
{

	public PathAndId(Path path1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		path = path1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Path path>
		id = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #17  <Field long id>
	//    8   14:return          
	}

	public long getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field long id>
	//    2    4:lreturn         
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Path path>
	//    2    4:areturn         
	}

	private long id;
	private Path path;
}
