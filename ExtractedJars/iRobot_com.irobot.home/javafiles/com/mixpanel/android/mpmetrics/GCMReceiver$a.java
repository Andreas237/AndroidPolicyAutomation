// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.content.Intent;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			GCMReceiver

protected static class GCMReceiver$a
{

	public final int a;
	public final int b;
	public final int c;
	public final CharSequence d;
	public final String e;
	public final Intent f;
	public final int g;

	private GCMReceiver$a(int i, int j, int k, CharSequence charsequence, String s, Intent intent, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int c>
		d = charsequence;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field CharSequence d>
		e = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field String e>
		f = intent;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #34  <Field Intent f>
		g = l;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #36  <Field int g>
	//   23   43:return          
	}

	GCMReceiver$a(int i, int j, int k, CharSequence charsequence, String s, Intent intent, int l, 
			GCMReceiver$1 gcmreceiver$1)
	{
		this(i, j, k, charsequence, s, intent, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:invokespecial   #40  <Method void GCMReceiver$a(int, int, int, CharSequence, String, Intent, int)>
	//    9   15:return          
	}
}
