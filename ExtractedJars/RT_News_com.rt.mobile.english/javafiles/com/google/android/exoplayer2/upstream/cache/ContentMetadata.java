// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;


public interface ContentMetadata
{

	public abstract boolean contains(String s);

	public abstract long get(String s, long l);

	public abstract String get(String s, String s1);

	public abstract byte[] get(String s, byte abyte0[]);

	public static final String INTERNAL_METADATA_NAME_PREFIX = "exo_";
}
