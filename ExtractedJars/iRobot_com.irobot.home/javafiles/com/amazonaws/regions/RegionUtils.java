// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.regions;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.regions:
//			Region, RegionMetadataParser, RegionDefaults

public class RegionUtils
{

	public static Region a(String s)
	{
		for(Iterator iterator = a().iterator(); iterator.hasNext();)
	//*   0    0:invokestatic    #26  <Method List a()>
	//*   1    3:invokeinterface #32  <Method Iterator List.iterator()>
	//*   2    8:astore_1        
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            41
		{
			Region region = (Region)iterator.next();
	//    6   18:aload_1         
	//    7   19:invokeinterface #42  <Method Object Iterator.next()>
	//    8   24:checkcast       #44  <Class Region>
	//    9   27:astore_2        
			if(region.a().equals(((Object) (s))))
	//*  10   28:aload_2         
	//*  11   29:invokevirtual   #47  <Method String Region.a()>
	//*  12   32:aload_0         
	//*  13   33:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  14   36:ifeq            9
				return region;
	//   15   39:aload_2         
	//   16   40:areturn         
		}

		return null;
	//   17   41:aconst_null     
	//   18   42:areturn         
	}

	public static List a()
	{
		com/amazonaws/regions/RegionUtils;
	//    0    0:ldc1            #2   <Class RegionUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		List list;
		if(a == null)
	//*   2    3:getstatic       #55  <Field List a>
	//*   3    6:ifnonnull       12
			b();
	//    4    9:invokestatic    #57  <Method void b()>
		list = a;
	//    5   12:getstatic       #55  <Field List a>
	//    6   15:astore_0        
		com/amazonaws/regions/RegionUtils;
	//    7   16:ldc1            #2   <Class RegionUtils>
		JVM INSTR monitorexit ;
	//    8   18:monitorexit     
		return list;
	//    9   19:aload_0         
	//   10   20:areturn         
		Exception exception;
		exception;
	//   11   21:astore_0        
	//*  12   22:ldc1            #2   <Class RegionUtils>
		throw exception;
	//   13   24:monitorexit     
	//   14   25:aload_0         
	//   15   26:athrow          
	}

	private static void a(InputStream inputstream)
	{
		try
		{
			a = (new RegionMetadataParser()).a(inputstream);
	//    0    0:new             #64  <Class RegionMetadataParser>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void RegionMetadataParser()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #70  <Method List RegionMetadataParser.a(InputStream)>
	//    5   11:putstatic       #55  <Field List a>
			return;
	//    6   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*   7   15:astore_0        
		{
			b.warn("Failed to parse regional endpoints", ((Throwable) (inputstream)));
	//    8   16:getstatic       #21  <Field Log b>
	//    9   19:ldc1            #72  <String "Failed to parse regional endpoints">
	//   10   21:aload_0         
	//   11   22:invokeinterface #78  <Method void Log.warn(Object, Throwable)>
		}
	//   12   27:return          
	}

	public static void b()
	{
		com/amazonaws/regions/RegionUtils;
	//    0    0:ldc1            #2   <Class RegionUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
	//    2    3:ldc1            #82  <String "com.amazonaws.regions.RegionUtils.fileOverride">
	//    3    5:invokestatic    #88  <Method String System.getProperty(String)>
	//    4    8:astore_0        
		if(s == null)
			break MISSING_BLOCK_LABEL_31;
	//    5    9:aload_0         
	//    6   10:ifnull          31
		c();
	//    7   13:invokestatic    #91  <Method void c()>
		break MISSING_BLOCK_LABEL_31;
	//    8   16:goto            31
		Object obj;
		obj;
	//    9   19:astore_0        
		throw new RuntimeException("Couldn't find regions override file specified", ((Throwable) (obj)));
	//   10   20:new             #93  <Class RuntimeException>
	//   11   23:dup             
	//   12   24:ldc1            #95  <String "Couldn't find regions override file specified">
	//   13   26:aload_0         
	//   14   27:invokespecial   #98  <Method void RuntimeException(String, Throwable)>
	//   15   30:athrow          
		if(a == null)
	//*  16   31:getstatic       #55  <Field List a>
	//*  17   34:ifnonnull       40
			d();
	//   18   37:invokestatic    #101 <Method void d()>
		if(a == null)
	//*  19   40:getstatic       #55  <Field List a>
	//*  20   43:ifnonnull       56
			throw new RuntimeException("Failed to initialize the regions.");
	//   21   46:new             #93  <Class RuntimeException>
	//   22   49:dup             
	//   23   50:ldc1            #103 <String "Failed to initialize the regions.">
	//   24   52:invokespecial   #106 <Method void RuntimeException(String)>
	//   25   55:athrow          
		com/amazonaws/regions/RegionUtils;
	//   26   56:ldc1            #2   <Class RegionUtils>
		JVM INSTR monitorexit ;
	//   27   58:monitorexit     
		return;
	//   28   59:return          
		obj;
	//   29   60:astore_0        
	//*  30   61:ldc1            #2   <Class RegionUtils>
		throw obj;
	//   31   63:monitorexit     
	//   32   64:aload_0         
	//   33   65:athrow          
	}

	private static void c()
	{
		String s = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
	//    0    0:ldc1            #82  <String "com.amazonaws.regions.RegionUtils.fileOverride">
	//    1    2:invokestatic    #88  <Method String System.getProperty(String)>
	//    2    5:astore_0        
		if(b.isDebugEnabled())
	//*   3    6:getstatic       #21  <Field Log b>
	//*   4    9:invokeinterface #109 <Method boolean Log.isDebugEnabled()>
	//*   5   14:ifeq            59
		{
			Log log = b;
	//    6   17:getstatic       #21  <Field Log b>
	//    7   20:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   21:new             #111 <Class StringBuilder>
	//    9   24:dup             
	//   10   25:invokespecial   #112 <Method void StringBuilder()>
	//   11   28:astore_2        
			stringbuilder.append("Using local override of the regions file (");
	//   12   29:aload_2         
	//   13   30:ldc1            #114 <String "Using local override of the regions file (">
	//   14   32:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:pop             
			stringbuilder.append(s);
	//   16   36:aload_2         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(") to initiate regions data...");
	//   20   42:aload_2         
	//   21   43:ldc1            #120 <String ") to initiate regions data...">
	//   22   45:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			log.debug(((Object) (stringbuilder.toString())));
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   27   54:invokeinterface #127 <Method void Log.debug(Object)>
		}
		a(((InputStream) (new FileInputStream(new File(s)))));
	//   28   59:new             #129 <Class FileInputStream>
	//   29   62:dup             
	//   30   63:new             #131 <Class File>
	//   31   66:dup             
	//   32   67:aload_0         
	//   33   68:invokespecial   #132 <Method void File(String)>
	//   34   71:invokespecial   #135 <Method void FileInputStream(File)>
	//   35   74:invokestatic    #137 <Method void a(InputStream)>
	//   36   77:return          
	}

	private static void d()
	{
		if(b.isDebugEnabled())
	//*   0    0:getstatic       #21  <Field Log b>
	//*   1    3:invokeinterface #109 <Method boolean Log.isDebugEnabled()>
	//*   2    8:ifeq            21
			b.debug("Initializing the regions with default regions");
	//    3   11:getstatic       #21  <Field Log b>
	//    4   14:ldc1            #139 <String "Initializing the regions with default regions">
	//    5   16:invokeinterface #127 <Method void Log.debug(Object)>
		a = RegionDefaults.a();
	//    6   21:invokestatic    #142 <Method List RegionDefaults.a()>
	//    7   24:putstatic       #55  <Field List a>
	//    8   27:return          
	}

	private static List a;
	private static final Log b = LogFactory.getLog("com.amazonaws.request");

	static 
	{
	//    0    0:ldc1            #13  <String "com.amazonaws.request">
	//    1    2:invokestatic    #19  <Method Log LogFactory.getLog(String)>
	//    2    5:putstatic       #21  <Field Log b>
	//*   3    8:return          
	}
}
