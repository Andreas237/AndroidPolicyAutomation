// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.app.Activity;
import com.github.amlcurran.showcaseview.targets.Target;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView, OnShowcaseEventListener

public static class ShowcaseView$Builder
{

	public ShowcaseView build()
	{
		ShowcaseView.access$500(showcaseView, activity);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Activity activity>
	//    4    8:invokestatic    #43  <Method void ShowcaseView.access$500(ShowcaseView, Activity)>
		return showcaseView;
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field ShowcaseView showcaseView>
	//    7   15:areturn         
	}

	public ShowcaseView$Builder doNotBlockTouches()
	{
		showcaseView.setBlocksTouches(false);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #49  <Method void ShowcaseView.setBlocksTouches(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder hideOnTouchOutside()
	{
		showcaseView.setBlocksTouches(true);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #49  <Method void ShowcaseView.setBlocksTouches(boolean)>
		showcaseView.setHideOnTouchOutside(true);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field ShowcaseView showcaseView>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #53  <Method void ShowcaseView.setHideOnTouchOutside(boolean)>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public ShowcaseView$Builder setContentText(int i)
	{
		return setContentText(((CharSequence) (activity.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Activity activity>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #61  <Method String Activity.getString(int)>
	//    5    9:invokevirtual   #64  <Method ShowcaseView$Builder setContentText(CharSequence)>
	//    6   12:areturn         
	}

	public ShowcaseView$Builder setContentText(CharSequence charsequence)
	{
		showcaseView.setContentText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method void ShowcaseView.setContentText(CharSequence)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder setContentTitle(int i)
	{
		return setContentTitle(((CharSequence) (activity.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Activity activity>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #61  <Method String Activity.getString(int)>
	//    5    9:invokevirtual   #70  <Method ShowcaseView$Builder setContentTitle(CharSequence)>
	//    6   12:areturn         
	}

	public ShowcaseView$Builder setContentTitle(CharSequence charsequence)
	{
		showcaseView.setContentTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method void ShowcaseView.setContentTitle(CharSequence)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder setOnClickListener(android.view.View$OnClickListener view$onclicklistener)
	{
		showcaseView.overrideButtonClick(view$onclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method void ShowcaseView.overrideButtonClick(android.view.View$OnClickListener)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder setShowcaseEventListener(OnShowcaseEventListener onshowcaseeventlistener)
	{
		showcaseView.setOnShowcaseEventListener(onshowcaseeventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method void ShowcaseView.setOnShowcaseEventListener(OnShowcaseEventListener)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder setStyle(int i)
	{
		showcaseView.setStyle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #88  <Method void ShowcaseView.setStyle(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder setTarget(Target target)
	{
		showcaseView.setTarget(target);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method void ShowcaseView.setTarget(Target)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShowcaseView$Builder singleShot(long l)
	{
		ShowcaseView.access$600(showcaseView, l);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
	//    2    4:lload_1         
	//    3    5:invokestatic    #95  <Method void ShowcaseView.access$600(ShowcaseView, long)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final Activity activity;
	final ShowcaseView showcaseView;

	public ShowcaseView$Builder(Activity activity1)
	{
		this(activity1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #16  <Method void ShowcaseView$Builder(Activity, boolean)>
	//    4    6:return          
	}

	public ShowcaseView$Builder(Activity activity1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		activity = activity1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Activity activity>
		showcaseView = new ShowcaseView(((android.content.Context) (activity1)), flag);
	//    5    9:aload_0         
	//    6   10:new             #6   <Class ShowcaseView>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokespecial   #25  <Method void ShowcaseView(android.content.Context, boolean)>
	//   11   19:putfield        #27  <Field ShowcaseView showcaseView>
		showcaseView.setTarget(Target.NONE);
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field ShowcaseView showcaseView>
	//   14   26:getstatic       #33  <Field Target Target.NONE>
	//   15   29:invokevirtual   #37  <Method void ShowcaseView.setTarget(Target)>
	//   16   32:return          
	}
}
