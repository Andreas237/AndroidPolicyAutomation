// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

public class RequestPayload
	implements Serializable
{

	public RequestPayload(CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(charsequence == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
		{
			throw new IllegalArgumentException();
	//    4    8:new             #23  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #24  <Method void IllegalArgumentException()>
	//    7   15:athrow          
		} else
		{
			_payloadAsText = charsequence;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #26  <Field CharSequence _payloadAsText>
			return;
	//   11   21:return          
		}
	}

	public RequestPayload(byte abyte0[], String s)
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
			if(abyte0 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
				throw new IllegalArgumentException();
	//    4    8:new             #23  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #24  <Method void IllegalArgumentException()>
	//    7   15:athrow          
			_payloadAsBytes = abyte0;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #30  <Field byte[] _payloadAsBytes>
			if(s != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          34
			{
				abyte0 = ((byte []) (s));
	//   13   25:aload_2         
	//   14   26:astore_1        
				if(!s.isEmpty())
					break label0;
	//   15   27:aload_2         
	//   16   28:invokevirtual   #36  <Method boolean String.isEmpty()>
	//   17   31:ifeq            37
			}
			abyte0 = "UTF-8";
	//   18   34:ldc1            #38  <String "UTF-8">
	//   19   36:astore_1        
		}
		_charset = ((String) (abyte0));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:putfield        #40  <Field String _charset>
	//   23   42:return          
	}

	public Object getRawPayload()
	{
		if(_payloadAsBytes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field byte[] _payloadAsBytes>
	//*   2    4:ifnull          12
			return ((Object) (_payloadAsBytes));
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field byte[] _payloadAsBytes>
	//    5   11:areturn         
		else
			return ((Object) (_payloadAsText));
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field CharSequence _payloadAsText>
	//    8   16:areturn         
	}

	public String toString()
	{
		if(_payloadAsBytes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field byte[] _payloadAsBytes>
	//*   2    4:ifnull          35
		{
			String s;
			try
			{
				s = new String(_payloadAsBytes, _charset);
	//    3    7:new             #32  <Class String>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field byte[] _payloadAsBytes>
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field String _charset>
	//    9   19:invokespecial   #48  <Method void String(byte[], String)>
	//   10   22:astore_1        
			}
	//*  11   23:aload_1         
	//*  12   24:areturn         
			catch(IOException ioexception)
	//*  13   25:astore_1        
			{
				throw new RuntimeException(((Throwable) (ioexception)));
	//   14   26:new             #50  <Class RuntimeException>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:invokespecial   #53  <Method void RuntimeException(Throwable)>
	//   18   34:athrow          
			}
			return s;
		} else
		{
			return _payloadAsText.toString();
	//   19   35:aload_0         
	//   20   36:getfield        #26  <Field CharSequence _payloadAsText>
	//   21   39:invokeinterface #57  <Method String CharSequence.toString()>
	//   22   44:areturn         
		}
	}

	private static final long serialVersionUID = 1L;
	protected String _charset;
	protected byte _payloadAsBytes[];
	protected CharSequence _payloadAsText;
}
