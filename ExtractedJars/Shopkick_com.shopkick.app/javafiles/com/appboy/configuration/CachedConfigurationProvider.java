// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.configuration;

import android.content.Context;
import android.content.res.Resources;
import bo.app.j;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import java.util.*;

public class CachedConfigurationProvider
{

	public CachedConfigurationProvider(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Context b>
	//    5    9:aload_0         
	//    6   10:new             #32  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #33  <Method void HashMap()>
	//    9   17:invokestatic    #39  <Method Map Collections.synchronizedMap(Map)>
	//   10   20:putfield        #41  <Field Map mConfigurationCache>
		mRuntimeAppConfigurationProvider = new j(context);
	//   11   23:aload_0         
	//   12   24:new             #43  <Class j>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:invokespecial   #45  <Method void j(Context)>
	//   16   32:putfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//   17   35:return          
	}

	protected boolean getBooleanValue(String s, boolean flag)
	{
		if(mConfigurationCache.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Map mConfigurationCache>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            30
			return ((Boolean)mConfigurationCache.get(((Object) (s)))).booleanValue();
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field Map mConfigurationCache>
	//    7   17:aload_1         
	//    8   18:invokeinterface #59  <Method Object Map.get(Object)>
	//    9   23:checkcast       #61  <Class Boolean>
	//   10   26:invokevirtual   #65  <Method boolean Boolean.booleanValue()>
	//   11   29:ireturn         
		if(mRuntimeAppConfigurationProvider.a(s))
	//*  12   30:aload_0         
	//*  13   31:getfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//*  14   34:aload_1         
	//*  15   35:invokevirtual   #68  <Method boolean j.a(String)>
	//*  16   38:ifeq            121
		{
			flag = mRuntimeAppConfigurationProvider.a(s, flag);
	//   17   41:aload_0         
	//   18   42:getfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:invokevirtual   #70  <Method boolean j.a(String, boolean)>
	//   22   50:istore_2        
			mConfigurationCache.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//   23   51:aload_0         
	//   24   52:getfield        #41  <Field Map mConfigurationCache>
	//   25   55:aload_1         
	//   26   56:iload_2         
	//   27   57:invokestatic    #74  <Method Boolean Boolean.valueOf(boolean)>
	//   28   60:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   29   65:pop             
			String s1 = a;
	//   30   66:getstatic       #23  <Field String a>
	//   31   69:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   32   70:new             #80  <Class StringBuilder>
	//   33   73:dup             
	//   34   74:invokespecial   #81  <Method void StringBuilder()>
	//   35   77:astore          4
			stringbuilder.append("Using runtime override value for key: ");
	//   36   79:aload           4
	//   37   81:ldc1            #83  <String "Using runtime override value for key: ">
	//   38   83:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   39   86:pop             
			stringbuilder.append(s);
	//   40   87:aload           4
	//   41   89:aload_1         
	//   42   90:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:pop             
			stringbuilder.append(" and value: ");
	//   44   94:aload           4
	//   45   96:ldc1            #89  <String " and value: ">
	//   46   98:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   47  101:pop             
			stringbuilder.append(flag);
	//   48  102:aload           4
	//   49  104:iload_2         
	//   50  105:invokevirtual   #92  <Method StringBuilder StringBuilder.append(boolean)>
	//   51  108:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   52  109:aload_3         
	//   53  110:aload           4
	//   54  112:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   55  115:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   56  118:pop             
			return flag;
	//   57  119:iload_2         
	//   58  120:ireturn         
		} else
		{
			flag = readBooleanResourceValue(s, flag);
	//   59  121:aload_0         
	//   60  122:aload_1         
	//   61  123:iload_2         
	//   62  124:invokevirtual   #103 <Method boolean readBooleanResourceValue(String, boolean)>
	//   63  127:istore_2        
			mConfigurationCache.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//   64  128:aload_0         
	//   65  129:getfield        #41  <Field Map mConfigurationCache>
	//   66  132:aload_1         
	//   67  133:iload_2         
	//   68  134:invokestatic    #74  <Method Boolean Boolean.valueOf(boolean)>
	//   69  137:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   70  142:pop             
			String s2 = a;
	//   71  143:getstatic       #23  <Field String a>
	//   72  146:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   73  147:new             #80  <Class StringBuilder>
	//   74  150:dup             
	//   75  151:invokespecial   #81  <Method void StringBuilder()>
	//   76  154:astore          4
			stringbuilder1.append("Defaulting to using xml value for key: ");
	//   77  156:aload           4
	//   78  158:ldc1            #105 <String "Defaulting to using xml value for key: ">
	//   79  160:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
			stringbuilder1.append(s);
	//   81  164:aload           4
	//   82  166:aload_1         
	//   83  167:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   84  170:pop             
			stringbuilder1.append(" and value: ");
	//   85  171:aload           4
	//   86  173:ldc1            #89  <String " and value: ">
	//   87  175:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   88  178:pop             
			stringbuilder1.append(flag);
	//   89  179:aload           4
	//   90  181:iload_2         
	//   91  182:invokevirtual   #92  <Method StringBuilder StringBuilder.append(boolean)>
	//   92  185:pop             
			AppboyLogger.d(s2, stringbuilder1.toString());
	//   93  186:aload_3         
	//   94  187:aload           4
	//   95  189:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   96  192:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   97  195:pop             
			return flag;
	//   98  196:iload_2         
	//   99  197:ireturn         
		}
	}

	protected int getIntValue(String s, int i)
	{
		if(mConfigurationCache.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Map mConfigurationCache>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            30
			return ((Integer)mConfigurationCache.get(((Object) (s)))).intValue();
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field Map mConfigurationCache>
	//    7   17:aload_1         
	//    8   18:invokeinterface #59  <Method Object Map.get(Object)>
	//    9   23:checkcast       #109 <Class Integer>
	//   10   26:invokevirtual   #113 <Method int Integer.intValue()>
	//   11   29:ireturn         
		if(mRuntimeAppConfigurationProvider.a(s))
	//*  12   30:aload_0         
	//*  13   31:getfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//*  14   34:aload_1         
	//*  15   35:invokevirtual   #68  <Method boolean j.a(String)>
	//*  16   38:ifeq            121
		{
			i = mRuntimeAppConfigurationProvider.a(s, i);
	//   17   41:aload_0         
	//   18   42:getfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:invokevirtual   #115 <Method int j.a(String, int)>
	//   22   50:istore_2        
			mConfigurationCache.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//   23   51:aload_0         
	//   24   52:getfield        #41  <Field Map mConfigurationCache>
	//   25   55:aload_1         
	//   26   56:iload_2         
	//   27   57:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//   28   60:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   29   65:pop             
			String s1 = a;
	//   30   66:getstatic       #23  <Field String a>
	//   31   69:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   32   70:new             #80  <Class StringBuilder>
	//   33   73:dup             
	//   34   74:invokespecial   #81  <Method void StringBuilder()>
	//   35   77:astore          4
			stringbuilder.append("Using runtime override value for key: ");
	//   36   79:aload           4
	//   37   81:ldc1            #83  <String "Using runtime override value for key: ">
	//   38   83:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   39   86:pop             
			stringbuilder.append(s);
	//   40   87:aload           4
	//   41   89:aload_1         
	//   42   90:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:pop             
			stringbuilder.append(" and value: ");
	//   44   94:aload           4
	//   45   96:ldc1            #89  <String " and value: ">
	//   46   98:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   47  101:pop             
			stringbuilder.append(i);
	//   48  102:aload           4
	//   49  104:iload_2         
	//   50  105:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   51  108:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   52  109:aload_3         
	//   53  110:aload           4
	//   54  112:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   55  115:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   56  118:pop             
			return i;
	//   57  119:iload_2         
	//   58  120:ireturn         
		} else
		{
			i = readIntegerResourceValue(s, i);
	//   59  121:aload_0         
	//   60  122:aload_1         
	//   61  123:iload_2         
	//   62  124:invokevirtual   #124 <Method int readIntegerResourceValue(String, int)>
	//   63  127:istore_2        
			mConfigurationCache.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//   64  128:aload_0         
	//   65  129:getfield        #41  <Field Map mConfigurationCache>
	//   66  132:aload_1         
	//   67  133:iload_2         
	//   68  134:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//   69  137:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   70  142:pop             
			String s2 = a;
	//   71  143:getstatic       #23  <Field String a>
	//   72  146:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   73  147:new             #80  <Class StringBuilder>
	//   74  150:dup             
	//   75  151:invokespecial   #81  <Method void StringBuilder()>
	//   76  154:astore          4
			stringbuilder1.append("Defaulting to using xml value for key: ");
	//   77  156:aload           4
	//   78  158:ldc1            #105 <String "Defaulting to using xml value for key: ">
	//   79  160:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
			stringbuilder1.append(s);
	//   81  164:aload           4
	//   82  166:aload_1         
	//   83  167:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   84  170:pop             
			stringbuilder1.append(" and value: ");
	//   85  171:aload           4
	//   86  173:ldc1            #89  <String " and value: ">
	//   87  175:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   88  178:pop             
			stringbuilder1.append(i);
	//   89  179:aload           4
	//   90  181:iload_2         
	//   91  182:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   92  185:pop             
			AppboyLogger.d(s2, stringbuilder1.toString());
	//   93  186:aload_3         
	//   94  187:aload           4
	//   95  189:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   96  192:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   97  195:pop             
			return i;
	//   98  196:iload_2         
	//   99  197:ireturn         
		}
	}

	protected String getStringValue(String s, String s1)
	{
		if(mConfigurationCache.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Map mConfigurationCache>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            27
			return (String)mConfigurationCache.get(((Object) (s)));
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field Map mConfigurationCache>
	//    7   17:aload_1         
	//    8   18:invokeinterface #59  <Method Object Map.get(Object)>
	//    9   23:checkcast       #128 <Class String>
	//   10   26:areturn         
		if(mRuntimeAppConfigurationProvider.a(s))
	//*  11   27:aload_0         
	//*  12   28:getfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//*  13   31:aload_1         
	//*  14   32:invokevirtual   #68  <Method boolean j.a(String)>
	//*  15   35:ifeq            115
		{
			s1 = mRuntimeAppConfigurationProvider.a(s, s1);
	//   16   38:aload_0         
	//   17   39:getfield        #47  <Field j mRuntimeAppConfigurationProvider>
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:invokevirtual   #130 <Method String j.a(String, String)>
	//   21   47:astore_2        
			mConfigurationCache.put(((Object) (s)), ((Object) (s1)));
	//   22   48:aload_0         
	//   23   49:getfield        #41  <Field Map mConfigurationCache>
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   27   59:pop             
			String s2 = a;
	//   28   60:getstatic       #23  <Field String a>
	//   29   63:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   30   64:new             #80  <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #81  <Method void StringBuilder()>
	//   33   71:astore          4
			stringbuilder.append("Using runtime override value for key: ");
	//   34   73:aload           4
	//   35   75:ldc1            #83  <String "Using runtime override value for key: ">
	//   36   77:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
			stringbuilder.append(s);
	//   38   81:aload           4
	//   39   83:aload_1         
	//   40   84:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   41   87:pop             
			stringbuilder.append(" and value: ");
	//   42   88:aload           4
	//   43   90:ldc1            #89  <String " and value: ">
	//   44   92:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
			stringbuilder.append(s1);
	//   46   96:aload           4
	//   47   98:aload_2         
	//   48   99:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   49  102:pop             
			AppboyLogger.d(s2, stringbuilder.toString());
	//   50  103:aload_3         
	//   51  104:aload           4
	//   52  106:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   53  109:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   54  112:pop             
			return s1;
	//   55  113:aload_2         
	//   56  114:areturn         
		} else
		{
			s1 = readStringResourceValue(s, s1);
	//   57  115:aload_0         
	//   58  116:aload_1         
	//   59  117:aload_2         
	//   60  118:invokevirtual   #133 <Method String readStringResourceValue(String, String)>
	//   61  121:astore_2        
			mConfigurationCache.put(((Object) (s)), ((Object) (s1)));
	//   62  122:aload_0         
	//   63  123:getfield        #41  <Field Map mConfigurationCache>
	//   64  126:aload_1         
	//   65  127:aload_2         
	//   66  128:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//   67  133:pop             
			String s3 = a;
	//   68  134:getstatic       #23  <Field String a>
	//   69  137:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   70  138:new             #80  <Class StringBuilder>
	//   71  141:dup             
	//   72  142:invokespecial   #81  <Method void StringBuilder()>
	//   73  145:astore          4
			stringbuilder1.append("Defaulting to using xml value for key: ");
	//   74  147:aload           4
	//   75  149:ldc1            #105 <String "Defaulting to using xml value for key: ">
	//   76  151:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   77  154:pop             
			stringbuilder1.append(s);
	//   78  155:aload           4
	//   79  157:aload_1         
	//   80  158:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   81  161:pop             
			stringbuilder1.append(" and value: ");
	//   82  162:aload           4
	//   83  164:ldc1            #89  <String " and value: ">
	//   84  166:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   85  169:pop             
			stringbuilder1.append(s1);
	//   86  170:aload           4
	//   87  172:aload_2         
	//   88  173:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   89  176:pop             
			AppboyLogger.d(s3, stringbuilder1.toString());
	//   90  177:aload_3         
	//   91  178:aload           4
	//   92  180:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   93  183:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//   94  186:pop             
			return s1;
	//   95  187:aload_2         
	//   96  188:areturn         
		}
	}

	protected boolean readBooleanResourceValue(String s, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return flag;
	//    2    4:iload_2         
	//    3    5:ireturn         
		int i;
		boolean flag1;
		String s1;
		StringBuilder stringbuilder;
		try
		{
			i = b.getResources().getIdentifier(s, "bool", PackageUtils.getResourcePackageName(b));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field Context b>
	//    6   10:invokevirtual   #141 <Method Resources Context.getResources()>
	//    7   13:aload_1         
	//    8   14:ldc1            #143 <String "bool">
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field Context b>
	//   11   20:invokestatic    #149 <Method String PackageUtils.getResourcePackageName(Context)>
	//   12   23:invokevirtual   #155 <Method int Resources.getIdentifier(String, String, String)>
	//   13   26:istore_3        
		}
	//*  14   27:iload_3         
	//*  15   28:ifne            96
	//*  16   31:getstatic       #23  <Field String a>
	//*  17   34:astore          5
	//*  18   36:new             #80  <Class StringBuilder>
	//*  19   39:dup             
	//*  20   40:invokespecial   #81  <Method void StringBuilder()>
	//*  21   43:astore          6
	//*  22   45:aload           6
	//*  23   47:ldc1            #157 <String "Unable to find the xml boolean configuration value with key ">
	//*  24   49:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:pop             
	//*  26   53:aload           6
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  29   59:pop             
	//*  30   60:aload           6
	//*  31   62:ldc1            #159 <String ". Using default value '">
	//*  32   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  33   67:pop             
	//*  34   68:aload           6
	//*  35   70:iload_2         
	//*  36   71:invokevirtual   #92  <Method StringBuilder StringBuilder.append(boolean)>
	//*  37   74:pop             
	//*  38   75:aload           6
	//*  39   77:ldc1            #161 <String "'.">
	//*  40   79:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  41   82:pop             
	//*  42   83:aload           5
	//*  43   85:aload           6
	//*  44   87:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  45   90:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  46   93:pop             
	//*  47   94:iload_2         
	//*  48   95:ireturn         
	//*  49   96:aload_0         
	//*  50   97:getfield        #30  <Field Context b>
	//*  51  100:invokevirtual   #141 <Method Resources Context.getResources()>
	//*  52  103:iload_3         
	//*  53  104:invokevirtual   #165 <Method boolean Resources.getBoolean(int)>
	//*  54  107:istore          4
	//*  55  109:iload           4
	//*  56  111:ireturn         
	//*  57  112:getstatic       #23  <Field String a>
	//*  58  115:astore          5
	//*  59  117:new             #80  <Class StringBuilder>
	//*  60  120:dup             
	//*  61  121:invokespecial   #81  <Method void StringBuilder()>
	//*  62  124:astore          6
	//*  63  126:aload           6
	//*  64  128:ldc1            #167 <String "Unexpected exception retrieving the xml boolean configuration value with key ">
	//*  65  130:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  66  133:pop             
	//*  67  134:aload           6
	//*  68  136:aload_1         
	//*  69  137:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  70  140:pop             
	//*  71  141:aload           6
	//*  72  143:ldc1            #169 <String ". Using default value ">
	//*  73  145:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  74  148:pop             
	//*  75  149:aload           6
	//*  76  151:iload_2         
	//*  77  152:invokevirtual   #92  <Method StringBuilder StringBuilder.append(boolean)>
	//*  78  155:pop             
	//*  79  156:aload           6
	//*  80  158:ldc1            #161 <String "'.">
	//*  81  160:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  82  163:pop             
	//*  83  164:aload           5
	//*  84  166:aload           6
	//*  85  168:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  86  171:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  87  174:pop             
	//*  88  175:iload_2         
	//*  89  176:ireturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			s1 = a;
			stringbuilder = new StringBuilder();
			stringbuilder.append("Unexpected exception retrieving the xml boolean configuration value with key ");
			stringbuilder.append(s);
			stringbuilder.append(". Using default value ");
			stringbuilder.append(flag);
			stringbuilder.append("'.");
			AppboyLogger.d(s1, stringbuilder.toString());
			return flag;
		}
		if(i != 0)
			break MISSING_BLOCK_LABEL_96;
		s1 = a;
		stringbuilder = new StringBuilder();
		stringbuilder.append("Unable to find the xml boolean configuration value with key ");
		stringbuilder.append(s);
		stringbuilder.append(". Using default value '");
		stringbuilder.append(flag);
		stringbuilder.append("'.");
		AppboyLogger.d(s1, stringbuilder.toString());
		return flag;
		flag1 = b.getResources().getBoolean(i);
		Exception exception;
		return flag1;
	//*  90  177:astore          5
	//*  91  179:goto            112
	}

	protected int readIntegerResourceValue(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return i;
	//    2    4:iload_2         
	//    3    5:ireturn         
		int k;
		String s1;
		StringBuilder stringbuilder;
		try
		{
			k = b.getResources().getIdentifier(s, "integer", PackageUtils.getResourcePackageName(b));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field Context b>
	//    6   10:invokevirtual   #141 <Method Resources Context.getResources()>
	//    7   13:aload_1         
	//    8   14:ldc1            #171 <String "integer">
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field Context b>
	//   11   20:invokestatic    #149 <Method String PackageUtils.getResourcePackageName(Context)>
	//   12   23:invokevirtual   #155 <Method int Resources.getIdentifier(String, String, String)>
	//   13   26:istore_3        
		}
	//*  14   27:iload_3         
	//*  15   28:ifne            96
	//*  16   31:getstatic       #23  <Field String a>
	//*  17   34:astore          4
	//*  18   36:new             #80  <Class StringBuilder>
	//*  19   39:dup             
	//*  20   40:invokespecial   #81  <Method void StringBuilder()>
	//*  21   43:astore          5
	//*  22   45:aload           5
	//*  23   47:ldc1            #173 <String "Unable to find the xml integer configuration value with key ">
	//*  24   49:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:pop             
	//*  26   53:aload           5
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  29   59:pop             
	//*  30   60:aload           5
	//*  31   62:ldc1            #159 <String ". Using default value '">
	//*  32   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  33   67:pop             
	//*  34   68:aload           5
	//*  35   70:iload_2         
	//*  36   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//*  37   74:pop             
	//*  38   75:aload           5
	//*  39   77:ldc1            #161 <String "'.">
	//*  40   79:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  41   82:pop             
	//*  42   83:aload           4
	//*  43   85:aload           5
	//*  44   87:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  45   90:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  46   93:pop             
	//*  47   94:iload_2         
	//*  48   95:ireturn         
	//*  49   96:aload_0         
	//*  50   97:getfield        #30  <Field Context b>
	//*  51  100:invokevirtual   #141 <Method Resources Context.getResources()>
	//*  52  103:iload_3         
	//*  53  104:invokevirtual   #177 <Method int Resources.getInteger(int)>
	//*  54  107:istore_3        
	//*  55  108:iload_3         
	//*  56  109:ireturn         
	//*  57  110:getstatic       #23  <Field String a>
	//*  58  113:astore          4
	//*  59  115:new             #80  <Class StringBuilder>
	//*  60  118:dup             
	//*  61  119:invokespecial   #81  <Method void StringBuilder()>
	//*  62  122:astore          5
	//*  63  124:aload           5
	//*  64  126:ldc1            #179 <String "Unexpected exception retrieving the xml integer configuration value with key ">
	//*  65  128:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  66  131:pop             
	//*  67  132:aload           5
	//*  68  134:aload_1         
	//*  69  135:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  70  138:pop             
	//*  71  139:aload           5
	//*  72  141:ldc1            #169 <String ". Using default value ">
	//*  73  143:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  74  146:pop             
	//*  75  147:aload           5
	//*  76  149:iload_2         
	//*  77  150:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//*  78  153:pop             
	//*  79  154:aload           5
	//*  80  156:ldc1            #161 <String "'.">
	//*  81  158:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  82  161:pop             
	//*  83  162:aload           4
	//*  84  164:aload           5
	//*  85  166:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  86  169:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  87  172:pop             
	//*  88  173:iload_2         
	//*  89  174:ireturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			s1 = a;
			stringbuilder = new StringBuilder();
			stringbuilder.append("Unexpected exception retrieving the xml integer configuration value with key ");
			stringbuilder.append(s);
			stringbuilder.append(". Using default value ");
			stringbuilder.append(i);
			stringbuilder.append("'.");
			AppboyLogger.d(s1, stringbuilder.toString());
			return i;
		}
		if(k != 0)
			break MISSING_BLOCK_LABEL_96;
		s1 = a;
		stringbuilder = new StringBuilder();
		stringbuilder.append("Unable to find the xml integer configuration value with key ");
		stringbuilder.append(s);
		stringbuilder.append(". Using default value '");
		stringbuilder.append(i);
		stringbuilder.append("'.");
		AppboyLogger.d(s1, stringbuilder.toString());
		return i;
		k = b.getResources().getInteger(k);
		Exception exception;
		return k;
	//*  90  175:astore          4
	//*  91  177:goto            110
	}

	protected String[] readStringArrayResourceValue(String s, String as[])
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return as;
	//    2    4:aload_2         
	//    3    5:areturn         
		int i;
		String s1;
		String as1[];
		StringBuilder stringbuilder;
		try
		{
			i = b.getResources().getIdentifier(s, "array", PackageUtils.getResourcePackageName(b));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field Context b>
	//    6   10:invokevirtual   #141 <Method Resources Context.getResources()>
	//    7   13:aload_1         
	//    8   14:ldc1            #183 <String "array">
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field Context b>
	//   11   20:invokestatic    #149 <Method String PackageUtils.getResourcePackageName(Context)>
	//   12   23:invokevirtual   #155 <Method int Resources.getIdentifier(String, String, String)>
	//   13   26:istore_3        
		}
	//*  14   27:iload_3         
	//*  15   28:ifne            99
	//*  16   31:getstatic       #23  <Field String a>
	//*  17   34:astore          4
	//*  18   36:new             #80  <Class StringBuilder>
	//*  19   39:dup             
	//*  20   40:invokespecial   #81  <Method void StringBuilder()>
	//*  21   43:astore          5
	//*  22   45:aload           5
	//*  23   47:ldc1            #185 <String "Unable to find the xml string array configuration value with key ">
	//*  24   49:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:pop             
	//*  26   53:aload           5
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  29   59:pop             
	//*  30   60:aload           5
	//*  31   62:ldc1            #159 <String ". Using default value '">
	//*  32   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  33   67:pop             
	//*  34   68:aload           5
	//*  35   70:aload_2         
	//*  36   71:invokestatic    #190 <Method String Arrays.toString(Object[])>
	//*  37   74:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  38   77:pop             
	//*  39   78:aload           5
	//*  40   80:ldc1            #161 <String "'.">
	//*  41   82:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  42   85:pop             
	//*  43   86:aload           4
	//*  44   88:aload           5
	//*  45   90:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  46   93:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  47   96:pop             
	//*  48   97:aload_2         
	//*  49   98:areturn         
	//*  50   99:aload_0         
	//*  51  100:getfield        #30  <Field Context b>
	//*  52  103:invokevirtual   #141 <Method Resources Context.getResources()>
	//*  53  106:iload_3         
	//*  54  107:invokevirtual   #194 <Method String[] Resources.getStringArray(int)>
	//*  55  110:astore          4
	//*  56  112:aload           4
	//*  57  114:areturn         
	//*  58  115:getstatic       #23  <Field String a>
	//*  59  118:astore          4
	//*  60  120:new             #80  <Class StringBuilder>
	//*  61  123:dup             
	//*  62  124:invokespecial   #81  <Method void StringBuilder()>
	//*  63  127:astore          5
	//*  64  129:aload           5
	//*  65  131:ldc1            #196 <String "Unexpected exception retrieving the xml string array configuration value with key ">
	//*  66  133:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  67  136:pop             
	//*  68  137:aload           5
	//*  69  139:aload_1         
	//*  70  140:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  71  143:pop             
	//*  72  144:aload           5
	//*  73  146:ldc1            #169 <String ". Using default value ">
	//*  74  148:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  75  151:pop             
	//*  76  152:aload           5
	//*  77  154:aload_2         
	//*  78  155:invokestatic    #190 <Method String Arrays.toString(Object[])>
	//*  79  158:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  80  161:pop             
	//*  81  162:aload           5
	//*  82  164:ldc1            #161 <String "'.">
	//*  83  166:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  84  169:pop             
	//*  85  170:aload           4
	//*  86  172:aload           5
	//*  87  174:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  88  177:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  89  180:pop             
	//*  90  181:aload_2         
	//*  91  182:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			as1 = ((String []) (a));
			stringbuilder = new StringBuilder();
			stringbuilder.append("Unexpected exception retrieving the xml string array configuration value with key ");
			stringbuilder.append(s);
			stringbuilder.append(". Using default value ");
			stringbuilder.append(Arrays.toString(((Object []) (as))));
			stringbuilder.append("'.");
			AppboyLogger.d(((String) (as1)), stringbuilder.toString());
			return as;
		}
		if(i != 0)
			break MISSING_BLOCK_LABEL_99;
		s1 = a;
		stringbuilder = new StringBuilder();
		stringbuilder.append("Unable to find the xml string array configuration value with key ");
		stringbuilder.append(s);
		stringbuilder.append(". Using default value '");
		stringbuilder.append(Arrays.toString(((Object []) (as))));
		stringbuilder.append("'.");
		AppboyLogger.d(s1, stringbuilder.toString());
		return as;
		as1 = b.getResources().getStringArray(i);
		Exception exception;
		return as1;
	//*  92  183:astore          4
	//*  93  185:goto            115
	}

	protected String readStringResourceValue(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return s1;
	//    2    4:aload_2         
	//    3    5:areturn         
		int i;
		String s2;
		StringBuilder stringbuilder;
		try
		{
			i = b.getResources().getIdentifier(s, "string", PackageUtils.getResourcePackageName(b));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field Context b>
	//    6   10:invokevirtual   #141 <Method Resources Context.getResources()>
	//    7   13:aload_1         
	//    8   14:ldc1            #198 <String "string">
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field Context b>
	//   11   20:invokestatic    #149 <Method String PackageUtils.getResourcePackageName(Context)>
	//   12   23:invokevirtual   #155 <Method int Resources.getIdentifier(String, String, String)>
	//   13   26:istore_3        
		}
	//*  14   27:iload_3         
	//*  15   28:ifne            96
	//*  16   31:getstatic       #23  <Field String a>
	//*  17   34:astore          4
	//*  18   36:new             #80  <Class StringBuilder>
	//*  19   39:dup             
	//*  20   40:invokespecial   #81  <Method void StringBuilder()>
	//*  21   43:astore          5
	//*  22   45:aload           5
	//*  23   47:ldc1            #200 <String "Unable to find the xml string configuration value with key ">
	//*  24   49:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:pop             
	//*  26   53:aload           5
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  29   59:pop             
	//*  30   60:aload           5
	//*  31   62:ldc1            #159 <String ". Using default value '">
	//*  32   64:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  33   67:pop             
	//*  34   68:aload           5
	//*  35   70:aload_2         
	//*  36   71:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  37   74:pop             
	//*  38   75:aload           5
	//*  39   77:ldc1            #161 <String "'.">
	//*  40   79:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  41   82:pop             
	//*  42   83:aload           4
	//*  43   85:aload           5
	//*  44   87:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  45   90:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  46   93:pop             
	//*  47   94:aload_2         
	//*  48   95:areturn         
	//*  49   96:aload_0         
	//*  50   97:getfield        #30  <Field Context b>
	//*  51  100:invokevirtual   #141 <Method Resources Context.getResources()>
	//*  52  103:iload_3         
	//*  53  104:invokevirtual   #204 <Method String Resources.getString(int)>
	//*  54  107:astore          4
	//*  55  109:aload           4
	//*  56  111:areturn         
	//*  57  112:getstatic       #23  <Field String a>
	//*  58  115:astore          4
	//*  59  117:new             #80  <Class StringBuilder>
	//*  60  120:dup             
	//*  61  121:invokespecial   #81  <Method void StringBuilder()>
	//*  62  124:astore          5
	//*  63  126:aload           5
	//*  64  128:ldc1            #206 <String "Unexpected exception retrieving the xml string configuration value with key ">
	//*  65  130:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  66  133:pop             
	//*  67  134:aload           5
	//*  68  136:aload_1         
	//*  69  137:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  70  140:pop             
	//*  71  141:aload           5
	//*  72  143:ldc1            #169 <String ". Using default value ">
	//*  73  145:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  74  148:pop             
	//*  75  149:aload           5
	//*  76  151:aload_2         
	//*  77  152:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  78  155:pop             
	//*  79  156:aload           5
	//*  80  158:ldc1            #161 <String "'.">
	//*  81  160:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  82  163:pop             
	//*  83  164:aload           4
	//*  84  166:aload           5
	//*  85  168:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  86  171:invokestatic    #100 <Method int AppboyLogger.d(String, String)>
	//*  87  174:pop             
	//*  88  175:aload_2         
	//*  89  176:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			s2 = a;
			stringbuilder = new StringBuilder();
			stringbuilder.append("Unexpected exception retrieving the xml string configuration value with key ");
			stringbuilder.append(s);
			stringbuilder.append(". Using default value ");
			stringbuilder.append(s1);
			stringbuilder.append("'.");
			AppboyLogger.d(s2, stringbuilder.toString());
			return s1;
		}
		if(i != 0)
			break MISSING_BLOCK_LABEL_96;
		s2 = a;
		stringbuilder = new StringBuilder();
		stringbuilder.append("Unable to find the xml string configuration value with key ");
		stringbuilder.append(s);
		stringbuilder.append(". Using default value '");
		stringbuilder.append(s1);
		stringbuilder.append("'.");
		AppboyLogger.d(s2, stringbuilder.toString());
		return s1;
		s2 = b.getResources().getString(i);
		Exception exception;
		return s2;
	//*  90  177:astore          4
	//*  91  179:goto            112
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/configuration/CachedConfigurationProvider);
	private final Context b;
	protected final Map mConfigurationCache = Collections.synchronizedMap(((Map) (new HashMap())));
	protected final j mRuntimeAppConfigurationProvider;

	static 
	{
	//    0    0:ldc1            #2   <Class CachedConfigurationProvider>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//*   3    8:return          
	}
}
