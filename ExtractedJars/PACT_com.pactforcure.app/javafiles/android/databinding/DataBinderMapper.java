// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.view.View;
import com.pactforcure.app.databinding.*;

// Referenced classes of package android.databinding:
//			DataBindingComponent, ViewDataBinding

class DataBinderMapper
{
	private static class InnerBrLookup
	{

		static String sKeys[] = {
			"_all", "participant"
		};

		static 
		{
		//    0    0:iconst_2        
		//    1    1:anewarray       String[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:ldc1            #15  <String "_all">
		//    5    8:aastore         
		//    6    9:dup             
		//    7   10:iconst_1        
		//    8   11:ldc1            #17  <String "participant">
		//    9   13:aastore         
		//   10   14:putstatic       #19  <Field String[] sKeys>
		//*  11   17:return          
		}

		private InnerBrLookup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}
	}


	public DataBinderMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	String convertBrIdToString(int i)
	{
		if(i < 0 || i >= InnerBrLookup.sKeys.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:getstatic       #21  <Field String[] DataBinderMapper$InnerBrLookup.sKeys>
	//*   4    8:arraylength     
	//*   5    9:icmplt          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return InnerBrLookup.sKeys[i];
	//    8   14:getstatic       #21  <Field String[] DataBinderMapper$InnerBrLookup.sKeys>
	//    9   17:iload_1         
	//   10   18:aaload          
	//   11   19:areturn         
	}

	public ViewDataBinding getDataBinder(DataBindingComponent databindingcomponent, View view, int i)
	{
		switch(i)
	//*   0    0:iload_3         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               2130968605: 64
	//	               2130968619: 46
	//	               2130968621: 52
	//	               2130968642: 58
		default:
			return null;
	//    2   44:aconst_null     
	//    3   45:areturn         

		case 2130968619: 
			return ((ViewDataBinding) (ActivitySelectStudyBinding.bind(view, databindingcomponent)));
	//    4   46:aload_2         
	//    5   47:aload_1         
	//    6   48:invokestatic    #29  <Method ActivitySelectStudyBinding ActivitySelectStudyBinding.bind(View, DataBindingComponent)>
	//    7   51:areturn         

		case 2130968621: 
			return ((ViewDataBinding) (ActivitySettingsBinding.bind(view, databindingcomponent)));
	//    8   52:aload_2         
	//    9   53:aload_1         
	//   10   54:invokestatic    #34  <Method ActivitySettingsBinding ActivitySettingsBinding.bind(View, DataBindingComponent)>
	//   11   57:areturn         

		case 2130968642: 
			return ((ViewDataBinding) (FragmentSurveyTasksBinding.bind(view, databindingcomponent)));
	//   12   58:aload_2         
	//   13   59:aload_1         
	//   14   60:invokestatic    #39  <Method FragmentSurveyTasksBinding FragmentSurveyTasksBinding.bind(View, DataBindingComponent)>
	//   15   63:areturn         

		case 2130968605: 
			return ((ViewDataBinding) (ActivityDashboardBinding.bind(view, databindingcomponent)));
	//   16   64:aload_2         
	//   17   65:aload_1         
	//   18   66:invokestatic    #44  <Method ActivityDashboardBinding ActivityDashboardBinding.bind(View, DataBindingComponent)>
	//   19   69:areturn         
		}
	}

	ViewDataBinding getDataBinder(DataBindingComponent databindingcomponent, View aview[], int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	int getLayoutId(String s)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       6
_L1:
		return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
_L2:
		s.hashCode();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #53  <Method int String.hashCode()>
		JVM INSTR lookupswitch 4: default 52
	//	               -1854838310: 54
	//	               -1831228988: 90
	//	               -1175527870: 66
	//	               -415786017: 78;
	//    6   10:lookupswitch    4: default 52
	//	               -1854838310: 54
	//	               -1831228988: 90
	//	               -1175527870: 66
	//	               -415786017: 78
		   goto _L3 _L4 _L5 _L6 _L7
_L5:
		continue; /* Loop/switch isn't completed */
_L3:
		return 0;
	//    7   52:iconst_0        
	//    8   53:ireturn         
_L4:
		if(!s.equals("layout/activity_dashboard_0")) goto _L1; else goto _L8
	//    9   54:aload_1         
	//   10   55:ldc1            #55  <String "layout/activity_dashboard_0">
	//   11   57:invokevirtual   #59  <Method boolean String.equals(Object)>
	//   12   60:ifeq            4
_L8:
		return 0x7f04001d;
	//   13   63:ldc1            #60  <Int 0x7f04001d>
	//   14   65:ireturn         
_L6:
		if(!s.equals("layout/activity_select_study_0")) goto _L1; else goto _L9
	//   15   66:aload_1         
	//   16   67:ldc1            #62  <String "layout/activity_select_study_0">
	//   17   69:invokevirtual   #59  <Method boolean String.equals(Object)>
	//   18   72:ifeq            4
_L9:
		return 0x7f04002b;
	//   19   75:ldc1            #63  <Int 0x7f04002b>
	//   20   77:ireturn         
_L7:
		if(!s.equals("layout/activity_settings_0")) goto _L1; else goto _L10
	//   21   78:aload_1         
	//   22   79:ldc1            #65  <String "layout/activity_settings_0">
	//   23   81:invokevirtual   #59  <Method boolean String.equals(Object)>
	//   24   84:ifeq            4
_L10:
		return 0x7f04002d;
	//   25   87:ldc1            #66  <Int 0x7f04002d>
	//   26   89:ireturn         
		if(!s.equals("layout/fragment_survey_tasks_0")) goto _L1; else goto _L11
	//   27   90:aload_1         
	//   28   91:ldc1            #68  <String "layout/fragment_survey_tasks_0">
	//   29   93:invokevirtual   #59  <Method boolean String.equals(Object)>
	//   30   96:ifeq            4
_L11:
		return 0x7f040042;
	//   31   99:ldc1            #69  <Int 0x7f040042>
	//   32  101:ireturn         
	}

	static final int TARGET_MIN_SDK = 19;
}
