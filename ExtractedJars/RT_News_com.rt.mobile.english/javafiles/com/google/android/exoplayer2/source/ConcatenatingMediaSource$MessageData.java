// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			ConcatenatingMediaSource

private static final class ConcatenatingMediaSource$MessageData
{

	public final her actionOnCompletion;
	public final Object customData;
	public final int index;

	public ConcatenatingMediaSource$MessageData(int i, Object obj, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int index>
		if(runnable != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          25
			runnable = ((Runnable) (new her(runnable)));
	//    7   13:new             #25  <Class ConcatenatingMediaSource$EventDispatcher>
	//    8   16:dup             
	//    9   17:aload_3         
	//   10   18:invokespecial   #28  <Method void ConcatenatingMediaSource$EventDispatcher(Runnable)>
	//   11   21:astore_3        
		else
	//*  12   22:goto            27
			runnable = null;
	//   13   25:aconst_null     
	//   14   26:astore_3        
		actionOnCompletion = ((her) (runnable));
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:putfield        #30  <Field ConcatenatingMediaSource$EventDispatcher actionOnCompletion>
		customData = obj;
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:putfield        #32  <Field Object customData>
	//   21   37:return          
	}
}
