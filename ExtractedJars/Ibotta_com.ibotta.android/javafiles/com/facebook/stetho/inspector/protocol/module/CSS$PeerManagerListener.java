// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			CSS

private final class CSS$PeerManagerListener extends PeersRegisteredListener
{

	protected void onFirstPeerRegistered()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSS.access$200(CSS.this).addRef();
	//    2    2:aload_0         
	//    3    3:getfield        #13  <Field CSS this$0>
	//    4    6:invokestatic    #25  <Method Document CSS.access$200(CSS)>
	//    5    9:invokevirtual   #30  <Method void Document.addRef()>
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		Exception exception;
		exception;
	//    9   15:astore_1        
	//*  10   16:aload_0         
		throw exception;
	//   11   17:monitorexit     
	//   12   18:aload_1         
	//   13   19:athrow          
	}

	protected void onLastPeerUnregistered()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSS.access$200(CSS.this).release();
	//    2    2:aload_0         
	//    3    3:getfield        #13  <Field CSS this$0>
	//    4    6:invokestatic    #25  <Method Document CSS.access$200(CSS)>
	//    5    9:invokevirtual   #34  <Method void Document.release()>
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		Exception exception;
		exception;
	//    9   15:astore_1        
	//*  10   16:aload_0         
		throw exception;
	//   11   17:monitorexit     
	//   12   18:aload_1         
	//   13   19:athrow          
	}

	final CSS this$0;

	private CSS$PeerManagerListener()
	{
		this$0 = CSS.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CSS this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void PeersRegisteredListener()>
	//    5    9:return          
	}

	CSS$PeerManagerListener(CSS._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void CSS$PeerManagerListener(CSS)>
	//    3    5:return          
	}
}
