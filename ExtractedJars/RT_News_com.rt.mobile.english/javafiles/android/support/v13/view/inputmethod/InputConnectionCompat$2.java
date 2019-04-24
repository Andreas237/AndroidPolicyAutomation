// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// Referenced classes of package android.support.v13.view.inputmethod:
//			InputConnectionCompat

static final class InputConnectionCompat$2 extends InputConnectionWrapper
{

	public boolean performPrivateCommand(String s, Bundle bundle)
	{
		if(InputConnectionCompat.handlePerformPrivateCommand(s, bundle, val$listener))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
	//*   4    6:invokestatic    #25  <Method boolean InputConnectionCompat.handlePerformPrivateCommand(String, Bundle, InputConnectionCompat$OnCommitContentListener)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		else
			return super.performPrivateCommand(s, bundle);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #27  <Method boolean InputConnectionWrapper.performPrivateCommand(String, Bundle)>
	//   12   20:ireturn         
	}

	final CommitContentListener val$listener;

	InputConnectionCompat$2(InputConnection inputconnection, boolean flag, CommitContentListener commitcontentlistener)
	{
		val$listener = commitcontentlistener;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
		super(inputconnection, flag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #18  <Method void InputConnectionWrapper(InputConnection, boolean)>
	//    7   11:return          
	}
}
