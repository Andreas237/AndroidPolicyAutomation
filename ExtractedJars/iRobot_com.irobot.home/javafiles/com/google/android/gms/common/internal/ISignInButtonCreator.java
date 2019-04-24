// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.common.internal:
//			SignInButtonConfig

public interface ISignInButtonCreator
	extends IInterface
{

	public abstract IObjectWrapper newSignInButton(IObjectWrapper iobjectwrapper, int i, int j);

	public abstract IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iobjectwrapper, SignInButtonConfig signinbuttonconfig);
}
