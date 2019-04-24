// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FilterPolicy
{

	public FilterPolicy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		dataList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List dataList>
	//    7   15:return          
	}

	public void addFilterData(byte abyte0[])
	{
		dataList.add(((Object) (abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List dataList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public byte getCla()
	{
		return cla;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field byte cla>
	//    2    4:ireturn         
	}

	public byte[][] getFilterDatas()
	{
		return (byte[][])dataList.toArray(((Object []) ((byte[][])Array.newInstance(Byte.TYPE, new int[] {
			0, 0
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List dataList>
	//    2    4:getstatic       #40  <Field Class Byte.TYPE>
	//    3    7:iconst_2        
	//    4    8:newarray        int[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:iconst_0        
	//    8   13:iastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iconst_0        
	//   12   17:iastore         
	//   13   18:invokestatic    #46  <Method Object Array.newInstance(Class, int[])>
	//   14   21:checkcast       #48  <Class byte[][]>
	//   15   24:invokeinterface #52  <Method Object[] List.toArray(Object[])>
	//   16   29:checkcast       #48  <Class byte[][]>
	//   17   32:areturn         
	}

	public byte getIns()
	{
		return ins;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field byte ins>
	//    2    4:ireturn         
	}

	public void setCla(byte byte0)
	{
		cla = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field byte cla>
	//    3    5:return          
	}

	public void setIns(byte byte0)
	{
		ins = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field byte ins>
	//    3    5:return          
	}

	private byte cla;
	private List dataList;
	private byte ins;
}
