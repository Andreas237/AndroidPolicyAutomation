// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			CSS

private static class CSS$PseudoIdMatches
{

	public List matches;
	public int pseudoId;

	public CSS$PseudoIdMatches()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		matches = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List matches>
	//    7   15:return          
	}
}
