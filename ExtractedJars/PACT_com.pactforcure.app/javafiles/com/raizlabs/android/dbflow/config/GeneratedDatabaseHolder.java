// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.converter.BigDecimalConverter;
import com.raizlabs.android.dbflow.converter.BooleanConverter;
import com.raizlabs.android.dbflow.converter.CalendarConverter;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.converter.SqlDateConverter;
import com.raizlabs.android.dbflow.converter.UUIDConverter;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseHolder, AppDatabaseAppDatabase_Database

public final class GeneratedDatabaseHolder extends DatabaseHolder
{

	public GeneratedDatabaseHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void DatabaseHolder()>
		typeConverters.put(java/util/Calendar, ((Object) (new CalendarConverter())));
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field Map typeConverters>
	//    4    8:ldc1            #14  <Class Calendar>
	//    5   10:new             #16  <Class CalendarConverter>
	//    6   13:dup             
	//    7   14:invokespecial   #17  <Method void CalendarConverter()>
	//    8   17:invokeinterface #23  <Method Object Map.put(Object, Object)>
	//    9   22:pop             
		typeConverters.put(java/math/BigDecimal, ((Object) (new BigDecimalConverter())));
	//   10   23:aload_0         
	//   11   24:getfield        #12  <Field Map typeConverters>
	//   12   27:ldc1            #25  <Class BigDecimal>
	//   13   29:new             #27  <Class BigDecimalConverter>
	//   14   32:dup             
	//   15   33:invokespecial   #28  <Method void BigDecimalConverter()>
	//   16   36:invokeinterface #23  <Method Object Map.put(Object, Object)>
	//   17   41:pop             
		typeConverters.put(java/util/UUID, ((Object) (new UUIDConverter())));
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field Map typeConverters>
	//   20   46:ldc1            #30  <Class UUID>
	//   21   48:new             #32  <Class UUIDConverter>
	//   22   51:dup             
	//   23   52:invokespecial   #33  <Method void UUIDConverter()>
	//   24   55:invokeinterface #23  <Method Object Map.put(Object, Object)>
	//   25   60:pop             
		typeConverters.put(java/lang/Boolean, ((Object) (new BooleanConverter())));
	//   26   61:aload_0         
	//   27   62:getfield        #12  <Field Map typeConverters>
	//   28   65:ldc1            #35  <Class Boolean>
	//   29   67:new             #37  <Class BooleanConverter>
	//   30   70:dup             
	//   31   71:invokespecial   #38  <Method void BooleanConverter()>
	//   32   74:invokeinterface #23  <Method Object Map.put(Object, Object)>
	//   33   79:pop             
		typeConverters.put(java/util/Date, ((Object) (new DateConverter())));
	//   34   80:aload_0         
	//   35   81:getfield        #12  <Field Map typeConverters>
	//   36   84:ldc1            #40  <Class Date>
	//   37   86:new             #42  <Class DateConverter>
	//   38   89:dup             
	//   39   90:invokespecial   #43  <Method void DateConverter()>
	//   40   93:invokeinterface #23  <Method Object Map.put(Object, Object)>
	//   41   98:pop             
		typeConverters.put(java/sql/Date, ((Object) (new SqlDateConverter())));
	//   42   99:aload_0         
	//   43  100:getfield        #12  <Field Map typeConverters>
	//   44  103:ldc1            #45  <Class java.sql.Date>
	//   45  105:new             #47  <Class SqlDateConverter>
	//   46  108:dup             
	//   47  109:invokespecial   #48  <Method void SqlDateConverter()>
	//   48  112:invokeinterface #23  <Method Object Map.put(Object, Object)>
	//   49  117:pop             
		new AppDatabaseAppDatabase_Database(((DatabaseHolder) (this)));
	//   50  118:new             #50  <Class AppDatabaseAppDatabase_Database>
	//   51  121:dup             
	//   52  122:aload_0         
	//   53  123:invokespecial   #53  <Method void AppDatabaseAppDatabase_Database(DatabaseHolder)>
	//   54  126:pop             
	//   55  127:return          
	}
}
