// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

public class ce
	implements HttpRequestRetryHandler
{

	public ce()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext)
	{
		if(i >= 3)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:icmplt          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(ioexception instanceof NoHttpResponseException)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #26  <Class NoHttpResponseException>
	//*   7   11:ifeq            16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		return ((ioexception instanceof SocketException) || (ioexception instanceof SSLException)) && ioexception.getMessage() != null && ioexception.getMessage().contains("Broken pipe");
	//   10   16:aload_1         
	//   11   17:instanceof      #28  <Class SocketException>
	//   12   20:ifne            30
	//   13   23:aload_1         
	//   14   24:instanceof      #30  <Class SSLException>
	//   15   27:ifeq            51
	//   16   30:aload_1         
	//   17   31:invokevirtual   #35  <Method String IOException.getMessage()>
	//   18   34:ifnull          51
	//   19   37:aload_1         
	//   20   38:invokevirtual   #35  <Method String IOException.getMessage()>
	//   21   41:ldc1            #37  <String "Broken pipe">
	//   22   43:invokevirtual   #43  <Method boolean String.contains(CharSequence)>
	//   23   46:ifeq            51
	//   24   49:iconst_1        
	//   25   50:ireturn         
	//   26   51:iconst_0        
	//   27   52:ireturn         
	}

	static final String b = ((Class) (o/ce)).getSimpleName();

	static 
	{
	//    0    0:ldc1            #2   <Class ce>
	//    1    2:invokevirtual   #16  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #18  <Field String b>
	//*   3    8:return          
	}
}
