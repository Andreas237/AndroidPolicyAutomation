// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework;

import android.content.Context;
import java.util.UUID;

public class SensorObjectIdGenerator
{

	private SensorObjectIdGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mContext = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field Context mContext>
	//    5    9:return          
	}

	public static SensorObjectIdGenerator getInstance()
	{
		return mInstance;
	//    0    0:getstatic       #15  <Field SensorObjectIdGenerator mInstance>
	//    1    3:areturn         
	}

	public String generateId(int i)
	{
		return (new UUID((new StringBuilder()).append("").append(android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id")).toString().hashCode(), i)).toString();
	//    0    0:new             #25  <Class UUID>
	//    1    3:dup             
	//    2    4:new             #27  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #28  <Method void StringBuilder()>
	//    5   11:ldc1            #30  <String "">
	//    6   13:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #19  <Field Context mContext>
	//    9   20:invokevirtual   #40  <Method android.content.ContentResolver Context.getContentResolver()>
	//   10   23:ldc1            #42  <String "android_id">
	//   11   25:invokestatic    #48  <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   12   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   14   34:invokevirtual   #58  <Method int String.hashCode()>
	//   15   37:i2l             
	//   16   38:iload_1         
	//   17   39:i2l             
	//   18   40:invokespecial   #61  <Method void UUID(long, long)>
	//   19   43:invokevirtual   #62  <Method String UUID.toString()>
	//   20   46:areturn         
	}

	public void initialize(Context context)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Context mContext>
	//    3    5:return          
	}

	private static SensorObjectIdGenerator mInstance = new SensorObjectIdGenerator();
	private Context mContext;

	static 
	{
	//    0    0:new             #2   <Class SensorObjectIdGenerator>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void SensorObjectIdGenerator()>
	//    3    7:putstatic       #15  <Field SensorObjectIdGenerator mInstance>
	//*   4   10:return          
	}
}
