// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.amap.api.mapcore.util:
//			gd

public class gd$a
{

	public HashSet a;
	public HashMap b;
	final gd c;

	public gd$a(gd gd1)
	{
		c = gd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field gd c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a = new HashSet();
	//    5    9:aload_0         
	//    6   10:new             #23  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void HashSet()>
	//    9   17:putfield        #26  <Field HashSet a>
		b = new HashMap();
	//   10   20:aload_0         
	//   11   21:new             #28  <Class HashMap>
	//   12   24:dup             
	//   13   25:invokespecial   #29  <Method void HashMap()>
	//   14   28:putfield        #31  <Field HashMap b>
	//   15   31:return          
	}
}
