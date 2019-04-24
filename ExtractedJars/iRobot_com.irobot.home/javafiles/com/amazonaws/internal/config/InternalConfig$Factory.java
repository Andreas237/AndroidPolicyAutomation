// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.internal.config;


// Referenced classes of package com.amazonaws.internal.config:
//			InternalConfig

public static class InternalConfig$Factory
{

	public static InternalConfig a()
	{
		return a;
	//    0    0:getstatic       #20  <Field InternalConfig a>
	//    1    3:areturn         
	}

	private static final InternalConfig a;

	static 
	{
		InternalConfig internalconfig;
		try
		{
			internalconfig = new InternalConfig();
	//    0    0:new             #6   <Class InternalConfig>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void InternalConfig()>
	//    3    7:astore_0        
		}
	//*   4    8:aload_0         
	//*   5    9:putstatic       #20  <Field InternalConfig a>
	//*   6   12:return          
	//*   7   13:astore_0        
	//*   8   14:new             #22  <Class IllegalStateException>
	//*   9   17:dup             
	//*  10   18:ldc1            #24  <String "Fatal: Failed to load the internal config for AWS Android SDK">
	//*  11   20:aload_0         
	//*  12   21:invokespecial   #27  <Method void IllegalStateException(String, Throwable)>
	//*  13   24:athrow          
		catch(RuntimeException runtimeexception)
	//*  14   25:astore_0        
		{
			throw runtimeexception;
	//   15   26:aload_0         
	//   16   27:athrow          
		}
		catch(Exception exception)
		{
			throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", ((Throwable) (exception)));
		}
		a = internalconfig;
	}
}
