// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.util.Base64;
import com.irobot.core.AssetId;
import com.irobot.core.NetworkAddress;
import java.io.*;
import java.net.HttpURLConnection;
import java.security.KeyStore;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.irobot.home.o.c:
//			m, u

public class g extends m
{

	public g(HashMap hashmap, KeyStore keystore)
	{
		super(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void m(HashMap)>
		a = new u(keystore, "roomba", b().getId());
	//    3    5:aload_0         
	//    4    6:new             #13  <Class u>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:ldc1            #15  <String "roomba">
	//    8   13:aload_0         
	//    9   14:invokevirtual   #19  <Method AssetId b()>
	//   10   17:invokevirtual   #25  <Method String AssetId.getId()>
	//   11   20:invokespecial   #28  <Method void u(KeyStore, String, String)>
	//   12   23:putfield        #30  <Field u a>
	//   13   26:return          
	}

	private void a(HttpsURLConnection httpsurlconnection)
	{
		String s = c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method String c()>
	//    2    4:astore_2        
		if(s != null && s.length() > 0)
	//*   3    5:aload_2         
	//*   4    6:ifnull          82
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #43  <Method int String.length()>
	//*   7   13:ifle            82
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #45  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void StringBuilder()>
	//   11   23:astore_3        
			stringbuilder.append("Basic ");
	//   12   24:aload_3         
	//   13   25:ldc1            #50  <String "Basic ">
	//   14   27:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			StringBuilder stringbuilder1 = new StringBuilder();
	//   16   31:new             #45  <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #48  <Method void StringBuilder()>
	//   19   38:astore          4
			stringbuilder1.append("user:");
	//   20   40:aload           4
	//   21   42:ldc1            #56  <String "user:">
	//   22   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder1.append(s);
	//   24   48:aload           4
	//   25   50:aload_2         
	//   26   51:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
			stringbuilder.append(Base64.encodeToString(stringbuilder1.toString().getBytes(), 2));
	//   28   55:aload_3         
	//   29   56:aload           4
	//   30   58:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   31   61:invokevirtual   #63  <Method byte[] String.getBytes()>
	//   32   64:iconst_2        
	//   33   65:invokestatic    #69  <Method String Base64.encodeToString(byte[], int)>
	//   34   68:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
			httpsurlconnection.setRequestProperty("Authorization", stringbuilder.toString());
	//   36   72:aload_1         
	//   37   73:ldc1            #71  <String "Authorization">
	//   38   75:aload_3         
	//   39   76:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   40   79:invokevirtual   #77  <Method void HttpsURLConnection.setRequestProperty(String, String)>
		}
	//   41   82:return          
	}

	public int a(int i)
	{
		return i != 401 ? 0 : 3;
	//    0    0:iload_1         
	//    1    1:sipush          401
	//    2    4:icmpne          9
	//    3    7:iconst_3        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public HttpURLConnection a(String s, String s1, String s2, int i)
	{
		s = ((String) (a.a(s1, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field u a>
	//    2    4:aload_2         
	//    3    5:iload           4
	//    4    7:invokevirtual   #84  <Method HttpsURLConnection u.a(String, int)>
	//    5   10:astore_1        
		if(s == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       25
			throw new IOException("Could not open a URL connection to robot.");
	//    8   15:new             #81  <Class IOException>
	//    9   18:dup             
	//   10   19:ldc1            #86  <String "Could not open a URL connection to robot.">
	//   11   21:invokespecial   #89  <Method void IOException(String)>
	//   12   24:athrow          
		((HttpsURLConnection) (s)).setDoOutput(true);
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #93  <Method void HttpsURLConnection.setDoOutput(boolean)>
		((HttpsURLConnection) (s)).setRequestProperty("Content-Type", "application/json; charset=utf-8");
	//   16   30:aload_1         
	//   17   31:ldc1            #95  <String "Content-Type">
	//   18   33:ldc1            #97  <String "application/json; charset=utf-8">
	//   19   35:invokevirtual   #77  <Method void HttpsURLConnection.setRequestProperty(String, String)>
		a(((HttpsURLConnection) (s)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokespecial   #99  <Method void a(HttpsURLConnection)>
		if(s2 == null)
			break MISSING_BLOCK_LABEL_86;
	//   23   43:aload_3         
	//   24   44:ifnull          86
		if(s2.length() <= 0)
			break MISSING_BLOCK_LABEL_86;
	//   25   47:aload_3         
	//   26   48:invokevirtual   #43  <Method int String.length()>
	//   27   51:ifle            86
		s1 = ((String) (new BufferedWriter(((java.io.Writer) (new OutputStreamWriter(((HttpsURLConnection) (s)).getOutputStream(), "UTF-8"))))));
	//   28   54:new             #101 <Class BufferedWriter>
	//   29   57:dup             
	//   30   58:new             #103 <Class OutputStreamWriter>
	//   31   61:dup             
	//   32   62:aload_1         
	//   33   63:invokevirtual   #107 <Method java.io.OutputStream HttpsURLConnection.getOutputStream()>
	//   34   66:ldc1            #109 <String "UTF-8">
	//   35   68:invokespecial   #112 <Method void OutputStreamWriter(java.io.OutputStream, String)>
	//   36   71:invokespecial   #115 <Method void BufferedWriter(java.io.Writer)>
	//   37   74:astore_2        
		((BufferedWriter) (s1)).write(s2);
	//   38   75:aload_2         
	//   39   76:aload_3         
	//   40   77:invokevirtual   #118 <Method void BufferedWriter.write(String)>
		((BufferedWriter) (s1)).close();
	//   41   80:aload_2         
	//   42   81:invokevirtual   #121 <Method void BufferedWriter.close()>
		return ((HttpURLConnection) (s));
	//   43   84:aload_1         
	//   44   85:areturn         
		try
		{
			((HttpsURLConnection) (s)).connect();
	//   45   86:aload_1         
	//   46   87:invokevirtual   #124 <Method void HttpsURLConnection.connect()>
		}
	//*  47   90:aload_1         
	//*  48   91:areturn         
	//*  49   92:aload_0         
	//*  50   93:getfield        #30  <Field u a>
	//*  51   96:invokevirtual   #126 <Method void u.a()>
	//*  52   99:aload_1         
	//*  53  100:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			a.a();
			throw s;
		}
		return ((HttpURLConnection) (s));
	//*  54  101:astore_1        
	//*  55  102:goto            92
	}

	public void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void m.a()>
		a.a();
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field u a>
	//    4    8:invokevirtual   #126 <Method void u.a()>
	//    5   11:return          
	}

	public volatile void a(String s, String s1, String s2, boolean flag, String s3, int i, n.a a1)
	{
		super.a(s, s1, s2, flag, s3, i, a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:invokespecial   #130 <Method void m.a(String, String, String, boolean, String, int, n$a)>
	//    9   15:return          
	}

	public volatile void a(HashMap hashmap)
	{
		super.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method void m.a(HashMap)>
	//    3    5:return          
	}

	public volatile AssetId b()
	{
		return super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method AssetId m.b()>
	//    2    4:areturn         
	}

	public volatile String c()
	{
		return super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method String m.c()>
	//    2    4:areturn         
	}

	public volatile NetworkAddress d()
	{
		return super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method NetworkAddress m.d()>
	//    2    4:areturn         
	}

	public volatile boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method boolean m.equals(Object)>
	//    3    5:ireturn         
	}

	public volatile int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method int m.hashCode()>
	//    2    4:ireturn         
	}

	private u a;
}
