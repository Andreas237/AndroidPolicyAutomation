// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			fj

public static class fj$c
{

	public String toString()
	{
		return (new StringBuilder()).append("[ x: ").append(a).append(", y: ").append(b).append(", w: ").append(c).append(", h: ").append(d).append(" ]").toString();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:ldc1            #32  <String "[ x: ">
	//    4    9:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field int a>
	//    7   16:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #41  <String ", y: ">
	//    9   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #20  <Field int b>
	//   12   28:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #43  <String ", w: ">
	//   14   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #22  <Field int c>
	//   17   40:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #45  <String ", h: ">
	//   19   45:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #24  <Field int d>
	//   22   52:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #47  <String " ]">
	//   24   57:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   26   63:areturn         
	}

	public int a;
	public int b;
	public int c;
	public int d;

	fj$c(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int c>
		d = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #24  <Field int d>
	//   14   25:return          
	}
}
