// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Rect;

public final class zzfs
{

	public zzfs(long l, boolean flag, boolean flag1, int i, Rect rect, Rect rect1, 
			Rect rect2, boolean flag2, Rect rect3, boolean flag3, Rect rect4, float f, boolean flag4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		timestamp = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #29  <Field long timestamp>
		zzagl = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #31  <Field boolean zzagl>
		zzagm = flag1;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #33  <Field boolean zzagm>
		zzth = i;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #35  <Field int zzth>
		zzagn = rect;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #37  <Field Rect zzagn>
		zzago = rect1;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #39  <Field Rect zzago>
		zzagp = rect2;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #41  <Field Rect zzagp>
		zzagq = flag2;
	//   23   44:aload_0         
	//   24   45:iload           9
	//   25   47:putfield        #43  <Field boolean zzagq>
		zzagr = rect3;
	//   26   50:aload_0         
	//   27   51:aload           10
	//   28   53:putfield        #45  <Field Rect zzagr>
		zzags = flag3;
	//   29   56:aload_0         
	//   30   57:iload           11
	//   31   59:putfield        #47  <Field boolean zzags>
		zzagt = rect4;
	//   32   62:aload_0         
	//   33   63:aload           12
	//   34   65:putfield        #49  <Field Rect zzagt>
		zzagu = f;
	//   35   68:aload_0         
	//   36   69:fload           13
	//   37   71:putfield        #51  <Field float zzagu>
		zztg = flag4;
	//   38   74:aload_0         
	//   39   75:iload           14
	//   40   77:putfield        #53  <Field boolean zztg>
	//   41   80:return          
	}

	private final long timestamp;
	private final boolean zzagl;
	private final boolean zzagm;
	private final Rect zzagn;
	private final Rect zzago;
	private final Rect zzagp;
	private final boolean zzagq;
	private final Rect zzagr;
	private final boolean zzags;
	private final Rect zzagt;
	private final float zzagu;
	public final boolean zztg;
	private final int zzth;
}
