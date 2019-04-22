// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.*;

// Referenced classes of package com.firebase.tubesock:
//			WebSocket, ThreadInitializer, WebSocketException

class WebSocketWriter
{

	WebSocketWriter(WebSocket websocket1, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void Random()>
	//    6   12:putfield        #30  <Field Random random>
		stop = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #32  <Field boolean stop>
		closeSent = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #34  <Field boolean closeSent>
	//   13   25:aload_0         
	//   14   26:invokestatic    #40  <Method ThreadFactory WebSocket.getThreadFactory()>
	//   15   29:new             #6   <Class WebSocketWriter$1>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #43  <Method void WebSocketWriter$1(WebSocketWriter)>
	//   19   37:invokeinterface #49  <Method Thread ThreadFactory.newThread(Runnable)>
	//   20   42:putfield        #51  <Field Thread innerThread>
		ThreadInitializer threadinitializer = WebSocket.getIntializer();
	//   21   45:invokestatic    #55  <Method ThreadInitializer WebSocket.getIntializer()>
	//   22   48:astore          4
		Thread thread = getInnerThread();
	//   23   50:aload_0         
	//   24   51:invokevirtual   #59  <Method Thread getInnerThread()>
	//   25   54:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   26   56:new             #61  <Class StringBuilder>
	//   27   59:dup             
	//   28   60:invokespecial   #62  <Method void StringBuilder()>
	//   29   63:astore          6
		stringbuilder.append(s);
	//   30   65:aload           6
	//   31   67:aload_2         
	//   32   68:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
		stringbuilder.append("Writer-");
	//   34   72:aload           6
	//   35   74:ldc1            #68  <String "Writer-">
	//   36   76:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
		stringbuilder.append(i);
	//   38   80:aload           6
	//   39   82:iload_3         
	//   40   83:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   41   86:pop             
		threadinitializer.setName(thread, stringbuilder.toString());
	//   42   87:aload           4
	//   43   89:aload           5
	//   44   91:aload           6
	//   45   93:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   46   96:invokeinterface #81  <Method void ThreadInitializer.setName(Thread, String)>
		websocket = websocket1;
	//   47  101:aload_0         
	//   48  102:aload_1         
	//   49  103:putfield        #83  <Field WebSocket websocket>
		pendingBuffers = ((BlockingQueue) (new LinkedBlockingQueue()));
	//   50  106:aload_0         
	//   51  107:new             #85  <Class LinkedBlockingQueue>
	//   52  110:dup             
	//   53  111:invokespecial   #86  <Method void LinkedBlockingQueue()>
	//   54  114:putfield        #88  <Field BlockingQueue pendingBuffers>
	//   55  117:return          
	}

	private ByteBuffer frameInBuffer(byte byte0, boolean flag, byte abyte0[])
		throws IOException
	{
		int i;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            11
			i = 6;
	//    2    4:bipush          6
	//    3    6:istore          4
		else
	//*   4    8:goto            14
			i = 2;
	//    5   11:iconst_2        
	//    6   12:istore          4
		int j = abyte0.length;
	//    7   14:aload_3         
	//    8   15:arraylength     
	//    9   16:istore          5
		byte byte1 = 126;
	//   10   18:bipush          126
	//   11   20:istore          6
		if(j >= 126)
	//*  12   22:iload           5
	//*  13   24:bipush          126
	//*  14   26:icmpge          32
	//*  15   29:goto            55
			if(j <= 65535)
	//*  16   32:iload           5
	//*  17   34:ldc1            #98  <Int 65535>
	//*  18   36:icmpgt          48
				i += 2;
	//   19   39:iload           4
	//   20   41:iconst_2        
	//   21   42:iadd            
	//   22   43:istore          4
			else
	//*  23   45:goto            55
				i += 8;
	//   24   48:iload           4
	//   25   50:bipush          8
	//   26   52:iadd            
	//   27   53:istore          4
		ByteBuffer bytebuffer = ByteBuffer.allocate(abyte0.length + i);
	//   28   55:aload_3         
	//   29   56:arraylength     
	//   30   57:iload           4
	//   31   59:iadd            
	//   32   60:invokestatic    #104 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   33   63:astore          7
		bytebuffer.put((byte)(byte0 | 0xffffff80));
	//   34   65:aload           7
	//   35   67:iload_1         
	//   36   68:bipush          -128
	//   37   70:ior             
	//   38   71:int2byte        
	//   39   72:invokevirtual   #108 <Method ByteBuffer ByteBuffer.put(byte)>
	//   40   75:pop             
		i = 0;
	//   41   76:iconst_0        
	//   42   77:istore          4
		if(j < 126)
	//*  43   79:iload           5
	//*  44   81:bipush          126
	//*  45   83:icmpge          111
		{
			byte0 = ((byte) (j));
	//   46   86:iload           5
	//   47   88:istore_1        
			if(flag)
	//*  48   89:iload_2         
	//*  49   90:ifeq            100
				byte0 = ((byte) (j | 0x80));
	//   50   93:iload           5
	//   51   95:sipush          128
	//   52   98:ior             
	//   53   99:istore_1        
			bytebuffer.put(byte0);
	//   54  100:aload           7
	//   55  102:iload_1         
	//   56  103:int2byte        
	//   57  104:invokevirtual   #108 <Method ByteBuffer ByteBuffer.put(byte)>
	//   58  107:pop             
		} else
	//*  59  108:goto            183
		if(j <= 65535)
	//*  60  111:iload           5
	//*  61  113:ldc1            #98  <Int 65535>
	//*  62  115:icmpgt          149
		{
			byte0 = byte1;
	//   63  118:iload           6
	//   64  120:istore_1        
			if(flag)
	//*  65  121:iload_2         
	//*  66  122:ifeq            129
				byte0 = 254;
	//   67  125:sipush          254
	//   68  128:istore_1        
			bytebuffer.put(byte0);
	//   69  129:aload           7
	//   70  131:iload_1         
	//   71  132:int2byte        
	//   72  133:invokevirtual   #108 <Method ByteBuffer ByteBuffer.put(byte)>
	//   73  136:pop             
			bytebuffer.putShort((short)j);
	//   74  137:aload           7
	//   75  139:iload           5
	//   76  141:int2short       
	//   77  142:invokevirtual   #112 <Method ByteBuffer ByteBuffer.putShort(short)>
	//   78  145:pop             
		} else
	//*  79  146:goto            183
		{
			byte0 = 127;
	//   80  149:bipush          127
	//   81  151:istore_1        
			if(flag)
	//*  82  152:iload_2         
	//*  83  153:ifeq            160
				byte0 = 255;
	//   84  156:sipush          255
	//   85  159:istore_1        
			bytebuffer.put(byte0);
	//   86  160:aload           7
	//   87  162:iload_1         
	//   88  163:int2byte        
	//   89  164:invokevirtual   #108 <Method ByteBuffer ByteBuffer.put(byte)>
	//   90  167:pop             
			bytebuffer.putInt(0);
	//   91  168:aload           7
	//   92  170:iconst_0        
	//   93  171:invokevirtual   #115 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   94  174:pop             
			bytebuffer.putInt(j);
	//   95  175:aload           7
	//   96  177:iload           5
	//   97  179:invokevirtual   #115 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   98  182:pop             
		}
		if(flag)
	//*  99  183:iload_2         
	//* 100  184:ifeq            234
		{
			byte abyte1[] = generateMask();
	//  101  187:aload_0         
	//  102  188:invokespecial   #119 <Method byte[] generateMask()>
	//  103  191:astore          8
			bytebuffer.put(abyte1);
	//  104  193:aload           7
	//  105  195:aload           8
	//  106  197:invokevirtual   #122 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  107  200:pop             
			for(byte0 = ((byte) (i)); byte0 < abyte0.length; byte0++)
	//* 108  201:iload           4
	//* 109  203:istore_1        
	//* 110  204:iload_1         
	//* 111  205:aload_3         
	//* 112  206:arraylength     
	//* 113  207:icmpge          234
				bytebuffer.put((byte)(abyte0[byte0] ^ abyte1[byte0 % 4]));
	//  114  210:aload           7
	//  115  212:aload_3         
	//  116  213:iload_1         
	//  117  214:baload          
	//  118  215:aload           8
	//  119  217:iload_1         
	//  120  218:iconst_4        
	//  121  219:irem            
	//  122  220:baload          
	//  123  221:ixor            
	//  124  222:int2byte        
	//  125  223:invokevirtual   #108 <Method ByteBuffer ByteBuffer.put(byte)>
	//  126  226:pop             

	//  127  227:iload_1         
	//  128  228:iconst_1        
	//  129  229:iadd            
	//  130  230:istore_1        
		}
	//* 131  231:goto            204
		bytebuffer.flip();
	//  132  234:aload           7
	//  133  236:invokevirtual   #126 <Method java.nio.Buffer ByteBuffer.flip()>
	//  134  239:pop             
		return bytebuffer;
	//  135  240:aload           7
	//  136  242:areturn         
	}

	private byte[] generateMask()
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		random.nextBytes(abyte0);
	//    3    4:aload_0         
	//    4    5:getfield        #30  <Field Random random>
	//    5    8:aload_1         
	//    6    9:invokevirtual   #131 <Method void Random.nextBytes(byte[])>
		return abyte0;
	//    7   12:aload_1         
	//    8   13:areturn         
	}

	private void handleError(WebSocketException websocketexception)
	{
		websocket.handleReceiverError(websocketexception);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field WebSocket websocket>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method void WebSocket.handleReceiverError(WebSocketException)>
	//    4    8:return          
	}

	private void runWriter()
	{
		for(; !stop && !Thread.interrupted(); writeMessage());
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean stop>
	//    2    4:ifne            62
	//    3    7:invokestatic    #144 <Method boolean Thread.interrupted()>
	//    4   10:ifne            62
	//    5   13:aload_0         
	//    6   14:invokespecial   #147 <Method void writeMessage()>
		  goto _L1
	//*   7   17:goto            0
_L3:
		int i;
		if(i >= pendingBuffers.size())
			break MISSING_BLOCK_LABEL_59;
	//    8   20:iload_1         
	//    9   21:aload_0         
	//   10   22:getfield        #88  <Field BlockingQueue pendingBuffers>
	//   11   25:invokeinterface #153 <Method int BlockingQueue.size()>
	//   12   30:icmpge          59
		writeMessage();
	//   13   33:aload_0         
	//   14   34:invokespecial   #147 <Method void writeMessage()>
		i++;
	//   15   37:iload_1         
	//   16   38:iconst_1        
	//   17   39:iadd            
	//   18   40:istore_1        
		continue; /* Loop/switch isn't completed */
	//   19   41:goto            20
		Object obj;
		obj;
	//   20   44:astore_2        
		handleError(new WebSocketException("IO Exception", ((Throwable) (obj))));
	//   21   45:aload_0         
	//   22   46:new             #155 <Class WebSocketException>
	//   23   49:dup             
	//   24   50:ldc1            #157 <String "IO Exception">
	//   25   52:aload_2         
	//   26   53:invokespecial   #160 <Method void WebSocketException(String, Throwable)>
	//   27   56:invokespecial   #162 <Method void handleError(WebSocketException)>
		return;
	//   28   59:return          
		obj;
	//   29   60:astore_2        
		return;
	//   30   61:return          
_L1:
		i = 0;
	//   31   62:iconst_0        
	//   32   63:istore_1        
		if(true) goto _L3; else goto _L2
	//   33   64:goto            20
_L2:
	}

	private void writeMessage()
		throws InterruptedException, IOException
	{
		ByteBuffer bytebuffer = (ByteBuffer)pendingBuffers.take();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field BlockingQueue pendingBuffers>
	//    2    4:invokeinterface #166 <Method Object BlockingQueue.take()>
	//    3    9:checkcast       #100 <Class ByteBuffer>
	//    4   12:astore_1        
		channel.write(bytebuffer);
	//    5   13:aload_0         
	//    6   14:getfield        #168 <Field WritableByteChannel channel>
	//    7   17:aload_1         
	//    8   18:invokeinterface #174 <Method int WritableByteChannel.write(ByteBuffer)>
	//    9   23:pop             
	//   10   24:return          
	}

	Thread getInnerThread()
	{
		return innerThread;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Thread innerThread>
	//    2    4:areturn         
	}

	void send(byte byte0, boolean flag, byte abyte0[])
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		abyte0 = ((byte []) (frameInBuffer(byte0, flag, abyte0)));
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:aload_3         
	//    6    6:invokespecial   #178 <Method ByteBuffer frameInBuffer(byte, boolean, byte[])>
	//    7    9:astore_3        
		if(!stop || !closeSent && byte0 == 8)
	//*   8   10:aload_0         
	//*   9   11:getfield        #32  <Field boolean stop>
	//*  10   14:ifeq            43
	//*  11   17:aload_0         
	//*  12   18:getfield        #34  <Field boolean closeSent>
	//*  13   21:ifne            33
	//*  14   24:iload_1         
	//*  15   25:bipush          8
	//*  16   27:icmpne          33
			break MISSING_BLOCK_LABEL_43;
	//   17   30:goto            43
		throw new WebSocketException("Shouldn't be sending");
	//   18   33:new             #155 <Class WebSocketException>
	//   19   36:dup             
	//   20   37:ldc1            #180 <String "Shouldn't be sending">
	//   21   39:invokespecial   #183 <Method void WebSocketException(String)>
	//   22   42:athrow          
		if(byte0 != 8)
			break MISSING_BLOCK_LABEL_54;
	//   23   43:iload_1         
	//   24   44:bipush          8
	//   25   46:icmpne          54
		closeSent = true;
	//   26   49:aload_0         
	//   27   50:iconst_1        
	//   28   51:putfield        #34  <Field boolean closeSent>
		pendingBuffers.add(((Object) (abyte0)));
	//   29   54:aload_0         
	//   30   55:getfield        #88  <Field BlockingQueue pendingBuffers>
	//   31   58:aload_3         
	//   32   59:invokeinterface #187 <Method boolean BlockingQueue.add(Object)>
	//   33   64:pop             
		this;
	//   34   65:aload_0         
		JVM INSTR monitorexit ;
	//   35   66:monitorexit     
		return;
	//   36   67:return          
		abyte0;
	//   37   68:astore_3        
	//*  38   69:aload_0         
		throw abyte0;
	//   39   70:monitorexit     
	//   40   71:aload_3         
	//   41   72:athrow          
	}

	void setOutput(OutputStream outputstream)
	{
		channel = Channels.newChannel(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #195 <Method WritableByteChannel Channels.newChannel(OutputStream)>
	//    3    5:putfield        #168 <Field WritableByteChannel channel>
	//    4    8:return          
	}

	void stopIt()
	{
		stop = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #32  <Field boolean stop>
	//    3    5:return          
	}

	private WritableByteChannel channel;
	private boolean closeSent;
	private final Thread innerThread = WebSocket.getThreadFactory().newThread(new Runnable() {

		public void run()
		{
			runWriter();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field WebSocketWriter this$0>
		//    2    4:invokestatic    #24  <Method void WebSocketWriter.access$000(WebSocketWriter)>
		//    3    7:return          
		}

		final WebSocketWriter this$0;

			
			{
				this$0 = WebSocketWriter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WebSocketWriter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
);
	private BlockingQueue pendingBuffers;
	private final Random random = new Random();
	private volatile boolean stop;
	private WebSocket websocket;


/*
	static void access$000(WebSocketWriter websocketwriter)
	{
		websocketwriter.runWriter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void runWriter()>
		return;
	//    2    4:return          
	}

*/
}
