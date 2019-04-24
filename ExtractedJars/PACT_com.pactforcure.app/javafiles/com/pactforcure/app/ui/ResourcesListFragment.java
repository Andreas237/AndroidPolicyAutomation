// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.tip.TipOfTheWeekStorage;

// Referenced classes of package com.pactforcure.app.ui:
//			InterpretingEpdsScoreResourceActivity, ContactUsResourceActivity, PostpartumDepressionResourceActivity, SuicidePreventionResourceActivity, 
//			TipOfTheWeekResourceActivity, SpreadTheWordResourceActivity

public class ResourcesListFragment extends Fragment
{

	public ResourcesListFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Fragment()>
	//    2    4:return          
	}

	static void lambda$onCreateView$27(ResourcesListFragment resourceslistfragment, View view)
	{
		resourceslistfragment.slideActivity(com/pactforcure/app/ui/InterpretingEpdsScoreResourceActivity);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class InterpretingEpdsScoreResourceActivity>
	//    2    3:invokespecial   #19  <Method void slideActivity(Class)>
	//    3    6:return          
	}

	static void lambda$onCreateView$28(ResourcesListFragment resourceslistfragment, View view)
	{
		resourceslistfragment.slideActivity(com/pactforcure/app/ui/ContactUsResourceActivity);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <Class ContactUsResourceActivity>
	//    2    3:invokespecial   #19  <Method void slideActivity(Class)>
	//    3    6:return          
	}

	static void lambda$onCreateView$29(ResourcesListFragment resourceslistfragment, View view)
	{
		resourceslistfragment.slideActivity(com/pactforcure/app/ui/PostpartumDepressionResourceActivity);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class PostpartumDepressionResourceActivity>
	//    2    3:invokespecial   #19  <Method void slideActivity(Class)>
	//    3    6:return          
	}

	static void lambda$onCreateView$30(ResourcesListFragment resourceslistfragment, View view)
	{
		resourceslistfragment.slideActivity(com/pactforcure/app/ui/SuicidePreventionResourceActivity);
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <Class SuicidePreventionResourceActivity>
	//    2    3:invokespecial   #19  <Method void slideActivity(Class)>
	//    3    6:return          
	}

	static void lambda$onCreateView$31(ResourcesListFragment resourceslistfragment, View view)
	{
		resourceslistfragment.slideActivity(com/pactforcure/app/ui/TipOfTheWeekResourceActivity);
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <Class TipOfTheWeekResourceActivity>
	//    2    3:invokespecial   #19  <Method void slideActivity(Class)>
	//    3    6:return          
	}

	static void lambda$onCreateView$32(ResourcesListFragment resourceslistfragment, View view)
	{
		resourceslistfragment.slideActivity(com/pactforcure/app/ui/SpreadTheWordResourceActivity);
	//    0    0:aload_0         
	//    1    1:ldc1            #34  <Class SpreadTheWordResourceActivity>
	//    2    3:invokespecial   #19  <Method void slideActivity(Class)>
	//    3    6:return          
	}

	public static ResourcesListFragment newInstance()
	{
		return new ResourcesListFragment();
	//    0    0:new             #2   <Class ResourcesListFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void ResourcesListFragment()>
	//    3    7:areturn         
	}

	private void slideActivity(Class class1)
	{
		Activity activity = (Activity)getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method android.content.Context getContext()>
	//    2    4:checkcast       #43  <Class Activity>
	//    3    7:astore_2        
		activity.startActivity(new Intent(getContext(), class1));
	//    4    8:aload_2         
	//    5    9:new             #45  <Class Intent>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #41  <Method android.content.Context getContext()>
	//    9   17:aload_1         
	//   10   18:invokespecial   #48  <Method void Intent(android.content.Context, Class)>
	//   11   21:invokevirtual   #52  <Method void Activity.startActivity(Intent)>
		activity.overridePendingTransition(0x7f050019, 0x7f05001a);
	//   12   24:aload_2         
	//   13   25:ldc1            #53  <Int 0x7f050019>
	//   14   27:ldc1            #54  <Int 0x7f05001a>
	//   15   29:invokevirtual   #58  <Method void Activity.overridePendingTransition(int, int)>
	//   16   32:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		rootView = layoutinflater.inflate(0x7f040041, viewgroup, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #62  <Int 0x7f040041>
	//    3    4:aload_2         
	//    4    5:iconst_0        
	//    5    6:invokevirtual   #68  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    6    9:putfield        #70  <Field View rootView>
		layoutinflater = ((LayoutInflater) ((TextView)rootView.findViewById(0x7f0e0122)));
	//    7   12:aload_0         
	//    8   13:getfield        #70  <Field View rootView>
	//    9   16:ldc1            #71  <Int 0x7f0e0122>
	//   10   18:invokevirtual   #77  <Method View View.findViewById(int)>
	//   11   21:checkcast       #79  <Class TextView>
	//   12   24:astore_1        
		viewgroup = ((ViewGroup) ((TextView)rootView.findViewById(0x7f0e0123)));
	//   13   25:aload_0         
	//   14   26:getfield        #70  <Field View rootView>
	//   15   29:ldc1            #80  <Int 0x7f0e0123>
	//   16   31:invokevirtual   #77  <Method View View.findViewById(int)>
	//   17   34:checkcast       #79  <Class TextView>
	//   18   37:astore_2        
		bundle = ((Bundle) ((TextView)rootView.findViewById(0x7f0e0124)));
	//   19   38:aload_0         
	//   20   39:getfield        #70  <Field View rootView>
	//   21   42:ldc1            #81  <Int 0x7f0e0124>
	//   22   44:invokevirtual   #77  <Method View View.findViewById(int)>
	//   23   47:checkcast       #79  <Class TextView>
	//   24   50:astore_3        
		TextView textview = (TextView)rootView.findViewById(0x7f0e0125);
	//   25   51:aload_0         
	//   26   52:getfield        #70  <Field View rootView>
	//   27   55:ldc1            #82  <Int 0x7f0e0125>
	//   28   57:invokevirtual   #77  <Method View View.findViewById(int)>
	//   29   60:checkcast       #79  <Class TextView>
	//   30   63:astore          4
		View view = rootView.findViewById(0x7f0e0126);
	//   31   65:aload_0         
	//   32   66:getfield        #70  <Field View rootView>
	//   33   69:ldc1            #83  <Int 0x7f0e0126>
	//   34   71:invokevirtual   #77  <Method View View.findViewById(int)>
	//   35   74:astore          5
		TextView textview1 = (TextView)view.findViewById(0x7f0e0128);
	//   36   76:aload           5
	//   37   78:ldc1            #84  <Int 0x7f0e0128>
	//   38   80:invokevirtual   #77  <Method View View.findViewById(int)>
	//   39   83:checkcast       #79  <Class TextView>
	//   40   86:astore          6
		TextView textview2 = (TextView)rootView.findViewById(0x7f0e0129);
	//   41   88:aload_0         
	//   42   89:getfield        #70  <Field View rootView>
	//   43   92:ldc1            #85  <Int 0x7f0e0129>
	//   44   94:invokevirtual   #77  <Method View View.findViewById(int)>
	//   45   97:checkcast       #79  <Class TextView>
	//   46  100:astore          7
		((TextView) (layoutinflater)).setText(((CharSequence) (Res.getStudySpecificString(0x7f080258))));
	//   47  102:aload_1         
	//   48  103:ldc1            #86  <Int 0x7f080258>
	//   49  105:invokestatic    #92  <Method String Res.getStudySpecificString(int)>
	//   50  108:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
		((TextView) (viewgroup)).setText(((CharSequence) (Res.getStudySpecificString(0x7f08033b))));
	//   51  111:aload_2         
	//   52  112:ldc1            #97  <Int 0x7f08033b>
	//   53  114:invokestatic    #92  <Method String Res.getStudySpecificString(int)>
	//   54  117:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
		((TextView) (bundle)).setText(((CharSequence) (Res.getStudySpecificString(0x7f0802e6))));
	//   55  120:aload_3         
	//   56  121:ldc1            #98  <Int 0x7f0802e6>
	//   57  123:invokestatic    #92  <Method String Res.getStudySpecificString(int)>
	//   58  126:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
		textview.setText(((CharSequence) (Res.getStudySpecificString(0x7f08033c))));
	//   59  129:aload           4
	//   60  131:ldc1            #99  <Int 0x7f08033c>
	//   61  133:invokestatic    #92  <Method String Res.getStudySpecificString(int)>
	//   62  136:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
		textview1.setText(((CharSequence) (Res.getStudySpecificString(0x7f08036d))));
	//   63  139:aload           6
	//   64  141:ldc1            #100 <Int 0x7f08036d>
	//   65  143:invokestatic    #92  <Method String Res.getStudySpecificString(int)>
	//   66  146:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
		textview2.setText(((CharSequence) (Res.getStudySpecificString(0x7f080337))));
	//   67  149:aload           7
	//   68  151:ldc1            #101 <Int 0x7f080337>
	//   69  153:invokestatic    #92  <Method String Res.getStudySpecificString(int)>
	//   70  156:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (resourceslistfragment)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$1(ResourcesListFragment)>
			//    4    8:areturn         
			}

			public void onClick(View view1)
			{
				ResourcesListFragment.lambda$onCreateView$27(arg$1, view1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$27(ResourcesListFragment, View)>
			//    4    8:return          
			}

			private final ResourcesListFragment arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResourcesListFragment.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
			//    5    9:return          
			}
		}

		((TextView) (layoutinflater)).setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   71  159:aload_1         
	//   72  160:aload_0         
	//   73  161:invokestatic    #107 <Method android.view.View$OnClickListener ResourcesListFragment$$Lambda$1.lambdaFactory$(ResourcesListFragment)>
	//   74  164:invokevirtual   #111 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls2
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls2) (resourceslistfragment)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$2(ResourcesListFragment)>
			//    4    8:areturn         
			}

			public void onClick(View view1)
			{
				ResourcesListFragment.lambda$onCreateView$28(arg$1, view1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$28(ResourcesListFragment, View)>
			//    4    8:return          
			}

			private final ResourcesListFragment arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResourcesListFragment.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
			//    5    9:return          
			}
		}

		((TextView) (viewgroup)).setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//   75  167:aload_2         
	//   76  168:aload_0         
	//   77  169:invokestatic    #114 <Method android.view.View$OnClickListener ResourcesListFragment$$Lambda$2.lambdaFactory$(ResourcesListFragment)>
	//   78  172:invokevirtual   #111 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls3
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls3) (resourceslistfragment)). new .Lambda._cls3()));
			//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$3>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$3(ResourcesListFragment)>
			//    4    8:areturn         
			}

			public void onClick(View view1)
			{
				ResourcesListFragment.lambda$onCreateView$29(arg$1, view1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$29(ResourcesListFragment, View)>
			//    4    8:return          
			}

			private final ResourcesListFragment arg$1;

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResourcesListFragment.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
			//    5    9:return          
			}
		}

		((TextView) (bundle)).setOnClickListener(.Lambda._cls3.lambdaFactory.(this));
	//   79  175:aload_3         
	//   80  176:aload_0         
	//   81  177:invokestatic    #117 <Method android.view.View$OnClickListener ResourcesListFragment$$Lambda$3.lambdaFactory$(ResourcesListFragment)>
	//   82  180:invokevirtual   #111 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls4
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls4) (resourceslistfragment)). new .Lambda._cls4()));
			//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$4>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$4(ResourcesListFragment)>
			//    4    8:areturn         
			}

			public void onClick(View view1)
			{
				ResourcesListFragment.lambda$onCreateView$30(arg$1, view1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$30(ResourcesListFragment, View)>
			//    4    8:return          
			}

			private final ResourcesListFragment arg$1;

			private .Lambda._cls4()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResourcesListFragment.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
			//    5    9:return          
			}
		}

		textview.setOnClickListener(.Lambda._cls4.lambdaFactory.(this));
	//   83  183:aload           4
	//   84  185:aload_0         
	//   85  186:invokestatic    #120 <Method android.view.View$OnClickListener ResourcesListFragment$$Lambda$4.lambdaFactory$(ResourcesListFragment)>
	//   86  189:invokevirtual   #111 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls5
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls5) (resourceslistfragment)). new .Lambda._cls5()));
			//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$5>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$5(ResourcesListFragment)>
			//    4    8:areturn         
			}

			public void onClick(View view1)
			{
				ResourcesListFragment.lambda$onCreateView$31(arg$1, view1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$31(ResourcesListFragment, View)>
			//    4    8:return          
			}

			private final ResourcesListFragment arg$1;

			private .Lambda._cls5()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResourcesListFragment.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
			//    5    9:return          
			}
		}

		view.setOnClickListener(.Lambda._cls5.lambdaFactory.(this));
	//   87  192:aload           5
	//   88  194:aload_0         
	//   89  195:invokestatic    #123 <Method android.view.View$OnClickListener ResourcesListFragment$$Lambda$5.lambdaFactory$(ResourcesListFragment)>
	//   90  198:invokevirtual   #124 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls6
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls6) (resourceslistfragment)). new .Lambda._cls6()));
			//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$6>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$6(ResourcesListFragment)>
			//    4    8:areturn         
			}

			public void onClick(View view1)
			{
				ResourcesListFragment.lambda$onCreateView$32(arg$1, view1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$32(ResourcesListFragment, View)>
			//    4    8:return          
			}

			private final ResourcesListFragment arg$1;

			private .Lambda._cls6()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResourcesListFragment.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
			//    5    9:return          
			}
		}

		textview2.setOnClickListener(.Lambda._cls6.lambdaFactory.(this));
	//   91  201:aload           7
	//   92  203:aload_0         
	//   93  204:invokestatic    #127 <Method android.view.View$OnClickListener ResourcesListFragment$$Lambda$6.lambdaFactory$(ResourcesListFragment)>
	//   94  207:invokevirtual   #111 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		return rootView;
	//   95  210:aload_0         
	//   96  211:getfield        #70  <Field View rootView>
	//   97  214:areturn         
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method void Fragment.onResume()>
		TextView textview = (TextView)rootView.findViewById(0x7f0e0127);
	//    2    4:aload_0         
	//    3    5:getfield        #70  <Field View rootView>
	//    4    8:ldc1            #133 <Int 0x7f0e0127>
	//    5   10:invokevirtual   #77  <Method View View.findViewById(int)>
	//    6   13:checkcast       #79  <Class TextView>
	//    7   16:astore_2        
		int i = TipOfTheWeekStorage.getNumberOfUnseenTips();
	//    8   17:invokestatic    #139 <Method int TipOfTheWeekStorage.getNumberOfUnseenTips()>
	//    9   20:istore_1        
		if(i > 0)
	//*  10   21:iload_1         
	//*  11   22:ifle            39
		{
			textview.setText(((CharSequence) (String.valueOf(i))));
	//   12   25:aload_2         
	//   13   26:iload_1         
	//   14   27:invokestatic    #144 <Method String String.valueOf(int)>
	//   15   30:invokevirtual   #96  <Method void TextView.setText(CharSequence)>
			textview.setVisibility(0);
	//   16   33:aload_2         
	//   17   34:iconst_0        
	//   18   35:invokevirtual   #148 <Method void TextView.setVisibility(int)>
			return;
	//   19   38:return          
		} else
		{
			textview.setVisibility(8);
	//   20   39:aload_2         
	//   21   40:bipush          8
	//   22   42:invokevirtual   #148 <Method void TextView.setVisibility(int)>
			return;
	//   23   45:return          
		}
	}

	private View rootView;
}
