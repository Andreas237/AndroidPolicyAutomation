// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import java.util.Map;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

private final class DOM$PeerManagerListener extends PeersRegisteredListener
{

	protected void onFirstPeerRegistered()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DOM.access$300(DOM.this).addRef();
	//    2    2:aload_0         
	//    3    3:getfield        #13  <Field DOM this$0>
	//    4    6:invokestatic    #25  <Method Document DOM.access$300(DOM)>
	//    5    9:invokevirtual   #30  <Method void Document.addRef()>
		DOM.access$300(DOM.this).addUpdateListener(((com.facebook.stetho.inspector.elements.Document$UpdateListener) (DOM.access$1900(DOM.this))));
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field DOM this$0>
	//    8   16:invokestatic    #25  <Method Document DOM.access$300(DOM)>
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field DOM this$0>
	//   11   23:invokestatic    #34  <Method DOM$DocumentUpdateListener DOM.access$1900(DOM)>
	//   12   26:invokevirtual   #38  <Method void Document.addUpdateListener(com.facebook.stetho.inspector.elements.Document$UpdateListener)>
		this;
	//   13   29:aload_0         
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		return;
	//   15   31:return          
		Exception exception;
		exception;
	//   16   32:astore_1        
	//*  17   33:aload_0         
		throw exception;
	//   18   34:monitorexit     
	//   19   35:aload_1         
	//   20   36:athrow          
	}

	protected void onLastPeerUnregistered()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DOM.access$2000(DOM.this).clear();
	//    2    2:aload_0         
	//    3    3:getfield        #13  <Field DOM this$0>
	//    4    6:invokestatic    #43  <Method Map DOM.access$2000(DOM)>
	//    5    9:invokeinterface #48  <Method void Map.clear()>
		DOM.access$300(DOM.this).removeUpdateListener(((com.facebook.stetho.inspector.elements.Document$UpdateListener) (DOM.access$1900(DOM.this))));
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field DOM this$0>
	//    8   18:invokestatic    #25  <Method Document DOM.access$300(DOM)>
	//    9   21:aload_0         
	//   10   22:getfield        #13  <Field DOM this$0>
	//   11   25:invokestatic    #34  <Method DOM$DocumentUpdateListener DOM.access$1900(DOM)>
	//   12   28:invokevirtual   #51  <Method void Document.removeUpdateListener(com.facebook.stetho.inspector.elements.Document$UpdateListener)>
		DOM.access$300(DOM.this).release();
	//   13   31:aload_0         
	//   14   32:getfield        #13  <Field DOM this$0>
	//   15   35:invokestatic    #25  <Method Document DOM.access$300(DOM)>
	//   16   38:invokevirtual   #54  <Method void Document.release()>
		this;
	//   17   41:aload_0         
		JVM INSTR monitorexit ;
	//   18   42:monitorexit     
		return;
	//   19   43:return          
		Exception exception;
		exception;
	//   20   44:astore_1        
	//*  21   45:aload_0         
		throw exception;
	//   22   46:monitorexit     
	//   23   47:aload_1         
	//   24   48:athrow          
	}

	final DOM this$0;

	private DOM$PeerManagerListener()
	{
		this$0 = DOM.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field DOM this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void PeersRegisteredListener()>
	//    5    9:return          
	}

	DOM$PeerManagerListener(DOM._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void DOM$PeerManagerListener(DOM)>
	//    3    5:return          
	}
}
