// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

// Referenced classes of package com.bumptech.glide.module:
//			GlideModule

public final class ManifestParser
{

	public ManifestParser(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Context context>
	//    5    9:return          
	}

	private static GlideModule parseModule(String s)
	{
		Object obj;
		Object obj1;
		Class class1;
		try
		{
			class1 = Class.forName(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method Class Class.forName(String)>
	//    2    4:astore_2        
		}
	//*   3    5:aconst_null     
	//*   4    6:astore_0        
	//*   5    7:aload_2         
	//*   6    8:iconst_0        
	//*   7    9:anewarray       Class[]
	//*   8   12:invokevirtual   #44  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//*   9   15:iconst_0        
	//*  10   16:anewarray       Object[]
	//*  11   19:invokevirtual   #50  <Method Object Constructor.newInstance(Object[])>
	//*  12   22:astore_1        
	//*  13   23:aload_1         
	//*  14   24:astore_0        
	//*  15   25:goto            61
	//*  16   28:astore_1        
	//*  17   29:aload_2         
	//*  18   30:aload_1         
	//*  19   31:invokestatic    #54  <Method void throwInstantiateGlideModuleException(Class, Exception)>
	//*  20   34:goto            61
	//*  21   37:astore_1        
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:invokestatic    #54  <Method void throwInstantiateGlideModuleException(Class, Exception)>
	//*  25   43:goto            61
	//*  26   46:astore_1        
	//*  27   47:aload_2         
	//*  28   48:aload_1         
	//*  29   49:invokestatic    #54  <Method void throwInstantiateGlideModuleException(Class, Exception)>
	//*  30   52:goto            61
	//*  31   55:astore_1        
	//*  32   56:aload_2         
	//*  33   57:aload_1         
	//*  34   58:invokestatic    #54  <Method void throwInstantiateGlideModuleException(Class, Exception)>
	//*  35   61:aload_0         
	//*  36   62:instanceof      #56  <Class GlideModule>
	//*  37   65:ifeq            73
	//*  38   68:aload_0         
	//*  39   69:checkcast       #56  <Class GlideModule>
	//*  40   72:areturn         
	//*  41   73:new             #58  <Class StringBuilder>
	//*  42   76:dup             
	//*  43   77:invokespecial   #59  <Method void StringBuilder()>
	//*  44   80:astore_1        
	//*  45   81:aload_1         
	//*  46   82:ldc1            #61  <String "Expected instanceof GlideModule, but found: ">
	//*  47   84:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  48   87:pop             
	//*  49   88:aload_1         
	//*  50   89:aload_0         
	//*  51   90:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//*  52   93:pop             
	//*  53   94:new             #70  <Class RuntimeException>
	//*  54   97:dup             
	//*  55   98:aload_1         
	//*  56   99:invokevirtual   #74  <Method String StringBuilder.toString()>
	//*  57  102:invokespecial   #77  <Method void RuntimeException(String)>
	//*  58  105:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  59  106:astore_0        
		{
			throw new IllegalArgumentException("Unable to find GlideModule implementation", ((Throwable) (s)));
	//   60  107:new             #79  <Class IllegalArgumentException>
	//   61  110:dup             
	//   62  111:ldc1            #81  <String "Unable to find GlideModule implementation">
	//   63  113:aload_0         
	//   64  114:invokespecial   #84  <Method void IllegalArgumentException(String, Throwable)>
	//   65  117:athrow          
		}
		s = null;
		obj = class1.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
		s = ((String) (obj));
		break MISSING_BLOCK_LABEL_61;
		obj1;
		throwInstantiateGlideModuleException(class1, ((Exception) (obj1)));
		break MISSING_BLOCK_LABEL_61;
		obj1;
		throwInstantiateGlideModuleException(class1, ((Exception) (obj1)));
		break MISSING_BLOCK_LABEL_61;
		obj1;
		throwInstantiateGlideModuleException(class1, ((Exception) (obj1)));
		break MISSING_BLOCK_LABEL_61;
		obj1;
		throwInstantiateGlideModuleException(class1, ((Exception) (obj1)));
		if(s instanceof GlideModule)
		{
			return (GlideModule)s;
		} else
		{
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Expected instanceof GlideModule, but found: ");
			((StringBuilder) (obj1)).append(((Object) (s)));
			throw new RuntimeException(((StringBuilder) (obj1)).toString());
		}
	}

	private static void throwInstantiateGlideModuleException(Class class1, Exception exception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unable to instantiate GlideModule implementation for ");
	//    4    8:aload_2         
	//    5    9:ldc1            #86  <String "Unable to instantiate GlideModule implementation for ">
	//    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (class1)));
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		throw new RuntimeException(stringbuilder.toString(), ((Throwable) (exception)));
	//   12   21:new             #70  <Class RuntimeException>
	//   13   24:dup             
	//   14   25:aload_2         
	//   15   26:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   16   29:aload_1         
	//   17   30:invokespecial   #87  <Method void RuntimeException(String, Throwable)>
	//   18   33:athrow          
	}

	public List parse()
	{
		Object obj;
		if(Log.isLoggable("ManifestParser", 3))
	//*   0    0:ldc1            #12  <String "ManifestParser">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #99  <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            17
			Log.d("ManifestParser", "Loading Glide modules");
	//    4    9:ldc1            #12  <String "ManifestParser">
	//    5   11:ldc1            #101 <String "Loading Glide modules">
	//    6   13:invokestatic    #105 <Method int Log.d(String, String)>
	//    7   16:pop             
		obj = ((Object) (new ArrayList()));
	//    8   17:new             #107 <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #108 <Method void ArrayList()>
	//   11   24:astore_1        
		ApplicationInfo applicationinfo;
		applicationinfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
	//   12   25:aload_0         
	//   13   26:getfield        #21  <Field Context context>
	//   14   29:invokevirtual   #114 <Method PackageManager Context.getPackageManager()>
	//   15   32:aload_0         
	//   16   33:getfield        #21  <Field Context context>
	//   17   36:invokevirtual   #117 <Method String Context.getPackageName()>
	//   18   39:sipush          128
	//   19   42:invokevirtual   #123 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   20   45:astore_2        
		if(applicationinfo.metaData != null)
			break MISSING_BLOCK_LABEL_72;
	//   21   46:aload_2         
	//   22   47:getfield        #129 <Field Bundle ApplicationInfo.metaData>
	//   23   50:ifnonnull       72
		if(!Log.isLoggable("ManifestParser", 3))
			break MISSING_BLOCK_LABEL_256;
	//   24   53:ldc1            #12  <String "ManifestParser">
	//   25   55:iconst_3        
	//   26   56:invokestatic    #99  <Method boolean Log.isLoggable(String, int)>
	//   27   59:ifeq            256
		Log.d("ManifestParser", "Got null app info metadata");
	//   28   62:ldc1            #12  <String "ManifestParser">
	//   29   64:ldc1            #131 <String "Got null app info metadata">
	//   30   66:invokestatic    #105 <Method int Log.d(String, String)>
	//   31   69:pop             
		return ((List) (obj));
	//   32   70:aload_1         
	//   33   71:areturn         
		try
		{
			if(Log.isLoggable("ManifestParser", 2))
	//*  34   72:ldc1            #12  <String "ManifestParser">
	//*  35   74:iconst_2        
	//*  36   75:invokestatic    #99  <Method boolean Log.isLoggable(String, int)>
	//*  37   78:ifeq            115
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   38   81:new             #58  <Class StringBuilder>
	//   39   84:dup             
	//   40   85:invokespecial   #59  <Method void StringBuilder()>
	//   41   88:astore_3        
				stringbuilder.append("Got app info metadata: ");
	//   42   89:aload_3         
	//   43   90:ldc1            #133 <String "Got app info metadata: ">
	//   44   92:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
				stringbuilder.append(((Object) (applicationinfo.metaData)));
	//   46   96:aload_3         
	//   47   97:aload_2         
	//   48   98:getfield        #129 <Field Bundle ApplicationInfo.metaData>
	//   49  101:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   50  104:pop             
				Log.v("ManifestParser", stringbuilder.toString());
	//   51  105:ldc1            #12  <String "ManifestParser">
	//   52  107:aload_3         
	//   53  108:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   54  111:invokestatic    #136 <Method int Log.v(String, String)>
	//   55  114:pop             
			}
			Iterator iterator = applicationinfo.metaData.keySet().iterator();
	//   56  115:aload_2         
	//   57  116:getfield        #129 <Field Bundle ApplicationInfo.metaData>
	//   58  119:invokevirtual   #142 <Method Set Bundle.keySet()>
	//   59  122:invokeinterface #148 <Method Iterator Set.iterator()>
	//   60  127:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   61  128:aload_3         
	//   62  129:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   63  134:ifeq            225
				String s = (String)iterator.next();
	//   64  137:aload_3         
	//   65  138:invokeinterface #158 <Method Object Iterator.next()>
	//   66  143:checkcast       #160 <Class String>
	//   67  146:astore          4
				if("GlideModule".equals(applicationinfo.metaData.get(s)))
	//*  68  148:ldc1            #9   <String "GlideModule">
	//*  69  150:aload_2         
	//*  70  151:getfield        #129 <Field Bundle ApplicationInfo.metaData>
	//*  71  154:aload           4
	//*  72  156:invokevirtual   #164 <Method Object Bundle.get(String)>
	//*  73  159:invokevirtual   #168 <Method boolean String.equals(Object)>
	//*  74  162:ifeq            128
				{
					((List) (obj)).add(((Object) (parseModule(s))));
	//   75  165:aload_1         
	//   76  166:aload           4
	//   77  168:invokestatic    #170 <Method GlideModule parseModule(String)>
	//   78  171:invokeinterface #175 <Method boolean List.add(Object)>
	//   79  176:pop             
					if(Log.isLoggable("ManifestParser", 3))
	//*  80  177:ldc1            #12  <String "ManifestParser">
	//*  81  179:iconst_3        
	//*  82  180:invokestatic    #99  <Method boolean Log.isLoggable(String, int)>
	//*  83  183:ifeq            128
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   84  186:new             #58  <Class StringBuilder>
	//   85  189:dup             
	//   86  190:invokespecial   #59  <Method void StringBuilder()>
	//   87  193:astore          5
						stringbuilder1.append("Loaded Glide module: ");
	//   88  195:aload           5
	//   89  197:ldc1            #177 <String "Loaded Glide module: ">
	//   90  199:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   91  202:pop             
						stringbuilder1.append(s);
	//   92  203:aload           5
	//   93  205:aload           4
	//   94  207:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   95  210:pop             
						Log.d("ManifestParser", stringbuilder1.toString());
	//   96  211:ldc1            #12  <String "ManifestParser">
	//   97  213:aload           5
	//   98  215:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   99  218:invokestatic    #105 <Method int Log.d(String, String)>
	//  100  221:pop             
					}
				}
			} while(true);
	//  101  222:goto            128
		}
	//* 102  225:ldc1            #12  <String "ManifestParser">
	//* 103  227:iconst_3        
	//* 104  228:invokestatic    #99  <Method boolean Log.isLoggable(String, int)>
	//* 105  231:ifeq            242
	//* 106  234:ldc1            #12  <String "ManifestParser">
	//* 107  236:ldc1            #179 <String "Finished loading Glide modules">
	//* 108  238:invokestatic    #105 <Method int Log.d(String, String)>
	//* 109  241:pop             
	//* 110  242:aload_1         
	//* 111  243:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 112  244:astore_1        
		{
			throw new RuntimeException("Unable to find metadata to parse GlideModules", ((Throwable) (obj)));
	//  113  245:new             #70  <Class RuntimeException>
	//  114  248:dup             
	//  115  249:ldc1            #181 <String "Unable to find metadata to parse GlideModules">
	//  116  251:aload_1         
	//  117  252:invokespecial   #87  <Method void RuntimeException(String, Throwable)>
	//  118  255:athrow          
		}
		if(Log.isLoggable("ManifestParser", 3))
			Log.d("ManifestParser", "Finished loading Glide modules");
		return ((List) (obj));
		return ((List) (obj));
	//  119  256:aload_1         
	//  120  257:areturn         
	}

	private static final String GLIDE_MODULE_VALUE = "GlideModule";
	private static final String TAG = "ManifestParser";
	private final Context context;
}
