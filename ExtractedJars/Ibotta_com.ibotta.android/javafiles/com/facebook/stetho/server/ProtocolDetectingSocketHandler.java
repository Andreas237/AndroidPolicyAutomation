// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.content.Context;
import android.net.LocalSocket;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.facebook.stetho.server:
//			SecureSocketHandler, LeakyBufferedInputStream, SocketLike, SocketLikeHandler

public class ProtocolDetectingSocketHandler extends SecureSocketHandler
{
	public static class AlwaysMatchMatcher
		implements MagicMatcher
	{

		public boolean matches(InputStream inputstream)
			throws IOException
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public AlwaysMatchMatcher()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class ExactMagicMatcher
		implements MagicMatcher
	{

		public boolean matches(InputStream inputstream)
			throws IOException
		{
			byte abyte0[] = new byte[mMagic.length];
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field byte[] mMagic>
		//    2    4:arraylength     
		//    3    5:newarray        byte[]
		//    4    7:astore_2        
			return inputstream.read(abyte0) == abyte0.length && Arrays.equals(abyte0, mMagic);
		//    5    8:aload_1         
		//    6    9:aload_2         
		//    7   10:invokevirtual   #29  <Method int InputStream.read(byte[])>
		//    8   13:aload_2         
		//    9   14:arraylength     
		//   10   15:icmpne          31
		//   11   18:aload_2         
		//   12   19:aload_0         
		//   13   20:getfield        #18  <Field byte[] mMagic>
		//   14   23:invokestatic    #35  <Method boolean Arrays.equals(byte[], byte[])>
		//   15   26:ifeq            31
		//   16   29:iconst_1        
		//   17   30:ireturn         
		//   18   31:iconst_0        
		//   19   32:ireturn         
		}

		private final byte mMagic[];

		public ExactMagicMatcher(byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mMagic = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field byte[] mMagic>
		//    5    9:return          
		}
	}

	private static class HandlerInfo
	{

		public final SocketLikeHandler handler;
		public final MagicMatcher magicMatcher;

		private HandlerInfo(MagicMatcher magicmatcher, SocketLikeHandler socketlikehandler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			magicMatcher = magicmatcher;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ProtocolDetectingSocketHandler$MagicMatcher magicMatcher>
			handler = socketlikehandler;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field SocketLikeHandler handler>
		//    8   14:return          
		}

	}

	public static interface MagicMatcher
	{

		public abstract boolean matches(InputStream inputstream)
			throws IOException;
	}


	public ProtocolDetectingSocketHandler(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void SecureSocketHandler(Context)>
	//    3    5:aload_0         
	//    4    6:new             #30  <Class ArrayList>
	//    5    9:dup             
	//    6   10:iconst_2        
	//    7   11:invokespecial   #33  <Method void ArrayList(int)>
	//    8   14:putfield        #35  <Field ArrayList mHandlers>
	//    9   17:return          
	}

	public void addHandler(MagicMatcher magicmatcher, SocketLikeHandler socketlikehandler)
	{
		mHandlers.add(((Object) (new HandlerInfo(magicmatcher, socketlikehandler))));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayList mHandlers>
	//    2    4:new             #14  <Class ProtocolDetectingSocketHandler$HandlerInfo>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #41  <Method void ProtocolDetectingSocketHandler$HandlerInfo(ProtocolDetectingSocketHandler$MagicMatcher, SocketLikeHandler, ProtocolDetectingSocketHandler$1)>
	//    8   14:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	protected void onSecured(LocalSocket localsocket)
		throws IOException
	{
		LeakyBufferedInputStream leakybufferedinputstream = new LeakyBufferedInputStream(localsocket.getInputStream(), 256);
	//    0    0:new             #51  <Class LeakyBufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method InputStream LocalSocket.getInputStream()>
	//    4    8:sipush          256
	//    5   11:invokespecial   #60  <Method void LeakyBufferedInputStream(InputStream, int)>
	//    6   14:astore          5
		if(!mHandlers.isEmpty())
	//*   7   16:aload_0         
	//*   8   17:getfield        #35  <Field ArrayList mHandlers>
	//*   9   20:invokevirtual   #64  <Method boolean ArrayList.isEmpty()>
	//*  10   23:ifne            153
		{
			int i = 0;
	//   11   26:iconst_0        
	//   12   27:istore_2        
			for(int j = mHandlers.size(); i < j; i++)
	//*  13   28:aload_0         
	//*  14   29:getfield        #35  <Field ArrayList mHandlers>
	//*  15   32:invokevirtual   #68  <Method int ArrayList.size()>
	//*  16   35:istore_3        
	//*  17   36:iload_2         
	//*  18   37:iload_3         
	//*  19   38:icmpge          116
			{
				HandlerInfo handlerinfo = (HandlerInfo)mHandlers.get(i);
	//   20   41:aload_0         
	//   21   42:getfield        #35  <Field ArrayList mHandlers>
	//   22   45:iload_2         
	//   23   46:invokevirtual   #72  <Method Object ArrayList.get(int)>
	//   24   49:checkcast       #14  <Class ProtocolDetectingSocketHandler$HandlerInfo>
	//   25   52:astore          6
				leakybufferedinputstream.mark(256);
	//   26   54:aload           5
	//   27   56:sipush          256
	//   28   59:invokevirtual   #75  <Method void LeakyBufferedInputStream.mark(int)>
				boolean flag = handlerinfo.magicMatcher.matches(((InputStream) (leakybufferedinputstream)));
	//   29   62:aload           6
	//   30   64:getfield        #79  <Field ProtocolDetectingSocketHandler$MagicMatcher ProtocolDetectingSocketHandler$HandlerInfo.magicMatcher>
	//   31   67:aload           5
	//   32   69:invokeinterface #83  <Method boolean ProtocolDetectingSocketHandler$MagicMatcher.matches(InputStream)>
	//   33   74:istore          4
				leakybufferedinputstream.reset();
	//   34   76:aload           5
	//   35   78:invokevirtual   #87  <Method void LeakyBufferedInputStream.reset()>
				if(flag)
	//*  36   81:iload           4
	//*  37   83:ifeq            109
				{
					localsocket = ((LocalSocket) (new SocketLike(localsocket, leakybufferedinputstream)));
	//   38   86:new             #89  <Class SocketLike>
	//   39   89:dup             
	//   40   90:aload_1         
	//   41   91:aload           5
	//   42   93:invokespecial   #92  <Method void SocketLike(LocalSocket, LeakyBufferedInputStream)>
	//   43   96:astore_1        
					handlerinfo.handler.onAccepted(((SocketLike) (localsocket)));
	//   44   97:aload           6
	//   45   99:getfield        #96  <Field SocketLikeHandler ProtocolDetectingSocketHandler$HandlerInfo.handler>
	//   46  102:aload_1         
	//   47  103:invokeinterface #102 <Method void SocketLikeHandler.onAccepted(SocketLike)>
					return;
	//   48  108:return          
				}
			}

	//   49  109:iload_2         
	//   50  110:iconst_1        
	//   51  111:iadd            
	//   52  112:istore_2        
	//*  53  113:goto            36
			localsocket = ((LocalSocket) (new StringBuilder()));
	//   54  116:new             #104 <Class StringBuilder>
	//   55  119:dup             
	//   56  120:invokespecial   #106 <Method void StringBuilder()>
	//   57  123:astore_1        
			((StringBuilder) (localsocket)).append("No matching handler, firstByte=");
	//   58  124:aload_1         
	//   59  125:ldc1            #108 <String "No matching handler, firstByte=">
	//   60  127:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
			((StringBuilder) (localsocket)).append(leakybufferedinputstream.read());
	//   62  131:aload_1         
	//   63  132:aload           5
	//   64  134:invokevirtual   #115 <Method int LeakyBufferedInputStream.read()>
	//   65  137:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   66  140:pop             
			throw new IOException(((StringBuilder) (localsocket)).toString());
	//   67  141:new             #49  <Class IOException>
	//   68  144:dup             
	//   69  145:aload_1         
	//   70  146:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   71  149:invokespecial   #125 <Method void IOException(String)>
	//   72  152:athrow          
		} else
		{
			throw new IllegalStateException("No handlers added");
	//   73  153:new             #127 <Class IllegalStateException>
	//   74  156:dup             
	//   75  157:ldc1            #129 <String "No handlers added">
	//   76  159:invokespecial   #130 <Method void IllegalStateException(String)>
	//   77  162:athrow          
		}
	}

	private static final int SENSING_BUFFER_SIZE = 256;
	private final ArrayList mHandlers = new ArrayList(2);
}
