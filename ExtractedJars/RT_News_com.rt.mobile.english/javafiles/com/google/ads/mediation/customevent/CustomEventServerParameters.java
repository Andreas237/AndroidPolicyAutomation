// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation.customevent;

import com.google.ads.mediation.MediationServerParameters;

public final class CustomEventServerParameters extends MediationServerParameters
{

	public CustomEventServerParameters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void MediationServerParameters()>
		parameter = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field String parameter>
	//    5    9:return          
	}

	public String className;
	public String label;
	public String parameter;
}
