// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.content.ContentValues;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastJsonResponse

public abstract class FastContentValuesJsonResponse extends FastJsonResponse
{

	public FastContentValuesJsonResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void FastJsonResponse()>
		zzwj = new ContentValues();
	//    2    4:aload_0         
	//    3    5:new             #12  <Class ContentValues>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void ContentValues()>
	//    6   12:putfield        #15  <Field ContentValues zzwj>
	//    7   15:return          
	}

	public FastContentValuesJsonResponse(ContentValues contentvalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void FastJsonResponse()>
		zzwj = contentvalues;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ContentValues zzwj>
	//    5    9:return          
	}

	protected Object getValueObject(String s)
	{
		return zzwj.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method Object ContentValues.get(String)>
	//    4    8:areturn         
	}

	public ContentValues getValues()
	{
		return zzwj;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:areturn         
	}

	protected boolean isPrimitiveFieldSet(String s)
	{
		return zzwj.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method boolean ContentValues.containsKey(String)>
	//    4    8:ireturn         
	}

	protected void setBoolean(String s, boolean flag)
	{
		zzwj.put(s, Boolean.valueOf(flag));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #39  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #43  <Method void ContentValues.put(String, Boolean)>
	//    6   12:return          
	}

	protected void setDecodedBytes(String s, byte abyte0[])
	{
		zzwj.put(s, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #47  <Method void ContentValues.put(String, byte[])>
	//    5    9:return          
	}

	protected void setDouble(String s, double d)
	{
		zzwj.put(s, Double.valueOf(d));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokestatic    #54  <Method Double Double.valueOf(double)>
	//    5    9:invokevirtual   #57  <Method void ContentValues.put(String, Double)>
	//    6   12:return          
	}

	protected void setFloat(String s, float f)
	{
		zzwj.put(s, Float.valueOf(f));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #64  <Method Float Float.valueOf(float)>
	//    5    9:invokevirtual   #67  <Method void ContentValues.put(String, Float)>
	//    6   12:return          
	}

	protected void setInteger(String s, int i)
	{
		zzwj.put(s, Integer.valueOf(i));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #77  <Method void ContentValues.put(String, Integer)>
	//    6   12:return          
	}

	protected void setLong(String s, long l)
	{
		zzwj.put(s, Long.valueOf(l));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokestatic    #84  <Method Long Long.valueOf(long)>
	//    5    9:invokevirtual   #87  <Method void ContentValues.put(String, Long)>
	//    6   12:return          
	}

	protected void setString(String s, String s1)
	{
		zzwj.put(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ContentValues zzwj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #91  <Method void ContentValues.put(String, String)>
	//    5    9:return          
	}

	private final ContentValues zzwj;
}
