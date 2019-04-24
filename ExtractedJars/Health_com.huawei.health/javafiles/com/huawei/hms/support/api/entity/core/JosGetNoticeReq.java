// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;


// Referenced classes of package com.huawei.hms.support.api.entity.core:
//			JosBaseReq

public class JosGetNoticeReq extends JosBaseReq
{

	public JosGetNoticeReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void JosBaseReq()>
	//    2    4:return          
	}

	private static Object get(Object obj)
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public int getNoticeType()
	{
		return ((Integer)get(((Object) (Integer.valueOf(noticeType))))).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int noticeType>
	//    2    4:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    3    7:invokestatic    #32  <Method Object get(Object)>
	//    4   10:checkcast       #26  <Class Integer>
	//    5   13:invokevirtual   #35  <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public void setNoticeType(int i)
	{
		noticeType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int noticeType>
	//    3    5:return          
	}

	public static final int NOTICE_TYPE_CONN = 0;
	public static final int NOTICE_TYPE_SIGN = 1;
	private int noticeType;
}
