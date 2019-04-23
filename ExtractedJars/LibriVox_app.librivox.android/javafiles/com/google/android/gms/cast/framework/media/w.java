// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import com.google.android.gms.internal.cast.ac;
import com.google.android.gms.internal.cast.au;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			q, i

final class w extends q
{

	w(i j, com.google.android.gms.common.api.w w1, JSONObject jsonobject)
	{
		d = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field i d>
		b = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field JSONObject b>
		super(j, w1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #17  <Method void q(i, com.google.android.gms.common.api.w)>
	//   10   16:return          
	}

	protected final void a(ac ac)
	{
		i.d(d).a(a, 0, -1L, ((com.google.android.gms.cast.MediaQueueItem []) (null)), 1, ((Integer) (null)), b);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field i d>
	//    2    4:invokestatic    #25  <Method au i.d(i)>
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field com.google.android.gms.internal.cast.ba a>
	//    5   11:iconst_0        
	//    6   12:ldc2w           #29  <Long -1L>
	//    7   15:aconst_null     
	//    8   16:iconst_1        
	//    9   17:aconst_null     
	//   10   18:aload_0         
	//   11   19:getfield        #14  <Field JSONObject b>
	//   12   22:invokevirtual   #35  <Method long au.a(com.google.android.gms.internal.cast.ba, int, long, com.google.android.gms.cast.MediaQueueItem[], int, Integer, JSONObject)>
	//   13   25:pop2            
	//   14   26:return          
	}

	private final JSONObject b;
	private final i d;
}
