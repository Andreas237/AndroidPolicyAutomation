// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
//			MatroskaExtractor

static final class MatroskaExtractor$1
	implements ExtractorsFactory
{

	public Extractor[] createExtractors()
	{
		return (new Extractor[] {
			new MatroskaExtractor()
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Extractor[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #8   <Class MatroskaExtractor>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void MatroskaExtractor()>
	//    7   13:aastore         
	//    8   14:areturn         
	}

	MatroskaExtractor$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
