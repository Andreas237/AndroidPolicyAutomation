// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.util.Log;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			x

class x$b
	implements com.google.ads.interactivemedia.v3.a.c.h$a
{

	public void a(int i, IOException ioexception)
	{
		x.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field x a>
	//    2    4:invokestatic    #22  <Method void x.b(x)>
		ioexception = ((IOException) (String.valueOf(((Object) (ioexception)))));
	//    3    7:aload_2         
	//    4    8:invokestatic    #28  <Method String String.valueOf(Object)>
	//    5   11:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (ioexception))).length() + 41);
	//    6   12:new             #30  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokestatic    #28  <Method String String.valueOf(Object)>
	//   10   20:invokevirtual   #34  <Method int String.length()>
	//   11   23:bipush          41
	//   12   25:iadd            
	//   13   26:invokespecial   #37  <Method void StringBuilder(int)>
	//   14   29:astore_3        
		stringbuilder.append("Load Error from SampleSource:");
	//   15   30:aload_3         
	//   16   31:ldc1            #39  <String "Load Error from SampleSource:">
	//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(i);
	//   19   37:aload_3         
	//   20   38:iload_1         
	//   21   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		stringbuilder.append(":");
	//   23   43:aload_3         
	//   24   44:ldc1            #48  <String ":">
	//   25   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(((String) (ioexception)));
	//   27   50:aload_3         
	//   28   51:aload_2         
	//   29   52:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		Log.e("IMA SDK", stringbuilder.toString());
	//   31   56:ldc1            #50  <String "IMA SDK">
	//   32   58:aload_3         
	//   33   59:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   34   62:invokestatic    #60  <Method int Log.e(String, String)>
	//   35   65:pop             
	//   36   66:return          
	}

	final x a;

	x$b(x x1)
	{
		a = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field x a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
