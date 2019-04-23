// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import android.util.Log;
import java.sql.Timestamp;
import java.util.*;

// Referenced classes of package com.google.android.gcm:
//			GCMBroadcastReceiver

public final class GCMRegistrar
{

	private GCMRegistrar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #48  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #49  <Method void UnsupportedOperationException()>
	//    5   11:athrow          
	}

	public static void checkDevice(Context context)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i >= 8)
	//*   2    4:iload_1         
	//*   3    5:bipush          8
	//*   4    7:icmplt          34
		{
			context = ((Context) (context.getPackageManager()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #65  <Method PackageManager Context.getPackageManager()>
	//    7   14:astore_0        
			try
			{
				((PackageManager) (context)).getPackageInfo("com.google.android.gsf", 0);
	//    8   15:aload_0         
	//    9   16:ldc1            #18  <String "com.google.android.gsf">
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #71  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   12   22:pop             
				return;
	//   13   23:return          
			}
	//*  14   24:new             #48  <Class UnsupportedOperationException>
	//*  15   27:dup             
	//*  16   28:ldc1            #73  <String "Device does not have package com.google.android.gsf">
	//*  17   30:invokespecial   #76  <Method void UnsupportedOperationException(String)>
	//*  18   33:athrow          
	//*  19   34:new             #78  <Class StringBuilder>
	//*  20   37:dup             
	//*  21   38:invokespecial   #79  <Method void StringBuilder()>
	//*  22   41:astore_0        
	//*  23   42:aload_0         
	//*  24   43:ldc1            #81  <String "Device must be at least API Level 8 (instead of ">
	//*  25   45:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:pop             
	//*  27   49:aload_0         
	//*  28   50:iload_1         
	//*  29   51:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//*  30   54:pop             
	//*  31   55:aload_0         
	//*  32   56:ldc1            #90  <String ")">
	//*  33   58:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  34   61:pop             
	//*  35   62:new             #48  <Class UnsupportedOperationException>
	//*  36   65:dup             
	//*  37   66:aload_0         
	//*  38   67:invokevirtual   #94  <Method String StringBuilder.toString()>
	//*  39   70:invokespecial   #76  <Method void UnsupportedOperationException(String)>
	//*  40   73:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
			}
		} else
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append("Device must be at least API Level 8 (instead of ");
			((StringBuilder) (context)).append(i);
			((StringBuilder) (context)).append(")");
			throw new UnsupportedOperationException(((StringBuilder) (context)).toString());
		}
	//*  41   74:astore_0        
	//*  42   75:goto            24
	}

	public static void checkManifest(Context context)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          5
		Object obj = ((Object) (context.getPackageName()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #98  <Method String Context.getPackageName()>
	//    5   10:astore_3        
		Object obj1 = ((Object) (new StringBuilder()));
	//    6   11:new             #78  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #79  <Method void StringBuilder()>
	//    9   18:astore          4
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   10   20:aload           4
	//   11   22:aload_3         
	//   12   23:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		((StringBuilder) (obj1)).append(".permission.C2D_MESSAGE");
	//   14   27:aload           4
	//   15   29:ldc1            #100 <String ".permission.C2D_MESSAGE">
	//   16   31:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   18   35:aload           4
	//   19   37:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   20   40:astore          4
		try
		{
			packagemanager.getPermissionInfo(((String) (obj1)), 4096);
	//   21   42:aload           5
	//   22   44:aload           4
	//   23   46:sipush          4096
	//   24   49:invokevirtual   #104 <Method android.content.pm.PermissionInfo PackageManager.getPermissionInfo(String, int)>
	//   25   52:pop             
		}
	//*  26   53:aload           5
	//*  27   55:aload_3         
	//*  28   56:iconst_2        
	//*  29   57:invokevirtual   #71  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  30   60:astore          4
	//*  31   62:aload           4
	//*  32   64:getfield        #110 <Field ActivityInfo[] PackageInfo.receivers>
	//*  33   67:astore          4
	//*  34   69:aload           4
	//*  35   71:ifnull          232
	//*  36   74:aload           4
	//*  37   76:arraylength     
	//*  38   77:ifeq            232
	//*  39   80:ldc1            #39  <String "GCMRegistrar">
	//*  40   82:iconst_2        
	//*  41   83:invokestatic    #116 <Method boolean Log.isLoggable(String, int)>
	//*  42   86:ifeq            141
	//*  43   89:new             #78  <Class StringBuilder>
	//*  44   92:dup             
	//*  45   93:invokespecial   #79  <Method void StringBuilder()>
	//*  46   96:astore          5
	//*  47   98:aload           5
	//*  48  100:ldc1            #118 <String "number of receivers for ">
	//*  49  102:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  50  105:pop             
	//*  51  106:aload           5
	//*  52  108:aload_3         
	//*  53  109:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  54  112:pop             
	//*  55  113:aload           5
	//*  56  115:ldc1            #120 <String ": ">
	//*  57  117:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  58  120:pop             
	//*  59  121:aload           5
	//*  60  123:aload           4
	//*  61  125:arraylength     
	//*  62  126:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//*  63  129:pop             
	//*  64  130:ldc1            #39  <String "GCMRegistrar">
	//*  65  132:aload           5
	//*  66  134:invokevirtual   #94  <Method String StringBuilder.toString()>
	//*  67  137:invokestatic    #124 <Method int Log.v(String, String)>
	//*  68  140:pop             
	//*  69  141:new             #126 <Class HashSet>
	//*  70  144:dup             
	//*  71  145:invokespecial   #127 <Method void HashSet()>
	//*  72  148:astore_3        
	//*  73  149:aload           4
	//*  74  151:arraylength     
	//*  75  152:istore_2        
	//*  76  153:iconst_0        
	//*  77  154:istore_1        
	//*  78  155:iload_1         
	//*  79  156:iload_2         
	//*  80  157:icmpge          198
	//*  81  160:aload           4
	//*  82  162:iload_1         
	//*  83  163:aaload          
	//*  84  164:astore          5
	//*  85  166:ldc1            #129 <String "com.google.android.c2dm.permission.SEND">
	//*  86  168:aload           5
	//*  87  170:getfield        #134 <Field String ActivityInfo.permission>
	//*  88  173:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  89  176:ifeq            191
	//*  90  179:aload_3         
	//*  91  180:aload           5
	//*  92  182:getfield        #143 <Field String ActivityInfo.name>
	//*  93  185:invokeinterface #148 <Method boolean Set.add(Object)>
	//*  94  190:pop             
	//*  95  191:iload_1         
	//*  96  192:iconst_1        
	//*  97  193:iadd            
	//*  98  194:istore_1        
	//*  99  195:goto            155
	//* 100  198:aload_3         
	//* 101  199:invokeinterface #152 <Method boolean Set.isEmpty()>
	//* 102  204:ifne            222
	//* 103  207:aload_0         
	//* 104  208:aload_3         
	//* 105  209:ldc1            #154 <String "com.google.android.c2dm.intent.REGISTRATION">
	//* 106  211:invokestatic    #158 <Method void checkReceiver(Context, Set, String)>
	//* 107  214:aload_0         
	//* 108  215:aload_3         
	//* 109  216:ldc1            #160 <String "com.google.android.c2dm.intent.RECEIVE">
	//* 110  218:invokestatic    #158 <Method void checkReceiver(Context, Set, String)>
	//* 111  221:return          
	//* 112  222:new             #162 <Class IllegalStateException>
	//* 113  225:dup             
	//* 114  226:ldc1            #164 <String "No receiver allowed to receive com.google.android.c2dm.permission.SEND">
	//* 115  228:invokespecial   #165 <Method void IllegalStateException(String)>
	//* 116  231:athrow          
	//* 117  232:new             #78  <Class StringBuilder>
	//* 118  235:dup             
	//* 119  236:invokespecial   #79  <Method void StringBuilder()>
	//* 120  239:astore_0        
	//* 121  240:aload_0         
	//* 122  241:ldc1            #167 <String "No receiver for package ">
	//* 123  243:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 124  246:pop             
	//* 125  247:aload_0         
	//* 126  248:aload_3         
	//* 127  249:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 128  252:pop             
	//* 129  253:new             #162 <Class IllegalStateException>
	//* 130  256:dup             
	//* 131  257:aload_0         
	//* 132  258:invokevirtual   #94  <Method String StringBuilder.toString()>
	//* 133  261:invokespecial   #165 <Method void IllegalStateException(String)>
	//* 134  264:athrow          
	//* 135  265:new             #78  <Class StringBuilder>
	//* 136  268:dup             
	//* 137  269:invokespecial   #79  <Method void StringBuilder()>
	//* 138  272:astore_0        
	//* 139  273:aload_0         
	//* 140  274:ldc1            #169 <String "Could not get receivers for package ">
	//* 141  276:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 142  279:pop             
	//* 143  280:aload_0         
	//* 144  281:aload_3         
	//* 145  282:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 146  285:pop             
	//* 147  286:new             #162 <Class IllegalStateException>
	//* 148  289:dup             
	//* 149  290:aload_0         
	//* 150  291:invokevirtual   #94  <Method String StringBuilder.toString()>
	//* 151  294:invokespecial   #165 <Method void IllegalStateException(String)>
	//* 152  297:athrow          
	//* 153  298:new             #78  <Class StringBuilder>
	//* 154  301:dup             
	//* 155  302:invokespecial   #79  <Method void StringBuilder()>
	//* 156  305:astore_0        
	//* 157  306:aload_0         
	//* 158  307:ldc1            #171 <String "Application does not define permission ">
	//* 159  309:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 160  312:pop             
	//* 161  313:aload_0         
	//* 162  314:aload           4
	//* 163  316:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 164  319:pop             
	//* 165  320:new             #162 <Class IllegalStateException>
	//* 166  323:dup             
	//* 167  324:aload_0         
	//* 168  325:invokevirtual   #94  <Method String StringBuilder.toString()>
	//* 169  328:invokespecial   #165 <Method void IllegalStateException(String)>
	//* 170  331:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append("Application does not define permission ");
			((StringBuilder) (context)).append(((String) (obj1)));
			throw new IllegalStateException(((StringBuilder) (context)).toString());
		}
		try
		{
			obj1 = ((Object) (packagemanager.getPackageInfo(((String) (obj)), 2)));
		}
	//* 171  332:astore_0        
	//* 172  333:goto            298
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append("Could not get receivers for package ");
			((StringBuilder) (context)).append(((String) (obj)));
			throw new IllegalStateException(((StringBuilder) (context)).toString());
		}
		obj1 = ((Object) (((PackageInfo) (obj1)).receivers));
		if(obj1 != null && obj1.length != 0)
		{
			if(Log.isLoggable("GCMRegistrar", 2))
			{
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("number of receivers for ");
				stringbuilder.append(((String) (obj)));
				stringbuilder.append(": ");
				stringbuilder.append(obj1.length);
				Log.v("GCMRegistrar", stringbuilder.toString());
			}
			obj = ((Object) (new HashSet()));
			int j = obj1.length;
			for(int i = 0; i < j; i++)
			{
				Object obj2 = obj1[i];
				if("com.google.android.c2dm.permission.SEND".equals(((Object) (((ActivityInfo) (obj2)).permission))))
					((Set) (obj)).add(((Object) (((ActivityInfo) (obj2)).name)));
			}

			if(!((Set) (obj)).isEmpty())
			{
				checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.REGISTRATION");
				checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.RECEIVE");
				return;
			} else
			{
				throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
			}
		} else
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append("No receiver for package ");
			((StringBuilder) (context)).append(((String) (obj)));
			throw new IllegalStateException(((StringBuilder) (context)).toString());
		}
	//* 173  336:astore_0        
	//* 174  337:goto            265
	}

	private static void checkReceiver(Context context, Set set, String s)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_3        
		context = ((Context) (context.getPackageName()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #98  <Method String Context.getPackageName()>
	//    5    9:astore_0        
		Intent intent = new Intent(s);
	//    6   10:new             #173 <Class Intent>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #174 <Method void Intent(String)>
	//   10   18:astore          4
		intent.setPackage(((String) (context)));
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:invokevirtual   #178 <Method Intent Intent.setPackage(String)>
	//   14   26:pop             
		context = ((Context) (packagemanager.queryBroadcastReceivers(intent, 32)));
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:bipush          32
	//   18   32:invokevirtual   #182 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   19   35:astore_0        
		if(!((List) (context)).isEmpty())
	//*  20   36:aload_0         
	//*  21   37:invokeinterface #185 <Method boolean List.isEmpty()>
	//*  22   42:ifne            196
		{
			if(Log.isLoggable("GCMRegistrar", 2))
	//*  23   45:ldc1            #39  <String "GCMRegistrar">
	//*  24   47:iconst_2        
	//*  25   48:invokestatic    #116 <Method boolean Log.isLoggable(String, int)>
	//*  26   51:ifeq            103
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   27   54:new             #78  <Class StringBuilder>
	//   28   57:dup             
	//   29   58:invokespecial   #79  <Method void StringBuilder()>
	//   30   61:astore_3        
				stringbuilder.append("Found ");
	//   31   62:aload_3         
	//   32   63:ldc1            #187 <String "Found ">
	//   33   65:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
				stringbuilder.append(((List) (context)).size());
	//   35   69:aload_3         
	//   36   70:aload_0         
	//   37   71:invokeinterface #191 <Method int List.size()>
	//   38   76:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   39   79:pop             
				stringbuilder.append(" receivers for action ");
	//   40   80:aload_3         
	//   41   81:ldc1            #193 <String " receivers for action ">
	//   42   83:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   43   86:pop             
				stringbuilder.append(s);
	//   44   87:aload_3         
	//   45   88:aload_2         
	//   46   89:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
				Log.v("GCMRegistrar", stringbuilder.toString());
	//   48   93:ldc1            #39  <String "GCMRegistrar">
	//   49   95:aload_3         
	//   50   96:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   51   99:invokestatic    #124 <Method int Log.v(String, String)>
	//   52  102:pop             
			}
			for(s = ((String) (((List) (context)).iterator())); ((Iterator) (s)).hasNext();)
	//*  53  103:aload_0         
	//*  54  104:invokeinterface #197 <Method Iterator List.iterator()>
	//*  55  109:astore_2        
	//*  56  110:aload_2         
	//*  57  111:invokeinterface #202 <Method boolean Iterator.hasNext()>
	//*  58  116:ifeq            195
			{
				context = ((Context) (((ResolveInfo)((Iterator) (s)).next()).activityInfo.name));
	//   59  119:aload_2         
	//   60  120:invokeinterface #206 <Method Object Iterator.next()>
	//   61  125:checkcast       #208 <Class ResolveInfo>
	//   62  128:getfield        #212 <Field ActivityInfo ResolveInfo.activityInfo>
	//   63  131:getfield        #143 <Field String ActivityInfo.name>
	//   64  134:astore_0        
				if(!set.contains(((Object) (context))))
	//*  65  135:aload_1         
	//*  66  136:aload_0         
	//*  67  137:invokeinterface #215 <Method boolean Set.contains(Object)>
	//*  68  142:ifeq            148
	//*  69  145:goto            110
				{
					set = ((Set) (new StringBuilder()));
	//   70  148:new             #78  <Class StringBuilder>
	//   71  151:dup             
	//   72  152:invokespecial   #79  <Method void StringBuilder()>
	//   73  155:astore_1        
					((StringBuilder) (set)).append("Receiver ");
	//   74  156:aload_1         
	//   75  157:ldc1            #217 <String "Receiver ">
	//   76  159:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   77  162:pop             
					((StringBuilder) (set)).append(((String) (context)));
	//   78  163:aload_1         
	//   79  164:aload_0         
	//   80  165:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   81  168:pop             
					((StringBuilder) (set)).append(" is not set with permission ");
	//   82  169:aload_1         
	//   83  170:ldc1            #219 <String " is not set with permission ">
	//   84  172:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   85  175:pop             
					((StringBuilder) (set)).append("com.google.android.c2dm.permission.SEND");
	//   86  176:aload_1         
	//   87  177:ldc1            #129 <String "com.google.android.c2dm.permission.SEND">
	//   88  179:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   89  182:pop             
					throw new IllegalStateException(((StringBuilder) (set)).toString());
	//   90  183:new             #162 <Class IllegalStateException>
	//   91  186:dup             
	//   92  187:aload_1         
	//   93  188:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   94  191:invokespecial   #165 <Method void IllegalStateException(String)>
	//   95  194:athrow          
				}
			}

			return;
	//   96  195:return          
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   97  196:new             #78  <Class StringBuilder>
	//   98  199:dup             
	//   99  200:invokespecial   #79  <Method void StringBuilder()>
	//  100  203:astore_0        
			((StringBuilder) (context)).append("No receivers for action ");
	//  101  204:aload_0         
	//  102  205:ldc1            #221 <String "No receivers for action ">
	//  103  207:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  104  210:pop             
			((StringBuilder) (context)).append(s);
	//  105  211:aload_0         
	//  106  212:aload_2         
	//  107  213:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  108  216:pop             
			throw new IllegalStateException(((StringBuilder) (context)).toString());
	//  109  217:new             #162 <Class IllegalStateException>
	//  110  220:dup             
	//  111  221:aload_0         
	//  112  222:invokevirtual   #94  <Method String StringBuilder.toString()>
	//  113  225:invokespecial   #165 <Method void IllegalStateException(String)>
	//  114  228:athrow          
		}
	}

	static String clearRegistrationId(Context context)
	{
		return setRegistrationId(context, "");
	//    0    0:aload_0         
	//    1    1:ldc1            #227 <String "">
	//    2    3:invokestatic    #231 <Method String setRegistrationId(Context, String)>
	//    3    6:areturn         
	}

	private static int getAppVersion(Context context)
	{
		int i;
		try
		{
			i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #98  <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #71  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #236 <Field int PackageInfo.versionCode>
	//    7   15:istore_1        
		}
	//*   8   16:iload_1         
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #78  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #79  <Method void StringBuilder()>
	//   14   26:astore_2        
			stringbuilder.append("Coult not get package name: ");
	//   15   27:aload_2         
	//   16   28:ldc1            #238 <String "Coult not get package name: ">
	//   17   30:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(((Object) (context)));
	//   19   34:aload_2         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   22   39:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   23   40:new             #243 <Class RuntimeException>
	//   24   43:dup             
	//   25   44:aload_2         
	//   26   45:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   27   48:invokespecial   #244 <Method void RuntimeException(String)>
	//   28   51:athrow          
		}
		return i;
	}

	static int getBackoff(Context context)
	{
		return getGCMPreferences(context).getInt("backoff_ms", 3000);
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:ldc1            #8   <String "backoff_ms">
	//    3    6:sipush          3000
	//    4    9:invokeinterface #255 <Method int SharedPreferences.getInt(String, int)>
	//    5   14:ireturn         
	}

	static transient String getFlatSenderIds(String as[])
	{
		if(as != null && as.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          55
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder(as[0]);
	//    5    9:new             #78  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:aaload          
	//   10   16:invokespecial   #258 <Method void StringBuilder(String)>
	//   11   19:astore_2        
			for(int i = 1; i < as.length; i++)
	//*  12   20:iconst_1        
	//*  13   21:istore_1        
	//*  14   22:iload_1         
	//*  15   23:aload_0         
	//*  16   24:arraylength     
	//*  17   25:icmpge          50
			{
				stringbuilder.append(',');
	//   18   28:aload_2         
	//   19   29:bipush          44
	//   20   31:invokevirtual   #261 <Method StringBuilder StringBuilder.append(char)>
	//   21   34:pop             
				stringbuilder.append(as[i]);
	//   22   35:aload_2         
	//   23   36:aload_0         
	//   24   37:iload_1         
	//   25   38:aaload          
	//   26   39:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   27   42:pop             
			}

	//   28   43:iload_1         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_1        
	//*  32   47:goto            22
			return stringbuilder.toString();
	//   33   50:aload_2         
	//   34   51:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   35   54:areturn         
		} else
		{
			throw new IllegalArgumentException("No senderIds");
	//   36   55:new             #263 <Class IllegalArgumentException>
	//   37   58:dup             
	//   38   59:ldc2            #265 <String "No senderIds">
	//   39   62:invokespecial   #266 <Method void IllegalArgumentException(String)>
	//   40   65:athrow          
		}
	}

	private static SharedPreferences getGCMPreferences(Context context)
	{
		return context.getSharedPreferences("com.google.android.gcm", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "com.google.android.gcm">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #270 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:areturn         
	}

	public static long getRegisterOnServerLifespan(Context context)
	{
		return getGCMPreferences(context).getLong("onServerLifeSpan", 0x240c8400L);
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:ldc1            #33  <String "onServerLifeSpan">
	//    3    6:ldc2w           #14  <Long 0x240c8400L>
	//    4    9:invokeinterface #276 <Method long SharedPreferences.getLong(String, long)>
	//    5   14:lreturn         
	}

	public static String getRegistrationId(Context context)
	{
		Object obj = ((Object) (getGCMPreferences(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:astore_3        
		String s = ((SharedPreferences) (obj)).getString("regId", "");
	//    3    5:aload_3         
	//    4    6:ldc1            #36  <String "regId">
	//    5    8:ldc1            #227 <String "">
	//    6   10:invokeinterface #281 <Method String SharedPreferences.getString(String, String)>
	//    7   15:astore          4
		int i = ((SharedPreferences) (obj)).getInt("appVersion", 0x80000000);
	//    8   17:aload_3         
	//    9   18:ldc1            #24  <String "appVersion">
	//   10   20:ldc2            #282 <Int 0x80000000>
	//   11   23:invokeinterface #255 <Method int SharedPreferences.getInt(String, int)>
	//   12   28:istore_1        
		int j = getAppVersion(context);
	//   13   29:aload_0         
	//   14   30:invokestatic    #284 <Method int getAppVersion(Context)>
	//   15   33:istore_2        
		obj = ((Object) (s));
	//   16   34:aload           4
	//   17   36:astore_3        
		if(i != 0x80000000)
	//*  18   37:iload_1         
	//*  19   38:ldc2            #282 <Int 0x80000000>
	//*  20   41:icmpeq          114
		{
			obj = ((Object) (s));
	//   21   44:aload           4
	//   22   46:astore_3        
			if(i != j)
	//*  23   47:iload_1         
	//*  24   48:iload_2         
	//*  25   49:icmpeq          114
			{
				obj = ((Object) (new StringBuilder()));
	//   26   52:new             #78  <Class StringBuilder>
	//   27   55:dup             
	//   28   56:invokespecial   #79  <Method void StringBuilder()>
	//   29   59:astore_3        
				((StringBuilder) (obj)).append("App version changed from ");
	//   30   60:aload_3         
	//   31   61:ldc2            #286 <String "App version changed from ">
	//   32   64:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
				((StringBuilder) (obj)).append(i);
	//   34   68:aload_3         
	//   35   69:iload_1         
	//   36   70:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   37   73:pop             
				((StringBuilder) (obj)).append(" to ");
	//   38   74:aload_3         
	//   39   75:ldc2            #288 <String " to ">
	//   40   78:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
				((StringBuilder) (obj)).append(j);
	//   42   82:aload_3         
	//   43   83:iload_2         
	//   44   84:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   45   87:pop             
				((StringBuilder) (obj)).append("; resetting registration id");
	//   46   88:aload_3         
	//   47   89:ldc2            #290 <String "; resetting registration id">
	//   48   92:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
				Log.v("GCMRegistrar", ((StringBuilder) (obj)).toString());
	//   50   96:ldc1            #39  <String "GCMRegistrar">
	//   51   98:aload_3         
	//   52   99:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   53  102:invokestatic    #124 <Method int Log.v(String, String)>
	//   54  105:pop             
				clearRegistrationId(context);
	//   55  106:aload_0         
	//   56  107:invokestatic    #292 <Method String clearRegistrationId(Context)>
	//   57  110:pop             
				obj = "";
	//   58  111:ldc1            #227 <String "">
	//   59  113:astore_3        
			}
		}
		return ((String) (obj));
	//   60  114:aload_3         
	//   61  115:areturn         
	}

	static transient void internalRegister(Context context, String as[])
	{
		as = ((String []) (getFlatSenderIds(as)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #296 <Method String getFlatSenderIds(String[])>
	//    2    4:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    3    5:new             #78  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #79  <Method void StringBuilder()>
	//    6   12:astore_2        
		((StringBuilder) (obj)).append("Registering app ");
	//    7   13:aload_2         
	//    8   14:ldc2            #298 <String "Registering app ">
	//    9   17:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		((StringBuilder) (obj)).append(context.getPackageName());
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #98  <Method String Context.getPackageName()>
	//   14   26:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		((StringBuilder) (obj)).append(" of senders ");
	//   16   30:aload_2         
	//   17   31:ldc2            #300 <String " of senders ">
	//   18   34:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		((StringBuilder) (obj)).append(((String) (as)));
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		Log.v("GCMRegistrar", ((StringBuilder) (obj)).toString());
	//   24   44:ldc1            #39  <String "GCMRegistrar">
	//   25   46:aload_2         
	//   26   47:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   27   50:invokestatic    #124 <Method int Log.v(String, String)>
	//   28   53:pop             
		obj = ((Object) (new Intent("com.google.android.c2dm.intent.REGISTER")));
	//   29   54:new             #173 <Class Intent>
	//   30   57:dup             
	//   31   58:ldc2            #302 <String "com.google.android.c2dm.intent.REGISTER">
	//   32   61:invokespecial   #174 <Method void Intent(String)>
	//   33   64:astore_2        
		((Intent) (obj)).setPackage("com.google.android.gsf");
	//   34   65:aload_2         
	//   35   66:ldc1            #18  <String "com.google.android.gsf">
	//   36   68:invokevirtual   #178 <Method Intent Intent.setPackage(String)>
	//   37   71:pop             
		((Intent) (obj)).putExtra("app", ((android.os.Parcelable) (PendingIntent.getBroadcast(context, 0, new Intent(), 0))));
	//   38   72:aload_2         
	//   39   73:ldc2            #304 <String "app">
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:new             #173 <Class Intent>
	//   43   81:dup             
	//   44   82:invokespecial   #305 <Method void Intent()>
	//   45   85:iconst_0        
	//   46   86:invokestatic    #311 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   47   89:invokevirtual   #315 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   48   92:pop             
		((Intent) (obj)).putExtra("sender", ((String) (as)));
	//   49   93:aload_2         
	//   50   94:ldc2            #317 <String "sender">
	//   51   97:aload_1         
	//   52   98:invokevirtual   #320 <Method Intent Intent.putExtra(String, String)>
	//   53  101:pop             
		context.startService(((Intent) (obj)));
	//   54  102:aload_0         
	//   55  103:aload_2         
	//   56  104:invokevirtual   #324 <Method android.content.ComponentName Context.startService(Intent)>
	//   57  107:pop             
	//   58  108:return          
	}

	static void internalUnregister(Context context)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #78  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Unregistering app ");
	//    4    8:aload_1         
	//    5    9:ldc2            #327 <String "Unregistering app ">
	//    6   12:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(context.getPackageName());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #98  <Method String Context.getPackageName()>
	//   11   21:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		Log.v("GCMRegistrar", ((StringBuilder) (obj)).toString());
	//   13   25:ldc1            #39  <String "GCMRegistrar">
	//   14   27:aload_1         
	//   15   28:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   16   31:invokestatic    #124 <Method int Log.v(String, String)>
	//   17   34:pop             
		obj = ((Object) (new Intent("com.google.android.c2dm.intent.UNREGISTER")));
	//   18   35:new             #173 <Class Intent>
	//   19   38:dup             
	//   20   39:ldc2            #329 <String "com.google.android.c2dm.intent.UNREGISTER">
	//   21   42:invokespecial   #174 <Method void Intent(String)>
	//   22   45:astore_1        
		((Intent) (obj)).setPackage("com.google.android.gsf");
	//   23   46:aload_1         
	//   24   47:ldc1            #18  <String "com.google.android.gsf">
	//   25   49:invokevirtual   #178 <Method Intent Intent.setPackage(String)>
	//   26   52:pop             
		((Intent) (obj)).putExtra("app", ((android.os.Parcelable) (PendingIntent.getBroadcast(context, 0, new Intent(), 0))));
	//   27   53:aload_1         
	//   28   54:ldc2            #304 <String "app">
	//   29   57:aload_0         
	//   30   58:iconst_0        
	//   31   59:new             #173 <Class Intent>
	//   32   62:dup             
	//   33   63:invokespecial   #305 <Method void Intent()>
	//   34   66:iconst_0        
	//   35   67:invokestatic    #311 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   36   70:invokevirtual   #315 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   37   73:pop             
		context.startService(((Intent) (obj)));
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #324 <Method android.content.ComponentName Context.startService(Intent)>
	//   41   79:pop             
	//   42   80:return          
	}

	public static boolean isRegistered(Context context)
	{
		return getRegistrationId(context).length() > 0;
	//    0    0:aload_0         
	//    1    1:invokestatic    #333 <Method String getRegistrationId(Context)>
	//    2    4:invokevirtual   #336 <Method int String.length()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean isRegisteredOnServer(Context context)
	{
		context = ((Context) (getGCMPreferences(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:astore_0        
		boolean flag = ((SharedPreferences) (context)).getBoolean("onServer", false);
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <String "onServer">
	//    5    8:iconst_0        
	//    6    9:invokeinterface #341 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   14:istore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   15:new             #78  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #79  <Method void StringBuilder()>
	//   11   22:astore          4
		stringbuilder.append("Is registered on server: ");
	//   12   24:aload           4
	//   13   26:ldc2            #343 <String "Is registered on server: ">
	//   14   29:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append(flag);
	//   16   33:aload           4
	//   17   35:iload_1         
	//   18   36:invokevirtual   #346 <Method StringBuilder StringBuilder.append(boolean)>
	//   19   39:pop             
		Log.v("GCMRegistrar", stringbuilder.toString());
	//   20   40:ldc1            #39  <String "GCMRegistrar">
	//   21   42:aload           4
	//   22   44:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   23   47:invokestatic    #124 <Method int Log.v(String, String)>
	//   24   50:pop             
		if(flag)
	//*  25   51:iload_1         
	//*  26   52:ifeq            116
		{
			long l = ((SharedPreferences) (context)).getLong("onServerExpirationTime", -1L);
	//   27   55:aload_0         
	//   28   56:ldc1            #30  <String "onServerExpirationTime">
	//   29   58:ldc2w           #347 <Long -1L>
	//   30   61:invokeinterface #276 <Method long SharedPreferences.getLong(String, long)>
	//   31   66:lstore_2        
			if(System.currentTimeMillis() > l)
	//*  32   67:invokestatic    #354 <Method long System.currentTimeMillis()>
	//*  33   70:lload_2         
	//*  34   71:lcmp            
	//*  35   72:ifle            116
			{
				context = ((Context) (new StringBuilder()));
	//   36   75:new             #78  <Class StringBuilder>
	//   37   78:dup             
	//   38   79:invokespecial   #79  <Method void StringBuilder()>
	//   39   82:astore_0        
				((StringBuilder) (context)).append("flag expired on: ");
	//   40   83:aload_0         
	//   41   84:ldc2            #356 <String "flag expired on: ">
	//   42   87:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   43   90:pop             
				((StringBuilder) (context)).append(((Object) (new Timestamp(l))));
	//   44   91:aload_0         
	//   45   92:new             #358 <Class Timestamp>
	//   46   95:dup             
	//   47   96:lload_2         
	//   48   97:invokespecial   #361 <Method void Timestamp(long)>
	//   49  100:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   50  103:pop             
				Log.v("GCMRegistrar", ((StringBuilder) (context)).toString());
	//   51  104:ldc1            #39  <String "GCMRegistrar">
	//   52  106:aload_0         
	//   53  107:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   54  110:invokestatic    #124 <Method int Log.v(String, String)>
	//   55  113:pop             
				return false;
	//   56  114:iconst_0        
	//   57  115:ireturn         
			}
		}
		return flag;
	//   58  116:iload_1         
	//   59  117:ireturn         
	}

	public static void onDestroy(Context context)
	{
		com/google/android/gcm/GCMRegistrar;
	//    0    0:ldc1            #2   <Class GCMRegistrar>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sRetryReceiver != null)
	//*   2    3:getstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
	//*   3    6:ifnull          29
		{
			Log.v("GCMRegistrar", "Unregistering receiver");
	//    4    9:ldc1            #39  <String "GCMRegistrar">
	//    5   11:ldc2            #366 <String "Unregistering receiver">
	//    6   14:invokestatic    #124 <Method int Log.v(String, String)>
	//    7   17:pop             
			context.unregisterReceiver(((android.content.BroadcastReceiver) (sRetryReceiver)));
	//    8   18:aload_0         
	//    9   19:getstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
	//   10   22:invokevirtual   #370 <Method void Context.unregisterReceiver(android.content.BroadcastReceiver)>
			sRetryReceiver = null;
	//   11   25:aconst_null     
	//   12   26:putstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
		}
		com/google/android/gcm/GCMRegistrar;
	//   13   29:ldc1            #2   <Class GCMRegistrar>
		JVM INSTR monitorexit ;
	//   14   31:monitorexit     
		return;
	//   15   32:return          
		context;
	//   16   33:astore_0        
	//*  17   34:ldc1            #2   <Class GCMRegistrar>
		throw context;
	//   18   36:monitorexit     
	//   19   37:aload_0         
	//   20   38:athrow          
	}

	public static transient void register(Context context, String as[])
	{
		resetBackoff(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #374 <Method void resetBackoff(Context)>
		internalRegister(context, as);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #376 <Method void internalRegister(Context, String[])>
	//    5    9:return          
	}

	static void resetBackoff(Context context)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #78  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("resetting backoff for ");
	//    4    8:aload_1         
	//    5    9:ldc2            #378 <String "resetting backoff for ">
	//    6   12:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(context.getPackageName());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #98  <Method String Context.getPackageName()>
	//   11   21:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		Log.d("GCMRegistrar", stringbuilder.toString());
	//   13   25:ldc1            #39  <String "GCMRegistrar">
	//   14   27:aload_1         
	//   15   28:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   16   31:invokestatic    #381 <Method int Log.d(String, String)>
	//   17   34:pop             
		setBackoff(context, 3000);
	//   18   35:aload_0         
	//   19   36:sipush          3000
	//   20   39:invokestatic    #385 <Method void setBackoff(Context, int)>
	//   21   42:return          
	}

	static void setBackoff(Context context, int i)
	{
		context = ((Context) (getGCMPreferences(context).edit()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:invokeinterface #389 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putInt("backoff_ms", i);
	//    4   10:aload_0         
	//    5   11:ldc1            #8   <String "backoff_ms">
	//    6   13:iload_1         
	//    7   14:invokeinterface #395 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    8   19:pop             
		((android.content.SharedPreferences.Editor) (context)).commit();
	//    9   20:aload_0         
	//   10   21:invokeinterface #398 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   11   26:pop             
	//   12   27:return          
	}

	public static void setRegisterOnServerLifespan(Context context, long l)
	{
		context = ((Context) (getGCMPreferences(context).edit()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:invokeinterface #389 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putLong("onServerLifeSpan", l);
	//    4   10:aload_0         
	//    5   11:ldc1            #33  <String "onServerLifeSpan">
	//    6   13:lload_1         
	//    7   14:invokeinterface #404 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    8   19:pop             
		((android.content.SharedPreferences.Editor) (context)).commit();
	//    9   20:aload_0         
	//   10   21:invokeinterface #398 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   11   26:pop             
	//   12   27:return          
	}

	public static void setRegisteredOnServer(Context context, boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getGCMPreferences(context).edit();
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:invokeinterface #389 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore          4
		editor.putBoolean("onServer", flag);
	//    4   11:aload           4
	//    5   13:ldc1            #27  <String "onServer">
	//    6   15:iload_1         
	//    7   16:invokeinterface #410 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   21:pop             
		long l = getRegisterOnServerLifespan(context);
	//    9   22:aload_0         
	//   10   23:invokestatic    #412 <Method long getRegisterOnServerLifespan(Context)>
	//   11   26:lstore_2        
		l = System.currentTimeMillis() + l;
	//   12   27:invokestatic    #354 <Method long System.currentTimeMillis()>
	//   13   30:lload_2         
	//   14   31:ladd            
	//   15   32:lstore_2        
		context = ((Context) (new StringBuilder()));
	//   16   33:new             #78  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #79  <Method void StringBuilder()>
	//   19   40:astore_0        
		((StringBuilder) (context)).append("Setting registeredOnServer status as ");
	//   20   41:aload_0         
	//   21   42:ldc2            #414 <String "Setting registeredOnServer status as ">
	//   22   45:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		((StringBuilder) (context)).append(flag);
	//   24   49:aload_0         
	//   25   50:iload_1         
	//   26   51:invokevirtual   #346 <Method StringBuilder StringBuilder.append(boolean)>
	//   27   54:pop             
		((StringBuilder) (context)).append(" until ");
	//   28   55:aload_0         
	//   29   56:ldc2            #416 <String " until ">
	//   30   59:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		((StringBuilder) (context)).append(((Object) (new Timestamp(l))));
	//   32   63:aload_0         
	//   33   64:new             #358 <Class Timestamp>
	//   34   67:dup             
	//   35   68:lload_2         
	//   36   69:invokespecial   #361 <Method void Timestamp(long)>
	//   37   72:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   38   75:pop             
		Log.v("GCMRegistrar", ((StringBuilder) (context)).toString());
	//   39   76:ldc1            #39  <String "GCMRegistrar">
	//   40   78:aload_0         
	//   41   79:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   42   82:invokestatic    #124 <Method int Log.v(String, String)>
	//   43   85:pop             
		editor.putLong("onServerExpirationTime", l);
	//   44   86:aload           4
	//   45   88:ldc1            #30  <String "onServerExpirationTime">
	//   46   90:lload_2         
	//   47   91:invokeinterface #404 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   48   96:pop             
		editor.commit();
	//   49   97:aload           4
	//   50   99:invokeinterface #398 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   51  104:pop             
	//   52  105:return          
	}

	static String setRegistrationId(Context context, String s)
	{
		SharedPreferences sharedpreferences = getGCMPreferences(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #249 <Method SharedPreferences getGCMPreferences(Context)>
	//    2    4:astore          4
		String s1 = sharedpreferences.getString("regId", "");
	//    3    6:aload           4
	//    4    8:ldc1            #36  <String "regId">
	//    5   10:ldc1            #227 <String "">
	//    6   12:invokeinterface #281 <Method String SharedPreferences.getString(String, String)>
	//    7   17:astore_3        
		int i = getAppVersion(context);
	//    8   18:aload_0         
	//    9   19:invokestatic    #284 <Method int getAppVersion(Context)>
	//   10   22:istore_2        
		context = ((Context) (new StringBuilder()));
	//   11   23:new             #78  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #79  <Method void StringBuilder()>
	//   14   30:astore_0        
		((StringBuilder) (context)).append("Saving regId on app version ");
	//   15   31:aload_0         
	//   16   32:ldc2            #418 <String "Saving regId on app version ">
	//   17   35:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		((StringBuilder) (context)).append(i);
	//   19   39:aload_0         
	//   20   40:iload_2         
	//   21   41:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
		Log.v("GCMRegistrar", ((StringBuilder) (context)).toString());
	//   23   45:ldc1            #39  <String "GCMRegistrar">
	//   24   47:aload_0         
	//   25   48:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #124 <Method int Log.v(String, String)>
	//   27   54:pop             
		context = ((Context) (sharedpreferences.edit()));
	//   28   55:aload           4
	//   29   57:invokeinterface #389 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   30   62:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putString("regId", s);
	//   31   63:aload_0         
	//   32   64:ldc1            #36  <String "regId">
	//   33   66:aload_1         
	//   34   67:invokeinterface #422 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   35   72:pop             
		((android.content.SharedPreferences.Editor) (context)).putInt("appVersion", i);
	//   36   73:aload_0         
	//   37   74:ldc1            #24  <String "appVersion">
	//   38   76:iload_2         
	//   39   77:invokeinterface #395 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   40   82:pop             
		((android.content.SharedPreferences.Editor) (context)).commit();
	//   41   83:aload_0         
	//   42   84:invokeinterface #398 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   43   89:pop             
		return s1;
	//   44   90:aload_3         
	//   45   91:areturn         
	}

	static void setRetryBroadcastReceiver(Context context)
	{
		com/google/android/gcm/GCMRegistrar;
	//    0    0:ldc1            #2   <Class GCMRegistrar>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sRetryReceiver != null) goto _L2; else goto _L1
	//    2    3:getstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
	//    3    6:ifnonnull       193
_L1:
		if(sRetryReceiverClassName != null) goto _L4; else goto _L3
	//    4    9:getstatic       #427 <Field String sRetryReceiverClassName>
	//    5   12:ifnonnull       37
_L3:
		Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
	//    6   15:ldc1            #39  <String "GCMRegistrar">
	//    7   17:ldc2            #429 <String "internal error: retry receiver class not set yet">
	//    8   20:invokestatic    #432 <Method int Log.e(String, String)>
	//    9   23:pop             
		sRetryReceiver = new GCMBroadcastReceiver();
	//   10   24:new             #434 <Class GCMBroadcastReceiver>
	//   11   27:dup             
	//   12   28:invokespecial   #435 <Method void GCMBroadcastReceiver()>
	//   13   31:putstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
		  goto _L5
	//*  14   34:goto            126
_L4:
		sRetryReceiver = (GCMBroadcastReceiver)Class.forName(sRetryReceiverClassName).newInstance();
	//   15   37:getstatic       #427 <Field String sRetryReceiverClassName>
	//   16   40:invokestatic    #441 <Method Class Class.forName(String)>
	//   17   43:invokevirtual   #444 <Method Object Class.newInstance()>
	//   18   46:checkcast       #434 <Class GCMBroadcastReceiver>
	//   19   49:putstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
		  goto _L5
	//*  20   52:goto            126
_L7:
		StringBuilder stringbuilder = new StringBuilder();
	//   21   55:new             #78  <Class StringBuilder>
	//   22   58:dup             
	//   23   59:invokespecial   #79  <Method void StringBuilder()>
	//   24   62:astore_1        
		stringbuilder.append("Could not create instance of ");
	//   25   63:aload_1         
	//   26   64:ldc2            #446 <String "Could not create instance of ">
	//   27   67:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   28   70:pop             
		stringbuilder.append(sRetryReceiverClassName);
	//   29   71:aload_1         
	//   30   72:getstatic       #427 <Field String sRetryReceiverClassName>
	//   31   75:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   32   78:pop             
		stringbuilder.append(". Using ");
	//   33   79:aload_1         
	//   34   80:ldc2            #448 <String ". Using ">
	//   35   83:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   36   86:pop             
		stringbuilder.append(((Class) (com/google/android/gcm/GCMBroadcastReceiver)).getName());
	//   37   87:aload_1         
	//   38   88:ldc2            #434 <Class GCMBroadcastReceiver>
	//   39   91:invokevirtual   #451 <Method String Class.getName()>
	//   40   94:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   41   97:pop             
		stringbuilder.append(" directly.");
	//   42   98:aload_1         
	//   43   99:ldc2            #453 <String " directly.">
	//   44  102:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   45  105:pop             
		Log.e("GCMRegistrar", stringbuilder.toString());
	//   46  106:ldc1            #39  <String "GCMRegistrar">
	//   47  108:aload_1         
	//   48  109:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   49  112:invokestatic    #432 <Method int Log.e(String, String)>
	//   50  115:pop             
		sRetryReceiver = new GCMBroadcastReceiver();
	//   51  116:new             #434 <Class GCMBroadcastReceiver>
	//   52  119:dup             
	//   53  120:invokespecial   #435 <Method void GCMBroadcastReceiver()>
	//   54  123:putstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
_L5:
		String s = context.getPackageName();
	//   55  126:aload_0         
	//   56  127:invokevirtual   #98  <Method String Context.getPackageName()>
	//   57  130:astore_2        
		IntentFilter intentfilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
	//   58  131:new             #455 <Class IntentFilter>
	//   59  134:dup             
	//   60  135:ldc2            #457 <String "com.google.android.gcm.intent.RETRY">
	//   61  138:invokespecial   #458 <Method void IntentFilter(String)>
	//   62  141:astore_1        
		intentfilter.addCategory(s);
	//   63  142:aload_1         
	//   64  143:aload_2         
	//   65  144:invokevirtual   #461 <Method void IntentFilter.addCategory(String)>
		StringBuilder stringbuilder1 = new StringBuilder();
	//   66  147:new             #78  <Class StringBuilder>
	//   67  150:dup             
	//   68  151:invokespecial   #79  <Method void StringBuilder()>
	//   69  154:astore_3        
		stringbuilder1.append(s);
	//   70  155:aload_3         
	//   71  156:aload_2         
	//   72  157:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   73  160:pop             
		stringbuilder1.append(".permission.C2D_MESSAGE");
	//   74  161:aload_3         
	//   75  162:ldc1            #100 <String ".permission.C2D_MESSAGE">
	//   76  164:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   77  167:pop             
		s = stringbuilder1.toString();
	//   78  168:aload_3         
	//   79  169:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   80  172:astore_2        
		Log.v("GCMRegistrar", "Registering receiver");
	//   81  173:ldc1            #39  <String "GCMRegistrar">
	//   82  175:ldc2            #463 <String "Registering receiver">
	//   83  178:invokestatic    #124 <Method int Log.v(String, String)>
	//   84  181:pop             
		context.registerReceiver(((android.content.BroadcastReceiver) (sRetryReceiver)), intentfilter, s, ((android.os.Handler) (null)));
	//   85  182:aload_0         
	//   86  183:getstatic       #364 <Field GCMBroadcastReceiver sRetryReceiver>
	//   87  186:aload_1         
	//   88  187:aload_2         
	//   89  188:aconst_null     
	//   90  189:invokevirtual   #467 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter, String, android.os.Handler)>
	//   91  192:pop             
_L2:
		com/google/android/gcm/GCMRegistrar;
	//   92  193:ldc1            #2   <Class GCMRegistrar>
		JVM INSTR monitorexit ;
	//   93  195:monitorexit     
		return;
	//   94  196:return          
		context;
	//   95  197:astore_0        
	//*  96  198:ldc1            #2   <Class GCMRegistrar>
		throw context;
	//   97  200:monitorexit     
	//   98  201:aload_0         
	//   99  202:athrow          
		Exception exception;
		exception;
	//  100  203:astore_1        
		if(true) goto _L7; else goto _L6
_L6:
	//* 101  204:goto            55
	}

	static void setRetryReceiverClassName(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #78  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Setting the name of retry receiver class to ");
	//    4    8:aload_1         
	//    5    9:ldc2            #470 <String "Setting the name of retry receiver class to ">
	//    6   12:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		Log.v("GCMRegistrar", stringbuilder.toString());
	//   12   22:ldc1            #39  <String "GCMRegistrar">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #124 <Method int Log.v(String, String)>
	//   16   31:pop             
		sRetryReceiverClassName = s;
	//   17   32:aload_0         
	//   18   33:putstatic       #427 <Field String sRetryReceiverClassName>
	//   19   36:return          
	}

	public static void unregister(Context context)
	{
		resetBackoff(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #374 <Method void resetBackoff(Context)>
		internalUnregister(context);
	//    2    4:aload_0         
	//    3    5:invokestatic    #473 <Method void internalUnregister(Context)>
	//    4    8:return          
	}

	private static final String BACKOFF_MS = "backoff_ms";
	private static final int DEFAULT_BACKOFF_MS = 3000;
	public static final long DEFAULT_ON_SERVER_LIFESPAN_MS = 0x240c8400L;
	private static final String GSF_PACKAGE = "com.google.android.gsf";
	private static final String PREFERENCES = "com.google.android.gcm";
	private static final String PROPERTY_APP_VERSION = "appVersion";
	private static final String PROPERTY_ON_SERVER = "onServer";
	private static final String PROPERTY_ON_SERVER_EXPIRATION_TIME = "onServerExpirationTime";
	private static final String PROPERTY_ON_SERVER_LIFESPAN = "onServerLifeSpan";
	private static final String PROPERTY_REG_ID = "regId";
	private static final String TAG = "GCMRegistrar";
	private static GCMBroadcastReceiver sRetryReceiver;
	private static String sRetryReceiverClassName;
}
