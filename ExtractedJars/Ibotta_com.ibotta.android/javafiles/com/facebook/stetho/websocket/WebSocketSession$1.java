// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import java.io.IOException;

// Referenced classes of package com.facebook.stetho.websocket:
//			ReadCallback, WebSocketSession, SimpleEndpoint, FrameHelper

class WebSocketSession$1
	implements ReadCallback
{

	private void handleBinaryFrame(byte abyte0[], int i)
	{
		WebSocketSession.access$400(WebSocketSession.this).onMessage(((SimpleSession) (WebSocketSession.this)), abyte0, i);
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
		if(!WebSocketSession.access$100(WebSocketSession.this))
	//*  41   61:aload_0         
	//*  42   62:getfield        #14  <Field WebSocketSession this$0>
	//*  43   65:invokestatic    #42  <Method boolean WebSocketSession.access$100(WebSocketSession)>
	//*  44   68:ifne            83
			WebSocketSession.access$200(WebSocketSession.this, 1000, "Received close frame");
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
		WebSocketSession.access$300(WebSocketSession.this, FrameHelper.createPongFrame(abyte0, i));
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
		WebSocketSession.access$400(WebSocketSession.this).onMessage(((SimpleSession) (WebSocketSession.this)), new String(abyte0, 0, i));
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
	//	               1 126
	//	               2 119
		default:
			switch(byte0)
	//*   2   24:iload_1         
			{
	//*   3   25:tableswitch     8 10: default 52
	//	               8 112
	//	               9 105
	//	               10 98
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
				WebSocketSession.access$000(((WebSocketSession) (abyte0)), new IOException(stringbuilder.toString()));
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

	WebSocketSession$1()
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
