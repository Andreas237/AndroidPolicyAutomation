// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


public class LinkInfo
{

	public LinkInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		state = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field int state>
		time = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #16  <Field int time>
		length = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #18  <Field int length>
	//   11   19:return          
	}

	public int getLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int length>
	//    2    4:ireturn         
	}

	public int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int state>
	//    2    4:ireturn         
	}

	public int getTime()
	{
		return time;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int time>
	//    2    4:ireturn         
	}

	public void setLength(int i)
	{
		length = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field int length>
	//    3    5:return          
	}

	public void setState(int i)
	{
		state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #14  <Field int state>
	//    3    5:return          
	}

	public void setTime(int i)
	{
		time = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int time>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\u72B6\u6001\uFF1A").append(state).append("|");
	//    4    8:aload_1         
	//    5    9:ldc1            #34  <String "\u72B6\u6001\uFF1A">
	//    6   11:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #14  <Field int state>
	//    9   18:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   10   21:ldc1            #43  <String "|">
	//   11   23:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append("\u65F6\u95F4\uFF1A").append(time).append("|");
	//   13   27:aload_1         
	//   14   28:ldc1            #45  <String "\u65F6\u95F4\uFF1A">
	//   15   30:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_0         
	//   17   34:getfield        #16  <Field int time>
	//   18   37:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   19   40:ldc1            #43  <String "|">
	//   20   42:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
		stringbuilder.append("\u957F\u5EA6\uFF1A").append(length);
	//   22   46:aload_1         
	//   23   47:ldc1            #47  <String "\u957F\u5EA6\uFF1A">
	//   24   49:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:aload_0         
	//   26   53:getfield        #18  <Field int length>
	//   27   56:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   28   59:pop             
		return stringbuilder.toString();
	//   29   60:aload_1         
	//   30   61:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   31   64:areturn         
	}

	private int length;
	private int state;
	private int time;
}
