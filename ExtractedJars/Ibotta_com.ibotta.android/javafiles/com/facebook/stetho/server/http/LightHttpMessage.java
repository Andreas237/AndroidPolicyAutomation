// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.util.ArrayList;

public class LightHttpMessage
{

	public LightHttpMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #17  <Field ArrayList headerNames>
	//    7   15:aload_0         
	//    8   16:new             #14  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #15  <Method void ArrayList()>
	//   11   23:putfield        #19  <Field ArrayList headerValues>
	//   12   26:return          
	}

	public void addHeader(String s, String s1)
	{
		headerNames.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ArrayList headerNames>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		headerValues.add(((Object) (s1)));
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field ArrayList headerValues>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #26  <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	public String getFirstHeaderValue(String s)
	{
		int j = headerNames.size();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ArrayList headerNames>
	//    2    4:invokevirtual   #33  <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          49
			if(s.equals(headerNames.get(i)))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #17  <Field ArrayList headerNames>
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//*  14   24:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  15   27:ifeq            42
				return (String)headerValues.get(i);
	//   16   30:aload_0         
	//   17   31:getfield        #19  <Field ArrayList headerValues>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   20   38:checkcast       #39  <Class String>
	//   21   41:areturn         

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            10
		return null;
	//   27   49:aconst_null     
	//   28   50:areturn         
	}

	public void reset()
	{
		headerNames.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ArrayList headerNames>
	//    2    4:invokevirtual   #47  <Method void ArrayList.clear()>
		headerValues.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field ArrayList headerValues>
	//    5   11:invokevirtual   #47  <Method void ArrayList.clear()>
	//    6   14:return          
	}

	public final ArrayList headerNames = new ArrayList();
	public final ArrayList headerValues = new ArrayList();
}
