// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwCloudJs.annotation;

import java.lang.annotation.Annotation;

public interface JSNativeMsg
	extends Annotation
{

	public abstract boolean isOpen();

	public abstract String permission();

	public abstract String type();
}
