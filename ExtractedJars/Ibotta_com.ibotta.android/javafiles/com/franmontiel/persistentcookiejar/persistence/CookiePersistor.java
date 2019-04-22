// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar.persistence;

import java.util.Collection;
import java.util.List;

public interface CookiePersistor
{

	public abstract void clear();

	public abstract List loadAll();

	public abstract void removeAll(Collection collection);

	public abstract void saveAll(Collection collection);
}
