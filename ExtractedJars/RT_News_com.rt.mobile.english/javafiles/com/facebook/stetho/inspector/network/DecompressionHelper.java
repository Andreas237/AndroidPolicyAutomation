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
	//*   1    2:ifnull          156
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
	//*  45   99:goto            156
				{
					CountingOutputStream countingoutputstream = new CountingOutputStream(outputstream);
	//   46  102:new             #62  <Class CountingOutputStream>
	//   47  105:dup             
	//   48  106:aload_3         
	//   49  107:invokespecial   #65  <Method void CountingOutputStream(OutputStream)>
	//   50  110:astore          8
					if(flag)
	//*  51  112:iload           6
	//*  52  114:ifeq            130
					{
						outputstream = ((OutputStream) (GunzippingOutputStream.create(((OutputStream) (countingoutputstream)))));
	//   53  117:aload           8
	//   54  119:invokestatic    #71  <Method GunzippingOutputStream GunzippingOutputStream.create(OutputStream)>
	//   55  122:astore_3        
						s1 = ((String) (countingoutputstream));
	//   56  123:aload           8
	//   57  125:astore          4
					} else
	//*  58  127:goto            159
					{
						s1 = ((String) (countingoutputstream));
	//   59  130:aload           8
	//   60  132:astore          4
						if(flag1)
	//*  61  134:iload           7
	//*  62  136:ifeq            159
						{
							outputstream = ((OutputStream) (new InflaterOutputStream(((OutputStream) (countingoutputstream)))));
	//   63  139:new             #73  <Class InflaterOutputStream>
	//   64  142:dup             
	//   65  143:aload           8
	//   66  145:invokespecial   #74  <Method void InflaterOutputStream(OutputStream)>
	//   67  148:astore_3        
							s1 = ((String) (countingoutputstream));
	//   68  149:aload           8
	//   69  151:astore          4
						}
					}
					break label0;
	//   70  153:goto            159
				}
			}
			s1 = null;
	//   71  156:aconst_null     
	//   72  157:astore          4
		}
		return ((InputStream) (new ResponseHandlingInputStream(inputstream, s, outputstream, ((CountingOutputStream) (s1)), ((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), responsehandler)));
	//   73  159:new             #76  <Class ResponseHandlingInputStream>
	//   74  162:dup             
	//   75  163:aload_2         
	//   76  164:aload_1         
	//   77  165:aload_3         
	//   78  166:aload           4
	//   79  168:aload_0         
	//   80  169:aload           5
	//   81  171:invokespecial   #79  <Method void ResponseHandlingInputStream(InputStream, String, OutputStream, CountingOutputStream, com.facebook.stetho.inspector.helper.ChromePeerManager, ResponseHandler)>
	//   82  174:areturn         
	}

	private static final String DEFLATE_ENCODING = "deflate";
	private static final String GZIP_ENCODING = "gzip";
}
