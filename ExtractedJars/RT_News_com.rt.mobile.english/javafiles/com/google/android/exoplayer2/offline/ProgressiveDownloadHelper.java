// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadHelper, ProgressiveDownloadAction, DownloadAction

public final class ProgressiveDownloadHelper extends DownloadHelper
{

	public ProgressiveDownloadHelper(Uri uri1)
	{
		this(uri1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #14  <Method void ProgressiveDownloadHelper(Uri, String)>
	//    4    6:return          
	}

	public ProgressiveDownloadHelper(Uri uri1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void DownloadHelper()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Uri uri>
		customCacheKey = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String customCacheKey>
	//    8   14:return          
	}

	public DownloadAction getDownloadAction(byte abyte0[], List list)
	{
		return ((DownloadAction) (new ProgressiveDownloadAction(uri, false, abyte0, customCacheKey)));
	//    0    0:new             #27  <Class ProgressiveDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri uri>
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field String customCacheKey>
	//    8   14:invokespecial   #30  <Method void ProgressiveDownloadAction(Uri, boolean, byte[], String)>
	//    9   17:areturn         
	}

	public int getPeriodCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public DownloadAction getRemoveAction(byte abyte0[])
	{
		return ((DownloadAction) (new ProgressiveDownloadAction(uri, true, abyte0, customCacheKey)));
	//    0    0:new             #27  <Class ProgressiveDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri uri>
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field String customCacheKey>
	//    8   14:invokespecial   #30  <Method void ProgressiveDownloadAction(Uri, boolean, byte[], String)>
	//    9   17:areturn         
	}

	public TrackGroupArray getTrackGroups(int i)
	{
		return TrackGroupArray.EMPTY;
	//    0    0:getstatic       #44  <Field TrackGroupArray TrackGroupArray.EMPTY>
	//    1    3:areturn         
	}

	protected void prepareInternal()
	{
	//    0    0:return          
	}

	private final String customCacheKey;
	private final Uri uri;
}
