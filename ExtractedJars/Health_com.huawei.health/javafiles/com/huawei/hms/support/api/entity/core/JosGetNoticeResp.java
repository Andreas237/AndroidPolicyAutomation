// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;

import android.content.Intent;

// Referenced classes of package com.huawei.hms.support.api.entity.core:
//			JosBaseResp

public class JosGetNoticeResp extends JosBaseResp
{

	public JosGetNoticeResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void JosBaseResp()>
	//    2    4:return          
	}

	private static Object get(Object obj)
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Intent getNoticeIntent()
	{
		return (Intent)get(((Object) (noticeIntent)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Intent noticeIntent>
	//    2    4:invokestatic    #22  <Method Object get(Object)>
	//    3    7:checkcast       #24  <Class Intent>
	//    4   10:areturn         
	}

	public void setNoticeIntent(Intent intent)
	{
		noticeIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Intent noticeIntent>
	//    3    5:return          
	}

	private Intent noticeIntent;
}
