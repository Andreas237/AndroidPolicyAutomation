// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, ChooseRegionsToCleanActivity_, PersistentScheduleActivity_, RobotCleanActivity_

public class MapCustomizationCompleteActivity extends BaseFragmentActivity
{

	public MapCustomizationCompleteActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BaseFragmentActivity()>
		j = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String j>
	//    5   10:return          
	}

	void e()
	{
		Object obj = ((Object) (com.irobot.home.util.j.j().a().getName()));
	//    0    0:invokestatic    #39  <Method a j.j()>
	//    1    3:invokevirtual   #44  <Method AssetInfo a.a()>
	//    2    6:invokevirtual   #50  <Method String AssetInfo.getName()>
	//    3    9:astore_1        
		b.setText(((CharSequence) (getString(0x7f0f062d, new Object[] {
			obj, j
		}))));
	//    4   10:aload_0         
	//    5   11:getfield        #52  <Field CustomTextView b>
	//    6   14:aload_0         
	//    7   15:ldc1            #53  <Int 0x7f0f062d>
	//    8   17:iconst_2        
	//    9   18:anewarray       Object[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:aload_1         
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_1        
	//   16   27:aload_0         
	//   17   28:getfield        #33  <Field String j>
	//   18   31:aastore         
	//   19   32:invokevirtual   #59  <Method String getString(int, Object[])>
	//   20   35:invokevirtual   #65  <Method void CustomTextView.setText(CharSequence)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsCustomizeCustomizeComplete, com.irobot.home.util.j.j().a());
	//   21   38:invokestatic    #71  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   22   41:getstatic       #77  <Field ViewId ViewId.PMapsCustomizeCustomizeComplete>
	//   23   44:invokestatic    #39  <Method a j.j()>
	//   24   47:invokevirtual   #44  <Method AssetInfo a.a()>
	//   25   50:invokevirtual   #81  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		k = new CustomVideoView(((android.content.Context) (this)));
	//   26   53:aload_0         
	//   27   54:new             #83  <Class CustomVideoView>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:invokespecial   #86  <Method void CustomVideoView(android.content.Context)>
	//   31   62:putfield        #88  <Field CustomVideoView k>
		obj = ((Object) (com.irobot.home.util.j.a(((android.content.Context) (this)), 0x7f0e01f6)));
	//   32   65:aload_0         
	//   33   66:ldc1            #89  <Int 0x7f0e01f6>
	//   34   68:invokestatic    #92  <Method android.net.Uri j.a(android.content.Context, int)>
	//   35   71:astore_1        
		k.setSource(((android.net.Uri) (obj)));
	//   36   72:aload_0         
	//   37   73:getfield        #88  <Field CustomVideoView k>
	//   38   76:aload_1         
	//   39   77:invokevirtual   #96  <Method void CustomVideoView.setSource(android.net.Uri)>
		k.setLooping(false);
	//   40   80:aload_0         
	//   41   81:getfield        #88  <Field CustomVideoView k>
	//   42   84:iconst_0        
	//   43   85:invokevirtual   #100 <Method void CustomVideoView.setLooping(boolean)>
		k.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.irobot.home.util.j.a(((android.content.Context) (this)), ((android.net.Uri) (obj)))));
	//   44   88:aload_0         
	//   45   89:getfield        #88  <Field CustomVideoView k>
	//   46   92:new             #102 <Class android.view.ViewGroup$LayoutParams>
	//   47   95:dup             
	//   48   96:iconst_m1       
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:invokestatic    #105 <Method int j.a(android.content.Context, android.net.Uri)>
	//   52  102:invokespecial   #108 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   53  105:invokevirtual   #112 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		a.addView(((android.view.View) (k)));
	//   54  108:aload_0         
	//   55  109:getfield        #114 <Field FrameLayout a>
	//   56  112:aload_0         
	//   57  113:getfield        #88  <Field CustomVideoView k>
	//   58  116:invokevirtual   #120 <Method void FrameLayout.addView(android.view.View)>
		k.a();
	//   59  119:aload_0         
	//   60  120:getfield        #88  <Field CustomVideoView k>
	//   61  123:invokevirtual   #122 <Method void CustomVideoView.a()>
		obj = ((Object) (f.getViewTreeObserver()));
	//   62  126:aload_0         
	//   63  127:getfield        #124 <Field LinearLayout f>
	//   64  130:invokevirtual   #130 <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   65  133:astore_1        
		if(((ViewTreeObserver) (obj)).isAlive())
	//*  66  134:aload_1         
	//*  67  135:invokevirtual   #136 <Method boolean ViewTreeObserver.isAlive()>
	//*  68  138:ifeq            153
			((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					a.f.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//    2    4:getfield        #25  <Field LinearLayout MapCustomizationCompleteActivity.f>
				//    3    7:invokevirtual   #31  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
				//    4   10:aload_0         
				//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					a.h = ObjectAnimator.ofFloat(((Object) (a.f)), "translationY", new float[] {
						-400F, 0.0F
					});
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   10   22:getfield        #25  <Field LinearLayout MapCustomizationCompleteActivity.f>
				//   11   25:ldc1            #39  <String "translationY">
				//   12   27:iconst_2        
				//   13   28:newarray        float[]
				//   14   30:dup             
				//   15   31:iconst_0        
				//   16   32:ldc1            #40  <Float -400F>
				//   17   34:fastore         
				//   18   35:dup             
				//   19   36:iconst_1        
				//   20   37:fconst_0        
				//   21   38:fastore         
				//   22   39:invokestatic    #46  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   23   42:putfield        #50  <Field ObjectAnimator MapCustomizationCompleteActivity.h>
					a.h.setDuration(a.getResources().getInteger(0x7f0a000c));
				//   24   45:aload_0         
				//   25   46:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   26   49:getfield        #50  <Field ObjectAnimator MapCustomizationCompleteActivity.h>
				//   27   52:aload_0         
				//   28   53:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   29   56:invokevirtual   #54  <Method Resources MapCustomizationCompleteActivity.getResources()>
				//   30   59:ldc1            #55  <Int 0x7f0a000c>
				//   31   61:invokevirtual   #61  <Method int Resources.getInteger(int)>
				//   32   64:i2l             
				//   33   65:invokevirtual   #65  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   34   68:pop             
					a.i = ObjectAnimator.ofFloat(((Object) (a.f)), "alpha", new float[] {
						0.0F, 1.0F
					});
				//   35   69:aload_0         
				//   36   70:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   37   73:aload_0         
				//   38   74:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   39   77:getfield        #25  <Field LinearLayout MapCustomizationCompleteActivity.f>
				//   40   80:ldc1            #67  <String "alpha">
				//   41   82:iconst_2        
				//   42   83:newarray        float[]
				//   43   85:dup             
				//   44   86:iconst_0        
				//   45   87:fconst_0        
				//   46   88:fastore         
				//   47   89:dup             
				//   48   90:iconst_1        
				//   49   91:fconst_1        
				//   50   92:fastore         
				//   51   93:invokestatic    #46  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   52   96:putfield        #70  <Field ObjectAnimator MapCustomizationCompleteActivity.i>
					a.i.setDuration(a.getResources().getInteger(0x7f0a000c));
				//   53   99:aload_0         
				//   54  100:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   55  103:getfield        #70  <Field ObjectAnimator MapCustomizationCompleteActivity.i>
				//   56  106:aload_0         
				//   57  107:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   58  110:invokevirtual   #54  <Method Resources MapCustomizationCompleteActivity.getResources()>
				//   59  113:ldc1            #55  <Int 0x7f0a000c>
				//   60  115:invokevirtual   #61  <Method int Resources.getInteger(int)>
				//   61  118:i2l             
				//   62  119:invokevirtual   #65  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   63  122:pop             
					a.g = new AnimatorSet();
				//   64  123:aload_0         
				//   65  124:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   66  127:new             #72  <Class AnimatorSet>
				//   67  130:dup             
				//   68  131:invokespecial   #73  <Method void AnimatorSet()>
				//   69  134:putfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
					a.g.play(((android.animation.Animator) (a.h))).with(((android.animation.Animator) (a.i)));
				//   70  137:aload_0         
				//   71  138:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   72  141:getfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
				//   73  144:aload_0         
				//   74  145:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   75  148:getfield        #50  <Field ObjectAnimator MapCustomizationCompleteActivity.h>
				//   76  151:invokevirtual   #81  <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
				//   77  154:aload_0         
				//   78  155:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   79  158:getfield        #70  <Field ObjectAnimator MapCustomizationCompleteActivity.i>
				//   80  161:invokevirtual   #86  <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
				//   81  164:pop             
					a.g.setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator())));
				//   82  165:aload_0         
				//   83  166:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   84  169:getfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
				//   85  172:new             #88  <Class AccelerateDecelerateInterpolator>
				//   86  175:dup             
				//   87  176:invokespecial   #89  <Method void AccelerateDecelerateInterpolator()>
				//   88  179:invokevirtual   #93  <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
					a.g.start();
				//   89  182:aload_0         
				//   90  183:getfield        #17  <Field MapCustomizationCompleteActivity a>
				//   91  186:getfield        #77  <Field AnimatorSet MapCustomizationCompleteActivity.g>
				//   92  189:invokevirtual   #96  <Method void AnimatorSet.start()>
				//   93  192:return          
				}

				final MapCustomizationCompleteActivity a;

			
			{
				a = MapCustomizationCompleteActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationCompleteActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   69  141:aload_1         
	//   70  142:new             #6   <Class MapCustomizationCompleteActivity$1>
	//   71  145:dup             
	//   72  146:aload_0         
	//   73  147:invokespecial   #139 <Method void MapCustomizationCompleteActivity$1(MapCustomizationCompleteActivity)>
	//   74  150:invokevirtual   #143 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   75  153:return          
	}

	void f()
	{
		com.irobot.home.ChooseRegionsToCleanActivity_.a(((android.content.Context) (this))).a(true).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #148 <Method ChooseRegionsToCleanActivity_$a com.irobot.home.ChooseRegionsToCleanActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #153 <Method ChooseRegionsToCleanActivity_$a com.irobot.home.ChooseRegionsToCleanActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #156 <Method org.androidannotations.api.a.e com.irobot.home.ChooseRegionsToCleanActivity_$a.a()>
	//    5   11:pop             
		finish();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #159 <Method void finish()>
	//    8   16:return          
	}

	void g()
	{
		com.irobot.home.PersistentScheduleActivity_.a(((android.content.Context) (this))).a(true).a(com.irobot.home.util.j.k().getId()).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #164 <Method PersistentScheduleActivity_$a com.irobot.home.PersistentScheduleActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #169 <Method PersistentScheduleActivity_$a com.irobot.home.PersistentScheduleActivity_$a.a(boolean)>
	//    4    8:invokestatic    #172 <Method AssetId j.k()>
	//    5   11:invokevirtual   #177 <Method String AssetId.getId()>
	//    6   14:invokevirtual   #180 <Method PersistentScheduleActivity_$a com.irobot.home.PersistentScheduleActivity_$a.a(String)>
	//    7   17:invokevirtual   #181 <Method org.androidannotations.api.a.e com.irobot.home.PersistentScheduleActivity_$a.a()>
	//    8   20:pop             
		finish();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #159 <Method void finish()>
	//   11   25:return          
	}

	void h()
	{
		((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((android.content.Context) (this))).g(0x4000000)).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #186 <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(android.content.Context)>
	//    2    4:ldc1            #187 <Int 0x4000000>
	//    3    6:invokevirtual   #192 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    4    9:checkcast       #189 <Class RobotCleanActivity_$a>
	//    5   12:invokevirtual   #193 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
	//    6   15:pop             
		finish();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #159 <Method void finish()>
	//    9   20:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #196 <Method void BaseFragmentActivity.onBackPressed()>
		((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((android.content.Context) (this))).g(0x4000000)).a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #186 <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(android.content.Context)>
	//    4    8:ldc1            #187 <Int 0x4000000>
	//    5   10:invokevirtual   #192 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    6   13:checkcast       #189 <Class RobotCleanActivity_$a>
	//    7   16:invokevirtual   #193 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
	//    8   19:pop             
		finish();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #159 <Method void finish()>
	//   11   24:return          
	}

	FrameLayout a;
	CustomTextView b;
	CustomButton c;
	CustomButton d;
	CustomTextView e;
	LinearLayout f;
	AnimatorSet g;
	ObjectAnimator h;
	ObjectAnimator i;
	String j;
	private CustomVideoView k;
}
