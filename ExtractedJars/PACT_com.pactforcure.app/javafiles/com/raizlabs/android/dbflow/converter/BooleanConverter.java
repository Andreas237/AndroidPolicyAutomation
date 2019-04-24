// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.converter;


// Referenced classes of package com.raizlabs.android.dbflow.converter:
//			TypeConverter

public class BooleanConverter extends TypeConverter
{

	public BooleanConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TypeConverter()>
	//    2    4:return          
	}

	public Integer getDBValue(Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i;
		if(boolean1.booleanValue())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #18  <Method boolean Boolean.booleanValue()>
	//*   6   10:ifeq            20
			i = 1;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:iload_2         
	//*  10   16:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//*  11   19:areturn         
			i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
		return Integer.valueOf(i);
	//*  14   22:goto            15
	}

	public volatile Object getDBValue(Object obj)
	{
		return ((Object) (getDBValue((Boolean)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class Boolean>
	//    3    5:invokevirtual   #27  <Method Integer getDBValue(Boolean)>
	//    4    8:areturn         
	}

	public Boolean getModelValue(Integer integer)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(integer == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		if(integer.intValue() != 1)
	//*   6    8:aload_1         
	//*   7    9:invokevirtual   #33  <Method int Integer.intValue()>
	//*   8   12:iconst_1        
	//*   9   13:icmpne          21
	//*  10   16:iload_2         
	//*  11   17:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//*  12   20:areturn         
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		return Boolean.valueOf(flag);
	//*  15   23:goto            16
	}

	public volatile Object getModelValue(Object obj)
	{
		return ((Object) (getModelValue((Integer)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Integer>
	//    3    5:invokevirtual   #38  <Method Boolean getModelValue(Integer)>
	//    4    8:areturn         
	}
}
