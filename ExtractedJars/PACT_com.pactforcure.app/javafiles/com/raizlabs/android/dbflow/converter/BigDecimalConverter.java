// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.converter;

import java.math.BigDecimal;

// Referenced classes of package com.raizlabs.android.dbflow.converter:
//			TypeConverter

public class BigDecimalConverter extends TypeConverter
{

	public BigDecimalConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TypeConverter()>
	//    2    4:return          
	}

	public volatile Object getDBValue(Object obj)
	{
		return ((Object) (getDBValue((BigDecimal)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class BigDecimal>
	//    3    5:invokevirtual   #17  <Method String getDBValue(BigDecimal)>
	//    4    8:areturn         
	}

	public String getDBValue(BigDecimal bigdecimal)
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return bigdecimal.toString();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #21  <Method String BigDecimal.toString()>
	//    6   10:areturn         
	}

	public volatile Object getModelValue(Object obj)
	{
		return ((Object) (getModelValue((String)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class String>
	//    3    5:invokevirtual   #27  <Method BigDecimal getModelValue(String)>
	//    4    8:areturn         
	}

	public BigDecimal getModelValue(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new BigDecimal(s);
	//    4    6:new             #14  <Class BigDecimal>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #30  <Method void BigDecimal(String)>
	//    8   14:areturn         
	}
}
