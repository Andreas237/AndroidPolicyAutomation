// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;

interface StartActivityDelegate
{

	public abstract Activity getActivityContext();

	public abstract void startActivityForResult(Intent intent, int i);
}
