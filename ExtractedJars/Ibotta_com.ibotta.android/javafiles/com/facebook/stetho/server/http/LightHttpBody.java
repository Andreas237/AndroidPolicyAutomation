// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.io.*;

public abstract class LightHttpBody
{

	public LightHttpBody()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static LightHttpBody create(String s, String s1)
	{
		try
		{
			s = ((String) (create(s.getBytes("UTF-8"), s1)));
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "UTF-8">
	//    2    3:invokevirtual   #23  <Method byte[] String.getBytes(String)>
	//    3    6:aload_1         
	//    4    7:invokestatic    #26  <Method LightHttpBody create(byte[], String)>
	//    5   10:astore_0        
		}
	//*   6   11:aload_0         
	//*   7   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   13:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//    9   14:new             #28  <Class RuntimeException>
	//   10   17:dup             
	//   11   18:aload_0         
	//   12   19:invokespecial   #31  <Method void RuntimeException(Throwable)>
	//   13   22:athrow          
		}
		return ((LightHttpBody) (s));
	}

	public static LightHttpBody create(byte abyte0[], String s)
	{
		return ((LightHttpBody) (new LightHttpBody(s, abyte0) {

			public int contentLength()
			{
				return body.length;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field byte[] val$body>
			//    2    4:arraylength     
			//    3    5:ireturn         
			}

			public String contentType()
			{
				return contentType;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field String val$contentType>
			//    2    4:areturn         
			}

			public void writeTo(OutputStream outputstream)
				throws IOException
			{
				outputstream.write(body);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #17  <Field byte[] val$body>
			//    3    5:invokevirtual   #35  <Method void OutputStream.write(byte[])>
			//    4    8:return          
			}

			final byte val$body[];
			final String val$contentType;

			
			{
				contentType = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field String val$contentType>
				body = abyte0;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #17  <Field byte[] val$body>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #20  <Method void LightHttpBody()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #6   <Class LightHttpBody$1>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void LightHttpBody$1(String, byte[])>
	//    5    9:areturn         
	}

	public abstract int contentLength();

	public abstract String contentType();

	public abstract void writeTo(OutputStream outputstream)
		throws IOException;
}
