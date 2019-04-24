// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import java.io.Serializable;

public class Notice
	implements Serializable
{

	public Notice()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public String getContent()
	{
		return content;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String content>
	//    2    4:areturn         
	}

	public String getEndDate()
	{
		return endDate;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String endDate>
	//    2    4:areturn         
	}

	public int getNo()
	{
		return no;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int no>
	//    2    4:ireturn         
	}

	public byte[] getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field byte[] order>
	//    2    4:areturn         
	}

	public String getStartDate()
	{
		return startDate;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String startDate>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String title>
	//    2    4:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int type>
	//    2    4:ireturn         
	}

	public void setContent(String s)
	{
		content = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String content>
	//    3    5:return          
	}

	public void setEndDate(String s)
	{
		endDate = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String endDate>
	//    3    5:return          
	}

	public void setNo(int i)
	{
		no = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int no>
	//    3    5:return          
	}

	public void setOrder(byte abyte0[])
	{
		order = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field byte[] order>
	//    3    5:return          
	}

	public void setStartDate(String s)
	{
		startDate = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String startDate>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String title>
	//    3    5:return          
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int type>
	//    3    5:return          
	}

	public static int NOTICE_TXT = 0;
	public static int NOTICE_UNSOLVED = 0;
	private static final long serialVersionUID = 1L;
	String content;
	String endDate;
	int no;
	byte order[];
	String startDate;
	String title;
	int type;

	static 
	{
		NOTICE_TXT = 22;
	//    0    0:bipush          22
	//    1    2:putstatic       #27  <Field int NOTICE_TXT>
		NOTICE_UNSOLVED = 33;
	//    2    5:bipush          33
	//    3    7:putstatic       #29  <Field int NOTICE_UNSOLVED>
	//*   4   10:return          
	}
}
