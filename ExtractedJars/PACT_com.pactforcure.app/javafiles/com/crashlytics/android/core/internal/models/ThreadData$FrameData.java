// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core.internal.models;


// Referenced classes of package com.crashlytics.android.core.internal.models:
//			ThreadData

public static final class ThreadData$FrameData
{

	public final long address;
	public final String file;
	public final int importance;
	public final long offset;
	public final String symbol;

	public ThreadData$FrameData(long l, int i)
	{
		this(l, "", i);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:ldc1            #19  <String "">
	//    3    4:iload_3         
	//    4    5:invokespecial   #22  <Method void ThreadData$FrameData(long, String, int)>
	//    5    8:return          
	}

	public ThreadData$FrameData(long l, String s, int i)
	{
		this(l, s, "", 0L, i);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:ldc1            #19  <String "">
	//    4    5:lconst_0        
	//    5    6:iload           4
	//    6    8:invokespecial   #26  <Method void ThreadData$FrameData(long, String, String, long, int)>
	//    7   11:return          
	}

	public ThreadData$FrameData(long l, String s, String s1, long l1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		address = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #31  <Field long address>
		symbol = s;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #33  <Field String symbol>
		file = s1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #35  <Field String file>
		offset = l1;
	//   11   20:aload_0         
	//   12   21:lload           5
	//   13   23:putfield        #37  <Field long offset>
		importance = i;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #39  <Field int importance>
	//   17   32:return          
	}
}
