// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.util.Log;
import com.google.ads.interactivemedia.v3.a.f;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			x

class x$a
	implements com.google.ads.interactivemedia.v3.a.g$c
{

	public void a()
	{
	//    0    0:return          
	}

	public void a(f f)
	{
		x.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field x a>
	//    2    4:invokestatic    #22  <Method void x.b(x)>
		f = ((f) (String.valueOf(((Object) (f)))));
	//    3    7:aload_1         
	//    4    8:invokestatic    #28  <Method String String.valueOf(Object)>
	//    5   11:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (f))).length() + 13);
	//    6   12:new             #30  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokestatic    #28  <Method String String.valueOf(Object)>
	//   10   20:invokevirtual   #34  <Method int String.length()>
	//   11   23:bipush          13
	//   12   25:iadd            
	//   13   26:invokespecial   #37  <Method void StringBuilder(int)>
	//   14   29:astore_2        
		stringbuilder.append("Player Error:");
	//   15   30:aload_2         
	//   16   31:ldc1            #39  <String "Player Error:">
	//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(((String) (f)));
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		Log.e("IMA SDK", stringbuilder.toString());
	//   23   43:ldc1            #45  <String "IMA SDK">
	//   24   45:aload_2         
	//   25   46:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   26   49:invokestatic    #55  <Method int Log.e(String, String)>
	//   27   52:pop             
	//   28   53:return          
	}

	public void a(boolean flag, int i)
	{
		if(i == 5)
	//*   0    0:iload_2         
	//*   1    1:iconst_5        
	//*   2    2:icmpne          44
		{
			for(Iterator iterator = x.d(a).iterator(); iterator.hasNext(); ((com.google.ads.interactivemedia.v3.api.player.oAdPlayer.VideoAdPlayerCallback)iterator.next()).onEnded());
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field x a>
	//    5    9:invokestatic    #60  <Method List x.d(x)>
	//    6   12:invokeinterface #66  <Method Iterator List.iterator()>
	//    7   17:astore_3        
	//    8   18:aload_3         
	//    9   19:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_3         
	//   12   28:invokeinterface #76  <Method Object Iterator.next()>
	//   13   33:checkcast       #78  <Class com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback>
	//   14   36:invokeinterface #81  <Method void com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback.onEnded()>
		}
	//*  15   41:goto            18
	//   16   44:return          
	}

	final x a;

	x$a(x x1)
	{
		a = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field x a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
