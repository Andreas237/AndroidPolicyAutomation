// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import java.util.Locale;

interface LocaleListInterface
{

	public abstract boolean equals(Object obj);

	public abstract Locale get(int i);

	public abstract Locale getFirstMatch(String as[]);

	public abstract Object getLocaleList();

	public abstract int hashCode();

	public abstract int indexOf(Locale locale);

	public abstract boolean isEmpty();

	public transient abstract void setLocaleList(Locale alocale[]);

	public abstract int size();

	public abstract String toLanguageTags();

	public abstract String toString();
}
