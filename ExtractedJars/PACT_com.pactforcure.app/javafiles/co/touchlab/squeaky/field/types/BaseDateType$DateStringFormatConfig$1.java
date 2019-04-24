// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDateType

class BaseDateType$DateStringFormatConfig$1 extends ThreadLocal
{

	protected volatile Object initialValue()
	{
		return ((Object) (initialValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method DateFormat initialValue()>
	//    2    4:areturn         
	}

	protected DateFormat initialValue()
	{
		return ((DateFormat) (new SimpleDateFormat(dateFormatStr)));
	//    0    0:new             #27  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field BaseDateType$DateStringFormatConfig this$0>
	//    4    8:getfield        #31  <Field String BaseDateType$DateStringFormatConfig.dateFormatStr>
	//    5   11:invokespecial   #34  <Method void SimpleDateFormat(String)>
	//    6   14:areturn         
	}

	final BaseDateType.DateStringFormatConfig this$0;

	BaseDateType$DateStringFormatConfig$1()
	{
		this$0 = BaseDateType.DateStringFormatConfig.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseDateType$DateStringFormatConfig this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void ThreadLocal()>
	//    5    9:return          
	}
}
