// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//			TransportMediator, TransportPerformer

class TransportMediator$2
	implements android.view.KeyEvent.Callback
{

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(TransportMediator.isMediaKey(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #24  <Method boolean TransportMediator.isMediaKey(int)>
	//*   2    4:ifeq            20
			return mCallbacks.onMediaButtonDown(i, keyevent);
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field TransportMediator this$0>
	//    5   11:getfield        #28  <Field TransportPerformer TransportMediator.mCallbacks>
	//    6   14:iload_1         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #33  <Method boolean TransportPerformer.onMediaButtonDown(int, KeyEvent)>
	//    9   19:ireturn         
		else
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean onKeyLongPress(int i, KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onKeyMultiple(int i, int j, KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(TransportMediator.isMediaKey(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #24  <Method boolean TransportMediator.isMediaKey(int)>
	//*   2    4:ifeq            20
			return mCallbacks.onMediaButtonUp(i, keyevent);
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field TransportMediator this$0>
	//    5   11:getfield        #28  <Field TransportPerformer TransportMediator.mCallbacks>
	//    6   14:iload_1         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #40  <Method boolean TransportPerformer.onMediaButtonUp(int, KeyEvent)>
	//    9   19:ireturn         
		else
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	final TransportMediator this$0;

	TransportMediator$2()
	{
		this$0 = TransportMediator.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field TransportMediator this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
