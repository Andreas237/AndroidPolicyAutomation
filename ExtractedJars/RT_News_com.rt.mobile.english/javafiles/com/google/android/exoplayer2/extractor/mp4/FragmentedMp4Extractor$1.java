// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			FragmentedMp4Extractor

static final class FragmentedMp4Extractor$1
	implements ExtractorsFactory
{

	public Extractor[] createExtractors()
	{
		return (new Extractor[] {
			new FragmentedMp4Extractor()
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Extractor[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #8   <Class FragmentedMp4Extractor>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void FragmentedMp4Extractor()>
	//    7   13:aastore         
	//    8   14:areturn         
	}

	FragmentedMp4Extractor$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
