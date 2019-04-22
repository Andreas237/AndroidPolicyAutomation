// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareOpenGraphValueContainer, ShareModel

public static abstract class ShareOpenGraphValueContainer$Builder
	implements ShareModelBuilder
{

	public ShareOpenGraphValueContainer$Builder putString(String s, String s1)
	{
		bundle.putString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #30  <Method void Bundle.putString(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareOpenGraphValueContainer)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareOpenGraphValueContainer>
	//    3    5:invokevirtual   #38  <Method ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer)>
	//    4    8:areturn         
	}

	public ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
	{
		if(shareopengraphvaluecontainer != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			bundle.putAll(shareopengraphvaluecontainer.getBundle());
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Bundle bundle>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #42  <Method Bundle ShareOpenGraphValueContainer.getBundle()>
	//    6   12:invokevirtual   #46  <Method void Bundle.putAll(Bundle)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private Bundle bundle;


/*
	static Bundle access$000(ShareOpenGraphValueContainer$Builder shareopengraphvaluecontainer$builder)
	{
		return shareopengraphvaluecontainer$builder.bundle;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle bundle>
	//    2    4:areturn         
	}

*/

	public ShareOpenGraphValueContainer$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		bundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Bundle()>
	//    6   12:putfield        #21  <Field Bundle bundle>
	//    7   15:return          
	}
}
