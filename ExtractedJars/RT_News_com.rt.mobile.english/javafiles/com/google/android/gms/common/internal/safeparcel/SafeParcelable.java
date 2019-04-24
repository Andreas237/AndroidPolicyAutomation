// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import java.lang.annotation.Annotation;

public interface SafeParcelable
	extends Parcelable
{
	public static interface Class
		extends Annotation
	{

		public abstract String creator();

		public abstract boolean validate();
	}

	public static interface Constructor
		extends Annotation
	{
	}

	public static interface Field
		extends Annotation
	{

		public abstract String defaultValue();

		public abstract String defaultValueUnchecked();

		public abstract String getter();

		public abstract int id();

		public abstract String type();
	}

	public static interface Indicator
		extends Annotation
	{

		public abstract String getter();
	}

	public static interface Param
		extends Annotation
	{

		public abstract int id();
	}

	public static interface Reserved
		extends Annotation
	{

		public abstract int[] value();
	}

	public static interface VersionField
		extends Annotation
	{

		public abstract String getter();

		public abstract int id();

		public abstract String type();
	}


	public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";
}
