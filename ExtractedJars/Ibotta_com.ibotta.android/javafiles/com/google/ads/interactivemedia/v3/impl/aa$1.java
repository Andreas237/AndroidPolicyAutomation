// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.b.*;
import java.lang.reflect.Type;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			aa

final class aa$1
	implements s
{

	public l a(CompanionAdSlot companionadslot, Type type, r r)
	{
		int i = companionadslot.getWidth();
	//    0    0:aload_1         
	//    1    1:invokeinterface #22  <Method int CompanionAdSlot.getWidth()>
	//    2    6:istore          4
		int j = companionadslot.getHeight();
	//    3    8:aload_1         
	//    4    9:invokeinterface #25  <Method int CompanionAdSlot.getHeight()>
	//    5   14:istore          5
		companionadslot = ((CompanionAdSlot) (new StringBuilder(23)));
	//    6   16:new             #27  <Class StringBuilder>
	//    7   19:dup             
	//    8   20:bipush          23
	//    9   22:invokespecial   #30  <Method void StringBuilder(int)>
	//   10   25:astore_1        
		((StringBuilder) (companionadslot)).append(i);
	//   11   26:aload_1         
	//   12   27:iload           4
	//   13   29:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   14   32:pop             
		((StringBuilder) (companionadslot)).append("x");
	//   15   33:aload_1         
	//   16   34:ldc1            #36  <String "x">
	//   17   36:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		((StringBuilder) (companionadslot)).append(j);
	//   19   40:aload_1         
	//   20   41:iload           5
	//   21   43:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   22   46:pop             
		return ((l) (new q(((StringBuilder) (companionadslot)).toString())));
	//   23   47:new             #41  <Class q>
	//   24   50:dup             
	//   25   51:aload_1         
	//   26   52:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   27   55:invokespecial   #48  <Method void q(String)>
	//   28   58:areturn         
	}

	public volatile l a(Object obj, Type type, r r)
	{
		return a((CompanionAdSlot)obj, type, r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class CompanionAdSlot>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #51  <Method l a(CompanionAdSlot, Type, r)>
	//    6   10:areturn         
	}

	aa$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
