// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			BaseStrokeContent, TrimPathContent

private static final class BaseStrokeContent$PathGroup
{

	private final List paths;
	private final TrimPathContent trimPath;


/*
	static List access$100(BaseStrokeContent$PathGroup basestrokecontent$pathgroup)
	{
		return basestrokecontent$pathgroup.paths;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List paths>
	//    2    4:areturn         
	}

*/


/*
	static TrimPathContent access$200(BaseStrokeContent$PathGroup basestrokecontent$pathgroup)
	{
		return basestrokecontent$pathgroup.trimPath;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TrimPathContent trimPath>
	//    2    4:areturn         
	}

*/

	private BaseStrokeContent$PathGroup(TrimPathContent trimpathcontent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		paths = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List paths>
		trimPath = trimpathcontent;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field TrimPathContent trimPath>
	//   10   20:return          
	}

	BaseStrokeContent$PathGroup(TrimPathContent trimpathcontent, BaseStrokeContent._cls1 _pcls1)
	{
		this(trimpathcontent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void BaseStrokeContent$PathGroup(TrimPathContent)>
	//    3    5:return          
	}
}
