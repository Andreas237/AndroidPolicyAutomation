// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.content.Context;
import com.amap.api.mapcore.util.kk;

// Referenced classes of package com.autonavi.amap.mapcore:
//			AeUtil

static final class AeUtil$1 extends kk
{

	public void runTask()
	{
		AeUtil.access$000(val$currentPath, val$context);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String val$currentPath>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context val$context>
	//    4    8:invokestatic    #27  <Method void AeUtil.access$000(String, Context)>
	//    5   11:return          
	}

	final Context val$context;
	final String val$currentPath;

	AeUtil$1(String s, Context context1)
	{
		val$currentPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String val$currentPath>
		val$context = context1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Context val$context>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void kk()>
	//    8   14:return          
	}
}
