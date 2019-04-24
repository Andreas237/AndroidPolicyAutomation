// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.preference:
//			PreferenceFragmentCompat

class PreferenceFragmentCompat$1 extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 1: default 24
	//	               1 25
		default:
			return;
	//    3   24:return          

		case 1: // '\001'
			PreferenceFragmentCompat.access$100(PreferenceFragmentCompat.this);
	//    4   25:aload_0         
	//    5   26:getfield        #12  <Field PreferenceFragmentCompat this$0>
	//    6   29:invokestatic    #27  <Method void PreferenceFragmentCompat.access$100(PreferenceFragmentCompat)>
			break;
		}
	//    7   32:return          
	}

	final PreferenceFragmentCompat this$0;

	PreferenceFragmentCompat$1()
	{
		this$0 = PreferenceFragmentCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PreferenceFragmentCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Handler()>
	//    5    9:return          
	}
}
