// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.firebase.tubesock:
//			WebSocketMessage

class MessageBuilderFactory
{
	static class BinaryBuilder
		implements Builder
	{

		public boolean appendBytes(byte abyte0[])
		{
			pendingBytes.add(((Object) (abyte0)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List pendingBytes>
		//    2    4:aload_1         
		//    3    5:invokeinterface #34  <Method boolean List.add(Object)>
		//    4   10:pop             
			pendingByteCount = pendingByteCount + abyte0.length;
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field int pendingByteCount>
		//    8   16:aload_1         
		//    9   17:arraylength     
		//   10   18:iadd            
		//   11   19:putfield        #20  <Field int pendingByteCount>
			return true;
		//   12   22:iconst_1        
		//   13   23:ireturn         
		}

		public WebSocketMessage toMessage()
		{
			byte abyte0[] = new byte[pendingByteCount];
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int pendingByteCount>
		//    2    4:newarray        byte[]
		//    3    6:astore_3        
			int i = 0;
		//    4    7:iconst_0        
		//    5    8:istore_1        
			int j = 0;
		//    6    9:iconst_0        
		//    7   10:istore_2        
			for(; i < pendingBytes.size(); i++)
		//*   8   11:iload_1         
		//*   9   12:aload_0         
		//*  10   13:getfield        #25  <Field List pendingBytes>
		//*  11   16:invokeinterface #40  <Method int List.size()>
		//*  12   21:icmpge          63
			{
				byte abyte1[] = (byte[])pendingBytes.get(i);
		//   13   24:aload_0         
		//   14   25:getfield        #25  <Field List pendingBytes>
		//   15   28:iload_1         
		//   16   29:invokeinterface #44  <Method Object List.get(int)>
		//   17   34:checkcast       #46  <Class byte[]>
		//   18   37:astore          4
				System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), j, abyte1.length);
		//   19   39:aload           4
		//   20   41:iconst_0        
		//   21   42:aload_3         
		//   22   43:iload_2         
		//   23   44:aload           4
		//   24   46:arraylength     
		//   25   47:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
				j += abyte1.length;
		//   26   50:iload_2         
		//   27   51:aload           4
		//   28   53:arraylength     
		//   29   54:iadd            
		//   30   55:istore_2        
			}

		//   31   56:iload_1         
		//   32   57:iconst_1        
		//   33   58:iadd            
		//   34   59:istore_1        
		//*  35   60:goto            11
			return new WebSocketMessage(abyte0);
		//   36   63:new             #54  <Class WebSocketMessage>
		//   37   66:dup             
		//   38   67:aload_3         
		//   39   68:invokespecial   #57  <Method void WebSocketMessage(byte[])>
		//   40   71:areturn         
		}

		private int pendingByteCount;
		private List pendingBytes;

		BinaryBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			pendingByteCount = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field int pendingByteCount>
			pendingBytes = ((List) (new ArrayList()));
		//    5    9:aload_0         
		//    6   10:new             #22  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #23  <Method void ArrayList()>
		//    9   17:putfield        #25  <Field List pendingBytes>
		//   10   20:return          
		}
	}

	static interface Builder
	{

		public abstract boolean appendBytes(byte abyte0[]);

		public abstract WebSocketMessage toMessage();
	}

	static class TextBuilder
		implements Builder
	{

		private String decodeString(byte abyte0[])
		{
			try
			{
				abyte0 = ((byte []) (ByteBuffer.wrap(abyte0)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #49  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    2    4:astore_1        
				abyte0 = ((byte []) (((CharsetDecoder)localDecoder.get()).decode(((ByteBuffer) (abyte0))).toString()));
		//    3    5:getstatic       #29  <Field ThreadLocal localDecoder>
		//    4    8:invokevirtual   #55  <Method Object ThreadLocal.get()>
		//    5   11:checkcast       #57  <Class CharsetDecoder>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #61  <Method CharBuffer CharsetDecoder.decode(ByteBuffer)>
		//    8   18:invokevirtual   #67  <Method String CharBuffer.toString()>
		//    9   21:astore_1        
			}
		//*  10   22:aload_1         
		//*  11   23:areturn         
		//*  12   24:aconst_null     
		//*  13   25:areturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				return null;
			}
			return ((String) (abyte0));
		//*  14   26:astore_1        
		//*  15   27:goto            24
		}

		private String decodeStringStreaming(byte abyte0[])
		{
			int i;
			ByteBuffer bytebuffer;
			bytebuffer = getBuffer(abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #71  <Method ByteBuffer getBuffer(byte[])>
		//    3    5:astore          4
			i = (int)((float)bytebuffer.remaining() * ((CharsetDecoder)localDecoder.get()).averageCharsPerByte());
		//    4    7:aload           4
		//    5    9:invokevirtual   #75  <Method int ByteBuffer.remaining()>
		//    6   12:i2f             
		//    7   13:getstatic       #29  <Field ThreadLocal localDecoder>
		//    8   16:invokevirtual   #55  <Method Object ThreadLocal.get()>
		//    9   19:checkcast       #57  <Class CharsetDecoder>
		//   10   22:invokevirtual   #79  <Method float CharsetDecoder.averageCharsPerByte()>
		//   11   25:fmul            
		//   12   26:f2i             
		//   13   27:istore_2        
			abyte0 = ((byte []) (CharBuffer.allocate(i)));
		//   14   28:iload_2         
		//   15   29:invokestatic    #83  <Method CharBuffer CharBuffer.allocate(int)>
		//   16   32:astore_1        
_L1:
			Object obj = ((Object) (((CharsetDecoder)localDecoder.get()).decode(bytebuffer, ((CharBuffer) (abyte0)), false)));
		//   17   33:getstatic       #29  <Field ThreadLocal localDecoder>
		//   18   36:invokevirtual   #55  <Method Object ThreadLocal.get()>
		//   19   39:checkcast       #57  <Class CharsetDecoder>
		//   20   42:aload           4
		//   21   44:aload_1         
		//   22   45:iconst_0        
		//   23   46:invokevirtual   #86  <Method CoderResult CharsetDecoder.decode(ByteBuffer, CharBuffer, boolean)>
		//   24   49:astore_3        
			if(((CoderResult) (obj)).isError())
		//*  25   50:aload_3         
		//*  26   51:invokevirtual   #92  <Method boolean CoderResult.isError()>
		//*  27   54:ifeq            59
				return null;
		//   28   57:aconst_null     
		//   29   58:areturn         
			if(((CoderResult) (obj)).isUnderflow())
		//*  30   59:aload_3         
		//*  31   60:invokevirtual   #95  <Method boolean CoderResult.isUnderflow()>
		//*  32   63:ifeq            109
			{
				if(bytebuffer.remaining() > 0)
		//*  33   66:aload           4
		//*  34   68:invokevirtual   #75  <Method int ByteBuffer.remaining()>
		//*  35   71:ifle            80
					carryOver = bytebuffer;
		//   36   74:aload_0         
		//   37   75:aload           4
		//   38   77:putfield        #97  <Field ByteBuffer carryOver>
				obj = ((Object) (CharBuffer.wrap(((CharSequence) (abyte0)))));
		//   39   80:aload_1         
		//   40   81:invokestatic    #100 <Method CharBuffer CharBuffer.wrap(CharSequence)>
		//   41   84:astore_3        
				((CharsetEncoder)localEncoder.get()).encode(((CharBuffer) (obj)));
		//   42   85:getstatic       #32  <Field ThreadLocal localEncoder>
		//   43   88:invokevirtual   #55  <Method Object ThreadLocal.get()>
		//   44   91:checkcast       #102 <Class CharsetEncoder>
		//   45   94:aload_3         
		//   46   95:invokevirtual   #106 <Method ByteBuffer CharsetEncoder.encode(CharBuffer)>
		//   47   98:pop             
				((CharBuffer) (abyte0)).flip();
		//   48   99:aload_1         
		//   49  100:invokevirtual   #110 <Method java.nio.Buffer CharBuffer.flip()>
		//   50  103:pop             
				return ((CharBuffer) (abyte0)).toString();
		//   51  104:aload_1         
		//   52  105:invokevirtual   #67  <Method String CharBuffer.toString()>
		//   53  108:areturn         
			}
			if(((CoderResult) (obj)).isOverflow())
		//*  54  109:aload_3         
		//*  55  110:invokevirtual   #113 <Method boolean CoderResult.isOverflow()>
		//*  56  113:ifeq            33
			{
				i = i * 2 + 1;
		//   57  116:iload_2         
		//   58  117:iconst_2        
		//   59  118:imul            
		//   60  119:iconst_1        
		//   61  120:iadd            
		//   62  121:istore_2        
				CharBuffer charbuffer;
				try
				{
					charbuffer = CharBuffer.allocate(i);
		//   63  122:iload_2         
		//   64  123:invokestatic    #83  <Method CharBuffer CharBuffer.allocate(int)>
		//   65  126:astore_3        
					((CharBuffer) (abyte0)).flip();
		//   66  127:aload_1         
		//   67  128:invokevirtual   #110 <Method java.nio.Buffer CharBuffer.flip()>
		//   68  131:pop             
					charbuffer.put(((CharBuffer) (abyte0)));
		//   69  132:aload_3         
		//   70  133:aload_1         
		//   71  134:invokevirtual   #117 <Method CharBuffer CharBuffer.put(CharBuffer)>
		//   72  137:pop             
				}
		//*  73  138:aload_3         
		//*  74  139:astore_1        
		//*  75  140:goto            33
				// Misplaced declaration of an exception variable
				catch(byte abyte0[])
		//*  76  143:astore_1        
				{
					return null;
		//   77  144:aconst_null     
		//   78  145:areturn         
				}
				abyte0 = ((byte []) (charbuffer));
			}
			  goto _L1
		}

		private ByteBuffer getBuffer(byte abyte0[])
		{
			ByteBuffer bytebuffer = carryOver;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field ByteBuffer carryOver>
		//    2    4:astore_2        
			if(bytebuffer != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          47
			{
				bytebuffer = ByteBuffer.allocate(abyte0.length + bytebuffer.remaining());
		//    5    9:aload_1         
		//    6   10:arraylength     
		//    7   11:aload_2         
		//    8   12:invokevirtual   #75  <Method int ByteBuffer.remaining()>
		//    9   15:iadd            
		//   10   16:invokestatic    #120 <Method ByteBuffer ByteBuffer.allocate(int)>
		//   11   19:astore_2        
				bytebuffer.put(carryOver);
		//   12   20:aload_2         
		//   13   21:aload_0         
		//   14   22:getfield        #97  <Field ByteBuffer carryOver>
		//   15   25:invokevirtual   #123 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
		//   16   28:pop             
				carryOver = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #97  <Field ByteBuffer carryOver>
				bytebuffer.put(abyte0);
		//   20   34:aload_2         
		//   21   35:aload_1         
		//   22   36:invokevirtual   #125 <Method ByteBuffer ByteBuffer.put(byte[])>
		//   23   39:pop             
				bytebuffer.flip();
		//   24   40:aload_2         
		//   25   41:invokevirtual   #126 <Method java.nio.Buffer ByteBuffer.flip()>
		//   26   44:pop             
				return bytebuffer;
		//   27   45:aload_2         
		//   28   46:areturn         
			} else
			{
				return ByteBuffer.wrap(abyte0);
		//   29   47:aload_1         
		//   30   48:invokestatic    #49  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//   31   51:areturn         
			}
		}

		public boolean appendBytes(byte abyte0[])
		{
			abyte0 = ((byte []) (decodeString(abyte0)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #130 <Method String decodeString(byte[])>
		//    3    5:astore_1        
			if(abyte0 != null)
		//*   4    6:aload_1         
		//*   5    7:ifnull          21
			{
				builder.append(((String) (abyte0)));
		//    6   10:aload_0         
		//    7   11:getfield        #39  <Field StringBuilder builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   10   18:pop             
				return true;
		//   11   19:iconst_1        
		//   12   20:ireturn         
			} else
			{
				return false;
		//   13   21:iconst_0        
		//   14   22:ireturn         
			}
		}

		public WebSocketMessage toMessage()
		{
			if(carryOver != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #97  <Field ByteBuffer carryOver>
		//*   2    4:ifnull          9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return new WebSocketMessage(builder.toString());
		//    5    9:new             #138 <Class WebSocketMessage>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:getfield        #39  <Field StringBuilder builder>
		//    9   17:invokevirtual   #139 <Method String StringBuilder.toString()>
		//   10   20:invokespecial   #142 <Method void WebSocketMessage(String)>
		//   11   23:areturn         
		}

		private static ThreadLocal localDecoder = new ThreadLocal() {

			protected volatile Object initialValue()
			{
				return ((Object) (initialValue()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #20  <Method CharsetDecoder initialValue()>
			//    2    4:areturn         
			}

			protected CharsetDecoder initialValue()
			{
				CharsetDecoder charsetdecoder = Charset.forName("UTF8").newDecoder();
			//    0    0:ldc1            #22  <String "UTF8">
			//    1    2:invokestatic    #28  <Method Charset Charset.forName(String)>
			//    2    5:invokevirtual   #31  <Method CharsetDecoder Charset.newDecoder()>
			//    3    8:astore_1        
				charsetdecoder.onMalformedInput(CodingErrorAction.REPORT);
			//    4    9:aload_1         
			//    5   10:getstatic       #37  <Field CodingErrorAction CodingErrorAction.REPORT>
			//    6   13:invokevirtual   #43  <Method CharsetDecoder CharsetDecoder.onMalformedInput(CodingErrorAction)>
			//    7   16:pop             
				charsetdecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
			//    8   17:aload_1         
			//    9   18:getstatic       #37  <Field CodingErrorAction CodingErrorAction.REPORT>
			//   10   21:invokevirtual   #46  <Method CharsetDecoder CharsetDecoder.onUnmappableCharacter(CodingErrorAction)>
			//   11   24:pop             
				return charsetdecoder;
			//   12   25:aload_1         
			//   13   26:areturn         
			}

		}
;
		private static ThreadLocal localEncoder = new ThreadLocal() {

			protected volatile Object initialValue()
			{
				return ((Object) (initialValue()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #20  <Method CharsetEncoder initialValue()>
			//    2    4:areturn         
			}

			protected CharsetEncoder initialValue()
			{
				CharsetEncoder charsetencoder = Charset.forName("UTF8").newEncoder();
			//    0    0:ldc1            #22  <String "UTF8">
			//    1    2:invokestatic    #28  <Method Charset Charset.forName(String)>
			//    2    5:invokevirtual   #31  <Method CharsetEncoder Charset.newEncoder()>
			//    3    8:astore_1        
				charsetencoder.onMalformedInput(CodingErrorAction.REPORT);
			//    4    9:aload_1         
			//    5   10:getstatic       #37  <Field CodingErrorAction CodingErrorAction.REPORT>
			//    6   13:invokevirtual   #43  <Method CharsetEncoder CharsetEncoder.onMalformedInput(CodingErrorAction)>
			//    7   16:pop             
				charsetencoder.onUnmappableCharacter(CodingErrorAction.REPORT);
			//    8   17:aload_1         
			//    9   18:getstatic       #37  <Field CodingErrorAction CodingErrorAction.REPORT>
			//   10   21:invokevirtual   #46  <Method CharsetEncoder CharsetEncoder.onUnmappableCharacter(CodingErrorAction)>
			//   11   24:pop             
				return charsetencoder;
			//   12   25:aload_1         
			//   13   26:areturn         
			}

		}
;
		private StringBuilder builder;
		private ByteBuffer carryOver;

		static 
		{
		//    0    0:new             #11  <Class MessageBuilderFactory$TextBuilder$1>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void MessageBuilderFactory$TextBuilder$1()>
		//    3    7:putstatic       #29  <Field ThreadLocal localDecoder>
		//    4   10:new             #13  <Class MessageBuilderFactory$TextBuilder$2>
		//    5   13:dup             
		//    6   14:invokespecial   #30  <Method void MessageBuilderFactory$TextBuilder$2()>
		//    7   17:putstatic       #32  <Field ThreadLocal localEncoder>
		//*   8   20:return          
		}

		TextBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			builder = new StringBuilder();
		//    2    4:aload_0         
		//    3    5:new             #36  <Class StringBuilder>
		//    4    8:dup             
		//    5    9:invokespecial   #37  <Method void StringBuilder()>
		//    6   12:putfield        #39  <Field StringBuilder builder>
		//    7   15:return          
		}
	}


	MessageBuilderFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	static Builder builder(byte byte0)
	{
		if(byte0 == 2)
	//*   0    0:iload_0         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          13
			return ((Builder) (new BinaryBuilder()));
	//    3    5:new             #6   <Class MessageBuilderFactory$BinaryBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void MessageBuilderFactory$BinaryBuilder()>
	//    6   12:areturn         
		else
			return ((Builder) (new TextBuilder()));
	//    7   13:new             #12  <Class MessageBuilderFactory$TextBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #26  <Method void MessageBuilderFactory$TextBuilder()>
	//   10   20:areturn         
	}
}
