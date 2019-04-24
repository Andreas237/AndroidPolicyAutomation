// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation.provider;

import java.lang.annotation.Annotation;

public interface ContentUri
	extends Annotation
{
	public static class ContentType
	{

		public static final String VND_MULTIPLE = "vnd.android.cursor.dir/";
		public static final String VND_SINGLE = "vnd.android.cursor.item/";

		public ContentType()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface PathSegment
		extends Annotation
	{

		public abstract String column();

		public abstract int segment();
	}


	public abstract boolean deleteEnabled();

	public abstract boolean insertEnabled();

	public abstract String path();

	public abstract boolean queryEnabled();

	public abstract PathSegment[] segments();

	public abstract String type();

	public abstract boolean updateEnabled();
}
