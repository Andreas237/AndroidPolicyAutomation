// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.stetho.websocket:
//			SimpleSession, ReadHandler, WriteHandler, FrameHelper, 
//			SimpleEndpoint, WriteCallback, ReadCallback, Frame

class WebSocketSession
	implements SimpleSession
{

	public WebSocketSession(InputStream inputstream, OutputStream outputstream, SimpleEndpoint simpleendpoint)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mIsOpen = new AtomicBoolean(false);
	//    2    4:aload_0         
	//    3    5:new             #31  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #34  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #36  <Field AtomicBoolean mIsOpen>
	//    8   16:aload_0         
	//    9   17:new             #8   <Class WebSocketSession$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #39  <Method void WebSocketSession$1(WebSocketSession)>
	//   13   25:putfield        #41  <Field ReadCallback mReadCallback>
	//   14   28:aload_0         
	//   15   29:new             #10  <Class WebSocketSession$2>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #42  <Method void WebSocketSession$2(WebSocketSession)>
	//   19   37:putfield        #44  <Field WriteCallback mErrorForwardingWriteCallback>
		mReadHandler = new ReadHandler(inputstream, simpleendpoint);
	//   20   40:aload_0         
	//   21   41:new             #46  <Class ReadHandler>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:aload_3         
	//   25   47:invokespecial   #49  <Method void ReadHandler(InputStream, SimpleEndpoint)>
	//   26   50:putfield        #51  <Field ReadHandler mReadHandler>
		mWriteHandler = new WriteHandler(outputstream);
	//   27   53:aload_0         
	//   28   54:new             #53  <Class WriteHandler>
	//   29   57:dup             
	//   30   58:aload_2         
	//   31   59:invokespecial   #56  <Method void WriteHandler(OutputStream)>
	//   32   62:putfield        #58  <Field WriteHandler mWriteHandler>
		mEndpoint = simpleendpoint;
	//   33   65:aload_0         
	//   34   66:aload_3         
	//   35   67:putfield        #60  <Field SimpleEndpoint mEndpoint>
	//   36   70:return          
	}

	private void doWrite(Frame frame)
	{
		if(signalErrorIfNotOpen())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #89  <Method boolean signalErrorIfNotOpen()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mWriteHandler.write(frame, mErrorForwardingWriteCallback);
	//    4    8:aload_0         
	//    5    9:getfield        #58  <Field WriteHandler mWriteHandler>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field WriteCallback mErrorForwardingWriteCallback>
	//    9   17:invokevirtual   #93  <Method void WriteHandler.write(Frame, WriteCallback)>
			return;
	//   10   20:return          
		}
	}

	private void sendClose(int i, String s)
	{
		doWrite(FrameHelper.createCloseFrame(i, s));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #99  <Method Frame FrameHelper.createCloseFrame(int, String)>
	//    4    6:invokespecial   #83  <Method void doWrite(Frame)>
		markSentClose();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #102 <Method void markSentClose()>
	//    7   13:return          
	}

	private void signalError(IOException ioexception)
	{
		mEndpoint.onError(((SimpleSession) (this)), ((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SimpleEndpoint mEndpoint>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #108 <Method void SimpleEndpoint.onError(SimpleSession, Throwable)>
	//    5   11:return          
	}

	private boolean signalErrorIfNotOpen()
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #111 <Method boolean isOpen()>
	//*   2    4:ifne            22
		{
			signalError(new IOException("Session is closed"));
	//    3    7:aload_0         
	//    4    8:new             #113 <Class IOException>
	//    5   11:dup             
	//    6   12:ldc1            #115 <String "Session is closed">
	//    7   14:invokespecial   #118 <Method void IOException(String)>
	//    8   17:invokespecial   #67  <Method void signalError(IOException)>
			return true;
	//    9   20:iconst_1        
	//   10   21:ireturn         
		} else
		{
			return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		}
	}

	public void close(int i, String s)
	{
		sendClose(i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #77  <Method void sendClose(int, String)>
		markAndSignalClosed(i, s);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #122 <Method void markAndSignalClosed(int, String)>
	//    8   12:return          
	}

	public void handle()
		throws IOException
	{
		EOFException eofexception;
		markAndSignalOpen();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method void markAndSignalOpen()>
		try
		{
			mReadHandler.readLoop(mReadCallback);
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ReadHandler mReadHandler>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field ReadCallback mReadCallback>
	//    6   12:invokevirtual   #132 <Method void ReadHandler.readLoop(ReadCallback)>
			return;
	//    7   15:return          
		}
	//*   8   16:astore_1        
	//*   9   17:aload_0         
	//*  10   18:sipush          1006
	//*  11   21:aconst_null     
	//*  12   22:invokevirtual   #122 <Method void markAndSignalClosed(int, String)>
	//*  13   25:aload_1         
	//*  14   26:athrow          
	//*  15   27:aload_0         
	//*  16   28:sipush          1011
	//*  17   31:ldc1            #134 <String "EOF while reading">
	//*  18   33:invokevirtual   #122 <Method void markAndSignalClosed(int, String)>
	//*  19   36:return          
		// Misplaced declaration of an exception variable
		catch(EOFException eofexception)
		{
			markAndSignalClosed(1011, "EOF while reading");
		}
		catch(IOException ioexception)
		{
			markAndSignalClosed(1006, ((String) (null)));
			throw ioexception;
		}
	//*  20   37:astore_1        
	//*  21   38:goto            27
	}

	public boolean isOpen()
	{
		return mIsOpen.get();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AtomicBoolean mIsOpen>
	//    2    4:invokevirtual   #138 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	void markAndSignalClosed(int i, String s)
	{
		if(mIsOpen.getAndSet(false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field AtomicBoolean mIsOpen>
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #142 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifeq            23
			mEndpoint.onClose(((SimpleSession) (this)), i, s);
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field SimpleEndpoint mEndpoint>
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #146 <Method void SimpleEndpoint.onClose(SimpleSession, int, String)>
	//   11   23:return          
	}

	void markAndSignalOpen()
	{
		if(!mIsOpen.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field AtomicBoolean mIsOpen>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #142 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            21
			mEndpoint.onOpen(((SimpleSession) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field SimpleEndpoint mEndpoint>
	//    7   15:aload_0         
	//    8   16:invokeinterface #150 <Method void SimpleEndpoint.onOpen(SimpleSession)>
	//    9   21:return          
	}

	void markSentClose()
	{
		mSentClose = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #71  <Field boolean mSentClose>
	//    3    5:return          
	}

	public void sendBinary(byte abyte0[])
	{
		doWrite(FrameHelper.createBinaryFrame(abyte0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #156 <Method Frame FrameHelper.createBinaryFrame(byte[])>
	//    3    5:invokespecial   #83  <Method void doWrite(Frame)>
	//    4    8:return          
	}

	public void sendText(String s)
	{
		doWrite(FrameHelper.createTextFrame(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #161 <Method Frame FrameHelper.createTextFrame(String)>
	//    3    5:invokespecial   #83  <Method void doWrite(Frame)>
	//    4    8:return          
	}

	private final SimpleEndpoint mEndpoint;
	private final WriteCallback mErrorForwardingWriteCallback = new WriteCallback() {

		public void onFailure(IOException ioexception)
		{
			signalError(ioexception);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field WebSocketSession this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #24  <Method void WebSocketSession.access$000(WebSocketSession, IOException)>
		//    4    8:return          
		}

		public void onSuccess()
		{
		//    0    0:return          
		}

		final WebSocketSession this$0;

			
			{
				this$0 = WebSocketSession.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WebSocketSession this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private AtomicBoolean mIsOpen;
	private final ReadCallback mReadCallback = new ReadCallback() {

		private void handleBinaryFrame(byte abyte0[], int i)
		{
			mEndpoint.onMessage(((SimpleSession) (WebSocketSession.this)), abyte0, i);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field WebSocketSession this$0>
		//    2    4:invokestatic    #24  <Method SimpleEndpoint WebSocketSession.access$400(WebSocketSession)>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field WebSocketSession this$0>
		//    5   11:aload_1         
		//    6   12:iload_2         
		//    7   13:invokeinterface #30  <Method void SimpleEndpoint.onMessage(SimpleSession, byte[], int)>
		//    8   18:return          
		}

		private void handleClose(byte abyte0[], int i)
		{
			if(i >= 2)
		//*   0    0:iload_2         
		//*   1    1:iconst_2        
		//*   2    2:icmplt          54
			{
				int j = (abyte0[0] & 0xff) << 8 | abyte0[1] & 0xff;
		//    3    5:aload_1         
		//    4    6:iconst_0        
		//    5    7:baload          
		//    6    8:sipush          255
		//    7   11:iand            
		//    8   12:bipush          8
		//    9   14:ishl            
		//   10   15:aload_1         
		//   11   16:iconst_1        
		//   12   17:baload          
		//   13   18:sipush          255
		//   14   21:iand            
		//   15   22:ior             
		//   16   23:istore_3        
				if(i > 2)
		//*  17   24:iload_2         
		//*  18   25:iconst_2        
		//*  19   26:icmple          47
				{
					abyte0 = ((byte []) (new String(abyte0, 2, i - 2)));
		//   20   29:new             #33  <Class String>
		//   21   32:dup             
		//   22   33:aload_1         
		//   23   34:iconst_2        
		//   24   35:iload_2         
		//   25   36:iconst_2        
		//   26   37:isub            
		//   27   38:invokespecial   #36  <Method void String(byte[], int, int)>
		//   28   41:astore_1        
					i = j;
		//   29   42:iload_3         
		//   30   43:istore_2        
				} else
		//*  31   44:goto            61
				{
					abyte0 = null;
		//   32   47:aconst_null     
		//   33   48:astore_1        
					i = j;
		//   34   49:iload_3         
		//   35   50:istore_2        
				}
			} else
		//*  36   51:goto            61
			{
				i = 1006;
		//   37   54:sipush          1006
		//   38   57:istore_2        
				abyte0 = "Unparseable close frame";
		//   39   58:ldc1            #38  <String "Unparseable close frame">
		//   40   60:astore_1        
			}
			if(!mSentClose)
		//*  41   61:aload_0         
		//*  42   62:getfield        #14  <Field WebSocketSession this$0>
		//*  43   65:invokestatic    #42  <Method boolean WebSocketSession.access$100(WebSocketSession)>
		//*  44   68:ifne            83
				sendClose(1000, "Received close frame");
		//   45   71:aload_0         
		//   46   72:getfield        #14  <Field WebSocketSession this$0>
		//   47   75:sipush          1000
		//   48   78:ldc1            #44  <String "Received close frame">
		//   49   80:invokestatic    #48  <Method void WebSocketSession.access$200(WebSocketSession, int, String)>
			markAndSignalClosed(i, ((String) (abyte0)));
		//   50   83:aload_0         
		//   51   84:getfield        #14  <Field WebSocketSession this$0>
		//   52   87:iload_2         
		//   53   88:aload_1         
		//   54   89:invokevirtual   #52  <Method void WebSocketSession.markAndSignalClosed(int, String)>
		//   55   92:return          
		}

		private void handlePing(byte abyte0[], int i)
		{
			doWrite(FrameHelper.createPongFrame(abyte0, i));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field WebSocketSession this$0>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #59  <Method Frame FrameHelper.createPongFrame(byte[], int)>
		//    5    9:invokestatic    #63  <Method void WebSocketSession.access$300(WebSocketSession, Frame)>
		//    6   12:return          
		}

		private void handlePong(byte abyte0[], int i)
		{
		//    0    0:return          
		}

		private void handleTextFrame(byte abyte0[], int i)
		{
			mEndpoint.onMessage(((SimpleSession) (WebSocketSession.this)), new String(abyte0, 0, i));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field WebSocketSession this$0>
		//    2    4:invokestatic    #24  <Method SimpleEndpoint WebSocketSession.access$400(WebSocketSession)>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field WebSocketSession this$0>
		//    5   11:new             #33  <Class String>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:iconst_0        
		//    9   17:iload_2         
		//   10   18:invokespecial   #36  <Method void String(byte[], int, int)>
		//   11   21:invokeinterface #68  <Method void SimpleEndpoint.onMessage(SimpleSession, String)>
		//   12   26:return          
		}

		public void onCompleteFrame(byte byte0, byte abyte0[], int i)
		{
			switch(byte0)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     1 2: default 24
		//		               1 126
		//		               2 119
			default:
				switch(byte0)
		//*   2   24:iload_1         
				{
		//*   3   25:tableswitch     8 10: default 52
		//		               8 112
		//		               9 105
		//		               10 98
				default:
					abyte0 = ((byte []) (WebSocketSession.this));
		//    4   52:aload_0         
		//    5   53:getfield        #14  <Field WebSocketSession this$0>
		//    6   56:astore_2        
					StringBuilder stringbuilder = new StringBuilder();
		//    7   57:new             #72  <Class StringBuilder>
		//    8   60:dup             
		//    9   61:invokespecial   #73  <Method void StringBuilder()>
		//   10   64:astore          4
					stringbuilder.append("Unsupported frame opcode=");
		//   11   66:aload           4
		//   12   68:ldc1            #75  <String "Unsupported frame opcode=">
		//   13   70:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   14   73:pop             
					stringbuilder.append(((int) (byte0)));
		//   15   74:aload           4
		//   16   76:iload_1         
		//   17   77:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
		//   18   80:pop             
					((WebSocketSession) (abyte0)).signalError(new IOException(stringbuilder.toString()));
		//   19   81:aload_2         
		//   20   82:new             #84  <Class IOException>
		//   21   85:dup             
		//   22   86:aload           4
		//   23   88:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   24   91:invokespecial   #91  <Method void IOException(String)>
		//   25   94:invokestatic    #95  <Method void WebSocketSession.access$000(WebSocketSession, IOException)>
					return;
		//   26   97:return          

				case 10: // '\n'
					handlePong(abyte0, i);
		//   27   98:aload_0         
		//   28   99:aload_2         
		//   29  100:iload_3         
		//   30  101:invokespecial   #97  <Method void handlePong(byte[], int)>
					return;
		//   31  104:return          

				case 9: // '\t'
					handlePing(abyte0, i);
		//   32  105:aload_0         
		//   33  106:aload_2         
		//   34  107:iload_3         
		//   35  108:invokespecial   #99  <Method void handlePing(byte[], int)>
					return;
		//   36  111:return          

				case 8: // '\b'
					handleClose(abyte0, i);
		//   37  112:aload_0         
		//   38  113:aload_2         
		//   39  114:iload_3         
		//   40  115:invokespecial   #101 <Method void handleClose(byte[], int)>
					return;
		//   41  118:return          
				}

			case 2: // '\002'
				handleBinaryFrame(abyte0, i);
		//   42  119:aload_0         
		//   43  120:aload_2         
		//   44  121:iload_3         
		//   45  122:invokespecial   #103 <Method void handleBinaryFrame(byte[], int)>
				return;
		//   46  125:return          

			case 1: // '\001'
				handleTextFrame(abyte0, i);
		//   47  126:aload_0         
		//   48  127:aload_2         
		//   49  128:iload_3         
		//   50  129:invokespecial   #105 <Method void handleTextFrame(byte[], int)>
				return;
		//   51  132:return          
			}
		}

		final WebSocketSession this$0;

			
			{
				this$0 = WebSocketSession.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WebSocketSession this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final ReadHandler mReadHandler;
	private volatile boolean mSentClose;
	private final WriteHandler mWriteHandler;


/*
	static void access$000(WebSocketSession websocketsession, IOException ioexception)
	{
		websocketsession.signalError(ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void signalError(IOException)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$100(WebSocketSession websocketsession)
	{
		return websocketsession.mSentClose;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean mSentClose>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(WebSocketSession websocketsession, int i, String s)
	{
		websocketsession.sendClose(i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #77  <Method void sendClose(int, String)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$300(WebSocketSession websocketsession, Frame frame)
	{
		websocketsession.doWrite(frame);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void doWrite(Frame)>
		return;
	//    3    5:return          
	}

*/


/*
	static SimpleEndpoint access$400(WebSocketSession websocketsession)
	{
		return websocketsession.mEndpoint;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SimpleEndpoint mEndpoint>
	//    2    4:areturn         
	}

*/
}
