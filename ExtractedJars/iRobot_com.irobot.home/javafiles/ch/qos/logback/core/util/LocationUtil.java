// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package ch.qos.logback.core.util:
//			Loader

public class LocationUtil
{

	public LocationUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static URL urlForResource(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("location is required");
	//    2    4:new             #20  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #22  <String "location is required">
	//    5   10:invokespecial   #25  <Method void NullPointerException(String)>
	//    6   13:athrow          
		Object obj;
		if(!s.matches("^\\p{Alpha}[\\p{Alnum}+.-]*:.*$"))
	//*   7   14:aload_0         
	//*   8   15:ldc1            #11  <String "^\\p{Alpha}[\\p{Alnum}+.-]*:.*$">
	//*   9   17:invokevirtual   #31  <Method boolean String.matches(String)>
	//*  10   20:ifne            31
			obj = ((Object) (Loader.getResourceBySelfClassLoader(s)));
	//   11   23:aload_0         
	//   12   24:invokestatic    #36  <Method URL Loader.getResourceBySelfClassLoader(String)>
	//   13   27:astore_1        
		else
	//*  14   28:goto            101
		if(s.startsWith("classpath:"))
	//*  15   31:aload_0         
	//*  16   32:ldc1            #8   <String "classpath:">
	//*  17   34:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//*  18   37:ifeq            92
		{
			String s1 = s.substring("classpath:".length());
	//   19   40:aload_0         
	//   20   41:ldc1            #8   <String "classpath:">
	//   21   43:invokevirtual   #43  <Method int String.length()>
	//   22   46:invokevirtual   #47  <Method String String.substring(int)>
	//   23   49:astore_2        
			obj = ((Object) (s1));
	//   24   50:aload_2         
	//   25   51:astore_1        
			if(s1.startsWith("/"))
	//*  26   52:aload_2         
	//*  27   53:ldc1            #49  <String "/">
	//*  28   55:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//*  29   58:ifeq            67
				obj = ((Object) (s1.substring(1)));
	//   30   61:aload_2         
	//   31   62:iconst_1        
	//   32   63:invokevirtual   #47  <Method String String.substring(int)>
	//   33   66:astore_1        
			if(((String) (obj)).length() == 0)
	//*  34   67:aload_1         
	//*  35   68:invokevirtual   #43  <Method int String.length()>
	//*  36   71:ifne            84
				throw new MalformedURLException("path is required");
	//   37   74:new             #51  <Class MalformedURLException>
	//   38   77:dup             
	//   39   78:ldc1            #53  <String "path is required">
	//   40   80:invokespecial   #54  <Method void MalformedURLException(String)>
	//   41   83:athrow          
			obj = ((Object) (Loader.getResourceBySelfClassLoader(((String) (obj)))));
	//   42   84:aload_1         
	//   43   85:invokestatic    #36  <Method URL Loader.getResourceBySelfClassLoader(String)>
	//   44   88:astore_1        
		} else
	//*  45   89:goto            101
		{
			obj = ((Object) (new URL(s)));
	//   46   92:new             #56  <Class URL>
	//   47   95:dup             
	//   48   96:aload_0         
	//   49   97:invokespecial   #57  <Method void URL(String)>
	//   50  100:astore_1        
		}
		if(obj == null)
	//*  51  101:aload_1         
	//*  52  102:ifnonnull       114
			throw new FileNotFoundException(s);
	//   53  105:new             #59  <Class FileNotFoundException>
	//   54  108:dup             
	//   55  109:aload_0         
	//   56  110:invokespecial   #60  <Method void FileNotFoundException(String)>
	//   57  113:athrow          
		else
			return ((URL) (obj));
	//   58  114:aload_1         
	//   59  115:areturn         
	}

	public static final String CLASSPATH_SCHEME = "classpath:";
	public static final String SCHEME_PATTERN = "^\\p{Alpha}[\\p{Alnum}+.-]*:.*$";
}
