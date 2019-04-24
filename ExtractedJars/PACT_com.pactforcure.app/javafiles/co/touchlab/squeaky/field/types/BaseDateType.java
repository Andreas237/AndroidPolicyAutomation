// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field.types;

import co.touchlab.squeaky.field.FieldType;
import co.touchlab.squeaky.field.SqlType;
import java.text.*;
import java.util.Date;

// Referenced classes of package co.touchlab.squeaky.field.types:
//			BaseDataType

public abstract class BaseDateType extends BaseDataType
{
	protected static class DateStringFormatConfig
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
		private final ThreadLocal threadLocal = new _cls1();

		public DateStringFormatConfig(String s)
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


	protected BaseDateType(SqlType sqltype)
	{
		super(sqltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void BaseDataType(SqlType)>
	//    3    5:return          
	}

	protected BaseDateType(SqlType sqltype, Class aclass[])
	{
		super(sqltype, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void BaseDataType(SqlType, Class[])>
	//    4    6:return          
	}

	protected static DateStringFormatConfig convertDateStringConfig(FieldType fieldtype, DateStringFormatConfig datestringformatconfig)
	{
		if(fieldtype != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:aload_1         
	//*   3    5:areturn         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #38  <Method Object FieldType.getDataTypeConfigObj()>
	//*   6   10:checkcast       #6   <Class BaseDateType$DateStringFormatConfig>
	//*   7   13:astore_0        
			if((fieldtype = ((FieldType) ((DateStringFormatConfig)fieldtype.getDataTypeConfigObj()))) != null)
	//*   8   14:aload_0         
	//*   9   15:ifnull          4
				return ((DateStringFormatConfig) (fieldtype));
	//   10   18:aload_0         
	//   11   19:areturn         
		return datestringformatconfig;
	}

	protected static String normalizeDateString(DateStringFormatConfig datestringformatconfig, String s)
		throws ParseException
	{
		datestringformatconfig = ((DateStringFormatConfig) (datestringformatconfig.getDateFormat()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method DateFormat BaseDateType$DateStringFormatConfig.getDateFormat()>
	//    2    4:astore_0        
		return ((DateFormat) (datestringformatconfig)).format(((DateFormat) (datestringformatconfig)).parse(s));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #52  <Method Date DateFormat.parse(String)>
	//    7   11:invokevirtual   #56  <Method String DateFormat.format(Date)>
	//    8   14:areturn         
	}

	protected static Date parseDateString(DateStringFormatConfig datestringformatconfig, String s)
		throws ParseException
	{
		return datestringformatconfig.getDateFormat().parse(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method DateFormat BaseDateType$DateStringFormatConfig.getDateFormat()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Date DateFormat.parse(String)>
	//    4    8:areturn         
	}

	protected static final DateStringFormatConfig defaultDateFormatConfig = new DateStringFormatConfig("yyyy-MM-dd HH:mm:ss.SSSSSS");

	static 
	{
	//    0    0:new             #6   <Class BaseDateType$DateStringFormatConfig>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "yyyy-MM-dd HH:mm:ss.SSSSSS">
	//    3    6:invokespecial   #19  <Method void BaseDateType$DateStringFormatConfig(String)>
	//    4    9:putstatic       #21  <Field BaseDateType$DateStringFormatConfig defaultDateFormatConfig>
	//*   5   12:return          
	}

	// Unreferenced inner class co/touchlab/squeaky/field/types/BaseDateType$DateStringFormatConfig$1

/* anonymous class */
	class DateStringFormatConfig._cls1 extends ThreadLocal
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

		final DateStringFormatConfig this$0;

			
			{
				this$0 = DateStringFormatConfig.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseDateType$DateStringFormatConfig this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void ThreadLocal()>
			//    5    9:return          
			}
	}

}
