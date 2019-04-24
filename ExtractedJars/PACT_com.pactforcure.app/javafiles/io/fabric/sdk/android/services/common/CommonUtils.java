// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.*;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.*;
import java.security.*;
import java.util.*;
import java.util.regex.Pattern;
import javax.crypto.Cipher;

public class CommonUtils
{
	static final class Architecture extends Enum
	{

		static Architecture getValue()
		{
			Object obj = ((Object) (Build.CPU_ABI));
		//    0    0:getstatic       #94  <Field String Build.CPU_ABI>
		//    1    3:astore_0        
			if(TextUtils.isEmpty(((CharSequence) (obj))))
		//*   2    4:aload_0         
		//*   3    5:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   4    8:ifeq            29
			{
				Fabric.getLogger().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
		//    5   11:invokestatic    #106 <Method Logger Fabric.getLogger()>
		//    6   14:ldc1            #108 <String "Fabric">
		//    7   16:ldc1            #110 <String "Architecture#getValue()::Build.CPU_ABI returned null or empty">
		//    8   18:invokeinterface #116 <Method void Logger.d(String, String)>
				obj = ((Object) (UNKNOWN));
		//    9   23:getstatic       #54  <Field CommonUtils$Architecture UNKNOWN>
		//   10   26:astore_0        
			} else
		//*  11   27:aload_0         
		//*  12   28:areturn         
			{
				obj = ((Object) (((String) (obj)).toLowerCase(Locale.US)));
		//   13   29:aload_0         
		//   14   30:getstatic       #122 <Field Locale Locale.US>
		//   15   33:invokevirtual   #128 <Method String String.toLowerCase(Locale)>
		//   16   36:astore_0        
				Architecture architecture = (Architecture)matcher.get(obj);
		//   17   37:getstatic       #69  <Field Map matcher>
		//   18   40:aload_0         
		//   19   41:invokeinterface #132 <Method Object Map.get(Object)>
		//   20   46:checkcast       #2   <Class CommonUtils$Architecture>
		//   21   49:astore_1        
				obj = ((Object) (architecture));
		//   22   50:aload_1         
		//   23   51:astore_0        
				if(architecture == null)
		//*  24   52:aload_1         
		//*  25   53:ifnonnull       27
					return UNKNOWN;
		//   26   56:getstatic       #54  <Field CommonUtils$Architecture UNKNOWN>
		//   27   59:areturn         
			}
			return ((Architecture) (obj));
		}

		public static Architecture valueOf(String s)
		{
			return (Architecture)Enum.valueOf(io/fabric/sdk/android/services/common/CommonUtils$Architecture, s);
		//    0    0:ldc1            #2   <Class CommonUtils$Architecture>
		//    1    2:aload_0         
		//    2    3:invokestatic    #137 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CommonUtils$Architecture>
		//    4    9:areturn         
		}

		public static Architecture[] values()
		{
			return (Architecture[])((Architecture []) ($VALUES)).clone();
		//    0    0:getstatic       #62  <Field CommonUtils$Architecture[] $VALUES>
		//    1    3:invokevirtual   #144 <Method Object _5B_Lio.fabric.sdk.android.services.common.CommonUtils$Architecture_3B_.clone()>
		//    2    6:checkcast       #140 <Class CommonUtils$Architecture[]>
		//    3    9:areturn         
		}

		private static final Architecture $VALUES[];
		public static final Architecture ARM64;
		public static final Architecture ARMV6;
		public static final Architecture ARMV7;
		public static final Architecture ARMV7S;
		public static final Architecture ARM_UNKNOWN;
		public static final Architecture PPC;
		public static final Architecture PPC64;
		public static final Architecture UNKNOWN;
		public static final Architecture X86_32;
		public static final Architecture X86_64;
		private static final Map matcher;

		static 
		{
			X86_32 = new Architecture("X86_32", 0);
		//    0    0:new             #2   <Class CommonUtils$Architecture>
		//    1    3:dup             
		//    2    4:ldc1            #27  <String "X86_32">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//    5   10:putstatic       #33  <Field CommonUtils$Architecture X86_32>
			X86_64 = new Architecture("X86_64", 1);
		//    6   13:new             #2   <Class CommonUtils$Architecture>
		//    7   16:dup             
		//    8   17:ldc1            #34  <String "X86_64">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   11   23:putstatic       #36  <Field CommonUtils$Architecture X86_64>
			ARM_UNKNOWN = new Architecture("ARM_UNKNOWN", 2);
		//   12   26:new             #2   <Class CommonUtils$Architecture>
		//   13   29:dup             
		//   14   30:ldc1            #37  <String "ARM_UNKNOWN">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   17   36:putstatic       #39  <Field CommonUtils$Architecture ARM_UNKNOWN>
			PPC = new Architecture("PPC", 3);
		//   18   39:new             #2   <Class CommonUtils$Architecture>
		//   19   42:dup             
		//   20   43:ldc1            #40  <String "PPC">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   23   49:putstatic       #42  <Field CommonUtils$Architecture PPC>
			PPC64 = new Architecture("PPC64", 4);
		//   24   52:new             #2   <Class CommonUtils$Architecture>
		//   25   55:dup             
		//   26   56:ldc1            #43  <String "PPC64">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   29   62:putstatic       #45  <Field CommonUtils$Architecture PPC64>
			ARMV6 = new Architecture("ARMV6", 5);
		//   30   65:new             #2   <Class CommonUtils$Architecture>
		//   31   68:dup             
		//   32   69:ldc1            #46  <String "ARMV6">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   35   75:putstatic       #48  <Field CommonUtils$Architecture ARMV6>
			ARMV7 = new Architecture("ARMV7", 6);
		//   36   78:new             #2   <Class CommonUtils$Architecture>
		//   37   81:dup             
		//   38   82:ldc1            #49  <String "ARMV7">
		//   39   84:bipush          6
		//   40   86:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   41   89:putstatic       #51  <Field CommonUtils$Architecture ARMV7>
			UNKNOWN = new Architecture("UNKNOWN", 7);
		//   42   92:new             #2   <Class CommonUtils$Architecture>
		//   43   95:dup             
		//   44   96:ldc1            #52  <String "UNKNOWN">
		//   45   98:bipush          7
		//   46  100:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   47  103:putstatic       #54  <Field CommonUtils$Architecture UNKNOWN>
			ARMV7S = new Architecture("ARMV7S", 8);
		//   48  106:new             #2   <Class CommonUtils$Architecture>
		//   49  109:dup             
		//   50  110:ldc1            #55  <String "ARMV7S">
		//   51  112:bipush          8
		//   52  114:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   53  117:putstatic       #57  <Field CommonUtils$Architecture ARMV7S>
			ARM64 = new Architecture("ARM64", 9);
		//   54  120:new             #2   <Class CommonUtils$Architecture>
		//   55  123:dup             
		//   56  124:ldc1            #58  <String "ARM64">
		//   57  126:bipush          9
		//   58  128:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
		//   59  131:putstatic       #60  <Field CommonUtils$Architecture ARM64>
			$VALUES = (new Architecture[] {
				X86_32, X86_64, ARM_UNKNOWN, PPC, PPC64, ARMV6, ARMV7, UNKNOWN, ARMV7S, ARM64
			});
		//   60  134:bipush          10
		//   61  136:anewarray       Architecture[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #33  <Field CommonUtils$Architecture X86_32>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #36  <Field CommonUtils$Architecture X86_64>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #39  <Field CommonUtils$Architecture ARM_UNKNOWN>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #42  <Field CommonUtils$Architecture PPC>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #45  <Field CommonUtils$Architecture PPC64>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #48  <Field CommonUtils$Architecture ARMV6>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #51  <Field CommonUtils$Architecture ARMV7>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #54  <Field CommonUtils$Architecture UNKNOWN>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #57  <Field CommonUtils$Architecture ARMV7S>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #60  <Field CommonUtils$Architecture ARM64>
		//  101  202:aastore         
		//  102  203:putstatic       #62  <Field CommonUtils$Architecture[] $VALUES>
			matcher = ((Map) (new HashMap(4)));
		//  103  206:new             #64  <Class HashMap>
		//  104  209:dup             
		//  105  210:iconst_4        
		//  106  211:invokespecial   #67  <Method void HashMap(int)>
		//  107  214:putstatic       #69  <Field Map matcher>
			matcher.put("armeabi-v7a", ((Object) (ARMV7)));
		//  108  217:getstatic       #69  <Field Map matcher>
		//  109  220:ldc1            #71  <String "armeabi-v7a">
		//  110  222:getstatic       #51  <Field CommonUtils$Architecture ARMV7>
		//  111  225:invokeinterface #77  <Method Object Map.put(Object, Object)>
		//  112  230:pop             
			matcher.put("armeabi", ((Object) (ARMV6)));
		//  113  231:getstatic       #69  <Field Map matcher>
		//  114  234:ldc1            #79  <String "armeabi">
		//  115  236:getstatic       #48  <Field CommonUtils$Architecture ARMV6>
		//  116  239:invokeinterface #77  <Method Object Map.put(Object, Object)>
		//  117  244:pop             
			matcher.put("arm64-v8a", ((Object) (ARM64)));
		//  118  245:getstatic       #69  <Field Map matcher>
		//  119  248:ldc1            #81  <String "arm64-v8a">
		//  120  250:getstatic       #60  <Field CommonUtils$Architecture ARM64>
		//  121  253:invokeinterface #77  <Method Object Map.put(Object, Object)>
		//  122  258:pop             
			matcher.put("x86", ((Object) (X86_32)));
		//  123  259:getstatic       #69  <Field Map matcher>
		//  124  262:ldc1            #83  <String "x86">
		//  125  264:getstatic       #33  <Field CommonUtils$Architecture X86_32>
		//  126  267:invokeinterface #77  <Method Object Map.put(Object, Object)>
		//  127  272:pop             
		//* 128  273:return          
		}

		private Architecture(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #85  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public CommonUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Object()>
	//    2    4:return          
	}

	public static long calculateFreeRamInBytes(Context context)
	{
		android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
	//    0    0:new             #123 <Class android.app.ActivityManager$MemoryInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void android.app.ActivityManager$MemoryInfo()>
	//    3    7:astore_1        
		((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
	//    4    8:aload_0         
	//    5    9:ldc1            #126 <String "activity">
	//    6   11:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    7   14:checkcast       #134 <Class ActivityManager>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #138 <Method void ActivityManager.getMemoryInfo(android.app.ActivityManager$MemoryInfo)>
		return memoryinfo.availMem;
	//   10   21:aload_1         
	//   11   22:getfield        #141 <Field long android.app.ActivityManager$MemoryInfo.availMem>
	//   12   25:lreturn         
	}

	public static long calculateUsedDiskSpaceInBytes(String s)
	{
		s = ((String) (new StatFs(s)));
	//    0    0:new             #145 <Class StatFs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #148 <Method void StatFs(String)>
	//    4    8:astore_0        
		long l = ((StatFs) (s)).getBlockSize();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #152 <Method int StatFs.getBlockSize()>
	//    7   13:i2l             
	//    8   14:lstore_1        
		return l * (long)((StatFs) (s)).getBlockCount() - l * (long)((StatFs) (s)).getAvailableBlocks();
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #155 <Method int StatFs.getBlockCount()>
	//   12   20:i2l             
	//   13   21:lmul            
	//   14   22:lload_1         
	//   15   23:aload_0         
	//   16   24:invokevirtual   #158 <Method int StatFs.getAvailableBlocks()>
	//   17   27:i2l             
	//   18   28:lmul            
	//   19   29:lsub            
	//   20   30:lreturn         
	}

	public static boolean canTryConnection(Context context)
	{
label0:
		{
			if(checkPermission(context, "android.permission.ACCESS_NETWORK_STATE"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #162 <String "android.permission.ACCESS_NETWORK_STATE">
	//*   2    3:invokestatic    #166 <Method boolean checkPermission(Context, String)>
	//*   3    6:ifeq            33
			{
				context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()));
	//    4    9:aload_0         
	//    5   10:ldc1            #168 <String "connectivity">
	//    6   12:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    7   15:checkcast       #170 <Class ConnectivityManager>
	//    8   18:invokevirtual   #174 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    9   21:astore_0        
				if(context == null || !((NetworkInfo) (context)).isConnectedOrConnecting())
					break label0;
	//   10   22:aload_0         
	//   11   23:ifnull          35
	//   12   26:aload_0         
	//   13   27:invokevirtual   #180 <Method boolean NetworkInfo.isConnectedOrConnecting()>
	//   14   30:ifeq            35
			}
			return true;
	//   15   33:iconst_1        
	//   16   34:ireturn         
		}
		return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	public static boolean checkPermission(Context context, String s)
	{
		return context.checkCallingOrSelfPermission(s) == 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #184 <Method int Context.checkCallingOrSelfPermission(String)>
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static void closeOrLog(Closeable closeable, String s)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #193 <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
		Fabric.getLogger().e("Fabric", s, ((Throwable) (closeable)));
	//    6   12:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    7   15:ldc1            #201 <String "Fabric">
	//    8   17:aload_1         
	//    9   18:aload_0         
	//   10   19:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
		return;
	//   11   24:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #193 <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
		throw closeable;
	//    6   12:aload_0         
	//    7   13:athrow          
		closeable;
	//    8   14:astore_0        
	//    9   15:return          
	}

	static long convertMemInfoToBytes(String s, String s1, int i)
	{
		return Long.parseLong(s.split(s1)[0].trim()) * (long)i;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #221 <Method String[] String.split(String)>
	//    3    5:iconst_0        
	//    4    6:aaload          
	//    5    7:invokevirtual   #225 <Method String String.trim()>
	//    6   10:invokestatic    #230 <Method long Long.parseLong(String)>
	//    7   13:iload_2         
	//    8   14:i2l             
	//    9   15:lmul            
	//   10   16:lreturn         
	}

	public static void copyStream(InputStream inputstream, OutputStream outputstream, byte abyte0[])
		throws IOException
	{
		do
		{
			int i = inputstream.read(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #238 <Method int InputStream.read(byte[])>
	//    3    5:istore_3        
			if(i != -1)
	//*   4    6:iload_3         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          21
				outputstream.write(abyte0, 0, i);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:iconst_0        
	//   10   14:iload_3         
	//   11   15:invokevirtual   #244 <Method void OutputStream.write(byte[], int, int)>
			else
	//*  12   18:goto            0
				return;
	//   13   21:return          
		} while(true);
	}

	public static Cipher createCipher(int i, String s)
		throws InvalidKeyException
	{
		throw new InvalidKeyException("This method is deprecated");
	//    0    0:new             #249 <Class InvalidKeyException>
	//    1    3:dup             
	//    2    4:ldc1            #252 <String "This method is deprecated">
	//    3    6:invokespecial   #253 <Method void InvalidKeyException(String)>
	//    4    9:athrow          
	}

	public static transient String createInstanceIdFrom(String as[])
	{
		if(as != null && as.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
		{
			Object obj = ((Object) (new ArrayList()));
	//    7   11:new             #258 <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #259 <Method void ArrayList()>
	//   10   18:astore_3        
			int j = as.length;
	//   11   19:aload_0         
	//   12   20:arraylength     
	//   13   21:istore_2        
			for(int i = 0; i < j; i++)
	//*  14   22:iconst_0        
	//*  15   23:istore_1        
	//*  16   24:iload_1         
	//*  17   25:iload_2         
	//*  18   26:icmpge          70
			{
				String s = as[i];
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:aaload          
	//   22   32:astore          4
				if(s != null)
	//*  23   34:aload           4
	//*  24   36:ifnull          63
					((List) (obj)).add(((Object) (s.replace("-", "").toLowerCase(Locale.US))));
	//   25   39:aload_3         
	//   26   40:aload           4
	//   27   42:ldc2            #261 <String "-">
	//   28   45:ldc2            #263 <String "">
	//   29   48:invokevirtual   #267 <Method String String.replace(CharSequence, CharSequence)>
	//   30   51:getstatic       #273 <Field Locale Locale.US>
	//   31   54:invokevirtual   #277 <Method String String.toLowerCase(Locale)>
	//   32   57:invokeinterface #283 <Method boolean List.add(Object)>
	//   33   62:pop             
			}

	//   34   63:iload_1         
	//   35   64:iconst_1        
	//   36   65:iadd            
	//   37   66:istore_1        
	//*  38   67:goto            24
			Collections.sort(((List) (obj)));
	//   39   70:aload_3         
	//   40   71:invokestatic    #289 <Method void Collections.sort(List)>
			as = ((String []) (new StringBuilder()));
	//   41   74:new             #291 <Class StringBuilder>
	//   42   77:dup             
	//   43   78:invokespecial   #292 <Method void StringBuilder()>
	//   44   81:astore_0        
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((StringBuilder) (as)).append((String)((Iterator) (obj)).next()));
	//   45   82:aload_3         
	//   46   83:invokeinterface #296 <Method Iterator List.iterator()>
	//   47   88:astore_3        
	//   48   89:aload_3         
	//   49   90:invokeinterface #301 <Method boolean Iterator.hasNext()>
	//   50   95:ifeq            115
	//   51   98:aload_0         
	//   52   99:aload_3         
	//   53  100:invokeinterface #305 <Method Object Iterator.next()>
	//   54  105:checkcast       #217 <Class String>
	//   55  108:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   56  111:pop             
	//*  57  112:goto            89
			as = ((String []) (((StringBuilder) (as)).toString()));
	//   58  115:aload_0         
	//   59  116:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   60  119:astore_0        
			if(((String) (as)).length() > 0)
	//*  61  120:aload_0         
	//*  62  121:invokevirtual   #315 <Method int String.length()>
	//*  63  124:ifle            9
				return sha1(((String) (as)));
	//   64  127:aload_0         
	//   65  128:invokestatic    #319 <Method String sha1(String)>
	//   66  131:areturn         
		}
		return null;
	}

	public static byte[] dehexify(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #315 <Method int String.length()>
	//    2    4:istore_2        
		byte abyte0[] = new byte[j / 2];
	//    3    5:iload_2         
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:newarray        byte[]
	//    7   10:astore_3        
		for(int i = 0; i < j; i += 2)
	//*   8   11:iconst_0        
	//*   9   12:istore_1        
	//*  10   13:iload_1         
	//*  11   14:iload_2         
	//*  12   15:icmpge          56
			abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
	//   13   18:aload_3         
	//   14   19:iload_1         
	//   15   20:iconst_2        
	//   16   21:idiv            
	//   17   22:aload_0         
	//   18   23:iload_1         
	//   19   24:invokevirtual   #325 <Method char String.charAt(int)>
	//   20   27:bipush          16
	//   21   29:invokestatic    #331 <Method int Character.digit(char, int)>
	//   22   32:iconst_4        
	//   23   33:ishl            
	//   24   34:aload_0         
	//   25   35:iload_1         
	//   26   36:iconst_1        
	//   27   37:iadd            
	//   28   38:invokevirtual   #325 <Method char String.charAt(int)>
	//   29   41:bipush          16
	//   30   43:invokestatic    #331 <Method int Character.digit(char, int)>
	//   31   46:iadd            
	//   32   47:int2byte        
	//   33   48:bastore         

	//   34   49:iload_1         
	//   35   50:iconst_2        
	//   36   51:iadd            
	//   37   52:istore_1        
	//*  38   53:goto            13
		return abyte0;
	//   39   56:aload_3         
	//   40   57:areturn         
	}

	public static String extractFieldFromSystemFile(File file, String s)
	{
		Object obj;
		Object obj2;
		String s1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj2 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		if(!file.exists())
			break MISSING_BLOCK_LABEL_90;
	//    4    5:aload_0         
	//    5    6:invokevirtual   #338 <Method boolean File.exists()>
	//    6    9:ifeq            90
		obj = null;
	//    7   12:aconst_null     
	//    8   13:astore_2        
		s1 = null;
	//    9   14:aconst_null     
	//   10   15:astore          5
		Object obj1 = ((Object) (new BufferedReader(((java.io.Reader) (new FileReader(file))), 1024)));
	//   11   17:new             #340 <Class BufferedReader>
	//   12   20:dup             
	//   13   21:new             #342 <Class FileReader>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #345 <Method void FileReader(File)>
	//   17   29:sipush          1024
	//   18   32:invokespecial   #348 <Method void BufferedReader(java.io.Reader, int)>
	//   19   35:astore_3        
_L2:
		s1 = ((BufferedReader) (obj1)).readLine();
	//   20   36:aload_3         
	//   21   37:invokevirtual   #351 <Method String BufferedReader.readLine()>
	//   22   40:astore          5
		obj = ((Object) (obj2));
	//   23   42:aload           4
	//   24   44:astore_2        
		if(s1 == null)
			break; /* Loop/switch isn't completed */
	//   25   45:aload           5
	//   26   47:ifnull          83
		obj = ((Object) (Pattern.compile("\\s*:\\s*").split(((CharSequence) (s1)), 2)));
	//   27   50:ldc2            #353 <String "\\s*:\\s*">
	//   28   53:invokestatic    #359 <Method Pattern Pattern.compile(String)>
	//   29   56:aload           5
	//   30   58:iconst_2        
	//   31   59:invokevirtual   #362 <Method String[] Pattern.split(CharSequence, int)>
	//   32   62:astore_2        
		if(obj.length <= 1 || !obj[0].equals(((Object) (s))))
			continue; /* Loop/switch isn't completed */
	//   33   63:aload_2         
	//   34   64:arraylength     
	//   35   65:iconst_1        
	//   36   66:icmple          36
	//   37   69:aload_2         
	//   38   70:iconst_0        
	//   39   71:aaload          
	//   40   72:aload_1         
	//   41   73:invokevirtual   #365 <Method boolean String.equals(Object)>
	//   42   76:ifeq            36
		obj = ((Object) (obj[1]));
	//   43   79:aload_2         
	//   44   80:iconst_1        
	//   45   81:aaload          
	//   46   82:astore_2        
		break; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L1
_L1:
		closeOrLog(((Closeable) (obj1)), "Failed to close system file reader.");
	//   47   83:aload_3         
	//   48   84:ldc2            #367 <String "Failed to close system file reader.">
	//   49   87:invokestatic    #369 <Method void closeOrLog(Closeable, String)>
		return ((String) (obj));
	//   50   90:aload_2         
	//   51   91:areturn         
		obj1;
	//   52   92:astore_3        
		s = s1;
	//   53   93:aload           5
	//   54   95:astore_1        
_L6:
		obj = ((Object) (s));
	//   55   96:aload_1         
	//   56   97:astore_2        
		Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Error parsing ").append(((Object) (file))).toString(), ((Throwable) (obj1)));
	//   57   98:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   58  101:ldc1            #201 <String "Fabric">
	//   59  103:new             #291 <Class StringBuilder>
	//   60  106:dup             
	//   61  107:invokespecial   #292 <Method void StringBuilder()>
	//   62  110:ldc2            #371 <String "Error parsing ">
	//   63  113:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   64  116:aload_0         
	//   65  117:invokevirtual   #374 <Method StringBuilder StringBuilder.append(Object)>
	//   66  120:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   67  123:aload_3         
	//   68  124:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
		closeOrLog(((Closeable) (s)), "Failed to close system file reader.");
	//   69  129:aload_1         
	//   70  130:ldc2            #367 <String "Failed to close system file reader.">
	//   71  133:invokestatic    #369 <Method void closeOrLog(Closeable, String)>
		return null;
	//   72  136:aconst_null     
	//   73  137:areturn         
		file;
	//   74  138:astore_0        
_L4:
		closeOrLog(((Closeable) (obj)), "Failed to close system file reader.");
	//   75  139:aload_2         
	//   76  140:ldc2            #367 <String "Failed to close system file reader.">
	//   77  143:invokestatic    #369 <Method void closeOrLog(Closeable, String)>
		throw file;
	//   78  146:aload_0         
	//   79  147:athrow          
		file;
	//   80  148:astore_0        
		obj = obj1;
	//   81  149:aload_3         
	//   82  150:astore_2        
		if(true) goto _L4; else goto _L3
	//   83  151:goto            139
_L3:
		Exception exception;
		exception;
	//   84  154:astore_2        
		s = ((String) (obj1));
	//   85  155:aload_3         
	//   86  156:astore_1        
		obj1 = ((Object) (exception));
	//   87  157:aload_2         
	//   88  158:astore_3        
		if(true) goto _L6; else goto _L5
	//   89  159:goto            96
_L5:
	}

	public static void finishAffinity(Activity activity, int i)
	{
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   3    5:getstatic       #383 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          16
	//*   5   10:icmplt          18
		{
			activity.finishAffinity();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #387 <Method void Activity.finishAffinity()>
			return;
	//    8   17:return          
		} else
		{
			activity.setResult(i);
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #391 <Method void Activity.setResult(int)>
			activity.finish();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #394 <Method void Activity.finish()>
			return;
	//   14   27:return          
		}
	}

	public static void finishAffinity(Context context, int i)
	{
		if(context instanceof Activity)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #385 <Class Activity>
	//*   2    4:ifeq            15
			finishAffinity((Activity)context, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #385 <Class Activity>
	//    5   11:iload_1         
	//    6   12:invokestatic    #398 <Method void finishAffinity(Activity, int)>
	//    7   15:return          
	}

	public static void flushOrLog(Flushable flushable, String s)
	{
		if(flushable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		flushable.flush();
	//    2    4:aload_0         
	//    3    5:invokeinterface #405 <Method void Flushable.flush()>
		return;
	//    4   10:return          
		flushable;
	//    5   11:astore_0        
		Fabric.getLogger().e("Fabric", s, ((Throwable) (flushable)));
	//    6   12:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    7   15:ldc1            #201 <String "Fabric">
	//    8   17:aload_1         
	//    9   18:aload_0         
	//   10   19:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
		return;
	//   11   24:return          
	}

	public static String getAppIconHashOrNull(Context context)
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		context = ((Context) (context.getResources().openRawResource(getAppIconResourceId(context))));
	//    4    4:aload_0         
	//    5    5:invokevirtual   #411 <Method Resources Context.getResources()>
	//    6    8:aload_0         
	//    7    9:invokestatic    #415 <Method int getAppIconResourceId(Context)>
	//    8   12:invokevirtual   #421 <Method InputStream Resources.openRawResource(int)>
	//    9   15:astore_0        
		obj = ((Object) (context));
	//   10   16:aload_0         
	//   11   17:astore_2        
		obj1 = ((Object) (context));
	//   12   18:aload_0         
	//   13   19:astore_3        
		String s = sha1(((InputStream) (context)));
	//   14   20:aload_0         
	//   15   21:invokestatic    #424 <Method String sha1(InputStream)>
	//   16   24:astore          4
		obj = ((Object) (context));
	//   17   26:aload_0         
	//   18   27:astore_2        
		obj1 = ((Object) (context));
	//   19   28:aload_0         
	//   20   29:astore_3        
		boolean flag = isNullOrEmpty(s);
	//   21   30:aload           4
	//   22   32:invokestatic    #428 <Method boolean isNullOrEmpty(String)>
	//   23   35:istore_1        
		obj = ((Object) (s));
	//   24   36:aload           4
	//   25   38:astore_2        
		if(flag)
	//*  26   39:iload_1         
	//*  27   40:ifeq            45
			obj = null;
	//   28   43:aconst_null     
	//   29   44:astore_2        
		closeOrLog(((Closeable) (context)), "Failed to close icon input stream.");
	//   30   45:aload_0         
	//   31   46:ldc2            #430 <String "Failed to close icon input stream.">
	//   32   49:invokestatic    #369 <Method void closeOrLog(Closeable, String)>
		return ((String) (obj));
	//   33   52:aload_2         
	//   34   53:areturn         
		context;
	//   35   54:astore_0        
		obj1 = obj;
	//   36   55:aload_2         
	//   37   56:astore_3        
		Fabric.getLogger().e("Fabric", "Could not calculate hash for app icon.", ((Throwable) (context)));
	//   38   57:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   39   60:ldc1            #201 <String "Fabric">
	//   40   62:ldc2            #432 <String "Could not calculate hash for app icon.">
	//   41   65:aload_0         
	//   42   66:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
		closeOrLog(((Closeable) (obj)), "Failed to close icon input stream.");
	//   43   71:aload_2         
	//   44   72:ldc2            #430 <String "Failed to close icon input stream.">
	//   45   75:invokestatic    #369 <Method void closeOrLog(Closeable, String)>
		return null;
	//   46   78:aconst_null     
	//   47   79:areturn         
		context;
	//   48   80:astore_0        
		closeOrLog(((Closeable) (obj1)), "Failed to close icon input stream.");
	//   49   81:aload_3         
	//   50   82:ldc2            #430 <String "Failed to close icon input stream.">
	//   51   85:invokestatic    #369 <Method void closeOrLog(Closeable, String)>
		throw context;
	//   52   88:aload_0         
	//   53   89:athrow          
	}

	public static int getAppIconResourceId(Context context)
	{
		return context.getApplicationContext().getApplicationInfo().icon;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #436 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #440 <Method ApplicationInfo Context.getApplicationInfo()>
	//    3    7:getfield        #445 <Field int ApplicationInfo.icon>
	//    4   10:ireturn         
	}

	public static android.app.ActivityManager.RunningAppProcessInfo getAppProcessInfo(String s, Context context)
	{
		Object obj1 = ((Object) (((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses()));
	//    0    0:aload_1         
	//    1    1:ldc1            #126 <String "activity">
	//    2    3:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #134 <Class ActivityManager>
	//    4    9:invokevirtual   #451 <Method List ActivityManager.getRunningAppProcesses()>
	//    5   12:astore_3        
		Object obj = null;
	//    6   13:aconst_null     
	//    7   14:astore_2        
		context = ((Context) (obj));
	//    8   15:aload_2         
	//    9   16:astore_1        
		if(obj1 != null)
	//*  10   17:aload_3         
	//*  11   18:ifnull          60
		{
			obj1 = ((Object) (((List) (obj1)).iterator()));
	//   12   21:aload_3         
	//   13   22:invokeinterface #296 <Method Iterator List.iterator()>
	//   14   27:astore_3        
			do
			{
				context = ((Context) (obj));
	//   15   28:aload_2         
	//   16   29:astore_1        
				if(!((Iterator) (obj1)).hasNext())
					break;
	//   17   30:aload_3         
	//   18   31:invokeinterface #301 <Method boolean Iterator.hasNext()>
	//   19   36:ifeq            60
				context = ((Context) ((android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next()));
	//   20   39:aload_3         
	//   21   40:invokeinterface #305 <Method Object Iterator.next()>
	//   22   45:checkcast       #453 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   23   48:astore_1        
			} while(!((android.app.ActivityManager.RunningAppProcessInfo) (context)).processName.equals(((Object) (s))));
	//   24   49:aload_1         
	//   25   50:getfield        #456 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//   26   53:aload_0         
	//   27   54:invokevirtual   #365 <Method boolean String.equals(Object)>
	//   28   57:ifeq            28
		}
		return ((android.app.ActivityManager.RunningAppProcessInfo) (context));
	//   29   60:aload_1         
	//   30   61:areturn         
	}

	public static Float getBatteryLevel(Context context)
	{
		context = ((Context) (context.registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.intent.action.BATTERY_CHANGED"))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #460 <Class IntentFilter>
	//    3    5:dup             
	//    4    6:ldc2            #462 <String "android.intent.action.BATTERY_CHANGED">
	//    5    9:invokespecial   #463 <Method void IntentFilter(String)>
	//    6   12:invokevirtual   #467 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    7   15:astore_0        
		if(context == null)
	//*   8   16:aload_0         
	//*   9   17:ifnonnull       22
		{
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		} else
		{
			int i = ((Intent) (context)).getIntExtra("level", -1);
	//   12   22:aload_0         
	//   13   23:ldc2            #469 <String "level">
	//   14   26:iconst_m1       
	//   15   27:invokevirtual   #475 <Method int Intent.getIntExtra(String, int)>
	//   16   30:istore_1        
			int j = ((Intent) (context)).getIntExtra("scale", -1);
	//   17   31:aload_0         
	//   18   32:ldc2            #477 <String "scale">
	//   19   35:iconst_m1       
	//   20   36:invokevirtual   #475 <Method int Intent.getIntExtra(String, int)>
	//   21   39:istore_2        
			return Float.valueOf((float)i / (float)j);
	//   22   40:iload_1         
	//   23   41:i2f             
	//   24   42:iload_2         
	//   25   43:i2f             
	//   26   44:fdiv            
	//   27   45:invokestatic    #483 <Method Float Float.valueOf(float)>
	//   28   48:areturn         
		}
	}

	public static int getBatteryVelocity(Context context, boolean flag)
	{
		context = ((Context) (getBatteryLevel(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #487 <Method Float getBatteryLevel(Context)>
	//    2    4:astore_0        
		if(!flag || context == null)
	//*   3    5:iload_1         
	//*   4    6:ifeq            13
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       15
			return 1;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		if((double)((Float) (context)).floatValue() >= 99D)
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #491 <Method float Float.floatValue()>
	//*  11   19:f2d             
	//*  12   20:ldc2w           #492 <Double 99D>
	//*  13   23:dcmpl           
	//*  14   24:iflt            29
			return 3;
	//   15   27:iconst_3        
	//   16   28:ireturn         
		return (double)((Float) (context)).floatValue() >= 99D ? 0 : 2;
	//   17   29:aload_0         
	//   18   30:invokevirtual   #491 <Method float Float.floatValue()>
	//   19   33:f2d             
	//   20   34:ldc2w           #492 <Double 99D>
	//   21   37:dcmpg           
	//   22   38:ifge            43
	//   23   41:iconst_2        
	//   24   42:ireturn         
	//   25   43:iconst_0        
	//   26   44:ireturn         
	}

	public static boolean getBooleanResourceValue(Context context, String s, boolean flag)
	{
		boolean flag1 = flag;
	//    0    0:iload_2         
	//    1    1:istore          4
		if(context != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          42
		{
			Resources resources = context.getResources();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #411 <Method Resources Context.getResources()>
	//    6   11:astore          5
			flag1 = flag;
	//    7   13:iload_2         
	//    8   14:istore          4
			if(resources != null)
	//*   9   16:aload           5
	//*  10   18:ifnull          42
			{
				int i = getResourcesIdentifier(context, s, "bool");
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc2            #497 <String "bool">
	//   14   26:invokestatic    #501 <Method int getResourcesIdentifier(Context, String, String)>
	//   15   29:istore_3        
				if(i > 0)
	//*  16   30:iload_3         
	//*  17   31:ifle            45
				{
					flag1 = resources.getBoolean(i);
	//   18   34:aload           5
	//   19   36:iload_3         
	//   20   37:invokevirtual   #505 <Method boolean Resources.getBoolean(int)>
	//   21   40:istore          4
				} else
	//*  22   42:iload           4
	//*  23   44:ireturn         
				{
					int j = getResourcesIdentifier(context, s, "string");
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:ldc2            #507 <String "string">
	//   27   50:invokestatic    #501 <Method int getResourcesIdentifier(Context, String, String)>
	//   28   53:istore_3        
					flag1 = flag;
	//   29   54:iload_2         
	//   30   55:istore          4
					if(j > 0)
	//*  31   57:iload_3         
	//*  32   58:ifle            42
						return Boolean.parseBoolean(context.getString(j));
	//   33   61:aload_0         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #511 <Method String Context.getString(int)>
	//   36   66:invokestatic    #516 <Method boolean Boolean.parseBoolean(String)>
	//   37   69:ireturn         
				}
			}
		}
		return flag1;
	}

	public static int getCpuArchitectureInt()
	{
		return Architecture.getValue().ordinal();
	//    0    0:invokestatic    #521 <Method CommonUtils$Architecture CommonUtils$Architecture.getValue()>
	//    1    3:invokevirtual   #524 <Method int CommonUtils$Architecture.ordinal()>
	//    2    6:ireturn         
	}

	public static int getDeviceState(Context context)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(isEmulator(context))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #528 <Method boolean isEmulator(Context)>
	//*   4    6:ifeq            13
			j = ((int) (false | true));
	//    5    9:iconst_0        
	//    6   10:iconst_1        
	//    7   11:ior             
	//    8   12:istore_2        
		int i = j;
	//    9   13:iload_2         
	//   10   14:istore_1        
		if(isRooted(context))
	//*  11   15:aload_0         
	//*  12   16:invokestatic    #531 <Method boolean isRooted(Context)>
	//*  13   19:ifeq            26
			i = j | 2;
	//   14   22:iload_2         
	//   15   23:iconst_2        
	//   16   24:ior             
	//   17   25:istore_1        
		j = i;
	//   18   26:iload_1         
	//   19   27:istore_2        
		if(isDebuggerAttached())
	//*  20   28:invokestatic    #534 <Method boolean isDebuggerAttached()>
	//*  21   31:ifeq            38
			j = i | 4;
	//   22   34:iload_1         
	//   23   35:iconst_4        
	//   24   36:ior             
	//   25   37:istore_2        
		return j;
	//   26   38:iload_2         
	//   27   39:ireturn         
	}

	public static boolean getProximitySensorEnabled(Context context)
	{
		while(isEmulator(context) || ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) == null) 
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #528 <Method boolean isEmulator(Context)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:ldc2            #537 <String "sensor">
	//    7   13:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    8   16:checkcast       #539 <Class SensorManager>
	//    9   19:bipush          8
	//   10   21:invokevirtual   #543 <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   11   24:ifnull          7
		return true;
	//   12   27:iconst_1        
	//   13   28:ireturn         
	}

	public static String getResourcePackageName(Context context)
	{
		int i = context.getApplicationContext().getApplicationInfo().icon;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #436 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #440 <Method ApplicationInfo Context.getApplicationInfo()>
	//    3    7:getfield        #445 <Field int ApplicationInfo.icon>
	//    4   10:istore_1        
		if(i > 0)
	//*   5   11:iload_1         
	//*   6   12:ifle            24
			return context.getResources().getResourcePackageName(i);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #411 <Method Resources Context.getResources()>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #546 <Method String Resources.getResourcePackageName(int)>
	//   11   23:areturn         
		else
			return context.getPackageName();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #549 <Method String Context.getPackageName()>
	//   14   28:areturn         
	}

	public static int getResourcesIdentifier(Context context, String s, String s1)
	{
		return context.getResources().getIdentifier(s, s1, getResourcePackageName(context));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #411 <Method Resources Context.getResources()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokestatic    #551 <Method String getResourcePackageName(Context)>
	//    6   10:invokevirtual   #555 <Method int Resources.getIdentifier(String, String, String)>
	//    7   13:ireturn         
	}

	public static SharedPreferences getSharedPrefs(Context context)
	{
		return context.getSharedPreferences("com.crashlytics.prefs", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "com.crashlytics.prefs">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #561 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:areturn         
	}

	public static String getStringsFileValue(Context context, String s)
	{
		int i = getResourcesIdentifier(context, s, "string");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #507 <String "string">
	//    3    5:invokestatic    #501 <Method int getResourcesIdentifier(Context, String, String)>
	//    4    8:istore_2        
		if(i > 0)
	//*   5    9:iload_2         
	//*   6   10:ifle            19
			return context.getString(i);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #511 <Method String Context.getString(int)>
	//   10   18:areturn         
		else
			return "";
	//   11   19:ldc2            #263 <String "">
	//   12   22:areturn         
	}

	public static long getTotalRamInBytes()
	{
		io/fabric/sdk/android/services/common/CommonUtils;
	//    0    0:ldc1            #2   <Class CommonUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(totalRamInBytes != -1L) goto _L2; else goto _L1
	//    2    3:getstatic       #112 <Field long totalRamInBytes>
	//    3    6:ldc2w           #84  <Long -1L>
	//    4    9:lcmp            
	//    5   10:ifne            80
_L1:
		long l1 = 0L;
	//    6   13:lconst_0        
	//    7   14:lstore_2        
		String s = extractFieldFromSystemFile(new File("/proc/meminfo"), "MemTotal");
	//    8   15:new             #335 <Class File>
	//    9   18:dup             
	//   10   19:ldc2            #569 <String "/proc/meminfo">
	//   11   22:invokespecial   #570 <Method void File(String)>
	//   12   25:ldc2            #572 <String "MemTotal">
	//   13   28:invokestatic    #574 <Method String extractFieldFromSystemFile(File, String)>
	//   14   31:astore          4
		long l = l1;
	//   15   33:lload_2         
	//   16   34:lstore_0        
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L4; else goto _L3
	//   17   35:aload           4
	//   18   37:invokestatic    #580 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   19   40:ifne            76
_L3:
		s = s.toUpperCase(Locale.US);
	//   20   43:aload           4
	//   21   45:getstatic       #273 <Field Locale Locale.US>
	//   22   48:invokevirtual   #583 <Method String String.toUpperCase(Locale)>
	//   23   51:astore          4
		if(!s.endsWith("KB")) goto _L6; else goto _L5
	//   24   53:aload           4
	//   25   55:ldc2            #585 <String "KB">
	//   26   58:invokevirtual   #588 <Method boolean String.endsWith(String)>
	//   27   61:ifeq            89
_L5:
		l = convertMemInfoToBytes(s, "KB", 1024);
	//   28   64:aload           4
	//   29   66:ldc2            #585 <String "KB">
	//   30   69:sipush          1024
	//   31   72:invokestatic    #590 <Method long convertMemInfoToBytes(String, String, int)>
	//   32   75:lstore_0        
_L4:
		totalRamInBytes = l;
	//   33   76:lload_0         
	//   34   77:putstatic       #112 <Field long totalRamInBytes>
_L2:
		l = totalRamInBytes;
	//   35   80:getstatic       #112 <Field long totalRamInBytes>
	//   36   83:lstore_0        
		io/fabric/sdk/android/services/common/CommonUtils;
	//   37   84:ldc1            #2   <Class CommonUtils>
		JVM INSTR monitorexit ;
	//   38   86:monitorexit     
		return l;
	//   39   87:lload_0         
	//   40   88:lreturn         
_L6:
label0:
		{
			if(!s.endsWith("MB"))
				break label0;
	//   41   89:aload           4
	//   42   91:ldc2            #592 <String "MB">
	//   43   94:invokevirtual   #588 <Method boolean String.endsWith(String)>
	//   44   97:ifeq            114
			l = convertMemInfoToBytes(s, "MB", 0x100000);
	//   45  100:aload           4
	//   46  102:ldc2            #592 <String "MB">
	//   47  105:ldc1            #16  <Int 0x100000>
	//   48  107:invokestatic    #590 <Method long convertMemInfoToBytes(String, String, int)>
	//   49  110:lstore_0        
		}
		  goto _L4
	//*  50  111:goto            76
label1:
		{
			if(!s.endsWith("GB"))
				break label1;
	//   51  114:aload           4
	//   52  116:ldc2            #594 <String "GB">
	//   53  119:invokevirtual   #588 <Method boolean String.endsWith(String)>
	//   54  122:ifeq            139
			l = convertMemInfoToBytes(s, "GB", 0x40000000);
	//   55  125:aload           4
	//   56  127:ldc2            #594 <String "GB">
	//   57  130:ldc1            #12  <Int 0x40000000>
	//   58  132:invokestatic    #590 <Method long convertMemInfoToBytes(String, String, int)>
	//   59  135:lstore_0        
		}
		  goto _L4
	//*  60  136:goto            76
		Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Unexpected meminfo format while computing RAM: ").append(s).toString());
	//   61  139:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   62  142:ldc1            #201 <String "Fabric">
	//   63  144:new             #291 <Class StringBuilder>
	//   64  147:dup             
	//   65  148:invokespecial   #292 <Method void StringBuilder()>
	//   66  151:ldc2            #596 <String "Unexpected meminfo format while computing RAM: ">
	//   67  154:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   68  157:aload           4
	//   69  159:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   70  162:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   71  165:invokeinterface #600 <Method void Logger.d(String, String)>
		l = l1;
	//   72  170:lload_2         
	//   73  171:lstore_0        
		  goto _L4
	//*  74  172:goto            76
		NumberFormatException numberformatexception;
		numberformatexception;
	//   75  175:astore          5
		Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Unexpected meminfo format while computing RAM: ").append(s).toString(), ((Throwable) (numberformatexception)));
	//   76  177:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   77  180:ldc1            #201 <String "Fabric">
	//   78  182:new             #291 <Class StringBuilder>
	//   79  185:dup             
	//   80  186:invokespecial   #292 <Method void StringBuilder()>
	//   81  189:ldc2            #596 <String "Unexpected meminfo format while computing RAM: ">
	//   82  192:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   83  195:aload           4
	//   84  197:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   85  200:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   86  203:aload           5
	//   87  205:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
		l = l1;
	//   88  210:lload_2         
	//   89  211:lstore_0        
		  goto _L4
	//*  90  212:goto            76
		Exception exception;
		exception;
	//   91  215:astore          4
	//*  92  217:ldc1            #2   <Class CommonUtils>
		throw exception;
	//   93  219:monitorexit     
	//   94  220:aload           4
	//   95  222:athrow          
	}

	private static String hash(InputStream inputstream, String s)
	{
		byte abyte0[];
		s = ((String) (MessageDigest.getInstance("SHA-1")));
	//    0    0:ldc1            #81  <String "SHA-1">
	//    1    2:invokestatic    #608 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_1        
		abyte0 = new byte[1024];
	//    3    6:sipush          1024
	//    4    9:newarray        byte[]
	//    5   11:astore_3        
_L1:
		int i = inputstream.read(abyte0);
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #238 <Method int InputStream.read(byte[])>
	//    9   17:istore_2        
label0:
		{
			if(i == -1)
				break label0;
	//   10   18:iload_2         
	//   11   19:iconst_m1       
	//   12   20:icmpeq          52
			try
			{
				((MessageDigest) (s)).update(abyte0, 0, i);
	//   13   23:aload_1         
	//   14   24:aload_3         
	//   15   25:iconst_0        
	//   16   26:iload_2         
	//   17   27:invokevirtual   #611 <Method void MessageDigest.update(byte[], int, int)>
			}
	//*  18   30:goto            12
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
	//*  19   33:astore_0        
			{
				Fabric.getLogger().e("Fabric", "Could not calculate hash for app icon.", ((Throwable) (inputstream)));
	//   20   34:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   21   37:ldc1            #201 <String "Fabric">
	//   22   39:ldc2            #432 <String "Could not calculate hash for app icon.">
	//   23   42:aload_0         
	//   24   43:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
				return "";
	//   25   48:ldc2            #263 <String "">
	//   26   51:areturn         
			}
		}
		  goto _L1
		inputstream = ((InputStream) (hexify(((MessageDigest) (s)).digest())));
	//   27   52:aload_1         
	//   28   53:invokevirtual   #615 <Method byte[] MessageDigest.digest()>
	//   29   56:invokestatic    #619 <Method String hexify(byte[])>
	//   30   59:astore_0        
		return ((String) (inputstream));
	//   31   60:aload_0         
	//   32   61:areturn         
	}

	private static String hash(String s, String s1)
	{
		return hash(s.getBytes(), s1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #623 <Method byte[] String.getBytes()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #626 <Method String hash(byte[], String)>
	//    4    8:areturn         
	}

	private static String hash(byte abyte0[], String s)
	{
		MessageDigest messagedigest;
		try
		{
			messagedigest = MessageDigest.getInstance(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #608 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #631 <Method void MessageDigest.update(byte[])>
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #615 <Method byte[] MessageDigest.digest()>
	//*   8   14:invokestatic    #619 <Method String hexify(byte[])>
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   18:astore_0        
		{
			Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Could not create hashing algorithm: ").append(s).append(", returning empty string.").toString(), ((Throwable) (abyte0)));
	//   11   19:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   12   22:ldc1            #201 <String "Fabric">
	//   13   24:new             #291 <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #292 <Method void StringBuilder()>
	//   16   31:ldc2            #633 <String "Could not create hashing algorithm: ">
	//   17   34:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:aload_1         
	//   19   38:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:ldc2            #635 <String ", returning empty string.">
	//   21   44:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   23   50:aload_0         
	//   24   51:invokeinterface #207 <Method void Logger.e(String, String, Throwable)>
			return "";
	//   25   56:ldc2            #263 <String "">
	//   26   59:areturn         
		}
		messagedigest.update(abyte0);
		return hexify(messagedigest.digest());
	}

	public static String hexify(byte abyte0[])
	{
		char ac[] = new char[abyte0.length * 2];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_2        
	//    3    3:imul            
	//    4    4:newarray        char[]
	//    5    6:astore_3        
		for(int i = 0; i < abyte0.length; i++)
	//*   6    7:iconst_0        
	//*   7    8:istore_1        
	//*   8    9:iload_1         
	//*   9   10:aload_0         
	//*  10   11:arraylength     
	//*  11   12:icmpge          57
		{
			int j = abyte0[i] & 0xff;
	//   12   15:aload_0         
	//   13   16:iload_1         
	//   14   17:baload          
	//   15   18:sipush          255
	//   16   21:iand            
	//   17   22:istore_2        
			ac[i * 2] = HEX_VALUES[j >>> 4];
	//   18   23:aload_3         
	//   19   24:iload_1         
	//   20   25:iconst_2        
	//   21   26:imul            
	//   22   27:getstatic       #110 <Field char[] HEX_VALUES>
	//   23   30:iload_2         
	//   24   31:iconst_4        
	//   25   32:iushr           
	//   26   33:caload          
	//   27   34:castore         
			ac[i * 2 + 1] = HEX_VALUES[j & 0xf];
	//   28   35:aload_3         
	//   29   36:iload_1         
	//   30   37:iconst_2        
	//   31   38:imul            
	//   32   39:iconst_1        
	//   33   40:iadd            
	//   34   41:getstatic       #110 <Field char[] HEX_VALUES>
	//   35   44:iload_2         
	//   36   45:bipush          15
	//   37   47:iand            
	//   38   48:caload          
	//   39   49:castore         
		}

	//   40   50:iload_1         
	//   41   51:iconst_1        
	//   42   52:iadd            
	//   43   53:istore_1        
	//*  44   54:goto            9
		return new String(ac);
	//   45   57:new             #217 <Class String>
	//   46   60:dup             
	//   47   61:aload_3         
	//   48   62:invokespecial   #638 <Method void String(char[])>
	//   49   65:areturn         
	}

	public static void hideKeyboard(Context context, View view)
	{
		context = ((Context) ((InputMethodManager)context.getSystemService("input_method")));
	//    0    0:aload_0         
	//    1    1:ldc2            #642 <String "input_method">
	//    2    4:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #644 <Class InputMethodManager>
	//    4   10:astore_0        
		if(context != null)
	//*   5   11:aload_0         
	//*   6   12:ifnull          25
			((InputMethodManager) (context)).hideSoftInputFromWindow(view.getWindowToken(), 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #650 <Method android.os.IBinder View.getWindowToken()>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #654 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   12   24:pop             
	//   13   25:return          
	}

	public static boolean isAppDebuggable(Context context)
	{
		return (context.getApplicationInfo().flags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #440 <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:getfield        #658 <Field int ApplicationInfo.flags>
	//    3    7:iconst_2        
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static boolean isClsTrace(Context context)
	{
		if(clsTrace == null)
	//*   0    0:getstatic       #92  <Field Boolean clsTrace>
	//*   1    3:ifnonnull       19
			clsTrace = Boolean.valueOf(getBooleanResourceValue(context, "com.crashlytics.Trace", false));
	//    2    6:aload_0         
	//    3    7:ldc1            #26  <String "com.crashlytics.Trace">
	//    4    9:iconst_0        
	//    5   10:invokestatic    #661 <Method boolean getBooleanResourceValue(Context, String, boolean)>
	//    6   13:invokestatic    #664 <Method Boolean Boolean.valueOf(boolean)>
	//    7   16:putstatic       #92  <Field Boolean clsTrace>
		return clsTrace.booleanValue();
	//    8   19:getstatic       #92  <Field Boolean clsTrace>
	//    9   22:invokevirtual   #667 <Method boolean Boolean.booleanValue()>
	//   10   25:ireturn         
	}

	public static boolean isDebuggerAttached()
	{
		return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
	//    0    0:invokestatic    #672 <Method boolean Debug.isDebuggerConnected()>
	//    1    3:ifne            12
	//    2    6:invokestatic    #675 <Method boolean Debug.waitingForDebugger()>
	//    3    9:ifeq            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public static boolean isEmulator(Context context)
	{
		context = ((Context) (android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #679 <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:ldc2            #681 <String "android_id">
	//    3    7:invokestatic    #686 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    4   10:astore_0        
		return "sdk".equals(((Object) (Build.PRODUCT))) || "google_sdk".equals(((Object) (Build.PRODUCT))) || context == null;
	//    5   11:ldc1            #78  <String "sdk">
	//    6   13:getstatic       #691 <Field String Build.PRODUCT>
	//    7   16:invokevirtual   #365 <Method boolean String.equals(Object)>
	//    8   19:ifne            37
	//    9   22:ldc1            #50  <String "google_sdk">
	//   10   24:getstatic       #691 <Field String Build.PRODUCT>
	//   11   27:invokevirtual   #365 <Method boolean String.equals(Object)>
	//   12   30:ifne            37
	//   13   33:aload_0         
	//   14   34:ifnonnull       39
	//   15   37:iconst_1        
	//   16   38:ireturn         
	//   17   39:iconst_0        
	//   18   40:ireturn         
	}

	public static boolean isLoggingEnabled(Context context)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static boolean isNullOrEmpty(String s)
	{
		return s == null || s.length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          11
	//    2    4:aload_0         
	//    3    5:invokevirtual   #315 <Method int String.length()>
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isRooted(Context context)
	{
		boolean flag;
		flag = isEmulator(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #528 <Method boolean isEmulator(Context)>
	//    2    4:istore_1        
		context = ((Context) (Build.TAGS));
	//    3    5:getstatic       #695 <Field String Build.TAGS>
	//    4    8:astore_0        
		break MISSING_BLOCK_LABEL_9;
		if((flag || context == null || !((String) (context)).contains("test-keys")) && !(new File("/system/app/Superuser.apk")).exists())
	//*   5    9:iload_1         
	//*   6   10:ifne            29
	//*   7   13:aload_0         
	//*   8   14:ifnull          29
	//*   9   17:aload_0         
	//*  10   18:ldc2            #697 <String "test-keys">
	//*  11   21:invokevirtual   #700 <Method boolean String.contains(CharSequence)>
	//*  12   24:ifeq            29
	//*  13   27:iconst_1        
	//*  14   28:ireturn         
	//*  15   29:new             #335 <Class File>
	//*  16   32:dup             
	//*  17   33:ldc2            #702 <String "/system/app/Superuser.apk">
	//*  18   36:invokespecial   #570 <Method void File(String)>
	//*  19   39:invokevirtual   #338 <Method boolean File.exists()>
	//*  20   42:ifne            27
		{
			context = ((Context) (new File("/system/xbin/su")));
	//   21   45:new             #335 <Class File>
	//   22   48:dup             
	//   23   49:ldc2            #704 <String "/system/xbin/su">
	//   24   52:invokespecial   #570 <Method void File(String)>
	//   25   55:astore_0        
			if(flag || !((File) (context)).exists())
	//*  26   56:iload_1         
	//*  27   57:ifne            67
	//*  28   60:aload_0         
	//*  29   61:invokevirtual   #338 <Method boolean File.exists()>
	//*  30   64:ifne            27
				return false;
	//   31   67:iconst_0        
	//   32   68:ireturn         
		}
		return true;
	}

	public static void logControlled(Context context, int i, String s, String s1)
	{
		if(isClsTrace(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #708 <Method boolean isClsTrace(Context)>
	//*   2    4:ifeq            19
			Fabric.getLogger().log(i, "Fabric", s1);
	//    3    7:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    4   10:iload_1         
	//    5   11:ldc1            #201 <String "Fabric">
	//    6   13:aload_3         
	//    7   14:invokeinterface #712 <Method void Logger.log(int, String, String)>
	//    8   19:return          
	}

	public static void logControlled(Context context, String s)
	{
		if(isClsTrace(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #708 <Method boolean isClsTrace(Context)>
	//*   2    4:ifeq            18
			Fabric.getLogger().d("Fabric", s);
	//    3    7:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    4   10:ldc1            #201 <String "Fabric">
	//    5   12:aload_1         
	//    6   13:invokeinterface #600 <Method void Logger.d(String, String)>
	//    7   18:return          
	}

	public static void logControlledError(Context context, String s, Throwable throwable)
	{
		if(isClsTrace(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #708 <Method boolean isClsTrace(Context)>
	//*   2    4:ifeq            18
			Fabric.getLogger().e("Fabric", s);
	//    3    7:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    4   10:ldc1            #201 <String "Fabric">
	//    5   12:aload_1         
	//    6   13:invokeinterface #717 <Method void Logger.e(String, String)>
	//    7   18:return          
	}

	public static void logOrThrowIllegalArgumentException(String s, String s1)
	{
		if(Fabric.isDebuggable())
	//*   0    0:invokestatic    #721 <Method boolean Fabric.isDebuggable()>
	//*   1    3:ifeq            15
		{
			throw new IllegalArgumentException(s1);
	//    2    6:new             #723 <Class IllegalArgumentException>
	//    3    9:dup             
	//    4   10:aload_1         
	//    5   11:invokespecial   #724 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			Fabric.getLogger().w(s, s1);
	//    7   15:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokeinterface #727 <Method void Logger.w(String, String)>
			return;
	//   11   25:return          
		}
	}

	public static void logOrThrowIllegalStateException(String s, String s1)
	{
		if(Fabric.isDebuggable())
	//*   0    0:invokestatic    #721 <Method boolean Fabric.isDebuggable()>
	//*   1    3:ifeq            15
		{
			throw new IllegalStateException(s1);
	//    2    6:new             #730 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:aload_1         
	//    5   11:invokespecial   #731 <Method void IllegalStateException(String)>
	//    6   14:athrow          
		} else
		{
			Fabric.getLogger().w(s, s1);
	//    7   15:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokeinterface #727 <Method void Logger.w(String, String)>
			return;
	//   11   25:return          
		}
	}

	public static String logPriorityToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     2 7: default 40
	//	               2 55
	//	               3 46
	//	               4 52
	//	               5 58
	//	               6 49
	//	               7 43
		default:
			return "?";
	//    2   40:ldc1            #66  <String "?">
	//    3   42:areturn         

		case 7: // '\007'
			return "A";
	//    4   43:ldc1            #55  <String "A">
	//    5   45:areturn         

		case 3: // '\003'
			return "D";
	//    6   46:ldc1            #58  <String "D">
	//    7   48:areturn         

		case 6: // '\006'
			return "E";
	//    8   49:ldc1            #61  <String "E">
	//    9   51:areturn         

		case 4: // '\004'
			return "I";
	//   10   52:ldc1            #63  <String "I">
	//   11   54:areturn         

		case 2: // '\002'
			return "V";
	//   12   55:ldc1            #69  <String "V">
	//   13   57:areturn         

		case 5: // '\005'
			return "W";
	//   14   58:ldc1            #72  <String "W">
	//   15   60:areturn         
		}
	}

	public static String md5(String s)
	{
		return hash(s, "MD5");
	//    0    0:aload_0         
	//    1    1:ldc1            #75  <String "MD5">
	//    2    3:invokestatic    #735 <Method String hash(String, String)>
	//    3    6:areturn         
	}

	public static String md5(byte abyte0[])
	{
		return hash(abyte0, "MD5");
	//    0    0:aload_0         
	//    1    1:ldc1            #75  <String "MD5">
	//    2    3:invokestatic    #626 <Method String hash(byte[], String)>
	//    3    6:areturn         
	}

	public static void openKeyboard(Context context, View view)
	{
		context = ((Context) ((InputMethodManager)context.getSystemService("input_method")));
	//    0    0:aload_0         
	//    1    1:ldc2            #642 <String "input_method">
	//    2    4:invokevirtual   #132 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #644 <Class InputMethodManager>
	//    4   10:astore_0        
		if(context != null)
	//*   5   11:aload_0         
	//*   6   12:ifnull          24
			((InputMethodManager) (context)).showSoftInputFromInputMethod(view.getWindowToken(), 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #650 <Method android.os.IBinder View.getWindowToken()>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #740 <Method void InputMethodManager.showSoftInputFromInputMethod(android.os.IBinder, int)>
	//   12   24:return          
	}

	public static String padWithZerosToMaxIntWidth(int i)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            15
			throw new IllegalArgumentException("value must be zero or greater");
	//    2    4:new             #723 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #743 <String "value must be zero or greater">
	//    5   11:invokespecial   #724 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return String.format(Locale.US, "%1$10s", new Object[] {
				Integer.valueOf(i)
			}).replace(' ', '0');
	//    7   15:getstatic       #273 <Field Locale Locale.US>
	//    8   18:ldc2            #745 <String "%1$10s">
	//    9   21:iconst_1        
	//   10   22:anewarray       Object[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:iload_0         
	//   14   28:invokestatic    #750 <Method Integer Integer.valueOf(int)>
	//   15   31:aastore         
	//   16   32:invokestatic    #754 <Method String String.format(Locale, String, Object[])>
	//   17   35:bipush          32
	//   18   37:bipush          48
	//   19   39:invokevirtual   #757 <Method String String.replace(char, char)>
	//   20   42:areturn         
	}

	public static String resolveBuildId(Context context)
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		int j = getResourcesIdentifier(context, "io.fabric.android.build_id", "string");
	//    2    2:aload_0         
	//    3    3:ldc1            #44  <String "io.fabric.android.build_id">
	//    4    5:ldc2            #507 <String "string">
	//    5    8:invokestatic    #501 <Method int getResourcesIdentifier(Context, String, String)>
	//    6   11:istore_2        
		int i = j;
	//    7   12:iload_2         
	//    8   13:istore_1        
		if(j == 0)
	//*   9   14:iload_2         
	//*  10   15:ifne            28
			i = getResourcesIdentifier(context, "com.crashlytics.android.build_id", "string");
	//   11   18:aload_0         
	//   12   19:ldc1            #29  <String "com.crashlytics.android.build_id">
	//   13   21:ldc2            #507 <String "string">
	//   14   24:invokestatic    #501 <Method int getResourcesIdentifier(Context, String, String)>
	//   15   27:istore_1        
		if(i != 0)
	//*  16   28:iload_1         
	//*  17   29:ifeq            71
		{
			s = context.getResources().getString(i);
	//   18   32:aload_0         
	//   19   33:invokevirtual   #411 <Method Resources Context.getResources()>
	//   20   36:iload_1         
	//   21   37:invokevirtual   #759 <Method String Resources.getString(int)>
	//   22   40:astore_3        
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Build ID is: ").append(s).toString());
	//   23   41:invokestatic    #199 <Method Logger Fabric.getLogger()>
	//   24   44:ldc1            #201 <String "Fabric">
	//   25   46:new             #291 <Class StringBuilder>
	//   26   49:dup             
	//   27   50:invokespecial   #292 <Method void StringBuilder()>
	//   28   53:ldc2            #761 <String "Build ID is: ">
	//   29   56:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:aload_3         
	//   31   60:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   33   66:invokeinterface #600 <Method void Logger.d(String, String)>
		}
		return s;
	//   34   71:aload_3         
	//   35   72:areturn         
	}

	public static String sha1(InputStream inputstream)
	{
		return hash(inputstream, "SHA-1");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "SHA-1">
	//    2    3:invokestatic    #763 <Method String hash(InputStream, String)>
	//    3    6:areturn         
	}

	public static String sha1(String s)
	{
		return hash(s, "SHA-1");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "SHA-1">
	//    2    3:invokestatic    #735 <Method String hash(String, String)>
	//    3    6:areturn         
	}

	public static String sha1(byte abyte0[])
	{
		return hash(abyte0, "SHA-1");
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "SHA-1">
	//    2    3:invokestatic    #626 <Method String hash(byte[], String)>
	//    3    6:areturn         
	}

	public static String streamToString(InputStream inputstream)
		throws IOException
	{
		inputstream = ((InputStream) ((new Scanner(inputstream)).useDelimiter("\\A")));
	//    0    0:new             #766 <Class Scanner>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #769 <Method void Scanner(InputStream)>
	//    4    8:ldc2            #771 <String "\\A">
	//    5   11:invokevirtual   #775 <Method Scanner Scanner.useDelimiter(String)>
	//    6   14:astore_0        
		if(((Scanner) (inputstream)).hasNext())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #776 <Method boolean Scanner.hasNext()>
	//*   9   19:ifeq            27
			return ((Scanner) (inputstream)).next();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #778 <Method String Scanner.next()>
	//   12   26:areturn         
		else
			return "";
	//   13   27:ldc2            #263 <String "">
	//   14   30:areturn         
	}

	public static boolean stringsEqualIncludingNull(String s, String s1)
	{
		if(s == s1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(s != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          17
			return s.equals(((Object) (s1)));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #365 <Method boolean String.equals(Object)>
	//   10   16:ireturn         
		else
			return false;
	//   11   17:iconst_0        
	//   12   18:ireturn         
	}

	static final int BYTES_IN_A_GIGABYTE = 0x40000000;
	static final int BYTES_IN_A_KILOBYTE = 1024;
	static final int BYTES_IN_A_MEGABYTE = 0x100000;
	private static final String CLS_SHARED_PREFERENCES_NAME = "com.crashlytics.prefs";
	static final boolean CLS_TRACE_DEFAULT = false;
	static final String CLS_TRACE_PREFERENCE_NAME = "com.crashlytics.Trace";
	static final String CRASHLYTICS_BUILD_ID = "com.crashlytics.android.build_id";
	public static final int DEVICE_STATE_BETAOS = 8;
	public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
	public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
	public static final int DEVICE_STATE_ISSIMULATOR = 1;
	public static final int DEVICE_STATE_JAILBROKEN = 2;
	public static final int DEVICE_STATE_VENDORINTERNAL = 16;
	static final String FABRIC_BUILD_ID = "io.fabric.android.build_id";
	public static final Comparator FILE_MODIFIED_COMPARATOR = new Comparator() {

		public int compare(File file, File file1)
		{
			return (int)(file.lastModified() - file1.lastModified());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method long File.lastModified()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #22  <Method long File.lastModified()>
		//    4    8:lsub            
		//    5    9:l2i             
		//    6   10:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((File)obj, (File)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class File>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class File>
		//    5    9:invokevirtual   #25  <Method int compare(File, File)>
		//    6   12:ireturn         
		}

	}
;
	public static final String GOOGLE_SDK = "google_sdk";
	private static final char HEX_VALUES[] = {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		'a', 'b', 'c', 'd', 'e', 'f'
	};
	private static final String LOG_PRIORITY_NAME_ASSERT = "A";
	private static final String LOG_PRIORITY_NAME_DEBUG = "D";
	private static final String LOG_PRIORITY_NAME_ERROR = "E";
	private static final String LOG_PRIORITY_NAME_INFO = "I";
	private static final String LOG_PRIORITY_NAME_UNKNOWN = "?";
	private static final String LOG_PRIORITY_NAME_VERBOSE = "V";
	private static final String LOG_PRIORITY_NAME_WARN = "W";
	public static final String MD5_INSTANCE = "MD5";
	public static final String SDK = "sdk";
	public static final String SHA1_INSTANCE = "SHA-1";
	private static final long UNCALCULATED_TOTAL_RAM = -1L;
	private static Boolean clsTrace = null;
	private static long totalRamInBytes = -1L;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #92  <Field Boolean clsTrace>
	//    2    4:bipush          16
	//    3    6:newarray        char[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #93  <Int 48>
	//    7   12:castore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #94  <Int 49>
	//   11   17:castore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #95  <Int 50>
	//   15   22:castore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:ldc1            #96  <Int 51>
	//   19   27:castore         
	//   20   28:dup             
	//   21   29:iconst_4        
	//   22   30:ldc1            #97  <Int 52>
	//   23   32:castore         
	//   24   33:dup             
	//   25   34:iconst_5        
	//   26   35:ldc1            #98  <Int 53>
	//   27   37:castore         
	//   28   38:dup             
	//   29   39:bipush          6
	//   30   41:ldc1            #99  <Int 54>
	//   31   43:castore         
	//   32   44:dup             
	//   33   45:bipush          7
	//   34   47:ldc1            #100 <Int 55>
	//   35   49:castore         
	//   36   50:dup             
	//   37   51:bipush          8
	//   38   53:ldc1            #101 <Int 56>
	//   39   55:castore         
	//   40   56:dup             
	//   41   57:bipush          9
	//   42   59:ldc1            #102 <Int 57>
	//   43   61:castore         
	//   44   62:dup             
	//   45   63:bipush          10
	//   46   65:ldc1            #103 <Int 97>
	//   47   67:castore         
	//   48   68:dup             
	//   49   69:bipush          11
	//   50   71:ldc1            #104 <Int 98>
	//   51   73:castore         
	//   52   74:dup             
	//   53   75:bipush          12
	//   54   77:ldc1            #105 <Int 99>
	//   55   79:castore         
	//   56   80:dup             
	//   57   81:bipush          13
	//   58   83:ldc1            #106 <Int 100>
	//   59   85:castore         
	//   60   86:dup             
	//   61   87:bipush          14
	//   62   89:ldc1            #107 <Int 101>
	//   63   91:castore         
	//   64   92:dup             
	//   65   93:bipush          15
	//   66   95:ldc1            #108 <Int 102>
	//   67   97:castore         
	//   68   98:putstatic       #110 <Field char[] HEX_VALUES>
	//   69  101:ldc2w           #84  <Long -1L>
	//   70  104:putstatic       #112 <Field long totalRamInBytes>
	//   71  107:new             #6   <Class CommonUtils$1>
	//   72  110:dup             
	//   73  111:invokespecial   #115 <Method void CommonUtils$1()>
	//   74  114:putstatic       #117 <Field Comparator FILE_MODIFIED_COMPARATOR>
	//*  75  117:return          
	}
}
