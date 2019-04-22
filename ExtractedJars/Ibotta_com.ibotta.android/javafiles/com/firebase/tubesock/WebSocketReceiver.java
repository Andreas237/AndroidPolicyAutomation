// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

// Referenced classes of package com.firebase.tubesock:
//			WebSocketException, MessageBuilderFactory, WebSocketEventHandler, WebSocket

class WebSocketReceiver
{

	WebSocketReceiver(WebSocket websocket1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		input = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field DataInputStream input>
		websocket = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field WebSocket websocket>
		eventHandler = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #27  <Field WebSocketEventHandler eventHandler>
		inputHeader = new byte[112];
	//   11   19:aload_0         
	//   12   20:bipush          112
	//   13   22:newarray        byte[]
	//   14   24:putfield        #29  <Field byte[] inputHeader>
		stop = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #31  <Field boolean stop>
		websocket = websocket1;
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:putfield        #25  <Field WebSocket websocket>
	//   21   37:return          
	}

	private void appendBytes(boolean flag, byte byte0, byte abyte0[])
	{
		if(byte0 == 9)
	//*   0    0:iload_2         
	//*   1    1:bipush          9
	//*   2    3:icmpne          26
			if(flag)
	//*   3    6:iload_1         
	//*   4    7:ifeq            16
			{
				handlePing(abyte0);
	//    5   10:aload_0         
	//    6   11:aload_3         
	//    7   12:invokespecial   #38  <Method void handlePing(byte[])>
				return;
	//    8   15:return          
			} else
			{
				throw new WebSocketException("PING must not fragment across frames");
	//    9   16:new             #40  <Class WebSocketException>
	//   10   19:dup             
	//   11   20:ldc1            #42  <String "PING must not fragment across frames">
	//   12   22:invokespecial   #45  <Method void WebSocketException(String)>
	//   13   25:athrow          
			}
		if(pendingBuilder != null && byte0 != 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
	//*  16   30:ifnull          50
	//*  17   33:iload_2         
	//*  18   34:ifne            40
	//*  19   37:goto            50
			throw new WebSocketException("Failed to continue outstanding frame");
	//   20   40:new             #40  <Class WebSocketException>
	//   21   43:dup             
	//   22   44:ldc1            #49  <String "Failed to continue outstanding frame">
	//   23   46:invokespecial   #45  <Method void WebSocketException(String)>
	//   24   49:athrow          
		if(pendingBuilder == null && byte0 == 0)
	//*  25   50:aload_0         
	//*  26   51:getfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
	//*  27   54:ifnonnull       74
	//*  28   57:iload_2         
	//*  29   58:ifeq            64
	//*  30   61:goto            74
			throw new WebSocketException("Received continuing frame, but there's nothing to continue");
	//   31   64:new             #40  <Class WebSocketException>
	//   32   67:dup             
	//   33   68:ldc1            #51  <String "Received continuing frame, but there's nothing to continue">
	//   34   70:invokespecial   #45  <Method void WebSocketException(String)>
	//   35   73:athrow          
		if(pendingBuilder == null)
	//*  36   74:aload_0         
	//*  37   75:getfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
	//*  38   78:ifnonnull       89
			pendingBuilder = MessageBuilderFactory.builder(byte0);
	//   39   81:aload_0         
	//   40   82:iload_2         
	//   41   83:invokestatic    #57  <Method MessageBuilderFactory$Builder MessageBuilderFactory.builder(byte)>
	//   42   86:putfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
		if(pendingBuilder.appendBytes(abyte0))
	//*  43   89:aload_0         
	//*  44   90:getfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
	//*  45   93:aload_3         
	//*  46   94:invokeinterface #62  <Method boolean MessageBuilderFactory$Builder.appendBytes(byte[])>
	//*  47   99:ifeq            147
		{
			if(flag)
	//*  48  102:iload_1         
	//*  49  103:ifeq            146
			{
				abyte0 = ((byte []) (pendingBuilder.toMessage()));
	//   50  106:aload_0         
	//   51  107:getfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
	//   52  110:invokeinterface #66  <Method WebSocketMessage MessageBuilderFactory$Builder.toMessage()>
	//   53  115:astore_3        
				pendingBuilder = null;
	//   54  116:aload_0         
	//   55  117:aconst_null     
	//   56  118:putfield        #47  <Field MessageBuilderFactory$Builder pendingBuilder>
				if(abyte0 != null)
	//*  57  121:aload_3         
	//*  58  122:ifnull          136
				{
					eventHandler.onMessage(((WebSocketMessage) (abyte0)));
	//   59  125:aload_0         
	//   60  126:getfield        #27  <Field WebSocketEventHandler eventHandler>
	//   61  129:aload_3         
	//   62  130:invokeinterface #72  <Method void WebSocketEventHandler.onMessage(WebSocketMessage)>
					return;
	//   63  135:return          
				} else
				{
					throw new WebSocketException("Failed to decode whole message");
	//   64  136:new             #40  <Class WebSocketException>
	//   65  139:dup             
	//   66  140:ldc1            #74  <String "Failed to decode whole message">
	//   67  142:invokespecial   #45  <Method void WebSocketException(String)>
	//   68  145:athrow          
				}
			} else
			{
				return;
	//   69  146:return          
			}
		} else
		{
			throw new WebSocketException("Failed to decode frame");
	//   70  147:new             #40  <Class WebSocketException>
	//   71  150:dup             
	//   72  151:ldc1            #76  <String "Failed to decode frame">
	//   73  153:invokespecial   #45  <Method void WebSocketException(String)>
	//   74  156:athrow          
		}
	}

	private void handleError(WebSocketException websocketexception)
	{
		stopit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method void stopit()>
		websocket.handleReceiverError(websocketexception);
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field WebSocket websocket>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #86  <Method void WebSocket.handleReceiverError(WebSocketException)>
	//    6   12:return          
	}

	private void handlePing(byte abyte0[])
	{
		if(abyte0.length <= 125)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:bipush          125
	//*   3    4:icmpgt          16
		{
			websocket.pong(abyte0);
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field WebSocket websocket>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #89  <Method void WebSocket.pong(byte[])>
			return;
	//    8   15:return          
		} else
		{
			throw new WebSocketException("PING frame too long");
	//    9   16:new             #40  <Class WebSocketException>
	//   10   19:dup             
	//   11   20:ldc1            #91  <String "PING frame too long">
	//   12   22:invokespecial   #45  <Method void WebSocketException(String)>
	//   13   25:athrow          
		}
	}

	private long parseLong(byte abyte0[], int i)
	{
		return ((long)abyte0[i + 0] << 56) + ((long)(abyte0[i + 1] & 0xff) << 48) + ((long)(abyte0[i + 2] & 0xff) << 40) + ((long)(abyte0[i + 3] & 0xff) << 32) + ((long)(abyte0[i + 4] & 0xff) << 24) + (long)((abyte0[i + 5] & 0xff) << 16) + (long)((abyte0[i + 6] & 0xff) << 8) + (long)((abyte0[i + 7] & 0xff) << 0);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_0        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:i2l             
	//    6    6:bipush          56
	//    7    8:lshl            
	//    8    9:aload_1         
	//    9   10:iload_2         
	//   10   11:iconst_1        
	//   11   12:iadd            
	//   12   13:baload          
	//   13   14:sipush          255
	//   14   17:iand            
	//   15   18:i2l             
	//   16   19:bipush          48
	//   17   21:lshl            
	//   18   22:ladd            
	//   19   23:aload_1         
	//   20   24:iload_2         
	//   21   25:iconst_2        
	//   22   26:iadd            
	//   23   27:baload          
	//   24   28:sipush          255
	//   25   31:iand            
	//   26   32:i2l             
	//   27   33:bipush          40
	//   28   35:lshl            
	//   29   36:ladd            
	//   30   37:aload_1         
	//   31   38:iload_2         
	//   32   39:iconst_3        
	//   33   40:iadd            
	//   34   41:baload          
	//   35   42:sipush          255
	//   36   45:iand            
	//   37   46:i2l             
	//   38   47:bipush          32
	//   39   49:lshl            
	//   40   50:ladd            
	//   41   51:aload_1         
	//   42   52:iload_2         
	//   43   53:iconst_4        
	//   44   54:iadd            
	//   45   55:baload          
	//   46   56:sipush          255
	//   47   59:iand            
	//   48   60:i2l             
	//   49   61:bipush          24
	//   50   63:lshl            
	//   51   64:ladd            
	//   52   65:aload_1         
	//   53   66:iload_2         
	//   54   67:iconst_5        
	//   55   68:iadd            
	//   56   69:baload          
	//   57   70:sipush          255
	//   58   73:iand            
	//   59   74:bipush          16
	//   60   76:ishl            
	//   61   77:i2l             
	//   62   78:ladd            
	//   63   79:aload_1         
	//   64   80:iload_2         
	//   65   81:bipush          6
	//   66   83:iadd            
	//   67   84:baload          
	//   68   85:sipush          255
	//   69   88:iand            
	//   70   89:bipush          8
	//   71   91:ishl            
	//   72   92:i2l             
	//   73   93:ladd            
	//   74   94:aload_1         
	//   75   95:iload_2         
	//   76   96:bipush          7
	//   77   98:iadd            
	//   78   99:baload          
	//   79  100:sipush          255
	//   80  103:iand            
	//   81  104:iconst_0        
	//   82  105:ishl            
	//   83  106:i2l             
	//   84  107:ladd            
	//   85  108:lreturn         
	}

	private int read(byte abyte0[], int i, int j)
		throws IOException
	{
		input.readFully(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DataInputStream input>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #103 <Method void DataInputStream.readFully(byte[], int, int)>
		return j;
	//    6   10:iload_3         
	//    7   11:ireturn         
	}

	boolean isRunning()
	{
		return stop ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean stop>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	void run()
	{
		eventHandler = websocket.getEventHandler();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field WebSocket websocket>
	//    3    5:invokevirtual   #113 <Method WebSocketEventHandler WebSocket.getEventHandler()>
	//    4    8:putfield        #27  <Field WebSocketEventHandler eventHandler>
_L5:
		if(stop) goto _L2; else goto _L1
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field boolean stop>
	//    7   15:ifne            326
_L1:
		int j = read(inputHeader, 0, 1) + 0;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field byte[] inputHeader>
	//   11   23:iconst_0        
	//   12   24:iconst_1        
	//   13   25:invokespecial   #115 <Method int read(byte[], int, int)>
	//   14   28:iconst_0        
	//   15   29:iadd            
	//   16   30:istore_3        
		byte byte0;
		int i;
		boolean flag;
		long l;
		byte abyte0[];
		if((inputHeader[0] & 0x80) != 0)
	//*  17   31:aload_0         
	//*  18   32:getfield        #29  <Field byte[] inputHeader>
	//*  19   35:iconst_0        
	//*  20   36:baload          
	//*  21   37:sipush          128
	//*  22   40:iand            
	//*  23   41:ifeq            332
			flag = true;
	//   24   44:iconst_1        
	//   25   45:istore          4
		else
	//*  26   47:goto            50
	//*  27   50:aload_0         
	//*  28   51:getfield        #29  <Field byte[] inputHeader>
	//*  29   54:iconst_0        
	//*  30   55:baload          
	//*  31   56:bipush          112
	//*  32   58:iand            
	//*  33   59:ifeq            338
	//*  34   62:iconst_1        
	//*  35   63:istore_2        
	//*  36   64:goto            67
	//*  37   67:iload_2         
	//*  38   68:ifne            282
	//*  39   71:aload_0         
	//*  40   72:getfield        #29  <Field byte[] inputHeader>
	//*  41   75:iconst_0        
	//*  42   76:baload          
	//*  43   77:bipush          15
	//*  44   79:iand            
	//*  45   80:int2byte        
	//*  46   81:istore_1        
	//*  47   82:iload_3         
	//*  48   83:aload_0         
	//*  49   84:aload_0         
	//*  50   85:getfield        #29  <Field byte[] inputHeader>
	//*  51   88:iload_3         
	//*  52   89:iconst_1        
	//*  53   90:invokespecial   #115 <Method int read(byte[], int, int)>
	//*  54   93:iadd            
	//*  55   94:istore_2        
	//*  56   95:aload_0         
	//*  57   96:getfield        #29  <Field byte[] inputHeader>
	//*  58   99:iconst_1        
	//*  59  100:baload          
	//*  60  101:istore_3        
	//*  61  102:lconst_0        
	//*  62  103:lstore          5
	//*  63  105:iload_3         
	//*  64  106:bipush          126
	//*  65  108:icmpge          118
	//*  66  111:iload_3         
	//*  67  112:i2l             
	//*  68  113:lstore          5
	//*  69  115:goto            199
	//*  70  118:iload_3         
	//*  71  119:bipush          126
	//*  72  121:icmpne          165
	//*  73  124:aload_0         
	//*  74  125:aload_0         
	//*  75  126:getfield        #29  <Field byte[] inputHeader>
	//*  76  129:iload_2         
	//*  77  130:iconst_2        
	//*  78  131:invokespecial   #115 <Method int read(byte[], int, int)>
	//*  79  134:pop             
	//*  80  135:aload_0         
	//*  81  136:getfield        #29  <Field byte[] inputHeader>
	//*  82  139:iconst_2        
	//*  83  140:baload          
	//*  84  141:sipush          255
	//*  85  144:iand            
	//*  86  145:bipush          8
	//*  87  147:ishl            
	//*  88  148:aload_0         
	//*  89  149:getfield        #29  <Field byte[] inputHeader>
	//*  90  152:iconst_3        
	//*  91  153:baload          
	//*  92  154:sipush          255
	//*  93  157:iand            
	//*  94  158:ior             
	//*  95  159:i2l             
	//*  96  160:lstore          5
	//*  97  162:goto            199
	//*  98  165:iload_3         
	//*  99  166:bipush          127
	//* 100  168:icmpne          199
	//* 101  171:aload_0         
	//* 102  172:aload_0         
	//* 103  173:getfield        #29  <Field byte[] inputHeader>
	//* 104  176:iload_2         
	//* 105  177:bipush          8
	//* 106  179:invokespecial   #115 <Method int read(byte[], int, int)>
	//* 107  182:istore_3        
	//* 108  183:aload_0         
	//* 109  184:aload_0         
	//* 110  185:getfield        #29  <Field byte[] inputHeader>
	//* 111  188:iload_2         
	//* 112  189:iload_3         
	//* 113  190:iadd            
	//* 114  191:bipush          8
	//* 115  193:isub            
	//* 116  194:invokespecial   #117 <Method long parseLong(byte[], int)>
	//* 117  197:lstore          5
	//* 118  199:lload           5
	//* 119  201:l2i             
	//* 120  202:istore_2        
	//* 121  203:iload_2         
	//* 122  204:newarray        byte[]
	//* 123  206:astore          7
	//* 124  208:aload_0         
	//* 125  209:aload           7
	//* 126  211:iconst_0        
	//* 127  212:iload_2         
	//* 128  213:invokespecial   #115 <Method int read(byte[], int, int)>
	//* 129  216:pop             
	//* 130  217:iload_1         
	//* 131  218:bipush          8
	//* 132  220:icmpne          343
	//* 133  223:aload_0         
	//* 134  224:getfield        #25  <Field WebSocket websocket>
	//* 135  227:invokevirtual   #120 <Method void WebSocket.onCloseOpReceived()>
	//* 136  230:goto            11
	//* 137  233:new             #122 <Class StringBuilder>
	//* 138  236:dup             
	//* 139  237:invokespecial   #123 <Method void StringBuilder()>
	//* 140  240:astore          7
	//* 141  242:aload           7
	//* 142  244:ldc1            #125 <String "Unsupported opcode: ">
	//* 143  246:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//* 144  249:pop             
	//* 145  250:aload           7
	//* 146  252:iload_1         
	//* 147  253:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//* 148  256:pop             
	//* 149  257:new             #40  <Class WebSocketException>
	//* 150  260:dup             
	//* 151  261:aload           7
	//* 152  263:invokevirtual   #136 <Method String StringBuilder.toString()>
	//* 153  266:invokespecial   #45  <Method void WebSocketException(String)>
	//* 154  269:athrow          
	//* 155  270:aload_0         
	//* 156  271:iload           4
	//* 157  273:iload_1         
	//* 158  274:aload           7
	//* 159  276:invokespecial   #138 <Method void appendBytes(boolean, byte, byte[])>
	//* 160  279:goto            11
	//* 161  282:new             #40  <Class WebSocketException>
	//* 162  285:dup             
	//* 163  286:ldc1            #140 <String "Invalid frame received">
	//* 164  288:invokespecial   #45  <Method void WebSocketException(String)>
	//* 165  291:athrow          
	//* 166  292:astore          7
	//* 167  294:aload_0         
	//* 168  295:aload           7
	//* 169  297:invokespecial   #142 <Method void handleError(WebSocketException)>
	//* 170  300:goto            11
	//* 171  303:astore          7
	//* 172  305:aload_0         
	//* 173  306:new             #40  <Class WebSocketException>
	//* 174  309:dup             
	//* 175  310:ldc1            #144 <String "IO Error">
	//* 176  312:aload           7
	//* 177  314:invokespecial   #147 <Method void WebSocketException(String, Throwable)>
	//* 178  317:invokespecial   #142 <Method void handleError(WebSocketException)>
	//* 179  320:goto            11
	//* 180  323:goto            11
	//* 181  326:return          
	//* 182  327:astore          7
	//* 183  329:goto            323
			flag = false;
	//  184  332:iconst_0        
	//  185  333:istore          4
		if((inputHeader[0] & 0x70) != 0)
			i = 1;
		else
	//* 186  335:goto            50
			i = 0;
	//  187  338:iconst_0        
	//  188  339:istore_2        
		if(i != 0) goto _L4; else goto _L3
_L3:
		byte0 = (byte)(inputHeader[0] & 0xf);
		i = j + read(inputHeader, j, 1);
		j = ((int) (inputHeader[1]));
		l = 0L;
		if(j < 126)
		{
			l = j;
			break MISSING_BLOCK_LABEL_199;
		}
		if(j != 126)
			break MISSING_BLOCK_LABEL_165;
		read(inputHeader, i, 2);
		l = (inputHeader[2] & 0xff) << 8 | inputHeader[3] & 0xff;
		break MISSING_BLOCK_LABEL_199;
		if(j != 127)
			break MISSING_BLOCK_LABEL_199;
		int k = read(inputHeader, i, 8);
		l = parseLong(inputHeader, (i + k) - 8);
		i = (int)l;
		abyte0 = new byte[i];
		read(abyte0, 0, i);
		if(byte0 != 8)
			continue; /* Loop/switch isn't completed */
		try
		{
			websocket.onCloseOpReceived();
		}
		catch(SocketTimeoutException sockettimeoutexception) { }
		catch(IOException ioexception)
		{
			handleError(new WebSocketException("IO Error", ((Throwable) (ioexception))));
		}
		catch(WebSocketException websocketexception)
		{
			handleError(websocketexception);
		}
		  goto _L5
_L8:
		abyte0 = ((byte []) (new StringBuilder()));
		((StringBuilder) (abyte0)).append("Unsupported opcode: ");
		((StringBuilder) (abyte0)).append(((int) (byte0)));
		throw new WebSocketException(((StringBuilder) (abyte0)).toString());
_L7:
		appendBytes(flag, byte0, abyte0);
		  goto _L5
_L4:
		throw new WebSocketException("Invalid frame received");
_L2:
		return;
	//* 189  340:goto            67
		if(byte0 != 10) goto _L6; else goto _L5
	//  190  343:iload_1         
	//  191  344:bipush          10
	//  192  346:icmpne          352
	//* 193  349:goto            11
_L6:
		if(byte0 != 1 && byte0 != 2 && byte0 != 9 && byte0 != 0) goto _L8; else goto _L7
	//  194  352:iload_1         
	//  195  353:iconst_1        
	//  196  354:icmpeq          270
	//  197  357:iload_1         
	//  198  358:iconst_2        
	//  199  359:icmpeq          270
	//  200  362:iload_1         
	//  201  363:bipush          9
	//  202  365:icmpeq          270
	//  203  368:iload_1         
	//  204  369:ifne            233
	//* 205  372:goto            270
	}

	void setInput(DataInputStream datainputstream)
	{
		input = datainputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field DataInputStream input>
	//    3    5:return          
	}

	void stopit()
	{
		stop = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #31  <Field boolean stop>
	//    3    5:return          
	}

	private WebSocketEventHandler eventHandler;
	private DataInputStream input;
	private byte inputHeader[];
	private MessageBuilderFactory.Builder pendingBuilder;
	private volatile boolean stop;
	private WebSocket websocket;
}
