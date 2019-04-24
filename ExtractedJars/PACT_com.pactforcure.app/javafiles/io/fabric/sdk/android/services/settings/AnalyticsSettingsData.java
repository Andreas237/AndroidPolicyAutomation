// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public class AnalyticsSettingsData
{

	public AnalyticsSettingsData(String s, int i, int j, int k, int l, boolean flag)
	{
		this(s, i, j, k, l, flag, true, 1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_1        
	//    8   11:iconst_1        
	//    9   12:iconst_1        
	//   10   13:invokespecial   #24  <Method void AnalyticsSettingsData(String, int, int, int, int, boolean, boolean, int, boolean)>
	//   11   16:return          
	}

	public AnalyticsSettingsData(String s, int i, int j, int k, int l, boolean flag, int i1)
	{
		this(s, i, j, k, l, flag, true, i1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iconst_1        
	//    8   11:iload           7
	//    9   13:iconst_1        
	//   10   14:invokespecial   #24  <Method void AnalyticsSettingsData(String, int, int, int, int, boolean, boolean, int, boolean)>
	//   11   17:return          
	}

	public AnalyticsSettingsData(String s, int i, int j, int k, int l, boolean flag, boolean flag1, 
			int i1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		analyticsURL = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String analyticsURL>
		flushIntervalSeconds = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int flushIntervalSeconds>
		maxByteSizePerFile = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #36  <Field int maxByteSizePerFile>
		maxFileCountPerSend = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #38  <Field int maxFileCountPerSend>
		maxPendingSendFileCount = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #40  <Field int maxPendingSendFileCount>
		trackCustomEvents = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #42  <Field boolean trackCustomEvents>
		trackPredefinedEvents = flag1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #44  <Field boolean trackPredefinedEvents>
		samplingRate = i1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #46  <Field int samplingRate>
		flushOnBackground = flag2;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #48  <Field boolean flushOnBackground>
	//   29   55:return          
	}

	public static final int DEFAULT_SAMPLING_RATE = 1;
	public final String analyticsURL;
	public final int flushIntervalSeconds;
	public final boolean flushOnBackground;
	public final int maxByteSizePerFile;
	public final int maxFileCountPerSend;
	public final int maxPendingSendFileCount;
	public final int samplingRate;
	public final boolean trackCustomEvents;
	public final boolean trackPredefinedEvents;
}
