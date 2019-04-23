// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmx, bnc, bki, bkj, 
//			bmz

final class bkn
	implements bmx
{

	private bkn(bki bki1)
	{
		a = bki1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bki a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	bkn(bki bki1, bkj bkj)
	{
		this(bki1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void bkn(bki)>
	//    3    5:return          
	}

	public final int a(bmz bmz, long l, long l1, IOException ioexception)
	{
		bmz = ((bmz) ((bnc)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class bnc>
	//    2    4:astore_1        
		return a.a(((bnc) (bmz)), l, l1, ioexception);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field bki a>
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:lload           4
	//    8   13:aload           6
	//    9   15:invokevirtual   #27  <Method int bki.a(bnc, long, long, IOException)>
	//   10   18:ireturn         
	}

	public final void a(bmz bmz, long l, long l1)
	{
		bmz = ((bmz) ((bnc)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class bnc>
	//    2    4:astore_1        
		a.a(((bnc) (bmz)), l, l1);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field bki a>
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:lload           4
	//    8   13:invokevirtual   #31  <Method void bki.a(bnc, long, long)>
	//    9   16:return          
	}

	public final void a(bmz bmz, long l, long l1, boolean flag)
	{
		bmz = ((bmz) ((bnc)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class bnc>
	//    2    4:astore_1        
		a.c(((bnc) (bmz)), l, l1);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field bki a>
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:lload           4
	//    8   13:invokevirtual   #35  <Method void bki.c(bnc, long, long)>
	//    9   16:return          
	}

	private final bki a;
}
