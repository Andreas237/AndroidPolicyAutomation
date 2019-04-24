// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.hwid;

import java.lang.annotation.Annotation;

public interface Checked
	extends Annotation
{

	public abstract String permission();

	public abstract String scope();

	public abstract String value();
}
