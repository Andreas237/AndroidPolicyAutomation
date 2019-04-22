// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.ads.mediation:
//			MediationServerParameters

public static interface MediationServerParameters$Parameter
	extends Annotation
{

	public abstract String name();

	public abstract boolean required();
}
