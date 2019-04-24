// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;


// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView

public interface OnShowcaseEventListener
{

	public abstract void onShowcaseViewDidHide(ShowcaseView showcaseview);

	public abstract void onShowcaseViewHide(ShowcaseView showcaseview);

	public abstract void onShowcaseViewShow(ShowcaseView showcaseview);

	public static final OnShowcaseEventListener NONE = new OnShowcaseEventListener() {

		public void onShowcaseViewDidHide(ShowcaseView showcaseview)
		{
		//    0    0:return          
		}

		public void onShowcaseViewHide(ShowcaseView showcaseview)
		{
		//    0    0:return          
		}

		public void onShowcaseViewShow(ShowcaseView showcaseview)
		{
		//    0    0:return          
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #6   <Class OnShowcaseEventListener$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void OnShowcaseEventListener$1()>
	//    3    7:putstatic       #15  <Field OnShowcaseEventListener NONE>
	//*   4   10:return          
	/* } */
}
