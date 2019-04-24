// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAware;

// Referenced classes of package ch.qos.logback.core.pattern:
//			Converter, CompositeConverter, DynamicConverter

public class ConverterUtil
{

	public ConverterUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Converter findTail(Converter converter)
	{
		Converter converter1;
		for(; converter != null; converter = converter1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
		{
			converter1 = converter.getNext();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #17  <Method Converter Converter.getNext()>
	//    4    8:astore_1        
			if(converter1 == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
				return converter;
	//    7   13:aload_0         
	//    8   14:areturn         
		}

	//    9   15:aload_1         
	//   10   16:astore_0        
	//*  11   17:goto            0
		return converter;
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public static void setContextForConverters(Context context, Converter converter)
	{
		for(; converter != null; converter = converter.getNext())
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
			if(converter instanceof ContextAware)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #23  <Class ContextAware>
	//*   4    8:ifeq            21
				((ContextAware)converter).setContext(context);
	//    5   11:aload_1         
	//    6   12:checkcast       #23  <Class ContextAware>
	//    7   15:aload_0         
	//    8   16:invokeinterface #27  <Method void ContextAware.setContext(Context)>

	//    9   21:aload_1         
	//   10   22:invokevirtual   #17  <Method Converter Converter.getNext()>
	//   11   25:astore_1        
	//*  12   26:goto            0
	//   13   29:return          
	}

	public static void startConverters(Converter converter)
	{
		for(; converter != null; converter = converter.getNext())
	//*   0    0:aload_0         
	//*   1    1:ifnull          52
		{
			if(converter instanceof CompositeConverter)
	//*   2    4:aload_0         
	//*   3    5:instanceof      #32  <Class CompositeConverter>
	//*   4    8:ifeq            30
			{
				CompositeConverter compositeconverter = (CompositeConverter)converter;
	//    5   11:aload_0         
	//    6   12:checkcast       #32  <Class CompositeConverter>
	//    7   15:astore_1        
				startConverters(compositeconverter.childConverter);
	//    8   16:aload_1         
	//    9   17:getfield        #36  <Field Converter CompositeConverter.childConverter>
	//   10   20:invokestatic    #38  <Method void startConverters(Converter)>
				compositeconverter.start();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #41  <Method void CompositeConverter.start()>
				continue;
	//   13   27:goto            44
			}
			if(converter instanceof DynamicConverter)
	//*  14   30:aload_0         
	//*  15   31:instanceof      #43  <Class DynamicConverter>
	//*  16   34:ifeq            44
				((DynamicConverter)converter).start();
	//   17   37:aload_0         
	//   18   38:checkcast       #43  <Class DynamicConverter>
	//   19   41:invokevirtual   #44  <Method void DynamicConverter.start()>
		}

	//   20   44:aload_0         
	//   21   45:invokevirtual   #17  <Method Converter Converter.getNext()>
	//   22   48:astore_0        
	//*  23   49:goto            0
	//   24   52:return          
	}
}
