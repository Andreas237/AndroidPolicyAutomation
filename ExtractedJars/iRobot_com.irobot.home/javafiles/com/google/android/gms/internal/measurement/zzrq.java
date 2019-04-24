// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.tagmanager.zzdi;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzrr, zzrt

final class zzrq
	implements zzrr
{

	zzrq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzbos = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field InputStream zzbos>
	//    5    9:return          
	}

	public final void close()
	{
		HttpURLConnection httpurlconnection = zzbor;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field HttpURLConnection zzbor>
	//    2    4:astore_2        
		try
		{
			if(zzbos != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #16  <Field InputStream zzbos>
	//*   5    9:ifnull          63
				zzbos.close();
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field InputStream zzbos>
	//    8   16:invokevirtual   #26  <Method void InputStream.close()>
		}
	//*   9   19:goto            63
		catch(IOException ioexception)
	//*  10   22:astore_3        
		{
			String s = String.valueOf(((Object) (ioexception.getMessage())));
	//   11   23:aload_3         
	//   12   24:invokevirtual   #30  <Method String IOException.getMessage()>
	//   13   27:invokestatic    #36  <Method String String.valueOf(Object)>
	//   14   30:astore_1        
			if(s.length() != 0)
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #40  <Method int String.length()>
	//*  17   35:ifeq            48
				s = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(s);
	//   18   38:ldc1            #42  <String "HttpUrlConnectionNetworkClient: Error when closing http input stream: ">
	//   19   40:aload_1         
	//   20   41:invokevirtual   #46  <Method String String.concat(String)>
	//   21   44:astore_1        
			else
	//*  22   45:goto            58
				s = new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: ");
	//   23   48:new             #32  <Class String>
	//   24   51:dup             
	//   25   52:ldc1            #42  <String "HttpUrlConnectionNetworkClient: Error when closing http input stream: ">
	//   26   54:invokespecial   #49  <Method void String(String)>
	//   27   57:astore_1        
			zzdi.zza(s, ((Throwable) (ioexception)));
	//   28   58:aload_1         
	//   29   59:aload_3         
	//   30   60:invokestatic    #55  <Method void zzdi.zza(String, Throwable)>
		}
		if(httpurlconnection != null)
	//*  31   63:aload_2         
	//*  32   64:ifnull          71
			httpurlconnection.disconnect();
	//   33   67:aload_2         
	//   34   68:invokevirtual   #60  <Method void HttpURLConnection.disconnect()>
	//   35   71:return          
	}

	public final InputStream zzez(String s)
	{
		s = ((String) ((HttpURLConnection)(new URL(s)).openConnection()));
	//    0    0:new             #64  <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #65  <Method void URL(String)>
	//    4    8:invokevirtual   #69  <Method java.net.URLConnection URL.openConnection()>
	//    5   11:checkcast       #57  <Class HttpURLConnection>
	//    6   14:astore_1        
		((HttpURLConnection) (s)).setReadTimeout(20000);
	//    7   15:aload_1         
	//    8   16:sipush          20000
	//    9   19:invokevirtual   #73  <Method void HttpURLConnection.setReadTimeout(int)>
		((HttpURLConnection) (s)).setConnectTimeout(20000);
	//   10   22:aload_1         
	//   11   23:sipush          20000
	//   12   26:invokevirtual   #76  <Method void HttpURLConnection.setConnectTimeout(int)>
		zzbor = ((HttpURLConnection) (s));
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #22  <Field HttpURLConnection zzbor>
		s = ((String) (zzbor));
	//   16   34:aload_0         
	//   17   35:getfield        #22  <Field HttpURLConnection zzbor>
	//   18   38:astore_1        
		int i = ((HttpURLConnection) (s)).getResponseCode();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #79  <Method int HttpURLConnection.getResponseCode()>
	//   21   43:istore_2        
		if(i == 200)
	//*  22   44:iload_2         
	//*  23   45:sipush          200
	//*  24   48:icmpne          64
		{
			zzbos = ((HttpURLConnection) (s)).getInputStream();
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #83  <Method InputStream HttpURLConnection.getInputStream()>
	//   28   56:putfield        #16  <Field InputStream zzbos>
			return zzbos;
	//   29   59:aload_0         
	//   30   60:getfield        #16  <Field InputStream zzbos>
	//   31   63:areturn         
		}
		s = ((String) (new StringBuilder(25)));
	//   32   64:new             #85  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:bipush          25
	//   35   70:invokespecial   #87  <Method void StringBuilder(int)>
	//   36   73:astore_1        
		((StringBuilder) (s)).append("Bad response: ");
	//   37   74:aload_1         
	//   38   75:ldc1            #89  <String "Bad response: ">
	//   39   77:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
		((StringBuilder) (s)).append(i);
	//   41   81:aload_1         
	//   42   82:iload_2         
	//   43   83:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   44   86:pop             
		s = ((StringBuilder) (s)).toString();
	//   45   87:aload_1         
	//   46   88:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   47   91:astore_1        
		if(i == 404)
	//*  48   92:iload_2         
	//*  49   93:sipush          404
	//*  50   96:icmpne          108
			throw new FileNotFoundException(s);
	//   51   99:new             #101 <Class FileNotFoundException>
	//   52  102:dup             
	//   53  103:aload_1         
	//   54  104:invokespecial   #102 <Method void FileNotFoundException(String)>
	//   55  107:athrow          
		if(i == 503)
	//*  56  108:iload_2         
	//*  57  109:sipush          503
	//*  58  112:icmpne          124
			throw new zzrt(s);
	//   59  115:new             #104 <Class zzrt>
	//   60  118:dup             
	//   61  119:aload_1         
	//   62  120:invokespecial   #105 <Method void zzrt(String)>
	//   63  123:athrow          
		else
			throw new IOException(s);
	//   64  124:new             #20  <Class IOException>
	//   65  127:dup             
	//   66  128:aload_1         
	//   67  129:invokespecial   #106 <Method void IOException(String)>
	//   68  132:athrow          
	}

	private HttpURLConnection zzbor;
	private InputStream zzbos;
}
