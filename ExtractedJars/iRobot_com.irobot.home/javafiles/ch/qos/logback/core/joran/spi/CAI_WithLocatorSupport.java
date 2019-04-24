// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareImpl;
import org.xml.sax.Locator;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			Interpreter

class CAI_WithLocatorSupport extends ContextAwareImpl
{

	CAI_WithLocatorSupport(Context context, Interpreter interpreter)
	{
		super(context, ((Object) (interpreter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void ContextAwareImpl(Context, Object)>
	//    4    6:return          
	}

	protected Object getOrigin()
	{
		Locator locator = ((Interpreter)super.getOrigin()).locator;
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method Object ContextAwareImpl.getOrigin()>
	//    2    4:checkcast       #16  <Class Interpreter>
	//    3    7:getfield        #20  <Field Locator Interpreter.locator>
	//    4   10:astore_1        
		if(locator != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          74
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//    7   15:new             #22  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #25  <Method void StringBuilder()>
	//   10   22:astore_2        
			stringbuilder1.append(((Class) (ch/qos/logback/core/joran/spi/Interpreter)).getName());
	//   11   23:aload_2         
	//   12   24:ldc1            #16  <Class Interpreter>
	//   13   26:invokevirtual   #31  <Method String Class.getName()>
	//   14   29:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			stringbuilder1.append("@");
	//   16   33:aload_2         
	//   17   34:ldc1            #37  <String "@">
	//   18   36:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder1.append(locator.getLineNumber());
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokeinterface #43  <Method int Locator.getLineNumber()>
	//   23   47:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   24   50:pop             
			stringbuilder1.append(":");
	//   25   51:aload_2         
	//   26   52:ldc1            #48  <String ":">
	//   27   54:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
			stringbuilder1.append(locator.getColumnNumber());
	//   29   58:aload_2         
	//   30   59:aload_1         
	//   31   60:invokeinterface #51  <Method int Locator.getColumnNumber()>
	//   32   65:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   33   68:pop             
			return ((Object) (stringbuilder1.toString()));
	//   34   69:aload_2         
	//   35   70:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   36   73:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   37   74:new             #22  <Class StringBuilder>
	//   38   77:dup             
	//   39   78:invokespecial   #25  <Method void StringBuilder()>
	//   40   81:astore_1        
			stringbuilder.append(((Class) (ch/qos/logback/core/joran/spi/Interpreter)).getName());
	//   41   82:aload_1         
	//   42   83:ldc1            #16  <Class Interpreter>
	//   43   85:invokevirtual   #31  <Method String Class.getName()>
	//   44   88:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			stringbuilder.append("@NA:NA");
	//   46   92:aload_1         
	//   47   93:ldc1            #56  <String "@NA:NA">
	//   48   95:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:pop             
			return ((Object) (stringbuilder.toString()));
	//   50   99:aload_1         
	//   51  100:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   52  103:areturn         
		}
	}
}
