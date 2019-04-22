// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.firebase.tubesock:
//			MessageBuilderFactory, WebSocketMessage

static class MessageBuilderFactory$BinaryBuilder
	implements MessageBuilderFactory.Builder
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

	MessageBuilderFactory$BinaryBuilder()
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
