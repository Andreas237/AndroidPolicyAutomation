// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.*;

public class NetworkInfoUtils
{

	public NetworkInfoUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String checkNetworkStatus(Context context)
	{
		Object obj = ((Object) ((ConnectivityManager)context.getSystemService("connectivity")));
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "connectivity">
	//    2    3:invokevirtual   #19  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #21  <Class ConnectivityManager>
	//    4    9:astore_1        
		context = ((Context) (((ConnectivityManager) (obj)).getNetworkInfo(1)));
	//    5   10:aload_1         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #25  <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//    8   15:astore_0        
		obj = ((Object) (((ConnectivityManager) (obj)).getNetworkInfo(0)));
	//    9   16:aload_1         
	//   10   17:iconst_0        
	//   11   18:invokevirtual   #25  <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   12   21:astore_1        
		if(((NetworkInfo) (context)).isAvailable())
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #31  <Method boolean NetworkInfo.isAvailable()>
	//*  15   26:ifeq            32
			return "2";
	//   16   29:ldc1            #33  <String "2">
	//   17   31:areturn         
		if(((NetworkInfo) (obj)).isAvailable())
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #31  <Method boolean NetworkInfo.isAvailable()>
	//*  20   36:ifeq            42
			return "3";
	//   21   39:ldc1            #35  <String "3">
	//   22   41:areturn         
		else
			return "0";
	//   23   42:ldc1            #37  <String "0">
	//   24   44:areturn         
	}

	public static String getIPAddress(boolean flag)
	{
		Object obj = ((Object) (((List) (Collections.list(NetworkInterface.getNetworkInterfaces()))).iterator()));
	//    0    0:invokestatic    #47  <Method java.util.Enumeration NetworkInterface.getNetworkInterfaces()>
	//    1    3:invokestatic    #53  <Method java.util.ArrayList Collections.list(java.util.Enumeration)>
	//    2    6:invokeinterface #59  <Method Iterator List.iterator()>
	//    3   11:astore_2        
_L9:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
	//    4   12:aload_2         
	//    5   13:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            127
_L1:
		Iterator iterator = ((List) (Collections.list(((NetworkInterface)((Iterator) (obj)).next()).getInetAddresses()))).iterator();
	//    7   21:aload_2         
	//    8   22:invokeinterface #68  <Method Object Iterator.next()>
	//    9   27:checkcast       #43  <Class NetworkInterface>
	//   10   30:invokevirtual   #71  <Method java.util.Enumeration NetworkInterface.getInetAddresses()>
	//   11   33:invokestatic    #53  <Method java.util.ArrayList Collections.list(java.util.Enumeration)>
	//   12   36:invokeinterface #59  <Method Iterator List.iterator()>
	//   13   41:astore_3        
_L5:
		Object obj1;
		do
		{
			if(!iterator.hasNext())
				continue; /* Loop/switch isn't completed */
	//   14   42:aload_3         
	//   15   43:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   16   48:ifeq            12
			obj1 = ((Object) ((InetAddress)iterator.next()));
	//   17   51:aload_3         
	//   18   52:invokeinterface #68  <Method Object Iterator.next()>
	//   19   57:checkcast       #73  <Class InetAddress>
	//   20   60:astore          4
		} while(((InetAddress) (obj1)).isLoopbackAddress());
	//   21   62:aload           4
	//   22   64:invokevirtual   #76  <Method boolean InetAddress.isLoopbackAddress()>
	//   23   67:ifne            42
		obj1 = ((Object) (((InetAddress) (obj1)).getHostAddress()));
	//   24   70:aload           4
	//   25   72:invokevirtual   #80  <Method String InetAddress.getHostAddress()>
	//   26   75:astore          4
		int i;
		Exception exception;
		if(((String) (obj1)).indexOf(':') < 0)
	//*  27   77:aload           4
	//*  28   79:bipush          58
	//*  29   81:invokevirtual   #86  <Method int String.indexOf(int)>
	//*  30   84:ifge            134
			i = 1;
	//   31   87:iconst_1        
	//   32   88:istore_1        
		else
	//*  33   89:goto            136
	//*  34   92:iload_1         
	//*  35   93:ifne            42
	//*  36   96:aload           4
	//*  37   98:bipush          37
	//*  38  100:invokevirtual   #86  <Method int String.indexOf(int)>
	//*  39  103:istore_1        
	//*  40  104:iload_1         
	//*  41  105:ifge            114
	//*  42  108:aload           4
	//*  43  110:invokevirtual   #89  <Method String String.toUpperCase()>
	//*  44  113:areturn         
	//*  45  114:aload           4
	//*  46  116:iconst_0        
	//*  47  117:iload_1         
	//*  48  118:invokevirtual   #93  <Method String String.substring(int, int)>
	//*  49  121:invokevirtual   #89  <Method String String.toUpperCase()>
	//*  50  124:astore_2        
	//*  51  125:aload_2         
	//*  52  126:areturn         
	//*  53  127:ldc1            #95  <String "">
	//*  54  129:areturn         
	//*  55  130:astore_2        
	//*  56  131:goto            127
			i = 0;
	//   57  134:iconst_0        
	//   58  135:istore_1        
		  goto _L3
_L7:
		if(i != 0) goto _L5; else goto _L4
_L4:
		i = ((String) (obj1)).indexOf('%');
		if(i >= 0)
			break MISSING_BLOCK_LABEL_114;
		return ((String) (obj1)).toUpperCase();
		obj = ((Object) (((String) (obj1)).substring(0, i).toUpperCase()));
		return ((String) (obj));
_L2:
		return "";
		exception;
		if(true) goto _L2; else goto _L3
_L3:
		if(!flag) goto _L7; else goto _L6
	//   59  136:iload_0         
	//   60  137:ifeq            92
_L6:
		if(i != 0)
	//*  61  140:iload_1         
	//*  62  141:ifeq            42
			return ((String) (obj1));
	//   63  144:aload           4
	//   64  146:areturn         
		  goto _L5
		if(true) goto _L9; else goto _L8
_L8:
	}
}
