// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaPeriod

private static final class DashMediaPeriod$TrackGroupInfo
{
	public static interface TrackGroupCategory
		extends Annotation
	{
	}


	public static DashMediaPeriod$TrackGroupInfo embeddedCea608Track(int ai[], int i)
	{
		return new DashMediaPeriod$TrackGroupInfo(3, 1, ai, i, -1, -1, -1);
	//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
	//   10   14:areturn         
	}

	public static DashMediaPeriod$TrackGroupInfo embeddedEmsgTrack(int ai[], int i)
	{
		return new DashMediaPeriod$TrackGroupInfo(4, 1, ai, i, -1, -1, -1);
	//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
	//   10   14:areturn         
	}

	public static DashMediaPeriod$TrackGroupInfo mpdEventTrack(int i)
	{
		return new DashMediaPeriod$TrackGroupInfo(4, 2, ((int []) (null)), -1, -1, -1, i);
	//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_2        
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iload_0         
	//    9   11:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
	//   10   14:areturn         
	}

	public static DashMediaPeriod$TrackGroupInfo primaryTrack(int i, int ai[], int j, int k, int l)
	{
		return new DashMediaPeriod$TrackGroupInfo(i, 0, ai, j, k, l, -1);
	//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:iconst_m1       
	//    9   12:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
	//   10   15:areturn         
	}

	private static final int CATEGORY_EMBEDDED = 1;
	private static final int CATEGORY_MANIFEST_EVENTS = 2;
	private static final int CATEGORY_PRIMARY = 0;
	public final int adaptationSetIndices[];
	public final int embeddedCea608TrackGroupIndex;
	public final int embeddedEventMessageTrackGroupIndex;
	public final int eventStreamGroupIndex;
	public final int primaryTrackGroupIndex;
	public final int trackGroupCategory;
	public final int trackType;

	private DashMediaPeriod$TrackGroupInfo(int i, int j, int ai[], int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		trackType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int trackType>
		adaptationSetIndices = ai;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #34  <Field int[] adaptationSetIndices>
		trackGroupCategory = j;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #36  <Field int trackGroupCategory>
		primaryTrackGroupIndex = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #38  <Field int primaryTrackGroupIndex>
		embeddedEventMessageTrackGroupIndex = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #40  <Field int embeddedEventMessageTrackGroupIndex>
		embeddedCea608TrackGroupIndex = i1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #42  <Field int embeddedCea608TrackGroupIndex>
		eventStreamGroupIndex = j1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #44  <Field int eventStreamGroupIndex>
	//   23   43:return          
	}
}
