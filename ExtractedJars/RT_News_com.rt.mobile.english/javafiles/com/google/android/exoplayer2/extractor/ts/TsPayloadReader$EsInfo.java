// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			TsPayloadReader

public static final class TsPayloadReader$EsInfo
{

	public final byte descriptorBytes[];
	public final List dvbSubtitleInfos;
	public final String language;
	public final int streamType;

	public TsPayloadReader$EsInfo(int i, String s, List list, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		streamType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int streamType>
		language = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String language>
		if(list == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       25
			s = ((String) (Collections.emptyList()));
	//   10   18:invokestatic    #31  <Method List Collections.emptyList()>
	//   11   21:astore_2        
		else
	//*  12   22:goto            30
			s = ((String) (Collections.unmodifiableList(list)));
	//   13   25:aload_3         
	//   14   26:invokestatic    #35  <Method List Collections.unmodifiableList(List)>
	//   15   29:astore_2        
		dvbSubtitleInfos = ((List) (s));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #37  <Field List dvbSubtitleInfos>
		descriptorBytes = abyte0;
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:putfield        #39  <Field byte[] descriptorBytes>
	//   22   41:return          
	}
}
