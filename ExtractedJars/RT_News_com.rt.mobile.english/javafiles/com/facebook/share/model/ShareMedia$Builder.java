// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareMedia, ShareModel

public static abstract class ShareMedia$Builder
	implements ShareModelBuilder
{

	public ShareMedia$Builder readFrom(ShareMedia sharemedia)
	{
		if(sharemedia == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setParameters(sharemedia.getParameters());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #30  <Method Bundle ShareMedia.getParameters()>
	//    7   11:invokevirtual   #34  <Method ShareMedia$Builder setParameters(Bundle)>
	//    8   14:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMedia)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareMedia>
	//    3    5:invokevirtual   #39  <Method ShareMedia$Builder readFrom(ShareMedia)>
	//    4    8:areturn         
	}

	public ShareMedia$Builder setParameter(String s, String s1)
	{
		params.putString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle params>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #46  <Method void Bundle.putString(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ShareMedia$Builder setParameters(Bundle bundle)
	{
		params.putAll(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle params>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method void Bundle.putAll(Bundle)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private Bundle params;


/*
	static Bundle access$000(ShareMedia$Builder sharemedia$builder)
	{
		return sharemedia$builder.params;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle params>
	//    2    4:areturn         
	}

*/

	public ShareMedia$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		params = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Bundle()>
	//    6   12:putfield        #21  <Field Bundle params>
	//    7   15:return          
	}
}
