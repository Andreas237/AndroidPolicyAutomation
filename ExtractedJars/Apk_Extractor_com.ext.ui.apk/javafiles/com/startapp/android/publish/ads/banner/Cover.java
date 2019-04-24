// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.startapp.android.publish.common.model.AdPreferences;

// Referenced classes of package com.startapp.android.publish.ads.banner:
//			Banner, BannerListener

public class Cover extends Banner
{

	public Cover(Activity activity)
	{
		super(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void Banner(Activity)>
	//    3    5:return          
	}

	public Cover(Activity activity, AttributeSet attributeset)
	{
		super(activity, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void Banner(Activity, AttributeSet)>
	//    4    6:return          
	}

	public Cover(Activity activity, AttributeSet attributeset, int i)
	{
		super(activity, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void Banner(Activity, AttributeSet, int)>
	//    5    7:return          
	}

	public Cover(Activity activity, BannerListener bannerlistener)
	{
		super(activity, bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void Banner(Activity, BannerListener)>
	//    4    6:return          
	}

	public Cover(Activity activity, AdPreferences adpreferences)
	{
		super(activity, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void Banner(Activity, AdPreferences)>
	//    4    6:return          
	}

	public Cover(Activity activity, AdPreferences adpreferences, BannerListener bannerlistener)
	{
		super(activity, adpreferences, bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #24  <Method void Banner(Activity, AdPreferences, BannerListener)>
	//    5    7:return          
	}

	public Cover(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void Banner(Context)>
	//    3    5:return          
	}

	public Cover(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void Banner(Context, AttributeSet)>
	//    4    6:return          
	}

	public Cover(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #35  <Method void Banner(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public Cover(Context context, BannerListener bannerlistener)
	{
		super(context, bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void Banner(Context, BannerListener)>
	//    4    6:return          
	}

	public Cover(Context context, AdPreferences adpreferences)
	{
		super(context, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #41  <Method void Banner(Context, AdPreferences)>
	//    4    6:return          
	}

	public Cover(Context context, AdPreferences adpreferences, BannerListener bannerlistener)
	{
		super(context, adpreferences, bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #44  <Method void Banner(Context, AdPreferences, BannerListener)>
	//    5    7:return          
	}

	protected String getBannerName()
	{
		return "StartApp Cover";
	//    0    0:ldc1            #48  <String "StartApp Cover">
	//    1    2:areturn         
	}

	protected int getBannerType()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	protected int getHeightInDp()
	{
		return 157;
	//    0    0:sipush          157
	//    1    3:ireturn         
	}

	protected int getWidthInDp()
	{
		return 300;
	//    0    0:sipush          300
	//    1    3:ireturn         
	}
}
