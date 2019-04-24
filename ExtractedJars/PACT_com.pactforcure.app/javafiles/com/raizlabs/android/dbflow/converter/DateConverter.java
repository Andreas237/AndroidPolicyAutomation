// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.converter;

import java.util.Date;

// Referenced classes of package com.raizlabs.android.dbflow.converter:
//			TypeConverter

public class DateConverter extends TypeConverter
{

	public DateConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TypeConverter()>
	//    2    4:return          
	}

	public Long getDBValue(Date date)
	{
		if(date == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Long.valueOf(date.getTime());
	//    4    6:aload_1         
	//    5    7:invokevirtual   #18  <Method long Date.getTime()>
	//    6   10:invokestatic    #24  <Method Long Long.valueOf(long)>
	//    7   13:areturn         
	}

	public volatile Object getDBValue(Object obj)
	{
		return ((Object) (getDBValue((Date)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class Date>
	//    3    5:invokevirtual   #27  <Method Long getDBValue(Date)>
	//    4    8:areturn         
	}

	public volatile Object getModelValue(Object obj)
	{
		return ((Object) (getModelValue((Long)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Long>
	//    3    5:invokevirtual   #31  <Method Date getModelValue(Long)>
	//    4    8:areturn         
	}

	public Date getModelValue(Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new Date(long1.longValue());
	//    4    6:new             #14  <Class Date>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokevirtual   #34  <Method long Long.longValue()>
	//    8   14:invokespecial   #37  <Method void Date(long)>
	//    9   17:areturn         
	}
}
