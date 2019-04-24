// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public class SessionSettingsData
{

	public SessionSettingsData(int i, int j, int k, int l, int i1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		logBufferSize = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int logBufferSize>
		maxChainedExceptionDepth = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int maxChainedExceptionDepth>
		maxCustomExceptionEvents = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int maxCustomExceptionEvents>
		maxCustomKeyValuePairs = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int maxCustomKeyValuePairs>
		identifierMask = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #27  <Field int identifierMask>
		sendSessionWithoutCrash = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #29  <Field boolean sendSessionWithoutCrash>
	//   20   37:return          
	}

	public final int identifierMask;
	public final int logBufferSize;
	public final int maxChainedExceptionDepth;
	public final int maxCustomExceptionEvents;
	public final int maxCustomKeyValuePairs;
	public final boolean sendSessionWithoutCrash;
}
