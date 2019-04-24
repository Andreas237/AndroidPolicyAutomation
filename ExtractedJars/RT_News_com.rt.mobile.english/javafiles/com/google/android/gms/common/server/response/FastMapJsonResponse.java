// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastJsonResponse

public abstract class FastMapJsonResponse extends FastJsonResponse
{

	public FastMapJsonResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void FastJsonResponse()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field HashMap zzwp>
	//    7   15:return          
	}

	public Object getValueObject(String s)
	{
		return zzwp.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method Object HashMap.get(Object)>
	//    4    8:areturn         
	}

	public HashMap getValues()
	{
		return zzwp;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:areturn         
	}

	protected boolean isPrimitiveFieldSet(String s)
	{
		return zzwp.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method boolean HashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public void setBigDecimal(String s, BigDecimal bigdecimal)
	{
		zzwp.put(((Object) (s)), ((Object) (bigdecimal)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setBigDecimals(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setBigInteger(String s, BigInteger biginteger)
	{
		zzwp.put(((Object) (s)), ((Object) (biginteger)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setBigIntegers(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setBoolean(String s, boolean flag)
	{
		zzwp.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #54  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setBooleans(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setDecodedBytes(String s, byte abyte0[])
	{
		zzwp.put(((Object) (s)), ((Object) (abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setDouble(String s, double d)
	{
		zzwp.put(((Object) (s)), ((Object) (Double.valueOf(d))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokestatic    #65  <Method Double Double.valueOf(double)>
	//    5    9:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setDoubles(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	protected void setFloat(String s, float f)
	{
		zzwp.put(((Object) (s)), ((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #74  <Method Float Float.valueOf(float)>
	//    5    9:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	protected void setFloats(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setInteger(String s, int i)
	{
		zzwp.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setIntegers(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setLong(String s, long l)
	{
		zzwp.put(((Object) (s)), ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokestatic    #92  <Method Long Long.valueOf(long)>
	//    5    9:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setLongs(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setString(String s, String s1)
	{
		zzwp.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setStringMap(String s, Map map)
	{
		zzwp.put(((Object) (s)), ((Object) (map)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setStrings(String s, ArrayList arraylist)
	{
		zzwp.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap zzwp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	private final HashMap zzwp = new HashMap();
}
