// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			VolleyLog

private static class VolleyLog$MarkerLog$Marker
{

	public final String name;
	public final long thread;
	public final long time;

	public VolleyLog$MarkerLog$Marker(String s, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String name>
		thread = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #24  <Field long thread>
		time = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #26  <Field long time>
	//   11   20:return          
	}
}
