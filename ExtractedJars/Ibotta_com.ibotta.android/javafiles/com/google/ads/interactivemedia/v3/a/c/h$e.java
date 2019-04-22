// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c;

import com.google.ads.interactivemedia.v3.a.f.q;
import com.google.ads.interactivemedia.v3.a.r;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c:
//			h, e

public static final class h$e extends r
{

	public h$e(e ae[])
	{
		ae = ((e []) (String.valueOf(((Object) (q.a(((Object []) (ae))))))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #15  <Method String q.a(Object[])>
	//    2    4:invokestatic    #21  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (ae))).length() + 58);
	//    4    8:new             #23  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #21  <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #27  <Method int String.length()>
	//    9   19:bipush          58
	//   10   21:iadd            
	//   11   22:invokespecial   #30  <Method void StringBuilder(int)>
	//   12   25:astore_2        
		stringbuilder.append("None of the available extractors (");
	//   13   26:aload_2         
	//   14   27:ldc1            #32  <String "None of the available extractors (">
	//   15   29:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((String) (ae)));
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(") could read the stream.");
	//   21   39:aload_2         
	//   22   40:ldc1            #38  <String ") could read the stream.">
	//   23   42:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		super(stringbuilder.toString());
	//   25   46:aload_0         
	//   26   47:aload_2         
	//   27   48:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   28   51:invokespecial   #45  <Method void r(String)>
	//   29   54:return          
	}
}
