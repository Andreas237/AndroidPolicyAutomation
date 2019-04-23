// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.*;

// Referenced classes of package android.support.v13.view.inputmethod:
//			InputConnectionCompat, InputContentInfoCompat

static final class InputConnectionCompat$1 extends InputConnectionWrapper
{

	public boolean commitContent(InputContentInfo inputcontentinfo, int i, Bundle bundle)
	{
		if(val$listener.onCommitContent(InputContentInfoCompat.wrap(((Object) (inputcontentinfo))), i, bundle))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #27  <Method InputContentInfoCompat InputContentInfoCompat.wrap(Object)>
	//*   4    8:iload_2         
	//*   5    9:aload_3         
	//*   6   10:invokeinterface #33  <Method boolean InputConnectionCompat$OnCommitContentListener.onCommitContent(InputContentInfoCompat, int, Bundle)>
	//*   7   15:ifeq            20
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		else
			return super.commitContent(inputcontentinfo, i, bundle);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:aload_3         
	//   14   24:invokespecial   #35  <Method boolean InputConnectionWrapper.commitContent(InputContentInfo, int, Bundle)>
	//   15   27:ireturn         
	}

	final CommitContentListener val$listener;

	InputConnectionCompat$1(InputConnection inputconnection, boolean flag, CommitContentListener commitcontentlistener)
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
