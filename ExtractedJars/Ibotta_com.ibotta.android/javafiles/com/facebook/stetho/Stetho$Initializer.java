// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
import com.facebook.stetho.dumpapp.DumpappHttpSocketLikeHandler;
import com.facebook.stetho.dumpapp.DumpappSocketLikeHandler;
import com.facebook.stetho.dumpapp.Dumper;
import com.facebook.stetho.inspector.DevtoolsSocketHandler;
import com.facebook.stetho.server.AddressNameHelper;
import com.facebook.stetho.server.LazySocketHandler;
import com.facebook.stetho.server.LocalSocketServer;
import com.facebook.stetho.server.ProtocolDetectingSocketHandler;
import com.facebook.stetho.server.ServerManager;
import com.facebook.stetho.server.SocketHandler;
import com.facebook.stetho.server.SocketHandlerFactory;

// Referenced classes of package com.facebook.stetho:
//			Stetho

public static abstract class Stetho$Initializer
{
	private class RealSocketHandlerFactory
		implements SocketHandlerFactory
	{

		public SocketHandler create()
		{
			ProtocolDetectingSocketHandler protocoldetectingsockethandler = new ProtocolDetectingSocketHandler(mContext);
		//    0    0:new             #29  <Class ProtocolDetectingSocketHandler>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Stetho$Initializer this$0>
		//    4    8:invokestatic    #33  <Method Context Stetho$Initializer.access$100(Stetho$Initializer)>
		//    5   11:invokespecial   #36  <Method void ProtocolDetectingSocketHandler(Context)>
		//    6   14:astore_1        
			Object obj = ((Object) (getDumperPlugins()));
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field Stetho$Initializer this$0>
		//    9   19:invokevirtual   #40  <Method Iterable Stetho$Initializer.getDumperPlugins()>
		//   10   22:astore_2        
			if(obj != null)
		//*  11   23:aload_2         
		//*  12   24:ifnull          101
			{
				obj = ((Object) (new Dumper(((Iterable) (obj)))));
		//   13   27:new             #42  <Class Dumper>
		//   14   30:dup             
		//   15   31:aload_2         
		//   16   32:invokespecial   #45  <Method void Dumper(Iterable)>
		//   17   35:astore_2        
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.ExactMagicMatcher(DumpappSocketLikeHandler.PROTOCOL_MAGIC))), ((com.facebook.stetho.server.SocketLikeHandler) (new DumpappSocketLikeHandler(((Dumper) (obj))))));
		//   18   36:aload_1         
		//   19   37:new             #47  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher>
		//   20   40:dup             
		//   21   41:getstatic       #53  <Field byte[] DumpappSocketLikeHandler.PROTOCOL_MAGIC>
		//   22   44:invokespecial   #56  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher(byte[])>
		//   23   47:new             #49  <Class DumpappSocketLikeHandler>
		//   24   50:dup             
		//   25   51:aload_2         
		//   26   52:invokespecial   #59  <Method void DumpappSocketLikeHandler(Dumper)>
		//   27   55:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
				obj = ((Object) (new DumpappHttpSocketLikeHandler(((Dumper) (obj)))));
		//   28   58:new             #65  <Class DumpappHttpSocketLikeHandler>
		//   29   61:dup             
		//   30   62:aload_2         
		//   31   63:invokespecial   #66  <Method void DumpappHttpSocketLikeHandler(Dumper)>
		//   32   66:astore_2        
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.ExactMagicMatcher("GET /dumpapp".getBytes()))), ((com.facebook.stetho.server.SocketLikeHandler) (obj)));
		//   33   67:aload_1         
		//   34   68:new             #47  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher>
		//   35   71:dup             
		//   36   72:ldc1            #68  <String "GET /dumpapp">
		//   37   74:invokevirtual   #74  <Method byte[] String.getBytes()>
		//   38   77:invokespecial   #56  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher(byte[])>
		//   39   80:aload_2         
		//   40   81:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.ExactMagicMatcher("POST /dumpapp".getBytes()))), ((com.facebook.stetho.server.SocketLikeHandler) (obj)));
		//   41   84:aload_1         
		//   42   85:new             #47  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher>
		//   43   88:dup             
		//   44   89:ldc1            #76  <String "POST /dumpapp">
		//   45   91:invokevirtual   #74  <Method byte[] String.getBytes()>
		//   46   94:invokespecial   #56  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher(byte[])>
		//   47   97:aload_2         
		//   48   98:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
			}
			obj = ((Object) (getInspectorModules()));
		//   49  101:aload_0         
		//   50  102:getfield        #18  <Field Stetho$Initializer this$0>
		//   51  105:invokevirtual   #79  <Method Iterable Stetho$Initializer.getInspectorModules()>
		//   52  108:astore_2        
			if(obj != null)
		//*  53  109:aload_2         
		//*  54  110:ifnull          139
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.AlwaysMatchMatcher())), ((com.facebook.stetho.server.SocketLikeHandler) (new DevtoolsSocketHandler(mContext, ((Iterable) (obj))))));
		//   55  113:aload_1         
		//   56  114:new             #81  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$AlwaysMatchMatcher>
		//   57  117:dup             
		//   58  118:invokespecial   #82  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$AlwaysMatchMatcher()>
		//   59  121:new             #84  <Class DevtoolsSocketHandler>
		//   60  124:dup             
		//   61  125:aload_0         
		//   62  126:getfield        #18  <Field Stetho$Initializer this$0>
		//   63  129:invokestatic    #33  <Method Context Stetho$Initializer.access$100(Stetho$Initializer)>
		//   64  132:aload_2         
		//   65  133:invokespecial   #87  <Method void DevtoolsSocketHandler(Context, Iterable)>
		//   66  136:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
			return ((SocketHandler) (protocoldetectingsockethandler));
		//   67  139:aload_1         
		//   68  140:areturn         
		}

		final Stetho.Initializer this$0;

		private RealSocketHandlerFactory()
		{
			this$0 = Stetho.Initializer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field Stetho$Initializer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}

		RealSocketHandlerFactory(Stetho._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void Stetho$Initializer$RealSocketHandlerFactory(Stetho$Initializer)>
		//    3    5:return          
		}
	}


	protected abstract Iterable getDumperPlugins();

	protected abstract Iterable getInspectorModules();

	final void start()
	{
		(new ServerManager(new LocalSocketServer("main", AddressNameHelper.createCustomAddress("_devtools_remote"), ((SocketHandler) (new LazySocketHandler(((SocketHandlerFactory) (new RealSocketHandlerFactory(((Stetho._cls1) (null))))))))))).start();
	//    0    0:new             #35  <Class ServerManager>
	//    1    3:dup             
	//    2    4:new             #37  <Class LocalSocketServer>
	//    3    7:dup             
	//    4    8:ldc1            #39  <String "main">
	//    5   10:ldc1            #41  <String "_devtools_remote">
	//    6   12:invokestatic    #47  <Method String AddressNameHelper.createCustomAddress(String)>
	//    7   15:new             #49  <Class LazySocketHandler>
	//    8   18:dup             
	//    9   19:new             #9   <Class Stetho$Initializer$RealSocketHandlerFactory>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:invokespecial   #52  <Method void Stetho$Initializer$RealSocketHandlerFactory(Stetho$Initializer, Stetho$1)>
	//   14   28:invokespecial   #55  <Method void LazySocketHandler(SocketHandlerFactory)>
	//   15   31:invokespecial   #58  <Method void LocalSocketServer(String, String, SocketHandler)>
	//   16   34:invokespecial   #61  <Method void ServerManager(LocalSocketServer)>
	//   17   37:invokevirtual   #63  <Method void ServerManager.start()>
	//   18   40:return          
	}

	private final Context mContext;


/*
	static Context access$100(Stetho$Initializer stetho$initializer)
	{
		return stetho$initializer.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Context mContext>
	//    2    4:areturn         
	}

*/

	protected Stetho$Initializer(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #25  <Field Context mContext>
	//    6   12:return          
	}
}
