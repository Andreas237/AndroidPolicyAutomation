// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.os.Build;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.*;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			CommonUtils

static final class CommonUtils$Architecture extends Enum
{

	static CommonUtils$Architecture getValue()
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
			CommonUtils$Architecture commonutils$architecture = (CommonUtils$Architecture)matcher.get(obj);
	//   17   37:getstatic       #69  <Field Map matcher>
	//   18   40:aload_0         
	//   19   41:invokeinterface #132 <Method Object Map.get(Object)>
	//   20   46:checkcast       #2   <Class CommonUtils$Architecture>
	//   21   49:astore_1        
			obj = ((Object) (commonutils$architecture));
	//   22   50:aload_1         
	//   23   51:astore_0        
			if(commonutils$architecture == null)
	//*  24   52:aload_1         
	//*  25   53:ifnonnull       27
				return UNKNOWN;
	//   26   56:getstatic       #54  <Field CommonUtils$Architecture UNKNOWN>
	//   27   59:areturn         
		}
		return ((CommonUtils$Architecture) (obj));
	}

	public static CommonUtils$Architecture valueOf(String s)
	{
		return (CommonUtils$Architecture)Enum.valueOf(io/fabric/sdk/android/services/common/CommonUtils$Architecture, s);
	//    0    0:ldc1            #2   <Class CommonUtils$Architecture>
	//    1    2:aload_0         
	//    2    3:invokestatic    #137 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CommonUtils$Architecture>
	//    4    9:areturn         
	}

	public static CommonUtils$Architecture[] values()
	{
		return (CommonUtils$Architecture[])((CommonUtils$Architecture []) ($VALUES)).clone();
	//    0    0:getstatic       #62  <Field CommonUtils$Architecture[] $VALUES>
	//    1    3:invokevirtual   #144 <Method Object _5B_Lio.fabric.sdk.android.services.common.CommonUtils$Architecture_3B_.clone()>
	//    2    6:checkcast       #140 <Class CommonUtils$Architecture[]>
	//    3    9:areturn         
	}

	private static final CommonUtils$Architecture $VALUES[];
	public static final CommonUtils$Architecture ARM64;
	public static final CommonUtils$Architecture ARMV6;
	public static final CommonUtils$Architecture ARMV7;
	public static final CommonUtils$Architecture ARMV7S;
	public static final CommonUtils$Architecture ARM_UNKNOWN;
	public static final CommonUtils$Architecture PPC;
	public static final CommonUtils$Architecture PPC64;
	public static final CommonUtils$Architecture UNKNOWN;
	public static final CommonUtils$Architecture X86_32;
	public static final CommonUtils$Architecture X86_64;
	private static final Map matcher;

	static 
	{
		X86_32 = new CommonUtils$Architecture("X86_32", 0);
	//    0    0:new             #2   <Class CommonUtils$Architecture>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "X86_32">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//    5   10:putstatic       #33  <Field CommonUtils$Architecture X86_32>
		X86_64 = new CommonUtils$Architecture("X86_64", 1);
	//    6   13:new             #2   <Class CommonUtils$Architecture>
	//    7   16:dup             
	//    8   17:ldc1            #34  <String "X86_64">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   11   23:putstatic       #36  <Field CommonUtils$Architecture X86_64>
		ARM_UNKNOWN = new CommonUtils$Architecture("ARM_UNKNOWN", 2);
	//   12   26:new             #2   <Class CommonUtils$Architecture>
	//   13   29:dup             
	//   14   30:ldc1            #37  <String "ARM_UNKNOWN">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   17   36:putstatic       #39  <Field CommonUtils$Architecture ARM_UNKNOWN>
		PPC = new CommonUtils$Architecture("PPC", 3);
	//   18   39:new             #2   <Class CommonUtils$Architecture>
	//   19   42:dup             
	//   20   43:ldc1            #40  <String "PPC">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   23   49:putstatic       #42  <Field CommonUtils$Architecture PPC>
		PPC64 = new CommonUtils$Architecture("PPC64", 4);
	//   24   52:new             #2   <Class CommonUtils$Architecture>
	//   25   55:dup             
	//   26   56:ldc1            #43  <String "PPC64">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   29   62:putstatic       #45  <Field CommonUtils$Architecture PPC64>
		ARMV6 = new CommonUtils$Architecture("ARMV6", 5);
	//   30   65:new             #2   <Class CommonUtils$Architecture>
	//   31   68:dup             
	//   32   69:ldc1            #46  <String "ARMV6">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   35   75:putstatic       #48  <Field CommonUtils$Architecture ARMV6>
		ARMV7 = new CommonUtils$Architecture("ARMV7", 6);
	//   36   78:new             #2   <Class CommonUtils$Architecture>
	//   37   81:dup             
	//   38   82:ldc1            #49  <String "ARMV7">
	//   39   84:bipush          6
	//   40   86:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   41   89:putstatic       #51  <Field CommonUtils$Architecture ARMV7>
		UNKNOWN = new CommonUtils$Architecture("UNKNOWN", 7);
	//   42   92:new             #2   <Class CommonUtils$Architecture>
	//   43   95:dup             
	//   44   96:ldc1            #52  <String "UNKNOWN">
	//   45   98:bipush          7
	//   46  100:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   47  103:putstatic       #54  <Field CommonUtils$Architecture UNKNOWN>
		ARMV7S = new CommonUtils$Architecture("ARMV7S", 8);
	//   48  106:new             #2   <Class CommonUtils$Architecture>
	//   49  109:dup             
	//   50  110:ldc1            #55  <String "ARMV7S">
	//   51  112:bipush          8
	//   52  114:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   53  117:putstatic       #57  <Field CommonUtils$Architecture ARMV7S>
		ARM64 = new CommonUtils$Architecture("ARM64", 9);
	//   54  120:new             #2   <Class CommonUtils$Architecture>
	//   55  123:dup             
	//   56  124:ldc1            #58  <String "ARM64">
	//   57  126:bipush          9
	//   58  128:invokespecial   #31  <Method void CommonUtils$Architecture(String, int)>
	//   59  131:putstatic       #60  <Field CommonUtils$Architecture ARM64>
		$VALUES = (new CommonUtils$Architecture[] {
			X86_32, X86_64, ARM_UNKNOWN, PPC, PPC64, ARMV6, ARMV7, UNKNOWN, ARMV7S, ARM64
		});
	//   60  134:bipush          10
	//   61  136:anewarray       CommonUtils$Architecture[]
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

	private CommonUtils$Architecture(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #85  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
