// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			DashManifestParser, SegmentBase

protected static final class DashManifestParser$RepresentationInfo
{

	public final String baseUrl;
	public final ArrayList drmSchemeDatas;
	public final String drmSchemeType;
	public final Format format;
	public final ArrayList inbandEventStreams;
	public final long revisionId;
	public final SegmentBase segmentBase;

	public DashManifestParser$RepresentationInfo(Format format1, String s, SegmentBase segmentbase, String s1, ArrayList arraylist, ArrayList arraylist1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		format = format1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Format format>
		baseUrl = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field String baseUrl>
		segmentBase = segmentbase;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field SegmentBase segmentBase>
		drmSchemeType = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field String drmSchemeType>
		drmSchemeDatas = arraylist;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field ArrayList drmSchemeDatas>
		inbandEventStreams = arraylist1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #38  <Field ArrayList inbandEventStreams>
		revisionId = l;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #40  <Field long revisionId>
	//   23   43:return          
	}
}
