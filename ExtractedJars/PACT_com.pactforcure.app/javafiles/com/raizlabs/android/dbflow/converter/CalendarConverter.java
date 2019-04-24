// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.converter;

import java.util.Calendar;

// Referenced classes of package com.raizlabs.android.dbflow.converter:
//			TypeConverter

public class CalendarConverter extends TypeConverter
{

	public CalendarConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TypeConverter()>
	//    2    4:return          
	}

	public Long getDBValue(Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Long.valueOf(calendar.getTimeInMillis());
	//    4    6:aload_1         
	//    5    7:invokevirtual   #18  <Method long Calendar.getTimeInMillis()>
	//    6   10:invokestatic    #24  <Method Long Long.valueOf(long)>
	//    7   13:areturn         
	}

	public volatile Object getDBValue(Object obj)
	{
		return ((Object) (getDBValue((Calendar)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class Calendar>
	//    3    5:invokevirtual   #27  <Method Long getDBValue(Calendar)>
	//    4    8:areturn         
	}

	public volatile Object getModelValue(Object obj)
	{
		return ((Object) (getModelValue((Long)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Long>
	//    3    5:invokevirtual   #31  <Method Calendar getModelValue(Long)>
	//    4    8:areturn         
	}

	public Calendar getModelValue(Long long1)
	{
		if(long1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
		{
			Calendar calendar = Calendar.getInstance();
	//    2    4:invokestatic    #35  <Method Calendar Calendar.getInstance()>
	//    3    7:astore_2        
			calendar.setTimeInMillis(long1.longValue());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method long Long.longValue()>
	//    7   13:invokevirtual   #42  <Method void Calendar.setTimeInMillis(long)>
			return calendar;
	//    8   16:aload_2         
	//    9   17:areturn         
		} else
		{
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
	}
}
