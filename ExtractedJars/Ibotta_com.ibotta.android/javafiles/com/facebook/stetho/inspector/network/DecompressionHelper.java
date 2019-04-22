// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import java.io.*;
import java.util.zip.InflaterOutputStream;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			CountingOutputStream, GunzippingOutputStream, ResponseHandlingInputStream, NetworkPeerManager, 
//			ResponseHandler

public class DecompressionHelper
{

	public DecompressionHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static InputStream teeInputWithDecompression(NetworkPeerManager networkpeermanager, String s, InputStream inputstream, OutputStream outputstream, String s1, ResponseHandler responsehandler)
		throws IOException
	{
label0:
		{
			if(s1 != null)
	//*   0    0:aload           4
	//*   1    2:ifnull          147
			{
				boolean flag = "gzip".equals(((Object) (s1)));
	//    2    5:ldc1            #11  <String "gzip">
	//    3    7:aload           4
	//    4    9:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    5   12:istore          6
				boolean flag1 = "deflate".equals(((Object) (s1)));
	//    6   14:ldc1            #8   <String "deflate">
	//    7   16:aload           4
	//    8   18:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    9   21:istore          7
				if(!flag && !flag1)
	//*  10   23:iload           6
	//*  11   25:ifne            102
	//*  12   28:iload           7
	//*  13   30:ifeq            36
	//*  14   33:goto            102
				{
					com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.WARNING;
	//   15   36:getstatic       #33  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.WARNING>
	//   16   39:astore          8
					com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK;
	//   17   41:getstatic       #39  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   18   44:astore          9
					StringBuilder stringbuilder = new StringBuilder();
	//   19   46:new             #41  <Class StringBuilder>
	//   20   49:dup             
	//   21   50:invokespecial   #42  <Method void StringBuilder()>
	//   22   53:astore          10
					stringbuilder.append("Unsupported Content-Encoding in response for request #");
	//   23   55:aload           10
	//   24   57:ldc1            #44  <String "Unsupported Content-Encoding in response for request #">
	//   25   59:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   62:pop             
					stringbuilder.append(s);
	//   27   63:aload           10
	//   28   65:aload_1         
	//   29   66:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   30   69:pop             
					stringbuilder.append(": ");
	//   31   70:aload           10
	//   32   72:ldc1            #50  <String ": ">
	//   33   74:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   34   77:pop             
					stringbuilder.append(s1);
	//   35   78:aload           10
	//   36   80:aload           4
	//   37   82:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
					CLog.writeToConsole(((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), messagelevel, messagesource, stringbuilder.toString());
	//   39   86:aload_0         
	//   40   87:aload           8
	//   41   89:aload           9
	//   42   91:aload           10
	//   43   93:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   44   96:invokestatic    #60  <Method void CLog.writeToConsole(com.facebook.stetho.inspector.helper.ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
				} else
	//*  45   99:goto            147
				{
					s1 = ((String) (new CountingOutputStream(outputstream)));
	//   46  102:new             #62  <Class CountingOutputStream>
	//   47  105:dup             
	//   48  106:aload_3         
	//   49  107:invokespecial   #65  <Method void CountingOutputStream(OutputStream)>
	//   50  110:astore          4
					if(flag)
	//*  51  112:iload           6
	//*  52  114:ifeq            126
						outputstream = ((OutputStream) (GunzippingOutputStream.create(((OutputStream) (s1)))));
	//   53  117:aload           4
	//   54  119:invokestatic    #71  <Method GunzippingOutputStream GunzippingOutputStream.create(OutputStream)>
	//   55  122:astore_3        
					else
	//*  56  123:goto            150
					if(flag1)
	//*  57  126:iload           7
	//*  58  128:ifeq            144
						outputstream = ((OutputStream) (new InflaterOutputStream(((OutputStream) (s1)))));
	//   59  131:new             #73  <Class InflaterOutputStream>
	//   60  134:dup             
	//   61  135:aload           4
	//   62  137:invokespecial   #74  <Method void InflaterOutputStream(OutputStream)>
	//   63  140:astore_3        
					break label0;
	//   64  141:goto            150
				}
			}
	//*  65  144:goto            150
			s1 = null;
	//   66  147:aconst_null     
	//   67  148:astore          4
		}
		return ((InputStream) (new ResponseHandlingInputStream(inputstream, s, outputstream, ((CountingOutputStream) (s1)), ((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), responsehandler)));
	//   68  150:new             #76  <Class ResponseHandlingInputStream>
	//   69  153:dup             
	//   70  154:aload_2         
	//   71  155:aload_1         
	//   72  156:aload_3         
	//   73  157:aload           4
	//   74  159:aload_0         
	//   75  160:aload           5
	//   76  162:invokespecial   #79  <Method void ResponseHandlingInputStream(InputStream, String, OutputStream, CountingOutputStream, com.facebook.stetho.inspector.helper.ChromePeerManager, ResponseHandler)>
	//   77  165:areturn         
	}

	static final String DEFLATE_ENCODING = "deflate";
	static final String GZIP_ENCODING = "gzip";
}
