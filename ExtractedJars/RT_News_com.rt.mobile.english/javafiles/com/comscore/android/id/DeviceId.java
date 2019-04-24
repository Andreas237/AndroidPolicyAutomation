// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.android.id;


public class DeviceId
{

	public DeviceId(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String b>
		c = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int c>
		d = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field int d>
	//   11   19:return          
	}

	public DeviceId(String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String b>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int c>
		d = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #21  <Field int d>
	//   11   19:return          
	}

	public DeviceId(String s, String s1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #19  <Field int c>
		d = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #21  <Field int d>
	//   14   25:return          
	}

	public int getCommonness()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int c>
	//    2    4:ireturn         
	}

	public String getId()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String b>
	//    2    4:areturn         
	}

	public String getName()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String a>
	//    2    4:areturn         
	}

	public int getPersistency()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int d>
	//    2    4:ireturn         
	}

	public String getSuffix()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getCommonness());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #38  <Method int getCommonness()>
	//    7   13:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append("");
	//    9   17:aload_1         
	//   10   18:ldc1            #44  <String "">
	//   11   20:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(getPersistency());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #49  <Method int getPersistency()>
	//   16   29:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	private String a;
	private String b;
	private int c;
	private int d;
}
