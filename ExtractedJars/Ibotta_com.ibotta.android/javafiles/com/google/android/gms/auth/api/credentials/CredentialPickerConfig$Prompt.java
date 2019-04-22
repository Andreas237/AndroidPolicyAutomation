// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialPickerConfig

public static interface CredentialPickerConfig$Prompt
	extends Annotation
{

	public static final int CONTINUE = 1;
	public static final int SIGN_IN = 2;
	public static final int SIGN_UP = 3;
}
