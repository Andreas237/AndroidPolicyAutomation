// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmt, bmp

public final class bmu extends bmt
{

	public bmu(int i, Map map, bmp bmp)
	{
		StringBuilder stringbuilder = new StringBuilder(26);
	//    0    0:new             #12  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          26
	//    3    6:invokespecial   #15  <Method void StringBuilder(int)>
	//    4    9:astore          4
		stringbuilder.append("Response code: ");
	//    5   11:aload           4
	//    6   13:ldc1            #17  <String "Response code: ">
	//    7   15:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(i);
	//    9   19:aload           4
	//   10   21:iload_1         
	//   11   22:invokevirtual   #24  <Method StringBuilder StringBuilder.append(int)>
	//   12   25:pop             
		super(stringbuilder.toString(), bmp, 1);
	//   13   26:aload_0         
	//   14   27:aload           4
	//   15   29:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   16   32:aload_3         
	//   17   33:iconst_1        
	//   18   34:invokespecial   #31  <Method void bmt(String, bmp, int)>
		a = i;
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:putfield        #33  <Field int a>
		b = map;
	//   22   42:aload_0         
	//   23   43:aload_2         
	//   24   44:putfield        #35  <Field Map b>
	//   25   47:return          
	}

	public final int a;
	private final Map b;
}
