// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			CMapByteCid, CidResource, CMapParserEx, CMapCidByte, 
//			CMapCidUni, CMapUniCid

public class CMapCache
{

	public CMapCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static CMapByteCid getCachedCMapByteCid(String s)
		throws IOException
	{
		CMapByteCid cmapbytecid;
		synchronized(cacheByteCid)
	//*   0    0:getstatic       #28  <Field HashMap cacheByteCid>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			cmapbytecid = (CMapByteCid)cacheByteCid.get(((Object) (s)));
	//    4    6:getstatic       #28  <Field HashMap cacheByteCid>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #40  <Class CMapByteCid>
	//    8   16:astore_2        
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		obj = ((Object) (cmapbytecid));
	//   11   19:aload_2         
	//   12   20:astore_1        
		if(cmapbytecid == null)
	//*  13   21:aload_2         
	//*  14   22:ifnonnull       62
		{
			obj = ((Object) (new CMapByteCid()));
	//   15   25:new             #40  <Class CMapByteCid>
	//   16   28:dup             
	//   17   29:invokespecial   #41  <Method void CMapByteCid()>
	//   18   32:astore_1        
			CMapParserEx.parseCid(s, ((AbstractCMap) (obj)), ((CidLocation) (new CidResource())));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:new             #43  <Class CidResource>
	//   22   38:dup             
	//   23   39:invokespecial   #44  <Method void CidResource()>
	//   24   42:invokestatic    #50  <Method void CMapParserEx.parseCid(String, AbstractCMap, CidLocation)>
			synchronized(cacheByteCid)
	//*  25   45:getstatic       #28  <Field HashMap cacheByteCid>
	//*  26   48:astore_2        
	//*  27   49:aload_2         
	//*  28   50:monitorenter    
			{
				cacheByteCid.put(((Object) (s)), obj);
	//   29   51:getstatic       #28  <Field HashMap cacheByteCid>
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
	//   33   59:pop             
			}
	//   34   60:aload_2         
	//   35   61:monitorexit     
		}
		return ((CMapByteCid) (obj));
	//   36   62:aload_1         
	//   37   63:areturn         
		s;
	//   38   64:astore_0        
		obj;
	//   39   65:aload_1         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw s;
	//   41   67:aload_0         
	//   42   68:athrow          
		s;
	//   43   69:astore_0        
		hashmap;
	//   44   70:aload_2         
		JVM INSTR monitorexit ;
	//   45   71:monitorexit     
		throw s;
	//   46   72:aload_0         
	//   47   73:athrow          
	}

	public static CMapCidByte getCachedCMapCidByte(String s)
		throws IOException
	{
		CMapCidByte cmapcidbyte;
		synchronized(cacheCidByte)
	//*   0    0:getstatic       #26  <Field HashMap cacheCidByte>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			cmapcidbyte = (CMapCidByte)cacheCidByte.get(((Object) (s)));
	//    4    6:getstatic       #26  <Field HashMap cacheCidByte>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #59  <Class CMapCidByte>
	//    8   16:astore_2        
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		obj = ((Object) (cmapcidbyte));
	//   11   19:aload_2         
	//   12   20:astore_1        
		if(cmapcidbyte == null)
	//*  13   21:aload_2         
	//*  14   22:ifnonnull       62
		{
			obj = ((Object) (new CMapCidByte()));
	//   15   25:new             #59  <Class CMapCidByte>
	//   16   28:dup             
	//   17   29:invokespecial   #60  <Method void CMapCidByte()>
	//   18   32:astore_1        
			CMapParserEx.parseCid(s, ((AbstractCMap) (obj)), ((CidLocation) (new CidResource())));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:new             #43  <Class CidResource>
	//   22   38:dup             
	//   23   39:invokespecial   #44  <Method void CidResource()>
	//   24   42:invokestatic    #50  <Method void CMapParserEx.parseCid(String, AbstractCMap, CidLocation)>
			synchronized(cacheCidByte)
	//*  25   45:getstatic       #26  <Field HashMap cacheCidByte>
	//*  26   48:astore_2        
	//*  27   49:aload_2         
	//*  28   50:monitorenter    
			{
				cacheCidByte.put(((Object) (s)), obj);
	//   29   51:getstatic       #26  <Field HashMap cacheCidByte>
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
	//   33   59:pop             
			}
	//   34   60:aload_2         
	//   35   61:monitorexit     
		}
		return ((CMapCidByte) (obj));
	//   36   62:aload_1         
	//   37   63:areturn         
		s;
	//   38   64:astore_0        
		obj;
	//   39   65:aload_1         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw s;
	//   41   67:aload_0         
	//   42   68:athrow          
		s;
	//   43   69:astore_0        
		hashmap;
	//   44   70:aload_2         
		JVM INSTR monitorexit ;
	//   45   71:monitorexit     
		throw s;
	//   46   72:aload_0         
	//   47   73:athrow          
	}

	public static CMapCidUni getCachedCMapCidUni(String s)
		throws IOException
	{
		CMapCidUni cmapciduni;
		synchronized(cacheCidUni)
	//*   0    0:getstatic       #24  <Field HashMap cacheCidUni>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			cmapciduni = (CMapCidUni)cacheCidUni.get(((Object) (s)));
	//    4    6:getstatic       #24  <Field HashMap cacheCidUni>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #64  <Class CMapCidUni>
	//    8   16:astore_2        
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		obj = ((Object) (cmapciduni));
	//   11   19:aload_2         
	//   12   20:astore_1        
		if(cmapciduni == null)
	//*  13   21:aload_2         
	//*  14   22:ifnonnull       62
		{
			obj = ((Object) (new CMapCidUni()));
	//   15   25:new             #64  <Class CMapCidUni>
	//   16   28:dup             
	//   17   29:invokespecial   #65  <Method void CMapCidUni()>
	//   18   32:astore_1        
			CMapParserEx.parseCid(s, ((AbstractCMap) (obj)), ((CidLocation) (new CidResource())));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:new             #43  <Class CidResource>
	//   22   38:dup             
	//   23   39:invokespecial   #44  <Method void CidResource()>
	//   24   42:invokestatic    #50  <Method void CMapParserEx.parseCid(String, AbstractCMap, CidLocation)>
			synchronized(cacheCidUni)
	//*  25   45:getstatic       #24  <Field HashMap cacheCidUni>
	//*  26   48:astore_2        
	//*  27   49:aload_2         
	//*  28   50:monitorenter    
			{
				cacheCidUni.put(((Object) (s)), obj);
	//   29   51:getstatic       #24  <Field HashMap cacheCidUni>
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
	//   33   59:pop             
			}
	//   34   60:aload_2         
	//   35   61:monitorexit     
		}
		return ((CMapCidUni) (obj));
	//   36   62:aload_1         
	//   37   63:areturn         
		s;
	//   38   64:astore_0        
		obj;
	//   39   65:aload_1         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw s;
	//   41   67:aload_0         
	//   42   68:athrow          
		s;
	//   43   69:astore_0        
		hashmap;
	//   44   70:aload_2         
		JVM INSTR monitorexit ;
	//   45   71:monitorexit     
		throw s;
	//   46   72:aload_0         
	//   47   73:athrow          
	}

	public static CMapUniCid getCachedCMapUniCid(String s)
		throws IOException
	{
		CMapUniCid cmapunicid;
		synchronized(cacheUniCid)
	//*   0    0:getstatic       #22  <Field HashMap cacheUniCid>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			cmapunicid = (CMapUniCid)cacheUniCid.get(((Object) (s)));
	//    4    6:getstatic       #22  <Field HashMap cacheUniCid>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #69  <Class CMapUniCid>
	//    8   16:astore_2        
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		obj = ((Object) (cmapunicid));
	//   11   19:aload_2         
	//   12   20:astore_1        
		if(cmapunicid == null)
	//*  13   21:aload_2         
	//*  14   22:ifnonnull       62
		{
			obj = ((Object) (new CMapUniCid()));
	//   15   25:new             #69  <Class CMapUniCid>
	//   16   28:dup             
	//   17   29:invokespecial   #70  <Method void CMapUniCid()>
	//   18   32:astore_1        
			CMapParserEx.parseCid(s, ((AbstractCMap) (obj)), ((CidLocation) (new CidResource())));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:new             #43  <Class CidResource>
	//   22   38:dup             
	//   23   39:invokespecial   #44  <Method void CidResource()>
	//   24   42:invokestatic    #50  <Method void CMapParserEx.parseCid(String, AbstractCMap, CidLocation)>
			synchronized(cacheUniCid)
	//*  25   45:getstatic       #22  <Field HashMap cacheUniCid>
	//*  26   48:astore_2        
	//*  27   49:aload_2         
	//*  28   50:monitorenter    
			{
				cacheUniCid.put(((Object) (s)), obj);
	//   29   51:getstatic       #22  <Field HashMap cacheUniCid>
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #54  <Method Object HashMap.put(Object, Object)>
	//   33   59:pop             
			}
	//   34   60:aload_2         
	//   35   61:monitorexit     
		}
		return ((CMapUniCid) (obj));
	//   36   62:aload_1         
	//   37   63:areturn         
		s;
	//   38   64:astore_0        
		obj;
	//   39   65:aload_1         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw s;
	//   41   67:aload_0         
	//   42   68:athrow          
		s;
	//   43   69:astore_0        
		hashmap;
	//   44   70:aload_2         
		JVM INSTR monitorexit ;
	//   45   71:monitorexit     
		throw s;
	//   46   72:aload_0         
	//   47   73:athrow          
	}

	private static final HashMap cacheByteCid = new HashMap();
	private static final HashMap cacheCidByte = new HashMap();
	private static final HashMap cacheCidUni = new HashMap();
	private static final HashMap cacheUniCid = new HashMap();

	static 
	{
	//    0    0:new             #17  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void HashMap()>
	//    3    7:putstatic       #22  <Field HashMap cacheUniCid>
	//    4   10:new             #17  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void HashMap()>
	//    7   17:putstatic       #24  <Field HashMap cacheCidUni>
	//    8   20:new             #17  <Class HashMap>
	//    9   23:dup             
	//   10   24:invokespecial   #20  <Method void HashMap()>
	//   11   27:putstatic       #26  <Field HashMap cacheCidByte>
	//   12   30:new             #17  <Class HashMap>
	//   13   33:dup             
	//   14   34:invokespecial   #20  <Method void HashMap()>
	//   15   37:putstatic       #28  <Field HashMap cacheByteCid>
	//*  16   40:return          
	}
}
