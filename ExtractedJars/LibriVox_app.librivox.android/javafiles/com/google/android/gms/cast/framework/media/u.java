// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.*;
import com.google.android.gms.common.api.w;
import com.google.android.gms.internal.cast.ac;
import com.google.android.gms.internal.cast.au;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			q, i

final class u extends q
{

	u(i j, w w, MediaInfo mediainfo, y y, l l)
	{
		f = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field i f>
		b = mediainfo;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field MediaInfo b>
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #20  <Field y d>
		e = l;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #22  <Field l e>
		super(j, w);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:invokespecial   #25  <Method void q(i, w)>
	//   16   27:return          
	}

	protected final void a(ac ac)
	{
		i.d(f).a(a, b, d, e);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field i f>
	//    2    4:invokestatic    #33  <Method au i.d(i)>
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field com.google.android.gms.internal.cast.ba a>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field MediaInfo b>
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field y d>
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field l e>
	//   11   23:invokevirtual   #41  <Method long au.a(com.google.android.gms.internal.cast.ba, MediaInfo, y, l)>
	//   12   26:pop2            
	//   13   27:return          
	}

	private final MediaInfo b;
	private final y d = null;
	private final l e;
	private final i f;
}
