// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.Iterator;

public class CollectionMapper
{
	public static interface Collection
	{

		public abstract Object get(Object obj);

		public abstract Iterator keyIterator();

		public abstract void set(Object obj, Object obj1, OnErrorListener onerrorlistener);
	}

	public static interface OnErrorListener
	{

		public abstract void onError(FacebookException facebookexception);
	}

	public static interface OnMapValueCompleteListener
		extends OnErrorListener
	{

		public abstract void onComplete(Object obj);
	}

	public static interface OnMapperCompleteListener
		extends OnErrorListener
	{

		public abstract void onComplete();
	}

	public static interface ValueMapper
	{

		public abstract void mapValue(Object obj, OnMapValueCompleteListener onmapvaluecompletelistener);
	}

}
