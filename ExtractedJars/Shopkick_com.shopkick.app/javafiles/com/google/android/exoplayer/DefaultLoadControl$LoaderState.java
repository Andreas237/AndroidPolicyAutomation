// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			DefaultLoadControl

private static class DefaultLoadControl$LoaderState
{

	public final int bufferSizeContribution;
	public int bufferState;
	public boolean loading;
	public long nextLoadPositionUs;

	public DefaultLoadControl$LoaderState(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		bufferSizeContribution = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int bufferSizeContribution>
		bufferState = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field int bufferState>
		loading = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field boolean loading>
		nextLoadPositionUs = -1L;
	//   11   19:aload_0         
	//   12   20:ldc2w           #26  <Long -1L>
	//   13   23:putfield        #29  <Field long nextLoadPositionUs>
	//   14   26:return          
	}
}
