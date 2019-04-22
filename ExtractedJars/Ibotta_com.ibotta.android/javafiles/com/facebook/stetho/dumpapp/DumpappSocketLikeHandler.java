// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappOutputBrokenException, Framer, Dumper, DumpappFramingException

public class DumpappSocketLikeHandler
	implements SocketLikeHandler
{

	public DumpappSocketLikeHandler(Dumper dumper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mDumper = dumper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Dumper mDumper>
	//    5    9:return          
	}

	static void dump(Dumper dumper, Framer framer, String as[])
		throws IOException
	{
		try
		{
			framer.writeExitCode(dumper.dump(framer.getStdin(), framer.getStdout(), framer.getStderr(), as));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #40  <Method java.io.InputStream Framer.getStdin()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #44  <Method java.io.PrintStream Framer.getStdout()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #47  <Method java.io.PrintStream Framer.getStderr()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #52  <Method int Dumper.dump(java.io.InputStream, java.io.PrintStream, java.io.PrintStream, String[])>
	//   10   18:invokevirtual   #56  <Method void Framer.writeExitCode(int)>
			return;
	//   11   21:return          
		}
		// Misplaced declaration of an exception variable
		catch(Dumper dumper)
	//*  12   22:astore_0        
		{
			return;
	//   13   23:return          
		}
	}

	private void establishConversation(DataInputStream datainputstream)
		throws IOException
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		datainputstream.readFully(abyte0);
	//    3    4:aload_1         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #65  <Method void DataInputStream.readFully(byte[])>
		if(Arrays.equals(PROTOCOL_MAGIC, abyte0))
	//*   6    9:getstatic       #21  <Field byte[] PROTOCOL_MAGIC>
	//*   7   12:aload_3         
	//*   8   13:invokestatic    #71  <Method boolean Arrays.equals(byte[], byte[])>
	//*   9   16:ifeq            59
		{
			int i = datainputstream.readInt();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #75  <Method int DataInputStream.readInt()>
	//   12   23:istore_2        
			if(i == 1)
	//*  13   24:iload_2         
	//*  14   25:iconst_1        
	//*  15   26:icmpne          30
			{
				return;
	//   16   29:return          
			} else
			{
				datainputstream = ((DataInputStream) (new StringBuilder()));
	//   17   30:new             #77  <Class StringBuilder>
	//   18   33:dup             
	//   19   34:invokespecial   #78  <Method void StringBuilder()>
	//   20   37:astore_1        
				((StringBuilder) (datainputstream)).append("Expected version=1; got=");
	//   21   38:aload_1         
	//   22   39:ldc1            #80  <String "Expected version=1; got=">
	//   23   41:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
				((StringBuilder) (datainputstream)).append(i);
	//   25   45:aload_1         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   28   50:pop             
				throw logAndThrowProtocolException(((StringBuilder) (datainputstream)).toString());
	//   29   51:aload_1         
	//   30   52:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   31   55:invokestatic    #95  <Method IOException logAndThrowProtocolException(String)>
	//   32   58:athrow          
			}
		} else
		{
			throw logAndThrowProtocolException("Incompatible protocol, are you using an old dumpapp script?");
	//   33   59:ldc1            #97  <String "Incompatible protocol, are you using an old dumpapp script?">
	//   34   61:invokestatic    #95  <Method IOException logAndThrowProtocolException(String)>
	//   35   64:athrow          
		}
	}

	private static IOException logAndThrowProtocolException(String s)
		throws IOException
	{
		LogUtil.w(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method void LogUtil.w(String)>
		throw new IOException(s);
	//    2    4:new             #32  <Class IOException>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #105 <Method void IOException(String)>
	//    6   12:athrow          
	}

	private String[] readArgs(Framer framer)
		throws IOException
	{
		framer;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = ((int) (framer.readFrameType()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #111 <Method byte Framer.readFrameType()>
	//    4    6:istore_2        
		if(i != 33)
			break MISSING_BLOCK_LABEL_51;
	//    5    7:iload_2         
	//    6    8:bipush          33
	//    7   10:icmpne          51
		int j;
		String as[];
		j = framer.readInt();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #112 <Method int Framer.readInt()>
	//   10   17:istore_3        
		as = new String[j];
	//   11   18:iload_3         
	//   12   19:anewarray       String[]
	//   13   22:astore          4
		i = 0;
	//   14   24:iconst_0        
	//   15   25:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   16   26:iload_2         
	//   17   27:iload_3         
	//   18   28:icmpge          46
		as[i] = framer.readString();
	//   19   31:aload           4
	//   20   33:iload_2         
	//   21   34:aload_1         
	//   22   35:invokevirtual   #117 <Method String Framer.readString()>
	//   23   38:aastore         
		i++;
	//   24   39:iload_2         
	//   25   40:iconst_1        
	//   26   41:iadd            
	//   27   42:istore_2        
		if(true) goto _L2; else goto _L1
	//   28   43:goto            26
_L1:
		framer;
	//   29   46:aload_1         
		JVM INSTR monitorexit ;
	//   30   47:monitorexit     
		return as;
	//   31   48:aload           4
	//   32   50:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   33   51:new             #77  <Class StringBuilder>
	//   34   54:dup             
	//   35   55:invokespecial   #78  <Method void StringBuilder()>
	//   36   58:astore          4
		stringbuilder.append("Expected enter frame, got: ");
	//   37   60:aload           4
	//   38   62:ldc1            #119 <String "Expected enter frame, got: ">
	//   39   64:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   40   67:pop             
		stringbuilder.append(i);
	//   41   68:aload           4
	//   42   70:iload_2         
	//   43   71:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   44   74:pop             
		throw new DumpappFramingException(stringbuilder.toString());
	//   45   75:new             #121 <Class DumpappFramingException>
	//   46   78:dup             
	//   47   79:aload           4
	//   48   81:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   49   84:invokespecial   #122 <Method void DumpappFramingException(String)>
	//   50   87:athrow          
		Exception exception;
		exception;
	//   51   88:astore          4
		framer;
	//   52   90:aload_1         
		JVM INSTR monitorexit ;
	//   53   91:monitorexit     
		throw exception;
	//   54   92:aload           4
	//   55   94:athrow          
	}

	public void onAccepted(SocketLike socketlike)
		throws IOException
	{
		DataInputStream datainputstream = new DataInputStream(socketlike.getInput());
	//    0    0:new             #61  <Class DataInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #129 <Method java.io.InputStream SocketLike.getInput()>
	//    4    8:invokespecial   #132 <Method void DataInputStream(java.io.InputStream)>
	//    5   11:astore_2        
		establishConversation(datainputstream);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #134 <Method void establishConversation(DataInputStream)>
		socketlike = ((SocketLike) (new Framer(((java.io.InputStream) (datainputstream)), socketlike.getOutput())));
	//    9   17:new             #36  <Class Framer>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #138 <Method java.io.OutputStream SocketLike.getOutput()>
	//   14   26:invokespecial   #141 <Method void Framer(java.io.InputStream, java.io.OutputStream)>
	//   15   29:astore_1        
		String as[] = readArgs(((Framer) (socketlike)));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokespecial   #143 <Method String[] readArgs(Framer)>
	//   19   35:astore_2        
		dump(mDumper, ((Framer) (socketlike)), as);
	//   20   36:aload_0         
	//   21   37:getfield        #28  <Field Dumper mDumper>
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:invokestatic    #145 <Method void dump(Dumper, Framer, String[])>
	//   25   45:return          
	}

	public static final byte PROTOCOL_MAGIC[] = {
		68, 85, 77, 80
	};
	public static final int PROTOCOL_VERSION = 1;
	private final Dumper mDumper;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #16  <Int 68>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #17  <Int 85>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #18  <Int 77>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #19  <Int 80>
	//   17   22:bastore         
	//   18   23:putstatic       #21  <Field byte[] PROTOCOL_MAGIC>
	//*  19   26:return          
	}
}
