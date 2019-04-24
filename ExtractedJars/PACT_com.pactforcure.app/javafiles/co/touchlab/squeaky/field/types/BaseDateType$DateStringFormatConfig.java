// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDateType

protected static class BaseDateType$DateStringFormatConfig
{

	public DateFormat getDateFormat()
	{
		return (DateFormat)threadLocal.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ThreadLocal threadLocal>
	//    2    4:invokevirtual   #35  <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #37  <Class DateFormat>
	//    4   10:areturn         
	}

	public String toString()
	{
		return dateFormatStr;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String dateFormatStr>
	//    2    4:areturn         
	}

	final String dateFormatStr;
	private final ThreadLocal threadLocal = new ThreadLocal() {

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
;

	public BaseDateType$DateStringFormatConfig(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class BaseDateType$DateStringFormatConfig$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #22  <Method void BaseDateType$DateStringFormatConfig$1(BaseDateType$DateStringFormatConfig)>
	//    7   13:putfield        #24  <Field ThreadLocal threadLocal>
		dateFormatStr = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #26  <Field String dateFormatStr>
	//   11   21:return          
	}
}
