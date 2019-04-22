// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;


public class IntegerFormatter
{
	private static class IntegerFormatterWithHex extends IntegerFormatter
	{

		public String format(Integer integer, android.view.ViewDebug.ExportedProperty exportedproperty)
		{
			if(exportedproperty != null && exportedproperty.formatToHexString())
		//*   0    0:aload_2         
		//*   1    1:ifnull          45
		//*   2    4:aload_2         
		//*   3    5:invokeinterface #25  <Method boolean android.view.ViewDebug$ExportedProperty.formatToHexString()>
		//*   4   10:ifeq            45
			{
				exportedproperty = ((android.view.ViewDebug.ExportedProperty) (new StringBuilder()));
		//    5   13:new             #27  <Class StringBuilder>
		//    6   16:dup             
		//    7   17:invokespecial   #28  <Method void StringBuilder()>
		//    8   20:astore_2        
				((StringBuilder) (exportedproperty)).append("0x");
		//    9   21:aload_2         
		//   10   22:ldc1            #30  <String "0x">
		//   11   24:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//   12   27:pop             
				((StringBuilder) (exportedproperty)).append(Integer.toHexString(integer.intValue()));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #40  <Method int Integer.intValue()>
		//   16   33:invokestatic    #44  <Method String Integer.toHexString(int)>
		//   17   36:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//   18   39:pop             
				return ((StringBuilder) (exportedproperty)).toString();
		//   19   40:aload_2         
		//   20   41:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   21   44:areturn         
			} else
			{
				return format(integer, exportedproperty);
		//   22   45:aload_0         
		//   23   46:aload_1         
		//   24   47:aload_2         
		//   25   48:invokespecial   #50  <Method String IntegerFormatter.format(Integer, android.view.ViewDebug$ExportedProperty)>
		//   26   51:areturn         
			}
		}

		private IntegerFormatterWithHex()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #10  <Method void IntegerFormatter(IntegerFormatter$1)>
		//    3    5:return          
		}

	}


	private IntegerFormatter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}


	public static IntegerFormatter getInstance()
	{
		if(cachedFormatter != null)
			break MISSING_BLOCK_LABEL_59;
	//    0    0:getstatic       #22  <Field IntegerFormatter cachedFormatter>
	//    1    3:ifnonnull       59
		com/facebook/stetho/inspector/helper/IntegerFormatter;
	//    2    6:ldc1            #2   <Class IntegerFormatter>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(cachedFormatter != null)
			break MISSING_BLOCK_LABEL_47;
	//    4    9:getstatic       #22  <Field IntegerFormatter cachedFormatter>
	//    5   12:ifnonnull       47
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   15:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   18:bipush          21
	//*   8   20:icmplt          37
		{
			cachedFormatter = ((IntegerFormatter) (new IntegerFormatterWithHex()));
	//    9   23:new             #8   <Class IntegerFormatter$IntegerFormatterWithHex>
	//   10   26:dup             
	//   11   27:aconst_null     
	//   12   28:invokespecial   #30  <Method void IntegerFormatter$IntegerFormatterWithHex(IntegerFormatter$1)>
	//   13   31:putstatic       #22  <Field IntegerFormatter cachedFormatter>
			break MISSING_BLOCK_LABEL_47;
	//   14   34:goto            47
		}
		cachedFormatter = new IntegerFormatter();
	//   15   37:new             #2   <Class IntegerFormatter>
	//   16   40:dup             
	//   17   41:invokespecial   #18  <Method void IntegerFormatter()>
	//   18   44:putstatic       #22  <Field IntegerFormatter cachedFormatter>
		com/facebook/stetho/inspector/helper/IntegerFormatter;
	//   19   47:ldc1            #2   <Class IntegerFormatter>
		JVM INSTR monitorexit ;
	//   20   49:monitorexit     
		break MISSING_BLOCK_LABEL_59;
	//   21   50:goto            59
		Exception exception;
		exception;
	//   22   53:astore_0        
		com/facebook/stetho/inspector/helper/IntegerFormatter;
	//   23   54:ldc1            #2   <Class IntegerFormatter>
		JVM INSTR monitorexit ;
	//   24   56:monitorexit     
		throw exception;
	//   25   57:aload_0         
	//   26   58:athrow          
		return cachedFormatter;
	//   27   59:getstatic       #22  <Field IntegerFormatter cachedFormatter>
	//   28   62:areturn         
	}

	public String format(Integer integer, android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		return String.valueOf(((Object) (integer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method String String.valueOf(Object)>
	//    2    4:areturn         
	}

	private static IntegerFormatter cachedFormatter;
}
