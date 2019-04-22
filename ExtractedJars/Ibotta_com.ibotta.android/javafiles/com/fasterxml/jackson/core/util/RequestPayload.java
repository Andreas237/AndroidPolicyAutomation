// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

public class RequestPayload
	implements Serializable
{

	public String toString()
	{
		byte abyte0[] = _payloadAsBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field byte[] _payloadAsBytes>
	//    2    4:astore_1        
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          34
		{
			String s;
			try
			{
				s = new String(abyte0, _charset);
	//    5    9:new             #24  <Class String>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field String _charset>
	//   10   18:invokespecial   #30  <Method void String(byte[], String)>
	//   11   21:astore_1        
			}
	//*  12   22:aload_1         
	//*  13   23:areturn         
			catch(IOException ioexception)
	//*  14   24:astore_1        
			{
				throw new RuntimeException(((Throwable) (ioexception)));
	//   15   25:new             #32  <Class RuntimeException>
	//   16   28:dup             
	//   17   29:aload_1         
	//   18   30:invokespecial   #35  <Method void RuntimeException(Throwable)>
	//   19   33:athrow          
			}
			return s;
		} else
		{
			return _payloadAsText.toString();
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field CharSequence _payloadAsText>
	//   22   38:invokeinterface #41  <Method String CharSequence.toString()>
	//   23   43:areturn         
		}
	}

	private static final long serialVersionUID = 1L;
	protected String _charset;
	protected byte _payloadAsBytes[];
	protected CharSequence _payloadAsText;
}
