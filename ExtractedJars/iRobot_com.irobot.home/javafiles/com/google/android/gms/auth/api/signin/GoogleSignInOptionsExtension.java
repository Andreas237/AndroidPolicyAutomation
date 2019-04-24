// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import java.util.List;

public interface GoogleSignInOptionsExtension
{

	public abstract int getExtensionType();

	public abstract List getImpliedScopes();

	public abstract Bundle toBundle();

	public static final int FITNESS = 3;
	public static final int GAMES = 1;
}
