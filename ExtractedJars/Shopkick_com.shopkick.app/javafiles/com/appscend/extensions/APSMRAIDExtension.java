// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.extensions;

import com.appscend.media.events.APSMediaOverlay;
import com.appscend.vast.APSVASTNonLinearNode;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.extensions:
//			APSFrameworkExtension

public class APSMRAIDExtension
	implements APSFrameworkExtension
{

	public APSMRAIDExtension()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public void configureOverlayfromNodeTypeErrorURLsAdParameters(APSMediaOverlay apsmediaoverlay, APSVASTNonLinearNode apsvastnonlinearnode, String s, ArrayList arraylist, HashMap hashmap)
	{
	//    0    0:return          
	}

	public String type()
	{
		return APSMRAIDFrameworkExtension;
	//    0    0:getstatic       #24  <Field String APSMRAIDFrameworkExtension>
	//    1    3:areturn         
	}

	public static String APSMRAIDFrameworkExtension = "com.appscend.mp.extensions.MRAID";

	static 
	{
	//    0    0:return          
	}
}
