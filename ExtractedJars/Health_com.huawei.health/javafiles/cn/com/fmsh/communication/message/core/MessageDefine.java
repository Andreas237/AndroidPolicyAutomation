// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.core;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.communication.message.core:
//			MessageTagDefine

class MessageDefine
{

	public MessageDefine()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		messageTagDefines = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List messageTagDefines>
	//    7   15:return          
	}

	public void addMessageData(MessageTagDefine messagetagdefine)
	{
		messageTagDefines.add(((Object) (messagetagdefine)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List messageTagDefines>
	//    2    4:aload_1         
	//    3    5:invokeinterface #30  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String desc>
	//    2    4:areturn         
	}

	public int getMessageCode()
	{
		return messageCode;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int messageCode>
	//    2    4:ireturn         
	}

	public MessageTagDefine[] getMessageTagDefines()
	{
		return (MessageTagDefine[])messageTagDefines.toArray(((Object []) (new MessageTagDefine[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List messageTagDefines>
	//    2    4:iconst_0        
	//    3    5:anewarray       MessageTagDefine[]
	//    4    8:invokeinterface #46  <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #48  <Class MessageTagDefine[]>
	//    6   16:areturn         
	}

	public String getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String retCode>
	//    2    4:areturn         
	}

	public void setDesc(String s)
	{
		desc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String desc>
	//    3    5:return          
	}

	public void setMessageCode(int i)
	{
		messageCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int messageCode>
	//    3    5:return          
	}

	public void setRetCode(String s)
	{
		retCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String retCode>
	//    3    5:return          
	}

	private String desc;
	private int messageCode;
	List messageTagDefines;
	private String retCode;
}
