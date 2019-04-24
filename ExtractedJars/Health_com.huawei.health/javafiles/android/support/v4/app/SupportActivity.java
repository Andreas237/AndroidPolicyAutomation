// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.support.v4.util.SimpleArrayMap;

public class SupportActivity extends Activity
{
	public static class ExtraData
	{

		public ExtraData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public SupportActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Activity()>
		mExtraDataMap = new SimpleArrayMap();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class SimpleArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void SimpleArrayMap()>
	//    6   12:putfield        #23  <Field SimpleArrayMap mExtraDataMap>
	//    7   15:return          
	}

	public ExtraData getExtraData(Class class1)
	{
		return (ExtraData)mExtraDataMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SimpleArrayMap mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class SupportActivity$ExtraData>
	//    5   11:areturn         
	}

	public void putExtraData(ExtraData extradata)
	{
		mExtraDataMap.put(((Object) (((Object) (extradata)).getClass())), ((Object) (extradata)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SimpleArrayMap mExtraDataMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method Class Object.getClass()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #45  <Method Object SimpleArrayMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	private SimpleArrayMap mExtraDataMap;
}
