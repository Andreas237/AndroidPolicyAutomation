// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//			FacebookDialogFragment

class FacebookDialogFragment$2
	implements ner
{

	public void onComplete(Bundle bundle, FacebookException facebookexception)
	{
		FacebookDialogFragment.access$100(FacebookDialogFragment.this, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FacebookDialogFragment this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void FacebookDialogFragment.access$100(FacebookDialogFragment, Bundle)>
	//    4    8:return          
	}

	final FacebookDialogFragment this$0;

	FacebookDialogFragment$2()
	{
		this$0 = FacebookDialogFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FacebookDialogFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
