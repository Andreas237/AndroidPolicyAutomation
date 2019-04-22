// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core.internal.models;


public class ThreadData
{
	public static final class FrameData
	{

		public final long address;
		public final String file;
		public final int importance;
		public final long offset;
		public final String symbol;

		public FrameData(long l, String s, String s1, long l1, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			address = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #22  <Field long address>
			symbol = s;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #24  <Field String symbol>
			file = s1;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #26  <Field String file>
			offset = l1;
		//   11   20:aload_0         
		//   12   21:lload           5
		//   13   23:putfield        #28  <Field long offset>
			importance = i;
		//   14   26:aload_0         
		//   15   27:iload           7
		//   16   29:putfield        #30  <Field int importance>
		//   17   32:return          
		}
	}


	public ThreadData(int i, FrameData aframedata[])
	{
		this(((String) (null)), i, aframedata);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #18  <Method void ThreadData(String, int, ThreadData$FrameData[])>
	//    5    7:return          
	}

	public ThreadData(String s, int i, FrameData aframedata[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String name>
		importance = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int importance>
		frames = aframedata;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field ThreadData$FrameData[] frames>
	//   11   19:return          
	}

	public final FrameData frames[];
	public final int importance;
	public final String name;
}
