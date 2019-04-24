// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.core.pattern.*;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ThrowableHandlingConverter, ExtendedThrowableProxyConverter

public class EnsureExceptionHandling
	implements PostCompileProcessor
{

	public EnsureExceptionHandling()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public boolean chainHandlesThrowable(Converter converter)
	{
		for(; converter != null; converter = converter.getNext())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
			if(converter instanceof ThrowableHandlingConverter)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #16  <Class ThrowableHandlingConverter>
	//*   4    8:ifeq            13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         

	//    7   13:aload_1         
	//    8   14:invokevirtual   #22  <Method Converter Converter.getNext()>
	//    9   17:astore_1        
	//*  10   18:goto            0
		return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public void process(Converter converter)
	{
		if(converter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("cannot process empty chain");
	//    2    4:new             #26  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #28  <String "cannot process empty chain">
	//    5   10:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!chainHandlesThrowable(converter))
	//*   7   14:aload_0         
	//*   8   15:aload_1         
	//*   9   16:invokevirtual   #33  <Method boolean chainHandlesThrowable(Converter)>
	//*  10   19:ifne            36
			ConverterUtil.findTail(converter).setNext(((Converter) (new ExtendedThrowableProxyConverter())));
	//   11   22:aload_1         
	//   12   23:invokestatic    #39  <Method Converter ConverterUtil.findTail(Converter)>
	//   13   26:new             #41  <Class ExtendedThrowableProxyConverter>
	//   14   29:dup             
	//   15   30:invokespecial   #42  <Method void ExtendedThrowableProxyConverter()>
	//   16   33:invokevirtual   #45  <Method void Converter.setNext(Converter)>
	//   17   36:return          
	}
}
