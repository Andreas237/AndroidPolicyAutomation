// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.keyStore;

import com.gigya.socialize.android.GigyaException;

// Referenced classes of package com.gigya.socialize.android.keyStore:
//			KeyStoreHelper

public class KeyStoreHelper$KeyStoreHelperException extends GigyaException
{

	final KeyStoreHelper this$0;

	public KeyStoreHelper$KeyStoreHelperException(String s, Throwable throwable)
	{
		this$0 = KeyStoreHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field KeyStoreHelper this$0>
		super(s, throwable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #16  <Method void GigyaException(String, Throwable)>
	//    7   11:return          
	}
}
