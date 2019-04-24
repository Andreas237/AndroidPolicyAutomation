// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import java.io.Serializable;

public class LocationConfig
	implements Serializable
{

	public LocationConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		fiEnabled = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean fiEnabled>
		coEnabled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field boolean coEnabled>
	//    8   14:return          
	}

	public boolean isCoEnabled()
	{
		return coEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean coEnabled>
	//    2    4:ireturn         
	}

	public boolean isFiEnabled()
	{
		return fiEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean fiEnabled>
	//    2    4:ireturn         
	}

	private static final boolean DEFAULT_CO_ENABLED = false;
	private static final boolean DEFAULT_FI_ENABLED = false;
	private static final long serialVersionUID = 1L;
	private boolean coEnabled;
	private boolean fiEnabled;
}
