// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;


// Referenced classes of package com.facebook.stetho.inspector.helper:
//			IntegerFormatter

private static class IntegerFormatter$IntegerFormatterWithHex extends IntegerFormatter
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
			return super.format(integer, exportedproperty);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:aload_2         
	//   25   48:invokespecial   #50  <Method String IntegerFormatter.format(Integer, android.view.ViewDebug$ExportedProperty)>
	//   26   51:areturn         
		}
	}

	private IntegerFormatter$IntegerFormatterWithHex()
	{
		super(((IntegerFormatter._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #10  <Method void IntegerFormatter(IntegerFormatter$1)>
	//    3    5:return          
	}

	IntegerFormatter$IntegerFormatterWithHex(IntegerFormatter._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void IntegerFormatter$IntegerFormatterWithHex()>
	//    2    4:return          
	}
}
