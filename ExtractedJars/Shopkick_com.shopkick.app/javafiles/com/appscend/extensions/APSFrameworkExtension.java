// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.extensions;

import com.appscend.hub.KRAdapter;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.vast.APSVASTNonLinearNode;
import java.util.ArrayList;
import java.util.HashMap;

public interface APSFrameworkExtension
	extends KRAdapter
{

	public abstract void configureOverlayfromNodeTypeErrorURLsAdParameters(APSMediaOverlay apsmediaoverlay, APSVASTNonLinearNode apsvastnonlinearnode, String s, ArrayList arraylist, HashMap hashmap);

	public static final String kAPSExtensionsTypeFormat = "com.appscend.mp.extensions.";
}
