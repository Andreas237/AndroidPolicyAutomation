// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.bumptech.glide.module:
//			GlideModule

public final class ManifestParser
{

	public ManifestParser(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context context>
	//    5    9:return          
	}

	private static GlideModule parseModule(String s)
	{
		try
		{
			s = ((String) (Class.forName(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Class Class.forName(String)>
	//    2    4:astore_0        
		}
	//*   3    5:goto            20
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   4    8:astore_0        
		{
			throw new IllegalArgumentException("Unable to find GlideModule implementation", ((Throwable) (s)));
	//    5    9:new             #37  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #39  <String "Unable to find GlideModule implementation">
	//    8   15:aload_0         
	//    9   16:invokespecial   #42  <Method void IllegalArgumentException(String, Throwable)>
	//   10   19:athrow          
		}
		Object obj;
		try
		{
			obj = ((Class) (s)).newInstance();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #46  <Method Object Class.newInstance()>
	//   13   24:astore_1        
		}
	//*  14   25:goto            86
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  15   28:astore_1        
		{
			throw new RuntimeException((new StringBuilder()).append("Unable to instantiate GlideModule implementation for ").append(((Object) (s))).toString(), ((Throwable) (obj)));
	//   16   29:new             #48  <Class RuntimeException>
	//   17   32:dup             
	//   18   33:new             #50  <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #51  <Method void StringBuilder()>
	//   21   40:ldc1            #53  <String "Unable to instantiate GlideModule implementation for ">
	//   22   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:aload_0         
	//   24   46:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   25   49:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   52:aload_1         
	//   27   53:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   28   56:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  29   57:astore_1        
		{
			throw new RuntimeException((new StringBuilder()).append("Unable to instantiate GlideModule implementation for ").append(((Object) (s))).toString(), ((Throwable) (obj)));
	//   30   58:new             #48  <Class RuntimeException>
	//   31   61:dup             
	//   32   62:new             #50  <Class StringBuilder>
	//   33   65:dup             
	//   34   66:invokespecial   #51  <Method void StringBuilder()>
	//   35   69:ldc1            #53  <String "Unable to instantiate GlideModule implementation for ">
	//   36   71:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:aload_0         
	//   38   75:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   39   78:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   40   81:aload_1         
	//   41   82:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   42   85:athrow          
		}
		if(!(obj instanceof GlideModule))
	//*  43   86:aload_1         
	//*  44   87:instanceof      #67  <Class GlideModule>
	//*  45   90:ifne            120
			throw new RuntimeException((new StringBuilder()).append("Expected instanceof GlideModule, but found: ").append(obj).toString());
	//   46   93:new             #48  <Class RuntimeException>
	//   47   96:dup             
	//   48   97:new             #50  <Class StringBuilder>
	//   49  100:dup             
	//   50  101:invokespecial   #51  <Method void StringBuilder()>
	//   51  104:ldc1            #69  <String "Expected instanceof GlideModule, but found: ">
	//   52  106:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   53  109:aload_1         
	//   54  110:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   55  113:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   56  116:invokespecial   #72  <Method void RuntimeException(String)>
	//   57  119:athrow          
		else
			return (GlideModule)obj;
	//   58  120:aload_1         
	//   59  121:checkcast       #67  <Class GlideModule>
	//   60  124:areturn         
	}

	public List parse()
	{
		Object obj;
		if(Log.isLoggable("ManifestParser", 3))
	//*   0    0:ldc1            #11  <String "ManifestParser">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #82  <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            17
			Log.d("ManifestParser", "Loading Glide modules");
	//    4    9:ldc1            #11  <String "ManifestParser">
	//    5   11:ldc1            #84  <String "Loading Glide modules">
	//    6   13:invokestatic    #88  <Method int Log.d(String, String)>
	//    7   16:pop             
		obj = ((Object) (new ArrayList()));
	//    8   17:new             #90  <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #91  <Method void ArrayList()>
	//   11   24:astore_1        
		ApplicationInfo applicationinfo;
		applicationinfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
	//   12   25:aload_0         
	//   13   26:getfield        #20  <Field Context context>
	//   14   29:invokevirtual   #97  <Method PackageManager Context.getPackageManager()>
	//   15   32:aload_0         
	//   16   33:getfield        #20  <Field Context context>
	//   17   36:invokevirtual   #100 <Method String Context.getPackageName()>
	//   18   39:sipush          128
	//   19   42:invokevirtual   #106 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   20   45:astore_2        
		if(applicationinfo.metaData != null)
			break MISSING_BLOCK_LABEL_72;
	//   21   46:aload_2         
	//   22   47:getfield        #112 <Field Bundle ApplicationInfo.metaData>
	//   23   50:ifnonnull       72
		if(Log.isLoggable("ManifestParser", 3))
	//*  24   53:ldc1            #11  <String "ManifestParser">
	//*  25   55:iconst_3        
	//*  26   56:invokestatic    #82  <Method boolean Log.isLoggable(String, int)>
	//*  27   59:ifeq            70
			Log.d("ManifestParser", "Got null app info metadata");
	//   28   62:ldc1            #11  <String "ManifestParser">
	//   29   64:ldc1            #114 <String "Got null app info metadata">
	//   30   66:invokestatic    #88  <Method int Log.d(String, String)>
	//   31   69:pop             
		return ((List) (obj));
	//   32   70:aload_1         
	//   33   71:areturn         
		try
		{
			if(Log.isLoggable("ManifestParser", 2))
	//*  34   72:ldc1            #11  <String "ManifestParser">
	//*  35   74:iconst_2        
	//*  36   75:invokestatic    #82  <Method boolean Log.isLoggable(String, int)>
	//*  37   78:ifeq            109
				Log.v("ManifestParser", (new StringBuilder()).append("Got app info metadata: ").append(((Object) (applicationinfo.metaData))).toString());
	//   38   81:ldc1            #11  <String "ManifestParser">
	//   39   83:new             #50  <Class StringBuilder>
	//   40   86:dup             
	//   41   87:invokespecial   #51  <Method void StringBuilder()>
	//   42   90:ldc1            #116 <String "Got app info metadata: ">
	//   43   92:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   44   95:aload_2         
	//   45   96:getfield        #112 <Field Bundle ApplicationInfo.metaData>
	//   46   99:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   47  102:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   48  105:invokestatic    #119 <Method int Log.v(String, String)>
	//   49  108:pop             
			Iterator iterator = applicationinfo.metaData.keySet().iterator();
	//   50  109:aload_2         
	//   51  110:getfield        #112 <Field Bundle ApplicationInfo.metaData>
	//   52  113:invokevirtual   #125 <Method Set Bundle.keySet()>
	//   53  116:invokeinterface #131 <Method Iterator Set.iterator()>
	//   54  121:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   55  122:aload_3         
	//   56  123:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   57  128:ifeq            209
				String s = (String)iterator.next();
	//   58  131:aload_3         
	//   59  132:invokeinterface #140 <Method Object Iterator.next()>
	//   60  137:checkcast       #142 <Class String>
	//   61  140:astore          4
				if("GlideModule".equals(applicationinfo.metaData.get(s)))
	//*  62  142:ldc1            #8   <String "GlideModule">
	//*  63  144:aload_2         
	//*  64  145:getfield        #112 <Field Bundle ApplicationInfo.metaData>
	//*  65  148:aload           4
	//*  66  150:invokevirtual   #146 <Method Object Bundle.get(String)>
	//*  67  153:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  68  156:ifeq            206
				{
					((List) (obj)).add(((Object) (parseModule(s))));
	//   69  159:aload_1         
	//   70  160:aload           4
	//   71  162:invokestatic    #152 <Method GlideModule parseModule(String)>
	//   72  165:invokeinterface #157 <Method boolean List.add(Object)>
	//   73  170:pop             
					if(Log.isLoggable("ManifestParser", 3))
	//*  74  171:ldc1            #11  <String "ManifestParser">
	//*  75  173:iconst_3        
	//*  76  174:invokestatic    #82  <Method boolean Log.isLoggable(String, int)>
	//*  77  177:ifeq            206
						Log.d("ManifestParser", (new StringBuilder()).append("Loaded Glide module: ").append(s).toString());
	//   78  180:ldc1            #11  <String "ManifestParser">
	//   79  182:new             #50  <Class StringBuilder>
	//   80  185:dup             
	//   81  186:invokespecial   #51  <Method void StringBuilder()>
	//   82  189:ldc1            #159 <String "Loaded Glide module: ">
	//   83  191:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   84  194:aload           4
	//   85  196:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   86  199:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   87  202:invokestatic    #88  <Method int Log.d(String, String)>
	//   88  205:pop             
				}
			} while(true);
	//   89  206:goto            122
		}
	//*  90  209:goto            224
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  91  212:astore_1        
		{
			throw new RuntimeException("Unable to find metadata to parse GlideModules", ((Throwable) (obj)));
	//   92  213:new             #48  <Class RuntimeException>
	//   93  216:dup             
	//   94  217:ldc1            #161 <String "Unable to find metadata to parse GlideModules">
	//   95  219:aload_1         
	//   96  220:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   97  223:athrow          
		}
		if(Log.isLoggable("ManifestParser", 3))
	//*  98  224:ldc1            #11  <String "ManifestParser">
	//*  99  226:iconst_3        
	//* 100  227:invokestatic    #82  <Method boolean Log.isLoggable(String, int)>
	//* 101  230:ifeq            241
			Log.d("ManifestParser", "Finished loading Glide modules");
	//  102  233:ldc1            #11  <String "ManifestParser">
	//  103  235:ldc1            #163 <String "Finished loading Glide modules">
	//  104  237:invokestatic    #88  <Method int Log.d(String, String)>
	//  105  240:pop             
		return ((List) (obj));
	//  106  241:aload_1         
	//  107  242:areturn         
	}

	private static final String GLIDE_MODULE_VALUE = "GlideModule";
	private static final String TAG = "ManifestParser";
	private final Context context;
}
