// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.*;
import java.net.*;
import java.util.*;

public class DemoUtil
{

	public DemoUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	private static byte[] convertInputStreamToByteArray(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #57  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		byte abyte0[] = new byte[1024];
	//    4    8:sipush          1024
	//    5   11:newarray        byte[]
	//    6   13:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    7   14:aload_0         
	//    8   15:aload_3         
	//    9   16:invokevirtual   #64  <Method int InputStream.read(byte[])>
	//   10   19:istore_1        
			if(i != -1)
	//*  11   20:iload_1         
	//*  12   21:iconst_m1       
	//*  13   22:icmpeq          35
			{
				bytearrayoutputstream.write(abyte0, 0, i);
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:iconst_0        
	//   17   28:iload_1         
	//   18   29:invokevirtual   #68  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			} else
	//*  19   32:goto            14
			{
				bytearrayoutputstream.flush();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #71  <Method void ByteArrayOutputStream.flush()>
				bytearrayoutputstream.close();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #74  <Method void ByteArrayOutputStream.close()>
				inputstream.close();
	//   24   43:aload_0         
	//   25   44:invokevirtual   #75  <Method void InputStream.close()>
				return bytearrayoutputstream.toByteArray();
	//   26   47:aload_2         
	//   27   48:invokevirtual   #79  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   28   51:areturn         
			}
		} while(true);
	}

	public static byte[] executePost(String s, byte abyte0[], Map map)
		throws MalformedURLException, IOException
	{
		s = ((String) ((HttpURLConnection)(new URL(s)).openConnection()));
	//    0    0:new             #86  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #89  <Method void URL(String)>
	//    4    8:invokevirtual   #93  <Method java.net.URLConnection URL.openConnection()>
	//    5   11:checkcast       #95  <Class HttpURLConnection>
	//    6   14:astore_0        
		((HttpURLConnection) (s)).setRequestMethod("POST");
	//    7   15:aload_0         
	//    8   16:ldc1            #97  <String "POST">
	//    9   18:invokevirtual   #100 <Method void HttpURLConnection.setRequestMethod(String)>
		boolean flag;
		if(abyte0 != null)
	//*  10   21:aload_1         
	//*  11   22:ifnull          170
			flag = true;
	//   12   25:iconst_1        
	//   13   26:istore_3        
		else
	//*  14   27:goto            30
	//*  15   30:aload_0         
	//*  16   31:iload_3         
	//*  17   32:invokevirtual   #104 <Method void HttpURLConnection.setDoOutput(boolean)>
	//*  18   35:aload_0         
	//*  19   36:iconst_1        
	//*  20   37:invokevirtual   #107 <Method void HttpURLConnection.setDoInput(boolean)>
	//*  21   40:aload_2         
	//*  22   41:ifnull          103
	//*  23   44:aload_2         
	//*  24   45:invokeinterface #113 <Method Set Map.entrySet()>
	//*  25   50:invokeinterface #119 <Method Iterator Set.iterator()>
	//*  26   55:astore_2        
	//*  27   56:aload_2         
	//*  28   57:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//*  29   62:ifeq            103
	//*  30   65:aload_2         
	//*  31   66:invokeinterface #129 <Method Object Iterator.next()>
	//*  32   71:checkcast       #131 <Class java.util.Map$Entry>
	//*  33   74:astore          4
	//*  34   76:aload_0         
	//*  35   77:aload           4
	//*  36   79:invokeinterface #134 <Method Object java.util.Map$Entry.getKey()>
	//*  37   84:checkcast       #136 <Class String>
	//*  38   87:aload           4
	//*  39   89:invokeinterface #139 <Method Object java.util.Map$Entry.getValue()>
	//*  40   94:checkcast       #136 <Class String>
	//*  41   97:invokevirtual   #143 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  42  100:goto            56
	//*  43  103:aload_1         
	//*  44  104:ifnull          128
	//*  45  107:new             #145 <Class BufferedOutputStream>
	//*  46  110:dup             
	//*  47  111:aload_0         
	//*  48  112:invokevirtual   #149 <Method OutputStream HttpURLConnection.getOutputStream()>
	//*  49  115:invokespecial   #152 <Method void BufferedOutputStream(OutputStream)>
	//*  50  118:astore_2        
	//*  51  119:aload_2         
	//*  52  120:aload_1         
	//*  53  121:invokevirtual   #157 <Method void OutputStream.write(byte[])>
	//*  54  124:aload_2         
	//*  55  125:invokevirtual   #158 <Method void OutputStream.close()>
	//*  56  128:new             #160 <Class BufferedInputStream>
	//*  57  131:dup             
	//*  58  132:aload_0         
	//*  59  133:invokevirtual   #164 <Method InputStream HttpURLConnection.getInputStream()>
	//*  60  136:invokespecial   #167 <Method void BufferedInputStream(InputStream)>
	//*  61  139:invokestatic    #169 <Method byte[] convertInputStreamToByteArray(InputStream)>
	//*  62  142:astore_1        
	//*  63  143:aload_0         
	//*  64  144:ifnull          151
	//*  65  147:aload_0         
	//*  66  148:invokevirtual   #172 <Method void HttpURLConnection.disconnect()>
	//*  67  151:aload_1         
	//*  68  152:areturn         
	//*  69  153:astore_1        
	//*  70  154:goto            160
	//*  71  157:astore_1        
	//*  72  158:aconst_null     
	//*  73  159:astore_0        
	//*  74  160:aload_0         
	//*  75  161:ifnull          168
	//*  76  164:aload_0         
	//*  77  165:invokevirtual   #172 <Method void HttpURLConnection.disconnect()>
	//*  78  168:aload_1         
	//*  79  169:athrow          
			flag = false;
	//   80  170:iconst_0        
	//   81  171:istore_3        
		((HttpURLConnection) (s)).setDoOutput(flag);
		((HttpURLConnection) (s)).setDoInput(true);
		if(map == null)
			break MISSING_BLOCK_LABEL_103;
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((HttpURLConnection) (s)).setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
			entry = (java.util.Map.Entry)((Iterator) (map)).next();

		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_128;
		map = ((Map) (new BufferedOutputStream(((HttpURLConnection) (s)).getOutputStream())));
		((OutputStream) (map)).write(abyte0);
		((OutputStream) (map)).close();
		abyte0 = convertInputStreamToByteArray(((InputStream) (new BufferedInputStream(((HttpURLConnection) (s)).getInputStream()))));
		if(s != null)
			((HttpURLConnection) (s)).disconnect();
		return abyte0;
		abyte0;
		break MISSING_BLOCK_LABEL_160;
		abyte0;
		s = null;
		if(s != null)
			((HttpURLConnection) (s)).disconnect();
		throw abyte0;
	//*  82  172:goto            30
	}

	public static String getUserAgent(Context context)
	{
		try
		{
			String s = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method String Context.getPackageName()>
	//    2    4:astore_1        
			context = ((Context) (context.getPackageManager().getPackageInfo(s, 0).versionName));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #188 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #194 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   14:getfield        #200 <Field String PackageInfo.versionName>
	//    9   17:astore_0        
		}
	//*  10   18:goto            24
	//*  11   21:ldc1            #202 <String "?">
	//*  12   23:astore_0        
	//*  13   24:new             #204 <Class StringBuilder>
	//*  14   27:dup             
	//*  15   28:invokespecial   #205 <Method void StringBuilder()>
	//*  16   31:astore_1        
	//*  17   32:aload_1         
	//*  18   33:ldc1            #207 <String "VeeplayPlayer/">
	//*  19   35:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//*  20   38:pop             
	//*  21   39:aload_1         
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//*  24   44:pop             
	//*  25   45:aload_1         
	//*  26   46:ldc1            #213 <String " (Linux;Android ">
	//*  27   48:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//*  28   51:pop             
	//*  29   52:aload_1         
	//*  30   53:getstatic       #218 <Field String android.os.Build$VERSION.RELEASE>
	//*  31   56:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//*  32   59:pop             
	//*  33   60:aload_1         
	//*  34   61:ldc1            #220 <String ") ExoPlayerLib/">
	//*  35   63:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//*  36   66:pop             
	//*  37   67:aload_1         
	//*  38   68:ldc1            #222 <String "1.5.15">
	//*  39   70:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//*  40   73:pop             
	//*  41   74:aload_1         
	//*  42   75:invokevirtual   #225 <Method String StringBuilder.toString()>
	//*  43   78:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = "?";
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("VeeplayPlayer/");
		stringbuilder.append(((String) (context)));
		stringbuilder.append(" (Linux;Android ");
		stringbuilder.append(android.os.Build.VERSION.RELEASE);
		stringbuilder.append(") ExoPlayerLib/");
		stringbuilder.append("1.5.15");
		return stringbuilder.toString();
	//*  44   79:astore_0        
	//*  45   80:goto            21
	}

	public static void setDefaultCookieManager()
	{
		CookieHandler cookiehandler = CookieHandler.getDefault();
	//    0    0:invokestatic    #232 <Method CookieHandler CookieHandler.getDefault()>
	//    1    3:astore_0        
		CookieManager cookiemanager = defaultCookieManager;
	//    2    4:getstatic       #39  <Field CookieManager defaultCookieManager>
	//    3    7:astore_1        
		if(cookiehandler != cookiemanager)
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:if_acmpeq       17
			CookieHandler.setDefault(((CookieHandler) (cookiemanager)));
	//    7   13:aload_1         
	//    8   14:invokestatic    #236 <Method void CookieHandler.setDefault(CookieHandler)>
	//    9   17:return          
	}

	public static final int TYPE_DASH = 0;
	public static final int TYPE_HLS = 3;
	public static final int TYPE_MP4 = 4;
	public static final int TYPE_OTHER = 2;
	public static final int TYPE_SS = 1;
	public static final UUID WIDEVINE_UUID = new UUID(0x79d64aceL, 0xd51d21edL);
	private static final CookieManager defaultCookieManager;

	static 
	{
	//    0    0:new             #23  <Class UUID>
	//    1    3:dup             
	//    2    4:ldc2w           #24  <Long 0x79d64aceL>
	//    3    7:ldc2w           #26  <Long 0xd51d21edL>
	//    4   10:invokespecial   #31  <Method void UUID(long, long)>
	//    5   13:putstatic       #33  <Field UUID WIDEVINE_UUID>
		defaultCookieManager = new CookieManager();
	//    6   16:new             #35  <Class CookieManager>
	//    7   19:dup             
	//    8   20:invokespecial   #37  <Method void CookieManager()>
	//    9   23:putstatic       #39  <Field CookieManager defaultCookieManager>
		defaultCookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
	//   10   26:getstatic       #39  <Field CookieManager defaultCookieManager>
	//   11   29:getstatic       #45  <Field CookiePolicy CookiePolicy.ACCEPT_ORIGINAL_SERVER>
	//   12   32:invokevirtual   #49  <Method void CookieManager.setCookiePolicy(CookiePolicy)>
	//*  13   35:return          
	}
}
