// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

public interface JsonAppend
	extends Annotation
{
	public static interface Attr
		extends Annotation
	{

		public abstract com.fasterxml.jackson.annotation.JsonInclude.Include include();

		public abstract String propName();

		public abstract String propNamespace();

		public abstract boolean required();

		public abstract String value();
	}

	public static interface Prop
		extends Annotation
	{

		public abstract com.fasterxml.jackson.annotation.JsonInclude.Include include();

		public abstract String name();

		public abstract String namespace();

		public abstract boolean required();

		public abstract Class type();

		public abstract Class value();
	}


	public abstract Attr[] attrs();

	public abstract boolean prepend();

	public abstract Prop[] props();
}
